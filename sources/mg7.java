// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mg7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mg7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        gad gadVar;
        int i;
        switch (this.a) {
            case 0:
                oy oyVar = (oy) this.b;
                oyVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    oyVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        oyVar.c.set(true);
                        throw th;
                    } finally {
                        oyVar.b(null);
                    }
                }
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((kt) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    nt ntVar = (nt) it;
                    if (!ntVar.hasNext()) {
                        return arrayList;
                    }
                    qia qiaVar = ((wia) ntVar.next()).c;
                    qia qiaVar2 = new qia();
                    qiaVar2.a = qiaVar.a;
                    qiaVar2.b = qiaVar.b;
                    Intent[] intentArr = qiaVar.c;
                    qiaVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                    qiaVar2.d = qiaVar.d;
                    qiaVar2.e = qiaVar.e;
                    qiaVar2.f = qiaVar.f;
                    qiaVar2.g = qiaVar.g;
                    qiaVar2.h = qiaVar.h;
                    qiaVar2.k = qiaVar.k;
                    qiaVar2.l = qiaVar.l;
                    qiaVar2.m = qiaVar.m;
                    n58[] n58VarArr = qiaVar.i;
                    if (n58VarArr != null) {
                        qiaVar2.i = (n58[]) Arrays.copyOf(n58VarArr, n58VarArr.length);
                    }
                    if (qiaVar.j != null) {
                        qiaVar2.j = new HashSet(qiaVar.j);
                    }
                    PersistableBundle persistableBundle = qiaVar.n;
                    if (persistableBundle != null) {
                        qiaVar2.n = persistableBundle;
                    }
                    if (TextUtils.isEmpty(qiaVar2.e)) {
                        u36.j("Shortcut must have a non-empty label");
                        return null;
                    }
                    Intent[] intentArr2 = qiaVar2.c;
                    if (intentArr2 != null && intentArr2.length != 0) {
                        arrayList.add(qiaVar2);
                    }
                }
                u36.j("Shortcut must have an intent");
                return null;
            case 2:
                return BitmapFactory.decodeFile(((wia) this.b).b);
            case 3:
                wed wedVar = (wed) this.b;
                ui0 ui0Var = wedVar.d;
                synchronized (ui0Var.a) {
                    if (ui0Var.b != 3) {
                        boolean z = ui0Var.b == 1;
                        synchronized (ui0Var.a) {
                            gadVar = ui0Var.i;
                        }
                        ui0 ui0Var2 = wedVar.d;
                        if (gadVar == null) {
                            ui0Var2.k(0);
                            fj0 fj0Var = sld.h;
                            ui0Var2.j(nm7.r1, fj0Var);
                            wedVar.c(fj0Var);
                        } else {
                            String packageName = ui0Var2.g.getPackageName();
                            int i2 = 25;
                            int i3 = 3;
                            int i4 = 25;
                            while (true) {
                                if (i4 >= 3) {
                                    try {
                                        v9d v9dVar = (v9d) gadVar;
                                        Parcel X = v9dVar.X();
                                        X.writeInt(i4);
                                        X.writeString(packageName);
                                        X.writeString("subs");
                                        Parcel Y = v9dVar.Y(X, 1);
                                        int readInt = Y.readInt();
                                        Y.recycle();
                                        if (readInt == 0) {
                                            yid.g("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                            i3 = readInt;
                                        } else {
                                            i4--;
                                            i3 = readInt;
                                        }
                                    } catch (Exception e) {
                                        yid.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                        boolean z2 = e instanceof DeadObjectException;
                                        int i5 = z2 ? 91 : e instanceof RemoteException ? 90 : e instanceof SecurityException ? 92 : 42;
                                        String a = wi8.c(i5, 42) ? ald.a(e) : null;
                                        wedVar.d.k(0);
                                        wedVar.b(z2 ? sld.h : sld.f, i5, a, z);
                                        wedVar.c(z2 ? sld.h : sld.f);
                                    }
                                } else {
                                    i4 = 0;
                                }
                            }
                            ui0Var2.k = i4 >= 3;
                            if (i4 < 3) {
                                yid.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                i = 9;
                            } else {
                                i = 1;
                            }
                            while (true) {
                                if (i2 >= 3) {
                                    v9d v9dVar2 = (v9d) gadVar;
                                    Parcel X2 = v9dVar2.X();
                                    X2.writeInt(i2);
                                    X2.writeString(packageName);
                                    X2.writeString("inapp");
                                    Parcel Y2 = v9dVar2.Y(X2, 1);
                                    int readInt2 = Y2.readInt();
                                    Y2.recycle();
                                    if (readInt2 == 0) {
                                        ui0Var2.l = i2;
                                        yid.g("BillingClient", "mHighestLevelSupportedForInApp: " + i2);
                                        i3 = readInt2;
                                    } else {
                                        i2--;
                                        i3 = readInt2;
                                    }
                                }
                            }
                            int i6 = ui0Var2.l;
                            ui0Var2.l = i6;
                            ui0Var2.w = i6 >= 26;
                            ui0Var2.v = i6 >= 24;
                            ui0Var2.u = i6 >= 21;
                            ui0Var2.t = i6 >= 20;
                            ui0Var2.s = i6 >= 19;
                            ui0Var2.r = i6 >= 17;
                            ui0Var2.q = i6 >= 16;
                            ui0Var2.p = i6 >= 15;
                            ui0Var2.o = i6 >= 14;
                            ui0Var2.n = i6 >= 9;
                            ui0Var2.m = i6 >= 6;
                            if (i6 < 3) {
                                yid.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i = 36;
                            }
                            ui0.p(ui0Var2, i3);
                            if (i3 != 0) {
                                fj0 fj0Var2 = sld.a;
                                wedVar.b(fj0Var2, i, null, z);
                                wedVar.c(fj0Var2);
                            } else {
                                try {
                                    Long a2 = wedVar.a(z);
                                    if (z) {
                                        oje s = gke.s();
                                        s.b();
                                        gke.r((gke) s.b, 6);
                                        yse r = gte.r();
                                        r.c(false);
                                        r.d();
                                        if (a2 != null) {
                                            long longValue = a2.longValue();
                                            r.b();
                                            gte.p((gte) r.b, longValue);
                                        }
                                        ui0 ui0Var3 = wedVar.d;
                                        s.b();
                                        gke.q((gke) s.b, (gte) r.a());
                                        ui0Var3.i((gke) s.a());
                                    } else {
                                        rre p = cse.p();
                                        nke s2 = gle.s();
                                        s2.b();
                                        gle.r((gle) s2.b, 0);
                                        p.b();
                                        cse.n((cse) p.b, (gle) s2.a());
                                        if (a2 != null) {
                                            long longValue2 = a2.longValue();
                                            p.b();
                                            cse.o((cse) p.b, longValue2);
                                        }
                                        wedVar.d.h.C((cse) p.a());
                                    }
                                } catch (Throwable th2) {
                                    yid.i("BillingClient", "Unable to log.", th2);
                                }
                                wedVar.c(sld.g);
                            }
                        }
                    }
                }
                return null;
            case 4:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 5:
                return r26.c.a(((uze) this.b).g);
            case 6:
                return r26.c.a(((h3f) this.b).g);
            case 7:
                return r26.c.a(((b6f) this.b).g);
            case 8:
                return r26.c.a(((iff) this.b).a);
            default:
                return r26.c.a(((tgf) this.b).g);
        }
    }
}

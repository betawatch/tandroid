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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ke7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ke7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        e8d e8dVar;
        int i;
        switch (this.a) {
            case 0:
                nx nxVar = (nx) this.b;
                nxVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    nxVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        nxVar.c.set(true);
                        throw th;
                    } finally {
                        nxVar.b(null);
                    }
                }
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((js) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    ms msVar = (ms) it;
                    if (!msVar.hasNext()) {
                        return arrayList;
                    }
                    oga ogaVar = ((uga) msVar.next()).c;
                    oga ogaVar2 = new oga();
                    ogaVar2.a = ogaVar.a;
                    ogaVar2.b = ogaVar.b;
                    Intent[] intentArr = ogaVar.c;
                    ogaVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                    ogaVar2.d = ogaVar.d;
                    ogaVar2.e = ogaVar.e;
                    ogaVar2.f = ogaVar.f;
                    ogaVar2.g = ogaVar.g;
                    ogaVar2.h = ogaVar.h;
                    ogaVar2.k = ogaVar.k;
                    ogaVar2.l = ogaVar.l;
                    ogaVar2.m = ogaVar.m;
                    l38[] l38VarArr = ogaVar.i;
                    if (l38VarArr != null) {
                        ogaVar2.i = (l38[]) Arrays.copyOf(l38VarArr, l38VarArr.length);
                    }
                    if (ogaVar.j != null) {
                        ogaVar2.j = new HashSet(ogaVar.j);
                    }
                    PersistableBundle persistableBundle = ogaVar.n;
                    if (persistableBundle != null) {
                        ogaVar2.n = persistableBundle;
                    }
                    if (TextUtils.isEmpty(ogaVar2.e)) {
                        w26.j("Shortcut must have a non-empty label");
                        return null;
                    }
                    Intent[] intentArr2 = ogaVar2.c;
                    if (intentArr2 != null && intentArr2.length != 0) {
                        arrayList.add(ogaVar2);
                    }
                }
                w26.j("Shortcut must have an intent");
                return null;
            case 2:
                return BitmapFactory.decodeFile(((uga) this.b).b);
            case 3:
                ucd ucdVar = (ucd) this.b;
                uh0 uh0Var = ucdVar.d;
                synchronized (uh0Var.a) {
                    if (uh0Var.b != 3) {
                        boolean z = uh0Var.b == 1;
                        synchronized (uh0Var.a) {
                            e8dVar = uh0Var.i;
                        }
                        uh0 uh0Var2 = ucdVar.d;
                        if (e8dVar == null) {
                            uh0Var2.k(0);
                            fi0 fi0Var = qjd.h;
                            uh0Var2.j(kk7.r1, fi0Var);
                            ucdVar.c(fi0Var);
                        } else {
                            String packageName = uh0Var2.g.getPackageName();
                            int i2 = 25;
                            int i3 = 3;
                            int i4 = 25;
                            while (true) {
                                if (i4 >= 3) {
                                    try {
                                        t7d t7dVar = (t7d) e8dVar;
                                        Parcel X = t7dVar.X();
                                        X.writeInt(i4);
                                        X.writeString(packageName);
                                        X.writeString("subs");
                                        Parcel Y = t7dVar.Y(X, 1);
                                        int readInt = Y.readInt();
                                        Y.recycle();
                                        if (readInt == 0) {
                                            xgd.g("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                            i3 = readInt;
                                        } else {
                                            i4--;
                                            i3 = readInt;
                                        }
                                    } catch (Exception e) {
                                        xgd.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                        boolean z2 = e instanceof DeadObjectException;
                                        int i5 = z2 ? 91 : e instanceof RemoteException ? 90 : e instanceof SecurityException ? 92 : 42;
                                        String a = ug8.c(i5, 42) ? yid.a(e) : null;
                                        ucdVar.d.k(0);
                                        ucdVar.b(z2 ? qjd.h : qjd.f, i5, a, z);
                                        ucdVar.c(z2 ? qjd.h : qjd.f);
                                    }
                                } else {
                                    i4 = 0;
                                }
                            }
                            uh0Var2.k = i4 >= 3;
                            if (i4 < 3) {
                                xgd.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                i = 9;
                            } else {
                                i = 1;
                            }
                            while (true) {
                                if (i2 >= 3) {
                                    t7d t7dVar2 = (t7d) e8dVar;
                                    Parcel X2 = t7dVar2.X();
                                    X2.writeInt(i2);
                                    X2.writeString(packageName);
                                    X2.writeString("inapp");
                                    Parcel Y2 = t7dVar2.Y(X2, 1);
                                    int readInt2 = Y2.readInt();
                                    Y2.recycle();
                                    if (readInt2 == 0) {
                                        uh0Var2.l = i2;
                                        xgd.g("BillingClient", "mHighestLevelSupportedForInApp: " + i2);
                                        i3 = readInt2;
                                    } else {
                                        i2--;
                                        i3 = readInt2;
                                    }
                                }
                            }
                            int i6 = uh0Var2.l;
                            uh0Var2.l = i6;
                            uh0Var2.w = i6 >= 26;
                            uh0Var2.v = i6 >= 24;
                            uh0Var2.u = i6 >= 21;
                            uh0Var2.t = i6 >= 20;
                            uh0Var2.s = i6 >= 19;
                            uh0Var2.r = i6 >= 17;
                            uh0Var2.q = i6 >= 16;
                            uh0Var2.p = i6 >= 15;
                            uh0Var2.o = i6 >= 14;
                            uh0Var2.n = i6 >= 9;
                            uh0Var2.m = i6 >= 6;
                            if (i6 < 3) {
                                xgd.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i = 36;
                            }
                            uh0.p(uh0Var2, i3);
                            if (i3 != 0) {
                                fi0 fi0Var2 = qjd.a;
                                ucdVar.b(fi0Var2, i, null, z);
                                ucdVar.c(fi0Var2);
                            } else {
                                try {
                                    Long a2 = ucdVar.a(z);
                                    if (z) {
                                        nhe s = fie.s();
                                        s.b();
                                        fie.r((fie) s.b, 6);
                                        vqe r = dre.r();
                                        r.c(false);
                                        r.d();
                                        if (a2 != null) {
                                            long longValue = a2.longValue();
                                            r.b();
                                            dre.p((dre) r.b, longValue);
                                        }
                                        uh0 uh0Var3 = ucdVar.d;
                                        s.b();
                                        fie.q((fie) s.b, (dre) r.a());
                                        uh0Var3.i((fie) s.a());
                                    } else {
                                        ope p = zpe.p();
                                        mie s2 = fje.s();
                                        s2.b();
                                        fje.r((fje) s2.b, 0);
                                        p.b();
                                        zpe.n((zpe) p.b, (fje) s2.a());
                                        if (a2 != null) {
                                            long longValue2 = a2.longValue();
                                            p.b();
                                            zpe.o((zpe) p.b, longValue2);
                                        }
                                        ucdVar.d.h.q((zpe) p.a());
                                    }
                                } catch (Throwable th2) {
                                    xgd.i("BillingClient", "Unable to log.", th2);
                                }
                                ucdVar.c(qjd.g);
                            }
                        }
                    }
                }
                return null;
            case 4:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 5:
                return r06.c.a(((sxe) this.b).g);
            case 6:
                return r06.c.a(((f1f) this.b).g);
            case 7:
                return r06.c.a(((z3f) this.b).g);
            case 8:
                return r06.c.a(((hdf) this.b).a);
            default:
                return r06.c.a(((sef) this.b).g);
        }
    }
}

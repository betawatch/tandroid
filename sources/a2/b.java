package a2;

import a0.e;
import a8.ta;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c8.uf;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.z3;
import e0.j0;
import f5.f;
import f5.s;
import f5.x;
import f5.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.telegram.messenger.qs;
import p1.g;
import q6.j;
import w7.p;
import y7.e9;
import z7.ma;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i7;
        switch (this.a) {
            case 0:
                a aVar = (a) this.b;
                aVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 1:
                ta taVar = (ta) this.b;
                taVar.getClass();
                return j.c.a(taVar.g);
            case 2:
                uf ufVar = (uf) this.b;
                ufVar.getClass();
                return j.c.a(ufVar.g);
            case 3:
                s sVar = (s) this.b;
                f5.b bVar = sVar.d;
                synchronized (bVar.a) {
                    try {
                        if (bVar.b != 3) {
                            boolean z9 = true;
                            boolean z10 = bVar.b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                u.b(bundle, bVar.c, bVar.d, bVar.A.longValue());
                            }
                            synchronized (bVar.a) {
                                cVar = bVar.i;
                            }
                            if (cVar == null) {
                                f5.b bVar2 = sVar.d;
                                bVar2.k(0);
                                f fVar = z.h;
                                bVar2.j(qs.s1, fVar);
                                sVar.c(fVar);
                            } else {
                                f5.b bVar3 = sVar.d;
                                String packageName = bVar3.g.getPackageName();
                                int i10 = 3;
                                int i11 = 25;
                                while (true) {
                                    if (i11 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel v12 = aVar2.v1();
                                                v12.writeInt(i11);
                                                v12.writeString(packageName);
                                                v12.writeString("subs");
                                                Parcel w12 = aVar2.w1(v12, 1);
                                                int readInt = w12.readInt();
                                                w12.recycle();
                                                i10 = readInt;
                                            } catch (Exception e10) {
                                                u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z11 = e10 instanceof DeadObjectException;
                                                int i12 = z11 ? 91 : e10 instanceof RemoteException ? 90 : e10 instanceof SecurityException ? 92 : 42;
                                                String a10 = g.b(i12, 42) ? x.a(e10) : null;
                                                sVar.d.k(0);
                                                sVar.b(z11 ? z.h : z.f, i12, a10, z10);
                                                sVar.c(z11 ? z.h : z.f);
                                            }
                                        } else {
                                            i10 = ((com.google.android.gms.internal.play_billing.a) cVar).x1(i11, packageName, "subs", bundle);
                                        }
                                        if (i10 == 0) {
                                            u.g("BillingClient", "highestLevelSupportedForSubs: " + i11);
                                        } else {
                                            i11--;
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                }
                                bVar3.k = i11 >= 3;
                                if (i11 < 3) {
                                    u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i7 = 9;
                                } else {
                                    i7 = 1;
                                }
                                int i13 = i10;
                                int i14 = 25;
                                while (true) {
                                    if (i14 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar3 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel v13 = aVar3.v1();
                                            v13.writeInt(i14);
                                            v13.writeString(packageName);
                                            v13.writeString("inapp");
                                            Parcel w13 = aVar3.w1(v13, 1);
                                            i13 = w13.readInt();
                                            w13.recycle();
                                        } else {
                                            i13 = ((com.google.android.gms.internal.play_billing.a) cVar).x1(i14, packageName, "inapp", bundle);
                                        }
                                        if (i13 == 0) {
                                            bVar3.l = i14;
                                            u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                        } else {
                                            i14--;
                                        }
                                    }
                                }
                                int i15 = bVar3.l;
                                bVar3.l = i15;
                                bVar3.w = i15 >= 26;
                                bVar3.v = i15 >= 24;
                                bVar3.u = i15 >= 21;
                                bVar3.t = i15 >= 20;
                                bVar3.s = i15 >= 19;
                                bVar3.r = i15 >= 17;
                                bVar3.q = i15 >= 16;
                                bVar3.p = i15 >= 15;
                                bVar3.o = i15 >= 14;
                                bVar3.n = i15 >= 9;
                                if (i15 < 6) {
                                    z9 = false;
                                }
                                bVar3.m = z9;
                                if (i15 < 3) {
                                    u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i7 = 36;
                                }
                                f5.b.p(bVar3, i13);
                                if (i13 != 0) {
                                    f fVar2 = z.a;
                                    sVar.b(fVar2, i7, null, z10);
                                    sVar.c(fVar2);
                                } else {
                                    try {
                                        Long a11 = sVar.a(z10);
                                        if (z10) {
                                            h3 s5 = i3.s();
                                            s5.c();
                                            i3.r((i3) s5.b, 6);
                                            c4 r10 = d4.r();
                                            r10.d(false);
                                            r10.e();
                                            if (a11 != null) {
                                                long longValue = a11.longValue();
                                                r10.c();
                                                d4.p((d4) r10.b, longValue);
                                            }
                                            f5.b bVar4 = sVar.d;
                                            s5.c();
                                            i3.q((i3) s5.b, (d4) r10.a());
                                            bVar4.i((i3) s5.a());
                                        } else {
                                            z3 p10 = a4.p();
                                            j3 s9 = k3.s();
                                            s9.c();
                                            k3.r((k3) s9.b, 0);
                                            p10.c();
                                            a4.n((a4) p10.b, (k3) s9.a());
                                            if (a11 != null) {
                                                long longValue2 = a11.longValue();
                                                p10.c();
                                                a4.o((a4) p10.b, longValue2);
                                            }
                                            sVar.d.h.m((a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    sVar.c(z.g);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 4:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 5:
                p pVar = (p) this.b;
                pVar.getClass();
                return j.c.a(pVar.a);
            case 6:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((e) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    a0.b bVar5 = (a0.b) it;
                    if (!bVar5.hasNext()) {
                        return arrayList;
                    }
                    g0.c cVar2 = ((x4.f) bVar5.next()).c;
                    g0.c cVar3 = new g0.c();
                    cVar3.a = cVar2.a;
                    cVar3.b = cVar2.b;
                    Intent[] intentArr = cVar2.c;
                    cVar3.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                    cVar3.d = cVar2.d;
                    cVar3.e = cVar2.e;
                    cVar3.f = cVar2.f;
                    cVar3.g = cVar2.g;
                    cVar3.h = cVar2.h;
                    cVar3.k = cVar2.k;
                    cVar3.l = cVar2.l;
                    cVar3.m = cVar2.m;
                    j0[] j0VarArr = cVar2.i;
                    if (j0VarArr != null) {
                        cVar3.i = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
                    }
                    if (cVar2.j != null) {
                        cVar3.j = new HashSet(cVar2.j);
                    }
                    PersistableBundle persistableBundle = cVar2.n;
                    if (persistableBundle != null) {
                        cVar3.n = persistableBundle;
                    }
                    if (TextUtils.isEmpty(cVar3.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr2 = cVar3.c;
                    if (intentArr2 != null && intentArr2.length != 0) {
                        arrayList.add(cVar3);
                    }
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            case 7:
                return BitmapFactory.decodeFile(((x4.f) this.b).b);
            case 8:
                e9 e9Var = (e9) this.b;
                e9Var.getClass();
                return j.c.a(e9Var.g);
            default:
                ma maVar = (ma) this.b;
                maVar.getClass();
                return j.c.a(maVar.g);
        }
    }
}

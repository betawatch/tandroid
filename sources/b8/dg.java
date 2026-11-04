package b8;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dg(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i3;
        switch (this.a) {
            case 0:
                hg hgVar = (hg) this.b;
                hgVar.getClass();
                return p6.j.c.a(hgVar.g);
            case 1:
                e5.s sVar = (e5.s) this.b;
                e5.b bVar = sVar.d;
                synchronized (bVar.a) {
                    try {
                        if (bVar.b != 3) {
                            boolean z10 = true;
                            boolean z11 = bVar.b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.u.b(bundle, bVar.c, bVar.d, bVar.A.longValue());
                            }
                            synchronized (bVar.a) {
                                cVar = bVar.i;
                            }
                            if (cVar == null) {
                                e5.b bVar2 = sVar.d;
                                bVar2.k(0);
                                e5.f fVar = e5.z.h;
                                bVar2.j(hs.s1, fVar);
                                sVar.c(fVar);
                            } else {
                                e5.b bVar3 = sVar.d;
                                String packageName = bVar3.g.getPackageName();
                                int i10 = 3;
                                int i11 = 25;
                                while (true) {
                                    if (i11 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel V0 = aVar.V0();
                                                V0.writeInt(i11);
                                                V0.writeString(packageName);
                                                V0.writeString("subs");
                                                Parcel W0 = aVar.W0(V0, 1);
                                                int readInt = W0.readInt();
                                                W0.recycle();
                                                i10 = readInt;
                                            } catch (Exception e10) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z12 = e10 instanceof DeadObjectException;
                                                int i12 = z12 ? 91 : e10 instanceof RemoteException ? 90 : e10 instanceof SecurityException ? 92 : 42;
                                                String a10 = o1.g.b(i12, 42) ? e5.x.a(e10) : null;
                                                sVar.d.k(0);
                                                sVar.b(z12 ? e5.z.h : e5.z.f, i12, a10, z11);
                                                sVar.c(z12 ? e5.z.h : e5.z.f);
                                            }
                                        } else {
                                            i10 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(i11, packageName, "subs", bundle);
                                        }
                                        if (i10 == 0) {
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "highestLevelSupportedForSubs: " + i11);
                                        } else {
                                            i11--;
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                }
                                bVar3.k = i11 >= 3;
                                if (i11 < 3) {
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i3 = 9;
                                } else {
                                    i3 = 1;
                                }
                                int i13 = i10;
                                int i14 = 25;
                                while (true) {
                                    if (i14 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel V02 = aVar2.V0();
                                            V02.writeInt(i14);
                                            V02.writeString(packageName);
                                            V02.writeString("inapp");
                                            Parcel W02 = aVar2.W0(V02, 1);
                                            i13 = W02.readInt();
                                            W02.recycle();
                                        } else {
                                            i13 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(i14, packageName, "inapp", bundle);
                                        }
                                        if (i13 == 0) {
                                            bVar3.l = i14;
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
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
                                    z10 = false;
                                }
                                bVar3.m = z10;
                                if (i15 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i3 = 36;
                                }
                                e5.b.p(bVar3, i13);
                                if (i13 != 0) {
                                    e5.f fVar2 = e5.z.a;
                                    sVar.b(fVar2, i3, null, z11);
                                    sVar.c(fVar2);
                                } else {
                                    try {
                                        Long a11 = sVar.a(z11);
                                        if (z11) {
                                            com.google.android.gms.internal.play_billing.h3 s6 = com.google.android.gms.internal.play_billing.i3.s();
                                            s6.c();
                                            com.google.android.gms.internal.play_billing.i3.r((com.google.android.gms.internal.play_billing.i3) s6.b, 6);
                                            com.google.android.gms.internal.play_billing.c4 r5 = com.google.android.gms.internal.play_billing.d4.r();
                                            r5.d(false);
                                            r5.e();
                                            if (a11 != null) {
                                                long longValue = a11.longValue();
                                                r5.c();
                                                com.google.android.gms.internal.play_billing.d4.p((com.google.android.gms.internal.play_billing.d4) r5.b, longValue);
                                            }
                                            e5.b bVar4 = sVar.d;
                                            s6.c();
                                            com.google.android.gms.internal.play_billing.i3.q((com.google.android.gms.internal.play_billing.i3) s6.b, (com.google.android.gms.internal.play_billing.d4) r5.a());
                                            bVar4.i((com.google.android.gms.internal.play_billing.i3) s6.a());
                                        } else {
                                            com.google.android.gms.internal.play_billing.z3 p10 = com.google.android.gms.internal.play_billing.a4.p();
                                            com.google.android.gms.internal.play_billing.j3 s10 = com.google.android.gms.internal.play_billing.k3.s();
                                            s10.c();
                                            com.google.android.gms.internal.play_billing.k3.r((com.google.android.gms.internal.play_billing.k3) s10.b, 0);
                                            p10.c();
                                            com.google.android.gms.internal.play_billing.a4.n((com.google.android.gms.internal.play_billing.a4) p10.b, (com.google.android.gms.internal.play_billing.k3) s10.a());
                                            if (a11 != null) {
                                                long longValue2 = a11.longValue();
                                                p10.c();
                                                com.google.android.gms.internal.play_billing.a4.o((com.google.android.gms.internal.play_billing.a4) p10.b, longValue2);
                                            }
                                            sVar.d.h.K((com.google.android.gms.internal.play_billing.a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    sVar.c(e5.z.g);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 2:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 3:
                v7.p pVar = (v7.p) this.b;
                pVar.getClass();
                return p6.j.c.a(pVar.a);
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((a0.e) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    a0.b bVar5 = (a0.b) it;
                    if (!bVar5.hasNext()) {
                        return arrayList;
                    }
                    g0.c cVar2 = ((w4.f) bVar5.next()).c;
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
                    e0.k0[] k0VarArr = cVar2.i;
                    if (k0VarArr != null) {
                        cVar3.i = (e0.k0[]) Arrays.copyOf(k0VarArr, k0VarArr.length);
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
            case 5:
                return BitmapFactory.decodeFile(((w4.f) this.b).b);
            case 6:
                x7.b9 b9Var = (x7.b9) this.b;
                b9Var.getClass();
                return p6.j.c.a(b9Var.g);
            case 7:
                y7.ma maVar = (y7.ma) this.b;
                maVar.getClass();
                return p6.j.c.a(maVar.g);
            case 8:
                z1.a aVar3 = (z1.a) this.b;
                aVar3.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar3.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            default:
                z7.da daVar = (z7.da) this.b;
                daVar.getClass();
                return p6.j.c.a(daVar.g);
        }
    }
}

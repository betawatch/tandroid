package a8;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class gg implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x011a, code lost:
    
        throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i10;
        switch (this.a) {
            case 0:
                kg kgVar = (kg) this.b;
                kgVar.getClass();
                return o6.i.c.a(kgVar.g);
            case 1:
                d5.w wVar = (d5.w) this.b;
                d5.c cVar2 = wVar.d;
                synchronized (cVar2.a) {
                    try {
                        if (cVar2.b != 3) {
                            boolean z10 = true;
                            boolean z11 = cVar2.b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.u.b(bundle, cVar2.c, cVar2.d, cVar2.A.longValue());
                            }
                            synchronized (cVar2.a) {
                                cVar = cVar2.i;
                            }
                            if (cVar == null) {
                                d5.c cVar3 = wVar.d;
                                cVar3.k(0);
                                d5.i iVar = d5.e0.h;
                                cVar3.j(107, iVar);
                                wVar.c(iVar);
                            } else {
                                d5.c cVar4 = wVar.d;
                                String packageName = cVar4.g.getPackageName();
                                int i11 = 3;
                                int i12 = 25;
                                while (true) {
                                    if (i12 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel T0 = aVar.T0();
                                                T0.writeInt(i12);
                                                T0.writeString(packageName);
                                                T0.writeString("subs");
                                                Parcel U0 = aVar.U0(T0, 1);
                                                int readInt = U0.readInt();
                                                U0.recycle();
                                                i11 = readInt;
                                            } catch (Exception e) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                                boolean z12 = e instanceof DeadObjectException;
                                                int i13 = z12 ? 91 : e instanceof RemoteException ? 90 : e instanceof SecurityException ? 92 : 42;
                                                String a2 = m1.j.b(i13, 42) ? d5.c0.a(e) : null;
                                                wVar.d.k(0);
                                                wVar.b(z12 ? d5.e0.h : d5.e0.f, i13, a2, z11);
                                                wVar.c(z12 ? d5.e0.h : d5.e0.f);
                                            }
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.a) cVar).V0(i12, packageName, "subs", bundle);
                                        }
                                        if (i11 == 0) {
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                        } else {
                                            i12--;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                }
                                cVar4.k = i12 >= 3;
                                if (i12 < 3) {
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i10 = 9;
                                } else {
                                    i10 = 1;
                                }
                                int i14 = i11;
                                int i15 = 25;
                                while (true) {
                                    if (i15 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel T02 = aVar2.T0();
                                            T02.writeInt(i15);
                                            T02.writeString(packageName);
                                            T02.writeString("inapp");
                                            Parcel U02 = aVar2.U0(T02, 1);
                                            i14 = U02.readInt();
                                            U02.recycle();
                                        } else {
                                            i14 = ((com.google.android.gms.internal.play_billing.a) cVar).V0(i15, packageName, "inapp", bundle);
                                        }
                                        if (i14 == 0) {
                                            cVar4.l = i15;
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i15);
                                        } else {
                                            i15--;
                                        }
                                    }
                                }
                                int i16 = cVar4.l;
                                cVar4.l = i16;
                                cVar4.w = i16 >= 26;
                                cVar4.v = i16 >= 24;
                                cVar4.u = i16 >= 21;
                                cVar4.t = i16 >= 20;
                                cVar4.s = i16 >= 19;
                                cVar4.r = i16 >= 17;
                                cVar4.q = i16 >= 16;
                                cVar4.p = i16 >= 15;
                                cVar4.o = i16 >= 14;
                                cVar4.n = i16 >= 9;
                                if (i16 < 6) {
                                    z10 = false;
                                }
                                cVar4.m = z10;
                                if (i16 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                d5.c.p(cVar4, i14);
                                if (i14 != 0) {
                                    d5.i iVar2 = d5.e0.a;
                                    wVar.b(iVar2, i10, null, z11);
                                    wVar.c(iVar2);
                                } else {
                                    try {
                                        Long a10 = wVar.a(z11);
                                        if (z11) {
                                            com.google.android.gms.internal.play_billing.h3 s10 = com.google.android.gms.internal.play_billing.i3.s();
                                            s10.c();
                                            com.google.android.gms.internal.play_billing.i3.r((com.google.android.gms.internal.play_billing.i3) s10.b, 6);
                                            com.google.android.gms.internal.play_billing.c4 r6 = com.google.android.gms.internal.play_billing.d4.r();
                                            r6.d(false);
                                            r6.e();
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                r6.c();
                                                com.google.android.gms.internal.play_billing.d4.p((com.google.android.gms.internal.play_billing.d4) r6.b, longValue);
                                            }
                                            d5.c cVar5 = wVar.d;
                                            s10.c();
                                            com.google.android.gms.internal.play_billing.i3.q((com.google.android.gms.internal.play_billing.i3) s10.b, (com.google.android.gms.internal.play_billing.d4) r6.a());
                                            cVar5.i((com.google.android.gms.internal.play_billing.i3) s10.a());
                                        } else {
                                            com.google.android.gms.internal.play_billing.z3 p10 = com.google.android.gms.internal.play_billing.a4.p();
                                            com.google.android.gms.internal.play_billing.j3 s11 = com.google.android.gms.internal.play_billing.k3.s();
                                            s11.c();
                                            com.google.android.gms.internal.play_billing.k3.r((com.google.android.gms.internal.play_billing.k3) s11.b, 0);
                                            p10.c();
                                            com.google.android.gms.internal.play_billing.a4.n((com.google.android.gms.internal.play_billing.a4) p10.b, (com.google.android.gms.internal.play_billing.k3) s11.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p10.c();
                                                com.google.android.gms.internal.play_billing.a4.o((com.google.android.gms.internal.play_billing.a4) p10.b, longValue2);
                                            }
                                            wVar.d.h.Y((com.google.android.gms.internal.play_billing.a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    wVar.c(d5.e0.g);
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
                ArrayList arrayList = new ArrayList();
                Iterator it = ((a0.e) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    a0.b bVar = (a0.b) it;
                    if (!bVar.hasNext()) {
                        return arrayList;
                    }
                    g0.c cVar6 = ((u4.g) bVar.next()).c;
                    g0.c cVar7 = new g0.c();
                    cVar7.a = cVar6.a;
                    cVar7.b = cVar6.b;
                    Intent[] intentArr = cVar6.c;
                    cVar7.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                    cVar7.d = cVar6.d;
                    cVar7.e = cVar6.e;
                    cVar7.f = cVar6.f;
                    cVar7.g = cVar6.g;
                    cVar7.h = cVar6.h;
                    cVar7.k = cVar6.k;
                    cVar7.l = cVar6.l;
                    cVar7.m = cVar6.m;
                    e0.l0[] l0VarArr = cVar6.i;
                    if (l0VarArr != null) {
                        cVar7.i = (e0.l0[]) Arrays.copyOf(l0VarArr, l0VarArr.length);
                    }
                    if (cVar6.j != null) {
                        cVar7.j = new HashSet(cVar6.j);
                    }
                    PersistableBundle persistableBundle = cVar6.n;
                    if (persistableBundle != null) {
                        cVar7.n = persistableBundle;
                    }
                    if (TextUtils.isEmpty(cVar7.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr2 = cVar7.c;
                    if (intentArr2 != null && intentArr2.length != 0) {
                        arrayList.add(cVar7);
                    }
                }
                break;
            case 4:
                return BitmapFactory.decodeFile(((u4.g) this.b).b);
            case 5:
                u7.p pVar = (u7.p) this.b;
                pVar.getClass();
                return o6.i.c.a(pVar.a);
            case 6:
                w7.d9 d9Var = (w7.d9) this.b;
                d9Var.getClass();
                return o6.i.c.a(d9Var.g);
            case 7:
                x1.a aVar3 = (x1.a) this.b;
                aVar3.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar3.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 8:
                x7.ma maVar = (x7.ma) this.b;
                maVar.getClass();
                return o6.i.c.a(maVar.g);
            case 9:
                y7.ca caVar = (y7.ca) this.b;
                caVar.getClass();
                return o6.i.c.a(caVar.g);
            default:
                ((com.google.firebase.messaging.s) this.b).run();
                return null;
        }
    }
}

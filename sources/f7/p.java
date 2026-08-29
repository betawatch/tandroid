package f7;

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
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.internal.play_billing.z3;
import e0.p0;
import h7.a9;
import i7.ka;
import j7.la;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import l7.wf;
import p2.x;
import p2.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x0397, code lost:
    
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
                r rVar = (r) this.b;
                rVar.getClass();
                return z5.i.c.a(rVar.a);
            case 1:
                ((com.google.firebase.messaging.v) this.b).run();
                return null;
            case 2:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((a0.e) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    a0.b bVar = (a0.b) it;
                    if (!bVar.hasNext()) {
                        return arrayList;
                    }
                    g0.c cVar2 = ((h2.f) bVar.next()).c;
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
                    p0[] p0VarArr = cVar2.i;
                    if (p0VarArr != null) {
                        cVar3.i = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
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
                break;
            case 3:
                return BitmapFactory.decodeFile(((h2.f) this.b).b);
            case 4:
                a9 a9Var = (a9) this.b;
                a9Var.getClass();
                return z5.i.c.a(a9Var.g);
            case 5:
                ka kaVar = (ka) this.b;
                kaVar.getClass();
                return z5.i.c.a(kaVar.g);
            case 6:
                la laVar = (la) this.b;
                laVar.getClass();
                return z5.i.c.a(laVar.g);
            case 7:
                wf wfVar = (wf) this.b;
                wfVar.getClass();
                return z5.i.c.a(wfVar.g);
            case 8:
                p2.s sVar = (p2.s) this.b;
                p2.b bVar2 = sVar.d;
                synchronized (bVar2.a) {
                    try {
                        if (bVar2.b != 3) {
                            boolean z10 = true;
                            boolean z11 = bVar2.b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.u.b(bundle, bVar2.c, bVar2.d, bVar2.A.longValue());
                            }
                            synchronized (bVar2.a) {
                                cVar = bVar2.i;
                            }
                            if (cVar == null) {
                                p2.b bVar3 = sVar.d;
                                bVar3.k(0);
                                p2.g gVar = z.h;
                                bVar3.j(107, gVar);
                                sVar.c(gVar);
                            } else {
                                p2.b bVar4 = sVar.d;
                                String packageName = bVar4.g.getPackageName();
                                int i11 = 25;
                                int i12 = 3;
                                while (true) {
                                    if (i11 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel S0 = aVar.S0();
                                                S0.writeInt(i11);
                                                S0.writeString(packageName);
                                                S0.writeString("subs");
                                                Parcel T0 = aVar.T0(S0, 1);
                                                int readInt = T0.readInt();
                                                T0.recycle();
                                                i12 = readInt;
                                            } catch (Exception e10) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z12 = e10 instanceof DeadObjectException;
                                                int i13 = z12 ? 91 : e10 instanceof RemoteException ? 90 : e10 instanceof SecurityException ? 92 : 42;
                                                String a2 = m1.j.a(i13, 42) ? x.a(e10) : null;
                                                sVar.d.k(0);
                                                sVar.b(z12 ? z.h : z.f, i13, a2, z11);
                                                sVar.c(z12 ? z.h : z.f);
                                            }
                                        } else {
                                            i12 = ((com.google.android.gms.internal.play_billing.a) cVar).U0(i11, packageName, "subs", bundle);
                                        }
                                        if (i12 == 0) {
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "highestLevelSupportedForSubs: " + i11);
                                        } else {
                                            i11--;
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                }
                                bVar4.k = i11 >= 3;
                                if (i11 < 3) {
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i10 = 9;
                                } else {
                                    i10 = 1;
                                }
                                int i14 = i12;
                                int i15 = 25;
                                while (true) {
                                    if (i15 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel S02 = aVar2.S0();
                                            S02.writeInt(i15);
                                            S02.writeString(packageName);
                                            S02.writeString("inapp");
                                            Parcel T02 = aVar2.T0(S02, 1);
                                            i14 = T02.readInt();
                                            T02.recycle();
                                        } else {
                                            i14 = ((com.google.android.gms.internal.play_billing.a) cVar).U0(i15, packageName, "inapp", bundle);
                                        }
                                        if (i14 == 0) {
                                            bVar4.l = i15;
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i15);
                                        } else {
                                            i15--;
                                        }
                                    }
                                }
                                int i16 = bVar4.l;
                                bVar4.l = i16;
                                bVar4.w = i16 >= 26;
                                bVar4.v = i16 >= 24;
                                bVar4.u = i16 >= 21;
                                bVar4.t = i16 >= 20;
                                bVar4.s = i16 >= 19;
                                bVar4.r = i16 >= 17;
                                bVar4.q = i16 >= 16;
                                bVar4.p = i16 >= 15;
                                bVar4.o = i16 >= 14;
                                bVar4.n = i16 >= 9;
                                if (i16 < 6) {
                                    z10 = false;
                                }
                                bVar4.m = z10;
                                if (i16 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                p2.b.p(bVar4, i14);
                                if (i14 != 0) {
                                    p2.g gVar2 = z.a;
                                    sVar.b(gVar2, i10, null, z11);
                                    sVar.c(gVar2);
                                } else {
                                    try {
                                        Long a10 = sVar.a(z11);
                                        if (z11) {
                                            g3 s10 = h3.s();
                                            s10.c();
                                            h3.r((h3) s10.b, 6);
                                            b4 r6 = c4.r();
                                            r6.d(false);
                                            r6.e();
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                r6.c();
                                                c4.p((c4) r6.b, longValue);
                                            }
                                            p2.b bVar5 = sVar.d;
                                            s10.c();
                                            h3.q((h3) s10.b, (c4) r6.a());
                                            bVar5.i((h3) s10.a());
                                        } else {
                                            y3 p10 = z3.p();
                                            i3 s11 = j3.s();
                                            s11.c();
                                            j3.r((j3) s11.b, 0);
                                            p10.c();
                                            z3.n((z3) p10.b, (j3) s11.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p10.c();
                                                z3.o((z3) p10.b, longValue2);
                                            }
                                            sVar.d.h.t2((z3) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    sVar.c(z.g);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 9:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            default:
                x1.a aVar3 = (x1.a) this.b;
                aVar3.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar3.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
        }
    }
}

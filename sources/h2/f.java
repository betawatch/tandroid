package h2;

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
import b6.j;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.z3;
import com.google.firebase.messaging.u;
import e0.o0;
import h7.q;
import j7.c9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import k7.ka;
import l7.la;
import n7.xf;
import p2.a0;
import p2.t;
import p2.y;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03b0, code lost:
    
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
                ArrayList arrayList = new ArrayList();
                Iterator it = ((a0.e) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    a0.b bVar = (a0.b) it;
                    if (!bVar.hasNext()) {
                        return arrayList;
                    }
                    g0.c cVar2 = ((h) bVar.next()).c;
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
                    o0[] o0VarArr = cVar2.i;
                    if (o0VarArr != null) {
                        cVar3.i = (o0[]) Arrays.copyOf(o0VarArr, o0VarArr.length);
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
            case 1:
                return BitmapFactory.decodeFile(((h) this.b).b);
            case 2:
                q qVar = (q) this.b;
                qVar.getClass();
                return j.c.a(qVar.a);
            case 3:
                ((u) this.b).run();
                return null;
            case 4:
                c9 c9Var = (c9) this.b;
                c9Var.getClass();
                return j.c.a(c9Var.g);
            case 5:
                ka kaVar = (ka) this.b;
                kaVar.getClass();
                return j.c.a(kaVar.g);
            case 6:
                la laVar = (la) this.b;
                laVar.getClass();
                return j.c.a(laVar.g);
            case 7:
                xf xfVar = (xf) this.b;
                xfVar.getClass();
                return j.c.a(xfVar.g);
            case 8:
                t tVar = (t) this.b;
                p2.b bVar2 = tVar.d;
                synchronized (bVar2.a) {
                    try {
                        if (bVar2.b != 3) {
                            boolean z4 = true;
                            boolean z10 = bVar2.b == 1;
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
                                p2.b bVar3 = tVar.d;
                                bVar3.k(0);
                                p2.h hVar = a0.h;
                                bVar3.j(107, hVar);
                                tVar.c(hVar);
                            } else {
                                p2.b bVar4 = tVar.d;
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
                                            } catch (Exception e6) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e6);
                                                boolean z11 = e6 instanceof DeadObjectException;
                                                int i13 = z11 ? 91 : e6 instanceof RemoteException ? 90 : e6 instanceof SecurityException ? 92 : 42;
                                                String a2 = m1.j.b(i13, 42) ? y.a(e6) : null;
                                                tVar.d.k(0);
                                                tVar.b(z11 ? a0.h : a0.f, i13, a2, z10);
                                                tVar.c(z11 ? a0.h : a0.f);
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
                                    z4 = false;
                                }
                                bVar4.m = z4;
                                if (i16 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                p2.b.p(bVar4, i14);
                                if (i14 != 0) {
                                    p2.h hVar2 = a0.a;
                                    tVar.b(hVar2, i10, null, z10);
                                    tVar.c(hVar2);
                                } else {
                                    try {
                                        Long a10 = tVar.a(z10);
                                        if (z10) {
                                            h3 s6 = i3.s();
                                            s6.c();
                                            i3.r((i3) s6.b, 6);
                                            c4 r10 = d4.r();
                                            r10.d(false);
                                            r10.e();
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                r10.c();
                                                d4.p((d4) r10.b, longValue);
                                            }
                                            p2.b bVar5 = tVar.d;
                                            s6.c();
                                            i3.q((i3) s6.b, (d4) r10.a());
                                            bVar5.i((i3) s6.a());
                                        } else {
                                            z3 p10 = a4.p();
                                            j3 s9 = k3.s();
                                            s9.c();
                                            k3.r((k3) s9.b, 0);
                                            p10.c();
                                            a4.n((a4) p10.b, (k3) s9.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p10.c();
                                                a4.o((a4) p10.b, longValue2);
                                            }
                                            tVar.d.h.r1((a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    tVar.c(a0.g);
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

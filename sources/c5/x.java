package c5;

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
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.z3;
import e0.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import v7.y8;
import w7.la;
import x7.fa;
import z7.wf;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i10) {
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
                y yVar = (y) this.b;
                c cVar2 = yVar.d;
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
                                c cVar3 = yVar.d;
                                cVar3.k(0);
                                h hVar = g0.h;
                                cVar3.j(107, hVar);
                                yVar.c(hVar);
                            } else {
                                c cVar4 = yVar.d;
                                String packageName = cVar4.g.getPackageName();
                                int i11 = 25;
                                int i12 = 3;
                                while (true) {
                                    if (i11 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel U0 = aVar.U0();
                                                U0.writeInt(i11);
                                                U0.writeString(packageName);
                                                U0.writeString("subs");
                                                Parcel V0 = aVar.V0(U0, 1);
                                                int readInt = V0.readInt();
                                                V0.recycle();
                                                i12 = readInt;
                                            } catch (Exception e7) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e7);
                                                boolean z12 = e7 instanceof DeadObjectException;
                                                int i13 = z12 ? 91 : e7 instanceof RemoteException ? 90 : e7 instanceof SecurityException ? 92 : 42;
                                                String a2 = m1.j.b(i13, 42) ? e0.a(e7) : null;
                                                yVar.d.k(0);
                                                yVar.b(z12 ? g0.h : g0.f, i13, a2, z11);
                                                yVar.c(z12 ? g0.h : g0.f);
                                            }
                                        } else {
                                            i12 = ((com.google.android.gms.internal.play_billing.a) cVar).W0(i11, packageName, "subs", bundle);
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
                                cVar4.k = i11 >= 3;
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
                                            Parcel U02 = aVar2.U0();
                                            U02.writeInt(i15);
                                            U02.writeString(packageName);
                                            U02.writeString("inapp");
                                            Parcel V02 = aVar2.V0(U02, 1);
                                            i14 = V02.readInt();
                                            V02.recycle();
                                        } else {
                                            i14 = ((com.google.android.gms.internal.play_billing.a) cVar).W0(i15, packageName, "inapp", bundle);
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
                                c.p(cVar4, i14);
                                if (i14 != 0) {
                                    h hVar2 = g0.a;
                                    yVar.b(hVar2, i10, null, z11);
                                    yVar.c(hVar2);
                                } else {
                                    try {
                                        Long a10 = yVar.a(z11);
                                        if (z11) {
                                            h3 s10 = i3.s();
                                            s10.c();
                                            i3.r((i3) s10.b, 6);
                                            c4 r10 = d4.r();
                                            r10.d(false);
                                            r10.e();
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                r10.c();
                                                d4.p((d4) r10.b, longValue);
                                            }
                                            c cVar5 = yVar.d;
                                            s10.c();
                                            i3.q((i3) s10.b, (d4) r10.a());
                                            cVar5.i((i3) s10.a());
                                        } else {
                                            z3 p5 = a4.p();
                                            j3 s11 = k3.s();
                                            s11.c();
                                            k3.r((k3) s11.b, 0);
                                            p5.c();
                                            a4.n((a4) p5.b, (k3) s11.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p5.c();
                                                a4.o((a4) p5.b, longValue2);
                                            }
                                            yVar.d.h.q0((a4) p5.a());
                                        }
                                    } catch (Throwable th2) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    yVar.c(g0.g);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 1:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 2:
                t7.q qVar = (t7.q) this.b;
                qVar.getClass();
                return n6.i.c.a(qVar.a);
            case 3:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((a0.e) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    a0.b bVar = (a0.b) it;
                    if (!bVar.hasNext()) {
                        return arrayList;
                    }
                    g0.c cVar6 = ((u4.h) bVar.next()).c;
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
                    p0[] p0VarArr = cVar6.i;
                    if (p0VarArr != null) {
                        cVar7.i = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
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
                return BitmapFactory.decodeFile(((u4.h) this.b).b);
            case 5:
                y8 y8Var = (y8) this.b;
                y8Var.getClass();
                return n6.i.c.a(y8Var.g);
            case 6:
                la laVar = (la) this.b;
                laVar.getClass();
                return n6.i.c.a(laVar.g);
            case 7:
                ((com.google.firebase.messaging.u) this.b).run();
                return null;
            case 8:
                x1.a aVar3 = (x1.a) this.b;
                aVar3.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar3.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 9:
                fa faVar = (fa) this.b;
                faVar.getClass();
                return n6.i.c.a(faVar.g);
            default:
                wf wfVar = (wf) this.b;
                wfVar.getClass();
                return n6.i.c.a(wfVar.g);
        }
    }
}

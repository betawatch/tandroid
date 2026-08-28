package d7;

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
import com.google.firebase.messaging.v;
import e0.p0;
import f7.c9;
import g7.ka;
import j7.wf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import n2.b0;
import n2.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0377, code lost:
    
        throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i9;
        switch (this.a) {
            case 0:
                r rVar = (r) this.b;
                rVar.getClass();
                return x5.i.c.a(rVar.a);
            case 1:
                ((v) this.b).run();
                return null;
            case 2:
                c9 c9Var = (c9) this.b;
                c9Var.getClass();
                return x5.i.c.a(c9Var.g);
            case 3:
                ka kaVar = (ka) this.b;
                kaVar.getClass();
                return x5.i.c.a(kaVar.g);
            case 4:
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
            case 5:
                return BitmapFactory.decodeFile(((h2.f) this.b).b);
            case 6:
                h7.ka kaVar2 = (h7.ka) this.b;
                kaVar2.getClass();
                return x5.i.c.a(kaVar2.g);
            case 7:
                wf wfVar = (wf) this.b;
                wfVar.getClass();
                return x5.i.c.a(wfVar.g);
            case 8:
                n2.t tVar = (n2.t) this.b;
                n2.b bVar2 = tVar.d;
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
                                n2.b bVar3 = tVar.d;
                                bVar3.k(0);
                                n2.g gVar = b0.h;
                                bVar3.j(107, gVar);
                                tVar.c(gVar);
                            } else {
                                n2.b bVar4 = tVar.d;
                                String packageName = bVar4.g.getPackageName();
                                int i10 = 25;
                                int i11 = 3;
                                while (true) {
                                    if (i10 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel S0 = aVar.S0();
                                                S0.writeInt(i10);
                                                S0.writeString(packageName);
                                                S0.writeString("subs");
                                                Parcel T0 = aVar.T0(S0, 1);
                                                int readInt = T0.readInt();
                                                T0.recycle();
                                                i11 = readInt;
                                            } catch (Exception e10) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z12 = e10 instanceof DeadObjectException;
                                                int i12 = z12 ? 91 : e10 instanceof RemoteException ? 90 : e10 instanceof SecurityException ? 92 : 42;
                                                String a2 = m1.j.a(i12, 42) ? z.a(e10) : null;
                                                tVar.d.k(0);
                                                tVar.b(z12 ? b0.h : b0.f, i12, a2, z11);
                                                tVar.c(z12 ? b0.h : b0.f);
                                            }
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.a) cVar).U0(i10, packageName, "subs", bundle);
                                        }
                                        if (i11 == 0) {
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "highestLevelSupportedForSubs: " + i10);
                                        } else {
                                            i10--;
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                bVar4.k = i10 >= 3;
                                if (i10 < 3) {
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i9 = 9;
                                } else {
                                    i9 = 1;
                                }
                                int i13 = i11;
                                int i14 = 25;
                                while (true) {
                                    if (i14 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel S02 = aVar2.S0();
                                            S02.writeInt(i14);
                                            S02.writeString(packageName);
                                            S02.writeString("inapp");
                                            Parcel T02 = aVar2.T0(S02, 1);
                                            i13 = T02.readInt();
                                            T02.recycle();
                                        } else {
                                            i13 = ((com.google.android.gms.internal.play_billing.a) cVar).U0(i14, packageName, "inapp", bundle);
                                        }
                                        if (i13 == 0) {
                                            bVar4.l = i14;
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                        } else {
                                            i14--;
                                        }
                                    }
                                }
                                int i15 = bVar4.l;
                                bVar4.l = i15;
                                bVar4.w = i15 >= 26;
                                bVar4.v = i15 >= 24;
                                bVar4.u = i15 >= 21;
                                bVar4.t = i15 >= 20;
                                bVar4.s = i15 >= 19;
                                bVar4.r = i15 >= 17;
                                bVar4.q = i15 >= 16;
                                bVar4.p = i15 >= 15;
                                bVar4.o = i15 >= 14;
                                bVar4.n = i15 >= 9;
                                if (i15 < 6) {
                                    z10 = false;
                                }
                                bVar4.m = z10;
                                if (i15 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i9 = 36;
                                }
                                n2.b.p(bVar4, i13);
                                if (i13 != 0) {
                                    n2.g gVar2 = b0.a;
                                    tVar.b(gVar2, i9, null, z11);
                                    tVar.c(gVar2);
                                } else {
                                    try {
                                        Long a3 = tVar.a(z11);
                                        if (z11) {
                                            h3 s10 = i3.s();
                                            s10.c();
                                            i3.r((i3) s10.b, 6);
                                            c4 r10 = d4.r();
                                            r10.d(false);
                                            r10.e();
                                            if (a3 != null) {
                                                long longValue = a3.longValue();
                                                r10.c();
                                                d4.p((d4) r10.b, longValue);
                                            }
                                            n2.b bVar5 = tVar.d;
                                            s10.c();
                                            i3.q((i3) s10.b, (d4) r10.a());
                                            bVar5.i((i3) s10.a());
                                        } else {
                                            z3 p6 = a4.p();
                                            j3 s11 = k3.s();
                                            s11.c();
                                            k3.r((k3) s11.b, 0);
                                            p6.c();
                                            a4.n((a4) p6.b, (k3) s11.a());
                                            if (a3 != null) {
                                                long longValue2 = a3.longValue();
                                                p6.c();
                                                a4.o((a4) p6.b, longValue2);
                                            }
                                            tVar.d.h.B((a4) p6.a());
                                        }
                                    } catch (Throwable th) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
                                    }
                                    tVar.c(b0.g);
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

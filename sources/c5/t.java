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
import e0.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.telegram.messenger.zs;
import v7.x8;
import w7.ja;
import x7.ga;
import z7.xf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
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
                u uVar = (u) this.b;
                b bVar = uVar.d;
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
                                b bVar2 = uVar.d;
                                bVar2.k(0);
                                g gVar = c0.h;
                                bVar2.j(zs.s1, gVar);
                                uVar.c(gVar);
                            } else {
                                b bVar3 = uVar.d;
                                String packageName = bVar3.g.getPackageName();
                                int i11 = 3;
                                int i12 = 25;
                                while (true) {
                                    if (i12 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel V0 = aVar.V0();
                                                V0.writeInt(i12);
                                                V0.writeString(packageName);
                                                V0.writeString("subs");
                                                Parcel W0 = aVar.W0(V0, 1);
                                                int readInt = W0.readInt();
                                                W0.recycle();
                                                i11 = readInt;
                                            } catch (Exception e) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                                boolean z12 = e instanceof DeadObjectException;
                                                int i13 = z12 ? 91 : e instanceof RemoteException ? 90 : e instanceof SecurityException ? 92 : 42;
                                                String a2 = m1.j.b(i13, 42) ? a0.a(e) : null;
                                                uVar.d.k(0);
                                                uVar.b(z12 ? c0.h : c0.f, i13, a2, z11);
                                                uVar.c(z12 ? c0.h : c0.f);
                                            }
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(i12, packageName, "subs", bundle);
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
                                bVar3.k = i12 >= 3;
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
                                            Parcel V02 = aVar2.V0();
                                            V02.writeInt(i15);
                                            V02.writeString(packageName);
                                            V02.writeString("inapp");
                                            Parcel W02 = aVar2.W0(V02, 1);
                                            i14 = W02.readInt();
                                            W02.recycle();
                                        } else {
                                            i14 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(i15, packageName, "inapp", bundle);
                                        }
                                        if (i14 == 0) {
                                            bVar3.l = i15;
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i15);
                                        } else {
                                            i15--;
                                        }
                                    }
                                }
                                int i16 = bVar3.l;
                                bVar3.l = i16;
                                bVar3.w = i16 >= 26;
                                bVar3.v = i16 >= 24;
                                bVar3.u = i16 >= 21;
                                bVar3.t = i16 >= 20;
                                bVar3.s = i16 >= 19;
                                bVar3.r = i16 >= 17;
                                bVar3.q = i16 >= 16;
                                bVar3.p = i16 >= 15;
                                bVar3.o = i16 >= 14;
                                bVar3.n = i16 >= 9;
                                if (i16 < 6) {
                                    z10 = false;
                                }
                                bVar3.m = z10;
                                if (i16 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                b.p(bVar3, i14);
                                if (i14 != 0) {
                                    g gVar2 = c0.a;
                                    uVar.b(gVar2, i10, null, z11);
                                    uVar.c(gVar2);
                                } else {
                                    try {
                                        Long a10 = uVar.a(z11);
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
                                            b bVar4 = uVar.d;
                                            s10.c();
                                            i3.q((i3) s10.b, (d4) r10.a());
                                            bVar4.i((i3) s10.a());
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
                                            uVar.d.h.y0((a4) p5.a());
                                        }
                                    } catch (Throwable th2) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    uVar.c(c0.g);
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
                    a0.b bVar5 = (a0.b) it;
                    if (!bVar5.hasNext()) {
                        return arrayList;
                    }
                    g0.c cVar2 = ((u4.f) bVar5.next()).c;
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
                    l0[] l0VarArr = cVar2.i;
                    if (l0VarArr != null) {
                        cVar3.i = (l0[]) Arrays.copyOf(l0VarArr, l0VarArr.length);
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
            case 4:
                return BitmapFactory.decodeFile(((u4.f) this.b).b);
            case 5:
                x8 x8Var = (x8) this.b;
                x8Var.getClass();
                return n6.i.c.a(x8Var.g);
            case 6:
                ja jaVar = (ja) this.b;
                jaVar.getClass();
                return n6.i.c.a(jaVar.g);
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
                ga gaVar = (ga) this.b;
                gaVar.getClass();
                return n6.i.c.a(gaVar.g);
            case 9:
                ((x9.l) this.b).run();
                return null;
            default:
                xf xfVar = (xf) this.b;
                xfVar.getClass();
                return n6.i.c.a(xfVar.g);
        }
    }
}

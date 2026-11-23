package a2;

import a0.e;
import a8.ua;
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
import f5.t;
import f5.x;
import f5.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.telegram.messenger.ks;
import p1.g;
import q6.j;
import w7.p;
import y7.e9;
import z7.ma;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                ua uaVar = (ua) this.b;
                uaVar.getClass();
                return j.c.a(uaVar.g);
            case 2:
                uf ufVar = (uf) this.b;
                ufVar.getClass();
                return j.c.a(ufVar.g);
            case 3:
                t tVar = (t) this.b;
                f5.b bVar = tVar.e;
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
                                u.b(bundle, bVar.c, bVar.d, bVar.A.longValue());
                            }
                            synchronized (bVar.a) {
                                cVar = bVar.i;
                            }
                            if (cVar == null) {
                                f5.b bVar2 = tVar.e;
                                bVar2.k(0);
                                int i10 = tVar.d;
                                f fVar = z.h;
                                bVar2.j(ks.s1, i10, fVar);
                                tVar.c(fVar);
                            } else {
                                f5.b bVar3 = tVar.e;
                                String packageName = bVar3.g.getPackageName();
                                int i11 = 3;
                                int i12 = 25;
                                while (true) {
                                    if (i12 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel v12 = aVar2.v1();
                                                v12.writeInt(i12);
                                                v12.writeString(packageName);
                                                v12.writeString("subs");
                                                Parcel w12 = aVar2.w1(v12, 1);
                                                int readInt = w12.readInt();
                                                w12.recycle();
                                                i11 = readInt;
                                            } catch (Exception e10) {
                                                u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z12 = e10 instanceof DeadObjectException;
                                                int i13 = z12 ? 91 : e10 instanceof RemoteException ? 90 : e10 instanceof SecurityException ? 92 : 42;
                                                String a10 = g.b(i13, 42) ? x.a(e10) : null;
                                                tVar.e.k(0);
                                                tVar.b(z12 ? z.h : z.f, i13, a10, z11);
                                                tVar.c(z12 ? z.h : z.f);
                                            }
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.a) cVar).x1(i12, packageName, "subs", bundle);
                                        }
                                        if (i11 == 0) {
                                            u.g("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                        } else {
                                            i12--;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                }
                                bVar3.k = i12 >= 3;
                                if (i12 < 3) {
                                    u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i7 = 9;
                                } else {
                                    i7 = 1;
                                }
                                int i14 = i11;
                                int i15 = 25;
                                while (true) {
                                    if (i15 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar3 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel v13 = aVar3.v1();
                                            v13.writeInt(i15);
                                            v13.writeString(packageName);
                                            v13.writeString("inapp");
                                            Parcel w13 = aVar3.w1(v13, 1);
                                            i14 = w13.readInt();
                                            w13.recycle();
                                        } else {
                                            i14 = ((com.google.android.gms.internal.play_billing.a) cVar).x1(i15, packageName, "inapp", bundle);
                                        }
                                        if (i14 == 0) {
                                            bVar3.l = i15;
                                            u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i15);
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
                                bVar3.m = i16 >= 6;
                                if (i16 < 3) {
                                    u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i7 = 36;
                                }
                                f5.b.p(bVar3, i14);
                                if (i14 != 0) {
                                    f fVar2 = z.a;
                                    tVar.b(fVar2, i7, null, z11);
                                    tVar.c(fVar2);
                                } else {
                                    try {
                                        Long a11 = tVar.a(z11);
                                        if (z11) {
                                            h3 s5 = i3.s();
                                            s5.c();
                                            i3.r((i3) s5.b, 6);
                                            c4 r10 = d4.r();
                                            int i17 = tVar.d;
                                            if (i17 <= 0) {
                                                z10 = false;
                                            }
                                            r10.d(z10);
                                            r10.e(i17);
                                            if (a11 != null) {
                                                long longValue = a11.longValue();
                                                r10.c();
                                                d4.p((d4) r10.b, longValue);
                                            }
                                            f5.b bVar4 = tVar.e;
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
                                            tVar.e.h.d0((a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    tVar.c(z.g);
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

package c2;

import ag.h1;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.ui.Cells.pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public o A;
    public int B;
    public a5.n C;
    public android.support.v4.media.session.d0 D;
    public final a9.i E;
    public final z0 c;
    public z d;
    public r e;
    public com.google.android.gms.internal.cast.o f;
    public x g;
    public final Context h;
    public final a1 n;
    public final ga.c o;
    public final boolean p;
    public final boolean q;
    public l r;
    public final o0 s;
    public final c0 t;
    public e0 u;
    public z v;
    public z w;
    public z x;
    public q y;
    public o z;
    public final b a = new b(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context) {
        boolean z10;
        s sVar;
        z0 z0Var;
        a1 a1Var = new a1();
        a1Var.c = 0;
        a1Var.d = 3;
        this.n = a1Var;
        this.o = new ga.c(this, 5);
        this.E = new a9.i(this, 6);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            int i11 = j0.a;
            Intent intent = new Intent(context, (Class<?>) j0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z10 = true;
                this.q = z10;
                int i12 = b1.a;
                Intent intent2 = new Intent(context, (Class<?>) b1.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i10 >= 30 || !z10) ? null : new l(context, new ae.b(this, 4));
                o0 k0Var = i10 < 24 ? new k0(context, this) : new o0(context, this);
                this.s = k0Var;
                this.t = new c0(new af.e(this, 16));
                a(k0Var, true);
                sVar = this.r;
                if (sVar != null) {
                    a(sVar, true);
                }
                z0Var = new z0(context, this);
                this.c = z0Var;
                Handler handler = (Handler) z0Var.d;
                if (z0Var.a) {
                    z0Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) z0Var.b).registerReceiver((androidx.mediarouter.app.f) z0Var.g, intentFilter, null, handler);
                    handler.post((a8.b) z0Var.h);
                    return;
                }
                return;
            }
        }
        z10 = false;
        this.q = z10;
        int i122 = b1.a;
        Intent intent22 = new Intent(context, (Class<?>) b1.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i10 >= 30 || !z10) ? null : new l(context, new ae.b(this, 4));
        if (i10 < 24) {
        }
        this.s = k0Var;
        this.t = new c0(new af.e(this, 16));
        a(k0Var, true);
        sVar = this.r;
        if (sVar != null) {
        }
        z0Var = new z0(context, this);
        this.c = z0Var;
        Handler handler2 = (Handler) z0Var.d;
        if (z0Var.a) {
        }
    }

    public final void a(s sVar, boolean z10) {
        if (d(sVar) == null) {
            y yVar = new y(sVar, z10);
            this.l.add(yVar);
            this.a.b(513, yVar);
            m(yVar, (t) sVar.n);
            b0.b();
            sVar.f = this.o;
            sVar.h(this.z);
        }
    }

    public final String b(y yVar, String str) {
        String flattenToShortString = ((ComponentName) yVar.d.b).flattenToShortString();
        boolean z10 = yVar.c;
        String w10 = z10 ? str : a9.p.w(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z10) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                if (((z) arrayList.get(i10)).c.equals(w10)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", pa.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = w10 + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        if (((z) arrayList.get(i12)).c.equals(str2)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 < 0) {
                        hashMap.put(new q0.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i11++;
                }
            }
        }
        hashMap.put(new q0.b(flattenToShortString, str), w10);
        return w10;
    }

    public final z c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z zVar = (z) obj;
            if (zVar != this.v && zVar.c() == this.s && zVar.m("android.media.intent.category.LIVE_AUDIO") && !zVar.m("android.media.intent.category.LIVE_VIDEO") && zVar.f()) {
                return zVar;
            }
        }
        return this.v;
    }

    public final y d(s sVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y yVar = (y) obj;
            if (yVar.a == sVar) {
                return yVar;
            }
        }
        return null;
    }

    public final z e() {
        z zVar = this.d;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        e0 e0Var = this.u;
        return e0Var == null || e0Var.b;
    }

    public final void g() {
        if (this.d.e()) {
            List<z> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((z) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    r rVar = (r) entry.getValue();
                    rVar.h(0);
                    rVar.d();
                    it2.remove();
                }
            }
            for (z zVar : unmodifiableList) {
                if (!hashMap.containsKey(zVar.c)) {
                    r e9 = zVar.c().e(zVar.b, this.d.b);
                    e9.e();
                    hashMap.put(zVar.c, e9);
                }
            }
        }
    }

    public final void h(e eVar, z zVar, r rVar, int i10, z zVar2, Collection collection) {
        com.google.android.gms.internal.cast.o oVar;
        x xVar = this.g;
        if (xVar != null) {
            xVar.a();
            this.g = null;
        }
        x xVar2 = new x(eVar, zVar, rVar, i10, zVar2, collection);
        this.g = xVar2;
        if (xVar2.b != 3 || (oVar = this.f) == null) {
            xVar2.b();
            return;
        }
        z zVar3 = this.d;
        z zVar4 = (z) xVar2.g;
        int i11 = 1;
        com.google.android.gms.internal.cast.o.c.b("Prepare transfer from Route(%s) to Route(%s)", zVar3, zVar4);
        c0.i iVar = new c0.i();
        iVar.c = new c0.l();
        c0.k kVar = new c0.k(iVar);
        c0.j jVar = kVar.b;
        iVar.b = kVar;
        iVar.a = androidx.activity.result.c.class;
        try {
            iVar.a = Boolean.valueOf(oVar.b.post(new bf.e(oVar, zVar3, zVar4, iVar, false, 3)));
        } catch (Exception e9) {
            jVar.l(e9);
        }
        x xVar3 = this.g;
        e eVar2 = (e) ((WeakReference) xVar3.j).get();
        if (eVar2 == null || eVar2.g != xVar3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            xVar3.a();
        } else {
            if (((c0.k) xVar3.k) != null) {
                throw new IllegalStateException("future is already set");
            }
            xVar3.k = kVar;
            af.e eVar3 = new af.e(xVar3, 18);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            jVar.c(eVar3, new f(bVar, i11));
        }
    }

    public final void i(z zVar, int i10) {
        if (!this.j.contains(zVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + zVar);
        } else {
            if (!zVar.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + zVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                s c10 = zVar.c();
                l lVar = this.r;
                if (c10 == lVar && this.d != zVar) {
                    lVar.s(zVar.b);
                    return;
                }
            }
            j(zVar, i10);
        }
    }

    public final void j(z zVar, int i10) {
        t tVar;
        if (this.d == zVar) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            q qVar = this.y;
            if (qVar != null) {
                qVar.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (tVar = zVar.a.e) != null && tVar.b) {
            q c10 = zVar.c().c(zVar.b);
            if (c10 != null) {
                Executor e9 = f0.e.e(this.h);
                a9.i iVar = this.E;
                synchronized (c10.a) {
                    try {
                        if (e9 == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (iVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c10.b = e9;
                        c10.c = iVar;
                        ArrayList arrayList = c10.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            n nVar = c10.d;
                            ArrayList arrayList2 = c10.e;
                            c10.d = null;
                            c10.e = null;
                            c10.b.execute(new bf.e(c10, iVar, nVar, arrayList2, 1));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.x = zVar;
                this.y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + zVar);
        }
        r d = zVar.c().d(zVar.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, zVar, d, i10, null, null);
            return;
        }
        this.d = zVar;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(262, new q0.b(null, zVar));
        obtainMessage.arg1 = i10;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
    
        if (r26.A.b() == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        long j10;
        a9.i iVar;
        ArrayList arrayList;
        a9.i iVar2 = new a9.i(7, false);
        c0 c0Var = this.t;
        long j11 = 0;
        c0Var.b = 0L;
        c0Var.a = false;
        c0Var.c = SystemClock.elapsedRealtime();
        ((Handler) c0Var.d).removeCallbacks((af.e) c0Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.p;
            if (size < 0) {
                a9.i iVar3 = iVar2;
                long j12 = j11;
                c0 c0Var2 = this.t;
                if (c0Var2.a) {
                    long j13 = c0Var2.b;
                    if (j13 > j12) {
                        ((Handler) c0Var2.d).postDelayed((af.e) c0Var2.e, j13);
                    }
                }
                boolean z12 = c0Var2.a;
                this.B = i10;
                u M = z10 ? iVar3.M() : u.c;
                u M2 = iVar3.M();
                if (f()) {
                    o oVar = this.A;
                    if (oVar != null) {
                        oVar.a();
                        if (oVar.b.equals(M2)) {
                        }
                    }
                    if (!M2.d() || z12) {
                        this.A = new o(M2, z12);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                o oVar2 = this.z;
                if (oVar2 != null) {
                    oVar2.a();
                    if (oVar2.b.equals(M) && this.z.b() == z12) {
                        return;
                    }
                }
                if (!M.d() || z12) {
                    this.z = new o(M, z12);
                } else if (this.z == null) {
                    return;
                } else {
                    this.z = null;
                }
                if (z10 && !z12 && z11) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList3 = this.l;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj = arrayList3.get(i11);
                    i11++;
                    s sVar = ((y) obj).a;
                    if (sVar != this.r) {
                        sVar.h(this.z);
                    }
                }
                return;
            }
            b0 b0Var = (b0) ((WeakReference) arrayList2.get(size)).get();
            if (b0Var == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList4 = b0Var.b;
                int size3 = arrayList4.size();
                i10 += size3;
                int i12 = 0;
                while (i12 < size3) {
                    w wVar = (w) arrayList4.get(i12);
                    u uVar = wVar.c;
                    if (uVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c10 = uVar.c();
                    if (c10.isEmpty()) {
                        j10 = j11;
                    } else {
                        int size4 = c10.size();
                        j10 = j11;
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj2 = c10.get(i13);
                            i13++;
                            String str = (String) obj2;
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (((ArrayList) iVar2.b) == null) {
                                iVar2.b = new ArrayList();
                            }
                            if (!((ArrayList) iVar2.b).contains(str)) {
                                ((ArrayList) iVar2.b).add(str);
                            }
                        }
                    }
                    boolean z13 = (wVar.d & 1) != 0;
                    long j14 = wVar.e;
                    c0 c0Var3 = this.t;
                    if (z13) {
                        iVar = iVar2;
                        arrayList = arrayList2;
                        long j15 = c0Var3.c;
                        if (j15 - j14 < 30000) {
                            c0Var3.b = Math.max(c0Var3.b, (j14 + 30000) - j15);
                            c0Var3.a = true;
                        }
                    } else {
                        c0Var3.getClass();
                        iVar = iVar2;
                        arrayList = arrayList2;
                    }
                    if (z13) {
                        z10 = true;
                    }
                    int i14 = wVar.d;
                    if ((i14 & 4) != 0 && !z11) {
                        z10 = true;
                    }
                    if ((i14 & 8) != 0) {
                        z10 = true;
                    }
                    i12++;
                    j11 = j10;
                    iVar2 = iVar;
                    arrayList2 = arrayList;
                }
            }
            j11 = j11;
            iVar2 = iVar2;
            arrayList2 = arrayList2;
        }
    }

    public final void l() {
        z zVar = this.d;
        if (zVar == null) {
            a5.n nVar = this.C;
            if (nVar != null) {
                nVar.j();
                return;
            }
            return;
        }
        int i10 = zVar.p;
        a1 a1Var = this.n;
        a1Var.a = i10;
        a1Var.b = zVar.q;
        a1Var.c = (!zVar.e() || b0.g()) ? zVar.o : 0;
        a1Var.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            a1Var.e = l.p(this.e);
        } else {
            a1Var.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        a5.n nVar2 = this.C;
        if (nVar2 != null) {
            z zVar2 = this.d;
            z zVar3 = this.v;
            if (zVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (zVar2 == zVar3 || zVar2 == this.w) {
                nVar2.j();
                return;
            }
            int i11 = a1Var.c == 1 ? 2 : 0;
            int i12 = a1Var.b;
            int i13 = a1Var.a;
            String str = (String) a1Var.e;
            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) nVar2.b;
            if (d0Var != null) {
                h1 h1Var = (h1) nVar2.c;
                if (h1Var != null && i11 == 0 && i12 == 0) {
                    h1Var.c = i13;
                    y1.g.a(h1Var.c(), i13);
                    return;
                }
                h1 h1Var2 = new h1();
                h1Var2.f = nVar2;
                h1Var2.a = i11;
                h1Var2.b = i12;
                h1Var2.c = i13;
                h1Var2.d = str;
                nVar2.c = h1Var2;
                d0Var.a.a.setPlaybackToRemote(h1Var2.c());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r21 == ((c2.t) r19.s.n)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191 A[LOOP:5: B:77:0x018f->B:78:0x0191, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac A[LOOP:6: B:81:0x01aa->B:82:0x01ac, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(y yVar, t tVar) {
        boolean z10;
        int i10;
        int size;
        int size2;
        Iterator it;
        boolean z11;
        t tVar2 = yVar.e;
        ArrayList arrayList = yVar.b;
        if (tVar2 != tVar) {
            yVar.e = tVar;
            ArrayList arrayList2 = this.j;
            b bVar = this.a;
            if (tVar != null) {
                List list = (List) tVar.c;
                int size3 = list.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    n nVar = (n) list.get(i11);
                    if (nVar != null && nVar.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i12 = 0;
                boolean z12 = false;
                while (it2.hasNext()) {
                    n nVar2 = (n) it2.next();
                    if (nVar2 == null || !nVar2.e()) {
                        it = it2;
                        z11 = z12;
                        Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + nVar2);
                    } else {
                        String d = nVar2.d();
                        int size4 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size4) {
                                i13 = -1;
                                break;
                            } else if (((z) arrayList.get(i13)).b.equals(d)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 < 0) {
                            it = it2;
                            z11 = z12;
                            z zVar = new z(yVar, d, b(yVar, d), nVar2.a.getBoolean("isSystemRoute", false));
                            int i14 = i12 + 1;
                            arrayList.add(i12, zVar);
                            arrayList2.add(zVar);
                            if (nVar2.c().isEmpty()) {
                                zVar.i(nVar2);
                                bVar.b(257, zVar);
                            } else {
                                arrayList3.add(new q0.b(zVar, nVar2));
                            }
                            i12 = i14;
                        } else {
                            it = it2;
                            z11 = z12;
                            if (i13 < i12) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + nVar2);
                            } else {
                                z zVar2 = (z) arrayList.get(i13);
                                int i15 = i12 + 1;
                                Collections.swap(arrayList, i13, i12);
                                if (!nVar2.c().isEmpty()) {
                                    arrayList4.add(new q0.b(zVar2, nVar2));
                                } else if (n(zVar2, nVar2) != 0 && zVar2 == this.d) {
                                    i12 = i15;
                                    z11 = true;
                                }
                                i12 = i15;
                            }
                        }
                    }
                    it2 = it;
                    z12 = z11;
                }
                boolean z13 = z12;
                int i16 = 0;
                int size5 = arrayList3.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj = arrayList3.get(i17);
                    i17++;
                    q0.b bVar2 = (q0.b) obj;
                    z zVar3 = (z) bVar2.a;
                    zVar3.i((n) bVar2.b);
                    bVar.b(257, zVar3);
                }
                int size6 = arrayList4.size();
                boolean z14 = z13;
                while (i16 < size6) {
                    Object obj2 = arrayList4.get(i16);
                    i16++;
                    q0.b bVar3 = (q0.b) obj2;
                    z zVar4 = (z) bVar3.a;
                    if (n(zVar4, (n) bVar3.b) != 0 && zVar4 == this.d) {
                        z14 = true;
                    }
                }
                z10 = z14;
                i10 = i12;
                for (size = arrayList.size() - 1; size >= i10; size--) {
                    z zVar5 = (z) arrayList.get(size);
                    zVar5.i(null);
                    arrayList2.remove(zVar5);
                }
                o(z10);
                for (size2 = arrayList.size() - 1; size2 >= i10; size2--) {
                    bVar.b(258, (z) arrayList.remove(size2));
                }
                bVar.b(515, yVar);
            }
            z10 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + tVar);
            i10 = 0;
            while (size >= i10) {
            }
            o(z10);
            while (size2 >= i10) {
            }
            bVar.b(515, yVar);
        }
    }

    public final int n(z zVar, n nVar) {
        int i10 = zVar.i(nVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.a;
            if (i11 != 0) {
                bVar.b(259, zVar);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, zVar);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, zVar);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        z zVar = this.v;
        if (zVar != null && !zVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        z zVar2 = this.v;
        o0 o0Var = this.s;
        ArrayList arrayList = this.j;
        if (zVar2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                z zVar3 = (z) obj;
                if (zVar3.c() == o0Var && zVar3.b.equals("DEFAULT_ROUTE") && zVar3.f()) {
                    this.v = zVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        z zVar4 = this.w;
        if (zVar4 != null && !zVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.w);
            this.w = null;
        }
        if (this.w == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                z zVar5 = (z) obj2;
                if (zVar5.c() == o0Var && zVar5.m("android.media.intent.category.LIVE_AUDIO") && !zVar5.m("android.media.intent.category.LIVE_VIDEO") && zVar5.f()) {
                    this.w = zVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        z zVar6 = this.d;
        if (zVar6 == null || !zVar6.g) {
            Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
            j(c(), 0);
            return;
        }
        if (z10) {
            g();
            l();
        }
    }
}

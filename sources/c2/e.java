package c2;

import ag.o1;
import ag.q1;
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
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public o A;
    public int B;
    public androidx.biometric.e C;
    public android.support.v4.media.session.d0 D;
    public final o1 E;
    public final b1 c;
    public b0 d;
    public s e;
    public com.google.android.gms.internal.cast.p f;
    public z g;
    public final Context h;
    public final a4.k n;
    public final ha.c o;
    public final boolean p;
    public final boolean q;
    public l r;
    public final q0 s;
    public final e0 t;
    public g0 u;
    public b0 v;
    public b0 w;
    public b0 x;
    public r y;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context) {
        boolean z10;
        t tVar;
        b1 b1Var;
        a4.k kVar = new a4.k();
        kVar.c = 0;
        kVar.d = 3;
        this.n = kVar;
        this.o = new ha.c(this, 8);
        this.E = new o1(this, 5);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            int i11 = l0.a;
            Intent intent = new Intent(context, (Class<?>) l0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z10 = true;
                this.q = z10;
                int i12 = c1.a;
                Intent intent2 = new Intent(context, (Class<?>) c1.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i10 >= 30 || !z10) ? null : new l(context, new za.c(this, 6));
                q0 m0Var = i10 < 24 ? new m0(context, this) : new q0(context, this);
                this.s = m0Var;
                this.t = new e0(new a4.g(this, 22));
                a(m0Var, true);
                tVar = this.r;
                if (tVar != null) {
                    a(tVar, true);
                }
                b1Var = new b1(context, this);
                this.c = b1Var;
                Handler handler = (Handler) b1Var.d;
                if (b1Var.a) {
                    b1Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) b1Var.b).registerReceiver((af.c) b1Var.g, intentFilter, null, handler);
                    handler.post((q1) b1Var.h);
                    return;
                }
                return;
            }
        }
        z10 = false;
        this.q = z10;
        int i122 = c1.a;
        Intent intent22 = new Intent(context, (Class<?>) c1.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i10 >= 30 || !z10) ? null : new l(context, new za.c(this, 6));
        if (i10 < 24) {
        }
        this.s = m0Var;
        this.t = new e0(new a4.g(this, 22));
        a(m0Var, true);
        tVar = this.r;
        if (tVar != null) {
        }
        b1Var = new b1(context, this);
        this.c = b1Var;
        Handler handler2 = (Handler) b1Var.d;
        if (b1Var.a) {
        }
    }

    public final void a(t tVar, boolean z10) {
        if (d(tVar) == null) {
            a0 a0Var = new a0(tVar, z10);
            this.l.add(a0Var);
            this.a.b(513, a0Var);
            m(a0Var, (u) tVar.n);
            d0.b();
            tVar.f = this.o;
            tVar.h(this.z);
        }
    }

    public final String b(a0 a0Var, String str) {
        String flattenToShortString = ((ComponentName) a0Var.d.b).flattenToShortString();
        boolean z10 = a0Var.c;
        String y8 = z10 ? str : a4.w.y(flattenToShortString, ":", str);
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
                if (((b0) arrayList.get(i10)).c.equals(y8)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", th.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = y8 + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        if (((b0) arrayList.get(i12)).c.equals(str2)) {
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
        hashMap.put(new q0.b(flattenToShortString, str), y8);
        return y8;
    }

    public final b0 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b0 b0Var = (b0) obj;
            if (b0Var != this.v && b0Var.c() == this.s && b0Var.m("android.media.intent.category.LIVE_AUDIO") && !b0Var.m("android.media.intent.category.LIVE_VIDEO") && b0Var.f()) {
                return b0Var;
            }
        }
        return this.v;
    }

    public final a0 d(t tVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var.a == tVar) {
                return a0Var;
            }
        }
        return null;
    }

    public final b0 e() {
        b0 b0Var = this.d;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        g0 g0Var = this.u;
        return g0Var == null || g0Var.b;
    }

    public final void g() {
        if (this.d.e()) {
            List<b0> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((b0) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    s sVar = (s) entry.getValue();
                    sVar.h(0);
                    sVar.d();
                    it2.remove();
                }
            }
            for (b0 b0Var : unmodifiableList) {
                if (!hashMap.containsKey(b0Var.c)) {
                    s e10 = b0Var.c().e(b0Var.b, this.d.b);
                    e10.e();
                    hashMap.put(b0Var.c, e10);
                }
            }
        }
    }

    public final void h(e eVar, b0 b0Var, s sVar, int i10, b0 b0Var2, Collection collection) {
        com.google.android.gms.internal.cast.p pVar;
        z zVar = this.g;
        if (zVar != null) {
            zVar.a();
            this.g = null;
        }
        z zVar2 = new z(eVar, b0Var, sVar, i10, b0Var2, collection);
        this.g = zVar2;
        if (zVar2.b != 3 || (pVar = this.f) == null) {
            zVar2.b();
            return;
        }
        b0 b0Var3 = this.d;
        b0 b0Var4 = (b0) zVar2.g;
        int i11 = 1;
        com.google.android.gms.internal.cast.p.c.b("Prepare transfer from Route(%s) to Route(%s)", b0Var3, b0Var4);
        c0.i iVar = new c0.i();
        iVar.c = new c0.l();
        c0.k kVar = new c0.k(iVar);
        c0.j jVar = kVar.b;
        iVar.b = kVar;
        iVar.a = com.google.android.gms.internal.cast.o.class;
        try {
            iVar.a = Boolean.valueOf(pVar.b.post(new p(pVar, b0Var3, b0Var4, iVar, false, 2)));
        } catch (Exception e10) {
            jVar.l(e10);
        }
        z zVar3 = this.g;
        e eVar2 = (e) ((WeakReference) zVar3.j).get();
        if (eVar2 == null || eVar2.g != zVar3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            zVar3.a();
        } else {
            if (((c0.k) zVar3.k) != null) {
                throw new IllegalStateException("future is already set");
            }
            zVar3.k = kVar;
            a4.g gVar = new a4.g(zVar3, 24);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            jVar.c(gVar, new f(bVar, i11));
        }
    }

    public final void i(b0 b0Var, int i10) {
        if (!this.j.contains(b0Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + b0Var);
        } else {
            if (!b0Var.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + b0Var);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                t c3 = b0Var.c();
                l lVar = this.r;
                if (c3 == lVar && this.d != b0Var) {
                    lVar.s(b0Var.b);
                    return;
                }
            }
            j(b0Var, i10);
        }
    }

    public final void j(b0 b0Var, int i10) {
        u uVar;
        if (this.d == b0Var) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            r rVar = this.y;
            if (rVar != null) {
                rVar.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (uVar = b0Var.a.e) != null && uVar.b) {
            r c3 = b0Var.c().c(b0Var.b);
            if (c3 != null) {
                Executor e10 = f0.e.e(this.h);
                o1 o1Var = this.E;
                synchronized (c3.a) {
                    try {
                        if (e10 == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (o1Var == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c3.b = e10;
                        c3.c = o1Var;
                        ArrayList arrayList = c3.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            n nVar = c3.d;
                            ArrayList arrayList2 = c3.e;
                            c3.d = null;
                            c3.e = null;
                            c3.b.execute(new p(c3, o1Var, nVar, arrayList2, 0));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.x = b0Var;
                this.y = c3;
                c3.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + b0Var);
        }
        s d = b0Var.c().d(b0Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, b0Var, d, i10, null, null);
            return;
        }
        this.d = b0Var;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(262, new q0.b(null, b0Var));
        obtainMessage.arg1 = i10;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x014c, code lost:
    
        if (r26.A.b() == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        long j10;
        v vVar;
        ArrayList arrayList;
        v vVar2 = new v();
        e0 e0Var = this.t;
        long j11 = 0;
        e0Var.b = 0L;
        e0Var.a = false;
        e0Var.c = SystemClock.elapsedRealtime();
        ((Handler) e0Var.d).removeCallbacks((a4.g) e0Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.p;
            if (size < 0) {
                v vVar3 = vVar2;
                long j12 = j11;
                e0 e0Var2 = this.t;
                if (e0Var2.a) {
                    long j13 = e0Var2.b;
                    if (j13 > j12) {
                        ((Handler) e0Var2.d).postDelayed((a4.g) e0Var2.e, j13);
                    }
                }
                boolean z12 = e0Var2.a;
                this.B = i10;
                w a2 = z10 ? vVar3.a() : w.c;
                w a10 = vVar3.a();
                if (f()) {
                    o oVar = this.A;
                    if (oVar != null) {
                        oVar.a();
                        if (oVar.b.equals(a10)) {
                        }
                    }
                    if (!a10.d() || z12) {
                        this.A = new o(a10, z12);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                o oVar2 = this.z;
                if (oVar2 != null) {
                    oVar2.a();
                    if (oVar2.b.equals(a2) && this.z.b() == z12) {
                        return;
                    }
                }
                if (!a2.d() || z12) {
                    this.z = new o(a2, z12);
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
                    t tVar = ((a0) obj).a;
                    if (tVar != this.r) {
                        tVar.h(this.z);
                    }
                }
                return;
            }
            d0 d0Var = (d0) ((WeakReference) arrayList2.get(size)).get();
            if (d0Var == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList4 = d0Var.b;
                int size3 = arrayList4.size();
                i10 += size3;
                int i12 = 0;
                while (i12 < size3) {
                    y yVar = (y) arrayList4.get(i12);
                    w wVar = yVar.c;
                    if (wVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c3 = wVar.c();
                    if (c3.isEmpty()) {
                        j10 = j11;
                    } else {
                        int size4 = c3.size();
                        j10 = j11;
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj2 = c3.get(i13);
                            i13++;
                            String str = (String) obj2;
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (vVar2.a == null) {
                                vVar2.a = new ArrayList();
                            }
                            if (!vVar2.a.contains(str)) {
                                vVar2.a.add(str);
                            }
                        }
                    }
                    boolean z13 = (yVar.d & 1) != 0;
                    long j14 = yVar.e;
                    e0 e0Var3 = this.t;
                    if (z13) {
                        vVar = vVar2;
                        arrayList = arrayList2;
                        long j15 = e0Var3.c;
                        if (j15 - j14 < 30000) {
                            e0Var3.b = Math.max(e0Var3.b, (j14 + 30000) - j15);
                            e0Var3.a = true;
                        }
                    } else {
                        e0Var3.getClass();
                        vVar = vVar2;
                        arrayList = arrayList2;
                    }
                    if (z13) {
                        z10 = true;
                    }
                    int i14 = yVar.d;
                    if ((i14 & 4) != 0 && !z11) {
                        z10 = true;
                    }
                    if ((i14 & 8) != 0) {
                        z10 = true;
                    }
                    i12++;
                    j11 = j10;
                    vVar2 = vVar;
                    arrayList2 = arrayList;
                }
            }
            j11 = j11;
            vVar2 = vVar2;
            arrayList2 = arrayList2;
        }
    }

    public final void l() {
        b0 b0Var = this.d;
        if (b0Var == null) {
            androidx.biometric.e eVar = this.C;
            if (eVar != null) {
                eVar.g();
                return;
            }
            return;
        }
        int i10 = b0Var.p;
        a4.k kVar = this.n;
        kVar.a = i10;
        kVar.b = b0Var.q;
        kVar.c = (!b0Var.e() || d0.g()) ? b0Var.o : 0;
        kVar.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            kVar.e = l.p(this.e);
        } else {
            kVar.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        androidx.biometric.e eVar2 = this.C;
        if (eVar2 != null) {
            b0 b0Var2 = this.d;
            b0 b0Var3 = this.v;
            if (b0Var3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (b0Var2 == b0Var3 || b0Var2 == this.w) {
                eVar2.g();
                return;
            }
            int i11 = kVar.c == 1 ? 2 : 0;
            int i12 = kVar.b;
            int i13 = kVar.a;
            String str = (String) kVar.e;
            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) eVar2.b;
            if (d0Var != null) {
                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) eVar2.c;
                if (oVar != null && i11 == 0 && i12 == 0) {
                    oVar.c = i13;
                    y1.g.a(oVar.c(), i13);
                    return;
                }
                androidx.emoji2.text.o oVar2 = new androidx.emoji2.text.o();
                oVar2.f = eVar2;
                oVar2.a = i11;
                oVar2.b = i12;
                oVar2.c = i13;
                oVar2.d = str;
                eVar2.c = oVar2;
                d0Var.a.a.setPlaybackToRemote(oVar2.c());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r21 == ((c2.u) r19.s.n)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191 A[LOOP:5: B:77:0x018f->B:78:0x0191, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac A[LOOP:6: B:81:0x01aa->B:82:0x01ac, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(a0 a0Var, u uVar) {
        boolean z10;
        int i10;
        int size;
        int size2;
        Iterator it;
        boolean z11;
        u uVar2 = a0Var.e;
        ArrayList arrayList = a0Var.b;
        if (uVar2 != uVar) {
            a0Var.e = uVar;
            ArrayList arrayList2 = this.j;
            b bVar = this.a;
            if (uVar != null) {
                List list = (List) uVar.c;
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
                            } else if (((b0) arrayList.get(i13)).b.equals(d)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 < 0) {
                            it = it2;
                            z11 = z12;
                            b0 b0Var = new b0(a0Var, d, b(a0Var, d), nVar2.a.getBoolean("isSystemRoute", false));
                            int i14 = i12 + 1;
                            arrayList.add(i12, b0Var);
                            arrayList2.add(b0Var);
                            if (nVar2.c().isEmpty()) {
                                b0Var.i(nVar2);
                                bVar.b(257, b0Var);
                            } else {
                                arrayList3.add(new q0.b(b0Var, nVar2));
                            }
                            i12 = i14;
                        } else {
                            it = it2;
                            z11 = z12;
                            if (i13 < i12) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + nVar2);
                            } else {
                                b0 b0Var2 = (b0) arrayList.get(i13);
                                int i15 = i12 + 1;
                                Collections.swap(arrayList, i13, i12);
                                if (!nVar2.c().isEmpty()) {
                                    arrayList4.add(new q0.b(b0Var2, nVar2));
                                } else if (n(b0Var2, nVar2) != 0 && b0Var2 == this.d) {
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
                    b0 b0Var3 = (b0) bVar2.a;
                    b0Var3.i((n) bVar2.b);
                    bVar.b(257, b0Var3);
                }
                int size6 = arrayList4.size();
                boolean z14 = z13;
                while (i16 < size6) {
                    Object obj2 = arrayList4.get(i16);
                    i16++;
                    q0.b bVar3 = (q0.b) obj2;
                    b0 b0Var4 = (b0) bVar3.a;
                    if (n(b0Var4, (n) bVar3.b) != 0 && b0Var4 == this.d) {
                        z14 = true;
                    }
                }
                z10 = z14;
                i10 = i12;
                for (size = arrayList.size() - 1; size >= i10; size--) {
                    b0 b0Var5 = (b0) arrayList.get(size);
                    b0Var5.i(null);
                    arrayList2.remove(b0Var5);
                }
                o(z10);
                for (size2 = arrayList.size() - 1; size2 >= i10; size2--) {
                    bVar.b(258, (b0) arrayList.remove(size2));
                }
                bVar.b(515, a0Var);
            }
            z10 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + uVar);
            i10 = 0;
            while (size >= i10) {
            }
            o(z10);
            while (size2 >= i10) {
            }
            bVar.b(515, a0Var);
        }
    }

    public final int n(b0 b0Var, n nVar) {
        int i10 = b0Var.i(nVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.a;
            if (i11 != 0) {
                bVar.b(259, b0Var);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, b0Var);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, b0Var);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        b0 b0Var = this.v;
        if (b0Var != null && !b0Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        b0 b0Var2 = this.v;
        q0 q0Var = this.s;
        ArrayList arrayList = this.j;
        if (b0Var2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                b0 b0Var3 = (b0) obj;
                if (b0Var3.c() == q0Var && b0Var3.b.equals("DEFAULT_ROUTE") && b0Var3.f()) {
                    this.v = b0Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        b0 b0Var4 = this.w;
        if (b0Var4 != null && !b0Var4.f()) {
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
                b0 b0Var5 = (b0) obj2;
                if (b0Var5.c() == q0Var && b0Var5.m("android.media.intent.category.LIVE_AUDIO") && !b0Var5.m("android.media.intent.category.LIVE_VIDEO") && b0Var5.f()) {
                    this.w = b0Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        b0 b0Var6 = this.d;
        if (b0Var6 == null || !b0Var6.g) {
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

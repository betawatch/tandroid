package c2;

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
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public o A;
    public int B;
    public a5.m C;
    public android.support.v4.media.session.d0 D;
    public final xa.c E;
    public final a1 c;
    public a0 d;
    public r e;
    public com.google.android.gms.internal.cast.p f;
    public y g;
    public final Context h;
    public final b1 n;
    public final k5.i o;
    public final boolean p;
    public final boolean q;
    public l r;
    public final p0 s;
    public final d0 t;
    public f0 u;
    public a0 v;
    public a0 w;
    public a0 x;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context) {
        boolean z10;
        s sVar;
        a1 a1Var;
        b1 b1Var = new b1();
        b1Var.c = 0;
        b1Var.d = 3;
        this.n = b1Var;
        int i9 = 6;
        this.o = new k5.i(this, i9);
        this.E = new xa.c(this, 7);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            int i11 = k0.a;
            Intent intent = new Intent(context, (Class<?>) k0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z10 = true;
                this.q = z10;
                int i12 = c1.a;
                Intent intent2 = new Intent(context, (Class<?>) c1.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i10 >= 30 || !z10) ? null : new l(context, new fa.c(this, i9));
                p0 l0Var = i10 < 24 ? new l0(context, this) : new p0(context, this);
                this.s = l0Var;
                this.t = new d0(new af.e(this, 16));
                a(l0Var, true);
                sVar = this.r;
                if (sVar != null) {
                    a(sVar, true);
                }
                a1Var = new a1(context, this);
                this.c = a1Var;
                Handler handler = (Handler) a1Var.d;
                if (a1Var.a) {
                    a1Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) a1Var.b).registerReceiver((androidx.mediarouter.app.h) a1Var.g, intentFilter, null, handler);
                    handler.post((androidx.activity.i) a1Var.h);
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
        this.r = (i10 >= 30 || !z10) ? null : new l(context, new fa.c(this, i9));
        if (i10 < 24) {
        }
        this.s = l0Var;
        this.t = new d0(new af.e(this, 16));
        a(l0Var, true);
        sVar = this.r;
        if (sVar != null) {
        }
        a1Var = new a1(context, this);
        this.c = a1Var;
        Handler handler2 = (Handler) a1Var.d;
        if (a1Var.a) {
        }
    }

    public final void a(s sVar, boolean z10) {
        if (d(sVar) == null) {
            z zVar = new z(sVar, z10);
            this.l.add(zVar);
            this.a.b(513, zVar);
            m(zVar, (t) sVar.n);
            c0.b();
            sVar.f = this.o;
            sVar.h(this.z);
        }
    }

    public final String b(z zVar, String str) {
        String flattenToShortString = ((ComponentName) zVar.d.b).flattenToShortString();
        boolean z10 = zVar.c;
        String z11 = z10 ? str : aa.d.z(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z10) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    i9 = -1;
                    break;
                }
                if (((a0) arrayList.get(i9)).c.equals(z11)) {
                    break;
                }
                i9++;
            }
            if (i9 >= 0) {
                Log.w("GlobalMediaRouter", j2.h("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = z11 + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            i11 = -1;
                            break;
                        }
                        if (((a0) arrayList.get(i11)).c.equals(str2)) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 < 0) {
                        hashMap.put(new q0.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i10++;
                }
            }
        }
        hashMap.put(new q0.b(flattenToShortString, str), z11);
        return z11;
    }

    public final a0 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            a0 a0Var = (a0) obj;
            if (a0Var != this.v && a0Var.c() == this.s && a0Var.m("android.media.intent.category.LIVE_AUDIO") && !a0Var.m("android.media.intent.category.LIVE_VIDEO") && a0Var.f()) {
                return a0Var;
            }
        }
        return this.v;
    }

    public final z d(s sVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            z zVar = (z) obj;
            if (zVar.a == sVar) {
                return zVar;
            }
        }
        return null;
    }

    public final a0 e() {
        a0 a0Var = this.d;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        f0 f0Var = this.u;
        return f0Var == null || f0Var.b;
    }

    public final void g() {
        if (this.d.e()) {
            List<a0> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((a0) it.next()).c);
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
            for (a0 a0Var : unmodifiableList) {
                if (!hashMap.containsKey(a0Var.c)) {
                    r e10 = a0Var.c().e(a0Var.b, this.d.b);
                    e10.e();
                    hashMap.put(a0Var.c, e10);
                }
            }
        }
    }

    public final void h(e eVar, a0 a0Var, r rVar, int i9, a0 a0Var2, Collection collection) {
        com.google.android.gms.internal.cast.p pVar;
        y yVar = this.g;
        if (yVar != null) {
            yVar.a();
            this.g = null;
        }
        y yVar2 = new y(eVar, a0Var, rVar, i9, a0Var2, collection);
        this.g = yVar2;
        if (yVar2.b != 3 || (pVar = this.f) == null) {
            yVar2.b();
            return;
        }
        a0 a0Var3 = this.d;
        a0 a0Var4 = (a0) yVar2.g;
        int i10 = 1;
        com.google.android.gms.internal.cast.p.c.b("Prepare transfer from Route(%s) to Route(%s)", a0Var3, a0Var4);
        c0.i iVar = new c0.i();
        iVar.c = new c0.l();
        c0.k kVar = new c0.k(iVar);
        c0.j jVar = kVar.b;
        iVar.b = kVar;
        iVar.a = com.google.android.gms.internal.cast.o.class;
        try {
            iVar.a = Boolean.valueOf(pVar.b.post(new af.f(pVar, a0Var3, a0Var4, iVar, false, 3)));
        } catch (Exception e10) {
            jVar.l(e10);
        }
        y yVar3 = this.g;
        e eVar2 = (e) ((WeakReference) yVar3.j).get();
        if (eVar2 == null || eVar2.g != yVar3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            yVar3.a();
        } else {
            if (((c0.k) yVar3.k) != null) {
                throw new IllegalStateException("future is already set");
            }
            yVar3.k = kVar;
            af.e eVar3 = new af.e(yVar3, 18);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            jVar.c(eVar3, new f(bVar, i10));
        }
    }

    public final void i(a0 a0Var, int i9) {
        if (!this.j.contains(a0Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + a0Var);
        } else {
            if (!a0Var.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + a0Var);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                s c10 = a0Var.c();
                l lVar = this.r;
                if (c10 == lVar && this.d != a0Var) {
                    lVar.s(a0Var.b);
                    return;
                }
            }
            j(a0Var, i9);
        }
    }

    public final void j(a0 a0Var, int i9) {
        t tVar;
        if (this.d == a0Var) {
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
        if (f() && (tVar = a0Var.a.e) != null && tVar.b) {
            q c10 = a0Var.c().c(a0Var.b);
            if (c10 != null) {
                Executor e10 = f0.e.e(this.h);
                xa.c cVar = this.E;
                synchronized (c10.a) {
                    try {
                        if (e10 == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (cVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c10.b = e10;
                        c10.c = cVar;
                        ArrayList arrayList = c10.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            n nVar = c10.d;
                            ArrayList arrayList2 = c10.e;
                            c10.d = null;
                            c10.e = null;
                            c10.b.execute(new af.f(c10, cVar, nVar, arrayList2, 1));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.x = a0Var;
                this.y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + a0Var);
        }
        r d = a0Var.c().d(a0Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, a0Var, d, i9, null, null);
            return;
        }
        this.d = a0Var;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(262, new q0.b(null, a0Var));
        obtainMessage.arg1 = i9;
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
        u uVar;
        ArrayList arrayList;
        u uVar2 = new u();
        d0 d0Var = this.t;
        long j11 = 0;
        d0Var.b = 0L;
        d0Var.a = false;
        d0Var.c = SystemClock.elapsedRealtime();
        ((Handler) d0Var.d).removeCallbacks((af.e) d0Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i9 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.p;
            if (size < 0) {
                u uVar3 = uVar2;
                long j12 = j11;
                d0 d0Var2 = this.t;
                if (d0Var2.a) {
                    long j13 = d0Var2.b;
                    if (j13 > j12) {
                        ((Handler) d0Var2.d).postDelayed((af.e) d0Var2.e, j13);
                    }
                }
                boolean z12 = d0Var2.a;
                this.B = i9;
                v a2 = z10 ? uVar3.a() : v.c;
                v a3 = uVar3.a();
                if (f()) {
                    o oVar = this.A;
                    if (oVar != null) {
                        oVar.a();
                        if (oVar.b.equals(a3)) {
                        }
                    }
                    if (!a3.d() || z12) {
                        this.A = new o(a3, z12);
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
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    s sVar = ((z) obj).a;
                    if (sVar != this.r) {
                        sVar.h(this.z);
                    }
                }
                return;
            }
            c0 c0Var = (c0) ((WeakReference) arrayList2.get(size)).get();
            if (c0Var == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList4 = c0Var.b;
                int size3 = arrayList4.size();
                i9 += size3;
                int i11 = 0;
                while (i11 < size3) {
                    x xVar = (x) arrayList4.get(i11);
                    v vVar = xVar.c;
                    if (vVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c10 = vVar.c();
                    if (c10.isEmpty()) {
                        j10 = j11;
                    } else {
                        int size4 = c10.size();
                        j10 = j11;
                        int i12 = 0;
                        while (i12 < size4) {
                            Object obj2 = c10.get(i12);
                            i12++;
                            String str = (String) obj2;
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (uVar2.a == null) {
                                uVar2.a = new ArrayList();
                            }
                            if (!uVar2.a.contains(str)) {
                                uVar2.a.add(str);
                            }
                        }
                    }
                    boolean z13 = (xVar.d & 1) != 0;
                    long j14 = xVar.e;
                    d0 d0Var3 = this.t;
                    if (z13) {
                        uVar = uVar2;
                        arrayList = arrayList2;
                        long j15 = d0Var3.c;
                        if (j15 - j14 < 30000) {
                            d0Var3.b = Math.max(d0Var3.b, (j14 + 30000) - j15);
                            d0Var3.a = true;
                        }
                    } else {
                        d0Var3.getClass();
                        uVar = uVar2;
                        arrayList = arrayList2;
                    }
                    if (z13) {
                        z10 = true;
                    }
                    int i13 = xVar.d;
                    if ((i13 & 4) != 0 && !z11) {
                        z10 = true;
                    }
                    if ((i13 & 8) != 0) {
                        z10 = true;
                    }
                    i11++;
                    j11 = j10;
                    uVar2 = uVar;
                    arrayList2 = arrayList;
                }
            }
            j11 = j11;
            uVar2 = uVar2;
            arrayList2 = arrayList2;
        }
    }

    public final void l() {
        a0 a0Var = this.d;
        if (a0Var == null) {
            a5.m mVar = this.C;
            if (mVar != null) {
                mVar.g();
                return;
            }
            return;
        }
        int i9 = a0Var.p;
        b1 b1Var = this.n;
        b1Var.a = i9;
        b1Var.b = a0Var.q;
        b1Var.c = (!a0Var.e() || c0.g()) ? a0Var.o : 0;
        b1Var.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            b1Var.e = l.p(this.e);
        } else {
            b1Var.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        a5.m mVar2 = this.C;
        if (mVar2 != null) {
            a0 a0Var2 = this.d;
            a0 a0Var3 = this.v;
            if (a0Var3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (a0Var2 == a0Var3 || a0Var2 == this.w) {
                mVar2.g();
                return;
            }
            int i10 = b1Var.c == 1 ? 2 : 0;
            int i11 = b1Var.b;
            int i12 = b1Var.a;
            String str = (String) b1Var.e;
            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) mVar2.b;
            if (d0Var != null) {
                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) mVar2.c;
                if (oVar != null && i10 == 0 && i11 == 0) {
                    oVar.c = i12;
                    y1.g.a(oVar.c(), i12);
                    return;
                }
                androidx.emoji2.text.o oVar2 = new androidx.emoji2.text.o();
                oVar2.f = mVar2;
                oVar2.a = i10;
                oVar2.b = i11;
                oVar2.c = i12;
                oVar2.d = str;
                mVar2.c = oVar2;
                d0Var.a.a.setPlaybackToRemote(oVar2.c());
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
    public final void m(z zVar, t tVar) {
        boolean z10;
        int i9;
        int size;
        int size2;
        Iterator it;
        boolean z11;
        t tVar2 = zVar.e;
        ArrayList arrayList = zVar.b;
        if (tVar2 != tVar) {
            zVar.e = tVar;
            ArrayList arrayList2 = this.j;
            b bVar = this.a;
            if (tVar != null) {
                List list = (List) tVar.c;
                int size3 = list.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    n nVar = (n) list.get(i10);
                    if (nVar != null && nVar.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i11 = 0;
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
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size4) {
                                i12 = -1;
                                break;
                            } else if (((a0) arrayList.get(i12)).b.equals(d)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (i12 < 0) {
                            it = it2;
                            z11 = z12;
                            a0 a0Var = new a0(zVar, d, b(zVar, d), nVar2.a.getBoolean("isSystemRoute", false));
                            int i13 = i11 + 1;
                            arrayList.add(i11, a0Var);
                            arrayList2.add(a0Var);
                            if (nVar2.c().isEmpty()) {
                                a0Var.i(nVar2);
                                bVar.b(257, a0Var);
                            } else {
                                arrayList3.add(new q0.b(a0Var, nVar2));
                            }
                            i11 = i13;
                        } else {
                            it = it2;
                            z11 = z12;
                            if (i12 < i11) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + nVar2);
                            } else {
                                a0 a0Var2 = (a0) arrayList.get(i12);
                                int i14 = i11 + 1;
                                Collections.swap(arrayList, i12, i11);
                                if (!nVar2.c().isEmpty()) {
                                    arrayList4.add(new q0.b(a0Var2, nVar2));
                                } else if (n(a0Var2, nVar2) != 0 && a0Var2 == this.d) {
                                    i11 = i14;
                                    z11 = true;
                                }
                                i11 = i14;
                            }
                        }
                    }
                    it2 = it;
                    z12 = z11;
                }
                boolean z13 = z12;
                int i15 = 0;
                int size5 = arrayList3.size();
                int i16 = 0;
                while (i16 < size5) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    q0.b bVar2 = (q0.b) obj;
                    a0 a0Var3 = (a0) bVar2.a;
                    a0Var3.i((n) bVar2.b);
                    bVar.b(257, a0Var3);
                }
                int size6 = arrayList4.size();
                boolean z14 = z13;
                while (i15 < size6) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    q0.b bVar3 = (q0.b) obj2;
                    a0 a0Var4 = (a0) bVar3.a;
                    if (n(a0Var4, (n) bVar3.b) != 0 && a0Var4 == this.d) {
                        z14 = true;
                    }
                }
                z10 = z14;
                i9 = i11;
                for (size = arrayList.size() - 1; size >= i9; size--) {
                    a0 a0Var5 = (a0) arrayList.get(size);
                    a0Var5.i(null);
                    arrayList2.remove(a0Var5);
                }
                o(z10);
                for (size2 = arrayList.size() - 1; size2 >= i9; size2--) {
                    bVar.b(258, (a0) arrayList.remove(size2));
                }
                bVar.b(515, zVar);
            }
            z10 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + tVar);
            i9 = 0;
            while (size >= i9) {
            }
            o(z10);
            while (size2 >= i9) {
            }
            bVar.b(515, zVar);
        }
    }

    public final int n(a0 a0Var, n nVar) {
        int i9 = a0Var.i(nVar);
        if (i9 != 0) {
            int i10 = i9 & 1;
            b bVar = this.a;
            if (i10 != 0) {
                bVar.b(259, a0Var);
            }
            if ((i9 & 2) != 0) {
                bVar.b(260, a0Var);
            }
            if ((i9 & 4) != 0) {
                bVar.b(261, a0Var);
            }
        }
        return i9;
    }

    public final void o(boolean z10) {
        a0 a0Var = this.v;
        if (a0Var != null && !a0Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        a0 a0Var2 = this.v;
        p0 p0Var = this.s;
        ArrayList arrayList = this.j;
        if (a0Var2 == null) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                Object obj = arrayList.get(i9);
                i9++;
                a0 a0Var3 = (a0) obj;
                if (a0Var3.c() == p0Var && a0Var3.b.equals("DEFAULT_ROUTE") && a0Var3.f()) {
                    this.v = a0Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        a0 a0Var4 = this.w;
        if (a0Var4 != null && !a0Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.w);
            this.w = null;
        }
        if (this.w == null) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                a0 a0Var5 = (a0) obj2;
                if (a0Var5.c() == p0Var && a0Var5.m("android.media.intent.category.LIVE_AUDIO") && !a0Var5.m("android.media.intent.category.LIVE_VIDEO") && a0Var5.f()) {
                    this.w = a0Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        a0 a0Var6 = this.d;
        if (a0Var6 == null || !a0Var6.g) {
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

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
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public o A;
    public int B;
    public androidx.biometric.e C;
    public android.support.v4.media.session.c0 D;
    public final androidx.biometric.f0 E;
    public final z0 c;
    public a0 d;
    public s e;
    public com.google.android.gms.internal.cast.o f;
    public y g;
    public final Context h;
    public final a1 n;
    public final ja.c o;
    public final boolean p;
    public final boolean q;
    public l r;
    public final p0 s;
    public final d0 t;
    public f0 u;
    public a0 v;
    public a0 w;
    public a0 x;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context) {
        boolean z4;
        t tVar;
        z0 z0Var;
        a1 a1Var = new a1();
        a1Var.c = 0;
        int i10 = 3;
        a1Var.d = 3;
        this.n = a1Var;
        this.o = new ja.c(this, i10);
        this.E = new androidx.biometric.f0(this, i10);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            int i12 = k0.a;
            Intent intent = new Intent(context, (Class<?>) k0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z4 = true;
                this.q = z4;
                int i13 = b1.a;
                Intent intent2 = new Intent(context, (Class<?>) b1.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i11 >= 30 || !z4) ? null : new l(context, new a3.c(this, 4));
                p0 l0Var = i11 < 24 ? new l0(context, this) : new p0(context, this);
                this.s = l0Var;
                this.t = new d0(new ag.d(this, 9));
                a(l0Var, true);
                tVar = this.r;
                if (tVar != null) {
                    a(tVar, true);
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
                    ((Context) z0Var.b).registerReceiver((androidx.mediarouter.app.h) z0Var.g, intentFilter, null, handler);
                    handler.post((androidx.activity.i) z0Var.h);
                    return;
                }
                return;
            }
        }
        z4 = false;
        this.q = z4;
        int i132 = b1.a;
        Intent intent22 = new Intent(context, (Class<?>) b1.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i11 >= 30 || !z4) ? null : new l(context, new a3.c(this, 4));
        if (i11 < 24) {
        }
        this.s = l0Var;
        this.t = new d0(new ag.d(this, 9));
        a(l0Var, true);
        tVar = this.r;
        if (tVar != null) {
        }
        z0Var = new z0(context, this);
        this.c = z0Var;
        Handler handler2 = (Handler) z0Var.d;
        if (z0Var.a) {
        }
    }

    public final void a(t tVar, boolean z4) {
        if (d(tVar) == null) {
            z zVar = new z(tVar, z4);
            this.l.add(zVar);
            this.a.b(513, zVar);
            m(zVar, (u) tVar.n);
            c0.b();
            tVar.f = this.o;
            tVar.h(this.z);
        }
    }

    public final String b(z zVar, String str) {
        String flattenToShortString = ((ComponentName) zVar.d.b).flattenToShortString();
        boolean z4 = zVar.c;
        String z10 = z4 ? str : android.support.v4.media.a.z(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z4) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                if (((a0) arrayList.get(i10)).c.equals(z10)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", yh.l("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = z10 + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        if (((a0) arrayList.get(i12)).c.equals(str2)) {
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
        hashMap.put(new q0.b(flattenToShortString, str), z10);
        return z10;
    }

    public final a0 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var != this.v && a0Var.c() == this.s && a0Var.m("android.media.intent.category.LIVE_AUDIO") && !a0Var.m("android.media.intent.category.LIVE_VIDEO") && a0Var.f()) {
                return a0Var;
            }
        }
        return this.v;
    }

    public final z d(t tVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z zVar = (z) obj;
            if (zVar.a == tVar) {
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
                    s sVar = (s) entry.getValue();
                    sVar.h(0);
                    sVar.d();
                    it2.remove();
                }
            }
            for (a0 a0Var : unmodifiableList) {
                if (!hashMap.containsKey(a0Var.c)) {
                    s e = a0Var.c().e(a0Var.b, this.d.b);
                    e.e();
                    hashMap.put(a0Var.c, e);
                }
            }
        }
    }

    public final void h(e eVar, a0 a0Var, s sVar, int i10, a0 a0Var2, Collection collection) {
        com.google.android.gms.internal.cast.o oVar;
        y yVar = this.g;
        if (yVar != null) {
            yVar.a();
            this.g = null;
        }
        y yVar2 = new y(eVar, a0Var, sVar, i10, a0Var2, collection);
        this.g = yVar2;
        if (yVar2.b != 3 || (oVar = this.f) == null) {
            yVar2.b();
            return;
        }
        a0 a0Var3 = this.d;
        a0 a0Var4 = (a0) yVar2.g;
        int i11 = 1;
        com.google.android.gms.internal.cast.o.c.b("Prepare transfer from Route(%s) to Route(%s)", a0Var3, a0Var4);
        c0.i iVar = new c0.i();
        iVar.c = new c0.l();
        c0.k kVar = new c0.k(iVar);
        c0.j jVar = kVar.b;
        iVar.b = kVar;
        iVar.a = com.google.android.gms.internal.cast.n.class;
        try {
            iVar.a = Boolean.valueOf(oVar.b.post(new p(oVar, a0Var3, a0Var4, iVar, false, 2)));
        } catch (Exception e) {
            jVar.l(e);
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
            ag.d dVar = new ag.d(yVar3, 11);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            jVar.c(dVar, new f(bVar, i11));
        }
    }

    public final void i(a0 a0Var, int i10) {
        if (!this.j.contains(a0Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + a0Var);
        } else {
            if (!a0Var.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + a0Var);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                t c3 = a0Var.c();
                l lVar = this.r;
                if (c3 == lVar && this.d != a0Var) {
                    lVar.s(a0Var.b);
                    return;
                }
            }
            j(a0Var, i10);
        }
    }

    public final void j(a0 a0Var, int i10) {
        u uVar;
        if (this.d == a0Var) {
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
        if (f() && (uVar = a0Var.a.e) != null && uVar.b) {
            r c3 = a0Var.c().c(a0Var.b);
            if (c3 != null) {
                Executor e = f0.f.e(this.h);
                androidx.biometric.f0 f0Var = this.E;
                synchronized (c3.a) {
                    try {
                        if (e == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (f0Var == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c3.b = e;
                        c3.c = f0Var;
                        ArrayList arrayList = c3.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            n nVar = c3.d;
                            ArrayList arrayList2 = c3.e;
                            c3.d = null;
                            c3.e = null;
                            c3.b.execute(new p(c3, f0Var, nVar, arrayList2, 0));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.x = a0Var;
                this.y = c3;
                c3.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + a0Var);
        }
        s d = a0Var.c().d(a0Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, a0Var, d, i10, null, null);
            return;
        }
        this.d = a0Var;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(262, new q0.b(null, a0Var));
        obtainMessage.arg1 = i10;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0153, code lost:
    
        if (r26.A.b() == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        long j10;
        androidx.biometric.f0 f0Var;
        ArrayList arrayList;
        androidx.biometric.f0 f0Var2 = new androidx.biometric.f0(4);
        d0 d0Var = this.t;
        long j11 = 0;
        d0Var.b = 0L;
        d0Var.a = false;
        d0Var.c = SystemClock.elapsedRealtime();
        ((Handler) d0Var.d).removeCallbacks((ag.d) d0Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i10 = 0;
        boolean z4 = false;
        while (true) {
            size--;
            boolean z10 = this.p;
            if (size < 0) {
                androidx.biometric.f0 f0Var3 = f0Var2;
                long j12 = j11;
                d0 d0Var2 = this.t;
                if (d0Var2.a) {
                    long j13 = d0Var2.b;
                    if (j13 > j12) {
                        ((Handler) d0Var2.d).postDelayed((ag.d) d0Var2.e, j13);
                    }
                }
                boolean z11 = d0Var2.a;
                this.B = i10;
                v b10 = z4 ? f0Var3.b() : v.c;
                v b11 = f0Var3.b();
                if (f()) {
                    o oVar = this.A;
                    if (oVar != null) {
                        oVar.a();
                        if (oVar.b.equals(b11)) {
                        }
                    }
                    if (!b11.d() || z11) {
                        this.A = new o(b11, z11);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                o oVar2 = this.z;
                if (oVar2 != null) {
                    oVar2.a();
                    if (oVar2.b.equals(b10) && this.z.b() == z11) {
                        return;
                    }
                }
                if (!b10.d() || z11) {
                    this.z = new o(b10, z11);
                } else if (this.z == null) {
                    return;
                } else {
                    this.z = null;
                }
                if (z4 && !z11 && z10) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList3 = this.l;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj = arrayList3.get(i11);
                    i11++;
                    t tVar = ((z) obj).a;
                    if (tVar != this.r) {
                        tVar.h(this.z);
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
                i10 += size3;
                int i12 = 0;
                while (i12 < size3) {
                    x xVar = (x) arrayList4.get(i12);
                    v vVar = xVar.c;
                    if (vVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c3 = vVar.c();
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
                            if (((ArrayList) f0Var2.b) == null) {
                                f0Var2.b = new ArrayList();
                            }
                            if (!((ArrayList) f0Var2.b).contains(str)) {
                                ((ArrayList) f0Var2.b).add(str);
                            }
                        }
                    }
                    boolean z12 = (xVar.d & 1) != 0;
                    long j14 = xVar.e;
                    d0 d0Var3 = this.t;
                    if (z12) {
                        f0Var = f0Var2;
                        arrayList = arrayList2;
                        long j15 = d0Var3.c;
                        if (j15 - j14 < 30000) {
                            d0Var3.b = Math.max(d0Var3.b, (j14 + 30000) - j15);
                            d0Var3.a = true;
                        }
                    } else {
                        d0Var3.getClass();
                        f0Var = f0Var2;
                        arrayList = arrayList2;
                    }
                    if (z12) {
                        z4 = true;
                    }
                    int i14 = xVar.d;
                    if ((i14 & 4) != 0 && !z10) {
                        z4 = true;
                    }
                    if ((i14 & 8) != 0) {
                        z4 = true;
                    }
                    i12++;
                    j11 = j10;
                    f0Var2 = f0Var;
                    arrayList2 = arrayList;
                }
            }
            j11 = j11;
            f0Var2 = f0Var2;
            arrayList2 = arrayList2;
        }
    }

    public final void l() {
        a0 a0Var = this.d;
        if (a0Var == null) {
            androidx.biometric.e eVar = this.C;
            if (eVar != null) {
                eVar.k();
                return;
            }
            return;
        }
        int i10 = a0Var.p;
        a1 a1Var = this.n;
        a1Var.a = i10;
        a1Var.b = a0Var.q;
        a1Var.c = (!a0Var.e() || c0.g()) ? a0Var.o : 0;
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
        androidx.biometric.e eVar2 = this.C;
        if (eVar2 != null) {
            a0 a0Var2 = this.d;
            a0 a0Var3 = this.v;
            if (a0Var3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (a0Var2 == a0Var3 || a0Var2 == this.w) {
                eVar2.k();
                return;
            }
            int i11 = a1Var.c == 1 ? 2 : 0;
            int i12 = a1Var.b;
            int i13 = a1Var.a;
            String str = (String) a1Var.e;
            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) eVar2.b;
            if (c0Var != null) {
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) eVar2.c;
                if (pVar != null && i11 == 0 && i12 == 0) {
                    pVar.c = i13;
                    y1.g.a(pVar.c(), i13);
                    return;
                }
                androidx.emoji2.text.p pVar2 = new androidx.emoji2.text.p();
                pVar2.f = eVar2;
                pVar2.a = i11;
                pVar2.b = i12;
                pVar2.c = i13;
                pVar2.d = str;
                eVar2.c = pVar2;
                c0Var.a.a.setPlaybackToRemote(pVar2.c());
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
    public final void m(z zVar, u uVar) {
        boolean z4;
        int i10;
        int size;
        int size2;
        Iterator it;
        boolean z10;
        u uVar2 = zVar.e;
        ArrayList arrayList = zVar.b;
        if (uVar2 != uVar) {
            zVar.e = uVar;
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
                boolean z11 = false;
                while (it2.hasNext()) {
                    n nVar2 = (n) it2.next();
                    if (nVar2 == null || !nVar2.e()) {
                        it = it2;
                        z10 = z11;
                        Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + nVar2);
                    } else {
                        String d = nVar2.d();
                        int size4 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size4) {
                                i13 = -1;
                                break;
                            } else if (((a0) arrayList.get(i13)).b.equals(d)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 < 0) {
                            it = it2;
                            z10 = z11;
                            a0 a0Var = new a0(zVar, d, b(zVar, d), nVar2.a.getBoolean("isSystemRoute", false));
                            int i14 = i12 + 1;
                            arrayList.add(i12, a0Var);
                            arrayList2.add(a0Var);
                            if (nVar2.c().isEmpty()) {
                                a0Var.i(nVar2);
                                bVar.b(257, a0Var);
                            } else {
                                arrayList3.add(new q0.b(a0Var, nVar2));
                            }
                            i12 = i14;
                        } else {
                            it = it2;
                            z10 = z11;
                            if (i13 < i12) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + nVar2);
                            } else {
                                a0 a0Var2 = (a0) arrayList.get(i13);
                                int i15 = i12 + 1;
                                Collections.swap(arrayList, i13, i12);
                                if (!nVar2.c().isEmpty()) {
                                    arrayList4.add(new q0.b(a0Var2, nVar2));
                                } else if (n(a0Var2, nVar2) != 0 && a0Var2 == this.d) {
                                    i12 = i15;
                                    z10 = true;
                                }
                                i12 = i15;
                            }
                        }
                    }
                    it2 = it;
                    z11 = z10;
                }
                boolean z12 = z11;
                int i16 = 0;
                int size5 = arrayList3.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj = arrayList3.get(i17);
                    i17++;
                    q0.b bVar2 = (q0.b) obj;
                    a0 a0Var3 = (a0) bVar2.a;
                    a0Var3.i((n) bVar2.b);
                    bVar.b(257, a0Var3);
                }
                int size6 = arrayList4.size();
                boolean z13 = z12;
                while (i16 < size6) {
                    Object obj2 = arrayList4.get(i16);
                    i16++;
                    q0.b bVar3 = (q0.b) obj2;
                    a0 a0Var4 = (a0) bVar3.a;
                    if (n(a0Var4, (n) bVar3.b) != 0 && a0Var4 == this.d) {
                        z13 = true;
                    }
                }
                z4 = z13;
                i10 = i12;
                for (size = arrayList.size() - 1; size >= i10; size--) {
                    a0 a0Var5 = (a0) arrayList.get(size);
                    a0Var5.i(null);
                    arrayList2.remove(a0Var5);
                }
                o(z4);
                for (size2 = arrayList.size() - 1; size2 >= i10; size2--) {
                    bVar.b(258, (a0) arrayList.remove(size2));
                }
                bVar.b(515, zVar);
            }
            z4 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + uVar);
            i10 = 0;
            while (size >= i10) {
            }
            o(z4);
            while (size2 >= i10) {
            }
            bVar.b(515, zVar);
        }
    }

    public final int n(a0 a0Var, n nVar) {
        int i10 = a0Var.i(nVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.a;
            if (i11 != 0) {
                bVar.b(259, a0Var);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, a0Var);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, a0Var);
            }
        }
        return i10;
    }

    public final void o(boolean z4) {
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
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
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
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
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
        if (z4) {
            g();
            l();
        }
    }
}

package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class q0 {
    public final n4.y a;
    public final oi.f b;
    public final s c;
    public boolean d = false;
    public int e = -1;

    public q0(n4.y yVar, oi.f fVar, s sVar) {
        this.a = yVar;
        this.b = fVar;
        this.c = sVar;
    }

    public final void a() {
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + sVar);
        }
        Bundle bundle = sVar.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        sVar.L.R();
        sVar.a = 3;
        sVar.U = false;
        sVar.w();
        if (!sVar.U) {
            throw new x0("Fragment " + sVar + " did not call through to super.onActivityCreated()");
        }
        if (k0.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + sVar);
        }
        sVar.b = null;
        l0 l0Var = sVar.L;
        l0Var.H = false;
        l0Var.I = false;
        l0Var.O.i = false;
        l0Var.u(4);
        this.a.j(sVar, false);
    }

    public final void b() {
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + sVar);
        }
        s sVar2 = sVar.h;
        q0 q0Var = null;
        oi.f fVar = this.b;
        if (sVar2 != null) {
            q0 q0Var2 = (q0) ((HashMap) fVar.b).get(sVar2.e);
            if (q0Var2 == null) {
                throw new IllegalStateException("Fragment " + sVar + " declared target fragment " + sVar.h + " that does not belong to this FragmentManager!");
            }
            sVar.n = sVar.h.e;
            sVar.h = null;
            q0Var = q0Var2;
        } else {
            String str = sVar.n;
            if (str != null && (q0Var = (q0) ((HashMap) fVar.b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(sVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(a4.a.s(sb2, sVar.n, " that does not belong to this FragmentManager!"));
            }
        }
        if (q0Var != null) {
            q0Var.j();
        }
        k0 k0Var = sVar.J;
        sVar.K = k0Var.w;
        sVar.M = k0Var.y;
        n4.y yVar = this.a;
        yVar.w(sVar, false);
        ArrayList arrayList = sVar.h0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((q) obj).a();
        }
        arrayList.clear();
        sVar.L.b(sVar.K, sVar.h(), sVar);
        sVar.a = 0;
        sVar.U = false;
        sVar.y(sVar.K.b);
        if (!sVar.U) {
            throw new x0("Fragment " + sVar + " did not call through to super.onAttach()");
        }
        Iterator it = sVar.J.p.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).a();
        }
        l0 l0Var = sVar.L;
        l0Var.H = false;
        l0Var.I = false;
        l0Var.O.i = false;
        l0Var.u(0);
        yVar.k(sVar, false);
    }

    public final int c() {
        l lVar;
        Object obj;
        Object obj2;
        s sVar = this.c;
        if (sVar.J == null) {
            return sVar.a;
        }
        int i10 = this.e;
        int ordinal = sVar.c0.ordinal();
        int i11 = 0;
        if (ordinal == 1) {
            i10 = Math.min(i10, 0);
        } else if (ordinal == 2) {
            i10 = Math.min(i10, 1);
        } else if (ordinal == 3) {
            i10 = Math.min(i10, 5);
        } else if (ordinal != 4) {
            i10 = Math.min(i10, -1);
        }
        if (sVar.y) {
            i10 = sVar.E ? Math.max(this.e, 2) : this.e < 4 ? Math.min(i10, sVar.a) : Math.min(i10, 1);
        }
        if (sVar.F && sVar.V == null) {
            i10 = Math.min(i10, 4);
        }
        if (!sVar.v) {
            i10 = Math.min(i10, 1);
        }
        ViewGroup viewGroup = sVar.V;
        if (viewGroup != null) {
            kotlin.jvm.internal.i.d(sVar.p().I(), "fragmentManager.specialEffectsControllerFactory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof l) {
                lVar = (l) tag;
            } else {
                lVar = new l(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
            }
            ArrayList arrayList = lVar.b;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                obj = null;
                if (i12 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i12);
                i12++;
                ((v0) obj2).getClass();
                if (kotlin.jvm.internal.i.a(null, sVar)) {
                    break;
                }
            }
            ArrayList arrayList2 = lVar.c;
            int size2 = arrayList2.size();
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj3 = arrayList2.get(i11);
                i11++;
                ((v0) obj3).getClass();
                if (kotlin.jvm.internal.i.a(null, sVar)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (sVar.w) {
            i10 = sVar.v() ? Math.min(i10, 1) : Math.min(i10, -1);
        }
        if (sVar.W && sVar.a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (sVar.x) {
            i10 = Math.max(i10, 3);
        }
        if (k0.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + sVar);
        }
        return i10;
    }

    public final void d() {
        Bundle bundle;
        boolean K = k0.K(3);
        final s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + sVar);
        }
        Bundle bundle2 = sVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (sVar.a0) {
            sVar.a = 1;
            Bundle bundle4 = sVar.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            sVar.L.X(bundle);
            l0 l0Var = sVar.L;
            l0Var.H = false;
            l0Var.I = false;
            l0Var.O.i = false;
            l0Var.u(1);
            return;
        }
        n4.y yVar = this.a;
        yVar.y(sVar, false);
        sVar.L.R();
        sVar.a = 1;
        sVar.U = false;
        sVar.d0.a(new androidx.lifecycle.r() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    s.this.getClass();
                }
            }
        });
        sVar.z(bundle3);
        sVar.a0 = true;
        if (sVar.U) {
            sVar.d0.e(androidx.lifecycle.m.ON_CREATE);
            yVar.n(sVar, false);
        } else {
            throw new x0("Fragment " + sVar + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        s sVar = this.c;
        if (sVar.y) {
            return;
        }
        if (k0.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
        }
        Bundle bundle = sVar.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater D = sVar.D(bundle2);
        ViewGroup viewGroup2 = sVar.V;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = sVar.O;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + sVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) sVar.J.x.b(i10);
                if (viewGroup == null) {
                    if (!sVar.G && !sVar.F) {
                        try {
                            str = sVar.K().getResources().getResourceName(sVar.O);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(sVar.O) + " (" + str + ") for fragment " + sVar);
                    }
                } else if (!(viewGroup instanceof x)) {
                    t1.b bVar = t1.c.a;
                    t1.c.b(new t1.a(sVar, "Attempting to add fragment " + sVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    t1.c.a(sVar).getClass();
                }
            }
        }
        sVar.V = viewGroup;
        sVar.J(D, viewGroup, bundle2);
        sVar.a = 2;
    }

    public final void f() {
        s k10;
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + sVar);
        }
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = sVar.w && !sVar.v();
        oi.f fVar = this.b;
        if (z11) {
            fVar.O(sVar.e, null);
        }
        if (!z11) {
            n0 n0Var = (n0) fVar.d;
            if (!((n0Var.d.containsKey(sVar.e) && n0Var.g) ? n0Var.h : true)) {
                String str = sVar.n;
                if (str != null && (k10 = fVar.k(str)) != null && k10.S) {
                    sVar.h = k10;
                }
                sVar.a = 0;
                return;
            }
        }
        u uVar = sVar.K;
        if (uVar != null) {
            z10 = ((n0) fVar.d).h;
        } else {
            v vVar = uVar.b;
            if (e2.u(vVar)) {
                z10 = true ^ vVar.isChangingConfigurations();
            }
        }
        if (z11 || z10) {
            ((n0) fVar.d).c(sVar, false);
        }
        sVar.L.l();
        sVar.d0.e(androidx.lifecycle.m.ON_DESTROY);
        sVar.a = 0;
        sVar.U = false;
        sVar.a0 = false;
        sVar.A();
        if (!sVar.U) {
            throw new x0("Fragment " + sVar + " did not call through to super.onDestroy()");
        }
        this.a.p(sVar, false);
        ArrayList p5 = fVar.p();
        int size = p5.size();
        while (i10 < size) {
            Object obj = p5.get(i10);
            i10++;
            q0 q0Var = (q0) obj;
            if (q0Var != null) {
                s sVar2 = q0Var.c;
                if (sVar.e.equals(sVar2.n)) {
                    sVar2.h = sVar;
                    sVar2.n = null;
                }
            }
        }
        String str2 = sVar.n;
        if (str2 != null) {
            sVar.h = fVar.k(str2);
        }
        fVar.F(this);
    }

    public final void g() {
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + sVar);
        }
        ViewGroup viewGroup = sVar.V;
        sVar.L.u(1);
        sVar.a = 1;
        sVar.U = false;
        sVar.B();
        if (!sVar.U) {
            throw new x0("Fragment " + sVar + " did not call through to super.onDestroyView()");
        }
        a0.n nVar = ((w1.b) new aa.a(sVar.f(), w1.b.f).n(w1.b.class)).d;
        int i10 = nVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((w1.a) nVar.b[i11]).k();
        }
        sVar.H = false;
        this.a.J(sVar, false);
        sVar.V = null;
        sVar.e0.j(null);
        sVar.E = false;
    }

    public final void h() {
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + sVar);
        }
        sVar.a = -1;
        sVar.U = false;
        sVar.C();
        if (!sVar.U) {
            throw new x0("Fragment " + sVar + " did not call through to super.onDetach()");
        }
        l0 l0Var = sVar.L;
        if (!l0Var.J) {
            l0Var.l();
            sVar.L = new l0();
        }
        this.a.q(sVar, false);
        sVar.a = -1;
        sVar.K = null;
        sVar.M = null;
        sVar.J = null;
        if (!sVar.w || sVar.v()) {
            n0 n0Var = (n0) this.b.d;
            if (!((n0Var.d.containsKey(sVar.e) && n0Var.g) ? n0Var.h : true)) {
                return;
            }
        }
        if (k0.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + sVar);
        }
        sVar.s();
    }

    public final void i() {
        s sVar = this.c;
        if (sVar.y && sVar.E && !sVar.H) {
            if (k0.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
            }
            Bundle bundle = sVar.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            sVar.J(sVar.D(bundle2), null, bundle2);
        }
    }

    public final void j() {
        oi.f fVar = this.b;
        boolean z10 = this.d;
        s sVar = this.c;
        if (z10) {
            if (k0.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + sVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z11 = false;
            while (true) {
                int c10 = c();
                int i10 = sVar.a;
                if (c10 == i10) {
                    if (!z11 && i10 == -1 && sVar.w && !sVar.v()) {
                        if (k0.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + sVar);
                        }
                        ((n0) fVar.d).c(sVar, true);
                        fVar.F(this);
                        if (k0.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + sVar);
                        }
                        sVar.s();
                    }
                    if (sVar.Z) {
                        k0 k0Var = sVar.J;
                        if (k0Var != null && sVar.v && k0.L(sVar)) {
                            k0Var.G = true;
                        }
                        sVar.Z = false;
                        sVar.L.o();
                    }
                    this.d = false;
                    return;
                }
                if (c10 <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            sVar.a = 1;
                            break;
                        case 2:
                            sVar.E = false;
                            sVar.a = 2;
                            break;
                        case 3:
                            if (k0.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + sVar);
                            }
                            sVar.a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            sVar.a = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            sVar.a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            sVar.a = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th2) {
            this.d = false;
            throw th2;
        }
    }

    public final void k() {
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + sVar);
        }
        sVar.L.u(5);
        sVar.d0.e(androidx.lifecycle.m.ON_PAUSE);
        sVar.a = 6;
        sVar.U = false;
        sVar.E();
        if (sVar.U) {
            this.a.r(sVar, false);
            return;
        }
        throw new x0("Fragment " + sVar + " did not call through to super.onPause()");
    }

    public final void l(ClassLoader classLoader) {
        s sVar = this.c;
        Bundle bundle = sVar.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (sVar.b.getBundle("savedInstanceState") == null) {
            sVar.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            sVar.c = sVar.b.getSparseParcelableArray("viewState");
            sVar.d = sVar.b.getBundle("viewRegistryState");
            p0 p0Var = (p0) sVar.b.getParcelable("state");
            if (p0Var != null) {
                sVar.n = p0Var.x;
                sVar.r = p0Var.y;
                sVar.X = p0Var.E;
            }
            if (sVar.X) {
                return;
            }
            sVar.W = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + sVar, e);
        }
    }

    public final void m() {
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + sVar);
        }
        r rVar = sVar.Y;
        View view = rVar == null ? null : rVar.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        sVar.j().j = null;
        sVar.L.R();
        sVar.L.A(true);
        sVar.a = 7;
        sVar.U = false;
        sVar.F();
        if (!sVar.U) {
            throw new x0("Fragment " + sVar + " did not call through to super.onResume()");
        }
        sVar.d0.e(androidx.lifecycle.m.ON_RESUME);
        l0 l0Var = sVar.L;
        l0Var.H = false;
        l0Var.I = false;
        l0Var.O.i = false;
        l0Var.u(7);
        this.a.A(sVar, false);
        this.b.O(sVar.e, null);
        sVar.b = null;
        sVar.c = null;
        sVar.d = null;
    }

    public final void n() {
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto STARTED: " + sVar);
        }
        sVar.L.R();
        sVar.L.A(true);
        sVar.a = 5;
        sVar.U = false;
        sVar.H();
        if (!sVar.U) {
            throw new x0("Fragment " + sVar + " did not call through to super.onStart()");
        }
        sVar.d0.e(androidx.lifecycle.m.ON_START);
        l0 l0Var = sVar.L;
        l0Var.H = false;
        l0Var.I = false;
        l0Var.O.i = false;
        l0Var.u(5);
        this.a.F(sVar, false);
    }

    public final void o() {
        boolean K = k0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + sVar);
        }
        l0 l0Var = sVar.L;
        l0Var.I = true;
        l0Var.O.i = true;
        l0Var.u(4);
        sVar.d0.e(androidx.lifecycle.m.ON_STOP);
        sVar.a = 4;
        sVar.U = false;
        sVar.I();
        if (sVar.U) {
            this.a.H(sVar, false);
            return;
        }
        throw new x0("Fragment " + sVar + " did not call through to super.onStop()");
    }

    public q0(n4.y yVar, oi.f fVar, ClassLoader classLoader, d0 d0Var, Bundle bundle) {
        this.a = yVar;
        this.b = fVar;
        p0 p0Var = (p0) bundle.getParcelable("state");
        s a2 = d0Var.a(p0Var.a);
        a2.e = p0Var.b;
        a2.y = p0Var.c;
        a2.F = p0Var.d;
        a2.G = true;
        a2.N = p0Var.e;
        a2.O = p0Var.f;
        a2.P = p0Var.h;
        a2.S = p0Var.n;
        a2.w = p0Var.r;
        a2.R = p0Var.s;
        a2.Q = p0Var.v;
        a2.c0 = androidx.lifecycle.n.values()[p0Var.w];
        a2.n = p0Var.x;
        a2.r = p0Var.y;
        a2.X = p0Var.E;
        this.c = a2;
        a2.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.M(bundle2);
        if (k0.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public q0(n4.y yVar, oi.f fVar, s sVar, Bundle bundle) {
        this.a = yVar;
        this.b = fVar;
        this.c = sVar;
        sVar.c = null;
        sVar.d = null;
        sVar.I = 0;
        sVar.E = false;
        sVar.v = false;
        s sVar2 = sVar.h;
        sVar.n = sVar2 != null ? sVar2.e : null;
        sVar.h = null;
        sVar.b = bundle;
        sVar.f = bundle.getBundle("arguments");
    }
}

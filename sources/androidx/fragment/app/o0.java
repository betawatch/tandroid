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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class o0 {
    public final pf.b a;
    public final fg.f b;
    public final r c;
    public boolean d = false;
    public int e = -1;

    public o0(pf.b bVar, fg.f fVar, r rVar) {
        this.a = bVar;
        this.b = fVar;
        this.c = rVar;
    }

    public final void a() {
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + rVar);
        }
        Bundle bundle = rVar.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        rVar.L.R();
        rVar.a = 3;
        rVar.U = false;
        rVar.w();
        if (!rVar.U) {
            throw new v0("Fragment " + rVar + " did not call through to super.onActivityCreated()");
        }
        if (i0.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + rVar);
        }
        rVar.b = null;
        j0 j0Var = rVar.L;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.i = false;
        j0Var.u(4);
        this.a.D(rVar, false);
    }

    public final void b() {
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + rVar);
        }
        r rVar2 = rVar.h;
        o0 o0Var = null;
        fg.f fVar = this.b;
        if (rVar2 != null) {
            o0 o0Var2 = (o0) ((HashMap) fVar.b).get(rVar2.e);
            if (o0Var2 == null) {
                throw new IllegalStateException("Fragment " + rVar + " declared target fragment " + rVar.h + " that does not belong to this FragmentManager!");
            }
            rVar.n = rVar.h.e;
            rVar.h = null;
            o0Var = o0Var2;
        } else {
            String str = rVar.n;
            if (str != null && (o0Var = (o0) ((HashMap) fVar.b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(rVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(a4.a.s(sb2, rVar.n, " that does not belong to this FragmentManager!"));
            }
        }
        if (o0Var != null) {
            o0Var.j();
        }
        i0 i0Var = rVar.J;
        rVar.K = i0Var.w;
        rVar.M = i0Var.y;
        pf.b bVar = this.a;
        bVar.J(rVar, false);
        ArrayList arrayList = rVar.h0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p) obj).a();
        }
        arrayList.clear();
        rVar.L.b(rVar.K, rVar.h(), rVar);
        rVar.a = 0;
        rVar.U = false;
        rVar.y(rVar.K.b);
        if (!rVar.U) {
            throw new v0("Fragment " + rVar + " did not call through to super.onAttach()");
        }
        Iterator it = rVar.J.p.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).a();
        }
        j0 j0Var = rVar.L;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.i = false;
        j0Var.u(0);
        bVar.E(rVar, false);
    }

    public final int c() {
        k kVar;
        Object obj;
        Object obj2;
        r rVar = this.c;
        if (rVar.J == null) {
            return rVar.a;
        }
        int i10 = this.e;
        int ordinal = rVar.c0.ordinal();
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
        if (rVar.y) {
            i10 = rVar.E ? Math.max(this.e, 2) : this.e < 4 ? Math.min(i10, rVar.a) : Math.min(i10, 1);
        }
        if (rVar.F && rVar.V == null) {
            i10 = Math.min(i10, 4);
        }
        if (!rVar.v) {
            i10 = Math.min(i10, 1);
        }
        ViewGroup viewGroup = rVar.V;
        if (viewGroup != null) {
            kotlin.jvm.internal.i.d(rVar.p().I(), "fragmentManager.specialEffectsControllerFactory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof k) {
                kVar = (k) tag;
            } else {
                kVar = new k(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, kVar);
            }
            ArrayList arrayList = kVar.b;
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
                ((t0) obj2).getClass();
                if (kotlin.jvm.internal.i.a(null, rVar)) {
                    break;
                }
            }
            ArrayList arrayList2 = kVar.c;
            int size2 = arrayList2.size();
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj3 = arrayList2.get(i11);
                i11++;
                ((t0) obj3).getClass();
                if (kotlin.jvm.internal.i.a(null, rVar)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (rVar.w) {
            i10 = rVar.v() ? Math.min(i10, 1) : Math.min(i10, -1);
        }
        if (rVar.W && rVar.a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (rVar.x) {
            i10 = Math.max(i10, 3);
        }
        if (i0.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + rVar);
        }
        return i10;
    }

    public final void d() {
        Bundle bundle;
        boolean K = i0.K(3);
        final r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + rVar);
        }
        Bundle bundle2 = rVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (rVar.a0) {
            rVar.a = 1;
            Bundle bundle4 = rVar.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            rVar.L.X(bundle);
            j0 j0Var = rVar.L;
            j0Var.H = false;
            j0Var.I = false;
            j0Var.O.i = false;
            j0Var.u(1);
            return;
        }
        pf.b bVar = this.a;
        bVar.K(rVar, false);
        rVar.L.R();
        rVar.a = 1;
        rVar.U = false;
        rVar.d0.a(new androidx.lifecycle.r() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    r.this.getClass();
                }
            }
        });
        rVar.z(bundle3);
        rVar.a0 = true;
        if (rVar.U) {
            rVar.d0.e(androidx.lifecycle.m.ON_CREATE);
            bVar.F(rVar, false);
        } else {
            throw new v0("Fragment " + rVar + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        r rVar = this.c;
        if (rVar.y) {
            return;
        }
        if (i0.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + rVar);
        }
        Bundle bundle = rVar.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater D = rVar.D(bundle2);
        ViewGroup viewGroup2 = rVar.V;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = rVar.O;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + rVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) rVar.J.x.b(i10);
                if (viewGroup == null) {
                    if (!rVar.G && !rVar.F) {
                        try {
                            str = rVar.K().getResources().getResourceName(rVar.O);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(rVar.O) + " (" + str + ") for fragment " + rVar);
                    }
                } else if (!(viewGroup instanceof w)) {
                    t1.b bVar = t1.c.a;
                    t1.c.b(new t1.a(rVar, "Attempting to add fragment " + rVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    t1.c.a(rVar).getClass();
                }
            }
        }
        rVar.V = viewGroup;
        rVar.J(D, viewGroup, bundle2);
        rVar.a = 2;
    }

    public final void f() {
        r l4;
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + rVar);
        }
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = rVar.w && !rVar.v();
        fg.f fVar = this.b;
        if (z11) {
            fVar.R(rVar.e, null);
        }
        if (!z11) {
            l0 l0Var = (l0) fVar.d;
            if (!((l0Var.d.containsKey(rVar.e) && l0Var.g) ? l0Var.h : true)) {
                String str = rVar.n;
                if (str != null && (l4 = fVar.l(str)) != null && l4.S) {
                    rVar.h = l4;
                }
                rVar.a = 0;
                return;
            }
        }
        t tVar = rVar.K;
        if (tVar != null) {
            z10 = ((l0) fVar.d).h;
        } else {
            u uVar = tVar.b;
            if (e2.u(uVar)) {
                z10 = true ^ uVar.isChangingConfigurations();
            }
        }
        if (z11 || z10) {
            ((l0) fVar.d).c(rVar, false);
        }
        rVar.L.l();
        rVar.d0.e(androidx.lifecycle.m.ON_DESTROY);
        rVar.a = 0;
        rVar.U = false;
        rVar.a0 = false;
        rVar.A();
        if (!rVar.U) {
            throw new v0("Fragment " + rVar + " did not call through to super.onDestroy()");
        }
        this.a.G(rVar, false);
        ArrayList q6 = fVar.q();
        int size = q6.size();
        while (i10 < size) {
            Object obj = q6.get(i10);
            i10++;
            o0 o0Var = (o0) obj;
            if (o0Var != null) {
                r rVar2 = o0Var.c;
                if (rVar.e.equals(rVar2.n)) {
                    rVar2.h = rVar;
                    rVar2.n = null;
                }
            }
        }
        String str2 = rVar.n;
        if (str2 != null) {
            rVar.h = fVar.l(str2);
        }
        fVar.G(this);
    }

    public final void g() {
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + rVar);
        }
        ViewGroup viewGroup = rVar.V;
        rVar.L.u(1);
        rVar.a = 1;
        rVar.U = false;
        rVar.B();
        if (!rVar.U) {
            throw new v0("Fragment " + rVar + " did not call through to super.onDestroyView()");
        }
        a0.m mVar = ((w1.b) new aa.a(rVar.f(), w1.b.f).n(w1.b.class)).d;
        int i10 = mVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((w1.a) mVar.b[i11]).k();
        }
        rVar.H = false;
        this.a.Q(rVar, false);
        rVar.V = null;
        rVar.e0.j(null);
        rVar.E = false;
    }

    public final void h() {
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + rVar);
        }
        rVar.a = -1;
        rVar.U = false;
        rVar.C();
        if (!rVar.U) {
            throw new v0("Fragment " + rVar + " did not call through to super.onDetach()");
        }
        j0 j0Var = rVar.L;
        if (!j0Var.J) {
            j0Var.l();
            rVar.L = new j0();
        }
        this.a.H(rVar, false);
        rVar.a = -1;
        rVar.K = null;
        rVar.M = null;
        rVar.J = null;
        if (!rVar.w || rVar.v()) {
            l0 l0Var = (l0) this.b.d;
            if (!((l0Var.d.containsKey(rVar.e) && l0Var.g) ? l0Var.h : true)) {
                return;
            }
        }
        if (i0.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + rVar);
        }
        rVar.s();
    }

    public final void i() {
        r rVar = this.c;
        if (rVar.y && rVar.E && !rVar.H) {
            if (i0.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + rVar);
            }
            Bundle bundle = rVar.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            rVar.J(rVar.D(bundle2), null, bundle2);
        }
    }

    public final void j() {
        fg.f fVar = this.b;
        boolean z10 = this.d;
        r rVar = this.c;
        if (z10) {
            if (i0.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + rVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z11 = false;
            while (true) {
                int c10 = c();
                int i10 = rVar.a;
                if (c10 == i10) {
                    if (!z11 && i10 == -1 && rVar.w && !rVar.v()) {
                        if (i0.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + rVar);
                        }
                        ((l0) fVar.d).c(rVar, true);
                        fVar.G(this);
                        if (i0.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + rVar);
                        }
                        rVar.s();
                    }
                    if (rVar.Z) {
                        i0 i0Var = rVar.J;
                        if (i0Var != null && rVar.v && i0.L(rVar)) {
                            i0Var.G = true;
                        }
                        rVar.Z = false;
                        rVar.L.o();
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
                            rVar.a = 1;
                            break;
                        case 2:
                            rVar.E = false;
                            rVar.a = 2;
                            break;
                        case 3:
                            if (i0.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + rVar);
                            }
                            rVar.a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            rVar.a = 5;
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
                            rVar.a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            rVar.a = 6;
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
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + rVar);
        }
        rVar.L.u(5);
        rVar.d0.e(androidx.lifecycle.m.ON_PAUSE);
        rVar.a = 6;
        rVar.U = false;
        rVar.E();
        if (rVar.U) {
            this.a.I(rVar, false);
            return;
        }
        throw new v0("Fragment " + rVar + " did not call through to super.onPause()");
    }

    public final void l(ClassLoader classLoader) {
        r rVar = this.c;
        Bundle bundle = rVar.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (rVar.b.getBundle("savedInstanceState") == null) {
            rVar.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            rVar.c = rVar.b.getSparseParcelableArray("viewState");
            rVar.d = rVar.b.getBundle("viewRegistryState");
            n0 n0Var = (n0) rVar.b.getParcelable("state");
            if (n0Var != null) {
                rVar.n = n0Var.x;
                rVar.r = n0Var.y;
                rVar.X = n0Var.E;
            }
            if (rVar.X) {
                return;
            }
            rVar.W = true;
        } catch (BadParcelableException e7) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + rVar, e7);
        }
    }

    public final void m() {
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + rVar);
        }
        q qVar = rVar.Y;
        View view = qVar == null ? null : qVar.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        rVar.j().j = null;
        rVar.L.R();
        rVar.L.A(true);
        rVar.a = 7;
        rVar.U = false;
        rVar.F();
        if (!rVar.U) {
            throw new v0("Fragment " + rVar + " did not call through to super.onResume()");
        }
        rVar.d0.e(androidx.lifecycle.m.ON_RESUME);
        j0 j0Var = rVar.L;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.i = false;
        j0Var.u(7);
        this.a.L(rVar, false);
        this.b.R(rVar.e, null);
        rVar.b = null;
        rVar.c = null;
        rVar.d = null;
    }

    public final void n() {
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto STARTED: " + rVar);
        }
        rVar.L.R();
        rVar.L.A(true);
        rVar.a = 5;
        rVar.U = false;
        rVar.H();
        if (!rVar.U) {
            throw new v0("Fragment " + rVar + " did not call through to super.onStart()");
        }
        rVar.d0.e(androidx.lifecycle.m.ON_START);
        j0 j0Var = rVar.L;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.i = false;
        j0Var.u(5);
        this.a.O(rVar, false);
    }

    public final void o() {
        boolean K = i0.K(3);
        r rVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + rVar);
        }
        j0 j0Var = rVar.L;
        j0Var.I = true;
        j0Var.O.i = true;
        j0Var.u(4);
        rVar.d0.e(androidx.lifecycle.m.ON_STOP);
        rVar.a = 4;
        rVar.U = false;
        rVar.I();
        if (rVar.U) {
            this.a.P(rVar, false);
            return;
        }
        throw new v0("Fragment " + rVar + " did not call through to super.onStop()");
    }

    public o0(pf.b bVar, fg.f fVar, ClassLoader classLoader, b0 b0Var, Bundle bundle) {
        this.a = bVar;
        this.b = fVar;
        n0 n0Var = (n0) bundle.getParcelable("state");
        r a2 = b0Var.a(n0Var.a);
        a2.e = n0Var.b;
        a2.y = n0Var.c;
        a2.F = n0Var.d;
        a2.G = true;
        a2.N = n0Var.e;
        a2.O = n0Var.f;
        a2.P = n0Var.h;
        a2.S = n0Var.n;
        a2.w = n0Var.r;
        a2.R = n0Var.s;
        a2.Q = n0Var.v;
        a2.c0 = androidx.lifecycle.n.values()[n0Var.w];
        a2.n = n0Var.x;
        a2.r = n0Var.y;
        a2.X = n0Var.E;
        this.c = a2;
        a2.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.M(bundle2);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public o0(pf.b bVar, fg.f fVar, r rVar, Bundle bundle) {
        this.a = bVar;
        this.b = fVar;
        this.c = rVar;
        rVar.c = null;
        rVar.d = null;
        rVar.I = 0;
        rVar.E = false;
        rVar.v = false;
        r rVar2 = rVar.h;
        rVar.n = rVar2 != null ? rVar2.e : null;
        rVar.h = null;
        rVar.b = bundle;
        rVar.f = bundle.getBundle("arguments");
    }
}

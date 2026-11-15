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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class p0 {
    public final wf.b a;
    public final xi.e b;
    public final s c;
    public boolean d = false;
    public int e = -1;

    public p0(wf.b bVar, xi.e eVar, s sVar) {
        this.a = bVar;
        this.b = eVar;
        this.c = sVar;
    }

    public final void a() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + sVar);
        }
        Bundle bundle = sVar.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        sVar.M.R();
        sVar.a = 3;
        sVar.V = false;
        sVar.w();
        if (!sVar.V) {
            throw new w0("Fragment " + sVar + " did not call through to super.onActivityCreated()");
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + sVar);
        }
        sVar.b = null;
        k0 k0Var = sVar.M;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(4);
        this.a.u(sVar, false);
    }

    public final void b() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + sVar);
        }
        s sVar2 = sVar.h;
        p0 p0Var = null;
        xi.e eVar = this.b;
        if (sVar2 != null) {
            p0 p0Var2 = (p0) ((HashMap) eVar.b).get(sVar2.e);
            if (p0Var2 == null) {
                throw new IllegalStateException("Fragment " + sVar + " declared target fragment " + sVar.h + " that does not belong to this FragmentManager!");
            }
            sVar.n = sVar.h.e;
            sVar.h = null;
            p0Var = p0Var2;
        } else {
            String str = sVar.n;
            if (str != null && (p0Var = (p0) ((HashMap) eVar.b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(sVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(a8.p0.s(sb2, sVar.n, " that does not belong to this FragmentManager!"));
            }
        }
        if (p0Var != null) {
            p0Var.j();
        }
        j0 j0Var = sVar.K;
        sVar.L = j0Var.w;
        sVar.N = j0Var.y;
        wf.b bVar = this.a;
        bVar.A(sVar, false);
        ArrayList arrayList = sVar.i0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((q) obj).a();
        }
        arrayList.clear();
        sVar.M.b(sVar.L, sVar.h(), sVar);
        sVar.a = 0;
        sVar.V = false;
        sVar.y(sVar.L.b);
        if (!sVar.V) {
            throw new w0("Fragment " + sVar + " did not call through to super.onAttach()");
        }
        Iterator it = sVar.K.p.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).a();
        }
        k0 k0Var = sVar.M;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(0);
        bVar.v(sVar, false);
    }

    public final int c() {
        l lVar;
        Object obj;
        Object obj2;
        s sVar = this.c;
        if (sVar.K == null) {
            return sVar.a;
        }
        int i7 = this.e;
        int ordinal = sVar.d0.ordinal();
        int i10 = 0;
        if (ordinal == 1) {
            i7 = Math.min(i7, 0);
        } else if (ordinal == 2) {
            i7 = Math.min(i7, 1);
        } else if (ordinal == 3) {
            i7 = Math.min(i7, 5);
        } else if (ordinal != 4) {
            i7 = Math.min(i7, -1);
        }
        if (sVar.E) {
            i7 = sVar.F ? Math.max(this.e, 2) : this.e < 4 ? Math.min(i7, sVar.a) : Math.min(i7, 1);
        }
        if (sVar.G && sVar.W == null) {
            i7 = Math.min(i7, 4);
        }
        if (!sVar.w) {
            i7 = Math.min(i7, 1);
        }
        ViewGroup viewGroup = sVar.W;
        if (viewGroup != null) {
            kotlin.jvm.internal.j.d(sVar.p().I(), "fragmentManager.specialEffectsControllerFactory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof l) {
                lVar = (l) tag;
            } else {
                lVar = new l(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
            }
            ArrayList arrayList = lVar.b;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                obj = null;
                if (i11 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i11);
                i11++;
                ((u0) obj2).getClass();
                if (kotlin.jvm.internal.j.a(null, sVar)) {
                    break;
                }
            }
            ArrayList arrayList2 = lVar.c;
            int size2 = arrayList2.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList2.get(i10);
                i10++;
                ((u0) obj3).getClass();
                if (kotlin.jvm.internal.j.a(null, sVar)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (sVar.x) {
            i7 = sVar.v() ? Math.min(i7, 1) : Math.min(i7, -1);
        }
        if (sVar.X && sVar.a < 5) {
            i7 = Math.min(i7, 4);
        }
        if (sVar.y) {
            i7 = Math.max(i7, 3);
        }
        if (j0.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i7 + " for " + sVar);
        }
        return i7;
    }

    public final void d() {
        Bundle bundle;
        boolean K = j0.K(3);
        final s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + sVar);
        }
        Bundle bundle2 = sVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (sVar.b0) {
            sVar.a = 1;
            Bundle bundle4 = sVar.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            sVar.M.X(bundle);
            k0 k0Var = sVar.M;
            k0Var.H = false;
            k0Var.I = false;
            k0Var.O.i = false;
            k0Var.u(1);
            return;
        }
        wf.b bVar = this.a;
        bVar.B(sVar, false);
        sVar.M.R();
        sVar.a = 1;
        sVar.V = false;
        sVar.e0.a(new androidx.lifecycle.r() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    s.this.getClass();
                }
            }
        });
        sVar.z(bundle3);
        sVar.b0 = true;
        if (sVar.V) {
            sVar.e0.e(androidx.lifecycle.m.ON_CREATE);
            bVar.w(sVar, false);
        } else {
            throw new w0("Fragment " + sVar + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        s sVar = this.c;
        if (sVar.E) {
            return;
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
        }
        Bundle bundle = sVar.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater D = sVar.D(bundle2);
        ViewGroup viewGroup2 = sVar.W;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i7 = sVar.P;
            if (i7 != 0) {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + sVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) sVar.K.x.b(i7);
                if (viewGroup == null) {
                    if (!sVar.H && !sVar.G) {
                        try {
                            str = sVar.K().getResources().getResourceName(sVar.P);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(sVar.P) + " (" + str + ") for fragment " + sVar);
                    }
                } else if (!(viewGroup instanceof x)) {
                    w1.b bVar = w1.c.a;
                    w1.c.b(new w1.a(sVar, "Attempting to add fragment " + sVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    w1.c.a(sVar).getClass();
                }
            }
        }
        sVar.W = viewGroup;
        sVar.J(D, viewGroup, bundle2);
        sVar.a = 2;
    }

    public final void f() {
        s n10;
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + sVar);
        }
        boolean z10 = true;
        int i7 = 0;
        boolean z11 = sVar.x && !sVar.v();
        xi.e eVar = this.b;
        if (z11) {
            eVar.J(sVar.e, null);
        }
        if (!z11) {
            m0 m0Var = (m0) eVar.d;
            if (!((m0Var.d.containsKey(sVar.e) && m0Var.g) ? m0Var.h : true)) {
                String str = sVar.n;
                if (str != null && (n10 = eVar.n(str)) != null && n10.T) {
                    sVar.h = n10;
                }
                sVar.a = 0;
                return;
            }
        }
        u uVar = sVar.L;
        if (uVar != null) {
            z10 = ((m0) eVar.d).h;
        } else {
            v vVar = uVar.b;
            if (e2.s(vVar)) {
                z10 = true ^ vVar.isChangingConfigurations();
            }
        }
        if (z11 || z10) {
            ((m0) eVar.d).c(sVar, false);
        }
        sVar.M.l();
        sVar.e0.e(androidx.lifecycle.m.ON_DESTROY);
        sVar.a = 0;
        sVar.V = false;
        sVar.b0 = false;
        sVar.A();
        if (!sVar.V) {
            throw new w0("Fragment " + sVar + " did not call through to super.onDestroy()");
        }
        this.a.x(sVar, false);
        ArrayList p10 = eVar.p();
        int size = p10.size();
        while (i7 < size) {
            Object obj = p10.get(i7);
            i7++;
            p0 p0Var = (p0) obj;
            if (p0Var != null) {
                s sVar2 = p0Var.c;
                if (sVar.e.equals(sVar2.n)) {
                    sVar2.h = sVar;
                    sVar2.n = null;
                }
            }
        }
        String str2 = sVar.n;
        if (str2 != null) {
            sVar.h = eVar.n(str2);
        }
        eVar.B(this);
    }

    public final void g() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + sVar);
        }
        ViewGroup viewGroup = sVar.W;
        sVar.M.u(1);
        sVar.a = 1;
        sVar.V = false;
        sVar.B();
        if (!sVar.V) {
            throw new w0("Fragment " + sVar + " did not call through to super.onDestroyView()");
        }
        a0.m mVar = ((z1.b) new android.support.v4.media.session.a0(sVar.f(), z1.b.f).j(z1.b.class)).d;
        int i7 = mVar.c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((z1.a) mVar.b[i10]).k();
        }
        sVar.I = false;
        this.a.H(sVar, false);
        sVar.W = null;
        sVar.f0.j(null);
        sVar.F = false;
    }

    public final void h() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + sVar);
        }
        sVar.a = -1;
        sVar.V = false;
        sVar.C();
        if (!sVar.V) {
            throw new w0("Fragment " + sVar + " did not call through to super.onDetach()");
        }
        k0 k0Var = sVar.M;
        if (!k0Var.J) {
            k0Var.l();
            sVar.M = new k0();
        }
        this.a.y(sVar, false);
        sVar.a = -1;
        sVar.L = null;
        sVar.N = null;
        sVar.K = null;
        if (!sVar.x || sVar.v()) {
            m0 m0Var = (m0) this.b.d;
            if (!((m0Var.d.containsKey(sVar.e) && m0Var.g) ? m0Var.h : true)) {
                return;
            }
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + sVar);
        }
        sVar.s();
    }

    public final void i() {
        s sVar = this.c;
        if (sVar.E && sVar.F && !sVar.I) {
            if (j0.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
            }
            Bundle bundle = sVar.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            sVar.J(sVar.D(bundle2), null, bundle2);
        }
    }

    public final void j() {
        xi.e eVar = this.b;
        boolean z10 = this.d;
        s sVar = this.c;
        if (z10) {
            if (j0.K(2)) {
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
                int i7 = sVar.a;
                if (c10 == i7) {
                    if (!z11 && i7 == -1 && sVar.x && !sVar.v()) {
                        if (j0.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + sVar);
                        }
                        ((m0) eVar.d).c(sVar, true);
                        eVar.B(this);
                        if (j0.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + sVar);
                        }
                        sVar.s();
                    }
                    if (sVar.a0) {
                        j0 j0Var = sVar.K;
                        if (j0Var != null && sVar.w && j0.L(sVar)) {
                            j0Var.G = true;
                        }
                        sVar.a0 = false;
                        sVar.M.o();
                    }
                    this.d = false;
                    return;
                }
                if (c10 <= i7) {
                    switch (i7 - 1) {
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
                            sVar.F = false;
                            sVar.a = 2;
                            break;
                        case 3:
                            if (j0.K(3)) {
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
                    switch (i7 + 1) {
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
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + sVar);
        }
        sVar.M.u(5);
        sVar.e0.e(androidx.lifecycle.m.ON_PAUSE);
        sVar.a = 6;
        sVar.V = false;
        sVar.E();
        if (sVar.V) {
            this.a.z(sVar, false);
            return;
        }
        throw new w0("Fragment " + sVar + " did not call through to super.onPause()");
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
            o0 o0Var = (o0) sVar.b.getParcelable("state");
            if (o0Var != null) {
                sVar.n = o0Var.y;
                sVar.r = o0Var.E;
                sVar.Y = o0Var.F;
            }
            if (sVar.Y) {
                return;
            }
            sVar.X = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + sVar, e10);
        }
    }

    public final void m() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + sVar);
        }
        r rVar = sVar.Z;
        View view = rVar == null ? null : rVar.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        sVar.j().j = null;
        sVar.M.R();
        sVar.M.A(true);
        sVar.a = 7;
        sVar.V = false;
        sVar.F();
        if (!sVar.V) {
            throw new w0("Fragment " + sVar + " did not call through to super.onResume()");
        }
        sVar.e0.e(androidx.lifecycle.m.ON_RESUME);
        k0 k0Var = sVar.M;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(7);
        this.a.C(sVar, false);
        this.b.J(sVar.e, null);
        sVar.b = null;
        sVar.c = null;
        sVar.d = null;
    }

    public final void n() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto STARTED: " + sVar);
        }
        sVar.M.R();
        sVar.M.A(true);
        sVar.a = 5;
        sVar.V = false;
        sVar.H();
        if (!sVar.V) {
            throw new w0("Fragment " + sVar + " did not call through to super.onStart()");
        }
        sVar.e0.e(androidx.lifecycle.m.ON_START);
        k0 k0Var = sVar.M;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(5);
        this.a.E(sVar, false);
    }

    public final void o() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + sVar);
        }
        k0 k0Var = sVar.M;
        k0Var.I = true;
        k0Var.O.i = true;
        k0Var.u(4);
        sVar.e0.e(androidx.lifecycle.m.ON_STOP);
        sVar.a = 4;
        sVar.V = false;
        sVar.I();
        if (sVar.V) {
            this.a.F(sVar, false);
            return;
        }
        throw new w0("Fragment " + sVar + " did not call through to super.onStop()");
    }

    public p0(wf.b bVar, xi.e eVar, ClassLoader classLoader, c0 c0Var, Bundle bundle) {
        this.a = bVar;
        this.b = eVar;
        o0 o0Var = (o0) bundle.getParcelable("state");
        s a10 = c0Var.a(o0Var.a);
        a10.e = o0Var.b;
        a10.E = o0Var.c;
        a10.G = o0Var.d;
        a10.H = true;
        a10.O = o0Var.e;
        a10.P = o0Var.f;
        a10.Q = o0Var.h;
        a10.T = o0Var.n;
        a10.x = o0Var.r;
        a10.S = o0Var.s;
        a10.R = o0Var.w;
        a10.d0 = androidx.lifecycle.n.values()[o0Var.x];
        a10.n = o0Var.y;
        a10.r = o0Var.E;
        a10.Y = o0Var.F;
        this.c = a10;
        a10.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.M(bundle2);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public p0(wf.b bVar, xi.e eVar, s sVar, Bundle bundle) {
        this.a = bVar;
        this.b = eVar;
        this.c = sVar;
        sVar.c = null;
        sVar.d = null;
        sVar.J = 0;
        sVar.F = false;
        sVar.w = false;
        s sVar2 = sVar.h;
        sVar.n = sVar2 != null ? sVar2.e : null;
        sVar.h = null;
        sVar.b = bundle;
        sVar.f = bundle.getBundle("arguments");
    }
}

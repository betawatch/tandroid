package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p0 {
    public final xe.b a;
    public final com.google.firebase.messaging.t b;
    public final s c;
    public boolean d = false;
    public int e = -1;

    public p0(xe.b bVar, com.google.firebase.messaging.t tVar, s sVar) {
        this.a = bVar;
        this.b = tVar;
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
        sVar.H.R();
        sVar.a = 3;
        sVar.Q = false;
        sVar.w();
        if (!sVar.Q) {
            throw new w0("Fragment " + sVar + " did not call through to super.onActivityCreated()");
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + sVar);
        }
        sVar.b = null;
        k0 k0Var = sVar.H;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(4);
        this.a.n(sVar, false);
    }

    public final void b() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + sVar);
        }
        s sVar2 = sVar.h;
        p0 p0Var = null;
        com.google.firebase.messaging.t tVar = this.b;
        if (sVar2 != null) {
            p0 p0Var2 = (p0) ((HashMap) tVar.c).get(sVar2.e);
            if (p0Var2 == null) {
                throw new IllegalStateException("Fragment " + sVar + " declared target fragment " + sVar.h + " that does not belong to this FragmentManager!");
            }
            sVar.n = sVar.h.e;
            sVar.h = null;
            p0Var = p0Var2;
        } else {
            String str = sVar.n;
            if (str != null && (p0Var = (p0) ((HashMap) tVar.c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(sVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(a9.p.p(sb2, sVar.n, " that does not belong to this FragmentManager!"));
            }
        }
        if (p0Var != null) {
            p0Var.j();
        }
        j0 j0Var = sVar.F;
        sVar.G = j0Var.w;
        sVar.I = j0Var.y;
        xe.b bVar = this.a;
        bVar.t(sVar, false);
        ArrayList arrayList = sVar.d0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((q) obj).a();
        }
        arrayList.clear();
        sVar.H.b(sVar.G, sVar.h(), sVar);
        sVar.a = 0;
        sVar.Q = false;
        sVar.y(sVar.G.b);
        if (!sVar.Q) {
            throw new w0("Fragment " + sVar + " did not call through to super.onAttach()");
        }
        Iterator it = sVar.F.p.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).a();
        }
        k0 k0Var = sVar.H;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(0);
        bVar.o(sVar, false);
    }

    public final int c() {
        l lVar;
        Object obj;
        Object obj2;
        s sVar = this.c;
        if (sVar.F == null) {
            return sVar.a;
        }
        int i10 = this.e;
        int ordinal = sVar.Y.ordinal();
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
            i10 = sVar.A ? Math.max(this.e, 2) : this.e < 4 ? Math.min(i10, sVar.a) : Math.min(i10, 1);
        }
        if (sVar.B && sVar.R == null) {
            i10 = Math.min(i10, 4);
        }
        if (!sVar.v) {
            i10 = Math.min(i10, 1);
        }
        ViewGroup viewGroup = sVar.R;
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
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                Object obj3 = arrayList2.get(i12);
                i12++;
                ((u0) obj3).getClass();
                if (kotlin.jvm.internal.j.a(null, sVar)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (sVar.w) {
            i10 = sVar.v() ? Math.min(i10, 1) : Math.min(i10, -1);
        }
        if (sVar.S && sVar.a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (sVar.x) {
            i10 = Math.max(i10, 3);
        }
        if (j0.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + sVar);
        }
        return i10;
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
        if (sVar.W) {
            sVar.a = 1;
            Bundle bundle4 = sVar.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            sVar.H.X(bundle);
            k0 k0Var = sVar.H;
            k0Var.H = false;
            k0Var.I = false;
            k0Var.O.i = false;
            k0Var.u(1);
            return;
        }
        xe.b bVar = this.a;
        bVar.u(sVar, false);
        sVar.H.R();
        sVar.a = 1;
        sVar.Q = false;
        sVar.Z.a(new androidx.lifecycle.r() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    s.this.getClass();
                }
            }
        });
        sVar.z(bundle3);
        sVar.W = true;
        if (sVar.Q) {
            sVar.Z.e(androidx.lifecycle.m.ON_CREATE);
            bVar.p(sVar, false);
        } else {
            throw new w0("Fragment " + sVar + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        s sVar = this.c;
        if (sVar.y) {
            return;
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
        }
        Bundle bundle = sVar.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater D = sVar.D(bundle2);
        ViewGroup viewGroup2 = sVar.R;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = sVar.K;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + sVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) sVar.F.x.b(i10);
                if (viewGroup == null) {
                    if (!sVar.C && !sVar.B) {
                        try {
                            str = sVar.K().getResources().getResourceName(sVar.K);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(sVar.K) + " (" + str + ") for fragment " + sVar);
                    }
                } else if (!(viewGroup instanceof x)) {
                    t1.b bVar = t1.c.a;
                    t1.c.b(new t1.a(sVar, "Attempting to add fragment " + sVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    t1.c.a(sVar).getClass();
                }
            }
        }
        sVar.R = viewGroup;
        sVar.J(D, viewGroup, bundle2);
        sVar.a = 2;
    }

    public final void f() {
        s p6;
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + sVar);
        }
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = sVar.w && !sVar.v();
        com.google.firebase.messaging.t tVar = this.b;
        if (z11) {
            tVar.N(sVar.e, null);
        }
        if (!z11) {
            m0 m0Var = (m0) tVar.e;
            if (!((m0Var.d.containsKey(sVar.e) && m0Var.g) ? m0Var.h : true)) {
                String str = sVar.n;
                if (str != null && (p6 = tVar.p(str)) != null && p6.O) {
                    sVar.h = p6;
                }
                sVar.a = 0;
                return;
            }
        }
        u uVar = sVar.G;
        if (uVar != null) {
            z10 = ((m0) tVar.e).h;
        } else {
            v vVar = uVar.b;
            if (com.google.android.recaptcha.internal.a.u(vVar)) {
                z10 = true ^ vVar.isChangingConfigurations();
            }
        }
        if (z11 || z10) {
            ((m0) tVar.e).c(sVar, false);
        }
        sVar.H.l();
        sVar.Z.e(androidx.lifecycle.m.ON_DESTROY);
        sVar.a = 0;
        sVar.Q = false;
        sVar.W = false;
        sVar.A();
        if (!sVar.Q) {
            throw new w0("Fragment " + sVar + " did not call through to super.onDestroy()");
        }
        this.a.q(sVar, false);
        ArrayList s10 = tVar.s();
        int size = s10.size();
        while (i10 < size) {
            Object obj = s10.get(i10);
            i10++;
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
            sVar.h = tVar.p(str2);
        }
        tVar.B(this);
    }

    public final void g() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + sVar);
        }
        ViewGroup viewGroup = sVar.R;
        sVar.H.u(1);
        sVar.a = 1;
        sVar.Q = false;
        sVar.B();
        if (!sVar.Q) {
            throw new w0("Fragment " + sVar + " did not call through to super.onDestroyView()");
        }
        a0.l lVar = ((w1.b) new a5.n(sVar.f(), w1.b.f).l(w1.b.class)).d;
        int i10 = lVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((w1.a) lVar.b[i11]).k();
        }
        sVar.D = false;
        this.a.z(sVar, false);
        sVar.R = null;
        sVar.a0.j(null);
        sVar.A = false;
    }

    public final void h() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + sVar);
        }
        sVar.a = -1;
        sVar.Q = false;
        sVar.C();
        if (!sVar.Q) {
            throw new w0("Fragment " + sVar + " did not call through to super.onDetach()");
        }
        k0 k0Var = sVar.H;
        if (!k0Var.J) {
            k0Var.l();
            sVar.H = new k0();
        }
        this.a.r(sVar, false);
        sVar.a = -1;
        sVar.G = null;
        sVar.I = null;
        sVar.F = null;
        if (!sVar.w || sVar.v()) {
            m0 m0Var = (m0) this.b.e;
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
        if (sVar.y && sVar.A && !sVar.D) {
            if (j0.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
            }
            Bundle bundle = sVar.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            sVar.J(sVar.D(bundle2), null, bundle2);
        }
    }

    public final void j() {
        com.google.firebase.messaging.t tVar = this.b;
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
                int i10 = sVar.a;
                if (c10 == i10) {
                    if (!z11 && i10 == -1 && sVar.w && !sVar.v()) {
                        if (j0.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + sVar);
                        }
                        ((m0) tVar.e).c(sVar, true);
                        tVar.B(this);
                        if (j0.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + sVar);
                        }
                        sVar.s();
                    }
                    if (sVar.V) {
                        j0 j0Var = sVar.F;
                        if (j0Var != null && sVar.v && j0.L(sVar)) {
                            j0Var.G = true;
                        }
                        sVar.V = false;
                        sVar.H.o();
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
                            sVar.A = false;
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
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void k() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + sVar);
        }
        sVar.H.u(5);
        sVar.Z.e(androidx.lifecycle.m.ON_PAUSE);
        sVar.a = 6;
        sVar.Q = false;
        sVar.E();
        if (sVar.Q) {
            this.a.s(sVar, false);
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
                sVar.n = o0Var.x;
                sVar.r = o0Var.y;
                sVar.T = o0Var.A;
            }
            if (sVar.T) {
                return;
            }
            sVar.S = true;
        } catch (BadParcelableException e9) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + sVar, e9);
        }
    }

    public final void m() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + sVar);
        }
        r rVar = sVar.U;
        View view = rVar == null ? null : rVar.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        sVar.j().j = null;
        sVar.H.R();
        sVar.H.A(true);
        sVar.a = 7;
        sVar.Q = false;
        sVar.F();
        if (!sVar.Q) {
            throw new w0("Fragment " + sVar + " did not call through to super.onResume()");
        }
        sVar.Z.e(androidx.lifecycle.m.ON_RESUME);
        k0 k0Var = sVar.H;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(7);
        this.a.v(sVar, false);
        this.b.N(sVar.e, null);
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
        sVar.H.R();
        sVar.H.A(true);
        sVar.a = 5;
        sVar.Q = false;
        sVar.H();
        if (!sVar.Q) {
            throw new w0("Fragment " + sVar + " did not call through to super.onStart()");
        }
        sVar.Z.e(androidx.lifecycle.m.ON_START);
        k0 k0Var = sVar.H;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(5);
        this.a.x(sVar, false);
    }

    public final void o() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + sVar);
        }
        k0 k0Var = sVar.H;
        k0Var.I = true;
        k0Var.O.i = true;
        k0Var.u(4);
        sVar.Z.e(androidx.lifecycle.m.ON_STOP);
        sVar.a = 4;
        sVar.Q = false;
        sVar.I();
        if (sVar.Q) {
            this.a.y(sVar, false);
            return;
        }
        throw new w0("Fragment " + sVar + " did not call through to super.onStop()");
    }

    public p0(xe.b bVar, com.google.firebase.messaging.t tVar, ClassLoader classLoader, c0 c0Var, Bundle bundle) {
        this.a = bVar;
        this.b = tVar;
        o0 o0Var = (o0) bundle.getParcelable("state");
        s a2 = c0Var.a(o0Var.a);
        a2.e = o0Var.b;
        a2.y = o0Var.c;
        a2.B = o0Var.d;
        a2.C = true;
        a2.J = o0Var.e;
        a2.K = o0Var.f;
        a2.L = o0Var.h;
        a2.O = o0Var.n;
        a2.w = o0Var.r;
        a2.N = o0Var.s;
        a2.M = o0Var.v;
        a2.Y = androidx.lifecycle.n.values()[o0Var.w];
        a2.n = o0Var.x;
        a2.r = o0Var.y;
        a2.T = o0Var.A;
        this.c = a2;
        a2.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.M(bundle2);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public p0(xe.b bVar, com.google.firebase.messaging.t tVar, s sVar, Bundle bundle) {
        this.a = bVar;
        this.b = tVar;
        this.c = sVar;
        sVar.c = null;
        sVar.d = null;
        sVar.E = 0;
        sVar.A = false;
        sVar.v = false;
        s sVar2 = sVar.h;
        sVar.n = sVar2 != null ? sVar2.e : null;
        sVar.h = null;
        sVar.b = bundle;
        sVar.f = bundle.getBundle("arguments");
    }
}

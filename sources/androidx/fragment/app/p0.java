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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p0 {
    public final ze.b a;
    public final com.google.firebase.messaging.s b;
    public final s c;
    public boolean d = false;
    public int e = -1;

    public p0(ze.b bVar, com.google.firebase.messaging.s sVar, s sVar2) {
        this.a = bVar;
        this.b = sVar;
        this.c = sVar2;
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
        this.a.p(sVar, false);
    }

    public final void b() {
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + sVar);
        }
        s sVar2 = sVar.h;
        p0 p0Var = null;
        com.google.firebase.messaging.s sVar3 = this.b;
        if (sVar2 != null) {
            p0 p0Var2 = (p0) ((HashMap) sVar3.c).get(sVar2.e);
            if (p0Var2 == null) {
                throw new IllegalStateException("Fragment " + sVar + " declared target fragment " + sVar.h + " that does not belong to this FragmentManager!");
            }
            sVar.n = sVar.h.e;
            sVar.h = null;
            p0Var = p0Var2;
        } else {
            String str = sVar.n;
            if (str != null && (p0Var = (p0) ((HashMap) sVar3.c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(sVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(a4.w.q(sb2, sVar.n, " that does not belong to this FragmentManager!"));
            }
        }
        if (p0Var != null) {
            p0Var.j();
        }
        j0 j0Var = sVar.F;
        sVar.G = j0Var.w;
        sVar.I = j0Var.y;
        ze.b bVar = this.a;
        bVar.v(sVar, false);
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
        bVar.q(sVar, false);
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
            int i12 = 0;
            while (true) {
                obj = null;
                if (i12 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i12);
                i12++;
                ((u0) obj2).getClass();
                if (kotlin.jvm.internal.j.a(null, sVar)) {
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
        ze.b bVar = this.a;
        bVar.w(sVar, false);
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
            bVar.r(sVar, false);
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
        s p10;
        boolean K = j0.K(3);
        s sVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + sVar);
        }
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = sVar.w && !sVar.v();
        com.google.firebase.messaging.s sVar2 = this.b;
        if (z11) {
            sVar2.N(sVar.e, null);
        }
        if (!z11) {
            m0 m0Var = (m0) sVar2.e;
            if (!((m0Var.d.containsKey(sVar.e) && m0Var.g) ? m0Var.h : true)) {
                String str = sVar.n;
                if (str != null && (p10 = sVar2.p(str)) != null && p10.O) {
                    sVar.h = p10;
                }
                sVar.a = 0;
                return;
            }
        }
        u uVar = sVar.G;
        if (uVar != null) {
            z10 = ((m0) sVar2.e).h;
        } else {
            v vVar = uVar.b;
            if (com.google.android.recaptcha.internal.a.u(vVar)) {
                z10 = true ^ vVar.isChangingConfigurations();
            }
        }
        if (z11 || z10) {
            ((m0) sVar2.e).c(sVar, false);
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
        this.a.s(sVar, false);
        ArrayList s10 = sVar2.s();
        int size = s10.size();
        while (i10 < size) {
            Object obj = s10.get(i10);
            i10++;
            p0 p0Var = (p0) obj;
            if (p0Var != null) {
                s sVar3 = p0Var.c;
                if (sVar.e.equals(sVar3.n)) {
                    sVar3.h = sVar;
                    sVar3.n = null;
                }
            }
        }
        String str2 = sVar.n;
        if (str2 != null) {
            sVar.h = sVar2.p(str2);
        }
        sVar2.B(this);
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
        a0.l lVar = ((w1.b) new androidx.biometric.e(sVar.f(), w1.b.f).l(w1.b.class)).d;
        int i10 = lVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((w1.a) lVar.b[i11]).k();
        }
        sVar.D = false;
        this.a.D(sVar, false);
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
        this.a.t(sVar, false);
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
        com.google.firebase.messaging.s sVar = this.b;
        boolean z10 = this.d;
        s sVar2 = this.c;
        if (z10) {
            if (j0.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + sVar2);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z11 = false;
            while (true) {
                int c3 = c();
                int i10 = sVar2.a;
                if (c3 == i10) {
                    if (!z11 && i10 == -1 && sVar2.w && !sVar2.v()) {
                        if (j0.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + sVar2);
                        }
                        ((m0) sVar.e).c(sVar2, true);
                        sVar.B(this);
                        if (j0.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + sVar2);
                        }
                        sVar2.s();
                    }
                    if (sVar2.V) {
                        j0 j0Var = sVar2.F;
                        if (j0Var != null && sVar2.v && j0.L(sVar2)) {
                            j0Var.G = true;
                        }
                        sVar2.V = false;
                        sVar2.H.o();
                    }
                    this.d = false;
                    return;
                }
                if (c3 <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            sVar2.a = 1;
                            break;
                        case 2:
                            sVar2.A = false;
                            sVar2.a = 2;
                            break;
                        case 3:
                            if (j0.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + sVar2);
                            }
                            sVar2.a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            sVar2.a = 5;
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
                            sVar2.a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            sVar2.a = 6;
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
        sVar.H.u(5);
        sVar.Z.e(androidx.lifecycle.m.ON_PAUSE);
        sVar.a = 6;
        sVar.Q = false;
        sVar.E();
        if (sVar.Q) {
            this.a.u(sVar, false);
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
        this.a.y(sVar, false);
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
        this.a.B(sVar, false);
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
            this.a.C(sVar, false);
            return;
        }
        throw new w0("Fragment " + sVar + " did not call through to super.onStop()");
    }

    public p0(ze.b bVar, com.google.firebase.messaging.s sVar, ClassLoader classLoader, c0 c0Var, Bundle bundle) {
        this.a = bVar;
        this.b = sVar;
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

    public p0(ze.b bVar, com.google.firebase.messaging.s sVar, s sVar2, Bundle bundle) {
        this.a = bVar;
        this.b = sVar;
        this.c = sVar2;
        sVar2.c = null;
        sVar2.d = null;
        sVar2.E = 0;
        sVar2.A = false;
        sVar2.v = false;
        s sVar3 = sVar2.h;
        sVar2.n = sVar3 != null ? sVar3.e : null;
        sVar2.h = null;
        sVar2.b = bundle;
        sVar2.f = bundle.getBundle("arguments");
    }
}

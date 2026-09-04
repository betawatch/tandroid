package androidx.activity;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.i0;
import androidx.fragment.app.p0;
import androidx.fragment.app.s0;
import androidx.fragment.app.t0;
import androidx.fragment.app.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class x {
    public final Runnable a;
    public final hd.e b = new hd.e();
    public z c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public x(Runnable runnable) {
        OnBackInvokedCallback a2;
        this.a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                a2 = u.a.a(new p(this, 0), new p(this, 1), new q(this, 0), new q(this, 1));
            } else {
                a2 = s.a.a(new q(this, 2));
            }
            this.d = a2;
        }
    }

    public final void a(androidx.lifecycle.t tVar, z onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.o m10 = tVar.m();
        if (((androidx.lifecycle.v) m10).c == androidx.lifecycle.n.a) {
            return;
        }
        onBackPressedCallback.b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, m10, onBackPressedCallback));
        d();
        onBackPressedCallback.c = new w(0, this, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    public final void b() {
        z zVar;
        z zVar2 = this.c;
        if (zVar2 == null) {
            hd.e eVar = this.b;
            eVar.getClass();
            ListIterator listIterator = eVar.listIterator(eVar.c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    zVar = listIterator.previous();
                    if (((z) zVar).a) {
                        break;
                    }
                } else {
                    zVar = 0;
                    break;
                }
            }
            zVar2 = zVar;
        }
        this.c = null;
        if (zVar2 == null) {
            this.a.run();
            return;
        }
        i0 i0Var = zVar2.d;
        int i10 = 3;
        if (i0.K(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + i0Var);
        }
        z zVar3 = i0Var.j;
        ArrayList arrayList = i0Var.n;
        i0Var.i = true;
        i0Var.A(true);
        int i11 = 0;
        i0Var.i = false;
        if (i0Var.h == null) {
            if (zVar3.a) {
                if (i0.K(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                i0Var.S();
                return;
            } else {
                if (i0.K(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                i0Var.g.b();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(i0.F(i0Var.h));
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = i0Var.h.a;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            androidx.fragment.app.r rVar = ((p0) obj2).b;
            if (rVar != null) {
                rVar.x = false;
            }
        }
        Iterator it2 = i0Var.f(0, 1, new ArrayList(Collections.singletonList(i0Var.h))).iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.k kVar = (androidx.fragment.app.k) it2.next();
            ArrayList operations = kVar.c;
            if (i0.K(i10)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            kVar.e(operations);
            kVar.getClass();
            kotlin.jvm.internal.i.e(operations, "operations");
            ArrayList arrayList3 = operations;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((t0) it3.next()).getClass();
                hd.m.e(arrayList4, null);
            }
            List m10 = hd.g.m(hd.g.p(arrayList4));
            int size3 = m10.size();
            for (int i14 = 0; i14 < size3; i14++) {
                ((s0) m10.get(i14)).a(kVar.a);
            }
            int size4 = operations.size();
            for (int i15 = 0; i15 < size4; i15++) {
                kVar.a((t0) operations.get(i15));
            }
            List m11 = hd.g.m(arrayList3);
            if (m11.size() > 0) {
                ((t0) m11.get(0)).getClass();
                throw null;
            }
            i10 = 3;
        }
        ArrayList arrayList5 = i0Var.h.a;
        int size5 = arrayList5.size();
        while (i11 < size5) {
            Object obj3 = arrayList5.get(i11);
            i11++;
            androidx.fragment.app.r rVar2 = ((p0) obj3).b;
            if (rVar2 != null && rVar2.V == null) {
                i0Var.g(rVar2).j();
            }
        }
        i0Var.h = null;
        i0Var.h0();
        if (i0.K(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + zVar3.a + " for  FragmentManager " + i0Var);
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        s sVar = s.a;
        if (z10 && !this.f) {
            sVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z10 || !this.f) {
                return;
            }
            sVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z10 = this.g;
        boolean z11 = false;
        hd.e eVar = this.b;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((z) it.next()).a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z11);
    }
}

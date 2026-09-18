package androidx.activity;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.b0;
import androidx.fragment.app.k0;
import androidx.fragment.app.r0;
import androidx.fragment.app.u0;
import androidx.fragment.app.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class v {
    public final Runnable a;
    public final hd.e b = new hd.e();
    public b0 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public v(Runnable runnable) {
        OnBackInvokedCallback a2;
        this.a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                a2 = s.a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1));
            } else {
                a2 = q.a.a(new p(this, 2));
            }
            this.d = a2;
        }
    }

    public final void a(androidx.lifecycle.t tVar, b0 onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.o m10 = tVar.m();
        if (((androidx.lifecycle.v) m10).c == androidx.lifecycle.n.a) {
            return;
        }
        onBackPressedCallback.b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, m10, onBackPressedCallback));
        d();
        onBackPressedCallback.c = new u(0, this, v.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    public final void b() {
        b0 b0Var;
        b0 b0Var2 = this.c;
        if (b0Var2 == null) {
            hd.e eVar = this.b;
            eVar.getClass();
            ListIterator listIterator = eVar.listIterator(eVar.c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    b0Var = listIterator.previous();
                    if (((b0) b0Var).a) {
                        break;
                    }
                } else {
                    b0Var = 0;
                    break;
                }
            }
            b0Var2 = b0Var;
        }
        this.c = null;
        if (b0Var2 == null) {
            this.a.run();
            return;
        }
        k0 k0Var = b0Var2.d;
        int i10 = 3;
        if (k0.K(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + k0Var);
        }
        b0 b0Var3 = k0Var.j;
        ArrayList arrayList = k0Var.n;
        k0Var.i = true;
        k0Var.A(true);
        int i11 = 0;
        k0Var.i = false;
        if (k0Var.h == null) {
            if (b0Var3.a) {
                if (k0.K(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                k0Var.S();
                return;
            } else {
                if (k0.K(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                k0Var.g.b();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(k0.F(k0Var.h));
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
        ArrayList arrayList2 = k0Var.h.a;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            androidx.fragment.app.s sVar = ((r0) obj2).b;
            if (sVar != null) {
                sVar.x = false;
            }
        }
        Iterator it2 = k0Var.f(0, 1, new ArrayList(Collections.singletonList(k0Var.h))).iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.l lVar = (androidx.fragment.app.l) it2.next();
            ArrayList operations = lVar.c;
            if (k0.K(i10)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            lVar.e(operations);
            lVar.getClass();
            kotlin.jvm.internal.i.e(operations, "operations");
            ArrayList arrayList3 = operations;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((v0) it3.next()).getClass();
                hd.m.e(arrayList4, null);
            }
            List m10 = hd.g.m(hd.g.p(arrayList4));
            int size3 = m10.size();
            for (int i14 = 0; i14 < size3; i14++) {
                ((u0) m10.get(i14)).a(lVar.a);
            }
            int size4 = operations.size();
            for (int i15 = 0; i15 < size4; i15++) {
                lVar.a((v0) operations.get(i15));
            }
            List m11 = hd.g.m(arrayList3);
            if (m11.size() > 0) {
                ((v0) m11.get(0)).getClass();
                throw null;
            }
            i10 = 3;
        }
        ArrayList arrayList5 = k0Var.h.a;
        int size5 = arrayList5.size();
        while (i11 < size5) {
            Object obj3 = arrayList5.get(i11);
            i11++;
            androidx.fragment.app.s sVar2 = ((r0) obj3).b;
            if (sVar2 != null && sVar2.V == null) {
                k0Var.g(sVar2).j();
            }
        }
        k0Var.h = null;
        k0Var.h0();
        if (k0.K(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + b0Var3.a + " for  FragmentManager " + k0Var);
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        q qVar = q.a;
        if (z10 && !this.f) {
            qVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z10 || !this.f) {
                return;
            }
            qVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
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
                } else if (((b0) it.next()).a) {
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

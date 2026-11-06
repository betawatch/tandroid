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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w {
    public final Runnable a;
    public final hd.d b = new hd.d();
    public z c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public w(Runnable runnable) {
        OnBackInvokedCallback a10;
        this.a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            if (i7 >= 34) {
                a10 = t.a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1));
            } else {
                a10 = r.a.a(new p(this, 2));
            }
            this.d = a10;
        }
    }

    public final void a(androidx.lifecycle.t tVar, z onBackPressedCallback) {
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.o m10 = tVar.m();
        if (((androidx.lifecycle.v) m10).c == androidx.lifecycle.n.a) {
            return;
        }
        onBackPressedCallback.b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, m10, onBackPressedCallback));
        d();
        onBackPressedCallback.c = new v(0, this, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    public final void b() {
        z zVar;
        z zVar2 = this.c;
        if (zVar2 == null) {
            hd.d dVar = this.b;
            dVar.getClass();
            ListIterator listIterator = dVar.listIterator(dVar.c);
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
        int i7 = 3;
        if (i0.K(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + i0Var);
        }
        z zVar3 = i0Var.j;
        ArrayList arrayList = i0Var.n;
        i0Var.i = true;
        i0Var.A(true);
        int i10 = 0;
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
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
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
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            androidx.fragment.app.r rVar = ((p0) obj2).b;
            if (rVar != null) {
                rVar.y = false;
            }
        }
        Iterator it2 = i0Var.f(0, 1, new ArrayList(Collections.singletonList(i0Var.h))).iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.k kVar = (androidx.fragment.app.k) it2.next();
            ArrayList operations = kVar.c;
            if (i0.K(i7)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            kVar.e(operations);
            kVar.getClass();
            kotlin.jvm.internal.j.e(operations, "operations");
            ArrayList arrayList3 = operations;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((t0) it3.next()).getClass();
                hd.l.e(null, arrayList4);
            }
            List l10 = hd.f.l(hd.f.o(arrayList4));
            int size3 = l10.size();
            int i13 = 0;
            while (i13 < size3) {
                ((s0) l10.get(i13)).a(kVar.a);
                i13++;
                i7 = i7;
            }
            int i14 = i7;
            int size4 = operations.size();
            for (int i15 = 0; i15 < size4; i15++) {
                kVar.a((t0) operations.get(i15));
            }
            List l11 = hd.f.l(arrayList3);
            if (l11.size() > 0) {
                ((t0) l11.get(0)).getClass();
                throw null;
            }
            i7 = i14;
        }
        int i16 = i7;
        ArrayList arrayList5 = i0Var.h.a;
        int size5 = arrayList5.size();
        while (i10 < size5) {
            Object obj3 = arrayList5.get(i10);
            i10++;
            androidx.fragment.app.r rVar2 = ((p0) obj3).b;
            if (rVar2 != null && rVar2.V == null) {
                i0Var.g(rVar2).j();
            }
        }
        i0Var.h = null;
        i0Var.h0();
        if (i0.K(i16)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + zVar3.a + " for  FragmentManager " + i0Var);
        }
    }

    public final void c(boolean z9) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        r rVar = r.a;
        if (z9 && !this.f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z9 || !this.f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z9 = this.g;
        boolean z10 = false;
        hd.d dVar = this.b;
        if (dVar == null || !dVar.isEmpty()) {
            Iterator it = dVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((z) it.next()).a) {
                    z10 = true;
                    break;
                }
            }
        }
        this.g = z10;
        if (z10 == z9 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z10);
    }
}

package androidx.activity;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.a0;
import androidx.fragment.app.j0;
import androidx.fragment.app.q0;
import androidx.fragment.app.t0;
import androidx.fragment.app.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class w {
    public final Runnable a;
    public final hd.d b = new hd.d();
    public a0 c;
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

    public final void a(androidx.lifecycle.t tVar, a0 onBackPressedCallback) {
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
        a0 a0Var;
        a0 a0Var2 = this.c;
        if (a0Var2 == null) {
            hd.d dVar = this.b;
            dVar.getClass();
            ListIterator listIterator = dVar.listIterator(dVar.c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    a0Var = listIterator.previous();
                    if (((a0) a0Var).a) {
                        break;
                    }
                } else {
                    a0Var = 0;
                    break;
                }
            }
            a0Var2 = a0Var;
        }
        this.c = null;
        if (a0Var2 == null) {
            this.a.run();
            return;
        }
        j0 j0Var = a0Var2.d;
        int i7 = 3;
        if (j0.K(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + j0Var);
        }
        a0 a0Var3 = j0Var.j;
        ArrayList arrayList = j0Var.n;
        j0Var.i = true;
        j0Var.A(true);
        int i10 = 0;
        j0Var.i = false;
        if (j0Var.h == null) {
            if (a0Var3.a) {
                if (j0.K(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                j0Var.S();
                return;
            } else {
                if (j0.K(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                j0Var.g.b();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(j0.F(j0Var.h));
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
        ArrayList arrayList2 = j0Var.h.a;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            androidx.fragment.app.s sVar = ((q0) obj2).b;
            if (sVar != null) {
                sVar.y = false;
            }
        }
        Iterator it2 = j0Var.f(0, 1, new ArrayList(Collections.singletonList(j0Var.h))).iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.l lVar = (androidx.fragment.app.l) it2.next();
            ArrayList operations = lVar.c;
            if (j0.K(i7)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            lVar.e(operations);
            lVar.getClass();
            kotlin.jvm.internal.j.e(operations, "operations");
            ArrayList arrayList3 = operations;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((u0) it3.next()).getClass();
                hd.l.e(null, arrayList4);
            }
            List l10 = hd.f.l(hd.f.o(arrayList4));
            int size3 = l10.size();
            int i13 = 0;
            while (i13 < size3) {
                ((t0) l10.get(i13)).a(lVar.a);
                i13++;
                i7 = i7;
            }
            int i14 = i7;
            int size4 = operations.size();
            for (int i15 = 0; i15 < size4; i15++) {
                lVar.a((u0) operations.get(i15));
            }
            List l11 = hd.f.l(arrayList3);
            if (l11.size() > 0) {
                ((u0) l11.get(0)).getClass();
                throw null;
            }
            i7 = i14;
        }
        int i16 = i7;
        ArrayList arrayList5 = j0Var.h.a;
        int size5 = arrayList5.size();
        while (i10 < size5) {
            Object obj3 = arrayList5.get(i10);
            i10++;
            androidx.fragment.app.s sVar2 = ((q0) obj3).b;
            if (sVar2 != null && sVar2.W == null) {
                j0Var.g(sVar2).j();
            }
        }
        j0Var.h = null;
        j0Var.h0();
        if (j0.K(i16)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + a0Var3.a + " for  FragmentManager " + j0Var);
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        r rVar = r.a;
        if (z10 && !this.f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z10 || !this.f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z10 = this.g;
        boolean z11 = false;
        hd.d dVar = this.b;
        if (dVar == null || !dVar.isEmpty()) {
            Iterator it = dVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((a0) it.next()).a) {
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

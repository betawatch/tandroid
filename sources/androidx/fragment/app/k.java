package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class k {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public k(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        this.a = container;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(t0 operation) {
        kotlin.jvm.internal.j.e(operation, "operation");
        if (operation.b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z9) {
        if (i0.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((t0) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((t0) listIterator.previous()).getClass();
            throw null;
        }
        if (i0.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        ((t0) arrayList.get(hd.g.b(arrayList))).getClass();
        if (arrayList.size() > 0) {
            ((t0) arrayList.get(0)).getClass();
            throw null;
        }
        if (arrayList.size() > 0) {
            t0 t0Var = (t0) arrayList.get(0);
            arrayList2.add(new f(t0Var, z9));
            t0Var.getClass();
            new j(t0Var);
            if (!z9) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            if (!((j) obj).a()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList4.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList4.get(i10);
            i10++;
            ((j) obj2).getClass();
        }
        int size3 = arrayList5.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList5.get(i11);
            i11++;
            ((j) obj3).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (arrayList2.size() > 0) {
            ((f) arrayList2.get(0)).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        int size4 = arrayList2.size();
        int i12 = 0;
        while (i12 < size4) {
            Object obj4 = arrayList2.get(i12);
            i12++;
            f fVar = (f) obj4;
            Context context = this.a.getContext();
            fVar.getClass();
            kotlin.jvm.internal.j.d(context, "context");
            q4.q b10 = fVar.b(context);
            if (b10 != null) {
                if (((AnimatorSet) b10.c) != null) {
                    throw null;
                }
                arrayList6.add(fVar);
            }
        }
        if (arrayList6.size() <= 0) {
            return;
        }
        ((f) arrayList6.get(0)).getClass();
        throw null;
    }

    public final void c() {
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            d();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList n10 = hd.f.n(this.c);
                this.c.clear();
                int size = n10.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = n10.get(i7);
                    i7++;
                    t0 t0Var = (t0) obj;
                    if (!this.b.isEmpty()) {
                        t0Var.getClass();
                        throw null;
                    }
                    t0Var.getClass();
                }
                int size2 = n10.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = n10.get(i10);
                    i10++;
                    t0 t0Var2 = (t0) obj2;
                    if (this.d) {
                        if (i0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + t0Var2);
                        }
                        t0Var2.b();
                        throw null;
                    }
                    if (i0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + t0Var2);
                    }
                    t0Var2.a(this.a);
                    this.d = false;
                    this.c.add(t0Var2);
                }
                if (!this.b.isEmpty()) {
                    f();
                    ArrayList n11 = hd.f.n(this.b);
                    if (n11.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(n11);
                    if (i0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(n11, this.e);
                    int i11 = 0;
                    if (n11.size() > 0) {
                        ((t0) n11.get(0)).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size3 = n11.size();
                    while (i11 < size3) {
                        Object obj3 = n11.get(i11);
                        i11++;
                        ((t0) obj3).getClass();
                        hd.l.e(null, arrayList);
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    boolean z9 = !isEmpty;
                    if (n11.size() > 0) {
                        ((t0) n11.get(0)).getClass();
                        throw null;
                    }
                    this.d = !z9;
                    if (i0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z9 + " \ntransition = true");
                    }
                    if (!isEmpty) {
                        e(n11);
                        int size4 = n11.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            a((t0) n11.get(i12));
                        }
                    }
                    this.e = false;
                    if (i0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (i0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                f();
                e(this.b);
                ArrayList n10 = hd.f.n(this.c);
                int size = n10.size();
                int i7 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = n10.get(i10);
                    i10++;
                    ((t0) obj).getClass();
                }
                int size2 = n10.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = n10.get(i11);
                    i11++;
                    t0 t0Var = (t0) obj2;
                    if (i0.K(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + t0Var);
                    }
                    t0Var.a(this.a);
                }
                ArrayList n11 = hd.f.n(this.b);
                int size3 = n11.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = n11.get(i12);
                    i12++;
                    ((t0) obj3).getClass();
                }
                int size4 = n11.size();
                while (i7 < size4) {
                    Object obj4 = n11.get(i7);
                    i7++;
                    t0 t0Var2 = (t0) obj4;
                    if (i0.K(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + t0Var2);
                    }
                    t0Var2.a(this.a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            t0 t0Var = (t0) list.get(i7);
            t0Var.getClass();
            if (!t0Var.a) {
                t0Var.a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((t0) it.next()).getClass();
            hd.l.e(null, arrayList);
        }
        List l10 = hd.f.l(hd.f.o(arrayList));
        int size2 = l10.size();
        for (int i10 = 0; i10 < size2; i10++) {
            s0 s0Var = (s0) l10.get(i10);
            s0Var.getClass();
            ViewGroup container = this.a;
            kotlin.jvm.internal.j.e(container, "container");
            if (!s0Var.a) {
                s0Var.c(container);
            }
            s0Var.a = true;
        }
    }

    public final void f() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((t0) obj).getClass();
        }
    }
}

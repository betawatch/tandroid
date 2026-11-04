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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public l(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        this.a = container;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(u0 operation) {
        kotlin.jvm.internal.j.e(operation, "operation");
        if (operation.b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z10) {
        if (j0.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((u0) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((u0) listIterator.previous()).getClass();
            throw null;
        }
        if (j0.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        ((u0) arrayList.get(ed.h.b(arrayList))).getClass();
        if (arrayList.size() > 0) {
            ((u0) arrayList.get(0)).getClass();
            throw null;
        }
        if (arrayList.size() > 0) {
            u0 u0Var = (u0) arrayList.get(0);
            arrayList2.add(new f(u0Var, z10));
            u0Var.getClass();
            new k(u0Var);
            if (!z10) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
            if (!((k) obj).a()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList4.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList4.get(i10);
            i10++;
            ((k) obj2).getClass();
        }
        int size3 = arrayList5.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList5.get(i11);
            i11++;
            ((k) obj3).getClass();
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
            tf.b b10 = fVar.b(context);
            if (b10 != null) {
                if (((AnimatorSet) b10.b) != null) {
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
                ArrayList n4 = ed.g.n(this.c);
                this.c.clear();
                int size = n4.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = n4.get(i3);
                    i3++;
                    u0 u0Var = (u0) obj;
                    if (!this.b.isEmpty()) {
                        u0Var.getClass();
                        throw null;
                    }
                    u0Var.getClass();
                }
                int size2 = n4.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = n4.get(i10);
                    i10++;
                    u0 u0Var2 = (u0) obj2;
                    if (this.d) {
                        if (j0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + u0Var2);
                        }
                        u0Var2.b();
                        throw null;
                    }
                    if (j0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u0Var2);
                    }
                    u0Var2.a(this.a);
                    this.d = false;
                    this.c.add(u0Var2);
                }
                if (!this.b.isEmpty()) {
                    f();
                    ArrayList n10 = ed.g.n(this.b);
                    if (n10.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(n10);
                    if (j0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(n10, this.e);
                    int i11 = 0;
                    if (n10.size() > 0) {
                        ((u0) n10.get(0)).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size3 = n10.size();
                    while (i11 < size3) {
                        Object obj3 = n10.get(i11);
                        i11++;
                        ((u0) obj3).getClass();
                        ed.m.e(null, arrayList);
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    boolean z10 = !isEmpty;
                    if (n10.size() > 0) {
                        ((u0) n10.get(0)).getClass();
                        throw null;
                    }
                    this.d = !z10;
                    if (j0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z10 + " \ntransition = true");
                    }
                    if (!isEmpty) {
                        e(n10);
                        int size4 = n10.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            a((u0) n10.get(i12));
                        }
                    }
                    this.e = false;
                    if (j0.K(2)) {
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
        if (j0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                f();
                e(this.b);
                ArrayList n4 = ed.g.n(this.c);
                int size = n4.size();
                int i3 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = n4.get(i10);
                    i10++;
                    ((u0) obj).getClass();
                }
                int size2 = n4.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = n4.get(i11);
                    i11++;
                    u0 u0Var = (u0) obj2;
                    if (j0.K(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + u0Var);
                    }
                    u0Var.a(this.a);
                }
                ArrayList n10 = ed.g.n(this.b);
                int size3 = n10.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = n10.get(i12);
                    i12++;
                    ((u0) obj3).getClass();
                }
                int size4 = n10.size();
                while (i3 < size4) {
                    Object obj4 = n10.get(i3);
                    i3++;
                    u0 u0Var2 = (u0) obj4;
                    if (j0.K(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + u0Var2);
                    }
                    u0Var2.a(this.a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            u0 u0Var = (u0) list.get(i3);
            u0Var.getClass();
            if (!u0Var.a) {
                u0Var.a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).getClass();
            ed.m.e(null, arrayList);
        }
        List l10 = ed.g.l(ed.g.o(arrayList));
        int size2 = l10.size();
        for (int i10 = 0; i10 < size2; i10++) {
            t0 t0Var = (t0) l10.get(i10);
            t0Var.getClass();
            ViewGroup container = this.a;
            kotlin.jvm.internal.j.e(container, "container");
            if (!t0Var.a) {
                t0Var.c(container);
            }
            t0Var.a = true;
        }
    }

    public final void f() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((u0) obj).getClass();
        }
    }
}

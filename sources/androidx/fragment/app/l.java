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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public final void b(ArrayList arrayList, boolean z4) {
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
        ((u0) arrayList.get(tc.h.b(arrayList))).getClass();
        if (arrayList.size() > 0) {
            ((u0) arrayList.get(0)).getClass();
            throw null;
        }
        if (arrayList.size() > 0) {
            u0 u0Var = (u0) arrayList.get(0);
            arrayList2.add(new f(u0Var, z4));
            u0Var.getClass();
            new k(u0Var);
            if (!z4) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            if (!((k) obj).a()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            ((k) obj2).getClass();
        }
        int size3 = arrayList5.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList5.get(i12);
            i12++;
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
        int i13 = 0;
        while (i13 < size4) {
            Object obj4 = arrayList2.get(i13);
            i13++;
            f fVar = (f) obj4;
            Context context = this.a.getContext();
            fVar.getClass();
            kotlin.jvm.internal.j.d(context, "context");
            bf.b b10 = fVar.b(context);
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
                ArrayList o10 = tc.g.o(this.c);
                this.c.clear();
                int size = o10.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = o10.get(i10);
                    i10++;
                    u0 u0Var = (u0) obj;
                    if (!this.b.isEmpty()) {
                        u0Var.getClass();
                        throw null;
                    }
                    u0Var.getClass();
                }
                int size2 = o10.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = o10.get(i11);
                    i11++;
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
                    ArrayList o11 = tc.g.o(this.b);
                    if (o11.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(o11);
                    if (j0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(o11, this.e);
                    int i12 = 0;
                    if (o11.size() > 0) {
                        ((u0) o11.get(0)).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size3 = o11.size();
                    while (i12 < size3) {
                        Object obj3 = o11.get(i12);
                        i12++;
                        ((u0) obj3).getClass();
                        tc.m.e(arrayList, null);
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    boolean z4 = !isEmpty;
                    if (o11.size() > 0) {
                        ((u0) o11.get(0)).getClass();
                        throw null;
                    }
                    this.d = !z4;
                    if (j0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z4 + " \ntransition = true");
                    }
                    if (!isEmpty) {
                        e(o11);
                        int size4 = o11.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            a((u0) o11.get(i13));
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
                ArrayList o10 = tc.g.o(this.c);
                int size = o10.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = o10.get(i11);
                    i11++;
                    ((u0) obj).getClass();
                }
                int size2 = o10.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = o10.get(i12);
                    i12++;
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
                ArrayList o11 = tc.g.o(this.b);
                int size3 = o11.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = o11.get(i13);
                    i13++;
                    ((u0) obj3).getClass();
                }
                int size4 = o11.size();
                while (i10 < size4) {
                    Object obj4 = o11.get(i10);
                    i10++;
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
        for (int i10 = 0; i10 < size; i10++) {
            u0 u0Var = (u0) list.get(i10);
            u0Var.getClass();
            if (!u0Var.a) {
                u0Var.a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).getClass();
            tc.m.e(arrayList, null);
        }
        List m9 = tc.g.m(tc.g.p(arrayList));
        int size2 = m9.size();
        for (int i11 = 0; i11 < size2; i11++) {
            t0 t0Var = (t0) m9.get(i11);
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u0) obj).getClass();
        }
    }
}

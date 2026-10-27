package e2;

import a8.yb;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.d3;
import m.l1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public c(View view) {
        this.a = -1;
        this.b = view;
        this.c = m.q.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 < r3.b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j10, x xVar) {
        int i10;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        if (j10 != -9223372036854775807L && (i10 = this.a) != 0) {
            if (i10 != -1 && priorityQueue.size() >= this.a) {
                f2.v vVar = (f2.v) priorityQueue.peek();
                String str = n0.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            x xVar2 = arrayDeque2.isEmpty() ? new x() : (x) arrayDeque2.pop();
            xVar2.K(xVar.a());
            System.arraycopy(xVar.a, xVar.b, xVar2.a, 0, xVar2.a());
            f2.v vVar2 = (f2.v) this.f;
            if (vVar2 != null && j10 == vVar2.b) {
                vVar2.a.add(xVar2);
                return;
            }
            f2.v vVar3 = arrayDeque.isEmpty() ? new f2.v() : (f2.v) arrayDeque.pop();
            ArrayList arrayList = vVar3.a;
            yb.g(j10 != -9223372036854775807L);
            yb.p(arrayList.isEmpty());
            vVar3.b = j10;
            arrayList.add(xVar2);
            priorityQueue.add(vVar3);
            this.f = vVar3;
            int i11 = this.a;
            if (i11 != -1) {
                c(i11);
                return;
            }
            return;
        }
        ((f2.w) this.b).e(j10, xVar);
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((d3) this.d) != null) {
                if (((d3) this.f) == null) {
                    this.f = new d3();
                }
                d3 d3Var = (d3) this.f;
                d3Var.c = null;
                d3Var.b = false;
                d3Var.d = null;
                d3Var.a = false;
                WeakHashMap weakHashMap = r0.i0.a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    d3Var.b = true;
                    d3Var.c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    d3Var.a = true;
                    d3Var.d = d;
                }
                if (d3Var.b || d3Var.a) {
                    m.q.d(background, d3Var, view.getDrawableState());
                    return;
                }
            }
            d3 d3Var2 = (d3) this.e;
            if (d3Var2 != null) {
                m.q.d(background, d3Var2, view.getDrawableState());
                return;
            }
            d3 d3Var3 = (d3) this.d;
            if (d3Var3 != null) {
                m.q.d(background, d3Var3, view.getDrawableState());
            }
        }
    }

    public void c(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.v vVar = (f2.v) priorityQueue.poll();
            String str = n0.a;
            int i11 = 0;
            while (true) {
                arrayList = vVar.a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.w) this.b).e(vVar.b, (x) arrayList.get(i11));
                ((ArrayDeque) this.c).push((x) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.v vVar2 = (f2.v) this.f;
            if (vVar2 != null && vVar2.b == vVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(vVar);
        }
    }

    public ColorStateList d() {
        d3 d3Var = (d3) this.e;
        if (d3Var != null) {
            return (ColorStateList) d3Var.c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        d3 d3Var = (d3) this.e;
        if (d3Var != null) {
            return (PorterDuff.Mode) d3Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = f.a.z;
        k6.c D = k6.c.D(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) D.c;
        View view2 = (View) this.b;
        r0.i0.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) D.c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.c;
                Context context2 = view.getContext();
                int i12 = this.a;
                synchronized (qVar) {
                    i11 = qVar.a.i(context2, i12);
                }
                if (i11 != null) {
                    j(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, D.v(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            D.E();
        } catch (Throwable th2) {
            D.E();
            throw th2;
        }
    }

    public void g() {
        this.a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.a = i10;
        m.q qVar = (m.q) this.c;
        if (qVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        i0 i0Var = (i0) this.b;
        if (i0Var.a.getLooper().getThread().isAlive()) {
            i0Var.d(runnable);
        }
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((d3) this.d) == null) {
                this.d = new d3();
            }
            d3 d3Var = (d3) this.d;
            d3Var.c = colorStateList;
            d3Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void k(int i10) {
        yb.p(i10 >= 0);
        this.a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((d3) this.e) == null) {
            this.e = new d3();
        }
        d3 d3Var = (d3) this.e;
        d3Var.c = colorStateList;
        d3Var.b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((d3) this.e) == null) {
            this.e = new d3();
        }
        d3 d3Var = (d3) this.e;
        d3Var.d = mode;
        d3Var.a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        i2.j0 j0Var = ((i2.x) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        j0Var.F1();
        j0Var.t1(1, 10, num);
        j0Var.t1(2, 10, num);
        j0Var.m.e(21, new i2.w(intValue, 1));
    }

    public c(f2.w wVar) {
        this.b = wVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, g0 g0Var, i2.x xVar) {
        this.b = g0Var.a(looper, null);
        this.c = g0Var.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = xVar;
    }
}

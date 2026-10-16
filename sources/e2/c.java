package e2;

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
import m.f3;
import m.h3;
import m.n1;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        this.c = m.s.a();
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
                f2.u uVar = (f2.u) priorityQueue.peek();
                String str = m0.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            x xVar2 = arrayDeque2.isEmpty() ? new x() : (x) arrayDeque2.pop();
            xVar2.K(xVar.a());
            System.arraycopy(xVar.a, xVar.b, xVar2.a, 0, xVar2.a());
            f2.u uVar2 = (f2.u) this.f;
            if (uVar2 != null && j10 == uVar2.b) {
                uVar2.a.add(xVar2);
                return;
            }
            f2.u uVar3 = arrayDeque.isEmpty() ? new f2.u() : (f2.u) arrayDeque.pop();
            ArrayList arrayList = uVar3.a;
            u6.g(j10 != -9223372036854775807L);
            u6.p(arrayList.isEmpty());
            uVar3.b = j10;
            arrayList.add(xVar2);
            priorityQueue.add(uVar3);
            this.f = uVar3;
            int i11 = this.a;
            if (i11 != -1) {
                c(i11);
                return;
            }
            return;
        }
        ((f2.v) this.b).a(j10, xVar);
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((f3) this.d) != null) {
                if (((f3) this.f) == null) {
                    this.f = new f3();
                }
                f3 f3Var = (f3) this.f;
                f3Var.c = null;
                f3Var.b = false;
                f3Var.d = null;
                f3Var.a = false;
                WeakHashMap weakHashMap = r0.i0.a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    f3Var.b = true;
                    f3Var.c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    f3Var.a = true;
                    f3Var.d = d;
                }
                if (f3Var.b || f3Var.a) {
                    m.s.d(background, f3Var, view.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.e;
            if (f3Var2 != null) {
                m.s.d(background, f3Var2, view.getDrawableState());
                return;
            }
            f3 f3Var3 = (f3) this.d;
            if (f3Var3 != null) {
                m.s.d(background, f3Var3, view.getDrawableState());
            }
        }
    }

    public void c(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.u uVar = (f2.u) priorityQueue.poll();
            String str = m0.a;
            int i11 = 0;
            while (true) {
                arrayList = uVar.a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.v) this.b).a(uVar.b, (x) arrayList.get(i11));
                ((ArrayDeque) this.c).push((x) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.u uVar2 = (f2.u) this.f;
            if (uVar2 != null && uVar2.b == uVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(uVar);
        }
    }

    public ColorStateList d() {
        f3 f3Var = (f3) this.e;
        if (f3Var != null) {
            return (ColorStateList) f3Var.c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        f3 f3Var = (f3) this.e;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = f.a.z;
        h3 P = h3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.c;
        View view2 = (View) this.b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) P.c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                m.s sVar = (m.s) this.c;
                Context context2 = view.getContext();
                int i12 = this.a;
                synchronized (sVar) {
                    i11 = sVar.a.i(context2, i12);
                }
                if (i11 != null) {
                    j(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, P.E(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, n1.b(typedArray.getInt(2, -1), null));
            }
            P.Q();
        } catch (Throwable th2) {
            P.Q();
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
        m.s sVar = (m.s) this.c;
        if (sVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (sVar) {
                colorStateList = sVar.a.i(context, i10);
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
            if (((f3) this.d) == null) {
                this.d = new f3();
            }
            f3 f3Var = (f3) this.d;
            f3Var.c = colorStateList;
            f3Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void k(int i10) {
        u6.p(i10 >= 0);
        this.a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((f3) this.e) == null) {
            this.e = new f3();
        }
        f3 f3Var = (f3) this.e;
        f3Var.c = colorStateList;
        f3Var.b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((f3) this.e) == null) {
            this.e = new f3();
        }
        f3 f3Var = (f3) this.e;
        f3Var.d = mode;
        f3Var.a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        i2.h0 h0Var = ((i2.w) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        h0Var.F1();
        h0Var.t1(1, 10, num);
        h0Var.t1(2, 10, num);
        h0Var.m.e(21, new i2.v(intValue, 1));
    }

    public c(f2.v vVar) {
        this.b = vVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, g0 g0Var, i2.w wVar) {
        this.b = g0Var.a(looper, null);
        this.c = g0Var.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = wVar;
    }
}

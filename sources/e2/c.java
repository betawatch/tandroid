package e2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import i2.f0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.c3;
import m.l1;
import r0.i0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r9 < r2.b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j3, v vVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 != -1 && priorityQueue.size() >= this.a) {
                f2.s sVar = (f2.s) priorityQueue.peek();
                String str = d0.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            v vVar2 = arrayDeque2.isEmpty() ? new v() : (v) arrayDeque2.pop();
            vVar2.G(vVar.a());
            System.arraycopy(vVar.a, vVar.b, vVar2.a, 0, vVar2.a());
            f2.s sVar2 = (f2.s) this.f;
            if (sVar2 != null && j3 == sVar2.b) {
                sVar2.a.add(vVar2);
                return;
            }
            f2.s sVar3 = arrayDeque.isEmpty() ? new f2.s() : (f2.s) arrayDeque.pop();
            ArrayList arrayList = sVar3.a;
            d.b(j3 != -9223372036854775807L);
            d.g(arrayList.isEmpty());
            sVar3.b = j3;
            arrayList.add(vVar2);
            priorityQueue.add(sVar3);
            this.f = sVar3;
            int i11 = this.a;
            if (i11 != -1) {
                c(i11);
                return;
            }
            return;
        }
        ((f2.t) this.b).a(j3, vVar);
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((c3) this.d) != null) {
                if (((c3) this.f) == null) {
                    this.f = new c3();
                }
                c3 c3Var = (c3) this.f;
                c3Var.c = null;
                c3Var.b = false;
                c3Var.d = null;
                c3Var.a = false;
                WeakHashMap weakHashMap = i0.a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.b = true;
                    c3Var.c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.a = true;
                    c3Var.d = d;
                }
                if (c3Var.b || c3Var.a) {
                    m.q.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.e;
            if (c3Var2 != null) {
                m.q.d(background, c3Var2, view.getDrawableState());
                return;
            }
            c3 c3Var3 = (c3) this.d;
            if (c3Var3 != null) {
                m.q.d(background, c3Var3, view.getDrawableState());
            }
        }
    }

    public void c(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.s sVar = (f2.s) priorityQueue.poll();
            String str = d0.a;
            int i11 = 0;
            while (true) {
                arrayList = sVar.a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.t) this.b).a(sVar.b, (v) arrayList.get(i11));
                ((ArrayDeque) this.c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.s sVar2 = (f2.s) this.f;
            if (sVar2 != null && sVar2.b == sVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(sVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:3:0x0026, B:5:0x002d, B:6:0x003d, B:9:0x0044, B:11:0x0047, B:16:0x0052, B:18:0x0053, B:20:0x005c, B:22:0x0067, B:24:0x0071, B:30:0x007f, B:32:0x0085, B:33:0x008c, B:35:0x008f, B:37:0x0096, B:39:0x00a6, B:41:0x00b0, B:45:0x00bb, B:47:0x00c1, B:48:0x00c8, B:8:0x003e), top: B:2:0x0026, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        ColorStateList i11;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = f.a.z;
        aa.a y3 = aa.a.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y3.c;
        View view2 = (View) this.b;
        i0.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) y3.c, i10);
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
                ColorStateList q6 = y3.q(1);
                int i13 = Build.VERSION.SDK_INT;
                r0.a0.g(view, q6);
                if (i13 == 21) {
                    Drawable background = view.getBackground();
                    if (r0.a0.c(view) == null && r0.a0.d(view) == null) {
                        z10 = false;
                        if (background != null && z10) {
                            if (background.isStateful()) {
                                background.setState(view.getDrawableState());
                            }
                            view.setBackground(background);
                        }
                    }
                    z10 = true;
                    if (background != null) {
                        if (background.isStateful()) {
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode b10 = l1.b(typedArray.getInt(2, -1), null);
                int i14 = Build.VERSION.SDK_INT;
                r0.a0.h(view, b10);
                if (i14 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z11 = (r0.a0.c(view) == null && r0.a0.d(view) == null) ? false : true;
                    if (background2 != null && z11) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
            y3.A();
        } catch (Throwable th2) {
            y3.A();
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
        z zVar = (z) this.b;
        if (zVar.a.getLooper().getThread().isAlive()) {
            zVar.c(runnable);
        }
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((c3) this.d) == null) {
                this.d = new c3();
            }
            c3 c3Var = (c3) this.d;
            c3Var.c = colorStateList;
            c3Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void k(int i10) {
        d.g(i10 >= 0);
        this.a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.e) == null) {
            this.e = new c3();
        }
        c3 c3Var = (c3) this.e;
        c3Var.c = colorStateList;
        c3Var.b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.e) == null) {
            this.e = new c3();
        }
        c3 c3Var = (c3) this.e;
        c3Var.d = mode;
        c3Var.a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        f0 f0Var = ((i2.x) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        f0Var.B1();
        f0Var.p1(1, 10, num);
        f0Var.p1(2, 10, num);
        f0Var.m.e(21, new i2.w(intValue, 1));
    }

    public c(f2.t tVar) {
        this.b = tVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.x xVar2) {
        this.b = xVar.a(looper, null);
        this.c = xVar.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = xVar2;
    }
}

// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lo {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public lo() {
        this.b = new a98();
        this.c = new a98();
        this.d = new a98();
        this.e = new a98();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 >= r3.b) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, ey7 ey7Var) {
        int i;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        if (j != -9223372036854775807L && (i = this.a) != 0) {
            if (i != -1 && priorityQueue.size() >= this.a) {
                sa9 sa9Var = (sa9) priorityQueue.peek();
                String str = gcc.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            ey7 ey7Var2 = arrayDeque2.isEmpty() ? new ey7() : (ey7) arrayDeque2.pop();
            ey7Var2.K(ey7Var.a());
            System.arraycopy(ey7Var.a, ey7Var.b, ey7Var2.a, 0, ey7Var2.a());
            sa9 sa9Var2 = (sa9) this.f;
            if (sa9Var2 != null && j == sa9Var2.b) {
                sa9Var2.a.add(ey7Var2);
                return;
            }
            sa9 sa9Var3 = arrayDeque.isEmpty() ? new sa9() : (sa9) arrayDeque.pop();
            ArrayList arrayList = sa9Var3.a;
            yve.f(j != -9223372036854775807L);
            yve.p(arrayList.isEmpty());
            sa9Var3.b = j;
            arrayList.add(ey7Var2);
            priorityQueue.add(sa9Var3);
            this.f = sa9Var3;
            int i2 = this.a;
            if (i2 != -1) {
                d(i2);
                return;
            }
            return;
        }
        ((ta9) this.b).n(j, ey7Var);
    }

    public final void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c34) this.d) != null) {
                c34 c34Var = (c34) this.f;
                if (c34Var == null) {
                    c34Var = new c34();
                    this.f = c34Var;
                }
                c34Var.c = null;
                c34Var.b = false;
                c34Var.d = null;
                c34Var.a = false;
                WeakHashMap weakHashMap = ihc.a;
                ColorStateList c = ahc.c(view);
                if (c != null) {
                    c34Var.b = true;
                    c34Var.c = c;
                }
                PorterDuff.Mode d = ahc.d(view);
                if (d != null) {
                    c34Var.a = true;
                    c34Var.d = d;
                }
                if (c34Var.b || c34Var.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = gp.b;
                    vd9.n(background, c34Var, drawableState);
                    return;
                }
            }
            c34 c34Var2 = (c34) this.e;
            if (c34Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = gp.b;
                vd9.n(background, c34Var2, drawableState2);
            } else {
                c34 c34Var3 = (c34) this.d;
                if (c34Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = gp.b;
                    vd9.n(background, c34Var3, drawableState3);
                }
            }
        }
    }

    public final void c() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f;
        byteBuffer.position(0);
        a98 a98Var = (a98) this.b;
        if (a98Var.f == null) {
            a98Var.a();
        }
        float[] fArr = a98Var.f;
        a98 a98Var2 = (a98) this.c;
        if (a98Var2.f == null) {
            a98Var2.a();
        }
        float[] fArr2 = a98Var2.f;
        a98 a98Var3 = (a98) this.d;
        if (a98Var3.f == null) {
            a98Var3.a();
        }
        float[] fArr3 = a98Var3.f;
        a98 a98Var4 = (a98) this.e;
        if (a98Var4.f == null) {
            a98Var4.a();
        }
        float[] fArr4 = a98Var4.f;
        for (int i = 0; i < 200; i++) {
            byteBuffer.put((byte) (fArr2[i] * 255.0f));
            byteBuffer.put((byte) (fArr3[i] * 255.0f));
            byteBuffer.put((byte) (fArr4[i] * 255.0f));
            byteBuffer.put((byte) (fArr[i] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final void d(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            sa9 sa9Var = (sa9) priorityQueue.poll();
            String str = gcc.a;
            int i2 = 0;
            while (true) {
                arrayList = sa9Var.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((ta9) this.b).n(sa9Var.b, (ey7) arrayList.get(i2));
                ((ArrayDeque) this.c).push((ey7) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            sa9 sa9Var2 = (sa9) this.f;
            if (sa9Var2 != null && sa9Var2.b == sa9Var.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(sa9Var);
        }
    }

    public final ColorStateList e() {
        c34 c34Var = (c34) this.e;
        if (c34Var != null) {
            return (ColorStateList) c34Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode f() {
        c34 c34Var = (c34) this.e;
        if (c34Var != null) {
            return (PorterDuff.Mode) c34Var.d;
        }
        return null;
    }

    public final void g(AttributeSet attributeSet, int i) {
        ColorStateList i2;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = w19.z;
        ko9 v = ko9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        View view2 = (View) this.b;
        ihc.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                gp gpVar = (gp) this.c;
                Context context2 = view.getContext();
                int i3 = this.a;
                synchronized (gpVar) {
                    try {
                        i2 = gpVar.a.i(context2, i3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i2 != null) {
                    k(i2);
                }
            }
            if (typedArray.hasValue(1)) {
                ahc.f(view, v.m(1));
            }
            if (typedArray.hasValue(2)) {
                ahc.g(view, cr3.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            v.y();
        }
    }

    public final void h() {
        this.a = -1;
        k(null);
        b();
    }

    public final void i(int i) {
        ColorStateList colorStateList;
        this.a = i;
        gp gpVar = (gp) this.c;
        if (gpVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (gpVar) {
                colorStateList = gpVar.a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        k(colorStateList);
        b();
    }

    public final void j(Runnable runnable) {
        xgb xgbVar = (xgb) this.b;
        if (xgbVar.a.getLooper().getThread().isAlive()) {
            xgbVar.e(runnable);
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (colorStateList != null) {
            c34 c34Var = (c34) this.d;
            if (c34Var == null) {
                c34Var = new c34();
                this.d = c34Var;
            }
            c34Var.c = colorStateList;
            c34Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public final void l(int i) {
        yve.p(i >= 0);
        this.a = i;
        d(i);
    }

    public final void m(ColorStateList colorStateList) {
        c34 c34Var = (c34) this.e;
        if (c34Var == null) {
            c34Var = new c34();
            this.e = c34Var;
        }
        c34Var.c = colorStateList;
        c34Var.b = true;
        b();
    }

    public final void n(PorterDuff.Mode mode) {
        c34 c34Var = (c34) this.e;
        if (c34Var == null) {
            c34Var = new c34();
            this.e = c34Var;
        }
        c34Var.d = mode;
        c34Var.a = true;
        b();
    }

    public final boolean o() {
        return ((a98) this.b).b() && ((a98) this.c).b() && ((a98) this.d).b() && ((a98) this.e).b();
    }

    public final void p(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        s64 s64Var = ((j64) this.d).b;
        ((Integer) obj2).getClass();
        int intValue = ((Integer) obj).intValue();
        s64Var.y1();
        s64Var.l.h.b(40, intValue, 0).b();
        s64Var.m.e(21, new yd(intValue, (byte) 4));
    }

    public lo(ta9 ta9Var) {
        this.b = ta9Var;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public lo(Object obj, Looper looper, Looper looper2, vgb vgbVar, j64 j64Var) {
        this.b = vgbVar.a(looper, null);
        this.c = vgbVar.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = j64Var;
    }

    public lo(int[] iArr, u1c[] u1cVarArr, int[] iArr2, int[][][] iArr3, u1c u1cVar) {
        this.b = iArr;
        this.c = u1cVarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = u1cVar;
        this.a = iArr.length;
    }

    public lo(View view) {
        this.a = -1;
        this.b = view;
        this.c = gp.a();
    }
}

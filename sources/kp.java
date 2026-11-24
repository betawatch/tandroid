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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kp {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public kp() {
        this.b = new l78();
        this.c = new l78();
        this.d = new l78();
        this.e = new l78();
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
    public final void a(long j, yw7 yw7Var) {
        int i;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        if (j != -9223372036854775807L && (i = this.a) != 0) {
            if (i != -1 && priorityQueue.size() >= this.a) {
                h99 h99Var = (h99) priorityQueue.peek();
                String str = hac.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            yw7 yw7Var2 = arrayDeque2.isEmpty() ? new yw7() : (yw7) arrayDeque2.pop();
            yw7Var2.K(yw7Var.a());
            System.arraycopy(yw7Var.a, yw7Var.b, yw7Var2.a, 0, yw7Var2.a());
            h99 h99Var2 = (h99) this.f;
            if (h99Var2 != null && j == h99Var2.b) {
                h99Var2.a.add(yw7Var2);
                return;
            }
            h99 h99Var3 = arrayDeque.isEmpty() ? new h99() : (h99) arrayDeque.pop();
            ArrayList arrayList = h99Var3.a;
            jte.f(j != -9223372036854775807L);
            jte.p(arrayList.isEmpty());
            h99Var3.b = j;
            arrayList.add(yw7Var2);
            priorityQueue.add(h99Var3);
            this.f = h99Var3;
            int i2 = this.a;
            if (i2 != -1) {
                d(i2);
                return;
            }
            return;
        }
        ((i99) this.b).t(j, yw7Var);
    }

    public final void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((s34) this.d) != null) {
                s34 s34Var = (s34) this.f;
                if (s34Var == null) {
                    s34Var = new s34();
                    this.f = s34Var;
                }
                s34Var.c = null;
                s34Var.b = false;
                s34Var.d = null;
                s34Var.a = false;
                WeakHashMap weakHashMap = kfc.a;
                ColorStateList c = cfc.c(view);
                if (c != null) {
                    s34Var.b = true;
                    s34Var.c = c;
                }
                PorterDuff.Mode d = cfc.d(view);
                if (d != null) {
                    s34Var.a = true;
                    s34Var.d = d;
                }
                if (s34Var.b || s34Var.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = fq.b;
                    hc9.n(background, s34Var, drawableState);
                    return;
                }
            }
            s34 s34Var2 = (s34) this.e;
            if (s34Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = fq.b;
                hc9.n(background, s34Var2, drawableState2);
            } else {
                s34 s34Var3 = (s34) this.d;
                if (s34Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = fq.b;
                    hc9.n(background, s34Var3, drawableState3);
                }
            }
        }
    }

    public final void c() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f;
        byteBuffer.position(0);
        l78 l78Var = (l78) this.b;
        if (l78Var.f == null) {
            l78Var.a();
        }
        float[] fArr = l78Var.f;
        l78 l78Var2 = (l78) this.c;
        if (l78Var2.f == null) {
            l78Var2.a();
        }
        float[] fArr2 = l78Var2.f;
        l78 l78Var3 = (l78) this.d;
        if (l78Var3.f == null) {
            l78Var3.a();
        }
        float[] fArr3 = l78Var3.f;
        l78 l78Var4 = (l78) this.e;
        if (l78Var4.f == null) {
            l78Var4.a();
        }
        float[] fArr4 = l78Var4.f;
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
            h99 h99Var = (h99) priorityQueue.poll();
            String str = hac.a;
            int i2 = 0;
            while (true) {
                arrayList = h99Var.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((i99) this.b).t(h99Var.b, (yw7) arrayList.get(i2));
                ((ArrayDeque) this.c).push((yw7) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            h99 h99Var2 = (h99) this.f;
            if (h99Var2 != null && h99Var2.b == h99Var.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(h99Var);
        }
    }

    public final ColorStateList e() {
        s34 s34Var = (s34) this.e;
        if (s34Var != null) {
            return (ColorStateList) s34Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode f() {
        s34 s34Var = (s34) this.e;
        if (s34Var != null) {
            return (PorterDuff.Mode) s34Var.d;
        }
        return null;
    }

    public final void g(AttributeSet attributeSet, int i) {
        ColorStateList i2;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = k09.z;
        wm9 v = wm9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        View view2 = (View) this.b;
        kfc.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                fq fqVar = (fq) this.c;
                Context context2 = view.getContext();
                int i3 = this.a;
                synchronized (fqVar) {
                    try {
                        i2 = fqVar.a.i(context2, i3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i2 != null) {
                    k(i2);
                }
            }
            if (typedArray.hasValue(1)) {
                cfc.f(view, v.i(1));
            }
            if (typedArray.hasValue(2)) {
                cfc.g(view, vr3.b(typedArray.getInt(2, -1), null));
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
        fq fqVar = (fq) this.c;
        if (fqVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (fqVar) {
                colorStateList = fqVar.a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        k(colorStateList);
        b();
    }

    public final void j(Runnable runnable) {
        dfb dfbVar = (dfb) this.b;
        if (dfbVar.a.getLooper().getThread().isAlive()) {
            dfbVar.e(runnable);
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (colorStateList != null) {
            s34 s34Var = (s34) this.d;
            if (s34Var == null) {
                s34Var = new s34();
                this.d = s34Var;
            }
            s34Var.c = colorStateList;
            s34Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public final void l(int i) {
        jte.p(i >= 0);
        this.a = i;
        d(i);
    }

    public final void m(ColorStateList colorStateList) {
        s34 s34Var = (s34) this.e;
        if (s34Var == null) {
            s34Var = new s34();
            this.e = s34Var;
        }
        s34Var.c = colorStateList;
        s34Var.b = true;
        b();
    }

    public final void n(PorterDuff.Mode mode) {
        s34 s34Var = (s34) this.e;
        if (s34Var == null) {
            s34Var = new s34();
            this.e = s34Var;
        }
        s34Var.d = mode;
        s34Var.a = true;
        b();
    }

    public final boolean o() {
        return ((l78) this.b).b() && ((l78) this.c).b() && ((l78) this.d).b() && ((l78) this.e).b();
    }

    public final void p(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        h74 h74Var = ((y64) this.d).b;
        ((Integer) obj2).getClass();
        int intValue = ((Integer) obj).intValue();
        h74Var.y1();
        h74Var.l.h.b(40, intValue, 0).b();
        h74Var.m.e(21, new pg(intValue, (byte) 4));
    }

    public kp(i99 i99Var) {
        this.b = i99Var;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public kp(Object obj, Looper looper, Looper looper2, bfb bfbVar, y64 y64Var) {
        this.b = bfbVar.a(looper, null);
        this.c = bfbVar.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = y64Var;
    }

    public kp(int[] iArr, vzb[] vzbVarArr, int[] iArr2, int[][][] iArr3, vzb vzbVar) {
        this.b = iArr;
        this.c = vzbVarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = vzbVar;
        this.a = iArr.length;
    }

    public kp(View view) {
        this.a = -1;
        this.b = view;
        this.c = fq.a();
    }
}

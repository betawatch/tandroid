package e2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.c3;
import m.l1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kc;
import org.telegram.messenger.r5;
import org.telegram.ui.Components.me0;
import org.telegram.ui.ml;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public Object b;
    public Object c;
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
                String str = l0.a;
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
            t6.f(j10 != -9223372036854775807L);
            t6.p(arrayList.isEmpty());
            vVar3.b = j10;
            arrayList.add(xVar2);
            priorityQueue.add(vVar3);
            this.f = vVar3;
            int i11 = this.a;
            if (i11 != -1) {
                e(i11);
                return;
            }
            return;
        }
        ((f2.w) this.b).a(j10, xVar);
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c3) this.d) != null) {
                if (((c3) this.f) == null) {
                    this.f = new c3();
                }
                c3 c3Var = (c3) this.f;
                c3Var.c = null;
                c3Var.b = false;
                c3Var.d = null;
                c3Var.a = false;
                WeakHashMap weakHashMap = r0.h0.a;
                ColorStateList c10 = r0.z.c(view);
                if (c10 != null) {
                    c3Var.b = true;
                    c3Var.c = c10;
                }
                PorterDuff.Mode d = r0.z.d(view);
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

    public void c() {
        this.b = null;
        if (((ml) this.f) != null) {
            Utilities.e.a((ml) this.f);
        }
        Bitmap bitmap = (Bitmap) this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.c).recycle();
        }
        this.c = null;
    }

    public void d() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f;
        byteBuffer.position(0);
        me0 me0Var = (me0) this.b;
        if (me0Var.f == null) {
            me0Var.a();
        }
        float[] fArr = me0Var.f;
        me0 me0Var2 = (me0) this.c;
        if (me0Var2.f == null) {
            me0Var2.a();
        }
        float[] fArr2 = me0Var2.f;
        me0 me0Var3 = (me0) this.d;
        if (me0Var3.f == null) {
            me0Var3.a();
        }
        float[] fArr3 = me0Var3.f;
        me0 me0Var4 = (me0) this.e;
        if (me0Var4.f == null) {
            me0Var4.a();
        }
        float[] fArr4 = me0Var4.f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public void e(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.v vVar = (f2.v) priorityQueue.poll();
            String str = l0.a;
            int i11 = 0;
            while (true) {
                arrayList = vVar.a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.w) this.b).a(vVar.b, (x) arrayList.get(i11));
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (((org.telegram.ui.ml) r8.f) != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap f(Bitmap bitmap, String str, int i10, int i11, boolean z10) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (TextUtils.equals((String) this.b, str)) {
                Bitmap bitmap2 = (Bitmap) this.c;
                if (bitmap2 != null) {
                    return bitmap2;
                }
            }
            if (((ml) this.f) != null) {
                Utilities.e.a((ml) this.f);
            }
            this.b = str;
            r5 r5Var = Utilities.e;
            ml mlVar = new ml(this, bitmap, i10, i11, str, z10);
            this.f = mlVar;
            r5Var.c(mlVar);
            return (Bitmap) this.c;
        }
        return null;
    }

    public Bitmap g(kc kcVar) {
        if (kcVar == null) {
            return null;
        }
        return f(kcVar.c, kcVar.a, kcVar.e, 0, false);
    }

    public Bitmap h(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return f(imageReceiver.n(), imageReceiver.Q, imageReceiver.U, imageReceiver.V, false);
    }

    public ColorStateList i() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.c;
        }
        return null;
    }

    public PorterDuff.Mode j() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void k(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = f.a.z;
        li.k G = li.k.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) G.c;
        View view2 = (View) this.b;
        r0.h0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) G.c, i10);
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
                    o(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.z.f(view, G.v(1));
            }
            if (typedArray.hasValue(2)) {
                r0.z.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            G.I();
        } catch (Throwable th2) {
            G.I();
            throw th2;
        }
    }

    public void l() {
        this.a = -1;
        o(null);
        b();
    }

    public void m(int i10) {
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
        o(colorStateList);
        b();
    }

    public void n(Runnable runnable) {
        i0 i0Var = (i0) this.b;
        if (i0Var.a.getLooper().getThread().isAlive()) {
            i0Var.d(runnable);
        }
    }

    public void o(ColorStateList colorStateList) {
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

    public void p(int i10) {
        t6.p(i10 >= 0);
        this.a = i10;
        e(i10);
    }

    public void q(ColorStateList colorStateList) {
        if (((c3) this.e) == null) {
            this.e = new c3();
        }
        c3 c3Var = (c3) this.e;
        c3Var.c = colorStateList;
        c3Var.b = true;
        b();
    }

    public void r(PorterDuff.Mode mode) {
        if (((c3) this.e) == null) {
            this.e = new c3();
        }
        c3 c3Var = (c3) this.e;
        c3Var.d = mode;
        c3Var.a = true;
        b();
    }

    public boolean s() {
        return ((me0) this.b).b() && ((me0) this.c).b() && ((me0) this.d).b() && ((me0) this.e).b();
    }

    public void t(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        i2.i0 i0Var = ((i2.x) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        i0Var.F1();
        i0Var.t1(1, 10, num);
        i0Var.t1(2, 10, num);
        i0Var.m.e(21, new i2.w(intValue, 1));
    }

    public c(f2.w wVar) {
        this.b = wVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public c() {
        this.b = new me0();
        this.c = new me0();
        this.d = new me0();
        this.e = new me0();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i10;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class in0 extends ScrollView implements ug.a {
    public boolean D;
    public float[] E;
    public int F;
    public float[] G;
    public int H;
    public boolean I;
    public ArrayList J;
    public final eb0 K;
    public final ArrayList L;
    public final ArrayList M;
    public final org.telegram.ui.ActionBar.p6 a;
    public final LinearLayout b;
    public final float c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Rect h;
    public final RectF n;
    public final RectF r;
    public final Matrix s;
    public Bitmap w;
    public int x;
    public int y;

    public in0(Context context, LinearLayout linearLayout, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.c = org.telegram.messenger.i0.L(16.0f);
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint(3);
        this.h = new Rect();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new Matrix();
        this.E = new float[80];
        this.G = new float[32];
        this.K = new eb0(this, 26);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.a = p6Var;
        this.b = linearLayout;
        setWillNotDraw(false);
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(z10 ? 12.0f : 4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverscrolling(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        invalidate();
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ei.m mVar = (ei.m) this.J.get(size);
            if (mVar.a != z10) {
                mVar.a = z10;
                ei.r rVar = mVar.b;
                rVar.h++;
                rVar.j += z10 ? 1 : -1;
            }
        }
    }

    public final void b(View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewParent parent = view.getParent();
        float f7 = 0.0f;
        LinearLayout linearLayout = this.b;
        float f10 = (parent == linearLayout || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (view2.getParent() != linearLayout && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            f7 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        float j10 = j(view) + linearLayout.getX();
        float k10 = (k(view) + linearLayout.getY()) - f10;
        float width = view.getWidth() + j10;
        float k11 = k(view2) + linearLayout.getY() + view2.getHeight() + f7;
        if (width <= j10 || k11 <= k10) {
            return;
        }
        int i10 = this.F;
        int i11 = i10 + 5;
        float[] fArr = this.E;
        if (i11 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.E = fArr2;
        }
        float[] fArr3 = this.E;
        int i12 = this.F;
        int i13 = i12 + 1;
        this.F = i13;
        fArr3[i12] = j10;
        int i14 = i12 + 2;
        this.F = i14;
        fArr3[i13] = k10;
        int i15 = i12 + 3;
        this.F = i15;
        fArr3[i14] = width;
        int i16 = i12 + 4;
        this.F = i16;
        fArr3[i15] = k11;
        this.F = i12 + 5;
        fArr3[i16] = view.getAlpha();
    }

    public final void c() {
        int i10 = 0;
        this.F = 0;
        ArrayList arrayList = this.M;
        arrayList.clear();
        i(this.b, 0.0f, 0.0f);
        int size = arrayList.size();
        while (true) {
            View view = null;
            View view2 = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                View view3 = (View) obj;
                if (Objects.equals(view3.getTag(), -33024) || (view3 instanceof org.telegram.ui.Cells.b9) || (view3 instanceof org.telegram.ui.Cells.c7) || (view3 instanceof org.telegram.ui.c10)) {
                    b(view, view2);
                } else {
                    if (view != null && Math.abs(view2.getAlpha() - view3.getAlpha()) > 0.1f) {
                        b(view, view2);
                        view = null;
                    }
                    if (view == null) {
                        view = view3;
                    }
                    view2 = view3;
                }
            }
            b(view, view2);
            return;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // ug.a
    public final void d(Canvas canvas, RectF rectF) {
        RectF rectF2 = this.n;
        Paint paint = this.e;
        Matrix matrix = this.s;
        LinearLayout linearLayout = this.b;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.I && getOverScrollMode() != 2) {
            canvas.save();
            try {
                canvas.clipRect(rectF);
                if (getMatrix().invert(matrix)) {
                    canvas.concat(matrix);
                }
                canvas.translate(-getX(), -getY());
                try {
                    super.drawChild(canvas, this, uptimeMillis);
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
                canvas.restore();
                return;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int i10 = org.telegram.ui.ActionBar.t6.a7;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.messenger.zs.e4);
        this.d.setColor(o10);
        if (this.y != o10) {
            this.y = o10;
            this.w = null;
        }
        float scrollX = getScrollX();
        float scrollY = getScrollY();
        RectF rectF3 = this.r;
        rectF3.set(rectF);
        rectF3.offset(scrollX, scrollY);
        c();
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var);
        canvas.save();
        try {
            canvas.clipRect(rectF);
            canvas.translate(-scrollX, -scrollY);
            for (int i11 = 0; i11 < this.F; i11 += 5) {
                float[] fArr = this.E;
                int i12 = i11 + 1;
                int i13 = i11 + 2;
                int i14 = i11 + 3;
                if (rectF3.intersects(fArr[i11], fArr[i12], fArr[i13], fArr[i14])) {
                    paint.setColor(i0.b.o(w02, Math.round(Color.alpha(w02) * Math.max(0.0f, Math.min(1.0f, this.E[i11 + 4])))));
                    float[] fArr2 = this.E;
                    rectF2.set(fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                    float f7 = this.c;
                    canvas.drawRoundRect(rectF2, f7, f7, paint);
                }
            }
            canvas.save();
            try {
                canvas.translate(linearLayout.getX(), linearLayout.getY());
                float x10 = linearLayout.getX();
                float y3 = linearLayout.getY();
                if (linearLayout instanceof hn0) {
                    hn0 hn0Var = (hn0) linearLayout;
                    for (int i15 = 0; i15 < hn0Var.getChildCount(); i15++) {
                        View childAt = hn0Var.getChildAt(i15);
                        if (childAt.getVisibility() == 0) {
                            float x11 = childAt.getX() + x10;
                            float y10 = childAt.getY() + y3;
                            if (rectF3.intersects(x11, y10, childAt.getWidth() + x11, childAt.getHeight() + y10)) {
                                hn0Var.drawChild(canvas, childAt, uptimeMillis);
                            }
                        }
                    }
                } else {
                    for (int i16 = 0; i16 < linearLayout.getChildCount(); i16++) {
                        View childAt2 = linearLayout.getChildAt(i16);
                        if (childAt2.getVisibility() == 0) {
                            float x12 = childAt2.getX() + x10;
                            float y11 = childAt2.getY() + y3;
                            if (rectF3.intersects(x12, y11, childAt2.getWidth() + x12, childAt2.getHeight() + y11)) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                childAt2.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                }
                canvas.restore();
                f(canvas, rectF3);
                canvas.restore();
            } finally {
                canvas.restore();
            }
        } catch (Throwable th4) {
            canvas.restore();
            throw th4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10;
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.a), org.telegram.messenger.zs.e4);
        Paint paint = this.d;
        paint.setColor(o10);
        if (this.y != o10) {
            this.y = o10;
            this.w = null;
        }
        c();
        if (this.D) {
            float scrollX = getScrollX();
            float scrollY = getScrollY();
            float width = scrollX + getWidth();
            float height = getHeight() + scrollY;
            LinearLayout linearLayout = this.b;
            float z11 = org.telegram.messenger.z20.z(linearLayout.getX(), linearLayout.getPaddingLeft(), width, scrollX);
            float max = Math.max(z11, Math.min(width, (linearLayout.getX() + linearLayout.getWidth()) - linearLayout.getPaddingRight()));
            boolean z12 = false;
            this.H = 0;
            for (int i10 = 0; i10 < this.F; i10 += 5) {
                float max2 = Math.max(scrollY, this.E[i10 + 1]);
                float min = Math.min(height, this.E[i10 + 3]);
                if (min > max2) {
                    int i11 = this.H;
                    int i12 = i11 + 2;
                    float[] fArr = this.G;
                    if (i12 > fArr.length) {
                        float[] fArr2 = new float[fArr.length * 2];
                        System.arraycopy(fArr, 0, fArr2, 0, i11);
                        this.G = fArr2;
                    }
                    float[] fArr3 = this.G;
                    int i13 = this.H;
                    int i14 = i13 + 1;
                    this.H = i14;
                    fArr3[i13] = max2;
                    this.H = i13 + 2;
                    fArr3[i14] = min;
                }
            }
            for (int i15 = 2; i15 < this.H; i15 += 2) {
                float[] fArr4 = this.G;
                float f12 = fArr4[i15];
                float f13 = fArr4[i15 + 1];
                int i16 = i15 - 2;
                while (i16 >= 0) {
                    float[] fArr5 = this.G;
                    float f14 = fArr5[i16];
                    if (f14 > f12) {
                        fArr5[i16 + 2] = f14;
                        fArr5[i16 + 3] = fArr5[i16 + 1];
                        i16 -= 2;
                    }
                }
                float[] fArr6 = this.G;
                fArr6[i16 + 2] = f12;
                fArr6[i16 + 3] = f13;
            }
            int i17 = 0;
            int i18 = 0;
            while (i17 < this.H) {
                float[] fArr7 = this.G;
                float f15 = fArr7[i17];
                float f16 = fArr7[i17 + 1];
                if (i18 > 0) {
                    int i19 = i18 - 1;
                    z10 = z12;
                    float f17 = fArr7[i19];
                    if (f15 <= 1.0f + f17) {
                        fArr7[i19] = Math.max(f17, f16);
                        i17 += 2;
                        z12 = z10;
                    }
                } else {
                    z10 = z12;
                }
                int i20 = i18 + 1;
                fArr7[i18] = f15;
                i18 += 2;
                fArr7[i20] = f16;
                i17 += 2;
                z12 = z10;
            }
            boolean z13 = z12;
            this.H = i18;
            if (i18 == 0 || z11 >= max) {
                canvas.drawRect(scrollX, scrollY, width, height, paint);
            } else {
                float[] fArr8 = this.G;
                float f18 = fArr8[z13 ? 1 : 0];
                float f19 = fArr8[i18 - 1];
                if (f18 > scrollY) {
                    canvas.drawRect(scrollX, scrollY, width, Math.min(height, f18 + 1.0f), paint);
                }
                if (f19 < height) {
                    canvas.drawRect(scrollX, Math.max(scrollY, f19 - 1.0f), width, height, paint);
                    f7 = height;
                } else {
                    f7 = height;
                }
                float max3 = Math.max(scrollY, f18);
                float min2 = Math.min(f7, f19);
                if (min2 > max3) {
                    canvas.drawRect(scrollX, max3, Math.min(width, z11 + 1.0f), min2, paint);
                    canvas.drawRect(Math.max(scrollX, max - 1.0f), max3, width, min2, paint);
                }
                int i21 = 2;
                while (i21 < this.H) {
                    float[] fArr9 = this.G;
                    float f20 = fArr9[i21 - 1];
                    float f21 = fArr9[i21];
                    if (f21 > f20) {
                        f10 = z11;
                        f11 = max;
                        canvas.drawRect(f10, Math.max(scrollY, f20 - 1.0f), f11, Math.min(f7, f21 + 1.0f), paint);
                    } else {
                        f10 = z11;
                        f11 = max;
                    }
                    i21 += 2;
                    z11 = f10;
                    max = f11;
                }
            }
            h(canvas);
        } else {
            h(canvas);
        }
        super.dispatchDraw(canvas);
        float scrollX2 = getScrollX();
        float scrollY2 = getScrollY();
        float width2 = getWidth() + getScrollX();
        float height2 = getHeight() + getScrollY();
        RectF rectF = this.r;
        rectF.set(scrollX2, scrollY2, width2, height2);
        f(canvas, rectF);
    }

    public final void e(Canvas canvas, int i10, float f7, float f10, float f11, float f12, RectF rectF) {
        if (rectF.intersects(f7, f10, f11, f12)) {
            int i11 = (i10 & 1) == 0 ? 0 : this.x;
            int i12 = i10 >= 2 ? this.x : 0;
            int i13 = this.x;
            Rect rect = this.h;
            rect.set(i11, i12, i11 + i13, i13 + i12);
            RectF rectF2 = this.n;
            rectF2.set(f7, f10, f11, f12);
            canvas.drawBitmap(this.w, rect, rectF2, this.f);
        }
    }

    public final void f(Canvas canvas, RectF rectF) {
        if (this.F != 0) {
            float f7 = this.c;
            if (f7 <= 0.0f) {
                return;
            }
            int max = Math.max(1, (int) Math.ceil(f7));
            if (this.w == null || this.x != max) {
                this.x = max;
                int i10 = max * 2;
                this.w = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.w);
                canvas2.drawColor(this.d.getColor());
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                float f10 = max;
                canvas2.drawCircle(f10, f10, f7, paint);
            }
            for (int i11 = 0; i11 < this.F; i11 += 5) {
                float[] fArr = this.E;
                float f11 = fArr[i11];
                float f12 = fArr[i11 + 1];
                float f13 = fArr[i11 + 2];
                float f14 = fArr[i11 + 3];
                float f15 = this.x;
                e(canvas, 0, f11, f12, f11 + f15, f12 + f15, rectF);
                float f16 = this.x;
                e(canvas, 1, f13 - f16, f12, f13, f12 + f16, rectF);
                float f17 = this.x;
                e(canvas, 2, f11, f14 - f17, f11 + f17, f14, rectF);
                float f18 = this.x;
                e(canvas, 3, f13 - f18, f14 - f18, f13, f14, rectF);
            }
        }
    }

    @Override // ug.a
    public final void g(g.y yVar, RectF rectF) {
        yVar.b = true;
    }

    public final void h(Canvas canvas) {
        float scrollX = getScrollX();
        float scrollY = getScrollY();
        float width = getWidth() + getScrollX();
        float height = getHeight() + getScrollY();
        RectF rectF = this.r;
        rectF.set(scrollX, scrollY, width, height);
        for (int i10 = 0; i10 < this.F; i10 += 5) {
            float[] fArr = this.E;
            int i11 = i10 + 1;
            int i12 = i10 + 2;
            int i13 = i10 + 3;
            if (rectF.intersects(fArr[i10], fArr[i11], fArr[i12], fArr[i13])) {
                float f7 = this.E[i10 + 4];
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.a);
                int round = Math.round(Math.max(0.0f, Math.min(1.0f, f7)) * Color.alpha(w02));
                int o10 = !this.D ? i0.b.o(w02, round) : i0.b.k(i0.b.o(w02, round), this.d.getColor());
                Paint paint = this.e;
                paint.setColor(o10);
                float[] fArr2 = this.E;
                canvas.drawRect(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13], paint);
            }
        }
    }

    public final void i(ViewGroup viewGroup, float f7, float f10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1) {
                        float x10 = childAt.getX() + f7;
                        LinearLayout linearLayout2 = this.b;
                        if (x10 <= linearLayout2.getPaddingLeft() && childAt.getX() + f7 + childAt.getWidth() >= linearLayout2.getWidth() - linearLayout2.getPaddingRight()) {
                            i(linearLayout, childAt.getX() + f7, childAt.getY() + f10);
                        }
                    }
                }
                this.M.add(childAt);
            }
        }
    }

    public final float j(View view) {
        if (view == this.b) {
            return 0.0f;
        }
        if (!(view.getParent() instanceof View)) {
            return view.getX();
        }
        return view.getX() + j((View) view.getParent());
    }

    public final float k(View view) {
        if (view == this.b) {
            return 0.0f;
        }
        if (!(view.getParent() instanceof View)) {
            return view.getY();
        }
        return view.getY() + k((View) view.getParent());
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.K);
        setOverscrolling(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        long j10 = i13 + i11;
        if (getOverScrollMode() != 2 && (j10 < 0 || j10 > i15)) {
            setOverscrolling(true);
            eb0 eb0Var = this.K;
            removeCallbacks(eb0Var);
            postDelayed(eb0Var, 500L);
        }
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }

    public void setDrawBackground(boolean z10) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        invalidate();
    }
}

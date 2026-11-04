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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class km0 extends ScrollView implements fh.a {
    public boolean E;
    public float[] F;
    public int G;
    public float[] H;
    public int I;
    public boolean J;
    public ArrayList K;
    public final jb0 L;
    public final ArrayList M;
    public final ArrayList N;
    public final org.telegram.ui.ActionBar.e6 a;
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

    public km0(Context context, LinearLayout linearLayout, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.c = org.telegram.messenger.g0.L(16.0f);
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint(3);
        this.h = new Rect();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new Matrix();
        this.F = new float[80];
        this.H = new float[32];
        this.L = new jb0(this, 23);
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.a = e6Var;
        this.b = linearLayout;
        setWillNotDraw(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(z10 ? 12.0f : 4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverscrolling(boolean z10) {
        if (this.J == z10) {
            return;
        }
        this.J = z10;
        invalidate();
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pi.l lVar = (pi.l) this.K.get(size);
            if (lVar.a != z10) {
                lVar.a = z10;
                pi.q qVar = lVar.b;
                qVar.h++;
                qVar.j += z10 ? 1 : -1;
            }
        }
    }

    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    public final void c(View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewParent parent = view.getParent();
        float f10 = 0.0f;
        LinearLayout linearLayout = this.b;
        float f11 = (parent == linearLayout || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        float f12 = (view2.getParent() == linearLayout || !(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        View view3 = view2;
        while ((view3.getParent() instanceof ViewGroup) && view3.getParent() != linearLayout) {
            ViewGroup viewGroup = (ViewGroup) view3.getParent();
            int childCount = viewGroup.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt.getVisibility() == 8) {
                        childCount--;
                    } else if (childAt != view3) {
                        break;
                    }
                }
            }
            f10 += viewGroup.getPaddingBottom();
            view3 = viewGroup;
        }
        float f13 = f12 + f10;
        float j10 = j(view) + linearLayout.getX();
        float k10 = (k(view) + linearLayout.getY()) - f11;
        float width = view.getWidth() + j10;
        float k11 = k(view2) + linearLayout.getY() + view2.getHeight() + f13;
        if (width <= j10 || k11 <= k10) {
            return;
        }
        int i3 = this.G;
        int i10 = i3 + 5;
        float[] fArr = this.F;
        if (i10 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i3);
            this.F = fArr2;
        }
        float[] fArr3 = this.F;
        int i11 = this.G;
        int i12 = i11 + 1;
        this.G = i12;
        fArr3[i11] = j10;
        int i13 = i11 + 2;
        this.G = i13;
        fArr3[i12] = k10;
        int i14 = i11 + 3;
        this.G = i14;
        fArr3[i13] = width;
        int i15 = i11 + 4;
        this.G = i15;
        fArr3[i14] = k11;
        this.G = i11 + 5;
        fArr3[i15] = view.getAlpha();
    }

    /* JADX WARN: Finally extract failed */
    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        RectF rectF2 = this.n;
        Paint paint = this.e;
        Matrix matrix = this.s;
        LinearLayout linearLayout = this.b;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.J && getOverScrollMode() != 2) {
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
                    org.telegram.messenger.a8.g(th2, true);
                }
                canvas.restore();
                return;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int i3 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.messenger.hs.e4);
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
        e();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var);
        canvas.save();
        try {
            canvas.clipRect(rectF);
            canvas.translate(-scrollX, -scrollY);
            for (int i10 = 0; i10 < this.G; i10 += 5) {
                float[] fArr = this.F;
                int i11 = i10 + 1;
                int i12 = i10 + 2;
                int i13 = i10 + 3;
                if (rectF3.intersects(fArr[i10], fArr[i11], fArr[i12], fArr[i13])) {
                    paint.setColor(i0.a.o(w02, Math.round(Color.alpha(w02) * Math.max(0.0f, Math.min(1.0f, this.F[i10 + 4])))));
                    float[] fArr2 = this.F;
                    rectF2.set(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                    float f10 = this.c;
                    canvas.drawRoundRect(rectF2, f10, f10, paint);
                }
            }
            canvas.save();
            try {
                canvas.translate(linearLayout.getX(), linearLayout.getY());
                float x10 = linearLayout.getX();
                float y9 = linearLayout.getY();
                if (linearLayout instanceof jm0) {
                    jm0 jm0Var = (jm0) linearLayout;
                    for (int i14 = 0; i14 < jm0Var.getChildCount(); i14++) {
                        View childAt = jm0Var.getChildAt(i14);
                        if (childAt.getVisibility() == 0) {
                            float x11 = childAt.getX() + x10;
                            float y10 = childAt.getY() + y9;
                            if (rectF3.intersects(x11, y10, childAt.getWidth() + x11, childAt.getHeight() + y10)) {
                                jm0Var.drawChild(canvas, childAt, uptimeMillis);
                            }
                        }
                    }
                } else {
                    for (int i15 = 0; i15 < linearLayout.getChildCount(); i15++) {
                        View childAt2 = linearLayout.getChildAt(i15);
                        if (childAt2.getVisibility() == 0) {
                            float x12 = childAt2.getX() + x10;
                            float y11 = childAt2.getY() + y9;
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
                g(canvas, rectF3);
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
        float f10;
        float f11;
        float f12;
        boolean z10;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.a), org.telegram.messenger.hs.e4);
        Paint paint = this.d;
        paint.setColor(o10);
        if (this.y != o10) {
            this.y = o10;
            this.w = null;
        }
        e();
        if (this.E) {
            float scrollX = getScrollX();
            float scrollY = getScrollY();
            float width = scrollX + getWidth();
            float height = getHeight() + scrollY;
            LinearLayout linearLayout = this.b;
            float z11 = org.telegram.messenger.camera.q.z(linearLayout.getX(), linearLayout.getPaddingLeft(), width, scrollX);
            float max = Math.max(z11, Math.min(width, (linearLayout.getX() + linearLayout.getWidth()) - linearLayout.getPaddingRight()));
            boolean z12 = false;
            this.I = 0;
            for (int i3 = 0; i3 < this.G; i3 += 5) {
                float max2 = Math.max(scrollY, this.F[i3 + 1]);
                float min = Math.min(height, this.F[i3 + 3]);
                if (min > max2) {
                    int i10 = this.I;
                    int i11 = i10 + 2;
                    float[] fArr = this.H;
                    if (i11 > fArr.length) {
                        float[] fArr2 = new float[fArr.length * 2];
                        System.arraycopy(fArr, 0, fArr2, 0, i10);
                        this.H = fArr2;
                    }
                    float[] fArr3 = this.H;
                    int i12 = this.I;
                    int i13 = i12 + 1;
                    this.I = i13;
                    fArr3[i12] = max2;
                    this.I = i12 + 2;
                    fArr3[i13] = min;
                }
            }
            for (int i14 = 2; i14 < this.I; i14 += 2) {
                float[] fArr4 = this.H;
                float f13 = fArr4[i14];
                float f14 = fArr4[i14 + 1];
                int i15 = i14 - 2;
                while (i15 >= 0) {
                    float[] fArr5 = this.H;
                    float f15 = fArr5[i15];
                    if (f15 > f13) {
                        fArr5[i15 + 2] = f15;
                        fArr5[i15 + 3] = fArr5[i15 + 1];
                        i15 -= 2;
                    }
                }
                float[] fArr6 = this.H;
                fArr6[i15 + 2] = f13;
                fArr6[i15 + 3] = f14;
            }
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.I) {
                float[] fArr7 = this.H;
                float f16 = fArr7[i16];
                float f17 = fArr7[i16 + 1];
                if (i17 > 0) {
                    int i18 = i17 - 1;
                    z10 = z12;
                    float f18 = fArr7[i18];
                    if (f16 <= 1.0f + f18) {
                        fArr7[i18] = Math.max(f18, f17);
                        i16 += 2;
                        z12 = z10;
                    }
                } else {
                    z10 = z12;
                }
                int i19 = i17 + 1;
                fArr7[i17] = f16;
                i17 += 2;
                fArr7[i19] = f17;
                i16 += 2;
                z12 = z10;
            }
            boolean z13 = z12;
            this.I = i17;
            if (i17 == 0 || z11 >= max) {
                canvas.drawRect(scrollX, scrollY, width, height, paint);
            } else {
                float[] fArr8 = this.H;
                float f19 = fArr8[z13 ? 1 : 0];
                float f20 = fArr8[i17 - 1];
                if (f19 > scrollY) {
                    canvas.drawRect(scrollX, scrollY, width, Math.min(height, f19 + 1.0f), paint);
                }
                if (f20 < height) {
                    canvas.drawRect(scrollX, Math.max(scrollY, f20 - 1.0f), width, height, paint);
                    f10 = height;
                } else {
                    f10 = height;
                }
                float max3 = Math.max(scrollY, f19);
                float min2 = Math.min(f10, f20);
                if (min2 > max3) {
                    canvas.drawRect(scrollX, max3, Math.min(width, z11 + 1.0f), min2, paint);
                    canvas.drawRect(Math.max(scrollX, max - 1.0f), max3, width, min2, paint);
                }
                int i20 = 2;
                while (i20 < this.I) {
                    float[] fArr9 = this.H;
                    float f21 = fArr9[i20 - 1];
                    float f22 = fArr9[i20];
                    if (f22 > f21) {
                        f11 = z11;
                        f12 = max;
                        canvas.drawRect(f11, Math.max(scrollY, f21 - 1.0f), f12, Math.min(f10, f22 + 1.0f), paint);
                    } else {
                        f11 = z11;
                        f12 = max;
                    }
                    i20 += 2;
                    z11 = f11;
                    max = f12;
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
        g(canvas, rectF);
    }

    public final void e() {
        int i3 = 0;
        this.G = 0;
        ArrayList arrayList = this.N;
        arrayList.clear();
        i(this.b, 0.0f, 0.0f);
        int size = arrayList.size();
        while (true) {
            View view = null;
            View view2 = null;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                View view3 = (View) obj;
                if (Objects.equals(view3.getTag(), -33024) || (view3 instanceof org.telegram.ui.Cells.y8) || (view3 instanceof org.telegram.ui.Cells.x6) || (view3 instanceof org.telegram.ui.zz)) {
                    c(view, view2);
                } else {
                    if (view != null && Math.abs(view2.getAlpha() - view3.getAlpha()) > 0.1f) {
                        c(view, view2);
                        view = null;
                    }
                    if (view == null) {
                        view = view3;
                    }
                    view2 = view3;
                }
            }
            c(view, view2);
            return;
        }
    }

    public final void f(Canvas canvas, int i3, float f10, float f11, float f12, float f13, RectF rectF) {
        if (rectF.intersects(f10, f11, f12, f13)) {
            int i10 = (i3 & 1) == 0 ? 0 : this.x;
            int i11 = i3 >= 2 ? this.x : 0;
            int i12 = this.x;
            Rect rect = this.h;
            rect.set(i10, i11, i10 + i12, i12 + i11);
            RectF rectF2 = this.n;
            rectF2.set(f10, f11, f12, f13);
            canvas.drawBitmap(this.w, rect, rectF2, this.f);
        }
    }

    public final void g(Canvas canvas, RectF rectF) {
        if (this.G != 0) {
            float f10 = this.c;
            if (f10 <= 0.0f) {
                return;
            }
            int max = Math.max(1, (int) Math.ceil(f10));
            if (this.w == null || this.x != max) {
                this.x = max;
                int i3 = max * 2;
                this.w = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.w);
                canvas2.drawColor(this.d.getColor());
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                float f11 = max;
                canvas2.drawCircle(f11, f11, f10, paint);
            }
            for (int i10 = 0; i10 < this.G; i10 += 5) {
                float[] fArr = this.F;
                float f12 = fArr[i10];
                float f13 = fArr[i10 + 1];
                float f14 = fArr[i10 + 2];
                float f15 = fArr[i10 + 3];
                float f16 = this.x;
                f(canvas, 0, f12, f13, f12 + f16, f13 + f16, rectF);
                float f17 = this.x;
                f(canvas, 1, f14 - f17, f13, f14, f13 + f17, rectF);
                float f18 = this.x;
                f(canvas, 2, f12, f15 - f18, f12 + f18, f15, rectF);
                float f19 = this.x;
                f(canvas, 3, f14 - f19, f15 - f19, f14, f15, rectF);
            }
        }
    }

    public final void h(Canvas canvas) {
        float scrollX = getScrollX();
        float scrollY = getScrollY();
        float width = getWidth() + getScrollX();
        float height = getHeight() + getScrollY();
        RectF rectF = this.r;
        rectF.set(scrollX, scrollY, width, height);
        for (int i3 = 0; i3 < this.G; i3 += 5) {
            float[] fArr = this.F;
            int i10 = i3 + 1;
            int i11 = i3 + 2;
            int i12 = i3 + 3;
            if (rectF.intersects(fArr[i3], fArr[i10], fArr[i11], fArr[i12])) {
                float f10 = this.F[i3 + 4];
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a);
                int round = Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(w02));
                int o10 = !this.E ? i0.a.o(w02, round) : i0.a.k(i0.a.o(w02, round), this.d.getColor());
                Paint paint = this.e;
                paint.setColor(o10);
                float[] fArr2 = this.F;
                canvas.drawRect(fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12], paint);
            }
        }
    }

    public final void i(ViewGroup viewGroup, float f10, float f11) {
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1) {
                        float x10 = childAt.getX() + f10;
                        LinearLayout linearLayout2 = this.b;
                        if (x10 <= linearLayout2.getPaddingLeft() && childAt.getX() + f10 + childAt.getWidth() >= linearLayout2.getWidth() - linearLayout2.getPaddingRight()) {
                            i(linearLayout, childAt.getX() + f10, childAt.getY() + f11);
                        }
                    }
                }
                this.N.add(childAt);
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
        removeCallbacks(this.L);
        setOverscrolling(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        long j10 = i12 + i10;
        if (getOverScrollMode() != 2 && (j10 < 0 || j10 > i14)) {
            setOverscrolling(true);
            jb0 jb0Var = this.L;
            removeCallbacks(jb0Var);
            postDelayed(jb0Var, 500L);
        }
        return super.overScrollBy(i3, i10, i11, i12, i13, i14, i15, i16, z10);
    }

    public void setDrawBackground(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        invalidate();
    }
}

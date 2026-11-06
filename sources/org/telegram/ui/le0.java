package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class le0 extends org.telegram.ui.Components.y5 {
    public static final float[] S = {12.0f, 12.0f, 10.0f};
    public static final int[] T = {16, 8, 4};
    public int[] D;
    public int[] E;
    public int[] F;
    public int G;
    public final hz H;
    public boolean I;
    public final Paint J;
    public final r1.g K;
    public final r1.g L;
    public float M;
    public float N;
    public View O;
    public final HashSet P;
    public final te.a Q;
    public final org.telegram.ui.Cells.l9 R;
    public final org.telegram.ui.ActionBar.f6 s;
    public int w;
    public float[] x;
    public float[] y;

    public le0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = new hz(this, 29);
        this.J = new Paint(1);
        new ArrayList();
        new ArrayList();
        r1.b bVar = r1.g.u;
        r1.b bVar2 = r1.g.t;
        r1.b bVar3 = r1.g.q;
        r1.b bVar4 = r1.g.s;
        new r1.h(1.0f);
        new ArrayList();
        new ArrayList();
        r1.b bVar5 = r1.g.r;
        new r1.h(1.0f);
        r1.g gVar = new r1.g(this, new org.telegram.ui.Components.cb(1));
        this.K = gVar;
        r1.g gVar2 = new r1.g(this, new org.telegram.ui.Components.cb(2));
        this.L = gVar2;
        gVar.m = org.telegram.ui.Cells.f1.o(1.0f, 1500.0f, 0.75f);
        r1.h hVar = new r1.h(1.0f);
        hVar.b(250.0f);
        hVar.a(0.25f);
        r1.h hVar2 = new r1.h(1.0f);
        hVar2.b(250.0f);
        hVar2.a(0.25f);
        r1.h hVar3 = new r1.h(1.0f);
        hVar3.b(1500.0f);
        hVar3.a(0.75f);
        gVar2.m = hVar3;
        this.P = new HashSet();
        this.Q = new te.a(0, new wr(this, 22), org.telegram.ui.Components.xq.h, 380L, false);
        this.R = new org.telegram.ui.Cells.l9(new f(this, 24));
        this.s = f6Var;
    }

    public static void k(le0 le0Var, View view, float f10, float f11) {
        float f12;
        float f13;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f14 = width * 0.5f;
        float f15 = height * 0.5f;
        float f16 = f10 - f14;
        float f17 = f11 - f15;
        float f18 = f16 / f14;
        float f19 = f17 / f15;
        float sqrt = (float) Math.sqrt((f19 * f19) + (f18 * f18));
        if (sqrt > 1.0E-4f) {
            float f20 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
            f12 = (f16 * f20) + f14;
            f13 = (f17 * f20) + f15;
        } else {
            f12 = f14;
            f13 = f15;
        }
        float T1 = org.telegram.messenger.g0.T1(f14, f12, 1.0f);
        float T12 = org.telegram.messenger.g0.T1(f15, f13, 3.0f);
        view.setPivotX(T1);
        view.setPivotY(T12);
    }

    public static void m(le0 le0Var, float f10, boolean z9, boolean z10) {
        View view;
        r1.g gVar = le0Var.L;
        float f11 = Float.MAX_VALUE;
        int i7 = 0;
        if (le0Var.getChildCount() != 0) {
            float f12 = -3.4028235E38f;
            float f13 = Float.MAX_VALUE;
            boolean z11 = false;
            for (int i10 = 0; i10 < le0Var.getChildCount(); i10++) {
                View childAt = le0Var.getChildAt(i10);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f13) {
                        f13 = width;
                    }
                    if (width > f12) {
                        f12 = width;
                    }
                    z11 = true;
                }
            }
            if (z11) {
                if (f10 < f13) {
                    f10 = f13;
                } else if (f10 > f12) {
                    f10 = f12;
                }
            }
        }
        View view2 = null;
        if (le0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i11 = 0; i11 < le0Var.getChildCount(); i11++) {
                View childAt2 = le0Var.getChildAt(i11);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f10);
                    if (abs < f11) {
                        view = childAt2;
                        f11 = abs;
                    }
                }
            }
        }
        if (z9) {
            int childCount = le0Var.getChildCount();
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt3 = le0Var.getChildAt(i7);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof qh.b) && ((qh.b) childAt3).h.f) {
                    view2 = childAt3;
                    break;
                }
                i7++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                le0Var.M = width2;
                le0Var.N = width2 - f10;
                le0Var.K.c(0.0f);
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            gVar.d();
        }
        if (!z10) {
            le0Var.M = f10;
            le0Var.invalidate();
        }
        if (view != null) {
            le0Var.O = view;
            le0Var.q(view, true);
            if (z10) {
                float width3 = view.getWidth();
                float x10 = (width3 / 2.0f) + view.getX();
                if (0.0f == width3 && 0.0f == x10) {
                    return;
                }
                gVar.c(x10);
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipDrawSelector(boolean z9) {
        this.I = z9;
        if (z9) {
            this.J.setColor(org.telegram.ui.ActionBar.k6.r1(0.09f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, this.s)));
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (childAt instanceof qh.b)) {
                ((qh.b) childAt).setSkipDrawSelector(z9);
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.I) {
            float f10 = this.M + this.N;
            float f11 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f10 && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f10 && (view2 == null || width2 < p(view2))) {
                            view2 = childAt;
                        }
                    }
                }
                if (view != null || view2 != null) {
                    if (view == null) {
                        width = view2.getWidth();
                    } else if (view2 == null) {
                        width = view.getWidth();
                    } else {
                        float p10 = p(view);
                        float p11 = p(view2);
                        width = (view == view2 || p10 == p11) ? view.getWidth() : org.telegram.messenger.g0.W1((f10 - p10) / (p11 - p10), view.getWidth(), view2.getWidth());
                    }
                    f11 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f12 = f11 / 2.0f;
            float f13 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f10 - f12, (getHeight() - height) / 2.0f, f10 + f12, (getHeight() + height) / 2.0f, f13, f13, this.J);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.R.a(this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.y5
    public final void e() {
        o();
    }

    @Override // org.telegram.ui.Components.y5
    public final void f(View view, float f10) {
        float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(T1);
        view.setScaleY(T1);
    }

    public final void n() {
        int i7 = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i7) {
            setLayerType(i7, null);
            invalidate();
        }
    }

    public final void o() {
        int entriesCount = getEntriesCount();
        for (int i7 = 0; i7 < entriesCount; i7++) {
            te.e i10 = this.c.i(i7);
            ((qh.b) ((org.telegram.ui.Components.x5) i10.a).a).setVisualWidth(i10.b().width());
        }
    }

    @Override // org.telegram.ui.Components.y5, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.y5, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int[] iArr;
        float[] fArr;
        int i11;
        float f10;
        int i12;
        float f11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i13 = this.w;
        if (i13 > 0 && size > i13) {
            size = i13;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(org.telegram.messenger.g0.L(320.0f), paddingLeft);
        int i14 = 0;
        float f12 = -1.0f;
        while (true) {
            iArr = T;
            fArr = S;
            if (i14 >= 3) {
                i11 = 0;
                f10 = 0.0f;
                i14 = 2;
                break;
            }
            if (fArr[i14] != f12) {
                int childCount = getChildCount();
                float[] fArr2 = this.x;
                if (fArr2 == null || fArr2.length < childCount) {
                    this.x = new float[childCount];
                    this.y = new float[childCount];
                    this.D = new int[childCount];
                    this.F = new int[childCount];
                    this.E = new int[childCount];
                }
                float f13 = 0.0f;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (d(childAt)) {
                        if (childAt instanceof ke0) {
                            qh.b bVar = (qh.b) ((ke0) childAt);
                            if (bVar.T == null) {
                                bVar.T = new TextPaint(bVar.F);
                            }
                            bVar.T.setTextSize(org.telegram.messenger.g0.L(r9));
                            f11 = bVar.T.measureText(bVar.a.getText().toString());
                        } else {
                            f11 = 0.0f;
                        }
                        this.x[i16] = f11;
                        f13 = Math.max(f13, f11);
                        i15++;
                    } else {
                        this.x[i16] = -1.0f;
                    }
                }
                i11 = 0;
                f10 = 0.0f;
                i12 = 2;
                Math.ceil(f13);
                this.G = i15;
                f12 = fArr[i14];
            } else {
                i11 = 0;
                f10 = 0.0f;
                i12 = 2;
            }
            int L = org.telegram.messenger.g0.L(iArr[i14]);
            int childCount2 = getChildCount();
            float f14 = f10;
            for (int i17 = i11; i17 < childCount2; i17++) {
                if (d(getChildAt(i17))) {
                    f14 += this.x[i17] + (L * 2);
                }
            }
            if (f14 <= paddingLeft || i14 == i12) {
                break;
            } else {
                i14++;
            }
        }
        float f15 = fArr[i14];
        int childCount3 = getChildCount();
        for (int i18 = i11; i18 < childCount3; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2 instanceof ke0) {
                ((qh.b) ((ke0) childAt2)).setTextSizeDp(f15);
            }
        }
        int L2 = org.telegram.messenger.g0.L(iArr[i14]) * 2;
        int max = (paddingLeft / Math.max(1, this.G)) - L2;
        int childCount4 = getChildCount();
        int i19 = i11;
        int i20 = i19;
        float f16 = f10;
        while (i19 < childCount4) {
            if (d(getChildAt(i19))) {
                float[] fArr3 = this.y;
                float f17 = this.x[i19] + L2;
                fArr3[i19] = f17;
                int[] iArr2 = this.D;
                int i21 = f17 > ((float) (max + L2)) ? i11 : 1;
                iArr2[i19] = i21;
                f16 += f17;
                i20 += i21;
            } else {
                float[] fArr4 = this.x;
                this.y[i19] = f10;
                fArr4[i19] = f10;
                this.D[i19] = i11;
            }
            i19++;
        }
        if (i20 == 0) {
            int childCount5 = getChildCount();
            for (int i22 = i11; i22 < childCount5; i22++) {
                this.D[i22] = d(getChildAt(i22)) ? 1 : 0;
            }
            i20 = this.G;
        }
        float f18 = paddingLeft;
        if (f16 > f18) {
            float f19 = f18 / f16;
            int childCount6 = getChildCount();
            for (int i23 = i11; i23 < childCount6; i23++) {
                float[] fArr5 = this.y;
                fArr5[i23] = fArr5[i23] * f19;
            }
        } else {
            float f20 = min;
            if (f16 < f20) {
                float f21 = (f20 - f16) / i20;
                int childCount7 = getChildCount();
                for (int i24 = i11; i24 < childCount7; i24++) {
                    float[] fArr6 = this.y;
                    fArr6[i24] = (this.D[i24] * f21) + fArr6[i24];
                }
            }
        }
        int childCount8 = getChildCount();
        int i25 = i11;
        int i26 = i25;
        while (i25 < childCount8) {
            if (d(getChildAt(i25))) {
                this.E[i25] = Math.round(this.y[i25]);
                this.F[i25] = i26;
                i26 += this.E[i25];
            }
            i25++;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i26, size2);
        int childCount9 = getChildCount();
        for (int i27 = i11; i27 < childCount9; i27++) {
            getChildAt(i27).measure(View.MeasureSpec.makeMeasureSpec(this.E[i27], TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
        }
        a();
    }

    public final void q(View view, boolean z9) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof qh.b) {
                ((qh.b) childAt).f(childAt == view, z9);
            }
        }
    }

    public void setMaxWidth(int i7) {
        if (this.w != i7) {
            this.w = i7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        n();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        n();
    }
}

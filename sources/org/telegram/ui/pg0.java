package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pg0 extends org.telegram.ui.Components.a6 {
    public static final float[] O = {12.0f, 12.0f, 10.0f};
    public static final int[] P = {16, 8, 4};
    public int[] A;
    public int[] B;
    public int C;
    public final o00 D;
    public boolean E;
    public final Paint F;
    public final o1.j G;
    public final o1.j H;
    public float I;
    public float J;
    public View K;
    public final HashSet L;
    public final td.a M;
    public final ud.b N;
    public final org.telegram.ui.ActionBar.b6 s;
    public int v;
    public float[] w;
    public float[] x;
    public int[] y;

    public pg0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.D = new o00(this, 26);
        this.F = new Paint(1);
        new ArrayList();
        new ArrayList();
        o1.c cVar = o1.h.s;
        o1.c cVar2 = o1.h.r;
        o1.c cVar3 = o1.h.o;
        o1.c cVar4 = o1.h.q;
        new o1.k(1.0f);
        new ArrayList();
        new ArrayList();
        o1.c cVar5 = o1.h.p;
        new o1.k(1.0f);
        o1.j jVar = new o1.j(this, new org.telegram.ui.Components.hb(1));
        this.G = jVar;
        o1.j jVar2 = new o1.j(this, new org.telegram.ui.Components.hb(2));
        this.H = jVar2;
        jVar.u = org.telegram.ui.Cells.j2.i(1.0f, 1500.0f, 0.75f);
        o1.k kVar = new o1.k(1.0f);
        kVar.b(250.0f);
        kVar.a(0.25f);
        o1.k kVar2 = new o1.k(1.0f);
        kVar2.b(250.0f);
        kVar2.a(0.25f);
        o1.k kVar3 = new o1.k(1.0f);
        kVar3.b(1500.0f);
        kVar3.a(0.75f);
        jVar2.u = kVar3;
        this.L = new HashSet();
        this.M = new td.a(0, new wt(this, 22), org.telegram.ui.Components.gr.h, 380L, false);
        this.N = new ud.b(new g(this, 25));
        this.s = b6Var;
    }

    public static void k(pg0 pg0Var, View view, float f10, float f11) {
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
        float lerp = AndroidUtilities.lerp(f14, f12, 1.0f);
        float lerp2 = AndroidUtilities.lerp(f15, f13, 3.0f);
        view.setPivotX(lerp);
        view.setPivotY(lerp2);
    }

    public static void m(pg0 pg0Var, float f10, boolean z10, boolean z11) {
        View view;
        o1.j jVar = pg0Var.H;
        float f11 = Float.MAX_VALUE;
        if (pg0Var.getChildCount() != 0) {
            float f12 = -3.4028235E38f;
            boolean z12 = false;
            float f13 = Float.MAX_VALUE;
            for (int i9 = 0; i9 < pg0Var.getChildCount(); i9++) {
                View childAt = pg0Var.getChildAt(i9);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f13) {
                        f13 = width;
                    }
                    if (width > f12) {
                        f12 = width;
                    }
                    z12 = true;
                }
            }
            if (z12) {
                if (f10 < f13) {
                    f10 = f13;
                } else if (f10 > f12) {
                    f10 = f12;
                }
            }
        }
        View view2 = null;
        if (pg0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i10 = 0; i10 < pg0Var.getChildCount(); i10++) {
                View childAt2 = pg0Var.getChildAt(i10);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f10);
                    if (abs < f11) {
                        view = childAt2;
                        f11 = abs;
                    }
                }
            }
        }
        if (z10) {
            int childCount = pg0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt3 = pg0Var.getChildAt(i11);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof wg.b) && ((wg.b) childAt3).h.f) {
                    view2 = childAt3;
                    break;
                }
                i11++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                pg0Var.I = width2;
                pg0Var.J = width2 - f10;
                o1.j jVar2 = pg0Var.G;
                if (jVar2.f) {
                    jVar2.v = 0.0f;
                } else {
                    if (jVar2.u == null) {
                        jVar2.u = new o1.k(0.0f);
                    }
                    jVar2.u.i = 0.0f;
                    jVar2.f();
                }
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            jVar.c();
        }
        if (!z11) {
            pg0Var.I = f10;
            pg0Var.invalidate();
        }
        if (view != null) {
            pg0Var.K = view;
            int childCount2 = pg0Var.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt4 = pg0Var.getChildAt(i12);
                if (childAt4 instanceof wg.b) {
                    ((wg.b) childAt4).e(childAt4 == view, true);
                }
            }
            if (z11) {
                float width3 = view.getWidth();
                float x10 = (width3 / 2.0f) + view.getX();
                if (0.0f == width3 && 0.0f == x10) {
                    return;
                }
                if (jVar.f) {
                    jVar.v = x10;
                    return;
                }
                if (jVar.u == null) {
                    jVar.u = new o1.k(x10);
                }
                jVar.u.i = x10;
                jVar.f();
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipDrawSelector(boolean z10) {
        this.E = z10;
        if (z10) {
            this.F.setColor(org.telegram.ui.ActionBar.f6.l1(0.09f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.al, this.s)));
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (childAt instanceof wg.b)) {
                ((wg.b) childAt).setSkipDrawSelector(z10);
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.E) {
            float f10 = this.I + this.J;
            float f11 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
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
                        float p6 = p(view);
                        float p9 = p(view2);
                        width = (view == view2 || p6 == p9) ? view.getWidth() : AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f10 - p6) / (p9 - p6));
                    }
                    f11 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f12 = f11 / 2.0f;
            float f13 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f10 - f12, (getHeight() - height) / 2.0f, f10 + f12, (getHeight() + height) / 2.0f, f13, f13, this.F);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.N.a(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.a6
    public final void e() {
        o();
    }

    @Override // org.telegram.ui.Components.a6
    public final void f(View view, float f10) {
        float lerp = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
    }

    public final void n() {
        int i9 = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i9) {
            setLayerType(i9, null);
            invalidate();
        }
    }

    public final void o() {
        int entriesCount = getEntriesCount();
        for (int i9 = 0; i9 < entriesCount; i9++) {
            td.e n10 = this.c.n(i9);
            ((wg.b) ((org.telegram.ui.Components.z5) n10.a).a).setVisualWidth(n10.b().width());
        }
    }

    @Override // org.telegram.ui.Components.a6, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.a6, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int[] iArr;
        float[] fArr;
        int i11;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i12 = this.v;
        if (i12 > 0 && size > i12) {
            size = i12;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int i13 = 0;
        float f12 = -1.0f;
        while (true) {
            iArr = P;
            fArr = O;
            if (i13 >= 3) {
                i11 = 0;
                f10 = 0.0f;
                i13 = 2;
                break;
            }
            if (fArr[i13] != f12) {
                int childCount = getChildCount();
                float[] fArr2 = this.w;
                if (fArr2 == null || fArr2.length < childCount) {
                    this.w = new float[childCount];
                    this.x = new float[childCount];
                    this.y = new int[childCount];
                    this.B = new int[childCount];
                    this.A = new int[childCount];
                }
                float f13 = 0.0f;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (d(childAt)) {
                        if (childAt instanceof og0) {
                            wg.b bVar = (wg.b) ((og0) childAt);
                            if (bVar.P == null) {
                                bVar.P = new TextPaint(bVar.B);
                            }
                            bVar.P.setTextSize(AndroidUtilities.dp(r9));
                            f11 = bVar.P.measureText(bVar.a.getText().toString());
                        } else {
                            f11 = 0.0f;
                        }
                        this.w[i15] = f11;
                        f13 = Math.max(f13, f11);
                        i14++;
                    } else {
                        this.w[i15] = -1.0f;
                    }
                }
                i11 = 0;
                f10 = 0.0f;
                Math.ceil(f13);
                this.C = i14;
                f12 = fArr[i13];
            } else {
                i11 = 0;
                f10 = 0.0f;
            }
            int dp = AndroidUtilities.dp(iArr[i13]);
            int childCount2 = getChildCount();
            float f14 = 0.0f;
            for (int i16 = 0; i16 < childCount2; i16++) {
                if (d(getChildAt(i16))) {
                    f14 += this.w[i16] + (dp * 2);
                }
            }
            if (f14 <= paddingLeft || i13 == 2) {
                break;
            } else {
                i13++;
            }
        }
        float f15 = fArr[i13];
        int childCount3 = getChildCount();
        for (int i17 = 0; i17 < childCount3; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2 instanceof og0) {
                ((wg.b) ((og0) childAt2)).setTextSizeDp(f15);
            }
        }
        int dp2 = AndroidUtilities.dp(iArr[i13]) * 2;
        int max = (paddingLeft / Math.max(1, this.C)) - dp2;
        int childCount4 = getChildCount();
        int i18 = 0;
        float f16 = 0.0f;
        for (int i19 = 0; i19 < childCount4; i19++) {
            if (d(getChildAt(i19))) {
                float[] fArr3 = this.x;
                float f17 = this.w[i19] + dp2;
                fArr3[i19] = f17;
                int[] iArr2 = this.y;
                int i20 = f17 > ((float) (max + dp2)) ? 0 : 1;
                iArr2[i19] = i20;
                f16 += f17;
                i18 += i20;
            } else {
                float[] fArr4 = this.w;
                this.x[i19] = f10;
                fArr4[i19] = f10;
                this.y[i19] = i11;
            }
        }
        if (i18 == 0) {
            int childCount5 = getChildCount();
            for (int i21 = 0; i21 < childCount5; i21++) {
                this.y[i21] = d(getChildAt(i21)) ? 1 : 0;
            }
            i18 = this.C;
        }
        float f18 = paddingLeft;
        if (f16 > f18) {
            float f19 = f18 / f16;
            int childCount6 = getChildCount();
            for (int i22 = 0; i22 < childCount6; i22++) {
                float[] fArr5 = this.x;
                fArr5[i22] = fArr5[i22] * f19;
            }
        } else {
            float f20 = min;
            if (f16 < f20) {
                float f21 = (f20 - f16) / i18;
                int childCount7 = getChildCount();
                for (int i23 = 0; i23 < childCount7; i23++) {
                    float[] fArr6 = this.x;
                    fArr6[i23] = (this.y[i23] * f21) + fArr6[i23];
                }
            }
        }
        int childCount8 = getChildCount();
        int i24 = 0;
        for (int i25 = 0; i25 < childCount8; i25++) {
            if (d(getChildAt(i25))) {
                this.A[i25] = Math.round(this.x[i25]);
                this.B[i25] = i24;
                i24 += this.A[i25];
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i24, size2);
        int childCount9 = getChildCount();
        for (int i26 = 0; i26 < childCount9; i26++) {
            getChildAt(i26).measure(View.MeasureSpec.makeMeasureSpec(this.A[i26], TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
        }
        a();
    }

    public void setMaxWidth(int i9) {
        if (this.v != i9) {
            this.v = i9;
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

// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hj6 extends pm implements cu5 {
    public static final float[] T = {12.0f, 12.0f, 10.0f};
    public static final int[] U = {16, 8, 4};
    public int[] E;
    public int[] F;
    public int[] G;
    public int H;
    public final z96 I;
    public boolean J;
    public final Paint K;
    public final vpa L;
    public final vpa M;
    public float N;
    public float O;
    public View P;
    public final HashSet Q;
    public final fm0 R;
    public final dj2 S;
    public final vnb s;
    public int w;
    public float[] x;
    public float[] y;

    public hj6(Context context, vnb vnbVar) {
        super(context);
        this.I = new z96(this, (byte) 11);
        this.K = new Paint(1);
        new wpa(1.0f);
        new wpa(1.0f);
        vpa vpaVar = new vpa(this, new t11((byte) 1));
        this.L = vpaVar;
        vpa vpaVar2 = new vpa(this, new t11((byte) 2));
        this.M = vpaVar2;
        vpaVar.m = bp1.j(1.0f, 1500.0f, 0.75f);
        wpa wpaVar = new wpa(1.0f);
        wpaVar.b(250.0f);
        wpaVar.a(0.25f);
        wpa wpaVar2 = new wpa(1.0f);
        wpaVar2.b(250.0f);
        wpaVar2.a(0.25f);
        wpa wpaVar3 = new wpa(1.0f);
        wpaVar3.b(1500.0f);
        wpaVar3.a(0.75f);
        vpaVar2.m = wpaVar3;
        this.Q = new HashSet();
        this.R = new fm0(0, new e05((Object) this, (byte) 29), k43.h, 380L, false);
        this.S = new dj2(new v34(this, (byte) 13));
        this.s = vnbVar;
    }

    public static void n(View view, float f, float f2) {
        float f3;
        float f4;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f5 = width * 0.5f;
        float f6 = height * 0.5f;
        float f7 = f - f5;
        float f8 = f2 - f6;
        float f9 = f7 / f5;
        float f10 = f8 / f6;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
        if (sqrt > 1.0E-4f) {
            float f11 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
            f3 = (f7 * f11) + f5;
            f4 = (f8 * f11) + f6;
        } else {
            f3 = f5;
            f4 = f6;
        }
        float R1 = hl.R1(f5, f3, 1.0f);
        float R12 = hl.R1(f6, f4, 3.0f);
        view.setPivotX(R1);
        view.setPivotY(R12);
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipDrawSelector(boolean z) {
        this.J = z;
        if (z) {
            this.K.setColor(aob.p1(0.09f, aob.v0(aob.Rl, this.s)));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof uz4)) {
                ((uz4) childAt).setSkipDrawSelector(z);
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.J) {
            float f = this.N + this.O;
            float f2 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f && (view2 == null || width2 < p(view2))) {
                            view2 = childAt;
                        }
                    }
                }
                if (view == null) {
                    if (view2 != null) {
                        width = view2.getWidth();
                    }
                } else if (view2 == null) {
                    width = view.getWidth();
                } else {
                    float p = p(view);
                    float p2 = p(view2);
                    width = (view == view2 || p == p2) ? view.getWidth() : hl.U1((f - p) / (p2 - p), view.getWidth(), view2.getWidth());
                }
                f2 = width;
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f3 = f2 / 2.0f;
            float f4 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f - f3, (getHeight() - height) / 2.0f, f + f3, (getHeight() + height) / 2.0f, f4, f4, this.K);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.S.a(this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // cu5
    public final void e(au5 au5Var) {
        if (getBackground() instanceof jl0) {
            au5Var.a(((jl0) getBackground()).S.k);
        }
    }

    @Override // pm
    public final void f() {
        o();
    }

    @Override // pm
    public final void g(View view, float f) {
        float R1 = hl.R1(0.7f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(R1);
        view.setScaleY(R1);
    }

    public final void l() {
        int i = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    public final void m(boolean z, boolean z2, float f) {
        View view;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        if (getChildCount() != 0) {
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            boolean z3 = false;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f4) {
                        f4 = width;
                    }
                    if (width > f3) {
                        f3 = width;
                    }
                    z3 = true;
                }
            }
            if (z3) {
                if (f < f4) {
                    f = f4;
                } else if (f > f3) {
                    f = f3;
                }
            }
        }
        View view2 = null;
        if (getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f);
                    if (abs < f2) {
                        view = childAt2;
                        f2 = abs;
                    }
                }
            }
        }
        vpa vpaVar = this.M;
        if (z) {
            int childCount = getChildCount();
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt3 = getChildAt(i);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof uz4) && ((uz4) childAt3).h.f) {
                    view2 = childAt3;
                    break;
                }
                i++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                this.N = width2;
                this.O = width2 - f;
                this.L.c(0.0f);
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            vpaVar.d();
        }
        if (!z2) {
            this.N = f;
            invalidate();
        }
        if (view != null) {
            this.P = view;
            r(view, true);
            if (z2) {
                float width3 = view.getWidth();
                float x = (width3 / 2.0f) + view.getX();
                if (0.0f == width3 && 0.0f == x) {
                    return;
                }
                vpaVar.c(x);
            }
        }
    }

    public final void o() {
        int entriesCount = getEntriesCount();
        for (int i = 0; i < entriesCount; i++) {
            y66 i2 = this.c.i(i);
            ((uz4) ((om) i2.a).a).setVisualWidth(i2.b().width());
        }
    }

    @Override // pm, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int[] iArr;
        float[] fArr;
        int i3;
        float f;
        int i4;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i5 = this.w;
        if (i5 > 0 && size > i5) {
            size = i5;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(hl.L(320.0f), paddingLeft);
        int i6 = 0;
        float f3 = -1.0f;
        while (true) {
            iArr = U;
            fArr = T;
            if (i6 >= 3) {
                i3 = 0;
                f = 0.0f;
                i4 = 1;
                i6 = 2;
                break;
            }
            if (fArr[i6] != f3) {
                int childCount = getChildCount();
                float[] fArr2 = this.x;
                if (fArr2 == null || fArr2.length < childCount) {
                    this.x = new float[childCount];
                    this.y = new float[childCount];
                    this.E = new int[childCount];
                    this.G = new int[childCount];
                    this.F = new int[childCount];
                }
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (d(childAt)) {
                        if (childAt instanceof gj6) {
                            uz4 uz4Var = (uz4) ((gj6) childAt);
                            TextPaint textPaint = uz4Var.U;
                            if (textPaint == null) {
                                textPaint = new TextPaint(uz4Var.G);
                                uz4Var.U = textPaint;
                            }
                            textPaint.setTextSize(hl.L(r9));
                            f2 = uz4Var.U.measureText(uz4Var.a.getText().toString());
                        } else {
                            f2 = 0.0f;
                        }
                        this.x[i8] = f2;
                        i7++;
                    } else {
                        this.x[i8] = -1.0f;
                    }
                }
                i3 = 0;
                f = 0.0f;
                i4 = 1;
                this.H = i7;
                f3 = fArr[i6];
            } else {
                i3 = 0;
                f = 0.0f;
                i4 = 1;
            }
            int L = hl.L(iArr[i6]);
            int childCount2 = getChildCount();
            float f4 = f;
            for (int i9 = i3; i9 < childCount2; i9++) {
                if (d(getChildAt(i9))) {
                    f4 += this.x[i9] + (L << 1);
                }
            }
            if (f4 <= paddingLeft || i6 == 2) {
                break;
            } else {
                i6++;
            }
        }
        float f5 = fArr[i6];
        int childCount3 = getChildCount();
        for (int i10 = i3; i10 < childCount3; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2 instanceof gj6) {
                ((uz4) ((gj6) childAt2)).setTextSizeDp(f5);
            }
        }
        int L2 = hl.L(iArr[i6]);
        int i11 = i4;
        int i12 = L2 << i11;
        int max = (paddingLeft / Math.max(i11, this.H)) - i12;
        int childCount4 = getChildCount();
        int i13 = i3;
        int i14 = i13;
        float f6 = f;
        while (i13 < childCount4) {
            if (d(getChildAt(i13))) {
                float[] fArr3 = this.y;
                float f7 = this.x[i13] + i12;
                fArr3[i13] = f7;
                int[] iArr2 = this.E;
                int i15 = f7 > ((float) (max + i12)) ? i3 : i11;
                iArr2[i13] = i15;
                f6 += f7;
                i14 += i15;
            } else {
                float[] fArr4 = this.x;
                this.y[i13] = f;
                fArr4[i13] = f;
                this.E[i13] = i3;
            }
            i13++;
        }
        if (i14 == 0) {
            int childCount5 = getChildCount();
            for (int i16 = i3; i16 < childCount5; i16++) {
                this.E[i16] = d(getChildAt(i16)) ? 1 : 0;
            }
            i14 = this.H;
        }
        float f8 = paddingLeft;
        if (f6 > f8) {
            float f9 = f8 / f6;
            int childCount6 = getChildCount();
            for (int i17 = i3; i17 < childCount6; i17++) {
                float[] fArr5 = this.y;
                fArr5[i17] = fArr5[i17] * f9;
            }
        } else {
            float f10 = min;
            if (f6 < f10) {
                float f11 = (f10 - f6) / i14;
                int childCount7 = getChildCount();
                for (int i18 = i3; i18 < childCount7; i18++) {
                    float[] fArr6 = this.y;
                    fArr6[i18] = (this.E[i18] * f11) + fArr6[i18];
                }
            }
        }
        int childCount8 = getChildCount();
        int i19 = i3;
        int i20 = i19;
        while (i19 < childCount8) {
            if (d(getChildAt(i19))) {
                this.F[i19] = Math.round(this.y[i19]);
                this.G[i19] = i20;
                i20 += this.F[i19];
            }
            i19++;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i20, size2);
        int childCount9 = getChildCount();
        for (int i21 = i3; i21 < childCount9; i21++) {
            getChildAt(i21).measure(View.MeasureSpec.makeMeasureSpec(this.F[i21], TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
        }
        a();
    }

    public final /* synthetic */ void q() {
        setSkipDrawSelector(false);
    }

    public final void r(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof uz4) {
                ((uz4) childAt).f(childAt == view, z);
            }
        }
    }

    public void setMaxWidth(int i) {
        if (this.w != i) {
            this.w = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        l();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        l();
    }
}

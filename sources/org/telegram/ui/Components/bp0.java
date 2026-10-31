package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bp0 extends uu0 {
    public boolean f0;
    public final RectF g0;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public final t5 o0;
    public final /* synthetic */ op0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(op0 op0Var, Context context) {
        super(context, null);
        this.p0 = op0Var;
        this.f0 = false;
        this.g0 = new RectF();
        this.H = new ap0(this, this);
        org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, op0Var.I0));
        this.o0 = new t5(this, 0L, 350L, gr.h);
    }

    @Override // org.telegram.ui.Components.uu0
    public final void J(Canvas canvas, ArrayList arrayList) {
        op0 op0Var = this.p0;
        oo0 oo0Var = op0Var.y1;
        tk0 tk0Var = op0Var.w1;
        oo0 oo0Var2 = op0Var.x1;
        if (oo0Var2.getVisibility() == 0 && oo0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(oo0Var2.getX(), oo0Var2.getY());
            oo0Var2.draw(canvas);
            canvas.restore();
        }
        if (tk0Var.getVisibility() == 0 && tk0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(tk0Var.getX(), tk0Var.getY());
            tk0Var.draw(canvas);
            canvas.restore();
        }
        if (oo0Var.getVisibility() != 0 || oo0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(oo0Var.getX(), oo0Var.getY());
        oo0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        op0 op0Var = this.p0;
        canvas.clipRect(0.0f, paddingTop + op0Var.l2, getMeasuredWidth(), getMeasuredHeight() + op0Var.l2 + org.telegram.messenger.i0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof vy) {
            op0 op0Var = this.p0;
            if (op0Var.M2 != null) {
                canvas.save();
                op0Var.M2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(op0Var.M2.M.k);
                op0Var.M2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.uu0
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.p0.I0;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.m1 m1Var = this.H;
        m1Var.b = this;
        m1Var.c();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        canvas.save();
        op0 op0Var = this.p0;
        Drawable drawable = op0Var.J1;
        FrameLayout frameLayout = op0Var.t1;
        canvas.translate(0.0f, op0Var.l2);
        int L = org.telegram.messenger.i0.L(6.0f) + (op0Var.h2 - op0Var.s0) + this.i0;
        int L2 = ((op0Var.h2 - op0Var.s0) - org.telegram.messenger.i0.L(13.0f)) + this.i0;
        op0Var.P1 = L2;
        int L3 = org.telegram.messenger.i0.L(60.0f) + getMeasuredHeight();
        int i10 = op0Var.s0;
        int i11 = L3 + i10;
        if (op0Var.V) {
            f7 = 0.0f;
        } else {
            int i12 = op0Var.y2.b;
            L += i12;
            f7 = this.o0.d(this.h0 && L2 + i10 < i12);
            L2 = org.telegram.messenger.i0.W1(f7, L2 + i12, -i10);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        float f10 = op0Var.s0 + L2 + op0Var.l2;
        if (op0Var.o1 != f10) {
            op0Var.o1 = f10;
            op0Var.i1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > op0Var.y2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + op0Var.s0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                wb wbVar = wb.w;
                if (wbVar != null) {
                    bb bbVar = wbVar.e;
                    if (bbVar != null) {
                        bbVar.setTop(true);
                    }
                    wbVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            int L4 = org.telegram.messenger.i0.L(36.0f);
            float measuredWidth = (getMeasuredWidth() - L4) / 2;
            float f11 = L;
            float measuredWidth2 = (getMeasuredWidth() + L4) / 2;
            float L5 = org.telegram.messenger.i0.L(4.0f) + L;
            RectF rectF = this.g0;
            rectF.set(measuredWidth, f11, measuredWidth2, L5);
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, op0Var.I0));
            org.telegram.ui.ActionBar.t6.t0.setAlpha((int) ((1.0f - f7) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z10 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, op0Var.I0)) > 0.721f && ((float) 0) > ((float) op0Var.y2.b) * 0.5f;
        if (z10 != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.j0 = this.i0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.h0;
        op0 op0Var = this.p0;
        if (z10) {
            if (motionEvent.getAction() == 0 && op0Var.h2 != 0 && motionEvent.getY() < op0Var.h2 - org.telegram.messenger.i0.L(30.0f)) {
                op0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.i0 - org.telegram.messenger.i0.L(30.0f)) {
            op0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int Q = Q();
        op0 op0Var = this.p0;
        to0 to0Var = op0Var.k1;
        int max = (op0Var.d || Q > org.telegram.messenger.i0.L(20.0f) || org.telegram.messenger.i0.E) ? 0 : Math.max(op0Var.y2.d, to0Var.getEmojiPadding());
        setBottomClip(max);
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & org.telegram.messenger.zs.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i19 = this.i0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - max) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (to0Var != null && to0Var.l(childAt)) {
                            if (org.telegram.messenger.i0.Q1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == op0Var.p1) {
                            i19 += op0Var.y2.d;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - max) - (this.i0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (to0Var != null) {
                        if (org.telegram.messenger.i0.Q1()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == op0Var.p1) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = op0Var.t0;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (to0Var != null) {
                }
                if (childAt == op0Var.p1) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        R();
        op0Var.Z0();
        op0.I0(op0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        bp0 bp0Var = this;
        op0 op0Var = bp0Var.p0;
        oo0 oo0Var = op0Var.y1;
        FrameLayout frameLayout = op0Var.U1;
        oo0 oo0Var2 = op0Var.x1;
        tk0 tk0Var = op0Var.w1;
        int size = bp0Var.getLayoutParams().height > 0 ? bp0Var.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        int i13 = 0;
        op0Var.z1.G = bp0Var.getLayoutParams().height <= 0;
        op0Var.B1.G = bp0Var.getLayoutParams().height <= 0;
        if (!op0Var.V) {
            bp0Var.f0 = true;
            int i14 = op0Var.t0;
            bp0Var.setPadding(i14, op0Var.y2.b, i14, 0);
            bp0Var.f0 = false;
        }
        int paddingTop = size - bp0Var.getPaddingTop();
        int D = org.telegram.messenger.m5.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(op0Var.E1.b(), op0Var.C1.b() - 1) / 4.0f)), org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(103.0f)) + op0Var.s0;
        if (tk0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.m5.D(103.0f, Math.max(2, (int) Math.ceil((op0Var.D1.b() - 1) / 4.0f)), org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(103.0f)) + op0Var.s0;
            if (D2 > D) {
                D = org.telegram.messenger.i0.W1(tk0Var.getAlpha(), D, D2);
            }
        }
        int i15 = D < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = org.telegram.messenger.i0.L((frameLayout != null ? 48 : 0) + 100) + op0Var.y2.d;
        if (oo0Var2.getPaddingTop() != i15 || oo0Var2.getPaddingBottom() != L) {
            bp0Var.f0 = true;
            oo0Var2.setPadding(0, i15, 0, L);
            tk0Var.setPadding(0, i15, 0, L);
            bp0Var.f0 = false;
        }
        if (op0Var.d && bp0Var.getLayoutParams().height <= 0 && oo0Var.getPaddingTop() != i15) {
            bp0Var.f0 = true;
            oo0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L((frameLayout == null ? 0 : 48) + 60) + op0Var.y2.d);
            bp0Var.f0 = false;
        }
        boolean z10 = D >= size;
        bp0Var.h0 = z10;
        bp0Var.i0 = z10 ? 0 : size - D;
        bp0Var.f0 = true;
        op0Var.K0(false);
        bp0Var.f0 = false;
        bp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i16 = op0Var.t0;
        FrameLayout frameLayout2 = op0Var.q1;
        to0 to0Var = op0Var.k1;
        int i17 = size2 - (i16 * 2);
        int Q = bp0Var.Q();
        op0Var.F2 = Q;
        if (!to0Var.N && Q <= org.telegram.messenger.i0.L(20.0f) && !to0Var.e && !to0Var.O) {
            bp0Var.f0 = true;
            to0Var.j();
            bp0Var.f0 = false;
        }
        bp0Var.f0 = true;
        if (op0Var.F2 <= org.telegram.messenger.i0.L(20.0f)) {
            if (!org.telegram.messenger.i0.E) {
                size3 -= op0Var.d ? 0 : to0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i18 = to0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i12 = 8;
        } else {
            if (!to0Var.m()) {
                to0Var.j();
            }
            i12 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i19 = makeMeasureSpec;
        int i20 = size3;
        bp0Var.f0 = false;
        int childCount = bp0Var.getChildCount();
        while (i13 < childCount) {
            View childAt = bp0Var.getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != i12) {
                if (!to0Var.l(childAt)) {
                    bp0Var.measureChildWithMargins(childAt, i10, 0, i19, 0);
                } else if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(200.0f), bp0Var.getPaddingTop() + (i20 - op0Var.y2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bp0Var.getPaddingTop() + (i20 - op0Var.y2.b), TLObject.FLAG_30));
                }
            }
            i13++;
            bp0Var = this;
        }
        op0Var.Z0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.p0.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f0) {
            return;
        }
        super.requestLayout();
    }
}

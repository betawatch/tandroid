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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ao0 extends tt0 {
    public boolean f0;
    public final RectF g0;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public final w5 o0;
    public final /* synthetic */ no0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(no0 no0Var, Context context) {
        super(context, null);
        this.p0 = no0Var;
        this.f0 = false;
        this.g0 = new RectF();
        this.H = new zn0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, no0Var.I0));
        this.o0 = new w5(this, 0L, 350L, xq.h);
    }

    @Override // org.telegram.ui.Components.tt0
    public final void J(Canvas canvas, ArrayList arrayList) {
        no0 no0Var = this.p0;
        pn0 pn0Var = no0Var.y1;
        qj0 qj0Var = no0Var.w1;
        pn0 pn0Var2 = no0Var.x1;
        if (pn0Var2.getVisibility() == 0 && pn0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(pn0Var2.getX(), pn0Var2.getY());
            pn0Var2.draw(canvas);
            canvas.restore();
        }
        if (qj0Var.getVisibility() == 0 && qj0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(qj0Var.getX(), qj0Var.getY());
            qj0Var.draw(canvas);
            canvas.restore();
        }
        if (pn0Var.getVisibility() != 0 || pn0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(pn0Var.getX(), pn0Var.getY());
        pn0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        no0 no0Var = this.p0;
        canvas.clipRect(0.0f, paddingTop + no0Var.l2, getMeasuredWidth(), getMeasuredHeight() + no0Var.l2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof hy) {
            no0 no0Var = this.p0;
            if (no0Var.M2 != null) {
                canvas.save();
                no0Var.M2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(no0Var.M2.Q.k);
                no0Var.M2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.tt0
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.p0.I0;
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.i1 i1Var = this.H;
        i1Var.b = this;
        i1Var.c();
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        no0 no0Var = this.p0;
        Drawable drawable = no0Var.J1;
        FrameLayout frameLayout = no0Var.t1;
        canvas.translate(0.0f, no0Var.l2);
        int L = org.telegram.messenger.g0.L(6.0f) + (no0Var.h2 - no0Var.s0) + this.i0;
        int L2 = ((no0Var.h2 - no0Var.s0) - org.telegram.messenger.g0.L(13.0f)) + this.i0;
        no0Var.P1 = L2;
        int L3 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i7 = no0Var.s0;
        int i10 = L3 + i7;
        if (no0Var.V) {
            f10 = 0.0f;
        } else {
            int i11 = no0Var.y2.b;
            L += i11;
            f10 = this.o0.d(this.h0 && L2 + i7 < i11);
            L2 = org.telegram.messenger.g0.W1(f10, L2 + i11, -i7);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i10);
        drawable.draw(canvas);
        float f11 = no0Var.s0 + L2 + no0Var.l2;
        if (no0Var.o1 != f11) {
            no0Var.o1 = f11;
            no0Var.i1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > no0Var.y2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + no0Var.s0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                cc ccVar = cc.w;
                if (ccVar != null) {
                    gb gbVar = ccVar.e;
                    if (gbVar != null) {
                        gbVar.setTop(true);
                    }
                    ccVar.b();
                }
            }
        }
        if (f10 < 1.0f) {
            int L4 = org.telegram.messenger.g0.L(36.0f);
            float measuredWidth = (getMeasuredWidth() - L4) / 2;
            float f12 = L;
            float measuredWidth2 = (getMeasuredWidth() + L4) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L;
            RectF rectF = this.g0;
            rectF.set(measuredWidth, f12, measuredWidth2, L5);
            org.telegram.ui.ActionBar.l6.t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, no0Var.I0));
            org.telegram.ui.ActionBar.l6.t0.setAlpha((int) ((1.0f - f10) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z9 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, no0Var.I0)) > 0.721f && ((float) 0) > ((float) no0Var.y2.b) * 0.5f;
        if (z9 != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z9 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.j0 = this.i0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9 = this.h0;
        no0 no0Var = this.p0;
        if (z9) {
            if (motionEvent.getAction() == 0 && no0Var.h2 != 0 && motionEvent.getY() < no0Var.h2 - org.telegram.messenger.g0.L(30.0f)) {
                no0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.i0 - org.telegram.messenger.g0.L(30.0f)) {
            no0Var.dismiss();
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
    @Override // org.telegram.ui.Components.tt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int Q = Q();
        no0 no0Var = this.p0;
        tn0 tn0Var = no0Var.k1;
        int max = (no0Var.d || Q > org.telegram.messenger.g0.L(20.0f) || org.telegram.messenger.g0.E) ? 0 : Math.max(no0Var.y2.d, tn0Var.getEmojiPadding());
        setBottomClip(max);
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & org.telegram.messenger.qs.x1;
                int i22 = i20 & 7;
                if (i22 == 1) {
                    i13 = (((i11 - i7) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i21 == 16) {
                        if (i21 == 48) {
                            i18 = this.i0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i21 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - max) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (tn0Var != null && tn0Var.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == no0Var.p1) {
                            i18 += no0Var.y2.d;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - max) - (this.i0 + i10)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (tn0Var != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == no0Var.p1) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (((i11 - i7) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = no0Var.t0;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (tn0Var != null) {
                }
                if (childAt == no0Var.p1) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
        no0Var.Z0();
        no0.I0(no0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        ao0 ao0Var = this;
        no0 no0Var = ao0Var.p0;
        pn0 pn0Var = no0Var.y1;
        FrameLayout frameLayout = no0Var.U1;
        pn0 pn0Var2 = no0Var.x1;
        qj0 qj0Var = no0Var.w1;
        int size = ao0Var.getLayoutParams().height > 0 ? ao0Var.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        int i12 = 0;
        no0Var.z1.G = ao0Var.getLayoutParams().height <= 0;
        no0Var.B1.G = ao0Var.getLayoutParams().height <= 0;
        if (!no0Var.V) {
            ao0Var.f0 = true;
            int i13 = no0Var.t0;
            ao0Var.setPadding(i13, no0Var.y2.b, i13, 0);
            ao0Var.f0 = false;
        }
        int paddingTop = size - ao0Var.getPaddingTop();
        int D = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(no0Var.E1.b(), no0Var.C1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + no0Var.s0;
        if (qj0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil((no0Var.D1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + no0Var.s0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(qj0Var.getAlpha(), D, D2);
            }
        }
        int i14 = D < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = org.telegram.messenger.g0.L((frameLayout != null ? 48 : 0) + 100) + no0Var.y2.d;
        if (pn0Var2.getPaddingTop() != i14 || pn0Var2.getPaddingBottom() != L) {
            ao0Var.f0 = true;
            pn0Var2.setPadding(0, i14, 0, L);
            qj0Var.setPadding(0, i14, 0, L);
            ao0Var.f0 = false;
        }
        if (no0Var.d && ao0Var.getLayoutParams().height <= 0 && pn0Var.getPaddingTop() != i14) {
            ao0Var.f0 = true;
            pn0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L((frameLayout == null ? 0 : 48) + 60) + no0Var.y2.d);
            ao0Var.f0 = false;
        }
        boolean z9 = D >= size;
        ao0Var.h0 = z9;
        ao0Var.i0 = z9 ? 0 : size - D;
        ao0Var.f0 = true;
        no0Var.K0(false);
        ao0Var.f0 = false;
        ao0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i15 = no0Var.t0;
        FrameLayout frameLayout2 = no0Var.q1;
        tn0 tn0Var = no0Var.k1;
        int i16 = size2 - (i15 * 2);
        int Q = ao0Var.Q();
        no0Var.F2 = Q;
        if (!tn0Var.N && Q <= org.telegram.messenger.g0.L(20.0f) && !tn0Var.e && !tn0Var.O) {
            ao0Var.f0 = true;
            tn0Var.j();
            ao0Var.f0 = false;
        }
        ao0Var.f0 = true;
        if (no0Var.F2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                size3 -= no0Var.d ? 0 : tn0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i17 = tn0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i17);
            }
            i11 = 8;
        } else {
            if (!tn0Var.m()) {
                tn0Var.j();
            }
            i11 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i18 = makeMeasureSpec;
        int i19 = size3;
        ao0Var.f0 = false;
        int childCount = ao0Var.getChildCount();
        while (i12 < childCount) {
            View childAt = ao0Var.getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != i11) {
                if (!tn0Var.l(childAt)) {
                    ao0Var.measureChildWithMargins(childAt, i7, 0, i18, 0);
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), ao0Var.getPaddingTop() + (i19 - no0Var.y2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ao0Var.getPaddingTop() + (i19 - no0Var.y2.b), TLObject.FLAG_30));
                }
            }
            i12++;
            ao0Var = this;
        }
        no0Var.Z0();
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

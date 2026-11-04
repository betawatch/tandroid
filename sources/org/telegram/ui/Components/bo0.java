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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bo0 extends qt0 {
    public boolean g0;
    public final RectF h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public final u5 p0;
    public final /* synthetic */ oo0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(oo0 oo0Var, Context context) {
        super(context, null);
        this.q0 = oo0Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.I = new ao0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, oo0Var.J0));
        this.p0 = new u5(this, 0L, 350L, xq.h);
    }

    @Override // org.telegram.ui.Components.qt0
    public final void J(Canvas canvas, ArrayList arrayList) {
        oo0 oo0Var = this.q0;
        qn0 qn0Var = oo0Var.z1;
        tj0 tj0Var = oo0Var.x1;
        qn0 qn0Var2 = oo0Var.y1;
        if (qn0Var2.getVisibility() == 0 && qn0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(qn0Var2.getX(), qn0Var2.getY());
            qn0Var2.draw(canvas);
            canvas.restore();
        }
        if (tj0Var.getVisibility() == 0 && tj0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(tj0Var.getX(), tj0Var.getY());
            tj0Var.draw(canvas);
            canvas.restore();
        }
        if (qn0Var.getVisibility() != 0 || qn0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(qn0Var.getX(), qn0Var.getY());
        qn0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        oo0 oo0Var = this.q0;
        canvas.clipRect(0.0f, paddingTop + oo0Var.m2, getMeasuredWidth(), getMeasuredHeight() + oo0Var.m2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof ey) {
            oo0 oo0Var = this.q0;
            if (oo0Var.N2 != null) {
                canvas.save();
                oo0Var.N2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(oo0Var.N2.R.k);
                oo0Var.N2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.qt0
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.q0.J0;
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.h1 h1Var = this.I;
        h1Var.b = this;
        h1Var.c();
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        oo0 oo0Var = this.q0;
        Drawable drawable = oo0Var.K1;
        FrameLayout frameLayout = oo0Var.u1;
        canvas.translate(0.0f, oo0Var.m2);
        int L = org.telegram.messenger.g0.L(6.0f) + (oo0Var.i2 - oo0Var.t0) + this.j0;
        int L2 = ((oo0Var.i2 - oo0Var.t0) - org.telegram.messenger.g0.L(13.0f)) + this.j0;
        oo0Var.Q1 = L2;
        int L3 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i3 = oo0Var.t0;
        int i10 = L3 + i3;
        if (oo0Var.W) {
            f10 = 0.0f;
        } else {
            int i11 = oo0Var.z2.b;
            L += i11;
            f10 = this.p0.d(this.i0 && L2 + i3 < i11);
            L2 = org.telegram.messenger.g0.W1(f10, L2 + i11, -i3);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i10);
        drawable.draw(canvas);
        float f11 = oo0Var.t0 + L2 + oo0Var.m2;
        if (oo0Var.p1 != f11) {
            oo0Var.p1 = f11;
            oo0Var.j1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > oo0Var.z2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + oo0Var.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                ac acVar = ac.w;
                if (acVar != null) {
                    fb fbVar = acVar.e;
                    if (fbVar != null) {
                        fbVar.setTop(true);
                    }
                    acVar.b();
                }
            }
        }
        if (f10 < 1.0f) {
            int L4 = org.telegram.messenger.g0.L(36.0f);
            float measuredWidth = (getMeasuredWidth() - L4) / 2;
            float f12 = L;
            float measuredWidth2 = (getMeasuredWidth() + L4) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L;
            RectF rectF = this.h0;
            rectF.set(measuredWidth, f12, measuredWidth2, L5);
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, oo0Var.J0));
            org.telegram.ui.ActionBar.k6.t0.setAlpha((int) ((1.0f - f10) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, oo0Var.J0)) > 0.721f && ((float) 0) > ((float) oo0Var.z2.b) * 0.5f;
        if (z10 != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.k0 = this.j0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.i0;
        oo0 oo0Var = this.q0;
        if (z10) {
            if (motionEvent.getAction() == 0 && oo0Var.i2 != 0 && motionEvent.getY() < oo0Var.i2 - org.telegram.messenger.g0.L(30.0f)) {
                oo0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.j0 - org.telegram.messenger.g0.L(30.0f)) {
            oo0Var.dismiss();
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
    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
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
        oo0 oo0Var = this.q0;
        un0 un0Var = oo0Var.l1;
        int max = (oo0Var.d || Q > org.telegram.messenger.g0.L(20.0f) || org.telegram.messenger.g0.E) ? 0 : Math.max(oo0Var.z2.d, un0Var.getEmojiPadding());
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
                int i21 = i20 & org.telegram.messenger.hs.x1;
                int i22 = i20 & 7;
                if (i22 == 1) {
                    i13 = (((i11 - i3) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i21 == 16) {
                        if (i21 == 48) {
                            i18 = this.j0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i21 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - max) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (un0Var != null && un0Var.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == oo0Var.q1) {
                            i18 += oo0Var.z2.d;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - max) - (this.j0 + i10)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (un0Var != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == oo0Var.q1) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (((i11 - i3) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = oo0Var.u0;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (un0Var != null) {
                }
                if (childAt == oo0Var.q1) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
        oo0Var.Z0();
        oo0.I0(oo0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        bo0 bo0Var = this;
        oo0 oo0Var = bo0Var.q0;
        qn0 qn0Var = oo0Var.z1;
        FrameLayout frameLayout = oo0Var.V1;
        qn0 qn0Var2 = oo0Var.y1;
        tj0 tj0Var = oo0Var.x1;
        int size = bo0Var.getLayoutParams().height > 0 ? bo0Var.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        int i12 = 0;
        oo0Var.A1.G = bo0Var.getLayoutParams().height <= 0;
        oo0Var.C1.G = bo0Var.getLayoutParams().height <= 0;
        if (!oo0Var.W) {
            bo0Var.g0 = true;
            int i13 = oo0Var.u0;
            bo0Var.setPadding(i13, oo0Var.z2.b, i13, 0);
            bo0Var.g0 = false;
        }
        int paddingTop = size - bo0Var.getPaddingTop();
        int D = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(oo0Var.F1.b(), oo0Var.D1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + oo0Var.t0;
        if (tj0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil((oo0Var.E1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + oo0Var.t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(tj0Var.getAlpha(), D, D2);
            }
        }
        int i14 = D < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = org.telegram.messenger.g0.L((frameLayout != null ? 48 : 0) + 100) + oo0Var.z2.d;
        if (qn0Var2.getPaddingTop() != i14 || qn0Var2.getPaddingBottom() != L) {
            bo0Var.g0 = true;
            qn0Var2.setPadding(0, i14, 0, L);
            tj0Var.setPadding(0, i14, 0, L);
            bo0Var.g0 = false;
        }
        if (oo0Var.d && bo0Var.getLayoutParams().height <= 0 && qn0Var.getPaddingTop() != i14) {
            bo0Var.g0 = true;
            qn0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L((frameLayout == null ? 0 : 48) + 60) + oo0Var.z2.d);
            bo0Var.g0 = false;
        }
        boolean z10 = D >= size;
        bo0Var.i0 = z10;
        bo0Var.j0 = z10 ? 0 : size - D;
        bo0Var.g0 = true;
        oo0Var.K0(false);
        bo0Var.g0 = false;
        bo0Var.setMeasuredDimension(View.MeasureSpec.getSize(i3), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i15 = oo0Var.u0;
        FrameLayout frameLayout2 = oo0Var.r1;
        un0 un0Var = oo0Var.l1;
        int i16 = size2 - (i15 * 2);
        int Q = bo0Var.Q();
        oo0Var.G2 = Q;
        if (!un0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !un0Var.e && !un0Var.P) {
            bo0Var.g0 = true;
            un0Var.j();
            bo0Var.g0 = false;
        }
        bo0Var.g0 = true;
        if (oo0Var.G2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                size3 -= oo0Var.d ? 0 : un0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i17 = un0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i17);
            }
            i11 = 8;
        } else {
            if (!un0Var.m()) {
                un0Var.j();
            }
            i11 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i18 = makeMeasureSpec;
        int i19 = size3;
        bo0Var.g0 = false;
        int childCount = bo0Var.getChildCount();
        while (i12 < childCount) {
            View childAt = bo0Var.getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != i11) {
                if (!un0Var.l(childAt)) {
                    bo0Var.measureChildWithMargins(childAt, i3, 0, i18, 0);
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), bo0Var.getPaddingTop() + (i19 - oo0Var.z2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bo0Var.getPaddingTop() + (i19 - oo0Var.z2.b), TLObject.FLAG_30));
                }
            }
            i12++;
            bo0Var = this;
        }
        oo0Var.Z0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.q0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}

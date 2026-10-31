package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ w7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(w7 w7Var, Context context) {
        super(context);
        this.e = w7Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new k7(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        w7 w7Var = this.e;
        j7 j7Var = w7Var.o1;
        kg.g1 g1Var = w7Var.j1;
        boolean z10 = w7Var.k2;
        if (w7Var.n2.size() <= 1) {
            w7Var.r0.setBounds(0, (getMeasuredHeight() - w7Var.u1.getMeasuredHeight()) - w7Var.s0, getMeasuredWidth(), getMeasuredHeight());
            w7Var.r0.draw(canvas);
            if (z10) {
                g1Var.setVisibility(8);
                return;
            }
            return;
        }
        if (j7Var.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.i0.L(13.0f);
        int translationY = (int) (j7Var.getTranslationY() + ((w7Var.q2 - w7Var.s0) - L));
        if (z10) {
            translationY = (translationY - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) + org.telegram.messenger.i0.L(10.0f);
        }
        int L2 = org.telegram.messenger.i0.L(20.0f) + translationY;
        int L3 = org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight();
        int i10 = w7Var.s0;
        int i11 = L3 + i10;
        if (z10 || i10 + translationY >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f7 = 0.0f;
            f10 = 1.0f;
        } else {
            float L4 = org.telegram.messenger.i0.L(4.0f) + L;
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - w7Var.s0) / L4);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L4) * f7);
            translationY -= currentActionBarHeight;
            L2 -= currentActionBarHeight;
            i11 += currentActionBarHeight;
            f10 = 1.0f - f7;
        }
        int i12 = (int) ((1.0f - f7) * org.telegram.messenger.i0.m);
        int i13 = translationY + i12;
        int i14 = L2 + i12;
        w7Var.r0.setBounds(0, i13, getMeasuredWidth(), i11);
        w7Var.r0.draw(canvas);
        RectF rectF = this.a;
        if (z10 || f10 == 1.0f) {
            f11 = 10.0f;
            f12 = 4.0f;
        } else {
            f11 = 10.0f;
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, w7Var.I0));
            f12 = 4.0f;
            rectF.set(w7Var.t0, w7Var.s0 + i13, getMeasuredWidth() - w7Var.t0, org.telegram.messenger.i0.L(24.0f) + w7Var.s0 + i13);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f10, org.telegram.messenger.i0.L(12.0f) * f10, org.telegram.ui.ActionBar.t6.t0);
        }
        if (!z10 && f10 != 0.0f) {
            int L5 = org.telegram.messenger.i0.L(36.0f);
            rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.i0.L(f12) + i14);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, w7Var.I0);
            int alpha = Color.alpha(w02);
            org.telegram.ui.ActionBar.t6.t0.setColor(w02);
            org.telegram.ui.ActionBar.t6.t0.setAlpha((int) (alpha * 1.0f * f10));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
        }
        if (z10) {
            g1Var.setVisibility(0);
            g1Var.setTranslationY(Math.max(0.0f, c3.i0.z(1.0f, w7Var.H2, org.telegram.messenger.i0.L(6.0f), (i13 - w7Var.s0) - org.telegram.messenger.i0.L(f11)) - g1Var.getTop()));
            w7Var.k1.setTranslationY(Math.max(0.0f, c3.i0.z(1.0f, w7Var.H2, org.telegram.messenger.i0.L(6.0f), (i13 - w7Var.s0) - org.telegram.messenger.i0.L(f11)) - g1Var.getTop()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (org.telegram.messenger.i0.L(12.0f) + r0.q2)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.i0.L(((r0.O0() || r0.p2) ? 0 : 52) + org.telegram.messenger.zs.V2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            w7 w7Var = this.e;
            if (w7Var.q2 != 0 && w7Var.j1.getAlpha() == 0.0f) {
                if (w7Var.q1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w7 w7Var = this.e;
        w7.I0(w7Var);
        w7Var.Z0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int L;
        w7 w7Var = this.e;
        e7 e7Var = w7Var.u1;
        e7 e7Var2 = w7Var.Y1;
        j7 j7Var = w7Var.o1;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size != this.c || size2 != this.d) {
            if (e7Var2.getTag() != null) {
                w7Var.W0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        e7Var.setVisibility((w7Var.m1 || w7Var.d) ? 4 : 0);
        w7Var.l1.setVisibility(e7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) j7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
        ((FrameLayout.LayoutParams) w7Var.k1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
        ((FrameLayout.LayoutParams) e7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = org.telegram.messenger.i0.L(org.telegram.messenger.zs.J2 + ((w7Var.O0() || w7Var.p2) ? 0 : 52));
        if (w7Var.n2.size() > 1) {
            L2 += (org.telegram.messenger.i0.L(56.0f) * w7Var.n2.size()) + w7Var.s0;
        }
        if (w7Var.n1 || w7Var.d) {
            L = org.telegram.messenger.i0.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.i0.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - org.telegram.messenger.i0.L(((w7Var.O0() || w7Var.p2) ? 0 : 52) + org.telegram.messenger.zs.A5)) {
                L = paddingTop - org.telegram.messenger.i0.L(((w7Var.O0() || w7Var.p2) ? 0 : 52) + org.telegram.messenger.zs.A5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (w7Var.l2) {
            L = 0;
        }
        if (j7Var.getPaddingTop() != L) {
            j7Var.setPadding(0, L, 0, (w7Var.n1 && w7Var.d) ? 0 : j7Var.getPaddingBottom());
        }
        this.b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        getMeasuredHeight();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}

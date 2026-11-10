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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ a8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(a8 a8Var, Context context) {
        super(context);
        this.e = a8Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new ch.v(this, 5));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        a8 a8Var = this.e;
        m7 m7Var = a8Var.r1;
        q7 q7Var = a8Var.m1;
        boolean z9 = a8Var.n2;
        if (a8Var.q2.size() <= 1) {
            a8Var.r0.setBounds(0, (getMeasuredHeight() - a8Var.x1.getMeasuredHeight()) - a8Var.s0, getMeasuredWidth(), getMeasuredHeight());
            a8Var.r0.draw(canvas);
            if (z9) {
                q7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (m7Var.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (m7Var.getTranslationY() + ((a8Var.t2 - a8Var.s0) - L));
        if (z9) {
            translationY = (translationY - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
        }
        int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = a8Var.s0;
        int i10 = L3 + i7;
        if (z9 || i7 + translationY >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f10 = 0.0f;
            f11 = 1.0f;
        } else {
            float L4 = org.telegram.messenger.g0.L(4.0f) + L;
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - a8Var.s0) / L4);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L4) * f10);
            translationY -= currentActionBarHeight;
            L2 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f11 = 1.0f - f10;
        }
        int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.m);
        int i12 = translationY + i11;
        int i13 = L2 + i11;
        a8Var.r0.setBounds(0, i12, getMeasuredWidth(), i10);
        a8Var.r0.draw(canvas);
        RectF rectF = this.a;
        if (z9 || f11 == 1.0f) {
            f12 = 20.0f;
            f13 = 4.0f;
        } else {
            f12 = 20.0f;
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, a8Var.I0));
            f13 = 4.0f;
            rectF.set(a8Var.t0, a8Var.s0 + i12, getMeasuredWidth() - a8Var.t0, org.telegram.messenger.g0.L(24.0f) + a8Var.s0 + i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.m6.t0);
        }
        if (!z9 && f11 != 0.0f) {
            int L5 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, a8Var.I0);
            int alpha = Color.alpha(w02);
            org.telegram.ui.ActionBar.m6.t0.setColor(w02);
            org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (alpha * 1.0f * f11));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
        }
        if (z9) {
            q7Var.setVisibility(0);
            float max = Math.max(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, a8Var.K2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + ((i12 - org.telegram.messenger.g0.m) - a8Var.s0)) - q7Var.getTop());
            q7Var.setTranslationY(max);
            a8Var.n1.setTranslationY(max);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (org.telegram.messenger.g0.L(12.0f) + r0.t2)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.g0.L(((r0.O0() || r0.s2) ? 0 : 52) + org.telegram.messenger.qs.V2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a8 a8Var = this.e;
            if (a8Var.t2 != 0 && a8Var.m1.getAlpha() == 0.0f) {
                if (a8Var.t1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a8 a8Var = this.e;
        a8.I0(a8Var);
        a8Var.Z0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        a8 a8Var = this.e;
        h7 h7Var = a8Var.x1;
        h7 h7Var2 = a8Var.b2;
        m7 m7Var = a8Var.r1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.c || size2 != this.d) {
            if (h7Var2.getTag() != null) {
                a8Var.W0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        h7Var.setVisibility((a8Var.p1 || a8Var.d) ? 4 : 0);
        a8Var.o1.setVisibility(h7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) m7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) a8Var.n1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) h7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.qs.J2 + ((a8Var.O0() || a8Var.s2) ? 0 : 52));
        if (a8Var.q2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * a8Var.q2.size()) + a8Var.s0;
        }
        if (a8Var.q1 || a8Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - org.telegram.messenger.g0.L(((a8Var.O0() || a8Var.s2) ? 0 : 52) + org.telegram.messenger.qs.A5)) {
                L = paddingTop - org.telegram.messenger.g0.L(((a8Var.O0() || a8Var.s2) ? 0 : 52) + org.telegram.messenger.qs.A5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (a8Var.o2) {
            L = 0;
        }
        if (m7Var.getPaddingTop() != L) {
            m7Var.setPadding(0, L, 0, (a8Var.q1 && a8Var.d) ? 0 : m7Var.getPaddingBottom());
        }
        this.b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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

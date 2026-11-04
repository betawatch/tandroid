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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ z7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(z7 z7Var, Context context) {
        super(context);
        this.e = z7Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new ai.h1(this, 6));
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
        z7 z7Var = this.e;
        l7 l7Var = z7Var.p1;
        p7 p7Var = z7Var.k1;
        boolean z10 = z7Var.l2;
        if (z7Var.o2.size() <= 1) {
            z7Var.s0.setBounds(0, (getMeasuredHeight() - z7Var.v1.getMeasuredHeight()) - z7Var.t0, getMeasuredWidth(), getMeasuredHeight());
            z7Var.s0.draw(canvas);
            if (z10) {
                p7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (l7Var.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (l7Var.getTranslationY() + ((z7Var.r2 - z7Var.t0) - L));
        if (z10) {
            translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
        }
        int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i3 = z7Var.t0;
        int i10 = L3 + i3;
        if (z10 || i3 + translationY >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = 0.0f;
            f11 = 1.0f;
        } else {
            float L4 = org.telegram.messenger.g0.L(4.0f) + L;
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - z7Var.t0) / L4);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
            translationY -= currentActionBarHeight;
            L2 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f11 = 1.0f - f10;
        }
        int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.m);
        int i12 = translationY + i11;
        int i13 = L2 + i11;
        z7Var.s0.setBounds(0, i12, getMeasuredWidth(), i10);
        z7Var.s0.draw(canvas);
        RectF rectF = this.a;
        if (z10 || f11 == 1.0f) {
            f12 = 10.0f;
            f13 = 4.0f;
        } else {
            f12 = 10.0f;
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, z7Var.J0));
            f13 = 4.0f;
            rectF.set(z7Var.u0, z7Var.t0 + i12, getMeasuredWidth() - z7Var.u0, org.telegram.messenger.g0.L(24.0f) + z7Var.t0 + i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.k6.t0);
        }
        if (!z10 && f11 != 0.0f) {
            int L5 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, z7Var.J0);
            int alpha = Color.alpha(w02);
            org.telegram.ui.ActionBar.k6.t0.setColor(w02);
            org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (alpha * 1.0f * f11));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
        }
        if (z10) {
            p7Var.setVisibility(0);
            p7Var.setTranslationY(Math.max(0.0f, com.google.android.recaptcha.internal.a.y(1.0f, z7Var.I2, org.telegram.messenger.g0.L(6.0f), (i12 - z7Var.t0) - org.telegram.messenger.g0.L(f12)) - p7Var.getTop()));
            z7Var.l1.setTranslationY(Math.max(0.0f, com.google.android.recaptcha.internal.a.y(1.0f, z7Var.I2, org.telegram.messenger.g0.L(6.0f), (i12 - z7Var.t0) - org.telegram.messenger.g0.L(f12)) - p7Var.getTop()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (org.telegram.messenger.g0.L(12.0f) + r0.r2)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.g0.L(((r0.O0() || r0.q2) ? 0 : 52) + org.telegram.messenger.hs.V2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            z7 z7Var = this.e;
            if (z7Var.r2 != 0 && z7Var.k1.getAlpha() == 0.0f) {
                if (z7Var.r1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        z7 z7Var = this.e;
        z7.I0(z7Var);
        z7Var.Z0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int L;
        z7 z7Var = this.e;
        g7 g7Var = z7Var.v1;
        g7 g7Var2 = z7Var.Z1;
        l7 l7Var = z7Var.p1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i3);
        if (size != this.c || size2 != this.d) {
            if (g7Var2.getTag() != null) {
                z7Var.W0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        g7Var.setVisibility((z7Var.n1 || z7Var.d) ? 4 : 0);
        z7Var.m1.setVisibility(g7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) l7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) z7Var.l1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) g7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.hs.J2 + ((z7Var.O0() || z7Var.q2) ? 0 : 52));
        if (z7Var.o2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * z7Var.o2.size()) + z7Var.t0;
        }
        if (z7Var.o1 || z7Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - org.telegram.messenger.g0.L(((z7Var.O0() || z7Var.q2) ? 0 : 52) + org.telegram.messenger.hs.A5)) {
                L = paddingTop - org.telegram.messenger.g0.L(((z7Var.O0() || z7Var.q2) ? 0 : 52) + org.telegram.messenger.hs.A5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (z7Var.m2) {
            L = 0;
        }
        if (l7Var.getPaddingTop() != L) {
            l7Var.setPadding(0, L, 0, (z7Var.o1 && z7Var.d) ? 0 : l7Var.getPaddingBottom());
        }
        this.b = false;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        getMeasuredHeight();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}

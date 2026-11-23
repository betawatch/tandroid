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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ f8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(f8 f8Var, Context context) {
        super(context);
        this.e = f8Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new bi.i1(this, 6));
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
        f8 f8Var = this.e;
        r7 r7Var = f8Var.s1;
        v7 v7Var = f8Var.n1;
        boolean z10 = f8Var.o2;
        if (f8Var.r2.size() <= 1) {
            f8Var.s0.setBounds(0, (getMeasuredHeight() - f8Var.y1.getMeasuredHeight()) - f8Var.t0, getMeasuredWidth(), getMeasuredHeight());
            f8Var.s0.draw(canvas);
            if (z10) {
                v7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (r7Var.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (r7Var.getTranslationY() + ((f8Var.u2 - f8Var.t0) - L));
        if (z10) {
            translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
        }
        int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = f8Var.t0;
        int i10 = L3 + i7;
        if (z10 || i7 + translationY >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = 0.0f;
            f11 = 1.0f;
        } else {
            float L4 = org.telegram.messenger.g0.L(4.0f) + L;
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - f8Var.t0) / L4);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
            translationY -= currentActionBarHeight;
            L2 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f11 = 1.0f - f10;
        }
        int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.m);
        int i12 = translationY + i11;
        int i13 = L2 + i11;
        f8Var.s0.setBounds(0, i12, getMeasuredWidth(), i10);
        f8Var.s0.draw(canvas);
        RectF rectF = this.a;
        if (z10 || f11 == 1.0f) {
            f12 = 20.0f;
            f13 = 4.0f;
        } else {
            f12 = 20.0f;
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, f8Var.J0));
            f13 = 4.0f;
            rectF.set(f8Var.u0, f8Var.t0 + i12, getMeasuredWidth() - f8Var.u0, org.telegram.messenger.g0.L(24.0f) + f8Var.t0 + i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.m6.t0);
        }
        if (!z10 && f11 != 0.0f) {
            int L5 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, f8Var.J0);
            int alpha = Color.alpha(w02);
            org.telegram.ui.ActionBar.m6.t0.setColor(w02);
            org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (alpha * 1.0f * f11));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
        }
        if (z10) {
            v7Var.setVisibility(0);
            float max = Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, f8Var.L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + ((i12 - org.telegram.messenger.g0.m) - f8Var.t0)) - v7Var.getTop());
            v7Var.setTranslationY(max);
            f8Var.o1.setTranslationY(max);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (org.telegram.messenger.g0.L(12.0f) + r0.u2)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.g0.L(((r0.P0() || r0.t2) ? 0 : 52) + org.telegram.messenger.ls.V2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f8 f8Var = this.e;
            if (f8Var.u2 != 0 && f8Var.n1.getAlpha() == 0.0f) {
                if (f8Var.u1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        f8 f8Var = this.e;
        f8.J0(f8Var);
        f8Var.a1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        f8 f8Var = this.e;
        m7 m7Var = f8Var.y1;
        m7 m7Var2 = f8Var.c2;
        r7 r7Var = f8Var.s1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.c || size2 != this.d) {
            if (m7Var2.getTag() != null) {
                f8Var.X0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        m7Var.setVisibility((f8Var.q1 || f8Var.d) ? 4 : 0);
        f8Var.p1.setVisibility(m7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) r7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) f8Var.o1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) m7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.ls.J2 + ((f8Var.P0() || f8Var.t2) ? 0 : 52));
        if (f8Var.r2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * f8Var.r2.size()) + f8Var.t0;
        }
        if (f8Var.r1 || f8Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - org.telegram.messenger.g0.L(((f8Var.P0() || f8Var.t2) ? 0 : 52) + org.telegram.messenger.ls.A5)) {
                L = paddingTop - org.telegram.messenger.g0.L(((f8Var.P0() || f8Var.t2) ? 0 : 52) + org.telegram.messenger.ls.A5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (f8Var.p2) {
            L = 0;
        }
        if (r7Var.getPaddingTop() != L) {
            r7Var.setPadding(0, L, 0, (f8Var.r1 && f8Var.d) ? 0 : r7Var.getPaddingBottom());
        }
        this.b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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

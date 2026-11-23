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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ e8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(e8 e8Var, Context context) {
        super(context);
        this.e = e8Var;
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
        e8 e8Var = this.e;
        q7 q7Var = e8Var.s1;
        u7 u7Var = e8Var.n1;
        boolean z10 = e8Var.o2;
        if (e8Var.r2.size() <= 1) {
            e8Var.s0.setBounds(0, (getMeasuredHeight() - e8Var.y1.getMeasuredHeight()) - e8Var.t0, getMeasuredWidth(), getMeasuredHeight());
            e8Var.s0.draw(canvas);
            if (z10) {
                u7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (q7Var.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (q7Var.getTranslationY() + ((e8Var.u2 - e8Var.t0) - L));
        if (z10) {
            translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
        }
        int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = e8Var.t0;
        int i10 = L3 + i7;
        if (z10 || i7 + translationY >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = 0.0f;
            f11 = 1.0f;
        } else {
            float L4 = org.telegram.messenger.g0.L(4.0f) + L;
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - e8Var.t0) / L4);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
            translationY -= currentActionBarHeight;
            L2 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f11 = 1.0f - f10;
        }
        int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.m);
        int i12 = translationY + i11;
        int i13 = L2 + i11;
        e8Var.s0.setBounds(0, i12, getMeasuredWidth(), i10);
        e8Var.s0.draw(canvas);
        RectF rectF = this.a;
        if (z10 || f11 == 1.0f) {
            f12 = 20.0f;
            f13 = 4.0f;
        } else {
            f12 = 20.0f;
            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, e8Var.J0));
            f13 = 4.0f;
            rectF.set(e8Var.u0, e8Var.t0 + i12, getMeasuredWidth() - e8Var.u0, org.telegram.messenger.g0.L(24.0f) + e8Var.t0 + i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.n6.t0);
        }
        if (!z10 && f11 != 0.0f) {
            int L5 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, e8Var.J0);
            int alpha = Color.alpha(w02);
            org.telegram.ui.ActionBar.n6.t0.setColor(w02);
            org.telegram.ui.ActionBar.n6.t0.setAlpha((int) (alpha * 1.0f * f11));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.t0);
        }
        if (z10) {
            u7Var.setVisibility(0);
            float max = Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, e8Var.L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + ((i12 - org.telegram.messenger.g0.m) - e8Var.t0)) - u7Var.getTop());
            u7Var.setTranslationY(max);
            e8Var.o1.setTranslationY(max);
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
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.g0.L(((r0.P0() || r0.t2) ? 0 : 52) + org.telegram.messenger.ks.V2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e8 e8Var = this.e;
            if (e8Var.u2 != 0 && e8Var.n1.getAlpha() == 0.0f) {
                if (e8Var.u1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        e8 e8Var = this.e;
        e8.J0(e8Var);
        e8Var.a1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        e8 e8Var = this.e;
        l7 l7Var = e8Var.y1;
        l7 l7Var2 = e8Var.c2;
        q7 q7Var = e8Var.s1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.c || size2 != this.d) {
            if (l7Var2.getTag() != null) {
                e8Var.X0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        l7Var.setVisibility((e8Var.q1 || e8Var.d) ? 4 : 0);
        e8Var.p1.setVisibility(l7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) q7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) e8Var.o1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) l7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.ks.J2 + ((e8Var.P0() || e8Var.t2) ? 0 : 52));
        if (e8Var.r2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * e8Var.r2.size()) + e8Var.t0;
        }
        if (e8Var.r1 || e8Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - org.telegram.messenger.g0.L(((e8Var.P0() || e8Var.t2) ? 0 : 52) + org.telegram.messenger.ks.A5)) {
                L = paddingTop - org.telegram.messenger.g0.L(((e8Var.P0() || e8Var.t2) ? 0 : 52) + org.telegram.messenger.ks.A5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (e8Var.p2) {
            L = 0;
        }
        if (q7Var.getPaddingTop() != L) {
            q7Var.setPadding(0, L, 0, (e8Var.r1 && e8Var.d) ? 0 : q7Var.getPaddingBottom());
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

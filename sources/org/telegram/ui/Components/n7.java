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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ y7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(y7 y7Var, Context context) {
        super(context);
        this.e = y7Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new bi.e1(this, 6));
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
        y7 y7Var = this.e;
        k7 k7Var = y7Var.s1;
        o7 o7Var = y7Var.n1;
        boolean z10 = y7Var.o2;
        if (y7Var.r2.size() <= 1) {
            y7Var.s0.setBounds(0, (getMeasuredHeight() - y7Var.y1.getMeasuredHeight()) - y7Var.t0, getMeasuredWidth(), getMeasuredHeight());
            y7Var.s0.draw(canvas);
            if (z10) {
                o7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (k7Var.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (k7Var.getTranslationY() + ((y7Var.u2 - y7Var.t0) - L));
        if (z10) {
            translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
        }
        int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = y7Var.t0;
        int i10 = L3 + i7;
        if (z10 || i7 + translationY >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = 0.0f;
            f11 = 1.0f;
        } else {
            float L4 = org.telegram.messenger.g0.L(4.0f) + L;
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - y7Var.t0) / L4);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
            translationY -= currentActionBarHeight;
            L2 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f11 = 1.0f - f10;
        }
        int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.m);
        int i12 = translationY + i11;
        int i13 = L2 + i11;
        y7Var.s0.setBounds(0, i12, getMeasuredWidth(), i10);
        y7Var.s0.draw(canvas);
        RectF rectF = this.a;
        if (z10 || f11 == 1.0f) {
            f12 = 20.0f;
            f13 = 4.0f;
        } else {
            f12 = 20.0f;
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, y7Var.J0));
            f13 = 4.0f;
            rectF.set(y7Var.u0, y7Var.t0 + i12, getMeasuredWidth() - y7Var.u0, org.telegram.messenger.g0.L(24.0f) + y7Var.t0 + i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.j6.t0);
        }
        if (!z10 && f11 != 0.0f) {
            int L5 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, y7Var.J0);
            int alpha = Color.alpha(w02);
            org.telegram.ui.ActionBar.j6.t0.setColor(w02);
            org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (alpha * 1.0f * f11));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.t0);
        }
        if (z10) {
            o7Var.setVisibility(0);
            float max = Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, y7Var.L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + ((i12 - org.telegram.messenger.g0.m) - y7Var.t0)) - o7Var.getTop());
            o7Var.setTranslationY(max);
            y7Var.o1.setTranslationY(max);
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
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.g0.L(((r0.O0() || r0.t2) ? 0 : 52) + org.telegram.messenger.ns.V2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            y7 y7Var = this.e;
            if (y7Var.u2 != 0 && y7Var.n1.getAlpha() == 0.0f) {
                if (y7Var.u1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        y7 y7Var = this.e;
        y7.I0(y7Var);
        y7Var.Z0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        y7 y7Var = this.e;
        f7 f7Var = y7Var.y1;
        f7 f7Var2 = y7Var.c2;
        k7 k7Var = y7Var.s1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.c || size2 != this.d) {
            if (f7Var2.getTag() != null) {
                y7Var.W0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        f7Var.setVisibility((y7Var.q1 || y7Var.d) ? 4 : 0);
        y7Var.p1.setVisibility(f7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) k7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) y7Var.o1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        ((FrameLayout.LayoutParams) f7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.ns.J2 + ((y7Var.O0() || y7Var.t2) ? 0 : 52));
        if (y7Var.r2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * y7Var.r2.size()) + y7Var.t0;
        }
        if (y7Var.r1 || y7Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - org.telegram.messenger.g0.L(((y7Var.O0() || y7Var.t2) ? 0 : 52) + org.telegram.messenger.ns.A5)) {
                L = paddingTop - org.telegram.messenger.g0.L(((y7Var.O0() || y7Var.t2) ? 0 : 52) + org.telegram.messenger.ns.A5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (y7Var.p2) {
            L = 0;
        }
        if (k7Var.getPaddingTop() != L) {
            k7Var.setPadding(0, L, 0, (y7Var.r1 && y7Var.d) ? 0 : k7Var.getPaddingBottom());
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

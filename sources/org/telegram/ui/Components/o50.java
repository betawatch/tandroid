package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o50 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public Boolean c;
    public final /* synthetic */ c60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(c60 c60Var, Context context) {
        super(context);
        this.d = c60Var;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        c60 c60Var = this.d;
        int L = (c60Var.Q1 - c60Var.s0) - org.telegram.messenger.i0.L(8.0f);
        int L2 = org.telegram.messenger.i0.L(36.0f) + getMeasuredHeight();
        int i11 = c60Var.s0;
        int i12 = org.telegram.messenger.i0.m;
        int i13 = L + i12;
        int i14 = (L2 + i11) - i12;
        if (this.b) {
            int i15 = i12 * 2;
            if (i13 + i11 < i15) {
                int min = Math.min(i12, (i15 - i13) - i11);
                i13 -= min;
                i14 += min;
                f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.m);
            } else {
                f7 = 1.0f;
            }
            int i16 = c60Var.s0;
            int i17 = i13 + i16;
            int i18 = org.telegram.messenger.i0.m;
            i10 = i17 < i18 ? Math.min(i18, (i18 - i13) - i16) : 0;
        } else {
            i10 = 0;
            f7 = 1.0f;
        }
        c60Var.r0.setBounds(0, i13, getMeasuredWidth(), org.telegram.messenger.i0.L(10.0f) + i14 + org.telegram.messenger.i0.n);
        c60Var.r0.draw(canvas);
        if (f7 != 1.0f) {
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
            float f10 = c60Var.t0;
            float f11 = c60Var.s0 + i13;
            float measuredWidth = getMeasuredWidth() - c60Var.t0;
            float L3 = org.telegram.messenger.i0.L(24.0f) + c60Var.s0 + i13;
            RectF rectF = this.a;
            rectF.set(f10, f11, measuredWidth, L3);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.t0);
        }
        if (i10 > 0) {
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
            canvas.drawRect(c60Var.t0, org.telegram.messenger.i0.m - i10, getMeasuredWidth() - c60Var.t0, org.telegram.messenger.i0.m, org.telegram.ui.ActionBar.t6.t0);
        }
        boolean z10 = i10 > org.telegram.messenger.i0.m / 2;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, c60Var.I0)) > 0.721f;
            boolean z12 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, c60Var.I0), 855638016)) > 0.721f;
            this.c = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.i0.r3(c60Var.getWindow(), z11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            c60 c60Var = this.d;
            if (c60Var.Q1 != 0 && motionEvent.getY() < c60Var.Q1) {
                c60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c60.I0(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        c60 c60Var = this.d;
        c60Var.R1 = true;
        int i12 = c60Var.t0;
        setPadding(i12, org.telegram.messenger.i0.m, i12, 0);
        c60Var.R1 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.b = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d.R1) {
            return;
        }
        super.requestLayout();
    }
}

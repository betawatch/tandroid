package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j50 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public Boolean c;
    public final /* synthetic */ x50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(x50 x50Var, Context context) {
        super(context);
        this.d = x50Var;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        x50 x50Var = this.d;
        int L = (x50Var.U1 - x50Var.t0) - org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f) + getMeasuredHeight();
        int i10 = x50Var.t0;
        int i11 = org.telegram.messenger.g0.m;
        int i12 = L + i11;
        int i13 = (L2 + i10) - i11;
        if (this.b) {
            int i14 = i11 * 2;
            if (i12 + i10 < i14) {
                int min = Math.min(i11, (i14 - i12) - i10);
                i12 -= min;
                i13 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.m);
            } else {
                f10 = 1.0f;
            }
            int i15 = x50Var.t0;
            int i16 = i12 + i15;
            int i17 = org.telegram.messenger.g0.m;
            i7 = i16 < i17 ? Math.min(i17, (i17 - i12) - i15) : 0;
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        x50Var.s0.setBounds(0, i12, getMeasuredWidth(), org.telegram.messenger.g0.L(10.0f) + i13 + org.telegram.messenger.g0.n);
        x50Var.s0.draw(canvas);
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false));
            float f11 = x50Var.u0;
            float f12 = x50Var.t0 + i12;
            float measuredWidth = getMeasuredWidth() - x50Var.u0;
            float L3 = org.telegram.messenger.g0.L(24.0f) + x50Var.t0 + i12;
            RectF rectF = this.a;
            rectF.set(f11, f12, measuredWidth, L3);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.t0);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false));
            canvas.drawRect(x50Var.u0, org.telegram.messenger.g0.m - i7, getMeasuredWidth() - x50Var.u0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.n6.t0);
        }
        boolean z10 = i7 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, x50Var.J0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, x50Var.J0), 855638016)) > 0.721f;
            this.c = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.r3(x50Var.getWindow(), z11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            x50 x50Var = this.d;
            if (x50Var.U1 != 0 && motionEvent.getY() < x50Var.U1) {
                x50Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        x50.J0(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        x50 x50Var = this.d;
        x50Var.V1 = true;
        int i11 = x50Var.u0;
        setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        x50Var.V1 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.b = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d.V1) {
            return;
        }
        super.requestLayout();
    }
}

package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tc0 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ bd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc0(bd0 bd0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = bd0Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        bd0 bd0Var = this.d;
        Paint paint = bd0Var.r1;
        int i7 = bd0Var.s1 - bd0Var.s0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + bd0Var.s0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = bd0Var.s0;
        float min = ((float) (i7 + i10)) < L2 ? 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2) : 1.0f;
        int i11 = org.telegram.messenger.g0.m;
        int i12 = i7 + i11;
        bd0Var.r0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        bd0Var.r0.draw(canvas);
        if (min != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, bd0Var.I0));
            float f10 = bd0Var.t0;
            float f11 = bd0Var.s0 + i12;
            float measuredWidth = getMeasuredWidth() - bd0Var.t0;
            float L3 = org.telegram.messenger.g0.L(24.0f) + bd0Var.s0 + i12;
            RectF rectF = this.a;
            rectF.set(f10, f11, measuredWidth, L3);
            float f12 = L2 * min;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, bd0Var.I0);
        paint.setColor(Color.argb((int) (bd0Var.l1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(bd0Var.t0, 0.0f, getMeasuredWidth() - bd0Var.t0, org.telegram.messenger.g0.m, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            bd0 bd0Var = this.d;
            if (bd0Var.s1 != 0 && motionEvent.getY() < bd0Var.s1 && bd0Var.l1.getAlpha() == 0.0f) {
                bd0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        bd0 bd0Var = this.d;
        bd0Var.q1 = true;
        super.onLayout(z9, i7, i10, i11, i12);
        bd0Var.q1 = false;
        bd0Var.J0(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        this.b = true;
        bd0 bd0Var = this.d;
        uc0 uc0Var = bd0Var.j1;
        int i11 = bd0Var.t0;
        setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) bd0Var.m1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        n nVar = bd0Var.i1;
        int i12 = ((bd0) nVar.a).v1;
        for (int i13 = 0; i13 < i12; i13++) {
            ViewGroup t6 = nVar.t(this.c, i13);
            t6.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += t6.getMeasuredHeight();
        }
        int i14 = L < paddingTop ? paddingTop - L : paddingTop / 5;
        if (uc0Var.getPaddingTop() != i14) {
            uc0Var.getPaddingTop();
            uc0Var.setPadding(0, i14, 0, 0);
        }
        this.b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}

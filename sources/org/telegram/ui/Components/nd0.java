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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nd0 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ vd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd0(vd0 vd0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = vd0Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        vd0 vd0Var = this.d;
        Paint paint = vd0Var.r1;
        int i10 = vd0Var.s1 - vd0Var.s0;
        int L = org.telegram.messenger.i0.L(30.0f) + getMeasuredHeight() + vd0Var.s0;
        float L2 = org.telegram.messenger.i0.L(12.0f);
        int i11 = vd0Var.s0;
        float min = ((float) (i10 + i11)) < L2 ? 1.0f - Math.min(1.0f, ((L2 - i10) - i11) / L2) : 1.0f;
        int i12 = org.telegram.messenger.i0.m;
        int i13 = i10 + i12;
        vd0Var.r0.setBounds(0, i13, getMeasuredWidth(), L - i12);
        vd0Var.r0.draw(canvas);
        if (min != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, vd0Var.I0));
            float f7 = vd0Var.t0;
            float f10 = vd0Var.s0 + i13;
            float measuredWidth = getMeasuredWidth() - vd0Var.t0;
            float L3 = org.telegram.messenger.i0.L(24.0f) + vd0Var.s0 + i13;
            RectF rectF = this.a;
            rectF.set(f7, f10, measuredWidth, L3);
            float f11 = L2 * min;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, vd0Var.I0);
        paint.setColor(Color.argb((int) (vd0Var.l1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(vd0Var.t0, 0.0f, getMeasuredWidth() - vd0Var.t0, org.telegram.messenger.i0.m, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            vd0 vd0Var = this.d;
            if (vd0Var.s1 != 0 && motionEvent.getY() < vd0Var.s1 && vd0Var.l1.getAlpha() == 0.0f) {
                vd0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vd0 vd0Var = this.d;
        vd0Var.q1 = true;
        super.onLayout(z10, i10, i11, i12, i13);
        vd0Var.q1 = false;
        vd0Var.J0(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        this.b = true;
        vd0 vd0Var = this.d;
        od0 od0Var = vd0Var.j1;
        int i12 = vd0Var.t0;
        setPadding(i12, org.telegram.messenger.i0.m, i12, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) vd0Var.m1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.b = true;
        int L = org.telegram.messenger.i0.L(80.0f);
        m2.t tVar = vd0Var.i1;
        int i13 = ((vd0) tVar.b).v1;
        for (int i14 = 0; i14 < i13; i14++) {
            ViewGroup v = tVar.v(this.c, i14);
            v.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += v.getMeasuredHeight();
        }
        int i15 = L < paddingTop ? paddingTop - L : paddingTop / 5;
        if (od0Var.getPaddingTop() != i15) {
            od0Var.getPaddingTop();
            od0Var.setPadding(0, i15, 0, 0);
        }
        this.b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class k11 extends View {
    public final l11 a;
    public org.telegram.messenger.q20 b;
    public final org.telegram.ui.ActionBar.p6 c;
    public int d;

    public k11(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = p6Var;
        l11 l11Var = new l11(i10, this, p6Var, false);
        this.a = l11Var;
        l11Var.s = new uo0(this, 21);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        if (p6Var != null) {
            p6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.t6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(33.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.d(motionEvent, false) || super.onTouchEvent(motionEvent);
    }

    public void set(org.telegram.messenger.jj jjVar) {
        l11 l11Var = this.a;
        l11Var.e(jjVar);
        if (isAttachedToWindow()) {
            l11Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(org.telegram.messenger.q20 q20Var) {
        this.b = q20Var;
    }
}

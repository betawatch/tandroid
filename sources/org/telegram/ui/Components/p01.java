package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class p01 extends View {
    public final q01 a;
    public org.telegram.messenger.x10 b;
    public final org.telegram.ui.ActionBar.i6 c;
    public int d;

    public p01(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.c = i6Var;
        q01 q01Var = new q01(i7, this, i6Var, false);
        this.a = q01Var;
        q01Var.s = new ap0(this, 19);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        if (i6Var != null) {
            i6Var.e(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.n6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.d(motionEvent, false) || super.onTouchEvent(motionEvent);
    }

    public void set(org.telegram.messenger.fj fjVar) {
        q01 q01Var = this.a;
        q01Var.e(fjVar);
        if (isAttachedToWindow()) {
            q01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.x10 x10Var) {
        this.b = x10Var;
    }
}

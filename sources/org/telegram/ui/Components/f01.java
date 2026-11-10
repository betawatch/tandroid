package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class f01 extends View {
    public final g01 a;
    public org.telegram.messenger.c20 b;
    public final org.telegram.ui.ActionBar.h6 c;
    public int d;

    public f01(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.c = h6Var;
        g01 g01Var = new g01(i7, this, h6Var, false);
        this.a = g01Var;
        g01Var.s = new jr0(this, 16);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        if (h6Var != null) {
            h6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.m6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
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

    public void set(org.telegram.messenger.ij ijVar) {
        g01 g01Var = this.a;
        g01Var.e(ijVar);
        if (isAttachedToWindow()) {
            g01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.c20 c20Var) {
        this.b = c20Var;
    }
}

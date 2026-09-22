package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class a21 extends View {
    public final b21 a;
    public Utilities.Callback b;
    public final org.telegram.ui.ActionBar.e6 c;
    public int d;

    public a21(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        b21 b21Var = new b21(i10, this, e6Var, false);
        this.a = b21Var;
        b21Var.r = new jq0(this, 18);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (e6Var != null) {
            e6Var.m(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.d(motionEvent, false) || super.onTouchEvent(motionEvent);
    }

    public void set(MessageObject messageObject) {
        b21 b21Var = this.a;
        b21Var.f(messageObject);
        if (isAttachedToWindow()) {
            b21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.b = callback;
    }
}

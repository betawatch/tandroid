package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class g11 extends View {
    public final h11 a;
    public Utilities.Callback b;
    public final org.telegram.ui.ActionBar.b6 c;
    public int d;

    public g11(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.c = b6Var;
        h11 h11Var = new h11(i9, this, b6Var, false);
        this.a = h11Var;
        h11Var.r = new tp0(this, 18);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (b6Var != null) {
            b6Var.o(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.f6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.d(motionEvent, false) || super.onTouchEvent(motionEvent);
    }

    public void set(MessageObject messageObject) {
        h11 h11Var = this.a;
        h11Var.f(messageObject);
        if (isAttachedToWindow()) {
            h11Var.a();
        }
    }

    public void setBackgroundHeight(int i9) {
        this.d = i9;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.b = callback;
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u1 extends View implements org.telegram.ui.ActionBar.w5 {
    public final l51 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public int c;
    public int d;
    public k1 e;
    public float f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = b6Var;
        l51 l51Var = new l51();
        this.a = l51Var;
        l51Var.setCallback(this);
        l51Var.n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        l51Var.o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        l51Var.p = LocaleController.getString(R.string.UnsupportedUpdate);
        l51Var.j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        if (b6Var != null) {
            b6Var.o(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.f6.q(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        Paint O = b6Var != null ? b6Var.O("paintChatActionBackground") : null;
        if (O == null) {
            O = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, O);
        if (b6Var != null ? b6Var.t0() : org.telegram.ui.ActionBar.f6.a1()) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.h2);
        }
    }

    public final void b(float f10, int i9) {
        this.f = f10;
        this.h = i9;
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        this.a.b();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        l51 l51Var = this.a;
        l51Var.setBounds(dp, dp2, dp3, dp4);
        l51Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.c = dp;
        int a2 = this.a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.e = k1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
    }
}

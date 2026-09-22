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
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final h61 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public int c;
    public int d;
    public k1 e;
    public float f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = e6Var;
        h61 h61Var = new h61();
        this.a = h61Var;
        h61Var.setCallback(this);
        h61Var.n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        h61Var.o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        h61Var.p = LocaleController.getString(R.string.UnsupportedUpdate);
        h61Var.j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (e6Var != null) {
            e6Var.m(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        Paint G = e6Var != null ? e6Var.G("paintChatActionBackground") : null;
        if (G == null) {
            G = org.telegram.ui.ActionBar.i6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, G);
        if (e6Var != null ? e6Var.p0() : org.telegram.ui.ActionBar.i6.a1()) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f = f7;
        this.h = i10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
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
        h61 h61Var = this.a;
        h61Var.setBounds(dp, dp2, dp3, dp4);
        h61Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}

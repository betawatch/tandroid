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
import org.telegram.ui.Components.d71;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class v1 extends View implements org.telegram.ui.ActionBar.y5 {
    public final d71 a;
    public final org.telegram.ui.ActionBar.d6 b;
    public int c;
    public int d;
    public l1 e;
    public float f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.b = d6Var;
        d71 d71Var = new d71();
        this.a = d71Var;
        d71Var.setCallback(this);
        d71Var.n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        d71Var.o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        d71Var.p = LocaleController.getString(R.string.UnsupportedUpdate);
        d71Var.j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var = this.b;
        if (d6Var != null) {
            d6Var.d(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        Paint n10 = d6Var != null ? d6Var.n("paintChatActionBackground") : null;
        if (n10 == null) {
            n10 = org.telegram.ui.ActionBar.h6.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, n10);
        if (d6Var != null ? d6Var.s() : org.telegram.ui.ActionBar.h6.b1()) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f = f7;
        this.h = i10;
    }

    @Override // org.telegram.ui.ActionBar.y5
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
        d71 d71Var = this.a;
        d71Var.setBounds(dp, dp2, dp3, dp4);
        d71Var.draw(canvas);
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

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}

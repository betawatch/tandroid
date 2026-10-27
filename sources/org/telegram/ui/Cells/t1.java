package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.v71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t1 extends View implements org.telegram.ui.ActionBar.p6 {
    public final v71 a;
    public final org.telegram.ui.ActionBar.u6 b;
    public int c;
    public int d;
    public j1 e;
    public float f;
    public int h;

    public t1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.b = u6Var;
        v71 v71Var = new v71();
        this.a = v71Var;
        v71Var.setCallback(this);
        v71Var.n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        v71Var.o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        v71Var.p = LocaleController.getString(R.string.UnsupportedUpdate);
        v71Var.j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        if (u6Var != null) {
            u6Var.b(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.y6.q(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        Paint d = u6Var != null ? u6Var.d("paintChatActionBackground") : null;
        if (d == null) {
            d = org.telegram.ui.ActionBar.y6.U0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, d);
        if (u6Var != null ? u6Var.f() : org.telegram.ui.ActionBar.y6.c1()) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f = f7;
        this.h = i10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        v71 v71Var = this.a;
        v71Var.setBounds(dp, dp2, dp3, dp4);
        v71Var.draw(canvas);
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

    public void setDelegate(j1 j1Var) {
        this.e = j1Var;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        this.a.b();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}

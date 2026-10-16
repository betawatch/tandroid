package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t41 extends s6 {
    public final Paint s;
    public final aa0 v;
    public final /* synthetic */ v41 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(v41 v41Var, Context context) {
        super(context, false, false, false);
        this.w = v41Var;
        this.s = new Paint(1);
        this.v = new aa0();
    }

    @Override // org.telegram.ui.Components.s6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        x41 x41Var = this.w.n;
        int i10 = org.telegram.ui.ActionBar.g6.Pi;
        String[] strArr = x41.R;
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.1175f, x41Var.getThemedColor(i10));
        Paint paint = this.s;
        paint.setColor(m12);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.c6 c6Var;
        x41 x41Var = this.w.n;
        int action = motionEvent.getAction();
        aa0 aa0Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                aa0Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        c6Var = ((org.telegram.ui.ActionBar.e3) x41Var).resourcesProvider;
        ea0 ea0Var = new ea0(null, c6Var, motionEvent.getX(), motionEvent.getY(), 0);
        ea0Var.d(org.telegram.ui.ActionBar.g6.m1(0.1175f, x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi)));
        x90 b10 = ea0Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        aa0Var.a(ea0Var, null);
        invalidate();
        return true;
    }
}

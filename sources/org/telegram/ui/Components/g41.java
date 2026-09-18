package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class g41 extends p6 {
    public final Paint s;
    public final i90 v;
    public final /* synthetic */ i41 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g41(i41 i41Var, Context context) {
        super(context, false, false, false);
        this.w = i41Var;
        this.s = new Paint(1);
        this.v = new i90();
    }

    @Override // org.telegram.ui.Components.p6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        k41 k41Var = this.w.h;
        int i10 = org.telegram.ui.ActionBar.j6.Pi;
        String[] strArr = k41.R;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1175f, k41Var.getThemedColor(i10));
        Paint paint = this.s;
        paint.setColor(l1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e6 e6Var;
        k41 k41Var = this.w.h;
        int action = motionEvent.getAction();
        i90 i90Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                i90Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        e6Var = ((org.telegram.ui.ActionBar.f3) k41Var).resourcesProvider;
        m90 m90Var = new m90(null, e6Var, motionEvent.getX(), motionEvent.getY(), 0);
        m90Var.d(org.telegram.ui.ActionBar.j6.l1(0.1175f, k41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi)));
        f90 b10 = m90Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        i90Var.a(m90Var, null);
        invalidate();
        return true;
    }
}

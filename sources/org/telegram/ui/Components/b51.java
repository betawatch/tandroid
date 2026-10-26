package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b51 extends s6 {
    public final Paint s;
    public final w90 v;
    public final /* synthetic */ d51 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(d51 d51Var, Context context) {
        super(context, false, false, false);
        this.w = d51Var;
        this.s = new Paint(1);
        this.v = new w90();
    }

    @Override // org.telegram.ui.Components.s6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        f51 f51Var = this.w.n;
        int i10 = org.telegram.ui.ActionBar.y6.Pi;
        String[] strArr = f51.X;
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.1175f, f51Var.getThemedColor(i10));
        Paint paint = this.s;
        paint.setColor(o12);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.u6 u6Var;
        f51 f51Var = this.w.n;
        int action = motionEvent.getAction();
        w90 w90Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                w90Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        u6Var = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
        aa0 aa0Var = new aa0(null, u6Var, motionEvent.getX(), motionEvent.getY(), 0);
        aa0Var.d(org.telegram.ui.ActionBar.y6.o1(0.1175f, f51Var.getThemedColor(org.telegram.ui.ActionBar.y6.Pi)));
        s90 b10 = aa0Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        w90Var.a(aa0Var, null);
        invalidate();
        return true;
    }
}

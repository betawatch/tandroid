package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c51 extends s6 {
    public final Paint s;
    public final x90 v;
    public final /* synthetic */ e51 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(e51 e51Var, Context context) {
        super(context, false, false, false);
        this.w = e51Var;
        this.s = new Paint(1);
        this.v = new x90();
    }

    @Override // org.telegram.ui.Components.s6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        g51 g51Var = this.w.n;
        int i10 = org.telegram.ui.ActionBar.y6.Pi;
        String[] strArr = g51.X;
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.1175f, g51Var.getThemedColor(i10));
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
        g51 g51Var = this.w.n;
        int action = motionEvent.getAction();
        x90 x90Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                x90Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        u6Var = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
        ba0 ba0Var = new ba0(null, u6Var, motionEvent.getX(), motionEvent.getY(), 0);
        ba0Var.d(org.telegram.ui.ActionBar.y6.o1(0.1175f, g51Var.getThemedColor(org.telegram.ui.ActionBar.y6.Pi)));
        t90 b10 = ba0Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        x90Var.a(ba0Var, null);
        invalidate();
        return true;
    }
}

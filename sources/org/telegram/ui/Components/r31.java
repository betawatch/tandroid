package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r31 extends k6 {
    public final Paint s;
    public final c90 v;
    public final /* synthetic */ t31 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r31(t31 t31Var, Context context) {
        super(context, false, false, false);
        this.w = t31Var;
        this.s = new Paint(1);
        this.v = new c90();
    }

    @Override // org.telegram.ui.Components.k6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        v31 v31Var = this.w.h;
        int i10 = org.telegram.ui.ActionBar.j6.Pi;
        String[] strArr = v31.O;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1175f, v31Var.getThemedColor(i10));
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
        org.telegram.ui.ActionBar.f6 f6Var;
        v31 v31Var = this.w.h;
        int action = motionEvent.getAction();
        c90 c90Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                c90Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        f6Var = ((org.telegram.ui.ActionBar.g3) v31Var).resourcesProvider;
        g90 g90Var = new g90(null, f6Var, motionEvent.getX(), motionEvent.getY(), 0);
        g90Var.d(org.telegram.ui.ActionBar.j6.l1(0.1175f, v31Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi)));
        y80 b10 = g90Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        c90Var.a(g90Var, null);
        invalidate();
        return true;
    }
}

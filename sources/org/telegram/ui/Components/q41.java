package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class q41 extends p6 {
    public final Paint s;
    public final n90 v;
    public final /* synthetic */ s41 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(s41 s41Var, Context context) {
        super(context, false, false, false);
        this.w = s41Var;
        this.s = new Paint(1);
        this.v = new n90();
    }

    @Override // org.telegram.ui.Components.p6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        u41 u41Var = this.w.h;
        int i10 = org.telegram.ui.ActionBar.i6.Pi;
        String[] strArr = u41.R;
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.1175f, u41Var.getThemedColor(i10));
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
        org.telegram.ui.ActionBar.d6 d6Var;
        u41 u41Var = this.w.h;
        int action = motionEvent.getAction();
        n90 n90Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                n90Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        d6Var = ((org.telegram.ui.ActionBar.f3) u41Var).resourcesProvider;
        r90 r90Var = new r90(null, d6Var, motionEvent.getX(), motionEvent.getY(), 0);
        r90Var.d(org.telegram.ui.ActionBar.i6.l1(0.1175f, u41Var.getThemedColor(org.telegram.ui.ActionBar.i6.Pi)));
        k90 b10 = r90Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        n90Var.a(r90Var, null);
        invalidate();
        return true;
    }
}

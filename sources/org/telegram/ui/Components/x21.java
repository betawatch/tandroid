package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x21 extends j6 {
    public final Paint s;
    public final m80 v;
    public final /* synthetic */ z21 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(z21 z21Var, Context context) {
        super(context, false, false, false);
        this.w = z21Var;
        this.s = new Paint(1);
        this.v = new m80();
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b31 b31Var = this.w.h;
        int i10 = org.telegram.ui.ActionBar.g6.Pi;
        String[] strArr = b31.N;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.1175f, b31Var.getThemedColor(i10));
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
        org.telegram.ui.ActionBar.c6 c6Var;
        b31 b31Var = this.w.h;
        int action = motionEvent.getAction();
        m80 m80Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                m80Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        c6Var = ((org.telegram.ui.ActionBar.e3) b31Var).resourcesProvider;
        q80 q80Var = new q80(null, c6Var, motionEvent.getX(), motionEvent.getY(), 0);
        q80Var.d(org.telegram.ui.ActionBar.g6.l1(0.1175f, b31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi)));
        j80 b10 = q80Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        m80Var.a(q80Var, null);
        invalidate();
        return true;
    }
}

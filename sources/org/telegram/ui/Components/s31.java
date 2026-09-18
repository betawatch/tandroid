package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s31 extends n6 {
    public final Paint s;
    public final z80 v;
    public final /* synthetic */ u31 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(u31 u31Var, Context context) {
        super(context, false, false, false);
        this.w = u31Var;
        this.s = new Paint(1);
        this.v = new z80();
    }

    @Override // org.telegram.ui.Components.n6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        w31 w31Var = this.w.h;
        int i10 = org.telegram.ui.ActionBar.j6.Pi;
        String[] strArr = w31.R;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1175f, w31Var.getThemedColor(i10));
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
        w31 w31Var = this.w.h;
        int action = motionEvent.getAction();
        z80 z80Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                z80Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        f6Var = ((org.telegram.ui.ActionBar.g3) w31Var).resourcesProvider;
        d90 d90Var = new d90(null, f6Var, motionEvent.getX(), motionEvent.getY(), 0);
        d90Var.d(org.telegram.ui.ActionBar.j6.l1(0.1175f, w31Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi)));
        w80 b10 = d90Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        z80Var.a(d90Var, null);
        invalidate();
        return true;
    }
}

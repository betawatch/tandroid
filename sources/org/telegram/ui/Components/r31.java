package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r31 extends k6 {
    public final Paint s;
    public final b90 v;
    public final /* synthetic */ t31 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r31(t31 t31Var, Context context) {
        super(context, false, false, false);
        this.w = t31Var;
        this.s = new Paint(1);
        this.v = new b90();
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
        b90 b90Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                b90Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        f6Var = ((org.telegram.ui.ActionBar.g3) v31Var).resourcesProvider;
        f90 f90Var = new f90(null, f6Var, motionEvent.getX(), motionEvent.getY(), 0);
        f90Var.d(org.telegram.ui.ActionBar.j6.l1(0.1175f, v31Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi)));
        y80 b10 = f90Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        b90Var.a(f90Var, null);
        invalidate();
        return true;
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.hh1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class z0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ hh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(hh1 hh1Var, Context context) {
        super(context);
        this.c = hh1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[hh1Var.e.length];
        yc0 yc0Var = hh1Var.R;
        yc0Var.setBounds(0, 0, 80, 80);
        yc0 yc0Var2 = hh1Var.S;
        yc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.l lVar = hh1Var.P;
        lVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.l lVar2 = hh1Var.Q;
        lVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        yc0Var.setAlpha(255);
        yc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) lVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) lVar2.b).drawColor(0, mode);
        yc0Var.draw((Canvas) lVar.b);
        yc0Var2.draw((Canvas) lVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        hh1 hh1Var = this.c;
        z0 z0Var = hh1Var.c;
        hh1Var.P.w(-getX(), -getY(), hh1Var.getWidth() - getX(), hh1Var.getHeight() - getY());
        hh1Var.Q.w(-getX(), -getY(), hh1Var.getWidth() - getX(), hh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = hh1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - hh1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[hh1Var.v]);
        float f7 = hh1Var.s;
        if (f7 > 0.0f && (i10 = hh1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[hh1Var.v + 1]);
        }
        float f10 = hh1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (hh1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        hh1 hh1Var = this.c;
        com.google.firebase.messaging.l lVar = hh1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.b;
            if (i14 >= paintArr.length) {
                return;
            }
            if (i14 == 0) {
                paintArr[i14] = (Paint) lVar.a;
            } else if (i14 == 1) {
                paintArr[i14] = (Paint) hh1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) lVar.a;
            }
            i14++;
        }
    }
}

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
import org.telegram.ui.Components.wc0;
import org.telegram.ui.ah1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class z0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ ah1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ah1 ah1Var, Context context) {
        super(context);
        this.c = ah1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[ah1Var.e.length];
        wc0 wc0Var = ah1Var.R;
        wc0Var.setBounds(0, 0, 80, 80);
        wc0 wc0Var2 = ah1Var.S;
        wc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.l lVar = ah1Var.P;
        lVar.E(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.l lVar2 = ah1Var.Q;
        lVar2.E(0.0f, 0.0f, 80.0f, 80.0f);
        wc0Var.setAlpha(255);
        wc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) lVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) lVar2.b).drawColor(0, mode);
        wc0Var.draw((Canvas) lVar.b);
        wc0Var2.draw((Canvas) lVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        ah1 ah1Var = this.c;
        z0 z0Var = ah1Var.c;
        ah1Var.P.E(-getX(), -getY(), ah1Var.getWidth() - getX(), ah1Var.getHeight() - getY());
        ah1Var.Q.E(-getX(), -getY(), ah1Var.getWidth() - getX(), ah1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = ah1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - ah1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[ah1Var.v]);
        float f7 = ah1Var.s;
        if (f7 > 0.0f && (i10 = ah1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[ah1Var.v + 1]);
        }
        float f10 = ah1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (ah1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ah1 ah1Var = this.c;
        com.google.firebase.messaging.l lVar = ah1Var.P;
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
                paintArr[i14] = (Paint) ah1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) lVar.a;
            }
            i14++;
        }
    }
}

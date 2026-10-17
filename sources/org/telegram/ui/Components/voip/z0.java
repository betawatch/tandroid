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
import org.telegram.ui.ch1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class z0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ ch1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ch1 ch1Var, Context context) {
        super(context);
        this.c = ch1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[ch1Var.e.length];
        wc0 wc0Var = ch1Var.R;
        wc0Var.setBounds(0, 0, 80, 80);
        wc0 wc0Var2 = ch1Var.S;
        wc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.l lVar = ch1Var.P;
        lVar.E(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.l lVar2 = ch1Var.Q;
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
        ch1 ch1Var = this.c;
        z0 z0Var = ch1Var.c;
        ch1Var.P.E(-getX(), -getY(), ch1Var.getWidth() - getX(), ch1Var.getHeight() - getY());
        ch1Var.Q.E(-getX(), -getY(), ch1Var.getWidth() - getX(), ch1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = ch1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - ch1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[ch1Var.v]);
        float f7 = ch1Var.s;
        if (f7 > 0.0f && (i10 = ch1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[ch1Var.v + 1]);
        }
        float f10 = ch1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (ch1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ch1 ch1Var = this.c;
        com.google.firebase.messaging.l lVar = ch1Var.P;
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
                paintArr[i14] = (Paint) ch1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) lVar.a;
            }
            i14++;
        }
    }
}

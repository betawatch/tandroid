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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.pi1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b1 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ pi1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(pi1 pi1Var, Context context) {
        super(context);
        this.c = pi1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[pi1Var.e.length];
        cd0 cd0Var = pi1Var.R;
        cd0Var.setBounds(0, 0, 80, 80);
        cd0 cd0Var2 = pi1Var.S;
        cd0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = pi1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = pi1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        cd0Var.setAlpha(255);
        cd0Var2.setAlpha(255);
        Canvas canvas = (Canvas) nVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) nVar2.b).drawColor(0, mode);
        cd0Var.draw((Canvas) nVar.b);
        cd0Var2.draw((Canvas) nVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        pi1 pi1Var = this.c;
        b1 b1Var = pi1Var.c;
        pi1Var.P.z(-getX(), -getY(), pi1Var.getWidth() - getX(), pi1Var.getHeight() - getY());
        pi1Var.Q.z(-getX(), -getY(), pi1Var.getWidth() - getX(), pi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = pi1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - pi1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[pi1Var.v]);
        float f7 = pi1Var.s;
        if (f7 > 0.0f && (i10 = pi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[pi1Var.v + 1]);
        }
        float f10 = pi1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (pi1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        pi1 pi1Var = this.c;
        com.google.firebase.messaging.n nVar = pi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.b;
            if (i14 >= paintArr.length) {
                return;
            }
            if (i14 == 0) {
                paintArr[i14] = (Paint) nVar.a;
            } else if (i14 == 1) {
                paintArr[i14] = (Paint) pi1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) nVar.a;
            }
            i14++;
        }
    }
}

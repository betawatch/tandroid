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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.ni1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b1 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ ni1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(ni1 ni1Var, Context context) {
        super(context);
        this.c = ni1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[ni1Var.e.length];
        cc0 cc0Var = ni1Var.R;
        cc0Var.setBounds(0, 0, 80, 80);
        cc0 cc0Var2 = ni1Var.S;
        cc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = ni1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = ni1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        cc0Var.setAlpha(255);
        cc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) nVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) nVar2.b).drawColor(0, mode);
        cc0Var.draw((Canvas) nVar.b);
        cc0Var2.draw((Canvas) nVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        ni1 ni1Var = this.c;
        b1 b1Var = ni1Var.c;
        ni1Var.P.z(-getX(), -getY(), ni1Var.getWidth() - getX(), ni1Var.getHeight() - getY());
        ni1Var.Q.z(-getX(), -getY(), ni1Var.getWidth() - getX(), ni1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = ni1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - ni1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[ni1Var.v]);
        float f7 = ni1Var.s;
        if (f7 > 0.0f && (i10 = ni1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[ni1Var.v + 1]);
        }
        float f10 = ni1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (ni1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ni1 ni1Var = this.c;
        com.google.firebase.messaging.n nVar = ni1Var.P;
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
                paintArr[i14] = (Paint) ni1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) nVar.a;
            }
            i14++;
        }
    }
}

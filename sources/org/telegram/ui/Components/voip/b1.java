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
import org.telegram.ui.Components.pc0;
import org.telegram.ui.di1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class b1 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ di1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(di1 di1Var, Context context) {
        super(context);
        this.c = di1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[di1Var.e.length];
        pc0 pc0Var = di1Var.R;
        pc0Var.setBounds(0, 0, 80, 80);
        pc0 pc0Var2 = di1Var.S;
        pc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = di1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = di1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        pc0Var.setAlpha(255);
        pc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) nVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) nVar2.b).drawColor(0, mode);
        pc0Var.draw((Canvas) nVar.b);
        pc0Var2.draw((Canvas) nVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        di1 di1Var = this.c;
        b1 b1Var = di1Var.c;
        di1Var.P.z(-getX(), -getY(), di1Var.getWidth() - getX(), di1Var.getHeight() - getY());
        di1Var.Q.z(-getX(), -getY(), di1Var.getWidth() - getX(), di1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = di1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - di1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[di1Var.v]);
        float f7 = di1Var.s;
        if (f7 > 0.0f && (i10 = di1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[di1Var.v + 1]);
        }
        float f10 = di1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (di1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        di1 di1Var = this.c;
        com.google.firebase.messaging.n nVar = di1Var.P;
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
                paintArr[i14] = (Paint) di1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) nVar.a;
            }
            i14++;
        }
    }
}

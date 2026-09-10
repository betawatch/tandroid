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
import org.telegram.ui.Components.lc0;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a1 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ si1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(si1 si1Var, Context context) {
        super(context);
        this.c = si1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[si1Var.e.length];
        lc0 lc0Var = si1Var.R;
        lc0Var.setBounds(0, 0, 80, 80);
        lc0 lc0Var2 = si1Var.S;
        lc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = si1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = si1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        lc0Var.setAlpha(255);
        lc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) nVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) nVar2.b).drawColor(0, mode);
        lc0Var.draw((Canvas) nVar.b);
        lc0Var2.draw((Canvas) nVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        si1 si1Var = this.c;
        a1 a1Var = si1Var.c;
        si1Var.P.z(-getX(), -getY(), si1Var.getWidth() - getX(), si1Var.getHeight() - getY());
        si1Var.Q.z(-getX(), -getY(), si1Var.getWidth() - getX(), si1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = si1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - si1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[si1Var.v]);
        float f7 = si1Var.s;
        if (f7 > 0.0f && (i10 = si1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[si1Var.v + 1]);
        }
        float f10 = si1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (si1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((a1Var.getPaint().ascent() + a1Var.getPaint().descent()) / 2.0f)), a1Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        si1 si1Var = this.c;
        com.google.firebase.messaging.n nVar = si1Var.P;
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
                paintArr[i14] = (Paint) si1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) nVar.a;
            }
            i14++;
        }
    }
}

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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.ni1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class z0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ ni1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ni1 ni1Var, Context context) {
        super(context);
        this.c = ni1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[ni1Var.e.length];
        dc0 dc0Var = ni1Var.R;
        dc0Var.setBounds(0, 0, 80, 80);
        dc0 dc0Var2 = ni1Var.S;
        dc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = ni1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = ni1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        dc0Var.setAlpha(255);
        dc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) nVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) nVar2.b).drawColor(0, mode);
        dc0Var.draw((Canvas) nVar.b);
        dc0Var2.draw((Canvas) nVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        ni1 ni1Var = this.c;
        z0 z0Var = ni1Var.c;
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
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
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

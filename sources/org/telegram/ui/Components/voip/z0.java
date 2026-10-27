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
import org.telegram.ui.Components.vc0;
import org.telegram.ui.kh1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ kh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(kh1 kh1Var, Context context) {
        super(context);
        this.c = kh1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[kh1Var.e.length];
        vc0 vc0Var = kh1Var.R;
        vc0Var.setBounds(0, 0, 80, 80);
        vc0 vc0Var2 = kh1Var.S;
        vc0Var2.setBounds(0, 0, 80, 80);
        aa.m0 m0Var = kh1Var.P;
        m0Var.w(0.0f, 0.0f, 80.0f, 80.0f);
        aa.m0 m0Var2 = kh1Var.Q;
        m0Var2.w(0.0f, 0.0f, 80.0f, 80.0f);
        vc0Var.setAlpha(255);
        vc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) m0Var.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) m0Var2.b).drawColor(0, mode);
        vc0Var.draw((Canvas) m0Var.b);
        vc0Var2.draw((Canvas) m0Var2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        kh1 kh1Var = this.c;
        z0 z0Var = kh1Var.c;
        kh1Var.P.w(-getX(), -getY(), kh1Var.getWidth() - getX(), kh1Var.getHeight() - getY());
        kh1Var.Q.w(-getX(), -getY(), kh1Var.getWidth() - getX(), kh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = kh1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - kh1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[kh1Var.v]);
        float f7 = kh1Var.s;
        if (f7 > 0.0f && (i10 = kh1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[kh1Var.v + 1]);
        }
        float f10 = kh1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (kh1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        kh1 kh1Var = this.c;
        aa.m0 m0Var = kh1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.b;
            if (i14 >= paintArr.length) {
                return;
            }
            if (i14 == 0) {
                paintArr[i14] = (Paint) m0Var.a;
            } else if (i14 == 1) {
                paintArr[i14] = (Paint) kh1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) m0Var.a;
            }
            i14++;
        }
    }
}

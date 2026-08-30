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
import org.telegram.ui.th1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ th1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(th1 th1Var, Context context) {
        super(context);
        this.c = th1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[th1Var.e.length];
        dc0 dc0Var = th1Var.O;
        dc0Var.setBounds(0, 0, 80, 80);
        dc0 dc0Var2 = th1Var.P;
        dc0Var2.setBounds(0, 0, 80, 80);
        a9.a aVar = th1Var.M;
        aVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        a9.a aVar2 = th1Var.N;
        aVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        dc0Var.setAlpha(255);
        dc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) aVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) aVar2.b).drawColor(0, mode);
        dc0Var.draw((Canvas) aVar.b);
        dc0Var2.draw((Canvas) aVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        th1 th1Var = this.c;
        y0 y0Var = th1Var.c;
        th1Var.M.w(-getX(), -getY(), th1Var.getWidth() - getX(), th1Var.getHeight() - getY());
        th1Var.N.w(-getX(), -getY(), th1Var.getWidth() - getX(), th1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = th1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - th1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[th1Var.v]);
        float f10 = th1Var.s;
        if (f10 > 0.0f && (i10 = th1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[th1Var.v + 1]);
        }
        float f11 = th1Var.y;
        if (f11 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f11) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (th1Var.L) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((y0Var.getPaint().ascent() + y0Var.getPaint().descent()) / 2.0f)), y0Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        th1 th1Var = this.c;
        a9.a aVar = th1Var.M;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.b;
            if (i14 >= paintArr.length) {
                return;
            }
            if (i14 == 0) {
                paintArr[i14] = (Paint) aVar.a;
            } else if (i14 == 1) {
                paintArr[i14] = (Paint) th1Var.N.a;
            } else {
                paintArr[i14] = (Paint) aVar.a;
            }
            i14++;
        }
    }
}

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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.bi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class y0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ bi1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(bi1 bi1Var, Context context) {
        super(context);
        this.c = bi1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[bi1Var.e.length];
        ec0 ec0Var = bi1Var.O;
        ec0Var.setBounds(0, 0, 80, 80);
        ec0 ec0Var2 = bi1Var.P;
        ec0Var2.setBounds(0, 0, 80, 80);
        a9.a aVar = bi1Var.M;
        aVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        a9.a aVar2 = bi1Var.N;
        aVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        ec0Var.setAlpha(255);
        ec0Var2.setAlpha(255);
        Canvas canvas = (Canvas) aVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) aVar2.b).drawColor(0, mode);
        ec0Var.draw((Canvas) aVar.b);
        ec0Var2.draw((Canvas) aVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        bi1 bi1Var = this.c;
        y0 y0Var = bi1Var.c;
        bi1Var.M.w(-getX(), -getY(), bi1Var.getWidth() - getX(), bi1Var.getHeight() - getY());
        bi1Var.N.w(-getX(), -getY(), bi1Var.getWidth() - getX(), bi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = bi1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - bi1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[bi1Var.v]);
        float f10 = bi1Var.s;
        if (f10 > 0.0f && (i10 = bi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[bi1Var.v + 1]);
        }
        float f11 = bi1Var.y;
        if (f11 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f11) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (bi1Var.L) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((y0Var.getPaint().ascent() + y0Var.getPaint().descent()) / 2.0f)), y0Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        bi1 bi1Var = this.c;
        a9.a aVar = bi1Var.M;
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
                paintArr[i14] = (Paint) bi1Var.N.a;
            } else {
                paintArr[i14] = (Paint) aVar.a;
            }
            i14++;
        }
    }
}

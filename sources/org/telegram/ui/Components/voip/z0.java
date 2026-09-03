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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.bi1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ bi1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(bi1 bi1Var, Context context) {
        super(context);
        this.c = bi1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[bi1Var.e.length];
        fc0 fc0Var = bi1Var.O;
        fc0Var.setBounds(0, 0, 80, 80);
        fc0 fc0Var2 = bi1Var.P;
        fc0Var2.setBounds(0, 0, 80, 80);
        a9.a aVar = bi1Var.M;
        aVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        a9.a aVar2 = bi1Var.N;
        aVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        fc0Var.setAlpha(255);
        fc0Var2.setAlpha(255);
        Canvas canvas = (Canvas) aVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) aVar2.b).drawColor(0, mode);
        fc0Var.draw((Canvas) aVar.b);
        fc0Var2.draw((Canvas) aVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        bi1 bi1Var = this.c;
        z0 z0Var = bi1Var.c;
        bi1Var.M.x(-getX(), -getY(), bi1Var.getWidth() - getX(), bi1Var.getHeight() - getY());
        bi1Var.N.x(-getX(), -getY(), bi1Var.getWidth() - getX(), bi1Var.getHeight() - getY());
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
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
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

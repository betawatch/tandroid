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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.fh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ fh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(fh1 fh1Var, Context context) {
        super(context);
        this.c = fh1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[fh1Var.e.length];
        jb0 jb0Var = fh1Var.N;
        jb0Var.setBounds(0, 0, 80, 80);
        jb0 jb0Var2 = fh1Var.O;
        jb0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.m mVar = fh1Var.L;
        mVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.m mVar2 = fh1Var.M;
        mVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        jb0Var.setAlpha(255);
        jb0Var2.setAlpha(255);
        Canvas canvas = (Canvas) mVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) mVar2.b).drawColor(0, mode);
        jb0Var.draw((Canvas) mVar.b);
        jb0Var2.draw((Canvas) mVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        fh1 fh1Var = this.c;
        y0 y0Var = fh1Var.c;
        fh1Var.L.w(-getX(), -getY(), fh1Var.getWidth() - getX(), fh1Var.getHeight() - getY());
        fh1Var.M.w(-getX(), -getY(), fh1Var.getWidth() - getX(), fh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i10 = fh1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i10].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - fh1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[fh1Var.v]);
        float f10 = fh1Var.s;
        if (f10 > 0.0f && (i9 = fh1Var.v + 1) < paintArr.length) {
            paintArr[i9].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[fh1Var.v + 1]);
        }
        float f11 = fh1Var.y;
        if (f11 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f11) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (fh1Var.K) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((y0Var.getPaint().ascent() + y0Var.getPaint().descent()) / 2.0f)), y0Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        fh1 fh1Var = this.c;
        com.google.firebase.messaging.m mVar = fh1Var.L;
        super.onSizeChanged(i9, i10, i11, i12);
        int i13 = 0;
        while (true) {
            Paint[] paintArr = this.b;
            if (i13 >= paintArr.length) {
                return;
            }
            if (i13 == 0) {
                paintArr[i13] = (Paint) mVar.a;
            } else if (i13 == 1) {
                paintArr[i13] = (Paint) fh1Var.M.a;
            } else {
                paintArr[i13] = (Paint) mVar.a;
            }
            i13++;
        }
    }
}

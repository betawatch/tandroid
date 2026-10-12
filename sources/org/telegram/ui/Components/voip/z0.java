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
import org.telegram.ui.wi1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class z0 extends TextView {
    public final Paint a;
    public final Paint[] b;
    public final /* synthetic */ wi1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(wi1 wi1Var, Context context) {
        super(context);
        this.c = wi1Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Paint[wi1Var.e.length];
        cd0 cd0Var = wi1Var.R;
        cd0Var.setBounds(0, 0, 80, 80);
        cd0 cd0Var2 = wi1Var.S;
        cd0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.m mVar = wi1Var.P;
        mVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.m mVar2 = wi1Var.Q;
        mVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        cd0Var.setAlpha(255);
        cd0Var2.setAlpha(255);
        Canvas canvas = (Canvas) mVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) mVar2.b).drawColor(0, mode);
        cd0Var.draw((Canvas) mVar.b);
        cd0Var2.draw((Canvas) mVar2.b);
        paint.setColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        wi1 wi1Var = this.c;
        z0 z0Var = wi1Var.c;
        wi1Var.P.z(-getX(), -getY(), wi1Var.getWidth() - getX(), wi1Var.getHeight() - getY());
        wi1Var.Q.z(-getX(), -getY(), wi1Var.getWidth() - getX(), wi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = wi1Var.v;
        Paint[] paintArr = this.b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - wi1Var.y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[wi1Var.v]);
        float f7 = wi1Var.s;
        if (f7 > 0.0f && (i10 = wi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[wi1Var.v + 1]);
        }
        float f10 = wi1Var.y;
        if (f10 < 1.0f) {
            Paint paint = this.a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (wi1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        wi1 wi1Var = this.c;
        com.google.firebase.messaging.m mVar = wi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.b;
            if (i14 >= paintArr.length) {
                return;
            }
            if (i14 == 0) {
                paintArr[i14] = (Paint) mVar.a;
            } else if (i14 == 1) {
                paintArr[i14] = (Paint) wi1Var.Q.a;
            } else {
                paintArr[i14] = (Paint) mVar.a;
            }
            i14++;
        }
    }
}

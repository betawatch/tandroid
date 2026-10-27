package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.r11;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class nd extends View {
    public final LinearGradient a;
    public final Matrix b;
    public final Paint c;
    public final Paint d;
    public final r11 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f = u6Var;
        this.a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = new Matrix();
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new r11(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.c;
        paint.setShader(linearGradient);
        r11 r11Var = this.e;
        float dp = r11Var.c + AndroidUtilities.dp(30.0f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d7, this.f);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.e.c((getWidth() - r11Var.c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}

package gh;

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
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class wa extends View {
    public final LinearGradient a;
    public final Matrix b;
    public final Paint c;
    public final Paint d;
    public final nz0 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f = b6Var;
        this.a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = new Matrix();
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new nz0(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
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
        nz0 nz0Var = this.e;
        float dp = nz0Var.c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.e.c((getWidth() - nz0Var.c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}

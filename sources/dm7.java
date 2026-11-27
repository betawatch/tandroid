// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dm7 extends View implements du5 {
    public final Paint a;
    public int b;
    public int c;
    public final /* synthetic */ lm7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm7(lm7 lm7Var, Context context) {
        super(context);
        this.d = lm7Var;
        this.a = new Paint();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(aob.d6);
        Paint paint = this.a;
        if (paint.getShader() == null || this.b != themedColor || this.c != getHeight()) {
            this.b = themedColor;
            this.c = getHeight();
            int alpha = Color.alpha(themedColor);
            paint.setShader(new LinearGradient(0.0f, c00.d(60.0f, getHeight(), 0), 0.0f, getHeight(), new int[]{vm2.o(themedColor, (alpha * jn7.H3) / jn7.H4), vm2.o(themedColor, (alpha * jn7.F2) / jn7.H4), vm2.o(themedColor, (alpha * 96) / jn7.H4), vm2.o(themedColor, 0)}, (float[]) null, Shader.TileMode.CLAMP));
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}

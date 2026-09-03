package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n9 extends LinearLayout {
    public final Path a;
    public final /* synthetic */ Matrix b;
    public final /* synthetic */ RadialGradient c;
    public final /* synthetic */ Paint d;
    public final /* synthetic */ org.telegram.ui.Components.j5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.j5 j5Var) {
        super(context);
        this.b = matrix;
        this.c = radialGradient;
        this.d = paint;
        this.e = j5Var;
        this.a = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(10.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, AndroidUtilities.dp(2.0f) + 1, getWidth(), getHeight() + dp);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        this.c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        w0.a(canvas, 0, this.e, getWidth(), AndroidUtilities.dp(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.b();
    }
}

// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e95 extends TextView {
    public final Paint[] a;
    public final /* synthetic */ f65 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e95(f65 f65Var, Context context) {
        super(context);
        this.b = f65Var;
        this.a = new Paint[f65Var.o1.length];
        int i = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i >= paintArr.length) {
                return;
            }
            paintArr[i] = new Paint(1);
            i++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        f65 f65Var = this.b;
        int i2 = f65Var.q1;
        Paint[] paintArr = this.a;
        paintArr[i2].setAlpha(kk7.d4);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paintArr[f65Var.q1]);
        float f = f65Var.p1;
        if (f > 0.0f && (i = f65Var.q1 + 1) < paintArr.length) {
            paintArr[i].setAlpha((int) (f * 255.0f));
            canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paintArr[f65Var.q1 + 1]);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onSizeChanged(i, i2, i3, i4);
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i7 >= paintArr.length) {
                return;
            }
            int i8 = -9015575;
            if (i7 == 0) {
                i5 = -9015575;
                i8 = -11033346;
            } else if (i7 == 1) {
                i8 = -8919716;
                i5 = -11089922;
            } else {
                i5 = -1026983;
                i6 = -1792170;
                paintArr[i7].setShader(i6 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i8, i5, i6}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i8, i5}, (float[]) null, Shader.TileMode.CLAMP));
                i7++;
            }
            i6 = 0;
            paintArr[i7].setShader(i6 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i8, i5, i6}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i8, i5}, (float[]) null, Shader.TileMode.CLAMP));
            i7++;
        }
    }
}

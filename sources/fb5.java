// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fb5 extends TextView {
    public final Paint[] a;
    public final /* synthetic */ h85 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb5(h85 h85Var, Context context) {
        super(context);
        this.b = h85Var;
        this.a = new Paint[h85Var.o1.length];
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
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        h85 h85Var = this.b;
        int i2 = h85Var.q1;
        Paint[] paintArr = this.a;
        paintArr[i2].setAlpha(jn7.d4);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paintArr[h85Var.q1]);
        float f = h85Var.p1;
        if (f > 0.0f && (i = h85Var.q1 + 1) < paintArr.length) {
            paintArr[i].setAlpha((int) (f * 255.0f));
            canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paintArr[h85Var.q1 + 1]);
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

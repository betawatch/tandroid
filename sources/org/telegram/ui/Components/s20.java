package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s20 extends TextView {
    public final Paint[] a;
    public final /* synthetic */ v20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(v20 v20Var, Context context) {
        super(context);
        this.b = v20Var;
        this.a = new Paint[v20Var.e.length];
        int i9 = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i9 >= paintArr.length) {
                return;
            }
            paintArr[i9] = new Paint(1);
            i9++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        v20 v20Var = this.b;
        int i9 = v20Var.h;
        Paint[] paintArr = this.a;
        paintArr[i9].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v20Var.h]);
        float f10 = v20Var.f;
        if (f10 > 0.0f) {
            int i10 = v20Var.h;
            if (i10 + 1 < paintArr.length) {
                paintArr[i10 + 1].setAlpha((int) (f10 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v20Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        super.onSizeChanged(i9, i10, i11, i12);
        int i15 = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i15 >= paintArr.length) {
                return;
            }
            int i16 = -9015575;
            if (i15 == 0) {
                i16 = -11033346;
                i13 = -9015575;
            } else if (i15 == 1) {
                i16 = -8919716;
                i13 = -11089922;
            } else {
                i13 = -1026983;
                i14 = -1792170;
                paintArr[i15].setShader(i14 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i16, i13, i14}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i16, i13}, (float[]) null, Shader.TileMode.CLAMP));
                i15++;
            }
            i14 = 0;
            paintArr[i15].setShader(i14 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i16, i13, i14}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i16, i13}, (float[]) null, Shader.TileMode.CLAMP));
            i15++;
        }
    }
}

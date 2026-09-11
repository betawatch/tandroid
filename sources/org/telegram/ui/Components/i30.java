package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class i30 extends TextView {
    public final Paint[] a;
    public final /* synthetic */ l30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(l30 l30Var, Context context) {
        super(context);
        this.b = l30Var;
        this.a = new Paint[l30Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        l30 l30Var = this.b;
        int i10 = l30Var.h;
        Paint[] paintArr = this.a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[l30Var.h]);
        float f7 = l30Var.f;
        if (f7 > 0.0f) {
            int i11 = l30Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f7 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[l30Var.h + 1]);
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onSizeChanged(i10, i11, i12, i13);
        int i16 = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i16 >= paintArr.length) {
                return;
            }
            int i17 = -9015575;
            if (i16 == 0) {
                i17 = -11033346;
                i14 = -9015575;
            } else if (i16 == 1) {
                i17 = -8919716;
                i14 = -11089922;
            } else {
                i14 = -1026983;
                i15 = -1792170;
                paintArr[i16].setShader(i15 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i17, i14, i15}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i17, i14}, (float[]) null, Shader.TileMode.CLAMP));
                i16++;
            }
            i15 = 0;
            paintArr[i16].setShader(i15 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i17, i14, i15}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i17, i14}, (float[]) null, Shader.TileMode.CLAMP));
            i16++;
        }
    }
}

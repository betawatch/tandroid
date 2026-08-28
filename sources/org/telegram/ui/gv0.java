package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gv0 extends org.telegram.ui.Cells.t1 {
    public final Path Be;
    public final Paint Ce;
    public final /* synthetic */ byte[] De;
    public final /* synthetic */ int Ee;
    public final /* synthetic */ int Fe;
    public final /* synthetic */ iv0 Ge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(iv0 iv0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, byte[] bArr, int i10, int i11) {
        super(context, i9, false, null, b6Var);
        this.Ge = iv0Var;
        this.De = bArr;
        this.Ee = i10;
        this.Fe = i11;
        this.Be = new Path();
        this.Ce = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.t1
    public final void Y1(Canvas canvas) {
        this.e6 = 0;
        this.f6 = this.U5.size() - 1;
        this.g6 = (-AndroidUtilities.dp(7.0f)) * this.Ge.y;
        super.Y1(canvas);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int I2 = I2(this.De);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f10 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        iv0 iv0Var = this.Ge;
        rectF.top = AndroidUtilities.lerp(dp, iv0Var.R ? -AndroidUtilities.dp(3.0f) : 0.0f, iv0Var.y) + f10;
        float f11 = rectF.bottom;
        boolean z10 = iv0Var.R;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, iv0Var.y);
        }
        rectF.bottom = f11 + dp2;
        Path path = this.Be;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ce;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.f6.l1(iv0Var.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(this.Ee, this.Fe);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
    }
}

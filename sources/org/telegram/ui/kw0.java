package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class kw0 extends org.telegram.ui.Cells.u1 {
    public final Path Ge;
    public final Paint He;
    public final /* synthetic */ byte[] Ie;
    public final /* synthetic */ int Je;
    public final /* synthetic */ int Ke;
    public final /* synthetic */ mw0 Le;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(mw0 mw0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, e6Var);
        this.Le = mw0Var;
        this.Ie = bArr;
        this.Je = i11;
        this.Ke = i12;
        this.Ge = new Path();
        this.He = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.u1
    public final void Y1(Canvas canvas) {
        this.i6 = 0;
        this.j6 = this.Y5.size() - 1;
        this.k6 = (-AndroidUtilities.dp(7.0f)) * this.Le.y;
        super.Y1(canvas);
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int I2 = I2(this.Ie);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f7 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        mw0 mw0Var = this.Le;
        rectF.top = AndroidUtilities.lerp(dp, mw0Var.V ? -AndroidUtilities.dp(3.0f) : 0.0f, mw0Var.y) + f7;
        float f10 = rectF.bottom;
        boolean z10 = mw0Var.V;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, mw0Var.y);
        }
        rectF.bottom = f10 + dp2;
        Path path = this.Ge;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.He;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(mw0Var.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Je, this.Ke);
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void setPressed(boolean z10) {
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hv0 extends org.telegram.ui.Cells.s1 {
    public final Path Be;
    public final Paint Ce;
    public final /* synthetic */ byte[] De;
    public final /* synthetic */ int Ee;
    public final /* synthetic */ int Fe;
    public final /* synthetic */ jv0 Ge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(jv0 jv0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, c6Var);
        this.Ge = jv0Var;
        this.De = bArr;
        this.Ee = i11;
        this.Fe = i12;
        this.Be = new Path();
        this.Ce = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.s1
    public final void X1(Canvas canvas) {
        this.e6 = 0;
        this.f6 = this.U5.size() - 1;
        this.g6 = (-AndroidUtilities.dp(7.0f)) * this.Ge.y;
        super.X1(canvas);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int H2 = H2(this.De);
        float G2 = G2(H2);
        float F2 = F2(H2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), G2, getPollButtonsRight(), F2);
        float f10 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        jv0 jv0Var = this.Ge;
        rectF.top = AndroidUtilities.lerp(dp, jv0Var.R ? -AndroidUtilities.dp(3.0f) : 0.0f, jv0Var.y) + f10;
        float f11 = rectF.bottom;
        boolean z10 = jv0Var.R;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, jv0Var.y);
        }
        rectF.bottom = f11 + dp2;
        Path path = this.Be;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ce;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(jv0Var.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        R1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Ee, this.Fe);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void setPressed(boolean z10) {
    }
}

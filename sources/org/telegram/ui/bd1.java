package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bd1 extends org.telegram.ui.Cells.s1 {
    public final Path Be;
    public final Paint Ce;
    public final /* synthetic */ int De;
    public final /* synthetic */ int Ee;
    public final /* synthetic */ int Fe;
    public final /* synthetic */ dd1 Ge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd1(dd1 dd1Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, c6Var);
        this.Ge = dd1Var;
        this.De = i11;
        this.Ee = i12;
        this.Fe = i13;
        this.Be = new Path();
        this.Ce = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.s1
    public final void X1(Canvas canvas) {
        this.e6 = 0;
        this.f6 = this.U5.size() - 1;
        super.X1(canvas);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int N2 = N2(this.De);
        float G2 = G2(N2);
        float F2 = F2(N2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), G2, getPollButtonsRight(), F2);
        Path path = this.Be;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ce;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(this.Ge.x * 0.2f, -16777216));
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

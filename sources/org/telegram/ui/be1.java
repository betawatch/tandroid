package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class be1 extends org.telegram.ui.Cells.u1 {
    public final Path Ge;
    public final Paint He;
    public final /* synthetic */ int Ie;
    public final /* synthetic */ int Je;
    public final /* synthetic */ int Ke;
    public final /* synthetic */ de1 Le;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(de1 de1Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, d6Var);
        this.Le = de1Var;
        this.Ie = i11;
        this.Je = i12;
        this.Ke = i13;
        this.Ge = new Path();
        this.He = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.u1
    public final void Y1(Canvas canvas) {
        this.i6 = 0;
        this.j6 = this.Y5.size() - 1;
        super.Y1(canvas);
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int O2 = O2(this.Ie);
        float H2 = H2(O2);
        float G2 = G2(O2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        Path path = this.Ge;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.He;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.h6.l1(this.Le.x * 0.2f, -16777216));
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

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class cd1 extends org.telegram.ui.Cells.t1 {
    public final Path Ge;
    public final Paint He;
    public final /* synthetic */ int Ie;
    public final /* synthetic */ int Je;
    public final /* synthetic */ int Ke;
    public final /* synthetic */ ed1 Le;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd1(ed1 ed1Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, g6Var);
        this.Le = ed1Var;
        this.Ie = i11;
        this.Je = i12;
        this.Ke = i13;
        this.Ge = new Path();
        this.He = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.t1
    public final void X1(Canvas canvas) {
        this.i6 = 0;
        this.j6 = this.Y5.size() - 1;
        super.X1(canvas);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int N2 = N2(this.Ie);
        float G2 = G2(N2);
        float F2 = F2(N2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), G2, getPollButtonsRight(), F2);
        Path path = this.Ge;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.He;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.o1(this.Le.x * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        R1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Je, this.Ke);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
    }
}

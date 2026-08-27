package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g0 extends hh.e5 {
    public final Path w0;
    public final float[] x0;
    public final /* synthetic */ i0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, y yVar, ag.l2 l2Var, ag.l2 l2Var2, ag.l2 l2Var3, ag.l2 l2Var4, ag.l2 l2Var5, ag.l2 l2Var6) {
        super(context, c6Var, yVar, l2Var, null, l2Var2, l2Var3, l2Var4, l2Var5, l2Var6);
        this.y0 = i0Var;
        this.w0 = new Path();
        this.x0 = new float[8];
    }

    @Override // hh.e5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.w0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // hh.e5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // hh.e5
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // hh.e5
    public final void j(int i10) {
        i0 i0Var = this.y0;
        TextView textView = i0Var.X;
        if (textView == null || !org.telegram.ui.ActionBar.g6.B1(textView.getBackground(), i10, false)) {
            return;
        }
        i0Var.X.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.x0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.x0, Path.Direction.CW);
    }
}

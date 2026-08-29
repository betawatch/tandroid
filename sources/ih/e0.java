package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e0 extends jh.d5 {
    public final Path w0;
    public final float[] x0;
    public final /* synthetic */ g0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, w wVar, bg.n nVar, bg.n nVar2, bg.n nVar3, bg.n nVar4, bg.n nVar5, bg.n nVar6) {
        super(context, c6Var, wVar, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.y0 = g0Var;
        this.w0 = new Path();
        this.x0 = new float[8];
    }

    @Override // jh.d5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.w0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // jh.d5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // jh.d5
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // jh.d5
    public final void j(int i10) {
        g0 g0Var = this.y0;
        TextView textView = g0Var.X;
        if (textView == null || !g6.B1(textView.getBackground(), i10, false)) {
            return;
        }
        g0Var.X.invalidate();
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

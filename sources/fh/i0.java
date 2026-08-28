package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 extends gh.g5 {
    public final Path w0;
    public final float[] x0;
    public final /* synthetic */ k0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, a0 a0Var, n nVar, n nVar2, n nVar3, n nVar4, n nVar5, n nVar6) {
        super(context, b6Var, a0Var, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.y0 = k0Var;
        this.w0 = new Path();
        this.x0 = new float[8];
    }

    @Override // gh.g5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.w0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // gh.g5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // gh.g5
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // gh.g5
    public final void j(int i9) {
        k0 k0Var = this.y0;
        TextView textView = k0Var.X;
        if (textView == null || !org.telegram.ui.ActionBar.f6.B1(textView.getBackground(), i9, false)) {
            return;
        }
        k0Var.X.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.x0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i9, i10, this.x0, Path.Direction.CW);
    }
}

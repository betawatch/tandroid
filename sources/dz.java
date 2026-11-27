// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dz extends sua {
    public final Path H0;
    public final float[] I0;
    public final /* synthetic */ fz J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(fz fzVar, Context context, vnb vnbVar, vy vyVar, y00 y00Var, y00 y00Var2, y00 y00Var3, y00 y00Var4, y00 y00Var5, y00 y00Var6) {
        super(context, vnbVar, vyVar, y00Var, null, y00Var2, y00Var3, y00Var4, y00Var5, y00Var6);
        this.J0 = fzVar;
        this.H0 = new Path();
        this.I0 = new float[8];
    }

    @Override // sua, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.H0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // sua
    public final int getFinalHeight() {
        return hl.L(288.0f);
    }

    @Override // sua
    public final float getRealHeight() {
        return hl.L(288.0f);
    }

    @Override // sua
    public final void k(int i) {
        TextView textView = this.J0.W1;
        if (textView == null || !aob.F1(textView.getBackground(), i, false)) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = hl.L(12.0f);
        float[] fArr = this.I0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.H0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i, i2, this.I0, Path.Direction.CW);
    }
}

// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cz extends rqa {
    public final Path H0;
    public final float[] I0;
    public final /* synthetic */ ez J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(ez ezVar, Context context, wjb wjbVar, uy uyVar, x00 x00Var, x00 x00Var2, x00 x00Var3, x00 x00Var4, x00 x00Var5, x00 x00Var6) {
        super(context, wjbVar, uyVar, x00Var, null, x00Var2, x00Var3, x00Var4, x00Var5, x00Var6);
        this.J0 = ezVar;
        this.H0 = new Path();
        this.I0 = new float[8];
    }

    @Override // rqa, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.H0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // rqa
    public final int getFinalHeight() {
        return gl.L(288.0f);
    }

    @Override // rqa
    public final float getRealHeight() {
        return gl.L(288.0f);
    }

    @Override // rqa
    public final void k(int i) {
        TextView textView = this.J0.W1;
        if (textView == null || !bkb.F1(textView.getBackground(), i, false)) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = gl.L(12.0f);
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

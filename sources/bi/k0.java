package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k0 extends di.w5 {
    public final Path E0;
    public final float[] F0;
    public final /* synthetic */ m0 G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, b0 b0Var, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6) {
        super(context, e6Var, b0Var, oVar, null, oVar2, oVar3, oVar4, oVar5, oVar6);
        this.G0 = m0Var;
        this.E0 = new Path();
        this.F0 = new float[8];
    }

    @Override // di.w5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.E0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // di.w5
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override // di.w5
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override // di.w5
    public final void k(int i7) {
        m0 m0Var = this.G0;
        TextView textView = m0Var.X1;
        if (textView == null || !org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), i7, false)) {
            return;
        }
        m0Var.X1.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.F0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.E0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i7, i10, this.F0, Path.Direction.CW);
    }
}

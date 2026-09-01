package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d0 extends mh.c5 {
    public final Path x0;
    public final float[] y0;
    public final /* synthetic */ f0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, Context context, g6 g6Var, v vVar, eg.m mVar, eg.m mVar2, eg.m mVar3, eg.m mVar4, eg.m mVar5, eg.m mVar6) {
        super(context, g6Var, vVar, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.z0 = f0Var;
        this.x0 = new Path();
        this.y0 = new float[8];
    }

    @Override // mh.c5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.x0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // mh.c5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // mh.c5
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // mh.c5
    public final void j(int i10) {
        f0 f0Var = this.z0;
        TextView textView = f0Var.Y;
        if (textView == null || !k6.B1(textView.getBackground(), i10, false)) {
            return;
        }
        f0Var.Y.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.y0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.y0, Path.Direction.CW);
    }
}

package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.o4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q2 extends o4 {
    public final Path h;
    public final /* synthetic */ t2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(t2 t2Var, Context context) {
        super(context);
        this.n = t2Var;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.o4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.h;
        path.reset();
        t2 t2Var = this.n;
        if (t2Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -t2Var.J, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + t2Var.J));
        }
        float dp = t2Var.J - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, dp, dp, Path.Direction.CW);
    }
}

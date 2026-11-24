// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n82 extends wgb {
    public final /* synthetic */ byte a0 = 0;

    public n82(ko8 ko8Var, Context context, wjb wjbVar) {
        super(18, wjbVar, context, false, false);
    }

    @Override // wgb
    public final int e(int i) {
        switch (this.a0) {
            case 1:
                RectF rectF = ProfileActivity.Z6;
                break;
        }
        return i;
    }

    @Override // wgb, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a0) {
            case 0:
                canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    public /* synthetic */ n82(Context context) {
        super(context);
    }
}

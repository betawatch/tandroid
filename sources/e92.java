// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class e92 extends skb {
    public final /* synthetic */ byte a0 = 0;

    public e92(wr8 wr8Var, Context context, vnb vnbVar) {
        super(18, vnbVar, context, false, false);
    }

    @Override // skb
    public final int e(int i) {
        switch (this.a0) {
            case 1:
                RectF rectF = ProfileActivity.Z6;
                break;
        }
        return i;
    }

    @Override // skb, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a0) {
            case 0:
                canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    public /* synthetic */ e92(Context context) {
        super(context);
    }
}

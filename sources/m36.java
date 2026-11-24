// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m36 extends t1 {
    public final /* synthetic */ byte b = 1;

    public /* synthetic */ m36(Context context) {
        super(context, (byte) 9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.b) {
            case 0:
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                invalidate();
                break;
        }
    }

    public m36(s36 s36Var, Context context) {
        super(context, (byte) 9);
    }
}

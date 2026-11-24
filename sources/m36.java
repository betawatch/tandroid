// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

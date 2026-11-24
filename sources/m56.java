// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m56 extends t1 {
    public final /* synthetic */ byte b = 1;

    public /* synthetic */ m56(Context context) {
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

    public m56(s56 s56Var, Context context) {
        super(context, (byte) 9);
    }
}

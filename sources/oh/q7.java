package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q7 extends FrameLayout {
    public f4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ y8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(y8 y8Var, Context context) {
        super(context);
        this.e = y8Var;
    }

    public final void a(boolean z4) {
        if (this.d != z4) {
            this.d = z4;
            invalidate();
            this.a.setIsVisible(z4);
            this.e.A();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            super.dispatchDraw(canvas);
        }
    }
}

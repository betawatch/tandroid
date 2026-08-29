package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class q7 extends FrameLayout {
    public d4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ y8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(y8 y8Var, Context context) {
        super(context);
        this.e = y8Var;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.a.setIsVisible(z10);
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

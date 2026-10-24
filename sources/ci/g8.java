package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class g8 extends FrameLayout {
    public p4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ p9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(p9 p9Var, Context context) {
        super(context);
        this.e = p9Var;
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

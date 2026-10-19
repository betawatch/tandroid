package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class h8 extends FrameLayout {
    public q4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ q9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(q9 q9Var, Context context) {
        super(context);
        this.e = q9Var;
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

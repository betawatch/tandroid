package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public j4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ x e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(x xVar, Context context) {
        super(context);
        this.e = xVar;
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

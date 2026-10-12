package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class w9 extends FrameLayout {
    public q5 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ ib e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(ib ibVar, Context context) {
        super(context);
        this.e = ibVar;
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

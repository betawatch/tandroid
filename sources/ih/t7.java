package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t7 extends FrameLayout {
    public i4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ c9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(c9 c9Var, Context context) {
        super(context);
        this.e = c9Var;
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

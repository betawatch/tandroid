package di;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e8 extends FrameLayout {
    public q4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ o9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(o9 o9Var, Context context) {
        super(context);
        this.e = o9Var;
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

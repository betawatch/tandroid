// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class a3b extends FrameLayout {
    public y28 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ c8b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3b(c8b c8bVar, Context context) {
        super(context);
        this.e = c8bVar;
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            invalidate();
            this.a.setIsVisible(z);
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

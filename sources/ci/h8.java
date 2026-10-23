package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

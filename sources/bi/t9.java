package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class t9 extends FrameLayout {
    public o5 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ fb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(fb fbVar, Context context) {
        super(context);
        this.e = fbVar;
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

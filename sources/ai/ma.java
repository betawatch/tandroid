package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class ma extends FrameLayout {
    public f6 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ zb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(zb zbVar, Context context) {
        super(context);
        this.e = zbVar;
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

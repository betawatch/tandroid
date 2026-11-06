package di;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public i4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(w wVar, Context context) {
        super(context);
        this.e = wVar;
    }

    public final void a(boolean z9) {
        if (this.d != z9) {
            this.d = z9;
            invalidate();
            this.a.setIsVisible(z9);
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

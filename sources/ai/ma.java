package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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

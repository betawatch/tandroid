package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class q7 extends FrameLayout {
    public d4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ y8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(y8 y8Var, Context context) {
        super(context);
        this.e = y8Var;
    }

    public final void a(boolean z4) {
        if (this.d != z4) {
            this.d = z4;
            invalidate();
            this.a.setIsVisible(z4);
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

// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class b5b extends FrameLayout {
    public a58 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ eab e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5b(eab eabVar, Context context) {
        super(context);
        this.e = eabVar;
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

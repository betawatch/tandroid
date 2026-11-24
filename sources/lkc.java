// default package

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lkc extends View {
    public dma a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        dma dmaVar;
        if (this.b || (dmaVar = this.a) == null) {
            return;
        }
        dmaVar.b(canvas, this);
    }

    public void setState(boolean z) {
        this.b = z;
        invalidate();
    }
}

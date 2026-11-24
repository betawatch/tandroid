// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b34 extends bf0 {
    public final /* synthetic */ c34 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b34(c34 c34Var, Context context) {
        super(context);
        this.H = c34Var;
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c34 c34Var = this.H;
        e34 e34Var = c34Var.d;
        boolean z = c34Var.c;
        if (z) {
            return;
        }
        if (!hs6.d0(e34Var.d1).v0[z ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || e34Var.t1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - gm.L(8.0f), gm.L(14.0f), gm.L(3.0f), e34Var.t1);
    }
}

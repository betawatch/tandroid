// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class l24 extends de0 {
    public final /* synthetic */ m24 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l24(m24 m24Var, Context context) {
        super(context);
        this.H = m24Var;
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m24 m24Var = this.H;
        o24 o24Var = m24Var.d;
        boolean z = m24Var.c;
        if (z) {
            return;
        }
        if (!ls6.d0(o24Var.d1).v0[z ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || o24Var.t1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - hl.L(8.0f), hl.L(14.0f), hl.L(3.0f), o24Var.t1);
    }
}

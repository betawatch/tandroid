package jg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.er0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g0 extends w2 {
    public final /* synthetic */ r0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r0 r0Var, Context context, PointF pointF, float f7, float f10, pu0 pu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, pu0Var, document, obj);
        this.y0 = r0Var;
    }

    @Override // jg.w2
    public final void q(bi0 bi0Var) {
        PhotoViewer photoViewer = ((er0) this.y0).X1;
        u61 u61Var = photoViewer.F2;
        if (u61Var == null) {
            return;
        }
        long S = u61Var.S();
        long j10 = photoViewer.m8;
        bi0Var.U(S - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

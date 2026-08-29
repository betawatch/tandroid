package bg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q0 extends v3 {
    public final /* synthetic */ g1 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(g1 g1Var, Context context, PointF pointF, float f9, float f10, bv0 bv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f9, f10, bv0Var, document, obj);
        this.u0 = g1Var;
    }

    @Override // bg.v3
    public final void q(xi0 xi0Var) {
        PhotoViewer photoViewer = ((ws0) this.u0).k2;
        x61 x61Var = photoViewer.B2;
        if (x61Var == null) {
            return;
        }
        long o10 = x61Var.o();
        long j10 = photoViewer.h8;
        xi0Var.R(o10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

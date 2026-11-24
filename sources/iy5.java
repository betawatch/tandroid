// default package

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iy5 extends z1b {
    public final /* synthetic */ ry5 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy5(ry5 ry5Var, Context context, PointF pointF, float f, float f2, xka xkaVar, TLRPC.Document document, Object obj) {
        super(context, pointF, f, f2, xkaVar, document, obj);
        this.A0 = ry5Var;
    }

    @Override // z1b
    public final void q(p09 p09Var) {
        PhotoViewer photoViewer = ((sa8) this.A0).j2;
        ndc ndcVar = photoViewer.G2;
        if (ndcVar == null) {
            return;
        }
        long S = ndcVar.S();
        long j = photoViewer.r8;
        p09Var.P(S - (j > 0 ? j / 1000 : 0L));
    }
}

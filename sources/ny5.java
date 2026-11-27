// default package

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ny5 extends w3b {
    public final /* synthetic */ wy5 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny5(wy5 wy5Var, Context context, PointF pointF, float f, float f2, qma qmaVar, TLRPC.Document document, Object obj) {
        super(context, pointF, f, f2, qmaVar, document, obj);
        this.A0 = wy5Var;
    }

    @Override // w3b
    public final void q(b29 b29Var) {
        PhotoViewer photoViewer = ((hc8) this.A0).d2;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar == null) {
            return;
        }
        long S = kfcVar.S();
        long j = photoViewer.r8;
        b29Var.P(S - (j > 0 ? j / 1000 : 0L));
    }
}

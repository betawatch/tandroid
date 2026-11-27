// default package

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ny5 extends v3b {
    public final /* synthetic */ wy5 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny5(wy5 wy5Var, Context context, PointF pointF, float f, float f2, qma qmaVar, TLRPC.Document document, Object obj) {
        super(context, pointF, f, f2, qmaVar, document, obj);
        this.A0 = wy5Var;
    }

    @Override // v3b
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

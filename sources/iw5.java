// default package

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iw5 extends yza {
    public final /* synthetic */ rw5 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw5(rw5 rw5Var, Context context, PointF pointF, float f, float f2, via viaVar, TLRPC.Document document, Object obj) {
        super(context, pointF, f, f2, viaVar, document, obj);
        this.A0 = rw5Var;
    }

    @Override // yza
    public final void q(oy8 oy8Var) {
        PhotoViewer photoViewer = ((q88) this.A0).j2;
        lbc lbcVar = photoViewer.G2;
        if (lbcVar == null) {
            return;
        }
        long S = lbcVar.S();
        long j = photoViewer.r8;
        oy8Var.P(S - (j > 0 ? j / 1000 : 0L));
    }
}

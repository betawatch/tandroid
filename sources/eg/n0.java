package eg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n0 extends p3 {
    public final /* synthetic */ c1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(c1 c1Var, Context context, PointF pointF, float f10, float f11, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, jv0Var, document, obj);
        this.v0 = c1Var;
    }

    @Override // eg.p3
    public final void q(hj0 hj0Var) {
        PhotoViewer photoViewer = ((mt0) this.v0).l2;
        j71 j71Var = photoViewer.C2;
        if (j71Var == null) {
            return;
        }
        long n10 = j71Var.n();
        long j10 = photoViewer.i8;
        hj0Var.R(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

package eg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ht0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n0 extends p3 {
    public final /* synthetic */ c1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(c1 c1Var, Context context, PointF pointF, float f10, float f11, kv0 kv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, kv0Var, document, obj);
        this.v0 = c1Var;
    }

    @Override // eg.p3
    public final void q(ij0 ij0Var) {
        PhotoViewer photoViewer = ((ht0) this.v0).l2;
        k71 k71Var = photoViewer.C2;
        if (k71Var == null) {
            return;
        }
        long n10 = k71Var.n();
        long j10 = photoViewer.i8;
        ij0Var.R(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

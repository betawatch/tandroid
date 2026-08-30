package dg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p0 extends r3 {
    public final /* synthetic */ e1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e1 e1Var, Context context, PointF pointF, float f10, float f11, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, jv0Var, document, obj);
        this.v0 = e1Var;
    }

    @Override // dg.r3
    public final void q(gj0 gj0Var) {
        PhotoViewer photoViewer = ((ft0) this.v0).l2;
        i71 i71Var = photoViewer.C2;
        if (i71Var == null) {
            return;
        }
        long n10 = i71Var.n();
        long j10 = photoViewer.i8;
        gj0Var.R(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

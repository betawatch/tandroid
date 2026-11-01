package jg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cr0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g0 extends w2 {
    public final /* synthetic */ r0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r0 r0Var, Context context, PointF pointF, float f7, float f10, qu0 qu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, qu0Var, document, obj);
        this.y0 = r0Var;
    }

    @Override // jg.w2
    public final void q(ci0 ci0Var) {
        PhotoViewer photoViewer = ((cr0) this.y0).X1;
        v61 v61Var = photoViewer.F2;
        if (v61Var == null) {
            return;
        }
        long S = v61Var.S();
        long j10 = photoViewer.m8;
        ci0Var.U(S - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

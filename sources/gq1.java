// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gq1 implements y70 {
    public final /* synthetic */ yv1 a;

    public gq1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override // y70
    public final void dismiss() {
        m8 m8Var = this.a.g9;
        if (m8Var != null) {
            m8Var.dismiss();
        }
    }

    @Override // y70
    public final void l(int i, int i2) {
        yv1 yv1Var = this.a;
        yv1Var.getMessagesController().P4(i, yv1Var.l6);
        if (yv1Var.s8 == null && yv1Var.r8 == null) {
            return;
        }
        yv1Var.i6();
        UndoView undoView = yv1Var.N3;
        if (undoView == null) {
            return;
        }
        long j = yv1Var.l6;
        TLRPC.User user = yv1Var.f;
        TLRPC.UserFull userFull = yv1Var.s8;
        undoView.k(j, i2, user, Integer.valueOf(userFull != null ? userFull.ttl_period : yv1Var.r8.ttl_period), null, null);
    }

    @Override // y70
    public final void n() {
    }
}

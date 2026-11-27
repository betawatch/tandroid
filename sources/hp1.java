// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hp1 implements a70 {
    public final /* synthetic */ zu1 a;

    public hp1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override // a70
    public final void H(int i, int i2) {
        zu1 zu1Var = this.a;
        zu1Var.getMessagesController().V4(i, zu1Var.l6);
        if (zu1Var.s8 == null && zu1Var.r8 == null) {
            return;
        }
        zu1Var.i6();
        UndoView undoView = zu1Var.N3;
        if (undoView == null) {
            return;
        }
        long j = zu1Var.l6;
        TLRPC.User user = zu1Var.f;
        TLRPC.UserFull userFull = zu1Var.s8;
        undoView.k(j, i2, user, Integer.valueOf(userFull != null ? userFull.ttl_period : zu1Var.r8.ttl_period), null, null);
    }

    @Override // a70
    public final void dismiss() {
        n8 n8Var = this.a.g9;
        if (n8Var != null) {
            n8Var.dismiss();
        }
    }

    @Override // a70
    public final void N() {
    }
}

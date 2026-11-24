// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l72 implements y60 {
    public final /* synthetic */ m8[] a;
    public final /* synthetic */ o72 b;

    public l72(o72 o72Var, m8[] m8VarArr) {
        this.b = o72Var;
        this.a = m8VarArr;
    }

    @Override // y60
    public final void dismiss() {
        m8 m8Var = this.a[0];
        if (m8Var != null) {
            m8Var.dismiss();
        }
    }

    @Override // y60
    public final void n(int i, int i2) {
        mu1 mu1Var = this.b.H;
        if (mu1Var != null) {
            mu1Var.getMessagesController().M4(i, mu1Var.a());
            TLRPC.ChatFull chatFull = mu1Var.r8;
            TLRPC.UserFull userFull = mu1Var.s8;
            if (userFull == null && chatFull == null) {
                return;
            }
            mu1Var.Z5();
            UndoView undoView = mu1Var.N3;
            if (undoView != null) {
                undoView.k(mu1Var.a(), i2, mu1Var.h(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
            }
        }
    }

    @Override // y60
    public final void F() {
    }
}

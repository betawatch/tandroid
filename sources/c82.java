// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c82 implements a70 {
    public final /* synthetic */ n8[] a;
    public final /* synthetic */ f82 b;

    public c82(f82 f82Var, n8[] n8VarArr) {
        this.b = f82Var;
        this.a = n8VarArr;
    }

    @Override // a70
    public final void H(int i, int i2) {
        zu1 zu1Var = this.b.H;
        if (zu1Var != null) {
            zu1Var.getMessagesController().V4(i, zu1Var.a());
            TLRPC.ChatFull chatFull = zu1Var.r8;
            TLRPC.UserFull userFull = zu1Var.s8;
            if (userFull == null && chatFull == null) {
                return;
            }
            zu1Var.i6();
            UndoView undoView = zu1Var.N3;
            if (undoView != null) {
                undoView.k(zu1Var.a(), i2, zu1Var.h(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
            }
        }
    }

    @Override // a70
    public final void dismiss() {
        n8 n8Var = this.a[0];
        if (n8Var != null) {
            n8Var.dismiss();
        }
    }

    @Override // a70
    public final void N() {
    }
}

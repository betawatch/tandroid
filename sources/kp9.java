// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kp9 extends tca {
    public final /* synthetic */ pp9 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp9(pp9 pp9Var, Context context, String str, String str2) {
        super(context, null, str, null, false, str2, null, true);
        this.U2 = pp9Var;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            int m = vh6Var.m();
            UndoView undoView = this.U2.J;
            if (m != 1) {
                undoView.k(0L, 41, Integer.valueOf(i), Integer.valueOf(vh6Var.m()), null, null);
            } else {
                undoView.m(Integer.valueOf(i), 41, ((TLRPC.Dialog) vh6Var.n(0)).id);
            }
        }
    }
}

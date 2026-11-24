// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jn9 extends taa {
    public final /* synthetic */ on9 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn9(on9 on9Var, Context context, String str, String str2) {
        super(context, null, str, null, false, str2, null, true);
        this.U2 = on9Var;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            int m = vf6Var.m();
            UndoView undoView = this.U2.J;
            if (m != 1) {
                undoView.k(0L, 41, Integer.valueOf(i), Integer.valueOf(vf6Var.m()), null, null);
            } else {
                undoView.m(Integer.valueOf(i), 41, ((TLRPC.Dialog) vf6Var.n(0)).id);
            }
        }
    }
}

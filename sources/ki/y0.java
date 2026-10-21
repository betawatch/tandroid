package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class y0 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new y0());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        MessageObject messageObject;
        t tVar;
        z0 z0Var = (z0) view;
        a aVar = (a) h61Var.G;
        r3 r3Var = (r3) h61Var.H;
        z0Var.a = aVar;
        z0Var.S = r3Var;
        z0Var.M = LocaleController.isRTL;
        z0Var.c(aVar);
        z0Var.F.b();
        TLRPC.Document i10 = z0Var.i();
        if (z0Var.U != i10) {
            z0Var.U = i10;
            if (i10 == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = -Long.valueOf(i10.id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i11 = z0Var.n;
                long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = i10;
                tL_message.flags |= 768;
                a aVar2 = z0Var.a;
                if (aVar2 != null && (tVar = aVar2.g) != null && !TextUtils.isEmpty(tVar.e)) {
                    tL_message.attachPath = z0Var.a.g.e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            z0Var.T = messageObject;
        }
        z0Var.h(i10);
        z0Var.k();
        if (z0Var.N) {
            z0Var.l(false);
        }
        z0Var.requestLayout();
        z0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        z0 z0Var = new z0(context, i10, d6Var);
        z0Var.setBackground(new a2(h6.w0(h6.d6, d6Var)));
        return z0Var;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}

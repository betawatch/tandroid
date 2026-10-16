package ji;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class y0 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new y0());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        MessageObject messageObject;
        u uVar;
        z0 z0Var = (z0) view;
        a aVar = (a) m61Var.G;
        s3 s3Var = (s3) m61Var.H;
        z0Var.a = aVar;
        z0Var.S = s3Var;
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
                if (aVar2 != null && (uVar = aVar2.g) != null && !TextUtils.isEmpty(uVar.e)) {
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

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        z0 z0Var = new z0(context, i10, c6Var);
        z0Var.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var)));
        return z0Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}

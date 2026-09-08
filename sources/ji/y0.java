package ji;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class y0 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new y0());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        MessageObject messageObject;
        u uVar;
        z0 z0Var = (z0) view;
        a aVar = (a) h51Var.G;
        q3 q3Var = (q3) h51Var.H;
        z0Var.a = aVar;
        z0Var.S = q3Var;
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

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        z0 z0Var = new z0(context, i10, f6Var);
        z0Var.setBackground(new z1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        return z0Var;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}

package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class b1 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new b1());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        MessageObject messageObject;
        v vVar;
        c1 c1Var = (c1) view;
        a aVar = (a) v51Var.G;
        u3 u3Var = (u3) v51Var.H;
        c1Var.a = aVar;
        c1Var.S = u3Var;
        c1Var.M = LocaleController.isRTL;
        c1Var.c(aVar);
        c1Var.F.b();
        TLRPC.Document i10 = c1Var.i();
        if (c1Var.U != i10) {
            c1Var.U = i10;
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
                int i11 = c1Var.n;
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
                a aVar2 = c1Var.a;
                if (aVar2 != null && (vVar = aVar2.g) != null && !TextUtils.isEmpty(vVar.e)) {
                    tL_message.attachPath = c1Var.a.g.e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            c1Var.T = messageObject;
        }
        c1Var.h(i10);
        c1Var.k();
        if (c1Var.N) {
            c1Var.l(false);
        }
        c1Var.requestLayout();
        c1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        c1 c1Var = new c1(context, i10, f6Var);
        c1Var.setBackground(new d2(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        return c1Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}

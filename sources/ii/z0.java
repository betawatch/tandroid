package ii;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class z0 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new z0());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        MessageObject messageObject;
        u uVar;
        a1 a1Var = (a1) view;
        a aVar = (a) x51Var.G;
        r3 r3Var = (r3) x51Var.H;
        a1Var.a = aVar;
        a1Var.S = r3Var;
        a1Var.M = LocaleController.isRTL;
        a1Var.c(aVar);
        a1Var.F.b();
        TLRPC.Document i10 = a1Var.i();
        if (a1Var.U != i10) {
            a1Var.U = i10;
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
                int i11 = a1Var.n;
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
                a aVar2 = a1Var.a;
                if (aVar2 != null && (uVar = aVar2.g) != null && !TextUtils.isEmpty(uVar.e)) {
                    tL_message.attachPath = a1Var.a.g.e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            a1Var.T = messageObject;
        }
        a1Var.h(i10);
        a1Var.k();
        if (a1Var.N) {
            a1Var.l(false);
        }
        a1Var.requestLayout();
        a1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        a1 a1Var = new a1(context, i10, e6Var);
        a1Var.setBackground(new a2(j6.v0(j6.d6, e6Var)));
        return a1Var;
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}

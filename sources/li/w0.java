package li;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class w0 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new w0());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ij ijVar;
        s sVar;
        x0 x0Var = (x0) view;
        a aVar = (a) y31Var.G;
        o3 o3Var = (o3) y31Var.H;
        x0Var.a = aVar;
        x0Var.S = o3Var;
        x0Var.M = id.a0;
        x0Var.c(aVar);
        x0Var.F.b();
        TLRPC.Document h = x0Var.h();
        if (x0Var.U != h) {
            x0Var.U = h;
            if (h == null) {
                ijVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = -Long.valueOf(h.id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i7 = x0Var.n;
                long e10 = p10.i(i7).e();
                peer.user_id = e10;
                tL_peerUser.user_id = e10;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = x0Var.a;
                if (aVar2 != null && (sVar = aVar2.g) != null && !TextUtils.isEmpty(sVar.e)) {
                    tL_message.attachPath = x0Var.a.g.e;
                }
                ijVar = new ij(i7, tL_message, false, true);
            }
            x0Var.T = ijVar;
        }
        x0Var.g(h);
        x0Var.l();
        if (x0Var.N) {
            x0Var.m(false);
        }
        x0Var.requestLayout();
        x0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        x0 x0Var = new x0(i7, context, g6Var);
        x0Var.setBackground(new y1(l6.w0(l6.d6, g6Var)));
        x0Var.W = true;
        return x0Var;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }
}

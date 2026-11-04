package mi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class x0 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new x0());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        zi ziVar;
        s sVar;
        y0 y0Var = (y0) view;
        a aVar = (a) r31Var.G;
        o3 o3Var = (o3) r31Var.H;
        y0Var.a = aVar;
        y0Var.T = o3Var;
        y0Var.N = bd.a0;
        y0Var.c(aVar);
        y0Var.G.b();
        TLRPC.Document h = y0Var.h();
        if (y0Var.V != h) {
            y0Var.V = h;
            if (h == null) {
                ziVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = -Long.valueOf(h.id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i3 = y0Var.n;
                long e10 = h10.i(i3).e();
                peer.user_id = e10;
                tL_peerUser.user_id = e10;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = y0Var.a;
                if (aVar2 != null && (sVar = aVar2.g) != null && !TextUtils.isEmpty(sVar.e)) {
                    tL_message.attachPath = y0Var.a.g.e;
                }
                ziVar = new zi(i3, tL_message, false, true);
            }
            y0Var.U = ziVar;
        }
        y0Var.g(h);
        y0Var.l();
        if (y0Var.O) {
            y0Var.m(false);
        }
        y0Var.requestLayout();
        y0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        y0 y0Var = new y0(i3, context, e6Var);
        y0Var.setBackground(new z1(k6.w0(k6.d6, e6Var)));
        y0Var.a0 = true;
        return y0Var;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}

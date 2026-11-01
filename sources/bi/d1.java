package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class d1 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new d1());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        kj kjVar;
        w wVar;
        e1 e1Var = (e1) view;
        a aVar = (a) b51Var.G;
        y3 y3Var = (y3) b51Var.H;
        e1Var.a = aVar;
        e1Var.S = y3Var;
        e1Var.M = dd.X;
        e1Var.c(aVar);
        e1Var.F.b();
        TLRPC.Document j10 = e1Var.j();
        if (e1Var.U != j10) {
            e1Var.U = j10;
            if (j10 == null) {
                kjVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = -Long.valueOf(j10.id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i10 = e1Var.n;
                long e = e20.i(i10).e();
                peer.user_id = e;
                tL_peerUser.user_id = e;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = j10;
                tL_message.flags |= 768;
                a aVar2 = e1Var.a;
                if (aVar2 != null && (wVar = aVar2.g) != null && !TextUtils.isEmpty(wVar.e)) {
                    tL_message.attachPath = e1Var.a.g.e;
                }
                kjVar = new kj(i10, tL_message, false, true);
            }
            e1Var.T = kjVar;
        }
        e1Var.g(j10);
        e1Var.l();
        if (e1Var.N) {
            e1Var.m(false);
        }
        e1Var.requestLayout();
        e1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        e1 e1Var = new e1(i10, context, p6Var);
        e1Var.setBackground(new h2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)));
        e1Var.W = true;
        return e1Var;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}

// default package

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class eh3 extends oj3 {
    public final /* synthetic */ bj3 c0;
    public final /* synthetic */ cj3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(cj3 cj3Var, cj3 cj3Var2, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType, bj3 bj3Var) {
        super(cj3Var2, context, i, i2, z, arrayList, i3, requestPeerType);
        this.d0 = cj3Var;
        this.c0 = bj3Var;
    }

    @Override // oj3
    public final void K() {
        this.d0.presentFragment(new cs());
    }

    @Override // oj3
    public final void L() {
        cj3 cj3Var = this.d0;
        hd hdVar = new hd(3, null, cj3Var.getParentActivity());
        TLRPC.RequestPeerType requestPeerType = cj3Var.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle j = ls6.j(0, "step");
            Boolean bool = cj3Var.H.has_username;
            if (bool != null) {
                j.putBoolean("forcePublic", bool.booleanValue());
            }
            yh1 yh1Var = new yh1(j);
            yh1Var.v0 = new p((Object) cj3Var, (Object) yh1Var, (Object) hdVar, (byte) 8);
            cj3Var.presentFragment(yh1Var);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = cj3Var.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{cj3Var.getUserConfig().e()} : new long[]{cj3Var.getUserConfig().e(), cj3Var.I});
            Boolean bool3 = cj3Var.H.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            wa5 wa5Var = new wa5(bundle);
            wa5Var.Z = new wh3(cj3Var, hdVar);
            cj3Var.presentFragment(wa5Var);
        }
    }

    @Override // oj3
    public final void M(TLRPC.User user) {
        int i;
        i = ((d) this.d0).currentAccount;
        na7.q1(i).y3(null, user, null, 0, null, false, false);
    }

    @Override // oj3
    public final boolean O() {
        return this.d0.T0 == 0;
    }

    @Override // oj3, w39
    public final void f() {
        b();
        int i = bj3.M;
        try {
            super.f();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        cj3 cj3Var = this.d0;
        if (cj3Var.T0 == 15) {
            cj3Var.k0.setVisibility(this.V ? 8 : 0);
        }
    }

    @Override // oj3, qe3
    public final void o(ue3 ue3Var) {
        int i;
        if (ue3Var.getMessage() != null) {
            cj3 cj3Var = this.d0;
            pub pubVar = cj3Var.getMessagesController().g4;
            long j = -ue3Var.getDialogId();
            i = ((d) cj3Var).currentAccount;
            TLRPC.TL_forumTopic f = pubVar.f(j, k27.b2(i, ue3Var.getMessage().k, true, false));
            if (f != null) {
                if (cj3Var.n2) {
                    cj3Var.i3(ue3Var.getDialogId(), f.id, false, null);
                } else {
                    mm4.n(cj3Var, -ue3Var.getDialogId(), f, 0);
                }
            }
        }
    }

    @Override // oj3, qe3
    public final void w(ue3 ue3Var) {
        bj3 bj3Var = this.c0;
        bj3Var.a.getClass();
        this.d0.z4(ue3Var, RecyclerView.R(ue3Var), 0.0f, bj3Var.d);
    }
}

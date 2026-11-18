package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yo0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class q2 extends yo0 {
    public final /* synthetic */ z3 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(z3 z3Var, Context context, String str, String str2, boolean z10, g2 g2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, g2Var);
        this.V2 = z3Var;
    }

    @Override // org.telegram.ui.Components.yo0, org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        this.V2.J2 = null;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            z3 z3Var = this.V2;
            lc lcVar = new lc(z3Var.M0, this.J0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == j10.i(this.a).n) {
                    gc G = lcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744228, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    gc G2 = lcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744241, tL_forumTopic != null ? tL_forumTopic.title : mp.u1(this.a).O0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    gc G3 = lcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744241, mp.u1(this.a).c2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                gc Q = lcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(gd.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                z3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.yo0
    public final void T0(View view) {
        this.V2.c1();
    }
}

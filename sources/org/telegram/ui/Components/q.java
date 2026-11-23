package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q extends ap0 {
    public final /* synthetic */ n0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n0 n0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = n0Var;
    }

    @Override // org.telegram.ui.Components.ap0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        FrameLayout frameLayout = this.V2.E2;
        if (z10) {
            lc lcVar = new lc(frameLayout, this.J0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.k10.i(this.a).n) {
                    gc G = lcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754967, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    gc G2 = lcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754971, tL_forumTopic != null ? tL_forumTopic.title : org.telegram.messenger.np.u1(this.a).O0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    gc G3 = lcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754971, org.telegram.messenger.np.u1(this.a).c2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                gc Q = lcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}

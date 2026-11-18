package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class p extends yo0 {
    public final /* synthetic */ m0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m0 m0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = m0Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        FrameLayout frameLayout = this.V2.E2;
        if (z10) {
            lc lcVar = new lc(frameLayout, this.J0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.j10.i(this.a).n) {
                    gc G = lcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754967, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    gc G2 = lcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754971, tL_forumTopic != null ? tL_forumTopic.title : org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    gc G3 = lcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754971, org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                gc Q = lcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
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

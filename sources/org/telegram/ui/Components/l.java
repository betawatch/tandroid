package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l extends mo0 {
    public final /* synthetic */ f0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f0 f0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.U2 = f0Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        FrameLayout frameLayout = this.U2.B2;
        if (z9) {
            gc gcVar = new gc(frameLayout, this.I0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.p10.i(this.a).n) {
                    bc G = gcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754967, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    bc G2 = gcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754971, tL_forumTopic != null ? tL_forumTopic.title : org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    bc G3 = gcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754971, org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                bc Q = gcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
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

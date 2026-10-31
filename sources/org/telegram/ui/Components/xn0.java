package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xn0 extends sk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ org.telegram.messenger.vp e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public xn0(org.telegram.ui.ActionBar.p6 p6Var, List list, org.telegram.messenger.vp vpVar, int i10, TLRPC.Peer peer) {
        this.c = p6Var;
        this.d = list;
        this.e = vpVar;
        this.f = i10;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        bo0 bo0Var = (bo0) c1Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i10);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j10 = peer.channel_id;
        long j11 = j10 != 0 ? -j10 : 0L;
        if (j11 == 0) {
            long j12 = peer.user_id;
            if (j12 != 0) {
                j11 = j12;
            }
        }
        TLRPC.Peer peer2 = this.h;
        org.telegram.messenger.vp vpVar = this.e;
        boolean z10 = true;
        if (j11 >= 0) {
            TLRPC.User Z1 = vpVar.Z1(Long.valueOf(j11));
            if (Z1 != null) {
                bo0Var.b.setText(org.telegram.messenger.h20.p(Z1));
                bo0Var.c.setText(org.telegram.messenger.cd.L0(2131743375, null));
                bo0Var.a.setAvatar(Z1);
            }
            lu0 lu0Var = bo0Var.a;
            if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            lu0Var.a(z10, false);
            return;
        }
        TLRPC.Chat L0 = vpVar.L0(Long.valueOf(-j11));
        if (L0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = L0.title;
                TextView textView = bo0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - org.telegram.messenger.i0.L(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                dq dqVar = new dq(R.drawable.msg_mini_premiumlock, 0);
                dqVar.n = 1;
                dqVar.c(org.telegram.messenger.i0.L(14.0f));
                dqVar.a(org.telegram.ui.ActionBar.t6.C6);
                spannableString.setSpan(dqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                bo0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                bo0Var.b.setText(L0.title);
            }
            bo0Var.c.setText(org.telegram.messenger.cd.G(L0.participants_count, (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            bo0Var.a.setAvatar(L0);
        }
        lu0 lu0Var2 = bo0Var.a;
        if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        lu0Var2.a(z10, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new ck0(new bo0(viewGroup.getContext(), this.c));
    }
}

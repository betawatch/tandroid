package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yn0 extends tk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ org.telegram.messenger.wp e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public yn0(org.telegram.ui.ActionBar.p6 p6Var, List list, org.telegram.messenger.wp wpVar, int i10, TLRPC.Peer peer) {
        this.c = p6Var;
        this.d = list;
        this.e = wpVar;
        this.f = i10;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        co0 co0Var = (co0) c1Var.a;
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
        org.telegram.messenger.wp wpVar = this.e;
        boolean z10 = true;
        if (j11 >= 0) {
            TLRPC.User Z1 = wpVar.Z1(Long.valueOf(j11));
            if (Z1 != null) {
                co0Var.b.setText(org.telegram.messenger.i20.p(Z1));
                co0Var.c.setText(org.telegram.messenger.dd.L0(2131743375, null));
                co0Var.a.setAvatar(Z1);
            }
            mu0 mu0Var = co0Var.a;
            if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            mu0Var.a(z10, false);
            return;
        }
        TLRPC.Chat L0 = wpVar.L0(Long.valueOf(-j11));
        if (L0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = L0.title;
                TextView textView = co0Var.b;
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
                co0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                co0Var.b.setText(L0.title);
            }
            co0Var.c.setText(org.telegram.messenger.dd.G(L0.participants_count, (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            co0Var.a.setAvatar(L0);
        }
        mu0 mu0Var2 = co0Var.a;
        if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        mu0Var2.a(z10, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new dk0(new co0(viewGroup.getContext(), this.c));
    }
}

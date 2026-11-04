package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zm0 extends sj0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ org.telegram.messenger.hp e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public zm0(org.telegram.ui.ActionBar.e6 e6Var, List list, org.telegram.messenger.hp hpVar, int i3, TLRPC.Peer peer) {
        this.c = e6Var;
        this.d = list;
        this.e = hpVar;
        this.f = i3;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        dn0 dn0Var = (dn0) d1Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i3);
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
        org.telegram.messenger.hp hpVar = this.e;
        boolean z10 = true;
        if (j11 >= 0) {
            TLRPC.User a22 = hpVar.a2(Long.valueOf(j11));
            if (a22 != null) {
                dn0Var.b.setText(org.telegram.messenger.l10.p(a22));
                dn0Var.c.setText(org.telegram.messenger.bd.M0(2131743359, null));
                dn0Var.a.setAvatar(a22);
            }
            ht0 ht0Var = dn0Var.a;
            if (peer2 == null ? i3 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            ht0Var.a(z10, false);
            return;
        }
        TLRPC.Chat M0 = hpVar.M0(Long.valueOf(-j11));
        if (M0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = M0.title;
                TextView textView = dn0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                wp wpVar = new wp(R.drawable.msg_mini_premiumlock, 0);
                wpVar.n = 1;
                wpVar.c(org.telegram.messenger.g0.L(14.0f));
                wpVar.a(org.telegram.ui.ActionBar.k6.C6);
                spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                dn0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                dn0Var.b.setText(M0.title);
            }
            dn0Var.c.setText(org.telegram.messenger.bd.G(M0.participants_count, (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            dn0Var.a.setAvatar(M0);
        }
        ht0 ht0Var2 = dn0Var.a;
        if (peer2 == null ? i3 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        ht0Var2.a(z10, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new bj0(new dn0(viewGroup.getContext(), this.c));
    }
}

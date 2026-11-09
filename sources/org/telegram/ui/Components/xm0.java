package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xm0 extends pj0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ org.telegram.messenger.qp e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public xm0(org.telegram.ui.ActionBar.g6 g6Var, List list, org.telegram.messenger.qp qpVar, int i7, TLRPC.Peer peer) {
        this.c = g6Var;
        this.d = list;
        this.e = qpVar;
        this.f = i7;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        bn0 bn0Var = (bn0) d1Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i7);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j3 = peer.channel_id;
        long j10 = j3 != 0 ? -j3 : 0L;
        if (j10 == 0) {
            long j11 = peer.user_id;
            if (j11 != 0) {
                j10 = j11;
            }
        }
        TLRPC.Peer peer2 = this.h;
        org.telegram.messenger.qp qpVar = this.e;
        boolean z9 = true;
        if (j10 >= 0) {
            TLRPC.User a22 = qpVar.a2(Long.valueOf(j10));
            if (a22 != null) {
                bn0Var.b.setText(org.telegram.messenger.t10.p(a22));
                bn0Var.c.setText(org.telegram.messenger.id.M0(2131743349, null));
                bn0Var.a.setAvatar(a22);
            }
            kt0 kt0Var = bn0Var.a;
            if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
                z9 = false;
            }
            kt0Var.a(z9, false);
            return;
        }
        TLRPC.Chat M0 = qpVar.M0(Long.valueOf(-j10));
        if (M0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = M0.title;
                TextView textView = bn0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                wp wpVar = new wp(R.drawable.msg_mini_premiumlock, 0);
                wpVar.n = 1;
                wpVar.c(org.telegram.messenger.g0.L(14.0f));
                wpVar.a(org.telegram.ui.ActionBar.l6.C6);
                spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                bn0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                bn0Var.b.setText(M0.title);
            }
            bn0Var.c.setText(org.telegram.messenger.id.G(M0.participants_count, (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            bn0Var.a.setAvatar(M0);
        }
        kt0 kt0Var2 = bn0Var.a;
        if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
            z9 = false;
        }
        kt0Var2.a(z9, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new yi0(new bn0(viewGroup.getContext(), this.c));
    }
}

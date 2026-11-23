package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ln0 extends dk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ org.telegram.messenger.np e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public ln0(org.telegram.ui.ActionBar.h6 h6Var, List list, org.telegram.messenger.np npVar, int i7, TLRPC.Peer peer) {
        this.c = h6Var;
        this.d = list;
        this.e = npVar;
        this.f = i7;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        pn0 pn0Var = (pn0) f1Var.a;
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
        org.telegram.messenger.np npVar = this.e;
        boolean z10 = true;
        if (j10 >= 0) {
            TLRPC.User c22 = npVar.c2(Long.valueOf(j10));
            if (c22 != null) {
                pn0Var.b.setText(org.telegram.messenger.p10.q(c22));
                pn0Var.c.setText(org.telegram.messenger.hd.N0(2131743104, null));
                pn0Var.a.setAvatar(c22);
            }
            ut0 ut0Var = pn0Var.a;
            if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            ut0Var.a(z10, false);
            return;
        }
        TLRPC.Chat O0 = npVar.O0(Long.valueOf(-j10));
        if (O0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = O0.title;
                TextView textView = pn0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                nq nqVar = new nq(R.drawable.msg_mini_premiumlock, 0);
                nqVar.n = 1;
                nqVar.c(org.telegram.messenger.g0.L(14.0f));
                nqVar.a(org.telegram.ui.ActionBar.m6.C6);
                spannableString.setSpan(nqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                pn0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                pn0Var.b.setText(O0.title);
            }
            pn0Var.c.setText(org.telegram.messenger.hd.G(O0.participants_count, (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            pn0Var.a.setAvatar(O0);
        }
        ut0 ut0Var2 = pn0Var.a;
        if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        ut0Var2.a(z10, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new mj0(new pn0(viewGroup.getContext(), this.c));
    }
}

package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jn0 extends bk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ org.telegram.messenger.mp e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public jn0(org.telegram.ui.ActionBar.i6 i6Var, List list, org.telegram.messenger.mp mpVar, int i7, TLRPC.Peer peer) {
        this.c = i6Var;
        this.d = list;
        this.e = mpVar;
        this.f = i7;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        nn0 nn0Var = (nn0) f1Var.a;
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
        org.telegram.messenger.mp mpVar = this.e;
        boolean z10 = true;
        if (j10 >= 0) {
            TLRPC.User c22 = mpVar.c2(Long.valueOf(j10));
            if (c22 != null) {
                nn0Var.b.setText(org.telegram.messenger.o10.q(c22));
                nn0Var.c.setText(org.telegram.messenger.gd.M0(2131743112, null));
                nn0Var.a.setAvatar(c22);
            }
            rt0 rt0Var = nn0Var.a;
            if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            rt0Var.a(z10, false);
            return;
        }
        TLRPC.Chat O0 = mpVar.O0(Long.valueOf(-j10));
        if (O0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = O0.title;
                TextView textView = nn0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                lq lqVar = new lq(R.drawable.msg_mini_premiumlock, 0);
                lqVar.n = 1;
                lqVar.c(org.telegram.messenger.g0.L(14.0f));
                lqVar.a(org.telegram.ui.ActionBar.n6.C6);
                spannableString.setSpan(lqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                nn0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                nn0Var.b.setText(O0.title);
            }
            nn0Var.c.setText(org.telegram.messenger.gd.G(O0.participants_count, (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            nn0Var.a.setAvatar(O0);
        }
        rt0 rt0Var2 = nn0Var.a;
        if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        rt0Var2.a(z10, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new kj0(new nn0(viewGroup.getContext(), this.c));
    }
}

// default package

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g6a extends q59 {
    public final /* synthetic */ ylb c;
    public final /* synthetic */ List d;
    public final /* synthetic */ oc7 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public g6a(ylb ylbVar, List list, oc7 oc7Var, int i, TLRPC.Peer peer) {
        this.c = ylbVar;
        this.d = list;
        this.e = oc7Var;
        this.f = i;
        this.h = peer;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        return this.d.size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        k6a k6aVar = (k6a) u69Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j = peer.channel_id;
        long j2 = j != 0 ? -j : 0L;
        if (j2 == 0) {
            long j3 = peer.user_id;
            if (j3 != 0) {
                j2 = j3;
            }
        }
        TLRPC.Peer peer2 = this.h;
        boolean z = true;
        oc7 oc7Var = this.e;
        if (j2 >= 0) {
            TLRPC.User W1 = oc7Var.W1(Long.valueOf(j2));
            if (W1 != null) {
                k6aVar.b.setText(m9c.r(W1));
                k6aVar.c.setText(jb6.M0(2131743033, null));
                k6aVar.a.setAvatar(W1);
            }
            dka dkaVar = k6aVar.a;
            if (peer2 == null ? i != 0 : peer2.user_id != peer.user_id) {
                z = false;
            }
            dkaVar.a(z, false);
            return;
        }
        TLRPC.Chat L0 = oc7Var.L0(Long.valueOf(-j2));
        if (L0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb = new StringBuilder();
                String str = L0.title;
                TextView textView = k6aVar.b;
                sb.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - gm.L(100.0f), TextUtils.TruncateAt.END));
                sb.append(" d");
                SpannableString spannableString = new SpannableString(sb.toString());
                pn2 pn2Var = new pn2(R.drawable.msg_mini_premiumlock, 0);
                pn2Var.n = 1;
                pn2Var.c(gm.L(14.0f));
                pn2Var.a(cmb.B6);
                spannableString.setSpan(pn2Var, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                k6aVar.b.setEllipsize(TextUtils.TruncateAt.END);
                k6aVar.b.setText(L0.title);
            }
            k6aVar.c.setText(jb6.G(L0.participants_count, (!sd2.T(L0) || L0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            k6aVar.a.setAvatar(L0);
        }
        dka dkaVar2 = k6aVar.a;
        if (peer2 == null ? i != 0 : peer2.channel_id != peer.channel_id) {
            z = false;
        }
        dkaVar2.a(z, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return new b59(new k6a(viewGroup.getContext(), this.c));
    }
}

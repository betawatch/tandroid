// default package

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e4a extends n39 {
    public final /* synthetic */ wjb c;
    public final /* synthetic */ List d;
    public final /* synthetic */ na7 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public e4a(wjb wjbVar, List list, na7 na7Var, int i, TLRPC.Peer peer) {
        this.c = wjbVar;
        this.d = list;
        this.e = na7Var;
        this.f = i;
        this.h = peer;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        return this.d.size();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        i4a i4aVar = (i4a) s49Var.a;
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
        na7 na7Var = this.e;
        if (j2 >= 0) {
            TLRPC.User V1 = na7Var.V1(Long.valueOf(j2));
            if (V1 != null) {
                i4aVar.b.setText(l7c.r(V1));
                i4aVar.c.setText(k96.M0(2131743107, null));
                i4aVar.a.setAvatar(V1);
            }
            bia biaVar = i4aVar.a;
            if (peer2 == null ? i != 0 : peer2.user_id != peer.user_id) {
                z = false;
            }
            biaVar.a(z, false);
            return;
        }
        TLRPC.Chat K0 = na7Var.K0(Long.valueOf(-j2));
        if (K0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb = new StringBuilder();
                String str = K0.title;
                TextView textView = i4aVar.b;
                sb.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - gl.L(100.0f), TextUtils.TruncateAt.END));
                sb.append(" d");
                SpannableString spannableString = new SpannableString(sb.toString());
                cm2 cm2Var = new cm2(R.drawable.msg_mini_premiumlock, 0);
                cm2Var.n = 1;
                cm2Var.c(gl.L(14.0f));
                cm2Var.a(bkb.B6);
                spannableString.setSpan(cm2Var, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                i4aVar.b.setEllipsize(TextUtils.TruncateAt.END);
                i4aVar.b.setText(K0.title);
            }
            i4aVar.c.setText(k96.G(K0.participants_count, (!hc2.T(K0) || K0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            i4aVar.a.setAvatar(K0);
        }
        bia biaVar2 = i4aVar.a;
        if (peer2 == null ? i != 0 : peer2.channel_id != peer.channel_id) {
            z = false;
        }
        biaVar2.a(z, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        return new y29(new i4a(viewGroup.getContext(), this.c));
    }
}

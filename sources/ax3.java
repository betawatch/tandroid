// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ax3 implements vv2 {
    public final /* synthetic */ qx3 a;

    public ax3(qx3 qx3Var) {
        this.a = qx3Var;
    }

    @Override // vv2
    public final boolean A(TLRPC.Document document) {
        return y6c.h(y6c.t0).p() && k27.H2(document);
    }

    @Override // vv2
    public final String C(boolean z) {
        return null;
    }

    @Override // vv2
    public final void E(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(k27.U(document));
        valueOf.setSpan(new gm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (gl.g(valueOf)) {
            qx3 qx3Var = this.a;
            new u21((FrameLayout) qx3Var.b, qx3Var.J0).i(k96.M0(2131751172, null)).j();
        }
    }

    @Override // vv2
    public final boolean F() {
        return false;
    }

    @Override // vv2
    public final cs5 G(ViewGroup viewGroup) {
        return null;
    }

    @Override // vv2
    public final boolean K() {
        return false;
    }

    @Override // vv2
    public final boolean P(TLRPC.Document document) {
        return false;
    }

    @Override // vv2
    public final Boolean S(TLRPC.Document document) {
        TLRPC.User f;
        if (!y6c.h(y6c.t0).p() || !k27.H2(document) || (f = y6c.h(y6c.t0).f()) == null) {
            return null;
        }
        Long i = l7c.i(f);
        return Boolean.valueOf(document != null && (i == null || i.longValue() != document.id));
    }

    @Override // vv2
    public final boolean T() {
        return true;
    }

    @Override // vv2
    public final long a() {
        return 0L;
    }

    @Override // vv2
    public final boolean b() {
        return false;
    }

    @Override // vv2
    public final boolean c() {
        d dVar = this.a.m1;
        if (dVar instanceof mu1) {
            return ((mu1) dVar).P7();
        }
        return false;
    }

    @Override // vv2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // vv2
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // vv2
    public final boolean f() {
        return false;
    }

    @Override // vv2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // vv2
    public final boolean h() {
        return true;
    }

    @Override // vv2
    public final boolean i() {
        return false;
    }

    @Override // vv2
    public final boolean j(int i) {
        d dVar = this.a.m1;
        if (!(dVar instanceof mu1) || !((mu1) dVar).I4()) {
            return false;
        }
        if (y6c.h(y6c.t0).p()) {
            return true;
        }
        return ((mu1) dVar).h() != null && l7c.D(((mu1) dVar).h());
    }

    @Override // vv2
    public final boolean n() {
        return false;
    }

    @Override // vv2
    public final void r(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = y6c.h(y6c.t0).f();
        Object tL_emojiStatusEmpty = f == null ? new TLRPC.TL_emojiStatusEmpty() : f.emoji_status;
        qx3 qx3Var = this.a;
        na7.q1(qx3Var.a).n5(emojiStatus, null);
        eu3 eu3Var = new eu3(this, tL_emojiStatusEmpty, (byte) 3);
        if (document != null) {
            new u21((FrameLayout) qx3Var.b, qx3Var.J0).r(document, k96.M0(2131745353, null), k96.M0(2131743646, null), eu3Var).j();
            return;
        }
        e21 e21Var = new e21(qx3Var.getContext(), qx3Var.J0);
        e21Var.b.setText(k96.M0(2131746094, null));
        e21Var.a.setImageResource(R.drawable.msg_settings_premium);
        k21 k21Var = new k21(qx3Var.J0, qx3Var.getContext(), true);
        k21Var.b = eu3Var;
        e21Var.setButton(k21Var);
        m21.f((FrameLayout) qx3Var.b, e21Var, 1500).j();
    }

    @Override // vv2
    public final boolean t() {
        return true;
    }

    @Override // vv2
    public final k27 w() {
        return null;
    }

    @Override // vv2
    public final boolean x() {
        return false;
    }

    @Override // vv2
    public final void y(TLRPC.Document document) {
        qx3 qx3Var = this.a;
        d dVar = qx3Var.m1;
        if (dVar instanceof mu1) {
            ((mu1) dVar).nb(document);
        }
        qx3Var.G0();
        qx3Var.dismiss();
    }

    @Override // vv2
    public final boolean z() {
        return false;
    }

    @Override // vv2
    public final void L() {
    }

    @Override // vv2
    public final void N() {
    }

    @Override // vv2
    public final void p() {
    }

    @Override // vv2
    public final void q() {
    }

    @Override // vv2
    public final void B(TLRPC.Document document) {
    }

    @Override // vv2
    public final void I(s3a s3aVar) {
    }

    @Override // vv2
    public final void Q(String str) {
    }

    @Override // vv2
    public final void l(String str) {
    }

    @Override // vv2
    public final void m(TLRPC.Document document) {
    }

    @Override // vv2
    public final void o(TLRPC.Document document) {
    }

    @Override // vv2
    public final void v(String str) {
    }

    @Override // vv2
    public final void J(Object obj, Object obj2) {
    }

    @Override // vv2
    public final void O(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // vv2
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // vv2
    public final void R(CharSequence charSequence, String str, pz1 pz1Var) {
    }

    @Override // vv2
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override // vv2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}

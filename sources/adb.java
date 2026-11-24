// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class adb implements fx2 {
    public final /* synthetic */ fdb a;

    public adb(fdb fdbVar) {
        this.a = fdbVar;
    }

    @Override // fx2
    public final void A(TLRPC.Document document) {
        fdb fdbVar = this.a;
        ddb ddbVar = fdbVar.c;
        if (ddbVar != null) {
            d parentFragment = ddbVar.getParentFragment();
            if (parentFragment instanceof yv1) {
                ((yv1) parentFragment).xb(document);
                fdbVar.c.setFieldText("");
            }
        }
    }

    @Override // fx2
    public final boolean B() {
        return false;
    }

    @Override // fx2
    public final boolean C(TLRPC.Document document) {
        if (this.a.E) {
            return false;
        }
        return z8c.h(z8c.t0).p();
    }

    @Override // fx2
    public final String E(boolean z) {
        return null;
    }

    @Override // fx2
    public final void G(TLRPC.Document document) {
        ddb ddbVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(k47.U(document));
        valueOf.setSpan(new gn(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!gm.g(valueOf) || (ddbVar = this.a.c) == null) {
            return;
        }
        c41.b0(ddbVar.getParentFragment()).i(jb6.M0(2131751121, null)).j();
    }

    @Override // fx2
    public final boolean H() {
        return false;
    }

    @Override // fx2
    public final bu5 I(ViewGroup viewGroup) {
        return null;
    }

    @Override // fx2
    public final boolean L() {
        return false;
    }

    @Override // fx2
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override // fx2
    public final Boolean S(TLRPC.Document document) {
        TLRPC.User f;
        if (this.a.F || !z8c.h(z8c.t0).p() || (f = z8c.h(z8c.t0).f()) == null) {
            return null;
        }
        Long i = m9c.i(f);
        return Boolean.valueOf(document != null && (i == null || i.longValue() != document.id));
    }

    @Override // fx2
    public final boolean T() {
        return true;
    }

    @Override // fx2
    public final long a() {
        return 0L;
    }

    @Override // fx2
    public final boolean b() {
        return false;
    }

    @Override // fx2
    public final boolean c() {
        ddb ddbVar = this.a.c;
        if (ddbVar == null) {
            return false;
        }
        d parentFragment = ddbVar.getParentFragment();
        if (parentFragment instanceof yv1) {
            return ((yv1) parentFragment).X7();
        }
        return false;
    }

    @Override // fx2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // fx2
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // fx2
    public final boolean f() {
        return false;
    }

    @Override // fx2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // fx2
    public final boolean h() {
        return true;
    }

    @Override // fx2
    public final boolean i() {
        return false;
    }

    @Override // fx2
    public final boolean j(int i) {
        ddb ddbVar = this.a.c;
        if (ddbVar == null) {
            return false;
        }
        d parentFragment = ddbVar.getParentFragment();
        if (!(parentFragment instanceof yv1)) {
            return false;
        }
        yv1 yv1Var = (yv1) parentFragment;
        if (!yv1Var.N4()) {
            return false;
        }
        if (z8c.h(z8c.t0).p()) {
            return true;
        }
        return yv1Var.h() != null && m9c.D(yv1Var.h());
    }

    @Override // fx2
    public final boolean n() {
        return false;
    }

    @Override // fx2
    public final void r(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        fdb fdbVar = this.a;
        ylb ylbVar = fdbVar.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = z8c.h(z8c.t0).f();
        Object tL_emojiStatusEmpty = f == null ? new TLRPC.TL_emojiStatusEmpty() : f.emoji_status;
        oc7.r1(fdbVar.a).p5(emojiStatus, null);
        b7b b7bVar = new b7b((Object) this, tL_emojiStatusEmpty, (byte) 6);
        ddb ddbVar = fdbVar.c;
        d parentFragment = ddbVar == null ? null : ddbVar.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                c41.b0(parentFragment).r(document, jb6.M0(2131745279, null), jb6.M0(2131743572, null), b7bVar).j();
                return;
            }
            m31 m31Var = new m31(fdbVar.getContext(), ylbVar);
            m31Var.b.setText(jb6.M0(2131746020, null));
            m31Var.a.setImageResource(R.drawable.msg_settings_premium);
            s31 s31Var = new s31(ylbVar, fdbVar.getContext(), true);
            s31Var.b = b7bVar;
            m31Var.setButton(s31Var);
            u31.g(parentFragment, m31Var, 1500).j();
        }
    }

    @Override // fx2
    public final boolean t() {
        return true;
    }

    @Override // fx2
    public final k47 x() {
        return null;
    }

    @Override // fx2
    public final boolean y() {
        return false;
    }

    @Override // fx2
    public final void D(TLRPC.Document document) {
    }

    @Override // fx2
    public final void J(t5a t5aVar) {
    }

    @Override // fx2
    public final void M() {
    }

    @Override // fx2
    public final void O() {
    }

    @Override // fx2
    public final void R(String str) {
    }

    @Override // fx2
    public final void l(String str) {
    }

    @Override // fx2
    public final void m(TLRPC.Document document) {
    }

    @Override // fx2
    public final void o(TLRPC.Document document) {
    }

    @Override // fx2
    public final void p() {
    }

    @Override // fx2
    public final void q() {
    }

    @Override // fx2
    public final void w(String str) {
    }

    @Override // fx2
    public final void K(Object obj, Object obj2) {
    }

    @Override // fx2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // fx2
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // fx2
    public final void z(CharSequence charSequence, String str, qy1 qy1Var) {
    }

    @Override // fx2
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override // fx2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}

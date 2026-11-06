package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class bu implements org.telegram.ui.is {
    public final /* synthetic */ qu a;

    public bu(qu quVar) {
        this.a = quVar;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ org.telegram.messenger.ij A() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final void C(TLRPC.Document document) {
        qu quVar = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = quVar.j1;
        if (f2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) f2Var).Cb(document);
        }
        quVar.L0();
        quVar.dismiss();
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean E(TLRPC.Document document) {
        return org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() && org.telegram.messenger.ij.I2(document);
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            qu quVar = this.a;
            org.telegram.messenger.camera.q.r(null, 2131751185, new hc((FrameLayout) quVar.b, quVar.I0));
        }
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || !org.telegram.messenger.ij.I2(document) || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.t10.h(f10);
        return Boolean.valueOf(document != null && (h == null || h.longValue() != document.id));
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.is
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean c() {
        org.telegram.ui.ActionBar.f2 f2Var = this.a.j1;
        if (f2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) f2Var).c();
        }
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean k(int i7) {
        qu quVar = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = quVar.j1;
        if (!(f2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) f2Var).S6()) {
            return false;
        }
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
            return true;
        }
        return ((org.telegram.ui.an) quVar.j1).j() != null && org.telegram.messenger.t10.B(((org.telegram.ui.an) quVar.j1).j());
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        qu quVar = this.a;
        org.telegram.messenger.qp.s1(quVar.a).h5(emojiStatus, null);
        fq fqVar = new fq(8, this, tL_emojiStatusEmpty);
        if (document != null) {
            new hc((FrameLayout) quVar.b, quVar.I0).r(document, org.telegram.messenger.hd.M0(2131745546, null), org.telegram.messenger.hd.M0(2131743886, null), fqVar).j();
            return;
        }
        ub ubVar = new ub(quVar.getContext(), quVar.I0);
        ubVar.b.setText(org.telegram.messenger.hd.M0(2131746286, null));
        ubVar.a.setImageResource(R.drawable.msg_settings_premium);
        ac acVar = new ac(quVar.getContext(), quVar.I0, true);
        acVar.b = fqVar;
        ubVar.setButton(acVar);
        cc.f((FrameLayout) quVar.b, ubVar, 1500).j();
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void i(org.telegram.messenger.zy zyVar) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.is
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void u(CharSequence charSequence, String str, ex exVar) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}

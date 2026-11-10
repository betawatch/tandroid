package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bu implements org.telegram.ui.ls {
    public final /* synthetic */ qu a;

    public bu(qu quVar) {
        this.a = quVar;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.messenger.ij A() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void C(TLRPC.Document document) {
        qu quVar = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = quVar.m1;
        if (f2Var instanceof org.telegram.ui.cn) {
            ((org.telegram.ui.cn) f2Var).Fb(document);
        }
        quVar.L0();
        quVar.dismiss();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean E(TLRPC.Document document) {
        return org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() && org.telegram.messenger.ij.H2(document);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new q5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            qu quVar = this.a;
            org.telegram.messenger.camera.q.r(null, 2131751184, new gc((FrameLayout) quVar.b, quVar.I0));
        }
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || !org.telegram.messenger.ij.H2(document) || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.t10.h(f10);
        return Boolean.valueOf(document != null && (h == null || h.longValue() != document.id));
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ls
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean c() {
        org.telegram.ui.ActionBar.f2 f2Var = this.a.m1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) f2Var).c();
        }
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean k(int i7) {
        qu quVar = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = quVar.m1;
        if (!(f2Var instanceof org.telegram.ui.cn) || !((org.telegram.ui.cn) f2Var).T6()) {
            return false;
        }
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
            return true;
        }
        return ((org.telegram.ui.cn) quVar.m1).j() != null && org.telegram.messenger.t10.B(((org.telegram.ui.cn) quVar.m1).j());
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ls
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
        ro roVar = new ro(9, this, tL_emojiStatusEmpty);
        if (document != null) {
            new gc((FrameLayout) quVar.b, quVar.I0).r(document, org.telegram.messenger.id.M0(2131745545, null), org.telegram.messenger.id.M0(2131743885, null), roVar).j();
            return;
        }
        tb tbVar = new tb(quVar.getContext(), quVar.I0);
        tbVar.b.setText(org.telegram.messenger.id.M0(2131746287, null));
        tbVar.a.setImageResource(R.drawable.msg_settings_premium);
        zb zbVar = new zb(quVar.getContext(), quVar.I0, true);
        zbVar.b = roVar;
        tbVar.setButton(zbVar);
        bc.f((FrameLayout) quVar.b, tbVar, 1500).j();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void i(org.telegram.messenger.zy zyVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ls
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void u(CharSequence charSequence, String str, ex exVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}

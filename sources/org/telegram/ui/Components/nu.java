package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nu implements org.telegram.ui.jt {
    public final /* synthetic */ cv a;

    public nu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // org.telegram.ui.jt
    public final void A(TLRPC.Document document) {
        cv cvVar = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = cvVar.j1;
        if (k2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) k2Var).sb(document);
        }
        cvVar.L0();
        cvVar.dismiss();
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean C(TLRPC.Document document) {
        return org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() && org.telegram.messenger.jj.H2(document);
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ z60 D(fg.i iVar) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.jj.U(document));
        valueOf.setSpan(new o5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.i0.g(valueOf)) {
            cv cvVar = this.a;
            org.telegram.messenger.z20.r(null, 2131751185, new cc((FrameLayout) cvVar.b, cvVar.I0));
        }
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f7;
        if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() || !org.telegram.messenger.jj.H2(document) || (f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.h20.h(f7);
        return Boolean.valueOf(document != null && (h == null || h.longValue() != document.id));
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.jt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean c() {
        org.telegram.ui.ActionBar.k2 k2Var = this.a.j1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).c();
        }
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean k(int i10) {
        cv cvVar = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = cvVar.j1;
        if (!(k2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) k2Var).M6()) {
            return false;
        }
        if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q()) {
            return true;
        }
        return ((org.telegram.ui.un) cvVar.j1).j() != null && org.telegram.messenger.h20.B(((org.telegram.ui.un) cvVar.j1).j());
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f();
        Object tL_emojiStatusEmpty = f7 == null ? new TLRPC.TL_emojiStatusEmpty() : f7.emoji_status;
        cv cvVar = this.a;
        org.telegram.messenger.vp.r1(cvVar.a).e5(emojiStatus, null);
        at atVar = new at(2, this, tL_emojiStatusEmpty);
        if (document != null) {
            new cc((FrameLayout) cvVar.b, cvVar.I0).r(document, org.telegram.messenger.cd.L0(2131745562, null), org.telegram.messenger.cd.L0(2131743910, null), atVar).j();
            return;
        }
        ob obVar = new ob(cvVar.getContext(), cvVar.I0);
        obVar.b.setText(org.telegram.messenger.cd.L0(2131746302, null));
        obVar.a.setImageResource(R.drawable.msg_settings_premium);
        ub ubVar = new ub(cvVar.getContext(), cvVar.I0, true);
        ubVar.b = atVar;
        obVar.setButton(ubVar);
        wb.f((FrameLayout) cvVar.b, obVar, 1500).j();
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ org.telegram.messenger.jj y() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void i(org.telegram.messenger.jz jzVar) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.jt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}

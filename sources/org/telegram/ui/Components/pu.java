package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class pu implements org.telegram.ui.ls {
    public final /* synthetic */ ev a;

    public pu(ev evVar) {
        this.a = evVar;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void B(TLRPC.Document document) {
        ev evVar = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
        if (g2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) g2Var).Gb(document);
        }
        evVar.M0();
        evVar.dismiss();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean D(TLRPC.Document document) {
        return org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).q() && org.telegram.messenger.gj.H2(document);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ a70 E(ai.l0 l0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.gj.U(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ev evVar = this.a;
            org.telegram.messenger.o10.t(null, 2131751172, new lc((FrameLayout) evVar.b, evVar.J0));
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
        if (!org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).q() || !org.telegram.messenger.gj.H2(document) || (f10 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.p10.i(f10);
        return Boolean.valueOf(document != null && (i7 == null || i7.longValue() != document.id));
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
        org.telegram.ui.ActionBar.g2 g2Var = this.a.n1;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).c();
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
        ev evVar = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
        if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).T6()) {
            return false;
        }
        if (org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).q()) {
            return true;
        }
        return ((org.telegram.ui.bn) evVar.n1).j() != null && org.telegram.messenger.p10.C(((org.telegram.ui.bn) evVar.n1).j());
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        ev evVar = this.a;
        org.telegram.messenger.np.u1(evVar.a).t5(emojiStatus, null);
        ou ouVar = new ou(0, this, tL_emojiStatusEmpty);
        if (document != null) {
            new lc((FrameLayout) evVar.b, evVar.J0).r(document, org.telegram.messenger.hd.N0(2131745349, null), org.telegram.messenger.hd.N0(2131743640, null), ouVar).j();
            return;
        }
        yb ybVar = new yb(evVar.getContext(), evVar.J0);
        ybVar.b.setText(org.telegram.messenger.hd.N0(2131746091, null));
        ybVar.a.setImageResource(R.drawable.msg_settings_premium);
        ec ecVar = new ec(evVar.getContext(), evVar.J0, true);
        ecVar.b = ouVar;
        ybVar.setButton(ecVar);
        gc.f((FrameLayout) evVar.b, ybVar, 1500).j();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.messenger.gj z() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void i(org.telegram.messenger.ty tyVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ls
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void y(CharSequence charSequence, String str, rh rhVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}

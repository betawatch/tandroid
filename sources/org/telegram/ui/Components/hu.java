package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hu implements org.telegram.ui.ls {
    public final /* synthetic */ wu a;

    public hu(wu wuVar) {
        this.a = wuVar;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void B(TLRPC.Document document) {
        wu wuVar = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
        if (e2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) e2Var).Gb(document);
        }
        wuVar.L0();
        wuVar.dismiss();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean D(TLRPC.Document document) {
        return org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q() && org.telegram.messenger.gj.H2(document);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ m60 E(ai.k0 k0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.gj.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            wu wuVar = this.a;
            org.telegram.messenger.i20.s(null, 2131751184, new cc((FrameLayout) wuVar.b, wuVar.J0));
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
        if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q() || !org.telegram.messenger.gj.H2(document) || (f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.q10.h(f10);
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
        org.telegram.ui.ActionBar.e2 e2Var = this.a.n1;
        if (e2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) e2Var).c();
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
        wu wuVar = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
        if (!(e2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) e2Var).T6()) {
            return false;
        }
        if (org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q()) {
            return true;
        }
        return ((org.telegram.ui.an) wuVar.n1).j() != null && org.telegram.messenger.q10.B(((org.telegram.ui.an) wuVar.n1).j());
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
        TLRPC.User f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        wu wuVar = this.a;
        org.telegram.messenger.np.s1(wuVar.a).i5(emojiStatus, null);
        vs vsVar = new vs(2, this, tL_emojiStatusEmpty);
        if (document != null) {
            new cc((FrameLayout) wuVar.b, wuVar.J0).r(document, org.telegram.messenger.hd.M0(2131745545, null), org.telegram.messenger.hd.M0(2131743885, null), vsVar).j();
            return;
        }
        pb pbVar = new pb(wuVar.getContext(), wuVar.J0);
        pbVar.b.setText(org.telegram.messenger.hd.M0(2131746287, null));
        pbVar.a.setImageResource(R.drawable.msg_settings_premium);
        vb vbVar = new vb(wuVar.getContext(), wuVar.J0, true);
        vbVar.b = vsVar;
        pbVar.setButton(vbVar);
        xb.f((FrameLayout) wuVar.b, pbVar, 1500).j();
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
    public final /* synthetic */ void i(org.telegram.messenger.xy xyVar) {
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
    public final /* synthetic */ void y(CharSequence charSequence, String str, gh ghVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}

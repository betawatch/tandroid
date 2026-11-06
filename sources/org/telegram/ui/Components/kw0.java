package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class kw0 implements org.telegram.ui.is {
    public final /* synthetic */ ow0 a;

    public kw0(ow0 ow0Var) {
        this.a = ow0Var;
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
        ow0 ow0Var = this.a;
        mw0 mw0Var = ow0Var.c;
        if (mw0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = mw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) parentFragment).Cb(document);
            ow0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean E(TLRPC.Document document) {
        if (this.a.D) {
            return false;
        }
        return org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q();
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final void H(TLRPC.Document document) {
        mw0 mw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!org.telegram.messenger.g0.g(valueOf) || (mw0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.camera.q.r(null, 2131751185, hc.a0(mw0Var.getParentFragment()));
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
        if (this.a.E || !org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f()) == null) {
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
        mw0 mw0Var = this.a.c;
        if (mw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = mw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) parentFragment).c();
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
        mw0 mw0Var = this.a.c;
        if (mw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = mw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.an) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) parentFragment;
            if (anVar.S6()) {
                if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
                    return true;
                }
                if (anVar.j() != null && org.telegram.messenger.t10.B(anVar.j())) {
                    return true;
                }
            }
        }
        return false;
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
        ow0 ow0Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = ow0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.qp.s1(ow0Var.a).h5(emojiStatus, null);
        v80 v80Var = new v80(20, this, tL_emojiStatusEmpty);
        mw0 mw0Var = ow0Var.c;
        org.telegram.ui.ActionBar.f2 parentFragment = mw0Var == null ? null : mw0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                hc.a0(parentFragment).r(document, org.telegram.messenger.hd.M0(2131745546, null), org.telegram.messenger.hd.M0(2131743886, null), v80Var).j();
                return;
            }
            ub ubVar = new ub(ow0Var.getContext(), f6Var);
            ubVar.b.setText(org.telegram.messenger.hd.M0(2131746286, null));
            ubVar.a.setImageResource(R.drawable.msg_settings_premium);
            ac acVar = new ac(ow0Var.getContext(), f6Var, true);
            acVar.b = v80Var;
            ubVar.setButton(acVar);
            cc.g(parentFragment, ubVar, 1500).j();
        }
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

package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lw0 implements org.telegram.ui.ks {
    public final /* synthetic */ pw0 a;

    public lw0(pw0 pw0Var) {
        this.a = pw0Var;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ org.telegram.messenger.ij A() {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final void C(TLRPC.Document document) {
        pw0 pw0Var = this.a;
        nw0 nw0Var = pw0Var.c;
        if (nw0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = nw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.cn) {
            ((org.telegram.ui.cn) parentFragment).Fb(document);
            pw0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final boolean E(TLRPC.Document document) {
        if (this.a.D) {
            return false;
        }
        return org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q();
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final void H(TLRPC.Document document) {
        nw0 nw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!org.telegram.messenger.g0.g(valueOf) || (nw0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.camera.q.r(null, 2131751184, hc.a0(nw0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        if (this.a.E || !org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.t10.h(f10);
        return Boolean.valueOf(document != null && (h == null || h.longValue() != document.id));
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ks
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ks
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final boolean c() {
        nw0 nw0Var = this.a.c;
        if (nw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = nw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final boolean k(int i7) {
        nw0 nw0Var = this.a.c;
        if (nw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = nw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) parentFragment;
            if (cnVar.T6()) {
                if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
                    return true;
                }
                if (cnVar.j() != null && org.telegram.messenger.t10.B(cnVar.j())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ l60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        pw0 pw0Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = pw0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.qp.s1(pw0Var.a).h5(emojiStatus, null);
        w80 w80Var = new w80(20, this, tL_emojiStatusEmpty);
        nw0 nw0Var = pw0Var.c;
        org.telegram.ui.ActionBar.f2 parentFragment = nw0Var == null ? null : nw0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                hc.a0(parentFragment).r(document, org.telegram.messenger.id.M0(2131745545, null), org.telegram.messenger.id.M0(2131743885, null), w80Var).j();
                return;
            }
            ub ubVar = new ub(pw0Var.getContext(), g6Var);
            ubVar.b.setText(org.telegram.messenger.id.M0(2131746287, null));
            ubVar.a.setImageResource(R.drawable.msg_settings_premium);
            ac acVar = new ac(pw0Var.getContext(), g6Var, true);
            acVar.b = w80Var;
            ubVar.setButton(acVar);
            cc.g(parentFragment, ubVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void i(org.telegram.messenger.zy zyVar) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ks
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void u(CharSequence charSequence, String str, fx fxVar) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}

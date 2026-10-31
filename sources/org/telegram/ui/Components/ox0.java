package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ox0 implements org.telegram.ui.jt {
    public final /* synthetic */ sx0 a;

    public ox0(sx0 sx0Var) {
        this.a = sx0Var;
    }

    @Override // org.telegram.ui.jt
    public final void A(TLRPC.Document document) {
        sx0 sx0Var = this.a;
        qx0 qx0Var = sx0Var.c;
        if (qx0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 parentFragment = qx0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) parentFragment).sb(document);
            sx0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean C(TLRPC.Document document) {
        if (this.a.D) {
            return false;
        }
        return org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q();
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
        qx0 qx0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.jj.U(document));
        valueOf.setSpan(new o5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!org.telegram.messenger.i0.g(valueOf) || (qx0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.z20.r(null, 2131751185, cc.a0(qx0Var.getParentFragment()));
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
        if (this.a.E || !org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() || (f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f()) == null) {
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
        qx0 qx0Var = this.a.c;
        if (qx0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 parentFragment = qx0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) parentFragment).c();
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
        qx0 qx0Var = this.a.c;
        if (qx0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 parentFragment = qx0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.un) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) parentFragment;
            if (unVar.M6()) {
                if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q()) {
                    return true;
                }
                if (unVar.j() != null && org.telegram.messenger.h20.B(unVar.j())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        sx0 sx0Var = this.a;
        org.telegram.ui.ActionBar.p6 p6Var = sx0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f();
        Object tL_emojiStatusEmpty = f7 == null ? new TLRPC.TL_emojiStatusEmpty() : f7.emoji_status;
        org.telegram.messenger.vp.r1(sx0Var.a).e5(emojiStatus, null);
        gi0 gi0Var = new gi0(14, this, tL_emojiStatusEmpty);
        qx0 qx0Var = sx0Var.c;
        org.telegram.ui.ActionBar.k2 parentFragment = qx0Var == null ? null : qx0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                cc.a0(parentFragment).r(document, org.telegram.messenger.cd.L0(2131745562, null), org.telegram.messenger.cd.L0(2131743910, null), gi0Var).j();
                return;
            }
            ob obVar = new ob(sx0Var.getContext(), p6Var);
            obVar.b.setText(org.telegram.messenger.cd.L0(2131746302, null));
            obVar.a.setImageResource(R.drawable.msg_settings_premium);
            ub ubVar = new ub(sx0Var.getContext(), p6Var, true);
            ubVar.b = gi0Var;
            obVar.setButton(ubVar);
            wb.g(parentFragment, obVar, 1500).j();
        }
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

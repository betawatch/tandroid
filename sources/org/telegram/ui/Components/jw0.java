package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jw0 implements org.telegram.ui.gs {
    public final /* synthetic */ ow0 a;

    public jw0(ow0 ow0Var) {
        this.a = ow0Var;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void B(TLRPC.Document document) {
        ow0 ow0Var = this.a;
        mw0 mw0Var = ow0Var.c;
        if (mw0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 parentFragment = mw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wm) {
            ((org.telegram.ui.wm) parentFragment).Cb(document);
            ow0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean D(TLRPC.Document document) {
        if (this.a.E) {
            return false;
        }
        return org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q();
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final void G(TLRPC.Document document) {
        mw0 mw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.zi.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!org.telegram.messenger.g0.g(valueOf) || (mw0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.camera.q.r(null, 2131751185, fc.a0(mw0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        if (this.a.F || !org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q() || (f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.l10.h(f10);
        return Boolean.valueOf(document != null && (h == null || h.longValue() != document.id));
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.gs
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean c() {
        mw0 mw0Var = this.a.c;
        if (mw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.d2 parentFragment = mw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean k(int i3) {
        mw0 mw0Var = this.a.c;
        if (mw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.d2 parentFragment = mw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wm) {
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) parentFragment;
            if (wmVar.S6()) {
                if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q()) {
                    return true;
                }
                if (wmVar.j() != null && org.telegram.messenger.l10.B(wmVar.j())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        ow0 ow0Var = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = ow0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.hp.s1(ow0Var.a).h5(emojiStatus, null);
        j50 j50Var = new j50(25, this, tL_emojiStatusEmpty);
        mw0 mw0Var = ow0Var.c;
        org.telegram.ui.ActionBar.d2 parentFragment = mw0Var == null ? null : mw0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                fc.a0(parentFragment).r(document, org.telegram.messenger.bd.M0(2131745555, null), org.telegram.messenger.bd.M0(2131743895, null), j50Var).j();
                return;
            }
            sb sbVar = new sb(ow0Var.getContext(), e6Var);
            sbVar.b.setText(org.telegram.messenger.bd.M0(2131746295, null));
            sbVar.a.setImageResource(R.drawable.msg_settings_premium);
            yb ybVar = new yb(ow0Var.getContext(), e6Var, true);
            ybVar.b = j50Var;
            sbVar.setButton(ybVar);
            ac.g(parentFragment, sbVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ org.telegram.messenger.zi z() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void i(org.telegram.messenger.ry ryVar) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.gs
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void K(CharSequence charSequence, String str, ei eiVar) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}

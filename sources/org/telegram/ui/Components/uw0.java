package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class uw0 implements org.telegram.ui.ls {
    public final /* synthetic */ yw0 a;

    public uw0(yw0 yw0Var) {
        this.a = yw0Var;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void B(TLRPC.Document document) {
        yw0 yw0Var = this.a;
        ww0 ww0Var = yw0Var.c;
        if (ww0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.h2 parentFragment = ww0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) parentFragment).Gb(document);
            yw0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean D(TLRPC.Document document) {
        if (this.a.E) {
            return false;
        }
        return org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ y60 E(ai.k0 k0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void H(TLRPC.Document document) {
        ww0 ww0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!org.telegram.messenger.g0.g(valueOf) || (ww0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.n10.t(null, 2131751173, lc.b0(ww0Var.getParentFragment()));
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
        if (this.a.F || !org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q() || (f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.o10.i(f10);
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
        ww0 ww0Var = this.a.c;
        if (ww0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.h2 parentFragment = ww0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) parentFragment).c();
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
        ww0 ww0Var = this.a.c;
        if (ww0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.h2 parentFragment = ww0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) parentFragment;
            if (bnVar.T6()) {
                if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q()) {
                    return true;
                }
                if (bnVar.j() != null && org.telegram.messenger.o10.C(bnVar.j())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        yw0 yw0Var = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = yw0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.mp.u1(yw0Var.a).t5(emojiStatus, null);
        hn0 hn0Var = new hn0(10, this, tL_emojiStatusEmpty);
        ww0 ww0Var = yw0Var.c;
        org.telegram.ui.ActionBar.h2 parentFragment = ww0Var == null ? null : ww0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                lc.b0(parentFragment).r(document, org.telegram.messenger.gd.M0(2131745350, null), org.telegram.messenger.gd.M0(2131743648, null), hn0Var).j();
                return;
            }
            yb ybVar = new yb(yw0Var.getContext(), i6Var);
            ybVar.b.setText(org.telegram.messenger.gd.M0(2131746092, null));
            ybVar.a.setImageResource(R.drawable.msg_settings_premium);
            ec ecVar = new ec(yw0Var.getContext(), i6Var, true);
            ecVar.b = hn0Var;
            ybVar.setButton(ecVar);
            gc.g(parentFragment, ybVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.messenger.fj z() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void i(org.telegram.messenger.sy syVar) {
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
    public final /* synthetic */ void y(CharSequence charSequence, String str, ph phVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}

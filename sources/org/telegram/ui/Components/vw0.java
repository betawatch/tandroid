package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vw0 implements org.telegram.ui.ls {
    public final /* synthetic */ zw0 a;

    public vw0(zw0 zw0Var) {
        this.a = zw0Var;
    }

    @Override // org.telegram.ui.ls
    public final void A(TLRPC.Document document) {
        zw0 zw0Var = this.a;
        xw0 xw0Var = zw0Var.c;
        if (xw0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.g2 parentFragment = xw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) parentFragment).Gb(document);
            zw0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean C(TLRPC.Document document) {
        if (this.a.E) {
            return false;
        }
        return org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ x60 D(ai.h0 h0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void G(TLRPC.Document document) {
        xw0 xw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!org.telegram.messenger.g0.g(valueOf) || (xw0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.m10.t(null, 2131751172, kc.b0(xw0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        if (this.a.F || !org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q() || (f10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.n10.i(f10);
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
        xw0 xw0Var = this.a.c;
        if (xw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 parentFragment = xw0Var.getParentFragment();
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
        xw0 xw0Var = this.a.c;
        if (xw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 parentFragment = xw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) parentFragment;
            if (bnVar.T6()) {
                if (org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q()) {
                    return true;
                }
                if (bnVar.j() != null && org.telegram.messenger.n10.C(bnVar.j())) {
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
        zw0 zw0Var = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = zw0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.mp.u1(zw0Var.a).t5(emojiStatus, null);
        sh0 sh0Var = new sh0(14, this, tL_emojiStatusEmpty);
        xw0 xw0Var = zw0Var.c;
        org.telegram.ui.ActionBar.g2 parentFragment = xw0Var == null ? null : xw0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                kc.b0(parentFragment).r(document, org.telegram.messenger.gd.N0(2131745349, null), org.telegram.messenger.gd.N0(2131743638, null), sh0Var).j();
                return;
            }
            xb xbVar = new xb(zw0Var.getContext(), i6Var);
            xbVar.b.setText(org.telegram.messenger.gd.N0(2131746091, null));
            xbVar.a.setImageResource(R.drawable.msg_settings_premium);
            dc dcVar = new dc(zw0Var.getContext(), i6Var, true);
            dcVar.b = sh0Var;
            xbVar.setButton(dcVar);
            fc.g(parentFragment, xbVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.messenger.fj y() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void E(TLRPC.Document document) {
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
    public final /* synthetic */ void J() {
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
    public final /* synthetic */ void K(CharSequence charSequence, String str, ph phVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}

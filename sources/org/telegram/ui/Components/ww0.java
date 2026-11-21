package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ww0 implements org.telegram.ui.ls {
    public final /* synthetic */ ax0 a;

    public ww0(ax0 ax0Var) {
        this.a = ax0Var;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void B(TLRPC.Document document) {
        ax0 ax0Var = this.a;
        yw0 yw0Var = ax0Var.c;
        if (yw0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.g2 parentFragment = yw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) parentFragment).Gb(document);
            ax0Var.c.setFieldText("");
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
    public final /* synthetic */ a70 E(ai.l0 l0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void H(TLRPC.Document document) {
        yw0 yw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!org.telegram.messenger.g0.g(valueOf) || (yw0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.n10.t(null, 2131751172, lc.b0(yw0Var.getParentFragment()));
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
        yw0 yw0Var = this.a.c;
        if (yw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 parentFragment = yw0Var.getParentFragment();
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
        yw0 yw0Var = this.a.c;
        if (yw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 parentFragment = yw0Var.getParentFragment();
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
        ax0 ax0Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = ax0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.mp.u1(ax0Var.a).t5(emojiStatus, null);
        fm0 fm0Var = new fm0(12, this, tL_emojiStatusEmpty);
        yw0 yw0Var = ax0Var.c;
        org.telegram.ui.ActionBar.g2 parentFragment = yw0Var == null ? null : yw0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                lc.b0(parentFragment).r(document, org.telegram.messenger.gd.N0(2131745349, null), org.telegram.messenger.gd.N0(2131743642, null), fm0Var).j();
                return;
            }
            yb ybVar = new yb(ax0Var.getContext(), h6Var);
            ybVar.b.setText(org.telegram.messenger.gd.N0(2131746091, null));
            ybVar.a.setImageResource(R.drawable.msg_settings_premium);
            ec ecVar = new ec(ax0Var.getContext(), h6Var, true);
            ecVar.b = fm0Var;
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
    public final /* synthetic */ void y(CharSequence charSequence, String str, rh rhVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}

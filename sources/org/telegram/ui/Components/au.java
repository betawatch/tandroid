package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class au implements org.telegram.ui.gs {
    public final /* synthetic */ pu a;

    public au(pu puVar) {
        this.a = puVar;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void B(TLRPC.Document document) {
        pu puVar = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
        if (d2Var instanceof org.telegram.ui.wm) {
            ((org.telegram.ui.wm) d2Var).Cb(document);
        }
        puVar.L0();
        puVar.dismiss();
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean D(TLRPC.Document document) {
        return org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q() && org.telegram.messenger.zi.I2(document);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.zi.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            pu puVar = this.a;
            org.telegram.messenger.camera.q.r(null, 2131751185, new fc((FrameLayout) puVar.b, puVar.J0));
        }
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
        if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q() || !org.telegram.messenger.zi.I2(document) || (f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f()) == null) {
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
        org.telegram.ui.ActionBar.d2 d2Var = this.a.k1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) d2Var).c();
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
        pu puVar = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
        if (!(d2Var instanceof org.telegram.ui.wm) || !((org.telegram.ui.wm) d2Var).S6()) {
            return false;
        }
        if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q()) {
            return true;
        }
        return ((org.telegram.ui.wm) puVar.k1).j() != null && org.telegram.messenger.l10.B(((org.telegram.ui.wm) puVar.k1).j());
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
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        pu puVar = this.a;
        org.telegram.messenger.hp.s1(puVar.a).h5(emojiStatus, null);
        cl clVar = new cl(13, this, tL_emojiStatusEmpty);
        if (document != null) {
            new fc((FrameLayout) puVar.b, puVar.J0).r(document, org.telegram.messenger.bd.M0(2131745555, null), org.telegram.messenger.bd.M0(2131743895, null), clVar).j();
            return;
        }
        sb sbVar = new sb(puVar.getContext(), puVar.J0);
        sbVar.b.setText(org.telegram.messenger.bd.M0(2131746295, null));
        sbVar.a.setImageResource(R.drawable.msg_settings_premium);
        yb ybVar = new yb(puVar.getContext(), puVar.J0, true);
        ybVar.b = clVar;
        sbVar.setButton(ybVar);
        ac.f((FrameLayout) puVar.b, sbVar, 1500).j();
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

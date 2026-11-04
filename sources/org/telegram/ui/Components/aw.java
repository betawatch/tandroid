package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class aw implements org.telegram.ui.gs {
    public final /* synthetic */ ey a;

    public aw(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.d2 d2Var = this.a.Z1;
        if (d2Var instanceof org.telegram.ui.wm) {
            ((org.telegram.ui.wm) d2Var).Cb(document);
        }
    }

    @Override // org.telegram.ui.gs
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.li.a0(document, "").document;
        ConnectionsManager.getInstance(this.a.d1).sendRequest(tL_stickers_removeStickerFromSet, new w1(this, 3));
    }

    @Override // org.telegram.ui.gs
    public final String F(boolean z10) {
        ey eyVar = this.a;
        if (z10) {
            u4.h0 adapter = eyVar.i0.getAdapter();
            jx jxVar = eyVar.k0;
            if (adapter == jxVar) {
                return jxVar.x;
            }
            return null;
        }
        u4.h0 adapter2 = eyVar.Q.getAdapter();
        ex exVar = eyVar.T;
        if (adapter2 == exVar) {
            return exVar.w;
        }
        return null;
    }

    @Override // org.telegram.ui.gs
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.zi.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ey eyVar = this.a;
            org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
            org.telegram.messenger.camera.q.r(null, 2131751185, d2Var != null ? fc.a0(d2Var) : new fc(eyVar.r, eyVar.a2));
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
    public final void L() {
        this.a.W();
    }

    @Override // org.telegram.ui.gs
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.u1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.gs
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList arrayList = org.telegram.messenger.i6.i;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.gs
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q() || (f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f()) == null) {
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
        return this.a.u1.a();
    }

    @Override // org.telegram.ui.gs
    public final boolean b() {
        return this.a.u1.b();
    }

    @Override // org.telegram.ui.gs
    public final boolean c() {
        return this.a.u1.c();
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final boolean e(TLRPC.Document document) {
        return this.a.u1.j();
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
        ey eyVar = this.a;
        return (eyVar.Z1 == null && eyVar.v0) ? false : true;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean k(int i3) {
        if (i3 != 2) {
            return true;
        }
        ey eyVar = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
        if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).S6()) {
            return org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q() || (((org.telegram.ui.wm) eyVar.Z1).j() != null && org.telegram.messenger.l10.B(((org.telegram.ui.wm) eyVar.Z1).j()));
        }
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
        this.a.u1.m(null, document, str, obj, null, z10, i3);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final void o(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i3 = 0;
        while (true) {
            if (i3 >= document.attributes.size()) {
                inputStickerSet = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                break;
            } else {
                i3++;
            }
        }
        ey eyVar = this.a;
        xv0.M0(eyVar.Z1, org.telegram.messenger.li.b0(eyVar.d1).m0(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void q(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.id;
            HashMap hashMap = org.telegram.messenger.i6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.i6.i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.i6.a(org.telegram.messenger.i6.o[0]);
            }
            ow owVar = this.a.S;
            if (owVar != null) {
                owVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.gs
    public final void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
        ey eyVar = this.a;
        jv jvVar = eyVar.i0;
        if (jvVar.getAdapter() == eyVar.o0) {
            eyVar.u1.v(null, tLObject, null, obj, z10, i3, i10);
        } else if (jvVar.getAdapter() == eyVar.k0) {
            eyVar.u1.v(null, tLObject, null, obj, z10, i3, i10);
        }
    }

    @Override // org.telegram.ui.gs
    public final void t() {
        rw rwVar = this.a.Q;
        if (rwVar == null || rwVar.m3 == null) {
            return;
        }
        while (rwVar.m3.size() > 0) {
            qw qwVar = (qw) rwVar.m3.valueAt(0);
            rwVar.m3.removeAt(0);
            if (qwVar != null) {
                View view = qwVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    qwVar.d.getBackground().setState(new int[0]);
                }
                View view2 = qwVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.gs
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        ey eyVar = this.a;
        FrameLayout frameLayout = eyVar.r;
        org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.hp.s1(eyVar.d1).h5(emojiStatus, null);
        cl clVar = new cl(14, this, tL_emojiStatusEmpty);
        if (document != null) {
            (d2Var != null ? fc.a0(d2Var) : new fc(frameLayout, e6Var)).r(document, org.telegram.messenger.bd.M0(2131745555, null), org.telegram.messenger.bd.M0(2131743895, null), clVar).j();
            return;
        }
        sb sbVar = new sb(eyVar.getContext(), e6Var);
        sbVar.b.setText(org.telegram.messenger.bd.M0(2131746295, null));
        ImageView imageView = sbVar.a;
        imageView.setImageResource(R.drawable.msg_settings_premium);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.z9, e6Var, PorterDuff.Mode.MULTIPLY);
        yb ybVar = new yb(eyVar.getContext(), e6Var, true);
        ybVar.b = clVar;
        sbVar.setButton(ybVar);
        if (d2Var != null) {
            ac.g(d2Var, sbVar, 1500).j();
        } else {
            ac.f(frameLayout, sbVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.gs
    public final void w(TLObject tLObject, Object obj) {
        ey eyVar = this.a;
        jv jvVar = eyVar.i0;
        if (jvVar.getAdapter() == eyVar.o0 || jvVar.getAdapter() == eyVar.k0) {
            eyVar.u1.e(tLObject, obj);
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
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void i(org.telegram.messenger.ry ryVar) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void K(CharSequence charSequence, String str, ei eiVar) {
    }
}

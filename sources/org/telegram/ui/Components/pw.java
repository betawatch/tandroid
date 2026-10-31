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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pw implements org.telegram.ui.jt {
    public final /* synthetic */ vy a;

    public pw(vy vyVar) {
        this.a = vyVar;
    }

    @Override // org.telegram.ui.jt
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.k2 k2Var = this.a.Y1;
        if (k2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) k2Var).sb(document);
        }
    }

    @Override // org.telegram.ui.jt
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ z60 D(fg.i iVar) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ui.a0(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new x1(this, 3));
    }

    @Override // org.telegram.ui.jt
    public final String F(boolean z10) {
        vy vyVar = this.a;
        if (z10) {
            s4.g0 adapter = vyVar.h0.getAdapter();
            zx zxVar = vyVar.j0;
            if (adapter == zxVar) {
                return zxVar.x;
            }
            return null;
        }
        s4.g0 adapter2 = vyVar.P.getAdapter();
        ux uxVar = vyVar.S;
        if (adapter2 == uxVar) {
            return uxVar.w;
        }
        return null;
    }

    @Override // org.telegram.ui.jt
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.jj.U(document));
        valueOf.setSpan(new o5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.i0.g(valueOf)) {
            vy vyVar = this.a;
            org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
            org.telegram.messenger.z20.r(null, 2131751185, k2Var != null ? cc.a0(k2Var) : new cc(vyVar.r, vyVar.Z1));
        }
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
    public final void K() {
        this.a.X();
    }

    @Override // org.telegram.ui.jt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.jt
    public final boolean M(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList arrayList = org.telegram.messenger.k6.i;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.jt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f7;
        if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() || (f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f()) == null) {
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
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.jt
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.jt
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
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
        vy vyVar = this.a;
        return (vyVar.Y1 == null && vyVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        vy vyVar = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
        if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).M6()) {
            return org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() || (((org.telegram.ui.un) vyVar.Y1).j() != null && org.telegram.messenger.h20.B(((org.telegram.ui.un) vyVar.Y1).j()));
        }
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.jt
    public final void n(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10 = 0;
        while (true) {
            if (i10 >= document.attributes.size()) {
                inputStickerSet = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                break;
            } else {
                i10++;
            }
        }
        vy vyVar = this.a;
        cx0.M0(vyVar.Y1, org.telegram.messenger.ui.b0(vyVar.c1).m0(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void p(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.id;
            HashMap hashMap = org.telegram.messenger.k6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.k6.i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.k6.a(org.telegram.messenger.k6.o[0]);
            }
            ex exVar = this.a.R;
            if (exVar != null) {
                exVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.jt
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        vy vyVar = this.a;
        wv wvVar = vyVar.h0;
        if (wvVar.getAdapter() == vyVar.n0) {
            vyVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (wvVar.getAdapter() == vyVar.j0) {
            vyVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.jt
    public final void s() {
        hx hxVar = this.a.P;
        if (hxVar == null || hxVar.l3 == null) {
            return;
        }
        while (hxVar.l3.size() > 0) {
            gx gxVar = (gx) hxVar.l3.valueAt(0);
            hxVar.l3.removeAt(0);
            if (gxVar != null) {
                View view = gxVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    gxVar.d.getBackground().setState(new int[0]);
                }
                View view2 = gxVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.jt
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        vy vyVar = this.a;
        FrameLayout frameLayout = vyVar.r;
        org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f();
        Object tL_emojiStatusEmpty = f7 == null ? new TLRPC.TL_emojiStatusEmpty() : f7.emoji_status;
        org.telegram.messenger.vp.r1(vyVar.c1).e5(emojiStatus, null);
        at atVar = new at(3, this, tL_emojiStatusEmpty);
        if (document != null) {
            (k2Var != null ? cc.a0(k2Var) : new cc(frameLayout, p6Var)).r(document, org.telegram.messenger.cd.L0(2131745562, null), org.telegram.messenger.cd.L0(2131743910, null), atVar).j();
            return;
        }
        ob obVar = new ob(vyVar.getContext(), p6Var);
        obVar.b.setText(org.telegram.messenger.cd.L0(2131746302, null));
        ImageView imageView = obVar.a;
        imageView.setImageResource(R.drawable.msg_settings_premium);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.z9, p6Var, PorterDuff.Mode.MULTIPLY);
        ub ubVar = new ub(vyVar.getContext(), p6Var, true);
        ubVar.b = atVar;
        obVar.setButton(ubVar);
        if (k2Var != null) {
            wb.g(k2Var, obVar, 1500).j();
        } else {
            wb.f(frameLayout, obVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.jt
    public final void v(TLObject tLObject, Object obj) {
        vy vyVar = this.a;
        wv wvVar = vyVar.h0;
        if (wvVar.getAdapter() == vyVar.n0 || wvVar.getAdapter() == vyVar.j0) {
            vyVar.t1.e(tLObject, obj);
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
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void i(org.telegram.messenger.jz jzVar) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void N(CharSequence charSequence, String str, vg vgVar) {
    }
}

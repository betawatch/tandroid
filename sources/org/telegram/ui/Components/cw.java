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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cw implements org.telegram.ui.is {
    public final /* synthetic */ hy a;

    public cw(hy hyVar) {
        this.a = hyVar;
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
        org.telegram.ui.ActionBar.f2 f2Var = this.a.Y1;
        if (f2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) f2Var).Cb(document);
        }
    }

    @Override // org.telegram.ui.is
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final boolean E(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.is
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ui.a0(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new x1(this, 3));
    }

    @Override // org.telegram.ui.is
    public final String G(boolean z9) {
        hy hyVar = this.a;
        if (z9) {
            v4.g0 adapter = hyVar.h0.getAdapter();
            mx mxVar = hyVar.j0;
            if (adapter == mxVar) {
                return mxVar.x;
            }
            return null;
        }
        v4.g0 adapter2 = hyVar.P.getAdapter();
        hx hxVar = hyVar.S;
        if (adapter2 == hxVar) {
            return hxVar.w;
        }
        return null;
    }

    @Override // org.telegram.ui.is
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            hy hyVar = this.a;
            org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
            org.telegram.messenger.camera.q.r(null, 2131751185, f2Var != null ? hc.a0(f2Var) : new hc(hyVar.r, hyVar.Z1));
        }
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
    public final void L() {
        this.a.W();
    }

    @Override // org.telegram.ui.is
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.is
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList arrayList = org.telegram.messenger.i6.i;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.is
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f()) == null) {
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
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.is
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.is
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
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
        hy hyVar = this.a;
        return (hyVar.Y1 == null && hyVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean k(int i7) {
        if (i7 != 2) {
            return true;
        }
        hy hyVar = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
        if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).S6()) {
            return org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || (((org.telegram.ui.an) hyVar.Y1).j() != null && org.telegram.messenger.t10.B(((org.telegram.ui.an) hyVar.Y1).j()));
        }
        return false;
    }

    @Override // org.telegram.ui.is
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
        this.a.t1.m(null, document, str, obj, null, z9, i7);
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final void o(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                inputStickerSet = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                break;
            } else {
                i7++;
            }
        }
        hy hyVar = this.a;
        yv0.M0(hyVar.Y1, org.telegram.messenger.ui.b0(hyVar.c1).m0(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.is
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
            qw qwVar = this.a.R;
            if (qwVar != null) {
                qwVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.is
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
        hy hyVar = this.a;
        lv lvVar = hyVar.h0;
        if (lvVar.getAdapter() == hyVar.n0) {
            hyVar.t1.v(null, tLObject, null, obj, z9, i7, i10);
        } else if (lvVar.getAdapter() == hyVar.j0) {
            hyVar.t1.v(null, tLObject, null, obj, z9, i7, i10);
        }
    }

    @Override // org.telegram.ui.is
    public final void t() {
        tw twVar = this.a.P;
        if (twVar == null || twVar.l3 == null) {
            return;
        }
        while (twVar.l3.size() > 0) {
            sw swVar = (sw) twVar.l3.valueAt(0);
            twVar.l3.removeAt(0);
            if (swVar != null) {
                View view = swVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    swVar.d.getBackground().setState(new int[0]);
                }
                View view2 = swVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.is
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        hy hyVar = this.a;
        FrameLayout frameLayout = hyVar.r;
        org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
        org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.qp.s1(hyVar.c1).h5(emojiStatus, null);
        fq fqVar = new fq(9, this, tL_emojiStatusEmpty);
        if (document != null) {
            (f2Var != null ? hc.a0(f2Var) : new hc(frameLayout, f6Var)).r(document, org.telegram.messenger.id.M0(2131745548, null), org.telegram.messenger.id.M0(2131743888, null), fqVar).j();
            return;
        }
        ub ubVar = new ub(hyVar.getContext(), f6Var);
        ubVar.b.setText(org.telegram.messenger.id.M0(2131746288, null));
        ImageView imageView = ubVar.a;
        imageView.setImageResource(R.drawable.msg_settings_premium);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.z9, f6Var, PorterDuff.Mode.MULTIPLY);
        ac acVar = new ac(hyVar.getContext(), f6Var, true);
        acVar.b = fqVar;
        ubVar.setButton(acVar);
        if (f2Var != null) {
            cc.g(f2Var, ubVar, 1500).j();
        } else {
            cc.f(frameLayout, ubVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.is
    public final void x(TLObject tLObject, Object obj) {
        hy hyVar = this.a;
        lv lvVar = hyVar.h0;
        if (lvVar.getAdapter() == hyVar.n0 || lvVar.getAdapter() == hyVar.j0) {
            hyVar.t1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean y() {
        return true;
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
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void u(CharSequence charSequence, String str, fx fxVar) {
    }
}

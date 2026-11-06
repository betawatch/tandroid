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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class bw implements org.telegram.ui.is {
    public final /* synthetic */ gy a;

    public bw(gy gyVar) {
        this.a = gyVar;
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
        gy gyVar = this.a;
        if (z9) {
            v4.g0 adapter = gyVar.h0.getAdapter();
            lx lxVar = gyVar.j0;
            if (adapter == lxVar) {
                return lxVar.x;
            }
            return null;
        }
        v4.g0 adapter2 = gyVar.P.getAdapter();
        gx gxVar = gyVar.S;
        if (adapter2 == gxVar) {
            return gxVar.w;
        }
        return null;
    }

    @Override // org.telegram.ui.is
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            gy gyVar = this.a;
            org.telegram.ui.ActionBar.f2 f2Var = gyVar.Y1;
            org.telegram.messenger.camera.q.r(null, 2131751185, f2Var != null ? hc.a0(f2Var) : new hc(gyVar.r, gyVar.Z1));
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
        gy gyVar = this.a;
        return (gyVar.Y1 == null && gyVar.u0) ? false : true;
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
        gy gyVar = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = gyVar.Y1;
        if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).S6()) {
            return org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || (((org.telegram.ui.an) gyVar.Y1).j() != null && org.telegram.messenger.t10.B(((org.telegram.ui.an) gyVar.Y1).j()));
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
        gy gyVar = this.a;
        yv0.M0(gyVar.Y1, org.telegram.messenger.ui.b0(gyVar.c1).m0(inputStickerSet, true), document);
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
            pw pwVar = this.a.R;
            if (pwVar != null) {
                pwVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.is
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
        gy gyVar = this.a;
        kv kvVar = gyVar.h0;
        if (kvVar.getAdapter() == gyVar.n0) {
            gyVar.t1.v(null, tLObject, null, obj, z9, i7, i10);
        } else if (kvVar.getAdapter() == gyVar.j0) {
            gyVar.t1.v(null, tLObject, null, obj, z9, i7, i10);
        }
    }

    @Override // org.telegram.ui.is
    public final void t() {
        sw swVar = this.a.P;
        if (swVar == null || swVar.l3 == null) {
            return;
        }
        while (swVar.l3.size() > 0) {
            rw rwVar = (rw) swVar.l3.valueAt(0);
            swVar.l3.removeAt(0);
            if (rwVar != null) {
                View view = rwVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    rwVar.d.getBackground().setState(new int[0]);
                }
                View view2 = rwVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.is
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        gy gyVar = this.a;
        FrameLayout frameLayout = gyVar.r;
        org.telegram.ui.ActionBar.f2 f2Var = gyVar.Y1;
        org.telegram.ui.ActionBar.f6 f6Var = gyVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.qp.s1(gyVar.c1).h5(emojiStatus, null);
        fq fqVar = new fq(9, this, tL_emojiStatusEmpty);
        if (document != null) {
            (f2Var != null ? hc.a0(f2Var) : new hc(frameLayout, f6Var)).r(document, org.telegram.messenger.hd.M0(2131745546, null), org.telegram.messenger.hd.M0(2131743886, null), fqVar).j();
            return;
        }
        ub ubVar = new ub(gyVar.getContext(), f6Var);
        ubVar.b.setText(org.telegram.messenger.hd.M0(2131746286, null));
        ImageView imageView = ubVar.a;
        imageView.setImageResource(R.drawable.msg_settings_premium);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.z9, f6Var, PorterDuff.Mode.MULTIPLY);
        ac acVar = new ac(gyVar.getContext(), f6Var, true);
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
        gy gyVar = this.a;
        kv kvVar = gyVar.h0;
        if (kvVar.getAdapter() == gyVar.n0 || kvVar.getAdapter() == gyVar.j0) {
            gyVar.t1.e(tLObject, obj);
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
    public final /* synthetic */ void u(CharSequence charSequence, String str, ex exVar) {
    }
}

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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nw implements org.telegram.ui.ls {
    public final /* synthetic */ ry a;

    public nw(ry ryVar) {
        this.a = ryVar;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.h2 h2Var = this.a.Z1;
        if (h2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) h2Var).Gb(document);
        }
    }

    @Override // org.telegram.ui.ls
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ y60 E(ai.k0 k0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ri.c0(document, "").document;
        ConnectionsManager.getInstance(this.a.d1).sendRequest(tL_stickers_removeStickerFromSet, new e2(this, 3));
    }

    @Override // org.telegram.ui.ls
    public final String G(boolean z10) {
        ry ryVar = this.a;
        if (z10) {
            v4.i0 adapter = ryVar.i0.getAdapter();
            vx vxVar = ryVar.k0;
            if (adapter == vxVar) {
                return vxVar.x;
            }
            return null;
        }
        v4.i0 adapter2 = ryVar.Q.getAdapter();
        qx qxVar = ryVar.T;
        if (adapter2 == qxVar) {
            return qxVar.w;
        }
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ry ryVar = this.a;
            org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
            org.telegram.messenger.n10.t(null, 2131751173, h2Var != null ? lc.b0(h2Var) : new lc(ryVar.r, ryVar.a2));
        }
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
    public final void L() {
        this.a.X();
    }

    @Override // org.telegram.ui.ls
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.u1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.ls
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList arrayList = org.telegram.messenger.j6.i;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.ls
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q() || (f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f()) == null) {
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
        return this.a.u1.a();
    }

    @Override // org.telegram.ui.ls
    public final boolean b() {
        return this.a.u1.b();
    }

    @Override // org.telegram.ui.ls
    public final boolean c() {
        return this.a.u1.c();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final boolean e(TLRPC.Document document) {
        return this.a.u1.j();
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
        ry ryVar = this.a;
        return (ryVar.Z1 == null && ryVar.v0) ? false : true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean k(int i7) {
        if (i7 != 2) {
            return true;
        }
        ry ryVar = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
        if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).T6()) {
            return org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q() || (((org.telegram.ui.bn) ryVar.Z1).j() != null && org.telegram.messenger.o10.C(((org.telegram.ui.bn) ryVar.Z1).j()));
        }
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        this.a.u1.m(null, document, str, obj, null, z10, i7);
    }

    @Override // org.telegram.ui.ls
    public final void n(TLRPC.Document document) {
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
        ry ryVar = this.a;
        iw0.N0(ryVar.Z1, org.telegram.messenger.ri.d0(ryVar.d1).o0(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void p(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.id;
            HashMap hashMap = org.telegram.messenger.j6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.j6.i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.j6.a(org.telegram.messenger.j6.o[0]);
            }
            bx bxVar = this.a.S;
            if (bxVar != null) {
                bxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.ls
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        ry ryVar = this.a;
        vv vvVar = ryVar.i0;
        if (vvVar.getAdapter() == ryVar.o0) {
            ryVar.u1.v(null, tLObject, null, obj, z10, i7, i10);
        } else if (vvVar.getAdapter() == ryVar.k0) {
            ryVar.u1.v(null, tLObject, null, obj, z10, i7, i10);
        }
    }

    @Override // org.telegram.ui.ls
    public final void s() {
        ex exVar = this.a.Q;
        if (exVar == null || exVar.m3 == null) {
            return;
        }
        while (exVar.m3.size() > 0) {
            dx dxVar = (dx) exVar.m3.valueAt(0);
            exVar.m3.removeAt(0);
            if (dxVar != null) {
                View view = dxVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    dxVar.d.getBackground().setState(new int[0]);
                }
                View view2 = dxVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.ls
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        ry ryVar = this.a;
        FrameLayout frameLayout = ryVar.r;
        org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.mp.u1(ryVar.d1).t5(emojiStatus, null);
        mg mgVar = new mg(29, this, tL_emojiStatusEmpty);
        if (document != null) {
            (h2Var != null ? lc.b0(h2Var) : new lc(frameLayout, i6Var)).r(document, org.telegram.messenger.gd.M0(2131745350, null), org.telegram.messenger.gd.M0(2131743648, null), mgVar).j();
            return;
        }
        yb ybVar = new yb(ryVar.getContext(), i6Var);
        ybVar.b.setText(org.telegram.messenger.gd.M0(2131746092, null));
        ImageView imageView = ybVar.a;
        imageView.setImageResource(R.drawable.msg_settings_premium);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.z9, i6Var, PorterDuff.Mode.MULTIPLY);
        ec ecVar = new ec(ryVar.getContext(), i6Var, true);
        ecVar.b = mgVar;
        ybVar.setButton(ecVar);
        if (h2Var != null) {
            gc.g(h2Var, ybVar, 1500).j();
        } else {
            gc.f(frameLayout, ybVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ls
    public final void v(TLObject tLObject, Object obj) {
        ry ryVar = this.a;
        vv vvVar = ryVar.i0;
        if (vvVar.getAdapter() == ryVar.o0 || vvVar.getAdapter() == ryVar.k0) {
            ryVar.u1.e(tLObject, obj);
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
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void i(org.telegram.messenger.sy syVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void y(CharSequence charSequence, String str, ph phVar) {
    }
}

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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class mw implements org.telegram.ui.ls {
    public final /* synthetic */ qy a;

    public mw(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.ls
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.g2 g2Var = this.a.Z1;
        if (g2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) g2Var).Gb(document);
        }
    }

    @Override // org.telegram.ui.ls
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ x60 D(ai.h0 h0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ri.c0(document, "").document;
        ConnectionsManager.getInstance(this.a.d1).sendRequest(tL_stickers_removeStickerFromSet, new e2(this, 3));
    }

    @Override // org.telegram.ui.ls
    public final String F(boolean z10) {
        qy qyVar = this.a;
        if (z10) {
            v4.i0 adapter = qyVar.i0.getAdapter();
            ux uxVar = qyVar.k0;
            if (adapter == uxVar) {
                return uxVar.x;
            }
            return null;
        }
        v4.i0 adapter2 = qyVar.Q.getAdapter();
        px pxVar = qyVar.T;
        if (adapter2 == pxVar) {
            return pxVar.w;
        }
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            qy qyVar = this.a;
            org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
            org.telegram.messenger.m10.t(null, 2131751172, g2Var != null ? kc.b0(g2Var) : new kc(qyVar.r, qyVar.a2));
        }
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
        if (!org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q() || (f10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).f()) == null) {
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
        qy qyVar = this.a;
        return (qyVar.Z1 == null && qyVar.v0) ? false : true;
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
        qy qyVar = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).T6()) {
            return org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q() || (((org.telegram.ui.bn) qyVar.Z1).j() != null && org.telegram.messenger.n10.C(((org.telegram.ui.bn) qyVar.Z1).j()));
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
        qy qyVar = this.a;
        jw0.N0(qyVar.Z1, org.telegram.messenger.ri.d0(qyVar.d1).o0(inputStickerSet, true), document);
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
            ax axVar = this.a.S;
            if (axVar != null) {
                axVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.ls
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        qy qyVar = this.a;
        vv vvVar = qyVar.i0;
        if (vvVar.getAdapter() == qyVar.o0) {
            qyVar.u1.v(null, tLObject, null, obj, z10, i7, i10);
        } else if (vvVar.getAdapter() == qyVar.k0) {
            qyVar.u1.v(null, tLObject, null, obj, z10, i7, i10);
        }
    }

    @Override // org.telegram.ui.ls
    public final void s() {
        dx dxVar = this.a.Q;
        if (dxVar == null || dxVar.m3 == null) {
            return;
        }
        while (dxVar.m3.size() > 0) {
            cx cxVar = (cx) dxVar.m3.valueAt(0);
            dxVar.m3.removeAt(0);
            if (cxVar != null) {
                View view = cxVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    cxVar.d.getBackground().setState(new int[0]);
                }
                View view2 = cxVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.ls
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        qy qyVar = this.a;
        FrameLayout frameLayout = qyVar.r;
        org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.mp.u1(qyVar.d1).t5(emojiStatus, null);
        bt btVar = new bt(3, this, tL_emojiStatusEmpty);
        if (document != null) {
            (g2Var != null ? kc.b0(g2Var) : new kc(frameLayout, i6Var)).r(document, org.telegram.messenger.gd.N0(2131745349, null), org.telegram.messenger.gd.N0(2131743638, null), btVar).j();
            return;
        }
        xb xbVar = new xb(qyVar.getContext(), i6Var);
        xbVar.b.setText(org.telegram.messenger.gd.N0(2131746091, null));
        ImageView imageView = xbVar.a;
        imageView.setImageResource(R.drawable.msg_settings_premium);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.z9, i6Var, PorterDuff.Mode.MULTIPLY);
        dc dcVar = new dc(qyVar.getContext(), i6Var, true);
        dcVar.b = btVar;
        xbVar.setButton(dcVar);
        if (g2Var != null) {
            fc.g(g2Var, xbVar, 1500).j();
        } else {
            fc.f(frameLayout, xbVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ls
    public final void v(TLObject tLObject, Object obj) {
        qy qyVar = this.a;
        vv vvVar = qyVar.i0;
        if (vvVar.getAdapter() == qyVar.o0 || vvVar.getAdapter() == qyVar.k0) {
            qyVar.u1.e(tLObject, obj);
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
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void K(CharSequence charSequence, String str, ph phVar) {
    }
}

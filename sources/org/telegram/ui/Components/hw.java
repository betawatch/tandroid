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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hw implements org.telegram.ui.ls {
    public final /* synthetic */ ly a;

    public hw(ly lyVar) {
        this.a = lyVar;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.e2 e2Var = this.a.Z1;
        if (e2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) e2Var).Gb(document);
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
    public final /* synthetic */ m60 E(ai.k0 k0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.si.a0(document, "").document;
        ConnectionsManager.getInstance(this.a.d1).sendRequest(tL_stickers_removeStickerFromSet, new v1(this, 3));
    }

    @Override // org.telegram.ui.ls
    public final String G(boolean z10) {
        ly lyVar = this.a;
        if (z10) {
            v4.h0 adapter = lyVar.i0.getAdapter();
            qx qxVar = lyVar.k0;
            if (adapter == qxVar) {
                return qxVar.x;
            }
            return null;
        }
        v4.h0 adapter2 = lyVar.Q.getAdapter();
        lx lxVar = lyVar.T;
        if (adapter2 == lxVar) {
            return lxVar.w;
        }
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.gj.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ly lyVar = this.a;
            org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
            org.telegram.messenger.i20.s(null, 2131751184, e2Var != null ? cc.a0(e2Var) : new cc(lyVar.r, lyVar.a2));
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
        if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q() || (f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.q10.h(f10);
        return Boolean.valueOf(document != null && (h == null || h.longValue() != document.id));
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
        ly lyVar = this.a;
        return (lyVar.Z1 == null && lyVar.v0) ? false : true;
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
        ly lyVar = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
        if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).T6()) {
            return org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q() || (((org.telegram.ui.an) lyVar.Z1).j() != null && org.telegram.messenger.q10.B(((org.telegram.ui.an) lyVar.Z1).j()));
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
        ly lyVar = this.a;
        bw0.M0(lyVar.Z1, org.telegram.messenger.si.b0(lyVar.d1).m0(inputStickerSet, true), document);
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
            vw vwVar = this.a.S;
            if (vwVar != null) {
                vwVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.ls
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        ly lyVar = this.a;
        qv qvVar = lyVar.i0;
        if (qvVar.getAdapter() == lyVar.o0) {
            lyVar.u1.v(null, tLObject, null, obj, z10, i7, i10);
        } else if (qvVar.getAdapter() == lyVar.k0) {
            lyVar.u1.v(null, tLObject, null, obj, z10, i7, i10);
        }
    }

    @Override // org.telegram.ui.ls
    public final void s() {
        yw ywVar = this.a.Q;
        if (ywVar == null || ywVar.m3 == null) {
            return;
        }
        while (ywVar.m3.size() > 0) {
            xw xwVar = (xw) ywVar.m3.valueAt(0);
            ywVar.m3.removeAt(0);
            if (xwVar != null) {
                View view = xwVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    xwVar.d.getBackground().setState(new int[0]);
                }
                View view2 = xwVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.ls
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        ly lyVar = this.a;
        FrameLayout frameLayout = lyVar.r;
        org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).f();
        Object tL_emojiStatusEmpty = f10 == null ? new TLRPC.TL_emojiStatusEmpty() : f10.emoji_status;
        org.telegram.messenger.np.s1(lyVar.d1).i5(emojiStatus, null);
        vs vsVar = new vs(3, this, tL_emojiStatusEmpty);
        if (document != null) {
            (e2Var != null ? cc.a0(e2Var) : new cc(frameLayout, e6Var)).r(document, org.telegram.messenger.hd.M0(2131745545, null), org.telegram.messenger.hd.M0(2131743885, null), vsVar).j();
            return;
        }
        pb pbVar = new pb(lyVar.getContext(), e6Var);
        pbVar.b.setText(org.telegram.messenger.hd.M0(2131746287, null));
        ImageView imageView = pbVar.a;
        imageView.setImageResource(R.drawable.msg_settings_premium);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.z9, e6Var, PorterDuff.Mode.MULTIPLY);
        vb vbVar = new vb(lyVar.getContext(), e6Var, true);
        vbVar.b = vsVar;
        pbVar.setButton(vbVar);
        if (e2Var != null) {
            xb.g(e2Var, pbVar, 1500).j();
        } else {
            xb.f(frameLayout, pbVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ls
    public final void v(TLObject tLObject, Object obj) {
        ly lyVar = this.a;
        qv qvVar = lyVar.i0;
        if (qvVar.getAdapter() == lyVar.o0 || qvVar.getAdapter() == lyVar.k0) {
            lyVar.u1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.messenger.gj z() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void i(org.telegram.messenger.xy xyVar) {
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
    public final /* synthetic */ void y(CharSequence charSequence, String str, gh ghVar) {
    }
}

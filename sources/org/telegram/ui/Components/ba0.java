package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ba0 implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ org.telegram.ui.x7 a;

    public ba0(org.telegram.ui.x7 x7Var) {
        this.a = x7Var;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        ca0 ca0Var = (ca0) this.a.d;
        if (ca0Var.a != 2) {
            return null;
        }
        org.telegram.messenger.mj mjVar = ca0Var.c0.d;
        if (mjVar.n) {
            return null;
        }
        return mjVar.w;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean J0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        ca0 ca0Var = (ca0) this.a.d;
        if (ca0Var.a != 2 || ca0Var.c0.d.w == characterStyle || q1Var.getMessageObject() == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        URLSpan uRLSpan = (URLSpan) characterStyle;
        String url = uRLSpan.getURL();
        ia0 ia0Var = ca0Var.c0;
        org.telegram.messenger.mj mjVar = ia0Var.d;
        mjVar.w = uRLSpan;
        mjVar.v = null;
        org.telegram.ui.an anVar = ia0Var.c;
        if (anVar != null && url != null) {
            anVar.yb(url, true);
        }
        ca0.b(ca0Var, q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.fr0 N1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean W0(org.telegram.messenger.ij ijVar) {
        return org.telegram.ui.Cells.f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean b0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d() {
        ca0 ca0Var = (ca0) this.a.d;
        if (ca0Var.a != 2) {
            return false;
        }
        org.telegram.messenger.mj mjVar = ca0Var.c0.d;
        return (mjVar.n || mjVar.i) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean g2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int h0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean k0() {
        return d();
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.j9 k2() {
        return ((ca0) this.a.d).e;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean n0(r5 r5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        ca0 ca0Var = (ca0) this.a.d;
        if (ca0Var.a != 2 || i7 != 1) {
            return false;
        }
        org.telegram.messenger.mj mjVar = ca0Var.c0.d;
        if (mjVar.n) {
            return false;
        }
        TLRPC.WebPage webPage = mjVar.v;
        return webPage == null || (webPage instanceof TLRPC.TL_webPagePending);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean x0(org.telegram.messenger.ij ijVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String y(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A1(org.telegram.messenger.ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P(org.telegram.messenger.ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void c2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void d0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void r1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o10 o10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}

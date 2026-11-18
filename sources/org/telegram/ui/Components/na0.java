package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class na0 implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ org.telegram.ui.y7 a;

    public na0(org.telegram.ui.y7 y7Var) {
        this.a = y7Var;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        oa0 oa0Var = (oa0) this.a.d;
        if (oa0Var.a != 2) {
            return null;
        }
        org.telegram.messenger.jj jjVar = oa0Var.d0.d;
        if (jjVar.n) {
            return null;
        }
        return jjVar.w;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean T() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        oa0 oa0Var = (oa0) this.a.d;
        if (oa0Var.a != 2 || oa0Var.d0.d.w == characterStyle || q1Var.getMessageObject() == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        URLSpan uRLSpan = (URLSpan) characterStyle;
        String url = uRLSpan.getURL();
        ua0 ua0Var = oa0Var.d0;
        org.telegram.messenger.jj jjVar = ua0Var.d;
        jjVar.w = uRLSpan;
        jjVar.v = null;
        org.telegram.ui.bn bnVar = ua0Var.c;
        if (bnVar != null && url != null) {
            bnVar.Cb(url, true);
        }
        oa0.b(oa0Var, q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.fj fjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean U(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int Z() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean b() {
        oa0 oa0Var = (oa0) this.a.d;
        if (oa0Var.a != 2) {
            return false;
        }
        org.telegram.messenger.jj jjVar = oa0Var.d0.d;
        return (jjVar.n || jjVar.i) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ jh.a c0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.fr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean d0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean e0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String i(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int k0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean n0() {
        return b();
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p0(x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean v2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean y0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String z(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        oa0 oa0Var = (oa0) this.a.d;
        if (oa0Var.a != 2 || i7 != 1) {
            return false;
        }
        org.telegram.messenger.jj jjVar = oa0Var.d0.d;
        if (jjVar.n) {
            return false;
        }
        TLRPC.WebPage webPage = jjVar.v;
        return webPage == null || (webPage instanceof TLRPC.TL_webPagePending);
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.j9 z2() {
        return ((oa0) this.a.d).e;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void E(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L(org.telegram.messenger.cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void R(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void h0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.i10 i10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}

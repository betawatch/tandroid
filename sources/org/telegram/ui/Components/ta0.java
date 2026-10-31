package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ta0 implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ org.telegram.ui.x7 a;

    public ta0(org.telegram.ui.x7 x7Var) {
        this.a = x7Var;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.qs0 H1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean I0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean K1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        ua0 ua0Var = (ua0) this.a.d;
        if (ua0Var.a != 2 || ua0Var.c0.d.w == characterStyle || q1Var.getMessageObject() == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        URLSpan uRLSpan = (URLSpan) characterStyle;
        String url = uRLSpan.getURL();
        ab0 ab0Var = ua0Var.c0;
        org.telegram.messenger.nj njVar = ab0Var.d;
        njVar.w = uRLSpan;
        njVar.v = null;
        org.telegram.ui.un unVar = ab0Var.c;
        if (unVar != null && url != null) {
            unVar.ob(url, true);
        }
        ua0.b(ua0Var, q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S0(org.telegram.messenger.jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        ua0 ua0Var = (ua0) this.a.d;
        if (ua0Var.a != 2) {
            return false;
        }
        org.telegram.messenger.nj njVar = ua0Var.c0.d;
        return (njVar.n || njVar.i) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.l9 g2() {
        return ((ua0) this.a.d).e;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean i0() {
        return c();
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        ua0 ua0Var = (ua0) this.a.d;
        if (ua0Var.a != 2 || i10 != 1) {
            return false;
        }
        org.telegram.messenger.nj njVar = ua0Var.c0.d;
        if (njVar.n) {
            return false;
        }
        TLRPC.WebPage webPage = njVar.v;
        return webPage == null || (webPage instanceof TLRPC.TL_webPagePending);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean m0(o5 o5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean w0(org.telegram.messenger.jj jjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        ua0 ua0Var = (ua0) this.a.d;
        if (ua0Var.a != 2) {
            return null;
        }
        org.telegram.messenger.nj njVar = ua0Var.c0.d;
        if (njVar.n) {
            return null;
        }
        return njVar.w;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O(org.telegram.messenger.jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v1(org.telegram.messenger.jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}

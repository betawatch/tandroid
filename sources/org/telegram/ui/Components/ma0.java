package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ma0 implements org.telegram.ui.Cells.m1 {
    public final /* synthetic */ org.telegram.ui.z7 a;

    public ma0(org.telegram.ui.z7 z7Var) {
        this.a = z7Var;
    }

    @Override // org.telegram.ui.Cells.m1
    public final org.telegram.ui.Cells.j9 B2() {
        return ((na0) this.a.d).e;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ String D(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean F0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        na0 na0Var = (na0) this.a.d;
        if (na0Var.a != 2) {
            return null;
        }
        org.telegram.messenger.jj jjVar = na0Var.d0.d;
        if (jjVar.n) {
            return null;
        }
        return jjVar.w;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.fj fjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean X(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean Y() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean Z(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void a1(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        na0 na0Var = (na0) this.a.d;
        if (na0Var.a != 2 || na0Var.d0.d.w == characterStyle || r1Var.getMessageObject() == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        URLSpan uRLSpan = (URLSpan) characterStyle;
        String url = uRLSpan.getURL();
        ta0 ta0Var = na0Var.d0;
        org.telegram.messenger.jj jjVar = ta0Var.d;
        jjVar.w = uRLSpan;
        jjVar.v = null;
        org.telegram.ui.bn bnVar = ta0Var.c;
        if (bnVar != null && url != null) {
            bnVar.Cb(url, true);
        }
        na0.b(na0Var, r1Var);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean a2(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean b0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean c1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ org.telegram.ui.fr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean d() {
        na0 na0Var = (na0) this.a.d;
        if (na0Var.a != 2) {
            return false;
        }
        org.telegram.messenger.jj jjVar = na0Var.d0.d;
        return (jjVar.n || jjVar.i) ? false : true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ int e0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean g1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ jh.a h0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean j0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean j2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ String k(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean k0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ int p0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean r0() {
        return d();
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean v0(x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean y2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        na0 na0Var = (na0) this.a.d;
        if (na0Var.a != 2 || i7 != 1) {
            return false;
        }
        org.telegram.messenger.jj jjVar = na0Var.d0.d;
        if (jjVar.n) {
            return false;
        }
        TLRPC.WebPage webPage = jjVar.v;
        return webPage == null || (webPage instanceof TLRPC.TL_webPagePending);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void A(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void C(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void F(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void J(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void L0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void M(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void O(org.telegram.messenger.cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void R(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void S0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void W(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void d0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void e1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void f1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void k2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void m0(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void q0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void t(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void t0(String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void u2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void z2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void L(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.h10 h10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void A2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void J0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final void M0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void P(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void o0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void x0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void q(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void m(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void w2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void c0(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}

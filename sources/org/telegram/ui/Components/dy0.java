package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dy0 implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    public dy0(boolean z10, boolean z11) {
        this.a = z10;
        this.b = z11;
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
    public final boolean L0(long j3) {
        return this.a && this.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
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
    public final /* synthetic */ boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.dr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f2(long j3) {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean o0(p5 p5Var) {
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
    public final String x(long j3) {
        return org.telegram.messenger.hd.M0(this.a ? this.b ? 2131744277 : 2131744285 : 2131744279, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean y0(org.telegram.messenger.gj gjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.i9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.dj djVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
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
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
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
    public final /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
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
    public final /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
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
    public final /* synthetic */ void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
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
    public final /* synthetic */ void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}

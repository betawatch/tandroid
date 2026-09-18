package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class k01 implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    public k01(boolean z10, boolean z11) {
        this.a = z10;
        this.b = z11;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean M0(long j3) {
        return this.a && this.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.pv0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a2(long j3) {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean b0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean o0(z5 z5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final String w(long j3) {
        return LocaleController.getString(this.a ? this.b ? R.string.TagInfoOwnerTitle : R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}

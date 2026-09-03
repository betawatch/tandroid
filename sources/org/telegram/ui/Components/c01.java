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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c01 implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    public c01(boolean z4, boolean z10) {
        this.a = z4;
        this.b = z10;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.Cells.m9 D2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean F1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean M1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean R(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean R0(long j10) {
        return this.a && this.b;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ ug.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean c0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.cv0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e2(long j10) {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int k0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean t0(u5 u5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final String w(long j10) {
        return LocaleController.getString(this.a ? this.b ? R.string.TagInfoOwnerTitle : R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean z2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void B2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void E0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void H1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void I0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void O1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Q1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void S0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void U(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void d1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void e1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void f0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void l0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void y(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}

package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ke1 implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ le1 a;

    public ke1(le1 le1Var) {
        this.a = le1Var;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean I0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        le1 le1Var = this.a;
        if (le1Var.K.getDelegate() != null) {
            return le1Var.K.getDelegate().O(le1Var.K, todoItem, z10);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ ov0 Q1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean R0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean S1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean X0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ ih.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean c1(MessageObject messageObject) {
        return org.telegram.messenger.wl.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean d2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int f0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean m2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean n0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ org.telegram.ui.Cells.r9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void J0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void W1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void g0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void v0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void v1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.t1 t1Var, ah.u uVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void L0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void Y1(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void g1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void j1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void Q0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void e0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void p0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void p2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void x0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void t0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void T1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void k2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}

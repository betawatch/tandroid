package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cd1 implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ dd1 a;

    public cd1(dd1 dd1Var) {
        this.a = dd1Var;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String C(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean K0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ nu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean R1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        dd1 dd1Var = this.a;
        if (dd1Var.G.getDelegate() != null) {
            return dd1Var.G.getDelegate().V(dd1Var.G, todoItem, z10);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean X(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Z0(MessageObject messageObject) {
        return org.telegram.messenger.ll.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int b0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ pg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String i(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int l0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean n2(int i9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ org.telegram.ui.Cells.o9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean r0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void C1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void J(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void N(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void R(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void U(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void a0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i0(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void k2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void m0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void q0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void v(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void x(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}

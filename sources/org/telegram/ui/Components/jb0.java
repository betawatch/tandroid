package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jb0 implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ kb0 a;

    public jb0(kb0 kb0Var) {
        this.a = kb0Var;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean M0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean P() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        lb0 lb0Var = this.a.c;
        if (lb0Var.a != 2) {
            return null;
        }
        MessagePreviewParams messagePreviewParams = lb0Var.V.d;
        if (messagePreviewParams.singleLink) {
            return null;
        }
        return messagePreviewParams.currentLink;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        kb0 kb0Var = this.a;
        lb0 lb0Var = kb0Var.c;
        if (lb0Var.a != 2 || lb0Var.V.d.currentLink == characterStyle || s1Var.getMessageObject() == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        rb0 rb0Var = kb0Var.c.V;
        MessagePreviewParams messagePreviewParams = rb0Var.d;
        messagePreviewParams.currentLink = characterStyle;
        messagePreviewParams.webpage = null;
        org.telegram.ui.tn tnVar = rb0Var.c;
        if (tnVar != null && url != null) {
            tnVar.Ya(url, true);
        }
        lb0.b(kb0Var.c, s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ sg.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.lu0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Z(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c() {
        lb0 lb0Var = this.a.c;
        if (lb0Var.a != 2) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = lb0Var.V.d;
        return (messagePreviewParams.singleLink || messagePreviewParams.isSecret) ? false : true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        lb0 lb0Var = this.a.c;
        if (lb0Var.a != 2 || i10 != 1) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = lb0Var.V.d;
        if (messagePreviewParams.singleLink) {
            return false;
        }
        TLRPC.WebPage webPage = messagePreviewParams.webpage;
        return webPage == null || (webPage instanceof TLRPC.TL_webPagePending);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean c2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int f0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean j0() {
        return c();
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean n0(y5 y5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean u2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String y(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final org.telegram.ui.Cells.l9 y2() {
        return this.a.c.e;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void S1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void T(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void e2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void g0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void o(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void w(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void w2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void v0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}

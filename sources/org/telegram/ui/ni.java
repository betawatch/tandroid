package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ni implements org.telegram.ui.Components.cj0 {
    public final /* synthetic */ an a;

    public ni(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void f(float f10, float f11, int i7, View view) {
        boolean z9;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.messenger.ij messageObject2;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        an anVar = this.a;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        if (z9) {
            return;
        }
        anVar.P4 = true;
        boolean z10 = view instanceof org.telegram.ui.Cells.t0;
        if (z10 && (messageObject2 = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            TLRPC.MessageAction messageAction = messageObject2.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                if (tL_messageActionWalletTonConnectRequest.expires <= anVar.getConnectionsManager().getCurrentTime() || messageObject2.O3() || org.telegram.messenger.ij.B0(messageObject2.k) != 777000) {
                    return;
                }
                Activity parentActivity = anVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                long j3 = tL_messageActionWalletTonConnectRequest.session_id;
                int f12 = messageObject2.f1();
                f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                org.telegram.ui.Wallet.f2.q(parentActivity, i10, j3, f12, f6Var, null);
                return;
            }
        }
        boolean z11 = false;
        if (z10) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            if (t0Var.getMessageObject().j0) {
                if (anVar.ib) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = t0Var.getMessageObject().k.date;
                bundle.putLong("dialog_id", anVar.j6);
                bundle.putLong("topic_id", anVar.b());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                h8 h8Var = new h8(0, i11, bundle);
                h8Var.N = anVar;
                anVar.presentFragment(h8Var);
                return;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
            if (t0Var2.getMessageObject() != null && (t0Var2.getMessageObject().k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                anVar.getNotificationCenter().k(org.telegram.messenger.qs.n3, Long.valueOf(anVar.j6));
                return;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
            if (t0Var3.getMessageObject() != null && (t0Var3.getMessageObject().k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                org.telegram.messenger.g0.i3(new bg.m0(this, t0Var3.getMessageObject().O1(), 23), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar.v() || anVar.W9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (anVar.q9.z(q1Var2.getMessageObject())) {
                    return;
                } else {
                    z11 = !q1Var2.B2(f10);
                }
            }
            an.j2(anVar, view, z11, f10, f11);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1) || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) == null || messageObject.D != 27) {
            anVar.X7(view, true, false, f10, f11, true, false, false);
            return;
        }
        messageObject.Z5();
        messageObject.K1 = true;
        q1Var.G1();
        view.requestLayout();
        if (i7 >= 0) {
            anVar.C0.g(i7);
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public final boolean f1(View view) {
        boolean z9;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        an anVar = this.a;
        if (!anVar.V9() && (!((z9 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).P2())) {
            String Q = anVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) anVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                boolean z10 = anVar.j6 >= 0;
                if (!z10 && (chatFull = anVar.p8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z10 = org.telegram.messenger.t3.v0(chatFull, Q);
                }
                if (z10) {
                    if (z9) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.t0) {
                        messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.j0 && !messageObject.p4() && messageObject.z() && !messageObject.Z2()) {
                        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                        if (!kVar.v() && !anVar.z() && !anVar.c() && !messageObject.s4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void r0(View view, float f10, float f11) {
        org.telegram.messenger.ij messageObject;
        boolean z9;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        an anVar = this.a;
        if (anVar.getParentActivity() == null || anVar.z() || anVar.c() || anVar.isInPreviewMode() || anVar.V9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.t0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
            if (messageObject.j0) {
                return;
            }
        }
        org.telegram.messenger.ij ijVar = messageObject;
        if ((ijVar.k instanceof TLRPC.TL_message_secret) || !ijVar.z() || ijVar.h3() || ijVar.D == 27) {
            return;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.w(26, anVar.e)) {
            ch.k0.b(false);
            String Q = anVar.getMediaDataController().Q();
            if (Q.startsWith("animated_")) {
                z9 = anVar.j6 >= 0;
                if (!z9 && (chatFull2 = anVar.p8) != null) {
                    z9 = org.telegram.messenger.t3.v0(chatFull2, Q);
                }
                if (z9) {
                    anVar.Ab(view, ijVar, null, null, f10, f11, ch.o0.b(Q), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) anVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction == null || ijVar.s4()) {
                return;
            }
            z9 = anVar.j6 >= 0;
            if (!z9 && (chatFull = anVar.p8) != null) {
                z9 = org.telegram.messenger.t3.v0(chatFull, tL_availableReaction.reaction);
            }
            if (z9) {
                anVar.Ab(view, ijVar, null, null, f10, f11, ch.o0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ni implements org.telegram.ui.Components.hj0 {
    public final /* synthetic */ an a;

    public ni(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Components.hj0
    public final boolean c1(View view) {
        boolean z10;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        an anVar = this.a;
        if (!anVar.X9() && (!((z10 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).Q2())) {
            String Q = anVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) anVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                boolean z11 = anVar.k6 >= 0;
                if (!z11 && (chatFull = anVar.q8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z11 = org.telegram.messenger.t3.w0(chatFull, Q);
                }
                if (z11) {
                    if (z10) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.t0) {
                        messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.l0 && !messageObject.o4() && messageObject.z() && !messageObject.Y2()) {
                        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                        if (!kVar.x() && !anVar.z() && !anVar.c() && !messageObject.r4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public final void f(float f10, float f11, int i7, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.messenger.gj messageObject2;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        an anVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        if (z10) {
            return;
        }
        anVar.Q4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.t0;
        if (z11 && (messageObject2 = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            TLRPC.MessageAction messageAction = messageObject2.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                if (tL_messageActionWalletTonConnectRequest.expires <= anVar.getConnectionsManager().getCurrentTime() || messageObject2.N3() || org.telegram.messenger.gj.B0(messageObject2.k) != 777000) {
                    return;
                }
                Activity parentActivity = anVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                long j3 = tL_messageActionWalletTonConnectRequest.session_id;
                int e12 = messageObject2.e1();
                e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                org.telegram.ui.Wallet.d2.q(parentActivity, i10, j3, e12, e6Var, null);
                return;
            }
        }
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            if (t0Var.getMessageObject().l0) {
                if (anVar.lb) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = t0Var.getMessageObject().k.date;
                bundle.putLong("dialog_id", anVar.k6);
                bundle.putLong("topic_id", anVar.b());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                i8 i8Var = new i8(0, i11, bundle);
                i8Var.O = anVar;
                anVar.presentFragment(i8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
            if (t0Var2.getMessageObject() != null && (t0Var2.getMessageObject().k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                anVar.getNotificationCenter().k(org.telegram.messenger.ns.n3, Long.valueOf(anVar.k6));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
            if (t0Var3.getMessageObject() != null && (t0Var3.getMessageObject().k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                org.telegram.messenger.g0.i3(new ai.v0(this, t0Var3.getMessageObject().N1(), 24), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar.x() || anVar.Y9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (anVar.t9.z(q1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !q1Var2.C2(f10);
                }
            }
            an.k2(anVar, view, z12, f10, f11);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1) || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) == null || messageObject.D != 27) {
            anVar.Y7(view, true, false, f10, f11, true, false, false);
            return;
        }
        messageObject.Y5();
        messageObject.M1 = true;
        q1Var.H1();
        view.requestLayout();
        if (i7 >= 0) {
            anVar.D0.g(i7);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public final void r0(View view, float f10, float f11) {
        org.telegram.messenger.gj messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        an anVar = this.a;
        if (anVar.getParentActivity() == null || anVar.z() || anVar.c() || anVar.isInPreviewMode() || anVar.X9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.t0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
            if (messageObject.l0) {
                return;
            }
        }
        org.telegram.messenger.gj gjVar = messageObject;
        if ((gjVar.k instanceof TLRPC.TL_message_secret) || !gjVar.z() || gjVar.g3() || gjVar.D == 27) {
            return;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.w(26, anVar.e)) {
            ch.l0.b(false);
            String Q = anVar.getMediaDataController().Q();
            if (Q.startsWith("animated_")) {
                z10 = anVar.k6 >= 0;
                if (!z10 && (chatFull2 = anVar.q8) != null) {
                    z10 = org.telegram.messenger.t3.w0(chatFull2, Q);
                }
                if (z10) {
                    anVar.Eb(view, gjVar, null, null, f10, f11, ch.p0.b(Q), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) anVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction == null || gjVar.r4()) {
                return;
            }
            z10 = anVar.k6 >= 0;
            if (!z10 && (chatFull = anVar.q8) != null) {
                z10 = org.telegram.messenger.t3.w0(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                anVar.Eb(view, gjVar, null, null, f10, f11, ch.p0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}

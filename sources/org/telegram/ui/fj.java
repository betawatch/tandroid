package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fj implements org.telegram.ui.Components.hk0 {
    public final /* synthetic */ un a;

    public fj(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void b(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.messenger.jj messageObject2;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        un unVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        if (z10) {
            return;
        }
        unVar.P4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.s0;
        if (z11 && (messageObject2 = ((org.telegram.ui.Cells.s0) view).getMessageObject()) != null) {
            TLRPC.MessageAction messageAction = messageObject2.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                if (tL_messageActionWalletTonConnectRequest.expires <= unVar.getConnectionsManager().getCurrentTime() || messageObject2.N3() || org.telegram.messenger.jj.B0(messageObject2.k) != 777000) {
                    return;
                }
                Activity parentActivity = unVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                long j10 = tL_messageActionWalletTonConnectRequest.session_id;
                int f12 = messageObject2.f1();
                p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                org.telegram.ui.Wallet.e2.q(parentActivity, i11, j10, f12, p6Var, null);
                return;
            }
        }
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
            if (s0Var.getMessageObject().j0) {
                if (unVar.ib) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i12 = s0Var.getMessageObject().k.date;
                bundle.putLong("dialog_id", unVar.j6);
                bundle.putLong("topic_id", unVar.b());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                h8 h8Var = new h8(0, i12, bundle);
                h8Var.N = unVar;
                unVar.presentFragment(h8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) view;
            if (s0Var2.getMessageObject() != null && (s0Var2.getMessageObject().k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                unVar.getNotificationCenter().k(org.telegram.messenger.zs.n3, Long.valueOf(unVar.j6));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.s0 s0Var3 = (org.telegram.ui.Cells.s0) view;
            if (s0Var3.getMessageObject() != null && (s0Var3.getMessageObject().k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                org.telegram.messenger.i0.h3(new ag.d3(this, s0Var3.getMessageObject().O1(), 16), 16L);
                return;
            }
        }
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar.u() || unVar.M9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (unVar.q9.z(q1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !q1Var2.y2(f7);
                }
            }
            un.i2(unVar, view, z12, f7, f10);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1) || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) == null || messageObject.D != 27) {
            unVar.Q7(view, true, false, f7, f10, true, false, false);
            return;
        }
        messageObject.W5();
        messageObject.K1 = true;
        q1Var.E1();
        view.requestLayout();
        if (i10 >= 0) {
            unVar.C0.g(i10);
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public final boolean h1(View view) {
        boolean z10;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.ActionBar.l lVar;
        TLRPC.ChatFull chatFull;
        un unVar = this.a;
        if (!unVar.L9() && (!((z10 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).M2())) {
            String Q = unVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) unVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                boolean z11 = unVar.j6 >= 0;
                if (!z11 && (chatFull = unVar.p8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z11 = org.telegram.messenger.w3.w0(chatFull, Q);
                }
                if (z11) {
                    if (z10) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.s0) {
                        messageObject = ((org.telegram.ui.Cells.s0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.j0 && !messageObject.o4() && messageObject.z() && !messageObject.Y2()) {
                        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                        if (!lVar.u() && !unVar.z() && !unVar.c() && !messageObject.r4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void q0(View view, float f7, float f10) {
        org.telegram.messenger.jj messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        un unVar = this.a;
        if (unVar.getParentActivity() == null || unVar.z() || unVar.c() || unVar.isInPreviewMode() || unVar.L9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.s0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.s0) view).getMessageObject();
            if (messageObject.j0) {
                return;
            }
        }
        org.telegram.messenger.jj jjVar = messageObject;
        if ((jjVar.k instanceof TLRPC.TL_message_secret) || !jjVar.z() || jjVar.g3() || jjVar.D == 27) {
            return;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat == null || org.telegram.messenger.w3.V(chat) || org.telegram.messenger.w3.w(26, unVar.e)) {
            sg.k0.b(false);
            String Q = unVar.getMediaDataController().Q();
            if (Q.startsWith("animated_")) {
                z10 = unVar.j6 >= 0;
                if (!z10 && (chatFull2 = unVar.p8) != null) {
                    z10 = org.telegram.messenger.w3.w0(chatFull2, Q);
                }
                if (z10) {
                    unVar.qb(view, jjVar, null, null, f7, f10, sg.o0.b(Q), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) unVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction == null || jjVar.r4()) {
                return;
            }
            z10 = unVar.j6 >= 0;
            if (!z10 && (chatFull = unVar.p8) != null) {
                z10 = org.telegram.messenger.w3.w0(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                unVar.qb(view, jjVar, null, null, f7, f10, sg.o0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}

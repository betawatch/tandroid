package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ji implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ wm a;

    public ji(wm wmVar) {
        this.a = wmVar;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(float f10, float f11, int i3, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.messenger.zi messageObject2;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        wm wmVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        if (z10) {
            return;
        }
        wmVar.Q4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.t0;
        if (z11 && (messageObject2 = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            TLRPC.MessageAction messageAction = messageObject2.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                if (tL_messageActionWalletTonConnectRequest.expires <= wmVar.getConnectionsManager().getCurrentTime() || messageObject2.O3() || org.telegram.messenger.zi.B0(messageObject2.k) != 777000) {
                    return;
                }
                Activity parentActivity = wmVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                long j10 = tL_messageActionWalletTonConnectRequest.session_id;
                int f12 = messageObject2.f1();
                e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                org.telegram.ui.Wallet.c2.q(parentActivity, i10, j10, f12, e6Var, null);
                return;
            }
        }
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            if (t0Var.getMessageObject().j0) {
                if (wmVar.jb) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = t0Var.getMessageObject().k.date;
                bundle.putLong("dialog_id", wmVar.k6);
                bundle.putLong("topic_id", wmVar.b());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                i8 i8Var = new i8(0, i11, bundle);
                i8Var.O = wmVar;
                wmVar.presentFragment(i8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
            if (t0Var2.getMessageObject() != null && (t0Var2.getMessageObject().k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                wmVar.getNotificationCenter().k(org.telegram.messenger.hs.n3, Long.valueOf(wmVar.k6));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
            if (t0Var3.getMessageObject() != null && (t0Var3.getMessageObject().k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                org.telegram.messenger.g0.i3(new cg.l0(this, t0Var3.getMessageObject().O1(), 23), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar.v() || wmVar.W9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (wmVar.r9.z(q1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !q1Var2.A2(f10);
                }
            }
            wm.j2(wmVar, view, z12, f10, f11);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1) || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) == null || messageObject.D != 27) {
            wmVar.X7(view, true, false, f10, f11, true, false, false);
            return;
        }
        messageObject.Z5();
        messageObject.K1 = true;
        q1Var.G1();
        view.requestLayout();
        if (i3 >= 0) {
            wmVar.D0.g(i3);
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public final boolean b1(View view) {
        boolean z10;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        wm wmVar = this.a;
        if (!wmVar.V9() && (!((z10 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).O2())) {
            String Q = wmVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) wmVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                boolean z11 = wmVar.k6 >= 0;
                if (!z11 && (chatFull = wmVar.q8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z11 = org.telegram.messenger.t3.v0(chatFull, Q);
                }
                if (z11) {
                    if (z10) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.t0) {
                        messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.j0 && !messageObject.p4() && messageObject.z() && !messageObject.Z2()) {
                        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                        if (!kVar.v() && !wmVar.z() && !wmVar.c() && !messageObject.s4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void r0(View view, float f10, float f11) {
        org.telegram.messenger.zi messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        wm wmVar = this.a;
        if (wmVar.getParentActivity() == null || wmVar.z() || wmVar.c() || wmVar.isInPreviewMode() || wmVar.V9()) {
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
        org.telegram.messenger.zi ziVar = messageObject;
        if ((ziVar.k instanceof TLRPC.TL_message_secret) || !ziVar.z() || ziVar.h3() || ziVar.D == 27) {
            return;
        }
        TLRPC.Chat chat = wmVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.w(26, wmVar.e)) {
            dh.j0.b(false);
            String Q = wmVar.getMediaDataController().Q();
            if (Q.startsWith("animated_")) {
                z10 = wmVar.k6 >= 0;
                if (!z10 && (chatFull2 = wmVar.q8) != null) {
                    z10 = org.telegram.messenger.t3.v0(chatFull2, Q);
                }
                if (z10) {
                    wmVar.Ab(view, ziVar, null, null, f10, f11, dh.n0.b(Q), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) wmVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction == null || ziVar.s4()) {
                return;
            }
            z10 = wmVar.k6 >= 0;
            if (!z10 && (chatFull = wmVar.q8) != null) {
                z10 = org.telegram.messenger.t3.v0(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                wmVar.Ab(view, ziVar, null, null, f10, f11, dh.n0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}

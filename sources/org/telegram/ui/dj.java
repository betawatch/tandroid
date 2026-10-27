package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dj implements org.telegram.ui.Components.bm0 {
    public final /* synthetic */ wn a;

    public dj(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.Components.bm0
    public final boolean c1(View view) {
        boolean z10;
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        wn wnVar = this.a;
        if (!wnVar.L9() && ((!((z10 = view instanceof org.telegram.ui.Cells.s1)) || !((org.telegram.ui.Cells.s1) view).u3()) && ((tL_availableReaction = wnVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = wnVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_"))))) {
            boolean z11 = wnVar.j6 >= 0;
            if (!z11 && (chatFull = wnVar.p8) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z11 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z11) {
                if (z10) {
                    messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    if (!kVar.q() && !wnVar.w() && !wnVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public final void e(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        wn wnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        if (z10) {
            return;
        }
        wnVar.P4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.v0;
        if (z11 && (messageObject2 = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                if (tL_messageActionWalletTonConnectRequest.expires <= wnVar.getConnectionsManager().getCurrentTime() || messageObject2.isOut() || messageObject2.getDialogId() != 777000) {
                    return;
                }
                Activity parentActivity = wnVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                long j10 = tL_messageActionWalletTonConnectRequest.session_id;
                int id2 = messageObject2.getId();
                u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                org.telegram.ui.Wallet.e2.o(parentActivity, i11, j10, id2, u6Var, null);
                return;
            }
        }
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            if (v0Var.getMessageObject().isDateObject) {
                if (wnVar.fb) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i12 = v0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", wnVar.j6);
                bundle.putLong("topic_id", wnVar.b());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                n8 n8Var = new n8(0, i12, bundle);
                n8Var.N = wnVar;
                wnVar.presentFragment(n8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            if (v0Var2.getMessageObject() != null && (v0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.j6));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
            if (v0Var3.getMessageObject() != null && (v0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new ag.r0(this, v0Var3.getMessageObject().getReplyMsgId(), 24), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (kVar.q() || wnVar.M9()) {
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                if (wnVar.s9.z(s1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !s1Var2.i3(f7);
                }
            }
            wn.f2(wnVar, view, z12, f7, f10);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.s1) || (messageObject = (s1Var = (org.telegram.ui.Cells.s1) view).getMessageObject()) == null || messageObject.type != 27) {
            wnVar.R7(view, true, false, f7, f10, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        s1Var.t2();
        view.requestLayout();
        if (i10 >= 0) {
            wnVar.A0.m(i10);
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public final void l0(View view, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null || wnVar.w() || wnVar.c() || wnVar.isInPreviewMode() || wnVar.L9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
            if (messageObject.isDateObject) {
                return;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (messageObject2.isSecret() || !messageObject2.canSetReaction() || messageObject2.isExpiredStory() || messageObject2.type == 27) {
            return;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(wnVar.e, 26)) {
            bh.s0.b(false);
            String doubleTapReaction = wnVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z10 = wnVar.j6 >= 0;
                if (!z10 && (chatFull2 = wnVar.p8) != null) {
                    z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z10) {
                    wnVar.nb(view, messageObject2, null, null, f7, f10, bh.x0.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = wnVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z10 = wnVar.j6 >= 0;
            if (!z10 && (chatFull = wnVar.p8) != null) {
                z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                wnVar.nb(view, messageObject2, null, null, f7, f10, bh.x0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}

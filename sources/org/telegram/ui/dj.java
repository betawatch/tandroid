package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dj implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ eo a;

    public dj(eo eoVar) {
        this.a = eoVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void c(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        eo eoVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        if (z10) {
            return;
        }
        eoVar.D4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.w0;
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            if (w0Var.getMessageObject().isDateObject) {
                if (eoVar.Oa) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = w0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", eoVar.T5);
                bundle.putLong("topic_id", eoVar.d());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                h8 h8Var = new h8(0, i11, bundle);
                h8Var.N = eoVar;
                eoVar.presentFragment(h8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(eoVar.T5));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
            if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new bi.s(this, w0Var3.getMessageObject().getReplyMsgId(), 18), 16L);
                return;
            }
        }
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar.s() || eoVar.A9()) {
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                if (eoVar.c9.A(t1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !t1Var2.i3(f7);
                }
            }
            eo.b2(eoVar, view, z12, f7, f10);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.t1) || (messageObject = (t1Var = (org.telegram.ui.Cells.t1) view).getMessageObject()) == null || messageObject.type != 27) {
            eoVar.I7(view, true, false, f7, f10, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        t1Var.t2();
        view.requestLayout();
        if (i10 >= 0) {
            eoVar.A0.m(i10);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean d1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.l lVar;
        TLRPC.ChatFull chatFull;
        eo eoVar = this.a;
        if (!eoVar.z9() && ((tL_availableReaction = eoVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = eoVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean z10 = eoVar.T5 >= 0;
            if (!z10 && (chatFull = eoVar.Z7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z10 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z10) {
                if (view instanceof org.telegram.ui.Cells.t1) {
                    messageObject = ((org.telegram.ui.Cells.t1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    if (!lVar.s() && !eoVar.u() && !eoVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void p0(View view, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        eo eoVar = this.a;
        if (eoVar.getParentActivity() == null || eoVar.u() || eoVar.c() || eoVar.isInPreviewMode() || eoVar.z9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            messageObject = ((org.telegram.ui.Cells.t1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.w0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
            if (messageObject.isDateObject) {
                return;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (messageObject2.isSecret() || !messageObject2.canSetReaction() || messageObject2.isExpiredStory() || messageObject2.type == 27) {
            return;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(eoVar.e, 26)) {
            yg.l0.b(false);
            String doubleTapReaction = eoVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z10 = eoVar.T5 >= 0;
                if (!z10 && (chatFull2 = eoVar.Z7) != null) {
                    z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z10) {
                    eoVar.ab(view, messageObject2, null, null, f7, f10, yg.p0.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = eoVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z10 = eoVar.T5 >= 0;
            if (!z10 && (chatFull = eoVar.Z7) != null) {
                z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                eoVar.ab(view, messageObject2, null, null, f7, f10, yg.p0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}

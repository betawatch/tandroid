package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pi implements org.telegram.ui.Components.nk0 {
    public final /* synthetic */ qn a;

    public pi(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Components.nk0
    public final void c(float f10, float f11, int i9, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        qn qnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        if (z10) {
            return;
        }
        qnVar.z4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.w0;
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            if (w0Var.getMessageObject().isDateObject) {
                if (qnVar.Ka) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i10 = w0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", qnVar.P5);
                bundle.putLong("topic_id", qnVar.b());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                g8 g8Var = new g8(0, i10, bundle);
                g8Var.J = qnVar;
                qnVar.presentFragment(g8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.P5));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
            if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new bg.c2(this, w0Var3.getMessageObject().getReplyMsgId(), 18), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar.s() || qnVar.A9()) {
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                if (qnVar.Y8.A(t1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !t1Var2.i3(f10);
                }
            }
            qn.b2(qnVar, view, z12, f10, f11);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.t1) || (messageObject = (t1Var = (org.telegram.ui.Cells.t1) view).getMessageObject()) == null || messageObject.type != 27) {
            qnVar.I7(view, true, false, f10, f11, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        t1Var.t2();
        view.requestLayout();
        if (i9 >= 0) {
            qnVar.w0.m(i9);
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public final boolean f1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        qn qnVar = this.a;
        if (!qnVar.z9() && ((tL_availableReaction = qnVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = qnVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean z10 = qnVar.P5 >= 0;
            if (!z10 && (chatFull = qnVar.V7) != null) {
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
                    kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    if (!kVar.s() && !qnVar.w() && !qnVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public final void g0(View view, float f10, float f11) {
        MessageObject messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null || qnVar.w() || qnVar.c() || qnVar.isInPreviewMode() || qnVar.z9()) {
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
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(qnVar.e, 26)) {
            hg.n0.b(false);
            String doubleTapReaction = qnVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z10 = qnVar.P5 >= 0;
                if (!z10 && (chatFull2 = qnVar.V7) != null) {
                    z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z10) {
                    qnVar.ab(view, messageObject2, null, null, f10, f11, hg.r0.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = qnVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z10 = qnVar.P5 >= 0;
            if (!z10 && (chatFull = qnVar.V7) != null) {
                z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                qnVar.ab(view, messageObject2, null, null, f10, f11, hg.r0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}

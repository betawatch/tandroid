package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bj implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ co a;

    public bj(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        co coVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
        if (z10) {
            return;
        }
        coVar.D4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.w0;
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            if (w0Var.getMessageObject().isDateObject) {
                if (coVar.Oa) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = w0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", coVar.T5);
                bundle.putLong("topic_id", coVar.d());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                h8 h8Var = new h8(0, i11, bundle);
                h8Var.N = coVar;
                coVar.presentFragment(h8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(coVar.T5));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
            if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new ah.g(this, w0Var3.getMessageObject().getReplyMsgId(), 20), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar.s() || coVar.A9()) {
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                if (coVar.c9.A(t1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !t1Var2.i3(f7);
                }
            }
            co.b2(coVar, view, z12, f7, f10);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.t1) || (messageObject = (t1Var = (org.telegram.ui.Cells.t1) view).getMessageObject()) == null || messageObject.type != 27) {
            coVar.I7(view, true, false, f7, f10, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        t1Var.t2();
        view.requestLayout();
        if (i10 >= 0) {
            coVar.A0.m(i10);
        }
    }

    @Override // org.telegram.ui.Components.al0
    public final boolean d1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        co coVar = this.a;
        if (!coVar.z9() && ((tL_availableReaction = coVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = coVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean z10 = coVar.T5 >= 0;
            if (!z10 && (chatFull = coVar.Z7) != null) {
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
                    kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    if (!kVar.s() && !coVar.v() && !coVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public final void q0(View view, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        co coVar = this.a;
        if (coVar.getParentActivity() == null || coVar.v() || coVar.c() || coVar.isInPreviewMode() || coVar.z9()) {
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
        TLRPC.Chat chat = coVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(coVar.e, 26)) {
            ah.e1.b(false);
            String doubleTapReaction = coVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z10 = coVar.T5 >= 0;
                if (!z10 && (chatFull2 = coVar.Z7) != null) {
                    z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z10) {
                    coVar.ab(view, messageObject2, null, null, f7, f10, ah.j1.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = coVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z10 = coVar.T5 >= 0;
            if (!z10 && (chatFull = coVar.Z7) != null) {
                z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                coVar.ab(view, messageObject2, null, null, f7, f10, ah.j1.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}

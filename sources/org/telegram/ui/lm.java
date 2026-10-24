package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.RichQuote;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.Cells.p9 {
    public sn w0;

    @Override // org.telegram.ui.Cells.ba
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        sn snVar = this.w0;
        if (snVar != null) {
            int min = Math.min(i11, snVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            in c10 = in.c(messageObject, i10, min);
            if (c10.i == null) {
                return;
            }
            gk gkVar = this.w0.Y;
            if (gkVar != null && gkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.o2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) this.w0).actionBar;
                    if (kVar2.s()) {
                        this.w0.C7(false);
                    }
                }
                this.w0.Ib(messageObject, c10);
                gk gkVar2 = this.w0.Y;
                if (gkVar2 != null) {
                    gkVar2.F0();
                    return;
                }
                return;
            }
            sn snVar2 = this.w0;
            snVar2.x5 = c10;
            snVar2.z5 = messageObject;
            snVar2.r5 = new MessagePreviewParams(snVar2.h != null, snVar2.D9(), ChatObject.isMonoForum(this.w0.e));
            sn snVar3 = this.w0;
            snVar3.r5.updateReply(snVar3.z5, snVar3.D8(messageObject.getGroupId()), this.w0.a(), this.w0.x5);
            Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", true);
            e.putInt("messagesCount", 1);
            e.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(e);
            sn snVar4 = this.w0;
            eyVar.C2 = snVar4;
            snVar4.presentFragment(eyVar);
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean b() {
        sn snVar;
        sn snVar2 = this.w0;
        if ((snVar2 != null && snVar2.a() == UserObject.VERIFY) || (snVar = this.w0) == null) {
            return true;
        }
        if (!DialogObject.isEncryptedDialog(snVar.a()) && this.w0.D9()) {
            return false;
        }
        org.telegram.ui.Cells.w9 w9Var = this.W;
        return w9Var == null || ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void c0(sn snVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = snVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean e() {
        org.telegram.ui.Cells.w9 w9Var;
        sn snVar;
        org.telegram.ui.Cells.w9 w9Var2;
        TLRPC.Chat chat;
        sn snVar2 = this.w0;
        if (snVar2 == null || snVar2.a() != UserObject.VERIFY) {
            sn snVar3 = this.w0;
            boolean z10 = (snVar3 != null && snVar3.D9()) || !((w9Var = this.W) == null || ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.s0 && (snVar = this.w0) != null && snVar.h == null && (((w9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.t1) this.W).getMessageObject())) && !this.w0.o9.q0))) && !this.w0.getMessagesController().getTranslateController().isTranslatingDialog(this.w0.f6) && !UserObject.isService(this.w0.f6) && (!z10 || (chat = this.w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int o() {
        sn snVar = this.w0;
        if (snVar == null) {
            return 0;
        }
        return snVar.Na;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int p() {
        sn snVar = this.w0;
        if (snVar == null) {
            return 0;
        }
        return (int) snVar.E9;
    }

    @Override // org.telegram.ui.Cells.ba
    public final org.telegram.ui.ActionBar.g6 q() {
        sn snVar = this.w0;
        if (snVar != null) {
            return snVar.qa;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.k6.w0(i10, this.w0.qa);
    }
}

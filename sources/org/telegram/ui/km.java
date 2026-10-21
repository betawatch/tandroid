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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.Cells.o9 {
    public qn w0;

    @Override // org.telegram.ui.Cells.aa
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        qn qnVar = this.w0;
        if (qnVar != null) {
            int min = Math.min(i11, qnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            gn c10 = gn.c(messageObject, i10, min);
            if (c10.i == null) {
                return;
            }
            fk fkVar = this.w0.Y;
            if (fkVar != null && fkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) this.w0).actionBar;
                    if (kVar2.t()) {
                        this.w0.C7(false);
                    }
                }
                this.w0.Hb(messageObject, c10);
                fk fkVar2 = this.w0.Y;
                if (fkVar2 != null) {
                    fkVar2.F0();
                    return;
                }
                return;
            }
            qn qnVar2 = this.w0;
            qnVar2.l5 = c10;
            qnVar2.n5 = messageObject;
            qnVar2.f5 = new MessagePreviewParams(qnVar2.h != null, qnVar2.D9(), ChatObject.isMonoForum(this.w0.e));
            qn qnVar3 = this.w0;
            qnVar3.f5.updateReply(qnVar3.n5, qnVar3.D8(messageObject.getGroupId()), this.w0.a(), this.w0.l5);
            Bundle d = org.telegram.messenger.mk.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", true);
            d.putInt("messagesCount", 1);
            d.putBoolean("canSelectTopics", true);
            cy cyVar = new cy(d);
            qn qnVar4 = this.w0;
            cyVar.C2 = qnVar4;
            qnVar4.presentFragment(cyVar);
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean b() {
        qn qnVar;
        qn qnVar2 = this.w0;
        if ((qnVar2 != null && qnVar2.a() == UserObject.VERIFY) || (qnVar = this.w0) == null) {
            return true;
        }
        if (!DialogObject.isEncryptedDialog(qnVar.a()) && this.w0.D9()) {
            return false;
        }
        org.telegram.ui.Cells.v9 v9Var = this.W;
        return v9Var == null || ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void c0(qn qnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = qnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean e() {
        org.telegram.ui.Cells.v9 v9Var;
        qn qnVar;
        org.telegram.ui.Cells.v9 v9Var2;
        TLRPC.Chat chat;
        qn qnVar2 = this.w0;
        if (qnVar2 == null || qnVar2.a() != UserObject.VERIFY) {
            qn qnVar3 = this.w0;
            boolean z10 = (qnVar3 != null && qnVar3.D9()) || !((v9Var = this.W) == null || ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.s0 && (qnVar = this.w0) != null && qnVar.h == null && (((v9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.u1) this.W).getMessageObject())) && !this.w0.c9.q0))) && !this.w0.getMessagesController().getTranslateController().isTranslatingDialog(this.w0.T5) && !UserObject.isService(this.w0.T5) && (!z10 || (chat = this.w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int o() {
        qn qnVar = this.w0;
        if (qnVar == null) {
            return 0;
        }
        return qnVar.Ba;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int p() {
        qn qnVar = this.w0;
        if (qnVar == null) {
            return 0;
        }
        return (int) qnVar.s9;
    }

    @Override // org.telegram.ui.Cells.aa
    public final org.telegram.ui.ActionBar.d6 q() {
        qn qnVar = this.w0;
        if (qnVar != null) {
            return qnVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.w0.ea);
    }
}

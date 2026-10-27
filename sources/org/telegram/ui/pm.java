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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pm extends org.telegram.ui.Cells.t9 {
    public wn w0;

    @Override // org.telegram.ui.Cells.fa
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages K8;
        wn wnVar = this.w0;
        if (wnVar != null) {
            int min = Math.min(i11, wnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (K8 = this.w0.K8(messageObject.getGroupId())) != null && !K8.isDocuments) {
                messageObject = K8.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            mn c10 = mn.c(messageObject, i10, min);
            if (c10.i == null) {
                return;
            }
            jk jkVar = this.w0.Y;
            if (jkVar != null && jkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.r2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) this.w0).actionBar;
                    if (kVar2.q()) {
                        this.w0.I7(false);
                    }
                }
                this.w0.Sb(messageObject, c10);
                jk jkVar2 = this.w0.Y;
                if (jkVar2 != null) {
                    jkVar2.E0();
                    return;
                }
                return;
            }
            wn wnVar2 = this.w0;
            wnVar2.B5 = c10;
            wnVar2.D5 = messageObject;
            wnVar2.v5 = new MessagePreviewParams(wnVar2.h != null, wnVar2.K9(), ChatObject.isMonoForum(this.w0.e));
            wn wnVar3 = this.w0;
            wnVar3.v5.updateReply(wnVar3.D5, wnVar3.K8(messageObject.getGroupId()), this.w0.a(), this.w0.B5);
            Bundle c11 = org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true);
            c11.putBoolean("quote", true);
            c11.putInt("messagesCount", 1);
            c11.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(c11);
            wn wnVar4 = this.w0;
            eyVar.C2 = wnVar4;
            wnVar4.presentFragment(eyVar);
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean b() {
        wn wnVar;
        wn wnVar2 = this.w0;
        if ((wnVar2 != null && wnVar2.a() == UserObject.VERIFY) || (wnVar = this.w0) == null) {
            return true;
        }
        if (!DialogObject.isEncryptedDialog(wnVar.a()) && this.w0.K9()) {
            return false;
        }
        org.telegram.ui.Cells.aa aaVar = this.W;
        return aaVar == null || ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() == null || ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void c0(wn wnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = wnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean e() {
        org.telegram.ui.Cells.aa aaVar;
        wn wnVar;
        org.telegram.ui.Cells.aa aaVar2;
        TLRPC.Chat chat;
        wn wnVar2 = this.w0;
        if (wnVar2 == null || wnVar2.a() != UserObject.VERIFY) {
            wn wnVar3 = this.w0;
            boolean z10 = (wnVar3 != null && wnVar3.K9()) || !((aaVar = this.W) == null || ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() == null || ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.s0 && (wnVar = this.w0) != null && wnVar.h == null && (((aaVar2 = this.W) == null || (((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.s1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.s1) this.W).getMessageObject())) && !this.w0.s9.q0))) && !this.w0.getMessagesController().getTranslateController().isTranslatingDialog(this.w0.j6) && !UserObject.isService(this.w0.j6) && (!z10 || (chat = this.w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int o() {
        wn wnVar = this.w0;
        if (wnVar == null) {
            return 0;
        }
        return wnVar.Ra;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int p() {
        wn wnVar = this.w0;
        if (wnVar == null) {
            return 0;
        }
        return (int) wnVar.I9;
    }

    @Override // org.telegram.ui.Cells.fa
    public final org.telegram.ui.ActionBar.u6 q() {
        wn wnVar = this.w0;
        if (wnVar != null) {
            return wnVar.ua;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.w0.ua);
    }
}

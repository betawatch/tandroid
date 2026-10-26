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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nm extends org.telegram.ui.Cells.t9 {
    public un w0;

    @Override // org.telegram.ui.Cells.fa
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages H8;
        un unVar = this.w0;
        if (unVar != null) {
            int min = Math.min(i11, unVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (H8 = this.w0.H8(messageObject.getGroupId())) != null && !H8.isDocuments) {
                messageObject = H8.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            kn c10 = kn.c(messageObject, i10, min);
            if (c10.i == null) {
                return;
            }
            hk hkVar = this.w0.Y;
            if (hkVar != null && hkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.r2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) this.w0).actionBar;
                    if (kVar2.q()) {
                        this.w0.G7(false);
                    }
                }
                this.w0.Ob(messageObject, c10);
                hk hkVar2 = this.w0.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    return;
                }
                return;
            }
            un unVar2 = this.w0;
            unVar2.x5 = c10;
            unVar2.z5 = messageObject;
            unVar2.r5 = new MessagePreviewParams(unVar2.h != null, unVar2.H9(), ChatObject.isMonoForum(this.w0.e));
            un unVar3 = this.w0;
            unVar3.r5.updateReply(unVar3.z5, unVar3.H8(messageObject.getGroupId()), this.w0.a(), this.w0.x5);
            Bundle c11 = org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true);
            c11.putBoolean("quote", true);
            c11.putInt("messagesCount", 1);
            c11.putBoolean("canSelectTopics", true);
            cy cyVar = new cy(c11);
            un unVar4 = this.w0;
            cyVar.C2 = unVar4;
            unVar4.presentFragment(cyVar);
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean b() {
        un unVar;
        un unVar2 = this.w0;
        if ((unVar2 != null && unVar2.a() == UserObject.VERIFY) || (unVar = this.w0) == null) {
            return true;
        }
        if (!DialogObject.isEncryptedDialog(unVar.a()) && this.w0.H9()) {
            return false;
        }
        org.telegram.ui.Cells.aa aaVar = this.W;
        return aaVar == null || ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() == null || ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void c0(un unVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = unVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean e() {
        org.telegram.ui.Cells.aa aaVar;
        un unVar;
        org.telegram.ui.Cells.aa aaVar2;
        TLRPC.Chat chat;
        un unVar2 = this.w0;
        if (unVar2 == null || unVar2.a() != UserObject.VERIFY) {
            un unVar3 = this.w0;
            boolean z10 = (unVar3 != null && unVar3.H9()) || !((aaVar = this.W) == null || ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() == null || ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.s0 && (unVar = this.w0) != null && unVar.h == null && (((aaVar2 = this.W) == null || (((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.s1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.s1) this.W).getMessageObject())) && !this.w0.o9.q0))) && !this.w0.getMessagesController().getTranslateController().isTranslatingDialog(this.w0.f6) && !UserObject.isService(this.w0.f6) && (!z10 || (chat = this.w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int o() {
        un unVar = this.w0;
        if (unVar == null) {
            return 0;
        }
        return unVar.Na;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int p() {
        un unVar = this.w0;
        if (unVar == null) {
            return 0;
        }
        return (int) unVar.E9;
    }

    @Override // org.telegram.ui.Cells.fa
    public final org.telegram.ui.ActionBar.u6 q() {
        un unVar = this.w0;
        if (unVar != null) {
            return unVar.qa;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.w0.qa);
    }
}

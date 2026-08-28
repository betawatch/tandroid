package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.Cells.o9 {
    public qn B0;

    @Override // org.telegram.ui.Cells.aa
    public final void J(int i9, int i10, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        qn qnVar = this.B0;
        if (qnVar != null) {
            int min = Math.min(i10, qnVar.getMessagesController().quoteLengthMax + i9);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            gn b10 = gn.b(i9, min, messageObject);
            if (b10.i == null) {
                return;
            }
            ak akVar = this.B0.U;
            if (akVar != null && akVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.o2) this.B0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) this.B0).actionBar;
                    if (kVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Cb(messageObject, b10);
                ak akVar2 = this.B0.U;
                if (akVar2 != null) {
                    akVar2.G0();
                    return;
                }
                return;
            }
            qn qnVar2 = this.B0;
            qnVar2.h5 = b10;
            qnVar2.j5 = messageObject;
            qnVar2.b5 = new MessagePreviewParams(qnVar2.h != null, qnVar2.y9(), ChatObject.isMonoForum(this.B0.e));
            qn qnVar3 = this.B0;
            qnVar3.b5.updateReply(qnVar3.j5, qnVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.h5);
            Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
            e10.putBoolean("quote", true);
            e10.putInt("messagesCount", 1);
            e10.putBoolean("canSelectTopics", true);
            dy dyVar = new dy(e10);
            qn qnVar4 = this.B0;
            dyVar.y2 = qnVar4;
            qnVar4.presentFragment(dyVar);
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean b() {
        qn qnVar;
        qn qnVar2 = this.B0;
        if ((qnVar2 != null && qnVar2.a() == UserObject.VERIFY) || (qnVar = this.B0) == null) {
            return true;
        }
        if (qnVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.v9 v9Var = this.W;
        return v9Var == null || ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(qn qnVar) {
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i9 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = qnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i9))).cancel();
            i9++;
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean e() {
        org.telegram.ui.Cells.v9 v9Var;
        qn qnVar;
        org.telegram.ui.Cells.v9 v9Var2;
        TLRPC.Chat chat;
        qn qnVar2 = this.B0;
        if (qnVar2 == null || qnVar2.a() != UserObject.VERIFY) {
            qn qnVar3 = this.B0;
            boolean z10 = (qnVar3 != null && qnVar3.y9()) || !((v9Var = this.W) == null || ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (qnVar = this.B0) != null && qnVar.h == null && (((v9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.Y8.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.P5) && !UserObject.isService(this.B0.P5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int p() {
        qn qnVar = this.B0;
        if (qnVar == null) {
            return 0;
        }
        return qnVar.wa;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int q() {
        qn qnVar = this.B0;
        if (qnVar == null) {
            return 0;
        }
        return (int) qnVar.o9;
    }

    @Override // org.telegram.ui.Cells.aa
    public final org.telegram.ui.ActionBar.b6 r() {
        qn qnVar = this.B0;
        if (qnVar != null) {
            return qnVar.aa;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int u(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.B0.aa);
    }
}

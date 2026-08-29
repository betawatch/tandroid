package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.Cells.l9 {
    public tn B0;

    @Override // org.telegram.ui.Cells.x9
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        MessageObject.GroupedMessages y8;
        tn tnVar = this.B0;
        if (tnVar != null) {
            int min = Math.min(i11, tnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y8 = this.B0.y8(messageObject.getGroupId())) != null && !y8.isDocuments) {
                messageObject = y8.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            jn b10 = jn.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            dk dkVar = this.B0.U;
            if (dkVar != null && dkVar.getVisibility() == 0) {
                lVar = ((org.telegram.ui.ActionBar.o2) this.B0).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) this.B0).actionBar;
                    if (lVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Cb(messageObject, b10);
                dk dkVar2 = this.B0.U;
                if (dkVar2 != null) {
                    dkVar2.H0();
                    return;
                }
                return;
            }
            tn tnVar2 = this.B0;
            tnVar2.h5 = b10;
            tnVar2.j5 = messageObject;
            tnVar2.b5 = new MessagePreviewParams(tnVar2.h != null, tnVar2.y9(), ChatObject.isMonoForum(this.B0.e));
            tn tnVar3 = this.B0;
            tnVar3.b5.updateReply(tnVar3.j5, tnVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.h5);
            Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
            e10.putBoolean("quote", true);
            e10.putInt("messagesCount", 1);
            e10.putBoolean("canSelectTopics", true);
            fy fyVar = new fy(e10);
            tn tnVar4 = this.B0;
            fyVar.y2 = tnVar4;
            tnVar4.presentFragment(fyVar);
        }
    }

    @Override // org.telegram.ui.Cells.x9
    public final boolean b() {
        tn tnVar;
        tn tnVar2 = this.B0;
        if ((tnVar2 != null && tnVar2.a() == UserObject.VERIFY) || (tnVar = this.B0) == null) {
            return true;
        }
        if (tnVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.s9 s9Var = this.W;
        return s9Var == null || ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() == null || ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(tn tnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = tnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.x9
    public final boolean e() {
        org.telegram.ui.Cells.s9 s9Var;
        tn tnVar;
        org.telegram.ui.Cells.s9 s9Var2;
        TLRPC.Chat chat;
        tn tnVar2 = this.B0;
        if (tnVar2 == null || tnVar2.a() != UserObject.VERIFY) {
            tn tnVar3 = this.B0;
            boolean z10 = (tnVar3 != null && tnVar3.y9()) || !((s9Var = this.W) == null || ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() == null || ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (tnVar = this.B0) != null && tnVar.h == null && (((s9Var2 = this.W) == null || (((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().richLayout == null && !this.B0.Y8.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.P5) && !UserObject.isService(this.B0.P5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int p() {
        tn tnVar = this.B0;
        if (tnVar == null) {
            return 0;
        }
        return tnVar.wa;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int q() {
        tn tnVar = this.B0;
        if (tnVar == null) {
            return 0;
        }
        return (int) tnVar.o9;
    }

    @Override // org.telegram.ui.Cells.x9
    public final org.telegram.ui.ActionBar.c6 r() {
        tn tnVar = this.B0;
        if (tnVar != null) {
            return tnVar.aa;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.B0.aa);
    }
}

package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.RichQuote;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class mm extends org.telegram.ui.Cells.o9 {
    public sn w0;

    @Override // org.telegram.ui.Cells.aa
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
            hk hkVar = this.w0.Y;
            if (hkVar != null && hkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) this.w0).actionBar;
                    if (kVar2.s()) {
                        this.w0.C7(false);
                    }
                }
                this.w0.Gb(messageObject, c10);
                hk hkVar2 = this.w0.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    return;
                }
                return;
            }
            sn snVar2 = this.w0;
            snVar2.l5 = c10;
            snVar2.n5 = messageObject;
            snVar2.f5 = new MessagePreviewParams(snVar2.h != null, snVar2.D9(), ChatObject.isMonoForum(this.w0.e));
            sn snVar3 = this.w0;
            snVar3.f5.updateReply(snVar3.n5, snVar3.D8(messageObject.getGroupId()), this.w0.a(), this.w0.l5);
            Bundle d = org.telegram.messenger.kk.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", true);
            d.putInt("messagesCount", 1);
            d.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(d);
            sn snVar4 = this.w0;
            eyVar.C2 = snVar4;
            snVar4.presentFragment(eyVar);
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean b() {
        sn snVar;
        sn snVar2 = this.w0;
        if ((snVar2 != null && snVar2.a() == UserObject.VERIFY) || (snVar = this.w0) == null) {
            return true;
        }
        if (snVar.a() < 0 && this.w0.getMessagesController().isPeerNoForwards(this.w0.a())) {
            return false;
        }
        org.telegram.ui.Cells.v9 v9Var = this.W;
        return v9Var == null || ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards;
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

    @Override // org.telegram.ui.Cells.aa
    public final boolean e() {
        org.telegram.ui.Cells.v9 v9Var;
        sn snVar;
        org.telegram.ui.Cells.v9 v9Var2;
        TLRPC.Chat chat;
        sn snVar2 = this.w0;
        if (snVar2 == null || snVar2.a() != UserObject.VERIFY) {
            sn snVar3 = this.w0;
            boolean z10 = (snVar3 != null && snVar3.D9()) || !((v9Var = this.W) == null || ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.s0 && (snVar = this.w0) != null && snVar.h == null && (((v9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.u1) this.W).getMessageObject())) && !this.w0.c9.q0))) && !this.w0.getMessagesController().getTranslateController().isTranslatingDialog(this.w0.T5) && !UserObject.isService(this.w0.T5) && (!z10 || (chat = this.w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int o() {
        sn snVar = this.w0;
        if (snVar == null) {
            return 0;
        }
        return snVar.Ba;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int p() {
        sn snVar = this.w0;
        if (snVar == null) {
            return 0;
        }
        return (int) snVar.s9;
    }

    @Override // org.telegram.ui.Cells.aa
    public final org.telegram.ui.ActionBar.d6 q() {
        sn snVar = this.w0;
        if (snVar != null) {
            return snVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.w0.ea);
    }
}

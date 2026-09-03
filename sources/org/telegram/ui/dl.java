package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dl implements org.telegram.ui.Components.ok0 {
    public final /* synthetic */ zn a;

    public dl(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean i() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        TLRPC.Document f10;
        boolean z11;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.Message message;
        zn znVar = this.a;
        SparseArray[] sparseArrayArr = znVar.T5;
        if (znVar.Ya == null) {
            return;
        }
        if (znVar.a() == znVar.getUserConfig().getClientUserId() && !znVar.getUserConfig().isPremium()) {
            new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 24, true).show();
            znVar.z7(false);
            return;
        }
        boolean contains = znVar.Ya.getSelectedReactions().contains(q0Var);
        HashSet hashSet2 = new HashSet();
        int i12 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i13 = 0;
        while (i12 < sparseArrayArr.length) {
            boolean z14 = z12;
            boolean z15 = z13;
            int i14 = i13;
            int i15 = 0;
            while (i15 < sparseArrayArr[i12].size()) {
                MessageObject messageObject2 = (MessageObject) sparseArrayArr[i12].valueAt(i15);
                if (messageObject2.hasValidGroupId()) {
                    MessageObject.GroupedMessages X8 = znVar.X8(messageObject2);
                    if (X8 != null && !hashSet2.contains(Long.valueOf(X8.groupId))) {
                        hashSet2.add(Long.valueOf(X8.groupId));
                        messageObject2 = X8.findPrimaryMessageObject();
                    }
                    z11 = contains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                    i15 = i11 + 1;
                    hashSet2 = hashSet;
                    contains = z11;
                    i12 = i10;
                }
                if (messageObject2.hasReaction(q0Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z11 = contains;
                    i10 = i12;
                    i11 = i15;
                    znVar.ab(znVar.q8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, q0Var, false, false, false, true);
                    if (!z11) {
                        i14++;
                    }
                } else {
                    z11 = contains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                    messageObject = messageObject2;
                }
                if (messageObject.messageOwner != null) {
                    boolean z16 = znVar.x0.K;
                    if (z16) {
                        MessageObject messageObject3 = (MessageObject) znVar.l6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z16 && znVar.n3 != null) {
                        z14 = true;
                    }
                }
                if (znVar.x0.K && !messageObject.hasReaction(znVar.n3)) {
                    MessageObject.GroupedMessages X82 = znVar.X8(messageObject);
                    if (X82 != null) {
                        for (int i16 = 0; i16 < X82.messages.size(); i16++) {
                            znVar.getMediaDataController().removeMessageFromResults(X82.messages.get(i16).getId());
                        }
                    } else {
                        znVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    tf.y0 y0Var = znVar.J3;
                    if (y0Var != null) {
                        y0Var.l();
                    }
                    z14 = true;
                    z15 = true;
                }
                i15 = i11 + 1;
                hashSet2 = hashSet;
                contains = z11;
                i12 = i10;
            }
            i12++;
            z12 = z14;
            z13 = z15;
            i13 = i14;
        }
        if (z12) {
            znVar.kc(z13);
        }
        znVar.z7(true);
        if (i13 > 0) {
            long j10 = q0Var.g;
            if (j10 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    f10 = tL_availableReaction.activate_animation;
                }
            } else {
                f10 = org.telegram.ui.Components.l5.f(UserConfig.selectedAccount, j10);
            }
            if (f10 == null) {
                return;
            }
            org.telegram.ui.Components.qc.a0(znVar).y(i13, f10, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}

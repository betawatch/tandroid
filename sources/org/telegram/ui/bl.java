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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class bl implements org.telegram.ui.Components.rk0 {
    public final /* synthetic */ yn a;

    public bl(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean B() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean K() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.rk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        TLRPC.Document f7;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.Message message;
        yn ynVar = this.a;
        SparseArray[] sparseArrayArr = ynVar.U5;
        if (ynVar.Ya == null) {
            return;
        }
        if (ynVar.a() == ynVar.getUserConfig().getClientUserId() && !ynVar.getUserConfig().isPremium()) {
            new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 24, true).show();
            ynVar.z7(false);
            return;
        }
        boolean contains = ynVar.Ya.getSelectedReactions().contains(m0Var);
        HashSet hashSet2 = new HashSet();
        int i12 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i13 = 0;
        while (i12 < sparseArrayArr.length) {
            boolean z15 = z13;
            boolean z16 = z14;
            int i14 = i13;
            int i15 = 0;
            while (i15 < sparseArrayArr[i12].size()) {
                MessageObject messageObject2 = (MessageObject) sparseArrayArr[i12].valueAt(i15);
                if (messageObject2.hasValidGroupId()) {
                    MessageObject.GroupedMessages Y8 = ynVar.Y8(messageObject2);
                    if (Y8 != null && !hashSet2.contains(Long.valueOf(Y8.groupId))) {
                        hashSet2.add(Long.valueOf(Y8.groupId));
                        messageObject2 = Y8.findPrimaryMessageObject();
                    }
                    z12 = contains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                    i15 = i11 + 1;
                    hashSet2 = hashSet;
                    contains = z12;
                    i12 = i10;
                }
                if (messageObject2.hasReaction(m0Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z12 = contains;
                    i10 = i12;
                    i11 = i15;
                    ynVar.Za(ynVar.q8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, m0Var, false, false, false, true);
                    if (!z12) {
                        i14++;
                    }
                } else {
                    z12 = contains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                    messageObject = messageObject2;
                }
                if (messageObject.messageOwner != null) {
                    boolean z17 = ynVar.y0.N;
                    if (z17) {
                        MessageObject messageObject3 = (MessageObject) ynVar.m6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z17 && ynVar.o3 != null) {
                        z15 = true;
                    }
                }
                if (ynVar.y0.N && !messageObject.hasReaction(ynVar.o3)) {
                    MessageObject.GroupedMessages Y82 = ynVar.Y8(messageObject);
                    if (Y82 != null) {
                        for (int i16 = 0; i16 < Y82.messages.size(); i16++) {
                            ynVar.getMediaDataController().removeMessageFromResults(Y82.messages.get(i16).getId());
                        }
                    } else {
                        ynVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    gg.o1 o1Var = ynVar.K3;
                    if (o1Var != null) {
                        o1Var.l();
                    }
                    z15 = true;
                    z16 = true;
                }
                i15 = i11 + 1;
                hashSet2 = hashSet;
                contains = z12;
                i12 = i10;
            }
            i12++;
            z13 = z15;
            z14 = z16;
            i13 = i14;
        }
        if (z13) {
            ynVar.jc(z14);
        }
        ynVar.z7(true);
        if (i13 > 0) {
            long j3 = m0Var.g;
            if (j3 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(m0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    f7 = tL_availableReaction.activate_animation;
                }
            } else {
                f7 = org.telegram.ui.Components.q5.f(UserConfig.selectedAccount, j3);
            }
            if (f7 == null) {
                return;
            }
            org.telegram.ui.Components.yc.a0(ynVar).y(i13, f7, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void I() {
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

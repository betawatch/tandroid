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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bl implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ wn a;

    public bl(wn wnVar) {
        this.a = wnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        TLRPC.Document f7;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.Message message;
        wn wnVar = this.a;
        SparseArray[] sparseArrayArr = wnVar.W5;
        if (wnVar.ab == null) {
            return;
        }
        if (wnVar.a() == wnVar.getUserConfig().getClientUserId() && !wnVar.getUserConfig().isPremium()) {
            new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 24, true).show();
            wnVar.z7(false);
            return;
        }
        boolean contains = wnVar.ab.getSelectedReactions().contains(o0Var);
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
                    MessageObject.GroupedMessages X8 = wnVar.X8(messageObject2);
                    if (X8 != null && !hashSet2.contains(Long.valueOf(X8.groupId))) {
                        hashSet2.add(Long.valueOf(X8.groupId));
                        messageObject2 = X8.findPrimaryMessageObject();
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
                if (messageObject2.hasReaction(o0Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z12 = contains;
                    i10 = i12;
                    i11 = i15;
                    wnVar.ab(wnVar.q8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, o0Var, false, false, false, true);
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
                    boolean z17 = wnVar.A0.N;
                    if (z17) {
                        MessageObject messageObject3 = (MessageObject) wnVar.o6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z17 && wnVar.q3 != null) {
                        z15 = true;
                    }
                }
                if (wnVar.A0.N && !messageObject.hasReaction(wnVar.q3)) {
                    MessageObject.GroupedMessages X82 = wnVar.X8(messageObject);
                    if (X82 != null) {
                        for (int i16 = 0; i16 < X82.messages.size(); i16++) {
                            wnVar.getMediaDataController().removeMessageFromResults(X82.messages.get(i16).getId());
                        }
                    } else {
                        wnVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    gg.o1 o1Var = wnVar.M3;
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
            wnVar.kc(z14);
        }
        wnVar.z7(true);
        if (i13 > 0) {
            long j3 = o0Var.g;
            if (j3 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(o0Var.f);
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
            org.telegram.ui.Components.xc.a0(wnVar).y(i13, f7, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

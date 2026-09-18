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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class el implements org.telegram.ui.Components.fk0 {
    public final /* synthetic */ bo a;

    public el(bo boVar) {
        this.a = boVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.fk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.Document f7;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.Message message;
        bo boVar = this.a;
        SparseArray[] sparseArrayArr = boVar.W5;
        if (boVar.ab == null) {
            return;
        }
        if (boVar.a() == boVar.getUserConfig().getClientUserId() && !boVar.getUserConfig().isPremium()) {
            new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 24, true).show();
            boVar.z7(false);
            return;
        }
        boolean contains = boVar.ab.getSelectedReactions().contains(p0Var);
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
                    MessageObject.GroupedMessages X8 = boVar.X8(messageObject2);
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
                if (messageObject2.hasReaction(p0Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z12 = contains;
                    i10 = i12;
                    i11 = i15;
                    boVar.ab(boVar.q8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, p0Var, false, false, false, true);
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
                    boolean z17 = boVar.A0.N;
                    if (z17) {
                        MessageObject messageObject3 = (MessageObject) boVar.o6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z17 && boVar.q3 != null) {
                        z15 = true;
                    }
                }
                if (boVar.A0.N && !messageObject.hasReaction(boVar.q3)) {
                    MessageObject.GroupedMessages X82 = boVar.X8(messageObject);
                    if (X82 != null) {
                        for (int i16 = 0; i16 < X82.messages.size(); i16++) {
                            boVar.getMediaDataController().removeMessageFromResults(X82.messages.get(i16).getId());
                        }
                    } else {
                        boVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    gg.o1 o1Var = boVar.M3;
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
            boVar.kc(z14);
        }
        boVar.z7(true);
        if (i13 > 0) {
            long j3 = p0Var.g;
            if (j3 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    f7 = tL_availableReaction.activate_animation;
                }
            } else {
                f7 = org.telegram.ui.Components.o5.f(UserConfig.selectedAccount, j3);
            }
            if (f7 == null) {
                return;
            }
            org.telegram.ui.Components.vc.a0(boVar).y(i13, f7, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

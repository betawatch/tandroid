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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class el implements org.telegram.ui.Components.ek0 {
    public final /* synthetic */ co a;

    public el(co coVar) {
        this.a = coVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.ek0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        TLRPC.Document f7;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.Message message;
        co coVar = this.a;
        SparseArray[] sparseArrayArr = coVar.W5;
        if (coVar.bb == null) {
            return;
        }
        if (coVar.a() == coVar.getUserConfig().getClientUserId() && !coVar.getUserConfig().isPremium()) {
            new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 24, true).show();
            coVar.z7(false);
            return;
        }
        boolean contains = coVar.bb.getSelectedReactions().contains(j1Var);
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
                    MessageObject.GroupedMessages X8 = coVar.X8(messageObject2);
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
                if (messageObject2.hasReaction(j1Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z12 = contains;
                    i10 = i12;
                    i11 = i15;
                    coVar.ab(coVar.q8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, j1Var, false, false, false, true);
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
                    boolean z17 = coVar.A0.N;
                    if (z17) {
                        MessageObject messageObject3 = (MessageObject) coVar.o6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z17 && coVar.q3 != null) {
                        z15 = true;
                    }
                }
                if (coVar.A0.N && !messageObject.hasReaction(coVar.q3)) {
                    MessageObject.GroupedMessages X82 = coVar.X8(messageObject);
                    if (X82 != null) {
                        for (int i16 = 0; i16 < X82.messages.size(); i16++) {
                            coVar.getMediaDataController().removeMessageFromResults(X82.messages.get(i16).getId());
                        }
                    } else {
                        coVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    hg.o1 o1Var = coVar.M3;
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
            coVar.kc(z14);
        }
        coVar.z7(true);
        if (i13 > 0) {
            long j3 = j1Var.g;
            if (j3 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(j1Var.f);
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
            org.telegram.ui.Components.yc.a0(coVar).y(i13, f7, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

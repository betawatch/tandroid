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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bl implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ wn a;

    public bl(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean o() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        TLRPC.Document f7;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.Message message;
        wn wnVar = this.a;
        SparseArray[] sparseArrayArr = wnVar.m6;
        if (wnVar.Ab == null) {
            return;
        }
        if (wnVar.a() == wnVar.getUserConfig().getClientUserId() && !wnVar.getUserConfig().isPremium()) {
            new tg.y0((org.telegram.ui.ActionBar.r2) wnVar, 24, true).show();
            wnVar.I7(false);
            return;
        }
        boolean contains = wnVar.Ab.getSelectedReactions().contains(x0Var);
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
                    MessageObject.GroupedMessages k92 = wnVar.k9(messageObject2);
                    if (k92 != null && !hashSet2.contains(Long.valueOf(k92.groupId))) {
                        hashSet2.add(Long.valueOf(k92.groupId));
                        messageObject2 = k92.findPrimaryMessageObject();
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
                if (messageObject2.hasReaction(x0Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z12 = contains;
                    i10 = i12;
                    i11 = i15;
                    wnVar.nb(wnVar.A8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, x0Var, false, false, false, true);
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
                        MessageObject messageObject3 = (MessageObject) wnVar.E6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z17 && wnVar.C3 != null) {
                        z15 = true;
                    }
                }
                if (wnVar.A0.N && !messageObject.hasReaction(wnVar.C3)) {
                    MessageObject.GroupedMessages k93 = wnVar.k9(messageObject);
                    if (k93 != null) {
                        for (int i16 = 0; i16 < k93.messages.size(); i16++) {
                            wnVar.getMediaDataController().removeMessageFromResults(k93.messages.get(i16).getId());
                        }
                    } else {
                        wnVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    ig.n1 n1Var = wnVar.Y3;
                    if (n1Var != null) {
                        n1Var.l();
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
            wnVar.Bc(z14);
        }
        wnVar.I7(true);
        if (i13 > 0) {
            long j10 = x0Var.g;
            if (j10 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(x0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    f7 = tL_availableReaction.activate_animation;
                }
            } else {
                f7 = org.telegram.ui.Components.t5.f(UserConfig.selectedAccount, j10);
            }
            if (f7 == null) {
                return;
            }
            org.telegram.ui.Components.wc.b0(wnVar).y(i13, f7, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

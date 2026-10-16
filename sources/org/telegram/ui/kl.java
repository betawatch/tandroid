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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kl implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ fo a;

    public kl(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean m() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        TLRPC.Document f7;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.Message message;
        fo foVar = this.a;
        SparseArray[] sparseArrayArr = foVar.W5;
        if (foVar.bb == null) {
            return;
        }
        if (foVar.a() == foVar.getUserConfig().getClientUserId() && !foVar.getUserConfig().isPremium()) {
            new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 24, true).show();
            foVar.C7(false);
            return;
        }
        boolean contains = foVar.bb.getSelectedReactions().contains(i1Var);
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
                    MessageObject.GroupedMessages c92 = foVar.c9(messageObject2);
                    if (c92 != null && !hashSet2.contains(Long.valueOf(c92.groupId))) {
                        hashSet2.add(Long.valueOf(c92.groupId));
                        messageObject2 = c92.findPrimaryMessageObject();
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
                if (messageObject2.hasReaction(i1Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z12 = contains;
                    i10 = i12;
                    i11 = i15;
                    foVar.eb(foVar.t8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, i1Var, false, false, false, true);
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
                    boolean z17 = foVar.A0.N;
                    if (z17) {
                        MessageObject messageObject3 = (MessageObject) foVar.o6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z17 && foVar.q3 != null) {
                        z15 = true;
                    }
                }
                if (foVar.A0.N && !messageObject.hasReaction(foVar.q3)) {
                    MessageObject.GroupedMessages c93 = foVar.c9(messageObject);
                    if (c93 != null) {
                        for (int i16 = 0; i16 < c93.messages.size(); i16++) {
                            foVar.getMediaDataController().removeMessageFromResults(c93.messages.get(i16).getId());
                        }
                    } else {
                        foVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    hg.n1 n1Var = foVar.M3;
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
            foVar.oc(z14);
        }
        foVar.C7(true);
        if (i13 > 0) {
            long j10 = i1Var.g;
            if (j10 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    f7 = tL_availableReaction.activate_animation;
                }
            } else {
                f7 = org.telegram.ui.Components.s5.f(UserConfig.selectedAccount, j10);
            }
            if (f7 == null) {
                return;
            }
            org.telegram.ui.Components.zc.a0(foVar).y(i13, f7, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void y() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

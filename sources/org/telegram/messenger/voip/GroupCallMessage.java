package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class GroupCallMessage {
    private static final int FLAG_IS_OUT = 1;
    private static final int FLAG_SEND_CONFIRMED = 8;
    private static final int FLAG_SEND_DELAYED = 2;
    private static final int FLAG_SEND_ERROR = 4;
    public final int currentAccount;
    private int flags;
    public final long fromId;
    private final ArrayList<Runnable> listeners = new ArrayList<>();
    public final TLRPC.TL_textWithEntities message;
    public final long randomId;
    public final long reactionAnimatedEmojiId;
    public final w49 visibleReaction;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCallMessage(int i, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j3;
        TLRPC.TL_availableReaction tL_availableReaction;
        w49 c;
        this.currentAccount = i;
        this.fromId = j;
        this.randomId = j2;
        this.message = tL_textWithEntities;
        ArrayList<TLRPC.MessageEntity> arrayList = tL_textWithEntities.entities;
        if (arrayList != null && arrayList.size() == 1) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(0);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                j3 = ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id;
                if (j3 == 0) {
                    c = new w49();
                    c.g = j3;
                    c.h = j3;
                } else {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = tL_textWithEntities.entities;
                    c = ((arrayList2 == null || arrayList2.isEmpty()) && (tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i).r.get(tL_textWithEntities.text)) != null) ? w49.c(tL_availableReaction) : null;
                }
                this.reactionAnimatedEmojiId = j3;
                this.visibleReaction = c;
            }
        }
        j3 = 0;
        if (j3 == 0) {
        }
        this.reactionAnimatedEmojiId = j3;
        this.visibleReaction = c;
    }

    public boolean isOut() {
        return vsd.a(this.flags, 1);
    }

    public boolean isSendConfirmed() {
        return vsd.a(this.flags, 8);
    }

    public boolean isSendDelayed() {
        return vsd.a(this.flags, 2);
    }

    public boolean isSendError() {
        return vsd.a(this.flags, 4);
    }

    public void notifyStateUpdate() {
        ArrayList<Runnable> arrayList = this.listeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Runnable runnable = arrayList.get(i);
            i++;
            runnable.run();
        }
    }

    public void setIsOut(boolean z) {
        this.flags = vsd.b(this.flags, 1, z);
    }

    public void setIsSendConfirmed(boolean z) {
        this.flags = vsd.b(this.flags, 8, z);
    }

    public void setIsSendDelayed(boolean z) {
        this.flags = vsd.b(this.flags, 2, z);
    }

    public void setIsSendError(boolean z) {
        this.flags = vsd.b(this.flags, 4, z);
    }

    public void subscribeToStateUpdates(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unsubscribeFromStateUpdates(Runnable runnable) {
        this.listeners.remove(runnable);
    }
}

package org.telegram.messenger.voip;

import java.util.ArrayList;
import k7.w8;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
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
    public final mg.q0 visibleReaction;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCallMessage(int i10, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j12;
        TLRPC.TL_availableReaction tL_availableReaction;
        mg.q0 c3;
        this.currentAccount = i10;
        this.fromId = j10;
        this.randomId = j11;
        this.message = tL_textWithEntities;
        ArrayList<TLRPC.MessageEntity> arrayList = tL_textWithEntities.entities;
        if (arrayList != null && arrayList.size() == 1) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(0);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                j12 = ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id;
                if (j12 == 0) {
                    c3 = new mg.q0();
                    c3.g = j12;
                    c3.h = j12;
                } else {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = tL_textWithEntities.entities;
                    c3 = ((arrayList2 == null || arrayList2.isEmpty()) && (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(tL_textWithEntities.text)) != null) ? mg.q0.c(tL_availableReaction) : null;
                }
                this.reactionAnimatedEmojiId = j12;
                this.visibleReaction = c3;
            }
        }
        j12 = 0;
        if (j12 == 0) {
        }
        this.reactionAnimatedEmojiId = j12;
        this.visibleReaction = c3;
    }

    public boolean isOut() {
        return w8.a(this.flags, 1);
    }

    public boolean isSendConfirmed() {
        return w8.a(this.flags, 8);
    }

    public boolean isSendDelayed() {
        return w8.a(this.flags, 2);
    }

    public boolean isSendError() {
        return w8.a(this.flags, 4);
    }

    public void notifyStateUpdate() {
        ArrayList<Runnable> arrayList = this.listeners;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Runnable runnable = arrayList.get(i10);
            i10++;
            runnable.run();
        }
    }

    public void setIsOut(boolean z4) {
        this.flags = w8.b(this.flags, 1, z4);
    }

    public void setIsSendConfirmed(boolean z4) {
        this.flags = w8.b(this.flags, 8, z4);
    }

    public void setIsSendDelayed(boolean z4) {
        this.flags = w8.b(this.flags, 2, z4);
    }

    public void setIsSendError(boolean z4) {
        this.flags = w8.b(this.flags, 4, z4);
    }

    public void subscribeToStateUpdates(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unsubscribeFromStateUpdates(Runnable runnable) {
        this.listeners.remove(runnable);
    }
}

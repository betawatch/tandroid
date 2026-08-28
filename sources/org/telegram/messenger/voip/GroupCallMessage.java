package org.telegram.messenger.voip;

import g7.z7;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final hg.r0 visibleReaction;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCallMessage(int i9, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j12;
        TLRPC.TL_availableReaction tL_availableReaction;
        hg.r0 c10;
        this.currentAccount = i9;
        this.fromId = j10;
        this.randomId = j11;
        this.message = tL_textWithEntities;
        ArrayList<TLRPC.MessageEntity> arrayList = tL_textWithEntities.entities;
        if (arrayList != null && arrayList.size() == 1) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(0);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                j12 = ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id;
                if (j12 == 0) {
                    c10 = new hg.r0();
                    c10.g = j12;
                    c10.h = j12;
                } else {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = tL_textWithEntities.entities;
                    c10 = ((arrayList2 == null || arrayList2.isEmpty()) && (tL_availableReaction = MediaDataController.getInstance(i9).getReactionsMap().get(tL_textWithEntities.text)) != null) ? hg.r0.c(tL_availableReaction) : null;
                }
                this.reactionAnimatedEmojiId = j12;
                this.visibleReaction = c10;
            }
        }
        j12 = 0;
        if (j12 == 0) {
        }
        this.reactionAnimatedEmojiId = j12;
        this.visibleReaction = c10;
    }

    public boolean isOut() {
        return z7.a(this.flags, 1);
    }

    public boolean isSendConfirmed() {
        return z7.a(this.flags, 8);
    }

    public boolean isSendDelayed() {
        return z7.a(this.flags, 2);
    }

    public boolean isSendError() {
        return z7.a(this.flags, 4);
    }

    public void notifyStateUpdate() {
        ArrayList<Runnable> arrayList = this.listeners;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Runnable runnable = arrayList.get(i9);
            i9++;
            runnable.run();
        }
    }

    public void setIsOut(boolean z10) {
        this.flags = z7.b(this.flags, 1, z10);
    }

    public void setIsSendConfirmed(boolean z10) {
        this.flags = z7.b(this.flags, 8, z10);
    }

    public void setIsSendDelayed(boolean z10) {
        this.flags = z7.b(this.flags, 2, z10);
    }

    public void setIsSendError(boolean z10) {
        this.flags = z7.b(this.flags, 4, z10);
    }

    public void subscribeToStateUpdates(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unsubscribeFromStateUpdates(Runnable runnable) {
        this.listeners.remove(runnable);
    }
}

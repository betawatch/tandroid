package org.telegram.messenger.voip;

import ah.j1;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final j1 visibleReaction;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCallMessage(int i10, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j11;
        TLRPC.TL_availableReaction tL_availableReaction;
        j1 c10;
        this.currentAccount = i10;
        this.fromId = j3;
        this.randomId = j10;
        this.message = tL_textWithEntities;
        ArrayList<TLRPC.MessageEntity> arrayList = tL_textWithEntities.entities;
        if (arrayList != null && arrayList.size() == 1) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(0);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                j11 = ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id;
                if (j11 == 0) {
                    c10 = new j1();
                    c10.g = j11;
                    c10.h = j11;
                } else {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = tL_textWithEntities.entities;
                    c10 = ((arrayList2 == null || arrayList2.isEmpty()) && (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(tL_textWithEntities.text)) != null) ? j1.c(tL_availableReaction) : null;
                }
                this.reactionAnimatedEmojiId = j11;
                this.visibleReaction = c10;
            }
        }
        j11 = 0;
        if (j11 == 0) {
        }
        this.reactionAnimatedEmojiId = j11;
        this.visibleReaction = c10;
    }

    public boolean isOut() {
        return w7.b0.a(this.flags, 1);
    }

    public boolean isSendConfirmed() {
        return w7.b0.a(this.flags, 8);
    }

    public boolean isSendDelayed() {
        return w7.b0.a(this.flags, 2);
    }

    public boolean isSendError() {
        return w7.b0.a(this.flags, 4);
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

    public void setIsOut(boolean z10) {
        this.flags = w7.b0.b(this.flags, 1, z10);
    }

    public void setIsSendConfirmed(boolean z10) {
        this.flags = w7.b0.b(this.flags, 8, z10);
    }

    public void setIsSendDelayed(boolean z10) {
        this.flags = w7.b0.b(this.flags, 2, z10);
    }

    public void setIsSendError(boolean z10) {
        this.flags = w7.b0.b(this.flags, 4, z10);
    }

    public void subscribeToStateUpdates(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unsubscribeFromStateUpdates(Runnable runnable) {
        this.listeners.remove(runnable);
    }
}

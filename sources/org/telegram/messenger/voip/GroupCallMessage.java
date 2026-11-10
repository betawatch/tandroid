package org.telegram.messenger.voip;

import c8.zc;
import java.util.ArrayList;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    public final ch.o0 visibleReaction;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCallMessage(int i7, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j11;
        TLRPC.TL_availableReaction tL_availableReaction;
        ch.o0 c10;
        this.currentAccount = i7;
        this.fromId = j3;
        this.randomId = j10;
        this.message = tL_textWithEntities;
        ArrayList<TLRPC.MessageEntity> arrayList = tL_textWithEntities.entities;
        if (arrayList != null && arrayList.size() == 1) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(0);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                j11 = ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id;
                if (j11 == 0) {
                    c10 = new ch.o0();
                    c10.g = j11;
                    c10.h = j11;
                } else {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = tL_textWithEntities.entities;
                    c10 = ((arrayList2 == null || arrayList2.isEmpty()) && (tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i7).r.get(tL_textWithEntities.text)) != null) ? ch.o0.c(tL_availableReaction) : null;
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
        return zc.a(this.flags, 1);
    }

    public boolean isSendConfirmed() {
        return zc.a(this.flags, 8);
    }

    public boolean isSendDelayed() {
        return zc.a(this.flags, 2);
    }

    public boolean isSendError() {
        return zc.a(this.flags, 4);
    }

    public void notifyStateUpdate() {
        ArrayList<Runnable> arrayList = this.listeners;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Runnable runnable = arrayList.get(i7);
            i7++;
            runnable.run();
        }
    }

    public void setIsOut(boolean z9) {
        this.flags = zc.b(this.flags, 1, z9);
    }

    public void setIsSendConfirmed(boolean z9) {
        this.flags = zc.b(this.flags, 8, z9);
    }

    public void setIsSendDelayed(boolean z9) {
        this.flags = zc.b(this.flags, 2, z9);
    }

    public void setIsSendError(boolean z9) {
        this.flags = zc.b(this.flags, 4, z9);
    }

    public void subscribeToStateUpdates(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unsubscribeFromStateUpdates(Runnable runnable) {
        this.listeners.remove(runnable);
    }
}

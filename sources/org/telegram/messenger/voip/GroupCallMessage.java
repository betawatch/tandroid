package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;

/* loaded from: classes3.dex */
public class GroupCallMessage {
    public final int currentAccount;
    public final long fromId;
    public final TLRPC.TL_textWithEntities message;
    public final long reactionAnimatedEmojiId;
    public final ReactionsLayoutInBubble.VisibleReaction visibleReaction;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCallMessage(int i, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ReactionsLayoutInBubble.VisibleReaction fromEmojicon;
        this.currentAccount = i;
        this.fromId = j;
        this.message = tL_textWithEntities;
        ArrayList<TLRPC.MessageEntity> arrayList = tL_textWithEntities.entities;
        if (arrayList != null && arrayList.size() == 1) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(0);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                j2 = ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id;
                if (j2 == 0) {
                    fromEmojicon = ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(Long.valueOf(j2));
                } else {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = tL_textWithEntities.entities;
                    fromEmojicon = ((arrayList2 == null || arrayList2.isEmpty()) && (tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(tL_textWithEntities.text)) != null) ? ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(tL_availableReaction) : null;
                }
                this.reactionAnimatedEmojiId = j2;
                this.visibleReaction = fromEmojicon;
            }
        }
        j2 = 0;
        if (j2 == 0) {
        }
        this.reactionAnimatedEmojiId = j2;
        this.visibleReaction = fromEmojicon;
    }
}

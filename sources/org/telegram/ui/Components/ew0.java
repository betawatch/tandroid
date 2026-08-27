package org.telegram.ui.Components;

import org.telegram.messenger.CacheFetcher;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ew0 extends CacheFetcher {
    @Override // org.telegram.messenger.CacheFetcher
    public final void getLocal(int i10, Object obj, Utilities.Callback2 callback2) {
        MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new km(i10, (Integer) obj, callback2, 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.CacheFetcher
    public final void getRemote(int i10, Object obj, long j10, Utilities.Callback4 callback4) {
        TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            TLRPC.TL_messages_getEmojiStatusGroups tL_messages_getEmojiStatusGroups = new TLRPC.TL_messages_getEmojiStatusGroups();
            tL_messages_getEmojiStatusGroups.hash = (int) j10;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStatusGroups;
        } else if (num.intValue() == 2) {
            TLRPC.TL_messages_getEmojiProfilePhotoGroups tL_messages_getEmojiProfilePhotoGroups = new TLRPC.TL_messages_getEmojiProfilePhotoGroups();
            tL_messages_getEmojiProfilePhotoGroups.hash = (int) j10;
            tL_messages_getEmojiGroups = tL_messages_getEmojiProfilePhotoGroups;
        } else if (num.intValue() == 3) {
            TLRPC.TL_messages_getEmojiStickerGroups tL_messages_getEmojiStickerGroups = new TLRPC.TL_messages_getEmojiStickerGroups();
            tL_messages_getEmojiStickerGroups.hash = (int) j10;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStickerGroups;
        } else {
            TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups2 = new TLRPC.TL_messages_getEmojiGroups();
            tL_messages_getEmojiGroups2.hash = (int) j10;
            tL_messages_getEmojiGroups = tL_messages_getEmojiGroups2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getEmojiGroups, new dw0(callback4, 0));
    }

    @Override // org.telegram.messenger.CacheFetcher
    public final void setLocal(int i10, Object obj, Object obj2, long j10) {
        MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new km(i10, (TLRPC.TL_messages_emojiGroups) obj2, (Integer) obj, 18));
    }
}

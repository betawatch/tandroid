package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mg extends org.telegram.ui.cu0 {
    public boolean a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ File c;
    public final /* synthetic */ ng d;

    public mg(ng ngVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = ngVar;
        this.b = photoEntry;
        this.c = file;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        MessageObject threadMessage;
        String str;
        org.telegram.ui.sn snVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.in inVar = chatActivityEnterView.V2;
        if (inVar != null && (snVar = chatActivityEnterView.P2) != null && inVar.f) {
            snVar.Xb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isVideo || (str = photoEntry.imagePath) == null) {
            String str2 = photoEntry.path;
            if (str2 != null) {
                sendingMediaInfo.path = str2;
            }
        } else {
            sendingMediaInfo.path = str;
        }
        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
        sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
        sendingMediaInfo.isVideo = photoEntry.isVideo;
        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
        sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
        sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
        CharSequence charSequence = photoEntry.caption;
        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
        sendingMediaInfo.entities = photoEntry.entities;
        sendingMediaInfo.masks = photoEntry.stickers;
        sendingMediaInfo.ttl = photoEntry.ttl;
        sendingMediaInfo.videoEditedInfo = videoEditedInfo;
        sendingMediaInfo.canDeleteAfter = true;
        arrayList.add(sendingMediaInfo);
        photoEntry.reset();
        this.a = true;
        boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.R;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.in inVar2 = chatActivityEnterView.V2;
        MessageObject messageObject2 = chatActivityEnterView.Z1;
        org.telegram.ui.sn snVar2 = chatActivityEnterView.P2;
        int i13 = snVar2 == null ? 0 : snVar2.d4;
        SendMessageChatArguments H8 = snVar2 != null ? snVar2.H8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.sn snVar3 = chatActivityEnterView.P2;
        if (snVar3 != null) {
            messageSuggestionParams = snVar3.s5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, inVar2, false, false, messageObject2, z10, i11, i12, i13, checkUpdateStickersOrder, null, H8, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.L(null, true, i11, i12, 0L);
        }
    }
}

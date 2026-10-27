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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mg extends org.telegram.ui.iu0 {
    public boolean a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ File c;
    public final /* synthetic */ ng d;

    public mg(ng ngVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = ngVar;
        this.b = photoEntry;
        this.c = file;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        MessageObject threadMessage;
        String str;
        org.telegram.ui.wn wnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.mn mnVar = chatActivityEnterView.V2;
        if (mnVar != null && (wnVar = chatActivityEnterView.P2) != null && mnVar.f) {
            wnVar.hc();
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
        org.telegram.ui.mn mnVar2 = chatActivityEnterView.V2;
        MessageObject messageObject2 = chatActivityEnterView.Z1;
        org.telegram.ui.wn wnVar2 = chatActivityEnterView.P2;
        int i13 = wnVar2 == null ? 0 : wnVar2.d4;
        SendMessageChatArguments O8 = wnVar2 != null ? wnVar2.O8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.wn wnVar3 = chatActivityEnterView.P2;
        if (wnVar3 != null) {
            messageSuggestionParams = wnVar3.w5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, mnVar2, false, false, messageObject2, z10, i11, i12, i13, checkUpdateStickersOrder, null, O8, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.A(null, true, i11, i12, 0L);
        }
    }
}

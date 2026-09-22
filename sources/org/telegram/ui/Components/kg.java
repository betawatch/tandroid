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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kg extends org.telegram.ui.tu0 {
    public boolean a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ File c;
    public final /* synthetic */ lg d;

    public kg(lg lgVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = lgVar;
        this.b = photoEntry;
        this.c = file;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        MessageObject threadMessage;
        String str;
        org.telegram.ui.bo boVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.rn rnVar = chatActivityEnterView.U2;
        if (rnVar != null && (boVar = chatActivityEnterView.O2) != null && rnVar.f) {
            boVar.Rb();
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
        long j3 = chatActivityEnterView.P2;
        MessageObject messageObject = chatActivityEnterView.S2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rn rnVar2 = chatActivityEnterView.U2;
        MessageObject messageObject2 = chatActivityEnterView.Y1;
        org.telegram.ui.bo boVar2 = chatActivityEnterView.O2;
        int i13 = boVar2 == null ? 0 : boVar2.R3;
        SendMessageChatArguments C8 = boVar2 != null ? boVar2.C8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.bo boVar3 = chatActivityEnterView.O2;
        if (boVar3 != null) {
            messageSuggestionParams = boVar3.g5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j3, messageObject, threadMessage, null, rnVar2, false, false, messageObject2, z10, i11, i12, i13, checkUpdateStickersOrder, null, C8, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar != null) {
            mgVar.H(null, true, i11, i12, 0L);
        }
    }
}

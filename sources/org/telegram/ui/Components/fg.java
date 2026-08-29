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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fg extends org.telegram.ui.pt0 {
    public boolean a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ File c;
    public final /* synthetic */ gg d;

    public fg(gg ggVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = ggVar;
        this.b = photoEntry;
        this.c = file;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        MessageObject threadMessage;
        String str;
        org.telegram.ui.tn tnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.jn jnVar = chatActivityEnterView.Q2;
        if (jnVar != null && (tnVar = chatActivityEnterView.K2) != null && jnVar.f) {
            tnVar.Rb();
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
        AccountInstance accountInstance = chatActivityEnterView.N;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.jn jnVar2 = chatActivityEnterView.Q2;
        MessageObject messageObject2 = chatActivityEnterView.U1;
        org.telegram.ui.tn tnVar2 = chatActivityEnterView.K2;
        int i13 = tnVar2 == null ? 0 : tnVar2.N3;
        SendMessageChatArguments C8 = tnVar2 != null ? tnVar2.C8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.tn tnVar3 = chatActivityEnterView.K2;
        if (tnVar3 != null) {
            messageSuggestionParams = tnVar3.c5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, jnVar2, false, false, messageObject2, z10, i11, i12, i13, checkUpdateStickersOrder, null, C8, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.D(null, true, i11, i12, 0L);
        }
    }
}

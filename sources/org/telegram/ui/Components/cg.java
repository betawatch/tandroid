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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cg extends org.telegram.ui.fu0 {
    public boolean a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ File c;
    public final /* synthetic */ dg d;

    public cg(dg dgVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = dgVar;
        this.b = photoEntry;
        this.c = file;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        MessageObject threadMessage;
        String str;
        org.telegram.ui.zn znVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.pn pnVar = chatActivityEnterView.R2;
        if (pnVar != null && (znVar = chatActivityEnterView.L2) != null && pnVar.f) {
            znVar.Rb();
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
        AccountInstance accountInstance = chatActivityEnterView.O;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.M2;
        MessageObject messageObject = chatActivityEnterView.P2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.pn pnVar2 = chatActivityEnterView.R2;
        MessageObject messageObject2 = chatActivityEnterView.V1;
        org.telegram.ui.zn znVar2 = chatActivityEnterView.L2;
        int i13 = znVar2 == null ? 0 : znVar2.O3;
        SendMessageChatArguments C8 = znVar2 != null ? znVar2.C8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.zn znVar3 = chatActivityEnterView.L2;
        if (znVar3 != null) {
            messageSuggestionParams = znVar3.d5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, pnVar2, false, false, messageObject2, z4, i11, i12, i13, checkUpdateStickersOrder, null, C8, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.G(null, true, i11, i12, 0L);
        }
    }
}

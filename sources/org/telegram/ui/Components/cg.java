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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cg extends org.telegram.ui.rt0 {
    public boolean a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ File c;
    public final /* synthetic */ dg d;

    public cg(dg dgVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = dgVar;
        this.b = photoEntry;
        this.c = file;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        MessageObject threadMessage;
        String str;
        org.telegram.ui.qn qnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.gn gnVar = chatActivityEnterView.Q2;
        if (gnVar != null && (qnVar = chatActivityEnterView.K2) != null && gnVar.f) {
            qnVar.Rb();
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
        org.telegram.ui.gn gnVar2 = chatActivityEnterView.Q2;
        MessageObject messageObject2 = chatActivityEnterView.U1;
        org.telegram.ui.qn qnVar2 = chatActivityEnterView.K2;
        int i12 = qnVar2 == null ? 0 : qnVar2.N3;
        SendMessageChatArguments C8 = qnVar2 != null ? qnVar2.C8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.qn qnVar3 = chatActivityEnterView.K2;
        if (qnVar3 != null) {
            messageSuggestionParams = qnVar3.c5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, gnVar2, false, false, messageObject2, z10, i10, i11, i12, checkUpdateStickersOrder, null, C8, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.y(null, true, i10, i11, 0L);
        }
    }
}

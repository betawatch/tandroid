package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Long h;
    public final /* synthetic */ String n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ sd(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, Long l4, String str, Object obj2) {
        this.r = hgVar;
        this.b = obj;
        this.s = photoEntry;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.f = z11;
        this.h = l4;
        this.n = str;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        MessageObject threadMessage;
        MessageObject threadMessage2;
        MessageObject threadMessage3;
        MessageObject threadMessage4;
        String str;
        switch (this.a) {
            case 0:
                ChatActivityEnterView.g((ChatActivityEnterView) this.r, (TLRPC.Document) this.s, this.n, (MessageObject.SendAnimationData) this.v, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                hg hgVar = (hg) this.r;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.s;
                ChatActivityEnterView chatActivityEnterView = hgVar.a;
                boolean z11 = chatActivityEnterView.z3;
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.A();
                    }
                    chatActivityEnterView.n1(false, true, false, true);
                }
                og ogVar = chatActivityEnterView.Z2;
                TL_stories.StoryItem d12 = ogVar != null ? ogVar.d1() : null;
                Object obj = this.b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.c;
                int i10 = this.d;
                int i11 = this.e;
                Long l4 = this.h;
                int i12 = i10;
                String str2 = this.n;
                Object obj2 = this.v;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    VideoEditedInfo videoEditedInfo = photoEntry != null ? photoEntry.editedInfo : null;
                    if (videoEditedInfo != null && photoEntry != null) {
                        videoEditedInfo.roundVideo = true;
                        boolean needConvert = videoEditedInfo.needConvert();
                        videoEditedInfo.roundVideo = false;
                        videoEditedInfo.muted = true;
                        z12 = needConvert;
                    }
                    boolean z15 = this.f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        if (photoEntry.isVideo || (str = photoEntry.imagePath) == null) {
                            String str3 = photoEntry.path;
                            if (str3 != null) {
                                sendingMediaInfo.path = str3;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                            if (photoEntry.isHighQuality()) {
                                sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                            }
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
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
                        sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                        sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                        sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                        sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                        sendingMediaInfo.stars = photoEntry.starsAmount;
                        sendingMediaInfo.highQuality = photoEntry.isHighQuality();
                        arrayList.add(sendingMediaInfo);
                        photoEntry.reset();
                        AccountInstance accountInstance = AccountInstance.getInstance(chatActivityEnterView.Q);
                        long j3 = chatActivityEnterView.Q2;
                        MessageObject messageObject = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j3, messageObject, threadMessage4, null, chatActivityEnterView.V2, false, false, chatActivityEnterView.Z1, z14, i12, i11, 0, false, null, wnVar != null ? wnVar.C8() : null, chatActivityEnterView.S4, z15, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z10 = z14;
                        i12 = i12;
                    } else {
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.Q2;
                        CharSequence charSequence2 = photoEntry != null ? photoEntry.caption : null;
                        TL_stories.StoryItem storyItem = d12;
                        MessageObject messageObject2 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        sendMessagesHelper.sendSticker(document, str2, j10, charSequence2, videoEditedInfo, messageObject2, threadMessage3, storyItem, chatActivityEnterView.V2, null, z14, i12, i11, false, obj2, wnVar != null ? wnVar.C8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2)) {
                            chatActivityEnterView.R.getMessagesController().saveGif(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem2 = d12;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            MediaDataController.getInstance(chatActivityEnterView.Q).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2)) {
                                chatActivityEnterView.R.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            org.telegram.ui.wn wnVar2 = chatActivityEnterView.P2;
                            AccountInstance accountInstance2 = chatActivityEnterView.R;
                            long j11 = chatActivityEnterView.Q2;
                            MessageObject messageObject3 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            SendMessagesHelper.prepareSendingBotContextResult(wnVar2, accountInstance2, botInlineResult, hashMap, j11, messageObject3, threadMessage2, null, chatActivityEnterView.V2, z10, i12, 0, wnVar != null ? wnVar.C8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z10 = z10;
                            i12 = i12;
                        } else {
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.Q2;
                            MessageObject messageObject4 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            sendMessagesHelper2.sendSticker(document2, str2, j12, messageObject4, threadMessage, storyItem2, chatActivityEnterView.V2, null, z10, i12, i11, false, obj2, wnVar != null ? wnVar.C8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.A();
                        }
                    }
                }
                og ogVar2 = chatActivityEnterView.Z2;
                if (ogVar2 != null) {
                    ogVar2.H(null, z10, i12, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.v = sendAnimationData;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.b = obj;
        this.h = l4;
        this.f = z11;
    }
}

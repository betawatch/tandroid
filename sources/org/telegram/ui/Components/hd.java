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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements Runnable {
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

    public /* synthetic */ hd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10, Long l10, String str, Object obj2) {
        this.r = xfVar;
        this.b = obj;
        this.s = photoEntry;
        this.c = z4;
        this.d = i10;
        this.e = i11;
        this.f = z10;
        this.h = l10;
        this.n = str;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
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
                xf xfVar = (xf) this.r;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.s;
                ChatActivityEnterView chatActivityEnterView = xfVar.a;
                boolean z10 = chatActivityEnterView.v3;
                org.telegram.ui.zn znVar = chatActivityEnterView.L2;
                boolean z11 = false;
                if (z10) {
                    if (chatActivityEnterView.N1 != 0) {
                        chatActivityEnterView.R0.B();
                    }
                    chatActivityEnterView.n1(false, true, false, true);
                }
                eg egVar = chatActivityEnterView.V2;
                TL_stories.StoryItem i12 = egVar != null ? egVar.i1() : null;
                Object obj = this.b;
                boolean z12 = obj instanceof TLRPC.Document;
                boolean z13 = this.c;
                int i10 = this.d;
                int i11 = this.e;
                Long l10 = this.h;
                int i13 = i10;
                String str2 = this.n;
                Object obj2 = this.v;
                if (z12) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    VideoEditedInfo videoEditedInfo = photoEntry != null ? photoEntry.editedInfo : null;
                    if (videoEditedInfo != null && photoEntry != null) {
                        videoEditedInfo.roundVideo = true;
                        boolean needConvert = videoEditedInfo.needConvert();
                        videoEditedInfo.roundVideo = false;
                        videoEditedInfo.muted = true;
                        z11 = needConvert;
                    }
                    boolean z14 = this.f;
                    if (z11) {
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
                        AccountInstance accountInstance = AccountInstance.getInstance(chatActivityEnterView.N);
                        long j10 = chatActivityEnterView.M2;
                        MessageObject messageObject = chatActivityEnterView.P2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage4, null, chatActivityEnterView.R2, false, false, chatActivityEnterView.V1, z13, i13, i11, 0, false, null, znVar != null ? znVar.C8() : null, chatActivityEnterView.O4, z14, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z4 = z13;
                        i13 = i13;
                    } else {
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.N);
                        long j11 = chatActivityEnterView.M2;
                        CharSequence charSequence2 = photoEntry != null ? photoEntry.caption : null;
                        TL_stories.StoryItem storyItem = i12;
                        MessageObject messageObject2 = chatActivityEnterView.P2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        sendMessagesHelper.sendSticker(document, str2, j11, charSequence2, videoEditedInfo, messageObject2, threadMessage3, storyItem, chatActivityEnterView.R2, null, z13, i13, i11, false, obj2, znVar != null ? znVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z14);
                        z4 = z13;
                        i13 = i13;
                        MediaDataController.getInstance(chatActivityEnterView.N).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.M2)) {
                            chatActivityEnterView.O.getMessagesController().saveGif(obj2, document);
                        }
                    }
                } else {
                    z4 = z13;
                    TL_stories.StoryItem storyItem2 = i12;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            MediaDataController.getInstance(chatActivityEnterView.N).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.M2)) {
                                chatActivityEnterView.O.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            org.telegram.ui.zn znVar2 = chatActivityEnterView.L2;
                            AccountInstance accountInstance2 = chatActivityEnterView.O;
                            long j12 = chatActivityEnterView.M2;
                            MessageObject messageObject3 = chatActivityEnterView.P2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            SendMessagesHelper.prepareSendingBotContextResult(znVar2, accountInstance2, botInlineResult, hashMap, j12, messageObject3, threadMessage2, null, chatActivityEnterView.R2, z4, i13, 0, znVar != null ? znVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z4 = z4;
                            i13 = i13;
                        } else {
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(chatActivityEnterView.N);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.M2;
                            MessageObject messageObject4 = chatActivityEnterView.P2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            sendMessagesHelper2.sendSticker(document2, str2, j13, messageObject4, threadMessage, storyItem2, chatActivityEnterView.R2, null, z4, i13, i11, false, obj2, znVar != null ? znVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.N1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.R0.t(true);
                            chatActivityEnterView.R0.B();
                        }
                    }
                }
                eg egVar2 = chatActivityEnterView.V2;
                if (egVar2 != null) {
                    egVar2.G(null, z4, i13, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, Long l10, boolean z10) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.v = sendAnimationData;
        this.c = z4;
        this.d = i10;
        this.e = i11;
        this.b = obj;
        this.h = l10;
        this.f = z10;
    }
}

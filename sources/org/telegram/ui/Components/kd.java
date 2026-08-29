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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
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

    public /* synthetic */ kd(ag agVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, Long l10, String str, Object obj2) {
        this.r = agVar;
        this.b = obj;
        this.s = photoEntry;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.f = z11;
        this.h = l10;
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
                ag agVar = (ag) this.r;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.s;
                ChatActivityEnterView chatActivityEnterView = agVar.a;
                boolean z11 = chatActivityEnterView.u3;
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.M1 != 0) {
                        chatActivityEnterView.Q0.B();
                    }
                    chatActivityEnterView.n1(false, true, false, true);
                }
                hg hgVar = chatActivityEnterView.U2;
                TL_stories.StoryItem d12 = hgVar != null ? hgVar.d1() : null;
                Object obj = this.b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.c;
                int i10 = this.d;
                int i11 = this.e;
                Long l10 = this.h;
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
                        AccountInstance accountInstance = AccountInstance.getInstance(chatActivityEnterView.M);
                        long j10 = chatActivityEnterView.L2;
                        MessageObject messageObject = chatActivityEnterView.O2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage4, null, chatActivityEnterView.Q2, false, false, chatActivityEnterView.U1, z14, i12, i11, 0, false, null, tnVar != null ? tnVar.C8() : null, chatActivityEnterView.N4, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z10 = z14;
                        i12 = i12;
                    } else {
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.M);
                        long j11 = chatActivityEnterView.L2;
                        CharSequence charSequence2 = photoEntry != null ? photoEntry.caption : null;
                        TL_stories.StoryItem storyItem = d12;
                        MessageObject messageObject2 = chatActivityEnterView.O2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        sendMessagesHelper.sendSticker(document, str2, j11, charSequence2, videoEditedInfo, messageObject2, threadMessage3, storyItem, chatActivityEnterView.Q2, null, z14, i12, i11, false, obj2, tnVar != null ? tnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        MediaDataController.getInstance(chatActivityEnterView.M).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2)) {
                            chatActivityEnterView.N.getMessagesController().saveGif(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem2 = d12;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            MediaDataController.getInstance(chatActivityEnterView.M).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2)) {
                                chatActivityEnterView.N.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            org.telegram.ui.tn tnVar2 = chatActivityEnterView.K2;
                            AccountInstance accountInstance2 = chatActivityEnterView.N;
                            long j12 = chatActivityEnterView.L2;
                            MessageObject messageObject3 = chatActivityEnterView.O2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            SendMessagesHelper.prepareSendingBotContextResult(tnVar2, accountInstance2, botInlineResult, hashMap, j12, messageObject3, threadMessage2, null, chatActivityEnterView.Q2, z10, i12, 0, tnVar != null ? tnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z10 = z10;
                            i12 = i12;
                        } else {
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(chatActivityEnterView.M);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.L2;
                            MessageObject messageObject4 = chatActivityEnterView.O2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            sendMessagesHelper2.sendSticker(document2, str2, j13, messageObject4, threadMessage, storyItem2, chatActivityEnterView.Q2, null, z10, i12, i11, false, obj2, tnVar != null ? tnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.Q0.t(true);
                            chatActivityEnterView.Q0.B();
                        }
                    }
                }
                hg hgVar2 = chatActivityEnterView.U2;
                if (hgVar2 != null) {
                    hgVar2.D(null, z10, i12, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l10, boolean z11) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.v = sendAnimationData;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.b = obj;
        this.h = l10;
        this.f = z11;
    }
}

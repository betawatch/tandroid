package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r8 extends c1 {
    public static volatile r8[] s = new r8[4];
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public long e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;

    public r8(int i3) {
        super(i3);
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = SystemClock.elapsedRealtime();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
    }

    public static int c(String str) {
        if (str != null && str.startsWith("FILE_REFERENCE_") && str.endsWith("_EXPIRED")) {
            try {
                return Integer.parseInt(str.substring(15, str.length() - 8));
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public static byte[] e(TLRPC.Document document, ArrayList arrayList, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (document != null && inputFileLocation != null) {
            if (!(inputFileLocation instanceof TLRPC.TL_inputDocumentFileLocation)) {
                int size = document.thumbs.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i3);
                    byte[] f10 = (photoSize == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation)) ? null : f(photoSize.location, inputFileLocation, zArr);
                    if (zArr != null && zArr[0]) {
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                        inputFileLocationArr[0] = tL_inputDocumentFileLocation;
                        tL_inputDocumentFileLocation.id = document.id;
                        tL_inputDocumentFileLocation.volume_id = inputFileLocation.volume_id;
                        tL_inputDocumentFileLocation.local_id = inputFileLocation.local_id;
                        tL_inputDocumentFileLocation.access_hash = document.access_hash;
                        byte[] bArr = document.file_reference;
                        tL_inputDocumentFileLocation.file_reference = bArr;
                        tL_inputDocumentFileLocation.thumb_size = photoSize.type;
                        return bArr;
                    }
                    if (f10 != null) {
                        return f10;
                    }
                }
            } else if (document.id == inputFileLocation.id) {
                return document.file_reference;
            }
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    byte[] e10 = e((TLRPC.Document) arrayList.get(i10), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (e10 != null) {
                        return e10;
                    }
                }
            }
        }
        return null;
    }

    public static byte[] f(TLRPC.FileLocation fileLocation, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr) {
        if (fileLocation == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation) || fileLocation.local_id != inputFileLocation.local_id || fileLocation.volume_id != inputFileLocation.volume_id) {
            return null;
        }
        byte[] bArr = fileLocation.file_reference;
        if (bArr == null && zArr != null) {
            zArr[0] = true;
        }
        return bArr;
    }

    public static byte[] g(TLRPC.Photo photo, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (photo != null) {
            if (inputFileLocation instanceof TLRPC.TL_inputPhotoFileLocation) {
                if (photo.id == inputFileLocation.id) {
                    return photo.file_reference;
                }
            } else if (inputFileLocation instanceof TLRPC.TL_inputFileLocation) {
                int size = photo.sizes.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.PhotoSize photoSize = photo.sizes.get(i3);
                    byte[] f10 = photoSize != null ? f(photoSize.location, inputFileLocation, zArr) : null;
                    if (zArr != null && zArr[0]) {
                        TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                        inputFileLocationArr[0] = tL_inputPhotoFileLocation;
                        tL_inputPhotoFileLocation.id = photo.id;
                        tL_inputPhotoFileLocation.volume_id = inputFileLocation.volume_id;
                        tL_inputPhotoFileLocation.local_id = inputFileLocation.local_id;
                        tL_inputPhotoFileLocation.access_hash = photo.access_hash;
                        byte[] bArr = photo.file_reference;
                        tL_inputPhotoFileLocation.file_reference = bArr;
                        tL_inputPhotoFileLocation.thumb_size = photoSize.type;
                        return bArr;
                    }
                    if (f10 != null) {
                        return f10;
                    }
                }
            }
        }
        return null;
    }

    public static byte[] i(TLRPC.WebPage webPage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] e10 = e(webPage.document, null, inputFileLocation, zArr, inputFileLocationArr);
        if (e10 != null) {
            return e10;
        }
        byte[] g7 = g(webPage.photo, inputFileLocation, zArr, inputFileLocationArr);
        if (g7 != null) {
            return g7;
        }
        if (!webPage.attributes.isEmpty()) {
            int size = webPage.attributes.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i3);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        byte[] e11 = e(tL_webPageAttributeTheme.documents.get(i10), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (e11 != null) {
                            return e11;
                        }
                    }
                }
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page != null) {
            int size3 = page.documents.size();
            for (int i11 = 0; i11 < size3; i11++) {
                byte[] e12 = e(webPage.cached_page.documents.get(i11), null, inputFileLocation, zArr, inputFileLocationArr);
                if (e12 != null) {
                    return e12;
                }
            }
            int size4 = webPage.cached_page.photos.size();
            for (int i12 = 0; i12 < size4; i12++) {
                byte[] g10 = g(webPage.cached_page.photos.get(i12), inputFileLocation, zArr, inputFileLocationArr);
                if (g10 != null) {
                    return g10;
                }
            }
        }
        return null;
    }

    public static byte[] j(TLRPC.MessageMedia messageMedia, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.Photo photo;
        byte[] bArr = null;
        if (messageMedia == null) {
            return null;
        }
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            bArr = e(document, messageMedia.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
        } else {
            TLRPC.TL_game tL_game = messageMedia.game;
            if (tL_game != null) {
                bArr = e(tL_game.document, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr == null) {
                    bArr = g(messageMedia.game.photo, inputFileLocation, zArr, inputFileLocationArr);
                }
            } else {
                TLRPC.Photo photo2 = messageMedia.photo;
                if (photo2 != null) {
                    bArr = g(photo2, inputFileLocation, zArr, inputFileLocationArr);
                } else {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (webPage != null) {
                        bArr = i(webPage, inputFileLocation, zArr, inputFileLocationArr);
                    }
                }
            }
        }
        return (bArr != null || (photo = messageMedia.video_cover) == null) ? bArr : g(photo, inputFileLocation, zArr, inputFileLocationArr);
    }

    public static byte[] k(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        ArrayList<TLRPC.PollAnswer> arrayList;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia;
        if (tL_messageMediaPoll == null) {
            return null;
        }
        byte[] j10 = j(tL_messageMediaPoll.attached_media, inputFileLocation, zArr, inputFileLocationArr);
        if (j10 == null && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia = pollResults.solution_media) != null) {
            j10 = j(messageMedia, inputFileLocation, zArr, inputFileLocationArr);
        }
        if (j10 == null && (arrayList = tL_messageMediaPoll.poll.answers) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i3);
                i3++;
                j10 = j(pollAnswer.media, inputFileLocation, zArr, inputFileLocationArr);
                if (j10 != null) {
                    break;
                }
            }
        }
        return j10;
    }

    public static byte[] l(TL_iv.RichMessage richMessage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i3 = 0;
        byte[] bArr = null;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Photo photo = arrayList.get(i10);
            i10++;
            bArr = g(photo, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                return bArr;
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            TLRPC.Document document = arrayList2.get(i3);
            i3++;
            bArr = e(document, null, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                break;
            }
        }
        return bArr;
    }

    public static r8 n(int i3) {
        r8 r8Var;
        r8 r8Var2 = s[i3];
        if (r8Var2 != null) {
            return r8Var2;
        }
        synchronized (r8.class) {
            try {
                r8Var = s[i3];
                if (r8Var == null) {
                    r8[] r8VarArr = s;
                    r8 r8Var3 = new r8(i3);
                    r8VarArr[i3] = r8Var3;
                    r8Var = r8Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r8Var;
    }

    public static String o(Object obj) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (obj instanceof ei.j6) {
            ei.j6 j6Var = (ei.j6) obj;
            if (j6Var.a == null) {
                a8.b("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC.MessageMedia messageMedia = j6Var.media;
            if (messageMedia.document != null) {
                return "botstory_doc_" + j6Var.media.document.id;
            }
            if (messageMedia.photo != null) {
                return "botstory_photo_" + j6Var.media.photo.id;
            }
            return "botstory_" + j6Var.id;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            if (storyItem.dialogId == 0) {
                a8.b("failed request reference can't find dialogId");
                return null;
            }
            return "story_" + storyItem.dialogId + "_" + storyItem.id;
        }
        if (obj instanceof TLRPC.TL_help_premiumPromo) {
            return "premium_promo";
        }
        if (obj instanceof TLRPC.TL_availableReaction) {
            return "available_reaction_" + ((TLRPC.TL_availableReaction) obj).reaction;
        }
        if (obj instanceof TL_bots.BotInfo) {
            return "bot_info_" + ((TL_bots.BotInfo) obj).user_id;
        }
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            return a1.g.p(((TLRPC.TL_attachMenuBot) obj).bot_id, "attach_menu_bot_");
        }
        if (obj instanceof zi) {
            zi ziVar = (zi) obj;
            long v02 = zi.v0(ziVar.k);
            if (ziVar.D == 29 && (message = ziVar.k) != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                v02 = m5.o(peer);
            }
            return "message" + ziVar.M1() + "_" + v02 + "_" + ziVar.p1 + "_" + zi.J1(ziVar.k);
        }
        if (obj instanceof TLRPC.Message) {
            TLRPC.Message message2 = (TLRPC.Message) obj;
            TLRPC.Peer peer2 = message2.peer_id;
            return "message" + message2.id + "_" + (peer2 != null ? peer2.channel_id : 0L) + "_" + message2.from_scheduled;
        }
        if (obj instanceof TLRPC.WebPage) {
            return "webpage" + ((TLRPC.WebPage) obj).id;
        }
        if (obj instanceof TLRPC.User) {
            return "user" + ((TLRPC.User) obj).id;
        }
        if (obj instanceof TLRPC.Chat) {
            return "chat" + ((TLRPC.Chat) obj).id;
        }
        if (obj instanceof String) {
            return "str".concat((String) obj);
        }
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            return "set" + ((TLRPC.TL_messages_stickerSet) obj).set.id;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            return "set" + ((TLRPC.StickerSetCovered) obj).set.id;
        }
        if (obj instanceof TLRPC.InputStickerSet) {
            return "set" + ((TLRPC.InputStickerSet) obj).id;
        }
        if (obj instanceof TLRPC.TL_wallPaper) {
            return "wallpaper" + ((TLRPC.TL_wallPaper) obj).id;
        }
        if (obj instanceof TLRPC.TL_theme) {
            return "theme" + ((TLRPC.TL_theme) obj).id;
        }
        if (obj == null) {
            return null;
        }
        return "" + obj;
    }

    public static Pair p(Object[] objArr, Object obj) {
        boolean z10;
        Object obj2 = objArr[0];
        if ((obj2 instanceof TLRPC.TL_messages_sendMultiMedia) || (((z10 = obj2 instanceof TLRPC.TL_messages_sendMedia)) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList))) {
            return null;
        }
        if (z10 && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        boolean z11 = obj2 instanceof TL_ephemeral.TL_sendMessage;
        if (z11 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if (z11 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if (obj2 instanceof ei.j6) {
            ei.j6 j6Var = (ei.j6) obj2;
            TLRPC.MessageMedia messageMedia = j6Var.media;
            if (messageMedia.document != null) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation.id = j6Var.media.document.id;
                return new Pair(tL_inputDocumentFileLocation, "botstory_doc_" + j6Var.media.document.id);
            }
            if (messageMedia.photo == null) {
                return new Pair(new TLRPC.TL_inputDocumentFileLocation(), "botstory_" + j6Var.id);
            }
            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
            tL_inputPhotoFileLocation.id = j6Var.media.photo.id;
            return new Pair(tL_inputPhotoFileLocation, "botstory_photo_" + j6Var.media.photo.id);
        }
        if (obj2 instanceof TL_stories.TL_storyItem) {
            TL_stories.TL_storyItem tL_storyItem = (TL_stories.TL_storyItem) obj2;
            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
            tL_inputDocumentFileLocation2.id = tL_storyItem.media.document.id;
            return new Pair(tL_inputDocumentFileLocation2, "story_" + tL_storyItem.id);
        }
        if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_inputSingleMedia) obj2).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation3 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation3.id = tL_inputMediaDocument.id.id;
                return new Pair(tL_inputDocumentFileLocation3, "file_" + tL_inputMediaDocument.id.id);
            }
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation2 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation2.id = tL_inputMediaPhoto.id.id;
                return new Pair(tL_inputPhotoFileLocation2, "photo_" + tL_inputMediaPhoto.id.id);
            }
        } else {
            if (obj2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation4 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation4.id = tL_inputMediaDocument2.id.id;
                return new Pair(tL_inputDocumentFileLocation4, "file_" + tL_inputMediaDocument2.id.id);
            }
            if (obj2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation3 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation3.id = tL_inputMediaPhoto2.id.id;
                return new Pair(tL_inputPhotoFileLocation3, "photo_" + tL_inputMediaPhoto2.id.id);
            }
            if (z10) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation5 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation5.id = tL_inputMediaDocument3.id.id;
                    return new Pair(tL_inputDocumentFileLocation5, "file_" + tL_inputMediaDocument3.id.id);
                }
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation4 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation4.id = tL_inputMediaPhoto3.id.id;
                    return new Pair(tL_inputPhotoFileLocation4, "photo_" + tL_inputMediaPhoto3.id.id);
                }
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation6 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation6.id = tL_inputMediaDocument4.id.id;
                            return new Pair(tL_inputDocumentFileLocation6, "file_" + tL_inputMediaDocument4.id.id);
                        }
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation5 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation5.id = tL_inputMediaPhoto4.id.id;
                            return new Pair(tL_inputPhotoFileLocation5, "photo_" + tL_inputMediaPhoto4.id.id);
                        }
                    }
                }
            } else if (z11) {
                TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) obj2).media;
                if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation7 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation7.id = tL_inputMediaDocument5.id.id;
                    return new Pair(tL_inputDocumentFileLocation7, "file_" + tL_inputMediaDocument5.id.id);
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation6 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation6.id = tL_inputMediaPhoto5.id.id;
                    return new Pair(tL_inputPhotoFileLocation6, "photo_" + tL_inputMediaPhoto5.id.id);
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia2.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia5 = tL_inputMediaPaidMedia2.extended_media.get(0);
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation8 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation8.id = tL_inputMediaDocument6.id.id;
                            return new Pair(tL_inputDocumentFileLocation8, "file_" + tL_inputMediaDocument6.id.id);
                        }
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation7 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation7.id = tL_inputMediaPhoto6.id.id;
                            return new Pair(tL_inputPhotoFileLocation7, "photo_" + tL_inputMediaPhoto6.id.id);
                        }
                    }
                }
            } else if (obj2 instanceof TLRPC.TL_messages_editMessage) {
                TLRPC.InputMedia inputMedia6 = ((TLRPC.TL_messages_editMessage) obj2).media;
                if (inputMedia6 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia6;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation9 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation9.id = tL_inputMediaDocument7.id.id;
                    return new Pair(tL_inputDocumentFileLocation9, "file_" + tL_inputMediaDocument7.id.id);
                }
                if (inputMedia6 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia6;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation8 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation8.id = tL_inputMediaPhoto7.id.id;
                    return new Pair(tL_inputPhotoFileLocation8, "photo_" + tL_inputMediaPhoto7.id.id);
                }
            } else {
                if (obj2 instanceof TLRPC.InputPhoto) {
                    TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation9 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation9.id = inputPhoto.id;
                    return new Pair(tL_inputPhotoFileLocation9, "photo_" + inputPhoto.id);
                }
                if (obj2 instanceof TLRPC.InputDocument) {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation10 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation10.id = inputDocument.id;
                    return new Pair(tL_inputDocumentFileLocation10, "file_" + inputDocument.id);
                }
                if (obj2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.InputMedia inputMedia7 = ((TLRPC.TL_messages_addPollAnswer) obj2).answer.input_media;
                    if (inputMedia7 instanceof TLRPC.TL_inputMediaDocument) {
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument8 = (TLRPC.TL_inputMediaDocument) inputMedia7;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation11 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation11.id = tL_inputMediaDocument8.id.id;
                        return new Pair(tL_inputDocumentFileLocation11, "file_" + tL_inputMediaDocument8.id.id);
                    }
                    if (inputMedia7 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia7;
                        TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation10 = new TLRPC.TL_inputPhotoFileLocation();
                        tL_inputPhotoFileLocation10.id = tL_inputMediaPhoto8.id.id;
                        return new Pair(tL_inputPhotoFileLocation10, "photo_" + tL_inputMediaPhoto8.id.id);
                    }
                } else {
                    if (obj2 instanceof TLRPC.TL_messages_saveGif) {
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation12 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation12.id = tL_messages_saveGif.id.id;
                        return new Pair(tL_inputDocumentFileLocation12, "file_" + tL_messages_saveGif.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_saveRecentSticker) {
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation13 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation13.id = tL_messages_saveRecentSticker.id.id;
                        return new Pair(tL_inputDocumentFileLocation13, "file_" + tL_messages_saveRecentSticker.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_stickers_addStickerToSet) {
                        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation14 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation14.id = tL_stickers_addStickerToSet.sticker.document.id;
                        return new Pair(tL_inputDocumentFileLocation14, "file_" + tL_stickers_addStickerToSet.sticker.document.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_faveSticker) {
                        TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation15 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation15.id = tL_messages_faveSticker.id.id;
                        return new Pair(tL_inputDocumentFileLocation15, "file_" + tL_messages_faveSticker.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                        TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj2).media;
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation16 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation16.id = tL_inputStickeredMediaDocument.id.id;
                            return new Pair(tL_inputDocumentFileLocation16, "file_" + tL_inputStickeredMediaDocument.id.id);
                        }
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation11 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation11.id = tL_inputStickeredMediaPhoto.id.id;
                            return new Pair(tL_inputPhotoFileLocation11, "photo_" + tL_inputStickeredMediaPhoto.id.id);
                        }
                    } else {
                        if (obj2 instanceof TLRPC.TL_inputFileLocation) {
                            TLRPC.TL_inputFileLocation tL_inputFileLocation = (TLRPC.TL_inputFileLocation) obj2;
                            return new Pair(tL_inputFileLocation, "loc_" + tL_inputFileLocation.local_id + "_" + tL_inputFileLocation.volume_id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputDocumentFileLocation) {
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation17 = (TLRPC.TL_inputDocumentFileLocation) obj2;
                            return new Pair(tL_inputDocumentFileLocation17, "file_" + tL_inputDocumentFileLocation17.id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputPhotoFileLocation) {
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation12 = (TLRPC.TL_inputPhotoFileLocation) obj2;
                            return new Pair(tL_inputPhotoFileLocation12, "photo_" + tL_inputPhotoFileLocation12.id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = (TLRPC.TL_inputPeerPhotoFileLocation) obj2;
                            return new Pair(tL_inputPeerPhotoFileLocation, "avatar_" + tL_inputPeerPhotoFileLocation.id);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean r(String str) {
        if ("FILEREF_EXPIRED".equals(str) || "FILE_REFERENCE_EXPIRED".equals(str) || "FILE_REFERENCE_EMPTY".equals(str)) {
            return true;
        }
        return str != null && str.startsWith("FILE_REFERENCE_");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaDocument) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaDocument) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaDocument) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaDocument) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean w(byte[] bArr, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation inputFileLocation2, Object... objArr) {
        String str;
        Object obj = objArr[0];
        if (obj instanceof TL_stories.TL_storyItem) {
            ((TL_stories.TL_storyItem) obj).media.document.file_reference = bArr;
            return true;
        }
        if (!(obj instanceof TLRPC.TL_inputSingleMedia)) {
            if (objArr.length >= 2) {
                Object obj2 = objArr[1];
                if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                    if (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) {
                        if (!(obj instanceof TLRPC.TL_inputMediaPhoto)) {
                        }
                    }
                }
            }
            if (objArr.length >= 2) {
                Object obj3 = objArr[1];
                if (obj3 instanceof TLRPC.TL_messages_sendMedia) {
                    if (((TLRPC.TL_messages_sendMedia) obj3).media instanceof TLRPC.TL_inputMediaPoll) {
                        if (!(obj instanceof TLRPC.TL_inputMediaPhoto)) {
                        }
                    }
                }
            }
            if (objArr.length >= 2) {
                Object obj4 = objArr[1];
                if (obj4 instanceof TL_ephemeral.TL_sendMessage) {
                    if (((TL_ephemeral.TL_sendMessage) obj4).media instanceof TLRPC.TL_inputMediaPaidMedia) {
                        if (!(obj instanceof TLRPC.TL_inputMediaPhoto)) {
                        }
                    }
                }
            }
            if (objArr.length >= 2) {
                Object obj5 = objArr[1];
                if (obj5 instanceof TL_ephemeral.TL_sendMessage) {
                    if (((TL_ephemeral.TL_sendMessage) obj5).media instanceof TLRPC.TL_inputMediaPoll) {
                        if (!(obj instanceof TLRPC.TL_inputMediaPhoto)) {
                        }
                    }
                }
            }
            if (obj instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) obj).media;
                if (!(inputMedia instanceof TLRPC.TL_inputMediaDocument)) {
                    if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                        if (!Arrays.equals(tL_inputMediaPhoto.id.file_reference, bArr)) {
                            tL_inputMediaPhoto.id.file_reference = bArr;
                            return true;
                        }
                    }
                    return true;
                }
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                if (!Arrays.equals(tL_inputMediaDocument.id.file_reference, bArr)) {
                    tL_inputMediaDocument.id.file_reference = bArr;
                    return true;
                }
            } else if (obj instanceof TL_ephemeral.TL_sendMessage) {
                TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) obj).media;
                if (!(inputMedia2 instanceof TLRPC.TL_inputMediaDocument)) {
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                        if (!Arrays.equals(tL_inputMediaPhoto2.id.file_reference, bArr)) {
                            tL_inputMediaPhoto2.id.file_reference = bArr;
                            return true;
                        }
                    }
                    return true;
                }
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                if (!Arrays.equals(tL_inputMediaDocument2.id.file_reference, bArr)) {
                    tL_inputMediaDocument2.id.file_reference = bArr;
                    return true;
                }
            } else if (obj instanceof TLRPC.TL_messages_editMessage) {
                TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) obj).media;
                if (!(inputMedia3 instanceof TLRPC.TL_inputMediaDocument)) {
                    if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                        if (!Arrays.equals(tL_inputMediaPhoto3.id.file_reference, bArr)) {
                            tL_inputMediaPhoto3.id.file_reference = bArr;
                            return true;
                        }
                    }
                    return true;
                }
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                if (!Arrays.equals(tL_inputMediaDocument3.id.file_reference, bArr)) {
                    tL_inputMediaDocument3.id.file_reference = bArr;
                    return true;
                }
            } else if (obj instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) obj).answer.input_media;
                if (!(inputMedia4 instanceof TLRPC.TL_inputMediaDocument)) {
                    if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                        if (!Arrays.equals(tL_inputMediaPhoto4.id.file_reference, bArr)) {
                            tL_inputMediaPhoto4.id.file_reference = bArr;
                            return true;
                        }
                    }
                    return true;
                }
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                if (!Arrays.equals(tL_inputMediaDocument4.id.file_reference, bArr)) {
                    tL_inputMediaDocument4.id.file_reference = bArr;
                    return true;
                }
            } else if (obj instanceof TLRPC.TL_messages_saveGif) {
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (!Arrays.equals(tL_messages_saveGif.id.file_reference, bArr)) {
                    tL_messages_saveGif.id.file_reference = bArr;
                    return true;
                }
            } else if (obj instanceof TLRPC.TL_messages_saveRecentSticker) {
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                if (!Arrays.equals(tL_messages_saveRecentSticker.id.file_reference, bArr)) {
                    tL_messages_saveRecentSticker.id.file_reference = bArr;
                    return true;
                }
            } else if (obj instanceof TLRPC.TL_stickers_addStickerToSet) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                if (!Arrays.equals(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                    tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
                    return true;
                }
            } else if (obj instanceof TLRPC.TL_messages_faveSticker) {
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (!Arrays.equals(tL_messages_faveSticker.id.file_reference, bArr)) {
                    tL_messages_faveSticker.id.file_reference = bArr;
                    return true;
                }
            } else {
                if (!(obj instanceof TLRPC.TL_messages_getAttachedStickers)) {
                    Object obj6 = objArr[1];
                    if (obj6 instanceof i7) {
                        i7 i7Var = (i7) obj6;
                        if (inputFileLocation != null) {
                            if (!Arrays.equals(i7Var.V.file_reference, inputFileLocation.file_reference)) {
                                str = r2.a ? Utilities.f(i7Var.V.file_reference) : null;
                                i7Var.V = inputFileLocation;
                                if (r2.a) {
                                    r1 = Utilities.f(inputFileLocation.file_reference);
                                }
                                if (r2.a) {
                                    a8.b("debug_loading: from fileref cache updated fileref from " + str + " to " + r1);
                                }
                            }
                        } else if (!Arrays.equals(inputFileLocation2.file_reference, bArr)) {
                            String f10 = r2.a ? Utilities.f(i7Var.V.file_reference) : null;
                            TLRPC.InputFileLocation inputFileLocation3 = i7Var.V;
                            inputFileLocation2.file_reference = bArr;
                            inputFileLocation3.file_reference = bArr;
                            r1 = r2.a ? Utilities.f(bArr) : null;
                            str = f10;
                            if (r2.a) {
                            }
                        }
                    }
                    return true;
                }
                TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj).media;
                if (!(inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument)) {
                    if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                        TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                        if (!Arrays.equals(tL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                            tL_inputStickeredMediaPhoto.id.file_reference = bArr;
                            return true;
                        }
                    }
                    return true;
                }
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                if (!Arrays.equals(tL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                    tL_inputStickeredMediaDocument.id.file_reference = bArr;
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            q8 q8Var = (q8) arrayList.get(i3);
            s(q8Var.a, q8Var.b, tLObject, tL_error, i3 == size + (-1), false);
            i3++;
        }
        arrayList.clear();
    }

    public final o8 b(String str) {
        HashMap hashMap = this.c;
        o8 o8Var = (o8) hashMap.get(str);
        if (o8Var == null || Math.abs(System.currentTimeMillis() - o8Var.b) < 60000) {
            return o8Var;
        }
        hashMap.remove(str);
        return null;
    }

    public final byte[] d(TLRPC.Chat chat, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.ChatPhoto chatPhoto;
        if (chat == null || (chatPhoto = chat.photo) == null) {
            return null;
        }
        if (!(inputFileLocation instanceof TLRPC.TL_inputFileLocation) && !(inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
            return null;
        }
        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
            zArr[0] = true;
            if (q(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
                return new byte[0];
            }
            return null;
        }
        byte[] f10 = f(chatPhoto.photo_small, inputFileLocation, zArr);
        if (q(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (f10 == null) {
            return q(null, chat, true, inputFileLocation, inputFileLocationArr, zArr) ? new byte[0] : f(chat.photo.photo_big, inputFileLocation, zArr);
        }
        return f10;
    }

    public final byte[] h(TLRPC.User user, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
            return null;
        }
        byte[] f10 = f(userProfilePhoto.photo_small, inputFileLocation, zArr);
        if (q(user, null, false, inputFileLocation, inputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (f10 == null) {
            return q(user, null, true, inputFileLocation, inputFileLocationArr, zArr) ? new byte[0] : f(user.photo.photo_big, inputFileLocation, zArr);
        }
        return f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x048c, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02d9 A[LOOP:6: B:178:0x02b6->B:184:0x02d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x048a A[EDGE_INSN: B:185:0x048a->B:19:0x048a BREAK  A[LOOP:6: B:178:0x02b6->B:184:0x02d9], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair m(TLRPC.InputFileLocation inputFileLocation, String str, TLObject tLObject, Object... objArr) {
        TLRPC.InputFileLocation[] inputFileLocationArr;
        boolean[] zArr;
        byte[] bArr;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        byte[] d;
        TLRPC.InputFileLocation inputFileLocation2;
        Pair m10;
        TLRPC.InputFileLocation inputFileLocation3 = null;
        if ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
            inputFileLocationArr = new TLRPC.InputFileLocation[1];
            zArr = new boolean[1];
        } else {
            inputFileLocationArr = null;
            zArr = null;
        }
        if (str == null || (m10 = m(inputFileLocation, null, tLObject, objArr)) == null) {
            bArr = null;
        } else {
            bArr = (byte[]) m10.first;
            Object obj = m10.second;
            if (obj != null && inputFileLocationArr != null) {
                inputFileLocationArr[0] = (TLRPC.InputFileLocation) obj;
            }
        }
        if (tLObject instanceof ei.j6) {
            TLRPC.MessageMedia messageMedia3 = ((ei.j6) tLObject).media;
            TLRPC.Document document2 = messageMedia3.document;
            if (document2 != null) {
                bArr = e(document2, messageMedia3.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
            } else {
                TLRPC.Photo photo3 = messageMedia3.photo;
                if (photo3 != null) {
                    bArr = g(photo3, inputFileLocation, zArr, inputFileLocationArr);
                }
            }
        } else if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                boolean z10 = r2.a;
                a8.b("empty messages, file ref not found");
            } else {
                int size = messages_messages.messages.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.Message message = messages_messages.messages.get(i3);
                    TLRPC.MessageMedia messageMedia4 = message.media;
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaPaidMedia) {
                        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia4;
                        for (int i10 = 0; i10 < tL_messageMediaPaidMedia.extended_media.size(); i10++) {
                            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i10);
                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                bArr = j(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, inputFileLocation, zArr, inputFileLocationArr);
                            }
                            if (bArr != null) {
                                break;
                            }
                        }
                    } else {
                        TL_iv.RichMessage richMessage = message.rich_message;
                        if (richMessage != null) {
                            bArr = l(richMessage, inputFileLocation, zArr, inputFileLocationArr);
                        } else if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                            bArr = k((TLRPC.TL_messageMediaPoll) messageMedia4, inputFileLocation, zArr, inputFileLocationArr);
                        } else if (messageMedia4 != null) {
                            bArr = j(messageMedia4, inputFileLocation, zArr, inputFileLocationArr);
                        } else {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                bArr = g(messageAction.photo, inputFileLocation, zArr, inputFileLocationArr);
                            }
                        }
                    }
                }
                if (bArr == null) {
                    getMessagesStorage().r1(messages_messages.messages.get(0), messages_messages.users, messages_messages.chats, true);
                    boolean z11 = r2.a;
                    a8.b("file ref not found in messages, replacing message");
                }
            }
        } else if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_help_premiumPromo) tLObject).videos;
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                bArr = e(document3, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
            getMediaDataController().x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
            ArrayList<TLRPC.TL_availableReaction> arrayList2 = tL_messages_availableReactions.reactions;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                TLRPC.TL_availableReaction tL_availableReaction = arrayList2.get(i12);
                i12++;
                TLRPC.TL_availableReaction tL_availableReaction2 = tL_availableReaction;
                bArr = e(tL_availableReaction2.static_icon, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null || (bArr = e(tL_availableReaction2.appear_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (bArr = e(tL_availableReaction2.select_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (bArr = e(tL_availableReaction2.activate_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (bArr = e(tL_availableReaction2.effect_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (bArr = e(tL_availableReaction2.around_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (bArr = e(tL_availableReaction2.center_icon, null, inputFileLocation, zArr, inputFileLocationArr)) != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            getMessagesController().Y3(tL_users_userFull.users, false);
            getMessagesController().S3(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            TL_bots.BotInfo botInfo = userFull.bot_info;
            if (botInfo != null) {
                getMessagesStorage().j2(userFull, true);
                if (bArr == null) {
                    bArr = e(botInfo.description_document, null, inputFileLocation, zArr, inputFileLocationArr);
                }
                if (bArr == null) {
                    bArr = g(botInfo.description_photo, inputFileLocation, zArr, inputFileLocationArr);
                }
            }
        } else if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList3 = ((TLRPC.TL_attachMenuBotsBot) tLObject).bot.icons;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList3.get(i13);
                i13++;
                bArr = e(tL_attachMenuBotIcon.icon, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_help_appUpdate) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject;
            try {
                az.j1 = tL_help_appUpdate;
                az.y();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                hs.e().k(hs.Q4, new Object[0]);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                TLRPC.Document document4 = tL_help_appUpdate.document;
                if (document4 != null) {
                    bArr = document4.file_reference;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                    TLRPC.Document document5 = tL_help_appUpdate.document;
                    tL_inputDocumentFileLocation.id = document5.id;
                    tL_inputDocumentFileLocation.access_hash = document5.access_hash;
                    tL_inputDocumentFileLocation.file_reference = document5.file_reference;
                    tL_inputDocumentFileLocation.thumb_size = "";
                    inputFileLocationArr = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                }
            } catch (Exception e12) {
                a8.g(e12, true);
                bArr = null;
            }
            if (bArr == null) {
                bArr = e(tL_help_appUpdate.document, null, inputFileLocation, zArr, inputFileLocationArr);
            }
            if (bArr == null) {
                bArr = e(tL_help_appUpdate.sticker, null, inputFileLocation, zArr, inputFileLocationArr);
            }
        } else if (tLObject instanceof TLRPC.TL_messages_webPage) {
            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
            getMessagesController().S3(tL_messages_webPage.chats, false);
            getMessagesController().Y3(tL_messages_webPage.users, false);
            bArr = i(tL_messages_webPage.webpage, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof TLRPC.WebPage) {
            bArr = i((TLRPC.WebPage) tLObject, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            int size5 = tL_wallPapers.wallpapers.size();
            for (int i14 = 0; i14 < size5; i14++) {
                bArr = e(tL_wallPapers.wallpapers.get(i14).document, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_wallPaper) {
            bArr = e(((TLRPC.TL_wallPaper) tLObject).document, null, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof TLRPC.TL_theme) {
            bArr = e(((TLRPC.TL_theme) tLObject).document, null, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                int size6 = vector.objects.size();
                for (int i15 = 0; i15 < size6; i15++) {
                    Object obj2 = vector.objects.get(i15);
                    if (obj2 instanceof TLRPC.User) {
                        d = h((TLRPC.User) obj2, inputFileLocation, zArr, inputFileLocationArr);
                    } else {
                        if (obj2 instanceof TLRPC.Chat) {
                            d = d((TLRPC.Chat) obj2, inputFileLocation, zArr, inputFileLocationArr);
                        }
                        if (bArr == null) {
                            break;
                        }
                    }
                    bArr = d;
                    if (bArr == null) {
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_chats) {
            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
            if (!tL_messages_chats.chats.isEmpty()) {
                int size7 = tL_messages_chats.chats.size();
                for (int i16 = 0; i16 < size7; i16++) {
                    bArr = d(tL_messages_chats.chats.get(i16), inputFileLocation, zArr, inputFileLocationArr);
                    if (bArr != null) {
                        break;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
            TLRPC.TL_messages_savedGifs tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject;
            int size8 = tL_messages_savedGifs.gifs.size();
            for (int i17 = 0; i17 < size8; i17++) {
                bArr = e(tL_messages_savedGifs.gifs.get(i17), null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            if (bArr == null) {
                int size9 = tL_messages_stickerSet.documents.size();
                for (int i18 = 0; i18 < size9; i18++) {
                    bArr = e(tL_messages_stickerSet.documents.get(i18), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (bArr != null) {
                        break;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
            TLRPC.TL_messages_recentStickers tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject;
            int size10 = tL_messages_recentStickers.stickers.size();
            for (int i19 = 0; i19 < size10; i19++) {
                bArr = e(tL_messages_recentStickers.stickers.get(i19), null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
            TLRPC.TL_messages_favedStickers tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject;
            int size11 = tL_messages_favedStickers.stickers.size();
            for (int i20 = 0; i20 < size11; i20++) {
                bArr = e(tL_messages_favedStickers.stickers.get(i20), null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.photos_Photos) {
            TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
            int size12 = photos_photos.photos.size();
            for (int i21 = 0; i21 < size12; i21++) {
                bArr = g(photos_photos.photos.get(i21), inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TL_stories.TL_stories_stories) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            if (tL_stories_stories.stories.isEmpty() || (messageMedia = (storyItem = tL_stories_stories.stories.get(0)).media) == null) {
                storyItem = null;
            } else {
                if (bArr == null && (photo2 = messageMedia.photo) != null) {
                    bArr = g(photo2, inputFileLocation, zArr, inputFileLocationArr);
                }
                if (bArr == null && (photo = storyItem.media.video_cover) != null) {
                    bArr = g(photo, inputFileLocation, zArr, inputFileLocationArr);
                }
                if (bArr == null && (document = (messageMedia2 = storyItem.media).document) != null) {
                    bArr = e(document, messageMedia2.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
                }
            }
            Object obj3 = objArr[1];
            if (obj3 instanceof i7) {
                Object obj4 = ((i7) obj3).p0;
                if (obj4 instanceof TL_stories.StoryItem) {
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj4;
                    if (storyItem == null) {
                        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                        tL_updateStory.peer = getMessagesController().z1(storyItem2.dialogId);
                        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                        tL_updateStory.story = tL_storyItemDeleted;
                        tL_storyItemDeleted.id = storyItem2.id;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(tL_updateStory);
                        getMessagesController().N3(arrayList4, null, null, false, 0);
                    } else {
                        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(storyItem2.dialogId));
                        if (a22 != null && a22.contact) {
                            hp.s1(this.currentAccount).P1().k.k(storyItem2.dialogId, storyItem);
                        }
                    }
                    if (storyItem != null && bArr == null) {
                        TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                        tL_updateStory2.peer = hp.s1(this.currentAccount).z1(storyItem2.dialogId);
                        tL_updateStory2.story = storyItem;
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(tL_updateStory2);
                        hp.s1(this.currentAccount).N3(arrayList5, null, null, false, 0);
                    }
                }
            }
        }
        if (inputFileLocationArr != null && (inputFileLocation2 = inputFileLocationArr[0]) != null) {
            inputFileLocation3 = inputFileLocation2;
        }
        return new Pair(bArr, inputFileLocation3);
    }

    public final boolean q(TLRPC.User user, TLRPC.Chat chat, boolean z10, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation[] inputFileLocationArr, boolean[] zArr) {
        TLRPC.InputPeer tL_inputPeerChat;
        TLRPC.InputPeer inputPeer;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
        long j10 = inputFileLocation.volume_id;
        tL_inputPeerPhotoFileLocation.id = j10;
        tL_inputPeerPhotoFileLocation.volume_id = j10;
        tL_inputPeerPhotoFileLocation.local_id = inputFileLocation.local_id;
        tL_inputPeerPhotoFileLocation.big = z10;
        if (user == null) {
            if (!t3.T(chat)) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = chat.id;
            } else if (chat.access_hash != 0 || chat.fromMessageDialogId == 0 || chat.fromMessageId == 0) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.access_hash = chat.access_hash;
            } else {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.peer = getMessagesController().j1(chat.fromMessageDialogId);
                tL_inputPeerChat.msg_id = chat.fromMessageId;
            }
            tL_inputPeerPhotoFileLocation.photo_id = chat.photo.photo_id;
            inputPeer = tL_inputPeerChat;
        } else if (user.access_hash != 0 || user.fromMessageId == 0 || user.fromMessageDialogId == 0) {
            inputPeer = new TLRPC.TL_inputPeerUser();
            inputPeer.user_id = user.id;
            inputPeer.access_hash = user.access_hash;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        } else {
            inputPeer = new TLRPC.TL_inputPeerUserFromMessage();
            inputPeer.user_id = user.id;
            inputPeer.peer = getMessagesController().j1(user.fromMessageDialogId);
            inputPeer.msg_id = user.fromMessageId;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        }
        tL_inputPeerPhotoFileLocation.peer = inputPeer;
        inputFileLocationArr[0] = tL_inputPeerPhotoFileLocation;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10, boolean z11) {
        String str3;
        String str4;
        TLRPC.TL_error tL_error2;
        boolean z12;
        ArrayList arrayList;
        boolean[] zArr;
        boolean z13;
        boolean[] zArr2;
        ArrayList arrayList2;
        int i3;
        boolean z14;
        int i10;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        boolean z15;
        Object obj;
        p8 p8Var;
        HashMap hashMap;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        int i11;
        int i12;
        byte[] e10;
        ArrayList arrayList3;
        long j10;
        byte[] e11;
        int i13;
        byte[] g7;
        int i14;
        int i15;
        int i16;
        boolean z16 = tLObject instanceof TLRPC.TL_help_premiumPromo;
        if (z16) {
            str4 = "premium_promo";
        } else if (tLObject instanceof TL_account.TL_wallPapers) {
            str4 = "wallpaper";
        } else if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
            str4 = "gif";
        } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
            str4 = "recent";
        } else if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
            str4 = "fav";
        } else {
            str3 = str2;
            HashMap hashMap2 = this.c;
            ?? r12 = 1;
            if (str2 != null) {
                HashMap hashMap3 = this.b;
                ArrayList arrayList4 = (ArrayList) hashMap3.get(str2);
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    int i17 = 0;
                    z12 = false;
                    while (i17 < size) {
                        p8 p8Var2 = (p8) arrayList4.get(i17);
                        if (p8Var2.d) {
                            i15 = size;
                            i16 = i17;
                        } else {
                            i15 = size;
                            i16 = i17;
                            if (s(p8Var2.c, null, tLObject, tL_error, z10 && !z12, z11)) {
                                z12 = true;
                            }
                        }
                        i17 = i16 + 1;
                        size = i15;
                    }
                    tL_error2 = tL_error;
                    if (z12 && ((o8) hashMap2.get(str3)) == null) {
                        o8 o8Var = new o8();
                        o8Var.a = tLObject;
                        o8Var.b = System.currentTimeMillis();
                        hashMap2.put(str3, o8Var);
                    }
                    hashMap3.remove(str2);
                    HashMap hashMap4 = this.a;
                    arrayList = (ArrayList) hashMap4.get(str);
                    if (arrayList == null) {
                        return z12;
                    }
                    int size2 = arrayList.size();
                    boolean[] zArr3 = null;
                    int i18 = 0;
                    TLRPC.InputFileLocation[] inputFileLocationArr = null;
                    byte[] bArr = null;
                    while (i18 < size2) {
                        p8 p8Var3 = (p8) arrayList.get(i18);
                        if (p8Var3.d) {
                            arrayList2 = arrayList;
                            i3 = size2;
                            z14 = z16;
                            hashMap = hashMap2;
                            z15 = r12;
                            i10 = i18;
                        } else {
                            if (tL_error2 == null || !r2.a) {
                                zArr = zArr3;
                            } else {
                                Object[] objArr = p8Var3.b;
                                zArr = zArr3;
                                if (objArr.length > r12) {
                                    Object obj2 = objArr[r12];
                                    if (obj2 instanceof i7) {
                                        a8.d("debug_loading: " + ((i7) obj2).L0.getName() + " can't update file reference: " + tL_error2.code + " " + tL_error2.text);
                                    }
                                }
                            }
                            TLRPC.InputFileLocation inputFileLocation = p8Var3.a;
                            if ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
                                z13 = true;
                                inputFileLocationArr = new TLRPC.InputFileLocation[1];
                                zArr2 = new boolean[1];
                            } else {
                                zArr2 = zArr;
                                z13 = true;
                            }
                            p8Var3.d = z13;
                            if (tLObject instanceof ei.j6) {
                                TLRPC.MessageMedia messageMedia2 = ((ei.j6) tLObject).media;
                                arrayList2 = arrayList;
                                TLRPC.Document document3 = messageMedia2.document;
                                if (document3 != null) {
                                    bArr = e(document3, messageMedia2.alt_documents, inputFileLocation, zArr2, inputFileLocationArr);
                                } else {
                                    TLRPC.Photo photo3 = messageMedia2.photo;
                                    if (photo3 != null) {
                                        bArr = g(photo3, inputFileLocation, zArr2, inputFileLocationArr);
                                    }
                                }
                                i3 = size2;
                                p8Var = p8Var3;
                                z14 = z16;
                            } else {
                                arrayList2 = arrayList;
                                if (tLObject instanceof TLRPC.messages_Messages) {
                                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                    if (messages_messages.messages.isEmpty()) {
                                        i3 = size2;
                                        z14 = z16;
                                        boolean z17 = r2.a;
                                        a8.b("empty messages, file ref not found");
                                    } else {
                                        int size3 = messages_messages.messages.size();
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 >= size3) {
                                                i3 = size2;
                                                z14 = z16;
                                                i13 = 0;
                                                break;
                                            }
                                            int i20 = size3;
                                            TLRPC.Message message = messages_messages.messages.get(i19);
                                            TLRPC.MessageMedia messageMedia3 = message.media;
                                            i3 = size2;
                                            if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                                z14 = z16;
                                                int i21 = 0;
                                                while (i21 < tL_messageMediaPaidMedia.extended_media.size()) {
                                                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i21);
                                                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
                                                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                                        bArr = j(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, p8Var3.a, zArr2, inputFileLocationArr);
                                                    }
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                    i21++;
                                                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                                                }
                                            } else {
                                                z14 = z16;
                                                TL_iv.RichMessage richMessage = message.rich_message;
                                                if (richMessage != null) {
                                                    g7 = l(richMessage, p8Var3.a, zArr2, inputFileLocationArr);
                                                } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                                    g7 = k((TLRPC.TL_messageMediaPoll) messageMedia3, p8Var3.a, zArr2, inputFileLocationArr);
                                                } else if (messageMedia3 != null) {
                                                    g7 = j(messageMedia3, p8Var3.a, zArr2, inputFileLocationArr);
                                                } else {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                                        g7 = g(messageAction.photo, p8Var3.a, zArr2, inputFileLocationArr);
                                                    }
                                                }
                                                bArr = g7;
                                            }
                                            if (bArr != null) {
                                                if (z10) {
                                                    i14 = 0;
                                                    getMessagesStorage().r1(message, messages_messages.users, messages_messages.chats, false);
                                                } else {
                                                    i14 = 0;
                                                }
                                                i13 = i14;
                                            } else {
                                                i19++;
                                                size3 = i20;
                                                size2 = i3;
                                                z16 = z14;
                                            }
                                        }
                                        if (bArr == null) {
                                            getMessagesStorage().r1(messages_messages.messages.get(i13), messages_messages.users, messages_messages.chats, true);
                                            boolean z18 = r2.a;
                                            a8.b("file ref not found in messages, replacing message");
                                        }
                                    }
                                } else {
                                    i3 = size2;
                                    z14 = z16;
                                    if (z14) {
                                        ArrayList<TLRPC.Document> arrayList5 = ((TLRPC.TL_help_premiumPromo) tLObject).videos;
                                        int size4 = arrayList5.size();
                                        int i22 = 0;
                                        while (i22 < size4) {
                                            TLRPC.Document document4 = arrayList5.get(i22);
                                            i22++;
                                            bArr = e(document4, null, p8Var3.a, zArr2, inputFileLocationArr);
                                            if (bArr != null) {
                                                break;
                                            }
                                        }
                                    } else {
                                        long j11 = 1000;
                                        if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
                                            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
                                            getMediaDataController().x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
                                            ArrayList<TLRPC.TL_availableReaction> arrayList6 = tL_messages_availableReactions.reactions;
                                            int size5 = arrayList6.size();
                                            int i23 = 0;
                                            while (true) {
                                                if (i23 >= size5) {
                                                    break;
                                                }
                                                TLRPC.TL_availableReaction tL_availableReaction = arrayList6.get(i23);
                                                i23++;
                                                TLRPC.TL_availableReaction tL_availableReaction2 = tL_availableReaction;
                                                e11 = e(tL_availableReaction2.static_icon, null, p8Var3.a, zArr2, inputFileLocationArr);
                                                if (e11 == null && (e11 = e(tL_availableReaction2.appear_animation, null, p8Var3.a, zArr2, inputFileLocationArr)) == null && (e11 = e(tL_availableReaction2.select_animation, null, p8Var3.a, zArr2, inputFileLocationArr)) == null && (e11 = e(tL_availableReaction2.activate_animation, null, p8Var3.a, zArr2, inputFileLocationArr)) == null && (e11 = e(tL_availableReaction2.effect_animation, null, p8Var3.a, zArr2, inputFileLocationArr)) == null && (e11 = e(tL_availableReaction2.around_animation, null, p8Var3.a, zArr2, inputFileLocationArr)) == null) {
                                                    byte[] e12 = e(tL_availableReaction2.center_icon, null, p8Var3.a, zArr2, inputFileLocationArr);
                                                    if (e12 != null) {
                                                        bArr = e12;
                                                        break;
                                                    }
                                                    bArr = e12;
                                                }
                                            }
                                            bArr = e11;
                                        } else if (tLObject instanceof TLRPC.TL_users_userFull) {
                                            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                                            getMessagesController().Y3(tL_users_userFull.users, false);
                                            getMessagesController().S3(tL_users_userFull.chats, false);
                                            TLRPC.UserFull userFull = tL_users_userFull.full_user;
                                            TL_bots.BotInfo botInfo = userFull.bot_info;
                                            if (botInfo != null) {
                                                getMessagesStorage().j2(userFull, true);
                                                bArr = e(botInfo.description_document, null, p8Var3.a, zArr2, inputFileLocationArr);
                                                if (bArr != null) {
                                                    i10 = i18;
                                                    hashMap = hashMap2;
                                                    zArr3 = zArr2;
                                                    z15 = true;
                                                } else {
                                                    bArr = g(botInfo.description_photo, p8Var3.a, zArr2, inputFileLocationArr);
                                                }
                                            }
                                        } else {
                                            if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
                                                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject).bot;
                                                ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList7 = tL_attachMenuBot.icons;
                                                int size6 = arrayList7.size();
                                                int i24 = 0;
                                                while (true) {
                                                    if (i24 >= size6) {
                                                        j10 = j11;
                                                        break;
                                                    }
                                                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList7.get(i24);
                                                    i24++;
                                                    j10 = j11;
                                                    bArr = e(tL_attachMenuBotIcon.icon, null, p8Var3.a, zArr2, inputFileLocationArr);
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                    j11 = j10;
                                                }
                                                if (z10) {
                                                    TLRPC.TL_attachMenuBots tL_attachMenuBots = getMediaDataController().b;
                                                    ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = new ArrayList<>(tL_attachMenuBots.bots);
                                                    int i25 = 0;
                                                    while (true) {
                                                        if (i25 >= arrayList8.size()) {
                                                            i10 = i18;
                                                            break;
                                                        }
                                                        i10 = i18;
                                                        if (arrayList8.get(i25).bot_id == tL_attachMenuBot.bot_id) {
                                                            arrayList8.set(i25, tL_attachMenuBot);
                                                            break;
                                                        }
                                                        i25++;
                                                        i18 = i10;
                                                    }
                                                    tL_attachMenuBots.bots = arrayList8;
                                                    getMediaDataController().v1(tL_attachMenuBots, tL_attachMenuBots.hash, (int) (System.currentTimeMillis() / j10), false);
                                                } else {
                                                    i10 = i18;
                                                }
                                            } else {
                                                i10 = i18;
                                                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                                                    TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject;
                                                    try {
                                                        az.j1 = tL_help_appUpdate;
                                                        az.y();
                                                    } catch (Exception e13) {
                                                        a8.g(e13, true);
                                                    }
                                                    try {
                                                        hs.e().k(hs.Q4, new Object[0]);
                                                    } catch (Exception e14) {
                                                        a8.g(e14, true);
                                                    }
                                                    try {
                                                        TLRPC.Document document5 = tL_help_appUpdate.document;
                                                        if (document5 != null) {
                                                            bArr = document5.file_reference;
                                                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                                                            TLRPC.Document document6 = tL_help_appUpdate.document;
                                                            tL_inputDocumentFileLocation.id = document6.id;
                                                            tL_inputDocumentFileLocation.access_hash = document6.access_hash;
                                                            tL_inputDocumentFileLocation.file_reference = document6.file_reference;
                                                            tL_inputDocumentFileLocation.thumb_size = "";
                                                            inputFileLocationArr = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                                                        }
                                                    } catch (Exception e15) {
                                                        a8.g(e15, true);
                                                        bArr = null;
                                                    }
                                                    if (bArr == null) {
                                                        arrayList3 = null;
                                                        bArr = e(tL_help_appUpdate.document, null, p8Var3.a, zArr2, inputFileLocationArr);
                                                    } else {
                                                        arrayList3 = null;
                                                    }
                                                    if (bArr == null) {
                                                        e10 = e(tL_help_appUpdate.sticker, arrayList3, p8Var3.a, zArr2, inputFileLocationArr);
                                                        bArr = e10;
                                                    }
                                                } else if (tLObject instanceof TLRPC.TL_messages_webPage) {
                                                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                                                    getMessagesController().S3(tL_messages_webPage.chats, false);
                                                    getMessagesController().Y3(tL_messages_webPage.users, false);
                                                    bArr = i(tL_messages_webPage.webpage, p8Var3.a, zArr2, inputFileLocationArr);
                                                } else if (tLObject instanceof TLRPC.WebPage) {
                                                    bArr = i((TLRPC.WebPage) tLObject, inputFileLocation, zArr2, inputFileLocationArr);
                                                } else if (tLObject instanceof TL_account.TL_wallPapers) {
                                                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                                                    int size7 = tL_wallPapers.wallpapers.size();
                                                    int i26 = 0;
                                                    while (true) {
                                                        if (i26 >= size7) {
                                                            break;
                                                        }
                                                        byte[] e16 = e(tL_wallPapers.wallpapers.get(i26).document, null, p8Var3.a, zArr2, inputFileLocationArr);
                                                        if (e16 != null) {
                                                            bArr = e16;
                                                            break;
                                                        }
                                                        i26++;
                                                        bArr = e16;
                                                    }
                                                    if (bArr != null && z10) {
                                                        getMessagesStorage().p1(1, tL_wallPapers.wallpapers);
                                                    }
                                                } else {
                                                    if (tLObject instanceof TLRPC.TL_wallPaper) {
                                                        TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                                                        e10 = e(tL_wallPaper.document, null, inputFileLocation, zArr2, inputFileLocationArr);
                                                        if (e10 != null && z10) {
                                                            ArrayList arrayList9 = new ArrayList();
                                                            arrayList9.add(tL_wallPaper);
                                                            getMessagesStorage().p1(0, arrayList9);
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_theme) {
                                                        TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject;
                                                        e10 = e(tL_theme.document, null, inputFileLocation, zArr2, inputFileLocationArr);
                                                        if (e10 != null && z10) {
                                                            g0.h3(new a(tL_theme, 9));
                                                        }
                                                    } else if (tLObject instanceof Vector) {
                                                        Vector vector = (Vector) tLObject;
                                                        if (!vector.objects.isEmpty()) {
                                                            int size8 = vector.objects.size();
                                                            int i27 = 0;
                                                            while (i27 < size8) {
                                                                Object obj3 = vector.objects.get(i27);
                                                                if (obj3 instanceof TLRPC.User) {
                                                                    TLRPC.User user = (TLRPC.User) obj3;
                                                                    byte[] h = h(user, p8Var3.a, zArr2, inputFileLocationArr);
                                                                    if (!z10 || h == null) {
                                                                        i11 = size8;
                                                                        i12 = i27;
                                                                    } else {
                                                                        ArrayList arrayList10 = new ArrayList();
                                                                        arrayList10.add(user);
                                                                        i11 = size8;
                                                                        i12 = i27;
                                                                        getMessagesStorage().m1(arrayList10, null, true, true);
                                                                        g0.h3(new y4(13, this, user));
                                                                    }
                                                                    bArr = h;
                                                                } else {
                                                                    i11 = size8;
                                                                    i12 = i27;
                                                                    if (obj3 instanceof TLRPC.Chat) {
                                                                        final TLRPC.Chat chat = (TLRPC.Chat) obj3;
                                                                        byte[] d = d(chat, p8Var3.a, zArr2, inputFileLocationArr);
                                                                        if (z10 && d != null) {
                                                                            ArrayList arrayList11 = new ArrayList();
                                                                            arrayList11.add(chat);
                                                                            getMessagesStorage().m1(null, arrayList11, true, true);
                                                                            final int i28 = 0;
                                                                            g0.h3(new Runnable(this) { // from class: org.telegram.messenger.i8
                                                                                public final /* synthetic */ r8 b;

                                                                                {
                                                                                    this.b = this;
                                                                                }

                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    switch (i28) {
                                                                                        case 0:
                                                                                            this.b.getMessagesController().Q3(chat, false);
                                                                                            break;
                                                                                        default:
                                                                                            this.b.getMessagesController().Q3(chat, false);
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            });
                                                                        }
                                                                        bArr = d;
                                                                    }
                                                                }
                                                                if (bArr != null) {
                                                                    break;
                                                                }
                                                                i27 = i12 + 1;
                                                                size8 = i11;
                                                            }
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_chats) {
                                                        TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                                                        if (!tL_messages_chats.chats.isEmpty()) {
                                                            int size9 = tL_messages_chats.chats.size();
                                                            int i29 = 0;
                                                            while (true) {
                                                                if (i29 >= size9) {
                                                                    break;
                                                                }
                                                                final TLRPC.Chat chat2 = tL_messages_chats.chats.get(i29);
                                                                bArr = d(chat2, p8Var3.a, zArr2, inputFileLocationArr);
                                                                if (bArr == null) {
                                                                    i29++;
                                                                } else if (z10) {
                                                                    ArrayList arrayList12 = new ArrayList();
                                                                    arrayList12.add(chat2);
                                                                    final int i30 = 1;
                                                                    getMessagesStorage().m1(null, arrayList12, true, true);
                                                                    g0.h3(new Runnable(this) { // from class: org.telegram.messenger.i8
                                                                        public final /* synthetic */ r8 b;

                                                                        {
                                                                            this.b = this;
                                                                        }

                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i30) {
                                                                                case 0:
                                                                                    this.b.getMessagesController().Q3(chat2, false);
                                                                                    break;
                                                                                default:
                                                                                    this.b.getMessagesController().Q3(chat2, false);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                                                        TLRPC.TL_messages_savedGifs tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject;
                                                        int size10 = tL_messages_savedGifs.gifs.size();
                                                        int i31 = 0;
                                                        while (true) {
                                                            if (i31 >= size10) {
                                                                break;
                                                            }
                                                            byte[] e17 = e(tL_messages_savedGifs.gifs.get(i31), null, p8Var3.a, zArr2, inputFileLocationArr);
                                                            if (e17 != null) {
                                                                bArr = e17;
                                                                break;
                                                            }
                                                            i31++;
                                                            bArr = e17;
                                                        }
                                                        if (z10) {
                                                            getMediaDataController().y1(0, tL_messages_savedGifs.gifs, true, 0, true);
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                                                        if (bArr == null) {
                                                            int size11 = tL_messages_stickerSet.documents.size();
                                                            int i32 = 0;
                                                            while (true) {
                                                                if (i32 >= size11) {
                                                                    break;
                                                                }
                                                                byte[] e18 = e(tL_messages_stickerSet.documents.get(i32), null, p8Var3.a, zArr2, inputFileLocationArr);
                                                                if (e18 != null) {
                                                                    bArr = e18;
                                                                    break;
                                                                }
                                                                i32++;
                                                                bArr = e18;
                                                            }
                                                        }
                                                        if (z10) {
                                                            g0.h3(new y4(14, this, tL_messages_stickerSet));
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                                                        TLRPC.TL_messages_recentStickers tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject;
                                                        int size12 = tL_messages_recentStickers.stickers.size();
                                                        int i33 = 0;
                                                        while (true) {
                                                            if (i33 >= size12) {
                                                                break;
                                                            }
                                                            byte[] e19 = e(tL_messages_recentStickers.stickers.get(i33), null, p8Var3.a, zArr2, inputFileLocationArr);
                                                            if (e19 != null) {
                                                                bArr = e19;
                                                                break;
                                                            }
                                                            i33++;
                                                            bArr = e19;
                                                        }
                                                        if (z10) {
                                                            getMediaDataController().y1(0, tL_messages_recentStickers.stickers, false, 0, true);
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                                                        TLRPC.TL_messages_favedStickers tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject;
                                                        int size13 = tL_messages_favedStickers.stickers.size();
                                                        int i34 = 0;
                                                        while (true) {
                                                            if (i34 >= size13) {
                                                                break;
                                                            }
                                                            byte[] e20 = e(tL_messages_favedStickers.stickers.get(i34), null, p8Var3.a, zArr2, inputFileLocationArr);
                                                            if (e20 != null) {
                                                                bArr = e20;
                                                                break;
                                                            }
                                                            i34++;
                                                            bArr = e20;
                                                        }
                                                        if (z10) {
                                                            getMediaDataController().y1(2, tL_messages_favedStickers.stickers, false, 0, true);
                                                        }
                                                    } else if (tLObject instanceof TLRPC.photos_Photos) {
                                                        TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                                        int size14 = photos_photos.photos.size();
                                                        for (int i35 = 0; i35 < size14; i35++) {
                                                            bArr = g(photos_photos.photos.get(i35), p8Var3.a, zArr2, inputFileLocationArr);
                                                            if (bArr != null) {
                                                                break;
                                                            }
                                                        }
                                                    } else if (tLObject instanceof TL_stories.TL_stories_stories) {
                                                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                                                        if (tL_stories_stories.stories.isEmpty()) {
                                                            storyItem = null;
                                                        } else {
                                                            storyItem2 = tL_stories_stories.stories.get(0);
                                                            if (bArr != null || (document2 = storyItem2.music) == null) {
                                                                storyItem = null;
                                                            } else {
                                                                storyItem = null;
                                                                bArr = e(document2, null, p8Var3.a, zArr2, inputFileLocationArr);
                                                            }
                                                            TLRPC.MessageMedia messageMedia4 = storyItem2.media;
                                                            if (messageMedia4 != null) {
                                                                if (bArr == null && (photo2 = messageMedia4.photo) != null) {
                                                                    bArr = g(photo2, p8Var3.a, zArr2, inputFileLocationArr);
                                                                }
                                                                if (bArr == null && (photo = storyItem2.media.video_cover) != null) {
                                                                    bArr = g(photo, p8Var3.a, zArr2, inputFileLocationArr);
                                                                }
                                                                if (bArr == null && (document = (messageMedia = storyItem2.media).document) != null) {
                                                                    bArr = e(document, messageMedia.alt_documents, p8Var3.a, zArr2, inputFileLocationArr);
                                                                }
                                                                z15 = true;
                                                                obj = p8Var3.b[1];
                                                                if (obj instanceof i7) {
                                                                    Object obj4 = ((i7) obj).p0;
                                                                    if (obj4 instanceof TL_stories.StoryItem) {
                                                                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) obj4;
                                                                        if (storyItem2 == null) {
                                                                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                                                            p8Var = p8Var3;
                                                                            tL_updateStory.peer = getMessagesController().z1(storyItem3.dialogId);
                                                                            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                                                            tL_updateStory.story = tL_storyItemDeleted;
                                                                            tL_storyItemDeleted.id = storyItem3.id;
                                                                            ArrayList arrayList13 = new ArrayList();
                                                                            arrayList13.add(tL_updateStory);
                                                                            getMessagesController().N3(arrayList13, null, null, false, 0);
                                                                        } else {
                                                                            p8Var = p8Var3;
                                                                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(storyItem3.dialogId));
                                                                            if (a22 != null && a22.contact) {
                                                                                hp.s1(this.currentAccount).P1().k.k(storyItem3.dialogId, storyItem2);
                                                                            }
                                                                        }
                                                                        if (storyItem2 != null && bArr == null) {
                                                                            TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                                                                            hashMap = hashMap2;
                                                                            tL_updateStory2.peer = hp.s1(this.currentAccount).z1(storyItem3.dialogId);
                                                                            tL_updateStory2.story = storyItem2;
                                                                            ArrayList arrayList14 = new ArrayList();
                                                                            arrayList14.add(tL_updateStory2);
                                                                            hp.s1(this.currentAccount).N3(arrayList14, null, null, false, 0);
                                                                            if (bArr != null) {
                                                                                v(p8Var.b);
                                                                            } else if (t(p8Var, bArr, inputFileLocationArr != null ? inputFileLocationArr[0] : null, z11)) {
                                                                                zArr3 = zArr2;
                                                                                z12 = z15;
                                                                            }
                                                                            zArr3 = zArr2;
                                                                        }
                                                                        hashMap = hashMap2;
                                                                        if (bArr != null) {
                                                                        }
                                                                        zArr3 = zArr2;
                                                                    }
                                                                }
                                                                p8Var = p8Var3;
                                                                hashMap = hashMap2;
                                                                if (bArr != null) {
                                                                }
                                                                zArr3 = zArr2;
                                                            }
                                                        }
                                                        storyItem2 = storyItem;
                                                        z15 = true;
                                                        obj = p8Var3.b[1];
                                                        if (obj instanceof i7) {
                                                        }
                                                        p8Var = p8Var3;
                                                        hashMap = hashMap2;
                                                        if (bArr != null) {
                                                        }
                                                        zArr3 = zArr2;
                                                    }
                                                    bArr = e10;
                                                }
                                            }
                                            p8Var = p8Var3;
                                            hashMap = hashMap2;
                                            z15 = true;
                                            if (bArr != null) {
                                            }
                                            zArr3 = zArr2;
                                        }
                                    }
                                }
                                p8Var = p8Var3;
                            }
                            i10 = i18;
                            hashMap = hashMap2;
                            z15 = true;
                            if (bArr != null) {
                            }
                            zArr3 = zArr2;
                        }
                        i18 = i10 + 1;
                        tL_error2 = tL_error;
                        hashMap2 = hashMap;
                        arrayList = arrayList2;
                        r12 = z15;
                        size2 = i3;
                        z16 = z14;
                    }
                    HashMap hashMap5 = hashMap2;
                    hashMap4.remove(str);
                    if (z12 && ((o8) hashMap5.get(str)) == null) {
                        o8 o8Var2 = new o8();
                        o8Var2.a = tLObject;
                        o8Var2.b = System.currentTimeMillis();
                        hashMap5.put(str, o8Var2);
                    }
                    return z12;
                }
            }
            tL_error2 = tL_error;
            z12 = false;
            HashMap hashMap42 = this.a;
            arrayList = (ArrayList) hashMap42.get(str);
            if (arrayList == null) {
            }
        }
        str3 = str4;
        HashMap hashMap22 = this.c;
        ?? r122 = 1;
        if (str2 != null) {
        }
        tL_error2 = tL_error;
        z12 = false;
        HashMap hashMap422 = this.a;
        arrayList = (ArrayList) hashMap422.get(str);
        if (arrayList == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(final p8 p8Var, byte[] bArr, TLRPC.InputFileLocation inputFileLocation, boolean z10) {
        Object[] objArr;
        String str;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        int indexOf;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int indexOf2;
        int indexOf3;
        boolean z11 = r2.a;
        StringBuilder sb2 = new StringBuilder("fileref updated for ");
        final int i3 = 0;
        sb2.append(p8Var.b[0]);
        sb2.append(" ");
        k2.p1.w(p8Var.c, sb2);
        Object[] objArr2 = p8Var.b;
        Object obj = objArr2[0];
        final int i10 = 1;
        if (obj instanceof TL_stories.TL_storyItem) {
            ((TL_stories.TL_storyItem) obj).media.document.file_reference = bArr;
            return true;
        }
        boolean z12 = obj instanceof TLRPC.TL_inputSingleMedia;
        final int i11 = 3;
        HashMap hashMap = this.d;
        if (z12) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) objArr2[1];
            Object[] objArr3 = (Object[]) hashMap.get(tL_messages_sendMultiMedia);
            if (objArr3 != null) {
                TLRPC.TL_inputSingleMedia tL_inputSingleMedia = (TLRPC.TL_inputSingleMedia) p8Var.b[0];
                TLRPC.InputMedia inputMedia = tL_inputSingleMedia.media;
                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                    if (!z10 || !Arrays.equals(tL_inputMediaDocument.id.file_reference, bArr)) {
                        tL_inputMediaDocument.id.file_reference = bArr;
                        indexOf3 = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                        if (indexOf3 >= 0) {
                            ArrayList arrayList = (ArrayList) objArr3[3];
                            arrayList.set(indexOf3, null);
                            boolean z13 = true;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                if (arrayList.get(i12) != null) {
                                    z13 = false;
                                }
                            }
                            if (z13) {
                                hashMap.remove(tL_messages_sendMultiMedia);
                                g0.h3(new j8(this, tL_messages_sendMultiMedia, objArr3, i3));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    if (!z10 || !Arrays.equals(tL_inputMediaPhoto3.id.file_reference, bArr)) {
                        tL_inputMediaPhoto3.id.file_reference = bArr;
                    }
                    return false;
                }
                indexOf3 = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                if (indexOf3 >= 0) {
                }
            }
            return true;
        }
        final int i13 = 2;
        if (objArr2.length >= 2) {
            Object obj2 = objArr2[1];
            if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj2;
                if ((tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                    Object[] objArr4 = (Object[]) hashMap.get(tL_messages_sendMedia);
                    if (objArr4 != null) {
                        Object obj3 = p8Var.b[0];
                        if (obj3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj3;
                            if (!z10 || !Arrays.equals(tL_inputMediaDocument2.id.file_reference, bArr)) {
                                tL_inputMediaDocument2.id.file_reference = bArr;
                                tL_inputMediaPhoto2 = tL_inputMediaDocument2;
                                indexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(tL_inputMediaPhoto2);
                                if (indexOf2 >= 0) {
                                    ArrayList arrayList2 = (ArrayList) objArr4[3];
                                    arrayList2.set(indexOf2, null);
                                    boolean z14 = true;
                                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                        if (arrayList2.get(i14) != null) {
                                            z14 = false;
                                        }
                                    }
                                    if (z14) {
                                        hashMap.remove(tL_messages_sendMedia);
                                        g0.h3(new k8(this, tL_messages_sendMedia, objArr4, i3));
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (obj3 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) obj3;
                            if (!z10 || !Arrays.equals(tL_inputMediaPhoto4.id.file_reference, bArr)) {
                                tL_inputMediaPhoto4.id.file_reference = bArr;
                                tL_inputMediaPhoto2 = tL_inputMediaPhoto4;
                            }
                            return false;
                        }
                        tL_inputMediaPhoto2 = null;
                        indexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(tL_inputMediaPhoto2);
                        if (indexOf2 >= 0) {
                        }
                    }
                    return true;
                }
            }
        }
        if (objArr2.length >= 2) {
            Object obj4 = objArr2[1];
            if (obj4 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj4;
                if ((tL_sendMessage.media instanceof TLRPC.TL_inputMediaPaidMedia) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                    Object[] objArr5 = (Object[]) hashMap.get(tL_sendMessage);
                    if (objArr5 != null) {
                        Object obj5 = p8Var.b[0];
                        if (obj5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) obj5;
                            if (!z10 || !Arrays.equals(tL_inputMediaDocument3.id.file_reference, bArr)) {
                                tL_inputMediaDocument3.id.file_reference = bArr;
                                tL_inputMediaPhoto = tL_inputMediaDocument3;
                                indexOf = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(tL_inputMediaPhoto);
                                if (indexOf >= 0) {
                                    ArrayList arrayList3 = (ArrayList) objArr5[3];
                                    arrayList3.set(indexOf, null);
                                    boolean z15 = true;
                                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                        if (arrayList3.get(i15) != null) {
                                            z15 = false;
                                        }
                                    }
                                    if (z15) {
                                        hashMap.remove(tL_sendMessage);
                                        g0.h3(new l8(this, tL_sendMessage, objArr5, i3));
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (obj5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) obj5;
                            if (!z10 || !Arrays.equals(tL_inputMediaPhoto5.id.file_reference, bArr)) {
                                tL_inputMediaPhoto5.id.file_reference = bArr;
                                tL_inputMediaPhoto = tL_inputMediaPhoto5;
                            }
                            return false;
                        }
                        tL_inputMediaPhoto = null;
                        indexOf = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(tL_inputMediaPhoto);
                        if (indexOf >= 0) {
                        }
                    }
                    return true;
                }
            }
        }
        if (obj instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj).media;
            if (!(inputMedia2 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    if (!z10 || !Arrays.equals(tL_inputMediaPhoto6.id.file_reference, bArr)) {
                        tL_inputMediaPhoto6.id.file_reference = bArr;
                    }
                }
                g0.h3(new Runnable(this) { // from class: org.telegram.messenger.m8
                    public final /* synthetic */ r8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                yy sendMessagesHelper = this.b.getSendMessagesHelper();
                                p8 p8Var2 = p8Var;
                                Object[] objArr6 = p8Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                zi ziVar = (zi) objArr6[1];
                                String str2 = (String) objArr6[2];
                                ky kyVar = (ky) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = p8Var2.b;
                                sendMessagesHelper.O(tLObject, ziVar, str2, kyVar, booleanValue, (ky) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                                p8 p8Var3 = p8Var;
                                Object[] objArr8 = p8Var3.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                zi ziVar2 = (zi) objArr8[1];
                                String str3 = (String) objArr8[2];
                                ky kyVar2 = (ky) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = p8Var3.b;
                                sendMessagesHelper2.O(tLObject2, ziVar2, str3, kyVar2, booleanValue2, (ky) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                yy sendMessagesHelper3 = this.b.getSendMessagesHelper();
                                p8 p8Var4 = p8Var;
                                Object[] objArr10 = p8Var4.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                zi ziVar3 = (zi) objArr10[1];
                                String str4 = (String) objArr10[2];
                                ky kyVar3 = (ky) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = p8Var4.b;
                                sendMessagesHelper3.O(tLObject3, ziVar3, str4, kyVar3, booleanValue3, (ky) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                yy sendMessagesHelper4 = this.b.getSendMessagesHelper();
                                p8 p8Var5 = p8Var;
                                Object[] objArr12 = p8Var5.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                zi ziVar4 = (zi) objArr12[1];
                                String str5 = (String) objArr12[2];
                                ky kyVar4 = (ky) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = p8Var5.b;
                                sendMessagesHelper4.O(tLObject4, ziVar4, str5, kyVar4, booleanValue4, (ky) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia2;
            if (!z10 || !Arrays.equals(tL_inputMediaDocument4.id.file_reference, bArr)) {
                tL_inputMediaDocument4.id.file_reference = bArr;
                g0.h3(new Runnable(this) { // from class: org.telegram.messenger.m8
                    public final /* synthetic */ r8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                yy sendMessagesHelper = this.b.getSendMessagesHelper();
                                p8 p8Var2 = p8Var;
                                Object[] objArr6 = p8Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                zi ziVar = (zi) objArr6[1];
                                String str2 = (String) objArr6[2];
                                ky kyVar = (ky) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = p8Var2.b;
                                sendMessagesHelper.O(tLObject, ziVar, str2, kyVar, booleanValue, (ky) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                                p8 p8Var3 = p8Var;
                                Object[] objArr8 = p8Var3.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                zi ziVar2 = (zi) objArr8[1];
                                String str3 = (String) objArr8[2];
                                ky kyVar2 = (ky) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = p8Var3.b;
                                sendMessagesHelper2.O(tLObject2, ziVar2, str3, kyVar2, booleanValue2, (ky) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                yy sendMessagesHelper3 = this.b.getSendMessagesHelper();
                                p8 p8Var4 = p8Var;
                                Object[] objArr10 = p8Var4.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                zi ziVar3 = (zi) objArr10[1];
                                String str4 = (String) objArr10[2];
                                ky kyVar3 = (ky) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = p8Var4.b;
                                sendMessagesHelper3.O(tLObject3, ziVar3, str4, kyVar3, booleanValue3, (ky) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                yy sendMessagesHelper4 = this.b.getSendMessagesHelper();
                                p8 p8Var5 = p8Var;
                                Object[] objArr12 = p8Var5.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                zi ziVar4 = (zi) objArr12[1];
                                String str5 = (String) objArr12[2];
                                ky kyVar4 = (ky) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = p8Var5.b;
                                sendMessagesHelper4.O(tLObject4, ziVar4, str5, kyVar4, booleanValue4, (ky) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
        } else if (obj instanceof TL_ephemeral.TL_sendMessage) {
            TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) obj).media;
            if (!(inputMedia3 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                    if (!z10 || !Arrays.equals(tL_inputMediaPhoto7.id.file_reference, bArr)) {
                        tL_inputMediaPhoto7.id.file_reference = bArr;
                    }
                }
                g0.h3(new Runnable(this) { // from class: org.telegram.messenger.m8
                    public final /* synthetic */ r8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                yy sendMessagesHelper = this.b.getSendMessagesHelper();
                                p8 p8Var2 = p8Var;
                                Object[] objArr6 = p8Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                zi ziVar = (zi) objArr6[1];
                                String str2 = (String) objArr6[2];
                                ky kyVar = (ky) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = p8Var2.b;
                                sendMessagesHelper.O(tLObject, ziVar, str2, kyVar, booleanValue, (ky) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                                p8 p8Var3 = p8Var;
                                Object[] objArr8 = p8Var3.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                zi ziVar2 = (zi) objArr8[1];
                                String str3 = (String) objArr8[2];
                                ky kyVar2 = (ky) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = p8Var3.b;
                                sendMessagesHelper2.O(tLObject2, ziVar2, str3, kyVar2, booleanValue2, (ky) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                yy sendMessagesHelper3 = this.b.getSendMessagesHelper();
                                p8 p8Var4 = p8Var;
                                Object[] objArr10 = p8Var4.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                zi ziVar3 = (zi) objArr10[1];
                                String str4 = (String) objArr10[2];
                                ky kyVar3 = (ky) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = p8Var4.b;
                                sendMessagesHelper3.O(tLObject3, ziVar3, str4, kyVar3, booleanValue3, (ky) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                yy sendMessagesHelper4 = this.b.getSendMessagesHelper();
                                p8 p8Var5 = p8Var;
                                Object[] objArr12 = p8Var5.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                zi ziVar4 = (zi) objArr12[1];
                                String str5 = (String) objArr12[2];
                                ky kyVar4 = (ky) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = p8Var5.b;
                                sendMessagesHelper4.O(tLObject4, ziVar4, str5, kyVar4, booleanValue4, (ky) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia3;
            if (!z10 || !Arrays.equals(tL_inputMediaDocument5.id.file_reference, bArr)) {
                tL_inputMediaDocument5.id.file_reference = bArr;
                g0.h3(new Runnable(this) { // from class: org.telegram.messenger.m8
                    public final /* synthetic */ r8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                yy sendMessagesHelper = this.b.getSendMessagesHelper();
                                p8 p8Var2 = p8Var;
                                Object[] objArr6 = p8Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                zi ziVar = (zi) objArr6[1];
                                String str2 = (String) objArr6[2];
                                ky kyVar = (ky) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = p8Var2.b;
                                sendMessagesHelper.O(tLObject, ziVar, str2, kyVar, booleanValue, (ky) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                                p8 p8Var3 = p8Var;
                                Object[] objArr8 = p8Var3.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                zi ziVar2 = (zi) objArr8[1];
                                String str3 = (String) objArr8[2];
                                ky kyVar2 = (ky) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = p8Var3.b;
                                sendMessagesHelper2.O(tLObject2, ziVar2, str3, kyVar2, booleanValue2, (ky) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                yy sendMessagesHelper3 = this.b.getSendMessagesHelper();
                                p8 p8Var4 = p8Var;
                                Object[] objArr10 = p8Var4.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                zi ziVar3 = (zi) objArr10[1];
                                String str4 = (String) objArr10[2];
                                ky kyVar3 = (ky) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = p8Var4.b;
                                sendMessagesHelper3.O(tLObject3, ziVar3, str4, kyVar3, booleanValue3, (ky) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                yy sendMessagesHelper4 = this.b.getSendMessagesHelper();
                                p8 p8Var5 = p8Var;
                                Object[] objArr12 = p8Var5.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                zi ziVar4 = (zi) objArr12[1];
                                String str5 = (String) objArr12[2];
                                ky kyVar4 = (ky) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = p8Var5.b;
                                sendMessagesHelper4.O(tLObject4, ziVar4, str5, kyVar4, booleanValue4, (ky) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
        } else if (obj instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_editMessage) obj).media;
            if (!(inputMedia4 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    if (!z10 || !Arrays.equals(tL_inputMediaPhoto8.id.file_reference, bArr)) {
                        tL_inputMediaPhoto8.id.file_reference = bArr;
                    }
                }
                g0.h3(new Runnable(this) { // from class: org.telegram.messenger.m8
                    public final /* synthetic */ r8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                yy sendMessagesHelper = this.b.getSendMessagesHelper();
                                p8 p8Var2 = p8Var;
                                Object[] objArr6 = p8Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                zi ziVar = (zi) objArr6[1];
                                String str2 = (String) objArr6[2];
                                ky kyVar = (ky) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = p8Var2.b;
                                sendMessagesHelper.O(tLObject, ziVar, str2, kyVar, booleanValue, (ky) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                                p8 p8Var3 = p8Var;
                                Object[] objArr8 = p8Var3.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                zi ziVar2 = (zi) objArr8[1];
                                String str3 = (String) objArr8[2];
                                ky kyVar2 = (ky) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = p8Var3.b;
                                sendMessagesHelper2.O(tLObject2, ziVar2, str3, kyVar2, booleanValue2, (ky) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                yy sendMessagesHelper3 = this.b.getSendMessagesHelper();
                                p8 p8Var4 = p8Var;
                                Object[] objArr10 = p8Var4.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                zi ziVar3 = (zi) objArr10[1];
                                String str4 = (String) objArr10[2];
                                ky kyVar3 = (ky) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = p8Var4.b;
                                sendMessagesHelper3.O(tLObject3, ziVar3, str4, kyVar3, booleanValue3, (ky) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                yy sendMessagesHelper4 = this.b.getSendMessagesHelper();
                                p8 p8Var5 = p8Var;
                                Object[] objArr12 = p8Var5.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                zi ziVar4 = (zi) objArr12[1];
                                String str5 = (String) objArr12[2];
                                ky kyVar4 = (ky) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = p8Var5.b;
                                sendMessagesHelper4.O(tLObject4, ziVar4, str5, kyVar4, booleanValue4, (ky) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia4;
            if (!z10 || !Arrays.equals(tL_inputMediaDocument6.id.file_reference, bArr)) {
                tL_inputMediaDocument6.id.file_reference = bArr;
                g0.h3(new Runnable(this) { // from class: org.telegram.messenger.m8
                    public final /* synthetic */ r8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                yy sendMessagesHelper = this.b.getSendMessagesHelper();
                                p8 p8Var2 = p8Var;
                                Object[] objArr6 = p8Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                zi ziVar = (zi) objArr6[1];
                                String str2 = (String) objArr6[2];
                                ky kyVar = (ky) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = p8Var2.b;
                                sendMessagesHelper.O(tLObject, ziVar, str2, kyVar, booleanValue, (ky) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                                p8 p8Var3 = p8Var;
                                Object[] objArr8 = p8Var3.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                zi ziVar2 = (zi) objArr8[1];
                                String str3 = (String) objArr8[2];
                                ky kyVar2 = (ky) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = p8Var3.b;
                                sendMessagesHelper2.O(tLObject2, ziVar2, str3, kyVar2, booleanValue2, (ky) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                yy sendMessagesHelper3 = this.b.getSendMessagesHelper();
                                p8 p8Var4 = p8Var;
                                Object[] objArr10 = p8Var4.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                zi ziVar3 = (zi) objArr10[1];
                                String str4 = (String) objArr10[2];
                                ky kyVar3 = (ky) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = p8Var4.b;
                                sendMessagesHelper3.O(tLObject3, ziVar3, str4, kyVar3, booleanValue3, (ky) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                yy sendMessagesHelper4 = this.b.getSendMessagesHelper();
                                p8 p8Var5 = p8Var;
                                Object[] objArr12 = p8Var5.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                zi ziVar4 = (zi) objArr12[1];
                                String str5 = (String) objArr12[2];
                                ky kyVar4 = (ky) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = p8Var5.b;
                                sendMessagesHelper4.O(tLObject4, ziVar4, str5, kyVar4, booleanValue4, (ky) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
        } else {
            boolean z16 = obj instanceof TLRPC.InputPhoto;
            if (z16 || (obj instanceof TLRPC.InputDocument)) {
                if (z16) {
                    TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj;
                    if (!z10 || !Arrays.equals(inputPhoto.file_reference, bArr)) {
                        inputPhoto.file_reference = bArr;
                        objArr = p8Var.b;
                        if (objArr.length > 1) {
                            Object obj6 = objArr[1];
                            if (obj6 instanceof Runnable) {
                                g0.h3((Runnable) obj6);
                            }
                        }
                    }
                } else {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj;
                    if (!z10 || !Arrays.equals(inputDocument.file_reference, bArr)) {
                        inputDocument.file_reference = bArr;
                        objArr = p8Var.b;
                        if (objArr.length > 1) {
                        }
                    }
                }
                return true;
            }
            if (obj instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_addPollAnswer) obj).answer.input_media;
                if (!(inputMedia5 instanceof TLRPC.TL_inputMediaDocument)) {
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto9 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                        if (!z10 || !Arrays.equals(tL_inputMediaPhoto9.id.file_reference, bArr)) {
                            tL_inputMediaPhoto9.id.file_reference = bArr;
                        }
                    }
                    g0.h3(new Runnable(this) { // from class: org.telegram.messenger.m8
                        public final /* synthetic */ r8 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    yy sendMessagesHelper = this.b.getSendMessagesHelper();
                                    p8 p8Var2 = p8Var;
                                    Object[] objArr6 = p8Var2.b;
                                    TLObject tLObject = (TLObject) objArr6[0];
                                    zi ziVar = (zi) objArr6[1];
                                    String str2 = (String) objArr6[2];
                                    ky kyVar = (ky) objArr6[3];
                                    boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                    Object[] objArr7 = p8Var2.b;
                                    sendMessagesHelper.O(tLObject, ziVar, str2, kyVar, booleanValue, (ky) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                    break;
                                case 1:
                                    yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                                    p8 p8Var3 = p8Var;
                                    Object[] objArr8 = p8Var3.b;
                                    TLObject tLObject2 = (TLObject) objArr8[0];
                                    zi ziVar2 = (zi) objArr8[1];
                                    String str3 = (String) objArr8[2];
                                    ky kyVar2 = (ky) objArr8[3];
                                    boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                    Object[] objArr9 = p8Var3.b;
                                    sendMessagesHelper2.O(tLObject2, ziVar2, str3, kyVar2, booleanValue2, (ky) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                    break;
                                case 2:
                                    yy sendMessagesHelper3 = this.b.getSendMessagesHelper();
                                    p8 p8Var4 = p8Var;
                                    Object[] objArr10 = p8Var4.b;
                                    TLObject tLObject3 = (TLObject) objArr10[0];
                                    zi ziVar3 = (zi) objArr10[1];
                                    String str4 = (String) objArr10[2];
                                    ky kyVar3 = (ky) objArr10[3];
                                    boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                    Object[] objArr11 = p8Var4.b;
                                    sendMessagesHelper3.O(tLObject3, ziVar3, str4, kyVar3, booleanValue3, (ky) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                    break;
                                default:
                                    yy sendMessagesHelper4 = this.b.getSendMessagesHelper();
                                    p8 p8Var5 = p8Var;
                                    Object[] objArr12 = p8Var5.b;
                                    TLObject tLObject4 = (TLObject) objArr12[0];
                                    zi ziVar4 = (zi) objArr12[1];
                                    String str5 = (String) objArr12[2];
                                    ky kyVar4 = (ky) objArr12[3];
                                    boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                    Object[] objArr13 = p8Var5.b;
                                    sendMessagesHelper4.O(tLObject4, ziVar4, str5, kyVar4, booleanValue4, (ky) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                    break;
                            }
                        }
                    });
                    return true;
                }
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                if (!z10 || !Arrays.equals(tL_inputMediaDocument7.id.file_reference, bArr)) {
                    tL_inputMediaDocument7.id.file_reference = bArr;
                    g0.h3(new Runnable(this) { // from class: org.telegram.messenger.m8
                        public final /* synthetic */ r8 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    yy sendMessagesHelper = this.b.getSendMessagesHelper();
                                    p8 p8Var2 = p8Var;
                                    Object[] objArr6 = p8Var2.b;
                                    TLObject tLObject = (TLObject) objArr6[0];
                                    zi ziVar = (zi) objArr6[1];
                                    String str2 = (String) objArr6[2];
                                    ky kyVar = (ky) objArr6[3];
                                    boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                    Object[] objArr7 = p8Var2.b;
                                    sendMessagesHelper.O(tLObject, ziVar, str2, kyVar, booleanValue, (ky) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                    break;
                                case 1:
                                    yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                                    p8 p8Var3 = p8Var;
                                    Object[] objArr8 = p8Var3.b;
                                    TLObject tLObject2 = (TLObject) objArr8[0];
                                    zi ziVar2 = (zi) objArr8[1];
                                    String str3 = (String) objArr8[2];
                                    ky kyVar2 = (ky) objArr8[3];
                                    boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                    Object[] objArr9 = p8Var3.b;
                                    sendMessagesHelper2.O(tLObject2, ziVar2, str3, kyVar2, booleanValue2, (ky) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                    break;
                                case 2:
                                    yy sendMessagesHelper3 = this.b.getSendMessagesHelper();
                                    p8 p8Var4 = p8Var;
                                    Object[] objArr10 = p8Var4.b;
                                    TLObject tLObject3 = (TLObject) objArr10[0];
                                    zi ziVar3 = (zi) objArr10[1];
                                    String str4 = (String) objArr10[2];
                                    ky kyVar3 = (ky) objArr10[3];
                                    boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                    Object[] objArr11 = p8Var4.b;
                                    sendMessagesHelper3.O(tLObject3, ziVar3, str4, kyVar3, booleanValue3, (ky) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                    break;
                                default:
                                    yy sendMessagesHelper4 = this.b.getSendMessagesHelper();
                                    p8 p8Var5 = p8Var;
                                    Object[] objArr12 = p8Var5.b;
                                    TLObject tLObject4 = (TLObject) objArr12[0];
                                    zi ziVar4 = (zi) objArr12[1];
                                    String str5 = (String) objArr12[2];
                                    ky kyVar4 = (ky) objArr12[3];
                                    boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                    Object[] objArr13 = p8Var5.b;
                                    sendMessagesHelper4.O(tLObject4, ziVar4, str5, kyVar4, booleanValue4, (ky) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                    break;
                            }
                        }
                    });
                    return true;
                }
            } else {
                int i16 = 9;
                if (obj instanceof TLRPC.TL_messages_saveGif) {
                    TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                    if (!z10 || !Arrays.equals(tL_messages_saveGif.id.file_reference, bArr)) {
                        tL_messages_saveGif.id.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_messages_saveGif, new ei.u5(i16));
                        return true;
                    }
                } else if (obj instanceof TLRPC.TL_messages_saveRecentSticker) {
                    TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                    if (!z10 || !Arrays.equals(tL_messages_saveRecentSticker.id.file_reference, bArr)) {
                        tL_messages_saveRecentSticker.id.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new ei.u5(i16));
                        return true;
                    }
                } else if (obj instanceof TLRPC.TL_stickers_addStickerToSet) {
                    TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                    if (!z10 || !Arrays.equals(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                        tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_stickers_addStickerToSet, new ei.u5(i16));
                        return true;
                    }
                } else if (obj instanceof TLRPC.TL_messages_faveSticker) {
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                    if (!z10 || !Arrays.equals(tL_messages_faveSticker.id.file_reference, bArr)) {
                        tL_messages_faveSticker.id.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_messages_faveSticker, new ei.u5(i16));
                        return true;
                    }
                } else {
                    if (!(obj instanceof TLRPC.TL_messages_getAttachedStickers)) {
                        Object obj7 = objArr2[1];
                        if (obj7 instanceof i7) {
                            i7 i7Var = (i7) obj7;
                            if (inputFileLocation != null) {
                                if (!z10 || !Arrays.equals(i7Var.V.file_reference, inputFileLocation.file_reference)) {
                                    str = r2.a ? Utilities.f(i7Var.V.file_reference) : null;
                                    i7Var.V = inputFileLocation;
                                    if (r2.a) {
                                        r8 = Utilities.f(inputFileLocation.file_reference);
                                    }
                                    i7Var.A0 = false;
                                    if (r2.a) {
                                        a8.b("debug_loading: " + i7Var.L0.getName() + " " + str + " " + r8 + " reference updated resume download");
                                    }
                                    i7Var.s(-1);
                                    return true;
                                }
                            } else if (!z10 || !Arrays.equals(p8Var.a.file_reference, bArr)) {
                                String f10 = r2.a ? Utilities.f(i7Var.V.file_reference) : null;
                                TLRPC.InputFileLocation inputFileLocation2 = i7Var.V;
                                p8Var.a.file_reference = bArr;
                                inputFileLocation2.file_reference = bArr;
                                r8 = r2.a ? Utilities.f(bArr) : null;
                                str = f10;
                                i7Var.A0 = false;
                                if (r2.a) {
                                }
                                i7Var.s(-1);
                                return true;
                            }
                        }
                        return true;
                    }
                    TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                    TLRPC.InputStickeredMedia inputStickeredMedia = tL_messages_getAttachedStickers.media;
                    if (!(inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument)) {
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                            if (!z10 || !Arrays.equals(tL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                                tL_inputStickeredMediaPhoto.id.file_reference = bArr;
                            }
                        }
                        getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) p8Var.b[1]);
                        return true;
                    }
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                    if (!z10 || !Arrays.equals(tL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                        tL_inputStickeredMediaDocument.id.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) p8Var.b[1]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Object[] objArr, Object obj) {
        Object obj2;
        String o10;
        int i3;
        String str;
        String str2;
        String str3;
        o8 b10;
        final String str4;
        String str5;
        String str6;
        final String str7;
        boolean z10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String simpleName;
        if (r2.a) {
            StringBuilder sb2 = new StringBuilder("start loading request reference parent ");
            if (obj instanceof String) {
                simpleName = (String) obj;
            } else if (obj instanceof TL_stories.StoryItem) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                StringBuilder sb3 = new StringBuilder("story(dialogId=");
                sb3.append(storyItem.dialogId);
                sb3.append(" id=");
                simpleName = a1.g.o(storyItem.id, ")", sb3);
            } else if (obj instanceof zi) {
                zi ziVar = (zi) obj;
                simpleName = "message(dialogId=" + zi.B0(ziVar.k) + "messageId" + ziVar.f1() + ")";
            } else {
                simpleName = obj == null ? null : obj.getClass().getSimpleName();
            }
            sb2.append(simpleName);
            sb2.append(" args = ");
            sb2.append(objArr[0]);
            a8.b(sb2.toString());
        }
        Object obj3 = objArr[0];
        if (obj3 instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) obj3;
            ArrayList arrayList = (ArrayList) obj;
            this.d.put(tL_messages_sendMultiMedia, objArr);
            int size = tL_messages_sendMultiMedia.multi_media.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj4 = (TLRPC.TL_inputSingleMedia) tL_messages_sendMultiMedia.multi_media.get(i10);
                Object obj5 = arrayList.get(i10);
                if (obj5 != null) {
                    u(new Object[]{obj4, tL_messages_sendMultiMedia}, obj5);
                }
            }
            return;
        }
        if (obj3 instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj3;
            TLRPC.InputMedia inputMedia = tL_messages_sendMedia.media;
            if ((inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia;
                ArrayList arrayList2 = (ArrayList) obj;
                this.d.put(tL_messages_sendMedia, objArr);
                int size2 = tL_inputMediaPaidMedia.extended_media.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj6 = (TLRPC.InputMedia) tL_inputMediaPaidMedia.extended_media.get(i11);
                    Object obj7 = arrayList2.get(i11);
                    if (obj7 != null) {
                        u(new Object[]{obj6, tL_messages_sendMedia}, obj7);
                    }
                }
                return;
            }
        }
        if (obj3 instanceof TL_ephemeral.TL_sendMessage) {
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj3;
            TLRPC.InputMedia inputMedia2 = tL_sendMessage.media;
            if ((inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                ArrayList arrayList3 = (ArrayList) obj;
                this.d.put(tL_sendMessage, objArr);
                int size3 = tL_inputMediaPaidMedia2.extended_media.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj8 = (TLRPC.InputMedia) tL_inputMediaPaidMedia2.extended_media.get(i12);
                    Object obj9 = arrayList3.get(i12);
                    if (obj9 != null) {
                        u(new Object[]{obj8, tL_sendMessage}, obj9);
                    }
                }
                return;
            }
        }
        Pair p10 = p(objArr, obj);
        if (p10 == null) {
            v(objArr);
            return;
        }
        TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) p10.first;
        String str8 = (String) p10.second;
        if (obj instanceof zi) {
            zi ziVar2 = (zi) obj;
            if (ziVar2.M1() < 0 && (message = ziVar2.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                obj2 = webPage;
                o10 = o(obj2);
                if (o10 != null) {
                    v(objArr);
                    return;
                }
                p8 p8Var = new p8();
                p8Var.b = objArr;
                p8Var.a = inputFileLocation;
                p8Var.c = str8;
                ArrayList arrayList4 = (ArrayList) this.a.get(str8);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    this.a.put(str8, arrayList4);
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                arrayList4.add(p8Var);
                ArrayList arrayList5 = (ArrayList) this.b.get(o10);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    this.b.put(o10, arrayList5);
                    i3++;
                }
                arrayList5.add(p8Var);
                if (i3 != 2) {
                    return;
                }
                boolean z11 = obj2 instanceof String;
                if (z11) {
                    String str9 = (String) obj2;
                    if ("wallpaper".equals(str9)) {
                        str = "wallpaper";
                    } else if (str9.startsWith("gif")) {
                        str = "gif";
                    } else if ("recent".equals(str9)) {
                        str = "recent";
                    } else if ("fav".equals(str9)) {
                        str = "fav";
                    } else if ("update".equals(str9)) {
                        str = "update";
                    }
                    HashMap hashMap = this.c;
                    if (Math.abs(SystemClock.elapsedRealtime() - this.e) >= 600000) {
                        str2 = o10;
                        str3 = str8;
                    } else {
                        this.e = SystemClock.elapsedRealtime();
                        ArrayList arrayList6 = null;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            String str10 = o10;
                            String str11 = str8;
                            if (Math.abs(System.currentTimeMillis() - ((o8) entry.getValue()).b) >= 60000) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add((String) entry.getKey());
                            }
                            o10 = str10;
                            str8 = str11;
                        }
                        str2 = o10;
                        str3 = str8;
                        if (arrayList6 != null) {
                            int size4 = arrayList6.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                hashMap.remove(arrayList6.get(i13));
                            }
                        }
                    }
                    b10 = b(str);
                    if (b10 == null) {
                        TLObject tLObject = b10.a;
                        str6 = "wallpaper";
                        str5 = "gif";
                        str7 = str3;
                        str4 = str2;
                        if (s(str7, str4, tLObject, null, false, true)) {
                            return;
                        } else {
                            this.c.remove(str7);
                        }
                    } else {
                        str4 = str2;
                        str5 = "gif";
                        str6 = "wallpaper";
                        str7 = str3;
                        o8 b11 = b(str4);
                        if (b11 != null) {
                            if (s(str7, str4, b11.a, null, false, true)) {
                                return;
                            } else {
                                this.c.remove(str4);
                            }
                        }
                    }
                    if (!(obj2 instanceof ei.j6)) {
                        ei.j6 j6Var = (ei.j6) obj2;
                        ei.k6 k6Var = j6Var.a;
                        if (k6Var == null) {
                            v(objArr);
                            return;
                        }
                        ai.k3 k3Var = new ai.k3(k6Var, j6Var, new d3(this, str7, str4, 2), 28);
                        if (k6Var.F != 0) {
                            ConnectionsManager.getInstance(k6Var.c).cancelRequest(k6Var.F, true);
                            z10 = false;
                            k6Var.F = 0;
                        } else {
                            z10 = false;
                        }
                        k6Var.C = z10;
                        k6Var.D = z10;
                        k6Var.H(k3Var);
                        return;
                    }
                    if (obj2 instanceof TL_stories.StoryItem) {
                        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                        tL_stories_getStoriesByID.peer = getMessagesController().j1(storyItem2.dialogId);
                        tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem2.id));
                        final int i14 = 7;
                        getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i14) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof TLRPC.TL_help_premiumPromo) {
                        final int i15 = 16;
                        getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i15) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof TLRPC.TL_availableReaction) {
                        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
                        tL_messages_getAvailableReactions.hash = 0;
                        final int i16 = 17;
                        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i16) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof TL_bots.BotInfo) {
                        TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                        tL_users_getFullUser.id = getMessagesController().o1(((TL_bots.BotInfo) obj2).user_id);
                        final int i17 = 18;
                        getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof TLRPC.TL_attachMenuBot) {
                        TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                        tL_messages_getAttachMenuBot.bot = getMessagesController().o1(((TLRPC.TL_attachMenuBot) obj2).bot_id);
                        final int i18 = 19;
                        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i18) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof zi) {
                        zi ziVar3 = (zi) obj2;
                        long v02 = zi.v0(ziVar3.k);
                        TLRPC.InputPeer j12 = getMessagesController().j1(zi.B0(ziVar3.k));
                        if (ziVar3.p1) {
                            TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                            tL_messages_getScheduledMessages.peer = getMessagesController().j1(zi.B0(ziVar3.k));
                            tL_messages_getScheduledMessages.id.add(Integer.valueOf(ziVar3.M1()));
                            final int i19 = 20;
                            getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i19) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if (zi.c4(ziVar3.k)) {
                            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                            tL_messages_getQuickReplyMessages.shortcut_id = zi.J1(ziVar3.k);
                            tL_messages_getQuickReplyMessages.flags |= 1;
                            tL_messages_getQuickReplyMessages.id.add(Integer.valueOf(ziVar3.M1()));
                            final int i20 = 21;
                            getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i20) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        TLRPC.Message message2 = ziVar3.k;
                        if (message2 != null && message2.rich_message != null) {
                            TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                            getrichmessage.peer = j12;
                            getrichmessage.id = ziVar3.M1();
                            final int i21 = 22;
                            getConnectionsManager().sendRequest(getrichmessage, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i21) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if (v02 == 0) {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.id.add(Integer.valueOf(ziVar3.M1()));
                            final int i22 = 0;
                            getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i22) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = getMessagesController().h1(v02);
                        tL_channels_getMessages.id.add(Integer.valueOf(ziVar3.M1()));
                        final int i23 = 23;
                        getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i23) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof TLRPC.TL_wallPaper) {
                        TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                        TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                        tL_inputWallPaper.id = tL_wallPaper.id;
                        tL_inputWallPaper.access_hash = tL_wallPaper.access_hash;
                        getwallpaper.wallpaper = tL_inputWallPaper;
                        final int i24 = 1;
                        getConnectionsManager().sendRequest(getwallpaper, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i24) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof TLRPC.TL_theme) {
                        TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj2;
                        TL_account.getTheme gettheme = new TL_account.getTheme();
                        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                        tL_inputTheme.id = tL_theme.id;
                        tL_inputTheme.access_hash = tL_theme.access_hash;
                        gettheme.theme = tL_inputTheme;
                        gettheme.format = "android";
                        final int i25 = 2;
                        getConnectionsManager().sendRequest(gettheme, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i25) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    final int i26 = 3;
                    if (obj2 instanceof TLRPC.WebPage) {
                        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                        tL_messages_getWebPage.url = ((TLRPC.WebPage) obj2).url;
                        tL_messages_getWebPage.hash = 0;
                        getConnectionsManager().sendRequest(tL_messages_getWebPage, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i26) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof TLRPC.User) {
                        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                        tL_users_getUsers.id.add(getMessagesController().q1((TLRPC.User) obj2));
                        final int i27 = 4;
                        getConnectionsManager().sendRequest(tL_users_getUsers, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i27) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) obj2;
                        if (chat instanceof TLRPC.TL_chat) {
                            TLRPC.TL_messages_getChats tL_messages_getChats = new TLRPC.TL_messages_getChats();
                            tL_messages_getChats.id.add(Long.valueOf(chat.id));
                            final int i28 = 5;
                            getConnectionsManager().sendRequest(tL_messages_getChats, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i28) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if ((chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_community)) {
                            TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                            tL_channels_getChannels.id.add(hp.i1(chat));
                            final int i29 = 6;
                            getConnectionsManager().sendRequest(tL_channels_getChannels, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i29) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!z11) {
                        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) obj2).set;
                            tL_inputStickerSetID.id = stickerSet.id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            final int i30 = 13;
                            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i30) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if (!(obj2 instanceof TLRPC.StickerSetCovered)) {
                            if (!(obj2 instanceof TLRPC.InputStickerSet)) {
                                v(objArr);
                                return;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet2 = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet2.stickerset = (TLRPC.InputStickerSet) obj2;
                            final int i31 = 15;
                            getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i31) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet3 = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_messages_getStickerSet3.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) obj2).set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        final int i32 = 14;
                        getConnectionsManager().sendRequest(tL_messages_getStickerSet3, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i32) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    String str12 = (String) obj2;
                    if (str6.equals(str12)) {
                        if (this.f.isEmpty()) {
                            final int i33 = 0;
                            getConnectionsManager().sendRequest(new TL_account.getWallPapers(), new RequestDelegate(this) { // from class: org.telegram.messenger.h8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i33) {
                                        case 0:
                                            r8 r8Var = this.b;
                                            r8Var.a(r8Var.f, tLObject2, tL_error);
                                            break;
                                        case 1:
                                            r8 r8Var2 = this.b;
                                            r8Var2.a(r8Var2.h, tLObject2, tL_error);
                                            break;
                                        case 2:
                                            r8 r8Var3 = this.b;
                                            r8Var3.a(r8Var3.n, tLObject2, tL_error);
                                            break;
                                        default:
                                            r8 r8Var4 = this.b;
                                            r8Var4.a(r8Var4.r, tLObject2, tL_error);
                                            break;
                                    }
                                }
                            });
                        }
                        this.f.add(new q8(str7, str4));
                        return;
                    }
                    if (str12.startsWith(str5)) {
                        if (this.h.isEmpty()) {
                            final int i34 = 1;
                            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSavedGifs(), new RequestDelegate(this) { // from class: org.telegram.messenger.h8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i34) {
                                        case 0:
                                            r8 r8Var = this.b;
                                            r8Var.a(r8Var.f, tLObject2, tL_error);
                                            break;
                                        case 1:
                                            r8 r8Var2 = this.b;
                                            r8Var2.a(r8Var2.h, tLObject2, tL_error);
                                            break;
                                        case 2:
                                            r8 r8Var3 = this.b;
                                            r8Var3.a(r8Var3.n, tLObject2, tL_error);
                                            break;
                                        default:
                                            r8 r8Var4 = this.b;
                                            r8Var4.a(r8Var4.r, tLObject2, tL_error);
                                            break;
                                    }
                                }
                            });
                        }
                        this.h.add(new q8(str7, str4));
                        return;
                    }
                    if ("recent".equals(str12)) {
                        if (this.n.isEmpty()) {
                            final int i35 = 2;
                            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getRecentStickers(), new RequestDelegate(this) { // from class: org.telegram.messenger.h8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i35) {
                                        case 0:
                                            r8 r8Var = this.b;
                                            r8Var.a(r8Var.f, tLObject2, tL_error);
                                            break;
                                        case 1:
                                            r8 r8Var2 = this.b;
                                            r8Var2.a(r8Var2.h, tLObject2, tL_error);
                                            break;
                                        case 2:
                                            r8 r8Var3 = this.b;
                                            r8Var3.a(r8Var3.n, tLObject2, tL_error);
                                            break;
                                        default:
                                            r8 r8Var4 = this.b;
                                            r8Var4.a(r8Var4.r, tLObject2, tL_error);
                                            break;
                                    }
                                }
                            });
                        }
                        this.n.add(new q8(str7, str4));
                        return;
                    }
                    if ("fav".equals(str12)) {
                        if (this.r.isEmpty()) {
                            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getFavedStickers(), new RequestDelegate(this) { // from class: org.telegram.messenger.h8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i26) {
                                        case 0:
                                            r8 r8Var = this.b;
                                            r8Var.a(r8Var.f, tLObject2, tL_error);
                                            break;
                                        case 1:
                                            r8 r8Var2 = this.b;
                                            r8Var2.a(r8Var2.h, tLObject2, tL_error);
                                            break;
                                        case 2:
                                            r8 r8Var3 = this.b;
                                            r8Var3.a(r8Var3.n, tLObject2, tL_error);
                                            break;
                                        default:
                                            r8 r8Var4 = this.b;
                                            r8Var4.a(r8Var4.r, tLObject2, tL_error);
                                            break;
                                    }
                                }
                            });
                        }
                        this.r.add(new q8(str7, str4));
                        return;
                    }
                    if ("update".equals(str12)) {
                        TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                        try {
                            tL_help_getAppUpdate.source = t0.b.getPackageManager().getInstallerPackageName(t0.b.getPackageName());
                        } catch (Exception unused) {
                        }
                        if (tL_help_getAppUpdate.source == null) {
                            tL_help_getAppUpdate.source = "";
                        }
                        final int i36 = 8;
                        getConnectionsManager().sendRequest(tL_help_getAppUpdate, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i36) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (!str12.startsWith("avatar_")) {
                        if (!str12.startsWith("sent_")) {
                            v(objArr);
                            return;
                        }
                        String[] split = str12.split("_");
                        if (split.length < 3) {
                            v(objArr);
                            return;
                        }
                        Long A = Utilities.A(split[1]);
                        if (A.longValue() == 0) {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.id.add(Utilities.z(split[2]));
                            final int i37 = 12;
                            getConnectionsManager().sendRequest(tL_messages_getMessages2, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                                public final /* synthetic */ r8 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i37) {
                                        case 0:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            r8 r8Var = this.b;
                                            r8Var.getClass();
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                                r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        TLRPC.TL_channels_getMessages tL_channels_getMessages2 = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages2.channel = hp.i1(getMessagesController().M0(A));
                        tL_channels_getMessages2.id.add(Utilities.z(split[2]));
                        final int i38 = 11;
                        getConnectionsManager().sendRequest(tL_channels_getMessages2, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i38) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    Long A2 = Utilities.A(str12);
                    long longValue = A2.longValue();
                    if (longValue > 0) {
                        TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                        tL_photos_getUserPhotos.limit = 80;
                        tL_photos_getUserPhotos.offset = 0;
                        tL_photos_getUserPhotos.max_id = 0L;
                        hp messagesController = getMessagesController();
                        tL_photos_getUserPhotos.user_id = messagesController.q1(messagesController.a2(A2));
                        final int i39 = 9;
                        getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                            public final /* synthetic */ r8 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (i39) {
                                    case 0:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        r8 r8Var = this.b;
                                        r8Var.getClass();
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                            r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
                    tL_messages_search.limit = 80;
                    tL_messages_search.offset_id = 0;
                    tL_messages_search.q = "";
                    tL_messages_search.peer = getMessagesController().j1(longValue);
                    final int i40 = 10;
                    getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) { // from class: org.telegram.messenger.g8
                        public final /* synthetic */ r8 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                            switch (i40) {
                                case 0:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 1:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 2:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 3:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 4:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 5:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 6:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 7:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 8:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 9:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 10:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 11:
                                    this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                    break;
                                case 12:
                                    this.b.s(str7, str4, tLObject2, tL_error, false, false);
                                    break;
                                case 13:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 14:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 15:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 16:
                                    r8 r8Var = this.b;
                                    r8Var.getClass();
                                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                    if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                                        r8Var.getMediaDataController().w1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                    }
                                    r8Var.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 17:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 18:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 19:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 20:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 21:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                case 22:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                                default:
                                    this.b.s(str7, str4, tLObject2, tL_error, true, false);
                                    break;
                            }
                        }
                    });
                    return;
                }
                str = str8;
                HashMap hashMap2 = this.c;
                if (Math.abs(SystemClock.elapsedRealtime() - this.e) >= 600000) {
                }
                b10 = b(str);
                if (b10 == null) {
                }
                if (!(obj2 instanceof ei.j6)) {
                }
            }
        }
        obj2 = obj;
        o10 = o(obj2);
        if (o10 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaPoll) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaPoll) == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(final Object[] objArr) {
        boolean z10;
        Object obj = objArr[0];
        boolean z11 = obj instanceof TLRPC.TL_inputSingleMedia;
        HashMap hashMap = this.d;
        if (z11) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) objArr[1];
            Object[] objArr2 = (Object[]) hashMap.get(tL_messages_sendMultiMedia);
            if (objArr2 != null) {
                hashMap.remove(tL_messages_sendMultiMedia);
                g0.h3(new j8(this, tL_messages_sendMultiMedia, objArr2, 1));
                return;
            }
            return;
        }
        boolean z12 = obj instanceof TLRPC.TL_inputMediaDocument;
        if (z12 || (obj instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj2 = objArr[1];
            if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj2;
                Object[] objArr3 = (Object[]) hashMap.get(tL_messages_sendMedia);
                if (objArr3 != null) {
                    hashMap.remove(tL_messages_sendMedia);
                    g0.h3(new k8(this, tL_messages_sendMedia, objArr3, 1));
                    return;
                }
                return;
            }
        }
        if (z12 || (obj instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj3 = objArr[1];
            if (obj3 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj3;
                Object[] objArr4 = (Object[]) hashMap.get(tL_sendMessage);
                if (objArr4 != null) {
                    hashMap.remove(tL_sendMessage);
                    g0.h3(new l8(this, tL_sendMessage, objArr4, 1));
                    return;
                }
                return;
            }
        }
        if (obj instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) obj).media;
            if (!(inputMedia instanceof TLRPC.TL_inputMediaPaidMedia)) {
            }
        }
        boolean z13 = obj instanceof TLRPC.TL_messages_editMessage;
        if (!z13 && !((z10 = obj instanceof TLRPC.TL_messages_addPollAnswer))) {
            if (obj instanceof TL_ephemeral.TL_sendMessage) {
                TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) obj).media;
                if (!(inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia)) {
                }
            }
            if (!z13 && !z10) {
                if ((obj instanceof TLRPC.TL_messages_saveGif) || (obj instanceof TLRPC.TL_messages_saveRecentSticker) || (obj instanceof TLRPC.TL_stickers_addStickerToSet) || (obj instanceof TLRPC.TL_messages_faveSticker)) {
                    return;
                }
                if (obj instanceof TLRPC.TL_messages_getAttachedStickers) {
                    getConnectionsManager().sendRequest((TLRPC.TL_messages_getAttachedStickers) obj, (RequestDelegate) objArr[1]);
                    return;
                }
                Object obj4 = objArr[1];
                if (obj4 instanceof i7) {
                    i7 i7Var = (i7) obj4;
                    i7Var.A0 = false;
                    a8.d("debug_loading: " + i7Var.L0.getName() + " reference can't update: fail operation ");
                    i7Var.j(0, false);
                    return;
                }
                return;
            }
            final int i3 = 1;
            g0.h3(new Runnable(this) { // from class: org.telegram.messenger.n8
                public final /* synthetic */ r8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            yy sendMessagesHelper = this.b.getSendMessagesHelper();
                            Object[] objArr5 = objArr;
                            sendMessagesHelper.O((TLObject) objArr5[0], (zi) objArr5[1], (String) objArr5[2], (ky) objArr5[3], ((Boolean) objArr5[4]).booleanValue(), (ky) objArr5[5], null, null, ((Boolean) objArr5[6]).booleanValue());
                            break;
                        default:
                            yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                            Object[] objArr6 = objArr;
                            sendMessagesHelper2.O((TLObject) objArr6[0], (zi) objArr6[1], (String) objArr6[2], (ky) objArr6[3], ((Boolean) objArr6[4]).booleanValue(), (ky) objArr6[5], null, null, ((Boolean) objArr6[6]).booleanValue());
                            break;
                    }
                }
            });
            return;
        }
        final int i10 = 0;
        g0.h3(new Runnable(this) { // from class: org.telegram.messenger.n8
            public final /* synthetic */ r8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        yy sendMessagesHelper = this.b.getSendMessagesHelper();
                        Object[] objArr5 = objArr;
                        sendMessagesHelper.O((TLObject) objArr5[0], (zi) objArr5[1], (String) objArr5[2], (ky) objArr5[3], ((Boolean) objArr5[4]).booleanValue(), (ky) objArr5[5], null, null, ((Boolean) objArr5[6]).booleanValue());
                        break;
                    default:
                        yy sendMessagesHelper2 = this.b.getSendMessagesHelper();
                        Object[] objArr6 = objArr;
                        sendMessagesHelper2.O((TLObject) objArr6[0], (zi) objArr6[1], (String) objArr6[2], (ky) objArr6[3], ((Boolean) objArr6[4]).booleanValue(), (ky) objArr6[5], null, null, ((Boolean) objArr6[6]).booleanValue());
                        break;
                }
            }
        });
    }
}

// default package

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
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
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ab4 extends pf0 {
    public static volatile ab4[] s = new ab4[4];
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public long e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;

    public ab4(int i) {
        super(i);
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
                for (int i = 0; i < size; i++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i);
                    byte[] f = (photoSize == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation)) ? null : f(photoSize.location, inputFileLocation, zArr);
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
                    if (f != null) {
                        return f;
                    }
                }
            } else if (document.id == inputFileLocation.id) {
                return document.file_reference;
            }
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    byte[] e = e((TLRPC.Document) arrayList.get(i2), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (e != null) {
                        return e;
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
                for (int i = 0; i < size; i++) {
                    TLRPC.PhotoSize photoSize = photo.sizes.get(i);
                    byte[] f = photoSize != null ? f(photoSize.location, inputFileLocation, zArr) : null;
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
                    if (f != null) {
                        return f;
                    }
                }
            }
        }
        return null;
    }

    public static byte[] i(TLRPC.WebPage webPage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] e = e(webPage.document, null, inputFileLocation, zArr, inputFileLocationArr);
        if (e != null) {
            return e;
        }
        byte[] g = g(webPage.photo, inputFileLocation, zArr, inputFileLocationArr);
        if (g != null) {
            return g;
        }
        if (!webPage.attributes.isEmpty()) {
            int size = webPage.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        byte[] e2 = e(tL_webPageAttributeTheme.documents.get(i2), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (e2 != null) {
                            return e2;
                        }
                    }
                }
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page != null) {
            int size3 = page.documents.size();
            int i3 = 0;
            while (true) {
                TL_iv.Page page2 = webPage.cached_page;
                if (i3 < size3) {
                    byte[] e3 = e(page2.documents.get(i3), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (e3 != null) {
                        return e3;
                    }
                    i3++;
                } else {
                    int size4 = page2.photos.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        byte[] g2 = g(webPage.cached_page.photos.get(i4), inputFileLocation, zArr, inputFileLocationArr);
                        if (g2 != null) {
                            return g2;
                        }
                    }
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
        byte[] j = j(tL_messageMediaPoll.attached_media, inputFileLocation, zArr, inputFileLocationArr);
        if (j == null && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia = pollResults.solution_media) != null) {
            j = j(messageMedia, inputFileLocation, zArr, inputFileLocationArr);
        }
        if (j == null && (arrayList = tL_messageMediaPoll.poll.answers) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i);
                i++;
                j = j(pollAnswer.media, inputFileLocation, zArr, inputFileLocationArr);
                if (j != null) {
                    break;
                }
            }
        }
        return j;
    }

    public static byte[] l(TL_iv.RichMessage richMessage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (i2 < size) {
            TLRPC.Photo photo = arrayList.get(i2);
            i2++;
            bArr = g(photo, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                return bArr;
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        int size2 = arrayList2.size();
        while (i < size2) {
            TLRPC.Document document = arrayList2.get(i);
            i++;
            bArr = e(document, null, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                break;
            }
        }
        return bArr;
    }

    public static ab4 n(int i) {
        ab4 ab4Var;
        ab4 ab4Var2 = s[i];
        if (ab4Var2 != null) {
            return ab4Var2;
        }
        synchronized (ab4.class) {
            ab4Var = s[i];
            if (ab4Var == null) {
                ab4[] ab4VarArr = s;
                ab4 ab4Var3 = new ab4(i);
                ab4VarArr[i] = ab4Var3;
                ab4Var = ab4Var3;
            }
        }
        return ab4Var;
    }

    public static String o(Object obj) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (obj instanceof q1b) {
            q1b q1bVar = (q1b) obj;
            if (q1bVar.a == null) {
                fa4.b("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC.MessageMedia messageMedia = q1bVar.media;
            if (messageMedia.document != null) {
                return "botstory_doc_" + q1bVar.media.document.id;
            }
            if (messageMedia.photo != null) {
                return "botstory_photo_" + q1bVar.media.photo.id;
            }
            return "botstory_" + q1bVar.id;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            if (storyItem.dialogId == 0) {
                fa4.b("failed request reference can't find dialogId");
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
            return ls6.n(((TLRPC.TL_attachMenuBot) obj).bot_id, "attach_menu_bot_");
        }
        if (obj instanceof k27) {
            k27 k27Var = (k27) obj;
            long v0 = k27.v0(k27Var.k);
            if (k27Var.D == 29 && (message = k27Var.k) != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                v0 = cf3.n(peer);
            }
            return "message" + k27Var.L1() + "_" + v0 + "_" + k27Var.r1 + "_" + k27.I1(k27Var.k);
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
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static Pair p(Object[] objArr, Object obj) {
        boolean z;
        Object obj2 = objArr[0];
        if ((obj2 instanceof TLRPC.TL_messages_sendMultiMedia) || (((z = obj2 instanceof TLRPC.TL_messages_sendMedia)) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList))) {
            return null;
        }
        if (z && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        boolean z2 = obj2 instanceof TL_ephemeral.TL_sendMessage;
        if (z2 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if (z2 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if (obj2 instanceof q1b) {
            q1b q1bVar = (q1b) obj2;
            TLRPC.MessageMedia messageMedia = q1bVar.media;
            if (messageMedia.document != null) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation.id = q1bVar.media.document.id;
                return new Pair(tL_inputDocumentFileLocation, "botstory_doc_" + q1bVar.media.document.id);
            }
            if (messageMedia.photo == null) {
                return new Pair(new TLRPC.TL_inputDocumentFileLocation(), "botstory_" + q1bVar.id);
            }
            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
            tL_inputPhotoFileLocation.id = q1bVar.media.photo.id;
            return new Pair(tL_inputPhotoFileLocation, "botstory_photo_" + q1bVar.media.photo.id);
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
            if (z) {
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
            } else if (z2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaDocument) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaDocument) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaDocument) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0078, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaDocument) != false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022a  */
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
                    if (obj6 instanceof l94) {
                        l94 l94Var = (l94) obj6;
                        if (inputFileLocation != null) {
                            if (!Arrays.equals(l94Var.V.file_reference, inputFileLocation.file_reference)) {
                                str = w01.a ? Utilities.f(l94Var.V.file_reference) : null;
                                l94Var.V = inputFileLocation;
                                if (w01.a) {
                                    r1 = Utilities.f(inputFileLocation.file_reference);
                                }
                                if (w01.a) {
                                    fa4.b("debug_loading: from fileref cache updated fileref from " + str + " to " + r1);
                                }
                            }
                        } else if (!Arrays.equals(inputFileLocation2.file_reference, bArr)) {
                            String f = w01.a ? Utilities.f(l94Var.V.file_reference) : null;
                            TLRPC.InputFileLocation inputFileLocation3 = l94Var.V;
                            inputFileLocation2.file_reference = bArr;
                            inputFileLocation3.file_reference = bArr;
                            r1 = w01.a ? Utilities.f(bArr) : null;
                            str = f;
                            if (w01.a) {
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
        int i = 0;
        while (i < size) {
            za4 za4Var = (za4) arrayList.get(i);
            s(za4Var.a, za4Var.b, tLObject, tL_error, i == size + (-1), false);
            i++;
        }
        arrayList.clear();
    }

    public final xa4 b(String str) {
        HashMap hashMap = this.c;
        xa4 xa4Var = (xa4) hashMap.get(str);
        if (xa4Var == null || Math.abs(System.currentTimeMillis() - xa4Var.b) < 60000) {
            return xa4Var;
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
        byte[] f = f(chatPhoto.photo_small, inputFileLocation, zArr);
        if (q(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (f == null) {
            return q(null, chat, true, inputFileLocation, inputFileLocationArr, zArr) ? new byte[0] : f(chat.photo.photo_big, inputFileLocation, zArr);
        }
        return f;
    }

    public final byte[] h(TLRPC.User user, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
            return null;
        }
        byte[] f = f(userProfilePhoto.photo_small, inputFileLocation, zArr);
        if (q(user, null, false, inputFileLocation, inputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (f == null) {
            return q(user, null, true, inputFileLocation, inputFileLocationArr, zArr) ? new byte[0] : f(user.photo.photo_big, inputFileLocation, zArr);
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02de A[LOOP:6: B:179:0x02b0->B:185:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0488 A[EDGE_INSN: B:186:0x0488->B:19:0x0488 BREAK  A[LOOP:6: B:179:0x02b0->B:185:0x02de], SYNTHETIC] */
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
        int i;
        TLRPC.InputFileLocation inputFileLocation2;
        Pair m;
        TLRPC.InputFileLocation inputFileLocation3 = null;
        if ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
            inputFileLocationArr = new TLRPC.InputFileLocation[1];
            zArr = new boolean[1];
        } else {
            inputFileLocationArr = null;
            zArr = null;
        }
        if (str == null || (m = m(inputFileLocation, null, tLObject, objArr)) == null) {
            bArr = null;
        } else {
            bArr = (byte[]) m.first;
            Object obj = m.second;
            if (obj != null && inputFileLocationArr != null) {
                inputFileLocationArr[0] = (TLRPC.InputFileLocation) obj;
            }
        }
        if (tLObject instanceof q1b) {
            TLRPC.MessageMedia messageMedia3 = ((q1b) tLObject).media;
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
                boolean z = w01.a;
                fa4.b("empty messages, file ref not found");
            } else {
                int size = messages_messages.messages.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Message message = messages_messages.messages.get(i2);
                    TLRPC.MessageMedia messageMedia4 = message.media;
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaPaidMedia) {
                        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia4;
                        for (0; i < tL_messageMediaPaidMedia.extended_media.size(); i + 1) {
                            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i);
                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                bArr = j(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, inputFileLocation, zArr, inputFileLocationArr);
                            }
                            i = bArr == null ? i + 1 : 0;
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
                    getMessagesStorage().o1(messages_messages.messages.get(0), messages_messages.users, messages_messages.chats, true);
                    boolean z2 = w01.a;
                    fa4.b("file ref not found in messages, replacing message");
                }
            }
        } else if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_help_premiumPromo) tLObject).videos;
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                TLRPC.Document document3 = arrayList.get(i3);
                i3++;
                bArr = e(document3, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
            getMediaDataController().y1(tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), tL_messages_availableReactions.reactions, false);
            ArrayList<TLRPC.TL_availableReaction> arrayList2 = tL_messages_availableReactions.reactions;
            int size3 = arrayList2.size();
            int i4 = 0;
            while (i4 < size3) {
                TLRPC.TL_availableReaction tL_availableReaction = arrayList2.get(i4);
                i4++;
                TLRPC.TL_availableReaction tL_availableReaction2 = tL_availableReaction;
                byte[] e = e(tL_availableReaction2.static_icon, null, inputFileLocation, zArr, inputFileLocationArr);
                if (e != null || (e = e(tL_availableReaction2.appear_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (e = e(tL_availableReaction2.select_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (e = e(tL_availableReaction2.activate_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (e = e(tL_availableReaction2.effect_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (e = e(tL_availableReaction2.around_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null) {
                    bArr = e;
                    break;
                }
                bArr = e(tL_availableReaction2.center_icon, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            getMessagesController().a4(tL_users_userFull.users, false);
            getMessagesController().U3(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            TL_bots.BotInfo botInfo = userFull.bot_info;
            if (botInfo != null) {
                getMessagesStorage().g2(userFull, true);
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
            int i5 = 0;
            while (i5 < size4) {
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList3.get(i5);
                i5++;
                bArr = e(tL_attachMenuBotIcon.icon, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_help_appUpdate) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject;
            try {
                gba.g1 = tL_help_appUpdate;
                gba.x();
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            try {
                kk7.e().k(kk7.S4, new Object[0]);
            } catch (Exception e3) {
                fa4.g(e3, true);
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
            } catch (Exception e4) {
                fa4.g(e4, true);
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
            getMessagesController().U3(tL_messages_webPage.chats, false);
            getMessagesController().a4(tL_messages_webPage.users, false);
            bArr = i(tL_messages_webPage.webpage, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof TLRPC.WebPage) {
            bArr = i((TLRPC.WebPage) tLObject, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            int size5 = tL_wallPapers.wallpapers.size();
            for (int i6 = 0; i6 < size5; i6++) {
                bArr = e(tL_wallPapers.wallpapers.get(i6).document, null, inputFileLocation, zArr, inputFileLocationArr);
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
                for (int i7 = 0; i7 < size6; i7++) {
                    Object obj2 = vector.objects.get(i7);
                    if (obj2 instanceof TLRPC.TL_transcriptionModel) {
                        d = e(((TLRPC.TL_transcriptionModel) obj2).document, null, inputFileLocation, zArr, inputFileLocationArr);
                    } else if (!(obj2 instanceof TLRPC.User)) {
                        if (obj2 instanceof TLRPC.Chat) {
                            d = d((TLRPC.Chat) obj2, inputFileLocation, zArr, inputFileLocationArr);
                        }
                        if (bArr == null) {
                            break;
                        }
                    } else {
                        d = h((TLRPC.User) obj2, inputFileLocation, zArr, inputFileLocationArr);
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
                for (int i8 = 0; i8 < size7; i8++) {
                    bArr = d(tL_messages_chats.chats.get(i8), inputFileLocation, zArr, inputFileLocationArr);
                    if (bArr != null) {
                        break;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
            TLRPC.TL_messages_savedGifs tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject;
            int size8 = tL_messages_savedGifs.gifs.size();
            for (int i9 = 0; i9 < size8; i9++) {
                bArr = e(tL_messages_savedGifs.gifs.get(i9), null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            if (bArr == null) {
                int size9 = tL_messages_stickerSet.documents.size();
                for (int i10 = 0; i10 < size9; i10++) {
                    bArr = e(tL_messages_stickerSet.documents.get(i10), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (bArr != null) {
                        break;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
            TLRPC.TL_messages_recentStickers tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject;
            int size10 = tL_messages_recentStickers.stickers.size();
            for (int i11 = 0; i11 < size10; i11++) {
                bArr = e(tL_messages_recentStickers.stickers.get(i11), null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
            TLRPC.TL_messages_favedStickers tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject;
            int size11 = tL_messages_favedStickers.stickers.size();
            for (int i12 = 0; i12 < size11; i12++) {
                bArr = e(tL_messages_favedStickers.stickers.get(i12), null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.photos_Photos) {
            TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
            int size12 = photos_photos.photos.size();
            for (int i13 = 0; i13 < size12; i13++) {
                bArr = g(photos_photos.photos.get(i13), inputFileLocation, zArr, inputFileLocationArr);
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
            if (obj3 instanceof l94) {
                Object obj4 = ((l94) obj3).p0;
                if (obj4 instanceof TL_stories.StoryItem) {
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj4;
                    if (storyItem == null) {
                        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                        tL_updateStory.peer = getMessagesController().w1(storyItem2.dialogId);
                        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                        tL_updateStory.story = tL_storyItemDeleted;
                        tL_storyItemDeleted.id = storyItem2.id;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(tL_updateStory);
                        getMessagesController().P3(arrayList4, null, null, false, 0);
                    } else {
                        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(storyItem2.dialogId));
                        if (V1 != null && V1.contact) {
                            na7.q1(this.currentAccount).M1().k.k(storyItem2.dialogId, storyItem);
                        }
                    }
                    if (storyItem != null && bArr == null) {
                        TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                        tL_updateStory2.peer = na7.q1(this.currentAccount).w1(storyItem2.dialogId);
                        tL_updateStory2.story = storyItem;
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(tL_updateStory2);
                        na7.q1(this.currentAccount).P3(arrayList5, null, null, false, 0);
                    }
                }
            }
        }
        if (bArr == null) {
            return null;
        }
        if (inputFileLocationArr != null && (inputFileLocation2 = inputFileLocationArr[0]) != null) {
            inputFileLocation3 = inputFileLocation2;
        }
        return new Pair(bArr, inputFileLocation3);
    }

    public final boolean q(TLRPC.User user, TLRPC.Chat chat, boolean z, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation[] inputFileLocationArr, boolean[] zArr) {
        TLRPC.InputPeer tL_inputPeerChat;
        TLRPC.InputPeer inputPeer;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
        long j = inputFileLocation.volume_id;
        tL_inputPeerPhotoFileLocation.id = j;
        tL_inputPeerPhotoFileLocation.volume_id = j;
        tL_inputPeerPhotoFileLocation.local_id = inputFileLocation.local_id;
        tL_inputPeerPhotoFileLocation.big = z;
        if (user == null) {
            if (!hc2.T(chat)) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = chat.id;
            } else if (chat.access_hash != 0 || chat.fromMessageDialogId == 0 || chat.fromMessageId == 0) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.access_hash = chat.access_hash;
            } else {
                TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChannelFromMessage.channel_id = chat.id;
                tL_inputPeerChannelFromMessage.peer = getMessagesController().h1(chat.fromMessageDialogId);
                tL_inputPeerChannelFromMessage.msg_id = chat.fromMessageId;
                tL_inputPeerChat = tL_inputPeerChannelFromMessage;
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
            inputPeer.peer = getMessagesController().h1(user.fromMessageDialogId);
            inputPeer.msg_id = user.fromMessageId;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        }
        tL_inputPeerPhotoFileLocation.peer = inputPeer;
        inputFileLocationArr[0] = tL_inputPeerPhotoFileLocation;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error, boolean z, boolean z2) {
        String str3;
        String str4;
        TLRPC.TL_error tL_error2;
        boolean z3;
        ArrayList arrayList;
        boolean[] zArr;
        boolean z4;
        boolean[] zArr2;
        ArrayList arrayList2;
        int i;
        boolean z5;
        int i2;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        boolean z6;
        Object obj;
        ya4 ya4Var;
        HashMap hashMap;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        int i3;
        int i4;
        byte[] e;
        ArrayList arrayList3;
        long j;
        int i5;
        byte[] g;
        int i6;
        int i7;
        int i8;
        boolean z7 = tLObject instanceof TLRPC.TL_help_premiumPromo;
        if (z7) {
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
                    int i9 = 0;
                    z3 = false;
                    while (i9 < size) {
                        ya4 ya4Var2 = (ya4) arrayList4.get(i9);
                        if (ya4Var2.d) {
                            i7 = size;
                            i8 = i9;
                        } else {
                            i7 = size;
                            i8 = i9;
                            if (s(ya4Var2.c, null, tLObject, tL_error, z && !z3, z2)) {
                                z3 = true;
                            }
                        }
                        i9 = i8 + 1;
                        size = i7;
                    }
                    tL_error2 = tL_error;
                    if (z3 && ((xa4) hashMap2.get(str3)) == null) {
                        xa4 xa4Var = new xa4();
                        xa4Var.a = tLObject;
                        xa4Var.b = System.currentTimeMillis();
                        hashMap2.put(str3, xa4Var);
                    }
                    hashMap3.remove(str2);
                    HashMap hashMap4 = this.a;
                    arrayList = (ArrayList) hashMap4.get(str);
                    if (arrayList == null) {
                        return z3;
                    }
                    int size2 = arrayList.size();
                    boolean[] zArr3 = null;
                    int i10 = 0;
                    TLRPC.InputFileLocation[] inputFileLocationArr = null;
                    byte[] bArr = null;
                    while (i10 < size2) {
                        ya4 ya4Var3 = (ya4) arrayList.get(i10);
                        if (ya4Var3.d) {
                            arrayList2 = arrayList;
                            i = size2;
                            z5 = z7;
                            hashMap = hashMap2;
                            z6 = r12;
                            i2 = i10;
                        } else {
                            if (tL_error2 == null || !w01.a) {
                                zArr = zArr3;
                            } else {
                                Object[] objArr = ya4Var3.b;
                                zArr = zArr3;
                                if (objArr.length > r12) {
                                    Object obj2 = objArr[r12];
                                    if (obj2 instanceof l94) {
                                        fa4.d("debug_loading: " + ((l94) obj2).L0.getName() + " can't update file reference: " + tL_error2.code + " " + tL_error2.text);
                                    }
                                }
                            }
                            TLRPC.InputFileLocation inputFileLocation = ya4Var3.a;
                            if ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
                                z4 = true;
                                inputFileLocationArr = new TLRPC.InputFileLocation[1];
                                zArr2 = new boolean[1];
                            } else {
                                zArr2 = zArr;
                                z4 = true;
                            }
                            ya4Var3.d = z4;
                            if (tLObject instanceof q1b) {
                                TLRPC.MessageMedia messageMedia2 = ((q1b) tLObject).media;
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
                                i = size2;
                                ya4Var = ya4Var3;
                                z5 = z7;
                            } else {
                                arrayList2 = arrayList;
                                if (tLObject instanceof TLRPC.messages_Messages) {
                                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                    if (messages_messages.messages.isEmpty()) {
                                        i = size2;
                                        z5 = z7;
                                        boolean z8 = w01.a;
                                        fa4.b("empty messages, file ref not found");
                                    } else {
                                        int size3 = messages_messages.messages.size();
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= size3) {
                                                i = size2;
                                                z5 = z7;
                                                i5 = 0;
                                                break;
                                            }
                                            int i12 = size3;
                                            TLRPC.Message message = messages_messages.messages.get(i11);
                                            TLRPC.MessageMedia messageMedia3 = message.media;
                                            i = size2;
                                            if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                                z5 = z7;
                                                int i13 = 0;
                                                while (i13 < tL_messageMediaPaidMedia.extended_media.size()) {
                                                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i13);
                                                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
                                                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                                        bArr = j(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, ya4Var3.a, zArr2, inputFileLocationArr);
                                                    }
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                    i13++;
                                                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                                                }
                                            } else {
                                                z5 = z7;
                                                TL_iv.RichMessage richMessage = message.rich_message;
                                                if (richMessage != null) {
                                                    g = l(richMessage, ya4Var3.a, zArr2, inputFileLocationArr);
                                                } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                                    g = k((TLRPC.TL_messageMediaPoll) messageMedia3, ya4Var3.a, zArr2, inputFileLocationArr);
                                                } else if (messageMedia3 != null) {
                                                    g = j(messageMedia3, ya4Var3.a, zArr2, inputFileLocationArr);
                                                } else {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                                        g = g(messageAction.photo, ya4Var3.a, zArr2, inputFileLocationArr);
                                                    }
                                                }
                                                bArr = g;
                                            }
                                            if (bArr != null) {
                                                if (z) {
                                                    i6 = 0;
                                                    getMessagesStorage().o1(message, messages_messages.users, messages_messages.chats, false);
                                                } else {
                                                    i6 = 0;
                                                }
                                                i5 = i6;
                                            } else {
                                                i11++;
                                                size3 = i12;
                                                size2 = i;
                                                z7 = z5;
                                            }
                                        }
                                        if (bArr == null) {
                                            getMessagesStorage().o1(messages_messages.messages.get(i5), messages_messages.users, messages_messages.chats, true);
                                            boolean z9 = w01.a;
                                            fa4.b("file ref not found in messages, replacing message");
                                        }
                                    }
                                } else {
                                    i = size2;
                                    z5 = z7;
                                    if (z5) {
                                        ArrayList<TLRPC.Document> arrayList5 = ((TLRPC.TL_help_premiumPromo) tLObject).videos;
                                        int size4 = arrayList5.size();
                                        int i14 = 0;
                                        while (i14 < size4) {
                                            TLRPC.Document document4 = arrayList5.get(i14);
                                            i14++;
                                            bArr = e(document4, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                            if (bArr != null) {
                                                break;
                                            }
                                        }
                                    } else {
                                        long j2 = 1000;
                                        if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
                                            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
                                            getMediaDataController().y1(tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), tL_messages_availableReactions.reactions, false);
                                            ArrayList<TLRPC.TL_availableReaction> arrayList6 = tL_messages_availableReactions.reactions;
                                            int size5 = arrayList6.size();
                                            int i15 = 0;
                                            while (i15 < size5) {
                                                TLRPC.TL_availableReaction tL_availableReaction = arrayList6.get(i15);
                                                i15++;
                                                TLRPC.TL_availableReaction tL_availableReaction2 = tL_availableReaction;
                                                byte[] e2 = e(tL_availableReaction2.static_icon, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                if (e2 != null || (e2 = e(tL_availableReaction2.appear_animation, null, ya4Var3.a, zArr2, inputFileLocationArr)) != null || (e2 = e(tL_availableReaction2.select_animation, null, ya4Var3.a, zArr2, inputFileLocationArr)) != null || (e2 = e(tL_availableReaction2.activate_animation, null, ya4Var3.a, zArr2, inputFileLocationArr)) != null || (e2 = e(tL_availableReaction2.effect_animation, null, ya4Var3.a, zArr2, inputFileLocationArr)) != null || (e2 = e(tL_availableReaction2.around_animation, null, ya4Var3.a, zArr2, inputFileLocationArr)) != null) {
                                                    bArr = e2;
                                                    break;
                                                }
                                                byte[] e3 = e(tL_availableReaction2.center_icon, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                bArr = e3;
                                                if (e3 != null) {
                                                    break;
                                                }
                                            }
                                        } else if (tLObject instanceof TLRPC.TL_users_userFull) {
                                            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                                            getMessagesController().a4(tL_users_userFull.users, false);
                                            getMessagesController().U3(tL_users_userFull.chats, false);
                                            TLRPC.UserFull userFull = tL_users_userFull.full_user;
                                            TL_bots.BotInfo botInfo = userFull.bot_info;
                                            if (botInfo != null) {
                                                getMessagesStorage().g2(userFull, true);
                                                bArr = e(botInfo.description_document, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                if (bArr != null) {
                                                    i2 = i10;
                                                    hashMap = hashMap2;
                                                    zArr3 = zArr2;
                                                    z6 = true;
                                                } else {
                                                    bArr = g(botInfo.description_photo, ya4Var3.a, zArr2, inputFileLocationArr);
                                                }
                                            }
                                        } else {
                                            if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
                                                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject).bot;
                                                ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList7 = tL_attachMenuBot.icons;
                                                int size6 = arrayList7.size();
                                                int i16 = 0;
                                                while (true) {
                                                    if (i16 >= size6) {
                                                        j = j2;
                                                        break;
                                                    }
                                                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList7.get(i16);
                                                    i16++;
                                                    j = j2;
                                                    bArr = e(tL_attachMenuBotIcon.icon, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                    j2 = j;
                                                }
                                                if (z) {
                                                    TLRPC.TL_attachMenuBots tL_attachMenuBots = getMediaDataController().b;
                                                    ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = new ArrayList<>(tL_attachMenuBots.bots);
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i17 >= arrayList8.size()) {
                                                            i2 = i10;
                                                            break;
                                                        }
                                                        i2 = i10;
                                                        if (arrayList8.get(i17).bot_id == tL_attachMenuBot.bot_id) {
                                                            arrayList8.set(i17, tL_attachMenuBot);
                                                            break;
                                                        }
                                                        i17++;
                                                        i10 = i2;
                                                    }
                                                    tL_attachMenuBots.bots = arrayList8;
                                                    getMediaDataController().w1(tL_attachMenuBots, tL_attachMenuBots.hash, (int) (System.currentTimeMillis() / j), false);
                                                } else {
                                                    i2 = i10;
                                                }
                                            } else {
                                                i2 = i10;
                                                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                                                    TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject;
                                                    try {
                                                        gba.g1 = tL_help_appUpdate;
                                                        gba.x();
                                                    } catch (Exception e4) {
                                                        fa4.g(e4, true);
                                                    }
                                                    try {
                                                        kk7.e().k(kk7.S4, new Object[0]);
                                                    } catch (Exception e5) {
                                                        fa4.g(e5, true);
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
                                                    } catch (Exception e6) {
                                                        fa4.g(e6, true);
                                                        bArr = null;
                                                    }
                                                    if (bArr == null) {
                                                        arrayList3 = null;
                                                        bArr = e(tL_help_appUpdate.document, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                    } else {
                                                        arrayList3 = null;
                                                    }
                                                    if (bArr == null) {
                                                        e = e(tL_help_appUpdate.sticker, arrayList3, ya4Var3.a, zArr2, inputFileLocationArr);
                                                        bArr = e;
                                                    }
                                                } else if (tLObject instanceof TLRPC.TL_messages_webPage) {
                                                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                                                    getMessagesController().U3(tL_messages_webPage.chats, false);
                                                    getMessagesController().a4(tL_messages_webPage.users, false);
                                                    bArr = i(tL_messages_webPage.webpage, ya4Var3.a, zArr2, inputFileLocationArr);
                                                } else if (tLObject instanceof TLRPC.WebPage) {
                                                    bArr = i((TLRPC.WebPage) tLObject, inputFileLocation, zArr2, inputFileLocationArr);
                                                } else if (tLObject instanceof TL_account.TL_wallPapers) {
                                                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                                                    int size7 = tL_wallPapers.wallpapers.size();
                                                    int i18 = 0;
                                                    while (true) {
                                                        if (i18 >= size7) {
                                                            break;
                                                        }
                                                        byte[] e7 = e(tL_wallPapers.wallpapers.get(i18).document, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                        if (e7 != null) {
                                                            bArr = e7;
                                                            break;
                                                        }
                                                        i18++;
                                                        bArr = e7;
                                                    }
                                                    if (bArr != null && z) {
                                                        getMessagesStorage().m1(1, tL_wallPapers.wallpapers);
                                                    }
                                                } else {
                                                    if (tLObject instanceof TLRPC.TL_wallPaper) {
                                                        TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                                                        e = e(tL_wallPaper.document, null, inputFileLocation, zArr2, inputFileLocationArr);
                                                        if (e != null && z) {
                                                            ArrayList arrayList9 = new ArrayList();
                                                            arrayList9.add(tL_wallPaper);
                                                            getMessagesStorage().m1(0, arrayList9);
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_theme) {
                                                        TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject;
                                                        e = e(tL_theme.document, null, inputFileLocation, zArr2, inputFileLocationArr);
                                                        if (e != null && z) {
                                                            gl.d3(new s54((Object) tL_theme, (byte) 6));
                                                        }
                                                    } else if (tLObject instanceof Vector) {
                                                        Vector vector = (Vector) tLObject;
                                                        if (!vector.objects.isEmpty()) {
                                                            int size8 = vector.objects.size();
                                                            int i19 = 0;
                                                            while (i19 < size8) {
                                                                Object obj3 = vector.objects.get(i19);
                                                                if (obj3 instanceof TLRPC.TL_transcriptionModel) {
                                                                    i3 = size8;
                                                                    i4 = i19;
                                                                    bArr = e(((TLRPC.TL_transcriptionModel) obj3).document, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                                } else if (obj3 instanceof TLRPC.User) {
                                                                    TLRPC.User user = (TLRPC.User) obj3;
                                                                    byte[] h = h(user, ya4Var3.a, zArr2, inputFileLocationArr);
                                                                    if (!z || h == null) {
                                                                        i3 = size8;
                                                                        i4 = i19;
                                                                    } else {
                                                                        ArrayList arrayList10 = new ArrayList();
                                                                        arrayList10.add(user);
                                                                        i3 = size8;
                                                                        i4 = i19;
                                                                        getMessagesStorage().j1(arrayList10, null, true, true);
                                                                        gl.d3(new eu3(this, user, (byte) 26));
                                                                    }
                                                                    bArr = h;
                                                                } else {
                                                                    i3 = size8;
                                                                    i4 = i19;
                                                                    if (obj3 instanceof TLRPC.Chat) {
                                                                        final TLRPC.Chat chat = (TLRPC.Chat) obj3;
                                                                        byte[] d = d(chat, ya4Var3.a, zArr2, inputFileLocationArr);
                                                                        if (z && d != null) {
                                                                            ArrayList arrayList11 = new ArrayList();
                                                                            arrayList11.add(chat);
                                                                            getMessagesStorage().j1(null, arrayList11, true, true);
                                                                            final byte b = 0;
                                                                            gl.d3(new Runnable(this) { // from class: ra4
                                                                                public final /* synthetic */ ab4 b;

                                                                                {
                                                                                    this.b = this;
                                                                                }

                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    byte b2 = b;
                                                                                    TLRPC.Chat chat2 = chat;
                                                                                    ab4 ab4Var = this.b;
                                                                                    switch (b2) {
                                                                                        case 0:
                                                                                            ab4Var.getMessagesController().S3(chat2, false);
                                                                                            break;
                                                                                        default:
                                                                                            ab4Var.getMessagesController().S3(chat2, false);
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
                                                                i19 = i4 + 1;
                                                                size8 = i3;
                                                            }
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_chats) {
                                                        TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                                                        if (!tL_messages_chats.chats.isEmpty()) {
                                                            int size9 = tL_messages_chats.chats.size();
                                                            int i20 = 0;
                                                            while (true) {
                                                                if (i20 >= size9) {
                                                                    break;
                                                                }
                                                                final TLRPC.Chat chat2 = tL_messages_chats.chats.get(i20);
                                                                bArr = d(chat2, ya4Var3.a, zArr2, inputFileLocationArr);
                                                                if (bArr == null) {
                                                                    i20++;
                                                                } else if (z) {
                                                                    ArrayList arrayList12 = new ArrayList();
                                                                    arrayList12.add(chat2);
                                                                    final byte b2 = 1;
                                                                    getMessagesStorage().j1(null, arrayList12, true, true);
                                                                    gl.d3(new Runnable(this) { // from class: ra4
                                                                        public final /* synthetic */ ab4 b;

                                                                        {
                                                                            this.b = this;
                                                                        }

                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            byte b22 = b2;
                                                                            TLRPC.Chat chat22 = chat2;
                                                                            ab4 ab4Var = this.b;
                                                                            switch (b22) {
                                                                                case 0:
                                                                                    ab4Var.getMessagesController().S3(chat22, false);
                                                                                    break;
                                                                                default:
                                                                                    ab4Var.getMessagesController().S3(chat22, false);
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
                                                        int i21 = 0;
                                                        while (true) {
                                                            if (i21 >= size10) {
                                                                break;
                                                            }
                                                            byte[] e8 = e(tL_messages_savedGifs.gifs.get(i21), null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                            if (e8 != null) {
                                                                bArr = e8;
                                                                break;
                                                            }
                                                            i21++;
                                                            bArr = e8;
                                                        }
                                                        if (z) {
                                                            getMediaDataController().z1(0, tL_messages_savedGifs.gifs, true, 0, true);
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                                                        if (bArr == null) {
                                                            int size11 = tL_messages_stickerSet.documents.size();
                                                            int i22 = 0;
                                                            while (true) {
                                                                if (i22 >= size11) {
                                                                    break;
                                                                }
                                                                byte[] e9 = e(tL_messages_stickerSet.documents.get(i22), null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                                if (e9 != null) {
                                                                    bArr = e9;
                                                                    break;
                                                                }
                                                                i22++;
                                                                bArr = e9;
                                                            }
                                                        }
                                                        if (z) {
                                                            gl.d3(new eu3(this, tL_messages_stickerSet, (byte) 27));
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                                                        TLRPC.TL_messages_recentStickers tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject;
                                                        int size12 = tL_messages_recentStickers.stickers.size();
                                                        int i23 = 0;
                                                        while (true) {
                                                            if (i23 >= size12) {
                                                                break;
                                                            }
                                                            byte[] e10 = e(tL_messages_recentStickers.stickers.get(i23), null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                            if (e10 != null) {
                                                                bArr = e10;
                                                                break;
                                                            }
                                                            i23++;
                                                            bArr = e10;
                                                        }
                                                        if (z) {
                                                            getMediaDataController().z1(0, tL_messages_recentStickers.stickers, false, 0, true);
                                                        }
                                                    } else if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                                                        TLRPC.TL_messages_favedStickers tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject;
                                                        int size13 = tL_messages_favedStickers.stickers.size();
                                                        int i24 = 0;
                                                        while (true) {
                                                            if (i24 >= size13) {
                                                                break;
                                                            }
                                                            byte[] e11 = e(tL_messages_favedStickers.stickers.get(i24), null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                            if (e11 != null) {
                                                                bArr = e11;
                                                                break;
                                                            }
                                                            i24++;
                                                            bArr = e11;
                                                        }
                                                        if (z) {
                                                            getMediaDataController().z1(2, tL_messages_favedStickers.stickers, false, 0, true);
                                                        }
                                                    } else if (tLObject instanceof TLRPC.photos_Photos) {
                                                        TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                                        int size14 = photos_photos.photos.size();
                                                        for (int i25 = 0; i25 < size14; i25++) {
                                                            bArr = g(photos_photos.photos.get(i25), ya4Var3.a, zArr2, inputFileLocationArr);
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
                                                                bArr = e(document2, null, ya4Var3.a, zArr2, inputFileLocationArr);
                                                            }
                                                            TLRPC.MessageMedia messageMedia4 = storyItem2.media;
                                                            if (messageMedia4 != null) {
                                                                if (bArr == null && (photo2 = messageMedia4.photo) != null) {
                                                                    bArr = g(photo2, ya4Var3.a, zArr2, inputFileLocationArr);
                                                                }
                                                                if (bArr == null && (photo = storyItem2.media.video_cover) != null) {
                                                                    bArr = g(photo, ya4Var3.a, zArr2, inputFileLocationArr);
                                                                }
                                                                if (bArr == null && (document = (messageMedia = storyItem2.media).document) != null) {
                                                                    bArr = e(document, messageMedia.alt_documents, ya4Var3.a, zArr2, inputFileLocationArr);
                                                                }
                                                                z6 = true;
                                                                obj = ya4Var3.b[1];
                                                                if (obj instanceof l94) {
                                                                    Object obj4 = ((l94) obj).p0;
                                                                    if (obj4 instanceof TL_stories.StoryItem) {
                                                                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) obj4;
                                                                        if (storyItem2 == null) {
                                                                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                                                            ya4Var = ya4Var3;
                                                                            tL_updateStory.peer = getMessagesController().w1(storyItem3.dialogId);
                                                                            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                                                            tL_updateStory.story = tL_storyItemDeleted;
                                                                            tL_storyItemDeleted.id = storyItem3.id;
                                                                            ArrayList arrayList13 = new ArrayList();
                                                                            arrayList13.add(tL_updateStory);
                                                                            getMessagesController().P3(arrayList13, null, null, false, 0);
                                                                        } else {
                                                                            ya4Var = ya4Var3;
                                                                            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(storyItem3.dialogId));
                                                                            if (V1 != null && V1.contact) {
                                                                                na7.q1(this.currentAccount).M1().k.k(storyItem3.dialogId, storyItem2);
                                                                            }
                                                                        }
                                                                        if (storyItem2 != null && bArr == null) {
                                                                            TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                                                                            hashMap = hashMap2;
                                                                            tL_updateStory2.peer = na7.q1(this.currentAccount).w1(storyItem3.dialogId);
                                                                            tL_updateStory2.story = storyItem2;
                                                                            ArrayList arrayList14 = new ArrayList();
                                                                            arrayList14.add(tL_updateStory2);
                                                                            na7.q1(this.currentAccount).P3(arrayList14, null, null, false, 0);
                                                                            if (bArr != null) {
                                                                                v(ya4Var.b);
                                                                            } else if (t(ya4Var, bArr, inputFileLocationArr != null ? inputFileLocationArr[0] : null, z2)) {
                                                                                zArr3 = zArr2;
                                                                                z3 = z6;
                                                                            }
                                                                            zArr3 = zArr2;
                                                                        }
                                                                        hashMap = hashMap2;
                                                                        if (bArr != null) {
                                                                        }
                                                                        zArr3 = zArr2;
                                                                    }
                                                                }
                                                                ya4Var = ya4Var3;
                                                                hashMap = hashMap2;
                                                                if (bArr != null) {
                                                                }
                                                                zArr3 = zArr2;
                                                            }
                                                        }
                                                        storyItem2 = storyItem;
                                                        z6 = true;
                                                        obj = ya4Var3.b[1];
                                                        if (obj instanceof l94) {
                                                        }
                                                        ya4Var = ya4Var3;
                                                        hashMap = hashMap2;
                                                        if (bArr != null) {
                                                        }
                                                        zArr3 = zArr2;
                                                    }
                                                    bArr = e;
                                                }
                                            }
                                            ya4Var = ya4Var3;
                                            hashMap = hashMap2;
                                            z6 = true;
                                            if (bArr != null) {
                                            }
                                            zArr3 = zArr2;
                                        }
                                    }
                                }
                                ya4Var = ya4Var3;
                            }
                            i2 = i10;
                            hashMap = hashMap2;
                            z6 = true;
                            if (bArr != null) {
                            }
                            zArr3 = zArr2;
                        }
                        i10 = i2 + 1;
                        tL_error2 = tL_error;
                        hashMap2 = hashMap;
                        arrayList = arrayList2;
                        r12 = z6;
                        size2 = i;
                        z7 = z5;
                    }
                    HashMap hashMap5 = hashMap2;
                    hashMap4.remove(str);
                    if (z3 && ((xa4) hashMap5.get(str)) == null) {
                        xa4 xa4Var2 = new xa4();
                        xa4Var2.a = tLObject;
                        xa4Var2.b = System.currentTimeMillis();
                        hashMap5.put(str, xa4Var2);
                    }
                    return z3;
                }
            }
            tL_error2 = tL_error;
            z3 = false;
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
        z3 = false;
        HashMap hashMap422 = this.a;
        arrayList = (ArrayList) hashMap422.get(str);
        if (arrayList == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(final ya4 ya4Var, byte[] bArr, TLRPC.InputFileLocation inputFileLocation, boolean z) {
        Object[] objArr;
        String str;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        int indexOf;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int indexOf2;
        int indexOf3;
        boolean z2 = w01.a;
        StringBuilder sb = new StringBuilder("fileref updated for ");
        final byte b = 0;
        sb.append(ya4Var.b[0]);
        sb.append(" ");
        de9.s(ya4Var.c, sb);
        Object[] objArr2 = ya4Var.b;
        Object obj = objArr2[0];
        final byte b2 = 1;
        if (obj instanceof TL_stories.TL_storyItem) {
            ((TL_stories.TL_storyItem) obj).media.document.file_reference = bArr;
            return true;
        }
        boolean z3 = obj instanceof TLRPC.TL_inputSingleMedia;
        final byte b3 = 3;
        HashMap hashMap = this.d;
        if (z3) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) objArr2[1];
            Object[] objArr3 = (Object[]) hashMap.get(tL_messages_sendMultiMedia);
            if (objArr3 != null) {
                TLRPC.TL_inputSingleMedia tL_inputSingleMedia = (TLRPC.TL_inputSingleMedia) ya4Var.b[0];
                TLRPC.InputMedia inputMedia = tL_inputSingleMedia.media;
                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                    if (!z || !Arrays.equals(tL_inputMediaDocument.id.file_reference, bArr)) {
                        tL_inputMediaDocument.id.file_reference = bArr;
                        indexOf3 = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                        if (indexOf3 >= 0) {
                            ArrayList arrayList = (ArrayList) objArr3[3];
                            arrayList.set(indexOf3, null);
                            boolean z4 = true;
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (arrayList.get(i) != null) {
                                    z4 = false;
                                }
                            }
                            if (z4) {
                                hashMap.remove(tL_messages_sendMultiMedia);
                                gl.d3(new sa4(this, tL_messages_sendMultiMedia, objArr3, b));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    if (!z || !Arrays.equals(tL_inputMediaPhoto3.id.file_reference, bArr)) {
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
        final byte b4 = 2;
        if (objArr2.length >= 2) {
            Object obj2 = objArr2[1];
            if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj2;
                if ((tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                    Object[] objArr4 = (Object[]) hashMap.get(tL_messages_sendMedia);
                    if (objArr4 != null) {
                        Object obj3 = ya4Var.b[0];
                        if (obj3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj3;
                            if (!z || !Arrays.equals(tL_inputMediaDocument2.id.file_reference, bArr)) {
                                tL_inputMediaDocument2.id.file_reference = bArr;
                                tL_inputMediaPhoto2 = tL_inputMediaDocument2;
                                indexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(tL_inputMediaPhoto2);
                                if (indexOf2 >= 0) {
                                    ArrayList arrayList2 = (ArrayList) objArr4[3];
                                    arrayList2.set(indexOf2, null);
                                    boolean z5 = true;
                                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                        if (arrayList2.get(i2) != null) {
                                            z5 = false;
                                        }
                                    }
                                    if (z5) {
                                        hashMap.remove(tL_messages_sendMedia);
                                        gl.d3(new ta4(this, tL_messages_sendMedia, objArr4, b));
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (obj3 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) obj3;
                            if (!z || !Arrays.equals(tL_inputMediaPhoto4.id.file_reference, bArr)) {
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
                        Object obj5 = ya4Var.b[0];
                        if (obj5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) obj5;
                            if (!z || !Arrays.equals(tL_inputMediaDocument3.id.file_reference, bArr)) {
                                tL_inputMediaDocument3.id.file_reference = bArr;
                                tL_inputMediaPhoto = tL_inputMediaDocument3;
                                indexOf = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(tL_inputMediaPhoto);
                                if (indexOf >= 0) {
                                    ArrayList arrayList3 = (ArrayList) objArr5[3];
                                    arrayList3.set(indexOf, null);
                                    boolean z6 = true;
                                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                        if (arrayList3.get(i3) != null) {
                                            z6 = false;
                                        }
                                    }
                                    if (z6) {
                                        hashMap.remove(tL_sendMessage);
                                        gl.d3(new ua4(this, tL_sendMessage, objArr5, b));
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (obj5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) obj5;
                            if (!z || !Arrays.equals(tL_inputMediaPhoto5.id.file_reference, bArr)) {
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
                    if (!z || !Arrays.equals(tL_inputMediaPhoto6.id.file_reference, bArr)) {
                        tL_inputMediaPhoto6.id.file_reference = bArr;
                    }
                }
                gl.d3(new Runnable(this) { // from class: va4
                    public final /* synthetic */ ab4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b;
                        ya4 ya4Var2 = ya4Var;
                        ab4 ab4Var = this.b;
                        switch (b5) {
                            case 0:
                                z3a sendMessagesHelper = ab4Var.getSendMessagesHelper();
                                Object[] objArr6 = ya4Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                k27 k27Var = (k27) objArr6[1];
                                String str2 = (String) objArr6[2];
                                k3a k3aVar = (k3a) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = ya4Var2.b;
                                sendMessagesHelper.N(tLObject, k27Var, str2, k3aVar, booleanValue, (k3a) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                z3a sendMessagesHelper2 = ab4Var.getSendMessagesHelper();
                                Object[] objArr8 = ya4Var2.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                k27 k27Var2 = (k27) objArr8[1];
                                String str3 = (String) objArr8[2];
                                k3a k3aVar2 = (k3a) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = ya4Var2.b;
                                sendMessagesHelper2.N(tLObject2, k27Var2, str3, k3aVar2, booleanValue2, (k3a) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                z3a sendMessagesHelper3 = ab4Var.getSendMessagesHelper();
                                Object[] objArr10 = ya4Var2.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                k27 k27Var3 = (k27) objArr10[1];
                                String str4 = (String) objArr10[2];
                                k3a k3aVar3 = (k3a) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = ya4Var2.b;
                                sendMessagesHelper3.N(tLObject3, k27Var3, str4, k3aVar3, booleanValue3, (k3a) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                z3a sendMessagesHelper4 = ab4Var.getSendMessagesHelper();
                                Object[] objArr12 = ya4Var2.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                k27 k27Var4 = (k27) objArr12[1];
                                String str5 = (String) objArr12[2];
                                k3a k3aVar4 = (k3a) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = ya4Var2.b;
                                sendMessagesHelper4.N(tLObject4, k27Var4, str5, k3aVar4, booleanValue4, (k3a) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia2;
            if (!z || !Arrays.equals(tL_inputMediaDocument4.id.file_reference, bArr)) {
                tL_inputMediaDocument4.id.file_reference = bArr;
                gl.d3(new Runnable(this) { // from class: va4
                    public final /* synthetic */ ab4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b;
                        ya4 ya4Var2 = ya4Var;
                        ab4 ab4Var = this.b;
                        switch (b5) {
                            case 0:
                                z3a sendMessagesHelper = ab4Var.getSendMessagesHelper();
                                Object[] objArr6 = ya4Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                k27 k27Var = (k27) objArr6[1];
                                String str2 = (String) objArr6[2];
                                k3a k3aVar = (k3a) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = ya4Var2.b;
                                sendMessagesHelper.N(tLObject, k27Var, str2, k3aVar, booleanValue, (k3a) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                z3a sendMessagesHelper2 = ab4Var.getSendMessagesHelper();
                                Object[] objArr8 = ya4Var2.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                k27 k27Var2 = (k27) objArr8[1];
                                String str3 = (String) objArr8[2];
                                k3a k3aVar2 = (k3a) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = ya4Var2.b;
                                sendMessagesHelper2.N(tLObject2, k27Var2, str3, k3aVar2, booleanValue2, (k3a) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                z3a sendMessagesHelper3 = ab4Var.getSendMessagesHelper();
                                Object[] objArr10 = ya4Var2.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                k27 k27Var3 = (k27) objArr10[1];
                                String str4 = (String) objArr10[2];
                                k3a k3aVar3 = (k3a) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = ya4Var2.b;
                                sendMessagesHelper3.N(tLObject3, k27Var3, str4, k3aVar3, booleanValue3, (k3a) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                z3a sendMessagesHelper4 = ab4Var.getSendMessagesHelper();
                                Object[] objArr12 = ya4Var2.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                k27 k27Var4 = (k27) objArr12[1];
                                String str5 = (String) objArr12[2];
                                k3a k3aVar4 = (k3a) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = ya4Var2.b;
                                sendMessagesHelper4.N(tLObject4, k27Var4, str5, k3aVar4, booleanValue4, (k3a) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
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
                    if (!z || !Arrays.equals(tL_inputMediaPhoto7.id.file_reference, bArr)) {
                        tL_inputMediaPhoto7.id.file_reference = bArr;
                    }
                }
                gl.d3(new Runnable(this) { // from class: va4
                    public final /* synthetic */ ab4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b2;
                        ya4 ya4Var2 = ya4Var;
                        ab4 ab4Var = this.b;
                        switch (b5) {
                            case 0:
                                z3a sendMessagesHelper = ab4Var.getSendMessagesHelper();
                                Object[] objArr6 = ya4Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                k27 k27Var = (k27) objArr6[1];
                                String str2 = (String) objArr6[2];
                                k3a k3aVar = (k3a) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = ya4Var2.b;
                                sendMessagesHelper.N(tLObject, k27Var, str2, k3aVar, booleanValue, (k3a) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                z3a sendMessagesHelper2 = ab4Var.getSendMessagesHelper();
                                Object[] objArr8 = ya4Var2.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                k27 k27Var2 = (k27) objArr8[1];
                                String str3 = (String) objArr8[2];
                                k3a k3aVar2 = (k3a) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = ya4Var2.b;
                                sendMessagesHelper2.N(tLObject2, k27Var2, str3, k3aVar2, booleanValue2, (k3a) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                z3a sendMessagesHelper3 = ab4Var.getSendMessagesHelper();
                                Object[] objArr10 = ya4Var2.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                k27 k27Var3 = (k27) objArr10[1];
                                String str4 = (String) objArr10[2];
                                k3a k3aVar3 = (k3a) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = ya4Var2.b;
                                sendMessagesHelper3.N(tLObject3, k27Var3, str4, k3aVar3, booleanValue3, (k3a) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                z3a sendMessagesHelper4 = ab4Var.getSendMessagesHelper();
                                Object[] objArr12 = ya4Var2.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                k27 k27Var4 = (k27) objArr12[1];
                                String str5 = (String) objArr12[2];
                                k3a k3aVar4 = (k3a) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = ya4Var2.b;
                                sendMessagesHelper4.N(tLObject4, k27Var4, str5, k3aVar4, booleanValue4, (k3a) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia3;
            if (!z || !Arrays.equals(tL_inputMediaDocument5.id.file_reference, bArr)) {
                tL_inputMediaDocument5.id.file_reference = bArr;
                gl.d3(new Runnable(this) { // from class: va4
                    public final /* synthetic */ ab4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b2;
                        ya4 ya4Var2 = ya4Var;
                        ab4 ab4Var = this.b;
                        switch (b5) {
                            case 0:
                                z3a sendMessagesHelper = ab4Var.getSendMessagesHelper();
                                Object[] objArr6 = ya4Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                k27 k27Var = (k27) objArr6[1];
                                String str2 = (String) objArr6[2];
                                k3a k3aVar = (k3a) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = ya4Var2.b;
                                sendMessagesHelper.N(tLObject, k27Var, str2, k3aVar, booleanValue, (k3a) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                z3a sendMessagesHelper2 = ab4Var.getSendMessagesHelper();
                                Object[] objArr8 = ya4Var2.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                k27 k27Var2 = (k27) objArr8[1];
                                String str3 = (String) objArr8[2];
                                k3a k3aVar2 = (k3a) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = ya4Var2.b;
                                sendMessagesHelper2.N(tLObject2, k27Var2, str3, k3aVar2, booleanValue2, (k3a) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                z3a sendMessagesHelper3 = ab4Var.getSendMessagesHelper();
                                Object[] objArr10 = ya4Var2.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                k27 k27Var3 = (k27) objArr10[1];
                                String str4 = (String) objArr10[2];
                                k3a k3aVar3 = (k3a) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = ya4Var2.b;
                                sendMessagesHelper3.N(tLObject3, k27Var3, str4, k3aVar3, booleanValue3, (k3a) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                z3a sendMessagesHelper4 = ab4Var.getSendMessagesHelper();
                                Object[] objArr12 = ya4Var2.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                k27 k27Var4 = (k27) objArr12[1];
                                String str5 = (String) objArr12[2];
                                k3a k3aVar4 = (k3a) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = ya4Var2.b;
                                sendMessagesHelper4.N(tLObject4, k27Var4, str5, k3aVar4, booleanValue4, (k3a) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
        } else {
            if (!(obj instanceof TLRPC.TL_messages_editMessage)) {
                if (obj instanceof TLRPC.InputPhoto) {
                    TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj;
                    if (!z || !Arrays.equals(inputPhoto.file_reference, bArr)) {
                        inputPhoto.file_reference = bArr;
                        objArr = ya4Var.b;
                        if (objArr.length > 1) {
                        }
                    }
                } else if (obj instanceof TLRPC.InputDocument) {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj;
                    if (!z || !Arrays.equals(inputDocument.file_reference, bArr)) {
                        inputDocument.file_reference = bArr;
                        objArr = ya4Var.b;
                        if (objArr.length > 1) {
                            Object obj6 = objArr[1];
                            if (obj6 instanceof Runnable) {
                                gl.d3((Runnable) obj6);
                            }
                        }
                    }
                } else if (obj instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) obj).answer.input_media;
                    if (!(inputMedia4 instanceof TLRPC.TL_inputMediaDocument)) {
                        if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                            if (!z || !Arrays.equals(tL_inputMediaPhoto8.id.file_reference, bArr)) {
                                tL_inputMediaPhoto8.id.file_reference = bArr;
                            }
                        }
                        gl.d3(new Runnable(this) { // from class: va4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = b3;
                                ya4 ya4Var2 = ya4Var;
                                ab4 ab4Var = this.b;
                                switch (b5) {
                                    case 0:
                                        z3a sendMessagesHelper = ab4Var.getSendMessagesHelper();
                                        Object[] objArr6 = ya4Var2.b;
                                        TLObject tLObject = (TLObject) objArr6[0];
                                        k27 k27Var = (k27) objArr6[1];
                                        String str2 = (String) objArr6[2];
                                        k3a k3aVar = (k3a) objArr6[3];
                                        boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                        Object[] objArr7 = ya4Var2.b;
                                        sendMessagesHelper.N(tLObject, k27Var, str2, k3aVar, booleanValue, (k3a) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                        break;
                                    case 1:
                                        z3a sendMessagesHelper2 = ab4Var.getSendMessagesHelper();
                                        Object[] objArr8 = ya4Var2.b;
                                        TLObject tLObject2 = (TLObject) objArr8[0];
                                        k27 k27Var2 = (k27) objArr8[1];
                                        String str3 = (String) objArr8[2];
                                        k3a k3aVar2 = (k3a) objArr8[3];
                                        boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                        Object[] objArr9 = ya4Var2.b;
                                        sendMessagesHelper2.N(tLObject2, k27Var2, str3, k3aVar2, booleanValue2, (k3a) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                        break;
                                    case 2:
                                        z3a sendMessagesHelper3 = ab4Var.getSendMessagesHelper();
                                        Object[] objArr10 = ya4Var2.b;
                                        TLObject tLObject3 = (TLObject) objArr10[0];
                                        k27 k27Var3 = (k27) objArr10[1];
                                        String str4 = (String) objArr10[2];
                                        k3a k3aVar3 = (k3a) objArr10[3];
                                        boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                        Object[] objArr11 = ya4Var2.b;
                                        sendMessagesHelper3.N(tLObject3, k27Var3, str4, k3aVar3, booleanValue3, (k3a) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                        break;
                                    default:
                                        z3a sendMessagesHelper4 = ab4Var.getSendMessagesHelper();
                                        Object[] objArr12 = ya4Var2.b;
                                        TLObject tLObject4 = (TLObject) objArr12[0];
                                        k27 k27Var4 = (k27) objArr12[1];
                                        String str5 = (String) objArr12[2];
                                        k3a k3aVar4 = (k3a) objArr12[3];
                                        boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                        Object[] objArr13 = ya4Var2.b;
                                        sendMessagesHelper4.N(tLObject4, k27Var4, str5, k3aVar4, booleanValue4, (k3a) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                        break;
                                }
                            }
                        });
                        return true;
                    }
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                    if (!z || !Arrays.equals(tL_inputMediaDocument6.id.file_reference, bArr)) {
                        tL_inputMediaDocument6.id.file_reference = bArr;
                        gl.d3(new Runnable(this) { // from class: va4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = b3;
                                ya4 ya4Var2 = ya4Var;
                                ab4 ab4Var = this.b;
                                switch (b5) {
                                    case 0:
                                        z3a sendMessagesHelper = ab4Var.getSendMessagesHelper();
                                        Object[] objArr6 = ya4Var2.b;
                                        TLObject tLObject = (TLObject) objArr6[0];
                                        k27 k27Var = (k27) objArr6[1];
                                        String str2 = (String) objArr6[2];
                                        k3a k3aVar = (k3a) objArr6[3];
                                        boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                        Object[] objArr7 = ya4Var2.b;
                                        sendMessagesHelper.N(tLObject, k27Var, str2, k3aVar, booleanValue, (k3a) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                        break;
                                    case 1:
                                        z3a sendMessagesHelper2 = ab4Var.getSendMessagesHelper();
                                        Object[] objArr8 = ya4Var2.b;
                                        TLObject tLObject2 = (TLObject) objArr8[0];
                                        k27 k27Var2 = (k27) objArr8[1];
                                        String str3 = (String) objArr8[2];
                                        k3a k3aVar2 = (k3a) objArr8[3];
                                        boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                        Object[] objArr9 = ya4Var2.b;
                                        sendMessagesHelper2.N(tLObject2, k27Var2, str3, k3aVar2, booleanValue2, (k3a) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                        break;
                                    case 2:
                                        z3a sendMessagesHelper3 = ab4Var.getSendMessagesHelper();
                                        Object[] objArr10 = ya4Var2.b;
                                        TLObject tLObject3 = (TLObject) objArr10[0];
                                        k27 k27Var3 = (k27) objArr10[1];
                                        String str4 = (String) objArr10[2];
                                        k3a k3aVar3 = (k3a) objArr10[3];
                                        boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                        Object[] objArr11 = ya4Var2.b;
                                        sendMessagesHelper3.N(tLObject3, k27Var3, str4, k3aVar3, booleanValue3, (k3a) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                        break;
                                    default:
                                        z3a sendMessagesHelper4 = ab4Var.getSendMessagesHelper();
                                        Object[] objArr12 = ya4Var2.b;
                                        TLObject tLObject4 = (TLObject) objArr12[0];
                                        k27 k27Var4 = (k27) objArr12[1];
                                        String str5 = (String) objArr12[2];
                                        k3a k3aVar4 = (k3a) objArr12[3];
                                        boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                        Object[] objArr13 = ya4Var2.b;
                                        sendMessagesHelper4.N(tLObject4, k27Var4, str5, k3aVar4, booleanValue4, (k3a) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                        break;
                                }
                            }
                        });
                        return true;
                    }
                } else if (obj instanceof TLRPC.TL_messages_saveGif) {
                    TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                    if (!z || !Arrays.equals(tL_messages_saveGif.id.file_reference, bArr)) {
                        tL_messages_saveGif.id.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_messages_saveGif, new ce2(b));
                        return true;
                    }
                } else if (obj instanceof TLRPC.TL_messages_saveRecentSticker) {
                    TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                    if (!z || !Arrays.equals(tL_messages_saveRecentSticker.id.file_reference, bArr)) {
                        tL_messages_saveRecentSticker.id.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new ce2(b));
                        return true;
                    }
                } else if (obj instanceof TLRPC.TL_stickers_addStickerToSet) {
                    TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                    if (!z || !Arrays.equals(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                        tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_stickers_addStickerToSet, new ce2(b));
                        return true;
                    }
                } else if (obj instanceof TLRPC.TL_messages_faveSticker) {
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                    if (!z || !Arrays.equals(tL_messages_faveSticker.id.file_reference, bArr)) {
                        tL_messages_faveSticker.id.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_messages_faveSticker, new ce2(b));
                        return true;
                    }
                } else if (obj instanceof TLRPC.TL_messages_getAttachedStickers) {
                    TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                    TLRPC.InputStickeredMedia inputStickeredMedia = tL_messages_getAttachedStickers.media;
                    if (!(inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument)) {
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                            if (!z || !Arrays.equals(tL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                                tL_inputStickeredMediaPhoto.id.file_reference = bArr;
                            }
                        }
                        getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) ya4Var.b[1]);
                        return true;
                    }
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                    if (!z || !Arrays.equals(tL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                        tL_inputStickeredMediaDocument.id.file_reference = bArr;
                        getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) ya4Var.b[1]);
                        return true;
                    }
                } else {
                    Object obj7 = objArr2[1];
                    if (obj7 instanceof l94) {
                        l94 l94Var = (l94) obj7;
                        if (inputFileLocation != null) {
                            if (!z || !Arrays.equals(l94Var.V.file_reference, inputFileLocation.file_reference)) {
                                str = w01.a ? Utilities.f(l94Var.V.file_reference) : null;
                                l94Var.V = inputFileLocation;
                                if (w01.a) {
                                    r8 = Utilities.f(inputFileLocation.file_reference);
                                }
                                l94Var.A0 = false;
                                if (w01.a) {
                                    fa4.b("debug_loading: " + l94Var.L0.getName() + " " + str + " " + r8 + " reference updated resume download");
                                }
                                l94Var.q(-1);
                                return true;
                            }
                        } else if (!z || !Arrays.equals(ya4Var.a.file_reference, bArr)) {
                            String f = w01.a ? Utilities.f(l94Var.V.file_reference) : null;
                            TLRPC.InputFileLocation inputFileLocation2 = l94Var.V;
                            ya4Var.a.file_reference = bArr;
                            inputFileLocation2.file_reference = bArr;
                            r8 = w01.a ? Utilities.f(bArr) : null;
                            str = f;
                            l94Var.A0 = false;
                            if (w01.a) {
                            }
                            l94Var.q(-1);
                            return true;
                        }
                    }
                }
                return true;
            }
            TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_editMessage) obj).media;
            if (!(inputMedia5 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto9 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                    if (!z || !Arrays.equals(tL_inputMediaPhoto9.id.file_reference, bArr)) {
                        tL_inputMediaPhoto9.id.file_reference = bArr;
                    }
                }
                gl.d3(new Runnable(this) { // from class: va4
                    public final /* synthetic */ ab4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b4;
                        ya4 ya4Var2 = ya4Var;
                        ab4 ab4Var = this.b;
                        switch (b5) {
                            case 0:
                                z3a sendMessagesHelper = ab4Var.getSendMessagesHelper();
                                Object[] objArr6 = ya4Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                k27 k27Var = (k27) objArr6[1];
                                String str2 = (String) objArr6[2];
                                k3a k3aVar = (k3a) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = ya4Var2.b;
                                sendMessagesHelper.N(tLObject, k27Var, str2, k3aVar, booleanValue, (k3a) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                z3a sendMessagesHelper2 = ab4Var.getSendMessagesHelper();
                                Object[] objArr8 = ya4Var2.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                k27 k27Var2 = (k27) objArr8[1];
                                String str3 = (String) objArr8[2];
                                k3a k3aVar2 = (k3a) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = ya4Var2.b;
                                sendMessagesHelper2.N(tLObject2, k27Var2, str3, k3aVar2, booleanValue2, (k3a) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                z3a sendMessagesHelper3 = ab4Var.getSendMessagesHelper();
                                Object[] objArr10 = ya4Var2.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                k27 k27Var3 = (k27) objArr10[1];
                                String str4 = (String) objArr10[2];
                                k3a k3aVar3 = (k3a) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = ya4Var2.b;
                                sendMessagesHelper3.N(tLObject3, k27Var3, str4, k3aVar3, booleanValue3, (k3a) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                z3a sendMessagesHelper4 = ab4Var.getSendMessagesHelper();
                                Object[] objArr12 = ya4Var2.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                k27 k27Var4 = (k27) objArr12[1];
                                String str5 = (String) objArr12[2];
                                k3a k3aVar4 = (k3a) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = ya4Var2.b;
                                sendMessagesHelper4.N(tLObject4, k27Var4, str5, k3aVar4, booleanValue4, (k3a) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia5;
            if (!z || !Arrays.equals(tL_inputMediaDocument7.id.file_reference, bArr)) {
                tL_inputMediaDocument7.id.file_reference = bArr;
                gl.d3(new Runnable(this) { // from class: va4
                    public final /* synthetic */ ab4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b4;
                        ya4 ya4Var2 = ya4Var;
                        ab4 ab4Var = this.b;
                        switch (b5) {
                            case 0:
                                z3a sendMessagesHelper = ab4Var.getSendMessagesHelper();
                                Object[] objArr6 = ya4Var2.b;
                                TLObject tLObject = (TLObject) objArr6[0];
                                k27 k27Var = (k27) objArr6[1];
                                String str2 = (String) objArr6[2];
                                k3a k3aVar = (k3a) objArr6[3];
                                boolean booleanValue = ((Boolean) objArr6[4]).booleanValue();
                                Object[] objArr7 = ya4Var2.b;
                                sendMessagesHelper.N(tLObject, k27Var, str2, k3aVar, booleanValue, (k3a) objArr7[5], null, null, ((Boolean) objArr7[6]).booleanValue());
                                break;
                            case 1:
                                z3a sendMessagesHelper2 = ab4Var.getSendMessagesHelper();
                                Object[] objArr8 = ya4Var2.b;
                                TLObject tLObject2 = (TLObject) objArr8[0];
                                k27 k27Var2 = (k27) objArr8[1];
                                String str3 = (String) objArr8[2];
                                k3a k3aVar2 = (k3a) objArr8[3];
                                boolean booleanValue2 = ((Boolean) objArr8[4]).booleanValue();
                                Object[] objArr9 = ya4Var2.b;
                                sendMessagesHelper2.N(tLObject2, k27Var2, str3, k3aVar2, booleanValue2, (k3a) objArr9[5], null, null, ((Boolean) objArr9[6]).booleanValue());
                                break;
                            case 2:
                                z3a sendMessagesHelper3 = ab4Var.getSendMessagesHelper();
                                Object[] objArr10 = ya4Var2.b;
                                TLObject tLObject3 = (TLObject) objArr10[0];
                                k27 k27Var3 = (k27) objArr10[1];
                                String str4 = (String) objArr10[2];
                                k3a k3aVar3 = (k3a) objArr10[3];
                                boolean booleanValue3 = ((Boolean) objArr10[4]).booleanValue();
                                Object[] objArr11 = ya4Var2.b;
                                sendMessagesHelper3.N(tLObject3, k27Var3, str4, k3aVar3, booleanValue3, (k3a) objArr11[5], null, null, ((Boolean) objArr11[6]).booleanValue());
                                break;
                            default:
                                z3a sendMessagesHelper4 = ab4Var.getSendMessagesHelper();
                                Object[] objArr12 = ya4Var2.b;
                                TLObject tLObject4 = (TLObject) objArr12[0];
                                k27 k27Var4 = (k27) objArr12[1];
                                String str5 = (String) objArr12[2];
                                k3a k3aVar4 = (k3a) objArr12[3];
                                boolean booleanValue4 = ((Boolean) objArr12[4]).booleanValue();
                                Object[] objArr13 = ya4Var2.b;
                                sendMessagesHelper4.N(tLObject4, k27Var4, str5, k3aVar4, booleanValue4, (k3a) objArr13[5], null, null, ((Boolean) objArr13[6]).booleanValue());
                                break;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Object[] objArr, Object obj) {
        Object obj2;
        String o;
        int i;
        String str;
        Object obj3;
        String str2;
        String str3;
        xa4 b;
        String str4;
        String str5;
        String str6;
        final String str7;
        final String str8;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String simpleName;
        if (w01.a) {
            StringBuilder sb = new StringBuilder("start loading request reference parent ");
            if (obj instanceof String) {
                simpleName = (String) obj;
            } else if (obj instanceof TL_stories.StoryItem) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                StringBuilder sb2 = new StringBuilder("story(dialogId=");
                sb2.append(storyItem.dialogId);
                sb2.append(" id=");
                simpleName = de9.l(sb2, storyItem.id, ")");
            } else if (obj instanceof k27) {
                k27 k27Var = (k27) obj;
                simpleName = "message(dialogId=" + k27.B0(k27Var.k) + "messageId" + k27Var.e1() + ")";
            } else {
                simpleName = obj == null ? null : obj.getClass().getSimpleName();
            }
            sb.append(simpleName);
            sb.append(" args = ");
            sb.append(objArr[0]);
            fa4.b(sb.toString());
        }
        Object obj4 = objArr[0];
        if (obj4 instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) obj4;
            ArrayList arrayList = (ArrayList) obj;
            this.d.put(tL_messages_sendMultiMedia, objArr);
            int size = tL_messages_sendMultiMedia.multi_media.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj5 = (TLRPC.TL_inputSingleMedia) tL_messages_sendMultiMedia.multi_media.get(i2);
                Object obj6 = arrayList.get(i2);
                if (obj6 != null) {
                    u(new Object[]{obj5, tL_messages_sendMultiMedia}, obj6);
                }
            }
            return;
        }
        if (obj4 instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj4;
            TLRPC.InputMedia inputMedia = tL_messages_sendMedia.media;
            if ((inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia;
                ArrayList arrayList2 = (ArrayList) obj;
                this.d.put(tL_messages_sendMedia, objArr);
                int size2 = tL_inputMediaPaidMedia.extended_media.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj7 = (TLRPC.InputMedia) tL_inputMediaPaidMedia.extended_media.get(i3);
                    Object obj8 = arrayList2.get(i3);
                    if (obj8 != null) {
                        u(new Object[]{obj7, tL_messages_sendMedia}, obj8);
                    }
                }
                return;
            }
        }
        if (obj4 instanceof TL_ephemeral.TL_sendMessage) {
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj4;
            TLRPC.InputMedia inputMedia2 = tL_sendMessage.media;
            if ((inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                ArrayList arrayList3 = (ArrayList) obj;
                this.d.put(tL_sendMessage, objArr);
                int size3 = tL_inputMediaPaidMedia2.extended_media.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj9 = (TLRPC.InputMedia) tL_inputMediaPaidMedia2.extended_media.get(i4);
                    Object obj10 = arrayList3.get(i4);
                    if (obj10 != null) {
                        u(new Object[]{obj9, tL_sendMessage}, obj10);
                    }
                }
                return;
            }
        }
        Pair p = p(objArr, obj);
        if (p == null) {
            v(objArr);
            return;
        }
        TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) p.first;
        String str9 = (String) p.second;
        if (obj instanceof k27) {
            k27 k27Var2 = (k27) obj;
            if (k27Var2.L1() < 0 && (message = k27Var2.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                obj2 = webPage;
                o = o(obj2);
                if (o != null) {
                    v(objArr);
                    return;
                }
                ya4 ya4Var = new ya4();
                ya4Var.b = objArr;
                ya4Var.a = inputFileLocation;
                ya4Var.c = str9;
                ArrayList arrayList4 = (ArrayList) this.a.get(str9);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    this.a.put(str9, arrayList4);
                    i = 1;
                } else {
                    i = 0;
                }
                arrayList4.add(ya4Var);
                ArrayList arrayList5 = (ArrayList) this.b.get(o);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    this.b.put(o, arrayList5);
                    i++;
                }
                arrayList5.add(ya4Var);
                if (i != 2) {
                    return;
                }
                boolean z = obj2 instanceof String;
                if (z) {
                    String str10 = (String) obj2;
                    if ("wallpaper".equals(str10)) {
                        str = "wallpaper";
                    } else if (str10.startsWith("gif")) {
                        str = "gif";
                    } else if ("recent".equals(str10)) {
                        str = "recent";
                    } else if ("fav".equals(str10)) {
                        str = "fav";
                    } else if ("update".equals(str10)) {
                        str = "update";
                    } else if ("speech_model".equals(str10)) {
                        str = "speech_model";
                    }
                    HashMap hashMap = this.c;
                    obj3 = obj2;
                    if (Math.abs(SystemClock.elapsedRealtime() - this.e) >= 600000) {
                        str2 = o;
                        str3 = str9;
                    } else {
                        this.e = SystemClock.elapsedRealtime();
                        ArrayList arrayList6 = null;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            String str11 = o;
                            String str12 = str9;
                            if (Math.abs(System.currentTimeMillis() - ((xa4) entry.getValue()).b) >= 60000) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add((String) entry.getKey());
                            }
                            str9 = str12;
                            o = str11;
                        }
                        str2 = o;
                        str3 = str9;
                        if (arrayList6 != null) {
                            int size4 = arrayList6.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                hashMap.remove(arrayList6.get(i5));
                            }
                        }
                    }
                    b = b(str);
                    if (b == null) {
                        TLObject tLObject = b.a;
                        str4 = "recent";
                        str5 = "gif";
                        str6 = "wallpaper";
                        str7 = str3;
                        str8 = str2;
                        if (s(str7, str8, tLObject, null, false, true)) {
                            return;
                        } else {
                            this.c.remove(str7);
                        }
                    } else {
                        str4 = "recent";
                        str5 = "gif";
                        str6 = "wallpaper";
                        str7 = str3;
                        str8 = str2;
                        xa4 b2 = b(str8);
                        if (b2 != null) {
                            if (s(str7, str8, b2.a, null, false, true)) {
                                return;
                            } else {
                                this.c.remove(str8);
                            }
                        }
                    }
                    final byte b3 = 17;
                    if (!(obj3 instanceof q1b)) {
                        q1b q1bVar = (q1b) obj3;
                        s1b s1bVar = q1bVar.a;
                        if (s1bVar == null) {
                            v(objArr);
                            return;
                        }
                        r1b r1bVar = new r1b(s1bVar, q1bVar, new ht(this, str7, str8, b3), (byte) 0);
                        if (s1bVar.F != 0) {
                            ConnectionsManager.getInstance(s1bVar.c).cancelRequest(s1bVar.F, true);
                            s1bVar.F = 0;
                        }
                        s1bVar.C = false;
                        s1bVar.D = false;
                        s1bVar.H(r1bVar);
                        return;
                    }
                    if (obj3 instanceof TL_stories.StoryItem) {
                        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                        tL_stories_getStoriesByID.peer = getMessagesController().h1(storyItem2.dialogId);
                        tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem2.id));
                        final byte b4 = 7;
                        getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b4) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof TLRPC.TL_help_premiumPromo) {
                        getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b3) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof TLRPC.TL_availableReaction) {
                        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
                        tL_messages_getAvailableReactions.hash = 0;
                        final byte b5 = 18;
                        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b5) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof TL_bots.BotInfo) {
                        TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                        tL_users_getFullUser.id = getMessagesController().m1(((TL_bots.BotInfo) obj3).user_id);
                        final byte b6 = 19;
                        getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b6) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof TLRPC.TL_attachMenuBot) {
                        TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                        tL_messages_getAttachMenuBot.bot = getMessagesController().m1(((TLRPC.TL_attachMenuBot) obj3).bot_id);
                        final byte b7 = 20;
                        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b7) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof k27) {
                        k27 k27Var3 = (k27) obj3;
                        long v0 = k27.v0(k27Var3.k);
                        TLRPC.InputPeer h1 = getMessagesController().h1(k27.B0(k27Var3.k));
                        if (k27Var3.r1) {
                            TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                            tL_messages_getScheduledMessages.peer = getMessagesController().h1(k27.B0(k27Var3.k));
                            tL_messages_getScheduledMessages.id.add(Integer.valueOf(k27Var3.L1()));
                            final byte b8 = 21;
                            getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b8) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if (k27.a4(k27Var3.k)) {
                            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                            tL_messages_getQuickReplyMessages.shortcut_id = k27.I1(k27Var3.k);
                            tL_messages_getQuickReplyMessages.flags |= 1;
                            tL_messages_getQuickReplyMessages.id.add(Integer.valueOf(k27Var3.L1()));
                            final byte b9 = 22;
                            getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b9) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        TLRPC.Message message2 = k27Var3.k;
                        if (message2 != null && message2.rich_message != null) {
                            TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                            getrichmessage.peer = h1;
                            getrichmessage.id = k27Var3.L1();
                            final byte b10 = 23;
                            getConnectionsManager().sendRequest(getrichmessage, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b10) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if (v0 == 0) {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.id.add(Integer.valueOf(k27Var3.L1()));
                            final byte b11 = 0;
                            getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b11) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = getMessagesController().f1(v0);
                        tL_channels_getMessages.id.add(Integer.valueOf(k27Var3.L1()));
                        final byte b12 = 24;
                        getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b12) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                        TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                        tL_inputWallPaper.id = tL_wallPaper.id;
                        tL_inputWallPaper.access_hash = tL_wallPaper.access_hash;
                        getwallpaper.wallpaper = tL_inputWallPaper;
                        final byte b13 = 1;
                        getConnectionsManager().sendRequest(getwallpaper, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b13) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof TLRPC.TL_theme) {
                        TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj3;
                        TL_account.getTheme gettheme = new TL_account.getTheme();
                        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                        tL_inputTheme.id = tL_theme.id;
                        tL_inputTheme.access_hash = tL_theme.access_hash;
                        gettheme.theme = tL_inputTheme;
                        gettheme.format = "android";
                        final byte b14 = 2;
                        getConnectionsManager().sendRequest(gettheme, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b14) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    final byte b15 = 3;
                    if (obj3 instanceof TLRPC.WebPage) {
                        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                        tL_messages_getWebPage.url = ((TLRPC.WebPage) obj3).url;
                        tL_messages_getWebPage.hash = 0;
                        getConnectionsManager().sendRequest(tL_messages_getWebPage, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b15) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof TLRPC.User) {
                        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                        tL_users_getUsers.id.add(getMessagesController().o1((TLRPC.User) obj3));
                        final byte b16 = 4;
                        getConnectionsManager().sendRequest(tL_users_getUsers, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b16) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (obj3 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        if (chat instanceof TLRPC.TL_chat) {
                            TLRPC.TL_messages_getChats tL_messages_getChats = new TLRPC.TL_messages_getChats();
                            tL_messages_getChats.id.add(Long.valueOf(chat.id));
                            final byte b17 = 5;
                            getConnectionsManager().sendRequest(tL_messages_getChats, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b17) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if ((chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_community)) {
                            TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                            tL_channels_getChannels.id.add(na7.g1(chat));
                            final byte b18 = 6;
                            getConnectionsManager().sendRequest(tL_channels_getChannels, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b18) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!z) {
                        if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) obj3).set;
                            tL_inputStickerSetID.id = stickerSet.id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            final byte b19 = 14;
                            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b19) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if (!(obj3 instanceof TLRPC.StickerSetCovered)) {
                            if (!(obj3 instanceof TLRPC.InputStickerSet)) {
                                v(objArr);
                                return;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet2 = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet2.stickerset = (TLRPC.InputStickerSet) obj3;
                            final byte b20 = 16;
                            getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b20) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet3 = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_messages_getStickerSet3.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) obj3).set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        final byte b21 = 15;
                        getConnectionsManager().sendRequest(tL_messages_getStickerSet3, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b21) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    String str13 = (String) obj3;
                    if (str6.equals(str13)) {
                        if (this.f.isEmpty()) {
                            final byte b22 = 0;
                            getConnectionsManager().sendRequest(new TL_account.getWallPapers(), new RequestDelegate(this) { // from class: qa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    byte b23 = b22;
                                    ab4 ab4Var = this.b;
                                    switch (b23) {
                                        case 0:
                                            ab4Var.a(ab4Var.f, tLObject2, tL_error);
                                            break;
                                        case 1:
                                            ab4Var.a(ab4Var.h, tLObject2, tL_error);
                                            break;
                                        case 2:
                                            ab4Var.a(ab4Var.n, tLObject2, tL_error);
                                            break;
                                        default:
                                            ab4Var.a(ab4Var.r, tLObject2, tL_error);
                                            break;
                                    }
                                }
                            });
                        }
                        this.f.add(new za4(str7, str8));
                        return;
                    }
                    if (str13.startsWith(str5)) {
                        if (this.h.isEmpty()) {
                            final byte b23 = 1;
                            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSavedGifs(), new RequestDelegate(this) { // from class: qa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    byte b232 = b23;
                                    ab4 ab4Var = this.b;
                                    switch (b232) {
                                        case 0:
                                            ab4Var.a(ab4Var.f, tLObject2, tL_error);
                                            break;
                                        case 1:
                                            ab4Var.a(ab4Var.h, tLObject2, tL_error);
                                            break;
                                        case 2:
                                            ab4Var.a(ab4Var.n, tLObject2, tL_error);
                                            break;
                                        default:
                                            ab4Var.a(ab4Var.r, tLObject2, tL_error);
                                            break;
                                    }
                                }
                            });
                        }
                        this.h.add(new za4(str7, str8));
                        return;
                    }
                    if (str4.equals(str13)) {
                        if (this.n.isEmpty()) {
                            final byte b24 = 2;
                            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getRecentStickers(), new RequestDelegate(this) { // from class: qa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    byte b232 = b24;
                                    ab4 ab4Var = this.b;
                                    switch (b232) {
                                        case 0:
                                            ab4Var.a(ab4Var.f, tLObject2, tL_error);
                                            break;
                                        case 1:
                                            ab4Var.a(ab4Var.h, tLObject2, tL_error);
                                            break;
                                        case 2:
                                            ab4Var.a(ab4Var.n, tLObject2, tL_error);
                                            break;
                                        default:
                                            ab4Var.a(ab4Var.r, tLObject2, tL_error);
                                            break;
                                    }
                                }
                            });
                        }
                        this.n.add(new za4(str7, str8));
                        return;
                    }
                    if ("fav".equals(str13)) {
                        if (this.r.isEmpty()) {
                            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getFavedStickers(), new RequestDelegate(this) { // from class: qa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    byte b232 = b15;
                                    ab4 ab4Var = this.b;
                                    switch (b232) {
                                        case 0:
                                            ab4Var.a(ab4Var.f, tLObject2, tL_error);
                                            break;
                                        case 1:
                                            ab4Var.a(ab4Var.h, tLObject2, tL_error);
                                            break;
                                        case 2:
                                            ab4Var.a(ab4Var.n, tLObject2, tL_error);
                                            break;
                                        default:
                                            ab4Var.a(ab4Var.r, tLObject2, tL_error);
                                            break;
                                    }
                                }
                            });
                        }
                        this.r.add(new za4(str7, str8));
                        return;
                    }
                    if ("update".equals(str13)) {
                        TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                        try {
                            tL_help_getAppUpdate.source = a.b.getPackageManager().getInstallerPackageName(a.b.getPackageName());
                        } catch (Exception unused) {
                        }
                        if (tL_help_getAppUpdate.source == null) {
                            tL_help_getAppUpdate.source = "";
                        }
                        final byte b25 = 8;
                        getConnectionsManager().sendRequest(tL_help_getAppUpdate, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b25) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if ("speech_model".equals(str13)) {
                        TLRPC.TL_messages_getTranscriptionModels tL_messages_getTranscriptionModels = new TLRPC.TL_messages_getTranscriptionModels();
                        tL_messages_getTranscriptionModels.version = DictationAsr.h0();
                        final byte b26 = 9;
                        getConnectionsManager().sendRequest(tL_messages_getTranscriptionModels, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b26) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (!str13.startsWith("avatar_")) {
                        if (!str13.startsWith("sent_")) {
                            v(objArr);
                            return;
                        }
                        String[] split = str13.split("_");
                        if (split.length < 3) {
                            v(objArr);
                            return;
                        }
                        Long A = Utilities.A(split[1]);
                        if (A.longValue() == 0) {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.id.add(Utilities.z(split[2]));
                            final byte b27 = 13;
                            getConnectionsManager().sendRequest(tL_messages_getMessages2, new RequestDelegate(this) { // from class: pa4
                                public final /* synthetic */ ab4 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (b27) {
                                        case 0:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 1:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 2:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 3:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 4:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 5:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 6:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 7:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 8:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 9:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 10:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 11:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 12:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 13:
                                            this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                            break;
                                        case 14:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 15:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 16:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 17:
                                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                            boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                            ab4 ab4Var = this.b;
                                            if (z2) {
                                                ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                            }
                                            ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 18:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 19:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 20:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 21:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 22:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        case 23:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                        default:
                                            this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        TLRPC.TL_channels_getMessages tL_channels_getMessages2 = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages2.channel = na7.g1(getMessagesController().K0(A));
                        tL_channels_getMessages2.id.add(Utilities.z(split[2]));
                        final byte b28 = 12;
                        getConnectionsManager().sendRequest(tL_channels_getMessages2, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b28) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    Long A2 = Utilities.A(str13);
                    long longValue = A2.longValue();
                    if (longValue > 0) {
                        TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                        tL_photos_getUserPhotos.limit = 80;
                        tL_photos_getUserPhotos.offset = 0;
                        tL_photos_getUserPhotos.max_id = 0L;
                        na7 messagesController = getMessagesController();
                        tL_photos_getUserPhotos.user_id = messagesController.o1(messagesController.V1(A2));
                        final byte b29 = 10;
                        getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) { // from class: pa4
                            public final /* synthetic */ ab4 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                switch (b29) {
                                    case 0:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 1:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 2:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 3:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 4:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 5:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 6:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 7:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 8:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 9:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 10:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 11:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 12:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 13:
                                        this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                        break;
                                    case 14:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 15:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 16:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 17:
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                        ab4 ab4Var = this.b;
                                        if (z2) {
                                            ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                        }
                                        ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 18:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 19:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 20:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 21:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 22:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    case 23:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                        break;
                                    default:
                                        this.b.s(str7, str8, tLObject2, tL_error, true, false);
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
                    tL_messages_search.peer = getMessagesController().h1(longValue);
                    final byte b30 = 11;
                    getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) { // from class: pa4
                        public final /* synthetic */ ab4 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                            switch (b30) {
                                case 0:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 1:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 2:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 3:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 4:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 5:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 6:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 7:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 8:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 9:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 10:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 11:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 12:
                                    this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                    break;
                                case 13:
                                    this.b.s(str7, str8, tLObject2, tL_error, false, false);
                                    break;
                                case 14:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 15:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 16:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 17:
                                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                    boolean z2 = tLObject2 instanceof TLRPC.TL_help_premiumPromo;
                                    ab4 ab4Var = this.b;
                                    if (z2) {
                                        ab4Var.getMediaDataController().x1((TLRPC.TL_help_premiumPromo) tLObject2, currentTimeMillis, false);
                                    }
                                    ab4Var.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 18:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 19:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 20:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 21:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 22:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                case 23:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                                default:
                                    this.b.s(str7, str8, tLObject2, tL_error, true, false);
                                    break;
                            }
                        }
                    });
                    return;
                }
                str = str9;
                HashMap hashMap2 = this.c;
                obj3 = obj2;
                if (Math.abs(SystemClock.elapsedRealtime() - this.e) >= 600000) {
                }
                b = b(str);
                if (b == null) {
                }
                final byte b32 = 17;
                if (!(obj3 instanceof q1b)) {
                }
            }
        }
        obj2 = obj;
        o = o(obj2);
        if (o != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaPoll) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaPoll) == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(final Object[] objArr) {
        boolean z;
        final byte b = 0;
        Object obj = objArr[0];
        boolean z2 = obj instanceof TLRPC.TL_inputSingleMedia;
        final byte b2 = 1;
        HashMap hashMap = this.d;
        if (z2) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) objArr[1];
            Object[] objArr2 = (Object[]) hashMap.get(tL_messages_sendMultiMedia);
            if (objArr2 != null) {
                hashMap.remove(tL_messages_sendMultiMedia);
                gl.d3(new sa4(this, tL_messages_sendMultiMedia, objArr2, b2));
                return;
            }
            return;
        }
        boolean z3 = obj instanceof TLRPC.TL_inputMediaDocument;
        if (z3 || (obj instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj2 = objArr[1];
            if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj2;
                Object[] objArr3 = (Object[]) hashMap.get(tL_messages_sendMedia);
                if (objArr3 != null) {
                    hashMap.remove(tL_messages_sendMedia);
                    gl.d3(new ta4(this, tL_messages_sendMedia, objArr3, b2));
                    return;
                }
                return;
            }
        }
        if (z3 || (obj instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj3 = objArr[1];
            if (obj3 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj3;
                Object[] objArr4 = (Object[]) hashMap.get(tL_sendMessage);
                if (objArr4 != null) {
                    hashMap.remove(tL_sendMessage);
                    gl.d3(new ua4(this, tL_sendMessage, objArr4, b2));
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
        boolean z4 = obj instanceof TLRPC.TL_messages_editMessage;
        if (!z4 && !((z = obj instanceof TLRPC.TL_messages_addPollAnswer))) {
            if (obj instanceof TL_ephemeral.TL_sendMessage) {
                TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) obj).media;
                if (!(inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia)) {
                }
            }
            if (!z4 && !z) {
                if ((obj instanceof TLRPC.TL_messages_saveGif) || (obj instanceof TLRPC.TL_messages_saveRecentSticker) || (obj instanceof TLRPC.TL_stickers_addStickerToSet) || (obj instanceof TLRPC.TL_messages_faveSticker)) {
                    return;
                }
                if (obj instanceof TLRPC.TL_messages_getAttachedStickers) {
                    getConnectionsManager().sendRequest((TLRPC.TL_messages_getAttachedStickers) obj, (RequestDelegate) objArr[1]);
                    return;
                }
                Object obj4 = objArr[1];
                if (obj4 instanceof l94) {
                    l94 l94Var = (l94) obj4;
                    l94Var.A0 = false;
                    fa4.d("debug_loading: " + l94Var.L0.getName() + " reference can't update: fail operation ");
                    l94Var.h(0, false);
                    return;
                }
                return;
            }
            gl.d3(new Runnable(this) { // from class: wa4
                public final /* synthetic */ ab4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    Object[] objArr5 = objArr;
                    ab4 ab4Var = this.b;
                    switch (b3) {
                        case 0:
                            ab4Var.getSendMessagesHelper().N((TLObject) objArr5[0], (k27) objArr5[1], (String) objArr5[2], (k3a) objArr5[3], ((Boolean) objArr5[4]).booleanValue(), (k3a) objArr5[5], null, null, ((Boolean) objArr5[6]).booleanValue());
                            break;
                        default:
                            ab4Var.getSendMessagesHelper().N((TLObject) objArr5[0], (k27) objArr5[1], (String) objArr5[2], (k3a) objArr5[3], ((Boolean) objArr5[4]).booleanValue(), (k3a) objArr5[5], null, null, ((Boolean) objArr5[6]).booleanValue());
                            break;
                    }
                }
            });
            return;
        }
        gl.d3(new Runnable(this) { // from class: wa4
            public final /* synthetic */ ab4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                Object[] objArr5 = objArr;
                ab4 ab4Var = this.b;
                switch (b3) {
                    case 0:
                        ab4Var.getSendMessagesHelper().N((TLObject) objArr5[0], (k27) objArr5[1], (String) objArr5[2], (k3a) objArr5[3], ((Boolean) objArr5[4]).booleanValue(), (k3a) objArr5[5], null, null, ((Boolean) objArr5[6]).booleanValue());
                        break;
                    default:
                        ab4Var.getSendMessagesHelper().N((TLObject) objArr5[0], (k27) objArr5[1], (String) objArr5[2], (k3a) objArr5[3], ((Boolean) objArr5[4]).booleanValue(), (k3a) objArr5[5], null, null, ((Boolean) objArr5[6]).booleanValue());
                        break;
                }
            }
        });
    }
}

package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.SendMessagesHelper;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class FileRefController extends BaseController {
    private static volatile FileRefController[] Instance = new FileRefController[4];
    private ArrayList<Waiter> favStickersWaiter;
    private long lastCleanupTime;
    private HashMap<String, ArrayList<Requester>> locationRequester;
    private HashMap<TLObject, Object[]> multiMediaCache;
    private HashMap<String, ArrayList<Requester>> parentRequester;
    private ArrayList<Waiter> recentStickersWaiter;
    private HashMap<String, CachedResult> responseCache;
    private ArrayList<Waiter> savedGifsWaiters;
    private ArrayList<Waiter> wallpaperWaiters;

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class CachedResult {
        private long firstQueryTime;
        private TLObject response;

        private CachedResult() {
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class Requester {
        private Object[] args;
        private boolean completed;
        private TLRPC.InputFileLocation location;
        private String locationKey;

        private Requester() {
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class Waiter {
        private String locationKey;
        private String parentKey;

        public Waiter(String str, String str2) {
            this.locationKey = str;
            this.parentKey = str2;
        }
    }

    public FileRefController(int i10) {
        super(i10);
        this.locationRequester = new HashMap<>();
        this.parentRequester = new HashMap<>();
        this.responseCache = new HashMap<>();
        this.multiMediaCache = new HashMap<>();
        this.lastCleanupTime = SystemClock.elapsedRealtime();
        this.wallpaperWaiters = new ArrayList<>();
        this.savedGifsWaiters = new ArrayList<>();
        this.recentStickersWaiter = new ArrayList<>();
        this.favStickersWaiter = new ArrayList<>();
    }

    private void broadcastWaitersData(ArrayList<Waiter> arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Waiter waiter = arrayList.get(i10);
            onRequestComplete(waiter.locationKey, waiter.parentKey, tLObject, tL_error, i10 == size + (-1), false);
            i10++;
        }
        arrayList.clear();
    }

    private void cleanupCache() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastCleanupTime) < 600000) {
            return;
        }
        this.lastCleanupTime = SystemClock.elapsedRealtime();
        ArrayList arrayList = null;
        for (Map.Entry<String, CachedResult> entry : this.responseCache.entrySet()) {
            if (Math.abs(System.currentTimeMillis() - entry.getValue().firstQueryTime) >= 60000) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(entry.getKey());
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.responseCache.remove(arrayList.get(i10));
            }
        }
    }

    private CachedResult getCachedResponse(String str) {
        CachedResult cachedResult = this.responseCache.get(str);
        if (cachedResult == null || Math.abs(System.currentTimeMillis() - cachedResult.firstQueryTime) < 60000) {
            return cachedResult;
        }
        this.responseCache.remove(str);
        return null;
    }

    public static int getFileRefErrorIndex(String str) {
        if (str != null && str.startsWith("FILE_REFERENCE_") && str.endsWith("_EXPIRED")) {
            try {
                return Integer.parseInt(str.substring(15, str.length() - 8));
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    private byte[] getFileReference(TLRPC.Document document, ArrayList<TLRPC.Document> arrayList, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (document != null && inputFileLocation != null) {
            int i10 = 0;
            if (!(inputFileLocation instanceof TLRPC.TL_inputDocumentFileLocation)) {
                int size = document.thumbs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i11);
                    byte[] fileReference = getFileReference(photoSize, inputFileLocation, zArr);
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
                    if (fileReference != null) {
                        return fileReference;
                    }
                }
            } else if (document.id == inputFileLocation.id) {
                return document.file_reference;
            }
            if (arrayList != null) {
                while (i10 < arrayList.size()) {
                    TLRPC.InputFileLocation inputFileLocation2 = inputFileLocation;
                    boolean[] zArr2 = zArr;
                    TLRPC.InputFileLocation[] inputFileLocationArr2 = inputFileLocationArr;
                    byte[] fileReference2 = getFileReference(arrayList.get(i10), null, inputFileLocation2, zArr2, inputFileLocationArr2);
                    if (fileReference2 != null) {
                        return fileReference2;
                    }
                    i10++;
                    inputFileLocation = inputFileLocation2;
                    zArr = zArr2;
                    inputFileLocationArr = inputFileLocationArr2;
                }
            }
        }
        return null;
    }

    private byte[] getFileReferenceForMediaImpl(TLRPC.MessageMedia messageMedia, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.InputFileLocation inputFileLocation2;
        boolean[] zArr2;
        TLRPC.InputFileLocation[] inputFileLocationArr2;
        TLRPC.Photo photo;
        byte[] bArr = null;
        if (messageMedia == null) {
            return null;
        }
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            inputFileLocation2 = inputFileLocation;
            zArr2 = zArr;
            inputFileLocationArr2 = inputFileLocationArr;
            bArr = getFileReference(document, messageMedia.alt_documents, inputFileLocation2, zArr2, inputFileLocationArr2);
        } else {
            inputFileLocation2 = inputFileLocation;
            zArr2 = zArr;
            inputFileLocationArr2 = inputFileLocationArr;
            TLRPC.TL_game tL_game = messageMedia.game;
            if (tL_game != null) {
                bArr = getFileReference(tL_game.document, null, inputFileLocation2, zArr2, inputFileLocationArr2);
                if (bArr == null) {
                    bArr = getFileReference(messageMedia.game.photo, inputFileLocation2, zArr2, inputFileLocationArr2);
                }
            } else {
                TLRPC.Photo photo2 = messageMedia.photo;
                if (photo2 != null) {
                    bArr = getFileReference(photo2, inputFileLocation2, zArr2, inputFileLocationArr2);
                } else {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (webPage != null) {
                        bArr = getFileReference(webPage, inputFileLocation2, zArr2, inputFileLocationArr2);
                    }
                }
            }
        }
        return (bArr != null || (photo = messageMedia.video_cover) == null) ? bArr : getFileReference(photo, inputFileLocation2, zArr2, inputFileLocationArr2);
    }

    private byte[] getFileReferenceForPoll(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        ArrayList<TLRPC.PollAnswer> arrayList;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia;
        if (tL_messageMediaPoll == null) {
            return null;
        }
        byte[] fileReferenceForMediaImpl = getFileReferenceForMediaImpl(tL_messageMediaPoll.attached_media, inputFileLocation, zArr, inputFileLocationArr);
        if (fileReferenceForMediaImpl == null && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia = pollResults.solution_media) != null) {
            fileReferenceForMediaImpl = getFileReferenceForMediaImpl(messageMedia, inputFileLocation, zArr, inputFileLocationArr);
        }
        if (fileReferenceForMediaImpl == null && (arrayList = tL_messageMediaPoll.poll.answers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i10);
                i10++;
                fileReferenceForMediaImpl = getFileReferenceForMediaImpl(pollAnswer.media, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReferenceForMediaImpl != null) {
                    break;
                }
            }
        }
        return fileReferenceForMediaImpl;
    }

    private byte[] getFileReferenceForRichMessage(TL_iv.RichMessage richMessage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] bArr = null;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Photo photo = arrayList.get(i11);
            i11++;
            bArr = getFileReference(photo, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                return bArr;
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            TLRPC.Document document = arrayList2.get(i10);
            i10++;
            TLRPC.InputFileLocation inputFileLocation2 = inputFileLocation;
            boolean[] zArr2 = zArr;
            TLRPC.InputFileLocation[] inputFileLocationArr2 = inputFileLocationArr;
            bArr = getFileReference(document, null, inputFileLocation2, zArr2, inputFileLocationArr2);
            if (bArr != null) {
                return bArr;
            }
            inputFileLocation = inputFileLocation2;
            zArr = zArr2;
            inputFileLocationArr = inputFileLocationArr2;
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x058a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Pair<byte[], TLRPC.InputFileLocation> getFileReferenceFromResponse(TLRPC.InputFileLocation inputFileLocation, String str, String str2, TLObject tLObject, Object... objArr) {
        TLRPC.InputFileLocation[] inputFileLocationArr;
        boolean[] zArr;
        TLObject tLObject2;
        byte[] bArr;
        FileRefController fileRefController;
        TLRPC.InputFileLocation[] inputFileLocationArr2;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        byte[] fileReference;
        TLRPC.InputFileLocation[] inputFileLocationArr3;
        boolean[] zArr2;
        FileRefController fileRefController2;
        byte[] fileReference2;
        TLRPC.InputFileLocation[] inputFileLocationArr4;
        TLRPC.InputFileLocation inputFileLocation2;
        TLRPC.InputFileLocation inputFileLocation3;
        TLRPC.InputFileLocation inputFileLocation4 = null;
        if ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
            inputFileLocationArr = new TLRPC.InputFileLocation[1];
            zArr = new boolean[1];
        } else {
            inputFileLocationArr = null;
            zArr = null;
        }
        if (str2 != null) {
            tLObject2 = tLObject;
            Pair<byte[], TLRPC.InputFileLocation> fileReferenceFromResponse = getFileReferenceFromResponse(inputFileLocation, str, null, tLObject2, objArr);
            if (fileReferenceFromResponse != null) {
                bArr = (byte[]) fileReferenceFromResponse.first;
                Object obj = fileReferenceFromResponse.second;
                if (obj != null && inputFileLocationArr != null) {
                    inputFileLocationArr[0] = (TLRPC.InputFileLocation) obj;
                }
                if (tLObject2 instanceof nh.c6) {
                    fileRefController = this;
                    TLRPC.InputFileLocation inputFileLocation5 = inputFileLocation;
                    inputFileLocationArr2 = inputFileLocationArr;
                    boolean[] zArr3 = zArr;
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        if (!messages_messages.messages.isEmpty()) {
                            int size = messages_messages.messages.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                TLRPC.Message message = messages_messages.messages.get(i10);
                                TLRPC.MessageMedia messageMedia3 = message.media;
                                if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                    for (int i11 = 0; i11 < tL_messageMediaPaidMedia.extended_media.size(); i11++) {
                                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i11);
                                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                            bArr = fileRefController.getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, inputFileLocation5, zArr3, inputFileLocationArr2);
                                        }
                                        if (bArr != null) {
                                            break;
                                        }
                                    }
                                } else {
                                    TL_iv.RichMessage richMessage = message.rich_message;
                                    if (richMessage != null) {
                                        bArr = fileRefController.getFileReferenceForRichMessage(richMessage, inputFileLocation5, zArr3, inputFileLocationArr2);
                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                        bArr = fileRefController.getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia3, inputFileLocation5, zArr3, inputFileLocationArr2);
                                    } else if (messageMedia3 != null) {
                                        bArr = fileRefController.getFileReferenceForMediaImpl(messageMedia3, inputFileLocation5, zArr3, inputFileLocationArr2);
                                    } else {
                                        TLRPC.MessageAction messageAction = message.action;
                                        if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                            bArr = fileRefController.getFileReference(messageAction.photo, inputFileLocation5, zArr3, inputFileLocationArr2);
                                        }
                                    }
                                }
                            }
                            if (bArr == null) {
                                fileRefController.getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(0), messages_messages.users, messages_messages.chats, true);
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("file ref not found in messages, replacing message");
                                }
                            }
                        } else if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("empty messages, file ref not found");
                        }
                    } else {
                        if (!(tLObject2 instanceof TLRPC.TL_help_premiumPromo)) {
                            if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                getMediaDataController().processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
                                ArrayList<TLRPC.TL_availableReaction> arrayList = tL_messages_availableReactions.reactions;
                                int size2 = arrayList.size();
                                int i12 = 0;
                                while (i12 < size2) {
                                    int i13 = i12 + 1;
                                    TLRPC.TL_availableReaction tL_availableReaction = arrayList.get(i12);
                                    boolean[] zArr4 = zArr3;
                                    fileReference = getFileReference(tL_availableReaction.static_icon, null, inputFileLocation, zArr4, inputFileLocationArr2);
                                    if (fileReference == null && (fileReference = getFileReference(tL_availableReaction.appear_animation, null, inputFileLocation, zArr4, inputFileLocationArr2)) == null && (fileReference = getFileReference(tL_availableReaction.select_animation, null, inputFileLocation, zArr4, inputFileLocationArr2)) == null && (fileReference = getFileReference(tL_availableReaction.activate_animation, null, inputFileLocation, zArr4, inputFileLocationArr2)) == null && (fileReference = getFileReference(tL_availableReaction.effect_animation, null, inputFileLocation, zArr4, inputFileLocationArr2)) == null && (fileReference = getFileReference(tL_availableReaction.around_animation, null, inputFileLocation, zArr4, inputFileLocationArr2)) == null) {
                                        fileReference = getFileReference(tL_availableReaction.center_icon, null, inputFileLocation, zArr4, inputFileLocationArr2);
                                        zArr3 = zArr4;
                                        if (fileReference == null) {
                                            bArr = fileReference;
                                            i12 = i13;
                                        }
                                    }
                                    bArr = fileReference;
                                    break;
                                }
                            }
                            if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                                TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                                getMessagesController().putUsers(tL_users_userFull.users, false);
                                getMessagesController().putChats(tL_users_userFull.chats, false);
                                TLRPC.UserFull userFull = tL_users_userFull.full_user;
                                TL_bots.BotInfo botInfo = userFull.bot_info;
                                if (botInfo != null) {
                                    getMessagesStorage().updateUserInfo(userFull, true);
                                    if (bArr == null) {
                                        inputFileLocation2 = inputFileLocation;
                                        byte[] fileReference3 = getFileReference(botInfo.description_document, null, inputFileLocation2, zArr3, inputFileLocationArr2);
                                        fileRefController = this;
                                        zArr3 = zArr3;
                                        bArr = fileReference3;
                                    } else {
                                        fileRefController = this;
                                        inputFileLocation2 = inputFileLocation;
                                    }
                                    if (bArr == null) {
                                        bArr = fileRefController.getFileReference(botInfo.description_photo, inputFileLocation2, zArr3, inputFileLocationArr2);
                                    }
                                }
                                fileRefController = this;
                            } else {
                                FileRefController fileRefController3 = this;
                                TLRPC.InputFileLocation inputFileLocation6 = inputFileLocation;
                                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                                    ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2 = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot.icons;
                                    int size3 = arrayList2.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        int i15 = i14 + 1;
                                        TLRPC.Document document2 = arrayList2.get(i14).icon;
                                        boolean[] zArr5 = zArr3;
                                        fileReference = fileRefController3.getFileReference(document2, null, inputFileLocation6, zArr5, inputFileLocationArr2);
                                        zArr3 = zArr5;
                                        if (fileReference != null) {
                                            bArr = fileReference;
                                            break;
                                        }
                                        inputFileLocation6 = inputFileLocation;
                                        bArr = fileReference;
                                        i14 = i15;
                                        fileRefController3 = this;
                                    }
                                } else if (tLObject2 instanceof TLRPC.TL_help_appUpdate) {
                                    TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject2;
                                    try {
                                        SharedConfig.pendingAppUpdate = tL_help_appUpdate;
                                        SharedConfig.saveConfig();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    try {
                                        TLRPC.Document document3 = tL_help_appUpdate.document;
                                        if (document3 != null) {
                                            bArr = document3.file_reference;
                                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                                            TLRPC.Document document4 = tL_help_appUpdate.document;
                                            tL_inputDocumentFileLocation.id = document4.id;
                                            tL_inputDocumentFileLocation.access_hash = document4.access_hash;
                                            tL_inputDocumentFileLocation.file_reference = document4.file_reference;
                                            tL_inputDocumentFileLocation.thumb_size = "";
                                            inputFileLocationArr4 = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                                        } else {
                                            inputFileLocationArr4 = inputFileLocationArr2;
                                        }
                                        inputFileLocationArr2 = inputFileLocationArr4;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        bArr = null;
                                    }
                                    if (bArr == null) {
                                        zArr2 = zArr3;
                                        bArr = getFileReference(tL_help_appUpdate.document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                                    } else {
                                        zArr2 = zArr3;
                                    }
                                    if (bArr == null) {
                                        fileRefController2 = this;
                                        fileReference2 = fileRefController2.getFileReference(tL_help_appUpdate.sticker, null, inputFileLocation, zArr2, inputFileLocationArr2);
                                        fileRefController = fileRefController2;
                                        bArr = fileReference2;
                                    }
                                    fileRefController = this;
                                } else {
                                    fileRefController = this;
                                    TLRPC.InputFileLocation inputFileLocation7 = inputFileLocation;
                                    if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                                        TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                                        fileRefController.getMessagesController().putChats(tL_messages_webPage.chats, false);
                                        fileRefController.getMessagesController().putUsers(tL_messages_webPage.users, false);
                                        bArr = fileRefController.getFileReference(tL_messages_webPage.webpage, inputFileLocation7, zArr3, inputFileLocationArr2);
                                    } else if (tLObject2 instanceof TLRPC.WebPage) {
                                        bArr = fileRefController.getFileReference((TLRPC.WebPage) tLObject2, inputFileLocation7, zArr3, inputFileLocationArr2);
                                    } else if (tLObject2 instanceof TL_account.TL_wallPapers) {
                                        TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject2;
                                        int size4 = tL_wallPapers.wallpapers.size();
                                        int i16 = 0;
                                        while (i16 < size4) {
                                            boolean[] zArr6 = zArr3;
                                            fileReference = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i16).document, null, inputFileLocation7, zArr6, inputFileLocationArr2);
                                            zArr3 = zArr6;
                                            if (fileReference != null) {
                                                bArr = fileReference;
                                                break;
                                            }
                                            i16++;
                                            inputFileLocation7 = inputFileLocation;
                                            bArr = fileReference;
                                            fileRefController = this;
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                        bArr = getFileReference(((TLRPC.TL_wallPaper) tLObject2).document, null, inputFileLocation, zArr3, inputFileLocationArr2);
                                    } else if (tLObject2 instanceof TLRPC.TL_theme) {
                                        inputFileLocationArr3 = inputFileLocationArr2;
                                        bArr = getFileReference(((TLRPC.TL_theme) tLObject2).document, null, inputFileLocation, zArr3, inputFileLocationArr2);
                                    } else {
                                        fileRefController = this;
                                        TLRPC.InputFileLocation inputFileLocation8 = inputFileLocation;
                                        if (tLObject2 instanceof Vector) {
                                            Vector vector = (Vector) tLObject2;
                                            if (!vector.objects.isEmpty()) {
                                                int size5 = vector.objects.size();
                                                for (int i17 = 0; i17 < size5; i17++) {
                                                    Object obj2 = vector.objects.get(i17);
                                                    if (obj2 instanceof TLRPC.User) {
                                                        bArr = fileRefController.getFileReference((TLRPC.User) obj2, inputFileLocation8, zArr3, inputFileLocationArr2);
                                                    } else if (obj2 instanceof TLRPC.Chat) {
                                                        bArr = fileRefController.getFileReference((TLRPC.Chat) obj2, inputFileLocation8, zArr3, inputFileLocationArr2);
                                                    }
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                int size6 = tL_messages_chats.chats.size();
                                                for (int i18 = 0; i18 < size6; i18++) {
                                                    bArr = fileRefController.getFileReference(tL_messages_chats.chats.get(i18), inputFileLocation8, zArr3, inputFileLocationArr2);
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                                            TLRPC.TL_messages_savedGifs tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                                            int size7 = tL_messages_savedGifs.gifs.size();
                                            int i19 = 0;
                                            while (i19 < size7) {
                                                boolean[] zArr7 = zArr3;
                                                fileReference = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i19), null, inputFileLocation8, zArr7, inputFileLocationArr2);
                                                zArr3 = zArr7;
                                                if (fileReference != null) {
                                                    bArr = fileReference;
                                                    break;
                                                }
                                                i19++;
                                                inputFileLocation8 = inputFileLocation;
                                                bArr = fileReference;
                                                fileRefController = this;
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                            if (bArr == null) {
                                                int size8 = tL_messages_stickerSet.documents.size();
                                                int i20 = 0;
                                                while (i20 < size8) {
                                                    boolean[] zArr8 = zArr3;
                                                    fileReference = getFileReference(tL_messages_stickerSet.documents.get(i20), null, inputFileLocation, zArr8, inputFileLocationArr2);
                                                    zArr3 = zArr8;
                                                    if (fileReference != null) {
                                                        bArr = fileReference;
                                                        break;
                                                    }
                                                    i20++;
                                                    bArr = fileReference;
                                                }
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                                            TLRPC.TL_messages_recentStickers tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                                            int size9 = tL_messages_recentStickers.stickers.size();
                                            int i21 = 0;
                                            while (i21 < size9) {
                                                boolean[] zArr9 = zArr3;
                                                fileReference = getFileReference(tL_messages_recentStickers.stickers.get(i21), null, inputFileLocation, zArr9, inputFileLocationArr2);
                                                zArr3 = zArr9;
                                                if (fileReference != null) {
                                                    bArr = fileReference;
                                                    break;
                                                }
                                                i21++;
                                                bArr = fileReference;
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                                            TLRPC.TL_messages_favedStickers tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                                            int size10 = tL_messages_favedStickers.stickers.size();
                                            int i22 = 0;
                                            while (i22 < size10) {
                                                boolean[] zArr10 = zArr3;
                                                byte[] fileReference4 = getFileReference(tL_messages_favedStickers.stickers.get(i22), null, inputFileLocation, zArr10, inputFileLocationArr2);
                                                if (fileReference4 != null) {
                                                    bArr = fileReference4;
                                                    break;
                                                }
                                                i22++;
                                                bArr = fileReference4;
                                                zArr3 = zArr10;
                                            }
                                        } else {
                                            FileRefController fileRefController4 = this;
                                            if (tLObject2 instanceof TLRPC.photos_Photos) {
                                                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject2;
                                                int size11 = photos_photos.photos.size();
                                                for (int i23 = 0; i23 < size11; i23++) {
                                                    bArr = fileRefController4.getFileReference(photos_photos.photos.get(i23), inputFileLocation, zArr3, inputFileLocationArr2);
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                }
                                            } else if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                                                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                                                if (tL_stories_stories.stories.isEmpty() || (messageMedia = (storyItem = tL_stories_stories.stories.get(0)).media) == null) {
                                                    storyItem = null;
                                                } else {
                                                    if (bArr == null && (photo2 = messageMedia.photo) != null) {
                                                        bArr = fileRefController4.getFileReference(photo2, inputFileLocation, zArr3, inputFileLocationArr2);
                                                    }
                                                    if (bArr == null && (photo = storyItem.media.video_cover) != null) {
                                                        bArr = fileRefController4.getFileReference(photo, inputFileLocation, zArr3, inputFileLocationArr2);
                                                    }
                                                    if (bArr == null && (document = (messageMedia2 = storyItem.media).document) != null) {
                                                        byte[] fileReference5 = fileRefController4.getFileReference(document, messageMedia2.alt_documents, inputFileLocation, zArr3, inputFileLocationArr2);
                                                        fileRefController4 = fileRefController4;
                                                        bArr = fileReference5;
                                                    }
                                                }
                                                Object obj3 = objArr[1];
                                                if (obj3 instanceof FileLoadOperation) {
                                                    Object obj4 = ((FileLoadOperation) obj3).parentObject;
                                                    if (obj4 instanceof TL_stories.StoryItem) {
                                                        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj4;
                                                        if (storyItem == null) {
                                                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                                            tL_updateStory.peer = fileRefController4.getMessagesController().getPeer(storyItem2.dialogId);
                                                            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                                            tL_updateStory.story = tL_storyItemDeleted;
                                                            tL_storyItemDeleted.id = storyItem2.id;
                                                            ArrayList<TLRPC.Update> arrayList3 = new ArrayList<>();
                                                            arrayList3.add(tL_updateStory);
                                                            fileRefController4.getMessagesController().processUpdateArray(arrayList3, null, null, false, 0);
                                                        } else {
                                                            TLRPC.User user = fileRefController4.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                                            if (user != null && user.contact) {
                                                                MessagesController.getInstance(fileRefController4.currentAccount).getStoriesController().k.k(storyItem2.dialogId, storyItem);
                                                            }
                                                        }
                                                        if (storyItem != null && bArr == null) {
                                                            TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                                                            tL_updateStory2.peer = MessagesController.getInstance(fileRefController4.currentAccount).getPeer(storyItem2.dialogId);
                                                            tL_updateStory2.story = storyItem;
                                                            ArrayList<TLRPC.Update> arrayList4 = new ArrayList<>();
                                                            arrayList4.add(tL_updateStory2);
                                                            MessagesController.getInstance(fileRefController4.currentAccount).processUpdateArray(arrayList4, null, null, false, 0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (bArr == null) {
                                return null;
                            }
                            if (inputFileLocationArr3 != null && (inputFileLocation3 = inputFileLocationArr3[0]) != null) {
                                inputFileLocation4 = inputFileLocation3;
                            }
                            return new Pair<>(bArr, inputFileLocation4);
                        }
                        ArrayList<TLRPC.Document> arrayList5 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                        int size12 = arrayList5.size();
                        int i24 = 0;
                        while (i24 < size12) {
                            int i25 = i24 + 1;
                            TLRPC.Document document5 = arrayList5.get(i24);
                            boolean[] zArr11 = zArr3;
                            fileReference = fileRefController.getFileReference(document5, null, inputFileLocation5, zArr11, inputFileLocationArr2);
                            zArr3 = zArr11;
                            if (fileReference != null) {
                                bArr = fileReference;
                                break;
                            }
                            inputFileLocation5 = inputFileLocation;
                            bArr = fileReference;
                            i24 = i25;
                            fileRefController = this;
                        }
                    }
                } else {
                    TLRPC.MessageMedia messageMedia4 = ((nh.c6) tLObject2).media;
                    TLRPC.Document document6 = messageMedia4.document;
                    if (document6 != null) {
                        fileRefController2 = this;
                        inputFileLocationArr2 = inputFileLocationArr;
                        fileReference2 = fileRefController2.getFileReference(document6, messageMedia4.alt_documents, inputFileLocation, zArr, inputFileLocationArr2);
                        fileRefController = fileRefController2;
                        bArr = fileReference2;
                    } else {
                        fileRefController = this;
                        inputFileLocationArr2 = inputFileLocationArr;
                        boolean[] zArr12 = zArr;
                        TLRPC.Photo photo3 = messageMedia4.photo;
                        if (photo3 != null) {
                            bArr = fileRefController.getFileReference(photo3, inputFileLocation, zArr12, inputFileLocationArr2);
                        }
                    }
                }
                inputFileLocationArr3 = inputFileLocationArr2;
                if (bArr == null) {
                }
            }
        } else {
            tLObject2 = tLObject;
        }
        bArr = null;
        if (tLObject2 instanceof nh.c6) {
        }
        inputFileLocationArr3 = inputFileLocationArr2;
        if (bArr == null) {
        }
    }

    public static FileRefController getInstance(int i10) {
        FileRefController fileRefController;
        FileRefController fileRefController2 = Instance[i10];
        if (fileRefController2 != null) {
            return fileRefController2;
        }
        synchronized (FileRefController.class) {
            try {
                fileRefController = Instance[i10];
                if (fileRefController == null) {
                    FileRefController[] fileRefControllerArr = Instance;
                    FileRefController fileRefController3 = new FileRefController(i10);
                    fileRefControllerArr[i10] = fileRefController3;
                    fileRefController = fileRefController3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fileRefController;
    }

    public static String getKeyForParentObject(Object obj) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (obj instanceof nh.c6) {
            nh.c6 c6Var = (nh.c6) obj;
            if (c6Var.a == null) {
                FileLog.d("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC.MessageMedia messageMedia = c6Var.media;
            if (messageMedia.document != null) {
                return "botstory_doc_" + c6Var.media.document.id;
            }
            if (messageMedia.photo != null) {
                return "botstory_photo_" + c6Var.media.photo.id;
            }
            return "botstory_" + c6Var.id;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            if (storyItem.dialogId == 0) {
                FileLog.d("failed request reference can't find dialogId");
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
            return android.support.v4.media.a.n(((TLRPC.TL_attachMenuBot) obj).bot_id, "attach_menu_bot_");
        }
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            if (messageObject.type == 29 && (message = messageObject.messageOwner) != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                channelId = DialogObject.getPeerDialogId(peer);
            }
            return "message" + messageObject.getRealId() + "_" + channelId + "_" + messageObject.scheduled + "_" + messageObject.getQuickReplyId();
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

    private String getObjectString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            StringBuilder sb = new StringBuilder("story(dialogId=");
            sb.append(storyItem.dialogId);
            sb.append(" id=");
            return android.support.v4.media.a.m(storyItem.id, ")", sb);
        }
        if (!(obj instanceof MessageObject)) {
            if (obj == null) {
                return null;
            }
            return obj.getClass().getSimpleName();
        }
        MessageObject messageObject = (MessageObject) obj;
        return "message(dialogId=" + messageObject.getDialogId() + "messageId" + messageObject.getId() + ")";
    }

    private boolean getPeerReferenceReplacement(TLRPC.User user, TLRPC.Chat chat, boolean z4, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation[] inputFileLocationArr, boolean[] zArr) {
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
        tL_inputPeerPhotoFileLocation.big = z4;
        if (user == null) {
            if (!ChatObject.isChannel(chat)) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = chat.id;
            } else if (chat.access_hash != 0 || chat.fromMessageDialogId == 0 || chat.fromMessageId == 0) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.access_hash = chat.access_hash;
            } else {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.peer = getMessagesController().getInputPeer(chat.fromMessageDialogId);
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
            inputPeer.peer = getMessagesController().getInputPeer(user.fromMessageDialogId);
            inputPeer.msg_id = user.fromMessageId;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        }
        tL_inputPeerPhotoFileLocation.peer = inputPeer;
        inputFileLocationArr[0] = tL_inputPeerPhotoFileLocation;
        return true;
    }

    public static boolean isFileRefError(String str) {
        if ("FILEREF_EXPIRED".equals(str) || "FILE_REFERENCE_EXPIRED".equals(str) || "FILE_REFERENCE_EMPTY".equals(str)) {
            return true;
        }
        return str != null && str.startsWith("FILE_REFERENCE_");
    }

    public static boolean isFileRefErrorCover(String str) {
        return str != null && isFileRefError(str) && str.endsWith("COVER_EXPIRED");
    }

    private boolean isSameReference(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onRequestComplete$46(TLRPC.TL_theme tL_theme) {
        TLRPC.Document document;
        ArrayList arrayList = org.telegram.ui.ActionBar.j6.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_theme tL_theme2 = ((org.telegram.ui.ActionBar.i6) arrayList.get(i10)).C;
            if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                TLRPC.Document document2 = tL_theme2.document;
                if (document2 == null || (document = tL_theme.document) == null) {
                    return;
                }
                document2.file_reference = document.file_reference;
                org.telegram.ui.ActionBar.j6.s1(true, false);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestComplete$47(TLRPC.User user) {
        getMessagesController().putUser(user, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestComplete$48(TLRPC.Chat chat) {
        getMessagesController().putChat(chat, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestComplete$49(TLRPC.Chat chat) {
        getMessagesController().putChat(chat, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestComplete$50(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        getMediaDataController().replaceStickerSet(tL_messages_stickerSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$30(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_messages_sendMultiMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$31(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_messages_sendMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$32(TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_sendMessage, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$33(Requester requester) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$34(Requester requester) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$35(Requester requester) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$36(Requester requester) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$0(String str, String str2, nh.c6 c6Var) {
        onRequestComplete(str, str2, c6Var, null, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$1(String str, String str2, nh.c6 c6Var) {
        Utilities.stageQueue.postRunnable(new sk(this, str, str2, c6Var, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$10(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$11(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$12(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$13(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$14(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$15(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$16(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$17(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        broadcastWaitersData(this.wallpaperWaiters, tLObject, tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        broadcastWaitersData(this.savedGifsWaiters, tLObject, tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$2(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$20(TLObject tLObject, TLRPC.TL_error tL_error) {
        broadcastWaitersData(this.recentStickersWaiter, tLObject, tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        broadcastWaitersData(this.favStickersWaiter, tLObject, tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$22(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$23(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$24(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$25(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$26(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$27(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$28(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$29(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$3(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            getMediaDataController().processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
        }
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$4(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$5(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$6(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$7(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$8(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$9(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendErrorToObject$41(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_messages_sendMultiMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendErrorToObject$42(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_messages_sendMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendErrorToObject$43(TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_sendMessage, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendErrorToObject$44(Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) objArr[0], (MessageObject) objArr[1], (String) objArr[2], (SendMessagesHelper.DelayedMessage) objArr[3], ((Boolean) objArr[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) objArr[5], null, null, ((Boolean) objArr[6]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendErrorToObject$45(Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) objArr[0], (MessageObject) objArr[1], (String) objArr[2], (SendMessagesHelper.DelayedMessage) objArr[3], ((Boolean) objArr[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) objArr[5], null, null, ((Boolean) objArr[6]).booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x08a6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onRequestComplete(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error, boolean z4, boolean z10) {
        String str3;
        String str4;
        TLRPC.TL_error tL_error2;
        TLObject tLObject2;
        boolean z11;
        ArrayList<Requester> arrayList;
        Requester requester;
        boolean[] zArr;
        boolean[] zArr2;
        Requester requester2;
        TL_stories.StoryItem storyItem;
        byte[] bArr;
        byte[] bArr2;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        Object obj;
        Vector vector;
        int i10;
        int i11;
        int i12;
        byte[] fileReference;
        int i13;
        int i14;
        byte[] fileReference2;
        ArrayList<Requester> arrayList2;
        TLObject tLObject3;
        final FileRefController fileRefController = this;
        TLObject tLObject4 = tLObject;
        boolean z12 = tLObject4 instanceof TLRPC.TL_help_premiumPromo;
        if (z12) {
            str4 = "premium_promo";
        } else if (tLObject4 instanceof TL_account.TL_wallPapers) {
            str4 = "wallpaper";
        } else if (tLObject4 instanceof TLRPC.TL_messages_savedGifs) {
            str4 = "gif";
        } else if (tLObject4 instanceof TLRPC.TL_messages_recentStickers) {
            str4 = "recent";
        } else {
            if (!(tLObject4 instanceof TLRPC.TL_messages_favedStickers)) {
                str3 = str2;
                int i15 = 1;
                if (str2 != null || (arrayList2 = fileRefController.parentRequester.get(str2)) == null) {
                    tL_error2 = tL_error;
                    tLObject2 = tLObject4;
                    z11 = false;
                } else {
                    int size = arrayList2.size();
                    int i16 = 0;
                    z11 = false;
                    while (i16 < size) {
                        Requester requester3 = arrayList2.get(i16);
                        if (requester3.completed) {
                            tLObject3 = tLObject4;
                        } else {
                            tLObject3 = tLObject4;
                            if (fileRefController.onRequestComplete(requester3.locationKey, null, tLObject4, tL_error, z4 && !z11, z10)) {
                                z11 = true;
                            }
                        }
                        i16++;
                        tLObject4 = tLObject3;
                    }
                    tL_error2 = tL_error;
                    tLObject2 = tLObject4;
                    if (z11) {
                        fileRefController.putReponseToCache(str3, tLObject2);
                    }
                    fileRefController.parentRequester.remove(str2);
                }
                arrayList = fileRefController.locationRequester.get(str);
                if (arrayList != null) {
                    return z11;
                }
                int size2 = arrayList.size();
                boolean[] zArr3 = null;
                TLRPC.InputFileLocation[] inputFileLocationArr = null;
                byte[] bArr3 = null;
                int i17 = 0;
                while (i17 < size2) {
                    Requester requester4 = arrayList.get(i17);
                    if (requester4.completed) {
                        i12 = i15;
                    } else {
                        if (tL_error2 != null && BuildVars.LOGS_ENABLED && requester4.args.length > i15 && (requester4.args[i15] instanceof FileLoadOperation)) {
                            FileLog.e("debug_loading: " + ((FileLoadOperation) requester4.args[i15]).getCacheFileFinal().getName() + " can't update file reference: " + tL_error2.code + " " + tL_error2.text);
                        }
                        if ((requester4.location instanceof TLRPC.TL_inputFileLocation) || (requester4.location instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
                            inputFileLocationArr = new TLRPC.InputFileLocation[i15];
                            zArr3 = new boolean[i15];
                        }
                        TLRPC.InputFileLocation[] inputFileLocationArr2 = inputFileLocationArr;
                        boolean[] zArr4 = zArr3;
                        requester4.completed = i15;
                        if (tLObject2 instanceof nh.c6) {
                            TLRPC.MessageMedia messageMedia2 = ((nh.c6) tLObject2).media;
                            requester = requester4;
                            zArr = zArr4;
                            TLRPC.Document document3 = messageMedia2.document;
                            if (document3 != null) {
                                bArr3 = fileRefController.getFileReference(document3, messageMedia2.alt_documents, requester.location, zArr, inputFileLocationArr2);
                            } else {
                                TLRPC.Photo photo3 = messageMedia2.photo;
                                if (photo3 != null) {
                                    bArr3 = fileRefController.getFileReference(photo3, requester.location, zArr, inputFileLocationArr2);
                                }
                            }
                        } else {
                            requester = requester4;
                            zArr = zArr4;
                            if (tLObject2 instanceof TLRPC.messages_Messages) {
                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                if (!messages_messages.messages.isEmpty()) {
                                    int size3 = messages_messages.messages.size();
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= size3) {
                                            break;
                                        }
                                        TLRPC.Message message = messages_messages.messages.get(i18);
                                        TLRPC.MessageMedia messageMedia3 = message.media;
                                        int i19 = size3;
                                        if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                            i14 = i18;
                                            int i20 = 0;
                                            while (i20 < tL_messageMediaPaidMedia.extended_media.size()) {
                                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i20);
                                                int i21 = i20;
                                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                                    bArr3 = fileRefController.getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, requester.location, zArr, inputFileLocationArr2);
                                                }
                                                if (bArr3 != null) {
                                                    break;
                                                }
                                                i20 = i21 + 1;
                                            }
                                        } else {
                                            i14 = i18;
                                            TL_iv.RichMessage richMessage = message.rich_message;
                                            if (richMessage != null) {
                                                fileReference2 = fileRefController.getFileReferenceForRichMessage(richMessage, requester.location, zArr, inputFileLocationArr2);
                                            } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                                fileReference2 = fileRefController.getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia3, requester.location, zArr, inputFileLocationArr2);
                                            } else if (messageMedia3 != null) {
                                                fileReference2 = fileRefController.getFileReferenceForMediaImpl(messageMedia3, requester.location, zArr, inputFileLocationArr2);
                                            } else {
                                                TLRPC.MessageAction messageAction = message.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                                    fileReference2 = fileRefController.getFileReference(messageAction.photo, requester.location, zArr, inputFileLocationArr2);
                                                }
                                            }
                                            bArr3 = fileReference2;
                                        }
                                        if (bArr3 == null) {
                                            i18 = i14 + 1;
                                            fileRefController = this;
                                            size3 = i19;
                                        } else if (z4) {
                                            i13 = 0;
                                            fileRefController.getMessagesStorage().replaceMessageIfExists(message, messages_messages.users, messages_messages.chats, false);
                                        }
                                    }
                                    i13 = 0;
                                    if (bArr3 == null) {
                                        getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(i13), messages_messages.users, messages_messages.chats, true);
                                        if (BuildVars.DEBUG_VERSION) {
                                            FileLog.d("file ref not found in messages, replacing message");
                                        }
                                    }
                                } else if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("empty messages, file ref not found");
                                }
                            } else if (z12) {
                                ArrayList<TLRPC.Document> arrayList3 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                                int size4 = arrayList3.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    int i23 = i22 + 1;
                                    bArr3 = getFileReference(arrayList3.get(i22), null, requester.location, zArr, inputFileLocationArr2);
                                    if (bArr3 != null) {
                                        break;
                                    }
                                    i22 = i23;
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                boolean[] zArr5 = zArr;
                                getMediaDataController().processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
                                ArrayList<TLRPC.TL_availableReaction> arrayList4 = tL_messages_availableReactions.reactions;
                                int size5 = arrayList4.size();
                                bArr3 = bArr3;
                                int i24 = 0;
                                while (true) {
                                    if (i24 >= size5) {
                                        zArr = zArr5;
                                        break;
                                    }
                                    int i25 = i24 + 1;
                                    TLRPC.TL_availableReaction tL_availableReaction = arrayList4.get(i24);
                                    ArrayList<TLRPC.TL_availableReaction> arrayList5 = arrayList4;
                                    zArr = zArr5;
                                    int i26 = size5;
                                    fileReference = getFileReference(tL_availableReaction.static_icon, null, requester.location, zArr, inputFileLocationArr2);
                                    if (fileReference == null && (fileReference = getFileReference(tL_availableReaction.appear_animation, null, requester.location, zArr, inputFileLocationArr2)) == null && (fileReference = getFileReference(tL_availableReaction.select_animation, null, requester.location, zArr, inputFileLocationArr2)) == null && (fileReference = getFileReference(tL_availableReaction.activate_animation, null, requester.location, zArr, inputFileLocationArr2)) == null && (fileReference = getFileReference(tL_availableReaction.effect_animation, null, requester.location, zArr, inputFileLocationArr2)) == null && (fileReference = getFileReference(tL_availableReaction.around_animation, null, requester.location, zArr, inputFileLocationArr2)) == null) {
                                        bArr3 = getFileReference(tL_availableReaction.center_icon, null, requester.location, zArr, inputFileLocationArr2);
                                        if (bArr3 != null) {
                                            break;
                                        }
                                        size5 = i26;
                                        i24 = i25;
                                        arrayList4 = arrayList5;
                                        zArr5 = zArr;
                                    }
                                }
                                bArr3 = fileReference;
                            } else {
                                byte[] bArr4 = bArr3;
                                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                                    getMessagesController().putUsers(tL_users_userFull.users, false);
                                    getMessagesController().putChats(tL_users_userFull.chats, false);
                                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                                    TL_bots.BotInfo botInfo = userFull.bot_info;
                                    if (botInfo != null) {
                                        getMessagesStorage().updateUserInfo(userFull, true);
                                        fileRefController = this;
                                        bArr3 = fileRefController.getFileReference(botInfo.description_document, null, requester.location, zArr, inputFileLocationArr2);
                                        if (bArr3 != null) {
                                            zArr3 = zArr;
                                            inputFileLocationArr = inputFileLocationArr2;
                                            i12 = 1;
                                        } else {
                                            bArr3 = fileRefController.getFileReference(botInfo.description_photo, requester.location, zArr, inputFileLocationArr2);
                                        }
                                    } else {
                                        fileRefController = this;
                                        bArr3 = bArr4;
                                    }
                                } else {
                                    FileRefController fileRefController2 = this;
                                    if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                                        TLRPC.TL_attachMenuBot tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot;
                                        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList6 = tL_attachMenuBot.icons;
                                        int size6 = arrayList6.size();
                                        byte[] bArr5 = bArr4;
                                        int i27 = 0;
                                        while (i27 < size6) {
                                            int i28 = i27 + 1;
                                            int i29 = size6;
                                            bArr5 = fileRefController2.getFileReference(arrayList6.get(i27).icon, null, requester.location, zArr, inputFileLocationArr2);
                                            if (bArr5 != null) {
                                                break;
                                            }
                                            fileRefController2 = this;
                                            i27 = i28;
                                            size6 = i29;
                                        }
                                        if (z4) {
                                            TLRPC.TL_attachMenuBots attachMenuBots = getMediaDataController().getAttachMenuBots();
                                            ArrayList<TLRPC.TL_attachMenuBot> arrayList7 = new ArrayList<>(attachMenuBots.bots);
                                            int i30 = 0;
                                            while (true) {
                                                if (i30 >= arrayList7.size()) {
                                                    bArr4 = bArr5;
                                                    zArr2 = zArr;
                                                    break;
                                                }
                                                bArr4 = bArr5;
                                                zArr2 = zArr;
                                                if (arrayList7.get(i30).bot_id == tL_attachMenuBot.bot_id) {
                                                    arrayList7.set(i30, tL_attachMenuBot);
                                                    break;
                                                }
                                                i30++;
                                                bArr5 = bArr4;
                                                zArr = zArr2;
                                            }
                                            attachMenuBots.bots = arrayList7;
                                            getMediaDataController().processLoadedMenuBots(attachMenuBots, attachMenuBots.hash, (int) (System.currentTimeMillis() / 1000), false);
                                        } else {
                                            bArr4 = bArr5;
                                            zArr2 = zArr;
                                        }
                                        fileRefController = this;
                                        inputFileLocationArr = inputFileLocationArr2;
                                        requester2 = requester;
                                    } else if (tLObject2 instanceof TLRPC.TL_help_appUpdate) {
                                        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject2;
                                        try {
                                            SharedConfig.pendingAppUpdate = tL_help_appUpdate;
                                            SharedConfig.saveConfig();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        try {
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        try {
                                            TLRPC.Document document4 = tL_help_appUpdate.document;
                                            if (document4 != null) {
                                                bArr3 = document4.file_reference;
                                                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                                                TLRPC.Document document5 = tL_help_appUpdate.document;
                                                tL_inputDocumentFileLocation.id = document5.id;
                                                tL_inputDocumentFileLocation.access_hash = document5.access_hash;
                                                tL_inputDocumentFileLocation.file_reference = document5.file_reference;
                                                tL_inputDocumentFileLocation.thumb_size = "";
                                                inputFileLocationArr2 = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                                            } else {
                                                bArr3 = bArr4;
                                            }
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                            bArr3 = null;
                                        }
                                        if (bArr3 == null) {
                                            zArr = zArr;
                                            bArr3 = getFileReference(tL_help_appUpdate.document, null, requester.location, zArr, inputFileLocationArr2);
                                        } else {
                                            zArr = zArr;
                                        }
                                        if (bArr3 == null) {
                                            fileRefController = this;
                                            bArr3 = fileRefController.getFileReference(tL_help_appUpdate.sticker, null, requester.location, zArr, inputFileLocationArr2);
                                        }
                                    } else {
                                        fileRefController = this;
                                        zArr = zArr;
                                        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                                            fileRefController.getMessagesController().putChats(tL_messages_webPage.chats, false);
                                            fileRefController.getMessagesController().putUsers(tL_messages_webPage.users, false);
                                            bArr3 = fileRefController.getFileReference(tL_messages_webPage.webpage, requester.location, zArr, inputFileLocationArr2);
                                        } else if (tLObject2 instanceof TLRPC.WebPage) {
                                            bArr3 = fileRefController.getFileReference((TLRPC.WebPage) tLObject2, requester.location, zArr, inputFileLocationArr2);
                                        } else if (tLObject2 instanceof TL_account.TL_wallPapers) {
                                            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject2;
                                            int size7 = tL_wallPapers.wallpapers.size();
                                            bArr3 = bArr4;
                                            int i31 = 0;
                                            while (i31 < size7) {
                                                bArr3 = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i31).document, null, requester.location, zArr, inputFileLocationArr2);
                                                if (bArr3 != null) {
                                                    break;
                                                }
                                                i31++;
                                                fileRefController = this;
                                            }
                                            if (bArr3 != null && z4) {
                                                getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                            bArr3 = getFileReference(tL_wallPaper.document, null, requester.location, zArr, inputFileLocationArr2);
                                            if (bArr3 != null && z4) {
                                                ArrayList<TLRPC.WallPaper> arrayList8 = new ArrayList<>();
                                                arrayList8.add(tL_wallPaper);
                                                getMessagesStorage().putWallpapers(arrayList8, 0);
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_theme) {
                                            TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject2;
                                            fileRefController = this;
                                            bArr3 = fileRefController.getFileReference(tL_theme.document, null, requester.location, zArr, inputFileLocationArr2);
                                            if (bArr3 != null && z4) {
                                                AndroidUtilities.runOnUIThread(new e1(tL_theme, 22));
                                            }
                                        } else {
                                            fileRefController = this;
                                            if (tLObject2 instanceof Vector) {
                                                Vector vector2 = (Vector) tLObject2;
                                                if (!vector2.objects.isEmpty()) {
                                                    int size8 = vector2.objects.size();
                                                    bArr3 = bArr4;
                                                    int i32 = 0;
                                                    while (i32 < size8) {
                                                        Object obj2 = vector2.objects.get(i32);
                                                        if (obj2 instanceof TLRPC.User) {
                                                            TLRPC.User user = (TLRPC.User) obj2;
                                                            bArr3 = fileRefController.getFileReference(user, requester.location, zArr, inputFileLocationArr2);
                                                            if (!z4 || bArr3 == null) {
                                                                vector = vector2;
                                                                i10 = size8;
                                                                i11 = i32;
                                                            } else {
                                                                ArrayList arrayList9 = new ArrayList();
                                                                arrayList9.add(user);
                                                                vector = vector2;
                                                                i10 = size8;
                                                                i11 = i32;
                                                                fileRefController.getMessagesStorage().putUsersAndChats(arrayList9, null, true, true);
                                                                AndroidUtilities.runOnUIThread(new d2(10, fileRefController, user));
                                                            }
                                                        } else {
                                                            vector = vector2;
                                                            i10 = size8;
                                                            i11 = i32;
                                                            if (obj2 instanceof TLRPC.Chat) {
                                                                final TLRPC.Chat chat = (TLRPC.Chat) obj2;
                                                                byte[] fileReference3 = fileRefController.getFileReference(chat, requester.location, zArr, inputFileLocationArr2);
                                                                if (z4 && fileReference3 != null) {
                                                                    ArrayList arrayList10 = new ArrayList();
                                                                    arrayList10.add(chat);
                                                                    fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList10, true, true);
                                                                    final int i33 = 0;
                                                                    AndroidUtilities.runOnUIThread(new Runnable(fileRefController) { // from class: org.telegram.messenger.q3
                                                                        public final /* synthetic */ FileRefController b;

                                                                        {
                                                                            this.b = fileRefController;
                                                                        }

                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i33) {
                                                                                case 0:
                                                                                    this.b.lambda$onRequestComplete$48(chat);
                                                                                    break;
                                                                                default:
                                                                                    this.b.lambda$onRequestComplete$49(chat);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                                bArr3 = fileReference3;
                                                            }
                                                        }
                                                        if (bArr3 != null) {
                                                            break;
                                                        }
                                                        i32 = i11 + 1;
                                                        vector2 = vector;
                                                        size8 = i10;
                                                    }
                                                }
                                                bArr3 = bArr4;
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                                TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                                if (tL_messages_chats.chats.isEmpty()) {
                                                    bArr3 = bArr4;
                                                } else {
                                                    int size9 = tL_messages_chats.chats.size();
                                                    bArr3 = bArr4;
                                                    int i34 = 0;
                                                    while (true) {
                                                        if (i34 >= size9) {
                                                            break;
                                                        }
                                                        final TLRPC.Chat chat2 = tL_messages_chats.chats.get(i34);
                                                        byte[] fileReference4 = fileRefController.getFileReference(chat2, requester.location, zArr, inputFileLocationArr2);
                                                        if (fileReference4 != null) {
                                                            if (z4) {
                                                                ArrayList arrayList11 = new ArrayList();
                                                                arrayList11.add(chat2);
                                                                final int i35 = 1;
                                                                obj = null;
                                                                fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList11, true, true);
                                                                AndroidUtilities.runOnUIThread(new Runnable(fileRefController) { // from class: org.telegram.messenger.q3
                                                                    public final /* synthetic */ FileRefController b;

                                                                    {
                                                                        this.b = fileRefController;
                                                                    }

                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i35) {
                                                                            case 0:
                                                                                this.b.lambda$onRequestComplete$48(chat2);
                                                                                break;
                                                                            default:
                                                                                this.b.lambda$onRequestComplete$49(chat2);
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                            } else {
                                                                obj = null;
                                                            }
                                                            bArr3 = fileReference4;
                                                        } else {
                                                            i34++;
                                                            bArr3 = fileReference4;
                                                        }
                                                    }
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                                                TLRPC.TL_messages_savedGifs tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                                                int size10 = tL_messages_savedGifs.gifs.size();
                                                bArr3 = bArr4;
                                                int i36 = 0;
                                                while (i36 < size10) {
                                                    int i37 = size10;
                                                    bArr3 = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i36), null, requester.location, zArr, inputFileLocationArr2);
                                                    if (bArr3 != null) {
                                                        break;
                                                    }
                                                    i36++;
                                                    fileRefController = this;
                                                    size10 = i37;
                                                }
                                                if (z4) {
                                                    getMediaDataController().processLoadedRecentDocuments(0, tL_messages_savedGifs.gifs, true, 0, true);
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                if (bArr4 == null) {
                                                    int size11 = tL_messages_stickerSet.documents.size();
                                                    bArr3 = bArr4;
                                                    int i38 = 0;
                                                    while (true) {
                                                        if (i38 >= size11) {
                                                            fileRefController = this;
                                                            break;
                                                        }
                                                        int i39 = size11;
                                                        fileRefController = this;
                                                        bArr3 = fileRefController.getFileReference(tL_messages_stickerSet.documents.get(i38), null, requester.location, zArr, inputFileLocationArr2);
                                                        if (bArr3 != null) {
                                                            break;
                                                        }
                                                        i38++;
                                                        size11 = i39;
                                                    }
                                                } else {
                                                    fileRefController = this;
                                                    bArr3 = bArr4;
                                                }
                                                if (z4) {
                                                    AndroidUtilities.runOnUIThread(new d2(11, fileRefController, tL_messages_stickerSet));
                                                }
                                            } else {
                                                FileRefController fileRefController3 = this;
                                                if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                                                    TLRPC.TL_messages_recentStickers tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                                                    int size12 = tL_messages_recentStickers.stickers.size();
                                                    bArr3 = bArr4;
                                                    int i40 = 0;
                                                    while (i40 < size12) {
                                                        int i41 = size12;
                                                        bArr3 = fileRefController3.getFileReference(tL_messages_recentStickers.stickers.get(i40), null, requester.location, zArr, inputFileLocationArr2);
                                                        if (bArr3 != null) {
                                                            break;
                                                        }
                                                        i40++;
                                                        fileRefController3 = this;
                                                        size12 = i41;
                                                    }
                                                    if (z4) {
                                                        getMediaDataController().processLoadedRecentDocuments(0, tL_messages_recentStickers.stickers, false, 0, true);
                                                    }
                                                } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                                                    TLRPC.TL_messages_favedStickers tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                                                    int size13 = tL_messages_favedStickers.stickers.size();
                                                    bArr3 = bArr4;
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (i42 >= size13) {
                                                            fileRefController = this;
                                                            break;
                                                        }
                                                        int i43 = size13;
                                                        fileRefController = this;
                                                        bArr3 = fileRefController.getFileReference(tL_messages_favedStickers.stickers.get(i42), null, requester.location, zArr, inputFileLocationArr2);
                                                        if (bArr3 != null) {
                                                            break;
                                                        }
                                                        i42++;
                                                        size13 = i43;
                                                    }
                                                    if (z4) {
                                                        fileRefController.getMediaDataController().processLoadedRecentDocuments(2, tL_messages_favedStickers.stickers, false, 0, true);
                                                    }
                                                } else {
                                                    fileRefController = this;
                                                    if (tLObject2 instanceof TLRPC.photos_Photos) {
                                                        TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject2;
                                                        int size14 = photos_photos.photos.size();
                                                        bArr3 = bArr4;
                                                        for (int i44 = 0; i44 < size14; i44++) {
                                                            bArr3 = fileRefController.getFileReference(photos_photos.photos.get(i44), requester.location, zArr, inputFileLocationArr2);
                                                            if (bArr3 != null) {
                                                                break;
                                                            }
                                                        }
                                                    } else if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                                                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                                                        if (tL_stories_stories.stories.isEmpty()) {
                                                            storyItem = null;
                                                            bArr = bArr4;
                                                        } else {
                                                            TL_stories.StoryItem storyItem2 = tL_stories_stories.stories.get(0);
                                                            bArr = (bArr4 != null || (document2 = storyItem2.music) == null) ? bArr4 : fileRefController.getFileReference(document2, null, requester.location, zArr, inputFileLocationArr2);
                                                            TLRPC.MessageMedia messageMedia4 = storyItem2.media;
                                                            if (messageMedia4 != null) {
                                                                if (bArr == null && (photo2 = messageMedia4.photo) != null) {
                                                                    bArr = fileRefController.getFileReference(photo2, requester.location, zArr, inputFileLocationArr2);
                                                                }
                                                                if (bArr == null && (photo = storyItem2.media.video_cover) != null) {
                                                                    bArr = fileRefController.getFileReference(photo, requester.location, zArr, inputFileLocationArr2);
                                                                }
                                                                if (bArr == null && (document = (messageMedia = storyItem2.media).document) != null) {
                                                                    bArr = fileRefController.getFileReference(document, messageMedia.alt_documents, requester.location, zArr, inputFileLocationArr2);
                                                                }
                                                                storyItem = storyItem2;
                                                            } else {
                                                                storyItem = null;
                                                            }
                                                        }
                                                        if (requester.args[1] instanceof FileLoadOperation) {
                                                            Object obj3 = ((FileLoadOperation) requester.args[1]).parentObject;
                                                            if (obj3 instanceof TL_stories.StoryItem) {
                                                                TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) obj3;
                                                                if (storyItem == null) {
                                                                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                                                    requester2 = requester;
                                                                    tL_updateStory.peer = fileRefController.getMessagesController().getPeer(storyItem3.dialogId);
                                                                    TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                                                    tL_updateStory.story = tL_storyItemDeleted;
                                                                    tL_storyItemDeleted.id = storyItem3.id;
                                                                    ArrayList<TLRPC.Update> arrayList12 = new ArrayList<>();
                                                                    arrayList12.add(tL_updateStory);
                                                                    fileRefController.getMessagesController().processUpdateArray(arrayList12, null, null, false, 0);
                                                                } else {
                                                                    requester2 = requester;
                                                                    TLRPC.User user2 = fileRefController.getMessagesController().getUser(Long.valueOf(storyItem3.dialogId));
                                                                    if (user2 != null && user2.contact) {
                                                                        MessagesController.getInstance(fileRefController.currentAccount).getStoriesController().k.k(storyItem3.dialogId, storyItem);
                                                                    }
                                                                }
                                                                if (storyItem == null || bArr != null) {
                                                                    bArr2 = bArr;
                                                                    zArr2 = zArr;
                                                                } else {
                                                                    TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                                                                    bArr2 = bArr;
                                                                    zArr2 = zArr;
                                                                    tL_updateStory2.peer = MessagesController.getInstance(fileRefController.currentAccount).getPeer(storyItem3.dialogId);
                                                                    tL_updateStory2.story = storyItem;
                                                                    ArrayList<TLRPC.Update> arrayList13 = new ArrayList<>();
                                                                    arrayList13.add(tL_updateStory2);
                                                                    MessagesController.getInstance(fileRefController.currentAccount).processUpdateArray(arrayList13, null, null, false, 0);
                                                                }
                                                                inputFileLocationArr = inputFileLocationArr2;
                                                                bArr3 = bArr2;
                                                                if (bArr3 != null) {
                                                                    i12 = 1;
                                                                    fileRefController.sendErrorToObject(requester2.args, 1);
                                                                } else if (fileRefController.onUpdateObjectReference(requester2, bArr3, inputFileLocationArr != null ? inputFileLocationArr[0] : null, z10)) {
                                                                    zArr3 = zArr2;
                                                                    i12 = 1;
                                                                    z11 = true;
                                                                } else {
                                                                    i12 = 1;
                                                                }
                                                                zArr3 = zArr2;
                                                            }
                                                        }
                                                        zArr2 = zArr;
                                                        requester2 = requester;
                                                        bArr2 = bArr;
                                                        inputFileLocationArr = inputFileLocationArr2;
                                                        bArr3 = bArr2;
                                                        if (bArr3 != null) {
                                                        }
                                                        zArr3 = zArr2;
                                                    } else {
                                                        zArr2 = zArr;
                                                        requester2 = requester;
                                                        inputFileLocationArr = inputFileLocationArr2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    bArr3 = bArr4;
                                    if (bArr3 != null) {
                                    }
                                    zArr3 = zArr2;
                                }
                                i17++;
                                tL_error2 = tL_error;
                                i15 = i12;
                            }
                            fileRefController = this;
                        }
                        zArr2 = zArr;
                        inputFileLocationArr = inputFileLocationArr2;
                        requester2 = requester;
                        if (bArr3 != null) {
                        }
                        zArr3 = zArr2;
                        i17++;
                        tL_error2 = tL_error;
                        i15 = i12;
                    }
                    i17++;
                    tL_error2 = tL_error;
                    i15 = i12;
                }
                fileRefController.locationRequester.remove(str);
                if (z11) {
                    fileRefController.putReponseToCache(str, tLObject2);
                }
                return z11;
            }
            str4 = "fav";
        }
        str3 = str4;
        int i152 = 1;
        if (str2 != null) {
        }
        tL_error2 = tL_error;
        tLObject2 = tLObject4;
        z11 = false;
        arrayList = fileRefController.locationRequester.get(str);
        if (arrayList != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onUpdateObjectReference(final Requester requester, byte[] bArr, TLRPC.InputFileLocation inputFileLocation, boolean z4) {
        String str;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        int indexOf;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int indexOf2;
        int indexOf3;
        if (BuildVars.DEBUG_VERSION) {
            StringBuilder sb = new StringBuilder("fileref updated for ");
            sb.append(requester.args[0]);
            sb.append(" ");
            org.telegram.ui.yh.w(requester.locationKey, sb);
        }
        if (requester.args[0] instanceof TL_stories.TL_storyItem) {
            ((TL_stories.TL_storyItem) requester.args[0]).media.document.file_reference = bArr;
            return true;
        }
        if (requester.args[0] instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) requester.args[1];
            Object[] objArr = this.multiMediaCache.get(tL_messages_sendMultiMedia);
            if (objArr != null) {
                TLRPC.TL_inputSingleMedia tL_inputSingleMedia = (TLRPC.TL_inputSingleMedia) requester.args[0];
                TLRPC.InputMedia inputMedia = tL_inputSingleMedia.media;
                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                    if (!z4 || !isSameReference(tL_inputMediaDocument.id.file_reference, bArr)) {
                        tL_inputMediaDocument.id.file_reference = bArr;
                        indexOf3 = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                        if (indexOf3 >= 0) {
                            ArrayList arrayList = (ArrayList) objArr[3];
                            arrayList.set(indexOf3, null);
                            boolean z10 = true;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (arrayList.get(i10) != null) {
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                                AndroidUtilities.runOnUIThread(new k3(this, tL_messages_sendMultiMedia, objArr, 0));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    if (!z4 || !isSameReference(tL_inputMediaPhoto3.id.file_reference, bArr)) {
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
        if (requester.args.length >= 2 && (requester.args[1] instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) requester.args[1]).media instanceof TLRPC.TL_inputMediaPaidMedia) && ((requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) || (requester.args[0] instanceof TLRPC.TL_inputMediaDocument))) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) requester.args[1];
            Object[] objArr2 = this.multiMediaCache.get(tL_messages_sendMedia);
            if (objArr2 != null) {
                if (requester.args[0] instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) requester.args[0];
                    if (!z4 || !isSameReference(tL_inputMediaDocument2.id.file_reference, bArr)) {
                        tL_inputMediaDocument2.id.file_reference = bArr;
                        tL_inputMediaPhoto2 = tL_inputMediaDocument2;
                        indexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(tL_inputMediaPhoto2);
                        if (indexOf2 >= 0) {
                            ArrayList arrayList2 = (ArrayList) objArr2[3];
                            arrayList2.set(indexOf2, null);
                            boolean z11 = true;
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                if (arrayList2.get(i11) != null) {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                this.multiMediaCache.remove(tL_messages_sendMedia);
                                AndroidUtilities.runOnUIThread(new l3(this, tL_messages_sendMedia, objArr2, 0));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) requester.args[0];
                    if (!z4 || !isSameReference(tL_inputMediaPhoto4.id.file_reference, bArr)) {
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
        if (requester.args.length >= 2 && (requester.args[1] instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) requester.args[1]).media instanceof TLRPC.TL_inputMediaPaidMedia) && ((requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) || (requester.args[0] instanceof TLRPC.TL_inputMediaDocument))) {
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) requester.args[1];
            Object[] objArr3 = this.multiMediaCache.get(tL_sendMessage);
            if (objArr3 != null) {
                if (requester.args[0] instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) requester.args[0];
                    if (!z4 || !isSameReference(tL_inputMediaDocument3.id.file_reference, bArr)) {
                        tL_inputMediaDocument3.id.file_reference = bArr;
                        tL_inputMediaPhoto = tL_inputMediaDocument3;
                        indexOf = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(tL_inputMediaPhoto);
                        if (indexOf >= 0) {
                            ArrayList arrayList3 = (ArrayList) objArr3[3];
                            arrayList3.set(indexOf, null);
                            boolean z12 = true;
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (arrayList3.get(i12) != null) {
                                    z12 = false;
                                }
                            }
                            if (z12) {
                                this.multiMediaCache.remove(tL_sendMessage);
                                AndroidUtilities.runOnUIThread(new m3(this, tL_sendMessage, objArr3, 0));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) requester.args[0];
                    if (!z4 || !isSameReference(tL_inputMediaPhoto5.id.file_reference, bArr)) {
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
        if (requester.args[0] instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) requester.args[0]).media;
            if (!(inputMedia2 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    if (!z4 || !isSameReference(tL_inputMediaPhoto6.id.file_reference, bArr)) {
                        tL_inputMediaPhoto6.id.file_reference = bArr;
                    }
                }
                final int i13 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.n3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                this.b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia2;
            if (!z4 || !isSameReference(tL_inputMediaDocument4.id.file_reference, bArr)) {
                tL_inputMediaDocument4.id.file_reference = bArr;
                final int i132 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.n3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i132) {
                            case 0:
                                this.b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
        } else if (requester.args[0] instanceof TL_ephemeral.TL_sendMessage) {
            TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) requester.args[0]).media;
            if (!(inputMedia3 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                    if (!z4 || !isSameReference(tL_inputMediaPhoto7.id.file_reference, bArr)) {
                        tL_inputMediaPhoto7.id.file_reference = bArr;
                    }
                }
                final int i14 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.n3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia3;
            if (!z4 || !isSameReference(tL_inputMediaDocument5.id.file_reference, bArr)) {
                tL_inputMediaDocument5.id.file_reference = bArr;
                final int i142 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.n3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i142) {
                            case 0:
                                this.b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
        } else if (requester.args[0] instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_editMessage) requester.args[0]).media;
            if (!(inputMedia4 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    if (!z4 || !isSameReference(tL_inputMediaPhoto8.id.file_reference, bArr)) {
                        tL_inputMediaPhoto8.id.file_reference = bArr;
                    }
                }
                final int i15 = 2;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.n3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                this.b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia4;
            if (!z4 || !isSameReference(tL_inputMediaDocument6.id.file_reference, bArr)) {
                tL_inputMediaDocument6.id.file_reference = bArr;
                final int i152 = 2;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.n3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i152) {
                            case 0:
                                this.b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
        } else {
            if ((requester.args[0] instanceof TLRPC.InputPhoto) || (requester.args[0] instanceof TLRPC.InputDocument)) {
                if (requester.args[0] instanceof TLRPC.InputPhoto) {
                    TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) requester.args[0];
                    if (!z4 || !isSameReference(inputPhoto.file_reference, bArr)) {
                        inputPhoto.file_reference = bArr;
                        if (requester.args.length > 1 && (requester.args[1] instanceof Runnable)) {
                            AndroidUtilities.runOnUIThread((Runnable) requester.args[1]);
                        }
                    }
                } else {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) requester.args[0];
                    if (!z4 || !isSameReference(inputDocument.file_reference, bArr)) {
                        inputDocument.file_reference = bArr;
                        if (requester.args.length > 1) {
                            AndroidUtilities.runOnUIThread((Runnable) requester.args[1]);
                        }
                    }
                }
                return true;
            }
            if (requester.args[0] instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_addPollAnswer) requester.args[0]).answer.input_media;
                if (!(inputMedia5 instanceof TLRPC.TL_inputMediaDocument)) {
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto9 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                        if (!z4 || !isSameReference(tL_inputMediaPhoto9.id.file_reference, bArr)) {
                            tL_inputMediaPhoto9.id.file_reference = bArr;
                        }
                    }
                    final int i16 = 3;
                    AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.n3
                        public final /* synthetic */ FileRefController b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    this.b.lambda$onUpdateObjectReference$33(requester);
                                    break;
                                case 1:
                                    this.b.lambda$onUpdateObjectReference$34(requester);
                                    break;
                                case 2:
                                    this.b.lambda$onUpdateObjectReference$35(requester);
                                    break;
                                default:
                                    this.b.lambda$onUpdateObjectReference$36(requester);
                                    break;
                            }
                        }
                    });
                    return true;
                }
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                if (!z4 || !isSameReference(tL_inputMediaDocument7.id.file_reference, bArr)) {
                    tL_inputMediaDocument7.id.file_reference = bArr;
                    final int i162 = 3;
                    AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.n3
                        public final /* synthetic */ FileRefController b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i162) {
                                case 0:
                                    this.b.lambda$onUpdateObjectReference$33(requester);
                                    break;
                                case 1:
                                    this.b.lambda$onUpdateObjectReference$34(requester);
                                    break;
                                case 2:
                                    this.b.lambda$onUpdateObjectReference$35(requester);
                                    break;
                                default:
                                    this.b.lambda$onUpdateObjectReference$36(requester);
                                    break;
                            }
                        }
                    });
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_saveGif) {
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) requester.args[0];
                if (!z4 || !isSameReference(tL_messages_saveGif.id.file_reference, bArr)) {
                    tL_messages_saveGif.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_saveGif, new f5(5));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_saveRecentSticker) {
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) requester.args[0];
                if (!z4 || !isSameReference(tL_messages_saveRecentSticker.id.file_reference, bArr)) {
                    tL_messages_saveRecentSticker.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new f5(6));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_stickers_addStickerToSet) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) requester.args[0];
                if (!z4 || !isSameReference(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                    tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_stickers_addStickerToSet, new f5(7));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_faveSticker) {
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) requester.args[0];
                if (!z4 || !isSameReference(tL_messages_faveSticker.id.file_reference, bArr)) {
                    tL_messages_faveSticker.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new f5(4));
                    return true;
                }
            } else {
                if (!(requester.args[0] instanceof TLRPC.TL_messages_getAttachedStickers)) {
                    if (requester.args[1] instanceof FileLoadOperation) {
                        FileLoadOperation fileLoadOperation = (FileLoadOperation) requester.args[1];
                        if (inputFileLocation != null) {
                            if (!z4 || !isSameReference(fileLoadOperation.location.file_reference, inputFileLocation.file_reference)) {
                                str = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                                fileLoadOperation.location = inputFileLocation;
                                if (BuildVars.LOGS_ENABLED) {
                                    r5 = Utilities.bytesToHex(inputFileLocation.file_reference);
                                }
                                fileLoadOperation.requestingReference = false;
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("debug_loading: " + fileLoadOperation.getCacheFileFinal().getName() + " " + str + " " + r5 + " reference updated resume download");
                                }
                                fileLoadOperation.startDownloadRequest(-1);
                                return true;
                            }
                        } else if (!z4 || !isSameReference(requester.location.file_reference, bArr)) {
                            String bytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                            TLRPC.InputFileLocation inputFileLocation2 = fileLoadOperation.location;
                            requester.location.file_reference = bArr;
                            inputFileLocation2.file_reference = bArr;
                            r5 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                            str = bytesToHex;
                            fileLoadOperation.requestingReference = false;
                            if (BuildVars.LOGS_ENABLED) {
                            }
                            fileLoadOperation.startDownloadRequest(-1);
                            return true;
                        }
                    }
                    return true;
                }
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) requester.args[0];
                TLRPC.InputStickeredMedia inputStickeredMedia = tL_messages_getAttachedStickers.media;
                if (!(inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument)) {
                    if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                        TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                        if (!z4 || !isSameReference(tL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                            tL_inputStickeredMediaPhoto.id.file_reference = bArr;
                        }
                    }
                    getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) requester.args[1]);
                    return true;
                }
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                if (!z4 || !isSameReference(tL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                    tL_inputStickeredMediaDocument.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) requester.args[1]);
                    return true;
                }
            }
        }
        return false;
    }

    private void putReponseToCache(String str, TLObject tLObject) {
        if (this.responseCache.get(str) == null) {
            CachedResult cachedResult = new CachedResult();
            cachedResult.response = tLObject;
            cachedResult.firstQueryTime = System.currentTimeMillis();
            this.responseCache.put(str, cachedResult);
        }
    }

    private void requestReferenceFromServer(Object obj, final String str, final String str2, Object[] objArr) {
        if (obj instanceof nh.c6) {
            nh.c6 c6Var = (nh.c6) obj;
            nh.d6 d6Var = c6Var.a;
            if (d6Var == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            lh.p6 p6Var = new lh.p6(d6Var, c6Var, new h2(this, str, str2, 2), 6);
            if (d6Var.F != 0) {
                ConnectionsManager.getInstance(d6Var.c).cancelRequest(d6Var.F, true);
                d6Var.F = 0;
            }
            d6Var.C = false;
            d6Var.D = false;
            d6Var.H(p6Var);
            return;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = getMessagesController().getInputPeer(storyItem.dialogId);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            final int i10 = 7;
            getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_help_premiumPromo) {
            final int i11 = 16;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_availableReaction) {
            TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
            tL_messages_getAvailableReactions.hash = 0;
            final int i12 = 17;
            getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TL_bots.BotInfo) {
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.id = getMessagesController().getInputUser(((TL_bots.BotInfo) obj).user_id);
            final int i13 = 18;
            getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
            tL_messages_getAttachMenuBot.bot = getMessagesController().getInputUser(((TLRPC.TL_attachMenuBot) obj).bot_id);
            final int i14 = 19;
            getConnectionsManager().sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(messageObject.getDialogId());
            if (messageObject.scheduled) {
                TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                tL_messages_getScheduledMessages.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                tL_messages_getScheduledMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                final int i15 = 20;
                getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i15) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if (messageObject.isQuickReply()) {
                TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                tL_messages_getQuickReplyMessages.shortcut_id = messageObject.getQuickReplyId();
                tL_messages_getQuickReplyMessages.flags |= 1;
                tL_messages_getQuickReplyMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                final int i16 = 21;
                getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i16) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.rich_message != null && inputPeer != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.id = messageObject.getRealId();
                final int i17 = 22;
                getConnectionsManager().sendRequest(getrichmessage, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i17) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if (channelId == 0) {
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                final int i18 = 0;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i18) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = getMessagesController().getInputChannel(channelId);
            tL_channels_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
            final int i19 = 23;
            getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i19) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.id = tL_wallPaper.id;
            tL_inputWallPaper.access_hash = tL_wallPaper.access_hash;
            getwallpaper.wallpaper = tL_inputWallPaper;
            final int i20 = 1;
            getConnectionsManager().sendRequest(getwallpaper, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_theme) {
            TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj;
            TL_account.getTheme gettheme = new TL_account.getTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            gettheme.theme = tL_inputTheme;
            gettheme.format = "android";
            final int i21 = 2;
            getConnectionsManager().sendRequest(gettheme, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i21) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.WebPage) {
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = ((TLRPC.WebPage) obj).url;
            tL_messages_getWebPage.hash = 0;
            final int i22 = 3;
            getConnectionsManager().sendRequest(tL_messages_getWebPage, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i22) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(getMessagesController().getInputUser((TLRPC.User) obj));
            final int i23 = 4;
            getConnectionsManager().sendRequest(tL_users_getUsers, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i23) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat instanceof TLRPC.TL_chat) {
                TLRPC.TL_messages_getChats tL_messages_getChats = new TLRPC.TL_messages_getChats();
                tL_messages_getChats.id.add(Long.valueOf(chat.id));
                final int i24 = 5;
                getConnectionsManager().sendRequest(tL_messages_getChats, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i24) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if ((chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_community)) {
                TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                tL_channels_getChannels.id.add(MessagesController.getInputChannel(chat));
                final int i25 = 6;
                getConnectionsManager().sendRequest(tL_channels_getChannels, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i25) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) obj).set;
                tL_inputStickerSetID.id = stickerSet.id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                final int i26 = 13;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i26) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if (!(obj instanceof TLRPC.StickerSetCovered)) {
                if (!(obj instanceof TLRPC.InputStickerSet)) {
                    sendErrorToObject(objArr, 0);
                    return;
                }
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet2 = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet2.stickerset = (TLRPC.InputStickerSet) obj;
                final int i27 = 15;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i27) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet3 = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet3.stickerset = tL_inputStickerSetID2;
            TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet2.id;
            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
            final int i28 = 14;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet3, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i28) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        String str3 = (String) obj;
        if ("wallpaper".equals(str3)) {
            if (this.wallpaperWaiters.isEmpty()) {
                final int i29 = 0;
                getConnectionsManager().sendRequest(new TL_account.getWallPapers(), new RequestDelegate(this) { // from class: org.telegram.messenger.p3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i29) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                break;
                        }
                    }
                });
            }
            this.wallpaperWaiters.add(new Waiter(str, str2));
            return;
        }
        if (str3.startsWith("gif")) {
            if (this.savedGifsWaiters.isEmpty()) {
                final int i30 = 1;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSavedGifs(), new RequestDelegate(this) { // from class: org.telegram.messenger.p3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i30) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                break;
                        }
                    }
                });
            }
            this.savedGifsWaiters.add(new Waiter(str, str2));
            return;
        }
        if ("recent".equals(str3)) {
            if (this.recentStickersWaiter.isEmpty()) {
                final int i31 = 2;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getRecentStickers(), new RequestDelegate(this) { // from class: org.telegram.messenger.p3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i31) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                break;
                        }
                    }
                });
            }
            this.recentStickersWaiter.add(new Waiter(str, str2));
            return;
        }
        if ("fav".equals(str3)) {
            if (this.favStickersWaiter.isEmpty()) {
                final int i32 = 3;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getFavedStickers(), new RequestDelegate(this) { // from class: org.telegram.messenger.p3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i32) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                break;
                        }
                    }
                });
            }
            this.favStickersWaiter.add(new Waiter(str, str2));
            return;
        }
        if ("update".equals(str3)) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            final int i33 = 8;
            getConnectionsManager().sendRequest(tL_help_getAppUpdate, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i33) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (str3.startsWith("avatar_")) {
            long longValue = Utilities.parseLong(str3).longValue();
            if (longValue > 0) {
                TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                tL_photos_getUserPhotos.limit = 80;
                tL_photos_getUserPhotos.offset = 0;
                tL_photos_getUserPhotos.max_id = 0L;
                tL_photos_getUserPhotos.user_id = getMessagesController().getInputUser(longValue);
                final int i34 = 9;
                getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                    public final /* synthetic */ FileRefController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i34) {
                            case 0:
                                this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
            tL_messages_search.peer = getMessagesController().getInputPeer(longValue);
            final int i35 = 10;
            getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i35) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (!str3.startsWith("sent_")) {
            sendErrorToObject(objArr, 0);
            return;
        }
        String[] split = str3.split("_");
        if (split.length < 3) {
            sendErrorToObject(objArr, 0);
            return;
        }
        long longValue2 = Utilities.parseLong(split[1]).longValue();
        if (longValue2 == 0) {
            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages2.id.add(Utilities.parseInt((CharSequence) split[2]));
            final int i36 = 12;
            getConnectionsManager().sendRequest(tL_messages_getMessages2, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i36) {
                        case 0:
                            this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages2 = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages2.channel = getMessagesController().getInputChannel(longValue2);
        tL_channels_getMessages2.id.add(Utilities.parseInt((CharSequence) split[2]));
        final int i37 = 11;
        getConnectionsManager().sendRequest(tL_channels_getMessages2, new RequestDelegate(this) { // from class: org.telegram.messenger.o3
            public final /* synthetic */ FileRefController b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i37) {
                    case 0:
                        this.b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                        break;
                    case 1:
                        this.b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                        break;
                    case 2:
                        this.b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                        break;
                    case 3:
                        this.b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                        break;
                    case 4:
                        this.b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                        break;
                    case 5:
                        this.b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                        break;
                    case 6:
                        this.b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                        break;
                    case 7:
                        this.b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                        break;
                    case 8:
                        this.b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                        break;
                    case 9:
                        this.b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                        break;
                    case 10:
                        this.b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                        break;
                    case 11:
                        this.b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                        break;
                    case 12:
                        this.b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                        break;
                    case 13:
                        this.b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                        break;
                    case 14:
                        this.b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                        break;
                    case 15:
                        this.b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                        break;
                    case 16:
                        this.b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                        break;
                    case 17:
                        this.b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                        break;
                    case 18:
                        this.b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                        break;
                    case 19:
                        this.b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                        break;
                    case 20:
                        this.b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                        break;
                    case 21:
                        this.b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                        break;
                    case 22:
                        this.b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                        break;
                    default:
                        this.b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaPoll) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_inputMediaPoll) == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void sendErrorToObject(final Object[] objArr, int i10) {
        boolean z4;
        Object obj = objArr[0];
        if (obj instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) objArr[1];
            Object[] objArr2 = this.multiMediaCache.get(tL_messages_sendMultiMedia);
            if (objArr2 != null) {
                this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                AndroidUtilities.runOnUIThread(new k3(this, tL_messages_sendMultiMedia, objArr2, 1));
                return;
            }
            return;
        }
        boolean z10 = obj instanceof TLRPC.TL_inputMediaDocument;
        if (z10 || (obj instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj2 = objArr[1];
            if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj2;
                Object[] objArr3 = this.multiMediaCache.get(tL_messages_sendMedia);
                if (objArr3 != null) {
                    this.multiMediaCache.remove(tL_messages_sendMedia);
                    AndroidUtilities.runOnUIThread(new l3(this, tL_messages_sendMedia, objArr3, 1));
                    return;
                }
                return;
            }
        }
        if (z10 || (obj instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj3 = objArr[1];
            if (obj3 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj3;
                Object[] objArr4 = this.multiMediaCache.get(tL_sendMessage);
                if (objArr4 != null) {
                    this.multiMediaCache.remove(tL_sendMessage);
                    AndroidUtilities.runOnUIThread(new m3(this, tL_sendMessage, objArr4, 1));
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
        boolean z11 = obj instanceof TLRPC.TL_messages_editMessage;
        if (!z11 && !((z4 = obj instanceof TLRPC.TL_messages_addPollAnswer))) {
            if (obj instanceof TL_ephemeral.TL_sendMessage) {
                TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) obj).media;
                if (!(inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia)) {
                }
            }
            if (!z11 && !z4) {
                if ((obj instanceof TLRPC.TL_messages_saveGif) || (obj instanceof TLRPC.TL_messages_saveRecentSticker) || (obj instanceof TLRPC.TL_stickers_addStickerToSet) || (obj instanceof TLRPC.TL_messages_faveSticker)) {
                    return;
                }
                if (obj instanceof TLRPC.TL_messages_getAttachedStickers) {
                    getConnectionsManager().sendRequest((TLRPC.TL_messages_getAttachedStickers) obj, (RequestDelegate) objArr[1]);
                    return;
                }
                Object obj4 = objArr[1];
                if (obj4 instanceof FileLoadOperation) {
                    FileLoadOperation fileLoadOperation = (FileLoadOperation) obj4;
                    fileLoadOperation.requestingReference = false;
                    FileLog.e("debug_loading: " + fileLoadOperation.getCacheFileFinal().getName() + " reference can't update: fail operation ");
                    fileLoadOperation.onFail(false, 0);
                    return;
                }
                return;
            }
            final int i11 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.r3
                public final /* synthetic */ FileRefController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.lambda$sendErrorToObject$44(objArr);
                            break;
                        default:
                            this.b.lambda$sendErrorToObject$45(objArr);
                            break;
                    }
                }
            });
            return;
        }
        final int i12 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.r3
            public final /* synthetic */ FileRefController b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.lambda$sendErrorToObject$44(objArr);
                        break;
                    default:
                        this.b.lambda$sendErrorToObject$45(objArr);
                        break;
                }
            }
        });
    }

    private boolean updateFileReferenceFromCache(byte[] bArr, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation inputFileLocation2, String str, Object... objArr) {
        String str2;
        Object obj = objArr[0];
        if (obj instanceof TL_stories.TL_storyItem) {
            ((TL_stories.TL_storyItem) obj).media.document.file_reference = bArr;
            return true;
        }
        if (obj instanceof TLRPC.TL_inputSingleMedia) {
            return false;
        }
        if (objArr.length >= 2) {
            Object obj2 = objArr[1];
            if ((obj2 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                return false;
            }
        }
        if (objArr.length >= 2) {
            Object obj3 = objArr[1];
            if ((obj3 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj3).media instanceof TLRPC.TL_inputMediaPoll) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                return false;
            }
        }
        if (objArr.length >= 2) {
            Object obj4 = objArr[1];
            if ((obj4 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj4).media instanceof TLRPC.TL_inputMediaPaidMedia) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                return false;
            }
        }
        if (objArr.length >= 2) {
            Object obj5 = objArr[1];
            if ((obj5 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj5).media instanceof TLRPC.TL_inputMediaPoll) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                return false;
            }
        }
        if (obj instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) obj).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                if (isSameReference(tL_inputMediaDocument.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument.id.file_reference = bArr;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                if (isSameReference(tL_inputMediaPhoto.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto.id.file_reference = bArr;
            }
        } else if (obj instanceof TL_ephemeral.TL_sendMessage) {
            TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) obj).media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                if (isSameReference(tL_inputMediaDocument2.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument2.id.file_reference = bArr;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                if (isSameReference(tL_inputMediaPhoto2.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto2.id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) obj).media;
            if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                if (isSameReference(tL_inputMediaDocument3.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument3.id.file_reference = bArr;
            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                if (isSameReference(tL_inputMediaPhoto3.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto3.id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) obj).answer.input_media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                if (isSameReference(tL_inputMediaDocument4.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument4.id.file_reference = bArr;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                if (isSameReference(tL_inputMediaPhoto4.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto4.id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_saveGif) {
            TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
            if (isSameReference(tL_messages_saveGif.id.file_reference, bArr)) {
                return false;
            }
            tL_messages_saveGif.id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_saveRecentSticker) {
            TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
            if (isSameReference(tL_messages_saveRecentSticker.id.file_reference, bArr)) {
                return false;
            }
            tL_messages_saveRecentSticker.id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_stickers_addStickerToSet) {
            TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
            if (isSameReference(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                return false;
            }
            tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_faveSticker) {
            TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
            if (isSameReference(tL_messages_faveSticker.id.file_reference, bArr)) {
                return false;
            }
            tL_messages_faveSticker.id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_getAttachedStickers) {
            TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj).media;
            if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                if (isSameReference(tL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputStickeredMediaDocument.id.file_reference = bArr;
            } else if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                if (isSameReference(tL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputStickeredMediaPhoto.id.file_reference = bArr;
            }
        } else {
            Object obj6 = objArr[1];
            if (obj6 instanceof FileLoadOperation) {
                FileLoadOperation fileLoadOperation = (FileLoadOperation) obj6;
                if (inputFileLocation != null) {
                    if (isSameReference(fileLoadOperation.location.file_reference, inputFileLocation.file_reference)) {
                        return false;
                    }
                    str2 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                    fileLoadOperation.location = inputFileLocation;
                    if (BuildVars.LOGS_ENABLED) {
                        r0 = Utilities.bytesToHex(inputFileLocation.file_reference);
                    }
                } else {
                    if (isSameReference(inputFileLocation2.file_reference, bArr)) {
                        return false;
                    }
                    String bytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                    TLRPC.InputFileLocation inputFileLocation3 = fileLoadOperation.location;
                    inputFileLocation2.file_reference = bArr;
                    inputFileLocation3.file_reference = bArr;
                    r0 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(bArr) : null;
                    str2 = bytesToHex;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: from fileref cache updated fileref from " + str2 + " to " + r0);
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if ("update".equals(r10) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean applyCachedFileReference(Object obj, Object... objArr) {
        String str;
        CachedResult cachedResponse;
        Object[] objArr2;
        CachedResult cachedResponse2;
        Pair<byte[], TLRPC.InputFileLocation> fileReferenceFromResponse;
        Pair<TLRPC.InputFileLocation, String> locationAndKey = getLocationAndKey(obj, objArr);
        if (locationAndKey == null) {
            return false;
        }
        TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
        String str2 = (String) locationAndKey.second;
        String keyForParentObject = getKeyForParentObject(obj);
        if (keyForParentObject == null) {
            return false;
        }
        if (obj instanceof String) {
            String str3 = (String) obj;
            str = "wallpaper";
            if (!"wallpaper".equals(str3)) {
                str = "gif";
                if (!str3.startsWith("gif")) {
                    str = "recent";
                    if (!"recent".equals(str3)) {
                        str = "fav";
                        if (!"fav".equals(str3)) {
                            str = "update";
                        }
                    }
                }
            }
            cachedResponse = getCachedResponse(str);
            if (cachedResponse == null) {
                objArr2 = objArr;
                Pair<byte[], TLRPC.InputFileLocation> fileReferenceFromResponse2 = getFileReferenceFromResponse(inputFileLocation, str2, keyForParentObject, cachedResponse.response, objArr2);
                if (fileReferenceFromResponse2 != null) {
                    return updateFileReferenceFromCache((byte[]) fileReferenceFromResponse2.first, (TLRPC.InputFileLocation) fileReferenceFromResponse2.second, inputFileLocation, str2, objArr2);
                }
            } else {
                objArr2 = objArr;
            }
            cachedResponse2 = getCachedResponse(keyForParentObject);
            if (cachedResponse2 != null || (fileReferenceFromResponse = getFileReferenceFromResponse(inputFileLocation, keyForParentObject, null, cachedResponse2.response, objArr2)) == null) {
                return false;
            }
            return updateFileReferenceFromCache((byte[]) fileReferenceFromResponse.first, (TLRPC.InputFileLocation) fileReferenceFromResponse.second, inputFileLocation, keyForParentObject, objArr2);
        }
        str = str2;
        cachedResponse = getCachedResponse(str);
        if (cachedResponse == null) {
        }
        cachedResponse2 = getCachedResponse(keyForParentObject);
        if (cachedResponse2 != null) {
        }
        return false;
    }

    public Pair<TLRPC.InputFileLocation, String> getLocationAndKey(Object obj, Object... objArr) {
        Object obj2 = objArr[0];
        if (obj2 instanceof TLRPC.TL_messages_sendMultiMedia) {
            return null;
        }
        if ((obj2 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if ((obj2 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if ((obj2 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if ((obj2 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if (obj2 instanceof nh.c6) {
            nh.c6 c6Var = (nh.c6) obj2;
            TLRPC.MessageMedia messageMedia = c6Var.media;
            if (messageMedia.document != null) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation.id = c6Var.media.document.id;
                return new Pair<>(tL_inputDocumentFileLocation, "botstory_doc_" + c6Var.media.document.id);
            }
            if (messageMedia.photo == null) {
                return new Pair<>(new TLRPC.TL_inputDocumentFileLocation(), "botstory_" + c6Var.id);
            }
            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
            tL_inputPhotoFileLocation.id = c6Var.media.photo.id;
            return new Pair<>(tL_inputPhotoFileLocation, "botstory_photo_" + c6Var.media.photo.id);
        }
        if (obj2 instanceof TL_stories.TL_storyItem) {
            TL_stories.TL_storyItem tL_storyItem = (TL_stories.TL_storyItem) obj2;
            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
            tL_inputDocumentFileLocation2.id = tL_storyItem.media.document.id;
            return new Pair<>(tL_inputDocumentFileLocation2, "story_" + tL_storyItem.id);
        }
        if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_inputSingleMedia) obj2).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation3 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation3.id = tL_inputMediaDocument.id.id;
                return new Pair<>(tL_inputDocumentFileLocation3, "file_" + tL_inputMediaDocument.id.id);
            }
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation2 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation2.id = tL_inputMediaPhoto.id.id;
                return new Pair<>(tL_inputPhotoFileLocation2, "photo_" + tL_inputMediaPhoto.id.id);
            }
        } else {
            if (obj2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation4 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation4.id = tL_inputMediaDocument2.id.id;
                return new Pair<>(tL_inputDocumentFileLocation4, "file_" + tL_inputMediaDocument2.id.id);
            }
            if (obj2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation3 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation3.id = tL_inputMediaPhoto2.id.id;
                return new Pair<>(tL_inputPhotoFileLocation3, "photo_" + tL_inputMediaPhoto2.id.id);
            }
            if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation5 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation5.id = tL_inputMediaDocument3.id.id;
                    return new Pair<>(tL_inputDocumentFileLocation5, "file_" + tL_inputMediaDocument3.id.id);
                }
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation4 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation4.id = tL_inputMediaPhoto3.id.id;
                    return new Pair<>(tL_inputPhotoFileLocation4, "photo_" + tL_inputMediaPhoto3.id.id);
                }
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation6 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation6.id = tL_inputMediaDocument4.id.id;
                            return new Pair<>(tL_inputDocumentFileLocation6, "file_" + tL_inputMediaDocument4.id.id);
                        }
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation5 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation5.id = tL_inputMediaPhoto4.id.id;
                            return new Pair<>(tL_inputPhotoFileLocation5, "photo_" + tL_inputMediaPhoto4.id.id);
                        }
                    }
                }
            } else if (obj2 instanceof TL_ephemeral.TL_sendMessage) {
                TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) obj2).media;
                if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation7 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation7.id = tL_inputMediaDocument5.id.id;
                    return new Pair<>(tL_inputDocumentFileLocation7, "file_" + tL_inputMediaDocument5.id.id);
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation6 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation6.id = tL_inputMediaPhoto5.id.id;
                    return new Pair<>(tL_inputPhotoFileLocation6, "photo_" + tL_inputMediaPhoto5.id.id);
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia2.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia5 = tL_inputMediaPaidMedia2.extended_media.get(0);
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation8 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation8.id = tL_inputMediaDocument6.id.id;
                            return new Pair<>(tL_inputDocumentFileLocation8, "file_" + tL_inputMediaDocument6.id.id);
                        }
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation7 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation7.id = tL_inputMediaPhoto6.id.id;
                            return new Pair<>(tL_inputPhotoFileLocation7, "photo_" + tL_inputMediaPhoto6.id.id);
                        }
                    }
                }
            } else if (obj2 instanceof TLRPC.TL_messages_editMessage) {
                TLRPC.InputMedia inputMedia6 = ((TLRPC.TL_messages_editMessage) obj2).media;
                if (inputMedia6 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia6;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation9 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation9.id = tL_inputMediaDocument7.id.id;
                    return new Pair<>(tL_inputDocumentFileLocation9, "file_" + tL_inputMediaDocument7.id.id);
                }
                if (inputMedia6 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia6;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation8 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation8.id = tL_inputMediaPhoto7.id.id;
                    return new Pair<>(tL_inputPhotoFileLocation8, "photo_" + tL_inputMediaPhoto7.id.id);
                }
            } else {
                if (obj2 instanceof TLRPC.InputPhoto) {
                    TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation9 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation9.id = inputPhoto.id;
                    return new Pair<>(tL_inputPhotoFileLocation9, "photo_" + inputPhoto.id);
                }
                if (obj2 instanceof TLRPC.InputDocument) {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation10 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation10.id = inputDocument.id;
                    return new Pair<>(tL_inputDocumentFileLocation10, "file_" + inputDocument.id);
                }
                if (obj2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.InputMedia inputMedia7 = ((TLRPC.TL_messages_addPollAnswer) obj2).answer.input_media;
                    if (inputMedia7 instanceof TLRPC.TL_inputMediaDocument) {
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument8 = (TLRPC.TL_inputMediaDocument) inputMedia7;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation11 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation11.id = tL_inputMediaDocument8.id.id;
                        return new Pair<>(tL_inputDocumentFileLocation11, "file_" + tL_inputMediaDocument8.id.id);
                    }
                    if (inputMedia7 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia7;
                        TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation10 = new TLRPC.TL_inputPhotoFileLocation();
                        tL_inputPhotoFileLocation10.id = tL_inputMediaPhoto8.id.id;
                        return new Pair<>(tL_inputPhotoFileLocation10, "photo_" + tL_inputMediaPhoto8.id.id);
                    }
                } else {
                    if (obj2 instanceof TLRPC.TL_messages_saveGif) {
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation12 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation12.id = tL_messages_saveGif.id.id;
                        return new Pair<>(tL_inputDocumentFileLocation12, "file_" + tL_messages_saveGif.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_saveRecentSticker) {
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation13 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation13.id = tL_messages_saveRecentSticker.id.id;
                        return new Pair<>(tL_inputDocumentFileLocation13, "file_" + tL_messages_saveRecentSticker.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_stickers_addStickerToSet) {
                        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation14 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation14.id = tL_stickers_addStickerToSet.sticker.document.id;
                        return new Pair<>(tL_inputDocumentFileLocation14, "file_" + tL_stickers_addStickerToSet.sticker.document.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_faveSticker) {
                        TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation15 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation15.id = tL_messages_faveSticker.id.id;
                        return new Pair<>(tL_inputDocumentFileLocation15, "file_" + tL_messages_faveSticker.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                        TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj2).media;
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation16 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation16.id = tL_inputStickeredMediaDocument.id.id;
                            return new Pair<>(tL_inputDocumentFileLocation16, "file_" + tL_inputStickeredMediaDocument.id.id);
                        }
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation11 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation11.id = tL_inputStickeredMediaPhoto.id.id;
                            return new Pair<>(tL_inputPhotoFileLocation11, "photo_" + tL_inputStickeredMediaPhoto.id.id);
                        }
                    } else {
                        if (obj2 instanceof TLRPC.TL_inputFileLocation) {
                            TLRPC.TL_inputFileLocation tL_inputFileLocation = (TLRPC.TL_inputFileLocation) obj2;
                            return new Pair<>(tL_inputFileLocation, "loc_" + tL_inputFileLocation.local_id + "_" + tL_inputFileLocation.volume_id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputDocumentFileLocation) {
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation17 = (TLRPC.TL_inputDocumentFileLocation) obj2;
                            return new Pair<>(tL_inputDocumentFileLocation17, "file_" + tL_inputDocumentFileLocation17.id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputPhotoFileLocation) {
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation12 = (TLRPC.TL_inputPhotoFileLocation) obj2;
                            return new Pair<>(tL_inputPhotoFileLocation12, "photo_" + tL_inputPhotoFileLocation12.id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = (TLRPC.TL_inputPeerPhotoFileLocation) obj2;
                            return new Pair<>(tL_inputPeerPhotoFileLocation, "avatar_" + tL_inputPeerPhotoFileLocation.id);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0190, code lost:
    
        if ("update".equals(r0) != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void requestReference(Object obj, Object... objArr) {
        String str;
        CachedResult cachedResponse;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        Object obj2;
        int i10 = 0;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start loading request reference parent " + getObjectString(obj) + " args = " + objArr[0]);
        }
        Object obj3 = objArr[0];
        if (obj3 instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) obj3;
            ArrayList arrayList = (ArrayList) obj;
            this.multiMediaCache.put(tL_messages_sendMultiMedia, objArr);
            int size = tL_messages_sendMultiMedia.multi_media.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj4 = (TLRPC.TL_inputSingleMedia) tL_messages_sendMultiMedia.multi_media.get(i11);
                Object obj5 = arrayList.get(i11);
                if (obj5 != null) {
                    requestReference(obj5, obj4, tL_messages_sendMultiMedia);
                }
            }
        } else if ((obj3 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj3).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj3;
            TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media;
            ArrayList arrayList2 = (ArrayList) obj;
            this.multiMediaCache.put(tL_messages_sendMedia, objArr);
            int size2 = tL_inputMediaPaidMedia.extended_media.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj6 = (TLRPC.InputMedia) tL_inputMediaPaidMedia.extended_media.get(i12);
                Object obj7 = arrayList2.get(i12);
                if (obj7 != null) {
                    requestReference(obj7, obj6, tL_messages_sendMedia);
                }
            }
        } else if ((obj3 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj3).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj3;
            TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media;
            ArrayList arrayList3 = (ArrayList) obj;
            this.multiMediaCache.put(tL_sendMessage, objArr);
            int size3 = tL_inputMediaPaidMedia2.extended_media.size();
            for (int i13 = 0; i13 < size3; i13++) {
                Object obj8 = (TLRPC.InputMedia) tL_inputMediaPaidMedia2.extended_media.get(i13);
                Object obj9 = arrayList3.get(i13);
                if (obj9 != null) {
                    requestReference(obj9, obj8, tL_sendMessage);
                }
            }
        } else {
            Pair<TLRPC.InputFileLocation, String> locationAndKey = getLocationAndKey(obj, objArr);
            if (locationAndKey == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
            String str2 = (String) locationAndKey.second;
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                if (messageObject.getRealId() < 0 && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (obj2 = messageMedia.webpage) != null) {
                    obj = obj2;
                }
            }
            String keyForParentObject = getKeyForParentObject(obj);
            if (keyForParentObject == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            Requester requester = new Requester();
            requester.args = objArr;
            requester.location = inputFileLocation;
            requester.locationKey = str2;
            ArrayList<Requester> arrayList4 = this.locationRequester.get(str2);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList<>();
                this.locationRequester.put(str2, arrayList4);
                i10 = 1;
            }
            arrayList4.add(requester);
            ArrayList<Requester> arrayList5 = this.parentRequester.get(keyForParentObject);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList<>();
                this.parentRequester.put(keyForParentObject, arrayList5);
                i10++;
            }
            arrayList5.add(requester);
            if (i10 == 2) {
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    str = "wallpaper";
                    if (!"wallpaper".equals(str3)) {
                        str = "gif";
                        if (!str3.startsWith("gif")) {
                            str = "recent";
                            if (!"recent".equals(str3)) {
                                str = "fav";
                                if (!"fav".equals(str3)) {
                                    str = "update";
                                }
                            }
                        }
                    }
                    cleanupCache();
                    cachedResponse = getCachedResponse(str);
                    if (cachedResponse != null) {
                        CachedResult cachedResponse2 = getCachedResponse(keyForParentObject);
                        if (cachedResponse2 != null) {
                            if (onRequestComplete(str2, keyForParentObject, cachedResponse2.response, null, false, true)) {
                                return;
                            } else {
                                this.responseCache.remove(keyForParentObject);
                            }
                        }
                    } else if (onRequestComplete(str2, keyForParentObject, cachedResponse.response, null, false, true)) {
                        return;
                    } else {
                        this.responseCache.remove(str2);
                    }
                    requestReferenceFromServer(obj, str2, keyForParentObject, objArr);
                }
                str = str2;
                cleanupCache();
                cachedResponse = getCachedResponse(str);
                if (cachedResponse != null) {
                }
                requestReferenceFromServer(obj, str2, keyForParentObject, objArr);
            }
        }
    }

    private byte[] getFileReference(TLRPC.User user, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (user == null || (userProfilePhoto = user.photo) == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
            return null;
        }
        byte[] fileReference = getFileReference(userProfilePhoto.photo_small, inputFileLocation, zArr);
        if (getPeerReferenceReplacement(user, null, false, inputFileLocation, inputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (fileReference == null) {
            return getPeerReferenceReplacement(user, null, true, inputFileLocation, inputFileLocationArr, zArr) ? new byte[0] : getFileReference(user.photo.photo_big, inputFileLocation, zArr);
        }
        return fileReference;
    }

    private byte[] getFileReference(TLRPC.Chat chat, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.ChatPhoto chatPhoto;
        if (chat == null || (chatPhoto = chat.photo) == null || !((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation))) {
            return null;
        }
        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
            zArr[0] = true;
            if (getPeerReferenceReplacement(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
                return new byte[0];
            }
            return null;
        }
        byte[] fileReference = getFileReference(chatPhoto.photo_small, inputFileLocation, zArr);
        if (getPeerReferenceReplacement(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (fileReference == null) {
            return getPeerReferenceReplacement(null, chat, true, inputFileLocation, inputFileLocationArr, zArr) ? new byte[0] : getFileReference(chat.photo.photo_big, inputFileLocation, zArr);
        }
        return fileReference;
    }

    private byte[] getFileReference(TLRPC.Photo photo, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (photo == null) {
            return null;
        }
        if (inputFileLocation instanceof TLRPC.TL_inputPhotoFileLocation) {
            if (photo.id == inputFileLocation.id) {
                return photo.file_reference;
            }
            return null;
        }
        if (inputFileLocation instanceof TLRPC.TL_inputFileLocation) {
            int size = photo.sizes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PhotoSize photoSize = photo.sizes.get(i10);
                byte[] fileReference = getFileReference(photoSize, inputFileLocation, zArr);
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
                if (fileReference != null) {
                    return fileReference;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUpdateObjectReference$37(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUpdateObjectReference$38(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUpdateObjectReference$39(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUpdateObjectReference$40(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    private byte[] getFileReference(TLRPC.PhotoSize photoSize, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr) {
        if (photoSize == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
            return null;
        }
        return getFileReference(photoSize.location, inputFileLocation, zArr);
    }

    private byte[] getFileReference(TLRPC.FileLocation fileLocation, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr) {
        if (fileLocation == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation) || fileLocation.local_id != inputFileLocation.local_id || fileLocation.volume_id != inputFileLocation.volume_id) {
            return null;
        }
        byte[] bArr = fileLocation.file_reference;
        if (bArr == null && zArr != null) {
            zArr[0] = true;
        }
        return bArr;
    }

    private byte[] getFileReference(TLRPC.WebPage webPage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        FileRefController fileRefController = this;
        byte[] fileReference = fileRefController.getFileReference(webPage.document, null, inputFileLocation, zArr, inputFileLocationArr);
        if (fileReference != null) {
            return fileReference;
        }
        byte[] fileReference2 = getFileReference(webPage.photo, inputFileLocation, zArr, inputFileLocationArr);
        if (fileReference2 != null) {
            return fileReference2;
        }
        if (!webPage.attributes.isEmpty()) {
            int size = webPage.attributes.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i10);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        byte[] fileReference3 = fileRefController.getFileReference(tL_webPageAttributeTheme.documents.get(i11), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (fileReference3 != null) {
                            return fileReference3;
                        }
                        i11++;
                        fileRefController = this;
                    }
                }
                i10++;
                fileRefController = this;
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page == null) {
            return null;
        }
        int size3 = page.documents.size();
        for (int i12 = 0; i12 < size3; i12++) {
            byte[] fileReference4 = getFileReference(webPage.cached_page.documents.get(i12), null, inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference4 != null) {
                return fileReference4;
            }
        }
        int size4 = webPage.cached_page.photos.size();
        for (int i13 = 0; i13 < size4; i13++) {
            byte[] fileReference5 = getFileReference(webPage.cached_page.photos.get(i13), inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference5 != null) {
                return fileReference5;
            }
        }
        return null;
    }
}

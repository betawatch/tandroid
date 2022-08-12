package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInfo;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputFileLocation;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$InputStickeredMedia;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Page;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_account_getTheme;
import org.telegram.tgnet.TLRPC$TL_account_getWallPaper;
import org.telegram.tgnet.TLRPC$TL_account_getWallPapers;
import org.telegram.tgnet.TLRPC$TL_account_wallPapers;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon;
import org.telegram.tgnet.TLRPC$TL_attachMenuBots;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotsBot;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_channel;
import org.telegram.tgnet.TLRPC$TL_channels_getChannels;
import org.telegram.tgnet.TLRPC$TL_channels_getMessages;
import org.telegram.tgnet.TLRPC$TL_chat;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_game;
import org.telegram.tgnet.TLRPC$TL_help_appUpdate;
import org.telegram.tgnet.TLRPC$TL_help_getAppUpdate;
import org.telegram.tgnet.TLRPC$TL_inputDocumentFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterChatPhotos;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerPhotoFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputPhotoFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputSingleMedia;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickeredMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputStickeredMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputTheme;
import org.telegram.tgnet.TLRPC$TL_inputWallPaper;
import org.telegram.tgnet.TLRPC$TL_messageActionChatEditPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_availableReactions;
import org.telegram.tgnet.TLRPC$TL_messages_chats;
import org.telegram.tgnet.TLRPC$TL_messages_editMessage;
import org.telegram.tgnet.TLRPC$TL_messages_faveSticker;
import org.telegram.tgnet.TLRPC$TL_messages_favedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachMenuBot;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getAvailableReactions;
import org.telegram.tgnet.TLRPC$TL_messages_getChats;
import org.telegram.tgnet.TLRPC$TL_messages_getFavedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getRecentStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getSavedGifs;
import org.telegram.tgnet.TLRPC$TL_messages_getScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_recentStickers;
import org.telegram.tgnet.TLRPC$TL_messages_saveGif;
import org.telegram.tgnet.TLRPC$TL_messages_saveRecentSticker;
import org.telegram.tgnet.TLRPC$TL_messages_savedGifs;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_messages_sendMedia;
import org.telegram.tgnet.TLRPC$TL_messages_sendMultiMedia;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_photos_getUserPhotos;
import org.telegram.tgnet.TLRPC$TL_theme;
import org.telegram.tgnet.TLRPC$TL_users_getFullUser;
import org.telegram.tgnet.TLRPC$TL_users_getUsers;
import org.telegram.tgnet.TLRPC$TL_users_userFull;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$TL_webPageAttributeTheme;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.TLRPC$photos_Photos;
import org.telegram.ui.ActionBar.Theme;
/* loaded from: classes.dex */
public class FileRefController extends BaseController {
    private static volatile FileRefController[] Instance = new FileRefController[4];
    private HashMap<String, ArrayList<Requester>> locationRequester = new HashMap<>();
    private HashMap<String, ArrayList<Requester>> parentRequester = new HashMap<>();
    private HashMap<String, CachedResult> responseCache = new HashMap<>();
    private HashMap<TLRPC$TL_messages_sendMultiMedia, Object[]> multiMediaCache = new HashMap<>();
    private long lastCleanupTime = SystemClock.elapsedRealtime();
    private ArrayList<Waiter> wallpaperWaiters = new ArrayList<>();
    private ArrayList<Waiter> savedGifsWaiters = new ArrayList<>();
    private ArrayList<Waiter> recentStickersWaiter = new ArrayList<>();
    private ArrayList<Waiter> favStickersWaiter = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUpdateObjectReference$27(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUpdateObjectReference$28(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUpdateObjectReference$29(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Requester {
        private Object[] args;
        private boolean completed;
        private TLRPC$InputFileLocation location;
        private String locationKey;

        private Requester() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CachedResult {
        private long firstQueryTime;
        private long lastQueryTime;
        private TLObject response;

        private CachedResult() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Waiter {
        private String locationKey;
        private String parentKey;

        public Waiter(String str, String str2) {
            this.locationKey = str;
            this.parentKey = str2;
        }
    }

    public static FileRefController getInstance(int i) {
        FileRefController fileRefController = Instance[i];
        if (fileRefController == null) {
            synchronized (FileRefController.class) {
                fileRefController = Instance[i];
                if (fileRefController == null) {
                    FileRefController[] fileRefControllerArr = Instance;
                    FileRefController fileRefController2 = new FileRefController(i);
                    fileRefControllerArr[i] = fileRefController2;
                    fileRefController = fileRefController2;
                }
            }
        }
        return fileRefController;
    }

    public FileRefController(int i) {
        super(i);
    }

    public static String getKeyForParentObject(Object obj) {
        if (obj instanceof TLRPC$TL_availableReaction) {
            return "available_reaction_" + ((TLRPC$TL_availableReaction) obj).reaction;
        } else if (obj instanceof TLRPC$BotInfo) {
            return "bot_info_" + ((TLRPC$BotInfo) obj).user_id;
        } else if (obj instanceof TLRPC$TL_attachMenuBot) {
            long j = ((TLRPC$TL_attachMenuBot) obj).bot_id;
            return "attach_menu_bot_" + j;
        } else if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            return "message" + messageObject.getRealId() + "_" + channelId + "_" + messageObject.scheduled;
        } else if (obj instanceof TLRPC$Message) {
            TLRPC$Message tLRPC$Message = (TLRPC$Message) obj;
            TLRPC$Peer tLRPC$Peer = tLRPC$Message.peer_id;
            long j2 = tLRPC$Peer != null ? tLRPC$Peer.channel_id : 0L;
            return "message" + tLRPC$Message.id + "_" + j2 + "_" + tLRPC$Message.from_scheduled;
        } else if (obj instanceof TLRPC$WebPage) {
            return "webpage" + ((TLRPC$WebPage) obj).id;
        } else if (obj instanceof TLRPC$User) {
            return "user" + ((TLRPC$User) obj).id;
        } else if (obj instanceof TLRPC$Chat) {
            return "chat" + ((TLRPC$Chat) obj).id;
        } else if (obj instanceof String) {
            return "str" + ((String) obj);
        } else if (obj instanceof TLRPC$TL_messages_stickerSet) {
            return "set" + ((TLRPC$TL_messages_stickerSet) obj).set.id;
        } else if (obj instanceof TLRPC$StickerSetCovered) {
            return "set" + ((TLRPC$StickerSetCovered) obj).set.id;
        } else if (obj instanceof TLRPC$InputStickerSet) {
            return "set" + ((TLRPC$InputStickerSet) obj).id;
        } else if (obj instanceof TLRPC$TL_wallPaper) {
            return "wallpaper" + ((TLRPC$TL_wallPaper) obj).id;
        } else if (obj instanceof TLRPC$TL_theme) {
            return "theme" + ((TLRPC$TL_theme) obj).id;
        } else if (obj == null) {
            return null;
        } else {
            return "" + obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0366, code lost:
        if (r2.equals(r1) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0389  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void requestReference(Object obj, Object... objArr) {
        TLRPC$InputFileLocation tLRPC$InputFileLocation;
        String str;
        TLRPC$TL_inputDocumentFileLocation tLRPC$TL_inputDocumentFileLocation;
        TLRPC$TL_inputStickeredMediaPhoto tLRPC$TL_inputStickeredMediaPhoto;
        TLRPC$TL_inputStickeredMediaDocument tLRPC$TL_inputStickeredMediaDocument;
        TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto;
        TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument;
        TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto2;
        TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument2;
        CachedResult cachedResponse;
        Object obj2;
        TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto3;
        TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument3;
        int i = 0;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start loading request reference for parent = " + obj + " args = " + objArr[0]);
        }
        if (objArr[0] instanceof TLRPC$TL_inputSingleMedia) {
            TLRPC$InputMedia tLRPC$InputMedia = ((TLRPC$TL_inputSingleMedia) objArr[0]).media;
            if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaDocument) {
                str = "file_" + tLRPC$TL_inputMediaDocument3.id.id;
                tLRPC$InputFileLocation = new TLRPC$TL_inputDocumentFileLocation();
                tLRPC$InputFileLocation.id = ((TLRPC$TL_inputMediaDocument) tLRPC$InputMedia).id.id;
            } else if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaPhoto) {
                str = "photo_" + tLRPC$TL_inputMediaPhoto3.id.id;
                tLRPC$InputFileLocation = new TLRPC$TL_inputPhotoFileLocation();
                tLRPC$InputFileLocation.id = ((TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia).id.id;
            } else {
                sendErrorToObject(objArr, 0);
                return;
            }
        } else if (objArr[0] instanceof TLRPC$TL_messages_sendMultiMedia) {
            TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia = (TLRPC$TL_messages_sendMultiMedia) objArr[0];
            ArrayList arrayList = (ArrayList) obj;
            this.multiMediaCache.put(tLRPC$TL_messages_sendMultiMedia, objArr);
            int size = tLRPC$TL_messages_sendMultiMedia.multi_media.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj3 = (TLRPC$TL_inputSingleMedia) tLRPC$TL_messages_sendMultiMedia.multi_media.get(i2);
                Object obj4 = arrayList.get(i2);
                if (obj4 != null) {
                    requestReference(obj4, obj3, tLRPC$TL_messages_sendMultiMedia);
                }
            }
            return;
        } else if (objArr[0] instanceof TLRPC$TL_messages_sendMedia) {
            TLRPC$InputMedia tLRPC$InputMedia2 = ((TLRPC$TL_messages_sendMedia) objArr[0]).media;
            if (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaDocument) {
                str = "file_" + tLRPC$TL_inputMediaDocument2.id.id;
                tLRPC$InputFileLocation = new TLRPC$TL_inputDocumentFileLocation();
                tLRPC$InputFileLocation.id = ((TLRPC$TL_inputMediaDocument) tLRPC$InputMedia2).id.id;
            } else if (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaPhoto) {
                str = "photo_" + tLRPC$TL_inputMediaPhoto2.id.id;
                tLRPC$InputFileLocation = new TLRPC$TL_inputPhotoFileLocation();
                tLRPC$InputFileLocation.id = ((TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia2).id.id;
            } else {
                sendErrorToObject(objArr, 0);
                return;
            }
        } else if (objArr[0] instanceof TLRPC$TL_messages_editMessage) {
            TLRPC$InputMedia tLRPC$InputMedia3 = ((TLRPC$TL_messages_editMessage) objArr[0]).media;
            if (tLRPC$InputMedia3 instanceof TLRPC$TL_inputMediaDocument) {
                str = "file_" + tLRPC$TL_inputMediaDocument.id.id;
                tLRPC$InputFileLocation = new TLRPC$TL_inputDocumentFileLocation();
                tLRPC$InputFileLocation.id = ((TLRPC$TL_inputMediaDocument) tLRPC$InputMedia3).id.id;
            } else if (tLRPC$InputMedia3 instanceof TLRPC$TL_inputMediaPhoto) {
                str = "photo_" + tLRPC$TL_inputMediaPhoto.id.id;
                tLRPC$InputFileLocation = new TLRPC$TL_inputPhotoFileLocation();
                tLRPC$InputFileLocation.id = ((TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia3).id.id;
            } else {
                sendErrorToObject(objArr, 0);
                return;
            }
        } else if (objArr[0] instanceof TLRPC$TL_messages_saveGif) {
            TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif = (TLRPC$TL_messages_saveGif) objArr[0];
            str = "file_" + tLRPC$TL_messages_saveGif.id.id;
            tLRPC$InputFileLocation = new TLRPC$TL_inputDocumentFileLocation();
            tLRPC$InputFileLocation.id = tLRPC$TL_messages_saveGif.id.id;
        } else if (objArr[0] instanceof TLRPC$TL_messages_saveRecentSticker) {
            TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker = (TLRPC$TL_messages_saveRecentSticker) objArr[0];
            str = "file_" + tLRPC$TL_messages_saveRecentSticker.id.id;
            tLRPC$InputFileLocation = new TLRPC$TL_inputDocumentFileLocation();
            tLRPC$InputFileLocation.id = tLRPC$TL_messages_saveRecentSticker.id.id;
        } else if (objArr[0] instanceof TLRPC$TL_messages_faveSticker) {
            TLRPC$TL_messages_faveSticker tLRPC$TL_messages_faveSticker = (TLRPC$TL_messages_faveSticker) objArr[0];
            str = "file_" + tLRPC$TL_messages_faveSticker.id.id;
            tLRPC$InputFileLocation = new TLRPC$TL_inputDocumentFileLocation();
            tLRPC$InputFileLocation.id = tLRPC$TL_messages_faveSticker.id.id;
        } else if (objArr[0] instanceof TLRPC$TL_messages_getAttachedStickers) {
            TLRPC$InputStickeredMedia tLRPC$InputStickeredMedia = ((TLRPC$TL_messages_getAttachedStickers) objArr[0]).media;
            if (tLRPC$InputStickeredMedia instanceof TLRPC$TL_inputStickeredMediaDocument) {
                str = "file_" + tLRPC$TL_inputStickeredMediaDocument.id.id;
                tLRPC$InputFileLocation = new TLRPC$TL_inputDocumentFileLocation();
                tLRPC$InputFileLocation.id = ((TLRPC$TL_inputStickeredMediaDocument) tLRPC$InputStickeredMedia).id.id;
            } else if (tLRPC$InputStickeredMedia instanceof TLRPC$TL_inputStickeredMediaPhoto) {
                str = "photo_" + tLRPC$TL_inputStickeredMediaPhoto.id.id;
                tLRPC$InputFileLocation = new TLRPC$TL_inputPhotoFileLocation();
                tLRPC$InputFileLocation.id = ((TLRPC$TL_inputStickeredMediaPhoto) tLRPC$InputStickeredMedia).id.id;
            } else {
                sendErrorToObject(objArr, 0);
                return;
            }
        } else if (objArr[0] instanceof TLRPC$TL_inputFileLocation) {
            tLRPC$InputFileLocation = (TLRPC$TL_inputFileLocation) objArr[0];
            str = "loc_" + tLRPC$InputFileLocation.local_id + "_" + tLRPC$InputFileLocation.volume_id;
        } else if (objArr[0] instanceof TLRPC$TL_inputDocumentFileLocation) {
            str = "file_" + tLRPC$TL_inputDocumentFileLocation.id;
            tLRPC$InputFileLocation = (TLRPC$TL_inputDocumentFileLocation) objArr[0];
        } else if (objArr[0] instanceof TLRPC$TL_inputPhotoFileLocation) {
            tLRPC$InputFileLocation = (TLRPC$TL_inputPhotoFileLocation) objArr[0];
            str = "photo_" + tLRPC$InputFileLocation.id;
        } else if (objArr[0] instanceof TLRPC$TL_inputPeerPhotoFileLocation) {
            tLRPC$InputFileLocation = (TLRPC$TL_inputPeerPhotoFileLocation) objArr[0];
            str = "avatar_" + tLRPC$InputFileLocation.id;
        } else {
            sendErrorToObject(objArr, 0);
            return;
        }
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.getRealId() < 0 && (obj2 = messageObject.messageOwner.media.webpage) != null) {
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
        requester.location = tLRPC$InputFileLocation;
        requester.locationKey = str;
        ArrayList<Requester> arrayList2 = this.locationRequester.get(str);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
            this.locationRequester.put(str, arrayList2);
            i = 1;
        }
        arrayList2.add(requester);
        ArrayList<Requester> arrayList3 = this.parentRequester.get(keyForParentObject);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList<>();
            this.parentRequester.put(keyForParentObject, arrayList3);
            i++;
        }
        arrayList3.add(requester);
        if (i != 2) {
            return;
        }
        String str2 = "update";
        if (obj instanceof String) {
            String str3 = (String) obj;
            if ("wallpaper".equals(str3)) {
                str2 = "wallpaper";
            } else if (str3.startsWith("gif")) {
                str2 = "gif";
            } else if ("recent".equals(str3)) {
                str2 = "recent";
            } else if ("fav".equals(str3)) {
                str2 = "fav";
            }
            cleanupCache();
            cachedResponse = getCachedResponse(str2);
            if (cachedResponse == null) {
                if (onRequestComplete(str, keyForParentObject, cachedResponse.response, false, true)) {
                    return;
                }
                this.responseCache.remove(str);
            } else {
                CachedResult cachedResponse2 = getCachedResponse(keyForParentObject);
                if (cachedResponse2 != null) {
                    if (onRequestComplete(str, keyForParentObject, cachedResponse2.response, false, true)) {
                        return;
                    }
                    this.responseCache.remove(keyForParentObject);
                }
            }
            requestReferenceFromServer(obj, str, keyForParentObject, objArr);
        }
        str2 = str;
        cleanupCache();
        cachedResponse = getCachedResponse(str2);
        if (cachedResponse == null) {
        }
        requestReferenceFromServer(obj, str, keyForParentObject, objArr);
    }

    private void broadcastWaitersData(ArrayList<Waiter> arrayList, TLObject tLObject) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Waiter waiter = arrayList.get(i);
            onRequestComplete(waiter.locationKey, waiter.parentKey, tLObject, i == size + (-1), false);
            i++;
        }
        arrayList.clear();
    }

    private void requestReferenceFromServer(Object obj, final String str, final String str2, Object[] objArr) {
        if (obj instanceof TLRPC$TL_availableReaction) {
            TLRPC$TL_messages_getAvailableReactions tLRPC$TL_messages_getAvailableReactions = new TLRPC$TL_messages_getAvailableReactions();
            tLRPC$TL_messages_getAvailableReactions.hash = 0;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getAvailableReactions, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda25
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$0(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof TLRPC$BotInfo) {
            TLRPC$TL_users_getFullUser tLRPC$TL_users_getFullUser = new TLRPC$TL_users_getFullUser();
            tLRPC$TL_users_getFullUser.id = getMessagesController().getInputUser(((TLRPC$BotInfo) obj).user_id);
            getConnectionsManager().sendRequest(tLRPC$TL_users_getFullUser, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda18
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$1(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof TLRPC$TL_attachMenuBot) {
            TLRPC$TL_messages_getAttachMenuBot tLRPC$TL_messages_getAttachMenuBot = new TLRPC$TL_messages_getAttachMenuBot();
            tLRPC$TL_messages_getAttachMenuBot.bot = getMessagesController().getInputUser(((TLRPC$TL_attachMenuBot) obj).bot_id);
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getAttachMenuBot, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda19
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$2(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            if (messageObject.scheduled) {
                TLRPC$TL_messages_getScheduledMessages tLRPC$TL_messages_getScheduledMessages = new TLRPC$TL_messages_getScheduledMessages();
                tLRPC$TL_messages_getScheduledMessages.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                tLRPC$TL_messages_getScheduledMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getScheduledMessages, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda28
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$3(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
            } else if (channelId != 0) {
                TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                tLRPC$TL_channels_getMessages.channel = getMessagesController().getInputChannel(channelId);
                tLRPC$TL_channels_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tLRPC$TL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda33
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$4(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages = new TLRPC$TL_messages_getMessages();
                tLRPC$TL_messages_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda31
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$5(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
            }
        } else if (obj instanceof TLRPC$TL_wallPaper) {
            TLRPC$TL_wallPaper tLRPC$TL_wallPaper = (TLRPC$TL_wallPaper) obj;
            TLRPC$TL_account_getWallPaper tLRPC$TL_account_getWallPaper = new TLRPC$TL_account_getWallPaper();
            TLRPC$TL_inputWallPaper tLRPC$TL_inputWallPaper = new TLRPC$TL_inputWallPaper();
            tLRPC$TL_inputWallPaper.id = tLRPC$TL_wallPaper.id;
            tLRPC$TL_inputWallPaper.access_hash = tLRPC$TL_wallPaper.access_hash;
            tLRPC$TL_account_getWallPaper.wallpaper = tLRPC$TL_inputWallPaper;
            getConnectionsManager().sendRequest(tLRPC$TL_account_getWallPaper, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda29
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$6(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof TLRPC$TL_theme) {
            TLRPC$TL_theme tLRPC$TL_theme = (TLRPC$TL_theme) obj;
            TLRPC$TL_account_getTheme tLRPC$TL_account_getTheme = new TLRPC$TL_account_getTheme();
            TLRPC$TL_inputTheme tLRPC$TL_inputTheme = new TLRPC$TL_inputTheme();
            tLRPC$TL_inputTheme.id = tLRPC$TL_theme.id;
            tLRPC$TL_inputTheme.access_hash = tLRPC$TL_theme.access_hash;
            tLRPC$TL_account_getTheme.theme = tLRPC$TL_inputTheme;
            tLRPC$TL_account_getTheme.format = "android";
            getConnectionsManager().sendRequest(tLRPC$TL_account_getTheme, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda24
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$7(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof TLRPC$WebPage) {
            TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage = new TLRPC$TL_messages_getWebPage();
            tLRPC$TL_messages_getWebPage.url = ((TLRPC$WebPage) obj).url;
            tLRPC$TL_messages_getWebPage.hash = 0;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getWebPage, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda17
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$8(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof TLRPC$User) {
            TLRPC$TL_users_getUsers tLRPC$TL_users_getUsers = new TLRPC$TL_users_getUsers();
            tLRPC$TL_users_getUsers.id.add(getMessagesController().getInputUser((TLRPC$User) obj));
            getConnectionsManager().sendRequest(tLRPC$TL_users_getUsers, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda16
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$9(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof TLRPC$Chat) {
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) obj;
            if (tLRPC$Chat instanceof TLRPC$TL_chat) {
                TLRPC$TL_messages_getChats tLRPC$TL_messages_getChats = new TLRPC$TL_messages_getChats();
                tLRPC$TL_messages_getChats.id.add(Long.valueOf(tLRPC$Chat.id));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getChats, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda32
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$10(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
            } else if (!(tLRPC$Chat instanceof TLRPC$TL_channel)) {
            } else {
                TLRPC$TL_channels_getChannels tLRPC$TL_channels_getChannels = new TLRPC$TL_channels_getChannels();
                tLRPC$TL_channels_getChannels.id.add(MessagesController.getInputChannel(tLRPC$Chat));
                getConnectionsManager().sendRequest(tLRPC$TL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda15
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$11(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
            }
        } else if (obj instanceof String) {
            String str3 = (String) obj;
            if ("wallpaper".equals(str3)) {
                if (this.wallpaperWaiters.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC$TL_account_getWallPapers(), new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda12
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$12(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                this.wallpaperWaiters.add(new Waiter(str, str2));
            } else if (str3.startsWith("gif")) {
                if (this.savedGifsWaiters.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC$TL_messages_getSavedGifs(), new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda11
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$13(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                this.savedGifsWaiters.add(new Waiter(str, str2));
            } else if ("recent".equals(str3)) {
                if (this.recentStickersWaiter.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC$TL_messages_getRecentStickers(), new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda13
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$14(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                this.recentStickersWaiter.add(new Waiter(str, str2));
            } else if ("fav".equals(str3)) {
                if (this.favStickersWaiter.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC$TL_messages_getFavedStickers(), new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda10
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$15(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                this.favStickersWaiter.add(new Waiter(str, str2));
            } else if ("update".equals(str3)) {
                TLRPC$TL_help_getAppUpdate tLRPC$TL_help_getAppUpdate = new TLRPC$TL_help_getAppUpdate();
                try {
                    tLRPC$TL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                } catch (Exception unused) {
                }
                if (tLRPC$TL_help_getAppUpdate.source == null) {
                    tLRPC$TL_help_getAppUpdate.source = "";
                }
                getConnectionsManager().sendRequest(tLRPC$TL_help_getAppUpdate, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda14
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$16(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
            } else if (str3.startsWith("avatar_")) {
                long longValue = Utilities.parseLong(str3).longValue();
                if (longValue > 0) {
                    TLRPC$TL_photos_getUserPhotos tLRPC$TL_photos_getUserPhotos = new TLRPC$TL_photos_getUserPhotos();
                    tLRPC$TL_photos_getUserPhotos.limit = 80;
                    tLRPC$TL_photos_getUserPhotos.offset = 0;
                    tLRPC$TL_photos_getUserPhotos.max_id = 0L;
                    tLRPC$TL_photos_getUserPhotos.user_id = getMessagesController().getInputUser(longValue);
                    getConnectionsManager().sendRequest(tLRPC$TL_photos_getUserPhotos, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda26
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$17(str, str2, tLObject, tLRPC$TL_error);
                        }
                    });
                    return;
                }
                TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
                tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterChatPhotos();
                tLRPC$TL_messages_search.limit = 80;
                tLRPC$TL_messages_search.offset_id = 0;
                tLRPC$TL_messages_search.q = "";
                tLRPC$TL_messages_search.peer = getMessagesController().getInputPeer(longValue);
                getConnectionsManager().sendRequest(tLRPC$TL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda21
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$18(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
            } else if (str3.startsWith("sent_")) {
                String[] split = str3.split("_");
                if (split.length == 3) {
                    long longValue2 = Utilities.parseLong(split[1]).longValue();
                    if (longValue2 != 0) {
                        TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages2 = new TLRPC$TL_channels_getMessages();
                        tLRPC$TL_channels_getMessages2.channel = getMessagesController().getInputChannel(longValue2);
                        tLRPC$TL_channels_getMessages2.id.add(Utilities.parseInt((CharSequence) split[2]));
                        getConnectionsManager().sendRequest(tLRPC$TL_channels_getMessages2, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda23
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                FileRefController.this.lambda$requestReferenceFromServer$19(str, str2, tLObject, tLRPC$TL_error);
                            }
                        });
                        return;
                    }
                    TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages2 = new TLRPC$TL_messages_getMessages();
                    tLRPC$TL_messages_getMessages2.id.add(Utilities.parseInt((CharSequence) split[2]));
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages2, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda27
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$20(str, str2, tLObject, tLRPC$TL_error);
                        }
                    });
                    return;
                }
                sendErrorToObject(objArr, 0);
            } else {
                sendErrorToObject(objArr, 0);
            }
        } else if (obj instanceof TLRPC$TL_messages_stickerSet) {
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
            tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
            TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$TL_messages_stickerSet) obj).set;
            tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
            tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda20
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$21(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof TLRPC$StickerSetCovered) {
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet2 = new TLRPC$TL_messages_getStickerSet();
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID2 = new TLRPC$TL_inputStickerSetID();
            tLRPC$TL_messages_getStickerSet2.stickerset = tLRPC$TL_inputStickerSetID2;
            TLRPC$StickerSet tLRPC$StickerSet2 = ((TLRPC$StickerSetCovered) obj).set;
            tLRPC$TL_inputStickerSetID2.id = tLRPC$StickerSet2.id;
            tLRPC$TL_inputStickerSetID2.access_hash = tLRPC$StickerSet2.access_hash;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet2, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda22
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$22(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else if (obj instanceof TLRPC$InputStickerSet) {
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet3 = new TLRPC$TL_messages_getStickerSet();
            tLRPC$TL_messages_getStickerSet3.stickerset = (TLRPC$InputStickerSet) obj;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet3, new RequestDelegate() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda30
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$23(str, str2, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            sendErrorToObject(objArr, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$0(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$1(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$2(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$3(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$4(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$5(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$6(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$7(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$8(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$9(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$10(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$11(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$12(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        broadcastWaitersData(this.wallpaperWaiters, tLObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$13(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        broadcastWaitersData(this.savedGifsWaiters, tLObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$14(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        broadcastWaitersData(this.recentStickersWaiter, tLObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$15(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        broadcastWaitersData(this.favStickersWaiter, tLObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$16(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$17(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$18(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$19(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$20(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$21(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$22(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestReferenceFromServer$23(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, true, false);
    }

    private boolean isSameReference(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private boolean onUpdateObjectReference(final Requester requester, byte[] bArr, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean z) {
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("fileref updated for " + requester.args[0] + " " + requester.locationKey);
        }
        if (requester.args[0] instanceof TLRPC$TL_inputSingleMedia) {
            final TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia = (TLRPC$TL_messages_sendMultiMedia) requester.args[1];
            final Object[] objArr = this.multiMediaCache.get(tLRPC$TL_messages_sendMultiMedia);
            if (objArr == null) {
                return true;
            }
            TLRPC$TL_inputSingleMedia tLRPC$TL_inputSingleMedia = (TLRPC$TL_inputSingleMedia) requester.args[0];
            TLRPC$InputMedia tLRPC$InputMedia = tLRPC$TL_inputSingleMedia.media;
            if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaDocument) {
                TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument = (TLRPC$TL_inputMediaDocument) tLRPC$InputMedia;
                if (z && isSameReference(tLRPC$TL_inputMediaDocument.id.file_reference, bArr)) {
                    return false;
                }
                tLRPC$TL_inputMediaDocument.id.file_reference = bArr;
            } else if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaPhoto) {
                TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto = (TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia;
                if (z && isSameReference(tLRPC$TL_inputMediaPhoto.id.file_reference, bArr)) {
                    return false;
                }
                tLRPC$TL_inputMediaPhoto.id.file_reference = bArr;
            }
            int indexOf = tLRPC$TL_messages_sendMultiMedia.multi_media.indexOf(tLRPC$TL_inputSingleMedia);
            if (indexOf < 0) {
                return true;
            }
            ArrayList arrayList = (ArrayList) objArr[3];
            arrayList.set(indexOf, null);
            boolean z2 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != null) {
                    z2 = false;
                }
            }
            if (z2) {
                this.multiMediaCache.remove(tLRPC$TL_messages_sendMultiMedia);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileRefController.this.lambda$onUpdateObjectReference$24(tLRPC$TL_messages_sendMultiMedia, objArr);
                    }
                });
            }
        } else if (!(requester.args[0] instanceof TLRPC$TL_messages_sendMedia)) {
            if (!(requester.args[0] instanceof TLRPC$TL_messages_editMessage)) {
                if (requester.args[0] instanceof TLRPC$TL_messages_saveGif) {
                    TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif = (TLRPC$TL_messages_saveGif) requester.args[0];
                    if (z && isSameReference(tLRPC$TL_messages_saveGif.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_messages_saveGif.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_saveGif, FileRefController$$ExternalSyntheticLambda34.INSTANCE);
                } else if (requester.args[0] instanceof TLRPC$TL_messages_saveRecentSticker) {
                    TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker = (TLRPC$TL_messages_saveRecentSticker) requester.args[0];
                    if (z && isSameReference(tLRPC$TL_messages_saveRecentSticker.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_messages_saveRecentSticker.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_saveRecentSticker, FileRefController$$ExternalSyntheticLambda35.INSTANCE);
                } else if (requester.args[0] instanceof TLRPC$TL_messages_faveSticker) {
                    TLRPC$TL_messages_faveSticker tLRPC$TL_messages_faveSticker = (TLRPC$TL_messages_faveSticker) requester.args[0];
                    if (z && isSameReference(tLRPC$TL_messages_faveSticker.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_messages_faveSticker.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_faveSticker, FileRefController$$ExternalSyntheticLambda36.INSTANCE);
                } else if (requester.args[0] instanceof TLRPC$TL_messages_getAttachedStickers) {
                    TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers = (TLRPC$TL_messages_getAttachedStickers) requester.args[0];
                    TLRPC$InputStickeredMedia tLRPC$InputStickeredMedia = tLRPC$TL_messages_getAttachedStickers.media;
                    if (tLRPC$InputStickeredMedia instanceof TLRPC$TL_inputStickeredMediaDocument) {
                        TLRPC$TL_inputStickeredMediaDocument tLRPC$TL_inputStickeredMediaDocument = (TLRPC$TL_inputStickeredMediaDocument) tLRPC$InputStickeredMedia;
                        if (z && isSameReference(tLRPC$TL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                            return false;
                        }
                        tLRPC$TL_inputStickeredMediaDocument.id.file_reference = bArr;
                    } else if (tLRPC$InputStickeredMedia instanceof TLRPC$TL_inputStickeredMediaPhoto) {
                        TLRPC$TL_inputStickeredMediaPhoto tLRPC$TL_inputStickeredMediaPhoto = (TLRPC$TL_inputStickeredMediaPhoto) tLRPC$InputStickeredMedia;
                        if (z && isSameReference(tLRPC$TL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                            return false;
                        }
                        tLRPC$TL_inputStickeredMediaPhoto.id.file_reference = bArr;
                    }
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_getAttachedStickers, (RequestDelegate) requester.args[1]);
                } else if (requester.args[1] instanceof FileLoadOperation) {
                    FileLoadOperation fileLoadOperation = (FileLoadOperation) requester.args[1];
                    if (tLRPC$InputFileLocation == null) {
                        if (z && isSameReference(requester.location.file_reference, bArr)) {
                            return false;
                        }
                        requester.location.file_reference = bArr;
                    } else if (z && isSameReference(fileLoadOperation.location.file_reference, tLRPC$InputFileLocation.file_reference)) {
                        return false;
                    } else {
                        fileLoadOperation.location = tLRPC$InputFileLocation;
                    }
                    fileLoadOperation.requestingReference = false;
                    fileLoadOperation.startDownloadRequest();
                }
            } else {
                TLRPC$InputMedia tLRPC$InputMedia2 = ((TLRPC$TL_messages_editMessage) requester.args[0]).media;
                if (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaDocument) {
                    TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument2 = (TLRPC$TL_inputMediaDocument) tLRPC$InputMedia2;
                    if (z && isSameReference(tLRPC$TL_inputMediaDocument2.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_inputMediaDocument2.id.file_reference = bArr;
                } else if (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaPhoto) {
                    TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto2 = (TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia2;
                    if (z && isSameReference(tLRPC$TL_inputMediaPhoto2.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_inputMediaPhoto2.id.file_reference = bArr;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileRefController.this.lambda$onUpdateObjectReference$26(requester);
                    }
                });
            }
        } else {
            TLRPC$InputMedia tLRPC$InputMedia3 = ((TLRPC$TL_messages_sendMedia) requester.args[0]).media;
            if (tLRPC$InputMedia3 instanceof TLRPC$TL_inputMediaDocument) {
                TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument3 = (TLRPC$TL_inputMediaDocument) tLRPC$InputMedia3;
                if (z && isSameReference(tLRPC$TL_inputMediaDocument3.id.file_reference, bArr)) {
                    return false;
                }
                tLRPC$TL_inputMediaDocument3.id.file_reference = bArr;
            } else if (tLRPC$InputMedia3 instanceof TLRPC$TL_inputMediaPhoto) {
                TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto3 = (TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia3;
                if (z && isSameReference(tLRPC$TL_inputMediaPhoto3.id.file_reference, bArr)) {
                    return false;
                }
                tLRPC$TL_inputMediaPhoto3.id.file_reference = bArr;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FileRefController.this.lambda$onUpdateObjectReference$25(requester);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$24(TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia, Object[] objArr) {
        getSendMessagesHelper().performSendMessageRequestMulti(tLRPC$TL_messages_sendMultiMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$25(Requester requester) {
        getSendMessagesHelper().performSendMessageRequest((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateObjectReference$26(Requester requester) {
        getSendMessagesHelper().performSendMessageRequest((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    private void sendErrorToObject(final Object[] objArr, int i) {
        if (objArr[0] instanceof TLRPC$TL_inputSingleMedia) {
            final TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia = (TLRPC$TL_messages_sendMultiMedia) objArr[1];
            final Object[] objArr2 = this.multiMediaCache.get(tLRPC$TL_messages_sendMultiMedia);
            if (objArr2 == null) {
                return;
            }
            this.multiMediaCache.remove(tLRPC$TL_messages_sendMultiMedia);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    FileRefController.this.lambda$sendErrorToObject$30(tLRPC$TL_messages_sendMultiMedia, objArr2);
                }
            });
        } else if ((objArr[0] instanceof TLRPC$TL_messages_sendMedia) || (objArr[0] instanceof TLRPC$TL_messages_editMessage)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    FileRefController.this.lambda$sendErrorToObject$31(objArr);
                }
            });
        } else if (objArr[0] instanceof TLRPC$TL_messages_saveGif) {
            TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif = (TLRPC$TL_messages_saveGif) objArr[0];
        } else if (objArr[0] instanceof TLRPC$TL_messages_saveRecentSticker) {
            TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker = (TLRPC$TL_messages_saveRecentSticker) objArr[0];
        } else if (objArr[0] instanceof TLRPC$TL_messages_faveSticker) {
            TLRPC$TL_messages_faveSticker tLRPC$TL_messages_faveSticker = (TLRPC$TL_messages_faveSticker) objArr[0];
        } else if (objArr[0] instanceof TLRPC$TL_messages_getAttachedStickers) {
            getConnectionsManager().sendRequest((TLRPC$TL_messages_getAttachedStickers) objArr[0], (RequestDelegate) objArr[1]);
        } else if (i == 0) {
            TLRPC$TL_error tLRPC$TL_error = new TLRPC$TL_error();
            tLRPC$TL_error.text = "not found parent object to request reference";
            tLRPC$TL_error.code = 400;
            if (!(objArr[1] instanceof FileLoadOperation)) {
                return;
            }
            FileLoadOperation fileLoadOperation = (FileLoadOperation) objArr[1];
            fileLoadOperation.requestingReference = false;
            fileLoadOperation.processRequestResult((FileLoadOperation.RequestInfo) objArr[2], tLRPC$TL_error);
        } else if (i != 1 || !(objArr[1] instanceof FileLoadOperation)) {
        } else {
            FileLoadOperation fileLoadOperation2 = (FileLoadOperation) objArr[1];
            fileLoadOperation2.requestingReference = false;
            fileLoadOperation2.onFail(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendErrorToObject$30(TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia, Object[] objArr) {
        getSendMessagesHelper().performSendMessageRequestMulti(tLRPC$TL_messages_sendMultiMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendErrorToObject$31(Object[] objArr) {
        getSendMessagesHelper().performSendMessageRequest((TLObject) objArr[0], (MessageObject) objArr[1], (String) objArr[2], (SendMessagesHelper.DelayedMessage) objArr[3], ((Boolean) objArr[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) objArr[5], null, null, ((Boolean) objArr[6]).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b A[LOOP:2: B:51:0x00cf->B:59:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0570  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onRequestComplete(String str, String str2, TLObject tLObject, boolean z, boolean z2) {
        String str3;
        String str4;
        boolean z3;
        ArrayList<Requester> arrayList;
        ArrayList<Requester> arrayList2;
        TLRPC$InputFileLocation tLRPC$InputFileLocation;
        TLRPC$Vector tLRPC$Vector;
        byte[] fileReference;
        byte[] bArr;
        boolean z4;
        TLRPC$InputFileLocation tLRPC$InputFileLocation2;
        byte[] fileReference2;
        ArrayList<Requester> arrayList3;
        int i;
        boolean z5 = tLObject instanceof TLRPC$TL_account_wallPapers;
        if (z5) {
            str4 = "wallpaper";
        } else if (tLObject instanceof TLRPC$TL_messages_savedGifs) {
            str4 = "gif";
        } else if (tLObject instanceof TLRPC$TL_messages_recentStickers) {
            str4 = "recent";
        } else if (!(tLObject instanceof TLRPC$TL_messages_favedStickers)) {
            str3 = str2;
            int i2 = 1;
            if (str2 != null || (arrayList3 = this.parentRequester.get(str2)) == null) {
                z3 = false;
            } else {
                int size = arrayList3.size();
                int i3 = 0;
                z3 = false;
                while (i3 < size) {
                    Requester requester = arrayList3.get(i3);
                    if (requester.completed) {
                        i = i3;
                    } else {
                        i = i3;
                        if (onRequestComplete(requester.locationKey, null, tLObject, z && !z3, z2)) {
                            z3 = true;
                        }
                    }
                    i3 = i + 1;
                }
                if (z3) {
                    putReponseToCache(str3, tLObject);
                }
                this.parentRequester.remove(str2);
            }
            arrayList = this.locationRequester.get(str);
            if (arrayList != null) {
                return z3;
            }
            int size2 = arrayList.size();
            int i4 = 0;
            boolean[] zArr = null;
            TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr = null;
            byte[] bArr2 = null;
            while (i4 < size2) {
                Requester requester2 = arrayList.get(i4);
                if (requester2.completed) {
                    arrayList2 = arrayList;
                } else {
                    if ((requester2.location instanceof TLRPC$TL_inputFileLocation) || (requester2.location instanceof TLRPC$TL_inputPeerPhotoFileLocation)) {
                        tLRPC$InputFileLocationArr = new TLRPC$InputFileLocation[i2];
                        zArr = new boolean[i2];
                    }
                    requester2.completed = i2;
                    if (tLObject instanceof TLRPC$messages_Messages) {
                        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                        if (!tLRPC$messages_Messages.messages.isEmpty()) {
                            int size3 = tLRPC$messages_Messages.messages.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    arrayList2 = arrayList;
                                    break;
                                }
                                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i5);
                                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                                if (tLRPC$MessageMedia != null) {
                                    arrayList2 = arrayList;
                                    TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
                                    if (tLRPC$Document != null) {
                                        fileReference2 = getFileReference(tLRPC$Document, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                    } else {
                                        TLRPC$TL_game tLRPC$TL_game = tLRPC$MessageMedia.game;
                                        if (tLRPC$TL_game != null) {
                                            fileReference2 = getFileReference(tLRPC$TL_game.document, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            if (fileReference2 == null) {
                                                fileReference2 = getFileReference(tLRPC$Message.media.game.photo, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            }
                                        } else {
                                            TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia.photo;
                                            if (tLRPC$Photo != null) {
                                                fileReference2 = getFileReference(tLRPC$Photo, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            } else {
                                                TLRPC$WebPage tLRPC$WebPage = tLRPC$MessageMedia.webpage;
                                                if (tLRPC$WebPage != null) {
                                                    fileReference2 = getFileReference(tLRPC$WebPage, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                                }
                                                if (bArr2 == null) {
                                                    i5++;
                                                    arrayList = arrayList2;
                                                } else if (z) {
                                                    getMessagesStorage().replaceMessageIfExists(tLRPC$Message, tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, false);
                                                }
                                            }
                                        }
                                    }
                                    bArr2 = fileReference2;
                                    if (bArr2 == null) {
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                    TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
                                    if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionChatEditPhoto) {
                                        fileReference2 = getFileReference(tLRPC$MessageAction.photo, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                        bArr2 = fileReference2;
                                    }
                                    if (bArr2 == null) {
                                    }
                                }
                            }
                            if (bArr2 == null) {
                                getMessagesStorage().replaceMessageIfExists(tLRPC$messages_Messages.messages.get(0), tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true);
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("file ref not found in messages, replacing message");
                                }
                            }
                        } else {
                            arrayList2 = arrayList;
                        }
                    } else {
                        arrayList2 = arrayList;
                        if (tLObject instanceof TLRPC$TL_messages_availableReactions) {
                            TLRPC$TL_messages_availableReactions tLRPC$TL_messages_availableReactions = (TLRPC$TL_messages_availableReactions) tLObject;
                            getMediaDataController().processLoadedReactions(tLRPC$TL_messages_availableReactions.reactions, tLRPC$TL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
                            Iterator<TLRPC$TL_availableReaction> it = tLRPC$TL_messages_availableReactions.reactions.iterator();
                            while (it.hasNext()) {
                                TLRPC$TL_availableReaction next = it.next();
                                bArr2 = getFileReference(next.static_icon, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (bArr2 != null) {
                                    break;
                                }
                                bArr2 = getFileReference(next.appear_animation, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (bArr2 != null) {
                                    break;
                                }
                                bArr2 = getFileReference(next.select_animation, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (bArr2 != null) {
                                    break;
                                }
                                bArr2 = getFileReference(next.activate_animation, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (bArr2 != null) {
                                    break;
                                }
                                bArr2 = getFileReference(next.effect_animation, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (bArr2 != null) {
                                    break;
                                }
                                bArr2 = getFileReference(next.around_animation, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (bArr2 != null) {
                                    break;
                                }
                                bArr2 = getFileReference(next.center_icon, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (bArr2 != null) {
                                    break;
                                }
                            }
                        } else if (tLObject instanceof TLRPC$TL_users_userFull) {
                            TLRPC$TL_users_userFull tLRPC$TL_users_userFull = (TLRPC$TL_users_userFull) tLObject;
                            getMessagesController().putUsers(tLRPC$TL_users_userFull.users, false);
                            getMessagesController().putChats(tLRPC$TL_users_userFull.chats, false);
                            TLRPC$UserFull tLRPC$UserFull = tLRPC$TL_users_userFull.full_user;
                            TLRPC$BotInfo tLRPC$BotInfo = tLRPC$UserFull.bot_info;
                            if (tLRPC$BotInfo != null) {
                                getMessagesStorage().updateUserInfo(tLRPC$UserFull, true);
                                bArr2 = getFileReference(tLRPC$BotInfo.description_document, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (bArr2 == null) {
                                    bArr2 = getFileReference(tLRPC$BotInfo.description_photo, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                }
                            }
                        } else if (tLObject instanceof TLRPC$TL_attachMenuBotsBot) {
                            TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot = ((TLRPC$TL_attachMenuBotsBot) tLObject).bot;
                            Iterator<TLRPC$TL_attachMenuBotIcon> it2 = tLRPC$TL_attachMenuBot.icons.iterator();
                            while (it2.hasNext() && (bArr2 = getFileReference(it2.next().icon, requester2.location, zArr, tLRPC$InputFileLocationArr)) == null) {
                            }
                            if (z) {
                                TLRPC$TL_attachMenuBots attachMenuBots = getMediaDataController().getAttachMenuBots();
                                ArrayList<TLRPC$TL_attachMenuBot> arrayList4 = new ArrayList<>(attachMenuBots.bots);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        bArr = bArr2;
                                        break;
                                    }
                                    bArr = bArr2;
                                    if (arrayList4.get(i6).bot_id == tLRPC$TL_attachMenuBot.bot_id) {
                                        arrayList4.set(i6, tLRPC$TL_attachMenuBot);
                                        break;
                                    }
                                    i6++;
                                    bArr2 = bArr;
                                }
                                attachMenuBots.bots = arrayList4;
                                getMediaDataController().processLoadedMenuBots(attachMenuBots, attachMenuBots.hash, (int) (System.currentTimeMillis() / 1000), false);
                            } else {
                                bArr = bArr2;
                            }
                            bArr2 = bArr;
                        } else {
                            if (tLObject instanceof TLRPC$TL_help_appUpdate) {
                                TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate = (TLRPC$TL_help_appUpdate) tLObject;
                                fileReference = getFileReference(tLRPC$TL_help_appUpdate.document, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (fileReference == null) {
                                    fileReference = getFileReference(tLRPC$TL_help_appUpdate.sticker, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                }
                            } else if (tLObject instanceof TLRPC$WebPage) {
                                bArr2 = getFileReference((TLRPC$WebPage) tLObject, requester2.location, zArr, tLRPC$InputFileLocationArr);
                            } else if (z5) {
                                TLRPC$TL_account_wallPapers tLRPC$TL_account_wallPapers = (TLRPC$TL_account_wallPapers) tLObject;
                                int size4 = tLRPC$TL_account_wallPapers.wallpapers.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    bArr2 = getFileReference(tLRPC$TL_account_wallPapers.wallpapers.get(i7).document, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                    if (bArr2 != null) {
                                        break;
                                    }
                                }
                                if (bArr2 != null && z) {
                                    getMessagesStorage().putWallpapers(tLRPC$TL_account_wallPapers.wallpapers, 1);
                                }
                            } else if (tLObject instanceof TLRPC$TL_wallPaper) {
                                TLRPC$TL_wallPaper tLRPC$TL_wallPaper = (TLRPC$TL_wallPaper) tLObject;
                                fileReference = getFileReference(tLRPC$TL_wallPaper.document, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (fileReference != null && z) {
                                    ArrayList<TLRPC$WallPaper> arrayList5 = new ArrayList<>();
                                    arrayList5.add(tLRPC$TL_wallPaper);
                                    getMessagesStorage().putWallpapers(arrayList5, 0);
                                }
                            } else if (tLObject instanceof TLRPC$TL_theme) {
                                final TLRPC$TL_theme tLRPC$TL_theme = (TLRPC$TL_theme) tLObject;
                                fileReference = getFileReference(tLRPC$TL_theme.document, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                if (fileReference != null && z) {
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Theme.setThemeFileReference(TLRPC$TL_theme.this);
                                        }
                                    });
                                }
                            } else if (tLObject instanceof TLRPC$Vector) {
                                TLRPC$Vector tLRPC$Vector2 = (TLRPC$Vector) tLObject;
                                if (!tLRPC$Vector2.objects.isEmpty()) {
                                    int size5 = tLRPC$Vector2.objects.size();
                                    int i8 = 0;
                                    while (i8 < size5) {
                                        Object obj = tLRPC$Vector2.objects.get(i8);
                                        if (obj instanceof TLRPC$User) {
                                            final TLRPC$User tLRPC$User = (TLRPC$User) obj;
                                            bArr2 = getFileReference(tLRPC$User, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            if (!z || bArr2 == null) {
                                                tLRPC$Vector = tLRPC$Vector2;
                                            } else {
                                                ArrayList<TLRPC$User> arrayList6 = new ArrayList<>();
                                                arrayList6.add(tLRPC$User);
                                                tLRPC$Vector = tLRPC$Vector2;
                                                getMessagesStorage().putUsersAndChats(arrayList6, null, true, true);
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda7
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        FileRefController.this.lambda$onRequestComplete$33(tLRPC$User);
                                                    }
                                                });
                                            }
                                        } else {
                                            tLRPC$Vector = tLRPC$Vector2;
                                            if (obj instanceof TLRPC$Chat) {
                                                final TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) obj;
                                                byte[] fileReference3 = getFileReference(tLRPC$Chat, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                                if (z && fileReference3 != null) {
                                                    ArrayList<TLRPC$Chat> arrayList7 = new ArrayList<>();
                                                    arrayList7.add(tLRPC$Chat);
                                                    getMessagesStorage().putUsersAndChats(null, arrayList7, true, true);
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            FileRefController.this.lambda$onRequestComplete$34(tLRPC$Chat);
                                                        }
                                                    });
                                                }
                                                bArr2 = fileReference3;
                                            }
                                        }
                                        if (bArr2 != null) {
                                            break;
                                        }
                                        i8++;
                                        tLRPC$Vector2 = tLRPC$Vector;
                                    }
                                }
                            } else {
                                if (tLObject instanceof TLRPC$TL_messages_chats) {
                                    TLRPC$TL_messages_chats tLRPC$TL_messages_chats = (TLRPC$TL_messages_chats) tLObject;
                                    if (!tLRPC$TL_messages_chats.chats.isEmpty()) {
                                        int size6 = tLRPC$TL_messages_chats.chats.size();
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= size6) {
                                                break;
                                            }
                                            final TLRPC$Chat tLRPC$Chat2 = tLRPC$TL_messages_chats.chats.get(i9);
                                            bArr2 = getFileReference(tLRPC$Chat2, requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            if (bArr2 == null) {
                                                i9++;
                                            } else if (z) {
                                                ArrayList<TLRPC$Chat> arrayList8 = new ArrayList<>();
                                                arrayList8.add(tLRPC$Chat2);
                                                tLRPC$InputFileLocation = null;
                                                getMessagesStorage().putUsersAndChats(null, arrayList8, true, true);
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        FileRefController.this.lambda$onRequestComplete$35(tLRPC$Chat2);
                                                    }
                                                });
                                            }
                                        }
                                    }
                                } else {
                                    tLRPC$InputFileLocation = null;
                                    if (tLObject instanceof TLRPC$TL_messages_savedGifs) {
                                        TLRPC$TL_messages_savedGifs tLRPC$TL_messages_savedGifs = (TLRPC$TL_messages_savedGifs) tLObject;
                                        int size7 = tLRPC$TL_messages_savedGifs.gifs.size();
                                        for (int i10 = 0; i10 < size7; i10++) {
                                            bArr2 = getFileReference(tLRPC$TL_messages_savedGifs.gifs.get(i10), requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            if (bArr2 != null) {
                                                break;
                                            }
                                        }
                                        if (z) {
                                            getMediaDataController().processLoadedRecentDocuments(0, tLRPC$TL_messages_savedGifs.gifs, true, 0, true);
                                        }
                                    } else if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
                                        final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
                                        if (bArr2 == null) {
                                            int size8 = tLRPC$TL_messages_stickerSet.documents.size();
                                            for (int i11 = 0; i11 < size8; i11++) {
                                                bArr2 = getFileReference(tLRPC$TL_messages_stickerSet.documents.get(i11), requester2.location, zArr, tLRPC$InputFileLocationArr);
                                                if (bArr2 != null) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (z) {
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileRefController$$ExternalSyntheticLambda6
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    FileRefController.this.lambda$onRequestComplete$36(tLRPC$TL_messages_stickerSet);
                                                }
                                            });
                                        }
                                    } else if (tLObject instanceof TLRPC$TL_messages_recentStickers) {
                                        TLRPC$TL_messages_recentStickers tLRPC$TL_messages_recentStickers = (TLRPC$TL_messages_recentStickers) tLObject;
                                        int size9 = tLRPC$TL_messages_recentStickers.stickers.size();
                                        for (int i12 = 0; i12 < size9; i12++) {
                                            bArr2 = getFileReference(tLRPC$TL_messages_recentStickers.stickers.get(i12), requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            if (bArr2 != null) {
                                                break;
                                            }
                                        }
                                        if (z) {
                                            getMediaDataController().processLoadedRecentDocuments(0, tLRPC$TL_messages_recentStickers.stickers, false, 0, true);
                                        }
                                    } else if (tLObject instanceof TLRPC$TL_messages_favedStickers) {
                                        TLRPC$TL_messages_favedStickers tLRPC$TL_messages_favedStickers = (TLRPC$TL_messages_favedStickers) tLObject;
                                        int size10 = tLRPC$TL_messages_favedStickers.stickers.size();
                                        for (int i13 = 0; i13 < size10; i13++) {
                                            bArr2 = getFileReference(tLRPC$TL_messages_favedStickers.stickers.get(i13), requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            if (bArr2 != null) {
                                                break;
                                            }
                                        }
                                        if (z) {
                                            getMediaDataController().processLoadedRecentDocuments(2, tLRPC$TL_messages_favedStickers.stickers, false, 0, true);
                                        }
                                    } else if (tLObject instanceof TLRPC$photos_Photos) {
                                        TLRPC$photos_Photos tLRPC$photos_Photos = (TLRPC$photos_Photos) tLObject;
                                        int size11 = tLRPC$photos_Photos.photos.size();
                                        for (int i14 = 0; i14 < size11; i14++) {
                                            bArr2 = getFileReference(tLRPC$photos_Photos.photos.get(i14), requester2.location, zArr, tLRPC$InputFileLocationArr);
                                            if (bArr2 != null) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (bArr2 == null) {
                                    if (tLRPC$InputFileLocationArr != null) {
                                        tLRPC$InputFileLocation2 = tLRPC$InputFileLocationArr[0];
                                        z4 = z2;
                                    } else {
                                        z4 = z2;
                                        tLRPC$InputFileLocation2 = tLRPC$InputFileLocation;
                                    }
                                    if (onUpdateObjectReference(requester2, bArr2, tLRPC$InputFileLocation2, z4)) {
                                        z3 = true;
                                    }
                                } else {
                                    sendErrorToObject(requester2.args, 1);
                                }
                                i4++;
                                arrayList = arrayList2;
                                i2 = 1;
                            }
                            bArr2 = fileReference;
                        }
                    }
                    tLRPC$InputFileLocation = null;
                    if (bArr2 == null) {
                    }
                    i4++;
                    arrayList = arrayList2;
                    i2 = 1;
                }
                i4++;
                arrayList = arrayList2;
                i2 = 1;
            }
            this.locationRequester.remove(str);
            if (z3) {
                putReponseToCache(str, tLObject);
            }
            return z3;
        } else {
            str4 = "fav";
        }
        str3 = str4;
        int i22 = 1;
        if (str2 != null) {
        }
        z3 = false;
        arrayList = this.locationRequester.get(str);
        if (arrayList != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestComplete$33(TLRPC$User tLRPC$User) {
        getMessagesController().putUser(tLRPC$User, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestComplete$34(TLRPC$Chat tLRPC$Chat) {
        getMessagesController().putChat(tLRPC$Chat, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestComplete$35(TLRPC$Chat tLRPC$Chat) {
        getMessagesController().putChat(tLRPC$Chat, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestComplete$36(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        getMediaDataController().replaceStickerSet(tLRPC$TL_messages_stickerSet);
    }

    private void cleanupCache() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastCleanupTime) < 600000) {
            return;
        }
        this.lastCleanupTime = SystemClock.elapsedRealtime();
        ArrayList arrayList = null;
        for (Map.Entry<String, CachedResult> entry : this.responseCache.entrySet()) {
            if (Math.abs(SystemClock.elapsedRealtime() - entry.getValue().firstQueryTime) >= 600000) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(entry.getKey());
            }
        }
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.responseCache.remove(arrayList.get(i));
        }
    }

    private CachedResult getCachedResponse(String str) {
        CachedResult cachedResult = this.responseCache.get(str);
        if (cachedResult == null || Math.abs(SystemClock.elapsedRealtime() - cachedResult.firstQueryTime) < 600000) {
            return cachedResult;
        }
        this.responseCache.remove(str);
        return null;
    }

    private void putReponseToCache(String str, TLObject tLObject) {
        CachedResult cachedResult = this.responseCache.get(str);
        if (cachedResult == null) {
            cachedResult = new CachedResult();
            cachedResult.response = tLObject;
            cachedResult.firstQueryTime = SystemClock.uptimeMillis();
            this.responseCache.put(str, cachedResult);
        }
        cachedResult.lastQueryTime = SystemClock.uptimeMillis();
    }

    private byte[] getFileReference(TLRPC$Document tLRPC$Document, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        if (tLRPC$Document != null && tLRPC$InputFileLocation != null) {
            if (tLRPC$InputFileLocation instanceof TLRPC$TL_inputDocumentFileLocation) {
                if (tLRPC$Document.id == tLRPC$InputFileLocation.id) {
                    return tLRPC$Document.file_reference;
                }
            } else {
                int size = tLRPC$Document.thumbs.size();
                for (int i = 0; i < size; i++) {
                    TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$Document.thumbs.get(i);
                    byte[] fileReference = getFileReference(tLRPC$PhotoSize, tLRPC$InputFileLocation, zArr);
                    if (zArr != null && zArr[0]) {
                        tLRPC$InputFileLocationArr[0] = new TLRPC$TL_inputDocumentFileLocation();
                        tLRPC$InputFileLocationArr[0].id = tLRPC$Document.id;
                        tLRPC$InputFileLocationArr[0].volume_id = tLRPC$InputFileLocation.volume_id;
                        tLRPC$InputFileLocationArr[0].local_id = tLRPC$InputFileLocation.local_id;
                        tLRPC$InputFileLocationArr[0].access_hash = tLRPC$Document.access_hash;
                        TLRPC$InputFileLocation tLRPC$InputFileLocation2 = tLRPC$InputFileLocationArr[0];
                        byte[] bArr = tLRPC$Document.file_reference;
                        tLRPC$InputFileLocation2.file_reference = bArr;
                        tLRPC$InputFileLocationArr[0].thumb_size = tLRPC$PhotoSize.type;
                        return bArr;
                    } else if (fileReference != null) {
                        return fileReference;
                    }
                }
            }
        }
        return null;
    }

    private boolean getPeerReferenceReplacement(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean z, TLRPC$InputFileLocation tLRPC$InputFileLocation, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr, boolean[] zArr) {
        TLRPC$InputPeer tLRPC$TL_inputPeerChat;
        TLRPC$InputPeer tLRPC$InputPeer;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC$TL_inputPeerPhotoFileLocation tLRPC$TL_inputPeerPhotoFileLocation = new TLRPC$TL_inputPeerPhotoFileLocation();
        long j = tLRPC$InputFileLocation.volume_id;
        tLRPC$TL_inputPeerPhotoFileLocation.id = j;
        tLRPC$TL_inputPeerPhotoFileLocation.volume_id = j;
        tLRPC$TL_inputPeerPhotoFileLocation.local_id = tLRPC$InputFileLocation.local_id;
        tLRPC$TL_inputPeerPhotoFileLocation.big = z;
        if (tLRPC$User != null) {
            tLRPC$InputPeer = new TLRPC$TL_inputPeerUser();
            tLRPC$InputPeer.user_id = tLRPC$User.id;
            tLRPC$InputPeer.access_hash = tLRPC$User.access_hash;
            tLRPC$TL_inputPeerPhotoFileLocation.photo_id = tLRPC$User.photo.photo_id;
        } else {
            if (ChatObject.isChannel(tLRPC$Chat)) {
                tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChannel();
                tLRPC$TL_inputPeerChat.channel_id = tLRPC$Chat.id;
                tLRPC$TL_inputPeerChat.access_hash = tLRPC$Chat.access_hash;
            } else {
                tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
                tLRPC$TL_inputPeerChat.chat_id = tLRPC$Chat.id;
            }
            tLRPC$TL_inputPeerPhotoFileLocation.photo_id = tLRPC$Chat.photo.photo_id;
            tLRPC$InputPeer = tLRPC$TL_inputPeerChat;
        }
        tLRPC$TL_inputPeerPhotoFileLocation.peer = tLRPC$InputPeer;
        tLRPC$InputFileLocationArr[0] = tLRPC$TL_inputPeerPhotoFileLocation;
        return true;
    }

    private byte[] getFileReference(TLRPC$User tLRPC$User, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
        if (tLRPC$User == null || (tLRPC$UserProfilePhoto = tLRPC$User.photo) == null || !(tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation)) {
            return null;
        }
        byte[] fileReference = getFileReference(tLRPC$UserProfilePhoto.photo_small, tLRPC$InputFileLocation, zArr);
        if (getPeerReferenceReplacement(tLRPC$User, null, false, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (fileReference == null) {
            fileReference = getFileReference(tLRPC$User.photo.photo_big, tLRPC$InputFileLocation, zArr);
            if (getPeerReferenceReplacement(tLRPC$User, null, true, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
                return new byte[0];
            }
        }
        return fileReference;
    }

    private byte[] getFileReference(TLRPC$Chat tLRPC$Chat, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        TLRPC$ChatPhoto tLRPC$ChatPhoto;
        byte[] bArr = null;
        if (tLRPC$Chat != null && (tLRPC$ChatPhoto = tLRPC$Chat.photo) != null && ((tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation) || (tLRPC$InputFileLocation instanceof TLRPC$TL_inputPeerPhotoFileLocation))) {
            if (tLRPC$InputFileLocation instanceof TLRPC$TL_inputPeerPhotoFileLocation) {
                zArr[0] = true;
                if (!getPeerReferenceReplacement(null, tLRPC$Chat, false, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
                    return null;
                }
                return new byte[0];
            }
            bArr = getFileReference(tLRPC$ChatPhoto.photo_small, tLRPC$InputFileLocation, zArr);
            if (getPeerReferenceReplacement(null, tLRPC$Chat, false, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
                return new byte[0];
            }
            if (bArr == null) {
                bArr = getFileReference(tLRPC$Chat.photo.photo_big, tLRPC$InputFileLocation, zArr);
                if (getPeerReferenceReplacement(null, tLRPC$Chat, true, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
                    return new byte[0];
                }
            }
        }
        return bArr;
    }

    private byte[] getFileReference(TLRPC$Photo tLRPC$Photo, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        if (tLRPC$Photo == null) {
            return null;
        }
        if (tLRPC$InputFileLocation instanceof TLRPC$TL_inputPhotoFileLocation) {
            if (tLRPC$Photo.id != tLRPC$InputFileLocation.id) {
                return null;
            }
            return tLRPC$Photo.file_reference;
        }
        if (tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation) {
            int size = tLRPC$Photo.sizes.size();
            for (int i = 0; i < size; i++) {
                TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$Photo.sizes.get(i);
                byte[] fileReference = getFileReference(tLRPC$PhotoSize, tLRPC$InputFileLocation, zArr);
                if (zArr != null && zArr[0]) {
                    tLRPC$InputFileLocationArr[0] = new TLRPC$TL_inputPhotoFileLocation();
                    tLRPC$InputFileLocationArr[0].id = tLRPC$Photo.id;
                    tLRPC$InputFileLocationArr[0].volume_id = tLRPC$InputFileLocation.volume_id;
                    tLRPC$InputFileLocationArr[0].local_id = tLRPC$InputFileLocation.local_id;
                    tLRPC$InputFileLocationArr[0].access_hash = tLRPC$Photo.access_hash;
                    TLRPC$InputFileLocation tLRPC$InputFileLocation2 = tLRPC$InputFileLocationArr[0];
                    byte[] bArr = tLRPC$Photo.file_reference;
                    tLRPC$InputFileLocation2.file_reference = bArr;
                    tLRPC$InputFileLocationArr[0].thumb_size = tLRPC$PhotoSize.type;
                    return bArr;
                } else if (fileReference != null) {
                    return fileReference;
                }
            }
        }
        return null;
    }

    private byte[] getFileReference(TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr) {
        if (tLRPC$PhotoSize == null || !(tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation)) {
            return null;
        }
        return getFileReference(tLRPC$PhotoSize.location, tLRPC$InputFileLocation, zArr);
    }

    private byte[] getFileReference(TLRPC$FileLocation tLRPC$FileLocation, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr) {
        if (tLRPC$FileLocation == null || !(tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation) || tLRPC$FileLocation.local_id != tLRPC$InputFileLocation.local_id || tLRPC$FileLocation.volume_id != tLRPC$InputFileLocation.volume_id) {
            return null;
        }
        byte[] bArr = tLRPC$FileLocation.file_reference;
        if (bArr == null && zArr != null) {
            zArr[0] = true;
        }
        return bArr;
    }

    private byte[] getFileReference(TLRPC$WebPage tLRPC$WebPage, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        byte[] fileReference = getFileReference(tLRPC$WebPage.document, tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
        if (fileReference != null) {
            return fileReference;
        }
        byte[] fileReference2 = getFileReference(tLRPC$WebPage.photo, tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
        if (fileReference2 != null) {
            return fileReference2;
        }
        if (!tLRPC$WebPage.attributes.isEmpty()) {
            int size = tLRPC$WebPage.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC$TL_webPageAttributeTheme tLRPC$TL_webPageAttributeTheme = tLRPC$WebPage.attributes.get(i);
                int size2 = tLRPC$TL_webPageAttributeTheme.documents.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    byte[] fileReference3 = getFileReference(tLRPC$TL_webPageAttributeTheme.documents.get(i2), tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
                    if (fileReference3 != null) {
                        return fileReference3;
                    }
                }
            }
        }
        TLRPC$Page tLRPC$Page = tLRPC$WebPage.cached_page;
        if (tLRPC$Page == null) {
            return null;
        }
        int size3 = tLRPC$Page.documents.size();
        for (int i3 = 0; i3 < size3; i3++) {
            byte[] fileReference4 = getFileReference(tLRPC$WebPage.cached_page.documents.get(i3), tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
            if (fileReference4 != null) {
                return fileReference4;
            }
        }
        int size4 = tLRPC$WebPage.cached_page.photos.size();
        for (int i4 = 0; i4 < size4; i4++) {
            byte[] fileReference5 = getFileReference(tLRPC$WebPage.cached_page.photos.get(i4), tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
            if (fileReference5 != null) {
                return fileReference5;
            }
        }
        return null;
    }

    public static boolean isFileRefError(String str) {
        return "FILEREF_EXPIRED".equals(str) || "FILE_REFERENCE_EXPIRED".equals(str) || "FILE_REFERENCE_EMPTY".equals(str) || (str != null && str.startsWith("FILE_REFERENCE_"));
    }
}

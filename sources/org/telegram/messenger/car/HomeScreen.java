package org.telegram.messenger.car;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationCallback;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.OnClickListener;
import androidx.car.app.model.Row;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabContents;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.Template;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.car.HomeScreen;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes3.dex */
public class HomeScreen extends Screen implements DefaultLifecycleObserver, NotificationCenter.NotificationCenterDelegate {
    private String activeTabId;
    private int currentAccount;
    private boolean musicLoadKicked;
    private final long sessionStartMillis;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public HomeScreen(CarContext carContext) {
        super(carContext);
        this.activeTabId = "tab_notifications";
        this.sessionStartMillis = System.currentTimeMillis();
        this.currentAccount = UserConfig.selectedAccount;
        getLifecycle().addObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner) {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.activeAccountChanged) {
            this.currentAccount = UserConfig.selectedAccount;
            this.musicLoadKicked = false;
            invalidate();
        } else if ((i == NotificationCenter.pushMessagesUpdated || i == NotificationCenter.notificationsCountUpdated) && "tab_notifications".equals(this.activeTabId)) {
            invalidate();
        }
    }

    @Override // androidx.car.app.Screen
    public Template onGetTemplate() {
        TabTemplate.Builder builder = new TabTemplate.Builder(new TabTemplate.TabCallback() { // from class: org.telegram.messenger.car.HomeScreen.1
            @Override // androidx.car.app.model.TabTemplate.TabCallback
            public void onTabSelected(String str) {
                HomeScreen.this.activeTabId = str;
                HomeScreen.this.invalidate();
            }
        });
        builder.setHeaderAction(Action.APP_ICON);
        builder.addTab(new Tab.Builder().setContentId("tab_notifications").setIcon(iconResource(R.drawable.msg_notifications)).setTitle(LocaleController.getString(R.string.Notifications)).build());
        builder.addTab(new Tab.Builder().setContentId("tab_music").setIcon(iconResource(R.drawable.filled_widget_music)).setTitle(LocaleController.getString(R.string.Music)).build());
        builder.setActiveTabContentId(this.activeTabId);
        builder.setTabContents(new TabContents.Builder(buildTabContent(this.activeTabId)).build());
        return builder.build();
    }

    private Template buildTabContent(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -2006925890) {
            str.equals("tab_notifications");
        } else if (hashCode == 1942637819 && str.equals("tab_music")) {
            return buildMusicTemplate();
        }
        return buildNotificationsTemplate();
    }

    private Template buildNotificationsTemplate() {
        Map collectUnreadDuringDrive = collectUnreadDuringDrive();
        if (collectUnreadDuringDrive.isEmpty()) {
            return new MessageTemplate.Builder(LocaleController.getString(R.string.NoNewCarMessages)).build();
        }
        ItemList.Builder builder = new ItemList.Builder();
        int i = 0;
        for (Map.Entry entry : collectUnreadDuringDrive.entrySet()) {
            int i2 = i + 1;
            if (i >= 6) {
                break;
            }
            ConversationItem buildConversationItem = buildConversationItem(((Long) entry.getKey()).longValue(), (ArrayList) entry.getValue());
            if (buildConversationItem != null) {
                builder.addItem(buildConversationItem);
            }
            i = i2;
        }
        return new ListTemplate.Builder().setSingleList(builder.build()).build();
    }

    private Map collectUnreadDuringDrive() {
        TLRPC.Message message;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<MessageObject> pushMessagesSnapshot = NotificationsController.getInstance(this.currentAccount).getPushMessagesSnapshot();
        long j = this.sessionStartMillis / 1000;
        Iterator<MessageObject> it = pushMessagesSnapshot.iterator();
        while (it.hasNext()) {
            MessageObject next = it.next();
            if (next != null && (message = next.messageOwner) != null && message.date >= j) {
                long dialogId = next.getDialogId();
                if (!DialogObject.isEncryptedDialog(dialogId) && !UserObject.isReplyUser(dialogId)) {
                    ArrayList arrayList = (ArrayList) linkedHashMap.get(Long.valueOf(dialogId));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(Long.valueOf(dialogId), arrayList);
                    }
                    arrayList.add(next);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ConversationItem buildConversationItem(long j, ArrayList arrayList) {
        TLRPC.Chat chat;
        String str;
        TLRPC.User user;
        boolean z;
        IconCompat loadAvatarIcon;
        TLRPC.User currentUser;
        Person.Builder key;
        ArrayList arrayList2;
        int max;
        IconCompat loadUserAvatarIcon;
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.reverse(arrayList);
        MessagesController messagesController = AccountInstance.getInstance(this.currentAccount).getMessagesController();
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j));
            if (user2 == null) {
                return null;
            }
            user = user2;
            str = ContactsController.formatName(user2.first_name, user2.last_name);
            chat = null;
        } else {
            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j));
            if (chat2 == null) {
                return null;
            }
            String str2 = chat2.title;
            if (str2 == null) {
                str2 = "";
            }
            if (!ChatObject.isChannel(chat2) || ChatObject.isMegagroup(chat2)) {
                chat = chat2;
                str = str2;
                user = null;
                z = true;
                Person.Builder key2 = new Person.Builder().setName(str).setKey(String.valueOf(j));
                loadAvatarIcon = loadAvatarIcon(user, chat);
                if (loadAvatarIcon != null) {
                    key2.setIcon(loadAvatarIcon);
                }
                currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                key = new Person.Builder().setName(LocaleController.getString(R.string.FromYou)).setKey("self_" + UserConfig.getInstance(this.currentAccount).clientUserId);
                if (currentUser != null && (loadUserAvatarIcon = loadUserAvatarIcon(currentUser)) != null) {
                    key.setIcon(loadUserAvatarIcon);
                }
                Person build = key.build();
                arrayList2 = new ArrayList();
                max = Math.max(0, arrayList.size() - 5);
                while (max < arrayList.size()) {
                    int i = max;
                    IconCompat iconCompat = loadAvatarIcon;
                    TLRPC.User user3 = user;
                    TLRPC.User user4 = user;
                    boolean z2 = z;
                    CarMessage buildCarMessage = buildCarMessage((MessageObject) arrayList.get(max), j, z, user3, chat);
                    if (buildCarMessage != null) {
                        arrayList2.add(buildCarMessage);
                    }
                    max = i + 1;
                    z = z2;
                    loadAvatarIcon = iconCompat;
                    user = user4;
                }
                IconCompat iconCompat2 = loadAvatarIcon;
                boolean z3 = z;
                if (!arrayList2.isEmpty()) {
                    return null;
                }
                ConversationItem.Builder conversationCallback = new ConversationItem.Builder().setId(String.valueOf(j)).setTitle(CarText.create(str)).setSelf(build).setMessages(arrayList2).setGroupConversation(z3).setConversationCallback(new TelegramConversationCallback(this.currentAccount, j, ((MessageObject) arrayList.get(arrayList.size() - 1)).getId()));
                if (iconCompat2 != null) {
                    conversationCallback.setIcon(new CarIcon.Builder(iconCompat2).build());
                }
                return conversationCallback.build();
            }
            chat = chat2;
            str = str2;
            user = null;
        }
        z = false;
        Person.Builder key22 = new Person.Builder().setName(str).setKey(String.valueOf(j));
        loadAvatarIcon = loadAvatarIcon(user, chat);
        if (loadAvatarIcon != null) {
        }
        currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        key = new Person.Builder().setName(LocaleController.getString(R.string.FromYou)).setKey("self_" + UserConfig.getInstance(this.currentAccount).clientUserId);
        if (currentUser != null) {
            key.setIcon(loadUserAvatarIcon);
        }
        Person build2 = key.build();
        arrayList2 = new ArrayList();
        max = Math.max(0, arrayList.size() - 5);
        while (max < arrayList.size()) {
        }
        IconCompat iconCompat22 = loadAvatarIcon;
        boolean z32 = z;
        if (!arrayList2.isEmpty()) {
        }
    }

    private CarMessage buildCarMessage(MessageObject messageObject, long j, boolean z, TLRPC.User user, TLRPC.Chat chat) {
        String charSequence;
        String[] strArr = new String[1];
        try {
            charSequence = NotificationsController.getInstance(this.currentAccount).getShortStringForMessage(messageObject, strArr, new boolean[1]);
        } catch (Throwable unused) {
            CharSequence charSequence2 = messageObject.messageText;
            charSequence = charSequence2 != null ? charSequence2.toString() : "";
        }
        if (charSequence == null) {
            return null;
        }
        Person.Builder builder = new Person.Builder();
        String str = strArr[0];
        if (str != null) {
            builder.setName(str).setKey("u" + messageObject.getSenderId());
        } else if (DialogObject.isUserDialog(j) && user != null) {
            builder.setName(ContactsController.formatName(user.first_name, user.last_name)).setKey("u" + user.id);
        } else if (chat != null) {
            String str2 = chat.title;
            builder.setName(str2 != null ? str2 : "").setKey("c" + chat.id);
        } else {
            builder.setName("");
        }
        return new CarMessage.Builder().setBody(CarText.create(charSequence)).setReceivedTimeEpochMillis(messageObject.messageOwner.date * 1000).setSender(builder.build()).setRead(false).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        if ((r11 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        r16 = r13;
        r13 = r11;
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        if ((r11 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Template buildMusicTemplate() {
        String str;
        TLRPC.FileLocation fileLocation;
        final String str2;
        TelegramMediaSession telegramMediaSession = TelegramMediaSession.getInstance(getCarContext().getApplicationContext());
        if (!telegramMediaSession.isChatsLoaded()) {
            if (!this.musicLoadKicked) {
                this.musicLoadKicked = true;
                telegramMediaSession.ensureLoaded(new Runnable() { // from class: org.telegram.messenger.car.HomeScreen$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeScreen.this.invalidate();
                    }
                });
            }
            return new ListTemplate.Builder().setLoading(true).build();
        }
        ArrayList<Long> musicDialogsSortedByVisibleOrder = telegramMediaSession.getMusicDialogsSortedByVisibleOrder();
        if (musicDialogsSortedByVisibleOrder == null || musicDialogsSortedByVisibleOrder.isEmpty()) {
            return new MessageTemplate.Builder(LocaleController.getString(R.string.NoCarMusic)).build();
        }
        ItemList.Builder builder = new ItemList.Builder();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < musicDialogsSortedByVisibleOrder.size() && i3 < 50) {
            final long longValue = musicDialogsSortedByVisibleOrder.get(i2).longValue();
            ArrayList<MessageObject> musicMessages = telegramMediaSession.getMusicMessages(longValue);
            if (musicMessages != null && !musicMessages.isEmpty()) {
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User musicUser = telegramMediaSession.getMusicUser(longValue);
                    if (musicUser != null) {
                        if (UserObject.isUserSelf(musicUser)) {
                            str2 = LocaleController.getString(R.string.SavedMessages);
                            TLRPC.FileLocation fileLocation2 = null;
                            if (!TextUtils.isEmpty(str2)) {
                                Row.Builder onClickListener = new Row.Builder().setTitle(str2).addText(LocaleController.formatPluralString("MusicFiles", musicMessages.size(), new Object[i])).setBrowsable(true).setOnClickListener(new OnClickListener() { // from class: org.telegram.messenger.car.HomeScreen$$ExternalSyntheticLambda1
                                    @Override // androidx.car.app.model.OnClickListener
                                    public final void onClick() {
                                        HomeScreen.this.lambda$buildMusicTemplate$0(longValue, str2);
                                    }
                                });
                                IconCompat iconFromAvatar = fileLocation2 != null ? iconFromAvatar(fileLocation2) : null;
                                if (iconFromAvatar != null) {
                                    onClickListener.setImage(new CarIcon.Builder(iconFromAvatar).build(), 2);
                                }
                                builder.addItem(onClickListener.build());
                                i3++;
                            }
                        } else {
                            str = ContactsController.formatName(musicUser.first_name, musicUser.last_name);
                            TLRPC.UserProfilePhoto userProfilePhoto = musicUser.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            str2 = str;
                            TLRPC.FileLocation fileLocation22 = null;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                    }
                } else {
                    TLRPC.Chat musicChat = telegramMediaSession.getMusicChat(-longValue);
                    if (musicChat != null) {
                        str = musicChat.title;
                        if (str == null) {
                            str = "";
                        }
                        TLRPC.ChatPhoto chatPhoto = musicChat.photo;
                        if (chatPhoto != null) {
                            fileLocation = chatPhoto.photo_small;
                        }
                        str2 = str;
                        TLRPC.FileLocation fileLocation222 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    }
                }
            }
            i2++;
            i = 0;
        }
        return new ListTemplate.Builder().setSingleList(builder.build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildMusicTemplate$0(long j, String str) {
        getScreenManager().push(new MusicSongsScreen(getCarContext(), j, str));
    }

    private CarIcon iconResource(int i) {
        return new CarIcon.Builder(IconCompat.createWithResource(getCarContext(), i)).build();
    }

    private IconCompat loadAvatarIcon(TLRPC.User user, TLRPC.Chat chat) {
        TLRPC.FileLocation fileLocation;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (user != null && (userProfilePhoto = user.photo) != null) {
            fileLocation = userProfilePhoto.photo_small;
        } else {
            fileLocation = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.photo_small;
        }
        return iconFromAvatar(fileLocation);
    }

    private IconCompat loadUserAvatarIcon(TLRPC.User user) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (user == null || (userProfilePhoto = user.photo) == null) {
            return null;
        }
        return iconFromAvatar(userProfilePhoto.photo_small);
    }

    private IconCompat iconFromAvatar(TLRPC.FileLocation fileLocation) {
        if (fileLocation != null && !(fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation, true);
                if (!pathToAttach.exists()) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap decodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                if (decodeFile == null) {
                    return null;
                }
                Bitmap makeRound = makeRound(decodeFile);
                if (makeRound != null) {
                    decodeFile = makeRound;
                }
                return IconCompat.createWithBitmap(decodeFile);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private Bitmap makeRound(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), paint);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TelegramConversationCallback implements ConversationCallback {
        private final int currentAccount;
        private final long dialogId;
        private final int maxId;

        TelegramConversationCallback(int i, long j, int i2) {
            this.currentAccount = i;
            this.dialogId = j;
            this.maxId = i2;
        }

        @Override // androidx.car.app.messaging.model.ConversationCallback
        public void onMarkAsRead() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.car.HomeScreen$TelegramConversationCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HomeScreen.TelegramConversationCallback.this.lambda$onMarkAsRead$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMarkAsRead$0() {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j = this.dialogId;
            int i = this.maxId;
            messagesController.markDialogAsRead(j, i, i, 0, false, 0L, 0, true, 0);
            MessagesController.getInstance(this.currentAccount).markReactionsAsRead(this.dialogId, 0L);
        }

        @Override // androidx.car.app.messaging.model.ConversationCallback
        public void onTextReply(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.car.HomeScreen$TelegramConversationCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    HomeScreen.TelegramConversationCallback.this.lambda$onTextReply$1(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTextReply$1(String str) {
            AccountInstance.getInstance(this.currentAccount).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, this.dialogId, null, null, null, true, null, null, null, true, 0, 0, null, false));
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j = this.dialogId;
            int i = this.maxId;
            messagesController.markDialogAsRead(j, i, i, 0, false, 0L, 0, true, 0);
        }
    }
}

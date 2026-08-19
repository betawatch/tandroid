package org.telegram.ui.Business;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticBackport8;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Business.QuickRepliesController;

/* loaded from: classes4.dex */
public class QuickRepliesController {
    private static volatile QuickRepliesController[] Instance = new QuickRepliesController[4];
    private static final Object[] lockObjects = new Object[4];
    public final int currentAccount;
    private boolean loaded;
    private boolean loading;
    public final ArrayList replies = new ArrayList();
    public final ArrayList localReplies = new ArrayList();
    private ArrayList filtered = new ArrayList();

    public static /* synthetic */ void $r8$lambda$RydZKfuF2MZQ3yyLCHPNfKOIt0M() {
    }

    public static /* synthetic */ void $r8$lambda$aeGYKWH1LXZ31D_ScI7cVyeoX0s() {
    }

    public static /* synthetic */ void $r8$lambda$z94vlEvUKe90dH8KC7co8cg7_OA() {
    }

    public static boolean isSpecial(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static QuickRepliesController getInstance(int i) {
        QuickRepliesController quickRepliesController;
        QuickRepliesController quickRepliesController2 = Instance[i];
        if (quickRepliesController2 != null) {
            return quickRepliesController2;
        }
        synchronized (lockObjects[i]) {
            try {
                quickRepliesController = Instance[i];
                if (quickRepliesController == null) {
                    QuickRepliesController[] quickRepliesControllerArr = Instance;
                    QuickRepliesController quickRepliesController3 = new QuickRepliesController(i);
                    quickRepliesControllerArr[i] = quickRepliesController3;
                    quickRepliesController = quickRepliesController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return quickRepliesController;
    }

    private QuickRepliesController(int i) {
        this.currentAccount = i;
    }

    public class QuickReply {
        public int id;
        public boolean local;
        public HashSet localIds = new HashSet();
        public int messagesCount;
        public String name;
        public int order;
        public MessageObject topMessage;
        public int topMessageId;

        public QuickReply() {
        }

        public int getTopMessageId() {
            MessageObject messageObject = this.topMessage;
            return messageObject != null ? messageObject.getId() : this.topMessageId;
        }

        public int getMessagesCount() {
            return this.local ? this.localIds.size() : this.messagesCount;
        }

        public boolean isSpecial() {
            return QuickRepliesController.isSpecial(this.name);
        }
    }

    public boolean canAddNew() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.replies.size(); i3++) {
            i = (i != 0 || "hello".equalsIgnoreCase(((QuickReply) this.replies.get(i3)).name)) ? 1 : 0;
            i2 = (i2 != 0 || "away".equalsIgnoreCase(((QuickReply) this.replies.get(i3)).name)) ? 1 : 0;
            if (i != 0 && i2 != 0) {
                break;
            }
        }
        return (this.replies.size() + (i ^ 1)) + (i2 ^ 1) < MessagesController.getInstance(this.currentAccount).quickRepliesLimit;
    }

    public ArrayList getFilteredReplies() {
        this.filtered.clear();
        for (int i = 0; i < this.replies.size(); i++) {
            if (!((QuickReply) this.replies.get(i)).isSpecial()) {
                this.filtered.add((QuickReply) this.replies.get(i));
            }
        }
        return this.filtered;
    }

    public void load() {
        load(true, null);
    }

    private void load(boolean z) {
        load(z, null);
    }

    private void load(boolean z, final Runnable runnable) {
        TLRPC.Message message;
        if (this.loading || this.loaded) {
            return;
        }
        this.loading = true;
        if (z) {
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesController.$r8$lambda$Pv4a96-66f-tJ0dFLNQSasnLpFU(QuickRepliesController.this, messagesStorage, clientUserId, runnable);
                }
            });
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        tL_messages_getQuickReplies.hash = 0L;
        for (int i = 0; i < this.replies.size(); i++) {
            QuickReply quickReply = (QuickReply) this.replies.get(i);
            long calcHash = MediaDataController.calcHash(tL_messages_getQuickReplies.hash, quickReply.id);
            tL_messages_getQuickReplies.hash = calcHash;
            String str = quickReply.name;
            long calcHash2 = MediaDataController.calcHash(calcHash, str == null ? 0L : MessagesController$$ExternalSyntheticBackport8.m(r7, 0, Utilities.MD5(str).substring(0, 16).length(), 16));
            tL_messages_getQuickReplies.hash = calcHash2;
            long calcHash3 = MediaDataController.calcHash(calcHash2, quickReply.topMessage == null ? 0L : r7.getId());
            tL_messages_getQuickReplies.hash = calcHash3;
            MessageObject messageObject = quickReply.topMessage;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (message.flags & 32768) != 0) {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, message.edit_date);
            } else {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, 0L);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getQuickReplies, new RequestDelegate() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                QuickRepliesController.$r8$lambda$ugaoItLWMDdsXKrv5WvsGkGSdyQ(QuickRepliesController.this, tLObject, tL_error);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$Pv4a96-66f-tJ0dFLNQSasnLpFU(final QuickRepliesController quickRepliesController, MessagesStorage messagesStorage, long j, final Runnable runnable) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        NativeByteBuffer byteBufferValue;
        QuickRepliesController quickRepliesController2 = quickRepliesController;
        boolean z = false;
        int i = 1;
        quickRepliesController2.getClass();
        final ArrayList arrayList = new ArrayList();
        final ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        final ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            sQLiteCursor2 = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
            while (sQLiteCursor2.next()) {
                try {
                    QuickReply quickReply = quickRepliesController2.new QuickReply();
                    quickReply.id = sQLiteCursor2.intValue(0);
                    quickReply.name = sQLiteCursor2.stringValue(1);
                    quickReply.order = sQLiteCursor2.intValue(2);
                    quickReply.messagesCount = sQLiteCursor2.intValue(3);
                    arrayList.add(quickReply);
                } catch (Exception e) {
                    e = e;
                    sQLiteCursor = sQLiteCursor2;
                    try {
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor2 = sQLiteCursor;
                            sQLiteCursor2.dispose();
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda13
                            @Override // java.lang.Runnable
                            public final void run() {
                                QuickRepliesController.$r8$lambda$lStxP-ezov7qA-8UtZqS20VKqBE(QuickRepliesController.this, arrayList2, arrayList3, arrayList, runnable);
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = sQLiteCursor2;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            sQLiteCursor2.dispose();
            ArrayList<Long> arrayList4 = new ArrayList<>();
            ArrayList arrayList5 = new ArrayList();
            int i2 = 0;
            while (i2 < arrayList.size()) {
                QuickReply quickReply2 = (QuickReply) arrayList.get(i2);
                Object[] objArr = new Object[i];
                objArr[z ? 1 : 0] = Integer.valueOf(quickReply2.id);
                sQLiteCursor2 = database.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                if (sQLiteCursor2.next() && (byteBufferValue = sQLiteCursor2.byteBufferValue(z ? 1 : 0)) != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
                    TLdeserialize.send_state = sQLiteCursor2.intValue(i);
                    TLdeserialize.readAttachPath(byteBufferValue, j);
                    byteBufferValue.reuse();
                    TLdeserialize.id = sQLiteCursor2.intValue(2);
                    TLdeserialize.date = sQLiteCursor2.intValue(3);
                    TLdeserialize.flags |= TLObject.FLAG_30;
                    TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                    TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                    MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5, null);
                    z = false;
                    MessageObject messageObject = new MessageObject(quickRepliesController2.currentAccount, TLdeserialize, false, true);
                    quickReply2.topMessage = messageObject;
                    quickReply2.topMessageId = TLdeserialize.id;
                    messageObject.generateThumbs(false);
                    quickReply2.topMessage.applyQuickReply(quickReply2.name, quickReply2.id);
                }
                sQLiteCursor2.dispose();
                i2++;
                i = 1;
                quickRepliesController2 = quickRepliesController;
            }
            if (!arrayList5.isEmpty()) {
                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            if (!arrayList4.isEmpty()) {
                messagesStorage.getUsersInternal(arrayList4, arrayList2);
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = null;
        }
        sQLiteCursor2.dispose();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$lStxP-ezov7qA-8UtZqS20VKqBE(QuickRepliesController.this, arrayList2, arrayList3, arrayList, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$lStxP-ezov7qA-8UtZqS20VKqBE(QuickRepliesController quickRepliesController, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable) {
        quickRepliesController.loading = false;
        MessagesController.getInstance(quickRepliesController.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(quickRepliesController.currentAccount).putChats(arrayList2, true);
        quickRepliesController.replies.clear();
        quickRepliesController.replies.addAll(arrayList3);
        if (runnable != null) {
            runnable.run();
        } else {
            quickRepliesController.load(false);
        }
        NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$ugaoItLWMDdsXKrv5WvsGkGSdyQ(final QuickRepliesController quickRepliesController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        quickRepliesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$qA43qxg1v_0agBpu_X6Rc2GLRYA(QuickRepliesController.this, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$qA43qxg1v_0agBpu_X6Rc2GLRYA(QuickRepliesController quickRepliesController, TLObject tLObject) {
        TLRPC.Message message;
        quickRepliesController.getClass();
        ArrayList arrayList = null;
        if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
            TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
            MessagesController.getInstance(quickRepliesController.currentAccount).putUsers(tL_messages_quickReplies.users, false);
            MessagesController.getInstance(quickRepliesController.currentAccount).putChats(tL_messages_quickReplies.chats, false);
            MessagesStorage.getInstance(quickRepliesController.currentAccount).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < tL_messages_quickReplies.quick_replies.size(); i++) {
                TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i);
                QuickReply quickReply = quickRepliesController.new QuickReply();
                quickReply.id = tL_quickReply.shortcut_id;
                quickReply.name = tL_quickReply.shortcut;
                quickReply.messagesCount = tL_quickReply.count;
                quickReply.topMessageId = tL_quickReply.top_message;
                quickReply.order = i;
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_messages_quickReplies.messages.size()) {
                        message = null;
                        break;
                    }
                    message = tL_messages_quickReplies.messages.get(i2);
                    if (message.id == tL_quickReply.top_message) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (message != null) {
                    MessageObject messageObject = new MessageObject(quickRepliesController.currentAccount, message, false, true);
                    quickReply.topMessage = messageObject;
                    messageObject.generateThumbs(false);
                    quickReply.topMessage.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                }
                arrayList2.add(quickReply);
            }
            arrayList = arrayList2;
        } else {
            boolean z = tLObject instanceof TLRPC.TL_messages_quickRepliesNotModified;
        }
        quickRepliesController.loading = false;
        if (arrayList != null) {
            quickRepliesController.replies.clear();
            quickRepliesController.replies.addAll(arrayList);
        }
        quickRepliesController.loaded = true;
        quickRepliesController.saveToCache();
        NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    private void ensureLoaded(Runnable runnable) {
        if (this.loaded) {
            runnable.run();
        } else {
            load(true, runnable);
        }
    }

    private void saveToCache() {
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$l4nMbWzEG8-UBpj48HX1ltTxx8k(QuickRepliesController.this, messagesStorage);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$l4nMbWzEG8-UBpj48HX1ltTxx8k(QuickRepliesController quickRepliesController, MessagesStorage messagesStorage) {
        quickRepliesController.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase database = messagesStorage.getDatabase();
                database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                sQLitePreparedStatement = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                for (int i = 0; i < quickRepliesController.replies.size(); i++) {
                    QuickReply quickReply = (QuickReply) quickRepliesController.replies.get(i);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, quickReply.id);
                    sQLitePreparedStatement.bindString(2, quickReply.name);
                    sQLitePreparedStatement.bindInteger(3, quickReply.order);
                    sQLitePreparedStatement.bindInteger(4, quickReply.messagesCount);
                    sQLitePreparedStatement.step();
                }
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private void updateOrder() {
        for (int i = 0; i < this.replies.size(); i++) {
            ((QuickReply) this.replies.get(i)).order = i;
        }
    }

    private void addReply(final QuickReply quickReply) {
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$AR4UodbEIfNfKeUoECl8nXZTcSI(MessagesStorage.this, quickReply);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$AR4UodbEIfNfKeUoECl8nXZTcSI(MessagesStorage messagesStorage, QuickReply quickReply) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindInteger(1, quickReply.id);
                sQLitePreparedStatement.bindString(2, quickReply.name);
                sQLitePreparedStatement.bindInteger(3, quickReply.order);
                sQLitePreparedStatement.bindInteger(4, quickReply.messagesCount);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public QuickReply findReply(long j) {
        ArrayList arrayList = this.replies;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            QuickReply quickReply = (QuickReply) obj;
            if (quickReply.id == j) {
                return quickReply;
            }
        }
        return null;
    }

    public QuickReply findReply(String str) {
        ArrayList arrayList = this.replies;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            QuickReply quickReply = (QuickReply) obj;
            if (TextUtils.equals(str, quickReply.name)) {
                return quickReply;
            }
        }
        return null;
    }

    public QuickReply findLocalReply(String str) {
        ArrayList arrayList = this.localReplies;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            QuickReply quickReply = (QuickReply) obj;
            if (TextUtils.equals(str, quickReply.name)) {
                return quickReply;
            }
        }
        return null;
    }

    public boolean isNameBusy(String str, int i) {
        QuickReply findReply = findReply(str);
        return (findReply == null || findReply.id == i) ? false : true;
    }

    public void reorder() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.replies.size(); i++) {
            arrayList.add(Integer.valueOf(((QuickReply) this.replies.get(i)).id));
        }
        Collections.sort(this.replies, new Comparator() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda18
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QuickRepliesController.$r8$lambda$IlYkbDO4pT633PiIRVfxrzhaKzI((QuickRepliesController.QuickReply) obj, (QuickRepliesController.QuickReply) obj2);
            }
        });
        for (int i2 = 0; i2 < this.replies.size(); i2++) {
            if (((QuickReply) this.replies.get(i2)).id != ((Integer) arrayList.get(i2)).intValue()) {
                TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                for (int i3 = 0; i3 < this.replies.size(); i3++) {
                    tL_messages_reorderQuickReplies.order.add(Integer.valueOf(((QuickReply) this.replies.get(i3)).id));
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderQuickReplies, new RequestDelegate() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda19
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda20
                            @Override // java.lang.Runnable
                            public final void run() {
                                QuickRepliesController.$r8$lambda$aeGYKWH1LXZ31D_ScI7cVyeoX0s();
                            }
                        });
                    }
                });
                saveToCache();
                return;
            }
        }
    }

    public static /* synthetic */ int $r8$lambda$IlYkbDO4pT633PiIRVfxrzhaKzI(QuickReply quickReply, QuickReply quickReply2) {
        return quickReply.order - quickReply2.order;
    }

    public void renameReply(int i, String str) {
        QuickReply findReply = findReply(i);
        if (findReply == null) {
            return;
        }
        findReply.name = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editQuickReplyShortcut, new RequestDelegate() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda17
                    @Override // java.lang.Runnable
                    public final void run() {
                        QuickRepliesController.$r8$lambda$z94vlEvUKe90dH8KC7co8cg7_OA();
                    }
                });
            }
        });
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void deleteReplies(final ArrayList arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            if (findReply(((Integer) arrayList.get(i)).intValue()) == null) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            QuickReply findReply = findReply(((Integer) arrayList.get(i2)).intValue());
            this.replies.remove(findReply);
            deleteLocalReply(findReply.name);
            TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
            tL_messages_deleteQuickReplyShortcut.shortcut_id = findReply.id;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteQuickReplyShortcut, new RequestDelegate() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda21
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda23
                        @Override // java.lang.Runnable
                        public final void run() {
                            QuickRepliesController.$r8$lambda$RydZKfuF2MZQ3yyLCHPNfKOIt0M();
                        }
                    });
                }
            });
            if ("hello".equals(findReply.name)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
                if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                    MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull, true);
                }
            } else if ("away".equals(findReply.name)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                TLRPC.UserFull userFull2 = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
                if (userFull2 != null) {
                    userFull2.flags2 &= -9;
                    userFull2.business_away_message = null;
                    MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull2, true);
                }
            }
        }
        saveToCache();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$SeFBaSSvuRxXGI3BgqiugRrI1p8(MessagesStorage.this, arrayList);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$SeFBaSSvuRxXGI3BgqiugRrI1p8(MessagesStorage messagesStorage, ArrayList arrayList) {
        try {
            messagesStorage.getDatabase().executeFast(String.format("DELETE FROM quick_replies_messages WHERE topic_id IN (%s)", TextUtils.join(", ", arrayList))).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void updateTopMessage(final QuickReply quickReply) {
        if (quickReply == null) {
            return;
        }
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$9Wd33Tegy9qEuSqp9fpbb9qK-hw(QuickRepliesController.this, messagesStorage, quickReply, clientUserId);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$9Wd33Tegy9qEuSqp9fpbb9qK-hw(final QuickRepliesController quickRepliesController, MessagesStorage messagesStorage, final QuickReply quickReply, long j) {
        Exception exc;
        Throwable th;
        ArrayList<Long> arrayList;
        ArrayList arrayList2;
        SQLiteCursor queryFinalized;
        NativeByteBuffer byteBufferValue;
        quickRepliesController.getClass();
        SQLiteCursor sQLiteCursor = null;
        r2 = null;
        MessageObject messageObject = null;
        SQLiteCursor sQLiteCursor2 = null;
        try {
            try {
                arrayList = new ArrayList<>();
                arrayList2 = new ArrayList();
                queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(quickReply.id));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            exc = e;
        }
        try {
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                TLdeserialize.send_state = queryFinalized.intValue(1);
                TLdeserialize.readAttachPath(byteBufferValue, j);
                byteBufferValue.reuse();
                TLdeserialize.id = queryFinalized.intValue(2);
                TLdeserialize.date = queryFinalized.intValue(3);
                TLdeserialize.flags |= TLObject.FLAG_30;
                TLdeserialize.quick_reply_shortcut_id = queryFinalized.intValue(4);
                TLdeserialize.ttl = queryFinalized.intValue(5);
                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList, arrayList2, null);
                messageObject = new MessageObject(quickRepliesController.currentAccount, TLdeserialize, false, true);
            }
            final MessageObject messageObject2 = messageObject;
            queryFinalized.dispose();
            final ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
            final ArrayList<TLRPC.Chat> arrayList4 = new ArrayList<>();
            if (!arrayList2.isEmpty()) {
                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList4);
            }
            if (!arrayList.isEmpty()) {
                messagesStorage.getUsersInternal(arrayList, arrayList3);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesController.$r8$lambda$ucPmdMgjqqVoIV1IvM55o1JbT5k(QuickRepliesController.this, arrayList3, arrayList4, quickReply, messageObject2);
                }
            });
            queryFinalized.dispose();
        } catch (Exception e2) {
            exc = e2;
            sQLiteCursor = queryFinalized;
            FileLog.e(exc);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor2 = queryFinalized;
            if (sQLiteCursor2 != null) {
                sQLiteCursor2.dispose();
                throw th;
            }
            throw th;
        }
    }

    public static /* synthetic */ void $r8$lambda$ucPmdMgjqqVoIV1IvM55o1JbT5k(QuickRepliesController quickRepliesController, ArrayList arrayList, ArrayList arrayList2, QuickReply quickReply, MessageObject messageObject) {
        MessagesController.getInstance(quickRepliesController.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(quickRepliesController.currentAccount).putChats(arrayList2, true);
        quickReply.topMessage = messageObject;
        if (messageObject != null) {
            messageObject.applyQuickReply(quickReply.name, quickReply.id);
        }
        quickRepliesController.saveToCache();
        NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public boolean processUpdate(final TLRPC.Update update, final String str, final int i) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            final TLRPC.Message message = ((TL_update.TL_updateQuickReplyMessage) update).message;
            ensureLoaded(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesController.$r8$lambda$ILQrzhhdWfCrhUjf-GpkA2w_elc(QuickRepliesController.this, message, str, i);
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            ensureLoaded(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesController.$r8$lambda$xuFCljZk_8wOxQ_aw2gk7B67vjE(QuickRepliesController.this, update);
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            ensureLoaded(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesController.$r8$lambda$-K-q8nq3Vp-EWls78V1sxVPWbvE(QuickRepliesController.this, update);
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            ensureLoaded(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesController.$r8$lambda$_OlYxETwM7-qrdh1453x2HTldZg(QuickRepliesController.this, update);
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        ensureLoaded(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$aUmE9avGvu6QwUBr9QN-U6mMImg(QuickRepliesController.this, update);
            }
        });
        return true;
    }

    public static /* synthetic */ void $r8$lambda$ILQrzhhdWfCrhUjf-GpkA2w_elc(QuickRepliesController quickRepliesController, TLRPC.Message message, String str, int i) {
        quickRepliesController.getClass();
        if ((message.flags & TLObject.FLAG_30) != 0) {
            QuickReply findReply = quickRepliesController.findReply(message.quick_reply_shortcut_id);
            if (findReply == null) {
                QuickReply quickReply = quickRepliesController.new QuickReply();
                quickReply.id = message.quick_reply_shortcut_id;
                quickReply.topMessageId = message.id;
                MessageObject messageObject = new MessageObject(quickRepliesController.currentAccount, message, false, true);
                quickReply.topMessage = messageObject;
                messageObject.generateThumbs(false);
                if (str != null) {
                    quickReply.name = str;
                    quickRepliesController.deleteLocalReply(str);
                }
                quickReply.topMessage.applyQuickReply(str, i);
                quickReply.messagesCount = 1;
                quickRepliesController.replies.add(quickReply);
                quickRepliesController.updateOrder();
                quickRepliesController.addReply(quickReply);
            } else {
                int i2 = findReply.topMessageId;
                int i3 = message.id;
                if (i2 == i3) {
                    findReply.topMessageId = i3;
                    MessageObject messageObject2 = new MessageObject(quickRepliesController.currentAccount, message, false, true);
                    findReply.topMessage = messageObject2;
                    messageObject2.generateThumbs(false);
                    quickRepliesController.saveToCache();
                    NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
                } else if ((message.flags & 32768) == 0) {
                    findReply.messagesCount++;
                    quickRepliesController.saveToCache();
                    NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
            }
        }
        if (str == null && i == 0) {
            ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
            arrayList.add(message);
            MessagesStorage.getInstance(quickRepliesController.currentAccount).putMessages(arrayList, true, true, false, DownloadController.getInstance(quickRepliesController.currentAccount).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
            long clientUserId = UserConfig.getInstance(quickRepliesController.currentAccount).getClientUserId();
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            arrayList2.add(new MessageObject(quickRepliesController.currentAccount, message, true, true));
            MessagesController.getInstance(quickRepliesController.currentAccount).updateInterfaceWithMessages(clientUserId, arrayList2, 5);
        }
    }

    public static /* synthetic */ void $r8$lambda$xuFCljZk_8wOxQ_aw2gk7B67vjE(QuickRepliesController quickRepliesController, TLRPC.Update update) {
        QuickReply quickReply;
        quickRepliesController.getClass();
        ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
        ArrayList arrayList2 = new ArrayList(quickRepliesController.replies);
        quickRepliesController.replies.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.TL_quickReply tL_quickReply = arrayList.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    quickReply = null;
                    break;
                } else {
                    if (((QuickReply) arrayList2.get(i2)).id == tL_quickReply.shortcut_id) {
                        quickReply = (QuickReply) arrayList2.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (quickReply == null) {
                quickReply = quickRepliesController.new QuickReply();
            }
            quickReply.id = tL_quickReply.shortcut_id;
            quickReply.name = tL_quickReply.shortcut;
            quickReply.messagesCount = tL_quickReply.count;
            quickReply.order = i;
            quickReply.topMessageId = tL_quickReply.top_message;
            MessageObject messageObject = quickReply.topMessage;
            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                quickReply.topMessage = null;
            }
            quickRepliesController.replies.add(quickReply);
            quickRepliesController.deleteLocalReply(quickReply.name);
        }
        quickRepliesController.saveToCache();
        NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$-K-q8nq3Vp-EWls78V1sxVPWbvE(QuickRepliesController quickRepliesController, TLRPC.Update update) {
        quickRepliesController.getClass();
        TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
        QuickReply findReply = quickRepliesController.findReply(tL_quickReply.shortcut_id);
        if (findReply != null) {
            findReply.name = tL_quickReply.shortcut;
            findReply.messagesCount = tL_quickReply.count;
            findReply.topMessageId = tL_quickReply.top_message;
            MessageObject messageObject = findReply.topMessage;
            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                findReply.topMessage = null;
                quickRepliesController.updateTopMessage(findReply);
                return;
            }
        } else {
            QuickReply quickReply = quickRepliesController.new QuickReply();
            quickReply.id = tL_quickReply.shortcut_id;
            quickReply.name = tL_quickReply.shortcut;
            quickReply.messagesCount = tL_quickReply.count;
            quickReply.topMessageId = tL_quickReply.top_message;
            quickRepliesController.updateOrder();
            quickRepliesController.replies.add(quickReply);
            quickRepliesController.deleteLocalReply(quickReply.name);
        }
        quickRepliesController.saveToCache();
        NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$_OlYxETwM7-qrdh1453x2HTldZg(QuickRepliesController quickRepliesController, TLRPC.Update update) {
        quickRepliesController.getClass();
        QuickReply findReply = quickRepliesController.findReply(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
        if (findReply != null) {
            quickRepliesController.replies.remove(findReply);
            quickRepliesController.deleteLocalReply(findReply.name);
            final int i = findReply.id;
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(quickRepliesController.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesController.$r8$lambda$bH-K3ut4ePBfrswrOWBKAHIirt4(MessagesStorage.this, i);
                }
            });
            quickRepliesController.saveToCache();
            NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public static /* synthetic */ void $r8$lambda$bH-K3ut4ePBfrswrOWBKAHIirt4(MessagesStorage messagesStorage, int i) {
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i).stepThis().dispose();
            database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$aUmE9avGvu6QwUBr9QN-U6mMImg(QuickRepliesController quickRepliesController, TLRPC.Update update) {
        quickRepliesController.getClass();
        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
        QuickReply findReply = quickRepliesController.findReply(tL_updateDeleteQuickReplyMessages.shortcut_id);
        if (findReply != null) {
            int size = findReply.messagesCount - tL_updateDeleteQuickReplyMessages.messages.size();
            findReply.messagesCount = size;
            if (size <= 0) {
                quickRepliesController.replies.remove(findReply);
            }
            if (tL_updateDeleteQuickReplyMessages.messages.contains(Integer.valueOf(findReply.getTopMessageId())) || findReply.topMessage == null) {
                findReply.topMessage = null;
                quickRepliesController.updateTopMessage(findReply);
            } else {
                quickRepliesController.saveToCache();
                NotificationCenter.getInstance(quickRepliesController.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
            }
        }
    }

    public void checkLocalMessages(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.isSending() && findReply(messageObject.getQuickReplyId()) == null && messageObject.getQuickReplyName() != null && findReply(messageObject.getQuickReplyName()) == null) {
                QuickReply findLocalReply = findLocalReply(messageObject.getQuickReplyName());
                if (findLocalReply == null) {
                    findLocalReply = new QuickReply();
                    findLocalReply.local = true;
                    findLocalReply.name = messageObject.getQuickReplyName();
                    findLocalReply.id = -1;
                    findLocalReply.topMessage = messageObject;
                    findLocalReply.topMessageId = messageObject.getId();
                    this.localReplies.add(findLocalReply);
                }
                findLocalReply.localIds.add(Integer.valueOf(messageObject.getId()));
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationCenter.getInstance(QuickRepliesController.this.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    }
                });
            }
        }
    }

    public void deleteLocalReply(String str) {
        QuickReply findLocalReply = findLocalReply(str);
        if (findLocalReply != null) {
            this.localReplies.remove(findLocalReply);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public void deleteLocalMessages(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            deleteLocalMessage(((Integer) obj).intValue());
        }
    }

    public void deleteLocalMessage(int i) {
        for (int i2 = 0; i2 < this.localReplies.size(); i2++) {
            QuickReply quickReply = (QuickReply) this.localReplies.get(i2);
            if (quickReply.localIds.contains(Integer.valueOf(i))) {
                quickReply.localIds.remove(Integer.valueOf(i));
                if (quickReply.getMessagesCount() <= 0) {
                    this.localReplies.remove(quickReply);
                }
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            }
        }
    }

    public boolean hasReplies() {
        return !this.replies.isEmpty();
    }

    public void sendQuickReplyTo(long j, final QuickReply quickReply) {
        if (quickReply == null) {
            return;
        }
        final TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_messages_sendQuickReplyMessages.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        tL_messages_sendQuickReplyMessages.shortcut_id = quickReply.id;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$t4DGL6UHQlB_EZF3eQYxaGx-Mg8(QuickRepliesController.this, messagesStorage, quickReply, tL_messages_sendQuickReplyMessages);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r2 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$t4DGL6UHQlB_EZF3eQYxaGx-Mg8(final QuickRepliesController quickRepliesController, MessagesStorage messagesStorage, final QuickReply quickReply, final TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages) {
        quickRepliesController.getClass();
        final ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(quickReply.id));
                while (sQLiteCursor.next()) {
                    arrayList.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            sQLiteCursor.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesController.$r8$lambda$9h61rOSAZI7qOu0JEv4mN2VI3Z8(QuickRepliesController.this, arrayList, quickReply, tL_messages_sendQuickReplyMessages);
                }
            });
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public static /* synthetic */ void $r8$lambda$9h61rOSAZI7qOu0JEv4mN2VI3Z8(final QuickRepliesController quickRepliesController, final ArrayList arrayList, QuickReply quickReply, final TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages) {
        quickRepliesController.getClass();
        if (arrayList.isEmpty() || arrayList.size() < quickReply.getMessagesCount()) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = quickReply.id;
            ConnectionsManager.getInstance(quickRepliesController.currentAccount).sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda26
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    QuickRepliesController.$r8$lambda$gdWm2uvGWRPQiJMJMCq82vf33AI(QuickRepliesController.this, arrayList, tL_messages_sendQuickReplyMessages, tLObject, tL_error);
                }
            });
        } else {
            tL_messages_sendQuickReplyMessages.id = arrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(quickRepliesController.currentAccount).sendRequest(tL_messages_sendQuickReplyMessages, null);
        }
    }

    public static /* synthetic */ void $r8$lambda$gdWm2uvGWRPQiJMJMCq82vf33AI(final QuickRepliesController quickRepliesController, final ArrayList arrayList, final TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        quickRepliesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                QuickRepliesController.$r8$lambda$dfgudiwMI8b-gwgHvigQI9tvP6Q(QuickRepliesController.this, tLObject, arrayList, tL_messages_sendQuickReplyMessages, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$dfgudiwMI8b-gwgHvigQI9tvP6Q(QuickRepliesController quickRepliesController, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, TLRPC.TL_error tL_error) {
        quickRepliesController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.TL_messages_messages) tLObject).messages;
            arrayList.clear();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TLRPC.Message message = arrayList2.get(i);
                i++;
                arrayList.add(Integer.valueOf(message.id));
            }
            tL_messages_sendQuickReplyMessages.id = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(quickRepliesController.currentAccount).sendRequest(tL_messages_sendQuickReplyMessages, null);
            return;
        }
        FileLog.e("received " + tLObject + " " + tL_error + " on getQuickReplyMessages when trying to send quick reply");
    }
}

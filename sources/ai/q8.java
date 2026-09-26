package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.y70;
import org.telegram.ui.oa0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q8(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0216  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        SQLiteCursor sQLiteCursor;
        hg.c2 c2Var;
        ArrayList arrayList2;
        Runnable runnable;
        int i11;
        SQLiteDatabase sQLiteDatabase;
        String str;
        SQLiteCursor sQLiteCursor2;
        MessageObject messageObject;
        NativeByteBuffer byteBufferValue;
        int i12 = this.a;
        String str2 = "SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC";
        int i13 = 0;
        long j3 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i12) {
            case 0:
                l9 l9Var = (l9) obj3;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList3 = l9Var.h;
                ArrayList arrayList4 = l9Var.g;
                int i14 = l9Var.a;
                FileLog.d("StoriesController update stories for dialog " + j3);
                l9Var.n0(j3, Collections.singletonList(tL_updateStory.story), false);
                l9Var.l0(j3, Collections.singletonList(tL_updateStory.story), true);
                a0.i iVar = l9Var.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) iVar.f(j3);
                ArrayList arrayList5 = new ArrayList();
                int i15 = l9Var.u;
                if (peerStories != null) {
                    TL_stories.StoryItem storyItem3 = tL_updateStory.story;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationsController.getInstance(i14).processDeleteStory(j3, storyItem3.id);
                    }
                    int i16 = 0;
                    while (true) {
                        if (i16 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i16).id != storyItem3.id) {
                            i16++;
                        } else if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i16);
                            org.telegram.messenger.f0.n(storyItem3.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem4 = peerStories.stories.get(i16);
                            storyItem3 = l9.f(storyItem4, storyItem3);
                            arrayList5.add(storyItem3);
                            peerStories.stories.set(i16, storyItem3);
                            if (storyItem3.attachPath == null) {
                                storyItem3.attachPath = storyItem4.attachPath;
                            }
                            if (storyItem3.firstFramePath == null) {
                                storyItem3.firstFramePath = storyItem4.firstFramePath;
                            }
                            org.telegram.messenger.f0.n(storyItem3.id, new StringBuilder("StoriesController update story id="));
                            z11 = true;
                        }
                    }
                    z12 = false;
                    if (z11) {
                        z13 = false;
                    } else {
                        if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                            FileLog.d("StoriesController can't add new story DELETED");
                            return;
                        }
                        if (ia.w(i14, storyItem3)) {
                            FileLog.d("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j3 > 0 && (user == null || (!user.self && !l9Var.M(user)))) {
                            FileLog.d("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList5.add(storyItem3);
                        peerStories.stories.add(storyItem3);
                        FileLog.d("StoriesController add new story id=" + storyItem3.id + " total stories count " + peerStories.stories.size());
                        l9Var.W(j3, storyItem3);
                        l9Var.g(peerStories);
                        z13 = true;
                        z12 = true;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || l9Var.K(j3)) {
                            Collections.sort(peerStories.stories, l9.X);
                        } else {
                            arrayList4.remove(peerStories);
                            arrayList3.remove(peerStories);
                            iVar.l(DialogObject.getPeerDialogId(peerStories.peer));
                            l9Var.u--;
                        }
                        z13 = true;
                    }
                    z10 = z13;
                } else {
                    TL_stories.StoryItem storyItem5 = tL_updateStory.story;
                    if (storyItem5 instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.d("StoriesController can't add user " + j3 + " with new story DELETED");
                        return;
                    }
                    if (ia.w(i14, storyItem5)) {
                        FileLog.d("StoriesController can't add user " + j3 + " with new story isExpired");
                        return;
                    }
                    if (j3 > 0 && (user == null || (!user.self && !l9Var.M(user)))) {
                        FileLog.d("StoriesController can't add user cause is not contact");
                        return;
                    }
                    TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                    tL_peerStories.peer = tL_updateStory.peer;
                    tL_peerStories.stories.add(tL_updateStory.story);
                    org.telegram.messenger.f0.n(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                    long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                    l9Var.b0(peerDialogId, tL_peerStories);
                    if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
                        l9Var.g(tL_peerStories);
                        if (user2 != null && !user2.stories_hidden) {
                            l9Var.X(tL_peerStories);
                        }
                    }
                    FileLog.d("StoriesController applyNewStories " + peerDialogId);
                    l9Var.n0(peerDialogId, tL_peerStories.stories, false);
                    l9Var.u = l9Var.u + 1;
                    l9Var.O(j3);
                    z10 = true;
                }
                if (i15 != l9Var.u) {
                    l9Var.l.edit().putInt("total_stores", l9Var.u).apply();
                }
                l9Var.v(arrayList4);
                l9Var.v(arrayList3);
                if (z10) {
                    if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                        i10 = 0;
                        NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyDeleted, Long.valueOf(j3), Integer.valueOf(tL_updateStory.story.id));
                    } else {
                        i10 = 0;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i10]);
                }
                MessagesController.getInstance(i14).checkArchiveFolder();
                return;
            case 1:
                TLObject tLObject = (TLObject) obj2;
                oa0 oa0Var = (oa0) obj;
                l9 l9Var2 = ((r8) obj3).c;
                int i17 = l9Var2.a;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i17).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i17).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        for (int i18 = 0; i18 < peerStories2.stories.size(); i18++) {
                            if ((peerStories2.stories.get(i18).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories2.stories.get(i18) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.i iVar2 = l9Var2.E;
                                storyItem = peerStories2.stories.get(i18);
                                iVar2.k(storyItem, j3);
                                oa0Var.run(storyItem);
                                return;
                            }
                        }
                    }
                }
                storyItem = null;
                oa0Var.run(storyItem);
                return;
            case 2:
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                l9 l9Var3 = ((s8) obj3).c;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(l9Var3.a).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(l9Var3.a).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.i iVar3 = l9Var3.E;
                        storyItem2 = tL_stories_stories.stories.get(0);
                        iVar3.k(storyItem2, j3);
                        callback.run(storyItem2);
                        return;
                    }
                }
                storyItem2 = null;
                callback.run(storyItem2);
                return;
            case 3:
                long j10 = this.b;
                AndroidUtilities.runOnUIThread(new a3.h0((ha) obj3, (View) obj2, j10, 6), 500L);
                ((ca) obj).f(j10);
                return;
            case 4:
                ci.y9 y9Var = (ci.y9) obj3;
                boolean isChannel = ChatObject.isChannel((TLRPC.Chat) obj2);
                long j11 = this.b;
                TLRPC.ChatFull loadChatInfoInQueue = ((MessagesStorage) obj).loadChatInfoInQueue(j11, isChannel, true, true, 0);
                if (loadChatInfoInQueue == null || (chatParticipants = loadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < loadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new ci.o9(y9Var, isChannel, j11, 0));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new a3.h0(y9Var, j11, loadChatInfoInQueue, 7));
                    return;
                }
            case 5:
                hg.c2 c2Var2 = (hg.c2) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList6 = new ArrayList();
                ArrayList<TLRPC.User> arrayList7 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList8 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLiteCursor queryFinalized = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            try {
                                try {
                                    hg.b2 b2Var = new hg.b2();
                                    b2Var.a = queryFinalized.intValue(i13);
                                    b2Var.b = queryFinalized.stringValue(1);
                                    b2Var.c = queryFinalized.intValue(2);
                                    b2Var.f = queryFinalized.intValue(3);
                                    arrayList6.add(b2Var);
                                    i13 = 0;
                                } catch (Exception e) {
                                    e = e;
                                    c2Var = c2Var2;
                                    arrayList2 = arrayList6;
                                    sQLiteCursor = queryFinalized;
                                    runnable = runnable2;
                                    try {
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        AndroidUtilities.runOnUIThread(new m3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = queryFinalized;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            c2Var = c2Var2;
                            arrayList2 = arrayList6;
                            runnable = runnable2;
                            sQLiteCursor = queryFinalized;
                        }
                    }
                    char c10 = 0;
                    queryFinalized.dispose();
                    ArrayList<Long> arrayList9 = new ArrayList<>();
                    ArrayList arrayList10 = new ArrayList();
                    SQLiteCursor sQLiteCursor3 = queryFinalized;
                    int i19 = 0;
                    while (i19 < arrayList6.size()) {
                        try {
                            try {
                                hg.b2 b2Var2 = (hg.b2) arrayList6.get(i19);
                                arrayList2 = arrayList6;
                                try {
                                    i11 = i19;
                                } catch (Exception e10) {
                                    e = e10;
                                    c2Var = c2Var2;
                                }
                                try {
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = Integer.valueOf(b2Var2.a);
                                    SQLiteCursor queryFinalized2 = database.queryFinalized(str2, objArr);
                                    try {
                                        try {
                                            if (queryFinalized2.next()) {
                                                sQLiteDatabase = database;
                                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                                                if (byteBufferValue2 != null) {
                                                    str = str2;
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                    runnable = runnable2;
                                                    try {
                                                        TLdeserialize.send_state = queryFinalized2.intValue(1);
                                                        TLdeserialize.readAttachPath(byteBufferValue2, j3);
                                                        byteBufferValue2.reuse();
                                                        TLdeserialize.id = queryFinalized2.intValue(2);
                                                        TLdeserialize.date = queryFinalized2.intValue(3);
                                                        TLdeserialize.flags |= TLObject.FLAG_30;
                                                        TLdeserialize.quick_reply_shortcut_id = queryFinalized2.intValue(4);
                                                        TLdeserialize.ttl = queryFinalized2.intValue(5);
                                                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList9, arrayList10, null);
                                                        c2Var = c2Var2;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        c2Var = c2Var2;
                                                        sQLiteCursor = queryFinalized2;
                                                        FileLog.e(e);
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        AndroidUtilities.runOnUIThread(new m3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                                        return;
                                                    }
                                                    try {
                                                        MessageObject messageObject2 = new MessageObject(c2Var2.a, TLdeserialize, false, true);
                                                        b2Var2.e = messageObject2;
                                                        b2Var2.d = TLdeserialize.id;
                                                        messageObject2.generateThumbs(false);
                                                        b2Var2.e.applyQuickReply(b2Var2.b, b2Var2.a);
                                                        queryFinalized2.dispose();
                                                        i19 = i11 + 1;
                                                        sQLiteCursor3 = queryFinalized2;
                                                        arrayList6 = arrayList2;
                                                        database = sQLiteDatabase;
                                                        str2 = str;
                                                        runnable2 = runnable;
                                                        c2Var2 = c2Var;
                                                        c10 = 0;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        sQLiteCursor = queryFinalized2;
                                                        FileLog.e(e);
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        AndroidUtilities.runOnUIThread(new m3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                                        return;
                                                    }
                                                }
                                            } else {
                                                sQLiteDatabase = database;
                                            }
                                            c2Var = c2Var2;
                                            str = str2;
                                            runnable = runnable2;
                                            queryFinalized2.dispose();
                                            i19 = i11 + 1;
                                            sQLiteCursor3 = queryFinalized2;
                                            arrayList6 = arrayList2;
                                            database = sQLiteDatabase;
                                            str2 = str;
                                            runnable2 = runnable;
                                            c2Var2 = c2Var;
                                            c10 = 0;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            sQLiteCursor = queryFinalized2;
                                            if (sQLiteCursor != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        c2Var = c2Var2;
                                        runnable = runnable2;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    c2Var = c2Var2;
                                    runnable = runnable2;
                                    sQLiteCursor = sQLiteCursor3;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                    }
                                    AndroidUtilities.runOnUIThread(new m3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteCursor = sQLiteCursor3;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            c2Var = c2Var2;
                            arrayList2 = arrayList6;
                        }
                    }
                    c2Var = c2Var2;
                    arrayList2 = arrayList6;
                    runnable = runnable2;
                    try {
                        if (!arrayList10.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList10), arrayList8);
                        }
                        if (!arrayList9.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList9, arrayList7);
                        }
                        sQLiteCursor3.dispose();
                    } catch (Exception e16) {
                        e = e16;
                        sQLiteCursor = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                        }
                        AndroidUtilities.runOnUIThread(new m3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                        return;
                    }
                } catch (Exception e17) {
                    e = e17;
                    c2Var = c2Var2;
                    arrayList2 = arrayList6;
                    runnable = runnable2;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new m3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                return;
            case 6:
                hg.c2 c2Var3 = (hg.c2) obj3;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                hg.b2 b2Var3 = (hg.b2) obj;
                try {
                    ArrayList<Long> arrayList11 = new ArrayList<>();
                    ArrayList arrayList12 = new ArrayList();
                    SQLiteCursor queryFinalized3 = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(b2Var3.a));
                    try {
                        if (!queryFinalized3.next() || (byteBufferValue = queryFinalized3.byteBufferValue(0)) == null) {
                            messageObject = null;
                        } else {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize2.send_state = queryFinalized3.intValue(1);
                            TLdeserialize2.readAttachPath(byteBufferValue, j3);
                            byteBufferValue.reuse();
                            TLdeserialize2.id = queryFinalized3.intValue(2);
                            TLdeserialize2.date = queryFinalized3.intValue(3);
                            TLdeserialize2.flags |= TLObject.FLAG_30;
                            TLdeserialize2.quick_reply_shortcut_id = queryFinalized3.intValue(4);
                            TLdeserialize2.ttl = queryFinalized3.intValue(5);
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList11, arrayList12, null);
                            messageObject = new MessageObject(c2Var3.a, TLdeserialize2, false, true);
                        }
                        queryFinalized3.dispose();
                        ArrayList<TLRPC.User> arrayList13 = new ArrayList<>();
                        ArrayList<TLRPC.Chat> arrayList14 = new ArrayList<>();
                        if (!arrayList12.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList12), arrayList14);
                        }
                        if (!arrayList11.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList11, arrayList13);
                        }
                        AndroidUtilities.runOnUIThread(new m3(c2Var3, arrayList13, arrayList14, b2Var3, messageObject, 8));
                        queryFinalized3.dispose();
                        return;
                    } catch (Exception e18) {
                        e = e18;
                        sQLiteCursor2 = queryFinalized3;
                        try {
                            FileLog.e(e);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        sQLiteCursor2 = queryFinalized3;
                        if (sQLiteCursor2 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e19) {
                    e = e19;
                    sQLiteCursor2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor2 = null;
                }
                break;
            case 7:
                ((ChatMessagesMetadataController) obj3).lambda$loadStoriesForMessages$1((MessageObject) obj2, j3, (TL_stories.StoryItem) obj);
                return;
            case 8:
                ((MediaDataController) obj3).lambda$loadReplyMessagesForMessages$170((Timer.Task) obj2, j3, (ArrayList) obj);
                return;
            case 9:
                ((MediaDataController) obj3).lambda$loadMusic$141(j3, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 10:
                ((MessagesController) obj3).lambda$getGroupCall$62((TLObject) obj2, j3, (Runnable) obj);
                return;
            case 11:
                ((MessagesController) obj3).lambda$checkPromoInfoInternal$165((TLRPC.TL_help_promoData) obj2, (TLRPC.TL_messages_peerDialogs) obj, j3);
                return;
            case 12:
                ((MessagesController) obj3).lambda$updateChannelUserName$291(j3, (String) obj2, (Runnable) obj);
                return;
            case 13:
                ((MessagesController) obj3).lambda$checkChatInviter$374(j3, (ArrayList) obj2, (TLRPC.TL_channels_channelParticipant) obj);
                return;
            case 14:
                ((MessagesController) obj3).lambda$addUserToChat$300((Utilities.Callback) obj2, (TLRPC.TL_messages_invitedUsers) obj, j3);
                return;
            case 15:
                ((MessagesController) obj3).lambda$reloadMessages$73(j3, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 16:
                ((MessagesStorage) obj3).lambda$deleteUserChatHistory$85((ArrayList) obj2, j3, (ArrayList) obj);
                return;
            case 17:
                ((MessagesStorage) obj3).lambda$updateMessagePollResults$101(j3, (TLRPC.Poll) obj2, (TLRPC.PollResults) obj);
                return;
            case 18:
                ((MessagesStorage) obj3).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) obj2, (TLRPC.TL_messageReactions) obj, j3);
                return;
            case 19:
                ((MessagesStorage) obj3).lambda$getUserSync$258((TLRPC.User[]) obj2, j3, (CountDownLatch) obj);
                return;
            case 20:
                ((MessagesStorage) obj3).lambda$containsLocalDialog$179(j3, (Boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 21:
                ((MessagesStorage) obj3).lambda$getChannelPtsSync$257(j3, (Integer[]) obj2, (CountDownLatch) obj);
                return;
            case 22:
                ((MessagesStorage) obj3).lambda$getChatSync$259((TLRPC.Chat[]) obj2, j3, (CountDownLatch) obj);
                return;
            case 23:
                ((MessagesStorage) obj3).lambda$loadPendingTasks$14((TLRPC.TL_dialog) obj2, (TLRPC.InputPeer) obj, j3);
                return;
            case 24:
                ((MessagesStorage) obj3).lambda$getEncryptedChat$177(j3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 25:
                ((SavedMessagesController) obj3).lambda$updateDialogsLastMessage$9((MessagesStorage) obj2, (ArrayList) obj, j3);
                return;
            case 26:
                ((SavedMessagesController) obj3).lambda$loadCache$7((MessagesStorage) obj2, j3, (Runnable) obj);
                return;
            case 27:
                ((CameraController) obj3).lambda$finishRecordingVideo$15((File) obj2, (Bitmap) obj, j3);
                return;
            case 28:
                wi wiVar = (wi) obj3;
                wn wnVar = (wn) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                Context context = wiVar.getContext();
                int i20 = wiVar.J1;
                MessageSuggestionParams messageSuggestionParams = wnVar.g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new yh.e0(context, i20, this.b, messageSuggestionParams, wnVar, d6Var, 0, new org.telegram.ui.oc(17, wiVar, wnVar)).show();
                return;
            default:
                k31 k31Var = (k31) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((y70) obj2).u();
                TLRPC.User user3 = MessagesController.getInstance(k31Var.b).getUser(Long.valueOf(j3));
                if (user3 != null) {
                    wn wnVar2 = k31Var.h;
                    org.telegram.ui.Components.e5.r(wnVar2, -1, user3, chat, true, new z1(k31Var, j3, 6), wnVar2.getResourceProvider());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ q8(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    public /* synthetic */ q8(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }
}

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
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yi;
import org.telegram.ui.sa0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r8(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03b4  */
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
        Object obj;
        TL_stories.StoryItem storyItem;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        SQLiteCursor sQLiteCursor;
        hg.c2 c2Var;
        ArrayList arrayList2;
        Runnable runnable;
        hg.b2 b2Var;
        int i11;
        SQLiteCursor queryFinalized;
        SQLiteDatabase sQLiteDatabase;
        String str;
        SQLiteCursor sQLiteCursor2;
        MessageObject messageObject;
        NativeByteBuffer byteBufferValue;
        int i12 = this.a;
        String str2 = "SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC";
        int i13 = 0;
        long j3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                m9 m9Var = (m9) obj4;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ArrayList arrayList3 = m9Var.h;
                ArrayList arrayList4 = m9Var.g;
                int i14 = m9Var.a;
                FileLog.d("StoriesController update stories for dialog " + j3);
                m9Var.n0(j3, Collections.singletonList(tL_updateStory.story), false);
                m9Var.l0(j3, Collections.singletonList(tL_updateStory.story), true);
                a0.i iVar = m9Var.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) iVar.f(j3);
                ArrayList arrayList5 = new ArrayList();
                int i15 = m9Var.u;
                if (peerStories != null) {
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationsController.getInstance(i14).processDeleteStory(j3, storyItem2.id);
                    }
                    int i16 = 0;
                    while (true) {
                        if (i16 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i16).id != storyItem2.id) {
                            i16++;
                        } else if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i16);
                            org.telegram.messenger.q.o(storyItem2.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem3 = peerStories.stories.get(i16);
                            storyItem2 = m9.f(storyItem3, storyItem2);
                            arrayList5.add(storyItem2);
                            peerStories.stories.set(i16, storyItem2);
                            if (storyItem2.attachPath == null) {
                                storyItem2.attachPath = storyItem3.attachPath;
                            }
                            if (storyItem2.firstFramePath == null) {
                                storyItem2.firstFramePath = storyItem3.firstFramePath;
                            }
                            org.telegram.messenger.q.o(storyItem2.id, new StringBuilder("StoriesController update story id="));
                            z11 = true;
                        }
                    }
                    z12 = false;
                    if (z11) {
                        z13 = false;
                    } else {
                        if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                            FileLog.d("StoriesController can't add new story DELETED");
                            return;
                        }
                        if (ja.w(i14, storyItem2)) {
                            FileLog.d("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j3 > 0 && (user == null || (!user.self && !m9Var.M(user)))) {
                            FileLog.d("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList5.add(storyItem2);
                        peerStories.stories.add(storyItem2);
                        FileLog.d("StoriesController add new story id=" + storyItem2.id + " total stories count " + peerStories.stories.size());
                        m9Var.W(j3, storyItem2);
                        m9Var.g(peerStories);
                        z13 = true;
                        z12 = true;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || m9Var.K(j3)) {
                            Collections.sort(peerStories.stories, m9.X);
                        } else {
                            arrayList4.remove(peerStories);
                            arrayList3.remove(peerStories);
                            iVar.l(DialogObject.getPeerDialogId(peerStories.peer));
                            m9Var.u--;
                        }
                        z13 = true;
                    }
                    z10 = z13;
                } else {
                    TL_stories.StoryItem storyItem4 = tL_updateStory.story;
                    if (storyItem4 instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.d("StoriesController can't add user " + j3 + " with new story DELETED");
                        return;
                    }
                    if (ja.w(i14, storyItem4)) {
                        FileLog.d("StoriesController can't add user " + j3 + " with new story isExpired");
                        return;
                    }
                    if (j3 > 0 && (user == null || (!user.self && !m9Var.M(user)))) {
                        FileLog.d("StoriesController can't add user cause is not contact");
                        return;
                    }
                    TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                    tL_peerStories.peer = tL_updateStory.peer;
                    tL_peerStories.stories.add(tL_updateStory.story);
                    org.telegram.messenger.q.o(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                    long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                    m9Var.b0(peerDialogId, tL_peerStories);
                    if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
                        m9Var.g(tL_peerStories);
                        if (user2 != null && !user2.stories_hidden) {
                            m9Var.X(tL_peerStories);
                        }
                    }
                    FileLog.d("StoriesController applyNewStories " + peerDialogId);
                    m9Var.n0(peerDialogId, tL_peerStories.stories, false);
                    m9Var.u = m9Var.u + 1;
                    m9Var.O(j3);
                    z10 = true;
                }
                if (i15 != m9Var.u) {
                    m9Var.l.edit().putInt("total_stores", m9Var.u).apply();
                }
                m9Var.v(arrayList4);
                m9Var.v(arrayList3);
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
                TLObject tLObject = (TLObject) obj3;
                sa0 sa0Var = (sa0) obj2;
                m9 m9Var2 = ((s8) obj4).c;
                int i17 = m9Var2.a;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i17).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i17).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        for (int i18 = 0; i18 < peerStories2.stories.size(); i18++) {
                            if ((peerStories2.stories.get(i18).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories2.stories.get(i18) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.i iVar2 = m9Var2.E;
                                obj = (TL_stories.StoryItem) peerStories2.stories.get(i18);
                                iVar2.k(obj, j3);
                                sa0Var.run(obj);
                                return;
                            }
                        }
                    }
                }
                obj = null;
                sa0Var.run(obj);
                return;
            case 2:
                TLObject tLObject2 = (TLObject) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                m9 m9Var3 = ((t8) obj4).c;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(m9Var3.a).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(m9Var3.a).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.i iVar3 = m9Var3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        iVar3.k(storyItem, j3);
                        callback.run(storyItem);
                        return;
                    }
                }
                storyItem = null;
                callback.run(storyItem);
                return;
            case 3:
                long j10 = this.b;
                AndroidUtilities.runOnUIThread(new a3.h0((ia) obj4, (View) obj3, j10, 6), 500L);
                ((da) obj2).f(j10);
                return;
            case 4:
                ci.y9 y9Var = (ci.y9) obj4;
                boolean isChannel = ChatObject.isChannel((TLRPC.Chat) obj3);
                long j11 = this.b;
                TLRPC.ChatFull loadChatInfoInQueue = ((MessagesStorage) obj2).loadChatInfoInQueue(j11, isChannel, true, true, 0);
                if (loadChatInfoInQueue == null || (chatParticipants = loadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < loadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new ci.o9(y9Var, isChannel, j11, 0));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new a3.h0(y9Var, j11, loadChatInfoInQueue, 7));
                    return;
                }
            case 5:
                hg.c2 c2Var2 = (hg.c2) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList6 = new ArrayList();
                ArrayList<TLRPC.User> arrayList7 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList8 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            try {
                                try {
                                    hg.b2 b2Var2 = new hg.b2();
                                    b2Var2.a = queryFinalized2.intValue(i13);
                                    int i19 = i13;
                                    b2Var2.b = queryFinalized2.stringValue(1);
                                    b2Var2.c = queryFinalized2.intValue(2);
                                    b2Var2.f = queryFinalized2.intValue(3);
                                    arrayList6.add(b2Var2);
                                    i13 = i19;
                                } catch (Exception e7) {
                                    e = e7;
                                    c2Var = c2Var2;
                                    arrayList2 = arrayList6;
                                    sQLiteCursor = queryFinalized2;
                                    runnable = runnable2;
                                    try {
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        AndroidUtilities.runOnUIThread(new n3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
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
                                sQLiteCursor = queryFinalized2;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            c2Var = c2Var2;
                            arrayList2 = arrayList6;
                            runnable = runnable2;
                            sQLiteCursor = queryFinalized2;
                        }
                    }
                    int i20 = i13;
                    queryFinalized2.dispose();
                    ArrayList<Long> arrayList9 = new ArrayList<>();
                    ArrayList arrayList10 = new ArrayList();
                    SQLiteCursor sQLiteCursor3 = queryFinalized2;
                    int i21 = i20;
                    while (i21 < arrayList6.size()) {
                        try {
                            try {
                                b2Var = (hg.b2) arrayList6.get(i21);
                                arrayList2 = arrayList6;
                                try {
                                    i11 = i21;
                                } catch (Exception e11) {
                                    e = e11;
                                    c2Var = c2Var2;
                                }
                                try {
                                    Object[] objArr = new Object[1];
                                    objArr[i20] = Integer.valueOf(b2Var.a);
                                    queryFinalized = database.queryFinalized(str2, objArr);
                                } catch (Exception e12) {
                                    e = e12;
                                    c2Var = c2Var2;
                                    runnable = runnable2;
                                    sQLiteCursor = sQLiteCursor3;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                    }
                                    AndroidUtilities.runOnUIThread(new n3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                    return;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = sQLiteCursor3;
                            }
                            try {
                                try {
                                    if (queryFinalized.next()) {
                                        sQLiteDatabase = database;
                                        boolean z14 = i20;
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(z14 ? 1 : 0);
                                        if (byteBufferValue2 != null) {
                                            str = str2;
                                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(z14), z14);
                                            runnable = runnable2;
                                            try {
                                                TLdeserialize.send_state = queryFinalized.intValue(1);
                                                TLdeserialize.readAttachPath(byteBufferValue2, j3);
                                                byteBufferValue2.reuse();
                                                TLdeserialize.id = queryFinalized.intValue(2);
                                                TLdeserialize.date = queryFinalized.intValue(3);
                                                TLdeserialize.flags |= TLObject.FLAG_30;
                                                TLdeserialize.quick_reply_shortcut_id = queryFinalized.intValue(4);
                                                TLdeserialize.ttl = queryFinalized.intValue(5);
                                                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList9, arrayList10, null);
                                                c2Var = c2Var2;
                                                try {
                                                    MessageObject messageObject2 = new MessageObject(c2Var2.a, TLdeserialize, false, true);
                                                    b2Var.e = messageObject2;
                                                    b2Var.d = TLdeserialize.id;
                                                    messageObject2.generateThumbs(false);
                                                    b2Var.e.applyQuickReply(b2Var.b, b2Var.a);
                                                    queryFinalized.dispose();
                                                    i21 = i11 + 1;
                                                    sQLiteCursor3 = queryFinalized;
                                                    arrayList6 = arrayList2;
                                                    database = sQLiteDatabase;
                                                    str2 = str;
                                                    runnable2 = runnable;
                                                    c2Var2 = c2Var;
                                                    i20 = 0;
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    sQLiteCursor = queryFinalized;
                                                    FileLog.e(e);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    AndroidUtilities.runOnUIThread(new n3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                                    return;
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                c2Var = c2Var2;
                                                sQLiteCursor = queryFinalized;
                                                FileLog.e(e);
                                                if (sQLiteCursor != null) {
                                                }
                                                AndroidUtilities.runOnUIThread(new n3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                                return;
                                            }
                                        }
                                    } else {
                                        sQLiteDatabase = database;
                                    }
                                    c2Var = c2Var2;
                                    str = str2;
                                    runnable = runnable2;
                                    queryFinalized.dispose();
                                    i21 = i11 + 1;
                                    sQLiteCursor3 = queryFinalized;
                                    arrayList6 = arrayList2;
                                    database = sQLiteDatabase;
                                    str2 = str;
                                    runnable2 = runnable;
                                    c2Var2 = c2Var;
                                    i20 = 0;
                                } catch (Exception e15) {
                                    e = e15;
                                    c2Var = c2Var2;
                                    runnable = runnable2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e16) {
                            e = e16;
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
                    } catch (Exception e17) {
                        e = e17;
                        sQLiteCursor = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                        }
                        AndroidUtilities.runOnUIThread(new n3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                        return;
                    }
                } catch (Exception e18) {
                    e = e18;
                    c2Var = c2Var2;
                    arrayList2 = arrayList6;
                    runnable = runnable2;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new n3(c2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                return;
            case 6:
                hg.c2 c2Var3 = (hg.c2) obj4;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj3;
                hg.b2 b2Var3 = (hg.b2) obj2;
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
                        AndroidUtilities.runOnUIThread(new n3(c2Var3, arrayList13, arrayList14, b2Var3, messageObject, 8));
                        queryFinalized3.dispose();
                        return;
                    } catch (Exception e19) {
                        e = e19;
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
                } catch (Exception e20) {
                    e = e20;
                    sQLiteCursor2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor2 = null;
                }
                break;
            case 7:
                ((ChatMessagesMetadataController) obj4).lambda$loadStoriesForMessages$1((MessageObject) obj3, j3, (TL_stories.StoryItem) obj2);
                return;
            case 8:
                ((MediaDataController) obj4).lambda$loadReplyMessagesForMessages$170((Timer.Task) obj3, j3, (ArrayList) obj2);
                return;
            case 9:
                ((MediaDataController) obj4).lambda$loadMusic$141(j3, (ArrayList) obj3, (ArrayList) obj2);
                return;
            case 10:
                ((MessagesController) obj4).lambda$addUserToChat$299((Utilities.Callback) obj3, (TLRPC.TL_messages_invitedUsers) obj2, j3);
                return;
            case 11:
                ((MessagesController) obj4).lambda$checkChatInviter$373(j3, (ArrayList) obj3, (TLRPC.TL_channels_channelParticipant) obj2);
                return;
            case 12:
                ((MessagesController) obj4).lambda$getGroupCall$61((TLObject) obj3, j3, (Runnable) obj2);
                return;
            case 13:
                ((MessagesController) obj4).lambda$reloadMessages$72(j3, (ArrayList) obj3, (ArrayList) obj2);
                return;
            case 14:
                ((MessagesController) obj4).lambda$checkPromoInfoInternal$164((TLRPC.TL_help_promoData) obj3, (TLRPC.TL_messages_peerDialogs) obj2, j3);
                return;
            case 15:
                ((MessagesController) obj4).lambda$updateChannelUserName$290(j3, (String) obj3, (Runnable) obj2);
                return;
            case 16:
                ((MessagesStorage) obj4).lambda$deleteUserChatHistory$85((ArrayList) obj3, j3, (ArrayList) obj2);
                return;
            case 17:
                ((MessagesStorage) obj4).lambda$updateMessagePollResults$101(j3, (TLRPC.Poll) obj3, (TLRPC.PollResults) obj2);
                return;
            case 18:
                ((MessagesStorage) obj4).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) obj3, (TLRPC.TL_messageReactions) obj2, j3);
                return;
            case 19:
                ((MessagesStorage) obj4).lambda$getUserSync$258((TLRPC.User[]) obj3, j3, (CountDownLatch) obj2);
                return;
            case 20:
                ((MessagesStorage) obj4).lambda$containsLocalDialog$179(j3, (Boolean[]) obj3, (CountDownLatch) obj2);
                return;
            case 21:
                ((MessagesStorage) obj4).lambda$getChannelPtsSync$257(j3, (Integer[]) obj3, (CountDownLatch) obj2);
                return;
            case 22:
                ((MessagesStorage) obj4).lambda$getChatSync$259((TLRPC.Chat[]) obj3, j3, (CountDownLatch) obj2);
                return;
            case 23:
                ((MessagesStorage) obj4).lambda$loadPendingTasks$14((TLRPC.TL_dialog) obj3, (TLRPC.InputPeer) obj2, j3);
                return;
            case 24:
                ((MessagesStorage) obj4).lambda$getEncryptedChat$177(j3, (ArrayList) obj3, (CountDownLatch) obj2);
                return;
            case 25:
                ((SavedMessagesController) obj4).lambda$updateDialogsLastMessage$9((MessagesStorage) obj3, (ArrayList) obj2, j3);
                return;
            case 26:
                ((SavedMessagesController) obj4).lambda$loadCache$7((MessagesStorage) obj3, j3, (Runnable) obj2);
                return;
            case 27:
                ((CameraController) obj4).lambda$finishRecordingVideo$15((File) obj3, (Bitmap) obj2, j3);
                return;
            case 28:
                yi yiVar = (yi) obj4;
                zn znVar = (zn) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                Context context = yiVar.getContext();
                int i22 = yiVar.M1;
                MessageSuggestionParams messageSuggestionParams = znVar.g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new yh.c0(context, i22, this.b, messageSuggestionParams, znVar, e6Var, 0, new org.telegram.ui.pc(17, yiVar, znVar)).show();
                return;
            default:
                c41 c41Var = (c41) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                ((p80) obj3).u();
                TLRPC.User user3 = MessagesController.getInstance(c41Var.b).getUser(Long.valueOf(j3));
                if (user3 != null) {
                    zn znVar2 = c41Var.h;
                    org.telegram.ui.Components.g5.q(znVar2, -1, user3, chat, true, new z1(c41Var, j3, 6), znVar2.getResourceProvider());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ r8(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    public /* synthetic */ r8(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }
}

package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
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
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.h10;
import org.telegram.ui.j60;
import org.telegram.ui.pf;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
import org.telegram.ui.zq;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ua(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = j3;
        this.e = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:174|175|176)|171|172) */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x050d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x050e, code lost:
    
        r23 = r3;
        r25 = r4;
        r29 = r15;
        r9 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x053e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        SQLiteCursor sQLiteCursor;
        gg.k2 k2Var;
        ArrayList arrayList2;
        Runnable runnable;
        int i10;
        SQLiteDatabase sQLiteDatabase;
        String str;
        SQLiteCursor sQLiteCursor2;
        ArrayList<Long> arrayList3;
        ArrayList arrayList4;
        SQLiteCursor queryFinalized;
        MessageObject messageObject;
        NativeByteBuffer byteBufferValue;
        int i11;
        int i12 = this.a;
        String str2 = "SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC";
        int i13 = 5;
        int i14 = 0;
        long j3 = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                kb kbVar = (kb) obj3;
                boolean isChannel = ChatObject.isChannel((TLRPC.Chat) obj2);
                long j10 = this.c;
                TLRPC.ChatFull loadChatInfoInQueue = ((MessagesStorage) obj).loadChatInfoInQueue(j10, isChannel, true, true, 0);
                if (loadChatInfoInQueue == null || (chatParticipants = loadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < loadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new xa(kbVar, isChannel, j10, 0));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new a3.h0(kbVar, j10, loadChatInfoInQueue, 1));
                    return;
                }
            case 1:
                gg.k2 k2Var2 = (gg.k2) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList5 = new ArrayList();
                ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            try {
                                gg.j2 j2Var = new gg.j2();
                                j2Var.a = queryFinalized2.intValue(i14);
                                j2Var.b = queryFinalized2.stringValue(1);
                                j2Var.c = queryFinalized2.intValue(2);
                                j2Var.f = queryFinalized2.intValue(3);
                                arrayList5.add(j2Var);
                                i14 = 0;
                            } catch (Exception e) {
                                e = e;
                                k2Var = k2Var2;
                                arrayList2 = arrayList5;
                                sQLiteCursor = queryFinalized2;
                                runnable = runnable2;
                                try {
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                    }
                                    AndroidUtilities.runOnUIThread(new ya(k2Var, arrayList6, arrayList7, arrayList2, runnable, 3));
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized2;
                        }
                    }
                    char c10 = 0;
                    queryFinalized2.dispose();
                    ArrayList<Long> arrayList8 = new ArrayList<>();
                    ArrayList arrayList9 = new ArrayList();
                    SQLiteCursor sQLiteCursor3 = queryFinalized2;
                    int i15 = 0;
                    while (i15 < arrayList5.size()) {
                        try {
                            try {
                                gg.j2 j2Var2 = (gg.j2) arrayList5.get(i15);
                                arrayList2 = arrayList5;
                                try {
                                    i10 = i15;
                                } catch (Exception e7) {
                                    e = e7;
                                    k2Var = k2Var2;
                                }
                                try {
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = Integer.valueOf(j2Var2.a);
                                    SQLiteCursor queryFinalized3 = database.queryFinalized(str2, objArr);
                                    try {
                                        try {
                                            if (queryFinalized3.next()) {
                                                sQLiteDatabase = database;
                                                NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                                if (byteBufferValue2 != null) {
                                                    str = str2;
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                    runnable = runnable2;
                                                    try {
                                                        TLdeserialize.send_state = queryFinalized3.intValue(1);
                                                        TLdeserialize.readAttachPath(byteBufferValue2, j3);
                                                        byteBufferValue2.reuse();
                                                        TLdeserialize.id = queryFinalized3.intValue(2);
                                                        TLdeserialize.date = queryFinalized3.intValue(3);
                                                        TLdeserialize.flags |= TLObject.FLAG_30;
                                                        TLdeserialize.quick_reply_shortcut_id = queryFinalized3.intValue(4);
                                                        TLdeserialize.ttl = queryFinalized3.intValue(5);
                                                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList8, arrayList9, null);
                                                        k2Var = k2Var2;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        k2Var = k2Var2;
                                                        sQLiteCursor = queryFinalized3;
                                                        FileLog.e(e);
                                                        if (sQLiteCursor != null) {
                                                            sQLiteCursor.dispose();
                                                        }
                                                        AndroidUtilities.runOnUIThread(new ya(k2Var, arrayList6, arrayList7, arrayList2, runnable, 3));
                                                        return;
                                                    }
                                                    try {
                                                        MessageObject messageObject2 = new MessageObject(k2Var2.a, TLdeserialize, false, true);
                                                        j2Var2.e = messageObject2;
                                                        j2Var2.d = TLdeserialize.id;
                                                        messageObject2.generateThumbs(false);
                                                        j2Var2.e.applyQuickReply(j2Var2.b, j2Var2.a);
                                                        queryFinalized3.dispose();
                                                        i15 = i10 + 1;
                                                        sQLiteCursor3 = queryFinalized3;
                                                        k2Var2 = k2Var;
                                                        arrayList5 = arrayList2;
                                                        database = sQLiteDatabase;
                                                        str2 = str;
                                                        runnable2 = runnable;
                                                        c10 = 0;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        sQLiteCursor = queryFinalized3;
                                                        FileLog.e(e);
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        AndroidUtilities.runOnUIThread(new ya(k2Var, arrayList6, arrayList7, arrayList2, runnable, 3));
                                                        return;
                                                    }
                                                }
                                            } else {
                                                sQLiteDatabase = database;
                                            }
                                            k2Var = k2Var2;
                                            str = str2;
                                            runnable = runnable2;
                                            queryFinalized3.dispose();
                                            i15 = i10 + 1;
                                            sQLiteCursor3 = queryFinalized3;
                                            k2Var2 = k2Var;
                                            arrayList5 = arrayList2;
                                            database = sQLiteDatabase;
                                            str2 = str;
                                            runnable2 = runnable;
                                            c10 = 0;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            sQLiteCursor = queryFinalized3;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        k2Var = k2Var2;
                                        runnable = runnable2;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    k2Var = k2Var2;
                                    runnable = runnable2;
                                    sQLiteCursor = sQLiteCursor3;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                    }
                                    AndroidUtilities.runOnUIThread(new ya(k2Var, arrayList6, arrayList7, arrayList2, runnable, 3));
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteCursor = sQLiteCursor3;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            k2Var = k2Var2;
                            arrayList2 = arrayList5;
                        }
                    }
                    k2Var = k2Var2;
                    arrayList2 = arrayList5;
                    runnable = runnable2;
                    try {
                        if (!arrayList9.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList9), arrayList7);
                        }
                        if (!arrayList8.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList8, arrayList6);
                        }
                        sQLiteCursor3.dispose();
                    } catch (Exception e15) {
                        e = e15;
                        sQLiteCursor = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                        }
                        AndroidUtilities.runOnUIThread(new ya(k2Var, arrayList6, arrayList7, arrayList2, runnable, 3));
                        return;
                    }
                } catch (Exception e16) {
                    e = e16;
                    k2Var = k2Var2;
                    arrayList2 = arrayList5;
                    runnable = runnable2;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new ya(k2Var, arrayList6, arrayList7, arrayList2, runnable, 3));
                return;
            case 2:
                gg.k2 k2Var3 = (gg.k2) obj3;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj;
                gg.j2 j2Var3 = (gg.j2) obj2;
                try {
                    arrayList3 = new ArrayList<>();
                    arrayList4 = new ArrayList();
                    queryFinalized = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(j2Var3.a));
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor2 = null;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        messageObject = null;
                    } else {
                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        TLdeserialize2.send_state = queryFinalized.intValue(1);
                        TLdeserialize2.readAttachPath(byteBufferValue, j3);
                        byteBufferValue.reuse();
                        TLdeserialize2.id = queryFinalized.intValue(2);
                        TLdeserialize2.date = queryFinalized.intValue(3);
                        TLdeserialize2.flags |= TLObject.FLAG_30;
                        TLdeserialize2.quick_reply_shortcut_id = queryFinalized.intValue(4);
                        TLdeserialize2.ttl = queryFinalized.intValue(5);
                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList3, arrayList4, null);
                        messageObject = new MessageObject(k2Var3.a, TLdeserialize2, false, true);
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                    ArrayList<TLRPC.Chat> arrayList11 = new ArrayList<>();
                    if (!arrayList4.isEmpty()) {
                        messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList4), arrayList11);
                    }
                    if (!arrayList3.isEmpty()) {
                        messagesStorage2.getUsersInternal(arrayList3, arrayList10);
                    }
                    AndroidUtilities.runOnUIThread(new ya(k2Var3, arrayList10, arrayList11, j2Var3, messageObject, 4));
                    queryFinalized.dispose();
                    return;
                } catch (Exception e18) {
                    e = e18;
                    sQLiteCursor2 = queryFinalized;
                    try {
                        FileLog.e(e);
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th8) {
                        th = th8;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor2 = queryFinalized;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
            case 3:
                ((ChatMessagesMetadataController) obj3).lambda$loadStoriesForMessages$1((MessageObject) obj2, j3, (TL_stories.StoryItem) obj);
                return;
            case 4:
                ((MediaDataController) obj3).lambda$loadReplyMessagesForMessages$170((Timer.Task) obj2, j3, (ArrayList) obj);
                return;
            case 5:
                ((MediaDataController) obj3).lambda$loadMusic$141(j3, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 6:
                ((MessagesController) obj3).lambda$getGroupCall$62((TLObject) obj2, j3, (Runnable) obj);
                return;
            case 7:
                ((MessagesController) obj3).lambda$checkPromoInfoInternal$165((TLRPC.TL_help_promoData) obj2, (TLRPC.TL_messages_peerDialogs) obj, j3);
                return;
            case 8:
                ((MessagesController) obj3).lambda$updateChannelUserName$291(j3, (String) obj2, (Runnable) obj);
                return;
            case 9:
                ((MessagesController) obj3).lambda$checkChatInviter$374(j3, (ArrayList) obj2, (TLRPC.TL_channels_channelParticipant) obj);
                return;
            case 10:
                ((MessagesController) obj3).lambda$addUserToChat$300((Utilities.Callback) obj2, (TLRPC.TL_messages_invitedUsers) obj, j3);
                return;
            case 11:
                ((MessagesController) obj3).lambda$reloadMessages$73(j3, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 12:
                ((MessagesStorage) obj).lambda$deleteUserChatHistory$85((ArrayList) obj3, j3, (ArrayList) obj2);
                return;
            case 13:
                ((MessagesStorage) obj).lambda$updateMessagePollResults$101(j3, (TLRPC.Poll) obj3, (TLRPC.PollResults) obj2);
                return;
            case 14:
                ((MessagesStorage) obj).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) obj3, (TLRPC.TL_messageReactions) obj2, j3);
                return;
            case 15:
                ((MessagesStorage) obj).lambda$getUserSync$258((TLRPC.User[]) obj3, j3, (CountDownLatch) obj2);
                return;
            case 16:
                ((MessagesStorage) obj).lambda$containsLocalDialog$179(j3, (Boolean[]) obj3, (CountDownLatch) obj2);
                return;
            case 17:
                ((MessagesStorage) obj).lambda$getChannelPtsSync$257(j3, (Integer[]) obj3, (CountDownLatch) obj2);
                return;
            case 18:
                ((MessagesStorage) obj).lambda$getChatSync$259((TLRPC.Chat[]) obj3, j3, (CountDownLatch) obj2);
                return;
            case 19:
                ((MessagesStorage) obj).lambda$loadPendingTasks$14((TLRPC.TL_dialog) obj3, (TLRPC.InputPeer) obj2, j3);
                return;
            case 20:
                ((MessagesStorage) obj).lambda$getEncryptedChat$177(j3, (ArrayList) obj3, (CountDownLatch) obj2);
                return;
            case 21:
                ((SavedMessagesController) obj3).lambda$updateDialogsLastMessage$9((MessagesStorage) obj, (ArrayList) obj2, j3);
                return;
            case 22:
                ((SavedMessagesController) obj3).lambda$loadCache$7((MessagesStorage) obj, j3, (Runnable) obj2);
                return;
            case 23:
                ((CameraController) obj3).lambda$finishRecordingVideo$15((File) obj2, (Bitmap) obj, j3);
                return;
            case 24:
                yi yiVar = (yi) obj3;
                eo eoVar = (eo) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                Context context = yiVar.getContext();
                int i16 = yiVar.J1;
                MessageSuggestionParams messageSuggestionParams = eoVar.g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new xh.e0(context, i16, this.c, messageSuggestionParams, eoVar, f6Var, 0, new pf(yiVar, eoVar)).show();
                return;
            case 25:
                k31 k31Var = (k31) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                ((w70) obj).u();
                TLRPC.User user = MessagesController.getInstance(k31Var.b).getUser(Long.valueOf(j3));
                if (user != null) {
                    eo eoVar2 = k31Var.h;
                    org.telegram.ui.Components.d5.r(eoVar2, -1, user, chat, true, new za(k31Var, j3, i13), eoVar2.getResourceProvider());
                    return;
                }
                return;
            case 26:
                k31 k31Var2 = (k31) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                k31Var2.e0.removeAll((HashSet) obj2);
                k31Var2.o();
                int size = arrayList12.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj4 = arrayList12.get(i17);
                    i17++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        k31Var2.m(intValue, false);
                        return;
                    }
                }
                return;
            case 27:
                wy wyVar = (wy) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter == null || !wyVar.g4(dialog)) {
                    i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        i18 = Math.min(i18, dialogFilter.pinnedDialogs.valueAt(i19));
                    }
                    i11 = i18 - wyVar.N2;
                }
                long j11 = this.c;
                TLRPC.EncryptedChat m10 = DialogObject.isEncryptedDialog(j11) ? org.telegram.messenger.a2.m(wyVar.getMessagesController(), j11) : null;
                UndoView Y3 = wyVar.Y3();
                if (Y3 == null) {
                    return;
                }
                if (wyVar.g4(dialog)) {
                    wyVar.s4(j11, false, dialogFilter, i11, true);
                    Y3.k(0L, 79, 1, 1600, null, null);
                } else {
                    wyVar.s4(j11, true, dialogFilter, i11, true);
                    Y3.k(0L, 78, 1, 1600, null, null);
                    if (dialogFilter != null) {
                        if (m10 != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(m10.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(m10.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j11))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j11));
                        }
                    }
                }
                if (dialogFilter != null) {
                    h10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, wyVar, null);
                }
                wyVar.getMessagesController().reorderPinnedDialogs(wyVar.V2, null, 0L);
                wyVar.T4(true);
                if (wyVar.e0 != null) {
                    int i20 = 0;
                    while (true) {
                        vy[] vyVarArr = wyVar.e0;
                        if (i20 < vyVarArr.length) {
                            vyVarArr[i20].d.H = false;
                            i20++;
                        }
                    }
                }
                wyVar.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 28:
                j60 j60Var = (j60) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ChatObject.Call call = j60Var.a1;
                if (call == null || j60Var.s0) {
                    return;
                }
                call.addInvitedUser(j3);
                j60Var.O0(true);
                b40 b40Var = j60Var.E1;
                if (b40Var != null) {
                    b40Var.dismiss();
                }
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                j60Var.k1().k(0L, 34, user2, j60Var.Z0, null, null);
                return;
            default:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                zq zqVar = (zq) obj;
                Pattern pattern = LaunchActivity.B1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    zqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                messagesController.putUsers(tL_stories_peerStories.users, false);
                messagesController.getStoriesController().a0(j3, tL_stories_peerStories.stories);
                zqVar.run();
                return;
        }
    }

    public /* synthetic */ ua(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = j3;
        this.e = obj3;
    }

    public /* synthetic */ ua(Object obj, Object obj2, long j3, Object obj3, int i10, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = j3;
        this.b = obj3;
    }

    public /* synthetic */ ua(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = j3;
    }

    public /* synthetic */ ua(Object obj, MessagesStorage messagesStorage, Object obj2, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = messagesStorage;
        this.e = obj2;
        this.c = j3;
    }

    public /* synthetic */ ua(MessagesStorage messagesStorage, long j3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ ua(MessagesStorage messagesStorage, Object obj, long j3, Object obj2, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.d = obj;
        this.c = j3;
        this.e = obj2;
    }

    public /* synthetic */ ua(MessagesStorage messagesStorage, TLObject tLObject, TLObject tLObject2, long j3, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.d = tLObject;
        this.e = tLObject2;
        this.c = j3;
    }
}

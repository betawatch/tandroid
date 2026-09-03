package org.telegram.messenger;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.w21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.c10;
import org.telegram.ui.e60;
import org.telegram.ui.ie0;
import org.telegram.ui.ov0;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.ra0;
import org.telegram.ui.sa0;
import org.telegram.ui.tq;
import org.telegram.ui.z61;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class di implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ di(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = j10;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0278  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        SQLiteCursor sQLiteCursor;
        uf.p1 p1Var;
        ArrayList arrayList2;
        Runnable runnable;
        uf.o1 o1Var;
        int i11;
        SQLiteDatabase sQLiteDatabase;
        String str;
        SQLiteCursor sQLiteCursor2;
        ArrayList<Long> arrayList3;
        ArrayList arrayList4;
        SQLiteCursor queryFinalized;
        MessageObject messageObject;
        NativeByteBuffer byteBufferValue;
        int i12 = this.a;
        String str2 = "SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC";
        int i13 = 0;
        long j10 = this.d;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                ((SavedMessagesController) obj3).lambda$updateDialogsLastMessage$9((MessagesStorage) obj2, (ArrayList) obj, j10);
                return;
            case 1:
                ((SavedMessagesController) obj3).lambda$loadCache$7((MessagesStorage) obj2, j10, (Runnable) obj);
                return;
            case 2:
                ((CameraController) obj3).lambda$finishRecordingVideo$15((File) obj2, (Bitmap) obj, j10);
                return;
            case 3:
                org.telegram.ui.Components.li liVar = (org.telegram.ui.Components.li) obj3;
                zn znVar = (zn) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                Context context = liVar.getContext();
                int i14 = liVar.G1;
                MessageSuggestionParams messageSuggestionParams = znVar.d5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new lh.s0(context, i14, this.d, messageSuggestionParams, znVar, f6Var, 0, new kh.a1(28, liVar, znVar)).show();
                return;
            case 4:
                w21 w21Var = (w21) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((p70) obj2).u();
                TLRPC.User user = MessagesController.getInstance(w21Var.b).getUser(Long.valueOf(j10));
                if (user != null) {
                    zn znVar2 = w21Var.h;
                    org.telegram.ui.Components.z4.r(znVar2, -1, user, chat, true, new f3.e(w21Var, j10, 5), znVar2.getResourceProvider());
                    return;
                }
                return;
            case 5:
                w21 w21Var2 = (w21) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                w21Var2.b0.removeAll((HashSet) obj2);
                w21Var2.o();
                int size = arrayList5.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj4 = arrayList5.get(i15);
                    i15++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j10 == intValue) {
                        w21Var2.m(intValue, false);
                        return;
                    }
                }
                return;
            case 6:
                qy qyVar = (qy) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter == null || !qyVar.g4(dialog)) {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        i16 = Math.min(i16, dialogFilter.pinnedDialogs.valueAt(i17));
                    }
                    i10 = i16 - qyVar.K2;
                }
                long j11 = this.d;
                TLRPC.EncryptedChat n10 = DialogObject.isEncryptedDialog(j11) ? y3.n(qyVar.getMessagesController(), j11) : null;
                UndoView Y3 = qyVar.Y3();
                if (Y3 == null) {
                    return;
                }
                if (qyVar.g4(dialog)) {
                    qyVar.s4(j11, false, dialogFilter, i10, true);
                    Y3.k(0L, 79, 1, 1600, null, null);
                } else {
                    qyVar.s4(j11, true, dialogFilter, i10, true);
                    Y3.k(0L, 78, 1, 1600, null, null);
                    if (dialogFilter != null) {
                        if (n10 != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(n10.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(n10.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j11))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j11));
                        }
                    }
                }
                if (dialogFilter != null) {
                    c10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, qyVar, null);
                }
                qyVar.getMessagesController().reorderPinnedDialogs(qyVar.S2, null, 0L);
                qyVar.T4(true);
                if (qyVar.b0 != null) {
                    int i18 = 0;
                    while (true) {
                        py[] pyVarArr = qyVar.b0;
                        if (i18 < pyVarArr.length) {
                            pyVarArr[i18].d.E = false;
                            i18++;
                        }
                    }
                }
                qyVar.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 7:
                e60 e60Var = (e60) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ChatObject.Call call = e60Var.X0;
                if (call == null || e60Var.p0) {
                    return;
                }
                call.addInvitedUser(j10);
                e60Var.O0(true);
                u30 u30Var = e60Var.B1;
                if (u30Var != null) {
                    u30Var.dismiss();
                }
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                e60Var.k1().k(0L, 34, user2, e60Var.W0, null, null);
                return;
            case 8:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                tq tqVar = (tq) obj;
                Pattern pattern = LaunchActivity.y1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    tqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                messagesController.putUsers(tL_stories_peerStories.users, false);
                messagesController.getStoriesController().a0(j10, tL_stories_peerStories.stories);
                tqVar.run();
                return;
            case 9:
                sa0 sa0Var = (sa0) obj3;
                LaunchActivity launchActivity = sa0Var.g;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.L);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j12 = this.d;
                    long j13 = -j12;
                    if (messagesController2.getGroupCall(j13, false) != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(j13));
                        accountInstance.getMessagesController().getInputPeer(j12);
                        org.telegram.ui.Components.voip.f2.l(chat2, null, false, Boolean.valueOf(!r0.call.rtmp_stream), launchActivity, p2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j13);
                    if (chatFull != null) {
                        if (chatFull.call != null) {
                            accountInstance.getMessagesController().getGroupCall(j13, true, new ra0(sa0Var, accountInstance, j12, p2Var, 0));
                            return;
                        } else {
                            if (p2Var.getParentActivity() != null) {
                                kf.k0.v(R.string.InviteExpired, org.telegram.ui.Components.qc.a0(p2Var), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                long j14 = this.d;
                kh.y0 y0Var = new kh.y0(photoViewer, (String) obj2, photoEntry, j14, 5);
                if (photoViewer.A2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.z2.getWidth(), photoViewer.z2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.z2, createBitmap, new ie0(29, y0Var, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.y2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.y2.getHeight());
                if (bitmap == null) {
                    y0Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j14, null, true));
                    return;
                } else {
                    y0Var.run(bitmap);
                    return;
                }
            case 11:
                ph.y7 y7Var = (ph.y7) obj3;
                boolean isChannel = ChatObject.isChannel((TLRPC.Chat) obj);
                long j15 = this.d;
                TLRPC.ChatFull loadChatInfoInQueue = ((MessagesStorage) obj2).loadChatInfoInQueue(j15, isChannel, true, true, 0);
                if (loadChatInfoInQueue == null || (chatParticipants = loadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < loadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new lh.pa(y7Var, isChannel, j15, 5));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new ov0(y7Var, j15, loadChatInfoInQueue, 1));
                    return;
                }
            case 12:
                uf.p1 p1Var2 = (uf.p1) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Runnable runnable2 = (Runnable) obj;
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
                                    uf.o1 o1Var2 = new uf.o1();
                                    o1Var2.a = queryFinalized2.intValue(i13);
                                    o1Var2.b = queryFinalized2.stringValue(1);
                                    o1Var2.c = queryFinalized2.intValue(2);
                                    o1Var2.f = queryFinalized2.intValue(3);
                                    arrayList6.add(o1Var2);
                                    i13 = 0;
                                } catch (Exception e) {
                                    e = e;
                                    p1Var = p1Var2;
                                    arrayList2 = arrayList6;
                                    sQLiteCursor = queryFinalized2;
                                    runnable = runnable2;
                                    try {
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                        }
                                        AndroidUtilities.runOnUIThread(new z61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
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
                        } catch (Exception e6) {
                            e = e6;
                            p1Var = p1Var2;
                            arrayList2 = arrayList6;
                            runnable = runnable2;
                            sQLiteCursor = queryFinalized2;
                        }
                    }
                    char c3 = 0;
                    queryFinalized2.dispose();
                    ArrayList<Long> arrayList9 = new ArrayList<>();
                    ArrayList arrayList10 = new ArrayList();
                    SQLiteCursor sQLiteCursor3 = queryFinalized2;
                    int i19 = 0;
                    while (i19 < arrayList6.size()) {
                        try {
                            try {
                                o1Var = (uf.o1) arrayList6.get(i19);
                                arrayList2 = arrayList6;
                                try {
                                    i11 = i19;
                                } catch (Exception e10) {
                                    e = e10;
                                    p1Var = p1Var2;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                p1Var = p1Var2;
                                arrayList2 = arrayList6;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = sQLiteCursor3;
                        }
                        try {
                            Object[] objArr = new Object[1];
                            objArr[c3] = Integer.valueOf(o1Var.a);
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
                                                TLdeserialize.readAttachPath(byteBufferValue2, j10);
                                                byteBufferValue2.reuse();
                                                TLdeserialize.id = queryFinalized3.intValue(2);
                                                TLdeserialize.date = queryFinalized3.intValue(3);
                                                TLdeserialize.flags |= TLObject.FLAG_30;
                                                TLdeserialize.quick_reply_shortcut_id = queryFinalized3.intValue(4);
                                                TLdeserialize.ttl = queryFinalized3.intValue(5);
                                                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList9, arrayList10, null);
                                                p1Var = p1Var2;
                                                try {
                                                    MessageObject messageObject2 = new MessageObject(p1Var2.a, TLdeserialize, false, true);
                                                    o1Var.e = messageObject2;
                                                    o1Var.d = TLdeserialize.id;
                                                    messageObject2.generateThumbs(false);
                                                    o1Var.e.applyQuickReply(o1Var.b, o1Var.a);
                                                    queryFinalized3.dispose();
                                                    i19 = i11 + 1;
                                                    sQLiteCursor3 = queryFinalized3;
                                                    arrayList6 = arrayList2;
                                                    database = sQLiteDatabase;
                                                    str2 = str;
                                                    runnable2 = runnable;
                                                    p1Var2 = p1Var;
                                                    c3 = 0;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    sQLiteCursor = queryFinalized3;
                                                    FileLog.e(e);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    AndroidUtilities.runOnUIThread(new z61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
                                                    return;
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                p1Var = p1Var2;
                                                sQLiteCursor = queryFinalized3;
                                                FileLog.e(e);
                                                if (sQLiteCursor != null) {
                                                }
                                                AndroidUtilities.runOnUIThread(new z61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
                                                return;
                                            }
                                        }
                                    } else {
                                        sQLiteDatabase = database;
                                    }
                                    p1Var = p1Var2;
                                    str = str2;
                                    runnable = runnable2;
                                    queryFinalized3.dispose();
                                    i19 = i11 + 1;
                                    sQLiteCursor3 = queryFinalized3;
                                    arrayList6 = arrayList2;
                                    database = sQLiteDatabase;
                                    str2 = str;
                                    runnable2 = runnable;
                                    p1Var2 = p1Var;
                                    c3 = 0;
                                } catch (Exception e14) {
                                    e = e14;
                                    p1Var = p1Var2;
                                    runnable = runnable2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteCursor = queryFinalized3;
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            p1Var = p1Var2;
                            runnable = runnable2;
                            sQLiteCursor = sQLiteCursor3;
                            FileLog.e(e);
                            if (sQLiteCursor != null) {
                            }
                            AndroidUtilities.runOnUIThread(new z61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
                            return;
                        }
                    }
                    p1Var = p1Var2;
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
                            sQLiteCursor.dispose();
                        }
                        AndroidUtilities.runOnUIThread(new z61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
                        return;
                    }
                } catch (Exception e17) {
                    e = e17;
                    p1Var = p1Var2;
                    arrayList2 = arrayList6;
                    runnable = runnable2;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new z61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
                return;
            default:
                uf.p1 p1Var3 = (uf.p1) obj3;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                uf.o1 o1Var3 = (uf.o1) obj;
                try {
                    arrayList3 = new ArrayList<>();
                    arrayList4 = new ArrayList();
                    queryFinalized = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(o1Var3.a));
                } catch (Exception e18) {
                    e = e18;
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
                        TLdeserialize2.readAttachPath(byteBufferValue, j10);
                        byteBufferValue.reuse();
                        TLdeserialize2.id = queryFinalized.intValue(2);
                        TLdeserialize2.date = queryFinalized.intValue(3);
                        TLdeserialize2.flags |= TLObject.FLAG_30;
                        TLdeserialize2.quick_reply_shortcut_id = queryFinalized.intValue(4);
                        TLdeserialize2.ttl = queryFinalized.intValue(5);
                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList3, arrayList4, null);
                        messageObject = new MessageObject(p1Var3.a, TLdeserialize2, false, true);
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList11 = new ArrayList<>();
                    ArrayList<TLRPC.Chat> arrayList12 = new ArrayList<>();
                    if (!arrayList4.isEmpty()) {
                        messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList4), arrayList12);
                    }
                    if (!arrayList3.isEmpty()) {
                        messagesStorage2.getUsersInternal(arrayList3, arrayList11);
                    }
                    AndroidUtilities.runOnUIThread(new z61(p1Var3, arrayList11, arrayList12, o1Var3, messageObject, 5));
                    queryFinalized.dispose();
                    return;
                } catch (Exception e19) {
                    e = e19;
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
        }
    }

    public /* synthetic */ di(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = j10;
    }

    public /* synthetic */ di(org.telegram.ui.ActionBar.g3 g3Var, long j10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = g3Var;
        this.d = j10;
        this.c = obj;
        this.e = obj2;
    }

    public /* synthetic */ di(ph.y7 y7Var, TLRPC.Chat chat, MessagesStorage messagesStorage, long j10) {
        this.a = 11;
        this.b = y7Var;
        this.e = chat;
        this.c = messagesStorage;
        this.d = j10;
    }
}

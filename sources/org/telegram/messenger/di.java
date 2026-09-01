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
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.x21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b10;
import org.telegram.ui.d60;
import org.telegram.ui.he0;
import org.telegram.ui.jv0;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.qa0;
import org.telegram.ui.ra0;
import org.telegram.ui.sq;
import org.telegram.ui.t61;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        vf.p1 p1Var;
        ArrayList arrayList2;
        Runnable runnable;
        vf.o1 o1Var;
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
                org.telegram.ui.Components.mi miVar = (org.telegram.ui.Components.mi) obj3;
                xn xnVar = (xn) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                Context context = miVar.getContext();
                int i14 = miVar.G1;
                MessageSuggestionParams messageSuggestionParams = xnVar.d5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new mh.r0(context, i14, this.d, messageSuggestionParams, xnVar, g6Var, 0, new lh.a1(28, miVar, xnVar)).show();
                return;
            case 4:
                x21 x21Var = (x21) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((q70) obj2).u();
                TLRPC.User user = MessagesController.getInstance(x21Var.b).getUser(Long.valueOf(j10));
                if (user != null) {
                    xn xnVar2 = x21Var.h;
                    org.telegram.ui.Components.z4.r(xnVar2, -1, user, chat, true, new f3.e(x21Var, j10, 5), xnVar2.getResourceProvider());
                    return;
                }
                return;
            case 5:
                x21 x21Var2 = (x21) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                x21Var2.b0.removeAll((HashSet) obj2);
                x21Var2.o();
                int size = arrayList5.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj4 = arrayList5.get(i15);
                    i15++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j10 == intValue) {
                        x21Var2.m(intValue, false);
                        return;
                    }
                }
                return;
            case 6:
                py pyVar = (py) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter == null || !pyVar.g4(dialog)) {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        i16 = Math.min(i16, dialogFilter.pinnedDialogs.valueAt(i17));
                    }
                    i10 = i16 - pyVar.K2;
                }
                long j11 = this.d;
                TLRPC.EncryptedChat n10 = DialogObject.isEncryptedDialog(j11) ? y3.n(pyVar.getMessagesController(), j11) : null;
                UndoView Y3 = pyVar.Y3();
                if (Y3 == null) {
                    return;
                }
                if (pyVar.g4(dialog)) {
                    pyVar.s4(j11, false, dialogFilter, i10, true);
                    Y3.k(0L, 79, 1, 1600, null, null);
                } else {
                    pyVar.s4(j11, true, dialogFilter, i10, true);
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
                    b10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, pyVar, null);
                }
                pyVar.getMessagesController().reorderPinnedDialogs(pyVar.S2, null, 0L);
                pyVar.T4(true);
                if (pyVar.b0 != null) {
                    int i18 = 0;
                    while (true) {
                        oy[] oyVarArr = pyVar.b0;
                        if (i18 < oyVarArr.length) {
                            oyVarArr[i18].d.E = false;
                            i18++;
                        }
                    }
                }
                pyVar.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 7:
                d60 d60Var = (d60) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ChatObject.Call call = d60Var.X0;
                if (call == null || d60Var.p0) {
                    return;
                }
                call.addInvitedUser(j10);
                d60Var.O0(true);
                v30 v30Var = d60Var.B1;
                if (v30Var != null) {
                    v30Var.dismiss();
                }
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                d60Var.k1().k(0L, 34, user2, d60Var.W0, null, null);
                return;
            case 8:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                sq sqVar = (sq) obj;
                Pattern pattern = LaunchActivity.y1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    sqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                messagesController.putUsers(tL_stories_peerStories.users, false);
                messagesController.getStoriesController().a0(j10, tL_stories_peerStories.stories);
                sqVar.run();
                return;
            case 9:
                ra0 ra0Var = (ra0) obj3;
                LaunchActivity launchActivity = ra0Var.g;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.L);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j12 = this.d;
                    long j13 = -j12;
                    if (messagesController2.getGroupCall(j13, false) != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(j13));
                        accountInstance.getMessagesController().getInputPeer(j12);
                        org.telegram.ui.Components.voip.g2.m(chat2, null, false, Boolean.valueOf(!r0.call.rtmp_stream), launchActivity, p2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j13);
                    if (chatFull != null) {
                        if (chatFull.call != null) {
                            accountInstance.getMessagesController().getGroupCall(j13, true, new qa0(ra0Var, accountInstance, j12, p2Var, 0));
                            return;
                        } else {
                            if (p2Var.getParentActivity() != null) {
                                l.d.v(R.string.InviteExpired, org.telegram.ui.Components.qc.a0(p2Var), R.raw.linkbroken, 36);
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
                lh.y0 y0Var = new lh.y0(photoViewer, (String) obj2, photoEntry, j14, 5);
                if (photoViewer.A2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.z2.getWidth(), photoViewer.z2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.z2, createBitmap, new he0(29, y0Var, createBitmap));
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
                qh.x7 x7Var = (qh.x7) obj3;
                boolean isChannel = ChatObject.isChannel((TLRPC.Chat) obj);
                long j15 = this.d;
                TLRPC.ChatFull loadChatInfoInQueue = ((MessagesStorage) obj2).loadChatInfoInQueue(j15, isChannel, true, true, 0);
                if (loadChatInfoInQueue == null || (chatParticipants = loadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < loadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new mh.pa(x7Var, isChannel, j15, 5));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new jv0(x7Var, j15, loadChatInfoInQueue, 1));
                    return;
                }
            case 12:
                vf.p1 p1Var2 = (vf.p1) obj3;
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
                                    vf.o1 o1Var2 = new vf.o1();
                                    o1Var2.a = queryFinalized2.intValue(i13);
                                    o1Var2.b = queryFinalized2.stringValue(1);
                                    o1Var2.c = queryFinalized2.intValue(2);
                                    o1Var2.f = queryFinalized2.intValue(3);
                                    arrayList6.add(o1Var2);
                                    i13 = 0;
                                } catch (Exception e6) {
                                    e = e6;
                                    p1Var = p1Var2;
                                    arrayList2 = arrayList6;
                                    sQLiteCursor = queryFinalized2;
                                    runnable = runnable2;
                                    try {
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                        }
                                        AndroidUtilities.runOnUIThread(new t61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
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
                                o1Var = (vf.o1) arrayList6.get(i19);
                                arrayList2 = arrayList6;
                                try {
                                    i11 = i19;
                                } catch (Exception e11) {
                                    e = e11;
                                    p1Var = p1Var2;
                                }
                            } catch (Exception e12) {
                                e = e12;
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
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    sQLiteCursor = queryFinalized3;
                                                    FileLog.e(e);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    AndroidUtilities.runOnUIThread(new t61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
                                                    return;
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                p1Var = p1Var2;
                                                sQLiteCursor = queryFinalized3;
                                                FileLog.e(e);
                                                if (sQLiteCursor != null) {
                                                }
                                                AndroidUtilities.runOnUIThread(new t61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
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
                                } catch (Exception e15) {
                                    e = e15;
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
                        } catch (Exception e16) {
                            e = e16;
                            p1Var = p1Var2;
                            runnable = runnable2;
                            sQLiteCursor = sQLiteCursor3;
                            FileLog.e(e);
                            if (sQLiteCursor != null) {
                            }
                            AndroidUtilities.runOnUIThread(new t61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
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
                    } catch (Exception e17) {
                        e = e17;
                        sQLiteCursor = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        AndroidUtilities.runOnUIThread(new t61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
                        return;
                    }
                } catch (Exception e18) {
                    e = e18;
                    p1Var = p1Var2;
                    arrayList2 = arrayList6;
                    runnable = runnable2;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new t61(p1Var, arrayList7, arrayList8, arrayList2, runnable, 4));
                return;
            default:
                vf.p1 p1Var3 = (vf.p1) obj3;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                vf.o1 o1Var3 = (vf.o1) obj;
                try {
                    arrayList3 = new ArrayList<>();
                    arrayList4 = new ArrayList();
                    queryFinalized = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(o1Var3.a));
                } catch (Exception e19) {
                    e = e19;
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
                    AndroidUtilities.runOnUIThread(new t61(p1Var3, arrayList11, arrayList12, o1Var3, messageObject, 5));
                    queryFinalized.dispose();
                    return;
                } catch (Exception e20) {
                    e = e20;
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

    public /* synthetic */ di(org.telegram.ui.ActionBar.h3 h3Var, long j10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = h3Var;
        this.d = j10;
        this.c = obj;
        this.e = obj2;
    }

    public /* synthetic */ di(qh.x7 x7Var, TLRPC.Chat chat, MessagesStorage messagesStorage, long j10) {
        this.a = 11;
        this.b = x7Var;
        this.e = chat;
        this.c = messagesStorage;
        this.d = j10;
    }
}

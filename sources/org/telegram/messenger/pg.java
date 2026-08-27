package org.telegram.messenger;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.g30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a01;
import org.telegram.ui.ff0;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.ia0;
import org.telegram.ui.ja0;
import org.telegram.ui.lq;
import org.telegram.ui.q00;
import org.telegram.ui.rn;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pg(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = j10;
        this.c = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0273  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        SQLiteCursor sQLiteCursor;
        qf.q1 q1Var;
        ArrayList arrayList;
        Runnable runnable;
        qf.p1 p1Var;
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
        long j10 = this.d;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i12) {
            case 0:
                ((MessagesStorage) obj2).lambda$getEncryptedChat$177(j10, (ArrayList) obj3, (CountDownLatch) obj);
                return;
            case 1:
                ((SavedMessagesController) obj).lambda$updateDialogsLastMessage$9((MessagesStorage) obj2, (ArrayList) obj3, j10);
                return;
            case 2:
                ((SavedMessagesController) obj3).lambda$loadCache$7((MessagesStorage) obj2, j10, (Runnable) obj);
                return;
            case 3:
                ((CameraController) obj2).lambda$finishRecordingVideo$15((File) obj3, (Bitmap) obj, j10);
                return;
            case 4:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) obj2;
                rn rnVar = (rn) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                Context context = giVar.getContext();
                int i14 = giVar.F1;
                MessageSuggestionParams messageSuggestionParams = rnVar.c5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new hh.t0(context, i14, this.d, messageSuggestionParams, rnVar, c6Var, 0, new org.telegram.ui.df(giVar, rnVar)).show();
                return;
            case 5:
                d21 d21Var = (d21) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((b70) obj3).u();
                TLRPC.User user = MessagesController.getInstance(d21Var.b).getUser(Long.valueOf(j10));
                if (user != null) {
                    rn rnVar2 = d21Var.h;
                    org.telegram.ui.Components.y4.r(rnVar2, -1, user, chat, true, new d3.e(d21Var, j10, 6), rnVar2.getResourceProvider());
                    return;
                }
                return;
            case 6:
                d21 d21Var2 = (d21) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                d21Var2.a0.removeAll((HashSet) obj);
                d21Var2.p();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj4 = arrayList2.get(i15);
                    i15++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j10 == intValue) {
                        d21Var2.m(intValue, false);
                        return;
                    }
                }
                return;
            case 7:
                gy gyVar = (gy) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter == null || !gyVar.g4(dialog)) {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        i16 = Math.min(i16, dialogFilter.pinnedDialogs.valueAt(i17));
                    }
                    i10 = i16 - gyVar.J2;
                }
                long j11 = this.d;
                TLRPC.EncryptedChat n10 = DialogObject.isEncryptedDialog(j11) ? y1.n(gyVar.getMessagesController(), j11) : null;
                UndoView Y3 = gyVar.Y3();
                if (Y3 == null) {
                    return;
                }
                if (gyVar.g4(dialog)) {
                    gyVar.s4(j11, false, dialogFilter, i10, true);
                    Y3.k(0L, 79, 1, 1600, null, null);
                } else {
                    gyVar.s4(j11, true, dialogFilter, i10, true);
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
                    q00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, gyVar, null);
                }
                gyVar.getMessagesController().reorderPinnedDialogs(gyVar.R2, null, 0L);
                gyVar.T4(true);
                if (gyVar.a0 != null) {
                    int i18 = 0;
                    while (true) {
                        fy[] fyVarArr = gyVar.a0;
                        if (i18 < fyVarArr.length) {
                            fyVarArr[i18].d.D = false;
                            i18++;
                        }
                    }
                }
                gyVar.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 8:
                s50 s50Var = (s50) obj2;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                ChatObject.Call call = s50Var.W0;
                if (call == null || s50Var.o0) {
                    return;
                }
                call.addInvitedUser(j10);
                s50Var.O0(true);
                g30 g30Var = s50Var.A1;
                if (g30Var != null) {
                    g30Var.dismiss();
                }
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                s50Var.k1().k(0L, 34, user2, s50Var.V0, null, null);
                return;
            case 9:
                TLObject tLObject = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                lq lqVar = (lq) obj;
                Pattern pattern = LaunchActivity.x1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    lqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                messagesController.putUsers(tL_stories_peerStories.users, false);
                messagesController.getStoriesController().a0(j10, tL_stories_peerStories.stories);
                lqVar.run();
                return;
            case 10:
                ja0 ja0Var = (ja0) obj2;
                LaunchActivity launchActivity = ja0Var.g;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (((String) obj3) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.K);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j12 = this.d;
                    long j13 = -j12;
                    if (messagesController2.getGroupCall(j13, false) != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(j13));
                        accountInstance.getMessagesController().getInputPeer(j12);
                        org.telegram.ui.Components.voip.e2.m(chat2, null, false, Boolean.valueOf(!r0.call.rtmp_stream), launchActivity, n2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j13);
                    if (chatFull != null) {
                        if (chatFull.call != null) {
                            accountInstance.getMessagesController().getGroupCall(j13, true, new ia0(ja0Var, accountInstance, j12, n2Var, 0));
                            return;
                        } else {
                            if (n2Var.getParentActivity() != null) {
                                y1.q(R.string.InviteExpired, org.telegram.ui.Components.mc.a0(n2Var), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                String str3 = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                long j14 = this.d;
                gh.b1 b1Var = new gh.b1(photoViewer, str3, photoEntry, j14, 5);
                if (photoViewer.z2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.y2.getWidth(), photoViewer.y2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.y2, createBitmap, new ff0(24, b1Var, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.x2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.x2.getHeight());
                if (bitmap == null) {
                    b1Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j14, null, true));
                    return;
                } else {
                    b1Var.run(bitmap);
                    return;
                }
            case 12:
                qf.q1 q1Var2 = (qf.q1) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList3 = new ArrayList();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            try {
                                try {
                                    qf.p1 p1Var2 = new qf.p1();
                                    p1Var2.a = queryFinalized2.intValue(i13);
                                    p1Var2.b = queryFinalized2.stringValue(1);
                                    p1Var2.c = queryFinalized2.intValue(2);
                                    p1Var2.f = queryFinalized2.intValue(3);
                                    arrayList3.add(p1Var2);
                                    i13 = 0;
                                } catch (Exception e9) {
                                    e = e9;
                                    q1Var = q1Var2;
                                    arrayList = arrayList3;
                                    sQLiteCursor = queryFinalized2;
                                    runnable = runnable2;
                                    try {
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                        }
                                        AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized2;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            q1Var = q1Var2;
                            arrayList = arrayList3;
                            runnable = runnable2;
                            sQLiteCursor = queryFinalized2;
                        }
                    }
                    char c10 = 0;
                    queryFinalized2.dispose();
                    ArrayList<Long> arrayList6 = new ArrayList<>();
                    ArrayList arrayList7 = new ArrayList();
                    SQLiteCursor sQLiteCursor3 = queryFinalized2;
                    int i19 = 0;
                    while (i19 < arrayList3.size()) {
                        try {
                            try {
                                p1Var = (qf.p1) arrayList3.get(i19);
                                arrayList = arrayList3;
                                try {
                                    i11 = i19;
                                } catch (Exception e11) {
                                    e = e11;
                                    q1Var = q1Var2;
                                }
                                try {
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = Integer.valueOf(p1Var.a);
                                    queryFinalized = database.queryFinalized(str2, objArr);
                                } catch (Exception e12) {
                                    e = e12;
                                    q1Var = q1Var2;
                                    runnable = runnable2;
                                    sQLiteCursor = sQLiteCursor3;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = sQLiteCursor3;
                            }
                            try {
                                try {
                                    if (queryFinalized.next()) {
                                        sQLiteDatabase = database;
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            str = str2;
                                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            runnable = runnable2;
                                            try {
                                                TLdeserialize.send_state = queryFinalized.intValue(1);
                                                TLdeserialize.readAttachPath(byteBufferValue2, j10);
                                                byteBufferValue2.reuse();
                                                TLdeserialize.id = queryFinalized.intValue(2);
                                                TLdeserialize.date = queryFinalized.intValue(3);
                                                TLdeserialize.flags |= TLObject.FLAG_30;
                                                TLdeserialize.quick_reply_shortcut_id = queryFinalized.intValue(4);
                                                TLdeserialize.ttl = queryFinalized.intValue(5);
                                                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList6, arrayList7, null);
                                                q1Var = q1Var2;
                                                try {
                                                    MessageObject messageObject2 = new MessageObject(q1Var2.a, TLdeserialize, false, true);
                                                    p1Var.e = messageObject2;
                                                    p1Var.d = TLdeserialize.id;
                                                    messageObject2.generateThumbs(false);
                                                    p1Var.e.applyQuickReply(p1Var.b, p1Var.a);
                                                    queryFinalized.dispose();
                                                    i19 = i11 + 1;
                                                    sQLiteCursor3 = queryFinalized;
                                                    arrayList3 = arrayList;
                                                    database = sQLiteDatabase;
                                                    str2 = str;
                                                    runnable2 = runnable;
                                                    q1Var2 = q1Var;
                                                    c10 = 0;
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    sQLiteCursor = queryFinalized;
                                                    FileLog.e(e);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                                                    return;
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                q1Var = q1Var2;
                                                sQLiteCursor = queryFinalized;
                                                FileLog.e(e);
                                                if (sQLiteCursor != null) {
                                                }
                                                AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                                                return;
                                            }
                                        }
                                    } else {
                                        sQLiteDatabase = database;
                                    }
                                    q1Var = q1Var2;
                                    str = str2;
                                    runnable = runnable2;
                                    queryFinalized.dispose();
                                    i19 = i11 + 1;
                                    sQLiteCursor3 = queryFinalized;
                                    arrayList3 = arrayList;
                                    database = sQLiteDatabase;
                                    str2 = str;
                                    runnable2 = runnable;
                                    q1Var2 = q1Var;
                                    c10 = 0;
                                } catch (Exception e15) {
                                    e = e15;
                                    q1Var = q1Var2;
                                    runnable = runnable2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            q1Var = q1Var2;
                            arrayList = arrayList3;
                        }
                    }
                    q1Var = q1Var2;
                    arrayList = arrayList3;
                    runnable = runnable2;
                    try {
                        if (!arrayList7.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList7), arrayList5);
                        }
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList6, arrayList4);
                        }
                        sQLiteCursor3.dispose();
                    } catch (Exception e17) {
                        e = e17;
                        sQLiteCursor = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                        }
                        AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                        return;
                    }
                } catch (Exception e18) {
                    e = e18;
                    q1Var = q1Var2;
                    arrayList = arrayList3;
                    runnable = runnable2;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                return;
            default:
                qf.q1 q1Var3 = (qf.q1) obj3;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                qf.p1 p1Var3 = (qf.p1) obj;
                try {
                    ArrayList<Long> arrayList8 = new ArrayList<>();
                    ArrayList arrayList9 = new ArrayList();
                    SQLiteCursor queryFinalized3 = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(p1Var3.a));
                    try {
                        if (!queryFinalized3.next() || (byteBufferValue = queryFinalized3.byteBufferValue(0)) == null) {
                            messageObject = null;
                        } else {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize2.send_state = queryFinalized3.intValue(1);
                            TLdeserialize2.readAttachPath(byteBufferValue, j10);
                            byteBufferValue.reuse();
                            TLdeserialize2.id = queryFinalized3.intValue(2);
                            TLdeserialize2.date = queryFinalized3.intValue(3);
                            TLdeserialize2.flags |= TLObject.FLAG_30;
                            TLdeserialize2.quick_reply_shortcut_id = queryFinalized3.intValue(4);
                            TLdeserialize2.ttl = queryFinalized3.intValue(5);
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList8, arrayList9, null);
                            messageObject = new MessageObject(q1Var3.a, TLdeserialize2, false, true);
                        }
                        queryFinalized3.dispose();
                        ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                        ArrayList<TLRPC.Chat> arrayList11 = new ArrayList<>();
                        if (!arrayList9.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList9), arrayList11);
                        }
                        if (!arrayList8.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList8, arrayList10);
                        }
                        AndroidUtilities.runOnUIThread(new a01(q1Var3, arrayList10, arrayList11, p1Var3, messageObject));
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
                        } catch (Throwable th6) {
                            th = th6;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteCursor2 = queryFinalized3;
                        if (sQLiteCursor2 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e20) {
                    e = e20;
                    sQLiteCursor2 = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteCursor2 = null;
                }
                break;
        }
    }

    public /* synthetic */ pg(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = j10;
        this.e = obj3;
    }

    public /* synthetic */ pg(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = j10;
    }

    public /* synthetic */ pg(Object obj, MessagesStorage messagesStorage, long j10, Runnable runnable, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = messagesStorage;
        this.d = j10;
        this.e = runnable;
    }

    public /* synthetic */ pg(SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, ArrayList arrayList, long j10) {
        this.a = 1;
        this.e = savedMessagesController;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = j10;
    }

    public /* synthetic */ pg(d21 d21Var, HashSet hashSet, ArrayList arrayList, long j10) {
        this.a = 6;
        this.b = d21Var;
        this.e = hashSet;
        this.c = arrayList;
        this.d = j10;
    }

    public /* synthetic */ pg(qf.q1 q1Var, MessagesStorage messagesStorage, qf.p1 p1Var, long j10) {
        this.a = 13;
        this.c = q1Var;
        this.b = messagesStorage;
        this.e = p1Var;
        this.d = j10;
    }
}

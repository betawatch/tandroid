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
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cf0;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.ea0;
import org.telegram.ui.fa0;
import org.telegram.ui.jq;
import org.telegram.ui.n00;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import org.telegram.ui.rx0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lg(Object obj, long j10, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.d = j10;
        this.c = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0276  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        SQLiteCursor sQLiteCursor;
        pf.r1 r1Var;
        ArrayList arrayList;
        Runnable runnable;
        pf.q1 q1Var;
        int i10;
        SQLiteDatabase sQLiteDatabase;
        String str;
        SQLiteCursor sQLiteCursor2;
        ArrayList<Long> arrayList2;
        ArrayList arrayList3;
        SQLiteCursor queryFinalized;
        MessageObject messageObject;
        NativeByteBuffer byteBufferValue;
        int i11 = this.a;
        String str2 = "SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC";
        int i12 = 0;
        long j10 = this.d;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i11) {
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
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) obj2;
                qn qnVar = (qn) obj3;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj;
                Context context = kiVar.getContext();
                int i13 = kiVar.F1;
                MessageSuggestionParams messageSuggestionParams = qnVar.c5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new gh.t0(context, i13, this.d, messageSuggestionParams, qnVar, b6Var, 0, new org.telegram.ui.df(kiVar, qnVar)).show();
                return;
            case 5:
                b21 b21Var = (b21) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((x60) obj3).u();
                TLRPC.User user = MessagesController.getInstance(b21Var.b).getUser(Long.valueOf(j10));
                if (user != null) {
                    qn qnVar2 = b21Var.h;
                    org.telegram.ui.Components.y4.r(qnVar2, -1, user, chat, true, new d3.e(b21Var, j10, 6), qnVar2.getResourceProvider());
                    return;
                }
                return;
            case 6:
                b21 b21Var2 = (b21) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                b21Var2.a0.removeAll((HashSet) obj);
                b21Var2.o();
                int size = arrayList4.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj4 = arrayList4.get(i14);
                    i14++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j10 == intValue) {
                        b21Var2.m(intValue, false);
                        return;
                    }
                }
                return;
            case 7:
                dy dyVar = (dy) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter == null || !dyVar.g4(dialog)) {
                    i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        i15 = Math.min(i15, dialogFilter.pinnedDialogs.valueAt(i16));
                    }
                    i9 = i15 - dyVar.J2;
                }
                long j11 = this.d;
                TLRPC.EncryptedChat l10 = DialogObject.isEncryptedDialog(j11) ? l0.l(dyVar.getMessagesController(), j11) : null;
                UndoView Y3 = dyVar.Y3();
                if (Y3 == null) {
                    return;
                }
                if (dyVar.g4(dialog)) {
                    dyVar.s4(j11, false, dialogFilter, i9, true);
                    Y3.k(0L, 79, 1, 1600, null, null);
                } else {
                    dyVar.s4(j11, true, dialogFilter, i9, true);
                    Y3.k(0L, 78, 1, 1600, null, null);
                    if (dialogFilter != null) {
                        if (l10 != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(l10.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(l10.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j11))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j11));
                        }
                    }
                }
                if (dialogFilter != null) {
                    n00.s0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, dyVar, null);
                }
                dyVar.getMessagesController().reorderPinnedDialogs(dyVar.R2, null, 0L);
                dyVar.T4(true);
                if (dyVar.a0 != null) {
                    int i17 = 0;
                    while (true) {
                        cy[] cyVarArr = dyVar.a0;
                        if (i17 < cyVarArr.length) {
                            cyVarArr[i17].d.D = false;
                            i17++;
                        }
                    }
                }
                dyVar.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 8:
                o50 o50Var = (o50) obj2;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                ChatObject.Call call = o50Var.W0;
                if (call == null || o50Var.o0) {
                    return;
                }
                call.addInvitedUser(j10);
                o50Var.O0(true);
                b30 b30Var = o50Var.A1;
                if (b30Var != null) {
                    b30Var.dismiss();
                }
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                o50Var.k1().k(0L, 34, user2, o50Var.V0, null, null);
                return;
            case 9:
                TLObject tLObject = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                jq jqVar = (jq) obj;
                Pattern pattern = LaunchActivity.x1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    jqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                messagesController.putUsers(tL_stories_peerStories.users, false);
                messagesController.getStoriesController().a0(j10, tL_stories_peerStories.stories);
                jqVar.run();
                return;
            case 10:
                fa0 fa0Var = (fa0) obj2;
                LaunchActivity launchActivity = fa0Var.g;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (((String) obj3) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.K);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j12 = this.d;
                    long j13 = -j12;
                    if (messagesController2.getGroupCall(j13, false) != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(j13));
                        accountInstance.getMessagesController().getInputPeer(j12);
                        org.telegram.ui.Components.voip.e2.m(chat2, null, false, Boolean.valueOf(!r0.call.rtmp_stream), launchActivity, o2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j13);
                    if (chatFull != null) {
                        if (chatFull.call != null) {
                            accountInstance.getMessagesController().getGroupCall(j13, true, new ea0(fa0Var, accountInstance, j12, o2Var, 0));
                            return;
                        } else {
                            if (o2Var.getParentActivity() != null) {
                                l0.p(R.string.InviteExpired, org.telegram.ui.Components.oc.a0(o2Var), R.raw.linkbroken, 36);
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
                fh.d1 d1Var = new fh.d1(photoViewer, str3, photoEntry, j14, 5);
                if (photoViewer.z2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.y2.getWidth(), photoViewer.y2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.y2, createBitmap, new cf0(24, d1Var, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.x2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.x2.getHeight());
                if (bitmap == null) {
                    d1Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j14, null, true));
                    return;
                } else {
                    d1Var.run(bitmap);
                    return;
                }
            case 12:
                pf.r1 r1Var2 = (pf.r1) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList5 = new ArrayList();
                ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            try {
                                try {
                                    pf.q1 q1Var2 = new pf.q1();
                                    q1Var2.a = queryFinalized2.intValue(i12);
                                    q1Var2.b = queryFinalized2.stringValue(1);
                                    q1Var2.c = queryFinalized2.intValue(2);
                                    q1Var2.f = queryFinalized2.intValue(3);
                                    arrayList5.add(q1Var2);
                                    i12 = 0;
                                } catch (Exception e10) {
                                    e = e10;
                                    r1Var = r1Var2;
                                    arrayList = arrayList5;
                                    sQLiteCursor = queryFinalized2;
                                    runnable = runnable2;
                                    try {
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                        }
                                        AndroidUtilities.runOnUIThread(new rx0(r1Var, arrayList6, arrayList7, arrayList, runnable, 4));
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
                        } catch (Exception e11) {
                            e = e11;
                            r1Var = r1Var2;
                            arrayList = arrayList5;
                            runnable = runnable2;
                            sQLiteCursor = queryFinalized2;
                        }
                    }
                    char c10 = 0;
                    queryFinalized2.dispose();
                    ArrayList<Long> arrayList8 = new ArrayList<>();
                    ArrayList arrayList9 = new ArrayList();
                    SQLiteCursor sQLiteCursor3 = queryFinalized2;
                    int i18 = 0;
                    while (i18 < arrayList5.size()) {
                        try {
                            try {
                                q1Var = (pf.q1) arrayList5.get(i18);
                                arrayList = arrayList5;
                                try {
                                    i10 = i18;
                                } catch (Exception e12) {
                                    e = e12;
                                    r1Var = r1Var2;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                r1Var = r1Var2;
                                arrayList = arrayList5;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = sQLiteCursor3;
                        }
                        try {
                            Object[] objArr = new Object[1];
                            objArr[c10] = Integer.valueOf(q1Var.a);
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
                                                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList8, arrayList9, null);
                                                r1Var = r1Var2;
                                                try {
                                                    MessageObject messageObject2 = new MessageObject(r1Var2.a, TLdeserialize, false, true);
                                                    q1Var.e = messageObject2;
                                                    q1Var.d = TLdeserialize.id;
                                                    messageObject2.generateThumbs(false);
                                                    q1Var.e.applyQuickReply(q1Var.b, q1Var.a);
                                                    queryFinalized3.dispose();
                                                    i18 = i10 + 1;
                                                    sQLiteCursor3 = queryFinalized3;
                                                    arrayList5 = arrayList;
                                                    database = sQLiteDatabase;
                                                    str2 = str;
                                                    runnable2 = runnable;
                                                    r1Var2 = r1Var;
                                                    c10 = 0;
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    sQLiteCursor = queryFinalized3;
                                                    FileLog.e(e);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    AndroidUtilities.runOnUIThread(new rx0(r1Var, arrayList6, arrayList7, arrayList, runnable, 4));
                                                    return;
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                r1Var = r1Var2;
                                                sQLiteCursor = queryFinalized3;
                                                FileLog.e(e);
                                                if (sQLiteCursor != null) {
                                                }
                                                AndroidUtilities.runOnUIThread(new rx0(r1Var, arrayList6, arrayList7, arrayList, runnable, 4));
                                                return;
                                            }
                                        }
                                    } else {
                                        sQLiteDatabase = database;
                                    }
                                    r1Var = r1Var2;
                                    str = str2;
                                    runnable = runnable2;
                                    queryFinalized3.dispose();
                                    i18 = i10 + 1;
                                    sQLiteCursor3 = queryFinalized3;
                                    arrayList5 = arrayList;
                                    database = sQLiteDatabase;
                                    str2 = str;
                                    runnable2 = runnable;
                                    r1Var2 = r1Var;
                                    c10 = 0;
                                } catch (Exception e16) {
                                    e = e16;
                                    r1Var = r1Var2;
                                    runnable = runnable2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = queryFinalized3;
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            r1Var = r1Var2;
                            runnable = runnable2;
                            sQLiteCursor = sQLiteCursor3;
                            FileLog.e(e);
                            if (sQLiteCursor != null) {
                            }
                            AndroidUtilities.runOnUIThread(new rx0(r1Var, arrayList6, arrayList7, arrayList, runnable, 4));
                            return;
                        }
                    }
                    r1Var = r1Var2;
                    arrayList = arrayList5;
                    runnable = runnable2;
                    try {
                        if (!arrayList9.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList9), arrayList7);
                        }
                        if (!arrayList8.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList8, arrayList6);
                        }
                        sQLiteCursor3.dispose();
                    } catch (Exception e18) {
                        e = e18;
                        sQLiteCursor = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        AndroidUtilities.runOnUIThread(new rx0(r1Var, arrayList6, arrayList7, arrayList, runnable, 4));
                        return;
                    }
                } catch (Exception e19) {
                    e = e19;
                    r1Var = r1Var2;
                    arrayList = arrayList5;
                    runnable = runnable2;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new rx0(r1Var, arrayList6, arrayList7, arrayList, runnable, 4));
                return;
            default:
                pf.r1 r1Var3 = (pf.r1) obj3;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                pf.q1 q1Var3 = (pf.q1) obj;
                try {
                    arrayList2 = new ArrayList<>();
                    arrayList3 = new ArrayList();
                    queryFinalized = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(q1Var3.a));
                } catch (Exception e20) {
                    e = e20;
                    sQLiteCursor2 = null;
                } catch (Throwable th6) {
                    th = th6;
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
                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList2, arrayList3, null);
                        messageObject = new MessageObject(r1Var3.a, TLdeserialize2, false, true);
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                    ArrayList<TLRPC.Chat> arrayList11 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList3), arrayList11);
                    }
                    if (!arrayList2.isEmpty()) {
                        messagesStorage2.getUsersInternal(arrayList2, arrayList10);
                    }
                    AndroidUtilities.runOnUIThread(new rx0(r1Var3, arrayList10, arrayList11, q1Var3, messageObject, 5));
                    queryFinalized.dispose();
                    return;
                } catch (Exception e21) {
                    e = e21;
                    sQLiteCursor2 = queryFinalized;
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
                    sQLiteCursor2 = queryFinalized;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ lg(Object obj, Object obj2, long j10, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = j10;
        this.e = obj3;
    }

    public /* synthetic */ lg(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = j10;
    }

    public /* synthetic */ lg(Object obj, MessagesStorage messagesStorage, long j10, Runnable runnable, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = messagesStorage;
        this.d = j10;
        this.e = runnable;
    }

    public /* synthetic */ lg(SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, ArrayList arrayList, long j10) {
        this.a = 1;
        this.e = savedMessagesController;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = j10;
    }

    public /* synthetic */ lg(b21 b21Var, HashSet hashSet, ArrayList arrayList, long j10) {
        this.a = 6;
        this.b = b21Var;
        this.e = hashSet;
        this.c = arrayList;
        this.d = j10;
    }

    public /* synthetic */ lg(pf.r1 r1Var, MessagesStorage messagesStorage, pf.q1 q1Var, long j10) {
        this.a = 13;
        this.c = r1Var;
        this.b = messagesStorage;
        this.e = q1Var;
        this.d = j10;
    }
}

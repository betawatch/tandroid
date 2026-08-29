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
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.p30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a01;
import org.telegram.ui.ey;
import org.telegram.ui.fy;
import org.telegram.ui.ha0;
import org.telegram.ui.ia0;
import org.telegram.ui.lf0;
import org.telegram.ui.lq;
import org.telegram.ui.p00;
import org.telegram.ui.r50;
import org.telegram.ui.tm;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sg(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = j10;
        this.c = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        MessagesController.DialogFilter dialogFilter;
        fy fyVar;
        SQLiteCursor sQLiteCursor;
        sf.s1 s1Var;
        ArrayList arrayList;
        Runnable runnable;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        sf.r1 r1Var;
        SQLiteDatabase sQLiteDatabase;
        String str;
        int i11;
        SQLiteCursor sQLiteCursor4;
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
                org.telegram.ui.Components.ni niVar = (org.telegram.ui.Components.ni) obj2;
                tn tnVar = (tn) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                Context context = niVar.getContext();
                int i14 = niVar.F1;
                MessageSuggestionParams messageSuggestionParams = tnVar.c5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new jh.s0(context, i14, this.d, messageSuggestionParams, tnVar, c6Var, 0, new tm(6, niVar, tnVar)).show();
                return;
            case 5:
                m21 m21Var = (m21) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((j70) obj3).u();
                TLRPC.User user = MessagesController.getInstance(m21Var.b).getUser(Long.valueOf(j10));
                if (user != null) {
                    tn tnVar2 = m21Var.h;
                    org.telegram.ui.Components.c5.r(tnVar2, -1, user, chat, true, new f3.e(m21Var, j10, 6), tnVar2.getResourceProvider());
                    return;
                }
                return;
            case 6:
                m21 m21Var2 = (m21) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                m21Var2.a0.removeAll((HashSet) obj);
                m21Var2.o();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj4 = arrayList2.get(i15);
                    i15++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j10 == intValue) {
                        m21Var2.m(intValue, false);
                        return;
                    }
                }
                return;
            case 7:
                fy fyVar2 = (fy) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj3;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter2 == null || !fyVar2.g4(dialog)) {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter2.pinnedDialogs.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        i16 = Math.min(i16, dialogFilter2.pinnedDialogs.valueAt(i17));
                    }
                    i10 = i16 - fyVar2.J2;
                }
                long j11 = this.d;
                TLRPC.EncryptedChat p10 = DialogObject.isEncryptedDialog(j11) ? x3.p(fyVar2.getMessagesController(), j11) : null;
                UndoView Y3 = fyVar2.Y3();
                if (Y3 == null) {
                    return;
                }
                if (fyVar2.g4(dialog)) {
                    dialogFilter = dialogFilter2;
                    fyVar = fyVar2;
                    fyVar.s4(j11, false, dialogFilter, i10, true);
                    Y3.k(0L, 79, 1, 1600, null, null);
                } else {
                    dialogFilter = dialogFilter2;
                    fyVar = fyVar2;
                    fyVar.s4(j11, true, dialogFilter, i10, true);
                    Y3.k(0L, 78, 1, 1600, null, null);
                    if (dialogFilter != null) {
                        if (p10 != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(p10.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(p10.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j11))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j11));
                        }
                    }
                }
                if (dialogFilter != null) {
                    fy fyVar3 = fyVar;
                    p00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, fyVar3, null);
                    fyVar = fyVar3;
                }
                fyVar.getMessagesController().reorderPinnedDialogs(fyVar.R2, null, 0L);
                fyVar.T4(true);
                if (fyVar.a0 != null) {
                    int i18 = 0;
                    while (true) {
                        ey[] eyVarArr = fyVar.a0;
                        if (i18 < eyVarArr.length) {
                            eyVarArr[i18].d.D = false;
                            i18++;
                        }
                    }
                }
                fyVar.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 8:
                r50 r50Var = (r50) obj2;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                ChatObject.Call call = r50Var.W0;
                if (call == null || r50Var.o0) {
                    return;
                }
                call.addInvitedUser(j10);
                r50Var.O0(true);
                p30 p30Var = r50Var.A1;
                if (p30Var != null) {
                    p30Var.dismiss();
                }
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                r50Var.k1().k(0L, 34, user2, r50Var.V0, null, null);
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
                ia0 ia0Var = (ia0) obj2;
                LaunchActivity launchActivity = ia0Var.g;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (((String) obj3) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.K);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j12 = this.d;
                    long j13 = -j12;
                    if (messagesController2.getGroupCall(j13, false) != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(j13));
                        accountInstance.getMessagesController().getInputPeer(j12);
                        org.telegram.ui.Components.voip.h2.m(chat2, null, false, Boolean.valueOf(!r0.call.rtmp_stream), launchActivity, o2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j13);
                    if (chatFull != null) {
                        if (chatFull.call != null) {
                            accountInstance.getMessagesController().getGroupCall(j13, true, new ha0(ia0Var, accountInstance, j12, o2Var, 0));
                            return;
                        } else {
                            if (o2Var.getParentActivity() != null) {
                                j7.l1.v(R.string.InviteExpired, org.telegram.ui.Components.tc.a0(o2Var), R.raw.linkbroken, 36);
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
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                long j14 = this.d;
                ih.z0 z0Var = new ih.z0(photoViewer, (String) obj3, photoEntry, j14, 5);
                if (photoViewer.z2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.y2.getWidth(), photoViewer.y2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.y2, createBitmap, new lf0(21, z0Var, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.x2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.x2.getHeight());
                if (bitmap == null) {
                    z0Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j14, null, true));
                    return;
                } else {
                    z0Var.run(bitmap);
                    return;
                }
            case 12:
                sf.s1 s1Var2 = (sf.s1) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList3 = new ArrayList();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    sQLiteCursor2 = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                sf.r1 r1Var2 = new sf.r1();
                                r1Var2.a = sQLiteCursor2.intValue(i13);
                                r1Var2.b = sQLiteCursor2.stringValue(1);
                                r1Var2.c = sQLiteCursor2.intValue(2);
                                r1Var2.f = sQLiteCursor2.intValue(3);
                                arrayList3.add(r1Var2);
                                i13 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = sQLiteCursor2;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            s1Var = s1Var2;
                            arrayList = arrayList3;
                            runnable = runnable2;
                        }
                    }
                    char c3 = 0;
                    sQLiteCursor2.dispose();
                    ArrayList<Long> arrayList6 = new ArrayList<>();
                    ArrayList arrayList7 = new ArrayList();
                    runnable = runnable2;
                    int i19 = 0;
                    while (i19 < arrayList3.size()) {
                        try {
                            try {
                                r1Var = (sf.r1) arrayList3.get(i19);
                                arrayList = arrayList3;
                                try {
                                    sQLiteCursor3 = sQLiteCursor2;
                                } catch (Exception e11) {
                                    e = e11;
                                    s1Var = s1Var2;
                                    FileLog.e(e);
                                    if (sQLiteCursor2 != null) {
                                    }
                                    AndroidUtilities.runOnUIThread(new a01(s1Var, arrayList4, arrayList5, arrayList, runnable));
                                    return;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                s1Var = s1Var2;
                                arrayList = arrayList3;
                            }
                            try {
                                try {
                                    Object[] objArr = new Object[1];
                                    objArr[c3] = Integer.valueOf(r1Var.a);
                                    sQLiteCursor2 = database.queryFinalized(str2, objArr);
                                    try {
                                        if (sQLiteCursor2.next()) {
                                            sQLiteDatabase = database;
                                            NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(0);
                                            if (byteBufferValue2 != null) {
                                                str = str2;
                                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                i11 = i19;
                                                TLdeserialize.send_state = sQLiteCursor2.intValue(1);
                                                TLdeserialize.readAttachPath(byteBufferValue2, j10);
                                                byteBufferValue2.reuse();
                                                TLdeserialize.id = sQLiteCursor2.intValue(2);
                                                TLdeserialize.date = sQLiteCursor2.intValue(3);
                                                TLdeserialize.flags |= TLObject.FLAG_30;
                                                TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                                                TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                                                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList6, arrayList7, null);
                                                s1Var = s1Var2;
                                                try {
                                                    MessageObject messageObject2 = new MessageObject(s1Var2.a, TLdeserialize, false, true);
                                                    r1Var.e = messageObject2;
                                                    r1Var.d = TLdeserialize.id;
                                                    messageObject2.generateThumbs(false);
                                                    r1Var.e.applyQuickReply(r1Var.b, r1Var.a);
                                                    sQLiteCursor2.dispose();
                                                    i19 = i11 + 1;
                                                    arrayList3 = arrayList;
                                                    database = sQLiteDatabase;
                                                    str2 = str;
                                                    s1Var2 = s1Var;
                                                    c3 = 0;
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    FileLog.e(e);
                                                    if (sQLiteCursor2 != null) {
                                                    }
                                                    AndroidUtilities.runOnUIThread(new a01(s1Var, arrayList4, arrayList5, arrayList, runnable));
                                                    return;
                                                }
                                            }
                                        } else {
                                            sQLiteDatabase = database;
                                        }
                                        s1Var = s1Var2;
                                        str = str2;
                                        i11 = i19;
                                        sQLiteCursor2.dispose();
                                        i19 = i11 + 1;
                                        arrayList3 = arrayList;
                                        database = sQLiteDatabase;
                                        str2 = str;
                                        s1Var2 = s1Var;
                                        c3 = 0;
                                    } catch (Exception e14) {
                                        e = e14;
                                        s1Var = s1Var2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteCursor = sQLiteCursor3;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                s1Var = s1Var2;
                                sQLiteCursor2 = sQLiteCursor3;
                                FileLog.e(e);
                                if (sQLiteCursor2 != null) {
                                }
                                AndroidUtilities.runOnUIThread(new a01(s1Var, arrayList4, arrayList5, arrayList, runnable));
                                return;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor3 = sQLiteCursor2;
                        }
                    }
                    s1Var = s1Var2;
                    arrayList = arrayList3;
                    sQLiteCursor3 = sQLiteCursor2;
                    try {
                        if (!arrayList7.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList7), arrayList5);
                        }
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList6, arrayList4);
                        }
                        sQLiteCursor3.dispose();
                    } catch (Exception e16) {
                        e = e16;
                        sQLiteCursor2 = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        AndroidUtilities.runOnUIThread(new a01(s1Var, arrayList4, arrayList5, arrayList, runnable));
                        return;
                    }
                } catch (Exception e17) {
                    e = e17;
                    s1Var = s1Var2;
                    arrayList = arrayList3;
                    runnable = runnable2;
                    sQLiteCursor2 = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new a01(s1Var, arrayList4, arrayList5, arrayList, runnable));
                return;
            default:
                sf.s1 s1Var3 = (sf.s1) obj3;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                sf.r1 r1Var3 = (sf.r1) obj;
                try {
                    ArrayList<Long> arrayList8 = new ArrayList<>();
                    ArrayList arrayList9 = new ArrayList();
                    SQLiteCursor queryFinalized = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(r1Var3.a));
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
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList8, arrayList9, null);
                            messageObject = new MessageObject(s1Var3.a, TLdeserialize2, false, true);
                        }
                        queryFinalized.dispose();
                        ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                        ArrayList<TLRPC.Chat> arrayList11 = new ArrayList<>();
                        if (!arrayList9.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList9), arrayList11);
                        }
                        if (!arrayList8.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList8, arrayList10);
                        }
                        AndroidUtilities.runOnUIThread(new a01(s1Var3, arrayList10, arrayList11, r1Var3, messageObject));
                        queryFinalized.dispose();
                        return;
                    } catch (Exception e18) {
                        e = e18;
                        sQLiteCursor4 = queryFinalized;
                        try {
                            FileLog.e(e);
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteCursor4 = queryFinalized;
                        if (sQLiteCursor4 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e19) {
                    e = e19;
                    sQLiteCursor4 = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteCursor4 = null;
                }
                break;
        }
    }

    public /* synthetic */ sg(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = j10;
        this.e = obj3;
    }

    public /* synthetic */ sg(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = j10;
    }

    public /* synthetic */ sg(Object obj, MessagesStorage messagesStorage, long j10, Runnable runnable, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = messagesStorage;
        this.d = j10;
        this.e = runnable;
    }

    public /* synthetic */ sg(SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, ArrayList arrayList, long j10) {
        this.a = 1;
        this.e = savedMessagesController;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = j10;
    }

    public /* synthetic */ sg(m21 m21Var, HashSet hashSet, ArrayList arrayList, long j10) {
        this.a = 6;
        this.b = m21Var;
        this.e = hashSet;
        this.c = arrayList;
        this.d = j10;
    }

    public /* synthetic */ sg(sf.s1 s1Var, MessagesStorage messagesStorage, sf.r1 r1Var, long j10) {
        this.a = 13;
        this.c = s1Var;
        this.b = messagesStorage;
        this.e = r1Var;
        this.d = j10;
    }
}

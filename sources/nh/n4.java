package nh;

import android.content.Context;
import android.database.SQLException;
import android.os.Looper;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Objects;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.AudioRecordJNI;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.rc;
import org.telegram.ui.p31;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02ab A[Catch: all -> 0x0237, TryCatch #2 {all -> 0x0237, blocks: (B:132:0x01ed, B:135:0x01fd, B:137:0x021d, B:139:0x0228, B:141:0x023c, B:143:0x0242, B:146:0x0293, B:148:0x02ab, B:149:0x02b0, B:154:0x0266, B:156:0x026a), top: B:131:0x01ed }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z4;
        i3 i3Var;
        c4 c4Var;
        int i11;
        int i12 = this.a;
        String str = null;
        int i13 = 0;
        r7 = false;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                o4 o4Var = (o4) obj2;
                o4Var.h = null;
                d5 d5Var = o4Var.n;
                d5Var.N = false;
                d5Var.L.c = ((String) obj).toLowerCase();
                d5.b(d5Var);
                break;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 2:
                f6 f6Var = (f6) obj2;
                TLObject tLObject = (TLObject) obj;
                i6 i6Var = f6Var.q;
                int i14 = f6Var.c;
                ArrayList arrayList = f6Var.i;
                f6Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i14).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i14).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList2 = tL_foundStories.stories;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList2.get(i15);
                        i15++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList.size();
                        MessageObject messageObject = new MessageObject(i14, tL_foundStory2.storyItem);
                        messageObject.generateThumbs(false);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Integer.valueOf(arrayList.size()));
                        f6Var.F.add(arrayList3);
                        arrayList.add(messageObject);
                    }
                    f6Var.J = Math.max(arrayList.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        f6Var.J = arrayList.size();
                    }
                    if (arrayList.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    f6Var.H = str;
                    f6Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(i6Var);
                    AndroidUtilities.runOnUIThread(i6Var);
                    break;
                }
                break;
            case 3:
                h6 h6Var = (h6) obj2;
                ArrayList arrayList4 = h6Var.h;
                arrayList4.clear();
                arrayList4.addAll((List) obj);
                h6Var.d = true;
                h6Var.e = false;
                h6Var.d();
                NotificationCenter.getInstance(h6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(h6Var.b), h6Var);
                break;
            case 4:
                h6 h6Var2 = (h6) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList5 = h6Var2.g;
                ArrayList arrayList6 = h6Var2.h;
                if (!(tLObject2 instanceof TL_stories.TL_albums)) {
                    if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList6.clear();
                        arrayList6.addAll(arrayList5);
                        h6Var2.f = true;
                        h6Var2.e = false;
                        NotificationCenter.getInstance(h6Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(h6Var2.b), h6Var2);
                        break;
                    }
                } else {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList7 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList8 = tL_albums.albums;
                    int size2 = arrayList8.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i16);
                        i16++;
                        arrayList7.add(m6.a(tL_storyAlbum));
                    }
                    arrayList6.clear();
                    arrayList6.addAll(arrayList7);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList7);
                    h6Var2.f = true;
                    h6Var2.e = false;
                    h6Var2.f(true);
                    break;
                }
                break;
            case 5:
                l6 l6Var = (l6) obj2;
                l6Var.getClass();
                ((Utilities.Callback) obj).run(l6Var);
                break;
            case 6:
                MessagesController.getInstance(((s6) obj2).J.a).getStoriesController().Z((TL_stories.TL_updateStory) obj);
                break;
            case 7:
                s6 s6Var = (s6) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                ph.u6 u6Var = s6Var.c;
                u6Var.w = true;
                t6 t6Var = s6Var.J;
                if (t6Var.n(tL_error2)) {
                    u6Var.x = null;
                } else {
                    u6Var.x = tL_error2;
                }
                s6Var.d = true;
                s6Var.F = true;
                s6Var.E = true;
                t6Var.w.d(u6Var);
                break;
            case 8:
                s6 s6Var2 = (s6) obj2;
                s6Var2.c.c((File) obj);
                AndroidUtilities.runOnUIThread(new q6(s6Var2, r7));
                break;
            case 9:
                ((w5) obj2).accept((TL_stories.TL_stories_allStories) obj);
                break;
            case 10:
                g7 g7Var = (g7) obj2;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj;
                MessagesStorage messagesStorage = g7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i17 = storyItem.id;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i17, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                f8.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                                byteBufferValue.reuse();
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        queryFinalized.dispose();
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i17).stepThis().dispose();
                        if (z4) {
                            i10 = -1;
                            SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                            r7 = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            break;
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    } else {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            g7Var.l(peerDialogId, storyItem);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i17, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i10 = 1;
                                SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            }
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    }
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 11:
                w5 w5Var = (w5) obj;
                MessagesStorage messagesStorage2 = ((g7) obj2).b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e) {
                    messagesStorage2.checkSQLException(e);
                }
                AndroidUtilities.runOnUIThread(new n4(14, w5Var, longSparseIntArray));
                break;
            case 12:
                g7.a((g7) obj2, (w5) obj);
                break;
            case 13:
                ((g7) obj2).j((ArrayList) obj);
                break;
            case 14:
                ((w5) obj2).b.f = (LongSparseIntArray) obj;
                break;
            case 15:
                Runnable runnable = (Runnable) obj;
                if (!((j7) obj2).d) {
                    runnable.run();
                    break;
                }
                break;
            case 16:
                j7 j7Var = (j7) obj;
                ((Runnable[]) obj2)[0] = null;
                j7Var.c.run();
                h7 h7Var = j7Var.e;
                if (h7Var != null) {
                    h7Var.onDetachedFromWindow();
                    break;
                }
                break;
            case 17:
                i7 i7Var = (i7) obj2;
                View view = (View) obj;
                i7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                rc rcVar = i7Var.H;
                if (rcVar != null) {
                    rcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                i7Var.N = false;
                i7Var.e();
                break;
            case 18:
                y7 y7Var = (y7) obj2;
                f90 f90Var = (f90) obj;
                f90 f90Var2 = y7Var.a;
                if (f90Var == f90Var2 && f90Var2 != null) {
                    CharacterStyle characterStyle = f90Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        z7 z7Var = y7Var.v;
                        b90 b90Var = y7Var.c;
                        Objects.requireNonNull(b90Var);
                        z7Var.G.H((URLSpan) characterStyle, z7Var, new n5(b90Var, r3));
                        y7Var.a = null;
                        break;
                    }
                }
                break;
            case 19:
                m8 m8Var = (m8) obj2;
                ph.f3 f3Var = (ph.f3) obj;
                m8Var.d.removeView(f3Var);
                if (f3Var == m8Var.c) {
                    m8Var.b = null;
                    m8Var.invalidate();
                    m8Var.b(false);
                    break;
                }
                break;
            case 20:
                h9 h9Var = (h9) obj;
                i9 i9Var = ((z8) obj2).d;
                d4 currentPeerView = i9Var.k0.getCurrentPeerView();
                if (currentPeerView != null && (i3Var = currentPeerView.Z0) != null && (c4Var = i9Var.D0) != null && c4Var.b == h9Var) {
                    i3Var.invalidate();
                    break;
                }
                break;
            case 21:
                o3.d dVar = (o3.d) obj2;
                j3.n0 n0Var = (j3.n0) obj;
                o3.e eVar = dVar.d;
                if (eVar.B != 0 && !dVar.c) {
                    Looper looper = eVar.F;
                    looper.getClass();
                    dVar.b = eVar.d(looper, dVar.a, n0Var, false);
                    eVar.x.add(dVar);
                    break;
                }
                break;
            case 22:
                o4.e0 e0Var = (o4.e0) obj2;
                r3.s sVar = (r3.s) obj;
                e0Var.L = e0Var.E == null ? sVar : new r3.n(-9223372036854775807L);
                e0Var.M = sVar.g();
                if (!e0Var.S && sVar.g() == -9223372036854775807L) {
                    z10 = true;
                }
                e0Var.N = z10;
                e0Var.O = z10 ? 7 : 1;
                e0Var.h.t(e0Var.M, sVar.c(), e0Var.N);
                if (!e0Var.I) {
                    e0Var.i();
                    break;
                }
                break;
            case 23:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    y2.q.a().d.e(((o9.c) obj2).h.a.b(v2.d.c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                break;
            case 24:
                oh.v vVar = (oh.v) obj2;
                String str2 = (String) obj;
                ArrayList arrayList9 = vVar.f;
                while (true) {
                    if (i13 >= arrayList9.size()) {
                        i11 = -1;
                    } else if (TextUtils.equals(((d6) arrayList9.get(i13)).E, str2)) {
                        i11 = i13;
                    } else {
                        i13++;
                    }
                }
                if (i11 >= 0) {
                    vVar.r.d(str2.hashCode(), i11 + 1);
                    break;
                }
                break;
            case 25:
                ((VideoAds) obj2).lambda$showPremium$19((eg.o1) obj);
                break;
            case 26:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                break;
            case 27:
                ((VideoAds) obj2).lambda$show$16((Utilities.Callback) obj);
                break;
            case 28:
                p31.T((Context) obj2, null, false, (i0) obj, null);
                break;
            default:
                ((AudioRecordJNI) obj2).lambda$startThread$0((ByteBuffer) obj);
                break;
        }
    }
}

package di;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
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
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x031f A[Catch: all -> 0x02ab, TryCatch #3 {all -> 0x02ab, blocks: (B:141:0x0261, B:144:0x0271, B:146:0x0291, B:148:0x029c, B:150:0x02b0, B:152:0x02b6, B:155:0x0307, B:157:0x031f, B:158:0x0324, B:163:0x02da, B:165:0x02de), top: B:140:0x0261 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        q3 q3Var;
        p4 p4Var;
        int i11 = 29;
        int i12 = 2;
        String str = null;
        int i13 = 1;
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.b;
                y9 y9Var = (y9) this.c;
                h4Var.getClass();
                ((p9) h4Var.l.F1).h(new tg.y0(y9Var.f, 14, false));
                return;
            case 1:
                d5 d5Var = (d5) this.b;
                String str2 = (String) this.c;
                d5Var.f = null;
                t5 t5Var = d5Var.h;
                t5Var.Q = false;
                t5Var.O.c = str2.toLowerCase();
                t5.b(t5Var);
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error == null));
                    return;
                }
                return;
            case 3:
                t6 t6Var = (t6) this.b;
                TLObject tLObject = (TLObject) this.c;
                w6 w6Var = t6Var.q;
                int i14 = t6Var.c;
                ArrayList arrayList = t6Var.i;
                t6Var.I = 0;
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
                        t6Var.F.add(arrayList3);
                        arrayList.add(messageObject);
                    }
                    t6Var.J = Math.max(arrayList.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        t6Var.J = arrayList.size();
                    }
                    if (arrayList.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    t6Var.H = str;
                    t6Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(w6Var);
                    AndroidUtilities.runOnUIThread(w6Var);
                    return;
                }
                return;
            case 4:
                v6 v6Var = (v6) this.b;
                List list = (List) this.c;
                ArrayList arrayList4 = v6Var.h;
                arrayList4.clear();
                arrayList4.addAll(list);
                v6Var.d = true;
                v6Var.e = false;
                v6Var.d();
                NotificationCenter.getInstance(v6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(v6Var.b), v6Var);
                return;
            case 5:
                v6 v6Var2 = (v6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList5 = v6Var2.g;
                ArrayList arrayList6 = v6Var2.h;
                if (!(tLObject2 instanceof TL_stories.TL_albums)) {
                    if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList6.clear();
                        arrayList6.addAll(arrayList5);
                        v6Var2.f = true;
                        v6Var2.e = false;
                        NotificationCenter.getInstance(v6Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(v6Var2.b), v6Var2);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                ArrayList arrayList7 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList8 = tL_albums.albums;
                int size2 = arrayList8.size();
                int i16 = 0;
                while (i16 < size2) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i16);
                    i16++;
                    arrayList7.add(a7.a(tL_storyAlbum));
                }
                arrayList6.clear();
                arrayList6.addAll(arrayList7);
                arrayList5.clear();
                arrayList5.addAll(arrayList7);
                v6Var2.f = true;
                v6Var2.e = false;
                v6Var2.f(true);
                return;
            case 6:
                z6 z6Var = (z6) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                z6Var.getClass();
                callback2.run(z6Var);
                return;
            case 7:
                MessagesController.getInstance(((g7) this.b).M.a).getStoriesController().c0((TL_stories.TL_updateStory) this.c);
                return;
            case 8:
                g7 g7Var = (g7) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                fi.w7 w7Var = g7Var.c;
                w7Var.w = true;
                h7 h7Var = g7Var.M;
                if (h7Var.n(tL_error2)) {
                    w7Var.x = null;
                } else {
                    w7Var.x = tL_error2;
                }
                g7Var.d = true;
                g7Var.I = true;
                g7Var.H = true;
                h7Var.w.d(w7Var);
                return;
            case 9:
                g7 g7Var2 = (g7) this.b;
                g7Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new e7(g7Var2, r6));
                return;
            case 10:
                u7 u7Var = (u7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = u7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i17 = storyItem.id;
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            u7Var.l(peerDialogId, storyItem);
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i17, new Object[0]);
                            boolean next = queryFinalized.next();
                            queryFinalized.dispose();
                            if (!next) {
                                i10 = 1;
                                SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized2.next()) {
                                }
                                queryFinalized2.dispose();
                                Locale locale2 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r6 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                                return;
                            }
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r6 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                        return;
                    }
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i17, new Object[0]);
                    if (queryFinalized3.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            v8.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                            byteBufferValue.reuse();
                        }
                        if (byteBufferValue2 != null) {
                            byteBufferValue2.reuse();
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    queryFinalized3.dispose();
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i17).stepThis().dispose();
                    if (z10) {
                        i10 = -1;
                        SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        r6 = queryFinalized222.next() ? queryFinalized222.intValue(1) : 0;
                        queryFinalized222.dispose();
                        Locale locale222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r6 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                        return;
                    }
                    i10 = 0;
                    SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                    if (queryFinalized2222.next()) {
                    }
                    queryFinalized2222.dispose();
                    Locale locale2222 = Locale.US;
                    database.executeFast("UPDATE stories_counter SET count = " + (r6 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 11:
                u7.a((u7) this.b, (h6) this.c);
                return;
            case 12:
                u7 u7Var2 = (u7) this.b;
                h6 h6Var = (h6) this.c;
                MessagesStorage messagesStorage2 = u7Var2.b;
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
                AndroidUtilities.runOnUIThread(new b4(15, h6Var, longSparseIntArray));
                return;
            case 13:
                ((h6) this.b).run((TL_stories.TL_stories_allStories) this.c);
                return;
            case 14:
                ((u7) this.b).j((ArrayList) this.c);
                return;
            case 15:
                ((h6) this.b).b.f = (LongSparseIntArray) this.c;
                return;
            case 16:
                x7 x7Var = (x7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (x7Var.b) {
                    return;
                }
                runnable.run();
                return;
            case 17:
                Runnable[] runnableArr = (Runnable[]) this.b;
                x7 x7Var2 = (x7) this.c;
                runnableArr[0] = null;
                ((b4) x7Var2.d).run();
                v7 v7Var = (v7) x7Var2.e;
                if (v7Var != null) {
                    v7Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 18:
                w7 w7Var2 = (w7) this.b;
                View view = (View) this.c;
                w7Var2.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                xc xcVar = w7Var2.H;
                if (xcVar != null) {
                    xcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                w7Var2.N = false;
                w7Var2.e();
                return;
            case 19:
                n8 n8Var = (n8) this.b;
                ba0 ba0Var = (ba0) this.c;
                ba0 ba0Var2 = n8Var.a;
                if (ba0Var != ba0Var2 || ba0Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = ba0Var2.i;
                if (characterStyle instanceof URLSpan) {
                    o8 o8Var = n8Var.v;
                    x90 x90Var = n8Var.c;
                    Objects.requireNonNull(x90Var);
                    o8Var.J.H((URLSpan) characterStyle, o8Var, new bi.u6(x90Var, i11));
                    n8Var.a = null;
                    return;
                }
                return;
            case 20:
                c9 c9Var = (c9) this.b;
                fi.v3 v3Var = (fi.v3) this.c;
                c9Var.d.removeView(v3Var);
                if (v3Var == c9Var.c) {
                    c9Var.b = null;
                    c9Var.invalidate();
                    c9Var.b(false);
                    return;
                }
                return;
            case 21:
                p9 p9Var = (p9) this.b;
                x9 x9Var = (x9) this.c;
                y9 y9Var2 = p9Var.d;
                q4 currentPeerView = y9Var2.n0.getCurrentPeerView();
                if (currentPeerView == null || (q3Var = currentPeerView.R0) == null || (p4Var = y9Var2.G0) == null || ((x9) p4Var.c) != x9Var) {
                    return;
                }
                q3Var.invalidate();
                return;
            case 22:
                ((v0.i) this.b).onError((w0.d) this.c);
                return;
            case 23:
                ((v0.i) this.b).onResult((v0.f) this.c);
                return;
            case 24:
                e1.e eVar = (e1.e) this.b;
                v0.c cVar = (v0.c) this.c;
                v0.i iVar = eVar.f;
                if (iVar != null) {
                    iVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 25:
                e2.c cVar2 = (e2.c) this.b;
                Object apply = ((i2.w) this.c).apply(cVar2.f);
                cVar2.f = apply;
                e2.b bVar = new e2.b(cVar2, apply, i13);
                e2.i0 i0Var = (e2.i0) cVar2.c;
                if (i0Var.a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 26:
                e2.w wVar = (e2.w) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new androidx.mediarouter.app.g(wVar, i12), intentFilter);
                return;
            case 27:
                androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.b;
                Context context2 = (Context) this.c;
                e2.w wVar2 = (e2.w) gVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i12 = type != 9 ? 8 : 7;
                                        }
                                        i12 = 5;
                                    }
                                }
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i12 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i12 = 4;
                                    break;
                                case 13:
                                    i12 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i12 = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i12 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i12 = 1;
                        }
                    } catch (SecurityException unused2) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i12 != 5) {
                        wVar2.c(i12);
                        return;
                    } else {
                        e2.u.a(context2, wVar2);
                        return;
                    }
                }
                i12 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                wVar2.c(i12);
                return;
            case 28:
                k9.e0 e0Var = (k9.e0) this.b;
                k9.y yVar = (k9.y) this.c;
                if (e0Var.a instanceof k9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            default:
                bc.a aVar = (bc.a) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                n4.s sVar = (n4.s) aVar.c;
                sVar.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new e2.q0(r6, sVar, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
        }
    }
}

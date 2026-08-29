package lh;

import android.database.SQLException;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
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
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
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
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0323 A[Catch: all -> 0x02af, TryCatch #4 {all -> 0x02af, blocks: (B:128:0x0265, B:131:0x0275, B:133:0x0295, B:135:0x02a0, B:137:0x02b4, B:139:0x02ba, B:142:0x030b, B:144:0x0323, B:145:0x0328, B:150:0x02de, B:152:0x02e2), top: B:127:0x0265 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        h3 h3Var;
        c4 c4Var;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = null;
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.b;
                i9 i9Var = (i9) this.c;
                w3Var.getClass();
                ((z8) w3Var.l.M1).h(new cg.p1(i9Var.f, 14, false));
                break;
            case 1:
                n4 n4Var = (n4) this.b;
                String str2 = (String) this.c;
                n4Var.h = null;
                c5 c5Var = n4Var.n;
                c5Var.M = false;
                c5Var.K.c = str2.toLowerCase();
                c5.b(c5Var);
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 3:
                e6 e6Var = (e6) this.b;
                TLObject tLObject = (TLObject) this.c;
                h6 h6Var = e6Var.q;
                int i15 = e6Var.c;
                ArrayList arrayList = e6Var.i;
                e6Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i15).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i15).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList2 = tL_foundStories.stories;
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList2.get(i16);
                        i16++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList.size();
                        MessageObject messageObject = new MessageObject(i15, tL_foundStory2.storyItem);
                        messageObject.generateThumbs(false);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Integer.valueOf(arrayList.size()));
                        e6Var.F.add(arrayList3);
                        arrayList.add(messageObject);
                    }
                    e6Var.J = Math.max(arrayList.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        e6Var.J = arrayList.size();
                    }
                    if (arrayList.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    e6Var.H = str;
                    e6Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(h6Var);
                    AndroidUtilities.runOnUIThread(h6Var);
                    break;
                }
                break;
            case 4:
                g6 g6Var = (g6) this.b;
                List list = (List) this.c;
                ArrayList arrayList4 = g6Var.h;
                arrayList4.clear();
                arrayList4.addAll(list);
                g6Var.d = true;
                g6Var.e = false;
                g6Var.d();
                NotificationCenter.getInstance(g6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(g6Var.b), g6Var);
                break;
            case 5:
                g6 g6Var2 = (g6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList5 = g6Var2.g;
                ArrayList arrayList6 = g6Var2.h;
                if (!(tLObject2 instanceof TL_stories.TL_albums)) {
                    if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList6.clear();
                        arrayList6.addAll(arrayList5);
                        g6Var2.f = true;
                        g6Var2.e = false;
                        NotificationCenter.getInstance(g6Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(g6Var2.b), g6Var2);
                        break;
                    }
                } else {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList7 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList8 = tL_albums.albums;
                    int size2 = arrayList8.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i17);
                        i17++;
                        arrayList7.add(l6.a(tL_storyAlbum));
                    }
                    arrayList6.clear();
                    arrayList6.addAll(arrayList7);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList7);
                    g6Var2.f = true;
                    g6Var2.e = false;
                    g6Var2.f(true);
                    break;
                }
                break;
            case 6:
                k6 k6Var = (k6) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                k6Var.getClass();
                callback2.run(k6Var);
                break;
            case 7:
                MessagesController.getInstance(((r6) this.b).I.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                break;
            case 8:
                r6 r6Var = (r6) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                nh.o7 o7Var = r6Var.c;
                o7Var.w = true;
                s6 s6Var = r6Var.I;
                if (s6Var.n(tL_error2)) {
                    o7Var.x = null;
                } else {
                    o7Var.x = tL_error2;
                }
                r6Var.d = true;
                r6Var.E = true;
                r6Var.D = true;
                s6Var.w.d(o7Var);
                break;
            case 9:
                r6 r6Var2 = (r6) this.b;
                r6Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new p6(r6Var2, r6));
                break;
            case 10:
                ((v5) this.b).accept((TL_stories.TL_stories_allStories) this.c);
                break;
            case 11:
                f7 f7Var = (f7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = f7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i18 = storyItem.id;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i18, new Object[0]);
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
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        queryFinalized.dispose();
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i18).stepThis().dispose();
                        if (z10) {
                            i10 = -1;
                            SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                            r6 = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            database.executeFast("UPDATE stories_counter SET count = " + (r6 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            break;
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r6 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    } else {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            f7Var.l(peerDialogId, storyItem);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i18, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i10 = 1;
                                SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r6 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            }
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r6 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    }
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 12:
                f7 f7Var2 = (f7) this.b;
                v5 v5Var = (v5) this.c;
                MessagesStorage messagesStorage2 = f7Var2.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e10) {
                    messagesStorage2.checkSQLException(e10);
                }
                AndroidUtilities.runOnUIThread(new r3(15, v5Var, longSparseIntArray));
                break;
            case 13:
                f7.a((f7) this.b, (v5) this.c);
                break;
            case 14:
                ((f7) this.b).j((ArrayList) this.c);
                break;
            case 15:
                ((v5) this.b).b.f = (LongSparseIntArray) this.c;
                break;
            case 16:
                i7 i7Var = (i7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!i7Var.d) {
                    runnable.run();
                    break;
                }
                break;
            case 17:
                Runnable[] runnableArr = (Runnable[]) this.b;
                i7 i7Var2 = (i7) this.c;
                runnableArr[0] = null;
                i7Var2.c.run();
                g7 g7Var = i7Var2.e;
                if (g7Var != null) {
                    g7Var.onDetachedFromWindow();
                    break;
                }
                break;
            case 18:
                h7 h7Var = (h7) this.b;
                View view = (View) this.c;
                h7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                uc ucVar = h7Var.H;
                if (ucVar != null) {
                    ucVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                h7Var.N = false;
                h7Var.e();
                break;
            case 19:
                y7 y7Var = (y7) this.b;
                z80 z80Var = (z80) this.c;
                z80 z80Var2 = y7Var.a;
                if (z80Var == z80Var2 && z80Var2 != null) {
                    CharacterStyle characterStyle = z80Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        z7 z7Var = y7Var.v;
                        v80 v80Var = y7Var.c;
                        Objects.requireNonNull(v80Var);
                        z7Var.F.H((URLSpan) characterStyle, z7Var, new m5(v80Var, 7));
                        y7Var.a = null;
                        break;
                    }
                }
                break;
            case 20:
                m8 m8Var = (m8) this.b;
                nh.t3 t3Var = (nh.t3) this.c;
                m8Var.d.removeView(t3Var);
                if (t3Var == m8Var.c) {
                    m8Var.b = null;
                    m8Var.invalidate();
                    m8Var.b(false);
                    break;
                }
                break;
            case 21:
                z8 z8Var = (z8) this.b;
                h9 h9Var = (h9) this.c;
                i9 i9Var2 = z8Var.d;
                d4 currentPeerView = i9Var2.j0.getCurrentPeerView();
                if (currentPeerView != null && (h3Var = currentPeerView.Y0) != null && (c4Var = i9Var2.C0) != null && c4Var.b == h9Var) {
                    h3Var.invalidate();
                    break;
                }
                break;
            case 22:
                m9.c cVar = (m9.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    y2.q.a().d.e(cVar.h.a.b(v2.d.c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                break;
            case 23:
                mh.v vVar = (mh.v) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList9 = vVar.f;
                while (true) {
                    if (r6 >= arrayList9.size()) {
                        i11 = -1;
                    } else if (TextUtils.equals(((c6) arrayList9.get(r6)).E, str3)) {
                        i11 = r6;
                    } else {
                        r6++;
                    }
                }
                if (i11 >= 0) {
                    vVar.r.d(str3.hashCode(), i11 + 1);
                    break;
                }
                break;
            case 24:
                nh.d dVar = (nh.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i19 = dVar.B - 1;
                dVar.B = i19;
                dVar.c(i19, true);
                if (dVar.B <= 0) {
                    dVar.setClickable(true);
                    gVar.run();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(dVar.C, 1000L);
                    break;
                }
            case 25:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                break;
            case 26:
                nh.r1 r1Var = (nh.r1) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                nh.t1 t1Var = r1Var.s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    nh.k2 k2Var = t1Var.r;
                    i12 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                    i13 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                    MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                    i14 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
                    MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                r1Var.n = true;
                r1Var.G();
                break;
            case 27:
                ((nh.p2) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 28:
                nh.t5 t5Var = (nh.t5) this.b;
                View view2 = (View) this.c;
                t5Var.getClass();
                if (view2 instanceof bg.k) {
                    bg.k kVar = (bg.k) view2;
                    kVar.m();
                    t5Var.D0(kVar, true);
                    break;
                }
                break;
            default:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        break;
                    } else {
                        break;
                    }
                } catch (Exception unused3) {
                    return;
                }
        }
    }
}

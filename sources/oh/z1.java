package oh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.rc;
import org.telegram.ui.w31;
import qh.aa;
import qh.ba;
import qh.t9;
import qh.w9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0244 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:88:0x0186, B:91:0x0196, B:93:0x01b6, B:95:0x01c1, B:97:0x01d5, B:99:0x01db, B:102:0x022c, B:104:0x0244, B:105:0x0249, B:110:0x01ff, B:112:0x0203), top: B:87:0x0186 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        aa aaVar;
        h9 h9Var;
        int i10;
        boolean z4;
        j3 j3Var;
        e4 e4Var;
        String str = null;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                qh.e3 e3Var = (qh.e3) this.c;
                f4Var.removeView(e3Var);
                if (f4Var.a2 == e3Var) {
                    f4Var.a2 = null;
                    break;
                }
                break;
            case 1:
                f4 f4Var2 = (f4) this.b;
                ba E = ba.E((Activity) this.c, f4Var2.z2);
                e4 e4Var2 = f4Var2.J2;
                long j10 = (e4Var2 == null || (h9Var = e4Var2.b) == null) ? 0L : h9Var.currentPosition;
                File h = f4Var2.L1.h();
                TL_stories.StoryItem storyItem = f4Var2.L1.a;
                qh.r6 r6Var = new qh.r6();
                r6Var.n = true;
                r6Var.t = storyItem.media;
                int i11 = r6Var.a;
                r6Var.q = MessagesController.getInstance(i11).getPeer(storyItem.dialogId);
                r6Var.r = storyItem.id;
                r6Var.s = storyItem.caption;
                r6Var.L = h;
                r6Var.M = false;
                r6Var.k0 = 720;
                r6Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    r6Var.K = false;
                    if (h != null) {
                        r6Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    r6Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i12 = 0;
                        while (true) {
                            if (i12 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i12);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    r6Var.k0 = documentAttribute.w;
                                    r6Var.l0 = documentAttribute.h;
                                    r6Var.i = documentAttribute.duration;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            r6Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i13 = 0; i13 < storyItem.media.document.thumbs.size(); i13++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i13);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    r6Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i11).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        r6Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                r6Var.A();
                r6Var.e(storyItem);
                t9 d = w9.d(f4Var2.G0);
                RectF rectF = E.E;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f;
                int i14 = E.c;
                if (!E.d) {
                    if (MessagesController.getInstance(i14).isFrozen()) {
                        org.telegram.ui.c.b(i14);
                    } else {
                        E.r0 = false;
                        E.e = false;
                        E.y2 = false;
                        if (windowManager != null && (aaVar = E.n) != null && aaVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.H1 = r6Var;
                        qh.e8.a(i14, r6Var);
                        qh.r6 r6Var2 = E.H1;
                        E.L1 = (r6Var2 == null || !r6Var2.K) ? 0 : 1;
                        E.p0.g = false;
                        if (d != null) {
                            E.C = d;
                            E.G = d.a;
                            rectF.set(d.c);
                            E.D = d.b;
                            E.C.e();
                        } else {
                            E.G = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.D = AndroidUtilities.dp(8.0f);
                        }
                        E.r.c();
                        qh.m9 m9Var = E.e0;
                        int i15 = E.G;
                        m9Var.setBackgroundColor((i15 == 1 || i15 == 0) ? 0 : -14737633);
                        E.r.setTranslationX(0.0f);
                        E.r.setTranslationY(0.0f);
                        E.r.b(0.0f);
                        E.r.setScaleX(1.0f);
                        E.r.setScaleY(1.0f);
                        E.H = 0.0f;
                        AndroidUtilities.lockOrientation(E.b, 1);
                        qh.r6 r6Var3 = E.H1;
                        if (r6Var3 != null) {
                            E.Z0.setText(r6Var3.C0);
                        }
                        E.L(new qh.f8(E, 7), j10);
                        E.Y0.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.s0 = 0L;
                        E.t0 = "";
                    }
                }
                E.N = new w1(f4Var2, 12);
                E.O = new c2(r6, f4Var2, E);
                break;
            case 2:
                y3 y3Var = (y3) this.b;
                i9 i9Var = (i9) this.c;
                y3Var.getClass();
                ((z8) y3Var.l.N1).h(new fg.n1(i9Var.f, 14, false));
                break;
            case 3:
                p4 p4Var = (p4) this.b;
                String str3 = (String) this.c;
                p4Var.h = null;
                e5 e5Var = p4Var.n;
                e5Var.N = false;
                e5Var.L.c = str3.toLowerCase();
                e5.b(e5Var);
                break;
            case 4:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 5:
                f6 f6Var = (f6) this.b;
                TLObject tLObject = (TLObject) this.c;
                i6 i6Var = f6Var.q;
                int i16 = f6Var.c;
                ArrayList arrayList = f6Var.i;
                f6Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i16).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i16).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList2 = tL_foundStories.stories;
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList2.get(i17);
                        i17++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList.size();
                        MessageObject messageObject = new MessageObject(i16, tL_foundStory2.storyItem);
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
            case 6:
                h6 h6Var = (h6) this.b;
                List list = (List) this.c;
                ArrayList arrayList4 = h6Var.h;
                arrayList4.clear();
                arrayList4.addAll(list);
                h6Var.d = true;
                h6Var.e = false;
                h6Var.d();
                NotificationCenter.getInstance(h6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(h6Var.b), h6Var);
                break;
            case 7:
                h6 h6Var2 = (h6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList5 = h6Var2.g;
                ArrayList arrayList6 = h6Var2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList7 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList8 = tL_albums.albums;
                    int size2 = arrayList8.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i18);
                        i18++;
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
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    h6Var2.f = true;
                    h6Var2.e = false;
                    NotificationCenter.getInstance(h6Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(h6Var2.b), h6Var2);
                    break;
                }
                break;
            case 8:
                l6 l6Var = (l6) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                l6Var.getClass();
                callback2.run(l6Var);
                break;
            case 9:
                MessagesController.getInstance(((s6) this.b).J.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                break;
            case 10:
                s6 s6Var = (s6) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                qh.r6 r6Var4 = s6Var.c;
                r6Var4.w = true;
                t6 t6Var = s6Var.J;
                if (t6Var.n(tL_error2)) {
                    r6Var4.x = null;
                } else {
                    r6Var4.x = tL_error2;
                }
                s6Var.d = true;
                s6Var.F = true;
                s6Var.E = true;
                t6Var.w.d(r6Var4);
                break;
            case 11:
                s6 s6Var2 = (s6) this.b;
                s6Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new q6(s6Var2, r6));
                break;
            case 12:
                ((w5) this.b).accept((TL_stories.TL_stories_allStories) this.c);
                break;
            case 13:
                g7 g7Var = (g7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = g7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i19 = storyItem2.id;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i19, new Object[0]);
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
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i19).stepThis().dispose();
                        if (z4) {
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
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            g7Var.l(peerDialogId, storyItem2);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i19, new Object[0]);
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
            case 14:
                g7 g7Var2 = (g7) this.b;
                w5 w5Var = (w5) this.c;
                MessagesStorage messagesStorage2 = g7Var2.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e6) {
                    messagesStorage2.checkSQLException(e6);
                }
                AndroidUtilities.runOnUIThread(new z1(17, w5Var, longSparseIntArray));
                break;
            case 15:
                g7.a((g7) this.b, (w5) this.c);
                break;
            case 16:
                ((g7) this.b).j((ArrayList) this.c);
                break;
            case 17:
                ((w5) this.b).b.f = (LongSparseIntArray) this.c;
                break;
            case 18:
                j7 j7Var = (j7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!j7Var.d) {
                    runnable.run();
                    break;
                }
                break;
            case 19:
                Runnable[] runnableArr = (Runnable[]) this.b;
                j7 j7Var2 = (j7) this.c;
                runnableArr[0] = null;
                j7Var2.c.run();
                h7 h7Var = j7Var2.e;
                if (h7Var != null) {
                    h7Var.onDetachedFromWindow();
                    break;
                }
                break;
            case 20:
                i7 i7Var = (i7) this.b;
                View view = (View) this.c;
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
            case 21:
                y7 y7Var = (y7) this.b;
                h90 h90Var = (h90) this.c;
                h90 h90Var2 = y7Var.a;
                if (h90Var == h90Var2 && h90Var2 != null) {
                    CharacterStyle characterStyle = h90Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        z7 z7Var = y7Var.v;
                        d90 d90Var = y7Var.c;
                        Objects.requireNonNull(d90Var);
                        z7Var.G.H((URLSpan) characterStyle, z7Var, new t3(d90Var, 10));
                        y7Var.a = null;
                        break;
                    }
                }
                break;
            case 22:
                m8 m8Var = (m8) this.b;
                qh.e3 e3Var2 = (qh.e3) this.c;
                m8Var.d.removeView(e3Var2);
                if (e3Var2 == m8Var.c) {
                    m8Var.b = null;
                    m8Var.invalidate();
                    m8Var.b(false);
                    break;
                }
                break;
            case 23:
                z8 z8Var = (z8) this.b;
                h9 h9Var2 = (h9) this.c;
                i9 i9Var2 = z8Var.d;
                f4 currentPeerView = i9Var2.k0.getCurrentPeerView();
                if (currentPeerView != null && (j3Var = currentPeerView.Z0) != null && (e4Var = i9Var2.D0) != null && e4Var.b == h9Var2) {
                    j3Var.invalidate();
                    break;
                }
                break;
            case 24:
                ((VideoAds) this.b).lambda$showPremium$19((fg.n1) this.c);
                break;
            case 25:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                break;
            case 26:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                break;
            case 27:
                w31.T((Context) this.b, null, false, (h0) this.c, null);
                break;
            case 28:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                break;
            default:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                break;
        }
    }
}

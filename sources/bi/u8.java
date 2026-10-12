package bi;

import android.content.Context;
import android.database.SQLException;
import android.location.Address;
import android.location.Geocoder;
import android.media.AudioManager;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ea0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x03c0 A[Catch: all -> 0x034c, TryCatch #5 {all -> 0x034c, blocks: (B:160:0x0302, B:163:0x0312, B:165:0x0332, B:167:0x033d, B:169:0x0351, B:171:0x0357, B:174:0x03a8, B:176:0x03c0, B:177:0x03c5, B:182:0x037b, B:184:0x037f), top: B:159:0x0302 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        o4 o4Var;
        p5 p5Var;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(((w8) this.b).M.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                return;
            case 1:
                w8 w8Var = (w8) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                di.k8 k8Var = w8Var.c;
                k8Var.w = true;
                x8 x8Var = w8Var.M;
                if (x8Var.n(tL_error)) {
                    k8Var.x = null;
                } else {
                    k8Var.x = tL_error;
                }
                w8Var.d = true;
                w8Var.I = true;
                w8Var.H = true;
                x8Var.w.d(k8Var);
                return;
            case 2:
                w8 w8Var2 = (w8) this.b;
                w8Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new t8(w8Var2, r5));
                return;
            case 3:
                k9 k9Var = (k9) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = k9Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i15 = storyItem.id;
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            k9Var.l(peerDialogId, storyItem);
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i15, new Object[0]);
                            boolean next = queryFinalized.next();
                            queryFinalized.dispose();
                            if (!next) {
                                i10 = 1;
                                SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized2.next()) {
                                }
                                queryFinalized2.dispose();
                                Locale locale2 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r5 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                                return;
                            }
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r5 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                        return;
                    }
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i15, new Object[0]);
                    if (queryFinalized3.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            pa.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
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
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i15).stepThis().dispose();
                    if (z10) {
                        i10 = -1;
                        SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        r5 = queryFinalized222.next() ? queryFinalized222.intValue(1) : 0;
                        queryFinalized222.dispose();
                        Locale locale222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r5 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                        return;
                    }
                    i10 = 0;
                    SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                    if (queryFinalized2222.next()) {
                    }
                    queryFinalized2222.dispose();
                    Locale locale2222 = Locale.US;
                    database.executeFast("UPDATE stories_counter SET count = " + (r5 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 4:
                k9.a((k9) this.b, (l7) this.c);
                return;
            case 5:
                k9 k9Var2 = (k9) this.b;
                l7 l7Var = (l7) this.c;
                MessagesStorage messagesStorage2 = k9Var2.b;
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
                AndroidUtilities.runOnUIThread(new u8(8, l7Var, longSparseIntArray));
                return;
            case 6:
                ((l7) this.b).run((TL_stories.TL_stories_allStories) this.c);
                return;
            case 7:
                ((k9) this.b).j((ArrayList) this.c);
                return;
            case 8:
                ((l7) this.b).b.f = (LongSparseIntArray) this.c;
                return;
            case 9:
                n9 n9Var = (n9) this.b;
                Runnable runnable = (Runnable) this.c;
                if (n9Var.b) {
                    return;
                }
                runnable.run();
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.b;
                n9 n9Var2 = (n9) this.c;
                runnableArr[0] = null;
                ((u8) n9Var2.d).run();
                l9 l9Var = (l9) n9Var2.e;
                if (l9Var != null) {
                    l9Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 11:
                m9 m9Var = (m9) this.b;
                View view = (View) this.c;
                m9Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ad adVar = m9Var.H;
                if (adVar != null) {
                    adVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                m9Var.N = false;
                m9Var.e();
                return;
            case 12:
                fa faVar = (fa) this.b;
                ea0 ea0Var = (ea0) this.c;
                ea0 ea0Var2 = faVar.a;
                if (ea0Var != ea0Var2 || ea0Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = ea0Var2.i;
                if (characterStyle instanceof URLSpan) {
                    ga gaVar = faVar.v;
                    aa0 aa0Var = faVar.c;
                    Objects.requireNonNull(aa0Var);
                    gaVar.J.H((URLSpan) characterStyle, gaVar, new a3.d(aa0Var, 29));
                    faVar.a = null;
                    return;
                }
                return;
            case 13:
                wa waVar = (wa) this.b;
                di.d4 d4Var = (di.d4) this.c;
                waVar.d.removeView(d4Var);
                if (d4Var == waVar.c) {
                    waVar.b = null;
                    waVar.invalidate();
                    waVar.b(false);
                    return;
                }
                return;
            case 14:
                jb jbVar = (jb) this.b;
                rb rbVar = (rb) this.c;
                sb sbVar = jbVar.d;
                q5 currentPeerView = sbVar.n0.getCurrentPeerView();
                if (currentPeerView == null || (o4Var = currentPeerView.c1) == null || (p5Var = sbVar.G0) == null || ((rb) p5Var.c) != rbVar) {
                    return;
                }
                o4Var.invalidate();
                return;
            case 15:
                ((c1.e) this.b).e().onError(((kotlin.jvm.internal.p) this.c).a);
                return;
            case 16:
                ((c1.e) this.b).e().onError((w0.h) this.c);
                return;
            case 17:
                ((c1.e) this.b).e().onResult((v0.o) this.c);
                return;
            case 18:
                Context context = (Context) this.b;
                e2.i iVar = (e2.i) this.c;
                c2.i.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                iVar.e();
                return;
            case 19:
                ci.y yVar = (ci.y) this.b;
                String str = (String) this.c;
                ArrayList arrayList = yVar.f;
                while (true) {
                    if (r5 >= arrayList.size()) {
                        i11 = -1;
                    } else if (TextUtils.equals(((f8) arrayList.get(r5)).E, str)) {
                        i11 = r5;
                    } else {
                        r5++;
                    }
                }
                if (i11 >= 0) {
                    yVar.r.d(str.hashCode(), i11 + 1);
                    return;
                }
                return;
            case 20:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                ya.c cVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 21:
                com.google.firebase.messaging.n nVar = (com.google.firebase.messaging.n) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(nVar.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 22:
                d1.e eVar = (d1.e) this.b;
                v0.f fVar = (v0.f) this.c;
                v0.i iVar2 = eVar.f;
                if (iVar2 != null) {
                    iVar2.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 23:
                da.c cVar2 = (da.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    l5.s.a().d.e(cVar2.h.a.b(i5.d.c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 24:
                di.d dVar = (di.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i16 = dVar.F - 1;
                dVar.F = i16;
                dVar.b(i16, true);
                if (dVar.F > 0) {
                    AndroidUtilities.runOnUIThread(dVar.G, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    gVar.run();
                    return;
                }
            case 25:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                return;
            case 26:
                di.v1 v1Var = (di.v1) this.b;
                TLObject tLObject = (TLObject) this.c;
                di.y1 y1Var = v1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    di.r2 r2Var = y1Var.r;
                    i12 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                    i13 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                    MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                    i14 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                    MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                v1Var.n = true;
                v1Var.G();
                return;
            case 27:
                ((di.w2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 28:
                di.o6 o6Var = (di.o6) this.b;
                View view2 = (View) this.c;
                o6Var.getClass();
                if (view2 instanceof rg.j) {
                    rg.j jVar = (rg.j) view2;
                    jVar.m();
                    o6Var.C0(jVar, true);
                    return;
                }
                return;
            default:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused3) {
                    return;
                }
        }
    }
}

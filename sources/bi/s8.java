package bi;

import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.zc;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x03c1 A[Catch: all -> 0x034d, TryCatch #5 {all -> 0x034d, blocks: (B:160:0x0303, B:163:0x0313, B:165:0x0333, B:167:0x033e, B:169:0x0352, B:171:0x0358, B:174:0x03a9, B:176:0x03c1, B:177:0x03c6, B:182:0x037c, B:184:0x0380), top: B:159:0x0303 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        l4 l4Var;
        n5 n5Var;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                t8 t8Var = (t8) this.b;
                t8Var.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new q8(t8Var, r5));
                return;
            case 1:
                h9.a((h9) this.b, (q7) this.c);
                return;
            case 2:
                ((q7) this.b).accept((TL_stories.TL_stories_allStories) this.c);
                return;
            case 3:
                h9 h9Var = (h9) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = h9Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i15 = storyItem.id;
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            h9Var.l(peerDialogId, storyItem);
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
                            la.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
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
                h9 h9Var2 = (h9) this.b;
                q7 q7Var = (q7) this.c;
                MessagesStorage messagesStorage2 = h9Var2.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e7) {
                    messagesStorage2.checkSQLException(e7);
                }
                AndroidUtilities.runOnUIThread(new s8(6, q7Var, longSparseIntArray));
                return;
            case 5:
                ((h9) this.b).j((ArrayList) this.c);
                return;
            case 6:
                ((q7) this.b).b.f = (LongSparseIntArray) this.c;
                return;
            case 7:
                k9 k9Var = (k9) this.b;
                Runnable runnable = (Runnable) this.c;
                if (k9Var.b) {
                    return;
                }
                runnable.run();
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) this.b;
                k9 k9Var2 = (k9) this.c;
                runnableArr[0] = null;
                ((s8) k9Var2.d).run();
                i9 i9Var = (i9) k9Var2.e;
                if (i9Var != null) {
                    i9Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 9:
                j9 j9Var = (j9) this.b;
                View view = (View) this.c;
                j9Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                zc zcVar = j9Var.H;
                if (zcVar != null) {
                    zcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                j9Var.N = false;
                j9Var.e();
                return;
            case 10:
                ca caVar = (ca) this.b;
                e90 e90Var = (e90) this.c;
                e90 e90Var2 = caVar.a;
                if (e90Var != e90Var2 || e90Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = e90Var2.i;
                if (characterStyle instanceof URLSpan) {
                    da daVar = caVar.v;
                    a90 a90Var = caVar.c;
                    Objects.requireNonNull(a90Var);
                    daVar.J.H((URLSpan) characterStyle, daVar, new a3.c(a90Var, 28));
                    caVar.a = null;
                    return;
                }
                return;
            case 11:
                ta taVar = (ta) this.b;
                di.f4 f4Var = (di.f4) this.c;
                taVar.d.removeView(f4Var);
                if (f4Var == taVar.c) {
                    taVar.b = null;
                    taVar.invalidate();
                    taVar.b(false);
                    return;
                }
                return;
            case 12:
                gb gbVar = (gb) this.b;
                ob obVar = (ob) this.c;
                pb pbVar = gbVar.d;
                o5 currentPeerView = pbVar.n0.getCurrentPeerView();
                if (currentPeerView == null || (l4Var = currentPeerView.c1) == null || (n5Var = pbVar.G0) == null || ((ob) n5Var.c) != obVar) {
                    return;
                }
                l4Var.invalidate();
                return;
            case 13:
                ((c1.e) this.b).e().onError(((kotlin.jvm.internal.p) this.c).a);
                return;
            case 14:
                ((c1.e) this.b).e().onError((w0.h) this.c);
                return;
            case 15:
                ((c1.e) this.b).e().onResult((v0.o) this.c);
                return;
            case 16:
                Context context = (Context) this.b;
                e2.g gVar = (e2.g) this.c;
                c2.d.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                gVar.e();
                return;
            case 17:
                ca.c cVar = (ca.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    l5.s.a().d.e(cVar.h.a.b(i5.d.c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 18:
                ci.y yVar = (ci.y) this.b;
                String str = (String) this.c;
                ArrayList arrayList = yVar.f;
                while (true) {
                    if (r5 >= arrayList.size()) {
                        i11 = -1;
                    } else if (TextUtils.equals(((b8) arrayList.get(r5)).E, str)) {
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
            case 19:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                a6.i iVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 20:
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(oVar.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 21:
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
            case 22:
                di.d dVar = (di.d) this.b;
                org.telegram.ui.Cells.g gVar2 = (org.telegram.ui.Cells.g) this.c;
                int i16 = dVar.F - 1;
                dVar.F = i16;
                dVar.b(i16, true);
                if (dVar.F > 0) {
                    AndroidUtilities.runOnUIThread(dVar.G, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    gVar2.run();
                    return;
                }
            case 23:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                return;
            case 24:
                di.w1 w1Var = (di.w1) this.b;
                TLObject tLObject = (TLObject) this.c;
                di.z1 z1Var = w1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    di.t2 t2Var = z1Var.r;
                    i12 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                    i13 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                    MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                    i14 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                    MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                w1Var.n = true;
                w1Var.G();
                return;
            case 25:
                ((di.y2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 26:
                di.q6 q6Var = (di.q6) this.b;
                View view2 = (View) this.c;
                q6Var.getClass();
                if (view2 instanceof rg.k) {
                    rg.k kVar = (rg.k) view2;
                    kVar.m();
                    q6Var.D0(kVar, true);
                    return;
                }
                return;
            case 27:
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
            case 28:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                return;
            default:
                di.d7.a((di.d7) this.b, (di.o8) this.c);
                return;
        }
    }
}

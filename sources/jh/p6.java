package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import hh.y9;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.q80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0453 A[Catch: all -> 0x03df, TryCatch #4 {all -> 0x03df, blocks: (B:155:0x0395, B:158:0x03a5, B:160:0x03c5, B:162:0x03d0, B:164:0x03e4, B:166:0x03ea, B:169:0x043b, B:171:0x0453, B:172:0x0458, B:177:0x040e, B:179:0x0412), top: B:154:0x0395 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        j3 j3Var;
        d4 d4Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(((r6) this.b).I.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                break;
            case 1:
                r6 r6Var = (r6) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                lh.z7 z7Var = r6Var.c;
                z7Var.w = true;
                s6 s6Var = r6Var.I;
                if (s6Var.n(tL_error)) {
                    z7Var.x = null;
                } else {
                    z7Var.x = tL_error;
                }
                r6Var.d = true;
                r6Var.E = true;
                r6Var.D = true;
                s6Var.w.d(z7Var);
                break;
            case 2:
                r6 r6Var2 = (r6) this.b;
                r6Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new o6(r6Var2, r7));
                break;
            case 3:
                ((u5) this.b).accept((TL_stories.TL_stories_allStories) this.c);
                break;
            case 4:
                f7 f7Var = (f7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = f7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i16 = storyItem.id;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i16, new Object[0]);
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
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i16).stepThis().dispose();
                        if (z10) {
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
                            f7Var.l(peerDialogId, storyItem);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i16, new Object[0]);
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
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            case 5:
                f7 f7Var2 = (f7) this.b;
                u5 u5Var = (u5) this.c;
                MessagesStorage messagesStorage2 = f7Var2.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e9) {
                    messagesStorage2.checkSQLException(e9);
                }
                AndroidUtilities.runOnUIThread(new p6(i15, u5Var, longSparseIntArray));
                break;
            case 6:
                f7.a((f7) this.b, (u5) this.c);
                break;
            case 7:
                ((f7) this.b).j((ArrayList) this.c);
                break;
            case 8:
                ((u5) this.b).b.f = (LongSparseIntArray) this.c;
                break;
            case 9:
                i7 i7Var = (i7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!i7Var.d) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
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
            case 11:
                h7 h7Var = (h7) this.b;
                View view = (View) this.c;
                h7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                nc ncVar = h7Var.H;
                if (ncVar != null) {
                    ncVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                h7Var.N = false;
                h7Var.e();
                break;
            case 12:
                y7 y7Var = (y7) this.b;
                q80 q80Var = (q80) this.c;
                q80 q80Var2 = y7Var.a;
                if (q80Var == q80Var2 && q80Var2 != null) {
                    CharacterStyle characterStyle = q80Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        z7 z7Var2 = y7Var.v;
                        m80 m80Var = y7Var.c;
                        Objects.requireNonNull(m80Var);
                        z7Var2.F.H((URLSpan) characterStyle, z7Var2, new y9(m80Var, 23));
                        y7Var.a = null;
                        break;
                    }
                }
                break;
            case 13:
                m8 m8Var = (m8) this.b;
                lh.w3 w3Var = (lh.w3) this.c;
                m8Var.d.removeView(w3Var);
                if (w3Var == m8Var.c) {
                    m8Var.b = null;
                    m8Var.invalidate();
                    m8Var.b(false);
                    break;
                }
                break;
            case 14:
                z8 z8Var = (z8) this.b;
                h9 h9Var = (h9) this.c;
                i9 i9Var = z8Var.d;
                e4 currentPeerView = i9Var.j0.getCurrentPeerView();
                if (currentPeerView != null && (j3Var = currentPeerView.Y0) != null && (d4Var = i9Var.C0) != null && d4Var.b == h9Var) {
                    j3Var.invalidate();
                    break;
                }
                break;
            case 15:
                kh.v vVar = (kh.v) this.b;
                String str = (String) this.c;
                ArrayList arrayList = vVar.f;
                while (true) {
                    if (r7 >= arrayList.size()) {
                        i11 = -1;
                    } else if (TextUtils.equals(((b6) arrayList.get(r7)).E, str)) {
                        i11 = r7;
                    } else {
                        r7++;
                    }
                }
                if (i11 >= 0) {
                    vVar.r.d(str.hashCode(), i11 + 1);
                    break;
                }
                break;
            case 16:
                l9.c cVar = (l9.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    w2.q.a().d.e(cVar.h.a.b(t2.d.c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                break;
            case 17:
                lh.d dVar = (lh.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i17 = dVar.B - 1;
                dVar.B = i17;
                dVar.c(i17, true);
                if (dVar.B <= 0) {
                    dVar.setClickable(true);
                    gVar.run();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(dVar.C, 1000L);
                    break;
                }
            case 18:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                break;
            case 19:
                lh.s1 s1Var = (lh.s1) this.b;
                TLObject tLObject = (TLObject) this.c;
                lh.u1 u1Var = s1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    lh.l2 l2Var = u1Var.r;
                    i12 = ((org.telegram.ui.ActionBar.e3) l2Var).currentAccount;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                    i13 = ((org.telegram.ui.ActionBar.e3) l2Var).currentAccount;
                    MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                    i14 = ((org.telegram.ui.ActionBar.e3) l2Var).currentAccount;
                    MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                s1Var.n = true;
                s1Var.G();
                break;
            case 20:
                ((lh.r2) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 21:
                lh.f6 f6Var = (lh.f6) this.b;
                View view2 = (View) this.c;
                f6Var.getClass();
                if (view2 instanceof zf.j) {
                    zf.j jVar = (zf.j) view2;
                    jVar.m();
                    f6Var.D0(jVar, true);
                    break;
                }
                break;
            case 22:
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
            case 23:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                break;
            case 24:
                lh.q6.a((lh.q6) this.b, (lh.z7) this.c);
                break;
            case 25:
                j9.a aVar = (j9.a) this.b;
                lh.z7 z7Var3 = (lh.z7) this.c;
                lh.q6 q6Var = (lh.q6) aVar.d;
                Bitmap bitmap = q6Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (z7Var3.M0 == q6Var.a) {
                        z7Var3.M0 = null;
                    }
                    q6Var.a = null;
                    q6Var.invalidate();
                    break;
                }
                break;
            case 26:
                lh.u6 u6Var = (lh.u6) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = u6Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new c8.n(new com.google.android.gms.internal.vision.t2(context, x1Var)));
                u6Var.a(u6Var.f);
                break;
            case 27:
                ((lh.u6) this.b).c.run((lh.s6) this.c);
                break;
            case 28:
                lh.q qVar = (lh.q) this.b;
                zf.c2 c2Var = (zf.c2) this.c;
                lh.c7 c7Var = qVar.a;
                if (c2Var.getWidth() > 0) {
                    float width = c2Var.getWidth() / c7Var.getWidth();
                    ValueAnimator valueAnimator = qVar.w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar.w.addUpdateListener(new lh.b7(qVar, c7Var.getScaleX(), width, ((c2Var.getWidth() / 2.0f) + c2Var.getX()) - ((c7Var.getWidth() / 2.0f) + c7Var.getX()), ((c2Var.getHeight() / 2.0f) + c2Var.getY()) - ((c7Var.getHeight() / 2.0f) + c7Var.getY()), 0));
                    qVar.w.addListener(new ag.x1(i15, qVar, c2Var));
                    qVar.w.setDuration(320L);
                    qVar.w.setInterpolator(er.h);
                    qVar.v = c2Var;
                    qVar.w.start();
                    break;
                } else {
                    c7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new kh.c(qVar, 17)).start();
                    break;
                }
            default:
                lh.r7 r7Var = (lh.r7) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                r7Var.H0 = false;
                r7Var.X.addAll(arrayList2);
                r7Var.m0.N(true);
                break;
        }
    }
}

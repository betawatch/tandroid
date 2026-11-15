package fi;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.dc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f6(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03de A[Catch: all -> 0x0369, TryCatch #3 {all -> 0x0369, blocks: (B:181:0x0321, B:183:0x032f, B:185:0x034f, B:187:0x035a, B:189:0x036f, B:191:0x0375, B:194:0x03c6, B:196:0x03de, B:197:0x03e3, B:202:0x0399, B:204:0x039d), top: B:180:0x0321 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        boolean z10;
        e3 e3Var;
        a4 a4Var;
        int i10;
        PowerManager.WakeLock wakeLock;
        int i11 = 3;
        int i12 = 1;
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = g6Var.g;
                ArrayList arrayList2 = g6Var.h;
                if (!(tLObject instanceof TL_stories.TL_albums)) {
                    if (tLObject instanceof TL_stories.TL_albumsNotModified) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        g6Var.f = true;
                        g6Var.e = false;
                        ns.f(g6Var.a).k(ns.j3, Long.valueOf(g6Var.b), g6Var);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject;
                ArrayList arrayList3 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList4 = tL_albums.albums;
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList4.get(i13);
                    i13++;
                    arrayList3.add(l6.a(tL_storyAlbum));
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                arrayList.clear();
                arrayList.addAll(arrayList3);
                g6Var.f = true;
                g6Var.e = false;
                g6Var.f(true);
                return;
            case 1:
                k6 k6Var = (k6) this.b;
                z10 z10Var = (z10) this.c;
                k6Var.getClass();
                z10Var.a(k6Var);
                return;
            case 2:
                np.s1(((r6) this.b).N.a).P1().c0((TL_stories.TL_updateStory) this.c);
                return;
            case 3:
                r6 r6Var = (r6) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                hi.d7 d7Var = r6Var.c;
                d7Var.w = true;
                s6 s6Var = r6Var.N;
                if (s6Var.n(tL_error)) {
                    d7Var.x = null;
                } else {
                    d7Var.x = tL_error;
                }
                r6Var.d = true;
                r6Var.J = true;
                r6Var.I = true;
                s6Var.w.d(d7Var);
                return;
            case 4:
                r6 r6Var2 = (r6) this.b;
                r6Var2.c.c((File) this.c);
                org.telegram.messenger.g0.h3(new p6(r6Var2, r7));
                return;
            case 5:
                f7.a((f7) this.b, (q5) this.c);
                return;
            case 6:
                f7 f7Var = (f7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                vr vrVar = f7Var.b;
                SQLiteDatabase sQLiteDatabase = vrVar.b;
                try {
                    long o4 = org.telegram.messenger.m5.o(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i14 = storyItem.id;
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            f7Var.l(o4, storyItem);
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i14, new Object[0]);
                            boolean next = queryFinalized.next();
                            queryFinalized.dispose();
                            if (!next) {
                                i7 = 1;
                                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o4, new Object[0]);
                                if (queryFinalized2.next()) {
                                }
                                queryFinalized2.dispose();
                                Locale locale2 = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r7 + i7) + " WHERE dialog_id = " + o4).stepThis().dispose();
                                return;
                            }
                        }
                        i7 = 0;
                        SQLiteCursor queryFinalized22 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o4, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r7 + i7) + " WHERE dialog_id = " + o4).stepThis().dispose();
                        return;
                    }
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i14, new Object[0]);
                    if (queryFinalized3.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(1);
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
                    queryFinalized3.dispose();
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i14).stepThis().dispose();
                    if (z10) {
                        i7 = -1;
                        SQLiteCursor queryFinalized222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o4, new Object[0]);
                        r7 = queryFinalized222.next() ? queryFinalized222.intValue(1) : 0;
                        queryFinalized222.dispose();
                        Locale locale222 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r7 + i7) + " WHERE dialog_id = " + o4).stepThis().dispose();
                        return;
                    }
                    i7 = 0;
                    SQLiteCursor queryFinalized2222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o4, new Object[0]);
                    if (queryFinalized2222.next()) {
                    }
                    queryFinalized2222.dispose();
                    Locale locale2222 = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r7 + i7) + " WHERE dialog_id = " + o4).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    vrVar.o(th2, true);
                    return;
                }
            case 7:
                ((f7) this.b).j((ArrayList) this.c);
                return;
            case 8:
                f7 f7Var2 = (f7) this.b;
                q5 q5Var = (q5) this.c;
                vr vrVar2 = f7Var2.b;
                SQLiteDatabase sQLiteDatabase2 = vrVar2.b;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e10) {
                    vrVar2.o(e10, true);
                }
                org.telegram.messenger.g0.h3(new f6(10, q5Var, longSparseIntArray));
                return;
            case 9:
                ((q5) this.b).a((TL_stories.TL_stories_allStories) this.c);
                return;
            case 10:
                ((q5) this.b).b.f = (LongSparseIntArray) this.c;
                return;
            case 11:
                i7 i7Var = (i7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (i7Var.b) {
                    return;
                }
                runnable.run();
                return;
            case 12:
                Runnable[] runnableArr = (Runnable[]) this.b;
                i7 i7Var2 = (i7) this.c;
                runnableArr[0] = null;
                ((f6) i7Var2.d).run();
                g7 g7Var = (g7) i7Var2.e;
                if (g7Var != null) {
                    g7Var.R();
                    return;
                }
                return;
            case 13:
                h7 h7Var = (h7) this.b;
                View view = (View) this.c;
                h7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                dc dcVar = h7Var.H;
                if (dcVar != null) {
                    dcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                h7Var.N = false;
                h7Var.e();
                return;
            case 14:
                y7 y7Var = (y7) this.b;
                a80 a80Var = (a80) this.c;
                a80 a80Var2 = y7Var.a;
                if (a80Var != a80Var2 || a80Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = a80Var2.i;
                if (characterStyle instanceof URLSpan) {
                    z7 z7Var = y7Var.v;
                    n2.o0 o0Var = y7Var.c;
                    Objects.requireNonNull(o0Var);
                    z7Var.K.H((URLSpan) characterStyle, z7Var, new c1(o0Var, 14));
                    y7Var.a = null;
                    return;
                }
                return;
            case 15:
                m8 m8Var = (m8) this.b;
                hi.l3 l3Var = (hi.l3) this.c;
                m8Var.d.removeView(l3Var);
                if (l3Var == m8Var.c) {
                    m8Var.b = null;
                    m8Var.invalidate();
                    m8Var.b(false);
                    return;
                }
                return;
            case 16:
                z8 z8Var = (z8) this.b;
                h9 h9Var = (h9) this.c;
                i9 i9Var = z8Var.d;
                b4 currentPeerView = i9Var.o0.getCurrentPeerView();
                if (currentPeerView == null || (e3Var = currentPeerView.M0) == null || (a4Var = i9Var.G0) == null || ((h9) a4Var.c) != h9Var) {
                    return;
                }
                e3Var.invalidate();
                return;
            case 17:
                gi.q qVar = (gi.q) this.b;
                String str = (String) this.c;
                ArrayList arrayList5 = qVar.f;
                while (true) {
                    if (r7 >= arrayList5.size()) {
                        i10 = -1;
                    } else if (TextUtils.equals(((c6) arrayList5.get(r7)).E, str)) {
                        i10 = r7;
                    } else {
                        r7++;
                    }
                }
                if (i10 >= 0) {
                    qVar.r.d(str.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 18:
                ((h2.j0) this.b).h((Typeface) this.c);
                return;
            case 19:
                h2.c cVar = (h2.c) this.b;
                Object apply = ((l2.t) this.c).apply(cVar.f);
                cVar.f = apply;
                h2.b bVar = new h2.b(cVar, apply, i12);
                h2.i0 i0Var = (h2.i0) cVar.c;
                if (i0Var.a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 20:
                h2.w wVar = (h2.w) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new androidx.mediarouter.app.f(wVar, i11), intentFilter);
                return;
            case 21:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                Context context2 = (Context) this.c;
                h2.w wVar2 = (h2.w) fVar.b;
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
                                            i11 = type != 9 ? 8 : 7;
                                        }
                                        i11 = 5;
                                    }
                                }
                                i11 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
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
                                    i11 = 4;
                                    break;
                                case 13:
                                    i11 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i11 = 6;
                                    break;
                                case 18:
                                    i11 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i11 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i11 = 1;
                        }
                    } catch (SecurityException unused2) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i11 != 5) {
                        wVar2.c(i11);
                        return;
                    } else {
                        h2.u.a(context2, wVar2);
                        return;
                    }
                }
                i11 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                wVar2.c(i11);
                return;
            case 22:
                m9.e0 e0Var = (m9.e0) this.b;
                m9.y yVar = (m9.y) this.c;
                if (e0Var.a instanceof m9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 23:
                h2.o0 o0Var2 = (h2.o0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                wf.b bVar2 = (wf.b) o0Var2.d;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new f6(24, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 24:
                wf.b bVar3 = (wf.b) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 25:
                ha.b bVar4 = (ha.b) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    o5.t.a().d.c(bVar4.h.a.b(l5.d.c), 1);
                } catch (Exception unused3) {
                }
                countDownLatch.countDown();
                return;
            case 26:
                hi.d dVar = (hi.d) this.b;
                org.telegram.ui.Cells.f fVar2 = (org.telegram.ui.Cells.f) this.c;
                int i15 = dVar.J - 1;
                dVar.J = i15;
                dVar.c(i15, true);
                if (dVar.J > 0) {
                    org.telegram.messenger.g0.i3(dVar.K, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    fVar2.run();
                    return;
                }
            case 27:
                ((z10) this.b).a((ArrayList) this.c);
                return;
            case 28:
                hi.r1 r1Var = (hi.r1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                hi.t1 t1Var = r1Var.s;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    hi.i2 i2Var = t1Var.r;
                    int i16 = hi.i2.C1;
                    np.s1(i2Var.a).Y3(tL_contacts_resolvedPeer.users, false);
                    np.s1(i2Var.a).S3(tL_contacts_resolvedPeer.chats, false);
                    vr.a0(i2Var.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                r1Var.n = true;
                r1Var.G();
                return;
            default:
                ((hi.n2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
        }
    }
}

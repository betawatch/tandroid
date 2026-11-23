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
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n80;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0365 A[Catch: all -> 0x02f0, TryCatch #0 {all -> 0x02f0, blocks: (B:166:0x02a8, B:168:0x02b6, B:170:0x02d6, B:172:0x02e1, B:174:0x02f6, B:176:0x02fc, B:179:0x034d, B:181:0x0365, B:182:0x036a, B:187:0x0320, B:189:0x0324), top: B:165:0x02a8 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        boolean z10;
        c3 c3Var;
        y3 y3Var;
        int i10;
        PowerManager.WakeLock wakeLock;
        int i11 = 3;
        String str = null;
        char c10 = 1;
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.b;
                String str2 = (String) this.c;
                m4Var.f = null;
                b5 b5Var = m4Var.h;
                b5Var.R = false;
                b5Var.P.c = str2.toLowerCase();
                b5.b(b5Var);
                return;
            case 1:
                y10 y10Var = (y10) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (y10Var != null) {
                    y10Var.a(Boolean.valueOf(tL_error == null));
                    return;
                }
                return;
            case 2:
                b6 b6Var = (b6) this.b;
                TLObject tLObject = (TLObject) this.c;
                e6 e6Var = b6Var.q;
                int i12 = b6Var.c;
                ArrayList arrayList = b6Var.i;
                b6Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    np.u1(i12).f4(tL_foundStories.users, false);
                    np.u1(i12).Z3(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList2 = tL_foundStories.stories;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList2.get(i13);
                        i13++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = org.telegram.messenger.n5.o(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList.size();
                        gj gjVar = new gj(i12, tL_foundStory2.storyItem);
                        gjVar.r0(false);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Integer.valueOf(arrayList.size()));
                        b6Var.F.add(arrayList3);
                        arrayList.add(gjVar);
                    }
                    b6Var.J = Math.max(arrayList.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        b6Var.J = arrayList.size();
                    }
                    if (arrayList.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    b6Var.H = str;
                    b6Var.G = false;
                    org.telegram.messenger.g0.r(e6Var);
                    org.telegram.messenger.g0.g3(e6Var);
                    return;
                }
                return;
            case 3:
                d6 d6Var = (d6) this.b;
                List list = (List) this.c;
                ArrayList arrayList4 = d6Var.h;
                arrayList4.clear();
                arrayList4.addAll(list);
                d6Var.d = true;
                d6Var.e = false;
                d6Var.d();
                ls.f(d6Var.a).k(ls.l3, Long.valueOf(d6Var.b), d6Var);
                return;
            case 4:
                d6 d6Var2 = (d6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList5 = d6Var2.g;
                ArrayList arrayList6 = d6Var2.h;
                if (!(tLObject2 instanceof TL_stories.TL_albums)) {
                    if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList6.clear();
                        arrayList6.addAll(arrayList5);
                        d6Var2.f = true;
                        d6Var2.e = false;
                        ls.f(d6Var2.a).k(ls.l3, Long.valueOf(d6Var2.b), d6Var2);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                ArrayList arrayList7 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList8 = tL_albums.albums;
                int size2 = arrayList8.size();
                int i14 = 0;
                while (i14 < size2) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i14);
                    i14++;
                    arrayList7.add(i6.a(tL_storyAlbum));
                }
                arrayList6.clear();
                arrayList6.addAll(arrayList7);
                arrayList5.clear();
                arrayList5.addAll(arrayList7);
                d6Var2.f = true;
                d6Var2.e = false;
                d6Var2.f(true);
                return;
            case 5:
                h6 h6Var = (h6) this.b;
                y10 y10Var2 = (y10) this.c;
                h6Var.getClass();
                y10Var2.a(h6Var);
                return;
            case 6:
                np.u1(((o6) this.b).N.a).R1().c0((TL_stories.TL_updateStory) this.c);
                return;
            case 7:
                o6 o6Var = (o6) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                hi.c7 c7Var = o6Var.c;
                c7Var.w = true;
                p6 p6Var = o6Var.N;
                if (p6Var.n(tL_error2)) {
                    c7Var.x = null;
                } else {
                    c7Var.x = tL_error2;
                }
                o6Var.d = true;
                o6Var.J = true;
                o6Var.I = true;
                p6Var.w.d(c7Var);
                return;
            case 8:
                o6 o6Var2 = (o6) this.b;
                o6Var2.c.c((File) this.c);
                org.telegram.messenger.g0.g3(new m6(o6Var2, r8));
                return;
            case 9:
                c7.a((c7) this.b, (p5) this.c);
                return;
            case 10:
                c7 c7Var2 = (c7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                ur urVar = c7Var2.b;
                SQLiteDatabase sQLiteDatabase = urVar.b;
                try {
                    long o4 = org.telegram.messenger.n5.o(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i15 = storyItem.id;
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            c7Var2.l(o4, storyItem);
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i15, new Object[0]);
                            boolean next = queryFinalized.next();
                            queryFinalized.dispose();
                            if (!next) {
                                i7 = 1;
                                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o4, new Object[0]);
                                if (queryFinalized2.next()) {
                                }
                                queryFinalized2.dispose();
                                Locale locale2 = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r8 + i7) + " WHERE dialog_id = " + o4).stepThis().dispose();
                                return;
                            }
                        }
                        i7 = 0;
                        SQLiteCursor queryFinalized22 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o4, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r8 + i7) + " WHERE dialog_id = " + o4).stepThis().dispose();
                        return;
                    }
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i15, new Object[0]);
                    if (queryFinalized3.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            c8.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
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
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i15).stepThis().dispose();
                    if (z10) {
                        i7 = -1;
                        SQLiteCursor queryFinalized222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o4, new Object[0]);
                        r8 = queryFinalized222.next() ? queryFinalized222.intValue(1) : 0;
                        queryFinalized222.dispose();
                        Locale locale222 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r8 + i7) + " WHERE dialog_id = " + o4).stepThis().dispose();
                        return;
                    }
                    i7 = 0;
                    SQLiteCursor queryFinalized2222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o4, new Object[0]);
                    if (queryFinalized2222.next()) {
                    }
                    queryFinalized2222.dispose();
                    Locale locale2222 = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r8 + i7) + " WHERE dialog_id = " + o4).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    urVar.o(th2, true);
                    return;
                }
            case 11:
                ((c7) this.b).j((ArrayList) this.c);
                return;
            case 12:
                c7 c7Var3 = (c7) this.b;
                p5 p5Var = (p5) this.c;
                ur urVar2 = c7Var3.b;
                SQLiteDatabase sQLiteDatabase2 = urVar2.b;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e10) {
                    urVar2.o(e10, true);
                }
                org.telegram.messenger.g0.g3(new l4(14, p5Var, longSparseIntArray));
                return;
            case 13:
                ((p5) this.b).a((TL_stories.TL_stories_allStories) this.c);
                return;
            case 14:
                ((p5) this.b).b.f = (LongSparseIntArray) this.c;
                return;
            case 15:
                f7 f7Var = (f7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (f7Var.b) {
                    return;
                }
                runnable.run();
                return;
            case 16:
                Runnable[] runnableArr = (Runnable[]) this.b;
                f7 f7Var2 = (f7) this.c;
                runnableArr[0] = null;
                ((l4) f7Var2.d).run();
                d7 d7Var = (d7) f7Var2.e;
                if (d7Var != null) {
                    d7Var.R();
                    return;
                }
                return;
            case 17:
                e7 e7Var = (e7) this.b;
                View view = (View) this.c;
                e7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                mc mcVar = e7Var.H;
                if (mcVar != null) {
                    mcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                e7Var.N = false;
                e7Var.e();
                return;
            case 18:
                v7 v7Var = (v7) this.b;
                n80 n80Var = (n80) this.c;
                n80 n80Var2 = v7Var.a;
                if (n80Var != n80Var2 || n80Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = n80Var2.i;
                if (characterStyle instanceof URLSpan) {
                    w7 w7Var = v7Var.v;
                    n2.o0 o0Var = v7Var.c;
                    Objects.requireNonNull(o0Var);
                    w7Var.K.H((URLSpan) characterStyle, w7Var, new f2.a(o0Var, 18));
                    v7Var.a = null;
                    return;
                }
                return;
            case 19:
                j8 j8Var = (j8) this.b;
                hi.l3 l3Var = (hi.l3) this.c;
                j8Var.d.removeView(l3Var);
                if (l3Var == j8Var.c) {
                    j8Var.b = null;
                    j8Var.invalidate();
                    j8Var.b(false);
                    return;
                }
                return;
            case 20:
                w8 w8Var = (w8) this.b;
                e9 e9Var = (e9) this.c;
                f9 f9Var = w8Var.d;
                z3 currentPeerView = f9Var.o0.getCurrentPeerView();
                if (currentPeerView == null || (c3Var = currentPeerView.M0) == null || (y3Var = f9Var.G0) == null || ((e9) y3Var.c) != e9Var) {
                    return;
                }
                c3Var.invalidate();
                return;
            case 21:
                gi.q qVar = (gi.q) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList9 = qVar.f;
                while (true) {
                    if (r8 >= arrayList9.size()) {
                        i10 = -1;
                    } else if (TextUtils.equals(((a6) arrayList9.get(r8)).E, str3)) {
                        i10 = r8;
                    } else {
                        r8++;
                    }
                }
                if (i10 >= 0) {
                    qVar.r.e(str3.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 22:
                ((h2.j0) this.b).h((Typeface) this.c);
                return;
            case 23:
                h2.c cVar = (h2.c) this.b;
                Object apply = ((l2.t) this.c).apply(cVar.f);
                cVar.f = apply;
                h2.b bVar = new h2.b(cVar, apply, c10 == true ? 1 : 0);
                h2.i0 i0Var = (h2.i0) cVar.c;
                if (i0Var.a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 24:
                h2.w wVar = (h2.w) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new androidx.mediarouter.app.f(wVar, i11), intentFilter);
                return;
            case 25:
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
            case 26:
                m9.e0 e0Var = (m9.e0) this.b;
                m9.y yVar = (m9.y) this.c;
                if (e0Var.a instanceof m9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 27:
                h2.o0 o0Var2 = (h2.o0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                wf.b bVar2 = (wf.b) o0Var2.d;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new l4(28, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 28:
                wf.b bVar3 = (wf.b) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            default:
                ha.b bVar4 = (ha.b) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    o5.s.a().d.c(bVar4.h.a.b(l5.d.c), 1);
                } catch (Exception unused3) {
                }
                countDownLatch.countDown();
                return;
        }
    }
}

package di;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import fi.ha;
import fi.oa;
import fi.qa;
import fi.ua;
import fi.va;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.c20;
import org.telegram.messenger.gc;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.yr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x025c A[Catch: all -> 0x01e7, TryCatch #1 {all -> 0x01e7, blocks: (B:100:0x019d, B:103:0x01ad, B:105:0x01cd, B:107:0x01d8, B:109:0x01ed, B:111:0x01f3, B:114:0x0244, B:116:0x025c, B:117:0x0261, B:122:0x0217, B:124:0x021b), top: B:99:0x019d }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ua uaVar;
        p9 p9Var;
        int i7;
        boolean z9;
        j3 j3Var;
        i4 i4Var;
        int i10;
        String str = null;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    qs.f(g1Var.e).k(qs.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 1:
                ((g1) this.b).F.remove((String) this.c);
                return;
            case 2:
                j4 j4Var = (j4) this.b;
                fi.m3 m3Var = (fi.m3) this.c;
                j4Var.removeView(m3Var);
                if (j4Var.M1 == m3Var) {
                    j4Var.M1 = null;
                    return;
                }
                return;
            case 3:
                j4 j4Var2 = (j4) this.b;
                va D = va.D((Activity) this.c, j4Var2.l2);
                i4 i4Var2 = j4Var2.v2;
                long j3 = (i4Var2 == null || (p9Var = (p9) i4Var2.c) == null) ? 0L : p9Var.currentPosition;
                File h = j4Var2.x1.h();
                TL_stories.StoryItem storyItem = j4Var2.x1.a;
                fi.e7 e7Var = new fi.e7();
                e7Var.n = true;
                e7Var.t = storyItem.media;
                int i12 = e7Var.a;
                e7Var.q = qp.s1(i12).z1(storyItem.dialogId);
                e7Var.r = storyItem.id;
                e7Var.s = storyItem.caption;
                e7Var.L = h;
                e7Var.M = false;
                e7Var.k0 = 720;
                e7Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    e7Var.K = false;
                    if (h != null) {
                        e7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    e7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i13);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    e7Var.k0 = documentAttribute.w;
                                    e7Var.l0 = documentAttribute.h;
                                    e7Var.i = documentAttribute.duration;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            e7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i14 = 0; i14 < storyItem.media.document.thumbs.size(); i14++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i14);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    e7Var.O = gc.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i12);
                                    File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        e7Var.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                e7Var.A();
                e7Var.e(storyItem);
                oa d = qa.d(j4Var2.s0);
                RectF rectF = D.H;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i15 = D.c;
                if (!D.d) {
                    if (qp.s1(i15).v2()) {
                        org.telegram.ui.b.b(i15);
                    } else {
                        D.u0 = false;
                        D.e = false;
                        D.B2 = false;
                        if (windowManager != null && (uaVar = D.n) != null && uaVar.getParent() == null) {
                            org.telegram.messenger.g0.y3(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.K1 = e7Var;
                        fi.t8.a(i15, e7Var);
                        fi.e7 e7Var2 = D.K1;
                        D.O1 = (e7Var2 == null || !e7Var2.K) ? 0 : 1;
                        D.s0.g = false;
                        if (d != null) {
                            D.F = d;
                            D.J = d.a;
                            rectF.set(d.c);
                            D.G = d.b;
                            D.F.e();
                        } else {
                            D.J = 0;
                            float L = org.telegram.messenger.g0.L(100.0f);
                            Point point = org.telegram.messenger.g0.q;
                            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
                            D.G = org.telegram.messenger.g0.L(8.0f);
                        }
                        D.r.c();
                        ha haVar = D.h0;
                        int i16 = D.J;
                        haVar.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
                        D.r.setTranslationX(0.0f);
                        D.r.setTranslationY(0.0f);
                        D.r.b(0.0f);
                        D.r.setScaleX(1.0f);
                        D.r.setScaleY(1.0f);
                        D.K = 0.0f;
                        org.telegram.messenger.g0.g2(D.b);
                        fi.e7 e7Var3 = D.K1;
                        if (e7Var3 != null) {
                            D.c1.setText(e7Var3.C0);
                        }
                        D.K(new fi.u8(D, 7), j3);
                        D.b1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.v0 = 0L;
                        D.w0 = "";
                    }
                }
                D.Q = new w1(j4Var2, 12);
                D.R = new b2(r7, j4Var2, D);
                return;
            case 4:
                a4 a4Var = (a4) this.b;
                q9 q9Var = (q9) this.c;
                a4Var.getClass();
                ((h9) a4Var.x.z1).h(new ug.w0(q9Var.f, 14, false));
                return;
            case 5:
                w4 w4Var = (w4) this.b;
                String str3 = (String) this.c;
                w4Var.f = null;
                l5 l5Var = w4Var.h;
                l5Var.Q = false;
                l5Var.O.c = str3.toLowerCase();
                l5.b(l5Var);
                return;
            case 6:
                c20 c20Var = (c20) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (c20Var != null) {
                    c20Var.a(Boolean.valueOf(tL_error == null));
                    return;
                }
                return;
            case 7:
                l6 l6Var = (l6) this.b;
                TLObject tLObject = (TLObject) this.c;
                o6 o6Var = l6Var.q;
                int i17 = l6Var.c;
                ArrayList arrayList2 = l6Var.i;
                l6Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    qp.s1(i17).Y3(tL_foundStories.users, false);
                    qp.s1(i17).S3(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList3 = tL_foundStories.stories;
                    int size2 = arrayList3.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList3.get(i18);
                        i18++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = org.telegram.messenger.m5.o(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList2.size();
                        ij ijVar = new ij(i17, tL_foundStory2.storyItem);
                        ijVar.r0(false);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(Integer.valueOf(arrayList2.size()));
                        l6Var.F.add(arrayList4);
                        arrayList2.add(ijVar);
                    }
                    l6Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        l6Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    l6Var.H = str;
                    l6Var.G = false;
                    org.telegram.messenger.g0.r(o6Var);
                    org.telegram.messenger.g0.h3(o6Var);
                    return;
                }
                return;
            case 8:
                n6 n6Var = (n6) this.b;
                List list = (List) this.c;
                ArrayList arrayList5 = n6Var.h;
                arrayList5.clear();
                arrayList5.addAll(list);
                n6Var.d = true;
                n6Var.e = false;
                n6Var.d();
                qs.f(n6Var.a).k(qs.j3, Long.valueOf(n6Var.b), n6Var);
                return;
            case 9:
                n6 n6Var2 = (n6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList6 = n6Var2.g;
                ArrayList arrayList7 = n6Var2.h;
                if (!(tLObject2 instanceof TL_stories.TL_albums)) {
                    if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                        n6Var2.f = true;
                        n6Var2.e = false;
                        qs.f(n6Var2.a).k(qs.j3, Long.valueOf(n6Var2.b), n6Var2);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                int size3 = arrayList9.size();
                int i19 = 0;
                while (i19 < size3) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i19);
                    i19++;
                    arrayList8.add(s6.a(tL_storyAlbum));
                }
                arrayList7.clear();
                arrayList7.addAll(arrayList8);
                arrayList6.clear();
                arrayList6.addAll(arrayList8);
                n6Var2.f = true;
                n6Var2.e = false;
                n6Var2.f(true);
                return;
            case 10:
                r6 r6Var = (r6) this.b;
                c20 c20Var2 = (c20) this.c;
                r6Var.getClass();
                c20Var2.a(r6Var);
                return;
            case 11:
                qp.s1(((y6) this.b).M.a).P1().c0((TL_stories.TL_updateStory) this.c);
                return;
            case 12:
                y6 y6Var = (y6) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                fi.e7 e7Var4 = y6Var.c;
                e7Var4.w = true;
                z6 z6Var = y6Var.M;
                if (z6Var.n(tL_error2)) {
                    e7Var4.x = null;
                } else {
                    e7Var4.x = tL_error2;
                }
                y6Var.d = true;
                y6Var.I = true;
                y6Var.H = true;
                z6Var.w.d(e7Var4);
                return;
            case 13:
                y6 y6Var2 = (y6) this.b;
                y6Var2.c.c((File) this.c);
                org.telegram.messenger.g0.h3(new w6(y6Var2, r7));
                return;
            case 14:
                m7.a((m7) this.b, (z5) this.c);
                return;
            case 15:
                m7 m7Var = (m7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                yr yrVar = m7Var.b;
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                try {
                    long o4 = org.telegram.messenger.m5.o(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i20 = storyItem2.id;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            m7Var.l(o4, storyItem2);
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i20, new Object[0]);
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
                    SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i20, new Object[0]);
                    if (queryFinalized3.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            n8.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                            byteBufferValue.reuse();
                        }
                        if (byteBufferValue2 != null) {
                            byteBufferValue2.reuse();
                        }
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    queryFinalized3.dispose();
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + o4 + " AND story_id = " + i20).stepThis().dispose();
                    if (z9) {
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
                    yrVar.o(th2, true);
                    return;
                }
            case 16:
                ((m7) this.b).j((ArrayList) this.c);
                return;
            case 17:
                m7 m7Var2 = (m7) this.b;
                z5 z5Var = (z5) this.c;
                yr yrVar2 = m7Var2.b;
                SQLiteDatabase sQLiteDatabase2 = yrVar2.b;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e10) {
                    yrVar2.o(e10, true);
                }
                org.telegram.messenger.g0.h3(new z0(19, z5Var, longSparseIntArray));
                return;
            case 18:
                ((z5) this.b).a((TL_stories.TL_stories_allStories) this.c);
                return;
            case 19:
                ((z5) this.b).b.f = (LongSparseIntArray) this.c;
                return;
            case 20:
                p7 p7Var = (p7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (p7Var.b) {
                    return;
                }
                runnable.run();
                return;
            case 21:
                Runnable[] runnableArr = (Runnable[]) this.b;
                p7 p7Var2 = (p7) this.c;
                runnableArr[0] = null;
                ((z0) p7Var2.d).run();
                n7 n7Var = (n7) p7Var2.e;
                if (n7Var != null) {
                    n7Var.R();
                    return;
                }
                return;
            case 22:
                o7 o7Var = (o7) this.b;
                View view = (View) this.c;
                o7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ic icVar = o7Var.H;
                if (icVar != null) {
                    icVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                o7Var.N = false;
                o7Var.e();
                return;
            case 23:
                g8 g8Var = (g8) this.b;
                y70 y70Var = (y70) this.c;
                y70 y70Var2 = g8Var.a;
                if (y70Var != y70Var2 || y70Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = y70Var2.i;
                if (characterStyle instanceof URLSpan) {
                    h8 h8Var = g8Var.v;
                    n2.n0 n0Var = g8Var.c;
                    Objects.requireNonNull(n0Var);
                    h8Var.J.H((URLSpan) characterStyle, h8Var, new f8(n0Var, r7));
                    g8Var.a = null;
                    return;
                }
                return;
            case 24:
                u8 u8Var = (u8) this.b;
                fi.m3 m3Var2 = (fi.m3) this.c;
                u8Var.d.removeView(m3Var2);
                if (m3Var2 == u8Var.c) {
                    u8Var.b = null;
                    u8Var.invalidate();
                    u8Var.b(false);
                    return;
                }
                return;
            case 25:
                h9 h9Var = (h9) this.b;
                p9 p9Var2 = (p9) this.c;
                q9 q9Var2 = h9Var.d;
                j4 currentPeerView = q9Var2.n0.getCurrentPeerView();
                if (currentPeerView == null || (j3Var = currentPeerView.L0) == null || (i4Var = q9Var2.F0) == null || ((p9) i4Var.c) != p9Var2) {
                    return;
                }
                j3Var.invalidate();
                return;
            case 26:
                ((v0.g) this.b).a((w0.d) this.c);
                return;
            case 27:
                ((v0.g) this.b).onResult((v0.f) this.c);
                return;
            case 28:
                e1.d dVar = (e1.d) this.b;
                v0.c cVar = (v0.c) this.c;
                v0.g gVar = dVar.f;
                if (gVar != null) {
                    gVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            default:
                ei.r rVar = (ei.r) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList10 = rVar.f;
                while (true) {
                    if (r7 >= arrayList10.size()) {
                        i10 = -1;
                    } else if (TextUtils.equals(((k6) arrayList10.get(r7)).E, str4)) {
                        i10 = r7;
                    } else {
                        r7++;
                    }
                }
                if (i10 >= 0) {
                    rVar.r.d(str4.hashCode(), i10 + 1);
                    return;
                }
                return;
        }
    }
}

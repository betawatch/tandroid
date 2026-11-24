// default package

import android.content.ClipboardManager;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iya implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iya(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032c A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:158:0x0273, B:161:0x0283, B:163:0x02a3, B:165:0x02ad, B:167:0x02bd, B:169:0x02c3, B:172:0x0314, B:174:0x032c, B:175:0x0330, B:180:0x02e7, B:182:0x02eb), top: B:157:0x0273 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Uri build;
        int i;
        Object[] objArr;
        Runnable runnable;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        long j;
        o64 o64Var;
        byte b = this.a;
        int i2 = 4;
        String str = null;
        byte b2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hya hyaVar = (hya) obj;
                pj4 pj4Var = (pj4) ((cv8) ((v39) obj2).b).f;
                pj4Var.getClass();
                se5 se5Var = (se5) pj4Var.b;
                gre.p(se5Var.k);
                mm5 mm5Var = hyaVar.e;
                HashSet hashSet = se5Var.h;
                km5 listIterator = mm5Var.listIterator(0);
                while (listIterator.hasNext()) {
                    fya fyaVar = (fya) listIterator.next();
                    Object obj3 = fyaVar.a;
                    gya gyaVar = fyaVar.c;
                    String str2 = fyaVar.b;
                    if (hashSet.contains(obj3) && !hashSet.contains(str2)) {
                        jm5 jm5Var = new jm5(i2);
                        jm5 jm5Var2 = new jm5(i2);
                        mm5 mm5Var2 = se5Var.d;
                        qm5 qm5Var = gyaVar.c;
                        int size = mm5Var2.size();
                        int i3 = b2;
                        while (i3 < size) {
                            Object obj4 = mm5Var2.get(i3);
                            i3++;
                            of5 of5Var = (of5) obj4;
                            Uri uri = (Uri) of5Var.b.get(obj3);
                            String str3 = of5Var.a.b;
                            uri.getClass();
                            if (qm5Var.containsKey(str3)) {
                                build = (Uri) qm5Var.get(str3);
                                build.getClass();
                            } else {
                                build = se5.b(uri, gyaVar).build();
                            }
                            if (build != null) {
                                jm5Var.c(build);
                                jm5Var2.c(uri);
                            }
                        }
                        se5.d(fyaVar, se5Var.e, jm5Var, jm5Var2);
                        se5.d(fyaVar, se5Var.f, jm5Var, jm5Var2);
                        se5.d(fyaVar, se5Var.g, jm5Var, jm5Var2);
                        hashSet.add(str2);
                        i4d i4dVar = se5Var.b;
                        w59 f = jm5Var.f();
                        w59 f2 = jm5Var2.f();
                        HashMap hashMap = ((ta3) i4dVar.a).d;
                        gre.p(f.d == f2.d);
                        for (int i4 = 0; i4 < f.d; i4++) {
                            sa3 sa3Var = (sa3) hashMap.get(f2.get(i4));
                            sa3Var.getClass();
                            Uri uri2 = (Uri) f.get(i4);
                            sa3Var.a.b.put(str2, uri2);
                            HashMap hashMap2 = sa3Var.b;
                            ra3 ra3Var = (ra3) hashMap2.get(uri2);
                            if (ra3Var == null) {
                                hashMap2.put(uri2, new ra3(sa3Var.d, uri2, str2));
                            } else {
                                ra3Var.b.add(str2);
                            }
                            hashMap.put(uri2, sa3Var);
                        }
                        i2 = 4;
                        b2 = 0;
                    }
                }
                se5Var.m = hyaVar.d;
                se5Var.e(-9223372036854775807L);
                break;
            case 1:
                mza mzaVar = (mza) obj2;
                mzaVar.H = false;
                jza[] jzaVarArr = (jza[]) ((ArrayList) obj).toArray(new jza[0]);
                mzaVar.I = jzaVarArr;
                if (jzaVarArr.length > 0) {
                    mzaVar.c0.setScaleX(0.3f);
                    mzaVar.c0.setScaleY(0.3f);
                    mzaVar.c0.setAlpha(0.0f);
                    mzaVar.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(s33.f).start();
                    break;
                }
                break;
            case 2:
                rza rzaVar = (rza) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                if (rzaVar.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rzaVar.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        rzaVar.d(rzaVar.r, rzaVar.f, rzaVar.s);
                        break;
                    }
                }
                break;
            case 3:
                ((StickersActivity) obj2).q0((rza) obj);
                break;
            case 4:
                kk7 f3 = kk7.f(y6c.t0);
                Boolean bool = Boolean.FALSE;
                f3.m(kk7.t3, bool, (TLObject) obj2, (TLRPC.Document) obj, null, bool);
                break;
            case 5:
                gv1 gv1Var = (gv1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (gv1Var != null) {
                    gv1Var.a(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 6:
                t1b t1bVar = (t1b) obj2;
                TLObject tLObject = (TLObject) obj;
                v1b v1bVar = t1bVar.q;
                int i5 = t1bVar.c;
                ArrayList arrayList = t1bVar.i;
                t1bVar.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    na7.q1(i5).a4(tL_foundStories.users, false);
                    na7.q1(i5).U3(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList2 = tL_foundStories.stories;
                    int size2 = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList2.get(i6);
                        i6++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = cf3.n(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList.size();
                        k27 k27Var = new k27(i5, tL_foundStory2.storyItem);
                        k27Var.r0(false);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Integer.valueOf(arrayList.size()));
                        t1bVar.F.add(arrayList3);
                        arrayList.add(k27Var);
                    }
                    t1bVar.J = Math.max(arrayList.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        t1bVar.J = arrayList.size();
                    }
                    if (arrayList.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    t1bVar.H = str;
                    t1bVar.G = false;
                    gl.r(v1bVar);
                    gl.d3(v1bVar);
                    break;
                }
                break;
            case 7:
                u1b u1bVar = (u1b) obj2;
                ArrayList arrayList4 = u1bVar.h;
                arrayList4.clear();
                arrayList4.addAll((List) obj);
                u1bVar.d = true;
                u1bVar.e = false;
                u1bVar.d();
                kk7.f(u1bVar.a).k(kk7.k3, Long.valueOf(u1bVar.b), u1bVar);
                break;
            case 8:
                u1b u1bVar2 = (u1b) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList5 = u1bVar2.g;
                ArrayList arrayList6 = u1bVar2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList7 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList8 = tL_albums.albums;
                    int size3 = arrayList8.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i7);
                        i7++;
                        arrayList7.add(z1b.a(tL_storyAlbum));
                    }
                    arrayList6.clear();
                    arrayList6.addAll(arrayList7);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList7);
                    u1bVar2.f = true;
                    u1bVar2.e = false;
                    u1bVar2.f(true);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    u1bVar2.f = true;
                    u1bVar2.e = false;
                    kk7.f(u1bVar2.a).k(kk7.k3, Long.valueOf(u1bVar2.b), u1bVar2);
                    break;
                }
                break;
            case 9:
                ((p8c) obj).a((y1b) obj2);
                break;
            case 10:
                na7.q1(((f2b) obj2).N.a).M1().b0((TL_stories.TL_updateStory) obj);
                break;
            case 11:
                f2b f2bVar = (f2b) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                f4b f4bVar = f2bVar.c;
                f4bVar.w = true;
                g2b g2bVar = f2bVar.N;
                if (g2bVar.m(tL_error2)) {
                    f4bVar.x = null;
                } else {
                    f4bVar.x = tL_error2;
                }
                f2bVar.d = true;
                f2bVar.J = true;
                f2bVar.I = true;
                g2bVar.w.d(f4bVar);
                break;
            case 12:
                f2b f2bVar2 = (f2b) obj2;
                f2bVar2.c.c((File) obj);
                gl.d3(new c2b(f2bVar2, b2));
                break;
            case 13:
                ((s2b) obj2).f((l1b) obj);
                break;
            case 14:
                s2b s2bVar = (s2b) obj2;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj;
                ad7 ad7Var = s2bVar.b;
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                try {
                    long n = cf3.n(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i8 = storyItem.id;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + n + " AND story_id = " + i8, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                z3b.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                                byteBufferValue.reuse();
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        queryFinalized.dispose();
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + n + " AND story_id = " + i8).stepThis().dispose();
                        if (objArr != false) {
                            i = -1;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                            int intValue = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (intValue + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                            break;
                        }
                        i = 0;
                        SQLiteCursor queryFinalized22 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (intValue + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                    } else {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            s2bVar.l(n, storyItem);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + n + " AND story_id = " + i8, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i = 1;
                                SQLiteCursor queryFinalized222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (intValue + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                            }
                        }
                        i = 0;
                        SQLiteCursor queryFinalized2222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (intValue + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                    }
                } catch (Throwable th) {
                    ad7Var.n(th, true);
                    return;
                }
            case 15:
                ((s2b) obj2).j((ArrayList) obj);
                break;
            case 16:
                l1b l1bVar = (l1b) obj;
                ad7 ad7Var2 = ((s2b) obj2).b;
                SQLiteDatabase sQLiteDatabase2 = ad7Var2.b;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e) {
                    ad7Var2.n(e, true);
                }
                gl.d3(new iya(l1bVar, longSparseIntArray, (byte) 18));
                break;
            case 17:
                ((l1b) obj2).a((TL_stories.TL_stories_allStories) obj);
                break;
            case 18:
                ((l1b) obj2).a((LongSparseIntArray) obj);
                break;
            case 19:
                Runnable runnable2 = (Runnable) obj;
                if (!((ev0) obj2).b) {
                    runnable2.run();
                    break;
                }
                break;
            case 20:
                ev0 ev0Var = (ev0) obj;
                ((Runnable[]) obj2)[0] = null;
                ((iya) ev0Var.d).run();
                t2b t2bVar = (t2b) ev0Var.e;
                if (t2bVar != null) {
                    t2bVar.K();
                    break;
                }
                break;
            case 21:
                u2b u2bVar = (u2b) obj2;
                View view = (View) obj;
                u2bVar.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                n41 n41Var = u2bVar.H;
                if (n41Var != null) {
                    n41Var.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                u2bVar.N = false;
                u2bVar.e();
                break;
            case 22:
                i3b i3bVar = (i3b) obj2;
                m46 m46Var = (m46) obj;
                m46 m46Var2 = i3bVar.a;
                if (m46Var == m46Var2 && m46Var2 != null) {
                    CharacterStyle characterStyle = m46Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        j3b j3bVar = i3bVar.v;
                        i46 i46Var = i3bVar.c;
                        Objects.requireNonNull(i46Var);
                        j3bVar.K.H((URLSpan) characterStyle, j3bVar, new kya((Object) i46Var, (byte) 10));
                        i3bVar.a = null;
                        break;
                    }
                }
                break;
            case 23:
                u3b u3bVar = (u3b) obj2;
                xl3 xl3Var = (xl3) obj;
                if (xl3Var != null) {
                    u3b.z = u3bVar.b;
                    u3b.A = xl3Var;
                }
                if (!u3bVar.h) {
                    u3bVar.f = xl3Var;
                    if (xl3Var != null && (runnable = u3bVar.e) != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 24:
                f4b f4bVar2 = (f4b) obj2;
                TLObject tLObject3 = (TLObject) obj;
                f4bVar2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    f4bVar2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
                    for (int i9 = 0; i9 < vector.objects.size(); i9++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i9);
                        TLRPC.Document document2 = stickerSetCovered.cover;
                        if (document2 == null && !stickerSetCovered.covers.isEmpty()) {
                            document2 = stickerSetCovered.covers.get(0);
                        }
                        if (document2 == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document2 = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document2 != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            f4bVar2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 25:
                t4b t4bVar = (t4b) obj2;
                TLObject tLObject4 = (TLObject) obj;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    na7.q1(t4bVar.a).a4(webpagepreview.users, false);
                    na7.q1(t4bVar.a).U3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            t4bVar.b2 = webPage;
                            if (t4b.b1(webPage)) {
                                TLRPC.WebPage webPage2 = t4bVar.b2;
                                j = webPage2 == null ? 0L : webPage2.id;
                                t4bVar.a2 = j;
                                t4bVar.b2 = null;
                                t4bVar.c2 = j != 0;
                                o64Var = t4bVar.S1;
                                if (o64Var != null) {
                                    o64Var.O(true);
                                    break;
                                }
                            } else {
                                t4bVar.a2 = 0L;
                            }
                        } else {
                            t4bVar.b2 = null;
                            t4bVar.a2 = 0L;
                        }
                        j = 0;
                        t4bVar.c2 = j != 0;
                        o64Var = t4bVar.S1;
                        if (o64Var != null) {
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                j = 0;
                t4bVar.c2 = j != 0;
                o64Var = t4bVar.S1;
                if (o64Var != null) {
                }
                break;
            case 26:
                t4b t4bVar2 = (t4b) obj2;
                TextView textView = (TextView) obj;
                ClipboardManager clipboardManager = (ClipboardManager) t4bVar2.getContext().getSystemService("clipboard");
                ht3 ht3Var = t4bVar2.T1.d;
                boolean z = (TextUtils.isEmpty(ht3Var.getText()) || TextUtils.equals(ht3Var.getText(), "https://") || TextUtils.isEmpty(ht3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                ug8.t(textView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f), s33.h, 300L);
                break;
            case 27:
                w4b w4bVar = (w4b) obj2;
                je5 je5Var = (je5) obj;
                w4bVar.d.removeView(je5Var);
                if (je5Var == w4bVar.c) {
                    w4bVar.b = null;
                    w4bVar.invalidate();
                    w4bVar.b(false);
                    break;
                }
                break;
            case 28:
                y5b y5bVar = (y5b) obj2;
                HashMap f0 = ((ad7) obj).f0();
                if (!f0.isEmpty()) {
                    gl.d3(new iya(y5bVar, f0, (byte) 29));
                    break;
                }
                break;
            default:
                y5b y5bVar2 = (y5b) obj2;
                HashMap hashMap3 = (HashMap) obj;
                HashMap hashMap4 = y5bVar2.J1;
                if (hashMap4 == null) {
                    hashMap4 = new HashMap();
                    y5bVar2.J1 = hashMap4;
                }
                hashMap4.putAll(hashMap3);
                break;
        }
    }
}

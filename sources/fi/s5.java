package fi;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import hi.sa;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.l31;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s5(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        gj gjVar;
        int e12;
        int[] iArr;
        File file;
        int i7;
        boolean contains;
        SQLiteCursor sQLiteCursor;
        int i10;
        ArrayList arrayList;
        Pair pair = null;
        SQLiteCursor sQLiteCursor2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        int i11 = 1;
        switch (this.a) {
            case 0:
                s6 s6Var = (s6) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i12 = s6Var.a;
                s6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    s6Var.S = null;
                    ns.f(i12).k(ns.b3, new Object[0]);
                    return;
                } else if (!(tLObject instanceof TL_stories.canSendStoryCount)) {
                    s6Var.n(tL_error);
                    return;
                } else {
                    s6Var.S = new m6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    ns.f(i12).k(ns.b3, new Object[0]);
                    return;
                }
            case 1:
                c6 c6Var = (c6) this.b;
                b6 b6Var = (b6) this.c;
                org.telegram.messenger.d3 d3Var = (org.telegram.messenger.d3) this.d;
                ArrayList arrayList2 = c6Var.i;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    gj gjVar2 = (gj) arrayList2.get(i13);
                    if (gjVar2 != null && (storyItem = gjVar2.l) != null && (messageMedia = storyItem.media) != null) {
                        TLRPC.MessageMedia messageMedia2 = b6Var.media;
                        TLRPC.Document document = messageMedia2.document;
                        if (document != null) {
                            TLRPC.Document document2 = messageMedia.document;
                            if (document2 == null) {
                                continue;
                            } else if (document2.id == document.id) {
                                d3Var.a((b6) storyItem);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia2.photo;
                        if (photo2 != null && (photo = messageMedia.photo) != null && photo.id == photo2.id) {
                            d3Var.a((b6) storyItem);
                            return;
                        }
                    }
                }
                d3Var.a(null);
                return;
            case 2:
                c6 c6Var2 = (c6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                h6 h6Var = c6Var2.q;
                ArrayList arrayList3 = c6Var2.G;
                ArrayList arrayList4 = c6Var2.i;
                ArrayList arrayList5 = c6Var2.H;
                c6Var2.F = 0;
                c6Var2.C = false;
                c6Var2.D = true;
                c6Var2.r = true;
                ArrayList arrayList6 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList7 = ((Vector) tLObject2).objects;
                    int size = arrayList7.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList7.get(i14);
                        i14++;
                        arrayList6.add((TL_bots.botPreviewMedia) obj);
                    }
                } else {
                    if (!(tLObject2 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList3.clear();
                    arrayList3.addAll(previewinfo.lang_codes);
                    arrayList6.addAll(previewinfo.media);
                }
                ArrayList arrayList8 = new ArrayList(arrayList4);
                arrayList4.clear();
                arrayList5.clear();
                int size2 = arrayList6.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList6.get(i15);
                    i15++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList9 = arrayList6;
                    gj gjVar3 = new gj(c6Var2.c, new b6(c6Var2, c6Var2.d, botpreviewmedia));
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList8.size()) {
                            gjVar = null;
                        } else if (np.t0(((gj) arrayList8.get(i16)).l.media, botpreviewmedia.media)) {
                            gjVar = (gj) arrayList8.get(i16);
                        } else {
                            i16++;
                        }
                    }
                    TL_stories.StoryItem storyItem2 = gjVar3.l;
                    TLRPC.Message message = gjVar3.k;
                    if (gjVar == null) {
                        e12 = c6Var2.I;
                        c6Var2.I = e12 + 1;
                    } else {
                        e12 = gjVar.e1();
                    }
                    message.id = e12;
                    storyItem2.id = e12;
                    gjVar3.j = c6Var2;
                    gjVar3.r0(false);
                    if (arrayList5.isEmpty()) {
                        arrayList5.add(new ArrayList());
                    }
                    ((ArrayList) arrayList5.get(0)).add(Integer.valueOf(gjVar3.e1()));
                    arrayList4.add(gjVar3);
                    arrayList6 = arrayList9;
                }
                org.telegram.messenger.g0.r(h6Var);
                org.telegram.messenger.g0.h3(h6Var);
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
            case 3:
                z8 z8Var = (z8) this.b;
                k6 k6Var = (k6) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                i9 i9Var = z8Var.d;
                i9Var.o0.D(i9Var.h, k6Var.d, arrayList10);
                return;
            case 4:
                r9 r9Var = (r9) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                c1 c1Var = r9Var.f;
                int i17 = r9Var.b;
                r9.g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    np.s1(i17).Y3(tL_stories_storyViews.users, false);
                    if (!r9Var.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        r9Var.d = 0;
                        r9Var.e = false;
                        return;
                    }
                    ns.f(i17).k(ns.v5, new Object[0]);
                }
                r9Var.d = 0;
                if (r9Var.e) {
                    org.telegram.messenger.g0.r(c1Var);
                    org.telegram.messenger.g0.i3(c1Var, 10000L);
                    return;
                }
                return;
            case 5:
                m9.y yVar = (m9.y) this.b;
                m9.e0 e0Var = (m9.e0) this.c;
                try {
                    try {
                        e0Var.o(((m9.q) this.d).apply(c8.r9.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 6:
                m9.e0 e0Var2 = (m9.e0) this.b;
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) this.c;
                p4.m1 m1Var = (p4.m1) this.d;
                try {
                    if (e0Var2.a instanceof m9.a) {
                        return;
                    }
                    e1Var.run();
                    e0Var2.m(m1Var);
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 7:
                hi.x1 x1Var = (hi.x1) this.b;
                String str = (String) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList11 = x1Var.w;
                hi.y1 y1Var = x1Var.O;
                ArrayList arrayList12 = x1Var.s;
                if (TextUtils.equals(str, x1Var.I)) {
                    x1Var.y = 0;
                    arrayList12.clear();
                    arrayList11.clear();
                    x1Var.E.clear();
                    x1Var.n.clear();
                    x1Var.y++;
                    arrayList12.add(null);
                    arrayList11.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList12.addAll(tL_messages_stickers.stickers);
                        x1Var.y = tL_messages_stickers.stickers.size() + x1Var.y;
                    }
                    x1Var.J = x1Var.I;
                    x1Var.f();
                    hi.o1.z1(y1Var.b, 0, 0);
                    y1Var.f.c(false);
                    y1Var.e.n(false);
                    return;
                }
                return;
            case 8:
                hi.z2 z2Var = (hi.z2) this.b;
                Object obj3 = this.c;
                String str2 = (String) this.d;
                float f10 = z2Var.L;
                if (obj3 != null) {
                    int min = (int) Math.min(org.telegram.messenger.g0.q.x / 3.0f, org.telegram.messenger.g0.L(330.0f));
                    if (obj3 instanceof ff) {
                        ff ffVar = (ff) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        z2Var.c(ffVar, options);
                        hi.d7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = z2Var.c(ffVar, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f10) {
                            if (ffVar.T == 0 && ffVar.U == 0 && !c10.isRecycled()) {
                                iArr2 = c8.h0.b(c10, true);
                                ffVar.T = iArr2[0];
                                ffVar.U = iArr2[1];
                            } else {
                                int i18 = ffVar.T;
                                if (i18 != 0 && (i7 = ffVar.U) != 0) {
                                    iArr2 = new int[]{i18, i7};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c10;
                    } else if (!(obj3 instanceof hi.d7) || (file = ((hi.d7) obj3).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        hi.d7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                org.telegram.messenger.g0.h3(new s5(z2Var, str2, pair, 9));
                return;
            case 9:
                hi.z2 z2Var2 = (hi.z2) this.b;
                String str3 = (String) this.c;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr3 = (int[]) pair2.second;
                Paint paint = z2Var2.d;
                if (bitmap == null) {
                    return;
                }
                if (str3 != null) {
                    hi.z2.g0.put(str3, bitmap);
                    HashMap hashMap = hi.z2.f0;
                    Integer num = (Integer) hashMap.get(str3);
                    if (num != null) {
                        hashMap.put(str3, Integer.valueOf(num.intValue() + 1));
                    } else {
                        hashMap.put(str3, 1);
                    }
                }
                if (!TextUtils.equals(str3, z2Var2.S)) {
                    hi.z2.d(str3);
                    return;
                }
                z2Var2.a = bitmap;
                if (iArr3 == null) {
                    paint.setShader(null);
                    z2Var2.e = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    z2Var2.e = linearGradient;
                    paint.setShader(linearGradient);
                }
                z2Var2.h();
                z2Var2.invalidate();
                return;
            case 10:
                hi.c3 c3Var = (hi.c3) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                np npVar = (np) this.d;
                c3Var.r = true;
                c3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    npVar.Y3(tL_contacts_resolvedPeer.users, false);
                    npVar.S3(tL_contacts_resolvedPeer.chats, false);
                    vr.a0(c3Var.x.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    c3Var.E();
                    return;
                }
                return;
            case 11:
                String[] strArr = (String[]) this.b;
                int[][] iArr4 = (int[][]) this.c;
                ai.r rVar = (ai.r) this.d;
                for (int i19 = 0; i19 < strArr.length; i19++) {
                    String str4 = strArr[i19];
                    if (str4 != null) {
                        AnimatedFileNative.d(str4, iArr4[i19], 0L);
                    }
                }
                org.telegram.messenger.g0.h3(rVar);
                return;
            case 12:
                String str5 = (String) this.b;
                int[][] iArr5 = (int[][]) this.c;
                ai.r rVar2 = (ai.r) this.d;
                AnimatedFileNative.d(str5, iArr5[0], 0L);
                org.telegram.messenger.g0.h3(rVar2);
                return;
            case 13:
                hi.l8 l8Var = (hi.l8) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                np npVar2 = (np) this.d;
                hi.q8 q8Var = l8Var.a0;
                l8Var.w.setLoading(false);
                if (tLObject6 != null) {
                    int i20 = hi.q8.Y1;
                    ArrayList O0 = q8Var.O0();
                    for (int i21 = 0; i21 < O0.size(); i21++) {
                        TLRPC.User user = (TLRPC.User) O0.get(i21);
                        if (user != null && (contains = l8Var.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            npVar2.X3(user, false, false);
                        }
                    }
                }
                q8Var.M0();
                if (q8Var.U1) {
                    q8Var.N0(new hi.o8(1, q8Var.a, (ArrayList) null), new q3(q8Var, i11), false);
                    return;
                } else {
                    q8Var.M0();
                    q8Var.m1.C(0);
                    return;
                }
            case 14:
                sa saVar = (sa) this.b;
                ((hi.d7) this.c).O0 = (File) this.d;
                hi.l9 l9Var = saVar.e1;
                if (l9Var != null) {
                    l9Var.b.g3.O(false);
                    return;
                }
                return;
            case 15:
                sa saVar2 = (sa) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), saVar2.C0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                org.telegram.messenger.g0.h3(runnable2);
                return;
            case 16:
                jg.h0 h0Var = (jg.h0) this.b;
                HashSet hashSet = (HashSet) this.c;
                jg.t tVar = (jg.t) this.d;
                int i22 = h0Var.t0;
                np s12 = np.s1(i22);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair3.first).booleanValue();
                    Long l10 = (Long) pair3.second;
                    long longValue = l10.longValue();
                    ConcurrentHashMap concurrentHashMap = booleanValue ? s12.Q : s12.P;
                    vr a02 = vr.a0(i22);
                    if (booleanValue) {
                        try {
                            sQLiteCursor = a02.b.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                            try {
                                try {
                                    if (sQLiteCursor.next()) {
                                        i10 = sQLiteCursor.intValue(0);
                                        sQLiteCursor.dispose();
                                    }
                                    i10 = 0;
                                    sQLiteCursor.dispose();
                                } catch (Exception e14) {
                                    e = e14;
                                    a02.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    i10 = 0;
                                    concurrentHashMap.put(l10, Integer.valueOf(i10));
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor2 = sQLiteCursor;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor = null;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        sQLiteCursor = a02.b.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                        if (sQLiteCursor.next()) {
                            int intValue = sQLiteCursor.intValue(0);
                            int intValue2 = sQLiteCursor.intValue(1);
                            if (intValue2 <= intValue) {
                                i10 = intValue2;
                                sQLiteCursor.dispose();
                            }
                        }
                        i10 = 0;
                        sQLiteCursor.dispose();
                    }
                    concurrentHashMap.put(l10, Integer.valueOf(i10));
                }
                org.telegram.messenger.g0.h3(tVar);
                return;
            case 17:
                ((jg.f0) this.b).a((a0.h) this.d, (ArrayList) this.c);
                return;
            case 18:
                jg.h1 h1Var = (jg.h1) this.b;
                String str6 = (String) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                h1Var.F0 = 0;
                if (str6.equals(h1Var.E0) && (tLObject7 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject7;
                    ArrayList arrayList13 = h1Var.B0;
                    int size3 = arrayList13 != null ? arrayList13.size() : 0;
                    h1Var.F("sticker_search_".concat(str6), tL_messages_stickers2.stickers);
                    ArrayList arrayList14 = h1Var.B0;
                    int size4 = arrayList14 != null ? arrayList14.size() : 0;
                    if (!h1Var.p0 && (arrayList = h1Var.B0) != null && !arrayList.isEmpty()) {
                        h1Var.H();
                        h1Var.W.a(h1Var.K() > 0);
                        h1Var.p0 = true;
                    }
                    if (size3 != size4) {
                        h1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                jg.h1 h1Var2 = (jg.h1) this.b;
                ArrayList arrayList15 = (ArrayList) this.c;
                a0.h hVar = (a0.h) this.d;
                h1Var2.q0 = null;
                h1Var2.Y(hVar, arrayList15, true);
                return;
            case 20:
                jg.z1 z1Var = (jg.z1) this.b;
                ArrayList arrayList16 = (ArrayList) this.c;
                HashMap hashMap2 = (HashMap) this.d;
                z1Var.q = arrayList16;
                z1Var.r = hashMap2;
                z1Var.s = true;
                z1Var.a.l0(arrayList16);
                return;
            case 21:
                jg.a2 a2Var = (jg.a2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str7 = tL_messages_searchStickerSets.q;
                jg.c2 c2Var = a2Var.a;
                String str8 = c2Var.S;
                l31 l31Var = c2Var.e;
                if (str7.equals(str8)) {
                    a2Var.a();
                    l31Var.b.h.getProgressDrawable().e = false;
                    c2Var.O = 0;
                    l31Var.b(true);
                    c2Var.F.addAll(tL_messages_foundStickerSets.sets);
                    c2Var.f();
                    return;
                }
                return;
            case 22:
                kg.c cVar = (kg.c) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.c;
                if (tL_error2 != null) {
                    cVar.a.b(false);
                    cc.d0(tL_error2);
                    return;
                } else if (!(tLObject8 instanceof TLRPC.TL_boolFalse)) {
                    cVar.finishFragment();
                    return;
                } else {
                    cVar.a.b(false);
                    org.telegram.messenger.k5.o(null, 2131743879, cc.a0(cVar), null);
                    return;
                }
            case 23:
                kg.n nVar = (kg.n) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.c;
                if (tL_error3 != null) {
                    nVar.f.b(false);
                    cc.d0(tL_error3);
                    return;
                } else if (tLObject9 instanceof TLRPC.TL_boolFalse) {
                    nVar.f.b(false);
                    org.telegram.messenger.k5.o(null, 2131743879, cc.a0(nVar), null);
                    return;
                } else {
                    if (nVar.F != null) {
                        nVar.getMessagesController().W2(nVar.getUserConfig().f(), 0, true, null);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 24:
                kg.y yVar2 = (kg.y) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList17 = yVar2.b;
                if (!(tLObject10 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.a8.g(new RuntimeException("Unexpected response from server!"), true);
                    return;
                }
                if (arrayList17.contains(tL_businessChatLink)) {
                    arrayList17.remove(tL_businessChatLink);
                    ns.f(yVar2.a).k(ns.J1, new Object[0]);
                }
                yVar2.f();
                return;
            case 25:
                kg.y yVar3 = (kg.y) this.b;
                String str9 = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str9;
                ConnectionsManager.getInstance(yVar3.a).sendRequest(deletebusinesschatlink, new bi.v2(19, yVar3, tL_businessChatLink2));
                return;
            case 26:
                kg.i0 i0Var = (kg.i0) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                kg.f.a(i0Var.a).b();
                i0Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    cc.a0(T).Q(R.raw.contact_check, 36, hd.a0(null, null, 2131752784, q10.p(i0Var.U1))).j();
                    return;
                }
                return;
            case 27:
                kg.s0 s0Var = (kg.s0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject11 = (TLObject) this.c;
                if (tL_error4 != null) {
                    s0Var.a.b(false);
                    cc.d0(tL_error4);
                    return;
                } else if (!(tLObject11 instanceof TLRPC.TL_boolFalse)) {
                    s0Var.finishFragment();
                    return;
                } else {
                    s0Var.a.b(false);
                    org.telegram.messenger.k5.o(null, 2131743879, cc.a0(s0Var), null);
                    return;
                }
            case 28:
                kg.c1.Z((kg.c1) this.b, (TLRPC.TL_error) this.d, (TLObject) this.c);
                return;
            default:
                kg.z1 z1Var2 = (kg.z1) this.b;
                TLObject tLObject12 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList18 = z1Var2.d;
                if (tLObject12 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList18.clear();
                    arrayList18.addAll(((TLRPC.TL_help_timezonesList) tLObject12).timezones);
                    SerializedData serializedData = new SerializedData(tLObject12.getObjectSize());
                    tLObject12.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    ns.f(z1Var2.a).k(ns.r3, new Object[0]);
                }
                z1Var2.c = true;
                z1Var2.b = false;
                return;
        }
    }

    public /* synthetic */ s5(Object obj, Object obj2, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
    }
}

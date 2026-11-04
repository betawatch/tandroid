package ei;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import b8.nc;
import b8.yd;
import gi.va;
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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h9(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        File file;
        int i3;
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
                i9 i9Var = (i9) this.b;
                r6 r6Var = (r6) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                r9 r9Var = i9Var.d;
                r9Var.o0.D(r9Var.h, r6Var.d, arrayList2);
                return;
            case 1:
                aa aaVar = (aa) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                z5 z5Var = aaVar.f;
                int i12 = aaVar.b;
                aa.g = System.currentTimeMillis();
                if (tLObject != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject;
                    hp.s1(i12).Y3(tL_stories_storyViews.users, false);
                    if (!aaVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        aaVar.d = 0;
                        aaVar.e = false;
                        return;
                    }
                    hs.f(i12).k(hs.v5, new Object[0]);
                }
                aaVar.d = 0;
                if (aaVar.e) {
                    org.telegram.messenger.g0.r(z5Var);
                    org.telegram.messenger.g0.i3(z5Var, 10000L);
                    return;
                }
                return;
            case 2:
                l9.y yVar = (l9.y) this.b;
                l9.e0 e0Var = (l9.e0) this.c;
                try {
                    try {
                        e0Var.o(((l9.q) this.d).apply(yd.a(yVar)));
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
                } catch (ExecutionException e12) {
                    e = e12;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 3:
                l9.e0 e0Var2 = (l9.e0) this.b;
                m2.s sVar = (m2.s) this.c;
                o4.r1 r1Var = (o4.r1) this.d;
                try {
                    if (e0Var2.a instanceof l9.a) {
                        return;
                    }
                    sVar.run();
                    e0Var2.m(r1Var);
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 4:
                gi.x1 x1Var = (gi.x1) this.b;
                String str = (String) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                ArrayList arrayList3 = x1Var.w;
                gi.y1 y1Var = x1Var.O;
                ArrayList arrayList4 = x1Var.s;
                if (TextUtils.equals(str, x1Var.I)) {
                    x1Var.y = 0;
                    arrayList4.clear();
                    arrayList3.clear();
                    x1Var.E.clear();
                    x1Var.n.clear();
                    x1Var.y++;
                    arrayList4.add(null);
                    arrayList3.add(0L);
                    if (tLObject2 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                        arrayList4.addAll(tL_messages_stickers.stickers);
                        x1Var.y = tL_messages_stickers.stickers.size() + x1Var.y;
                    }
                    x1Var.J = x1Var.I;
                    x1Var.f();
                    gi.m1.z1(y1Var.b, 0, 0);
                    y1Var.f.c(false);
                    y1Var.e.n(false);
                    return;
                }
                return;
            case 5:
                gi.z2 z2Var = (gi.z2) this.b;
                Object obj = this.c;
                String str2 = (String) this.d;
                float f10 = z2Var.L;
                if (obj != null) {
                    int min = (int) Math.min(org.telegram.messenger.g0.q.x / 3.0f, org.telegram.messenger.g0.L(330.0f));
                    if (obj instanceof ye) {
                        ye yeVar = (ye) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        z2Var.c(yeVar, options);
                        gi.f7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c2 = z2Var.c(yeVar, options);
                        if (c2 != null && c2.getHeight() / c2.getWidth() < f10) {
                            if (yeVar.T == 0 && yeVar.U == 0 && !c2.isRecycled()) {
                                iArr2 = nc.b(c2, true);
                                yeVar.T = iArr2[0];
                                yeVar.U = iArr2[1];
                            } else {
                                int i13 = yeVar.T;
                                if (i13 != 0 && (i3 = yeVar.U) != 0) {
                                    iArr2 = new int[]{i13, i3};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c2;
                    } else if (!(obj instanceof gi.f7) || (file = ((gi.f7) obj).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        gi.f7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                org.telegram.messenger.g0.h3(new h9(z2Var, str2, pair, 6));
                return;
            case 6:
                gi.z2 z2Var2 = (gi.z2) this.b;
                String str3 = (String) this.c;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr3 = (int[]) pair2.second;
                Paint paint = z2Var2.d;
                if (bitmap == null) {
                    return;
                }
                if (str3 != null) {
                    gi.z2.g0.put(str3, bitmap);
                    HashMap hashMap = gi.z2.f0;
                    Integer num = (Integer) hashMap.get(str3);
                    if (num != null) {
                        hashMap.put(str3, Integer.valueOf(num.intValue() + 1));
                    } else {
                        hashMap.put(str3, 1);
                    }
                }
                if (!TextUtils.equals(str3, z2Var2.S)) {
                    gi.z2.d(str3);
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
            case 7:
                gi.c3 c3Var = (gi.c3) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                hp hpVar = (hp) this.d;
                c3Var.r = true;
                c3Var.d = false;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    hpVar.Y3(tL_contacts_resolvedPeer.users, false);
                    hpVar.S3(tL_contacts_resolvedPeer.chats, false);
                    qr.a0(c3Var.x.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    c3Var.E();
                    return;
                }
                return;
            case 8:
                String[] strArr = (String[]) this.b;
                int[][] iArr4 = (int[][]) this.c;
                ai.z3 z3Var = (ai.z3) this.d;
                for (int i14 = 0; i14 < strArr.length; i14++) {
                    String str4 = strArr[i14];
                    if (str4 != null) {
                        AnimatedFileNative.d(str4, iArr4[i14], 0L);
                    }
                }
                org.telegram.messenger.g0.h3(z3Var);
                return;
            case 9:
                String str5 = (String) this.b;
                int[][] iArr5 = (int[][]) this.c;
                ai.z3 z3Var2 = (ai.z3) this.d;
                AnimatedFileNative.d(str5, iArr5[0], 0L);
                org.telegram.messenger.g0.h3(z3Var2);
                return;
            case 10:
                gi.o8 o8Var = (gi.o8) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                hp hpVar2 = (hp) this.d;
                gi.t8 t8Var = o8Var.a0;
                o8Var.w.setLoading(false);
                if (tLObject4 != null) {
                    int i15 = gi.t8.V1;
                    ArrayList O0 = t8Var.O0();
                    for (int i16 = 0; i16 < O0.size(); i16++) {
                        TLRPC.User user = (TLRPC.User) O0.get(i16);
                        if (user != null && (contains = o8Var.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            hpVar2.X3(user, false, false);
                        }
                    }
                }
                t8Var.M0();
                if (t8Var.R1) {
                    t8Var.N0(new gi.r8(1, t8Var.a, (ArrayList) null), new y3(t8Var, i11), false);
                    return;
                } else {
                    t8Var.M0();
                    t8Var.j1.D(0);
                    return;
                }
            case 11:
                va vaVar = (va) this.b;
                ((gi.f7) this.c).O0 = (File) this.d;
                gi.o9 o9Var = vaVar.e1;
                if (o9Var != null) {
                    o9Var.b.g3.O(false);
                    return;
                }
                return;
            case 12:
                va vaVar2 = (va) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Runnable runnable = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), vaVar2.C0.getMatrix(), true);
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
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 13:
                ArrayList arrayList5 = (ArrayList) this.d;
                HashMap hashMap2 = (HashMap) this.b;
                u10 u10Var = (u10) this.c;
                ArrayList arrayList6 = new ArrayList();
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList5.get(i17);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    ii.q qVar = new ii.q();
                    qVar.a = user2;
                    qVar.b = z10;
                    arrayList6.add(qVar);
                }
                u10Var.a(arrayList6);
                return;
            case 14:
                boolean[] zArr = (boolean[]) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                ii.p1 p1Var = (ii.p1) this.d;
                zArr[0] = false;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    p1Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 15:
                ii.v2 v2Var = (ii.v2) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ii.a3 a3Var = v2Var.d;
                if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    new fc(a3Var.r0, a3Var.G).Y(tL_error).k(true);
                    return;
                }
                ii.s2 s2Var = a3Var.E;
                s2Var.getClass();
                s2Var.y("emoji_status_access_requested", org.telegram.ui.web.w0.A("cancelled", "status"));
                return;
            case 16:
                ii.q3 q3Var = (ii.q3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                fc.a0(q3Var).I(R.raw.copy, bd.M0(2131754333, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131754334, ii.k.J0(connectedbotstarref.commission_permille), l10.p(user3)))).j();
                return;
            case 17:
                ii.q3.D0((ii.q3) this.b, (TLObject) this.c, (org.telegram.ui.ActionBar.s1) this.d);
                return;
            case 18:
                k2.z0 z0Var = (k2.z0) this.b;
                g9.f0 f0Var = (g9.f0) this.c;
                w2.g0 g0Var = (w2.g0) this.d;
                l2.f fVar = z0Var.c;
                g9.s1 f11 = f0Var.f();
                l2.e eVar = fVar.d;
                d2.e1 e1Var = fVar.h;
                e1Var.getClass();
                eVar.getClass();
                eVar.b = g9.i0.q(f11);
                if (!f11.isEmpty()) {
                    eVar.e = (w2.g0) f11.get(0);
                    g0Var.getClass();
                    eVar.f = g0Var;
                }
                if (((w2.g0) eVar.d) == null) {
                    eVar.d = l2.e.g(e1Var, (g9.i0) eVar.b, (w2.g0) eVar.e, (d2.k1) eVar.a);
                }
                eVar.u(e1Var.y0());
                return;
            case 19:
                k2.f1 f1Var = (k2.f1) this.b;
                Pair pair3 = (Pair) this.c;
                f1Var.b.h.x(((Integer) pair3.first).intValue(), (w2.g0) pair3.second, (v7.s) this.d);
                return;
            case 20:
                k2.f1 f1Var2 = (k2.f1) this.b;
                Pair pair4 = (Pair) this.c;
                f1Var2.b.h.A(((Integer) pair4.first).intValue(), (w2.g0) pair4.second, (Exception) this.d);
                return;
            case 21:
                kg.e0 e0Var3 = (kg.e0) this.b;
                HashSet hashSet = (HashSet) this.c;
                kg.s sVar2 = (kg.s) this.d;
                int i18 = e0Var3.t0;
                hp s12 = hp.s1(i18);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair5 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair5.first).booleanValue();
                    Long l10 = (Long) pair5.second;
                    long longValue = l10.longValue();
                    ConcurrentHashMap concurrentHashMap = booleanValue ? s12.Q : s12.P;
                    qr a02 = qr.a0(i18);
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
                                } catch (Exception e13) {
                                    e = e13;
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
                        } catch (Exception e14) {
                            e = e14;
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
                org.telegram.messenger.g0.h3(sVar2);
                return;
            case 22:
                ((kg.c0) this.b).a((a0.h) this.c, (ArrayList) this.d);
                return;
            case 23:
                kg.e1 e1Var2 = (kg.e1) this.b;
                String str6 = (String) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                e1Var2.F0 = 0;
                if (str6.equals(e1Var2.E0) && (tLObject7 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject7;
                    ArrayList arrayList7 = e1Var2.B0;
                    int size = arrayList7 != null ? arrayList7.size() : 0;
                    e1Var2.F("sticker_search_".concat(str6), tL_messages_stickers2.stickers);
                    ArrayList arrayList8 = e1Var2.B0;
                    int size2 = arrayList8 != null ? arrayList8.size() : 0;
                    if (!e1Var2.p0 && (arrayList = e1Var2.B0) != null && !arrayList.isEmpty()) {
                        e1Var2.H();
                        e1Var2.W.a(e1Var2.K() > 0);
                        e1Var2.p0 = true;
                    }
                    if (size != size2) {
                        e1Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                kg.e1 e1Var3 = (kg.e1) this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                a0.h hVar = (a0.h) this.c;
                e1Var3.q0 = null;
                e1Var3.Y(hVar, arrayList9, true);
                return;
            case 25:
                kg.v1 v1Var = (kg.v1) this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap3 = (HashMap) this.c;
                v1Var.q = arrayList10;
                v1Var.r = hashMap3;
                v1Var.s = true;
                v1Var.a.b2(arrayList10);
                return;
            case 26:
                kg.w1 w1Var = (kg.w1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str7 = tL_messages_searchStickerSets.q;
                kg.y1 y1Var2 = w1Var.a;
                String str8 = y1Var2.S;
                b31 b31Var = y1Var2.e;
                if (str7.equals(str8)) {
                    w1Var.a();
                    b31Var.b.h.getProgressDrawable().e = false;
                    y1Var2.O = 0;
                    b31Var.b(true);
                    y1Var2.F.addAll(tL_messages_foundStickerSets.sets);
                    y1Var2.f();
                    return;
                }
                return;
            case 27:
                lg.c cVar = (lg.c) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar.a.b(false);
                    fc.d0(tL_error2);
                    return;
                } else if (!(tLObject8 instanceof TLRPC.TL_boolFalse)) {
                    cVar.finishFragment();
                    return;
                } else {
                    cVar.a.b(false);
                    org.telegram.messenger.k5.p(null, 2131743889, fc.a0(cVar), null);
                    return;
                }
            case 28:
                lg.m mVar = (lg.m) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                if (tL_error3 != null) {
                    mVar.f.b(false);
                    fc.d0(tL_error3);
                    return;
                } else if (tLObject9 instanceof TLRPC.TL_boolFalse) {
                    mVar.f.b(false);
                    org.telegram.messenger.k5.p(null, 2131743889, fc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.F != null) {
                        mVar.getMessagesController().W2(mVar.getUserConfig().f(), 0, true, null);
                    }
                    mVar.finishFragment();
                    return;
                }
            default:
                lg.z zVar = (lg.z) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList11 = zVar.b;
                if (!(tLObject10 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.a8.g(new RuntimeException("Unexpected response from server!"), true);
                    return;
                }
                if (arrayList11.contains(tL_businessChatLink)) {
                    arrayList11.remove(tL_businessChatLink);
                    hs.f(zVar.a).k(hs.J1, new Object[0]);
                }
                zVar.f();
                return;
        }
    }

    public /* synthetic */ h9(Object obj, ArrayList arrayList, Cloneable cloneable, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = arrayList;
        this.c = cloneable;
    }

    public /* synthetic */ h9(ArrayList arrayList, HashMap hashMap, u10 u10Var) {
        this.a = 13;
        this.d = arrayList;
        this.b = hashMap;
        this.c = u10Var;
    }
}

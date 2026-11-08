package fi;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
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
import org.telegram.messenger.c20;
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.g31;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x1(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        File file;
        int i7;
        boolean contains;
        SQLiteCursor sQLiteCursor;
        int i10;
        ArrayList arrayList;
        int i11 = 2;
        Pair pair = null;
        SQLiteCursor sQLiteCursor2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                y1 y1Var = (y1) this.c;
                String str = (String) this.b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList2 = y1Var.w;
                z1 z1Var = y1Var.N;
                ArrayList arrayList3 = y1Var.s;
                if (TextUtils.equals(str, y1Var.H)) {
                    y1Var.y = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    y1Var.D.clear();
                    y1Var.n.clear();
                    y1Var.y++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList3.addAll(tL_messages_stickers.stickers);
                        y1Var.y = tL_messages_stickers.stickers.size() + y1Var.y;
                    }
                    y1Var.I = y1Var.H;
                    y1Var.f();
                    m1.z1(z1Var.b, 0, 0);
                    z1Var.f.c(false);
                    z1Var.e.n(false);
                    return;
                }
                return;
            case 1:
                b3 b3Var = (b3) this.c;
                Object obj = this.d;
                String str2 = (String) this.b;
                float f10 = b3Var.K;
                if (obj != null) {
                    int min = (int) Math.min(org.telegram.messenger.g0.q.x / 3.0f, org.telegram.messenger.g0.L(330.0f));
                    if (obj instanceof gf) {
                        gf gfVar = (gf) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        b3Var.c(gfVar, options);
                        e7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = b3Var.c(gfVar, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f10) {
                            if (gfVar.T == 0 && gfVar.U == 0 && !c10.isRecycled()) {
                                iArr2 = a8.ba.b(c10, true);
                                gfVar.T = iArr2[0];
                                gfVar.U = iArr2[1];
                            } else {
                                int i13 = gfVar.T;
                                if (i13 != 0 && (i7 = gfVar.U) != 0) {
                                    iArr2 = new int[]{i13, i7};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c10;
                    } else if (!(obj instanceof e7) || (file = ((e7) obj).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        e7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                org.telegram.messenger.g0.h3(new x1(b3Var, str2, pair, i11));
                return;
            case 2:
                b3 b3Var2 = (b3) this.c;
                String str3 = (String) this.b;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr3 = (int[]) pair2.second;
                Paint paint = b3Var2.d;
                if (bitmap == null) {
                    return;
                }
                if (str3 != null) {
                    b3.f0.put(str3, bitmap);
                    HashMap hashMap = b3.e0;
                    Integer num = (Integer) hashMap.get(str3);
                    if (num != null) {
                        hashMap.put(str3, Integer.valueOf(num.intValue() + 1));
                    } else {
                        hashMap.put(str3, 1);
                    }
                }
                if (!TextUtils.equals(str3, b3Var2.R)) {
                    b3.d(str3);
                    return;
                }
                b3Var2.a = bitmap;
                if (iArr3 == null) {
                    paint.setShader(null);
                    b3Var2.e = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    b3Var2.e = linearGradient;
                    paint.setShader(linearGradient);
                }
                b3Var2.h();
                b3Var2.invalidate();
                return;
            case 3:
                e3 e3Var = (e3) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                qp qpVar = (qp) this.b;
                e3Var.r = true;
                e3Var.d = false;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    qpVar.Y3(tL_contacts_resolvedPeer.users, false);
                    qpVar.S3(tL_contacts_resolvedPeer.chats, false);
                    yr.a0(e3Var.x.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    e3Var.E();
                    return;
                }
                return;
            case 4:
                String[] strArr = (String[]) this.c;
                int[][] iArr4 = (int[][]) this.b;
                ai.d0 d0Var = (ai.d0) this.d;
                for (int i14 = 0; i14 < strArr.length; i14++) {
                    String str4 = strArr[i14];
                    if (str4 != null) {
                        AnimatedFileNative.d(str4, iArr4[i14], 0L);
                    }
                }
                org.telegram.messenger.g0.h3(d0Var);
                return;
            case 5:
                String str5 = (String) this.b;
                int[][] iArr5 = (int[][]) this.c;
                ai.d0 d0Var2 = (ai.d0) this.d;
                AnimatedFileNative.d(str5, iArr5[0], 0L);
                org.telegram.messenger.g0.h3(d0Var2);
                return;
            case 6:
                n8 n8Var = (n8) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                qp qpVar2 = (qp) this.b;
                s8 s8Var = n8Var.W;
                n8Var.w.setLoading(false);
                if (tLObject3 != null) {
                    int i15 = s8.U1;
                    ArrayList O0 = s8Var.O0();
                    for (int i16 = 0; i16 < O0.size(); i16++) {
                        TLRPC.User user = (TLRPC.User) O0.get(i16);
                        if (user != null && (contains = n8Var.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            qpVar2.X3(user, false, false);
                        }
                    }
                }
                s8Var.M0();
                if (s8Var.Q1) {
                    s8Var.N0(new q8(1, s8Var.a, (ArrayList) null), new di.w3(s8Var, i12), false);
                    return;
                } else {
                    s8Var.M0();
                    s8Var.i1.E(0);
                    return;
                }
            case 7:
                va vaVar = (va) this.c;
                ((e7) this.b).O0 = (File) this.d;
                o9 o9Var = vaVar.d1;
                if (o9Var != null) {
                    o9Var.b.f3.O(false);
                    return;
                }
                return;
            case 8:
                va vaVar2 = (va) this.c;
                Bitmap bitmap2 = (Bitmap) this.b;
                Runnable runnable = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), vaVar2.B0.getMatrix(), true);
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
                    } catch (Throwable unused) {
                    }
                }
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 9:
                m9.y yVar = (m9.y) this.c;
                m9.e0 e0Var = (m9.e0) this.b;
                try {
                    try {
                        e0Var.o(((m9.q) this.d).apply(c8.s9.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused2) {
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
            case 10:
                m9.e0 e0Var2 = (m9.e0) this.c;
                org.telegram.ui.web.w wVar = (org.telegram.ui.web.w) this.b;
                p4.m1 m1Var = (p4.m1) this.d;
                try {
                    if (e0Var2.a instanceof m9.a) {
                        return;
                    }
                    wVar.run();
                    e0Var2.m(m1Var);
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 11:
                ArrayList arrayList4 = (ArrayList) this.c;
                HashMap hashMap2 = (HashMap) this.b;
                c20 c20Var = (c20) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(i17);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.id));
                    boolean z9 = bool == null || !bool.booleanValue();
                    hi.o oVar = new hi.o();
                    oVar.a = user2;
                    oVar.b = z9;
                    arrayList5.add(oVar);
                }
                c20Var.a(arrayList5);
                return;
            case 12:
                boolean[] zArr = (boolean[]) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                hi.o1 o1Var = (hi.o1) this.b;
                zArr[0] = false;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    o1Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 13:
                hi.v2 v2Var = (hi.v2) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                hi.a3 a3Var = v2Var.d;
                if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                    new hc(a3Var.q0, a3Var.F).Y(tL_error).k(true);
                    return;
                }
                hi.s2 s2Var = a3Var.D;
                s2Var.getClass();
                s2Var.y("emoji_status_access_requested", org.telegram.ui.web.x0.A("cancelled", "status"));
                return;
            case 14:
                hi.q3 q3Var = (hi.q3) this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                TLRPC.User user3 = (TLRPC.User) this.d;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                hc.a0(q3Var).I(R.raw.copy, id.M0(2131754333, null), org.telegram.messenger.g0.X2(id.a0(null, null, 2131754334, hi.j.J0(connectedbotstarref.commission_permille), t10.p(user3)))).j();
                return;
            case 15:
                hi.q3.D0((hi.q3) this.c, (TLObject) this.d, (org.telegram.ui.ActionBar.u1) this.b);
                return;
            case 16:
                jg.h0 h0Var = (jg.h0) this.c;
                HashSet hashSet = (HashSet) this.b;
                jg.u uVar = (jg.u) this.d;
                int i18 = h0Var.s0;
                qp s12 = qp.s1(i18);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair3.first).booleanValue();
                    Long l10 = (Long) pair3.second;
                    long longValue = l10.longValue();
                    ConcurrentHashMap concurrentHashMap = booleanValue ? s12.P : s12.O;
                    yr a02 = yr.a0(i18);
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
                org.telegram.messenger.g0.h3(uVar);
                return;
            case 17:
                ((jg.f0) this.c).a((a0.h) this.d, (ArrayList) this.b);
                return;
            case 18:
                jg.i1 i1Var = (jg.i1) this.c;
                String str6 = (String) this.b;
                TLObject tLObject6 = (TLObject) this.d;
                i1Var.E0 = 0;
                if (str6.equals(i1Var.D0) && (tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject6;
                    ArrayList arrayList6 = i1Var.A0;
                    int size = arrayList6 != null ? arrayList6.size() : 0;
                    i1Var.F("sticker_search_".concat(str6), tL_messages_stickers2.stickers);
                    ArrayList arrayList7 = i1Var.A0;
                    int size2 = arrayList7 != null ? arrayList7.size() : 0;
                    if (!i1Var.o0 && (arrayList = i1Var.A0) != null && !arrayList.isEmpty()) {
                        i1Var.H();
                        i1Var.V.a(i1Var.K() > 0);
                        i1Var.o0 = true;
                    }
                    if (size != size2) {
                        i1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                jg.i1 i1Var2 = (jg.i1) this.c;
                ArrayList arrayList8 = (ArrayList) this.b;
                a0.h hVar = (a0.h) this.d;
                i1Var2.p0 = null;
                i1Var2.Y(hVar, arrayList8, true);
                return;
            case 20:
                jg.z1 z1Var2 = (jg.z1) this.c;
                ArrayList arrayList9 = (ArrayList) this.b;
                HashMap hashMap3 = (HashMap) this.d;
                z1Var2.q = arrayList9;
                z1Var2.r = hashMap3;
                z1Var2.s = true;
                z1Var2.a.m1(arrayList9);
                return;
            case 21:
                jg.b2 b2Var = (jg.b2) this.c;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str7 = tL_messages_searchStickerSets.q;
                jg.d2 d2Var = b2Var.a;
                String str8 = d2Var.R;
                g31 g31Var = d2Var.e;
                if (str7.equals(str8)) {
                    b2Var.a();
                    g31Var.b.h.getProgressDrawable().e = false;
                    d2Var.N = 0;
                    g31Var.b(true);
                    d2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    d2Var.f();
                    return;
                }
                return;
            case 22:
                kg.c cVar = (kg.c) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar.a.b(false);
                    hc.d0(tL_error2);
                    return;
                } else if (!(tLObject7 instanceof TLRPC.TL_boolFalse)) {
                    cVar.finishFragment();
                    return;
                } else {
                    cVar.a.b(false);
                    org.telegram.messenger.k5.p(null, 2131743882, hc.a0(cVar), null);
                    return;
                }
            case 23:
                kg.m mVar = (kg.m) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject8 = (TLObject) this.d;
                if (tL_error3 != null) {
                    mVar.f.b(false);
                    hc.d0(tL_error3);
                    return;
                } else if (tLObject8 instanceof TLRPC.TL_boolFalse) {
                    mVar.f.b(false);
                    org.telegram.messenger.k5.p(null, 2131743882, hc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.E != null) {
                        mVar.getMessagesController().W2(mVar.getUserConfig().f(), 0, true, null);
                    }
                    mVar.finishFragment();
                    return;
                }
            case 24:
                kg.y yVar2 = (kg.y) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                ArrayList arrayList10 = yVar2.b;
                if (!(tLObject9 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.a8.g(new RuntimeException("Unexpected response from server!"), true);
                    return;
                }
                if (arrayList10.contains(tL_businessChatLink)) {
                    arrayList10.remove(tL_businessChatLink);
                    qs.f(yVar2.a).k(qs.J1, new Object[0]);
                }
                yVar2.f();
                return;
            case 25:
                kg.y yVar3 = (kg.y) this.c;
                String str9 = (String) this.b;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str9;
                ConnectionsManager.getInstance(yVar3.a).sendRequest(deletebusinesschatlink, new bi.j(19, yVar3, tL_businessChatLink2));
                return;
            case 26:
                kg.i0 i0Var = (kg.i0) this.c;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.b;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                kg.f.a(i0Var.a).b();
                i0Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    hc.a0(T).Q(R.raw.contact_check, 36, id.a0(null, null, 2131752784, t10.p(i0Var.Q1))).j();
                    return;
                }
                return;
            case 27:
                kg.s0 s0Var = (kg.s0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                TLObject tLObject10 = (TLObject) this.d;
                if (tL_error4 != null) {
                    s0Var.a.b(false);
                    hc.d0(tL_error4);
                    return;
                } else if (!(tLObject10 instanceof TLRPC.TL_boolFalse)) {
                    s0Var.finishFragment();
                    return;
                } else {
                    s0Var.a.b(false);
                    org.telegram.messenger.k5.p(null, 2131743882, hc.a0(s0Var), null);
                    return;
                }
            case 28:
                kg.c1.Z((kg.c1) this.c, (TLRPC.TL_error) this.b, (TLObject) this.d);
                return;
            default:
                kg.x1 x1Var = (kg.x1) this.c;
                TLObject tLObject11 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                ArrayList arrayList11 = x1Var.d;
                if (tLObject11 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList11.clear();
                    arrayList11.addAll(((TLRPC.TL_help_timezonesList) tLObject11).timezones);
                    SerializedData serializedData = new SerializedData(tLObject11.getObjectSize());
                    tLObject11.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    qs.f(x1Var.a).k(qs.r3, new Object[0]);
                }
                x1Var.c = true;
                x1Var.b = false;
                return;
        }
    }

    public /* synthetic */ x1(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ x1(String str, int[][] iArr, ai.d0 d0Var) {
        this.a = 5;
        this.b = str;
        this.c = iArr;
        this.d = d0Var;
    }
}

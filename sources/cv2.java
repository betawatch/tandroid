// default package

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessagingService;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.ExternalActionActivity;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cv2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cv2(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:248:0x0568  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        iv2 iv2Var;
        int i2;
        SQLiteCursor sQLiteCursor;
        boolean z;
        String str;
        TLRPC.User user;
        int i3;
        SQLiteCursor sQLiteCursor2;
        int i4;
        SQLiteDatabase sQLiteDatabase;
        long j = 0;
        int i5 = 3;
        SQLiteCursor sQLiteCursor3 = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r7 = null;
        SQLiteCursor sQLiteCursor4 = null;
        int i6 = 0;
        switch (this.a) {
            case 0:
                lv2 lv2Var = (lv2) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                boolean z2 = false;
                for (int i7 = 0; i7 < updates.users.size(); i7++) {
                    TLRPC.User user3 = updates.users.get(i7);
                    if (user3.contact && (iv2Var = (iv2) lv2Var.a0.get(user3.phone)) != null) {
                        String a = iv2.a(iv2Var.i, iv2Var.j);
                        String a2 = iv2.a(user2.first_name, user2.last_name);
                        if (iv2Var.m == null) {
                            iv2Var.m = user2;
                            if (!a.equals(a2)) {
                                ArrayList arrayList = (ArrayList) lv2Var.c0.get(a2);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    lv2Var.c0.put(a2, arrayList);
                                    lv2Var.d0.add(a2);
                                }
                                arrayList.add(iv2Var);
                                ArrayList arrayList2 = (ArrayList) lv2Var.c0.get(a);
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 < size) {
                                            Object obj = arrayList2.get(i8);
                                            i8++;
                                            if (obj instanceof iv2) {
                                                iv2 iv2Var2 = (iv2) obj;
                                                if (iv2Var2.a == iv2Var.a) {
                                                    if (arrayList2.remove(iv2Var2) && arrayList2.isEmpty()) {
                                                        lv2Var.c0.remove(a);
                                                        lv2Var.d0.remove(a);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                    if (user3.contact && lv2Var.g0.get(Long.valueOf(user3.id)) == null) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = user3.id;
                        lv2Var.f0.add(tL_contact);
                        lv2Var.g0.put(Long.valueOf(tL_contact.user_id), tL_contact);
                    }
                }
                lv2Var.d(true);
                if (z2) {
                    i = 0;
                    lv2Var.E(lv2Var.c0, lv2Var.d0, lv2Var.e0, false);
                } else {
                    i = 0;
                }
                lv2Var.getNotificationCenter().k(25, new Object[i]);
                return;
            case 1:
                lv2 lv2Var2 = (lv2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                Vector vector = (Vector) this.d;
                editor.remove("needGetStatuses").commit();
                if (vector.objects.isEmpty()) {
                    i2 = 1;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<T> arrayList4 = vector.objects;
                    int size2 = arrayList4.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj2 = arrayList4.get(i9);
                        i9++;
                        TLRPC.TL_user tL_user = new TLRPC.TL_user();
                        TLRPC.TL_contactStatus tL_contactStatus = (TLRPC.TL_contactStatus) obj2;
                        if (tL_contactStatus != null) {
                            TLRPC.UserStatus userStatus = tL_contactStatus.status;
                            if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                                userStatus.expires = userStatus.by_me ? -1000 : -100;
                            } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                                userStatus.expires = userStatus.by_me ? -1001 : -101;
                            } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                                userStatus.expires = userStatus.by_me ? -1002 : -102;
                            }
                            TLRPC.User X1 = lv2Var2.getMessagesController().X1(Long.valueOf(tL_contactStatus.user_id));
                            if (X1 != null) {
                                X1.status = tL_contactStatus.status;
                            }
                            tL_user.status = tL_contactStatus.status;
                            arrayList3.add(tL_user);
                        }
                    }
                    i2 = 1;
                    lv2Var2.getMessagesStorage().h2(arrayList3, true);
                }
                jn7 notificationCenter = lv2Var2.getNotificationCenter();
                int i10 = uc7.r5;
                Object[] objArr = new Object[i2];
                objArr[0] = 4;
                notificationCenter.k(2, objArr);
                return;
            case 2:
                zc1 zc1Var = (zc1) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                yy2 yy2Var = (yy2) zc1Var.f;
                yy2Var.getClass();
                try {
                    ((vh4) yy2Var.d.d).H(str2, str3);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = yy2Var.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 3:
                ilb ilbVar = (ilb) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                vnb vnbVar = (vnb) this.d;
                ilbVar.setText(charSequence);
                yob.X(ilbVar.getTextView(), aob.B6, vnbVar);
                return;
            case 4:
                uj3 uj3Var = (uj3) this.b;
                gi1 gi1Var = (gi1) this.c;
                e eVar = (e) this.d;
                uj3Var.removeSelfFromStack();
                gi1Var.removeSelfFromStack();
                eVar.finishFragment();
                return;
            case 5:
                uj3 uj3Var2 = (uj3) this.b;
                tj3 tj3Var = (tj3) this.c;
                int length = ((Object[]) this.d).length;
                uj3Var2.O4(tj3Var);
                ij3 ij3Var = uj3Var2.A0;
                if (ij3Var == null || ij3Var.getVisibility() != 0) {
                    return;
                }
                uj3Var2.A0.d();
                return;
            case 6:
                lj3 lj3Var = (lj3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ac7 ac7Var = (ac7) this.d;
                boolean z3 = zArr[0];
                uj3 uj3Var3 = lj3Var.b;
                if (z3) {
                    uj3Var3.presentFragment(new je4(ac7Var, null));
                    return;
                } else {
                    af4.b1(uj3Var3, ac7Var, null);
                    return;
                }
            case 7:
                mk3 mk3Var = (mk3) this.b;
                jf7 jf7Var = (jf7) this.c;
                lk3 lk3Var = (lk3) this.d;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = jf7Var.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                try {
                                    arrayList6.add(Long.valueOf(queryFinalized.longValue(0)));
                                    j = Math.max(j, queryFinalized.longValue(1));
                                    str = queryFinalized.stringValue(2);
                                } catch (Exception e2) {
                                    e = e2;
                                    sQLiteCursor = queryFinalized;
                                    z = true;
                                    try {
                                        cc4.g(e, z);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        hl.c3(new da7((Object) mk3Var, (Object) arrayList5, j, (Object) str, (Object) lk3Var, (byte) 6));
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteCursor = queryFinalized;
                            z = true;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList i0 = jf7Var.i0(arrayList6);
                    int size3 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList6.get(i11);
                        i11++;
                        long longValue = ((Long) obj3).longValue();
                        int size4 = i0.size();
                        int i12 = i6;
                        while (true) {
                            if (i6 < size4) {
                                Object obj4 = i0.get(i6);
                                int i13 = i6 + 1;
                                user = (TLRPC.User) obj4;
                                if (user != null) {
                                    i3 = i13;
                                    if (user.id == longValue) {
                                    }
                                } else {
                                    i3 = i13;
                                }
                                i6 = i3;
                            } else {
                                user = null;
                            }
                        }
                        if (user != null) {
                            arrayList5.add(user);
                        }
                        i6 = i12;
                    }
                    queryFinalized.dispose();
                } catch (Exception e4) {
                    e = e4;
                    z = true;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                hl.c3(new da7((Object) mk3Var, (Object) arrayList5, j, (Object) str, (Object) lk3Var, (byte) 6));
                return;
            case 8:
                tl3 tl3Var = (tl3) this.b;
                HashSet hashSet = (HashSet) this.c;
                jl3 jl3Var = (jl3) this.d;
                int i14 = tl3Var.t0;
                uc7 s1 = uc7.s1(i14);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair.first).booleanValue();
                    Long l = (Long) pair.second;
                    long longValue2 = l.longValue();
                    ConcurrentHashMap concurrentHashMap = booleanValue ? s1.Q : s1.P;
                    jf7 Y = jf7.Y(i14);
                    try {
                        sQLiteDatabase = Y.b;
                    } catch (Exception e5) {
                        e = e5;
                        sQLiteCursor2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    if (booleanValue) {
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue2, new Object[0]);
                        try {
                            try {
                            } catch (Exception e6) {
                                e = e6;
                                Y.n(e, true);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                i4 = 0;
                                concurrentHashMap.put(l, Integer.valueOf(i4));
                            }
                            if (sQLiteCursor2.next()) {
                                i4 = sQLiteCursor2.intValue(0);
                                sQLiteCursor2.dispose();
                                concurrentHashMap.put(l, Integer.valueOf(i4));
                            }
                            i4 = 0;
                            sQLiteCursor2.dispose();
                            concurrentHashMap.put(l, Integer.valueOf(i4));
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteCursor3 = sQLiteCursor2;
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                            }
                            throw th;
                        }
                    } else {
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue2, new Object[0]);
                        if (sQLiteCursor2.next()) {
                            int intValue = sQLiteCursor2.intValue(0);
                            int intValue2 = sQLiteCursor2.intValue(1);
                            if (intValue2 <= intValue) {
                                i4 = intValue2;
                                sQLiteCursor2.dispose();
                                concurrentHashMap.put(l, Integer.valueOf(i4));
                            }
                        }
                        i4 = 0;
                        sQLiteCursor2.dispose();
                        concurrentHashMap.put(l, Integer.valueOf(i4));
                    }
                }
                hl.c3(jl3Var);
                return;
            case 9:
                ((rl3) this.b).a((zh6) this.d, (ArrayList) this.c);
                return;
            case 10:
                dm3 dm3Var = (dm3) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                bm3 bm3Var = (bm3) this.d;
                dm3Var.getClass();
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                dm3Var.b();
                bm3Var.c(null, null);
                return;
            case 11:
                bn3 bn3Var = (bn3) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                bn3Var.getClass();
                DictationAsr.d0(str4, str5);
                bn3Var.D(str4);
                return;
            case 12:
                bn3 bn3Var2 = (bn3) this.b;
                String str6 = (String) this.c;
                cm3 cm3Var = (cm3) this.d;
                if (bn3Var2.r == 4) {
                    bn3Var2.J(3);
                    bn3Var2.y(str6);
                    bn3Var2.w.e(cm3Var.a(), false);
                    bn3Var2.w.setRevert(true);
                    return;
                }
                return;
            case 13:
                vo3 vo3Var = (vo3) this.b;
                Runnable runnable = (Runnable) this.c;
                uo3 uo3Var = (uo3) this.d;
                vo3Var.getClass();
                runnable.run();
                Utilities.e.c(new wd3(vo3Var, uo3Var, (byte) 22));
                return;
            case 14:
                lq3 lq3Var = (lq3) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = lq3Var.H;
                arrayList9.clear();
                arrayList9.addAll(arrayList7);
                ArrayList arrayList10 = lq3Var.I;
                arrayList10.clear();
                arrayList10.addAll(arrayList8);
                return;
            case 15:
                mr3 mr3Var = (mr3) this.b;
                ((nr3) this.c).i(mr3Var.a, mr3Var.b, (Exception) this.d);
                return;
            case 16:
                mr3 mr3Var2 = (mr3) this.b;
                ((nr3) this.c).N(mr3Var2.a, mr3Var2.b, (rj2) this.d);
                return;
            case 17:
                ((EglRenderer) this.b).lambda$removeFrameListener$2((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 18:
                ((EglRenderer) this.b).lambda$removeRenderListener$3((CountDownLatch) this.c, (EglRenderer.RenderListener) this.d);
                return;
            case 19:
                ((tv3) this.b).o((TLRPC.TL_messages_stickerSet) ((TLObject) this.c), (r47) this.d);
                return;
            case 20:
                nw3 nw3Var = (nw3) this.b;
                String str7 = (String) this.c;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList11 = nw3Var.w;
                ow3 ow3Var = nw3Var.O;
                ArrayList arrayList12 = nw3Var.s;
                if (TextUtils.equals(str7, nw3Var.I)) {
                    nw3Var.y = 0;
                    arrayList12.clear();
                    arrayList11.clear();
                    nw3Var.E.clear();
                    nw3Var.n.clear();
                    nw3Var.y++;
                    arrayList12.add(null);
                    arrayList11.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList12.addAll(tL_messages_stickers.stickers);
                        nw3Var.y = tL_messages_stickers.stickers.size() + nw3Var.y;
                    }
                    nw3Var.J = nw3Var.I;
                    nw3Var.f();
                    dw3 dw3Var = ow3Var.b;
                    int i15 = dw3.q3;
                    dw3Var.A1(0, 0);
                    ow3Var.f.c(false);
                    ow3Var.e.n(false);
                    return;
                }
                return;
            case 21:
                vj0 vj0Var = (vj0) this.b;
                rje rjeVar = (rje) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    wn4 a3 = zhe.a(vj0Var.a);
                    if (a3 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    vn4 vn4Var = (vn4) a3.a;
                    synchronized (vn4Var.c) {
                        try {
                            vn4Var.e = threadPoolExecutor;
                        } finally {
                        }
                    }
                    a3.a.b(new ix3(rjeVar, threadPoolExecutor));
                    return;
                } catch (Throwable th6) {
                    rjeVar.a(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 22:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 23:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                id idVar = (id) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList13 = ExternalActionActivity.y;
                try {
                    idVar.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        id u0 = jj.u0(externalActionActivity, ob6.M0(2131743475, null), true);
                        if (u0 != null) {
                            u0.setOnDismissListener(new gf(externalActionActivity, tL_error, (byte) 9));
                        } else {
                            externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                            externalActionActivity.finish();
                        }
                    } else if ("BOT_INVALID".equals(tL_error.text) || "PUBLIC_KEY_REQUIRED".equals(tL_error.text) || "PUBLIC_KEY_INVALID".equals(tL_error.text) || "SCOPE_EMPTY".equals(tL_error.text) || "PAYLOAD_EMPTY".equals(tL_error.text)) {
                        externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                        externalActionActivity.finish();
                    } else {
                        externalActionActivity.setResult(0);
                        externalActionActivity.finish();
                    }
                    return;
                } catch (Exception e7) {
                    cc4.g(e7, true);
                    return;
                }
            case 24:
                jf7 jf7Var2 = (jf7) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                r4c r4cVar = (r4c) this.d;
                ArrayList arrayList15 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = jf7Var2.b;
                        ArrayList arrayList16 = new ArrayList();
                        int size5 = arrayList14.size();
                        int i16 = 0;
                        while (i16 < size5) {
                            Object obj5 = arrayList14.get(i16);
                            i16++;
                            arrayList16.add(Long.valueOf(((p84) obj5).b));
                            arrayList15.add(null);
                        }
                        sQLiteCursor4 = sQLiteDatabase2.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList16) + ")", new Object[0]);
                        while (true) {
                            if (sQLiteCursor4.next()) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor4.byteBufferValue(0);
                                TLRPC.TL_factCheck TLdeserialize = TLRPC.TL_factCheck.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                if (TLdeserialize != null) {
                                    int i17 = -1;
                                    while (i6 < arrayList14.size()) {
                                        if (TLdeserialize.hash == ((p84) arrayList14.get(i6)).b) {
                                            i17 = i6;
                                        }
                                        i6++;
                                    }
                                    if (i17 >= 0 && i17 < arrayList15.size()) {
                                        arrayList15.set(i17, TLdeserialize);
                                    }
                                }
                            }
                        }
                        sQLiteCursor4.dispose();
                    } catch (Exception e8) {
                        cc4.g(e8, true);
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                    }
                    hl.c3(new vx3(r4cVar, arrayList15, (byte) 11));
                    return;
                } catch (Throwable th7) {
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th7;
                }
            case 25:
                gb4 gb4Var = (gb4) this.b;
                int[] iArr = (int[]) this.c;
                xa4 xa4Var = (xa4) this.d;
                gb4Var.l = null;
                gb4Var.k = true;
                int i18 = iArr[0] - 1;
                iArr[0] = i18;
                if (i18 == 0) {
                    xa4Var.run();
                    return;
                }
                return;
            case 26:
                hb4 hb4Var = (hb4) this.b;
                File[] fileArr = (File[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                if (hb4Var.Y != 3 || hb4Var.z) {
                    fileArr[0] = hb4Var.J0;
                } else {
                    fileArr[0] = hb4Var.L0;
                }
                countDownLatch.countDown();
                return;
            case 27:
                xb4 xb4Var = (xb4) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                Object obj6 = this.d;
                if (document == null) {
                    ConcurrentHashMap concurrentHashMap2 = hd4.I;
                } else {
                    Integer num = (Integer) hd4.J.get(Long.valueOf(document.id));
                    if (num != null) {
                        i5 = num.intValue();
                    }
                }
                xb4Var.Y(document, null, null, null, null, obj6, null, 0L, i5, xb4.N, 0L, false, 0);
                return;
            case 28:
                xb4 xb4Var2 = (xb4) this.b;
                zb4 zb4Var = (zb4) this.c;
                hb4 hb4Var2 = (hb4) this.d;
                if (((ArrayList) zb4Var.d).remove(hb4Var2)) {
                    xb4Var2.w.remove(hb4Var2.r);
                    zb4Var.b(hb4Var2.j);
                    return;
                }
                return;
            default:
                ic4 ic4Var = (ic4) this.b;
                File file = (File) this.c;
                hc4 hc4Var = (hc4) this.d;
                ic4Var.c();
                try {
                    try {
                        sQLitePreparedStatement = ic4Var.c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                        sQLitePreparedStatement.bindLong(2, hc4Var.a);
                        sQLitePreparedStatement.bindInteger(3, hc4Var.b);
                        sQLitePreparedStatement.bindInteger(4, hc4Var.c);
                        sQLitePreparedStatement.step();
                    } catch (Exception e9) {
                        cc4.g(e9, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th8) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th8;
                }
        }
    }
}

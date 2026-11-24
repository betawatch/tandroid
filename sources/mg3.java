// default package

import android.content.Intent;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessagingService;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.nio.ByteBuffer;
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
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.ExternalActionActivity;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mg3(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0699  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.User user;
        SQLiteCursor sQLiteCursor2;
        int i;
        SQLiteDatabase sQLiteDatabase;
        int i2;
        long j = 0;
        byte b = 4;
        byte b2 = 3;
        b2 = 3;
        int i3 = 0;
        SQLiteCursor sQLiteCursor3 = null;
        r9 = null;
        Bitmap bitmap = null;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r9 = null;
        SQLiteCursor sQLiteCursor4 = null;
        switch (this.a) {
            case 0:
                cj3 cj3Var = (cj3) this.b;
                yh1 yh1Var = (yh1) this.c;
                d dVar = (d) this.d;
                cj3Var.removeSelfFromStack();
                yh1Var.removeSelfFromStack();
                dVar.finishFragment();
                return;
            case 1:
                cj3 cj3Var2 = (cj3) this.b;
                bj3 bj3Var = (bj3) this.c;
                int length = ((Object[]) this.d).length;
                cj3Var2.K4(bj3Var);
                qi3 qi3Var = cj3Var2.A0;
                if (qi3Var == null || qi3Var.getVisibility() != 0) {
                    return;
                }
                cj3Var2.A0.c();
                return;
            case 2:
                ti3 ti3Var = (ti3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                t97 t97Var = (t97) this.d;
                ti3Var.getClass();
                boolean z = zArr[0];
                cj3 cj3Var3 = ti3Var.b;
                if (z) {
                    cj3Var3.presentFragment(new mc4(t97Var, null));
                    return;
                } else {
                    cd4.a1(cj3Var3, t97Var, null);
                    return;
                }
            case 3:
                uj3 uj3Var = (uj3) this.b;
                ad7 ad7Var = (ad7) this.c;
                tj3 tj3Var = (tj3) this.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = ad7Var.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList4.add(Long.valueOf(queryFinalized.longValue(0)));
                            j = Math.max(j, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            try {
                                fa4.g(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                gl.d3(new o77((Object) uj3Var, (Object) arrayList3, j, (Object) str, (Object) tj3Var, (byte) 6));
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList i0 = ad7Var.i0(arrayList4);
                    int size = arrayList4.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList4.get(i4);
                        i4++;
                        long longValue = ((Long) obj).longValue();
                        int size2 = i0.size();
                        int i5 = i3;
                        while (true) {
                            if (i3 < size2) {
                                Object obj2 = i0.get(i3);
                                i3++;
                                user = (TLRPC.User) obj2;
                                if (user != null) {
                                    arrayList = arrayList4;
                                    arrayList2 = i0;
                                    if (user.id == longValue) {
                                    }
                                } else {
                                    arrayList = arrayList4;
                                    arrayList2 = i0;
                                }
                                arrayList4 = arrayList;
                                i0 = arrayList2;
                            } else {
                                arrayList = arrayList4;
                                arrayList2 = i0;
                                user = null;
                            }
                        }
                        if (user != null) {
                            arrayList3.add(user);
                        }
                        arrayList4 = arrayList;
                        i3 = i5;
                        i0 = arrayList2;
                    }
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    e = e2;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                gl.d3(new o77((Object) uj3Var, (Object) arrayList3, j, (Object) str, (Object) tj3Var, (byte) 6));
                return;
            case 4:
                bl3 bl3Var = (bl3) this.b;
                HashSet hashSet = (HashSet) this.c;
                sk3 sk3Var = (sk3) this.d;
                int i6 = bl3Var.t0;
                na7 q1 = na7.q1(i6);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair.first).booleanValue();
                    Long l = (Long) pair.second;
                    long longValue2 = l.longValue();
                    ConcurrentHashMap concurrentHashMap = booleanValue ? q1.Q : q1.P;
                    ad7 Y = ad7.Y(i6);
                    try {
                        sQLiteDatabase = Y.b;
                    } catch (Exception e3) {
                        e = e3;
                        sQLiteCursor2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    if (booleanValue) {
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue2, new Object[0]);
                        try {
                            try {
                            } catch (Exception e4) {
                                e = e4;
                                Y.n(e, true);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                i = 0;
                                concurrentHashMap.put(l, Integer.valueOf(i));
                            }
                            if (sQLiteCursor2.next()) {
                                i = sQLiteCursor2.intValue(0);
                                sQLiteCursor2.dispose();
                                concurrentHashMap.put(l, Integer.valueOf(i));
                            }
                            i = 0;
                            sQLiteCursor2.dispose();
                            concurrentHashMap.put(l, Integer.valueOf(i));
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
                                i = intValue2;
                                sQLiteCursor2.dispose();
                                concurrentHashMap.put(l, Integer.valueOf(i));
                            }
                        }
                        i = 0;
                        sQLiteCursor2.dispose();
                        concurrentHashMap.put(l, Integer.valueOf(i));
                    }
                }
                gl.d3(sk3Var);
                return;
            case 5:
                ((zk3) this.b).a((vf6) this.d, (ArrayList) this.c);
                return;
            case 6:
                ll3 ll3Var = (ll3) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                jl3 jl3Var = (jl3) this.d;
                ll3Var.getClass();
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                ll3Var.b();
                jl3Var.c(null, null);
                return;
            case 7:
                jm3 jm3Var = (jm3) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                jm3Var.getClass();
                DictationAsr.b0(str2, str3);
                jm3Var.A(str2);
                return;
            case 8:
                jm3 jm3Var2 = (jm3) this.b;
                String str4 = (String) this.c;
                kl3 kl3Var = (kl3) this.d;
                if (jm3Var2.r == 4) {
                    jm3Var2.r = (byte) 3;
                    jm3Var2.w(str4);
                    jm3Var2.w.d(kl3Var.a(), false);
                    jm3Var2.w.setRevert(true);
                    return;
                }
                return;
            case 9:
                eo3 eo3Var = (eo3) this.b;
                Runnable runnable = (Runnable) this.c;
                do3 do3Var = (do3) this.d;
                eo3Var.getClass();
                runnable.run();
                Utilities.e.c(new wc3(eo3Var, do3Var, (byte) 24));
                return;
            case 10:
                up3 up3Var = (up3) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = up3Var.H;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                ArrayList arrayList8 = up3Var.I;
                arrayList8.clear();
                arrayList8.addAll(arrayList6);
                return;
            case 11:
                vq3 vq3Var = (vq3) this.b;
                ((wq3) this.c).i(vq3Var.a, vq3Var.b, (Exception) this.d);
                return;
            case 12:
                vq3 vq3Var2 = (vq3) this.b;
                ((wq3) this.c).N(vq3Var2.a, vq3Var2.b, (vi2) this.d);
                return;
            case 13:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                return;
            case 14:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 15:
                ((zu3) this.b).o((TLRPC.TL_messages_stickerSet) ((TLObject) this.c), (k27) this.d);
                return;
            case 16:
                sv3 sv3Var = (sv3) this.b;
                String str5 = (String) this.c;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList9 = sv3Var.w;
                tv3 tv3Var = sv3Var.O;
                ArrayList arrayList10 = sv3Var.s;
                if (TextUtils.equals(str5, sv3Var.I)) {
                    sv3Var.y = 0;
                    arrayList10.clear();
                    arrayList9.clear();
                    sv3Var.E.clear();
                    sv3Var.n.clear();
                    sv3Var.y++;
                    arrayList10.add(null);
                    arrayList9.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList10.addAll(tL_messages_stickers.stickers);
                        sv3Var.y = tL_messages_stickers.stickers.size() + sv3Var.y;
                    }
                    sv3Var.J = sv3Var.I;
                    sv3Var.f();
                    jv3 jv3Var = tv3Var.b;
                    int i7 = jv3.q3;
                    jv3Var.z1(0, 0);
                    tv3Var.f.c(false);
                    tv3Var.e.n(false);
                    return;
                }
                return;
            case 17:
                p13 p13Var = (p13) this.b;
                afe afeVar = (afe) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    rl4 a = ide.a(p13Var.a);
                    if (a == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    ql4 ql4Var = (ql4) a.a;
                    synchronized (ql4Var.c) {
                        try {
                            ql4Var.e = threadPoolExecutor;
                        } finally {
                        }
                    }
                    a.a.b(new nw3(afeVar, threadPoolExecutor));
                    return;
                } catch (Throwable th6) {
                    afeVar.a(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 18:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 19:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                hd hdVar = (hd) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList11 = ExternalActionActivity.y;
                try {
                    hdVar.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        hd u0 = ij.u0(externalActionActivity, k96.M0(2131743581, null), true);
                        if (u0 != null) {
                            u0.setOnDismissListener(new cf(externalActionActivity, tL_error, (byte) 9));
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
                } catch (Exception e5) {
                    fa4.g(e5, true);
                    return;
                }
            case 20:
                ad7 ad7Var2 = (ad7) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                s0c s0cVar = (s0c) this.d;
                ArrayList arrayList13 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = ad7Var2.b;
                        ArrayList arrayList14 = new ArrayList();
                        int size3 = arrayList12.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj3 = arrayList12.get(i8);
                            i8++;
                            arrayList14.add(Long.valueOf(((u74) obj3).b));
                            arrayList13.add(null);
                        }
                        sQLiteCursor4 = sQLiteDatabase2.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList14) + ")", new Object[0]);
                        while (true) {
                            if (sQLiteCursor4.next()) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor4.byteBufferValue(0);
                                TLRPC.TL_factCheck TLdeserialize = TLRPC.TL_factCheck.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                if (TLdeserialize != null) {
                                    int i9 = -1;
                                    while (i3 < arrayList12.size()) {
                                        if (TLdeserialize.hash == ((u74) arrayList12.get(i3)).b) {
                                            i9 = i3;
                                        }
                                        i3++;
                                    }
                                    if (i9 >= 0 && i9 < arrayList13.size()) {
                                        arrayList13.set(i9, TLdeserialize);
                                    }
                                }
                            }
                        }
                        sQLiteCursor4.dispose();
                    } catch (Throwable th7) {
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                        throw th7;
                    }
                } catch (Exception e6) {
                    fa4.g(e6, true);
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                }
                gl.d3(new eu3(s0cVar, arrayList13, (byte) 14));
                return;
            case 21:
                k94 k94Var = (k94) this.b;
                int[] iArr = (int[]) this.c;
                b94 b94Var = (b94) this.d;
                k94Var.l = null;
                k94Var.k = true;
                int i10 = iArr[0] - 1;
                iArr[0] = i10;
                if (i10 == 0) {
                    b94Var.run();
                    return;
                }
                return;
            case 22:
                l94 l94Var = (l94) this.b;
                File[] fileArr = (File[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                if (l94Var.Y != 3 || l94Var.z) {
                    fileArr[0] = l94Var.J0;
                } else {
                    fileArr[0] = l94Var.L0;
                }
                countDownLatch.countDown();
                return;
            case 23:
                ba4 ba4Var = (ba4) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                Object obj4 = this.d;
                if (document == null) {
                    ConcurrentHashMap concurrentHashMap2 = kb4.I;
                } else {
                    Integer num = (Integer) kb4.J.get(Long.valueOf(document.id));
                    if (num != null) {
                        b2 = num.intValue();
                    }
                }
                ba4Var.Y(document, null, null, null, null, obj4, null, 0L, b2, ba4.N, 0L, false, 0);
                return;
            case 24:
                ba4 ba4Var2 = (ba4) this.b;
                u20 u20Var = (u20) this.c;
                l94 l94Var2 = (l94) this.d;
                if (((ArrayList) u20Var.d).remove(l94Var2)) {
                    ba4Var2.w.remove(l94Var2.r);
                    u20Var.b(l94Var2.j);
                    return;
                }
                return;
            case 25:
                la4 la4Var = (la4) this.b;
                File file = (File) this.c;
                ka4 ka4Var = (ka4) this.d;
                la4Var.c();
                try {
                    try {
                        sQLitePreparedStatement = la4Var.c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                        sQLitePreparedStatement.bindLong(2, ka4Var.a);
                        sQLitePreparedStatement.bindInteger(3, ka4Var.b);
                        sQLitePreparedStatement.bindInteger(4, ka4Var.c);
                        sQLitePreparedStatement.step();
                    } catch (Throwable th8) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th8;
                    }
                } catch (Exception e7) {
                    fa4.g(e7, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            case 26:
                pd4 pd4Var = (pd4) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                pd4Var.getClass();
                pd4.w0(tL_error2, pd4Var, u21.b0(pd4Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    na7.c1().edit().putBoolean("n_0", true).apply();
                    pd4Var.getMessagesController().d3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    mc4 mc4Var = new mc4(pd4Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    mc4Var.y = new rc4(pd4Var, b2);
                    mc4Var.x = new rc4(pd4Var, b);
                    pd4Var.presentFragment(mc4Var);
                    gl.e3(new vc4(pd4Var, tL_chatlists_exportedChatlistInvite, b2), 200L);
                    return;
                }
                return;
            case 27:
                cd4 cd4Var = (cd4) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                d dVar2 = cd4Var.r1;
                pd4.w0(tL_error3, dVar2, new u21(cd4Var.V1, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    na7.c1().edit().putBoolean("n_0", true).apply();
                    cd4Var.dismiss();
                    dVar2.getMessagesController().d3(true, null);
                    dVar2.presentFragment(new mc4(cd4Var.T1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    return;
                }
                return;
            case 28:
                jd4 jd4Var = (jd4) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                hd4 hd4Var = (hd4) this.d;
                if (tL_error4 != null) {
                    u21.b0(jd4Var.a).t(k96.M0(2131743640, null), null).j();
                    gl.r(hd4Var);
                    return;
                }
                return;
            default:
                td4 td4Var = (td4) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.d;
                wd4 wd4Var = td4Var.K;
                int[] iArr2 = wd4Var.U0;
                GLES20.glBindFramebuffer(36160, iArr2 != null ? iArr2[!wd4Var.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, wd4Var.g(!td4Var.U ? 1 : 0), 0);
                GLES20.glClear(0);
                int i11 = td4Var.V;
                if (i11 != 0 && (i2 = td4Var.W) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i11 * i2) << 2);
                    GLES20.glReadPixels(0, 0, td4Var.V, td4Var.W, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(td4Var.V, td4Var.W, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch2.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
        }
    }
}

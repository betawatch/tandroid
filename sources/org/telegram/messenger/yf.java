package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ee0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class yf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yf(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.c;
        TLRPC.Document document = (TLRPC.Document) this.b;
        fj fjVar = (fj) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, fjVar, null, 0L, i7, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.c;
        lg.f fVar = (lg.f) this.b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.w.remove(i7Var.r);
            fVar.b(i7Var.j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.c;
        File file = (File) this.b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.a);
                sQLitePreparedStatement.bindInteger(3, e8Var.b);
                sQLitePreparedStatement.bindInteger(4, e8Var.c);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                a8.g(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [of.b] */
    private final void d() {
        ob obVar = (ob) this.c;
        String str = (String) this.b;
        i7 i7Var = (i7) this.d;
        ec ecVar = obVar.b;
        HashMap hashMap = ecVar.h;
        ConcurrentHashMap concurrentHashMap = ecVar.i;
        sb sbVar = (sb) hashMap.remove(str);
        if (sbVar == null) {
            return;
        }
        ArrayList arrayList = sbVar.v;
        ecVar.g.remove(str);
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            String str2 = (String) sbVar.x.get(i7);
            String str3 = (String) sbVar.y.get(i7);
            int intValue = ((Integer) sbVar.z.get(i7)).intValue();
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
            int intValue2 = ((Integer) sbVar.w.get(i7)).intValue();
            sb sbVar2 = (sb) concurrentHashMap.get(str2);
            if (sbVar2 == null) {
                sbVar2 = new sb(ecVar);
                sbVar2.a = sbVar.a;
                sbVar2.h = sbVar.h;
                sbVar2.o = sbVar.o;
                sbVar2.p = i7Var.g();
                sbVar2.j = sbVar.j;
                sbVar2.c = sbVar.c;
                sbVar2.d = str2;
                sbVar2.i = sbVar.i;
                sbVar2.m = intValue;
                sbVar2.g = sbVar.g;
                sbVar2.r = sbVar.r;
                sbVar2.u = new tb(ecVar, sbVar2);
                sbVar2.f = str3;
                sbVar2.l = sbVar.l;
                sbVar2.n = sbVar.n;
                concurrentHashMap.put(str2, sbVar2);
                ecVar.j.add(ec.n(str2));
                arrayList2.add(sbVar2.u);
            }
            sbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            tb tbVar = (tb) arrayList2.get(i10);
            sb sbVar3 = tbVar.c;
            if (sbVar3.m == 1) {
                ecVar.q.c(tbVar);
            } else {
                com.google.android.gms.internal.cast.b0 b0Var = ecVar.p;
                int i11 = sbVar3.a;
                if (i11 != 1) {
                    b0Var.getClass();
                    tbVar = new of.b(i11, tbVar);
                }
                ((of.a) b0Var.b).execute(tbVar);
            }
        }
    }

    private final void f() {
        tb tbVar = (tb) this.c;
        tbVar.c.c((Drawable) this.b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) this.b;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 < iArr2[0] || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final void h() {
        qd qdVar = (qd) this.c;
        pd pdVar = (pd) this.b;
        pd pdVar2 = (pd) this.d;
        ArrayList arrayList = qdVar.J;
        if (pdVar != null) {
            arrayList.remove(pdVar);
        }
        arrayList.add(pdVar2);
        qdVar.K.k(pdVar2, pdVar2.a);
        qd.q();
        ks.e().k(ks.G4, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x06c7, code lost:
    
        if (r5 == null) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06c9, code lost:
    
        ((org.telegram.messenger.ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06d0, code lost:
    
        new org.telegram.ui.Components.k51(r0, r5).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06d9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06da, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
    
        return;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0686 A[Catch: Exception -> 0x05f3, TryCatch #7 {Exception -> 0x05f3, blocks: (B:288:0x05c5, B:290:0x05e8, B:292:0x05ee, B:295:0x0628, B:297:0x062c, B:299:0x0630, B:301:0x0636, B:303:0x063a, B:304:0x0679, B:306:0x0686, B:307:0x0691, B:309:0x06a2, B:311:0x06a6, B:313:0x06aa, B:315:0x06ae, B:318:0x06b5, B:320:0x06b9, B:323:0x06be, B:326:0x06c9, B:332:0x06da, B:336:0x06b3, B:339:0x063f, B:341:0x0647, B:346:0x0653, B:347:0x0656, B:349:0x0662, B:351:0x0668, B:352:0x0671, B:353:0x05f6, B:355:0x0600, B:357:0x0606, B:359:0x060e, B:364:0x061a, B:365:0x061d, B:361:0x0615, B:328:0x06d0, B:343:0x064e), top: B:287:0x05c5, inners: #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06a2 A[Catch: Exception -> 0x05f3, TryCatch #7 {Exception -> 0x05f3, blocks: (B:288:0x05c5, B:290:0x05e8, B:292:0x05ee, B:295:0x0628, B:297:0x062c, B:299:0x0630, B:301:0x0636, B:303:0x063a, B:304:0x0679, B:306:0x0686, B:307:0x0691, B:309:0x06a2, B:311:0x06a6, B:313:0x06aa, B:315:0x06ae, B:318:0x06b5, B:320:0x06b9, B:323:0x06be, B:326:0x06c9, B:332:0x06da, B:336:0x06b3, B:339:0x063f, B:341:0x0647, B:346:0x0653, B:347:0x0656, B:349:0x0662, B:351:0x0668, B:352:0x0671, B:353:0x05f6, B:355:0x0600, B:357:0x0606, B:359:0x060e, B:364:0x061a, B:365:0x061d, B:361:0x0615, B:328:0x06d0, B:343:0x064e), top: B:287:0x05c5, inners: #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06a6 A[Catch: Exception -> 0x05f3, TryCatch #7 {Exception -> 0x05f3, blocks: (B:288:0x05c5, B:290:0x05e8, B:292:0x05ee, B:295:0x0628, B:297:0x062c, B:299:0x0630, B:301:0x0636, B:303:0x063a, B:304:0x0679, B:306:0x0686, B:307:0x0691, B:309:0x06a2, B:311:0x06a6, B:313:0x06aa, B:315:0x06ae, B:318:0x06b5, B:320:0x06b9, B:323:0x06be, B:326:0x06c9, B:332:0x06da, B:336:0x06b3, B:339:0x063f, B:341:0x0647, B:346:0x0653, B:347:0x0656, B:349:0x0662, B:351:0x0668, B:352:0x0671, B:353:0x05f6, B:355:0x0600, B:357:0x0606, B:359:0x060e, B:364:0x061a, B:365:0x061d, B:361:0x0615, B:328:0x06d0, B:343:0x064e), top: B:287:0x05c5, inners: #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0647 A[Catch: Exception -> 0x05f3, TRY_LEAVE, TryCatch #7 {Exception -> 0x05f3, blocks: (B:288:0x05c5, B:290:0x05e8, B:292:0x05ee, B:295:0x0628, B:297:0x062c, B:299:0x0630, B:301:0x0636, B:303:0x063a, B:304:0x0679, B:306:0x0686, B:307:0x0691, B:309:0x06a2, B:311:0x06a6, B:313:0x06aa, B:315:0x06ae, B:318:0x06b5, B:320:0x06b9, B:323:0x06be, B:326:0x06c9, B:332:0x06da, B:336:0x06b3, B:339:0x063f, B:341:0x0647, B:346:0x0653, B:347:0x0656, B:349:0x0662, B:351:0x0668, B:352:0x0671, B:353:0x05f6, B:355:0x0600, B:357:0x0606, B:359:0x060e, B:364:0x061a, B:365:0x061d, B:361:0x0615, B:328:0x06d0, B:343:0x064e), top: B:287:0x05c5, inners: #4, #5, #8 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        TLRPC.Message message;
        int i10;
        String str;
        int i11 = 2;
        d1 d1Var = null;
        r5 = null;
        SQLiteCursor sQLiteCursor = null;
        r5 = null;
        List singletonList = null;
        d1Var = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ri riVar = (ri) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList = riVar.C0;
                if (tL_error != null) {
                    return;
                }
                riVar.D0 = false;
                arrayList.clear();
                arrayList.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
                ks.f(riVar.currentAccount).k(ks.o5, new Object[0]);
                return;
            case 1:
                org.telegram.ui.Components.b5.c0(((mp) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_channels_inviteToChannel) this.d, Boolean.TRUE);
                return;
            case 2:
                org.telegram.ui.Components.b5.f(((mp) this.c).currentAccount, (TLRPC.Chat) this.b, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 3:
                tr trVar = (tr) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                zj zjVar = (zj) this.d;
                int size = arrayList2.size();
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                    if (ephemeralMessage.top_msg_id == 0) {
                        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                        if (messageReplyHeader instanceof TLRPC.TL_messageReplyHeader) {
                            int i14 = messageReplyHeader.reply_to_top_id;
                            if (i14 != 0) {
                                messageReplyHeader.forum_topic = true;
                                ephemeralMessage.top_msg_id = i14;
                                ephemeralMessage.flags |= 2;
                            } else if (messageReplyHeader.reply_to_msg_id != 0) {
                                long o4 = n5.o(ephemeralMessage.peer_id);
                                TLRPC.MessageReplyHeader messageReplyHeader2 = ephemeralMessage.reply_to;
                                if (messageReplyHeader2.reply_to_ephemeral) {
                                    TL_ephemeral.EphemeralMessage W = trVar.W(messageReplyHeader2.reply_to_msg_id, o4);
                                    if (W != null && (i7 = W.top_msg_id) != 0) {
                                        ephemeralMessage.reply_to.forum_topic = true;
                                        ephemeralMessage.top_msg_id = i7;
                                        ephemeralMessage.flags |= 2;
                                    }
                                } else {
                                    TLRPC.Message c02 = trVar.c0(o4, messageReplyHeader2.reply_to_msg_id);
                                    if (c02 != null) {
                                        int Z1 = (int) fj.Z1(trVar.currentAccount, c02, trVar.Z(o4));
                                        ephemeralMessage.top_msg_id = Z1;
                                        if (Z1 != 0) {
                                            ephemeralMessage.reply_to.forum_topic = true;
                                            ephemeralMessage.flags |= 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                trVar.g1(arrayList2, true);
                zjVar.run();
                return;
            case 4:
                org.telegram.ui.Components.b5.c0(((zy) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_messages_forwardMessages) this.d, new Object[0]);
                return;
            case 5:
                z00 z00Var = (z00) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                int i15 = 0;
                boolean z10 = false;
                while (i15 < Math.min(arrayList3.size(), arrayList4.size())) {
                    fj fjVar = (fj) arrayList4.get(i15);
                    TLRPC.Message message2 = (TLRPC.Message) arrayList3.get(i15);
                    if (fjVar != null && (message = fjVar.k) != null && message2 != null) {
                        message.translatedText = message2.translatedText;
                        message.translatedPoll = message2.translatedPoll;
                        message.translatedToLanguage = message2.translatedToLanguage;
                        if (fjVar.g6(false)) {
                            z10 = true;
                        }
                    }
                    i15++;
                    z10 = z10;
                }
                if (z10) {
                    ks.f(z00Var.currentAccount).k(2, 0);
                    return;
                }
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.Components.nc[] ncVarArr = (org.telegram.ui.Components.nc[]) this.b;
                xi.a aVar = (xi.a) this.d;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                ncVarArr[0].setText(gd.M0(2131746411, null) + "...");
                ncVarArr[0].b.f(false);
                try {
                    ConnectionsManager.getInstance(j10.t0).checkProxy(aVar, new o(i11, zArr, ncVarArr));
                    return;
                } catch (NumberFormatException unused) {
                    zArr[0] = false;
                    ncVarArr[0].setText(gd.M0(2131743676, null));
                    org.telegram.ui.ActionBar.u6.U(ncVarArr[0], org.telegram.ui.ActionBar.n6.p7, null);
                    return;
                }
            case 7:
                h1 h1Var = (h1) this.c;
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.d;
                h1Var.h = false;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("version");
                    int i16 = jSONObject.getInt("version_code");
                    String string2 = jSONObject.getString("file_url");
                    String optString = jSONObject.optString("changelog", null);
                    int i17 = h1Var.b;
                    String str3 = h1Var.a;
                    if (str3 != null) {
                        if (bz.U(string, str3) && i16 > h1Var.b) {
                        }
                        str = h1Var.a;
                        if (str == null && h1Var.b != 0 && bz.U(str, string) && h1Var.b == i16) {
                            h1Var.f = string2;
                            h1Var.c = optString;
                        } else {
                            if (!TextUtils.isEmpty(h1Var.d)) {
                                try {
                                    new File(h1Var.d).delete();
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                            }
                            h1Var.d = null;
                            if (bz.U(h1.c(), string) || h1.d() >= i16) {
                                h1Var.a = null;
                                h1Var.b = 0;
                                h1Var.f = null;
                                h1Var.c = null;
                            } else {
                                h1Var.a = string;
                                h1Var.b = i16;
                                h1Var.f = string2;
                                h1Var.c = optString;
                            }
                        }
                        h1Var.e = System.currentTimeMillis();
                        h1Var.f();
                        if (h1Var.b != i17) {
                            ks.e().k(ks.T4, new Object[0]);
                        }
                        g0.r(h1Var.i);
                        e1 e1Var = h1Var.i;
                        boolean z11 = s2.a;
                        g0.h3(e1Var, 1200000L);
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        if (h1Var.b == i17 || t0.x) {
                            return;
                        }
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = t0.b;
                        }
                        String str4 = h1Var.a;
                        if (str4 != null && (i10 = h1Var.b) != 0) {
                            d1Var = new d1(str4, i10, h1Var.c);
                            break;
                        }
                        return;
                    }
                    if (bz.U(string, h1.c()) && i16 > h1.d()) {
                        if (!TextUtils.isEmpty(h1Var.d)) {
                            try {
                                new File(h1Var.d).delete();
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                        h1Var.d = null;
                        h1Var.a = string;
                        h1Var.b = i16;
                        h1Var.f = string2;
                        h1Var.c = optString;
                        h1Var.e = System.currentTimeMillis();
                        h1Var.f();
                        if (h1Var.b != i17) {
                        }
                        g0.r(h1Var.i);
                        e1 e1Var2 = h1Var.i;
                        boolean z112 = s2.a;
                        g0.h3(e1Var2, 1200000L);
                        if (runnable != null) {
                        }
                    }
                    str = h1Var.a;
                    if (str == null) {
                    }
                    if (!TextUtils.isEmpty(h1Var.d)) {
                    }
                    h1Var.d = null;
                    if (bz.U(h1.c(), string)) {
                    }
                    h1Var.a = null;
                    h1Var.b = 0;
                    h1Var.f = null;
                    h1Var.c = null;
                    h1Var.e = System.currentTimeMillis();
                    h1Var.f();
                    if (h1Var.b != i17) {
                    }
                    g0.r(h1Var.i);
                    e1 e1Var22 = h1Var.i;
                    boolean z1122 = s2.a;
                    g0.h3(e1Var22, 1200000L);
                    if (runnable != null) {
                    }
                } catch (Exception e12) {
                    a8.e("Failed to check for beta update at https://telegram.org/dl/android/apk-public-beta.json received: " + str2, e12);
                    return;
                }
                break;
            case 8:
                ArrayList arrayList5 = (ArrayList) this.c;
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                tj tjVar = (tj) this.d;
                arrayList5.add(null);
                if (atomicInteger.get() == arrayList5.size()) {
                    tjVar.run();
                    return;
                }
                return;
            case 9:
                c cVar = (c) this.c;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) this.b;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                ee0 ee0Var = (ee0) LaunchActivity.L();
                if (ee0Var == null) {
                    ee0Var = new ee0(cVar.a);
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ee0Var);
                    }
                }
                ee0Var.I1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
                return;
            case 10:
                v1 v1Var = (v1) this.c;
                u1 u1Var = (u1) this.b;
                ArrayList<TLRPC.User> arrayList6 = (ArrayList) this.d;
                v1Var.getClass();
                TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
                contactbirthdays.contacts = u1Var.a;
                contactbirthdays.users = arrayList6;
                v1Var.c = t1.b(contactbirthdays);
                return;
            case 11:
                y2 y2Var = (y2) this.c;
                Pair pair = (Pair) this.b;
                x10 x10Var = (x10) this.d;
                if (y2Var.c == null) {
                    y2Var.c = new HashMap();
                }
                ArrayList arrayList7 = (ArrayList) y2Var.c.get(pair);
                if (arrayList7 == null) {
                    HashMap hashMap = y2Var.c;
                    arrayList7 = new ArrayList();
                    hashMap.put(pair, arrayList7);
                }
                arrayList7.add(x10Var);
                return;
            case 12:
                TLObject tLObject2 = (TLObject) this.d;
                x10 x10Var2 = (x10) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (tLObject2 != null) {
                    x10Var2.a((TL_stories.TL_premium_boostsStatus) tLObject2);
                    return;
                }
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (tL_error2 == null || Q == null || !"CHANNEL_PRIVATE".equals(tL_error2.text)) {
                    org.telegram.ui.Components.lc.Y().g0(tL_error2, false);
                } else {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
                        alertDialog$Builder.a.S = gd.M0(R.string.AppName, null);
                        HashMap hashMap2 = new HashMap();
                        int i18 = org.telegram.ui.ActionBar.n6.L5;
                        hashMap2.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.n6.x0(null, i18, false)));
                        hashMap2.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.n6.x0(null, i18, false)));
                        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.n6.x0(null, i18, false), hashMap2);
                        alertDialog$Builder.a.X = true;
                        alertDialog$Builder.a.S = gd.M0(2131752318, null);
                        alertDialog$Builder.a.U = gd.M0(2131752430, null);
                        f3.m(null, 2131752030, alertDialog$Builder, null);
                    }
                }
                x10Var2.a(null);
                return;
            case 13:
                File file = (File) this.c;
                List<gg.c> list = (List) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                        if (list != null) {
                            try {
                                if (!list.isEmpty()) {
                                    SerializedData serializedData = new SerializedData(list.size() * 52);
                                    for (gg.c cVar2 : list) {
                                        RectF rectF = cVar2.a;
                                        serializedData.writeFloat(rectF.left);
                                        serializedData.writeFloat(rectF.top);
                                        serializedData.writeFloat(rectF.width());
                                        serializedData.writeFloat(rectF.height());
                                        float[] fArr = new float[9];
                                        cVar2.b.getValues(fArr);
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            serializedData.writeFloat(fArr[i19]);
                                        }
                                    }
                                    singletonList = Collections.singletonList("patterns = " + Utilities.f(serializedData.toByteArray()));
                                    serializedData.cleanup();
                                }
                            } catch (Throwable th2) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                            c8.h0.e(bitmap, gZIPOutputStream, singletonList);
                        } else {
                            Bitmap extractAlpha = bitmap.extractAlpha();
                            c8.h0.e(extractAlpha, gZIPOutputStream, singletonList);
                            extractAlpha.recycle();
                        }
                        gZIPOutputStream.close();
                        fileOutputStream.close();
                        return;
                    } finally {
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 14:
                i5 i5Var = (i5) this.c;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.b;
                Vector vector = (Vector) this.d;
                editor.remove("needGetStatuses").commit();
                if (!vector.objects.isEmpty()) {
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList<T> arrayList9 = vector.objects;
                    int size2 = arrayList9.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj2 = arrayList9.get(i20);
                        i20++;
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
                            TLRPC.User c22 = i5Var.getMessagesController().c2(Long.valueOf(tL_contactStatus.user_id));
                            if (c22 != null) {
                                c22.status = tL_contactStatus.status;
                            }
                            tL_user.status = tL_contactStatus.status;
                            arrayList8.add(tL_user);
                        }
                    }
                    i5Var.getMessagesStorage().k2(arrayList8, true);
                }
                ks notificationCenter = i5Var.getNotificationCenter();
                int i21 = mp.I8;
                notificationCenter.k(2, 4);
                return;
            case 15:
                i5 i5Var2 = (i5) this.c;
                ArrayList arrayList10 = (ArrayList) this.b;
                ArrayList arrayList11 = (ArrayList) this.d;
                for (int i22 = 0; i22 < arrayList10.size(); i22++) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList10.get(i22);
                    if (i5Var2.g0.get(Long.valueOf(tL_contact.user_id)) == null) {
                        i5Var2.f0.add(tL_contact);
                        i5Var2.g0.put(Long.valueOf(tL_contact.user_id), tL_contact);
                    }
                }
                for (int i23 = 0; i23 < arrayList11.size(); i23++) {
                    Long l10 = (Long) arrayList11.get(i23);
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) i5Var2.g0.get(l10);
                    if (tL_contact2 != null) {
                        i5Var2.f0.remove(tL_contact2);
                        i5Var2.g0.remove(l10);
                    }
                }
                if (!arrayList10.isEmpty()) {
                    i5Var2.N();
                    Utilities.h.c(new y4(i5Var2, new ArrayList(i5Var2.f0), i13));
                }
                i5Var2.F(i5.q(i5Var2.Z), false, false, false, false, true, false);
                i5Var2.d(!arrayList10.isEmpty());
                i5Var2.getNotificationCenter().k(25, new Object[0]);
                return;
            case 16:
                i5 i5Var3 = (i5) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.b;
                TLRPC.User user = (TLRPC.User) this.d;
                int i24 = 0;
                boolean z12 = false;
                while (i24 < updates.users.size()) {
                    TLRPC.User user2 = updates.users.get(i24);
                    boolean z13 = z12;
                    if (user2.contact) {
                        f5 f5Var = (f5) i5Var3.a0.get(user2.phone);
                        z13 = z12;
                        if (f5Var != null) {
                            String a10 = f5.a(f5Var.i, f5Var.j);
                            String a11 = f5.a(user.first_name, user.last_name);
                            z13 = z12;
                            if (f5Var.m == null) {
                                f5Var.m = user;
                                if (!a10.equals(a11)) {
                                    ArrayList arrayList12 = (ArrayList) i5Var3.c0.get(a11);
                                    if (arrayList12 == null) {
                                        arrayList12 = new ArrayList();
                                        i5Var3.c0.put(a11, arrayList12);
                                        i5Var3.d0.add(a11);
                                    }
                                    arrayList12.add(f5Var);
                                    ArrayList arrayList13 = (ArrayList) i5Var3.c0.get(a10);
                                    if (arrayList13 != null) {
                                        int size3 = arrayList13.size();
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 < size3) {
                                                Object obj3 = arrayList13.get(i25);
                                                i25++;
                                                if (obj3 instanceof f5) {
                                                    f5 f5Var2 = (f5) obj3;
                                                    if (f5Var2.a == f5Var.a) {
                                                        if (arrayList13.remove(f5Var2) && arrayList13.isEmpty()) {
                                                            i5Var3.c0.remove(a10);
                                                            i5Var3.d0.remove(a10);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z13 = true;
                            }
                        }
                    }
                    if (user2.contact && i5Var3.g0.get(Long.valueOf(user2.id)) == null) {
                        TLRPC.TL_contact tL_contact3 = new TLRPC.TL_contact();
                        tL_contact3.user_id = user2.id;
                        i5Var3.f0.add(tL_contact3);
                        i5Var3.g0.put(Long.valueOf(tL_contact3.user_id), tL_contact3);
                    }
                    i24++;
                    z12 = z13;
                }
                i5Var3.d(true);
                if (z12) {
                    i5Var3.E(i5Var3.c0, i5Var3.d0, i5Var3.e0, false);
                }
                i5Var3.getNotificationCenter().k(25, new Object[0]);
                return;
            case 17:
                s5 s5Var = (s5) this.c;
                Runnable runnable2 = (Runnable) this.b;
                r5 r5Var = (r5) this.d;
                s5Var.getClass();
                runnable2.run();
                Utilities.e.c(new z4(i12, s5Var, r5Var));
                return;
            case 18:
                a6 a6Var = (a6) this.c;
                ArrayList arrayList14 = (ArrayList) this.b;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = a6Var.H;
                arrayList16.clear();
                arrayList16.addAll(arrayList14);
                ArrayList arrayList17 = a6Var.I;
                arrayList17.clear();
                arrayList17.addAll(arrayList15);
                return;
            case 19:
                tr trVar2 = (tr) this.c;
                ArrayList arrayList18 = (ArrayList) this.b;
                q00 q00Var = (q00) this.d;
                ArrayList arrayList19 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = trVar2.b;
                        ArrayList arrayList20 = new ArrayList();
                        int size4 = arrayList18.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            Object obj4 = arrayList18.get(i26);
                            i26++;
                            arrayList20.add(Long.valueOf(((w6) obj4).b));
                            arrayList19.add(null);
                        }
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList20) + ")", new Object[0]);
                        while (true) {
                            if (sQLiteCursor.next()) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                TLRPC.TL_factCheck TLdeserialize = TLRPC.TL_factCheck.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                if (TLdeserialize != null) {
                                    int i27 = -1;
                                    while (i13 < arrayList18.size()) {
                                        if (TLdeserialize.hash == ((w6) arrayList18.get(i13)).b) {
                                            i27 = i13;
                                        }
                                        i13++;
                                    }
                                    if (i27 >= 0 && i27 < arrayList19.size()) {
                                        arrayList19.set(i27, TLdeserialize);
                                    }
                                }
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Exception e14) {
                        a8.g(e14, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                    g0.g3(new z4(i11, q00Var, arrayList19));
                    return;
                } catch (Throwable th4) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th4;
                }
            case 20:
                h7 h7Var = (h7) this.c;
                int[] iArr = (int[]) this.b;
                y6 y6Var = (y6) this.d;
                h7Var.l = null;
                h7Var.k = true;
                int i28 = iArr[0] - 1;
                iArr[0] = i28;
                if (i28 == 0) {
                    y6Var.run();
                    return;
                }
                return;
            case 21:
                i7 i7Var = (i7) this.c;
                File[] fileArr = (File[]) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                if (i7Var.Y != 3 || i7Var.z) {
                    fileArr[0] = i7Var.J0;
                } else {
                    fileArr[0] = i7Var.L0;
                }
                countDownLatch.countDown();
                return;
            case 22:
                a();
                return;
            case 23:
                b();
                return;
            case 24:
                c();
                return;
            case 25:
                d();
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                ri riVar2 = (ri) this.c;
                ArrayList arrayList21 = (ArrayList) this.b;
                pf pfVar = (pf) this.d;
                for (int i29 = 0; i29 < arrayList21.size(); i29++) {
                    fj fjVar2 = (fj) arrayList21.get(i29);
                    TLRPC.TL_message e02 = riVar2.getMessagesStorage().e0(fjVar2.e1(), fj.B0(fjVar2.k));
                    TLRPC.Message message3 = fjVar2.k;
                    message3.translatedToLanguage = e02.translatedToLanguage;
                    message3.translatedText = e02.translatedText;
                    fjVar2.g6(false);
                }
                pfVar.run();
                return;
        }
    }

    public /* synthetic */ yf(TLObject tLObject, x10 x10Var, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.d = tLObject;
        this.c = x10Var;
        this.b = tL_error;
    }
}

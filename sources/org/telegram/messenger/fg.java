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
import org.telegram.ui.xd0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fg(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.c;
        TLRPC.Document document = (TLRPC.Document) this.b;
        zi ziVar = (zi) this.d;
        int i3 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.id));
            if (num != null) {
                i3 = num.intValue();
            }
        }
        w7Var.Z(document, null, null, null, null, ziVar, null, 0L, i3, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.c;
        mg.f fVar = (mg.f) this.b;
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
    /* JADX WARN: Type inference failed for: r6v2, types: [lf.b] */
    private final void e() {
        jb jbVar = (jb) this.c;
        String str = (String) this.b;
        i7 i7Var = (i7) this.d;
        zb zbVar = jbVar.b;
        HashMap hashMap = zbVar.h;
        ConcurrentHashMap concurrentHashMap = zbVar.i;
        nb nbVar = (nb) hashMap.remove(str);
        if (nbVar == null) {
            return;
        }
        ArrayList arrayList = nbVar.v;
        zbVar.g.remove(str);
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            String str2 = (String) nbVar.x.get(i3);
            String str3 = (String) nbVar.y.get(i3);
            int intValue = ((Integer) nbVar.z.get(i3)).intValue();
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i3);
            int intValue2 = ((Integer) nbVar.w.get(i3)).intValue();
            nb nbVar2 = (nb) concurrentHashMap.get(str2);
            if (nbVar2 == null) {
                nbVar2 = new nb(zbVar);
                nbVar2.a = nbVar.a;
                nbVar2.h = nbVar.h;
                nbVar2.o = nbVar.o;
                nbVar2.p = i7Var.g();
                nbVar2.j = nbVar.j;
                nbVar2.c = nbVar.c;
                nbVar2.d = str2;
                nbVar2.i = nbVar.i;
                nbVar2.m = intValue;
                nbVar2.g = nbVar.g;
                nbVar2.r = nbVar.r;
                nbVar2.u = new ob(zbVar, nbVar2);
                nbVar2.f = str3;
                nbVar2.l = nbVar.l;
                nbVar2.n = nbVar.n;
                concurrentHashMap.put(str2, nbVar2);
                zbVar.j.add(zb.n(str2));
                arrayList2.add(nbVar2.u);
            }
            nbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ob obVar = (ob) arrayList2.get(i10);
            nb nbVar3 = obVar.c;
            if (nbVar3.m == 1) {
                zbVar.q.c(obVar);
            } else {
                com.google.android.gms.internal.cast.c0 c0Var = zbVar.p;
                int i11 = nbVar3.a;
                if (i11 != 1) {
                    c0Var.getClass();
                    obVar = new lf.b(i11, obVar);
                }
                ((lf.a) c0Var.b).execute(obVar);
            }
        }
    }

    private final void f() {
        ob obVar = (ob) this.c;
        obVar.c.c((Drawable) this.b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) this.b;
        Runnable runnable = (Runnable) this.d;
        int i3 = iArr[0] + 1;
        iArr[0] = i3;
        if (i3 < iArr2[0] || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final void h() {
        ld ldVar = (ld) this.c;
        kd kdVar = (kd) this.b;
        kd kdVar2 = (kd) this.d;
        ArrayList arrayList = ldVar.J;
        if (kdVar != null) {
            arrayList.remove(kdVar);
        }
        arrayList.add(kdVar2);
        ldVar.K.k(kdVar2, kdVar2.a);
        ld.q();
        hs.e().k(hs.D4, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x06c7, code lost:
    
        if (r5 == null) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06c9, code lost:
    
        ((org.telegram.messenger.ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06d0, code lost:
    
        new org.telegram.ui.Components.r41(r0, r5).show();
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
        int i3;
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
                li liVar = (li) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList = liVar.C0;
                if (tL_error != null) {
                    return;
                }
                liVar.D0 = false;
                arrayList.clear();
                arrayList.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
                hs.f(liVar.currentAccount).k(hs.l5, new Object[0]);
                return;
            case 1:
                org.telegram.ui.Components.t4.e0(((hp) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_channels_inviteToChannel) this.d, Boolean.TRUE);
                return;
            case 2:
                org.telegram.ui.Components.t4.f(((hp) this.c).currentAccount, (TLRPC.Chat) this.b, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 3:
                qr qrVar = (qr) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                tj tjVar = (tj) this.d;
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
                                long o10 = m5.o(ephemeralMessage.peer_id);
                                TLRPC.MessageReplyHeader messageReplyHeader2 = ephemeralMessage.reply_to;
                                if (messageReplyHeader2.reply_to_ephemeral) {
                                    TL_ephemeral.EphemeralMessage W = qrVar.W(messageReplyHeader2.reply_to_msg_id, o10);
                                    if (W != null && (i3 = W.top_msg_id) != 0) {
                                        ephemeralMessage.reply_to.forum_topic = true;
                                        ephemeralMessage.top_msg_id = i3;
                                        ephemeralMessage.flags |= 2;
                                    }
                                } else {
                                    TLRPC.Message c02 = qrVar.c0(o10, messageReplyHeader2.reply_to_msg_id);
                                    if (c02 != null) {
                                        int a22 = (int) zi.a2(qrVar.currentAccount, c02, qrVar.Z(o10));
                                        ephemeralMessage.top_msg_id = a22;
                                        if (a22 != 0) {
                                            ephemeralMessage.reply_to.forum_topic = true;
                                            ephemeralMessage.flags |= 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                qrVar.g1(arrayList2, true);
                tjVar.run();
                return;
            case 4:
                org.telegram.ui.Components.t4.e0(((yy) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_messages_forwardMessages) this.d, new Object[0]);
                return;
            case 5:
                x00 x00Var = (x00) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                int i15 = 0;
                boolean z10 = false;
                while (i15 < Math.min(arrayList3.size(), arrayList4.size())) {
                    zi ziVar = (zi) arrayList4.get(i15);
                    TLRPC.Message message2 = (TLRPC.Message) arrayList3.get(i15);
                    if (ziVar != null && (message = ziVar.k) != null && message2 != null) {
                        message.translatedText = message2.translatedText;
                        message.translatedPoll = message2.translatedPoll;
                        message.translatedToLanguage = message2.translatedToLanguage;
                        if (ziVar.h6(false)) {
                            z10 = true;
                        }
                    }
                    i15++;
                    z10 = z10;
                }
                if (z10) {
                    hs.f(x00Var.currentAccount).k(2, 0);
                    return;
                }
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.Components.hc[] hcVarArr = (org.telegram.ui.Components.hc[]) this.b;
                ui.a aVar = (ui.a) this.d;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                hcVarArr[0].setText(bd.M0(2131746614, null) + "...");
                hcVarArr[0].b.f(false);
                try {
                    ConnectionsManager.getInstance(h10.t0).checkProxy(aVar, new o(i11, zArr, hcVarArr));
                    return;
                } catch (NumberFormatException unused) {
                    zArr[0] = false;
                    hcVarArr[0].setText(bd.M0(2131743923, null));
                    org.telegram.ui.ActionBar.r6.V(hcVarArr[0], org.telegram.ui.ActionBar.k6.p7, null);
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
                        if (az.U(string, str3) && i16 > h1Var.b) {
                        }
                        str = h1Var.a;
                        if (str == null && h1Var.b != 0 && az.U(str, string) && h1Var.b == i16) {
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
                            if (az.U(h1.c(), string) || h1.d() >= i16) {
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
                            hs.e().k(hs.Q4, new Object[0]);
                        }
                        g0.r(h1Var.i);
                        e1 e1Var = h1Var.i;
                        boolean z11 = r2.a;
                        g0.i3(e1Var, 1200000L);
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        if (h1Var.b == i17 || t0.x) {
                            return;
                        }
                        Context context = LaunchActivity.K1;
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
                    if (az.U(string, h1.c()) && i16 > h1.d()) {
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
                        boolean z112 = r2.a;
                        g0.i3(e1Var2, 1200000L);
                        if (runnable != null) {
                        }
                    }
                    str = h1Var.a;
                    if (str == null) {
                    }
                    if (!TextUtils.isEmpty(h1Var.d)) {
                    }
                    h1Var.d = null;
                    if (az.U(h1.c(), string)) {
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
                    boolean z1122 = r2.a;
                    g0.i3(e1Var22, 1200000L);
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
                pj pjVar = (pj) this.d;
                arrayList5.add(null);
                if (atomicInteger.get() == arrayList5.size()) {
                    pjVar.run();
                    return;
                }
                return;
            case 9:
                c cVar = (c) this.c;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) this.b;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                xd0 xd0Var = (xd0) LaunchActivity.L();
                if (xd0Var == null) {
                    xd0Var = new xd0(cVar.a);
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(xd0Var);
                    }
                }
                xd0Var.z1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
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
                x2 x2Var = (x2) this.c;
                Pair pair = (Pair) this.b;
                u10 u10Var = (u10) this.d;
                if (x2Var.c == null) {
                    x2Var.c = new HashMap();
                }
                ArrayList arrayList7 = (ArrayList) x2Var.c.get(pair);
                if (arrayList7 == null) {
                    HashMap hashMap = x2Var.c;
                    arrayList7 = new ArrayList();
                    hashMap.put(pair, arrayList7);
                }
                arrayList7.add(u10Var);
                return;
            case 12:
                TLObject tLObject2 = (TLObject) this.d;
                u10 u10Var2 = (u10) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (tLObject2 != null) {
                    u10Var2.a((TL_stories.TL_premium_boostsStatus) tLObject2);
                    return;
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (tL_error2 == null || Q == null || !"CHANNEL_PRIVATE".equals(tL_error2.text)) {
                    org.telegram.ui.Components.fc.X().f0(tL_error2, false);
                } else {
                    LaunchActivity launchActivity = LaunchActivity.K1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
                        alertDialog$Builder.a.S = bd.M0(R.string.AppName, null);
                        HashMap hashMap2 = new HashMap();
                        int i18 = org.telegram.ui.ActionBar.k6.L5;
                        hashMap2.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, i18, false)));
                        hashMap2.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, i18, false)));
                        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.k6.x0(null, i18, false), hashMap2);
                        alertDialog$Builder.a.X = true;
                        alertDialog$Builder.a.S = bd.M0(2131752329, null);
                        alertDialog$Builder.a.U = bd.M0(2131752441, null);
                        k2.p1.B(null, 2131752041, alertDialog$Builder, null);
                    }
                }
                u10Var2.a(null);
                return;
            case 13:
                File file = (File) this.c;
                List<hg.c> list = (List) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                        if (list != null) {
                            try {
                                if (!list.isEmpty()) {
                                    SerializedData serializedData = new SerializedData(list.size() * 52);
                                    for (hg.c cVar2 : list) {
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
                            b8.bd.e(bitmap, gZIPOutputStream, singletonList);
                        } else {
                            Bitmap extractAlpha = bitmap.extractAlpha();
                            b8.bd.e(extractAlpha, gZIPOutputStream, singletonList);
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
                g5 g5Var = (g5) this.c;
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
                            TLRPC.User a23 = g5Var.getMessagesController().a2(Long.valueOf(tL_contactStatus.user_id));
                            if (a23 != null) {
                                a23.status = tL_contactStatus.status;
                            }
                            tL_user.status = tL_contactStatus.status;
                            arrayList8.add(tL_user);
                        }
                    }
                    g5Var.getMessagesStorage().k2(arrayList8, true);
                }
                hs notificationCenter = g5Var.getNotificationCenter();
                int i21 = hp.C8;
                notificationCenter.k(2, 4);
                return;
            case 15:
                g5 g5Var2 = (g5) this.c;
                ArrayList arrayList10 = (ArrayList) this.b;
                ArrayList arrayList11 = (ArrayList) this.d;
                for (int i22 = 0; i22 < arrayList10.size(); i22++) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList10.get(i22);
                    if (g5Var2.g0.get(Long.valueOf(tL_contact.user_id)) == null) {
                        g5Var2.f0.add(tL_contact);
                        g5Var2.g0.put(Long.valueOf(tL_contact.user_id), tL_contact);
                    }
                }
                for (int i23 = 0; i23 < arrayList11.size(); i23++) {
                    Long l10 = (Long) arrayList11.get(i23);
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) g5Var2.g0.get(l10);
                    if (tL_contact2 != null) {
                        g5Var2.f0.remove(tL_contact2);
                        g5Var2.g0.remove(l10);
                    }
                }
                if (!arrayList10.isEmpty()) {
                    g5Var2.N();
                    Utilities.h.c(new w4(g5Var2, new ArrayList(g5Var2.f0), i13));
                }
                g5Var2.F(g5.q(g5Var2.Z), false, false, false, false, true, false);
                g5Var2.d(!arrayList10.isEmpty());
                g5Var2.getNotificationCenter().k(25, new Object[0]);
                return;
            case 16:
                g5 g5Var3 = (g5) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.b;
                TLRPC.User user = (TLRPC.User) this.d;
                int i24 = 0;
                boolean z12 = false;
                while (i24 < updates.users.size()) {
                    TLRPC.User user2 = updates.users.get(i24);
                    boolean z13 = z12;
                    if (user2.contact) {
                        d5 d5Var = (d5) g5Var3.a0.get(user2.phone);
                        z13 = z12;
                        if (d5Var != null) {
                            String a10 = d5.a(d5Var.i, d5Var.j);
                            String a11 = d5.a(user.first_name, user.last_name);
                            z13 = z12;
                            if (d5Var.m == null) {
                                d5Var.m = user;
                                if (!a10.equals(a11)) {
                                    ArrayList arrayList12 = (ArrayList) g5Var3.c0.get(a11);
                                    if (arrayList12 == null) {
                                        arrayList12 = new ArrayList();
                                        g5Var3.c0.put(a11, arrayList12);
                                        g5Var3.d0.add(a11);
                                    }
                                    arrayList12.add(d5Var);
                                    ArrayList arrayList13 = (ArrayList) g5Var3.c0.get(a10);
                                    if (arrayList13 != null) {
                                        int size3 = arrayList13.size();
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 < size3) {
                                                Object obj3 = arrayList13.get(i25);
                                                i25++;
                                                if (obj3 instanceof d5) {
                                                    d5 d5Var2 = (d5) obj3;
                                                    if (d5Var2.a == d5Var.a) {
                                                        if (arrayList13.remove(d5Var2) && arrayList13.isEmpty()) {
                                                            g5Var3.c0.remove(a10);
                                                            g5Var3.d0.remove(a10);
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
                    if (user2.contact && g5Var3.g0.get(Long.valueOf(user2.id)) == null) {
                        TLRPC.TL_contact tL_contact3 = new TLRPC.TL_contact();
                        tL_contact3.user_id = user2.id;
                        g5Var3.f0.add(tL_contact3);
                        g5Var3.g0.put(Long.valueOf(tL_contact3.user_id), tL_contact3);
                    }
                    i24++;
                    z12 = z13;
                }
                g5Var3.d(true);
                if (z12) {
                    g5Var3.E(g5Var3.c0, g5Var3.d0, g5Var3.e0, false);
                }
                g5Var3.getNotificationCenter().k(25, new Object[0]);
                return;
            case 17:
                r5 r5Var = (r5) this.c;
                Runnable runnable2 = (Runnable) this.b;
                q5 q5Var = (q5) this.d;
                r5Var.getClass();
                runnable2.run();
                Utilities.e.c(new y4(i12, r5Var, q5Var));
                return;
            case 18:
                z5 z5Var = (z5) this.c;
                ArrayList arrayList14 = (ArrayList) this.b;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = z5Var.H;
                arrayList16.clear();
                arrayList16.addAll(arrayList14);
                ArrayList arrayList17 = z5Var.I;
                arrayList17.clear();
                arrayList17.addAll(arrayList15);
                return;
            case 19:
                qr qrVar2 = (qr) this.c;
                ArrayList arrayList18 = (ArrayList) this.b;
                o00 o00Var = (o00) this.d;
                ArrayList arrayList19 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = qrVar2.b;
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
                    g0.h3(new y4(i11, o00Var, arrayList19));
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
                e();
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
                li liVar2 = (li) this.c;
                ArrayList arrayList21 = (ArrayList) this.b;
                gf gfVar = (gf) this.d;
                for (int i29 = 0; i29 < arrayList21.size(); i29++) {
                    zi ziVar2 = (zi) arrayList21.get(i29);
                    TLRPC.TL_message e02 = liVar2.getMessagesStorage().e0(ziVar2.f1(), zi.B0(ziVar2.k));
                    TLRPC.Message message3 = ziVar2.k;
                    message3.translatedToLanguage = e02.translatedToLanguage;
                    message3.translatedText = e02.translatedText;
                    ziVar2.h6(false);
                }
                gfVar.run();
                return;
        }
    }

    public /* synthetic */ fg(TLObject tLObject, u10 u10Var, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.d = tLObject;
        this.c = u10Var;
        this.b = tL_error;
    }
}

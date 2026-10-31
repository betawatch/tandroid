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
import org.telegram.ui.hf0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mg(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    private final void a() {
        b8 b8Var = (b8) this.c;
        TLRPC.Document document = (TLRPC.Document) this.b;
        jj jjVar = (jj) this.d;
        int i10 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = x8.H;
        } else {
            Integer num = (Integer) x8.I.get(Long.valueOf(document.id));
            if (num != null) {
                i10 = num.intValue();
            }
        }
        b8Var.Z(document, null, null, null, null, jjVar, null, 0L, i10, b8.M, 0L, false, 0);
    }

    private final void b() {
        b8 b8Var = (b8) this.c;
        bg.h hVar = (bg.h) this.b;
        m7 m7Var = (m7) this.d;
        if (((ArrayList) hVar.d).remove(m7Var)) {
            b8Var.w.remove(m7Var.r);
            hVar.b(m7Var.j);
        }
    }

    private final void c() {
        k8 k8Var = (k8) this.c;
        File file = (File) this.b;
        j8 j8Var = (j8) this.d;
        k8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = k8Var.c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, j8Var.a);
                sQLitePreparedStatement.bindInteger(3, j8Var.b);
                sQLitePreparedStatement.bindInteger(4, j8Var.c);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                f8.g(e, true);
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
    /* JADX WARN: Type inference failed for: r6v2, types: [ze.b] */
    private final void d() {
        rb rbVar = (rb) this.c;
        String str = (String) this.b;
        m7 m7Var = (m7) this.d;
        hc hcVar = rbVar.b;
        HashMap hashMap = hcVar.h;
        ConcurrentHashMap concurrentHashMap = hcVar.i;
        vb vbVar = (vb) hashMap.remove(str);
        if (vbVar == null) {
            return;
        }
        ArrayList arrayList = vbVar.v;
        hcVar.g.remove(str);
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str2 = (String) vbVar.x.get(i10);
            String str3 = (String) vbVar.y.get(i10);
            int intValue = ((Integer) vbVar.z.get(i10)).intValue();
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
            int intValue2 = ((Integer) vbVar.w.get(i10)).intValue();
            vb vbVar2 = (vb) concurrentHashMap.get(str2);
            if (vbVar2 == null) {
                vbVar2 = new vb(hcVar);
                vbVar2.a = vbVar.a;
                vbVar2.h = vbVar.h;
                vbVar2.o = vbVar.o;
                vbVar2.p = m7Var.g();
                vbVar2.j = vbVar.j;
                vbVar2.c = vbVar.c;
                vbVar2.d = str2;
                vbVar2.i = vbVar.i;
                vbVar2.m = intValue;
                vbVar2.g = vbVar.g;
                vbVar2.r = vbVar.r;
                vbVar2.u = new wb(hcVar, vbVar2);
                vbVar2.f = str3;
                vbVar2.l = vbVar.l;
                vbVar2.n = vbVar.n;
                concurrentHashMap.put(str2, vbVar2);
                hcVar.j.add(hc.n(str2));
                arrayList2.add(vbVar2.u);
            }
            vbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            wb wbVar = (wb) arrayList2.get(i11);
            vb vbVar3 = wbVar.c;
            if (vbVar3.m == 1) {
                hcVar.q.c(wbVar);
            } else {
                com.google.android.gms.internal.cast.c0 c0Var = hcVar.p;
                int i12 = vbVar3.a;
                if (i12 != 1) {
                    c0Var.getClass();
                    wbVar = new ze.b(i12, wbVar);
                }
                ((ze.a) c0Var.b).execute(wbVar);
            }
        }
    }

    private final void f() {
        wb wbVar = (wb) this.c;
        wbVar.c.c((Drawable) this.b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) this.b;
        Runnable runnable = (Runnable) this.d;
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 < iArr2[0] || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final void h() {
        nd ndVar = (nd) this.c;
        md mdVar = (md) this.b;
        md mdVar2 = (md) this.d;
        ArrayList arrayList = ndVar.I;
        if (mdVar != null) {
            arrayList.remove(mdVar);
        }
        arrayList.add(mdVar2);
        ndVar.J.k(mdVar2, mdVar2.a);
        nd.q();
        zs.e().k(zs.D4, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x06ca, code lost:
    
        if (r5 == null) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06cc, code lost:
    
        ((org.telegram.messenger.ApplicationLoaderImpl) org.telegram.messenger.w0.a).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06d3, code lost:
    
        new org.telegram.ui.Components.a61(r0, r5).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06dd, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
    
        return;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0689 A[Catch: Exception -> 0x05f6, TryCatch #9 {Exception -> 0x05f6, blocks: (B:288:0x05c8, B:290:0x05eb, B:292:0x05f1, B:295:0x062b, B:297:0x062f, B:299:0x0633, B:301:0x0639, B:303:0x063d, B:304:0x067c, B:306:0x0689, B:307:0x0694, B:309:0x06a5, B:311:0x06a9, B:313:0x06ad, B:315:0x06b1, B:318:0x06b8, B:320:0x06bc, B:323:0x06c1, B:326:0x06cc, B:332:0x06dd, B:336:0x06b6, B:339:0x0642, B:341:0x064a, B:346:0x0656, B:347:0x0659, B:349:0x0665, B:351:0x066b, B:352:0x0674, B:353:0x05f9, B:355:0x0603, B:357:0x0609, B:359:0x0611, B:364:0x061d, B:365:0x0620, B:361:0x0618, B:328:0x06d3, B:343:0x0651), top: B:287:0x05c8, inners: #4, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06a5 A[Catch: Exception -> 0x05f6, TryCatch #9 {Exception -> 0x05f6, blocks: (B:288:0x05c8, B:290:0x05eb, B:292:0x05f1, B:295:0x062b, B:297:0x062f, B:299:0x0633, B:301:0x0639, B:303:0x063d, B:304:0x067c, B:306:0x0689, B:307:0x0694, B:309:0x06a5, B:311:0x06a9, B:313:0x06ad, B:315:0x06b1, B:318:0x06b8, B:320:0x06bc, B:323:0x06c1, B:326:0x06cc, B:332:0x06dd, B:336:0x06b6, B:339:0x0642, B:341:0x064a, B:346:0x0656, B:347:0x0659, B:349:0x0665, B:351:0x066b, B:352:0x0674, B:353:0x05f9, B:355:0x0603, B:357:0x0609, B:359:0x0611, B:364:0x061d, B:365:0x0620, B:361:0x0618, B:328:0x06d3, B:343:0x0651), top: B:287:0x05c8, inners: #4, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06a9 A[Catch: Exception -> 0x05f6, TryCatch #9 {Exception -> 0x05f6, blocks: (B:288:0x05c8, B:290:0x05eb, B:292:0x05f1, B:295:0x062b, B:297:0x062f, B:299:0x0633, B:301:0x0639, B:303:0x063d, B:304:0x067c, B:306:0x0689, B:307:0x0694, B:309:0x06a5, B:311:0x06a9, B:313:0x06ad, B:315:0x06b1, B:318:0x06b8, B:320:0x06bc, B:323:0x06c1, B:326:0x06cc, B:332:0x06dd, B:336:0x06b6, B:339:0x0642, B:341:0x064a, B:346:0x0656, B:347:0x0659, B:349:0x0665, B:351:0x066b, B:352:0x0674, B:353:0x05f9, B:355:0x0603, B:357:0x0609, B:359:0x0611, B:364:0x061d, B:365:0x0620, B:361:0x0618, B:328:0x06d3, B:343:0x0651), top: B:287:0x05c8, inners: #4, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x064a A[Catch: Exception -> 0x05f6, TRY_LEAVE, TryCatch #9 {Exception -> 0x05f6, blocks: (B:288:0x05c8, B:290:0x05eb, B:292:0x05f1, B:295:0x062b, B:297:0x062f, B:299:0x0633, B:301:0x0639, B:303:0x063d, B:304:0x067c, B:306:0x0689, B:307:0x0694, B:309:0x06a5, B:311:0x06a9, B:313:0x06ad, B:315:0x06b1, B:318:0x06b8, B:320:0x06bc, B:323:0x06c1, B:326:0x06cc, B:332:0x06dd, B:336:0x06b6, B:339:0x0642, B:341:0x064a, B:346:0x0656, B:347:0x0659, B:349:0x0665, B:351:0x066b, B:352:0x0674, B:353:0x05f9, B:355:0x0603, B:357:0x0609, B:359:0x0611, B:364:0x061d, B:365:0x0620, B:361:0x0618, B:328:0x06d3, B:343:0x0651), top: B:287:0x05c8, inners: #4, #5, #10 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        TLRPC.Message message;
        int i11;
        String str;
        int i12 = 2;
        g1 g1Var = null;
        r5 = null;
        SQLiteCursor sQLiteCursor = null;
        r5 = null;
        List singletonList = null;
        g1Var = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList = uiVar.B0;
                if (tL_error != null) {
                    return;
                }
                uiVar.C0 = false;
                arrayList.clear();
                arrayList.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
                zs.f(uiVar.currentAccount).k(zs.l5, new Object[0]);
                return;
            case 1:
                org.telegram.ui.Components.s4.e0(((vp) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_channels_inviteToChannel) this.d, Boolean.TRUE);
                return;
            case 2:
                org.telegram.ui.Components.s4.f(((vp) this.c).currentAccount, (TLRPC.Chat) this.b, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 3:
                hs hsVar = (hs) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                lk lkVar = (lk) this.d;
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
                                long o10 = o5.o(ephemeralMessage.peer_id);
                                TLRPC.MessageReplyHeader messageReplyHeader2 = ephemeralMessage.reply_to;
                                if (messageReplyHeader2.reply_to_ephemeral) {
                                    TL_ephemeral.EphemeralMessage W = hsVar.W(messageReplyHeader2.reply_to_msg_id, o10);
                                    if (W != null && (i10 = W.top_msg_id) != 0) {
                                        ephemeralMessage.reply_to.forum_topic = true;
                                        ephemeralMessage.top_msg_id = i10;
                                        ephemeralMessage.flags |= 2;
                                    }
                                } else {
                                    TLRPC.Message c02 = hsVar.c0(o10, messageReplyHeader2.reply_to_msg_id);
                                    if (c02 != null) {
                                        int a2 = (int) jj.a2(hsVar.currentAccount, c02, hsVar.Z(o10));
                                        ephemeralMessage.top_msg_id = a2;
                                        if (a2 != 0) {
                                            ephemeralMessage.reply_to.forum_topic = true;
                                            ephemeralMessage.flags |= 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hsVar.g1(arrayList2, true);
                lkVar.run();
                return;
            case 4:
                org.telegram.ui.Components.s4.e0(((qz) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_messages_forwardMessages) this.d, new Object[0]);
                return;
            case 5:
                t10 t10Var = (t10) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                int i15 = 0;
                boolean z10 = false;
                while (i15 < Math.min(arrayList3.size(), arrayList4.size())) {
                    jj jjVar = (jj) arrayList4.get(i15);
                    TLRPC.Message message2 = (TLRPC.Message) arrayList3.get(i15);
                    if (jjVar != null && (message = jjVar.k) != null && message2 != null) {
                        message.translatedText = message2.translatedText;
                        message.translatedPoll = message2.translatedPoll;
                        message.translatedToLanguage = message2.translatedToLanguage;
                        if (jjVar.e6(false)) {
                            z10 = true;
                        }
                    }
                    i15++;
                    z10 = z10;
                }
                if (z10) {
                    zs.f(t10Var.currentAccount).k(2, 0);
                    return;
                }
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) this.b;
                ji.b bVar = (ji.b) this.d;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                ecVarArr[0].setText(cd.L0(2131746621, null) + "...");
                ecVarArr[0].b.f(false);
                try {
                    ConnectionsManager.getInstance(d20.s0).checkProxy(bVar, new p(i12, zArr, ecVarArr));
                    return;
                } catch (NumberFormatException unused) {
                    zArr[0] = false;
                    ecVarArr[0].setText(cd.L0(2131743938, null));
                    org.telegram.ui.ActionBar.a7.V(ecVarArr[0], org.telegram.ui.ActionBar.t6.p7, null);
                    return;
                }
            case 7:
                k1 k1Var = (k1) this.c;
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.d;
                k1Var.h = false;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("version");
                    int i16 = jSONObject.getInt("version_code");
                    String string2 = jSONObject.getString("file_url");
                    String optString = jSONObject.optString("changelog", null);
                    int i17 = k1Var.b;
                    String str3 = k1Var.a;
                    if (str3 != null) {
                        if (tz.U(string, str3) && i16 > k1Var.b) {
                        }
                        str = k1Var.a;
                        if (str == null && k1Var.b != 0 && tz.U(str, string) && k1Var.b == i16) {
                            k1Var.f = string2;
                            k1Var.c = optString;
                        } else {
                            if (!TextUtils.isEmpty(k1Var.d)) {
                                try {
                                    new File(k1Var.d).delete();
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                            }
                            k1Var.d = null;
                            if (tz.U(k1.c(), string) || k1.d() >= i16) {
                                k1Var.a = null;
                                k1Var.b = 0;
                                k1Var.f = null;
                                k1Var.c = null;
                            } else {
                                k1Var.a = string;
                                k1Var.b = i16;
                                k1Var.f = string2;
                                k1Var.c = optString;
                            }
                        }
                        k1Var.e = System.currentTimeMillis();
                        k1Var.f();
                        if (k1Var.b != i17) {
                            zs.e().k(zs.Q4, new Object[0]);
                        }
                        i0.r(k1Var.i);
                        h1 h1Var = k1Var.i;
                        boolean z11 = v2.a;
                        i0.h3(h1Var, 1200000L);
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        if (k1Var.b == i17 || w0.x) {
                            return;
                        }
                        Context context = LaunchActivity.I1;
                        if (context == null) {
                            context = w0.b;
                        }
                        String str4 = k1Var.a;
                        if (str4 != null && (i11 = k1Var.b) != 0) {
                            g1Var = new g1(str4, i11, k1Var.c);
                            break;
                        }
                        return;
                    }
                    if (tz.U(string, k1.c()) && i16 > k1.d()) {
                        if (!TextUtils.isEmpty(k1Var.d)) {
                            try {
                                new File(k1Var.d).delete();
                            } catch (Exception e7) {
                                f8.g(e7, true);
                            }
                        }
                        k1Var.d = null;
                        k1Var.a = string;
                        k1Var.b = i16;
                        k1Var.f = string2;
                        k1Var.c = optString;
                        k1Var.e = System.currentTimeMillis();
                        k1Var.f();
                        if (k1Var.b != i17) {
                        }
                        i0.r(k1Var.i);
                        h1 h1Var2 = k1Var.i;
                        boolean z112 = v2.a;
                        i0.h3(h1Var2, 1200000L);
                        if (runnable != null) {
                        }
                    }
                    str = k1Var.a;
                    if (str == null) {
                    }
                    if (!TextUtils.isEmpty(k1Var.d)) {
                    }
                    k1Var.d = null;
                    if (tz.U(k1.c(), string)) {
                    }
                    k1Var.a = null;
                    k1Var.b = 0;
                    k1Var.f = null;
                    k1Var.c = null;
                    k1Var.e = System.currentTimeMillis();
                    k1Var.f();
                    if (k1Var.b != i17) {
                    }
                    i0.r(k1Var.i);
                    h1 h1Var22 = k1Var.i;
                    boolean z1122 = v2.a;
                    i0.h3(h1Var22, 1200000L);
                    if (runnable != null) {
                    }
                } catch (Exception e10) {
                    f8.e("Failed to check for beta update at https://telegram.org/dl/android/apk-public-beta.json received: " + str2, e10);
                    return;
                }
                break;
            case 8:
                ArrayList arrayList5 = (ArrayList) this.c;
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                ek ekVar = (ek) this.d;
                arrayList5.add(null);
                if (atomicInteger.get() == arrayList5.size()) {
                    ekVar.run();
                    return;
                }
                return;
            case 9:
                c cVar = (c) this.c;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) this.b;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                hf0 hf0Var = (hf0) LaunchActivity.L();
                if (hf0Var == null) {
                    hf0Var = new hf0(cVar.a);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(hf0Var);
                    }
                }
                hf0Var.y1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
                return;
            case 10:
                y1 y1Var = (y1) this.c;
                x1 x1Var = (x1) this.b;
                ArrayList<TLRPC.User> arrayList6 = (ArrayList) this.d;
                y1Var.getClass();
                TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
                contactbirthdays.contacts = x1Var.a;
                contactbirthdays.users = arrayList6;
                y1Var.c = w1.b(contactbirthdays);
                return;
            case 11:
                b3 b3Var = (b3) this.c;
                Pair pair = (Pair) this.b;
                q20 q20Var = (q20) this.d;
                if (b3Var.c == null) {
                    b3Var.c = new HashMap();
                }
                ArrayList arrayList7 = (ArrayList) b3Var.c.get(pair);
                if (arrayList7 == null) {
                    HashMap hashMap = b3Var.c;
                    arrayList7 = new ArrayList();
                    hashMap.put(pair, arrayList7);
                }
                arrayList7.add(q20Var);
                return;
            case 12:
                TLObject tLObject2 = (TLObject) this.d;
                q20 q20Var2 = (q20) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (tLObject2 != null) {
                    q20Var2.a((TL_stories.TL_premium_boostsStatus) tLObject2);
                    return;
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (tL_error2 == null || Q == null || !"CHANNEL_PRIVATE".equals(tL_error2.text)) {
                    org.telegram.ui.Components.cc.X().f0(tL_error2, false);
                } else {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
                        alertDialog$Builder.a.R = cd.L0(R.string.AppName, null);
                        HashMap hashMap2 = new HashMap();
                        int i18 = org.telegram.ui.ActionBar.t6.L5;
                        hashMap2.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.t6.x0(null, i18, false)));
                        hashMap2.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.t6.x0(null, i18, false)));
                        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.t6.x0(null, i18, false), hashMap2);
                        alertDialog$Builder.a.W = true;
                        alertDialog$Builder.a.R = cd.L0(2131752329, null);
                        alertDialog$Builder.a.T = cd.L0(2131752441, null);
                        i0.a.w(null, 2131752041, alertDialog$Builder, null);
                    }
                }
                q20Var2.a(null);
                return;
            case 13:
                File file = (File) this.c;
                List<wf.c> list = (List) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                        if (list != null) {
                            try {
                                if (!list.isEmpty()) {
                                    SerializedData serializedData = new SerializedData(list.size() * 52);
                                    for (wf.c cVar2 : list) {
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
                            w7.a9.e(bitmap, gZIPOutputStream, singletonList);
                        } else {
                            Bitmap extractAlpha = bitmap.extractAlpha();
                            w7.a9.e(extractAlpha, gZIPOutputStream, singletonList);
                            extractAlpha.recycle();
                        }
                        gZIPOutputStream.close();
                        fileOutputStream.close();
                        return;
                    } finally {
                    }
                } catch (Exception e11) {
                    f8.g(e11, true);
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
                            TLRPC.User Z1 = i5Var.getMessagesController().Z1(Long.valueOf(tL_contactStatus.user_id));
                            if (Z1 != null) {
                                Z1.status = tL_contactStatus.status;
                            }
                            tL_user.status = tL_contactStatus.status;
                            arrayList8.add(tL_user);
                        }
                    }
                    i5Var.getMessagesStorage().k2(arrayList8, true);
                }
                zs notificationCenter = i5Var.getNotificationCenter();
                int i21 = vp.D8;
                notificationCenter.k(2, 4);
                return;
            case 15:
                i5 i5Var2 = (i5) this.c;
                ArrayList arrayList10 = (ArrayList) this.b;
                ArrayList arrayList11 = (ArrayList) this.d;
                for (int i22 = 0; i22 < arrayList10.size(); i22++) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList10.get(i22);
                    if (i5Var2.f0.get(Long.valueOf(tL_contact.user_id)) == null) {
                        i5Var2.e0.add(tL_contact);
                        i5Var2.f0.put(Long.valueOf(tL_contact.user_id), tL_contact);
                    }
                }
                for (int i23 = 0; i23 < arrayList11.size(); i23++) {
                    Long l4 = (Long) arrayList11.get(i23);
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) i5Var2.f0.get(l4);
                    if (tL_contact2 != null) {
                        i5Var2.e0.remove(tL_contact2);
                        i5Var2.f0.remove(l4);
                    }
                }
                if (!arrayList10.isEmpty()) {
                    i5Var2.N();
                    Utilities.h.c(new z4(i5Var2, new ArrayList(i5Var2.e0), i13));
                }
                i5Var2.F(i5.q(i5Var2.Y), false, false, false, false, true, false);
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
                        f5 f5Var = (f5) i5Var3.Z.get(user2.phone);
                        z13 = z12;
                        if (f5Var != null) {
                            String a10 = f5.a(f5Var.i, f5Var.j);
                            String a11 = f5.a(user.first_name, user.last_name);
                            z13 = z12;
                            if (f5Var.m == null) {
                                f5Var.m = user;
                                if (!a10.equals(a11)) {
                                    ArrayList arrayList12 = (ArrayList) i5Var3.b0.get(a11);
                                    if (arrayList12 == null) {
                                        arrayList12 = new ArrayList();
                                        i5Var3.b0.put(a11, arrayList12);
                                        i5Var3.c0.add(a11);
                                    }
                                    arrayList12.add(f5Var);
                                    ArrayList arrayList13 = (ArrayList) i5Var3.b0.get(a10);
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
                                                            i5Var3.b0.remove(a10);
                                                            i5Var3.c0.remove(a10);
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
                    if (user2.contact && i5Var3.f0.get(Long.valueOf(user2.id)) == null) {
                        TLRPC.TL_contact tL_contact3 = new TLRPC.TL_contact();
                        tL_contact3.user_id = user2.id;
                        i5Var3.e0.add(tL_contact3);
                        i5Var3.f0.put(Long.valueOf(tL_contact3.user_id), tL_contact3);
                    }
                    i24++;
                    z12 = z13;
                }
                i5Var3.d(true);
                if (z12) {
                    i5Var3.E(i5Var3.b0, i5Var3.c0, i5Var3.d0, false);
                }
                i5Var3.getNotificationCenter().k(25, new Object[0]);
                return;
            case 17:
                t5 t5Var = (t5) this.c;
                Runnable runnable2 = (Runnable) this.b;
                s5 s5Var = (s5) this.d;
                t5Var.getClass();
                runnable2.run();
                Utilities.e.c(new e4(29, t5Var, s5Var));
                return;
            case 18:
                b6 b6Var = (b6) this.c;
                ArrayList arrayList14 = (ArrayList) this.b;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = b6Var.G;
                arrayList16.clear();
                arrayList16.addAll(arrayList14);
                ArrayList arrayList17 = b6Var.H;
                arrayList17.clear();
                arrayList17.addAll(arrayList15);
                return;
            case 19:
                hs hsVar2 = (hs) this.c;
                ArrayList arrayList18 = (ArrayList) this.b;
                k10 k10Var = (k10) this.d;
                ArrayList arrayList19 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar2.b;
                        ArrayList arrayList20 = new ArrayList();
                        int size4 = arrayList18.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            Object obj4 = arrayList18.get(i26);
                            i26++;
                            arrayList20.add(Long.valueOf(((z6) obj4).b));
                            arrayList19.add(null);
                        }
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList20) + ")", new Object[0]);
                        while (true) {
                            if (sQLiteCursor.next()) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                TLRPC.TL_factCheck TLdeserialize = TLRPC.TL_factCheck.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                if (TLdeserialize != null) {
                                    int i27 = -1;
                                    for (int i28 = 0; i28 < arrayList18.size(); i28++) {
                                        if (TLdeserialize.hash == ((z6) arrayList18.get(i28)).b) {
                                            i27 = i28;
                                        }
                                    }
                                    if (i27 >= 0 && i27 < arrayList19.size()) {
                                        arrayList19.set(i27, TLdeserialize);
                                    }
                                }
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Exception e12) {
                        f8.g(e12, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                    i0.g3(new t6(i13, k10Var, arrayList19));
                    return;
                } catch (Throwable th4) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th4;
                }
            case 20:
                l7 l7Var = (l7) this.c;
                int[] iArr = (int[]) this.b;
                b7 b7Var = (b7) this.d;
                l7Var.l = null;
                l7Var.k = true;
                int i29 = iArr[0] - 1;
                iArr[0] = i29;
                if (i29 == 0) {
                    b7Var.run();
                    return;
                }
                return;
            case 21:
                m7 m7Var = (m7) this.c;
                File[] fileArr = (File[]) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                if (m7Var.Y != 3 || m7Var.z) {
                    fileArr[0] = m7Var.J0;
                } else {
                    fileArr[0] = m7Var.L0;
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
                ui uiVar2 = (ui) this.c;
                ArrayList arrayList21 = (ArrayList) this.b;
                nf nfVar = (nf) this.d;
                for (int i30 = 0; i30 < arrayList21.size(); i30++) {
                    jj jjVar2 = (jj) arrayList21.get(i30);
                    TLRPC.TL_message e02 = uiVar2.getMessagesStorage().e0(jjVar2.f1(), jj.B0(jjVar2.k));
                    TLRPC.Message message3 = jjVar2.k;
                    message3.translatedToLanguage = e02.translatedToLanguage;
                    message3.translatedText = e02.translatedText;
                    jjVar2.e6(false);
                }
                nfVar.run();
                return;
        }
    }

    public /* synthetic */ mg(TLObject tLObject, q20 q20Var, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.d = tLObject;
        this.c = q20Var;
        this.b = tL_error;
    }
}

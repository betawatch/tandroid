package org.telegram.ui.Components;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import android.webkit.JsPromptResult;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements org.telegram.messenger.x10, org.telegram.messenger.ii, r4, org.telegram.ui.ActionBar.p1, org.telegram.messenger.ec, org.telegram.messenger.ir, v5.b, u5.e, g2.k, z2.k, SuccessContinuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hr(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // org.telegram.ui.Components.r4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L(int i3, int i10, boolean z10) {
        int i11;
        c40 c40Var = (c40) this.b;
        z30 z30Var = (z30) this.c;
        org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.d;
        k40 k40Var = c40Var.I0;
        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, c40Var.a.getAbsolutePath(), 0, true, 0, 0);
        if (z30Var != null) {
            yeVar.x = z30Var.c;
            yeVar.y = z30Var.d;
        }
        x30 x30Var = k40Var.h;
        boolean z11 = z10 || z30Var == null || z30Var.a;
        if (i3 == 0) {
            if (z30Var == null) {
                i11 = 0;
                x30Var.u(yeVar, b20Var, z11, i11, i10 == 0 ? i10 : 0, false, z30Var == null ? z30Var.e : 0L);
                k40Var.r(false, false);
            }
            i3 = z30Var.b;
        }
        i11 = i3;
        x30Var.u(yeVar, b20Var, z11, i11, i10 == 0 ? i10 : 0, false, z30Var == null ? z30Var.e : 0L);
        k40Var.r(false, false);
    }

    @Override // org.telegram.messenger.x10
    public void a(int i3, TLObject tLObject) {
        lr lrVar = (lr) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.m5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.hp.s1(lrVar.a).h0(-lrVar.R1.id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.hp.s1(lrVar.a).h0(lrVar.V1, ((Integer) obj).intValue(), d);
        }
    }

    @Override // g2.k
    public void accept(Object obj) {
        b8.kg kgVar = (b8.kg) this.b;
        ((w2.k0) obj).D(kgVar.b, (w2.g0) this.c, (w2.c0) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // u5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        q5.c cVar;
        int i3 = this.a;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        q5.c cVar2 = q5.c.d;
        int i13 = 2;
        int i14 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i15 = 0;
        u5.g gVar = (u5.g) this.b;
        switch (i3) {
            case 9:
                n5.h hVar = (n5.h) obj3;
                n5.l lVar = hVar.c;
                String str = hVar.a;
                n5.i iVar = (n5.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                u5.a aVar = gVar.d;
                if (simpleQueryForLong >= aVar.a) {
                    gVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long b10 = u5.g.b(sQLiteDatabase, iVar);
                if (b10 != null) {
                    insert = b10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(x5.a.a(iVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i16 = aVar.e;
                byte[] bArr2 = lVar.b;
                boolean z10 = bArr2.length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.e));
                contentValues2.put("payload_encoding", lVar.a.a);
                contentValues2.put("code", hVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", hVar.g);
                contentValues2.put("pseudonymous_id", hVar.h);
                contentValues2.put("experiment_ids_clear_blob", hVar.i);
                contentValues2.put("experiment_ids_encrypted_blob", hVar.j);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(bArr2.length / i16);
                    for (int i17 = 1; i17 <= ceil; i17++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(hVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 10:
                ArrayList arrayList = (ArrayList) obj3;
                n5.i iVar2 = (n5.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    int i18 = cursor2.getInt(7) != 0 ? i14 : 0;
                    g2.f0 f0Var = new g2.f0();
                    f0Var.f = new HashMap();
                    String string = cursor2.getString(i14);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    f0Var.a = string;
                    f0Var.d = Long.valueOf(cursor2.getLong(i13));
                    f0Var.e = Long.valueOf(cursor2.getLong(3));
                    if (i18 != 0) {
                        String string2 = cursor2.getString(4);
                        f0Var.c = new n5.l(string2 == null ? u5.g.f : new k5.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        k5.c cVar3 = string3 == null ? u5.g.f : new k5.c(string3);
                        Cursor query = gVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i19 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i19 += blob.length;
                            }
                            byte[] bArr3 = new byte[i19];
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i20);
                                cursor = query;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, i21, bArr4.length);
                                    i21 += bArr4.length;
                                    i20++;
                                    query = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            f0Var.c = new n5.l(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        f0Var.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        f0Var.g = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        f0Var.h = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        f0Var.i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        f0Var.j = cursor2.getBlob(11);
                    }
                    arrayList.add(new u5.b(j10, iVar2, f0Var.b()));
                    i13 = 2;
                    i14 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                ui.f fVar = (ui.f) obj2;
                ArrayList arrayList4 = (ArrayList) fVar.c;
                Cursor cursor3 = (Cursor) obj;
                gVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i15);
                    int i22 = cursor3.getInt(1);
                    q5.c cVar4 = q5.c.b;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar4 = q5.c.c;
                        } else if (i22 == 2) {
                            cVar = cVar2;
                            long j11 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new q5.d(j11, cVar));
                            i15 = 0;
                            i10 = 5;
                            i11 = 4;
                            i12 = 3;
                        } else if (i22 == i12) {
                            cVar4 = q5.c.e;
                        } else if (i22 == i11) {
                            cVar4 = q5.c.f;
                        } else if (i22 == i10) {
                            cVar4 = q5.c.h;
                        } else if (i22 == 6) {
                            cVar4 = q5.c.n;
                        } else {
                            x7.m.a(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j112 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new q5.d(j112, cVar));
                    i15 = 0;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i23 = q5.e.c;
                    new ArrayList();
                    arrayList4.add(new q5.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long o10 = gVar.b.o();
                SQLiteDatabase a10 = gVar.a();
                a10.beginTransaction();
                try {
                    Cursor rawQuery = a10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        q5.g gVar2 = new q5.g(rawQuery.getLong(0), o10);
                        rawQuery.close();
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        fVar.b = gVar2;
                        fVar.d = new q5.b(new q5.f(gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), u5.a.f.a));
                        fVar.e = (String) gVar.e.get();
                        return new q5.a((q5.g) fVar.b, DesugarCollections.unmodifiableList(arrayList4), (q5.b) fVar.d, (String) fVar.e);
                    } catch (Throwable th4) {
                        rawQuery.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    a10.endTransaction();
                    throw th5;
                }
        }
    }

    @Override // z2.k
    public g9.s1 c(int i3, d2.o1 o1Var, int[] iArr) {
        z2.i iVar = (z2.i) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        g9.f0 p10 = g9.i0.p();
        for (int i10 = 0; i10 < o1Var.a; i10++) {
            p10.c(new z2.j(i3, o1Var, i10, iVar, iArr[i10], str, str2));
        }
        return p10.f();
    }

    @Override // v5.b
    public Object d() {
        s5.a aVar = (s5.a) this.b;
        n5.i iVar = (n5.i) this.c;
        n5.h hVar = (n5.h) this.d;
        u5.g gVar = (u5.g) aVar.d;
        gVar.getClass();
        k5.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c2 = x7.m.c("SQLiteEventStore");
        if (Log.isLoggable(c2, 3)) {
            Log.d(c2, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new hr(gVar, hVar, iVar, 9))).getClass();
        aVar.a.E(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 4:
                ws0 ws0Var = (ws0) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((ei.k6) obj).F(arrayList);
                fc.a0(ws0Var.y1).Q(R.raw.ic_delete, 36, org.telegram.messenger.bd.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                ws0Var.V(false);
                break;
            case 7:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                xs xsVar = (xs) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(xsVar.getText().toString());
                    break;
                }
                break;
            default:
                vg.i0 i0Var = (vg.i0) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                i0Var.dismiss();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                    org.telegram.messenger.hp.s1(i0Var.a).Q3(chat, false);
                    org.telegram.messenger.hp.s1(i0Var.a).f0(chat.id, user);
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        switch (this.a) {
            case 1:
                dx dxVar = (dx) this.b;
                String str2 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                ex exVar = dxVar.a;
                if (str2.equals(exVar.w)) {
                    exVar.x = str;
                    exVar.n.addAll(arrayList);
                    runnable.run();
                    break;
                }
                break;
            default:
                xx xxVar = (xx) this.b;
                HashMap hashMap = (HashMap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = xxVar.f;
                if (xxVar.x.N == xxVar.b) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str3 = ((org.telegram.messenger.hi) arrayList.get(i3)).a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str3);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str3);
                            xxVar.h.add(arrayList2);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        yz0 yz0Var = (yz0) this.b;
        uo uoVar = (uo) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.cc p10 = imageReceiver.p();
        if (!z10 || p10 == null || (bitmap = p10.c) == null) {
            return;
        }
        Drawable drawable = uoVar.b;
        if (drawable instanceof la0) {
            la0 la0Var = (la0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            la0Var.s(yz0.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            la0Var.t(yz0Var.M);
            yz0Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
        org.telegram.ui.Components.voip.n1.l(chat, null, true, null, d2Var.getParentActivity(), d2Var, (org.telegram.messenger.c) this.d);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        za.q qVar = (za.q) this.d;
        String str2 = (String) obj;
        he0 c2 = FirebaseMessaging.c(firebaseMessaging.b);
        n9.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a10 = firebaseMessaging.i.a();
        synchronized (c2) {
            String a11 = za.q.a(System.currentTimeMillis(), str2, a10);
            if (a11 != null) {
                SharedPreferences.Editor edit = c2.a.edit();
                edit.putString(d + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.s() || qVar == null || !str2.equals(qVar.a)) {
            n9.h hVar2 = firebaseMessaging.a;
            hVar2.a();
            String str3 = hVar2.b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(str3);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                boolean s6 = firebaseMessaging.d.s();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (s6) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new za.g(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    public /* synthetic */ hr(ws0 ws0Var, ei.k6 k6Var, ArrayList arrayList) {
        this.a = 4;
        this.b = ws0Var;
        this.d = k6Var;
        this.c = arrayList;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}

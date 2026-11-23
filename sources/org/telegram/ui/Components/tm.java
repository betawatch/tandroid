package org.telegram.ui.Components;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.JsPromptResult;
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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.b20, org.telegram.messenger.pi, a5, org.telegram.messenger.kc, org.telegram.messenger.mr, p4.m0, m9.q, w5.b, v5.e, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tm(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // org.telegram.ui.Components.a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O(int i7, int i10, boolean z10) {
        int i11;
        u40 u40Var = (u40) this.b;
        r40 r40Var = (r40) this.c;
        org.telegram.messenger.f20 f20Var = (org.telegram.messenger.f20) this.d;
        c50 c50Var = u40Var.I0;
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, u40Var.a.getAbsolutePath(), 0, true, 0, 0);
        if (r40Var != null) {
            ffVar.x = r40Var.c;
            ffVar.y = r40Var.d;
        }
        p40 p40Var = c50Var.h;
        boolean z11 = z10 || r40Var == null || r40Var.a;
        if (i7 == 0) {
            if (r40Var == null) {
                i11 = 0;
                p40Var.u(ffVar, f20Var, z11, i11, i10 == 0 ? i10 : 0, false, r40Var == null ? r40Var.e : 0L);
                c50Var.s(false, false);
            }
            i7 = r40Var.b;
        }
        i11 = i7;
        p40Var.u(ffVar, f20Var, z11, i11, i10 == 0 ? i10 : 0, false, r40Var == null ? r40Var.e : 0L);
        c50Var.s(false, false);
    }

    @Override // org.telegram.messenger.b20
    public void a(int i7, TLObject tLObject) {
        as asVar = (as) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.n5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.np.u1(asVar.a).h0(-asVar.U1.id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.np.u1(asVar.a).h0(asVar.Y1, ((Integer) obj).intValue(), d);
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        a8.xa xaVar = (a8.xa) this.b;
        ((x2.k0) obj).C(xaVar.b, (x2.g0) this.c, (x2.c0) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // v5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        r5.c cVar;
        int i7 = this.a;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        r5.c cVar2 = r5.c.d;
        int i13 = 2;
        int i14 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i15 = 0;
        v5.g gVar = (v5.g) this.b;
        switch (i7) {
            case 14:
                o5.h hVar = (o5.h) obj3;
                o5.l lVar = hVar.c;
                String str = hVar.a;
                o5.i iVar = (o5.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                v5.a aVar = gVar.d;
                if (simpleQueryForLong >= aVar.a) {
                    gVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long b10 = v5.g.b(sQLiteDatabase, iVar);
                if (b10 != null) {
                    insert = b10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(y5.a.a(iVar.c)));
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
            case 15:
                ArrayList arrayList = (ArrayList) obj3;
                o5.i iVar2 = (o5.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j3 = cursor2.getLong(0);
                    int i18 = cursor2.getInt(7) != 0 ? i14 : 0;
                    h2.e0 e0Var = new h2.e0();
                    e0Var.f = new HashMap();
                    String string = cursor2.getString(i14);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    e0Var.a = string;
                    e0Var.d = Long.valueOf(cursor2.getLong(i13));
                    e0Var.e = Long.valueOf(cursor2.getLong(3));
                    if (i18 != 0) {
                        String string2 = cursor2.getString(4);
                        e0Var.c = new o5.l(string2 == null ? v5.g.f : new l5.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        l5.c cVar3 = string3 == null ? v5.g.f : new l5.c(string3);
                        Cursor query = gVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num");
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
                            e0Var.c = new o5.l(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        e0Var.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        e0Var.g = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        e0Var.h = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        e0Var.i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        e0Var.j = cursor2.getBlob(11);
                    }
                    arrayList.add(new v5.b(j3, iVar2, e0Var.b()));
                    i13 = 2;
                    i14 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                xi.e eVar = (xi.e) obj2;
                ArrayList arrayList4 = (ArrayList) eVar.b;
                Cursor cursor3 = (Cursor) obj;
                gVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i15);
                    int i22 = cursor3.getInt(1);
                    r5.c cVar4 = r5.c.b;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar4 = r5.c.c;
                        } else if (i22 == 2) {
                            cVar = cVar2;
                            long j10 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new r5.d(j10, cVar));
                            i15 = 0;
                            i10 = 5;
                            i11 = 4;
                            i12 = 3;
                        } else if (i22 == i12) {
                            cVar4 = r5.c.e;
                        } else if (i22 == i11) {
                            cVar4 = r5.c.f;
                        } else if (i22 == i10) {
                            cVar4 = r5.c.h;
                        } else if (i22 == 6) {
                            cVar4 = r5.c.n;
                        } else {
                            c8.gc.a(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j102 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new r5.d(j102, cVar));
                    i15 = 0;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i23 = r5.e.c;
                    new ArrayList();
                    arrayList4.add(new r5.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long r10 = gVar.b.r();
                SQLiteDatabase a10 = gVar.a();
                a10.beginTransaction();
                try {
                    Cursor rawQuery = a10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        r5.g gVar2 = new r5.g(rawQuery.getLong(0), r10);
                        rawQuery.close();
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        eVar.a = gVar2;
                        eVar.c = new r5.b(new r5.f(gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), v5.a.f.a));
                        eVar.d = (String) gVar.e.get();
                        return new r5.a((r5.g) eVar.a, DesugarCollections.unmodifiableList(arrayList4), (r5.b) eVar.c, (String) eVar.d);
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

    @Override // org.telegram.messenger.mr
    public void d(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
        org.telegram.ui.Components.voip.b2.l(chat, null, true, null, g2Var.getParentActivity(), g2Var, (org.telegram.messenger.c) this.d);
    }

    @Override // org.telegram.messenger.pi
    public void e(String str, ArrayList arrayList) {
        switch (this.a) {
            case 2:
                rx rxVar = (rx) this.b;
                String str2 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                sx sxVar = rxVar.a;
                if (str2.equals(sxVar.w)) {
                    sxVar.x = str;
                    sxVar.n.addAll(arrayList);
                    runnable.run();
                    break;
                }
                break;
            default:
                ny nyVar = (ny) this.b;
                HashMap hashMap = (HashMap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = nyVar.f;
                if (nyVar.x.N == nyVar.b) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str3 = ((org.telegram.messenger.oi) arrayList.get(i7)).a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str3);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str3);
                            nyVar.h.add(arrayList2);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    @Override // p4.m0
    public void f(p4.v vVar) {
        p4.n0 n0Var = (p4.n0) this.b;
        Bundle bundle = (Bundle) this.c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        p4.e0 e0Var = n0Var.h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        m9.w n10 = e0Var.n(vVar);
        if (resultReceiver != null) {
            n10.b(new p4.z(1, n10, resultReceiver), m9.r.a);
        }
    }

    @Override // w5.b
    public Object g() {
        t5.a aVar = (t5.a) this.b;
        o5.i iVar = (o5.i) this.c;
        o5.h hVar = (o5.h) this.d;
        v5.g gVar = (v5.g) aVar.d;
        gVar.getClass();
        l5.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c10 = c8.gc.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            StringBuilder sb2 = new StringBuilder("Storing event with priority=");
            sb2.append(dVar);
            sb2.append(", name=");
            sb2.append(str);
            sb2.append(" for destination ");
            p5.c.t(sb2, str2, c10);
        }
        ((Long) gVar.c(new tm(gVar, hVar, iVar, 14))).getClass();
        aVar.a.H(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                tn tnVar = (tn) obj3;
                View view = (View) obj2;
                tnVar.getClass();
                view.setTag(null);
                tnVar.c0(view, (org.telegram.ui.Cells.b6) obj, false);
                break;
            case 5:
                jt0 jt0Var = (jt0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ((fi.a6) obj2).F(arrayList);
                lc.b0(jt0Var.y1).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                jt0Var.V(false);
                break;
            case 8:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                ot otVar = (ot) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(otVar.getText().toString());
                    break;
                }
                break;
            default:
                ug.k0 k0Var = (ug.k0) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                k0Var.dismiss();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                    org.telegram.messenger.np.u1(k0Var.a).X3(chat, false);
                    org.telegram.messenger.np.u1(k0Var.a).f0(chat.id, user);
                }
                break;
        }
    }

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        k01 k01Var = (k01) this.b;
        mp mpVar = (mp) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.ic p10 = imageReceiver.p();
        if (!z10 || p10 == null || (bitmap = p10.c) == null) {
            return;
        }
        Drawable drawable = mpVar.b;
        if (drawable instanceof cb0) {
            cb0 cb0Var = (cb0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            cb0Var.s((wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100, k01.e(bitmap));
            cb0Var.t(k01Var.M);
            k01Var.invalidate();
        }
    }

    public /* synthetic */ tm(p4.n0 n0Var, p4.k1 k1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 9;
        this.b = n0Var;
        this.c = bundle;
        this.d = resultReceiver;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    @Override // m9.q, v5.e
    public m9.y apply(Object obj) {
        int i7 = this.a;
        int i10 = 11;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 10:
                p4.e0 e0Var = (p4.e0) obj4;
                Handler handler = e0Var.l;
                org.telegram.ui.Wallet.u4 u4Var = new org.telegram.ui.Wallet.u4(e0Var, (p4.v) obj3, new es0(e0Var, (p4.r0) obj2, (p4.w) obj, 21));
                p4.o1 o1Var = new p4.o1(0);
                String str = h2.l0.a;
                m9.e0 e0Var2 = new m9.e0();
                h2.l0.W(handler, new di.a8(e0Var2, u4Var, o1Var, i10));
                return e0Var2;
            default:
                p4.e0 e0Var3 = (p4.e0) obj4;
                p4.v vVar = (p4.v) obj3;
                List list = (List) obj;
                Handler handler2 = e0Var3.l;
                org.telegram.ui.Wallet.u4 u4Var2 = new org.telegram.ui.Wallet.u4(e0Var3, vVar, new p4.s0(e0Var3, obj2, (Object) vVar, (Object) list, 2));
                p4.o1 o1Var2 = new p4.o1(0);
                String str2 = h2.l0.a;
                m9.e0 e0Var4 = new m9.e0();
                h2.l0.W(handler2, new di.a8(e0Var4, u4Var2, o1Var2, i10));
                return e0Var4;
        }
    }
}

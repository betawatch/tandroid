package org.telegram.ui.Components;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import android.webkit.JsPromptResult;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy implements MediaDataController.KeywordResultCallback, e5, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, u5.b, t5.e, e2.j, x2.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qy(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        h60 h60Var = (h60) this.c;
        c60 c60Var = (c60) this.d;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.b;
        o60 o60Var = h60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, h60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (c60Var != null) {
            photoEntry.ttl = c60Var.c;
            photoEntry.effectId = c60Var.d;
        }
        o60Var.n.r(photoEntry, videoEditedInfo, z10 || c60Var == null || c60Var.a, i10 != 0 ? i10 : c60Var != null ? c60Var.b : 0, i11 != 0 ? i11 : 0, false, c60Var != null ? c60Var.e : 0L);
        o60Var.r(false, false);
    }

    @Override // x2.l
    public f9.s1 a(int i10, b2.q1 q1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.c;
        String str = (String) this.d;
        String str2 = (String) this.b;
        f9.f0 t10 = f9.i0.t();
        for (int i11 = 0; i11 < q1Var.a; i11++) {
            t10.c(new x2.k(i10, q1Var, i11, jVar, iArr[i11], str, str2));
        }
        return t10.f();
    }

    @Override // e2.j
    public void accept(Object obj) {
        a8.ng ngVar = (a8.ng) this.c;
        ((u2.k0) obj).c(ngVar.b, (u2.g0) this.d, (u2.c0) this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // t5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        p5.c cVar;
        int i10 = this.a;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        p5.c cVar2 = p5.c.d;
        int i14 = 2;
        int i15 = 1;
        Object obj2 = this.b;
        Object obj3 = this.d;
        int i16 = 0;
        t5.g gVar = (t5.g) this.c;
        switch (i10) {
            case 8:
                m5.h hVar = (m5.h) obj3;
                m5.m mVar = hVar.c;
                String str = hVar.a;
                m5.i iVar = (m5.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                t5.a aVar = gVar.d;
                if (simpleQueryForLong >= aVar.a) {
                    gVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long b10 = t5.g.b(sQLiteDatabase, iVar);
                if (b10 != null) {
                    insert = b10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(w5.a.a(iVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i17 = aVar.e;
                byte[] bArr2 = mVar.b;
                boolean z10 = bArr2.length <= i17;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.e));
                contentValues2.put("payload_encoding", mVar.a.a);
                contentValues2.put("code", hVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(bArr2.length / i17);
                    for (int i18 = 1; i18 <= ceil; i18++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i18 - 1) * i17, Math.min(i18 * i17, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i18));
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
            case 9:
                ArrayList arrayList = (ArrayList) obj3;
                m5.i iVar2 = (m5.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    int i19 = cursor2.getInt(7) != 0 ? i15 : 0;
                    aa.m0 m0Var = new aa.m0();
                    m0Var.f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    m0Var.b = string;
                    m0Var.a = Long.valueOf(cursor2.getLong(i14));
                    m0Var.e = Long.valueOf(cursor2.getLong(3));
                    if (i19 != 0) {
                        String string2 = cursor2.getString(4);
                        m0Var.d = new m5.m(string2 == null ? t5.g.f : new j5.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        j5.c cVar3 = string3 == null ? t5.g.f : new j5.c(string3);
                        Cursor query = gVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i20 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i20 += blob.length;
                            }
                            byte[] bArr3 = new byte[i20];
                            int i21 = 0;
                            int i22 = 0;
                            while (i21 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i21);
                                cursor = query;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, i22, bArr4.length);
                                    i22 += bArr4.length;
                                    i21++;
                                    query = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            m0Var.d = new m5.m(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        m0Var.c = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new t5.b(j10, iVar2, m0Var.h()));
                    i14 = 2;
                    i15 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                ti.e eVar = (ti.e) obj2;
                ArrayList arrayList4 = (ArrayList) eVar.c;
                Cursor cursor3 = (Cursor) obj;
                gVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i16);
                    int i23 = cursor3.getInt(1);
                    p5.c cVar4 = p5.c.b;
                    if (i23 != 0) {
                        if (i23 == 1) {
                            cVar4 = p5.c.c;
                        } else if (i23 == 2) {
                            cVar = cVar2;
                            long j11 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new p5.d(j11, cVar));
                            i16 = 0;
                            i11 = 5;
                            i12 = 4;
                            i13 = 3;
                        } else if (i23 == i13) {
                            cVar4 = p5.c.e;
                        } else if (i23 == i12) {
                            cVar4 = p5.c.f;
                        } else if (i23 == i11) {
                            cVar4 = p5.c.h;
                        } else if (i23 == 6) {
                            cVar4 = p5.c.n;
                        } else {
                            a8.of.a(Integer.valueOf(i23), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j112 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new p5.d(j112, cVar));
                    i16 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i24 = p5.e.c;
                    new ArrayList();
                    arrayList4.add(new p5.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long o10 = gVar.b.o();
                SQLiteDatabase a2 = gVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        p5.g gVar2 = new p5.g(rawQuery.getLong(0), o10);
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        eVar.b = gVar2;
                        eVar.d = new p5.b(new p5.f(gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), t5.a.f.a));
                        eVar.e = (String) gVar.e.get();
                        return new p5.a((p5.g) eVar.b, DesugarCollections.unmodifiableList(arrayList4), (p5.b) eVar.d, (String) eVar.e);
                    } catch (Throwable th4) {
                        rawQuery.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    a2.endTransaction();
                    throw th5;
                }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        d31 d31Var = (d31) this.c;
        xp xpVar = (xp) this.d;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.b;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null || (bitmap = bitmapSafe.bitmap) == null) {
            return;
        }
        Drawable drawable = xpVar.b;
        if (drawable instanceof uc0) {
            uc0 uc0Var = (uc0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            uc0Var.s(d31.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            uc0Var.t(d31Var.L);
            d31Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override // u5.b
    public Object f() {
        r5.a aVar = (r5.a) this.c;
        m5.i iVar = (m5.i) this.d;
        m5.h hVar = (m5.h) this.b;
        t5.g gVar = (t5.g) aVar.d;
        gVar.getClass();
        j5.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c10 = a8.of.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new qy(gVar, hVar, iVar, 8))).getClass();
        aVar.a.s(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 3:
                aw0 aw0Var = (aw0) this.c;
                di.s6 s6Var = (di.s6) this.d;
                ArrayList arrayList = (ArrayList) this.b;
                s6Var.F(arrayList);
                wc.b0(aw0Var.x1).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                aw0Var.S(false);
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.d;
                ju juVar = (ju) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(juVar.getText().toString());
                    break;
                }
                break;
            default:
                tg.j0.P((tg.j0) this.c, (ArrayList) this.d, (TLRPC.User) this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
        org.telegram.ui.Components.voip.g2.l(chat, null, true, null, r2Var.getParentActivity(), r2Var, (AccountInstance) this.b);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 0:
                ry ryVar = (ry) this.c;
                String str2 = (String) this.d;
                Runnable runnable = (Runnable) this.b;
                sy syVar = ryVar.a;
                if (str2.equals(syVar.v)) {
                    syVar.w = str;
                    syVar.n.addAll(arrayList);
                    runnable.run();
                    break;
                }
                break;
            default:
                lz lzVar = (lz) this.c;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.b;
                HashMap hashMap2 = lzVar.f;
                if (lzVar.w.M == lzVar.b) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str3 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str3);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str3);
                            lzVar.h.add(arrayList2);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}

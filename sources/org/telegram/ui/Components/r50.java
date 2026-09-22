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
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r50 implements c5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.f, x2.n, org.telegram.ui.oy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r50(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        u50 u50Var = (u50) this.b;
        p50 p50Var = (p50) this.c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        c60 c60Var = u50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, u50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (p50Var != null) {
            photoEntry.ttl = p50Var.c;
            photoEntry.effectId = p50Var.d;
        }
        c60Var.n.q(photoEntry, videoEditedInfo, z10 || p50Var == null || p50Var.a, i10 != 0 ? i10 : p50Var != null ? p50Var.b : 0, i11 != 0 ? i11 : 0, false, p50Var != null ? p50Var.e : 0L);
        c60Var.q(false, false);
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // s5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        o5.c cVar;
        int i10 = this.a;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        o5.c cVar2 = o5.c.d;
        int i14 = 2;
        int i15 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i16 = 0;
        s5.h hVar = (s5.h) this.b;
        switch (i10) {
            case 7:
                l5.h hVar2 = (l5.h) obj3;
                l5.m mVar = hVar2.c;
                String str = hVar2.a;
                l5.i iVar = (l5.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                s5.a aVar = hVar.d;
                if (simpleQueryForLong >= aVar.a) {
                    hVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long b10 = s5.h.b(sQLiteDatabase, iVar);
                if (b10 != null) {
                    insert = b10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(v5.a.a(iVar.c)));
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
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.e));
                contentValues2.put("payload_encoding", mVar.a.a);
                contentValues2.put("code", hVar2.b);
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
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(hVar2.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 8:
                ArrayList arrayList = (ArrayList) obj3;
                l5.i iVar2 = (l5.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j3 = cursor2.getLong(0);
                    boolean z11 = cursor2.getInt(7) != 0;
                    com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
                    nVar.f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    nVar.a = string;
                    nVar.d = Long.valueOf(cursor2.getLong(i14));
                    nVar.e = Long.valueOf(cursor2.getLong(3));
                    if (z11) {
                        String string2 = cursor2.getString(4);
                        nVar.c = new l5.m(string2 == null ? s5.h.f : new i5.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        i5.c cVar3 = string3 == null ? s5.h.f : new i5.c(string3);
                        Cursor query = hVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num");
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
                            nVar.c = new l5.m(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        nVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new s5.b(j3, iVar2, nVar.g()));
                    i14 = 2;
                    i15 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) obj2;
                ArrayList arrayList4 = (ArrayList) tVar.d;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i16);
                    int i22 = cursor3.getInt(1);
                    o5.c cVar4 = o5.c.b;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar4 = o5.c.c;
                        } else if (i22 == 2) {
                            cVar = cVar2;
                            long j10 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new o5.d(j10, cVar));
                            i16 = 0;
                            i11 = 5;
                            i12 = 4;
                            i13 = 3;
                        } else if (i22 == i13) {
                            cVar4 = o5.c.e;
                        } else if (i22 == i12) {
                            cVar4 = o5.c.f;
                        } else if (i22 == i11) {
                            cVar4 = o5.c.h;
                        } else if (i22 == 6) {
                            cVar4 = o5.c.n;
                        } else {
                            w7.g6.a(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j102 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new o5.d(j102, cVar));
                    i16 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i23 = o5.e.c;
                    new ArrayList();
                    arrayList4.add(new o5.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long q6 = hVar.b.q();
                SQLiteDatabase a2 = hVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        o5.g gVar = new o5.g(rawQuery.getLong(0), q6);
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        tVar.c = gVar;
                        tVar.e = new o5.b(new o5.f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), s5.a.f.a));
                        tVar.b = (String) hVar.e.get();
                        return new o5.a((o5.g) tVar.c, DesugarCollections.unmodifiableList(arrayList4), (o5.b) tVar.e, (String) tVar.b);
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

    @Override // x2.n
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.a; i11++) {
            u10.b(new x2.m(i10, l1Var, i11, jVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        k21 k21Var = (k21) this.b;
        lp lpVar = (lp) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null || (bitmap = bitmapSafe.bitmap) == null) {
            return;
        }
        Drawable drawable = lpVar.b;
        if (drawable instanceof nc0) {
            nc0 nc0Var = (nc0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            nc0Var.t(k21.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            nc0Var.u(k21Var.L);
            k21Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // t5.b
    public Object g() {
        q5.a aVar = (q5.a) this.b;
        l5.i iVar = (l5.i) this.c;
        l5.h hVar = (l5.h) this.d;
        s5.h hVar2 = (s5.h) aVar.d;
        hVar2.getClass();
        i5.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c10 = w7.g6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new r50(hVar2, hVar, iVar, 7))).getClass();
        aVar.a.V(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                lv0 lv0Var = (lv0) this.b;
                ai.t8 t8Var = (ai.t8) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                t8Var.F(arrayList);
                xc.a0(lv0Var.v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                lv0Var.L(false);
                break;
            case 4:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                bu buVar = (bu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(buVar.getText().toString());
                    break;
                }
                break;
            default:
                rg.j0.P((rg.j0) this.b, (ArrayList) this.c, (TLRPC.User) this.d);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
        org.telegram.ui.Components.voip.f2.l(chat, null, true, null, n2Var.getParentActivity(), n2Var, (AccountInstance) this.d);
    }

    @Override // org.telegram.ui.oy
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        return yh.y3.X((yh.y3) this.b, (TL_stars.TL_starGiftUnique) this.c, (org.telegram.ui.uy) this.d, arrayList);
    }
}

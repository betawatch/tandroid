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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lg1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements MediaDataController.KeywordResultCallback, f5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, e2.j, x2.k, org.telegram.ui.sy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nz(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        i60 i60Var = (i60) this.b;
        d60 d60Var = (d60) this.c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        p60 p60Var = i60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, i60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (d60Var != null) {
            photoEntry.ttl = d60Var.c;
            photoEntry.effectId = d60Var.d;
        }
        p60Var.n.s(photoEntry, videoEditedInfo, z10 || d60Var == null || d60Var.a, i10 != 0 ? i10 : d60Var != null ? d60Var.b : 0, i11 != 0 ? i11 : 0, false, d60Var != null ? d60Var.e : 0L);
        p60Var.r(false, false);
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean L(org.telegram.ui.yy yyVar) {
        return false;
    }

    @Override // x2.k
    public e9.x1 a(int i10, b2.q1 q1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        e9.k0 t10 = e9.n0.t();
        for (int i11 = 0; i11 < q1Var.a; i11++) {
            t10.c(new x2.j(i10, q1Var, i11, iVar, iArr[i11], str, str2));
        }
        return t10.f();
    }

    @Override // e2.j
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.b;
        ((u2.k0) obj).d(aVar.b, (u2.g0) this.c, (u2.c0) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // s5.e
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
        s5.g gVar = (s5.g) this.b;
        switch (i10) {
            case 7:
                l5.h hVar = (l5.h) obj3;
                l5.l lVar = hVar.c;
                String str = hVar.a;
                l5.i iVar = (l5.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                s5.a aVar = gVar.d;
                if (simpleQueryForLong >= aVar.a) {
                    gVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long b10 = s5.g.b(sQLiteDatabase, iVar);
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
                byte[] bArr2 = lVar.b;
                boolean z10 = bArr2.length <= i17;
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
            case 8:
                ArrayList arrayList = (ArrayList) obj3;
                l5.i iVar2 = (l5.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    int i19 = cursor2.getInt(7) != 0 ? i15 : 0;
                    com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
                    mVar.f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    mVar.a = string;
                    mVar.d = Long.valueOf(cursor2.getLong(i14));
                    mVar.e = Long.valueOf(cursor2.getLong(3));
                    if (i19 != 0) {
                        String string2 = cursor2.getString(4);
                        mVar.c = new l5.l(string2 == null ? s5.g.f : new i5.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        i5.c cVar3 = string3 == null ? s5.g.f : new i5.c(string3);
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
                            mVar.c = new l5.l(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        mVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new s5.b(j10, iVar2, mVar.g()));
                    i14 = 2;
                    i15 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) obj2;
                ArrayList arrayList4 = (ArrayList) sVar.d;
                Cursor cursor3 = (Cursor) obj;
                gVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i16);
                    int i23 = cursor3.getInt(1);
                    o5.c cVar4 = o5.c.b;
                    if (i23 != 0) {
                        if (i23 == 1) {
                            cVar4 = o5.c.c;
                        } else if (i23 == 2) {
                            cVar = cVar2;
                            long j11 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new o5.d(j11, cVar));
                            i16 = 0;
                            i11 = 5;
                            i12 = 4;
                            i13 = 3;
                        } else if (i23 == i13) {
                            cVar4 = o5.c.e;
                        } else if (i23 == i12) {
                            cVar4 = o5.c.f;
                        } else if (i23 == i11) {
                            cVar4 = o5.c.h;
                        } else if (i23 == 6) {
                            cVar4 = o5.c.n;
                        } else {
                            w7.l6.a(Integer.valueOf(i23), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j112 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new o5.d(j112, cVar));
                    i16 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i24 = o5.e.c;
                    new ArrayList();
                    arrayList4.add(new o5.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long d = gVar.b.d();
                SQLiteDatabase a2 = gVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        o5.g gVar2 = new o5.g(rawQuery.getLong(0), d);
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        sVar.c = gVar2;
                        sVar.e = new o5.b(new o5.f(gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), s5.a.f.a));
                        sVar.b = (String) gVar.e.get();
                        return new o5.a((o5.g) sVar.c, DesugarCollections.unmodifiableList(arrayList4), (o5.b) sVar.e, (String) sVar.b);
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
        v21 v21Var = (v21) this.b;
        yp ypVar = (yp) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null || (bitmap = bitmapSafe.bitmap) == null) {
            return;
        }
        Drawable drawable = ypVar.b;
        if (drawable instanceof cd0) {
            cd0 cd0Var = (cd0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            cd0Var.t(v21.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            cd0Var.u(v21Var.L);
            v21Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                xv0 xv0Var = (xv0) this.b;
                bi.f8 f8Var = (bi.f8) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                f8Var.F(arrayList);
                zc.a0(xv0Var.v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                xv0Var.L(false);
                break;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                nu nuVar = (nu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(nuVar.getText().toString());
                    break;
                }
                break;
            default:
                sg.j0.Q((sg.j0) this.b, (ArrayList) this.c, (TLRPC.User) this.d);
                break;
        }
    }

    @Override // t5.b
    public Object h() {
        q5.a aVar = (q5.a) this.b;
        l5.i iVar = (l5.i) this.c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c10 = w7.l6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new nz(gVar, hVar, iVar, 7))).getClass();
        aVar.a.U(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
        org.telegram.ui.Components.voip.d2.l(chat, null, true, null, m2Var.getParentActivity(), m2Var, (AccountInstance) this.d);
    }

    @Override // org.telegram.ui.sy
    public boolean w(org.telegram.ui.yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        return zh.r3.Y((zh.r3) this.b, (TL_stars.TL_starGiftUnique) this.c, (org.telegram.ui.yy) this.d, arrayList);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        pz pzVar = (pz) this.b;
        HashMap hashMap = (HashMap) this.c;
        Runnable runnable = (Runnable) this.d;
        HashMap hashMap2 = pzVar.f;
        if (pzVar.w.M != pzVar.b) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
            ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
            if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                hashMap2.put(arrayList2, str2);
                pzVar.h.add(arrayList2);
            }
        }
        runnable.run();
    }
}

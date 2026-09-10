package org.telegram.ui.Components;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
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
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ig1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f21 implements ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, org.telegram.ui.ActionBar.c2, t5.b, s5.e, x2.m, org.telegram.ui.qy, MessagesStorage.StringCallback, zh.p7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f21(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean J(org.telegram.ui.wy wyVar) {
        return false;
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
            case 5:
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
            case 6:
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
                        nVar.c = new l5.l(string2 == null ? s5.g.f : new i5.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        i5.c cVar3 = string3 == null ? s5.g.f : new i5.c(string3);
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
                            nVar.c = new l5.l(cVar3, bArr3);
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) obj2;
                ArrayList arrayList4 = (ArrayList) sVar.d;
                Cursor cursor3 = (Cursor) obj;
                gVar.getClass();
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
                            w7.i6.a(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
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
                long u10 = gVar.b.u();
                SQLiteDatabase a2 = gVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        o5.g gVar2 = new o5.g(rawQuery.getLong(0), u10);
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
        i21 i21Var = (i21) this.b;
        rp rpVar = (rp) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null || (bitmap = bitmapSafe.bitmap) == null) {
            return;
        }
        Drawable drawable = rpVar.b;
        if (drawable instanceof lc0) {
            lc0 lc0Var = (lc0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            lc0Var.t(i21.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            lc0Var.u(i21Var.L);
            i21Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // x2.m
    public e9.a1 e(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.a; i11++) {
            u10.b(new x2.l(i10, l1Var, i11, iVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                fu fuVar = (fu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(fuVar.getText().toString());
                    break;
                }
                break;
            default:
                qg.k0.P((qg.k0) this.b, (ArrayList) this.c, (TLRPC.User) this.d);
                break;
        }
    }

    @Override // t5.b
    public Object g() {
        q5.a aVar = (q5.a) this.b;
        l5.i iVar = (l5.i) this.c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c10 = w7.i6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new f21(gVar, hVar, iVar, 5))).getClass();
        aVar.a.U(iVar, 1, false);
        return null;
    }

    @Override // zh.p7
    public void i(Canvas canvas, RectF rectF, float f7) {
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) this.b;
        cl0 cl0Var = (cl0) this.c;
        int[] iArr = (int[]) this.d;
        u7Var.c(canvas, rectF, f7);
        u7Var.f(canvas, rectF, f7);
        if (u7Var.h) {
            u7Var.b(canvas, rectF, f7);
        } else {
            u7Var.e(canvas, rectF, f7);
        }
        if (cl0Var != null && cl0Var.a0 && cl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            cl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
        org.telegram.ui.Components.voip.e2.l(chat, null, true, null, p2Var.getParentActivity(), p2Var, (AccountInstance) this.d);
    }

    @Override // org.telegram.ui.qy
    public boolean v(org.telegram.ui.wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        return xh.x3.X((xh.x3) this.b, (TL_stars.TL_starGiftUnique) this.c, (org.telegram.ui.wy) this.d, arrayList);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        zh.v2 v2Var = (zh.v2) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
        zh.a3 a3Var = v2Var.l;
        a3Var.getStoriesController().r(a3Var.B1, str, new h7(v2Var, storyItem, f6Var, 11));
    }
}

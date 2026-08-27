package ag;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import hh.i5;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jh.d9;
import jh.x3;
import lh.o9;
import lh.q9;
import nh.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.co0;
import org.telegram.ui.gg;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements org.telegram.ui.ActionBar.a2, androidx.car.app.utils.d, e3.b, SuccessContinuation, d3.f, zx, MessagesStorage.StringCallback, d9, MediaDataController.KeywordResultCallback, co0, dc0, org.telegram.ui.ActionBar.r0, x4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean D() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 24:
                tk tkVar = (tk) this.b;
                tkVar.t0.d((TLRPC.TL_messageMediaGeo) this.c, tkVar.u0, z10, i10, ((Long) this.d).longValue());
                tkVar.b.dismiss(true);
                break;
            case 25:
                in inVar = (in) this.b;
                inVar.f0.e((TLRPC.TL_messageMediaToDo) this.c, null, null, null, z10, i10, ((Long) this.d).longValue());
                inVar.b.dismiss(true);
                break;
            default:
                j50 j50Var = (j50) this.b;
                e50 e50Var = (e50) this.c;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
                k50 k50Var = j50Var.D0;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, j50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (e50Var != null) {
                    photoEntry.ttl = e50Var.c;
                    photoEntry.effectId = e50Var.d;
                }
                k50Var.c.s(photoEntry, videoEditedInfo, z10 || e50Var == null || e50Var.a, i10 != 0 ? i10 : e50Var != null ? e50Var.b : 0, i11 != 0 ? i11 : 0, false, e50Var != null ? e50Var.e : 0L);
                k50Var.m(false, false);
                break;
        }
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean K(gy gyVar) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // d3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        z2.c cVar;
        int i10 = this.a;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        z2.c cVar2 = z2.c.d;
        int i14 = 2;
        int i15 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i16 = 0;
        d3.h hVar = (d3.h) this.b;
        switch (i10) {
            case 5:
                w2.h hVar2 = (w2.h) obj3;
                w2.l lVar = hVar2.c;
                String str = hVar2.a;
                w2.i iVar = (w2.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                d3.a aVar = hVar.d;
                if (simpleQueryForLong >= aVar.a) {
                    hVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long b10 = d3.h.b(sQLiteDatabase, iVar);
                if (b10 != null) {
                    insert = b10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(g3.a.a(iVar.c)));
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
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.e));
                contentValues2.put("payload_encoding", lVar.a.a);
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
            case 6:
                ArrayList arrayList = (ArrayList) obj3;
                w2.i iVar2 = (w2.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    boolean z11 = cursor2.getInt(7) != 0;
                    com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
                    mVar.f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    mVar.a = string;
                    mVar.d = Long.valueOf(cursor2.getLong(i14));
                    mVar.e = Long.valueOf(cursor2.getLong(3));
                    if (z11) {
                        String string2 = cursor2.getString(4);
                        mVar.c = new w2.l(string2 == null ? d3.h.f : new t2.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        t2.c cVar3 = string3 == null ? d3.h.f : new t2.c(string3);
                        Cursor query = hVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
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
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            mVar.c = new w2.l(cVar3, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        mVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new d3.b(j10, iVar2, mVar.i()));
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
                    z2.c cVar4 = z2.c.b;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar4 = z2.c.c;
                        } else if (i22 == 2) {
                            cVar = cVar2;
                            long j11 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new z2.d(j11, cVar));
                            i16 = 0;
                            i11 = 5;
                            i12 = 4;
                            i13 = 3;
                        } else if (i22 == i13) {
                            cVar4 = z2.c.e;
                        } else if (i22 == i12) {
                            cVar4 = z2.c.f;
                        } else if (i22 == i11) {
                            cVar4 = z2.c.h;
                        } else if (i22 == 6) {
                            cVar4 = z2.c.n;
                        } else {
                            a.a.a(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j112 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new z2.d(j112, cVar));
                    i16 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i23 = z2.e.c;
                    new ArrayList();
                    arrayList4.add(new z2.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long E = hVar.b.E();
                SQLiteDatabase a2 = hVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        z2.g gVar = new z2.g(rawQuery.getLong(0), E);
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        tVar.c = gVar;
                        tVar.e = new z2.b(new z2.f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), d3.a.f.a));
                        tVar.b = (String) hVar.e.get();
                        return new z2.a((z2.g) tVar.c, DesugarCollections.unmodifiableList(arrayList4), (z2.b) tVar.e, (String) tVar.b);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    a2.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // org.telegram.ui.co0
    public void b(int i10) {
        switch (this.a) {
            case 14:
                nh.w2 w2Var = (nh.w2) this.b;
                kc0 kc0Var = (kc0) this.c;
                String str = (String) this.d;
                if (i10 != 3) {
                    kc0Var.dismiss();
                }
                w2Var.d.x.C(str, pa.C(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                kc0 kc0Var2 = (kc0) this.b;
                e4 e4Var = (e4) this.c;
                String str2 = (String) this.d;
                if (i10 != 3) {
                    kc0Var2.dismiss();
                }
                e4Var.getWebViewContainer().C(str2, pa.C(i10).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // androidx.car.app.utils.d
    public Object call() {
        w.b bVar;
        switch (this.a) {
            case 1:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str = (String) this.d;
                Object obj = this.c;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e9) {
                        androidx.car.app.utils.i.f(iOnDoneCallback, str, e9);
                        return null;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.b;
                Exception exc = (Exception) this.c;
                String str2 = (String) this.d;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    break;
                } catch (w.f e10) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e10);
                    return null;
                }
        }
        return null;
    }

    @Override // jh.d9
    public void d(Canvas canvas, RectF rectF, float f10) {
        o7 o7Var = (o7) this.b;
        ik0 ik0Var = (ik0) this.c;
        int[] iArr = (int[]) this.d;
        o7Var.c(canvas, rectF, f10);
        o7Var.f(canvas, rectF, f10);
        if (o7Var.h) {
            o7Var.b(canvas, rectF, f10);
        } else {
            o7Var.e(canvas, rectF, f10);
        }
        if (ik0Var != null && ik0Var.T && ik0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            ik0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                i1.P((i1) this.b, (ArrayList) this.c, (TLRPC.User) this.d);
                break;
            case 12:
                ((q9) this.b).g1((o9) this.c, (Runnable) this.d, true);
                break;
            case 13:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                sVar.run(bool, bool);
                break;
            case 15:
                boolean[] zArr2 = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                zArr2[0] = true;
                callback.run(Boolean.FALSE);
                b2VarArr[0].dismiss();
                break;
            case 19:
                ChatActivityEnterView.i((ChatActivityEnterView) this.b, (MessageObject) this.c, (TL_keyboard.KeyboardButtonProto) this.d);
                break;
            case 22:
                gi giVar = (gi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i11 = giVar.F1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i11).removeInline(user.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(user);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new gg(10, giVar, tL_attachMenuBot), 66);
                    break;
                }
            default:
                in inVar = (in) this.b;
                View view = (View) this.c;
                z5 z5Var = (z5) this.d;
                inVar.getClass();
                view.setTag(null);
                inVar.X(view, z5Var, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        Runnable runnable;
        x4 x4Var = (x4) this.b;
        boolean[] zArr = (boolean[]) this.c;
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
        if (i10 == 1) {
            x4Var.I(2147483646, 0, zArr[0]);
            runnable = z2Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // e3.b
    public Object i() {
        b3.a aVar = (b3.a) this.b;
        w2.i iVar = (w2.i) this.c;
        w2.h hVar = (w2.h) this.d;
        d3.h hVar2 = (d3.h) aVar.d;
        hVar2.getClass();
        t2.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c10 = a.a.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new l0(hVar2, hVar, iVar, 5))).getClass();
        aVar.a.y(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.Components.dc0
    public void m(fc0 fc0Var, int i10) {
        switch (this.a) {
            case 16:
                y4.g(null, null, 0L, 0L, 0, (fc0) this.b, (a4) this.c, (b4) this.d);
                break;
            default:
                y4.g(null, null, 0L, 0L, 0, (fc0) this.b, (s3) this.c, (u3) this.d);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        x3 x3Var = (x3) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        c6 c6Var = (c6) this.d;
        jh.e4 e4Var = x3Var.l;
        e4Var.getStoriesController().r(e4Var.x1, str, new gh.i(x3Var, storyItem, c6Var, 6));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) this.d;
        String str2 = (String) obj;
        ga.c c10 = FirebaseMessaging.c(firebaseMessaging.b);
        t8.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a3 = com.google.firebase.messaging.u.a(System.currentTimeMillis(), str2, a2);
            if (a3 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.b).edit();
                edit.putString(d + "|T|" + str + "|*", a3);
                edit.commit();
            }
        }
        if (uVar == null || !str2.equals(uVar.a)) {
            t8.h hVar2 = firebaseMessaging.a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.i(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override // org.telegram.ui.zx
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        switch (this.a) {
            case 8:
                return i5.X((i5) this.b, (TL_stars.TL_starGiftUnique) this.c, (gy) this.d, arrayList);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                rn rnVar = chatActivityEnterView.K2;
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.from_id.user_id;
                long j11 = message.via_bot_id;
                if (j11 != 0) {
                    j10 = j11;
                }
                TLRPC.User user = chatActivityEnterView.N.getMessagesController().getUser(Long.valueOf(j10));
                if (user == null) {
                    gyVar.finishFragment();
                } else {
                    long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                    MediaDataController.getInstance(chatActivityEnterView.M).saveDraft(j12, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
                    if (j12 == chatActivityEnterView.L2) {
                        gyVar.finishFragment();
                    } else if (DialogObject.isEncryptedDialog(j12)) {
                        gyVar.finishFragment();
                    } else {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j12)) {
                            bundle.putLong("user_id", j12);
                        } else {
                            bundle.putLong("chat_id", -j12);
                        }
                        if (chatActivityEnterView.N.getMessagesController().checkCanOpenChat(bundle, gyVar)) {
                            if (!rnVar.presentFragment(new rn(bundle), true)) {
                                gyVar.finishFragment();
                            } else if (!AndroidUtilities.isTablet()) {
                                rnVar.removeSelfFromStack();
                            }
                        }
                    }
                }
                return true;
        }
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.a) {
            case 11:
                lh.y1 y1Var = (lh.y1) this.b;
                String str2 = (String) this.c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = y1Var.h;
                SparseIntArray sparseIntArray = y1Var.y;
                ArrayList arrayList7 = y1Var.n;
                lh.z1 z1Var = y1Var.J;
                ArrayList arrayList8 = y1Var.v;
                HashSet hashSet = y1Var.H;
                ArrayList arrayList9 = y1Var.s;
                if (TextUtils.equals(str2, y1Var.D)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(y1Var.D);
                    for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i10).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    y1Var.x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    y1Var.x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (z1Var.a == 0) {
                        hashSet.clear();
                        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) y1Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i12 = 0; i12 < hashSet.size(); i12++) {
                            arrayList9.add(null);
                        }
                        y1Var.x = hashSet.size() + y1Var.x;
                    } else {
                        HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                            String str4 = keywordResult3.emoji;
                            if (str4 != null && !str4.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                    TLRPC.Document document = arrayList3.get(i14);
                                    if (document != null && !arrayList9.contains(document)) {
                                        arrayList9.add(document);
                                        y1Var.x++;
                                    }
                                }
                            }
                        }
                        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                        int i15 = 0;
                        while (i15 < arrayList5.size()) {
                            MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i15);
                            String str5 = keywordResult4.emoji;
                            if (str5 != null && !str5.startsWith("animated_")) {
                                for (int i16 = 0; i16 < featuredStickerSets.size(); i16++) {
                                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i16);
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    } else if (!stickerSetCovered.covers.isEmpty()) {
                                        arrayList2 = stickerSetCovered.covers;
                                    } else if (stickerSetCovered.cover != null) {
                                        ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                                        arrayList10.add(stickerSetCovered.cover);
                                        arrayList2 = arrayList10;
                                    }
                                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i17), null);
                                        if (findAnimatedEmojiEmoticon != null && findAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                            arrayList9.add(arrayList2.get(i17));
                                            y1Var.x++;
                                        }
                                    }
                                }
                            }
                            i15++;
                            arrayList5 = arrayList;
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((y1Var.D + "").toLowerCase());
                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, translitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(y1Var.x, size);
                                arrayList9.add(null);
                                y1Var.x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                y1Var.x = tL_messages_stickerSet.documents.size() + y1Var.x;
                            }
                        }
                    }
                    boolean z10 = arrayList8.size() <= 1 && arrayList9.size() <= 1;
                    y1Var.w = z10;
                    if (z10) {
                        y1Var.x++;
                    }
                    if (!z10) {
                        y1Var.G++;
                    }
                    y1Var.E = y1Var.D;
                    y1Var.l();
                    lh.o1.w1(z1Var.b, 0, 0);
                    z1Var.f.c(false);
                    z1Var.e.n(false);
                    break;
                }
                break;
            case 27:
                vx vxVar = (vx) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                wx wxVar = vxVar.a;
                if (str6.equals(wxVar.v)) {
                    wxVar.w = str;
                    wxVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
            default:
                ry ryVar = (ry) this.b;
                HashMap hashMap = (HashMap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = ryVar.f;
                if (ryVar.w.I == ryVar.b) {
                    int size2 = arrayList5.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        String str7 = ((MediaDataController.KeywordResult) arrayList5.get(i19)).emoji;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str7);
                        if (arrayList11 != null && !arrayList11.isEmpty() && !hashMap2.containsKey(arrayList11)) {
                            hashMap2.put(arrayList11, str7);
                            ryVar.h.add(arrayList11);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}

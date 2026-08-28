package androidx.car.app.utils;

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
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.u;
import gh.k5;
import ih.h9;
import ih.i4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kh.a2;
import kh.q1;
import kh.r9;
import kh.t9;
import mh.g4;
import mh.x2;
import of.f1;
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
import org.telegram.messenger.l0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.s0;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z40;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.bo0;
import org.telegram.ui.dy;
import org.telegram.ui.qn;
import org.telegram.ui.rc;
import org.telegram.ui.we1;
import org.telegram.ui.web.r;
import org.telegram.ui.wx;
import w2.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e, e3.b, SuccessContinuation, d3.f, wx, MessagesStorage.StringCallback, h9, MediaDataController.KeywordResultCallback, b2, bo0, zb0, s0, x4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i9, Object obj, Object obj2, String str) {
        this.a = i9;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 24:
                xk xkVar = (xk) this.b;
                xkVar.t0.d((TLRPC.TL_messageMediaGeo) this.d, xkVar.u0, z10, i9, ((Long) this.c).longValue());
                xkVar.b.dismiss(true);
                break;
            case 25:
                jn jnVar = (jn) this.b;
                jnVar.f0.e((TLRPC.TL_messageMediaToDo) this.d, null, null, null, z10, i9, ((Long) this.c).longValue());
                jnVar.b.dismiss(true);
                break;
            default:
                e50 e50Var = (e50) this.b;
                z40 z40Var = (z40) this.d;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.c;
                f50 f50Var = e50Var.D0;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, e50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (z40Var != null) {
                    photoEntry.ttl = z40Var.c;
                    photoEntry.effectId = z40Var.d;
                }
                f50Var.c.r(photoEntry, videoEditedInfo, z10 || z40Var == null || z40Var.a, i9 != 0 ? i9 : z40Var != null ? z40Var.b : 0, i10 != 0 ? i10 : 0, false, z40Var != null ? z40Var.e : 0L);
                f50Var.m(false, false);
                break;
        }
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
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
        int i9 = this.a;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        z2.c cVar2 = z2.c.d;
        int i13 = 2;
        int i14 = 1;
        Object obj2 = this.c;
        Object obj3 = this.d;
        int i15 = 0;
        d3.h hVar = (d3.h) this.b;
        switch (i9) {
            case 4:
                w2.h hVar2 = (w2.h) obj3;
                l lVar = hVar2.c;
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
                int i16 = aVar.e;
                byte[] bArr2 = lVar.b;
                boolean z10 = bArr2.length <= i16;
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
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(hVar2.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 5:
                ArrayList arrayList = (ArrayList) obj3;
                w2.i iVar2 = (w2.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    boolean z11 = cursor2.getInt(7) != 0;
                    m mVar = new m();
                    mVar.f = new HashMap();
                    String string = cursor2.getString(i14);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    mVar.a = string;
                    mVar.d = Long.valueOf(cursor2.getLong(i13));
                    mVar.e = Long.valueOf(cursor2.getLong(3));
                    if (z11) {
                        String string2 = cursor2.getString(4);
                        mVar.c = new l(string2 == null ? d3.h.f : new t2.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        t2.c cVar3 = string3 == null ? d3.h.f : new t2.c(string3);
                        Cursor query = hVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i18 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i18 += blob.length;
                            }
                            byte[] bArr3 = new byte[i18];
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i19);
                                cursor = query;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, i20, bArr4.length);
                                    i20 += bArr4.length;
                                    i19++;
                                    query = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            mVar.c = new l(cVar3, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        mVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new d3.b(j10, iVar2, mVar.i()));
                    i13 = 2;
                    i14 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                t tVar = (t) obj2;
                ArrayList arrayList4 = (ArrayList) tVar.d;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i15);
                    int i21 = cursor3.getInt(1);
                    z2.c cVar4 = z2.c.b;
                    if (i21 != 0) {
                        if (i21 == 1) {
                            cVar4 = z2.c.c;
                        } else if (i21 == 2) {
                            cVar = cVar2;
                            long j11 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new z2.d(j11, cVar));
                            i15 = 0;
                            i10 = 5;
                            i11 = 4;
                            i12 = 3;
                        } else if (i21 == i12) {
                            cVar4 = z2.c.e;
                        } else if (i21 == i11) {
                            cVar4 = z2.c.f;
                        } else if (i21 == i10) {
                            cVar4 = z2.c.h;
                        } else if (i21 == 6) {
                            cVar4 = z2.c.n;
                        } else {
                            a.a.a(Integer.valueOf(i21), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j112 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new z2.d(j112, cVar));
                    i15 = 0;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i22 = z2.e.c;
                    new ArrayList();
                    arrayList4.add(new z2.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long d = hVar.b.d();
                SQLiteDatabase a2 = hVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        z2.g gVar = new z2.g(rawQuery.getLong(0), d);
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

    @Override // org.telegram.ui.bo0
    public void b(int i9) {
        switch (this.a) {
            case 13:
                x2 x2Var = (x2) this.b;
                gc0 gc0Var = (gc0) this.d;
                String str = (String) this.c;
                if (i9 != 3) {
                    gc0Var.dismiss();
                }
                x2Var.d.x.C(str, j2.A(i9).toLowerCase(Locale.ROOT), false);
                break;
            default:
                gc0 gc0Var2 = (gc0) this.b;
                g4 g4Var = (g4) this.d;
                String str2 = (String) this.c;
                if (i9 != 3) {
                    gc0Var2.dismiss();
                }
                g4Var.getWebViewContainer().C(str2, j2.A(i9).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // androidx.car.app.utils.e
    public void call() {
        w.b bVar;
        switch (this.a) {
            case 0:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str = (String) this.c;
                Object obj = this.d;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e10) {
                        j.f(iOnDoneCallback, str, e10);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                break;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.b;
                Exception exc = (Exception) this.d;
                String str2 = (String) this.c;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    break;
                } catch (w.f e11) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e11);
                }
        }
    }

    @Override // ih.h9
    public void d(Canvas canvas, RectF rectF, float f10) {
        r7 r7Var = (r7) this.b;
        fk0 fk0Var = (fk0) this.d;
        int[] iArr = (int[]) this.c;
        r7Var.c(canvas, rectF, f10);
        r7Var.f(canvas, rectF, f10);
        if (r7Var.h) {
            r7Var.b(canvas, rectF, f10);
        } else {
            r7Var.e(canvas, rectF, f10);
        }
        if (fk0Var != null && fk0Var.T && fk0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            fk0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 11:
                ((t9) this.b).g1((r9) this.d, (Runnable) this.c, true);
                break;
            case 12:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.d;
                r rVar = (r) this.c;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                rVar.run(bool, bool);
                break;
            case 14:
                f1 f1Var = (f1) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                TLRPC.User user = (TLRPC.User) this.c;
                f1Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    MessagesController.getNotificationsSettings(f1Var.f).edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    f1Var.G();
                    break;
                }
                break;
            case 15:
                boolean[] zArr3 = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                c2[] c2VarArr = (c2[]) this.c;
                zArr3[0] = true;
                callback.run(Boolean.FALSE);
                c2VarArr[0].dismiss();
                break;
            case 19:
                ChatActivityEnterView.i((ChatActivityEnterView) this.b, (MessageObject) this.d, (TL_keyboard.KeyboardButtonProto) this.c);
                break;
            case 22:
                ki kiVar = (ki) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.d;
                TLRPC.User user2 = (TLRPC.User) this.c;
                int i10 = kiVar.F1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i10).removeInline(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i10).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_messages_toggleBotInAttachMenu, new rc(13, kiVar, tL_attachMenuBot), 66);
                    break;
                }
            default:
                jn jnVar = (jn) this.b;
                View view = (View) this.d;
                c6 c6Var = (c6) this.c;
                jnVar.getClass();
                view.setTag(null);
                jnVar.W(view, c6Var, false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        x4 x4Var = (x4) this.b;
        boolean[] zArr = (boolean[]) this.d;
        a3 a3Var = (a3) this.c;
        if (i9 == 1) {
            x4Var.B(2147483646, 0, zArr[0]);
            a3Var.a.dismissRunnable.run();
        }
    }

    @Override // e3.b
    public Object j() {
        b3.a aVar = (b3.a) this.b;
        w2.i iVar = (w2.i) this.d;
        w2.h hVar = (w2.h) this.c;
        d3.h hVar2 = (d3.h) aVar.d;
        hVar2.getClass();
        t2.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c10 = a.a.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new a(hVar2, hVar, iVar, 4))).getClass();
        aVar.a.A(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(bc0 bc0Var, int i9) {
        switch (this.a) {
            case 16:
                y4.g(null, null, 0L, 0L, 0, (bc0) this.b, (a4) this.d, (b4) this.c);
                break;
            default:
                y4.g(null, null, 0L, 0L, 0, (bc0) this.b, (s3) this.d, (u3) this.c);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        ih.b4 b4Var = (ih.b4) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        b6 b6Var = (b6) this.c;
        i4 i4Var = b4Var.l;
        i4Var.getStoriesController().r(i4Var.x1, str, new fh.i(b4Var, storyItem, b6Var, 6));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        u uVar = (u) this.d;
        String str2 = (String) obj;
        android.support.v4.media.c c10 = FirebaseMessaging.c(firebaseMessaging.b);
        s8.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a3 = u.a(System.currentTimeMillis(), str2, a2);
            if (a3 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.b).edit();
                edit.putString(d + "|T|" + str + "|*", a3);
                edit.commit();
            }
        }
        if (uVar == null || !str2.equals(uVar.a)) {
            s8.h hVar2 = firebaseMessaging.a;
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

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        switch (this.a) {
            case 7:
                return k5.W((k5) this.b, (TL_stars.TL_starGiftUnique) this.d, (dy) this.c, arrayList);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.d;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.c;
                qn qnVar = chatActivityEnterView.K2;
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.from_id.user_id;
                long j11 = message.via_bot_id;
                if (j11 != 0) {
                    j10 = j11;
                }
                TLRPC.User user = chatActivityEnterView.N.getMessagesController().getUser(Long.valueOf(j10));
                if (user == null) {
                    dyVar.finishFragment();
                } else {
                    long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                    MediaDataController.getInstance(chatActivityEnterView.M).saveDraft(j12, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
                    if (j12 == chatActivityEnterView.L2) {
                        dyVar.finishFragment();
                    } else if (DialogObject.isEncryptedDialog(j12)) {
                        dyVar.finishFragment();
                    } else {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j12)) {
                            bundle.putLong("user_id", j12);
                        } else {
                            bundle.putLong("chat_id", -j12);
                        }
                        if (chatActivityEnterView.N.getMessagesController().checkCanOpenChat(bundle, dyVar)) {
                            if (!qnVar.presentFragment(new qn(bundle), true)) {
                                dyVar.finishFragment();
                            } else if (!AndroidUtilities.isTablet()) {
                                qnVar.removeSelfFromStack();
                            }
                        }
                    }
                }
                return true;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.a) {
            case 10:
                a2 a2Var = (a2) this.b;
                String str2 = (String) this.c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = a2Var.h;
                SparseIntArray sparseIntArray = a2Var.y;
                ArrayList arrayList7 = a2Var.n;
                kh.b2 b2Var = a2Var.J;
                ArrayList arrayList8 = a2Var.v;
                HashSet hashSet = a2Var.H;
                ArrayList arrayList9 = a2Var.s;
                if (TextUtils.equals(str2, a2Var.D)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(a2Var.D);
                    for (int i9 = 0; i9 < parseEmojis.size(); i9++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i9).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    a2Var.x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    a2Var.x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (b2Var.a == 0) {
                        hashSet.clear();
                        for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i10);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) a2Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i11 = 0; i11 < hashSet.size(); i11++) {
                            arrayList9.add(null);
                        }
                        a2Var.x = hashSet.size() + a2Var.x;
                    } else {
                        HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                        for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                            MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i12);
                            String str4 = keywordResult3.emoji;
                            if (str4 != null && !str4.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                    TLRPC.Document document = arrayList3.get(i13);
                                    if (document != null && !arrayList9.contains(document)) {
                                        arrayList9.add(document);
                                        a2Var.x++;
                                    }
                                }
                            }
                        }
                        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                        int i14 = 0;
                        while (i14 < arrayList5.size()) {
                            MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i14);
                            String str5 = keywordResult4.emoji;
                            if (str5 != null && !str5.startsWith("animated_")) {
                                for (int i15 = 0; i15 < featuredStickerSets.size(); i15++) {
                                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i15);
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    } else if (!stickerSetCovered.covers.isEmpty()) {
                                        arrayList2 = stickerSetCovered.covers;
                                    } else if (stickerSetCovered.cover != null) {
                                        ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                                        arrayList10.add(stickerSetCovered.cover);
                                        arrayList2 = arrayList10;
                                    }
                                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i16), null);
                                        if (findAnimatedEmojiEmoticon != null && findAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                            arrayList9.add(arrayList2.get(i16));
                                            a2Var.x++;
                                        }
                                    }
                                }
                            }
                            i14++;
                            arrayList5 = arrayList;
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((a2Var.D + "").toLowerCase());
                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i17);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (translitSafe2.startsWith(translitSafe) || l0.w(" ", translitSafe, translitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(a2Var.x, size);
                                arrayList9.add(null);
                                a2Var.x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                a2Var.x = tL_messages_stickerSet.documents.size() + a2Var.x;
                            }
                        }
                    }
                    boolean z10 = arrayList8.size() <= 1 && arrayList9.size() <= 1;
                    a2Var.w = z10;
                    if (z10) {
                        a2Var.x++;
                    }
                    if (!z10) {
                        a2Var.G++;
                    }
                    a2Var.E = a2Var.D;
                    a2Var.l();
                    q1.w1(b2Var.b, 0, 0);
                    b2Var.f.c(false);
                    b2Var.e.n(false);
                    break;
                }
                break;
            case 27:
                ux uxVar = (ux) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                vx vxVar = uxVar.a;
                if (str6.equals(vxVar.v)) {
                    vxVar.w = str;
                    vxVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
            default:
                py pyVar = (py) this.b;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.c;
                HashMap hashMap2 = pyVar.f;
                if (pyVar.w.I == pyVar.b) {
                    int size2 = arrayList5.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        String str7 = ((MediaDataController.KeywordResult) arrayList5.get(i18)).emoji;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str7);
                        if (arrayList11 != null && !arrayList11.isEmpty() && !hashMap2.containsKey(arrayList11)) {
                            hashMap2.put(arrayList11, str7);
                            pyVar.h.add(arrayList11);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}

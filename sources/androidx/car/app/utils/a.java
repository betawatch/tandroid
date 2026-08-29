package androidx.car.app.utils;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import bg.c2;
import cg.v0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.u;
import h7.j5;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jh.h5;
import lh.c6;
import lh.d4;
import lh.d9;
import nh.c9;
import nh.e9;
import nh.n1;
import nh.x1;
import nh.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.i5;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.s0;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.w3;
import org.telegram.ui.Components.y3;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.ao0;
import org.telegram.ui.fy;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.yx;
import org.telegram.ui.ze1;
import org.telegram.ui.zg;
import ph.n3;
import y2.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e, b2, SuccessContinuation, g3.b, f3.f, yx, MessagesStorage.StringCallback, d9, MediaDataController.KeywordResultCallback, oc0, s0, ao0, b5, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i10, Object obj, Object obj2, String str) {
        this.a = i10;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 22:
                bl blVar = (bl) this.b;
                blVar.t0.d((TLRPC.TL_messageMediaGeo) this.d, blVar.u0, z10, i10, ((Long) this.c).longValue());
                blVar.b.dismiss(true);
                break;
            case 23:
                on onVar = (on) this.b;
                onVar.f0.e((TLRPC.TL_messageMediaToDo) this.d, null, null, null, z10, i10, ((Long) this.c).longValue());
                onVar.b.dismiss(true);
                break;
            default:
                r50 r50Var = (r50) this.b;
                n50 n50Var = (n50) this.d;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.c;
                s50 s50Var = r50Var.D0;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, r50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (n50Var != null) {
                    photoEntry.ttl = n50Var.c;
                    photoEntry.effectId = n50Var.d;
                }
                s50Var.c.r(photoEntry, videoEditedInfo, z10 || n50Var == null || n50Var.a, i10 != 0 ? i10 : n50Var != null ? n50Var.b : 0, i11 != 0 ? i11 : 0, false, n50Var != null ? n50Var.e : 0L);
                s50Var.m(false, false);
                break;
        }
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(fy fyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ao0
    public void a(int i10) {
        vc0 vc0Var = (vc0) this.b;
        n3 n3Var = (n3) this.d;
        String str = (String) this.c;
        if (i10 != 3) {
            vc0Var.dismiss();
        }
        n3Var.getWebViewContainer().C(str, th.B(i10).toLowerCase(Locale.ROOT), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // f3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        b3.c cVar;
        int i10 = this.a;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        b3.c cVar2 = b3.c.d;
        int i14 = 2;
        int i15 = 1;
        Object obj2 = this.c;
        Object obj3 = this.d;
        int i16 = 0;
        f3.h hVar = (f3.h) this.b;
        switch (i10) {
            case 5:
                y2.h hVar2 = (y2.h) obj3;
                l lVar = hVar2.c;
                String str = hVar2.a;
                y2.i iVar = (y2.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                f3.a aVar = hVar.d;
                if (simpleQueryForLong >= aVar.a) {
                    hVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long b10 = f3.h.b(sQLiteDatabase, iVar);
                if (b10 != null) {
                    insert = b10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(i3.a.a(iVar.c)));
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
                y2.i iVar2 = (y2.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    boolean z11 = cursor2.getInt(7) != 0;
                    c2 c2Var = new c2();
                    c2Var.f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c2Var.a = string;
                    c2Var.d = Long.valueOf(cursor2.getLong(i14));
                    c2Var.e = Long.valueOf(cursor2.getLong(3));
                    if (z11) {
                        String string2 = cursor2.getString(4);
                        c2Var.c = new l(string2 == null ? f3.h.f : new v2.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        v2.c cVar3 = string3 == null ? f3.h.f : new v2.c(string3);
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
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            c2Var.c = new l(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c2Var.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new f3.b(j10, iVar2, c2Var.i()));
                    i14 = 2;
                    i15 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                s sVar = (s) obj2;
                ArrayList arrayList4 = (ArrayList) sVar.d;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i16);
                    int i22 = cursor3.getInt(1);
                    b3.c cVar4 = b3.c.b;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar4 = b3.c.c;
                        } else if (i22 == 2) {
                            cVar = cVar2;
                            long j11 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new b3.d(j11, cVar));
                            i16 = 0;
                            i11 = 5;
                            i12 = 4;
                            i13 = 3;
                        } else if (i22 == i13) {
                            cVar4 = b3.c.e;
                        } else if (i22 == i12) {
                            cVar4 = b3.c.f;
                        } else if (i22 == i11) {
                            cVar4 = b3.c.h;
                        } else if (i22 == 6) {
                            cVar4 = b3.c.n;
                        } else {
                            j5.a(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j112 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new b3.d(j112, cVar));
                    i16 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i23 = b3.e.c;
                    new ArrayList();
                    arrayList4.add(new b3.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long e10 = hVar.b.e();
                SQLiteDatabase a2 = hVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        b3.g gVar = new b3.g(rawQuery.getLong(0), e10);
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        sVar.c = gVar;
                        sVar.e = new b3.b(new b3.f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), f3.a.f.a));
                        sVar.b = (String) hVar.e.get();
                        return new b3.a((b3.g) sVar.c, DesugarCollections.unmodifiableList(arrayList4), (b3.b) sVar.e, (String) sVar.b);
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

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        l11 l11Var = (l11) this.b;
        fp fpVar = (fp) this.d;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null || (bitmap = bitmapSafe.bitmap) == null) {
            return;
        }
        Drawable drawable = fpVar.b;
        if (drawable instanceof yb0) {
            yb0 yb0Var = (yb0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            yb0Var.t(l11.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            yb0Var.u(l11Var.H);
            l11Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override // g3.b
    public Object f() {
        d3.a aVar = (d3.a) this.b;
        y2.i iVar = (y2.i) this.d;
        y2.h hVar = (y2.h) this.c;
        f3.h hVar2 = (f3.h) aVar.d;
        hVar2.getClass();
        v2.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c3 = j5.c("SQLiteEventStore");
        if (Log.isLoggable(c3, 3)) {
            Log.d(c3, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new a(hVar2, hVar, iVar, 5))).getClass();
        aVar.a.A(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                v0.P((v0) this.b, (ArrayList) this.d, (TLRPC.User) this.c);
                break;
            case 12:
                ((e9) this.b).g1((c9) this.d, (Runnable) this.c, true);
                break;
            case 13:
                boolean[] zArr = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                zArr[0] = true;
                callback.run(Boolean.FALSE);
                c2VarArr[0].dismiss();
                break;
            case 17:
                ChatActivityEnterView.i((ChatActivityEnterView) this.b, (MessageObject) this.d, (TL_keyboard.KeyboardButtonProto) this.c);
                break;
            case 20:
                ni niVar = (ni) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.d;
                TLRPC.User user = (TLRPC.User) this.c;
                int i11 = niVar.F1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i11).removeInline(user.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(user);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new zg(9, niVar, tL_attachMenuBot), 66);
                    break;
                }
            case 24:
                on onVar = (on) this.b;
                View view = (View) this.d;
                a6 a6Var = (a6) this.c;
                onVar.getClass();
                view.setTag(null);
                onVar.X(view, a6Var, false);
                break;
            default:
                qu0 qu0Var = (qu0) this.b;
                c6 c6Var = (c6) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                c6Var.F(arrayList);
                tc.a0(qu0Var.r1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                qu0Var.L(false);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
        Runnable runnable;
        b5 b5Var = (b5) this.b;
        boolean[] zArr = (boolean[]) this.d;
        a3 a3Var = (a3) this.c;
        if (i10 == 1) {
            b5Var.I(2147483646, 0, zArr[0]);
            runnable = a3Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // lh.d9
    public void j(Canvas canvas, RectF rectF, float f9) {
        p7 p7Var = (p7) this.b;
        sk0 sk0Var = (sk0) this.d;
        int[] iArr = (int[]) this.c;
        p7Var.c(canvas, rectF, f9);
        p7Var.f(canvas, rectF, f9);
        if (p7Var.h) {
            p7Var.b(canvas, rectF, f9);
        } else {
            p7Var.e(canvas, rectF, f9);
        }
        if (sk0Var != null && sk0Var.T && sk0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f9 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            sk0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
        switch (this.a) {
            case 14:
                c5.g(null, null, 0L, 0L, 0, (qc0) this.b, (e4) this.d, (f4) this.c);
                break;
            default:
                c5.g(null, null, 0L, 0L, 0, (qc0) this.b, (w3) this.d, (y3) this.c);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        lh.w3 w3Var = (lh.w3) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
        d4 d4Var = w3Var.l;
        d4Var.getStoriesController().r(d4Var.x1, str, new ih.i(w3Var, storyItem, c6Var, 6));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        t tVar = (t) this.d;
        String str2 = (String) obj;
        u c3 = FirebaseMessaging.c(firebaseMessaging.b);
        u8.g gVar = firebaseMessaging.a;
        gVar.a();
        String d = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c3) {
            String a10 = t.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = c3.a.edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.a)) {
            u8.g gVar2 = firebaseMessaging.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.j(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override // org.telegram.ui.yx
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        switch (this.a) {
            case 8:
                return h5.X((h5) this.b, (TL_stars.TL_starGiftUnique) this.d, (fy) this.c, arrayList);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.d;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.c;
                tn tnVar = chatActivityEnterView.K2;
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.from_id.user_id;
                long j11 = message.via_bot_id;
                if (j11 != 0) {
                    j10 = j11;
                }
                TLRPC.User user = chatActivityEnterView.N.getMessagesController().getUser(Long.valueOf(j10));
                if (user == null) {
                    fyVar.finishFragment();
                } else {
                    long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                    MediaDataController.getInstance(chatActivityEnterView.M).saveDraft(j12, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
                    if (j12 == chatActivityEnterView.L2) {
                        fyVar.finishFragment();
                    } else if (DialogObject.isEncryptedDialog(j12)) {
                        fyVar.finishFragment();
                    } else {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j12)) {
                            bundle.putLong("user_id", j12);
                        } else {
                            bundle.putLong("chat_id", -j12);
                        }
                        if (chatActivityEnterView.N.getMessagesController().checkCanOpenChat(bundle, fyVar)) {
                            if (!tnVar.presentFragment(new tn(bundle), true)) {
                                fyVar.finishFragment();
                            } else if (!AndroidUtilities.isTablet()) {
                                tnVar.removeSelfFromStack();
                            }
                        }
                    }
                }
                return true;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
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
            case 11:
                x1 x1Var = (x1) this.b;
                String str2 = (String) this.c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = x1Var.h;
                SparseIntArray sparseIntArray = x1Var.y;
                ArrayList arrayList7 = x1Var.n;
                y1 y1Var = x1Var.J;
                ArrayList arrayList8 = x1Var.v;
                HashSet hashSet = x1Var.H;
                ArrayList arrayList9 = x1Var.s;
                if (TextUtils.equals(str2, x1Var.D)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(x1Var.D);
                    for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i10).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    x1Var.x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    x1Var.x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (y1Var.a == 0) {
                        hashSet.clear();
                        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) x1Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i12 = 0; i12 < hashSet.size(); i12++) {
                            arrayList9.add(null);
                        }
                        x1Var.x = hashSet.size() + x1Var.x;
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
                                        x1Var.x++;
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
                                            x1Var.x++;
                                        }
                                    }
                                }
                            }
                            i15++;
                            arrayList5 = arrayList;
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((x1Var.D + "").toLowerCase());
                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (translitSafe2.startsWith(translitSafe) || x3.w(" ", translitSafe, translitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(x1Var.x, size);
                                arrayList9.add(null);
                                x1Var.x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                x1Var.x = tL_messages_stickerSet.documents.size() + x1Var.x;
                            }
                        }
                    }
                    boolean z10 = arrayList8.size() <= 1 && arrayList9.size() <= 1;
                    x1Var.w = z10;
                    if (z10) {
                        x1Var.x++;
                    }
                    if (!z10) {
                        x1Var.G++;
                    }
                    x1Var.E = x1Var.D;
                    x1Var.l();
                    n1.w1(y1Var.b, 0, 0);
                    y1Var.f.c(false);
                    y1Var.e.n(false);
                    break;
                }
                break;
            case 25:
                dy dyVar = (dy) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                ey eyVar = dyVar.a;
                if (str6.equals(eyVar.v)) {
                    eyVar.w = str;
                    eyVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
            default:
                yy yyVar = (yy) this.b;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.c;
                HashMap hashMap2 = yyVar.f;
                if (yyVar.w.I == yyVar.b) {
                    int size2 = arrayList5.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        String str7 = ((MediaDataController.KeywordResult) arrayList5.get(i19)).emoji;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str7);
                        if (arrayList11 != null && !arrayList11.isEmpty() && !hashMap2.containsKey(arrayList11)) {
                            hashMap2.put(arrayList11, str7);
                            yyVar.h.add(arrayList11);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}

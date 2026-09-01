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
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.JsPromptResult;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.t;
import fg.v0;
import j$.util.DesugarCollections;
import j7.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mh.g5;
import oh.d6;
import oh.d9;
import oh.f4;
import oh.y3;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
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
import org.telegram.messenger.j5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.s0;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.t3;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.v3;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.jy;
import org.telegram.ui.ko0;
import org.telegram.ui.lo;
import org.telegram.ui.mf1;
import org.telegram.ui.py;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import sh.n3;
import y2.l;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e, SuccessContinuation, g3.b, f3.f, c2, jy, MessagesStorage.StringCallback, d9, wc0, s0, ko0, y4, MediaDataController.KeywordResultCallback, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 20:
                cl clVar = (cl) this.b;
                clVar.u0.d((TLRPC.TL_messageMediaGeo) this.d, clVar.v0, z4, i10, ((Long) this.c).longValue());
                clVar.b.dismiss(true);
                break;
            case 21:
                sn snVar = (sn) this.b;
                snVar.g0.b((TLRPC.TL_messageMediaToDo) this.d, null, null, null, z4, i10, ((Long) this.c).longValue());
                snVar.b.dismiss(true);
                break;
            default:
                y50 y50Var = (y50) this.b;
                u50 u50Var = (u50) this.d;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.c;
                z50 z50Var = y50Var.E0;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, y50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (u50Var != null) {
                    photoEntry.ttl = u50Var.c;
                    photoEntry.effectId = u50Var.d;
                }
                z50Var.c.r(photoEntry, videoEditedInfo, z4 || u50Var == null || u50Var.a, i10 != 0 ? i10 : u50Var != null ? u50Var.b : 0, i11 != 0 ? i11 : 0, false, u50Var != null ? u50Var.e : 0L);
                z50Var.m(false, false);
                break;
        }
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean J(py pyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ko0
    public void a(int i10) {
        dd0 dd0Var = (dd0) this.b;
        n3 n3Var = (n3) this.d;
        String str = (String) this.c;
        if (i10 != 3) {
            dd0Var.dismiss();
        }
        n3Var.getWebViewContainer().C(str, yh.B(i10).toLowerCase(Locale.ROOT), false);
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
            case 4:
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
                boolean z4 = bArr2.length <= i17;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.e));
                contentValues2.put("payload_encoding", lVar.a.a);
                contentValues2.put("code", hVar2.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z4));
                contentValues2.put("payload", z4 ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z4) {
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
            case 5:
                ArrayList arrayList = (ArrayList) obj3;
                y2.i iVar2 = (y2.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    boolean z10 = cursor2.getInt(7) != 0;
                    a9.a aVar2 = new a9.a();
                    aVar2.f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    aVar2.b = string;
                    aVar2.d = Long.valueOf(cursor2.getLong(i14));
                    aVar2.e = Long.valueOf(cursor2.getLong(3));
                    if (z10) {
                        String string2 = cursor2.getString(4);
                        aVar2.c = new l(string2 == null ? f3.h.f : new v2.c(string2), cursor2.getBlob(5));
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
                            aVar2.c = new l(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        aVar2.a = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new f3.b(j10, iVar2, aVar2.j()));
                    i14 = 2;
                    i15 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                s sVar = (s) obj2;
                ArrayList arrayList4 = (ArrayList) sVar.c;
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
                            j0.a(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
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
                long W = hVar.b.W();
                SQLiteDatabase a2 = hVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        b3.g gVar = new b3.g(rawQuery.getLong(0), W);
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        sVar.b = gVar;
                        sVar.d = new b3.b(new b3.f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), f3.a.f.a));
                        sVar.a = (String) hVar.e.get();
                        return new b3.a((b3.g) sVar.b, DesugarCollections.unmodifiableList(arrayList4), (b3.b) sVar.d, (String) sVar.a);
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
                    } catch (w.g e6) {
                        j.f(iOnDoneCallback, str, e6);
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
                } catch (w.g e10) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e10);
                }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        Bitmap bitmap;
        x11 x11Var = (x11) this.b;
        lp lpVar = (lp) this.d;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z4 || bitmapSafe == null || (bitmap = bitmapSafe.bitmap) == null) {
            return;
        }
        Drawable drawable = lpVar.b;
        if (drawable instanceof fc0) {
            fc0 fc0Var = (fc0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            fc0Var.t(x11.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            fc0Var.u(x11Var.I);
            x11Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override // oh.d9
    public void f(Canvas canvas, RectF rectF, float f10) {
        r7 r7Var = (r7) this.b;
        cl0 cl0Var = (cl0) this.d;
        int[] iArr = (int[]) this.c;
        r7Var.c(canvas, rectF, f10);
        r7Var.f(canvas, rectF, f10);
        if (r7Var.h) {
            r7Var.b(canvas, rectF, f10);
        } else {
            r7Var.e(canvas, rectF, f10);
        }
        if (cl0Var != null && cl0Var.U && cl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            cl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // g3.b
    public Object g() {
        d3.a aVar = (d3.a) this.b;
        y2.i iVar = (y2.i) this.d;
        y2.h hVar = (y2.h) this.c;
        f3.h hVar2 = (f3.h) aVar.d;
        hVar2.getClass();
        v2.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c3 = j0.c("SQLiteEventStore");
        if (Log.isLoggable(c3, 3)) {
            Log.d(c3, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new a(hVar2, hVar, iVar, 4))).getClass();
        aVar.a.A(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        y4 y4Var = (y4) this.b;
        boolean[] zArr = (boolean[]) this.d;
        c3 c3Var = (c3) this.c;
        if (i10 == 1) {
            y4Var.I(2147483646, 0, zArr[0]);
            c3Var.a.dismissRunnable.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        switch (this.a) {
            case 7:
                v0.P((v0) this.b, (ArrayList) this.d, (TLRPC.User) this.c);
                break;
            case 11:
                boolean[] zArr = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                d2[] d2VarArr = (d2[]) this.c;
                zArr[0] = true;
                callback.run(Boolean.FALSE);
                d2VarArr[0].dismiss();
                break;
            case 15:
                ChatActivityEnterView.i((ChatActivityEnterView) this.b, (MessageObject) this.d, (TL_keyboard.KeyboardButtonProto) this.c);
                break;
            case 18:
                mi miVar = (mi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.d;
                TLRPC.User user = (TLRPC.User) this.c;
                int i11 = miVar.G1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i11).removeInline(user.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(user);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(6, miVar, tL_attachMenuBot), 66);
                    break;
                }
            case 22:
                sn snVar = (sn) this.b;
                View view = (View) this.d;
                c6 c6Var = (c6) this.c;
                snVar.getClass();
                view.setTag(null);
                snVar.X(view, c6Var, false);
                break;
            case 26:
                zu0 zu0Var = (zu0) this.b;
                d6 d6Var = (d6) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                d6Var.F(arrayList);
                qc.a0(zu0Var.s1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                zu0Var.L(false);
                break;
            default:
                boolean[] zArr2 = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.d;
                xt xtVar = (xt) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.confirm(xtVar.getText().toString());
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(yc0 yc0Var, int i10) {
        switch (this.a) {
            case 12:
                z4.g(null, null, 0L, 0L, 0, (yc0) this.b, (b4) this.d, (c4) this.c);
                break;
            default:
                z4.g(null, null, 0L, 0L, 0, (yc0) this.b, (t3) this.d, (v3) this.c);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        p2 p2Var = (p2) this.d;
        g2.m(chat, null, true, null, p2Var.getParentActivity(), p2Var, (AccountInstance) this.c);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        t tVar = (t) this.d;
        String str2 = (String) obj;
        ja.c c3 = FirebaseMessaging.c(firebaseMessaging.b);
        w8.g gVar = firebaseMessaging.a;
        gVar.a();
        String d = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c3) {
            String a10 = t.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c3.a).edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.a)) {
            w8.g gVar2 = firebaseMessaging.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.j(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override // org.telegram.ui.jy
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        switch (this.a) {
            case 8:
                return g5.X((g5) this.b, (TL_stars.TL_starGiftUnique) this.d, (py) this.c, arrayList);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.d;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.c;
                xn xnVar = chatActivityEnterView.L2;
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.from_id.user_id;
                long j11 = message.via_bot_id;
                if (j11 != 0) {
                    j10 = j11;
                }
                TLRPC.User user = chatActivityEnterView.O.getMessagesController().getUser(Long.valueOf(j10));
                if (user == null) {
                    pyVar.finishFragment();
                } else {
                    long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                    MediaDataController.getInstance(chatActivityEnterView.N).saveDraft(j12, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
                    if (j12 == chatActivityEnterView.M2) {
                        pyVar.finishFragment();
                    } else if (DialogObject.isEncryptedDialog(j12)) {
                        pyVar.finishFragment();
                    } else {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j12)) {
                            bundle.putLong("user_id", j12);
                        } else {
                            bundle.putLong("chat_id", -j12);
                        }
                        if (chatActivityEnterView.O.getMessagesController().checkCanOpenChat(bundle, pyVar)) {
                            if (!xnVar.presentFragment(new xn(bundle), true)) {
                                pyVar.finishFragment();
                            } else if (!AndroidUtilities.isTablet()) {
                                xnVar.removeSelfFromStack();
                            }
                        }
                    }
                }
                return true;
        }
    }

    public /* synthetic */ a(Object obj, String str, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        y3 y3Var = (y3) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        g6 g6Var = (g6) this.c;
        f4 f4Var = y3Var.l;
        f4Var.getStoriesController().r(f4Var.y1, str, new lh.h(y3Var, storyItem, g6Var, 6));
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 23:
                ky kyVar = (ky) this.b;
                String str2 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                ly lyVar = kyVar.a;
                if (str2.equals(lyVar.v)) {
                    lyVar.w = str;
                    lyVar.n.addAll(arrayList);
                    runnable.run();
                    break;
                }
                break;
            default:
                fz fzVar = (fz) this.b;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.c;
                HashMap hashMap2 = fzVar.f;
                if (fzVar.w.J == fzVar.b) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str3 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str3);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str3);
                            fzVar.h.add(arrayList2);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}

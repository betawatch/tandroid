// default package

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.d0;
import org.telegram.ui.e0;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o48 implements NativeLifecycleLock.NativeCallable, if7, oj3, ea9, r42, fd, bs9, b7c, gcb, on5, bnc, cf7, f01, OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o48(IOnDoneCallback iOnDoneCallback, Object obj, String str, byte b) {
        this.a = b;
        this.b = iOnDoneCallback;
        this.d = obj;
        this.c = str;
    }

    @Override // cf7
    public final void A(boolean z) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        e eVar = (e) this.c;
        xkc.l(chat, null, true, null, eVar.getParentActivity(), eVar, (k5) this.d);
    }

    @Override // oj3
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override // if7
    public final void a(String str) {
        j68 j68Var = (j68) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        x53 x53Var = (x53) this.d;
        o68 o68Var = j68Var.x;
        o68Var.getStoriesController().q(o68Var.l1, str, new w58((Object) j68Var, (Object) storyItem, (Object) x53Var, (byte) 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    @Override // bs9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        long insert;
        Cursor cursor;
        ds9 ds9Var;
        be6 be6Var;
        byte b = this.a;
        int i = 6;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        be6 be6Var2 = be6.d;
        int i5 = 2;
        int i6 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i7 = 0;
        switch (b) {
            case 8:
                ds9 ds9Var2 = (ds9) obj4;
                r90 r90Var = (r90) obj3;
                j34 j34Var = r90Var.c;
                String str = r90Var.a;
                ta0 ta0Var = (ta0) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = ds9Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * ds9Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                s90 s90Var = ds9Var2.d;
                if (simpleQueryForLong >= s90Var.a) {
                    ds9Var2.e(1L, be6Var2, str);
                    return -1L;
                }
                Long b2 = ds9.b(sQLiteDatabase, ta0Var);
                if (b2 != null) {
                    insert = b2.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", ta0Var.a);
                    contentValues.put("priority", Integer.valueOf(qm8.a(ta0Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = ta0Var.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = s90Var.e;
                byte[] bArr2 = j34Var.b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(r90Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(r90Var.e));
                contentValues2.put("payload_encoding", j34Var.a.a);
                contentValues2.put("code", r90Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", r90Var.g);
                contentValues2.put("pseudonymous_id", r90Var.h);
                contentValues2.put("experiment_ids_clear_blob", r90Var.i);
                contentValues2.put("experiment_ids_encrypted_blob", r90Var.j);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i8);
                    for (int i9 = 1; i9 <= ceil; i9++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(r90Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 9:
                ds9 ds9Var3 = (ds9) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ta0 ta0Var2 = (ta0) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i6 : 0;
                    q90 q90Var = new q90();
                    q90Var.h = new HashMap();
                    String string = cursor2.getString(i6);
                    if (string == null) {
                        p3d.h("Null transportName");
                        return null;
                    }
                    q90Var.a = string;
                    q90Var.f = Long.valueOf(cursor2.getLong(i5));
                    q90Var.g = Long.valueOf(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor2.getString(4);
                        q90Var.e = new j34(string2 == null ? ds9.f : new n34(string2), cursor2.getBlob(5));
                        ds9Var = ds9Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        n34 n34Var = string3 == null ? ds9.f : new n34(string3);
                        Cursor query = ds9Var3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i11 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i11 += blob.length;
                            }
                            byte[] bArr3 = new byte[i11];
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                ds9 ds9Var4 = ds9Var3;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, i13, bArr4.length);
                                    i13 += bArr4.length;
                                    i12++;
                                    query = cursor;
                                    ds9Var3 = ds9Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            ds9Var = ds9Var3;
                            query.close();
                            q90Var.e = new j34(n34Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        q90Var.c = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        q90Var.d = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        q90Var.b = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        q90Var.i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        q90Var.j = cursor2.getBlob(11);
                    }
                    arrayList.add(new ga0(j, ta0Var2, q90Var.b()));
                    ds9Var3 = ds9Var;
                    i5 = 2;
                    i6 = 1;
                }
                return null;
            default:
                ds9 ds9Var5 = (ds9) obj4;
                HashMap hashMap = (HashMap) obj3;
                lyc lycVar = (lyc) obj2;
                ArrayList arrayList3 = (ArrayList) lycVar.c;
                Cursor cursor3 = (Cursor) obj;
                ds9Var5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i14 = cursor3.getInt(1);
                    be6 be6Var3 = be6.b;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            be6Var3 = be6.c;
                        } else if (i14 == 2) {
                            be6Var = be6Var2;
                            long j2 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new ce6(j2, be6Var));
                            i = 6;
                            i2 = 5;
                            i3 = 4;
                            i4 = 3;
                            i7 = 0;
                        } else if (i14 == i4) {
                            be6Var3 = be6.e;
                        } else if (i14 == i3) {
                            be6Var3 = be6.f;
                        } else if (i14 == i2) {
                            be6Var3 = be6.h;
                        } else if (i14 == i) {
                            be6Var3 = be6.n;
                        } else {
                            pse.a(Integer.valueOf(i14), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    be6Var = be6Var3;
                    long j22 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new ce6(j22, be6Var));
                    i = 6;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i15 = ee6.c;
                    arrayList3.add(new ee6((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long e = ds9Var5.b.e();
                SQLiteDatabase a = ds9Var5.a();
                a.beginTransaction();
                try {
                    Cursor rawQuery = a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        vrb vrbVar = new vrb(rawQuery.getLong(0), e);
                        rawQuery.close();
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        lycVar.b = vrbVar;
                        lycVar.d = new b05(new c5b(ds9Var5.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * ds9Var5.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), s90.f.a));
                        lycVar.e = (String) ds9Var5.e.get();
                        return new ij2((vrb) lycVar.b, DesugarCollections.unmodifiableList(arrayList3), (b05) lycVar.d, (String) lycVar.e);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    a.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // r42
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        yg9 yg9Var = (yg9) this.b;
        mk0 mk0Var = (mk0) this.c;
        n12 n12Var = (n12) this.d;
        if (messageMedia == null || messageMedia.geo == null) {
            return;
        }
        ch9 ch9Var = yg9Var.Q.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) mk0Var.b;
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
            pageblockmap.w = 600;
            pageblockmap.h = 400;
        }
        ch9 ch9Var2 = yg9Var.Q.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        n12Var.a(true);
        yg9Var.Q.post(new eg9(yg9Var, mk0Var, (byte) 0));
    }

    @Override // bnc
    public final void c(cnc cncVar) {
        mkc mkcVar = (mkc) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        dnc dncVar = (dnc) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            hl.r(mkcVar.S0);
            mkcVar.R0 = false;
            if (mkcVar.w0.isTouchExplorationEnabled()) {
                cncVar.announceForAccessibility(voIPService.isFrontFaceCamera() ? ob6.M0(2131754726, null) : ob6.M0(2131754725, null));
            }
            dncVar.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // ea9
    public final void call() {
        h31 h31Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
        switch (b) {
            case 4:
                String str = (String) obj;
                if (obj2 == null) {
                    h31Var = null;
                } else {
                    try {
                        h31Var = new h31(obj2);
                    } catch (u31 e) {
                        androidx.car.app.utils.e.f(iOnDoneCallback, str, e);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(h31Var);
                break;
            default:
                String str2 = (String) obj;
                try {
                    iOnDoneCallback.onFailure(new h31(new FailureResponse((Exception) obj2)));
                    break;
                } catch (u31 e2) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e2);
                }
        }
    }

    @Override // b7c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((b2a) this.b).Z0((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // gcb
    public final void l(Canvas canvas, RectF rectF, float f) {
        jja jjaVar = (jja) this.b;
        k69 k69Var = (k69) this.c;
        int[] iArr = (int[]) this.d;
        jjaVar.c(canvas, rectF, f);
        jjaVar.f(canvas, rectF, f);
        if (jjaVar.h) {
            jjaVar.b(canvas, rectF, f);
        } else {
            jjaVar.e(canvas, rectF, f);
        }
        if (k69Var != null && k69Var.b0 && k69Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            k69Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // f01
    public final void onRejoinRequested() {
        ((VoIPService) this.b).lambda$onBroadcastStateChanged$18((vc2) this.c, (NativeInstance) this.d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        am2 am2Var = (am2) this.b;
        c51 c51Var = (c51) this.c;
        int[] iArr = (int[]) this.d;
        cc4.b("wear-auth: /answer delivered to " + ((String) am2Var.e));
        int i = 0;
        c51Var.setLoading(false);
        int i2 = iArr[0];
        ArrayList arrayList = (ArrayList) am2Var.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        if (context != null) {
            e S = LaunchActivity.S();
            vnb resourceProvider = S != null ? S.getResourceProvider() : null;
            nx0 nx0Var = nwc.c;
            if (nx0Var != null) {
                nx0Var.dismiss();
                nwc.c = null;
            }
            nx0 h = uh9.h(1, resourceProvider, context, false);
            mwc mwcVar = new mwc(context);
            h.O = mwcVar;
            LinearLayout j = uh9.j(context, 1);
            mwcVar.addView(j, tre.e(-1, -1, jn7.D1));
            TextView b = zze.b(context, 20.0f, aob.j5, true, resourceProvider);
            uh9.q(b, 17, null, 2131742578);
            j.addView(b, tre.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            while (i < arrayList.size()) {
                lv3 f = pv3.f((String) arrayList.get(i));
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(f);
                jn7.i(imageView);
                int L = hl.L(80.0f);
                int i3 = aob.Fi;
                ShapeDrawable K = aob.K(L, aob.p1(0.15f, aob.v0(i3, resourceProvider)));
                uob K2 = yob.K(0.15f, i3);
                imageView.setBackground(K);
                yob.j(imageView, K, K2, null, resourceProvider);
                linearLayout.addView(imageView, tre.k(i == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
                i++;
            }
            j.addView(linearLayout, tre.t(-2, -2, 49, 32, 12, 32, 12));
            c51 i4 = xnb.i(24, resourceProvider, context, true);
            i4.setText(ob6.M0(2131742577, null));
            j.addView(i4, tre.t(-1, 48, 7, 12, 12, 12, 8));
            int i5 = aob.a7;
            h.t0(i5);
            h.L(i5);
            nwc.c = h;
            h.show();
            i4.setOnClickListener(new ae((Object) i4, i2, (Object) h, (byte) 22));
        }
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        long j;
        int i3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                ArrayList arrayList2 = (ArrayList) obj2;
                zu1 zu1Var = (zu1) obj;
                PhotoViewer photoViewer = ((gb8) obj3).b;
                if (arrayList.size() > 1 || ((jf7) arrayList.get(0)).a == yac.h(photoViewer.U).e() || charSequence != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        long j2 = ((jf7) arrayList.get(i4)).a;
                        if (charSequence != null) {
                            j = j2;
                            r7a.B(photoViewer.U).q0(p7a.b(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j = j2;
                        }
                        r7a.B(photoViewer.U).p0(arrayList2, j, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    uj3Var.finishFragment();
                    if (zu1Var != null) {
                        zu1Var.i6();
                        UndoView undoView = zu1Var.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((jf7) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
                                break;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                                break;
                            }
                        }
                    }
                } else {
                    jf7 jf7Var = (jf7) arrayList.get(0);
                    long j3 = jf7Var.a;
                    Bundle l = bs2.l("scrollToTopOnResume", true);
                    if (wf3.B(j3)) {
                        l.putInt("enc_id", (int) (j3 & 4294967295L));
                    } else if (wf3.D(j3)) {
                        l.putLong("user_id", j3);
                    } else {
                        l.putLong("chat_id", -j3);
                    }
                    zu1 zu1Var2 = new zu1(l);
                    if (jf7Var.b != 0) {
                        ro4.a(zu1Var2, jf7Var);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(zu1Var2, true, false)) {
                        zu1Var2.cc(arrayList2);
                        break;
                    } else {
                        uj3Var.finishFragment();
                        break;
                    }
                }
                break;
            case 3:
                cr8 cr8Var = (cr8) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uj3 uj3Var2 = (uj3) obj;
                long j4 = ((jf7) arrayList.get(0)).a;
                ProfileActivity profileActivity = cr8Var.b;
                i3 = ((e) profileActivity).currentAccount;
                TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j4));
                if (M0 == null || (!M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                    String M02 = ob6.M0(2131754456, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M02;
                    idVar.U = hl.S2(ob6.a0("AddMembersAlertNamesText", null, 2131754392, lbc.r(user), M0 == null ? "" : M0.title));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    alertDialog$Builder.j(ob6.M0(2131754456, null), new jn1((Object) cr8Var, j4, (e) uj3Var, (Object) user, (byte) 7));
                    profileActivity.showDialog(idVar);
                    break;
                } else {
                    profileActivity.getMessagesController().I(M0, user, new ps0((Object) cr8Var, j4, (Object) uj3Var2, (byte) 7));
                    break;
                }
                break;
            default:
                wua wuaVar = (wua) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                uj3 uj3Var3 = (uj3) obj;
                if (arrayList.isEmpty()) {
                    break;
                } else {
                    long j5 = ((jf7) arrayList.get(0)).a;
                    Long l2 = (Long) af2.e(wuaVar.a).r.get(tL_starGiftUnique.slug);
                    long longValue = l2 != null ? l2.longValue() : 0L;
                    if (longValue != 0 && longValue != j5) {
                        jj.k0(wuaVar.getContext(), wuaVar.J0, wuaVar.a, tL_starGiftUnique, longValue, new z09((Object) wuaVar, j5, (TLObject) tL_starGiftUnique, (Object) uj3Var3, (byte) 4));
                        break;
                    } else {
                        af2.e(wuaVar.a).q(j5, new dpb(null, tL_starGiftUnique.slug), null, true);
                        uj3Var3.presentFragment(zu1.ha(j5), true);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        byte b = this.a;
        return false;
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        zqb zqbVar = (zqb) this.b;
        ne2 ne2Var = (ne2) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        mn5 p = imageReceiver.p();
        if (!z || p == null || (bitmap = p.c) == null) {
            return;
        }
        Drawable drawable = ne2Var.b;
        if (drawable instanceof ih7) {
            ih7 ih7Var = (ih7) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            ih7Var.r((wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100, zqb.e(bitmap));
            ih7Var.s(zqbVar.M);
            zqbVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd
    public final void w(id idVar, int i) {
        int i2;
        byte b = this.a;
        Object[] objArr = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 7:
                xi9 xi9Var = (xi9) obj;
                String trim = ((EditTextBoldCursor) obj3).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) obj2).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    switch (xi9Var.a) {
                        case 0:
                            mi9 mi9Var = xi9Var.b;
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            mi9Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            mi9 mi9Var2 = xi9Var.b;
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            mi9Var2.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 12:
                uaa uaaVar = (uaa) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i2 = ((e) uaaVar.a).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(resetauthorization, new pl7(uaaVar, tL_authorization, (byte) 23));
                ((e9a) obj3).d.dismiss();
                break;
            case 13:
                eja ejaVar = (eja) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ((p5b) obj2).F(arrayList);
                d31.b0(ejaVar.y1).Q(R.raw.ic_delete, 36, ob6.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                ejaVar.E(false);
                break;
            case 16:
                ((w9b) obj3).H0((u9b) obj2, (Runnable) obj, true);
                break;
            case 17:
                d0 d0Var = (d0) obj3;
                if (aob.j0(((e0) obj2).d, (ynb) obj, true)) {
                    aob.r1(false, false);
                    aob.I1(aob.I, d0Var.e.f == 1, -1, null);
                    break;
                }
                break;
            case 22:
                gtc gtcVar = (gtc) obj3;
                c cVar = (c) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    cVar.c.C();
                }
                i18.a(cVar.a, new sb((byte) 7), null, null, null, new qo0(cVar, new ku9(gtcVar, (gtcVar.getParentLayout() == null || gtcVar.getParentLayout().getFragmentStack().size() <= 1) ? null : (e) gtcVar.getParentLayout().getFragmentStack().get(gtcVar.getParentLayout().getFragmentStack().size() - 2), (byte) 22), (byte) 4), false, true, new c34((rj4) null, (g25) null));
                break;
            case 23:
                c cVar2 = (c) obj2;
                l01 g = idVar.g(i, true, true);
                g.d();
                dtc dtcVar = new dtc((gtc) obj3, g, objArr == true ? 1 : 0);
                c.P("disable backup: getting phrase...");
                cVar2.E(false, true, false, new p((Object) cVar2, (Object) dtcVar, obj, (byte) 18));
                break;
            default:
                euc eucVar = (euc) obj3;
                f42 f42Var = (f42) obj2;
                sg2 sg2Var = (sg2) obj;
                eucVar.getClass();
                if (f42Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim3 = f42Var.getText().toString().trim();
                    eucVar.h0 = TextUtils.isEmpty(trim3) ? null : trim3;
                    eucVar.i0 = !sg2Var.b();
                    boolean isEmpty = TextUtils.isEmpty(eucVar.h0);
                    TextView textView = eucVar.Q;
                    if (isEmpty) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(eucVar.h0);
                        eucVar.Q.setVisibility(0);
                    }
                    eucVar.E0();
                    idVar.dismiss();
                    eucVar.r0();
                    break;
                } else {
                    int i3 = -eucVar.p0;
                    eucVar.p0 = i3;
                    hl.A3(i3, f42Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ o48(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeCallable
    public final Object call() {
        RtpSender lambda$createSender$20;
        lambda$createSender$20 = ((PeerConnection) this.b).lambda$createSender$20((String) this.c, (String) this.d);
        return lambda$createSender$20;
    }
}

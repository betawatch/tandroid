// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.OpenChatReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class np6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ np6(yv1 yv1Var, ArrayList arrayList, int i) {
        this.a = (byte) 10;
        this.c = yv1Var;
        this.d = arrayList;
        this.b = i;
    }

    private final void a() {
        eb ebVar = (eb) this.c;
        String str = (String) this.d;
        va vaVar = ebVar.x;
        ArrayList arrayList = ebVar.y;
        arrayList.clear();
        ku9.a().getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList2.add(jSONArray.getString(i));
            }
        } catch (Exception e) {
            fc4.g(e, false);
            try {
                JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getJSONObject(i2).getString("key"));
                }
            } catch (Exception e2) {
                fc4.g(e2, false);
                try {
                    JSONArray jSONArray3 = new JSONArray(str);
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        String string = jSONArray3.getJSONObject(i3).getString("phrase");
                        if (!TextUtils.isEmpty(string)) {
                            arrayList2.add(string);
                        }
                    }
                } catch (Exception e3) {
                    fc4.g(e3, false);
                }
            }
        }
        arrayList.addAll(arrayList2);
        vaVar.g3.O(true);
        if (this.b != (!arrayList.isEmpty())) {
            vaVar.f3.g1(0, 0);
        }
    }

    private final void b() {
        he heVar = (he) this.c;
        View view = (View) this.d;
        if (view instanceof clb) {
            clb clbVar = (clb) view;
            if (clbVar.a) {
                clbVar.a = false;
                clbVar.invalidate();
            }
        }
        if (this.b) {
            heVar.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        if (r1 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        q51 q51Var = (q51) this.c;
        cf7 cf7Var = (cf7) this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = cf7Var.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    arrayList.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                }
                sQLiteCursor.dispose();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i);
                    if (!tL_businessChatLink.entities.isEmpty()) {
                        for (int i2 = 0; i2 < tL_businessChatLink.entities.size(); i2++) {
                            TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i2);
                            if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                arrayList4.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                            } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                arrayList4.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                            }
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    cf7Var.k0(arrayList4, arrayList2, false);
                }
                if (!arrayList5.isEmpty()) {
                    cf7Var.P(TextUtils.join(",", arrayList5), arrayList3);
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            sQLiteCursor.dispose();
            gm.c3(new aa7((Object) q51Var, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, this.b, (byte) 4));
        } finally {
        }
    }

    private final void d() {
        ((yv1) this.c).Zc((k47) this.d, this.b);
    }

    private final void e() {
        ((yv1) this.c).eb(this.b ? 1 : 0, (ArrayList) this.d, false, false);
    }

    private final void f() {
        int i;
        iv1 iv1Var = (iv1) this.c;
        TLObject tLObject = (TLObject) this.d;
        yv1 yv1Var = iv1Var.a;
        yv1Var.oc.b();
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        boolean z2 = this.b;
        if (!z) {
            c41.b0(yv1Var).Q(R.raw.error, 36, jb6.M0(z2 ? 2131754432 : 2131754382, null)).k(true);
            return;
        }
        i = ((d) yv1Var).currentAccount;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        hs6.d0(i).L1(tL_messages_stickerSet, false);
        if (yv1Var.getParentActivity() == null || yv1Var.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        tL_inputStickerSetID.id = stickerSet.id;
        if (!z2) {
            x2b x2bVar = new x2b(yv1Var.getParentActivity(), yv1Var, tL_inputStickerSetID, null, yv1Var.a0, yv1Var.Ba);
            boolean Y7 = yv1Var.Y7();
            x2bVar.i0 = Y7;
            x2bVar.n = Y7;
            yv1Var.showDialog(x2bVar);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(tL_inputStickerSetID);
        az3 az3Var = new az3(yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, arrayList);
        boolean Y72 = yv1Var.Y7();
        az3Var.i0 = Y72;
        az3Var.n = Y72;
        yv1Var.showDialog(az3Var);
    }

    private final void g() {
        i22 i22Var = (i22) this.c;
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
        if (!i22Var.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
            i22Var.v0(true);
            editTextBoldCursor.requestFocus();
            if (this.b) {
                gm.c3(new lx1(i22Var, editTextBoldCursor, (byte) 7));
            }
        }
    }

    private final void h() {
        ((jac) this.c).a((Bitmap) this.d, Boolean.valueOf(this.b));
    }

    private final void i() {
        na2 na2Var = (na2) this.c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        pa2 pa2Var = na2Var.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, pa2Var.o2, pa2Var.getContext());
        String M0 = jb6.M0(2131743359, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131743360, null);
        alertDialog$Builder.j(jb6.M0(2131747564, null), new ci((Object) na2Var, (Object) tL_username, this.b, (byte) 6));
        alertDialog$Builder.o();
    }

    private final void j() {
        eb2 eb2Var = (eb2) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        ib2 ib2Var = eb2Var.y.d;
        ib2Var.P = false;
        if (this.b || !chat.join_request) {
            return;
        }
        chat.join_request = false;
        ib2Var.Q = true;
        ib2Var.getMessagesController().k5(chat.id, 0L, false, false, false, new db2(eb2Var, (byte) 1), new ra2(eb2Var, chat, (byte) 6));
    }

    private final void k() {
        ((co2) this.c).Y0((qac) this.d, this.b, false);
    }

    private final void l() {
        boolean z;
        dk3 dk3Var = (dk3) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        nk3 nk3Var = dk3Var.b;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            z = this.b;
            if (i >= size) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (dialog != null) {
                nk3Var.getNotificationsController().T(dialog.id, z ? 3 : 4, 0L);
                i2++;
            }
            i++;
        }
        b31 b31Var = new b31(nk3Var.getParentActivity(), null);
        b31Var.b.setText(z ? jb6.G(i2, "NotificationsMutedHintChats", new Object[0]) : jb6.G(i2, "NotificationsUnmutedHintChats", new Object[0]));
        if (z) {
            b31Var.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            b31Var.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        u31.g(nk3Var, b31Var, 1500).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r6 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m() {
        SQLiteDatabase sQLiteDatabase;
        cf7 cf7Var = (cf7) this.c;
        qac qacVar = (qac) this.d;
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteDatabase = cf7Var.b;
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (sQLiteDatabase == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
            sb.append(this.b ? "2" : "0 OR type = 1");
            sb.append(" ORDER BY date DESC");
            sQLiteCursor = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
            while (sQLiteCursor.next()) {
                long longValue = sQLiteCursor.longValue(0);
                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                if (byteBufferValue != null) {
                    try {
                        sr3 sr3Var = new sr3(byteBufferValue);
                        sr3Var.a = longValue;
                        arrayList.add(sr3Var);
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        arrayList2.add(Long.valueOf(longValue));
                    }
                    byteBufferValue.reuse();
                }
            }
            sQLiteCursor.dispose();
            if (arrayList2.size() > 0) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList2.get(i)).stepThis().dispose();
                }
            }
            sQLiteCursor.dispose();
            gm.c3(new rr3(qacVar, arrayList, (byte) 0));
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void n() {
        ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
    }

    private final void o() {
        bc4 bc4Var = (bc4) this.c;
        boolean z = this.b;
        String str = (String) this.d;
        qd4 qd4Var = !z ? (qd4) bc4Var.h.get(str) : (qd4) bc4Var.n.get(str);
        bc4Var.y.remove(str);
        if (qd4Var != null) {
            bc4Var.n.remove(str);
            bc4Var.e.remove(qd4Var);
            bc4Var.f.remove(qd4Var);
            if (qd4Var.m != 3) {
                qd4Var.m = (byte) 2;
                Utilities.d.c(new md4(qd4Var, (byte) 1));
                String str2 = qd4Var.l;
                if (str2 == null) {
                    Set set = s70.a;
                } else {
                    s70.a.remove(str2);
                }
                qd4Var.o.a();
                qd4Var.b();
            }
        }
    }

    private final void p() {
        ((me4) this.c).c0((in4) this.d, !this.b);
    }

    private final void q() {
        ((ln4) this.c).Z0((in4) this.d, !this.b);
    }

    private final void r() {
        st4 st4Var = (st4) this.c;
        TLObject tLObject = (TLObject) this.d;
        ArrayList arrayList = st4Var.c;
        if (tLObject instanceof TLRPC.messages_BotResults) {
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            st4Var.h = messages_botresults.next_offset;
            if (this.b) {
                arrayList.clear();
            }
            for (int i = 0; i < messages_botresults.results.size(); i++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i);
                TLRPC.Document document = botInlineResult.document;
                if (document != null) {
                    arrayList.add(document);
                } else {
                    TLRPC.Photo photo = botInlineResult.photo;
                    if (photo != null) {
                        arrayList.add(photo);
                    } else if (botInlineResult.content != null) {
                        arrayList.add(botInlineResult);
                    }
                }
            }
            st4Var.d = false;
            st4Var.F(false);
            st4Var.f();
        }
    }

    private final void s() {
        l35 l35Var = (l35) this.c;
        d12 d12Var = (d12) this.d;
        boolean z = this.b;
        if (l35Var.b) {
            return;
        }
        try {
            if (d12Var.b != ((g35) d12Var.c).l()) {
                l35Var.c("STORAGE_CANCELED");
                return;
            }
            cle.b = l35Var;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.isFinishing() || launchActivity.isDestroyed() || launchActivity.u().P()) {
                l35Var.c("AUTH_UNAVAILABLE");
                return;
            }
            l35Var.e = launchActivity;
            try {
                if (z) {
                    l35Var.a();
                } else if (Build.VERSION.SDK_INT >= 30) {
                    l35Var.d();
                } else {
                    l35Var.b();
                }
            } catch (Exception e) {
                fc4.g(e, true);
                l35Var.a();
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
            l35Var.c("AUTH_UNAVAILABLE");
        }
    }

    private final void t() {
        ha5 ha5Var = (ha5) this.c;
        ha5 ha5Var2 = (ha5) this.d;
        if (this.b) {
            ha5Var.y.removeView(ha5Var2);
        }
        ha5Var2.setVisibility(8);
        ha5Var.A0 = null;
    }

    private final void u() {
        fn5 fn5Var = (fn5) this.c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i = 0;
        while (true) {
            int i2 = 3;
            if (i >= 3) {
                return;
            }
            if (i > 0 && !this.b) {
                return;
            }
            if (i == 0) {
                i2 = 1;
            } else if (i == 1) {
                i2 = 0;
            }
            int A = imageReceiver.A(i2);
            if (A != 0) {
                if (i == 0) {
                    HashMap hashMap = fn5Var.l;
                    SparseArray sparseArray = fn5Var.m;
                    String str = (String) sparseArray.get(A);
                    if (str != null) {
                        dn5 dn5Var = (dn5) hashMap.get(str);
                        if (dn5Var != null) {
                            ArrayList arrayList = dn5Var.c;
                            int indexOf = arrayList.indexOf(imageReceiver);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                                dn5Var.d.remove(indexOf);
                            }
                            if (arrayList.isEmpty()) {
                                hashMap.remove(str);
                            }
                        }
                        sparseArray.remove(A);
                    }
                }
                tm5 tm5Var = (tm5) fn5Var.k.get(A);
                if (tm5Var != null) {
                    tm5Var.b(imageReceiver);
                }
            }
            i++;
        }
    }

    private final void v() {
        LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
        he heVar = (he) this.d;
        languageSelectActivity.getClass();
        heVar.dismiss();
        if (this.b) {
            return;
        }
        gm.d3(new ez5(languageSelectActivity, (byte) 1), 10L);
    }

    private final void w() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        d dVar = (d) this.d;
        String str = LaunchActivity.C1;
        launchActivity.u0(dVar, this.b, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void x() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Object[] objArr;
        Object[] objArr2;
        cf7 cf7Var = (cf7) this.c;
        HashMap hashMap = (HashMap) this.d;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        try {
            if (e21.a) {
                fc4.b(cf7Var.currentAccount + " save contacts to db " + hashMap.size());
            }
            cf7Var.b.executeFast("DELETE FROM user_contacts_v7 WHERE 1").stepThis().dispose();
            cf7Var.b.executeFast("DELETE FROM user_phones_v7 WHERE 1").stepThis().dispose();
            cf7Var.b.beginTransaction();
            SQLitePreparedStatement executeFast = cf7Var.b.executeFast("REPLACE INTO user_contacts_v7 VALUES(?, ?, ?, ?, ?)");
            try {
                sQLitePreparedStatement = cf7Var.b.executeFast("REPLACE INTO user_phones_v7 VALUES(?, ?, ?, ?)");
            } catch (Exception e) {
                e = e;
                sQLitePreparedStatement = null;
            } catch (Throwable th) {
                th = th;
                sQLitePreparedStatement = null;
            }
            try {
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    objArr2 = 0;
                    objArr = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    yv2 yv2Var = (yv2) ((Map.Entry) it.next()).getValue();
                    ArrayList arrayList = yv2Var.e;
                    ArrayList arrayList2 = yv2Var.g;
                    if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                        executeFast.requery();
                        executeFast.bindString(1, yv2Var.b);
                        executeFast.bindInteger(2, yv2Var.a);
                        executeFast.bindString(3, yv2Var.i);
                        executeFast.bindString(4, yv2Var.j);
                        executeFast.bindInteger(5, yv2Var.l);
                        executeFast.step();
                        for (int i = 0; i < arrayList.size(); i++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindString(1, yv2Var.b);
                            sQLitePreparedStatement.bindString(2, (String) arrayList.get(i));
                            sQLitePreparedStatement.bindString(3, (String) arrayList2.get(i));
                            sQLitePreparedStatement.bindInteger(4, ((Integer) yv2Var.h.get(i)).intValue());
                            sQLitePreparedStatement.step();
                        }
                    }
                }
                executeFast.dispose();
                try {
                    try {
                        sQLitePreparedStatement.dispose();
                        cf7Var.b.commitTransaction();
                        if (this.b) {
                            cf7Var.b.executeFast("DROP TABLE IF EXISTS user_contacts_v6;").stepThis().dispose();
                            cf7Var.b.executeFast("DROP TABLE IF EXISTS user_phones_v6;").stepThis().dispose();
                            cf7Var.a.c(new ee7(cf7Var, objArr == true ? 1 : 0, objArr2 == true ? 1 : 0));
                        }
                        SQLiteDatabase sQLiteDatabase3 = cf7Var.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cf7Var.n(e, true);
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        sQLiteDatabase2 = cf7Var.b;
                        if (sQLiteDatabase2 == null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    sQLiteDatabase = cf7Var.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                sQLitePreparedStatement2 = executeFast;
                cf7Var.n(e, true);
                if (sQLitePreparedStatement2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                sQLiteDatabase2 = cf7Var.b;
                if (sQLiteDatabase2 == null) {
                }
            } catch (Throwable th3) {
                th = th3;
                sQLitePreparedStatement2 = executeFast;
                if (sQLitePreparedStatement2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                sQLiteDatabase = cf7Var.b;
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            sQLitePreparedStatement = null;
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021e, code lost:
    
        if (r12 == 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0220, code lost:
    
        r13 = r1.e0;
        r14 = r11.id;
        r13 = (vh6) r13.a;
        r15 = (android.util.SparseIntArray) r13.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022e, code lost:
    
        if (r15 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0235, code lost:
    
        if (r15.get(r12, -1) != r14) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0237, code lost:
    
        r15.delete(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023e, code lost:
    
        if (r15.size() != 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0240, code lost:
    
        r13.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0243, code lost:
    
        r5 = r11.anchor_msg_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0245, code lost:
    
        if (r5 == 0) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0247, code lost:
    
        r5 = r1.a0(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024c, code lost:
    
        if (r5 == null) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024e, code lost:
    
        if (r9 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0250, code lost:
    
        r9 = td4.t(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0254, code lost:
    
        r9.add(new k47(r1.currentAccount, r5, true, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0260, code lost:
    
        r2 = r2 + 1;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0268, code lost:
    
        if (r0.i() != false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026a, code lost:
    
        gm.c3(new dd7(r1, r0, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0273, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01db, code lost:
    
        if (r11 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0317, code lost:
    
        if (r13 != r10.dialog_id) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0334, code lost:
    
        if (sd2.r0(r7) != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x034d, code lost:
    
        if (sd2.r0(r7) != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ef, code lost:
    
        if (r11 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f1, code lost:
    
        r11.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f4, code lost:
    
        r0 = new vh6();
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ff, code lost:
    
        if (r2 >= r10.m()) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0201, code lost:
    
        r3 = r10.j(r2);
        r6 = (java.util.ArrayList) r10.n(r2);
        r7 = r6.size();
        r9 = r5;
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0212, code lost:
    
        if (r8 >= r7) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0214, code lost:
    
        r11 = r6.get(r8);
        r8 = r8 + 1;
        r11 = (org.telegram.tgnet.tl.TL_ephemeral.EphemeralMessage) r11;
        r12 = r11.anchor_msg_id;
     */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07c5 A[Catch: all -> 0x084e, TryCatch #9 {all -> 0x084e, blocks: (B:278:0x04a4, B:280:0x04a8, B:281:0x04cb, B:284:0x04e0, B:285:0x0554, B:288:0x05a1, B:291:0x05a7, B:294:0x05ac, B:295:0x05c9, B:296:0x05d5, B:298:0x05db, B:300:0x05f6, B:302:0x0623, B:305:0x0635, B:307:0x0642, B:308:0x0657, B:311:0x078c, B:314:0x07a6, B:316:0x07c5, B:318:0x07d1, B:320:0x07e5, B:322:0x07ef, B:324:0x07f3, B:326:0x07f6, B:328:0x082c, B:330:0x07fa, B:331:0x07ff, B:334:0x0800, B:335:0x0805, B:336:0x0806, B:338:0x080e, B:340:0x0812, B:342:0x0815, B:344:0x081e, B:345:0x0829, B:347:0x0824, B:349:0x0836, B:350:0x083b, B:353:0x083c, B:354:0x0841, B:355:0x07d8, B:391:0x077b, B:419:0x0647, B:421:0x064d, B:426:0x060b, B:429:0x05b2, B:431:0x05bb, B:432:0x05c6, B:433:0x05c1, B:434:0x0842, B:435:0x0847, B:436:0x0848, B:437:0x084d, B:438:0x04e6, B:440:0x04ee, B:442:0x04f4, B:443:0x04f8, B:445:0x04fe, B:448:0x0520, B:450:0x0526, B:452:0x0534, B:454:0x0537, B:457:0x053d, B:459:0x0543, B:462:0x0549, B:464:0x054f), top: B:277:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07d1 A[Catch: all -> 0x084e, TryCatch #9 {all -> 0x084e, blocks: (B:278:0x04a4, B:280:0x04a8, B:281:0x04cb, B:284:0x04e0, B:285:0x0554, B:288:0x05a1, B:291:0x05a7, B:294:0x05ac, B:295:0x05c9, B:296:0x05d5, B:298:0x05db, B:300:0x05f6, B:302:0x0623, B:305:0x0635, B:307:0x0642, B:308:0x0657, B:311:0x078c, B:314:0x07a6, B:316:0x07c5, B:318:0x07d1, B:320:0x07e5, B:322:0x07ef, B:324:0x07f3, B:326:0x07f6, B:328:0x082c, B:330:0x07fa, B:331:0x07ff, B:334:0x0800, B:335:0x0805, B:336:0x0806, B:338:0x080e, B:340:0x0812, B:342:0x0815, B:344:0x081e, B:345:0x0829, B:347:0x0824, B:349:0x0836, B:350:0x083b, B:353:0x083c, B:354:0x0841, B:355:0x07d8, B:391:0x077b, B:419:0x0647, B:421:0x064d, B:426:0x060b, B:429:0x05b2, B:431:0x05bb, B:432:0x05c6, B:433:0x05c1, B:434:0x0842, B:435:0x0847, B:436:0x0848, B:437:0x084d, B:438:0x04e6, B:440:0x04ee, B:442:0x04f4, B:443:0x04f8, B:445:0x04fe, B:448:0x0520, B:450:0x0526, B:452:0x0534, B:454:0x0537, B:457:0x053d, B:459:0x0543, B:462:0x0549, B:464:0x054f), top: B:277:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07e5 A[Catch: all -> 0x084e, TryCatch #9 {all -> 0x084e, blocks: (B:278:0x04a4, B:280:0x04a8, B:281:0x04cb, B:284:0x04e0, B:285:0x0554, B:288:0x05a1, B:291:0x05a7, B:294:0x05ac, B:295:0x05c9, B:296:0x05d5, B:298:0x05db, B:300:0x05f6, B:302:0x0623, B:305:0x0635, B:307:0x0642, B:308:0x0657, B:311:0x078c, B:314:0x07a6, B:316:0x07c5, B:318:0x07d1, B:320:0x07e5, B:322:0x07ef, B:324:0x07f3, B:326:0x07f6, B:328:0x082c, B:330:0x07fa, B:331:0x07ff, B:334:0x0800, B:335:0x0805, B:336:0x0806, B:338:0x080e, B:340:0x0812, B:342:0x0815, B:344:0x081e, B:345:0x0829, B:347:0x0824, B:349:0x0836, B:350:0x083b, B:353:0x083c, B:354:0x0841, B:355:0x07d8, B:391:0x077b, B:419:0x0647, B:421:0x064d, B:426:0x060b, B:429:0x05b2, B:431:0x05bb, B:432:0x05c6, B:433:0x05c1, B:434:0x0842, B:435:0x0847, B:436:0x0848, B:437:0x084d, B:438:0x04e6, B:440:0x04ee, B:442:0x04f4, B:443:0x04f8, B:445:0x04fe, B:448:0x0520, B:450:0x0526, B:452:0x0534, B:454:0x0537, B:457:0x053d, B:459:0x0543, B:462:0x0549, B:464:0x054f), top: B:277:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0806 A[Catch: all -> 0x084e, TryCatch #9 {all -> 0x084e, blocks: (B:278:0x04a4, B:280:0x04a8, B:281:0x04cb, B:284:0x04e0, B:285:0x0554, B:288:0x05a1, B:291:0x05a7, B:294:0x05ac, B:295:0x05c9, B:296:0x05d5, B:298:0x05db, B:300:0x05f6, B:302:0x0623, B:305:0x0635, B:307:0x0642, B:308:0x0657, B:311:0x078c, B:314:0x07a6, B:316:0x07c5, B:318:0x07d1, B:320:0x07e5, B:322:0x07ef, B:324:0x07f3, B:326:0x07f6, B:328:0x082c, B:330:0x07fa, B:331:0x07ff, B:334:0x0800, B:335:0x0805, B:336:0x0806, B:338:0x080e, B:340:0x0812, B:342:0x0815, B:344:0x081e, B:345:0x0829, B:347:0x0824, B:349:0x0836, B:350:0x083b, B:353:0x083c, B:354:0x0841, B:355:0x07d8, B:391:0x077b, B:419:0x0647, B:421:0x064d, B:426:0x060b, B:429:0x05b2, B:431:0x05bb, B:432:0x05c6, B:433:0x05c1, B:434:0x0842, B:435:0x0847, B:436:0x0848, B:437:0x084d, B:438:0x04e6, B:440:0x04ee, B:442:0x04f4, B:443:0x04f8, B:445:0x04fe, B:448:0x0520, B:450:0x0526, B:452:0x0534, B:454:0x0537, B:457:0x053d, B:459:0x0543, B:462:0x0549, B:464:0x054f), top: B:277:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07d8 A[Catch: all -> 0x084e, TryCatch #9 {all -> 0x084e, blocks: (B:278:0x04a4, B:280:0x04a8, B:281:0x04cb, B:284:0x04e0, B:285:0x0554, B:288:0x05a1, B:291:0x05a7, B:294:0x05ac, B:295:0x05c9, B:296:0x05d5, B:298:0x05db, B:300:0x05f6, B:302:0x0623, B:305:0x0635, B:307:0x0642, B:308:0x0657, B:311:0x078c, B:314:0x07a6, B:316:0x07c5, B:318:0x07d1, B:320:0x07e5, B:322:0x07ef, B:324:0x07f3, B:326:0x07f6, B:328:0x082c, B:330:0x07fa, B:331:0x07ff, B:334:0x0800, B:335:0x0805, B:336:0x0806, B:338:0x080e, B:340:0x0812, B:342:0x0815, B:344:0x081e, B:345:0x0829, B:347:0x0824, B:349:0x0836, B:350:0x083b, B:353:0x083c, B:354:0x0841, B:355:0x07d8, B:391:0x077b, B:419:0x0647, B:421:0x064d, B:426:0x060b, B:429:0x05b2, B:431:0x05bb, B:432:0x05c6, B:433:0x05c1, B:434:0x0842, B:435:0x0847, B:436:0x0848, B:437:0x084d, B:438:0x04e6, B:440:0x04ee, B:442:0x04f4, B:443:0x04f8, B:445:0x04fe, B:448:0x0520, B:450:0x0526, B:452:0x0534, B:454:0x0537, B:457:0x053d, B:459:0x0543, B:462:0x0549, B:464:0x054f), top: B:277:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0685 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0279  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        TLRPC.Chat chat;
        TLRPC.User user;
        hs6 hs6Var;
        ArrayList arrayList;
        int i;
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        Intent intent;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Path path;
        int i2;
        ArrayList arrayList2;
        TLRPC.Message message;
        int i3;
        boolean z2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i4;
        int i5;
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z3;
        int i6;
        long j = 0;
        ArrayList arrayList5 = null;
        r5 = null;
        li0 li0Var = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i7 = 1;
        switch (this.a) {
            case 0:
                hs6 hs6Var2 = (hs6) this.c;
                boolean z4 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                try {
                    if (gda.p == null) {
                        gda.p = UUID.randomUUID().toString();
                        a.b.getSharedPreferences("mainconfig", 0).edit().putString("directShareHash2", gda.p).commit();
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    if (z4) {
                        via.n(a.b);
                    } else {
                        List e = via.e(a.b);
                        if (e != null && !e.isEmpty()) {
                            arrayList8.add("compose");
                            for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                                arrayList8.add("did3_" + k47.B1(((TLRPC.TL_topPeer) arrayList6.get(i8)).peer));
                            }
                            for (int i9 = 0; i9 < e.size(); i9++) {
                                String str3 = ((qia) e.get(i9)).b;
                                if (!arrayList8.remove(str3)) {
                                    arrayList9.add(str3);
                                }
                                arrayList7.add(str3);
                            }
                            if (arrayList8.isEmpty() && arrayList9.isEmpty()) {
                                return;
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            via.o(a.b, arrayList9);
                        }
                    }
                    Intent intent2 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                    intent2.setAction("new_dialog");
                    ArrayList arrayList10 = new ArrayList();
                    Context context = a.b;
                    qia qiaVar = new qia();
                    qiaVar.a = context;
                    qiaVar.b = "compose";
                    qiaVar.e = jb6.M0(2131748032, null);
                    qiaVar.f = jb6.M0(2131748032, null);
                    qiaVar.h = IconCompat.d(a.b, R.drawable.shortcut_compose);
                    qiaVar.m = 0;
                    qiaVar.c = new Intent[]{intent2};
                    if (TextUtils.isEmpty(qiaVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = qiaVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    if (z4) {
                        via.m(a.b, qiaVar);
                    } else {
                        arrayList10.add(qiaVar);
                        if (arrayList7.contains("compose")) {
                            via.y(a.b, arrayList10);
                        } else {
                            via.a(a.b, arrayList10);
                        }
                        arrayList10.clear();
                    }
                    HashSet hashSet = new HashSet(1);
                    hashSet.add(hs6.Y1);
                    int i10 = 0;
                    while (i10 < arrayList6.size()) {
                        Intent intent3 = new Intent(a.b, (Class<?>) OpenChatReceiver.class);
                        long B1 = k47.B1(((TLRPC.TL_topPeer) arrayList6.get(i10)).peer);
                        if (pg3.D(B1)) {
                            intent3.putExtra("userId", B1);
                            user = hs6Var2.getMessagesController().W1(Long.valueOf(B1));
                            z = z4;
                            chat = null;
                        } else {
                            long j2 = -B1;
                            z = z4;
                            TLRPC.Chat L0 = hs6Var2.getMessagesController().L0(Long.valueOf(j2));
                            intent3.putExtra("chatId", j2);
                            chat = L0;
                            user = null;
                        }
                        if ((user == null || m9c.z(user)) && chat == null) {
                            hs6Var = hs6Var2;
                            arrayList = arrayList6;
                            i = i10;
                        } else if (user != null) {
                            str = bw2.m(0, user.first_name, user.last_name);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                                intent3.putExtra("currentAccount", hs6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", gda.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                    try {
                                        try {
                                            hs6Var2.getFileLoader().getClass();
                                        } catch (Throwable th) {
                                            th = th;
                                            arrayList = arrayList6;
                                            bitmap = null;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hs6Var = hs6Var2;
                                        str2 = str;
                                        arrayList = arrayList6;
                                        i = i10;
                                        intent = intent3;
                                        bitmap = null;
                                    }
                                    try {
                                        bitmap2 = BitmapFactory.decodeFile(bc4.J(fileLocation, null, true, true).toString());
                                    } catch (Throwable th3) {
                                        th = th3;
                                        arrayList = arrayList6;
                                        bitmap = null;
                                        hs6Var = hs6Var2;
                                        str2 = str;
                                        i = i10;
                                        intent = intent3;
                                        bitmap2 = bitmap;
                                        fc4.g(th, true);
                                        bitmap3 = bitmap2;
                                        String str4 = "did3_" + B1;
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        Context context2 = a.b;
                                        qia qiaVar2 = new qia();
                                        qiaVar2.a = context2;
                                        qiaVar2.b = str4;
                                        qiaVar2.e = r2;
                                        qiaVar2.f = r2;
                                        qiaVar2.m = i + 1;
                                        qiaVar2.c = new Intent[]{intent};
                                        if (gda.u0) {
                                        }
                                        if (bitmap3 != null) {
                                        }
                                        if (z) {
                                        }
                                        i10 = i + 1;
                                        z4 = z;
                                        hs6Var2 = hs6Var;
                                        arrayList6 = arrayList;
                                    }
                                    if (bitmap2 != null) {
                                        try {
                                            int L = gm.L(48.0f);
                                            bitmap3 = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap3);
                                            if (hs6.b2 == null) {
                                                hs6Var = hs6Var2;
                                                try {
                                                    str2 = str;
                                                    try {
                                                        hs6.b2 = new Paint(3);
                                                        hs6.d2 = new RectF();
                                                        Paint paint = new Paint(1);
                                                        hs6.c2 = paint;
                                                        arrayList = arrayList6;
                                                        try {
                                                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                                            path = new Path();
                                                            hs6.e2 = path;
                                                            i = i10;
                                                            intent = intent3;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            i = i10;
                                                            intent = intent3;
                                                            fc4.g(th, true);
                                                            bitmap3 = bitmap2;
                                                            String str42 = "did3_" + B1;
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            Context context22 = a.b;
                                                            qia qiaVar22 = new qia();
                                                            qiaVar22.a = context22;
                                                            qiaVar22.b = str42;
                                                            qiaVar22.e = r2;
                                                            qiaVar22.f = r2;
                                                            qiaVar22.m = i + 1;
                                                            qiaVar22.c = new Intent[]{intent};
                                                            if (gda.u0) {
                                                            }
                                                            if (bitmap3 != null) {
                                                            }
                                                            if (z) {
                                                            }
                                                            i10 = i + 1;
                                                            z4 = z;
                                                            hs6Var2 = hs6Var;
                                                            arrayList6 = arrayList;
                                                        }
                                                        try {
                                                            path.addCircle(L / 2, L / 2, (L / 2) - gm.L(2.0f), Path.Direction.CW);
                                                            hs6.e2.toggleInverseFillType();
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            fc4.g(th, true);
                                                            bitmap3 = bitmap2;
                                                            String str422 = "did3_" + B1;
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            Context context222 = a.b;
                                                            qia qiaVar222 = new qia();
                                                            qiaVar222.a = context222;
                                                            qiaVar222.b = str422;
                                                            qiaVar222.e = r2;
                                                            qiaVar222.f = r2;
                                                            qiaVar222.m = i + 1;
                                                            qiaVar222.c = new Intent[]{intent};
                                                            if (gda.u0) {
                                                            }
                                                            if (bitmap3 != null) {
                                                            }
                                                            if (z) {
                                                            }
                                                            i10 = i + 1;
                                                            z4 = z;
                                                            hs6Var2 = hs6Var;
                                                            arrayList6 = arrayList;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        arrayList = arrayList6;
                                                        i = i10;
                                                        intent = intent3;
                                                        fc4.g(th, true);
                                                        bitmap3 = bitmap2;
                                                        String str4222 = "did3_" + B1;
                                                        if (TextUtils.isEmpty(str2)) {
                                                        }
                                                        Context context2222 = a.b;
                                                        qia qiaVar2222 = new qia();
                                                        qiaVar2222.a = context2222;
                                                        qiaVar2222.b = str4222;
                                                        qiaVar2222.e = r2;
                                                        qiaVar2222.f = r2;
                                                        qiaVar2222.m = i + 1;
                                                        qiaVar2222.c = new Intent[]{intent};
                                                        if (gda.u0) {
                                                        }
                                                        if (bitmap3 != null) {
                                                        }
                                                        if (z) {
                                                        }
                                                        i10 = i + 1;
                                                        z4 = z;
                                                        hs6Var2 = hs6Var;
                                                        arrayList6 = arrayList;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    str2 = str;
                                                    arrayList = arrayList6;
                                                    i = i10;
                                                    intent = intent3;
                                                    fc4.g(th, true);
                                                    bitmap3 = bitmap2;
                                                    String str42222 = "did3_" + B1;
                                                    if (TextUtils.isEmpty(str2)) {
                                                    }
                                                    Context context22222 = a.b;
                                                    qia qiaVar22222 = new qia();
                                                    qiaVar22222.a = context22222;
                                                    qiaVar22222.b = str42222;
                                                    qiaVar22222.e = r2;
                                                    qiaVar22222.f = r2;
                                                    qiaVar22222.m = i + 1;
                                                    qiaVar22222.c = new Intent[]{intent};
                                                    if (gda.u0) {
                                                    }
                                                    if (bitmap3 != null) {
                                                    }
                                                    if (z) {
                                                    }
                                                    i10 = i + 1;
                                                    z4 = z;
                                                    hs6Var2 = hs6Var;
                                                    arrayList6 = arrayList;
                                                }
                                            } else {
                                                hs6Var = hs6Var2;
                                                str2 = str;
                                                arrayList = arrayList6;
                                                i = i10;
                                                intent = intent3;
                                            }
                                            hs6.d2.set(gm.L(2.0f), gm.L(2.0f), gm.L(46.0f), gm.L(46.0f));
                                            canvas.drawBitmap(bitmap2, (Rect) null, hs6.d2, hs6.b2);
                                            canvas.drawPath(hs6.e2, hs6.c2);
                                            try {
                                                canvas.setBitmap(null);
                                            } catch (Exception unused) {
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            hs6Var = hs6Var2;
                                        }
                                    } else {
                                        hs6Var = hs6Var2;
                                        str2 = str;
                                        arrayList = arrayList6;
                                        i = i10;
                                        intent = intent3;
                                        bitmap3 = bitmap2;
                                    }
                                } else {
                                    hs6Var = hs6Var2;
                                    str2 = str;
                                    arrayList = arrayList6;
                                    i = i10;
                                    intent = intent3;
                                    bitmap3 = null;
                                }
                                String str422222 = "did3_" + B1;
                                String str5 = TextUtils.isEmpty(str2) ? " " : str2;
                                Context context222222 = a.b;
                                qia qiaVar222222 = new qia();
                                qiaVar222222.a = context222222;
                                qiaVar222222.b = str422222;
                                qiaVar222222.e = str5;
                                qiaVar222222.f = str5;
                                qiaVar222222.m = i + 1;
                                qiaVar222222.c = new Intent[]{intent};
                                if (gda.u0) {
                                    st stVar = new st(0);
                                    stVar.addAll(hashSet);
                                    qiaVar222222.j = stVar;
                                }
                                if (bitmap3 != null) {
                                    qiaVar222222.h = IconCompat.c(bitmap3);
                                } else {
                                    qiaVar222222.h = IconCompat.d(a.b, R.drawable.shortcut_user);
                                }
                                if (z) {
                                    Context context3 = a.b;
                                    if (TextUtils.isEmpty(qiaVar222222.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr2 = qiaVar222222.c;
                                    if (intentArr2 == null || intentArr2.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    via.m(context3, qiaVar222222);
                                } else {
                                    if (TextUtils.isEmpty(qiaVar222222.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr3 = qiaVar222222.c;
                                    if (intentArr3 == null || intentArr3.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    arrayList10.add(qiaVar222222);
                                    if (arrayList7.contains(str422222)) {
                                        via.y(a.b, arrayList10);
                                    } else {
                                        via.a(a.b, arrayList10);
                                    }
                                    arrayList10.clear();
                                }
                            }
                            fileLocation = null;
                            intent3.putExtra("currentAccount", hs6Var2.currentAccount);
                            intent3.setAction("com.tmessages.openchat" + B1);
                            intent3.putExtra("dialogId", B1);
                            intent3.putExtra("hash", gda.p);
                            intent3.addFlags(67108864);
                            if (fileLocation == null) {
                            }
                            String str4222222 = "did3_" + B1;
                            if (TextUtils.isEmpty(str2)) {
                            }
                            Context context2222222 = a.b;
                            qia qiaVar2222222 = new qia();
                            qiaVar2222222.a = context2222222;
                            qiaVar2222222.b = str4222222;
                            qiaVar2222222.e = str5;
                            qiaVar2222222.f = str5;
                            qiaVar2222222.m = i + 1;
                            qiaVar2222222.c = new Intent[]{intent};
                            if (gda.u0) {
                            }
                            if (bitmap3 != null) {
                            }
                            if (z) {
                            }
                        } else {
                            String str6 = chat.title;
                            TLRPC.ChatPhoto chatPhoto = chat.photo;
                            if (chatPhoto != null) {
                                TLRPC.FileLocation fileLocation2 = chatPhoto.photo_small;
                                str = str6;
                                fileLocation = fileLocation2;
                                intent3.putExtra("currentAccount", hs6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", gda.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                }
                                String str42222222 = "did3_" + B1;
                                if (TextUtils.isEmpty(str2)) {
                                }
                                Context context22222222 = a.b;
                                qia qiaVar22222222 = new qia();
                                qiaVar22222222.a = context22222222;
                                qiaVar22222222.b = str42222222;
                                qiaVar22222222.e = str5;
                                qiaVar22222222.f = str5;
                                qiaVar22222222.m = i + 1;
                                qiaVar22222222.c = new Intent[]{intent};
                                if (gda.u0) {
                                }
                                if (bitmap3 != null) {
                                }
                                if (z) {
                                }
                            } else {
                                str = str6;
                                fileLocation = null;
                                intent3.putExtra("currentAccount", hs6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", gda.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                }
                                String str422222222 = "did3_" + B1;
                                if (TextUtils.isEmpty(str2)) {
                                }
                                Context context222222222 = a.b;
                                qia qiaVar222222222 = new qia();
                                qiaVar222222222.a = context222222222;
                                qiaVar222222222.b = str422222222;
                                qiaVar222222222.e = str5;
                                qiaVar222222222.f = str5;
                                qiaVar222222222.m = i + 1;
                                qiaVar222222222.c = new Intent[]{intent};
                                if (gda.u0) {
                                }
                                if (bitmap3 != null) {
                                }
                                if (z) {
                                }
                            }
                        }
                        i10 = i + 1;
                        z4 = z;
                        hs6Var2 = hs6Var;
                        arrayList6 = arrayList;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 1:
                oc7 oc7Var = (oc7) this.c;
                TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) this.d;
                boolean z5 = this.b;
                ConcurrentHashMap concurrentHashMap = oc7Var.Q;
                ConcurrentHashMap concurrentHashMap2 = oc7Var.P;
                vh6 vh6Var = new vh6();
                vh6 vh6Var2 = new vh6();
                vh6 vh6Var3 = new vh6(tL_messages_dialogs.users.size());
                vh6 vh6Var4 = new vh6(tL_messages_dialogs.chats.size());
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                for (int i11 = 0; i11 < tL_messages_dialogs.users.size(); i11++) {
                    TLRPC.User user2 = tL_messages_dialogs.users.get(i11);
                    vh6Var3.k(user2, user2.id);
                }
                for (int i12 = 0; i12 < tL_messages_dialogs.chats.size(); i12++) {
                    TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i12);
                    vh6Var4.k(chat2, chat2.id);
                }
                ArrayList arrayList11 = new ArrayList();
                int i13 = 0;
                while (i13 < tL_messages_dialogs.messages.size()) {
                    TLRPC.Message message2 = tL_messages_dialogs.messages.get(i13);
                    long j3 = oc7Var.s2;
                    if (j3 != 0) {
                        z2 = z5;
                        arrayList3 = arrayList11;
                        break;
                    } else {
                        z2 = z5;
                        arrayList3 = arrayList11;
                    }
                    TLRPC.Peer peer = message2.peer_id;
                    if (peer != null) {
                        long j4 = peer.channel_id;
                        if (j4 != 0) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) vh6Var4.f(j4);
                            if (chat3 != null) {
                                break;
                            }
                        } else {
                            long j5 = peer.chat_id;
                            if (j5 != 0) {
                                TLRPC.Chat chat4 = (TLRPC.Chat) vh6Var4.f(j5);
                                if (chat4 != null) {
                                    if (chat4.migrated_to == null) {
                                        break;
                                    }
                                    arrayList4 = arrayList3;
                                    i4 = i13;
                                }
                            }
                        }
                        i13 = i4 + 1;
                        arrayList11 = arrayList4;
                        z5 = z2;
                    }
                    i4 = i13;
                    arrayList4 = arrayList3;
                    k47 k47Var = new k47(oc7Var.currentAccount, message2, vh6Var3, vh6Var4, false, false);
                    arrayList4.add(k47Var);
                    long B0 = k47.B0(k47Var.k);
                    ArrayList arrayList12 = (ArrayList) vh6Var2.f(B0);
                    if (arrayList12 == null) {
                        arrayList12 = new ArrayList(1);
                    }
                    arrayList12.add(k47Var);
                    vh6Var2.k(arrayList12, B0);
                    i13 = i4 + 1;
                    arrayList11 = arrayList4;
                    z5 = z2;
                }
                boolean z6 = z5;
                oc7Var.getFileLoader().l(arrayList11);
                for (0; i2 < tL_messages_dialogs.dialogs.size(); i2 + 1) {
                    TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i2);
                    pg3.w(dialog);
                    long j6 = oc7Var.s2;
                    if (j6 == 0 || j6 != dialog.id) {
                        if (pg3.x(dialog)) {
                            TLRPC.Chat chat5 = (TLRPC.Chat) vh6Var4.f(-dialog.id);
                            i2 = (chat5 != null && sd2.r0(chat5)) ? i2 + 1 : 0;
                        } else if (pg3.y(dialog.id)) {
                            TLRPC.Chat chat6 = (TLRPC.Chat) vh6Var4.f(-dialog.id);
                            if (chat6 != null) {
                                if (chat6.migrated_to == null) {
                                    if (sd2.r0(chat6)) {
                                    }
                                }
                            }
                        }
                    }
                    if (dialog.last_message_date == 0 && (arrayList2 = (ArrayList) vh6Var2.f(dialog.id)) != null) {
                        int i14 = Integer.MIN_VALUE;
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            k47 k47Var2 = (k47) arrayList2.get(i15);
                            if (k47Var2 != null && (message = k47Var2.k) != null && (i3 = message.date) > i14) {
                                i14 = i3;
                            }
                        }
                        if (i14 > Integer.MIN_VALUE) {
                            dialog.last_message_date = i14;
                        }
                    }
                    vh6Var.k(dialog, dialog.id);
                    longSparseIntArray.put(dialog.id, dialog.unread_count);
                    Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                    if (num == null) {
                        num = 0;
                    }
                    int i16 = dialog.read_inbox_max_id;
                    int i17 = dialog.top_message;
                    if (i16 > i17) {
                        dialog.read_inbox_max_id = i17;
                    }
                    int intValue = num.intValue();
                    int i18 = dialog.top_message;
                    if (intValue > i18) {
                        num = Integer.valueOf(i18);
                    }
                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                    Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                    if (num2 == null) {
                        num2 = 0;
                    }
                    concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                }
                gm.c3(new b5a((Object) oc7Var, (Object) tL_messages_dialogs, (Object) vh6Var, (Object) vh6Var2, z6, (Object) longSparseIntArray, (byte) 11));
                return;
            case 2:
                x();
                return;
            case 3:
                cf7 cf7Var = (cf7) this.c;
                vh6 vh6Var5 = (vh6) this.d;
                boolean z7 = this.b;
                vh6 vh6Var6 = new vh6();
                if (z7) {
                    try {
                        try {
                            cf7Var.b.beginTransaction();
                        } catch (Throwable th9) {
                            th = th9;
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        sQLitePreparedStatement = null;
                        z3 = true;
                        i5 = 0;
                        cf7Var.n(e, z3);
                        break;
                    }
                }
                try {
                    sQLitePreparedStatement = cf7Var.b.executeFast("DELETE FROM ephemeral_messages WHERE dialog_id = ? AND id = ?;");
                    int i19 = 0;
                    while (i19 < vh6Var5.m()) {
                        try {
                            try {
                                long j7 = vh6Var5.j(i19);
                                ArrayList arrayList13 = (ArrayList) vh6Var5.n(i19);
                                if (arrayList13 != null) {
                                    i5 = 0;
                                    try {
                                        vh6Var6.k(cf7Var.W(arrayList13, j7), j7);
                                        int i20 = 0;
                                        while (i20 < arrayList13.size()) {
                                            sQLitePreparedStatement.requery();
                                            sQLitePreparedStatement.bindLong(i7, j7);
                                            sQLitePreparedStatement.bindInteger(2, ((Integer) arrayList13.get(i20)).intValue());
                                            sQLitePreparedStatement.step();
                                            i20++;
                                            i7 = 1;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        z3 = true;
                                        cf7Var.n(e, z3);
                                    }
                                }
                                i19++;
                                i7 = 1;
                            } catch (Exception e4) {
                                e = e4;
                                i5 = 0;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            sQLitePreparedStatement2 = sQLitePreparedStatement;
                            if (sQLitePreparedStatement2 != null) {
                            }
                            throw th;
                        }
                    }
                    i5 = 0;
                    int i21 = 0;
                    while (i21 < vh6Var5.m()) {
                        long j8 = vh6Var5.j(i21);
                        ArrayList arrayList14 = (ArrayList) vh6Var5.n(i21);
                        hs6 mediaDataController = cf7Var.getMediaDataController();
                        bf7 a = bf7.a(j8, j);
                        mediaDataController.getClass();
                        long j9 = j;
                        gm.c3(new fp6((Object) mediaDataController, (Object) arrayList5, (Object) a, (byte) 3));
                        String join = TextUtils.join(",", arrayList14);
                        SQLiteDatabase sQLiteDatabase = cf7Var.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM bot_keyboard WHERE mid IN(" + join + ") AND uid = " + j8).stepThis().dispose();
                        cf7Var.b.executeFast("DELETE FROM bot_keyboard_topics WHERE mid IN(" + join + ") AND uid = " + j8).stepThis().dispose();
                        i21++;
                        j = j9;
                    }
                    if (z7) {
                        cf7Var.b.commitTransaction();
                        break;
                    }
                } catch (Exception e5) {
                    e = e5;
                    i5 = 0;
                    sQLitePreparedStatement = null;
                }
                break;
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.c;
                boolean z8 = this.b;
                String str7 = (String) this.d;
                int i22 = AnimatedPhoneNumberEditText.b2;
                animatedPhoneNumberEditText.B(str7, z8);
                return;
            case 7:
                c();
                return;
            case 8:
                ((CameraController) this.c).lambda$initCamera$4(this.b, (Runnable) this.d);
                return;
            case 9:
                d();
                return;
            case 10:
                e();
                return;
            case 11:
                f();
                return;
            case 12:
                g();
                return;
            case 13:
                h();
                return;
            case 14:
                i();
                return;
            case 15:
                j();
                return;
            case 16:
                k();
                return;
            case 17:
                l();
                return;
            case 18:
                m();
                return;
            case 19:
                n();
                return;
            case 20:
                o();
                return;
            case 21:
                p();
                return;
            case 22:
                q();
                return;
            case 23:
                r();
                return;
            case 24:
                s();
                return;
            case 25:
                t();
                return;
            case 26:
                u();
                return;
            case 27:
                v();
                return;
            case 28:
                w();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                boolean z9 = this.b;
                li0 li0Var2 = (li0) this.d;
                String str8 = LaunchActivity.C1;
                ((ApplicationLoaderImpl) a.a).getClass();
                oi0 e6 = oi0.e();
                String str9 = e6.a;
                if (str9 != null && (i6 = e6.b) != 0) {
                    li0Var = new li0(str9, i6, e6.c);
                }
                if (li0Var != null) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    if (oi0.e().j) {
                        return;
                    }
                    if (z9 || li0Var2 == null || (gda.R(li0Var.b, li0Var2.b) && li0Var.a > li0Var2.a)) {
                        ((ApplicationLoaderImpl) a.a).getClass();
                        try {
                            new k8c(launchActivity, li0Var).show();
                            return;
                        } catch (Exception e7) {
                            fc4.g(e7, true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ np6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ np6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}

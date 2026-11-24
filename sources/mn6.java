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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mn6(mu1 mu1Var, ArrayList arrayList, int i) {
        this.a = (byte) 10;
        this.c = mu1Var;
        this.d = arrayList;
        this.b = i;
    }

    private final void a() {
        eb ebVar = (eb) this.c;
        String str = (String) this.d;
        va vaVar = ebVar.x;
        ArrayList arrayList = ebVar.y;
        arrayList.clear();
        is9.a().getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList2.add(jSONArray.getString(i));
            }
        } catch (Exception e) {
            fa4.g(e, false);
            try {
                JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getJSONObject(i2).getString("key"));
                }
            } catch (Exception e2) {
                fa4.g(e2, false);
                try {
                    JSONArray jSONArray3 = new JSONArray(str);
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        String string = jSONArray3.getJSONObject(i3).getString("phrase");
                        if (!TextUtils.isEmpty(string)) {
                            arrayList2.add(string);
                        }
                    }
                } catch (Exception e3) {
                    fa4.g(e3, false);
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
        hd hdVar = (hd) this.c;
        View view = (View) this.d;
        if (view instanceof bjb) {
            bjb bjbVar = (bjb) view;
            if (bjbVar.a) {
                bjbVar.a = false;
                bjbVar.invalidate();
            }
        }
        if (this.b) {
            hdVar.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        if (r1 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        j41 j41Var = (j41) this.c;
        ad7 ad7Var = (ad7) this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = ad7Var.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
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
                    ad7Var.k0(arrayList4, arrayList2, false);
                }
                if (!arrayList5.isEmpty()) {
                    ad7Var.P(TextUtils.join(",", arrayList5), arrayList3);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            sQLiteCursor.dispose();
            gl.c3(new z77((Object) j41Var, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, this.b, (byte) 4));
        } finally {
        }
    }

    private final void d() {
        ((mu1) this.c).Nc((k27) this.d, this.b);
    }

    private final void e() {
        ((mu1) this.c).Ua(this.b ? 1 : 0, (ArrayList) this.d, false, false);
    }

    private final void f() {
        int i;
        wt1 wt1Var = (wt1) this.c;
        TLObject tLObject = (TLObject) this.d;
        mu1 mu1Var = wt1Var.a;
        mu1Var.ec.b();
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        boolean z2 = this.b;
        if (!z) {
            u21.b0(mu1Var).Q(R.raw.error, 36, k96.M0(z2 ? 2131754432 : 2131754382, null)).k(true);
            return;
        }
        i = ((d) mu1Var).currentAccount;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        hq6.d0(i).L1(tL_messages_stickerSet, false);
        if (mu1Var.getParentActivity() == null || mu1Var.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        tL_inputStickerSetID.id = stickerSet.id;
        if (!z2) {
            u0b u0bVar = new u0b(mu1Var.getParentActivity(), mu1Var, tL_inputStickerSetID, null, mu1Var.a0, mu1Var.Ba);
            boolean Q7 = mu1Var.Q7();
            u0bVar.i0 = Q7;
            u0bVar.n = Q7;
            mu1Var.showDialog(u0bVar);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(tL_inputStickerSetID);
        qx3 qx3Var = new qx3(mu1Var, mu1Var.getParentActivity(), mu1Var.Ba, arrayList);
        boolean Q72 = mu1Var.Q7();
        qx3Var.i0 = Q72;
        qx3Var.n = Q72;
        mu1Var.showDialog(qx3Var);
    }

    private final void g() {
        x02 x02Var = (x02) this.c;
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
        if (!x02Var.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
            x02Var.v0(true);
            editTextBoldCursor.requestFocus();
            if (this.b) {
                gl.c3(new kx1(x02Var, editTextBoldCursor, (byte) 6));
            }
        }
    }

    private final void h() {
        ((i8c) this.c).a((Bitmap) this.d, Boolean.valueOf(this.b));
    }

    private final void i() {
        c92 c92Var = (c92) this.c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        e92 e92Var = c92Var.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e92Var.o2, e92Var.getContext());
        String M0 = k96.M0(2131743433, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131743434, null);
        alertDialog$Builder.j(k96.M0(2131747638, null), new ch((Object) c92Var, (Object) tL_username, this.b, (byte) 6));
        alertDialog$Builder.o();
    }

    private final void j() {
        t92 t92Var = (t92) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        x92 x92Var = t92Var.y.d;
        x92Var.P = false;
        if (this.b || !chat.join_request) {
            return;
        }
        chat.join_request = false;
        x92Var.Q = true;
        x92Var.getMessagesController().i5(chat.id, 0L, false, false, false, new s92(t92Var, (byte) 1), new n92(t92Var, chat, (byte) 5));
    }

    private final void k() {
        ((qm2) this.c).Y0((p8c) this.d, this.b, false);
    }

    private final void l() {
        boolean z;
        ti3 ti3Var = (ti3) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        cj3 cj3Var = ti3Var.b;
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
                cj3Var.getNotificationsController().T(dialog.id, z ? 3 : 4, 0L);
                i2++;
            }
            i++;
        }
        t11 t11Var = new t11(cj3Var.getParentActivity(), null);
        t11Var.b.setText(z ? k96.G(i2, "NotificationsMutedHintChats", new Object[0]) : k96.G(i2, "NotificationsUnmutedHintChats", new Object[0]));
        if (z) {
            t11Var.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            t11Var.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        m21.g(cj3Var, t11Var, 1500).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r6 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m() {
        SQLiteDatabase sQLiteDatabase;
        ad7 ad7Var = (ad7) this.c;
        p8c p8cVar = (p8c) this.d;
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteDatabase = ad7Var.b;
            } catch (Exception e) {
                fa4.g(e, true);
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
                        iq3 iq3Var = new iq3(byteBufferValue);
                        iq3Var.a = longValue;
                        arrayList.add(iq3Var);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
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
            gl.c3(new hq3(p8cVar, arrayList, (byte) 0));
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
        ba4 ba4Var = (ba4) this.c;
        boolean z = this.b;
        String str = (String) this.d;
        qb4 qb4Var = !z ? (qb4) ba4Var.h.get(str) : (qb4) ba4Var.n.get(str);
        ba4Var.y.remove(str);
        if (qb4Var != null) {
            ba4Var.n.remove(str);
            ba4Var.e.remove(qb4Var);
            ba4Var.f.remove(qb4Var);
            if (qb4Var.m != 3) {
                qb4Var.m = (byte) 2;
                Utilities.d.c(new mb4(qb4Var, (byte) 1));
                String str2 = qb4Var.l;
                if (str2 == null) {
                    Set set = s60.a;
                } else {
                    s60.a.remove(str2);
                }
                qb4Var.o.a();
                qb4Var.b();
            }
        }
    }

    private final void p() {
        ((mc4) this.c).b0((il4) this.d, !this.b);
    }

    private final void q() {
        ((ll4) this.c).Z0((il4) this.d, !this.b);
    }

    private final void r() {
        rr4 rr4Var = (rr4) this.c;
        TLObject tLObject = (TLObject) this.d;
        ArrayList arrayList = rr4Var.c;
        if (tLObject instanceof TLRPC.messages_BotResults) {
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            rr4Var.h = messages_botresults.next_offset;
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
            rr4Var.d = false;
            rr4Var.F(false);
            rr4Var.f();
        }
    }

    private final void s() {
        l15 l15Var = (l15) this.c;
        rz1 rz1Var = (rz1) this.d;
        boolean z = this.b;
        if (l15Var.b) {
            return;
        }
        try {
            if (rz1Var.b != ((g15) rz1Var.c).l()) {
                l15Var.c("STORAGE_CANCELED");
                return;
            }
            bje.b = l15Var;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.isFinishing() || launchActivity.isDestroyed() || launchActivity.u().P()) {
                l15Var.c("AUTH_UNAVAILABLE");
                return;
            }
            l15Var.e = launchActivity;
            try {
                if (z) {
                    l15Var.a();
                } else if (Build.VERSION.SDK_INT >= 30) {
                    l15Var.d();
                } else {
                    l15Var.b();
                }
            } catch (Exception e) {
                fa4.g(e, true);
                l15Var.a();
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
            l15Var.c("AUTH_UNAVAILABLE");
        }
    }

    private final void t() {
        h85 h85Var = (h85) this.c;
        h85 h85Var2 = (h85) this.d;
        if (this.b) {
            h85Var.y.removeView(h85Var2);
        }
        h85Var2.setVisibility(8);
        h85Var.A0 = null;
    }

    private final void u() {
        fl5 fl5Var = (fl5) this.c;
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
                    HashMap hashMap = fl5Var.l;
                    SparseArray sparseArray = fl5Var.m;
                    String str = (String) sparseArray.get(A);
                    if (str != null) {
                        dl5 dl5Var = (dl5) hashMap.get(str);
                        if (dl5Var != null) {
                            ArrayList arrayList = dl5Var.c;
                            int indexOf = arrayList.indexOf(imageReceiver);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                                dl5Var.d.remove(indexOf);
                            }
                            if (arrayList.isEmpty()) {
                                hashMap.remove(str);
                            }
                        }
                        sparseArray.remove(A);
                    }
                }
                tk5 tk5Var = (tk5) fl5Var.k.get(A);
                if (tk5Var != null) {
                    tk5Var.b(imageReceiver);
                }
            }
            i++;
        }
    }

    private final void v() {
        LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
        hd hdVar = (hd) this.d;
        languageSelectActivity.getClass();
        hdVar.dismiss();
        if (this.b) {
            return;
        }
        gl.d3(new ex5(languageSelectActivity, (byte) 1), 10L);
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
        ad7 ad7Var = (ad7) this.c;
        HashMap hashMap = (HashMap) this.d;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        try {
            if (w01.a) {
                fa4.b(ad7Var.currentAccount + " save contacts to db " + hashMap.size());
            }
            ad7Var.b.executeFast("DELETE FROM user_contacts_v7 WHERE 1").stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM user_phones_v7 WHERE 1").stepThis().dispose();
            ad7Var.b.beginTransaction();
            SQLitePreparedStatement executeFast = ad7Var.b.executeFast("REPLACE INTO user_contacts_v7 VALUES(?, ?, ?, ?, ?)");
            try {
                sQLitePreparedStatement = ad7Var.b.executeFast("REPLACE INTO user_phones_v7 VALUES(?, ?, ?, ?)");
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
                    nu2 nu2Var = (nu2) ((Map.Entry) it.next()).getValue();
                    ArrayList arrayList = nu2Var.e;
                    ArrayList arrayList2 = nu2Var.g;
                    if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                        executeFast.requery();
                        executeFast.bindString(1, nu2Var.b);
                        executeFast.bindInteger(2, nu2Var.a);
                        executeFast.bindString(3, nu2Var.i);
                        executeFast.bindString(4, nu2Var.j);
                        executeFast.bindInteger(5, nu2Var.l);
                        executeFast.step();
                        for (int i = 0; i < arrayList.size(); i++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindString(1, nu2Var.b);
                            sQLitePreparedStatement.bindString(2, (String) arrayList.get(i));
                            sQLitePreparedStatement.bindString(3, (String) arrayList2.get(i));
                            sQLitePreparedStatement.bindInteger(4, ((Integer) nu2Var.h.get(i)).intValue());
                            sQLitePreparedStatement.step();
                        }
                    }
                }
                executeFast.dispose();
                try {
                    try {
                        sQLitePreparedStatement.dispose();
                        ad7Var.b.commitTransaction();
                        if (this.b) {
                            ad7Var.b.executeFast("DROP TABLE IF EXISTS user_contacts_v6;").stepThis().dispose();
                            ad7Var.b.executeFast("DROP TABLE IF EXISTS user_phones_v6;").stepThis().dispose();
                            ad7Var.a.c(new cc7(ad7Var, objArr == true ? 1 : 0, objArr2 == true ? 1 : 0));
                        }
                        SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ad7Var.n(e, true);
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        sQLiteDatabase2 = ad7Var.b;
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
                    sQLiteDatabase = ad7Var.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                sQLitePreparedStatement2 = executeFast;
                ad7Var.n(e, true);
                if (sQLitePreparedStatement2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                sQLiteDatabase2 = ad7Var.b;
                if (sQLiteDatabase2 == null) {
                }
            } catch (Throwable th3) {
                th = th3;
                sQLitePreparedStatement2 = executeFast;
                if (sQLitePreparedStatement2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                sQLiteDatabase = ad7Var.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021a, code lost:
    
        r13 = r1.e0;
        r14 = r11.id;
        r13 = (vf6) r13.b;
        r15 = (android.util.SparseIntArray) r13.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0228, code lost:
    
        if (r15 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022f, code lost:
    
        if (r15.get(r12, -1) != r14) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0231, code lost:
    
        r15.delete(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0238, code lost:
    
        if (r15.size() != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023a, code lost:
    
        r13.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023d, code lost:
    
        r6 = r11.anchor_msg_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023f, code lost:
    
        if (r6 == 0) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0241, code lost:
    
        r6 = r1.a0(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0246, code lost:
    
        if (r6 == null) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0248, code lost:
    
        if (r10 != null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024a, code lost:
    
        r10 = tb4.s(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024e, code lost:
    
        r10.add(new k27(r1.currentAccount, r6, true, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0261, code lost:
    
        if (r0.i() != false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0263, code lost:
    
        gl.c3(new cb7(r1, r0, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01d6, code lost:
    
        if (r10 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0310, code lost:
    
        if (r13 != r10.dialog_id) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x032d, code lost:
    
        if (hc2.r0(r7) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0346, code lost:
    
        if (hc2.r0(r7) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e9, code lost:
    
        if (r10 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01eb, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
    
        r0 = new vf6();
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f9, code lost:
    
        if (r2 >= r9.m()) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01fb, code lost:
    
        r3 = r9.j(r2);
        r5 = (java.util.ArrayList) r9.n(r2);
        r7 = r5.size();
        r8 = r16;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020c, code lost:
    
        if (r8 >= r7) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020e, code lost:
    
        r11 = r5.get(r8);
        r8 = r8 + 1;
        r11 = (org.telegram.tgnet.tl.TL_ephemeral.EphemeralMessage) r11;
        r12 = r11.anchor_msg_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0218, code lost:
    
        if (r12 == 0) goto L128;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01cc: MOVE (r4 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:461), block:B:167:0x01cc */
    /* JADX WARN: Removed duplicated region for block: B:311:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07c0 A[Catch: all -> 0x0849, TryCatch #5 {all -> 0x0849, blocks: (B:279:0x049d, B:281:0x04a1, B:282:0x04c4, B:285:0x04d9, B:286:0x054d, B:289:0x059a, B:292:0x05a0, B:295:0x05a5, B:296:0x05c2, B:297:0x05ce, B:299:0x05d4, B:301:0x05ef, B:303:0x061c, B:306:0x062e, B:308:0x063b, B:309:0x0650, B:312:0x0787, B:315:0x07a1, B:317:0x07c0, B:319:0x07cc, B:321:0x07e0, B:323:0x07ea, B:325:0x07ee, B:327:0x07f1, B:329:0x0827, B:331:0x07f5, B:332:0x07fa, B:335:0x07fb, B:336:0x0800, B:337:0x0801, B:339:0x0809, B:341:0x080d, B:343:0x0810, B:345:0x0819, B:346:0x0824, B:348:0x081f, B:350:0x0831, B:351:0x0836, B:354:0x0837, B:355:0x083c, B:356:0x07d3, B:393:0x0777, B:420:0x0640, B:422:0x0646, B:427:0x0604, B:430:0x05ab, B:432:0x05b4, B:433:0x05bf, B:434:0x05ba, B:435:0x083d, B:436:0x0842, B:437:0x0843, B:438:0x0848, B:439:0x04df, B:441:0x04e7, B:443:0x04ed, B:444:0x04f1, B:446:0x04f7, B:449:0x0519, B:451:0x051f, B:453:0x052d, B:455:0x0530, B:458:0x0536, B:460:0x053c, B:463:0x0542, B:465:0x0548), top: B:278:0x049d }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07cc A[Catch: all -> 0x0849, TryCatch #5 {all -> 0x0849, blocks: (B:279:0x049d, B:281:0x04a1, B:282:0x04c4, B:285:0x04d9, B:286:0x054d, B:289:0x059a, B:292:0x05a0, B:295:0x05a5, B:296:0x05c2, B:297:0x05ce, B:299:0x05d4, B:301:0x05ef, B:303:0x061c, B:306:0x062e, B:308:0x063b, B:309:0x0650, B:312:0x0787, B:315:0x07a1, B:317:0x07c0, B:319:0x07cc, B:321:0x07e0, B:323:0x07ea, B:325:0x07ee, B:327:0x07f1, B:329:0x0827, B:331:0x07f5, B:332:0x07fa, B:335:0x07fb, B:336:0x0800, B:337:0x0801, B:339:0x0809, B:341:0x080d, B:343:0x0810, B:345:0x0819, B:346:0x0824, B:348:0x081f, B:350:0x0831, B:351:0x0836, B:354:0x0837, B:355:0x083c, B:356:0x07d3, B:393:0x0777, B:420:0x0640, B:422:0x0646, B:427:0x0604, B:430:0x05ab, B:432:0x05b4, B:433:0x05bf, B:434:0x05ba, B:435:0x083d, B:436:0x0842, B:437:0x0843, B:438:0x0848, B:439:0x04df, B:441:0x04e7, B:443:0x04ed, B:444:0x04f1, B:446:0x04f7, B:449:0x0519, B:451:0x051f, B:453:0x052d, B:455:0x0530, B:458:0x0536, B:460:0x053c, B:463:0x0542, B:465:0x0548), top: B:278:0x049d }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07e0 A[Catch: all -> 0x0849, TryCatch #5 {all -> 0x0849, blocks: (B:279:0x049d, B:281:0x04a1, B:282:0x04c4, B:285:0x04d9, B:286:0x054d, B:289:0x059a, B:292:0x05a0, B:295:0x05a5, B:296:0x05c2, B:297:0x05ce, B:299:0x05d4, B:301:0x05ef, B:303:0x061c, B:306:0x062e, B:308:0x063b, B:309:0x0650, B:312:0x0787, B:315:0x07a1, B:317:0x07c0, B:319:0x07cc, B:321:0x07e0, B:323:0x07ea, B:325:0x07ee, B:327:0x07f1, B:329:0x0827, B:331:0x07f5, B:332:0x07fa, B:335:0x07fb, B:336:0x0800, B:337:0x0801, B:339:0x0809, B:341:0x080d, B:343:0x0810, B:345:0x0819, B:346:0x0824, B:348:0x081f, B:350:0x0831, B:351:0x0836, B:354:0x0837, B:355:0x083c, B:356:0x07d3, B:393:0x0777, B:420:0x0640, B:422:0x0646, B:427:0x0604, B:430:0x05ab, B:432:0x05b4, B:433:0x05bf, B:434:0x05ba, B:435:0x083d, B:436:0x0842, B:437:0x0843, B:438:0x0848, B:439:0x04df, B:441:0x04e7, B:443:0x04ed, B:444:0x04f1, B:446:0x04f7, B:449:0x0519, B:451:0x051f, B:453:0x052d, B:455:0x0530, B:458:0x0536, B:460:0x053c, B:463:0x0542, B:465:0x0548), top: B:278:0x049d }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0801 A[Catch: all -> 0x0849, TryCatch #5 {all -> 0x0849, blocks: (B:279:0x049d, B:281:0x04a1, B:282:0x04c4, B:285:0x04d9, B:286:0x054d, B:289:0x059a, B:292:0x05a0, B:295:0x05a5, B:296:0x05c2, B:297:0x05ce, B:299:0x05d4, B:301:0x05ef, B:303:0x061c, B:306:0x062e, B:308:0x063b, B:309:0x0650, B:312:0x0787, B:315:0x07a1, B:317:0x07c0, B:319:0x07cc, B:321:0x07e0, B:323:0x07ea, B:325:0x07ee, B:327:0x07f1, B:329:0x0827, B:331:0x07f5, B:332:0x07fa, B:335:0x07fb, B:336:0x0800, B:337:0x0801, B:339:0x0809, B:341:0x080d, B:343:0x0810, B:345:0x0819, B:346:0x0824, B:348:0x081f, B:350:0x0831, B:351:0x0836, B:354:0x0837, B:355:0x083c, B:356:0x07d3, B:393:0x0777, B:420:0x0640, B:422:0x0646, B:427:0x0604, B:430:0x05ab, B:432:0x05b4, B:433:0x05bf, B:434:0x05ba, B:435:0x083d, B:436:0x0842, B:437:0x0843, B:438:0x0848, B:439:0x04df, B:441:0x04e7, B:443:0x04ed, B:444:0x04f1, B:446:0x04f7, B:449:0x0519, B:451:0x051f, B:453:0x052d, B:455:0x0530, B:458:0x0536, B:460:0x053c, B:463:0x0542, B:465:0x0548), top: B:278:0x049d }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07d3 A[Catch: all -> 0x0849, TryCatch #5 {all -> 0x0849, blocks: (B:279:0x049d, B:281:0x04a1, B:282:0x04c4, B:285:0x04d9, B:286:0x054d, B:289:0x059a, B:292:0x05a0, B:295:0x05a5, B:296:0x05c2, B:297:0x05ce, B:299:0x05d4, B:301:0x05ef, B:303:0x061c, B:306:0x062e, B:308:0x063b, B:309:0x0650, B:312:0x0787, B:315:0x07a1, B:317:0x07c0, B:319:0x07cc, B:321:0x07e0, B:323:0x07ea, B:325:0x07ee, B:327:0x07f1, B:329:0x0827, B:331:0x07f5, B:332:0x07fa, B:335:0x07fb, B:336:0x0800, B:337:0x0801, B:339:0x0809, B:341:0x080d, B:343:0x0810, B:345:0x0819, B:346:0x0824, B:348:0x081f, B:350:0x0831, B:351:0x0836, B:354:0x0837, B:355:0x083c, B:356:0x07d3, B:393:0x0777, B:420:0x0640, B:422:0x0646, B:427:0x0604, B:430:0x05ab, B:432:0x05b4, B:433:0x05bf, B:434:0x05ba, B:435:0x083d, B:436:0x0842, B:437:0x0843, B:438:0x0848, B:439:0x04df, B:441:0x04e7, B:443:0x04ed, B:444:0x04f1, B:446:0x04f7, B:449:0x0519, B:451:0x051f, B:453:0x052d, B:455:0x0530, B:458:0x0536, B:460:0x053c, B:463:0x0542, B:465:0x0548), top: B:278:0x049d }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x067e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        TLRPC.Chat chat;
        TLRPC.User user;
        hq6 hq6Var;
        ArrayList arrayList;
        int i;
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        Intent intent;
        Bitmap bitmap;
        Bitmap bitmap2;
        Paint paint;
        int i2;
        ArrayList arrayList2;
        TLRPC.Message message;
        int i3;
        boolean z2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i4;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i5;
        SQLitePreparedStatement sQLitePreparedStatement3;
        int i6;
        long j = 0;
        byte b = 1;
        switch (this.a) {
            case 0:
                hq6 hq6Var2 = (hq6) this.c;
                boolean z3 = this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                try {
                    if (gba.p == null) {
                        gba.p = UUID.randomUUID().toString();
                        a.b.getSharedPreferences("mainconfig", 0).edit().putString("directShareHash2", gba.p).commit();
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    if (z3) {
                        tga.n(a.b);
                    } else {
                        List e = tga.e(a.b);
                        if (e != null && !e.isEmpty()) {
                            arrayList7.add("compose");
                            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                                arrayList7.add("did3_" + k27.B1(((TLRPC.TL_topPeer) arrayList5.get(i7)).peer));
                            }
                            for (int i8 = 0; i8 < e.size(); i8++) {
                                String str3 = ((oga) e.get(i8)).b;
                                if (!arrayList7.remove(str3)) {
                                    arrayList8.add(str3);
                                }
                                arrayList6.add(str3);
                            }
                            if (arrayList7.isEmpty() && arrayList8.isEmpty()) {
                                return;
                            }
                        }
                        if (!arrayList8.isEmpty()) {
                            tga.o(a.b, arrayList8);
                        }
                    }
                    Intent intent2 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                    intent2.setAction("new_dialog");
                    ArrayList arrayList9 = new ArrayList();
                    Context context = a.b;
                    oga ogaVar = new oga();
                    ogaVar.a = context;
                    ogaVar.b = "compose";
                    ogaVar.e = k96.M0(2131748083, null);
                    ogaVar.f = k96.M0(2131748083, null);
                    ogaVar.h = IconCompat.d(a.b, R.drawable.shortcut_compose);
                    ogaVar.m = 0;
                    ogaVar.c = new Intent[]{intent2};
                    if (TextUtils.isEmpty(ogaVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = ogaVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    if (z3) {
                        tga.m(a.b, ogaVar);
                    } else {
                        arrayList9.add(ogaVar);
                        if (arrayList6.contains("compose")) {
                            tga.y(a.b, arrayList9);
                        } else {
                            tga.a(a.b, arrayList9);
                        }
                        arrayList9.clear();
                    }
                    HashSet hashSet = new HashSet(1);
                    hashSet.add(hq6.Y1);
                    int i9 = 0;
                    while (i9 < arrayList5.size()) {
                        Intent intent3 = new Intent(a.b, (Class<?>) OpenChatReceiver.class);
                        long B1 = k27.B1(((TLRPC.TL_topPeer) arrayList5.get(i9)).peer);
                        if (cf3.D(B1)) {
                            intent3.putExtra("userId", B1);
                            user = hq6Var2.getMessagesController().V1(Long.valueOf(B1));
                            z = z3;
                            chat = null;
                        } else {
                            long j2 = -B1;
                            z = z3;
                            TLRPC.Chat K0 = hq6Var2.getMessagesController().K0(Long.valueOf(j2));
                            intent3.putExtra("chatId", j2);
                            chat = K0;
                            user = null;
                        }
                        if ((user == null || l7c.z(user)) && chat == null) {
                            hq6Var = hq6Var2;
                            arrayList = arrayList5;
                            i = i9;
                        } else if (user != null) {
                            str = qu2.m(0, user.first_name, user.last_name);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                                intent3.putExtra("currentAccount", hq6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", gba.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                    try {
                                        try {
                                            hq6Var2.getFileLoader().getClass();
                                        } catch (Throwable th) {
                                            th = th;
                                            arrayList = arrayList5;
                                            bitmap = null;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hq6Var = hq6Var2;
                                        str2 = str;
                                        arrayList = arrayList5;
                                        i = i9;
                                        intent = intent3;
                                        bitmap = null;
                                    }
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(ba4.J(fileLocation, null, true, true).toString());
                                        if (decodeFile != null) {
                                            try {
                                                int L = gl.L(48.0f);
                                                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(createBitmap);
                                                if (hq6.b2 == null) {
                                                    hq6Var = hq6Var2;
                                                    try {
                                                        str2 = str;
                                                        try {
                                                            hq6.b2 = new Paint(3);
                                                            hq6.d2 = new RectF();
                                                            paint = new Paint(1);
                                                            hq6.c2 = paint;
                                                            arrayList = arrayList5;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            arrayList = arrayList5;
                                                            i = i9;
                                                            intent = intent3;
                                                            bitmap2 = decodeFile;
                                                            fa4.g(th, true);
                                                            String str4 = "did3_" + B1;
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            Context context2 = a.b;
                                                            oga ogaVar2 = new oga();
                                                            ogaVar2.a = context2;
                                                            ogaVar2.b = str4;
                                                            ogaVar2.e = r1;
                                                            ogaVar2.f = r1;
                                                            ogaVar2.m = i + 1;
                                                            ogaVar2.c = new Intent[]{intent};
                                                            if (gba.u0) {
                                                            }
                                                            if (bitmap2 != null) {
                                                            }
                                                            if (z) {
                                                            }
                                                            i9 = i + 1;
                                                            z3 = z;
                                                            hq6Var2 = hq6Var;
                                                            arrayList5 = arrayList;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        str2 = str;
                                                        arrayList = arrayList5;
                                                        i = i9;
                                                        intent = intent3;
                                                        bitmap2 = decodeFile;
                                                        fa4.g(th, true);
                                                        String str42 = "did3_" + B1;
                                                        if (TextUtils.isEmpty(str2)) {
                                                        }
                                                        Context context22 = a.b;
                                                        oga ogaVar22 = new oga();
                                                        ogaVar22.a = context22;
                                                        ogaVar22.b = str42;
                                                        ogaVar22.e = r1;
                                                        ogaVar22.f = r1;
                                                        ogaVar22.m = i + 1;
                                                        ogaVar22.c = new Intent[]{intent};
                                                        if (gba.u0) {
                                                        }
                                                        if (bitmap2 != null) {
                                                        }
                                                        if (z) {
                                                        }
                                                        i9 = i + 1;
                                                        z3 = z;
                                                        hq6Var2 = hq6Var;
                                                        arrayList5 = arrayList;
                                                    }
                                                    try {
                                                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                                        Path path = new Path();
                                                        hq6.e2 = path;
                                                        i = i9;
                                                        intent = intent3;
                                                        try {
                                                            path.addCircle(L / 2, L / 2, (L / 2) - gl.L(2.0f), Path.Direction.CW);
                                                            hq6.e2.toggleInverseFillType();
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            bitmap2 = decodeFile;
                                                            fa4.g(th, true);
                                                            String str422 = "did3_" + B1;
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            Context context222 = a.b;
                                                            oga ogaVar222 = new oga();
                                                            ogaVar222.a = context222;
                                                            ogaVar222.b = str422;
                                                            ogaVar222.e = r1;
                                                            ogaVar222.f = r1;
                                                            ogaVar222.m = i + 1;
                                                            ogaVar222.c = new Intent[]{intent};
                                                            if (gba.u0) {
                                                            }
                                                            if (bitmap2 != null) {
                                                            }
                                                            if (z) {
                                                            }
                                                            i9 = i + 1;
                                                            z3 = z;
                                                            hq6Var2 = hq6Var;
                                                            arrayList5 = arrayList;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        i = i9;
                                                        intent = intent3;
                                                        bitmap2 = decodeFile;
                                                        fa4.g(th, true);
                                                        String str4222 = "did3_" + B1;
                                                        if (TextUtils.isEmpty(str2)) {
                                                        }
                                                        Context context2222 = a.b;
                                                        oga ogaVar2222 = new oga();
                                                        ogaVar2222.a = context2222;
                                                        ogaVar2222.b = str4222;
                                                        ogaVar2222.e = r1;
                                                        ogaVar2222.f = r1;
                                                        ogaVar2222.m = i + 1;
                                                        ogaVar2222.c = new Intent[]{intent};
                                                        if (gba.u0) {
                                                        }
                                                        if (bitmap2 != null) {
                                                        }
                                                        if (z) {
                                                        }
                                                        i9 = i + 1;
                                                        z3 = z;
                                                        hq6Var2 = hq6Var;
                                                        arrayList5 = arrayList;
                                                    }
                                                } else {
                                                    hq6Var = hq6Var2;
                                                    str2 = str;
                                                    arrayList = arrayList5;
                                                    i = i9;
                                                    intent = intent3;
                                                }
                                                hq6.d2.set(gl.L(2.0f), gl.L(2.0f), gl.L(46.0f), gl.L(46.0f));
                                                canvas.drawBitmap(decodeFile, (Rect) null, hq6.d2, hq6.b2);
                                                canvas.drawPath(hq6.e2, hq6.c2);
                                                try {
                                                    canvas.setBitmap(null);
                                                } catch (Exception unused) {
                                                }
                                                bitmap2 = createBitmap;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                hq6Var = hq6Var2;
                                            }
                                        } else {
                                            hq6Var = hq6Var2;
                                            str2 = str;
                                            arrayList = arrayList5;
                                            i = i9;
                                            intent = intent3;
                                            bitmap2 = decodeFile;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        arrayList = arrayList5;
                                        bitmap = null;
                                        hq6Var = hq6Var2;
                                        str2 = str;
                                        i = i9;
                                        intent = intent3;
                                        bitmap2 = bitmap;
                                        fa4.g(th, true);
                                        String str42222 = "did3_" + B1;
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        Context context22222 = a.b;
                                        oga ogaVar22222 = new oga();
                                        ogaVar22222.a = context22222;
                                        ogaVar22222.b = str42222;
                                        ogaVar22222.e = r1;
                                        ogaVar22222.f = r1;
                                        ogaVar22222.m = i + 1;
                                        ogaVar22222.c = new Intent[]{intent};
                                        if (gba.u0) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        if (z) {
                                        }
                                        i9 = i + 1;
                                        z3 = z;
                                        hq6Var2 = hq6Var;
                                        arrayList5 = arrayList;
                                    }
                                } else {
                                    hq6Var = hq6Var2;
                                    str2 = str;
                                    arrayList = arrayList5;
                                    i = i9;
                                    intent = intent3;
                                    bitmap2 = null;
                                }
                                String str422222 = "did3_" + B1;
                                String str5 = TextUtils.isEmpty(str2) ? " " : str2;
                                Context context222222 = a.b;
                                oga ogaVar222222 = new oga();
                                ogaVar222222.a = context222222;
                                ogaVar222222.b = str422222;
                                ogaVar222222.e = str5;
                                ogaVar222222.f = str5;
                                ogaVar222222.m = i + 1;
                                ogaVar222222.c = new Intent[]{intent};
                                if (gba.u0) {
                                    rs rsVar = new rs(0);
                                    rsVar.addAll(hashSet);
                                    ogaVar222222.j = rsVar;
                                }
                                if (bitmap2 != null) {
                                    ogaVar222222.h = IconCompat.c(bitmap2);
                                } else {
                                    ogaVar222222.h = IconCompat.d(a.b, R.drawable.shortcut_user);
                                }
                                if (z) {
                                    Context context3 = a.b;
                                    if (TextUtils.isEmpty(ogaVar222222.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr2 = ogaVar222222.c;
                                    if (intentArr2 == null || intentArr2.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    tga.m(context3, ogaVar222222);
                                } else {
                                    if (TextUtils.isEmpty(ogaVar222222.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr3 = ogaVar222222.c;
                                    if (intentArr3 == null || intentArr3.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    arrayList9.add(ogaVar222222);
                                    if (arrayList6.contains(str422222)) {
                                        tga.y(a.b, arrayList9);
                                    } else {
                                        tga.a(a.b, arrayList9);
                                    }
                                    arrayList9.clear();
                                }
                            }
                            fileLocation = null;
                            intent3.putExtra("currentAccount", hq6Var2.currentAccount);
                            intent3.setAction("com.tmessages.openchat" + B1);
                            intent3.putExtra("dialogId", B1);
                            intent3.putExtra("hash", gba.p);
                            intent3.addFlags(67108864);
                            if (fileLocation == null) {
                            }
                            String str4222222 = "did3_" + B1;
                            if (TextUtils.isEmpty(str2)) {
                            }
                            Context context2222222 = a.b;
                            oga ogaVar2222222 = new oga();
                            ogaVar2222222.a = context2222222;
                            ogaVar2222222.b = str4222222;
                            ogaVar2222222.e = str5;
                            ogaVar2222222.f = str5;
                            ogaVar2222222.m = i + 1;
                            ogaVar2222222.c = new Intent[]{intent};
                            if (gba.u0) {
                            }
                            if (bitmap2 != null) {
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
                                intent3.putExtra("currentAccount", hq6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", gba.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                }
                                String str42222222 = "did3_" + B1;
                                if (TextUtils.isEmpty(str2)) {
                                }
                                Context context22222222 = a.b;
                                oga ogaVar22222222 = new oga();
                                ogaVar22222222.a = context22222222;
                                ogaVar22222222.b = str42222222;
                                ogaVar22222222.e = str5;
                                ogaVar22222222.f = str5;
                                ogaVar22222222.m = i + 1;
                                ogaVar22222222.c = new Intent[]{intent};
                                if (gba.u0) {
                                }
                                if (bitmap2 != null) {
                                }
                                if (z) {
                                }
                            } else {
                                str = str6;
                                fileLocation = null;
                                intent3.putExtra("currentAccount", hq6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", gba.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                }
                                String str422222222 = "did3_" + B1;
                                if (TextUtils.isEmpty(str2)) {
                                }
                                Context context222222222 = a.b;
                                oga ogaVar222222222 = new oga();
                                ogaVar222222222.a = context222222222;
                                ogaVar222222222.b = str422222222;
                                ogaVar222222222.e = str5;
                                ogaVar222222222.f = str5;
                                ogaVar222222222.m = i + 1;
                                ogaVar222222222.c = new Intent[]{intent};
                                if (gba.u0) {
                                }
                                if (bitmap2 != null) {
                                }
                                if (z) {
                                }
                            }
                        }
                        i9 = i + 1;
                        z3 = z;
                        hq6Var2 = hq6Var;
                        arrayList5 = arrayList;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 1:
                na7 na7Var = (na7) this.c;
                TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) this.d;
                boolean z4 = this.b;
                ConcurrentHashMap concurrentHashMap = na7Var.Q;
                ConcurrentHashMap concurrentHashMap2 = na7Var.P;
                vf6 vf6Var = new vf6();
                vf6 vf6Var2 = new vf6();
                vf6 vf6Var3 = new vf6(tL_messages_dialogs.users.size());
                vf6 vf6Var4 = new vf6(tL_messages_dialogs.chats.size());
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                for (int i10 = 0; i10 < tL_messages_dialogs.users.size(); i10++) {
                    TLRPC.User user2 = tL_messages_dialogs.users.get(i10);
                    vf6Var3.k(user2, user2.id);
                }
                for (int i11 = 0; i11 < tL_messages_dialogs.chats.size(); i11++) {
                    TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i11);
                    vf6Var4.k(chat2, chat2.id);
                }
                ArrayList arrayList10 = new ArrayList();
                int i12 = 0;
                while (i12 < tL_messages_dialogs.messages.size()) {
                    TLRPC.Message message2 = tL_messages_dialogs.messages.get(i12);
                    long j3 = na7Var.s2;
                    if (j3 != 0) {
                        z2 = z4;
                        arrayList3 = arrayList10;
                        break;
                    } else {
                        z2 = z4;
                        arrayList3 = arrayList10;
                    }
                    TLRPC.Peer peer = message2.peer_id;
                    if (peer != null) {
                        long j4 = peer.channel_id;
                        if (j4 != 0) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) vf6Var4.f(j4);
                            if (chat3 != null) {
                                break;
                            }
                        } else {
                            long j5 = peer.chat_id;
                            if (j5 != 0) {
                                TLRPC.Chat chat4 = (TLRPC.Chat) vf6Var4.f(j5);
                                if (chat4 != null) {
                                    if (chat4.migrated_to == null) {
                                        break;
                                    }
                                    arrayList4 = arrayList3;
                                    i4 = i12;
                                }
                            }
                        }
                        i12 = i4 + 1;
                        arrayList10 = arrayList4;
                        z4 = z2;
                    }
                    i4 = i12;
                    arrayList4 = arrayList3;
                    k27 k27Var = new k27(na7Var.currentAccount, message2, vf6Var3, vf6Var4, false, false);
                    arrayList4.add(k27Var);
                    long B0 = k27.B0(k27Var.k);
                    ArrayList arrayList11 = (ArrayList) vf6Var2.f(B0);
                    if (arrayList11 == null) {
                        arrayList11 = new ArrayList(1);
                    }
                    arrayList11.add(k27Var);
                    vf6Var2.k(arrayList11, B0);
                    i12 = i4 + 1;
                    arrayList10 = arrayList4;
                    z4 = z2;
                }
                boolean z5 = z4;
                na7Var.getFileLoader().l(arrayList10);
                for (0; i2 < tL_messages_dialogs.dialogs.size(); i2 + 1) {
                    TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i2);
                    cf3.w(dialog);
                    long j6 = na7Var.s2;
                    if (j6 == 0 || j6 != dialog.id) {
                        if (cf3.x(dialog)) {
                            TLRPC.Chat chat5 = (TLRPC.Chat) vf6Var4.f(-dialog.id);
                            i2 = (chat5 != null && hc2.r0(chat5)) ? i2 + 1 : 0;
                        } else if (cf3.y(dialog.id)) {
                            TLRPC.Chat chat6 = (TLRPC.Chat) vf6Var4.f(-dialog.id);
                            if (chat6 != null) {
                                if (chat6.migrated_to == null) {
                                    if (hc2.r0(chat6)) {
                                    }
                                }
                            }
                        }
                    }
                    if (dialog.last_message_date == 0 && (arrayList2 = (ArrayList) vf6Var2.f(dialog.id)) != null) {
                        int i13 = Integer.MIN_VALUE;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            k27 k27Var2 = (k27) arrayList2.get(i14);
                            if (k27Var2 != null && (message = k27Var2.k) != null && (i3 = message.date) > i13) {
                                i13 = i3;
                            }
                        }
                        if (i13 > Integer.MIN_VALUE) {
                            dialog.last_message_date = i13;
                        }
                    }
                    vf6Var.k(dialog, dialog.id);
                    longSparseIntArray.put(dialog.id, dialog.unread_count);
                    Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                    if (num == null) {
                        num = 0;
                    }
                    int i15 = dialog.read_inbox_max_id;
                    int i16 = dialog.top_message;
                    if (i15 > i16) {
                        dialog.read_inbox_max_id = i16;
                    }
                    int intValue = num.intValue();
                    int i17 = dialog.top_message;
                    if (intValue > i17) {
                        num = Integer.valueOf(i17);
                    }
                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                    Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                    if (num2 == null) {
                        num2 = 0;
                    }
                    concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                }
                gl.c3(new z2a((Object) na7Var, (Object) tL_messages_dialogs, (Object) vf6Var, (Object) vf6Var2, z5, (Object) longSparseIntArray, (byte) 11));
                return;
            case 2:
                x();
                return;
            case 3:
                ad7 ad7Var = (ad7) this.c;
                vf6 vf6Var5 = (vf6) this.d;
                boolean z6 = this.b;
                vf6 vf6Var6 = new vf6();
                try {
                    if (z6) {
                        try {
                            try {
                                ad7Var.b.beginTransaction();
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement3 = null;
                                i5 = 0;
                                ad7Var.n(e, true);
                                break;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            sQLitePreparedStatement2 = null;
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            throw th;
                        }
                    }
                    try {
                        sQLitePreparedStatement3 = ad7Var.b.executeFast("DELETE FROM ephemeral_messages WHERE dialog_id = ? AND id = ?;");
                        for (int i18 = 0; i18 < vf6Var5.m(); i18++) {
                            try {
                                long j7 = vf6Var5.j(i18);
                                ArrayList arrayList12 = (ArrayList) vf6Var5.n(i18);
                                if (arrayList12 != null) {
                                    vf6Var6.k(ad7Var.W(arrayList12, j7), j7);
                                    i5 = 0;
                                    for (int i19 = 0; i19 < arrayList12.size(); i19++) {
                                        try {
                                            sQLitePreparedStatement3.requery();
                                            sQLitePreparedStatement3.bindLong(1, j7);
                                            sQLitePreparedStatement3.bindInteger(2, ((Integer) arrayList12.get(i19)).intValue());
                                            sQLitePreparedStatement3.step();
                                        } catch (Exception e3) {
                                            e = e3;
                                            ad7Var.n(e, true);
                                        }
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                i5 = 0;
                                ad7Var.n(e, true);
                            }
                        }
                        i5 = 0;
                        int i20 = 0;
                        while (i20 < vf6Var5.m()) {
                            long j8 = vf6Var5.j(i20);
                            ArrayList arrayList13 = (ArrayList) vf6Var5.n(i20);
                            hq6 mediaDataController = ad7Var.getMediaDataController();
                            zc7 a = zc7.a(j8, j);
                            mediaDataController.getClass();
                            long j9 = j;
                            gl.c3(new lo6(mediaDataController, (Object) null, a, b));
                            String join = TextUtils.join(",", arrayList13);
                            SQLiteDatabase sQLiteDatabase = ad7Var.b;
                            Locale locale = Locale.US;
                            sQLiteDatabase.executeFast("DELETE FROM bot_keyboard WHERE mid IN(" + join + ") AND uid = " + j8).stepThis().dispose();
                            ad7Var.b.executeFast("DELETE FROM bot_keyboard_topics WHERE mid IN(" + join + ") AND uid = " + j8).stepThis().dispose();
                            i20++;
                            j = j9;
                        }
                        if (z6) {
                            ad7Var.b.commitTransaction();
                            break;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i5 = 0;
                        sQLitePreparedStatement3 = null;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    sQLitePreparedStatement2 = sQLitePreparedStatement;
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
                boolean z7 = this.b;
                String str7 = (String) this.d;
                int i21 = AnimatedPhoneNumberEditText.b2;
                animatedPhoneNumberEditText.B(str7, z7);
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
                boolean z8 = this.b;
                lh0 lh0Var = (lh0) this.d;
                String str8 = LaunchActivity.C1;
                ((ApplicationLoaderImpl) a.a).getClass();
                oh0 e6 = oh0.e();
                String str9 = e6.a;
                lh0 lh0Var2 = (str9 == null || (i6 = e6.b) == 0) ? null : new lh0(str9, i6, e6.c);
                if (lh0Var2 != null) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    if (oh0.e().j) {
                        return;
                    }
                    if (z8 || lh0Var == null || (gba.R(lh0Var2.b, lh0Var.b) && lh0Var2.a > lh0Var.a)) {
                        ((ApplicationLoaderImpl) a.a).getClass();
                        try {
                            new j6c(launchActivity, lh0Var2).show();
                            return;
                        } catch (Exception e7) {
                            fa4.g(e7, true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ mn6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ mn6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}

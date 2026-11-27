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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ds6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ds6(zu1 zu1Var, ArrayList arrayList, int i) {
        this.a = (byte) 9;
        this.c = zu1Var;
        this.d = arrayList;
        this.b = i;
    }

    private final void a() {
        fb fbVar = (fb) this.c;
        String str = (String) this.d;
        wa waVar = fbVar.x;
        ArrayList arrayList = fbVar.y;
        arrayList.clear();
        bw9.a().getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList2.add(jSONArray.getString(i));
            }
        } catch (Exception e) {
            cc4.g(e, false);
            try {
                JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getJSONObject(i2).getString("key"));
                }
            } catch (Exception e2) {
                cc4.g(e2, false);
                try {
                    JSONArray jSONArray3 = new JSONArray(str);
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        String string = jSONArray3.getJSONObject(i3).getString("phrase");
                        if (!TextUtils.isEmpty(string)) {
                            arrayList2.add(string);
                        }
                    }
                } catch (Exception e3) {
                    cc4.g(e3, false);
                }
            }
        }
        arrayList.addAll(arrayList2);
        waVar.g3.O(true);
        if (this.b != (!arrayList.isEmpty())) {
            waVar.f3.g1(0, 0);
        }
    }

    private final void b() {
        id idVar = (id) this.c;
        View view = (View) this.d;
        if (view instanceof xmb) {
            xmb xmbVar = (xmb) view;
            if (xmbVar.a) {
                xmbVar.a = false;
                xmbVar.invalidate();
            }
        }
        if (this.b) {
            idVar.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        if (r1 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        r41 r41Var = (r41) this.c;
        jf7 jf7Var = (jf7) this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = jf7Var.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
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
                    jf7Var.k0(arrayList4, arrayList2, false);
                }
                if (!arrayList5.isEmpty()) {
                    jf7Var.P(TextUtils.join(",", arrayList5), arrayList3);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            sQLiteCursor.dispose();
            hl.c3(new va7((Object) r41Var, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, this.b, (byte) 4));
        } finally {
        }
    }

    private final void d() {
        ((zu1) this.c).fb(this.b ? 1 : 0, (ArrayList) this.d, false, false);
    }

    private final void e() {
        ((zu1) this.c).Zc((r47) this.d, this.b);
    }

    private final void f() {
        int i;
        ju1 ju1Var = (ju1) this.c;
        TLObject tLObject = (TLObject) this.d;
        zu1 zu1Var = ju1Var.a;
        zu1Var.pc.b();
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        boolean z2 = this.b;
        if (!z) {
            d31.b0(zu1Var).Q(R.raw.error, 36, ob6.M0(z2 ? 2131754428 : 2131754378, null)).k(true);
            return;
        }
        i = ((e) zu1Var).currentAccount;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        ls6.d0(i).L1(tL_messages_stickerSet, false);
        if (zu1Var.getParentActivity() == null || zu1Var.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        tL_inputStickerSetID.id = stickerSet.id;
        if (!z2) {
            s4b s4bVar = new s4b(zu1Var.getParentActivity(), zu1Var, tL_inputStickerSetID, null, zu1Var.a0, zu1Var.Ba);
            boolean Y7 = zu1Var.Y7();
            s4bVar.i0 = Y7;
            s4bVar.n = Y7;
            zu1Var.showDialog(s4bVar);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(tL_inputStickerSetID);
        ly3 ly3Var = new ly3(zu1Var, zu1Var.getParentActivity(), zu1Var.Ba, arrayList);
        boolean Y72 = zu1Var.Y7();
        ly3Var.i0 = Y72;
        ly3Var.n = Y72;
        zu1Var.showDialog(ly3Var);
    }

    private final void g() {
        n12 n12Var = (n12) this.c;
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
        if (!n12Var.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
            n12Var.w0(true);
            editTextBoldCursor.requestFocus();
            if (this.b) {
                hl.c3(new dy1(n12Var, editTextBoldCursor, (byte) 6));
            }
        }
    }

    private final void h() {
        ((icc) this.c).a((Bitmap) this.d, Boolean.valueOf(this.b));
    }

    private final void i() {
        s92 s92Var = (s92) this.c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        u92 u92Var = s92Var.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u92Var.o2, u92Var.getContext());
        String M0 = ob6.M0(2131743327, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131743328, null);
        alertDialog$Builder.j(ob6.M0(2131747558, null), new bh((Object) s92Var, (Object) tL_username, this.b, (byte) 6));
        alertDialog$Builder.o();
    }

    private final void j() {
        ja2 ja2Var = (ja2) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        na2 na2Var = ja2Var.y.d;
        na2Var.P = false;
        if (this.b || !chat.join_request) {
            return;
        }
        chat.join_request = false;
        na2Var.Q = true;
        na2Var.getMessagesController().q5(chat.id, 0L, false, false, false, new ia2(ja2Var, (byte) 1), new ea2(ja2Var, chat, (byte) 4));
    }

    private final void k() {
        ((kn2) this.c).Z0((pcc) this.d, this.b, false);
    }

    private final void l() {
        boolean z;
        lj3 lj3Var = (lj3) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        uj3 uj3Var = lj3Var.b;
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
                uj3Var.getNotificationsController().T(dialog.id, z ? 3 : 4, 0L);
                i2++;
            }
            i++;
        }
        c21 c21Var = new c21(uj3Var.getParentActivity(), null);
        c21Var.b.setText(z ? ob6.G(i2, "NotificationsMutedHintChats", new Object[0]) : ob6.G(i2, "NotificationsUnmutedHintChats", new Object[0]));
        if (z) {
            c21Var.h(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            c21Var.h(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        v21.g(uj3Var, c21Var, 1500).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r6 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m() {
        SQLiteDatabase sQLiteDatabase;
        jf7 jf7Var = (jf7) this.c;
        pcc pccVar = (pcc) this.d;
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteDatabase = jf7Var.b;
            } catch (Exception e) {
                cc4.g(e, true);
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
                        zq3 zq3Var = new zq3(byteBufferValue);
                        zq3Var.a = longValue;
                        arrayList.add(zq3Var);
                    } catch (Exception e2) {
                        cc4.g(e2, true);
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
            hl.c3(new xq3(pccVar, arrayList, (byte) 0));
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void n() {
        xb4 xb4Var = (xb4) this.c;
        boolean z = this.b;
        String str = (String) this.d;
        nd4 nd4Var = !z ? (nd4) xb4Var.h.get(str) : (nd4) xb4Var.n.get(str);
        xb4Var.y.remove(str);
        if (nd4Var != null) {
            xb4Var.n.remove(str);
            xb4Var.e.remove(nd4Var);
            xb4Var.f.remove(nd4Var);
            if (nd4Var.m != 3) {
                nd4Var.m = (byte) 2;
                Utilities.d.c(new jd4(nd4Var, (byte) 1));
                String str2 = nd4Var.l;
                if (str2 == null) {
                    Set set = u60.a;
                } else {
                    u60.a.remove(str2);
                }
                nd4Var.o.a();
                nd4Var.b();
            }
        }
    }

    private final void o() {
        ((je4) this.c).b0((nn4) this.d, !this.b);
    }

    private final void p() {
        ((qn4) this.c).a1((nn4) this.d, !this.b);
    }

    private final void q() {
        vt4 vt4Var = (vt4) this.c;
        TLObject tLObject = (TLObject) this.d;
        ArrayList arrayList = vt4Var.c;
        if (tLObject instanceof TLRPC.messages_BotResults) {
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            vt4Var.h = messages_botresults.next_offset;
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
            vt4Var.d = false;
            vt4Var.F(false);
            vt4Var.f();
        }
    }

    private final void r() {
        p35 p35Var = (p35) this.c;
        i02 i02Var = (i02) this.d;
        boolean z = this.b;
        if (p35Var.b) {
            return;
        }
        try {
            if (i02Var.b != ((k35) i02Var.c).l()) {
                p35Var.c("STORAGE_CANCELED");
                return;
            }
            tne.b = p35Var;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.isFinishing() || launchActivity.isDestroyed() || launchActivity.u().P()) {
                p35Var.c("AUTH_UNAVAILABLE");
                return;
            }
            p35Var.e = launchActivity;
            try {
                if (z) {
                    p35Var.a();
                } else if (Build.VERSION.SDK_INT >= 30) {
                    p35Var.d();
                } else {
                    p35Var.b();
                }
            } catch (Exception e) {
                cc4.g(e, true);
                p35Var.a();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
            p35Var.c("AUTH_UNAVAILABLE");
        }
    }

    private final void s() {
        ka5 ka5Var = (ka5) this.c;
        ka5 ka5Var2 = (ka5) this.d;
        if (this.b) {
            ka5Var.y.removeView(ka5Var2);
        }
        ka5Var2.setVisibility(8);
        ka5Var.A0 = null;
    }

    private final void t() {
        in5 in5Var = (in5) this.c;
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
                    HashMap hashMap = in5Var.l;
                    SparseArray sparseArray = in5Var.m;
                    String str = (String) sparseArray.get(A);
                    if (str != null) {
                        gn5 gn5Var = (gn5) hashMap.get(str);
                        if (gn5Var != null) {
                            ArrayList arrayList = gn5Var.c;
                            int indexOf = arrayList.indexOf(imageReceiver);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                                gn5Var.d.remove(indexOf);
                            }
                            if (arrayList.isEmpty()) {
                                hashMap.remove(str);
                            }
                        }
                        sparseArray.remove(A);
                    }
                }
                wm5 wm5Var = (wm5) in5Var.k.get(A);
                if (wm5Var != null) {
                    wm5Var.b(imageReceiver);
                }
            }
            i++;
        }
    }

    private final void u() {
        LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
        id idVar = (id) this.d;
        languageSelectActivity.getClass();
        idVar.dismiss();
        if (this.b) {
            return;
        }
        hl.d3(new jz5(languageSelectActivity, (byte) 2), 10L);
    }

    private final void v() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        e eVar = (e) this.d;
        String str = LaunchActivity.C1;
        launchActivity.u0(eVar, this.b, false);
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
    private final void w() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Object[] objArr;
        Object[] objArr2;
        jf7 jf7Var = (jf7) this.c;
        HashMap hashMap = (HashMap) this.d;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        try {
            if (f11.a) {
                cc4.b(jf7Var.currentAccount + " save contacts to db " + hashMap.size());
            }
            jf7Var.b.executeFast("DELETE FROM user_contacts_v7 WHERE 1").stepThis().dispose();
            jf7Var.b.executeFast("DELETE FROM user_phones_v7 WHERE 1").stepThis().dispose();
            jf7Var.b.beginTransaction();
            SQLitePreparedStatement executeFast = jf7Var.b.executeFast("REPLACE INTO user_contacts_v7 VALUES(?, ?, ?, ?, ?)");
            try {
                sQLitePreparedStatement = jf7Var.b.executeFast("REPLACE INTO user_phones_v7 VALUES(?, ?, ?, ?)");
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
                    iv2 iv2Var = (iv2) ((Map.Entry) it.next()).getValue();
                    ArrayList arrayList = iv2Var.e;
                    ArrayList arrayList2 = iv2Var.g;
                    if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                        executeFast.requery();
                        executeFast.bindString(1, iv2Var.b);
                        executeFast.bindInteger(2, iv2Var.a);
                        executeFast.bindString(3, iv2Var.i);
                        executeFast.bindString(4, iv2Var.j);
                        executeFast.bindInteger(5, iv2Var.l);
                        executeFast.step();
                        for (int i = 0; i < arrayList.size(); i++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindString(1, iv2Var.b);
                            sQLitePreparedStatement.bindString(2, (String) arrayList.get(i));
                            sQLitePreparedStatement.bindString(3, (String) arrayList2.get(i));
                            sQLitePreparedStatement.bindInteger(4, ((Integer) iv2Var.h.get(i)).intValue());
                            sQLitePreparedStatement.step();
                        }
                    }
                }
                executeFast.dispose();
                try {
                    try {
                        sQLitePreparedStatement.dispose();
                        jf7Var.b.commitTransaction();
                        if (this.b) {
                            jf7Var.b.executeFast("DROP TABLE IF EXISTS user_contacts_v6;").stepThis().dispose();
                            jf7Var.b.executeFast("DROP TABLE IF EXISTS user_phones_v6;").stepThis().dispose();
                            jf7Var.a.c(new je7(jf7Var, objArr == true ? 1 : 0, objArr2 == true ? 1 : 0));
                        }
                        SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        jf7Var.n(e, true);
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        sQLiteDatabase2 = jf7Var.b;
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
                    sQLiteDatabase = jf7Var.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                sQLitePreparedStatement2 = executeFast;
                jf7Var.n(e, true);
                if (sQLitePreparedStatement2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                sQLiteDatabase2 = jf7Var.b;
                if (sQLiteDatabase2 == null) {
                }
            } catch (Throwable th3) {
                th = th3;
                sQLitePreparedStatement2 = executeFast;
                if (sQLitePreparedStatement2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                sQLiteDatabase = jf7Var.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0232, code lost:
    
        r15.delete(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0239, code lost:
    
        if (r15.size() != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023b, code lost:
    
        r13.l(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023e, code lost:
    
        r4 = r11.anchor_msg_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0240, code lost:
    
        if (r4 == 0) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0242, code lost:
    
        r4 = r1.a0(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0247, code lost:
    
        if (r4 == null) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0249, code lost:
    
        if (r10 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024b, code lost:
    
        r10 = qd4.s(r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024f, code lost:
    
        r10.add(new r47(r1.currentAccount, r4, true, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025b, code lost:
    
        r2 = r2 + 1;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0263, code lost:
    
        if (r0.i() != false) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0265, code lost:
    
        hl.c3(new bd7(r1, r0, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01d6, code lost:
    
        if (r10 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0319, code lost:
    
        if (r13 != r10.dialog_id) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0336, code lost:
    
        if (xc2.r0(r7) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x034f, code lost:
    
        if (xc2.r0(r7) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ea, code lost:
    
        if (r10 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ec, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ef, code lost:
    
        r0 = new zh6();
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01fa, code lost:
    
        if (r2 >= r9.m()) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fc, code lost:
    
        r5 = r9.j(r2);
        r3 = (java.util.ArrayList) r9.n(r2);
        r7 = r3.size();
        r10 = r4;
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020d, code lost:
    
        if (r8 >= r7) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020f, code lost:
    
        r11 = r3.get(r8);
        r8 = r8 + 1;
        r11 = (org.telegram.tgnet.tl.TL_ephemeral.EphemeralMessage) r11;
        r12 = r11.anchor_msg_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0219, code lost:
    
        if (r12 == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021b, code lost:
    
        r13 = r1.e0;
        r14 = r11.id;
        r13 = (zh6) r13.a;
        r15 = (android.util.SparseIntArray) r13.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0229, code lost:
    
        if (r15 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0230, code lost:
    
        if (r15.get(r12, -1) != r14) goto L125;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01ca: MOVE (r4 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:459), block:B:164:0x01ca */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07c6 A[Catch: all -> 0x084f, TryCatch #8 {all -> 0x084f, blocks: (B:279:0x04a5, B:281:0x04a9, B:282:0x04cc, B:285:0x04e1, B:286:0x0555, B:289:0x05a2, B:292:0x05a8, B:295:0x05ad, B:296:0x05ca, B:297:0x05d6, B:299:0x05dc, B:301:0x05f7, B:303:0x0624, B:306:0x0636, B:308:0x0643, B:309:0x0658, B:312:0x078d, B:315:0x07a7, B:317:0x07c6, B:319:0x07d2, B:321:0x07e6, B:323:0x07f0, B:325:0x07f4, B:327:0x07f7, B:329:0x082d, B:331:0x07fb, B:332:0x0800, B:335:0x0801, B:336:0x0806, B:337:0x0807, B:339:0x080f, B:341:0x0813, B:343:0x0816, B:345:0x081f, B:346:0x082a, B:348:0x0825, B:350:0x0837, B:351:0x083c, B:354:0x083d, B:355:0x0842, B:356:0x07d9, B:392:0x077c, B:420:0x0648, B:422:0x064e, B:427:0x060c, B:430:0x05b3, B:432:0x05bc, B:433:0x05c7, B:434:0x05c2, B:435:0x0843, B:436:0x0848, B:437:0x0849, B:438:0x084e, B:439:0x04e7, B:441:0x04ef, B:443:0x04f5, B:444:0x04f9, B:446:0x04ff, B:449:0x0521, B:451:0x0527, B:453:0x0535, B:455:0x0538, B:458:0x053e, B:460:0x0544, B:463:0x054a, B:465:0x0550), top: B:278:0x04a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07d2 A[Catch: all -> 0x084f, TryCatch #8 {all -> 0x084f, blocks: (B:279:0x04a5, B:281:0x04a9, B:282:0x04cc, B:285:0x04e1, B:286:0x0555, B:289:0x05a2, B:292:0x05a8, B:295:0x05ad, B:296:0x05ca, B:297:0x05d6, B:299:0x05dc, B:301:0x05f7, B:303:0x0624, B:306:0x0636, B:308:0x0643, B:309:0x0658, B:312:0x078d, B:315:0x07a7, B:317:0x07c6, B:319:0x07d2, B:321:0x07e6, B:323:0x07f0, B:325:0x07f4, B:327:0x07f7, B:329:0x082d, B:331:0x07fb, B:332:0x0800, B:335:0x0801, B:336:0x0806, B:337:0x0807, B:339:0x080f, B:341:0x0813, B:343:0x0816, B:345:0x081f, B:346:0x082a, B:348:0x0825, B:350:0x0837, B:351:0x083c, B:354:0x083d, B:355:0x0842, B:356:0x07d9, B:392:0x077c, B:420:0x0648, B:422:0x064e, B:427:0x060c, B:430:0x05b3, B:432:0x05bc, B:433:0x05c7, B:434:0x05c2, B:435:0x0843, B:436:0x0848, B:437:0x0849, B:438:0x084e, B:439:0x04e7, B:441:0x04ef, B:443:0x04f5, B:444:0x04f9, B:446:0x04ff, B:449:0x0521, B:451:0x0527, B:453:0x0535, B:455:0x0538, B:458:0x053e, B:460:0x0544, B:463:0x054a, B:465:0x0550), top: B:278:0x04a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07e6 A[Catch: all -> 0x084f, TryCatch #8 {all -> 0x084f, blocks: (B:279:0x04a5, B:281:0x04a9, B:282:0x04cc, B:285:0x04e1, B:286:0x0555, B:289:0x05a2, B:292:0x05a8, B:295:0x05ad, B:296:0x05ca, B:297:0x05d6, B:299:0x05dc, B:301:0x05f7, B:303:0x0624, B:306:0x0636, B:308:0x0643, B:309:0x0658, B:312:0x078d, B:315:0x07a7, B:317:0x07c6, B:319:0x07d2, B:321:0x07e6, B:323:0x07f0, B:325:0x07f4, B:327:0x07f7, B:329:0x082d, B:331:0x07fb, B:332:0x0800, B:335:0x0801, B:336:0x0806, B:337:0x0807, B:339:0x080f, B:341:0x0813, B:343:0x0816, B:345:0x081f, B:346:0x082a, B:348:0x0825, B:350:0x0837, B:351:0x083c, B:354:0x083d, B:355:0x0842, B:356:0x07d9, B:392:0x077c, B:420:0x0648, B:422:0x064e, B:427:0x060c, B:430:0x05b3, B:432:0x05bc, B:433:0x05c7, B:434:0x05c2, B:435:0x0843, B:436:0x0848, B:437:0x0849, B:438:0x084e, B:439:0x04e7, B:441:0x04ef, B:443:0x04f5, B:444:0x04f9, B:446:0x04ff, B:449:0x0521, B:451:0x0527, B:453:0x0535, B:455:0x0538, B:458:0x053e, B:460:0x0544, B:463:0x054a, B:465:0x0550), top: B:278:0x04a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0807 A[Catch: all -> 0x084f, TryCatch #8 {all -> 0x084f, blocks: (B:279:0x04a5, B:281:0x04a9, B:282:0x04cc, B:285:0x04e1, B:286:0x0555, B:289:0x05a2, B:292:0x05a8, B:295:0x05ad, B:296:0x05ca, B:297:0x05d6, B:299:0x05dc, B:301:0x05f7, B:303:0x0624, B:306:0x0636, B:308:0x0643, B:309:0x0658, B:312:0x078d, B:315:0x07a7, B:317:0x07c6, B:319:0x07d2, B:321:0x07e6, B:323:0x07f0, B:325:0x07f4, B:327:0x07f7, B:329:0x082d, B:331:0x07fb, B:332:0x0800, B:335:0x0801, B:336:0x0806, B:337:0x0807, B:339:0x080f, B:341:0x0813, B:343:0x0816, B:345:0x081f, B:346:0x082a, B:348:0x0825, B:350:0x0837, B:351:0x083c, B:354:0x083d, B:355:0x0842, B:356:0x07d9, B:392:0x077c, B:420:0x0648, B:422:0x064e, B:427:0x060c, B:430:0x05b3, B:432:0x05bc, B:433:0x05c7, B:434:0x05c2, B:435:0x0843, B:436:0x0848, B:437:0x0849, B:438:0x084e, B:439:0x04e7, B:441:0x04ef, B:443:0x04f5, B:444:0x04f9, B:446:0x04ff, B:449:0x0521, B:451:0x0527, B:453:0x0535, B:455:0x0538, B:458:0x053e, B:460:0x0544, B:463:0x054a, B:465:0x0550), top: B:278:0x04a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07d9 A[Catch: all -> 0x084f, TryCatch #8 {all -> 0x084f, blocks: (B:279:0x04a5, B:281:0x04a9, B:282:0x04cc, B:285:0x04e1, B:286:0x0555, B:289:0x05a2, B:292:0x05a8, B:295:0x05ad, B:296:0x05ca, B:297:0x05d6, B:299:0x05dc, B:301:0x05f7, B:303:0x0624, B:306:0x0636, B:308:0x0643, B:309:0x0658, B:312:0x078d, B:315:0x07a7, B:317:0x07c6, B:319:0x07d2, B:321:0x07e6, B:323:0x07f0, B:325:0x07f4, B:327:0x07f7, B:329:0x082d, B:331:0x07fb, B:332:0x0800, B:335:0x0801, B:336:0x0806, B:337:0x0807, B:339:0x080f, B:341:0x0813, B:343:0x0816, B:345:0x081f, B:346:0x082a, B:348:0x0825, B:350:0x0837, B:351:0x083c, B:354:0x083d, B:355:0x0842, B:356:0x07d9, B:392:0x077c, B:420:0x0648, B:422:0x064e, B:427:0x060c, B:430:0x05b3, B:432:0x05bc, B:433:0x05c7, B:434:0x05c2, B:435:0x0843, B:436:0x0848, B:437:0x0849, B:438:0x084e, B:439:0x04e7, B:441:0x04ef, B:443:0x04f5, B:444:0x04f9, B:446:0x04ff, B:449:0x0521, B:451:0x0527, B:453:0x0535, B:455:0x0538, B:458:0x053e, B:460:0x0544, B:463:0x054a, B:465:0x0550), top: B:278:0x04a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0686 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        TLRPC.Chat chat;
        TLRPC.User user;
        ls6 ls6Var;
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
        SQLitePreparedStatement sQLitePreparedStatement;
        int i5;
        SQLitePreparedStatement sQLitePreparedStatement2;
        boolean z3;
        int i6;
        long j = 0;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r4 = null;
        mh0 mh0Var = null;
        ArrayList arrayList5 = null;
        int i7 = 1;
        switch (this.a) {
            case 0:
                ls6 ls6Var2 = (ls6) this.c;
                boolean z4 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                try {
                    if (xea.p == null) {
                        xea.p = UUID.randomUUID().toString();
                        a.b.getSharedPreferences("mainconfig", 0).edit().putString("directShareHash2", xea.p).commit();
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    if (z4) {
                        mka.n(a.b);
                    } else {
                        List e = mka.e(a.b);
                        if (e != null && !e.isEmpty()) {
                            arrayList8.add("compose");
                            for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                                arrayList8.add("did3_" + r47.B1(((TLRPC.TL_topPeer) arrayList6.get(i8)).peer));
                            }
                            for (int i9 = 0; i9 < e.size(); i9++) {
                                String str3 = ((hka) e.get(i9)).b;
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
                            mka.o(a.b, arrayList9);
                        }
                    }
                    Intent intent2 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                    intent2.setAction("new_dialog");
                    ArrayList arrayList10 = new ArrayList();
                    Context context = a.b;
                    hka hkaVar = new hka();
                    hkaVar.a = context;
                    hkaVar.b = "compose";
                    hkaVar.e = ob6.M0(2131748029, null);
                    hkaVar.f = ob6.M0(2131748029, null);
                    hkaVar.h = IconCompat.d(a.b, R.drawable.shortcut_compose);
                    hkaVar.m = 0;
                    hkaVar.c = new Intent[]{intent2};
                    if (TextUtils.isEmpty(hkaVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = hkaVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    if (z4) {
                        mka.m(a.b, hkaVar);
                    } else {
                        arrayList10.add(hkaVar);
                        if (arrayList7.contains("compose")) {
                            mka.y(a.b, arrayList10);
                        } else {
                            mka.a(a.b, arrayList10);
                        }
                        arrayList10.clear();
                    }
                    HashSet hashSet = new HashSet(1);
                    hashSet.add(ls6.Y1);
                    int i10 = 0;
                    while (i10 < arrayList6.size()) {
                        Intent intent3 = new Intent(a.b, (Class<?>) OpenChatReceiver.class);
                        long B1 = r47.B1(((TLRPC.TL_topPeer) arrayList6.get(i10)).peer);
                        if (wf3.D(B1)) {
                            intent3.putExtra("userId", B1);
                            user = ls6Var2.getMessagesController().X1(Long.valueOf(B1));
                            z = z4;
                            chat = null;
                        } else {
                            long j2 = -B1;
                            z = z4;
                            TLRPC.Chat M0 = ls6Var2.getMessagesController().M0(Long.valueOf(j2));
                            intent3.putExtra("chatId", j2);
                            chat = M0;
                            user = null;
                        }
                        if ((user == null || lbc.z(user)) && chat == null) {
                            ls6Var = ls6Var2;
                            arrayList = arrayList6;
                            i = i10;
                        } else if (user != null) {
                            str = lv2.m(0, user.first_name, user.last_name);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                                intent3.putExtra("currentAccount", ls6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", xea.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                    try {
                                        try {
                                            ls6Var2.getFileLoader().getClass();
                                        } catch (Throwable th) {
                                            th = th;
                                            arrayList = arrayList6;
                                            bitmap = null;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ls6Var = ls6Var2;
                                        str2 = str;
                                        arrayList = arrayList6;
                                        i = i10;
                                        intent = intent3;
                                        bitmap = null;
                                    }
                                    try {
                                        bitmap2 = BitmapFactory.decodeFile(xb4.J(fileLocation, null, true, true).toString());
                                    } catch (Throwable th3) {
                                        th = th3;
                                        arrayList = arrayList6;
                                        bitmap = null;
                                        ls6Var = ls6Var2;
                                        str2 = str;
                                        i = i10;
                                        intent = intent3;
                                        bitmap2 = bitmap;
                                        cc4.g(th, true);
                                        bitmap3 = bitmap2;
                                        String str4 = "did3_" + B1;
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        Context context2 = a.b;
                                        hka hkaVar2 = new hka();
                                        hkaVar2.a = context2;
                                        hkaVar2.b = str4;
                                        hkaVar2.e = r2;
                                        hkaVar2.f = r2;
                                        hkaVar2.m = i + 1;
                                        hkaVar2.c = new Intent[]{intent};
                                        if (xea.u0) {
                                        }
                                        if (bitmap3 != null) {
                                        }
                                        if (z) {
                                        }
                                        i10 = i + 1;
                                        z4 = z;
                                        ls6Var2 = ls6Var;
                                        arrayList6 = arrayList;
                                    }
                                    if (bitmap2 != null) {
                                        try {
                                            int L = hl.L(48.0f);
                                            bitmap3 = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap3);
                                            if (ls6.b2 == null) {
                                                ls6Var = ls6Var2;
                                                try {
                                                    str2 = str;
                                                    try {
                                                        ls6.b2 = new Paint(3);
                                                        ls6.d2 = new RectF();
                                                        Paint paint = new Paint(1);
                                                        ls6.c2 = paint;
                                                        arrayList = arrayList6;
                                                        try {
                                                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                                            path = new Path();
                                                            ls6.e2 = path;
                                                            i = i10;
                                                            intent = intent3;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            i = i10;
                                                            intent = intent3;
                                                            cc4.g(th, true);
                                                            bitmap3 = bitmap2;
                                                            String str42 = "did3_" + B1;
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            Context context22 = a.b;
                                                            hka hkaVar22 = new hka();
                                                            hkaVar22.a = context22;
                                                            hkaVar22.b = str42;
                                                            hkaVar22.e = r2;
                                                            hkaVar22.f = r2;
                                                            hkaVar22.m = i + 1;
                                                            hkaVar22.c = new Intent[]{intent};
                                                            if (xea.u0) {
                                                            }
                                                            if (bitmap3 != null) {
                                                            }
                                                            if (z) {
                                                            }
                                                            i10 = i + 1;
                                                            z4 = z;
                                                            ls6Var2 = ls6Var;
                                                            arrayList6 = arrayList;
                                                        }
                                                        try {
                                                            path.addCircle(L / 2, L / 2, (L / 2) - hl.L(2.0f), Path.Direction.CW);
                                                            ls6.e2.toggleInverseFillType();
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cc4.g(th, true);
                                                            bitmap3 = bitmap2;
                                                            String str422 = "did3_" + B1;
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            Context context222 = a.b;
                                                            hka hkaVar222 = new hka();
                                                            hkaVar222.a = context222;
                                                            hkaVar222.b = str422;
                                                            hkaVar222.e = r2;
                                                            hkaVar222.f = r2;
                                                            hkaVar222.m = i + 1;
                                                            hkaVar222.c = new Intent[]{intent};
                                                            if (xea.u0) {
                                                            }
                                                            if (bitmap3 != null) {
                                                            }
                                                            if (z) {
                                                            }
                                                            i10 = i + 1;
                                                            z4 = z;
                                                            ls6Var2 = ls6Var;
                                                            arrayList6 = arrayList;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        arrayList = arrayList6;
                                                        i = i10;
                                                        intent = intent3;
                                                        cc4.g(th, true);
                                                        bitmap3 = bitmap2;
                                                        String str4222 = "did3_" + B1;
                                                        if (TextUtils.isEmpty(str2)) {
                                                        }
                                                        Context context2222 = a.b;
                                                        hka hkaVar2222 = new hka();
                                                        hkaVar2222.a = context2222;
                                                        hkaVar2222.b = str4222;
                                                        hkaVar2222.e = r2;
                                                        hkaVar2222.f = r2;
                                                        hkaVar2222.m = i + 1;
                                                        hkaVar2222.c = new Intent[]{intent};
                                                        if (xea.u0) {
                                                        }
                                                        if (bitmap3 != null) {
                                                        }
                                                        if (z) {
                                                        }
                                                        i10 = i + 1;
                                                        z4 = z;
                                                        ls6Var2 = ls6Var;
                                                        arrayList6 = arrayList;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    str2 = str;
                                                    arrayList = arrayList6;
                                                    i = i10;
                                                    intent = intent3;
                                                    cc4.g(th, true);
                                                    bitmap3 = bitmap2;
                                                    String str42222 = "did3_" + B1;
                                                    if (TextUtils.isEmpty(str2)) {
                                                    }
                                                    Context context22222 = a.b;
                                                    hka hkaVar22222 = new hka();
                                                    hkaVar22222.a = context22222;
                                                    hkaVar22222.b = str42222;
                                                    hkaVar22222.e = r2;
                                                    hkaVar22222.f = r2;
                                                    hkaVar22222.m = i + 1;
                                                    hkaVar22222.c = new Intent[]{intent};
                                                    if (xea.u0) {
                                                    }
                                                    if (bitmap3 != null) {
                                                    }
                                                    if (z) {
                                                    }
                                                    i10 = i + 1;
                                                    z4 = z;
                                                    ls6Var2 = ls6Var;
                                                    arrayList6 = arrayList;
                                                }
                                            } else {
                                                ls6Var = ls6Var2;
                                                str2 = str;
                                                arrayList = arrayList6;
                                                i = i10;
                                                intent = intent3;
                                            }
                                            ls6.d2.set(hl.L(2.0f), hl.L(2.0f), hl.L(46.0f), hl.L(46.0f));
                                            canvas.drawBitmap(bitmap2, (Rect) null, ls6.d2, ls6.b2);
                                            canvas.drawPath(ls6.e2, ls6.c2);
                                            try {
                                                canvas.setBitmap(null);
                                            } catch (Exception unused) {
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            ls6Var = ls6Var2;
                                        }
                                    } else {
                                        ls6Var = ls6Var2;
                                        str2 = str;
                                        arrayList = arrayList6;
                                        i = i10;
                                        intent = intent3;
                                        bitmap3 = bitmap2;
                                    }
                                } else {
                                    ls6Var = ls6Var2;
                                    str2 = str;
                                    arrayList = arrayList6;
                                    i = i10;
                                    intent = intent3;
                                    bitmap3 = null;
                                }
                                String str422222 = "did3_" + B1;
                                String str5 = TextUtils.isEmpty(str2) ? " " : str2;
                                Context context222222 = a.b;
                                hka hkaVar222222 = new hka();
                                hkaVar222222.a = context222222;
                                hkaVar222222.b = str422222;
                                hkaVar222222.e = str5;
                                hkaVar222222.f = str5;
                                hkaVar222222.m = i + 1;
                                hkaVar222222.c = new Intent[]{intent};
                                if (xea.u0) {
                                    ss ssVar = new ss(0);
                                    ssVar.addAll(hashSet);
                                    hkaVar222222.j = ssVar;
                                }
                                if (bitmap3 != null) {
                                    hkaVar222222.h = IconCompat.c(bitmap3);
                                } else {
                                    hkaVar222222.h = IconCompat.d(a.b, R.drawable.shortcut_user);
                                }
                                if (z) {
                                    Context context3 = a.b;
                                    if (TextUtils.isEmpty(hkaVar222222.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr2 = hkaVar222222.c;
                                    if (intentArr2 == null || intentArr2.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    mka.m(context3, hkaVar222222);
                                } else {
                                    if (TextUtils.isEmpty(hkaVar222222.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr3 = hkaVar222222.c;
                                    if (intentArr3 == null || intentArr3.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    arrayList10.add(hkaVar222222);
                                    if (arrayList7.contains(str422222)) {
                                        mka.y(a.b, arrayList10);
                                    } else {
                                        mka.a(a.b, arrayList10);
                                    }
                                    arrayList10.clear();
                                }
                            }
                            fileLocation = null;
                            intent3.putExtra("currentAccount", ls6Var2.currentAccount);
                            intent3.setAction("com.tmessages.openchat" + B1);
                            intent3.putExtra("dialogId", B1);
                            intent3.putExtra("hash", xea.p);
                            intent3.addFlags(67108864);
                            if (fileLocation == null) {
                            }
                            String str4222222 = "did3_" + B1;
                            if (TextUtils.isEmpty(str2)) {
                            }
                            Context context2222222 = a.b;
                            hka hkaVar2222222 = new hka();
                            hkaVar2222222.a = context2222222;
                            hkaVar2222222.b = str4222222;
                            hkaVar2222222.e = str5;
                            hkaVar2222222.f = str5;
                            hkaVar2222222.m = i + 1;
                            hkaVar2222222.c = new Intent[]{intent};
                            if (xea.u0) {
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
                                intent3.putExtra("currentAccount", ls6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", xea.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                }
                                String str42222222 = "did3_" + B1;
                                if (TextUtils.isEmpty(str2)) {
                                }
                                Context context22222222 = a.b;
                                hka hkaVar22222222 = new hka();
                                hkaVar22222222.a = context22222222;
                                hkaVar22222222.b = str42222222;
                                hkaVar22222222.e = str5;
                                hkaVar22222222.f = str5;
                                hkaVar22222222.m = i + 1;
                                hkaVar22222222.c = new Intent[]{intent};
                                if (xea.u0) {
                                }
                                if (bitmap3 != null) {
                                }
                                if (z) {
                                }
                            } else {
                                str = str6;
                                fileLocation = null;
                                intent3.putExtra("currentAccount", ls6Var2.currentAccount);
                                intent3.setAction("com.tmessages.openchat" + B1);
                                intent3.putExtra("dialogId", B1);
                                intent3.putExtra("hash", xea.p);
                                intent3.addFlags(67108864);
                                if (fileLocation == null) {
                                }
                                String str422222222 = "did3_" + B1;
                                if (TextUtils.isEmpty(str2)) {
                                }
                                Context context222222222 = a.b;
                                hka hkaVar222222222 = new hka();
                                hkaVar222222222.a = context222222222;
                                hkaVar222222222.b = str422222222;
                                hkaVar222222222.e = str5;
                                hkaVar222222222.f = str5;
                                hkaVar222222222.m = i + 1;
                                hkaVar222222222.c = new Intent[]{intent};
                                if (xea.u0) {
                                }
                                if (bitmap3 != null) {
                                }
                                if (z) {
                                }
                            }
                        }
                        i10 = i + 1;
                        z4 = z;
                        ls6Var2 = ls6Var;
                        arrayList6 = arrayList;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 1:
                uc7 uc7Var = (uc7) this.c;
                boolean z5 = this.b;
                TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) this.d;
                ConcurrentHashMap concurrentHashMap = uc7Var.Q;
                ConcurrentHashMap concurrentHashMap2 = uc7Var.P;
                if (!z5) {
                    uc7Var.o(tL_messages_dialogs.dialogs);
                }
                zh6 zh6Var = new zh6();
                zh6 zh6Var2 = new zh6();
                zh6 zh6Var3 = new zh6(tL_messages_dialogs.users.size());
                zh6 zh6Var4 = new zh6(tL_messages_dialogs.chats.size());
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                for (int i11 = 0; i11 < tL_messages_dialogs.users.size(); i11++) {
                    TLRPC.User user2 = tL_messages_dialogs.users.get(i11);
                    zh6Var3.k(user2.id, user2);
                }
                for (int i12 = 0; i12 < tL_messages_dialogs.chats.size(); i12++) {
                    TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i12);
                    zh6Var4.k(chat2.id, chat2);
                }
                ArrayList arrayList11 = new ArrayList();
                int i13 = 0;
                while (i13 < tL_messages_dialogs.messages.size()) {
                    TLRPC.Message message2 = tL_messages_dialogs.messages.get(i13);
                    long j3 = uc7Var.s2;
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
                            TLRPC.Chat chat3 = (TLRPC.Chat) zh6Var4.f(j4);
                            if (chat3 != null) {
                                break;
                            }
                        } else {
                            long j5 = peer.chat_id;
                            if (j5 != 0) {
                                TLRPC.Chat chat4 = (TLRPC.Chat) zh6Var4.f(j5);
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
                    r47 r47Var = new r47(uc7Var.currentAccount, message2, zh6Var3, zh6Var4, false, false);
                    arrayList4.add(r47Var);
                    long B0 = r47.B0(r47Var.k);
                    ArrayList arrayList12 = (ArrayList) zh6Var2.f(B0);
                    if (arrayList12 == null) {
                        arrayList12 = new ArrayList(1);
                    }
                    arrayList12.add(r47Var);
                    zh6Var2.k(B0, arrayList12);
                    i13 = i4 + 1;
                    arrayList11 = arrayList4;
                    z5 = z2;
                }
                boolean z6 = z5;
                uc7Var.getFileLoader().l(arrayList11);
                for (0; i2 < tL_messages_dialogs.dialogs.size(); i2 + 1) {
                    TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i2);
                    wf3.w(dialog);
                    long j6 = uc7Var.s2;
                    if (j6 == 0 || j6 != dialog.id) {
                        if (wf3.x(dialog)) {
                            TLRPC.Chat chat5 = (TLRPC.Chat) zh6Var4.f(-dialog.id);
                            i2 = (chat5 != null && xc2.r0(chat5)) ? i2 + 1 : 0;
                        } else if (wf3.y(dialog.id)) {
                            TLRPC.Chat chat6 = (TLRPC.Chat) zh6Var4.f(-dialog.id);
                            if (chat6 != null) {
                                if (chat6.migrated_to == null) {
                                    if (xc2.r0(chat6)) {
                                    }
                                }
                            }
                        }
                    }
                    if (dialog.last_message_date == 0 && (arrayList2 = (ArrayList) zh6Var2.f(dialog.id)) != null) {
                        int i14 = Integer.MIN_VALUE;
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            r47 r47Var2 = (r47) arrayList2.get(i15);
                            if (r47Var2 != null && (message = r47Var2.k) != null && (i3 = message.date) > i14) {
                                i14 = i3;
                            }
                        }
                        if (i14 > Integer.MIN_VALUE) {
                            dialog.last_message_date = i14;
                        }
                    }
                    zh6Var.k(dialog.id, dialog);
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
                hl.c3(new y6a((Object) uc7Var, (Object) tL_messages_dialogs, (Object) zh6Var, (Object) zh6Var2, z6, (Object) longSparseIntArray, (byte) 11));
                return;
            case 2:
                w();
                return;
            case 3:
                jf7 jf7Var = (jf7) this.c;
                zh6 zh6Var5 = (zh6) this.d;
                boolean z7 = this.b;
                zh6 zh6Var6 = new zh6();
                try {
                    if (z7) {
                        try {
                            try {
                                jf7Var.b.beginTransaction();
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement2 = null;
                                z3 = true;
                                i5 = 0;
                                jf7Var.n(e, z3);
                                break;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            if (sQLitePreparedStatement3 != null) {
                                sQLitePreparedStatement3.dispose();
                            }
                            throw th;
                        }
                    }
                    try {
                        sQLitePreparedStatement2 = jf7Var.b.executeFast("DELETE FROM ephemeral_messages WHERE dialog_id = ? AND id = ?;");
                        int i19 = 0;
                        while (i19 < zh6Var5.m()) {
                            try {
                                long j7 = zh6Var5.j(i19);
                                ArrayList arrayList13 = (ArrayList) zh6Var5.n(i19);
                                if (arrayList13 != null) {
                                    zh6Var6.k(j7, jf7Var.W(arrayList13, j7));
                                    int i20 = 0;
                                    i5 = 0;
                                    while (i20 < arrayList13.size()) {
                                        try {
                                            sQLitePreparedStatement2.requery();
                                            sQLitePreparedStatement2.bindLong(i7, j7);
                                            sQLitePreparedStatement2.bindInteger(2, ((Integer) arrayList13.get(i20)).intValue());
                                            sQLitePreparedStatement2.step();
                                            i20++;
                                            i7 = 1;
                                        } catch (Exception e3) {
                                            e = e3;
                                            z3 = true;
                                            jf7Var.n(e, z3);
                                        }
                                    }
                                }
                                i19++;
                                i7 = 1;
                            } catch (Exception e4) {
                                e = e4;
                                i5 = 0;
                            }
                        }
                        i5 = 0;
                        int i21 = 0;
                        while (i21 < zh6Var5.m()) {
                            long j8 = zh6Var5.j(i21);
                            ArrayList arrayList14 = (ArrayList) zh6Var5.n(i21);
                            ls6 mediaDataController = jf7Var.getMediaDataController();
                            if7 a = if7.a(j8, j);
                            mediaDataController.getClass();
                            long j9 = j;
                            hl.c3(new yg6(mediaDataController, sQLitePreparedStatement3, a, (byte) 6));
                            String join = TextUtils.join(",", arrayList14);
                            SQLiteDatabase sQLiteDatabase = jf7Var.b;
                            Locale locale = Locale.US;
                            sQLiteDatabase.executeFast("DELETE FROM bot_keyboard WHERE mid IN(" + join + ") AND uid = " + j8).stepThis().dispose();
                            jf7Var.b.executeFast("DELETE FROM bot_keyboard_topics WHERE mid IN(" + join + ") AND uid = " + j8).stepThis().dispose();
                            i21++;
                            j = j9;
                        }
                        if (z7) {
                            jf7Var.b.commitTransaction();
                            break;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i5 = 0;
                        sQLitePreparedStatement2 = null;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    sQLitePreparedStatement3 = sQLitePreparedStatement;
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
                int i22 = AnimatedPhoneNumberEditText.c2;
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
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                boolean z9 = this.b;
                mh0 mh0Var2 = (mh0) this.d;
                String str8 = LaunchActivity.C1;
                ((ApplicationLoaderImpl) a.a).getClass();
                ph0 e6 = ph0.e();
                String str9 = e6.a;
                if (str9 != null && (i6 = e6.b) != 0) {
                    mh0Var = new mh0(str9, i6, e6.c);
                }
                if (mh0Var != null) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    if (ph0.e().j) {
                        return;
                    }
                    if (z9 || mh0Var2 == null || (xea.R(mh0Var.b, mh0Var2.b) && mh0Var.a > mh0Var2.a)) {
                        ((ApplicationLoaderImpl) a.a).getClass();
                        try {
                            new jac(launchActivity, mh0Var).show();
                            return;
                        } catch (Exception e7) {
                            cc4.g(e7, true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ds6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ ds6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}

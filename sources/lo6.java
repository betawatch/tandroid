// default package

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class lo6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lo6(byte b, Object obj, Object obj2, TLObject tLObject) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r2 != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        Exception e;
        vf6 vf6Var;
        ad7 ad7Var = (ad7) this.b;
        vf6 vf6Var2 = (vf6) this.c;
        vf6 vf6Var3 = (vf6) this.d;
        SQLiteCursor sQLiteCursor = null;
        try {
            if (vf6Var2 != null) {
                try {
                    int m = vf6Var2.m();
                    for (int i = 0; i < m; i++) {
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) vf6Var2.n(i)) + ") AND uid = " + vf6Var2.j(i) + " AND media = 0").stepThis().dispose();
                    }
                } catch (Exception e2) {
                    e = e2;
                    ad7Var.n(e, true);
                    if (sQLiteCursor == null) {
                        sQLiteCursor.dispose();
                        return;
                    }
                    return;
                }
            }
            if (vf6Var3 != null) {
                int m2 = vf6Var3.m();
                for (int i2 = 0; i2 < m2; i2++) {
                    SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) vf6Var3.n(i2)) + ") AND uid = " + vf6Var3.j(i2) + " AND media = 1").stepThis().dispose();
                }
            }
            SQLiteCursor queryFinalized = ad7Var.b.queryFinalized("SELECT mid, date, media, uid FROM enc_tasks_v4 WHERE date = (SELECT min(date) FROM enc_tasks_v4)", new Object[0]);
            int i3 = 0;
            vf6 vf6Var4 = null;
            vf6 vf6Var5 = null;
            while (queryFinalized.next()) {
                try {
                    int intValue = queryFinalized.intValue(0);
                    i3 = queryFinalized.intValue(1);
                    int intValue2 = queryFinalized.intValue(2);
                    long longValue = queryFinalized.longValue(3);
                    if (intValue2 == -1) {
                        if (intValue > 0) {
                            if (vf6Var5 == null) {
                                vf6Var5 = new vf6();
                            }
                            vf6Var = vf6Var5;
                        }
                        if (vf6Var4 == null) {
                            vf6Var4 = new vf6();
                        }
                        vf6Var = vf6Var5;
                        vf6Var5 = vf6Var4;
                    }
                    ArrayList arrayList = (ArrayList) vf6Var5.f(longValue);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        vf6Var5.k(arrayList, longValue);
                    }
                    arrayList.add(Integer.valueOf(intValue));
                    vf6Var5 = vf6Var;
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursor = queryFinalized;
                    ad7Var.n(e, true);
                    if (sQLiteCursor == null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteCursor = queryFinalized;
                    Throwable th2 = th;
                    if (sQLiteCursor == null) {
                        throw th2;
                    }
                    sQLiteCursor.dispose();
                    throw th2;
                }
            }
            queryFinalized.dispose();
            na7 messagesController = ad7Var.getMessagesController();
            messagesController.getClass();
            Utilities.d.c(new q76((Object) messagesController, (Object) vf6Var4, (Object) vf6Var5, i3, (byte) 10));
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void b() {
        int currentTime;
        int i;
        SQLitePreparedStatement executeFast;
        ad7 ad7Var = (ad7) this.b;
        TLObject tLObject = (TLObject) this.c;
        String str = (String) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                currentTime = ad7Var.getConnectionsManager().getCurrentTime();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!(tLObject instanceof TLRPC.TL_messages_botCallbackAnswer)) {
                if (tLObject instanceof TLRPC.TL_messages_botResults) {
                    i = ((TLRPC.TL_messages_botResults) tLObject).cache_time;
                }
                executeFast = ad7Var.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
                tLObject.serializeToStream(nativeByteBuffer);
                executeFast.bindString(1, str);
                executeFast.bindInteger(2, currentTime);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
                return;
            }
            i = ((TLRPC.TL_messages_botCallbackAnswer) tLObject).cache_time;
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer2);
            executeFast.bindString(1, str);
            executeFast.bindInteger(2, currentTime);
            executeFast.bindByteBuffer(3, nativeByteBuffer2);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer2.reuse();
            return;
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            ad7Var.n(e, true);
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
                return;
            }
            return;
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
        currentTime += i;
        executeFast = ad7Var.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
    }

    private final void c() {
        ad7 ad7Var = (ad7) this.b;
        k27 k27Var = (k27) this.c;
        ad7Var.getNotificationCenter().k(kk7.l0, Long.valueOf(k27.B0(k27Var.k)), (ArrayList) this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d4  */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        String str;
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        na7 na7Var;
        SparseIntArray sparseIntArray;
        int i5;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 4;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        int i6 = 1;
        int i7 = 0;
        switch (b) {
            case 0:
                hq6 hq6Var = (hq6) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                if (tLObject != null) {
                    boolean z3 = tLObject instanceof TL_account.TL_savedRingtoneConverted;
                    ij9 ij9Var = hq6Var.A0;
                    if (z3) {
                        ij9Var.a(((TL_account.TL_savedRingtoneConverted) tLObject).document);
                        return;
                    } else {
                        ij9Var.a(document);
                        return;
                    }
                }
                return;
            case 1:
                hq6 hq6Var2 = (hq6) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                zc7 zc7Var = (zc7) obj;
                HashMap hashMap = hq6Var2.A1;
                vf6 vf6Var = hq6Var2.B1;
                vf6 vf6Var2 = hq6Var2.z1;
                if (arrayList2 == null) {
                    if (zc7Var != null) {
                        hashMap.remove(zc7Var);
                        vf6Var2.l(zc7Var.a);
                        hq6Var2.getNotificationCenter().k(69, null, zc7Var);
                        return;
                    }
                    return;
                }
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    int intValue = ((Integer) arrayList2.get(i8)).intValue();
                    long j = intValue;
                    zc7 zc7Var2 = (zc7) vf6Var.f(j);
                    if (zc7Var2 != null) {
                        hashMap.remove(zc7Var2);
                        ArrayList arrayList3 = (ArrayList) vf6Var2.f(zc7Var2.a);
                        if (arrayList3 != null) {
                            int i9 = 0;
                            while (i9 < arrayList3.size()) {
                                TLRPC.Message message = (TLRPC.Message) arrayList3.get(i9);
                                if (message == null || message.id == intValue) {
                                    arrayList3.remove(i9);
                                    i9--;
                                }
                                i9++;
                            }
                            if (arrayList3.isEmpty()) {
                                vf6Var2.l(zc7Var2.a);
                            }
                        }
                        vf6Var.l(j);
                        hq6Var2.getNotificationCenter().k(69, null, zc7Var2);
                    }
                }
                return;
            case 2:
                int i10 = 3;
                hq6 hq6Var3 = (hq6) obj3;
                TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) obj2;
                String str2 = (String) obj;
                try {
                    if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                        SQLitePreparedStatement executeFast = hq6Var3.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                        SQLitePreparedStatement executeFast2 = hq6Var3.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                        hq6Var3.getMessagesStorage().b.beginTransaction();
                        int size = tL_emojiKeywordsDifference.keywords.size();
                        int i11 = 0;
                        while (i11 < size) {
                            TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i11);
                            if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                                TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                                String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                                int size2 = tL_emojiKeyword.emoticons.size();
                                int i12 = 0;
                                while (i12 < size2) {
                                    executeFast.requery();
                                    executeFast.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast.bindString(2, lowerCase);
                                    executeFast.bindString(i10, tL_emojiKeyword.emoticons.get(i12));
                                    executeFast.step();
                                    i12++;
                                    i10 = 3;
                                }
                            } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                                TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                                String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                                int size3 = tL_emojiKeywordDeleted.emoticons.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    executeFast2.requery();
                                    executeFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast2.bindString(2, lowerCase2);
                                    executeFast2.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i13));
                                    executeFast2.step();
                                }
                            }
                            i11++;
                            i10 = 3;
                        }
                        hq6Var3.getMessagesStorage().b.commitTransaction();
                        executeFast.dispose();
                        executeFast2.dispose();
                    }
                    SQLitePreparedStatement executeFast3 = hq6Var3.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
                    executeFast3.bindString(1, str2);
                    executeFast3.bindString(2, tL_emojiKeywordsDifference.lang_code);
                    executeFast3.bindInteger(3, tL_emojiKeywordsDifference.version);
                    executeFast3.bindLong(4, System.currentTimeMillis());
                    executeFast3.step();
                    executeFast3.dispose();
                    gl.c3(new wo6(hq6Var3, str2, (byte) 3));
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                ((hq6) obj3).q2((TLRPC.Message) obj2, (String) obj);
                return;
            case 4:
                rx6 rx6Var = (rx6) obj;
                l93 l93Var = ((vr6) obj3).c;
                w59 f = ((jm5) obj2).f();
                ep epVar = l93Var.d;
                y54 y54Var = l93Var.h;
                y54Var.getClass();
                epVar.b = mm5.q(f);
                if (!f.isEmpty()) {
                    epVar.e = (rx6) f.get(0);
                    rx6Var.getClass();
                    epVar.f = rx6Var;
                }
                if (((rx6) epVar.d) == null) {
                    epVar.d = ep.e(y54Var, (mm5) epVar.b, (rx6) epVar.e, (xnb) epVar.a);
                }
                epVar.q(y54Var.y0());
                return;
            case 5:
                tv6 tv6Var = (tv6) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                fm6 fm6Var = tv6Var.u;
                if (fm6Var != null) {
                    tv6Var.t.p0(fm6Var);
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    tv6Var.h.n0();
                    tv6Var.g.T();
                }
                countDownLatch.countDown();
                return;
            case 6:
                qv6 qv6Var = (qv6) obj3;
                su6 su6Var = (su6) obj2;
                KeyEvent keyEvent = (KeyEvent) obj;
                tv6 tv6Var2 = qv6Var.b;
                if (tv6Var2.h(su6Var)) {
                    tv6Var2.a(keyEvent, false, false);
                } else {
                    lw6 lw6Var = tv6Var2.h;
                    mw6 mw6Var = su6Var.a;
                    mw6Var.getClass();
                    lw6Var.getClass();
                    lw6Var.g0(1, new xv6(lw6Var, (byte) 9), mw6Var, true);
                }
                qv6Var.a = null;
                return;
            case 7:
                tv6 tv6Var3 = (tv6) obj3;
                tu6 tu6Var = (tu6) obj;
                if (tv6Var3.i()) {
                    return;
                }
                tv6Var3.t();
                woe.b(tv6Var3.t, tu6Var);
                return;
            case 8:
                Pair pair = (Pair) obj2;
                ((by6) obj3).b.i.N(((Integer) pair.first).intValue(), (rx6) pair.second, (vi2) obj);
                return;
            case 9:
                Pair pair2 = (Pair) obj2;
                ((by6) obj3).b.i.i(((Integer) pair2.first).intValue(), (rx6) pair2.second, (Exception) obj);
                return;
            case 10:
                kz6 kz6Var = (kz6) obj3;
                String str3 = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                kz6Var.F0 = 0;
                if (str3.equals(kz6Var.E0) && (tLObject2 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                    ArrayList arrayList4 = kz6Var.B0;
                    int size4 = arrayList4 != null ? arrayList4.size() : 0;
                    kz6Var.F("sticker_search_".concat(str3), tL_messages_stickers.stickers);
                    ArrayList arrayList5 = kz6Var.B0;
                    int size5 = arrayList5 != null ? arrayList5.size() : 0;
                    if (!kz6Var.p0 && (arrayList = kz6Var.B0) != null && !arrayList.isEmpty()) {
                        kz6Var.H();
                        kz6Var.W.a(kz6Var.K() > 0);
                        kz6Var.p0 = true;
                    }
                    if (size4 != size5) {
                        kz6Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                kz6 kz6Var2 = (kz6) obj3;
                kz6Var2.q0 = null;
                kz6Var2.W((vf6) obj, (ArrayList) obj2, true);
                return;
            case 12:
                n37 n37Var = (n37) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject3 = (TLObject) obj2;
                wjb wjbVar = n37Var.c;
                TextView textView = n37Var.f;
                TextView textView2 = n37Var.e;
                if (tL_error != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                        textView2.setText(k96.M0(2131747000, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                        n37Var.F = true;
                        textView2.setText(k96.M0(2131747004, null));
                        textView.setText(k96.M0(2131747002, null));
                    } else {
                        textView2.setText(k96.N0("UnknownError"));
                        textView.setVisibility(8);
                        new u21(f11.a(n37Var.getContext()), wjbVar).g0(tL_error, false);
                    }
                } else if (tLObject3 instanceof TLRPC.TL_outboxReadDate) {
                    long j2 = ((TLRPC.TL_outboxReadDate) tLObject3).date * 1000;
                    try {
                        Calendar calendar = Calendar.getInstance();
                        int i14 = calendar.get(6);
                        int i15 = calendar.get(1);
                        calendar.setTimeInMillis(j2);
                        int i16 = calendar.get(6);
                        int i17 = calendar.get(1);
                        str = (i16 == i14 && i15 == i17) ? k96.a0(null, null, 2131747001, k96.D0().o0().format(new Date(j2))) : (i16 + 1 == i14 && i15 == i17) ? k96.a0(null, null, 2131746999, k96.D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? k96.a0(null, null, 2131747003, k96.D0().p0().format(new Date(j2)), k96.D0().o0().format(new Date(j2))) : k96.a0(null, null, 2131747003, k96.D0().B0().format(new Date(j2)), k96.D0().o0().format(new Date(j2)));
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        str = "LOC_ERR";
                    }
                    textView2.setText(str);
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha = n37Var.d.animate().alpha(1.0f);
                s33 s33Var = s33.h;
                ug8.t(alpha, s33Var, 320L);
                n37Var.h.animate().alpha(0.0f).setInterpolator(s33Var).setDuration(320L).start();
                if (!n37Var.F) {
                    n37Var.setBackground(null);
                    n37Var.setOnClickListener(null);
                    return;
                }
                int i18 = bkb.h6;
                ff0 Y = bkb.Y(bkb.v0(i18, wjbVar), 6, 0);
                vkb M = zkb.M(i18);
                n37Var.setBackground(Y);
                zkb.j(n37Var, Y, null, M, wjbVar);
                n37Var.setOnClickListener(new b95(n37Var, (byte) 26));
                return;
            case 13:
                hd[] hdVarArr = (hd[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                d dVar = (d) obj;
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new gn1(zArr, b3));
                    dVar.showDialog(hdVarArr[0]);
                    return;
                }
                return;
            case 14:
                ((na7) obj3).getNotificationCenter().k(kk7.M2, (akb) obj2, (zjb) obj);
                return;
            case 15:
                na7 na7Var2 = (na7) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                vf6 vf6Var3 = na7Var2.R4;
                if (tLObject4 instanceof Vector) {
                    ArrayList<T> arrayList7 = ((Vector) tLObject4).objects;
                    z = false;
                    for (int i19 = 0; i19 < Math.min(arrayList6.size(), arrayList7.size()); i19++) {
                        long longValue = ((Long) arrayList6.get(i19)).longValue();
                        if (arrayList7.get(i19) instanceof TL_account.RequirementToContact) {
                            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) arrayList7.get(i19);
                            if (!l7c.d((TL_account.RequirementToContact) vf6Var3.f(longValue), requirementToContact)) {
                                if (requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty)) {
                                    vf6Var3.l(longValue);
                                } else {
                                    vf6Var3.k(requirementToContact, longValue);
                                }
                                z = true;
                            }
                            TLRPC.UserFull W1 = na7Var2.W1(longValue);
                            if (W1 == null) {
                                ad7 messagesStorage = na7Var2.getMessagesStorage();
                                messagesStorage.a.c(new go6((Object) messagesStorage, longValue, (Object) requirementToContact, (byte) 8));
                            } else if (l7c.a(W1, requirementToContact)) {
                                na7Var2.getMessagesStorage().g2(W1, true);
                            }
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    na7Var2.getNotificationCenter().k(kk7.j3, new Object[0]);
                    return;
                }
                return;
            case 16:
                na7 na7Var3 = (na7) obj3;
                long[] jArr = (long[]) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                int i20 = (int) jArr[1];
                na7Var3.getSendMessagesHelper().c0(i20);
                na7Var3.getSendMessagesHelper().h0(i20, false);
                kk7 notificationCenter = na7Var3.getNotificationCenter();
                Integer valueOf = Integer.valueOf(i20);
                Integer valueOf2 = Integer.valueOf(tL_updateMessageID.id);
                Long valueOf3 = Long.valueOf(jArr[0]);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, null, valueOf3, 0L, -1, bool);
                na7Var3.getNotificationCenter().k(22, Integer.valueOf(i20), Integer.valueOf(tL_updateMessageID.id), null, Long.valueOf(jArr[0]), 0L, -1, bool);
                return;
            case 17:
                na7 na7Var4 = (na7) obj3;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) obj2;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) obj;
                vf6 vf6Var4 = na7Var4.R;
                ArrayList arrayList8 = na7Var4.y;
                if (longSparseIntArray != null) {
                    int i21 = 0;
                    boolean z4 = false;
                    while (i21 < longSparseIntArray.size()) {
                        long keyAt = longSparseIntArray.keyAt(i21);
                        TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var4.f(keyAt);
                        if (dialog == null) {
                            int i22 = i7;
                            while (i22 < arrayList8.size()) {
                                i3 = i6;
                                i4 = i7;
                                if (((TLRPC.Dialog) arrayList8.get(i22)).id == keyAt) {
                                    vf6Var4.k((TLRPC.Dialog) arrayList8.get(i22), keyAt);
                                    dialog = (TLRPC.Dialog) arrayList8.get(i22);
                                    if (dialog != null) {
                                        boolean z5 = w01.a;
                                        na7Var4.b0.put(keyAt, longSparseIntArray.valueAt(i21));
                                    } else {
                                        int i23 = dialog.unread_count;
                                        int valueAt = longSparseIntArray.valueAt(i21);
                                        dialog.unread_count = valueAt;
                                        boolean z6 = w01.a;
                                        if (i23 == 0) {
                                            na7Var = na7Var4;
                                            z4 = z4;
                                            z4 = z4;
                                            if (!dialog.unread_mark && valueAt != 0) {
                                                na7Var.n2(keyAt, 0L, null);
                                                na7Var4 = na7Var;
                                                if (!z4) {
                                                    z4 = na7Var4.j0();
                                                }
                                            }
                                            na7Var4 = na7Var;
                                        } else if (valueAt == 0) {
                                            na7Var = na7Var4;
                                            na7Var.n2(keyAt, 0L, null);
                                            z4 = z4;
                                            if (!z4) {
                                                z4 = na7Var.j0();
                                            }
                                            na7Var4 = na7Var;
                                        }
                                    }
                                    i21++;
                                    i6 = i3;
                                    i7 = i4;
                                    z4 = z4;
                                } else {
                                    i22++;
                                    i6 = i3;
                                    i7 = i4;
                                }
                            }
                        }
                        i3 = i6;
                        i4 = i7;
                        if (dialog != null) {
                        }
                        i21++;
                        i6 = i3;
                        i7 = i4;
                        z4 = z4;
                    }
                    i = i7;
                    z2 = z4;
                } else {
                    i = 0;
                    z2 = 0;
                }
                int i24 = i6;
                if (longSparseIntArray2 != null) {
                    int i25 = i;
                    z2 = z2;
                    while (i25 < longSparseIntArray2.size()) {
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) vf6Var4.f(longSparseIntArray2.keyAt(i25));
                        if (dialog2 != null) {
                            dialog2.unread_mentions_count = longSparseIntArray2.valueAt(i25);
                            if (na7Var4.n0.contains(Long.valueOf(dialog2.id))) {
                                kk7 notificationCenter2 = na7Var4.getNotificationCenter();
                                Long valueOf4 = Long.valueOf(dialog2.id);
                                Integer valueOf5 = Integer.valueOf(dialog2.unread_mentions_count);
                                Object[] objArr = new Object[3];
                                objArr[i] = valueOf4;
                                objArr[i24] = 0L;
                                objArr[2] = valueOf5;
                                notificationCenter2.k(93, objArr);
                            }
                            if (z2 == 0) {
                                int i26 = i;
                                while (true) {
                                    t97[] t97VarArr = na7Var4.N;
                                    if (i26 < t97VarArr.length) {
                                        t97 t97Var = t97VarArr[i26];
                                        if (t97Var == null || (t97Var.g & 32) == 0) {
                                            i26++;
                                        } else {
                                            z2 = i24;
                                        }
                                    }
                                }
                                if (z2 == 0) {
                                    z2 = na7Var4.j0();
                                }
                            }
                        }
                        i25++;
                        z2 = z2;
                    }
                }
                if (z2 != 0) {
                    na7Var4.Z4(null);
                    i2 = i;
                    na7Var4.getNotificationCenter().k(3, new Object[i2]);
                } else {
                    i2 = i;
                }
                kk7 notificationCenter3 = na7Var4.getNotificationCenter();
                Object[] objArr2 = new Object[i24];
                objArr2[i2] = 256;
                notificationCenter3.k(2, objArr2);
                if (longSparseIntArray != null) {
                    na7Var4.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                return;
            case 18:
                ((na7) obj3).getConnectionsManager().sendRequest((TLRPC.TL_channels_editAdmin) obj2, (t77) obj);
                return;
            case 19:
                ((na7) obj3).getConnectionsManager().sendRequest((TLRPC.TL_messages_editChatAdmin) obj2, (wg3) obj);
                return;
            case 20:
                ((na7) obj3).getNotificationsController().K((ArrayList) obj2, !(((TLRPC.updates_Difference) obj) instanceof TLRPC.TL_updates_differenceSlice), false, null);
                return;
            case 21:
                na7 na7Var5 = (na7) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                if (!arrayList9.isEmpty()) {
                    gl.c3(new f57(na7Var5, arrayList9, b2));
                }
                na7Var5.getMessagesStorage().g1(updates_channeldifference.new_messages, true, false, false, na7Var5.getDownloadController().l(), false, 0, 0L);
                return;
            case 22:
                na7 na7Var6 = (na7) obj3;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                chatFull.about = (String) obj;
                na7Var6.getMessagesStorage().K1(chatFull, false);
                kk7 notificationCenter4 = na7Var6.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter4.k(30, chatFull, 0, bool2, bool2);
                return;
            case 23:
                ia7 ia7Var = (ia7) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = ia7Var.c;
                if (tLObject5 instanceof TLRPC.TL_savedMusic) {
                    TLRPC.TL_savedMusic tL_savedMusic = (TLRPC.TL_savedMusic) tLObject5;
                    if (ia7Var.d <= 0 && arrayList11.size() == 1) {
                        if (((k27) arrayList11.get(0)).F0() == null || arrayList10.isEmpty() || ((k27) arrayList10.get(0)).F0() == null || ((k27) arrayList11.get(0)).F0().id != ((k27) arrayList10.get(0)).F0().id) {
                            arrayList11.clear();
                        } else {
                            arrayList10.remove(0);
                        }
                    }
                    ia7Var.d = tL_savedMusic.count;
                    arrayList11.addAll(arrayList10);
                    ia7Var.e = arrayList11.size() >= ia7Var.d;
                }
                ia7Var.f = false;
                kk7.f(ia7Var.a).k(kk7.V3, ia7Var);
                return;
            case 24:
                ad7 ad7Var = (ad7) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                j57 j57Var = (j57) obj;
                ad7Var.getClass();
                int size6 = arrayList12.size();
                while (i7 < size6) {
                    Object obj4 = arrayList12.get(i7);
                    i7++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj4;
                    long n = cf3.n(ephemeralMessage.peer_id);
                    long n2 = cf3.n(ephemeralMessage.from_id);
                    int i27 = ephemeralMessage.anchor_msg_id;
                    s34 s34Var = ad7Var.e0;
                    int i28 = ephemeralMessage.id;
                    vf6 vf6Var5 = (vf6) s34Var.b;
                    SparseIntArray sparseIntArray2 = (SparseIntArray) vf6Var5.f(n);
                    if (sparseIntArray2 == null) {
                        sparseIntArray = new SparseIntArray();
                        vf6Var5.k(sparseIntArray, n);
                    } else {
                        sparseIntArray = sparseIntArray2;
                    }
                    sparseIntArray.put(i27, i28);
                    TLRPC.Message a0 = ad7Var.a0(n, i27);
                    if (a0 != null) {
                        ephemeralMessage.peer_id = a0.peer_id;
                        ephemeralMessage.from_id = a0.from_id;
                        ephemeralMessage.out = a0.out;
                        if (n2 > 0) {
                            ephemeralMessage.via_bot_id = n2;
                        }
                    }
                }
                ad7Var.d1(arrayList12, true);
                j57Var.run();
                return;
            case 25:
                a();
                return;
            case 26:
                b();
                return;
            case 27:
                ad7 ad7Var2 = (ad7) obj3;
                String str4 = (String) obj2;
                String str5 = (String) obj;
                try {
                    if (str4.length() != 0) {
                        SQLiteDatabase sQLiteDatabase = ad7Var2.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str4 + ")").stepThis().dispose();
                    }
                    if (str5.length() != 0) {
                        SQLiteDatabase sQLiteDatabase2 = ad7Var2.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str5 + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    ad7Var2.n(e3, true);
                    return;
                }
            case 28:
                c();
                return;
            default:
                ad7 ad7Var3 = (ad7) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                yn1 yn1Var = (yn1) obj;
                long e4 = ad7Var3.getUserConfig().e();
                int size7 = arrayList13.size();
                while (i5 < size7) {
                    int i29 = i5 + 1;
                    k27 k27Var = (k27) arrayList13.get(i5);
                    if (!k27Var.r1 && !k27.a4(k27Var.k)) {
                        try {
                            sQLiteCursor2 = ad7Var3.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(k27.B0(k27Var.k)), Integer.valueOf(k27Var.e1()));
                            try {
                                try {
                                    if (sQLiteCursor2.next() && (byteBufferValue = sQLiteCursor2.byteBufferValue(0)) != null) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        TLdeserialize.readAttachPath(byteBufferValue, e4);
                                        byteBufferValue.reuse();
                                        k27Var.k.attachPath = TLdeserialize.attachPath;
                                        k27Var.K(true);
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    fa4.g(e, true);
                                    i5 = sQLiteCursor2 == null ? i29 : 0;
                                    sQLiteCursor2.dispose();
                                }
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = sQLiteCursor2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            sQLiteCursor2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = null;
                        }
                        sQLiteCursor2.dispose();
                    }
                }
                gl.c3(yn1Var);
                return;
        }
    }

    public /* synthetic */ lo6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}

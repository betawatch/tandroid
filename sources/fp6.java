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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class fp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fp6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
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
        vh6 vh6Var;
        cf7 cf7Var = (cf7) this.b;
        vh6 vh6Var2 = (vh6) this.c;
        vh6 vh6Var3 = (vh6) this.d;
        SQLiteCursor sQLiteCursor = null;
        try {
            if (vh6Var2 != null) {
                try {
                    int m = vh6Var2.m();
                    for (int i = 0; i < m; i++) {
                        SQLiteDatabase sQLiteDatabase = cf7Var.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) vh6Var2.n(i)) + ") AND uid = " + vh6Var2.j(i) + " AND media = 0").stepThis().dispose();
                    }
                } catch (Exception e2) {
                    e = e2;
                    cf7Var.n(e, true);
                    if (sQLiteCursor == null) {
                        sQLiteCursor.dispose();
                        return;
                    }
                    return;
                }
            }
            if (vh6Var3 != null) {
                int m2 = vh6Var3.m();
                for (int i2 = 0; i2 < m2; i2++) {
                    SQLiteDatabase sQLiteDatabase2 = cf7Var.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) vh6Var3.n(i2)) + ") AND uid = " + vh6Var3.j(i2) + " AND media = 1").stepThis().dispose();
                }
            }
            SQLiteCursor queryFinalized = cf7Var.b.queryFinalized("SELECT mid, date, media, uid FROM enc_tasks_v4 WHERE date = (SELECT min(date) FROM enc_tasks_v4)", new Object[0]);
            int i3 = 0;
            vh6 vh6Var4 = null;
            vh6 vh6Var5 = null;
            while (queryFinalized.next()) {
                try {
                    int intValue = queryFinalized.intValue(0);
                    i3 = queryFinalized.intValue(1);
                    int intValue2 = queryFinalized.intValue(2);
                    long longValue = queryFinalized.longValue(3);
                    if (intValue2 == -1) {
                        if (intValue > 0) {
                            if (vh6Var5 == null) {
                                vh6Var5 = new vh6();
                            }
                            vh6Var = vh6Var5;
                        }
                        if (vh6Var4 == null) {
                            vh6Var4 = new vh6();
                        }
                        vh6Var = vh6Var5;
                        vh6Var5 = vh6Var4;
                    }
                    ArrayList arrayList = (ArrayList) vh6Var5.f(longValue);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        vh6Var5.k(arrayList, longValue);
                    }
                    arrayList.add(Integer.valueOf(intValue));
                    vh6Var5 = vh6Var;
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursor = queryFinalized;
                    cf7Var.n(e, true);
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
            oc7 messagesController = cf7Var.getMessagesController();
            messagesController.getClass();
            Utilities.d.c(new v36((Object) messagesController, (Object) vh6Var4, (Object) vh6Var5, i3, (byte) 11));
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025e  */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        String str;
        boolean z;
        boolean z2;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int currentTime;
        int i3;
        SQLitePreparedStatement executeFast;
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 4;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i4 = 2;
        int i5 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        int i6 = 0;
        switch (b) {
            case 0:
                hs6 hs6Var = (hs6) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ep6 ep6Var = (ep6) obj;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    k47 k47Var = (k47) arrayList2.get(i7);
                    TLRPC.TL_message c0 = hs6Var.getMessagesStorage().c0(k47Var.e1(), k47.B0(k47Var.k));
                    TLRPC.Message message = k47Var.k;
                    message.translatedToLanguage = c0.translatedToLanguage;
                    message.translatedText = c0.translatedText;
                    k47Var.f6(false);
                }
                ep6Var.run();
                return;
            case 1:
                hs6 hs6Var2 = (hs6) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                hs6Var2.R.put(str2, tL_messages_stickerSet);
                hs6Var2.S.k(str2, tL_messages_stickerSet.set.id);
                hs6Var2.getNotificationCenter().k(62, str2);
                return;
            case 2:
                hs6 hs6Var3 = (hs6) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                if (tLObject != null) {
                    boolean z3 = tLObject instanceof TL_account.TL_savedRingtoneConverted;
                    kl9 kl9Var = hs6Var3.A0;
                    if (z3) {
                        kl9Var.a(((TL_account.TL_savedRingtoneConverted) tLObject).document);
                        return;
                    } else {
                        kl9Var.a(document);
                        return;
                    }
                }
                return;
            case 3:
                hs6 hs6Var4 = (hs6) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                bf7 bf7Var = (bf7) obj;
                HashMap hashMap = hs6Var4.A1;
                vh6 vh6Var = hs6Var4.B1;
                vh6 vh6Var2 = hs6Var4.z1;
                if (arrayList3 == null) {
                    if (bf7Var != null) {
                        hashMap.remove(bf7Var);
                        vh6Var2.l(bf7Var.a);
                        hs6Var4.getNotificationCenter().k(70, null, bf7Var);
                        return;
                    }
                    return;
                }
                for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                    int intValue = ((Integer) arrayList3.get(i8)).intValue();
                    long j = intValue;
                    bf7 bf7Var2 = (bf7) vh6Var.f(j);
                    if (bf7Var2 != null) {
                        hashMap.remove(bf7Var2);
                        ArrayList arrayList4 = (ArrayList) vh6Var2.f(bf7Var2.a);
                        if (arrayList4 != null) {
                            int i9 = 0;
                            while (i9 < arrayList4.size()) {
                                TLRPC.Message message2 = (TLRPC.Message) arrayList4.get(i9);
                                if (message2 == null || message2.id == intValue) {
                                    arrayList4.remove(i9);
                                    i9--;
                                }
                                i9++;
                            }
                            if (arrayList4.isEmpty()) {
                                vh6Var2.l(bf7Var2.a);
                            }
                        }
                        vh6Var.l(j);
                        hs6Var4.getNotificationCenter().k(70, null, bf7Var2);
                    }
                }
                return;
            case 4:
                int i10 = 3;
                hs6 hs6Var5 = (hs6) obj3;
                TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) obj2;
                String str3 = (String) obj;
                try {
                    if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                        SQLitePreparedStatement executeFast2 = hs6Var5.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                        SQLitePreparedStatement executeFast3 = hs6Var5.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                        hs6Var5.getMessagesStorage().b.beginTransaction();
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
                                    executeFast2.requery();
                                    executeFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast2.bindString(2, lowerCase);
                                    executeFast2.bindString(i10, tL_emojiKeyword.emoticons.get(i12));
                                    executeFast2.step();
                                    i12++;
                                    i10 = 3;
                                }
                            } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                                TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                                String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                                int size3 = tL_emojiKeywordDeleted.emoticons.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    executeFast3.requery();
                                    executeFast3.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast3.bindString(2, lowerCase2);
                                    executeFast3.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i13));
                                    executeFast3.step();
                                }
                            }
                            i11++;
                            i10 = 3;
                        }
                        hs6Var5.getMessagesStorage().b.commitTransaction();
                        executeFast2.dispose();
                        executeFast3.dispose();
                    }
                    SQLitePreparedStatement executeFast4 = hs6Var5.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
                    executeFast4.bindString(1, str3);
                    executeFast4.bindString(2, tL_emojiKeywordsDifference.lang_code);
                    executeFast4.bindInteger(3, tL_emojiKeywordsDifference.version);
                    executeFast4.bindLong(4, System.currentTimeMillis());
                    executeFast4.step();
                    executeFast4.dispose();
                    gm.c3(new wq6(hs6Var5, str3, (byte) 3));
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 5:
                ((hs6) obj3).q2((TLRPC.Message) obj2, (String) obj);
                return;
            case 6:
                rz6 rz6Var = (rz6) obj;
                xa3 xa3Var = ((wt6) obj3).c;
                y79 f = ((jo5) obj2).f();
                eq eqVar = xa3Var.d;
                h74 h74Var = xa3Var.h;
                h74Var.getClass();
                eqVar.b = mo5.q(f);
                if (!f.isEmpty()) {
                    eqVar.e = (rz6) f.get(0);
                    rz6Var.getClass();
                    eqVar.f = rz6Var;
                }
                if (((rz6) eqVar.d) == null) {
                    eqVar.d = eq.e(h74Var, (mo5) eqVar.b, (rz6) eqVar.e, (ypb) eqVar.a);
                }
                eqVar.q(h74Var.y0());
                return;
            case 7:
                tx6 tx6Var = (tx6) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                go6 go6Var = tx6Var.u;
                if (go6Var != null) {
                    tx6Var.t.p0(go6Var);
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    tx6Var.h.n0();
                    tx6Var.g.T();
                }
                countDownLatch.countDown();
                return;
            case 8:
                qx6 qx6Var = (qx6) obj3;
                sw6 sw6Var = (sw6) obj2;
                KeyEvent keyEvent = (KeyEvent) obj;
                tx6 tx6Var2 = qx6Var.b;
                if (tx6Var2.h(sw6Var)) {
                    tx6Var2.a(keyEvent, false, false);
                } else {
                    ly6 ly6Var = tx6Var2.h;
                    my6 my6Var = sw6Var.a;
                    my6Var.getClass();
                    ly6Var.getClass();
                    ly6Var.g0(1, new xx6(ly6Var, (byte) 9), my6Var, true);
                }
                qx6Var.a = null;
                return;
            case 9:
                tx6 tx6Var3 = (tx6) obj3;
                tw6 tw6Var = (tw6) obj;
                if (tx6Var3.i()) {
                    return;
                }
                tx6Var3.t();
                zqe.b(tx6Var3.t, tw6Var);
                return;
            case 10:
                Pair pair = (Pair) obj2;
                ((b07) obj3).b.i.N(((Integer) pair.first).intValue(), (rz6) pair.second, (jk2) obj);
                return;
            case 11:
                Pair pair2 = (Pair) obj2;
                ((b07) obj3).b.i.i(((Integer) pair2.first).intValue(), (rz6) pair2.second, (Exception) obj);
                return;
            case 12:
                k17 k17Var = (k17) obj3;
                String str4 = (String) obj2;
                TLObject tLObject2 = (TLObject) obj;
                k17Var.F0 = 0;
                if (str4.equals(k17Var.E0) && (tLObject2 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                    ArrayList arrayList5 = k17Var.B0;
                    int size4 = arrayList5 != null ? arrayList5.size() : 0;
                    k17Var.F("sticker_search_".concat(str4), tL_messages_stickers.stickers);
                    ArrayList arrayList6 = k17Var.B0;
                    int size5 = arrayList6 != null ? arrayList6.size() : 0;
                    if (!k17Var.p0 && (arrayList = k17Var.B0) != null && !arrayList.isEmpty()) {
                        k17Var.H();
                        k17Var.W.a(k17Var.K() > 0);
                        k17Var.p0 = true;
                    }
                    if (size4 != size5) {
                        k17Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                k17 k17Var2 = (k17) obj3;
                k17Var2.q0 = null;
                k17Var2.W((vh6) obj, (ArrayList) obj2, true);
                return;
            case 14:
                n57 n57Var = (n57) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ylb ylbVar = n57Var.c;
                TextView textView = n57Var.f;
                TextView textView2 = n57Var.e;
                if (tL_error != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                        textView2.setText(jb6.M0(2131746926, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                        n57Var.F = true;
                        textView2.setText(jb6.M0(2131746930, null));
                        textView.setText(jb6.M0(2131746928, null));
                    } else {
                        textView2.setText(jb6.N0("UnknownError"));
                        textView.setVisibility(8);
                        new c41(n21.a(n57Var.getContext()), ylbVar).g0(tL_error, false);
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
                        str = (i16 == i14 && i15 == i17) ? jb6.a0(null, null, 2131746927, jb6.D0().o0().format(new Date(j2))) : (i16 + 1 == i14 && i15 == i17) ? jb6.a0(null, null, 2131746925, jb6.D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? jb6.a0(null, null, 2131746929, jb6.D0().p0().format(new Date(j2)), jb6.D0().o0().format(new Date(j2))) : jb6.a0(null, null, 2131746929, jb6.D0().B0().format(new Date(j2)), jb6.D0().o0().format(new Date(j2)));
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        str = "LOC_ERR";
                    }
                    textView2.setText(str);
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha = n57Var.d.animate().alpha(1.0f);
                d53 d53Var = d53.h;
                wi8.t(alpha, d53Var, 320L);
                n57Var.h.animate().alpha(0.0f).setInterpolator(d53Var).setDuration(320L).start();
                if (!n57Var.F) {
                    n57Var.setBackground(null);
                    n57Var.setOnClickListener(null);
                    return;
                }
                int i18 = cmb.h6;
                fg0 Y = cmb.Y(cmb.v0(i18, ylbVar), 6, 0);
                wmb M = anb.M(i18);
                n57Var.setBackground(Y);
                anb.j(n57Var, Y, null, M, ylbVar);
                n57Var.setOnClickListener(new ca5(n57Var, (byte) 29));
                return;
            case 15:
                he[] heVarArr = (he[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                d dVar = (d) obj;
                he heVar = heVarArr[0];
                if (heVar != null) {
                    heVar.setOnCancelListener(new wo1(zArr, b3));
                    dVar.showDialog(heVarArr[0]);
                    return;
                }
                return;
            case 16:
                ((oc7) obj3).getNotificationCenter().k(nm7.N2, (bmb) obj2, (amb) obj);
                return;
            case 17:
                oc7 oc7Var = (oc7) obj3;
                long[] jArr = (long[]) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                int i19 = (int) jArr[1];
                oc7Var.getSendMessagesHelper().c0(i19);
                oc7Var.getSendMessagesHelper().h0(i19, false);
                nm7 notificationCenter = oc7Var.getNotificationCenter();
                Integer valueOf = Integer.valueOf(i19);
                Integer valueOf2 = Integer.valueOf(tL_updateMessageID.id);
                Long valueOf3 = Long.valueOf(jArr[0]);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, null, valueOf3, 0L, -1, bool);
                oc7Var.getNotificationCenter().k(22, Integer.valueOf(i19), Integer.valueOf(tL_updateMessageID.id), null, Long.valueOf(jArr[0]), 0L, -1, bool);
                return;
            case 18:
                oc7 oc7Var2 = (oc7) obj3;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList7 = (ArrayList) obj2;
                vh6 vh6Var3 = oc7Var2.T4;
                if (tLObject4 instanceof Vector) {
                    ArrayList<T> arrayList8 = ((Vector) tLObject4).objects;
                    z = false;
                    for (int i20 = 0; i20 < Math.min(arrayList7.size(), arrayList8.size()); i20++) {
                        long longValue = ((Long) arrayList7.get(i20)).longValue();
                        if (arrayList8.get(i20) instanceof TL_account.RequirementToContact) {
                            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) arrayList8.get(i20);
                            if (!m9c.d((TL_account.RequirementToContact) vh6Var3.f(longValue), requirementToContact)) {
                                if (requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty)) {
                                    vh6Var3.l(longValue);
                                } else {
                                    vh6Var3.k(requirementToContact, longValue);
                                }
                                z = true;
                            }
                            TLRPC.UserFull X1 = oc7Var2.X1(longValue);
                            if (X1 == null) {
                                cf7 messagesStorage = oc7Var2.getMessagesStorage();
                                messagesStorage.a.c(new hq6((Object) messagesStorage, longValue, (Object) requirementToContact, (byte) 8));
                            } else if (m9c.a(X1, requirementToContact)) {
                                oc7Var2.getMessagesStorage().g2(X1, true);
                            }
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    oc7Var2.getNotificationCenter().k(nm7.k3, new Object[0]);
                    return;
                }
                return;
            case 19:
                oc7 oc7Var3 = (oc7) obj3;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) obj2;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) obj;
                vh6 vh6Var4 = oc7Var3.R;
                ArrayList arrayList9 = oc7Var3.y;
                if (longSparseIntArray != null) {
                    int i21 = 0;
                    z2 = 0;
                    while (i21 < longSparseIntArray.size()) {
                        long keyAt = longSparseIntArray.keyAt(i21);
                        TLRPC.Dialog dialog = (TLRPC.Dialog) vh6Var4.f(keyAt);
                        if (dialog == null) {
                            int i22 = 0;
                            while (i22 < arrayList9.size()) {
                                i = i4;
                                i2 = i5;
                                if (((TLRPC.Dialog) arrayList9.get(i22)).id == keyAt) {
                                    vh6Var4.k((TLRPC.Dialog) arrayList9.get(i22), keyAt);
                                    dialog = (TLRPC.Dialog) arrayList9.get(i22);
                                    if (dialog != null) {
                                        boolean z4 = e21.a;
                                        oc7Var3.b0.put(keyAt, longSparseIntArray.valueAt(i21));
                                    } else {
                                        int i23 = dialog.unread_count;
                                        int valueAt = longSparseIntArray.valueAt(i21);
                                        dialog.unread_count = valueAt;
                                        boolean z5 = e21.a;
                                        if (i23 != 0) {
                                            if (valueAt == 0) {
                                                oc7Var3.o2(keyAt, 0L, null);
                                                if (z2 == 0) {
                                                    z2 = oc7Var3.j0();
                                                }
                                            }
                                        } else if (!dialog.unread_mark && valueAt != 0) {
                                            oc7Var3.o2(keyAt, 0L, null);
                                            if (z2 == 0) {
                                                z2 = oc7Var3.j0();
                                            }
                                        }
                                    }
                                    i21++;
                                    i4 = i;
                                    i5 = i2;
                                    z2 = z2;
                                } else {
                                    i22++;
                                    i4 = i;
                                    i5 = i2;
                                }
                            }
                        }
                        i = i4;
                        i2 = i5;
                        if (dialog != null) {
                        }
                        i21++;
                        i4 = i;
                        i5 = i2;
                        z2 = z2;
                    }
                } else {
                    z2 = 0;
                }
                int i24 = i4;
                int i25 = i5;
                if (longSparseIntArray2 != null) {
                    int i26 = 0;
                    z2 = z2;
                    while (i26 < longSparseIntArray2.size()) {
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var4.f(longSparseIntArray2.keyAt(i26));
                        if (dialog2 != null) {
                            dialog2.unread_mentions_count = longSparseIntArray2.valueAt(i26);
                            if (oc7Var3.n0.contains(Long.valueOf(dialog2.id))) {
                                nm7 notificationCenter2 = oc7Var3.getNotificationCenter();
                                Long valueOf4 = Long.valueOf(dialog2.id);
                                Integer valueOf5 = Integer.valueOf(dialog2.unread_mentions_count);
                                Object[] objArr = new Object[3];
                                objArr[0] = valueOf4;
                                objArr[i25] = 0L;
                                objArr[i24] = valueOf5;
                                notificationCenter2.k(94, objArr);
                            }
                            if (z2 == 0) {
                                int i27 = 0;
                                while (true) {
                                    ub7[] ub7VarArr = oc7Var3.N;
                                    if (i27 < ub7VarArr.length) {
                                        ub7 ub7Var = ub7VarArr[i27];
                                        if (ub7Var == null || (ub7Var.g & 32) == 0) {
                                            i27++;
                                        } else {
                                            z2 = i25;
                                        }
                                    }
                                }
                                if (z2 == 0) {
                                    z2 = oc7Var3.j0();
                                }
                            }
                        }
                        i26++;
                        z2 = z2;
                    }
                }
                if (z2 != 0) {
                    oc7Var3.b5(null);
                    oc7Var3.getNotificationCenter().k(3, new Object[0]);
                }
                nm7 notificationCenter3 = oc7Var3.getNotificationCenter();
                Object[] objArr2 = new Object[i25];
                objArr2[0] = 256;
                notificationCenter3.k(i24, objArr2);
                if (longSparseIntArray != null) {
                    oc7Var3.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                return;
            case 20:
                oc7 oc7Var4 = (oc7) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                oc7Var4.d4(updates.users, false);
                oc7Var4.X3(updates.chats, false);
                ((Runnable) obj).run();
                return;
            case 21:
                ((oc7) obj3).getConnectionsManager().sendRequest((TLRPC.TL_channels_editAdmin) obj2, (u97) obj);
                return;
            case 22:
                ((oc7) obj3).getConnectionsManager().sendRequest((TLRPC.TL_messages_editChatAdmin) obj2, (ii3) obj);
                return;
            case 23:
                oc7 oc7Var5 = (oc7) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                if (!arrayList10.isEmpty()) {
                    gm.c3(new h77(oc7Var5, arrayList10, b2));
                }
                oc7Var5.getMessagesStorage().g1(updates_channeldifference.new_messages, true, false, false, oc7Var5.getDownloadController().l(), false, 0, 0L);
                return;
            case 24:
                ((oc7) obj3).getNotificationsController().K((ArrayList) obj2, !(((TLRPC.updates_Difference) obj) instanceof TLRPC.TL_updates_differenceSlice), false, null);
                return;
            case 25:
                oc7 oc7Var6 = (oc7) obj3;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                chatFull.about = (String) obj;
                oc7Var6.getMessagesStorage().K1(chatFull, false);
                nm7 notificationCenter4 = oc7Var6.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter4.k(31, chatFull, 0, bool2, bool2);
                return;
            case 26:
                jc7 jc7Var = (jc7) obj3;
                TLObject tLObject5 = (TLObject) obj;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = jc7Var.c;
                if (tLObject5 instanceof TLRPC.TL_savedMusic) {
                    TLRPC.TL_savedMusic tL_savedMusic = (TLRPC.TL_savedMusic) tLObject5;
                    if (jc7Var.d <= 0 && arrayList12.size() == 1) {
                        if (((k47) arrayList12.get(0)).F0() == null || arrayList11.isEmpty() || ((k47) arrayList11.get(0)).F0() == null || ((k47) arrayList12.get(0)).F0().id != ((k47) arrayList11.get(0)).F0().id) {
                            arrayList12.clear();
                        } else {
                            arrayList11.remove(0);
                        }
                    }
                    jc7Var.d = tL_savedMusic.count;
                    arrayList12.addAll(arrayList11);
                    jc7Var.e = arrayList12.size() >= jc7Var.d;
                }
                jc7Var.f = false;
                nm7.f(jc7Var.a).k(nm7.W3, jc7Var);
                return;
            case 27:
                cf7 cf7Var = (cf7) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                j77 j77Var = (j77) obj;
                cf7Var.getClass();
                int size6 = arrayList13.size();
                while (i6 < size6) {
                    Object obj4 = arrayList13.get(i6);
                    i6++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj4;
                    long n = pg3.n(ephemeralMessage.peer_id);
                    long n2 = pg3.n(ephemeralMessage.from_id);
                    int i28 = ephemeralMessage.anchor_msg_id;
                    sz4 sz4Var = cf7Var.e0;
                    int i29 = ephemeralMessage.id;
                    vh6 vh6Var5 = (vh6) sz4Var.a;
                    SparseIntArray sparseIntArray2 = (SparseIntArray) vh6Var5.f(n);
                    if (sparseIntArray2 == null) {
                        sparseIntArray = new SparseIntArray();
                        vh6Var5.k(sparseIntArray, n);
                    } else {
                        sparseIntArray = sparseIntArray2;
                    }
                    sparseIntArray.put(i28, i29);
                    TLRPC.Message a0 = cf7Var.a0(n, i28);
                    if (a0 != null) {
                        ephemeralMessage.peer_id = a0.peer_id;
                        ephemeralMessage.from_id = a0.from_id;
                        ephemeralMessage.out = a0.out;
                        if (n2 > 0) {
                            ephemeralMessage.via_bot_id = n2;
                        }
                    }
                }
                cf7Var.d1(arrayList13, true);
                j77Var.run();
                return;
            case 28:
                a();
                return;
            default:
                cf7 cf7Var2 = (cf7) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str5 = (String) obj;
                try {
                    try {
                        currentTime = cf7Var2.getConnectionsManager().getCurrentTime();
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!(tLObject6 instanceof TLRPC.TL_messages_botCallbackAnswer)) {
                        if (tLObject6 instanceof TLRPC.TL_messages_botResults) {
                            i3 = ((TLRPC.TL_messages_botResults) tLObject6).cache_time;
                        }
                        executeFast = cf7Var2.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject6.getObjectSize());
                        tLObject6.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str5);
                        executeFast.bindInteger(2, currentTime);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                        return;
                    }
                    i3 = ((TLRPC.TL_messages_botCallbackAnswer) tLObject6).cache_time;
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(nativeByteBuffer2);
                    executeFast.bindString(1, str5);
                    executeFast.bindInteger(2, currentTime);
                    executeFast.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer2.reuse();
                    return;
                } catch (Exception e4) {
                    e = e4;
                    sQLitePreparedStatement = executeFast;
                    cf7Var2.n(e, true);
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
                currentTime += i3;
                executeFast = cf7Var2.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
        }
    }

    public /* synthetic */ fp6(Object obj, TLObject tLObject, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = obj;
        this.d = tLObject;
        this.c = arrayList;
    }
}

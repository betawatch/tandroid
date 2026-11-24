// default package

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i41 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ i41(ad7 ad7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement executeFast;
        SQLiteCursor queryFinalized;
        TLRPC.PhotoSize w;
        k27 k27Var;
        boolean z;
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r7 = null;
        r7 = null;
        SQLiteCursor sQLiteCursor = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        int i = 0;
        ad7 ad7Var = this.b;
        ArrayList arrayList = this.c;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                        sQLiteDatabase3.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement2 = sQLiteDatabase3.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        while (i < arrayList.size()) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement2.bindInteger(2, i);
                            sQLitePreparedStatement2.step();
                            i++;
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th;
                }
            case 1:
                try {
                    SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 2:
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Pair pair = (Pair) obj;
                    ad7Var.getMessagesController().p4(((Integer) pair.second).intValue(), ((Long) pair.first).longValue(), false);
                }
                return;
            case 3:
                if (ad7Var.getMessagesController().D1().p(arrayList)) {
                    ad7Var.getMessagesController().D1().k();
                    return;
                }
                return;
            case 4:
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ad7Var.getMessagesController().s3((k27) obj2);
                }
                return;
            case 5:
                ad7 ad7Var2 = this.b;
                try {
                    try {
                        String join = TextUtils.join(",", arrayList);
                        SQLiteDatabase sQLiteDatabase5 = ad7Var2.b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase5.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id IN(" + join + ")", new Object[0]);
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    vf6 vf6Var = new vf6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(1);
                        ArrayList arrayList2 = (ArrayList) vf6Var.f(longValue);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            vf6Var.k(arrayList2, longValue);
                        }
                        arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                    }
                    queryFinalized.dispose();
                    if (vf6Var.i()) {
                        return;
                    }
                    int m = vf6Var.m();
                    while (i < m) {
                        long j = vf6Var.j(i);
                        ArrayList arrayList3 = (ArrayList) vf6Var.n(i);
                        gl.d3(new i41(ad7Var2, arrayList3, (byte) 12));
                        ad7Var2.R1(arrayList3, null, null, null, null);
                        ad7 ad7Var3 = ad7Var2;
                        try {
                            ad7Var3.N0(0, 0, j, arrayList3, true);
                            ad7Var3.P1(j, 0L, arrayList3, null);
                            ad7Var2 = ad7Var3;
                            i++;
                        } catch (Exception e4) {
                            e = e4;
                            ad7Var2 = ad7Var3;
                            ad7Var2.n(e, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Exception e5) {
                    e = e5;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            case 6:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 7:
                if (ad7Var.getMessagesController().D1().p(arrayList)) {
                    ad7Var.getMessagesController().D1().k();
                    return;
                }
                return;
            case 8:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 9:
                HashSet hashSet = new HashSet();
                vf6 vf6Var2 = new vf6();
                vf6 vf6Var3 = new vf6();
                int i3 = 0;
                boolean z2 = false;
                while (i3 < arrayList.size()) {
                    xc7 xc7Var = (xc7) arrayList.get(i3);
                    TLRPC.TL_messageReactions tL_messageReactions = xc7Var.b;
                    long j2 = xc7Var.a;
                    TLRPC.TL_messageReactions tL_messageReactions2 = xc7Var.c;
                    vf6Var2.b();
                    vf6Var3.b();
                    if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                        int i4 = 0;
                        while (i4 < tL_messageReactions.results.size()) {
                            h19 d = h19.d(tL_messageReactions.results.get(i4).reaction);
                            vf6Var2.k(d, d.h);
                            i4++;
                            ad7Var = ad7Var;
                        }
                    }
                    ad7 ad7Var4 = ad7Var;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i5 = 0; i5 < tL_messageReactions2.results.size(); i5++) {
                            h19 d2 = h19.d(tL_messageReactions2.results.get(i5).reaction);
                            vf6Var3.k(d2, d2.h);
                        }
                    }
                    for (int i6 = 0; i6 < vf6Var2.m(); i6++) {
                        long j3 = vf6Var2.j(i6);
                        h19 h19Var = (h19) vf6Var2.n(i6);
                        if (!vf6Var3.d(j3) && ad7Var4.getMessagesController().x5(j2, h19Var, false)) {
                            hashSet.add(Long.valueOf(j2));
                            z2 = true;
                        }
                    }
                    for (int i7 = 0; i7 < vf6Var3.m(); i7++) {
                        long j4 = vf6Var3.j(i7);
                        h19 h19Var2 = (h19) vf6Var3.n(i7);
                        if (!vf6Var2.d(j4) && ad7Var4.getMessagesController().x5(j2, h19Var2, true)) {
                            hashSet.add(Long.valueOf(j2));
                            z2 = true;
                        }
                    }
                    i3++;
                    ad7Var = ad7Var4;
                }
                ad7 ad7Var5 = ad7Var;
                if (!z2 || hashSet.isEmpty()) {
                    return;
                }
                ad7Var5.getMessagesController().w5(hashSet);
                return;
            case 10:
                ArrayList arrayList4 = ad7Var.I;
                arrayList4.clear();
                SparseArray sparseArray = ad7Var.J;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i < arrayList.size()) {
                    ((t97) arrayList.get(i)).f = i;
                    sparseArray.put(((t97) arrayList.get(i)).a, (t97) arrayList.get(i));
                    i++;
                }
                ad7Var.w1();
                return;
            case 11:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 12:
                ad7Var.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 13:
                ad7Var.getNotificationCenter().k(58, arrayList);
                return;
            case 14:
                up3 downloadController = ad7Var.getDownloadController();
                downloadController.getClass();
                int size3 = arrayList.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    vp3 vp3Var = (vp3) downloadController.h.get((Pair) arrayList.get(i8));
                    if (vp3Var != null) {
                        TLObject tLObject = vp3Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            downloadController.getFileLoader().f((TLRPC.Document) tLObject);
                        } else if ((tLObject instanceof TLRPC.Photo) && (w = ba4.w(((TLRPC.Photo) tLObject).sizes, gl.Y0(false), false, null, false)) != null) {
                            ba4 fileLoader = downloadController.getFileLoader();
                            fileLoader.getClass();
                            fileLoader.e(null, null, null, w.location, null, null);
                        }
                    }
                }
                return;
            case 15:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 16:
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i9 = 0;
                boolean z3 = false;
                while (i9 < arrayList.size()) {
                    hq6 mediaDataController = ad7Var.getMediaDataController();
                    int intValue = ((Integer) arrayList.get(i9)).intValue();
                    ArrayList arrayList5 = mediaDataController.d1;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList5.size()) {
                            k27Var = null;
                        } else if (((k27) arrayList5.get(i10)).e1() == intValue) {
                            k27Var = (k27) arrayList5.get(i10);
                        } else {
                            i10++;
                        }
                    }
                    if (k27Var == null || k27.B0(k27Var.k) != mediaDataController.getUserConfig().e()) {
                        z = false;
                    } else {
                        z = mediaDataController.getMessagesController().I3(k27Var.k);
                        jArr[0] = k27.Q1(mediaDataController.getUserConfig().e(), k27Var.k);
                    }
                    arrayList5.remove(k27Var);
                    if (z) {
                        hashSet2.add(Long.valueOf(jArr[0]));
                        z3 = true;
                    }
                    i9++;
                    z3 = z3;
                }
                if (z3) {
                    ad7Var.getMessagesController().w5(hashSet2);
                    return;
                }
                return;
            case 17:
                if (ad7Var.getMessagesController().D1().p(arrayList)) {
                    ad7Var.getMessagesController().D1().k();
                    return;
                }
                return;
            case 18:
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ad7Var.getNotificationCenter().k(48, arrayList.get(i11));
                }
                return;
            case 19:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 20:
                try {
                    try {
                        ad7Var.b.beginTransaction();
                        try {
                            executeFast = ad7Var.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e6) {
                            e = e6;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    int size4 = arrayList.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                        executeFast.requery();
                        int i13 = message.stickerVerified;
                        executeFast.bindInteger(1, i13 == 0 ? 1 : i13 == 2 ? 2 : 0);
                        executeFast.bindInteger(2, message.id);
                        executeFast.bindLong(3, k27.B0(message));
                        executeFast.step();
                    }
                    executeFast.dispose();
                    ad7Var.b.commitTransaction();
                    return;
                } catch (Exception e8) {
                    e = e8;
                    sQLitePreparedStatement = executeFast;
                    i = 1;
                    ad7Var.n(e, true);
                    if (i != 0 && (sQLiteDatabase2 = ad7Var.b) != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement = executeFast;
                    i = 1;
                    if (i != 0 && (sQLiteDatabase = ad7Var.b) != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 21:
                ad7Var.getMessagesController().U3(arrayList, true);
                return;
            case 22:
                ad7Var.getMessagesController().a4(arrayList, true);
                return;
            case 23:
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    ad7Var.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    ad7Var.n(e9, true);
                    return;
                }
            default:
                try {
                    ad7Var.b.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    fa4.g(e10, true);
                    return;
                }
        }
    }
}

package org.telegram.messenger;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class jp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ jp(qr qrVar, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = qrVar;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        qr qrVar;
        String join;
        SQLiteDatabase sQLiteDatabase;
        TLRPC.PhotoSize w10;
        zi ziVar;
        boolean z10;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3;
        SQLitePreparedStatement executeFast;
        int i3 = this.a;
        int i10 = 7;
        SQLiteCursor sQLiteCursor = null;
        r7 = null;
        r7 = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLiteCursor = null;
        sQLiteCursor = null;
        SQLiteCursor sQLiteCursor2 = null;
        int i11 = 0;
        qr qrVar2 = this.b;
        ArrayList arrayList = this.c;
        switch (i3) {
            case 0:
                qrVar2.getClass();
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    qrVar2.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    qrVar2.o(e10, true);
                    return;
                }
            case 1:
                qr.a(qrVar2, arrayList);
                return;
            case 2:
                if (qrVar2.getMessagesController().G1().q(arrayList)) {
                    qrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            case 3:
                qr qrVar3 = this.b;
                try {
                    try {
                        join = TextUtils.join(",", arrayList);
                        sQLiteDatabase = qrVar3.b;
                        Locale locale = Locale.US;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id IN(" + join + ")", new Object[0]);
                        try {
                            try {
                                a0.h hVar = new a0.h();
                                while (queryFinalized.next()) {
                                    try {
                                        long longValue = queryFinalized.longValue(1);
                                        ArrayList arrayList2 = (ArrayList) hVar.f(longValue);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            hVar.k(arrayList2, longValue);
                                        }
                                        arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteCursor = queryFinalized;
                                        qrVar = qrVar3;
                                        qrVar.o(e, true);
                                        if (sQLiteCursor == null) {
                                        }
                                    }
                                }
                                queryFinalized.dispose();
                                if (hVar.i()) {
                                    return;
                                }
                                int m10 = hVar.m();
                                while (i11 < m10) {
                                    long j10 = hVar.j(i11);
                                    ArrayList arrayList3 = (ArrayList) hVar.n(i11);
                                    g0.h3(new jp(qrVar3, arrayList3, i10));
                                    qr qrVar4 = qrVar3;
                                    try {
                                        qrVar4.U1(arrayList3, null, null, null, null);
                                        qrVar4.Q0(0, 0, j10, arrayList3, true);
                                        qrVar4.S1(j10, 0L, arrayList3, null);
                                        i11++;
                                        qrVar3 = qrVar4;
                                    } catch (Exception e12) {
                                        e = e12;
                                        qrVar = qrVar4;
                                        qrVar.o(e, true);
                                        if (sQLiteCursor == null) {
                                            sQLiteCursor.dispose();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                qrVar = qrVar3;
                                sQLiteCursor = queryFinalized;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor2 = queryFinalized;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
            case 4:
                qrVar2.getFileLoader().g(arrayList);
                return;
            case 5:
                HashSet hashSet = new HashSet();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h();
                int i12 = 0;
                boolean z11 = false;
                while (i12 < arrayList.size()) {
                    nr nrVar = (nr) arrayList.get(i12);
                    TLRPC.TL_messageReactions tL_messageReactions = nrVar.b;
                    long j11 = nrVar.a;
                    TLRPC.TL_messageReactions tL_messageReactions2 = nrVar.c;
                    hVar2.b();
                    hVar3.b();
                    if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                        int i13 = 0;
                        while (i13 < tL_messageReactions.results.size()) {
                            dh.n0 d = dh.n0.d(tL_messageReactions.results.get(i13).reaction);
                            hVar2.k(d, d.h);
                            i13++;
                            qrVar2 = qrVar2;
                        }
                    }
                    qr qrVar5 = qrVar2;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i14 = 0; i14 < tL_messageReactions2.results.size(); i14++) {
                            dh.n0 d10 = dh.n0.d(tL_messageReactions2.results.get(i14).reaction);
                            hVar3.k(d10, d10.h);
                        }
                    }
                    for (int i15 = 0; i15 < hVar2.m(); i15++) {
                        long j12 = hVar2.j(i15);
                        dh.n0 n0Var = (dh.n0) hVar2.n(i15);
                        if (!hVar3.d(j12) && qrVar5.getMessagesController().s5(j11, n0Var, false)) {
                            hashSet.add(Long.valueOf(j11));
                            z11 = true;
                        }
                    }
                    for (int i16 = 0; i16 < hVar3.m(); i16++) {
                        long j13 = hVar3.j(i16);
                        dh.n0 n0Var2 = (dh.n0) hVar3.n(i16);
                        if (!hVar2.d(j13) && qrVar5.getMessagesController().s5(j11, n0Var2, true)) {
                            hashSet.add(Long.valueOf(j11));
                            z11 = true;
                        }
                    }
                    i12++;
                    qrVar2 = qrVar5;
                }
                qr qrVar6 = qrVar2;
                if (!z11 || hashSet.isEmpty()) {
                    return;
                }
                qrVar6.getMessagesController().r5(hashSet);
                return;
            case 6:
                qrVar2.getMessagesController().S3(arrayList, true);
                return;
            case 7:
                qrVar2.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 8:
                ArrayList arrayList4 = qrVar2.I;
                arrayList4.clear();
                SparseArray sparseArray = qrVar2.J;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i11 < arrayList.size()) {
                    ((mo) arrayList.get(i11)).f = i11;
                    sparseArray.put(((mo) arrayList.get(i11)).a, (mo) arrayList.get(i11));
                    i11++;
                }
                qrVar2.z1();
                return;
            case 9:
                qrVar2.getFileLoader().g(arrayList);
                return;
            case 10:
                z5 downloadController = qrVar2.getDownloadController();
                downloadController.getClass();
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    a6 a6Var = (a6) downloadController.h.get((Pair) arrayList.get(i17));
                    if (a6Var != null) {
                        TLObject tLObject = a6Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            downloadController.getFileLoader().f((TLRPC.Document) tLObject);
                        } else if ((tLObject instanceof TLRPC.Photo) && (w10 = w7.w(((TLRPC.Photo) tLObject).sizes, g0.Z0(false), false, null, false)) != null) {
                            w7 fileLoader = downloadController.getFileLoader();
                            fileLoader.getClass();
                            fileLoader.e(null, null, null, w10.location, null, null);
                        }
                    }
                }
                return;
            case 11:
                qrVar2.getNotificationCenter().k(58, arrayList);
                return;
            case 12:
                qrVar2.getFileLoader().g(arrayList);
                return;
            case 13:
                qrVar2.getClass();
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i18 = 0;
                boolean z12 = false;
                while (i18 < arrayList.size()) {
                    li mediaDataController = qrVar2.getMediaDataController();
                    int intValue = ((Integer) arrayList.get(i18)).intValue();
                    ArrayList arrayList5 = mediaDataController.d1;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= arrayList5.size()) {
                            ziVar = null;
                        } else if (((zi) arrayList5.get(i19)).f1() == intValue) {
                            ziVar = (zi) arrayList5.get(i19);
                        } else {
                            i19++;
                        }
                    }
                    if (ziVar == null || zi.B0(ziVar.k) != mediaDataController.getUserConfig().e()) {
                        z10 = false;
                    } else {
                        z10 = mediaDataController.getMessagesController().G3(ziVar.k);
                        jArr[0] = zi.R1(mediaDataController.getUserConfig().e(), ziVar.k);
                    }
                    arrayList5.remove(ziVar);
                    if (z10) {
                        hashSet2.add(Long.valueOf(jArr[0]));
                        z12 = true;
                    }
                    i18++;
                    z12 = z12;
                }
                if (z12) {
                    qrVar2.getMessagesController().r5(hashSet2);
                    return;
                }
                return;
            case 14:
                if (qrVar2.getMessagesController().G1().q(arrayList)) {
                    qrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            case 15:
                qrVar2.getClass();
                try {
                    try {
                        qrVar2.b.beginTransaction();
                        try {
                            executeFast = qrVar2.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e16) {
                            e = e16;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e17) {
                        e = e17;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    int size2 = arrayList.size();
                    for (int i20 = 0; i20 < size2; i20++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i20);
                        executeFast.requery();
                        int i21 = message.stickerVerified;
                        executeFast.bindInteger(1, i21 == 0 ? 1 : i21 == 2 ? 2 : 0);
                        executeFast.bindInteger(2, message.id);
                        executeFast.bindLong(3, zi.B0(message));
                        executeFast.step();
                    }
                    executeFast.dispose();
                    qrVar2.b.commitTransaction();
                    return;
                } catch (Exception e18) {
                    e = e18;
                    sQLitePreparedStatement = executeFast;
                    i11 = 1;
                    qrVar2.o(e, true);
                    if (i11 != 0 && (sQLiteDatabase3 = qrVar2.b) != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement = executeFast;
                    i11 = 1;
                    if (i11 != 0 && (sQLiteDatabase2 = qrVar2.b) != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 16:
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    qrVar2.getNotificationCenter().k(48, arrayList.get(i22));
                }
                return;
            case 17:
                qrVar2.getFileLoader().g(arrayList);
                return;
            case 18:
                qrVar2.getFileLoader().g(arrayList);
                return;
            case 19:
                if (qrVar2.getMessagesController().G1().q(arrayList)) {
                    qrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            default:
                qrVar2.getClass();
                int size3 = arrayList.size();
                while (i11 < size3) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    qrVar2.getMessagesController().r3((zi) obj);
                }
                return;
        }
    }
}

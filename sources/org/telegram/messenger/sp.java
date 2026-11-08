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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ sp(yr yrVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = yrVar;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        yr yrVar;
        String join;
        SQLiteDatabase sQLiteDatabase;
        TLRPC.PhotoSize w10;
        ij ijVar;
        boolean z9;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3;
        SQLitePreparedStatement executeFast;
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        r6 = null;
        r6 = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLiteCursor = null;
        sQLiteCursor = null;
        SQLiteCursor sQLiteCursor2 = null;
        int i10 = 0;
        yr yrVar2 = this.b;
        ArrayList arrayList = this.c;
        switch (i7) {
            case 0:
                yrVar2.getClass();
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    yrVar2.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    yrVar2.o(e10, true);
                    return;
                }
            case 1:
                yr.a(yrVar2, arrayList);
                return;
            case 2:
                if (yrVar2.getMessagesController().G1().q(arrayList)) {
                    yrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            case 3:
                yr yrVar3 = this.b;
                try {
                    try {
                        join = TextUtils.join(",", arrayList);
                        sQLiteDatabase = yrVar3.b;
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
                                        yrVar = yrVar3;
                                        yrVar.o(e, true);
                                        if (sQLiteCursor == null) {
                                        }
                                    }
                                }
                                queryFinalized.dispose();
                                if (hVar.i()) {
                                    return;
                                }
                                int m10 = hVar.m();
                                while (i10 < m10) {
                                    long j3 = hVar.j(i10);
                                    ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                                    g0.h3(new sp(yrVar3, arrayList3, 8));
                                    yr yrVar4 = yrVar3;
                                    try {
                                        yrVar4.U1(arrayList3, null, null, null, null);
                                        yrVar4.Q0(0, 0, j3, arrayList3, true);
                                        yrVar4.S1(j3, 0L, arrayList3, null);
                                        i10++;
                                        yrVar3 = yrVar4;
                                    } catch (Exception e12) {
                                        e = e12;
                                        yrVar = yrVar4;
                                        yrVar.o(e, true);
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
                                yrVar = yrVar3;
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
                yrVar2.getFileLoader().g(arrayList);
                return;
            case 5:
                HashSet hashSet = new HashSet();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h();
                int i11 = 0;
                boolean z10 = false;
                while (i11 < arrayList.size()) {
                    vr vrVar = (vr) arrayList.get(i11);
                    TLRPC.TL_messageReactions tL_messageReactions = vrVar.b;
                    long j10 = vrVar.a;
                    TLRPC.TL_messageReactions tL_messageReactions2 = vrVar.c;
                    hVar2.b();
                    hVar3.b();
                    if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                        int i12 = 0;
                        while (i12 < tL_messageReactions.results.size()) {
                            ch.o0 d = ch.o0.d(tL_messageReactions.results.get(i12).reaction);
                            hVar2.k(d, d.h);
                            i12++;
                            yrVar2 = yrVar2;
                        }
                    }
                    yr yrVar5 = yrVar2;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i13 = 0; i13 < tL_messageReactions2.results.size(); i13++) {
                            ch.o0 d2 = ch.o0.d(tL_messageReactions2.results.get(i13).reaction);
                            hVar3.k(d2, d2.h);
                        }
                    }
                    for (int i14 = 0; i14 < hVar2.m(); i14++) {
                        long j11 = hVar2.j(i14);
                        ch.o0 o0Var = (ch.o0) hVar2.n(i14);
                        if (!hVar3.d(j11) && yrVar5.getMessagesController().s5(j10, o0Var, false)) {
                            hashSet.add(Long.valueOf(j10));
                            z10 = true;
                        }
                    }
                    for (int i15 = 0; i15 < hVar3.m(); i15++) {
                        long j12 = hVar3.j(i15);
                        ch.o0 o0Var2 = (ch.o0) hVar3.n(i15);
                        if (!hVar2.d(j12) && yrVar5.getMessagesController().s5(j10, o0Var2, true)) {
                            hashSet.add(Long.valueOf(j10));
                            z10 = true;
                        }
                    }
                    i11++;
                    yrVar2 = yrVar5;
                }
                yr yrVar6 = yrVar2;
                if (!z10 || hashSet.isEmpty()) {
                    return;
                }
                yrVar6.getMessagesController().r5(hashSet);
                return;
            case 6:
                yrVar2.getMessagesController().S3(arrayList, true);
                return;
            case 7:
                ArrayList arrayList4 = yrVar2.H;
                arrayList4.clear();
                SparseArray sparseArray = yrVar2.I;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i10 < arrayList.size()) {
                    ((vo) arrayList.get(i10)).f = i10;
                    sparseArray.put(((vo) arrayList.get(i10)).a, (vo) arrayList.get(i10));
                    i10++;
                }
                yrVar2.z1();
                return;
            case 8:
                yrVar2.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 9:
                yrVar2.getFileLoader().g(arrayList);
                return;
            case 10:
                z5 downloadController = yrVar2.getDownloadController();
                downloadController.getClass();
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    a6 a6Var = (a6) downloadController.h.get((Pair) arrayList.get(i16));
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
                yrVar2.getNotificationCenter().k(58, arrayList);
                return;
            case 12:
                yrVar2.getFileLoader().g(arrayList);
                return;
            case 13:
                yrVar2.getClass();
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i17 = 0;
                boolean z11 = false;
                while (i17 < arrayList.size()) {
                    ui mediaDataController = yrVar2.getMediaDataController();
                    int intValue = ((Integer) arrayList.get(i17)).intValue();
                    ArrayList arrayList5 = mediaDataController.c1;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList5.size()) {
                            ijVar = null;
                        } else if (((ij) arrayList5.get(i18)).f1() == intValue) {
                            ijVar = (ij) arrayList5.get(i18);
                        } else {
                            i18++;
                        }
                    }
                    if (ijVar == null || ij.B0(ijVar.k) != mediaDataController.getUserConfig().e()) {
                        z9 = false;
                    } else {
                        z9 = mediaDataController.getMessagesController().G3(ijVar.k);
                        jArr[0] = ij.R1(mediaDataController.getUserConfig().e(), ijVar.k);
                    }
                    arrayList5.remove(ijVar);
                    if (z9) {
                        hashSet2.add(Long.valueOf(jArr[0]));
                        z11 = true;
                    }
                    i17++;
                    z11 = z11;
                }
                if (z11) {
                    yrVar2.getMessagesController().r5(hashSet2);
                    return;
                }
                return;
            case 14:
                if (yrVar2.getMessagesController().G1().q(arrayList)) {
                    yrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            case 15:
                yrVar2.getClass();
                try {
                    try {
                        yrVar2.b.beginTransaction();
                        try {
                            executeFast = yrVar2.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
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
                    for (int i19 = 0; i19 < size2; i19++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i19);
                        executeFast.requery();
                        int i20 = message.stickerVerified;
                        executeFast.bindInteger(1, i20 == 0 ? 1 : i20 == 2 ? 2 : 0);
                        executeFast.bindInteger(2, message.id);
                        executeFast.bindLong(3, ij.B0(message));
                        executeFast.step();
                    }
                    executeFast.dispose();
                    yrVar2.b.commitTransaction();
                    return;
                } catch (Exception e18) {
                    e = e18;
                    sQLitePreparedStatement = executeFast;
                    i10 = 1;
                    yrVar2.o(e, true);
                    if (i10 != 0 && (sQLiteDatabase3 = yrVar2.b) != null) {
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
                    i10 = 1;
                    if (i10 != 0 && (sQLiteDatabase2 = yrVar2.b) != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 16:
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    yrVar2.getNotificationCenter().k(48, arrayList.get(i21));
                }
                return;
            case 17:
                yrVar2.getFileLoader().g(arrayList);
                return;
            case 18:
                yrVar2.getFileLoader().g(arrayList);
                return;
            case 19:
                if (yrVar2.getMessagesController().G1().q(arrayList)) {
                    yrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            default:
                yrVar2.getClass();
                int size3 = arrayList.size();
                while (i10 < size3) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    yrVar2.getMessagesController().r3((ij) obj);
                }
                return;
        }
    }
}

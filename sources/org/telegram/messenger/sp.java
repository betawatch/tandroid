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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ sp(vr vrVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        TLRPC.PhotoSize w10;
        gj gjVar;
        boolean z10;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        r6 = null;
        r6 = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLiteCursor = null;
        sQLiteCursor = null;
        int i10 = 0;
        vr vrVar = this.b;
        ArrayList arrayList = this.c;
        switch (i7) {
            case 0:
                vr.a(vrVar, arrayList);
                return;
            case 1:
                if (vrVar.getMessagesController().G1().q(arrayList)) {
                    vrVar.getMessagesController().G1().l();
                    return;
                }
                return;
            case 2:
                vr vrVar2 = this.b;
                try {
                    try {
                        String join = TextUtils.join(",", arrayList);
                        SQLiteDatabase sQLiteDatabase3 = vrVar2.b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase3.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id IN(" + join + ")", new Object[0]);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        a0.h hVar = new a0.h();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(1);
                            ArrayList arrayList2 = (ArrayList) hVar.f(longValue);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hVar.k(arrayList2, longValue);
                            }
                            arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                        }
                        queryFinalized.dispose();
                        if (hVar.i()) {
                            return;
                        }
                        int m10 = hVar.m();
                        while (i10 < m10) {
                            long j3 = hVar.j(i10);
                            ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                            g0.h3(new sp(vrVar2, arrayList3, 8));
                            vr vrVar3 = vrVar2;
                            try {
                                vrVar3.U1(arrayList3, null, null, null, null);
                                vrVar3.Q0(0, 0, j3, arrayList3, true);
                                vrVar3.S1(j3, 0L, arrayList3, null);
                                vrVar2 = vrVar3;
                                i10++;
                            } catch (Exception e10) {
                                e = e10;
                                vrVar2 = vrVar3;
                                vrVar2.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    } catch (Exception e11) {
                        e = e11;
                        sQLiteCursor = queryFinalized;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 3:
                vrVar.getClass();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    vrVar.getMessagesController().r3((gj) obj);
                }
                return;
            case 4:
                vrVar.getFileLoader().g(arrayList);
                return;
            case 5:
                HashSet hashSet = new HashSet();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h();
                int i11 = 0;
                boolean z11 = false;
                while (i11 < arrayList.size()) {
                    sr srVar = (sr) arrayList.get(i11);
                    TLRPC.TL_messageReactions tL_messageReactions = srVar.b;
                    long j10 = srVar.a;
                    TLRPC.TL_messageReactions tL_messageReactions2 = srVar.c;
                    hVar2.b();
                    hVar3.b();
                    if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                        int i12 = 0;
                        while (i12 < tL_messageReactions.results.size()) {
                            ch.p0 d = ch.p0.d(tL_messageReactions.results.get(i12).reaction);
                            hVar2.k(d, d.h);
                            i12++;
                            vrVar = vrVar;
                        }
                    }
                    vr vrVar4 = vrVar;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i13 = 0; i13 < tL_messageReactions2.results.size(); i13++) {
                            ch.p0 d2 = ch.p0.d(tL_messageReactions2.results.get(i13).reaction);
                            hVar3.k(d2, d2.h);
                        }
                    }
                    for (int i14 = 0; i14 < hVar2.m(); i14++) {
                        long j11 = hVar2.j(i14);
                        ch.p0 p0Var = (ch.p0) hVar2.n(i14);
                        if (!hVar3.d(j11) && vrVar4.getMessagesController().t5(j10, p0Var, false)) {
                            hashSet.add(Long.valueOf(j10));
                            z11 = true;
                        }
                    }
                    for (int i15 = 0; i15 < hVar3.m(); i15++) {
                        long j12 = hVar3.j(i15);
                        ch.p0 p0Var2 = (ch.p0) hVar3.n(i15);
                        if (!hVar2.d(j12) && vrVar4.getMessagesController().t5(j10, p0Var2, true)) {
                            hashSet.add(Long.valueOf(j10));
                            z11 = true;
                        }
                    }
                    i11++;
                    vrVar = vrVar4;
                }
                vr vrVar5 = vrVar;
                if (!z11 || hashSet.isEmpty()) {
                    return;
                }
                vrVar5.getMessagesController().s5(hashSet);
                return;
            case 6:
                ArrayList arrayList4 = vrVar.I;
                arrayList4.clear();
                SparseArray sparseArray = vrVar.J;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i10 < arrayList.size()) {
                    ((so) arrayList.get(i10)).f = i10;
                    sparseArray.put(((so) arrayList.get(i10)).a, (so) arrayList.get(i10));
                    i10++;
                }
                vrVar.z1();
                return;
            case 7:
                vrVar.getNotificationCenter().k(58, arrayList);
                return;
            case 8:
                vrVar.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 9:
                vrVar.getMessagesController().S3(arrayList, true);
                return;
            case 10:
                vrVar.getFileLoader().g(arrayList);
                return;
            case 11:
                z5 downloadController = vrVar.getDownloadController();
                downloadController.getClass();
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
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
            case 12:
                vrVar.getFileLoader().g(arrayList);
                return;
            case 13:
                vrVar.getClass();
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i17 = 0;
                boolean z12 = false;
                while (i17 < arrayList.size()) {
                    si mediaDataController = vrVar.getMediaDataController();
                    int intValue = ((Integer) arrayList.get(i17)).intValue();
                    ArrayList arrayList5 = mediaDataController.d1;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList5.size()) {
                            gjVar = null;
                        } else if (((gj) arrayList5.get(i18)).e1() == intValue) {
                            gjVar = (gj) arrayList5.get(i18);
                        } else {
                            i18++;
                        }
                    }
                    if (gjVar == null || gj.B0(gjVar.k) != mediaDataController.getUserConfig().e()) {
                        z10 = false;
                    } else {
                        z10 = mediaDataController.getMessagesController().G3(gjVar.k);
                        jArr[0] = gj.Q1(mediaDataController.getUserConfig().e(), gjVar.k);
                    }
                    arrayList5.remove(gjVar);
                    if (z10) {
                        hashSet2.add(Long.valueOf(jArr[0]));
                        z12 = true;
                    }
                    i17++;
                    z12 = z12;
                }
                if (z12) {
                    vrVar.getMessagesController().s5(hashSet2);
                    return;
                }
                return;
            case 14:
                if (vrVar.getMessagesController().G1().q(arrayList)) {
                    vrVar.getMessagesController().G1().l();
                    return;
                }
                return;
            case 15:
                vrVar.getClass();
                try {
                    try {
                        vrVar.b.beginTransaction();
                        try {
                            SQLitePreparedStatement executeFast = vrVar.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                            try {
                                int size3 = arrayList.size();
                                for (int i19 = 0; i19 < size3; i19++) {
                                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i19);
                                    executeFast.requery();
                                    int i20 = message.stickerVerified;
                                    executeFast.bindInteger(1, i20 == 0 ? 1 : i20 == 2 ? 2 : 0);
                                    executeFast.bindInteger(2, message.id);
                                    executeFast.bindLong(3, gj.B0(message));
                                    executeFast.step();
                                }
                                executeFast.dispose();
                                vrVar.b.commitTransaction();
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                sQLitePreparedStatement = executeFast;
                                i10 = 1;
                                vrVar.o(e, true);
                                if (i10 != 0 && (sQLiteDatabase2 = vrVar.b) != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement = executeFast;
                                i10 = 1;
                                if (i10 != 0 && (sQLiteDatabase = vrVar.b) != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e14) {
                            e = e14;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                break;
            case 16:
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    vrVar.getNotificationCenter().k(48, arrayList.get(i21));
                }
                return;
            case 17:
                vrVar.getFileLoader().g(arrayList);
                return;
            case 18:
                vrVar.getFileLoader().g(arrayList);
                return;
            case 19:
                if (vrVar.getMessagesController().G1().q(arrayList)) {
                    vrVar.getMessagesController().G1().l();
                    return;
                }
                return;
            default:
                vrVar.getClass();
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    vrVar.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    vrVar.o(e16, true);
                    return;
                }
        }
    }
}

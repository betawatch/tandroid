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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class pp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ pp(vr vrVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        vr vrVar;
        String join;
        SQLiteDatabase sQLiteDatabase;
        TLRPC.PhotoSize w10;
        gj gjVar;
        boolean z10;
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
        vr vrVar2 = this.b;
        ArrayList arrayList = this.c;
        switch (i7) {
            case 0:
                vrVar2.getClass();
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    vrVar2.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    vrVar2.o(e10, true);
                    return;
                }
            case 1:
                vr.a(vrVar2, arrayList);
                return;
            case 2:
                if (vrVar2.getMessagesController().G1().q(arrayList)) {
                    vrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            case 3:
                vr vrVar3 = this.b;
                try {
                    try {
                        join = TextUtils.join(",", arrayList);
                        sQLiteDatabase = vrVar3.b;
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
                                        vrVar = vrVar3;
                                        vrVar.o(e, true);
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
                                    g0.h3(new pp(vrVar3, arrayList3, 8));
                                    vr vrVar4 = vrVar3;
                                    try {
                                        vrVar4.U1(arrayList3, null, null, null, null);
                                        vrVar4.Q0(0, 0, j3, arrayList3, true);
                                        vrVar4.S1(j3, 0L, arrayList3, null);
                                        i10++;
                                        vrVar3 = vrVar4;
                                    } catch (Exception e12) {
                                        e = e12;
                                        vrVar = vrVar4;
                                        vrVar.o(e, true);
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
                                vrVar = vrVar3;
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
                vrVar2.getFileLoader().g(arrayList);
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
                            vrVar2 = vrVar2;
                        }
                    }
                    vr vrVar5 = vrVar2;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i13 = 0; i13 < tL_messageReactions2.results.size(); i13++) {
                            ch.p0 d2 = ch.p0.d(tL_messageReactions2.results.get(i13).reaction);
                            hVar3.k(d2, d2.h);
                        }
                    }
                    for (int i14 = 0; i14 < hVar2.m(); i14++) {
                        long j11 = hVar2.j(i14);
                        ch.p0 p0Var = (ch.p0) hVar2.n(i14);
                        if (!hVar3.d(j11) && vrVar5.getMessagesController().t5(j10, p0Var, false)) {
                            hashSet.add(Long.valueOf(j10));
                            z11 = true;
                        }
                    }
                    for (int i15 = 0; i15 < hVar3.m(); i15++) {
                        long j12 = hVar3.j(i15);
                        ch.p0 p0Var2 = (ch.p0) hVar3.n(i15);
                        if (!hVar2.d(j12) && vrVar5.getMessagesController().t5(j10, p0Var2, true)) {
                            hashSet.add(Long.valueOf(j10));
                            z11 = true;
                        }
                    }
                    i11++;
                    vrVar2 = vrVar5;
                }
                vr vrVar6 = vrVar2;
                if (!z11 || hashSet.isEmpty()) {
                    return;
                }
                vrVar6.getMessagesController().s5(hashSet);
                return;
            case 6:
                vrVar2.getMessagesController().S3(arrayList, true);
                return;
            case 7:
                ArrayList arrayList4 = vrVar2.I;
                arrayList4.clear();
                SparseArray sparseArray = vrVar2.J;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i10 < arrayList.size()) {
                    ((so) arrayList.get(i10)).f = i10;
                    sparseArray.put(((so) arrayList.get(i10)).a, (so) arrayList.get(i10));
                    i10++;
                }
                vrVar2.z1();
                return;
            case 8:
                vrVar2.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 9:
                vrVar2.getFileLoader().g(arrayList);
                return;
            case 10:
                z5 downloadController = vrVar2.getDownloadController();
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
                vrVar2.getNotificationCenter().k(58, arrayList);
                return;
            case 12:
                vrVar2.getFileLoader().g(arrayList);
                return;
            case 13:
                vrVar2.getClass();
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i17 = 0;
                boolean z12 = false;
                while (i17 < arrayList.size()) {
                    si mediaDataController = vrVar2.getMediaDataController();
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
                    vrVar2.getMessagesController().s5(hashSet2);
                    return;
                }
                return;
            case 14:
                if (vrVar2.getMessagesController().G1().q(arrayList)) {
                    vrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            case 15:
                vrVar2.getClass();
                try {
                    try {
                        vrVar2.b.beginTransaction();
                        try {
                            executeFast = vrVar2.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
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
                        executeFast.bindLong(3, gj.B0(message));
                        executeFast.step();
                    }
                    executeFast.dispose();
                    vrVar2.b.commitTransaction();
                    return;
                } catch (Exception e18) {
                    e = e18;
                    sQLitePreparedStatement = executeFast;
                    i10 = 1;
                    vrVar2.o(e, true);
                    if (i10 != 0 && (sQLiteDatabase3 = vrVar2.b) != null) {
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
                    if (i10 != 0 && (sQLiteDatabase2 = vrVar2.b) != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 16:
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    vrVar2.getNotificationCenter().k(48, arrayList.get(i21));
                }
                return;
            case 17:
                vrVar2.getFileLoader().g(arrayList);
                return;
            case 18:
                vrVar2.getFileLoader().g(arrayList);
                return;
            case 19:
                if (vrVar2.getMessagesController().G1().q(arrayList)) {
                    vrVar2.getMessagesController().G1().l();
                    return;
                }
                return;
            default:
                vrVar2.getClass();
                int size3 = arrayList.size();
                while (i10 < size3) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    vrVar2.getMessagesController().r3((gj) obj);
                }
                return;
        }
    }
}

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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ yp(is isVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = isVar;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        is isVar;
        String join;
        SQLiteDatabase sQLiteDatabase;
        TLRPC.PhotoSize w9;
        kj kjVar;
        boolean z10;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3;
        SQLitePreparedStatement executeFast;
        int i10 = this.a;
        int i11 = 7;
        SQLiteCursor sQLiteCursor = null;
        r7 = null;
        r7 = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLiteCursor = null;
        sQLiteCursor = null;
        SQLiteCursor sQLiteCursor2 = null;
        int i12 = 0;
        is isVar2 = this.b;
        ArrayList arrayList = this.c;
        switch (i10) {
            case 0:
                isVar2.getClass();
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    isVar2.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    isVar2.o(e, true);
                    return;
                }
            case 1:
                is.a(isVar2, arrayList);
                return;
            case 2:
                if (isVar2.getMessagesController().F1().q(arrayList)) {
                    isVar2.getMessagesController().F1().l();
                    return;
                }
                return;
            case 3:
                is isVar3 = this.b;
                try {
                    try {
                        join = TextUtils.join(",", arrayList);
                        sQLiteDatabase = isVar3.b;
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
                                    } catch (Exception e7) {
                                        e = e7;
                                        sQLiteCursor = queryFinalized;
                                        isVar = isVar3;
                                        isVar.o(e, true);
                                        if (sQLiteCursor == null) {
                                        }
                                    }
                                }
                                queryFinalized.dispose();
                                if (hVar.i()) {
                                    return;
                                }
                                int m10 = hVar.m();
                                while (i12 < m10) {
                                    long j10 = hVar.j(i12);
                                    ArrayList arrayList3 = (ArrayList) hVar.n(i12);
                                    i0.g3(new yp(isVar3, arrayList3, i11));
                                    is isVar4 = isVar3;
                                    try {
                                        isVar4.U1(arrayList3, null, null, null, null);
                                        isVar4.Q0(0, 0, j10, arrayList3, true);
                                        isVar4.S1(j10, 0L, arrayList3, null);
                                        i12++;
                                        isVar3 = isVar4;
                                    } catch (Exception e10) {
                                        e = e10;
                                        isVar = isVar4;
                                        isVar.o(e, true);
                                        if (sQLiteCursor == null) {
                                            sQLiteCursor.dispose();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                isVar = isVar3;
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
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            case 4:
                isVar2.getFileLoader().g(arrayList);
                return;
            case 5:
                HashSet hashSet = new HashSet();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h();
                int i13 = 0;
                boolean z11 = false;
                while (i13 < arrayList.size()) {
                    fs fsVar = (fs) arrayList.get(i13);
                    TLRPC.TL_messageReactions tL_messageReactions = fsVar.b;
                    long j11 = fsVar.a;
                    TLRPC.TL_messageReactions tL_messageReactions2 = fsVar.c;
                    hVar2.b();
                    hVar3.b();
                    if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                        int i14 = 0;
                        while (i14 < tL_messageReactions.results.size()) {
                            sg.o0 d = sg.o0.d(tL_messageReactions.results.get(i14).reaction);
                            hVar2.k(d, d.h);
                            i14++;
                            isVar2 = isVar2;
                        }
                    }
                    is isVar5 = isVar2;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i15 = 0; i15 < tL_messageReactions2.results.size(); i15++) {
                            sg.o0 d10 = sg.o0.d(tL_messageReactions2.results.get(i15).reaction);
                            hVar3.k(d10, d10.h);
                        }
                    }
                    for (int i16 = 0; i16 < hVar2.m(); i16++) {
                        long j12 = hVar2.j(i16);
                        sg.o0 o0Var = (sg.o0) hVar2.n(i16);
                        if (!hVar3.d(j12) && isVar5.getMessagesController().p5(j11, o0Var, false)) {
                            hashSet.add(Long.valueOf(j11));
                            z11 = true;
                        }
                    }
                    for (int i17 = 0; i17 < hVar3.m(); i17++) {
                        long j13 = hVar3.j(i17);
                        sg.o0 o0Var2 = (sg.o0) hVar3.n(i17);
                        if (!hVar2.d(j13) && isVar5.getMessagesController().p5(j11, o0Var2, true)) {
                            hashSet.add(Long.valueOf(j11));
                            z11 = true;
                        }
                    }
                    i13++;
                    isVar2 = isVar5;
                }
                is isVar6 = isVar2;
                if (!z11 || hashSet.isEmpty()) {
                    return;
                }
                isVar6.getMessagesController().o5(hashSet);
                return;
            case 6:
                isVar2.getMessagesController().P3(arrayList, true);
                return;
            case 7:
                isVar2.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 8:
                isVar2.getFileLoader().g(arrayList);
                return;
            case 9:
                ArrayList arrayList4 = isVar2.H;
                arrayList4.clear();
                SparseArray sparseArray = isVar2.I;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i12 < arrayList.size()) {
                    ((bp) arrayList.get(i12)).f = i12;
                    sparseArray.put(((bp) arrayList.get(i12)).a, (bp) arrayList.get(i12));
                    i12++;
                }
                isVar2.z1();
                return;
            case 10:
                b6 downloadController = isVar2.getDownloadController();
                downloadController.getClass();
                int size = arrayList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    c6 c6Var = (c6) downloadController.h.get((Pair) arrayList.get(i18));
                    if (c6Var != null) {
                        TLObject tLObject = c6Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            downloadController.getFileLoader().f((TLRPC.Document) tLObject);
                        } else if ((tLObject instanceof TLRPC.Photo) && (w9 = b8.w(((TLRPC.Photo) tLObject).sizes, i0.Z0(false), false, null, false)) != null) {
                            b8 fileLoader = downloadController.getFileLoader();
                            fileLoader.getClass();
                            fileLoader.e(null, null, null, w9.location, null, null);
                        }
                    }
                }
                return;
            case 11:
                isVar2.getNotificationCenter().k(58, arrayList);
                return;
            case 12:
                isVar2.getFileLoader().g(arrayList);
                return;
            case 13:
                isVar2.getClass();
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i19 = 0;
                boolean z12 = false;
                while (i19 < arrayList.size()) {
                    vi mediaDataController = isVar2.getMediaDataController();
                    int intValue = ((Integer) arrayList.get(i19)).intValue();
                    ArrayList arrayList5 = mediaDataController.c1;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= arrayList5.size()) {
                            kjVar = null;
                        } else if (((kj) arrayList5.get(i20)).f1() == intValue) {
                            kjVar = (kj) arrayList5.get(i20);
                        } else {
                            i20++;
                        }
                    }
                    if (kjVar == null || kj.B0(kjVar.k) != mediaDataController.getUserConfig().e()) {
                        z10 = false;
                    } else {
                        z10 = mediaDataController.getMessagesController().D3(kjVar.k);
                        jArr[0] = kj.R1(mediaDataController.getUserConfig().e(), kjVar.k);
                    }
                    arrayList5.remove(kjVar);
                    if (z10) {
                        hashSet2.add(Long.valueOf(jArr[0]));
                        z12 = true;
                    }
                    i19++;
                    z12 = z12;
                }
                if (z12) {
                    isVar2.getMessagesController().o5(hashSet2);
                    return;
                }
                return;
            case 14:
                if (isVar2.getMessagesController().F1().q(arrayList)) {
                    isVar2.getMessagesController().F1().l();
                    return;
                }
                return;
            case 15:
                isVar2.getClass();
                try {
                    try {
                        isVar2.b.beginTransaction();
                        try {
                            executeFast = isVar2.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e14) {
                            e = e14;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    int size2 = arrayList.size();
                    for (int i21 = 0; i21 < size2; i21++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i21);
                        executeFast.requery();
                        int i22 = message.stickerVerified;
                        executeFast.bindInteger(1, i22 == 0 ? 1 : i22 == 2 ? 2 : 0);
                        executeFast.bindInteger(2, message.id);
                        executeFast.bindLong(3, kj.B0(message));
                        executeFast.step();
                    }
                    executeFast.dispose();
                    isVar2.b.commitTransaction();
                    return;
                } catch (Exception e16) {
                    e = e16;
                    sQLitePreparedStatement = executeFast;
                    i12 = 1;
                    isVar2.o(e, true);
                    if (i12 != 0 && (sQLiteDatabase3 = isVar2.b) != null) {
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
                    i12 = 1;
                    if (i12 != 0 && (sQLiteDatabase2 = isVar2.b) != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 16:
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    isVar2.getNotificationCenter().k(48, arrayList.get(i23));
                }
                return;
            case 17:
                isVar2.getFileLoader().g(arrayList);
                return;
            case 18:
                isVar2.getFileLoader().g(arrayList);
                return;
            case 19:
                if (isVar2.getMessagesController().F1().q(arrayList)) {
                    isVar2.getMessagesController().F1().l();
                    return;
                }
                return;
            default:
                isVar2.getClass();
                int size3 = arrayList.size();
                while (i12 < size3) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    isVar2.getMessagesController().o3((kj) obj);
                }
                return;
        }
    }
}

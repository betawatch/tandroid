package org.telegram.messenger;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class op implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ op(vr vrVar, int i7, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = vrVar;
        this.c = i7;
        this.d = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th2;
        SQLiteDatabase sQLiteDatabase;
        Exception e10;
        SQLiteDatabase sQLiteDatabase2;
        TLRPC.PhotoSize photoSize;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.d;
                vr vrVar = this.b;
                vrVar.getClass();
                int i7 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                if (i7 == 1) {
                    try {
                        try {
                            vrVar.b.executeFast("DELETE FROM wallpapers2 WHERE num >= -1").stepThis().dispose();
                        } catch (Exception e11) {
                            e10 = e11;
                            vrVar.o(e10, true);
                            sQLiteDatabase2 = vrVar.b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement3 == null) {
                                sQLitePreparedStatement3.dispose();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        sQLiteDatabase = vrVar.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        throw th2;
                    }
                }
                vrVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = i7 != 0 ? vrVar.b.executeFast("REPLACE INTO wallpapers2 VALUES(?, ?, ?)") : vrVar.b.executeFast("UPDATE wallpapers2 SET data = ? WHERE uid = ?");
                try {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i10);
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(wallPaper.getObjectSize());
                        wallPaper.serializeToStream(nativeByteBuffer);
                        if (i7 != 0) {
                            executeFast.bindLong(1, wallPaper.id);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            if (i7 < 0) {
                                executeFast.bindInteger(3, i7);
                            } else {
                                executeFast.bindInteger(3, i7 == 2 ? -1 : i10);
                            }
                        } else {
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindLong(2, wallPaper.id);
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                    executeFast.dispose();
                    vrVar.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = vrVar.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    e10 = e12;
                    sQLitePreparedStatement3 = executeFast;
                    vrVar.o(e10, true);
                    sQLiteDatabase2 = vrVar.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement3 == null) {
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    sQLitePreparedStatement3 = executeFast;
                    sQLiteDatabase = vrVar.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement3 != null) {
                    }
                    throw th2;
                }
            case 1:
                int i11 = this.c;
                ArrayList arrayList2 = this.d;
                vr vrVar2 = this.b;
                vrVar2.getClass();
                try {
                    vrVar2.b.beginTransaction();
                    vrVar2.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i11).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = vrVar2.b.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
                    if (arrayList2.isEmpty()) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i11);
                        executeFast2.bindLong(2, -1L);
                        executeFast2.bindInteger(3, 0);
                        executeFast2.step();
                    } else {
                        int size2 = arrayList2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            long j3 = ((ur) arrayList2.get(i12)).a;
                            executeFast2.requery();
                            executeFast2.bindInteger(1, i11);
                            executeFast2.bindLong(2, j3);
                            executeFast2.bindInteger(3, i12);
                            executeFast2.step();
                        }
                    }
                    executeFast2.dispose();
                    vrVar2.b.commitTransaction();
                    return;
                } catch (Exception e13) {
                    vrVar2.o(e13, true);
                    return;
                }
            case 2:
                z5 downloadController = this.b.getDownloadController();
                HashMap hashMap = downloadController.f;
                ArrayList arrayList3 = this.d;
                if (arrayList3.isEmpty()) {
                    return;
                }
                int i13 = this.c;
                ArrayList arrayList4 = i13 == 1 ? downloadController.b : i13 == 2 ? downloadController.c : i13 == 4 ? downloadController.e : downloadController.d;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    a6 a6Var = (a6) arrayList3.get(i14);
                    TLObject tLObject = a6Var.a;
                    String str = null;
                    if (tLObject instanceof TLRPC.Document) {
                        str = w7.r(null, (TLRPC.Document) tLObject);
                        photoSize = null;
                    } else if (tLObject instanceof TLRPC.Photo) {
                        photoSize = w7.w(((TLRPC.Photo) tLObject).sizes, g0.Z0(false), false, null, false);
                        str = w7.r(null, photoSize);
                    } else {
                        photoSize = null;
                    }
                    if (str != null && !hashMap.containsKey(str)) {
                        if (photoSize != null) {
                            downloadController.getFileLoader().V(gc.i(photoSize, (TLRPC.Photo) a6Var.a), a6Var.f, null, 0, a6Var.d ? 2 : a6Var.e ? 1 : 0);
                        } else {
                            TLObject tLObject2 = a6Var.a;
                            if (tLObject2 instanceof TLRPC.Document) {
                                downloadController.getFileLoader().W((TLRPC.Document) tLObject2, a6Var.f, 0, a6Var.d ? 2 : 0);
                            }
                        }
                        arrayList4.add(a6Var);
                        hashMap.put(str, a6Var);
                        downloadController.h.put(new Pair(Long.valueOf(a6Var.c), Integer.valueOf(a6Var.b)), a6Var);
                    }
                }
                return;
            default:
                ArrayList arrayList5 = this.d;
                vr vrVar3 = this.b;
                vrVar3.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase4 = vrVar3.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase4.queryFinalized("SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (" + TextUtils.join(",", arrayList5) + ")", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (queryFinalized.intValue(1) == this.c && !m5.C(longValue) && !m5.D(longValue)) {
                                    arrayList6.add(Long.valueOf(queryFinalized.longValue(0)));
                                }
                            } catch (Exception e14) {
                                e = e14;
                                sQLitePreparedStatement2 = null;
                                sQLiteCursor = queryFinalized;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLitePreparedStatement = null;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized.dispose();
                        if (arrayList6.isEmpty()) {
                            return;
                        }
                        sQLitePreparedStatement2 = vrVar3.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            try {
                                long longValue2 = ((Long) arrayList6.get(i15)).longValue();
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindInteger(1, 0);
                                sQLitePreparedStatement2.bindLong(2, longValue2);
                                sQLitePreparedStatement2.step();
                            } catch (Exception e15) {
                                e = e15;
                                vrVar3.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e16) {
                    e = e16;
                    sQLitePreparedStatement2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement = null;
                }
                break;
        }
    }

    public /* synthetic */ op(vr vrVar, ArrayList arrayList, int i7) {
        this.a = 3;
        this.b = vrVar;
        this.d = arrayList;
        this.c = i7;
    }
}

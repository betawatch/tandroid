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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ tp(tr trVar, int i7, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = trVar;
        this.d = i7;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        TLRPC.PhotoSize photoSize;
        Exception e10;
        SQLiteDatabase sQLiteDatabase;
        SQLitePreparedStatement executeFast;
        switch (this.a) {
            case 0:
                int i7 = this.d;
                ArrayList arrayList = this.c;
                tr trVar = this.b;
                trVar.getClass();
                try {
                    trVar.b.beginTransaction();
                    trVar.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i7).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = trVar.b.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
                    if (arrayList.isEmpty()) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i7);
                        executeFast2.bindLong(2, -1L);
                        executeFast2.bindInteger(3, 0);
                        executeFast2.step();
                    } else {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            long j3 = ((sr) arrayList.get(i10)).a;
                            executeFast2.requery();
                            executeFast2.bindInteger(1, i7);
                            executeFast2.bindLong(2, j3);
                            executeFast2.bindInteger(3, i10);
                            executeFast2.step();
                        }
                    }
                    executeFast2.dispose();
                    trVar.b.commitTransaction();
                    return;
                } catch (Exception e11) {
                    trVar.o(e11, true);
                    return;
                }
            case 1:
                ArrayList arrayList2 = this.c;
                tr trVar2 = this.b;
                trVar2.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = trVar2.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (queryFinalized.intValue(1) == this.d && !n5.C(longValue) && !n5.D(longValue)) {
                                    arrayList3.add(Long.valueOf(queryFinalized.longValue(0)));
                                }
                            } catch (Exception e12) {
                                e = e12;
                                sQLitePreparedStatement2 = null;
                                sQLiteCursor = queryFinalized;
                            } catch (Throwable th2) {
                                th = th2;
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
                        if (arrayList3.isEmpty()) {
                            return;
                        }
                        sQLitePreparedStatement2 = trVar2.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            try {
                                long longValue2 = ((Long) arrayList3.get(i11)).longValue();
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindInteger(1, 0);
                                sQLitePreparedStatement2.bindLong(2, longValue2);
                                sQLitePreparedStatement2.step();
                            } catch (Exception e13) {
                                e = e13;
                                trVar2.o(e, true);
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
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLitePreparedStatement2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = null;
                }
                break;
            case 2:
                a6 downloadController = this.b.getDownloadController();
                HashMap hashMap = downloadController.f;
                ArrayList arrayList4 = this.c;
                if (arrayList4.isEmpty()) {
                    return;
                }
                int i12 = this.d;
                ArrayList arrayList5 = i12 == 1 ? downloadController.b : i12 == 2 ? downloadController.c : i12 == 4 ? downloadController.e : downloadController.d;
                for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                    b6 b6Var = (b6) arrayList4.get(i13);
                    TLObject tLObject = b6Var.a;
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
                            downloadController.getFileLoader().V(fc.i(photoSize, (TLRPC.Photo) b6Var.a), b6Var.f, null, 0, b6Var.d ? 2 : b6Var.e ? 1 : 0);
                        } else {
                            TLObject tLObject2 = b6Var.a;
                            if (tLObject2 instanceof TLRPC.Document) {
                                downloadController.getFileLoader().W((TLRPC.Document) tLObject2, b6Var.f, 0, b6Var.d ? 2 : 0);
                            }
                        }
                        arrayList5.add(b6Var);
                        hashMap.put(str, b6Var);
                        downloadController.h.put(new Pair(Long.valueOf(b6Var.c), Integer.valueOf(b6Var.b)), b6Var);
                    }
                }
                return;
            default:
                ArrayList arrayList6 = this.c;
                tr trVar3 = this.b;
                trVar3.getClass();
                int i14 = this.d;
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                try {
                    if (i14 == 1) {
                        try {
                            trVar3.b.executeFast("DELETE FROM wallpapers2 WHERE num >= -1").stepThis().dispose();
                        } catch (Exception e15) {
                            e10 = e15;
                            trVar3.o(e10, true);
                            sQLiteDatabase = trVar3.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLitePreparedStatement3 == null) {
                                sQLitePreparedStatement3.dispose();
                                return;
                            }
                            return;
                        }
                    }
                    trVar3.b.beginTransaction();
                    executeFast = i14 != 0 ? trVar3.b.executeFast("REPLACE INTO wallpapers2 VALUES(?, ?, ?)") : trVar3.b.executeFast("UPDATE wallpapers2 SET data = ? WHERE uid = ?");
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    int size2 = arrayList6.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList6.get(i15);
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(wallPaper.getObjectSize());
                        wallPaper.serializeToStream(nativeByteBuffer);
                        if (i14 != 0) {
                            executeFast.bindLong(1, wallPaper.id);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            if (i14 < 0) {
                                executeFast.bindInteger(3, i14);
                            } else {
                                executeFast.bindInteger(3, i14 == 2 ? -1 : i15);
                            }
                        } else {
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindLong(2, wallPaper.id);
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                    executeFast.dispose();
                    trVar3.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = trVar3.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e16) {
                    e10 = e16;
                    sQLitePreparedStatement3 = executeFast;
                    trVar3.o(e10, true);
                    sQLiteDatabase = trVar3.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement3 == null) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement3 = executeFast;
                    SQLiteDatabase sQLiteDatabase4 = trVar3.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.commitTransaction();
                    }
                    if (sQLitePreparedStatement3 != null) {
                        sQLitePreparedStatement3.dispose();
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ tp(tr trVar, ArrayList arrayList, int i7) {
        this.a = 1;
        this.b = trVar;
        this.c = arrayList;
        this.d = i7;
    }
}

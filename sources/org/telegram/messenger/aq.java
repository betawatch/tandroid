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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class aq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ aq(is isVar, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = isVar;
        this.c = i10;
        this.d = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th2;
        SQLiteDatabase sQLiteDatabase;
        Exception e;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement sQLitePreparedStatement;
        TLRPC.PhotoSize photoSize;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.d;
                is isVar = this.b;
                isVar.getClass();
                int i10 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                if (i10 == 1) {
                    try {
                        try {
                            isVar.b.executeFast("DELETE FROM wallpapers2 WHERE num >= -1").stepThis().dispose();
                        } catch (Exception e7) {
                            e = e7;
                            isVar.o(e, true);
                            sQLiteDatabase2 = isVar.b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement2 == null) {
                                sQLitePreparedStatement2.dispose();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        sQLiteDatabase = isVar.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th2;
                    }
                }
                isVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = i10 != 0 ? isVar.b.executeFast("REPLACE INTO wallpapers2 VALUES(?, ?, ?)") : isVar.b.executeFast("UPDATE wallpapers2 SET data = ? WHERE uid = ?");
                try {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i11);
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(wallPaper.getObjectSize());
                        wallPaper.serializeToStream(nativeByteBuffer);
                        if (i10 != 0) {
                            executeFast.bindLong(1, wallPaper.id);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            if (i10 < 0) {
                                executeFast.bindInteger(3, i10);
                            } else {
                                executeFast.bindInteger(3, i10 == 2 ? -1 : i11);
                            }
                        } else {
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindLong(2, wallPaper.id);
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                    executeFast.dispose();
                    isVar.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = isVar.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e = e10;
                    sQLitePreparedStatement2 = executeFast;
                    isVar.o(e, true);
                    sQLiteDatabase2 = isVar.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement2 == null) {
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    sQLitePreparedStatement2 = executeFast;
                    sQLiteDatabase = isVar.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th2;
                }
            case 1:
                int i12 = this.c;
                ArrayList arrayList2 = this.d;
                is isVar2 = this.b;
                isVar2.getClass();
                try {
                    isVar2.b.beginTransaction();
                    isVar2.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i12).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = isVar2.b.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
                    if (arrayList2.isEmpty()) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i12);
                        executeFast2.bindLong(2, -1L);
                        executeFast2.bindInteger(3, 0);
                        executeFast2.step();
                    } else {
                        int size2 = arrayList2.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            long j10 = ((hs) arrayList2.get(i13)).a;
                            executeFast2.requery();
                            executeFast2.bindInteger(1, i12);
                            executeFast2.bindLong(2, j10);
                            executeFast2.bindInteger(3, i13);
                            executeFast2.step();
                        }
                    }
                    executeFast2.dispose();
                    isVar2.b.commitTransaction();
                    return;
                } catch (Exception e11) {
                    isVar2.o(e11, true);
                    return;
                }
            case 2:
                ArrayList arrayList3 = this.d;
                is isVar3 = this.b;
                isVar3.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    ArrayList arrayList4 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase4 = isVar3.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase4.queryFinalized("SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            long longValue = queryFinalized.longValue(0);
                            if (queryFinalized.intValue(1) == this.c && !o5.C(longValue) && !o5.D(longValue)) {
                                arrayList4.add(Long.valueOf(queryFinalized.longValue(0)));
                            }
                        } catch (Exception e12) {
                            e = e12;
                            sQLitePreparedStatement = null;
                            sQLiteCursor = queryFinalized;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLitePreparedStatement = null;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    if (arrayList4.isEmpty()) {
                        return;
                    }
                    sQLitePreparedStatement = isVar3.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        try {
                            try {
                                long longValue2 = ((Long) arrayList4.get(i14)).longValue();
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, 0);
                                sQLitePreparedStatement.bindLong(2, longValue2);
                                sQLitePreparedStatement.step();
                            } catch (Exception e13) {
                                e = e13;
                                isVar3.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Exception e14) {
                    e = e14;
                    sQLitePreparedStatement = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement = null;
                }
                break;
            default:
                b6 downloadController = this.b.getDownloadController();
                HashMap hashMap = downloadController.f;
                ArrayList arrayList5 = this.d;
                if (arrayList5.isEmpty()) {
                    return;
                }
                int i15 = this.c;
                ArrayList arrayList6 = i15 == 1 ? downloadController.b : i15 == 2 ? downloadController.c : i15 == 4 ? downloadController.e : downloadController.d;
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    c6 c6Var = (c6) arrayList5.get(i16);
                    TLObject tLObject = c6Var.a;
                    String str = null;
                    if (tLObject instanceof TLRPC.Document) {
                        str = b8.r(null, (TLRPC.Document) tLObject);
                        photoSize = null;
                    } else if (tLObject instanceof TLRPC.Photo) {
                        photoSize = b8.w(((TLRPC.Photo) tLObject).sizes, i0.Z0(false), false, null, false);
                        str = b8.r(null, photoSize);
                    } else {
                        photoSize = null;
                    }
                    if (str != null && !hashMap.containsKey(str)) {
                        if (photoSize != null) {
                            downloadController.getFileLoader().W(jc.i(photoSize, (TLRPC.Photo) c6Var.a), c6Var.f, null, 0, c6Var.d ? 2 : c6Var.e ? 1 : 0);
                        } else {
                            TLObject tLObject2 = c6Var.a;
                            if (tLObject2 instanceof TLRPC.Document) {
                                downloadController.getFileLoader().X((TLRPC.Document) tLObject2, c6Var.f, 0, c6Var.d ? 2 : 0);
                            }
                        }
                        arrayList6.add(c6Var);
                        hashMap.put(str, c6Var);
                        downloadController.h.put(new Pair(Long.valueOf(c6Var.c), Integer.valueOf(c6Var.b)), c6Var);
                    }
                }
                return;
        }
    }

    public /* synthetic */ aq(is isVar, ArrayList arrayList, int i10) {
        this.a = 2;
        this.b = isVar;
        this.d = arrayList;
        this.c = i10;
    }
}

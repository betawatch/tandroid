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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class up implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ up(yr yrVar, int i7, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = yrVar;
        this.c = i7;
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
        Exception e10;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement sQLitePreparedStatement;
        TLRPC.PhotoSize photoSize;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.d;
                yr yrVar = this.b;
                yrVar.getClass();
                int i7 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                if (i7 == 1) {
                    try {
                        try {
                            yrVar.b.executeFast("DELETE FROM wallpapers2 WHERE num >= -1").stepThis().dispose();
                        } catch (Exception e11) {
                            e10 = e11;
                            yrVar.o(e10, true);
                            sQLiteDatabase2 = yrVar.b;
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
                        sQLiteDatabase = yrVar.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th2;
                    }
                }
                yrVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = i7 != 0 ? yrVar.b.executeFast("REPLACE INTO wallpapers2 VALUES(?, ?, ?)") : yrVar.b.executeFast("UPDATE wallpapers2 SET data = ? WHERE uid = ?");
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
                    yrVar.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    e10 = e12;
                    sQLitePreparedStatement2 = executeFast;
                    yrVar.o(e10, true);
                    sQLiteDatabase2 = yrVar.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement2 == null) {
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    sQLitePreparedStatement2 = executeFast;
                    sQLiteDatabase = yrVar.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th2;
                }
            case 1:
                int i11 = this.c;
                ArrayList arrayList2 = this.d;
                yr yrVar2 = this.b;
                yrVar2.getClass();
                try {
                    yrVar2.b.beginTransaction();
                    yrVar2.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i11).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = yrVar2.b.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
                    if (arrayList2.isEmpty()) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i11);
                        executeFast2.bindLong(2, -1L);
                        executeFast2.bindInteger(3, 0);
                        executeFast2.step();
                    } else {
                        int size2 = arrayList2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            long j3 = ((xr) arrayList2.get(i12)).a;
                            executeFast2.requery();
                            executeFast2.bindInteger(1, i11);
                            executeFast2.bindLong(2, j3);
                            executeFast2.bindInteger(3, i12);
                            executeFast2.step();
                        }
                    }
                    executeFast2.dispose();
                    yrVar2.b.commitTransaction();
                    return;
                } catch (Exception e13) {
                    yrVar2.o(e13, true);
                    return;
                }
            case 2:
                ArrayList arrayList3 = this.d;
                yr yrVar3 = this.b;
                yrVar3.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    ArrayList arrayList4 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase4 = yrVar3.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase4.queryFinalized("SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            long longValue = queryFinalized.longValue(0);
                            if (queryFinalized.intValue(1) == this.c && !m5.C(longValue) && !m5.D(longValue)) {
                                arrayList4.add(Long.valueOf(queryFinalized.longValue(0)));
                            }
                        } catch (Exception e14) {
                            e = e14;
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
                    sQLitePreparedStatement = yrVar3.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        try {
                            try {
                                long longValue2 = ((Long) arrayList4.get(i13)).longValue();
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, 0);
                                sQLitePreparedStatement.bindLong(2, longValue2);
                                sQLitePreparedStatement.step();
                            } catch (Exception e15) {
                                e = e15;
                                yrVar3.o(e, true);
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
                } catch (Exception e16) {
                    e = e16;
                    sQLitePreparedStatement = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement = null;
                }
                break;
            default:
                z5 downloadController = this.b.getDownloadController();
                HashMap hashMap = downloadController.f;
                ArrayList arrayList5 = this.d;
                if (arrayList5.isEmpty()) {
                    return;
                }
                int i14 = this.c;
                ArrayList arrayList6 = i14 == 1 ? downloadController.b : i14 == 2 ? downloadController.c : i14 == 4 ? downloadController.e : downloadController.d;
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    a6 a6Var = (a6) arrayList5.get(i15);
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
                            downloadController.getFileLoader().V(hc.i(photoSize, (TLRPC.Photo) a6Var.a), a6Var.f, null, 0, a6Var.d ? 2 : a6Var.e ? 1 : 0);
                        } else {
                            TLObject tLObject2 = a6Var.a;
                            if (tLObject2 instanceof TLRPC.Document) {
                                downloadController.getFileLoader().W((TLRPC.Document) tLObject2, a6Var.f, 0, a6Var.d ? 2 : 0);
                            }
                        }
                        arrayList6.add(a6Var);
                        hashMap.put(str, a6Var);
                        downloadController.h.put(new Pair(Long.valueOf(a6Var.c), Integer.valueOf(a6Var.b)), a6Var);
                    }
                }
                return;
        }
    }

    public /* synthetic */ up(yr yrVar, ArrayList arrayList, int i7) {
        this.a = 2;
        this.b = yrVar;
        this.d = arrayList;
        this.c = i7;
    }
}

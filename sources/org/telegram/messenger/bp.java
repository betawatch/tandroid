package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ bp(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int readInt32;
        switch (this.a) {
            case 0:
                dp dpVar = this.b;
                long j10 = dpVar.a;
                SQLiteDatabase sQLiteDatabase = dpVar.h.getMessagesStorage().b;
                HashMap hashMap = new HashMap();
                SQLiteCursor sQLiteCursor = null;
                int i11 = 0;
                try {
                    try {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT count FROM dialog_photos_count WHERE uid = " + j10, new Object[0]);
                        try {
                            try {
                                i10 = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                try {
                                    queryFinalized.dispose();
                                    try {
                                        SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT num, data FROM dialog_photos WHERE uid = " + j10, new Object[0]);
                                        while (queryFinalized2.next()) {
                                            try {
                                                try {
                                                    int intValue = queryFinalized2.intValue(0);
                                                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                                    TLRPC.Photo TLdeserialize = (byteBufferValue == null || (readInt32 = byteBufferValue.readInt32(false)) == 1450380236) ? null : TLRPC.Photo.TLdeserialize(byteBufferValue, readInt32, false);
                                                    if (TLdeserialize != null) {
                                                        int max = Math.max(intValue + 1, i10);
                                                        try {
                                                            hashMap.put(Integer.valueOf(intValue), TLdeserialize);
                                                            i10 = max;
                                                        } catch (Exception unused) {
                                                            sQLiteCursor = queryFinalized2;
                                                            i11 = max;
                                                            if (sQLiteCursor != null) {
                                                                sQLiteCursor.dispose();
                                                            }
                                                            i10 = i11;
                                                            i0.g3(new o7(dpVar, Math.max(i10, hashMap.size()), hashMap, 16));
                                                            return;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    sQLiteCursor = queryFinalized2;
                                                    if (sQLiteCursor != null) {
                                                        sQLiteCursor.dispose();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception unused2) {
                                                sQLiteCursor = queryFinalized2;
                                                i11 = i10;
                                                if (sQLiteCursor != null) {
                                                }
                                                i10 = i11;
                                                i0.g3(new o7(dpVar, Math.max(i10, hashMap.size()), hashMap, 16));
                                                return;
                                            }
                                        }
                                        queryFinalized2.dispose();
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    sQLiteCursor = queryFinalized;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = queryFinalized;
                            }
                        } catch (Exception unused5) {
                            sQLiteCursor = queryFinalized;
                        }
                    } catch (Exception unused6) {
                    }
                    i0.g3(new o7(dpVar, Math.max(i10, hashMap.size()), hashMap, 16));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            default:
                dp dpVar2 = this.b;
                ArrayList arrayList = dpVar2.b;
                long j11 = dpVar2.a;
                SQLiteDatabase sQLiteDatabase2 = dpVar2.h.getMessagesStorage().b;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos WHERE uid = " + j11).stepThis().dispose();
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j11).stepThis().dispose();
                    sQLiteDatabase2.executeFast("REPLACE INTO dialog_photos_count VALUES(" + j11 + ", " + arrayList.size() + ")").stepThis().dispose();
                    sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO dialog_photos VALUES(?, ?, ?, ?)");
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i12);
                        if (photo != null) {
                            if (photo.file_reference == null) {
                                photo.file_reference = new byte[0];
                            }
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(photo.getObjectSize());
                            photo.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindLong(1, j11);
                            sQLitePreparedStatement.bindLong(2, photo.id);
                            sQLitePreparedStatement.bindInteger(3, i12);
                            sQLitePreparedStatement.bindByteBuffer(4, nativeByteBuffer);
                            sQLitePreparedStatement.step();
                            nativeByteBuffer.reuse();
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Exception unused7) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th5;
                }
        }
    }
}

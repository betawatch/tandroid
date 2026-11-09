package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class wo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;

    public /* synthetic */ wo(yo yoVar, int i7) {
        this.a = i7;
        this.b = yoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int readInt32;
        switch (this.a) {
            case 0:
                yo yoVar = this.b;
                long j3 = yoVar.a;
                SQLiteDatabase sQLiteDatabase = yoVar.h.getMessagesStorage().b;
                HashMap hashMap = new HashMap();
                SQLiteCursor sQLiteCursor = null;
                int i10 = 0;
                try {
                    try {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT count FROM dialog_photos_count WHERE uid = " + j3, new Object[0]);
                        try {
                            try {
                                i7 = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                try {
                                    queryFinalized.dispose();
                                    try {
                                        SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT num, data FROM dialog_photos WHERE uid = " + j3, new Object[0]);
                                        while (queryFinalized2.next()) {
                                            try {
                                                try {
                                                    int intValue = queryFinalized2.intValue(0);
                                                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                                    TLRPC.Photo TLdeserialize = (byteBufferValue == null || (readInt32 = byteBufferValue.readInt32(false)) == 1450380236) ? null : TLRPC.Photo.TLdeserialize(byteBufferValue, readInt32, false);
                                                    if (TLdeserialize != null) {
                                                        int max = Math.max(intValue + 1, i7);
                                                        try {
                                                            hashMap.put(Integer.valueOf(intValue), TLdeserialize);
                                                            i7 = max;
                                                        } catch (Exception unused) {
                                                            sQLiteCursor = queryFinalized2;
                                                            i10 = max;
                                                            if (sQLiteCursor != null) {
                                                                sQLiteCursor.dispose();
                                                            }
                                                            i7 = i10;
                                                            g0.h3(new l7(yoVar, Math.max(i7, hashMap.size()), hashMap, 16));
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
                                                i10 = i7;
                                                if (sQLiteCursor != null) {
                                                }
                                                i7 = i10;
                                                g0.h3(new l7(yoVar, Math.max(i7, hashMap.size()), hashMap, 16));
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
                    g0.h3(new l7(yoVar, Math.max(i7, hashMap.size()), hashMap, 16));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            default:
                yo yoVar2 = this.b;
                ArrayList arrayList = yoVar2.b;
                long j10 = yoVar2.a;
                SQLiteDatabase sQLiteDatabase2 = yoVar2.h.getMessagesStorage().b;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos WHERE uid = " + j10).stepThis().dispose();
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j10).stepThis().dispose();
                    sQLiteDatabase2.executeFast("REPLACE INTO dialog_photos_count VALUES(" + j10 + ", " + arrayList.size() + ")").stepThis().dispose();
                    sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO dialog_photos VALUES(?, ?, ?, ?)");
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i11);
                        if (photo != null) {
                            if (photo.file_reference == null) {
                                photo.file_reference = new byte[0];
                            }
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(photo.getObjectSize());
                            photo.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindLong(1, j10);
                            sQLitePreparedStatement.bindLong(2, photo.id);
                            sQLitePreparedStatement.bindInteger(3, i11);
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

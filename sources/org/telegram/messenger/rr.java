package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rr implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Cloneable n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ rr(hs hsVar, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = hsVar;
        this.b = i10;
        this.d = arrayList;
        this.c = i11;
        this.n = hVar;
        this.r = hVar2;
        this.f = arrayList2;
        this.h = arrayList3;
        this.s = countDownLatch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e9  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a0.h] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CountDownLatch countDownLatch;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        boolean z10;
        ?? queryFinalized;
        boolean z11;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                hs hsVar = (hs) this.e;
                int i10 = this.b;
                ArrayList arrayList2 = this.d;
                int i11 = this.c;
                a0.h hVar = (a0.h) this.n;
                ?? r62 = (a0.h) this.r;
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = (ArrayList) this.h;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.s;
                try {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = hsVar.b;
                    Locale locale = Locale.US;
                    ?? r11 = 0;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i10 + " ORDER BY ord ASC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            long longValue = queryFinalized2.longValue(0);
                            if (longValue != -1) {
                                arrayList2.add(Long.valueOf(longValue));
                                if (o5.E(longValue)) {
                                    arrayList5.add(Long.valueOf(longValue));
                                } else {
                                    arrayList6.add(Long.valueOf(-longValue));
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            countDownLatch = countDownLatch2;
                            sQLiteCursor2 = queryFinalized2;
                        } catch (Throwable th2) {
                            th = th2;
                            countDownLatch = countDownLatch2;
                            sQLiteCursor2 = queryFinalized2;
                        }
                    }
                    queryFinalized2.dispose();
                    if (arrayList2.isEmpty() && i11 == 1) {
                        try {
                            queryFinalized = hsVar.getMessagesStorage().b.queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                            while (queryFinalized.next()) {
                                try {
                                    long longValue2 = queryFinalized.longValue(0);
                                    arrayList2.add(Long.valueOf(longValue2));
                                    if (o5.E(longValue2)) {
                                        arrayList5.add(Long.valueOf(longValue2));
                                    } else {
                                        arrayList6.add(Long.valueOf(-longValue2));
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    sQLiteCursor2 = queryFinalized;
                                    countDownLatch = countDownLatch2;
                                    z10 = true;
                                    try {
                                        hsVar.o(e, z10);
                                        if (sQLiteCursor2 != null) {
                                        }
                                        countDownLatch.countDown();
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (sQLiteCursor2 != null) {
                                            sQLiteCursor2.dispose();
                                        }
                                        countDownLatch.countDown();
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteCursor2 = queryFinalized;
                                    countDownLatch = countDownLatch2;
                                    if (sQLiteCursor2 != null) {
                                    }
                                    countDownLatch.countDown();
                                    throw th;
                                }
                            }
                            queryFinalized.dispose();
                        } catch (Exception e10) {
                            e = e10;
                            countDownLatch = countDownLatch2;
                            z10 = true;
                            sQLiteCursor2 = null;
                            hsVar.o(e, z10);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            countDownLatch.countDown();
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            countDownLatch = countDownLatch2;
                            sQLiteCursor2 = null;
                            if (sQLiteCursor2 != null) {
                            }
                            countDownLatch.countDown();
                            throw th;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        queryFinalized = hsVar.b.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.folder_id = 0 ORDER BY d.pinned DESC, d.date DESC LIMIT 0,10", new Object[0]);
                        z11 = true;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.did IN(" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                        z11 = false;
                    }
                    while (queryFinalized.next()) {
                        try {
                            long longValue3 = queryFinalized.longValue(r11);
                            if (!o5.D(longValue3)) {
                                if (z11) {
                                    arrayList2.add(Long.valueOf(longValue3));
                                }
                                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                tL_dialog.id = longValue3;
                                tL_dialog.top_message = queryFinalized.intValue(1);
                                tL_dialog.unread_count = queryFinalized.intValue(2);
                                tL_dialog.last_message_date = queryFinalized.intValue(3);
                                hVar.k(tL_dialog, tL_dialog.id);
                                ?? byteBufferValue = queryFinalized.byteBufferValue(4);
                                if (byteBufferValue != 0) {
                                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r11), r11);
                                    arrayList = arrayList4;
                                    countDownLatch = countDownLatch2;
                                    try {
                                        TLdeserialize.readAttachPath(byteBufferValue, hsVar.getUserConfig().n);
                                        byteBufferValue.reuse();
                                        jj.L5(queryFinalized.intValue(5), TLdeserialize);
                                        TLdeserialize.id = queryFinalized.intValue(6);
                                        TLdeserialize.send_state = queryFinalized.intValue(7);
                                        int intValue = queryFinalized.intValue(8);
                                        if (intValue != 0) {
                                            tL_dialog.last_message_date = intValue;
                                        }
                                        long j10 = tL_dialog.id;
                                        TLdeserialize.dialog_id = j10;
                                        r62.k(TLdeserialize, j10);
                                        hs.e(TLdeserialize, arrayList5, arrayList6, null);
                                        countDownLatch2 = countDownLatch;
                                        arrayList4 = arrayList;
                                        r11 = 0;
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteCursor2 = queryFinalized;
                                        z10 = true;
                                        hsVar.o(e, z10);
                                        if (sQLiteCursor2 != null) {
                                        }
                                        countDownLatch.countDown();
                                        return;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLiteCursor2 = queryFinalized;
                                        if (sQLiteCursor2 != null) {
                                        }
                                        countDownLatch.countDown();
                                        throw th;
                                    }
                                }
                            }
                            arrayList = arrayList4;
                            countDownLatch = countDownLatch2;
                            countDownLatch2 = countDownLatch;
                            arrayList4 = arrayList;
                            r11 = 0;
                        } catch (Exception e12) {
                            e = e12;
                            countDownLatch = countDownLatch2;
                        } catch (Throwable th7) {
                            th = th7;
                            countDownLatch = countDownLatch2;
                        }
                    }
                    ArrayList arrayList7 = arrayList4;
                    countDownLatch = countDownLatch2;
                    sQLiteCursor = null;
                    queryFinalized.dispose();
                    if (!z11) {
                        try {
                            if (arrayList2.size() > hVar.m()) {
                                int size = arrayList2.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    Long l4 = (Long) arrayList2.get(i12);
                                    long longValue4 = l4.longValue();
                                    if (hVar.f(((Long) arrayList2.get(i12)).longValue()) == null) {
                                        TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                                        tL_dialog2.id = longValue4;
                                        hVar.k(tL_dialog2, longValue4);
                                        if (o5.z(longValue4)) {
                                            long j11 = -longValue4;
                                            if (arrayList6.contains(Long.valueOf(j11))) {
                                                arrayList6.add(Long.valueOf(j11));
                                            }
                                        } else if (arrayList5.contains(l4)) {
                                            arrayList5.add(l4);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            sQLiteCursor2 = sQLiteCursor;
                            z10 = true;
                            hsVar.o(e, z10);
                            if (sQLiteCursor2 != null) {
                            }
                            countDownLatch.countDown();
                            return;
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteCursor2 = sQLiteCursor;
                            if (sQLiteCursor2 != null) {
                            }
                            countDownLatch.countDown();
                            throw th;
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        hsVar.Q(TextUtils.join(",", arrayList6), arrayList3);
                    }
                    if (!arrayList5.isEmpty()) {
                        hsVar.n0(arrayList5, arrayList7, false);
                    }
                } catch (Exception e14) {
                    e = e14;
                    countDownLatch = countDownLatch2;
                    sQLiteCursor = null;
                } catch (Throwable th9) {
                    th = th9;
                    countDownLatch = countDownLatch2;
                    sQLiteCursor = null;
                }
                countDownLatch.countDown();
                return;
            default:
                rf.e eVar = (rf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i13 = this.b;
                rf.x[] xVarArr = (rf.x[]) this.n;
                int i14 = this.c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.r;
                ArrayList arrayList8 = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.s;
                if (eVar.o.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i13].compress(compressFormat, eVar.l, xVarArr[i13]);
                int i15 = xVarArr[i13].b;
                try {
                    synchronized (eVar.h) {
                        rf.d dVar = new rf.d(i14);
                        dVar.c = (int) randomAccessFile.length();
                        arrayList8.add(dVar);
                        randomAccessFile.write(xVarArr[i13].a, 0, i15);
                        dVar.b = i15;
                        xVarArr[i13].b();
                    }
                } catch (IOException e15) {
                    e15.printStackTrace();
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused) {
                    } catch (Throwable th10) {
                        atomicBoolean.set(true);
                        throw th10;
                    }
                    atomicBoolean.set(true);
                }
                countDownLatchArr[i13].countDown();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rr(rf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, rf.x[] xVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f = atomicBoolean;
        this.h = bitmapArr;
        this.b = i10;
        this.n = xVarArr;
        this.c = i11;
        this.r = randomAccessFile;
        this.d = arrayList;
        this.s = countDownLatchArr;
    }
}

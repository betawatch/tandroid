package bg;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(i iVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i7, d0[] d0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = iVar;
        this.f = atomicBoolean;
        this.h = bitmapArr;
        this.b = i7;
        this.n = d0VarArr;
        this.d = i10;
        this.r = randomAccessFile;
        this.c = arrayList;
        this.s = countDownLatchArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0268  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v5, types: [a0.h] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CountDownLatch countDownLatch;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        boolean z9;
        ?? queryFinalized;
        boolean z10;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                i iVar = (i) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i7 = this.b;
                d0[] d0VarArr = (d0[]) this.n;
                int i10 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.r;
                ArrayList arrayList2 = this.c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.s;
                if (iVar.o.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i7].compress(compressFormat, iVar.l, d0VarArr[i7]);
                int i11 = d0VarArr[i7].b;
                try {
                    synchronized (iVar.h) {
                        h hVar = new h(i10);
                        hVar.c = (int) randomAccessFile.length();
                        arrayList2.add(hVar);
                        randomAccessFile.write(d0VarArr[i7].a, 0, i11);
                        hVar.b = i11;
                        d0VarArr[i7].b();
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        atomicBoolean.set(true);
                        throw th2;
                    }
                    atomicBoolean.set(true);
                }
                countDownLatchArr[i7].countDown();
                return;
            default:
                yr yrVar = (yr) this.e;
                int i12 = this.b;
                ArrayList arrayList3 = this.c;
                int i13 = this.d;
                a0.h hVar2 = (a0.h) this.f;
                ?? r62 = (a0.h) this.h;
                ArrayList arrayList4 = (ArrayList) this.n;
                ArrayList arrayList5 = (ArrayList) this.r;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.s;
                try {
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
                    Locale locale = Locale.US;
                    ?? r11 = 0;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i12 + " ORDER BY ord ASC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            long longValue = queryFinalized2.longValue(0);
                            if (longValue != -1) {
                                arrayList3.add(Long.valueOf(longValue));
                                if (m5.E(longValue)) {
                                    arrayList6.add(Long.valueOf(longValue));
                                } else {
                                    arrayList7.add(Long.valueOf(-longValue));
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            countDownLatch = countDownLatch2;
                            sQLiteCursor2 = queryFinalized2;
                        } catch (Throwable th3) {
                            th = th3;
                            countDownLatch = countDownLatch2;
                            sQLiteCursor2 = queryFinalized2;
                        }
                    }
                    queryFinalized2.dispose();
                    if (arrayList3.isEmpty() && i13 == 1) {
                        try {
                            queryFinalized = yrVar.getMessagesStorage().b.queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                            while (queryFinalized.next()) {
                                try {
                                    long longValue2 = queryFinalized.longValue(0);
                                    arrayList3.add(Long.valueOf(longValue2));
                                    if (m5.E(longValue2)) {
                                        arrayList6.add(Long.valueOf(longValue2));
                                    } else {
                                        arrayList7.add(Long.valueOf(-longValue2));
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLiteCursor2 = queryFinalized;
                                    countDownLatch = countDownLatch2;
                                    z9 = true;
                                    try {
                                        yrVar.o(e, z9);
                                        if (sQLiteCursor2 != null) {
                                        }
                                        countDownLatch.countDown();
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (sQLiteCursor2 != null) {
                                            sQLiteCursor2.dispose();
                                        }
                                        countDownLatch.countDown();
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLiteCursor2 = queryFinalized;
                                    countDownLatch = countDownLatch2;
                                    if (sQLiteCursor2 != null) {
                                    }
                                    countDownLatch.countDown();
                                    throw th;
                                }
                            }
                            queryFinalized.dispose();
                        } catch (Exception e13) {
                            e = e13;
                            countDownLatch = countDownLatch2;
                            z9 = true;
                            sQLiteCursor2 = null;
                            yrVar.o(e, z9);
                            if (sQLiteCursor2 != null) {
                            }
                            countDownLatch.countDown();
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                            countDownLatch = countDownLatch2;
                            sQLiteCursor2 = null;
                            if (sQLiteCursor2 != null) {
                            }
                            countDownLatch.countDown();
                            throw th;
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        queryFinalized = yrVar.b.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.folder_id = 0 ORDER BY d.pinned DESC, d.date DESC LIMIT 0,10", new Object[0]);
                        z10 = true;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.did IN(" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
                        z10 = false;
                    }
                    while (queryFinalized.next()) {
                        try {
                            long longValue3 = queryFinalized.longValue(r11);
                            if (!m5.D(longValue3)) {
                                if (z10) {
                                    arrayList3.add(Long.valueOf(longValue3));
                                }
                                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                tL_dialog.id = longValue3;
                                tL_dialog.top_message = queryFinalized.intValue(1);
                                tL_dialog.unread_count = queryFinalized.intValue(2);
                                tL_dialog.last_message_date = queryFinalized.intValue(3);
                                hVar2.k(tL_dialog, tL_dialog.id);
                                ?? byteBufferValue = queryFinalized.byteBufferValue(4);
                                if (byteBufferValue != 0) {
                                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r11), r11);
                                    arrayList = arrayList5;
                                    countDownLatch = countDownLatch2;
                                    try {
                                        TLdeserialize.readAttachPath(byteBufferValue, yrVar.getUserConfig().n);
                                        byteBufferValue.reuse();
                                        ij.M5(queryFinalized.intValue(5), TLdeserialize);
                                        TLdeserialize.id = queryFinalized.intValue(6);
                                        TLdeserialize.send_state = queryFinalized.intValue(7);
                                        int intValue = queryFinalized.intValue(8);
                                        if (intValue != 0) {
                                            tL_dialog.last_message_date = intValue;
                                        }
                                        long j3 = tL_dialog.id;
                                        TLdeserialize.dialog_id = j3;
                                        r62.k(TLdeserialize, j3);
                                        yr.e(TLdeserialize, arrayList6, arrayList7, null);
                                        countDownLatch2 = countDownLatch;
                                        arrayList5 = arrayList;
                                        r11 = 0;
                                    } catch (Exception e14) {
                                        e = e14;
                                        sQLiteCursor2 = queryFinalized;
                                        z9 = true;
                                        yrVar.o(e, z9);
                                        if (sQLiteCursor2 != null) {
                                        }
                                        countDownLatch.countDown();
                                        return;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLiteCursor2 = queryFinalized;
                                        if (sQLiteCursor2 != null) {
                                        }
                                        countDownLatch.countDown();
                                        throw th;
                                    }
                                }
                            }
                            arrayList = arrayList5;
                            countDownLatch = countDownLatch2;
                            countDownLatch2 = countDownLatch;
                            arrayList5 = arrayList;
                            r11 = 0;
                        } catch (Exception e15) {
                            e = e15;
                            countDownLatch = countDownLatch2;
                        } catch (Throwable th8) {
                            th = th8;
                            countDownLatch = countDownLatch2;
                        }
                    }
                    ArrayList arrayList8 = arrayList5;
                    countDownLatch = countDownLatch2;
                    sQLiteCursor = null;
                    queryFinalized.dispose();
                    if (!z10) {
                        try {
                            if (arrayList3.size() > hVar2.m()) {
                                int size = arrayList3.size();
                                for (int i14 = 0; i14 < size; i14++) {
                                    Long l10 = (Long) arrayList3.get(i14);
                                    long longValue4 = l10.longValue();
                                    if (hVar2.f(((Long) arrayList3.get(i14)).longValue()) == null) {
                                        TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                                        tL_dialog2.id = longValue4;
                                        hVar2.k(tL_dialog2, longValue4);
                                        if (m5.z(longValue4)) {
                                            long j10 = -longValue4;
                                            if (arrayList7.contains(Long.valueOf(j10))) {
                                                arrayList7.add(Long.valueOf(j10));
                                            }
                                        } else if (arrayList6.contains(l10)) {
                                            arrayList6.add(l10);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e16) {
                            e = e16;
                            sQLiteCursor2 = sQLiteCursor;
                            z9 = true;
                            yrVar.o(e, z9);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            countDownLatch.countDown();
                            return;
                        } catch (Throwable th9) {
                            th = th9;
                            sQLiteCursor2 = sQLiteCursor;
                            if (sQLiteCursor2 != null) {
                            }
                            countDownLatch.countDown();
                            throw th;
                        }
                    }
                    if (!arrayList7.isEmpty()) {
                        yrVar.Q(TextUtils.join(",", arrayList7), arrayList4);
                    }
                    if (!arrayList6.isEmpty()) {
                        yrVar.n0(arrayList6, arrayList8, false);
                    }
                } catch (Exception e17) {
                    e = e17;
                    countDownLatch = countDownLatch2;
                    sQLiteCursor = null;
                } catch (Throwable th10) {
                    th = th10;
                    countDownLatch = countDownLatch2;
                    sQLiteCursor = null;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public /* synthetic */ c(yr yrVar, int i7, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = yrVar;
        this.b = i7;
        this.c = arrayList;
        this.d = i10;
        this.f = hVar;
        this.h = hVar2;
        this.n = arrayList2;
        this.r = arrayList3;
        this.s = countDownLatch;
    }
}

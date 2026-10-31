package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ph(ui uiVar, boolean z10, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        int i10;
        long j10;
        int i11;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                boolean[] zArr = uiVar.w0;
                boolean z12 = this.c;
                zArr[z12 ? 1 : 0] = false;
                uiVar.x0[z12 ? 1 : 0] = true;
                return;
            default:
                ui uiVar2 = this.b;
                boolean z13 = this.c;
                ArrayList arrayList3 = new ArrayList();
                ?? r52 = null;
                int i12 = 0;
                long j11 = 0;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar2.getMessagesStorage().b;
                    StringBuilder sb2 = new StringBuilder("SELECT data, unread, date, hash, premium FROM stickers_featured WHERE emoji = ");
                    sb2.append(z13 ? 1 : 0);
                    sb2.append(" AND id = ");
                    sb2.append(z13 ? 2 : 1);
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                    try {
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                arrayList = new ArrayList();
                                try {
                                    int readInt32 = byteBufferValue.readInt32(false);
                                    for (int i13 = 0; i13 < readInt32; i13++) {
                                        arrayList.add(TLRPC.StickerSetCovered.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                                    }
                                    byteBufferValue.reuse();
                                    r52 = arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i10 = 0;
                                    r52 = queryFinalized;
                                    try {
                                        f8.g(th, true);
                                        z10 = false;
                                        j10 = j11;
                                        i11 = i10;
                                        arrayList2 = arrayList;
                                        uiVar2.t1(z13, arrayList2, arrayList3, z10, true, i11, j10);
                                        return;
                                    } finally {
                                        if (r52 != null) {
                                            r52.dispose();
                                        }
                                    }
                                }
                            }
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue2 != null) {
                                int readInt322 = byteBufferValue2.readInt32(false);
                                for (int i14 = 0; i14 < readInt322; i14++) {
                                    arrayList3.add(Long.valueOf(byteBufferValue2.readInt64(false)));
                                }
                                byteBufferValue2.reuse();
                            }
                            i10 = queryFinalized.intValue(2);
                            try {
                                j11 = queryFinalized.longValue(3);
                                z11 = queryFinalized.intValue(4) == 1;
                                i12 = i10;
                                r52 = r52;
                            } catch (Throwable th3) {
                                th = th3;
                                arrayList = r52;
                                r52 = queryFinalized;
                                f8.g(th, true);
                                z10 = false;
                                j10 = j11;
                                i11 = i10;
                                arrayList2 = arrayList;
                                uiVar2.t1(z13, arrayList2, arrayList3, z10, true, i11, j10);
                                return;
                            }
                        } else {
                            z11 = false;
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList4 = r52;
                        z10 = z11;
                        arrayList2 = arrayList4;
                        j10 = j11;
                        i11 = i12;
                    } catch (Throwable th4) {
                        th = th4;
                        arrayList = r52;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    arrayList = null;
                    i10 = 0;
                }
                uiVar2.t1(z13, arrayList2, arrayList3, z10, true, i11, j10);
                return;
        }
    }
}

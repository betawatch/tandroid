package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hh(li liVar, boolean z10, int i3) {
        this.a = i3;
        this.b = liVar;
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
        int i3;
        long j10;
        int i10;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        switch (this.a) {
            case 0:
                li liVar = this.b;
                boolean[] zArr = liVar.x0;
                boolean z12 = this.c;
                zArr[z12 ? 1 : 0] = false;
                liVar.y0[z12 ? 1 : 0] = true;
                return;
            default:
                li liVar2 = this.b;
                boolean z13 = this.c;
                ArrayList arrayList3 = new ArrayList();
                ?? r5 = null;
                int i11 = 0;
                long j11 = 0;
                try {
                    SQLiteDatabase sQLiteDatabase = liVar2.getMessagesStorage().b;
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
                                    for (int i12 = 0; i12 < readInt32; i12++) {
                                        arrayList.add(TLRPC.StickerSetCovered.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                                    }
                                    byteBufferValue.reuse();
                                    r5 = arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i3 = 0;
                                    r5 = queryFinalized;
                                    try {
                                        a8.g(th, true);
                                        z10 = false;
                                        j10 = j11;
                                        i10 = i3;
                                        arrayList2 = arrayList;
                                        liVar2.t1(z13, arrayList2, arrayList3, z10, true, i10, j10);
                                        return;
                                    } finally {
                                        if (r5 != null) {
                                            r5.dispose();
                                        }
                                    }
                                }
                            }
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue2 != null) {
                                int readInt322 = byteBufferValue2.readInt32(false);
                                for (int i13 = 0; i13 < readInt322; i13++) {
                                    arrayList3.add(Long.valueOf(byteBufferValue2.readInt64(false)));
                                }
                                byteBufferValue2.reuse();
                            }
                            i3 = queryFinalized.intValue(2);
                            try {
                                j11 = queryFinalized.longValue(3);
                                z11 = queryFinalized.intValue(4) == 1;
                                i11 = i3;
                                r5 = r5;
                            } catch (Throwable th3) {
                                th = th3;
                                arrayList = r5;
                                r5 = queryFinalized;
                                a8.g(th, true);
                                z10 = false;
                                j10 = j11;
                                i10 = i3;
                                arrayList2 = arrayList;
                                liVar2.t1(z13, arrayList2, arrayList3, z10, true, i10, j10);
                                return;
                            }
                        } else {
                            z11 = false;
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList4 = r5;
                        z10 = z11;
                        arrayList2 = arrayList4;
                        j10 = j11;
                        i10 = i11;
                    } catch (Throwable th4) {
                        th = th4;
                        arrayList = r5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    arrayList = null;
                    i3 = 0;
                }
                liVar2.t1(z13, arrayList2, arrayList3, z10, true, i10, j10);
                return;
        }
    }
}

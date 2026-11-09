package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class qh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qh(ui uiVar, boolean z9, int i7) {
        this.a = i7;
        this.b = uiVar;
        this.c = z9;
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
        int i7;
        long j3;
        int i10;
        boolean z9;
        ArrayList arrayList2;
        boolean z10;
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                boolean[] zArr = uiVar.w0;
                boolean z11 = this.c;
                zArr[z11 ? 1 : 0] = false;
                uiVar.x0[z11 ? 1 : 0] = true;
                return;
            default:
                ui uiVar2 = this.b;
                boolean z12 = this.c;
                ArrayList arrayList3 = new ArrayList();
                ?? r52 = null;
                int i11 = 0;
                long j10 = 0;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar2.getMessagesStorage().b;
                    StringBuilder sb2 = new StringBuilder("SELECT data, unread, date, hash, premium FROM stickers_featured WHERE emoji = ");
                    sb2.append(z12 ? 1 : 0);
                    sb2.append(" AND id = ");
                    sb2.append(z12 ? 2 : 1);
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
                                    r52 = arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i7 = 0;
                                    r52 = queryFinalized;
                                    try {
                                        a8.g(th, true);
                                        z9 = false;
                                        j3 = j10;
                                        i10 = i7;
                                        arrayList2 = arrayList;
                                        uiVar2.t1(z12, arrayList2, arrayList3, z9, true, i10, j3);
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
                                for (int i13 = 0; i13 < readInt322; i13++) {
                                    arrayList3.add(Long.valueOf(byteBufferValue2.readInt64(false)));
                                }
                                byteBufferValue2.reuse();
                            }
                            i7 = queryFinalized.intValue(2);
                            try {
                                j10 = queryFinalized.longValue(3);
                                z10 = queryFinalized.intValue(4) == 1;
                                i11 = i7;
                                r52 = r52;
                            } catch (Throwable th3) {
                                th = th3;
                                arrayList = r52;
                                r52 = queryFinalized;
                                a8.g(th, true);
                                z9 = false;
                                j3 = j10;
                                i10 = i7;
                                arrayList2 = arrayList;
                                uiVar2.t1(z12, arrayList2, arrayList3, z9, true, i10, j3);
                                return;
                            }
                        } else {
                            z10 = false;
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList4 = r52;
                        z9 = z10;
                        arrayList2 = arrayList4;
                        j3 = j10;
                        i10 = i11;
                    } catch (Throwable th4) {
                        th = th4;
                        arrayList = r52;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    arrayList = null;
                    i7 = 0;
                }
                uiVar2.t1(z12, arrayList2, arrayList3, z9, true, i10, j3);
                return;
        }
    }
}

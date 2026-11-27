// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class lr6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lr6(ls6 ls6Var, boolean z, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        int i;
        ArrayList arrayList;
        long j;
        int i2;
        boolean z;
        int i3;
        switch (this.a) {
            case 0:
                ls6 ls6Var = this.b;
                boolean[] zArr = ls6Var.x0;
                boolean z2 = this.c;
                zArr[z2 ? 1 : 0] = false;
                ls6Var.y0[z2 ? 1 : 0] = true;
                return;
            default:
                ls6 ls6Var2 = this.b;
                boolean z3 = this.c;
                ArrayList arrayList2 = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                r5 = null;
                r5 = null;
                ArrayList arrayList3 = null;
                long j2 = 0;
                try {
                    SQLiteDatabase sQLiteDatabase = ls6Var2.getMessagesStorage().b;
                    StringBuilder sb = new StringBuilder("SELECT data, unread, date, hash, premium FROM stickers_featured WHERE emoji = ");
                    sb.append(z3 ? 1 : 0);
                    sb.append(" AND id = ");
                    sb.append(z3 ? 2 : 1);
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
                    try {
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                arrayList = new ArrayList();
                                try {
                                    int readInt32 = byteBufferValue.readInt32(false);
                                    for (int i4 = 0; i4 < readInt32; i4++) {
                                        arrayList.add(TLRPC.StickerSetCovered.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                                    }
                                    byteBufferValue.reuse();
                                    arrayList3 = arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i = 0;
                                    sQLiteCursor = queryFinalized;
                                    try {
                                        cc4.g(th, true);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        i2 = i;
                                        arrayList3 = arrayList;
                                        j = j2;
                                        z = 0;
                                        ls6Var2.u1(z3, arrayList3, arrayList2, z, true, i2, j);
                                        return;
                                    } finally {
                                    }
                                }
                            }
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue2 != null) {
                                int readInt322 = byteBufferValue2.readInt32(false);
                                for (int i5 = 0; i5 < readInt322; i5++) {
                                    arrayList2.add(Long.valueOf(byteBufferValue2.readInt64(false)));
                                }
                                byteBufferValue2.reuse();
                            }
                            int intValue = queryFinalized.intValue(2);
                            try {
                                j2 = queryFinalized.longValue(3);
                                r1 = intValue;
                                i3 = queryFinalized.intValue(4) == 1 ? 1 : 0;
                            } catch (Throwable th3) {
                                i = intValue;
                                th = th3;
                                arrayList = arrayList3;
                                sQLiteCursor = queryFinalized;
                                cc4.g(th, true);
                                if (sQLiteCursor != null) {
                                }
                                i2 = i;
                                arrayList3 = arrayList;
                                j = j2;
                                z = 0;
                                ls6Var2.u1(z3, arrayList3, arrayList2, z, true, i2, j);
                                return;
                            }
                        } else {
                            i3 = 0;
                        }
                        queryFinalized.dispose();
                        i2 = r1;
                        j = j2;
                        z = i3;
                    } catch (Throwable th4) {
                        th = th4;
                        i = 0;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i = 0;
                    arrayList = null;
                }
                ls6Var2.u1(z3, arrayList3, arrayList2, z, true, i2, j);
                return;
        }
    }
}

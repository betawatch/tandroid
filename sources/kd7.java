// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kd7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ kd7(jf7 jf7Var, long j, int i, TLRPC.InputChannel inputChannel, int i2, long j2) {
        this.b = jf7Var;
        this.c = j;
        this.e = i;
        this.h = inputChannel;
        this.f = i2;
        this.d = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e8, code lost:
    
        if (r12 != null) goto L48;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        ts8 ts8Var;
        SQLiteCursor sQLiteCursor2;
        boolean z;
        int i;
        boolean z2;
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                this.b.getMessagesController().y3(-this.c, this.e, (TLRPC.InputChannel) obj, this.f, this.d, true);
                return;
            case 1:
                this.b.X1(this.c, this.d, (Integer) obj, this.e, this.f, 0, 0);
                return;
            default:
                ts8 ts8Var2 = (ts8) obj;
                final int i2 = this.e;
                final jf7 jf7Var = this.b;
                final long j = this.c;
                long j2 = this.d;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = jf7Var.b;
                        if (i2 <= 0) {
                            try {
                                sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j));
                                i = 1;
                                z2 = false;
                            } catch (Exception e) {
                                e = e;
                                ts8Var = ts8Var2;
                                z = true;
                                sQLiteCursor2 = null;
                                cc4.g(e, z);
                                break;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = null;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } else {
                            z2 = false;
                            i = 1;
                            sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND mid <= ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j), Integer.valueOf(i2));
                        }
                        try {
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            while (sQLiteCursor2.next()) {
                                boolean z3 = z2;
                                NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(z3 ? 1 : 0);
                                if (byteBufferValue != null) {
                                    ts8Var = ts8Var2;
                                    try {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z3), z3);
                                        TLdeserialize.readAttachPath(byteBufferValue, j2);
                                        byteBufferValue.reuse();
                                        TLdeserialize.id = sQLiteCursor2.intValue(i);
                                        TLdeserialize.dialog_id = -j;
                                        jf7.d(TLdeserialize, arrayList4, arrayList5, null);
                                        arrayList.add(TLdeserialize);
                                    } catch (Exception e2) {
                                        e = e2;
                                        z = true;
                                        cc4.g(e, z);
                                    }
                                } else {
                                    ts8Var = ts8Var2;
                                }
                                ts8Var2 = ts8Var;
                                z2 = false;
                                i = 1;
                            }
                            ts8Var = ts8Var2;
                            sQLiteCursor2.dispose();
                            if (!arrayList.isEmpty()) {
                                if (!arrayList4.isEmpty()) {
                                    jf7Var.k0(arrayList4, arrayList2, false);
                                }
                                if (!arrayList5.isEmpty()) {
                                    jf7Var.P(TextUtils.join(",", arrayList5), arrayList3);
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            ts8Var = ts8Var2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e4) {
                    e = e4;
                    ts8Var = ts8Var2;
                    sQLiteCursor2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                sQLiteCursor2.dispose();
                final int i3 = this.f;
                final ts8 ts8Var3 = ts8Var;
                hl.c3(new Runnable() { // from class: ss8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ts8.this.d(i3, i2, j, jf7Var, arrayList);
                    }
                });
                return;
        }
    }

    public /* synthetic */ kd7(jf7 jf7Var, long j, long j2, Integer num, int i, int i2) {
        this.b = jf7Var;
        this.c = j;
        this.d = j2;
        this.h = num;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ kd7(ts8 ts8Var, int i, jf7 jf7Var, long j, long j2, int i2) {
        this.h = ts8Var;
        this.e = i;
        this.b = jf7Var;
        this.c = j;
        this.d = j2;
        this.f = i2;
    }
}

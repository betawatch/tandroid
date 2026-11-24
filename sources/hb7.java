// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hb7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ hb7(ad7 ad7Var, long j, int i, TLRPC.InputChannel inputChannel, int i2, long j2) {
        this.b = ad7Var;
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
        hp8 hp8Var;
        SQLiteCursor sQLiteCursor2;
        boolean z;
        int i;
        boolean z2;
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                this.b.getMessagesController().r3(-this.c, this.e, (TLRPC.InputChannel) obj, this.f, this.d, true);
                return;
            case 1:
                this.b.X1(this.c, this.d, (Integer) obj, this.e, this.f, 0, 0);
                return;
            default:
                hp8 hp8Var2 = (hp8) obj;
                final int i2 = this.e;
                final ad7 ad7Var = this.b;
                final long j = this.c;
                long j2 = this.d;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        if (i2 <= 0) {
                            try {
                                sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j));
                                i = 1;
                                z2 = false;
                            } catch (Exception e) {
                                e = e;
                                hp8Var = hp8Var2;
                                z = true;
                                sQLiteCursor2 = null;
                                fa4.g(e, z);
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
                                    hp8Var = hp8Var2;
                                    try {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z3), z3);
                                        TLdeserialize.readAttachPath(byteBufferValue, j2);
                                        byteBufferValue.reuse();
                                        TLdeserialize.id = sQLiteCursor2.intValue(i);
                                        TLdeserialize.dialog_id = -j;
                                        ad7.d(TLdeserialize, arrayList4, arrayList5, null);
                                        arrayList.add(TLdeserialize);
                                    } catch (Exception e2) {
                                        e = e2;
                                        z = true;
                                        fa4.g(e, z);
                                    }
                                } else {
                                    hp8Var = hp8Var2;
                                }
                                hp8Var2 = hp8Var;
                                z2 = false;
                                i = 1;
                            }
                            hp8Var = hp8Var2;
                            sQLiteCursor2.dispose();
                            if (!arrayList.isEmpty()) {
                                if (!arrayList4.isEmpty()) {
                                    ad7Var.k0(arrayList4, arrayList2, false);
                                }
                                if (!arrayList5.isEmpty()) {
                                    ad7Var.P(TextUtils.join(",", arrayList5), arrayList3);
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            hp8Var = hp8Var2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e4) {
                    e = e4;
                    hp8Var = hp8Var2;
                    sQLiteCursor2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                sQLiteCursor2.dispose();
                final int i3 = this.f;
                final hp8 hp8Var3 = hp8Var;
                gl.d3(new Runnable() { // from class: gp8
                    @Override // java.lang.Runnable
                    public final void run() {
                        hp8.this.d(i3, i2, j, ad7Var, arrayList);
                    }
                });
                return;
        }
    }

    public /* synthetic */ hb7(ad7 ad7Var, long j, long j2, Integer num, int i, int i2) {
        this.b = ad7Var;
        this.c = j;
        this.d = j2;
        this.h = num;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ hb7(hp8 hp8Var, int i, ad7 ad7Var, long j, long j2, int i2) {
        this.h = hp8Var;
        this.e = i;
        this.b = ad7Var;
        this.c = j;
        this.d = j2;
        this.f = i2;
    }
}

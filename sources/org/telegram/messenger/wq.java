package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class wq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    public /* synthetic */ wq(hs hsVar, long j10, long j11, String str, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = j10;
        this.d = j11;
        this.e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0113, code lost:
    
        if (r13 == 0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r52 = 0;
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                long j10 = this.c;
                long j11 = this.d;
                String str = this.e;
                ArrayList arrayList = new ArrayList();
                SQLiteCursor sQLiteCursor = 0;
                sQLiteCursor = 0;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = " + j10 + " ORDER BY date DESC LIMIT 20", new Object[0]);
                        while (sQLiteCursor.next()) {
                            int intValue = sQLiteCursor.intValue(r52);
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r52), r52);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, d20.i(hsVar.currentAccount).n);
                            }
                            if (o5.o(TLdeserialize.from_id) == j11) {
                                TLdeserialize.flags2 |= TLObject.FLAG_12;
                                TLdeserialize.from_rank = str;
                                arrayList.add(new Pair(Integer.valueOf(intValue), TLdeserialize));
                            }
                            r52 = 0;
                        }
                        sQLiteCursor.dispose();
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            int intValue2 = ((Integer) ((Pair) arrayList.get(i10)).first).intValue();
                            TLRPC.Message message = (TLRPC.Message) ((Pair) arrayList.get(i10)).second;
                            SQLitePreparedStatement executeFast = hsVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            jj.q5(message);
                            message.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindInteger(2, intValue2);
                            executeFast.bindLong(3, j10);
                            executeFast.step();
                            executeFast.dispose();
                            nativeByteBuffer.reuse();
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    if (arrayList.size() > 0) {
                        i0.g3(new wq(hsVar, j10, j11, str, 1));
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != 0) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            default:
                hs hsVar2 = this.b;
                zs.f(hsVar2.currentAccount).k(2, 0);
                zs.f(hsVar2.currentAccount).k(zs.W3, Long.valueOf(-this.c), Long.valueOf(this.d), this.e);
                return;
        }
    }
}

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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    public /* synthetic */ mq(ur urVar, long j3, long j10, String str, int i7) {
        this.a = i7;
        this.b = urVar;
        this.c = j3;
        this.d = j10;
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
                ur urVar = this.b;
                long j3 = this.c;
                long j10 = this.d;
                String str = this.e;
                ArrayList arrayList = new ArrayList();
                SQLiteCursor sQLiteCursor = 0;
                sQLiteCursor = 0;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = urVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = " + j3 + " ORDER BY date DESC LIMIT 20", new Object[0]);
                        while (sQLiteCursor.next()) {
                            int intValue = sQLiteCursor.intValue(r52);
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r52), r52);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, k10.i(urVar.currentAccount).n);
                            }
                            if (n5.o(TLdeserialize.from_id) == j10) {
                                TLdeserialize.flags2 |= TLObject.FLAG_12;
                                TLdeserialize.from_rank = str;
                                arrayList.add(new Pair(Integer.valueOf(intValue), TLdeserialize));
                            }
                            r52 = 0;
                        }
                        sQLiteCursor.dispose();
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            int intValue2 = ((Integer) ((Pair) arrayList.get(i7)).first).intValue();
                            TLRPC.Message message = (TLRPC.Message) ((Pair) arrayList.get(i7)).second;
                            SQLitePreparedStatement executeFast = urVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            gj.q5(message);
                            message.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindInteger(2, intValue2);
                            executeFast.bindLong(3, j3);
                            executeFast.step();
                            executeFast.dispose();
                            nativeByteBuffer.reuse();
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    if (arrayList.size() > 0) {
                        g0.g3(new mq(urVar, j3, j10, str, 1));
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
                ur urVar2 = this.b;
                ls.f(urVar2.currentAccount).k(2, 0);
                ls.f(urVar2.currentAccount).k(ls.Z3, Long.valueOf(-this.c), Long.valueOf(this.d), this.e);
                return;
        }
    }
}

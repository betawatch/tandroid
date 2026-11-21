package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;
    public final /* synthetic */ fj c;

    public /* synthetic */ w5(a6 a6Var, fj fjVar, int i7) {
        this.a = i7;
        this.b = a6Var;
        this.c = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a6 a6Var = this.b;
                fj fjVar = this.c;
                try {
                    Locale locale = Locale.ENGLISH;
                    a6Var.getMessagesStorage().b.executeFast("UPDATE downloading_documents SET state = 1, date = " + System.currentTimeMillis() + " WHERE hash = " + fjVar.F0().dc_id + " AND id = " + fjVar.F0().id).stepThis().dispose();
                    a6Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                a6 a6Var2 = this.b;
                fj fjVar2 = this.c;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(fjVar2.k.getObjectSize());
                    fjVar2.k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = a6Var2.getMessagesStorage().b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, fjVar2.F0().dc_id);
                    executeFast.bindLong(3, fjVar2.F0().id);
                    executeFast.bindInteger(4, 0);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            default:
                a6 a6Var3 = this.b;
                fj fjVar3 = this.c;
                try {
                    SQLitePreparedStatement executeFast2 = a6Var3.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, fjVar3.F0().dc_id);
                    executeFast2.bindLong(2, fjVar3.F0().id);
                    executeFast2.step();
                    executeFast2.dispose();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
        }
    }
}

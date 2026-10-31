package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;
    public final /* synthetic */ jj c;

    public /* synthetic */ x5(b6 b6Var, jj jjVar, int i10) {
        this.a = i10;
        this.b = b6Var;
        this.c = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b6 b6Var = this.b;
                jj jjVar = this.c;
                try {
                    Locale locale = Locale.ENGLISH;
                    b6Var.getMessagesStorage().b.executeFast("UPDATE downloading_documents SET state = 1, date = " + System.currentTimeMillis() + " WHERE hash = " + jjVar.F0().dc_id + " AND id = " + jjVar.F0().id).stepThis().dispose();
                    b6Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                b6 b6Var2 = this.b;
                jj jjVar2 = this.c;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(jjVar2.k.getObjectSize());
                    jjVar2.k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = b6Var2.getMessagesStorage().b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, jjVar2.F0().dc_id);
                    executeFast.bindLong(3, jjVar2.F0().id);
                    executeFast.bindInteger(4, 0);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            default:
                b6 b6Var3 = this.b;
                jj jjVar3 = this.c;
                try {
                    SQLitePreparedStatement executeFast2 = b6Var3.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, jjVar3.F0().dc_id);
                    executeFast2.bindLong(2, jjVar3.F0().id);
                    executeFast2.step();
                    executeFast2.dispose();
                    break;
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
        }
    }
}

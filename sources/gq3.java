// default package

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class gq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lq3 b;
    public final /* synthetic */ r47 c;

    public /* synthetic */ gq3(lq3 lq3Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = lq3Var;
        this.c = r47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        r47 r47Var = this.c;
        lq3 lq3Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = lq3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast.bindInteger(1, r47Var.F0().dc_id);
                    executeFast.bindLong(2, r47Var.F0().id);
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    Locale locale = Locale.ENGLISH;
                    lq3Var.getMessagesStorage().b.executeFast("UPDATE downloading_documents SET state = 1, date = " + System.currentTimeMillis() + " WHERE hash = " + r47Var.F0().dc_id + " AND id = " + r47Var.F0().id).stepThis().dispose();
                    lq3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            default:
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(r47Var.k.getObjectSize());
                    r47Var.k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast2 = lq3Var.getMessagesStorage().b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast2.bindByteBuffer(1, nativeByteBuffer);
                    executeFast2.bindInteger(2, r47Var.F0().dc_id);
                    executeFast2.bindLong(3, r47Var.F0().id);
                    executeFast2.bindInteger(4, 0);
                    executeFast2.bindLong(5, System.currentTimeMillis());
                    executeFast2.step();
                    executeFast2.dispose();
                    nativeByteBuffer.reuse();
                    break;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
        }
    }
}

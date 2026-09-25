package gg;

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.eo0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ q(eo0 eo0Var, long j3, int i10) {
        this.a = i10;
        this.b = eo0Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                i0 i0Var = this.b;
                i0Var.getClass();
                try {
                    MessagesStorage.getInstance(i0Var.s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                long j10 = this.c;
                i0 i0Var2 = this.b;
                i0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i0Var2.s0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j10);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}

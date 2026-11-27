// default package

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class dr6 implements Runnable {
    public final /* synthetic */ ls6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ double d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dr6(ls6 ls6Var, long j, int i, double d) {
        this.a = ls6Var;
        this.b = j;
        this.c = i;
        this.d = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ls6 ls6Var = this.a;
        long j = this.b;
        byte b = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, b);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ li a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ double d;

    public /* synthetic */ sg(li liVar, long j10, int i3, double d) {
        this.a = liVar;
        this.b = j10;
        this.c = i3;
        this.d = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        li liVar = this.a;
        long j10 = this.b;
        int i3 = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = liVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindInteger(2, i3);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}

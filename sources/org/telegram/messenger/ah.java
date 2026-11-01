package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ vi a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ double d;

    public /* synthetic */ ah(vi viVar, long j10, int i10, double d) {
        this.a = viVar;
        this.b = j10;
        this.c = i10;
        this.d = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi viVar = this.a;
        long j10 = this.b;
        int i10 = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = viVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindInteger(2, i10);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}

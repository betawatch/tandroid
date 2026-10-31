package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ ui a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ double d;

    public /* synthetic */ zg(ui uiVar, long j10, int i10, double d) {
        this.a = uiVar;
        this.b = j10;
        this.c = i10;
        this.d = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ui uiVar = this.a;
        long j10 = this.b;
        int i10 = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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

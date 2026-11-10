package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ ui a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ double d;

    public /* synthetic */ ah(ui uiVar, long j3, int i7, double d) {
        this.a = uiVar;
        this.b = j3;
        this.c = i7;
        this.d = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ui uiVar = this.a;
        long j3 = this.b;
        int i7 = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j3);
            executeFast.bindInteger(2, i7);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}

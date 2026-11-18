package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bh implements Runnable {
    public final /* synthetic */ ri a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ double d;

    public /* synthetic */ bh(ri riVar, long j3, int i7, double d) {
        this.a = riVar;
        this.b = j3;
        this.c = i7;
        this.d = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri riVar = this.a;
        long j3 = this.b;
        int i7 = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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

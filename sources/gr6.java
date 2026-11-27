// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class gr6 implements Runnable {
    public final /* synthetic */ ls6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gr6(ls6 ls6Var, long j, int i) {
        this.a = ls6Var;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ls6 ls6Var = this.a;
        long j = this.b;
        byte b = this.c;
        try {
            SQLiteDatabase sQLiteDatabase = ls6Var.getMessagesStorage().b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j + " AND type = " + ((int) b)).stepThis().dispose();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class m6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o6b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ m6b(o6b o6bVar, long j, int i, byte b) {
        this.a = b;
        this.b = o6bVar;
        this.c = j;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        o6b o6bVar = this.b;
        switch (b) {
            case 0:
                jf7 jf7Var = o6bVar.b;
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j + " AND story_id = " + i).stepThis().dispose();
                    break;
                } catch (Throwable th) {
                    jf7Var.n(th, true);
                    return;
                }
            default:
                jf7 jf7Var2 = o6bVar.b;
                SQLiteDatabase sQLiteDatabase2 = jf7Var2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("REPLACE INTO stories_counter VALUES(" + j + ", 0, " + i + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    jf7Var2.n(th2, true);
                }
        }
    }
}

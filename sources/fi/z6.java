package fi;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.ur;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ z6(c7 c7Var, long j3, int i7, int i10) {
        this.a = i10;
        this.b = c7Var;
        this.c = j3;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                int i7 = this.d;
                ur urVar = this.b.b;
                SQLiteDatabase sQLiteDatabase = urVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i7 + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    urVar.o(th2, true);
                    return;
                }
            default:
                long j10 = this.c;
                int i10 = this.d;
                ur urVar2 = this.b.b;
                SQLiteDatabase sQLiteDatabase2 = urVar2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                    break;
                } catch (Throwable th3) {
                    urVar2.o(th3, true);
                }
        }
    }
}

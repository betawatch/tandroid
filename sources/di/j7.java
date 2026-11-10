package di;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.yr;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ j7(m7 m7Var, long j3, int i7, int i10) {
        this.a = i10;
        this.b = m7Var;
        this.c = j3;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                int i7 = this.d;
                yr yrVar = this.b.b;
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i7 + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    yrVar.o(th2, true);
                    return;
                }
            default:
                long j10 = this.c;
                int i10 = this.d;
                yr yrVar2 = this.b.b;
                SQLiteDatabase sQLiteDatabase2 = yrVar2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                    break;
                } catch (Throwable th3) {
                    yrVar2.o(th3, true);
                }
        }
    }
}

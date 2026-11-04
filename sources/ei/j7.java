package ei;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.qr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ j7(m7 m7Var, long j10, int i3, int i10) {
        this.a = i10;
        this.b = m7Var;
        this.c = j10;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                int i3 = this.d;
                qr qrVar = this.b.b;
                SQLiteDatabase sQLiteDatabase = qrVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i3 + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    qrVar.o(th2, true);
                    return;
                }
            default:
                long j11 = this.c;
                int i10 = this.d;
                qr qrVar2 = this.b.b;
                SQLiteDatabase sQLiteDatabase2 = qrVar2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j11 + " AND story_id = " + i10).stepThis().dispose();
                    break;
                } catch (Throwable th3) {
                    qrVar2.o(th3, true);
                }
        }
    }
}

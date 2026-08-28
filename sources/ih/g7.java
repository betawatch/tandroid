package ih;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ g7(i7 i7Var, long j10, int i9, int i10) {
        this.a = i10;
        this.b = i7Var;
        this.c = j10;
        this.d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                int i9 = this.d;
                MessagesStorage messagesStorage = this.b.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i9).stepThis().dispose();
                    break;
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            default:
                long j11 = this.c;
                int i10 = this.d;
                MessagesStorage messagesStorage2 = this.b.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("REPLACE INTO stories_counter VALUES(" + j11 + ", 0, " + i10 + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage2.checkSQLException(th2);
                }
        }
    }
}

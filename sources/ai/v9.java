package ai;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ v9(y9 y9Var, long j3, int i10, int i11) {
        this.a = i11;
        this.b = y9Var;
        this.c = j3;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.b.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i10 + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            default:
                long j10 = this.c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.b.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i11).stepThis().dispose();
                    break;
                } catch (Throwable th3) {
                    messagesStorage2.checkSQLException(th3);
                }
        }
    }
}

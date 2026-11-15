package fi;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.vr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ c7(f7 f7Var, long j3, int i7, int i10) {
        this.a = i10;
        this.b = f7Var;
        this.c = j3;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                int i7 = this.d;
                vr vrVar = this.b.b;
                SQLiteDatabase sQLiteDatabase = vrVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i7 + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    vrVar.o(th2, true);
                    return;
                }
            default:
                long j10 = this.c;
                int i10 = this.d;
                vr vrVar2 = this.b.b;
                SQLiteDatabase sQLiteDatabase2 = vrVar2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                    break;
                } catch (Throwable th3) {
                    vrVar2.o(th3, true);
                }
        }
    }
}

package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class zq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ nr d;

    public /* synthetic */ zq(tr trVar, long j3, nr nrVar, int i7) {
        this.a = i7;
        this.b = trVar;
        this.c = j3;
        this.d = nrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0051 A[DONT_GENERATE, FINALLY_INSNS] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        final nr nrVar = this.d;
        long j3 = this.c;
        tr trVar = this.b;
        final int i10 = 1;
        try {
            switch (i7) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = trVar.b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j3, new Object[0]);
                            r6 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                            sQLiteCursor.dispose();
                            g0.g3(new Runnable() { // from class: org.telegram.messenger.oq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            nrVar.a(r2);
                                            break;
                                        default:
                                            nrVar.a(r2);
                                            break;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            trVar.o(e10, true);
                            if (sQLiteCursor == null) {
                                return;
                            }
                        }
                        sQLiteCursor.dispose();
                        return;
                    } finally {
                    }
                default:
                    try {
                        if (trVar.K.f(j3) == null) {
                            sQLiteCursor = trVar.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j3));
                            r8 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        g0.g3(new Runnable() { // from class: org.telegram.messenger.oq
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        nrVar.a(r2);
                                        break;
                                    default:
                                        nrVar.a(r2);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        trVar.o(e11, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
            }
        } finally {
        }
    }
}

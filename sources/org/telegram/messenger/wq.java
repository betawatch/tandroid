package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class wq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ kr d;

    public /* synthetic */ wq(qr qrVar, long j10, kr krVar, int i3) {
        this.a = i3;
        this.b = qrVar;
        this.c = j10;
        this.d = krVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0051 A[DONT_GENERATE, FINALLY_INSNS] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3 = this.a;
        SQLiteCursor sQLiteCursor = null;
        final kr krVar = this.d;
        long j10 = this.c;
        qr qrVar = this.b;
        final int i10 = 1;
        try {
            switch (i3) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = qrVar.b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                            r6 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                            sQLiteCursor.dispose();
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.kq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            krVar.a(r2);
                                            break;
                                        default:
                                            krVar.a(r2);
                                            break;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            qrVar.o(e10, true);
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
                        if (qrVar.K.f(j10) == null) {
                            sQLiteCursor = qrVar.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                            r8 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.kq
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        krVar.a(r2);
                                        break;
                                    default:
                                        krVar.a(r2);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        qrVar.o(e11, true);
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

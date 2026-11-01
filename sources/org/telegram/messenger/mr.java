package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class mr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ long c;
    public final /* synthetic */ cs d;

    public /* synthetic */ mr(is isVar, long j10, cs csVar, int i10) {
        this.a = i10;
        this.b = isVar;
        this.c = j10;
        this.d = csVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0051 A[DONT_GENERATE, FINALLY_INSNS] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10 = this.a;
        SQLiteCursor sQLiteCursor = null;
        final cs csVar = this.d;
        long j10 = this.c;
        is isVar = this.b;
        final int i11 = 1;
        try {
            switch (i10) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = isVar.b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                            r6 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                            sQLiteCursor.dispose();
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.zq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            csVar.a(r2);
                                            break;
                                        default:
                                            csVar.a(r2);
                                            break;
                                    }
                                }
                            });
                        } catch (Exception e) {
                            isVar.o(e, true);
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
                        if (isVar.J.f(j10) == null) {
                            sQLiteCursor = isVar.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                            r8 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        i0.g3(new Runnable() { // from class: org.telegram.messenger.zq
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        csVar.a(r2);
                                        break;
                                    default:
                                        csVar.a(r2);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e7) {
                        isVar.o(e7, true);
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

package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class er implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ sr d;

    public /* synthetic */ er(yr yrVar, long j3, sr srVar, int i7) {
        this.a = i7;
        this.b = yrVar;
        this.c = j3;
        this.d = srVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0051 A[DONT_GENERATE, FINALLY_INSNS] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        final sr srVar = this.d;
        long j3 = this.c;
        yr yrVar = this.b;
        final int i10 = 1;
        try {
            switch (i7) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = yrVar.b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j3, new Object[0]);
                            r6 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                            sQLiteCursor.dispose();
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.tq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            srVar.a(r2);
                                            break;
                                        default:
                                            srVar.a(r2);
                                            break;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            yrVar.o(e10, true);
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
                        if (yrVar.J.f(j3) == null) {
                            sQLiteCursor = yrVar.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j3));
                            r8 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.tq
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        srVar.a(r2);
                                        break;
                                    default:
                                        srVar.a(r2);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        yrVar.o(e11, true);
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

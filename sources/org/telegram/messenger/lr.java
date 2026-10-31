package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bs d;

    public /* synthetic */ lr(hs hsVar, long j10, bs bsVar, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = j10;
        this.d = bsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0051 A[DONT_GENERATE, FINALLY_INSNS] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10 = this.a;
        SQLiteCursor sQLiteCursor = null;
        final bs bsVar = this.d;
        long j10 = this.c;
        hs hsVar = this.b;
        final int i11 = 1;
        try {
            switch (i10) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = hsVar.b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                            r6 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                            sQLiteCursor.dispose();
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.yq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            bsVar.a(r2);
                                            break;
                                        default:
                                            bsVar.a(r2);
                                            break;
                                    }
                                }
                            });
                        } catch (Exception e) {
                            hsVar.o(e, true);
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
                        if (hsVar.J.f(j10) == null) {
                            sQLiteCursor = hsVar.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                            r8 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        i0.g3(new Runnable() { // from class: org.telegram.messenger.yq
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        bsVar.a(r2);
                                        break;
                                    default:
                                        bsVar.a(r2);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e7) {
                        hsVar.o(e7, true);
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

package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class ar implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ pr d;

    public /* synthetic */ ar(vr vrVar, long j3, pr prVar, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.c = j3;
        this.d = prVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0051 A[DONT_GENERATE, FINALLY_INSNS] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        final pr prVar = this.d;
        long j3 = this.c;
        vr vrVar = this.b;
        final int i10 = 1;
        try {
            switch (i7) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = vrVar.b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j3, new Object[0]);
                            r6 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                            sQLiteCursor.dispose();
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.qq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            prVar.a(r2);
                                            break;
                                        default:
                                            prVar.a(r2);
                                            break;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            vrVar.o(e10, true);
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
                        if (vrVar.K.f(j3) == null) {
                            sQLiteCursor = vrVar.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j3));
                            r8 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.qq
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        prVar.a(r2);
                                        break;
                                    default:
                                        prVar.a(r2);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        vrVar.o(e11, true);
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

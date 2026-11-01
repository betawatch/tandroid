package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class co implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ co(wp wpVar, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.ng ngVar) {
        this.h = wpVar;
        this.c = j10;
        this.b = i10;
        this.e = i11;
        this.d = j11;
        this.n = tL_messages_affectedHistory;
        this.f = z10;
        this.r = ngVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (0 == 0) goto L22;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                final wp wpVar = (wp) this.h;
                final long j10 = this.c;
                final int i10 = this.b;
                final int i11 = this.e;
                final TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) this.n;
                final org.telegram.ui.ng ngVar = (org.telegram.ui.ng) this.r;
                is messagesStorage = wpVar.getMessagesStorage();
                messagesStorage.getClass();
                final ArrayList arrayList = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = messagesStorage.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid FROM messages_v2 WHERE uid = " + j10 + " AND date >= " + i10 + " AND date <= " + i11, new Object[0]);
                        while (sQLiteCursor.next()) {
                            try {
                                arrayList.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                            } catch (Exception e) {
                                messagesStorage.o(e, true);
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Exception e7) {
                        messagesStorage.o(e7, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    wpVar.getMessagesStorage().P0(j10, arrayList, false, true, 0, 0);
                    wpVar.getMessagesStorage().R1(j10, 0L, arrayList, null);
                    final long j11 = this.d;
                    final boolean z10 = this.f;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.io
                        @Override // java.lang.Runnable
                        public final void run() {
                            wp wpVar2 = wp.this;
                            at notificationCenter = wpVar2.getNotificationCenter();
                            long j12 = j11;
                            notificationCenter.k(at.w, arrayList, Long.valueOf(j12), Boolean.FALSE);
                            int i12 = tL_messages_affectedHistory.offset;
                            org.telegram.ui.ng ngVar2 = ngVar;
                            if (i12 > 0) {
                                wpVar2.d0(j10, j12, i10, i11, z10, ngVar2);
                            } else {
                                ngVar2.run();
                            }
                        }
                    });
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.b, this.c, this.d, this.e, this.f, (Context) this.n, (String) this.r);
                return;
        }
    }

    public /* synthetic */ co(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = i11;
        this.f = z10;
        this.n = context;
        this.r = str;
    }
}

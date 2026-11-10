package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class xn implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ xn(qp qpVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z9, org.telegram.ui.xf xfVar) {
        this.h = qpVar;
        this.c = j3;
        this.b = i7;
        this.e = i10;
        this.d = j10;
        this.n = tL_messages_affectedHistory;
        this.f = z9;
        this.r = xfVar;
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
                final qp qpVar = (qp) this.h;
                final long j3 = this.c;
                final int i7 = this.b;
                final int i10 = this.e;
                final TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) this.n;
                final org.telegram.ui.xf xfVar = (org.telegram.ui.xf) this.r;
                yr messagesStorage = qpVar.getMessagesStorage();
                messagesStorage.getClass();
                final ArrayList arrayList = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = messagesStorage.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid FROM messages_v2 WHERE uid = " + j3 + " AND date >= " + i7 + " AND date <= " + i10, new Object[0]);
                        while (sQLiteCursor.next()) {
                            try {
                                arrayList.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                            } catch (Exception e10) {
                                messagesStorage.o(e10, true);
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Exception e11) {
                        messagesStorage.o(e11, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    qpVar.getMessagesStorage().P0(j3, arrayList, false, true, 0, 0);
                    qpVar.getMessagesStorage().R1(j3, 0L, arrayList, null);
                    final long j10 = this.d;
                    final boolean z9 = this.f;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.ao
                        @Override // java.lang.Runnable
                        public final void run() {
                            qp qpVar2 = qp.this;
                            qs notificationCenter = qpVar2.getNotificationCenter();
                            long j11 = j10;
                            notificationCenter.k(qs.w, arrayList, Long.valueOf(j11), Boolean.FALSE);
                            int i11 = tL_messages_affectedHistory.offset;
                            org.telegram.ui.xf xfVar2 = xfVar;
                            if (i11 > 0) {
                                qpVar2.d0(j3, j11, i7, i10, z9, xfVar2);
                            } else {
                                xfVar2.run();
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

    public /* synthetic */ xn(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z9, Context context, String str) {
        this.h = tLObject;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.e = i10;
        this.f = z9;
        this.n = context;
        this.r = str;
    }
}

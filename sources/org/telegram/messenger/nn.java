package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nn implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ nn(hp hpVar, long j10, int i3, int i10, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.tf tfVar) {
        this.h = hpVar;
        this.c = j10;
        this.b = i3;
        this.e = i10;
        this.d = j11;
        this.n = tL_messages_affectedHistory;
        this.f = z10;
        this.r = tfVar;
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
                final hp hpVar = (hp) this.h;
                final long j10 = this.c;
                final int i3 = this.b;
                final int i10 = this.e;
                final TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) this.n;
                final org.telegram.ui.tf tfVar = (org.telegram.ui.tf) this.r;
                qr messagesStorage = hpVar.getMessagesStorage();
                messagesStorage.getClass();
                final ArrayList arrayList = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = messagesStorage.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid FROM messages_v2 WHERE uid = " + j10 + " AND date >= " + i3 + " AND date <= " + i10, new Object[0]);
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
                    hpVar.getMessagesStorage().P0(j10, arrayList, false, true, 0, 0);
                    hpVar.getMessagesStorage().R1(j10, 0L, arrayList, null);
                    final long j11 = this.d;
                    final boolean z10 = this.f;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.qn
                        @Override // java.lang.Runnable
                        public final void run() {
                            hp hpVar2 = hp.this;
                            hs notificationCenter = hpVar2.getNotificationCenter();
                            long j12 = j11;
                            notificationCenter.k(hs.w, arrayList, Long.valueOf(j12), Boolean.FALSE);
                            int i11 = tL_messages_affectedHistory.offset;
                            org.telegram.ui.tf tfVar2 = tfVar;
                            if (i11 > 0) {
                                hpVar2.d0(j10, j12, i3, i10, z10, tfVar2);
                            } else {
                                tfVar2.run();
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

    public /* synthetic */ nn(TLObject tLObject, int i3, long j10, long j11, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.b = i3;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = z10;
        this.n = context;
        this.r = str;
    }
}

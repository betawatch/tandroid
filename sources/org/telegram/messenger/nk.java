package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class nk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ long c;

    public /* synthetic */ nk(qp qpVar, long j3, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r5 == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        int i7 = this.a;
        long j3 = this.c;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                qs.f(qpVar.currentAccount).k(qs.E5, Long.valueOf(j3));
                return;
            case 1:
                qs.f(qpVar.currentAccount).k(qs.E5, Long.valueOf(j3));
                return;
            case 2:
                qs.f(qpVar.currentAccount).k(qs.E5, Long.valueOf(j3));
                return;
            case 3:
                qs.f(qpVar.currentAccount).k(qs.E5, Long.valueOf(j3));
                return;
            case 4:
                qs.f(qpVar.currentAccount).k(qs.E5, Long.valueOf(j3));
                return;
            case 5:
                qs.f(qpVar.currentAccount).k(qs.E5, Long.valueOf(j3));
                return;
            case 6:
                qpVar.V2(0, j3, true);
                return;
            case 7:
                long j10 = this.c;
                qp qpVar2 = this.b;
                SQLiteCursor sQLiteCursor2 = null;
                r1 = null;
                r1 = null;
                r1 = null;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = null;
                try {
                    sQLiteCursor = qpVar2.getMessagesStorage().b.queryFinalized("SELECT data FROM saved_reaction_tags WHERE topic_id = ?", Long.valueOf(j10));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                messages_savedreactiontags = TLRPC.messages_SavedReactionTags.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            a8.g(e, true);
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = sQLiteCursor;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
                sQLiteCursor.dispose();
                g0.h3(new a4(qpVar2, messages_savedreactiontags, j10, 17));
                return;
            case 8:
                long j11 = -j3;
                qpVar.Y0.delete(j11);
                qpVar.z0.delete(j11);
                qpVar.A0.e(j11);
                qpVar.B0.delete(j11);
                qpVar.C0.e(j11);
                return;
            case 9:
                qpVar.getNotificationCenter().k(79, Long.valueOf(j3));
                return;
            case 10:
                qpVar.V2(0, j3, true);
                return;
            case 11:
                qpVar.n.remove(Long.valueOf(j3));
                return;
            case 12:
                qpVar.getNotificationCenter().k(qs.X3, Long.valueOf(j3));
                return;
            case 13:
                qpVar.V2(0, j3, true);
                return;
            case 14:
                g0.h3(new nk(qpVar, j3, 5));
                return;
            case 15:
                g0.h3(new nk(qpVar, j3, 22));
                return;
            case 16:
                qpVar.getNotificationCenter().k(qs.X4, Long.valueOf(j3), 0L);
                return;
            case 17:
                qpVar.V2(0, j3, true);
                return;
            case 18:
                qpVar.V2(0, j3, true);
                return;
            case 19:
                qpVar.V2(0, j3, true);
                return;
            case 20:
                qpVar.V2(0, j3, true);
                return;
            case 21:
                qpVar.V2(0, j3, true);
                return;
            default:
                qpVar.getNotificationsController().N(j3);
                return;
        }
    }
}

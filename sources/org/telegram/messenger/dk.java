package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ long c;

    public /* synthetic */ dk(hp hpVar, long j10, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = j10;
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
        int i3 = this.a;
        long j10 = this.c;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                hs.f(hpVar.currentAccount).k(hs.E5, Long.valueOf(j10));
                return;
            case 1:
                hs.f(hpVar.currentAccount).k(hs.E5, Long.valueOf(j10));
                return;
            case 2:
                hs.f(hpVar.currentAccount).k(hs.E5, Long.valueOf(j10));
                return;
            case 3:
                hs.f(hpVar.currentAccount).k(hs.E5, Long.valueOf(j10));
                return;
            case 4:
                hs.f(hpVar.currentAccount).k(hs.E5, Long.valueOf(j10));
                return;
            case 5:
                hs.f(hpVar.currentAccount).k(hs.E5, Long.valueOf(j10));
                return;
            case 6:
                hpVar.V2(0, j10, true);
                return;
            case 7:
                long j11 = this.c;
                hp hpVar2 = this.b;
                SQLiteCursor sQLiteCursor2 = null;
                r1 = null;
                r1 = null;
                r1 = null;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = null;
                try {
                    sQLiteCursor = hpVar2.getMessagesStorage().b.queryFinalized("SELECT data FROM saved_reaction_tags WHERE topic_id = ?", Long.valueOf(j11));
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
                g0.h3(new a4(hpVar2, messages_savedreactiontags, j11, 17));
                return;
            case 8:
                long j12 = -j10;
                hpVar.Z0.delete(j12);
                hpVar.A0.delete(j12);
                hpVar.B0.e(j12);
                hpVar.C0.delete(j12);
                hpVar.D0.e(j12);
                return;
            case 9:
                hpVar.getNotificationCenter().k(79, Long.valueOf(j10));
                return;
            case 10:
                hpVar.V2(0, j10, true);
                return;
            case 11:
                hpVar.n.remove(Long.valueOf(j10));
                return;
            case 12:
                hpVar.getNotificationCenter().k(hs.X3, Long.valueOf(j10));
                return;
            case 13:
                hpVar.V2(0, j10, true);
                return;
            case 14:
                g0.h3(new dk(hpVar, j10, 5));
                return;
            case 15:
                g0.h3(new dk(hpVar, j10, 22));
                return;
            case 16:
                hpVar.getNotificationCenter().k(hs.X4, Long.valueOf(j10), 0L);
                return;
            case 17:
                hpVar.V2(0, j10, true);
                return;
            case 18:
                hpVar.V2(0, j10, true);
                return;
            case 19:
                hpVar.V2(0, j10, true);
                return;
            case 20:
                hpVar.V2(0, j10, true);
                return;
            case 21:
                hpVar.V2(0, j10, true);
                return;
            default:
                hpVar.getNotificationsController().N(j10);
                return;
        }
    }
}

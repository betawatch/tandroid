package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class xk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ long c;

    public /* synthetic */ xk(wp wpVar, long j10, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (r4 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Type inference failed for: r0v23, types: [org.telegram.messenger.pt] */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /* JADX WARN: Type inference failed for: r4v10, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.messenger.f1, org.telegram.messenger.wp] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        int i10 = this.a;
        ?? r42 = this.c;
        ?? r62 = this.b;
        switch (i10) {
            case 0:
                at.f(r62.currentAccount).k(at.E5, Long.valueOf((long) r42));
                return;
            case 1:
                at.f(r62.currentAccount).k(at.E5, Long.valueOf((long) r42));
                return;
            case 2:
                at.f(r62.currentAccount).k(at.E5, Long.valueOf((long) r42));
                return;
            case 3:
                at.f(r62.currentAccount).k(at.E5, Long.valueOf((long) r42));
                return;
            case 4:
                at.f(r62.currentAccount).k(at.E5, Long.valueOf((long) r42));
                return;
            case 5:
                at.f(r62.currentAccount).k(at.E5, Long.valueOf((long) r42));
                return;
            case 6:
                r62.T2(0, r42, true);
                return;
            case 7:
                long j10 = this.c;
                wp wpVar = this.b;
                SQLiteCursor sQLiteCursor2 = null;
                r1 = null;
                r1 = null;
                r1 = null;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = null;
                try {
                    try {
                        sQLiteCursor = wpVar.getMessagesStorage().b.queryFinalized("SELECT data FROM saved_reaction_tags WHERE topic_id = ?", Long.valueOf(j10));
                        try {
                            boolean next = sQLiteCursor.next();
                            r42 = sQLiteCursor;
                            if (next) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                r42 = sQLiteCursor;
                                if (byteBufferValue != null) {
                                    messages_savedreactiontags = TLRPC.messages_SavedReactionTags.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                                    r42 = sQLiteCursor;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            f8.g(e, true);
                            r42 = sQLiteCursor;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = r42;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
                r42.dispose();
                i0.g3(new d4(wpVar, messages_savedreactiontags, j10, 16));
                return;
            case 8:
                r62.getNotificationsController().N(r42);
                return;
            case 9:
                long j11 = -r42;
                r62.Y0.delete(j11);
                r62.z0.delete(j11);
                r62.A0.e(j11);
                r62.B0.delete(j11);
                r62.C0.e(j11);
                return;
            case 10:
                r62.T2(0, r42, true);
                return;
            case 11:
                r62.n.remove(Long.valueOf((long) r42));
                return;
            case 12:
                r62.getNotificationCenter().k(at.X3, Long.valueOf((long) r42));
                return;
            case 13:
                r62.T2(0, r42, true);
                return;
            case 14:
                i0.g3(new xk(r62, r42, 5));
                return;
            case 15:
                i0.g3(new xk(r62, r42, 8));
                return;
            case 16:
                r62.T2(0, r42, true);
                return;
            case 17:
                r62.getNotificationCenter().k(at.X4, Long.valueOf((long) r42), 0L);
                return;
            case 18:
                r62.T2(0, r42, true);
                return;
            case 19:
                r62.T2(0, r42, true);
                return;
            case 20:
                r62.T2(0, r42, true);
                return;
            default:
                r62.T2(0, r42, true);
                return;
        }
    }
}

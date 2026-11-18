package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ik implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;

    public /* synthetic */ ik(mp mpVar, long j3, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r4 == null) goto L47;
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
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                ks.f(mpVar.currentAccount).k(ks.H5, Long.valueOf(j3));
                return;
            case 1:
                ks.f(mpVar.currentAccount).k(ks.H5, Long.valueOf(j3));
                return;
            case 2:
                ks.f(mpVar.currentAccount).k(ks.H5, Long.valueOf(j3));
                return;
            case 3:
                ks.f(mpVar.currentAccount).k(ks.H5, Long.valueOf(j3));
                return;
            case 4:
                ks.f(mpVar.currentAccount).k(ks.H5, Long.valueOf(j3));
                return;
            case 5:
                ks.f(mpVar.currentAccount).k(ks.H5, Long.valueOf(j3));
                return;
            case 6:
                mpVar.b3(0, j3, true);
                return;
            case 7:
                long j10 = this.c;
                mp mpVar2 = this.b;
                SQLiteCursor sQLiteCursor2 = null;
                r1 = null;
                r1 = null;
                r1 = null;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = null;
                try {
                    sQLiteCursor = mpVar2.getMessagesStorage().b.queryFinalized("SELECT data FROM saved_reaction_tags WHERE topic_id = ?", Long.valueOf(j10));
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
                g0.g3(new d4(mpVar2, messages_savedreactiontags, j10, 16));
                return;
            case 8:
                mpVar.getNotificationsController().N(j3);
                return;
            case 9:
                long j11 = -j3;
                mpVar.Z0.delete(j11);
                mpVar.A0.delete(j11);
                mpVar.B0.e(j11);
                mpVar.C0.delete(j11);
                mpVar.D0.e(j11);
                return;
            case 10:
                mpVar.getNotificationCenter().k(79, Long.valueOf(j3));
                return;
            case 11:
                mpVar.b3(0, j3, true);
                return;
            case 12:
                mpVar.n.remove(Long.valueOf(j3));
                return;
            case 13:
                mpVar.getNotificationCenter().k(ks.a4, Long.valueOf(j3));
                return;
            case 14:
                mpVar.b3(0, j3, true);
                return;
            case 15:
                g0.g3(new ik(mpVar, j3, 5));
                return;
            case 16:
                mpVar.getNotificationCenter().k(ks.a5, Long.valueOf(j3), 0L);
                return;
            case 17:
                g0.g3(new ik(mpVar, j3, 8));
                return;
            case 18:
                mpVar.b3(0, j3, true);
                return;
            case 19:
                mpVar.b3(0, j3, true);
                return;
            case 20:
                mpVar.b3(0, j3, true);
                return;
            case 21:
                mpVar.b3(0, j3, true);
                return;
            default:
                mpVar.b3(0, j3, true);
                return;
        }
    }
}

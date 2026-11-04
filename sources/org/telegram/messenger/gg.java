package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ int c;

    public /* synthetic */ gg(li liVar, int i3, int i10) {
        this.a = i10;
        this.b = liVar;
        this.c = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                li liVar = this.b;
                boolean[] zArr = liVar.W;
                int i3 = this.c;
                zArr[i3] = false;
                liVar.X[i3] = true;
                Runnable[] runnableArr = liVar.V;
                Runnable runnable = runnableArr[i3];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[i3] = null;
                    break;
                }
                break;
            default:
                li liVar2 = this.b;
                int i10 = this.c;
                try {
                    SQLiteCursor queryFinalized = liVar2.getMessagesStorage().b.queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i10 + " LIMIT 1", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        z10 = false;
                    } else {
                        TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                            liVar2.E0[i10] = TLdeserialize.hash;
                            liVar2.F0[i10] = TLdeserialize.statuses;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e10) {
                            e = e10;
                            a8.g(e, true);
                            liVar2.H0[i10] = true;
                            liVar2.I0[i10] = false;
                            if (!z10) {
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                }
                liVar2.H0[i10] = true;
                liVar2.I0[i10] = false;
                if (!z10) {
                    g0.h3(new xf(liVar2, 18));
                    break;
                } else {
                    liVar2.L(i10, false);
                    break;
                }
                break;
        }
    }
}

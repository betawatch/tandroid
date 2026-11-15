package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ int c;

    public /* synthetic */ ng(si siVar, int i7, int i10) {
        this.a = i10;
        this.b = siVar;
        this.c = i7;
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
                si siVar = this.b;
                boolean[] zArr = siVar.W;
                int i7 = this.c;
                zArr[i7] = false;
                siVar.X[i7] = true;
                Runnable[] runnableArr = siVar.V;
                Runnable runnable = runnableArr[i7];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[i7] = null;
                    break;
                }
                break;
            default:
                si siVar2 = this.b;
                int i10 = this.c;
                try {
                    SQLiteCursor queryFinalized = siVar2.getMessagesStorage().b.queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i10 + " LIMIT 1", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        z10 = false;
                    } else {
                        TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                            siVar2.E0[i10] = TLdeserialize.hash;
                            siVar2.F0[i10] = TLdeserialize.statuses;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e10) {
                            e = e10;
                            a8.g(e, true);
                            siVar2.H0[i10] = true;
                            siVar2.I0[i10] = false;
                            if (!z10) {
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                }
                siVar2.H0[i10] = true;
                siVar2.I0[i10] = false;
                if (!z10) {
                    g0.h3(new eg(siVar2, 18));
                    break;
                } else {
                    siVar2.L(i10, false);
                    break;
                }
                break;
        }
    }
}

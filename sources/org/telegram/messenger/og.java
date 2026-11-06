package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ int c;

    public /* synthetic */ og(ui uiVar, int i7, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                boolean[] zArr = uiVar.V;
                int i7 = this.c;
                zArr[i7] = false;
                uiVar.W[i7] = true;
                Runnable[] runnableArr = uiVar.U;
                Runnable runnable = runnableArr[i7];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[i7] = null;
                    break;
                }
                break;
            default:
                ui uiVar2 = this.b;
                int i10 = this.c;
                try {
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().b.queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i10 + " LIMIT 1", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        z9 = false;
                    } else {
                        TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                            uiVar2.D0[i10] = TLdeserialize.hash;
                            uiVar2.E0[i10] = TLdeserialize.statuses;
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e10) {
                            e = e10;
                            a8.g(e, true);
                            uiVar2.G0[i10] = true;
                            uiVar2.H0[i10] = false;
                            if (!z9) {
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    e = e11;
                    z9 = false;
                }
                uiVar2.G0[i10] = true;
                uiVar2.H0[i10] = false;
                if (!z9) {
                    g0.h3(new fg(uiVar2, 18));
                    break;
                } else {
                    uiVar2.L(i10, false);
                    break;
                }
                break;
        }
    }
}

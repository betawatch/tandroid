package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ int c;

    public /* synthetic */ ng(ui uiVar, int i10, int i11) {
        this.a = i11;
        this.b = uiVar;
        this.c = i10;
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
                ui uiVar = this.b;
                boolean[] zArr = uiVar.V;
                int i10 = this.c;
                zArr[i10] = false;
                uiVar.W[i10] = true;
                Runnable[] runnableArr = uiVar.U;
                Runnable runnable = runnableArr[i10];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[i10] = null;
                    break;
                }
                break;
            default:
                ui uiVar2 = this.b;
                int i11 = this.c;
                try {
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().b.queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i11 + " LIMIT 1", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        z10 = false;
                    } else {
                        TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                            uiVar2.D0[i11] = TLdeserialize.hash;
                            uiVar2.E0[i11] = TLdeserialize.statuses;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e) {
                            e = e;
                            f8.g(e, true);
                            uiVar2.G0[i11] = true;
                            uiVar2.H0[i11] = false;
                            if (!z10) {
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e7) {
                    e = e7;
                    z10 = false;
                }
                uiVar2.G0[i11] = true;
                uiVar2.H0[i11] = false;
                if (!z10) {
                    i0.g3(new eg(uiVar2, 18));
                    break;
                } else {
                    uiVar2.L(i11, false);
                    break;
                }
                break;
        }
    }
}

package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;
    public final /* synthetic */ int c;

    public /* synthetic */ mg(ri riVar, int i7, int i10) {
        this.a = i10;
        this.b = riVar;
        this.c = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                ri riVar = this.b;
                boolean[] zArr = riVar.W;
                int i7 = this.c;
                zArr[i7] = false;
                riVar.X[i7] = true;
                Runnable[] runnableArr = riVar.V;
                Runnable runnable = runnableArr[i7];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[i7] = null;
                    break;
                }
                break;
            default:
                ri riVar2 = this.b;
                int i10 = this.c;
                try {
                    SQLiteCursor queryFinalized = riVar2.getMessagesStorage().b.queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i10 + " LIMIT 1", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        z10 = false;
                    } else {
                        TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                            riVar2.E0[i10] = TLdeserialize.hash;
                            riVar2.F0[i10] = TLdeserialize.statuses;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e10) {
                            e = e10;
                            a8.g(e, true);
                            riVar2.H0[i10] = true;
                            riVar2.I0[i10] = false;
                            if (!z10) {
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                }
                riVar2.H0[i10] = true;
                riVar2.I0[i10] = false;
                if (!z10) {
                    g0.g3(new eg(riVar2, 1));
                    break;
                } else {
                    riVar2.N(i10, false);
                    break;
                }
                break;
        }
    }
}

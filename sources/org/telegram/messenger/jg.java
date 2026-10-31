package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jg(ui uiVar, String str, boolean z10, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = str;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        SQLiteCursor queryFinalized;
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.c1(this.c, this.d, false);
                return;
            default:
                ui uiVar = this.b;
                String str = this.c;
                SQLiteCursor sQLiteCursor = null;
                r5 = null;
                r5 = null;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = null;
                try {
                    queryFinalized = uiVar.getMessagesStorage().b.queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
                } catch (Throwable th2) {
                    th = th2;
                    tL_messages_stickerSet = null;
                }
                try {
                    if (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            tL_messages_stickerSet2 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                        }
                        i10 = queryFinalized.intValue(1);
                    }
                    queryFinalized.dispose();
                } catch (Throwable th3) {
                    th = th3;
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                    sQLiteCursor = queryFinalized;
                    try {
                        f8.g(th, true);
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                        uiVar.s1(str, this.d, tL_messages_stickerSet2, true, i10);
                        return;
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                }
                uiVar.s1(str, this.d, tL_messages_stickerSet2, true, i10);
                return;
        }
    }
}

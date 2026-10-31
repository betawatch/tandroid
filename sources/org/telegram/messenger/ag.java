package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ag implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet c;

    public /* synthetic */ ag(ui uiVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        String str = "";
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.c;
        ui uiVar = this.b;
        switch (i10) {
            case 0:
                uiVar.M.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                uiVar.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
                break;
            case 1:
                uiVar.M.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                uiVar.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
                break;
            case 2:
                a0.h hVar = uiVar.H[4];
                for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                    hVar.k(document, document.id);
                }
                break;
            case 3:
                try {
                    SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindString(1, "s_" + tL_messages_stickerSet.set.id);
                    executeFast.bindInteger(2, 6);
                    executeFast.bindString(3, "");
                    executeFast.bindString(4, "");
                    executeFast.bindString(5, "");
                    executeFast.bindInteger(6, 0);
                    executeFast.bindInteger(7, 0);
                    executeFast.bindInteger(8, 0);
                    executeFast.bindInteger(9, 0);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                    tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(10, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    executeFast.dispose();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                }
            default:
                try {
                    SQLitePreparedStatement executeFast2 = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                    tL_messages_stickerSet.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindLong(1, tL_messages_stickerSet.set.id);
                    executeFast2.bindByteBuffer(2, nativeByteBuffer2);
                    executeFast2.bindInteger(3, tL_messages_stickerSet.set.hash);
                    executeFast2.bindLong(4, System.currentTimeMillis());
                    String str2 = tL_messages_stickerSet.set.short_name;
                    if (str2 != null) {
                        str = str2.toLowerCase();
                    }
                    executeFast2.bindString(5, str);
                    executeFast2.step();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}

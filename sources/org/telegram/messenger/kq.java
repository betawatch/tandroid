package org.telegram.messenger;

import android.graphics.Typeface;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class kq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ kq(hs hsVar, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = encryptedChat;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[Catch: all -> 0x0042, Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:36:0x0038, B:38:0x003e, B:41:0x005a, B:43:0x0071, B:44:0x0074, B:46:0x007d, B:47:0x0080, B:49:0x0089, B:50:0x008c, B:52:0x0095, B:53:0x0098, B:55:0x00a5, B:56:0x00a8, B:58:0x00ac, B:59:0x00af, B:61:0x00b3, B:62:0x00b6, B:64:0x00ba, B:65:0x00bd, B:73:0x0048, B:75:0x004c), top: B:35:0x0038, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d A[Catch: all -> 0x0042, Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:36:0x0038, B:38:0x003e, B:41:0x005a, B:43:0x0071, B:44:0x0074, B:46:0x007d, B:47:0x0080, B:49:0x0089, B:50:0x008c, B:52:0x0095, B:53:0x0098, B:55:0x00a5, B:56:0x00a8, B:58:0x00ac, B:59:0x00af, B:61:0x00b3, B:62:0x00b6, B:64:0x00ba, B:65:0x00bd, B:73:0x0048, B:75:0x004c), top: B:35:0x0038, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089 A[Catch: all -> 0x0042, Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:36:0x0038, B:38:0x003e, B:41:0x005a, B:43:0x0071, B:44:0x0074, B:46:0x007d, B:47:0x0080, B:49:0x0089, B:50:0x008c, B:52:0x0095, B:53:0x0098, B:55:0x00a5, B:56:0x00a8, B:58:0x00ac, B:59:0x00af, B:61:0x00b3, B:62:0x00b6, B:64:0x00ba, B:65:0x00bd, B:73:0x0048, B:75:0x004c), top: B:35:0x0038, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095 A[Catch: all -> 0x0042, Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:36:0x0038, B:38:0x003e, B:41:0x005a, B:43:0x0071, B:44:0x0074, B:46:0x007d, B:47:0x0080, B:49:0x0089, B:50:0x008c, B:52:0x0095, B:53:0x0098, B:55:0x00a5, B:56:0x00a8, B:58:0x00ac, B:59:0x00af, B:61:0x00b3, B:62:0x00b6, B:64:0x00ba, B:65:0x00bd, B:73:0x0048, B:75:0x004c), top: B:35:0x0038, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[Catch: all -> 0x0042, Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:36:0x0038, B:38:0x003e, B:41:0x005a, B:43:0x0071, B:44:0x0074, B:46:0x007d, B:47:0x0080, B:49:0x0089, B:50:0x008c, B:52:0x0095, B:53:0x0098, B:55:0x00a5, B:56:0x00a8, B:58:0x00ac, B:59:0x00af, B:61:0x00b3, B:62:0x00b6, B:64:0x00ba, B:65:0x00bd, B:73:0x0048, B:75:0x004c), top: B:35:0x0038, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac A[Catch: all -> 0x0042, Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:36:0x0038, B:38:0x003e, B:41:0x005a, B:43:0x0071, B:44:0x0074, B:46:0x007d, B:47:0x0080, B:49:0x0089, B:50:0x008c, B:52:0x0095, B:53:0x0098, B:55:0x00a5, B:56:0x00a8, B:58:0x00ac, B:59:0x00af, B:61:0x00b3, B:62:0x00b6, B:64:0x00ba, B:65:0x00bd, B:73:0x0048, B:75:0x004c), top: B:35:0x0038, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3 A[Catch: all -> 0x0042, Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:36:0x0038, B:38:0x003e, B:41:0x005a, B:43:0x0071, B:44:0x0074, B:46:0x007d, B:47:0x0080, B:49:0x0089, B:50:0x008c, B:52:0x0095, B:53:0x0098, B:55:0x00a5, B:56:0x00a8, B:58:0x00ac, B:59:0x00af, B:61:0x00b3, B:62:0x00b6, B:64:0x00ba, B:65:0x00bd, B:73:0x0048, B:75:0x004c), top: B:35:0x0038, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba A[Catch: all -> 0x0042, Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:36:0x0038, B:38:0x003e, B:41:0x005a, B:43:0x0071, B:44:0x0074, B:46:0x007d, B:47:0x0080, B:49:0x0089, B:50:0x008c, B:52:0x0095, B:53:0x0098, B:55:0x00a5, B:56:0x00a8, B:58:0x00ac, B:59:0x00af, B:61:0x00b3, B:62:0x00b6, B:64:0x00ba, B:65:0x00bd, B:73:0x0048, B:75:0x004c), top: B:35:0x0038, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i10 = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        TLRPC.EncryptedChat encryptedChat = this.c;
        hs hsVar = this.b;
        try {
            switch (i10) {
                case 0:
                    hsVar.getClass();
                    try {
                        try {
                            sQLitePreparedStatement = hsVar.b.executeFast("UPDATE enc_chats SET ttl = ? WHERE uid = ?");
                            sQLitePreparedStatement.bindInteger(1, encryptedChat.ttl);
                            sQLitePreparedStatement.bindInteger(2, encryptedChat.id);
                            sQLitePreparedStatement.step();
                        } catch (Exception e) {
                            hsVar.o(e, true);
                            if (sQLitePreparedStatement == null) {
                                return;
                            }
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                case 1:
                    try {
                        bArr = encryptedChat.key_hash;
                    } catch (Exception e7) {
                        hsVar.o(e7, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (bArr != null) {
                        if (bArr.length < 16) {
                        }
                        sQLitePreparedStatement = hsVar.b.executeFast("UPDATE enc_chats SET data = ?, g = ?, authkey = ?, ttl = ?, layer = ?, seq_in = ?, seq_out = ?, use_count = ?, exchange_id = ?, key_date = ?, fprint = ?, fauthkey = ?, khash = ?, in_seq_no = ?, admin_id = ?, mtproto_seq = ? WHERE uid = ?");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                        byte[] bArr6 = encryptedChat.a_or_b;
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(bArr6 == null ? bArr6.length : 1);
                        byte[] bArr7 = encryptedChat.auth_key;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(bArr7 == null ? bArr7.length : 1);
                        byte[] bArr8 = encryptedChat.future_auth_key;
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(bArr8 == null ? bArr8.length : 1);
                        byte[] bArr9 = encryptedChat.key_hash;
                        NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(bArr9 == null ? bArr9.length : 1);
                        encryptedChat.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                        bArr2 = encryptedChat.a_or_b;
                        if (bArr2 != null) {
                            nativeByteBuffer2.writeBytes(bArr2);
                        }
                        bArr3 = encryptedChat.auth_key;
                        if (bArr3 != null) {
                            nativeByteBuffer3.writeBytes(bArr3);
                        }
                        bArr4 = encryptedChat.future_auth_key;
                        if (bArr4 != null) {
                            nativeByteBuffer4.writeBytes(bArr4);
                        }
                        bArr5 = encryptedChat.key_hash;
                        if (bArr5 != null) {
                            nativeByteBuffer5.writeBytes(bArr5);
                        }
                        sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer2);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer3);
                        sQLitePreparedStatement.bindInteger(4, encryptedChat.ttl);
                        sQLitePreparedStatement.bindInteger(5, encryptedChat.layer);
                        sQLitePreparedStatement.bindInteger(6, encryptedChat.seq_in);
                        sQLitePreparedStatement.bindInteger(7, encryptedChat.seq_out);
                        sQLitePreparedStatement.bindInteger(8, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                        sQLitePreparedStatement.bindLong(9, encryptedChat.exchange_id);
                        sQLitePreparedStatement.bindInteger(10, encryptedChat.key_create_date);
                        sQLitePreparedStatement.bindLong(11, encryptedChat.future_key_fingerprint);
                        sQLitePreparedStatement.bindByteBuffer(12, nativeByteBuffer4);
                        sQLitePreparedStatement.bindByteBuffer(13, nativeByteBuffer5);
                        sQLitePreparedStatement.bindInteger(14, encryptedChat.in_seq_no);
                        sQLitePreparedStatement.bindLong(15, encryptedChat.admin_id);
                        sQLitePreparedStatement.bindInteger(16, encryptedChat.mtproto_seq);
                        sQLitePreparedStatement.bindInteger(17, encryptedChat.id);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        nativeByteBuffer3.reuse();
                        nativeByteBuffer4.reuse();
                        nativeByteBuffer5.reuse();
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    byte[] bArr10 = encryptedChat.auth_key;
                    if (bArr10 != null) {
                        Typeface typeface = i0.a;
                        byte[] bArr11 = new byte[16];
                        System.arraycopy(Utilities.n(bArr10), 0, bArr11, 0, 16);
                        encryptedChat.key_hash = bArr11;
                    }
                    sQLitePreparedStatement = hsVar.b.executeFast("UPDATE enc_chats SET data = ?, g = ?, authkey = ?, ttl = ?, layer = ?, seq_in = ?, seq_out = ?, use_count = ?, exchange_id = ?, key_date = ?, fprint = ?, fauthkey = ?, khash = ?, in_seq_no = ?, admin_id = ?, mtproto_seq = ? WHERE uid = ?");
                    NativeByteBuffer nativeByteBuffer6 = new NativeByteBuffer(encryptedChat.getObjectSize());
                    byte[] bArr62 = encryptedChat.a_or_b;
                    NativeByteBuffer nativeByteBuffer22 = new NativeByteBuffer(bArr62 == null ? bArr62.length : 1);
                    byte[] bArr72 = encryptedChat.auth_key;
                    NativeByteBuffer nativeByteBuffer32 = new NativeByteBuffer(bArr72 == null ? bArr72.length : 1);
                    byte[] bArr82 = encryptedChat.future_auth_key;
                    NativeByteBuffer nativeByteBuffer42 = new NativeByteBuffer(bArr82 == null ? bArr82.length : 1);
                    byte[] bArr92 = encryptedChat.key_hash;
                    NativeByteBuffer nativeByteBuffer52 = new NativeByteBuffer(bArr92 == null ? bArr92.length : 1);
                    encryptedChat.serializeToStream(nativeByteBuffer6);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer6);
                    bArr2 = encryptedChat.a_or_b;
                    if (bArr2 != null) {
                    }
                    bArr3 = encryptedChat.auth_key;
                    if (bArr3 != null) {
                    }
                    bArr4 = encryptedChat.future_auth_key;
                    if (bArr4 != null) {
                    }
                    bArr5 = encryptedChat.key_hash;
                    if (bArr5 != null) {
                    }
                    sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer22);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer32);
                    sQLitePreparedStatement.bindInteger(4, encryptedChat.ttl);
                    sQLitePreparedStatement.bindInteger(5, encryptedChat.layer);
                    sQLitePreparedStatement.bindInteger(6, encryptedChat.seq_in);
                    sQLitePreparedStatement.bindInteger(7, encryptedChat.seq_out);
                    sQLitePreparedStatement.bindInteger(8, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                    sQLitePreparedStatement.bindLong(9, encryptedChat.exchange_id);
                    sQLitePreparedStatement.bindInteger(10, encryptedChat.key_create_date);
                    sQLitePreparedStatement.bindLong(11, encryptedChat.future_key_fingerprint);
                    sQLitePreparedStatement.bindByteBuffer(12, nativeByteBuffer42);
                    sQLitePreparedStatement.bindByteBuffer(13, nativeByteBuffer52);
                    sQLitePreparedStatement.bindInteger(14, encryptedChat.in_seq_no);
                    sQLitePreparedStatement.bindLong(15, encryptedChat.admin_id);
                    sQLitePreparedStatement.bindInteger(16, encryptedChat.mtproto_seq);
                    sQLitePreparedStatement.bindInteger(17, encryptedChat.id);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer6.reuse();
                    nativeByteBuffer22.reuse();
                    nativeByteBuffer32.reuse();
                    nativeByteBuffer42.reuse();
                    nativeByteBuffer52.reuse();
                    sQLitePreparedStatement.dispose();
                    return;
                default:
                    hsVar.getClass();
                    try {
                        try {
                            sQLitePreparedStatement = hsVar.b.executeFast("UPDATE enc_chats SET layer = ? WHERE uid = ?");
                            sQLitePreparedStatement.bindInteger(1, encryptedChat.layer);
                            sQLitePreparedStatement.bindInteger(2, encryptedChat.id);
                            sQLitePreparedStatement.step();
                        } catch (Exception e10) {
                            hsVar.o(e10, true);
                            if (sQLitePreparedStatement == null) {
                                return;
                            }
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Throwable th3) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th3;
                    }
            }
        } catch (Throwable th4) {
            if (sQLitePreparedStatement != null) {
            }
            throw th4;
        }
        if (sQLitePreparedStatement != null) {
            sQLitePreparedStatement.dispose();
        }
        throw th4;
    }
}

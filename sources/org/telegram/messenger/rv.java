package org.telegram.messenger;

import android.util.SparseArray;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rv implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ rv(vv vvVar, TLRPC.EncryptedChat encryptedChat, int i3) {
        this.a = i3;
        this.b = vvVar;
        this.c = encryptedChat;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte[] bArr;
        int i3 = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        vv vvVar = this.b;
        switch (i3) {
            case 0:
                SparseArray sparseArray = vvVar.e;
                if (tL_error != null) {
                    sparseArray.remove(encryptedChat.id);
                    break;
                } else {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr2 = messages_dhconfig.p;
                        int i10 = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr2, i10)) {
                            sparseArray.remove(encryptedChat.id);
                            vvVar.f(encryptedChat.id, false);
                            break;
                        } else {
                            qr messagesStorage = vvVar.getMessagesStorage();
                            byte[] bArr3 = messages_dhconfig.p;
                            messagesStorage.H();
                            messagesStorage.y = bArr3;
                            qr messagesStorage2 = vvVar.getMessagesStorage();
                            int i11 = messages_dhconfig.g;
                            messagesStorage2.H();
                            messagesStorage2.E = i11;
                            qr messagesStorage3 = vvVar.getMessagesStorage();
                            int i12 = messages_dhconfig.version;
                            messagesStorage3.H();
                            messagesStorage3.x = i12;
                            qr messagesStorage4 = vvVar.getMessagesStorage();
                            qr messagesStorage5 = vvVar.getMessagesStorage();
                            messagesStorage5.H();
                            int i13 = messagesStorage5.x;
                            qr messagesStorage6 = vvVar.getMessagesStorage();
                            messagesStorage6.H();
                            int i14 = messagesStorage6.E;
                            qr messagesStorage7 = vvVar.getMessagesStorage();
                            messagesStorage7.H();
                            messagesStorage4.a.c(new k2.a0(messagesStorage4, i13, i14, messagesStorage7.y, 7));
                        }
                    }
                    byte[] bArr4 = new byte[256];
                    for (int i15 = 0; i15 < 256; i15++) {
                        bArr4[i15] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i15]);
                    }
                    encryptedChat.a_or_b = bArr4;
                    encryptedChat.seq_in = -1;
                    encryptedChat.seq_out = 0;
                    qr messagesStorage8 = vvVar.getMessagesStorage();
                    messagesStorage8.H();
                    int i16 = 1;
                    BigInteger bigInteger = new BigInteger(1, messagesStorage8.y);
                    vvVar.getMessagesStorage().H();
                    BigInteger modPow = BigInteger.valueOf(r5.E).modPow(new BigInteger(1, bArr4), bigInteger);
                    BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
                    if (!Utilities.w(bigInteger2, bigInteger)) {
                        sparseArray.remove(encryptedChat.id);
                        vvVar.f(encryptedChat.id, false);
                        break;
                    } else {
                        byte[] byteArray = modPow.toByteArray();
                        if (byteArray.length > 256) {
                            byte[] bArr5 = new byte[256];
                            System.arraycopy(byteArray, 1, bArr5, 0, 256);
                            byteArray = bArr5;
                        }
                        byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr4), bigInteger).toByteArray();
                        if (byteArray2.length <= 256) {
                            if (byteArray2.length < 256) {
                                bArr = new byte[256];
                                System.arraycopy(byteArray2, 0, bArr, 256 - byteArray2.length, byteArray2.length);
                                for (int i17 = 0; i17 < 256 - byteArray2.length; i17++) {
                                    bArr[i17] = 0;
                                }
                            }
                            byte[] n4 = Utilities.n(byteArray2);
                            byte[] bArr6 = new byte[8];
                            System.arraycopy(n4, n4.length - 8, bArr6, 0, 8);
                            encryptedChat.auth_key = byteArray2;
                            encryptedChat.key_create_date = vvVar.getConnectionsManager().getCurrentTime();
                            TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
                            tL_messages_acceptEncryption.g_b = byteArray;
                            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                            tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
                            tL_inputEncryptedChat.chat_id = encryptedChat.id;
                            tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                            tL_messages_acceptEncryption.key_fingerprint = Utilities.g(bArr6);
                            vvVar.getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new rv(vvVar, encryptedChat, i16), 64);
                            break;
                        } else {
                            bArr = new byte[256];
                            System.arraycopy(byteArray2, byteArray2.length - 256, bArr, 0, 256);
                        }
                        byteArray2 = bArr;
                        byte[] n42 = Utilities.n(byteArray2);
                        byte[] bArr62 = new byte[8];
                        System.arraycopy(n42, n42.length - 8, bArr62, 0, 8);
                        encryptedChat.auth_key = byteArray2;
                        encryptedChat.key_create_date = vvVar.getConnectionsManager().getCurrentTime();
                        TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
                        tL_messages_acceptEncryption2.g_b = byteArray;
                        TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                        tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
                        tL_inputEncryptedChat2.chat_id = encryptedChat.id;
                        tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                        tL_messages_acceptEncryption2.key_fingerprint = Utilities.g(bArr62);
                        vvVar.getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new rv(vvVar, encryptedChat, i16), 64);
                    }
                }
            default:
                vvVar.e.remove(encryptedChat.id);
                if (tL_error == null) {
                    TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) tLObject;
                    encryptedChat2.auth_key = encryptedChat.auth_key;
                    encryptedChat2.user_id = encryptedChat.user_id;
                    encryptedChat2.seq_in = encryptedChat.seq_in;
                    encryptedChat2.seq_out = encryptedChat.seq_out;
                    encryptedChat2.key_create_date = encryptedChat.key_create_date;
                    encryptedChat2.key_use_count_in = encryptedChat.key_use_count_in;
                    encryptedChat2.key_use_count_out = encryptedChat.key_use_count_out;
                    vvVar.getMessagesStorage().V1(encryptedChat2);
                    vvVar.getMessagesController().U3(encryptedChat2, false);
                    g0.h3(new ov(vvVar, encryptedChat2, 2));
                    break;
                }
                break;
        }
    }
}

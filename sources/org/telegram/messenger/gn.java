package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.m31;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ gn(f1 f1Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.h = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.n = obj6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f3, code lost:
    
        if (r10.key_create_date < (r14.getConnectionsManager().getCurrentTime() - 604800)) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c A[Catch: Exception -> 0x0105, TryCatch #3 {Exception -> 0x0105, blocks: (B:8:0x005c, B:11:0x00b4, B:13:0x00b9, B:15:0x00bd, B:18:0x00c4, B:21:0x00db, B:27:0x0109, B:28:0x0148, B:30:0x014c, B:31:0x016f, B:33:0x018a, B:34:0x0190, B:36:0x01a6, B:37:0x01ae, B:40:0x01c1, B:43:0x01ca, B:45:0x0226, B:47:0x022a, B:48:0x0284, B:51:0x0245, B:52:0x0264, B:61:0x00f5, B:63:0x00fb, B:65:0x0101, B:66:0x00c2, B:67:0x0142), top: B:7:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018a A[Catch: Exception -> 0x0105, TryCatch #3 {Exception -> 0x0105, blocks: (B:8:0x005c, B:11:0x00b4, B:13:0x00b9, B:15:0x00bd, B:18:0x00c4, B:21:0x00db, B:27:0x0109, B:28:0x0148, B:30:0x014c, B:31:0x016f, B:33:0x018a, B:34:0x0190, B:36:0x01a6, B:37:0x01ae, B:40:0x01c1, B:43:0x01ca, B:45:0x0226, B:47:0x022a, B:48:0x0284, B:51:0x0245, B:52:0x0264, B:61:0x00f5, B:63:0x00fb, B:65:0x0101, B:66:0x00c2, B:67:0x0142), top: B:7:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6 A[Catch: Exception -> 0x0105, TryCatch #3 {Exception -> 0x0105, blocks: (B:8:0x005c, B:11:0x00b4, B:13:0x00b9, B:15:0x00bd, B:18:0x00c4, B:21:0x00db, B:27:0x0109, B:28:0x0148, B:30:0x014c, B:31:0x016f, B:33:0x018a, B:34:0x0190, B:36:0x01a6, B:37:0x01ae, B:40:0x01c1, B:43:0x01ca, B:45:0x0226, B:47:0x022a, B:48:0x0284, B:51:0x0245, B:52:0x0264, B:61:0x00f5, B:63:0x00fb, B:65:0x0101, B:66:0x00c2, B:67:0x0142), top: B:7:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0226 A[Catch: Exception -> 0x0105, TryCatch #3 {Exception -> 0x0105, blocks: (B:8:0x005c, B:11:0x00b4, B:13:0x00b9, B:15:0x00bd, B:18:0x00c4, B:21:0x00db, B:27:0x0109, B:28:0x0148, B:30:0x014c, B:31:0x016f, B:33:0x018a, B:34:0x0190, B:36:0x01a6, B:37:0x01ae, B:40:0x01c1, B:43:0x01ca, B:45:0x0226, B:47:0x022a, B:48:0x0284, B:51:0x0245, B:52:0x0264, B:61:0x00f5, B:63:0x00fb, B:65:0x0101, B:66:0x00c2, B:67:0x0142), top: B:7:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0264 A[Catch: Exception -> 0x0105, TryCatch #3 {Exception -> 0x0105, blocks: (B:8:0x005c, B:11:0x00b4, B:13:0x00b9, B:15:0x00bd, B:18:0x00c4, B:21:0x00db, B:27:0x0109, B:28:0x0148, B:30:0x014c, B:31:0x016f, B:33:0x018a, B:34:0x0190, B:36:0x01a6, B:37:0x01ae, B:40:0x01c1, B:43:0x01ca, B:45:0x0226, B:47:0x022a, B:48:0x0284, B:51:0x0245, B:52:0x0264, B:61:0x00f5, B:63:0x00fb, B:65:0x0101, B:66:0x00c2, B:67:0x0142), top: B:7:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        long j10;
        int i12;
        int nextInt;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile;
        int i13 = this.a;
        boolean z11 = false;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.h;
        f1 f1Var = this.b;
        switch (i13) {
            case 0:
                vp vpVar = (vp) f1Var;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                ((cs) obj6).run(0L);
                if (context != null && !((Activity) context).isFinishing()) {
                    try {
                        x1Var.dismiss();
                        i10 = 1;
                    } catch (Exception e) {
                        i10 = 1;
                        f8.g(e, true);
                    }
                    int i14 = vpVar.currentAccount;
                    Object[] objArr = new Object[i10];
                    objArr[0] = Boolean.FALSE;
                    org.telegram.ui.Components.s4.e0(i14, tL_error, k2Var, tL_messages_migrateChat, objArr);
                    break;
                }
                break;
            case 1:
                vp vpVar2 = (vp) f1Var;
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                vpVar2.getClass();
                ((zr) obj6).i(false);
                if (context2 != null && !((Activity) context2).isFinishing()) {
                    try {
                        x1Var2.dismiss();
                        i11 = 1;
                    } catch (Exception e7) {
                        i11 = 1;
                        f8.g(e7, true);
                    }
                    int i15 = vpVar2.currentAccount;
                    Object[] objArr2 = new Object[i11];
                    objArr2[0] = Boolean.FALSE;
                    org.telegram.ui.Components.s4.e0(i15, tL_error2, k2Var2, tL_channels_convertToGigagroup, objArr2);
                    break;
                }
                break;
            case 2:
                ui uiVar = (ui) f1Var;
                uiVar.getMessagesController().V3((ArrayList) obj6, true);
                uiVar.getMessagesController().P3((ArrayList) obj5, true);
                uiVar.n1 = false;
                uiVar.m1 = true;
                uiVar.i1 = (ArrayList) obj4;
                uiVar.j1 = (ArrayList) obj3;
                uiVar.k1 = (ArrayList) obj2;
                uiVar.l1 = (ArrayList) obj;
                uiVar.m();
                uiVar.getNotificationCenter().k(81, new Object[0]);
                uiVar.getNotificationCenter().k(82, new Object[0]);
                uiVar.getNotificationCenter().k(83, new Object[0]);
                uiVar.getNotificationCenter().k(84, new Object[0]);
                if (Math.abs(uiVar.getUserConfig().s - ((int) (System.currentTimeMillis() / 1000))) >= 86400) {
                    uiVar.M0(false);
                    break;
                } else {
                    boolean z12 = v2.a;
                    break;
                }
            case 3:
                ow owVar = (ow) f1Var;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj6;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj5;
                TLRPC.Message message = (TLRPC.Message) obj4;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) obj3;
                jj jjVar = (jj) obj2;
                String str = (String) obj;
                try {
                    TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
                    int i16 = encryptedChat.layer;
                    Typeface typeface = i0.a;
                    tL_decryptedMessageLayer.layer = Math.min(Math.max(46, i16 & 65535), Math.max(46, i0.X0(encryptedChat.layer)));
                    tL_decryptedMessageLayer.message = decryptedMessage;
                    byte[] bArr = new byte[15];
                    tL_decryptedMessageLayer.random_bytes = bArr;
                    SecureRandom secureRandom = Utilities.b;
                    secureRandom.nextBytes(bArr);
                    if (encryptedChat.seq_in == 0) {
                        try {
                            if (encryptedChat.seq_out == 0) {
                                j10 = 0;
                                if (encryptedChat.admin_id == owVar.getUserConfig().e()) {
                                    encryptedChat.seq_out = 1;
                                    encryptedChat.seq_in = -2;
                                } else {
                                    encryptedChat.seq_in = -1;
                                }
                                i12 = message.seq_in;
                                if (i12 == 0 || message.seq_out != 0) {
                                    tL_decryptedMessageLayer.in_seq_no = i12;
                                    tL_decryptedMessageLayer.out_seq_no = message.seq_out;
                                } else {
                                    int i17 = encryptedChat.seq_in;
                                    if (i17 <= 0) {
                                        i17 += 2;
                                    }
                                    tL_decryptedMessageLayer.in_seq_no = i17;
                                    int i18 = encryptedChat.seq_out;
                                    tL_decryptedMessageLayer.out_seq_no = i18;
                                    encryptedChat.seq_out = i18 + 2;
                                    if (encryptedChat.key_create_date == 0) {
                                        encryptedChat.key_create_date = owVar.getConnectionsManager().getCurrentTime();
                                    }
                                    short s10 = (short) (encryptedChat.key_use_count_out + 1);
                                    encryptedChat.key_use_count_out = s10;
                                    if (s10 < 100) {
                                        break;
                                    }
                                    if (encryptedChat.exchange_id == j10 && encryptedChat.future_key_fingerprint == j10) {
                                        owVar.o(encryptedChat);
                                    }
                                    hs messagesStorage = owVar.getMessagesStorage();
                                    messagesStorage.a.c(new wf(messagesStorage, encryptedChat, z11, 10));
                                    message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                                    message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                                    hs messagesStorage2 = owVar.getMessagesStorage();
                                    messagesStorage2.a.c(new bi.b3(messagesStorage2, message.id, message.seq_in, message.seq_out, 2));
                                }
                                if (v2.a) {
                                    f8.b(decryptedMessage + " send message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
                                }
                                int objectSize = tL_decryptedMessageLayer.getObjectSize();
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize + 4);
                                nativeByteBuffer.writeInt32(objectSize);
                                tL_decryptedMessageLayer.serializeToStream(nativeByteBuffer);
                                int length = nativeByteBuffer.length();
                                nextInt = ((secureRandom.nextInt(3) + 2) * 16) + (length % 16 == 0 ? 16 - (length % 16) : 0);
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length + nextInt);
                                nativeByteBuffer.position(0);
                                nativeByteBuffer2.writeBytes(nativeByteBuffer);
                                if (nextInt != 0) {
                                    byte[] bArr2 = new byte[nextInt];
                                    secureRandom.nextBytes(bArr2);
                                    nativeByteBuffer2.writeBytes(bArr2);
                                }
                                byte[] bArr3 = new byte[16];
                                boolean z13 = encryptedChat.admin_id == owVar.getUserConfig().e();
                                byte[] bArr4 = encryptedChat.auth_key;
                                int i19 = !z13 ? 8 : 0;
                                ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
                                System.arraycopy(Utilities.p(bArr4, 88 + i19, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
                                nativeByteBuffer.reuse();
                                m5.e M = m5.e.M(2, z13, encryptedChat.auth_key, bArr3);
                                Utilities.c(nativeByteBuffer2.buffer, (byte[]) M.b, (byte[]) M.c, true, false, 0, nativeByteBuffer2.limit());
                                NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(24 + nativeByteBuffer2.length());
                                nativeByteBuffer2.position(0);
                                nativeByteBuffer3.writeInt64(encryptedChat.key_fingerprint);
                                nativeByteBuffer3.writeBytes(bArr3);
                                nativeByteBuffer3.writeBytes(nativeByteBuffer2);
                                nativeByteBuffer2.reuse();
                                nativeByteBuffer3.position(0);
                                if (inputEncryptedFile == null) {
                                    TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile2 = new TLRPC.TL_messages_sendEncryptedFile();
                                    tL_messages_sendEncryptedFile2.silent = message.silent;
                                    tL_messages_sendEncryptedFile2.data = nativeByteBuffer3;
                                    tL_messages_sendEncryptedFile2.random_id = decryptedMessage.random_id;
                                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                                    tL_messages_sendEncryptedFile2.peer = tL_inputEncryptedChat;
                                    tL_inputEncryptedChat.chat_id = encryptedChat.id;
                                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                                    tL_messages_sendEncryptedFile2.file = inputEncryptedFile;
                                    tL_messages_sendEncryptedFile = tL_messages_sendEncryptedFile2;
                                } else if (decryptedMessage instanceof TLRPC.TL_decryptedMessageService) {
                                    TLRPC.TL_messages_sendEncryptedService tL_messages_sendEncryptedService = new TLRPC.TL_messages_sendEncryptedService();
                                    tL_messages_sendEncryptedService.data = nativeByteBuffer3;
                                    tL_messages_sendEncryptedService.random_id = decryptedMessage.random_id;
                                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                                    tL_messages_sendEncryptedService.peer = tL_inputEncryptedChat2;
                                    tL_inputEncryptedChat2.chat_id = encryptedChat.id;
                                    tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                                    tL_messages_sendEncryptedFile = tL_messages_sendEncryptedService;
                                } else {
                                    TLRPC.TL_messages_sendEncrypted tL_messages_sendEncrypted = new TLRPC.TL_messages_sendEncrypted();
                                    tL_messages_sendEncrypted.silent = message.silent;
                                    tL_messages_sendEncrypted.data = nativeByteBuffer3;
                                    tL_messages_sendEncrypted.random_id = decryptedMessage.random_id;
                                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat3 = new TLRPC.TL_inputEncryptedChat();
                                    tL_messages_sendEncrypted.peer = tL_inputEncryptedChat3;
                                    tL_inputEncryptedChat3.chat_id = encryptedChat.id;
                                    tL_inputEncryptedChat3.access_hash = encryptedChat.access_hash;
                                    tL_messages_sendEncryptedFile = tL_messages_sendEncrypted;
                                }
                                owVar.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new ko(owVar, decryptedMessage, encryptedChat, message, jjVar, str), 64);
                                break;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            z10 = true;
                            f8.g(e, z10);
                            return;
                        }
                    }
                    j10 = 0;
                    i12 = message.seq_in;
                    if (i12 == 0) {
                    }
                    tL_decryptedMessageLayer.in_seq_no = i12;
                    tL_decryptedMessageLayer.out_seq_no = message.seq_out;
                    if (v2.a) {
                    }
                    int objectSize2 = tL_decryptedMessageLayer.getObjectSize();
                    NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(objectSize2 + 4);
                    nativeByteBuffer4.writeInt32(objectSize2);
                    tL_decryptedMessageLayer.serializeToStream(nativeByteBuffer4);
                    int length2 = nativeByteBuffer4.length();
                    nextInt = ((secureRandom.nextInt(3) + 2) * 16) + (length2 % 16 == 0 ? 16 - (length2 % 16) : 0);
                    NativeByteBuffer nativeByteBuffer22 = new NativeByteBuffer(length2 + nextInt);
                    nativeByteBuffer4.position(0);
                    nativeByteBuffer22.writeBytes(nativeByteBuffer4);
                    if (nextInt != 0) {
                    }
                    byte[] bArr32 = new byte[16];
                    if (encryptedChat.admin_id == owVar.getUserConfig().e()) {
                    }
                    byte[] bArr42 = encryptedChat.auth_key;
                    if (!z13) {
                    }
                    ByteBuffer byteBuffer2 = nativeByteBuffer22.buffer;
                    System.arraycopy(Utilities.p(bArr42, 88 + i19, byteBuffer2, 0, byteBuffer2.limit()), 8, bArr32, 0, 16);
                    nativeByteBuffer4.reuse();
                    m5.e M2 = m5.e.M(2, z13, encryptedChat.auth_key, bArr32);
                    Utilities.c(nativeByteBuffer22.buffer, (byte[]) M2.b, (byte[]) M2.c, true, false, 0, nativeByteBuffer22.limit());
                    NativeByteBuffer nativeByteBuffer32 = new NativeByteBuffer(24 + nativeByteBuffer22.length());
                    nativeByteBuffer22.position(0);
                    nativeByteBuffer32.writeInt64(encryptedChat.key_fingerprint);
                    nativeByteBuffer32.writeBytes(bArr32);
                    nativeByteBuffer32.writeBytes(nativeByteBuffer22);
                    nativeByteBuffer22.reuse();
                    nativeByteBuffer32.position(0);
                    if (inputEncryptedFile == null) {
                    }
                    owVar.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new ko(owVar, decryptedMessage, encryptedChat, message, jjVar, str), 64);
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                }
                break;
            default:
                t10 t10Var = (t10) f1Var;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj6;
                t10Var.getClass();
                storyItem.translatedLng = (String) obj5;
                storyItem.translatedText = m31.P0((TLRPC.TL_textWithEntities) obj4, (TLRPC.TL_textWithEntities) obj3);
                t10Var.getMessagesController().O1().k.h(storyItem.dialogId, storyItem);
                t10Var.J.remove((r10) obj2);
                ((bi.e) obj).run();
                break;
        }
    }
}

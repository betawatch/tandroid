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
import org.telegram.ui.Components.y21;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class wm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ wm(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = c1Var;
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
        int i7;
        int i10;
        boolean z10;
        long j3;
        int i11;
        int nextInt;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile;
        int i12 = this.a;
        boolean z11 = false;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.h;
        c1 c1Var = this.b;
        switch (i12) {
            case 0:
                mp mpVar = (mp) c1Var;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                ((or) obj6).run(0L);
                if (context != null && !((Activity) context).isFinishing()) {
                    try {
                        u1Var.dismiss();
                        i7 = 1;
                    } catch (Exception e10) {
                        i7 = 1;
                        a8.g(e10, true);
                    }
                    int i13 = mpVar.currentAccount;
                    Object[] objArr = new Object[i7];
                    objArr[0] = Boolean.FALSE;
                    org.telegram.ui.Components.b5.c0(i13, tL_error, h2Var, tL_messages_migrateChat, objArr);
                    break;
                }
                break;
            case 1:
                mp mpVar2 = (mp) c1Var;
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                mpVar2.getClass();
                ((lr) obj6).d(false);
                if (context2 != null && !((Activity) context2).isFinishing()) {
                    try {
                        u1Var2.dismiss();
                        i10 = 1;
                    } catch (Exception e11) {
                        i10 = 1;
                        a8.g(e11, true);
                    }
                    int i14 = mpVar2.currentAccount;
                    Object[] objArr2 = new Object[i10];
                    objArr2[0] = Boolean.FALSE;
                    org.telegram.ui.Components.b5.c0(i14, tL_error2, h2Var2, tL_channels_convertToGigagroup, objArr2);
                    break;
                }
                break;
            case 2:
                ri riVar = (ri) c1Var;
                riVar.getMessagesController().f4((ArrayList) obj6, true);
                riVar.getMessagesController().Z3((ArrayList) obj5, true);
                riVar.o1 = false;
                riVar.n1 = true;
                riVar.j1 = (ArrayList) obj4;
                riVar.k1 = (ArrayList) obj3;
                riVar.l1 = (ArrayList) obj2;
                riVar.m1 = (ArrayList) obj;
                riVar.o();
                riVar.getNotificationCenter().k(81, new Object[0]);
                riVar.getNotificationCenter().k(82, new Object[0]);
                riVar.getNotificationCenter().k(83, new Object[0]);
                riVar.getNotificationCenter().k(84, new Object[0]);
                if (Math.abs(riVar.getUserConfig().s - ((int) (System.currentTimeMillis() / 1000))) >= 86400) {
                    riVar.P0(false);
                    break;
                } else {
                    boolean z12 = s2.a;
                    break;
                }
            case 3:
                xv xvVar = (xv) c1Var;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj6;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj5;
                TLRPC.Message message = (TLRPC.Message) obj4;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) obj3;
                fj fjVar = (fj) obj2;
                String str = (String) obj;
                try {
                    TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
                    int i15 = encryptedChat.layer;
                    Typeface typeface = g0.a;
                    tL_decryptedMessageLayer.layer = Math.min(Math.max(46, i15 & 65535), Math.max(46, g0.X0(encryptedChat.layer)));
                    tL_decryptedMessageLayer.message = decryptedMessage;
                    byte[] bArr = new byte[15];
                    tL_decryptedMessageLayer.random_bytes = bArr;
                    SecureRandom secureRandom = Utilities.b;
                    secureRandom.nextBytes(bArr);
                    if (encryptedChat.seq_in == 0) {
                        try {
                            if (encryptedChat.seq_out == 0) {
                                j3 = 0;
                                if (encryptedChat.admin_id == xvVar.getUserConfig().e()) {
                                    encryptedChat.seq_out = 1;
                                    encryptedChat.seq_in = -2;
                                } else {
                                    encryptedChat.seq_in = -1;
                                }
                                i11 = message.seq_in;
                                if (i11 == 0 || message.seq_out != 0) {
                                    tL_decryptedMessageLayer.in_seq_no = i11;
                                    tL_decryptedMessageLayer.out_seq_no = message.seq_out;
                                } else {
                                    int i16 = encryptedChat.seq_in;
                                    if (i16 <= 0) {
                                        i16 += 2;
                                    }
                                    tL_decryptedMessageLayer.in_seq_no = i16;
                                    int i17 = encryptedChat.seq_out;
                                    tL_decryptedMessageLayer.out_seq_no = i17;
                                    encryptedChat.seq_out = i17 + 2;
                                    if (encryptedChat.key_create_date == 0) {
                                        encryptedChat.key_create_date = xvVar.getConnectionsManager().getCurrentTime();
                                    }
                                    short s5 = (short) (encryptedChat.key_use_count_out + 1);
                                    encryptedChat.key_use_count_out = s5;
                                    if (s5 < 100) {
                                        break;
                                    }
                                    if (encryptedChat.exchange_id == j3 && encryptedChat.future_key_fingerprint == j3) {
                                        xvVar.o(encryptedChat);
                                    }
                                    tr messagesStorage = xvVar.getMessagesStorage();
                                    messagesStorage.a.c(new xf(messagesStorage, encryptedChat, z11, 10));
                                    message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                                    message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                                    tr messagesStorage2 = xvVar.getMessagesStorage();
                                    messagesStorage2.a.c(new hi.c0(messagesStorage2, message.id, message.seq_in, message.seq_out, 3));
                                }
                                if (s2.a) {
                                    a8.b(decryptedMessage + " send message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
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
                                boolean z13 = encryptedChat.admin_id == xvVar.getUserConfig().e();
                                byte[] bArr4 = encryptedChat.auth_key;
                                int i18 = !z13 ? 8 : 0;
                                ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
                                System.arraycopy(Utilities.p(bArr4, 88 + i18, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
                                nativeByteBuffer.reuse();
                                ji.j K = ji.j.K(2, z13, encryptedChat.auth_key, bArr3);
                                Utilities.c(nativeByteBuffer2.buffer, (byte[]) K.b, (byte[]) K.c, true, false, 0, nativeByteBuffer2.limit());
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
                                xvVar.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new yn(xvVar, decryptedMessage, encryptedChat, message, fjVar, str), 64);
                                break;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            z10 = true;
                            a8.g(e, z10);
                            return;
                        }
                    }
                    j3 = 0;
                    i11 = message.seq_in;
                    if (i11 == 0) {
                    }
                    tL_decryptedMessageLayer.in_seq_no = i11;
                    tL_decryptedMessageLayer.out_seq_no = message.seq_out;
                    if (s2.a) {
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
                    if (encryptedChat.admin_id == xvVar.getUserConfig().e()) {
                    }
                    byte[] bArr42 = encryptedChat.auth_key;
                    if (!z13) {
                    }
                    ByteBuffer byteBuffer2 = nativeByteBuffer22.buffer;
                    System.arraycopy(Utilities.p(bArr42, 88 + i18, byteBuffer2, 0, byteBuffer2.limit()), 8, bArr32, 0, 16);
                    nativeByteBuffer4.reuse();
                    ji.j K2 = ji.j.K(2, z13, encryptedChat.auth_key, bArr32);
                    Utilities.c(nativeByteBuffer22.buffer, (byte[]) K2.b, (byte[]) K2.c, true, false, 0, nativeByteBuffer22.limit());
                    NativeByteBuffer nativeByteBuffer32 = new NativeByteBuffer(24 + nativeByteBuffer22.length());
                    nativeByteBuffer22.position(0);
                    nativeByteBuffer32.writeInt64(encryptedChat.key_fingerprint);
                    nativeByteBuffer32.writeBytes(bArr32);
                    nativeByteBuffer32.writeBytes(nativeByteBuffer22);
                    nativeByteBuffer22.reuse();
                    nativeByteBuffer32.position(0);
                    if (inputEncryptedFile == null) {
                    }
                    xvVar.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new yn(xvVar, decryptedMessage, encryptedChat, message, fjVar, str), 64);
                } catch (Exception e13) {
                    e = e13;
                    z10 = true;
                }
                break;
            default:
                z00 z00Var = (z00) c1Var;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj6;
                z00Var.getClass();
                storyItem.translatedLng = (String) obj5;
                storyItem.translatedText = y21.R0((TLRPC.TL_textWithEntities) obj4, (TLRPC.TL_textWithEntities) obj3);
                z00Var.getMessagesController().R1().k.h(storyItem.dialogId, storyItem);
                z00Var.K.remove((x00) obj2);
                ((bi.y3) obj).run();
                break;
        }
    }
}

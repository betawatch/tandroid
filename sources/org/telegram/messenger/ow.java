package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLClassStore;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ow extends f1 {
    public static volatile ow[] r = new ow[4];
    public final ArrayList a;
    public final SparseArray b;
    public final SparseArray c;
    public final SparseArray d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public boolean n;

    public ow(int i10) {
        super(i10);
        this.a = new ArrayList();
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010d, code lost:
    
        if (r0 > 1024) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0116, code lost:
    
        return !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        if (r0 > 15) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.security.MessageDigest] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(NativeByteBuffer nativeByteBuffer, byte[] bArr, byte[] bArr2, int i10, boolean z10, boolean z11) {
        byte[] bArr3;
        boolean z12 = false;
        boolean z13 = i10 == 1 ? false : z10;
        m5.e M = m5.e.M(i10, z13, bArr, bArr2);
        Utilities.c(nativeByteBuffer.buffer, (byte[]) M.b, (byte[]) M.c, false, false, 24, nativeByteBuffer.limit() - 24);
        int readInt32 = nativeByteBuffer.readInt32(false);
        if (i10 == 2) {
            int i11 = z13 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer.buffer;
            if (!Utilities.d(bArr2, Utilities.p(bArr, i11 + 88, byteBuffer, 24, byteBuffer.limit()), 8)) {
                if (z11) {
                    Utilities.c(nativeByteBuffer.buffer, (byte[]) M.b, (byte[]) M.c, true, false, 24, nativeByteBuffer.limit() - 24);
                    nativeByteBuffer.position(24);
                }
                z12 = true;
            }
            if (readInt32 <= 0) {
                z12 = true;
            }
            if (readInt32 > nativeByteBuffer.limit() - 28) {
                z12 = true;
            }
            int limit = (nativeByteBuffer.limit() - 28) - readInt32;
            if (i10 != 2) {
                if (limit < 12) {
                    z12 = true;
                }
            }
        } else {
            int i12 = readInt32 + 28;
            if (i12 < nativeByteBuffer.buffer.limit() - 15 || i12 > nativeByteBuffer.buffer.limit()) {
                i12 = nativeByteBuffer.buffer.limit();
            }
            ?? r62 = nativeByteBuffer.buffer;
            int position = r62.position();
            int limit2 = r62.limit();
            try {
                try {
                    ?? messageDigest = MessageDigest.getInstance("SHA-1");
                    r62.position(24);
                    r62.limit(i12);
                    messageDigest.update(r62);
                    bArr3 = messageDigest.digest();
                } catch (Exception e) {
                    f8.g(e, true);
                    r62.limit(limit2);
                    r62.position(position);
                    bArr3 = new byte[20];
                }
                r62 = bArr3.length - 16;
                if (!Utilities.d(bArr2, bArr3, r62)) {
                    if (z11) {
                        Utilities.c(nativeByteBuffer.buffer, (byte[]) M.b, (byte[]) M.c, true, false, 24, nativeByteBuffer.limit() - 24);
                        nativeByteBuffer.position(24);
                    }
                    z12 = true;
                }
                if (readInt32 <= 0) {
                }
                if (readInt32 > nativeByteBuffer.limit() - 28) {
                }
                int limit3 = (nativeByteBuffer.limit() - 28) - readInt32;
                if (i10 != 2) {
                }
            } finally {
                r62.limit(limit2);
                r62.position(position);
            }
        }
    }

    public static ow i(int i10) {
        ow owVar;
        ow owVar2 = r[i10];
        if (owVar2 != null) {
            return owVar2;
        }
        synchronized (ow.class) {
            try {
                owVar = r[i10];
                if (owVar == null) {
                    ow[] owVarArr = r;
                    ow owVar3 = new ow(i10);
                    owVarArr[i10] = owVar3;
                    owVar = owVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return owVar;
    }

    public final void A(Activity activity, TLRPC.User user) {
        if (user == null || activity == null) {
            return;
        }
        if (getMessagesController().u2()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        this.n = true;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, activity, null);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        hs messagesStorage = getMessagesStorage();
        messagesStorage.H();
        tL_messages_getDhConfig.version = messagesStorage.x;
        x1Var.setOnCancelListener(new jm(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new r6(this, activity, x1Var, user, 4), 2), 2));
        try {
            x1Var.show();
        } catch (Exception unused) {
        }
    }

    public final void a(TLRPC.EncryptedChat encryptedChat, int i10) {
        int X0 = i0.X0(encryptedChat.layer);
        if (i10 <= X0) {
            return;
        }
        if (encryptedChat.key_hash.length == 16) {
            try {
                byte[] o10 = Utilities.o(r1.length, encryptedChat.auth_key);
                byte[] bArr = new byte[36];
                System.arraycopy(encryptedChat.key_hash, 0, bArr, 0, 16);
                System.arraycopy(o10, 0, bArr, 16, 20);
                encryptedChat.key_hash = bArr;
                getMessagesStorage().V1(encryptedChat);
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        encryptedChat.layer = (i10 << 16) | (encryptedChat.layer & 65535);
        hs messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new kq(messagesStorage, encryptedChat, 2));
        if (X0 < 151) {
            w(encryptedChat, null);
        }
        i0.g3(new hw(this, encryptedChat, 0));
    }

    public final void b(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList) {
        boolean z10;
        nw nwVar;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i10;
        int i11;
        int i12 = encryptedChat.id;
        SparseArray sparseArray = this.b;
        ArrayList arrayList2 = (ArrayList) sparseArray.get(i12);
        if (arrayList2 == null) {
            return;
        }
        Collections.sort(arrayList2, new bk(20));
        boolean z11 = false;
        while (true) {
            z10 = true;
            if (arrayList2.size() <= 0 || !((i10 = (tL_decryptedMessageLayer = (nwVar = (nw) arrayList2.get(0)).b).out_seq_no) == (i11 = encryptedChat.seq_in) || i11 == i10 - 2)) {
                break;
            }
            a(encryptedChat, tL_decryptedMessageLayer.layer);
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer2 = nwVar.b;
            encryptedChat.seq_in = tL_decryptedMessageLayer2.out_seq_no;
            encryptedChat.in_seq_no = tL_decryptedMessageLayer2.in_seq_no;
            arrayList2.remove(0);
            if (nwVar.e == 2) {
                encryptedChat.mtproto_seq = Math.min(encryptedChat.mtproto_seq, encryptedChat.seq_in);
            }
            TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
            TLRPC.Message l4 = l(encryptedChat2, nwVar.c, nwVar.a, nwVar.b.message, nwVar.d);
            if (l4 != null) {
                arrayList.add(l4);
            }
            z11 = true;
            encryptedChat = encryptedChat2;
        }
        TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
        if (arrayList2.isEmpty()) {
            sparseArray.remove(encryptedChat3.id);
        }
        if (z11) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new wf(messagesStorage, encryptedChat3, z10, 10));
        }
    }

    public final TLRPC.TL_messageService c(int i10, int i11, int i12, long j10, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j10));
        tL_messageService.id = i10;
        tL_messageService.local_id = i10;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = o5.F(encryptedChat.id);
        tL_messageService.send_state = 1;
        tL_messageService.seq_in = i12;
        tL_messageService.seq_out = i11;
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        if (encryptedChat.participant_id == getUserConfig().e()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        tL_messageService.date = 0;
        tL_messageService.random_id = j10;
        return tL_messageService;
    }

    public final TLRPC.TL_messageService d(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int j10 = getUserConfig().j();
        tL_messageService.id = j10;
        tL_messageService.local_id = j10;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = o5.F(encryptedChat.id);
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        tL_messageService.send_state = 1;
        if (encryptedChat.participant_id == getUserConfig().e()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        } else {
            tL_messageService.date = 0;
        }
        getSendMessagesHelper().getClass();
        tL_messageService.random_id = qz.E();
        getUserConfig().v(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    public final void e(int i10, long j10, boolean z10) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (j10 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e7) {
                nativeByteBuffer = null;
                e = e7;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i10);
                nativeByteBuffer.writeBool(z10);
            } catch (Exception e10) {
                e = e10;
                f8.g(e, true);
                j10 = getMessagesStorage().z(nativeByteBuffer);
                TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
                tL_messages_discardEncryption.chat_id = i10;
                tL_messages_discardEncryption.delete_history = z10;
                getConnectionsManager().sendRequest(tL_messages_discardEncryption, new s4(this, j10, 3));
            }
            j10 = getMessagesStorage().z(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption2 = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption2.chat_id = i10;
        tL_messages_discardEncryption2.delete_history = z10;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption2, new s4(this, j10, 3));
    }

    public final void f(int i10, boolean z10) {
        e(i10, 0L, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x021f, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_decryptedMessageService) r12).action instanceof org.telegram.tgnet.TLRPC.TL_decryptedMessageActionNotifyLayer) != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList g(TLRPC.EncryptedMessage encryptedMessage) {
        boolean z10;
        boolean z11;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        SparseArray sparseArray = this.c;
        SparseArray sparseArray2 = this.b;
        TLRPC.EncryptedChat a12 = getMessagesController().a1(encryptedMessage.chat_id, true);
        if (a12 == null || (a12 instanceof TLRPC.TL_encryptedChatDiscarded)) {
            return null;
        }
        try {
            try {
                if (a12 instanceof TLRPC.TL_encryptedChatWaiting) {
                    ArrayList arrayList = (ArrayList) sparseArray.get(a12.id);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        sparseArray.put(a12.id, arrayList);
                    }
                    TL_update.TL_updateNewEncryptedMessage tL_updateNewEncryptedMessage = new TL_update.TL_updateNewEncryptedMessage();
                    tL_updateNewEncryptedMessage.message = encryptedMessage;
                    arrayList.add(tL_updateNewEncryptedMessage);
                    return null;
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedMessage.bytes.length);
                nativeByteBuffer.writeBytes(encryptedMessage.bytes);
                nativeByteBuffer.position(0);
                long readInt64 = nativeByteBuffer.readInt64(false);
                if (a12.key_fingerprint == readInt64) {
                    bArr = a12.auth_key;
                    z11 = false;
                } else {
                    long j10 = a12.future_key_fingerprint;
                    if (j10 == 0 || j10 != readInt64) {
                        z11 = false;
                        bArr = null;
                    } else {
                        bArr = a12.future_auth_key;
                        z11 = true;
                    }
                }
                if (bArr != null) {
                    byte[] readData = nativeByteBuffer.readData(16, false);
                    boolean z12 = z11;
                    boolean z13 = a12.admin_id == getUserConfig().e();
                    boolean z14 = a12.mtproto_seq == 0;
                    byte[] bArr2 = bArr;
                    if (h(nativeByteBuffer, bArr2, readData, 2, z13, z14)) {
                        i10 = 2;
                        i11 = 2;
                    } else {
                        if (!z14) {
                            return null;
                        }
                        i10 = 2;
                        try {
                            if (!h(nativeByteBuffer, bArr2, readData, 1, z13, false)) {
                                return null;
                            }
                            i11 = 1;
                        } catch (Exception e) {
                            e = e;
                            z10 = true;
                            f8.g(e, z10);
                            return null;
                        }
                    }
                    TLObject TLdeserialize = TLClassStore.Instance().TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(false), false);
                    nativeByteBuffer.reuse();
                    if (!z12) {
                        a12.key_use_count_in = (short) (a12.key_use_count_in + 1);
                    }
                    if (TLdeserialize instanceof TLRPC.TL_decryptedMessageLayer) {
                        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = (TLRPC.TL_decryptedMessageLayer) TLdeserialize;
                        if (a12.seq_in == 0 && a12.seq_out == 0) {
                            if (a12.admin_id == getUserConfig().e()) {
                                a12.seq_out = 1;
                                a12.seq_in = -2;
                            } else {
                                a12.seq_in = -1;
                            }
                        }
                        if (tL_decryptedMessageLayer.random_bytes.length < 15) {
                            if (!v2.a) {
                                return null;
                            }
                            f8.d("got random bytes less than needed");
                            return null;
                        }
                        if (v2.a) {
                            f8.b("current chat in_seq = " + a12.seq_in + " out_seq = " + a12.seq_out);
                            f8.b("got message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
                        }
                        int i13 = tL_decryptedMessageLayer.out_seq_no;
                        int i14 = a12.seq_in;
                        if (i13 <= i14) {
                            return null;
                        }
                        if (i11 == 1 && (i12 = a12.mtproto_seq) != 0 && i13 >= i12) {
                            return null;
                        }
                        if (i14 != i13 - i10) {
                            if (v2.a) {
                                f8.d("got hole");
                            }
                            y(a12, a12.seq_in + i10, tL_decryptedMessageLayer.out_seq_no - i10, null);
                            ArrayList arrayList2 = (ArrayList) sparseArray2.get(a12.id);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                sparseArray2.put(a12.id, arrayList2);
                            }
                            if (arrayList2.size() < 4) {
                                nw nwVar = new nw();
                                nwVar.b = tL_decryptedMessageLayer;
                                nwVar.c = encryptedMessage.file;
                                nwVar.a = encryptedMessage.date;
                                nwVar.d = z12;
                                nwVar.e = i11;
                                arrayList2.add(nwVar);
                                return null;
                            }
                            sparseArray2.remove(a12.id);
                            TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
                            tL_encryptedChatDiscarded.id = a12.id;
                            tL_encryptedChatDiscarded.user_id = a12.user_id;
                            tL_encryptedChatDiscarded.auth_key = a12.auth_key;
                            tL_encryptedChatDiscarded.key_create_date = a12.key_create_date;
                            tL_encryptedChatDiscarded.key_use_count_in = a12.key_use_count_in;
                            tL_encryptedChatDiscarded.key_use_count_out = a12.key_use_count_out;
                            tL_encryptedChatDiscarded.seq_in = a12.seq_in;
                            tL_encryptedChatDiscarded.seq_out = a12.seq_out;
                            i0.g3(new jw(this, tL_encryptedChatDiscarded, 1));
                            f(a12.id, false);
                            return null;
                        }
                        if (i11 == i10) {
                            a12.mtproto_seq = Math.min(a12.mtproto_seq, i14);
                        }
                        a(a12, tL_decryptedMessageLayer.layer);
                        a12.seq_in = tL_decryptedMessageLayer.out_seq_no;
                        a12.in_seq_no = tL_decryptedMessageLayer.in_seq_no;
                        hs messagesStorage = getMessagesStorage();
                        messagesStorage.a.c(new wf((Object) messagesStorage, (Object) a12, true, 10));
                        TLdeserialize = tL_decryptedMessageLayer.message;
                    } else if (TLdeserialize instanceof TLRPC.TL_decryptedMessageService) {
                    }
                    TLObject tLObject = TLdeserialize;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.Message l4 = l(a12, encryptedMessage.file, encryptedMessage.date, tLObject, z12);
                    if (l4 != null) {
                        arrayList3.add(l4);
                    }
                    b(a12, arrayList3);
                    return arrayList3;
                }
                nativeByteBuffer.reuse();
                if (v2.a) {
                    f8.d(String.format("fingerprint mismatch %x", Long.valueOf(readInt64)));
                    return null;
                }
                return null;
            } catch (Exception e7) {
                e = e7;
                z10 = true;
            }
        } catch (Exception e10) {
            e = e10;
            z10 = true;
        }
    }

    public final void j(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, jj jjVar) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().f0(message, false);
        Utilities.d.c(new gn(this, encryptedChat, decryptedMessage, message, inputEncryptedFile, jjVar, str, 3));
    }

    public final void k(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, cz czVar) {
        for (int i10 = 0; i10 < tL_messages_sendEncryptedMultiMedia.files.size(); i10++) {
            j(tL_messages_sendEncryptedMultiMedia.messages.get(i10), (TLRPC.Message) czVar.z.get(i10), czVar.n, tL_messages_sendEncryptedMultiMedia.files.get(i10), (String) czVar.B.get(i10), (jj) czVar.x.get(i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:290:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.Message l(TLRPC.EncryptedChat encryptedChat, TLRPC.EncryptedFile encryptedFile, int i10, TLObject tLObject, boolean z10) {
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        long g10;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        TLRPC.PhotoSize tL_photoSizeEmpty;
        byte[] bArr5;
        TLRPC.PhotoSize tL_photoSizeEmpty2;
        byte[] bArr6;
        if (tLObject != null) {
            long j10 = encryptedChat.admin_id;
            if (j10 == getUserConfig().e()) {
                j10 = encryptedChat.participant_id;
            }
            if (encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0 && encryptedChat.key_use_count_in >= 120) {
                o(encryptedChat);
            }
            long j11 = encryptedChat.exchange_id;
            if (j11 == 0 && encryptedChat.future_key_fingerprint != 0 && !z10) {
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                getMessagesStorage().V1(encryptedChat);
            } else if (j11 != 0 && z10) {
                encryptedChat.key_fingerprint = encryptedChat.future_key_fingerprint;
                encryptedChat.auth_key = encryptedChat.future_auth_key;
                encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                encryptedChat.key_use_count_in = (short) 0;
                encryptedChat.key_use_count_out = (short) 0;
                encryptedChat.exchange_id = 0L;
                getMessagesStorage().V1(encryptedChat);
            }
            if (tLObject instanceof TLRPC.TL_decryptedMessage) {
                TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) tLObject;
                TLRPC.TL_message_secret tL_message_secret = new TLRPC.TL_message_secret();
                tL_message_secret.ttl = tL_decryptedMessage.ttl;
                tL_message_secret.entities = tL_decryptedMessage.entities;
                tL_message_secret.message = tL_decryptedMessage.message;
                tL_message_secret.date = i10;
                int j12 = getUserConfig().j();
                tL_message_secret.id = j12;
                tL_message_secret.local_id = j12;
                tL_message_secret.silent = tL_decryptedMessage.silent;
                getUserConfig().v(false);
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message_secret.from_id = tL_peerUser;
                tL_peerUser.user_id = j10;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message_secret.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = getUserConfig().e();
                tL_message_secret.random_id = tL_decryptedMessage.random_id;
                tL_message_secret.unread = true;
                tL_message_secret.flags = 768;
                String str = tL_decryptedMessage.via_bot_name;
                if (str != null && str.length() > 0) {
                    tL_message_secret.via_bot_name = tL_decryptedMessage.via_bot_name;
                    tL_message_secret.flags |= 2048;
                }
                long j13 = tL_decryptedMessage.grouped_id;
                if (j13 != 0) {
                    tL_message_secret.grouped_id = j13;
                    tL_message_secret.flags |= 131072;
                }
                tL_message_secret.dialog_id = o5.F(encryptedChat.id);
                if (tL_decryptedMessage.reply_to_random_id != 0) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_message_secret.reply_to = tL_messageReplyHeader;
                    tL_messageReplyHeader.reply_to_random_id = tL_decryptedMessage.reply_to_random_id;
                    tL_message_secret.flags |= 8;
                }
                TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                if (decryptedMessageMedia == null || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaEmpty)) {
                    tL_message_secret.media = new TLRPC.TL_messageMediaEmpty();
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaWebPage) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    tL_message_secret.media = tL_messageMediaWebPage;
                    tL_messageMediaWebPage.webpage = new TLRPC.TL_webPageUrlPending();
                    tL_message_secret.media.webpage.url = tL_decryptedMessage.media.url;
                } else {
                    if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                        tL_message_secret.media = tL_messageMediaContact;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = tL_decryptedMessage.media;
                        tL_messageMediaContact.last_name = decryptedMessageMedia2.last_name;
                        tL_messageMediaContact.first_name = decryptedMessageMedia2.first_name;
                        tL_messageMediaContact.phone_number = decryptedMessageMedia2.phone_number;
                        tL_messageMediaContact.user_id = decryptedMessageMedia2.user_id;
                        tL_messageMediaContact.vcard = "";
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaGeoPoint) {
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        tL_message_secret.media = tL_messageMediaGeo;
                        tL_messageMediaGeo.geo = new TLRPC.TL_geoPoint();
                        TLRPC.GeoPoint geoPoint = tL_message_secret.media.geo;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia3 = tL_decryptedMessage.media;
                        geoPoint.lat = decryptedMessageMedia3.lat;
                        geoPoint._long = decryptedMessageMedia3._long;
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaPhoto) {
                        byte[] bArr7 = decryptedMessageMedia.key;
                        if (bArr7 != null && bArr7.length == 32 && (bArr6 = decryptedMessageMedia.iv) != null && bArr6.length == 32) {
                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                            tL_message_secret.media = tL_messageMediaPhoto;
                            tL_messageMediaPhoto.flags |= 3;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str2 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str2 != null ? str2 : "";
                            }
                            tL_message_secret.media.photo = new TLRPC.TL_photo();
                            TLRPC.Photo photo = tL_message_secret.media.photo;
                            photo.file_reference = new byte[0];
                            photo.date = tL_message_secret.date;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia4 = tL_decryptedMessage.media;
                            byte[] bArr8 = ((TLRPC.TL_decryptedMessageMediaPhoto) decryptedMessageMedia4).thumb;
                            if (bArr8 != null && bArr8.length != 0 && bArr8.length <= 6000 && decryptedMessageMedia4.thumb_w <= 100 && decryptedMessageMedia4.thumb_h <= 100) {
                                TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia5 = tL_decryptedMessage.media;
                                tL_photoCachedSize.w = decryptedMessageMedia5.thumb_w;
                                tL_photoCachedSize.h = decryptedMessageMedia5.thumb_h;
                                tL_photoCachedSize.bytes = bArr8;
                                tL_photoCachedSize.type = "s";
                                tL_photoCachedSize.location = new TLRPC.TL_fileLocationUnavailable();
                                tL_message_secret.media.photo.sizes.add(tL_photoCachedSize);
                            }
                            int i14 = tL_message_secret.ttl;
                            if (i14 != 0) {
                                TLRPC.MessageMedia messageMedia = tL_message_secret.media;
                                messageMedia.ttl_seconds = i14;
                                messageMedia.flags |= 4;
                            }
                            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia6 = tL_decryptedMessage.media;
                            tL_photoSize_layer127.w = decryptedMessageMedia6.w;
                            tL_photoSize_layer127.h = decryptedMessageMedia6.h;
                            tL_photoSize_layer127.type = "x";
                            tL_photoSize_layer127.size = (int) encryptedFile.size;
                            TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                            tL_photoSize_layer127.location = tL_fileEncryptedLocation;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia7 = tL_decryptedMessage.media;
                            tL_fileEncryptedLocation.key = decryptedMessageMedia7.key;
                            tL_fileEncryptedLocation.iv = decryptedMessageMedia7.iv;
                            tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                            tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                            tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                            tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                            tL_message_secret.media.photo.sizes.add(tL_photoSize_layer127);
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVideo) {
                        byte[] bArr9 = decryptedMessageMedia.key;
                        if (bArr9 != null && bArr9.length == 32 && (bArr5 = decryptedMessageMedia.iv) != null && bArr5.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument;
                            tL_messageMediaDocument.flags |= 3;
                            tL_messageMediaDocument.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia8 = tL_decryptedMessage.media;
                            document.key = decryptedMessageMedia8.key;
                            document.iv = decryptedMessageMedia8.iv;
                            document.dc_id = encryptedFile.dc_id;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str3 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str3 != null ? str3 : "";
                            }
                            TLRPC.Document document2 = tL_message_secret.media.document;
                            document2.date = i10;
                            document2.size = encryptedFile.size;
                            document2.id = encryptedFile.id;
                            document2.access_hash = encryptedFile.access_hash;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia9 = tL_decryptedMessage.media;
                            String str4 = decryptedMessageMedia9.mime_type;
                            document2.mime_type = str4;
                            if (str4 == null) {
                                document2.mime_type = "video/mp4";
                            }
                            byte[] bArr10 = ((TLRPC.TL_decryptedMessageMediaVideo) decryptedMessageMedia9).thumb;
                            if (bArr10 == null || bArr10.length == 0 || bArr10.length > 6000 || decryptedMessageMedia9.thumb_w > 100 || decryptedMessageMedia9.thumb_h > 100) {
                                tL_photoSizeEmpty2 = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty2.type = "s";
                            } else {
                                tL_photoSizeEmpty2 = new TLRPC.TL_photoCachedSize();
                                tL_photoSizeEmpty2.bytes = bArr10;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia10 = tL_decryptedMessage.media;
                                tL_photoSizeEmpty2.w = decryptedMessageMedia10.thumb_w;
                                tL_photoSizeEmpty2.h = decryptedMessageMedia10.thumb_h;
                                tL_photoSizeEmpty2.type = "s";
                                tL_photoSizeEmpty2.location = new TLRPC.TL_fileLocationUnavailable();
                            }
                            tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty2);
                            tL_message_secret.media.document.flags |= 1;
                            TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia11 = tL_decryptedMessage.media;
                            tL_documentAttributeVideo_layer159.w = decryptedMessageMedia11.w;
                            tL_documentAttributeVideo_layer159.h = decryptedMessageMedia11.h;
                            tL_documentAttributeVideo_layer159.duration = decryptedMessageMedia11.duration;
                            tL_documentAttributeVideo_layer159.supports_streaming = false;
                            tL_message_secret.media.document.attributes.add(tL_documentAttributeVideo_layer159);
                            int i15 = tL_message_secret.ttl;
                            if (i15 != 0) {
                                TLRPC.MessageMedia messageMedia2 = tL_message_secret.media;
                                messageMedia2.ttl_seconds = i15;
                                messageMedia2.flags |= 4;
                            }
                            if (i15 != 0) {
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i15);
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaDocument) {
                        byte[] bArr11 = decryptedMessageMedia.key;
                        if (bArr11 != null && bArr11.length == 32 && (bArr4 = decryptedMessageMedia.iv) != null && bArr4.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument2;
                            tL_messageMediaDocument2.flags |= 3;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str5 = tL_decryptedMessage.media.caption;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                tL_message_secret.message = str5;
                            }
                            tL_message_secret.media.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document3 = tL_message_secret.media.document;
                            document3.id = encryptedFile.id;
                            document3.access_hash = encryptedFile.access_hash;
                            document3.date = i10;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia12 = tL_decryptedMessage.media;
                            document3.mime_type = decryptedMessageMedia12.mime_type;
                            if (decryptedMessageMedia12 instanceof TLRPC.TL_decryptedMessageMediaDocument_layer8) {
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = tL_decryptedMessage.media.file_name;
                                tL_message_secret.media.document.attributes.add(tL_documentAttributeFilename);
                            } else {
                                document3.attributes = decryptedMessageMedia12.attributes;
                            }
                            if (tL_message_secret.ttl > 0) {
                                int size = tL_message_secret.media.document.attributes.size();
                                for (int i16 = 0; i16 < size; i16++) {
                                    TLRPC.DocumentAttribute documentAttribute = tL_message_secret.media.document.attributes.get(i16);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        tL_message_secret.ttl = (int) Math.max(documentAttribute.duration + 1.0d, tL_message_secret.ttl);
                                        break;
                                    }
                                }
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, tL_message_secret.ttl);
                            }
                            TLRPC.Document document4 = tL_message_secret.media.document;
                            long j14 = tL_decryptedMessage.media.size;
                            document4.size = j14 != 0 ? Math.min(j14, encryptedFile.size) : encryptedFile.size;
                            TLRPC.Document document5 = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia13 = tL_decryptedMessage.media;
                            document5.key = decryptedMessageMedia13.key;
                            document5.iv = decryptedMessageMedia13.iv;
                            String str6 = document5.mime_type;
                            if (str6 == null) {
                                document5.mime_type = "";
                            } else if ("application/x-tgsticker".equals(str6) || "application/x-tgsdice".equals(tL_message_secret.media.document.mime_type)) {
                                tL_message_secret.media.document.mime_type = "application/x-bad_tgsticker";
                            }
                            byte[] bArr12 = ((TLRPC.TL_decryptedMessageMediaDocument) tL_decryptedMessage.media).thumb;
                            if (bArr12 == null || bArr12.length == 0 || bArr12.length > 20000) {
                                tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty.type = "s";
                            } else {
                                tL_photoSizeEmpty = new TLRPC.TL_photoCachedSize();
                                tL_photoSizeEmpty.bytes = bArr12;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia14 = tL_decryptedMessage.media;
                                tL_photoSizeEmpty.w = decryptedMessageMedia14.thumb_w;
                                tL_photoSizeEmpty.h = decryptedMessageMedia14.thumb_h;
                                tL_photoSizeEmpty.type = "s";
                                tL_photoSizeEmpty.location = new TLRPC.TL_fileLocationUnavailable();
                            }
                            tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty);
                            TLRPC.Document document6 = tL_message_secret.media.document;
                            document6.flags |= 1;
                            document6.dc_id = encryptedFile.dc_id;
                            if (jj.R4(tL_message_secret) || jj.j4(tL_message_secret)) {
                                tL_message_secret.media_unread = true;
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaExternalDocument) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                        tL_message_secret.media = tL_messageMediaDocument3;
                        tL_messageMediaDocument3.flags |= 3;
                        tL_message_secret.message = "";
                        tL_messageMediaDocument3.document = new TLRPC.TL_document();
                        TLRPC.Document document7 = tL_message_secret.media.document;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia15 = tL_decryptedMessage.media;
                        document7.id = decryptedMessageMedia15.id;
                        document7.access_hash = decryptedMessageMedia15.access_hash;
                        document7.file_reference = new byte[0];
                        document7.date = decryptedMessageMedia15.date;
                        document7.attributes = decryptedMessageMedia15.attributes;
                        document7.mime_type = decryptedMessageMedia15.mime_type;
                        document7.dc_id = decryptedMessageMedia15.dc_id;
                        document7.size = decryptedMessageMedia15.size;
                        document7.thumbs.add(((TLRPC.TL_decryptedMessageMediaExternalDocument) decryptedMessageMedia15).thumb);
                        TLRPC.Document document8 = tL_message_secret.media.document;
                        document8.flags |= 1;
                        if (document8.mime_type == null) {
                            document8.mime_type = "";
                        }
                        if (jj.L2(tL_message_secret)) {
                            tL_message_secret.stickerVerified = 0;
                            getMediaDataController().n2(tL_message_secret, true);
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaAudio) {
                        byte[] bArr13 = decryptedMessageMedia.key;
                        if (bArr13 != null && bArr13.length == 32 && (bArr3 = decryptedMessageMedia.iv) != null && bArr3.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument4;
                            tL_messageMediaDocument4.flags |= 3;
                            tL_messageMediaDocument4.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document9 = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia16 = tL_decryptedMessage.media;
                            document9.key = decryptedMessageMedia16.key;
                            document9.iv = decryptedMessageMedia16.iv;
                            document9.id = encryptedFile.id;
                            document9.access_hash = encryptedFile.access_hash;
                            document9.date = i10;
                            document9.size = encryptedFile.size;
                            document9.dc_id = encryptedFile.dc_id;
                            document9.mime_type = decryptedMessageMedia16.mime_type;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str7 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str7 != null ? str7 : "";
                            }
                            TLRPC.Document document10 = tL_message_secret.media.document;
                            if (document10.mime_type == null) {
                                document10.mime_type = "audio/ogg";
                            }
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = tL_decryptedMessage.media.duration;
                            tL_documentAttributeAudio.voice = true;
                            tL_message_secret.media.document.attributes.add(tL_documentAttributeAudio);
                            int i17 = tL_message_secret.ttl;
                            if (i17 != 0) {
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i17);
                            }
                            if (tL_message_secret.media.document.thumbs.isEmpty()) {
                                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty3 = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty3.type = "s";
                                tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty3);
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVenue) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                        tL_message_secret.media = tL_messageMediaVenue;
                        tL_messageMediaVenue.geo = new TLRPC.TL_geoPoint();
                        TLRPC.MessageMedia messageMedia3 = tL_message_secret.media;
                        TLRPC.GeoPoint geoPoint2 = messageMedia3.geo;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia17 = tL_decryptedMessage.media;
                        geoPoint2.lat = decryptedMessageMedia17.lat;
                        geoPoint2._long = decryptedMessageMedia17._long;
                        messageMedia3.title = decryptedMessageMedia17.title;
                        messageMedia3.address = decryptedMessageMedia17.address;
                        messageMedia3.provider = decryptedMessageMedia17.provider;
                        messageMedia3.venue_id = decryptedMessageMedia17.venue_id;
                        messageMedia3.venue_type = "";
                    }
                }
                int i18 = tL_message_secret.ttl;
                if (i18 != 0) {
                    TLRPC.MessageMedia messageMedia4 = tL_message_secret.media;
                    if (messageMedia4.ttl_seconds == 0) {
                        messageMedia4.ttl_seconds = i18;
                        messageMedia4.flags |= 4;
                    }
                }
                String str8 = tL_message_secret.message;
                if (str8 != null) {
                    tL_message_secret.message = str8.replace((char) 8238, ' ');
                }
                return tL_message_secret;
            }
            if (tLObject instanceof TLRPC.TL_decryptedMessageService) {
                TLRPC.TL_decryptedMessageService tL_decryptedMessageService = (TLRPC.TL_decryptedMessageService) tLObject;
                TLRPC.DecryptedMessageAction decryptedMessageAction = tL_decryptedMessageService.action;
                if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages)) {
                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                    if (tL_decryptedMessageService.action instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
                        tL_messageService.action = tL_messageEncryptedAction;
                        TLRPC.DecryptedMessageAction decryptedMessageAction2 = tL_decryptedMessageService.action;
                        int i19 = decryptedMessageAction2.ttl_seconds;
                        if (i19 < 0 || i19 > 31536000) {
                            decryptedMessageAction2.ttl_seconds = 31536000;
                        }
                        encryptedChat.ttl = decryptedMessageAction2.ttl_seconds;
                        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction2;
                        hs messagesStorage = getMessagesStorage();
                        messagesStorage.a.c(new kq(messagesStorage, encryptedChat, 0));
                    } else {
                        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction2 = new TLRPC.TL_messageEncryptedAction();
                        tL_messageService.action = tL_messageEncryptedAction2;
                        tL_messageEncryptedAction2.encryptedAction = tL_decryptedMessageService.action;
                    }
                    int j15 = getUserConfig().j();
                    tL_messageService.id = j15;
                    tL_messageService.local_id = j15;
                    getUserConfig().v(false);
                    tL_messageService.unread = true;
                    tL_messageService.flags = 256;
                    tL_messageService.date = i10;
                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                    tL_messageService.from_id = tL_peerUser3;
                    tL_peerUser3.user_id = j10;
                    TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                    tL_messageService.peer_id = tL_peerUser4;
                    tL_peerUser4.user_id = getUserConfig().e();
                    tL_messageService.dialog_id = o5.F(encryptedChat.id);
                    return tL_messageService;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                    i0.g3(new iw(this, o5.F(encryptedChat.id), 0));
                    return null;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                    if (!decryptedMessageAction.random_ids.isEmpty()) {
                        this.h.addAll(tL_decryptedMessageService.action.random_ids);
                        return null;
                    }
                } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages)) {
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        a(encryptedChat, decryptedMessageAction.layer);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                        long j16 = encryptedChat.exchange_id;
                        if (j16 != 0) {
                            if (j16 <= decryptedMessageAction.exchange_id) {
                                p(encryptedChat, null, j16);
                            } else if (v2.a) {
                                f8.b("we already have request key with higher exchange_id");
                                return null;
                            }
                        }
                        byte[] bArr14 = new byte[256];
                        Utilities.b.nextBytes(bArr14);
                        hs messagesStorage2 = getMessagesStorage();
                        messagesStorage2.H();
                        BigInteger bigInteger = new BigInteger(1, messagesStorage2.y);
                        getMessagesStorage().H();
                        BigInteger modPow = BigInteger.valueOf(r5.D).modPow(new BigInteger(1, bArr14), bigInteger);
                        BigInteger bigInteger2 = new BigInteger(1, tL_decryptedMessageService.action.g_a);
                        if (!Utilities.w(bigInteger2, bigInteger)) {
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        byte[] byteArray = modPow.toByteArray();
                        if (byteArray.length > 256) {
                            byte[] bArr15 = new byte[256];
                            System.arraycopy(byteArray, 1, bArr15, 0, 256);
                            byteArray = bArr15;
                        }
                        byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr14), bigInteger).toByteArray();
                        if (byteArray2.length <= 256) {
                            if (byteArray2.length < 256) {
                                bArr2 = new byte[256];
                                System.arraycopy(byteArray2, 0, bArr2, 256 - byteArray2.length, byteArray2.length);
                                for (int i20 = 0; i20 < 256 - byteArray2.length; i20++) {
                                    bArr2[i20] = 0;
                                }
                            }
                            byte[] n10 = Utilities.n(byteArray2);
                            byte[] bArr16 = new byte[8];
                            System.arraycopy(n10, n10.length - 8, bArr16, 0, 8);
                            encryptedChat.exchange_id = tL_decryptedMessageService.action.exchange_id;
                            encryptedChat.future_auth_key = byteArray2;
                            encryptedChat.future_key_fingerprint = Utilities.g(bArr16);
                            encryptedChat.g_a_or_b = byteArray;
                            getMessagesStorage().V1(encryptedChat);
                            q(encryptedChat, null);
                            return null;
                        }
                        bArr2 = new byte[256];
                        System.arraycopy(byteArray2, byteArray2.length - 256, bArr2, 0, 256);
                        byteArray2 = bArr2;
                        byte[] n102 = Utilities.n(byteArray2);
                        byte[] bArr162 = new byte[8];
                        System.arraycopy(n102, n102.length - 8, bArr162, 0, 8);
                        encryptedChat.exchange_id = tL_decryptedMessageService.action.exchange_id;
                        encryptedChat.future_auth_key = byteArray2;
                        encryptedChat.future_key_fingerprint = Utilities.g(bArr162);
                        encryptedChat.g_a_or_b = byteArray;
                        getMessagesStorage().V1(encryptedChat);
                        q(encryptedChat, null);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                        if (encryptedChat.exchange_id != decryptedMessageAction.exchange_id) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().V1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        hs messagesStorage3 = getMessagesStorage();
                        messagesStorage3.H();
                        BigInteger bigInteger3 = new BigInteger(1, messagesStorage3.y);
                        BigInteger bigInteger4 = new BigInteger(1, tL_decryptedMessageService.action.g_b);
                        if (!Utilities.w(bigInteger4, bigInteger3)) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().V1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        byte[] byteArray3 = bigInteger4.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger3).toByteArray();
                        if (byteArray3.length <= 256) {
                            if (byteArray3.length < 256) {
                                bArr = new byte[256];
                                System.arraycopy(byteArray3, 0, bArr, 256 - byteArray3.length, byteArray3.length);
                                for (int i21 = 0; i21 < 256 - byteArray3.length; i21++) {
                                    bArr[i21] = 0;
                                }
                            }
                            byte[] n11 = Utilities.n(byteArray3);
                            byte[] bArr17 = new byte[8];
                            System.arraycopy(n11, n11.length - 8, bArr17, 0, 8);
                            g10 = Utilities.g(bArr17);
                            if (tL_decryptedMessageService.action.key_fingerprint != g10) {
                                encryptedChat.future_auth_key = byteArray3;
                                encryptedChat.future_key_fingerprint = g10;
                                getMessagesStorage().V1(encryptedChat);
                                s(encryptedChat, null);
                                return null;
                            }
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().V1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        bArr = new byte[256];
                        System.arraycopy(byteArray3, byteArray3.length - 256, bArr, 0, 256);
                        byteArray3 = bArr;
                        byte[] n112 = Utilities.n(byteArray3);
                        byte[] bArr172 = new byte[8];
                        System.arraycopy(n112, n112.length - 8, bArr172, 0, 8);
                        g10 = Utilities.g(bArr172);
                        if (tL_decryptedMessageService.action.key_fingerprint != g10) {
                        }
                    } else {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                            if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                                long j17 = encryptedChat.future_key_fingerprint;
                                if (j17 == decryptedMessageAction.key_fingerprint) {
                                    long j18 = encryptedChat.key_fingerprint;
                                    byte[] bArr18 = encryptedChat.auth_key;
                                    encryptedChat.key_fingerprint = j17;
                                    encryptedChat.auth_key = encryptedChat.future_auth_key;
                                    encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                                    encryptedChat.future_auth_key = bArr18;
                                    encryptedChat.future_key_fingerprint = j18;
                                    encryptedChat.key_use_count_in = (short) 0;
                                    encryptedChat.key_use_count_out = (short) 0;
                                    encryptedChat.exchange_id = 0L;
                                    getMessagesStorage().V1(encryptedChat);
                                    v(encryptedChat, null);
                                    return null;
                                }
                            }
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().V1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                            if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                                encryptedChat.future_auth_key = new byte[256];
                                encryptedChat.future_key_fingerprint = 0L;
                                encryptedChat.exchange_id = 0L;
                                getMessagesStorage().V1(encryptedChat);
                                return null;
                            }
                        } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) && (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) && (i11 = decryptedMessageAction.end_seq_no) >= (i12 = encryptedChat.in_seq_no) && i11 >= (i13 = decryptedMessageAction.start_seq_no)) {
                            if (i13 < i12) {
                                decryptedMessageAction.start_seq_no = i12;
                            }
                            long j19 = decryptedMessageAction.start_seq_no;
                            long j20 = i11;
                            long j21 = j20 - j19;
                            if (j19 >= 0 && j20 >= 0 && j20 < 2147483647L && j21 >= 0 && j21 <= 10000) {
                                getMessagesStorage().a.c(new y8(this, j19, encryptedChat, j20, 7));
                                return null;
                            }
                        }
                    }
                } else if (!decryptedMessageAction.random_ids.isEmpty()) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    hs messagesStorage4 = getMessagesStorage();
                    messagesStorage4.a.c(new er(messagesStorage4, encryptedChat.id, tL_decryptedMessageService.action.random_ids, 1, currentTime, currentTime));
                    return null;
                }
            } else if (v2.a) {
                f8.d("unknown message " + tLObject);
                return null;
            }
        } else if (v2.a) {
            f8.d("unknown TLObject");
        }
        return null;
    }

    public final void m() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        i0.g3(new mw(this, new ArrayList(arrayList), 1));
        ArrayList arrayList2 = new ArrayList(arrayList);
        hs messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        if (!arrayList2.isEmpty()) {
            messagesStorage.a.c(new xp(messagesStorage, arrayList2, 3));
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(TL_update.TL_updateEncryption tL_updateEncryption, ConcurrentHashMap concurrentHashMap) {
        long j10;
        TLRPC.EncryptedChat encryptedChat;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.EncryptedChat encryptedChat2 = tL_updateEncryption.chat;
        long F = o5.F(encryptedChat2.id);
        TLRPC.EncryptedChat a12 = getMessagesController().a1(encryptedChat2.id, false);
        if ((encryptedChat2 instanceof TLRPC.TL_encryptedChatRequested) && a12 == null) {
            long j11 = encryptedChat2.participant_id;
            if (j11 == getUserConfig().e()) {
                j11 = encryptedChat2.admin_id;
            }
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j11));
            if (Z1 == null) {
                Z1 = (TLRPC.User) concurrentHashMap.get(Long.valueOf(j11));
            }
            encryptedChat2.user_id = j11;
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = F;
            tL_dialog.folder_id = encryptedChat2.folder_id;
            tL_dialog.unread_count = 0;
            tL_dialog.top_message = 0;
            tL_dialog.last_message_date = tL_updateEncryption.date;
            getMessagesController().R3(encryptedChat2, false);
            j10 = F;
            i0.g3(new d4(this, tL_dialog, F, 7));
            hs messagesStorage = getMessagesStorage();
            encryptedChat = encryptedChat2;
            messagesStorage.a.c(new ul(messagesStorage, encryptedChat, Z1, tL_dialog, 20));
            int i10 = encryptedChat.id;
            SparseArray sparseArray = this.e;
            if (sparseArray.get(i10) == null) {
                sparseArray.put(encryptedChat.id, encryptedChat);
                TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
                tL_messages_getDhConfig.random_length = 256;
                hs messagesStorage2 = getMessagesStorage();
                messagesStorage2.H();
                tL_messages_getDhConfig.version = messagesStorage2.x;
                getConnectionsManager().sendRequest(tL_messages_getDhConfig, new kw(this, encryptedChat, 0));
            }
        } else {
            j10 = F;
            encryptedChat = encryptedChat2;
            if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
                if (a12 != null) {
                    encryptedChat.user_id = a12.user_id;
                    encryptedChat.auth_key = a12.auth_key;
                    encryptedChat.key_create_date = a12.key_create_date;
                    encryptedChat.key_use_count_in = a12.key_use_count_in;
                    encryptedChat.key_use_count_out = a12.key_use_count_out;
                    encryptedChat.ttl = a12.ttl;
                    encryptedChat.seq_in = a12.seq_in;
                    encryptedChat.seq_out = a12.seq_out;
                    encryptedChat.admin_id = a12.admin_id;
                    encryptedChat.mtproto_seq = a12.mtproto_seq;
                }
                i0.g3(new kg(this, a12, encryptedChat, 25));
            } else if ((a12 instanceof TLRPC.TL_encryptedChatWaiting) && ((bArr = a12.auth_key) == null || bArr.length == 1)) {
                encryptedChat.a_or_b = a12.a_or_b;
                encryptedChat.user_id = a12.user_id;
                hs messagesStorage3 = getMessagesStorage();
                messagesStorage3.H();
                BigInteger bigInteger = new BigInteger(1, messagesStorage3.y);
                BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a_or_b);
                if (Utilities.w(bigInteger2, bigInteger)) {
                    byte[] byteArray = bigInteger2.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger).toByteArray();
                    if (byteArray.length > 256) {
                        bArr2 = new byte[256];
                        System.arraycopy(byteArray, byteArray.length - 256, bArr2, 0, 256);
                    } else {
                        if (byteArray.length < 256) {
                            bArr2 = new byte[256];
                            System.arraycopy(byteArray, 0, bArr2, 256 - byteArray.length, byteArray.length);
                            for (int i11 = 0; i11 < 256 - byteArray.length; i11++) {
                                bArr2[i11] = 0;
                            }
                        }
                        byte[] n10 = Utilities.n(byteArray);
                        bArr3 = new byte[8];
                        System.arraycopy(n10, n10.length - 8, bArr3, 0, 8);
                        if (encryptedChat.key_fingerprint != Utilities.g(bArr3)) {
                            encryptedChat.auth_key = byteArray;
                            encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                            encryptedChat.seq_in = -2;
                            encryptedChat.seq_out = 1;
                            getMessagesStorage().V1(encryptedChat);
                            getMessagesController().R3(encryptedChat, false);
                            int i12 = encryptedChat.id;
                            SparseArray sparseArray2 = this.c;
                            ArrayList arrayList = (ArrayList) sparseArray2.get(i12);
                            if (arrayList != null) {
                                getMessagesController().K3(arrayList, null, null, false, 0);
                                sparseArray2.remove(encryptedChat.id);
                            }
                            i0.g3(new hw(this, encryptedChat, 1));
                        } else {
                            TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
                            tL_encryptedChatDiscarded.id = encryptedChat.id;
                            tL_encryptedChatDiscarded.user_id = encryptedChat.user_id;
                            tL_encryptedChatDiscarded.auth_key = encryptedChat.auth_key;
                            tL_encryptedChatDiscarded.key_create_date = encryptedChat.key_create_date;
                            tL_encryptedChatDiscarded.key_use_count_in = encryptedChat.key_use_count_in;
                            tL_encryptedChatDiscarded.key_use_count_out = encryptedChat.key_use_count_out;
                            tL_encryptedChatDiscarded.seq_in = encryptedChat.seq_in;
                            tL_encryptedChatDiscarded.seq_out = encryptedChat.seq_out;
                            tL_encryptedChatDiscarded.admin_id = encryptedChat.admin_id;
                            tL_encryptedChatDiscarded.mtproto_seq = encryptedChat.mtproto_seq;
                            getMessagesStorage().V1(tL_encryptedChatDiscarded);
                            i0.g3(new jw(this, tL_encryptedChatDiscarded, 0));
                            f(encryptedChat.id, false);
                        }
                    }
                    byteArray = bArr2;
                    byte[] n102 = Utilities.n(byteArray);
                    bArr3 = new byte[8];
                    System.arraycopy(n102, n102.length - 8, bArr3, 0, 8);
                    if (encryptedChat.key_fingerprint != Utilities.g(bArr3)) {
                    }
                } else {
                    f(encryptedChat.id, false);
                }
            } else if (a12 == null && this.n) {
                this.f.add(tL_updateEncryption);
            }
        }
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) && encryptedChat.history_deleted) {
            i0.g3(new iw(this, j10, 3));
        }
    }

    public final void o(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = new byte[256];
        Utilities.b.nextBytes(bArr);
        getMessagesStorage().H();
        BigInteger valueOf = BigInteger.valueOf(r2.D);
        BigInteger bigInteger = new BigInteger(1, bArr);
        hs messagesStorage = getMessagesStorage();
        messagesStorage.H();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage.y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        getSendMessagesHelper().getClass();
        encryptedChat.exchange_id = qz.E();
        encryptedChat.a_or_b = bArr;
        encryptedChat.g_a = byteArray;
        getMessagesStorage().V1(encryptedChat);
        x(encryptedChat, null);
    }

    public final void p(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j10) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
                tL_decryptedMessageActionAbortKey.exchange_id = j10;
                message = d(encryptedChat, tL_decryptedMessageActionAbortKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void q(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionAcceptKey tL_decryptedMessageActionAcceptKey = new TLRPC.TL_decryptedMessageActionAcceptKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionAcceptKey;
                tL_decryptedMessageActionAcceptKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionAcceptKey.key_fingerprint = encryptedChat.future_key_fingerprint;
                tL_decryptedMessageActionAcceptKey.g_b = encryptedChat.g_a_or_b;
                message = d(encryptedChat, tL_decryptedMessageActionAcceptKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void r(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionFlushHistory tL_decryptedMessageActionFlushHistory = new TLRPC.TL_decryptedMessageActionFlushHistory();
                tL_decryptedMessageService.action = tL_decryptedMessageActionFlushHistory;
                message = d(encryptedChat, tL_decryptedMessageActionFlushHistory);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void s(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionCommitKey tL_decryptedMessageActionCommitKey = new TLRPC.TL_decryptedMessageActionCommitKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionCommitKey;
                tL_decryptedMessageActionCommitKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionCommitKey.key_fingerprint = encryptedChat.future_key_fingerprint;
                message = d(encryptedChat, tL_decryptedMessageActionCommitKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void t(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionDeleteMessages tL_decryptedMessageActionDeleteMessages = new TLRPC.TL_decryptedMessageActionDeleteMessages();
                tL_decryptedMessageService.action = tL_decryptedMessageActionDeleteMessages;
                tL_decryptedMessageActionDeleteMessages.random_ids = arrayList;
                message = d(encryptedChat, tL_decryptedMessageActionDeleteMessages);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void u(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionReadMessages tL_decryptedMessageActionReadMessages = new TLRPC.TL_decryptedMessageActionReadMessages();
                tL_decryptedMessageService.action = tL_decryptedMessageActionReadMessages;
                tL_decryptedMessageActionReadMessages.random_ids = arrayList;
                message = d(encryptedChat, tL_decryptedMessageActionReadMessages);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void v(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionNoop tL_decryptedMessageActionNoop = new TLRPC.TL_decryptedMessageActionNoop();
                tL_decryptedMessageService.action = tL_decryptedMessageActionNoop;
                message = d(encryptedChat, tL_decryptedMessageActionNoop);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void w(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            Integer valueOf = Integer.valueOf(encryptedChat.id);
            ArrayList arrayList = this.a;
            if (arrayList.contains(valueOf)) {
                return;
            }
            arrayList.add(Integer.valueOf(encryptedChat.id));
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionNotifyLayer tL_decryptedMessageActionNotifyLayer = new TLRPC.TL_decryptedMessageActionNotifyLayer();
                tL_decryptedMessageService.action = tL_decryptedMessageActionNotifyLayer;
                tL_decryptedMessageActionNotifyLayer.layer = zs.h2;
                message = d(encryptedChat, tL_decryptedMessageActionNotifyLayer);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void x(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionRequestKey tL_decryptedMessageActionRequestKey = new TLRPC.TL_decryptedMessageActionRequestKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionRequestKey;
                tL_decryptedMessageActionRequestKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionRequestKey.g_a = encryptedChat.g_a;
                message = d(encryptedChat, tL_decryptedMessageActionRequestKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void y(TLRPC.EncryptedChat encryptedChat, int i10, int i11, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            int i12 = encryptedChat.id;
            SparseArray sparseArray = this.d;
            SparseIntArray sparseIntArray = (SparseIntArray) sparseArray.get(i12);
            if (sparseIntArray == null || sparseIntArray.indexOfKey(i10) < 0) {
                if (sparseIntArray == null) {
                    sparseIntArray = new SparseIntArray();
                    sparseArray.put(encryptedChat.id, sparseIntArray);
                }
                sparseIntArray.put(i10, i11);
                TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                if (message != null) {
                    tL_decryptedMessageService.action = message.action.encryptedAction;
                } else {
                    TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                    tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                    tL_decryptedMessageActionResend.start_seq_no = i10;
                    tL_decryptedMessageActionResend.end_seq_no = i11;
                    message = d(encryptedChat, tL_decryptedMessageActionResend);
                }
                TLRPC.Message message2 = message;
                tL_decryptedMessageService.random_id = message2.random_id;
                j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
            }
        }
    }

    public final void z(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionSetMessageTTL tL_decryptedMessageActionSetMessageTTL = new TLRPC.TL_decryptedMessageActionSetMessageTTL();
                tL_decryptedMessageService.action = tL_decryptedMessageActionSetMessageTTL;
                tL_decryptedMessageActionSetMessageTTL.ttl_seconds = encryptedChat.ttl;
                message = d(encryptedChat, tL_decryptedMessageActionSetMessageTTL);
                jj jjVar = new jj(this.currentAccount, message, false, false);
                jjVar.k.send_state = 1;
                jjVar.V1 = true;
                getMessagesController().i5(0, message.dialog_id, m5.j(jjVar));
                getNotificationCenter().k(zs.s, new Object[0]);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }
}

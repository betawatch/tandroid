// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ja7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ja7(dz7 dz7Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, ez7 ez7Var, TLRPC.TL_error tL_error, wm4 wm4Var) {
        this.a = (byte) 16;
        this.b = dz7Var;
        this.f = tLObject;
        this.h = str;
        this.c = tL_secureRequiredType;
        this.e = ez7Var;
        this.d = tL_error;
        this.n = wm4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        boolean z;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile;
        dw9 dw9Var = (dw9) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f;
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) this.h;
        TLRPC.Message message = (TLRPC.Message) this.c;
        TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.d;
        k47 k47Var = (k47) this.e;
        String str = (String) this.n;
        try {
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
            int i = encryptedChat.layer;
            Typeface typeface = gm.a;
            tL_decryptedMessageLayer.layer = Math.min(Math.max(46, i & 65535), Math.max(46, gm.W0(encryptedChat.layer)));
            tL_decryptedMessageLayer.message = decryptedMessage;
            byte[] bArr = new byte[15];
            tL_decryptedMessageLayer.random_bytes = bArr;
            SecureRandom secureRandom = Utilities.b;
            secureRandom.nextBytes(bArr);
            int i2 = encryptedChat.seq_in;
            if (i2 == 0) {
                try {
                    if (encryptedChat.seq_out == 0) {
                        if (encryptedChat.admin_id == dw9Var.getUserConfig().e()) {
                            encryptedChat.seq_out = 1;
                            i2 = -2;
                            encryptedChat.seq_in = -2;
                        } else {
                            i2 = -1;
                            encryptedChat.seq_in = -1;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    z = true;
                    fc4.g(e, z);
                    return;
                }
            }
            int i3 = message.seq_in;
            boolean z2 = false;
            if (i3 == 0 && message.seq_out == 0) {
                if (i2 <= 0) {
                    i2 += 2;
                }
                tL_decryptedMessageLayer.in_seq_no = i2;
                int i4 = encryptedChat.seq_out;
                tL_decryptedMessageLayer.out_seq_no = i4;
                encryptedChat.seq_out = i4 + 2;
                int i5 = encryptedChat.key_create_date;
                if (i5 == 0) {
                    i5 = dw9Var.getConnectionsManager().getCurrentTime();
                    encryptedChat.key_create_date = i5;
                }
                short s = (short) (encryptedChat.key_use_count_out + 1);
                encryptedChat.key_use_count_out = s;
                if ((s >= 100 || i5 < dw9Var.getConnectionsManager().getCurrentTime() - 604800) && encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0) {
                    dw9Var.o(encryptedChat);
                }
                cf7 messagesStorage = dw9Var.getMessagesStorage();
                messagesStorage.a.c(new yl6((Object) messagesStorage, (Object) encryptedChat, z2, (byte) 5));
                message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                cf7 messagesStorage2 = dw9Var.getMessagesStorage();
                messagesStorage2.a.c(new zl2(messagesStorage2, message.id, message.seq_in, message.seq_out, (byte) 1));
            } else {
                tL_decryptedMessageLayer.in_seq_no = i3;
                tL_decryptedMessageLayer.out_seq_no = message.seq_out;
            }
            if (e21.a) {
                fc4.b(decryptedMessage + " send message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
            }
            int objectSize = tL_decryptedMessageLayer.getObjectSize();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize + 4);
            nativeByteBuffer.writeInt32(objectSize);
            tL_decryptedMessageLayer.serializeToStream(nativeByteBuffer);
            int length = nativeByteBuffer.length();
            int nextInt = (length % 16 != 0 ? 16 - (length % 16) : 0) + ((secureRandom.nextInt(3) + 2) << 4);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length + nextInt);
            nativeByteBuffer.position(0);
            nativeByteBuffer2.writeBytes(nativeByteBuffer);
            if (nextInt != 0) {
                byte[] bArr2 = new byte[nextInt];
                secureRandom.nextBytes(bArr2);
                nativeByteBuffer2.writeBytes(bArr2);
            }
            byte[] bArr3 = new byte[16];
            boolean z3 = encryptedChat.admin_id != dw9Var.getUserConfig().e();
            byte[] bArr4 = encryptedChat.auth_key;
            int i6 = z3 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
            System.arraycopy(Utilities.p(bArr4, 88 + i6, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
            nativeByteBuffer.reuse();
            wm4 U = wm4.U(2, z3, encryptedChat.auth_key, bArr3);
            Utilities.c(nativeByteBuffer2.buffer, (byte[]) U.b, (byte[]) U.c, true, false, 0, nativeByteBuffer2.limit());
            NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(24 + nativeByteBuffer2.length());
            nativeByteBuffer2.position(0);
            nativeByteBuffer3.writeInt64(encryptedChat.key_fingerprint);
            nativeByteBuffer3.writeBytes(bArr3);
            nativeByteBuffer3.writeBytes(nativeByteBuffer2);
            nativeByteBuffer2.reuse();
            nativeByteBuffer3.position(0);
            if (inputEncryptedFile != null) {
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
            dw9Var.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new fo0(dw9Var, decryptedMessage, encryptedChat, message, k47Var, str), 64);
        } catch (Exception e2) {
            e = e2;
            z = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07fb  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        p pVar;
        p pVar2;
        g6b m;
        char c;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        byte b2 = 21;
        byte b3 = 7;
        byte b4 = 1;
        byte b5 = 0;
        Object obj = this.n;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.h;
        Object obj6 = this.f;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) obj7;
                Context context = (Context) obj5;
                he heVar = (he) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                ((xe7) obj6).run(0L);
                if (context != null && !((Activity) context).isFinishing()) {
                    try {
                        heVar.dismiss();
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    ik.c0(oc7Var.currentAccount, tL_error, dVar, tL_messages_migrateChat, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                oc7 oc7Var2 = (oc7) obj7;
                Activity activity = (Activity) obj5;
                he heVar2 = (he) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                d dVar2 = (d) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                oc7Var2.getClass();
                ((ue7) obj6).z(false);
                if (activity != null && !activity.isFinishing()) {
                    try {
                        heVar2.dismiss();
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                    ik.c0(oc7Var2.currentAccount, tL_error2, dVar2, tL_channels_convertToGigagroup, Boolean.FALSE);
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                to0 to0Var = (to0) obj6;
                TLObject tLObject = (TLObject) obj5;
                oc7 oc7Var3 = (oc7) obj7;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj4;
                d dVar3 = (d) obj2;
                to0 to0Var2 = (to0) obj;
                if (tL_error3 != null) {
                    to0Var.a(tL_error3);
                    break;
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        oc7Var3.d4(paymentForm.users, false);
                        pVar = new p(paymentForm, tL_inputInvoicePremiumGiftCode, dVar3);
                    } else {
                        pVar = tLObject instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (pVar != null) {
                        pVar.a1 = new o(to0Var2, to0Var, b2);
                        LaunchActivity.Q().showAsSheet(pVar, new bh0());
                        break;
                    } else {
                        to0Var.a(null);
                        break;
                    }
                }
            case 3:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                qac qacVar = (qac) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                oc7 oc7Var4 = (oc7) obj7;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj4;
                d dVar4 = (d) obj2;
                qac qacVar2 = (qac) obj;
                if (tL_error4 != null) {
                    qacVar.a(tL_error4);
                    break;
                } else {
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        oc7Var4.d4(paymentForm2.users, false);
                        pVar2 = new p(paymentForm2, tL_inputInvoicePremiumGiftCode2, dVar4);
                    } else {
                        pVar2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (pVar2 != null) {
                        pVar2.a1 = new o(qacVar2, qacVar, (byte) 22);
                        LaunchActivity.Q().showAsSheet(pVar2, new bh0());
                        break;
                    } else {
                        qacVar.a(null);
                        break;
                    }
                }
            case 4:
                qw0 qw0Var = (qw0) obj7;
                int[] iArr = (int[]) obj6;
                File file = (File) obj5;
                he heVar3 = (he) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (iArr[4] > 0) {
                    int i5 = iArr[1];
                    int i6 = iArr[2];
                    int Y0 = i5 > gm.Y0(false) ? gm.Y0(false) : i5;
                    int Y02 = i6 > gm.Y0(false) ? gm.Y0(false) : i6;
                    File w = g6b.w(z8c.t0, "jpg");
                    kn knVar = new kn(file, true, 0L, 0, null, null, null, 0L, z8c.t0, true, Y0, Y02, null, 0, true);
                    Bitmap p = knVar.p();
                    knVar.u();
                    if (p != null) {
                        c = 4;
                        try {
                        } catch (Exception e3) {
                            e = e3;
                        }
                        try {
                            p.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w));
                        } catch (Exception e4) {
                            e = e4;
                            fc4.g(e, true);
                            w = null;
                            m = g6b.o(file, w != null ? null : w.getAbsolutePath(), iArr[c]);
                            m.k0 = i5;
                            m.l0 = i6;
                            m.z();
                            if (m.k0 <= 0) {
                            }
                            heVar3.b(500L);
                            return;
                        }
                    } else {
                        c = 4;
                    }
                    m = g6b.o(file, w != null ? null : w.getAbsolutePath(), iArr[c]);
                    m.k0 = i5;
                    m.l0 = i6;
                    m.z();
                } else {
                    m = g6b.m(file, ((Integer) gm.L0(file).first).intValue());
                }
                if (m.k0 <= 0 && m.l0 > 0) {
                    if (str != null) {
                        m.C0 = str;
                    }
                    if (!TextUtils.isEmpty(str2) && z8c.h(qw0Var.N).p()) {
                        if (m.T0 == null) {
                            m.T0 = new ArrayList();
                        }
                        pcc pccVar = new pcc();
                        pccVar.a = (byte) 7;
                        pccVar.b = (byte) -1;
                        pccVar.l = -1;
                        c66 c66Var = new c66();
                        pccVar.a0 = c66Var;
                        c66Var.c = str2;
                        if (str3 != null) {
                            c66Var.a |= 2;
                            c66Var.b = str3;
                        }
                        m.T0.add(pccVar);
                    }
                    v9b.C(qw0Var.a0, z8c.t0).T(null, m);
                    heVar3.b(500L);
                    break;
                } else {
                    heVar3.b(500L);
                }
                break;
            case 5:
                yv1 yv1Var = (yv1) obj7;
                k47 k47Var = (k47) obj5;
                rc2 rc2Var = (rc2) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                vs9 vs9Var = (vs9) obj;
                ((bu5) obj6).q0 = true;
                if (!TextUtils.isEmpty(k47Var.z)) {
                    str4 = rc2Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(k47Var.v)) {
                    str4 = rc2Var.getMessageObject().v.toString();
                }
                String concat = str4.length() > 21 ? str4.substring(0, 21).concat("...") : str4;
                Activity parentActivity = yv1Var.getParentActivity();
                long j2 = tL_messageEntityFormattedDate.date * 1000;
                boolean z = (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true;
                Typeface typeface = gm.a;
                if (z) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j2);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    j2 = calendar.getTimeInMillis();
                    j = 86400000;
                } else {
                    j = 600000;
                }
                Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j2).putExtra("endTime", j + j2).putExtra("allDay", z);
                if (!TextUtils.isEmpty(concat)) {
                    putExtra.putExtra("title", concat);
                }
                if (!TextUtils.isEmpty(str4)) {
                    putExtra.putExtra("description", str4);
                }
                try {
                    parentActivity.startActivity(putExtra);
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                vs9Var.dismiss();
                break;
            case 6:
                yv1 yv1Var2 = (yv1) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj6;
                TLObject tLObject4 = (TLObject) obj5;
                sm1 sm1Var = (sm1) obj4;
                String str5 = (String) obj2;
                br1 br1Var = (br1) obj;
                boolean z2 = tL_error5 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error5.text);
                if (tLObject3 != null || (tL_error5 == null && (tLObject4 instanceof TLRPC.TL_boolTrue))) {
                    sm1Var.a(tLObject3, Boolean.valueOf(z2));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str5;
                    br1Var.b = new vm1(yv1Var2, yv1Var2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new rj1((Object) yv1Var2, (Object) br1Var, (Object) sm1Var, z2, (byte) 1)), b3);
                    br1Var.d();
                    break;
                }
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj6;
                HashSet hashSet = (HashSet) obj5;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                k47 k47Var2 = (k47) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                yv1 yv1Var3 = ((iv1) obj7).a;
                ((he) obj4).dismiss();
                if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    yv1Var3.getMessagesController().d4(groupcall.users, false);
                    yv1Var3.getMessagesController().X3(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        yv1Var3.showDialog(new c23(yv1Var3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = yv1Var3.getParentActivity();
                        i = ((d) yv1Var3).currentAccount;
                        sic.g(parentActivity2, i, tL_inputGroupCallInviteMessage, k47Var2.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error6 != null) {
                    if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error6.text)) {
                        yv1Var3.showDialog(new c23(yv1Var3.getParentActivity(), hashSet));
                        break;
                    } else {
                        c41.b0(yv1Var3).g0(tL_error6, false);
                        break;
                    }
                }
                break;
            case 8:
                w45 w45Var = (w45) obj7;
                y25 y25Var = (y25) obj6;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                String str6 = (String) obj4;
                byte[] bArr = (byte[]) obj3;
                r45 r45Var = (r45) obj2;
                u35 u35Var = (u35) obj;
                w45Var.getClass();
                try {
                    gm.c3(new lo0((Object) w45Var, (Object) r45Var, (Object) tonconnectsession, (Object) str6, (Object) bArr, (Object) w45.r(y25Var, tonconnectsession, str6, bArr, r45Var.a, r45Var.b, r45Var.d, null, w45Var.f.getCurrentTime()), (Object) u35Var, (Object) y25Var, (byte) 3));
                    break;
                } catch (Exception e5) {
                    gm.c3(new s35(u35Var, w45.h("prepare connect", e5), b5));
                    return;
                }
            case 9:
                w45 w45Var2 = (w45) obj7;
                r45 r45Var2 = (r45) obj6;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj5;
                t45 t45Var = (t45) obj2;
                byte[] bArr2 = t45Var.b;
                u35 u35Var2 = (u35) obj;
                if (w45Var2.c(r45Var2, tonconnectsession2, (String) obj4, (byte[]) obj3)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = t45Var.c;
                    tonconnectsubmitconnectresult.trace_id = r45Var2.c;
                    w45Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new kc(b5), new p((Object) w45Var2, (Object) t45Var, (Object) u35Var2, (byte) 20));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    u35Var2.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 10:
                w45 w45Var3 = (w45) obj7;
                y25 y25Var2 = (y25) obj6;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj5;
                String str7 = (String) obj4;
                byte[] bArr3 = (byte[]) obj3;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj2;
                u35 u35Var3 = (u35) obj;
                w45Var3.getClass();
                try {
                    gm.c3(new e77((Object) w45Var3, str7, (Object) bArr3, (Object) u35Var3, (Object) tonconnectsession3, (Object) w45.t(y25Var2, tonconnectsession3, str7, bArr3, tonconnectnexteventid.event_id), (byte) 10));
                    break;
                } catch (Exception e6) {
                    u35Var3.a(w45.h("prepare disconnect", e6));
                    return;
                }
            case 11:
                JSONObject jSONObject = (JSONObject) obj7;
                String str8 = (String) obj6;
                j55 j55Var = (j55) obj5;
                mk7 mk7Var = j55Var.a;
                h55 h55Var = j55Var.b;
                c cVar = (c) obj4;
                String str9 = (String) obj3;
                byte[] bArr4 = (byte[]) obj2;
                byte[] bArr5 = (byte[]) obj;
                if (jSONObject == null) {
                    c41.c0(str8);
                    j55Var.d = false;
                    if (!j55Var.f) {
                        j55Var.f = true;
                        h55Var.a();
                    }
                    if (!j55Var.e) {
                        mk7Var.dismiss();
                        break;
                    }
                } else {
                    TLRPC.TL_widgetQueryTypeSignData tL_widgetQueryTypeSignData = new TLRPC.TL_widgetQueryTypeSignData();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str9;
                    tL_userWallet.balance = cVar.z();
                    if (bArr5 != null) {
                        tL_userWallet.public_key = bArr4;
                        tL_userWallet.state_init = bArr5;
                    }
                    tL_widgetQueryTypeSignData.wallet = tL_userWallet;
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_widgetQueryTypeSignData.sign_data = tL_dataJSON;
                    tL_dataJSON.data = jSONObject.toString();
                    j55Var.d = false;
                    if (!j55Var.f) {
                        j55Var.f = true;
                        h55Var.d(tL_widgetQueryTypeSignData);
                    }
                    if (!j55Var.e) {
                        mk7Var.dismiss();
                        break;
                    }
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                String str10 = (String) obj6;
                Bundle bundle = (Bundle) obj5;
                TLObject tLObject6 = (TLObject) obj2;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj;
                String str11 = LaunchActivity.C1;
                ((he) obj4).dismiss();
                if (tL_error7 == null) {
                    mh6 mh6Var = new mh6();
                    mh6Var.H = str10;
                    mh6Var.I = bundle;
                    mh6Var.J = (TLRPC.TL_auth_sentCode) tLObject6;
                    mh6Var.G = (byte) 1;
                    launchActivity.t0(mh6Var);
                    break;
                } else {
                    ik.c0(launchActivity.P, tL_error7, launchActivity.N().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 13:
                wg6 wg6Var = (wg6) obj7;
                List<Purchase> list = (List) obj5;
                String str12 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                d65 d65Var = (d65) obj;
                if (((fj0) obj6).a == 0 && list != null && !list.isEmpty()) {
                    for (Purchase purchase : list) {
                        if (purchase.c().contains(str12)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON2;
                            tL_dataJSON2.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            wg6Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new fo0((Object) wg6Var, (Object) tL_inputStorePaymentAuthCode, (Object) purchase, (Object) tL_payments_canPurchaseStore, (Object) d65Var, (byte) 7), 74);
                            break;
                        }
                    }
                }
                d65Var.run();
                break;
            case 14:
                lh6 lh6Var = (lh6) obj7;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj6;
                Bundle bundle2 = (Bundle) obj5;
                String str13 = (String) obj4;
                in3 in3Var = (in3) obj2;
                TLObject tLObject8 = (TLObject) obj;
                mh6 mh6Var2 = lh6Var.h0;
                lh6Var.N = false;
                if (tL_error8 != null) {
                    String str14 = tL_error8.text;
                    if (str14 != null) {
                        if (str14.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i3 = ((d) mh6Var2).currentAccount;
                            ConnectionsManager.getInstance(i3).sendRequest(getpassword, new cx3(lh6Var, str13, (byte) 23), 10);
                        } else if (tL_error8.text.contains("PHONE_NUMBER_INVALID")) {
                            mh6.A1(mh6Var2, str13, in3Var, false);
                        } else if (tL_error8.text.contains("PHONE_PASSWORD_FLOOD")) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                        } else if (tL_error8.text.contains("PHONE_NUMBER_FLOOD")) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131747019, "PhoneNumberFlood"));
                        } else if (tL_error8.text.contains("PHONE_NUMBER_BANNED")) {
                            mh6.A1(mh6Var2, str13, in3Var, true);
                        } else if (tL_error8.text.contains("PHONE_CODE_EMPTY") || tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131748940, null));
                        } else if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                            mh6Var2.J1(0, true, null, true);
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                        } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                        } else if (tL_error8.code != -1000) {
                            i2 = ((d) mh6Var2).currentAccount;
                            ik.c0(i2, tL_error8, mh6Var2, tLObject8, (String) in3Var.c);
                        }
                    }
                } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject7).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            mh6Var2.s0 = tL_help_termsOfService;
                        }
                        mh6Var2.J1(5, true, bundle2, false);
                    } else {
                        mh6Var2.C1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    mh6Var2.q1(bundle2, (TLRPC.auth_SentCode) tLObject7, true);
                }
                if (!mh6Var2.r0) {
                    mh6Var2.y1(false, true);
                    break;
                }
                break;
            case 15:
                hs6 hs6Var = (hs6) obj7;
                hs6Var.getMessagesController().d4((ArrayList) obj6, true);
                hs6Var.getMessagesController().X3((ArrayList) obj5, true);
                hs6Var.o1 = false;
                hs6Var.n1 = true;
                hs6Var.j1 = (ArrayList) obj4;
                hs6Var.k1 = (ArrayList) obj3;
                hs6Var.l1 = (ArrayList) obj2;
                hs6Var.m1 = (ArrayList) obj;
                hs6Var.o();
                hs6Var.getNotificationCenter().k(82, new Object[0]);
                hs6Var.getNotificationCenter().k(83, new Object[0]);
                hs6Var.getNotificationCenter().k(84, new Object[0]);
                hs6Var.getNotificationCenter().k(85, new Object[0]);
                if (Math.abs(hs6Var.getUserConfig().s - ((int) (System.currentTimeMillis() / 1000))) < 86400) {
                    boolean z3 = e21.a;
                    break;
                } else {
                    hs6Var.O0(false);
                    break;
                }
            case 16:
                TLObject tLObject9 = (TLObject) obj6;
                String str15 = (String) obj5;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                ez7 ez7Var = (ez7) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                wm4 wm4Var = (wm4) obj;
                xz7 xz7Var = ((dz7) obj7).p.d;
                if (tLObject9 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject9;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str15);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    xz7 xz7Var2 = new xz7(6, xz7Var.E, xz7Var.K, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i4 = ((d) xz7Var).currentAccount;
                    ((d) xz7Var2).currentAccount = i4;
                    xz7Var2.U0 = sentemailcode.length;
                    xz7Var2.f1 = xz7Var.f1;
                    xz7Var2.d1 = xz7Var.d1;
                    xz7Var2.C1 = ez7Var;
                    xz7Var.presentFragment(xz7Var2, true);
                    break;
                } else {
                    xz7Var.P1(jb6.M0(2131747308, null), tL_error9.text);
                    if (wm4Var != null) {
                        wm4Var.b0(tL_error9.text, str15);
                        break;
                    }
                }
                break;
            case 17:
                a();
                break;
            case 18:
                ((boolean[]) obj6)[0] = true;
                ((jva) obj7).Y((String) obj5, (TLRPC.ChatInvite) obj4, new mta((boolean[]) obj3, (jac) obj2, (qac) obj));
                break;
            case 19:
                jva jvaVar = (jva) obj7;
                List list2 = (List) obj6;
                fv4 fv4Var = (fv4) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                fj0 fj0Var = (fj0) obj2;
                Activity activity2 = (Activity) obj;
                if (list2.isEmpty()) {
                    gm.c3(new xta(fv4Var, b5));
                    break;
                } else {
                    ln8 ln8Var = (ln8) list2.get(0);
                    in8 a = ln8Var.a();
                    if (a == null) {
                        gm.c3(new xta(fv4Var, b4));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(jvaVar.a).sendRequest(tL_payments_canPurchaseStore2, new ko0(ln8Var, fj0Var, (jac) fv4Var, activity2, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list2, (byte) 4));
                        break;
                    }
                }
            case 20:
                jva jvaVar2 = (jva) obj7;
                TLObject tLObject10 = (TLObject) obj6;
                k47 k47Var3 = (k47) obj5;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj4;
                qac qacVar3 = (qac) obj2;
                c41 c41Var = (c41) obj;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    jvaVar2.X(k47Var3, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject10, qacVar3);
                    break;
                } else {
                    qacVar3.a(Boolean.FALSE);
                    c41Var.Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, tL_error10 != null ? tL_error10.text : "FAILED_GETTING_FORM")).j();
                    break;
                }
            case 21:
                eya eyaVar = (eya) obj7;
                d96[] d96VarArr = (d96[]) obj6;
                int[] iArr2 = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                l39 l39Var = (l39) obj2;
                i39 i39Var = (i39) obj;
                if (eyaVar.n1) {
                    d96 d96Var = d96VarArr[0];
                    if (d96Var == null) {
                        d96Var = eyaVar.J1.c(eyaVar.K1);
                        d96VarArr[0] = d96Var;
                    }
                    if (d96Var != null) {
                        d96Var.setDrawStar(false);
                        d96Var.getLocationInWindow(iArr2);
                        TextView textView = d96Var.F;
                        pn2[] pn2VarArr = d96Var.H;
                        if (pn2VarArr[0] != null && textView.getLayout() != null) {
                            float x = textView.getX() + textView.getPaddingLeft() + pn2VarArr[0].r;
                            float y = textView.getY() + textView.getPaddingTop() + pn2VarArr[0].s;
                            rectF.set(x, y, r1.c.getBounds().width() + x, pn2VarArr[0].c.getBounds().height() + y);
                        }
                        rectF.offset(iArr2[0], iArr2[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr2);
                    rectF.set(gm.L(4.0f) + iArr2[0] + l39Var.b + i39Var.w, ((i39Var.A - gm.L(22.0f)) / 2.0f) + iArr2[1] + l39Var.c + i39Var.x, gm.L(26.0f) + iArr2[0] + l39Var.b + i39Var.w, ((gm.L(22.0f) + i39Var.A) / 2.0f) + iArr2[1] + l39Var.c + i39Var.x);
                    break;
                }
                break;
            default:
                b3c b3cVar = (b3c) obj7;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj6;
                b3cVar.getClass();
                storyItem.translatedLng = (String) obj5;
                storyItem.translatedText = s1c.L0((TLRPC.TL_textWithEntities) obj4, (TLRPC.TL_textWithEntities) obj3);
                b3cVar.getMessagesController().N1().k.h(storyItem.dialogId, storyItem);
                b3cVar.K.remove((z2c) obj2);
                ((fu) obj).run();
                break;
        }
    }

    public /* synthetic */ ja7(jm7 jm7Var, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = jm7Var;
        this.d = tL_error;
        this.f = tLObject;
        this.h = obj;
        this.c = obj2;
        this.e = obj3;
        this.n = obj4;
    }

    public /* synthetic */ ja7(iv1 iv1Var, he heVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, k47 k47Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.b = iv1Var;
        this.c = heVar;
        this.f = tLObject;
        this.h = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.n = k47Var;
        this.d = tL_error;
    }

    public /* synthetic */ ja7(jva jvaVar, TLObject tLObject, k47 k47Var, TLRPC.InputInvoice inputInvoice, qac qacVar, c41 c41Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 20;
        this.b = jvaVar;
        this.f = tLObject;
        this.h = k47Var;
        this.c = inputInvoice;
        this.e = qacVar;
        this.n = c41Var;
        this.d = tL_error;
    }

    public /* synthetic */ ja7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.h = obj3;
        this.c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.n = obj7;
    }

    public /* synthetic */ ja7(TLRPC.TL_error tL_error, qac qacVar, TLObject tLObject, oc7 oc7Var, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, d dVar, qac qacVar2, byte b) {
        this.a = b;
        this.d = tL_error;
        this.f = qacVar;
        this.h = tLObject;
        this.b = oc7Var;
        this.c = tL_inputInvoicePremiumGiftCode;
        this.e = dVar;
        this.n = qacVar2;
    }

    public /* synthetic */ ja7(LaunchActivity launchActivity, he heVar, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = (byte) 12;
        this.b = launchActivity;
        this.c = heVar;
        this.d = tL_error;
        this.f = str;
        this.h = bundle;
        this.e = tLObject;
        this.n = sendconfirmphonecode;
    }
}

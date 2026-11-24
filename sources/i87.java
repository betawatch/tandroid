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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class i87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ i87(ax7 ax7Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, bx7 bx7Var, TLRPC.TL_error tL_error, wk4 wk4Var) {
        this.a = (byte) 16;
        this.b = ax7Var;
        this.f = tLObject;
        this.h = str;
        this.c = tL_secureRequiredType;
        this.e = bx7Var;
        this.d = tL_error;
        this.n = wk4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        boolean z;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile;
        bu9 bu9Var = (bu9) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f;
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) this.h;
        TLRPC.Message message = (TLRPC.Message) this.c;
        TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.d;
        k27 k27Var = (k27) this.e;
        String str = (String) this.n;
        try {
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
            int i = encryptedChat.layer;
            Typeface typeface = gl.a;
            tL_decryptedMessageLayer.layer = Math.min(Math.max(46, i & 65535), Math.max(46, gl.W0(encryptedChat.layer)));
            tL_decryptedMessageLayer.message = decryptedMessage;
            byte[] bArr = new byte[15];
            tL_decryptedMessageLayer.random_bytes = bArr;
            SecureRandom secureRandom = Utilities.b;
            secureRandom.nextBytes(bArr);
            int i2 = encryptedChat.seq_in;
            if (i2 == 0) {
                try {
                    if (encryptedChat.seq_out == 0) {
                        if (encryptedChat.admin_id == bu9Var.getUserConfig().e()) {
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
                    fa4.g(e, z);
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
                    i5 = bu9Var.getConnectionsManager().getCurrentTime();
                    encryptedChat.key_create_date = i5;
                }
                short s = (short) (encryptedChat.key_use_count_out + 1);
                encryptedChat.key_use_count_out = s;
                if ((s >= 100 || i5 < bu9Var.getConnectionsManager().getCurrentTime() - 604800) && encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0) {
                    bu9Var.o(encryptedChat);
                }
                ad7 messagesStorage = bu9Var.getMessagesStorage();
                messagesStorage.a.c(new vj6((Object) messagesStorage, (Object) encryptedChat, z2, (byte) 5));
                message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                ad7 messagesStorage2 = bu9Var.getMessagesStorage();
                messagesStorage2.a.c(new nk2(messagesStorage2, message.id, message.seq_in, message.seq_out, (byte) 1));
            } else {
                tL_decryptedMessageLayer.in_seq_no = i3;
                tL_decryptedMessageLayer.out_seq_no = message.seq_out;
            }
            if (w01.a) {
                fa4.b(decryptedMessage + " send message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
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
            boolean z3 = encryptedChat.admin_id != bu9Var.getUserConfig().e();
            byte[] bArr4 = encryptedChat.auth_key;
            int i6 = z3 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
            System.arraycopy(Utilities.p(bArr4, 88 + i6, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
            nativeByteBuffer.reuse();
            wk4 W = wk4.W(2, z3, encryptedChat.auth_key, bArr3);
            Utilities.c(nativeByteBuffer2.buffer, (byte[]) W.b, (byte[]) W.c, true, false, 0, nativeByteBuffer2.limit());
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
            bu9Var.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new fn0(bu9Var, decryptedMessage, encryptedChat, message, k27Var, str), 64);
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
        f4b m;
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
                na7 na7Var = (na7) obj7;
                Context context = (Context) obj5;
                hd hdVar = (hd) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                ((vc7) obj6).run(0L);
                if (context != null && !((Activity) context).isFinishing()) {
                    try {
                        hdVar.dismiss();
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    ij.c0(na7Var.currentAccount, tL_error, dVar, tL_messages_migrateChat, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                na7 na7Var2 = (na7) obj7;
                Activity activity = (Activity) obj5;
                hd hdVar2 = (hd) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                d dVar2 = (d) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                na7Var2.getClass();
                ((sc7) obj6).k(false);
                if (activity != null && !activity.isFinishing()) {
                    try {
                        hdVar2.dismiss();
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                    ij.c0(na7Var2.currentAccount, tL_error2, dVar2, tL_channels_convertToGigagroup, Boolean.FALSE);
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                tn0 tn0Var = (tn0) obj6;
                TLObject tLObject = (TLObject) obj5;
                na7 na7Var3 = (na7) obj7;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj4;
                d dVar3 = (d) obj2;
                tn0 tn0Var2 = (tn0) obj;
                if (tL_error3 != null) {
                    tn0Var.a(tL_error3);
                    break;
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        na7Var3.b4(paymentForm.users, false);
                        pVar = new p(paymentForm, tL_inputInvoicePremiumGiftCode, dVar3);
                    } else {
                        pVar = tLObject instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (pVar != null) {
                        pVar.a1 = new o(tn0Var2, tn0Var, b2);
                        LaunchActivity.Q().showAsSheet(pVar, new ag0());
                        break;
                    } else {
                        tn0Var.a(null);
                        break;
                    }
                }
            case 3:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                p8c p8cVar = (p8c) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                na7 na7Var4 = (na7) obj7;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj4;
                d dVar4 = (d) obj2;
                p8c p8cVar2 = (p8c) obj;
                if (tL_error4 != null) {
                    p8cVar.a(tL_error4);
                    break;
                } else {
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        na7Var4.b4(paymentForm2.users, false);
                        pVar2 = new p(paymentForm2, tL_inputInvoicePremiumGiftCode2, dVar4);
                    } else {
                        pVar2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (pVar2 != null) {
                        pVar2.a1 = new o(p8cVar2, p8cVar, (byte) 22);
                        LaunchActivity.Q().showAsSheet(pVar2, new ag0());
                        break;
                    } else {
                        p8cVar.a(null);
                        break;
                    }
                }
            case 4:
                hv0 hv0Var = (hv0) obj7;
                int[] iArr = (int[]) obj6;
                File file = (File) obj5;
                hd hdVar3 = (hd) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (iArr[4] > 0) {
                    int i5 = iArr[1];
                    int i6 = iArr[2];
                    int Y0 = i5 > gl.Y0(false) ? gl.Y0(false) : i5;
                    int Y02 = i6 > gl.Y0(false) ? gl.Y0(false) : i6;
                    File w = f4b.w(y6c.t0, "jpg");
                    km kmVar = new km(file, true, 0L, 0, null, null, null, 0L, y6c.t0, true, Y0, Y02, null, 0, true);
                    Bitmap p = kmVar.p();
                    kmVar.u();
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
                            fa4.g(e, true);
                            w = null;
                            m = f4b.o(file, w != null ? null : w.getAbsolutePath(), iArr[c]);
                            m.k0 = i5;
                            m.l0 = i6;
                            m.z();
                            if (m.k0 <= 0) {
                            }
                            hdVar3.b(500L);
                            return;
                        }
                    } else {
                        c = 4;
                    }
                    m = f4b.o(file, w != null ? null : w.getAbsolutePath(), iArr[c]);
                    m.k0 = i5;
                    m.l0 = i6;
                    m.z();
                } else {
                    m = f4b.m(file, ((Integer) gl.L0(file).first).intValue());
                }
                if (m.k0 <= 0 && m.l0 > 0) {
                    if (str != null) {
                        m.C0 = str;
                    }
                    if (!TextUtils.isEmpty(str2) && y6c.h(hv0Var.N).p()) {
                        if (m.T0 == null) {
                            m.T0 = new ArrayList();
                        }
                        mac macVar = new mac();
                        macVar.a = (byte) 7;
                        macVar.b = (byte) -1;
                        macVar.l = -1;
                        c46 c46Var = new c46();
                        macVar.a0 = c46Var;
                        c46Var.c = str2;
                        if (str3 != null) {
                            c46Var.a |= 2;
                            c46Var.b = str3;
                        }
                        m.T0.add(macVar);
                    }
                    t7b.C(hv0Var.a0, y6c.t0).T(null, m);
                    hdVar3.b(500L);
                    break;
                } else {
                    hdVar3.b(500L);
                }
                break;
            case 5:
                mu1 mu1Var = (mu1) obj7;
                k27 k27Var = (k27) obj5;
                gb2 gb2Var = (gb2) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                tq9 tq9Var = (tq9) obj;
                ((cs5) obj6).q0 = true;
                if (!TextUtils.isEmpty(k27Var.z)) {
                    str4 = gb2Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(k27Var.v)) {
                    str4 = gb2Var.getMessageObject().v.toString();
                }
                String concat = str4.length() > 21 ? str4.substring(0, 21).concat("...") : str4;
                Activity parentActivity = mu1Var.getParentActivity();
                long j2 = tL_messageEntityFormattedDate.date * 1000;
                boolean z = (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true;
                Typeface typeface = gl.a;
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
                    fa4.g(th, true);
                }
                tq9Var.dismiss();
                break;
            case 6:
                mu1 mu1Var2 = (mu1) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj6;
                TLObject tLObject4 = (TLObject) obj5;
                jl1 jl1Var = (jl1) obj4;
                String str5 = (String) obj2;
                op1 op1Var = (op1) obj;
                boolean z2 = tL_error5 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error5.text);
                if (tLObject3 != null || (tL_error5 == null && (tLObject4 instanceof TLRPC.TL_boolTrue))) {
                    jl1Var.a(tLObject3, Boolean.valueOf(z2));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str5;
                    op1Var.b = new ml1(mu1Var2, mu1Var2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new ji1((Object) mu1Var2, (Object) op1Var, (Object) jl1Var, z2, (byte) 1)), b3);
                    op1Var.d();
                    break;
                }
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj6;
                HashSet hashSet = (HashSet) obj5;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                k27 k27Var2 = (k27) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                mu1 mu1Var3 = ((wt1) obj7).a;
                ((hd) obj4).dismiss();
                if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    mu1Var3.getMessagesController().b4(groupcall.users, false);
                    mu1Var3.getMessagesController().V3(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        mu1Var3.showDialog(new q03(mu1Var3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = mu1Var3.getParentActivity();
                        i = ((d) mu1Var3).currentAccount;
                        rgc.g(parentActivity2, i, tL_inputGroupCallInviteMessage, k27Var2.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error6 != null) {
                    if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error6.text)) {
                        mu1Var3.showDialog(new q03(mu1Var3.getParentActivity(), hashSet));
                        break;
                    } else {
                        u21.b0(mu1Var3).g0(tL_error6, false);
                        break;
                    }
                }
                break;
            case 8:
                w25 w25Var = (w25) obj7;
                y05 y05Var = (y05) obj6;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                String str6 = (String) obj4;
                byte[] bArr = (byte[]) obj3;
                r25 r25Var = (r25) obj2;
                x15 x15Var = (x15) obj;
                w25Var.getClass();
                try {
                    gl.c3(new ln0((Object) w25Var, (Object) r25Var, (Object) tonconnectsession, (Object) str6, (Object) bArr, (Object) w25.r(y05Var, tonconnectsession, str6, bArr, r25Var.a, r25Var.b, r25Var.d, null, w25Var.f.getCurrentTime()), (Object) x15Var, (Object) y05Var, (byte) 3));
                    break;
                } catch (Exception e5) {
                    gl.c3(new s15(x15Var, w25.h("prepare connect", e5), b5));
                    return;
                }
            case 9:
                w25 w25Var2 = (w25) obj7;
                r25 r25Var2 = (r25) obj6;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj5;
                t25 t25Var = (t25) obj2;
                byte[] bArr2 = t25Var.b;
                x15 x15Var2 = (x15) obj;
                if (w25Var2.c(r25Var2, tonconnectsession2, (String) obj4, (byte[]) obj3)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = t25Var.c;
                    tonconnectsubmitconnectresult.trace_id = r25Var2.c;
                    w25Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new hc(b5), new p((Object) w25Var2, (Object) t25Var, (Object) x15Var2, (byte) 20));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    x15Var2.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 10:
                w25 w25Var3 = (w25) obj7;
                y05 y05Var2 = (y05) obj6;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj5;
                String str7 = (String) obj4;
                byte[] bArr3 = (byte[]) obj3;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj2;
                x15 x15Var3 = (x15) obj;
                w25Var3.getClass();
                try {
                    gl.c3(new e57((Object) w25Var3, str7, (Object) bArr3, (Object) x15Var3, (Object) tonconnectsession3, (Object) w25.t(y05Var2, tonconnectsession3, str7, bArr3, tonconnectnexteventid.event_id), (byte) 10));
                    break;
                } catch (Exception e6) {
                    x15Var3.a(w25.h("prepare disconnect", e6));
                    return;
                }
            case 11:
                JSONObject jSONObject = (JSONObject) obj7;
                String str8 = (String) obj6;
                j35 j35Var = (j35) obj5;
                ki7 ki7Var = j35Var.a;
                h35 h35Var = j35Var.b;
                c cVar = (c) obj4;
                String str9 = (String) obj3;
                byte[] bArr4 = (byte[]) obj2;
                byte[] bArr5 = (byte[]) obj;
                if (jSONObject == null) {
                    u21.c0(str8);
                    j35Var.d = false;
                    if (!j35Var.f) {
                        j35Var.f = true;
                        h35Var.a();
                    }
                    if (!j35Var.e) {
                        ki7Var.dismiss();
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
                    j35Var.d = false;
                    if (!j35Var.f) {
                        j35Var.f = true;
                        h35Var.d(tL_widgetQueryTypeSignData);
                    }
                    if (!j35Var.e) {
                        ki7Var.dismiss();
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
                ((hd) obj4).dismiss();
                if (tL_error7 == null) {
                    mf6 mf6Var = new mf6();
                    mf6Var.H = str10;
                    mf6Var.I = bundle;
                    mf6Var.J = (TLRPC.TL_auth_sentCode) tLObject6;
                    mf6Var.G = (byte) 1;
                    launchActivity.t0(mf6Var);
                    break;
                } else {
                    ij.c0(launchActivity.P, tL_error7, launchActivity.N().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 13:
                ve6 ve6Var = (ve6) obj7;
                List<Purchase> list = (List) obj5;
                String str12 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                e45 e45Var = (e45) obj;
                if (((fi0) obj6).a == 0 && list != null && !list.isEmpty()) {
                    for (Purchase purchase : list) {
                        if (purchase.c().contains(str12)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON2;
                            tL_dataJSON2.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            ve6Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new fn0((Object) ve6Var, (Object) tL_inputStorePaymentAuthCode, (Object) purchase, (Object) tL_payments_canPurchaseStore, (Object) e45Var, (byte) 7), 74);
                            break;
                        }
                    }
                }
                e45Var.run();
                break;
            case 14:
                lf6 lf6Var = (lf6) obj7;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj6;
                Bundle bundle2 = (Bundle) obj5;
                String str13 = (String) obj4;
                xl3 xl3Var = (xl3) obj2;
                TLObject tLObject8 = (TLObject) obj;
                mf6 mf6Var2 = lf6Var.h0;
                lf6Var.N = false;
                if (tL_error8 != null) {
                    String str14 = tL_error8.text;
                    if (str14 != null) {
                        if (str14.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i3 = ((d) mf6Var2).currentAccount;
                            ConnectionsManager.getInstance(i3).sendRequest(getpassword, new rv3(lf6Var, str13, (byte) 23), 10);
                        } else if (tL_error8.text.contains("PHONE_NUMBER_INVALID")) {
                            mf6.z1(mf6Var2, str13, xl3Var, false);
                        } else if (tL_error8.text.contains("PHONE_PASSWORD_FLOOD")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                        } else if (tL_error8.text.contains("PHONE_NUMBER_FLOOD")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131747093, "PhoneNumberFlood"));
                        } else if (tL_error8.text.contains("PHONE_NUMBER_BANNED")) {
                            mf6.z1(mf6Var2, str13, xl3Var, true);
                        } else if (tL_error8.text.contains("PHONE_CODE_EMPTY") || tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131748991, null));
                        } else if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                            mf6Var2.I1(0, true, null, true);
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                        } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                        } else if (tL_error8.code != -1000) {
                            i2 = ((d) mf6Var2).currentAccount;
                            ij.c0(i2, tL_error8, mf6Var2, tLObject8, (String) xl3Var.c);
                        }
                    }
                } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject7).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            mf6Var2.s0 = tL_help_termsOfService;
                        }
                        mf6Var2.I1(5, true, bundle2, false);
                    } else {
                        mf6Var2.B1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    mf6Var2.p1(bundle2, (TLRPC.auth_SentCode) tLObject7, true);
                }
                if (!mf6Var2.r0) {
                    mf6Var2.x1(false, true);
                    break;
                }
                break;
            case 15:
                hq6 hq6Var = (hq6) obj7;
                hq6Var.getMessagesController().b4((ArrayList) obj6, true);
                hq6Var.getMessagesController().V3((ArrayList) obj5, true);
                hq6Var.o1 = false;
                hq6Var.n1 = true;
                hq6Var.j1 = (ArrayList) obj4;
                hq6Var.k1 = (ArrayList) obj3;
                hq6Var.l1 = (ArrayList) obj2;
                hq6Var.m1 = (ArrayList) obj;
                hq6Var.o();
                hq6Var.getNotificationCenter().k(81, new Object[0]);
                hq6Var.getNotificationCenter().k(82, new Object[0]);
                hq6Var.getNotificationCenter().k(83, new Object[0]);
                hq6Var.getNotificationCenter().k(84, new Object[0]);
                if (Math.abs(hq6Var.getUserConfig().s - ((int) (System.currentTimeMillis() / 1000))) < 86400) {
                    boolean z3 = w01.a;
                    break;
                } else {
                    hq6Var.O0(false);
                    break;
                }
            case 16:
                TLObject tLObject9 = (TLObject) obj6;
                String str15 = (String) obj5;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                bx7 bx7Var = (bx7) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                wk4 wk4Var = (wk4) obj;
                vx7 vx7Var = ((ax7) obj7).p.d;
                if (tLObject9 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject9;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str15);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    vx7 vx7Var2 = new vx7(6, vx7Var.E, vx7Var.K, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i4 = ((d) vx7Var).currentAccount;
                    ((d) vx7Var2).currentAccount = i4;
                    vx7Var2.U0 = sentemailcode.length;
                    vx7Var2.f1 = vx7Var.f1;
                    vx7Var2.d1 = vx7Var.d1;
                    vx7Var2.C1 = bx7Var;
                    vx7Var.presentFragment(vx7Var2, true);
                    break;
                } else {
                    vx7Var.O1(k96.M0(2131747382, null), tL_error9.text);
                    if (wk4Var != null) {
                        wk4Var.a0(tL_error9.text, str15);
                        break;
                    }
                }
                break;
            case 17:
                a();
                break;
            case 18:
                ((boolean[]) obj6)[0] = true;
                ((gta) obj7).Y((String) obj5, (TLRPC.ChatInvite) obj4, new lra((boolean[]) obj3, (i8c) obj2, (p8c) obj));
                break;
            case 19:
                gta gtaVar = (gta) obj7;
                List list2 = (List) obj6;
                et4 et4Var = (et4) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                fi0 fi0Var = (fi0) obj2;
                Activity activity2 = (Activity) obj;
                if (list2.isEmpty()) {
                    gl.c3(new vra(et4Var, b5));
                    break;
                } else {
                    kl8 kl8Var = (kl8) list2.get(0);
                    gl8 a = kl8Var.a();
                    if (a == null) {
                        gl.c3(new vra(et4Var, b4));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(gtaVar.a).sendRequest(tL_payments_canPurchaseStore2, new kn0(kl8Var, fi0Var, (i8c) et4Var, activity2, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list2, (byte) 4));
                        break;
                    }
                }
            case 20:
                gta gtaVar2 = (gta) obj7;
                TLObject tLObject10 = (TLObject) obj6;
                k27 k27Var3 = (k27) obj5;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj4;
                p8c p8cVar3 = (p8c) obj2;
                u21 u21Var = (u21) obj;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    gtaVar2.X(k27Var3, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject10, p8cVar3);
                    break;
                } else {
                    p8cVar3.a(Boolean.FALSE);
                    u21Var.Q(R.raw.error, 36, k96.a0(null, null, 2131743639, tL_error10 != null ? tL_error10.text : "FAILED_GETTING_FORM")).j();
                    break;
                }
            case 21:
                bwa bwaVar = (bwa) obj7;
                d76[] d76VarArr = (d76[]) obj6;
                int[] iArr2 = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                i19 i19Var = (i19) obj2;
                f19 f19Var = (f19) obj;
                if (bwaVar.n1) {
                    d76 d76Var = d76VarArr[0];
                    if (d76Var == null) {
                        d76Var = bwaVar.J1.c(bwaVar.K1);
                        d76VarArr[0] = d76Var;
                    }
                    if (d76Var != null) {
                        d76Var.setDrawStar(false);
                        d76Var.getLocationInWindow(iArr2);
                        TextView textView = d76Var.F;
                        cm2[] cm2VarArr = d76Var.H;
                        if (cm2VarArr[0] != null && textView.getLayout() != null) {
                            float x = textView.getX() + textView.getPaddingLeft() + cm2VarArr[0].r;
                            float y = textView.getY() + textView.getPaddingTop() + cm2VarArr[0].s;
                            rectF.set(x, y, r1.c.getBounds().width() + x, cm2VarArr[0].c.getBounds().height() + y);
                        }
                        rectF.offset(iArr2[0], iArr2[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr2);
                    rectF.set(gl.L(4.0f) + iArr2[0] + i19Var.b + f19Var.w, ((f19Var.A - gl.L(22.0f)) / 2.0f) + iArr2[1] + i19Var.c + f19Var.x, gl.L(26.0f) + iArr2[0] + i19Var.b + f19Var.w, ((gl.L(22.0f) + f19Var.A) / 2.0f) + iArr2[1] + i19Var.c + f19Var.x);
                    break;
                }
                break;
            default:
                b1c b1cVar = (b1c) obj7;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj6;
                b1cVar.getClass();
                storyItem.translatedLng = (String) obj5;
                storyItem.translatedText = rzb.L0((TLRPC.TL_textWithEntities) obj4, (TLRPC.TL_textWithEntities) obj3);
                b1cVar.getMessagesController().M1().k.h(storyItem.dialogId, storyItem);
                b1cVar.K.remove((z0c) obj2);
                ((et) obj).run();
                break;
        }
    }

    public /* synthetic */ i87(gk7 gk7Var, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = gk7Var;
        this.d = tL_error;
        this.f = tLObject;
        this.h = obj;
        this.c = obj2;
        this.e = obj3;
        this.n = obj4;
    }

    public /* synthetic */ i87(wt1 wt1Var, hd hdVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, k27 k27Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.b = wt1Var;
        this.c = hdVar;
        this.f = tLObject;
        this.h = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.n = k27Var;
        this.d = tL_error;
    }

    public /* synthetic */ i87(gta gtaVar, TLObject tLObject, k27 k27Var, TLRPC.InputInvoice inputInvoice, p8c p8cVar, u21 u21Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 20;
        this.b = gtaVar;
        this.f = tLObject;
        this.h = k27Var;
        this.c = inputInvoice;
        this.e = p8cVar;
        this.n = u21Var;
        this.d = tL_error;
    }

    public /* synthetic */ i87(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.h = obj3;
        this.c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.n = obj7;
    }

    public /* synthetic */ i87(TLRPC.TL_error tL_error, p8c p8cVar, TLObject tLObject, na7 na7Var, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, d dVar, p8c p8cVar2, byte b) {
        this.a = b;
        this.d = tL_error;
        this.f = p8cVar;
        this.h = tLObject;
        this.b = na7Var;
        this.c = tL_inputInvoicePremiumGiftCode;
        this.e = dVar;
        this.n = p8cVar2;
    }

    public /* synthetic */ i87(LaunchActivity launchActivity, hd hdVar, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = (byte) 12;
        this.b = launchActivity;
        this.c = hdVar;
        this.d = tL_error;
        this.f = str;
        this.h = bundle;
        this.e = tLObject;
        this.n = sendconfirmphonecode;
    }
}

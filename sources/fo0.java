// default package

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fo0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fo0(dw9 dw9Var, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, k47 k47Var, String str) {
        this.a = (byte) 14;
        this.e = dw9Var;
        this.b = decryptedMessage;
        this.c = encryptedChat;
        this.d = message;
        this.f = k47Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d6  */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [int] */
    /* JADX WARN: Type inference failed for: r6v43 */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        k47 k47Var;
        TLRPC.Document document;
        TLRPC.Photo photo;
        byte b = this.a;
        String str = "";
        byte b2 = 2;
        byte b3 = 16;
        byte b4 = 4;
        final int i = 0;
        i = 0;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                gm.c3(new ja7(tL_error, (qac) obj5, tLObject, (oc7) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (d) obj2, (qac) obj, (byte) 2));
                break;
            case 1:
                gm.c3(new ja7(tL_error, (qac) obj5, tLObject, (oc7) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (d) obj2, (qac) obj, (byte) 3));
                break;
            case 2:
                gm.c3(new e77((Object) tLObject, obj5, obj4, obj3, obj2, obj, (byte) 5));
                break;
            case 3:
                gm.c3(new e77((jm7) obj5, obj4, obj3, (String) obj2, tLObject, obj, (byte) 7));
                break;
            case 4:
                gm.c3(new ja7((jm7) obj5, tL_error, (TLObject) obj4, (Object) tLObject, obj3, obj2, obj, (byte) 6));
                break;
            case 5:
                gm.c3(new ja7((iv1) obj5, (he) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (k47) obj, tL_error));
                break;
            case 6:
                String str2 = LaunchActivity.C1;
                gm.c3(new ja7((LaunchActivity) obj5, (he) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                break;
            case 7:
                wg6 wg6Var = (wg6) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                d65 d65Var = (d65) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        gm.c3(new pg6(d65Var, b2));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList x0 = oc7.x0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = x0.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj6 = x0.get(i2);
                        i2++;
                        gm.c3(new dt5(wg6Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, (byte) 27));
                    }
                    wg6Var.w.getMessagesController().T3(updates, false);
                    cj0.h().d(purchase, tL_payments_canPurchaseStore.purpose, null);
                    gm.c3(new sg6(wg6Var, b4));
                    break;
                }
                break;
            case 8:
                gm.c3(new ja7((jm7) obj5, tL_error, tLObject, obj4, obj3, obj2, obj, (byte) 14));
                break;
            case 9:
                gm.c3(new e77((Object) tL_error, obj5, obj4, obj3, obj2, obj, (byte) 18));
                break;
            case 10:
                final oc7 oc7Var = (oc7) obj4;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj5;
                final bmb bmbVar = (bmb) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final amb ambVar = (amb) obj;
                String l = tL_theme != null ? tL_theme.title : bmbVar.l();
                int lastIndexOf = l.lastIndexOf(".attheme");
                if (lastIndexOf > 0) {
                    l = l.substring(0, lastIndexOf);
                }
                if (tLObject == null) {
                    gm.c3(new fp6(oc7Var, bmbVar, ambVar, b3));
                    break;
                } else {
                    TLRPC.Document document2 = (TLRPC.Document) tLObject;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.file_reference = document2.file_reference;
                    if (tL_theme != null && tL_theme.creator) {
                        TL_account.updateTheme updatetheme = new TL_account.updateTheme();
                        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                        tL_inputTheme.id = tL_theme.id;
                        tL_inputTheme.access_hash = tL_theme.access_hash;
                        updatetheme.theme = tL_inputTheme;
                        updatetheme.slug = tL_theme.slug;
                        int i3 = updatetheme.flags;
                        updatetheme.title = l;
                        updatetheme.document = tL_inputDocument;
                        updatetheme.flags = i3 | 7;
                        if (tL_inputThemeSettings != null) {
                            updatetheme.settings = tL_inputThemeSettings;
                            updatetheme.flags = i3 | 15;
                        }
                        updatetheme.format = "android";
                        final byte b5 = 1;
                        oc7Var.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() { // from class: l87
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (b5) {
                                    case 0:
                                        final byte b6 = 0;
                                        final oc7 oc7Var2 = oc7Var;
                                        final bmb bmbVar2 = bmbVar;
                                        final amb ambVar2 = ambVar;
                                        gm.c3(new Runnable() { // from class: t87
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b7 = b6;
                                                amb ambVar3 = ambVar2;
                                                bmb bmbVar3 = bmbVar2;
                                                TLObject tLObject3 = tLObject2;
                                                oc7 oc7Var3 = oc7Var2;
                                                switch (b7) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            oc7Var3.getNotificationCenter().k(nm7.N2, bmbVar3, ambVar3);
                                                            break;
                                                        } else {
                                                            cmb.G1(bmbVar3, ambVar3, (TLRPC.TL_theme) tLObject3, oc7Var3.currentAccount, false);
                                                            oc7Var3.g2(bmbVar3, ambVar3, bmbVar3 == cmb.J);
                                                            oc7Var3.getNotificationCenter().k(nm7.M2, bmbVar3, ambVar3);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            oc7Var3.getNotificationCenter().k(nm7.N2, bmbVar3, ambVar3);
                                                            break;
                                                        } else {
                                                            cmb.G1(bmbVar3, ambVar3, (TLRPC.TL_theme) tLObject3, oc7Var3.currentAccount, false);
                                                            oc7Var3.getNotificationCenter().k(nm7.M2, bmbVar3, ambVar3);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b7 = 1;
                                        final oc7 oc7Var3 = oc7Var;
                                        final bmb bmbVar3 = bmbVar;
                                        final amb ambVar3 = ambVar;
                                        gm.c3(new Runnable() { // from class: t87
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b72 = b7;
                                                amb ambVar32 = ambVar3;
                                                bmb bmbVar32 = bmbVar3;
                                                TLObject tLObject3 = tLObject2;
                                                oc7 oc7Var32 = oc7Var3;
                                                switch (b72) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            oc7Var32.getNotificationCenter().k(nm7.N2, bmbVar32, ambVar32);
                                                            break;
                                                        } else {
                                                            cmb.G1(bmbVar32, ambVar32, (TLRPC.TL_theme) tLObject3, oc7Var32.currentAccount, false);
                                                            oc7Var32.g2(bmbVar32, ambVar32, bmbVar32 == cmb.J);
                                                            oc7Var32.getNotificationCenter().k(nm7.M2, bmbVar32, ambVar32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            oc7Var32.getNotificationCenter().k(nm7.N2, bmbVar32, ambVar32);
                                                            break;
                                                        } else {
                                                            cmb.G1(bmbVar32, ambVar32, (TLRPC.TL_theme) tLObject3, oc7Var32.currentAccount, false);
                                                            oc7Var32.getNotificationCenter().k(nm7.M2, bmbVar32, ambVar32);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TL_account.createTheme createtheme = new TL_account.createTheme();
                        createtheme.document = tL_inputDocument;
                        createtheme.flags |= 4;
                        if (tL_theme != null && !TextUtils.isEmpty(tL_theme.slug)) {
                            str = tL_theme.slug;
                        }
                        createtheme.slug = str;
                        createtheme.title = l;
                        if (tL_inputThemeSettings != null) {
                            createtheme.settings = tL_inputThemeSettings;
                            createtheme.flags |= 8;
                        }
                        oc7Var.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() { // from class: l87
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i) {
                                    case 0:
                                        final byte b6 = 0;
                                        final oc7 oc7Var2 = oc7Var;
                                        final bmb bmbVar2 = bmbVar;
                                        final amb ambVar2 = ambVar;
                                        gm.c3(new Runnable() { // from class: t87
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b72 = b6;
                                                amb ambVar32 = ambVar2;
                                                bmb bmbVar32 = bmbVar2;
                                                TLObject tLObject3 = tLObject2;
                                                oc7 oc7Var32 = oc7Var2;
                                                switch (b72) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            oc7Var32.getNotificationCenter().k(nm7.N2, bmbVar32, ambVar32);
                                                            break;
                                                        } else {
                                                            cmb.G1(bmbVar32, ambVar32, (TLRPC.TL_theme) tLObject3, oc7Var32.currentAccount, false);
                                                            oc7Var32.g2(bmbVar32, ambVar32, bmbVar32 == cmb.J);
                                                            oc7Var32.getNotificationCenter().k(nm7.M2, bmbVar32, ambVar32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            oc7Var32.getNotificationCenter().k(nm7.N2, bmbVar32, ambVar32);
                                                            break;
                                                        } else {
                                                            cmb.G1(bmbVar32, ambVar32, (TLRPC.TL_theme) tLObject3, oc7Var32.currentAccount, false);
                                                            oc7Var32.getNotificationCenter().k(nm7.M2, bmbVar32, ambVar32);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b7 = 1;
                                        final oc7 oc7Var3 = oc7Var;
                                        final bmb bmbVar3 = bmbVar;
                                        final amb ambVar3 = ambVar;
                                        gm.c3(new Runnable() { // from class: t87
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b72 = b7;
                                                amb ambVar32 = ambVar3;
                                                bmb bmbVar32 = bmbVar3;
                                                TLObject tLObject3 = tLObject2;
                                                oc7 oc7Var32 = oc7Var3;
                                                switch (b72) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            oc7Var32.getNotificationCenter().k(nm7.N2, bmbVar32, ambVar32);
                                                            break;
                                                        } else {
                                                            cmb.G1(bmbVar32, ambVar32, (TLRPC.TL_theme) tLObject3, oc7Var32.currentAccount, false);
                                                            oc7Var32.g2(bmbVar32, ambVar32, bmbVar32 == cmb.J);
                                                            oc7Var32.getNotificationCenter().k(nm7.M2, bmbVar32, ambVar32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            oc7Var32.getNotificationCenter().k(nm7.N2, bmbVar32, ambVar32);
                                                            break;
                                                        } else {
                                                            cmb.G1(bmbVar32, ambVar32, (TLRPC.TL_theme) tLObject3, oc7Var32.currentAccount, false);
                                                            oc7Var32.getNotificationCenter().k(nm7.M2, bmbVar32, ambVar32);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                break;
            case 11:
                oc7 oc7Var2 = (oc7) obj4;
                he heVar = (he) obj5;
                cr1 cr1Var = (cr1) obj3;
                d dVar = (d) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    gm.c3(new e77((Object) oc7Var2, (Object) heVar, (Object) cr1Var, (Object) tLObject, (Object) dVar, (Object) bundle, (byte) 19));
                    break;
                }
                break;
            case 12:
                gm.c3(new ja7((dz7) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (ez7) obj2, tL_error, (wm4) obj));
                break;
            case 13:
                dw9 dw9Var = (dw9) obj5;
                Activity activity = (Activity) obj4;
                he heVar2 = (he) obj3;
                byte[] bArr = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error != null) {
                    dw9Var.f.clear();
                    gm.c3(new aw9(dw9Var, activity, heVar2, (byte) 1));
                    break;
                } else {
                    gm.c3(new e77((Object) dw9Var, (Object) activity, (Object) heVar2, (Object) tLObject, (Object) bArr, (Object) user, (byte) 25));
                    break;
                }
            case 14:
                dw9 dw9Var2 = (dw9) obj5;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                k47 k47Var2 = (k47) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat Z0 = dw9Var2.getMessagesController().Z0(Integer.valueOf(encryptedChat.id));
                    TLRPC.EncryptedChat encryptedChat2 = Z0 == null ? encryptedChat : Z0;
                    byte[] bArr2 = encryptedChat2.key_hash;
                    if (bArr2 == null) {
                        byte[] bArr3 = encryptedChat2.auth_key;
                        Typeface typeface = gm.a;
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(Utilities.n(bArr3), 0, bArr4, 0, 16);
                        encryptedChat2.key_hash = bArr4;
                        bArr2 = bArr4;
                    }
                    if (bArr2.length == 16) {
                        try {
                            k47Var = k47Var2;
                            try {
                                byte[] o = Utilities.o(r0.length, encryptedChat.auth_key);
                                byte[] bArr5 = new byte[36];
                                System.arraycopy(encryptedChat.key_hash, 0, bArr5, 0, 16);
                                System.arraycopy(o, 0, bArr5, 16, 20);
                                encryptedChat2.key_hash = bArr5;
                                dw9Var2.getMessagesStorage().S1(encryptedChat2);
                            } catch (Throwable th) {
                                th = th;
                                fc4.g(th, true);
                                dw9Var2.a.remove(Integer.valueOf(encryptedChat2.id));
                                int i4 = encryptedChat2.layer;
                                Typeface typeface2 = gm.a;
                                encryptedChat2.layer = (i4 & (-65536)) | nm7.g2;
                                cf7 messagesStorage = dw9Var2.getMessagesStorage();
                                messagesStorage.a.c(new gd7(messagesStorage, encryptedChat2, b2));
                                if (tL_error == null) {
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            k47Var = k47Var2;
                        }
                    } else {
                        k47Var = k47Var2;
                    }
                    dw9Var2.a.remove(Integer.valueOf(encryptedChat2.id));
                    int i42 = encryptedChat2.layer;
                    Typeface typeface22 = gm.a;
                    encryptedChat2.layer = (i42 & (-65536)) | nm7.g2;
                    cf7 messagesStorage2 = dw9Var2.getMessagesStorage();
                    messagesStorage2.a.c(new gd7(messagesStorage2, encryptedChat2, b2));
                } else {
                    k47Var = k47Var2;
                }
                if (tL_error == null) {
                    dw9Var2.getMessagesStorage().K0(0, message);
                    gm.c3(new il9(dw9Var2, message, (byte) 17));
                    break;
                } else {
                    String str3 = message.attachPath;
                    TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                            message.date = messages_sentencryptedmessage.date;
                        }
                    }
                    if (k47Var != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            k47 k47Var3 = k47Var;
                            TLRPC.Message message2 = k47Var3.k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) b10.f(1, photo.sizes);
                                String str4 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                                photoSize.location = tL_fileEncryptedLocation;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                                tL_fileEncryptedLocation.key = decryptedMessageMedia.key;
                                tL_fileEncryptedLocation.iv = decryptedMessageMedia.iv;
                                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                                tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                                String str5 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                File file = new File(bc4.z(4), str4.concat(".jpg"));
                                dw9Var2.getFileLoader().getClass();
                                file.renameTo(bc4.I(photoSize));
                                fn5.z().N(str4, str5, gn5.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(message2);
                                dw9Var2.getMessagesStorage().g1(arrayList, false, true, false, 0, false, 0, 0L);
                            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = messageMedia.document) != null) {
                                messageMedia.document = new TLRPC.TL_documentEncrypted();
                                TLRPC.Document document3 = message2.media.document;
                                document3.id = encryptedFile.id;
                                document3.access_hash = encryptedFile.access_hash;
                                document3.date = document.date;
                                document3.attributes = document.attributes;
                                document3.mime_type = document.mime_type;
                                document3.size = encryptedFile.size;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = decryptedMessage.media;
                                document3.key = decryptedMessageMedia2.key;
                                document3.iv = decryptedMessageMedia2.iv;
                                ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                document3.thumbs = arrayList2;
                                document3.dc_id = encryptedFile.dc_id;
                                if (arrayList2.isEmpty()) {
                                    TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                                    tL_photoSizeEmpty.type = "s";
                                    message2.media.document.thumbs.add(tL_photoSizeEmpty);
                                }
                                String str6 = message2.attachPath;
                                if (str6 != null && str6.startsWith(bc4.z(4).getAbsolutePath())) {
                                    File file2 = new File(message2.attachPath);
                                    bc4 fileLoader = dw9Var2.getFileLoader();
                                    TLRPC.Document document4 = message2.media.document;
                                    fileLoader.getClass();
                                    if (file2.renameTo(bc4.I(document4))) {
                                        k47Var3.z0 = k47Var3.y0;
                                        k47Var3.y0 = false;
                                        message2.attachPath = "";
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(message2);
                                dw9Var2.getMessagesStorage().g1(arrayList3, false, true, false, 0, false, 0, 0L);
                            }
                            i = k47Var3.o1();
                        }
                    }
                    dw9Var2.getMessagesStorage().a.c(new v36((Object) dw9Var2, (Object) message, (Object) messages_sentencryptedmessage, i, (byte) 25));
                    break;
                }
                break;
            case 15:
                gm.c3(new e77(obj5, (Object) tL_error, obj4, obj3, obj2, obj, (byte) 26));
                break;
            case 16:
                gm.c3(new e77((a6a) obj5, tLObject, (TLRPC.InputMedia) obj4, (m5a) obj3, (String) obj2, (k47) obj));
                break;
            case 17:
                gm.c3(new ja7((jva) obj5, tLObject, (k47) obj4, (TLRPC.InputInvoice) obj3, (qac) obj2, (c41) obj, tL_error));
                break;
            case 18:
                gm.c3(new fqa((x2b) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, (byte) 7));
                break;
            default:
                gm.c3(new fqa((int[]) obj5, tLObject, (oc7) obj4, (TLRPC.User[]) obj3, (guc) obj2, (z52) obj, (byte) 11));
                break;
        }
    }

    public /* synthetic */ fo0(oc7 oc7Var, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = obj4;
    }

    public /* synthetic */ fo0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}

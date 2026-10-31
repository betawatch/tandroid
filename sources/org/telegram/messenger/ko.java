package org.telegram.messenger;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ko implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ko(f1 f1Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0268  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        TLRPC.Document document;
        TLRPC.Photo photo;
        int i10 = this.a;
        String str2 = "";
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        f1 f1Var = this.b;
        switch (i10) {
            case 0:
                final vp vpVar = (vp) f1Var;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj4;
                final org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) obj;
                String n10 = tL_theme != null ? tL_theme.title : s6Var.n();
                int lastIndexOf = n10.lastIndexOf(".attheme");
                if (lastIndexOf > 0) {
                    n10 = n10.substring(0, lastIndexOf);
                }
                if (tLObject == null) {
                    i0.g3(new kg(vpVar, s6Var, r6Var, 6));
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
                        int i13 = updatetheme.flags;
                        updatetheme.title = n10;
                        updatetheme.document = tL_inputDocument;
                        updatetheme.flags = i13 | 7;
                        if (tL_inputThemeSettings != null) {
                            updatetheme.settings = tL_inputThemeSettings;
                            updatetheme.flags = i13 | 15;
                        }
                        updatetheme.format = "android";
                        vpVar.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() { // from class: org.telegram.messenger.jl
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i12) {
                                    case 0:
                                        final int i14 = 1;
                                        final vp vpVar2 = vpVar;
                                        final org.telegram.ui.ActionBar.s6 s6Var2 = s6Var;
                                        final org.telegram.ui.ActionBar.r6 r6Var2 = r6Var;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.bm
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i15 = i14;
                                                org.telegram.ui.ActionBar.r6 r6Var3 = r6Var2;
                                                org.telegram.ui.ActionBar.s6 s6Var3 = s6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                vp vpVar3 = vpVar2;
                                                switch (i15) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            vpVar3.getNotificationCenter().k(zs.N2, s6Var3, r6Var3);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.t6.I1(s6Var3, r6Var3, (TLRPC.TL_theme) tLObject3, vpVar3.currentAccount, false);
                                                            vpVar3.getNotificationCenter().k(zs.M2, s6Var3, r6Var3);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            vpVar3.getNotificationCenter().k(zs.N2, s6Var3, r6Var3);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.t6.I1(s6Var3, r6Var3, (TLRPC.TL_theme) tLObject3, vpVar3.currentAccount, false);
                                                            vpVar3.j2(s6Var3, r6Var3, s6Var3 == org.telegram.ui.ActionBar.t6.J);
                                                            vpVar3.getNotificationCenter().k(zs.M2, s6Var3, r6Var3);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i15 = 0;
                                        final vp vpVar3 = vpVar;
                                        final org.telegram.ui.ActionBar.s6 s6Var3 = s6Var;
                                        final org.telegram.ui.ActionBar.r6 r6Var3 = r6Var;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.bm
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i152 = i15;
                                                org.telegram.ui.ActionBar.r6 r6Var32 = r6Var3;
                                                org.telegram.ui.ActionBar.s6 s6Var32 = s6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                vp vpVar32 = vpVar3;
                                                switch (i152) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            vpVar32.getNotificationCenter().k(zs.N2, s6Var32, r6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.t6.I1(s6Var32, r6Var32, (TLRPC.TL_theme) tLObject3, vpVar32.currentAccount, false);
                                                            vpVar32.getNotificationCenter().k(zs.M2, s6Var32, r6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            vpVar32.getNotificationCenter().k(zs.N2, s6Var32, r6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.t6.I1(s6Var32, r6Var32, (TLRPC.TL_theme) tLObject3, vpVar32.currentAccount, false);
                                                            vpVar32.j2(s6Var32, r6Var32, s6Var32 == org.telegram.ui.ActionBar.t6.J);
                                                            vpVar32.getNotificationCenter().k(zs.M2, s6Var32, r6Var32);
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
                        createtheme.flags = 4 | createtheme.flags;
                        if (tL_theme != null && !TextUtils.isEmpty(tL_theme.slug)) {
                            str2 = tL_theme.slug;
                        }
                        createtheme.slug = str2;
                        createtheme.title = n10;
                        if (tL_inputThemeSettings != null) {
                            createtheme.settings = tL_inputThemeSettings;
                            createtheme.flags |= 8;
                        }
                        vpVar.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() { // from class: org.telegram.messenger.jl
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i11) {
                                    case 0:
                                        final int i14 = 1;
                                        final vp vpVar2 = vpVar;
                                        final org.telegram.ui.ActionBar.s6 s6Var2 = s6Var;
                                        final org.telegram.ui.ActionBar.r6 r6Var2 = r6Var;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.bm
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i152 = i14;
                                                org.telegram.ui.ActionBar.r6 r6Var32 = r6Var2;
                                                org.telegram.ui.ActionBar.s6 s6Var32 = s6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                vp vpVar32 = vpVar2;
                                                switch (i152) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            vpVar32.getNotificationCenter().k(zs.N2, s6Var32, r6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.t6.I1(s6Var32, r6Var32, (TLRPC.TL_theme) tLObject3, vpVar32.currentAccount, false);
                                                            vpVar32.getNotificationCenter().k(zs.M2, s6Var32, r6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            vpVar32.getNotificationCenter().k(zs.N2, s6Var32, r6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.t6.I1(s6Var32, r6Var32, (TLRPC.TL_theme) tLObject3, vpVar32.currentAccount, false);
                                                            vpVar32.j2(s6Var32, r6Var32, s6Var32 == org.telegram.ui.ActionBar.t6.J);
                                                            vpVar32.getNotificationCenter().k(zs.M2, s6Var32, r6Var32);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i15 = 0;
                                        final vp vpVar3 = vpVar;
                                        final org.telegram.ui.ActionBar.s6 s6Var3 = s6Var;
                                        final org.telegram.ui.ActionBar.r6 r6Var3 = r6Var;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.bm
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i152 = i15;
                                                org.telegram.ui.ActionBar.r6 r6Var32 = r6Var3;
                                                org.telegram.ui.ActionBar.s6 s6Var32 = s6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                vp vpVar32 = vpVar3;
                                                switch (i152) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            vpVar32.getNotificationCenter().k(zs.N2, s6Var32, r6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.t6.I1(s6Var32, r6Var32, (TLRPC.TL_theme) tLObject3, vpVar32.currentAccount, false);
                                                            vpVar32.getNotificationCenter().k(zs.M2, s6Var32, r6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            vpVar32.getNotificationCenter().k(zs.N2, s6Var32, r6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.t6.I1(s6Var32, r6Var32, (TLRPC.TL_theme) tLObject3, vpVar32.currentAccount, false);
                                                            vpVar32.j2(s6Var32, r6Var32, s6Var32 == org.telegram.ui.ActionBar.t6.J);
                                                            vpVar32.getNotificationCenter().k(zs.M2, s6Var32, r6Var32);
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
            case 1:
                vp vpVar2 = (vp) f1Var;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj4;
                gf.e eVar = (gf.e) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    i0.g3(new ek(vpVar2, x1Var, eVar, tLObject, k2Var, bundle, 5));
                    break;
                }
                break;
            case 2:
                ow owVar = (ow) f1Var;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) obj3;
                byte[] bArr = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error != null) {
                    owVar.f.clear();
                    i0.g3(new lw(owVar, context, x1Var2, i12));
                    break;
                } else {
                    i0.g3(new ek(owVar, context, x1Var2, tLObject, bArr, user, 8));
                    break;
                }
            case 3:
                ow owVar2 = (ow) f1Var;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                jj jjVar = (jj) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat Z0 = owVar2.getMessagesController().Z0(Integer.valueOf(encryptedChat.id));
                    TLRPC.EncryptedChat encryptedChat2 = Z0 == null ? encryptedChat : Z0;
                    if (encryptedChat2.key_hash == null) {
                        byte[] bArr2 = encryptedChat2.auth_key;
                        Typeface typeface = i0.a;
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                        encryptedChat2.key_hash = bArr3;
                    }
                    if (encryptedChat2.key_hash.length == 16) {
                        try {
                            str = "";
                            try {
                                byte[] o10 = Utilities.o(r0.length, encryptedChat.auth_key);
                                byte[] bArr4 = new byte[36];
                                System.arraycopy(encryptedChat.key_hash, 0, bArr4, 0, 16);
                                System.arraycopy(o10, 0, bArr4, 16, 20);
                                encryptedChat2.key_hash = bArr4;
                                owVar2.getMessagesStorage().V1(encryptedChat2);
                            } catch (Throwable th2) {
                                th = th2;
                                f8.g(th, true);
                                owVar2.a.remove(Integer.valueOf(encryptedChat2.id));
                                int i14 = encryptedChat2.layer;
                                Typeface typeface2 = i0.a;
                                encryptedChat2.layer = (i14 & (-65536)) | zs.h2;
                                hs messagesStorage = owVar2.getMessagesStorage();
                                messagesStorage.a.c(new kq(messagesStorage, encryptedChat2, 2));
                                if (tL_error == null) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    owVar2.a.remove(Integer.valueOf(encryptedChat2.id));
                    int i142 = encryptedChat2.layer;
                    Typeface typeface22 = i0.a;
                    encryptedChat2.layer = (i142 & (-65536)) | zs.h2;
                    hs messagesStorage2 = owVar2.getMessagesStorage();
                    messagesStorage2.a.c(new kq(messagesStorage2, encryptedChat2, 2));
                } else {
                    str = "";
                }
                if (tL_error == null) {
                    owVar2.getMessagesStorage().N0(0, message);
                    i0.g3(new hr(15, owVar2, message));
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
                    if (jjVar != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            TLRPC.Message message2 = jjVar.k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) i0.a.g(1, photo.sizes);
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
                                File file = new File(b8.z(4), sc.e.A(str4, ".jpg"));
                                owVar2.getFileLoader().getClass();
                                file.renameTo(b8.I(photoSize));
                                hc.D().R(str4, str5, ic.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(message2);
                                owVar2.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
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
                                if (str6 != null && str6.startsWith(b8.z(4).getAbsolutePath())) {
                                    File file2 = new File(message2.attachPath);
                                    b8 fileLoader = owVar2.getFileLoader();
                                    TLRPC.Document document4 = message2.media.document;
                                    fileLoader.getClass();
                                    if (file2.renameTo(b8.I(document4))) {
                                        jjVar.x0 = jjVar.w0;
                                        jjVar.w0 = false;
                                        message2.attachPath = str;
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(message2);
                                owVar2.getMessagesStorage().j1(arrayList3, false, true, false, 0, false, 0, 0L);
                            }
                            i11 = jjVar.p1();
                        }
                    }
                    owVar2.getMessagesStorage().a.c(new cg(owVar2, message, messages_sentencryptedmessage, i11, 17));
                    break;
                }
                break;
            default:
                i0.g3(new ek((qz) f1Var, tLObject, (TLRPC.InputMedia) obj4, (cz) obj3, (String) obj2, (jj) obj));
                break;
        }
    }

    public /* synthetic */ ko(ow owVar, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, jj jjVar, String str) {
        this.a = 3;
        this.b = owVar;
        this.c = decryptedMessage;
        this.d = encryptedChat;
        this.e = message;
        this.f = jjVar;
    }
}

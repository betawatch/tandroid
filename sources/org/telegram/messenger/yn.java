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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class yn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        fj fjVar;
        TLRPC.Document document;
        TLRPC.Photo photo;
        int i7 = this.a;
        String str = "";
        final int i10 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        c1 c1Var = this.b;
        switch (i7) {
            case 0:
                final mp mpVar = (mp) c1Var;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj4;
                final org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) obj;
                String n10 = tL_theme != null ? tL_theme.title : m6Var.n();
                int lastIndexOf = n10.lastIndexOf(".attheme");
                if (lastIndexOf > 0) {
                    n10 = n10.substring(0, lastIndexOf);
                }
                if (tLObject == null) {
                    g0.g3(new kg(mpVar, m6Var, k6Var, 6));
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
                        int i11 = updatetheme.flags;
                        updatetheme.title = n10;
                        updatetheme.document = tL_inputDocument;
                        updatetheme.flags = i11 | 7;
                        if (tL_inputThemeSettings != null) {
                            updatetheme.settings = tL_inputThemeSettings;
                            updatetheme.flags = i11 | 15;
                        }
                        updatetheme.format = "android";
                        final int i12 = 1;
                        mpVar.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() { // from class: org.telegram.messenger.bl
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i12) {
                                    case 0:
                                        final int i13 = 1;
                                        final mp mpVar2 = mpVar;
                                        final org.telegram.ui.ActionBar.m6 m6Var2 = m6Var;
                                        final org.telegram.ui.ActionBar.k6 k6Var2 = k6Var;
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.ul
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i14 = i13;
                                                org.telegram.ui.ActionBar.k6 k6Var3 = k6Var2;
                                                org.telegram.ui.ActionBar.m6 m6Var3 = m6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                mp mpVar3 = mpVar2;
                                                switch (i14) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            mpVar3.getNotificationCenter().k(ks.N2, m6Var3, k6Var3);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.n6.I1(m6Var3, k6Var3, (TLRPC.TL_theme) tLObject3, mpVar3.currentAccount, false);
                                                            mpVar3.getNotificationCenter().k(ks.M2, m6Var3, k6Var3);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            mpVar3.getNotificationCenter().k(ks.N2, m6Var3, k6Var3);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.n6.I1(m6Var3, k6Var3, (TLRPC.TL_theme) tLObject3, mpVar3.currentAccount, false);
                                                            mpVar3.m2(m6Var3, k6Var3, m6Var3 == org.telegram.ui.ActionBar.n6.J);
                                                            mpVar3.getNotificationCenter().k(ks.M2, m6Var3, k6Var3);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i14 = 0;
                                        final mp mpVar3 = mpVar;
                                        final org.telegram.ui.ActionBar.m6 m6Var3 = m6Var;
                                        final org.telegram.ui.ActionBar.k6 k6Var3 = k6Var;
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.ul
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i142 = i14;
                                                org.telegram.ui.ActionBar.k6 k6Var32 = k6Var3;
                                                org.telegram.ui.ActionBar.m6 m6Var32 = m6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                mp mpVar32 = mpVar3;
                                                switch (i142) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            mpVar32.getNotificationCenter().k(ks.N2, m6Var32, k6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.n6.I1(m6Var32, k6Var32, (TLRPC.TL_theme) tLObject3, mpVar32.currentAccount, false);
                                                            mpVar32.getNotificationCenter().k(ks.M2, m6Var32, k6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            mpVar32.getNotificationCenter().k(ks.N2, m6Var32, k6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.n6.I1(m6Var32, k6Var32, (TLRPC.TL_theme) tLObject3, mpVar32.currentAccount, false);
                                                            mpVar32.m2(m6Var32, k6Var32, m6Var32 == org.telegram.ui.ActionBar.n6.J);
                                                            mpVar32.getNotificationCenter().k(ks.M2, m6Var32, k6Var32);
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
                            str = tL_theme.slug;
                        }
                        createtheme.slug = str;
                        createtheme.title = n10;
                        if (tL_inputThemeSettings != null) {
                            createtheme.settings = tL_inputThemeSettings;
                            createtheme.flags |= 8;
                        }
                        mpVar.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() { // from class: org.telegram.messenger.bl
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i10) {
                                    case 0:
                                        final int i13 = 1;
                                        final mp mpVar2 = mpVar;
                                        final org.telegram.ui.ActionBar.m6 m6Var2 = m6Var;
                                        final org.telegram.ui.ActionBar.k6 k6Var2 = k6Var;
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.ul
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i142 = i13;
                                                org.telegram.ui.ActionBar.k6 k6Var32 = k6Var2;
                                                org.telegram.ui.ActionBar.m6 m6Var32 = m6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                mp mpVar32 = mpVar2;
                                                switch (i142) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            mpVar32.getNotificationCenter().k(ks.N2, m6Var32, k6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.n6.I1(m6Var32, k6Var32, (TLRPC.TL_theme) tLObject3, mpVar32.currentAccount, false);
                                                            mpVar32.getNotificationCenter().k(ks.M2, m6Var32, k6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            mpVar32.getNotificationCenter().k(ks.N2, m6Var32, k6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.n6.I1(m6Var32, k6Var32, (TLRPC.TL_theme) tLObject3, mpVar32.currentAccount, false);
                                                            mpVar32.m2(m6Var32, k6Var32, m6Var32 == org.telegram.ui.ActionBar.n6.J);
                                                            mpVar32.getNotificationCenter().k(ks.M2, m6Var32, k6Var32);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i14 = 0;
                                        final mp mpVar3 = mpVar;
                                        final org.telegram.ui.ActionBar.m6 m6Var3 = m6Var;
                                        final org.telegram.ui.ActionBar.k6 k6Var3 = k6Var;
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.ul
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i142 = i14;
                                                org.telegram.ui.ActionBar.k6 k6Var32 = k6Var3;
                                                org.telegram.ui.ActionBar.m6 m6Var32 = m6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                mp mpVar32 = mpVar3;
                                                switch (i142) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            mpVar32.getNotificationCenter().k(ks.N2, m6Var32, k6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.n6.I1(m6Var32, k6Var32, (TLRPC.TL_theme) tLObject3, mpVar32.currentAccount, false);
                                                            mpVar32.getNotificationCenter().k(ks.M2, m6Var32, k6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            mpVar32.getNotificationCenter().k(ks.N2, m6Var32, k6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.n6.I1(m6Var32, k6Var32, (TLRPC.TL_theme) tLObject3, mpVar32.currentAccount, false);
                                                            mpVar32.m2(m6Var32, k6Var32, m6Var32 == org.telegram.ui.ActionBar.n6.J);
                                                            mpVar32.getNotificationCenter().k(ks.M2, m6Var32, k6Var32);
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
                mp mpVar2 = (mp) c1Var;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj4;
                vf.b bVar = (vf.b) obj3;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    g0.g3(new tj(mpVar2, u1Var, bVar, tLObject, h2Var, bundle, 5));
                    break;
                }
                break;
            case 2:
                xv xvVar = (xv) c1Var;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj3;
                byte[] bArr = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error != null) {
                    xvVar.f.clear();
                    g0.g3(new uv(xvVar, context, u1Var2, 1));
                    break;
                } else {
                    g0.g3(new tj(xvVar, context, u1Var2, tLObject, bArr, user, 8));
                    break;
                }
            case 3:
                xv xvVar2 = (xv) c1Var;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                fj fjVar2 = (fj) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat c12 = xvVar2.getMessagesController().c1(Integer.valueOf(encryptedChat.id));
                    TLRPC.EncryptedChat encryptedChat2 = c12 == null ? encryptedChat : c12;
                    if (encryptedChat2.key_hash == null) {
                        byte[] bArr2 = encryptedChat2.auth_key;
                        Typeface typeface = g0.a;
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                        encryptedChat2.key_hash = bArr3;
                    }
                    if (encryptedChat2.key_hash.length == 16) {
                        try {
                            byte[] o4 = Utilities.o(r0.length, encryptedChat.auth_key);
                            byte[] bArr4 = new byte[36];
                            System.arraycopy(encryptedChat.key_hash, 0, bArr4, 0, 16);
                            System.arraycopy(o4, 0, bArr4, 16, 20);
                            encryptedChat2.key_hash = bArr4;
                            xvVar2.getMessagesStorage().V1(encryptedChat2);
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    xvVar2.a.remove(Integer.valueOf(encryptedChat2.id));
                    int i13 = encryptedChat2.layer;
                    Typeface typeface2 = g0.a;
                    encryptedChat2.layer = (i13 & (-65536)) | ks.h2;
                    tr messagesStorage = xvVar2.getMessagesStorage();
                    messagesStorage.a.c(new zp(messagesStorage, encryptedChat2, 2));
                }
                if (tL_error != null) {
                    xvVar2.getMessagesStorage().N0(0, message);
                    g0.g3(new rq(19, xvVar2, message));
                    break;
                } else {
                    String str2 = message.attachPath;
                    TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                            message.date = messages_sentencryptedmessage.date;
                        }
                    }
                    if (fjVar2 != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            TLRPC.Message message2 = fjVar2.k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || (photo = messageMedia.photo) == null) {
                                fjVar = fjVar2;
                                if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = messageMedia.document) != null) {
                                    messageMedia.document = new TLRPC.TL_documentEncrypted();
                                    TLRPC.Document document3 = message2.media.document;
                                    document3.id = encryptedFile.id;
                                    document3.access_hash = encryptedFile.access_hash;
                                    document3.date = document.date;
                                    document3.attributes = document.attributes;
                                    document3.mime_type = document.mime_type;
                                    document3.size = encryptedFile.size;
                                    TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                                    document3.key = decryptedMessageMedia.key;
                                    document3.iv = decryptedMessageMedia.iv;
                                    ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                                    document3.thumbs = arrayList;
                                    document3.dc_id = encryptedFile.dc_id;
                                    if (arrayList.isEmpty()) {
                                        TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                                        tL_photoSizeEmpty.type = "s";
                                        message2.media.document.thumbs.add(tL_photoSizeEmpty);
                                    }
                                    String str3 = message2.attachPath;
                                    if (str3 != null && str3.startsWith(w7.z(4).getAbsolutePath())) {
                                        File file = new File(message2.attachPath);
                                        w7 fileLoader = xvVar2.getFileLoader();
                                        TLRPC.Document document4 = message2.media.document;
                                        fileLoader.getClass();
                                        if (file.renameTo(w7.I(document4))) {
                                            fjVar.z0 = fjVar.y0;
                                            fjVar.y0 = false;
                                            message2.attachPath = "";
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(message2);
                                    xvVar2.getMessagesStorage().j1(arrayList2, false, true, false, 0, false, 0, 0L);
                                }
                            } else {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) i5.c.h(1, photo.sizes);
                                String str4 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                                photoSize.location = tL_fileEncryptedLocation;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = decryptedMessage.media;
                                tL_fileEncryptedLocation.key = decryptedMessageMedia2.key;
                                tL_fileEncryptedLocation.iv = decryptedMessageMedia2.iv;
                                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                                fjVar = fjVar2;
                                tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                                String str5 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                File file2 = new File(w7.z(4), p5.c.v(str4, ".jpg"));
                                xvVar2.getFileLoader().getClass();
                                file2.renameTo(w7.I(photoSize));
                                ec.D().R(str4, str5, fc.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(message2);
                                xvVar2.getMessagesStorage().j1(arrayList3, false, true, false, 0, false, 0, 0L);
                            }
                            i10 = fjVar.o1();
                        }
                    }
                    xvVar2.getMessagesStorage().a.c(new dg(xvVar2, message, messages_sentencryptedmessage, i10, 16));
                    break;
                }
                break;
            default:
                g0.g3(new tj((zy) c1Var, tLObject, (TLRPC.InputMedia) obj4, (ly) obj3, (String) obj2, (fj) obj));
                break;
        }
    }

    public /* synthetic */ yn(xv xvVar, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, fj fjVar, String str) {
        this.a = 3;
        this.b = xvVar;
        this.c = decryptedMessage;
        this.d = encryptedChat;
        this.e = message;
        this.f = fjVar;
    }
}

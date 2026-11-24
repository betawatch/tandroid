// default package

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nm1 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nm1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:239|240|241|242|(6:(4:244|245|246|(13:248|249|250|251|252|253|254|255|256|257|258|259|260))(1:327)|256|257|258|259|260)|314|315|316|317|255) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x06ff, code lost:
    
        r5 = 2131745667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x06f7, code lost:
    
        if (r8.v2.c() != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0477, code lost:
    
        if (r2 != null) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04b2, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04b7, code lost:
    
        fa4.g(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04b0, code lost:
    
        if (r2 != null) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0489, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x048a, code lost:
    
        r38 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0483, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0484, code lost:
    
        r1 = r0;
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0486, code lost:
    
        r46 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x06ef, code lost:
    
        if (r7.H4() == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x06f9, code lost:
    
        if (r2 == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x06fb, code lost:
    
        r5 = 2131745322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0702, code lost:
    
        r13 = r7;
        r9 = r26;
        r1.b(org.telegram.messenger.beta.R.drawable.msg_calendar2, k96.M0(r5, r4), new de2((java.lang.Object) r8, r9, (java.lang.Object) r15, (byte) 17), false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.CharSequence, java.lang.Runnable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        TLRPC.User V1;
        mu1 mu1Var;
        k27 k27Var;
        k27 k27Var2;
        d dVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        Context context;
        k27 k27Var3;
        boolean z;
        boolean z2;
        boolean z3;
        HashMap<Object, Object> hashMap;
        ArrayList<Object> arrayList;
        int i;
        long j;
        int i2;
        int i3;
        ArrayList arrayList2;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        ParcelFileDescriptor parcelFileDescriptor;
        int i4;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor2;
        boolean z4;
        boolean z5;
        MediaMetadataRetriever mediaMetadataRetriever3;
        String str;
        wjb wjbVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        ?? r4;
        long j2;
        mu1 mu1Var2;
        long j3;
        TLRPC.ChatFull chatFull;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                mu1 mu1Var3 = (mu1) obj4;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj3;
                k27 k27Var4 = (k27) obj2;
                au1 au1Var = (au1) obj;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (mu1Var3.getParentActivity() == null || (!(mu1Var3.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null)) {
                    return false;
                }
                mu1Var3.ea(null, tL_inlineButtonTypeUrl.url, true, null, k27Var4);
                try {
                    au1Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                x02 x02Var = (x02) obj4;
                Context context2 = (Context) obj3;
                wjb wjbVar2 = (wjb) obj2;
                d dVar2 = (d) obj;
                e02 e02Var = x02Var.F2;
                d dVar3 = x02Var.Z1;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = x02Var.d2;
                int i6 = x02Var.G3;
                long j4 = x02Var.T1;
                if ((j4 != 0 || (dVar3 instanceof mu1)) && x02Var.E1 - x02Var.F1 >= 0 && !x02Var.q1.f) {
                    if (dVar3 instanceof mu1) {
                        mu1 mu1Var4 = (mu1) dVar3;
                        TLRPC.User h = mu1Var4.h();
                        k27 k27Var5 = mu1Var4.F5;
                        k27 k27Var6 = mu1Var4.C5;
                        if (!mu1Var4.P7() && mu1Var4.g4 != 5) {
                            V1 = h;
                            mu1Var = mu1Var4;
                            k27Var = k27Var5;
                            k27Var2 = k27Var6;
                            j4 = mu1Var4.a();
                        }
                    } else {
                        V1 = na7.q1(i6).V1(Long.valueOf(j4));
                        mu1Var = null;
                        k27Var = null;
                        k27Var2 = null;
                    }
                    bx1 bx1Var = x02Var.b2;
                    if (bx1Var != null) {
                        bx1Var.dismiss();
                    }
                    bx1 bx1Var2 = new bx1(x02Var, context2, wjbVar2, b2);
                    x02Var.b2 = bx1Var2;
                    bx1Var2.s(e02Var, false, new b0(x02Var, dVar2, wjbVar2, (byte) 20));
                    ArrayList arrayList3 = new ArrayList();
                    p02 p02Var = x02Var.v2;
                    if (p02Var == chatAttachAlertPhotoLayout3 || p02Var == x02Var.k2) {
                        dVar = dVar2;
                        chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                        context = context2;
                        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                        ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                        if (selectedPhotos.isEmpty()) {
                            k27Var3 = null;
                            z = false;
                            z2 = false;
                        } else {
                            String str2 = "";
                            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                            int i7 = 0;
                            int i8 = 0;
                            z = false;
                            z2 = false;
                            k27 k27Var7 = null;
                            while (i8 < ceil) {
                                int i9 = i8 * 10;
                                String str3 = str2;
                                int i10 = ceil;
                                int min = Math.min(10, selectedPhotos.size() - i9);
                                ArrayList arrayList4 = arrayList3;
                                long nextLong = Utilities.b.nextLong();
                                i7 = i7;
                                int i11 = i8;
                                int i12 = 0;
                                while (i12 < min) {
                                    int i13 = min;
                                    int i14 = i9 + i12;
                                    int i15 = i12;
                                    if (i14 >= selectedPhotosOrder.size()) {
                                        hashMap = selectedPhotos;
                                        arrayList = selectedPhotosOrder;
                                        j = nextLong;
                                        arrayList2 = arrayList4;
                                    } else {
                                        jm6 jm6Var = (jm6) selectedPhotos.get(selectedPhotosOrder.get(i14));
                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                        int i16 = i7 + 1;
                                        tL_message.id = i7;
                                        hashMap = selectedPhotos;
                                        tL_message.out = true;
                                        arrayList = selectedPhotosOrder;
                                        tL_message.from_id = na7.q1(i6).w1(y6c.h(i6).e());
                                        tL_message.peer_id = na7.q1(i6).w1(j4);
                                        boolean z9 = jm6Var.b;
                                        String str4 = jm6Var.I;
                                        if (!z9 && (str = jm6Var.h) != null) {
                                            tL_message.attachPath = str;
                                        } else if (str4 != null) {
                                            tL_message.attachPath = str4;
                                        }
                                        if (i13 > 0) {
                                            tL_message.grouped_id = nextLong;
                                        }
                                        int i17 = jm6Var.F;
                                        int i18 = jm6Var.G;
                                        int i19 = jm6Var.J;
                                        if (z9) {
                                            i = i18;
                                            if (jm6Var.Q == -1) {
                                                try {
                                                    mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                                    try {
                                                        try {
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                            break;
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        j = nextLong;
                                                    }
                                                    try {
                                                        try {
                                                            if (jm6Var.d()) {
                                                                j = nextLong;
                                                                try {
                                                                    if (jm6Var.m > 0) {
                                                                        File file = new File(str4);
                                                                        parcelFileDescriptor = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                                                                        try {
                                                                            parcelFileDescriptor2 = parcelFileDescriptor;
                                                                            try {
                                                                                mediaMetadataRetriever2.setDataSource(parcelFileDescriptor.getFileDescriptor(), jm6Var.m, file.length() - jm6Var.m);
                                                                                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                                                parcelFileDescriptor = parcelFileDescriptor2;
                                                                                jm6Var.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                                                mediaMetadataRetriever3.release();
                                                                                z5 = true;
                                                                                break;
                                                                            } catch (Exception e2) {
                                                                                e = e2;
                                                                                parcelFileDescriptor = parcelFileDescriptor2;
                                                                                i4 = 0;
                                                                                try {
                                                                                    jm6Var.Q = i4;
                                                                                    z5 = true;
                                                                                    fa4.g(e, true);
                                                                                    if (mediaMetadataRetriever2 != null) {
                                                                                    }
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    parcelFileDescriptor2 = parcelFileDescriptor;
                                                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                                    if (mediaMetadataRetriever != null) {
                                                                                        try {
                                                                                            mediaMetadataRetriever.release();
                                                                                        } catch (IOException e3) {
                                                                                            z4 = true;
                                                                                            fa4.g(e3, true);
                                                                                            if (parcelFileDescriptor2 == null) {
                                                                                                throw th;
                                                                                            }
                                                                                            try {
                                                                                                parcelFileDescriptor2.close();
                                                                                                throw th;
                                                                                            } catch (IOException e4) {
                                                                                                fa4.g(e4, z4);
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z4 = true;
                                                                                    if (parcelFileDescriptor2 == null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                                                th = th;
                                                                                mediaMetadataRetriever = mediaMetadataRetriever3;
                                                                                if (mediaMetadataRetriever != null) {
                                                                                }
                                                                                z4 = true;
                                                                                if (parcelFileDescriptor2 == null) {
                                                                                }
                                                                            }
                                                                        } catch (Exception e5) {
                                                                            e = e5;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            parcelFileDescriptor2 = parcelFileDescriptor;
                                                                        }
                                                                    }
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    parcelFileDescriptor = null;
                                                                    i4 = 0;
                                                                    jm6Var.Q = i4;
                                                                    z5 = true;
                                                                    fa4.g(e, true);
                                                                    if (mediaMetadataRetriever2 != null) {
                                                                        try {
                                                                            mediaMetadataRetriever2.release();
                                                                            break;
                                                                        } catch (IOException e7) {
                                                                            fa4.g(e7, true);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                j = nextLong;
                                                            }
                                                            mediaMetadataRetriever3.release();
                                                            z5 = true;
                                                        } catch (IOException e8) {
                                                            z5 = true;
                                                            fa4.g(e8, true);
                                                            break;
                                                        }
                                                        jm6Var.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i4 = 0;
                                                        jm6Var.Q = i4;
                                                        z5 = true;
                                                        fa4.g(e, true);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        parcelFileDescriptor2 = parcelFileDescriptor;
                                                        mediaMetadataRetriever = mediaMetadataRetriever3;
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        z4 = true;
                                                        if (parcelFileDescriptor2 == null) {
                                                        }
                                                    }
                                                    mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                    mediaMetadataRetriever3.setDataSource(str4);
                                                    parcelFileDescriptor = null;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    j = nextLong;
                                                    parcelFileDescriptor = null;
                                                    i4 = 0;
                                                    mediaMetadataRetriever2 = null;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    mediaMetadataRetriever = null;
                                                    break;
                                                }
                                            } else {
                                                j = nextLong;
                                            }
                                            i19 = jm6Var.Q;
                                        } else {
                                            i = i18;
                                            j = nextLong;
                                        }
                                        if ((i19 / 90) % 2 != 0) {
                                            i3 = i17;
                                            i2 = i;
                                        } else {
                                            i2 = i17;
                                            i3 = i;
                                        }
                                        if (jm6Var.d()) {
                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                            tL_message.media = tL_messageMediaPhoto;
                                            tL_messageMediaPhoto.live_photo = true;
                                            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                            tL_photoSize.w = i2;
                                            tL_photoSize.h = i3;
                                            tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                            tL_message.media.photo.sizes.add(tL_photoSize);
                                            tL_message.media.document = new TLRPC.TL_document();
                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo.w = i2;
                                            tL_documentAttributeVideo.h = i3;
                                            tL_documentAttributeVideo.duration = jm6Var.E;
                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                        } else if (jm6Var.b) {
                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                            tL_message.media = tL_messageMediaDocument;
                                            tL_messageMediaDocument.document = new TLRPC.TL_document();
                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo2.w = i2;
                                            tL_documentAttributeVideo2.h = i3;
                                            tL_documentAttributeVideo2.duration = jm6Var.E;
                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                                        } else {
                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                            tL_message.media = tL_messageMediaPhoto2;
                                            tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                            TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                            tL_photoSize2.w = i2;
                                            tL_photoSize2.h = i3;
                                            tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                            tL_message.media.photo.sizes.add(tL_photoSize2);
                                        }
                                        tL_message.media.spoiler = jm6Var.M;
                                        CharSequence charSequence = jm6Var.a;
                                        String charSequence2 = charSequence == null ? str3 : charSequence.toString();
                                        tL_message.message = charSequence2;
                                        if (TextUtils.isEmpty(charSequence2) && i11 == 0 && i15 == 0) {
                                            CharSequence[] charSequenceArr = {x02Var.U0().getText()};
                                            k27.d(charSequenceArr[0], true);
                                            tL_message.entities = hq6.d0(i6).Y(charSequenceArr, true, true);
                                            tL_message.message = charSequenceArr[0].toString();
                                        }
                                        if (i11 == 0 && k27Var != null && !k27Var.p) {
                                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                            if (k27Var2 != null) {
                                                tL_messageReplyHeader.flags |= 2;
                                                tL_messageReplyHeader.reply_to_top_id = k27Var2.e1();
                                            }
                                            tL_messageReplyHeader.flags |= 16;
                                            tL_messageReplyHeader.reply_to_msg_id = k27Var.e1();
                                            tL_message.reply_to = tL_messageReplyHeader;
                                        }
                                        k27 k27Var8 = new k27(i6, tL_message, true, false);
                                        if (i11 == 0 && k27Var != null && !k27Var.p) {
                                            k27Var8.C = k27Var;
                                        }
                                        k27Var8.A0 = jm6Var;
                                        k27Var8.B0 = true;
                                        k27Var8.w1 = true;
                                        k27Var8.W2 = Boolean.TRUE;
                                        arrayList2 = arrayList4;
                                        arrayList2.add(k27Var8);
                                        if (k27Var7 == null && !TextUtils.isEmpty(tL_message.message)) {
                                            k27Var7 = k27Var8;
                                        }
                                        i7 = i16;
                                        z = true;
                                        z2 = true;
                                    }
                                    i12 = i15 + 1;
                                    arrayList4 = arrayList2;
                                    min = i13;
                                    selectedPhotos = hashMap;
                                    selectedPhotosOrder = arrayList;
                                    nextLong = j;
                                }
                                arrayList3 = arrayList4;
                                i8 = i11 + 1;
                                ceil = i10;
                                str2 = str3;
                            }
                            k27Var3 = k27Var7;
                        }
                        z3 = z2;
                    } else {
                        if (p02Var == x02Var.e2) {
                            if (TextUtils.isEmpty(x02Var.U0().getText())) {
                                i5 = 0;
                                z8 = false;
                            } else {
                                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                                tL_message2.id = 0;
                                tL_message2.out = true;
                                tL_message2.from_id = na7.q1(i6).w1(y6c.h(i6).e());
                                tL_message2.peer_id = na7.q1(i6).w1(j4);
                                CharSequence[] charSequenceArr2 = {x02Var.U0().getText()};
                                k27.d(charSequenceArr2[0], true);
                                tL_message2.entities = hq6.d0(i6).Y(charSequenceArr2, true, true);
                                tL_message2.message = charSequenceArr2[0].toString();
                                k27 k27Var9 = new k27(i6, tL_message2, true, false);
                                k27Var9.B0 = true;
                                k27Var9.w1 = true;
                                k27Var9.W2 = Boolean.TRUE;
                                arrayList3 = arrayList3;
                                arrayList3.add(k27Var9);
                                i5 = 1;
                                z8 = true;
                            }
                            ArrayList<TLRPC.User> selected = x02Var.e2.getSelected();
                            boolean z10 = z8;
                            int i20 = 0;
                            while (i20 < selected.size()) {
                                TLRPC.User user = selected.get(i20);
                                Context context3 = context2;
                                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                                int i21 = i5 + 1;
                                tL_message3.id = i5;
                                ArrayList<TLRPC.User> arrayList5 = selected;
                                tL_message3.out = true;
                                d dVar4 = dVar2;
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout4 = chatAttachAlertPhotoLayout3;
                                tL_message3.from_id = na7.q1(i6).w1(y6c.h(i6).e());
                                tL_message3.peer_id = na7.q1(i6).w1(j4);
                                TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                                tL_message3.media = tL_messageMediaContact;
                                tL_messageMediaContact.phone_number = user.phone;
                                tL_messageMediaContact.first_name = user.first_name;
                                tL_messageMediaContact.last_name = user.last_name;
                                if (user.restriction_reason.isEmpty() || !user.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                                    tL_message3.media.vcard = "";
                                } else {
                                    tL_message3.media.vcard = user.restriction_reason.get(0).text;
                                }
                                tL_message3.media.user_id = user.id;
                                k27 k27Var10 = new k27(i6, tL_message3, true, false);
                                k27Var10.B0 = true;
                                k27Var10.w1 = true;
                                k27Var10.W2 = Boolean.TRUE;
                                arrayList3.add(k27Var10);
                                i20++;
                                selected = arrayList5;
                                i5 = i21;
                                context2 = context3;
                                dVar2 = dVar4;
                                chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout4;
                                z10 = true;
                            }
                            dVar = dVar2;
                            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                            context = context2;
                            z3 = z10;
                        } else {
                            dVar = dVar2;
                            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                            context = context2;
                            if (p02Var == x02Var.j2) {
                                z3 = false;
                                int i22 = 0;
                                k27Var3 = null;
                                for (int i23 = 0; i23 < x02Var.j2.T.size(); i23++) {
                                    String str5 = (String) x02Var.j2.T.get(i23);
                                    if (str5 != null) {
                                        int lastIndexOf = str5.lastIndexOf(File.separator);
                                        String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                                        if (!TextUtils.isEmpty(substring)) {
                                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                            int i24 = i22 + 1;
                                            tL_message4.id = i22;
                                            tL_message4.out = true;
                                            tL_message4.from_id = na7.q1(i6).w1(y6c.h(i6).e());
                                            tL_message4.peer_id = na7.q1(i6).w1(j4);
                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                                            tL_message4.media = tL_messageMediaDocument2;
                                            tL_message4.attachPath = str5;
                                            tL_messageMediaDocument2.document = new TLRPC.TL_document();
                                            TLRPC.Document document = tL_message4.media.document;
                                            document.file_name = substring;
                                            document.size = new File(str5).length();
                                            if (TextUtils.isEmpty(tL_message4.message) && i23 == 0) {
                                                z6 = true;
                                                z7 = false;
                                                CharSequence[] charSequenceArr3 = {x02Var.U0().getText()};
                                                tL_message4.entities = hq6.d0(i6).Y(charSequenceArr3, true, true);
                                                tL_message4.message = charSequenceArr3[0].toString();
                                            } else {
                                                z6 = true;
                                                z7 = false;
                                            }
                                            k27 k27Var11 = new k27(i6, tL_message4, z6, z7);
                                            k27Var11.y0 = z6;
                                            k27Var11.B0 = z6;
                                            k27Var11.w1 = z6;
                                            k27Var11.W2 = Boolean.TRUE;
                                            arrayList3.add(k27Var11);
                                            if (i23 == 0 && k27Var3 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                                k27Var3 = k27Var11;
                                            }
                                            i22 = i24;
                                            z3 = true;
                                        }
                                    }
                                }
                            } else {
                                h12 h12Var = x02Var.f2;
                                if (p02Var == h12Var) {
                                    arrayList3.addAll(h12Var.getSelected());
                                    if (!arrayList3.isEmpty()) {
                                        k27 k27Var12 = (k27) arrayList3.get(0);
                                        CharSequence[] charSequenceArr4 = {x02Var.U0().getText()};
                                        k27.d(charSequenceArr4[0], true);
                                        k27Var12.k.entities = hq6.d0(i6).Y(charSequenceArr4, true, true);
                                        k27Var12.k.message = charSequenceArr4[0].toString();
                                        if (!TextUtils.isEmpty(k27Var12.k.message)) {
                                            k27Var12.k0();
                                            k27Var3 = k27Var12;
                                            if (arrayList3.size() > 1) {
                                                for (int i25 = 0; i25 < Math.ceil(arrayList3.size() / 10.0f); i25++) {
                                                    int i26 = i25 * 10;
                                                    int min2 = Math.min(10, arrayList3.size() - i26);
                                                    long nextLong2 = Utilities.b.nextLong();
                                                    for (int i27 = 0; i27 < min2; i27++) {
                                                        int i28 = i26 + i27;
                                                        if (i28 < arrayList3.size()) {
                                                            ((k27) arrayList3.get(i28)).k.grouped_id = nextLong2;
                                                        }
                                                    }
                                                }
                                            }
                                            z3 = true;
                                        }
                                    }
                                    k27Var3 = null;
                                    if (arrayList3.size() > 1) {
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            z = false;
                        }
                        k27Var3 = null;
                        z = false;
                    }
                    if (!arrayList3.isEmpty()) {
                        cs5 G = cs5.G(x02Var.b, wjbVar2, e02Var);
                        if (k27Var3 != null) {
                            p02 p02Var2 = x02Var.v2;
                            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                            if (p02Var2 == chatAttachAlertPhotoLayout2 || p02Var2 == x02Var.k2) {
                                r4 = 0;
                                r4 = 0;
                                wjbVar = wjbVar2;
                                j2 = j4;
                                k37 k37Var = new k37(context, R.raw.position_below, k96.M0(2131752548, null), R.raw.position_above, k96.M0(2131752547, null), wjbVar);
                                TLRPC.Message message = k27Var3.k;
                                boolean z11 = x02Var.W1;
                                message.invert_media = z11;
                                k37Var.a(!z11, false);
                                k37Var.setOnClickListener(new b0(x02Var, k27Var3, k37Var, (byte) 21));
                                G.p(k37Var);
                                if (x02Var.E3 == null) {
                                    G.j();
                                }
                            } else {
                                wjbVar = wjbVar2;
                                j2 = j4;
                                r4 = 0;
                            }
                        } else {
                            wjbVar = wjbVar2;
                            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                            r4 = 0;
                            j2 = j4;
                        }
                        boolean D = l7c.D(V1);
                        if (x02Var.E3 == null) {
                            if (mu1Var != null) {
                                if (!hc2.p0(mu1Var.e)) {
                                    break;
                                }
                            }
                            break;
                        }
                        mu1 mu1Var5 = mu1Var;
                        long j5 = j2;
                        p02 p02Var3 = x02Var.v2;
                        if ((p02Var3 == chatAttachAlertPhotoLayout2 || p02Var3 == x02Var.k2) && p02Var3.getSelectedItemsCount() == 1 && mu1Var5 != null && hc2.p0(mu1Var5.e)) {
                            mu1Var2 = mu1Var5;
                            j3 = j5;
                            G.b(R.drawable.input_suggest_paid_24, k96.M0(2131746878, r4), new m77((Object) x02Var, j5, (Object) mu1Var2, (Object) wjbVar, (byte) 5), false);
                        } else {
                            j3 = j5;
                            mu1Var2 = mu1Var5;
                        }
                        byte b3 = 3;
                        if (x02Var.E3 == null && !D) {
                            G.b(R.drawable.input_notify_off, k96.M0(2131745391, r4), new vq0(x02Var, b3), false);
                        }
                        if (x02Var.E3 == null && z && mu1Var2 != null && hc2.V(mu1Var2.e) && (chatFull = mu1Var2.r8) != null && chatFull.paid_media_allowed) {
                            G.b(R.drawable.menu_feature_paid, k96.M0(2131747537, r4), r4, false);
                            a8 z12 = G.z();
                            z12.setOnClickListener(new ee((Object) x02Var, (Object) context, (Object) z12, (Object) wjbVar, (byte) 10));
                            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
                            if (starsPrice > 0) {
                                z12.setText(k96.M0(2131747535, r4));
                                z12.setSubtext(k96.G((int) starsPrice, "Stars", new Object[0]));
                            } else {
                                z12.setText(k96.M0(2131747537, r4));
                                z12.setSubtext(r4);
                            }
                            x02Var.b2.t(starsPrice);
                        }
                        G.Z();
                        x02Var.b2.q(G);
                        x02Var.b2.r(arrayList3);
                        if (x02Var.E3 == null && j3 >= 0 && z3) {
                            x02Var.b2.a(dVar);
                            x02Var.b2.p(x02Var.K2);
                        }
                        x02Var.b2.show();
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                }
                return false;
        }
    }
}

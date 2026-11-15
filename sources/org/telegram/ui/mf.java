package org.telegram.ui;

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
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mf(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:242|243|244|245|(6:(4:247|248|249|(13:251|252|253|254|255|256|257|258|259|260|261|262|263))(1:331)|259|260|261|262|263)|317|318|319|320|258) */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04b6, code lost:
    
        if (r2 != null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04b8, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04bd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04be, code lost:
    
        org.telegram.messenger.a8.g(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04f1, code lost:
    
        if (r2 != null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x04ce, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04cf, code lost:
    
        r40 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04cc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x048b, code lost:
    
        r1 = r0;
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x048d, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0508 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.CharSequence, java.lang.Runnable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v53 */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        TLRPC.User a22;
        an anVar;
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        org.telegram.ui.ActionBar.e2 e2Var;
        org.telegram.ui.Components.sh shVar;
        Context context;
        boolean z10;
        org.telegram.messenger.gj gjVar3;
        boolean z11;
        an anVar2;
        org.telegram.ui.Components.ki kiVar;
        boolean z12;
        org.telegram.messenger.gj gjVar4;
        HashMap<Object, Object> hashMap;
        ArrayList<Object> arrayList;
        int i7;
        long j3;
        int i10;
        int i11;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        ParcelFileDescriptor parcelFileDescriptor;
        int i12;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor2;
        boolean z13;
        boolean z14;
        MediaMetadataRetriever mediaMetadataRetriever3;
        ParcelFileDescriptor parcelFileDescriptor3;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        long j10;
        ?? r62;
        long j11;
        an anVar3;
        an anVar4;
        long j12;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.ci ciVar;
        org.telegram.messenger.gj gjVar5;
        org.telegram.ui.ActionBar.e2 e2Var2;
        org.telegram.ui.Components.sh shVar2;
        int i13;
        boolean z15;
        boolean z16;
        String str2;
        int i14;
        boolean z17;
        String str3;
        int i15 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i16 = 1;
        switch (i15) {
            case 0:
                an anVar5 = (an) obj4;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj3;
                org.telegram.messenger.gj gjVar6 = (org.telegram.messenger.gj) obj2;
                pm pmVar = (pm) obj;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (anVar5.getParentActivity() == null || (!(anVar5.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null)) {
                    return false;
                }
                anVar5.Ca(null, tL_inlineButtonTypeUrl.url, true, null, gjVar6);
                try {
                    pmVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.Components.ki kiVar2 = (org.telegram.ui.Components.ki) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj;
                org.telegram.ui.Components.sh shVar3 = kiVar2.G2;
                org.telegram.ui.ActionBar.e2 e2Var4 = kiVar2.a2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar2.e2;
                int i17 = kiVar2.H3;
                long j13 = kiVar2.U1;
                if ((j13 != 0 || (e2Var4 instanceof an)) && kiVar2.F1 - kiVar2.G1 >= 0 && !kiVar2.r1.f) {
                    if (e2Var4 instanceof an) {
                        an anVar6 = (an) e2Var4;
                        TLRPC.User j14 = anVar6.j();
                        org.telegram.messenger.gj gjVar7 = anVar6.E5;
                        org.telegram.messenger.gj gjVar8 = anVar6.B5;
                        if (!anVar6.c() && anVar6.g4 != 5) {
                            gjVar = gjVar7;
                            gjVar2 = gjVar8;
                            j13 = anVar6.a();
                            a22 = j14;
                            anVar = anVar6;
                        }
                    } else {
                        a22 = org.telegram.messenger.np.s1(i17).a2(Long.valueOf(j13));
                        anVar = null;
                        gjVar = null;
                        gjVar2 = null;
                    }
                    org.telegram.ui.Components.ue ueVar = kiVar2.c2;
                    if (ueVar != null) {
                        ueVar.dismiss();
                    }
                    org.telegram.ui.Components.ue ueVar2 = new org.telegram.ui.Components.ue(kiVar2, context2, e6Var2, i16);
                    kiVar2.c2 = ueVar2;
                    ueVar2.s(shVar3, false, new ah.g(kiVar2, e2Var3, e6Var2, 25));
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.Components.ci ciVar2 = kiVar2.w2;
                    int i18 = 2;
                    if (ciVar2 == chatAttachAlertPhotoLayout || ciVar2 == kiVar2.l2) {
                        e2Var = e2Var3;
                        shVar = shVar3;
                        context = context2;
                        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                        ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                        if (selectedPhotos.isEmpty()) {
                            z10 = false;
                            gjVar3 = null;
                            z11 = false;
                        } else {
                            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                            int i19 = 0;
                            int i20 = 0;
                            boolean z18 = false;
                            z11 = false;
                            org.telegram.messenger.gj gjVar9 = null;
                            while (i20 < ceil) {
                                int i21 = i20 * 10;
                                int i22 = ceil;
                                int i23 = i20;
                                int min = Math.min(10, selectedPhotos.size() - i21);
                                an anVar7 = anVar;
                                org.telegram.ui.Components.ki kiVar3 = kiVar2;
                                long nextLong = Utilities.b.nextLong();
                                i19 = i19;
                                int i24 = 0;
                                while (i24 < min) {
                                    int i25 = i24;
                                    int i26 = i21 + i25;
                                    int i27 = min;
                                    if (i26 >= selectedPhotosOrder.size()) {
                                        hashMap = selectedPhotos;
                                        arrayList = selectedPhotosOrder;
                                        j3 = nextLong;
                                    } else {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i26));
                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                        int i28 = i19 + 1;
                                        tL_message.id = i19;
                                        hashMap = selectedPhotos;
                                        tL_message.out = true;
                                        arrayList = selectedPhotosOrder;
                                        tL_message.from_id = org.telegram.messenger.np.s1(i17).z1(org.telegram.messenger.m10.i(i17).e());
                                        tL_message.peer_id = org.telegram.messenger.np.s1(i17).z1(j13);
                                        boolean z19 = ffVar.b;
                                        String str4 = ffVar.I;
                                        if (!z19 && (str = ffVar.h) != null) {
                                            tL_message.attachPath = str;
                                        } else if (str4 != null) {
                                            tL_message.attachPath = str4;
                                        }
                                        if (i27 > 0) {
                                            tL_message.grouped_id = nextLong;
                                        }
                                        int i29 = ffVar.F;
                                        int i30 = ffVar.G;
                                        int i31 = ffVar.J;
                                        if (z19) {
                                            i7 = i30;
                                            if (ffVar.Q == -1) {
                                                try {
                                                    mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                                    try {
                                                        try {
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                            break;
                                                        }
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        j3 = nextLong;
                                                    }
                                                    try {
                                                        try {
                                                            if (ffVar.d()) {
                                                                j3 = nextLong;
                                                                try {
                                                                    if (ffVar.m > 0) {
                                                                        File file = new File(str4);
                                                                        parcelFileDescriptor = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                                                                        try {
                                                                            parcelFileDescriptor3 = parcelFileDescriptor;
                                                                            try {
                                                                                mediaMetadataRetriever2.setDataSource(parcelFileDescriptor.getFileDescriptor(), ffVar.m, file.length() - ffVar.m);
                                                                                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                                                parcelFileDescriptor = parcelFileDescriptor3;
                                                                                ffVar.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                                                mediaMetadataRetriever3.release();
                                                                                z14 = true;
                                                                                break;
                                                                            } catch (Exception e11) {
                                                                                e = e11;
                                                                                parcelFileDescriptor = parcelFileDescriptor3;
                                                                                i12 = 0;
                                                                                try {
                                                                                    ffVar.Q = i12;
                                                                                    z14 = true;
                                                                                    org.telegram.messenger.a8.g(e, true);
                                                                                    if (mediaMetadataRetriever2 != null) {
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    th2 = th4;
                                                                                    parcelFileDescriptor2 = parcelFileDescriptor;
                                                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                                    if (mediaMetadataRetriever != null) {
                                                                                        try {
                                                                                            mediaMetadataRetriever.release();
                                                                                        } catch (IOException e12) {
                                                                                            z13 = true;
                                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                                            if (parcelFileDescriptor2 == null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z13 = true;
                                                                                    if (parcelFileDescriptor2 == null) {
                                                                                        throw th2;
                                                                                    }
                                                                                    try {
                                                                                        parcelFileDescriptor2.close();
                                                                                        throw th2;
                                                                                    } catch (IOException e13) {
                                                                                        org.telegram.messenger.a8.g(e13, z13);
                                                                                        throw th2;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                th2 = th;
                                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                                parcelFileDescriptor2 = parcelFileDescriptor3;
                                                                                if (mediaMetadataRetriever != null) {
                                                                                }
                                                                                z13 = true;
                                                                                if (parcelFileDescriptor2 == null) {
                                                                                }
                                                                            }
                                                                        } catch (Exception e14) {
                                                                            e = e14;
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            parcelFileDescriptor3 = parcelFileDescriptor;
                                                                        }
                                                                    }
                                                                } catch (Exception e15) {
                                                                    e = e15;
                                                                    parcelFileDescriptor = null;
                                                                    i12 = 0;
                                                                    ffVar.Q = i12;
                                                                    z14 = true;
                                                                    org.telegram.messenger.a8.g(e, true);
                                                                    if (mediaMetadataRetriever2 != null) {
                                                                        try {
                                                                            mediaMetadataRetriever2.release();
                                                                            break;
                                                                        } catch (IOException e16) {
                                                                            org.telegram.messenger.a8.g(e16, true);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                j3 = nextLong;
                                                            }
                                                            mediaMetadataRetriever3.release();
                                                            z14 = true;
                                                        } catch (IOException e17) {
                                                            z14 = true;
                                                            org.telegram.messenger.a8.g(e17, true);
                                                            break;
                                                        }
                                                        ffVar.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i12 = 0;
                                                        ffVar.Q = i12;
                                                        z14 = true;
                                                        org.telegram.messenger.a8.g(e, true);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                    } catch (Throwable th7) {
                                                        th2 = th7;
                                                        parcelFileDescriptor2 = parcelFileDescriptor;
                                                        mediaMetadataRetriever = mediaMetadataRetriever3;
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        z13 = true;
                                                        if (parcelFileDescriptor2 == null) {
                                                        }
                                                    }
                                                    mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                    mediaMetadataRetriever3.setDataSource(str4);
                                                    parcelFileDescriptor = null;
                                                } catch (Exception e19) {
                                                    e = e19;
                                                    j3 = nextLong;
                                                    parcelFileDescriptor = null;
                                                    i12 = 0;
                                                    mediaMetadataRetriever2 = null;
                                                } catch (Throwable th8) {
                                                    th2 = th8;
                                                    mediaMetadataRetriever = null;
                                                    break;
                                                }
                                            } else {
                                                j3 = nextLong;
                                            }
                                            i31 = ffVar.Q;
                                        } else {
                                            i7 = i30;
                                            j3 = nextLong;
                                        }
                                        if ((i31 / 90) % 2 != 0) {
                                            i11 = i29;
                                            i10 = i7;
                                        } else {
                                            i10 = i29;
                                            i11 = i7;
                                        }
                                        if (ffVar.d()) {
                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                            tL_message.media = tL_messageMediaPhoto;
                                            tL_messageMediaPhoto.live_photo = true;
                                            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                            tL_photoSize.w = i10;
                                            tL_photoSize.h = i11;
                                            tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                            tL_message.media.photo.sizes.add(tL_photoSize);
                                            tL_message.media.document = new TLRPC.TL_document();
                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo.w = i10;
                                            tL_documentAttributeVideo.h = i11;
                                            tL_documentAttributeVideo.duration = ffVar.E;
                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                        } else if (ffVar.b) {
                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                            tL_message.media = tL_messageMediaDocument;
                                            tL_messageMediaDocument.document = new TLRPC.TL_document();
                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo2.w = i10;
                                            tL_documentAttributeVideo2.h = i11;
                                            tL_documentAttributeVideo2.duration = ffVar.E;
                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                                        } else {
                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                            tL_message.media = tL_messageMediaPhoto2;
                                            tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                            TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                            tL_photoSize2.w = i10;
                                            tL_photoSize2.h = i11;
                                            tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                            tL_message.media.photo.sizes.add(tL_photoSize2);
                                        }
                                        tL_message.media.spoiler = ffVar.M;
                                        CharSequence charSequence = ffVar.a;
                                        String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                        tL_message.message = charSequence2;
                                        if (TextUtils.isEmpty(charSequence2) && i23 == 0 && i25 == 0) {
                                            CharSequence[] charSequenceArr = {kiVar3.a1().getText()};
                                            org.telegram.messenger.gj.d(charSequenceArr[0], true);
                                            tL_message.entities = org.telegram.messenger.si.b0(i17).W(charSequenceArr, true, true);
                                            tL_message.message = charSequenceArr[0].toString();
                                        }
                                        if (i23 == 0 && gjVar != null && !gjVar.p) {
                                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                            if (gjVar2 != null) {
                                                tL_messageReplyHeader.flags |= 2;
                                                tL_messageReplyHeader.reply_to_top_id = gjVar2.e1();
                                            }
                                            tL_messageReplyHeader.flags |= 16;
                                            tL_messageReplyHeader.reply_to_msg_id = gjVar.e1();
                                            tL_message.reply_to = tL_messageReplyHeader;
                                        }
                                        org.telegram.messenger.gj gjVar10 = new org.telegram.messenger.gj(i17, tL_message, true, false);
                                        if (i23 == 0 && gjVar != null && !gjVar.p) {
                                            gjVar10.C = gjVar;
                                        }
                                        gjVar10.A0 = ffVar;
                                        gjVar10.B0 = true;
                                        gjVar10.w1 = true;
                                        gjVar10.W2 = Boolean.TRUE;
                                        arrayList2.add(gjVar10);
                                        if (gjVar9 == null && !TextUtils.isEmpty(tL_message.message)) {
                                            gjVar9 = gjVar10;
                                        }
                                        i19 = i28;
                                        z18 = true;
                                        z11 = true;
                                    }
                                    i24 = i25 + 1;
                                    min = i27;
                                    selectedPhotos = hashMap;
                                    selectedPhotosOrder = arrayList;
                                    nextLong = j3;
                                }
                                i20 = i23 + 1;
                                ceil = i22;
                                kiVar2 = kiVar3;
                                anVar = anVar7;
                            }
                            z10 = z18;
                            gjVar3 = gjVar9;
                        }
                        anVar2 = anVar;
                        kiVar = kiVar2;
                        z12 = z10;
                        gjVar4 = gjVar3;
                    } else {
                        if (ciVar2 == kiVar2.f2) {
                            if (TextUtils.isEmpty(kiVar2.a1().getText())) {
                                str2 = "";
                                i14 = 0;
                                z17 = false;
                            } else {
                                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                                tL_message2.id = 0;
                                tL_message2.out = true;
                                str2 = "";
                                tL_message2.from_id = org.telegram.messenger.np.s1(i17).z1(org.telegram.messenger.m10.i(i17).e());
                                tL_message2.peer_id = org.telegram.messenger.np.s1(i17).z1(j13);
                                CharSequence[] charSequenceArr2 = {kiVar2.a1().getText()};
                                org.telegram.messenger.gj.d(charSequenceArr2[0], true);
                                tL_message2.entities = org.telegram.messenger.si.b0(i17).W(charSequenceArr2, true, true);
                                tL_message2.message = charSequenceArr2[0].toString();
                                org.telegram.messenger.gj gjVar11 = new org.telegram.messenger.gj(i17, tL_message2, true, false);
                                gjVar11.B0 = true;
                                gjVar11.w1 = true;
                                gjVar11.W2 = Boolean.TRUE;
                                arrayList2.add(gjVar11);
                                i14 = 1;
                                z17 = true;
                            }
                            ArrayList<TLRPC.User> selected = kiVar2.f2.getSelected();
                            int i32 = 0;
                            while (i32 < selected.size()) {
                                TLRPC.User user = selected.get(i32);
                                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                                int i33 = i14 + 1;
                                tL_message3.id = i14;
                                ArrayList<TLRPC.User> arrayList3 = selected;
                                tL_message3.out = true;
                                Context context3 = context2;
                                int i34 = i32;
                                tL_message3.from_id = org.telegram.messenger.np.s1(i17).z1(org.telegram.messenger.m10.i(i17).e());
                                tL_message3.peer_id = org.telegram.messenger.np.s1(i17).z1(j13);
                                TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                                tL_message3.media = tL_messageMediaContact;
                                tL_messageMediaContact.phone_number = user.phone;
                                tL_messageMediaContact.first_name = user.first_name;
                                tL_messageMediaContact.last_name = user.last_name;
                                if (user.restriction_reason.isEmpty() || !user.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                                    str3 = str2;
                                    tL_message3.media.vcard = str3;
                                } else {
                                    tL_message3.media.vcard = user.restriction_reason.get(0).text;
                                    str3 = str2;
                                }
                                str2 = str3;
                                tL_message3.media.user_id = user.id;
                                org.telegram.messenger.gj gjVar12 = new org.telegram.messenger.gj(i17, tL_message3, true, false);
                                gjVar12.B0 = true;
                                gjVar12.w1 = true;
                                gjVar12.W2 = Boolean.TRUE;
                                arrayList2.add(gjVar12);
                                i32 = i34 + 1;
                                selected = arrayList3;
                                i14 = i33;
                                context2 = context3;
                                z17 = true;
                            }
                            context = context2;
                            e2Var = e2Var3;
                            shVar = shVar3;
                            z11 = z17;
                            anVar2 = anVar;
                            kiVar = kiVar2;
                            gjVar4 = null;
                        } else {
                            context = context2;
                            if (ciVar2 == kiVar2.k2) {
                                boolean z20 = false;
                                int i35 = 0;
                                int i36 = 0;
                                org.telegram.messenger.gj gjVar13 = null;
                                while (i35 < kiVar2.k2.T.size()) {
                                    String str5 = (String) kiVar2.k2.T.get(i35);
                                    if (str5 != null) {
                                        int lastIndexOf = str5.lastIndexOf(File.separator);
                                        String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                                        if (!TextUtils.isEmpty(substring)) {
                                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                            int i37 = i36 + 1;
                                            tL_message4.id = i36;
                                            tL_message4.out = true;
                                            e2Var2 = e2Var3;
                                            shVar2 = shVar3;
                                            tL_message4.from_id = org.telegram.messenger.np.s1(i17).z1(org.telegram.messenger.m10.i(i17).e());
                                            tL_message4.peer_id = org.telegram.messenger.np.s1(i17).z1(j13);
                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                                            tL_message4.media = tL_messageMediaDocument2;
                                            tL_message4.attachPath = str5;
                                            tL_messageMediaDocument2.document = new TLRPC.TL_document();
                                            TLRPC.Document document = tL_message4.media.document;
                                            document.file_name = substring;
                                            File file2 = new File(str5);
                                            i13 = i35;
                                            document.size = file2.length();
                                            if (TextUtils.isEmpty(tL_message4.message) && i13 == 0) {
                                                z15 = true;
                                                z16 = false;
                                                CharSequence[] charSequenceArr3 = {kiVar2.a1().getText()};
                                                tL_message4.entities = org.telegram.messenger.si.b0(i17).W(charSequenceArr3, true, true);
                                                tL_message4.message = charSequenceArr3[0].toString();
                                            } else {
                                                z15 = true;
                                                z16 = false;
                                            }
                                            org.telegram.messenger.gj gjVar14 = new org.telegram.messenger.gj(i17, tL_message4, z15, z16);
                                            gjVar14.y0 = z15;
                                            gjVar14.B0 = z15;
                                            gjVar14.w1 = z15;
                                            gjVar14.W2 = Boolean.TRUE;
                                            arrayList2.add(gjVar14);
                                            if (i13 == 0 && gjVar13 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                                gjVar13 = gjVar14;
                                            }
                                            i36 = i37;
                                            z20 = true;
                                            i35 = i13 + 1;
                                            e2Var3 = e2Var2;
                                            shVar3 = shVar2;
                                        }
                                    }
                                    e2Var2 = e2Var3;
                                    shVar2 = shVar3;
                                    i13 = i35;
                                    i35 = i13 + 1;
                                    e2Var3 = e2Var2;
                                    shVar3 = shVar2;
                                }
                                e2Var = e2Var3;
                                shVar = shVar3;
                                z11 = z20;
                                anVar2 = anVar;
                                kiVar = kiVar2;
                                gjVar4 = gjVar13;
                            } else {
                                e2Var = e2Var3;
                                shVar = shVar3;
                                org.telegram.ui.Components.vi viVar = kiVar2.g2;
                                if (ciVar2 == viVar) {
                                    arrayList2.addAll(viVar.getSelected());
                                    if (!arrayList2.isEmpty()) {
                                        org.telegram.messenger.gj gjVar15 = (org.telegram.messenger.gj) arrayList2.get(0);
                                        CharSequence[] charSequenceArr4 = {kiVar2.a1().getText()};
                                        org.telegram.messenger.gj.d(charSequenceArr4[0], true);
                                        gjVar15.k.entities = org.telegram.messenger.si.b0(i17).W(charSequenceArr4, true, true);
                                        gjVar15.k.message = charSequenceArr4[0].toString();
                                        if (!TextUtils.isEmpty(gjVar15.k.message)) {
                                            gjVar15.k0();
                                            gjVar5 = gjVar15;
                                            if (arrayList2.size() > 1) {
                                                for (int i38 = 0; i38 < Math.ceil(arrayList2.size() / 10.0f); i38++) {
                                                    int i39 = i38 * 10;
                                                    int min2 = Math.min(10, arrayList2.size() - i39);
                                                    long nextLong2 = Utilities.b.nextLong();
                                                    for (int i40 = 0; i40 < min2; i40++) {
                                                        int i41 = i39 + i40;
                                                        if (i41 < arrayList2.size()) {
                                                            ((org.telegram.messenger.gj) arrayList2.get(i41)).k.grouped_id = nextLong2;
                                                        }
                                                    }
                                                }
                                            }
                                            anVar2 = anVar;
                                            kiVar = kiVar2;
                                            gjVar4 = gjVar5;
                                            z12 = false;
                                            z11 = true;
                                        }
                                    }
                                    gjVar5 = null;
                                    if (arrayList2.size() > 1) {
                                    }
                                    anVar2 = anVar;
                                    kiVar = kiVar2;
                                    gjVar4 = gjVar5;
                                    z12 = false;
                                    z11 = true;
                                } else {
                                    anVar2 = anVar;
                                    kiVar = kiVar2;
                                    gjVar4 = null;
                                    z12 = false;
                                    z11 = false;
                                }
                            }
                        }
                        z12 = false;
                    }
                    if (!arrayList2.isEmpty()) {
                        org.telegram.ui.Components.ki kiVar4 = kiVar;
                        org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F(kiVar4.b, e6Var2, shVar);
                        if (gjVar4 == null || !((ciVar = kiVar4.w2) == chatAttachAlertPhotoLayout || ciVar == kiVar4.l2)) {
                            e6Var = e6Var2;
                            j10 = j13;
                            r62 = 0;
                        } else {
                            r62 = 0;
                            r62 = 0;
                            e6Var = e6Var2;
                            j10 = j13;
                            org.telegram.ui.Components.ja0 ja0Var = new org.telegram.ui.Components.ja0(context, R.raw.position_below, org.telegram.messenger.hd.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.hd.M0(2131752559, null), e6Var);
                            TLRPC.Message message = gjVar4.k;
                            boolean z21 = kiVar4.X1;
                            message.invert_media = z21;
                            ja0Var.a(!z21, false);
                            ja0Var.setOnClickListener(new ah.g(kiVar4, gjVar4, ja0Var, 26));
                            F.q(ja0Var);
                            if (kiVar4.F3 == null) {
                                F.k();
                            }
                        }
                        boolean B = org.telegram.messenger.q10.B(a22);
                        if (kiVar4.F3 == null) {
                            an anVar8 = anVar2;
                            if ((anVar2 == null || !org.telegram.messenger.t3.p0(anVar8.e)) && ((anVar8 != null && anVar8.S6()) || kiVar4.w2.c())) {
                                j11 = j10;
                                anVar3 = anVar8;
                                F.c(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(B ? 2131745514 : 2131745859, r62), new bi.m1(kiVar4, j11, e6Var, 22), false);
                            } else {
                                j11 = j10;
                                anVar3 = anVar8;
                            }
                        } else {
                            j11 = j10;
                            anVar3 = anVar2;
                        }
                        org.telegram.ui.Components.ci ciVar3 = kiVar4.w2;
                        if ((ciVar3 == chatAttachAlertPhotoLayout || ciVar3 == kiVar4.l2) && ciVar3.getSelectedItemsCount() == 1 && anVar3 != null && org.telegram.messenger.t3.p0(anVar3.e)) {
                            anVar4 = anVar3;
                            j12 = j11;
                            F.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.hd.M0(2131747069, r62), new di.f2(kiVar4, j11, anVar4, e6Var, 16), false);
                        } else {
                            anVar4 = anVar3;
                            j12 = j11;
                        }
                        if (kiVar4.F3 == null && !B) {
                            F.c(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745583, r62), new org.telegram.ui.Components.vg(kiVar4, i18), false);
                        }
                        if (kiVar4.F3 == null && z12 && anVar4 != null && org.telegram.messenger.t3.V(anVar4.e) && (chatFull = anVar4.q8) != null && chatFull.paid_media_allowed) {
                            F.c(R.drawable.menu_feature_paid, org.telegram.messenger.hd.M0(2131747730, r62), r62, false);
                            org.telegram.ui.ActionBar.z0 y10 = F.y();
                            y10.setOnClickListener(new bi.f4(kiVar4, context, y10, e6Var, 13));
                            long starsPrice = chatAttachAlertPhotoLayout.getStarsPrice();
                            if (starsPrice > 0) {
                                y10.setText(org.telegram.messenger.hd.M0(2131747728, r62));
                                y10.setSubtext(org.telegram.messenger.hd.G((int) starsPrice, "Stars", new Object[0]));
                            } else {
                                y10.setText(org.telegram.messenger.hd.M0(2131747730, r62));
                                y10.setSubtext(r62);
                            }
                            kiVar4.c2.t(starsPrice);
                        }
                        F.Y();
                        kiVar4.c2.q(F);
                        kiVar4.c2.r(arrayList2);
                        if (kiVar4.F3 == null && j12 >= 0 && z11) {
                            kiVar4.c2.c(e2Var);
                            kiVar4.c2.p(kiVar4.L2);
                        }
                        kiVar4.c2.show();
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

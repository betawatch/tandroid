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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lf(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
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
        wm wmVar;
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        org.telegram.ui.ActionBar.d2 d2Var;
        org.telegram.ui.Components.ih ihVar;
        Context context;
        boolean z10;
        org.telegram.messenger.zi ziVar3;
        boolean z11;
        wm wmVar2;
        org.telegram.ui.Components.bi biVar;
        boolean z12;
        org.telegram.messenger.zi ziVar4;
        HashMap<Object, Object> hashMap;
        ArrayList<Object> arrayList;
        int i3;
        long j10;
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
        long j11;
        ?? r62;
        long j12;
        wm wmVar3;
        wm wmVar4;
        long j13;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.th thVar;
        org.telegram.messenger.zi ziVar5;
        org.telegram.ui.ActionBar.d2 d2Var2;
        org.telegram.ui.Components.ih ihVar2;
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
                wm wmVar5 = (wm) obj4;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj3;
                org.telegram.messenger.zi ziVar6 = (org.telegram.messenger.zi) obj2;
                lm lmVar = (lm) obj;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (wmVar5.getParentActivity() == null || (!(wmVar5.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null)) {
                    return false;
                }
                wmVar5.za(null, tL_inlineButtonTypeUrl.url, true, null, ziVar6);
                try {
                    lmVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.Components.bi biVar2 = (org.telegram.ui.Components.bi) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj;
                org.telegram.ui.Components.ih ihVar3 = biVar2.D2;
                org.telegram.ui.ActionBar.d2 d2Var4 = biVar2.X1;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar2.b2;
                int i17 = biVar2.E3;
                long j14 = biVar2.R1;
                if ((j14 != 0 || (d2Var4 instanceof wm)) && biVar2.C1 - biVar2.D1 >= 0 && !biVar2.o1.f) {
                    if (d2Var4 instanceof wm) {
                        wm wmVar6 = (wm) d2Var4;
                        TLRPC.User j15 = wmVar6.j();
                        org.telegram.messenger.zi ziVar7 = wmVar6.E5;
                        org.telegram.messenger.zi ziVar8 = wmVar6.B5;
                        if (!wmVar6.c() && wmVar6.g4 != 5) {
                            ziVar = ziVar7;
                            ziVar2 = ziVar8;
                            j14 = wmVar6.a();
                            a22 = j15;
                            wmVar = wmVar6;
                        }
                    } else {
                        a22 = org.telegram.messenger.hp.s1(i17).a2(Long.valueOf(j14));
                        wmVar = null;
                        ziVar = null;
                        ziVar2 = null;
                    }
                    org.telegram.ui.Components.se seVar = biVar2.Z1;
                    if (seVar != null) {
                        seVar.dismiss();
                    }
                    org.telegram.ui.Components.se seVar2 = new org.telegram.ui.Components.se(biVar2, context2, e6Var2, i16);
                    biVar2.Z1 = seVar2;
                    seVar2.q(ihVar3, false, new ai.h(biVar2, d2Var3, e6Var2, 25));
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.Components.th thVar2 = biVar2.t2;
                    int i18 = 2;
                    if (thVar2 == chatAttachAlertPhotoLayout || thVar2 == biVar2.i2) {
                        d2Var = d2Var3;
                        ihVar = ihVar3;
                        context = context2;
                        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                        ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                        if (selectedPhotos.isEmpty()) {
                            z10 = false;
                            ziVar3 = null;
                            z11 = false;
                        } else {
                            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                            int i19 = 0;
                            int i20 = 0;
                            boolean z18 = false;
                            z11 = false;
                            org.telegram.messenger.zi ziVar9 = null;
                            while (i20 < ceil) {
                                int i21 = i20 * 10;
                                int i22 = ceil;
                                int i23 = i20;
                                int min = Math.min(10, selectedPhotos.size() - i21);
                                wm wmVar7 = wmVar;
                                org.telegram.ui.Components.bi biVar3 = biVar2;
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
                                        j10 = nextLong;
                                    } else {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) selectedPhotos.get(selectedPhotosOrder.get(i26));
                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                        int i28 = i19 + 1;
                                        tL_message.id = i19;
                                        hashMap = selectedPhotos;
                                        tL_message.out = true;
                                        arrayList = selectedPhotosOrder;
                                        tL_message.from_id = org.telegram.messenger.hp.s1(i17).z1(org.telegram.messenger.h10.i(i17).e());
                                        tL_message.peer_id = org.telegram.messenger.hp.s1(i17).z1(j14);
                                        boolean z19 = yeVar.b;
                                        String str4 = yeVar.I;
                                        if (!z19 && (str = yeVar.h) != null) {
                                            tL_message.attachPath = str;
                                        } else if (str4 != null) {
                                            tL_message.attachPath = str4;
                                        }
                                        if (i27 > 0) {
                                            tL_message.grouped_id = nextLong;
                                        }
                                        int i29 = yeVar.F;
                                        int i30 = yeVar.G;
                                        int i31 = yeVar.J;
                                        if (z19) {
                                            i3 = i30;
                                            if (yeVar.Q == -1) {
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
                                                        j10 = nextLong;
                                                    }
                                                    try {
                                                        try {
                                                            if (yeVar.d()) {
                                                                j10 = nextLong;
                                                                try {
                                                                    if (yeVar.m > 0) {
                                                                        File file = new File(str4);
                                                                        parcelFileDescriptor = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                                                                        try {
                                                                            parcelFileDescriptor3 = parcelFileDescriptor;
                                                                            try {
                                                                                mediaMetadataRetriever2.setDataSource(parcelFileDescriptor.getFileDescriptor(), yeVar.m, file.length() - yeVar.m);
                                                                                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                                                parcelFileDescriptor = parcelFileDescriptor3;
                                                                                yeVar.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                                                mediaMetadataRetriever3.release();
                                                                                z14 = true;
                                                                                break;
                                                                            } catch (Exception e11) {
                                                                                e = e11;
                                                                                parcelFileDescriptor = parcelFileDescriptor3;
                                                                                i12 = 0;
                                                                                try {
                                                                                    yeVar.Q = i12;
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
                                                                    yeVar.Q = i12;
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
                                                                j10 = nextLong;
                                                            }
                                                            mediaMetadataRetriever3.release();
                                                            z14 = true;
                                                        } catch (IOException e17) {
                                                            z14 = true;
                                                            org.telegram.messenger.a8.g(e17, true);
                                                            break;
                                                        }
                                                        yeVar.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i12 = 0;
                                                        yeVar.Q = i12;
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
                                                    j10 = nextLong;
                                                    parcelFileDescriptor = null;
                                                    i12 = 0;
                                                    mediaMetadataRetriever2 = null;
                                                } catch (Throwable th8) {
                                                    th2 = th8;
                                                    mediaMetadataRetriever = null;
                                                    break;
                                                }
                                            } else {
                                                j10 = nextLong;
                                            }
                                            i31 = yeVar.Q;
                                        } else {
                                            i3 = i30;
                                            j10 = nextLong;
                                        }
                                        if ((i31 / 90) % 2 != 0) {
                                            i11 = i29;
                                            i10 = i3;
                                        } else {
                                            i10 = i29;
                                            i11 = i3;
                                        }
                                        if (yeVar.d()) {
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
                                            tL_documentAttributeVideo.duration = yeVar.E;
                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                        } else if (yeVar.b) {
                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                            tL_message.media = tL_messageMediaDocument;
                                            tL_messageMediaDocument.document = new TLRPC.TL_document();
                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo2.w = i10;
                                            tL_documentAttributeVideo2.h = i11;
                                            tL_documentAttributeVideo2.duration = yeVar.E;
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
                                        tL_message.media.spoiler = yeVar.M;
                                        CharSequence charSequence = yeVar.a;
                                        String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                        tL_message.message = charSequence2;
                                        if (TextUtils.isEmpty(charSequence2) && i23 == 0 && i25 == 0) {
                                            CharSequence[] charSequenceArr = {biVar3.a1().getText()};
                                            org.telegram.messenger.zi.d(charSequenceArr[0], true);
                                            tL_message.entities = org.telegram.messenger.li.b0(i17).W(charSequenceArr, true, true);
                                            tL_message.message = charSequenceArr[0].toString();
                                        }
                                        if (i23 == 0 && ziVar != null && !ziVar.p) {
                                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                            if (ziVar2 != null) {
                                                tL_messageReplyHeader.flags |= 2;
                                                tL_messageReplyHeader.reply_to_top_id = ziVar2.f1();
                                            }
                                            tL_messageReplyHeader.flags |= 16;
                                            tL_messageReplyHeader.reply_to_msg_id = ziVar.f1();
                                            tL_message.reply_to = tL_messageReplyHeader;
                                        }
                                        org.telegram.messenger.zi ziVar10 = new org.telegram.messenger.zi(i17, tL_message, true, false);
                                        if (i23 == 0 && ziVar != null && !ziVar.p) {
                                            ziVar10.C = ziVar;
                                        }
                                        ziVar10.y0 = yeVar;
                                        ziVar10.z0 = true;
                                        ziVar10.u1 = true;
                                        ziVar10.U2 = Boolean.TRUE;
                                        arrayList2.add(ziVar10);
                                        if (ziVar9 == null && !TextUtils.isEmpty(tL_message.message)) {
                                            ziVar9 = ziVar10;
                                        }
                                        i19 = i28;
                                        z18 = true;
                                        z11 = true;
                                    }
                                    i24 = i25 + 1;
                                    min = i27;
                                    selectedPhotos = hashMap;
                                    selectedPhotosOrder = arrayList;
                                    nextLong = j10;
                                }
                                i20 = i23 + 1;
                                ceil = i22;
                                biVar2 = biVar3;
                                wmVar = wmVar7;
                            }
                            z10 = z18;
                            ziVar3 = ziVar9;
                        }
                        wmVar2 = wmVar;
                        biVar = biVar2;
                        z12 = z10;
                        ziVar4 = ziVar3;
                    } else {
                        if (thVar2 == biVar2.c2) {
                            if (TextUtils.isEmpty(biVar2.a1().getText())) {
                                str2 = "";
                                i14 = 0;
                                z17 = false;
                            } else {
                                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                                tL_message2.id = 0;
                                tL_message2.out = true;
                                str2 = "";
                                tL_message2.from_id = org.telegram.messenger.hp.s1(i17).z1(org.telegram.messenger.h10.i(i17).e());
                                tL_message2.peer_id = org.telegram.messenger.hp.s1(i17).z1(j14);
                                CharSequence[] charSequenceArr2 = {biVar2.a1().getText()};
                                org.telegram.messenger.zi.d(charSequenceArr2[0], true);
                                tL_message2.entities = org.telegram.messenger.li.b0(i17).W(charSequenceArr2, true, true);
                                tL_message2.message = charSequenceArr2[0].toString();
                                org.telegram.messenger.zi ziVar11 = new org.telegram.messenger.zi(i17, tL_message2, true, false);
                                ziVar11.z0 = true;
                                ziVar11.u1 = true;
                                ziVar11.U2 = Boolean.TRUE;
                                arrayList2.add(ziVar11);
                                i14 = 1;
                                z17 = true;
                            }
                            ArrayList<TLRPC.User> selected = biVar2.c2.getSelected();
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
                                tL_message3.from_id = org.telegram.messenger.hp.s1(i17).z1(org.telegram.messenger.h10.i(i17).e());
                                tL_message3.peer_id = org.telegram.messenger.hp.s1(i17).z1(j14);
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
                                org.telegram.messenger.zi ziVar12 = new org.telegram.messenger.zi(i17, tL_message3, true, false);
                                ziVar12.z0 = true;
                                ziVar12.u1 = true;
                                ziVar12.U2 = Boolean.TRUE;
                                arrayList2.add(ziVar12);
                                i32 = i34 + 1;
                                selected = arrayList3;
                                i14 = i33;
                                context2 = context3;
                                z17 = true;
                            }
                            context = context2;
                            d2Var = d2Var3;
                            ihVar = ihVar3;
                            z11 = z17;
                            wmVar2 = wmVar;
                            biVar = biVar2;
                            ziVar4 = null;
                        } else {
                            context = context2;
                            if (thVar2 == biVar2.h2) {
                                boolean z20 = false;
                                int i35 = 0;
                                int i36 = 0;
                                org.telegram.messenger.zi ziVar13 = null;
                                while (i35 < biVar2.h2.T.size()) {
                                    String str5 = (String) biVar2.h2.T.get(i35);
                                    if (str5 != null) {
                                        int lastIndexOf = str5.lastIndexOf(File.separator);
                                        String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                                        if (!TextUtils.isEmpty(substring)) {
                                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                            int i37 = i36 + 1;
                                            tL_message4.id = i36;
                                            tL_message4.out = true;
                                            d2Var2 = d2Var3;
                                            ihVar2 = ihVar3;
                                            tL_message4.from_id = org.telegram.messenger.hp.s1(i17).z1(org.telegram.messenger.h10.i(i17).e());
                                            tL_message4.peer_id = org.telegram.messenger.hp.s1(i17).z1(j14);
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
                                                CharSequence[] charSequenceArr3 = {biVar2.a1().getText()};
                                                tL_message4.entities = org.telegram.messenger.li.b0(i17).W(charSequenceArr3, true, true);
                                                tL_message4.message = charSequenceArr3[0].toString();
                                            } else {
                                                z15 = true;
                                                z16 = false;
                                            }
                                            org.telegram.messenger.zi ziVar14 = new org.telegram.messenger.zi(i17, tL_message4, z15, z16);
                                            ziVar14.w0 = z15;
                                            ziVar14.z0 = z15;
                                            ziVar14.u1 = z15;
                                            ziVar14.U2 = Boolean.TRUE;
                                            arrayList2.add(ziVar14);
                                            if (i13 == 0 && ziVar13 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                                ziVar13 = ziVar14;
                                            }
                                            i36 = i37;
                                            z20 = true;
                                            i35 = i13 + 1;
                                            d2Var3 = d2Var2;
                                            ihVar3 = ihVar2;
                                        }
                                    }
                                    d2Var2 = d2Var3;
                                    ihVar2 = ihVar3;
                                    i13 = i35;
                                    i35 = i13 + 1;
                                    d2Var3 = d2Var2;
                                    ihVar3 = ihVar2;
                                }
                                d2Var = d2Var3;
                                ihVar = ihVar3;
                                z11 = z20;
                                wmVar2 = wmVar;
                                biVar = biVar2;
                                ziVar4 = ziVar13;
                            } else {
                                d2Var = d2Var3;
                                ihVar = ihVar3;
                                org.telegram.ui.Components.ni niVar = biVar2.d2;
                                if (thVar2 == niVar) {
                                    arrayList2.addAll(niVar.getSelected());
                                    if (!arrayList2.isEmpty()) {
                                        org.telegram.messenger.zi ziVar15 = (org.telegram.messenger.zi) arrayList2.get(0);
                                        CharSequence[] charSequenceArr4 = {biVar2.a1().getText()};
                                        org.telegram.messenger.zi.d(charSequenceArr4[0], true);
                                        ziVar15.k.entities = org.telegram.messenger.li.b0(i17).W(charSequenceArr4, true, true);
                                        ziVar15.k.message = charSequenceArr4[0].toString();
                                        if (!TextUtils.isEmpty(ziVar15.k.message)) {
                                            ziVar15.k0();
                                            ziVar5 = ziVar15;
                                            if (arrayList2.size() > 1) {
                                                for (int i38 = 0; i38 < Math.ceil(arrayList2.size() / 10.0f); i38++) {
                                                    int i39 = i38 * 10;
                                                    int min2 = Math.min(10, arrayList2.size() - i39);
                                                    long nextLong2 = Utilities.b.nextLong();
                                                    for (int i40 = 0; i40 < min2; i40++) {
                                                        int i41 = i39 + i40;
                                                        if (i41 < arrayList2.size()) {
                                                            ((org.telegram.messenger.zi) arrayList2.get(i41)).k.grouped_id = nextLong2;
                                                        }
                                                    }
                                                }
                                            }
                                            wmVar2 = wmVar;
                                            biVar = biVar2;
                                            ziVar4 = ziVar5;
                                            z12 = false;
                                            z11 = true;
                                        }
                                    }
                                    ziVar5 = null;
                                    if (arrayList2.size() > 1) {
                                    }
                                    wmVar2 = wmVar;
                                    biVar = biVar2;
                                    ziVar4 = ziVar5;
                                    z12 = false;
                                    z11 = true;
                                } else {
                                    wmVar2 = wmVar;
                                    biVar = biVar2;
                                    ziVar4 = null;
                                    z12 = false;
                                    z11 = false;
                                }
                            }
                        }
                        z12 = false;
                    }
                    if (!arrayList2.isEmpty()) {
                        org.telegram.ui.Components.bi biVar4 = biVar;
                        org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F(biVar4.b, e6Var2, ihVar);
                        if (ziVar4 == null || !((thVar = biVar4.t2) == chatAttachAlertPhotoLayout || thVar == biVar4.i2)) {
                            e6Var = e6Var2;
                            j11 = j14;
                            r62 = 0;
                        } else {
                            r62 = 0;
                            r62 = 0;
                            e6Var = e6Var2;
                            j11 = j14;
                            org.telegram.ui.Components.ca0 ca0Var = new org.telegram.ui.Components.ca0(context, R.raw.position_below, org.telegram.messenger.bd.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.bd.M0(2131752559, null), e6Var);
                            TLRPC.Message message = ziVar4.k;
                            boolean z21 = biVar4.U1;
                            message.invert_media = z21;
                            ca0Var.a(!z21, false);
                            ca0Var.setOnClickListener(new ai.h(biVar4, ziVar4, ca0Var, 26));
                            F.q(ca0Var);
                            if (biVar4.C3 == null) {
                                F.k();
                            }
                        }
                        boolean B = org.telegram.messenger.l10.B(a22);
                        if (biVar4.C3 == null) {
                            wm wmVar8 = wmVar2;
                            if ((wmVar2 == null || !org.telegram.messenger.t3.p0(wmVar8.e)) && ((wmVar8 != null && wmVar8.R6()) || biVar4.t2.c())) {
                                j12 = j11;
                                wmVar3 = wmVar8;
                                F.c(R.drawable.msg_calendar2, org.telegram.messenger.bd.M0(B ? 2131745524 : 2131745869, r62), new ai.r1(biVar4, j12, e6Var, 22), false);
                            } else {
                                j12 = j11;
                                wmVar3 = wmVar8;
                            }
                        } else {
                            j12 = j11;
                            wmVar3 = wmVar2;
                        }
                        org.telegram.ui.Components.th thVar3 = biVar4.t2;
                        if ((thVar3 == chatAttachAlertPhotoLayout || thVar3 == biVar4.i2) && thVar3.getSelectedItemsCount() == 1 && wmVar3 != null && org.telegram.messenger.t3.p0(wmVar3.e)) {
                            wmVar4 = wmVar3;
                            j13 = j12;
                            F.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.bd.M0(2131747077, r62), new ci.l2(biVar4, j12, wmVar4, e6Var, 16), false);
                        } else {
                            wmVar4 = wmVar3;
                            j13 = j12;
                        }
                        if (biVar4.C3 == null && !B) {
                            F.c(R.drawable.input_notify_off, org.telegram.messenger.bd.M0(2131745593, r62), new org.telegram.ui.Components.ng(biVar4, i18), false);
                        }
                        if (biVar4.C3 == null && z12 && wmVar4 != null && org.telegram.messenger.t3.V(wmVar4.e) && (chatFull = wmVar4.q8) != null && chatFull.paid_media_allowed) {
                            F.c(R.drawable.menu_feature_paid, org.telegram.messenger.bd.M0(2131747738, r62), r62, false);
                            org.telegram.ui.ActionBar.y0 y9 = F.y();
                            y9.setOnClickListener(new ai.r4(biVar4, context, y9, e6Var, 13));
                            long starsPrice = chatAttachAlertPhotoLayout.getStarsPrice();
                            if (starsPrice > 0) {
                                y9.setText(org.telegram.messenger.bd.M0(2131747736, r62));
                                y9.setSubtext(org.telegram.messenger.bd.G((int) starsPrice, "Stars", new Object[0]));
                            } else {
                                y9.setText(org.telegram.messenger.bd.M0(2131747738, r62));
                                y9.setSubtext(r62);
                            }
                            biVar4.Z1.r(starsPrice);
                        }
                        F.Y();
                        biVar4.Z1.o(F);
                        biVar4.Z1.p(arrayList2);
                        if (biVar4.C3 == null && j13 >= 0 && z11) {
                            biVar4.Z1.c(d2Var);
                            biVar4.Z1.n(biVar4.I2);
                        }
                        biVar4.Z1.show();
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

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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pf(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
        cn cnVar;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.ActionBar.f2 f2Var;
        org.telegram.ui.Components.kh khVar;
        Context context;
        boolean z9;
        org.telegram.messenger.ij ijVar3;
        boolean z10;
        cn cnVar2;
        org.telegram.ui.Components.ci ciVar;
        boolean z11;
        org.telegram.messenger.ij ijVar4;
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
        boolean z12;
        boolean z13;
        MediaMetadataRetriever mediaMetadataRetriever3;
        ParcelFileDescriptor parcelFileDescriptor3;
        String str;
        org.telegram.ui.ActionBar.h6 h6Var;
        long j10;
        ?? r62;
        long j11;
        cn cnVar3;
        cn cnVar4;
        long j12;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.uh uhVar;
        org.telegram.messenger.ij ijVar5;
        org.telegram.ui.ActionBar.f2 f2Var2;
        org.telegram.ui.Components.kh khVar2;
        int i13;
        boolean z14;
        boolean z15;
        String str2;
        int i14;
        boolean z16;
        String str3;
        int i15 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i16 = 1;
        switch (i15) {
            case 0:
                cn cnVar5 = (cn) obj4;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj3;
                org.telegram.messenger.ij ijVar6 = (org.telegram.messenger.ij) obj2;
                rm rmVar = (rm) obj;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (cnVar5.getParentActivity() == null || (!(cnVar5.c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null)) {
                    return false;
                }
                cnVar5.Ba(null, tL_inlineButtonTypeUrl.url, true, null, ijVar6);
                try {
                    rmVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.Components.ci ciVar2 = (org.telegram.ui.Components.ci) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj2;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) obj;
                org.telegram.ui.Components.kh khVar3 = ciVar2.F2;
                org.telegram.ui.ActionBar.f2 f2Var4 = ciVar2.Z1;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar2.d2;
                int i17 = ciVar2.G3;
                long j13 = ciVar2.T1;
                if ((j13 != 0 || (f2Var4 instanceof cn)) && ciVar2.E1 - ciVar2.F1 >= 0 && !ciVar2.q1.f) {
                    if (f2Var4 instanceof cn) {
                        cn cnVar6 = (cn) f2Var4;
                        TLRPC.User j14 = cnVar6.j();
                        org.telegram.messenger.ij ijVar7 = cnVar6.D5;
                        org.telegram.messenger.ij ijVar8 = cnVar6.A5;
                        if (!cnVar6.c() && cnVar6.f4 != 5) {
                            ijVar = ijVar7;
                            ijVar2 = ijVar8;
                            j13 = cnVar6.a();
                            a22 = j14;
                            cnVar = cnVar6;
                        }
                    } else {
                        a22 = org.telegram.messenger.qp.s1(i17).a2(Long.valueOf(j13));
                        cnVar = null;
                        ijVar = null;
                        ijVar2 = null;
                    }
                    org.telegram.ui.Components.te teVar = ciVar2.b2;
                    if (teVar != null) {
                        teVar.dismiss();
                    }
                    org.telegram.ui.Components.te teVar2 = new org.telegram.ui.Components.te(ciVar2, context2, h6Var2, i16);
                    ciVar2.b2 = teVar2;
                    teVar2.q(khVar3, false, new ah.g(ciVar2, f2Var3, h6Var2, 20));
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.Components.uh uhVar2 = ciVar2.v2;
                    int i18 = 2;
                    if (uhVar2 == chatAttachAlertPhotoLayout || uhVar2 == ciVar2.k2) {
                        f2Var = f2Var3;
                        khVar = khVar3;
                        context = context2;
                        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                        ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                        if (selectedPhotos.isEmpty()) {
                            z9 = false;
                            ijVar3 = null;
                            z10 = false;
                        } else {
                            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                            int i19 = 0;
                            int i20 = 0;
                            boolean z17 = false;
                            z10 = false;
                            org.telegram.messenger.ij ijVar9 = null;
                            while (i20 < ceil) {
                                int i21 = i20 * 10;
                                int i22 = ceil;
                                int i23 = i20;
                                int min = Math.min(10, selectedPhotos.size() - i21);
                                cn cnVar7 = cnVar;
                                org.telegram.ui.Components.ci ciVar3 = ciVar2;
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
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.get(selectedPhotosOrder.get(i26));
                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                        int i28 = i19 + 1;
                                        tL_message.id = i19;
                                        hashMap = selectedPhotos;
                                        tL_message.out = true;
                                        arrayList = selectedPhotosOrder;
                                        tL_message.from_id = org.telegram.messenger.qp.s1(i17).z1(org.telegram.messenger.p10.i(i17).e());
                                        tL_message.peer_id = org.telegram.messenger.qp.s1(i17).z1(j13);
                                        boolean z18 = gfVar.b;
                                        String str4 = gfVar.I;
                                        if (!z18 && (str = gfVar.h) != null) {
                                            tL_message.attachPath = str;
                                        } else if (str4 != null) {
                                            tL_message.attachPath = str4;
                                        }
                                        if (i27 > 0) {
                                            tL_message.grouped_id = nextLong;
                                        }
                                        int i29 = gfVar.F;
                                        int i30 = gfVar.G;
                                        int i31 = gfVar.J;
                                        if (z18) {
                                            i7 = i30;
                                            if (gfVar.Q == -1) {
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
                                                            if (gfVar.d()) {
                                                                j3 = nextLong;
                                                                try {
                                                                    if (gfVar.m > 0) {
                                                                        File file = new File(str4);
                                                                        parcelFileDescriptor = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                                                                        try {
                                                                            parcelFileDescriptor3 = parcelFileDescriptor;
                                                                            try {
                                                                                mediaMetadataRetriever2.setDataSource(parcelFileDescriptor.getFileDescriptor(), gfVar.m, file.length() - gfVar.m);
                                                                                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                                                parcelFileDescriptor = parcelFileDescriptor3;
                                                                                gfVar.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                                                mediaMetadataRetriever3.release();
                                                                                z13 = true;
                                                                                break;
                                                                            } catch (Exception e11) {
                                                                                e = e11;
                                                                                parcelFileDescriptor = parcelFileDescriptor3;
                                                                                i12 = 0;
                                                                                try {
                                                                                    gfVar.Q = i12;
                                                                                    z13 = true;
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
                                                                                            z12 = true;
                                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                                            if (parcelFileDescriptor2 == null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z12 = true;
                                                                                    if (parcelFileDescriptor2 == null) {
                                                                                        throw th2;
                                                                                    }
                                                                                    try {
                                                                                        parcelFileDescriptor2.close();
                                                                                        throw th2;
                                                                                    } catch (IOException e13) {
                                                                                        org.telegram.messenger.a8.g(e13, z12);
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
                                                                                z12 = true;
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
                                                                    gfVar.Q = i12;
                                                                    z13 = true;
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
                                                            z13 = true;
                                                        } catch (IOException e17) {
                                                            z13 = true;
                                                            org.telegram.messenger.a8.g(e17, true);
                                                            break;
                                                        }
                                                        gfVar.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i12 = 0;
                                                        gfVar.Q = i12;
                                                        z13 = true;
                                                        org.telegram.messenger.a8.g(e, true);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                    } catch (Throwable th7) {
                                                        th2 = th7;
                                                        parcelFileDescriptor2 = parcelFileDescriptor;
                                                        mediaMetadataRetriever = mediaMetadataRetriever3;
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        z12 = true;
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
                                            i31 = gfVar.Q;
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
                                        if (gfVar.d()) {
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
                                            tL_documentAttributeVideo.duration = gfVar.E;
                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                        } else if (gfVar.b) {
                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                            tL_message.media = tL_messageMediaDocument;
                                            tL_messageMediaDocument.document = new TLRPC.TL_document();
                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo2.w = i10;
                                            tL_documentAttributeVideo2.h = i11;
                                            tL_documentAttributeVideo2.duration = gfVar.E;
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
                                        tL_message.media.spoiler = gfVar.M;
                                        CharSequence charSequence = gfVar.a;
                                        String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                        tL_message.message = charSequence2;
                                        if (TextUtils.isEmpty(charSequence2) && i23 == 0 && i25 == 0) {
                                            CharSequence[] charSequenceArr = {ciVar3.a1().getText()};
                                            org.telegram.messenger.ij.d(charSequenceArr[0], true);
                                            tL_message.entities = org.telegram.messenger.ui.b0(i17).W(charSequenceArr, true, true);
                                            tL_message.message = charSequenceArr[0].toString();
                                        }
                                        if (i23 == 0 && ijVar != null && !ijVar.p) {
                                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                            if (ijVar2 != null) {
                                                tL_messageReplyHeader.flags |= 2;
                                                tL_messageReplyHeader.reply_to_top_id = ijVar2.e1();
                                            }
                                            tL_messageReplyHeader.flags |= 16;
                                            tL_messageReplyHeader.reply_to_msg_id = ijVar.e1();
                                            tL_message.reply_to = tL_messageReplyHeader;
                                        }
                                        org.telegram.messenger.ij ijVar10 = new org.telegram.messenger.ij(i17, tL_message, true, false);
                                        if (i23 == 0 && ijVar != null && !ijVar.p) {
                                            ijVar10.C = ijVar;
                                        }
                                        ijVar10.y0 = gfVar;
                                        ijVar10.z0 = true;
                                        ijVar10.u1 = true;
                                        ijVar10.U2 = Boolean.TRUE;
                                        arrayList2.add(ijVar10);
                                        if (ijVar9 == null && !TextUtils.isEmpty(tL_message.message)) {
                                            ijVar9 = ijVar10;
                                        }
                                        i19 = i28;
                                        z17 = true;
                                        z10 = true;
                                    }
                                    i24 = i25 + 1;
                                    min = i27;
                                    selectedPhotos = hashMap;
                                    selectedPhotosOrder = arrayList;
                                    nextLong = j3;
                                }
                                i20 = i23 + 1;
                                ceil = i22;
                                ciVar2 = ciVar3;
                                cnVar = cnVar7;
                            }
                            z9 = z17;
                            ijVar3 = ijVar9;
                        }
                        cnVar2 = cnVar;
                        ciVar = ciVar2;
                        z11 = z9;
                        ijVar4 = ijVar3;
                    } else {
                        if (uhVar2 == ciVar2.e2) {
                            if (TextUtils.isEmpty(ciVar2.a1().getText())) {
                                str2 = "";
                                i14 = 0;
                                z16 = false;
                            } else {
                                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                                tL_message2.id = 0;
                                tL_message2.out = true;
                                str2 = "";
                                tL_message2.from_id = org.telegram.messenger.qp.s1(i17).z1(org.telegram.messenger.p10.i(i17).e());
                                tL_message2.peer_id = org.telegram.messenger.qp.s1(i17).z1(j13);
                                CharSequence[] charSequenceArr2 = {ciVar2.a1().getText()};
                                org.telegram.messenger.ij.d(charSequenceArr2[0], true);
                                tL_message2.entities = org.telegram.messenger.ui.b0(i17).W(charSequenceArr2, true, true);
                                tL_message2.message = charSequenceArr2[0].toString();
                                org.telegram.messenger.ij ijVar11 = new org.telegram.messenger.ij(i17, tL_message2, true, false);
                                ijVar11.z0 = true;
                                ijVar11.u1 = true;
                                ijVar11.U2 = Boolean.TRUE;
                                arrayList2.add(ijVar11);
                                i14 = 1;
                                z16 = true;
                            }
                            ArrayList<TLRPC.User> selected = ciVar2.e2.getSelected();
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
                                tL_message3.from_id = org.telegram.messenger.qp.s1(i17).z1(org.telegram.messenger.p10.i(i17).e());
                                tL_message3.peer_id = org.telegram.messenger.qp.s1(i17).z1(j13);
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
                                org.telegram.messenger.ij ijVar12 = new org.telegram.messenger.ij(i17, tL_message3, true, false);
                                ijVar12.z0 = true;
                                ijVar12.u1 = true;
                                ijVar12.U2 = Boolean.TRUE;
                                arrayList2.add(ijVar12);
                                i32 = i34 + 1;
                                selected = arrayList3;
                                i14 = i33;
                                context2 = context3;
                                z16 = true;
                            }
                            context = context2;
                            f2Var = f2Var3;
                            khVar = khVar3;
                            z10 = z16;
                            cnVar2 = cnVar;
                            ciVar = ciVar2;
                            ijVar4 = null;
                        } else {
                            context = context2;
                            if (uhVar2 == ciVar2.j2) {
                                boolean z19 = false;
                                int i35 = 0;
                                int i36 = 0;
                                org.telegram.messenger.ij ijVar13 = null;
                                while (i35 < ciVar2.j2.S.size()) {
                                    String str5 = (String) ciVar2.j2.S.get(i35);
                                    if (str5 != null) {
                                        int lastIndexOf = str5.lastIndexOf(File.separator);
                                        String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                                        if (!TextUtils.isEmpty(substring)) {
                                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                            int i37 = i36 + 1;
                                            tL_message4.id = i36;
                                            tL_message4.out = true;
                                            f2Var2 = f2Var3;
                                            khVar2 = khVar3;
                                            tL_message4.from_id = org.telegram.messenger.qp.s1(i17).z1(org.telegram.messenger.p10.i(i17).e());
                                            tL_message4.peer_id = org.telegram.messenger.qp.s1(i17).z1(j13);
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
                                                z14 = true;
                                                z15 = false;
                                                CharSequence[] charSequenceArr3 = {ciVar2.a1().getText()};
                                                tL_message4.entities = org.telegram.messenger.ui.b0(i17).W(charSequenceArr3, true, true);
                                                tL_message4.message = charSequenceArr3[0].toString();
                                            } else {
                                                z14 = true;
                                                z15 = false;
                                            }
                                            org.telegram.messenger.ij ijVar14 = new org.telegram.messenger.ij(i17, tL_message4, z14, z15);
                                            ijVar14.w0 = z14;
                                            ijVar14.z0 = z14;
                                            ijVar14.u1 = z14;
                                            ijVar14.U2 = Boolean.TRUE;
                                            arrayList2.add(ijVar14);
                                            if (i13 == 0 && ijVar13 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                                ijVar13 = ijVar14;
                                            }
                                            i36 = i37;
                                            z19 = true;
                                            i35 = i13 + 1;
                                            f2Var3 = f2Var2;
                                            khVar3 = khVar2;
                                        }
                                    }
                                    f2Var2 = f2Var3;
                                    khVar2 = khVar3;
                                    i13 = i35;
                                    i35 = i13 + 1;
                                    f2Var3 = f2Var2;
                                    khVar3 = khVar2;
                                }
                                f2Var = f2Var3;
                                khVar = khVar3;
                                z10 = z19;
                                cnVar2 = cnVar;
                                ciVar = ciVar2;
                                ijVar4 = ijVar13;
                            } else {
                                f2Var = f2Var3;
                                khVar = khVar3;
                                org.telegram.ui.Components.mi miVar = ciVar2.f2;
                                if (uhVar2 == miVar) {
                                    arrayList2.addAll(miVar.getSelected());
                                    if (!arrayList2.isEmpty()) {
                                        org.telegram.messenger.ij ijVar15 = (org.telegram.messenger.ij) arrayList2.get(0);
                                        CharSequence[] charSequenceArr4 = {ciVar2.a1().getText()};
                                        org.telegram.messenger.ij.d(charSequenceArr4[0], true);
                                        ijVar15.k.entities = org.telegram.messenger.ui.b0(i17).W(charSequenceArr4, true, true);
                                        ijVar15.k.message = charSequenceArr4[0].toString();
                                        if (!TextUtils.isEmpty(ijVar15.k.message)) {
                                            ijVar15.k0();
                                            ijVar5 = ijVar15;
                                            if (arrayList2.size() > 1) {
                                                for (int i38 = 0; i38 < Math.ceil(arrayList2.size() / 10.0f); i38++) {
                                                    int i39 = i38 * 10;
                                                    int min2 = Math.min(10, arrayList2.size() - i39);
                                                    long nextLong2 = Utilities.b.nextLong();
                                                    for (int i40 = 0; i40 < min2; i40++) {
                                                        int i41 = i39 + i40;
                                                        if (i41 < arrayList2.size()) {
                                                            ((org.telegram.messenger.ij) arrayList2.get(i41)).k.grouped_id = nextLong2;
                                                        }
                                                    }
                                                }
                                            }
                                            cnVar2 = cnVar;
                                            ciVar = ciVar2;
                                            ijVar4 = ijVar5;
                                            z11 = false;
                                            z10 = true;
                                        }
                                    }
                                    ijVar5 = null;
                                    if (arrayList2.size() > 1) {
                                    }
                                    cnVar2 = cnVar;
                                    ciVar = ciVar2;
                                    ijVar4 = ijVar5;
                                    z11 = false;
                                    z10 = true;
                                } else {
                                    cnVar2 = cnVar;
                                    ciVar = ciVar2;
                                    ijVar4 = null;
                                    z11 = false;
                                    z10 = false;
                                }
                            }
                        }
                        z11 = false;
                    }
                    if (!arrayList2.isEmpty()) {
                        org.telegram.ui.Components.ci ciVar4 = ciVar;
                        org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(ciVar4.b, h6Var2, khVar);
                        if (ijVar4 == null || !((uhVar = ciVar4.v2) == chatAttachAlertPhotoLayout || uhVar == ciVar4.k2)) {
                            h6Var = h6Var2;
                            j10 = j13;
                            r62 = 0;
                        } else {
                            r62 = 0;
                            r62 = 0;
                            h6Var = h6Var2;
                            j10 = j13;
                            org.telegram.ui.Components.ha0 ha0Var = new org.telegram.ui.Components.ha0(context, R.raw.position_below, org.telegram.messenger.id.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.id.M0(2131752559, null), h6Var);
                            TLRPC.Message message = ijVar4.k;
                            boolean z20 = ciVar4.W1;
                            message.invert_media = z20;
                            ha0Var.a(!z20, false);
                            ha0Var.setOnClickListener(new ah.g(ciVar4, ijVar4, ha0Var, 21));
                            F.q(ha0Var);
                            if (ciVar4.E3 == null) {
                                F.k();
                            }
                        }
                        boolean B = org.telegram.messenger.t10.B(a22);
                        if (ciVar4.E3 == null) {
                            cn cnVar8 = cnVar2;
                            if ((cnVar2 == null || !org.telegram.messenger.t3.p0(cnVar8.e)) && ((cnVar8 != null && cnVar8.S6()) || ciVar4.v2.c())) {
                                j11 = j10;
                                cnVar3 = cnVar8;
                                F.c(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(B ? 2131745514 : 2131745859, r62), new bi.d3(ciVar4, j11, h6Var, 21), false);
                            } else {
                                j11 = j10;
                                cnVar3 = cnVar8;
                            }
                        } else {
                            j11 = j10;
                            cnVar3 = cnVar2;
                        }
                        org.telegram.ui.Components.uh uhVar3 = ciVar4.v2;
                        if ((uhVar3 == chatAttachAlertPhotoLayout || uhVar3 == ciVar4.k2) && uhVar3.getSelectedItemsCount() == 1 && cnVar3 != null && org.telegram.messenger.t3.p0(cnVar3.e)) {
                            cnVar4 = cnVar3;
                            j12 = j11;
                            F.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.id.M0(2131747069, r62), new bi.w2(ciVar4, j11, cnVar4, h6Var, 16), false);
                        } else {
                            cnVar4 = cnVar3;
                            j12 = j11;
                        }
                        if (ciVar4.E3 == null && !B) {
                            F.c(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745583, r62), new org.telegram.ui.Components.pg(ciVar4, i18), false);
                        }
                        if (ciVar4.E3 == null && z11 && cnVar4 != null && org.telegram.messenger.t3.V(cnVar4.e) && (chatFull = cnVar4.p8) != null && chatFull.paid_media_allowed) {
                            F.c(R.drawable.menu_feature_paid, org.telegram.messenger.id.M0(2131747730, r62), r62, false);
                            org.telegram.ui.ActionBar.z0 y10 = F.y();
                            y10.setOnClickListener(new di.v3(ciVar4, context, y10, h6Var, 12));
                            long starsPrice = chatAttachAlertPhotoLayout.getStarsPrice();
                            if (starsPrice > 0) {
                                y10.setText(org.telegram.messenger.id.M0(2131747728, r62));
                                y10.setSubtext(org.telegram.messenger.id.G((int) starsPrice, "Stars", new Object[0]));
                            } else {
                                y10.setText(org.telegram.messenger.id.M0(2131747730, r62));
                                y10.setSubtext(r62);
                            }
                            ciVar4.b2.r(starsPrice);
                        }
                        F.Y();
                        ciVar4.b2.o(F);
                        ciVar4.b2.p(arrayList2);
                        if (ciVar4.E3 == null && j12 >= 0 && z10) {
                            ciVar4.b2.c(f2Var);
                            ciVar4.b2.n(ciVar4.K2);
                        }
                        ciVar4.b2.show();
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

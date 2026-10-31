package org.telegram.ui;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.KeyEvent;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:243|244|245|246|(6:(4:248|249|250|(13:252|253|254|255|256|257|258|259|260|261|262|263|264))(1:333)|260|261|262|263|264)|319|320|321|322|259) */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04b7, code lost:
    
        if (r1 != null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04b9, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04bf, code lost:
    
        org.telegram.messenger.f8.g(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04f2, code lost:
    
        if (r1 != null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x04cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04d0, code lost:
    
        r40 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x04cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x048c, code lost:
    
        r1 = r0;
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x048e, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0509 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence, java.lang.Runnable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        TLRPC.User Z1;
        un unVar;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        org.telegram.ui.ActionBar.k2 k2Var;
        org.telegram.ui.Components.ih ihVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        Context context;
        org.telegram.messenger.jj jjVar3;
        boolean z10;
        boolean z11;
        un unVar2;
        org.telegram.ui.Components.bi biVar;
        boolean z12;
        boolean z13;
        HashMap<Object, Object> hashMap;
        ArrayList<Object> arrayList;
        int i10;
        long j10;
        int i11;
        int i12;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        ParcelFileDescriptor parcelFileDescriptor;
        int i13;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor2;
        boolean z14;
        Throwable th3;
        boolean z15;
        MediaMetadataRetriever mediaMetadataRetriever3;
        ParcelFileDescriptor parcelFileDescriptor3;
        String str;
        org.telegram.ui.ActionBar.p6 p6Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        ?? r52;
        long j11;
        long j12;
        un unVar3;
        un unVar4;
        long j13;
        TLRPC.ChatFull chatFull;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3;
        boolean z16;
        boolean z17;
        int i14;
        boolean z18;
        int i15 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i16 = 1;
        switch (i15) {
            case 0:
                un unVar5 = (un) obj4;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj3;
                org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) obj2;
                jn jnVar = (jn) obj;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (unVar5.getParentActivity() == null || (!(unVar5.c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null)) {
                    return false;
                }
                unVar5.pa(null, tL_inlineButtonTypeUrl.url, true, null, jjVar4);
                try {
                    jnVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.Components.bi biVar2 = (org.telegram.ui.Components.bi) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj2;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                org.telegram.ui.Components.ih ihVar2 = biVar2.C2;
                org.telegram.ui.ActionBar.k2 k2Var3 = biVar2.W1;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout4 = biVar2.a2;
                int i17 = biVar2.D3;
                long j14 = biVar2.Q1;
                if ((j14 != 0 || (k2Var3 instanceof un)) && biVar2.B1 - biVar2.C1 >= 0 && !biVar2.n1.f) {
                    if (k2Var3 instanceof un) {
                        un unVar6 = (un) k2Var3;
                        TLRPC.User j15 = unVar6.j();
                        org.telegram.messenger.jj jjVar5 = unVar6.D5;
                        org.telegram.messenger.jj jjVar6 = unVar6.A5;
                        if (!unVar6.c() && unVar6.f4 != 5) {
                            jjVar = jjVar5;
                            jjVar2 = jjVar6;
                            j14 = unVar6.a();
                            Z1 = j15;
                            unVar = unVar6;
                        }
                    } else {
                        Z1 = org.telegram.messenger.vp.r1(i17).Z1(Long.valueOf(j14));
                        unVar = null;
                        jjVar = null;
                        jjVar2 = null;
                    }
                    org.telegram.ui.Components.pe peVar = biVar2.Y1;
                    if (peVar != null) {
                        peVar.dismiss();
                    }
                    org.telegram.ui.Components.pe peVar2 = new org.telegram.ui.Components.pe(biVar2, context2, p6Var2, i16);
                    biVar2.Y1 = peVar2;
                    peVar2.q(ihVar2, false, new ag.i(biVar2, k2Var2, p6Var2, 10));
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.Components.uh uhVar = biVar2.s2;
                    int i18 = 2;
                    String str2 = "";
                    if (uhVar == chatAttachAlertPhotoLayout4 || uhVar == biVar2.h2) {
                        k2Var = k2Var2;
                        ihVar = ihVar2;
                        chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout4;
                        context = context2;
                        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                        ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                        if (selectedPhotos.isEmpty()) {
                            jjVar3 = null;
                            z10 = false;
                            z11 = false;
                        } else {
                            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                            int i19 = 0;
                            int i20 = 0;
                            z10 = false;
                            z11 = false;
                            org.telegram.messenger.jj jjVar7 = null;
                            while (i20 < ceil) {
                                int i21 = i20 * 10;
                                int i22 = ceil;
                                int i23 = i20;
                                int min = Math.min(10, selectedPhotos.size() - i21);
                                un unVar7 = unVar;
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
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i26));
                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                        int i28 = i19 + 1;
                                        tL_message.id = i19;
                                        hashMap = selectedPhotos;
                                        tL_message.out = true;
                                        arrayList = selectedPhotosOrder;
                                        tL_message.from_id = org.telegram.messenger.vp.r1(i17).y1(org.telegram.messenger.d20.i(i17).e());
                                        tL_message.peer_id = org.telegram.messenger.vp.r1(i17).y1(j14);
                                        boolean z19 = efVar.b;
                                        String str3 = efVar.I;
                                        if (!z19 && (str = efVar.h) != null) {
                                            tL_message.attachPath = str;
                                        } else if (str3 != null) {
                                            tL_message.attachPath = str3;
                                        }
                                        if (i27 > 0) {
                                            tL_message.grouped_id = nextLong;
                                        }
                                        int i29 = efVar.F;
                                        int i30 = efVar.G;
                                        int i31 = efVar.J;
                                        if (z19) {
                                            i10 = i30;
                                            if (efVar.Q == -1) {
                                                try {
                                                    mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                                    try {
                                                        try {
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                            break;
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        j10 = nextLong;
                                                    }
                                                    try {
                                                        try {
                                                            if (efVar.d()) {
                                                                j10 = nextLong;
                                                                try {
                                                                    if (efVar.m > 0) {
                                                                        File file = new File(str3);
                                                                        parcelFileDescriptor = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                                                                        try {
                                                                            parcelFileDescriptor3 = parcelFileDescriptor;
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            parcelFileDescriptor3 = parcelFileDescriptor;
                                                                        }
                                                                        try {
                                                                            mediaMetadataRetriever2.setDataSource(parcelFileDescriptor.getFileDescriptor(), efVar.m, file.length() - efVar.m);
                                                                            mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                                            parcelFileDescriptor = parcelFileDescriptor3;
                                                                            efVar.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                                            mediaMetadataRetriever3.release();
                                                                            z15 = true;
                                                                            break;
                                                                        } catch (Exception e10) {
                                                                            e = e10;
                                                                            parcelFileDescriptor = parcelFileDescriptor3;
                                                                            i13 = 0;
                                                                            try {
                                                                                efVar.Q = i13;
                                                                                z15 = true;
                                                                                org.telegram.messenger.f8.g(e, true);
                                                                                if (mediaMetadataRetriever2 != null) {
                                                                                }
                                                                            } catch (Throwable th6) {
                                                                                th3 = th6;
                                                                                parcelFileDescriptor2 = parcelFileDescriptor;
                                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                                th2 = th3;
                                                                                if (mediaMetadataRetriever != null) {
                                                                                    try {
                                                                                        mediaMetadataRetriever.release();
                                                                                    } catch (IOException e11) {
                                                                                        z14 = true;
                                                                                        org.telegram.messenger.f8.g(e11, true);
                                                                                        if (parcelFileDescriptor2 == null) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z14 = true;
                                                                                if (parcelFileDescriptor2 == null) {
                                                                                    throw th2;
                                                                                }
                                                                                try {
                                                                                    parcelFileDescriptor2.close();
                                                                                    throw th2;
                                                                                } catch (IOException e12) {
                                                                                    org.telegram.messenger.f8.g(e12, z14);
                                                                                    throw th2;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            th2 = th;
                                                                            parcelFileDescriptor2 = parcelFileDescriptor3;
                                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                            if (mediaMetadataRetriever != null) {
                                                                            }
                                                                            z14 = true;
                                                                            if (parcelFileDescriptor2 == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    parcelFileDescriptor = null;
                                                                    i13 = 0;
                                                                    efVar.Q = i13;
                                                                    z15 = true;
                                                                    org.telegram.messenger.f8.g(e, true);
                                                                    if (mediaMetadataRetriever2 != null) {
                                                                        try {
                                                                            mediaMetadataRetriever2.release();
                                                                            break;
                                                                        } catch (IOException e14) {
                                                                            org.telegram.messenger.f8.g(e14, true);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                j10 = nextLong;
                                                            }
                                                            mediaMetadataRetriever3.release();
                                                            z15 = true;
                                                        } catch (IOException e15) {
                                                            z15 = true;
                                                            org.telegram.messenger.f8.g(e15, true);
                                                            break;
                                                        }
                                                        efVar.Q = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(24));
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i13 = 0;
                                                        efVar.Q = i13;
                                                        z15 = true;
                                                        org.telegram.messenger.f8.g(e, true);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                    } catch (Throwable th8) {
                                                        th3 = th8;
                                                        parcelFileDescriptor2 = parcelFileDescriptor;
                                                        mediaMetadataRetriever = mediaMetadataRetriever3;
                                                        th2 = th3;
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        z14 = true;
                                                        if (parcelFileDescriptor2 == null) {
                                                        }
                                                    }
                                                    mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                    mediaMetadataRetriever3.setDataSource(str3);
                                                    parcelFileDescriptor = null;
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    j10 = nextLong;
                                                    parcelFileDescriptor = null;
                                                    i13 = 0;
                                                    mediaMetadataRetriever2 = null;
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                    mediaMetadataRetriever = null;
                                                    break;
                                                }
                                            } else {
                                                j10 = nextLong;
                                            }
                                            i31 = efVar.Q;
                                        } else {
                                            i10 = i30;
                                            j10 = nextLong;
                                        }
                                        if ((i31 / 90) % 2 != 0) {
                                            i12 = i29;
                                            i11 = i10;
                                        } else {
                                            i11 = i29;
                                            i12 = i10;
                                        }
                                        if (efVar.d()) {
                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                            tL_message.media = tL_messageMediaPhoto;
                                            tL_messageMediaPhoto.live_photo = true;
                                            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                            tL_photoSize.w = i11;
                                            tL_photoSize.h = i12;
                                            tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                            tL_message.media.photo.sizes.add(tL_photoSize);
                                            tL_message.media.document = new TLRPC.TL_document();
                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo.w = i11;
                                            tL_documentAttributeVideo.h = i12;
                                            tL_documentAttributeVideo.duration = efVar.E;
                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                        } else if (efVar.b) {
                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                            tL_message.media = tL_messageMediaDocument;
                                            tL_messageMediaDocument.document = new TLRPC.TL_document();
                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo2.w = i11;
                                            tL_documentAttributeVideo2.h = i12;
                                            tL_documentAttributeVideo2.duration = efVar.E;
                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                                        } else {
                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                            tL_message.media = tL_messageMediaPhoto2;
                                            tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                            TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                            tL_photoSize2.w = i11;
                                            tL_photoSize2.h = i12;
                                            tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                            tL_message.media.photo.sizes.add(tL_photoSize2);
                                        }
                                        tL_message.media.spoiler = efVar.M;
                                        CharSequence charSequence = efVar.a;
                                        String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                        tL_message.message = charSequence2;
                                        if (TextUtils.isEmpty(charSequence2) && i23 == 0 && i25 == 0) {
                                            CharSequence[] charSequenceArr = {biVar3.Z0().getText()};
                                            org.telegram.messenger.jj.d(charSequenceArr[0], true);
                                            tL_message.entities = org.telegram.messenger.ui.b0(i17).W(charSequenceArr, true, true);
                                            tL_message.message = charSequenceArr[0].toString();
                                        }
                                        if (i23 == 0 && jjVar != null && !jjVar.p) {
                                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                            if (jjVar2 != null) {
                                                tL_messageReplyHeader.flags |= 2;
                                                tL_messageReplyHeader.reply_to_top_id = jjVar2.f1();
                                            }
                                            tL_messageReplyHeader.flags |= 16;
                                            tL_messageReplyHeader.reply_to_msg_id = jjVar.f1();
                                            tL_message.reply_to = tL_messageReplyHeader;
                                        }
                                        org.telegram.messenger.jj jjVar8 = new org.telegram.messenger.jj(i17, tL_message, true, false);
                                        if (i23 == 0 && jjVar != null && !jjVar.p) {
                                            jjVar8.C = jjVar;
                                        }
                                        jjVar8.y0 = efVar;
                                        jjVar8.z0 = true;
                                        jjVar8.u1 = true;
                                        jjVar8.R2 = Boolean.TRUE;
                                        arrayList2.add(jjVar8);
                                        if (jjVar7 == null && !TextUtils.isEmpty(tL_message.message)) {
                                            jjVar7 = jjVar8;
                                        }
                                        i19 = i28;
                                        z10 = true;
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
                                unVar = unVar7;
                            }
                            jjVar3 = jjVar7;
                        }
                        unVar2 = unVar;
                        biVar = biVar2;
                        z12 = z10;
                        z13 = z11;
                    } else if (uhVar == biVar2.b2) {
                        if (TextUtils.isEmpty(biVar2.Z0().getText())) {
                            i14 = 0;
                            z18 = false;
                        } else {
                            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                            tL_message2.id = 0;
                            tL_message2.out = true;
                            tL_message2.from_id = org.telegram.messenger.vp.r1(i17).y1(org.telegram.messenger.d20.i(i17).e());
                            tL_message2.peer_id = org.telegram.messenger.vp.r1(i17).y1(j14);
                            CharSequence[] charSequenceArr2 = {biVar2.Z0().getText()};
                            org.telegram.messenger.jj.d(charSequenceArr2[0], true);
                            tL_message2.entities = org.telegram.messenger.ui.b0(i17).W(charSequenceArr2, true, true);
                            tL_message2.message = charSequenceArr2[0].toString();
                            org.telegram.messenger.jj jjVar9 = new org.telegram.messenger.jj(i17, tL_message2, true, false);
                            jjVar9.z0 = true;
                            jjVar9.u1 = true;
                            jjVar9.R2 = Boolean.TRUE;
                            arrayList2 = arrayList2;
                            arrayList2.add(jjVar9);
                            i14 = 1;
                            z18 = true;
                        }
                        ArrayList<TLRPC.User> selected = biVar2.b2.getSelected();
                        z13 = z18;
                        int i32 = 0;
                        while (i32 < selected.size()) {
                            TLRPC.User user = selected.get(i32);
                            Context context3 = context2;
                            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                            int i33 = i14 + 1;
                            tL_message3.id = i14;
                            ArrayList<TLRPC.User> arrayList3 = selected;
                            tL_message3.out = true;
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var2;
                            org.telegram.ui.Components.ih ihVar3 = ihVar2;
                            tL_message3.from_id = org.telegram.messenger.vp.r1(i17).y1(org.telegram.messenger.d20.i(i17).e());
                            tL_message3.peer_id = org.telegram.messenger.vp.r1(i17).y1(j14);
                            TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                            tL_message3.media = tL_messageMediaContact;
                            tL_messageMediaContact.phone_number = user.phone;
                            tL_messageMediaContact.first_name = user.first_name;
                            tL_messageMediaContact.last_name = user.last_name;
                            if (user.restriction_reason.isEmpty() || !user.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                                tL_message3.media.vcard = str2;
                            } else {
                                tL_message3.media.vcard = user.restriction_reason.get(0).text;
                            }
                            selected = arrayList3;
                            tL_message3.media.user_id = user.id;
                            org.telegram.messenger.jj jjVar10 = new org.telegram.messenger.jj(i17, tL_message3, true, false);
                            jjVar10.z0 = true;
                            jjVar10.u1 = true;
                            jjVar10.R2 = Boolean.TRUE;
                            arrayList2.add(jjVar10);
                            i32++;
                            str2 = str2;
                            i14 = i33;
                            context2 = context3;
                            k2Var2 = k2Var4;
                            ihVar2 = ihVar3;
                            z13 = true;
                        }
                        k2Var = k2Var2;
                        ihVar = ihVar2;
                        context = context2;
                        chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout4;
                        unVar2 = unVar;
                        biVar = biVar2;
                        z12 = false;
                        jjVar3 = null;
                    } else {
                        k2Var = k2Var2;
                        ihVar = ihVar2;
                        context = context2;
                        if (uhVar == biVar2.g2) {
                            boolean z20 = false;
                            int i34 = 0;
                            int i35 = 0;
                            jjVar3 = null;
                            while (i34 < biVar2.g2.S.size()) {
                                String str4 = (String) biVar2.g2.S.get(i34);
                                if (str4 != null) {
                                    int lastIndexOf = str4.lastIndexOf(File.separator);
                                    String substring = lastIndexOf < 0 ? str4 : str4.substring(lastIndexOf + 1);
                                    if (!TextUtils.isEmpty(substring)) {
                                        TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                        int i36 = i35 + 1;
                                        tL_message4.id = i35;
                                        tL_message4.out = true;
                                        org.telegram.messenger.jj jjVar11 = jjVar3;
                                        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout4;
                                        tL_message4.from_id = org.telegram.messenger.vp.r1(i17).y1(org.telegram.messenger.d20.i(i17).e());
                                        tL_message4.peer_id = org.telegram.messenger.vp.r1(i17).y1(j14);
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                                        tL_message4.media = tL_messageMediaDocument2;
                                        tL_message4.attachPath = str4;
                                        tL_messageMediaDocument2.document = new TLRPC.TL_document();
                                        TLRPC.Document document = tL_message4.media.document;
                                        document.file_name = substring;
                                        document.size = new File(str4).length();
                                        if (TextUtils.isEmpty(tL_message4.message) && i34 == 0) {
                                            z16 = true;
                                            z17 = false;
                                            CharSequence[] charSequenceArr3 = {biVar2.Z0().getText()};
                                            tL_message4.entities = org.telegram.messenger.ui.b0(i17).W(charSequenceArr3, true, true);
                                            tL_message4.message = charSequenceArr3[0].toString();
                                        } else {
                                            z16 = true;
                                            z17 = false;
                                        }
                                        org.telegram.messenger.jj jjVar12 = new org.telegram.messenger.jj(i17, tL_message4, z16, z17);
                                        jjVar12.w0 = z16;
                                        jjVar12.z0 = z16;
                                        jjVar12.u1 = z16;
                                        jjVar12.R2 = Boolean.TRUE;
                                        arrayList2.add(jjVar12);
                                        if (i34 == 0 && jjVar11 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                            jjVar3 = jjVar12;
                                            i35 = i36;
                                        } else {
                                            i35 = i36;
                                            jjVar3 = jjVar11;
                                        }
                                        z20 = true;
                                        i34++;
                                        chatAttachAlertPhotoLayout4 = chatAttachAlertPhotoLayout3;
                                    }
                                }
                                chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout4;
                                i34++;
                                chatAttachAlertPhotoLayout4 = chatAttachAlertPhotoLayout3;
                            }
                            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout4;
                            unVar2 = unVar;
                            biVar = biVar2;
                            z13 = z20;
                            z12 = false;
                        } else {
                            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout4;
                            org.telegram.ui.Components.mi miVar = biVar2.c2;
                            if (uhVar == miVar) {
                                arrayList2.addAll(miVar.getSelected());
                                if (!arrayList2.isEmpty()) {
                                    org.telegram.messenger.jj jjVar13 = (org.telegram.messenger.jj) arrayList2.get(0);
                                    CharSequence[] charSequenceArr4 = {biVar2.Z0().getText()};
                                    org.telegram.messenger.jj.d(charSequenceArr4[0], true);
                                    jjVar13.k.entities = org.telegram.messenger.ui.b0(i17).W(charSequenceArr4, true, true);
                                    jjVar13.k.message = charSequenceArr4[0].toString();
                                    if (!TextUtils.isEmpty(jjVar13.k.message)) {
                                        jjVar13.k0();
                                        jjVar3 = jjVar13;
                                        if (arrayList2.size() > 1) {
                                            for (int i37 = 0; i37 < Math.ceil(arrayList2.size() / 10.0f); i37++) {
                                                int i38 = i37 * 10;
                                                int min2 = Math.min(10, arrayList2.size() - i38);
                                                long nextLong2 = Utilities.b.nextLong();
                                                for (int i39 = 0; i39 < min2; i39++) {
                                                    int i40 = i38 + i39;
                                                    if (i40 < arrayList2.size()) {
                                                        ((org.telegram.messenger.jj) arrayList2.get(i40)).k.grouped_id = nextLong2;
                                                    }
                                                }
                                            }
                                        }
                                        unVar2 = unVar;
                                        biVar = biVar2;
                                        z12 = false;
                                        z13 = true;
                                    }
                                }
                                jjVar3 = null;
                                if (arrayList2.size() > 1) {
                                }
                                unVar2 = unVar;
                                biVar = biVar2;
                                z12 = false;
                                z13 = true;
                            } else {
                                unVar2 = unVar;
                                biVar = biVar2;
                                z12 = false;
                                jjVar3 = null;
                                z13 = false;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        org.telegram.ui.Components.bi biVar4 = biVar;
                        org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(biVar4.b, p6Var2, ihVar);
                        if (jjVar3 != null) {
                            org.telegram.ui.Components.uh uhVar2 = biVar4.s2;
                            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                            if (uhVar2 == chatAttachAlertPhotoLayout2 || uhVar2 == biVar4.h2) {
                                r52 = 0;
                                r52 = 0;
                                p6Var = p6Var2;
                                j11 = j14;
                                org.telegram.ui.Components.za0 za0Var = new org.telegram.ui.Components.za0(context, R.raw.position_below, org.telegram.messenger.cd.L0(2131752560, null), R.raw.position_above, org.telegram.messenger.cd.L0(2131752559, null), p6Var);
                                TLRPC.Message message = jjVar3.k;
                                boolean z21 = biVar4.T1;
                                message.invert_media = z21;
                                za0Var.a(!z21, false);
                                za0Var.setOnClickListener(new ag.i(biVar4, jjVar3, za0Var, 11));
                                F.q(za0Var);
                                if (biVar4.B3 == null) {
                                    F.k();
                                }
                            } else {
                                p6Var = p6Var2;
                                j11 = j14;
                                r52 = 0;
                            }
                        } else {
                            p6Var = p6Var2;
                            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                            r52 = 0;
                            j11 = j14;
                        }
                        boolean B = org.telegram.messenger.h20.B(Z1);
                        if (biVar4.B3 == null) {
                            un unVar8 = unVar2;
                            if ((unVar2 == null || !org.telegram.messenger.w3.p0(unVar8.e)) && ((unVar8 != null && unVar8.L6()) || biVar4.s2.c())) {
                                unVar3 = unVar8;
                                j12 = j11;
                                F.c(R.drawable.msg_calendar2, org.telegram.messenger.cd.L0(B ? 2131745531 : 2131745876, r52), new a3.i0(biVar4, j12, p6Var, 12), false);
                            } else {
                                unVar3 = unVar8;
                                j12 = j11;
                            }
                        } else {
                            j12 = j11;
                            unVar3 = unVar2;
                        }
                        org.telegram.ui.Components.uh uhVar3 = biVar4.s2;
                        if ((uhVar3 == chatAttachAlertPhotoLayout2 || uhVar3 == biVar4.h2) && uhVar3.getSelectedItemsCount() == 1 && unVar3 != null && org.telegram.messenger.w3.p0(unVar3.e)) {
                            unVar4 = unVar3;
                            j13 = j12;
                            F.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.cd.L0(2131747084, r52), new ag.a3(biVar4, j12, unVar4, p6Var, 4), false);
                        } else {
                            unVar4 = unVar3;
                            j13 = j12;
                        }
                        if (biVar4.B3 == null && !B) {
                            F.c(R.drawable.input_notify_off, org.telegram.messenger.cd.L0(2131745600, r52), new org.telegram.ui.Components.mg(biVar4, i18), false);
                        }
                        if (biVar4.B3 == null && z12 && unVar4 != null && org.telegram.messenger.w3.V(unVar4.e) && (chatFull = unVar4.p8) != null && chatFull.paid_media_allowed) {
                            F.c(R.drawable.menu_feature_paid, org.telegram.messenger.cd.L0(2131747746, r52), r52, false);
                            org.telegram.ui.ActionBar.b1 y3 = F.y();
                            y3.setOnClickListener(new org.telegram.messenger.video.h((KeyEvent.Callback) biVar4, context, (KeyEvent.Callback) y3, (Object) p6Var, 8));
                            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
                            if (starsPrice > 0) {
                                y3.setText(org.telegram.messenger.cd.L0(2131747744, r52));
                                y3.setSubtext(org.telegram.messenger.cd.G((int) starsPrice, "Stars", new Object[0]));
                            } else {
                                y3.setText(org.telegram.messenger.cd.L0(2131747746, r52));
                                y3.setSubtext(r52);
                            }
                            biVar4.Y1.r(starsPrice);
                        }
                        F.Y();
                        biVar4.Y1.o(F);
                        biVar4.Y1.p(arrayList2);
                        if (biVar4.B3 == null && j13 >= 0 && z13) {
                            biVar4.Y1.c(k2Var);
                            biVar4.Y1.n(biVar4.H2);
                        }
                        biVar4.Y1.show();
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

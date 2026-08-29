package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ r1(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.e = activity;
        this.b = i10;
        this.c = inputGroupCall;
        this.d = z10;
        this.f = groupCall;
        this.h = hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x00cb A[Catch: Exception -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x0051, blocks: (B:102:0x004d, B:128:0x00cb), top: B:95:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        String readRes;
        int i11;
        boolean z10;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        String extensionFromMimeType;
        final String str2;
        int i12;
        int i13;
        final int i14;
        int i15;
        final int i16;
        MediaMetadataRetriever mediaMetadataRetriever;
        int ceil;
        int i17;
        final int i18;
        final int i19;
        final int i20;
        final int i21;
        Pair<Integer, Integer> imageOrientation;
        switch (this.a) {
            case 0:
                ((ContactsController) this.e).lambda$processLoadedContacts$36(this.b, (ArrayList) this.c, (ArrayList) this.f, (a0.h) this.h, this.d);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequestMulti$65((TLObject) this.f, this.b, (SendMessagesHelper.DelayedMessage) this.h, (ArrayList) this.c, this.d);
                return;
            case 2:
                pv0 pv0Var = (pv0) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.c;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.h;
                RLottieNative[] rLottieNativeArr = pv0Var.b1;
                RLottieNative[] rLottieNativeArr2 = pv0Var.e1;
                int[] iArr = pv0Var.e;
                if (pv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new nv0(pv0Var, 0));
                    return;
                }
                boolean z11 = false;
                int i22 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i23 = this.b;
                    if (i22 >= length) {
                        if (z11) {
                            AndroidUtilities.runOnUIThread(new nv0(pv0Var, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.k0(pv0Var, this.d, i23, s1Var));
                            return;
                        }
                    }
                    if (i22 <= 2) {
                        if (rLottieNativeArr2[i22] == null) {
                            if (i22 == 0) {
                                int i24 = pv0Var.X0;
                                i10 = i24 == 1 ? 5 : i24 == 2 ? 6 : i24 == 3 ? 7 : i24 == 4 ? 4 : 3;
                            } else if (i22 == 1) {
                                int i25 = pv0Var.Y0;
                                i10 = i25 == 1 ? 11 : i25 == 2 ? 12 : i25 == 3 ? 13 : i25 == 4 ? 10 : 9;
                            } else {
                                int i26 = pv0Var.Z0;
                                i10 = i26 == 1 ? 17 : i26 == 2 ? 18 : i26 == 3 ? 19 : i26 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                            readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                RLottieNative b10 = RLottieNative.b(readRes, "dice", iArr, null, null);
                                if (i22 <= 2) {
                                    rLottieNativeArr2[i22] = b10;
                                    pv0Var.f1[i22] = iArr[0];
                                } else {
                                    rLottieNativeArr[i22 == 3 ? (char) 0 : (char) 4] = b10;
                                    pv0Var.c1[i22 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                AndroidUtilities.runOnUIThread(new ov0(document, i23, messageObject, s1Var, tL_messages_stickerSet, 0));
                                z11 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i22] == null) {
                        i10 = i22 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i10);
                        readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true), 0);
                        if (TextUtils.isEmpty(readRes)) {
                        }
                    }
                    i22++;
                }
            case 3:
                Activity activity = (Activity) this.e;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.c;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.h2.a = 0L;
                org.telegram.ui.Components.voip.h2.h(activity, this.b, inputGroupCall, this.d, groupCall, hashSet);
                return;
            case 4:
                zp0 zp0Var = (zp0) this.e;
                String str3 = (String) this.c;
                TLObject tLObject = (TLObject) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                HashMap hashMap = zp0Var.h;
                ArrayList arrayList = zp0Var.f;
                ArrayList arrayList2 = zp0Var.n;
                int size = arrayList2.size();
                int i27 = 0;
                while (true) {
                    if (i27 < size) {
                        if (((String) arrayList2.get(i27)).equalsIgnoreCase(str3)) {
                            arrayList2.remove(i27);
                        } else {
                            i27++;
                        }
                    }
                }
                arrayList2.add(0, str3);
                while (arrayList2.size() > 20) {
                    a4.w.t(1, arrayList2);
                }
                zp0Var.c0();
                if (this.b != zp0Var.y) {
                    return;
                }
                int size2 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    zp0Var.w = messages_botresults.next_offset;
                    int size3 = messages_botresults.results.size();
                    i11 = 0;
                    for (int i28 = 0; i28 < size3; i28++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i28);
                        boolean z12 = this.d;
                        if ((z12 || "photo".equals(botInlineResult.type)) && ((!z12 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            MediaController.SearchImage searchImage = new MediaController.SearchImage();
                            if (z12 && botInlineResult.document != null) {
                                for (int i29 = 0; i29 < botInlineResult.document.attributes.size(); i29++) {
                                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i29);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        searchImage.width = documentAttribute.w;
                                        searchImage.height = documentAttribute.h;
                                        searchImage.document = botInlineResult.document;
                                        searchImage.size = 0;
                                        photo2 = botInlineResult.photo;
                                        if (photo2 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, zp0Var.N, true)) != null) {
                                            botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                                            botInlineResult.document.flags |= 1;
                                        }
                                    }
                                }
                                searchImage.document = botInlineResult.document;
                                searchImage.size = 0;
                                photo2 = botInlineResult.photo;
                                if (photo2 != null) {
                                    botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                                    botInlineResult.document.flags |= 1;
                                }
                            } else if (!z12 && (photo = botInlineResult.photo) != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                if (closestPhotoSizeWithSize2 != null) {
                                    searchImage.width = closestPhotoSizeWithSize2.w;
                                    searchImage.height = closestPhotoSizeWithSize2.h;
                                    searchImage.photoSize = closestPhotoSizeWithSize2;
                                    searchImage.photo = botInlineResult.photo;
                                    searchImage.size = closestPhotoSizeWithSize2.size;
                                    searchImage.thumbPhotoSize = closestPhotoSizeWithSize3;
                                }
                            } else if (botInlineResult.content != null) {
                                int i30 = 0;
                                while (true) {
                                    if (i30 < botInlineResult.content.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i30);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute2.w;
                                            searchImage.height = documentAttribute2.h;
                                        } else {
                                            i30++;
                                        }
                                    }
                                }
                                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                if (webDocument != null) {
                                    searchImage.thumbUrl = webDocument.url;
                                } else {
                                    searchImage.thumbUrl = null;
                                }
                                TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                searchImage.imageUrl = webDocument2.url;
                                searchImage.size = z12 ? 0 : webDocument2.size;
                            }
                            searchImage.id = botInlineResult.id;
                            searchImage.type = z12 ? 1 : 0;
                            searchImage.inlineResult = botInlineResult;
                            HashMap<String, String> hashMap2 = new HashMap<>();
                            searchImage.params = hashMap2;
                            hashMap2.put("id", botInlineResult.id);
                            searchImage.params.put("query_id", "" + messages_botresults.query_id);
                            searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                            arrayList.add(searchImage);
                            hashMap.put(searchImage.id, searchImage);
                            i11++;
                        }
                    }
                    zp0Var.s = size2 == arrayList.size() || zp0Var.w == null;
                } else {
                    i11 = 0;
                }
                zp0Var.r = false;
                if (i11 != 0) {
                    zp0Var.H.s(size2, i11);
                } else if (zp0Var.s) {
                    z10 = true;
                    zp0Var.H.u(arrayList.size() - 1);
                    if (arrayList.size() > 0) {
                        zp0Var.J.e(false, z10);
                        return;
                    }
                    return;
                }
                z10 = true;
                if (arrayList.size() > 0) {
                }
                break;
            default:
                final th.p3 p3Var = (th.p3) this.e;
                Uri uri = (Uri) this.c;
                String str4 = (String) this.f;
                final th.a aVar = (th.a) this.h;
                InputStream inputStream2 = null;
                r5 = null;
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    str = null;
                }
                final boolean z13 = this.d;
                int i31 = this.b;
                if (str == null || !com.google.android.recaptcha.internal.a.v(str)) {
                    Context context = p3Var.getContext();
                    try {
                        if (context != null) {
                            try {
                                inputStream = context.getContentResolver().openInputStream(uri);
                            } catch (Exception e11) {
                                e = e11;
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                                if (inputStream2 != null) {
                                }
                                if (fileOutputStream == null) {
                                }
                            }
                            if (inputStream != null) {
                                if (str4 != null) {
                                    try {
                                        extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4);
                                    } catch (Exception e12) {
                                        e = e12;
                                        fileOutputStream = null;
                                        FileLog.e(e);
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        str = null;
                                        str2 = str;
                                        if (str2 == null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream = null;
                                        inputStream2 = inputStream;
                                        if (inputStream2 != null) {
                                        }
                                        if (fileOutputStream == null) {
                                        }
                                    }
                                } else {
                                    extensionFromMimeType = null;
                                }
                                if (TextUtils.isEmpty(extensionFromMimeType)) {
                                    extensionFromMimeType = z13 ? "mp4" : "jpg";
                                }
                                File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i31) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    try {
                                        AndroidUtilities.copyFile(inputStream, fileOutputStream);
                                        str = file.getAbsolutePath();
                                        try {
                                            inputStream.close();
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        FileLog.e(e);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        str = null;
                                        str2 = str;
                                        if (str2 == null) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStream2 = inputStream;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (Exception unused5) {
                                        throw th;
                                    }
                                }
                            } else if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                    } catch (Exception unused6) {
                    }
                    str = null;
                }
                str2 = str;
                if (str2 == null || !com.google.android.recaptcha.internal.a.v(str2)) {
                    return;
                }
                if (z13) {
                    try {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(str2);
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                            i13 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                            if (extractMetadata2 != null) {
                                try {
                                    i15 = Integer.parseInt(extractMetadata2);
                                } catch (Exception e15) {
                                    e = e15;
                                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                                    i12 = 0;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever2 != null) {
                                    }
                                    i14 = i31;
                                    i15 = i12;
                                    i16 = 0;
                                    if (z13) {
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: th.o2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            p3 p3Var2 = p3.this;
                                            p3Var2.getClass();
                                            boolean z14 = z13;
                                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str2, z14 ? i16 : 0, z14, i18, i21, 0L);
                                            photoEntry.setOrientation(i20, i19);
                                            a aVar2 = aVar;
                                            if (aVar2 == null || !p3.D3(aVar2.b)) {
                                                p3Var2.f2(photoEntry);
                                            } else {
                                                p3Var2.T1(aVar2, photoEntry);
                                            }
                                        }
                                    });
                                    return;
                                }
                            } else {
                                i15 = 0;
                            }
                            if (extractMetadata3 != null) {
                                try {
                                    ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                } catch (Exception e16) {
                                    e = e16;
                                    i12 = i15;
                                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever2 != null) {
                                        try {
                                            mediaMetadataRetriever2.release();
                                        } catch (Exception unused7) {
                                        }
                                    }
                                    i14 = i31;
                                    i15 = i12;
                                    i16 = 0;
                                    if (z13) {
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: th.o2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            p3 p3Var2 = p3.this;
                                            p3Var2.getClass();
                                            boolean z14 = z13;
                                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str2, z14 ? i16 : 0, z14, i18, i21, 0L);
                                            photoEntry.setOrientation(i20, i19);
                                            a aVar2 = aVar;
                                            if (aVar2 == null || !p3.D3(aVar2.b)) {
                                                p3Var2.f2(photoEntry);
                                            } else {
                                                p3Var2.T1(aVar2, photoEntry);
                                            }
                                        }
                                    });
                                    return;
                                }
                            } else {
                                ceil = 0;
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Exception unused8) {
                            }
                            i14 = i31;
                            i16 = ceil;
                        } catch (Throwable th6) {
                            th = th6;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            if (mediaMetadataRetriever2 != null) {
                                try {
                                    mediaMetadataRetriever2.release();
                                } catch (Exception unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        i12 = 0;
                        i13 = 0;
                        FileLog.e(e);
                        if (mediaMetadataRetriever2 != null) {
                        }
                        i14 = i31;
                        i15 = i12;
                        i16 = 0;
                        if (z13) {
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: th.o2
                            @Override // java.lang.Runnable
                            public final void run() {
                                p3 p3Var2 = p3.this;
                                p3Var2.getClass();
                                boolean z14 = z13;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str2, z14 ? i16 : 0, z14, i18, i21, 0L);
                                photoEntry.setOrientation(i20, i19);
                                a aVar2 = aVar;
                                if (aVar2 == null || !p3.D3(aVar2.b)) {
                                    p3Var2.f2(photoEntry);
                                } else {
                                    p3Var2.T1(aVar2, photoEntry);
                                }
                            }
                        });
                        return;
                    }
                } else {
                    i14 = i31;
                    i15 = 0;
                    i16 = 0;
                    i13 = 0;
                }
                if (z13) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str2, options);
                        i13 = options.outWidth;
                        i15 = options.outHeight;
                    } catch (Exception e18) {
                        FileLog.e(e18);
                    }
                    try {
                        imageOrientation = AndroidUtilities.getImageOrientation(str2);
                        i17 = ((Integer) imageOrientation.first).intValue();
                    } catch (Exception e19) {
                        e = e19;
                        i17 = 0;
                    }
                    try {
                        i19 = ((Integer) imageOrientation.second).intValue();
                        i18 = i13;
                    } catch (Exception e20) {
                        e = e20;
                        FileLog.e(e);
                        i18 = i13;
                        i19 = 0;
                        i20 = i17;
                        i21 = i15;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: th.o2
                            @Override // java.lang.Runnable
                            public final void run() {
                                p3 p3Var2 = p3.this;
                                p3Var2.getClass();
                                boolean z14 = z13;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str2, z14 ? i16 : 0, z14, i18, i21, 0L);
                                photoEntry.setOrientation(i20, i19);
                                a aVar2 = aVar;
                                if (aVar2 == null || !p3.D3(aVar2.b)) {
                                    p3Var2.f2(photoEntry);
                                } else {
                                    p3Var2.T1(aVar2, photoEntry);
                                }
                            }
                        });
                        return;
                    }
                    i20 = i17;
                    i21 = i15;
                } else {
                    i21 = i15;
                    i18 = i13;
                    i20 = 0;
                    i19 = 0;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: th.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        p3 p3Var2 = p3.this;
                        p3Var2.getClass();
                        boolean z14 = z13;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str2, z14 ? i16 : 0, z14, i18, i21, 0L);
                        photoEntry.setOrientation(i20, i19);
                        a aVar2 = aVar;
                        if (aVar2 == null || !p3.D3(aVar2.b)) {
                            p3Var2.f2(photoEntry);
                        } else {
                            p3Var2.T1(aVar2, photoEntry);
                        }
                    }
                });
                return;
        }
    }

    public /* synthetic */ r1(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.e = contactsController;
        this.b = i10;
        this.c = arrayList;
        this.f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    public /* synthetic */ r1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, int i10, SendMessagesHelper.DelayedMessage delayedMessage, ArrayList arrayList, boolean z10) {
        this.e = sendMessagesHelper;
        this.f = tLObject;
        this.b = i10;
        this.h = delayedMessage;
        this.c = arrayList;
        this.d = z10;
    }

    public /* synthetic */ r1(pv0 pv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        this.e = pv0Var;
        this.c = tL_messages_stickerSet;
        this.b = i10;
        this.f = messageObject;
        this.h = s1Var;
        this.d = z10;
    }

    public /* synthetic */ r1(zp0 zp0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.e = zp0Var;
        this.c = str;
        this.b = i10;
        this.f = tLObject;
        this.d = z10;
        this.h = user;
    }

    public /* synthetic */ r1(th.p3 p3Var, Uri uri, boolean z10, String str, int i10, th.a aVar) {
        this.e = p3Var;
        this.c = uri;
        this.d = z10;
        this.f = str;
        this.b = i10;
        this.h = aVar;
    }
}

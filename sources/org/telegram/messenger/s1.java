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
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ s1(Activity activity, int i9, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.e = activity;
        this.b = i9;
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
        int i9;
        String readRes;
        int i10;
        boolean z10;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        String extensionFromMimeType;
        final String str2;
        int i11;
        int i12;
        final int i13;
        int i14;
        final int i15;
        MediaMetadataRetriever mediaMetadataRetriever;
        int ceil;
        int i16;
        final int i17;
        final int i18;
        final int i19;
        final int i20;
        Pair<Integer, Integer> imageOrientation;
        switch (this.a) {
            case 0:
                ((ContactsController) this.e).lambda$processLoadedContacts$36(this.b, (ArrayList) this.c, (ArrayList) this.f, (a0.h) this.h, this.d);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequestMulti$65((TLObject) this.f, this.b, (SendMessagesHelper.DelayedMessage) this.h, (ArrayList) this.c, this.d);
                return;
            case 2:
                fv0 fv0Var = (fv0) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.c;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.h;
                RLottieNative[] rLottieNativeArr = fv0Var.b1;
                RLottieNative[] rLottieNativeArr2 = fv0Var.e1;
                int[] iArr = fv0Var.e;
                if (fv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new dv0(fv0Var, 0));
                    return;
                }
                boolean z11 = false;
                int i21 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i22 = this.b;
                    if (i21 >= length) {
                        if (z11) {
                            AndroidUtilities.runOnUIThread(new dv0(fv0Var, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(fv0Var, this.d, i22, t1Var));
                            return;
                        }
                    }
                    if (i21 <= 2) {
                        if (rLottieNativeArr2[i21] == null) {
                            if (i21 == 0) {
                                int i23 = fv0Var.X0;
                                i9 = i23 == 1 ? 5 : i23 == 2 ? 6 : i23 == 3 ? 7 : i23 == 4 ? 4 : 3;
                            } else if (i21 == 1) {
                                int i24 = fv0Var.Y0;
                                i9 = i24 == 1 ? 11 : i24 == 2 ? 12 : i24 == 3 ? 13 : i24 == 4 ? 10 : 9;
                            } else {
                                int i25 = fv0Var.Z0;
                                i9 = i25 == 1 ? 17 : i25 == 2 ? 18 : i25 == 3 ? 19 : i25 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i9);
                            readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                RLottieNative b10 = RLottieNative.b(readRes, "dice", iArr, null, null);
                                if (i21 <= 2) {
                                    rLottieNativeArr2[i21] = b10;
                                    fv0Var.f1[i21] = iArr[0];
                                } else {
                                    rLottieNativeArr[i21 == 3 ? (char) 0 : (char) 4] = b10;
                                    fv0Var.c1[i21 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                AndroidUtilities.runOnUIThread(new ev0(document, i22, messageObject, t1Var, tL_messages_stickerSet, 0));
                                z11 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i21] == null) {
                        i9 = i21 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i9);
                        readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true), 0);
                        if (TextUtils.isEmpty(readRes)) {
                        }
                    }
                    i21++;
                }
            case 3:
                Activity activity = (Activity) this.e;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.c;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.e2.a = 0L;
                org.telegram.ui.Components.voip.e2.h(activity, this.b, inputGroupCall, this.d, groupCall, hashSet);
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
                int i26 = 0;
                while (true) {
                    if (i26 < size) {
                        if (((String) arrayList2.get(i26)).equalsIgnoreCase(str3)) {
                            arrayList2.remove(i26);
                        } else {
                            i26++;
                        }
                    }
                }
                arrayList2.add(0, str3);
                while (arrayList2.size() > 20) {
                    aa.d.u(1, arrayList2);
                }
                zp0Var.b0();
                if (this.b != zp0Var.y) {
                    return;
                }
                int size2 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    zp0Var.w = messages_botresults.next_offset;
                    int size3 = messages_botresults.results.size();
                    i10 = 0;
                    for (int i27 = 0; i27 < size3; i27++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i27);
                        boolean z12 = this.d;
                        if ((z12 || "photo".equals(botInlineResult.type)) && ((!z12 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            MediaController.SearchImage searchImage = new MediaController.SearchImage();
                            if (z12 && botInlineResult.document != null) {
                                for (int i28 = 0; i28 < botInlineResult.document.attributes.size(); i28++) {
                                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i28);
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
                                int i29 = 0;
                                while (true) {
                                    if (i29 < botInlineResult.content.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i29);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute2.w;
                                            searchImage.height = documentAttribute2.h;
                                        } else {
                                            i29++;
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
                            i10++;
                        }
                    }
                    zp0Var.s = size2 == arrayList.size() || zp0Var.w == null;
                } else {
                    i10 = 0;
                }
                zp0Var.r = false;
                if (i10 != 0) {
                    zp0Var.H.s(size2, i10);
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
                final qh.o3 o3Var = (qh.o3) this.e;
                Uri uri = (Uri) this.c;
                String str4 = (String) this.f;
                final qh.a aVar = (qh.a) this.h;
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
                int i30 = this.b;
                if (str == null || !e2.c.w(str)) {
                    Context context = o3Var.getContext();
                    try {
                        if (context != null) {
                            try {
                                inputStream = context.getContentResolver().openInputStream(uri);
                            } catch (Exception e11) {
                                e = e11;
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th) {
                                th = th;
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
                                    } catch (Throwable th2) {
                                        th = th2;
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
                                File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i30) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
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
                                } catch (Throwable th3) {
                                    th = th3;
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
                if (str2 == null || !e2.c.w(str2)) {
                    return;
                }
                if (z13) {
                    try {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                        } catch (Throwable th4) {
                            th = th4;
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
                            i12 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                            if (extractMetadata2 != null) {
                                try {
                                    i14 = Integer.parseInt(extractMetadata2);
                                } catch (Exception e15) {
                                    e = e15;
                                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                                    i11 = 0;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever2 != null) {
                                    }
                                    i13 = i30;
                                    i14 = i11;
                                    i15 = 0;
                                    if (z13) {
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            o3 o3Var2 = o3.this;
                                            o3Var2.getClass();
                                            boolean z14 = z13;
                                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, str2, z14 ? i15 : 0, z14, i17, i20, 0L);
                                            photoEntry.setOrientation(i19, i18);
                                            a aVar2 = aVar;
                                            if (aVar2 == null || !o3.D3(aVar2.b)) {
                                                o3Var2.f2(photoEntry);
                                            } else {
                                                o3Var2.T1(aVar2, photoEntry);
                                            }
                                        }
                                    });
                                    return;
                                }
                            } else {
                                i14 = 0;
                            }
                            if (extractMetadata3 != null) {
                                try {
                                    ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                } catch (Exception e16) {
                                    e = e16;
                                    i11 = i14;
                                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever2 != null) {
                                        try {
                                            mediaMetadataRetriever2.release();
                                        } catch (Exception unused7) {
                                        }
                                    }
                                    i13 = i30;
                                    i14 = i11;
                                    i15 = 0;
                                    if (z13) {
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            o3 o3Var2 = o3.this;
                                            o3Var2.getClass();
                                            boolean z14 = z13;
                                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, str2, z14 ? i15 : 0, z14, i17, i20, 0L);
                                            photoEntry.setOrientation(i19, i18);
                                            a aVar2 = aVar;
                                            if (aVar2 == null || !o3.D3(aVar2.b)) {
                                                o3Var2.f2(photoEntry);
                                            } else {
                                                o3Var2.T1(aVar2, photoEntry);
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
                            i13 = i30;
                            i15 = ceil;
                        } catch (Throwable th5) {
                            th = th5;
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
                        i11 = 0;
                        i12 = 0;
                        FileLog.e(e);
                        if (mediaMetadataRetriever2 != null) {
                        }
                        i13 = i30;
                        i14 = i11;
                        i15 = 0;
                        if (z13) {
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n2
                            @Override // java.lang.Runnable
                            public final void run() {
                                o3 o3Var2 = o3.this;
                                o3Var2.getClass();
                                boolean z14 = z13;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, str2, z14 ? i15 : 0, z14, i17, i20, 0L);
                                photoEntry.setOrientation(i19, i18);
                                a aVar2 = aVar;
                                if (aVar2 == null || !o3.D3(aVar2.b)) {
                                    o3Var2.f2(photoEntry);
                                } else {
                                    o3Var2.T1(aVar2, photoEntry);
                                }
                            }
                        });
                        return;
                    }
                } else {
                    i13 = i30;
                    i14 = 0;
                    i15 = 0;
                    i12 = 0;
                }
                if (z13) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str2, options);
                        i12 = options.outWidth;
                        i14 = options.outHeight;
                    } catch (Exception e18) {
                        FileLog.e(e18);
                    }
                    try {
                        imageOrientation = AndroidUtilities.getImageOrientation(str2);
                        i16 = ((Integer) imageOrientation.first).intValue();
                    } catch (Exception e19) {
                        e = e19;
                        i16 = 0;
                    }
                    try {
                        i18 = ((Integer) imageOrientation.second).intValue();
                        i17 = i12;
                    } catch (Exception e20) {
                        e = e20;
                        FileLog.e(e);
                        i17 = i12;
                        i18 = 0;
                        i19 = i16;
                        i20 = i14;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n2
                            @Override // java.lang.Runnable
                            public final void run() {
                                o3 o3Var2 = o3.this;
                                o3Var2.getClass();
                                boolean z14 = z13;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, str2, z14 ? i15 : 0, z14, i17, i20, 0L);
                                photoEntry.setOrientation(i19, i18);
                                a aVar2 = aVar;
                                if (aVar2 == null || !o3.D3(aVar2.b)) {
                                    o3Var2.f2(photoEntry);
                                } else {
                                    o3Var2.T1(aVar2, photoEntry);
                                }
                            }
                        });
                        return;
                    }
                    i19 = i16;
                    i20 = i14;
                } else {
                    i20 = i14;
                    i17 = i12;
                    i19 = 0;
                    i18 = 0;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        o3 o3Var2 = o3.this;
                        o3Var2.getClass();
                        boolean z14 = z13;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, str2, z14 ? i15 : 0, z14, i17, i20, 0L);
                        photoEntry.setOrientation(i19, i18);
                        a aVar2 = aVar;
                        if (aVar2 == null || !o3.D3(aVar2.b)) {
                            o3Var2.f2(photoEntry);
                        } else {
                            o3Var2.T1(aVar2, photoEntry);
                        }
                    }
                });
                return;
        }
    }

    public /* synthetic */ s1(ContactsController contactsController, int i9, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.e = contactsController;
        this.b = i9;
        this.c = arrayList;
        this.f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    public /* synthetic */ s1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, int i9, SendMessagesHelper.DelayedMessage delayedMessage, ArrayList arrayList, boolean z10) {
        this.e = sendMessagesHelper;
        this.f = tLObject;
        this.b = i9;
        this.h = delayedMessage;
        this.c = arrayList;
        this.d = z10;
    }

    public /* synthetic */ s1(fv0 fv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i9, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        this.e = fv0Var;
        this.c = tL_messages_stickerSet;
        this.b = i9;
        this.f = messageObject;
        this.h = t1Var;
        this.d = z10;
    }

    public /* synthetic */ s1(zp0 zp0Var, String str, int i9, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.e = zp0Var;
        this.c = str;
        this.b = i9;
        this.f = tLObject;
        this.d = z10;
        this.h = user;
    }

    public /* synthetic */ s1(qh.o3 o3Var, Uri uri, boolean z10, String str, int i9, qh.a aVar) {
        this.e = o3Var;
        this.c = uri;
        this.d = z10;
        this.f = str;
        this.b = i9;
        this.h = aVar;
    }
}

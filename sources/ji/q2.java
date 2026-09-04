package ji;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.br0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = 4;
        this.d = activity;
        this.b = i10;
        this.e = inputGroupCall;
        this.c = z10;
        this.f = groupCall;
        this.h = hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0495 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x047e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0407 A[Catch: Exception -> 0x038d, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x038d, blocks: (B:289:0x0389, B:315:0x0407), top: B:282:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0400 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        String extensionFromMimeType;
        final String str2;
        int i10;
        int i11;
        final int i12;
        int i13;
        final int i14;
        MediaMetadataRetriever mediaMetadataRetriever;
        int ceil;
        int i15;
        final int i16;
        final int i17;
        final int i18;
        final int i19;
        Pair<Integer, Integer> imageOrientation;
        int i20;
        String readRes;
        int i21;
        boolean z10;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                final v3 v3Var = (v3) this.d;
                Uri uri = (Uri) this.e;
                String str3 = (String) this.f;
                final a aVar = (a) this.h;
                InputStream inputStream2 = null;
                r5 = null;
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e7) {
                    FileLog.e(e7);
                    str = null;
                }
                final boolean z11 = this.c;
                int i22 = this.b;
                if (str == null || !w.f.o(str)) {
                    Context context = v3Var.getContext();
                    try {
                        if (context != null) {
                            try {
                                inputStream = context.getContentResolver().openInputStream(uri);
                            } catch (Exception e10) {
                                e = e10;
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
                                if (str3 != null) {
                                    try {
                                        extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                                    } catch (Exception e11) {
                                        e = e11;
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
                                    extensionFromMimeType = z11 ? "mp4" : "jpg";
                                }
                                File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i22) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
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
                                    } catch (Exception e12) {
                                        e = e12;
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
                if (str2 == null || !w.f.o(str2)) {
                    return;
                }
                if (z11) {
                    try {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                        } catch (Exception e13) {
                            e = e13;
                        }
                        try {
                            try {
                                mediaMetadataRetriever.setDataSource(str2);
                                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                                i11 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                                if (extractMetadata2 != null) {
                                    try {
                                        i13 = Integer.parseInt(extractMetadata2);
                                    } catch (Exception e14) {
                                        e = e14;
                                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                                        i10 = 0;
                                        FileLog.e(e);
                                        if (mediaMetadataRetriever2 != null) {
                                        }
                                        i12 = i22;
                                        i13 = i10;
                                        i14 = 0;
                                        if (z11) {
                                        }
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ji.t2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                v3 v3Var2 = v3.this;
                                                v3Var2.getClass();
                                                boolean z12 = z11;
                                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                                                photoEntry.setOrientation(i18, i17);
                                                a aVar2 = aVar;
                                                if (aVar2 == null || !v3.C3(aVar2.b)) {
                                                    v3Var2.e2(photoEntry);
                                                } else {
                                                    v3Var2.S1(aVar2, photoEntry);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                } else {
                                    i13 = 0;
                                }
                                if (extractMetadata3 != null) {
                                    try {
                                        ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                    } catch (Exception e15) {
                                        e = e15;
                                        i10 = i13;
                                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                                        FileLog.e(e);
                                        if (mediaMetadataRetriever2 != null) {
                                            try {
                                                mediaMetadataRetriever2.release();
                                            } catch (Exception unused7) {
                                            }
                                        }
                                        i12 = i22;
                                        i13 = i10;
                                        i14 = 0;
                                        if (z11) {
                                        }
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ji.t2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                v3 v3Var2 = v3.this;
                                                v3Var2.getClass();
                                                boolean z12 = z11;
                                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                                                photoEntry.setOrientation(i18, i17);
                                                a aVar2 = aVar;
                                                if (aVar2 == null || !v3.C3(aVar2.b)) {
                                                    v3Var2.e2(photoEntry);
                                                } else {
                                                    v3Var2.S1(aVar2, photoEntry);
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
                                i12 = i22;
                                i14 = ceil;
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
                        } catch (Exception e16) {
                            e = e16;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            i10 = 0;
                            i11 = 0;
                            FileLog.e(e);
                            if (mediaMetadataRetriever2 != null) {
                            }
                            i12 = i22;
                            i13 = i10;
                            i14 = 0;
                            if (z11) {
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ji.t2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    v3 v3Var2 = v3.this;
                                    v3Var2.getClass();
                                    boolean z12 = z11;
                                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                                    photoEntry.setOrientation(i18, i17);
                                    a aVar2 = aVar;
                                    if (aVar2 == null || !v3.C3(aVar2.b)) {
                                        v3Var2.e2(photoEntry);
                                    } else {
                                        v3Var2.S1(aVar2, photoEntry);
                                    }
                                }
                            });
                            return;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    i12 = i22;
                    i13 = 0;
                    i14 = 0;
                    i11 = 0;
                }
                if (z11) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str2, options);
                        i11 = options.outWidth;
                        i13 = options.outHeight;
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                    try {
                        imageOrientation = AndroidUtilities.getImageOrientation(str2);
                        i15 = ((Integer) imageOrientation.first).intValue();
                    } catch (Exception e18) {
                        e = e18;
                        i15 = 0;
                    }
                    try {
                        i17 = ((Integer) imageOrientation.second).intValue();
                        i16 = i11;
                    } catch (Exception e19) {
                        e = e19;
                        FileLog.e(e);
                        i16 = i11;
                        i17 = 0;
                        i18 = i15;
                        i19 = i13;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ji.t2
                            @Override // java.lang.Runnable
                            public final void run() {
                                v3 v3Var2 = v3.this;
                                v3Var2.getClass();
                                boolean z12 = z11;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                                photoEntry.setOrientation(i18, i17);
                                a aVar2 = aVar;
                                if (aVar2 == null || !v3.C3(aVar2.b)) {
                                    v3Var2.e2(photoEntry);
                                } else {
                                    v3Var2.S1(aVar2, photoEntry);
                                }
                            }
                        });
                        return;
                    }
                    i18 = i15;
                    i19 = i13;
                } else {
                    i19 = i13;
                    i16 = i11;
                    i18 = 0;
                    i17 = 0;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ji.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        v3 v3Var2 = v3.this;
                        v3Var2.getClass();
                        boolean z12 = z11;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                        photoEntry.setOrientation(i18, i17);
                        a aVar2 = aVar;
                        if (aVar2 == null || !v3.C3(aVar2.b)) {
                            v3Var2.e2(photoEntry);
                        } else {
                            v3Var2.S1(aVar2, photoEntry);
                        }
                    }
                });
                return;
            case 1:
                ((ContactsController) this.d).lambda$processLoadedContacts$36(this.b, (ArrayList) this.e, (ArrayList) this.f, (a0.i) this.h, this.c);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$performSendMessageRequestMulti$65((TLObject) this.e, this.b, (SendMessagesHelper.DelayedMessage) this.f, (ArrayList) this.h, this.c);
                return;
            case 3:
                wv0 wv0Var = (wv0) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.h;
                RLottieNative[] rLottieNativeArr = wv0Var.f1;
                RLottieNative[] rLottieNativeArr2 = wv0Var.i1;
                int[] iArr = wv0Var.e;
                if (wv0Var.W0) {
                    AndroidUtilities.runOnUIThread(new uv0(wv0Var, 0));
                    return;
                }
                boolean z12 = false;
                int i23 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i24 = this.b;
                    if (i23 >= length) {
                        if (z12) {
                            AndroidUtilities.runOnUIThread(new uv0(wv0Var, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(wv0Var, this.c, i24, t1Var));
                            return;
                        }
                    }
                    if (i23 <= 2) {
                        if (rLottieNativeArr2[i23] == null) {
                            if (i23 == 0) {
                                int i25 = wv0Var.b1;
                                i20 = i25 == 1 ? 5 : i25 == 2 ? 6 : i25 == 3 ? 7 : i25 == 4 ? 4 : 3;
                            } else if (i23 == 1) {
                                int i26 = wv0Var.c1;
                                i20 = i26 == 1 ? 11 : i26 == 2 ? 12 : i26 == 3 ? 13 : i26 == 4 ? 10 : 9;
                            } else {
                                int i27 = wv0Var.d1;
                                i20 = i27 == 1 ? 17 : i27 == 2 ? 18 : i27 == 3 ? 19 : i27 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i20);
                            readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                RLottieNative b10 = RLottieNative.b(readRes, iArr, null, null);
                                if (i23 <= 2) {
                                    rLottieNativeArr2[i23] = b10;
                                    wv0Var.j1[i23] = iArr[0];
                                } else {
                                    rLottieNativeArr[i23 == 3 ? (char) 0 : (char) 4] = b10;
                                    wv0Var.g1[i23 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                AndroidUtilities.runOnUIThread(new vv0(document, i24, messageObject, t1Var, tL_messages_stickerSet, 0));
                                z12 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i23] == null) {
                        i20 = i23 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i20);
                        readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true), 0);
                        if (TextUtils.isEmpty(readRes)) {
                        }
                    }
                    i23++;
                }
            case 4:
                Activity activity = (Activity) this.d;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.e;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.d2.a = 0L;
                org.telegram.ui.Components.voip.d2.g(activity, this.b, inputGroupCall, this.c, groupCall, hashSet);
                return;
            default:
                br0 br0Var = (br0) this.d;
                String str4 = (String) this.f;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                HashMap hashMap = br0Var.h;
                ArrayList arrayList = br0Var.f;
                ArrayList arrayList2 = br0Var.n;
                int size = arrayList2.size();
                int i28 = 0;
                while (true) {
                    if (i28 < size) {
                        if (((String) arrayList2.get(i28)).equalsIgnoreCase(str4)) {
                            arrayList2.remove(i28);
                        } else {
                            i28++;
                        }
                    }
                }
                arrayList2.add(0, str4);
                while (arrayList2.size() > 20) {
                    a4.a.x(1, arrayList2);
                }
                br0Var.c0();
                if (this.b != br0Var.y) {
                    return;
                }
                int size2 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    br0Var.w = messages_botresults.next_offset;
                    int size3 = messages_botresults.results.size();
                    i21 = 0;
                    for (int i29 = 0; i29 < size3; i29++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i29);
                        boolean z13 = this.c;
                        if ((z13 || "photo".equals(botInlineResult.type)) && ((!z13 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            MediaController.SearchImage searchImage = new MediaController.SearchImage();
                            if (z13 && botInlineResult.document != null) {
                                for (int i30 = 0; i30 < botInlineResult.document.attributes.size(); i30++) {
                                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i30);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        searchImage.width = documentAttribute.w;
                                        searchImage.height = documentAttribute.h;
                                        searchImage.document = botInlineResult.document;
                                        searchImage.size = 0;
                                        photo2 = botInlineResult.photo;
                                        if (photo2 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, br0Var.R, true)) != null) {
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
                            } else if (!z13 && (photo = botInlineResult.photo) != null) {
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
                                int i31 = 0;
                                while (true) {
                                    if (i31 < botInlineResult.content.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i31);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute2.w;
                                            searchImage.height = documentAttribute2.h;
                                        } else {
                                            i31++;
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
                                searchImage.size = z13 ? 0 : webDocument2.size;
                            }
                            searchImage.id = botInlineResult.id;
                            searchImage.type = z13 ? 1 : 0;
                            searchImage.inlineResult = botInlineResult;
                            HashMap<String, String> hashMap2 = new HashMap<>();
                            searchImage.params = hashMap2;
                            hashMap2.put("id", botInlineResult.id);
                            searchImage.params.put("query_id", "" + messages_botresults.query_id);
                            searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                            arrayList.add(searchImage);
                            hashMap.put(searchImage.id, searchImage);
                            i21++;
                        }
                    }
                    br0Var.s = size2 == arrayList.size() || br0Var.w == null;
                } else {
                    i21 = 0;
                }
                br0Var.r = false;
                if (i21 != 0) {
                    br0Var.L.s(size2, i21);
                } else if (br0Var.s) {
                    z10 = true;
                    br0Var.L.u(arrayList.size() - 1);
                    if (arrayList.size() > 0) {
                        br0Var.N.e(false, z10);
                        return;
                    }
                    return;
                }
                z10 = true;
                if (arrayList.size() > 0) {
                }
                break;
        }
    }

    public /* synthetic */ q2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.b = i10;
        this.f = obj2;
        this.h = obj3;
        this.c = z10;
    }

    public /* synthetic */ q2(v3 v3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.a = 0;
        this.d = v3Var;
        this.e = uri;
        this.c = z10;
        this.f = str;
        this.b = i10;
        this.h = aVar;
    }

    public /* synthetic */ q2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.a = 1;
        this.d = contactsController;
        this.b = i10;
        this.e = arrayList;
        this.f = arrayList2;
        this.h = iVar;
        this.c = z10;
    }

    public /* synthetic */ q2(br0 br0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.a = 5;
        this.d = br0Var;
        this.f = str;
        this.b = i10;
        this.e = tLObject;
        this.c = z10;
        this.h = user;
    }
}

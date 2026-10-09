package ii;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.br0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ s2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = 5;
        this.d = activity;
        this.b = i10;
        this.e = inputGroupCall;
        this.c = z10;
        this.f = groupCall;
        this.h = hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x054e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0539 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04c2 A[Catch: Exception -> 0x043c, TRY_ENTER, TRY_LEAVE, TryCatch #21 {Exception -> 0x043c, blocks: (B:330:0x044a, B:356:0x04c2), top: B:323:0x043a }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x059a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0595 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        String extensionFromMimeType;
        String str2;
        int i10;
        int i11;
        int i12;
        int i13;
        final int i14;
        final int i15;
        int ceil;
        int i16;
        final int i17;
        final int i18;
        final int i19;
        final int i20;
        final String str3;
        Pair<Integer, Integer> imageOrientation;
        int i21;
        String readRes;
        int i22;
        boolean z10;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                final x3 x3Var = (x3) this.d;
                Uri uri = (Uri) this.e;
                String str4 = (String) this.f;
                final a aVar = (a) this.h;
                InputStream inputStream2 = null;
                r5 = null;
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e7) {
                    FileLog.e(e7);
                    str = null;
                }
                final boolean z11 = this.c;
                int i23 = this.b;
                if (str == null || !sc.v.u(str)) {
                    Context context = x3Var.getContext();
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
                                if (str4 != null) {
                                    try {
                                        extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4);
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
                                File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i23) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
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
                if (str2 == null || !sc.v.u(str2)) {
                    return;
                }
                if (z11) {
                    try {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                            try {
                                try {
                                    mediaMetadataRetriever2.setDataSource(str2);
                                    String extractMetadata = mediaMetadataRetriever2.extractMetadata(18);
                                    String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(19);
                                    String extractMetadata3 = mediaMetadataRetriever2.extractMetadata(9);
                                    i11 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                                    if (extractMetadata2 != null) {
                                        try {
                                            i12 = Integer.parseInt(extractMetadata2);
                                        } catch (Exception e13) {
                                            e = e13;
                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                            i10 = 0;
                                            FileLog.e(e);
                                            if (mediaMetadataRetriever != null) {
                                            }
                                            i12 = i10;
                                            i13 = 0;
                                            i14 = i23;
                                            i15 = 0;
                                            if (z11) {
                                            }
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    x3 x3Var2 = x3.this;
                                                    x3Var2.getClass();
                                                    boolean z12 = z11;
                                                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z12 ? i15 : 0, z12, i18, i20, 0L);
                                                    photoEntry.setOrientation(i19, i17);
                                                    a aVar2 = aVar;
                                                    if (aVar2 == null || !x3.E3(aVar2.b)) {
                                                        x3Var2.g2(photoEntry);
                                                    } else {
                                                        x3Var2.U1(aVar2, photoEntry);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                    if (extractMetadata3 != null) {
                                        try {
                                            ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                        } catch (Exception e14) {
                                            e = e14;
                                            i10 = i12;
                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                            FileLog.e(e);
                                            if (mediaMetadataRetriever != null) {
                                                try {
                                                    mediaMetadataRetriever.release();
                                                } catch (Exception unused7) {
                                                }
                                            }
                                            i12 = i10;
                                            i13 = 0;
                                            i14 = i23;
                                            i15 = 0;
                                            if (z11) {
                                            }
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    x3 x3Var2 = x3.this;
                                                    x3Var2.getClass();
                                                    boolean z12 = z11;
                                                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z12 ? i15 : 0, z12, i18, i20, 0L);
                                                    photoEntry.setOrientation(i19, i17);
                                                    a aVar2 = aVar;
                                                    if (aVar2 == null || !x3.E3(aVar2.b)) {
                                                        x3Var2.g2(photoEntry);
                                                    } else {
                                                        x3Var2.U1(aVar2, photoEntry);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    } else {
                                        ceil = 0;
                                    }
                                    try {
                                        mediaMetadataRetriever2.release();
                                    } catch (Exception unused8) {
                                    }
                                    i13 = 0;
                                    i14 = i23;
                                    i15 = ceil;
                                } catch (Throwable th5) {
                                    th = th5;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    if (mediaMetadataRetriever != null) {
                                        try {
                                            mediaMetadataRetriever.release();
                                        } catch (Exception unused9) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                i11 = 0;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                i10 = 0;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            i10 = 0;
                            i11 = 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    i12 = 0;
                    i13 = 0;
                    i11 = 0;
                    i14 = i23;
                    i15 = 0;
                }
                if (z11) {
                    i20 = i12;
                    i17 = i13;
                    str3 = str2;
                    i18 = i11;
                    i19 = i17;
                } else {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str2, options);
                        i11 = options.outWidth;
                        i12 = options.outHeight;
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                    try {
                        imageOrientation = AndroidUtilities.getImageOrientation(str2);
                        i16 = ((Integer) imageOrientation.first).intValue();
                    } catch (Exception e18) {
                        e = e18;
                        i16 = i13;
                    }
                    try {
                        i17 = ((Integer) imageOrientation.second).intValue();
                    } catch (Exception e19) {
                        e = e19;
                        FileLog.e(e);
                        i17 = i13;
                        i18 = i11;
                        i19 = i16;
                        i20 = i12;
                        str3 = str2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                            @Override // java.lang.Runnable
                            public final void run() {
                                x3 x3Var2 = x3.this;
                                x3Var2.getClass();
                                boolean z12 = z11;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z12 ? i15 : 0, z12, i18, i20, 0L);
                                photoEntry.setOrientation(i19, i17);
                                a aVar2 = aVar;
                                if (aVar2 == null || !x3.E3(aVar2.b)) {
                                    x3Var2.g2(photoEntry);
                                } else {
                                    x3Var2.U1(aVar2, photoEntry);
                                }
                            }
                        });
                        return;
                    }
                    i18 = i11;
                    i19 = i16;
                    i20 = i12;
                    str3 = str2;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                    @Override // java.lang.Runnable
                    public final void run() {
                        x3 x3Var2 = x3.this;
                        x3Var2.getClass();
                        boolean z12 = z11;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z12 ? i15 : 0, z12, i18, i20, 0L);
                        photoEntry.setOrientation(i19, i17);
                        a aVar2 = aVar;
                        if (aVar2 == null || !x3.E3(aVar2.b)) {
                            x3Var2.g2(photoEntry);
                        } else {
                            x3Var2.U1(aVar2, photoEntry);
                        }
                    }
                });
                return;
            case 1:
                ki.r rVar = (ki.r) this.d;
                Size size = (Size) this.e;
                int i24 = this.b;
                boolean z12 = this.c;
                RuntimeException[] runtimeExceptionArr = (RuntimeException[]) this.f;
                CountDownLatch countDownLatch = (CountDownLatch) this.h;
                try {
                    try {
                        rVar.a = size;
                        rVar.f = i24;
                        rVar.g = z12;
                        SurfaceTexture surfaceTexture = rVar.n;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        rVar.g();
                        ki.b0 b0Var = rVar.x;
                        if (b0Var != null) {
                            b0Var.v(size, i24);
                        }
                        ki.n nVar = rVar.e;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i24);
                        sb2.append(", filter=");
                        sb2.append(rVar.f == rVar.c ? "NEAREST" : "LINEAR");
                        nVar.b(sb2.toString());
                    } catch (Throwable th7) {
                        countDownLatch.countDown();
                        throw th7;
                    }
                } catch (RuntimeException e20) {
                    runtimeExceptionArr[0] = e20;
                }
                countDownLatch.countDown();
                return;
            case 2:
                ((ContactsController) this.d).lambda$processLoadedContacts$36(this.b, (ArrayList) this.e, (ArrayList) this.f, (a0.i) this.h, this.c);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$performSendMessageRequestMulti$68((TLObject) this.e, this.b, (SendMessagesHelper.DelayedMessage) this.f, (ArrayList) this.h, this.c);
                return;
            case 4:
                ax0 ax0Var = (ax0) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.h;
                RLottieNative[] rLottieNativeArr = ax0Var.f1;
                RLottieNative[] rLottieNativeArr2 = ax0Var.i1;
                int[] iArr = ax0Var.e;
                if (ax0Var.W0) {
                    AndroidUtilities.runOnUIThread(new yw0(ax0Var, 0));
                    return;
                }
                boolean z13 = false;
                int i25 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i26 = this.b;
                    if (i25 >= length) {
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new yw0(ax0Var, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.n0(ax0Var, this.c, i26, u1Var));
                            return;
                        }
                    }
                    if (i25 <= 2) {
                        if (rLottieNativeArr2[i25] == null) {
                            if (i25 == 0) {
                                int i27 = ax0Var.b1;
                                i21 = i27 == 1 ? 5 : i27 == 2 ? 6 : i27 == 3 ? 7 : i27 == 4 ? 4 : 3;
                            } else if (i25 == 1) {
                                int i28 = ax0Var.c1;
                                i21 = i28 == 1 ? 11 : i28 == 2 ? 12 : i28 == 3 ? 13 : i28 == 4 ? 10 : 9;
                            } else {
                                int i29 = ax0Var.d1;
                                i21 = i29 == 1 ? 17 : i29 == 2 ? 18 : i29 == 3 ? 19 : i29 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i21);
                            readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                RLottieNative b10 = RLottieNative.b(readRes, iArr, null, null);
                                if (i25 <= 2) {
                                    rLottieNativeArr2[i25] = b10;
                                    ax0Var.j1[i25] = iArr[0];
                                } else {
                                    rLottieNativeArr[i25 == 3 ? (char) 0 : (char) 4] = b10;
                                    ax0Var.g1[i25 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                AndroidUtilities.runOnUIThread(new zw0(document, i26, messageObject, u1Var, tL_messages_stickerSet, 0));
                                z13 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i25] == null) {
                        i21 = i25 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i21);
                        readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true), 0);
                        if (TextUtils.isEmpty(readRes)) {
                        }
                    }
                    i25++;
                }
            case 5:
                Activity activity = (Activity) this.d;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.e;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.f2.a = 0L;
                org.telegram.ui.Components.voip.f2.g(activity, this.b, inputGroupCall, this.c, groupCall, hashSet);
                return;
            case 6:
                br0 br0Var = (br0) this.d;
                String str5 = (String) this.f;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                HashMap hashMap = br0Var.h;
                ArrayList arrayList = br0Var.f;
                ArrayList arrayList2 = br0Var.n;
                int size2 = arrayList2.size();
                int i30 = 0;
                int i31 = 0;
                while (true) {
                    if (i31 < size2) {
                        if (((String) arrayList2.get(i31)).equalsIgnoreCase(str5)) {
                            arrayList2.remove(i31);
                        } else {
                            i31++;
                        }
                    }
                }
                arrayList2.add(0, str5);
                while (arrayList2.size() > 20) {
                    a1.g.y(1, arrayList2);
                }
                br0Var.c0();
                if (this.b != br0Var.y) {
                    return;
                }
                int size3 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    br0Var.w = messages_botresults.next_offset;
                    int size4 = messages_botresults.results.size();
                    int i32 = 0;
                    i22 = 0;
                    while (i32 < size4) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i32);
                        boolean z14 = this.c;
                        if ((z14 || "photo".equals(botInlineResult.type)) && ((!z14 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            MediaController.SearchImage searchImage = new MediaController.SearchImage();
                            if (z14 && botInlineResult.document != null) {
                                for (int i33 = i30; i33 < botInlineResult.document.attributes.size(); i33++) {
                                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i33);
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
                            } else if (!z14 && (photo = botInlineResult.photo) != null) {
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
                                int i34 = 0;
                                while (true) {
                                    if (i34 < botInlineResult.content.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i34);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute2.w;
                                            searchImage.height = documentAttribute2.h;
                                        } else {
                                            i34++;
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
                                searchImage.size = z14 ? 0 : webDocument2.size;
                            }
                            searchImage.id = botInlineResult.id;
                            searchImage.type = z14 ? 1 : 0;
                            searchImage.inlineResult = botInlineResult;
                            HashMap<String, String> hashMap2 = new HashMap<>();
                            searchImage.params = hashMap2;
                            hashMap2.put("id", botInlineResult.id);
                            searchImage.params.put("query_id", "" + messages_botresults.query_id);
                            searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                            arrayList.add(searchImage);
                            hashMap.put(searchImage.id, searchImage);
                            i22++;
                        }
                        i32++;
                        i30 = 0;
                    }
                    br0Var.s = size3 == arrayList.size() || br0Var.w == null;
                } else {
                    i22 = 0;
                }
                br0Var.r = false;
                if (i22 != 0) {
                    br0Var.L.s(size3, i22);
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
            default:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) this.f;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.h;
                boolean z15 = this.c;
                int i35 = this.b;
                WalletEngine2.ImportedWalletProof importedWalletProof = null;
                try {
                    try {
                        WalletEngine2.ImportedWalletProof createImportProof = z15 ? WalletEngine2.createImportProof(h0Var, proofchallenge.domain, proofchallenge.payload, i35) : WalletEngine2.createOwnershipProof(h0Var, proofchallenge.domain, proofchallenge.payload, i35);
                        h0Var.close();
                        importedWalletProof = createImportProof;
                        e = null;
                    } catch (Exception e21) {
                        e = e21;
                        org.telegram.ui.Wallet.k0.j("createImportProof", e);
                        h0Var.close();
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.k(k0Var, importedWalletProof, e, callback2));
                    return;
                } catch (Throwable th8) {
                    h0Var.close();
                    throw th8;
                }
        }
    }

    public /* synthetic */ s2(x3 x3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.a = 0;
        this.d = x3Var;
        this.e = uri;
        this.c = z10;
        this.f = str;
        this.b = i10;
        this.h = aVar;
    }

    public /* synthetic */ s2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.b = i10;
        this.f = obj2;
        this.h = obj3;
        this.c = z10;
    }

    public /* synthetic */ s2(ki.r rVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch) {
        this.a = 1;
        this.d = rVar;
        this.e = size;
        this.b = i10;
        this.c = z10;
        this.f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    public /* synthetic */ s2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.i iVar, boolean z10) {
        this.a = 2;
        this.d = contactsController;
        this.b = i10;
        this.e = arrayList;
        this.f = arrayList2;
        this.h = iVar;
        this.c = z10;
    }

    public /* synthetic */ s2(br0 br0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.a = 6;
        this.d = br0Var;
        this.f = str;
        this.b = i10;
        this.e = tLObject;
        this.c = z10;
        this.h = user;
    }

    public /* synthetic */ s2(org.telegram.ui.Wallet.k0 k0Var, boolean z10, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.a = 7;
        this.d = k0Var;
        this.c = z10;
        this.e = h0Var;
        this.f = proofchallenge;
        this.b = i10;
        this.h = callback2;
    }
}

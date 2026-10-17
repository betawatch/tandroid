package ki;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.kq0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ r2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = 4;
        this.d = activity;
        this.b = i10;
        this.e = inputGroupCall;
        this.c = z10;
        this.f = groupCall;
        this.h = hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x044f A[Catch: Exception -> 0x03c9, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x03c9, blocks: (B:306:0x03d7, B:332:0x044f), top: B:299:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0527 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0522 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.ContentResolver] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        ?? r42;
        FileOutputStream fileOutputStream;
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
                final w3 w3Var = (w3) this.d;
                ?? r22 = (Uri) this.e;
                String str4 = (String) this.f;
                final a aVar = (a) this.h;
                InputStream inputStream = null;
                r5 = null;
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    str = AndroidUtilities.getPath(r22);
                } catch (Exception e) {
                    FileLog.e(e);
                    str = null;
                }
                final boolean z11 = this.c;
                int i23 = this.b;
                if (str == null || !r.c.t(str)) {
                    Context context = w3Var.getContext();
                    try {
                        try {
                            if (context != null) {
                                try {
                                    r22 = context.getContentResolver().openInputStream(r22);
                                } catch (Exception e7) {
                                    e = e7;
                                    r22 = 0;
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r42 = 0;
                                    if (inputStream != null) {
                                    }
                                    if (r42 != 0) {
                                    }
                                }
                                if (r22 != 0) {
                                    if (str4 != null) {
                                        try {
                                            extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4);
                                        } catch (Exception e10) {
                                            e = e10;
                                            fileOutputStream = null;
                                            FileLog.e(e);
                                            if (r22 != 0) {
                                            }
                                            if (fileOutputStream != null) {
                                            }
                                            str = null;
                                            str2 = str;
                                            if (str2 == null) {
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str4 = null;
                                            inputStream = r22;
                                            r42 = str4;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused) {
                                                }
                                            }
                                            if (r42 != 0) {
                                                throw th;
                                            }
                                            try {
                                                r42.close();
                                                throw th;
                                            } catch (Exception unused2) {
                                                throw th;
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
                                        AndroidUtilities.copyFile((InputStream) r22, fileOutputStream);
                                        str = file.getAbsolutePath();
                                        try {
                                            r22.close();
                                        } catch (Exception unused3) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception unused4) {
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        FileLog.e(e);
                                        if (r22 != 0) {
                                            try {
                                                r22.close();
                                            } catch (Exception unused5) {
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
                                } else if (r22 != 0) {
                                    r22.close();
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception unused6) {
                    }
                    str = null;
                }
                str2 = str;
                if (str2 == null || !r.c.t(str2)) {
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
                                        } catch (Exception e12) {
                                            e = e12;
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
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ki.u2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    w3 w3Var2 = w3.this;
                                                    w3Var2.getClass();
                                                    boolean z12 = z11;
                                                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z12 ? i15 : 0, z12, i18, i20, 0L);
                                                    photoEntry.setOrientation(i19, i17);
                                                    a aVar2 = aVar;
                                                    if (aVar2 == null || !w3.E3(aVar2.b)) {
                                                        w3Var2.g2(photoEntry);
                                                    } else {
                                                        w3Var2.U1(aVar2, photoEntry);
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
                                        } catch (Exception e13) {
                                            e = e13;
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
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ki.u2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    w3 w3Var2 = w3.this;
                                                    w3Var2.getClass();
                                                    boolean z12 = z11;
                                                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z12 ? i15 : 0, z12, i18, i20, 0L);
                                                    photoEntry.setOrientation(i19, i17);
                                                    a aVar2 = aVar;
                                                    if (aVar2 == null || !w3.E3(aVar2.b)) {
                                                        w3Var2.g2(photoEntry);
                                                    } else {
                                                        w3Var2.U1(aVar2, photoEntry);
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
                            } catch (Exception e14) {
                                e = e14;
                                i11 = 0;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                i10 = 0;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        i10 = 0;
                        i11 = 0;
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
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                    try {
                        imageOrientation = AndroidUtilities.getImageOrientation(str2);
                        i16 = ((Integer) imageOrientation.first).intValue();
                    } catch (Exception e17) {
                        e = e17;
                        i16 = i13;
                    }
                    try {
                        i17 = ((Integer) imageOrientation.second).intValue();
                    } catch (Exception e18) {
                        e = e18;
                        FileLog.e(e);
                        i17 = i13;
                        i18 = i11;
                        i19 = i16;
                        i20 = i12;
                        str3 = str2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ki.u2
                            @Override // java.lang.Runnable
                            public final void run() {
                                w3 w3Var2 = w3.this;
                                w3Var2.getClass();
                                boolean z12 = z11;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z12 ? i15 : 0, z12, i18, i20, 0L);
                                photoEntry.setOrientation(i19, i17);
                                a aVar2 = aVar;
                                if (aVar2 == null || !w3.E3(aVar2.b)) {
                                    w3Var2.g2(photoEntry);
                                } else {
                                    w3Var2.U1(aVar2, photoEntry);
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ki.u2
                    @Override // java.lang.Runnable
                    public final void run() {
                        w3 w3Var2 = w3.this;
                        w3Var2.getClass();
                        boolean z12 = z11;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z12 ? i15 : 0, z12, i18, i20, 0L);
                        photoEntry.setOrientation(i19, i17);
                        a aVar2 = aVar;
                        if (aVar2 == null || !w3.E3(aVar2.b)) {
                            w3Var2.g2(photoEntry);
                        } else {
                            w3Var2.U1(aVar2, photoEntry);
                        }
                    }
                });
                return;
            case 1:
                ((ContactsController) this.d).lambda$processLoadedContacts$36(this.b, (ArrayList) this.e, (ArrayList) this.f, (a0.h) this.h, this.c);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$performSendMessageRequestMulti$68((TLObject) this.e, this.b, (SendMessagesHelper.DelayedMessage) this.f, (ArrayList) this.h, this.c);
                return;
            case 3:
                rw0 rw0Var = (rw0) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.h;
                RLottieNative[] rLottieNativeArr = rw0Var.f1;
                RLottieNative[] rLottieNativeArr2 = rw0Var.i1;
                int[] iArr = rw0Var.e;
                if (rw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new pw0(rw0Var, 0));
                    return;
                }
                boolean z12 = false;
                int i24 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i25 = this.b;
                    if (i24 >= length) {
                        if (z12) {
                            AndroidUtilities.runOnUIThread(new pw0(rw0Var, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(rw0Var, this.c, i25, u1Var));
                            return;
                        }
                    }
                    if (i24 <= 2) {
                        if (rLottieNativeArr2[i24] == null) {
                            if (i24 == 0) {
                                int i26 = rw0Var.b1;
                                i21 = i26 == 1 ? 5 : i26 == 2 ? 6 : i26 == 3 ? 7 : i26 == 4 ? 4 : 3;
                            } else if (i24 == 1) {
                                int i27 = rw0Var.c1;
                                i21 = i27 == 1 ? 11 : i27 == 2 ? 12 : i27 == 3 ? 13 : i27 == 4 ? 10 : 9;
                            } else {
                                int i28 = rw0Var.d1;
                                i21 = i28 == 1 ? 17 : i28 == 2 ? 18 : i28 == 3 ? 19 : i28 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i21);
                            readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                RLottieNative b10 = RLottieNative.b(readRes, iArr, null, null);
                                if (i24 <= 2) {
                                    rLottieNativeArr2[i24] = b10;
                                    rw0Var.j1[i24] = iArr[0];
                                } else {
                                    rLottieNativeArr[i24 == 3 ? (char) 0 : (char) 4] = b10;
                                    rw0Var.g1[i24 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                AndroidUtilities.runOnUIThread(new qw0(document, i25, messageObject, u1Var, tL_messages_stickerSet, 0));
                                z12 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i24] == null) {
                        i21 = i24 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i21);
                        readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true), 0);
                        if (TextUtils.isEmpty(readRes)) {
                        }
                    }
                    i24++;
                }
            case 4:
                Activity activity = (Activity) this.d;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.e;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.d2.a = 0L;
                org.telegram.ui.Components.voip.d2.g(activity, this.b, inputGroupCall, this.c, groupCall, hashSet);
                return;
            case 5:
                kq0 kq0Var = (kq0) this.d;
                String str5 = (String) this.f;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                HashMap hashMap = kq0Var.h;
                ArrayList arrayList = kq0Var.f;
                ArrayList arrayList2 = kq0Var.n;
                int size = arrayList2.size();
                int i29 = 0;
                int i30 = 0;
                while (true) {
                    if (i30 < size) {
                        if (((String) arrayList2.get(i30)).equalsIgnoreCase(str5)) {
                            arrayList2.remove(i30);
                        } else {
                            i30++;
                        }
                    }
                }
                arrayList2.add(0, str5);
                while (arrayList2.size() > 20) {
                    a1.g.y(1, arrayList2);
                }
                kq0Var.c0();
                if (this.b != kq0Var.y) {
                    return;
                }
                int size2 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    kq0Var.w = messages_botresults.next_offset;
                    int size3 = messages_botresults.results.size();
                    int i31 = 0;
                    i22 = 0;
                    while (i31 < size3) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i31);
                        boolean z13 = this.c;
                        if ((z13 || "photo".equals(botInlineResult.type)) && ((!z13 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            MediaController.SearchImage searchImage = new MediaController.SearchImage();
                            if (z13 && botInlineResult.document != null) {
                                for (int i32 = i29; i32 < botInlineResult.document.attributes.size(); i32++) {
                                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i32);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        searchImage.width = documentAttribute.w;
                                        searchImage.height = documentAttribute.h;
                                        searchImage.document = botInlineResult.document;
                                        searchImage.size = 0;
                                        photo2 = botInlineResult.photo;
                                        if (photo2 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, kq0Var.R, true)) != null) {
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
                                int i33 = 0;
                                while (true) {
                                    if (i33 < botInlineResult.content.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i33);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute2.w;
                                            searchImage.height = documentAttribute2.h;
                                        } else {
                                            i33++;
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
                            i22++;
                        }
                        i31++;
                        i29 = 0;
                    }
                    kq0Var.s = size2 == arrayList.size() || kq0Var.w == null;
                } else {
                    i22 = 0;
                }
                kq0Var.r = false;
                if (i22 != 0) {
                    kq0Var.L.s(size2, i22);
                } else if (kq0Var.s) {
                    z10 = true;
                    kq0Var.L.u(arrayList.size() - 1);
                    if (arrayList.size() > 0) {
                        kq0Var.N.e(false, z10);
                        return;
                    }
                    return;
                }
                z10 = true;
                if (arrayList.size() > 0) {
                }
                break;
            default:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.d;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) this.f;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.h;
                boolean z14 = this.c;
                int i34 = this.b;
                WalletEngine2.ImportedWalletProof importedWalletProof = null;
                try {
                    try {
                        WalletEngine2.ImportedWalletProof createImportProof = z14 ? WalletEngine2.createImportProof(j0Var, proofchallenge.domain, proofchallenge.payload, i34) : WalletEngine2.createOwnershipProof(j0Var, proofchallenge.domain, proofchallenge.payload, i34);
                        j0Var.close();
                        importedWalletProof = createImportProof;
                        e = null;
                    } catch (Exception e19) {
                        e = e19;
                        org.telegram.ui.Wallet.m0.j("createImportProof", e);
                        j0Var.close();
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(m0Var, importedWalletProof, e, callback2));
                    return;
                } catch (Throwable th7) {
                    j0Var.close();
                    throw th7;
                }
        }
    }

    public /* synthetic */ r2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.b = i10;
        this.f = obj2;
        this.h = obj3;
        this.c = z10;
    }

    public /* synthetic */ r2(w3 w3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.a = 0;
        this.d = w3Var;
        this.e = uri;
        this.c = z10;
        this.f = str;
        this.b = i10;
        this.h = aVar;
    }

    public /* synthetic */ r2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.a = 1;
        this.d = contactsController;
        this.b = i10;
        this.e = arrayList;
        this.f = arrayList2;
        this.h = hVar;
        this.c = z10;
    }

    public /* synthetic */ r2(kq0 kq0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.a = 5;
        this.d = kq0Var;
        this.f = str;
        this.b = i10;
        this.e = tLObject;
        this.c = z10;
        this.h = user;
    }

    public /* synthetic */ r2(org.telegram.ui.Wallet.m0 m0Var, boolean z10, org.telegram.ui.Wallet.j0 j0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.a = 6;
        this.d = m0Var;
        this.c = z10;
        this.e = j0Var;
        this.f = proofchallenge;
        this.b = i10;
        this.h = callback2;
    }
}

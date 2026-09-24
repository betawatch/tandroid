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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0508 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x047a A[Catch: Exception -> 0x0400, TRY_ENTER, TRY_LEAVE, TryCatch #24 {Exception -> 0x0400, blocks: (B:313:0x03fc, B:339:0x047a), top: B:306:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0473 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0557 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0550 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42 */
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
                final x3 x3Var = (x3) this.d;
                ?? r22 = (Uri) this.e;
                String str3 = (String) this.f;
                final a aVar = (a) this.h;
                InputStream inputStream = null;
                r5 = null;
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    str = AndroidUtilities.getPath(r22);
                } catch (Exception e) {
                    FileLog.e(e);
                    str = null;
                }
                final boolean z11 = this.c;
                int i22 = this.b;
                if (str == null || !v7.j.s(str)) {
                    Context context = x3Var.getContext();
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
                                if (r22 != 0) {
                                    if (str3 != null) {
                                        try {
                                            extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
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
                                            str3 = null;
                                            inputStream = r22;
                                            r42 = str3;
                                            if (inputStream != null) {
                                            }
                                            if (r42 != 0) {
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
                if (str2 == null || !v7.j.s(str2)) {
                    return;
                }
                if (z11) {
                    try {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                        } catch (Exception e12) {
                            e = e12;
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
                                    } catch (Exception e13) {
                                        e = e13;
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
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                x3 x3Var2 = x3.this;
                                                x3Var2.getClass();
                                                boolean z12 = z11;
                                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                                                photoEntry.setOrientation(i18, i17);
                                                a aVar2 = aVar;
                                                if (aVar2 == null || !x3.D3(aVar2.b)) {
                                                    x3Var2.f2(photoEntry);
                                                } else {
                                                    x3Var2.T1(aVar2, photoEntry);
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
                                    } catch (Exception e14) {
                                        e = e14;
                                        i10 = i13;
                                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                                        FileLog.e(e);
                                        if (mediaMetadataRetriever2 != null) {
                                        }
                                        i12 = i22;
                                        i13 = i10;
                                        i14 = 0;
                                        if (z11) {
                                        }
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                x3 x3Var2 = x3.this;
                                                x3Var2.getClass();
                                                boolean z12 = z11;
                                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                                                photoEntry.setOrientation(i18, i17);
                                                a aVar2 = aVar;
                                                if (aVar2 == null || !x3.D3(aVar2.b)) {
                                                    x3Var2.f2(photoEntry);
                                                } else {
                                                    x3Var2.T1(aVar2, photoEntry);
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
                                } catch (Exception unused7) {
                                }
                                i12 = i22;
                                i14 = ceil;
                            } catch (Throwable th5) {
                                th = th5;
                                mediaMetadataRetriever2 = mediaMetadataRetriever;
                                if (mediaMetadataRetriever2 != null) {
                                    try {
                                        mediaMetadataRetriever2.release();
                                    } catch (Exception unused8) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            i10 = 0;
                            i11 = 0;
                            FileLog.e(e);
                            if (mediaMetadataRetriever2 != null) {
                                try {
                                    mediaMetadataRetriever2.release();
                                } catch (Exception unused9) {
                                }
                            }
                            i12 = i22;
                            i13 = i10;
                            i14 = 0;
                            if (z11) {
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    x3 x3Var2 = x3.this;
                                    x3Var2.getClass();
                                    boolean z12 = z11;
                                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                                    photoEntry.setOrientation(i18, i17);
                                    a aVar2 = aVar;
                                    if (aVar2 == null || !x3.D3(aVar2.b)) {
                                        x3Var2.f2(photoEntry);
                                    } else {
                                        x3Var2.T1(aVar2, photoEntry);
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
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                    try {
                        imageOrientation = AndroidUtilities.getImageOrientation(str2);
                        i15 = ((Integer) imageOrientation.first).intValue();
                    } catch (Exception e17) {
                        e = e17;
                        i15 = 0;
                    }
                    try {
                        i17 = ((Integer) imageOrientation.second).intValue();
                        i16 = i11;
                    } catch (Exception e18) {
                        e = e18;
                        FileLog.e(e);
                        i16 = i11;
                        i17 = 0;
                        i18 = i15;
                        i19 = i13;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                            @Override // java.lang.Runnable
                            public final void run() {
                                x3 x3Var2 = x3.this;
                                x3Var2.getClass();
                                boolean z12 = z11;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                                photoEntry.setOrientation(i18, i17);
                                a aVar2 = aVar;
                                if (aVar2 == null || !x3.D3(aVar2.b)) {
                                    x3Var2.f2(photoEntry);
                                } else {
                                    x3Var2.T1(aVar2, photoEntry);
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ii.v2
                    @Override // java.lang.Runnable
                    public final void run() {
                        x3 x3Var2 = x3.this;
                        x3Var2.getClass();
                        boolean z12 = z11;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i12, 0L, str2, z12 ? i14 : 0, z12, i16, i19, 0L);
                        photoEntry.setOrientation(i18, i17);
                        a aVar2 = aVar;
                        if (aVar2 == null || !x3.D3(aVar2.b)) {
                            x3Var2.f2(photoEntry);
                        } else {
                            x3Var2.T1(aVar2, photoEntry);
                        }
                    }
                });
                return;
            case 1:
                ki.q qVar = (ki.q) this.d;
                Size size = (Size) this.e;
                int i23 = this.b;
                boolean z12 = this.c;
                RuntimeException[] runtimeExceptionArr = (RuntimeException[]) this.f;
                CountDownLatch countDownLatch = (CountDownLatch) this.h;
                try {
                    try {
                        qVar.a = size;
                        qVar.f = i23;
                        qVar.g = z12;
                        SurfaceTexture surfaceTexture = qVar.m;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        qVar.e();
                        ki.a0 a0Var = qVar.w;
                        if (a0Var != null) {
                            a0Var.u(size, i23);
                        }
                        ki.l lVar = qVar.e;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i23);
                        sb2.append(", filter=");
                        sb2.append(qVar.f == qVar.c ? "NEAREST" : "LINEAR");
                        lVar.b(sb2.toString());
                    } catch (Throwable th7) {
                        countDownLatch.countDown();
                        throw th7;
                    }
                } catch (RuntimeException e19) {
                    runtimeExceptionArr[0] = e19;
                }
                countDownLatch.countDown();
                return;
            case 2:
                ((ContactsController) this.d).lambda$processLoadedContacts$36(this.b, (ArrayList) this.e, (ArrayList) this.f, (a0.i) this.h, this.c);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$performSendMessageRequestMulti$65((TLObject) this.e, this.b, (SendMessagesHelper.DelayedMessage) this.f, (ArrayList) this.h, this.c);
                return;
            case 4:
                iw0 iw0Var = (iw0) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.h;
                RLottieNative[] rLottieNativeArr = iw0Var.f1;
                RLottieNative[] rLottieNativeArr2 = iw0Var.i1;
                int[] iArr = iw0Var.e;
                if (iw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new gw0(iw0Var, 0));
                    return;
                }
                boolean z13 = false;
                int i24 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i25 = this.b;
                    if (i24 >= length) {
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new gw0(iw0Var, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(iw0Var, this.c, i25, u1Var));
                            return;
                        }
                    }
                    if (i24 <= 2) {
                        if (rLottieNativeArr2[i24] == null) {
                            if (i24 == 0) {
                                int i26 = iw0Var.b1;
                                i20 = i26 == 1 ? 5 : i26 == 2 ? 6 : i26 == 3 ? 7 : i26 == 4 ? 4 : 3;
                            } else if (i24 == 1) {
                                int i27 = iw0Var.c1;
                                i20 = i27 == 1 ? 11 : i27 == 2 ? 12 : i27 == 3 ? 13 : i27 == 4 ? 10 : 9;
                            } else {
                                int i28 = iw0Var.d1;
                                i20 = i28 == 1 ? 17 : i28 == 2 ? 18 : i28 == 3 ? 19 : i28 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i20);
                            readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                RLottieNative b10 = RLottieNative.b(readRes, iArr, null, null);
                                if (i24 <= 2) {
                                    rLottieNativeArr2[i24] = b10;
                                    iw0Var.j1[i24] = iArr[0];
                                } else {
                                    rLottieNativeArr[i24 == 3 ? (char) 0 : (char) 4] = b10;
                                    iw0Var.g1[i24 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                AndroidUtilities.runOnUIThread(new hw0(document, i25, messageObject, u1Var, tL_messages_stickerSet, 0));
                                z13 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i24] == null) {
                        i20 = i24 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i20);
                        readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true), 0);
                        if (TextUtils.isEmpty(readRes)) {
                        }
                    }
                    i24++;
                }
            case 5:
                Activity activity = (Activity) this.d;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.e;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.g2.a = 0L;
                org.telegram.ui.Components.voip.g2.g(activity, this.b, inputGroupCall, this.c, groupCall, hashSet);
                return;
            default:
                tq0 tq0Var = (tq0) this.d;
                String str4 = (String) this.f;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                HashMap hashMap = tq0Var.h;
                ArrayList arrayList = tq0Var.f;
                ArrayList arrayList2 = tq0Var.n;
                int size2 = arrayList2.size();
                int i29 = 0;
                while (true) {
                    if (i29 < size2) {
                        if (((String) arrayList2.get(i29)).equalsIgnoreCase(str4)) {
                            arrayList2.remove(i29);
                        } else {
                            i29++;
                        }
                    }
                }
                arrayList2.add(0, str4);
                while (arrayList2.size() > 20) {
                    a4.a.y(1, arrayList2);
                }
                tq0Var.c0();
                if (this.b != tq0Var.y) {
                    return;
                }
                int size3 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    tq0Var.w = messages_botresults.next_offset;
                    int size4 = messages_botresults.results.size();
                    i21 = 0;
                    for (int i30 = 0; i30 < size4; i30++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i30);
                        boolean z14 = this.c;
                        if ((z14 || "photo".equals(botInlineResult.type)) && ((!z14 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            MediaController.SearchImage searchImage = new MediaController.SearchImage();
                            if (z14 && botInlineResult.document != null) {
                                for (int i31 = 0; i31 < botInlineResult.document.attributes.size(); i31++) {
                                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i31);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        searchImage.width = documentAttribute.w;
                                        searchImage.height = documentAttribute.h;
                                        searchImage.document = botInlineResult.document;
                                        searchImage.size = 0;
                                        photo2 = botInlineResult.photo;
                                        if (photo2 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, tq0Var.R, true)) != null) {
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
                                int i32 = 0;
                                while (true) {
                                    if (i32 < botInlineResult.content.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i32);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute2.w;
                                            searchImage.height = documentAttribute2.h;
                                        } else {
                                            i32++;
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
                            i21++;
                        }
                    }
                    tq0Var.s = size3 == arrayList.size() || tq0Var.w == null;
                } else {
                    i21 = 0;
                }
                tq0Var.r = false;
                if (i21 != 0) {
                    tq0Var.L.s(size3, i21);
                } else if (tq0Var.s) {
                    z10 = true;
                    tq0Var.L.u(arrayList.size() - 1);
                    if (arrayList.size() > 0) {
                        tq0Var.N.e(false, z10);
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

    public /* synthetic */ s2(ki.q qVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch) {
        this.a = 1;
        this.d = qVar;
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

    public /* synthetic */ s2(tq0 tq0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.a = 6;
        this.d = tq0Var;
        this.f = str;
        this.b = i10;
        this.e = tLObject;
        this.c = z10;
        this.h = user;
    }
}

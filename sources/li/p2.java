package li;

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
import org.telegram.messenger.a8;
import org.telegram.messenger.gf;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.kf;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p2(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z9, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.b = i7;
        this.e = inputGroupCall;
        this.c = z9;
        this.f = groupCall;
        this.h = hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0436 A[Catch: Exception -> 0x03ae, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x03ae, blocks: (B:302:0x03bc, B:328:0x0436), top: B:295:0x03ac }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0431 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0501 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0148  */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.media.MediaMetadataRetriever] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r02;
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        ?? r42;
        ?? r72;
        String extensionFromMimeType;
        String str;
        ?? r62;
        int i7;
        ?? r92;
        int i10;
        final int i11;
        final int i12;
        int ceil;
        final int i13;
        final int i14;
        final int i15;
        final int i16;
        final String str2;
        Pair N0;
        int i17;
        String y22;
        int i18;
        boolean z9;
        TLRPC.User user;
        int i19;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        switch (this.a) {
            case 0:
                final t3 t3Var = (t3) this.d;
                Uri uri = (Uri) this.e;
                String str3 = (String) this.f;
                final a aVar = (a) this.h;
                try {
                    r02 = org.telegram.messenger.g0.T0(uri);
                    inputStream = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    r02 = null;
                    inputStream = null;
                }
                final boolean z10 = this.c;
                int i20 = this.b;
                if (r02 == null || !a8.p0.B(r02)) {
                    Context context = t3Var.getContext();
                    try {
                        if (context != null) {
                            try {
                                inputStream3 = context.getContentResolver().openInputStream(uri);
                            } catch (Exception e11) {
                                e = e11;
                                inputStream3 = inputStream;
                                r42 = inputStream3;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream2 = inputStream;
                                r72 = inputStream;
                            }
                            if (inputStream3 != null) {
                                if (str3 != null) {
                                    try {
                                        extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                                    } catch (Exception e12) {
                                        e = e12;
                                        r42 = inputStream;
                                        a8.g(e, true);
                                        if (inputStream3 != null) {
                                        }
                                        if (r42 != 0) {
                                        }
                                        r02 = inputStream;
                                        str = r02;
                                        if (str == null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream2 = inputStream3;
                                        r72 = inputStream;
                                        if (inputStream2 != null) {
                                        }
                                        if (r72 != 0) {
                                        }
                                    }
                                } else {
                                    extensionFromMimeType = inputStream;
                                }
                                if (TextUtils.isEmpty(extensionFromMimeType)) {
                                    extensionFromMimeType = z10 ? "mp4" : "jpg";
                                }
                                File file = new File(w7.z(4), "rich_external_" + (-i20) + "_" + iz.p() + "." + extensionFromMimeType);
                                r42 = new FileOutputStream(file);
                                try {
                                    try {
                                        org.telegram.messenger.g0.D(inputStream3, r42);
                                        r02 = file.getAbsolutePath();
                                        try {
                                            inputStream3.close();
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            r42.close();
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        a8.g(e, true);
                                        if (inputStream3 != null) {
                                            try {
                                                inputStream3.close();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        if (r42 != 0) {
                                            r42.close();
                                        }
                                        r02 = inputStream;
                                        str = r02;
                                        if (str == null) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStream2 = inputStream3;
                                    r72 = r42;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                    if (r72 != 0) {
                                        throw th;
                                    }
                                    try {
                                        r72.close();
                                        throw th;
                                    } catch (Exception unused5) {
                                        throw th;
                                    }
                                }
                            } else if (inputStream3 != null) {
                                inputStream3.close();
                            }
                        }
                    } catch (Exception unused6) {
                    }
                    r02 = inputStream;
                }
                str = r02;
                if (str == null || !a8.p0.B(str)) {
                    return;
                }
                int i21 = 0;
                if (z10) {
                    try {
                        r92 = new MediaMetadataRetriever();
                        try {
                            try {
                                r92.setDataSource(str);
                                String extractMetadata = r92.extractMetadata(18);
                                String extractMetadata2 = r92.extractMetadata(19);
                                String extractMetadata3 = r92.extractMetadata(9);
                                i7 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                                if (extractMetadata2 != null) {
                                    try {
                                        i10 = Integer.parseInt(extractMetadata2);
                                    } catch (Exception e14) {
                                        e = e14;
                                        i10 = 0;
                                        a8.g(e, true);
                                        if (r92 != null) {
                                        }
                                        i11 = i10;
                                        i12 = 0;
                                        if (z10) {
                                        }
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: li.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean z11 = z10;
                                                gf gfVar = new gf(i15, str2, z11 ? i12 : 0, z11, i16, i11);
                                                gfVar.J = i13;
                                                gfVar.K = i14;
                                                t3 t3Var2 = t3.this;
                                                a aVar2 = aVar;
                                                if (aVar2 == null || !t3.G3(aVar2.b)) {
                                                    t3Var2.i2(gfVar);
                                                } else {
                                                    t3Var2.X1(aVar2, gfVar);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                } else {
                                    i10 = 0;
                                }
                                if (extractMetadata3 != null) {
                                    try {
                                        ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                    } catch (Exception e15) {
                                        e = e15;
                                        a8.g(e, true);
                                        if (r92 != null) {
                                            try {
                                                r92.release();
                                            } catch (Exception unused7) {
                                            }
                                        }
                                        i11 = i10;
                                        i12 = 0;
                                        if (z10) {
                                        }
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: li.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean z11 = z10;
                                                gf gfVar = new gf(i15, str2, z11 ? i12 : 0, z11, i16, i11);
                                                gfVar.J = i13;
                                                gfVar.K = i14;
                                                t3 t3Var2 = t3.this;
                                                a aVar2 = aVar;
                                                if (aVar2 == null || !t3.G3(aVar2.b)) {
                                                    t3Var2.i2(gfVar);
                                                } else {
                                                    t3Var2.X1(aVar2, gfVar);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                } else {
                                    ceil = 0;
                                }
                                try {
                                    r92.release();
                                } catch (Exception unused8) {
                                }
                                i11 = i10;
                                i12 = ceil;
                            } catch (Exception e16) {
                                e = e16;
                                i10 = 0;
                                i7 = 0;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r62 = r92;
                            if (r62 != null) {
                                try {
                                    r62.release();
                                } catch (Exception unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        i7 = 0;
                        r92 = inputStream;
                        i10 = 0;
                    } catch (Throwable th6) {
                        th = th6;
                        r62 = inputStream;
                    }
                } else {
                    i12 = 0;
                    i11 = 0;
                    i7 = 0;
                }
                if (z10) {
                    str2 = str;
                    i13 = 0;
                    i15 = i20;
                    i16 = i7;
                    i14 = 0;
                } else {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str, options);
                        i7 = options.outWidth;
                        i11 = options.outHeight;
                    } catch (Exception e18) {
                        a8.g(e18, true);
                    }
                    try {
                        N0 = org.telegram.messenger.g0.N0(str);
                        i13 = ((Integer) N0.first).intValue();
                    } catch (Exception e19) {
                        e = e19;
                        i13 = 0;
                    }
                    try {
                        i21 = ((Integer) N0.second).intValue();
                    } catch (Exception e20) {
                        e = e20;
                        a8.g(e, true);
                        int i22 = i7;
                        i14 = i21;
                        i15 = i20;
                        i16 = i22;
                        str2 = str;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: li.s2
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11 = z10;
                                gf gfVar = new gf(i15, str2, z11 ? i12 : 0, z11, i16, i11);
                                gfVar.J = i13;
                                gfVar.K = i14;
                                t3 t3Var2 = t3.this;
                                a aVar2 = aVar;
                                if (aVar2 == null || !t3.G3(aVar2.b)) {
                                    t3Var2.i2(gfVar);
                                } else {
                                    t3Var2.X1(aVar2, gfVar);
                                }
                            }
                        });
                        return;
                    }
                    int i222 = i7;
                    i14 = i21;
                    i15 = i20;
                    i16 = i222;
                    str2 = str;
                }
                org.telegram.messenger.g0.h3(new Runnable() { // from class: li.s2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z11 = z10;
                        gf gfVar = new gf(i15, str2, z11 ? i12 : 0, z11, i16, i11);
                        gfVar.J = i13;
                        gfVar.K = i14;
                        t3 t3Var2 = t3.this;
                        a aVar2 = aVar;
                        if (aVar2 == null || !t3.G3(aVar2.b)) {
                            t3Var2.i2(gfVar);
                        } else {
                            t3Var2.X1(aVar2, gfVar);
                        }
                    }
                });
                return;
            case 1:
                zt0 zt0Var = (zt0) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                ij ijVar = (ij) this.f;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.h;
                RLottieNative[] rLottieNativeArr = zt0Var.f1;
                RLottieNative[] rLottieNativeArr2 = zt0Var.i1;
                int[] iArr = zt0Var.e;
                if (zt0Var.W0) {
                    org.telegram.messenger.g0.h3(new xt0(zt0Var, 0));
                    return;
                }
                boolean z11 = false;
                int i23 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i24 = this.b;
                    if (i23 >= length) {
                        if (z11) {
                            org.telegram.messenger.g0.h3(new xt0(zt0Var, 1));
                            return;
                        } else {
                            org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.k0(zt0Var, this.c, i24, q1Var));
                            return;
                        }
                    }
                    if (i23 <= 2) {
                        if (rLottieNativeArr2[i23] == null) {
                            if (i23 == 0) {
                                int i25 = zt0Var.b1;
                                i17 = i25 == 1 ? 5 : i25 == 2 ? 6 : i25 == 3 ? 7 : i25 == 4 ? 4 : 3;
                            } else if (i23 == 1) {
                                int i26 = zt0Var.c1;
                                i17 = i26 == 1 ? 11 : i26 == 2 ? 12 : i26 == 3 ? 13 : i26 == 4 ? 10 : 9;
                            } else {
                                int i27 = zt0Var.d1;
                                i17 = i27 == 1 ? 17 : i27 == 2 ? 18 : i27 == 3 ? 19 : i27 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i17);
                            w7.G(p10.s0);
                            y22 = org.telegram.messenger.g0.y2(w7.K(document, null, true, true), 0);
                            if (TextUtils.isEmpty(y22)) {
                                RLottieNative b10 = RLottieNative.b(y22, iArr, null, null);
                                if (i23 <= 2) {
                                    rLottieNativeArr2[i23] = b10;
                                    zt0Var.j1[i23] = iArr[0];
                                } else {
                                    rLottieNativeArr[i23 == 3 ? (char) 0 : (char) 4] = b10;
                                    zt0Var.g1[i23 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                org.telegram.messenger.g0.h3(new yt0(document, i24, ijVar, q1Var, tL_messages_stickerSet, 0));
                                z11 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i23] == null) {
                        i17 = i23 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i17);
                        w7.G(p10.s0);
                        y22 = org.telegram.messenger.g0.y2(w7.K(document2, null, true, true), 0);
                        if (TextUtils.isEmpty(y22)) {
                        }
                    }
                    i23++;
                }
            case 2:
                Activity activity = (Activity) this.d;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.e;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.y1.a = 0L;
                org.telegram.ui.Components.voip.y1.g(activity, this.b, inputGroupCall, this.c, groupCall, hashSet);
                return;
            case 3:
                xm0 xm0Var = (xm0) this.d;
                String str4 = (String) this.f;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user2 = (TLRPC.User) this.h;
                HashMap hashMap = xm0Var.h;
                ArrayList arrayList = xm0Var.f;
                ArrayList arrayList2 = xm0Var.n;
                int size = arrayList2.size();
                int i28 = 0;
                int i29 = 0;
                while (true) {
                    if (i29 < size) {
                        if (((String) arrayList2.get(i29)).equalsIgnoreCase(str4)) {
                            arrayList2.remove(i29);
                        } else {
                            i29++;
                        }
                    }
                }
                arrayList2.add(0, str4);
                while (arrayList2.size() > 20) {
                    a8.p0.z(1, arrayList2);
                }
                xm0Var.h0();
                if (this.b != xm0Var.D) {
                    return;
                }
                int size2 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    xm0Var.x = messages_botresults.next_offset;
                    int size3 = messages_botresults.results.size();
                    int i30 = 0;
                    i18 = 0;
                    while (i30 < size3) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i30);
                        boolean z12 = this.c;
                        if ((z12 || "photo".equals(botInlineResult.type)) && ((!z12 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            kf kfVar = new kf();
                            if (!z12 || botInlineResult.document == null) {
                                user = user2;
                                i19 = size3;
                                if (!z12 && (photo = botInlineResult.photo) != null) {
                                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                                    TLRPC.PhotoSize w11 = w7.w(botInlineResult.photo.sizes, qs.r5, false, null, false);
                                    if (w10 != null) {
                                        kfVar.E = w10.w;
                                        kfVar.F = w10.h;
                                        kfVar.L = w10;
                                        kfVar.K = botInlineResult.photo;
                                        kfVar.G = w10.size;
                                        kfVar.M = w11;
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i31 = 0;
                                    while (true) {
                                        if (i31 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i31);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                kfVar.E = documentAttribute.w;
                                                kfVar.F = documentAttribute.h;
                                            } else {
                                                i31++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        kfVar.D = webDocument.url;
                                    } else {
                                        kfVar.D = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    kfVar.C = webDocument2.url;
                                    kfVar.G = z12 ? 0 : webDocument2.size;
                                }
                            } else {
                                for (int i32 = i28; i32 < botInlineResult.document.attributes.size(); i32++) {
                                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.document.attributes.get(i32);
                                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                                        kfVar.E = documentAttribute2.w;
                                        kfVar.F = documentAttribute2.h;
                                        kfVar.J = botInlineResult.document;
                                        kfVar.G = 0;
                                        photo2 = botInlineResult.photo;
                                        if (photo2 == null) {
                                            user = user2;
                                            i19 = size3;
                                            TLRPC.PhotoSize w12 = w7.w(photo2.sizes, xm0Var.R, true, null, false);
                                            if (w12 != null) {
                                                botInlineResult.document.thumbs.add(w12);
                                                botInlineResult.document.flags |= 1;
                                            }
                                        } else {
                                            user = user2;
                                            i19 = size3;
                                        }
                                    }
                                }
                                kfVar.J = botInlineResult.document;
                                kfVar.G = 0;
                                photo2 = botInlineResult.photo;
                                if (photo2 == null) {
                                }
                            }
                            kfVar.B = botInlineResult.id;
                            kfVar.H = z12 ? 1 : 0;
                            kfVar.N = botInlineResult;
                            HashMap hashMap2 = new HashMap();
                            kfVar.O = hashMap2;
                            hashMap2.put("id", botInlineResult.id);
                            kfVar.O.put("query_id", "" + messages_botresults.query_id);
                            kfVar.O.put("bot_name", t10.n(user));
                            arrayList.add(kfVar);
                            hashMap.put(kfVar.B, kfVar);
                            i18++;
                        } else {
                            user = user2;
                            i19 = size3;
                        }
                        i30++;
                        user2 = user;
                        size3 = i19;
                        i28 = 0;
                    }
                    xm0Var.s = size2 == arrayList.size() || xm0Var.x == null;
                } else {
                    i18 = 0;
                }
                xm0Var.r = false;
                if (i18 != 0) {
                    xm0Var.L.o(size2, i18);
                } else if (xm0Var.s) {
                    z9 = true;
                    xm0Var.L.s(arrayList.size() - 1);
                    if (arrayList.size() > 0) {
                        xm0Var.N.e(false, z9);
                        return;
                    }
                    return;
                }
                z9 = true;
                if (arrayList.size() > 0) {
                }
                break;
            default:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) this.d;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.e;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) this.f;
                v10 v10Var = (v10) this.h;
                boolean z13 = this.c;
                int i33 = this.b;
                WalletEngine2.ImportedWalletProof importedWalletProof = null;
                try {
                    try {
                        WalletEngine2.ImportedWalletProof createImportProof = z13 ? WalletEngine2.createImportProof(k0Var, proofchallenge.domain, proofchallenge.payload, i33) : WalletEngine2.createOwnershipProof(k0Var, proofchallenge.domain, proofchallenge.payload, i33);
                        k0Var.close();
                        importedWalletProof = createImportProof;
                        e = null;
                    } catch (Exception e21) {
                        e = e21;
                        org.telegram.ui.Wallet.n0.k("createImportProof", e);
                        k0Var.close();
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(n0Var, importedWalletProof, e, v10Var));
                    return;
                } catch (Throwable th7) {
                    k0Var.close();
                    throw th7;
                }
        }
    }

    public /* synthetic */ p2(t3 t3Var, Uri uri, boolean z9, String str, int i7, a aVar) {
        this.d = t3Var;
        this.e = uri;
        this.c = z9;
        this.f = str;
        this.b = i7;
        this.h = aVar;
    }

    public /* synthetic */ p2(zt0 zt0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, ij ijVar, org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        this.d = zt0Var;
        this.e = tL_messages_stickerSet;
        this.b = i7;
        this.f = ijVar;
        this.h = q1Var;
        this.c = z9;
    }

    public /* synthetic */ p2(xm0 xm0Var, String str, int i7, TLObject tLObject, boolean z9, TLRPC.User user) {
        this.d = xm0Var;
        this.f = str;
        this.b = i7;
        this.e = tLObject;
        this.c = z9;
        this.h = user;
    }

    public /* synthetic */ p2(org.telegram.ui.Wallet.n0 n0Var, boolean z9, org.telegram.ui.Wallet.k0 k0Var, TL_wallet.proofChallenge proofchallenge, int i7, v10 v10Var) {
        this.d = n0Var;
        this.c = z9;
        this.e = k0Var;
        this.f = proofchallenge;
        this.b = i7;
        this.h = v10Var;
    }
}

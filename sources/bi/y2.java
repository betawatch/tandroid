package bi;

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
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hf;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.lo0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ y2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.b = i10;
        this.e = inputGroupCall;
        this.c = z10;
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
        int i10;
        ?? r92;
        int i11;
        final int i12;
        final int i13;
        int ceil;
        final int i14;
        final int i15;
        final int i16;
        final int i17;
        final String str2;
        Pair N0;
        int i18;
        String y22;
        int i19;
        boolean z10;
        TLRPC.User user;
        int i20;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        switch (this.a) {
            case 0:
                final d4 d4Var = (d4) this.d;
                Uri uri = (Uri) this.e;
                String str3 = (String) this.f;
                final a aVar = (a) this.h;
                try {
                    r02 = org.telegram.messenger.i0.T0(uri);
                    inputStream = null;
                } catch (Exception e) {
                    f8.g(e, true);
                    r02 = null;
                    inputStream = null;
                }
                final boolean z11 = this.c;
                int i21 = this.b;
                if (r02 == null || !sc.e.x(r02)) {
                    Context context = d4Var.getContext();
                    try {
                        if (context != null) {
                            try {
                                inputStream3 = context.getContentResolver().openInputStream(uri);
                            } catch (Exception e7) {
                                e = e7;
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
                                    } catch (Exception e10) {
                                        e = e10;
                                        r42 = inputStream;
                                        f8.g(e, true);
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
                                    extensionFromMimeType = z11 ? "mp4" : "jpg";
                                }
                                File file = new File(b8.z(4), "rich_external_" + (-i21) + "_" + tz.p() + "." + extensionFromMimeType);
                                r42 = new FileOutputStream(file);
                                try {
                                    try {
                                        org.telegram.messenger.i0.D(inputStream3, r42);
                                        r02 = file.getAbsolutePath();
                                        try {
                                            inputStream3.close();
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            r42.close();
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        f8.g(e, true);
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
                if (str == null || !sc.e.x(str)) {
                    return;
                }
                int i22 = 0;
                if (z11) {
                    try {
                        r92 = new MediaMetadataRetriever();
                        try {
                            try {
                                r92.setDataSource(str);
                                String extractMetadata = r92.extractMetadata(18);
                                String extractMetadata2 = r92.extractMetadata(19);
                                String extractMetadata3 = r92.extractMetadata(9);
                                i10 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                                if (extractMetadata2 != null) {
                                    try {
                                        i11 = Integer.parseInt(extractMetadata2);
                                    } catch (Exception e12) {
                                        e = e12;
                                        i11 = 0;
                                        f8.g(e, true);
                                        if (r92 != null) {
                                        }
                                        i12 = i11;
                                        i13 = 0;
                                        if (z11) {
                                        }
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: bi.c3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean z12 = z11;
                                                ef efVar = new ef(i16, str2, z12 ? i13 : 0, z12, i17, i12);
                                                efVar.J = i14;
                                                efVar.K = i15;
                                                d4 d4Var2 = d4.this;
                                                a aVar2 = aVar;
                                                if (aVar2 == null || !d4.G3(aVar2.b)) {
                                                    d4Var2.i2(efVar);
                                                } else {
                                                    d4Var2.W1(aVar2, efVar);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                } else {
                                    i11 = 0;
                                }
                                if (extractMetadata3 != null) {
                                    try {
                                        ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                    } catch (Exception e13) {
                                        e = e13;
                                        f8.g(e, true);
                                        if (r92 != null) {
                                            try {
                                                r92.release();
                                            } catch (Exception unused7) {
                                            }
                                        }
                                        i12 = i11;
                                        i13 = 0;
                                        if (z11) {
                                        }
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: bi.c3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean z12 = z11;
                                                ef efVar = new ef(i16, str2, z12 ? i13 : 0, z12, i17, i12);
                                                efVar.J = i14;
                                                efVar.K = i15;
                                                d4 d4Var2 = d4.this;
                                                a aVar2 = aVar;
                                                if (aVar2 == null || !d4.G3(aVar2.b)) {
                                                    d4Var2.i2(efVar);
                                                } else {
                                                    d4Var2.W1(aVar2, efVar);
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
                                i12 = i11;
                                i13 = ceil;
                            } catch (Exception e14) {
                                e = e14;
                                i11 = 0;
                                i10 = 0;
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
                    } catch (Exception e15) {
                        e = e15;
                        i10 = 0;
                        r92 = inputStream;
                        i11 = 0;
                    } catch (Throwable th6) {
                        th = th6;
                        r62 = inputStream;
                    }
                } else {
                    i13 = 0;
                    i12 = 0;
                    i10 = 0;
                }
                if (z11) {
                    str2 = str;
                    i14 = 0;
                    i16 = i21;
                    i17 = i10;
                    i15 = 0;
                } else {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str, options);
                        i10 = options.outWidth;
                        i12 = options.outHeight;
                    } catch (Exception e16) {
                        f8.g(e16, true);
                    }
                    try {
                        N0 = org.telegram.messenger.i0.N0(str);
                        i14 = ((Integer) N0.first).intValue();
                    } catch (Exception e17) {
                        e = e17;
                        i14 = 0;
                    }
                    try {
                        i22 = ((Integer) N0.second).intValue();
                    } catch (Exception e18) {
                        e = e18;
                        f8.g(e, true);
                        int i23 = i10;
                        i15 = i22;
                        i16 = i21;
                        i17 = i23;
                        str2 = str;
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: bi.c3
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z12 = z11;
                                ef efVar = new ef(i16, str2, z12 ? i13 : 0, z12, i17, i12);
                                efVar.J = i14;
                                efVar.K = i15;
                                d4 d4Var2 = d4.this;
                                a aVar2 = aVar;
                                if (aVar2 == null || !d4.G3(aVar2.b)) {
                                    d4Var2.i2(efVar);
                                } else {
                                    d4Var2.W1(aVar2, efVar);
                                }
                            }
                        });
                        return;
                    }
                    int i232 = i10;
                    i15 = i22;
                    i16 = i21;
                    i17 = i232;
                    str2 = str;
                }
                org.telegram.messenger.i0.g3(new Runnable() { // from class: bi.c3
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z12 = z11;
                        ef efVar = new ef(i16, str2, z12 ? i13 : 0, z12, i17, i12);
                        efVar.J = i14;
                        efVar.K = i15;
                        d4 d4Var2 = d4.this;
                        a aVar2 = aVar;
                        if (aVar2 == null || !d4.G3(aVar2.b)) {
                            d4Var2.i2(efVar);
                        } else {
                            d4Var2.W1(aVar2, efVar);
                        }
                    }
                });
                return;
            case 1:
                cv0 cv0Var = (cv0) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                jj jjVar = (jj) this.f;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.h;
                RLottieNative[] rLottieNativeArr = cv0Var.f1;
                RLottieNative[] rLottieNativeArr2 = cv0Var.i1;
                int[] iArr = cv0Var.e;
                if (cv0Var.W0) {
                    org.telegram.messenger.i0.g3(new av0(cv0Var, 0));
                    return;
                }
                boolean z12 = false;
                int i24 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i25 = this.b;
                    if (i24 >= length) {
                        if (z12) {
                            org.telegram.messenger.i0.g3(new av0(cv0Var, 1));
                            return;
                        } else {
                            org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.p0(cv0Var, this.c, i25, q1Var));
                            return;
                        }
                    }
                    if (i24 <= 2) {
                        if (rLottieNativeArr2[i24] == null) {
                            if (i24 == 0) {
                                int i26 = cv0Var.b1;
                                i18 = i26 == 1 ? 5 : i26 == 2 ? 6 : i26 == 3 ? 7 : i26 == 4 ? 4 : 3;
                            } else if (i24 == 1) {
                                int i27 = cv0Var.c1;
                                i18 = i27 == 1 ? 11 : i27 == 2 ? 12 : i27 == 3 ? 13 : i27 == 4 ? 10 : 9;
                            } else {
                                int i28 = cv0Var.d1;
                                i18 = i28 == 1 ? 17 : i28 == 2 ? 18 : i28 == 3 ? 19 : i28 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i18);
                            b8.G(d20.s0);
                            y22 = org.telegram.messenger.i0.y2(b8.K(document, null, true, true), 0);
                            if (TextUtils.isEmpty(y22)) {
                                RLottieNative b10 = RLottieNative.b(y22, iArr, null, null);
                                if (i24 <= 2) {
                                    rLottieNativeArr2[i24] = b10;
                                    cv0Var.j1[i24] = iArr[0];
                                } else {
                                    rLottieNativeArr[i24 == 3 ? (char) 0 : (char) 4] = b10;
                                    cv0Var.g1[i24 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                org.telegram.messenger.i0.g3(new bv0(document, i25, jjVar, q1Var, tL_messages_stickerSet, 0));
                                z12 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i24] == null) {
                        i18 = i24 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i18);
                        b8.G(d20.s0);
                        y22 = org.telegram.messenger.i0.y2(b8.K(document2, null, true, true), 0);
                        if (TextUtils.isEmpty(y22)) {
                        }
                    }
                    i24++;
                }
            case 2:
                Activity activity = (Activity) this.d;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.e;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.m1.a = 0L;
                org.telegram.ui.Components.voip.m1.g(activity, this.b, inputGroupCall, this.c, groupCall, hashSet);
                return;
            case 3:
                lo0 lo0Var = (lo0) this.d;
                String str4 = (String) this.f;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user2 = (TLRPC.User) this.h;
                HashMap hashMap = lo0Var.h;
                ArrayList arrayList = lo0Var.f;
                ArrayList arrayList2 = lo0Var.n;
                int size = arrayList2.size();
                int i29 = 0;
                int i30 = 0;
                while (true) {
                    if (i30 < size) {
                        if (((String) arrayList2.get(i30)).equalsIgnoreCase(str4)) {
                            arrayList2.remove(i30);
                        } else {
                            i30++;
                        }
                    }
                }
                arrayList2.add(0, str4);
                while (arrayList2.size() > 20) {
                    a1.g.x(1, arrayList2);
                }
                lo0Var.g0();
                if (this.b != lo0Var.D) {
                    return;
                }
                int size2 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    lo0Var.x = messages_botresults.next_offset;
                    int size3 = messages_botresults.results.size();
                    int i31 = 0;
                    i19 = 0;
                    while (i31 < size3) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i31);
                        boolean z13 = this.c;
                        if ((z13 || "photo".equals(botInlineResult.type)) && ((!z13 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            hf hfVar = new hf();
                            if (!z13 || botInlineResult.document == null) {
                                user = user2;
                                i20 = size3;
                                if (!z13 && (photo = botInlineResult.photo) != null) {
                                    TLRPC.PhotoSize w9 = b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
                                    TLRPC.PhotoSize w10 = b8.w(botInlineResult.photo.sizes, zs.r5, false, null, false);
                                    if (w9 != null) {
                                        hfVar.E = w9.w;
                                        hfVar.F = w9.h;
                                        hfVar.L = w9;
                                        hfVar.K = botInlineResult.photo;
                                        hfVar.G = w9.size;
                                        hfVar.M = w10;
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i32);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                hfVar.E = documentAttribute.w;
                                                hfVar.F = documentAttribute.h;
                                            } else {
                                                i32++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        hfVar.D = webDocument.url;
                                    } else {
                                        hfVar.D = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    hfVar.C = webDocument2.url;
                                    hfVar.G = z13 ? 0 : webDocument2.size;
                                }
                            } else {
                                for (int i33 = i29; i33 < botInlineResult.document.attributes.size(); i33++) {
                                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.document.attributes.get(i33);
                                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                                        hfVar.E = documentAttribute2.w;
                                        hfVar.F = documentAttribute2.h;
                                        hfVar.J = botInlineResult.document;
                                        hfVar.G = 0;
                                        photo2 = botInlineResult.photo;
                                        if (photo2 == null) {
                                            user = user2;
                                            i20 = size3;
                                            TLRPC.PhotoSize w11 = b8.w(photo2.sizes, lo0Var.R, true, null, false);
                                            if (w11 != null) {
                                                botInlineResult.document.thumbs.add(w11);
                                                botInlineResult.document.flags |= 1;
                                            }
                                        } else {
                                            user = user2;
                                            i20 = size3;
                                        }
                                    }
                                }
                                hfVar.J = botInlineResult.document;
                                hfVar.G = 0;
                                photo2 = botInlineResult.photo;
                                if (photo2 == null) {
                                }
                            }
                            hfVar.B = botInlineResult.id;
                            hfVar.H = z13 ? 1 : 0;
                            hfVar.N = botInlineResult;
                            HashMap hashMap2 = new HashMap();
                            hfVar.O = hashMap2;
                            hashMap2.put("id", botInlineResult.id);
                            hfVar.O.put("query_id", "" + messages_botresults.query_id);
                            hfVar.O.put("bot_name", h20.n(user));
                            arrayList.add(hfVar);
                            hashMap.put(hfVar.B, hfVar);
                            i19++;
                        } else {
                            user = user2;
                            i20 = size3;
                        }
                        i31++;
                        user2 = user;
                        size3 = i20;
                        i29 = 0;
                    }
                    lo0Var.s = size2 == arrayList.size() || lo0Var.x == null;
                } else {
                    i19 = 0;
                }
                lo0Var.r = false;
                if (i19 != 0) {
                    lo0Var.L.o(size2, i19);
                } else if (lo0Var.s) {
                    z10 = true;
                    lo0Var.L.s(arrayList.size() - 1);
                    if (arrayList.size() > 0) {
                        lo0Var.N.e(false, z10);
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
                j20 j20Var = (j20) this.h;
                boolean z14 = this.c;
                int i34 = this.b;
                WalletEngine2.ImportedWalletProof importedWalletProof = null;
                try {
                    try {
                        WalletEngine2.ImportedWalletProof createImportProof = z14 ? WalletEngine2.createImportProof(h0Var, proofchallenge.domain, proofchallenge.payload, i34) : WalletEngine2.createOwnershipProof(h0Var, proofchallenge.domain, proofchallenge.payload, i34);
                        h0Var.close();
                        importedWalletProof = createImportProof;
                        e = null;
                    } catch (Exception e19) {
                        e = e19;
                        org.telegram.ui.Wallet.k0.k("createImportProof", e);
                        h0Var.close();
                    }
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.g(k0Var, importedWalletProof, e, j20Var));
                    return;
                } catch (Throwable th7) {
                    h0Var.close();
                    throw th7;
                }
        }
    }

    public /* synthetic */ y2(d4 d4Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.d = d4Var;
        this.e = uri;
        this.c = z10;
        this.f = str;
        this.b = i10;
        this.h = aVar;
    }

    public /* synthetic */ y2(cv0 cv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, jj jjVar, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        this.d = cv0Var;
        this.e = tL_messages_stickerSet;
        this.b = i10;
        this.f = jjVar;
        this.h = q1Var;
        this.c = z10;
    }

    public /* synthetic */ y2(lo0 lo0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.d = lo0Var;
        this.f = str;
        this.b = i10;
        this.e = tLObject;
        this.c = z10;
        this.h = user;
    }

    public /* synthetic */ y2(org.telegram.ui.Wallet.k0 k0Var, boolean z10, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.proofChallenge proofchallenge, int i10, j20 j20Var) {
        this.d = k0Var;
        this.c = z10;
        this.e = h0Var;
        this.f = proofchallenge;
        this.b = i10;
        this.h = j20Var;
    }
}

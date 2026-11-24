// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class m05 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m05(u58 u58Var, String str, int i, TLObject tLObject, boolean z, TLRPC.User user) {
        this.a = (byte) 1;
        this.d = u58Var;
        this.e = str;
        this.b = i;
        this.f = tLObject;
        this.c = z;
        this.h = user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0358 A[Catch: Exception -> 0x035b, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x035b, blocks: (B:240:0x02e0, B:267:0x0358), top: B:233:0x02d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0353 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x043e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0439 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019f  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r4v32, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z;
        int i2;
        TLRPC.Photo photo;
        String str;
        ?? r5;
        FileOutputStream fileOutputStream;
        String extensionFromMimeType;
        final String str2;
        int i3;
        int i4;
        int ceil;
        final int i5;
        int i6;
        final int i7;
        final int i8;
        final int i9;
        Pair N0;
        final int intValue;
        boolean z2;
        int i10;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputMedia inputMedia2;
        int i11;
        TLRPC.TL_inputSingleMedia tL_inputSingleMedia;
        TLRPC.InputMedia inputMedia3;
        int i12;
        int i13;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        gb2 gb2Var;
        String v2;
        byte b = this.a;
        int i14 = 4;
        int i15 = this.b;
        boolean z3 = this.c;
        WalletEngine2.ImportedWalletProof importedWalletProof = null;
        r11 = null;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        InputStream inputStream = null;
        ?? r13 = true;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                c cVar = (c) obj4;
                y05 y05Var = (y05) obj3;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj2;
                i8c i8cVar = (i8c) obj;
                try {
                    try {
                        String str3 = proofchallenge.domain;
                        WalletEngine2.ImportedWalletProof createImportProof = z3 ? WalletEngine2.createImportProof(y05Var, str3, proofchallenge.payload, i15) : WalletEngine2.createOwnershipProof(y05Var, str3, proofchallenge.payload, i15);
                        y05Var.close();
                        importedWalletProof = createImportProof;
                        e = null;
                    } catch (Exception e) {
                        e = e;
                        c.n("createImportProof", e);
                        y05Var.close();
                    }
                    gl.c3(new jf4(cVar, importedWalletProof, e, i8cVar));
                    return;
                } catch (Throwable th) {
                    y05Var.close();
                    throw th;
                }
            case 1:
                u58 u58Var = (u58) obj4;
                String str4 = (String) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                HashMap hashMap = u58Var.h;
                ArrayList arrayList = u58Var.f;
                ArrayList arrayList2 = u58Var.n;
                int size = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size) {
                        if (((String) arrayList2.get(i16)).equalsIgnoreCase(str4)) {
                            arrayList2.remove(i16);
                        } else {
                            i16++;
                        }
                    }
                }
                arrayList2.add(0, str4);
                while (arrayList2.size() > 20) {
                    tb4.v(1, arrayList2);
                }
                u58Var.g0();
                if (i15 != u58Var.E) {
                    return;
                }
                int size2 = arrayList.size();
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    u58Var.x = messages_botresults.next_offset;
                    int i17 = 0;
                    int i18 = 0;
                    for (int size3 = messages_botresults.results.size(); i17 < size3; size3 = i2) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
                        if (z3 ? "gif".equals(botInlineResult.type) : "photo".equals(botInlineResult.type)) {
                            if (!hashMap.containsKey(botInlineResult.id)) {
                                nm6 nm6Var = new nm6();
                                if (!z3) {
                                    i2 = size3;
                                    TLRPC.Photo photo2 = botInlineResult.photo;
                                    if (photo2 != null) {
                                        TLRPC.PhotoSize w = ba4.w(photo2.sizes, gl.Y0(false), false, null, false);
                                        TLRPC.PhotoSize w2 = ba4.w(botInlineResult.photo.sizes, kk7.q5, false, null, false);
                                        if (w != null) {
                                            nm6Var.E = w.w;
                                            nm6Var.F = w.h;
                                            nm6Var.L = w;
                                            nm6Var.K = botInlineResult.photo;
                                            nm6Var.G = w.size;
                                            nm6Var.M = w2;
                                            nm6Var.B = botInlineResult.id;
                                            nm6Var.H = z3;
                                            nm6Var.N = botInlineResult;
                                            HashMap hashMap2 = new HashMap();
                                            nm6Var.O = hashMap2;
                                            hashMap2.put("id", botInlineResult.id);
                                            nm6Var.O.put("query_id", String.valueOf(messages_botresults.query_id));
                                            nm6Var.O.put("bot_name", l7c.p(user));
                                            arrayList.add(nm6Var);
                                            hashMap.put(nm6Var.B, nm6Var);
                                            i18++;
                                        }
                                    }
                                    if (botInlineResult.content == null) {
                                    }
                                } else if (botInlineResult.document != null) {
                                    for (int i19 = 0; i19 < botInlineResult.document.attributes.size(); i19++) {
                                        TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i19);
                                        if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                            nm6Var.E = documentAttribute.w;
                                            nm6Var.F = documentAttribute.h;
                                            nm6Var.J = botInlineResult.document;
                                            nm6Var.G = 0;
                                            photo = botInlineResult.photo;
                                            if (photo == null) {
                                                i2 = size3;
                                                TLRPC.PhotoSize w3 = ba4.w(photo.sizes, u58Var.S, true, null, false);
                                                if (w3 != null) {
                                                    botInlineResult.document.thumbs.add(w3);
                                                    botInlineResult.document.flags |= 1;
                                                }
                                            } else {
                                                i2 = size3;
                                            }
                                            nm6Var.B = botInlineResult.id;
                                            nm6Var.H = z3;
                                            nm6Var.N = botInlineResult;
                                            HashMap hashMap22 = new HashMap();
                                            nm6Var.O = hashMap22;
                                            hashMap22.put("id", botInlineResult.id);
                                            nm6Var.O.put("query_id", String.valueOf(messages_botresults.query_id));
                                            nm6Var.O.put("bot_name", l7c.p(user));
                                            arrayList.add(nm6Var);
                                            hashMap.put(nm6Var.B, nm6Var);
                                            i18++;
                                        }
                                    }
                                    nm6Var.J = botInlineResult.document;
                                    nm6Var.G = 0;
                                    photo = botInlineResult.photo;
                                    if (photo == null) {
                                    }
                                    nm6Var.B = botInlineResult.id;
                                    nm6Var.H = z3;
                                    nm6Var.N = botInlineResult;
                                    HashMap hashMap222 = new HashMap();
                                    nm6Var.O = hashMap222;
                                    hashMap222.put("id", botInlineResult.id);
                                    nm6Var.O.put("query_id", String.valueOf(messages_botresults.query_id));
                                    nm6Var.O.put("bot_name", l7c.p(user));
                                    arrayList.add(nm6Var);
                                    hashMap.put(nm6Var.B, nm6Var);
                                    i18++;
                                } else {
                                    i2 = size3;
                                    if (botInlineResult.content == null) {
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i20);
                                                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    nm6Var.E = documentAttribute2.w;
                                                    nm6Var.F = documentAttribute2.h;
                                                } else {
                                                    i20++;
                                                }
                                            }
                                        }
                                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            nm6Var.D = webDocument.url;
                                        } else {
                                            nm6Var.D = null;
                                        }
                                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                        nm6Var.C = webDocument2.url;
                                        nm6Var.G = z3 ? 0 : webDocument2.size;
                                        nm6Var.B = botInlineResult.id;
                                        nm6Var.H = z3;
                                        nm6Var.N = botInlineResult;
                                        HashMap hashMap2222 = new HashMap();
                                        nm6Var.O = hashMap2222;
                                        hashMap2222.put("id", botInlineResult.id);
                                        nm6Var.O.put("query_id", String.valueOf(messages_botresults.query_id));
                                        nm6Var.O.put("bot_name", l7c.p(user));
                                        arrayList.add(nm6Var);
                                        hashMap.put(nm6Var.B, nm6Var);
                                        i18++;
                                    }
                                }
                                i17++;
                            }
                        }
                        i2 = size3;
                        i17++;
                    }
                    u58Var.s = size2 == arrayList.size() || u58Var.x == null;
                    i = i18;
                } else {
                    i = 0;
                }
                u58Var.r = false;
                if (i != 0) {
                    u58Var.M.p(size2, i);
                } else if (u58Var.s) {
                    z = true;
                    u58Var.M.r(arrayList.size() - 1);
                    if (arrayList.size() > 0) {
                        u58Var.O.e(false, z);
                        return;
                    }
                    return;
                }
                z = true;
                if (arrayList.size() > 0) {
                }
                break;
            case 2:
                final ye9 ye9Var = (ye9) obj4;
                ?? r4 = (Uri) obj3;
                String str5 = (String) obj2;
                final lk0 lk0Var = (lk0) obj;
                try {
                    str = gl.S0(r4);
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    str = null;
                }
                final boolean z4 = this.c;
                final int i21 = this.b;
                if (str == null || !oo1.t(str)) {
                    Context context = ye9Var.getContext();
                    try {
                        try {
                            if (context != null) {
                                try {
                                    r4 = context.getContentResolver().openInputStream(r4);
                                } catch (Exception e3) {
                                    e = e3;
                                    r4 = 0;
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r5 = 0;
                                    if (inputStream != null) {
                                    }
                                    if (r5 != 0) {
                                    }
                                }
                                if (r4 != 0) {
                                    if (str5 != null) {
                                        try {
                                            extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str5);
                                        } catch (Exception e4) {
                                            e = e4;
                                            fileOutputStream = null;
                                            fa4.g(e, true);
                                            if (r4 != 0) {
                                            }
                                            if (fileOutputStream != null) {
                                            }
                                            str = null;
                                            str2 = str;
                                            if (str2 == null) {
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            context = null;
                                            inputStream = r4;
                                            r5 = context;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused) {
                                                }
                                            }
                                            if (r5 != 0) {
                                                throw th;
                                            }
                                            try {
                                                r5.close();
                                                throw th;
                                            } catch (Exception unused2) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        extensionFromMimeType = null;
                                    }
                                    if (TextUtils.isEmpty(extensionFromMimeType)) {
                                        extensionFromMimeType = z4 ? "mp4" : "jpg";
                                    }
                                    File file = new File(ba4.z(4), "rich_external_" + (-i21) + "_" + gba.p() + "." + extensionFromMimeType);
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        gl.D(r4, fileOutputStream);
                                        str = file.getAbsolutePath();
                                        try {
                                            r4.close();
                                        } catch (Exception unused3) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception unused4) {
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        fa4.g(e, true);
                                        if (r4 != 0) {
                                            try {
                                                r4.close();
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
                                } else if (r4 != 0) {
                                    r4.close();
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
                if (str2 == null || !oo1.t(str2)) {
                    return;
                }
                if (z4) {
                    try {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                            try {
                                try {
                                    mediaMetadataRetriever2.setDataSource(str2);
                                    String extractMetadata = mediaMetadataRetriever2.extractMetadata(18);
                                    String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(19);
                                    String extractMetadata3 = mediaMetadataRetriever2.extractMetadata(9);
                                    i4 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                                    if (extractMetadata2 != null) {
                                        try {
                                            i3 = Integer.parseInt(extractMetadata2);
                                        } catch (Exception e6) {
                                            e = e6;
                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                            i3 = 0;
                                            fa4.g(e, true);
                                            if (mediaMetadataRetriever != null) {
                                            }
                                            i5 = 0;
                                            if (!z4) {
                                            }
                                            intValue = 0;
                                            gl.c3(new Runnable() { // from class: xd9
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z5 = z4;
                                                    jm6 jm6Var = new jm6(i21, str2, z5 ? i5 : 0, z5, i9, i8);
                                                    jm6Var.J = i7;
                                                    jm6Var.K = intValue;
                                                    ye9 ye9Var2 = ye9.this;
                                                    lk0 lk0Var2 = lk0Var;
                                                    if (lk0Var2 == null || !ye9.z3(lk0Var2.b)) {
                                                        ye9Var2.a2(jm6Var);
                                                    } else {
                                                        ye9Var2.P1(lk0Var2, jm6Var);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    } else {
                                        i3 = 0;
                                    }
                                    if (extractMetadata3 != null) {
                                        try {
                                            ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                        } catch (Exception e7) {
                                            e = e7;
                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                            fa4.g(e, true);
                                            if (mediaMetadataRetriever != null) {
                                                try {
                                                    mediaMetadataRetriever.release();
                                                } catch (Exception unused7) {
                                                }
                                            }
                                            i5 = 0;
                                            if (!z4) {
                                            }
                                            intValue = 0;
                                            gl.c3(new Runnable() { // from class: xd9
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z5 = z4;
                                                    jm6 jm6Var = new jm6(i21, str2, z5 ? i5 : 0, z5, i9, i8);
                                                    jm6Var.J = i7;
                                                    jm6Var.K = intValue;
                                                    ye9 ye9Var2 = ye9.this;
                                                    lk0 lk0Var2 = lk0Var;
                                                    if (lk0Var2 == null || !ye9.z3(lk0Var2.b)) {
                                                        ye9Var2.a2(jm6Var);
                                                    } else {
                                                        ye9Var2.P1(lk0Var2, jm6Var);
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
                                    i5 = ceil;
                                } catch (Exception e8) {
                                    e = e8;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    i3 = 0;
                                    i4 = 0;
                                    fa4.g(e, true);
                                    if (mediaMetadataRetriever != null) {
                                    }
                                    i5 = 0;
                                    if (!z4) {
                                    }
                                    intValue = 0;
                                    gl.c3(new Runnable() { // from class: xd9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z5 = z4;
                                            jm6 jm6Var = new jm6(i21, str2, z5 ? i5 : 0, z5, i9, i8);
                                            jm6Var.J = i7;
                                            jm6Var.K = intValue;
                                            ye9 ye9Var2 = ye9.this;
                                            lk0 lk0Var2 = lk0Var;
                                            if (lk0Var2 == null || !ye9.z3(lk0Var2.b)) {
                                                ye9Var2.a2(jm6Var);
                                            } else {
                                                ye9Var2.P1(lk0Var2, jm6Var);
                                            }
                                        }
                                    });
                                    return;
                                }
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
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Exception e9) {
                        e = e9;
                    }
                    if (!z4) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(str2, options);
                            i4 = options.outWidth;
                            i3 = options.outHeight;
                        } catch (Exception e10) {
                            fa4.g(e10, true);
                        }
                        try {
                            N0 = gl.N0(str2);
                            i6 = ((Integer) N0.first).intValue();
                        } catch (Exception e11) {
                            e = e11;
                            i6 = 0;
                        }
                        try {
                            i7 = i6;
                            i8 = i3;
                            i9 = i4;
                            intValue = ((Integer) N0.second).intValue();
                        } catch (Exception e12) {
                            e = e12;
                            fa4.g(e, true);
                            i7 = i6;
                            i8 = i3;
                            i9 = i4;
                            intValue = 0;
                            gl.c3(new Runnable() { // from class: xd9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z5 = z4;
                                    jm6 jm6Var = new jm6(i21, str2, z5 ? i5 : 0, z5, i9, i8);
                                    jm6Var.J = i7;
                                    jm6Var.K = intValue;
                                    ye9 ye9Var2 = ye9.this;
                                    lk0 lk0Var2 = lk0Var;
                                    if (lk0Var2 == null || !ye9.z3(lk0Var2.b)) {
                                        ye9Var2.a2(jm6Var);
                                    } else {
                                        ye9Var2.P1(lk0Var2, jm6Var);
                                    }
                                }
                            });
                            return;
                        }
                        gl.c3(new Runnable() { // from class: xd9
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z5 = z4;
                                jm6 jm6Var = new jm6(i21, str2, z5 ? i5 : 0, z5, i9, i8);
                                jm6Var.J = i7;
                                jm6Var.K = intValue;
                                ye9 ye9Var2 = ye9.this;
                                lk0 lk0Var2 = lk0Var;
                                if (lk0Var2 == null || !ye9.z3(lk0Var2.b)) {
                                    ye9Var2.a2(jm6Var);
                                } else {
                                    ye9Var2.P1(lk0Var2, jm6Var);
                                }
                            }
                        });
                        return;
                    }
                    i8 = i3;
                    i9 = i4;
                    i7 = 0;
                    intValue = 0;
                    gl.c3(new Runnable() { // from class: xd9
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z5 = z4;
                            jm6 jm6Var = new jm6(i21, str2, z5 ? i5 : 0, z5, i9, i8);
                            jm6Var.J = i7;
                            jm6Var.K = intValue;
                            ye9 ye9Var2 = ye9.this;
                            lk0 lk0Var2 = lk0Var;
                            if (lk0Var2 == null || !ye9.z3(lk0Var2.b)) {
                                ye9Var2.a2(jm6Var);
                            } else {
                                ye9Var2.P1(lk0Var2, jm6Var);
                            }
                        }
                    });
                    return;
                }
                i3 = 0;
                i4 = 0;
                i5 = 0;
                if (!z4) {
                }
                intValue = 0;
                gl.c3(new Runnable() { // from class: xd9
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z5 = z4;
                        jm6 jm6Var = new jm6(i21, str2, z5 ? i5 : 0, z5, i9, i8);
                        jm6Var.J = i7;
                        jm6Var.K = intValue;
                        ye9 ye9Var2 = ye9.this;
                        lk0 lk0Var2 = lk0Var;
                        if (lk0Var2 == null || !ye9.z3(lk0Var2.b)) {
                            ye9Var2.a2(jm6Var);
                        } else {
                            ye9Var2.P1(lk0Var2, jm6Var);
                        }
                    }
                });
                return;
            case 3:
                z3a z3aVar = (z3a) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                k3a k3aVar = (k3a) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject2;
                    int size4 = tL_messages_sendMultiMedia.multi_media.size();
                    z2 = false;
                    while (i11 < size4) {
                        if (i15 >= 0) {
                            i11 = i15 != i11 ? i11 + 1 : 0;
                            z3aVar.h0(((k27) arrayList3.get(i11)).e1(), z3);
                            tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i11);
                            inputMedia3 = tL_inputSingleMedia.media;
                            if (!(inputMedia3 instanceof TLRPC.TL_inputMediaPhoto)) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) k3aVar.A.get(i11);
                            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) k3aVar.A.get(i11);
                            }
                            k3aVar.o = (oac) k3aVar.w.get(i11);
                            k3aVar.l = (String) k3aVar.v.get(i11);
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) k3aVar.u.get(i11);
                            k3aVar.g = photoSize;
                            k3aVar.p = true;
                            if (tL_inputSingleMedia.media.file != null || photoSize != null) {
                                z2 = true;
                            }
                            z3aVar.L(k3aVar, i11);
                        } else {
                            if (k3aVar.y.get(i11) == null) {
                            }
                            z3aVar.h0(((k27) arrayList3.get(i11)).e1(), z3);
                            tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i11);
                            inputMedia3 = tL_inputSingleMedia.media;
                            if (!(inputMedia3 instanceof TLRPC.TL_inputMediaPhoto)) {
                            }
                            k3aVar.o = (oac) k3aVar.w.get(i11);
                            k3aVar.l = (String) k3aVar.v.get(i11);
                            TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) k3aVar.u.get(i11);
                            k3aVar.g = photoSize2;
                            k3aVar.p = true;
                            if (tL_inputSingleMedia.media.file != null) {
                            }
                            z2 = true;
                            z3aVar.L(k3aVar, i11);
                        }
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                    int size5 = tL_inputMediaPaidMedia.extended_media.size();
                    boolean z5 = false;
                    while (i10 < size5) {
                        if (i15 >= 0) {
                            i10 = i15 != i10 ? i10 + 1 : 0;
                            z3aVar.h0(((k27) arrayList3.get(i10)).e1(), z3);
                            inputMedia = tL_inputMediaPaidMedia.extended_media.get(i10);
                            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                    ArrayList<TLRPC.InputMedia> arrayList4 = tL_inputMediaPaidMedia.extended_media;
                                    inputMedia2 = (TLRPC.InputMedia) k3aVar.A.get(i10);
                                    arrayList4.set(i10, inputMedia2);
                                }
                                k3aVar.o = (oac) k3aVar.w.get(i10);
                                k3aVar.l = (String) k3aVar.v.get(i10);
                                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) k3aVar.u.get(i10);
                                k3aVar.g = photoSize3;
                                k3aVar.p = true;
                                if (inputMedia.file != null || photoSize3 != null) {
                                    z5 = true;
                                }
                                z3aVar.L(k3aVar, i10);
                            } else {
                                ArrayList<TLRPC.InputMedia> arrayList5 = tL_inputMediaPaidMedia.extended_media;
                                inputMedia2 = (TLRPC.InputMedia) k3aVar.A.get(i10);
                                arrayList5.set(i10, inputMedia2);
                            }
                            inputMedia = inputMedia2;
                            k3aVar.o = (oac) k3aVar.w.get(i10);
                            k3aVar.l = (String) k3aVar.v.get(i10);
                            TLRPC.PhotoSize photoSize32 = (TLRPC.PhotoSize) k3aVar.u.get(i10);
                            k3aVar.g = photoSize32;
                            k3aVar.p = true;
                            if (inputMedia.file != null) {
                            }
                            z5 = true;
                            z3aVar.L(k3aVar, i10);
                        } else {
                            if (k3aVar.y.get(i10) == null) {
                            }
                            z3aVar.h0(((k27) arrayList3.get(i10)).e1(), z3);
                            inputMedia = tL_inputMediaPaidMedia.extended_media.get(i10);
                            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                            }
                            inputMedia = inputMedia2;
                            k3aVar.o = (oac) k3aVar.w.get(i10);
                            k3aVar.l = (String) k3aVar.v.get(i10);
                            TLRPC.PhotoSize photoSize322 = (TLRPC.PhotoSize) k3aVar.u.get(i10);
                            k3aVar.g = photoSize322;
                            k3aVar.p = true;
                            if (inputMedia.file != null) {
                            }
                            z5 = true;
                            z3aVar.L(k3aVar, i10);
                        }
                    }
                    z2 = z5;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
                for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                    TLRPC.Message message = ((k27) arrayList3.get(i22)).k;
                    z3aVar.getMessagesStorage().K0(z3 ? 1 : 0, message);
                    message.send_state = 2;
                    message.errorAllowedPriceStars = 0L;
                    message.errorNewPriceStars = 0L;
                    z3aVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                    z3aVar.c0(message.id);
                    z3aVar.h0(message.id, z3);
                }
                return;
            case 4:
                rja rjaVar = (rja) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj3;
                k27 k27Var = (k27) obj2;
                gb2 gb2Var2 = (gb2) obj;
                RLottieNative[] rLottieNativeArr = rjaVar.g1;
                RLottieNative[] rLottieNativeArr2 = rjaVar.j1;
                int[] iArr = rjaVar.e;
                if (rjaVar.X0) {
                    gl.c3(new pja(rjaVar, (byte) 0));
                    return;
                }
                int i23 = 0;
                boolean z6 = false;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i24 = this.b;
                    if (i23 >= length) {
                        gb2 gb2Var3 = gb2Var2;
                        if (z6) {
                            gl.c3(new pja(rjaVar, (byte) 1));
                            return;
                        } else {
                            gl.c3(new bs1(rjaVar, z3, i24, gb2Var3));
                            return;
                        }
                    }
                    if (i23 <= 2) {
                        if (rLottieNativeArr2[i23] == null) {
                            if (i23 == 0) {
                                int i25 = rjaVar.c1;
                                if (i25 == r13) {
                                    i12 = 5;
                                } else if (i25 == 2) {
                                    i12 = 6;
                                } else if (i25 == 3) {
                                    i12 = 7;
                                } else {
                                    if (i25 == i14) {
                                        i12 = i14;
                                        i13 = i12;
                                    } else {
                                        i13 = i14;
                                        i12 = 3;
                                    }
                                    TLRPC.Document document = tL_messages_stickerSet2.documents.get(i12);
                                    ba4.G(y6c.t0);
                                    v2 = gl.v2(ba4.J(document, null, r13, r13), 0);
                                    if (TextUtils.isEmpty(v2)) {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        gb2Var = gb2Var2;
                                        RLottieNative b2 = RLottieNative.b(v2, iArr, null, null);
                                        if (i23 <= 2) {
                                            rLottieNativeArr2[i23] = b2;
                                            rjaVar.k1[i23] = iArr[0];
                                        } else {
                                            rLottieNativeArr[i23 == 3 ? 0 : i13] = b2;
                                            rjaVar.h1[i23 == 3 ? 0 : i13] = iArr[0];
                                        }
                                    } else {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        qja qjaVar = new qja(document, i24, k27Var, gb2Var2, tL_messages_stickerSet, (byte) 0);
                                        gb2Var = gb2Var2;
                                        gl.c3(qjaVar);
                                        z6 = true;
                                    }
                                }
                                i13 = i14;
                                TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i12);
                                ba4.G(y6c.t0);
                                v2 = gl.v2(ba4.J(document2, null, r13, r13), 0);
                                if (TextUtils.isEmpty(v2)) {
                                }
                            } else if (i23 == r13) {
                                int i26 = rjaVar.d1;
                                if (i26 == r13) {
                                    i12 = 11;
                                } else if (i26 == 2) {
                                    i12 = 12;
                                } else if (i26 == 3) {
                                    i12 = 13;
                                } else if (i26 == i14) {
                                    i12 = 10;
                                } else {
                                    i13 = i14;
                                    i12 = 9;
                                    TLRPC.Document document22 = tL_messages_stickerSet2.documents.get(i12);
                                    ba4.G(y6c.t0);
                                    v2 = gl.v2(ba4.J(document22, null, r13, r13), 0);
                                    if (TextUtils.isEmpty(v2)) {
                                    }
                                }
                                i13 = i14;
                                TLRPC.Document document222 = tL_messages_stickerSet2.documents.get(i12);
                                ba4.G(y6c.t0);
                                v2 = gl.v2(ba4.J(document222, null, r13, r13), 0);
                                if (TextUtils.isEmpty(v2)) {
                                }
                            } else {
                                int i27 = rjaVar.e1;
                                if (i27 == r13) {
                                    i12 = 17;
                                } else {
                                    if (i27 == 2) {
                                        i13 = i14;
                                        i12 = 18;
                                    } else if (i27 == 3) {
                                        i13 = i14;
                                        i12 = 19;
                                    } else {
                                        i12 = i27 == i14 ? 16 : 15;
                                    }
                                    TLRPC.Document document2222 = tL_messages_stickerSet2.documents.get(i12);
                                    ba4.G(y6c.t0);
                                    v2 = gl.v2(ba4.J(document2222, null, r13, r13), 0);
                                    if (TextUtils.isEmpty(v2)) {
                                    }
                                }
                                i13 = i14;
                                TLRPC.Document document22222 = tL_messages_stickerSet2.documents.get(i12);
                                ba4.G(y6c.t0);
                                v2 = gl.v2(ba4.J(document22222, null, r13, r13), 0);
                                if (TextUtils.isEmpty(v2)) {
                                }
                            }
                        }
                        tL_messages_stickerSet = tL_messages_stickerSet2;
                        i13 = i14;
                        gb2Var = gb2Var2;
                    } else {
                        if (rLottieNativeArr[i23] == null) {
                            if (i23 == 3) {
                                i13 = i14;
                                i12 = r13;
                                TLRPC.Document document222222 = tL_messages_stickerSet2.documents.get(i12);
                                ba4.G(y6c.t0);
                                v2 = gl.v2(ba4.J(document222222, null, r13, r13), 0);
                                if (TextUtils.isEmpty(v2)) {
                                }
                            } else {
                                i12 = 2;
                                i13 = i14;
                                TLRPC.Document document2222222 = tL_messages_stickerSet2.documents.get(i12);
                                ba4.G(y6c.t0);
                                v2 = gl.v2(ba4.J(document2222222, null, r13, r13), 0);
                                if (TextUtils.isEmpty(v2)) {
                                }
                            }
                        }
                        tL_messages_stickerSet = tL_messages_stickerSet2;
                        i13 = i14;
                        gb2Var = gb2Var2;
                    }
                    i23++;
                    gb2Var2 = gb2Var;
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                    i14 = i13;
                    r13 = true;
                }
            default:
                rgc.a = 0L;
                rgc.g((Activity) obj4, this.b, (TLRPC.InputGroupCall) obj3, this.c, (TLRPC.GroupCall) obj2, (HashSet) obj);
                return;
        }
    }

    public /* synthetic */ m05(ye9 ye9Var, Uri uri, boolean z, String str, int i, lk0 lk0Var) {
        this.a = (byte) 2;
        this.d = ye9Var;
        this.e = uri;
        this.c = z;
        this.f = str;
        this.b = i;
        this.h = lk0Var;
    }

    public /* synthetic */ m05(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = (byte) 5;
        this.d = activity;
        this.b = i;
        this.e = inputGroupCall;
        this.c = z;
        this.f = groupCall;
        this.h = hashSet;
    }

    public /* synthetic */ m05(Object obj, TLObject tLObject, int i, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.b = i;
        this.f = obj2;
        this.h = obj3;
        this.c = z;
    }

    public /* synthetic */ m05(c cVar, boolean z, y05 y05Var, TL_wallet.proofChallenge proofchallenge, int i, i8c i8cVar) {
        this.a = (byte) 0;
        this.d = cVar;
        this.c = z;
        this.e = y05Var;
        this.f = proofchallenge;
        this.b = i;
        this.h = i8cVar;
    }
}

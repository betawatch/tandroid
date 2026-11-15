package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lv0(hi.s2 s2Var, ArrayList arrayList, String str) {
        this.a = 10;
        this.b = s2Var;
        this.d = arrayList;
        this.c = str;
    }

    private final void a() {
        xi.i iVar = (xi.i) this.b;
        WebView webView = (WebView) this.c;
        e5.f fVar = (e5.f) this.d;
        synchronized (iVar.a) {
            if (!iVar.u && iVar.o == webView && iVar.p == fVar && !iVar.r) {
                if (iVar.s) {
                    org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    iVar.q();
                } else {
                    iVar.s = true;
                    org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                    iVar.h();
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:359|(3:360|361|362)|363|364|(3:499|500|(13:502|367|368|369|370|371|(6:424|425|(2:448|(2:460|(2:464|465))(3:454|455|456))(3:441|442|443)|(4:377|(1:379)(1:415)|380|(2:413|414)(4:382|(1:384)(1:412)|385|(4:(2:388|(1:393))(1:411)|(1:406)(1:399)|400|(4:402|403|404|405))))|417|418)|373|374|375|(0)|417|418))|366|367|368|369|370|371|(0)|373|374|375|(0)|417|418) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:359|360|361|362|363|364|(3:499|500|(13:502|367|368|369|370|371|(6:424|425|(2:448|(2:460|(2:464|465))(3:454|455|456))(3:441|442|443)|(4:377|(1:379)(1:415)|380|(2:413|414)(4:382|(1:384)(1:412)|385|(4:(2:388|(1:393))(1:411)|(1:406)(1:399)|400|(4:402|403|404|405))))|417|418)|373|374|375|(0)|417|418))|366|367|368|369|370|371|(0)|373|374|375|(0)|417|418) */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a05, code lost:
    
        if (r17.booleanValue() != r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x09d3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x09d4, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x09dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x09de, code lost:
    
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x09d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x09e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x09e5, code lost:
    
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x09e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:377:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0952 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0a81 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:480:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x09eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, q2.l] */
    /* JADX WARN: Type inference failed for: r2v86, types: [java.lang.Object, q2.l] */
    /* JADX WARN: Type inference failed for: r3v82, types: [wg.s0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        ?? r62;
        Throwable th2;
        InputStream inputStream;
        InputStream inputStream2;
        ?? r63;
        InputStream inputStream3;
        File file;
        int i10;
        byte[] bArr;
        ?? r64;
        int i11;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z10;
        org.telegram.ui.web.z1 z1Var;
        Object obj2;
        TLRPC.User a22;
        int i12 = 12;
        int i13 = 28;
        int i14 = 3;
        int i15 = 2;
        int i16 = 0;
        int i17 = 0;
        boolean z11 = false;
        int i18 = 1;
        r15 = true;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                bw0 bw0Var = (bw0) this.b;
                String str = (String) this.c;
                TextView textView = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str;
                bw0Var.k2 = ConnectionsManager.getInstance(bw0Var.a).sendRequest(tL_stickers_checkShortName, new bi.j6(bw0Var, str, textView, 18), 2);
                return;
            case 1:
                bw0 bw0Var2 = (bw0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size = arrayList.size();
                Boolean bool = null;
                int i19 = 0;
                while (i19 < size) {
                    Object obj3 = arrayList.get(i19);
                    int i20 = i14;
                    if (obj3 instanceof Uri) {
                        Uri uri = (Uri) obj3;
                        String[] strArr = MediaController.W1;
                        String str2 = "webp";
                        try {
                            inputStream2 = org.telegram.messenger.t0.b.getContentResolver().openInputStream(uri);
                        } catch (Exception unused) {
                            inputStream2 = null;
                        } catch (Throwable th3) {
                            th2 = th3;
                            inputStream = null;
                            if (inputStream == null) {
                            }
                        }
                        i7 = i15;
                        if (inputStream2 == null) {
                            try {
                                file = new File(uri.getPath());
                            } catch (Exception e10) {
                                e = e10;
                                r63 = i18;
                                inputStream3 = inputStream2;
                                org.telegram.messenger.a8.g(e, r63);
                                if (inputStream3 != null) {
                                }
                                str2 = null;
                                if (str2 != null) {
                                }
                                r62 = true;
                                i19++;
                                i18 = r62;
                                i14 = i20;
                                i15 = i7;
                                i12 = 12;
                                i16 = 0;
                            } catch (Throwable th4) {
                                th2 = th4;
                                inputStream = inputStream2;
                                if (inputStream == null) {
                                }
                            }
                            if (file.exists()) {
                                inputStream3 = new FileInputStream(file);
                                bArr = new byte[i12];
                                int i21 = i18;
                                if (inputStream3.read(bArr, i16, i12) == i12) {
                                    try {
                                        try {
                                            byte b10 = bArr[i16];
                                            if (b10 == -119 && bArr[i21] == 80 && bArr[i7] == 78 && bArr[i20] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                                                str2 = "png";
                                                try {
                                                    inputStream3.close();
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    r64 = i21;
                                                    org.telegram.messenger.a8.g(e, r64);
                                                    if (str2 != null) {
                                                    }
                                                    r62 = true;
                                                    i19++;
                                                    i18 = r62;
                                                    i14 = i20;
                                                    i15 = i7;
                                                    i12 = 12;
                                                    i16 = 0;
                                                }
                                            } else if (b10 == 31 && bArr[1] == -117) {
                                                try {
                                                    inputStream3.close();
                                                } catch (Exception e12) {
                                                    org.telegram.messenger.a8.g(e12, true);
                                                }
                                                str2 = "tgs";
                                            } else {
                                                String lowerCase = new String(bArr).toLowerCase();
                                                if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        r64 = true;
                                                        org.telegram.messenger.a8.g(e, r64);
                                                        if (str2 != null) {
                                                        }
                                                        r62 = true;
                                                        i19++;
                                                        i18 = r62;
                                                        i14 = i20;
                                                        i15 = i7;
                                                        i12 = 12;
                                                        i16 = 0;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th2 = th;
                                            inputStream = inputStream3;
                                            if (inputStream == null) {
                                                throw th2;
                                            }
                                            try {
                                                inputStream.close();
                                                throw th2;
                                            } catch (Exception e14) {
                                                org.telegram.messenger.a8.g(e14, true);
                                                throw th2;
                                            }
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        r63 = true;
                                        org.telegram.messenger.a8.g(e, r63);
                                        if (inputStream3 != null) {
                                            try {
                                                inputStream3.close();
                                            } catch (Exception e16) {
                                                e = e16;
                                                org.telegram.messenger.a8.g(e, r63);
                                                str2 = null;
                                                if (str2 != null) {
                                                }
                                                r62 = true;
                                                i19++;
                                                i18 = r62;
                                                i14 = i20;
                                                i15 = i7;
                                                i12 = 12;
                                                i16 = 0;
                                            }
                                        }
                                        str2 = null;
                                        if (str2 != null) {
                                        }
                                        r62 = true;
                                        i19++;
                                        i18 = r62;
                                        i14 = i20;
                                        i15 = i7;
                                        i12 = 12;
                                        i16 = 0;
                                    }
                                    if (str2 != null) {
                                        boolean equals = "tgs".equals(str2);
                                        if (bool != null) {
                                            break;
                                        } else {
                                            bool = Boolean.valueOf(equals);
                                        }
                                        if (bw0Var2.J) {
                                            return;
                                        }
                                        org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
                                        xyVar.e = equals;
                                        String t6 = MediaController.t((equals ? 64 : 512) * 1024, uri, str2);
                                        xyVar.a = t6;
                                        if (t6 != null) {
                                            if (equals) {
                                                xyVar.d = "application/x-tgsticker";
                                            } else {
                                                BitmapFactory.decodeFile(t6, options);
                                                int i22 = options.outWidth;
                                                if ((i22 == 512 && (i10 = options.outHeight) > 0 && i10 <= 512) || (options.outHeight == 512 && i22 > 0 && i22 <= 512)) {
                                                    xyVar.d = "image/".concat(str2);
                                                    xyVar.c = true;
                                                }
                                            }
                                            if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i19) instanceof String)) {
                                                xyVar.b = (String) arrayList2.get(i19);
                                            } else {
                                                xyVar.b = "#️⃣";
                                            }
                                            arrayList3.add(xyVar);
                                            if (arrayList3.size() >= 200) {
                                                org.telegram.messenger.g0.h3(new yf(bw0Var2, arrayList3, bool, 28));
                                                return;
                                            }
                                        }
                                    }
                                    r62 = true;
                                }
                                inputStream3.close();
                                str2 = null;
                                if (str2 != null) {
                                }
                                r62 = true;
                            }
                        }
                        inputStream3 = inputStream2;
                        bArr = new byte[i12];
                        int i212 = i18;
                        if (inputStream3.read(bArr, i16, i12) == i12) {
                        }
                        inputStream3.close();
                        str2 = null;
                        if (str2 != null) {
                        }
                        r62 = true;
                    } else {
                        i7 = i15;
                        r62 = i18;
                    }
                    i19++;
                    i18 = r62;
                    i14 = i20;
                    i15 = i7;
                    i12 = 12;
                    i16 = 0;
                }
                org.telegram.messenger.g0.h3(new yf(bw0Var2, arrayList3, bool, 28));
                return;
            case 2:
                w31 w31Var = (w31) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = w31Var.f;
                ArrayList arrayList4 = w31Var.e;
                ArrayList arrayList5 = w31Var.n;
                SparseArray sparseArray2 = w31Var.d;
                w31Var.r = false;
                if (tL_error != null || !(tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    w31Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList6 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                if (arrayList6.size() < 40) {
                    w31Var.s = true;
                }
                if (arrayList6.isEmpty()) {
                    return;
                }
                if (arrayList5.isEmpty()) {
                    int i23 = w31Var.x;
                    w31Var.x = i23 + 1;
                    sparseArray2.put(i23, -1);
                }
                arrayList5.addAll(arrayList6);
                int size2 = arrayList4.size();
                for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i24);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList4.add(stickerSetCovered);
                        sparseArray.put(w31Var.x, stickerSetCovered);
                        int i25 = w31Var.x;
                        w31Var.x = i25 + 1;
                        int i26 = size2 + 1;
                        sparseArray2.put(i25, Integer.valueOf(size2));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(w31Var.x, stickerSetCovered.cover);
                            i11 = 1;
                        } else {
                            i11 = (int) Math.ceil(stickerSetCovered.covers.size() / w31Var.w);
                            for (int i27 = 0; i27 < stickerSetCovered.covers.size(); i27++) {
                                sparseArray2.put(w31Var.x + i27, stickerSetCovered.covers.get(i27));
                            }
                        }
                        int i28 = 0;
                        while (true) {
                            int i29 = w31Var.w * i11;
                            if (i28 < i29) {
                                sparseArray.put(w31Var.x + i28, stickerSetCovered);
                                i28++;
                            } else {
                                w31Var.x = i29 + w31Var.x;
                                size2 = i26;
                            }
                        }
                    }
                }
                w31Var.f();
                return;
            case 3:
                a61 a61Var = (a61) this.b;
                Uri uri2 = (Uri) this.c;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.d;
                a61Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.z(uri2.getQueryParameter("account")).intValue();
                    Object obj4 = org.telegram.messenger.w7.G(intValue).H.get(Utilities.z(uri2.getQueryParameter("rid")));
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.A(uri2.getQueryParameter("hash")).longValue();
                    tL_document.id = Utilities.A(uri2.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.A(uri2.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.z(uri2.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri2.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.v(uri2.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri2.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (org.telegram.messenger.w7.G(intValue).S(org.telegram.messenger.w7.r(null, tL_document))) {
                        File z13 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z13, a8.p0.r(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(intValue);
                        absolutePath = org.telegram.messenger.w7.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    a61Var.b = new t5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj4, 0L, intValue, true);
                } else {
                    a61Var.b = new t5(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                a61Var.c = a61Var.b.d[4];
                float f10 = a61Var.h;
                if (f10 != 0.0f) {
                    a61Var.e(gjVar, f10, a61Var.r);
                    a61Var.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new x51(a61Var, i18));
                return;
            case 4:
                a61 a61Var2 = (a61) this.b;
                t51 t51Var = (t51) this.c;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.d;
                a61Var2.getClass();
                if (t51Var.b()) {
                    a61Var2.b = new t5(new File(t51Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i30 = org.telegram.messenger.m10.t0;
                    try {
                        i30 = Utilities.z(t51Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e17) {
                        org.telegram.messenger.a8.g(e17, true);
                    }
                    int i31 = i30;
                    try {
                        obj = org.telegram.messenger.w7.G(i31).H.get(Utilities.z(t51Var.d.getQueryParameter("rid")));
                    } catch (Exception e18) {
                        org.telegram.messenger.a8.g(e18, true);
                        obj = null;
                    }
                    TLRPC.Document document = t51Var.g;
                    if (org.telegram.messenger.w7.G(i31).S(org.telegram.messenger.w7.r(null, document))) {
                        File z14 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z14, a8.p0.r(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(i31);
                        absolutePath2 = org.telegram.messenger.w7.J(document, null, false, true).getAbsolutePath();
                    }
                    a61Var2.b = new t5(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i31, true);
                }
                a61Var2.c = a61Var2.b.d[4];
                float f11 = a61Var2.h;
                if (f11 != 0.0f) {
                    a61Var2.e(gjVar2, f11, a61Var2.r);
                    a61Var2.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new x51(a61Var2, i15));
                return;
            case 5:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) this.c;
                org.telegram.ui.Components.voip.z zVar2 = (org.telegram.ui.Components.voip.z) this.d;
                ValueAnimator valueAnimator = l0Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                zVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.j0(l0Var, zVar, i14)).setDuration(100L).start();
                if (zVar2 != null) {
                    zVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.x(zVar2, i14)).start();
                    return;
                }
                return;
            case 6:
                File file2 = (File) this.b;
                int[] iArr = (int[]) this.c;
                di.j6 j6Var = (di.j6) this.d;
                AnimatedFileNative.d(file2.getAbsolutePath(), iArr, 0L);
                org.telegram.messenger.g0.h3(j6Var);
                return;
            case 7:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                q0.a aVar = (q0.a) this.c;
                String[] strArr2 = (String[]) this.d;
                v0Var.getClass();
                int length = strArr2.length;
                int i32 = 0;
                while (true) {
                    if (i32 >= length) {
                        z11 = true;
                    } else if (v0Var.getContext().checkSelfPermission(strArr2[i32]) == 0) {
                        i32++;
                    }
                }
                aVar.accept(Boolean.valueOf(z11));
                return;
            case 8:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                try {
                    org.telegram.ui.web.v0 v0Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (v0Var2 == null) {
                        return;
                    }
                    boolean z15 = org.telegram.ui.web.v0.R0;
                    v0Var2.F(botWebViewContainer$BotWebViewProxy, v0Var2.f(), str3, str4);
                    return;
                } catch (Exception e19) {
                    org.telegram.messenger.a8.g(e19, true);
                    return;
                }
            case 9:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                org.telegram.ui.web.v0 v0Var3 = botWebViewContainer$WebViewProxy.a;
                if (v0Var3 == null || v0Var3.p0 || v0Var3.c == null) {
                    return;
                }
                if (v0Var3.H0 != null && !TextUtils.equals(v0Var3.getOriginHost(), v0Var3.H0)) {
                    v0Var3.g("onWebEventReceived ignore " + str5);
                    return;
                }
                v0Var3.g("onWebEventReceived " + str5 + " " + str6);
                str5.getClass();
                switch (str5) {
                    case "actionBarColor":
                    case "navigationBarColor":
                        try {
                            JSONArray jSONArray = new JSONArray(str6);
                            boolean equals2 = TextUtils.equals(str5, "actionBarColor");
                            int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                            org.telegram.ui.web.s0 s0Var = v0Var3.a;
                            if (s0Var != null) {
                                if (equals2) {
                                    s0Var.s = true;
                                    s0Var.x = argb;
                                } else {
                                    s0Var.w = true;
                                    s0Var.y = argb;
                                }
                                org.telegram.ui.web.s0.a(s0Var);
                            }
                            v0Var3.c.o(argb, equals2);
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    case "oauth_request":
                        v0Var3.g("oauth_request " + str6);
                        if (v0Var3.a == null) {
                            return;
                        }
                        String originHost = v0Var3.getOriginHost();
                        if (TextUtils.isEmpty(originHost)) {
                            return;
                        }
                        try {
                            String optString = new JSONObject(str6).optString("url");
                            v0Var3.y("oauth_supported", org.telegram.ui.web.v0.A(1, "version"));
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                            tL_messages_requestUrlAuth.url = optString;
                            int i33 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = i33 | 12;
                            ConnectionsManager.getInstance(v0Var3.N).sendRequest(tL_messages_requestUrlAuth, new bi.l1(v0Var3, tL_messages_requestUrlAuth, optString, originHost, 20), 2);
                            return;
                        } catch (Exception e20) {
                            org.telegram.messenger.a8.g(e20, true);
                            return;
                        }
                    case "siteName":
                        v0Var3.g("siteName " + str6);
                        org.telegram.ui.web.s0 s0Var2 = v0Var3.a;
                        if (s0Var2 != null) {
                            s0Var2.r = str6;
                            org.telegram.ui.web.s0.a(s0Var2);
                            return;
                        }
                        return;
                    case "allowScroll":
                        try {
                            JSONArray jSONArray2 = new JSONArray(str6);
                            z10 = jSONArray2.optBoolean(0, true);
                            try {
                                z12 = jSONArray2.optBoolean(1, true);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            z10 = true;
                        }
                        if (v0Var3.getParent() instanceof ki.x3) {
                            ki.x3 x3Var = (ki.x3) v0Var3.getParent();
                            x3Var.P = z10;
                            x3Var.Q = z12;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 10:
                hi.s2 s2Var = (hi.s2) this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                String str7 = (String) this.c;
                ArrayList arrayList8 = new ArrayList();
                for (int i34 = 0; i34 < arrayList7.size(); i34++) {
                    org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) arrayList7.get(i34);
                    if (hi.s2.n(w0Var.c, str7) || ((z1Var = w0Var.d) != null && (hi.s2.n(z1Var.c, str7) || hi.s2.n(w0Var.d.d, str7)))) {
                        arrayList8.add(w0Var);
                    }
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.r(i13, s2Var, arrayList8));
                return;
            case 11:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.b;
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                v1Var.getClass();
                if (org.telegram.ui.web.v1.f == null) {
                    return;
                }
                ?? r15 = ((u1Var.d > 0 && u1Var.e > 0) || bitmap == null) ? 0 : 1;
                if (bitmap != null) {
                    v1Var.d.put(u1Var.b, bitmap);
                    if (r15 != 0) {
                        int i35 = u1Var.d;
                        if (i35 == 0 && u1Var.e == 0) {
                            u1Var.d = bitmap.getWidth();
                            u1Var.e = bitmap.getHeight();
                        } else if (i35 == 0) {
                            u1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * u1Var.e);
                        } else if (u1Var.e == 0) {
                            u1Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * u1Var.d);
                        }
                    }
                }
                ArrayList arrayList9 = (ArrayList) org.telegram.ui.web.v1.f.remove(u1Var.b);
                if (arrayList9 == null) {
                    return;
                }
                int size3 = arrayList9.size();
                while (i17 < size3) {
                    Object obj5 = arrayList9.get(i17);
                    i17++;
                    Pair pair = (Pair) obj5;
                    ((ImageReceiver) pair.first).v0(bitmap);
                    if (r15 != 0 && (obj2 = pair.second) != null) {
                        ((Runnable) obj2).run();
                    }
                }
                return;
            case 12:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                return;
            case 13:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 14:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 15:
                p4.a0 a0Var = (p4.a0) this.b;
                p4.v vVar = (p4.v) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                p4.d0 d0Var = a0Var.b;
                if (d0Var.i(vVar)) {
                    d0Var.b(keyEvent, false, false);
                } else {
                    p4.m0 m0Var = d0Var.h;
                    q4.r rVar = vVar.a;
                    rVar.getClass();
                    m0Var.getClass();
                    m0Var.i0(1, new p4.g0(m0Var, 9), rVar, true);
                }
                a0Var.a = null;
                return;
            case 16:
                p4.d0 d0Var2 = (p4.d0) this.b;
                p4.q0 q0Var = (p4.q0) this.c;
                p4.w wVar = (p4.w) this.d;
                if (d0Var2.j()) {
                    return;
                }
                p4.g1 g1Var = d0Var2.t;
                q0Var.getClass();
                c8.cb.b(g1Var, wVar);
                return;
            case 17:
                pi.k kVar = (pi.k) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                kVar.getClass();
                for (int i36 = 0; i36 < arrayList10.size(); i36++) {
                    ((View) arrayList10.get(i36)).setVisibility(0);
                }
                if (kVar.A.removeAll(arrayList11)) {
                    for (int i37 = 0; i37 < arrayList11.size(); i37++) {
                        kVar.d((v4.e1) arrayList11.get(i37));
                    }
                    kVar.G();
                }
                kVar.K.removeAll(arrayList10);
                return;
            case 18:
                pi.k kVar2 = (pi.k) this.b;
                View view = (View) this.c;
                v4.e1 e1Var = (v4.e1) this.d;
                kVar2.getClass();
                view.setVisibility(0);
                if (kVar2.A.remove(e1Var)) {
                    kVar2.d(e1Var);
                    kVar2.G();
                }
                kVar2.K.remove(view);
                return;
            case 19:
                q2.k kVar3 = (q2.k) this.b;
                this.c.K(kVar3.a, kVar3.b, (Exception) this.d);
                return;
            case 20:
                q2.k kVar4 = (q2.k) this.b;
                this.c.p(kVar4.a, kVar4.b, (nb.a) this.d);
                return;
            case 21:
                SpannableString spannableString = (SpannableString) this.b;
                ji.j jVar = (ji.j) this.c;
                oi.u4 u4Var = (oi.u4) this.d;
                qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) jVar.b);
                u4Var.run();
                return;
            case 22:
                SpannableString spannableString2 = (SpannableString) this.b;
                ji.j jVar2 = (ji.j) this.c;
                di.l9 l9Var = (di.l9) this.d;
                qi.j.a(spannableString2, spannableString2.length(), (com.google.android.gms.internal.play_billing.s0) jVar2.b);
                l9Var.a(spannableString2);
                return;
            case 23:
                ((wg.s0) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 24:
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) this.c;
                ?? r32 = (wg.s0) this.d;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    npVar.Y3(tL_channels_channelParticipants.users, false);
                    npVar.S3(tL_channels_channelParticipants.chats, false);
                    long e21 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).e();
                    ArrayList arrayList12 = new ArrayList();
                    for (int i38 = 0; i38 < tL_channels_channelParticipants.participants.size(); i38++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i38).peer;
                        if (peer != null && org.telegram.messenger.gj.B1(peer) != e21 && (a22 = npVar.a2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.q10.x(a22) && !a22.bot) {
                            arrayList12.add(npVar.m1(peer));
                        }
                    }
                    r32.a(arrayList12);
                    return;
                }
                return;
            case 25:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.c;
                org.telegram.messenger.z10 z10Var2 = (org.telegram.messenger.z10) this.d;
                if (tL_error2 != null) {
                    z10Var.a(tL_error2);
                    return;
                } else {
                    z10Var2.a(null);
                    return;
                }
            case 26:
                ((ug.p1) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 27:
                xh.l lVar = (xh.l) this.b;
                a80 a80Var = (a80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                y70 y70Var = lVar.H;
                if (y70Var == null || lVar.I != a80Var) {
                    return;
                }
                y70Var.a(clickableSpan);
                lVar.I = null;
                lVar.y.f(true);
                return;
            case 28:
                a();
                return;
            default:
                yf.d dVar = (yf.d) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                String str8 = dVar.b;
                int i39 = dVar.a;
                if (tLObject3 != null) {
                    org.telegram.messenger.si.b0(i39).i1(str8, (TLRPC.Document) tLObject3, false);
                } else {
                    dVar.a();
                    org.telegram.messenger.si.b0(i39).i1(str8, null, true);
                    if (tL_error3 != null) {
                        org.telegram.messenger.ns.f(i39).d(new ug.t1(24, dVar, tL_error3));
                    }
                }
                dVar.a();
                return;
        }
    }

    public /* synthetic */ lv0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}

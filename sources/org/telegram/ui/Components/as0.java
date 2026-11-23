package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class as0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ as0(Object obj, Serializable serializable, ArrayList arrayList, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = serializable;
        this.b = arrayList;
    }

    private final void a() {
        Object obj;
        org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.c;
        org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.b;
        Bitmap bitmap = (Bitmap) this.d;
        w1Var.getClass();
        if (org.telegram.ui.web.w1.f == null) {
            return;
        }
        int i7 = 0;
        boolean z10 = (v1Var.d <= 0 || v1Var.e <= 0) && bitmap != null;
        if (bitmap != null) {
            w1Var.d.put(v1Var.b, bitmap);
            if (z10) {
                int i10 = v1Var.d;
                if (i10 == 0 && v1Var.e == 0) {
                    v1Var.d = bitmap.getWidth();
                    v1Var.e = bitmap.getHeight();
                } else if (i10 == 0) {
                    v1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * v1Var.e);
                } else if (v1Var.e == 0) {
                    v1Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * v1Var.d);
                }
            }
        }
        ArrayList arrayList = (ArrayList) org.telegram.ui.web.w1.f.remove(v1Var.b);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            Pair pair = (Pair) obj2;
            ((ImageReceiver) pair.first).w0(bitmap);
            if (z10 && (obj = pair.second) != null) {
                ((Runnable) obj).run();
            }
        }
    }

    private final void b() {
        p4.a0 a0Var = (p4.a0) this.c;
        p4.v vVar = (p4.v) this.b;
        KeyEvent keyEvent = (KeyEvent) this.d;
        p4.d0 d0Var = a0Var.b;
        if (d0Var.i(vVar)) {
            d0Var.b(keyEvent, false, false);
        } else {
            p4.n0 n0Var = d0Var.h;
            q4.r rVar = vVar.a;
            rVar.getClass();
            n0Var.getClass();
            n0Var.i0(1, new p4.g0(n0Var, 9), rVar, true);
        }
        a0Var.a = null;
    }

    private final void c() {
        pi.k kVar = (pi.k) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.d;
        kVar.getClass();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).setVisibility(0);
        }
        if (kVar.A.removeAll(arrayList2)) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                kVar.d((v4.f1) arrayList2.get(i10));
            }
            kVar.G();
        }
        kVar.K.removeAll(arrayList);
    }

    private final void d() {
        pi.k kVar = (pi.k) this.c;
        View view = (View) this.b;
        v4.f1 f1Var = (v4.f1) this.d;
        kVar.getClass();
        view.setVisibility(0);
        if (kVar.A.remove(f1Var)) {
            kVar.d(f1Var);
            kVar.G();
        }
        kVar.K.remove(view);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, q2.k] */
    private final void f() {
        q2.j jVar = (q2.j) this.c;
        nb.a aVar = (nb.a) this.d;
        this.b.l(jVar.a, jVar.b, aVar);
    }

    private final void g() {
        SpannableString spannableString = (SpannableString) this.c;
        j6.k kVar = (j6.k) this.b;
        n2.c0 c0Var = (n2.c0) this.d;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) kVar.b);
        c0Var.run();
    }

    private final void h() {
        SpannableString spannableString = (SpannableString) this.c;
        j6.k kVar = (j6.k) this.b;
        di.p9 p9Var = (di.p9) this.d;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) kVar.b);
        p9Var.a(spannableString);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(3:394|395|(11:397|259|260|261|262|263|(4:265|266|(2:338|(2:350|(2:354|355))(3:344|345|346))(3:282|283|284)|(1:333)(4:286|(1:288)(2:330|(1:332))|289|(2:328|329)(4:291|(1:293)(1:327)|294|(4:(2:297|(1:302))(1:325)|(1:317)(1:308)|309|(1:311)(1:315))(1:326))))|381|382|375|(0)(0)))|259|260|261|262|263|(0)|381|382|375|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:251|(3:252|253|254)|255|256|(3:394|395|(11:397|259|260|261|262|263|(4:265|266|(2:338|(2:350|(2:354|355))(3:344|345|346))(3:282|283|284)|(1:333)(4:286|(1:288)(2:330|(1:332))|289|(2:328|329)(4:291|(1:293)(1:327)|294|(4:(2:297|(1:302))(1:325)|(1:317)(1:308)|309|(1:311)(1:315))(1:326))))|381|382|375|(0)(0)))|258|259|260|261|262|263|(0)|381|382|375|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x086a, code lost:
    
        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.as0(r5, r8, r19, r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0874, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x07b7, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x07bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x07a4, code lost:
    
        org.telegram.messenger.a8.g(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x07a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x07a3, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x07ac, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x07af, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0723 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0857 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0849 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v110, types: [java.lang.Object, q2.k] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        boolean z10;
        String str;
        boolean z11;
        int i10;
        ArrayList arrayList;
        Throwable th2;
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        File file;
        boolean z12;
        int i11;
        byte[] bArr;
        boolean z13;
        int i12;
        char c10;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z14;
        org.telegram.ui.web.a2 a2Var;
        int i13 = 26;
        int i14 = 12;
        int i15 = 2;
        int i16 = 3;
        int i17 = 0;
        boolean z15 = false;
        int i18 = 7;
        int i19 = 1;
        r3 = true;
        boolean z16 = true;
        switch (this.a) {
            case 0:
                bs0 bs0Var = (bs0) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                it0 it0Var = bs0Var.s;
                if (it0Var.Y0) {
                    bs0Var.d = arrayList2;
                    bs0Var.r--;
                    if (!org.telegram.messenger.v3.T(bs0Var.n)) {
                        ArrayList arrayList4 = bs0Var.e.g;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                    }
                    if (bs0Var.r == 0) {
                        int i20 = 0;
                        while (true) {
                            ds0[] ds0VarArr = it0Var.n0;
                            if (i20 < ds0VarArr.length) {
                                ds0 ds0Var = ds0VarArr[i20];
                                int i21 = i18;
                                if (ds0Var.F == i21) {
                                    if (bs0Var.h == 0) {
                                        ds0Var.w.e(false, true);
                                    } else {
                                        it0Var.D(ds0Var.h, 0, null);
                                    }
                                }
                                i20++;
                                i18 = i21;
                            }
                        }
                    }
                    bs0Var.f();
                    return;
                }
                return;
            case 1:
                int i22 = 4;
                fs0 fs0Var = (fs0) this.c;
                String str2 = (String) this.d;
                ArrayList arrayList5 = (ArrayList) this.b;
                fs0Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new sh0(12, fs0Var, new ArrayList()));
                    return;
                }
                String T0 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
                String str3 = (lowerCase.equals(T0) || T0.length() == 0) ? null : T0;
                int i23 = (str3 != null ? 1 : 0) + 1;
                String[] strArr = new String[i23];
                strArr[0] = lowerCase;
                if (str3 != null) {
                    strArr[1] = str3;
                }
                ArrayList arrayList6 = new ArrayList();
                int i24 = 0;
                while (i24 < arrayList5.size()) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList5.get(i24);
                    int i25 = 0;
                    while (true) {
                        if (i25 < i23) {
                            String str4 = strArr[i25];
                            String I0 = fjVar.I0();
                            if (I0 == null || I0.length() == 0) {
                                i7 = i22;
                            } else if (I0.toLowerCase().contains(str4)) {
                                arrayList6.add(fjVar);
                            } else {
                                i7 = i22;
                                if (fs0Var.r != i7) {
                                    continue;
                                } else {
                                    TLRPC.Document document = fjVar.D == 0 ? org.telegram.messenger.fj.n1(fjVar.k).webpage.document : org.telegram.messenger.fj.n1(fjVar.k).document;
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i26);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str5 = documentAttribute.performer;
                                                boolean contains = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                z10 = (contains || (str = documentAttribute.title) == null) ? contains : str.toLowerCase().contains(str4);
                                            } else {
                                                i26++;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    if (z10) {
                                        arrayList6.add(fjVar);
                                    }
                                }
                            }
                            i25++;
                            i22 = i7;
                        }
                    }
                    i7 = i22;
                    i24++;
                    i22 = i7;
                }
                org.telegram.messenger.g0.g3(new sh0(12, fs0Var, arrayList6));
                return;
            case 2:
                jw0 jw0Var = (jw0) this.c;
                String str6 = (String) this.b;
                org.telegram.messenger.sy syVar = (org.telegram.messenger.sy) this.d;
                if (jw0Var.J) {
                    return;
                }
                jw0Var.U1.remove(str6);
                if ("application/x-tgsticker".equals(syVar.d)) {
                    syVar.c = true;
                    int indexOf = jw0Var.T1.indexOf(syVar);
                    if (indexOf >= 0) {
                        v4.f1 K = jw0Var.n1.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.z7) K.a).setSticker(syVar);
                        }
                    } else {
                        jw0Var.o1.f();
                    }
                } else {
                    jw0Var.T0(syVar);
                }
                if (jw0Var.U1.isEmpty()) {
                    jw0Var.a1();
                    return;
                }
                return;
            case 3:
                jw0 jw0Var2 = (jw0) this.c;
                ArrayList arrayList7 = (ArrayList) this.b;
                Boolean bool = (Boolean) this.d;
                jw0Var2.T1 = arrayList7;
                if (arrayList7.isEmpty()) {
                    jw0Var2.dismiss();
                    return;
                }
                jw0Var2.o1.f();
                if (bool.booleanValue()) {
                    jw0Var2.U1 = new HashMap();
                    int size = jw0Var2.T1.size();
                    for (int i27 = 0; i27 < size; i27++) {
                        org.telegram.messenger.sy syVar2 = (org.telegram.messenger.sy) jw0Var2.T1.get(i27);
                        jw0Var2.U1.put(syVar2.a, syVar2);
                        org.telegram.messenger.w7.G(jw0Var2.a).h0(false, 67108864, syVar2.a, true);
                    }
                }
                jw0Var2.a1();
                return;
            case 4:
                jw0 jw0Var3 = (jw0) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = jw0Var3.G1;
                TLRPC.StickerSet stickerSet = jw0Var3.N1.set;
                int i28 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                try {
                    if (tL_error == null) {
                        if (jw0Var3.e2) {
                            fc.g(g2Var, new ov0(jw0Var3.w1.getContext(), jw0Var3.N1, 1, 2, null, jw0Var3.J0), 1500).j();
                        }
                        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            org.telegram.messenger.ri.d0(jw0Var3.a).E1(g2Var, true, i28, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                        }
                    } else {
                        Toast.makeText(jw0Var3.getContext(), org.telegram.messenger.gd.N0(2131751093, null), 0).show();
                    }
                    z11 = true;
                } catch (Exception e10) {
                    z11 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.ri.d0(jw0Var3.a).d1(i28, false, z11);
                return;
            case 5:
                jw0 jw0Var4 = (jw0) this.c;
                String str7 = (String) this.b;
                TextView textView = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str7;
                jw0Var4.k2 = ConnectionsManager.getInstance(jw0Var4.a).sendRequest(tL_stickers_checkShortName, new bi.q1(jw0Var4, str7, textView, 20), 2);
                return;
            case 6:
                jw0 jw0Var5 = (jw0) this.c;
                ArrayList arrayList8 = (ArrayList) this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList8.size();
                Boolean bool2 = null;
                int i29 = 0;
                while (true) {
                    if (i29 >= size2) {
                        i10 = i16;
                        break;
                    } else {
                        Object obj2 = arrayList8.get(i29);
                        int i30 = i15;
                        if (obj2 instanceof Uri) {
                            Uri uri = (Uri) obj2;
                            String[] strArr2 = MediaController.W1;
                            i10 = i16;
                            String str8 = "webp";
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
                            int i31 = i19;
                            try {
                                if (inputStream2 == null) {
                                    try {
                                        file = new File(uri.getPath());
                                    } catch (Exception e11) {
                                        e = e11;
                                        inputStream3 = inputStream2;
                                        arrayList = arrayList8;
                                        z12 = i31;
                                        org.telegram.messenger.a8.g(e, z12);
                                        if (inputStream3 != null) {
                                        }
                                        str8 = null;
                                        if (str8 == null) {
                                        }
                                        i29++;
                                        i15 = i30;
                                        i16 = i10;
                                        arrayList8 = arrayList;
                                        i19 = 1;
                                        i17 = 0;
                                        i14 = 12;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        inputStream = inputStream2;
                                        if (inputStream == null) {
                                        }
                                    }
                                    if (file.exists()) {
                                        inputStream3 = new FileInputStream(file);
                                        bArr = new byte[i14];
                                        arrayList = arrayList8;
                                        if (inputStream3.read(bArr, i17, i14) == i14) {
                                            try {
                                                try {
                                                    byte b10 = bArr[i17];
                                                    if (b10 == -119 && bArr[i31] == 80 && bArr[i30] == 78 && bArr[i10] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                                                        str8 = "png";
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            z13 = i31;
                                                            org.telegram.messenger.a8.g(e, z13);
                                                            if (str8 == null) {
                                                            }
                                                            i29++;
                                                            i15 = i30;
                                                            i16 = i10;
                                                            arrayList8 = arrayList;
                                                            i19 = 1;
                                                            i17 = 0;
                                                            i14 = 12;
                                                        }
                                                    } else if (b10 == 31 && bArr[1] == -117) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e13) {
                                                            org.telegram.messenger.a8.g(e13, true);
                                                        }
                                                        str8 = "tgs";
                                                    } else {
                                                        String lowerCase2 = new String(bArr).toLowerCase();
                                                        if (lowerCase2.startsWith("riff") && lowerCase2.endsWith("webp")) {
                                                            try {
                                                                inputStream3.close();
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                z13 = true;
                                                                org.telegram.messenger.a8.g(e, z13);
                                                                if (str8 == null) {
                                                                }
                                                                i29++;
                                                                i15 = i30;
                                                                i16 = i10;
                                                                arrayList8 = arrayList;
                                                                i19 = 1;
                                                                i17 = 0;
                                                                i14 = 12;
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
                                                    } catch (Exception e15) {
                                                        org.telegram.messenger.a8.g(e15, true);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                                z12 = true;
                                                org.telegram.messenger.a8.g(e, z12);
                                                if (inputStream3 != null) {
                                                }
                                                str8 = null;
                                                if (str8 == null) {
                                                }
                                                i29++;
                                                i15 = i30;
                                                i16 = i10;
                                                arrayList8 = arrayList;
                                                i19 = 1;
                                                i17 = 0;
                                                i14 = 12;
                                            }
                                            if (str8 == null) {
                                                continue;
                                            } else {
                                                boolean equals = "tgs".equals(str8);
                                                if (bool2 == null) {
                                                    bool2 = Boolean.valueOf(equals);
                                                } else if (bool2.booleanValue() != equals) {
                                                    continue;
                                                }
                                                if (jw0Var5.J) {
                                                    return;
                                                }
                                                org.telegram.messenger.sy syVar3 = new org.telegram.messenger.sy();
                                                syVar3.e = equals;
                                                String t6 = MediaController.t((equals ? 64 : 512) * 1024, uri, str8);
                                                syVar3.a = t6;
                                                if (t6 != null) {
                                                    if (equals) {
                                                        syVar3.d = "application/x-tgsticker";
                                                    } else {
                                                        BitmapFactory.decodeFile(t6, options);
                                                        int i32 = options.outWidth;
                                                        if ((i32 == 512 && (i11 = options.outHeight) > 0 && i11 <= 512) || (options.outHeight == 512 && i32 > 0 && i32 <= 512)) {
                                                            syVar3.d = "image/".concat(str8);
                                                            syVar3.c = true;
                                                        }
                                                    }
                                                    if (arrayList9 != null && arrayList9.size() == size2 && (arrayList9.get(i29) instanceof String)) {
                                                        syVar3.b = (String) arrayList9.get(i29);
                                                    } else {
                                                        syVar3.b = "#️⃣";
                                                    }
                                                    arrayList10.add(syVar3);
                                                    if (arrayList10.size() >= 200) {
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        inputStream3.close();
                                        str8 = null;
                                        if (str8 == null) {
                                        }
                                    }
                                }
                                bArr = new byte[i14];
                                arrayList = arrayList8;
                                if (inputStream3.read(bArr, i17, i14) == i14) {
                                }
                                inputStream3.close();
                                str8 = null;
                                if (str8 == null) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            inputStream3 = inputStream2;
                        } else {
                            i10 = i16;
                            arrayList = arrayList8;
                        }
                        i29++;
                        i15 = i30;
                        i16 = i10;
                        arrayList8 = arrayList;
                        i19 = 1;
                        i17 = 0;
                        i14 = 12;
                    }
                }
                break;
            case 7:
                i41 i41Var = (i41) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                SparseArray sparseArray = i41Var.f;
                ArrayList arrayList11 = i41Var.e;
                ArrayList arrayList12 = i41Var.n;
                SparseArray sparseArray2 = i41Var.d;
                i41Var.r = false;
                if (tL_error2 != null || !(tLObject2 instanceof TLRPC.TL_messages_featuredStickers)) {
                    i41Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList13 = ((TLRPC.TL_messages_featuredStickers) tLObject2).sets;
                if (arrayList13.size() < 40) {
                    i41Var.s = true;
                }
                if (arrayList13.isEmpty()) {
                    return;
                }
                if (arrayList12.isEmpty()) {
                    int i33 = i41Var.x;
                    i41Var.x = i33 + 1;
                    sparseArray2.put(i33, -1);
                }
                arrayList12.addAll(arrayList13);
                int size3 = arrayList11.size();
                for (int i34 = 0; i34 < arrayList13.size(); i34++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList13.get(i34);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList11.add(stickerSetCovered);
                        sparseArray.put(i41Var.x, stickerSetCovered);
                        int i35 = i41Var.x;
                        i41Var.x = i35 + 1;
                        int i36 = size3 + 1;
                        sparseArray2.put(i35, Integer.valueOf(size3));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(i41Var.x, stickerSetCovered.cover);
                            i12 = 1;
                        } else {
                            i12 = (int) Math.ceil(stickerSetCovered.covers.size() / i41Var.w);
                            for (int i37 = 0; i37 < stickerSetCovered.covers.size(); i37++) {
                                sparseArray2.put(i41Var.x + i37, stickerSetCovered.covers.get(i37));
                            }
                        }
                        int i38 = 0;
                        while (true) {
                            int i39 = i41Var.w * i12;
                            if (i38 < i39) {
                                sparseArray.put(i41Var.x + i38, stickerSetCovered);
                                i38++;
                            } else {
                                i41Var.x = i39 + i41Var.x;
                                size3 = i36;
                            }
                        }
                    }
                }
                i41Var.f();
                return;
            case 8:
                p61 p61Var = (p61) this.c;
                Uri uri2 = (Uri) this.b;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.d;
                p61Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.z(uri2.getQueryParameter("account")).intValue();
                    Object obj3 = org.telegram.messenger.w7.G(intValue).H.get(Utilities.z(uri2.getQueryParameter("rid")));
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    c10 = 4;
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
                        File z17 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z17, a8.p0.r(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(intValue);
                        absolutePath = org.telegram.messenger.w7.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    p61Var.b = new b6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj3, 0L, intValue, true);
                } else {
                    c10 = 4;
                    p61Var.b = new b6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                p61Var.c = p61Var.b.d[c10];
                float f10 = p61Var.h;
                if (f10 != 0.0f) {
                    p61Var.e(fjVar2, f10, p61Var.r);
                    p61Var.h = 0.0f;
                }
                org.telegram.messenger.g0.g3(new m61(p61Var, i19));
                return;
            case 9:
                p61 p61Var2 = (p61) this.c;
                g61 g61Var = (g61) this.b;
                org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) this.d;
                p61Var2.getClass();
                if (g61Var.b()) {
                    p61Var2.b = new b6(new File(g61Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i40 = org.telegram.messenger.i10.t0;
                    try {
                        i40 = Utilities.z(g61Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e17) {
                        org.telegram.messenger.a8.g(e17, true);
                    }
                    int i41 = i40;
                    try {
                        obj = org.telegram.messenger.w7.G(i41).H.get(Utilities.z(g61Var.d.getQueryParameter("rid")));
                    } catch (Exception e18) {
                        org.telegram.messenger.a8.g(e18, true);
                        obj = null;
                    }
                    TLRPC.Document document2 = g61Var.g;
                    if (org.telegram.messenger.w7.G(i41).S(org.telegram.messenger.w7.r(null, document2))) {
                        File z18 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z18, a8.p0.r(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(i41);
                        absolutePath2 = org.telegram.messenger.w7.J(document2, null, false, true).getAbsolutePath();
                    }
                    p61Var2.b = new b6(new File(absolutePath2), true, document2.size, 1, document2, null, obj, 0L, i41, true);
                }
                p61Var2.c = p61Var2.b.d[4];
                float f11 = p61Var2.h;
                if (f11 != 0.0f) {
                    p61Var2.e(fjVar3, f11, p61Var2.r);
                    p61Var2.h = 0.0f;
                }
                org.telegram.messenger.g0.g3(new m61(p61Var2, i15));
                return;
            case 10:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.c;
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) this.b;
                org.telegram.ui.Components.voip.z zVar2 = (org.telegram.ui.Components.voip.z) this.d;
                ValueAnimator valueAnimator = l0Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                zVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.j0(l0Var, zVar, i16)).setDuration(100L).start();
                if (zVar2 != null) {
                    zVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.x(zVar2, i16)).start();
                    return;
                }
                return;
            case 11:
                File file2 = (File) this.c;
                int[] iArr = (int[]) this.b;
                di.m6 m6Var = (di.m6) this.d;
                AnimatedFileNative.d(file2.getAbsolutePath(), iArr, 0L);
                org.telegram.messenger.g0.g3(m6Var);
                return;
            case 12:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.c;
                q0.a aVar = (q0.a) this.b;
                String[] strArr3 = (String[]) this.d;
                v0Var.getClass();
                int length = strArr3.length;
                int i42 = 0;
                while (true) {
                    if (i42 >= length) {
                        z15 = true;
                    } else if (v0Var.getContext().checkSelfPermission(strArr3[i42]) == 0) {
                        i42++;
                    }
                }
                aVar.accept(Boolean.valueOf(z15));
                return;
            case 13:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.c;
                String str9 = (String) this.b;
                String str10 = (String) this.d;
                try {
                    org.telegram.ui.web.v0 v0Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (v0Var2 == null) {
                        return;
                    }
                    boolean z19 = org.telegram.ui.web.v0.R0;
                    v0Var2.F(botWebViewContainer$BotWebViewProxy, v0Var2.f(), str9, str10);
                    return;
                } catch (Exception e19) {
                    org.telegram.messenger.a8.g(e19, true);
                    return;
                }
            case 14:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.c;
                String str11 = (String) this.b;
                String str12 = (String) this.d;
                org.telegram.ui.web.v0 v0Var3 = botWebViewContainer$WebViewProxy.a;
                if (v0Var3 == null || v0Var3.p0 || v0Var3.c == null) {
                    return;
                }
                if (v0Var3.H0 != null && !TextUtils.equals(v0Var3.getOriginHost(), v0Var3.H0)) {
                    v0Var3.g("onWebEventReceived ignore " + str11);
                    return;
                }
                v0Var3.g("onWebEventReceived " + str11 + " " + str12);
                str11.getClass();
                switch (str11) {
                    case "actionBarColor":
                    case "navigationBarColor":
                        try {
                            JSONArray jSONArray = new JSONArray(str12);
                            boolean equals2 = TextUtils.equals(str11, "actionBarColor");
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
                        v0Var3.g("oauth_request " + str12);
                        if (v0Var3.a == null) {
                            return;
                        }
                        String originHost = v0Var3.getOriginHost();
                        if (TextUtils.isEmpty(originHost)) {
                            return;
                        }
                        try {
                            String optString = new JSONObject(str12).optString("url");
                            v0Var3.y("oauth_supported", org.telegram.ui.web.v0.A(1, "version"));
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                            tL_messages_requestUrlAuth.url = optString;
                            int i43 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = i43 | 12;
                            ConnectionsManager.getInstance(v0Var3.N).sendRequest(tL_messages_requestUrlAuth, new bi.m2(v0Var3, tL_messages_requestUrlAuth, optString, originHost, 20), 2);
                            return;
                        } catch (Exception e20) {
                            org.telegram.messenger.a8.g(e20, true);
                            return;
                        }
                    case "siteName":
                        v0Var3.g("siteName " + str12);
                        org.telegram.ui.web.s0 s0Var2 = v0Var3.a;
                        if (s0Var2 != null) {
                            s0Var2.r = str12;
                            org.telegram.ui.web.s0.a(s0Var2);
                            return;
                        }
                        return;
                    case "allowScroll":
                        try {
                            JSONArray jSONArray2 = new JSONArray(str12);
                            z14 = jSONArray2.optBoolean(0, true);
                            try {
                                z16 = jSONArray2.optBoolean(1, true);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            z14 = true;
                        }
                        if (v0Var3.getParent() instanceof ki.s3) {
                            ki.s3 s3Var = (ki.s3) v0Var3.getParent();
                            s3Var.P = z14;
                            s3Var.Q = z16;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 15:
                hi.b3 b3Var = (hi.b3) this.c;
                ArrayList arrayList14 = (ArrayList) this.b;
                String str13 = (String) this.d;
                ArrayList arrayList15 = new ArrayList();
                for (int i44 = 0; i44 < arrayList14.size(); i44++) {
                    org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) arrayList14.get(i44);
                    if (hi.b3.n(w0Var.c, str13) || ((a2Var = w0Var.d) != null && (hi.b3.n(a2Var.c, str13) || hi.b3.n(w0Var.d.d, str13)))) {
                        arrayList15.add(w0Var);
                    }
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.r(i13, b3Var, arrayList15));
                return;
            case 16:
                a();
                return;
            case 17:
                org.telegram.utils.twidget.z0.r((org.telegram.utils.twidget.z0) this.c, (org.telegram.utils.twidget.y0) this.b, (String) this.d);
                return;
            case 18:
                ((EglRenderer) this.c).lambda$init$0((EglBase.Context) this.b, (int[]) this.d);
                return;
            case 19:
                ((EglRenderer) this.c).lambda$removeFrameListener$4((CountDownLatch) this.b, (EglRenderer.FrameListener) this.d);
                return;
            case 20:
                ((VideoFileRenderer) this.c).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.b, (VideoFrame) this.d);
                return;
            case 21:
                b();
                return;
            case 22:
                p4.d0 d0Var = (p4.d0) this.c;
                p4.r0 r0Var = (p4.r0) this.b;
                p4.w wVar = (p4.w) this.d;
                if (d0Var.j()) {
                    return;
                }
                p4.h1 h1Var = d0Var.t;
                r0Var.getClass();
                c8.kb.b(h1Var, wVar);
                return;
            case 23:
                c();
                return;
            case 24:
                d();
                return;
            case 25:
                q2.j jVar = (q2.j) this.c;
                this.b.K(jVar.a, jVar.b, (Exception) this.d);
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                ((wg.t0) this.c).a(new Pair((HashMap) this.d, (ArrayList) this.b));
                return;
        }
    }

    public /* synthetic */ as0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}

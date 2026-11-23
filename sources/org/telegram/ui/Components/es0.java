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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class es0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ es0(Object obj, Object obj2, Serializable serializable, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = serializable;
    }

    private final void a() {
        Object obj;
        org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.c;
        org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.b;
        Bitmap bitmap = (Bitmap) this.d;
        v1Var.getClass();
        if (org.telegram.ui.web.v1.f == null) {
            return;
        }
        int i7 = 0;
        boolean z10 = (u1Var.d <= 0 || u1Var.e <= 0) && bitmap != null;
        if (bitmap != null) {
            v1Var.d.put(u1Var.b, bitmap);
            if (z10) {
                int i10 = u1Var.d;
                if (i10 == 0 && u1Var.e == 0) {
                    u1Var.d = bitmap.getWidth();
                    u1Var.e = bitmap.getHeight();
                } else if (i10 == 0) {
                    u1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * u1Var.e);
                } else if (u1Var.e == 0) {
                    u1Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * u1Var.d);
                }
            }
        }
        ArrayList arrayList = (ArrayList) org.telegram.ui.web.v1.f.remove(u1Var.b);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            Pair pair = (Pair) obj2;
            ((ImageReceiver) pair.first).v0(bitmap);
            if (z10 && (obj = pair.second) != null) {
                ((Runnable) obj).run();
            }
        }
    }

    private final void b() {
        p4.e0 e0Var = (p4.e0) this.c;
        p4.r0 r0Var = (p4.r0) this.b;
        p4.w wVar = (p4.w) this.d;
        if (e0Var.j()) {
            return;
        }
        p4.i1 i1Var = e0Var.t;
        r0Var.getClass();
        c8.jb.b(i1Var, wVar);
    }

    private final void c() {
        pi.k kVar = (pi.k) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.b;
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
        Exception exc = (Exception) this.d;
        this.b.K(jVar.a, jVar.b, exc);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, q2.k] */
    private final void g() {
        q2.j jVar = (q2.j) this.c;
        nb.a aVar = (nb.a) this.d;
        this.b.c(jVar.a, jVar.b, aVar);
    }

    private final void h() {
        SpannableString spannableString = (SpannableString) this.c;
        ji.l lVar = (ji.l) this.b;
        oi.t tVar = (oi.t) this.d;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) lVar.b);
        tVar.run();
    }

    private final void i() {
        SpannableString spannableString = (SpannableString) this.c;
        ji.l lVar = (ji.l) this.b;
        di.p9 p9Var = (di.p9) this.d;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) lVar.b);
        p9Var.a(spannableString);
    }

    private final void j() {
        ((wg.u0) this.c).a(new Pair((HashMap) this.b, (ArrayList) this.d));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(3:422|423|(11:425|287|288|289|290|291|(4:349|350|(2:373|(2:385|(2:389|390))(3:379|380|381))(3:366|367|368)|(1:344)(4:297|(1:299)(2:341|(1:343))|300|(2:339|340)(4:302|(1:304)(1:338)|305|(4:(2:308|(1:313))(1:336)|(1:328)(1:319)|320|(1:322)(1:326))(1:337))))|293|294|295|(0)(0)))|287|288|289|290|291|(0)|293|294|295|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x07f8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x07f9, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0802, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0803, code lost:
    
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0806, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0807, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x08af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0778 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x080f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:? A[SYNTHETIC] */
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
        boolean z12;
        File file;
        int i11;
        byte[] bArr;
        boolean z13;
        int i12;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z14;
        org.telegram.ui.web.z1 z1Var;
        TLRPC.User c22;
        int i13 = 12;
        int i14 = 3;
        int i15 = 2;
        int i16 = 0;
        boolean z15 = false;
        int i17 = 1;
        r9 = true;
        boolean z16 = true;
        switch (this.a) {
            case 0:
                int i18 = 4;
                gs0 gs0Var = (gs0) this.c;
                String str2 = (String) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                gs0Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new fm0(10, gs0Var, new ArrayList()));
                    return;
                }
                String T0 = org.telegram.messenger.hd.E0().T0(lowerCase, true, false);
                String str3 = (lowerCase.equals(T0) || T0.length() == 0) ? null : T0;
                int i19 = (str3 != null ? 1 : 0) + 1;
                String[] strArr = new String[i19];
                strArr[0] = lowerCase;
                if (str3 != null) {
                    strArr[1] = str3;
                }
                ArrayList arrayList3 = new ArrayList();
                int i20 = 0;
                while (i20 < arrayList2.size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i20);
                    int i21 = 0;
                    while (true) {
                        if (i21 < i19) {
                            String str4 = strArr[i21];
                            String I0 = gjVar.I0();
                            if (I0 == null || I0.length() == 0) {
                                i7 = i18;
                            } else if (I0.toLowerCase().contains(str4)) {
                                arrayList3.add(gjVar);
                            } else {
                                i7 = i18;
                                if (gs0Var.r != i7) {
                                    continue;
                                } else {
                                    TLRPC.Document document = gjVar.D == 0 ? org.telegram.messenger.gj.n1(gjVar.k).webpage.document : org.telegram.messenger.gj.n1(gjVar.k).document;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i22);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str5 = documentAttribute.performer;
                                                boolean contains = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                z10 = (contains || (str = documentAttribute.title) == null) ? contains : str.toLowerCase().contains(str4);
                                            } else {
                                                i22++;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    if (z10) {
                                        arrayList3.add(gjVar);
                                    }
                                }
                            }
                            i21++;
                            i18 = i7;
                        }
                    }
                    i7 = i18;
                    i20++;
                    i18 = i7;
                }
                org.telegram.messenger.g0.g3(new fm0(10, gs0Var, arrayList3));
                return;
            case 1:
                kw0 kw0Var = (kw0) this.c;
                String str6 = (String) this.b;
                org.telegram.messenger.ty tyVar = (org.telegram.messenger.ty) this.d;
                if (kw0Var.J) {
                    return;
                }
                kw0Var.U1.remove(str6);
                if ("application/x-tgsticker".equals(tyVar.d)) {
                    tyVar.c = true;
                    int indexOf = kw0Var.T1.indexOf(tyVar);
                    if (indexOf >= 0) {
                        v4.f1 K = kw0Var.n1.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.a8) K.a).setSticker(tyVar);
                        }
                    } else {
                        kw0Var.o1.f();
                    }
                } else {
                    kw0Var.T0(tyVar);
                }
                if (kw0Var.U1.isEmpty()) {
                    kw0Var.a1();
                    return;
                }
                return;
            case 2:
                kw0 kw0Var2 = (kw0) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                Boolean bool = (Boolean) this.b;
                kw0Var2.T1 = arrayList4;
                if (arrayList4.isEmpty()) {
                    kw0Var2.dismiss();
                    return;
                }
                kw0Var2.o1.f();
                if (bool.booleanValue()) {
                    kw0Var2.U1 = new HashMap();
                    int size = kw0Var2.T1.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        org.telegram.messenger.ty tyVar2 = (org.telegram.messenger.ty) kw0Var2.T1.get(i23);
                        kw0Var2.U1.put(tyVar2.a, tyVar2);
                        org.telegram.messenger.w7.G(kw0Var2.a).h0(false, 67108864, tyVar2.a, true);
                    }
                }
                kw0Var2.a1();
                return;
            case 3:
                kw0 kw0Var3 = (kw0) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = kw0Var3.G1;
                TLRPC.StickerSet stickerSet = kw0Var3.N1.set;
                int i24 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                try {
                    if (tL_error == null) {
                        if (kw0Var3.e2) {
                            gc.g(g2Var, new pv0(kw0Var3.w1.getContext(), kw0Var3.N1, 1, 2, null, kw0Var3.J0), 1500).j();
                        }
                        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            org.telegram.messenger.si.d0(kw0Var3.a).E1(g2Var, true, i24, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                        }
                    } else {
                        Toast.makeText(kw0Var3.getContext(), org.telegram.messenger.hd.N0(2131751093, null), 0).show();
                    }
                    z11 = true;
                } catch (Exception e10) {
                    z11 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.si.d0(kw0Var3.a).d1(i24, false, z11);
                return;
            case 4:
                kw0 kw0Var4 = (kw0) this.c;
                String str7 = (String) this.b;
                TextView textView = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str7;
                kw0Var4.k2 = ConnectionsManager.getInstance(kw0Var4.a).sendRequest(tL_stickers_checkShortName, new bi.q1(kw0Var4, str7, textView, 20), 2);
                return;
            case 5:
                kw0 kw0Var5 = (kw0) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.b;
                ArrayList arrayList7 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList5.size();
                Boolean bool2 = null;
                int i25 = 0;
                while (true) {
                    if (i25 < size2) {
                        Object obj2 = arrayList5.get(i25);
                        if (obj2 instanceof Uri) {
                            Uri uri = (Uri) obj2;
                            String[] strArr2 = MediaController.W1;
                            i10 = i15;
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
                            int i26 = i17;
                            try {
                                if (inputStream2 == null) {
                                    try {
                                        file = new File(uri.getPath());
                                    } catch (Exception e11) {
                                        e = e11;
                                        inputStream3 = inputStream2;
                                        z12 = i26;
                                        arrayList = arrayList5;
                                        org.telegram.messenger.a8.g(e, z12);
                                        if (inputStream3 != null) {
                                        }
                                        str8 = null;
                                        if (str8 != null) {
                                        }
                                        i25++;
                                        i15 = i10;
                                        arrayList5 = arrayList;
                                        i16 = 0;
                                        i13 = 12;
                                        i17 = 1;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        inputStream = inputStream2;
                                        if (inputStream == null) {
                                        }
                                    }
                                    if (file.exists()) {
                                        inputStream3 = new FileInputStream(file);
                                        bArr = new byte[i13];
                                        arrayList = arrayList5;
                                        if (inputStream3.read(bArr, i16, i13) == i13) {
                                            try {
                                                try {
                                                    byte b10 = bArr[i16];
                                                    if (b10 == -119 && bArr[i26] == 80 && bArr[i10] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                                                        str8 = "png";
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            z13 = i26;
                                                            org.telegram.messenger.a8.g(e, z13);
                                                            if (str8 != null) {
                                                            }
                                                            i25++;
                                                            i15 = i10;
                                                            arrayList5 = arrayList;
                                                            i16 = 0;
                                                            i13 = 12;
                                                            i17 = 1;
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
                                                                if (str8 != null) {
                                                                }
                                                                i25++;
                                                                i15 = i10;
                                                                arrayList5 = arrayList;
                                                                i16 = 0;
                                                                i13 = 12;
                                                                i17 = 1;
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    z12 = true;
                                                    org.telegram.messenger.a8.g(e, z12);
                                                    if (inputStream3 != null) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            org.telegram.messenger.a8.g(e, z12);
                                                            str8 = null;
                                                            if (str8 != null) {
                                                            }
                                                            i25++;
                                                            i15 = i10;
                                                            arrayList5 = arrayList;
                                                            i16 = 0;
                                                            i13 = 12;
                                                            i17 = 1;
                                                        }
                                                    }
                                                    str8 = null;
                                                    if (str8 != null) {
                                                    }
                                                    i25++;
                                                    i15 = i10;
                                                    arrayList5 = arrayList;
                                                    i16 = 0;
                                                    i13 = 12;
                                                    i17 = 1;
                                                }
                                                if (str8 != null) {
                                                    continue;
                                                } else {
                                                    boolean equals = "tgs".equals(str8);
                                                    if (bool2 == null) {
                                                        bool2 = Boolean.valueOf(equals);
                                                    } else if (bool2.booleanValue() != equals) {
                                                        continue;
                                                    }
                                                    if (kw0Var5.J) {
                                                        return;
                                                    }
                                                    org.telegram.messenger.ty tyVar3 = new org.telegram.messenger.ty();
                                                    tyVar3.e = equals;
                                                    String t6 = MediaController.t((equals ? 64 : 512) * 1024, uri, str8);
                                                    tyVar3.a = t6;
                                                    if (t6 != null) {
                                                        if (equals) {
                                                            tyVar3.d = "application/x-tgsticker";
                                                        } else {
                                                            BitmapFactory.decodeFile(t6, options);
                                                            int i27 = options.outWidth;
                                                            if ((i27 == 512 && (i11 = options.outHeight) > 0 && i11 <= 512) || (options.outHeight == 512 && i27 > 0 && i27 <= 512)) {
                                                                tyVar3.d = "image/".concat(str8);
                                                                tyVar3.c = true;
                                                            }
                                                        }
                                                        if (arrayList6 != null && arrayList6.size() == size2 && (arrayList6.get(i25) instanceof String)) {
                                                            tyVar3.b = (String) arrayList6.get(i25);
                                                        } else {
                                                            tyVar3.b = "#️⃣";
                                                        }
                                                        arrayList7.add(tyVar3);
                                                        if (arrayList7.size() >= 200) {
                                                        }
                                                    } else {
                                                        continue;
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
                                                } catch (Exception e17) {
                                                    org.telegram.messenger.a8.g(e17, true);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        inputStream3.close();
                                        str8 = null;
                                        if (str8 != null) {
                                        }
                                    }
                                }
                                bArr = new byte[i13];
                                arrayList = arrayList5;
                                if (inputStream3.read(bArr, i16, i13) == i13) {
                                }
                                inputStream3.close();
                                str8 = null;
                                if (str8 != null) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            inputStream3 = inputStream2;
                        } else {
                            arrayList = arrayList5;
                            i10 = i15;
                        }
                        i25++;
                        i15 = i10;
                        arrayList5 = arrayList;
                        i16 = 0;
                        i13 = 12;
                        i17 = 1;
                    } else {
                        i10 = i15;
                    }
                }
                org.telegram.messenger.g0.g3(new es0((Object) kw0Var5, (Object) arrayList7, (Serializable) bool2, i10));
                return;
            case 6:
                j41 j41Var = (j41) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                SparseArray sparseArray = j41Var.f;
                ArrayList arrayList8 = j41Var.e;
                ArrayList arrayList9 = j41Var.n;
                SparseArray sparseArray2 = j41Var.d;
                j41Var.r = false;
                if (tL_error2 != null || !(tLObject2 instanceof TLRPC.TL_messages_featuredStickers)) {
                    j41Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList10 = ((TLRPC.TL_messages_featuredStickers) tLObject2).sets;
                if (arrayList10.size() < 40) {
                    j41Var.s = true;
                }
                if (arrayList10.isEmpty()) {
                    return;
                }
                if (arrayList9.isEmpty()) {
                    int i28 = j41Var.x;
                    j41Var.x = i28 + 1;
                    sparseArray2.put(i28, -1);
                }
                arrayList9.addAll(arrayList10);
                int size3 = arrayList8.size();
                for (int i29 = 0; i29 < arrayList10.size(); i29++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList10.get(i29);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList8.add(stickerSetCovered);
                        sparseArray.put(j41Var.x, stickerSetCovered);
                        int i30 = j41Var.x;
                        j41Var.x = i30 + 1;
                        int i31 = size3 + 1;
                        sparseArray2.put(i30, Integer.valueOf(size3));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(j41Var.x, stickerSetCovered.cover);
                            i12 = 1;
                        } else {
                            i12 = (int) Math.ceil(stickerSetCovered.covers.size() / j41Var.w);
                            for (int i32 = 0; i32 < stickerSetCovered.covers.size(); i32++) {
                                sparseArray2.put(j41Var.x + i32, stickerSetCovered.covers.get(i32));
                            }
                        }
                        int i33 = 0;
                        while (true) {
                            int i34 = j41Var.w * i12;
                            if (i33 < i34) {
                                sparseArray.put(j41Var.x + i33, stickerSetCovered);
                                i33++;
                            } else {
                                j41Var.x = i34 + j41Var.x;
                                size3 = i31;
                            }
                        }
                    }
                }
                j41Var.f();
                return;
            case 7:
                o61 o61Var = (o61) this.c;
                Uri uri2 = (Uri) this.b;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.d;
                o61Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.z(uri2.getQueryParameter("account")).intValue();
                    Object obj3 = org.telegram.messenger.w7.G(intValue).H.get(Utilities.z(uri2.getQueryParameter("rid")));
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
                        File z17 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z17, a8.p0.r(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(intValue);
                        absolutePath = org.telegram.messenger.w7.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    o61Var.b = new c6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj3, 0L, intValue, true);
                } else {
                    o61Var.b = new c6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                o61Var.c = o61Var.b.d[4];
                float f10 = o61Var.h;
                if (f10 != 0.0f) {
                    o61Var.e(gjVar2, f10, o61Var.r);
                    o61Var.h = 0.0f;
                }
                org.telegram.messenger.g0.g3(new l61(o61Var, i17));
                return;
            case 8:
                o61 o61Var2 = (o61) this.c;
                h61 h61Var = (h61) this.b;
                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.d;
                o61Var2.getClass();
                if (h61Var.b()) {
                    o61Var2.b = new c6(new File(h61Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i35 = org.telegram.messenger.k10.t0;
                    try {
                        i35 = Utilities.z(h61Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e18) {
                        org.telegram.messenger.a8.g(e18, true);
                    }
                    int i36 = i35;
                    try {
                        obj = org.telegram.messenger.w7.G(i36).H.get(Utilities.z(h61Var.d.getQueryParameter("rid")));
                    } catch (Exception e19) {
                        org.telegram.messenger.a8.g(e19, true);
                        obj = null;
                    }
                    TLRPC.Document document2 = h61Var.g;
                    if (org.telegram.messenger.w7.G(i36).S(org.telegram.messenger.w7.r(null, document2))) {
                        File z18 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z18, a8.p0.r(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(i36);
                        absolutePath2 = org.telegram.messenger.w7.J(document2, null, false, true).getAbsolutePath();
                    }
                    o61Var2.b = new c6(new File(absolutePath2), true, document2.size, 1, document2, null, obj, 0L, i36, true);
                }
                o61Var2.c = o61Var2.b.d[4];
                float f11 = o61Var2.h;
                if (f11 != 0.0f) {
                    o61Var2.e(gjVar3, f11, o61Var2.r);
                    o61Var2.h = 0.0f;
                }
                org.telegram.messenger.g0.g3(new l61(o61Var2, i15));
                return;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.c;
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.b;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.d;
                ValueAnimator valueAnimator = k0Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                yVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.i0(k0Var, yVar, i14)).setDuration(100L).start();
                if (yVar2 != null) {
                    yVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.w(yVar2, i14)).start();
                    return;
                }
                return;
            case 10:
                File file2 = (File) this.c;
                int[] iArr = (int[]) this.b;
                di.m6 m6Var = (di.m6) this.d;
                AnimatedFileNative.d(file2.getAbsolutePath(), iArr, 0L);
                org.telegram.messenger.g0.g3(m6Var);
                return;
            case 11:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.c;
                q0.a aVar = (q0.a) this.b;
                String[] strArr3 = (String[]) this.d;
                v0Var.getClass();
                int length = strArr3.length;
                int i37 = 0;
                while (true) {
                    if (i37 >= length) {
                        z15 = true;
                    } else if (v0Var.getContext().checkSelfPermission(strArr3[i37]) == 0) {
                        i37++;
                    }
                }
                aVar.accept(Boolean.valueOf(z15));
                return;
            case 12:
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
                } catch (Exception e20) {
                    org.telegram.messenger.a8.g(e20, true);
                    return;
                }
            case 13:
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
                            int i38 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = i38 | 12;
                            ConnectionsManager.getInstance(v0Var3.N).sendRequest(tL_messages_requestUrlAuth, new bi.k2(v0Var3, tL_messages_requestUrlAuth, optString, originHost, 20), 2);
                            return;
                        } catch (Exception e21) {
                            org.telegram.messenger.a8.g(e21, true);
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
                        if (v0Var3.getParent() instanceof ki.r3) {
                            ki.r3 r3Var = (ki.r3) v0Var3.getParent();
                            r3Var.P = z14;
                            r3Var.Q = z16;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 14:
                hi.s2 s2Var = (hi.s2) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                String str13 = (String) this.b;
                ArrayList arrayList12 = new ArrayList();
                for (int i39 = 0; i39 < arrayList11.size(); i39++) {
                    org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) arrayList11.get(i39);
                    if (hi.s2.n(w0Var.c, str13) || ((z1Var = w0Var.d) != null && (hi.s2.n(z1Var.c, str13) || hi.s2.n(w0Var.d.d, str13)))) {
                        arrayList12.add(w0Var);
                    }
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.u4(22, s2Var, arrayList12));
                return;
            case 15:
                a();
                return;
            case 16:
                org.telegram.utils.twidget.z0.r((org.telegram.utils.twidget.z0) this.c, (org.telegram.utils.twidget.y0) this.d, (String) this.b);
                return;
            case 17:
                ((EglRenderer) this.c).lambda$init$0((EglBase.Context) this.b, (int[]) this.d);
                return;
            case 18:
                ((EglRenderer) this.c).lambda$removeFrameListener$4((CountDownLatch) this.b, (EglRenderer.FrameListener) this.d);
                return;
            case 19:
                ((VideoFileRenderer) this.c).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.b, (VideoFrame) this.d);
                return;
            case 20:
                p4.b0 b0Var = (p4.b0) this.c;
                p4.v vVar = (p4.v) this.b;
                KeyEvent keyEvent = (KeyEvent) this.d;
                p4.e0 e0Var = b0Var.b;
                if (e0Var.i(vVar)) {
                    e0Var.b(keyEvent, false, false);
                } else {
                    p4.n0 n0Var = e0Var.h;
                    q4.r rVar = vVar.a;
                    rVar.getClass();
                    n0Var.getClass();
                    n0Var.i0(1, new p4.h0(n0Var, 9), rVar, true);
                }
                b0Var.a = null;
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                d();
                return;
            case 24:
                f();
                return;
            case 25:
                g();
                return;
            case 26:
                h();
                return;
            case 27:
                i();
                return;
            case 28:
                j();
                return;
            default:
                TLObject tLObject3 = (TLObject) this.c;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) this.b;
                wg.u0 u0Var = (wg.u0) this.d;
                if (tLObject3 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                    npVar.f4(tL_channels_channelParticipants.users, false);
                    npVar.Z3(tL_channels_channelParticipants.chats, false);
                    long e22 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).e();
                    ArrayList arrayList13 = new ArrayList();
                    for (int i40 = 0; i40 < tL_channels_channelParticipants.participants.size(); i40++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i40).peer;
                        if (peer != null && org.telegram.messenger.gj.B1(peer) != e22 && (c22 = npVar.c2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.p10.y(c22) && !c22.bot) {
                            arrayList13.add(npVar.o1(peer));
                        }
                    }
                    u0Var.a(arrayList13);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ es0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}

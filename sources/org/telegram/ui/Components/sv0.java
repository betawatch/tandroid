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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sv0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, q2.k] */
    private final void a() {
        q2.j jVar = (q2.j) this.b;
        Exception exc = (Exception) this.d;
        this.c.K(jVar.a, jVar.b, exc);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, q2.k] */
    private final void b() {
        q2.j jVar = (q2.j) this.b;
        nb.a aVar = (nb.a) this.d;
        this.c.c(jVar.a, jVar.b, aVar);
    }

    private final void c() {
        SpannableString spannableString = (SpannableString) this.b;
        ji.j jVar = (ji.j) this.c;
        oi.s2 s2Var = (oi.s2) this.d;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) jVar.b);
        s2Var.run();
    }

    private final void d() {
        SpannableString spannableString = (SpannableString) this.b;
        ji.j jVar = (ji.j) this.c;
        di.o9 o9Var = (di.o9) this.d;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) jVar.b);
        o9Var.a(spannableString);
    }

    private final void f() {
        ((wg.u0) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
    }

    private final void g() {
        TLRPC.User c22;
        TLObject tLObject = (TLObject) this.b;
        org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) this.c;
        wg.u0 u0Var = (wg.u0) this.d;
        if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            mpVar.f4(tL_channels_channelParticipants.users, false);
            mpVar.Z3(tL_channels_channelParticipants.chats, false);
            long e10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).e();
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i7).peer;
                if (peer != null && org.telegram.messenger.fj.B1(peer) != e10 && (c22 = mpVar.c2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.o10.y(c22) && !c22.bot) {
                    arrayList.add(mpVar.o1(peer));
                }
            }
            u0Var.a(arrayList);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(6:460|461|462|463|464|(11:466|325|326|327|328|329|(4:331|332|(2:404|(2:416|(2:420|421))(3:410|411|412))(3:348|349|350)|(1:399)(4:352|(1:354)(2:396|(1:398))|355|(2:394|395)(4:357|(1:359)(1:393)|360|(4:(2:363|(1:368))(1:391)|(1:383)(1:374)|375|(4:377|378|379|380)(1:381))(1:392))))|447|448|441|(0)(0)))(1:323)|325|326|327|328|329|(0)|447|448|441|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:316|(3:317|318|319)|320|321|(6:460|461|462|463|464|(11:466|325|326|327|328|329|(4:331|332|(2:404|(2:416|(2:420|421))(3:410|411|412))(3:348|349|350)|(1:399)(4:352|(1:354)(2:396|(1:398))|355|(2:394|395)(4:357|(1:359)(1:393)|360|(4:(2:363|(1:368))(1:391)|(1:383)(1:374)|375|(4:377|378|379|380)(1:381))(1:392))))|447|448|441|(0)(0)))(1:323)|324|325|326|327|328|329|(0)|447|448|441|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x08d9, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x08dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x08c4, code lost:
    
        org.telegram.messenger.a8.g(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x08c2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x08c3, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x08cc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x08cd, code lost:
    
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x08d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x08d1, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0842 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0979 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x096b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x08d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        ArrayList arrayList;
        int i7;
        Throwable th2;
        InputStream inputStream;
        InputStream inputStream2;
        int i10;
        InputStream inputStream3;
        boolean z11;
        File file;
        int i11;
        byte[] bArr;
        boolean z12;
        int i12;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z13;
        org.telegram.ui.web.z1 z1Var;
        Object obj2;
        int i13 = 12;
        int i14 = 20;
        int i15 = 3;
        int i16 = 2;
        int i17 = 0;
        int i18 = 0;
        boolean z14 = false;
        int i19 = 1;
        r9 = true;
        boolean z15 = true;
        switch (this.a) {
            case 0:
                iw0 iw0Var = (iw0) this.b;
                String str = (String) this.c;
                org.telegram.messenger.sy syVar = (org.telegram.messenger.sy) this.d;
                if (iw0Var.J) {
                    return;
                }
                iw0Var.U1.remove(str);
                if ("application/x-tgsticker".equals(syVar.d)) {
                    syVar.c = true;
                    int indexOf = iw0Var.T1.indexOf(syVar);
                    if (indexOf >= 0) {
                        v4.f1 K = iw0Var.n1.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.z7) K.a).setSticker(syVar);
                        }
                    } else {
                        iw0Var.o1.f();
                    }
                } else {
                    iw0Var.T0(syVar);
                }
                if (iw0Var.U1.isEmpty()) {
                    iw0Var.a1();
                    return;
                }
                return;
            case 1:
                iw0 iw0Var2 = (iw0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                Boolean bool = (Boolean) this.d;
                iw0Var2.T1 = arrayList2;
                if (arrayList2.isEmpty()) {
                    iw0Var2.dismiss();
                    return;
                }
                iw0Var2.o1.f();
                if (bool.booleanValue()) {
                    iw0Var2.U1 = new HashMap();
                    int size = iw0Var2.T1.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        org.telegram.messenger.sy syVar2 = (org.telegram.messenger.sy) iw0Var2.T1.get(i20);
                        iw0Var2.U1.put(syVar2.a, syVar2);
                        org.telegram.messenger.w7.G(iw0Var2.a).h0(false, 67108864, syVar2.a, true);
                    }
                }
                iw0Var2.a1();
                return;
            case 2:
                iw0 iw0Var3 = (iw0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.ActionBar.h2 h2Var = iw0Var3.G1;
                TLRPC.StickerSet stickerSet = iw0Var3.N1.set;
                int i21 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                try {
                    if (tL_error == null) {
                        if (iw0Var3.e2) {
                            gc.g(h2Var, new mv0(iw0Var3.w1.getContext(), iw0Var3.N1, 1, 2, null, iw0Var3.J0), 1500).j();
                        }
                        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            org.telegram.messenger.ri.d0(iw0Var3.a).E1(h2Var, true, i21, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                        }
                    } else {
                        Toast.makeText(iw0Var3.getContext(), org.telegram.messenger.gd.M0(2131751094, null), 0).show();
                    }
                    z10 = true;
                } catch (Exception e10) {
                    z10 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.ri.d0(iw0Var3.a).d1(i21, false, z10);
                return;
            case 3:
                iw0 iw0Var4 = (iw0) this.b;
                String str2 = (String) this.c;
                TextView textView = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str2;
                iw0Var4.k2 = ConnectionsManager.getInstance(iw0Var4.a).sendRequest(tL_stickers_checkShortName, new bi.m1(iw0Var4, str2, textView, i14), 2);
                return;
            case 4:
                iw0 iw0Var5 = (iw0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList3.size();
                Boolean bool2 = null;
                int i22 = 0;
                while (i22 < size2) {
                    Object obj3 = arrayList3.get(i22);
                    int i23 = i15;
                    if (obj3 instanceof Uri) {
                        Uri uri = (Uri) obj3;
                        String[] strArr = MediaController.W1;
                        String str3 = "webp";
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
                        i7 = i16;
                        try {
                            if (inputStream2 == null) {
                                try {
                                    i10 = i19;
                                } catch (Exception e11) {
                                    e = e11;
                                    i10 = i19;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                try {
                                    file = new File(uri.getPath());
                                } catch (Exception e12) {
                                    e = e12;
                                    inputStream3 = inputStream2;
                                    z11 = i10;
                                    arrayList = arrayList3;
                                    org.telegram.messenger.a8.g(e, z11);
                                    if (inputStream3 != null) {
                                    }
                                    str3 = null;
                                    if (str3 != null) {
                                    }
                                    i22++;
                                    i15 = i23;
                                    arrayList3 = arrayList;
                                    i16 = i7;
                                    i17 = 0;
                                    i13 = 12;
                                    i19 = 1;
                                } catch (Throwable th5) {
                                    th = th5;
                                    th2 = th;
                                    inputStream = inputStream2;
                                    if (inputStream == null) {
                                    }
                                }
                                if (file.exists()) {
                                    inputStream3 = new FileInputStream(file);
                                    bArr = new byte[i13];
                                    arrayList = arrayList3;
                                    if (inputStream3.read(bArr, i17, i13) == i13) {
                                        try {
                                            try {
                                                byte b10 = bArr[i17];
                                                if (b10 == -119 && bArr[i10] == 80 && bArr[i7] == 78 && bArr[i23] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                                                    str3 = "png";
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        z12 = i10;
                                                        org.telegram.messenger.a8.g(e, z12);
                                                        if (str3 != null) {
                                                        }
                                                        i22++;
                                                        i15 = i23;
                                                        arrayList3 = arrayList;
                                                        i16 = i7;
                                                        i17 = 0;
                                                        i13 = 12;
                                                        i19 = 1;
                                                    }
                                                } else if (b10 == 31 && bArr[1] == -117) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e14) {
                                                        org.telegram.messenger.a8.g(e14, true);
                                                    }
                                                    str3 = "tgs";
                                                } else {
                                                    String lowerCase = new String(bArr).toLowerCase();
                                                    if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            z12 = true;
                                                            org.telegram.messenger.a8.g(e, z12);
                                                            if (str3 != null) {
                                                            }
                                                            i22++;
                                                            i15 = i23;
                                                            arrayList3 = arrayList;
                                                            i16 = i7;
                                                            i17 = 0;
                                                            i13 = 12;
                                                            i19 = 1;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                th2 = th;
                                                inputStream = inputStream3;
                                                if (inputStream == null) {
                                                    throw th2;
                                                }
                                                try {
                                                    inputStream.close();
                                                    throw th2;
                                                } catch (Exception e16) {
                                                    org.telegram.messenger.a8.g(e16, true);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            z11 = true;
                                            org.telegram.messenger.a8.g(e, z11);
                                            if (inputStream3 != null) {
                                            }
                                            str3 = null;
                                            if (str3 != null) {
                                            }
                                            i22++;
                                            i15 = i23;
                                            arrayList3 = arrayList;
                                            i16 = i7;
                                            i17 = 0;
                                            i13 = 12;
                                            i19 = 1;
                                        }
                                        if (str3 != null) {
                                            continue;
                                        } else {
                                            boolean equals = "tgs".equals(str3);
                                            if (bool2 == null) {
                                                bool2 = Boolean.valueOf(equals);
                                            } else if (bool2.booleanValue() != equals) {
                                                continue;
                                            }
                                            if (iw0Var5.J) {
                                                return;
                                            }
                                            org.telegram.messenger.sy syVar3 = new org.telegram.messenger.sy();
                                            syVar3.e = equals;
                                            String t6 = MediaController.t((equals ? 64 : 512) * 1024, uri, str3);
                                            syVar3.a = t6;
                                            if (t6 != null) {
                                                if (equals) {
                                                    syVar3.d = "application/x-tgsticker";
                                                } else {
                                                    BitmapFactory.decodeFile(t6, options);
                                                    int i24 = options.outWidth;
                                                    if ((i24 == 512 && (i11 = options.outHeight) > 0 && i11 <= 512) || (options.outHeight == 512 && i24 > 0 && i24 <= 512)) {
                                                        syVar3.d = "image/".concat(str3);
                                                        syVar3.c = true;
                                                    }
                                                }
                                                if (arrayList4 != null && arrayList4.size() == size2 && (arrayList4.get(i22) instanceof String)) {
                                                    syVar3.b = (String) arrayList4.get(i22);
                                                } else {
                                                    syVar3.b = "#️⃣";
                                                }
                                                arrayList5.add(syVar3);
                                                if (arrayList5.size() >= 200) {
                                                    org.telegram.messenger.g0.g3(new sv0(iw0Var5, arrayList5, bool2, 1));
                                                    return;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    inputStream3.close();
                                    str3 = null;
                                    if (str3 != null) {
                                    }
                                }
                            } else {
                                i10 = i19;
                            }
                            bArr = new byte[i13];
                            arrayList = arrayList3;
                            if (inputStream3.read(bArr, i17, i13) == i13) {
                            }
                            inputStream3.close();
                            str3 = null;
                            if (str3 != null) {
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                        inputStream3 = inputStream2;
                    } else {
                        arrayList = arrayList3;
                        i7 = i16;
                    }
                    i22++;
                    i15 = i23;
                    arrayList3 = arrayList;
                    i16 = i7;
                    i17 = 0;
                    i13 = 12;
                    i19 = 1;
                }
                org.telegram.messenger.g0.g3(new sv0(iw0Var5, arrayList5, bool2, 1));
                return;
            case 5:
                g41 g41Var = (g41) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                SparseArray sparseArray = g41Var.f;
                ArrayList arrayList6 = g41Var.e;
                ArrayList arrayList7 = g41Var.n;
                SparseArray sparseArray2 = g41Var.d;
                g41Var.r = false;
                if (tL_error2 != null || !(tLObject2 instanceof TLRPC.TL_messages_featuredStickers)) {
                    g41Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList8 = ((TLRPC.TL_messages_featuredStickers) tLObject2).sets;
                if (arrayList8.size() < 40) {
                    g41Var.s = true;
                }
                if (arrayList8.isEmpty()) {
                    return;
                }
                if (arrayList7.isEmpty()) {
                    int i25 = g41Var.x;
                    g41Var.x = i25 + 1;
                    sparseArray2.put(i25, -1);
                }
                arrayList7.addAll(arrayList8);
                int size3 = arrayList6.size();
                for (int i26 = 0; i26 < arrayList8.size(); i26++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList8.get(i26);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList6.add(stickerSetCovered);
                        sparseArray.put(g41Var.x, stickerSetCovered);
                        int i27 = g41Var.x;
                        g41Var.x = i27 + 1;
                        int i28 = size3 + 1;
                        sparseArray2.put(i27, Integer.valueOf(size3));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(g41Var.x, stickerSetCovered.cover);
                            i12 = 1;
                        } else {
                            i12 = (int) Math.ceil(stickerSetCovered.covers.size() / g41Var.w);
                            for (int i29 = 0; i29 < stickerSetCovered.covers.size(); i29++) {
                                sparseArray2.put(g41Var.x + i29, stickerSetCovered.covers.get(i29));
                            }
                        }
                        int i30 = 0;
                        while (true) {
                            int i31 = g41Var.w * i12;
                            if (i30 < i31) {
                                sparseArray.put(g41Var.x + i30, stickerSetCovered);
                                i30++;
                            } else {
                                g41Var.x = i31 + g41Var.x;
                                size3 = i28;
                            }
                        }
                    }
                }
                g41Var.f();
                return;
            case 6:
                l61 l61Var = (l61) this.b;
                Uri uri2 = (Uri) this.c;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
                l61Var.getClass();
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
                        File z16 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z16, a8.p0.r(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(intValue);
                        absolutePath = org.telegram.messenger.w7.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    l61Var.b = new b6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj4, 0L, intValue, true);
                } else {
                    l61Var.b = new b6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                l61Var.c = l61Var.b.d[4];
                float f10 = l61Var.h;
                if (f10 != 0.0f) {
                    l61Var.e(fjVar, f10, l61Var.r);
                    l61Var.h = 0.0f;
                }
                org.telegram.messenger.g0.g3(new i61(l61Var, i19));
                return;
            case 7:
                l61 l61Var2 = (l61) this.b;
                e61 e61Var = (e61) this.c;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.d;
                l61Var2.getClass();
                if (e61Var.b()) {
                    l61Var2.b = new b6(new File(e61Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i32 = org.telegram.messenger.j10.t0;
                    try {
                        i32 = Utilities.z(e61Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e18) {
                        org.telegram.messenger.a8.g(e18, true);
                    }
                    int i33 = i32;
                    try {
                        obj = org.telegram.messenger.w7.G(i33).H.get(Utilities.z(e61Var.d.getQueryParameter("rid")));
                    } catch (Exception e19) {
                        org.telegram.messenger.a8.g(e19, true);
                        obj = null;
                    }
                    TLRPC.Document document = e61Var.g;
                    if (org.telegram.messenger.w7.G(i33).S(org.telegram.messenger.w7.r(null, document))) {
                        File z17 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z17, a8.p0.r(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(i33);
                        absolutePath2 = org.telegram.messenger.w7.J(document, null, false, true).getAbsolutePath();
                    }
                    l61Var2.b = new b6(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i33, true);
                }
                l61Var2.c = l61Var2.b.d[4];
                float f11 = l61Var2.h;
                if (f11 != 0.0f) {
                    l61Var2.e(fjVar2, f11, l61Var2.r);
                    l61Var2.h = 0.0f;
                }
                org.telegram.messenger.g0.g3(new i61(l61Var2, i16));
                return;
            case 8:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.c;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.d;
                ValueAnimator valueAnimator = k0Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                yVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.i0(k0Var, yVar, i15)).setDuration(100L).start();
                if (yVar2 != null) {
                    yVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.w(yVar2, i15)).start();
                    return;
                }
                return;
            case 9:
                File file2 = (File) this.b;
                int[] iArr = (int[]) this.c;
                di.m6 m6Var = (di.m6) this.d;
                AnimatedFileNative.d(file2.getAbsolutePath(), iArr, 0L);
                org.telegram.messenger.g0.g3(m6Var);
                return;
            case 10:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                q0.a aVar = (q0.a) this.c;
                String[] strArr2 = (String[]) this.d;
                v0Var.getClass();
                int length = strArr2.length;
                int i34 = 0;
                while (true) {
                    if (i34 >= length) {
                        z14 = true;
                    } else if (v0Var.getContext().checkSelfPermission(strArr2[i34]) == 0) {
                        i34++;
                    }
                }
                aVar.accept(Boolean.valueOf(z14));
                return;
            case 11:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                try {
                    org.telegram.ui.web.v0 v0Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (v0Var2 == null) {
                        return;
                    }
                    boolean z18 = org.telegram.ui.web.v0.R0;
                    v0Var2.F(botWebViewContainer$BotWebViewProxy, v0Var2.f(), str4, str5);
                    return;
                } catch (Exception e20) {
                    org.telegram.messenger.a8.g(e20, true);
                    return;
                }
            case 12:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
                String str6 = (String) this.c;
                String str7 = (String) this.d;
                org.telegram.ui.web.v0 v0Var3 = botWebViewContainer$WebViewProxy.a;
                if (v0Var3 == null || v0Var3.p0 || v0Var3.c == null) {
                    return;
                }
                if (v0Var3.H0 != null && !TextUtils.equals(v0Var3.getOriginHost(), v0Var3.H0)) {
                    v0Var3.g("onWebEventReceived ignore " + str6);
                    return;
                }
                v0Var3.g("onWebEventReceived " + str6 + " " + str7);
                str6.getClass();
                switch (str6) {
                    case "actionBarColor":
                    case "navigationBarColor":
                        try {
                            JSONArray jSONArray = new JSONArray(str7);
                            boolean equals2 = TextUtils.equals(str6, "actionBarColor");
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
                        v0Var3.g("oauth_request " + str7);
                        if (v0Var3.a == null) {
                            return;
                        }
                        String originHost = v0Var3.getOriginHost();
                        if (TextUtils.isEmpty(originHost)) {
                            return;
                        }
                        try {
                            String optString = new JSONObject(str7).optString("url");
                            v0Var3.y("oauth_supported", org.telegram.ui.web.v0.A(1, "version"));
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                            tL_messages_requestUrlAuth.url = optString;
                            int i35 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = i35 | 12;
                            ConnectionsManager.getInstance(v0Var3.N).sendRequest(tL_messages_requestUrlAuth, new bi.g2(v0Var3, tL_messages_requestUrlAuth, optString, originHost, 20), 2);
                            return;
                        } catch (Exception e21) {
                            org.telegram.messenger.a8.g(e21, true);
                            return;
                        }
                    case "siteName":
                        v0Var3.g("siteName " + str7);
                        org.telegram.ui.web.s0 s0Var2 = v0Var3.a;
                        if (s0Var2 != null) {
                            s0Var2.r = str7;
                            org.telegram.ui.web.s0.a(s0Var2);
                            return;
                        }
                        return;
                    case "allowScroll":
                        try {
                            JSONArray jSONArray2 = new JSONArray(str7);
                            z13 = jSONArray2.optBoolean(0, true);
                            try {
                                z15 = jSONArray2.optBoolean(1, true);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            z13 = true;
                        }
                        if (v0Var3.getParent() instanceof ki.s3) {
                            ki.s3 s3Var = (ki.s3) v0Var3.getParent();
                            s3Var.P = z13;
                            s3Var.Q = z15;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 13:
                hi.t2 t2Var = (hi.t2) this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                String str8 = (String) this.c;
                ArrayList arrayList10 = new ArrayList();
                for (int i36 = 0; i36 < arrayList9.size(); i36++) {
                    org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) arrayList9.get(i36);
                    if (hi.t2.n(w0Var.c, str8) || ((z1Var = w0Var.d) != null && (hi.t2.n(z1Var.c, str8) || hi.t2.n(w0Var.d.d, str8)))) {
                        arrayList10.add(w0Var);
                    }
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.c5(i14, t2Var, arrayList10));
                return;
            case 14:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.b;
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                v1Var.getClass();
                if (org.telegram.ui.web.v1.f == null) {
                    return;
                }
                char c10 = ((u1Var.d > 0 && u1Var.e > 0) || bitmap == null) ? (char) 0 : (char) 1;
                if (bitmap != null) {
                    v1Var.d.put(u1Var.b, bitmap);
                    if (c10 != 0) {
                        int i37 = u1Var.d;
                        if (i37 == 0 && u1Var.e == 0) {
                            u1Var.d = bitmap.getWidth();
                            u1Var.e = bitmap.getHeight();
                        } else if (i37 == 0) {
                            u1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * u1Var.e);
                        } else if (u1Var.e == 0) {
                            u1Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * u1Var.d);
                        }
                    }
                }
                ArrayList arrayList11 = (ArrayList) org.telegram.ui.web.v1.f.remove(u1Var.b);
                if (arrayList11 == null) {
                    return;
                }
                int size4 = arrayList11.size();
                while (i18 < size4) {
                    Object obj5 = arrayList11.get(i18);
                    i18++;
                    Pair pair = (Pair) obj5;
                    ((ImageReceiver) pair.first).v0(bitmap);
                    if (c10 != 0 && (obj2 = pair.second) != null) {
                        ((Runnable) obj2).run();
                    }
                }
                return;
            case 15:
                org.telegram.utils.twidget.z0.r((org.telegram.utils.twidget.z0) this.b, (org.telegram.utils.twidget.y0) this.d, (String) this.c);
                return;
            case 16:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                return;
            case 17:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 18:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 19:
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
            case 20:
                p4.d0 d0Var2 = (p4.d0) this.b;
                p4.r0 r0Var = (p4.r0) this.c;
                p4.w wVar = (p4.w) this.d;
                if (d0Var2.j()) {
                    return;
                }
                p4.i1 i1Var = d0Var2.t;
                r0Var.getClass();
                c8.jb.b(i1Var, wVar);
                return;
            case 21:
                pi.k kVar = (pi.k) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                kVar.getClass();
                for (int i38 = 0; i38 < arrayList12.size(); i38++) {
                    ((View) arrayList12.get(i38)).setVisibility(0);
                }
                if (kVar.A.removeAll(arrayList13)) {
                    for (int i39 = 0; i39 < arrayList13.size(); i39++) {
                        kVar.d((v4.f1) arrayList13.get(i39));
                    }
                    kVar.G();
                }
                kVar.K.removeAll(arrayList12);
                return;
            case 22:
                pi.k kVar2 = (pi.k) this.b;
                View view = (View) this.c;
                v4.f1 f1Var = (v4.f1) this.d;
                kVar2.getClass();
                view.setVisibility(0);
                if (kVar2.A.remove(f1Var)) {
                    kVar2.d(f1Var);
                    kVar2.G();
                }
                kVar2.K.remove(view);
                return;
            case 23:
                a();
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.c;
                org.telegram.messenger.x10 x10Var2 = (org.telegram.messenger.x10) this.d;
                if (tL_error3 != null) {
                    x10Var.a(tL_error3);
                    return;
                } else {
                    x10Var2.a(null);
                    return;
                }
        }
    }

    public /* synthetic */ sv0(Object obj, Object obj2, String str, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }
}

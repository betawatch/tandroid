package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.webkit.WebView;
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
import org.telegram.ui.hc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iv0(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        vi.j jVar = (vi.j) this.b;
        vi.i iVar = (vi.i) this.c;
        File file = (File) this.d;
        m2.t tVar = jVar.g;
        long j10 = iVar.a;
        synchronized (((e0.g) tVar.c).f) {
            ((HashMap) ((e0.g) tVar.c).g).put(Long.valueOf(j10), file);
        }
        ((Handler) ((e0.g) tVar.c).d).post(new org.telegram.messenger.u0(tVar, j10, (org.telegram.messenger.ge) tVar.b, file, 1));
    }

    private final void b() {
        vi.j jVar = (vi.j) this.b;
        vi.i iVar = (vi.i) this.c;
        byte[] bArr = (byte[]) this.d;
        File file = iVar.b;
        if (jVar.G != 4) {
            return;
        }
        jVar.B = bArr;
        try {
            jVar.p();
            if (jVar.e) {
                k2.i0 a10 = new k2.n(jVar.a).a();
                jVar.A = a10;
                a10.u0(jVar.F);
                jVar.A.v0(d2.n0.b(Uri.fromFile(file)));
                jVar.A.a();
            }
            jVar.s(5);
            mi.h0 h0Var = jVar.f;
            long j10 = jVar.j();
            byte[] bArr2 = jVar.B;
            h0Var.Q(j10, bArr2 == null ? null : (byte[]) bArr2.clone());
        } catch (Throwable th2) {
            jVar.g(th2 instanceof Exception ? th2 : new RuntimeException(th2));
        }
    }

    private final void c() {
        wi.t0 t0Var = (wi.t0) this.b;
        wi.w wVar = (wi.w) this.c;
        File file = (File) this.d;
        Handler handler = t0Var.i;
        try {
            wVar.c(file);
            t0Var.g();
            long h = wVar.h();
            t0Var.m.b("preview snapshot completed: durationMs=" + h + ", size=" + file.length() + ", elapsedMs=" + wi.t0.f(t0Var.M));
            handler.post(new wi.e0(t0Var, h, 1));
        } catch (Exception e10) {
            handler.post(new wi.d0(t0Var, e10, 3));
        }
    }

    private final void e() {
        wi.t0 t0Var = (wi.t0) this.b;
        wi.p0 p0Var = (wi.p0) this.c;
        File file = (File) this.d;
        wi.q0 q0Var = t0Var.e;
        long j10 = p0Var.a;
        gy0 gy0Var = (gy0) q0Var;
        synchronized (gy0Var) {
            if (gy0Var.d) {
                return;
            }
            gy0Var.c.put(Long.valueOf(j10), new ey0(file));
        }
    }

    private final void f() {
        TLRPC.User a22;
        TLObject tLObject = (TLObject) this.b;
        org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) this.c;
        xg.u0 u0Var = (xg.u0) this.d;
        if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            hpVar.Y3(tL_channels_channelParticipants.users, false);
            hpVar.S3(tL_channels_channelParticipants.chats, false);
            long e10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).e();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < tL_channels_channelParticipants.participants.size(); i3++) {
                TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i3).peer;
                if (peer != null && org.telegram.messenger.zi.C1(peer) != e10 && (a22 = hpVar.a2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.l10.x(a22) && !a22.bot) {
                    arrayList.add(hpVar.m1(peer));
                }
            }
            u0Var.a(arrayList);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:331|(3:332|333|334)|(6:475|476|477|478|479|(11:481|338|339|340|341|342|(4:344|345|(2:417|(2:429|(2:433|434))(3:423|424|425))(3:361|362|363)|(1:412)(4:365|(1:367)(2:409|(1:411))|368|(2:407|408)(4:370|(1:372)(1:406)|373|(4:(2:376|(1:381))(1:404)|(1:396)(1:387)|388|(4:390|391|392|393)(1:394))(1:405))))|460|461|443|(0)(0)))(1:336)|337|338|339|340|341|342|(0)|460|461|443|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:331|332|333|334|(6:475|476|477|478|479|(11:481|338|339|340|341|342|(4:344|345|(2:417|(2:429|(2:433|434))(3:423|424|425))(3:361|362|363)|(1:412)(4:365|(1:367)(2:409|(1:411))|368|(2:407|408)(4:370|(1:372)(1:406)|373|(4:(2:376|(1:381))(1:404)|(1:396)(1:387)|388|(4:390|391|392|393)(1:394))(1:405))))|460|461|443|(0)(0)))(1:336)|337|338|339|340|341|342|(0)|460|461|443|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x08a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x08a8, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x08b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x08b2, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x08ad, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x08b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x08b9, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x08b5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0828 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x095f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x08bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0953 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.lang.Object, p2.k] */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.Object, p2.k] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i3;
        Throwable th2;
        InputStream inputStream;
        InputStream inputStream2;
        boolean z11;
        InputStream inputStream3;
        File file;
        int i10;
        byte[] bArr;
        boolean z12;
        int i11;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z13;
        org.telegram.ui.web.y1 y1Var;
        Object obj2;
        int i12 = 12;
        int i13 = 7;
        int i14 = 3;
        int i15 = 2;
        int i16 = 0;
        int i17 = 0;
        boolean z14 = false;
        int i18 = 1;
        r12 = true;
        boolean z15 = true;
        switch (this.a) {
            case 0:
                xv0 xv0Var = (xv0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                Boolean bool = (Boolean) this.d;
                xv0Var.Q1 = arrayList;
                if (arrayList.isEmpty()) {
                    xv0Var.dismiss();
                    return;
                }
                xv0Var.l1.f();
                if (bool.booleanValue()) {
                    xv0Var.R1 = new HashMap();
                    int size = xv0Var.Q1.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        org.telegram.messenger.ry ryVar = (org.telegram.messenger.ry) xv0Var.Q1.get(i19);
                        xv0Var.R1.put(ryVar.a, ryVar);
                        org.telegram.messenger.w7.G(xv0Var.a).i0(false, 67108864, ryVar.a, true);
                    }
                }
                xv0Var.Z0();
                return;
            case 1:
                xv0 xv0Var2 = (xv0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = xv0Var2.D1;
                TLRPC.StickerSet stickerSet = xv0Var2.K1.set;
                int i20 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                try {
                    if (tL_error == null) {
                        if (xv0Var2.b2) {
                            ac.g(d2Var, new bv0(xv0Var2.t1.getContext(), xv0Var2.K1, 1, 2, null, xv0Var2.J0), 1500).j();
                        }
                        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            org.telegram.messenger.li.b0(xv0Var2.a).A1(d2Var, true, i20, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                        }
                    } else {
                        Toast.makeText(xv0Var2.getContext(), org.telegram.messenger.bd.M0(2131751106, null), 0).show();
                    }
                    z10 = true;
                } catch (Exception e10) {
                    z10 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.li.b0(xv0Var2.a).a1(i20, false, z10);
                return;
            case 2:
                xv0 xv0Var3 = (xv0) this.b;
                String str = (String) this.c;
                TextView textView = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str;
                xv0Var3.h2 = ConnectionsManager.getInstance(xv0Var3.a).sendRequest(tL_stickers_checkShortName, new ai.r6(xv0Var3, str, textView, 18), 2);
                return;
            case 3:
                xv0 xv0Var4 = (xv0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList2.size();
                Boolean bool2 = null;
                int i21 = 0;
                while (i21 < size2) {
                    Object obj3 = arrayList2.get(i21);
                    int i22 = i14;
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
                        if (inputStream2 == null) {
                            try {
                                try {
                                    i3 = i15;
                                    try {
                                        file = new File(uri.getPath());
                                    } catch (Exception e11) {
                                        e = e11;
                                        z11 = i18;
                                        inputStream3 = inputStream2;
                                        org.telegram.messenger.a8.g(e, z11);
                                        if (inputStream3 != null) {
                                        }
                                        str2 = null;
                                        if (str2 == null) {
                                        }
                                        i21++;
                                        i14 = i22;
                                        i15 = i3;
                                        i12 = 12;
                                        i16 = 0;
                                        i18 = 1;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    i3 = i15;
                                }
                                if (file.exists()) {
                                    inputStream3 = new FileInputStream(file);
                                    bArr = new byte[i12];
                                    int i23 = i18;
                                    if (inputStream3.read(bArr, i16, i12) == i12) {
                                        try {
                                            try {
                                                byte b10 = bArr[i16];
                                                if (b10 == -119 && bArr[i23] == 80 && bArr[i3] == 78 && bArr[i22] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                                                    str2 = "png";
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        z12 = i23;
                                                        org.telegram.messenger.a8.g(e, z12);
                                                        if (str2 == null) {
                                                        }
                                                        i21++;
                                                        i14 = i22;
                                                        i15 = i3;
                                                        i12 = 12;
                                                        i16 = 0;
                                                        i18 = 1;
                                                    }
                                                } else if (b10 == 31 && bArr[1] == -117) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e14) {
                                                        org.telegram.messenger.a8.g(e14, true);
                                                    }
                                                    str2 = "tgs";
                                                } else {
                                                    String lowerCase = new String(bArr).toLowerCase();
                                                    if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            z12 = true;
                                                            org.telegram.messenger.a8.g(e, z12);
                                                            if (str2 == null) {
                                                            }
                                                            i21++;
                                                            i14 = i22;
                                                            i15 = i3;
                                                            i12 = 12;
                                                            i16 = 0;
                                                            i18 = 1;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                                z11 = true;
                                                org.telegram.messenger.a8.g(e, z11);
                                                if (inputStream3 != null) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e17) {
                                                        Exception e18 = e17;
                                                        org.telegram.messenger.a8.g(e18, z11);
                                                        str2 = null;
                                                        if (str2 == null) {
                                                        }
                                                        i21++;
                                                        i14 = i22;
                                                        i15 = i3;
                                                        i12 = 12;
                                                        i16 = 0;
                                                        i18 = 1;
                                                    }
                                                }
                                                str2 = null;
                                                if (str2 == null) {
                                                }
                                                i21++;
                                                i14 = i22;
                                                i15 = i3;
                                                i12 = 12;
                                                i16 = 0;
                                                i18 = 1;
                                            }
                                            if (str2 == null) {
                                                continue;
                                            } else {
                                                boolean equals = "tgs".equals(str2);
                                                if (bool2 == null) {
                                                    bool2 = Boolean.valueOf(equals);
                                                } else if (bool2.booleanValue() != equals) {
                                                    continue;
                                                }
                                                if (xv0Var4.J) {
                                                    return;
                                                }
                                                org.telegram.messenger.ry ryVar2 = new org.telegram.messenger.ry();
                                                ryVar2.e = equals;
                                                String t10 = MediaController.t((equals ? 64 : 512) * 1024, uri, str2);
                                                ryVar2.a = t10;
                                                if (t10 != null) {
                                                    if (equals) {
                                                        ryVar2.d = "application/x-tgsticker";
                                                    } else {
                                                        BitmapFactory.decodeFile(t10, options);
                                                        int i24 = options.outWidth;
                                                        if ((i24 == 512 && (i10 = options.outHeight) > 0 && i10 <= 512) || (options.outHeight == 512 && i24 > 0 && i24 <= 512)) {
                                                            ryVar2.d = "image/".concat(str2);
                                                            ryVar2.c = true;
                                                        }
                                                    }
                                                    if (arrayList3 != null && arrayList3.size() == size2 && (arrayList3.get(i21) instanceof String)) {
                                                        ryVar2.b = (String) arrayList3.get(i21);
                                                    } else {
                                                        ryVar2.b = "#️⃣";
                                                    }
                                                    arrayList4.add(ryVar2);
                                                    if (arrayList4.size() >= 200) {
                                                        org.telegram.messenger.g0.h3(new iv0(xv0Var4, arrayList4, bool2, 0));
                                                        return;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th2 = th;
                                            inputStream = inputStream3;
                                            if (inputStream == null) {
                                                throw th2;
                                            }
                                            try {
                                                inputStream.close();
                                                throw th2;
                                            } catch (Exception e19) {
                                                org.telegram.messenger.a8.g(e19, true);
                                                throw th2;
                                            }
                                        }
                                    }
                                    inputStream3.close();
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                inputStream = inputStream2;
                                if (inputStream == null) {
                                }
                            }
                        } else {
                            i3 = i15;
                        }
                        inputStream3 = inputStream2;
                        bArr = new byte[i12];
                        int i232 = i18;
                        if (inputStream3.read(bArr, i16, i12) == i12) {
                        }
                        inputStream3.close();
                        str2 = null;
                        if (str2 == null) {
                        }
                    } else {
                        i3 = i15;
                    }
                    i21++;
                    i14 = i22;
                    i15 = i3;
                    i12 = 12;
                    i16 = 0;
                    i18 = 1;
                }
                org.telegram.messenger.g0.h3(new iv0(xv0Var4, arrayList4, bool2, 0));
                return;
            case 4:
                m31 m31Var = (m31) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                SparseArray sparseArray = m31Var.f;
                ArrayList arrayList5 = m31Var.e;
                ArrayList arrayList6 = m31Var.n;
                SparseArray sparseArray2 = m31Var.d;
                m31Var.r = false;
                if (tL_error2 != null || !(tLObject2 instanceof TLRPC.TL_messages_featuredStickers)) {
                    m31Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList7 = ((TLRPC.TL_messages_featuredStickers) tLObject2).sets;
                if (arrayList7.size() < 40) {
                    m31Var.s = true;
                }
                if (arrayList7.isEmpty()) {
                    return;
                }
                if (arrayList6.isEmpty()) {
                    int i25 = m31Var.x;
                    m31Var.x = i25 + 1;
                    sparseArray2.put(i25, -1);
                }
                arrayList6.addAll(arrayList7);
                int size3 = arrayList5.size();
                for (int i26 = 0; i26 < arrayList7.size(); i26++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList7.get(i26);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList5.add(stickerSetCovered);
                        sparseArray.put(m31Var.x, stickerSetCovered);
                        int i27 = m31Var.x;
                        m31Var.x = i27 + 1;
                        int i28 = size3 + 1;
                        sparseArray2.put(i27, Integer.valueOf(size3));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(m31Var.x, stickerSetCovered.cover);
                            i11 = 1;
                        } else {
                            i11 = (int) Math.ceil(stickerSetCovered.covers.size() / m31Var.w);
                            for (int i29 = 0; i29 < stickerSetCovered.covers.size(); i29++) {
                                sparseArray2.put(m31Var.x + i29, stickerSetCovered.covers.get(i29));
                            }
                        }
                        int i30 = 0;
                        while (true) {
                            int i31 = m31Var.w * i11;
                            if (i30 < i31) {
                                sparseArray.put(m31Var.x + i30, stickerSetCovered);
                                i30++;
                            } else {
                                m31Var.x = i31 + m31Var.x;
                                size3 = i28;
                            }
                        }
                    }
                }
                m31Var.f();
                return;
            case 5:
                s51 s51Var = (s51) this.b;
                Uri uri2 = (Uri) this.c;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.d;
                s51Var.getClass();
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
                    if (org.telegram.messenger.w7.G(intValue).T(org.telegram.messenger.w7.r(null, tL_document))) {
                        File z16 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z16, a1.g.r(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(intValue);
                        absolutePath = org.telegram.messenger.w7.K(tL_document, null, false, true).getAbsolutePath();
                    }
                    s51Var.b = new t5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj4, 0L, intValue, true);
                } else {
                    s51Var.b = new t5(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                s51Var.c = s51Var.b.d[4];
                float f10 = s51Var.h;
                if (f10 != 0.0f) {
                    s51Var.e(ziVar, f10, s51Var.r);
                    s51Var.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new p51(s51Var, i18));
                return;
            case 6:
                s51 s51Var2 = (s51) this.b;
                l51 l51Var = (l51) this.c;
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) this.d;
                s51Var2.getClass();
                if (l51Var.b()) {
                    s51Var2.b = new t5(new File(l51Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i32 = org.telegram.messenger.h10.t0;
                    try {
                        i32 = Utilities.z(l51Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e20) {
                        org.telegram.messenger.a8.g(e20, true);
                    }
                    int i33 = i32;
                    try {
                        obj = org.telegram.messenger.w7.G(i33).H.get(Utilities.z(l51Var.d.getQueryParameter("rid")));
                    } catch (Exception e21) {
                        org.telegram.messenger.a8.g(e21, true);
                        obj = null;
                    }
                    TLRPC.Document document = l51Var.g;
                    if (org.telegram.messenger.w7.G(i33).T(org.telegram.messenger.w7.r(null, document))) {
                        File z17 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z17, a1.g.r(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(i33);
                        absolutePath2 = org.telegram.messenger.w7.K(document, null, false, true).getAbsolutePath();
                    }
                    s51Var2.b = new t5(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i33, true);
                }
                s51Var2.c = s51Var2.b.d[4];
                float f11 = s51Var2.h;
                if (f11 != 0.0f) {
                    s51Var2.e(ziVar2, f11, s51Var2.r);
                    s51Var2.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new p51(s51Var2, i15));
                return;
            case 7:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.b;
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.c;
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) this.d;
                ValueAnimator valueAnimator = xVar.O0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                rVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.v(xVar, rVar, i14)).setDuration(100L).start();
                if (rVar2 != null) {
                    rVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.p(rVar2, i14)).start();
                    return;
                }
                return;
            case 8:
                File file2 = (File) this.b;
                int[] iArr = (int[]) this.c;
                ci.s6 s6Var = (ci.s6) this.d;
                AnimatedFileNative.d(file2.getAbsolutePath(), iArr, 0L);
                org.telegram.messenger.g0.h3(s6Var);
                return;
            case 9:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.b;
                q0.a aVar = (q0.a) this.c;
                String[] strArr2 = (String[]) this.d;
                w0Var.getClass();
                int length = strArr2.length;
                int i34 = 0;
                while (true) {
                    if (i34 >= length) {
                        z14 = true;
                    } else if (w0Var.getContext().checkSelfPermission(strArr2[i34]) == 0) {
                        i34++;
                    }
                }
                aVar.accept(Boolean.valueOf(z14));
                return;
            case 10:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                try {
                    org.telegram.ui.web.w0 w0Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (w0Var2 == null) {
                        return;
                    }
                    boolean z18 = org.telegram.ui.web.w0.R0;
                    w0Var2.E(botWebViewContainer$BotWebViewProxy, w0Var2.f(), str3, str4);
                    return;
                } catch (Exception e22) {
                    org.telegram.messenger.a8.g(e22, true);
                    return;
                }
            case 11:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                org.telegram.ui.web.w0 w0Var3 = botWebViewContainer$WebViewProxy.a;
                if (w0Var3 == null || w0Var3.p0 || w0Var3.c == null) {
                    return;
                }
                if (w0Var3.H0 != null && !TextUtils.equals(w0Var3.getOriginHost(), w0Var3.H0)) {
                    w0Var3.g("onWebEventReceived ignore " + str5);
                    return;
                }
                w0Var3.g("onWebEventReceived " + str5 + " " + str6);
                str5.getClass();
                switch (str5) {
                    case "actionBarColor":
                    case "navigationBarColor":
                        try {
                            JSONArray jSONArray = new JSONArray(str6);
                            boolean equals2 = TextUtils.equals(str5, "actionBarColor");
                            int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                            org.telegram.ui.web.t0 t0Var = w0Var3.a;
                            if (t0Var != null) {
                                if (equals2) {
                                    t0Var.s = true;
                                    t0Var.x = argb;
                                } else {
                                    t0Var.w = true;
                                    t0Var.y = argb;
                                }
                                org.telegram.ui.web.t0.a(t0Var);
                            }
                            w0Var3.c.o(argb, equals2);
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    case "oauth_request":
                        w0Var3.g("oauth_request " + str6);
                        if (w0Var3.a == null) {
                            return;
                        }
                        String originHost = w0Var3.getOriginHost();
                        if (TextUtils.isEmpty(originHost)) {
                            return;
                        }
                        try {
                            String optString = new JSONObject(str6).optString("url");
                            w0Var3.y("oauth_supported", org.telegram.ui.web.w0.A(1, "version"));
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                            tL_messages_requestUrlAuth.url = optString;
                            int i35 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = 12 | i35;
                            ConnectionsManager.getInstance(w0Var3.N).sendRequest(tL_messages_requestUrlAuth, new ai.q1(w0Var3, tL_messages_requestUrlAuth, optString, originHost, 20), 2);
                            return;
                        } catch (Exception e23) {
                            org.telegram.messenger.a8.g(e23, true);
                            return;
                        }
                    case "siteName":
                        w0Var3.g("siteName " + str6);
                        org.telegram.ui.web.t0 t0Var2 = w0Var3.a;
                        if (t0Var2 != null) {
                            t0Var2.r = str6;
                            org.telegram.ui.web.t0.a(t0Var2);
                            return;
                        }
                        return;
                    case "allowScroll":
                        try {
                            JSONArray jSONArray2 = new JSONArray(str6);
                            z13 = jSONArray2.optBoolean(0, true);
                            try {
                                z15 = jSONArray2.optBoolean(1, true);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            z13 = true;
                        }
                        if (w0Var3.getParent() instanceof ii.c4) {
                            ii.c4 c4Var = (ii.c4) w0Var3.getParent();
                            c4Var.P = z13;
                            c4Var.Q = z15;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 12:
                gi.s2 s2Var = (gi.s2) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                String str7 = (String) this.d;
                ArrayList arrayList9 = new ArrayList();
                for (int i36 = 0; i36 < arrayList8.size(); i36++) {
                    org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) arrayList8.get(i36);
                    if (gi.s2.n(x0Var.c, str7) || ((y1Var = x0Var.d) != null && (gi.s2.n(y1Var.c, str7) || gi.s2.n(x0Var.d.d, str7)))) {
                        arrayList9.add(x0Var);
                    }
                }
                org.telegram.messenger.g0.h3(new hc1(i13, s2Var, arrayList9));
                return;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.b;
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                u1Var.getClass();
                if (org.telegram.ui.web.u1.f == null) {
                    return;
                }
                char c2 = ((t1Var.d > 0 && t1Var.e > 0) || bitmap == null) ? (char) 0 : (char) 1;
                if (bitmap != null) {
                    u1Var.d.put(t1Var.b, bitmap);
                    if (c2 != 0) {
                        int i37 = t1Var.d;
                        if (i37 == 0 && t1Var.e == 0) {
                            t1Var.d = bitmap.getWidth();
                            t1Var.e = bitmap.getHeight();
                        } else if (i37 == 0) {
                            t1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * t1Var.e);
                        } else if (t1Var.e == 0) {
                            t1Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * t1Var.d);
                        }
                    }
                }
                ArrayList arrayList10 = (ArrayList) org.telegram.ui.web.u1.f.remove(t1Var.b);
                if (arrayList10 == null) {
                    return;
                }
                int size4 = arrayList10.size();
                while (i17 < size4) {
                    Object obj5 = arrayList10.get(i17);
                    i17++;
                    Pair pair = (Pair) obj5;
                    ((ImageReceiver) pair.first).v0(bitmap);
                    if (c2 != 0 && (obj2 = pair.second) != null) {
                        ((Runnable) obj2).run();
                    }
                }
                return;
            case 14:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                return;
            case 15:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 16:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 17:
                p2.j jVar = (p2.j) this.b;
                this.c.A(jVar.a, jVar.b, (Exception) this.d);
                return;
            case 18:
                p2.j jVar2 = (p2.j) this.b;
                this.c.x(jVar2.a, jVar2.b, (v7.s) this.d);
                return;
            case 19:
                ui.j jVar3 = (ui.j) this.b;
                WebView webView = (WebView) this.c;
                d5.g gVar = (d5.g) this.d;
                synchronized (jVar3.a) {
                    if (!jVar3.u && jVar3.o == webView && jVar3.p == gVar && !jVar3.r) {
                        if (jVar3.s) {
                            org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            jVar3.q();
                            return;
                        } else {
                            jVar3.s = true;
                            org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                            jVar3.h();
                            return;
                        }
                    }
                    return;
                }
            case 20:
                b();
                return;
            case 21:
                a();
                return;
            case 22:
                wi.s sVar = (wi.s) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                sVar.getClass();
                try {
                    sVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 23:
                c();
                return;
            case 24:
                e();
                return;
            case 25:
                ((xg.u0) this.b).a(new Pair((HashMap) this.d, (ArrayList) this.c));
                return;
            case 26:
                f();
                return;
            case 27:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.c;
                org.telegram.messenger.u10 u10Var2 = (org.telegram.messenger.u10) this.d;
                if (tL_error3 != null) {
                    u10Var.a(tL_error3);
                    return;
                } else {
                    u10Var2.a(null);
                    return;
                }
            case 28:
                ((gi.j8) this.b).a(new Pair((HashMap) this.d, (ArrayList) this.c));
                return;
            default:
                yh.l lVar = (yh.l) this.b;
                t70 t70Var = (t70) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                r70 r70Var = lVar.H;
                if (r70Var == null || lVar.I != t70Var) {
                    return;
                }
                r70Var.a(clickableSpan);
                lVar.I = null;
                lVar.y.f(true);
                return;
        }
    }

    public /* synthetic */ iv0(org.telegram.messenger.u10 u10Var, HashMap hashMap, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = u10Var;
        this.d = hashMap;
        this.c = arrayList;
    }
}

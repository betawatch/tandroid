package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ng(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        JSONObject optJSONObject;
        String optString;
        org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) this.b;
        String str = (String) this.c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) n1Var.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + cq0Var.x).put("platform", "DESKTOP"))).put("videoId", cq0Var.x).toString().getBytes("UTF-8"));
            outputStream.close();
            InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            byte[] bArr = new byte[10240];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            byteArrayOutputStream.close();
            inputStream.close();
            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (optString = optJSONObject.optString("spec")) == null) {
                return;
            }
            if (cq0Var.H == 0) {
                cq0Var.s = optString;
            } else {
                ae0.a(cq0Var, optString);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        long C1;
        ArrayList arrayList;
        boolean z9;
        char c10;
        Object obj;
        qr0 qr0Var = (qr0) this.b;
        String str = (String) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = qr0Var.s.x1;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new ng(qr0Var, new ArrayList(), new ArrayList(), 23));
            return;
        }
        boolean z10 = true;
        boolean z11 = 0;
        String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
        if (lowerCase.equals(S0) || S0.length() == 0) {
            S0 = null;
        }
        int i7 = (S0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i7];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i10);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                C1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    C1 = org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z9 = z10;
                i10++;
                z10 = z9;
                arrayList2 = arrayList;
                z11 = 0;
            }
            TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(C1));
            if (a22.id != f2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.t10.p(a22).toLowerCase();
                String S02 = org.telegram.messenger.id.E0().S0(lowerCase2, z10, z11);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                char c11 = z11;
                for (int i11 = z11; i11 < i7; i11++) {
                    String str2 = strArr[i11];
                    if (lowerCase2.startsWith(str2) || jg.g.A(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || jg.g.A(" ", str2, S02)))) {
                        c10 = 1;
                    } else {
                        String n10 = org.telegram.messenger.t10.n(a22);
                        if (n10 != null && n10.startsWith(str2)) {
                            c11 = 2;
                        }
                        c10 = c11;
                    }
                    if (c10 != 0) {
                        arrayList = arrayList2;
                        z9 = true;
                        if (c10 == 1) {
                            arrayList3.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str2));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.t10.n(a22), null, "@" + str2));
                        }
                        arrayList4.add(tLObject);
                        i10++;
                        z10 = z9;
                        arrayList2 = arrayList;
                        z11 = 0;
                    } else {
                        z10 = true;
                        arrayList2 = arrayList2;
                        c11 = c10;
                    }
                }
            }
            arrayList = arrayList2;
            z9 = z10;
            i10++;
            z10 = z9;
            arrayList2 = arrayList;
            z11 = 0;
        }
        org.telegram.messenger.g0.h3(new ng(qr0Var, arrayList3, arrayList4, 23));
    }

    private final void c() {
        boolean z9;
        String str;
        ur0 ur0Var = (ur0) this.b;
        String str2 = (String) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ur0Var.getClass();
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new v80(18, ur0Var, new ArrayList()));
            return;
        }
        String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
        if (lowerCase.equals(S0) || S0.length() == 0) {
            S0 = null;
        }
        int i7 = (S0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i7];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < i7) {
                    String str3 = strArr[i11];
                    String I0 = ijVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str3)) {
                            arrayList2.add(ijVar);
                            break;
                        }
                        if (ur0Var.r == 4) {
                            TLRPC.Document document = ijVar.D == 0 ? org.telegram.messenger.ij.o1(ijVar.k).webpage.document : org.telegram.messenger.ij.o1(ijVar.k).document;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= document.attributes.size()) {
                                    z9 = false;
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                    String str4 = documentAttribute.performer;
                                    z9 = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                    if (!z9 && (str = documentAttribute.title) != null) {
                                        z9 = str.toLowerCase().contains(str3);
                                    }
                                } else {
                                    i12++;
                                }
                            }
                            if (z9) {
                                arrayList2.add(ijVar);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i11++;
                }
            }
        }
        org.telegram.messenger.g0.h3(new v80(18, ur0Var, arrayList2));
    }

    private final void d() {
        yv0 yv0Var = (yv0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        Boolean bool = (Boolean) this.d;
        yv0Var.P1 = arrayList;
        if (arrayList.isEmpty()) {
            yv0Var.dismiss();
            return;
        }
        yv0Var.k1.f();
        if (bool.booleanValue()) {
            yv0Var.Q1 = new HashMap();
            int size = yv0Var.P1.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) yv0Var.P1.get(i7);
                yv0Var.Q1.put(zyVar.a, zyVar);
                org.telegram.messenger.w7.G(yv0Var.a).h0(false, 67108864, zyVar.a, true);
            }
        }
        yv0Var.Z0();
    }

    private final void f() {
        yv0 yv0Var = (yv0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = yv0Var.C1;
        TLRPC.StickerSet stickerSet = yv0Var.J1.set;
        int i7 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        try {
            if (tL_error == null) {
                if (yv0Var.a2) {
                    cc.g(f2Var, new cv0(yv0Var.s1.getContext(), yv0Var.J1, 1, 2, null, yv0Var.I0), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    org.telegram.messenger.ui.b0(yv0Var.a).A1(f2Var, true, i7, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(yv0Var.getContext(), org.telegram.messenger.id.M0(2131751106, null), 0).show();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.ui.b0(yv0Var.a).a1(i7, false, true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(6:152|153|154|155|156|(12:158|15|16|17|18|19|20|(4:22|23|(2:95|(2:107|(3:111|112|113))(3:101|102|103))(3:39|40|41)|(1:91)(4:43|(1:45)(2:88|(1:90))|46|(2:86|87)(4:48|(1:50)(1:85)|51|(4:(2:54|(1:59))(1:83)|(1:75)(1:65)|66|(4:68|69|70|71)(1:73))(1:84))))|139|140|133|(0)(0)))(1:13)|16|17|18|19|20|(0)|139|140|133|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:7|(3:8|9|10)|11|(6:152|153|154|155|156|(12:158|15|16|17|18|19|20|(4:22|23|(2:95|(2:107|(3:111|112|113))(3:101|102|103))(3:39|40|41)|(1:91)(4:43|(1:45)(2:88|(1:90))|46|(2:86|87)(4:48|(1:50)(1:85)|51|(4:(2:54|(1:59))(1:83)|(1:75)(1:65)|66|(4:68|69|70|71)(1:73))(1:84))))|139|140|133|(0)(0)))(1:13)|14|15|16|17|18|19|20|(0)|139|140|133|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x013d, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0141, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0128, code lost:
    
        org.telegram.messenger.a8.g(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0126, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0127, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0130, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0133, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0134, code lost:
    
        r25 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        ur urVar;
        String str;
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.User user;
        Bitmap bitmap;
        int i7;
        int i10;
        String str2;
        cq0 cq0Var;
        ArrayList arrayList3;
        Throwable th2;
        InputStream inputStream;
        InputStream inputStream2;
        boolean z10;
        InputStream inputStream3;
        File file;
        boolean z11;
        String str3;
        int i11;
        byte[] bArr;
        boolean z12;
        int i12 = 0;
        boolean z13 = true;
        switch (this.a) {
            case 0:
                final di diVar = (di) this.b;
                vh vhVar = (vh) this.c;
                final qg qgVar = (qg) this.d;
                final boolean z14 = diVar.t2.getCurrentItemTop() <= vhVar.getButtonsHideOffset();
                float alpha = diVar.R2.getAlpha();
                float f10 = z14 ? 1.0f : 0.0f;
                r1.g gVar = new r1.g(new r1.f(0.0f));
                gVar.b(new xg(diVar, alpha, f10, z14));
                gVar.a(new r1.c() { // from class: org.telegram.ui.Components.yg
                    @Override // r1.c
                    public final void a(r1.g gVar2, boolean z15, float f11, float f12) {
                        di diVar2 = di.this;
                        diVar2.s2.v(1.0f);
                        diVar2.t2.v(1.0f);
                        diVar2.s2.m(diVar2.f4);
                        diVar2.t2.m(diVar2.f4);
                        diVar2.X0.g();
                        diVar2.b.invalidate();
                        diVar2.R2.setTag(z14 ? 1 : null);
                        qgVar.run();
                    }
                });
                r1.h hVar = new r1.h(500.0f);
                gVar.m = hVar;
                hVar.a(1.0f);
                gVar.m.b(1000.0f);
                gVar.h();
                diVar.n3 = gVar;
                return;
            case 1:
                di diVar2 = (di) this.b;
                h2.f fVar = (h2.f) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                diVar2.z0 = null;
                diVar2.j4 = null;
                fVar.e();
                diVar2.A0 = 0;
                if (p2Var != null) {
                    p2Var.v();
                }
                if (diVar2.J) {
                    diVar2.c.setLayerType(0, null);
                }
                if (diVar2.V) {
                    WindowManager.LayoutParams attributes = diVar2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    diVar2.getWindow().setAttributes(attributes);
                }
                org.telegram.messenger.qs.e().k(99, 512);
                return;
            case 2:
                to toVar = (to) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.d;
                HashMap hashMap = toVar.s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    j6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, j6Var);
                org.telegram.messenger.w7.G(j6Var.E).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 3:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                z8Var.setText(charSequence);
                org.telegram.ui.ActionBar.r6.V(z8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, f6Var);
                return;
            case 4:
                ur urVar2 = (ur) this.b;
                org.telegram.messenger.yr yrVar = (org.telegram.messenger.yr) this.c;
                tr trVar = (tr) this.d;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                long j3 = 0;
                try {
                    int i13 = 0;
                    SQLiteCursor queryFinalized = yrVar.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                arrayList5.add(Long.valueOf(queryFinalized.longValue(i13)));
                                j3 = Math.max(j3, queryFinalized.longValue(1));
                                str = queryFinalized.stringValue(2);
                                i13 = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            urVar = urVar2;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList l02 = yrVar.l0(arrayList5);
                    int size = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList5.get(i14);
                        i14++;
                        long longValue = ((Long) obj).longValue();
                        int size2 = l02.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = l02.get(i15);
                                i15++;
                                arrayList = l02;
                                user = (TLRPC.User) obj2;
                                if (user != null) {
                                    arrayList2 = arrayList5;
                                    urVar = urVar2;
                                    try {
                                        if (user.id == longValue) {
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteCursor = queryFinalized;
                                        z9 = true;
                                        try {
                                            org.telegram.messenger.a8.g(e, z9);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            org.telegram.messenger.g0.h3(new bi.i0(urVar, arrayList4, j3, str, trVar, 12));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList5;
                                    urVar = urVar2;
                                }
                                urVar2 = urVar;
                                l02 = arrayList;
                                arrayList5 = arrayList2;
                            } else {
                                arrayList = l02;
                                arrayList2 = arrayList5;
                                urVar = urVar2;
                                user = null;
                            }
                        }
                        if (user != null) {
                            arrayList4.add(user);
                        }
                        urVar2 = urVar;
                        l02 = arrayList;
                        arrayList5 = arrayList2;
                    }
                    urVar = urVar2;
                    queryFinalized.dispose();
                } catch (Exception e12) {
                    e = e12;
                    urVar = urVar2;
                    str = null;
                    z9 = true;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                org.telegram.messenger.g0.h3(new bi.i0(urVar, arrayList4, j3, str, trVar, 12));
                return;
            case 5:
                sy syVar = (sy) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                wy wyVar = syVar.J;
                int[] iArr = wyVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!wyVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, wyVar.g(!syVar.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i16 = syVar.U;
                if (i16 == 0 || (i7 = syVar.V) == 0) {
                    bitmap = null;
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i16 * i7 * 4);
                    GLES20.glReadPixels(0, 0, syVar.U, syVar.V, 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(syVar.U, syVar.V, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    bitmap = createBitmap;
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 6:
                wz wzVar = (wz) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                wzVar.r2 = -1;
                cc I = hc.a0(f2Var).I(R.raw.ic_delete, org.telegram.messenger.id.a0(null, null, 2131750664, wzVar.U1), org.telegram.messenger.id.G(arrayList6.size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                wzVar.s2 = true;
                wzVar.dismiss();
                wzVar.o1.getMessagesController().l2(wzVar.Q1);
                return;
            case 7:
                wz wzVar2 = (wz) this.b;
                wzVar2.r2 = wzVar2.o1.getConnectionsManager().sendRequest((TLObject) this.c, new org.telegram.ui.ld(14, wzVar2, (Pair) this.d));
                return;
            case 8:
                m50 m50Var = (m50) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.d;
                m50Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                f2Var2.presentFragment(new ProfileActivity(bundle, null));
                m50Var.c2 = true;
                return;
            case 9:
                g50 g50Var = (g50) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                m50 m50Var2 = g50Var.a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = m50Var2.k1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (m50Var2.a2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = m50Var2.k1;
                    if (chatFull2 != null) {
                        int i17 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i17;
                        if (i17 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        org.telegram.messenger.yr.a0(m50Var2.a).w1(chatFull2.invitesCount, m50Var2.X1);
                    }
                    org.telegram.ui.bb bbVar = m50Var2.a2;
                    if (bbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = m50Var2.i1;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.mb mbVar = bbVar.a;
                        ArrayList arrayList7 = mbVar.o0;
                        int size3 = arrayList7.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = org.telegram.messenger.p10.i(mbVar.getAccountInstance().a).n;
                        i10 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
                        if (new org.telegram.messenger.ij(i10, tL_channelAdminLogEvent, mbVar.n0, mbVar.m0, mbVar.f, mbVar.T, true).U < 0) {
                            return;
                        }
                        mbVar.W0();
                        int size4 = arrayList7.size() - size3;
                        if (size4 > 0) {
                            mbVar.C0.N = true;
                            org.telegram.ui.jb jbVar = mbVar.E;
                            jbVar.o(jbVar.h, size4);
                            org.telegram.ui.mb.P0(mbVar);
                        }
                        mbVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                x50 x50Var = (x50) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 == null) {
                    x50Var.q2 = (TLRPC.TL_chatInviteExported) tLObject3;
                    TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(x50Var.a).N0(x50Var.m2);
                    if (N0 != null) {
                        N0.exported_invite = x50Var.q2;
                    }
                    if (x50Var.q2.link == null) {
                        return;
                    }
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", x50Var.q2.link));
                    hc.j(x50Var.h2).j();
                    x50Var.dismiss();
                }
                x50Var.p2 = false;
                return;
            case 11:
                s50 s50Var = (s50) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                s50Var.h = null;
                s50Var.c = arrayList8;
                s50Var.d = arrayList9;
                jg.z1 z1Var = s50Var.e;
                z1Var.f(arrayList8, null);
                x50 x50Var2 = s50Var.n;
                x50Var2.O0(s50Var.f - 1);
                s50Var.f();
                if (z1Var.e() || s50Var.b() > 2) {
                    return;
                }
                x50Var2.q1.e(false, true);
                return;
            case 12:
                w70 w70Var = (w70) this.b;
                x70 x70Var = (x70) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                v70 v70Var = w70Var.h;
                if (v70Var == null || w70Var.e != x70Var) {
                    return;
                }
                v70Var.a(clickableSpan);
                w70Var.e = null;
                w70Var.b.f(true);
                return;
            case 13:
                na0 na0Var = (na0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.f6 f6Var2 = na0Var.c;
                TextView textView = na0Var.f;
                TextView textView2 = na0Var.e;
                if (tL_error3 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        textView2.setText(org.telegram.messenger.id.M0(2131747194, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        na0Var.E = true;
                        textView2.setText(org.telegram.messenger.id.M0(2131747198, null));
                        textView.setText(org.telegram.messenger.id.M0(2131747196, null));
                    } else {
                        textView2.setText(org.telegram.messenger.id.N0("UnknownError"));
                        textView.setVisibility(8);
                        new hc(xa.a(na0Var.getContext()), f6Var2).f0(tL_error3, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    long j10 = ((TLRPC.TL_outboxReadDate) tLObject4).date * 1000;
                    try {
                        Calendar calendar = Calendar.getInstance();
                        int i18 = calendar.get(6);
                        int i19 = calendar.get(1);
                        calendar.setTimeInMillis(j10);
                        int i20 = calendar.get(6);
                        int i21 = calendar.get(1);
                        str2 = (i20 == i18 && i19 == i21) ? org.telegram.messenger.id.a0(null, null, 2131747195, org.telegram.messenger.id.E0().p0().format(new Date(j10))) : (i20 + 1 == i18 && i19 == i21) ? org.telegram.messenger.id.a0(null, null, 2131747193, org.telegram.messenger.id.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.id.a0(null, null, 2131747197, org.telegram.messenger.id.E0().q0().format(new Date(j10)), org.telegram.messenger.id.E0().p0().format(new Date(j10))) : org.telegram.messenger.id.a0(null, null, 2131747197, org.telegram.messenger.id.E0().C0().format(new Date(j10)), org.telegram.messenger.id.E0().p0().format(new Date(j10)));
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                        str2 = "LOC_ERR";
                    }
                    textView2.setText(str2);
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = na0Var.d.animate().alpha(1.0f);
                xq xqVar = xq.h;
                org.telegram.messenger.camera.q.l(alpha2, xqVar, 320L);
                na0Var.h.animate().alpha(0.0f).setInterpolator(xqVar).setDuration(320L).start();
                if (!na0Var.E) {
                    na0Var.setBackground(null);
                    na0Var.setOnClickListener(null);
                    return;
                }
                int i22 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i22, f6Var2), 6, 0);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i22);
                na0Var.setBackground(a02);
                org.telegram.ui.ActionBar.r6.k(na0Var, a02, null, N, f6Var2);
                na0Var.setOnClickListener(new la0(na0Var, 0));
                return;
            case 14:
                mc0 mc0Var = (mc0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error4 == null) {
                    mc0Var.getClass();
                    mc0Var.o1 = (TLRPC.TL_chatInviteExported) tLObject5;
                    TLRPC.ChatFull N02 = org.telegram.messenger.qp.s1(mc0Var.a).N0(mc0Var.m1);
                    if (N02 != null) {
                        N02.exported_invite = mc0Var.o1;
                    }
                    mc0Var.l1.setLink(mc0Var.o1.link);
                }
                mc0Var.n1 = false;
                return;
            case 15:
                a();
                return;
            case 16:
                qe0 qe0Var = (qe0) this.b;
                pe0 pe0Var = (pe0) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (qe0Var.isShowing()) {
                    qe0Var.r1.remove(pe0Var);
                    if (tLObject6 != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                        org.telegram.messenger.qp.s1(qe0Var.a).Y3(tL_messages_votesList.users, false);
                        pe0Var.b.addAll(tL_messages_votesList.votes);
                        pe0Var.c = tL_messages_votesList.next_offset;
                        qe0Var.J0(null);
                        qe0Var.j1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                dl0 dl0Var = (dl0) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                int i23 = dl0Var.d;
                for (int i24 = 0; i24 < arrayList10.size(); i24++) {
                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(i23);
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList10.get(i24);
                    if (ijVar != null && ijVar.F0() != null) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.u5(q10, ijVar.F0(), ijVar, 0));
                    }
                }
                if (!arrayList11.isEmpty()) {
                    org.telegram.messenger.z5.q(i23).j(arrayList11);
                }
                dl0Var.O = false;
                dl0Var.d(true);
                return;
            case 18:
                yl0 yl0Var = (yl0) this.b;
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.c;
                k60 k60Var = (k60) this.d;
                if (org.telegram.messenger.p10.i(yl0Var.K0.J0).q()) {
                    wwVar.getMessagesController().o0(true);
                    yl0Var.S();
                    hc.a0(wwVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                } else {
                    new ug.w0((org.telegram.ui.ActionBar.f2) wwVar, 3, true).show();
                }
                k60Var.u();
                return;
            case 19:
                xs0 xs0Var = (xs0) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                k60 k60Var2 = (k60) this.d;
                v4.P(xs0Var.getContext(), null, xs0Var.H1, new fp0(xs0Var, storyItem));
                k60Var2.u();
                return;
            case 20:
                xs0 xs0Var2 = (xs0) this.b;
                String str4 = (String) this.c;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) this.d;
                br0 br0Var = new br0(xs0Var2.getContext(), str4, str4, xs0Var2.H1, f2Var3);
                if (f2Var3 != null) {
                    f2Var3.showDialog(br0Var);
                    return;
                } else {
                    br0Var.show();
                    return;
                }
            case 21:
                int i25 = 6;
                lr0 lr0Var = (lr0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                xs0 xs0Var3 = lr0Var.n;
                int b10 = lr0Var.b();
                if (tL_error5 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                    xs0Var3.x1.getMessagesController().S3(messages_chats.chats, false);
                    lr0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    lr0Var.d.addAll(messages_chats.chats);
                } else {
                    lr0Var.h = true;
                }
                int i26 = 0;
                while (true) {
                    sr0[] sr0VarArr = xs0Var3.m0;
                    if (i26 >= sr0VarArr.length) {
                        lr0Var.e = false;
                        lr0Var.f = true;
                        lr0Var.f();
                        return;
                    }
                    sr0 sr0Var = sr0VarArr[i26];
                    if (sr0Var.E == i25 && (cq0Var = sr0Var.h) != null && (lr0Var.f || b10 == 0)) {
                        xs0Var3.D(cq0Var, 0, null);
                    }
                    i26++;
                    i25 = 6;
                }
                break;
            case 22:
                b();
                return;
            case 23:
                int i27 = 7;
                qr0 qr0Var = (qr0) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                xs0 xs0Var4 = qr0Var.s;
                if (xs0Var4.X0) {
                    qr0Var.d = arrayList12;
                    qr0Var.r--;
                    if (!org.telegram.messenger.t3.T(qr0Var.n)) {
                        ArrayList arrayList14 = qr0Var.e.g;
                        arrayList14.clear();
                        arrayList14.addAll(arrayList13);
                    }
                    if (qr0Var.r == 0) {
                        int i28 = 0;
                        while (true) {
                            sr0[] sr0VarArr2 = xs0Var4.m0;
                            if (i28 < sr0VarArr2.length) {
                                sr0 sr0Var2 = sr0VarArr2[i28];
                                int i29 = i27;
                                if (sr0Var2.E == i29) {
                                    if (qr0Var.h == 0) {
                                        sr0Var2.w.e(false, true);
                                    } else {
                                        xs0Var4.D(sr0Var2.h, 0, null);
                                    }
                                }
                                i28++;
                                i27 = i29;
                            }
                        }
                    }
                    qr0Var.f();
                    return;
                }
                return;
            case 24:
                c();
                return;
            case 25:
                yv0 yv0Var = (yv0) this.b;
                String str5 = (String) this.c;
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) this.d;
                if (yv0Var.I) {
                    return;
                }
                yv0Var.Q1.remove(str5);
                if ("application/x-tgsticker".equals(zyVar.d)) {
                    zyVar.c = true;
                    int indexOf = yv0Var.P1.indexOf(zyVar);
                    if (indexOf >= 0) {
                        v4.d1 K = yv0Var.j1.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.z7) K.a).setSticker(zyVar);
                        }
                    } else {
                        yv0Var.k1.f();
                    }
                } else {
                    yv0Var.S0(zyVar);
                }
                if (yv0Var.Q1.isEmpty()) {
                    yv0Var.Z0();
                    return;
                }
                return;
            case 26:
                d();
                return;
            case 27:
                f();
                return;
            case 28:
                yv0 yv0Var2 = (yv0) this.b;
                String str6 = (String) this.c;
                TextView textView3 = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str6;
                yv0Var2.g2 = ConnectionsManager.getInstance(yv0Var2.a).sendRequest(tL_stickers_checkShortName, new bi.f2(yv0Var2, str6, textView3, 17), 2);
                return;
            default:
                yv0 yv0Var3 = (yv0) this.b;
                ArrayList arrayList15 = (ArrayList) this.c;
                ArrayList arrayList16 = (ArrayList) this.d;
                ArrayList arrayList17 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size5 = arrayList15.size();
                int i30 = 0;
                Boolean bool = null;
                while (i30 < size5) {
                    Object obj3 = arrayList15.get(i30);
                    if (obj3 instanceof Uri) {
                        Uri uri = (Uri) obj3;
                        String[] strArr = MediaController.V1;
                        try {
                            inputStream2 = org.telegram.messenger.t0.b.getContentResolver().openInputStream(uri);
                        } catch (Exception unused) {
                            inputStream2 = null;
                        } catch (Throwable th6) {
                            th2 = th6;
                            inputStream = null;
                            if (inputStream == null) {
                            }
                        }
                        try {
                            if (inputStream2 == null) {
                                try {
                                    z10 = z13;
                                } catch (Exception e14) {
                                    e = e14;
                                    z10 = z13;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                                try {
                                    file = new File(uri.getPath());
                                    z12 = z10;
                                } catch (Exception e15) {
                                    e = e15;
                                    arrayList3 = arrayList15;
                                    inputStream3 = inputStream2;
                                    z11 = z10;
                                    org.telegram.messenger.a8.g(e, z11);
                                    if (inputStream3 != null) {
                                    }
                                    str3 = null;
                                    if (str3 != null) {
                                    }
                                    i30++;
                                    arrayList15 = arrayList3;
                                    i12 = 0;
                                    z13 = true;
                                } catch (Throwable th8) {
                                    th = th8;
                                    th2 = th;
                                    inputStream = inputStream2;
                                    if (inputStream == null) {
                                    }
                                }
                                if (file.exists()) {
                                    inputStream3 = new FileInputStream(file);
                                    z10 = z10;
                                    bArr = new byte[12];
                                    arrayList3 = arrayList15;
                                    if (inputStream3.read(bArr, i12, 12) == 12) {
                                        try {
                                            try {
                                                byte b11 = bArr[i12];
                                                if (b11 == -119 && bArr[z10] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                                                    str3 = "png";
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e16) {
                                                        org.telegram.messenger.a8.g(e16, z10);
                                                    }
                                                } else if (b11 == 31 && bArr[1] == -117) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e17) {
                                                        org.telegram.messenger.a8.g(e17, true);
                                                    }
                                                    str3 = "tgs";
                                                } else {
                                                    String lowerCase = new String(bArr).toLowerCase();
                                                    if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e18) {
                                                            org.telegram.messenger.a8.g(e18, true);
                                                        }
                                                        str3 = "webp";
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
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
                                        } catch (Exception e20) {
                                            e = e20;
                                            z11 = true;
                                            org.telegram.messenger.a8.g(e, z11);
                                            if (inputStream3 != null) {
                                            }
                                            str3 = null;
                                            if (str3 != null) {
                                            }
                                            i30++;
                                            arrayList15 = arrayList3;
                                            i12 = 0;
                                            z13 = true;
                                        }
                                        if (str3 != null) {
                                            continue;
                                        } else {
                                            boolean equals = "tgs".equals(str3);
                                            if (bool == null) {
                                                bool = Boolean.valueOf(equals);
                                            } else if (bool.booleanValue() != equals) {
                                                continue;
                                            }
                                            if (yv0Var3.I) {
                                                return;
                                            }
                                            org.telegram.messenger.zy zyVar2 = new org.telegram.messenger.zy();
                                            zyVar2.e = equals;
                                            String t6 = MediaController.t((equals ? 64 : 512) * 1024, uri, str3);
                                            zyVar2.a = t6;
                                            if (t6 != null) {
                                                if (equals) {
                                                    zyVar2.d = "application/x-tgsticker";
                                                } else {
                                                    BitmapFactory.decodeFile(t6, options);
                                                    int i31 = options.outWidth;
                                                    if ((i31 == 512 && (i11 = options.outHeight) > 0 && i11 <= 512) || (options.outHeight == 512 && i31 > 0 && i31 <= 512)) {
                                                        zyVar2.d = "image/".concat(str3);
                                                        zyVar2.c = true;
                                                    }
                                                }
                                                if (arrayList16 != null && arrayList16.size() == size5 && (arrayList16.get(i30) instanceof String)) {
                                                    zyVar2.b = (String) arrayList16.get(i30);
                                                } else {
                                                    zyVar2.b = "#️⃣";
                                                }
                                                arrayList17.add(zyVar2);
                                                if (arrayList17.size() >= 200) {
                                                    org.telegram.messenger.g0.h3(new ng(yv0Var3, arrayList17, bool, 26));
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
                                z12 = z13;
                            }
                            bArr = new byte[12];
                            arrayList3 = arrayList15;
                            if (inputStream3.read(bArr, i12, 12) == 12) {
                            }
                            inputStream3.close();
                            str3 = null;
                            if (str3 != null) {
                            }
                        } catch (Throwable th10) {
                            th = th10;
                        }
                        inputStream3 = inputStream2;
                        z10 = z12;
                    } else {
                        arrayList3 = arrayList15;
                    }
                    i30++;
                    arrayList15 = arrayList3;
                    i12 = 0;
                    z13 = true;
                }
                org.telegram.messenger.g0.h3(new ng(yv0Var3, arrayList17, bool, 26));
                return;
        }
    }

    public /* synthetic */ ng(mc0 mc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        this.a = 14;
        this.b = mc0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}

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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        org.telegram.ui.eq0 eq0Var = (org.telegram.ui.eq0) n1Var.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + eq0Var.x).put("platform", "DESKTOP"))).put("videoId", eq0Var.x).toString().getBytes("UTF-8"));
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
            if (eq0Var.H == 0) {
                eq0Var.s = optString;
            } else {
                be0.a(eq0Var, optString);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        long B1;
        ArrayList arrayList;
        boolean z9;
        char c10;
        Object obj;
        sr0 sr0Var = (sr0) this.b;
        String str = (String) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = sr0Var.s.x1;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new ng(sr0Var, new ArrayList(), new ArrayList(), 23));
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
                B1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    B1 = org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z9 = z10;
                i10++;
                z10 = z9;
                arrayList2 = arrayList;
                z11 = 0;
            }
            TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(B1));
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
        org.telegram.messenger.g0.h3(new ng(sr0Var, arrayList3, arrayList4, 23));
    }

    private final void c() {
        boolean z9;
        String str;
        wr0 wr0Var = (wr0) this.b;
        String str2 = (String) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        wr0Var.getClass();
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new w80(18, wr0Var, new ArrayList()));
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
                        if (wr0Var.r == 4) {
                            TLRPC.Document document = ijVar.D == 0 ? org.telegram.messenger.ij.n1(ijVar.k).webpage.document : org.telegram.messenger.ij.n1(ijVar.k).document;
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
        org.telegram.messenger.g0.h3(new w80(18, wr0Var, arrayList2));
    }

    private final void d() {
        zv0 zv0Var = (zv0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        Boolean bool = (Boolean) this.d;
        zv0Var.P1 = arrayList;
        if (arrayList.isEmpty()) {
            zv0Var.dismiss();
            return;
        }
        zv0Var.k1.f();
        if (bool.booleanValue()) {
            zv0Var.Q1 = new HashMap();
            int size = zv0Var.P1.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) zv0Var.P1.get(i7);
                zv0Var.Q1.put(zyVar.a, zyVar);
                org.telegram.messenger.w7.G(zv0Var.a).h0(false, 67108864, zyVar.a, true);
            }
        }
        zv0Var.Z0();
    }

    private final void f() {
        zv0 zv0Var = (zv0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = zv0Var.C1;
        TLRPC.StickerSet stickerSet = zv0Var.J1.set;
        int i7 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        try {
            if (tL_error == null) {
                if (zv0Var.a2) {
                    cc.g(f2Var, new ev0(zv0Var.s1.getContext(), zv0Var.J1, 1, 2, null, zv0Var.I0), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    org.telegram.messenger.ui.b0(zv0Var.a).A1(f2Var, true, i7, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(zv0Var.getContext(), org.telegram.messenger.id.M0(2131751105, null), 0).show();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.ui.b0(zv0Var.a).a1(i7, false, true);
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
    /* JADX WARN: Removed duplicated region for block: B:461:0x09a6  */
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
        dq0 dq0Var;
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
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.d;
                HashMap hashMap = toVar.s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    k6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, k6Var);
                org.telegram.messenger.w7.G(k6Var.E).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 3:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                z8Var.setText(charSequence);
                org.telegram.ui.ActionBar.s6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.l6.B6, g6Var);
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
                            } catch (Exception e10) {
                                e = e10;
                                urVar = urVar2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
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
                cc I = hc.a0(f2Var).I(R.raw.ic_delete, org.telegram.messenger.id.a0(null, null, 2131750663, wzVar.U1), org.telegram.messenger.id.G(arrayList6.size(), "FolderLinkDeletedSubtitle", new Object[0]));
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
                n50 n50Var = (n50) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.d;
                n50Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                f2Var2.presentFragment(new ProfileActivity(bundle, null));
                n50Var.c2 = true;
                return;
            case 9:
                h50 h50Var = (h50) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                n50 n50Var2 = h50Var.a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = n50Var2.k1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (n50Var2.a2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = n50Var2.k1;
                    if (chatFull2 != null) {
                        int i17 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i17;
                        if (i17 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        org.telegram.messenger.yr.a0(n50Var2.a).w1(chatFull2.invitesCount, n50Var2.X1);
                    }
                    org.telegram.ui.bb bbVar = n50Var2.a2;
                    if (bbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = n50Var2.i1;
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
                y50 y50Var = (y50) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 == null) {
                    y50Var.q2 = (TLRPC.TL_chatInviteExported) tLObject3;
                    TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(y50Var.a).N0(y50Var.m2);
                    if (N0 != null) {
                        N0.exported_invite = y50Var.q2;
                    }
                    if (y50Var.q2.link == null) {
                        return;
                    }
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", y50Var.q2.link));
                    hc.j(y50Var.h2).j();
                    y50Var.dismiss();
                }
                y50Var.p2 = false;
                return;
            case 11:
                t50 t50Var = (t50) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                t50Var.h = null;
                t50Var.c = arrayList8;
                t50Var.d = arrayList9;
                jg.z1 z1Var = t50Var.e;
                z1Var.f(arrayList8, null);
                y50 y50Var2 = t50Var.n;
                y50Var2.O0(t50Var.f - 1);
                t50Var.f();
                if (z1Var.e() || t50Var.b() > 2) {
                    return;
                }
                y50Var2.q1.e(false, true);
                return;
            case 12:
                x70 x70Var = (x70) this.b;
                y70 y70Var = (y70) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                w70 w70Var = x70Var.h;
                if (w70Var == null || x70Var.e != y70Var) {
                    return;
                }
                w70Var.a(clickableSpan);
                x70Var.e = null;
                x70Var.b.f(true);
                return;
            case 13:
                oa0 oa0Var = (oa0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.g6 g6Var2 = oa0Var.c;
                TextView textView = oa0Var.f;
                TextView textView2 = oa0Var.e;
                if (tL_error3 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        textView2.setText(org.telegram.messenger.id.M0(2131747193, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        oa0Var.E = true;
                        textView2.setText(org.telegram.messenger.id.M0(2131747197, null));
                        textView.setText(org.telegram.messenger.id.M0(2131747195, null));
                    } else {
                        textView2.setText(org.telegram.messenger.id.N0("UnknownError"));
                        textView.setVisibility(8);
                        new hc(xa.a(oa0Var.getContext()), g6Var2).f0(tL_error3, false);
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
                        str2 = (i20 == i18 && i19 == i21) ? org.telegram.messenger.id.a0(null, null, 2131747194, org.telegram.messenger.id.E0().p0().format(new Date(j10))) : (i20 + 1 == i18 && i19 == i21) ? org.telegram.messenger.id.a0(null, null, 2131747192, org.telegram.messenger.id.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.id.a0(null, null, 2131747196, org.telegram.messenger.id.E0().q0().format(new Date(j10)), org.telegram.messenger.id.E0().p0().format(new Date(j10))) : org.telegram.messenger.id.a0(null, null, 2131747196, org.telegram.messenger.id.E0().C0().format(new Date(j10)), org.telegram.messenger.id.E0().p0().format(new Date(j10)));
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                        str2 = "LOC_ERR";
                    }
                    textView2.setText(str2);
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = oa0Var.d.animate().alpha(1.0f);
                xq xqVar = xq.h;
                org.telegram.messenger.camera.q.l(alpha2, xqVar, 320L);
                oa0Var.h.animate().alpha(0.0f).setInterpolator(xqVar).setDuration(320L).start();
                if (!oa0Var.E) {
                    oa0Var.setBackground(null);
                    oa0Var.setOnClickListener(null);
                    return;
                }
                int i22 = org.telegram.ui.ActionBar.l6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i22, g6Var2), 6, 0);
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i22);
                oa0Var.setBackground(a02);
                org.telegram.ui.ActionBar.s6.j(oa0Var, a02, null, M, g6Var2);
                oa0Var.setOnClickListener(new ma0(oa0Var, 0));
                return;
            case 14:
                nc0 nc0Var = (nc0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error4 == null) {
                    nc0Var.getClass();
                    nc0Var.o1 = (TLRPC.TL_chatInviteExported) tLObject5;
                    TLRPC.ChatFull N02 = org.telegram.messenger.qp.s1(nc0Var.a).N0(nc0Var.m1);
                    if (N02 != null) {
                        N02.exported_invite = nc0Var.o1;
                    }
                    nc0Var.l1.setLink(nc0Var.o1.link);
                }
                nc0Var.n1 = false;
                return;
            case 15:
                a();
                return;
            case 16:
                re0 re0Var = (re0) this.b;
                qe0 qe0Var = (qe0) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (re0Var.isShowing()) {
                    re0Var.r1.remove(qe0Var);
                    if (tLObject6 != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                        org.telegram.messenger.qp.s1(re0Var.a).Y3(tL_messages_votesList.users, false);
                        qe0Var.b.addAll(tL_messages_votesList.votes);
                        qe0Var.c = tL_messages_votesList.next_offset;
                        re0Var.J0(null);
                        re0Var.j1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                el0 el0Var = (el0) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                int i23 = el0Var.d;
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
                el0Var.O = false;
                el0Var.d(true);
                return;
            case 18:
                zl0 zl0Var = (zl0) this.b;
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.c;
                l60 l60Var = (l60) this.d;
                if (org.telegram.messenger.p10.i(zl0Var.K0.J0).q()) {
                    ywVar.getMessagesController().o0(true);
                    zl0Var.S();
                    hc.a0(ywVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                } else {
                    new ug.w0((org.telegram.ui.ActionBar.f2) ywVar, 3, true).show();
                }
                l60Var.u();
                return;
            case 19:
                zs0 zs0Var = (zs0) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                l60 l60Var2 = (l60) this.d;
                v4.P(zs0Var.getContext(), null, zs0Var.H1, new gp0(zs0Var, storyItem));
                l60Var2.u();
                return;
            case 20:
                zs0 zs0Var2 = (zs0) this.b;
                String str4 = (String) this.c;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) this.d;
                er0 er0Var = new er0(zs0Var2.getContext(), str4, str4, zs0Var2.H1, f2Var3);
                if (f2Var3 != null) {
                    f2Var3.showDialog(er0Var);
                    return;
                } else {
                    er0Var.show();
                    return;
                }
            case 21:
                int i25 = 6;
                nr0 nr0Var = (nr0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                zs0 zs0Var3 = nr0Var.r;
                nr0Var.n = 0;
                int b10 = nr0Var.b();
                if (tL_error5 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                    zs0Var3.x1.getMessagesController().S3(messages_chats.chats, false);
                    nr0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    nr0Var.d.addAll(messages_chats.chats);
                } else {
                    nr0Var.h = true;
                }
                int i26 = 0;
                while (true) {
                    ur0[] ur0VarArr = zs0Var3.m0;
                    if (i26 >= ur0VarArr.length) {
                        nr0Var.e = false;
                        nr0Var.f = true;
                        nr0Var.f();
                        return;
                    }
                    ur0 ur0Var = ur0VarArr[i26];
                    if (ur0Var.E == i25 && (dq0Var = ur0Var.h) != null && (nr0Var.f || b10 == 0)) {
                        zs0Var3.D(dq0Var, 0, null);
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
                sr0 sr0Var = (sr0) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                zs0 zs0Var4 = sr0Var.s;
                if (zs0Var4.X0) {
                    sr0Var.d = arrayList12;
                    sr0Var.r--;
                    if (!org.telegram.messenger.t3.T(sr0Var.n)) {
                        ArrayList arrayList14 = sr0Var.e.g;
                        arrayList14.clear();
                        arrayList14.addAll(arrayList13);
                    }
                    if (sr0Var.r == 0) {
                        int i28 = 0;
                        while (true) {
                            ur0[] ur0VarArr2 = zs0Var4.m0;
                            if (i28 < ur0VarArr2.length) {
                                ur0 ur0Var2 = ur0VarArr2[i28];
                                int i29 = i27;
                                if (ur0Var2.E == i29) {
                                    if (sr0Var.h == 0) {
                                        ur0Var2.w.e(false, true);
                                    } else {
                                        zs0Var4.D(ur0Var2.h, 0, null);
                                    }
                                }
                                i28++;
                                i27 = i29;
                            }
                        }
                    }
                    sr0Var.f();
                    return;
                }
                return;
            case 24:
                c();
                return;
            case 25:
                zv0 zv0Var = (zv0) this.b;
                String str5 = (String) this.c;
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) this.d;
                if (zv0Var.I) {
                    return;
                }
                zv0Var.Q1.remove(str5);
                if ("application/x-tgsticker".equals(zyVar.d)) {
                    zyVar.c = true;
                    int indexOf = zv0Var.P1.indexOf(zyVar);
                    if (indexOf >= 0) {
                        v4.d1 K = zv0Var.j1.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.z7) K.a).setSticker(zyVar);
                        }
                    } else {
                        zv0Var.k1.f();
                    }
                } else {
                    zv0Var.S0(zyVar);
                }
                if (zv0Var.Q1.isEmpty()) {
                    zv0Var.Z0();
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
                zv0 zv0Var2 = (zv0) this.b;
                String str6 = (String) this.c;
                TextView textView3 = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str6;
                zv0Var2.g2 = ConnectionsManager.getInstance(zv0Var2.a).sendRequest(tL_stickers_checkShortName, new bi.f2(zv0Var2, str6, textView3, 17), 2);
                return;
            default:
                zv0 zv0Var3 = (zv0) this.b;
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
                                            if (zv0Var3.I) {
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
                                                    org.telegram.messenger.g0.h3(new ng(zv0Var3, arrayList17, bool, 26));
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
                org.telegram.messenger.g0.h3(new ng(zv0Var3, arrayList17, bool, 26));
                return;
        }
    }

    public /* synthetic */ ng(nc0 nc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        this.a = 14;
        this.b = nc0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}

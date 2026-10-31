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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jg(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        JSONObject optJSONObject;
        String optString;
        ji.i iVar = (ji.i) this.b;
        String str = (String) this.c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        org.telegram.ui.mr0 mr0Var = (org.telegram.ui.mr0) iVar.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + mr0Var.x).put("platform", "DESKTOP"))).put("videoId", mr0Var.x).toString().getBytes("UTF-8"));
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
            if (mr0Var.H == 0) {
                mr0Var.s = optString;
            } else {
                ve0.a(mr0Var, optString);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        long C1;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        qs0 qs0Var = (qs0) this.b;
        String str = (String) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.k2 k2Var = qs0Var.s.x1;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.i0.g3(new jg(qs0Var, new ArrayList(), new ArrayList(), 23));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
        if (lowerCase.equals(R0) || R0.length() == 0) {
            R0 = null;
        }
        int i10 = (R0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i10];
        strArr[0] = lowerCase;
        if (R0 != null) {
            strArr[1] = R0;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i11);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                C1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    C1 = org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i11++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User Z1 = k2Var.getMessagesController().Z1(Long.valueOf(C1));
            if (Z1.id != k2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.h20.p(Z1).toLowerCase();
                String R02 = org.telegram.messenger.cd.D0().R0(lowerCase2, z11, z12);
                if (lowerCase2.equals(R02)) {
                    R02 = null;
                }
                char c11 = z12;
                for (int i12 = z12; i12 < i10; i12++) {
                    String str2 = strArr[i12];
                    if (lowerCase2.startsWith(str2) || sc.e.y(" ", str2, lowerCase2) || (R02 != null && (R02.startsWith(str2) || sc.e.y(" ", str2, R02)))) {
                        c10 = 1;
                    } else {
                        String n10 = org.telegram.messenger.h20.n(Z1);
                        if (n10 != null && n10.startsWith(str2)) {
                            c11 = 2;
                        }
                        c10 = c11;
                    }
                    if (c10 != 0) {
                        arrayList = arrayList2;
                        z10 = true;
                        if (c10 == 1) {
                            arrayList3.add(org.telegram.messenger.i0.r0(Z1.first_name, Z1.last_name, str2));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.i0.r0("@" + org.telegram.messenger.h20.n(Z1), null, "@" + str2));
                        }
                        arrayList4.add(tLObject);
                        i11++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        z12 = 0;
                    } else {
                        z11 = true;
                        arrayList2 = arrayList2;
                        c11 = c10;
                    }
                }
            }
            arrayList = arrayList2;
            z10 = z11;
            i11++;
            z11 = z10;
            arrayList2 = arrayList;
            z12 = 0;
        }
        org.telegram.messenger.i0.g3(new jg(qs0Var, arrayList3, arrayList4, 23));
    }

    private final void c() {
        boolean z10;
        String str;
        us0 us0Var = (us0) this.b;
        String str2 = (String) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        us0Var.getClass();
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.i0.g3(new gi0(12, us0Var, new ArrayList()));
            return;
        }
        String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
        if (lowerCase.equals(R0) || R0.length() == 0) {
            R0 = null;
        }
        int i10 = (R0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i10];
        strArr[0] = lowerCase;
        if (R0 != null) {
            strArr[1] = R0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < i10) {
                    String str3 = strArr[i12];
                    String I0 = jjVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str3)) {
                            arrayList2.add(jjVar);
                            break;
                        }
                        if (us0Var.r == 4) {
                            TLRPC.Document document = jjVar.D == 0 ? org.telegram.messenger.jj.o1(jjVar.k).webpage.document : org.telegram.messenger.jj.o1(jjVar.k).document;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= document.attributes.size()) {
                                    z10 = false;
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                    String str4 = documentAttribute.performer;
                                    z10 = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                    if (!z10 && (str = documentAttribute.title) != null) {
                                        z10 = str.toLowerCase().contains(str3);
                                    }
                                } else {
                                    i13++;
                                }
                            }
                            if (z10) {
                                arrayList2.add(jjVar);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i12++;
                }
            }
        }
        org.telegram.messenger.i0.g3(new gi0(12, us0Var, arrayList2));
    }

    private final void d() {
        cx0 cx0Var = (cx0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        Boolean bool = (Boolean) this.d;
        cx0Var.P1 = arrayList;
        if (arrayList.isEmpty()) {
            cx0Var.dismiss();
            return;
        }
        cx0Var.k1.f();
        if (bool.booleanValue()) {
            cx0Var.Q1 = new HashMap();
            int size = cx0Var.P1.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.jz jzVar = (org.telegram.messenger.jz) cx0Var.P1.get(i10);
                cx0Var.Q1.put(jzVar.a, jzVar);
                org.telegram.messenger.b8.G(cx0Var.a).i0(false, 67108864, jzVar.a, true);
            }
        }
        cx0Var.Z0();
    }

    private final void f() {
        cx0 cx0Var = (cx0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.ActionBar.k2 k2Var = cx0Var.C1;
        TLRPC.StickerSet stickerSet = cx0Var.J1.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        try {
            if (tL_error == null) {
                if (cx0Var.a2) {
                    wb.g(k2Var, new fw0(cx0Var.s1.getContext(), cx0Var.J1, 1, 2, null, cx0Var.I0), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    org.telegram.messenger.ui.b0(cx0Var.a).A1(k2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(cx0Var.getContext(), org.telegram.messenger.cd.L0(2131751106, null), 0).show();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.messenger.ui.b0(cx0Var.a).a1(i10, false, true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:7|(3:8|9|10)|11|12|(3:152|153|(12:155|15|16|17|18|19|20|(4:22|23|(2:95|(2:107|(3:111|112|113))(3:101|102|103))(3:39|40|41)|(1:91)(4:43|(1:45)(2:88|(1:90))|46|(2:86|87)(4:48|(1:50)(1:85)|51|(4:(2:54|(1:59))(1:83)|(1:75)(1:65)|66|(4:68|69|70|71)(1:73))(1:84))))|139|140|122|(0)(0)))|14|15|16|17|18|19|20|(0)|139|140|122|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0132, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0136, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x011f, code lost:
    
        org.telegram.messenger.f8.g(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x011d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x011e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0127, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x012a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        fs fsVar;
        boolean z10;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.User user;
        Bitmap bitmap;
        int i10;
        int i11;
        String str2;
        dr0 dr0Var;
        ArrayList arrayList3;
        Throwable th2;
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        File file;
        boolean z11;
        String str3;
        int i12;
        byte[] bArr;
        int i13 = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                final bi biVar = (bi) this.b;
                uh uhVar = (uh) this.c;
                final mg mgVar = (mg) this.d;
                final boolean z13 = biVar.t2.getCurrentItemTop() <= uhVar.getButtonsHideOffset();
                float alpha = biVar.R2.getAlpha();
                float f7 = z13 ? 1.0f : 0.0f;
                o1.j jVar = new o1.j(new o1.i(0.0f));
                jVar.b(new tg(biVar, alpha, f7, z13));
                jVar.a(new o1.f() { // from class: org.telegram.ui.Components.ug
                    @Override // o1.f
                    public final void a(o1.j jVar2, boolean z14, float f10, float f11) {
                        bi biVar2 = bi.this;
                        biVar2.s2.u(1.0f);
                        biVar2.t2.u(1.0f);
                        biVar2.s2.l(biVar2.f4);
                        biVar2.t2.l(biVar2.f4);
                        biVar2.X0.g();
                        biVar2.b.invalidate();
                        biVar2.R2.setTag(z13 ? 1 : null);
                        mgVar.run();
                    }
                });
                o1.k kVar = new o1.k(500.0f);
                jVar.m = kVar;
                kVar.a(1.0f);
                jVar.m.b(1000.0f);
                jVar.h();
                biVar.n3 = jVar;
                return;
            case 1:
                bi biVar2 = (bi) this.b;
                e2.f fVar = (e2.f) this.c;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.d;
                biVar2.z0 = null;
                biVar2.j4 = null;
                fVar.e();
                biVar2.A0 = 0;
                if (t2Var != null) {
                    t2Var.w();
                }
                if (biVar2.J) {
                    biVar2.c.setLayerType(0, null);
                }
                if (biVar2.V) {
                    WindowManager.LayoutParams attributes = biVar2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    biVar2.getWindow().setAttributes(attributes);
                }
                org.telegram.messenger.zs.e().k(99, 512);
                return;
            case 2:
                bp bpVar = (bp) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.d;
                HashMap hashMap = bpVar.s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    s6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String r10 = org.telegram.messenger.b8.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, s6Var);
                org.telegram.messenger.b8.G(s6Var.E).X(wallPaper.document, wallPaper, 1, 1);
                return;
            case 3:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.d;
                b9Var.setText(charSequence);
                org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.B6, p6Var);
                return;
            case 4:
                fs fsVar2 = (fs) this.b;
                org.telegram.messenger.hs hsVar = (org.telegram.messenger.hs) this.c;
                es esVar = (es) this.d;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                long j10 = 0;
                try {
                    int i14 = 0;
                    SQLiteCursor queryFinalized = hsVar.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                arrayList5.add(Long.valueOf(queryFinalized.longValue(i14)));
                                j10 = Math.max(j10, queryFinalized.longValue(1));
                                str = queryFinalized.stringValue(2);
                                i14 = 0;
                            } catch (Exception e) {
                                e = e;
                                fsVar = fsVar2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList l02 = hsVar.l0(arrayList5);
                    int size = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList5.get(i15);
                        i15++;
                        long longValue = ((Long) obj).longValue();
                        int size2 = l02.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                Object obj2 = l02.get(i16);
                                i16++;
                                arrayList = l02;
                                user = (TLRPC.User) obj2;
                                if (user != null) {
                                    arrayList2 = arrayList5;
                                    fsVar = fsVar2;
                                    try {
                                        if (user.id == longValue) {
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        sQLiteCursor = queryFinalized;
                                        z10 = true;
                                        try {
                                            org.telegram.messenger.f8.g(e, z10);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g(fsVar, arrayList4, j10, str, esVar, 4));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (sQLiteCursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList5;
                                    fsVar = fsVar2;
                                }
                                fsVar2 = fsVar;
                                l02 = arrayList;
                                arrayList5 = arrayList2;
                            } else {
                                arrayList = l02;
                                arrayList2 = arrayList5;
                                fsVar = fsVar2;
                                user = null;
                            }
                        }
                        if (user != null) {
                            arrayList4.add(user);
                        }
                        fsVar2 = fsVar;
                        l02 = arrayList;
                        arrayList5 = arrayList2;
                    }
                    fsVar = fsVar2;
                    queryFinalized.dispose();
                } catch (Exception e10) {
                    e = e10;
                    fsVar = fsVar2;
                    z10 = true;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g(fsVar, arrayList4, j10, str, esVar, 4));
                return;
            case 5:
                gz gzVar = (gz) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                jz jzVar = gzVar.J;
                int[] iArr = jzVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!jzVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, jzVar.g(!gzVar.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i17 = gzVar.U;
                if (i17 == 0 || (i10 = gzVar.V) == 0) {
                    bitmap = null;
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i17 * i10 * 4);
                    GLES20.glReadPixels(0, 0, gzVar.U, gzVar.V, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(gzVar.U, gzVar.V, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 6:
                j00 j00Var = (j00) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                j00Var.r2 = -1;
                wb I = cc.a0(k2Var).I(R.raw.ic_delete, org.telegram.messenger.cd.a0(null, null, 2131750664, j00Var.U1), org.telegram.messenger.cd.G(arrayList6.size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                j00Var.s2 = true;
                j00Var.dismiss();
                j00Var.o1.getMessagesController().k2(j00Var.Q1);
                return;
            case 7:
                j00 j00Var2 = (j00) this.b;
                j00Var2.r2 = j00Var2.o1.getConnectionsManager().sendRequest((TLObject) this.c, new ag.k0(28, j00Var2, (Pair) this.d));
                return;
            case 8:
                c60 c60Var = (c60) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.d;
                c60Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                k2Var2.presentFragment(new ProfileActivity(bundle, null));
                c60Var.c2 = true;
                return;
            case 9:
                w50 w50Var = (w50) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                c60 c60Var2 = w50Var.a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = c60Var2.k1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (c60Var2.a2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = c60Var2.k1;
                    if (chatFull2 != null) {
                        int i18 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i18;
                        if (i18 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        org.telegram.messenger.hs.a0(c60Var2.a).w1(chatFull2.invitesCount, c60Var2.X1);
                    }
                    org.telegram.ui.gb gbVar = c60Var2.a2;
                    if (gbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = c60Var2.i1;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.sb sbVar = gbVar.a;
                        ArrayList arrayList7 = sbVar.o0;
                        int size3 = arrayList7.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = org.telegram.messenger.d20.i(sbVar.getAccountInstance().a).n;
                        i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                        if (new org.telegram.messenger.jj(i11, tL_channelAdminLogEvent, sbVar.n0, sbVar.m0, sbVar.f, sbVar.T, true).U < 0) {
                            return;
                        }
                        sbVar.V0();
                        int size4 = arrayList7.size() - size3;
                        if (size4 > 0) {
                            sbVar.C0.N = true;
                            org.telegram.ui.pb pbVar = sbVar.E;
                            pbVar.o(pbVar.h, size4);
                            org.telegram.ui.sb.O0(sbVar);
                        }
                        sbVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                m60 m60Var = (m60) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 == null) {
                    m60Var.q2 = (TLRPC.TL_chatInviteExported) tLObject3;
                    TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(m60Var.a).M0(m60Var.m2);
                    if (M0 != null) {
                        M0.exported_invite = m60Var.q2;
                    }
                    if (m60Var.q2.link == null) {
                        return;
                    }
                    ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m60Var.q2.link));
                    cc.j(m60Var.h2).j();
                    m60Var.dismiss();
                }
                m60Var.p2 = false;
                return;
            case 11:
                i60 i60Var = (i60) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                i60Var.h = null;
                i60Var.c = arrayList8;
                i60Var.d = arrayList9;
                zf.m1 m1Var = i60Var.e;
                m1Var.f(arrayList8, null);
                m60 m60Var2 = i60Var.n;
                m60Var2.O0(i60Var.f - 1);
                i60Var.f();
                if (m1Var.e() || i60Var.b() > 2) {
                    return;
                }
                m60Var2.q1.e(false, true);
                return;
            case 12:
                p80 p80Var = (p80) this.b;
                q80 q80Var = (q80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                o80 o80Var = p80Var.h;
                if (o80Var == null || p80Var.e != q80Var) {
                    return;
                }
                o80Var.a(clickableSpan);
                p80Var.e = null;
                p80Var.b.f(true);
                return;
            case 13:
                gb0 gb0Var = (gb0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.p6 p6Var2 = gb0Var.c;
                TextView textView = gb0Var.f;
                TextView textView2 = gb0Var.e;
                if (tL_error3 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        textView2.setText(org.telegram.messenger.cd.L0(2131747208, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        gb0Var.E = true;
                        textView2.setText(org.telegram.messenger.cd.L0(2131747212, null));
                        textView.setText(org.telegram.messenger.cd.L0(2131747210, null));
                    } else {
                        textView2.setText(org.telegram.messenger.cd.M0("UnknownError"));
                        textView.setVisibility(8);
                        new cc(ra.a(gb0Var.getContext()), p6Var2).f0(tL_error3, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    long j11 = ((TLRPC.TL_outboxReadDate) tLObject4).date * 1000;
                    try {
                        Calendar calendar = Calendar.getInstance();
                        int i19 = calendar.get(6);
                        int i20 = calendar.get(1);
                        calendar.setTimeInMillis(j11);
                        int i21 = calendar.get(6);
                        int i22 = calendar.get(1);
                        str2 = (i21 == i19 && i20 == i22) ? org.telegram.messenger.cd.a0(null, null, 2131747209, org.telegram.messenger.cd.D0().o0().format(new Date(j11))) : (i21 + 1 == i19 && i20 == i22) ? org.telegram.messenger.cd.a0(null, null, 2131747207, org.telegram.messenger.cd.D0().o0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? org.telegram.messenger.cd.a0(null, null, 2131747211, org.telegram.messenger.cd.D0().p0().format(new Date(j11)), org.telegram.messenger.cd.D0().o0().format(new Date(j11))) : org.telegram.messenger.cd.a0(null, null, 2131747211, org.telegram.messenger.cd.D0().B0().format(new Date(j11)), org.telegram.messenger.cd.D0().o0().format(new Date(j11)));
                    } catch (Exception e11) {
                        org.telegram.messenger.f8.g(e11, true);
                        str2 = "LOC_ERR";
                    }
                    textView2.setText(str2);
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = gb0Var.d.animate().alpha(1.0f);
                gr grVar = gr.h;
                org.telegram.messenger.z20.m(alpha2, grVar, 320L);
                gb0Var.h.animate().alpha(0.0f).setInterpolator(grVar).setDuration(320L).start();
                if (!gb0Var.E) {
                    gb0Var.setBackground(null);
                    gb0Var.setOnClickListener(null);
                    return;
                }
                int i23 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i23, p6Var2), 6, 0);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i23);
                gb0Var.setBackground(a02);
                org.telegram.ui.ActionBar.a7.k(gb0Var, a02, null, N, p6Var2);
                gb0Var.setOnClickListener(new db0(gb0Var, 0));
                return;
            case 14:
                hd0 hd0Var = (hd0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error4 == null) {
                    hd0Var.getClass();
                    hd0Var.o1 = (TLRPC.TL_chatInviteExported) tLObject5;
                    TLRPC.ChatFull M02 = org.telegram.messenger.vp.r1(hd0Var.a).M0(hd0Var.m1);
                    if (M02 != null) {
                        M02.exported_invite = hd0Var.o1;
                    }
                    hd0Var.l1.setLink(hd0Var.o1.link);
                }
                hd0Var.n1 = false;
                return;
            case 15:
                a();
                return;
            case 16:
                tf0 tf0Var = (tf0) this.b;
                sf0 sf0Var = (sf0) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tf0Var.isShowing()) {
                    tf0Var.r1.remove(sf0Var);
                    if (tLObject6 != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                        org.telegram.messenger.vp.r1(tf0Var.a).V3(tL_messages_votesList.users, false);
                        sf0Var.b.addAll(tL_messages_votesList.votes);
                        sf0Var.c = tL_messages_votesList.next_offset;
                        tf0Var.J0(null);
                        tf0Var.j1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                gm0 gm0Var = (gm0) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                int i24 = gm0Var.d;
                for (int i25 = 0; i25 < arrayList10.size(); i25++) {
                    org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(i24);
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList10.get(i25);
                    if (jjVar != null && jjVar.F0() != null) {
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.w5(q6, jjVar.F0(), jjVar, 0));
                    }
                }
                if (!arrayList11.isEmpty()) {
                    org.telegram.messenger.b6.q(i24).j(arrayList11);
                }
                gm0Var.O = false;
                gm0Var.d(true);
                return;
            case 18:
                zm0 zm0Var = (zm0) this.b;
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) this.c;
                z60 z60Var = (z60) this.d;
                if (org.telegram.messenger.d20.i(zm0Var.K0.J0).q()) {
                    ayVar.getMessagesController().o0(true);
                    zm0Var.S();
                    cc.a0(ayVar).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                } else {
                    new kg.i1((org.telegram.ui.ActionBar.k2) ayVar, 3, true).show();
                }
                z60Var.u();
                return;
            case 19:
                zt0 zt0Var = (zt0) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                z60 z60Var2 = (z60) this.d;
                s4.R(zt0Var.getContext(), null, zt0Var.H1, new jq0(zt0Var, storyItem));
                z60Var2.u();
                return;
            case 20:
                zt0 zt0Var2 = (zt0) this.b;
                String str4 = (String) this.c;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) this.d;
                cs0 cs0Var = new cs0(zt0Var2.getContext(), str4, str4, zt0Var2.H1, k2Var3);
                if (k2Var3 != null) {
                    k2Var3.showDialog(cs0Var);
                    return;
                } else {
                    cs0Var.show();
                    return;
                }
            case 21:
                int i26 = 6;
                ls0 ls0Var = (ls0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                zt0 zt0Var3 = ls0Var.n;
                int b10 = ls0Var.b();
                if (tL_error5 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                    zt0Var3.x1.getMessagesController().P3(messages_chats.chats, false);
                    ls0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    ls0Var.d.addAll(messages_chats.chats);
                } else {
                    ls0Var.h = true;
                }
                int i27 = 0;
                while (true) {
                    ss0[] ss0VarArr = zt0Var3.m0;
                    if (i27 >= ss0VarArr.length) {
                        ls0Var.e = false;
                        ls0Var.f = true;
                        ls0Var.f();
                        return;
                    }
                    ss0 ss0Var = ss0VarArr[i27];
                    if (ss0Var.E == i26 && (dr0Var = ss0Var.h) != null && (ls0Var.f || b10 == 0)) {
                        zt0Var3.C(dr0Var, 0, null);
                    }
                    i27++;
                    i26 = 6;
                }
                break;
            case 22:
                b();
                return;
            case 23:
                int i28 = 7;
                qs0 qs0Var = (qs0) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                zt0 zt0Var4 = qs0Var.s;
                if (zt0Var4.X0) {
                    qs0Var.d = arrayList12;
                    qs0Var.r--;
                    if (!org.telegram.messenger.w3.T(qs0Var.n)) {
                        ArrayList arrayList14 = qs0Var.e.g;
                        arrayList14.clear();
                        arrayList14.addAll(arrayList13);
                    }
                    if (qs0Var.r == 0) {
                        int i29 = 0;
                        while (true) {
                            ss0[] ss0VarArr2 = zt0Var4.m0;
                            if (i29 < ss0VarArr2.length) {
                                ss0 ss0Var2 = ss0VarArr2[i29];
                                int i30 = i28;
                                if (ss0Var2.E == i30) {
                                    if (qs0Var.h == 0) {
                                        ss0Var2.w.e(false, true);
                                    } else {
                                        zt0Var4.C(ss0Var2.h, 0, null);
                                    }
                                }
                                i29++;
                                i28 = i30;
                            }
                        }
                    }
                    qs0Var.f();
                    return;
                }
                return;
            case 24:
                c();
                return;
            case 25:
                cx0 cx0Var = (cx0) this.b;
                String str5 = (String) this.c;
                org.telegram.messenger.jz jzVar2 = (org.telegram.messenger.jz) this.d;
                if (cx0Var.I) {
                    return;
                }
                cx0Var.Q1.remove(str5);
                if ("application/x-tgsticker".equals(jzVar2.d)) {
                    jzVar2.c = true;
                    int indexOf = cx0Var.P1.indexOf(jzVar2);
                    if (indexOf >= 0) {
                        s4.c1 K = cx0Var.j1.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.d8) K.a).setSticker(jzVar2);
                        }
                    } else {
                        cx0Var.k1.f();
                    }
                } else {
                    cx0Var.S0(jzVar2);
                }
                if (cx0Var.Q1.isEmpty()) {
                    cx0Var.Z0();
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
                cx0 cx0Var2 = (cx0) this.b;
                String str6 = (String) this.c;
                TextView textView3 = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str6;
                cx0Var2.g2 = ConnectionsManager.getInstance(cx0Var2.a).sendRequest(tL_stickers_checkShortName, new ag.p0(cx0Var2, str6, textView3, 13), 2);
                return;
            default:
                cx0 cx0Var3 = (cx0) this.b;
                ArrayList arrayList15 = (ArrayList) this.c;
                ArrayList arrayList16 = (ArrayList) this.d;
                ArrayList arrayList17 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size5 = arrayList15.size();
                int i31 = 0;
                Boolean bool = null;
                while (i31 < size5) {
                    Object obj3 = arrayList15.get(i31);
                    if (obj3 instanceof Uri) {
                        Uri uri = (Uri) obj3;
                        String[] strArr = MediaController.U1;
                        try {
                            inputStream2 = org.telegram.messenger.w0.b.getContentResolver().openInputStream(uri);
                        } catch (Exception unused) {
                            inputStream2 = null;
                        } catch (Throwable th6) {
                            th2 = th6;
                            inputStream = null;
                            if (inputStream == null) {
                            }
                        }
                        boolean z14 = z12;
                        try {
                            if (inputStream2 == null) {
                                try {
                                    file = new File(uri.getPath());
                                } catch (Exception e12) {
                                    e = e12;
                                    inputStream3 = inputStream2;
                                    arrayList3 = arrayList15;
                                    z11 = z14 ? 1 : 0;
                                    org.telegram.messenger.f8.g(e, z11);
                                    if (inputStream3 != null) {
                                    }
                                    str3 = null;
                                    if (str3 == null) {
                                    }
                                    i31++;
                                    arrayList15 = arrayList3;
                                    z12 = true;
                                    i13 = 0;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    inputStream = inputStream2;
                                    if (inputStream == null) {
                                    }
                                }
                                if (file.exists()) {
                                    inputStream3 = new FileInputStream(file);
                                    bArr = new byte[12];
                                    arrayList3 = arrayList15;
                                    if (inputStream3.read(bArr, i13, 12) == 12) {
                                        try {
                                            try {
                                                byte b11 = bArr[i13];
                                                if (b11 == -119 && bArr[z14 ? 1 : 0] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                                                    str3 = "png";
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e13) {
                                                        org.telegram.messenger.f8.g(e13, z14);
                                                    }
                                                } else if (b11 == 31 && bArr[1] == -117) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e14) {
                                                        org.telegram.messenger.f8.g(e14, true);
                                                    }
                                                    str3 = "tgs";
                                                } else {
                                                    String lowerCase = new String(bArr).toLowerCase();
                                                    if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e15) {
                                                            org.telegram.messenger.f8.g(e15, true);
                                                        }
                                                        str3 = "webp";
                                                    }
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                                z11 = true;
                                                org.telegram.messenger.f8.g(e, z11);
                                                if (inputStream3 != null) {
                                                }
                                                str3 = null;
                                                if (str3 == null) {
                                                }
                                                i31++;
                                                arrayList15 = arrayList3;
                                                z12 = true;
                                                i13 = 0;
                                            }
                                            if (str3 == null) {
                                                continue;
                                            } else {
                                                boolean equals = "tgs".equals(str3);
                                                if (bool == null) {
                                                    bool = Boolean.valueOf(equals);
                                                } else if (bool.booleanValue() != equals) {
                                                    continue;
                                                }
                                                if (cx0Var3.I) {
                                                    return;
                                                }
                                                org.telegram.messenger.jz jzVar3 = new org.telegram.messenger.jz();
                                                jzVar3.e = equals;
                                                String t10 = MediaController.t((equals ? 64 : 512) * 1024, uri, str3);
                                                jzVar3.a = t10;
                                                if (t10 != null) {
                                                    if (equals) {
                                                        jzVar3.d = "application/x-tgsticker";
                                                    } else {
                                                        BitmapFactory.decodeFile(t10, options);
                                                        int i32 = options.outWidth;
                                                        if ((i32 == 512 && (i12 = options.outHeight) > 0 && i12 <= 512) || (options.outHeight == 512 && i32 > 0 && i32 <= 512)) {
                                                            jzVar3.d = "image/".concat(str3);
                                                            jzVar3.c = true;
                                                        }
                                                    }
                                                    if (arrayList16 != null && arrayList16.size() == size5 && (arrayList16.get(i31) instanceof String)) {
                                                        jzVar3.b = (String) arrayList16.get(i31);
                                                    } else {
                                                        jzVar3.b = "#️⃣";
                                                    }
                                                    arrayList17.add(jzVar3);
                                                    if (arrayList17.size() >= 200) {
                                                        org.telegram.messenger.i0.g3(new jg(cx0Var3, arrayList17, bool, 26));
                                                        return;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            th2 = th;
                                            inputStream = inputStream3;
                                            if (inputStream == null) {
                                                throw th2;
                                            }
                                            try {
                                                inputStream.close();
                                                throw th2;
                                            } catch (Exception e17) {
                                                org.telegram.messenger.f8.g(e17, true);
                                                throw th2;
                                            }
                                        }
                                    }
                                    inputStream3.close();
                                    str3 = null;
                                    if (str3 == null) {
                                    }
                                }
                            }
                            bArr = new byte[12];
                            arrayList3 = arrayList15;
                            if (inputStream3.read(bArr, i13, 12) == 12) {
                            }
                            inputStream3.close();
                            str3 = null;
                            if (str3 == null) {
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                        inputStream3 = inputStream2;
                    } else {
                        arrayList3 = arrayList15;
                    }
                    i31++;
                    arrayList15 = arrayList3;
                    z12 = true;
                    i13 = 0;
                }
                org.telegram.messenger.i0.g3(new jg(cx0Var3, arrayList17, bool, 26));
                return;
        }
    }

    public /* synthetic */ jg(hd0 hd0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 14;
        this.b = hd0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}

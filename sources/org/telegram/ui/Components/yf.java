package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
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
import java.io.FileOutputStream;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yf(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    private final void a() {
        dq0 dq0Var;
        mr0 mr0Var = (mr0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.c;
        ys0 ys0Var = mr0Var.r;
        mr0Var.n = 0;
        int b10 = mr0Var.b();
        if (tL_error == null) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            ys0Var.y1.getMessagesController().S3(messages_chats.chats, false);
            mr0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
            mr0Var.d.addAll(messages_chats.chats);
        } else {
            mr0Var.h = true;
        }
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = ys0Var.n0;
            if (i7 >= tr0VarArr.length) {
                mr0Var.e = false;
                mr0Var.f = true;
                mr0Var.f();
                return;
            } else {
                tr0 tr0Var = tr0VarArr[i7];
                if (tr0Var.F == 6 && (dq0Var = tr0Var.h) != null && (mr0Var.f || b10 == 0)) {
                    ys0Var.D(dq0Var, 0, null);
                }
                i7++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        long B1;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        rr0 rr0Var = (rr0) this.b;
        String str = (String) this.d;
        ArrayList arrayList2 = (ArrayList) this.c;
        org.telegram.ui.ActionBar.e2 e2Var = rr0Var.s.y1;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new yf(rr0Var, new ArrayList(), new ArrayList(), 25));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
                    B1 = org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i10++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User a22 = e2Var.getMessagesController().a2(Long.valueOf(B1));
            if (a22.id != e2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.q10.p(a22).toLowerCase();
                String S02 = org.telegram.messenger.hd.E0().S0(lowerCase2, z11, z12);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                char c11 = z12;
                for (int i11 = z12; i11 < i7; i11++) {
                    String str2 = strArr[i11];
                    if (lowerCase2.startsWith(str2) || i5.c.A(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || i5.c.A(" ", str2, S02)))) {
                        c10 = 1;
                    } else {
                        String n10 = org.telegram.messenger.q10.n(a22);
                        if (n10 != null && n10.startsWith(str2)) {
                            c11 = 2;
                        }
                        c10 = c11;
                    }
                    if (c10 != 0) {
                        arrayList = arrayList2;
                        z10 = true;
                        if (c10 == 1) {
                            arrayList3.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str2));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.q10.n(a22), null, "@" + str2));
                        }
                        arrayList4.add(tLObject);
                        i10++;
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
            i10++;
            z11 = z10;
            arrayList2 = arrayList;
            z12 = 0;
        }
        org.telegram.messenger.g0.h3(new yf(rr0Var, arrayList3, arrayList4, 25));
    }

    private final void c() {
        rr0 rr0Var = (rr0) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.c;
        ys0 ys0Var = rr0Var.s;
        if (ys0Var.Y0) {
            rr0Var.d = arrayList;
            rr0Var.r--;
            if (!org.telegram.messenger.t3.T(rr0Var.n)) {
                ArrayList arrayList3 = rr0Var.e.g;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
            }
            if (rr0Var.r == 0) {
                int i7 = 0;
                while (true) {
                    tr0[] tr0VarArr = ys0Var.n0;
                    if (i7 >= tr0VarArr.length) {
                        break;
                    }
                    tr0 tr0Var = tr0VarArr[i7];
                    if (tr0Var.F == 7) {
                        if (rr0Var.h == 0) {
                            tr0Var.w.e(false, true);
                        } else {
                            ys0Var.D(tr0Var.h, 0, null);
                        }
                    }
                    i7++;
                }
            }
            rr0Var.f();
        }
    }

    private final void d() {
        boolean z10;
        String str;
        vr0 vr0Var = (vr0) this.b;
        String str2 = (String) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        vr0Var.getClass();
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new hh0(12, vr0Var, new ArrayList()));
            return;
        }
        String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < i7) {
                    String str3 = strArr[i11];
                    String I0 = gjVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str3)) {
                            arrayList2.add(gjVar);
                            break;
                        }
                        if (vr0Var.r == 4) {
                            TLRPC.Document document = gjVar.D == 0 ? org.telegram.messenger.gj.n1(gjVar.k).webpage.document : org.telegram.messenger.gj.n1(gjVar.k).document;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= document.attributes.size()) {
                                    z10 = false;
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                    String str4 = documentAttribute.performer;
                                    z10 = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                    if (!z10 && (str = documentAttribute.title) != null) {
                                        z10 = str.toLowerCase().contains(str3);
                                    }
                                } else {
                                    i12++;
                                }
                            }
                            if (z10) {
                                arrayList2.add(gjVar);
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
        org.telegram.messenger.g0.h3(new hh0(12, vr0Var, arrayList2));
    }

    private final void f() {
        bw0 bw0Var = (bw0) this.b;
        String str = (String) this.d;
        org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) this.c;
        if (bw0Var.J) {
            return;
        }
        bw0Var.U1.remove(str);
        if ("application/x-tgsticker".equals(xyVar.d)) {
            xyVar.c = true;
            int indexOf = bw0Var.T1.indexOf(xyVar);
            if (indexOf >= 0) {
                v4.e1 K = bw0Var.n1.K(indexOf);
                if (K != null) {
                    ((org.telegram.ui.Cells.y7) K.a).setSticker(xyVar);
                }
            } else {
                bw0Var.o1.f();
            }
        } else {
            bw0Var.S0(xyVar);
        }
        if (bw0Var.U1.isEmpty()) {
            bw0Var.Z0();
        }
    }

    private final void g() {
        bw0 bw0Var = (bw0) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        Boolean bool = (Boolean) this.c;
        bw0Var.T1 = arrayList;
        if (arrayList.isEmpty()) {
            bw0Var.dismiss();
            return;
        }
        bw0Var.o1.f();
        if (bool.booleanValue()) {
            bw0Var.U1 = new HashMap();
            int size = bw0Var.T1.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) bw0Var.T1.get(i7);
                bw0Var.U1.put(xyVar.a, xyVar);
                org.telegram.messenger.w7.G(bw0Var.a).h0(false, 67108864, xyVar.a, true);
            }
        }
        bw0Var.Z0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:245|246|247)|242|243) */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x07b7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x07b8, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x07b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x07b4, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07f3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        boolean z10;
        String str;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList;
        TLRPC.User user;
        int i7;
        int i10;
        int i11;
        String str2;
        Calendar calendar;
        int i12;
        int i13;
        JSONObject optJSONObject;
        String optString;
        Bitmap bitmap = null;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                bg bgVar = (bg) this.b;
                Uri uri = (Uri) this.d;
                File file = (File) this.c;
                try {
                    InputStream openInputStream = bgVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(ffVar);
                            org.telegram.messenger.g0.h3(new yf(bgVar, arrayList2, file, 1));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 1:
                ((bg) this.b).K((File) this.c, (ArrayList) this.d);
                return;
            case 2:
                final ki kiVar = (ki) this.b;
                ci ciVar = (ci) this.d;
                final vg vgVar = (vg) this.c;
                final boolean z11 = kiVar.x2.getCurrentItemTop() <= ciVar.getButtonsHideOffset();
                float alpha = kiVar.V2.getAlpha();
                float f10 = z11 ? 1.0f : 0.0f;
                r1.g gVar = new r1.g(new r1.f(0.0f));
                gVar.b(new ch(kiVar, alpha, f10, z11));
                gVar.a(new r1.c() { // from class: org.telegram.ui.Components.dh
                    @Override // r1.c
                    public final void a(r1.g gVar2, boolean z12, float f11, float f12) {
                        ki kiVar2 = ki.this;
                        kiVar2.w2.v(1.0f);
                        kiVar2.x2.v(1.0f);
                        kiVar2.w2.m(kiVar2.j4);
                        kiVar2.x2.m(kiVar2.j4);
                        kiVar2.Y0.g();
                        kiVar2.b.invalidate();
                        kiVar2.V2.setTag(z11 ? 1 : null);
                        vgVar.run();
                    }
                });
                r1.h hVar = new r1.h(500.0f);
                gVar.m = hVar;
                hVar.a(1.0f);
                gVar.m.b(1000.0f);
                gVar.h();
                kiVar.r3 = gVar;
                return;
            case 3:
                ki kiVar2 = (ki) this.b;
                h2.f fVar = (h2.f) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                kiVar2.A0 = null;
                kiVar2.n4 = null;
                fVar.e();
                kiVar2.B0 = 0;
                if (o2Var != null) {
                    o2Var.v();
                }
                if (kiVar2.K) {
                    kiVar2.c.setLayerType(0, null);
                }
                if (kiVar2.W) {
                    WindowManager.LayoutParams attributes = kiVar2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    kiVar2.getWindow().setAttributes(attributes);
                }
                org.telegram.messenger.ns.e().k(99, 512);
                return;
            case 4:
                cp cpVar = (cp) this.b;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                HashMap hashMap = cpVar.s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    i6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, i6Var);
                org.telegram.messenger.w7.G(i6Var.F).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 5:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) this.b;
                CharSequence charSequence = (CharSequence) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                y8Var.setText(charSequence);
                org.telegram.ui.ActionBar.q6.U(y8Var.getTextView(), org.telegram.ui.ActionBar.j6.B6, e6Var);
                return;
            case 6:
                as asVar = (as) this.b;
                org.telegram.messenger.vr vrVar = (org.telegram.messenger.vr) this.d;
                zr zrVar = (zr) this.c;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long j3 = 0;
                try {
                    int i16 = 0;
                    SQLiteCursor queryFinalized = vrVar.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList4.add(Long.valueOf(queryFinalized.longValue(i16)));
                            j3 = Math.max(j3, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                            i16 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor = queryFinalized;
                            z10 = true;
                            try {
                                org.telegram.messenger.a8.g(e, z10);
                                if (sQLiteCursor != null) {
                                }
                                org.telegram.messenger.g0.h3(new bi.r1(asVar, arrayList3, j3, str, zrVar, 13));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList l02 = vrVar.l0(arrayList4);
                    int size = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList4.get(i17);
                        i17++;
                        long longValue = ((Long) obj).longValue();
                        int size2 = l02.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                Object obj2 = l02.get(i18);
                                i18++;
                                user = (TLRPC.User) obj2;
                                if (user != null) {
                                    arrayList = arrayList4;
                                    sQLiteCursor2 = queryFinalized;
                                    try {
                                        if (user.id == longValue) {
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteCursor = sQLiteCursor2;
                                        z10 = true;
                                        org.telegram.messenger.a8.g(e, z10);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        org.telegram.messenger.g0.h3(new bi.r1(asVar, arrayList3, j3, str, zrVar, 13));
                                        return;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        sQLiteCursor = sQLiteCursor2;
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    arrayList = arrayList4;
                                    sQLiteCursor2 = queryFinalized;
                                }
                                queryFinalized = sQLiteCursor2;
                                arrayList4 = arrayList;
                            } else {
                                arrayList = arrayList4;
                                sQLiteCursor2 = queryFinalized;
                                user = null;
                            }
                        }
                        if (user != null) {
                            arrayList3.add(user);
                        }
                        queryFinalized = sQLiteCursor2;
                        arrayList4 = arrayList;
                    }
                    queryFinalized.dispose();
                } catch (Exception e12) {
                    e = e12;
                    z10 = true;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                org.telegram.messenger.g0.h3(new bi.r1(asVar, arrayList3, j3, str, zrVar, 13));
                return;
            case 7:
                wy wyVar = (wy) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                zy zyVar = wyVar.K;
                int[] iArr = zyVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!zyVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, zyVar.g(!wyVar.U ? 1 : 0), 0);
                GLES20.glClear(0);
                int i19 = wyVar.V;
                if (i19 != 0 && (i7 = wyVar.W) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i19 * i7 * 4);
                    GLES20.glReadPixels(0, 0, wyVar.V, wyVar.W, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(wyVar.V, wyVar.W, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 8:
                zz zzVar = (zz) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                ArrayList arrayList5 = (ArrayList) this.c;
                zzVar.v2 = -1;
                xb I = cc.a0(e2Var).I(R.raw.ic_delete, org.telegram.messenger.hd.a0(null, null, 2131750663, zzVar.Y1), org.telegram.messenger.hd.G(arrayList5.size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                zzVar.w2 = true;
                zzVar.dismiss();
                zzVar.s1.getMessagesController().l2(zzVar.U1);
                return;
            case 9:
                zz zzVar2 = (zz) this.b;
                zzVar2.v2 = zzVar2.s1.getConnectionsManager().sendRequest((TLObject) this.d, new org.telegram.ui.v7(16, zzVar2, (Pair) this.c));
                return;
            case 10:
                p50 p50Var = (p50) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.c;
                p50Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                e2Var2.presentFragment(new ProfileActivity(bundle, null));
                p50Var.g2 = true;
                return;
            case 11:
                j50 j50Var = (j50) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                p50 p50Var2 = j50Var.a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = p50Var2.o1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (p50Var2.e2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = p50Var2.o1;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        org.telegram.messenger.vr.a0(p50Var2.a).w1(chatFull2.invitesCount, p50Var2.b2);
                    }
                    org.telegram.ui.ab abVar = p50Var2.e2;
                    if (abVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = p50Var2.m1;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.lb lbVar = abVar.a;
                        ArrayList arrayList6 = lbVar.p0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = org.telegram.messenger.m10.i(lbVar.getAccountInstance().a).n;
                        i10 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                        if (new org.telegram.messenger.gj(i10, tL_channelAdminLogEvent, lbVar.o0, lbVar.n0, lbVar.f, lbVar.U, true).U < 0) {
                            return;
                        }
                        lbVar.W0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            lbVar.D0.N = true;
                            org.telegram.ui.ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size4);
                            org.telegram.ui.lb.P0(lbVar);
                        }
                        lbVar.z0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                a60 a60Var = (a60) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    a60Var.u2 = (TLRPC.TL_chatInviteExported) tLObject3;
                    TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(a60Var.a).N0(a60Var.q2);
                    if (N0 != null) {
                        N0.exported_invite = a60Var.u2;
                    }
                    if (a60Var.u2.link == null) {
                        return;
                    }
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", a60Var.u2.link));
                    cc.j(a60Var.l2).j();
                    a60Var.dismiss();
                }
                a60Var.t2 = false;
                return;
            case 13:
                v50 v50Var = (v50) this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.c;
                v50Var.h = null;
                v50Var.c = arrayList7;
                v50Var.d = arrayList8;
                jg.z1 z1Var = v50Var.e;
                z1Var.f(arrayList7, null);
                a60 a60Var2 = v50Var.n;
                a60Var2.O0(v50Var.f - 1);
                v50Var.f();
                if (z1Var.e() || v50Var.b() > 2) {
                    return;
                }
                a60Var2.u1.e(false, true);
                return;
            case 14:
                z70 z70Var = (z70) this.b;
                a80 a80Var = (a80) this.d;
                ClickableSpan clickableSpan = (ClickableSpan) this.c;
                y70 y70Var = z70Var.h;
                if (y70Var == null || z70Var.e != a80Var) {
                    return;
                }
                y70Var.a(clickableSpan);
                z70Var.e = null;
                z70Var.b.f(true);
                return;
            case 15:
                oa0 oa0Var = (oa0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = oa0Var.c;
                TextView textView = oa0Var.f;
                TextView textView2 = oa0Var.e;
                if (tL_error3 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        textView2.setText(org.telegram.messenger.hd.M0(2131747193, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        oa0Var.F = true;
                        textView2.setText(org.telegram.messenger.hd.M0(2131747197, null));
                        textView.setText(org.telegram.messenger.hd.M0(2131747195, null));
                    } else {
                        textView2.setText(org.telegram.messenger.hd.N0("UnknownError"));
                        textView.setVisibility(8);
                        new cc(ta.a(oa0Var.getContext()), e6Var2).f0(tL_error3, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    long j10 = ((TLRPC.TL_outboxReadDate) tLObject4).date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        i12 = calendar.get(6);
                        i13 = calendar.get(1);
                        calendar.setTimeInMillis(j10);
                        i11 = 0;
                    } catch (Exception e13) {
                        e = e13;
                        i11 = 0;
                    }
                    try {
                        int i21 = calendar.get(6);
                        int i22 = calendar.get(1);
                        str2 = (i21 == i12 && i13 == i22) ? org.telegram.messenger.hd.a0(null, null, 2131747194, org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : (i21 + 1 == i12 && i13 == i22) ? org.telegram.messenger.hd.a0(null, null, 2131747192, org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.hd.a0(null, null, 2131747196, org.telegram.messenger.hd.E0().q0().format(new Date(j10)), org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : org.telegram.messenger.hd.a0(null, null, 2131747196, org.telegram.messenger.hd.E0().C0().format(new Date(j10)), org.telegram.messenger.hd.E0().p0().format(new Date(j10)));
                    } catch (Exception e14) {
                        e = e14;
                        org.telegram.messenger.a8.g(e, true);
                        str2 = "LOC_ERR";
                        textView2.setText(str2);
                        textView.setVisibility(8);
                        ViewPropertyAnimator alpha2 = oa0Var.d.animate().alpha(1.0f);
                        er erVar = er.h;
                        org.telegram.messenger.i20.n(alpha2, erVar, 320L);
                        oa0Var.h.animate().alpha(0.0f).setInterpolator(erVar).setDuration(320L).start();
                        if (!oa0Var.F) {
                        }
                    }
                    textView2.setText(str2);
                    textView.setVisibility(8);
                    ViewPropertyAnimator alpha22 = oa0Var.d.animate().alpha(1.0f);
                    er erVar2 = er.h;
                    org.telegram.messenger.i20.n(alpha22, erVar2, 320L);
                    oa0Var.h.animate().alpha(0.0f).setInterpolator(erVar2).setDuration(320L).start();
                    if (!oa0Var.F) {
                        oa0Var.setBackground(null);
                        oa0Var.setOnClickListener(null);
                        return;
                    }
                    int i23 = org.telegram.ui.ActionBar.j6.i6;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i23, e6Var2), 6, i11);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i23);
                    oa0Var.setBackground(a02);
                    org.telegram.ui.ActionBar.q6.j(oa0Var, a02, null, M, e6Var2);
                    oa0Var.setOnClickListener(new y60(oa0Var, i15));
                    return;
                }
                i11 = 0;
                ViewPropertyAnimator alpha222 = oa0Var.d.animate().alpha(1.0f);
                er erVar22 = er.h;
                org.telegram.messenger.i20.n(alpha222, erVar22, 320L);
                oa0Var.h.animate().alpha(0.0f).setInterpolator(erVar22).setDuration(320L).start();
                if (!oa0Var.F) {
                }
            case 16:
                nc0 nc0Var = (nc0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                if (tL_error4 == null) {
                    nc0Var.getClass();
                    nc0Var.s1 = (TLRPC.TL_chatInviteExported) tLObject5;
                    TLRPC.ChatFull N02 = org.telegram.messenger.np.s1(nc0Var.a).N0(nc0Var.q1);
                    if (N02 != null) {
                        N02.exported_invite = nc0Var.s1;
                    }
                    nc0Var.p1.setLink(nc0Var.s1.link);
                }
                nc0Var.r1 = false;
                return;
            case 17:
                org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) this.b;
                String str3 = (String) this.d;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.c;
                org.telegram.ui.bq0 bq0Var = (org.telegram.ui.bq0) n1Var.b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + bq0Var.x).put("platform", "DESKTOP"))).put("videoId", bq0Var.x).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr2 = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read2 = inputStream.read(bArr2);
                        if (read2 == -1) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (optString = optJSONObject.optString("spec")) == null) {
                                return;
                            }
                            if (bq0Var.I == 0) {
                                bq0Var.s = optString;
                                return;
                            } else {
                                ae0.a(bq0Var, optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, read2);
                    }
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                    return;
                }
                break;
            case 18:
                te0 te0Var = (te0) this.b;
                se0 se0Var = (se0) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (te0Var.isShowing()) {
                    te0Var.v1.remove(se0Var);
                    if (tLObject6 != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                        org.telegram.messenger.np.s1(te0Var.a).Y3(tL_messages_votesList.users, false);
                        se0Var.b.addAll(tL_messages_votesList.votes);
                        se0Var.c = tL_messages_votesList.next_offset;
                        te0Var.J0(null);
                        te0Var.n1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                il0 il0Var = (il0) this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.c;
                int i24 = il0Var.d;
                for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(i24);
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList9.get(i25);
                    if (gjVar != null && gjVar.F0() != null) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.u5(q10, gjVar.F0(), gjVar, i14));
                    }
                }
                if (!arrayList10.isEmpty()) {
                    org.telegram.messenger.z5.q(i24).j(arrayList10);
                }
                il0Var.P = false;
                il0Var.d(true);
                return;
            case 20:
                cm0 cm0Var = (cm0) this.b;
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.d;
                m60 m60Var = (m60) this.c;
                if (org.telegram.messenger.m10.i(cm0Var.L0.K0).q()) {
                    ywVar.getMessagesController().o0(true);
                    cm0Var.S();
                    cc.a0(ywVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                } else {
                    new ug.x0((org.telegram.ui.ActionBar.e2) ywVar, 3, true).show();
                }
                m60Var.u();
                return;
            case 21:
                ys0 ys0Var = (ys0) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                m60 m60Var2 = (m60) this.c;
                t4.P(ys0Var.getContext(), null, ys0Var.I1, new jp0(ys0Var, storyItem));
                m60Var2.u();
                return;
            case 22:
                ys0 ys0Var2 = (ys0) this.b;
                String str4 = (String) this.d;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) this.c;
                er0 er0Var = new er0(ys0Var2.getContext(), str4, str4, ys0Var2.I1, e2Var3);
                if (e2Var3 != null) {
                    e2Var3.showDialog(er0Var);
                    return;
                } else {
                    er0Var.show();
                    return;
                }
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
                bw0 bw0Var = (bw0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                org.telegram.ui.ActionBar.e2 e2Var4 = bw0Var.G1;
                TLRPC.StickerSet stickerSet = bw0Var.N1.set;
                int i26 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                try {
                    if (tL_error5 == null) {
                        if (bw0Var.e2) {
                            xb.g(e2Var4, new ev0(bw0Var.w1.getContext(), bw0Var.N1, 1, 2, null, bw0Var.J0), 1500).j();
                        }
                        if (tLObject7 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            org.telegram.messenger.si.b0(bw0Var.a).A1(e2Var4, true, i26, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject7);
                        }
                    } else {
                        Toast.makeText(bw0Var.getContext(), org.telegram.messenger.hd.M0(2131751105, null), 0).show();
                    }
                } catch (Exception e16) {
                    org.telegram.messenger.a8.g(e16, true);
                }
                org.telegram.messenger.si.b0(bw0Var.a).a1(i26, false, true);
                return;
        }
    }

    public /* synthetic */ yf(nc0 nc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 16;
        this.b = nc0Var;
        this.d = tL_error;
        this.c = tLObject;
    }
}

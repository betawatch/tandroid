package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k7(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ql0 ql0Var = (ql0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        int i7 = ql0Var.d;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(i7);
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
            if (fjVar != null && fjVar.F0() != null) {
                org.telegram.messenger.g0.g3(new org.telegram.messenger.v5(q10, fjVar.F0(), fjVar, 0));
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.a6.q(i7).j(arrayList2);
        }
        ql0Var.P = false;
        ql0Var.d(true);
    }

    private final void b() {
        km0 km0Var = (km0) this.b;
        org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.c;
        y60 y60Var = (y60) this.d;
        if (org.telegram.messenger.j10.i(km0Var.L0.K0).q()) {
            cxVar.getMessagesController().p0(true);
            km0Var.S();
            lc.b0(cxVar).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
        } else {
            new ug.z0((org.telegram.ui.ActionBar.h2) cxVar, 3, true).show();
        }
        y60Var.v();
    }

    private final void c() {
        gt0 gt0Var = (gt0) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        y60 y60Var = (y60) this.d;
        b5.P(gt0Var.getContext(), null, gt0Var.I1, new tp0(gt0Var, storyItem));
        y60Var.v();
    }

    private final void d() {
        gt0 gt0Var = (gt0) this.b;
        String str = (String) this.c;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
        mr0 mr0Var = new mr0(gt0Var.getContext(), str, str, gt0Var.I1, h2Var);
        if (h2Var != null) {
            h2Var.showDialog(mr0Var);
        } else {
            mr0Var.show();
        }
    }

    private final void f() {
        lq0 lq0Var;
        ur0 ur0Var = (ur0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        gt0 gt0Var = ur0Var.r;
        ur0Var.n = 0;
        int b10 = ur0Var.b();
        if (tL_error == null) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            gt0Var.y1.getMessagesController().Z3(messages_chats.chats, false);
            ur0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
            ur0Var.d.addAll(messages_chats.chats);
        } else {
            ur0Var.h = true;
        }
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = gt0Var.n0;
            if (i7 >= bs0VarArr.length) {
                ur0Var.e = false;
                ur0Var.f = true;
                ur0Var.f();
                return;
            } else {
                bs0 bs0Var = bs0VarArr[i7];
                if (bs0Var.F == 6 && (lq0Var = bs0Var.h) != null && (ur0Var.f || b10 == 0)) {
                    gt0Var.D(lq0Var, 0, null);
                }
                i7++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g() {
        long B1;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        zr0 zr0Var = (zr0) this.b;
        String str = (String) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.h2 h2Var = zr0Var.s.y1;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.g3(new k7(zr0Var, new ArrayList(), new ArrayList(), 28));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
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
                    B1 = org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i10++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User c22 = h2Var.getMessagesController().c2(Long.valueOf(B1));
            if (c22.id != h2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.o10.q(c22).toLowerCase();
                String S02 = org.telegram.messenger.gd.E0().S0(lowerCase2, z11, z12);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                char c11 = z12;
                for (int i11 = z12; i11 < i7; i11++) {
                    String str2 = strArr[i11];
                    if (lowerCase2.startsWith(str2) || i5.c.B(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || i5.c.B(" ", str2, S02)))) {
                        c10 = 1;
                    } else {
                        String o4 = org.telegram.messenger.o10.o(c22);
                        if (o4 != null && o4.startsWith(str2)) {
                            c11 = 2;
                        }
                        c10 = c11;
                    }
                    if (c10 != 0) {
                        arrayList = arrayList2;
                        z10 = true;
                        if (c10 == 1) {
                            arrayList3.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str2));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.o10.o(c22), null, "@" + str2));
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
        org.telegram.messenger.g0.g3(new k7(zr0Var, arrayList3, arrayList4, 28));
    }

    private final void h() {
        zr0 zr0Var = (zr0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        gt0 gt0Var = zr0Var.s;
        if (gt0Var.Y0) {
            zr0Var.d = arrayList;
            zr0Var.r--;
            if (!org.telegram.messenger.v3.T(zr0Var.n)) {
                ArrayList arrayList3 = zr0Var.e.g;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
            }
            if (zr0Var.r == 0) {
                int i7 = 0;
                while (true) {
                    bs0[] bs0VarArr = gt0Var.n0;
                    if (i7 >= bs0VarArr.length) {
                        break;
                    }
                    bs0 bs0Var = bs0VarArr[i7];
                    if (bs0Var.F == 7) {
                        if (zr0Var.h == 0) {
                            bs0Var.w.e(false, true);
                        } else {
                            gt0Var.D(bs0Var.h, 0, null);
                        }
                    }
                    i7++;
                }
            }
            zr0Var.f();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:260|261|262)|257|258) */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0766, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0767, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0762, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0763, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x079f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        gf gfVar;
        Editable text;
        SQLiteCursor sQLiteCursor;
        String str;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList;
        TLRPC.User user;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i11;
        String str2;
        Calendar calendar;
        JSONObject optJSONObject;
        String optString;
        int i12;
        boolean z10;
        String str3;
        int i13 = 4;
        int i14 = 8;
        int i15 = 2;
        Bitmap bitmap = null;
        switch (this.a) {
            case 0:
                g8 g8Var = (g8) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                TLObject tLObject = (TLObject) this.d;
                u1Var.dismiss();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    org.telegram.messenger.gp gpVar = g8Var.q2;
                    if (gpVar != null) {
                        gpVar.c.add(0, gpVar.d(document));
                        gpVar.e();
                    }
                    g8Var.r2.clear();
                    g8Var.r2.addAll(g8Var.q2.c);
                    g8Var.u1.f();
                    ConnectionsManager.getInstance(g8Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str4 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                if (chatActivityEnterView.M2 || (gfVar = chatActivityEnterView.F0) == null || (text = gfVar.getText()) == null) {
                    return;
                }
                int length = text.length();
                String concat = ((length <= 0 || Character.isWhitespace(text.charAt(length + (-1)))) ? "" : " ").concat(str4);
                chatActivityEnterView.q1 = true;
                text.insert(length, concat);
                chatActivityEnterView.F0.setSelection(text.length());
                if (runnable != null) {
                    runnable.run();
                    return;
                } else {
                    chatActivityEnterView.e1();
                    org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 0), 420L);
                    return;
                }
            case 2:
                ye yeVar = (ye) this.b;
                rt0 rt0Var = (rt0) this.c;
                nn0 nn0Var = (nn0) this.d;
                yeVar.getClass();
                rt0Var.getViewTreeObserver().removeOnDrawListener(yeVar);
                nn0Var.a.setHideAvatar(true);
                return;
            case 3:
                jg jgVar = (jg) this.b;
                Uri uri = (Uri) this.c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = jgVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(efVar);
                            org.telegram.messenger.g0.g3(new k7(jgVar, arrayList2, file, i13));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 4:
                ((jg) this.b).K((File) this.d, (ArrayList) this.c);
                return;
            case 5:
                final si siVar = (si) this.b;
                ki kiVar = (ki) this.c;
                final eh ehVar = (eh) this.d;
                final boolean z11 = siVar.x2.getCurrentItemTop() <= kiVar.getButtonsHideOffset();
                float alpha = siVar.V2.getAlpha();
                float f10 = z11 ? 1.0f : 0.0f;
                r1.g gVar = new r1.g(new r1.f(0.0f));
                gVar.b(new lh(siVar, alpha, f10, z11));
                gVar.a(new r1.c() { // from class: org.telegram.ui.Components.mh
                    @Override // r1.c
                    public final void a(r1.g gVar2, boolean z12, float f11, float f12) {
                        si siVar2 = si.this;
                        siVar2.w2.v(1.0f);
                        siVar2.x2.v(1.0f);
                        siVar2.w2.m(siVar2.j4);
                        siVar2.x2.m(siVar2.j4);
                        siVar2.Y0.g();
                        siVar2.b.invalidate();
                        siVar2.V2.setTag(z11 ? 1 : null);
                        ehVar.run();
                    }
                });
                r1.h hVar = new r1.h(500.0f);
                gVar.m = hVar;
                hVar.a(1.0f);
                gVar.m.b(1000.0f);
                gVar.h();
                siVar.r3 = gVar;
                return;
            case 6:
                si siVar2 = (si) this.b;
                h2.f fVar = (h2.f) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                siVar2.A0 = null;
                siVar2.n4 = null;
                fVar.e();
                siVar2.B0 = 0;
                if (r2Var != null) {
                    r2Var.v();
                }
                if (siVar2.K) {
                    siVar2.c.setLayerType(0, null);
                }
                if (siVar2.W) {
                    WindowManager.LayoutParams attributes = siVar2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    siVar2.getWindow().setAttributes(attributes);
                }
                org.telegram.messenger.ks.e().k(99, 512);
                return;
            case 7:
                jp jpVar = (jp) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.c;
                HashMap hashMap = jpVar.s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    m6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, m6Var);
                org.telegram.messenger.w7.G(m6Var.F).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 8:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.d;
                a9Var.setText(charSequence);
                org.telegram.ui.ActionBar.u6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.n6.B6, i6Var2);
                return;
            case 9:
                hs hsVar = (hs) this.b;
                org.telegram.messenger.tr trVar = (org.telegram.messenger.tr) this.c;
                gs gsVar = (gs) this.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long j3 = 0;
                try {
                    int i16 = 0;
                    SQLiteCursor queryFinalized = trVar.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
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
                            try {
                                org.telegram.messenger.a8.g(e, true);
                                if (sQLiteCursor != null) {
                                }
                                org.telegram.messenger.g0.g3(new bi.k2(hsVar, arrayList3, j3, str, gsVar, 12));
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
                    ArrayList l02 = trVar.l0(arrayList4);
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
                                        org.telegram.messenger.a8.g(e, true);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        org.telegram.messenger.g0.g3(new bi.k2(hsVar, arrayList3, j3, str, gsVar, 12));
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
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                org.telegram.messenger.g0.g3(new bi.k2(hsVar, arrayList3, j3, str, gsVar, 12));
                return;
            case 10:
                cz czVar = (cz) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                fz fzVar = czVar.K;
                int[] iArr = fzVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!fzVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, fzVar.g(!czVar.U ? 1 : 0), 0);
                GLES20.glClear(0);
                int i19 = czVar.V;
                if (i19 != 0 && (i7 = czVar.W) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i19 * i7 * 4);
                    GLES20.glReadPixels(0, 0, czVar.V, czVar.W, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(czVar.V, czVar.W, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 11:
                g00 g00Var = (g00) this.b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                g00Var.v2 = -1;
                gc I = lc.b0(h2Var).I(R.raw.ic_delete, org.telegram.messenger.gd.a0(null, null, 2131750647, g00Var.Y1), org.telegram.messenger.gd.G(arrayList5.size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                g00Var.w2 = true;
                g00Var.dismiss();
                g00Var.s1.getMessagesController().n2(g00Var.U1);
                return;
            case 12:
                g00 g00Var2 = (g00) this.b;
                g00Var2.v2 = g00Var2.s1.getConnectionsManager().sendRequest((TLObject) this.d, new org.telegram.ui.u7(16, g00Var2, (Pair) this.c));
                return;
            case 13:
                x50 x50Var = (x50) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.d;
                x50Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                h2Var2.presentFragment(new ProfileActivity(bundle, null));
                x50Var.g2 = true;
                return;
            case 14:
                r50 r50Var = (r50) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                x50 x50Var2 = r50Var.a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = x50Var2.o1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (x50Var2.e2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = x50Var2.o1;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        org.telegram.messenger.tr.a0(x50Var2.a).w1(chatFull2.invitesCount, x50Var2.b2);
                    }
                    org.telegram.ui.ab abVar = x50Var2.e2;
                    if (abVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = x50Var2.m1;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.lb lbVar = abVar.a;
                        ArrayList arrayList6 = lbVar.p0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = org.telegram.messenger.j10.i(lbVar.getAccountInstance().a).n;
                        i10 = ((org.telegram.ui.ActionBar.h2) lbVar).currentAccount;
                        if (new org.telegram.messenger.fj(i10, tL_channelAdminLogEvent, lbVar.o0, lbVar.n0, lbVar.f, lbVar.U, true).U < 0) {
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
            case 15:
                j60 j60Var = (j60) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error2 == null) {
                    j60Var.u2 = (TLRPC.TL_chatInviteExported) tLObject4;
                    TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(j60Var.a).P0(j60Var.q2);
                    if (P0 != null) {
                        P0.exported_invite = j60Var.u2;
                    }
                    if (j60Var.u2.link == null) {
                        return;
                    }
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", j60Var.u2.link));
                    lc.j(j60Var.l2).j();
                    j60Var.dismiss();
                }
                j60Var.t2 = false;
                return;
            case 16:
                d60 d60Var = (d60) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                d60Var.h = null;
                d60Var.c = arrayList7;
                d60Var.d = arrayList8;
                jg.z1 z1Var = d60Var.e;
                z1Var.f(arrayList7, null);
                j60 j60Var2 = d60Var.n;
                j60Var2.P0(d60Var.f - 1);
                d60Var.f();
                if (z1Var.e() || d60Var.b() > 2) {
                    return;
                }
                j60Var2.u1.e(false, true);
                return;
            case 17:
                k80 k80Var = (k80) this.b;
                l80 l80Var = (l80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                j80 j80Var = k80Var.h;
                if (j80Var == null || k80Var.e != l80Var) {
                    return;
                }
                j80Var.a(clickableSpan);
                k80Var.e = null;
                k80Var.b.f(true);
                return;
            case 18:
                ya0 ya0Var = (ya0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                org.telegram.ui.ActionBar.i6 i6Var3 = ya0Var.c;
                TextView textView = ya0Var.f;
                TextView textView2 = ya0Var.e;
                if (tL_error3 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        textView2.setText(org.telegram.messenger.gd.M0(2131747000, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        ya0Var.F = true;
                        textView2.setText(org.telegram.messenger.gd.M0(2131747004, null));
                        textView.setText(org.telegram.messenger.gd.M0(2131747002, null));
                    } else {
                        textView2.setText(org.telegram.messenger.gd.N0("UnknownError"));
                        textView.setVisibility(8);
                        new lc(cb.a(ya0Var.getContext()), i6Var3).g0(tL_error3, false);
                    }
                } else if (tLObject5 instanceof TLRPC.TL_outboxReadDate) {
                    int i21 = ((TLRPC.TL_outboxReadDate) tLObject5).date;
                    i6Var = i6Var3;
                    long j10 = i21 * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        i11 = 0;
                    } catch (Exception e13) {
                        e = e13;
                        i11 = 0;
                    }
                    try {
                        int i22 = calendar.get(6);
                        int i23 = calendar.get(1);
                        calendar.setTimeInMillis(j10);
                        int i24 = calendar.get(6);
                        int i25 = calendar.get(1);
                        str2 = (i24 == i22 && i23 == i25) ? org.telegram.messenger.gd.a0(null, null, 2131747001, org.telegram.messenger.gd.E0().p0().format(new Date(j10))) : (i24 + 1 == i22 && i23 == i25) ? org.telegram.messenger.gd.a0(null, null, 2131746999, org.telegram.messenger.gd.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.gd.a0(null, null, 2131747003, org.telegram.messenger.gd.E0().q0().format(new Date(j10)), org.telegram.messenger.gd.E0().p0().format(new Date(j10))) : org.telegram.messenger.gd.a0(null, null, 2131747003, org.telegram.messenger.gd.E0().C0().format(new Date(j10)), org.telegram.messenger.gd.E0().p0().format(new Date(j10)));
                    } catch (Exception e14) {
                        e = e14;
                        org.telegram.messenger.a8.g(e, true);
                        str2 = "LOC_ERR";
                        textView2.setText(str2);
                        textView.setVisibility(8);
                        ViewPropertyAnimator alpha2 = ya0Var.d.animate().alpha(1.0f);
                        lr lrVar = lr.h;
                        org.telegram.messenger.n10.o(alpha2, lrVar, 320L);
                        ya0Var.h.animate().alpha(0.0f).setInterpolator(lrVar).setDuration(320L).start();
                        if (!ya0Var.F) {
                        }
                    }
                    textView2.setText(str2);
                    textView.setVisibility(8);
                    ViewPropertyAnimator alpha22 = ya0Var.d.animate().alpha(1.0f);
                    lr lrVar2 = lr.h;
                    org.telegram.messenger.n10.o(alpha22, lrVar2, 320L);
                    ya0Var.h.animate().alpha(0.0f).setInterpolator(lrVar2).setDuration(320L).start();
                    if (!ya0Var.F) {
                        ya0Var.setBackground(null);
                        ya0Var.setOnClickListener(null);
                        return;
                    }
                    int i26 = org.telegram.ui.ActionBar.n6.i6;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i26, i6Var), 6, i11);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i26);
                    ya0Var.setBackground(a02);
                    org.telegram.ui.ActionBar.u6.j(ya0Var, a02, null, M, i6Var);
                    ya0Var.setOnClickListener(new h70(ya0Var, i15));
                    return;
                }
                i11 = 0;
                i6Var = i6Var3;
                ViewPropertyAnimator alpha222 = ya0Var.d.animate().alpha(1.0f);
                lr lrVar22 = lr.h;
                org.telegram.messenger.n10.o(alpha222, lrVar22, 320L);
                ya0Var.h.animate().alpha(0.0f).setInterpolator(lrVar22).setDuration(320L).start();
                if (!ya0Var.F) {
                }
            case 19:
                xc0 xc0Var = (xc0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error4 == null) {
                    xc0Var.getClass();
                    xc0Var.s1 = (TLRPC.TL_chatInviteExported) tLObject6;
                    TLRPC.ChatFull P02 = org.telegram.messenger.mp.u1(xc0Var.a).P0(xc0Var.q1);
                    if (P02 != null) {
                        P02.exported_invite = xc0Var.s1;
                    }
                    xc0Var.p1.setLink(xc0Var.s1.link);
                }
                xc0Var.r1 = false;
                return;
            case 20:
                org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) this.b;
                String str5 = (String) this.c;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
                org.telegram.ui.dq0 dq0Var = (org.telegram.ui.dq0) n1Var.b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str5).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + dq0Var.x).put("platform", "DESKTOP"))).put("videoId", dq0Var.x).toString().getBytes("UTF-8"));
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
                            if (dq0Var.I == 0) {
                                dq0Var.s = optString;
                                return;
                            } else {
                                ke0.a(dq0Var, optString);
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
            case 21:
                df0 df0Var = (df0) this.b;
                cf0 cf0Var = (cf0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (df0Var.isShowing()) {
                    df0Var.v1.remove(cf0Var);
                    if (tLObject7 != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject7;
                        org.telegram.messenger.mp.u1(df0Var.a).f4(tL_messages_votesList.users, false);
                        cf0Var.b.addAll(tL_messages_votesList.votes);
                        cf0Var.c = tL_messages_votesList.next_offset;
                        df0Var.K0(null);
                        df0Var.n1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                a();
                return;
            case 23:
                b();
                return;
            case 24:
                c();
                return;
            case 25:
                d();
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
                ds0 ds0Var = (ds0) this.b;
                String str6 = (String) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ds0Var.getClass();
                String lowerCase = str6.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new hn0(i14, ds0Var, new ArrayList()));
                    return;
                }
                String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    bitmap = S0;
                }
                int i27 = (bitmap != null ? 1 : 0) + 1;
                String[] strArr = new String[i27];
                strArr[0] = lowerCase;
                if (bitmap != null) {
                    strArr[1] = bitmap;
                }
                ArrayList arrayList10 = new ArrayList();
                int i28 = 0;
                while (i28 < arrayList9.size()) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList9.get(i28);
                    int i29 = 0;
                    while (true) {
                        if (i29 < i27) {
                            PrecomputedText precomputedText = strArr[i29];
                            String I0 = fjVar.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(precomputedText)) {
                                    arrayList10.add(fjVar);
                                } else if (ds0Var.r == i13) {
                                    TLRPC.Document document2 = fjVar.D == 0 ? org.telegram.messenger.fj.n1(fjVar.k).webpage.document : org.telegram.messenger.fj.n1(fjVar.k).document;
                                    int i30 = 0;
                                    while (true) {
                                        if (i30 < document2.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i30);
                                            i12 = i13;
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str7 = documentAttribute.performer;
                                                z10 = str7 != null ? str7.toLowerCase().contains(precomputedText) : false;
                                                if (!z10 && (str3 = documentAttribute.title) != null) {
                                                    z10 = str3.toLowerCase().contains(precomputedText);
                                                }
                                            } else {
                                                i30++;
                                                i13 = i12;
                                            }
                                        } else {
                                            i12 = i13;
                                            z10 = false;
                                        }
                                    }
                                    if (z10) {
                                        arrayList10.add(fjVar);
                                    } else {
                                        i29++;
                                        i13 = i12;
                                    }
                                }
                            }
                            i12 = i13;
                            i29++;
                            i13 = i12;
                        }
                    }
                    i12 = i13;
                    i28++;
                    i13 = i12;
                }
                org.telegram.messenger.g0.g3(new hn0(i14, ds0Var, arrayList10));
                return;
        }
    }

    public /* synthetic */ k7(Object obj, TLObject tLObject, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
    }

    public /* synthetic */ k7(xc0 xc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 19;
        this.b = xc0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e7(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        cq0 cq0Var;
        kr0 kr0Var = (kr0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        ws0 ws0Var = kr0Var.n;
        int b10 = kr0Var.b();
        if (tL_error == null) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            ws0Var.y1.getMessagesController().S3(messages_chats.chats, false);
            kr0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
            kr0Var.d.addAll(messages_chats.chats);
        } else {
            kr0Var.h = true;
        }
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = ws0Var.n0;
            if (i3 >= rr0VarArr.length) {
                kr0Var.e = false;
                kr0Var.f = true;
                kr0Var.f();
                return;
            } else {
                rr0 rr0Var = rr0VarArr[i3];
                if (rr0Var.F == 6 && (cq0Var = rr0Var.h) != null && (kr0Var.f || b10 == 0)) {
                    ws0Var.D(cq0Var, 0, null);
                }
                i3++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        long C1;
        ArrayList arrayList;
        boolean z10;
        char c2;
        Object obj;
        pr0 pr0Var = (pr0) this.b;
        String str = (String) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.d2 d2Var = pr0Var.s.y1;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new e7(pr0Var, new ArrayList(), new ArrayList(), 27));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
        if (lowerCase.equals(S0) || S0.length() == 0) {
            S0 = null;
        }
        int i3 = (S0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i3];
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
                    C1 = org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i10++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User a22 = d2Var.getMessagesController().a2(Long.valueOf(C1));
            if (a22.id != d2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.l10.p(a22).toLowerCase();
                String S02 = org.telegram.messenger.bd.E0().S0(lowerCase2, z11, z12);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                char c10 = z12;
                for (int i11 = z12; i11 < i3; i11++) {
                    String str2 = strArr[i11];
                    if (lowerCase2.startsWith(str2) || k2.p1.z(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || k2.p1.z(" ", str2, S02)))) {
                        c2 = 1;
                    } else {
                        String n4 = org.telegram.messenger.l10.n(a22);
                        if (n4 != null && n4.startsWith(str2)) {
                            c10 = 2;
                        }
                        c2 = c10;
                    }
                    if (c2 != 0) {
                        arrayList = arrayList2;
                        z10 = true;
                        if (c2 == 1) {
                            arrayList3.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str2));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.l10.n(a22), null, "@" + str2));
                        }
                        arrayList4.add(tLObject);
                        i10++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        z12 = 0;
                    } else {
                        z11 = true;
                        arrayList2 = arrayList2;
                        c10 = c2;
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
        org.telegram.messenger.g0.h3(new e7(pr0Var, arrayList3, arrayList4, 27));
    }

    private final void c() {
        pr0 pr0Var = (pr0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ws0 ws0Var = pr0Var.s;
        if (ws0Var.Y0) {
            pr0Var.d = arrayList;
            pr0Var.r--;
            if (!org.telegram.messenger.t3.T(pr0Var.n)) {
                ArrayList arrayList3 = pr0Var.e.g;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
            }
            if (pr0Var.r == 0) {
                int i3 = 0;
                while (true) {
                    rr0[] rr0VarArr = ws0Var.n0;
                    if (i3 >= rr0VarArr.length) {
                        break;
                    }
                    rr0 rr0Var = rr0VarArr[i3];
                    if (rr0Var.F == 7) {
                        if (pr0Var.h == 0) {
                            rr0Var.w.e(false, true);
                        } else {
                            ws0Var.D(rr0Var.h, 0, null);
                        }
                    }
                    i3++;
                }
            }
            pr0Var.f();
        }
    }

    private final void e() {
        boolean z10;
        String str;
        tr0 tr0Var = (tr0) this.b;
        String str2 = (String) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        tr0Var.getClass();
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new j50(23, tr0Var, new ArrayList()));
            return;
        }
        String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
        if (lowerCase.equals(S0) || S0.length() == 0) {
            S0 = null;
        }
        int i3 = (S0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i3];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < i3) {
                    String str3 = strArr[i11];
                    String I0 = ziVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str3)) {
                            arrayList2.add(ziVar);
                            break;
                        }
                        if (tr0Var.r == 4) {
                            TLRPC.Document document = ziVar.D == 0 ? org.telegram.messenger.zi.o1(ziVar.k).webpage.document : org.telegram.messenger.zi.o1(ziVar.k).document;
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
                                arrayList2.add(ziVar);
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
        org.telegram.messenger.g0.h3(new j50(23, tr0Var, arrayList2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:237|238|239)|234|235) */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0789, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x078a, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0785, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0786, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07c5  */
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
        int i3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        String str2;
        Calendar calendar;
        JSONObject optJSONObject;
        String optString;
        int i12 = 3;
        Bitmap bitmap = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                z7 z7Var = (z7) this.b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.c;
                TLObject tLObject = (TLObject) this.d;
                s1Var.dismiss();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    org.telegram.messenger.bp bpVar = z7Var.n2;
                    if (bpVar != null) {
                        bpVar.c.add(0, bpVar.d(document));
                        bpVar.e();
                    }
                    z7Var.o2.clear();
                    z7Var.o2.addAll(z7Var.n2.c);
                    z7Var.r1.f();
                    ConnectionsManager.getInstance(z7Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 1:
                me meVar = (me) this.b;
                ht0 ht0Var = (ht0) this.c;
                dn0 dn0Var = (dn0) this.d;
                meVar.getClass();
                ht0Var.getViewTreeObserver().removeOnDrawListener(meVar);
                dn0Var.a.setHideAvatar(true);
                return;
            case 2:
                tf tfVar = (tf) this.b;
                Uri uri = (Uri) this.c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = tfVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(yeVar);
                            org.telegram.messenger.g0.h3(new e7(tfVar, arrayList2, file, i12));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 3:
                ((tf) this.b).J((File) this.d, (ArrayList) this.c);
                return;
            case 4:
                final bi biVar = (bi) this.b;
                th thVar = (th) this.c;
                final ng ngVar = (ng) this.d;
                final boolean z11 = biVar.u2.getCurrentItemTop() <= thVar.getButtonsHideOffset();
                float alpha = biVar.S2.getAlpha();
                float f10 = z11 ? 1.0f : 0.0f;
                q1.g gVar = new q1.g(new q1.f(0.0f));
                gVar.b(new ug(biVar, alpha, f10, z11));
                gVar.a(new q1.c() { // from class: org.telegram.ui.Components.vg
                    @Override // q1.c
                    public final void a(q1.g gVar2, boolean z12, float f11, float f12) {
                        bi biVar2 = bi.this;
                        biVar2.t2.v(1.0f);
                        biVar2.u2.v(1.0f);
                        biVar2.t2.m(biVar2.g4);
                        biVar2.u2.m(biVar2.g4);
                        biVar2.Y0.g();
                        biVar2.b.invalidate();
                        biVar2.S2.setTag(z11 ? 1 : null);
                        ngVar.run();
                    }
                });
                q1.h hVar = new q1.h(500.0f);
                gVar.m = hVar;
                hVar.a(1.0f);
                gVar.m.b(1000.0f);
                gVar.h();
                biVar.o3 = gVar;
                return;
            case 5:
                bi biVar2 = (bi) this.b;
                g2.g gVar2 = (g2.g) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                biVar2.A0 = null;
                biVar2.k4 = null;
                gVar2.e();
                biVar2.B0 = 0;
                if (n2Var != null) {
                    n2Var.v();
                }
                if (biVar2.K) {
                    biVar2.c.setLayerType(0, null);
                }
                if (biVar2.W) {
                    WindowManager.LayoutParams attributes = biVar2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    biVar2.getWindow().setAttributes(attributes);
                }
                org.telegram.messenger.hs.e().k(99, 512);
                return;
            case 6:
                to toVar = (to) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.c;
                HashMap hashMap = toVar.s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    j6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r5 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r5)) {
                    return;
                }
                hashMap.put(r5, j6Var);
                org.telegram.messenger.w7.G(j6Var.F).X(wallPaper.document, wallPaper, 1, 1);
                return;
            case 7:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                y8Var.setText(charSequence);
                org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, e6Var2);
                return;
            case 8:
                ur urVar = (ur) this.b;
                org.telegram.messenger.qr qrVar = (org.telegram.messenger.qr) this.c;
                tr trVar = (tr) this.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long j10 = 0;
                try {
                    int i14 = 0;
                    SQLiteCursor queryFinalized = qrVar.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList4.add(Long.valueOf(queryFinalized.longValue(i14)));
                            j10 = Math.max(j10, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                            i14 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor = queryFinalized;
                            z10 = true;
                            try {
                                org.telegram.messenger.a8.g(e, z10);
                                if (sQLiteCursor != null) {
                                }
                                org.telegram.messenger.g0.h3(new ai.z1(urVar, arrayList3, j10, str, trVar, 13));
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
                    ArrayList l02 = qrVar.l0(arrayList4);
                    int size = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList4.get(i15);
                        i15++;
                        long longValue = ((Long) obj).longValue();
                        int size2 = l02.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                Object obj2 = l02.get(i16);
                                i16++;
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
                                        org.telegram.messenger.g0.h3(new ai.z1(urVar, arrayList3, j10, str, trVar, 13));
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
                org.telegram.messenger.g0.h3(new ai.z1(urVar, arrayList3, j10, str, trVar, 13));
                return;
            case 9:
                py pyVar = (py) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                sy syVar = pyVar.K;
                int[] iArr = syVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!syVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, syVar.g(!pyVar.U ? 1 : 0), 0);
                GLES20.glClear(0);
                int i17 = pyVar.V;
                if (i17 != 0 && (i3 = pyVar.W) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i17 * i3 * 4);
                    GLES20.glReadPixels(0, 0, pyVar.V, pyVar.W, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(pyVar.V, pyVar.W, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 10:
                rz rzVar = (rz) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                rzVar.s2 = -1;
                ac I = fc.a0(d2Var).I(R.raw.ic_delete, org.telegram.messenger.bd.a0(null, null, 2131750664, rzVar.V1), org.telegram.messenger.bd.G(arrayList5.size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                rzVar.t2 = true;
                rzVar.dismiss();
                rzVar.p1.getMessagesController().l2(rzVar.R1);
                return;
            case 11:
                rz rzVar2 = (rz) this.b;
                rzVar2.s2 = rzVar2.p1.getConnectionsManager().sendRequest((TLObject) this.d, new org.telegram.ui.ActionBar.h6(17, rzVar2, (Pair) this.c));
                return;
            case 12:
                i50 i50Var = (i50) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.d;
                i50Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                d2Var2.presentFragment(new ProfileActivity(bundle, null));
                i50Var.d2 = true;
                return;
            case 13:
                c50 c50Var = (c50) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                i50 i50Var2 = c50Var.a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = i50Var2.l1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (i50Var2.b2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = i50Var2.l1;
                    if (chatFull2 != null) {
                        int i18 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i18;
                        if (i18 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        org.telegram.messenger.qr.a0(i50Var2.a).w1(chatFull2.invitesCount, i50Var2.Y1);
                    }
                    org.telegram.ui.za zaVar = i50Var2.b2;
                    if (zaVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = i50Var2.j1;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.kb kbVar = zaVar.a;
                        ArrayList arrayList6 = kbVar.p0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = org.telegram.messenger.h10.i(kbVar.getAccountInstance().a).n;
                        i10 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                        if (new org.telegram.messenger.zi(i10, tL_channelAdminLogEvent, kbVar.o0, kbVar.n0, kbVar.f, kbVar.U, true).U < 0) {
                            return;
                        }
                        kbVar.W0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            kbVar.D0.N = true;
                            org.telegram.ui.hb hbVar = kbVar.F;
                            hbVar.o(hbVar.h, size4);
                            org.telegram.ui.kb.P0(kbVar);
                        }
                        kbVar.z0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                t50 t50Var = (t50) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error2 == null) {
                    t50Var.r2 = (TLRPC.TL_chatInviteExported) tLObject4;
                    TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(t50Var.a).N0(t50Var.n2);
                    if (N0 != null) {
                        N0.exported_invite = t50Var.r2;
                    }
                    if (t50Var.r2.link == null) {
                        return;
                    }
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", t50Var.r2.link));
                    fc.j(t50Var.i2).j();
                    t50Var.dismiss();
                }
                t50Var.q2 = false;
                return;
            case 15:
                p50 p50Var = (p50) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                p50Var.h = null;
                p50Var.c = arrayList7;
                p50Var.d = arrayList8;
                kg.v1 v1Var = p50Var.e;
                v1Var.f(arrayList7, null);
                t50 t50Var2 = p50Var.n;
                t50Var2.O0(p50Var.f - 1);
                p50Var.f();
                if (v1Var.e() || p50Var.b() > 2) {
                    return;
                }
                t50Var2.r1.e(false, true);
                return;
            case 16:
                s70 s70Var = (s70) this.b;
                t70 t70Var = (t70) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                r70 r70Var = s70Var.h;
                if (r70Var == null || s70Var.e != t70Var) {
                    return;
                }
                r70Var.a(clickableSpan);
                s70Var.e = null;
                s70Var.b.f(true);
                return;
            case 17:
                ia0 ia0Var = (ia0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                org.telegram.ui.ActionBar.e6 e6Var3 = ia0Var.c;
                TextView textView = ia0Var.f;
                TextView textView2 = ia0Var.e;
                if (tL_error3 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        textView2.setText(org.telegram.messenger.bd.M0(2131747201, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        ia0Var.F = true;
                        textView2.setText(org.telegram.messenger.bd.M0(2131747205, null));
                        textView.setText(org.telegram.messenger.bd.M0(2131747203, null));
                    } else {
                        textView2.setText(org.telegram.messenger.bd.N0("UnknownError"));
                        textView.setVisibility(8);
                        new fc(wa.a(ia0Var.getContext()), e6Var3).f0(tL_error3, false);
                    }
                } else if (tLObject5 instanceof TLRPC.TL_outboxReadDate) {
                    int i19 = ((TLRPC.TL_outboxReadDate) tLObject5).date;
                    e6Var = e6Var3;
                    long j11 = i19 * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        i11 = 0;
                    } catch (Exception e13) {
                        e = e13;
                        i11 = 0;
                    }
                    try {
                        int i20 = calendar.get(6);
                        int i21 = calendar.get(1);
                        calendar.setTimeInMillis(j11);
                        int i22 = calendar.get(6);
                        int i23 = calendar.get(1);
                        str2 = (i22 == i20 && i21 == i23) ? org.telegram.messenger.bd.a0(null, null, 2131747202, org.telegram.messenger.bd.E0().p0().format(new Date(j11))) : (i22 + 1 == i20 && i21 == i23) ? org.telegram.messenger.bd.a0(null, null, 2131747200, org.telegram.messenger.bd.E0().p0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? org.telegram.messenger.bd.a0(null, null, 2131747204, org.telegram.messenger.bd.E0().q0().format(new Date(j11)), org.telegram.messenger.bd.E0().p0().format(new Date(j11))) : org.telegram.messenger.bd.a0(null, null, 2131747204, org.telegram.messenger.bd.E0().C0().format(new Date(j11)), org.telegram.messenger.bd.E0().p0().format(new Date(j11)));
                    } catch (Exception e14) {
                        e = e14;
                        org.telegram.messenger.a8.g(e, true);
                        str2 = "LOC_ERR";
                        textView2.setText(str2);
                        textView.setVisibility(8);
                        ViewPropertyAnimator alpha2 = ia0Var.d.animate().alpha(1.0f);
                        xq xqVar = xq.h;
                        org.telegram.messenger.camera.q.l(alpha2, xqVar, 320L);
                        ia0Var.h.animate().alpha(0.0f).setInterpolator(xqVar).setDuration(320L).start();
                        if (!ia0Var.F) {
                        }
                    }
                    textView2.setText(str2);
                    textView.setVisibility(8);
                    ViewPropertyAnimator alpha22 = ia0Var.d.animate().alpha(1.0f);
                    xq xqVar2 = xq.h;
                    org.telegram.messenger.camera.q.l(alpha22, xqVar2, 320L);
                    ia0Var.h.animate().alpha(0.0f).setInterpolator(xqVar2).setDuration(320L).start();
                    if (!ia0Var.F) {
                        ia0Var.setBackground(null);
                        ia0Var.setOnClickListener(null);
                        return;
                    }
                    int i24 = org.telegram.ui.ActionBar.k6.i6;
                    int i25 = i11;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i24, e6Var), 6, i25);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i24);
                    ia0Var.setBackground(a02);
                    org.telegram.ui.ActionBar.r6.k(ia0Var, a02, null, N, e6Var);
                    ia0Var.setOnClickListener(new ga0(ia0Var, i25));
                    return;
                }
                i11 = 0;
                e6Var = e6Var3;
                ViewPropertyAnimator alpha222 = ia0Var.d.animate().alpha(1.0f);
                xq xqVar22 = xq.h;
                org.telegram.messenger.camera.q.l(alpha222, xqVar22, 320L);
                ia0Var.h.animate().alpha(0.0f).setInterpolator(xqVar22).setDuration(320L).start();
                if (!ia0Var.F) {
                }
            case 18:
                hc0 hc0Var = (hc0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error4 == null) {
                    hc0Var.getClass();
                    hc0Var.p1 = (TLRPC.TL_chatInviteExported) tLObject6;
                    TLRPC.ChatFull N02 = org.telegram.messenger.hp.s1(hc0Var.a).N0(hc0Var.n1);
                    if (N02 != null) {
                        N02.exported_invite = hc0Var.p1;
                    }
                    hc0Var.m1.setLink(hc0Var.p1.link);
                }
                hc0Var.o1 = false;
                return;
            case 19:
                org.telegram.ui.o1 o1Var = (org.telegram.ui.o1) this.b;
                String str3 = (String) this.c;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) o1Var.b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + tp0Var.x).put("platform", "DESKTOP"))).put("videoId", tp0Var.x).toString().getBytes("UTF-8"));
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
                            if (tp0Var.I == 0) {
                                tp0Var.s = optString;
                                return;
                            } else {
                                ud0.a(tp0Var, optString);
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
            case 20:
                se0 se0Var = (se0) this.b;
                re0 re0Var = (re0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (se0Var.isShowing()) {
                    se0Var.s1.remove(re0Var);
                    if (tLObject7 != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject7;
                        org.telegram.messenger.hp.s1(se0Var.a).Y3(tL_messages_votesList.users, false);
                        re0Var.b.addAll(tL_messages_votesList.votes);
                        re0Var.c = tL_messages_votesList.next_offset;
                        se0Var.J0(null);
                        se0Var.k1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                hl0 hl0Var = (hl0) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                int i26 = hl0Var.d;
                for (int i27 = 0; i27 < arrayList9.size(); i27++) {
                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(i26);
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList9.get(i27);
                    if (ziVar != null && ziVar.F0() != null) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.u5(q10, ziVar.F0(), ziVar, i13));
                    }
                }
                if (!arrayList10.isEmpty()) {
                    org.telegram.messenger.z5.q(i26).j(arrayList10);
                }
                hl0Var.P = false;
                hl0Var.d(true);
                return;
            case 22:
                bm0 bm0Var = (bm0) this.b;
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.c;
                f60 f60Var = (f60) this.d;
                if (org.telegram.messenger.h10.i(bm0Var.L0.K0).q()) {
                    uwVar.getMessagesController().o0(true);
                    bm0Var.S();
                    fc.a0(uwVar).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                } else {
                    new vg.v0((org.telegram.ui.ActionBar.d2) uwVar, 3, true).show();
                }
                f60Var.u();
                return;
            case 23:
                ws0 ws0Var = (ws0) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                f60 f60Var2 = (f60) this.d;
                t4.R(ws0Var.getContext(), null, ws0Var.I1, new hp0(ws0Var, storyItem));
                f60Var2.u();
                return;
            case 24:
                ws0 ws0Var2 = (ws0) this.b;
                String str4 = (String) this.c;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.d;
                br0 br0Var = new br0(ws0Var2.getContext(), str4, str4, ws0Var2.I1, d2Var3);
                if (d2Var3 != null) {
                    d2Var3.showDialog(br0Var);
                    return;
                } else {
                    br0Var.show();
                    return;
                }
            case 25:
                a();
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                e();
                return;
            default:
                xv0 xv0Var = (xv0) this.b;
                String str5 = (String) this.c;
                org.telegram.messenger.ry ryVar = (org.telegram.messenger.ry) this.d;
                if (xv0Var.J) {
                    return;
                }
                xv0Var.R1.remove(str5);
                if ("application/x-tgsticker".equals(ryVar.d)) {
                    ryVar.c = true;
                    int indexOf = xv0Var.Q1.indexOf(ryVar);
                    if (indexOf >= 0) {
                        u4.d1 K = xv0Var.k1.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.y7) K.a).setSticker(ryVar);
                        }
                    } else {
                        xv0Var.l1.f();
                    }
                } else {
                    xv0Var.S0(ryVar);
                }
                if (xv0Var.R1.isEmpty()) {
                    xv0Var.Z0();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e7(Object obj, TLObject tLObject, Object obj2, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
    }

    public /* synthetic */ e7(hc0 hc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 18;
        this.b = hc0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}

package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        BitmapDrawable bitmapDrawable;
        long U;
        long S;
        float f7;
        float f10;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r7 = null;
        r7 = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        r7 = null;
        String str2 = null;
        Drawable drawable = null;
        sQLitePreparedStatement = null;
        boolean z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((k10) this.b).a((ArrayList) this.c);
                return;
            case 1:
                vp.r1(((a7) this.b).a).L3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 2:
                hs hsVar = (hs) this.b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.c;
                try {
                    try {
                        sQLitePreparedStatement = hsVar.b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                        tL_factCheck.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                        sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 3:
                m7 m7Var = (m7) this.b;
                boolean z11 = m7Var.y && ((boolean[]) this.c)[0];
                int i11 = m7Var.J;
                boolean z12 = i11 > 0 && m7Var.a0 >= ((long) i11) && m7Var.j && m7Var.W0 < 3;
                long j10 = m7Var.b0;
                if (j10 == 0 || !(z11 || m7Var.a0 == j10 || z12)) {
                    m7Var.s(-1);
                    return;
                }
                try {
                    m7Var.k(1, false, true);
                    return;
                } catch (Exception unused) {
                    m7Var.j(0, true);
                    return;
                }
            case 4:
                m7 m7Var2 = (m7) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                System.currentTimeMillis();
                try {
                } catch (Exception e7) {
                    f8.g(e7, false);
                    if (i0.F1(e7)) {
                        LaunchActivity.D(1);
                    } else if (i0.G1(e7)) {
                        tz.h(m7Var2.L0);
                    }
                }
                if (m7Var2.S0 == null) {
                    return;
                }
                int size = arrayList.size();
                int i12 = (size * 16) + 4;
                rf.x xVar = m7.l1;
                if (xVar == null) {
                    m7.l1 = new rf.x(i12);
                } else {
                    xVar.b();
                }
                m7.l1.c(size);
                for (int i13 = 0; i13 < size; i13++) {
                    k7 k7Var = (k7) arrayList.get(i13);
                    m7.l1.d(k7Var.a);
                    m7.l1.d(k7Var.b);
                }
                synchronized (m7Var2) {
                    try {
                        RandomAccessFile randomAccessFile = m7Var2.S0;
                        if (randomAccessFile == null) {
                            return;
                        }
                        randomAccessFile.seek(0L);
                        m7Var2.S0.write(m7.l1.a, 0, i12);
                        m7Var2.Y0 = false;
                        if (m7Var2.Z0) {
                            try {
                                m7Var2.S0.getChannel().close();
                            } catch (Exception e10) {
                                f8.g(e10, true);
                            }
                            m7Var2.S0.close();
                            m7Var2.S0 = null;
                        }
                        System.currentTimeMillis();
                        return;
                    } finally {
                    }
                }
            case 5:
                b8 b8Var = (b8) this.b;
                us[] usVarArr = (us[]) this.c;
                b8Var.getNotificationCenter().n(usVarArr[0], zs.U1);
                b8Var.getNotificationCenter().n(usVarArr[0], zs.V1);
                return;
            case 6:
                b8 b8Var2 = (b8) this.b;
                b8Var2.getDownloadController().H.removeAll((ArrayList) this.c);
                b8Var2.getNotificationCenter().k(zs.b5, new Object[0]);
                return;
            case 7:
                m7 m7Var3 = (m7) ((b8) this.b).w.get(b8.r("mp4", (TLRPC.FileLocation) this.c));
                if (m7Var3 != null) {
                    if (m7Var3.y) {
                        m7Var3.q(false);
                    }
                    m7Var3.V0 = true;
                    m7Var3.W0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    ((ArrayList) m7Var3.e1.d).remove(m7Var3);
                    m7Var3.e1.a(m7Var3);
                    m7Var3.e1.b(false);
                    return;
                }
                return;
            case 8:
                m7 m7Var4 = (m7) this.b;
                bg.h hVar = (bg.h) this.c;
                m7Var4.a = true;
                hVar.b(false);
                return;
            case 9:
                String str3 = (String) this.b;
                Throwable th3 = (Throwable) this.c;
                try {
                    f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str3 + "\n");
                    f8.j().a.write(th3.toString());
                    StackTraceElement[] stackTrace = th3.getStackTrace();
                    while (i10 < stackTrace.length) {
                        f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i10] + "\n");
                        i10++;
                    }
                    f8.j().a.flush();
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 10:
                k8 k8Var = (k8) this.b;
                List list = (List) this.c;
                k8Var.getClass();
                try {
                    k8Var.c();
                    k8Var.c.beginTransaction();
                    while (i10 < list.size()) {
                        k8Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((sh.a) list.get(i10)).a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                        i10++;
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 11:
                ((w8) this.b).getMessagesController().U3((TLRPC.User) this.c, false, false);
                return;
            case 12:
                ((w8) this.b).getMediaDataController().P1((TLRPC.TL_messages_stickerSet) this.c);
                return;
            case 13:
                i0.g3(new t6(15, ((hc) this.b).l(), (Runnable) this.c));
                return;
            case 14:
                hc hcVar = (hc) this.b;
                hcVar.B.add((yb) this.c);
                hcVar.U(null, 0);
                return;
            case 15:
                SparseArray sparseArray = (SparseArray) this.b;
                Runnable runnable = (Runnable) this.c;
                b8.K = sparseArray;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                ub ubVar = (ub) this.b;
                String str4 = (String) this.c;
                vb vbVar = ubVar.a;
                hc hcVar2 = ubVar.e;
                cc ccVar = new cc(hcVar2, vbVar, str4);
                vbVar.t = ccVar;
                hcVar2.n.add(ccVar);
                hcVar2.V(false);
                return;
            case 17:
                wb wbVar = (wb) this.b;
                Drawable drawable2 = (Drawable) this.c;
                hc hcVar3 = wbVar.e;
                kb kbVar = hcVar3.e;
                vb vbVar2 = wbVar.c;
                if (drawable2 instanceof bi0) {
                    bi0 bi0Var = (bi0) drawable2;
                    Drawable drawable3 = (Drawable) kbVar.f(vbVar2.d);
                    if (drawable3 == null) {
                        kbVar.l(vbVar2.d, bi0Var);
                        drawable = bi0Var;
                    } else {
                        bi0Var.C(false);
                        drawable = drawable3;
                    }
                    hcVar3.H(vbVar2.d);
                    str = vbVar2.d;
                } else if (drawable2 instanceof org.telegram.ui.Components.s5) {
                    org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) drawable2;
                    if (s5Var.n0) {
                        String str5 = vbVar2.d;
                        ThreadLocal threadLocal = hc.I;
                        BitmapDrawable y3 = hcVar3.y(str5);
                        if (y3 == null) {
                            kbVar.l(vbVar2.d, s5Var);
                            bitmapDrawable = s5Var;
                        } else {
                            s5Var.u();
                            bitmapDrawable = y3;
                        }
                        hcVar3.H(vbVar2.d);
                        str = vbVar2.d;
                        drawable = bitmapDrawable;
                    }
                    String str6 = str2;
                    drawable = drawable2;
                    str = str6;
                } else if (drawable2 instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable2;
                    BitmapDrawable z13 = hcVar3.z(vbVar2.d);
                    if (z13 != null) {
                        i0.z2(bitmapDrawable2.getBitmap());
                        drawable2 = z13;
                    } else if (vbVar2.d.endsWith("_f")) {
                        hcVar3.d.l(vbVar2.d, bitmapDrawable2);
                        z10 = false;
                        drawable2 = bitmapDrawable2;
                    } else if (vbVar2.d.endsWith("_isc") || vbVar2.d.endsWith("_nocache") || bitmapDrawable2.getBitmap().getWidth() > i0.p * 80.0f || bitmapDrawable2.getBitmap().getHeight() > i0.p * 80.0f) {
                        drawable2 = bitmapDrawable2;
                        if (!vbVar2.d.endsWith("_nocache")) {
                            hcVar3.c.l(vbVar2.d, bitmapDrawable2);
                            drawable2 = bitmapDrawable2;
                        }
                    } else {
                        hcVar3.b.l(vbVar2.d, bitmapDrawable2);
                        drawable2 = bitmapDrawable2;
                    }
                    if (z10) {
                        hcVar3.H(vbVar2.d);
                        str2 = vbVar2.d;
                    }
                    String str62 = str2;
                    drawable = drawable2;
                    str = str62;
                } else {
                    str = null;
                }
                hcVar3.s.d(new mg(wbVar, drawable, str, 26), vbVar2.a);
                return;
            case 18:
                ((gc) this.b).d.v.remove((String) this.c);
                return;
            case 19:
                MediaController mediaController = (MediaController) this.b;
                jj jjVar = (jj) this.c;
                String[] strArr = MediaController.U1;
                mediaController.R(jjVar, true);
                return;
            case 20:
                MediaController mediaController2 = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.U1;
                try {
                    int i14 = mediaController2.k0 + 1;
                    mediaController2.k0 = i14;
                    u61 u61Var = mediaController2.j0;
                    if (u61Var != null) {
                        u61Var.m0();
                    }
                    u61 u61Var2 = new u61(false, false);
                    mediaController2.j0 = u61Var2;
                    u61Var2.J = new c5.x(mediaController2, i14, 13);
                    u61Var2.j0(Uri.fromFile(file), "other");
                    mediaController2.j0.x0(3);
                    mediaController2.j0.h0();
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    u61 u61Var3 = mediaController2.j0;
                    if (u61Var3 != null) {
                        u61Var3.m0();
                        mediaController2.j0 = null;
                        return;
                    }
                    return;
                }
            case 21:
                c cVar = (c) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String[] strArr3 = MediaController.U1;
                b8.G(cVar.a).X(tL_document, null, 1, 1);
                return;
            case 22:
                ((MediaController) ((mg.c2) this.b).b).w1.add((ByteBuffer) this.c);
                return;
            case 23:
                ve veVar = (ve) this.b;
                jj jjVar2 = (jj) this.c;
                MediaController mediaController3 = (MediaController) veVar.c;
                u61 u61Var4 = mediaController3.i0;
                if ((u61Var4 == null && mediaController3.E0 == null) || mediaController3.g0) {
                    return;
                }
                try {
                    u61 u61Var5 = mediaController3.E0;
                    if (u61Var5 == null) {
                        U = u61Var4.U();
                        S = ((MediaController) veVar.c).i0.S();
                        f7 = U >= 0 ? S / U : 0.0f;
                        float J = ((MediaController) veVar.c).i0.J() / U;
                        if (U != -9223372036854775807L && S >= 0 && ((MediaController) veVar.c).t0 == 0.0f) {
                            f10 = J;
                        }
                        return;
                    }
                    U = u61Var5.U();
                    S = ((MediaController) veVar.c).E0.S();
                    if (S >= 0 && U > 0) {
                        float f11 = U;
                        f10 = ((MediaController) veVar.c).E0.J() / f11;
                        f7 = S / f11;
                        if (f7 >= 1.0f) {
                            return;
                        }
                    }
                    return;
                    MediaController mediaController4 = (MediaController) veVar.c;
                    jjVar2.h0 = (int) (U / 1000);
                    jjVar2.b0 = f7;
                    jjVar2.g0 = (int) (S / 1000);
                    jjVar2.e0 = f10;
                    if (f7 >= 0.0f && mediaController4.n0 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        MediaController mediaController5 = (MediaController) veVar.c;
                        if (elapsedRealtime - mediaController5.o0 >= 1000) {
                            String str7 = mediaController5.n0;
                            mediaController5.o0 = SystemClock.elapsedRealtime();
                            Utilities.e.c(new ue(str7, i10, f7));
                        }
                    }
                    zs.f(jjVar2.I1).k(zs.e2, Integer.valueOf(jjVar2.f1()), Float.valueOf(f7));
                    return;
                } catch (Exception e13) {
                    f8.g(e13, true);
                    return;
                }
            case 24:
                cf cfVar = (cf) this.b;
                jj jjVar3 = (jj) this.c;
                TLRPC.Document F0 = jjVar3.F0();
                TLRPC.Document document = jjVar3.a3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 == null) {
                    return;
                }
                cfVar.d.put(b8.r(null, F0), jjVar3);
                b8.G(cfVar.a.a).X(F0, jjVar3, 3, jj.Q5(jjVar3.k) ? 2 : 0);
                return;
            case 25:
                ui uiVar = (ui) this.b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
                try {
                    uiVar.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    uiVar.getMessagesStorage().b.beginTransaction();
                    uiVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
                    for (int i15 = 0; i15 < tL_contacts_topPeers.categories.size(); i15++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i15);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        int i16 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                        for (int i17 = 0; i17 < tL_topPeerCategoryPeers.peers.size(); i17++) {
                            TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i17);
                            executeFast.requery();
                            executeFast.bindLong(1, jj.C1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i16);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    uiVar.getMessagesStorage().b.commitTransaction();
                    i0.g3(new eg(uiVar, 6));
                    return;
                } catch (Exception e14) {
                    f8.g(e14, true);
                    return;
                }
            case 26:
                boolean[] zArr = (boolean[]) this.b;
                kh khVar = (kh) this.c;
                if (zArr[0]) {
                    return;
                }
                khVar.run();
                zArr[0] = true;
                return;
            case 27:
                ui uiVar2 = (ui) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        uiVar2.L0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                        return;
                    }
                    i0.g3(new ag(uiVar2, tL_messages_stickerSet, z10 ? 1 : 0));
                    return;
                } catch (Throwable th4) {
                    f8.g(th4, true);
                    return;
                }
            case 28:
                q20 q20Var = (q20) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                if (q20Var != null) {
                    q20Var.a(arrayList2);
                    return;
                }
                return;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                Runnable runnable2 = (Runnable) this.c;
                if (atomicInteger.decrementAndGet() != 0 || runnable2 == null) {
                    return;
                }
                i0.g3(runnable2);
                return;
        }
    }
}

package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        si siVar = (si) this.b;
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
        try {
            siVar.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            siVar.getMessagesStorage().b.beginTransaction();
            siVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = siVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i7 = 0; i7 < tL_contacts_topPeers.categories.size(); i7++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i7);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                int i10 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, gj.B1(tL_topPeer.peer));
                    executeFast.bindInteger(2, i10);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            siVar.getMessagesStorage().b.commitTransaction();
            g0.h3(new eg(siVar, 6));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0329  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        BitmapDrawable bitmapDrawable;
        boolean z10;
        BitmapDrawable bitmapDrawable2;
        boolean z11;
        long U;
        long S;
        float f10;
        float K;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r6 = null;
        r6 = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        r6 = null;
        String str2 = null;
        Drawable drawable = null;
        sQLitePreparedStatement = null;
        int i7 = 1;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                SparseArray sparseArray = (SparseArray) this.c;
                if (g5Var.s) {
                    return;
                }
                g5Var.s = true;
                HashMap hashMap = new HashMap();
                HashMap H = g5Var.H();
                HashMap hashMap2 = new HashMap();
                Iterator it = H.entrySet().iterator();
                while (it.hasNext()) {
                    d5 d5Var = (d5) ((Map.Entry) it.next()).getValue();
                    for (int i10 = 0; i10 < d5Var.g.size(); i10++) {
                        hashMap2.put((String) d5Var.g.get(i10), d5Var.b);
                    }
                }
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    d5 d5Var2 = (d5) sparseArray.valueAt(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= d5Var2.g.size()) {
                            break;
                        }
                        String str3 = (String) hashMap2.get((String) d5Var2.g.get(i12));
                        if (str3 != null) {
                            d5Var2.b = str3;
                            hashMap.put(str3, d5Var2);
                        } else {
                            i12++;
                        }
                    }
                }
                if (r2.a) {
                    a8.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
                }
                g5Var.getMessagesStorage().Z0(hashMap, true, false);
                return;
            case 1:
                r5 r5Var = (r5) this.b;
                q5 q5Var = (q5) this.c;
                r5Var.g--;
                SparseIntArray sparseIntArray = r5Var.b;
                int i13 = sparseIntArray.get(q5Var.index) - 1;
                if (i13 != 0) {
                    sparseIntArray.put(q5Var.index, i13);
                    return;
                }
                sparseIntArray.delete(q5Var.index);
                r5Var.c.remove(q5Var);
                r5Var.a.add(q5Var);
                return;
            case 2:
                ((t00) this.b).a((ArrayList) this.c);
                return;
            case 3:
                np.s1(((x6) this.b).a).O3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 4:
                vr vrVar = (vr) this.b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.c;
                try {
                    try {
                        sQLitePreparedStatement = vrVar.b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                        tL_factCheck.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                        sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
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
            case 5:
                i7 i7Var = (i7) this.b;
                boolean z12 = i7Var.y && ((boolean[]) this.c)[0];
                int i14 = i7Var.J;
                boolean z13 = i14 > 0 && i7Var.a0 >= ((long) i14) && i7Var.j && i7Var.W0 < 3;
                long j3 = i7Var.b0;
                if (j3 == 0 || !(z12 || i7Var.a0 == j3 || z13)) {
                    i7Var.s(-1);
                    return;
                }
                try {
                    i7Var.k(1, false, true);
                    return;
                } catch (Exception unused) {
                    i7Var.j(0, true);
                    return;
                }
            case 6:
                i7 i7Var2 = (i7) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                System.currentTimeMillis();
                try {
                } catch (Exception e11) {
                    a8.g(e11, false);
                    if (g0.F1(e11)) {
                        LaunchActivity.D(1);
                    } else if (g0.G1(e11)) {
                        gz.h(i7Var2.L0);
                    }
                }
                if (i7Var2.S0 == null) {
                    return;
                }
                int size = arrayList.size();
                int i15 = (size * 16) + 4;
                bg.d0 d0Var = i7.l1;
                if (d0Var == null) {
                    i7.l1 = new bg.d0(i15);
                } else {
                    d0Var.b();
                }
                i7.l1.c(size);
                for (int i16 = 0; i16 < size; i16++) {
                    g7 g7Var = (g7) arrayList.get(i16);
                    i7.l1.d(g7Var.a);
                    i7.l1.d(g7Var.b);
                }
                synchronized (i7Var2) {
                    try {
                        RandomAccessFile randomAccessFile = i7Var2.S0;
                        if (randomAccessFile == null) {
                            return;
                        }
                        randomAccessFile.seek(0L);
                        i7Var2.S0.write(i7.l1.a, 0, i15);
                        i7Var2.Y0 = false;
                        if (i7Var2.Z0) {
                            try {
                                i7Var2.S0.getChannel().close();
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            i7Var2.S0.close();
                            i7Var2.S0 = null;
                        }
                        System.currentTimeMillis();
                        return;
                    } finally {
                    }
                }
            case 7:
                w7 w7Var = (w7) this.b;
                is[] isVarArr = (is[]) this.c;
                w7Var.getNotificationCenter().n(isVarArr[0], ns.U1);
                w7Var.getNotificationCenter().n(isVarArr[0], ns.V1);
                return;
            case 8:
                w7 w7Var2 = (w7) this.b;
                w7Var2.getDownloadController().I.removeAll((ArrayList) this.c);
                w7Var2.getNotificationCenter().k(ns.b5, new Object[0]);
                return;
            case 9:
                i7 i7Var3 = (i7) ((w7) this.b).w.get(w7.r("mp4", (TLRPC.FileLocation) this.c));
                if (i7Var3 != null) {
                    if (i7Var3.y) {
                        i7Var3.q(false);
                    }
                    i7Var3.V0 = true;
                    i7Var3.W0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    ((ArrayList) i7Var3.e1.d).remove(i7Var3);
                    i7Var3.e1.a(i7Var3);
                    i7Var3.e1.b(false);
                    return;
                }
                return;
            case 10:
                i7 i7Var4 = (i7) this.b;
                lg.f fVar = (lg.f) this.c;
                i7Var4.a = true;
                fVar.b(false);
                return;
            case 11:
                String str4 = (String) this.b;
                Throwable th3 = (Throwable) this.c;
                try {
                    a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str4 + "\n");
                    a8.j().a.write(th3.toString());
                    for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                        a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTraceElement + "\n");
                    }
                    a8.j().a.flush();
                    return;
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
            case 12:
                f8 f8Var = (f8) this.b;
                List list = (List) this.c;
                f8Var.getClass();
                try {
                    f8Var.c();
                    f8Var.c.beginTransaction();
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        f8Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((ei.b) list.get(i17)).a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                    }
                } catch (Throwable th4) {
                    try {
                        a8.g(th4, true);
                    } finally {
                        f8Var.c.commitTransaction();
                    }
                }
                return;
            case 13:
                ((r8) this.b).getMessagesController().X3((TLRPC.User) this.c, false, false);
                return;
            case 14:
                ((r8) this.b).getMediaDataController().P1((TLRPC.TL_messages_stickerSet) this.c);
                return;
            case 15:
                g0.h3(new x4(((fc) this.b).l(), (Runnable) this.c));
                return;
            case 16:
                fc fcVar = (fc) this.b;
                fcVar.B.add((wb) this.c);
                fcVar.U(null, 0);
                return;
            case 17:
                SparseArray sparseArray2 = (SparseArray) this.c;
                Runnable runnable = (Runnable) this.b;
                w7.L = sparseArray2;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 18:
                sb sbVar = (sb) this.b;
                String str5 = (String) this.c;
                tb tbVar = sbVar.a;
                fc fcVar2 = sbVar.e;
                ac acVar = new ac(fcVar2, tbVar, str5);
                tbVar.t = acVar;
                fcVar2.n.add(acVar);
                fcVar2.V(false);
                return;
            case 19:
                ub ubVar = (ub) this.b;
                Drawable drawable2 = (Drawable) this.c;
                fc fcVar3 = ubVar.e;
                jb jbVar = fcVar3.e;
                tb tbVar2 = ubVar.c;
                if (drawable2 instanceof ch0) {
                    ch0 ch0Var = (ch0) drawable2;
                    Drawable drawable3 = (Drawable) jbVar.f(tbVar2.d);
                    if (drawable3 == null) {
                        jbVar.l(tbVar2.d, ch0Var);
                        drawable = ch0Var;
                    } else {
                        ch0Var.C(false);
                        drawable = drawable3;
                    }
                    fcVar3.H(tbVar2.d);
                    str = tbVar2.d;
                } else if (drawable2 instanceof org.telegram.ui.Components.t5) {
                    org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) drawable2;
                    if (t5Var.o0) {
                        String str6 = tbVar2.d;
                        ThreadLocal threadLocal = fc.I;
                        BitmapDrawable y10 = fcVar3.y(str6);
                        if (y10 == null) {
                            jbVar.l(tbVar2.d, t5Var);
                            bitmapDrawable2 = t5Var;
                        } else {
                            t5Var.u();
                            bitmapDrawable2 = y10;
                        }
                        fcVar3.H(tbVar2.d);
                        str = tbVar2.d;
                        drawable = bitmapDrawable2;
                    }
                    String str7 = str2;
                    drawable = drawable2;
                    str = str7;
                } else if (drawable2 instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable3 = (BitmapDrawable) drawable2;
                    BitmapDrawable z14 = fcVar3.z(tbVar2.d);
                    if (z14 != null) {
                        g0.z2(bitmapDrawable3.getBitmap());
                        bitmapDrawable = z14;
                    } else if (tbVar2.d.endsWith("_f")) {
                        fcVar3.d.l(tbVar2.d, bitmapDrawable3);
                        z10 = false;
                        drawable2 = bitmapDrawable3;
                        if (z10) {
                            fcVar3.H(tbVar2.d);
                            str2 = tbVar2.d;
                        }
                        String str72 = str2;
                        drawable = drawable2;
                        str = str72;
                    } else if (tbVar2.d.endsWith("_isc") || tbVar2.d.endsWith("_nocache") || bitmapDrawable3.getBitmap().getWidth() > g0.p * 80.0f || bitmapDrawable3.getBitmap().getHeight() > g0.p * 80.0f) {
                        bitmapDrawable = bitmapDrawable3;
                        if (!tbVar2.d.endsWith("_nocache")) {
                            fcVar3.c.l(tbVar2.d, bitmapDrawable3);
                            bitmapDrawable = bitmapDrawable3;
                        }
                    } else {
                        fcVar3.b.l(tbVar2.d, bitmapDrawable3);
                        bitmapDrawable = bitmapDrawable3;
                    }
                    z10 = true;
                    drawable2 = bitmapDrawable;
                    if (z10) {
                    }
                    String str722 = str2;
                    drawable = drawable2;
                    str = str722;
                } else {
                    str = null;
                }
                fcVar3.s.d(new mg(ubVar, drawable, str, 26), tbVar2.a);
                return;
            case 20:
                ((ec) this.b).d.v.remove((String) this.c);
                return;
            case 21:
                MediaController mediaController = (MediaController) this.b;
                gj gjVar = (gj) this.c;
                String[] strArr = MediaController.W1;
                mediaController.R(gjVar, true);
                return;
            case 22:
                MediaController mediaController2 = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.W1;
                try {
                    int i18 = mediaController2.l0 + 1;
                    mediaController2.l0 = i18;
                    u51 u51Var = mediaController2.k0;
                    if (u51Var != null) {
                        u51Var.m0();
                    }
                    u51 u51Var2 = new u51(false, false);
                    mediaController2.k0 = u51Var2;
                    u51Var2.K = new f5.v(mediaController2, i18, 9);
                    u51Var2.j0(Uri.fromFile(file), "other");
                    mediaController2.k0.x0(3);
                    mediaController2.k0.h0();
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    u51 u51Var3 = mediaController2.k0;
                    if (u51Var3 != null) {
                        u51Var3.m0();
                        mediaController2.k0 = null;
                        return;
                    }
                    return;
                }
            case 23:
                c cVar = (c) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String[] strArr3 = MediaController.W1;
                w7.G(cVar.a).W(tL_document, null, 1, 1);
                return;
            case 24:
                ((MediaController) ((j6.o) this.b).b).y1.add((ByteBuffer) this.c);
                return;
            case 25:
                jg.q1 q1Var = (jg.q1) this.b;
                gj gjVar2 = (gj) this.c;
                MediaController mediaController3 = (MediaController) q1Var.c;
                u51 u51Var4 = mediaController3.j0;
                if ((u51Var4 == null && mediaController3.F0 == null) || mediaController3.h0) {
                    return;
                }
                try {
                    u51 u51Var5 = mediaController3.F0;
                    if (u51Var5 != null) {
                        U = u51Var5.U();
                        S = ((MediaController) q1Var.c).F0.S();
                        if (S >= 0 && U > 0) {
                            float f11 = U;
                            K = ((MediaController) q1Var.c).F0.K() / f11;
                            f10 = S / f11;
                            if (f10 >= 1.0f) {
                                return;
                            }
                        }
                        return;
                    }
                    U = u51Var4.U();
                    S = ((MediaController) q1Var.c).j0.S();
                    f10 = U >= 0 ? S / U : 0.0f;
                    K = ((MediaController) q1Var.c).j0.K() / U;
                    if (U == -9223372036854775807L) {
                        return;
                    }
                    if (S < 0) {
                        return;
                    }
                    if (((MediaController) q1Var.c).u0 != 0.0f) {
                        return;
                    }
                    MediaController mediaController4 = (MediaController) q1Var.c;
                    z11 = true;
                    try {
                        gjVar2.j0 = (int) (U / 1000);
                        gjVar2.b0 = f10;
                        gjVar2.i0 = (int) (S / 1000);
                        gjVar2.e0 = S;
                        gjVar2.f0 = U;
                        gjVar2.g0 = K;
                        if (f10 >= 0.0f && mediaController4.o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController5 = (MediaController) q1Var.c;
                            if (elapsedRealtime - mediaController5.p0 >= 1000) {
                                String str8 = mediaController5.o0;
                                mediaController5.p0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new ue(str8, 0, f10));
                            }
                        }
                        ns.f(gjVar2.K1).k(ns.e2, Integer.valueOf(gjVar2.e1()), Float.valueOf(f10));
                        return;
                    } catch (Exception e15) {
                        e = e15;
                        a8.g(e, z11);
                        return;
                    }
                } catch (Exception e16) {
                    e = e16;
                    z11 = true;
                }
                break;
            case 26:
                bf bfVar = (bf) this.b;
                gj gjVar3 = (gj) this.c;
                TLRPC.Document F0 = gjVar3.F0();
                TLRPC.Document document = gjVar3.f3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 == null) {
                    return;
                }
                bfVar.d.put(w7.r(null, F0), gjVar3);
                w7.G(bfVar.a.a).W(F0, gjVar3, 3, gj.R5(gjVar3.k) ? 2 : 0);
                return;
            case 27:
                a();
                return;
            case 28:
                boolean[] zArr = (boolean[]) this.b;
                kh khVar = (kh) this.c;
                if (zArr[0]) {
                    return;
                }
                khVar.run();
                zArr[0] = true;
                return;
            default:
                si siVar = (si) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = siVar.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        siVar.L0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                        return;
                    }
                    g0.h3(new bg(siVar, tL_messages_stickerSet, i7));
                    return;
                } catch (Throwable th5) {
                    a8.g(th5, true);
                    return;
                }
        }
    }

    public /* synthetic */ x4(SparseArray sparseArray, Runnable runnable) {
        this.a = 17;
        this.c = sparseArray;
        this.b = runnable;
    }
}

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
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        ui uiVar = (ui) this.b;
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
        try {
            uiVar.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            uiVar.getMessagesStorage().b.beginTransaction();
            uiVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i7 = 0; i7 < tL_contacts_topPeers.categories.size(); i7++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i7);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                int i10 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, ij.B1(tL_topPeer.peer));
                    executeFast.bindInteger(2, i10);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            uiVar.getMessagesStorage().b.commitTransaction();
            g0.h3(new fg(uiVar, 6));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        BitmapDrawable bitmapDrawable;
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
        boolean z9 = true;
        z9 = true;
        z9 = true;
        z9 = true;
        int i7 = 0;
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
                ((w00) this.b).a((ArrayList) this.c);
                return;
            case 3:
                qp.s1(((x6) this.b).a).O3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 4:
                yr yrVar = (yr) this.b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.c;
                try {
                    try {
                        sQLitePreparedStatement = yrVar.b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
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
                boolean z10 = i7Var.y && ((boolean[]) this.c)[0];
                int i14 = i7Var.J;
                boolean z11 = i14 > 0 && i7Var.a0 >= ((long) i14) && i7Var.j && i7Var.W0 < 3;
                long j3 = i7Var.b0;
                if (j3 == 0 || !(z10 || i7Var.a0 == j3 || z11)) {
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
                        iz.h(i7Var2.L0);
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
                ls[] lsVarArr = (ls[]) this.c;
                w7Var.getNotificationCenter().n(lsVarArr[0], qs.U1);
                w7Var.getNotificationCenter().n(lsVarArr[0], qs.V1);
                return;
            case 8:
                w7 w7Var2 = (w7) this.b;
                w7Var2.getDownloadController().H.removeAll((ArrayList) this.c);
                w7Var2.getNotificationCenter().k(qs.b5, new Object[0]);
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
                    StackTraceElement[] stackTrace = th3.getStackTrace();
                    while (i7 < stackTrace.length) {
                        a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i7] + "\n");
                        i7++;
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
                    while (i7 < list.size()) {
                        f8Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((ci.b) list.get(i7)).a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                        i7++;
                    }
                } finally {
                    try {
                        return;
                    } finally {
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
                g0.h3(new x4(((gc) this.b).l(), (Runnable) this.c));
                return;
            case 16:
                gc gcVar = (gc) this.b;
                gcVar.B.add((xb) this.c);
                gcVar.U(null, 0);
                return;
            case 17:
                SparseArray sparseArray2 = (SparseArray) this.c;
                Runnable runnable = (Runnable) this.b;
                w7.K = sparseArray2;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 18:
                tb tbVar = (tb) this.b;
                String str5 = (String) this.c;
                ub ubVar = tbVar.a;
                gc gcVar2 = tbVar.e;
                bc bcVar = new bc(gcVar2, ubVar, str5);
                ubVar.t = bcVar;
                gcVar2.n.add(bcVar);
                gcVar2.V(false);
                return;
            case 19:
                vb vbVar = (vb) this.b;
                Drawable drawable2 = (Drawable) this.c;
                gc gcVar3 = vbVar.e;
                kb kbVar = gcVar3.e;
                ub ubVar2 = vbVar.c;
                if (drawable2 instanceof zg0) {
                    zg0 zg0Var = (zg0) drawable2;
                    Drawable drawable3 = (Drawable) kbVar.f(ubVar2.d);
                    if (drawable3 == null) {
                        kbVar.l(ubVar2.d, zg0Var);
                        drawable = zg0Var;
                    } else {
                        zg0Var.C(false);
                        drawable = drawable3;
                    }
                    gcVar3.H(ubVar2.d);
                    str = ubVar2.d;
                } else if (drawable2 instanceof org.telegram.ui.Components.u5) {
                    org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) drawable2;
                    if (u5Var.n0) {
                        String str6 = ubVar2.d;
                        ThreadLocal threadLocal = gc.I;
                        BitmapDrawable y10 = gcVar3.y(str6);
                        if (y10 == null) {
                            kbVar.l(ubVar2.d, u5Var);
                            bitmapDrawable = u5Var;
                        } else {
                            u5Var.u();
                            bitmapDrawable = y10;
                        }
                        gcVar3.H(ubVar2.d);
                        str = ubVar2.d;
                        drawable = bitmapDrawable;
                    }
                    String str7 = str2;
                    drawable = drawable2;
                    str = str7;
                } else if (drawable2 instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable2;
                    BitmapDrawable z12 = gcVar3.z(ubVar2.d);
                    if (z12 != null) {
                        g0.z2(bitmapDrawable2.getBitmap());
                        drawable2 = z12;
                    } else if (ubVar2.d.endsWith("_f")) {
                        gcVar3.d.l(ubVar2.d, bitmapDrawable2);
                        z9 = false;
                        drawable2 = bitmapDrawable2;
                    } else if (ubVar2.d.endsWith("_isc") || ubVar2.d.endsWith("_nocache") || bitmapDrawable2.getBitmap().getWidth() > g0.p * 80.0f || bitmapDrawable2.getBitmap().getHeight() > g0.p * 80.0f) {
                        drawable2 = bitmapDrawable2;
                        if (!ubVar2.d.endsWith("_nocache")) {
                            gcVar3.c.l(ubVar2.d, bitmapDrawable2);
                            drawable2 = bitmapDrawable2;
                        }
                    } else {
                        gcVar3.b.l(ubVar2.d, bitmapDrawable2);
                        drawable2 = bitmapDrawable2;
                    }
                    if (z9) {
                        gcVar3.H(ubVar2.d);
                        str2 = ubVar2.d;
                    }
                    String str72 = str2;
                    drawable = drawable2;
                    str = str72;
                } else {
                    str = null;
                }
                gcVar3.s.d(new ng(vbVar, drawable, str, 26), ubVar2.a);
                return;
            case 20:
                ((fc) this.b).d.v.remove((String) this.c);
                return;
            case 21:
                MediaController mediaController = (MediaController) this.b;
                ij ijVar = (ij) this.c;
                String[] strArr = MediaController.V1;
                mediaController.R(ijVar, true);
                return;
            case 22:
                MediaController mediaController2 = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.V1;
                try {
                    int i17 = mediaController2.k0 + 1;
                    mediaController2.k0 = i17;
                    t51 t51Var = mediaController2.j0;
                    if (t51Var != null) {
                        t51Var.m0();
                    }
                    t51 t51Var2 = new t51(false, false);
                    mediaController2.j0 = t51Var2;
                    t51Var2.J = new f5.u(mediaController2, i17, 10);
                    t51Var2.j0(Uri.fromFile(file), "other");
                    mediaController2.j0.x0(3);
                    mediaController2.j0.h0();
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    t51 t51Var3 = mediaController2.j0;
                    if (t51Var3 != null) {
                        t51Var3.m0();
                        mediaController2.j0 = null;
                        return;
                    }
                    return;
                }
            case 23:
                c cVar = (c) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String[] strArr3 = MediaController.V1;
                w7.G(cVar.a).W(tL_document, null, 1, 1);
                return;
            case 24:
                ((MediaController) ((m.f3) this.b).b).x1.add((ByteBuffer) this.c);
                return;
            case 25:
                jg.q1 q1Var = (jg.q1) this.b;
                ij ijVar2 = (ij) this.c;
                MediaController mediaController3 = (MediaController) q1Var.c;
                t51 t51Var4 = mediaController3.i0;
                if ((t51Var4 == null && mediaController3.E0 == null) || mediaController3.g0) {
                    return;
                }
                try {
                    t51 t51Var5 = mediaController3.E0;
                    if (t51Var5 != null) {
                        U = t51Var5.U();
                        S = ((MediaController) q1Var.c).E0.S();
                        if (S >= 0 && U > 0) {
                            float f11 = U;
                            K = ((MediaController) q1Var.c).E0.K() / f11;
                            f10 = S / f11;
                            if (f10 >= 1.0f) {
                                return;
                            }
                        }
                        return;
                    }
                    U = t51Var4.U();
                    S = ((MediaController) q1Var.c).i0.S();
                    f10 = U >= 0 ? S / U : 0.0f;
                    K = ((MediaController) q1Var.c).i0.K() / U;
                    if (U == -9223372036854775807L) {
                        return;
                    }
                    if (S < 0) {
                        return;
                    }
                    if (((MediaController) q1Var.c).t0 != 0.0f) {
                        return;
                    }
                    MediaController mediaController4 = (MediaController) q1Var.c;
                    ijVar2.h0 = (int) (U / 1000);
                    ijVar2.b0 = f10;
                    ijVar2.g0 = (int) (S / 1000);
                    ijVar2.e0 = K;
                    if (f10 >= 0.0f && mediaController4.n0 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        MediaController mediaController5 = (MediaController) q1Var.c;
                        if (elapsedRealtime - mediaController5.o0 >= 1000) {
                            String str8 = mediaController5.n0;
                            mediaController5.o0 = SystemClock.elapsedRealtime();
                            Utilities.e.c(new ve(str8, i7, f10));
                        }
                    }
                    qs.f(ijVar2.I1).k(qs.e2, Integer.valueOf(ijVar2.e1()), Float.valueOf(f10));
                    return;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    return;
                }
            case 26:
                cf cfVar = (cf) this.b;
                ij ijVar3 = (ij) this.c;
                TLRPC.Document F0 = ijVar3.F0();
                TLRPC.Document document = ijVar3.d3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 == null) {
                    return;
                }
                cfVar.d.put(w7.r(null, F0), ijVar3);
                w7.G(cfVar.a.a).W(F0, ijVar3, 3, ij.R5(ijVar3.k) ? 2 : 0);
                return;
            case 27:
                a();
                return;
            case 28:
                boolean[] zArr = (boolean[]) this.b;
                mh mhVar = (mh) this.c;
                if (zArr[0]) {
                    return;
                }
                mhVar.run();
                zArr[0] = true;
                return;
            default:
                ui uiVar = (ui) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = uiVar.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        uiVar.L0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                        return;
                    }
                    g0.h3(new cg(uiVar, tL_messages_stickerSet, z9 ? 1 : 0));
                    return;
                } catch (Throwable th4) {
                    a8.g(th4, true);
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

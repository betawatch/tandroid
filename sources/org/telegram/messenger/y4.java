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
import org.telegram.ui.Components.m51;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y4(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        li liVar = (li) this.b;
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
        try {
            liVar.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            liVar.getMessagesStorage().b.beginTransaction();
            liVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = liVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i3 = 0; i3 < tL_contacts_topPeers.categories.size(); i3++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i3);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                int i10 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, zi.C1(tL_topPeer.peer));
                    executeFast.bindInteger(2, i10);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            liVar.getMessagesStorage().b.commitTransaction();
            g0.h3(new xf(liVar, 6));
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
        boolean z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        int i3 = 0;
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
                ((o00) this.b).a((ArrayList) this.c);
                return;
            case 3:
                hp.s1(((x6) this.b).a).O3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 4:
                qr qrVar = (qr) this.b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.c;
                try {
                    try {
                        sQLitePreparedStatement = qrVar.b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
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
                boolean z11 = i7Var.y && ((boolean[]) this.c)[0];
                int i14 = i7Var.J;
                boolean z12 = i14 > 0 && i7Var.a0 >= ((long) i14) && i7Var.j && i7Var.W0 < 3;
                long j10 = i7Var.b0;
                if (j10 == 0 || !(z11 || i7Var.a0 == j10 || z12)) {
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
                        az.h(i7Var2.L0);
                    }
                }
                if (i7Var2.S0 == null) {
                    return;
                }
                int size = arrayList.size();
                int i15 = (size * 16) + 4;
                cg.c0 c0Var = i7.l1;
                if (c0Var == null) {
                    i7.l1 = new cg.c0(i15);
                } else {
                    c0Var.b();
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
                cs[] csVarArr = (cs[]) this.c;
                w7Var.getNotificationCenter().n(csVarArr[0], hs.U1);
                w7Var.getNotificationCenter().n(csVarArr[0], hs.V1);
                return;
            case 8:
                w7 w7Var2 = (w7) this.b;
                w7Var2.getDownloadController().I.removeAll((ArrayList) this.c);
                w7Var2.getNotificationCenter().k(hs.b5, new Object[0]);
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
                mg.f fVar = (mg.f) this.c;
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
                    while (i3 < stackTrace.length) {
                        a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i3] + "\n");
                        i3++;
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
                    while (i3 < list.size()) {
                        f8Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((di.b) list.get(i3)).a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                        i3++;
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
                g0.h3(new y4(((zb) this.b).l(), (Runnable) this.c));
                return;
            case 16:
                zb zbVar = (zb) this.b;
                zbVar.B.add((qb) this.c);
                zbVar.U(null, 0);
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
                mb mbVar = (mb) this.b;
                String str5 = (String) this.c;
                nb nbVar = mbVar.a;
                zb zbVar2 = mbVar.e;
                ub ubVar = new ub(zbVar2, nbVar, str5);
                nbVar.t = ubVar;
                zbVar2.n.add(ubVar);
                zbVar2.V(false);
                return;
            case 19:
                ob obVar = (ob) this.b;
                Drawable drawable2 = (Drawable) this.c;
                zb zbVar3 = obVar.e;
                db dbVar = zbVar3.e;
                nb nbVar2 = obVar.c;
                if (drawable2 instanceof ch0) {
                    ch0 ch0Var = (ch0) drawable2;
                    Drawable drawable3 = (Drawable) dbVar.f(nbVar2.d);
                    if (drawable3 == null) {
                        dbVar.l(nbVar2.d, ch0Var);
                        drawable = ch0Var;
                    } else {
                        ch0Var.C(false);
                        drawable = drawable3;
                    }
                    zbVar3.H(nbVar2.d);
                    str = nbVar2.d;
                } else if (drawable2 instanceof org.telegram.ui.Components.t5) {
                    org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) drawable2;
                    if (t5Var.o0) {
                        String str6 = nbVar2.d;
                        ThreadLocal threadLocal = zb.I;
                        BitmapDrawable y9 = zbVar3.y(str6);
                        if (y9 == null) {
                            dbVar.l(nbVar2.d, t5Var);
                            bitmapDrawable = t5Var;
                        } else {
                            t5Var.u();
                            bitmapDrawable = y9;
                        }
                        zbVar3.H(nbVar2.d);
                        str = nbVar2.d;
                        drawable = bitmapDrawable;
                    }
                    String str7 = str2;
                    drawable = drawable2;
                    str = str7;
                } else if (drawable2 instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable2;
                    BitmapDrawable z13 = zbVar3.z(nbVar2.d);
                    if (z13 != null) {
                        g0.z2(bitmapDrawable2.getBitmap());
                        drawable2 = z13;
                    } else if (nbVar2.d.endsWith("_f")) {
                        zbVar3.d.l(nbVar2.d, bitmapDrawable2);
                        z10 = false;
                        drawable2 = bitmapDrawable2;
                    } else if (nbVar2.d.endsWith("_isc") || nbVar2.d.endsWith("_nocache") || bitmapDrawable2.getBitmap().getWidth() > g0.p * 80.0f || bitmapDrawable2.getBitmap().getHeight() > g0.p * 80.0f) {
                        drawable2 = bitmapDrawable2;
                        if (!nbVar2.d.endsWith("_nocache")) {
                            zbVar3.c.l(nbVar2.d, bitmapDrawable2);
                            drawable2 = bitmapDrawable2;
                        }
                    } else {
                        zbVar3.b.l(nbVar2.d, bitmapDrawable2);
                        drawable2 = bitmapDrawable2;
                    }
                    if (z10) {
                        zbVar3.H(nbVar2.d);
                        str2 = nbVar2.d;
                    }
                    String str72 = str2;
                    drawable = drawable2;
                    str = str72;
                } else {
                    str = null;
                }
                zbVar3.s.e(new fg(obVar, drawable, str, 26), nbVar2.a);
                return;
            case 20:
                ((yb) this.b).d.v.remove((String) this.c);
                return;
            case 21:
                MediaController mediaController = (MediaController) this.b;
                zi ziVar = (zi) this.c;
                String[] strArr = MediaController.W1;
                mediaController.R(ziVar, true);
                return;
            case 22:
                MediaController mediaController2 = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.W1;
                try {
                    int i17 = mediaController2.l0 + 1;
                    mediaController2.l0 = i17;
                    m51 m51Var = mediaController2.k0;
                    if (m51Var != null) {
                        m51Var.m0();
                    }
                    m51 m51Var2 = new m51(false, false);
                    mediaController2.k0 = m51Var2;
                    m51Var2.K = new e5.u(mediaController2, i17, 14);
                    m51Var2.j0(Uri.fromFile(file), "other");
                    mediaController2.k0.x0(3);
                    mediaController2.k0.h0();
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    m51 m51Var3 = mediaController2.k0;
                    if (m51Var3 != null) {
                        m51Var3.m0();
                        mediaController2.k0 = null;
                        return;
                    }
                    return;
                }
            case 23:
                c cVar = (c) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String[] strArr3 = MediaController.W1;
                w7.G(cVar.a).X(tL_document, null, 1, 1);
                return;
            case 24:
                ((MediaController) ((mi.b0) this.b).b).y1.add((ByteBuffer) this.c);
                return;
            case 25:
                kg.m1 m1Var = (kg.m1) this.b;
                zi ziVar2 = (zi) this.c;
                MediaController mediaController3 = (MediaController) m1Var.c;
                m51 m51Var4 = mediaController3.j0;
                if ((m51Var4 == null && mediaController3.F0 == null) || mediaController3.h0) {
                    return;
                }
                try {
                    m51 m51Var5 = mediaController3.F0;
                    if (m51Var5 != null) {
                        U = m51Var5.U();
                        S = ((MediaController) m1Var.c).F0.S();
                        if (S >= 0 && U > 0) {
                            float f11 = U;
                            K = ((MediaController) m1Var.c).F0.K() / f11;
                            f10 = S / f11;
                            if (f10 >= 1.0f) {
                                return;
                            }
                        }
                        return;
                    }
                    U = m51Var4.U();
                    S = ((MediaController) m1Var.c).j0.S();
                    f10 = U >= 0 ? S / U : 0.0f;
                    K = ((MediaController) m1Var.c).j0.K() / U;
                    if (U == -9223372036854775807L) {
                        return;
                    }
                    if (S < 0) {
                        return;
                    }
                    if (((MediaController) m1Var.c).u0 != 0.0f) {
                        return;
                    }
                    MediaController mediaController4 = (MediaController) m1Var.c;
                    ziVar2.h0 = (int) (U / 1000);
                    ziVar2.b0 = f10;
                    ziVar2.g0 = (int) (S / 1000);
                    ziVar2.e0 = K;
                    if (f10 >= 0.0f && mediaController4.o0 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        MediaController mediaController5 = (MediaController) m1Var.c;
                        if (elapsedRealtime - mediaController5.p0 >= 1000) {
                            String str8 = mediaController5.o0;
                            mediaController5.p0 = SystemClock.elapsedRealtime();
                            Utilities.e.c(new oe(str8, i3, f10));
                        }
                    }
                    hs.f(ziVar2.I1).k(hs.e2, Integer.valueOf(ziVar2.f1()), Float.valueOf(f10));
                    return;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    return;
                }
            case 26:
                ve veVar = (ve) this.b;
                zi ziVar3 = (zi) this.c;
                TLRPC.Document F0 = ziVar3.F0();
                TLRPC.Document document = ziVar3.d3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 == null) {
                    return;
                }
                veVar.d.put(w7.r(null, F0), ziVar3);
                w7.G(veVar.a.a).X(F0, ziVar3, 3, zi.S5(ziVar3.k) ? 2 : 0);
                return;
            case 27:
                a();
                return;
            case 28:
                boolean[] zArr = (boolean[]) this.b;
                dh dhVar = (dh) this.c;
                if (zArr[0]) {
                    return;
                }
                dhVar.run();
                zArr[0] = true;
                return;
            default:
                li liVar = (li) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = liVar.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        liVar.L0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                        return;
                    }
                    g0.h3(new uf(liVar, tL_messages_stickerSet, z10 ? 1 : 0));
                    return;
                } catch (Throwable th4) {
                    a8.g(th4, true);
                    return;
                }
        }
    }

    public /* synthetic */ y4(SparseArray sparseArray, Runnable runnable) {
        this.a = 17;
        this.c = sparseArray;
        this.b = runnable;
    }
}

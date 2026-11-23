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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        ri riVar = (ri) this.b;
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
        try {
            riVar.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            riVar.getMessagesStorage().b.beginTransaction();
            riVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i7 = 0; i7 < tL_contacts_topPeers.categories.size(); i7++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i7);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                int i10 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, fj.B1(tL_topPeer.peer));
                    executeFast.bindInteger(2, i10);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            riVar.getMessagesStorage().b.commitTransaction();
            g0.g3(new eg(riVar, 7));
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
                i5 i5Var = (i5) this.b;
                SparseArray sparseArray = (SparseArray) this.c;
                if (i5Var.s) {
                    return;
                }
                i5Var.s = true;
                HashMap hashMap = new HashMap();
                HashMap H = i5Var.H();
                HashMap hashMap2 = new HashMap();
                Iterator it = H.entrySet().iterator();
                while (it.hasNext()) {
                    f5 f5Var = (f5) ((Map.Entry) it.next()).getValue();
                    for (int i10 = 0; i10 < f5Var.g.size(); i10++) {
                        hashMap2.put((String) f5Var.g.get(i10), f5Var.b);
                    }
                }
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    f5 f5Var2 = (f5) sparseArray.valueAt(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= f5Var2.g.size()) {
                            break;
                        }
                        String str3 = (String) hashMap2.get((String) f5Var2.g.get(i12));
                        if (str3 != null) {
                            f5Var2.b = str3;
                            hashMap.put(str3, f5Var2);
                        } else {
                            i12++;
                        }
                    }
                }
                if (s2.a) {
                    a8.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
                }
                i5Var.getMessagesStorage().Z0(hashMap, true, false);
                return;
            case 1:
                s5 s5Var = (s5) this.b;
                r5 r5Var = (r5) this.c;
                s5Var.g--;
                SparseIntArray sparseIntArray = s5Var.b;
                int i13 = sparseIntArray.get(r5Var.index) - 1;
                if (i13 != 0) {
                    sparseIntArray.put(r5Var.index, i13);
                    return;
                }
                sparseIntArray.delete(r5Var.index);
                s5Var.c.remove(r5Var);
                s5Var.a.add(r5Var);
                return;
            case 2:
                ((p00) this.b).a((ArrayList) this.c);
                return;
            case 3:
                mp.u1(((x6) this.b).a).V3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 4:
                tr trVar = (tr) this.b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.c;
                try {
                    try {
                        sQLitePreparedStatement = trVar.b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
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
                        bz.h(i7Var2.L0);
                    }
                }
                if (i7Var2.S0 == null) {
                    return;
                }
                int size = arrayList.size();
                int i15 = (size * 16) + 4;
                bg.e0 e0Var = i7.l1;
                if (e0Var == null) {
                    i7.l1 = new bg.e0(i15);
                } else {
                    e0Var.b();
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
                fs[] fsVarArr = (fs[]) this.c;
                w7Var.getNotificationCenter().n(fsVarArr[0], ks.U1);
                w7Var.getNotificationCenter().n(fsVarArr[0], ks.V1);
                return;
            case 8:
                w7 w7Var2 = (w7) this.b;
                w7Var2.getDownloadController().I.removeAll((ArrayList) this.c);
                w7Var2.getNotificationCenter().k(ks.e5, new Object[0]);
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
                e8 e8Var = (e8) this.b;
                List list = (List) this.c;
                e8Var.getClass();
                try {
                    e8Var.c();
                    e8Var.c.beginTransaction();
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        e8Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((ei.b) list.get(i17)).a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                    }
                } catch (Throwable th4) {
                    try {
                        a8.g(th4, true);
                    } finally {
                        e8Var.c.commitTransaction();
                    }
                }
                return;
            case 13:
                ((q8) this.b).getMessagesController().e4((TLRPC.User) this.c, false, false);
                return;
            case 14:
                ((q8) this.b).getMediaDataController().U1((TLRPC.TL_messages_stickerSet) this.c);
                return;
            case 15:
                g0.g3(new z4(((ec) this.b).l(), (Runnable) this.c));
                return;
            case 16:
                ec ecVar = (ec) this.b;
                ecVar.B.add((vb) this.c);
                ecVar.U(null, 0);
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
                rb rbVar = (rb) this.b;
                String str5 = (String) this.c;
                sb sbVar = rbVar.a;
                ec ecVar2 = rbVar.e;
                zb zbVar = new zb(ecVar2, sbVar, str5);
                sbVar.t = zbVar;
                ecVar2.n.add(zbVar);
                ecVar2.V(false);
                return;
            case 19:
                tb tbVar = (tb) this.b;
                Drawable drawable2 = (Drawable) this.c;
                ec ecVar3 = tbVar.e;
                ib ibVar = ecVar3.e;
                sb sbVar2 = tbVar.c;
                if (drawable2 instanceof nh0) {
                    nh0 nh0Var = (nh0) drawable2;
                    Drawable drawable3 = (Drawable) ibVar.f(sbVar2.d);
                    if (drawable3 == null) {
                        ibVar.l(sbVar2.d, nh0Var);
                        drawable = nh0Var;
                    } else {
                        nh0Var.C(false);
                        drawable = drawable3;
                    }
                    ecVar3.H(sbVar2.d);
                    str = sbVar2.d;
                } else if (drawable2 instanceof org.telegram.ui.Components.b6) {
                    org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) drawable2;
                    if (b6Var.o0) {
                        String str6 = sbVar2.d;
                        ThreadLocal threadLocal = ec.I;
                        BitmapDrawable y10 = ecVar3.y(str6);
                        if (y10 == null) {
                            ibVar.l(sbVar2.d, b6Var);
                            bitmapDrawable2 = b6Var;
                        } else {
                            b6Var.u();
                            bitmapDrawable2 = y10;
                        }
                        ecVar3.H(sbVar2.d);
                        str = sbVar2.d;
                        drawable = bitmapDrawable2;
                    }
                    String str7 = str2;
                    drawable = drawable2;
                    str = str7;
                } else if (drawable2 instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable3 = (BitmapDrawable) drawable2;
                    BitmapDrawable z14 = ecVar3.z(sbVar2.d);
                    if (z14 != null) {
                        g0.z2(bitmapDrawable3.getBitmap());
                        bitmapDrawable = z14;
                    } else if (sbVar2.d.endsWith("_f")) {
                        ecVar3.d.l(sbVar2.d, bitmapDrawable3);
                        z10 = false;
                        drawable2 = bitmapDrawable3;
                        if (z10) {
                            ecVar3.H(sbVar2.d);
                            str2 = sbVar2.d;
                        }
                        String str72 = str2;
                        drawable = drawable2;
                        str = str72;
                    } else if (sbVar2.d.endsWith("_isc") || sbVar2.d.endsWith("_nocache") || bitmapDrawable3.getBitmap().getWidth() > g0.p * 80.0f || bitmapDrawable3.getBitmap().getHeight() > g0.p * 80.0f) {
                        bitmapDrawable = bitmapDrawable3;
                        if (!sbVar2.d.endsWith("_nocache")) {
                            ecVar3.c.l(sbVar2.d, bitmapDrawable3);
                            bitmapDrawable = bitmapDrawable3;
                        }
                    } else {
                        ecVar3.b.l(sbVar2.d, bitmapDrawable3);
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
                ecVar3.s.d(new yf(tbVar, drawable, str, 26), sbVar2.a);
                return;
            case 20:
                ((dc) this.b).d.v.remove((String) this.c);
                return;
            case 21:
                MediaController mediaController = (MediaController) this.b;
                fj fjVar = (fj) this.c;
                String[] strArr = MediaController.W1;
                mediaController.R(fjVar, true);
                return;
            case 22:
                MediaController mediaController2 = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.W1;
                try {
                    int i18 = mediaController2.l0 + 1;
                    mediaController2.l0 = i18;
                    h61 h61Var = mediaController2.k0;
                    if (h61Var != null) {
                        h61Var.m0();
                    }
                    h61 h61Var2 = new h61(false, false);
                    mediaController2.k0 = h61Var2;
                    h61Var2.K = new b3.j(mediaController2, i18, 8);
                    h61Var2.j0(Uri.fromFile(file), "other");
                    mediaController2.k0.x0(3);
                    mediaController2.k0.h0();
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    h61 h61Var3 = mediaController2.k0;
                    if (h61Var3 != null) {
                        h61Var3.m0();
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
                ((MediaController) ((i6.g) this.b).b).y1.add((ByteBuffer) this.c);
                return;
            case 25:
                jg.q1 q1Var = (jg.q1) this.b;
                fj fjVar2 = (fj) this.c;
                MediaController mediaController3 = (MediaController) q1Var.c;
                h61 h61Var4 = mediaController3.j0;
                if ((h61Var4 == null && mediaController3.F0 == null) || mediaController3.h0) {
                    return;
                }
                try {
                    h61 h61Var5 = mediaController3.F0;
                    if (h61Var5 != null) {
                        U = h61Var5.U();
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
                    U = h61Var4.U();
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
                        fjVar2.j0 = (int) (U / 1000);
                        fjVar2.b0 = f10;
                        fjVar2.i0 = (int) (S / 1000);
                        fjVar2.e0 = S;
                        fjVar2.f0 = U;
                        fjVar2.g0 = K;
                        if (f10 >= 0.0f && mediaController4.o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController5 = (MediaController) q1Var.c;
                            if (elapsedRealtime - mediaController5.p0 >= 1000) {
                                String str8 = mediaController5.o0;
                                mediaController5.p0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new te(str8, 0, f10));
                            }
                        }
                        ks.f(fjVar2.K1).k(ks.e2, Integer.valueOf(fjVar2.e1()), Float.valueOf(f10));
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
                af afVar = (af) this.b;
                fj fjVar3 = (fj) this.c;
                TLRPC.Document F0 = fjVar3.F0();
                TLRPC.Document document = fjVar3.f3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 == null) {
                    return;
                }
                afVar.d.put(w7.r(null, F0), fjVar3);
                w7.G(afVar.a.a).W(F0, fjVar3, 3, fj.R5(fjVar3.k) ? 2 : 0);
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
                ri riVar = (ri) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = riVar.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        riVar.O0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                        return;
                    }
                    g0.g3(new cg(riVar, tL_messages_stickerSet, i7));
                    return;
                } catch (Throwable th5) {
                    a8.g(th5, true);
                    return;
                }
        }
    }

    public /* synthetic */ z4(SparseArray sparseArray, Runnable runnable) {
        this.a = 17;
        this.c = sparseArray;
        this.b = runnable;
    }
}

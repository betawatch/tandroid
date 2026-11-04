package ii;

import android.graphics.SurfaceTexture;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.view.View;
import b8.zb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.r31;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i3;
        long j10;
        boolean z10;
        int i10;
        TLRPC.Message message;
        r10 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = null;
        r10 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i11 = 0;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                k kVar = (k) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.b;
                if (userFull != null) {
                    kVar.Z = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.b0 = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.Z = true;
                        kVar.b0 = kVar.I0();
                        kVar.a0 = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.a0 = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.b0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.K0(true);
                return;
            case 1:
                a3 a3Var = (a3) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.b;
                a3Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                a3Var.k(botappsettings, true);
                return;
            case 2:
                a3 a3Var2 = (a3) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (a3Var2.e0) {
                    return;
                }
                if (tL_error != null) {
                    a3Var2.o(false);
                    return;
                } else {
                    org.telegram.messenger.g0.i3(a3Var2.v0, 60000L);
                    return;
                }
            case 3:
                a3 a3Var3 = (a3) this.c;
                ac Q = new fc(a3Var3.r0, a3Var3.G).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.X2((String) this.b));
                Q.j = 5000;
                Q.k(true);
                return;
            case 4:
                q3 q3Var = (q3) this.c;
                q3Var.getMessagesController().x3(null, (TLRPC.User) this.b, null, q3Var.getClassGuid(), null, false, false);
                return;
            case 5:
                q3 q3Var2 = (q3) this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                q3Var2.getClass();
                q3Var2.presentFragment(wm.ra(connectedbotstarref.bot_id));
                return;
            case 6:
                d4 d4Var = (d4) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (d4Var.U) {
                    return;
                }
                if (tL_error2 != null) {
                    d4Var.b.dismiss();
                    return;
                } else {
                    org.telegram.messenger.g0.i3(d4Var.V, 60000L);
                    return;
                }
            case 7:
                d4 d4Var2 = (d4) this.c;
                ac Q2 = new fc(d4Var2.b.c, d4Var2.a).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.X2((String) this.b));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 8:
                ji.q qVar = (ji.q) this.c;
                ki.f fVar = (ki.f) this.b;
                qVar.getClass();
                qVar.presentFragment(wm.ra(fVar.b.id));
                return;
            case 9:
                ((ji.b0) this.c).r1.presentFragment(wm.ra(((ki.f) this.b).b.id));
                return;
            case 10:
                k2.i0 i0Var = (k2.i0) this.c;
                k2.o0 o0Var = (k2.o0) this.b;
                int i12 = i0Var.J - o0Var.b;
                i0Var.J = i12;
                if (o0Var.d) {
                    i0Var.K = o0Var.e;
                    i0Var.L = true;
                }
                if (i12 == 0) {
                    d2.n1 n1Var = ((k2.j1) o0Var.f).a;
                    int i13 = -1;
                    if (!i0Var.p0.a.p() && n1Var.p()) {
                        i0Var.q0 = -1;
                        i0Var.r0 = 0L;
                    }
                    if (!n1Var.p()) {
                        List asList = Arrays.asList(((k2.o1) n1Var).l);
                        zb.p(asList.size() == i0Var.p.size());
                        for (int i14 = 0; i14 < asList.size(); i14++) {
                            ((k2.e0) i0Var.p.get(i14)).c = (d2.n1) asList.get(i14);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (i0Var.L) {
                        Object[] objArr = ((k2.j1) o0Var.f).a.p() && i0Var.p0.a.p();
                        boolean equals = ((k2.j1) o0Var.f).b.equals(i0Var.p0.b);
                        Object[] objArr2 = ((k2.j1) o0Var.f).d == i0Var.p0.s;
                        if (objArr != false || (equals && objArr2 != false)) {
                            z11 = false;
                        }
                        if (z11) {
                            i13 = i0Var.l0();
                            if (n1Var.p() || ((k2.j1) o0Var.f).b.b()) {
                                j11 = ((k2.j1) o0Var.f).d;
                            } else {
                                k2.j1 j1Var = (k2.j1) o0Var.f;
                                w2.g0 g0Var = j1Var.b;
                                long j12 = j1Var.d;
                                Object obj = g0Var.a;
                                d2.k1 k1Var = i0Var.o;
                                n1Var.g(obj, k1Var);
                                j11 = j12 + k1Var.e;
                            }
                        }
                        i3 = i13;
                        j10 = j11;
                        z10 = z11;
                    } else {
                        i3 = -1;
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    i0Var.L = false;
                    i0Var.D1((k2.j1) o0Var.f, 1, z10, i0Var.K, j10, i3, false);
                    return;
                }
                return;
            case 11:
                k2.c0 c0Var = (k2.c0) this.c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.b;
                ArrayList arrayList2 = c0Var.a.t0;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((m51) ((d2.z1) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 12:
                kg.e0 e0Var = (kg.e0) this.c;
                View view = (View) this.b;
                e0Var.n0 = false;
                e0Var.p0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 13:
                kg.e0 e0Var2 = (kg.e0) this.c;
                TLObject tLObject = (TLObject) this.b;
                int i15 = e0Var2.t0;
                ArrayList arrayList3 = e0Var2.L;
                e0Var2.T = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    arrayList3.clear();
                    e0Var2.f();
                    return;
                }
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    hp.s1(i15).Y3(tL_contacts_sponsoredPeers.users, true);
                    hp.s1(i15).S3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList3.addAll(tL_contacts_sponsoredPeers.peers);
                    e0Var2.f();
                    return;
                }
                return;
            case 14:
                kg.e0 e0Var3 = (kg.e0) this.c;
                StringBuilder sb2 = (StringBuilder) this.b;
                e0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    qr.a0(e0Var3.t0).b.executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 15:
                kg.o1 o1Var = (kg.o1) this.c;
                String str = (String) this.b;
                o1Var.J = str;
                if (o1Var.r) {
                    o1Var.f.g(str, true, false, o1Var.s, o1Var.w, o1Var.y, o1Var.x, -1, 1);
                }
                int i16 = h10.t0;
                ArrayList arrayList4 = new ArrayList(g5.r(i16).f0);
                o1Var.E = true;
                int i17 = o1Var.G;
                o1Var.G = i17 + 1;
                o1Var.F = i17;
                o1Var.f();
                Utilities.g.c(new j4(o1Var, str, i17, arrayList4, i16, 1));
                return;
            case 16:
                kg.v1 v1Var = (kg.v1) this.c;
                ArrayList arrayList5 = (ArrayList) this.b;
                int i18 = v1Var.m;
                try {
                    qr.a0(i18).b.beginTransaction();
                    SQLitePreparedStatement executeFast = qr.a0(i18).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i11 < arrayList5.size() && i11 != 100) {
                            kg.t1 t1Var = (kg.t1) arrayList5.get(i11);
                            executeFast.requery();
                            executeFast.bindString(1, t1Var.a);
                            executeFast.bindInteger(2, t1Var.b);
                            executeFast.step();
                            i11++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList5.size() > 100) {
                        SQLitePreparedStatement executeFast2 = qr.a0(i18).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList5.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((kg.t1) arrayList5.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    qr.a0(i18).b.commitTransaction();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 17:
                ((l2.i) this.c).d.reportTrackChangeEvent((TrackChangeEvent) this.b);
                return;
            case 18:
                ((l2.i) this.c).d.reportNetworkEvent((NetworkEvent) this.b);
                return;
            case 19:
                ((l2.i) this.c).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.b);
                return;
            case 20:
                ((l2.i) this.c).d.reportPlaybackMetrics((PlaybackMetrics) this.b);
                return;
            case 21:
                ((l2.i) this.c).d.reportPlaybackStateEvent((PlaybackStateEvent) this.b);
                return;
            case 22:
                lg.f fVar2 = (lg.f) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                fVar2.e = false;
                TL_account.connectedBots connectedbots = tLObject2 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject2 : null;
                fVar2.c = connectedbots;
                if (connectedbots != null) {
                    hp.s1(fVar2.a).Y3(fVar2.c.users, false);
                }
                fVar2.b = System.currentTimeMillis();
                fVar2.f = true;
                fVar2.d();
                return;
            case 23:
                lg.j0 j0Var = (lg.j0) this.c;
                org.telegram.ui.Components.o2 o2Var = (org.telegram.ui.Components.o2) this.b;
                lg.f.a(j0Var.a).b();
                o2Var.run();
                j0Var.dismiss();
                return;
            case 24:
                hp.s1(((lg.r0) this.c).currentAccount).O3((TLRPC.Updates) ((TLObject) this.b), false);
                return;
            case 25:
                lg.d1 d1Var = (lg.d1) this.c;
                r31 r31Var = (r31) this.b;
                d1Var.getClass();
                d1Var.c0(r31Var.d);
                return;
            case 26:
                qr qrVar = (qr) this.c;
                lg.t1 t1Var2 = (lg.t1) this.b;
                try {
                    try {
                        sQLitePreparedStatement2 = qrVar.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, t1Var2.a);
                        sQLitePreparedStatement2.bindString(2, t1Var2.b);
                        sQLitePreparedStatement2.bindInteger(3, t1Var2.c);
                        sQLitePreparedStatement2.bindInteger(4, t1Var2.f);
                        sQLitePreparedStatement2.step();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 27:
                lg.u1 u1Var = (lg.u1) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                ArrayList arrayList6 = u1Var.b;
                int i19 = u1Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject3;
                    hp.s1(i19).Y3(tL_messages_quickReplies.users, false);
                    hp.s1(i19).S3(tL_messages_quickReplies.chats, false);
                    qr.a0(i19).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i20 = 0; i20 < tL_messages_quickReplies.quick_replies.size(); i20++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i20);
                        lg.t1 t1Var3 = new lg.t1();
                        t1Var3.a = tL_quickReply.shortcut_id;
                        t1Var3.b = tL_quickReply.shortcut;
                        t1Var3.f = tL_quickReply.count;
                        t1Var3.d = tL_quickReply.top_message;
                        t1Var3.c = i20;
                        int i21 = 0;
                        while (true) {
                            if (i21 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i21);
                                if (message.id != tL_quickReply.top_message) {
                                    i21++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            zi ziVar = new zi(i19, message, false, true);
                            t1Var3.e = ziVar;
                            ziVar.r0(false);
                            t1Var3.e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList7.add(t1Var3);
                    }
                    arrayList = arrayList7;
                }
                u1Var.e = false;
                if (arrayList != null) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList);
                }
                u1Var.f = true;
                u1Var.l();
                hs.f(i19).k(hs.F1, new Object[0]);
                return;
            case 28:
                lg.u1 u1Var2 = (lg.u1) this.c;
                qr qrVar2 = (qr) this.b;
                ArrayList arrayList8 = u1Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = qrVar2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i11 < arrayList8.size()) {
                            lg.t1 t1Var4 = (lg.t1) arrayList8.get(i11);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, t1Var4.a);
                            sQLitePreparedStatement.bindString(2, t1Var4.b);
                            sQLitePreparedStatement.bindInteger(3, t1Var4.c);
                            sQLitePreparedStatement.bindInteger(4, t1Var4.f);
                            sQLitePreparedStatement.step();
                            i11++;
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Throwable th3) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th3;
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            default:
                m2.t tVar = (m2.t) this.c;
                String str2 = (String) this.b;
                m2.u uVar = (m2.u) tVar.c;
                String str3 = g2.n0.a;
                l2.f fVar3 = ((k2.c0) uVar).a.s;
                l2.a U = fVar3.U();
                fVar3.V(U, 1012, new l2.d(U, str2, 1));
                return;
        }
    }
}

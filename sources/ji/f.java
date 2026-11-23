package ji;

import a8.ma;
import android.graphics.SurfaceTexture;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.util.Log;
import e2.i1;
import e2.l1;
import h2.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kg.e1;
import kg.k0;
import kg.s0;
import kg.v1;
import kg.w1;
import ki.i3;
import ki.t2;
import ki.t3;
import l2.a0;
import l2.c0;
import l2.h1;
import l2.m0;
import l2.m1;
import n2.d0;
import n2.s;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.ao0;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i7;
        boolean z10;
        long j3;
        long j10;
        r11 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = null;
        r11 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i10 = 0;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                n nVar = (n) this.b;
                e eVar = (e) this.c;
                if (nVar.c == 0 && nVar.K == eVar && eVar.R) {
                    eVar.R = false;
                    eVar.f0 = -1;
                    eVar.invalidate();
                    return;
                }
                return;
            case 1:
                n nVar2 = (n) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (nVar2.X == editTextBoldCursor) {
                    g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                n nVar3 = (n) this.b;
                String str = (String) this.c;
                nVar3.i0 = false;
                if (nVar3.c == 0) {
                    e eVar2 = nVar3.K;
                    if (eVar2 != null) {
                        eVar2.setBusy(false);
                        return;
                    }
                    return;
                }
                if (str == null || str.trim().isEmpty()) {
                    Log.d("VoiceLive", "field: style failed");
                    e eVar3 = nVar3.K;
                    if (eVar3 != null) {
                        eVar3.setBusy(false);
                        return;
                    }
                    return;
                }
                nVar3.e0 = str.trim();
                nVar3.f0 = nVar3.c().size();
                e eVar4 = nVar3.K;
                if (eVar4 != null) {
                    eVar4.setRevertShown(true);
                    nVar3.K.setRebuildNext(true);
                }
                nVar3.m();
                e eVar5 = nVar3.K;
                if (eVar5 != null) {
                    eVar5.setRebuildNext(false);
                    nVar3.K.setBusy(false);
                    return;
                }
                return;
            case 3:
                kg.f fVar = (kg.f) this.b;
                TLObject tLObject = (TLObject) this.c;
                fVar.e = false;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                fVar.c = connectedbots;
                if (connectedbots != null) {
                    mp.u1(fVar.a).f4(fVar.c.users, false);
                }
                fVar.b = System.currentTimeMillis();
                fVar.f = true;
                fVar.d();
                return;
            case 4:
                k0 k0Var = (k0) this.b;
                ao0 ao0Var = (ao0) this.c;
                kg.f.a(k0Var.a).b();
                ao0Var.run();
                k0Var.dismiss();
                return;
            case 5:
                mp.u1(((s0) this.b).currentAccount).V3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 6:
                e1 e1Var = (e1) this.b;
                n41 n41Var = (n41) this.c;
                e1Var.getClass();
                e1Var.c0(n41Var.d);
                return;
            case 7:
                tr trVar = (tr) this.b;
                v1 v1Var = (v1) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = trVar.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, v1Var.a);
                        sQLitePreparedStatement2.bindString(2, v1Var.b);
                        sQLitePreparedStatement2.bindInteger(3, v1Var.c);
                        sQLitePreparedStatement2.bindInteger(4, v1Var.f);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th2;
                }
            case 8:
                w1 w1Var = (w1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = w1Var.b;
                int i11 = w1Var.a;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    mp.u1(i11).f4(tL_messages_quickReplies.users, false);
                    mp.u1(i11).Z3(tL_messages_quickReplies.chats, false);
                    tr.a0(i11).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_quickReplies.quick_replies.size(); i12++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i12);
                        v1 v1Var2 = new v1();
                        v1Var2.a = tL_quickReply.shortcut_id;
                        v1Var2.b = tL_quickReply.shortcut;
                        v1Var2.f = tL_quickReply.count;
                        v1Var2.d = tL_quickReply.top_message;
                        v1Var2.c = i12;
                        int i13 = 0;
                        while (true) {
                            if (i13 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i13);
                                if (message.id != tL_quickReply.top_message) {
                                    i13++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            fj fjVar = new fj(i11, message, false, true);
                            v1Var2.e = fjVar;
                            fjVar.r0(false);
                            v1Var2.e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList3.add(v1Var2);
                    }
                    arrayList = arrayList3;
                }
                w1Var.e = false;
                if (arrayList != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                w1Var.f = true;
                w1Var.l();
                ks.f(i11).k(ks.F1, new Object[0]);
                return;
            case 9:
                w1 w1Var2 = (w1) this.b;
                tr trVar2 = (tr) this.c;
                ArrayList arrayList4 = w1Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = trVar2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i10 < arrayList4.size()) {
                            v1 v1Var3 = (v1) arrayList4.get(i10);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, v1Var3.a);
                            sQLitePreparedStatement.bindString(2, v1Var3.b);
                            sQLitePreparedStatement.bindInteger(3, v1Var3.c);
                            sQLitePreparedStatement.bindInteger(4, v1Var3.f);
                            sQLitePreparedStatement.step();
                            i10++;
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th3;
                }
            case 10:
                ki.j jVar = (ki.j) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    jVar.Z = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    jVar.b0 = starrefprogram;
                    if (starrefprogram == null) {
                        jVar.Z = true;
                        jVar.b0 = jVar.I0();
                        jVar.a0 = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        jVar.a0 = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = jVar.b0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                jVar.K0(true);
                return;
            case 11:
                t2 t2Var = (t2) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                t2Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                t2Var.k(botappsettings, true);
                return;
            case 12:
                t2 t2Var2 = (t2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (t2Var2.e0) {
                    return;
                }
                if (tL_error != null) {
                    t2Var2.o(false);
                    return;
                } else {
                    g0.h3(t2Var2.v0, 60000L);
                    return;
                }
            case 13:
                t2 t2Var3 = (t2) this.b;
                fc Q = new kc(t2Var3.r0, t2Var3.G).Q(R.raw.contact_check, 36, g0.W2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 14:
                i3 i3Var = (i3) this.b;
                i3Var.getMessagesController().E3(null, (TLRPC.User) this.c, null, i3Var.getClassGuid(), null, false, false);
                return;
            case 15:
                i3 i3Var2 = (i3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                i3Var2.getClass();
                i3Var2.presentFragment(bn.ua(connectedbotstarref.bot_id));
                return;
            case 16:
                t3 t3Var = (t3) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (t3Var.U) {
                    return;
                }
                if (tL_error2 != null) {
                    t3Var.b.dismiss();
                    return;
                } else {
                    g0.h3(t3Var.V, 60000L);
                    return;
                }
            case 17:
                t3 t3Var2 = (t3) this.b;
                fc Q2 = new kc(t3Var2.b.c, t3Var2.a).Q(R.raw.contact_check, 36, g0.W2((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 18:
                l2.g0 g0Var = (l2.g0) this.b;
                m0 m0Var = (m0) this.c;
                int i14 = g0Var.J - m0Var.b;
                g0Var.J = i14;
                if (m0Var.d) {
                    g0Var.K = m0Var.e;
                    g0Var.L = true;
                }
                if (i14 == 0) {
                    l1 l1Var = ((h1) m0Var.f).a;
                    if (!g0Var.p0.a.p() && l1Var.p()) {
                        g0Var.q0 = -1;
                        g0Var.r0 = 0L;
                    }
                    if (!l1Var.p()) {
                        List asList = Arrays.asList(((m1) l1Var).l);
                        ma.p(asList.size() == g0Var.p.size());
                        for (int i15 = 0; i15 < asList.size(); i15++) {
                            ((c0) g0Var.p.get(i15)).c = (l1) asList.get(i15);
                        }
                    }
                    if (g0Var.L) {
                        Object[] objArr = ((h1) m0Var.f).a.p() && g0Var.p0.a.p();
                        boolean equals = ((h1) m0Var.f).b.equals(g0Var.p0.b);
                        Object[] objArr2 = ((h1) m0Var.f).d == g0Var.p0.s;
                        if (objArr != false || (equals && objArr2 != false)) {
                            z11 = false;
                        }
                        if (z11) {
                            int p02 = g0Var.p0();
                            if (l1Var.p() || ((h1) m0Var.f).b.b()) {
                                j10 = ((h1) m0Var.f).d;
                            } else {
                                h1 h1Var = (h1) m0Var.f;
                                x2.g0 g0Var2 = h1Var.b;
                                long j11 = h1Var.d;
                                Object obj = g0Var2.a;
                                i1 i1Var = g0Var.o;
                                l1Var.g(obj, i1Var);
                                j10 = j11 + i1Var.e;
                            }
                            j3 = j10;
                            i7 = p02;
                            z10 = z11;
                            g0Var.L = false;
                            g0Var.D1((h1) m0Var.f, 1, z10, g0Var.K, j3, i7, false);
                            return;
                        }
                        i7 = -1;
                        z10 = z11;
                    } else {
                        i7 = -1;
                        z10 = false;
                    }
                    j3 = -9223372036854775807L;
                    g0Var.L = false;
                    g0Var.D1((h1) m0Var.f, 1, z10, g0Var.K, j3, i7, false);
                    return;
                }
                return;
            case 19:
                a0 a0Var = (a0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList5 = a0Var.a.t0;
                int size = arrayList5.size();
                while (i10 < size) {
                    Object obj2 = arrayList5.get(i10);
                    i10++;
                    ((h61) ((e2.w1) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 20:
                li.r rVar = (li.r) this.b;
                mi.f fVar2 = (mi.f) this.c;
                rVar.getClass();
                rVar.presentFragment(bn.ua(fVar2.b.id));
                return;
            case 21:
                ((li.c0) this.b).u1.presentFragment(bn.ua(((mi.f) this.c).b.id));
                return;
            case 22:
                ((m2.g) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 23:
                ((m2.g) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 24:
                ((m2.g) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 25:
                ((m2.g) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 26:
                ((m2.g) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 27:
                jb.m mVar = (jb.m) this.b;
                String str2 = (String) this.c;
                s sVar = (s) mVar.c;
                String str3 = l0.a;
                m2.d dVar = ((a0) sVar).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1012, new m2.c(U, str2, 15));
                return;
            case 28:
                jb.m mVar2 = (jb.m) this.b;
                l2.d dVar2 = (l2.d) this.c;
                s sVar2 = (s) mVar2.c;
                String str4 = l0.a;
                j6.k.R(((a0) sVar2).a.F, dVar2);
                return;
            default:
                d0.a((d0) this.b, (AudioRouting) this.c);
                return;
        }
    }
}

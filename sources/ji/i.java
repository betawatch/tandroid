package ji;

import a8.la;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.util.Log;
import di.p6;
import e2.i1;
import e2.l1;
import e2.w1;
import h9.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kg.e1;
import kg.k0;
import kg.s0;
import kg.u1;
import kg.v1;
import ki.h3;
import ki.s2;
import ki.s3;
import l2.b0;
import l2.f0;
import l2.g1;
import l2.l0;
import l2.z;
import li.d0;
import n2.c0;
import n2.i0;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i7, Object obj, Object obj2) {
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
        long j3;
        boolean z10;
        n2.e eVar;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = null;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                String str = (String) this.c;
                oVar.i0 = false;
                if (oVar.c == 0) {
                    e eVar2 = oVar.K;
                    if (eVar2 != null) {
                        eVar2.setBusy(false);
                        return;
                    }
                    return;
                }
                if (str == null || str.trim().isEmpty()) {
                    Log.d("VoiceLive", "field: style failed");
                    e eVar3 = oVar.K;
                    if (eVar3 != null) {
                        eVar3.setBusy(false);
                        return;
                    }
                    return;
                }
                oVar.e0 = str.trim();
                oVar.f0 = oVar.c().size();
                e eVar4 = oVar.K;
                if (eVar4 != null) {
                    eVar4.setRevertShown(true);
                    oVar.K.setRebuildNext(true);
                }
                oVar.o();
                e eVar5 = oVar.K;
                if (eVar5 != null) {
                    eVar5.setRebuildNext(false);
                    oVar.K.setBusy(false);
                    return;
                }
                return;
            case 1:
                kg.f fVar = (kg.f) this.b;
                TLObject tLObject = (TLObject) this.c;
                fVar.e = false;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                fVar.c = connectedbots;
                if (connectedbots != null) {
                    np.u1(fVar.a).f4(fVar.c.users, false);
                }
                fVar.b = System.currentTimeMillis();
                fVar.f = true;
                fVar.d();
                return;
            case 2:
                k0 k0Var = (k0) this.b;
                jw0 jw0Var = (jw0) this.c;
                kg.f.a(k0Var.a).b();
                jw0Var.run();
                k0Var.dismiss();
                return;
            case 3:
                np.u1(((s0) this.b).currentAccount).V3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 4:
                e1 e1Var = (e1) this.b;
                o41 o41Var = (o41) this.c;
                e1Var.getClass();
                e1Var.c0(o41Var.d);
                return;
            case 5:
                ur urVar = (ur) this.b;
                u1 u1Var = (u1) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = urVar.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, u1Var.a);
                        sQLitePreparedStatement2.bindString(2, u1Var.b);
                        sQLitePreparedStatement2.bindInteger(3, u1Var.c);
                        sQLitePreparedStatement2.bindInteger(4, u1Var.f);
                        sQLitePreparedStatement2.step();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 6:
                v1 v1Var = (v1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = v1Var.b;
                int i11 = v1Var.a;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    np.u1(i11).f4(tL_messages_quickReplies.users, false);
                    np.u1(i11).Z3(tL_messages_quickReplies.chats, false);
                    ur.a0(i11).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_quickReplies.quick_replies.size(); i12++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i12);
                        u1 u1Var2 = new u1();
                        u1Var2.a = tL_quickReply.shortcut_id;
                        u1Var2.b = tL_quickReply.shortcut;
                        u1Var2.f = tL_quickReply.count;
                        u1Var2.d = tL_quickReply.top_message;
                        u1Var2.c = i12;
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
                            gj gjVar = new gj(i11, message, false, true);
                            u1Var2.e = gjVar;
                            gjVar.r0(false);
                            u1Var2.e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList3.add(u1Var2);
                    }
                    arrayList = arrayList3;
                }
                v1Var.e = false;
                if (arrayList != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                v1Var.f = true;
                v1Var.l();
                ls.f(i11).k(ls.F1, new Object[0]);
                return;
            case 7:
                v1 v1Var2 = (v1) this.b;
                ur urVar2 = (ur) this.c;
                ArrayList arrayList4 = v1Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = urVar2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                            u1 u1Var3 = (u1) arrayList4.get(i14);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, u1Var3.a);
                            sQLitePreparedStatement.bindString(2, u1Var3.b);
                            sQLitePreparedStatement.bindInteger(3, u1Var3.c);
                            sQLitePreparedStatement.bindInteger(4, u1Var3.f);
                            sQLitePreparedStatement.step();
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
            case 8:
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
            case 9:
                s2 s2Var = (s2) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                s2Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                s2Var.k(botappsettings, true);
                return;
            case 10:
                s2 s2Var2 = (s2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (s2Var2.e0) {
                    return;
                }
                if (tL_error != null) {
                    s2Var2.o(false);
                    return;
                } else {
                    g0.h3(s2Var2.v0, 60000L);
                    return;
                }
            case 11:
                s2 s2Var3 = (s2) this.b;
                gc Q = new lc(s2Var3.r0, s2Var3.G).Q(R.raw.contact_check, 36, g0.W2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 12:
                h3 h3Var = (h3) this.b;
                h3Var.getMessagesController().E3(null, (TLRPC.User) this.c, null, h3Var.getClassGuid(), null, false, false);
                return;
            case 13:
                h3 h3Var2 = (h3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                h3Var2.getClass();
                h3Var2.presentFragment(bn.ua(connectedbotstarref.bot_id));
                return;
            case 14:
                s3 s3Var = (s3) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (s3Var.U) {
                    return;
                }
                if (tL_error2 != null) {
                    s3Var.b.dismiss();
                    return;
                } else {
                    g0.h3(s3Var.V, 60000L);
                    return;
                }
            case 15:
                s3 s3Var2 = (s3) this.b;
                gc Q2 = new lc(s3Var2.b.c, s3Var2.a).Q(R.raw.contact_check, 36, g0.W2((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 16:
                f0 f0Var = (f0) this.b;
                l0 l0Var = (l0) this.c;
                int i15 = f0Var.J - l0Var.b;
                f0Var.J = i15;
                if (l0Var.d) {
                    f0Var.K = l0Var.e;
                    f0Var.L = true;
                }
                if (i15 == 0) {
                    l1 l1Var = ((g1) l0Var.f).a;
                    int i16 = -1;
                    if (!f0Var.p0.a.p() && l1Var.p()) {
                        f0Var.q0 = -1;
                        f0Var.r0 = 0L;
                    }
                    if (!l1Var.p()) {
                        List asList = Arrays.asList(((l2.l1) l1Var).l);
                        la.p(asList.size() == f0Var.p.size());
                        for (int i17 = 0; i17 < asList.size(); i17++) {
                            ((b0) f0Var.p.get(i17)).c = (l1) asList.get(i17);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (f0Var.L) {
                        Object[] objArr = ((g1) l0Var.f).a.p() && f0Var.p0.a.p();
                        boolean equals = ((g1) l0Var.f).b.equals(f0Var.p0.b);
                        Object[] objArr2 = ((g1) l0Var.f).d == f0Var.p0.s;
                        if (objArr != false || (equals && objArr2 != false)) {
                            z12 = false;
                        }
                        if (z12) {
                            i16 = f0Var.o0();
                            if (l1Var.p() || ((g1) l0Var.f).b.b()) {
                                j10 = ((g1) l0Var.f).d;
                            } else {
                                g1 g1Var = (g1) l0Var.f;
                                x2.g0 g0Var = g1Var.b;
                                long j11 = g1Var.d;
                                Object obj = g0Var.a;
                                i1 i1Var = f0Var.o;
                                l1Var.g(obj, i1Var);
                                j10 = j11 + i1Var.e;
                            }
                        }
                        i7 = i16;
                        j3 = j10;
                        z10 = z12;
                    } else {
                        i7 = -1;
                        j3 = -9223372036854775807L;
                        z10 = false;
                    }
                    f0Var.L = false;
                    f0Var.D1((g1) l0Var.f, 1, z10, f0Var.K, j3, i7, false);
                    return;
                }
                return;
            case 17:
                z zVar = (z) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList5 = zVar.a.t0;
                int size = arrayList5.size();
                while (i10 < size) {
                    Object obj2 = arrayList5.get(i10);
                    i10++;
                    ((i61) ((w1) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 18:
                li.s sVar = (li.s) this.b;
                mi.f fVar2 = (mi.f) this.c;
                sVar.getClass();
                sVar.presentFragment(bn.ua(fVar2.b.id));
                return;
            case 19:
                ((d0) this.b).u1.presentFragment(bn.ua(((mi.f) this.c).b.id));
                return;
            case 20:
                ((m2.g) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 21:
                ((m2.g) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 22:
                ((m2.g) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 23:
                ((m2.g) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 24:
                ((m2.g) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 25:
                k8.a aVar = (k8.a) this.b;
                String str2 = (String) this.c;
                n2.s sVar2 = (n2.s) aVar.c;
                String str3 = h2.l0.a;
                m2.d dVar = ((z) sVar2).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1012, new m2.c(U, str2, 15));
                return;
            case 26:
                k8.a aVar2 = (k8.a) this.b;
                l2.c cVar = (l2.c) this.c;
                n2.s sVar3 = (n2.s) aVar2.c;
                String str4 = h2.l0.a;
                l.z(((z) sVar3).a.F, cVar);
                return;
            case 27:
                c0.a((c0) this.b, (AudioRouting) this.c);
                return;
            case 28:
                c0 c0Var = (c0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (c0Var.d == null || (eVar = ((i0) c0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                e2.e eVar6 = eVar.j;
                List a10 = eVar.a();
                t1 t1Var = n2.b.e;
                eVar.b(n2.b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar6, audioDeviceInfo, a10));
                return;
            default:
                String[] strArr = (String[]) this.b;
                r10 r10Var = (r10) this.c;
                oi.p a11 = oi.p.a(strArr[0], g0.L(26.0f), false);
                if (a11 == null) {
                    a11 = oi.p.a(hd.N0(2131754004, null), g0.L(26.0f), false);
                    z11 = true;
                }
                g0.g3(new p6(r10Var, a11 != null ? a11.a : null, z11, 7));
                return;
        }
    }
}

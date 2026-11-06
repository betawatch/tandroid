package ha;

import a8.ia;
import a8.p0;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import bi.u7;
import e2.i1;
import e2.l1;
import e2.w1;
import hi.a3;
import hi.c4;
import hi.j;
import hi.j4;
import hi.q3;
import ii.d0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import jg.h0;
import jg.s1;
import jg.x1;
import jg.z1;
import ji.f;
import kg.c1;
import kg.i0;
import kg.q0;
import kg.t1;
import l2.c0;
import l2.e0;
import l2.k1;
import l2.o0;
import l2.p1;
import l5.d;
import li.a6;
import li.c2;
import li.g1;
import li.k0;
import li.m5;
import li.q;
import li.t3;
import li.v;
import o5.s;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.x31;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:50|(2:51|52)|(3:99|100|(10:102|103|(2:94|95)|56|(1:58)|59|60|61|(1:(1:64))(7:66|67|68|69|70|71|72)|65))|54|(0)|56|(0)|59|60|61|(0)(0)|65) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bd, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i7;
        TLRPC.Message message;
        int i10;
        boolean z9;
        long j3;
        long j10;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        int i11 = -1;
        r11 = null;
        r11 = null;
        String str3 = null;
        r11 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = null;
        r11 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    s.a().d.c(cVar.h.a.b(d.c), 1);
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 1:
                j jVar = (j) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    jVar.Y = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    jVar.a0 = starrefprogram;
                    if (starrefprogram == null) {
                        jVar.Y = true;
                        jVar.a0 = jVar.I0();
                        jVar.Z = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        jVar.Z = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = jVar.a0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                jVar.K0(true);
                return;
            case 2:
                a3 a3Var = (a3) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                a3Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                a3Var.k(botappsettings, true);
                return;
            case 3:
                a3 a3Var2 = (a3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (a3Var2.d0) {
                    return;
                }
                if (tL_error != null) {
                    a3Var2.o(false);
                    return;
                } else {
                    g0.i3(a3Var2.u0, 60000L);
                    return;
                }
            case 4:
                a3 a3Var3 = (a3) this.b;
                cc Q = new hc(a3Var3.q0, a3Var3.F).Q(R.raw.contact_check, 36, g0.X2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 5:
                q3 q3Var = (q3) this.b;
                q3Var.getMessagesController().x3(null, (TLRPC.User) this.c, null, q3Var.getClassGuid(), null, false, false);
                return;
            case 6:
                q3 q3Var2 = (q3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                q3Var2.getClass();
                q3Var2.presentFragment(an.ra(connectedbotstarref.bot_id));
                return;
            case 7:
                c4 c4Var = (c4) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (c4Var.T) {
                    return;
                }
                if (tL_error2 != null) {
                    c4Var.b.dismiss();
                    return;
                } else {
                    g0.i3(c4Var.U, 60000L);
                    return;
                }
            case 8:
                c4 c4Var2 = (c4) this.b;
                cc Q2 = new hc(c4Var2.b.c, c4Var2.a).Q(R.raw.contact_check, 36, g0.X2((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 9:
                ii.s sVar = (ii.s) this.b;
                f fVar = (f) this.c;
                sVar.getClass();
                sVar.presentFragment(an.ra(fVar.b.id));
                return;
            case 10:
                ((d0) this.b).q1.presentFragment(an.ra(((f) this.c).b.id));
                return;
            case 11:
                h0 h0Var = (h0) this.b;
                View view = (View) this.c;
                h0Var.m0 = false;
                h0Var.o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 12:
                h0 h0Var2 = (h0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i14 = h0Var2.s0;
                ArrayList arrayList2 = h0Var2.K;
                h0Var2.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    arrayList2.clear();
                    h0Var2.f();
                    return;
                }
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    qp.s1(i14).Y3(tL_contacts_sponsoredPeers.users, true);
                    qp.s1(i14).S3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList2.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.f();
                    return;
                }
                return;
            case 13:
                h0 h0Var3 = (h0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    yr.a0(h0Var3.s0).b.executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 14:
                s1 s1Var = (s1) this.b;
                String str4 = (String) this.c;
                s1Var.I = str4;
                if (s1Var.r) {
                    s1Var.f.g(str4, true, false, s1Var.s, s1Var.w, s1Var.y, s1Var.x, -1, 1);
                }
                int i15 = p10.s0;
                ArrayList arrayList3 = new ArrayList(g5.r(i15).e0);
                s1Var.D = true;
                int i16 = s1Var.F;
                s1Var.F = i16 + 1;
                s1Var.E = i16;
                s1Var.f();
                Utilities.g.c(new j4(s1Var, str4, i16, arrayList3, i15, 1));
                return;
            case 15:
                z1 z1Var = (z1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int i17 = z1Var.m;
                try {
                    yr.a0(i17).b.beginTransaction();
                    SQLitePreparedStatement executeFast = yr.a0(i17).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i12 < arrayList4.size() && i12 != 100) {
                            x1 x1Var = (x1) arrayList4.get(i12);
                            executeFast.requery();
                            executeFast.bindString(1, x1Var.a);
                            executeFast.bindInteger(2, x1Var.b);
                            executeFast.step();
                            i12++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList4.size() > 100) {
                        SQLitePreparedStatement executeFast2 = yr.a0(i17).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i7 = 100; i7 < arrayList4.size(); i7++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((x1) arrayList4.get(i7)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    yr.a0(i17).b.commitTransaction();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 16:
                kg.f fVar2 = (kg.f) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                fVar2.e = false;
                TL_account.connectedBots connectedbots = tLObject2 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject2 : null;
                fVar2.c = connectedbots;
                if (connectedbots != null) {
                    qp.s1(fVar2.a).Y3(fVar2.c.users, false);
                }
                fVar2.b = System.currentTimeMillis();
                fVar2.f = true;
                fVar2.d();
                return;
            case 17:
                i0 i0Var = (i0) this.b;
                r2 r2Var = (r2) this.c;
                kg.f.a(i0Var.a).b();
                r2Var.run();
                i0Var.dismiss();
                return;
            case 18:
                qp.s1(((q0) this.b).currentAccount).O3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 19:
                c1 c1Var = (c1) this.b;
                x31 x31Var = (x31) this.c;
                c1Var.getClass();
                c1Var.c0(x31Var.d);
                return;
            case 20:
                yr yrVar = (yr) this.b;
                kg.s1 s1Var2 = (kg.s1) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = yrVar.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, s1Var2.a);
                        sQLitePreparedStatement2.bindString(2, s1Var2.b);
                        sQLitePreparedStatement2.bindInteger(3, s1Var2.c);
                        sQLitePreparedStatement2.bindInteger(4, s1Var2.f);
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
            case 21:
                t1 t1Var = (t1) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList5 = t1Var.b;
                int i18 = t1Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject3;
                    qp.s1(i18).Y3(tL_messages_quickReplies.users, false);
                    qp.s1(i18).S3(tL_messages_quickReplies.chats, false);
                    yr.a0(i18).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList6 = new ArrayList();
                    for (int i19 = 0; i19 < tL_messages_quickReplies.quick_replies.size(); i19++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i19);
                        kg.s1 s1Var3 = new kg.s1();
                        s1Var3.a = tL_quickReply.shortcut_id;
                        s1Var3.b = tL_quickReply.shortcut;
                        s1Var3.f = tL_quickReply.count;
                        s1Var3.d = tL_quickReply.top_message;
                        s1Var3.c = i19;
                        int i20 = 0;
                        while (true) {
                            if (i20 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i20);
                                if (message.id != tL_quickReply.top_message) {
                                    i20++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            ij ijVar = new ij(i18, message, false, true);
                            s1Var3.e = ijVar;
                            ijVar.r0(false);
                            s1Var3.e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList6.add(s1Var3);
                    }
                    arrayList = arrayList6;
                }
                t1Var.e = false;
                if (arrayList != null) {
                    arrayList5.clear();
                    arrayList5.addAll(arrayList);
                }
                t1Var.f = true;
                t1Var.l();
                qs.f(i18).k(qs.F1, new Object[0]);
                return;
            case 22:
                t1 t1Var2 = (t1) this.b;
                yr yrVar2 = (yr) this.c;
                ArrayList arrayList7 = t1Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = yrVar2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i21 = 0; i21 < arrayList7.size(); i21++) {
                            kg.s1 s1Var4 = (kg.s1) arrayList7.get(i21);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, s1Var4.a);
                            sQLitePreparedStatement.bindString(2, s1Var4.b);
                            sQLitePreparedStatement.bindInteger(3, s1Var4.c);
                            sQLitePreparedStatement.bindInteger(4, s1Var4.f);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e13) {
                        a8.g(e13, true);
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
            case 23:
                l2.i0 i0Var2 = (l2.i0) this.b;
                o0 o0Var = (o0) this.c;
                int i22 = i0Var2.J - o0Var.b;
                i0Var2.J = i22;
                if (o0Var.d) {
                    i0Var2.K = o0Var.e;
                    i0Var2.L = true;
                }
                if (i22 == 0) {
                    l1 l1Var = ((k1) o0Var.f).a;
                    if (!i0Var2.p0.a.p() && l1Var.p()) {
                        i0Var2.q0 = -1;
                        i0Var2.r0 = 0L;
                    }
                    if (!l1Var.p()) {
                        List asList = Arrays.asList(((p1) l1Var).l);
                        ia.p(asList.size() == i0Var2.p.size());
                        for (int i23 = 0; i23 < asList.size(); i23++) {
                            ((e0) i0Var2.p.get(i23)).c = (l1) asList.get(i23);
                        }
                    }
                    if (i0Var2.L) {
                        Object[] objArr = ((k1) o0Var.f).a.p() && i0Var2.p0.a.p();
                        boolean equals = ((k1) o0Var.f).b.equals(i0Var2.p0.b);
                        Object[] objArr2 = ((k1) o0Var.f).d == i0Var2.p0.s;
                        if (objArr != false || (equals && objArr2 != false)) {
                            z11 = false;
                        }
                        if (z11) {
                            int o02 = i0Var2.o0();
                            if (l1Var.p() || ((k1) o0Var.f).b.b()) {
                                j10 = ((k1) o0Var.f).d;
                            } else {
                                k1 k1Var = (k1) o0Var.f;
                                x2.g0 g0Var = k1Var.b;
                                long j11 = k1Var.d;
                                Object obj = g0Var.a;
                                i1 i1Var = i0Var2.o;
                                l1Var.g(obj, i1Var);
                                j10 = j11 + i1Var.e;
                            }
                            j3 = j10;
                            i10 = o02;
                            z9 = z11;
                            i0Var2.L = false;
                            i0Var2.D1((k1) o0Var.f, 1, z9, i0Var2.K, j3, i10, false);
                            return;
                        }
                        i10 = -1;
                        z9 = z11;
                    } else {
                        i10 = -1;
                        z9 = false;
                    }
                    j3 = -9223372036854775807L;
                    i0Var2.L = false;
                    i0Var2.D1((k1) o0Var.f, 1, z9, i0Var2.K, j3, i10, false);
                    return;
                }
                return;
            case 24:
                c0 c0Var = (c0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList8 = c0Var.a.t0;
                int size = arrayList8.size();
                while (i13 < size) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    ((t51) ((w1) obj2)).J.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 25:
                String[] strArr = (String[]) this.b;
                v10 v10Var = (v10) this.c;
                q a10 = q.a(strArr[0], g0.L(26.0f), false);
                if (a10 == null) {
                    a10 = q.a(hd.M0(2131754007, null), g0.L(26.0f), false);
                    z10 = true;
                }
                g0.h3(new u7(v10Var, a10 != null ? a10.a : null, z10, 7));
                return;
            case 26:
                v vVar = (v) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                vVar.Y1 = false;
                vVar.Z1 = 0;
                fi.d dVar = vVar.X1;
                dVar.setLoading(false);
                if (!(tLObject4 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    g0.G3(4.0f, dVar, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject4).result;
                if (richMessage == null) {
                    g0.G3(4.0f, dVar, null);
                    return;
                }
                vVar.a2 = richMessage;
                vVar.U1.set(richMessage);
                dVar.i(hd.M0(2131754061, null), true, true);
                vVar.d1();
                l41 l41Var = vVar.R1;
                if (l41Var != null) {
                    l41Var.O(true);
                    return;
                }
                return;
            case 27:
                t3 t3Var = (t3) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = g0.T0(uri);
                } catch (Exception e14) {
                    a8.g(e14, true);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !p0.B(str)) {
                    try {
                        query = t3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e15) {
                        e = e15;
                        str2 = null;
                        a8.g(e, true);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str3;
                        if (TextUtils.isEmpty(str)) {
                        }
                    }
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str2 = query.getString(0);
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Exception e16) {
                                        e = e16;
                                        a8.g(e, true);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
                                        if (TextUtils.isEmpty(str)) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + iz.p();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(w7.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            g0.D(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath = file.getAbsolutePath();
                                            openInputStream.close();
                                            str3 = absolutePath;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (openInputStream != null) {
                                    openInputStream.close();
                                }
                                str = str3;
                            }
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !p0.B(str)) {
                    return;
                }
                g0.h3(new b(28, t3Var, str));
                return;
            case 28:
                ((t3) this.b).f2((String) this.c);
                return;
            default:
                t3 t3Var2 = (t3) this.b;
                c2 c2Var = (c2) this.c;
                t3Var2.getClass();
                long j12 = c2Var.a;
                int i24 = c2Var.d;
                int i25 = c2Var.c;
                ArrayList arrayList9 = t3Var2.s3;
                int i26 = 0;
                while (true) {
                    if (i26 < arrayList9.size()) {
                        if (((li.a) arrayList9.get(i26)).a == j12) {
                            i11 = i26;
                        } else {
                            i26++;
                        }
                    }
                }
                if (i11 < 0) {
                    return;
                }
                View m10 = t3Var2.e3.m(i11);
                if (m10 instanceof a6) {
                    a6 a6Var = (a6) m10;
                    a6Var.B();
                    g1 editText = a6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i25, length)), Math.max(0, Math.min(i24, length)));
                    return;
                }
                if (!(m10 instanceof m5)) {
                    if (m10 instanceof k0) {
                        g1 captionEditText = ((k0) m10).getCaptionEditText();
                        captionEditText.N();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i25, length2)), Math.max(0, Math.min(i24, length2)));
                        return;
                    }
                    return;
                }
                m5 m5Var = (m5) m10;
                g1 m11 = m5Var.m(c2Var.b);
                if (m11 == null) {
                    m11 = m5Var.m(0);
                }
                if (m11 == null) {
                    return;
                }
                m11.N();
                int length3 = m11.length();
                m11.setSelection(Math.max(0, Math.min(i25, length3)), Math.max(0, Math.min(i24, length3)));
                return;
        }
    }
}

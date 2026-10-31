package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.ci;
import org.telegram.messenger.ct;
import org.telegram.messenger.f8;
import org.telegram.messenger.fp;
import org.telegram.messenger.gt;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.nz;
import org.telegram.messenger.ot;
import org.telegram.messenger.pi;
import org.telegram.messenger.pz;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.rz;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.yo;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x70;
import org.telegram.ui.cp;
import org.telegram.ui.fn;
import org.telegram.ui.km;
import org.telegram.ui.mp;
import org.telegram.ui.sn;
import org.telegram.ui.un;
import org.telegram.ui.zg;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    private final void a() {
        File file;
        int i10;
        li.x0 x0Var = (li.x0) this.c;
        li.z zVar = (li.z) this.d;
        boolean z10 = this.b;
        li.t0 t0Var = (li.t0) this.e;
        long j10 = x0Var.q;
        long nanoTime = System.nanoTime();
        try {
            zVar.g();
            long h = zVar.h();
            x0Var.m.b("active output finalized: size=" + zVar.a.length() + ", durationMs=" + h + ", elapsedMs=" + li.x0.f(nanoTime));
            x0Var.g();
            boolean z11 = h > j10;
            if (z10 && !z11) {
                try {
                    x0Var.k.execute(new li.j0(x0Var, t0Var, zVar.a, h, true));
                    return;
                } catch (Exception e) {
                    e = e;
                    x0Var = x0Var;
                    x0Var.i.post(new li.h0(x0Var, e, 2));
                    return;
                }
            }
            File file2 = zVar.a;
            try {
                synchronized (zVar) {
                    file = file2;
                    try {
                        i10 = zVar.s;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                try {
                    x0Var.t(file, i10, 0L, Math.min(j10, h), z10, z11 ? 1 : 2);
                    w7.q.c(file);
                } catch (Throwable th3) {
                    th = th3;
                    file = file;
                    w7.q.c(file);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                file = file2;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    private final void b() {
        String[] split;
        String[] strArr = (String[]) this.c;
        org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.d;
        boolean z10 = this.b;
        lg.s sVar = (lg.s) this.e;
        try {
            org.telegram.ui.ActionBar.t6.g0 = org.telegram.ui.ActionBar.t6.hm.get(org.telegram.ui.ActionBar.t6.g5, -1);
            if (TextUtils.isEmpty(strArr[0])) {
                try {
                    if (s6Var.c != null) {
                        new File(s6Var.c).delete();
                    }
                } catch (Exception unused) {
                }
                s6Var.c = null;
                org.telegram.ui.ActionBar.t6.h0 = null;
            } else {
                org.telegram.ui.ActionBar.t6.h0 = strArr[0];
                String absolutePath = new File(org.telegram.messenger.w0.h(), Utilities.a(org.telegram.ui.ActionBar.t6.h0) + ".wp").getAbsolutePath();
                try {
                    String str = s6Var.c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(s6Var.c).delete();
                    }
                } catch (Exception unused2) {
                }
                s6Var.c = absolutePath;
                try {
                    Uri parse = Uri.parse(org.telegram.ui.ActionBar.t6.h0);
                    s6Var.e = parse.getQueryParameter("slug");
                    String queryParameter = parse.getQueryParameter("mode");
                    if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                        for (int i10 = 0; i10 < split.length; i10++) {
                            if ("blur".equals(split[i10])) {
                                s6Var.h = true;
                            } else if ("motion".equals(split[i10])) {
                                s6Var.n = true;
                            }
                        }
                    }
                    Utilities.z(parse.getQueryParameter("intensity"));
                    s6Var.y = 45;
                    try {
                        String queryParameter2 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            s6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                            if (queryParameter2.length() >= 13 && org.telegram.messenger.i0.S1(queryParameter2.charAt(6))) {
                                s6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter2.length() >= 20 && org.telegram.messenger.i0.S1(queryParameter2.charAt(13))) {
                                s6Var.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter2.length() == 27 && org.telegram.messenger.i0.S1(queryParameter2.charAt(20))) {
                                s6Var.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    try {
                        String queryParameter3 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            s6Var.y = Utilities.z(queryParameter3).intValue();
                        }
                    } catch (Exception unused4) {
                    }
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
            if (!z10 && org.telegram.ui.ActionBar.t6.M == null) {
                org.telegram.ui.ActionBar.t6.K = s6Var;
                if (org.telegram.ui.ActionBar.t6.I == org.telegram.ui.ActionBar.t6.J) {
                    org.telegram.ui.ActionBar.t6.T = 2000;
                    org.telegram.ui.ActionBar.t6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.i0.h3(new rz(2), 2100L);
                }
            }
            org.telegram.ui.ActionBar.t6.I = s6Var;
            org.telegram.ui.ActionBar.t6.t1(false, false);
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (org.telegram.ui.ActionBar.t6.M == null && !org.telegram.ui.ActionBar.t6.Q) {
            vp.r1(s6Var.E).u4(s6Var, s6Var.k(false), z10, false);
        }
        sVar.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        ArrayList arrayList;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList2;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList3;
        int i11;
        int i12;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList4;
        int i13;
        char c10;
        int i14;
        a0.h hVar;
        boolean z10;
        Integer num;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList5;
        Integer num2;
        Integer num3;
        int i18;
        org.telegram.ui.ActionBar.p6 p6Var;
        t0 t0Var;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        int i19 = 2;
        int i20 = 1;
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                boolean z11 = this.b;
                a4 a4Var = (a4) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                t4.k(k2Var, z11, new ag.m(5, a4Var, trim));
                return;
            case 1:
                Context context = (Context) this.c;
                boolean z12 = this.b;
                i2.i0 i0Var = (i2.i0) this.d;
                j2.l lVar = (j2.l) this.e;
                j2.j h = j2.j.h(context);
                if (h == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z12) {
                    j2.g gVar = i0Var.s;
                    gVar.getClass();
                    gVar.f.a(h);
                }
                LogSessionId k10 = h.k();
                synchronized (lVar) {
                    j2.k kVar = lVar.b;
                    kVar.getClass();
                    kVar.f(k10);
                }
                return;
            case 2:
                ig.q0 q0Var = (ig.q0) this.c;
                a5.a aVar = (a5.a) this.d;
                a5.a aVar2 = (a5.a) this.e;
                boolean z13 = this.b;
                int i21 = 0;
                q0Var.f.f(new ig.n0(q0Var, aVar, i21));
                q0Var.f.f(new ig.n0(q0Var, aVar2, i21));
                q0Var.E = z13;
                return;
            case 3:
                a();
                return;
            case 4:
                m4.f0 f0Var = (m4.f0) this.c;
                boolean z14 = this.b;
                m4.w wVar = (m4.w) this.d;
                Runnable runnable = (Runnable) this.e;
                m4.j1 j1Var = f0Var.g;
                if (z14) {
                    m4.p1 p1Var = new m4.p1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v G = j1Var.b.G(wVar);
                        if (G != null) {
                            i10 = G.b(m4.f0.B).n;
                        } else if (f0Var.h(wVar)) {
                            p8.b(new m4.t1(0));
                            i10 = 0;
                        } else {
                            p8.b(new m4.t1(-100));
                        }
                        m4.v vVar = wVar.d;
                        if (vVar != null) {
                            vVar.e(i10, p1Var);
                        }
                    } catch (DeadObjectException unused) {
                        j1Var.b.U(wVar);
                        p8.b(new m4.t1(-100));
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
                        p8.b(new m4.t1(-1));
                    }
                }
                runnable.run();
                j1Var.b.u(wVar);
                return;
            case 5:
                cc ccVar = (cc) this.c;
                boolean z15 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) this.e;
                wb I = ccVar.I(R.raw.star_premium_2, z15 ? cd.L0(2131753481, "BoostingGiveawayCreated") : cd.L0(2131753592, "BoostingAwardsCreated"), org.telegram.messenger.i0.R2(z15 ? cd.L0(org.telegram.messenger.w3.V(chat) ? 2131753555 : 2131753554, null) : cd.L0(org.telegram.messenger.w3.V(chat) ? 2131753557 : 2131753556, null), org.telegram.ui.ActionBar.t6.uj, 0, new mg.h(chat), p6Var2));
                I.j = 5000;
                I.j();
                return;
            case 6:
                org.telegram.messenger.b3 b3Var = (org.telegram.messenger.b3) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z16 = this.b;
                HashMap hashMap = b3Var.c;
                if (hashMap == null || (arrayList = (ArrayList) hashMap.get(pair)) == null) {
                    return;
                }
                int size = arrayList.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj2 = arrayList.get(i22);
                    i22++;
                    ((q20) obj2).a(obj);
                }
                if (z16) {
                    arrayList.clear();
                }
                if (z16) {
                    b3Var.c.remove(pair);
                    return;
                }
                return;
            case 7:
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.c;
                boolean z17 = this.b;
                TLObject tLObject = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                u3Var.u = false;
                if (z17) {
                    u3Var.v = false;
                }
                if (tLObject != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    vp.r1(u3Var.C.a).V3(groupparticipants.users, false);
                    vp.r1(u3Var.C.a).P3(groupparticipants.chats, false);
                    u3Var.m(groupparticipants.participants, z17, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.g4 g4Var = (org.telegram.messenger.g4) this.c;
                List list = (List) this.d;
                ResultCallback resultCallback = (ResultCallback) this.e;
                boolean z18 = this.b;
                g4Var.b = new ArrayList(list);
                resultCallback.onComplete(g4Var.e((z18 ? 1 : 0) | 2));
                return;
            case 9:
                org.telegram.messenger.i5 i5Var = (org.telegram.messenger.i5) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                boolean z19 = this.b;
                String str = (String) this.e;
                int size2 = arrayList6.size();
                boolean z20 = false;
                int i23 = 0;
                while (i23 < size2) {
                    Object obj3 = arrayList6.get(i23);
                    i23++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) i5Var.f0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        i5Var.e0.remove(tL_contact);
                        i5Var.f0.remove(Long.valueOf(user.id));
                        z20 = true;
                    }
                }
                if (z20) {
                    i5Var.d(false);
                }
                zs notificationCenter = i5Var.getNotificationCenter();
                int i24 = vp.D8;
                notificationCenter.k(2, 1);
                i5Var.getNotificationCenter().k(25, new Object[0]);
                if (z19) {
                    zs.e().k(zs.P4, 1, cd.a0("DeletedFromYourContacts", null, 2131751467, str));
                    return;
                }
                return;
            case 10:
                MediaController mediaController = (MediaController) this.c;
                fp fpVar = (fp) this.d;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.e;
                boolean z21 = this.b;
                String[] strArr = MediaController.U1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = fpVar.b;
                tL_document.id = fpVar.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = fpVar.c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar.a).getCurrentDatacenterId();
                b8.G(cVar.a);
                File K = b8.K(tL_document, null, true, true);
                if (!K.exists()) {
                    org.telegram.messenger.i0.g3(new org.telegram.messenger.t6(21, cVar, tL_document));
                    return;
                } else {
                    if (z21) {
                        return;
                    }
                    org.telegram.messenger.i0.g3(new org.telegram.messenger.t6(20, mediaController, K));
                    return;
                }
            case 11:
                MediaController mediaController2 = (MediaController) this.c;
                File file = (File) this.d;
                boolean z22 = this.b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.e;
                String[] strArr2 = MediaController.U1;
                boolean exists = file.exists();
                if (!exists) {
                    boolean z23 = org.telegram.messenger.v2.a;
                    f8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.j1 + " writedFrames" + mediaController2.k1), true);
                }
                if (exists) {
                    ui.b0(mediaController2.g1).B1(mediaController2.l1, mediaController2.m1, pi.a(mediaController2, file.getAbsolutePath(), z22));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.g1).getCurrentTime();
                tL_document2.size = (int) file.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.j1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                zs.f(mediaController2.g1).k(zs.o2, new Object[0]);
                zs.f(mediaController2.g1).k(zs.s2, Integer.valueOf(mediaController2.f1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 12:
                ui uiVar = (ui) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                boolean z24 = this.b;
                ArrayList arrayList8 = (ArrayList) this.e;
                uiVar.getMessagesController().V3(arrayList7, z24);
                uiVar.getMessagesController().P3(arrayList8, z24);
                return;
            case 13:
                ui uiVar2 = (ui) this.c;
                boolean z25 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                a0.h hVar2 = (a0.h) this.e;
                try {
                    uiVar2.getMessagesStorage().b.beginTransaction();
                    if (z25) {
                        executeFast = uiVar2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = uiVar2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        sQLitePreparedStatement3 = uiVar2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i25 = 0;
                    while (i25 < arrayList9.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList9.get(i25);
                        SparseArray sparseArray = (SparseArray) hVar2.f(jj.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList9;
                            i11 = i19;
                        } else {
                            jj.q5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                                jj jjVar = (jj) arrayList2.get(i26);
                                int i27 = 0;
                                while (i27 < i19) {
                                    SQLitePreparedStatement sQLitePreparedStatement4 = i27 == 0 ? executeFast : sQLitePreparedStatement3;
                                    if (sQLitePreparedStatement4 == null) {
                                        sQLitePreparedStatement2 = executeFast;
                                        arrayList4 = arrayList9;
                                        i12 = i19;
                                    } else {
                                        sQLitePreparedStatement4.requery();
                                        sQLitePreparedStatement4.bindByteBuffer(1, nativeByteBuffer);
                                        sQLitePreparedStatement4.bindInteger(i19, message.id);
                                        i12 = i19;
                                        sQLitePreparedStatement4.bindInteger(3, jjVar.f1());
                                        sQLitePreparedStatement2 = executeFast;
                                        arrayList4 = arrayList9;
                                        sQLitePreparedStatement4.bindLong(4, jj.B0(jjVar.k));
                                        sQLitePreparedStatement4.step();
                                    }
                                    i27++;
                                    i19 = i12;
                                    arrayList9 = arrayList4;
                                    executeFast = sQLitePreparedStatement2;
                                }
                            }
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList9;
                            i11 = i19;
                            nativeByteBuffer.reuse();
                        }
                        i25++;
                        i19 = i11;
                        arrayList9 = arrayList3;
                        executeFast = sQLitePreparedStatement;
                    }
                    executeFast.dispose();
                    if (sQLitePreparedStatement3 != null) {
                        sQLitePreparedStatement3.dispose();
                    }
                    uiVar2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 14:
                ui uiVar3 = (ui) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z26 = this.b;
                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z26) {
                        uiVar3.J1 = (TLRPC.TL_emojiList) tLObject2;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        uiVar3.K1 = (TLRPC.TL_emojiList) tLObject2;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 15:
                ui uiVar4 = (ui) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z27 = this.b;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    uiVar4.s1(str2, z27, (TLRPC.TL_messages_stickerSet) tLObject3, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    uiVar4.s1(str2, z27, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 16:
                vp vpVar = (vp) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                boolean z28 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = vpVar.G0;
                if (tLObject4 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject4;
                    vpVar.V3(contacts_blocked.users, false);
                    vpVar.P3(contacts_blocked.chats, false);
                    vpVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z28) {
                        longSparseIntArray.clear();
                    }
                    vpVar.H0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    vpVar.I0 = contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i28 = 0; i28 < size3; i28++) {
                        longSparseIntArray.put(jj.C1(contacts_blocked.blocked.get(i28).peer_id), 1);
                    }
                    vpVar.F0 = false;
                    vpVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 17:
                vp vpVar2 = (vp) this.c;
                boolean z29 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                if (z29) {
                    i13 = 0;
                    vpVar2.getNotificationCenter().k(2, 64);
                } else {
                    i13 = 0;
                }
                vpVar2.i5(i13, -updates.chat_id, arrayList10);
                vpVar2.getNotificationCenter().k(3, new Object[i13]);
                return;
            case 18:
                yo yoVar = (yo) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z30 = this.b;
                int i29 = yoVar.a;
                ArrayList arrayList11 = yoVar.e;
                if (iArr[0] != yoVar.f) {
                    return;
                }
                yoVar.c = false;
                yoVar.f = -1;
                if (tLObject5 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject5;
                    vp.r1(i29).P3(messages_chats.chats, false);
                    if (z30) {
                        arrayList11.clear();
                    }
                    arrayList11.addAll(messages_chats.chats);
                    yoVar.g = messages_chats instanceof TLRPC.TL_messages_chatsSlice ? messages_chats.count : messages_chats.chats.size();
                    yoVar.d = arrayList11.size() >= yoVar.g;
                    c10 = 1;
                } else {
                    c10 = 1;
                    yoVar.d = true;
                }
                zs f7 = zs.f(i29);
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(yoVar.b);
                objArr[c10] = yoVar;
                f7.k(zs.O3, objArr);
                return;
            case 19:
                ((hs) this.c).n1((List) this.d, (List) this.e, this.b);
                return;
            case 20:
                ot otVar = (ot) this.c;
                a0.h hVar3 = (a0.h) this.d;
                boolean z31 = this.b;
                ArrayList arrayList12 = (ArrayList) this.e;
                ArrayList arrayList13 = otVar.b;
                a0.h hVar4 = otVar.c;
                a0.h hVar5 = otVar.f;
                int i30 = otVar.I;
                otVar.getAccountInstance().c();
                Integer num4 = 0;
                int i31 = 0;
                while (i31 < hVar3.m()) {
                    long j10 = hVar3.j(i31);
                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j10);
                    if (sparseArray2 == null) {
                        hVar = hVar3;
                        z10 = z31;
                        num = num4;
                        i14 = i20;
                        i15 = i31;
                    } else {
                        ArrayList arrayList14 = (ArrayList) hVar3.f(j10);
                        i14 = i20;
                        int size4 = arrayList14.size();
                        hVar = hVar3;
                        int i32 = 0;
                        while (i32 < size4) {
                            int i33 = i32;
                            int intValue = ((Integer) arrayList14.get(i32)).intValue();
                            boolean z32 = z31;
                            jj jjVar2 = (jj) sparseArray2.get(intValue);
                            Integer num5 = num4;
                            if (jjVar2 == null || jjVar2.J || (z32 && !jjVar2.I)) {
                                i16 = size4;
                                i17 = i31;
                                arrayList5 = arrayList14;
                            } else {
                                i16 = size4;
                                long B0 = jj.B0(jjVar2.k);
                                Integer num6 = (Integer) hVar5.f(B0);
                                Integer num7 = num6 == null ? num5 : num6;
                                int intValue2 = num7.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    i17 = i31;
                                    otVar.e.l(B0);
                                    Integer num8 = num7;
                                    arrayList5 = arrayList14;
                                    num2 = num8;
                                    num3 = num5;
                                } else {
                                    i17 = i31;
                                    Integer num9 = num7;
                                    arrayList5 = arrayList14;
                                    num2 = num9;
                                    num3 = valueOf;
                                }
                                if (!num3.equals(num2)) {
                                    Integer num10 = num2;
                                    if (!otVar.getMessagesController().o2(B0)) {
                                        if (otVar.getMessagesController().s2(B0)) {
                                            int i34 = otVar.I - (num10.intValue() > 0 ? i14 : 0);
                                            otVar.I = i34;
                                            otVar.I = i34 + (num3.intValue() > 0 ? i14 : 0);
                                        } else {
                                            int intValue3 = otVar.I - num10.intValue();
                                            otVar.I = intValue3;
                                            otVar.I = num3.intValue() + intValue3;
                                        }
                                    }
                                    hVar5.k(num3, B0);
                                }
                                if (num3.intValue() == 0) {
                                    hVar5.l(B0);
                                    otVar.r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList13.remove(jjVar2);
                                otVar.a.remove(jjVar2);
                                if (ot.E(jjVar2)) {
                                    otVar.J--;
                                }
                                arrayList12.add(jjVar2);
                            }
                            i32 = i33 + 1;
                            num4 = num5;
                            z31 = z32;
                            size4 = i16;
                            i31 = i17;
                            arrayList14 = arrayList5;
                        }
                        z10 = z31;
                        num = num4;
                        i15 = i31;
                        if (sparseArray2.size() == 0) {
                            hVar4.l(j10);
                        }
                    }
                    i31 = i15 + 1;
                    i20 = i14;
                    hVar3 = hVar;
                    num4 = num;
                    z31 = z10;
                }
                int i35 = i20;
                if (!arrayList12.isEmpty()) {
                    org.telegram.messenger.i0.g3(new ct(otVar, arrayList12, i35));
                }
                if (i30 != otVar.I) {
                    if (otVar.K) {
                        otVar.Q(otVar.L > otVar.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList13.clear();
                        otVar.Z(otVar.K);
                    }
                    org.telegram.messenger.i0.g3(new gt(otVar, hVar5.m(), 1));
                }
                otVar.K = false;
                if (otVar.R) {
                    otVar.S(otVar.z());
                    return;
                }
                return;
            case 21:
                nz nzVar = (nz) this.c;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.d;
                pz pzVar = (pz) this.e;
                boolean z33 = this.b;
                nzVar.a = qz.C(cVar2.a).A(pzVar.c, pzVar.a, pzVar.x);
                if (z33 && pzVar.r) {
                    new File(pzVar.c).delete();
                }
                nzVar.c.countDown();
                return;
            case 22:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 23:
                b();
                return;
            case 24:
                un.d1((un) this.c, (String) this.d, (jj) this.e, this.b);
                return;
            case 25:
                un unVar = (un) this.c;
                org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) this.d;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.e;
                boolean z34 = this.b;
                if (r6Var == null) {
                    UndoView undoView = unVar.M3;
                    org.telegram.ui.ActionBar.t6.K1(s6Var, false, -1, undoView != null ? undoView.getUndoButton() : null);
                    return;
                }
                unVar.getClass();
                org.telegram.ui.ActionBar.r6 k11 = s6Var.k(false);
                int i36 = r6Var.a;
                UndoView undoView2 = unVar.M3;
                org.telegram.ui.ActionBar.t6.K1(s6Var, false, i36, undoView2 != null ? undoView2.getUndoButton() : null);
                if (z34) {
                    org.telegram.ui.ActionBar.t6.l0(s6Var, k11, true);
                    return;
                }
                return;
            case 26:
                fn fnVar = (fn) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z35 = this.b;
                jj jjVar3 = (jj) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                un unVar2 = fnVar.a;
                org.telegram.messenger.m5.p(null, null, 2131744420, new Object[]{unVar2.getMessagesController().A1(org.telegram.messenger.o5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                sf.a m10 = sf.a.m(message2.suggested_post.price);
                int i37 = m10.a == sf.b.b ? ((org.telegram.messenger.l0) unVar2.getMessagesController().y7.f.a).c : ((org.telegram.messenger.l0) unVar2.getMessagesController().y7.c.a).c;
                if (z35) {
                    m10 = sf.a.i((m10.b / 1000) * i37, m10.a);
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z35) {
                        org.telegram.messenger.m5.p(null, null, 2131744417, new Object[]{m10.f(), xh.i.I0(i37)}, spannableStringBuilder);
                    } else {
                        org.telegram.messenger.m5.p(null, null, 2131744416, new Object[]{m10.f()}, spannableStringBuilder);
                    }
                } else if (z35) {
                    org.telegram.messenger.m5.p(null, null, 2131744418, new Object[]{m10.f(), rh.e0.K0(message2.suggested_post.schedule_date), xh.i.I0(i37)}, spannableStringBuilder);
                } else {
                    org.telegram.messenger.m5.p(null, null, 2131744415, new Object[]{m10.f(), rh.e0.K0(message2.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i18 = ((org.telegram.ui.ActionBar.k2) unVar2).currentAccount;
                org.telegram.messenger.m5.p(null, null, 2131744419, new Object[]{Long.valueOf(vp.r1(i18).y7.i.a(TimeUnit.HOURS))}, spannableStringBuilder);
                wb[] wbVarArr = new wb[1];
                org.telegram.ui.q5 q5Var = new org.telegram.ui.q5(wbVarArr, 4);
                org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                org.telegram.ui.ActionBar.x1 u02 = org.telegram.ui.Components.s4.u0(unVar2, cd.L0(2131744400, null), spannableStringBuilder, cd.L0(message2.suggested_post.schedule_date == 0 ? 2131748267 : 2131744399, null), false, new ag.e3(fnVar, message2, x1VarArr, jjVar3, q5Var));
                x1VarArr[0] = u02;
                u02.setOnDismissListener(q5Var);
                if (z35 && m10.a == sf.b.a) {
                    qa a2 = ra.a(unVar2.getParentActivity());
                    p6Var = ((org.telegram.ui.ActionBar.k2) unVar2).resourceProvider;
                    wb G2 = new cc(a2, p6Var).G(R.raw.info, 10, cd.L0(2131744414, null));
                    G2.j = 60000;
                    G2.k(true);
                    wbVarArr[0] = G2;
                    return;
                }
                return;
            case 27:
                sn snVar = (sn) this.c;
                snVar.s((org.telegram.ui.ActionBar.y3) this.d, (TLRPC.WallPaper) this.e, this.b);
                snVar.p(snVar.h);
                km kmVar = snVar.G.l1;
                if (kmVar == null || (t0Var = kmVar.L) == null) {
                    return;
                }
                t0Var.invalidate();
                return;
            case 28:
                cp cpVar = (cp) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z36 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject6;
                    cpVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = cpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z36) {
                        if (cpVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getParentActivity());
                        alertDialog$Builder.a.T = cd.L0(2131746042, null);
                        alertDialog$Builder.a.R = cd.L0(2131746040, null);
                        alertDialog$Builder.h(cd.L0(2131747847, null), null);
                        cpVar.showDialog(alertDialog$Builder.a);
                    }
                }
                j80 j80Var = cpVar.G;
                if (j80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = cpVar.l0;
                    j80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    cpVar.G.c(cpVar.l0, cpVar.Z);
                    return;
                }
                return;
            default:
                mp mpVar = (mp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z37 = this.b;
                x70 x70Var = (x70) this.e;
                chat2.join_to_send = z37;
                vp messagesController = mpVar.y.d.getMessagesController();
                long j11 = chat2.id;
                ag.j0 j0Var = new ag.j0(mpVar, z37, chat2, 14);
                zg zgVar = new zg(19, mpVar, x70Var);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.g1(j11);
                tL_channels_toggleJoinToSend.enabled = z37;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new ci(messagesController, j0Var, zgVar, 8), 64);
                return;
        }
    }

    public /* synthetic */ n4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ n4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ n4(ui uiVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.a = 15;
        this.c = uiVar;
        this.d = tLObject;
        this.e = str;
        this.b = z10;
    }
}

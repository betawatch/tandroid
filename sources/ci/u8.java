package ci;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
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
import android.view.View;
import b8.yd;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ko;
import org.telegram.messenger.ks;
import org.telegram.messenger.li;
import org.telegram.messenger.os;
import org.telegram.messenger.qr;
import org.telegram.messenger.ro;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.messenger.vy;
import org.telegram.messenger.xy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.hm;
import org.telegram.ui.kl;
import org.telegram.ui.um;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u8(ei.h3 h3Var, View view, dh.n0 n0Var, boolean z10, boolean z11) {
        this.a = 1;
        this.c = h3Var;
        this.d = view;
        this.e = n0Var;
        this.b = z10;
    }

    private final void a() {
        String[] split;
        String[] strArr = (String[]) this.c;
        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.d;
        boolean z10 = this.b;
        lg.n nVar = (lg.n) this.e;
        try {
            org.telegram.ui.ActionBar.k6.g0 = org.telegram.ui.ActionBar.k6.hm.get(org.telegram.ui.ActionBar.k6.g5, -1);
            if (TextUtils.isEmpty(strArr[0])) {
                try {
                    if (j6Var.c != null) {
                        new File(j6Var.c).delete();
                    }
                } catch (Exception unused) {
                }
                j6Var.c = null;
                org.telegram.ui.ActionBar.k6.h0 = null;
            } else {
                org.telegram.ui.ActionBar.k6.h0 = strArr[0];
                String absolutePath = new File(org.telegram.messenger.t0.h(), Utilities.a(org.telegram.ui.ActionBar.k6.h0) + ".wp").getAbsolutePath();
                try {
                    String str = j6Var.c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(j6Var.c).delete();
                    }
                } catch (Exception unused2) {
                }
                j6Var.c = absolutePath;
                try {
                    Uri parse = Uri.parse(org.telegram.ui.ActionBar.k6.h0);
                    j6Var.e = parse.getQueryParameter("slug");
                    String queryParameter = parse.getQueryParameter("mode");
                    if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                        for (int i3 = 0; i3 < split.length; i3++) {
                            if ("blur".equals(split[i3])) {
                                j6Var.h = true;
                            } else if ("motion".equals(split[i3])) {
                                j6Var.n = true;
                            }
                        }
                    }
                    Utilities.z(parse.getQueryParameter("intensity"));
                    j6Var.y = 45;
                    try {
                        String queryParameter2 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            j6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                            if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                j6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                j6Var.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                j6Var.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    try {
                        String queryParameter3 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            j6Var.y = Utilities.z(queryParameter3).intValue();
                        }
                    } catch (Exception unused4) {
                    }
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (!z10 && org.telegram.ui.ActionBar.k6.M == null) {
                org.telegram.ui.ActionBar.k6.K = j6Var;
                if (org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J) {
                    org.telegram.ui.ActionBar.k6.T = 2000;
                    org.telegram.ui.ActionBar.k6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new org.telegram.messenger.hc(15), 2100L);
                }
            }
            org.telegram.ui.ActionBar.k6.I = j6Var;
            org.telegram.ui.ActionBar.k6.t1(false, false);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (org.telegram.ui.ActionBar.k6.M == null && !org.telegram.ui.ActionBar.k6.Q) {
            hp.s1(j6Var.F).x4(j6Var, j6Var.k(false), z10, false);
        }
        nVar.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        int i3;
        ArrayList arrayList;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList2;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i10;
        ArrayList arrayList3;
        int i11;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList4;
        int i12;
        char c10;
        a0.h hVar;
        boolean z10;
        Integer num;
        int i13;
        int i14;
        ArrayList arrayList5;
        int i15;
        Integer num2;
        Integer num3;
        int i16;
        char c11;
        wm wmVar;
        int i17;
        org.telegram.ui.ActionBar.e6 e6Var;
        ai.x2 x2Var;
        int i18 = 4;
        SQLitePreparedStatement executeFast2 = null;
        int i19 = 2;
        switch (this.a) {
            case 0:
                v8 v8Var = (v8) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z11 = this.b;
                ArrayList arrayList6 = v8Var.l;
                int i20 = v8Var.a;
                if (iArr[0] != v8Var.m) {
                    return;
                }
                v8Var.i = false;
                v8Var.m = -1;
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    hp.s1(i20).Y3(tL_payments_savedStarGifts.users, false);
                    hp.s1(i20).S3(tL_payments_savedStarGifts.chats, false);
                    if (z11) {
                        arrayList6.clear();
                    }
                    arrayList6.addAll(tL_payments_savedStarGifts.gifts);
                    v8Var.k = tL_payments_savedStarGifts.next_offset;
                    v8Var.n = tL_payments_savedStarGifts.count;
                    v8Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                    v8Var.j = arrayList6.size() > v8Var.n || v8Var.k == null;
                    c2 = 1;
                } else {
                    c2 = 1;
                    v8Var.j = true;
                }
                hs f10 = hs.f(i20);
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(v8Var.b);
                objArr[c2] = v8Var;
                f10.k(hs.G3, objArr);
                return;
            case 1:
                ei.h3 h3Var = (ei.h3) this.c;
                View view = (View) this.d;
                dh.n0 n0Var = (dh.n0) this.e;
                boolean z12 = this.b;
                ei.j4 j4Var = h3Var.a;
                org.telegram.ui.Components.t4.Z(j4Var.m2, 1, j4Var.l1, new ei.g3(h3Var, z12, n0Var, view));
                return;
            case 2:
                gi.r1 r1Var = (gi.r1) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                String str = (String) this.d;
                boolean z13 = this.b;
                gi.t1 t1Var = r1Var.s;
                if (r1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        gi.i2 i2Var = t1Var.r;
                        ArrayList arrayList7 = t1Var.n;
                        int i21 = gi.i2.z1;
                        qr.a0(i2Var.a).v1(str, messages_botresults);
                        r1Var.h = messages_botresults.next_offset;
                        if (z13) {
                            arrayList7.clear();
                        }
                        arrayList7.size();
                        arrayList7.addAll(messages_botresults.results);
                        r1Var.f();
                    }
                    t1Var.d.c(false);
                    r1Var.r = false;
                    return;
                }
                return;
            case 3:
                gi.f7 f7Var = (gi.f7) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z14 = this.b;
                Runnable runnable = (Runnable) this.e;
                f7Var.getClass();
                try {
                    bitmap.compress(z14 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(f7Var.Z0));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, false);
                    if (z14) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(f7Var.Z0));
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, false);
                        }
                    }
                }
                bitmap.recycle();
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 4:
                Context context = (Context) this.c;
                boolean z15 = this.b;
                k2.i0 i0Var = (k2.i0) this.d;
                l2.k kVar = (l2.k) this.e;
                l2.i i22 = l2.i.i(context);
                if (i22 == null) {
                    g2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z15) {
                    l2.f fVar = i0Var.s;
                    fVar.getClass();
                    fVar.f.a(i22);
                }
                LogSessionId l10 = i22.l();
                synchronized (kVar) {
                    l2.j jVar = kVar.b;
                    jVar.getClass();
                    jVar.f(l10);
                }
                return;
            case 5:
                kg.e0 e0Var = (kg.e0) this.c;
                boolean z16 = this.b;
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) this.d;
                kg.b0 b0Var = (kg.b0) this.e;
                if (z16) {
                    return;
                }
                e0Var.c = b0Var;
                x3Var.setRightText(e0Var.H(b0Var));
                x3Var.setRightTextMargin(6);
                e0Var.J.clear();
                e0Var.d = true;
                e0Var.f();
                e0Var.P();
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                boolean z17 = this.b;
                mi.q3 q3Var = (mi.q3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                mi.i4.k(d2Var, z17, new mi.d4(0, q3Var, trim));
                return;
            case 7:
                o4.e0 e0Var2 = (o4.e0) this.c;
                boolean z18 = this.b;
                o4.v vVar = (o4.v) this.d;
                Runnable runnable2 = (Runnable) this.e;
                o4.h1 h1Var = e0Var2.g;
                if (z18) {
                    o4.n1 n1Var = new o4.n1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.s s6 = h1Var.b.s(vVar);
                        if (s6 != null) {
                            i3 = s6.b(o4.e0.B).n;
                        } else if (e0Var2.h(vVar)) {
                            yd.b(new o4.r1(0));
                            i3 = 0;
                        } else {
                            yd.b(new o4.r1(-100));
                        }
                        o4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.d(i3, n1Var);
                        }
                    } catch (DeadObjectException unused) {
                        h1Var.b.K(vVar);
                        yd.b(new o4.r1(-100));
                    } catch (RemoteException e12) {
                        g2.a.m("MediaSessionImpl", "Exception in " + vVar, e12);
                        yd.b(new o4.r1(-1));
                    }
                }
                runnable2.run();
                h1Var.b.k(vVar);
                return;
            case 8:
                org.telegram.messenger.x2 x2Var2 = (org.telegram.messenger.x2) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z19 = this.b;
                HashMap hashMap = x2Var2.c;
                if (hashMap == null || (arrayList = (ArrayList) hashMap.get(pair)) == null) {
                    return;
                }
                int size = arrayList.size();
                int i23 = 0;
                while (i23 < size) {
                    Object obj2 = arrayList.get(i23);
                    i23++;
                    ((u10) obj2).a(obj);
                }
                if (z19) {
                    arrayList.clear();
                }
                if (z19) {
                    x2Var2.c.remove(pair);
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) this.c;
                boolean z20 = this.b;
                TLObject tLObject3 = (TLObject) this.e;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.d;
                r3Var.u = false;
                if (z20) {
                    r3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    hp.s1(r3Var.C.a).Y3(groupparticipants.users, false);
                    hp.s1(r3Var.C.a).S3(groupparticipants.chats, false);
                    r3Var.m(groupparticipants.participants, z20, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.d4 d4Var = (org.telegram.messenger.d4) this.c;
                List list = (List) this.d;
                ResultCallback resultCallback = (ResultCallback) this.e;
                boolean z21 = this.b;
                d4Var.b = new ArrayList(list);
                resultCallback.onComplete(d4Var.e((z21 ? 1 : 0) | 2));
                return;
            case 11:
                org.telegram.messenger.g5 g5Var = (org.telegram.messenger.g5) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                boolean z22 = this.b;
                String str2 = (String) this.e;
                int size2 = arrayList8.size();
                boolean z23 = false;
                int i24 = 0;
                while (i24 < size2) {
                    Object obj3 = arrayList8.get(i24);
                    i24++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) g5Var.g0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        g5Var.f0.remove(tL_contact);
                        g5Var.g0.remove(Long.valueOf(user.id));
                        z23 = true;
                    }
                }
                if (z23) {
                    g5Var.d(false);
                }
                hs notificationCenter = g5Var.getNotificationCenter();
                int i25 = hp.C8;
                notificationCenter.k(2, 1);
                g5Var.getNotificationCenter().k(25, new Object[0]);
                if (z22) {
                    hs.e().k(hs.P4, 1, bd.a0("DeletedFromYourContacts", null, 2131751467, str2));
                    return;
                }
                return;
            case 12:
                MediaController mediaController = (MediaController) this.c;
                ro roVar = (ro) this.d;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.e;
                boolean z24 = this.b;
                String[] strArr = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = roVar.b;
                tL_document.id = roVar.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = roVar.c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar.a).getCurrentDatacenterId();
                org.telegram.messenger.w7.G(cVar.a);
                File K = org.telegram.messenger.w7.K(tL_document, null, true, true);
                if (!K.exists()) {
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.y4(23, cVar, tL_document));
                    return;
                } else {
                    if (z24) {
                        return;
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.y4(22, mediaController, K));
                    return;
                }
            case 13:
                MediaController mediaController2 = (MediaController) this.c;
                File file = (File) this.d;
                boolean z25 = this.b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.e;
                String[] strArr2 = MediaController.W1;
                boolean exists = file.exists();
                if (!exists) {
                    boolean z26 = org.telegram.messenger.r2.a;
                    org.telegram.messenger.a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                }
                if (exists) {
                    li.b0(mediaController2.i1).B1(mediaController2.n1, mediaController2.o1, gi.a(mediaController2, file.getAbsolutePath(), z25));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.i1).getCurrentTime();
                tL_document2.size = (int) file.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.l1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                hs.f(mediaController2.i1).k(hs.o2, new Object[0]);
                hs.f(mediaController2.i1).k(hs.s2, Integer.valueOf(mediaController2.h1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 14:
                li liVar = (li) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                boolean z27 = this.b;
                ArrayList arrayList10 = (ArrayList) this.e;
                liVar.getMessagesController().Y3(arrayList9, z27);
                liVar.getMessagesController().S3(arrayList10, z27);
                return;
            case 15:
                li liVar2 = (li) this.c;
                boolean z28 = this.b;
                ArrayList arrayList11 = (ArrayList) this.d;
                a0.h hVar2 = (a0.h) this.e;
                try {
                    liVar2.getMessagesStorage().b.beginTransaction();
                    if (z28) {
                        executeFast = liVar2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = liVar2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = liVar2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i26 = 0;
                    while (i26 < arrayList11.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList11.get(i26);
                        SparseArray sparseArray = (SparseArray) hVar2.f(zi.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            i10 = i19;
                            arrayList3 = arrayList11;
                        } else {
                            zi.r5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            int i27 = 0;
                            while (i27 < arrayList2.size()) {
                                zi ziVar = (zi) arrayList2.get(i27);
                                int i28 = 0;
                                while (i28 < i19) {
                                    SQLitePreparedStatement sQLitePreparedStatement3 = i28 == 0 ? executeFast : executeFast2;
                                    if (sQLitePreparedStatement3 == null) {
                                        sQLitePreparedStatement2 = executeFast;
                                        i11 = i19;
                                        arrayList4 = arrayList11;
                                    } else {
                                        sQLitePreparedStatement3.requery();
                                        sQLitePreparedStatement3.bindByteBuffer(1, nativeByteBuffer);
                                        sQLitePreparedStatement3.bindInteger(i19, message.id);
                                        i11 = i19;
                                        sQLitePreparedStatement3.bindInteger(3, ziVar.f1());
                                        sQLitePreparedStatement2 = executeFast;
                                        arrayList4 = arrayList11;
                                        sQLitePreparedStatement3.bindLong(4, zi.B0(ziVar.k));
                                        sQLitePreparedStatement3.step();
                                    }
                                    i28++;
                                    arrayList11 = arrayList4;
                                    i19 = i11;
                                    executeFast = sQLitePreparedStatement2;
                                }
                                i27++;
                                i19 = i19;
                            }
                            sQLitePreparedStatement = executeFast;
                            i10 = i19;
                            arrayList3 = arrayList11;
                            nativeByteBuffer.reuse();
                        }
                        i26++;
                        arrayList11 = arrayList3;
                        i19 = i10;
                        executeFast = sQLitePreparedStatement;
                    }
                    executeFast.dispose();
                    if (executeFast2 != null) {
                        executeFast2.dispose();
                    }
                    liVar2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 16:
                li liVar3 = (li) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                boolean z29 = this.b;
                if (tLObject4 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z29) {
                        liVar3.K1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        liVar3.L1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 17:
                li liVar4 = (li) this.c;
                TLObject tLObject5 = (TLObject) this.e;
                String str3 = (String) this.d;
                boolean z30 = this.b;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    liVar4.s1(str3, z30, (TLRPC.TL_messages_stickerSet) tLObject5, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    liVar4.s1(str3, z30, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 18:
                hp hpVar = (hp) this.c;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z31 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.d;
                LongSparseIntArray longSparseIntArray = hpVar.H0;
                if (tLObject6 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject6;
                    hpVar.Y3(contacts_blocked.users, false);
                    hpVar.S3(contacts_blocked.chats, false);
                    hpVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z31) {
                        longSparseIntArray.clear();
                    }
                    hpVar.I0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    hpVar.J0 = contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i29 = 0; i29 < size3; i29++) {
                        longSparseIntArray.put(zi.C1(contacts_blocked.blocked.get(i29).peer_id), 1);
                    }
                    hpVar.G0 = false;
                    hpVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 19:
                hp hpVar2 = (hp) this.c;
                boolean z32 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList12 = (ArrayList) this.e;
                if (z32) {
                    i12 = 0;
                    hpVar2.getNotificationCenter().k(2, 64);
                } else {
                    i12 = 0;
                }
                hpVar2.l5(i12, -updates.chat_id, arrayList12);
                hpVar2.getNotificationCenter().k(3, new Object[i12]);
                return;
            case 20:
                ko koVar = (ko) this.c;
                int[] iArr2 = (int[]) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.b;
                int i30 = koVar.a;
                ArrayList arrayList13 = koVar.e;
                if (iArr2[0] != koVar.f) {
                    return;
                }
                koVar.c = false;
                koVar.f = -1;
                if (tLObject7 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                    hp.s1(i30).S3(messages_chats.chats, false);
                    if (z33) {
                        arrayList13.clear();
                    }
                    arrayList13.addAll(messages_chats.chats);
                    koVar.g = messages_chats instanceof TLRPC.TL_messages_chatsSlice ? messages_chats.count : messages_chats.chats.size();
                    koVar.d = arrayList13.size() >= koVar.g;
                    c10 = 1;
                } else {
                    c10 = 1;
                    koVar.d = true;
                }
                hs f11 = hs.f(i30);
                Object[] objArr2 = new Object[2];
                objArr2[0] = Long.valueOf(koVar.b);
                objArr2[c10] = koVar;
                f11.k(hs.O3, objArr2);
                return;
            case 21:
                ((qr) this.c).n1((List) this.d, (List) this.e, this.b);
                return;
            case 22:
                us usVar = (us) this.c;
                a0.h hVar3 = (a0.h) this.d;
                boolean z34 = this.b;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = usVar.b;
                a0.h hVar4 = usVar.c;
                a0.h hVar5 = usVar.f;
                int i31 = usVar.J;
                usVar.getAccountInstance().c();
                Integer num4 = 0;
                int i32 = 0;
                while (i32 < hVar3.m()) {
                    long j10 = hVar3.j(i32);
                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j10);
                    if (sparseArray2 == null) {
                        hVar = hVar3;
                        z10 = z34;
                        num = num4;
                        i13 = i32;
                    } else {
                        ArrayList arrayList16 = (ArrayList) hVar3.f(j10);
                        hVar = hVar3;
                        int i33 = 0;
                        for (int size4 = arrayList16.size(); i33 < size4; size4 = i15) {
                            int i34 = i33;
                            int intValue = ((Integer) arrayList16.get(i33)).intValue();
                            boolean z35 = z34;
                            zi ziVar2 = (zi) sparseArray2.get(intValue);
                            Integer num5 = num4;
                            if (ziVar2 == null || ziVar2.J || (z35 && !ziVar2.I)) {
                                i14 = i32;
                                arrayList5 = arrayList16;
                                i15 = size4;
                            } else {
                                i14 = i32;
                                long B0 = zi.B0(ziVar2.k);
                                Integer num6 = (Integer) hVar5.f(B0);
                                Integer num7 = num6 == null ? num5 : num6;
                                int intValue2 = num7.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    arrayList5 = arrayList16;
                                    usVar.e.l(B0);
                                    Integer num8 = num7;
                                    i15 = size4;
                                    num2 = num8;
                                    num3 = num5;
                                } else {
                                    arrayList5 = arrayList16;
                                    Integer num9 = num7;
                                    i15 = size4;
                                    num2 = num9;
                                    num3 = valueOf;
                                }
                                if (!num3.equals(num2)) {
                                    Integer num10 = num2;
                                    if (!usVar.getMessagesController().p2(B0)) {
                                        if (usVar.getMessagesController().t2(B0)) {
                                            int i35 = usVar.J - (num10.intValue() > 0 ? 1 : 0);
                                            usVar.J = i35;
                                            usVar.J = i35 + (num3.intValue() > 0 ? 1 : 0);
                                        } else {
                                            int intValue3 = usVar.J - num10.intValue();
                                            usVar.J = intValue3;
                                            usVar.J = num3.intValue() + intValue3;
                                        }
                                    }
                                    hVar5.k(num3, B0);
                                }
                                if (num3.intValue() == 0) {
                                    hVar5.l(B0);
                                    usVar.r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList15.remove(ziVar2);
                                usVar.a.remove(ziVar2);
                                if (us.E(ziVar2)) {
                                    usVar.K--;
                                }
                                arrayList14.add(ziVar2);
                            }
                            i33 = i34 + 1;
                            num4 = num5;
                            z34 = z35;
                            i32 = i14;
                            arrayList16 = arrayList5;
                        }
                        z10 = z34;
                        num = num4;
                        i13 = i32;
                        if (sparseArray2.size() == 0) {
                            hVar4.l(j10);
                        }
                    }
                    i32 = i13 + 1;
                    hVar3 = hVar;
                    num4 = num;
                    z34 = z10;
                }
                if (!arrayList14.isEmpty()) {
                    org.telegram.messenger.g0.h3(new ks(usVar, arrayList14, 1));
                }
                if (i31 != usVar.J) {
                    if (usVar.L) {
                        usVar.Q(usVar.M > usVar.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList15.clear();
                        usVar.Z(usVar.L);
                    }
                    org.telegram.messenger.g0.h3(new os(usVar, hVar5.m(), 1));
                }
                usVar.L = false;
                if (usVar.S) {
                    usVar.S(usVar.z());
                    return;
                }
                return;
            case 23:
                vy vyVar = (vy) this.c;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.d;
                xy xyVar = (xy) this.e;
                boolean z36 = this.b;
                vyVar.a = yy.C(cVar2.a).A(xyVar.c, xyVar.a, xyVar.x);
                if (z36 && xyVar.r) {
                    new File(xyVar.c).delete();
                }
                vyVar.c.countDown();
                return;
            case 24:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 25:
                a();
                return;
            case 26:
                wm.C1((wm) this.c, (String) this.d, (zi) this.e, this.b);
                return;
            case 27:
                wm wmVar2 = (wm) this.c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.e;
                boolean z37 = this.b;
                if (g6Var == null) {
                    UndoView undoView = wmVar2.N3;
                    org.telegram.ui.ActionBar.k6.K1(j6Var, false, -1, undoView != null ? undoView.getUndoButton() : null);
                    return;
                }
                wmVar2.getClass();
                org.telegram.ui.ActionBar.g6 k10 = j6Var.k(false);
                int i36 = g6Var.a;
                UndoView undoView2 = wmVar2.N3;
                org.telegram.ui.ActionBar.k6.K1(j6Var, false, i36, undoView2 != null ? undoView2.getUndoButton() : null);
                if (z37) {
                    org.telegram.ui.ActionBar.k6.l0(j6Var, k10, true);
                    return;
                }
                return;
            case 28:
                hm hmVar = (hm) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z38 = this.b;
                zi ziVar3 = (zi) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                wm wmVar3 = hmVar.a;
                org.telegram.messenger.k5.q(null, null, 2131744404, new Object[]{wmVar3.getMessagesController().B1(org.telegram.messenger.m5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                dg.a m10 = dg.a.m(message2.suggested_post.price);
                int i37 = m10.a == dg.b.b ? ((org.telegram.messenger.j0) wmVar3.getMessagesController().x7.f.b).c : ((org.telegram.messenger.j0) wmVar3.getMessagesController().x7.c.b).c;
                if (z38) {
                    c11 = 0;
                    wmVar = wmVar3;
                    i16 = 1;
                    m10 = dg.a.i((m10.b / 1000) * i37, m10.a);
                } else {
                    i16 = 1;
                    c11 = 0;
                    wmVar = wmVar3;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z38) {
                        String f12 = m10.f();
                        String J0 = ii.k.J0(i37);
                        Object[] objArr3 = new Object[2];
                        objArr3[c11] = f12;
                        objArr3[i16] = J0;
                        org.telegram.messenger.k5.q(null, null, 2131744401, objArr3, spannableStringBuilder);
                    } else {
                        Object[] objArr4 = new Object[i16];
                        objArr4[c11] = m10.f();
                        org.telegram.messenger.k5.q(null, null, 2131744400, objArr4, spannableStringBuilder);
                    }
                } else if (z38) {
                    String f13 = m10.f();
                    String K0 = x0.K0(message2.suggested_post.schedule_date);
                    String J02 = ii.k.J0(i37);
                    Object[] objArr5 = new Object[3];
                    objArr5[c11] = f13;
                    objArr5[1] = K0;
                    objArr5[2] = J02;
                    org.telegram.messenger.k5.q(null, null, 2131744402, objArr5, spannableStringBuilder);
                } else {
                    String f14 = m10.f();
                    String K02 = x0.K0(message2.suggested_post.schedule_date);
                    Object[] objArr6 = new Object[2];
                    objArr6[c11] = f14;
                    objArr6[1] = K02;
                    org.telegram.messenger.k5.q(null, null, 2131744399, objArr6, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i17 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                Object[] objArr7 = new Object[1];
                objArr7[c11] = Long.valueOf(hp.s1(i17).x7.i.g2(TimeUnit.HOURS));
                org.telegram.messenger.k5.q(null, null, 2131744403, objArr7, spannableStringBuilder);
                org.telegram.ui.Components.ac[] acVarArr = new org.telegram.ui.Components.ac[1];
                org.telegram.ui.s5 s5Var = new org.telegram.ui.s5(acVarArr, i18);
                wm wmVar4 = wmVar;
                org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                org.telegram.ui.ActionBar.s1 u02 = org.telegram.ui.Components.t4.u0(wmVar4, bd.M0(2131744384, null), spannableStringBuilder, bd.M0(message2.suggested_post.schedule_date == 0 ? 2131748258 : 2131744383, null), false, new ai.t6(hmVar, message2, s1VarArr, ziVar3, s5Var, 27));
                s1VarArr[c11] = u02;
                u02.setOnDismissListener(s5Var);
                if (z38 && m10.a == dg.b.a) {
                    org.telegram.ui.Components.va a10 = org.telegram.ui.Components.wa.a(wmVar4.getParentActivity());
                    e6Var = ((org.telegram.ui.ActionBar.d2) wmVar4).resourceProvider;
                    org.telegram.ui.Components.ac G = new org.telegram.ui.Components.fc(a10, e6Var).G(R.raw.info, 10, bd.M0(2131744398, null));
                    G.j = 60000;
                    G.k(true);
                    acVarArr[c11] = G;
                    return;
                }
                return;
            default:
                um umVar = (um) this.c;
                umVar.s((org.telegram.ui.ActionBar.p3) this.d, (TLRPC.WallPaper) this.e, this.b);
                umVar.p(umVar.h);
                kl klVar = umVar.G.m1;
                if (klVar == null || (x2Var = klVar.M) == null) {
                    return;
                }
                x2Var.invalidate();
                return;
        }
    }

    public /* synthetic */ u8(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ u8(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ u8(Object obj, TLObject tLObject, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ u8(Object obj, boolean z10, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ u8(org.telegram.messenger.r3 r3Var, boolean z10, TLObject tLObject, TL_phone.getGroupParticipants getgroupparticipants) {
        this.a = 9;
        this.c = r3Var;
        this.b = z10;
        this.e = tLObject;
        this.d = getgroupparticipants;
    }

    public /* synthetic */ u8(li liVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.a = 17;
        this.c = liVar;
        this.e = tLObject;
        this.d = str;
        this.b = z10;
    }

    public /* synthetic */ u8(hp hpVar, TLObject tLObject, boolean z10, TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked) {
        this.a = 18;
        this.c = hpVar;
        this.e = tLObject;
        this.b = z10;
        this.d = tL_contacts_getBlocked;
    }
}

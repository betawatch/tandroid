package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import bi.o2;
import ch.p0;
import da.q2;
import di.m8;
import di.s0;
import fi.b4;
import fi.y2;
import fi.z2;
import hi.d7;
import hi.i2;
import hi.r1;
import hi.t1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jg.h0;
import kg.j1;
import oi.e4;
import oi.n3;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.c6;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.d4;
import org.telegram.messenger.dz;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.g5;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j0;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.ni;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.qo;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.r3;
import org.telegram.messenger.si;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t0;
import org.telegram.messenger.us;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.messenger.x2;
import org.telegram.messenger.x4;
import org.telegram.messenger.xo;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;
import org.telegram.ui.lm;
import org.telegram.ui.ol;
import org.telegram.ui.q5;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(z2 z2Var, View view, p0 p0Var, boolean z10, boolean z11) {
        this.a = 2;
        this.c = z2Var;
        this.d = view;
        this.e = p0Var;
        this.b = z10;
    }

    private final void a() {
        String[] split;
        String[] strArr = (String[]) this.c;
        i6 i6Var = (i6) this.d;
        boolean z10 = this.b;
        j1 j1Var = (j1) this.e;
        try {
            j6.g0 = j6.km.get(j6.g5, -1);
            if (TextUtils.isEmpty(strArr[0])) {
                try {
                    if (i6Var.c != null) {
                        new File(i6Var.c).delete();
                    }
                } catch (Exception unused) {
                }
                i6Var.c = null;
                j6.h0 = null;
            } else {
                j6.h0 = strArr[0];
                String absolutePath = new File(t0.h(), Utilities.a(j6.h0) + ".wp").getAbsolutePath();
                try {
                    String str = i6Var.c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(i6Var.c).delete();
                    }
                } catch (Exception unused2) {
                }
                i6Var.c = absolutePath;
                try {
                    Uri parse = Uri.parse(j6.h0);
                    i6Var.e = parse.getQueryParameter("slug");
                    String queryParameter = parse.getQueryParameter("mode");
                    if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                        for (int i7 = 0; i7 < split.length; i7++) {
                            if ("blur".equals(split[i7])) {
                                i6Var.h = true;
                            } else if ("motion".equals(split[i7])) {
                                i6Var.n = true;
                            }
                        }
                    }
                    Utilities.z(parse.getQueryParameter("intensity"));
                    i6Var.y = 45;
                    try {
                        String queryParameter2 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            i6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                            if (queryParameter2.length() >= 13 && g0.S1(queryParameter2.charAt(6))) {
                                i6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter2.length() >= 20 && g0.S1(queryParameter2.charAt(13))) {
                                i6Var.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter2.length() == 27 && g0.S1(queryParameter2.charAt(20))) {
                                i6Var.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    try {
                        String queryParameter3 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            i6Var.y = Utilities.z(queryParameter3).intValue();
                        }
                    } catch (Exception unused4) {
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            if (!z10 && j6.M == null) {
                j6.K = i6Var;
                if (j6.I == j6.J) {
                    j6.T = 2000;
                    j6.U = SystemClock.elapsedRealtime();
                    g0.i3(new c6(17), 2100L);
                }
            }
            j6.I = i6Var;
            j6.t1(false, false);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (j6.M == null && !j6.Q) {
            np.s1(i6Var.F).x4(i6Var, i6Var.k(false), z10, false);
        }
        j1Var.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        ArrayList arrayList;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList2;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList3;
        int i7;
        int i10;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList4;
        int i11;
        char c11;
        int i12;
        a0.h hVar;
        boolean z10;
        Integer num;
        int i13;
        int i14;
        Integer num2;
        int i15;
        Integer num3;
        Integer num4;
        gj gjVar;
        int i16;
        e6 e6Var;
        o2 o2Var;
        SQLitePreparedStatement executeFast2 = null;
        int i17 = 2;
        int i18 = 1;
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.c;
                q2 q2Var = (q2) this.d;
                ca.c cVar = (ca.c) this.e;
                boolean z11 = this.b;
                e0Var.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                e0Var.b.e(q2Var, cVar.a, z11);
                return;
            case 1:
                m8 m8Var = (m8) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z12 = this.b;
                ArrayList arrayList5 = m8Var.l;
                int i19 = m8Var.a;
                if (iArr[0] != m8Var.m) {
                    return;
                }
                m8Var.i = false;
                m8Var.m = -1;
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    np.s1(i19).Y3(tL_payments_savedStarGifts.users, false);
                    np.s1(i19).S3(tL_payments_savedStarGifts.chats, false);
                    if (z12) {
                        arrayList5.clear();
                    }
                    arrayList5.addAll(tL_payments_savedStarGifts.gifts);
                    m8Var.k = tL_payments_savedStarGifts.next_offset;
                    m8Var.n = tL_payments_savedStarGifts.count;
                    m8Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                    m8Var.j = arrayList5.size() > m8Var.n || m8Var.k == null;
                    c10 = 1;
                } else {
                    c10 = 1;
                    m8Var.j = true;
                }
                ns f10 = ns.f(i19);
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(m8Var.b);
                objArr[c10] = m8Var;
                f10.k(ns.G3, objArr);
                return;
            case 2:
                z2 z2Var = (z2) this.c;
                View view = (View) this.d;
                p0 p0Var = (p0) this.e;
                boolean z13 = this.b;
                b4 b4Var = z2Var.a;
                t4.X(b4Var.m2, 1, b4Var.l1, new y2(z2Var, z13, p0Var, view));
                return;
            case 3:
                r1 r1Var = (r1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.e;
                boolean z14 = this.b;
                t1 t1Var = r1Var.s;
                if (r1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        i2 i2Var = t1Var.r;
                        ArrayList arrayList6 = t1Var.n;
                        int i20 = i2.C1;
                        vr.a0(i2Var.a).v1(str, messages_botresults);
                        r1Var.h = messages_botresults.next_offset;
                        if (z14) {
                            arrayList6.clear();
                        }
                        arrayList6.size();
                        arrayList6.addAll(messages_botresults.results);
                        r1Var.f();
                    }
                    t1Var.d.c(false);
                    r1Var.r = false;
                    return;
                }
                return;
            case 4:
                d7 d7Var = (d7) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.b;
                Runnable runnable = (Runnable) this.e;
                d7Var.getClass();
                try {
                    bitmap.compress(z15 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(d7Var.Z0));
                } catch (Exception e10) {
                    a8.g(e10, false);
                    if (z15) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(d7Var.Z0));
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    }
                }
                bitmap.recycle();
                g0.h3(runnable);
                return;
            case 5:
                h0 h0Var = (h0) this.c;
                boolean z16 = this.b;
                x3 x3Var = (x3) this.d;
                jg.e0 e0Var2 = (jg.e0) this.e;
                if (z16) {
                    return;
                }
                h0Var.c = e0Var2;
                x3Var.setRightText(h0Var.H(e0Var2));
                x3Var.setRightTextMargin(6);
                h0Var.J.clear();
                h0Var.d = true;
                h0Var.f();
                h0Var.P();
                return;
            case 6:
                Context context = (Context) this.c;
                boolean z17 = this.b;
                l2.f0 f0Var = (l2.f0) this.d;
                m2.j jVar = (m2.j) this.e;
                m2.h g10 = m2.h.g(context);
                if (g10 == null) {
                    h2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    m2.e eVar = f0Var.s;
                    eVar.getClass();
                    eVar.f.a(g10);
                }
                LogSessionId i21 = g10.i();
                synchronized (jVar) {
                    m2.i iVar = jVar.b;
                    iVar.getClass();
                    iVar.f(i21);
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                e2 e2Var = (e2) this.d;
                boolean z18 = this.b;
                n3 n3Var = (n3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                e4.k(e2Var, z18, new m2.d(3, n3Var, trim));
                return;
            case 8:
                x2 x2Var = (x2) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z19 = this.b;
                HashMap hashMap = x2Var.c;
                if (hashMap == null || (arrayList = (ArrayList) hashMap.get(pair)) == null) {
                    return;
                }
                int size = arrayList.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj2 = arrayList.get(i22);
                    i22++;
                    ((z10) obj2).a(obj);
                }
                if (z19) {
                    arrayList.clear();
                }
                if (z19) {
                    x2Var.c.remove(pair);
                    return;
                }
                return;
            case 9:
                r3 r3Var = (r3) this.c;
                boolean z20 = this.b;
                TLObject tLObject3 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                r3Var.u = false;
                if (z20) {
                    r3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    np.s1(r3Var.C.a).Y3(groupparticipants.users, false);
                    np.s1(r3Var.C.a).S3(groupparticipants.chats, false);
                    r3Var.m(groupparticipants.participants, z20, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                d4 d4Var = (d4) this.c;
                List list = (List) this.d;
                ResultCallback resultCallback = (ResultCallback) this.e;
                boolean z21 = this.b;
                d4Var.b = new ArrayList(list);
                resultCallback.onComplete(d4Var.e((z21 ? 1 : 0) | 2));
                return;
            case 11:
                g5 g5Var = (g5) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                boolean z22 = this.b;
                String str2 = (String) this.e;
                int size2 = arrayList7.size();
                boolean z23 = false;
                int i23 = 0;
                while (i23 < size2) {
                    Object obj3 = arrayList7.get(i23);
                    i23++;
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
                ns notificationCenter = g5Var.getNotificationCenter();
                int i24 = np.D8;
                notificationCenter.k(2, 1);
                g5Var.getNotificationCenter().k(25, new Object[0]);
                if (z22) {
                    ns.e().k(ns.P4, 1, hd.a0("DeletedFromYourContacts", null, 2131751466, str2));
                    return;
                }
                return;
            case 12:
                MediaController mediaController = (MediaController) this.c;
                xo xoVar = (xo) this.d;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.e;
                boolean z24 = this.b;
                String[] strArr = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = xoVar.b;
                tL_document.id = xoVar.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = xoVar.c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar2.a).getCurrentDatacenterId();
                w7.G(cVar2.a);
                File J = w7.J(tL_document, null, true, true);
                if (!J.exists()) {
                    g0.h3(new x4(23, cVar2, tL_document));
                    return;
                } else {
                    if (z24) {
                        return;
                    }
                    g0.h3(new x4(22, mediaController, J));
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
                    boolean z26 = r2.a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                }
                if (exists) {
                    si.b0(mediaController2.i1).B1(mediaController2.n1, mediaController2.o1, ni.a(mediaController2, file.getAbsolutePath(), z25));
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
                ns.f(mediaController2.i1).k(ns.o2, new Object[0]);
                ns.f(mediaController2.i1).k(ns.s2, Integer.valueOf(mediaController2.h1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 14:
                si siVar = (si) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                boolean z27 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                siVar.getMessagesController().Y3(arrayList8, z27);
                siVar.getMessagesController().S3(arrayList9, z27);
                return;
            case 15:
                si siVar2 = (si) this.c;
                boolean z28 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                a0.h hVar2 = (a0.h) this.e;
                try {
                    siVar2.getMessagesStorage().b.beginTransaction();
                    if (z28) {
                        executeFast = siVar2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = siVar2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = siVar2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i25 = 0;
                    while (i25 < arrayList10.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList10.get(i25);
                        SparseArray sparseArray = (SparseArray) hVar2.f(gj.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList10;
                            i7 = i17;
                        } else {
                            gj.q5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                                gj gjVar2 = (gj) arrayList2.get(i26);
                                int i27 = 0;
                                while (i27 < i17) {
                                    SQLitePreparedStatement sQLitePreparedStatement3 = i27 == 0 ? executeFast : executeFast2;
                                    if (sQLitePreparedStatement3 == null) {
                                        sQLitePreparedStatement2 = executeFast;
                                        arrayList4 = arrayList10;
                                        i10 = i17;
                                    } else {
                                        sQLitePreparedStatement3.requery();
                                        sQLitePreparedStatement3.bindByteBuffer(1, nativeByteBuffer);
                                        sQLitePreparedStatement3.bindInteger(i17, message.id);
                                        i10 = i17;
                                        sQLitePreparedStatement3.bindInteger(3, gjVar2.e1());
                                        sQLitePreparedStatement2 = executeFast;
                                        arrayList4 = arrayList10;
                                        sQLitePreparedStatement3.bindLong(4, gj.B0(gjVar2.k));
                                        sQLitePreparedStatement3.step();
                                    }
                                    i27++;
                                    i17 = i10;
                                    arrayList10 = arrayList4;
                                    executeFast = sQLitePreparedStatement2;
                                }
                            }
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList10;
                            i7 = i17;
                            nativeByteBuffer.reuse();
                        }
                        i25++;
                        i17 = i7;
                        arrayList10 = arrayList3;
                        executeFast = sQLitePreparedStatement;
                    }
                    executeFast.dispose();
                    if (executeFast2 != null) {
                        executeFast2.dispose();
                    }
                    siVar2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 16:
                si siVar3 = (si) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z29 = this.b;
                if (tLObject4 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z29) {
                        siVar3.K1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        siVar3.L1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 17:
                si siVar4 = (si) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = (String) this.e;
                boolean z30 = this.b;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    siVar4.s1(str3, z30, (TLRPC.TL_messages_stickerSet) tLObject5, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    siVar4.s1(str3, z30, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 18:
                np npVar = (np) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z31 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                if (tLObject6 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject6;
                    npVar.Y3(contacts_blocked.users, false);
                    npVar.S3(contacts_blocked.chats, false);
                    npVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z31) {
                        longSparseIntArray.clear();
                    }
                    npVar.I0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    npVar.J0 = contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i28 = 0; i28 < size3; i28++) {
                        longSparseIntArray.put(gj.B1(contacts_blocked.blocked.get(i28).peer_id), 1);
                    }
                    npVar.G0 = false;
                    npVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 19:
                np npVar2 = (np) this.c;
                boolean z32 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                if (z32) {
                    i11 = 0;
                    npVar2.getNotificationCenter().k(2, 64);
                } else {
                    i11 = 0;
                }
                npVar2.m5(i11, -updates.chat_id, arrayList11);
                npVar2.getNotificationCenter().k(3, new Object[i11]);
                return;
            case 20:
                qo qoVar = (qo) this.c;
                int[] iArr2 = (int[]) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.b;
                int i29 = qoVar.a;
                ArrayList arrayList12 = qoVar.e;
                if (iArr2[0] != qoVar.f) {
                    return;
                }
                qoVar.c = false;
                qoVar.f = -1;
                if (tLObject7 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                    np.s1(i29).S3(messages_chats.chats, false);
                    if (z33) {
                        arrayList12.clear();
                    }
                    arrayList12.addAll(messages_chats.chats);
                    qoVar.g = messages_chats instanceof TLRPC.TL_messages_chatsSlice ? messages_chats.count : messages_chats.chats.size();
                    qoVar.d = arrayList12.size() >= qoVar.g;
                    c11 = 1;
                } else {
                    c11 = 1;
                    qoVar.d = true;
                }
                ns f11 = ns.f(i29);
                Object[] objArr2 = new Object[2];
                objArr2[0] = Long.valueOf(qoVar.b);
                objArr2[c11] = qoVar;
                f11.k(ns.O3, objArr2);
                return;
            case 21:
                ((vr) this.c).n1((List) this.d, (List) this.e, this.b);
                return;
            case 22:
                at atVar = (at) this.c;
                a0.h hVar3 = (a0.h) this.d;
                boolean z34 = this.b;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = atVar.b;
                a0.h hVar4 = atVar.c;
                a0.h hVar5 = atVar.f;
                int i30 = atVar.J;
                atVar.getAccountInstance().d();
                Integer num5 = 0;
                int i31 = 0;
                while (i31 < hVar3.m()) {
                    long j3 = hVar3.j(i31);
                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j3);
                    if (sparseArray2 == null) {
                        hVar = hVar3;
                        z10 = z34;
                        i12 = i18;
                        num = num5;
                        i13 = i31;
                    } else {
                        ArrayList arrayList15 = (ArrayList) hVar3.f(j3);
                        i12 = i18;
                        int size4 = arrayList15.size();
                        hVar = hVar3;
                        int i32 = 0;
                        while (i32 < size4) {
                            int i33 = i32;
                            int intValue = ((Integer) arrayList15.get(i32)).intValue();
                            boolean z35 = z34;
                            gj gjVar3 = (gj) sparseArray2.get(intValue);
                            ArrayList arrayList16 = arrayList15;
                            if (gjVar3 == null || gjVar3.J || (z35 && !gjVar3.I)) {
                                i14 = size4;
                                num2 = num5;
                                i15 = i31;
                            } else {
                                i14 = size4;
                                long B0 = gj.B0(gjVar3.k);
                                Integer num6 = (Integer) hVar5.f(B0);
                                Integer num7 = num6 == null ? num5 : num6;
                                int intValue2 = num7.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    num2 = num5;
                                    atVar.e.l(B0);
                                    Integer num8 = num7;
                                    i15 = i31;
                                    num3 = num8;
                                    num4 = num2;
                                } else {
                                    num2 = num5;
                                    Integer num9 = num7;
                                    i15 = i31;
                                    num3 = num9;
                                    num4 = valueOf;
                                }
                                if (!num4.equals(num3)) {
                                    Integer num10 = num3;
                                    if (!atVar.getMessagesController().p2(B0)) {
                                        if (atVar.getMessagesController().t2(B0)) {
                                            int i34 = atVar.J - (num10.intValue() > 0 ? i12 : 0);
                                            atVar.J = i34;
                                            atVar.J = i34 + (num4.intValue() > 0 ? i12 : 0);
                                        } else {
                                            int intValue3 = atVar.J - num10.intValue();
                                            atVar.J = intValue3;
                                            atVar.J = num4.intValue() + intValue3;
                                        }
                                    }
                                    hVar5.k(num4, B0);
                                }
                                if (num4.intValue() == 0) {
                                    hVar5.l(B0);
                                    atVar.r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList14.remove(gjVar3);
                                atVar.a.remove(gjVar3);
                                if (at.E(gjVar3)) {
                                    atVar.K--;
                                }
                                arrayList13.add(gjVar3);
                            }
                            i32 = i33 + 1;
                            arrayList15 = arrayList16;
                            z34 = z35;
                            size4 = i14;
                            num5 = num2;
                            i31 = i15;
                        }
                        z10 = z34;
                        num = num5;
                        i13 = i31;
                        if (sparseArray2.size() == 0) {
                            hVar4.l(j3);
                        }
                    }
                    i31 = i13 + 1;
                    hVar3 = hVar;
                    i18 = i12;
                    z34 = z10;
                    num5 = num;
                }
                int i35 = i18;
                if (!arrayList13.isEmpty()) {
                    g0.h3(new qs(atVar, arrayList13, i35));
                }
                if (i30 != atVar.J) {
                    if (atVar.L) {
                        atVar.Q(atVar.M > atVar.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList14.clear();
                        atVar.Z(atVar.L);
                    }
                    g0.h3(new us(atVar, hVar5.m(), 1));
                }
                atVar.L = false;
                if (atVar.S) {
                    atVar.S(atVar.z());
                    return;
                }
                return;
            case 23:
                bz bzVar = (bz) this.c;
                org.telegram.messenger.c cVar3 = (org.telegram.messenger.c) this.d;
                dz dzVar = (dz) this.e;
                boolean z36 = this.b;
                bzVar.a = ez.C(cVar3.a).A(dzVar.c, dzVar.a, dzVar.x);
                if (z36 && dzVar.r) {
                    new File(dzVar.c).delete();
                }
                bzVar.c.countDown();
                return;
            case 24:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 25:
                a();
                return;
            case 26:
                an.S0((an) this.c, (String) this.d, (gj) this.e, this.b);
                return;
            case 27:
                an anVar = (an) this.c;
                g6 g6Var = (g6) this.d;
                i6 i6Var = (i6) this.e;
                boolean z37 = this.b;
                if (g6Var == null) {
                    UndoView undoView = anVar.N3;
                    j6.K1(i6Var, false, -1, undoView != null ? undoView.getUndoButton() : null);
                    return;
                }
                anVar.getClass();
                g6 k10 = i6Var.k(false);
                int i36 = g6Var.a;
                UndoView undoView2 = anVar.N3;
                j6.K1(i6Var, false, i36, undoView2 != null ? undoView2.getUndoButton() : null);
                if (z37) {
                    j6.l0(i6Var, k10, true);
                    return;
                }
                return;
            case 28:
                lm lmVar = (lm) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z38 = this.b;
                gj gjVar4 = (gj) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                an anVar2 = lmVar.a;
                k5.p(null, null, 2131744394, new Object[]{anVar2.getMessagesController().B1(m5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                cg.a m10 = cg.a.m(message2.suggested_post.price);
                int i37 = m10.a == cg.b.b ? ((j0) anVar2.getMessagesController().y7.f.b).c : ((j0) anVar2.getMessagesController().y7.c.b).c;
                if (z38) {
                    gjVar = gjVar4;
                    m10 = cg.a.i((m10.b / 1000) * i37, m10.a);
                } else {
                    gjVar = gjVar4;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z38) {
                        k5.p(null, null, 2131744391, new Object[]{m10.f(), ki.k.J0(i37)}, spannableStringBuilder);
                    } else {
                        k5.p(null, null, 2131744390, new Object[]{m10.f()}, spannableStringBuilder);
                    }
                } else if (z38) {
                    k5.p(null, null, 2131744392, new Object[]{m10.f(), s0.K0(message2.suggested_post.schedule_date), ki.k.J0(i37)}, spannableStringBuilder);
                } else {
                    k5.p(null, null, 2131744389, new Object[]{m10.f(), s0.K0(message2.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i16 = ((e2) anVar2).currentAccount;
                k5.p(null, null, 2131744393, new Object[]{Long.valueOf(np.s1(i16).y7.i.z0(TimeUnit.HOURS))}, spannableStringBuilder);
                xb[] xbVarArr = new xb[1];
                q5 q5Var = new q5(xbVarArr, 4);
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                org.telegram.ui.ActionBar.t1 s02 = t4.s0(anVar2, hd.M0(2131744374, null), spannableStringBuilder, hd.M0(message2.suggested_post.schedule_date == 0 ? 2131748250 : 2131744373, null), false, new ai.b(lmVar, message2, t1VarArr, gjVar, q5Var, 28));
                t1VarArr[0] = s02;
                s02.setOnDismissListener(q5Var);
                if (z38 && m10.a == cg.b.a) {
                    sa a10 = ta.a(anVar2.getParentActivity());
                    e6Var = ((e2) anVar2).resourceProvider;
                    xb G = new cc(a10, e6Var).G(R.raw.info, 10, hd.M0(2131744388, null));
                    G.j = 60000;
                    G.k(true);
                    xbVarArr[0] = G;
                    return;
                }
                return;
            default:
                ym ymVar = (ym) this.c;
                ymVar.s((p3) this.d, (TLRPC.WallPaper) this.e, this.b);
                ymVar.p(ymVar.h);
                ol olVar = ymVar.G.m1;
                if (olVar == null || (o2Var = olVar.M) == null) {
                    return;
                }
                o2Var.invalidate();
                return;
        }
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ c0(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ c0(Object obj, boolean z10, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ c0(si siVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.a = 17;
        this.c = siVar;
        this.d = tLObject;
        this.e = str;
        this.b = z10;
    }
}

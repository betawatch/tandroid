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
import bi.m3;
import ch.p0;
import da.q2;
import di.p8;
import di.r0;
import fi.w2;
import fi.x2;
import fi.z3;
import hi.c7;
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
import oi.c2;
import oi.h4;
import oi.q3;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.f3;
import org.telegram.messenger.f4;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j0;
import org.telegram.messenger.j2;
import org.telegram.messenger.ks;
import org.telegram.messenger.mi;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.ns;
import org.telegram.messenger.po;
import org.telegram.messenger.ri;
import org.telegram.messenger.rs;
import org.telegram.messenger.s2;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t0;
import org.telegram.messenger.t3;
import org.telegram.messenger.tr;
import org.telegram.messenger.w7;
import org.telegram.messenger.wo;
import org.telegram.messenger.wy;
import org.telegram.messenger.x10;
import org.telegram.messenger.xs;
import org.telegram.messenger.y2;
import org.telegram.messenger.yy;
import org.telegram.messenger.z4;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
import org.telegram.ui.mm;
import org.telegram.ui.pl;
import org.telegram.ui.q5;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(x2 x2Var, View view, p0 p0Var, boolean z10, boolean z11) {
        this.a = 2;
        this.c = x2Var;
        this.d = view;
        this.e = p0Var;
        this.b = z10;
    }

    private final void a() {
        String[] split;
        String[] strArr = (String[]) this.c;
        l6 l6Var = (l6) this.d;
        boolean z10 = this.b;
        c2 c2Var = (c2) this.e;
        try {
            m6.g0 = m6.km.get(m6.g5, -1);
            if (TextUtils.isEmpty(strArr[0])) {
                try {
                    if (l6Var.c != null) {
                        new File(l6Var.c).delete();
                    }
                } catch (Exception unused) {
                }
                l6Var.c = null;
                m6.h0 = null;
            } else {
                m6.h0 = strArr[0];
                String absolutePath = new File(t0.h(), Utilities.a(m6.h0) + ".wp").getAbsolutePath();
                try {
                    String str = l6Var.c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(l6Var.c).delete();
                    }
                } catch (Exception unused2) {
                }
                l6Var.c = absolutePath;
                try {
                    Uri parse = Uri.parse(m6.h0);
                    l6Var.e = parse.getQueryParameter("slug");
                    String queryParameter = parse.getQueryParameter("mode");
                    if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                        for (int i7 = 0; i7 < split.length; i7++) {
                            if ("blur".equals(split[i7])) {
                                l6Var.h = true;
                            } else if ("motion".equals(split[i7])) {
                                l6Var.n = true;
                            }
                        }
                    }
                    Utilities.z(parse.getQueryParameter("intensity"));
                    l6Var.y = 45;
                    try {
                        String queryParameter2 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            l6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                            if (queryParameter2.length() >= 13 && g0.S1(queryParameter2.charAt(6))) {
                                l6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter2.length() >= 20 && g0.S1(queryParameter2.charAt(13))) {
                                l6Var.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter2.length() == 27 && g0.S1(queryParameter2.charAt(20))) {
                                l6Var.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    try {
                        String queryParameter3 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            l6Var.y = Utilities.z(queryParameter3).intValue();
                        }
                    } catch (Exception unused4) {
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            if (!z10 && m6.M == null) {
                m6.K = l6Var;
                if (m6.I == m6.J) {
                    m6.T = 2000;
                    m6.U = SystemClock.elapsedRealtime();
                    g0.h3(new j2(19), 2100L);
                }
            }
            m6.I = l6Var;
            m6.t1(false, false);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (m6.M == null && !m6.Q) {
            mp.u1(l6Var.F).G4(l6Var, l6Var.k(false), z10, false);
        }
        c2Var.run();
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
        fj fjVar;
        int i16;
        h6 h6Var;
        m3 m3Var;
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
                p8 p8Var = (p8) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z12 = this.b;
                ArrayList arrayList5 = p8Var.l;
                int i19 = p8Var.a;
                if (iArr[0] != p8Var.m) {
                    return;
                }
                p8Var.i = false;
                p8Var.m = -1;
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    mp.u1(i19).f4(tL_payments_savedStarGifts.users, false);
                    mp.u1(i19).Z3(tL_payments_savedStarGifts.chats, false);
                    if (z12) {
                        arrayList5.clear();
                    }
                    arrayList5.addAll(tL_payments_savedStarGifts.gifts);
                    p8Var.k = tL_payments_savedStarGifts.next_offset;
                    p8Var.n = tL_payments_savedStarGifts.count;
                    p8Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                    p8Var.j = arrayList5.size() > p8Var.n || p8Var.k == null;
                    c10 = 1;
                } else {
                    c10 = 1;
                    p8Var.j = true;
                }
                ks f10 = ks.f(i19);
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(p8Var.b);
                objArr[c10] = p8Var;
                f10.k(ks.I3, objArr);
                return;
            case 2:
                x2 x2Var = (x2) this.c;
                View view = (View) this.d;
                p0 p0Var = (p0) this.e;
                boolean z13 = this.b;
                z3 z3Var = x2Var.a;
                c5.X(z3Var.m2, 1, z3Var.l1, new w2(x2Var, z13, p0Var, view));
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
                        tr.a0(i2Var.a).v1(str, messages_botresults);
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
                c7 c7Var = (c7) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.b;
                Runnable runnable = (Runnable) this.e;
                c7Var.getClass();
                try {
                    bitmap.compress(z15 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(c7Var.Z0));
                } catch (Exception e10) {
                    a8.g(e10, false);
                    if (z15) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(c7Var.Z0));
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    }
                }
                bitmap.recycle();
                g0.g3(runnable);
                return;
            case 5:
                h0 h0Var = (h0) this.c;
                boolean z16 = this.b;
                y3 y3Var = (y3) this.d;
                jg.e0 e0Var2 = (jg.e0) this.e;
                if (z16) {
                    return;
                }
                h0Var.c = e0Var2;
                y3Var.setRightText(h0Var.H(e0Var2));
                y3Var.setRightTextMargin(6);
                h0Var.J.clear();
                h0Var.d = true;
                h0Var.f();
                h0Var.P();
                return;
            case 6:
                Context context = (Context) this.c;
                boolean z17 = this.b;
                l2.f0 f0Var = (l2.f0) this.d;
                m2.i iVar = (m2.i) this.e;
                m2.g i21 = m2.g.i(context);
                if (i21 == null) {
                    h2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    m2.d dVar = f0Var.s;
                    dVar.getClass();
                    dVar.f.a(i21);
                }
                LogSessionId k10 = i21.k();
                synchronized (iVar) {
                    m2.h hVar2 = iVar.b;
                    hVar2.getClass();
                    hVar2.f(k10);
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                g2 g2Var = (g2) this.d;
                boolean z18 = this.b;
                q3 q3Var = (q3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                h4.k(g2Var, z18, new oi.f0(1, q3Var, trim));
                return;
            case 8:
                y2 y2Var = (y2) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z19 = this.b;
                HashMap hashMap = y2Var.c;
                if (hashMap == null || (arrayList = (ArrayList) hashMap.get(pair)) == null) {
                    return;
                }
                int size = arrayList.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj2 = arrayList.get(i22);
                    i22++;
                    ((x10) obj2).a(obj);
                }
                if (z19) {
                    arrayList.clear();
                }
                if (z19) {
                    y2Var.c.remove(pair);
                    return;
                }
                return;
            case 9:
                t3 t3Var = (t3) this.c;
                boolean z20 = this.b;
                TLObject tLObject3 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                t3Var.u = false;
                if (z20) {
                    t3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    mp.u1(t3Var.C.a).f4(groupparticipants.users, false);
                    mp.u1(t3Var.C.a).Z3(groupparticipants.chats, false);
                    t3Var.m(groupparticipants.participants, z20, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                f4 f4Var = (f4) this.c;
                List list = (List) this.d;
                ResultCallback resultCallback = (ResultCallback) this.e;
                boolean z21 = this.b;
                f4Var.b = new ArrayList(list);
                resultCallback.onComplete(f4Var.e((z21 ? 1 : 0) | 2));
                return;
            case 11:
                i5 i5Var = (i5) this.c;
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
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) i5Var.g0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        i5Var.f0.remove(tL_contact);
                        i5Var.g0.remove(Long.valueOf(user.id));
                        z23 = true;
                    }
                }
                if (z23) {
                    i5Var.d(false);
                }
                ks notificationCenter = i5Var.getNotificationCenter();
                int i24 = mp.I8;
                notificationCenter.k(2, 1);
                i5Var.getNotificationCenter().k(25, new Object[0]);
                if (z22) {
                    ks.e().k(ks.S4, 1, gd.a0("DeletedFromYourContacts", null, 2131751454, str2));
                    return;
                }
                return;
            case 12:
                MediaController mediaController = (MediaController) this.c;
                wo woVar = (wo) this.d;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.e;
                boolean z24 = this.b;
                String[] strArr = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = woVar.b;
                tL_document.id = woVar.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = woVar.c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar2.a).getCurrentDatacenterId();
                w7.G(cVar2.a);
                File J = w7.J(tL_document, null, true, true);
                if (!J.exists()) {
                    g0.g3(new z4(23, cVar2, tL_document));
                    return;
                } else {
                    if (z24) {
                        return;
                    }
                    g0.g3(new z4(22, mediaController, J));
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
                    boolean z26 = s2.a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                }
                if (exists) {
                    ri.d0(mediaController2.i1).F1(mediaController2.n1, mediaController2.o1, mi.a(mediaController2, file.getAbsolutePath(), z25));
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
                ks.f(mediaController2.i1).k(ks.o2, new Object[0]);
                ks.f(mediaController2.i1).k(ks.s2, Integer.valueOf(mediaController2.h1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 14:
                ri riVar = (ri) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                boolean z27 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                riVar.getMessagesController().f4(arrayList8, z27);
                riVar.getMessagesController().Z3(arrayList9, z27);
                return;
            case 15:
                ri riVar2 = (ri) this.c;
                boolean z28 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                a0.h hVar3 = (a0.h) this.e;
                try {
                    riVar2.getMessagesStorage().b.beginTransaction();
                    if (z28) {
                        executeFast = riVar2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = riVar2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = riVar2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i25 = 0;
                    while (i25 < arrayList10.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList10.get(i25);
                        SparseArray sparseArray = (SparseArray) hVar3.f(fj.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList10;
                            i7 = i17;
                        } else {
                            fj.q5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                                fj fjVar2 = (fj) arrayList2.get(i26);
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
                                        sQLitePreparedStatement3.bindInteger(3, fjVar2.e1());
                                        sQLitePreparedStatement2 = executeFast;
                                        arrayList4 = arrayList10;
                                        sQLitePreparedStatement3.bindLong(4, fj.B0(fjVar2.k));
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
                    riVar2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 16:
                ri riVar3 = (ri) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z29 = this.b;
                if (tLObject4 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z29) {
                        riVar3.M1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        riVar3.N1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 17:
                ri riVar4 = (ri) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = (String) this.e;
                boolean z30 = this.b;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    riVar4.v1(str3, z30, (TLRPC.TL_messages_stickerSet) tLObject5, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    riVar4.v1(str3, z30, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 18:
                mp mpVar = (mp) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z31 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = mpVar.H0;
                if (tLObject6 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject6;
                    mpVar.f4(contacts_blocked.users, false);
                    mpVar.Z3(contacts_blocked.chats, false);
                    mpVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z31) {
                        longSparseIntArray.clear();
                    }
                    mpVar.I0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    mpVar.J0 = contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i28 = 0; i28 < size3; i28++) {
                        longSparseIntArray.put(fj.B1(contacts_blocked.blocked.get(i28).peer_id), 1);
                    }
                    mpVar.G0 = false;
                    mpVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 19:
                mp mpVar2 = (mp) this.c;
                boolean z32 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                if (z32) {
                    i11 = 0;
                    mpVar2.getNotificationCenter().k(2, 64);
                } else {
                    i11 = 0;
                }
                mpVar2.x5(i11, -updates.chat_id, arrayList11);
                mpVar2.getNotificationCenter().k(3, new Object[i11]);
                return;
            case 20:
                po poVar = (po) this.c;
                int[] iArr2 = (int[]) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.b;
                int i29 = poVar.a;
                ArrayList arrayList12 = poVar.e;
                if (iArr2[0] != poVar.f) {
                    return;
                }
                poVar.c = false;
                poVar.f = -1;
                if (tLObject7 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                    mp.u1(i29).Z3(messages_chats.chats, false);
                    if (z33) {
                        arrayList12.clear();
                    }
                    arrayList12.addAll(messages_chats.chats);
                    poVar.g = messages_chats instanceof TLRPC.TL_messages_chatsSlice ? messages_chats.count : messages_chats.chats.size();
                    poVar.d = arrayList12.size() >= poVar.g;
                    c11 = 1;
                } else {
                    c11 = 1;
                    poVar.d = true;
                }
                ks f11 = ks.f(i29);
                Object[] objArr2 = new Object[2];
                objArr2[0] = Long.valueOf(poVar.b);
                objArr2[c11] = poVar;
                f11.k(ks.R3, objArr2);
                return;
            case 21:
                ((tr) this.c).n1((List) this.d, (List) this.e, this.b);
                return;
            case 22:
                xs xsVar = (xs) this.c;
                a0.h hVar4 = (a0.h) this.d;
                boolean z34 = this.b;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = xsVar.b;
                a0.h hVar5 = xsVar.c;
                a0.h hVar6 = xsVar.f;
                int i30 = xsVar.J;
                xsVar.getAccountInstance().d();
                Integer num5 = 0;
                int i31 = 0;
                while (i31 < hVar4.m()) {
                    long j3 = hVar4.j(i31);
                    SparseArray sparseArray2 = (SparseArray) hVar5.f(j3);
                    if (sparseArray2 == null) {
                        hVar = hVar4;
                        z10 = z34;
                        i12 = i18;
                        num = num5;
                        i13 = i31;
                    } else {
                        ArrayList arrayList15 = (ArrayList) hVar4.f(j3);
                        i12 = i18;
                        int size4 = arrayList15.size();
                        hVar = hVar4;
                        int i32 = 0;
                        while (i32 < size4) {
                            int i33 = i32;
                            int intValue = ((Integer) arrayList15.get(i32)).intValue();
                            boolean z35 = z34;
                            fj fjVar3 = (fj) sparseArray2.get(intValue);
                            ArrayList arrayList16 = arrayList15;
                            if (fjVar3 == null || fjVar3.J || (z35 && !fjVar3.I)) {
                                i14 = size4;
                                num2 = num5;
                                i15 = i31;
                            } else {
                                i14 = size4;
                                long B0 = fj.B0(fjVar3.k);
                                Integer num6 = (Integer) hVar6.f(B0);
                                Integer num7 = num6 == null ? num5 : num6;
                                int intValue2 = num7.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    num2 = num5;
                                    xsVar.e.l(B0);
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
                                    if (!xsVar.getMessagesController().s2(B0)) {
                                        if (xsVar.getMessagesController().y2(B0)) {
                                            int i34 = xsVar.J - (num10.intValue() > 0 ? i12 : 0);
                                            xsVar.J = i34;
                                            xsVar.J = i34 + (num4.intValue() > 0 ? i12 : 0);
                                        } else {
                                            int intValue3 = xsVar.J - num10.intValue();
                                            xsVar.J = intValue3;
                                            xsVar.J = num4.intValue() + intValue3;
                                        }
                                    }
                                    hVar6.k(num4, B0);
                                }
                                if (num4.intValue() == 0) {
                                    hVar6.l(B0);
                                    xsVar.r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList14.remove(fjVar3);
                                xsVar.a.remove(fjVar3);
                                if (xs.E(fjVar3)) {
                                    xsVar.K--;
                                }
                                arrayList13.add(fjVar3);
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
                            hVar5.l(j3);
                        }
                    }
                    i31 = i13 + 1;
                    hVar4 = hVar;
                    i18 = i12;
                    z34 = z10;
                    num5 = num;
                }
                int i35 = i18;
                if (!arrayList13.isEmpty()) {
                    g0.g3(new ns(xsVar, arrayList13, i35));
                }
                if (i30 != xsVar.J) {
                    if (xsVar.L) {
                        xsVar.Q(xsVar.M > xsVar.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList14.clear();
                        xsVar.Z(xsVar.L);
                    }
                    g0.g3(new rs(xsVar, hVar6.m(), 1));
                }
                xsVar.L = false;
                if (xsVar.S) {
                    xsVar.S(xsVar.z());
                    return;
                }
                return;
            case 23:
                wy wyVar = (wy) this.c;
                org.telegram.messenger.c cVar3 = (org.telegram.messenger.c) this.d;
                yy yyVar = (yy) this.e;
                boolean z36 = this.b;
                wyVar.a = zy.C(cVar3.a).A(yyVar.c, yyVar.a, yyVar.x);
                if (z36 && yyVar.r) {
                    new File(yyVar.c).delete();
                }
                wyVar.c.countDown();
                return;
            case 24:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 25:
                a();
                return;
            case 26:
                bn.S0((bn) this.c, (String) this.d, (fj) this.e, this.b);
                return;
            case 27:
                bn bnVar = (bn) this.c;
                j6 j6Var = (j6) this.d;
                l6 l6Var = (l6) this.e;
                boolean z37 = this.b;
                if (j6Var == null) {
                    UndoView undoView = bnVar.N3;
                    m6.K1(l6Var, false, -1, undoView != null ? undoView.getUndoButton() : null);
                    return;
                }
                bnVar.getClass();
                j6 k11 = l6Var.k(false);
                int i36 = j6Var.a;
                UndoView undoView2 = bnVar.N3;
                m6.K1(l6Var, false, i36, undoView2 != null ? undoView2.getUndoButton() : null);
                if (z37) {
                    m6.l0(l6Var, k11, true);
                    return;
                }
                return;
            case 28:
                mm mmVar = (mm) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z38 = this.b;
                fj fjVar4 = (fj) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                bn bnVar2 = mmVar.a;
                f3.p(null, null, 2131744153, new Object[]{bnVar2.getMessagesController().D1(n5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                cg.a n10 = cg.a.n(message2.suggested_post.price);
                int i37 = n10.a == cg.b.b ? ((j0) bnVar2.getMessagesController().A7.f.b).c : ((j0) bnVar2.getMessagesController().A7.c.b).c;
                if (z38) {
                    fjVar = fjVar4;
                    n10 = cg.a.j((n10.b / 1000) * i37, n10.a);
                } else {
                    fjVar = fjVar4;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z38) {
                        f3.p(null, null, 2131744150, new Object[]{n10.g(), ki.j.J0(i37)}, spannableStringBuilder);
                    } else {
                        f3.p(null, null, 2131744149, new Object[]{n10.g()}, spannableStringBuilder);
                    }
                } else if (z38) {
                    f3.p(null, null, 2131744151, new Object[]{n10.g(), r0.L0(message2.suggested_post.schedule_date), ki.j.J0(i37)}, spannableStringBuilder);
                } else {
                    f3.p(null, null, 2131744148, new Object[]{n10.g(), r0.L0(message2.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i16 = ((g2) bnVar2).currentAccount;
                f3.p(null, null, 2131744152, new Object[]{Long.valueOf(mp.u1(i16).A7.i.n2(TimeUnit.HOURS))}, spannableStringBuilder);
                gc[] gcVarArr = new gc[1];
                q5 q5Var = new q5(gcVarArr, 4);
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                org.telegram.ui.ActionBar.t1 s02 = c5.s0(bnVar2, gd.N0(2131744133, null), spannableStringBuilder, gd.N0(message2.suggested_post.schedule_date == 0 ? 2131748057 : 2131744132, null), false, new ai.b(mmVar, message2, t1VarArr, fjVar, q5Var, 29));
                t1VarArr[0] = s02;
                s02.setOnDismissListener(q5Var);
                if (z38 && n10.a == cg.b.a) {
                    bb a10 = cb.a(bnVar2.getParentActivity());
                    h6Var = ((g2) bnVar2).resourceProvider;
                    gc G = new lc(a10, h6Var).G(R.raw.info, 10, gd.N0(2131744147, null));
                    G.j = 60000;
                    G.k(true);
                    gcVarArr[0] = G;
                    return;
                }
                return;
            default:
                zm zmVar = (zm) this.c;
                zmVar.s((s3) this.d, (TLRPC.WallPaper) this.e, this.b);
                zmVar.p(zmVar.h);
                pl plVar = zmVar.G.m1;
                if (plVar == null || (m3Var = plVar.M) == null) {
                    return;
                }
                m3Var.invalidate();
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

    public /* synthetic */ c0(ri riVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.a = 17;
        this.c = riVar;
        this.d = tLObject;
        this.e = str;
        this.b = z10;
    }
}

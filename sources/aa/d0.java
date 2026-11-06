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
import bi.e1;
import bi.ec;
import bi.u0;
import bi.v9;
import ch.o0;
import da.q2;
import di.d3;
import di.e3;
import di.i4;
import fi.e7;
import fi.k2;
import fi.r1;
import fi.t1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jg.h0;
import l2.i0;
import li.h4;
import li.q3;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.d4;
import org.telegram.messenger.dt;
import org.telegram.messenger.dz;
import org.telegram.messenger.fz;
import org.telegram.messenger.g5;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.j0;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.pd;
import org.telegram.messenger.pi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.r3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t0;
import org.telegram.messenger.to;
import org.telegram.messenger.ts;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.messenger.x2;
import org.telegram.messenger.xs;
import org.telegram.messenger.y4;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.an;
import org.telegram.ui.lm;
import org.telegram.ui.ol;
import org.telegram.ui.q5;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(e3 e3Var, View view, o0 o0Var, boolean z9, boolean z10) {
        this.a = 2;
        this.c = e3Var;
        this.d = view;
        this.e = o0Var;
        this.b = z9;
    }

    private final void a() {
        String[] split;
        String[] strArr = (String[]) this.c;
        j6 j6Var = (j6) this.d;
        boolean z9 = this.b;
        l2.w wVar = (l2.w) this.e;
        try {
            k6.g0 = k6.hm.get(k6.g5, -1);
            if (TextUtils.isEmpty(strArr[0])) {
                try {
                    if (j6Var.c != null) {
                        new File(j6Var.c).delete();
                    }
                } catch (Exception unused) {
                }
                j6Var.c = null;
                k6.h0 = null;
            } else {
                k6.h0 = strArr[0];
                String absolutePath = new File(t0.h(), Utilities.a(k6.h0) + ".wp").getAbsolutePath();
                try {
                    String str = j6Var.c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(j6Var.c).delete();
                    }
                } catch (Exception unused2) {
                }
                j6Var.c = absolutePath;
                try {
                    Uri parse = Uri.parse(k6.h0);
                    j6Var.e = parse.getQueryParameter("slug");
                    String queryParameter = parse.getQueryParameter("mode");
                    if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                        for (int i7 = 0; i7 < split.length; i7++) {
                            if ("blur".equals(split[i7])) {
                                j6Var.h = true;
                            } else if ("motion".equals(split[i7])) {
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
                    a8.g(th2, true);
                }
            }
            if (!z9 && k6.M == null) {
                k6.K = j6Var;
                if (k6.I == k6.J) {
                    k6.T = 2000;
                    k6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new pd(11), 2100L);
                }
            }
            k6.I = j6Var;
            k6.t1(false, false);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (k6.M == null && !k6.Q) {
            qp.s1(j6Var.E).x4(j6Var, j6Var.k(false), z9, false);
        }
        wVar.run();
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
        boolean z9;
        Integer num;
        int i13;
        int i14;
        Integer num2;
        int i15;
        Integer num3;
        Integer num4;
        ij ijVar;
        int i16;
        f6 f6Var;
        ec ecVar;
        SQLitePreparedStatement executeFast2 = null;
        int i17 = 2;
        int i18 = 1;
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.c;
                q2 q2Var = (q2) this.d;
                ca.c cVar = (ca.c) this.e;
                boolean z10 = this.b;
                f0Var.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                f0Var.b.e(q2Var, cVar.a, z10);
                return;
            case 1:
                v9 v9Var = (v9) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z11 = this.b;
                ArrayList arrayList5 = v9Var.l;
                int i19 = v9Var.a;
                if (iArr[0] != v9Var.m) {
                    return;
                }
                v9Var.i = false;
                v9Var.m = -1;
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    qp.s1(i19).Y3(tL_payments_savedStarGifts.users, false);
                    qp.s1(i19).S3(tL_payments_savedStarGifts.chats, false);
                    if (z11) {
                        arrayList5.clear();
                    }
                    arrayList5.addAll(tL_payments_savedStarGifts.gifts);
                    v9Var.k = tL_payments_savedStarGifts.next_offset;
                    v9Var.n = tL_payments_savedStarGifts.count;
                    v9Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                    v9Var.j = arrayList5.size() > v9Var.n || v9Var.k == null;
                    c10 = 1;
                } else {
                    c10 = 1;
                    v9Var.j = true;
                }
                qs f10 = qs.f(i19);
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(v9Var.b);
                objArr[c10] = v9Var;
                f10.k(qs.G3, objArr);
                return;
            case 2:
                e3 e3Var = (e3) this.c;
                View view = (View) this.d;
                o0 o0Var = (o0) this.e;
                boolean z12 = this.b;
                i4 i4Var = e3Var.a;
                v4.X(i4Var.l2, 1, i4Var.k1, new d3(e3Var, z12, o0Var, view));
                return;
            case 3:
                r1 r1Var = (r1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.e;
                boolean z13 = this.b;
                t1 t1Var = r1Var.s;
                if (r1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        k2 k2Var = t1Var.r;
                        ArrayList arrayList6 = t1Var.n;
                        int i20 = k2.y1;
                        yr.a0(k2Var.a).v1(str, messages_botresults);
                        r1Var.h = messages_botresults.next_offset;
                        if (z13) {
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
                e7 e7Var = (e7) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z14 = this.b;
                Runnable runnable = (Runnable) this.e;
                e7Var.getClass();
                try {
                    bitmap.compress(z14 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(e7Var.Z0));
                } catch (Exception e10) {
                    a8.g(e10, false);
                    if (z14) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(e7Var.Z0));
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    }
                }
                bitmap.recycle();
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 5:
                h0 h0Var = (h0) this.c;
                boolean z15 = this.b;
                x3 x3Var = (x3) this.d;
                jg.e0 e0Var = (jg.e0) this.e;
                if (z15) {
                    return;
                }
                h0Var.c = e0Var;
                x3Var.setRightText(h0Var.H(e0Var));
                x3Var.setRightTextMargin(6);
                h0Var.I.clear();
                h0Var.d = true;
                h0Var.f();
                h0Var.P();
                return;
            case 6:
                Context context = (Context) this.c;
                boolean z16 = this.b;
                i0 i0Var = (i0) this.d;
                m2.j jVar = (m2.j) this.e;
                m2.h i21 = m2.h.i(context);
                if (i21 == null) {
                    h2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z16) {
                    m2.e eVar = i0Var.s;
                    eVar.getClass();
                    eVar.f.a(i21);
                }
                LogSessionId k10 = i21.k();
                synchronized (jVar) {
                    m2.i iVar = jVar.b;
                    iVar.getClass();
                    iVar.f(k10);
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                f2 f2Var = (f2) this.d;
                boolean z17 = this.b;
                q3 q3Var = (q3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                h4.k(f2Var, z17, new ab.g(24, q3Var, trim));
                return;
            case 8:
                x2 x2Var = (x2) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z18 = this.b;
                HashMap hashMap = x2Var.c;
                if (hashMap == null || (arrayList = (ArrayList) hashMap.get(pair)) == null) {
                    return;
                }
                int size = arrayList.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj2 = arrayList.get(i22);
                    i22++;
                    ((c20) obj2).a(obj);
                }
                if (z18) {
                    arrayList.clear();
                }
                if (z18) {
                    x2Var.c.remove(pair);
                    return;
                }
                return;
            case 9:
                r3 r3Var = (r3) this.c;
                boolean z19 = this.b;
                TLObject tLObject3 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                r3Var.u = false;
                if (z19) {
                    r3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    qp.s1(r3Var.C.a).Y3(groupparticipants.users, false);
                    qp.s1(r3Var.C.a).S3(groupparticipants.chats, false);
                    r3Var.m(groupparticipants.participants, z19, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                d4 d4Var = (d4) this.c;
                List list = (List) this.d;
                ResultCallback resultCallback = (ResultCallback) this.e;
                boolean z20 = this.b;
                d4Var.b = new ArrayList(list);
                resultCallback.onComplete(d4Var.e((z20 ? 1 : 0) | 2));
                return;
            case 11:
                g5 g5Var = (g5) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                boolean z21 = this.b;
                String str2 = (String) this.e;
                int size2 = arrayList7.size();
                boolean z22 = false;
                int i23 = 0;
                while (i23 < size2) {
                    Object obj3 = arrayList7.get(i23);
                    i23++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) g5Var.f0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        g5Var.e0.remove(tL_contact);
                        g5Var.f0.remove(Long.valueOf(user.id));
                        z22 = true;
                    }
                }
                if (z22) {
                    g5Var.d(false);
                }
                qs notificationCenter = g5Var.getNotificationCenter();
                int i24 = qp.C8;
                notificationCenter.k(2, 1);
                g5Var.getNotificationCenter().k(25, new Object[0]);
                if (z21) {
                    qs.e().k(qs.P4, 1, hd.a0("DeletedFromYourContacts", null, 2131751467, str2));
                    return;
                }
                return;
            case 12:
                MediaController mediaController = (MediaController) this.c;
                ap apVar = (ap) this.d;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.e;
                boolean z23 = this.b;
                String[] strArr = MediaController.V1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = apVar.b;
                tL_document.id = apVar.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = apVar.c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar2.a).getCurrentDatacenterId();
                w7.G(cVar2.a);
                File J = w7.J(tL_document, null, true, true);
                if (!J.exists()) {
                    org.telegram.messenger.g0.h3(new y4(23, cVar2, tL_document));
                    return;
                } else {
                    if (z23) {
                        return;
                    }
                    org.telegram.messenger.g0.h3(new y4(22, mediaController, J));
                    return;
                }
            case 13:
                MediaController mediaController2 = (MediaController) this.c;
                File file = (File) this.d;
                boolean z24 = this.b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.e;
                String[] strArr2 = MediaController.V1;
                boolean exists = file.exists();
                if (!exists) {
                    boolean z25 = r2.a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.k1 + " writedFrames" + mediaController2.l1), true);
                }
                if (exists) {
                    ui.b0(mediaController2.h1).B1(mediaController2.m1, mediaController2.n1, pi.a(mediaController2, file.getAbsolutePath(), z24));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.h1).getCurrentTime();
                tL_document2.size = (int) file.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.k1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                qs.f(mediaController2.h1).k(qs.o2, new Object[0]);
                qs.f(mediaController2.h1).k(qs.s2, Integer.valueOf(mediaController2.g1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 14:
                ui uiVar = (ui) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                boolean z26 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                uiVar.getMessagesController().Y3(arrayList8, z26);
                uiVar.getMessagesController().S3(arrayList9, z26);
                return;
            case 15:
                ui uiVar2 = (ui) this.c;
                boolean z27 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                a0.h hVar2 = (a0.h) this.e;
                try {
                    uiVar2.getMessagesStorage().b.beginTransaction();
                    if (z27) {
                        executeFast = uiVar2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = uiVar2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = uiVar2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i25 = 0;
                    while (i25 < arrayList10.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList10.get(i25);
                        SparseArray sparseArray = (SparseArray) hVar2.f(ij.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList10;
                            i7 = i17;
                        } else {
                            ij.r5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                                ij ijVar2 = (ij) arrayList2.get(i26);
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
                                        sQLitePreparedStatement3.bindInteger(3, ijVar2.f1());
                                        sQLitePreparedStatement2 = executeFast;
                                        arrayList4 = arrayList10;
                                        sQLitePreparedStatement3.bindLong(4, ij.B0(ijVar2.k));
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
                    uiVar2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 16:
                ui uiVar3 = (ui) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z28 = this.b;
                if (tLObject4 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z28) {
                        uiVar3.J1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        uiVar3.K1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 17:
                ui uiVar4 = (ui) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = (String) this.e;
                boolean z29 = this.b;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    uiVar4.s1(str3, z29, (TLRPC.TL_messages_stickerSet) tLObject5, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    uiVar4.s1(str3, z29, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 18:
                qp qpVar = (qp) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z30 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = qpVar.G0;
                if (tLObject6 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject6;
                    qpVar.Y3(contacts_blocked.users, false);
                    qpVar.S3(contacts_blocked.chats, false);
                    qpVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z30) {
                        longSparseIntArray.clear();
                    }
                    qpVar.H0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    qpVar.I0 = contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i28 = 0; i28 < size3; i28++) {
                        longSparseIntArray.put(ij.C1(contacts_blocked.blocked.get(i28).peer_id), 1);
                    }
                    qpVar.F0 = false;
                    qpVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 19:
                qp qpVar2 = (qp) this.c;
                boolean z31 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                if (z31) {
                    i11 = 0;
                    qpVar2.getNotificationCenter().k(2, 64);
                } else {
                    i11 = 0;
                }
                qpVar2.l5(i11, -updates.chat_id, arrayList11);
                qpVar2.getNotificationCenter().k(3, new Object[i11]);
                return;
            case 20:
                to toVar = (to) this.c;
                int[] iArr2 = (int[]) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z32 = this.b;
                int i29 = toVar.a;
                ArrayList arrayList12 = toVar.e;
                if (iArr2[0] != toVar.f) {
                    return;
                }
                toVar.c = false;
                toVar.f = -1;
                if (tLObject7 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                    qp.s1(i29).S3(messages_chats.chats, false);
                    if (z32) {
                        arrayList12.clear();
                    }
                    arrayList12.addAll(messages_chats.chats);
                    toVar.g = messages_chats instanceof TLRPC.TL_messages_chatsSlice ? messages_chats.count : messages_chats.chats.size();
                    toVar.d = arrayList12.size() >= toVar.g;
                    c11 = 1;
                } else {
                    c11 = 1;
                    toVar.d = true;
                }
                qs f11 = qs.f(i29);
                Object[] objArr2 = new Object[2];
                objArr2[0] = Long.valueOf(toVar.b);
                objArr2[c11] = toVar;
                f11.k(qs.O3, objArr2);
                return;
            case 21:
                ((yr) this.c).n1((List) this.d, (List) this.e, this.b);
                return;
            case 22:
                dt dtVar = (dt) this.c;
                a0.h hVar3 = (a0.h) this.d;
                boolean z33 = this.b;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = dtVar.b;
                a0.h hVar4 = dtVar.c;
                a0.h hVar5 = dtVar.f;
                int i30 = dtVar.I;
                dtVar.getAccountInstance().c();
                Integer num5 = 0;
                int i31 = 0;
                while (i31 < hVar3.m()) {
                    long j3 = hVar3.j(i31);
                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j3);
                    if (sparseArray2 == null) {
                        hVar = hVar3;
                        z9 = z33;
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
                            boolean z34 = z33;
                            ij ijVar3 = (ij) sparseArray2.get(intValue);
                            ArrayList arrayList16 = arrayList15;
                            if (ijVar3 == null || ijVar3.J || (z34 && !ijVar3.I)) {
                                i14 = size4;
                                num2 = num5;
                                i15 = i31;
                            } else {
                                i14 = size4;
                                long B0 = ij.B0(ijVar3.k);
                                Integer num6 = (Integer) hVar5.f(B0);
                                Integer num7 = num6 == null ? num5 : num6;
                                int intValue2 = num7.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    num2 = num5;
                                    dtVar.e.l(B0);
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
                                    if (!dtVar.getMessagesController().p2(B0)) {
                                        if (dtVar.getMessagesController().t2(B0)) {
                                            int i34 = dtVar.I - (num10.intValue() > 0 ? i12 : 0);
                                            dtVar.I = i34;
                                            dtVar.I = i34 + (num4.intValue() > 0 ? i12 : 0);
                                        } else {
                                            int intValue3 = dtVar.I - num10.intValue();
                                            dtVar.I = intValue3;
                                            dtVar.I = num4.intValue() + intValue3;
                                        }
                                    }
                                    hVar5.k(num4, B0);
                                }
                                if (num4.intValue() == 0) {
                                    hVar5.l(B0);
                                    dtVar.r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList14.remove(ijVar3);
                                dtVar.a.remove(ijVar3);
                                if (dt.E(ijVar3)) {
                                    dtVar.J--;
                                }
                                arrayList13.add(ijVar3);
                            }
                            i32 = i33 + 1;
                            arrayList15 = arrayList16;
                            z33 = z34;
                            size4 = i14;
                            num5 = num2;
                            i31 = i15;
                        }
                        z9 = z33;
                        num = num5;
                        i13 = i31;
                        if (sparseArray2.size() == 0) {
                            hVar4.l(j3);
                        }
                    }
                    i31 = i13 + 1;
                    hVar3 = hVar;
                    i18 = i12;
                    z33 = z9;
                    num5 = num;
                }
                int i35 = i18;
                if (!arrayList13.isEmpty()) {
                    org.telegram.messenger.g0.h3(new ts(dtVar, arrayList13, i35));
                }
                if (i30 != dtVar.I) {
                    if (dtVar.K) {
                        dtVar.Q(dtVar.L > dtVar.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList14.clear();
                        dtVar.Z(dtVar.K);
                    }
                    org.telegram.messenger.g0.h3(new xs(dtVar, hVar5.m(), 1));
                }
                dtVar.K = false;
                if (dtVar.R) {
                    dtVar.S(dtVar.z());
                    return;
                }
                return;
            case 23:
                dz dzVar = (dz) this.c;
                org.telegram.messenger.c cVar3 = (org.telegram.messenger.c) this.d;
                fz fzVar = (fz) this.e;
                boolean z35 = this.b;
                dzVar.a = gz.C(cVar3.a).A(fzVar.c, fzVar.a, fzVar.x);
                if (z35 && fzVar.r) {
                    new File(fzVar.c).delete();
                }
                dzVar.c.countDown();
                return;
            case 24:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 25:
                a();
                return;
            case 26:
                an.C1((an) this.c, (String) this.d, (ij) this.e, this.b);
                return;
            case 27:
                an anVar = (an) this.c;
                h6 h6Var = (h6) this.d;
                j6 j6Var = (j6) this.e;
                boolean z36 = this.b;
                if (h6Var == null) {
                    UndoView undoView = anVar.M3;
                    k6.K1(j6Var, false, -1, undoView != null ? undoView.getUndoButton() : null);
                    return;
                }
                anVar.getClass();
                h6 k11 = j6Var.k(false);
                int i36 = h6Var.a;
                UndoView undoView2 = anVar.M3;
                k6.K1(j6Var, false, i36, undoView2 != null ? undoView2.getUndoButton() : null);
                if (z36) {
                    k6.l0(j6Var, k11, true);
                    return;
                }
                return;
            case 28:
                lm lmVar = (lm) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z37 = this.b;
                ij ijVar4 = (ij) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                an anVar2 = lmVar.a;
                k5.q(null, null, 2131744395, new Object[]{anVar2.getMessagesController().B1(m5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                cg.a m10 = cg.a.m(message2.suggested_post.price);
                int i37 = m10.a == cg.b.b ? ((j0) anVar2.getMessagesController().x7.f.b).c : ((j0) anVar2.getMessagesController().x7.c.b).c;
                if (z37) {
                    ijVar = ijVar4;
                    m10 = cg.a.i((m10.b / 1000) * i37, m10.a);
                } else {
                    ijVar = ijVar4;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z37) {
                        k5.q(null, null, 2131744392, new Object[]{m10.f(), hi.j.J0(i37)}, spannableStringBuilder);
                    } else {
                        k5.q(null, null, 2131744391, new Object[]{m10.f()}, spannableStringBuilder);
                    }
                } else if (z37) {
                    k5.q(null, null, 2131744393, new Object[]{m10.f(), e1.K0(message2.suggested_post.schedule_date), hi.j.J0(i37)}, spannableStringBuilder);
                } else {
                    k5.q(null, null, 2131744390, new Object[]{m10.f(), e1.K0(message2.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i16 = ((f2) anVar2).currentAccount;
                k5.q(null, null, 2131744394, new Object[]{Long.valueOf(qp.s1(i16).x7.i.M1(TimeUnit.HOURS))}, spannableStringBuilder);
                cc[] ccVarArr = new cc[1];
                q5 q5Var = new q5(ccVarArr, 4);
                u1[] u1VarArr = new u1[1];
                u1 s02 = v4.s0(anVar2, hd.M0(2131744375, null), spannableStringBuilder, hd.M0(message2.suggested_post.schedule_date == 0 ? 2131748249 : 2131744374, null), false, new u0(lmVar, message2, u1VarArr, ijVar, q5Var, 25));
                u1VarArr[0] = s02;
                s02.setOnDismissListener(q5Var);
                if (z37 && m10.a == cg.b.a) {
                    wa a10 = xa.a(anVar2.getParentActivity());
                    f6Var = ((f2) anVar2).resourceProvider;
                    cc G = new hc(a10, f6Var).G(R.raw.info, 10, hd.M0(2131744389, null));
                    G.j = 60000;
                    G.k(true);
                    ccVarArr[0] = G;
                    return;
                }
                return;
            default:
                ym ymVar = (ym) this.c;
                ymVar.s((org.telegram.ui.ActionBar.r3) this.d, (TLRPC.WallPaper) this.e, this.b);
                ymVar.p(ymVar.h);
                ol olVar = ymVar.G.l1;
                if (olVar == null || (ecVar = olVar.L) == null) {
                    return;
                }
                ecVar.invalidate();
                return;
        }
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z9;
    }

    public /* synthetic */ d0(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
        this.e = obj3;
    }

    public /* synthetic */ d0(Object obj, boolean z9, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ d0(ui uiVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z9) {
        this.a = 17;
        this.c = uiVar;
        this.d = tLObject;
        this.e = str;
        this.b = z9;
    }
}

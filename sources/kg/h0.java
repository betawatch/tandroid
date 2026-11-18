package kg;

import a8.la;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.text.TextUtils;
import di.p6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ki.i3;
import ki.t2;
import ki.t3;
import oi.s2;
import oi.s3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.z41;
import org.telegram.ui.bn;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:19|(2:20|21)|(3:68|69|(10:71|72|(2:63|64)|25|(1:27)|28|29|30|(1:(1:33))(7:35|36|37|38|39|40|41)|34))|23|(0)|25|(0)|28|29|30|(0)(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i7;
        long j3;
        boolean z10;
        n2.e eVar;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r9 = null;
        r9 = null;
        String str3 = null;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        ArrayList arrayList = null;
        sQLitePreparedStatement = null;
        int i10 = 0;
        boolean z11 = false;
        int i11 = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.b;
                jw0 jw0Var = (jw0) this.c;
                f.a(l0Var.a).b();
                jw0Var.run();
                l0Var.dismiss();
                return;
            case 1:
                mp.u1(((t0) this.b).currentAccount).V3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 2:
                f1 f1Var = (f1) this.b;
                l41 l41Var = (l41) this.c;
                f1Var.getClass();
                f1Var.c0(l41Var.d);
                return;
            case 3:
                tr trVar = (tr) this.b;
                v1 v1Var = (v1) this.c;
                try {
                    try {
                        sQLitePreparedStatement = trVar.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, v1Var.a);
                        sQLitePreparedStatement.bindString(2, v1Var.b);
                        sQLitePreparedStatement.bindInteger(3, v1Var.c);
                        sQLitePreparedStatement.bindInteger(4, v1Var.f);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 4:
                w1 w1Var = (w1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = w1Var.b;
                int i12 = w1Var.a;
                if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
                    mp.u1(i12).f4(tL_messages_quickReplies.users, false);
                    mp.u1(i12).Z3(tL_messages_quickReplies.chats, false);
                    tr.a0(i12).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i13 = 0; i13 < tL_messages_quickReplies.quick_replies.size(); i13++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i13);
                        v1 v1Var2 = new v1();
                        v1Var2.a = tL_quickReply.shortcut_id;
                        v1Var2.b = tL_quickReply.shortcut;
                        v1Var2.f = tL_quickReply.count;
                        v1Var2.d = tL_quickReply.top_message;
                        v1Var2.c = i13;
                        int i14 = 0;
                        while (true) {
                            if (i14 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i14);
                                if (message.id != tL_quickReply.top_message) {
                                    i14++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            fj fjVar = new fj(i12, message, false, true);
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
                ks.f(i12).k(ks.F1, new Object[0]);
                return;
            case 5:
                w1 w1Var2 = (w1) this.b;
                tr trVar2 = (tr) this.c;
                ArrayList arrayList4 = w1Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = trVar2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i10 < arrayList4.size()) {
                            v1 v1Var3 = (v1) arrayList4.get(i10);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, v1Var3.a);
                            sQLitePreparedStatement2.bindString(2, v1Var3.b);
                            sQLitePreparedStatement2.bindInteger(3, v1Var3.c);
                            sQLitePreparedStatement2.bindInteger(4, v1Var3.f);
                            sQLitePreparedStatement2.step();
                            i10++;
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Throwable th3) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th3;
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 6:
                ki.k kVar = (ki.k) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
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
            case 7:
                t2 t2Var = (t2) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                t2Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                t2Var.k(botappsettings, true);
                return;
            case 8:
                t2 t2Var2 = (t2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (t2Var2.e0) {
                    return;
                }
                if (tL_error != null) {
                    t2Var2.o(false);
                    return;
                } else {
                    org.telegram.messenger.g0.h3(t2Var2.v0, 60000L);
                    return;
                }
            case 9:
                t2 t2Var3 = (t2) this.b;
                gc Q = new lc(t2Var3.r0, t2Var3.G).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.W2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 10:
                i3 i3Var = (i3) this.b;
                i3Var.getMessagesController().E3(null, (TLRPC.User) this.c, null, i3Var.getClassGuid(), null, false, false);
                return;
            case 11:
                i3 i3Var2 = (i3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                i3Var2.getClass();
                i3Var2.presentFragment(bn.ua(connectedbotstarref.bot_id));
                return;
            case 12:
                t3 t3Var = (t3) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (t3Var.U) {
                    return;
                }
                if (tL_error2 != null) {
                    t3Var.b.dismiss();
                    return;
                } else {
                    org.telegram.messenger.g0.h3(t3Var.V, 60000L);
                    return;
                }
            case 13:
                t3 t3Var2 = (t3) this.b;
                gc Q2 = new lc(t3Var2.b.c, t3Var2.a).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.W2((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 14:
                l2.f0 f0Var = (l2.f0) this.b;
                l2.l0 l0Var2 = (l2.l0) this.c;
                int i15 = f0Var.J - l0Var2.b;
                f0Var.J = i15;
                if (l0Var2.d) {
                    f0Var.K = l0Var2.e;
                    f0Var.L = true;
                }
                if (i15 == 0) {
                    e2.l1 l1Var = ((l2.g1) l0Var2.f).a;
                    int i16 = -1;
                    if (!f0Var.p0.a.p() && l1Var.p()) {
                        f0Var.q0 = -1;
                        f0Var.r0 = 0L;
                    }
                    if (!l1Var.p()) {
                        List asList = Arrays.asList(((l2.l1) l1Var).l);
                        la.p(asList.size() == f0Var.p.size());
                        for (int i17 = 0; i17 < asList.size(); i17++) {
                            ((l2.b0) f0Var.p.get(i17)).c = (e2.l1) asList.get(i17);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (f0Var.L) {
                        Object[] objArr = ((l2.g1) l0Var2.f).a.p() && f0Var.p0.a.p();
                        boolean equals = ((l2.g1) l0Var2.f).b.equals(f0Var.p0.b);
                        Object[] objArr2 = ((l2.g1) l0Var2.f).d == f0Var.p0.s;
                        if (objArr != false || (equals && objArr2 != false)) {
                            z12 = false;
                        }
                        if (z12) {
                            i16 = f0Var.o0();
                            if (l1Var.p() || ((l2.g1) l0Var2.f).b.b()) {
                                j10 = ((l2.g1) l0Var2.f).d;
                            } else {
                                l2.g1 g1Var = (l2.g1) l0Var2.f;
                                x2.g0 g0Var = g1Var.b;
                                long j11 = g1Var.d;
                                Object obj = g0Var.a;
                                e2.i1 i1Var = f0Var.o;
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
                    f0Var.D1((l2.g1) l0Var2.f, 1, z10, f0Var.K, j3, i7, false);
                    return;
                }
                return;
            case 15:
                l2.z zVar = (l2.z) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList5 = zVar.a.t0;
                int size = arrayList5.size();
                while (i11 < size) {
                    Object obj2 = arrayList5.get(i11);
                    i11++;
                    ((f61) ((e2.w1) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 16:
                li.s sVar = (li.s) this.b;
                mi.f fVar = (mi.f) this.c;
                sVar.getClass();
                sVar.presentFragment(bn.ua(fVar.b.id));
                return;
            case 17:
                ((li.d0) this.b).u1.presentFragment(bn.ua(((mi.f) this.c).b.id));
                return;
            case 18:
                ((m2.g) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 19:
                ((m2.g) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 20:
                ((m2.g) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 21:
                ((m2.g) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 22:
                ((m2.g) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 23:
                k8.a aVar = (k8.a) this.b;
                String str4 = (String) this.c;
                n2.s sVar2 = (n2.s) aVar.c;
                String str5 = h2.l0.a;
                m2.d dVar = ((l2.z) sVar2).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1012, new m2.c(U, str4, 15));
                return;
            case 24:
                k8.a aVar2 = (k8.a) this.b;
                l2.c cVar = (l2.c) this.c;
                n2.s sVar3 = (n2.s) aVar2.c;
                String str6 = h2.l0.a;
                ji.j.z(((l2.z) sVar3).a.F, cVar);
                return;
            case 25:
                n2.c0.a((n2.c0) this.b, (AudioRouting) this.c);
                return;
            case 26:
                n2.c0 c0Var = (n2.c0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (c0Var.d == null || (eVar = ((n2.i0) c0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                e2.e eVar2 = eVar.j;
                List a10 = eVar.a();
                h9.t1 t1Var = n2.b.e;
                eVar.b(n2.b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar2, audioDeviceInfo, a10));
                return;
            case 27:
                String[] strArr = (String[]) this.b;
                q10 q10Var = (q10) this.c;
                oi.p a11 = oi.p.a(strArr[0], org.telegram.messenger.g0.L(26.0f), false);
                if (a11 == null) {
                    a11 = oi.p.a(gd.M0(2131754005, null), org.telegram.messenger.g0.L(26.0f), false);
                    z11 = true;
                }
                org.telegram.messenger.g0.g3(new p6(q10Var, a11 != null ? a11.a : null, z11, 7));
                return;
            case 28:
                oi.u uVar = (oi.u) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                uVar.c2 = false;
                uVar.d2 = 0;
                hi.d dVar2 = uVar.b2;
                dVar2.setLoading(false);
                if (!(tLObject2 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    org.telegram.messenger.g0.E3(4.0f, dVar2, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject2).result;
                if (richMessage == null) {
                    org.telegram.messenger.g0.E3(4.0f, dVar2, null);
                    return;
                }
                uVar.e2 = richMessage;
                uVar.Y1.set(richMessage);
                dVar2.i(gd.M0(2131754059, null), true, true);
                uVar.e1();
                z41 z41Var = uVar.V1;
                if (z41Var != null) {
                    z41Var.O(true);
                    return;
                }
                return;
            default:
                s3 s3Var = (s3) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = org.telegram.messenger.g0.T0(uri);
                } catch (Exception e12) {
                    a8.g(e12, true);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !a8.p0.B(str)) {
                    try {
                        query = s3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e13) {
                        e = e13;
                        str2 = null;
                        a8.g(e, true);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = s3Var.getContext().getContentResolver().openInputStream(uri);
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
                                    } catch (Exception e14) {
                                        e = e14;
                                        a8.g(e, true);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = s3Var.getContext().getContentResolver().openInputStream(uri);
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
                                    str2 = "document_" + bz.p();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = s3Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(w7.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            org.telegram.messenger.g0.D(openInputStream, fileOutputStream);
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
                    openInputStream = s3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !a8.p0.B(str)) {
                    return;
                }
                org.telegram.messenger.g0.g3(new s2(i10, s3Var, str));
                return;
        }
    }
}

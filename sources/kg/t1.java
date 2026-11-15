package kg;

import a8.ja;
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
import android.view.View;
import di.m6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ki.n3;
import ki.x2;
import ki.y3;
import oi.a2;
import oi.h3;
import oi.k5;
import oi.q3;
import oi.y5;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:59|60|61|(3:108|109|(10:111|112|(2:103|104)|65|(1:67)|68|69|70|(1:(1:73))(7:75|76|77|78|79|80|81)|74))|63|(0)|65|(0)|68|69|70|(0)(0)|74) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0198, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ea, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        long j3;
        int i7;
        boolean z10;
        n2.e eVar;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        int i10 = -1;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        View C1 = null;
        r11 = null;
        r11 = null;
        String str3 = null;
        r11 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        ArrayList arrayList = null;
        sQLitePreparedStatement = null;
        boolean z11 = false;
        int i11 = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                vr vrVar = (vr) this.b;
                u1 u1Var = (u1) this.c;
                try {
                    try {
                        sQLitePreparedStatement = vrVar.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, u1Var.a);
                        sQLitePreparedStatement.bindString(2, u1Var.b);
                        sQLitePreparedStatement.bindInteger(3, u1Var.c);
                        sQLitePreparedStatement.bindInteger(4, u1Var.f);
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
            case 1:
                v1 v1Var = (v1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = v1Var.b;
                int i12 = v1Var.a;
                if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
                    np.s1(i12).Y3(tL_messages_quickReplies.users, false);
                    np.s1(i12).S3(tL_messages_quickReplies.chats, false);
                    vr.a0(i12).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i13 = 0; i13 < tL_messages_quickReplies.quick_replies.size(); i13++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i13);
                        u1 u1Var2 = new u1();
                        u1Var2.a = tL_quickReply.shortcut_id;
                        u1Var2.b = tL_quickReply.shortcut;
                        u1Var2.f = tL_quickReply.count;
                        u1Var2.d = tL_quickReply.top_message;
                        u1Var2.c = i13;
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
                            gj gjVar = new gj(i12, message, false, true);
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
                ns.f(i12).k(ns.F1, new Object[0]);
                return;
            case 2:
                v1 v1Var2 = (v1) this.c;
                vr vrVar2 = (vr) this.b;
                ArrayList arrayList4 = v1Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = vrVar2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                            u1 u1Var3 = (u1) arrayList4.get(i15);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, u1Var3.a);
                            sQLitePreparedStatement2.bindString(2, u1Var3.b);
                            sQLitePreparedStatement2.bindInteger(3, u1Var3.c);
                            sQLitePreparedStatement2.bindInteger(4, u1Var3.f);
                            sQLitePreparedStatement2.step();
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
            case 3:
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
            case 4:
                x2 x2Var = (x2) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                x2Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                x2Var.k(botappsettings, true);
                return;
            case 5:
                x2 x2Var2 = (x2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (x2Var2.e0) {
                    return;
                }
                if (tL_error != null) {
                    x2Var2.o(false);
                    return;
                } else {
                    org.telegram.messenger.g0.i3(x2Var2.v0, 60000L);
                    return;
                }
            case 6:
                x2 x2Var3 = (x2) this.b;
                xb Q = new cc(x2Var3.r0, x2Var3.G).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.X2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 7:
                n3 n3Var = (n3) this.b;
                n3Var.getMessagesController().x3(null, (TLRPC.User) this.c, null, n3Var.getClassGuid(), null, false, false);
                return;
            case 8:
                n3 n3Var2 = (n3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                n3Var2.getClass();
                n3Var2.presentFragment(an.ua(connectedbotstarref.bot_id));
                return;
            case 9:
                y3 y3Var = (y3) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (y3Var.U) {
                    return;
                }
                if (tL_error2 != null) {
                    y3Var.b.dismiss();
                    return;
                } else {
                    org.telegram.messenger.g0.i3(y3Var.V, 60000L);
                    return;
                }
            case 10:
                y3 y3Var2 = (y3) this.b;
                xb Q2 = new cc(y3Var2.b.c, y3Var2.a).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.X2((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 11:
                l2.f0 f0Var = (l2.f0) this.b;
                l2.l0 l0Var = (l2.l0) this.c;
                int i16 = f0Var.J - l0Var.b;
                f0Var.J = i16;
                if (l0Var.d) {
                    f0Var.K = l0Var.e;
                    f0Var.L = true;
                }
                if (i16 == 0) {
                    e2.l1 l1Var = ((l2.g1) l0Var.f).a;
                    if (!f0Var.p0.a.p() && l1Var.p()) {
                        f0Var.q0 = -1;
                        f0Var.r0 = 0L;
                    }
                    if (!l1Var.p()) {
                        List asList = Arrays.asList(((l2.l1) l1Var).l);
                        ja.p(asList.size() == f0Var.p.size());
                        for (int i17 = 0; i17 < asList.size(); i17++) {
                            ((l2.b0) f0Var.p.get(i17)).c = (e2.l1) asList.get(i17);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (f0Var.L) {
                        Object[] objArr = ((l2.g1) l0Var.f).a.p() && f0Var.p0.a.p();
                        boolean equals = ((l2.g1) l0Var.f).b.equals(f0Var.p0.b);
                        Object[] objArr2 = ((l2.g1) l0Var.f).d == f0Var.p0.s;
                        if (objArr != false || (equals && objArr2 != false)) {
                            z12 = false;
                        }
                        if (z12) {
                            i10 = f0Var.o0();
                            if (l1Var.p() || ((l2.g1) l0Var.f).b.b()) {
                                j10 = ((l2.g1) l0Var.f).d;
                            } else {
                                l2.g1 g1Var = (l2.g1) l0Var.f;
                                x2.f0 f0Var2 = g1Var.b;
                                long j11 = g1Var.d;
                                Object obj = f0Var2.a;
                                e2.i1 i1Var = f0Var.o;
                                l1Var.g(obj, i1Var);
                                j10 = j11 + i1Var.e;
                            }
                        }
                        j3 = j10;
                        i7 = i10;
                        z10 = z12;
                    } else {
                        j3 = -9223372036854775807L;
                        i7 = -1;
                        z10 = false;
                    }
                    f0Var.L = false;
                    f0Var.D1((l2.g1) l0Var.f, 1, z10, f0Var.K, j3, i7, false);
                    return;
                }
                return;
            case 12:
                l2.z zVar = (l2.z) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList5 = zVar.a.t0;
                int size = arrayList5.size();
                while (i11 < size) {
                    Object obj2 = arrayList5.get(i11);
                    i11++;
                    ((u51) ((e2.w1) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 13:
                li.r rVar = (li.r) this.b;
                mi.f fVar = (mi.f) this.c;
                rVar.getClass();
                rVar.presentFragment(an.ua(fVar.b.id));
                return;
            case 14:
                ((li.d0) this.b).u1.presentFragment(an.ua(((mi.f) this.c).b.id));
                return;
            case 15:
                ((m2.h) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 16:
                ((m2.h) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 17:
                ((m2.h) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 18:
                ((m2.h) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 19:
                ((m2.h) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 20:
                k8.a aVar = (k8.a) this.b;
                String str4 = (String) this.c;
                n2.s sVar = (n2.s) aVar.c;
                String str5 = h2.l0.a;
                m2.e eVar2 = ((l2.z) sVar).a.s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1012, new m2.c(U, str4, 14));
                return;
            case 21:
                k8.a aVar2 = (k8.a) this.b;
                l2.c cVar = (l2.c) this.c;
                n2.s sVar2 = (n2.s) aVar2.c;
                String str6 = h2.l0.a;
                ji.j.T(((l2.z) sVar2).a.F, cVar);
                return;
            case 22:
                n2.c0.a((n2.c0) this.b, (AudioRouting) this.c);
                return;
            case 23:
                n2.c0 c0Var = (n2.c0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (c0Var.d == null || (eVar = ((n2.i0) c0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                e2.e eVar3 = eVar.j;
                List a10 = eVar.a();
                h9.s1 s1Var = n2.b.e;
                eVar.b(n2.b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar3, audioDeviceInfo, a10));
                return;
            case 24:
                String[] strArr = (String[]) this.b;
                s10 s10Var = (s10) this.c;
                oi.p a11 = oi.p.a(strArr[0], org.telegram.messenger.g0.L(26.0f), false);
                if (a11 == null) {
                    a11 = oi.p.a(hd.M0(2131754007, null), org.telegram.messenger.g0.L(26.0f), false);
                    z11 = true;
                }
                org.telegram.messenger.g0.h3(new m6(s10Var, a11 != null ? a11.a : null, z11, 7));
                return;
            case 25:
                oi.u uVar = (oi.u) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                uVar.c2 = false;
                uVar.d2 = 0;
                hi.d dVar = uVar.b2;
                dVar.setLoading(false);
                if (!(tLObject2 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    org.telegram.messenger.g0.F3(4.0f, dVar, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject2).result;
                if (richMessage == null) {
                    org.telegram.messenger.g0.F3(4.0f, dVar, null);
                    return;
                }
                uVar.e2 = richMessage;
                uVar.Y1.set(richMessage);
                dVar.i(hd.M0(2131754061, null), true, true);
                uVar.d1();
                p41 p41Var = uVar.V1;
                if (p41Var != null) {
                    p41Var.O(true);
                    return;
                }
                return;
            case 26:
                q3 q3Var = (q3) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = org.telegram.messenger.g0.T0(uri);
                } catch (Exception e12) {
                    a8.g(e12, true);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !a8.p0.B(str)) {
                    try {
                        query = q3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e13) {
                        e = e13;
                        str2 = null;
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
                                        String replace = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = q3Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream != null) {
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
                                    str2 = "document_" + gz.p();
                                }
                                String replace2 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = q3Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream != null) {
                                    try {
                                        File file = new File(w7.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace2);
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
                        } finally {
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace22 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = q3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream != null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !a8.p0.B(str)) {
                    return;
                }
                org.telegram.messenger.g0.h3(new t1(27, q3Var, str));
                return;
            case 27:
                ((q3) this.b).f2((String) this.c);
                return;
            case 28:
                q3 q3Var2 = (q3) this.b;
                a2 a2Var = (a2) this.c;
                q3Var2.getClass();
                long j12 = a2Var.a;
                int i18 = a2Var.d;
                int i19 = a2Var.c;
                ArrayList arrayList6 = q3Var2.t3;
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((oi.a) arrayList6.get(i20)).a == j12) {
                            i10 = i20;
                        } else {
                            i20++;
                        }
                    }
                }
                if (i10 < 0) {
                    return;
                }
                View m10 = q3Var2.f3.m(i10);
                if (m10 instanceof y5) {
                    y5 y5Var = (y5) m10;
                    y5Var.B();
                    oi.e1 editText = y5Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i19, length)), Math.max(0, Math.min(i18, length)));
                    return;
                }
                if (!(m10 instanceof k5)) {
                    if (m10 instanceof oi.i0) {
                        oi.e1 captionEditText = ((oi.i0) m10).getCaptionEditText();
                        captionEditText.O();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i19, length2)), Math.max(0, Math.min(i18, length2)));
                        return;
                    }
                    return;
                }
                k5 k5Var = (k5) m10;
                oi.e1 m11 = k5Var.m(a2Var.b);
                if (m11 == null) {
                    m11 = k5Var.m(0);
                }
                if (m11 == null) {
                    return;
                }
                m11.O();
                int length3 = m11.length();
                m11.setSelection(Math.max(0, Math.min(i19, length3)), Math.max(0, Math.min(i18, length3)));
                return;
            default:
                h3 h3Var = (h3) this.b;
                oi.a aVar3 = (oi.a) this.c;
                if (aVar3 == null) {
                    h3Var.getClass();
                } else {
                    C1 = h3Var.e.C1(aVar3);
                }
                if (C1 instanceof y5) {
                    y5 y5Var2 = (y5) C1;
                    y5Var2.B();
                    y5Var2.getEditText().setSelection(y5Var2.getEditText().length());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ t1(v1 v1Var, vr vrVar) {
        this.a = 2;
        this.c = v1Var;
        this.b = vrVar;
    }
}

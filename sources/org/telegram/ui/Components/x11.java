package org.telegram.ui.Components;

import android.R;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class x11 {
    public static HashMap O;
    public static HashMap P;
    public static ArrayList Q;
    public Path C;
    public int D;
    public int E;
    public float F;
    public float G;
    public Paint H;
    public Paint I;
    public Paint J;
    public float K;
    public Path L;
    public float[] M;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public Paint f;
    public Paint g;
    public Path h;
    public boolean i;
    public final u5 j;
    public boolean k;
    public final u5 l;
    public int m;
    public final ch0 n;
    public int o;
    public final ch0 p;
    public org.telegram.ui.Cells.y q;
    public final org.telegram.ui.Cells.q1 r;
    public final tm0 s;
    public final Rect u;
    public final Rect v;
    public final boolean x;
    public boolean y;
    public boolean z;
    public static final int[] N = {R.attr.state_enabled, R.attr.state_pressed};
    public static final HashSet R = new HashSet();
    public static final HashMap S = new HashMap();
    public static final HashMap T = new HashMap();
    public boolean w = false;
    public boolean A = false;
    public final x1.a B = new x1.a();
    public long t = SystemClock.elapsedRealtime();

    public x11(org.telegram.ui.Cells.q1 q1Var, tm0 tm0Var) {
        boolean z10 = false;
        z10 = false;
        this.r = q1Var;
        this.s = tm0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        ch0 ch0Var = new ch0(org.telegram.messenger.beta.R.raw.transcribe_out, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.p = ch0Var;
        ch0Var.M(0);
        ch0Var.setCallback(q1Var);
        final int i7 = z10 ? 1 : 0;
        ch0Var.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.t11
            public final /* synthetic */ x11 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        x11 x11Var = this.b;
                        x11Var.p.stop();
                        ch0 ch0Var2 = x11Var.n;
                        ch0Var2.stop();
                        x11Var.z = true;
                        x11Var.y = true;
                        ch0Var2.M(0);
                        break;
                    default:
                        x11 x11Var2 = this.b;
                        x11Var2.n.stop();
                        ch0 ch0Var3 = x11Var2.p;
                        ch0Var3.stop();
                        x11Var2.z = false;
                        x11Var2.y = false;
                        ch0Var3.M(0);
                        break;
                }
            }
        });
        final int i10 = 1;
        ch0Var.J(true);
        ch0 ch0Var2 = new ch0(org.telegram.messenger.beta.R.raw.transcribe_in, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.n = ch0Var2;
        ch0Var2.M(0);
        ch0Var2.setCallback(q1Var);
        ch0Var2.R(q1Var);
        ch0Var2.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.t11
            public final /* synthetic */ x11 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        x11 x11Var = this.b;
                        x11Var.p.stop();
                        ch0 ch0Var22 = x11Var.n;
                        ch0Var22.stop();
                        x11Var.z = true;
                        x11Var.y = true;
                        ch0Var22.M(0);
                        break;
                    default:
                        x11 x11Var2 = this.b;
                        x11Var2.n.stop();
                        ch0 ch0Var3 = x11Var2.p;
                        ch0Var3.stop();
                        x11Var2.z = false;
                        x11Var2.y = false;
                        ch0Var3.M(0);
                        break;
                }
            }
        });
        ch0Var2.J(true);
        this.y = false;
        this.z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.m10.i(q1Var.getMessageObject().K1).q()) {
            z10 = true;
        }
        this.x = z10;
        er erVar = er.h;
        this.l = new u5(q1Var, 250L, erVar);
        this.j = new u5(q1Var, 250L, erVar);
    }

    public static void a(Path path, int i7, int i10, int i11, int i12, float f10, float f11) {
        float a10 = c8.i9.a(f10, 0.0f, 1.0f);
        float a11 = c8.i9.a(f11, 0.0f, 1.0f) - a10;
        if (a11 <= 0.0f) {
            return;
        }
        if (i12 == 1) {
            org.telegram.messenger.g0.P.set(i7 - i11, i10, i7, i10 + i11);
        } else if (i12 == 2) {
            org.telegram.messenger.g0.P.set(i7 - i11, i10 - i11, i7, i10);
        } else if (i12 == 3) {
            org.telegram.messenger.g0.P.set(i7, i10 - i11, i7 + i11, i10);
        } else if (i12 == 4) {
            org.telegram.messenger.g0.P.set(i7, i10, i7 + i11, i10 + i11);
        }
        path.addArc(org.telegram.messenger.g0.P, (a10 * 90.0f) + ((i12 * 90) - 180), a11 * 90.0f);
    }

    public static void b(Path path, int i7, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (f10 <= f11) {
            float f14 = f13 - f12;
            a(path, i7, i10, i11, i12, Math.max(0.0f, f10 - f12) / f14, (Math.min(f11, f13) - f12) / f14);
        } else {
            float f15 = f13 - f12;
            a(path, i7, i10, i11, i12, (f10 - f12) / f15, 1.0f);
            a(path, i7, i10, i11, i12, 0.0f, (f11 - f12) / f15);
        }
    }

    public static void c(Path path, int i7, int i10, int i11, int i12, float f10, float f11) {
        if (i7 == i11 && i10 == i12) {
            return;
        }
        float a10 = c8.i9.a(f10, 0.0f, 1.0f);
        if (c8.i9.a(f11, 0.0f, 1.0f) - a10 <= 0.0f) {
            return;
        }
        path.moveTo(org.telegram.messenger.g0.W1(a10, i7, i11), org.telegram.messenger.g0.W1(a10, i10, i12));
        path.lineTo(org.telegram.messenger.g0.W1(r8, i7, i11), org.telegram.messenger.g0.W1(r8, i10, i12));
    }

    public static void d(Path path, int i7, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (i7 == i11 && i10 == i12) {
            return;
        }
        if (f10 <= f11) {
            float f14 = f13 - f12;
            c(path, i7, i10, i11, i12, Math.max(0.0f, f10 - f12) / f14, (Math.min(f11, f13) - f12) / f14);
        } else {
            float f15 = f13 - f12;
            c(path, i7, i10, i11, i12, (f10 - f12) / f15, 1.0f);
            c(path, i7, i10, i11, i12, 0.0f, (f11 - f12) / f15);
        }
    }

    public static boolean e(org.telegram.messenger.gj gjVar) {
        if (gjVar != null) {
            int i7 = gjVar.K1;
            if (gjVar.k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
                if (i(gjVar)) {
                    return true;
                }
                if (s12.t4 > 0 && gjVar.L0() <= s12.u4) {
                    return s12.v4 == 0 || connectionsManager.getCurrentTime() > s12.v4 || s12.w4 > 0;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.gj gjVar, long j3, String str) {
        try {
            HashMap hashMap = O;
            org.telegram.messenger.gj gjVar2 = gjVar == null ? (hashMap == null || !hashMap.containsKey(Long.valueOf(j3))) ? null : (org.telegram.messenger.gj) O.remove(Long.valueOf(j3)) : gjVar;
            if (gjVar2 != null && gjVar2.k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(p(gjVar2)));
                }
                TLRPC.Message message = gjVar2.k;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionWords = null;
                org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(gjVar2.K1);
                a02.a.c(new org.telegram.messenger.z1(a02, gjVar2.e1(), org.telegram.messenger.gj.B0(gjVar2.k), gjVar2.k, str, 2));
                org.telegram.messenger.g0.h3(new q11(gjVar2, j3, str, 0));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int g(int i7) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        if (s12.t4 <= 0) {
            return 0;
        }
        return (s12.v4 == 0 || connectionsManager.getCurrentTime() > s12.v4) ? s12.t4 : s12.w4;
    }

    public static boolean i(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && gjVar.k != null) {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(gjVar.K1);
            TLRPC.Chat M0 = s12.M0(Long.valueOf(gjVar.x0()));
            if (org.telegram.messenger.t3.n0(M0) && M0.level >= s12.B5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        if (gjVar == null || (message = gjVar.k) == null || !org.telegram.messenger.gj.R4(message) || !gjVar.q4()) {
            return false;
        }
        TLRPC.Message message2 = gjVar.k;
        if (!message2.voiceTranscriptionOpen || !message2.voiceTranscriptionFinal || message2.voiceTranscription == null || message2.voiceTranscriptionLocal == y(gjVar)) {
            return false;
        }
        if (y(gjVar)) {
            if (R.contains(Integer.valueOf(p(gjVar)))) {
                return false;
            }
        }
        return (y(gjVar) || org.telegram.messenger.m10.i(gjVar.K1).q() || e(gjVar)) && !k(gjVar);
    }

    public static boolean k(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap != null && (hashMap.containsValue(gjVar) || P.containsKey(Integer.valueOf(p(gjVar))))) {
            return true;
        }
        HashMap hashMap2 = O;
        return (hashMap2 == null || gjVar == null || (message = gjVar.k) == null || !hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean l(org.telegram.messenger.gj gjVar) {
        if (Q != null) {
            return !gjVar.h4() || Q.contains(Integer.valueOf(p(gjVar)));
        }
        return false;
    }

    public static void m(org.telegram.messenger.gj gjVar) {
        R.add(Integer.valueOf(p(gjVar)));
        S.remove(Integer.valueOf(p(gjVar)));
        T.remove(Integer.valueOf(p(gjVar)));
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(p(gjVar)));
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " failed");
        }
        org.telegram.messenger.ns.f(gjVar.K1).k(org.telegram.messenger.ns.A1, gjVar);
    }

    public static void o(org.telegram.messenger.gj gjVar) {
        if (gjVar == null || l(gjVar)) {
            return;
        }
        if (Q == null) {
            Q = new ArrayList(1);
        }
        Q.add(Integer.valueOf(p(gjVar)));
    }

    public static int p(org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(gjVar.K1), Long.valueOf(org.telegram.messenger.gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()));
    }

    public static void t(org.telegram.messenger.gj gjVar, boolean z10) {
        TLRPC.Message message = gjVar.k;
        if (message == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(gjVar.K1);
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        a02.a.c(new org.telegram.messenger.fk(a02, gjVar.e1(), B0, gjVar.k, 6));
        if (z10) {
            org.telegram.messenger.g0.h3(new ro0(gjVar, 22));
        }
    }

    public static boolean u(org.telegram.messenger.gj gjVar) {
        if (gjVar != null) {
            int i7 = gjVar.K1;
            if (gjVar.k == null || i(gjVar) || y(gjVar) || !TextUtils.isEmpty(gjVar.k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
            if (!org.telegram.messenger.m10.i(i7).q() && s12.v4 != 0 && connectionsManager.getCurrentTime() <= s12.v4 && s12.w4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void v(org.telegram.messenger.gj gjVar) {
        Integer valueOf = Integer.valueOf(p(gjVar));
        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) S.remove(valueOf);
        Runnable runnable = (Runnable) T.remove(valueOf);
        if (gjVar2 == null) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(valueOf);
        }
        org.telegram.messenger.gj[] gjVarArr = {gjVar2, gjVar};
        for (int i7 = 0; i7 < 2; i7++) {
            TLRPC.Message message = gjVarArr[i7].k;
            if (message != null && message.voiceTranscriptionLocal && !message.voiceTranscriptionFinal) {
                message.voiceTranscription = null;
                message.voiceTranscriptionWords = null;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionOpen = false;
            }
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " stopped");
        }
        org.telegram.messenger.ns.f(gjVar2.K1).k(org.telegram.messenger.ns.A1, gjVar2);
    }

    public static void w(org.telegram.messenger.gj gjVar, String str) {
        int i7 = gjVar.K1;
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = (ArrayList) ai.u0.a.get(Long.valueOf(B0));
        android.support.v4.media.session.a0 P2 = DictationAsr.P(arrayList != null ? new ArrayList(arrayList) : new ArrayList(), false);
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " with " + P2);
        }
        Integer valueOf = Integer.valueOf(p(gjVar));
        HashMap hashMap = T;
        ki.r1 r1Var = new ki.r1(valueOf, gjVar, i7, B0, elapsedRealtime);
        boolean[] zArr = {false};
        DictationLid.d(org.telegram.messenger.t0.b);
        new Thread(new ai.r(str, zArr, r1Var, P2, 0), "DictationAsrFile").start();
        hashMap.put(valueOf, new ai.s(0, zArr));
    }

    public static void x(final org.telegram.messenger.gj gjVar, boolean z10, final org.telegram.ui.Cells.l1 l1Var) {
        if (gjVar == null || gjVar.k == null || !gjVar.q4()) {
            return;
        }
        final int i7 = gjVar.K1;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.InputPeer m12 = org.telegram.messenger.np.s1(i7).m1(gjVar.k.peer_id);
        final long n10 = org.telegram.messenger.m5.n(m12);
        TLRPC.Message message = gjVar.k;
        final int i10 = message.id;
        if (!z10) {
            v(gjVar);
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(p(gjVar)));
            }
            gjVar.k.voiceTranscriptionOpen = false;
            org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i7);
            a02.a.c(new org.telegram.messenger.fk(a02, i10, n10, gjVar.k, 6));
            final int i11 = 1;
            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.r11
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    org.telegram.messenger.gj gjVar2 = gjVar;
                    int i13 = i7;
                    switch (i12) {
                        case 0:
                            org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(org.telegram.messenger.ns.A1, gjVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.ns.f(i13).k(org.telegram.messenger.ns.A1, gjVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionLocal == y(gjVar)) {
            o(gjVar);
            gjVar.k.voiceTranscriptionOpen = true;
            org.telegram.messenger.vr a03 = org.telegram.messenger.vr.a0(i7);
            a03.a.c(new org.telegram.messenger.fk(a03, i10, n10, gjVar.k, 6));
            final int i12 = 0;
            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.r11
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i12;
                    org.telegram.messenger.gj gjVar2 = gjVar;
                    int i13 = i7;
                    switch (i122) {
                        case 0:
                            org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(org.telegram.messenger.ns.A1, gjVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.ns.f(i13).k(org.telegram.messenger.ns.A1, gjVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (!y(gjVar)) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n10);
            }
            TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
            tL_messages_transcribeAudio.peer = m12;
            tL_messages_transcribeAudio.msg_id = i10;
            if (P == null) {
                P = new HashMap();
            }
            P.put(Integer.valueOf(p(gjVar)), gjVar);
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() { // from class: org.telegram.ui.Components.s11
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z11;
                    long j3;
                    String str;
                    boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                    int i13 = i7;
                    org.telegram.ui.Cells.l1 l1Var2 = l1Var;
                    org.telegram.messenger.gj gjVar2 = gjVar;
                    String str2 = "";
                    if (z12) {
                        TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                        String str3 = tL_messages_transcribedAudio.text;
                        j3 = tL_messages_transcribedAudio.transcription_id;
                        boolean z13 = tL_messages_transcribedAudio.pending;
                        z11 = !z13;
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                        } else if (z13) {
                            str2 = null;
                        }
                        if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i13);
                            int i14 = tL_messages_transcribedAudio.trial_remains_num;
                            if (i14 != s12.w4) {
                                s12.w4 = i14;
                                s12.f7.edit().putInt("transcribeAudioTrialCurrentNumber", s12.w4).apply();
                            }
                            org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i13);
                            int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                            if (i15 != s13.v4) {
                                s13.v4 = i15;
                                s13.f7.edit().putInt("transcribeAudioTrialCooldownUntil", s13.v4).apply();
                                org.telegram.messenger.g0.h3(new org.telegram.messenger.tj(s13, 3));
                            }
                            org.telegram.messenger.g0.h3(new hh0(19, l1Var2, tL_messages_transcribedAudio));
                        }
                        if (x11.O == null) {
                            x11.O = new HashMap();
                        }
                        x11.O.put(Long.valueOf(j3), gjVar2);
                        gjVar2.k.voiceTranscriptionId = j3;
                    } else {
                        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.np s14 = org.telegram.messenger.np.s1(i13);
                            if (s14.w4 != 0) {
                                s14.w4 = 0;
                                s14.f7.edit().putInt("transcribeAudioTrialCurrentNumber", s14.w4).apply();
                            }
                            org.telegram.messenger.np s15 = org.telegram.messenger.np.s1(i13);
                            int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                            if (intValue != s15.v4) {
                                s15.v4 = intValue;
                                s15.f7.edit().putInt("transcribeAudioTrialCooldownUntil", s15.v4).apply();
                                org.telegram.messenger.g0.h3(new org.telegram.messenger.tj(s15, 3));
                            }
                            org.telegram.messenger.g0.h3(new u11(gjVar2, l1Var2, i13, 0));
                            return;
                        }
                        z11 = true;
                        j3 = 0;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    x11.o(gjVar2);
                    TLRPC.Message message2 = gjVar2.k;
                    message2.voiceTranscriptionOpen = true;
                    message2.voiceTranscriptionFinal = z11;
                    message2.voiceTranscriptionLocal = false;
                    message2.voiceTranscriptionWords = null;
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("Transcription request sent, received final=" + z11 + " id=" + j3 + " text=" + str2);
                    }
                    org.telegram.messenger.vr a04 = org.telegram.messenger.vr.a0(i13);
                    String str4 = str2;
                    a04.a.c(new org.telegram.messenger.z1(a04, i10, n10, gjVar2.k, str4, 2));
                    if (z11) {
                        org.telegram.messenger.g0.i3(new q11(gjVar2, j3, str4, 1), Math.max(0L, 350 - elapsedRealtime2));
                    }
                }
            }, org.telegram.messenger.m10.i(i7).q() ? 0 : 1024);
            return;
        }
        int i13 = gjVar.K1;
        if (P == null) {
            P = new HashMap();
        }
        Integer valueOf = Integer.valueOf(p(gjVar));
        P.put(valueOf, gjVar);
        S.put(valueOf, gjVar);
        org.telegram.messenger.w7.G(i13);
        File M = org.telegram.messenger.w7.M(gjVar.k, false, true);
        if (M != null && M.exists()) {
            w(gjVar, M.getAbsolutePath());
            return;
        }
        String r10 = org.telegram.messenger.w7.r(null, gjVar.F0());
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(i13);
        v11 v11Var = new v11(r10, f10, gjVar);
        f10.b(v11Var, org.telegram.messenger.ns.Y1);
        f10.b(v11Var, org.telegram.messenger.ns.Z1);
        T.put(valueOf, new hh0(18, f10, v11Var));
        org.telegram.messenger.w7.G(i13).W(gjVar.F0(), gjVar, 3, 0);
    }

    public static boolean y(org.telegram.messenger.gj gjVar) {
        return gjVar != null && org.telegram.messenger.gj.R4(gjVar.k) && DictationAsr.A() && DictationAsr.z(gjVar.K1);
    }

    public final int h() {
        return this.u.height();
    }

    public final void n() {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var = this.r;
        if (q1Var == null) {
            return;
        }
        this.w = false;
        boolean z11 = this.z;
        boolean z12 = !z11;
        boolean z13 = this.x;
        if (z11) {
            s(false, true);
            q(false, true);
            z10 = true;
        } else {
            z10 = !this.k;
            if ((z13 || e(q1Var.getMessageObject()) || y(q1Var.getMessageObject())) && q1Var.getMessageObject().q4()) {
                q(true, true);
            }
        }
        org.telegram.ui.Cells.y yVar = this.q;
        if (yVar != null) {
            yVar.setState(StateSet.NOTHING);
            q1Var.invalidate();
        }
        this.A = false;
        if (z10) {
            if (z13 || z11) {
                if (!z11) {
                    this.w = true;
                }
                x(q1Var.getMessageObject(), z12, q1Var.getDelegate());
            } else if (e(q1Var.getMessageObject()) || y(q1Var.getMessageObject()) || !(q1Var.getMessageObject() == null || q1Var.getMessageObject().k == null || TextUtils.isEmpty(q1Var.getMessageObject().k.voiceTranscription))) {
                x(q1Var.getMessageObject(), z12, q1Var.getDelegate());
            } else if (q1Var.getDelegate() != null) {
                if (org.telegram.messenger.np.s1(q1Var.a6).t4 > 0) {
                    q1Var.getDelegate().e0(3);
                } else {
                    q1Var.getDelegate().e0(0);
                }
            }
        }
    }

    public final void q(boolean z10, boolean z11) {
        this.k = z10;
        tm0 tm0Var = this.s;
        if (!tm0Var.z && z10 && tm0Var.B.c <= 0.0f) {
            tm0Var.A = SystemClock.elapsedRealtime();
        }
        tm0Var.z = z10;
        org.telegram.ui.Cells.q1 q1Var = tm0Var.n;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        u5 u5Var = this.l;
        if (!z11) {
            u5Var.f(this.k, true);
        } else if (u5Var.c <= 0.0f) {
            this.t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.r;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void r(boolean z10, boolean z11) {
        org.telegram.ui.Cells.q1 q1Var;
        if (this.i != z10 && (q1Var = this.r) != null) {
            q1Var.invalidate();
        }
        this.i = z10;
        if (z11) {
            return;
        }
        this.j.f(z10, true);
    }

    public final void s(boolean z10, boolean z11) {
        boolean z12 = this.z;
        if (!z12 && z10 && this.w) {
            this.w = false;
            ((org.telegram.ui.Cells.b1) this).U.a.T2 = true;
        }
        this.z = z10;
        ch0 ch0Var = this.p;
        ch0 ch0Var2 = this.n;
        if (!z11) {
            this.y = z10;
            ch0Var2.stop();
            ch0Var.stop();
            ch0Var2.M(0);
            ch0Var.M(0);
        } else if (z10 && !z12) {
            this.y = false;
            ch0Var2.M(0);
            ch0Var.M(0);
            ch0Var.start();
        } else if (!z10 && z12) {
            this.y = true;
            ch0Var.M(0);
            ch0Var2.M(0);
            ch0Var2.start();
        }
        org.telegram.ui.Cells.q1 q1Var = this.r;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    public final int z() {
        return this.u.width();
    }
}

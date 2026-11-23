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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class i21 {
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
    public final c6 j;
    public boolean k;
    public final c6 l;
    public int m;
    public final nh0 n;
    public int o;
    public final nh0 p;
    public org.telegram.ui.Cells.y q;
    public final org.telegram.ui.Cells.r1 r;
    public final dn0 s;
    public final Rect u;
    public final Rect v;
    public final boolean x;
    public boolean y;
    public boolean z;
    public static final int[] N = {R.attr.state_enabled, R.attr.state_pressed};
    public static final HashMap R = new HashMap();
    public static final HashMap S = new HashMap();
    public boolean w = false;
    public boolean A = false;
    public final x1.a B = new x1.a();
    public long t = SystemClock.elapsedRealtime();

    public i21(org.telegram.ui.Cells.r1 r1Var, dn0 dn0Var) {
        boolean z10 = false;
        z10 = false;
        this.r = r1Var;
        this.s = dn0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        nh0 nh0Var = new nh0(org.telegram.messenger.beta.R.raw.transcribe_out, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.p = nh0Var;
        nh0Var.M(0);
        nh0Var.setCallback(r1Var);
        final int i7 = z10 ? 1 : 0;
        nh0Var.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.d21
            public final /* synthetic */ i21 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        i21 i21Var = this.b;
                        i21Var.p.stop();
                        nh0 nh0Var2 = i21Var.n;
                        nh0Var2.stop();
                        i21Var.z = true;
                        i21Var.y = true;
                        nh0Var2.M(0);
                        break;
                    default:
                        i21 i21Var2 = this.b;
                        i21Var2.n.stop();
                        nh0 nh0Var3 = i21Var2.p;
                        nh0Var3.stop();
                        i21Var2.z = false;
                        i21Var2.y = false;
                        nh0Var3.M(0);
                        break;
                }
            }
        });
        final int i10 = 1;
        nh0Var.J(true);
        nh0 nh0Var2 = new nh0(org.telegram.messenger.beta.R.raw.transcribe_in, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.n = nh0Var2;
        nh0Var2.M(0);
        nh0Var2.setCallback(r1Var);
        nh0Var2.R(r1Var);
        nh0Var2.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.d21
            public final /* synthetic */ i21 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        i21 i21Var = this.b;
                        i21Var.p.stop();
                        nh0 nh0Var22 = i21Var.n;
                        nh0Var22.stop();
                        i21Var.z = true;
                        i21Var.y = true;
                        nh0Var22.M(0);
                        break;
                    default:
                        i21 i21Var2 = this.b;
                        i21Var2.n.stop();
                        nh0 nh0Var3 = i21Var2.p;
                        nh0Var3.stop();
                        i21Var2.z = false;
                        i21Var2.y = false;
                        nh0Var3.M(0);
                        break;
                }
            }
        });
        nh0Var2.J(true);
        this.y = false;
        this.z = false;
        if (r1Var.getMessageObject() != null && org.telegram.messenger.i10.i(r1Var.getMessageObject().K1).q()) {
            z10 = true;
        }
        this.x = z10;
        kr krVar = kr.h;
        this.l = new c6(r1Var, 250L, krVar);
        this.j = new c6(r1Var, 250L, krVar);
    }

    public static boolean A(org.telegram.messenger.fj fjVar) {
        if (fjVar != null) {
            int i7 = fjVar.K1;
            if (org.telegram.messenger.fj.R4(fjVar.k) && ((j(fjVar) || DictationAsr.D(i7)) && DictationAsr.E(i7) && fjVar.L0() * 16000.0d * 4.0d < 3.145728E8d)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Path path, int i7, int i10, int i11, int i12, float f10, float f11) {
        float a10 = c8.m9.a(f10, 0.0f, 1.0f);
        float a11 = c8.m9.a(f11, 0.0f, 1.0f) - a10;
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
        float a10 = c8.m9.a(f10, 0.0f, 1.0f);
        if (c8.m9.a(f11, 0.0f, 1.0f) - a10 <= 0.0f) {
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

    public static boolean e(org.telegram.messenger.fj fjVar) {
        if (fjVar != null) {
            int i7 = fjVar.K1;
            if (fjVar.k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                if (i(fjVar)) {
                    return true;
                }
                if (u12.v4 > 0 && fjVar.L0() <= u12.w4) {
                    return u12.x4 == 0 || connectionsManager.getCurrentTime() > u12.x4 || u12.y4 > 0;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.fj fjVar, long j3, String str) {
        try {
            HashMap hashMap = O;
            org.telegram.messenger.fj fjVar2 = fjVar == null ? (hashMap == null || !hashMap.containsKey(Long.valueOf(j3))) ? null : (org.telegram.messenger.fj) O.remove(Long.valueOf(j3)) : fjVar;
            if (fjVar2 != null && fjVar2.k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(r(fjVar2)));
                }
                TLRPC.Message message = fjVar2.k;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionWords = null;
                org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(fjVar2.K1);
                a02.a.c(new org.telegram.messenger.z1(a02, fjVar2.e1(), org.telegram.messenger.fj.B0(fjVar2.k), fjVar2.k, str, 2));
                org.telegram.messenger.g0.g3(new a21(fjVar2, j3, str, 0));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int g(int i7) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        if (u12.v4 <= 0) {
            return 0;
        }
        return (u12.x4 == 0 || connectionsManager.getCurrentTime() > u12.x4) ? u12.v4 : u12.y4;
    }

    public static boolean i(org.telegram.messenger.fj fjVar) {
        if (fjVar != null && fjVar.k != null) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(fjVar.K1);
            TLRPC.Chat O0 = u12.O0(Long.valueOf(fjVar.x0()));
            if (org.telegram.messenger.v3.n0(O0) && O0.level >= u12.D5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.fj fjVar) {
        return fjVar != null && org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.k));
    }

    public static boolean k(org.telegram.messenger.fj fjVar) {
        TLRPC.Message message;
        if (fjVar == null || (message = fjVar.k) == null || !org.telegram.messenger.fj.R4(message) || !fjVar.q4()) {
            return false;
        }
        TLRPC.Message message2 = fjVar.k;
        if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal && message2.voiceTranscription != null && message2.voiceTranscriptionLocal && !A(fjVar)) {
            return (org.telegram.messenger.i10.i(fjVar.K1).q() || e(fjVar)) && !l(fjVar);
        }
        return false;
    }

    public static boolean l(org.telegram.messenger.fj fjVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap != null && (hashMap.containsValue(fjVar) || P.containsKey(Integer.valueOf(r(fjVar))))) {
            return true;
        }
        HashMap hashMap2 = O;
        return (hashMap2 == null || fjVar == null || (message = fjVar.k) == null || !hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean m(org.telegram.messenger.fj fjVar) {
        if (Q != null) {
            return !fjVar.h4() || Q.contains(Integer.valueOf(r(fjVar)));
        }
        return false;
    }

    public static void n(org.telegram.messenger.fj fjVar) {
        R.remove(Integer.valueOf(r(fjVar)));
        S.remove(Integer.valueOf(r(fjVar)));
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(r(fjVar)));
        }
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + fjVar.e1() + " failed");
        }
        org.telegram.messenger.ks.f(fjVar.K1).k(org.telegram.messenger.ks.A1, fjVar);
    }

    public static void o(org.telegram.messenger.fj fjVar) {
        n(fjVar);
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + fjVar.e1() + ": no model and no auto-download, opening speech settings");
        }
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(new ai.r2());
        }
    }

    public static void q(org.telegram.messenger.fj fjVar) {
        if (fjVar == null || m(fjVar)) {
            return;
        }
        if (Q == null) {
            Q = new ArrayList(1);
        }
        Q.add(Integer.valueOf(r(fjVar)));
    }

    public static int r(org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(fjVar.K1), Long.valueOf(org.telegram.messenger.fj.B0(fjVar.k)), Integer.valueOf(fjVar.e1()));
    }

    public static void v(org.telegram.messenger.fj fjVar, boolean z10) {
        TLRPC.Message message = fjVar.k;
        if (message == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(fjVar.K1);
        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
        a02.a.c(new org.telegram.messenger.ek(a02, fjVar.e1(), B0, fjVar.k, 6));
        if (z10) {
            org.telegram.messenger.g0.g3(new bp0(fjVar, 21));
        }
    }

    public static boolean w(org.telegram.messenger.fj fjVar) {
        if (fjVar != null) {
            int i7 = fjVar.K1;
            if (fjVar.k == null || i(fjVar) || A(fjVar) || !TextUtils.isEmpty(fjVar.k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            if (!org.telegram.messenger.i10.i(i7).q() && u12.x4 != 0 && connectionsManager.getCurrentTime() <= u12.x4 && u12.y4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void x(org.telegram.messenger.fj fjVar) {
        Integer valueOf = Integer.valueOf(r(fjVar));
        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) R.remove(valueOf);
        Runnable runnable = (Runnable) S.remove(valueOf);
        if (fjVar2 == null) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(valueOf);
        }
        org.telegram.messenger.fj[] fjVarArr = {fjVar2, fjVar};
        for (int i7 = 0; i7 < 2; i7++) {
            TLRPC.Message message = fjVarArr[i7].k;
            if (message != null && message.voiceTranscriptionLocal && !message.voiceTranscriptionFinal) {
                message.voiceTranscription = null;
                message.voiceTranscriptionWords = null;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionOpen = false;
            }
        }
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + fjVar.e1() + " stopped");
        }
        org.telegram.messenger.ks.f(fjVar2.K1).k(org.telegram.messenger.ks.A1, fjVar2);
    }

    public static void y(org.telegram.messenger.fj fjVar, String str) {
        int i7 = fjVar.K1;
        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = (ArrayList) ai.s0.a.get(Long.valueOf(B0));
        android.support.v4.media.session.a0 W = DictationAsr.W(arrayList != null ? new ArrayList(arrayList) : new ArrayList());
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + fjVar.e1() + " with " + W);
        }
        Integer valueOf = Integer.valueOf(r(fjVar));
        HashMap hashMap = S;
        g21 g21Var = new g21(valueOf, fjVar, i7, B0, elapsedRealtime);
        boolean[] zArr = {false};
        DictationLid.d(org.telegram.messenger.t0.b);
        new Thread(new ai.j(str, zArr, g21Var, W), "DictationAsrFile").start();
        hashMap.put(valueOf, new ai.i(1, zArr));
    }

    public static void z(final org.telegram.messenger.fj fjVar, boolean z10, final org.telegram.ui.Cells.m1 m1Var) {
        ai.q qVar;
        if (fjVar == null || fjVar.k == null || !fjVar.q4()) {
            return;
        }
        final int i7 = fjVar.K1;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.InputPeer o12 = org.telegram.messenger.mp.u1(i7).o1(fjVar.k.peer_id);
        final long n10 = org.telegram.messenger.n5.n(o12);
        TLRPC.Message message = fjVar.k;
        final int i10 = message.id;
        if (!z10) {
            x(fjVar);
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(r(fjVar)));
            }
            fjVar.k.voiceTranscriptionOpen = false;
            org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
            a02.a.c(new org.telegram.messenger.ek(a02, i10, n10, fjVar.k, 6));
            final int i11 = 1;
            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.b21
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    org.telegram.messenger.fj fjVar2 = fjVar;
                    int i13 = i7;
                    switch (i12) {
                        case 0:
                            org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(org.telegram.messenger.ks.A1, fjVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.ks.f(i13).k(org.telegram.messenger.ks.A1, fjVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal && (!message.voiceTranscriptionLocal || A(fjVar))) {
            q(fjVar);
            fjVar.k.voiceTranscriptionOpen = true;
            org.telegram.messenger.tr a03 = org.telegram.messenger.tr.a0(i7);
            a03.a.c(new org.telegram.messenger.ek(a03, i10, n10, fjVar.k, 6));
            final int i12 = 0;
            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.b21
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i12;
                    org.telegram.messenger.fj fjVar2 = fjVar;
                    int i13 = i7;
                    switch (i122) {
                        case 0:
                            org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(org.telegram.messenger.ks.A1, fjVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.ks.f(i13).k(org.telegram.messenger.ks.A1, fjVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (!A(fjVar)) {
            if (j(fjVar)) {
                n(fjVar);
                return;
            }
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n10);
            }
            TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
            tL_messages_transcribeAudio.peer = o12;
            tL_messages_transcribeAudio.msg_id = i10;
            if (P == null) {
                P = new HashMap();
            }
            P.put(Integer.valueOf(r(fjVar)), fjVar);
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() { // from class: org.telegram.ui.Components.c21
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z11;
                    long j3;
                    String str;
                    boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                    int i13 = i7;
                    org.telegram.ui.Cells.m1 m1Var2 = m1Var;
                    org.telegram.messenger.fj fjVar2 = fjVar;
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
                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i13);
                            int i14 = tL_messages_transcribedAudio.trial_remains_num;
                            if (i14 != u12.y4) {
                                u12.y4 = i14;
                                u12.h7.edit().putInt("transcribeAudioTrialCurrentNumber", u12.y4).apply();
                            }
                            org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i13);
                            int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                            if (i15 != u13.x4) {
                                u13.x4 = i15;
                                u13.h7.edit().putInt("transcribeAudioTrialCooldownUntil", u13.x4).apply();
                                org.telegram.messenger.g0.g3(new org.telegram.messenger.rj(u13, 3));
                            }
                            org.telegram.messenger.g0.g3(new sh0(17, m1Var2, tL_messages_transcribedAudio));
                        }
                        if (i21.O == null) {
                            i21.O = new HashMap();
                        }
                        i21.O.put(Long.valueOf(j3), fjVar2);
                        fjVar2.k.voiceTranscriptionId = j3;
                    } else {
                        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.mp u14 = org.telegram.messenger.mp.u1(i13);
                            if (u14.y4 != 0) {
                                u14.y4 = 0;
                                u14.h7.edit().putInt("transcribeAudioTrialCurrentNumber", u14.y4).apply();
                            }
                            org.telegram.messenger.mp u15 = org.telegram.messenger.mp.u1(i13);
                            int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                            if (intValue != u15.x4) {
                                u15.x4 = intValue;
                                u15.h7.edit().putInt("transcribeAudioTrialCooldownUntil", u15.x4).apply();
                                org.telegram.messenger.g0.g3(new org.telegram.messenger.rj(u15, 3));
                            }
                            org.telegram.messenger.g0.g3(new e21(fjVar2, m1Var2, i13, 0));
                            return;
                        }
                        z11 = true;
                        j3 = 0;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    i21.q(fjVar2);
                    TLRPC.Message message2 = fjVar2.k;
                    message2.voiceTranscriptionOpen = true;
                    message2.voiceTranscriptionFinal = z11;
                    message2.voiceTranscriptionLocal = false;
                    message2.voiceTranscriptionWords = null;
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("Transcription request sent, received final=" + z11 + " id=" + j3 + " text=" + str2);
                    }
                    org.telegram.messenger.tr a04 = org.telegram.messenger.tr.a0(i13);
                    String str4 = str2;
                    a04.a.c(new org.telegram.messenger.z1(a04, i10, n10, fjVar2.k, str4, 2));
                    if (z11) {
                        org.telegram.messenger.g0.h3(new a21(fjVar2, j3, str4, 1), Math.max(0L, 350 - elapsedRealtime2));
                    }
                }
            }, org.telegram.messenger.i10.i(i7).q() ? 0 : 1024);
            return;
        }
        ArrayList arrayList = (ArrayList) ai.s0.a.get(Long.valueOf(org.telegram.messenger.fj.B0(fjVar.k)));
        android.support.v4.media.session.a0 W = DictationAsr.W(arrayList != null ? new ArrayList(arrayList) : new ArrayList());
        if (W == null || !((qVar = (ai.q) W.b) == null || qVar.f != 0 || DictationAsr.A(qVar) || ai.h1.b())) {
            o(fjVar);
            return;
        }
        int i13 = fjVar.K1;
        if (P == null) {
            P = new HashMap();
        }
        Integer valueOf = Integer.valueOf(r(fjVar));
        P.put(valueOf, fjVar);
        R.put(valueOf, fjVar);
        org.telegram.messenger.w7.G(i13);
        File M = org.telegram.messenger.w7.M(fjVar.k, false, true);
        if (M != null && M.exists()) {
            y(fjVar, M.getAbsolutePath());
            return;
        }
        String r10 = org.telegram.messenger.w7.r(null, fjVar.F0());
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i13);
        f21 f21Var = new f21(r10, f10, fjVar, m1Var);
        f10.b(f21Var, org.telegram.messenger.ks.Y1);
        f10.b(f21Var, org.telegram.messenger.ks.Z1);
        S.put(valueOf, new sh0(18, f10, f21Var));
        org.telegram.messenger.w7.G(i13).W(fjVar.F0(), fjVar, 3, 0);
    }

    public final int B() {
        return this.u.width();
    }

    public final int h() {
        return this.u.height();
    }

    public final void p() {
        boolean z10;
        org.telegram.ui.Cells.r1 r1Var = this.r;
        if (r1Var == null) {
            return;
        }
        this.w = false;
        boolean z11 = this.z;
        boolean z12 = !z11;
        boolean z13 = this.x;
        if (z11) {
            u(false, true);
            s(false, true);
            z10 = true;
        } else {
            z10 = !this.k;
            if ((z13 || e(r1Var.getMessageObject()) || A(r1Var.getMessageObject())) && r1Var.getMessageObject().q4()) {
                s(true, true);
            }
        }
        org.telegram.ui.Cells.y yVar = this.q;
        if (yVar != null) {
            yVar.setState(StateSet.NOTHING);
            r1Var.invalidate();
        }
        this.A = false;
        if (z10) {
            if (z13 || z11) {
                if (!z11) {
                    this.w = true;
                }
                z(r1Var.getMessageObject(), z12, r1Var.getDelegate());
            } else if (e(r1Var.getMessageObject()) || A(r1Var.getMessageObject()) || !(r1Var.getMessageObject() == null || r1Var.getMessageObject().k == null || TextUtils.isEmpty(r1Var.getMessageObject().k.voiceTranscription))) {
                z(r1Var.getMessageObject(), z12, r1Var.getDelegate());
            } else if (r1Var.getDelegate() != null) {
                if (org.telegram.messenger.mp.u1(r1Var.a6).v4 > 0) {
                    r1Var.getDelegate().m0(3);
                } else {
                    r1Var.getDelegate().m0(0);
                }
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        this.k = z10;
        dn0 dn0Var = this.s;
        if (!dn0Var.z && z10 && dn0Var.B.c <= 0.0f) {
            dn0Var.A = SystemClock.elapsedRealtime();
        }
        dn0Var.z = z10;
        org.telegram.ui.Cells.r1 r1Var = dn0Var.n;
        if (r1Var != null) {
            r1Var.invalidate();
        }
        c6 c6Var = this.l;
        if (!z11) {
            c6Var.f(this.k, true);
        } else if (c6Var.c <= 0.0f) {
            this.t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.r1 r1Var2 = this.r;
        if (r1Var2 != null) {
            r1Var2.invalidate();
        }
    }

    public final void t(boolean z10, boolean z11) {
        org.telegram.ui.Cells.r1 r1Var;
        if (this.i != z10 && (r1Var = this.r) != null) {
            r1Var.invalidate();
        }
        this.i = z10;
        if (z11) {
            return;
        }
        this.j.f(z10, true);
    }

    public final void u(boolean z10, boolean z11) {
        boolean z12 = this.z;
        if (!z12 && z10 && this.w) {
            this.w = false;
            ((org.telegram.ui.Cells.c1) this).T.a.T2 = true;
        }
        this.z = z10;
        nh0 nh0Var = this.p;
        nh0 nh0Var2 = this.n;
        if (!z11) {
            this.y = z10;
            nh0Var2.stop();
            nh0Var.stop();
            nh0Var2.M(0);
            nh0Var.M(0);
        } else if (z10 && !z12) {
            this.y = false;
            nh0Var2.M(0);
            nh0Var.M(0);
            nh0Var.start();
        } else if (!z10 && z12) {
            this.y = true;
            nh0Var.M(0);
            nh0Var2.M(0);
            nh0Var2.start();
        }
        org.telegram.ui.Cells.r1 r1Var = this.r;
        if (r1Var != null) {
            r1Var.invalidate();
        }
    }
}

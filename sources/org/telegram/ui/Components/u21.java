package org.telegram.ui.Components;

import android.R;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class u21 {
    public static final int[] N = {R.attr.state_enabled, R.attr.state_pressed};
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
    public final t5 j;
    public boolean k;
    public final t5 l;
    public int m;
    public final bi0 n;
    public int o;
    public final bi0 p;
    public org.telegram.ui.Cells.y q;
    public final org.telegram.ui.Cells.q1 r;
    public final qn0 s;
    public final Rect u;
    public final Rect v;
    public final boolean x;
    public boolean y;
    public boolean z;
    public boolean w = false;
    public boolean A = false;
    public final u1.a B = new u1.a();
    public long t = SystemClock.elapsedRealtime();

    public u21(org.telegram.ui.Cells.q1 q1Var, qn0 qn0Var) {
        boolean z10 = false;
        z10 = false;
        this.r = q1Var;
        this.s = qn0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        bi0 bi0Var = new bi0(org.telegram.messenger.beta.R.raw.transcribe_out, org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f));
        this.p = bi0Var;
        bi0Var.M(0);
        bi0Var.setCallback(q1Var);
        final int i10 = z10 ? 1 : 0;
        bi0Var.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.r21
            public final /* synthetic */ u21 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        u21 u21Var = this.b;
                        u21Var.p.stop();
                        bi0 bi0Var2 = u21Var.n;
                        bi0Var2.stop();
                        u21Var.z = true;
                        u21Var.y = true;
                        bi0Var2.M(0);
                        break;
                    default:
                        u21 u21Var2 = this.b;
                        u21Var2.n.stop();
                        bi0 bi0Var3 = u21Var2.p;
                        bi0Var3.stop();
                        u21Var2.z = false;
                        u21Var2.y = false;
                        bi0Var3.M(0);
                        break;
                }
            }
        });
        final int i11 = 1;
        bi0Var.J(true);
        bi0 bi0Var2 = new bi0(org.telegram.messenger.beta.R.raw.transcribe_in, org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f));
        this.n = bi0Var2;
        bi0Var2.M(0);
        bi0Var2.setCallback(q1Var);
        bi0Var2.R(q1Var);
        bi0Var2.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.r21
            public final /* synthetic */ u21 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        u21 u21Var = this.b;
                        u21Var.p.stop();
                        bi0 bi0Var22 = u21Var.n;
                        bi0Var22.stop();
                        u21Var.z = true;
                        u21Var.y = true;
                        bi0Var22.M(0);
                        break;
                    default:
                        u21 u21Var2 = this.b;
                        u21Var2.n.stop();
                        bi0 bi0Var3 = u21Var2.p;
                        bi0Var3.stop();
                        u21Var2.z = false;
                        u21Var2.y = false;
                        bi0Var3.M(0);
                        break;
                }
            }
        });
        bi0Var2.J(true);
        this.y = false;
        this.z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.d20.i(q1Var.getMessageObject().I1).q()) {
            z10 = true;
        }
        this.x = z10;
        gr grVar = gr.h;
        this.l = new t5(q1Var, 250L, grVar);
        this.j = new t5(q1Var, 250L, grVar);
    }

    public static void a(Path path, int i10, int i11, int i12, int i13, float f7, float f10) {
        float a2 = w7.u.a(f7, 0.0f, 1.0f);
        float a10 = w7.u.a(f10, 0.0f, 1.0f) - a2;
        if (a10 <= 0.0f) {
            return;
        }
        if (i13 == 1) {
            org.telegram.messenger.i0.P.set(i10 - i12, i11, i10, i11 + i12);
        } else if (i13 == 2) {
            org.telegram.messenger.i0.P.set(i10 - i12, i11 - i12, i10, i11);
        } else if (i13 == 3) {
            org.telegram.messenger.i0.P.set(i10, i11 - i12, i10 + i12, i11);
        } else if (i13 == 4) {
            org.telegram.messenger.i0.P.set(i10, i11, i10 + i12, i11 + i12);
        }
        path.addArc(org.telegram.messenger.i0.P, (a2 * 90.0f) + ((i13 * 90) - 180), a10 * 90.0f);
    }

    public static void b(Path path, int i10, int i11, int i12, int i13, float f7, float f10, float f11, float f12) {
        if (f7 <= f10) {
            float f13 = f12 - f11;
            a(path, i10, i11, i12, i13, Math.max(0.0f, f7 - f11) / f13, (Math.min(f10, f12) - f11) / f13);
        } else {
            float f14 = f12 - f11;
            a(path, i10, i11, i12, i13, (f7 - f11) / f14, 1.0f);
            a(path, i10, i11, i12, i13, 0.0f, (f10 - f11) / f14);
        }
    }

    public static void c(Path path, int i10, int i11, int i12, int i13, float f7, float f10) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float a2 = w7.u.a(f7, 0.0f, 1.0f);
        if (w7.u.a(f10, 0.0f, 1.0f) - a2 <= 0.0f) {
            return;
        }
        path.moveTo(org.telegram.messenger.i0.W1(a2, i10, i12), org.telegram.messenger.i0.W1(a2, i11, i13));
        path.lineTo(org.telegram.messenger.i0.W1(r8, i10, i12), org.telegram.messenger.i0.W1(r8, i11, i13));
    }

    public static void d(Path path, int i10, int i11, int i12, int i13, float f7, float f10, float f11, float f12) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        if (f7 <= f10) {
            float f13 = f12 - f11;
            c(path, i10, i11, i12, i13, Math.max(0.0f, f7 - f11) / f13, (Math.min(f10, f12) - f11) / f13);
        } else {
            float f14 = f12 - f11;
            c(path, i10, i11, i12, i13, (f7 - f11) / f14, 1.0f);
            c(path, i10, i11, i12, i13, 0.0f, (f10 - f11) / f14);
        }
    }

    public static boolean e(org.telegram.messenger.jj jjVar) {
        if (jjVar != null) {
            int i10 = jjVar.I1;
            if (jjVar.k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
                if (i(jjVar)) {
                    return true;
                }
                if (r12.t4 > 0 && jjVar.L0() <= r12.u4) {
                    return r12.v4 == 0 || connectionsManager.getCurrentTime() > r12.v4 || r12.w4 > 0;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.jj jjVar, long j10, String str) {
        try {
            HashMap hashMap = O;
            org.telegram.messenger.jj jjVar2 = jjVar == null ? (hashMap == null || !hashMap.containsKey(Long.valueOf(j10))) ? null : (org.telegram.messenger.jj) O.remove(Long.valueOf(j10)) : jjVar;
            if (jjVar2 != null && jjVar2.k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(n(jjVar2)));
                }
                jjVar2.k.voiceTranscriptionFinal = true;
                org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(jjVar2.I1);
                a02.a.c(new org.telegram.messenger.d2(a02, jjVar2.f1(), org.telegram.messenger.jj.B0(jjVar2.k), jjVar2.k, str, 2));
                org.telegram.messenger.i0.g3(new s21(jjVar2, j10, str, 1));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int g(int i10) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        if (r12.t4 <= 0) {
            return 0;
        }
        return (r12.v4 == 0 || connectionsManager.getCurrentTime() > r12.v4) ? r12.t4 : r12.w4;
    }

    public static boolean i(org.telegram.messenger.jj jjVar) {
        if (jjVar != null && jjVar.k != null) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(jjVar.I1);
            TLRPC.Chat L0 = r12.L0(Long.valueOf(jjVar.x0()));
            if (org.telegram.messenger.w3.n0(L0) && L0.level >= r12.B5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.jj jjVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap != null && (hashMap.containsValue(jjVar) || P.containsKey(Integer.valueOf(n(jjVar))))) {
            return true;
        }
        HashMap hashMap2 = O;
        return (hashMap2 == null || jjVar == null || (message = jjVar.k) == null || !hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean k(org.telegram.messenger.jj jjVar) {
        if (Q != null) {
            return !jjVar.h4() || Q.contains(Integer.valueOf(n(jjVar)));
        }
        return false;
    }

    public static void m(org.telegram.messenger.jj jjVar) {
        if (jjVar == null || k(jjVar)) {
            return;
        }
        if (Q == null) {
            Q = new ArrayList(1);
        }
        Q.add(Integer.valueOf(n(jjVar)));
    }

    public static int n(org.telegram.messenger.jj jjVar) {
        if (jjVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(jjVar.I1), Long.valueOf(org.telegram.messenger.jj.B0(jjVar.k)), Integer.valueOf(jjVar.f1()));
    }

    public static void r(org.telegram.messenger.jj jjVar, boolean z10) {
        TLRPC.Message message = jjVar.k;
        if (message == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(jjVar.I1);
        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
        a02.a.c(new org.telegram.messenger.rk(a02, jjVar.f1(), B0, jjVar.k, 7));
        if (z10) {
            org.telegram.messenger.i0.g3(new uo0(jjVar, 23));
        }
    }

    public static boolean s(org.telegram.messenger.jj jjVar) {
        if (jjVar != null) {
            int i10 = jjVar.I1;
            if (jjVar.k == null || i(jjVar) || !TextUtils.isEmpty(jjVar.k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
            if (!org.telegram.messenger.d20.i(i10).q() && r12.v4 != 0 && connectionsManager.getCurrentTime() <= r12.v4 && r12.w4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void t(final org.telegram.messenger.jj jjVar, boolean z10, final org.telegram.ui.Cells.l1 l1Var) {
        if (jjVar == null || jjVar.k == null || !jjVar.q4()) {
            return;
        }
        final int i10 = jjVar.I1;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.InputPeer l1 = org.telegram.messenger.vp.r1(i10).l1(jjVar.k.peer_id);
        final long n10 = org.telegram.messenger.o5.n(l1);
        TLRPC.Message message = jjVar.k;
        final int i11 = message.id;
        if (!z10) {
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(n(jjVar)));
            }
            jjVar.k.voiceTranscriptionOpen = false;
            org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i10);
            a02.a.c(new org.telegram.messenger.rk(a02, i11, n10, jjVar.k, 7));
            final int i12 = 1;
            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.p21
                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i12;
                    org.telegram.messenger.jj jjVar2 = jjVar;
                    int i14 = i10;
                    switch (i13) {
                        case 0:
                            org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i14);
                            Boolean bool = Boolean.TRUE;
                            f7.k(org.telegram.messenger.zs.A1, jjVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.zs.f(i14).k(org.telegram.messenger.zs.A1, jjVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
            m(jjVar);
            jjVar.k.voiceTranscriptionOpen = true;
            org.telegram.messenger.hs a03 = org.telegram.messenger.hs.a0(i10);
            a03.a.c(new org.telegram.messenger.rk(a03, i11, n10, jjVar.k, 7));
            final int i13 = 0;
            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.p21
                @Override // java.lang.Runnable
                public final void run() {
                    int i132 = i13;
                    org.telegram.messenger.jj jjVar2 = jjVar;
                    int i14 = i10;
                    switch (i132) {
                        case 0:
                            org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i14);
                            Boolean bool = Boolean.TRUE;
                            f7.k(org.telegram.messenger.zs.A1, jjVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.zs.f(i14).k(org.telegram.messenger.zs.A1, jjVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("sending Transcription request, msg_id=" + i11 + " dialog_id=" + n10);
        }
        TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
        tL_messages_transcribeAudio.peer = l1;
        tL_messages_transcribeAudio.msg_id = i11;
        if (P == null) {
            P = new HashMap();
        }
        P.put(Integer.valueOf(n(jjVar)), jjVar);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() { // from class: org.telegram.ui.Components.q21
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11;
                long j10;
                String str;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                int i14 = i10;
                org.telegram.ui.Cells.l1 l1Var2 = l1Var;
                org.telegram.messenger.jj jjVar2 = jjVar;
                String str2 = "";
                if (z12) {
                    TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                    String str3 = tL_messages_transcribedAudio.text;
                    long j11 = tL_messages_transcribedAudio.transcription_id;
                    boolean z13 = tL_messages_transcribedAudio.pending;
                    z11 = !z13;
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    } else if (z13) {
                        str2 = null;
                    }
                    if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i14);
                        int i15 = tL_messages_transcribedAudio.trial_remains_num;
                        if (i15 != r12.w4) {
                            r12.w4 = i15;
                            r12.f7.edit().putInt("transcribeAudioTrialCurrentNumber", r12.w4).apply();
                        }
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i14);
                        int i16 = tL_messages_transcribedAudio.trial_remains_until_date;
                        if (i16 != r13.v4) {
                            r13.v4 = i16;
                            r13.f7.edit().putInt("transcribeAudioTrialCooldownUntil", r13.v4).apply();
                            org.telegram.messenger.i0.g3(new org.telegram.messenger.zj(r13, 3));
                        }
                        org.telegram.messenger.i0.g3(new gi0(17, l1Var2, tL_messages_transcribedAudio));
                    }
                    if (u21.O == null) {
                        u21.O = new HashMap();
                    }
                    u21.O.put(Long.valueOf(j11), jjVar2);
                    jjVar2.k.voiceTranscriptionId = j11;
                    j10 = j11;
                } else {
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        org.telegram.messenger.vp r14 = org.telegram.messenger.vp.r1(i14);
                        if (r14.w4 != 0) {
                            r14.w4 = 0;
                            r14.f7.edit().putInt("transcribeAudioTrialCurrentNumber", r14.w4).apply();
                        }
                        org.telegram.messenger.vp r15 = org.telegram.messenger.vp.r1(i14);
                        int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i14).getCurrentTime();
                        if (intValue != r15.v4) {
                            r15.v4 = intValue;
                            r15.f7.edit().putInt("transcribeAudioTrialCooldownUntil", r15.v4).apply();
                            org.telegram.messenger.i0.g3(new org.telegram.messenger.zj(r15, 3));
                        }
                        org.telegram.messenger.i0.g3(new ji0(jjVar2, l1Var2, i14, 14));
                        return;
                    }
                    z11 = true;
                    j10 = 0;
                }
                String str4 = str2;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                u21.m(jjVar2);
                TLRPC.Message message2 = jjVar2.k;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionFinal = z11;
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("Transcription request sent, received final=" + z11 + " id=" + j10 + " text=" + str4);
                }
                org.telegram.messenger.hs a04 = org.telegram.messenger.hs.a0(i14);
                a04.a.c(new org.telegram.messenger.d2(a04, i11, n10, jjVar2.k, str4, 2));
                if (z11) {
                    org.telegram.messenger.i0.h3(new s21(jjVar2, j10, str4, 0), Math.max(0L, 350 - elapsedRealtime2));
                }
            }
        }, org.telegram.messenger.d20.i(i10).q() ? 0 : 1024);
    }

    public final int h() {
        return this.u.height();
    }

    public final void l() {
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
            q(false, true);
            o(false, true);
            z10 = true;
        } else {
            z10 = !this.k;
            if ((z13 || e(q1Var.getMessageObject())) && q1Var.getMessageObject().q4()) {
                o(true, true);
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
                t(q1Var.getMessageObject(), z12, q1Var.getDelegate());
            } else if (e(q1Var.getMessageObject()) || !(q1Var.getMessageObject() == null || q1Var.getMessageObject().k == null || TextUtils.isEmpty(q1Var.getMessageObject().k.voiceTranscription))) {
                t(q1Var.getMessageObject(), z12, q1Var.getDelegate());
            } else if (q1Var.getDelegate() != null) {
                if (org.telegram.messenger.vp.r1(q1Var.Y5).t4 > 0) {
                    q1Var.getDelegate().c0(3);
                } else {
                    q1Var.getDelegate().c0(0);
                }
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        this.k = z10;
        qn0 qn0Var = this.s;
        if (!qn0Var.z && z10 && qn0Var.B.c <= 0.0f) {
            qn0Var.A = SystemClock.elapsedRealtime();
        }
        qn0Var.z = z10;
        org.telegram.ui.Cells.q1 q1Var = qn0Var.n;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        t5 t5Var = this.l;
        if (!z11) {
            t5Var.f(this.k, true);
        } else if (t5Var.c <= 0.0f) {
            this.t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.r;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void p(boolean z10, boolean z11) {
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

    public final void q(boolean z10, boolean z11) {
        boolean z12 = this.z;
        if (!z12 && z10 && this.w) {
            this.w = false;
            ((org.telegram.ui.Cells.z0) this).R.a.R2 = true;
        }
        this.z = z10;
        bi0 bi0Var = this.p;
        bi0 bi0Var2 = this.n;
        if (!z11) {
            this.y = z10;
            bi0Var2.stop();
            bi0Var.stop();
            bi0Var2.M(0);
            bi0Var.M(0);
        } else if (z10 && !z12) {
            this.y = false;
            bi0Var2.M(0);
            bi0Var.M(0);
            bi0Var.start();
        } else if (!z10 && z12) {
            this.y = true;
            bi0Var.M(0);
            bi0Var2.M(0);
            bi0Var2.start();
        }
        org.telegram.ui.Cells.q1 q1Var = this.r;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    public final int u() {
        return this.u.width();
    }
}

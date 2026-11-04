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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m11 {
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
    public final u5 j;
    public boolean k;
    public final u5 l;
    public int m;
    public final ch0 n;
    public int o;
    public final ch0 p;
    public org.telegram.ui.Cells.y q;
    public final org.telegram.ui.Cells.q1 r;
    public final sm0 s;
    public final Rect u;
    public final Rect v;
    public final boolean x;
    public boolean y;
    public boolean z;
    public boolean w = false;
    public boolean A = false;
    public final w1.a B = new w1.a();
    public long t = SystemClock.elapsedRealtime();

    public m11(org.telegram.ui.Cells.q1 q1Var, sm0 sm0Var) {
        boolean z10 = false;
        z10 = false;
        this.r = q1Var;
        this.s = sm0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        ch0 ch0Var = new ch0(org.telegram.messenger.beta.R.raw.transcribe_out, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.p = ch0Var;
        ch0Var.M(0);
        ch0Var.setCallback(q1Var);
        final int i3 = z10 ? 1 : 0;
        ch0Var.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.j11
            public final /* synthetic */ m11 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        m11 m11Var = this.b;
                        m11Var.p.stop();
                        ch0 ch0Var2 = m11Var.n;
                        ch0Var2.stop();
                        m11Var.z = true;
                        m11Var.y = true;
                        ch0Var2.M(0);
                        break;
                    default:
                        m11 m11Var2 = this.b;
                        m11Var2.n.stop();
                        ch0 ch0Var3 = m11Var2.p;
                        ch0Var3.stop();
                        m11Var2.z = false;
                        m11Var2.y = false;
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
        ch0Var2.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.j11
            public final /* synthetic */ m11 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        m11 m11Var = this.b;
                        m11Var.p.stop();
                        ch0 ch0Var22 = m11Var.n;
                        ch0Var22.stop();
                        m11Var.z = true;
                        m11Var.y = true;
                        ch0Var22.M(0);
                        break;
                    default:
                        m11 m11Var2 = this.b;
                        m11Var2.n.stop();
                        ch0 ch0Var3 = m11Var2.p;
                        ch0Var3.stop();
                        m11Var2.z = false;
                        m11Var2.y = false;
                        ch0Var3.M(0);
                        break;
                }
            }
        });
        ch0Var2.J(true);
        this.y = false;
        this.z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.h10.i(q1Var.getMessageObject().I1).q()) {
            z10 = true;
        }
        this.x = z10;
        xq xqVar = xq.h;
        this.l = new u5(q1Var, 250L, xqVar);
        this.j = new u5(q1Var, 250L, xqVar);
    }

    public static void a(Path path, int i3, int i10, int i11, int i12, float f10, float f11) {
        float a10 = b8.be.a(f10, 0.0f, 1.0f);
        float a11 = b8.be.a(f11, 0.0f, 1.0f) - a10;
        if (a11 <= 0.0f) {
            return;
        }
        if (i12 == 1) {
            org.telegram.messenger.g0.P.set(i3 - i11, i10, i3, i10 + i11);
        } else if (i12 == 2) {
            org.telegram.messenger.g0.P.set(i3 - i11, i10 - i11, i3, i10);
        } else if (i12 == 3) {
            org.telegram.messenger.g0.P.set(i3, i10 - i11, i3 + i11, i10);
        } else if (i12 == 4) {
            org.telegram.messenger.g0.P.set(i3, i10, i3 + i11, i10 + i11);
        }
        path.addArc(org.telegram.messenger.g0.P, (a10 * 90.0f) + ((i12 * 90) - 180), a11 * 90.0f);
    }

    public static void b(Path path, int i3, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (f10 <= f11) {
            float f14 = f13 - f12;
            a(path, i3, i10, i11, i12, Math.max(0.0f, f10 - f12) / f14, (Math.min(f11, f13) - f12) / f14);
        } else {
            float f15 = f13 - f12;
            a(path, i3, i10, i11, i12, (f10 - f12) / f15, 1.0f);
            a(path, i3, i10, i11, i12, 0.0f, (f11 - f12) / f15);
        }
    }

    public static void c(Path path, int i3, int i10, int i11, int i12, float f10, float f11) {
        if (i3 == i11 && i10 == i12) {
            return;
        }
        float a10 = b8.be.a(f10, 0.0f, 1.0f);
        if (b8.be.a(f11, 0.0f, 1.0f) - a10 <= 0.0f) {
            return;
        }
        path.moveTo(org.telegram.messenger.g0.W1(a10, i3, i11), org.telegram.messenger.g0.W1(a10, i10, i12));
        path.lineTo(org.telegram.messenger.g0.W1(r8, i3, i11), org.telegram.messenger.g0.W1(r8, i10, i12));
    }

    public static void d(Path path, int i3, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (i3 == i11 && i10 == i12) {
            return;
        }
        if (f10 <= f11) {
            float f14 = f13 - f12;
            c(path, i3, i10, i11, i12, Math.max(0.0f, f10 - f12) / f14, (Math.min(f11, f13) - f12) / f14);
        } else {
            float f15 = f13 - f12;
            c(path, i3, i10, i11, i12, (f10 - f12) / f15, 1.0f);
            c(path, i3, i10, i11, i12, 0.0f, (f11 - f12) / f15);
        }
    }

    public static boolean e(org.telegram.messenger.zi ziVar) {
        if (ziVar != null) {
            int i3 = ziVar.I1;
            if (ziVar.k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
                if (i(ziVar)) {
                    return true;
                }
                if (s12.s4 > 0 && ziVar.L0() <= s12.t4) {
                    return s12.u4 == 0 || connectionsManager.getCurrentTime() > s12.u4 || s12.v4 > 0;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.zi ziVar, long j10, String str) {
        try {
            HashMap hashMap = O;
            org.telegram.messenger.zi ziVar2 = ziVar == null ? (hashMap == null || !hashMap.containsKey(Long.valueOf(j10))) ? null : (org.telegram.messenger.zi) O.remove(Long.valueOf(j10)) : ziVar;
            if (ziVar2 != null && ziVar2.k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(n(ziVar2)));
                }
                ziVar2.k.voiceTranscriptionFinal = true;
                org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(ziVar2.I1);
                a02.a.c(new org.telegram.messenger.z1(a02, ziVar2.f1(), org.telegram.messenger.zi.B0(ziVar2.k), ziVar2.k, str, 2));
                org.telegram.messenger.g0.h3(new k11(ziVar2, j10, str, 1));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int g(int i3) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        if (s12.s4 <= 0) {
            return 0;
        }
        return (s12.u4 == 0 || connectionsManager.getCurrentTime() > s12.u4) ? s12.s4 : s12.v4;
    }

    public static boolean i(org.telegram.messenger.zi ziVar) {
        if (ziVar != null && ziVar.k != null) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(ziVar.I1);
            TLRPC.Chat M0 = s12.M0(Long.valueOf(ziVar.x0()));
            if (org.telegram.messenger.t3.n0(M0) && M0.level >= s12.A5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.zi ziVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap != null && (hashMap.containsValue(ziVar) || P.containsKey(Integer.valueOf(n(ziVar))))) {
            return true;
        }
        HashMap hashMap2 = O;
        return (hashMap2 == null || ziVar == null || (message = ziVar.k) == null || !hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean k(org.telegram.messenger.zi ziVar) {
        if (Q != null) {
            return !ziVar.i4() || Q.contains(Integer.valueOf(n(ziVar)));
        }
        return false;
    }

    public static void m(org.telegram.messenger.zi ziVar) {
        if (ziVar == null || k(ziVar)) {
            return;
        }
        if (Q == null) {
            Q = new ArrayList(1);
        }
        Q.add(Integer.valueOf(n(ziVar)));
    }

    public static int n(org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(ziVar.I1), Long.valueOf(org.telegram.messenger.zi.B0(ziVar.k)), Integer.valueOf(ziVar.f1()));
    }

    public static void r(org.telegram.messenger.zi ziVar, boolean z10) {
        TLRPC.Message message = ziVar.k;
        if (message == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(ziVar.I1);
        long B0 = org.telegram.messenger.zi.B0(ziVar.k);
        a02.a.c(new org.telegram.messenger.yj(a02, ziVar.f1(), B0, ziVar.k, 6));
        if (z10) {
            org.telegram.messenger.g0.h3(new sp0(ziVar, 20));
        }
    }

    public static boolean s(org.telegram.messenger.zi ziVar) {
        if (ziVar != null) {
            int i3 = ziVar.I1;
            if (ziVar.k == null || i(ziVar) || !TextUtils.isEmpty(ziVar.k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
            if (!org.telegram.messenger.h10.i(i3).q() && s12.u4 != 0 && connectionsManager.getCurrentTime() <= s12.u4 && s12.v4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void t(final org.telegram.messenger.zi ziVar, boolean z10, final org.telegram.ui.Cells.l1 l1Var) {
        if (ziVar == null || ziVar.k == null || !ziVar.r4()) {
            return;
        }
        final int i3 = ziVar.I1;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.InputPeer m1 = org.telegram.messenger.hp.s1(i3).m1(ziVar.k.peer_id);
        final long n4 = org.telegram.messenger.m5.n(m1);
        TLRPC.Message message = ziVar.k;
        final int i10 = message.id;
        if (!z10) {
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(n(ziVar)));
            }
            ziVar.k.voiceTranscriptionOpen = false;
            org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i3);
            a02.a.c(new org.telegram.messenger.yj(a02, i10, n4, ziVar.k, 6));
            final int i11 = 1;
            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.h11
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    org.telegram.messenger.zi ziVar2 = ziVar;
                    int i13 = i3;
                    switch (i12) {
                        case 0:
                            org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(org.telegram.messenger.hs.A1, ziVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.hs.f(i13).k(org.telegram.messenger.hs.A1, ziVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
            m(ziVar);
            ziVar.k.voiceTranscriptionOpen = true;
            org.telegram.messenger.qr a03 = org.telegram.messenger.qr.a0(i3);
            a03.a.c(new org.telegram.messenger.yj(a03, i10, n4, ziVar.k, 6));
            final int i12 = 0;
            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.h11
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i12;
                    org.telegram.messenger.zi ziVar2 = ziVar;
                    int i13 = i3;
                    switch (i122) {
                        case 0:
                            org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(org.telegram.messenger.hs.A1, ziVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.hs.f(i13).k(org.telegram.messenger.hs.A1, ziVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n4);
        }
        TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
        tL_messages_transcribeAudio.peer = m1;
        tL_messages_transcribeAudio.msg_id = i10;
        if (P == null) {
            P = new HashMap();
        }
        P.put(Integer.valueOf(n(ziVar)), ziVar);
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() { // from class: org.telegram.ui.Components.i11
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11;
                long j10;
                String str;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                int i13 = i3;
                org.telegram.ui.Cells.l1 l1Var2 = l1Var;
                org.telegram.messenger.zi ziVar2 = ziVar;
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
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i13);
                        int i14 = tL_messages_transcribedAudio.trial_remains_num;
                        if (i14 != s12.v4) {
                            s12.v4 = i14;
                            s12.e7.edit().putInt("transcribeAudioTrialCurrentNumber", s12.v4).apply();
                        }
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i13);
                        int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                        if (i15 != s13.u4) {
                            s13.u4 = i15;
                            s13.e7.edit().putInt("transcribeAudioTrialCooldownUntil", s13.u4).apply();
                            org.telegram.messenger.g0.h3(new org.telegram.messenger.mj(s13, 3));
                        }
                        org.telegram.messenger.g0.h3(new j50(29, l1Var2, tL_messages_transcribedAudio));
                    }
                    if (m11.O == null) {
                        m11.O = new HashMap();
                    }
                    m11.O.put(Long.valueOf(j11), ziVar2);
                    ziVar2.k.voiceTranscriptionId = j11;
                    j10 = j11;
                } else {
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        org.telegram.messenger.hp s14 = org.telegram.messenger.hp.s1(i13);
                        if (s14.v4 != 0) {
                            s14.v4 = 0;
                            s14.e7.edit().putInt("transcribeAudioTrialCurrentNumber", s14.v4).apply();
                        }
                        org.telegram.messenger.hp s15 = org.telegram.messenger.hp.s1(i13);
                        int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                        if (intValue != s15.u4) {
                            s15.u4 = intValue;
                            s15.e7.edit().putInt("transcribeAudioTrialCooldownUntil", s15.u4).apply();
                            org.telegram.messenger.g0.h3(new org.telegram.messenger.mj(s15, 3));
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.f4(ziVar2, l1Var2, i13, 28));
                        return;
                    }
                    z11 = true;
                    j10 = 0;
                }
                String str4 = str2;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                m11.m(ziVar2);
                TLRPC.Message message2 = ziVar2.k;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionFinal = z11;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("Transcription request sent, received final=" + z11 + " id=" + j10 + " text=" + str4);
                }
                org.telegram.messenger.qr a04 = org.telegram.messenger.qr.a0(i13);
                a04.a.c(new org.telegram.messenger.z1(a04, i10, n4, ziVar2.k, str4, 2));
                if (z11) {
                    org.telegram.messenger.g0.i3(new k11(ziVar2, j10, str4, 0), Math.max(0L, 350 - elapsedRealtime2));
                }
            }
        }, org.telegram.messenger.h10.i(i3).q() ? 0 : 1024);
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
            if ((z13 || e(q1Var.getMessageObject())) && q1Var.getMessageObject().r4()) {
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
                if (org.telegram.messenger.hp.s1(q1Var.Z5).s4 > 0) {
                    q1Var.getDelegate().e0(3);
                } else {
                    q1Var.getDelegate().e0(0);
                }
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        this.k = z10;
        sm0 sm0Var = this.s;
        if (!sm0Var.z && z10 && sm0Var.B.c <= 0.0f) {
            sm0Var.A = SystemClock.elapsedRealtime();
        }
        sm0Var.z = z10;
        org.telegram.ui.Cells.q1 q1Var = sm0Var.n;
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
            ((org.telegram.ui.Cells.a1) this).R.a.S2 = true;
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

    public final int u() {
        return this.u.width();
    }
}

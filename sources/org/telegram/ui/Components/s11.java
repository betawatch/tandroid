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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class s11 {
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
    public final w5 j;
    public boolean k;
    public final w5 l;
    public int m;
    public final zg0 n;
    public int o;
    public final zg0 p;
    public org.telegram.ui.Cells.y q;
    public final org.telegram.ui.Cells.q1 r;
    public final pm0 s;
    public final Rect u;
    public final Rect v;
    public final boolean x;
    public boolean y;
    public boolean z;
    public boolean w = false;
    public boolean A = false;
    public final x1.a B = new x1.a();
    public long t = SystemClock.elapsedRealtime();

    public s11(org.telegram.ui.Cells.q1 q1Var, pm0 pm0Var) {
        boolean z9 = false;
        z9 = false;
        this.r = q1Var;
        this.s = pm0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        zg0 zg0Var = new zg0(org.telegram.messenger.beta.R.raw.transcribe_out, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.p = zg0Var;
        zg0Var.M(0);
        zg0Var.setCallback(q1Var);
        final int i7 = z9 ? 1 : 0;
        zg0Var.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.p11
            public final /* synthetic */ s11 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        s11 s11Var = this.b;
                        s11Var.p.stop();
                        zg0 zg0Var2 = s11Var.n;
                        zg0Var2.stop();
                        s11Var.z = true;
                        s11Var.y = true;
                        zg0Var2.M(0);
                        break;
                    default:
                        s11 s11Var2 = this.b;
                        s11Var2.n.stop();
                        zg0 zg0Var3 = s11Var2.p;
                        zg0Var3.stop();
                        s11Var2.z = false;
                        s11Var2.y = false;
                        zg0Var3.M(0);
                        break;
                }
            }
        });
        final int i10 = 1;
        zg0Var.J(true);
        zg0 zg0Var2 = new zg0(org.telegram.messenger.beta.R.raw.transcribe_in, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.n = zg0Var2;
        zg0Var2.M(0);
        zg0Var2.setCallback(q1Var);
        zg0Var2.R(q1Var);
        zg0Var2.S(19, new Runnable(this) { // from class: org.telegram.ui.Components.p11
            public final /* synthetic */ s11 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        s11 s11Var = this.b;
                        s11Var.p.stop();
                        zg0 zg0Var22 = s11Var.n;
                        zg0Var22.stop();
                        s11Var.z = true;
                        s11Var.y = true;
                        zg0Var22.M(0);
                        break;
                    default:
                        s11 s11Var2 = this.b;
                        s11Var2.n.stop();
                        zg0 zg0Var3 = s11Var2.p;
                        zg0Var3.stop();
                        s11Var2.z = false;
                        s11Var2.y = false;
                        zg0Var3.M(0);
                        break;
                }
            }
        });
        zg0Var2.J(true);
        this.y = false;
        this.z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.p10.i(q1Var.getMessageObject().I1).q()) {
            z9 = true;
        }
        this.x = z9;
        xq xqVar = xq.h;
        this.l = new w5(q1Var, 250L, xqVar);
        this.j = new w5(q1Var, 250L, xqVar);
    }

    public static void a(Path path, int i7, int i10, int i11, int i12, float f10, float f11) {
        float a10 = c8.j9.a(f10, 0.0f, 1.0f);
        float a11 = c8.j9.a(f11, 0.0f, 1.0f) - a10;
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
        float a10 = c8.j9.a(f10, 0.0f, 1.0f);
        if (c8.j9.a(f11, 0.0f, 1.0f) - a10 <= 0.0f) {
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

    public static boolean e(org.telegram.messenger.ij ijVar) {
        if (ijVar != null) {
            int i7 = ijVar.I1;
            if (ijVar.k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                if (i(ijVar)) {
                    return true;
                }
                if (s12.s4 > 0 && ijVar.L0() <= s12.t4) {
                    return s12.u4 == 0 || connectionsManager.getCurrentTime() > s12.u4 || s12.v4 > 0;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.ij ijVar, long j3, String str) {
        try {
            HashMap hashMap = O;
            org.telegram.messenger.ij ijVar2 = ijVar == null ? (hashMap == null || !hashMap.containsKey(Long.valueOf(j3))) ? null : (org.telegram.messenger.ij) O.remove(Long.valueOf(j3)) : ijVar;
            if (ijVar2 != null && ijVar2.k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(n(ijVar2)));
                }
                ijVar2.k.voiceTranscriptionFinal = true;
                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(ijVar2.I1);
                a02.a.c(new org.telegram.messenger.z1(a02, ijVar2.f1(), org.telegram.messenger.ij.B0(ijVar2.k), ijVar2.k, str, 2));
                org.telegram.messenger.g0.h3(new q11(ijVar2, j3, str, 1));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int g(int i7) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        if (s12.s4 <= 0) {
            return 0;
        }
        return (s12.u4 == 0 || connectionsManager.getCurrentTime() > s12.u4) ? s12.s4 : s12.v4;
    }

    public static boolean i(org.telegram.messenger.ij ijVar) {
        if (ijVar != null && ijVar.k != null) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(ijVar.I1);
            TLRPC.Chat M0 = s12.M0(Long.valueOf(ijVar.x0()));
            if (org.telegram.messenger.t3.n0(M0) && M0.level >= s12.A5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.ij ijVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap != null && (hashMap.containsValue(ijVar) || P.containsKey(Integer.valueOf(n(ijVar))))) {
            return true;
        }
        HashMap hashMap2 = O;
        return (hashMap2 == null || ijVar == null || (message = ijVar.k) == null || !hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean k(org.telegram.messenger.ij ijVar) {
        if (Q != null) {
            return !ijVar.i4() || Q.contains(Integer.valueOf(n(ijVar)));
        }
        return false;
    }

    public static void m(org.telegram.messenger.ij ijVar) {
        if (ijVar == null || k(ijVar)) {
            return;
        }
        if (Q == null) {
            Q = new ArrayList(1);
        }
        Q.add(Integer.valueOf(n(ijVar)));
    }

    public static int n(org.telegram.messenger.ij ijVar) {
        if (ijVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(ijVar.I1), Long.valueOf(org.telegram.messenger.ij.B0(ijVar.k)), Integer.valueOf(ijVar.f1()));
    }

    public static void r(org.telegram.messenger.ij ijVar, boolean z9) {
        TLRPC.Message message = ijVar.k;
        if (message == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(ijVar.I1);
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        a02.a.c(new org.telegram.messenger.ik(a02, ijVar.f1(), B0, ijVar.k, 6));
        if (z9) {
            org.telegram.messenger.g0.h3(new ir0(ijVar, 19));
        }
    }

    public static boolean s(org.telegram.messenger.ij ijVar) {
        if (ijVar != null) {
            int i7 = ijVar.I1;
            if (ijVar.k == null || i(ijVar) || !TextUtils.isEmpty(ijVar.k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            if (!org.telegram.messenger.p10.i(i7).q() && s12.u4 != 0 && connectionsManager.getCurrentTime() <= s12.u4 && s12.v4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void t(final org.telegram.messenger.ij ijVar, boolean z9, final org.telegram.ui.Cells.l1 l1Var) {
        if (ijVar == null || ijVar.k == null || !ijVar.r4()) {
            return;
        }
        final int i7 = ijVar.I1;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.InputPeer m12 = org.telegram.messenger.qp.s1(i7).m1(ijVar.k.peer_id);
        final long n10 = org.telegram.messenger.m5.n(m12);
        TLRPC.Message message = ijVar.k;
        final int i10 = message.id;
        if (!z9) {
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(n(ijVar)));
            }
            ijVar.k.voiceTranscriptionOpen = false;
            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
            a02.a.c(new org.telegram.messenger.ik(a02, i10, n10, ijVar.k, 6));
            final int i11 = 1;
            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.n11
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    org.telegram.messenger.ij ijVar2 = ijVar;
                    int i13 = i7;
                    switch (i12) {
                        case 0:
                            org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(org.telegram.messenger.qs.A1, ijVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.qs.f(i13).k(org.telegram.messenger.qs.A1, ijVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
            m(ijVar);
            ijVar.k.voiceTranscriptionOpen = true;
            org.telegram.messenger.yr a03 = org.telegram.messenger.yr.a0(i7);
            a03.a.c(new org.telegram.messenger.ik(a03, i10, n10, ijVar.k, 6));
            final int i12 = 0;
            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.n11
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i12;
                    org.telegram.messenger.ij ijVar2 = ijVar;
                    int i13 = i7;
                    switch (i122) {
                        case 0:
                            org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(org.telegram.messenger.qs.A1, ijVar2, null, null, bool, bool);
                            break;
                        default:
                            org.telegram.messenger.qs.f(i13).k(org.telegram.messenger.qs.A1, ijVar2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n10);
        }
        TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
        tL_messages_transcribeAudio.peer = m12;
        tL_messages_transcribeAudio.msg_id = i10;
        if (P == null) {
            P = new HashMap();
        }
        P.put(Integer.valueOf(n(ijVar)), ijVar);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() { // from class: org.telegram.ui.Components.o11
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z10;
                long j3;
                String str;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                int i13 = i7;
                org.telegram.ui.Cells.l1 l1Var2 = l1Var;
                org.telegram.messenger.ij ijVar2 = ijVar;
                String str2 = "";
                if (z11) {
                    TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                    String str3 = tL_messages_transcribedAudio.text;
                    long j10 = tL_messages_transcribedAudio.transcription_id;
                    boolean z12 = tL_messages_transcribedAudio.pending;
                    z10 = !z12;
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    } else if (z12) {
                        str2 = null;
                    }
                    if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i13);
                        int i14 = tL_messages_transcribedAudio.trial_remains_num;
                        if (i14 != s12.v4) {
                            s12.v4 = i14;
                            s12.e7.edit().putInt("transcribeAudioTrialCurrentNumber", s12.v4).apply();
                        }
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i13);
                        int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                        if (i15 != s13.u4) {
                            s13.u4 = i15;
                            s13.e7.edit().putInt("transcribeAudioTrialCooldownUntil", s13.u4).apply();
                            org.telegram.messenger.g0.h3(new org.telegram.messenger.wj(s13, 3));
                        }
                        org.telegram.messenger.g0.h3(new v80(24, l1Var2, tL_messages_transcribedAudio));
                    }
                    if (s11.O == null) {
                        s11.O = new HashMap();
                    }
                    s11.O.put(Long.valueOf(j10), ijVar2);
                    ijVar2.k.voiceTranscriptionId = j10;
                    j3 = j10;
                } else {
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        org.telegram.messenger.qp s14 = org.telegram.messenger.qp.s1(i13);
                        if (s14.v4 != 0) {
                            s14.v4 = 0;
                            s14.e7.edit().putInt("transcribeAudioTrialCurrentNumber", s14.v4).apply();
                        }
                        org.telegram.messenger.qp s15 = org.telegram.messenger.qp.s1(i13);
                        int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                        if (intValue != s15.u4) {
                            s15.u4 = intValue;
                            s15.e7.edit().putInt("transcribeAudioTrialCooldownUntil", s15.u4).apply();
                            org.telegram.messenger.g0.h3(new org.telegram.messenger.wj(s15, 3));
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.q8(ijVar2, l1Var2, i13, 27));
                        return;
                    }
                    z10 = true;
                    j3 = 0;
                }
                String str4 = str2;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                s11.m(ijVar2);
                TLRPC.Message message2 = ijVar2.k;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionFinal = z10;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("Transcription request sent, received final=" + z10 + " id=" + j3 + " text=" + str4);
                }
                org.telegram.messenger.yr a04 = org.telegram.messenger.yr.a0(i13);
                a04.a.c(new org.telegram.messenger.z1(a04, i10, n10, ijVar2.k, str4, 2));
                if (z10) {
                    org.telegram.messenger.g0.i3(new q11(ijVar2, j3, str4, 0), Math.max(0L, 350 - elapsedRealtime2));
                }
            }
        }, org.telegram.messenger.p10.i(i7).q() ? 0 : 1024);
    }

    public final int h() {
        return this.u.height();
    }

    public final void l() {
        boolean z9;
        org.telegram.ui.Cells.q1 q1Var = this.r;
        if (q1Var == null) {
            return;
        }
        this.w = false;
        boolean z10 = this.z;
        boolean z11 = !z10;
        boolean z12 = this.x;
        if (z10) {
            q(false, true);
            o(false, true);
            z9 = true;
        } else {
            z9 = !this.k;
            if ((z12 || e(q1Var.getMessageObject())) && q1Var.getMessageObject().r4()) {
                o(true, true);
            }
        }
        org.telegram.ui.Cells.y yVar = this.q;
        if (yVar != null) {
            yVar.setState(StateSet.NOTHING);
            q1Var.invalidate();
        }
        this.A = false;
        if (z9) {
            if (z12 || z10) {
                if (!z10) {
                    this.w = true;
                }
                t(q1Var.getMessageObject(), z11, q1Var.getDelegate());
            } else if (e(q1Var.getMessageObject()) || !(q1Var.getMessageObject() == null || q1Var.getMessageObject().k == null || TextUtils.isEmpty(q1Var.getMessageObject().k.voiceTranscription))) {
                t(q1Var.getMessageObject(), z11, q1Var.getDelegate());
            } else if (q1Var.getDelegate() != null) {
                if (org.telegram.messenger.qp.s1(q1Var.Z5).s4 > 0) {
                    q1Var.getDelegate().d0(3);
                } else {
                    q1Var.getDelegate().d0(0);
                }
            }
        }
    }

    public final void o(boolean z9, boolean z10) {
        this.k = z9;
        pm0 pm0Var = this.s;
        if (!pm0Var.z && z9 && pm0Var.B.c <= 0.0f) {
            pm0Var.A = SystemClock.elapsedRealtime();
        }
        pm0Var.z = z9;
        org.telegram.ui.Cells.q1 q1Var = pm0Var.n;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        w5 w5Var = this.l;
        if (!z10) {
            w5Var.f(this.k, true);
        } else if (w5Var.c <= 0.0f) {
            this.t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.r;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void p(boolean z9, boolean z10) {
        org.telegram.ui.Cells.q1 q1Var;
        if (this.i != z9 && (q1Var = this.r) != null) {
            q1Var.invalidate();
        }
        this.i = z9;
        if (z10) {
            return;
        }
        this.j.f(z9, true);
    }

    public final void q(boolean z9, boolean z10) {
        boolean z11 = this.z;
        if (!z11 && z9 && this.w) {
            this.w = false;
            ((org.telegram.ui.Cells.a1) this).R.a.S2 = true;
        }
        this.z = z9;
        zg0 zg0Var = this.p;
        zg0 zg0Var2 = this.n;
        if (!z10) {
            this.y = z9;
            zg0Var2.stop();
            zg0Var.stop();
            zg0Var2.M(0);
            zg0Var.M(0);
        } else if (z9 && !z11) {
            this.y = false;
            zg0Var2.M(0);
            zg0Var.M(0);
            zg0Var.start();
        } else if (!z9 && z11) {
            this.y = true;
            zg0Var.M(0);
            zg0Var2.M(0);
            zg0Var2.start();
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

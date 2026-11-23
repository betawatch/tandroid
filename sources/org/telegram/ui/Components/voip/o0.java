package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o0 {
    public final nh0 a = new nh0(R.raw.voice_mini, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final nh0 b = new nh0(R.raw.hand_2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);
    public qh0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public FrameLayout g;
    public TLRPC.GroupCallParticipant h;
    public final m0 i;
    public final m0 j;
    public boolean k;
    public final m0 l;
    public final m0 m;

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.ui.Components.voip.m0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.voip.m0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Components.voip.m0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Components.voip.m0] */
    public o0() {
        final int i7 = 0;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Components.voip.m0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                switch (i7) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.b.S(0, null);
                        nh0 nh0Var = o0Var.a;
                        nh0Var.S(0, null);
                        qh0 qh0Var = o0Var.c;
                        if (qh0Var != null) {
                            qh0Var.setAnimation(nh0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        nh0 nh0Var2 = o0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt < 32) {
                            i10 = 0;
                        } else {
                            i10 = ks.P3;
                            if (nextInt >= 64) {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i10 = 540;
                                    if (nextInt != 98) {
                                        i11 = 720;
                                    }
                                }
                            }
                            int i12 = i10;
                            i10 = i11;
                            i11 = i12;
                        }
                        nh0Var2.P(i11);
                        nh0Var2.S(i11 - 1, o0Var2.i);
                        nh0Var2.M(i10);
                        qh0 qh0Var2 = o0Var2.c;
                        if (qh0Var2 != null) {
                            qh0Var2.setAnimation(nh0Var2);
                            o0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        o0 o0Var3 = this.b;
                        o0Var3.e = false;
                        ?? r22 = o0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        o0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.j = new Runnable(this) { // from class: org.telegram.ui.Components.voip.m0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i102;
                switch (i10) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.b.S(0, null);
                        nh0 nh0Var = o0Var.a;
                        nh0Var.S(0, null);
                        qh0 qh0Var = o0Var.c;
                        if (qh0Var != null) {
                            qh0Var.setAnimation(nh0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        nh0 nh0Var2 = o0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = ks.P3;
                            if (nextInt >= 64) {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i102 = 540;
                                    if (nextInt != 98) {
                                        i11 = 720;
                                    }
                                }
                            }
                            int i12 = i102;
                            i102 = i11;
                            i11 = i12;
                        }
                        nh0Var2.P(i11);
                        nh0Var2.S(i11 - 1, o0Var2.i);
                        nh0Var2.M(i102);
                        qh0 qh0Var2 = o0Var2.c;
                        if (qh0Var2 != null) {
                            qh0Var2.setAnimation(nh0Var2);
                            o0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        o0 o0Var3 = this.b;
                        o0Var3.e = false;
                        ?? r22 = o0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        o0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i11 = 2;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.voip.m0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i102;
                switch (i11) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.b.S(0, null);
                        nh0 nh0Var = o0Var.a;
                        nh0Var.S(0, null);
                        qh0 qh0Var = o0Var.c;
                        if (qh0Var != null) {
                            qh0Var.setAnimation(nh0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        nh0 nh0Var2 = o0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i112 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = ks.P3;
                            if (nextInt >= 64) {
                                i112 = 420;
                                if (nextInt >= 97) {
                                    i102 = 540;
                                    if (nextInt != 98) {
                                        i112 = 720;
                                    }
                                }
                            }
                            int i12 = i102;
                            i102 = i112;
                            i112 = i12;
                        }
                        nh0Var2.P(i112);
                        nh0Var2.S(i112 - 1, o0Var2.i);
                        nh0Var2.M(i102);
                        qh0 qh0Var2 = o0Var2.c;
                        if (qh0Var2 != null) {
                            qh0Var2.setAnimation(nh0Var2);
                            o0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        o0 o0Var3 = this.b;
                        o0Var3.e = false;
                        ?? r22 = o0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        o0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i12 = 3;
        this.m = new Runnable(this) { // from class: org.telegram.ui.Components.voip.m0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i102;
                switch (i12) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.b.S(0, null);
                        nh0 nh0Var = o0Var.a;
                        nh0Var.S(0, null);
                        qh0 qh0Var = o0Var.c;
                        if (qh0Var != null) {
                            qh0Var.setAnimation(nh0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        nh0 nh0Var2 = o0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i112 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = ks.P3;
                            if (nextInt >= 64) {
                                i112 = 420;
                                if (nextInt >= 97) {
                                    i102 = 540;
                                    if (nextInt != 98) {
                                        i112 = 720;
                                    }
                                }
                            }
                            int i122 = i102;
                            i102 = i112;
                            i112 = i122;
                        }
                        nh0Var2.P(i112);
                        nh0Var2.S(i112 - 1, o0Var2.i);
                        nh0Var2.M(i102);
                        qh0 qh0Var2 = o0Var2.c;
                        if (qh0Var2 != null) {
                            qh0Var2.setAnimation(nh0Var2);
                            o0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        o0 o0Var3 = this.b;
                        o0Var3.e = false;
                        ?? r22 = o0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        o0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            m0 m0Var = this.l;
            if (z10) {
                org.telegram.messenger.g0.r(m0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.h3(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.g = null;
        this.e = false;
        org.telegram.messenger.g0.r(this.l);
        org.telegram.messenger.g0.r(this.j);
        org.telegram.messenger.g0.r(this.m);
        this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        nh0 nh0Var;
        boolean P;
        boolean z11;
        if (this.c == null || (groupCallParticipant = this.h) == null || (nh0Var = this.a) == null) {
            return;
        }
        boolean z12 = groupCallParticipant.muted_by_you && !groupCallParticipant.self;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.h;
        boolean z13 = elapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500 ? groupCallParticipant2.hasVoiceDelayed : groupCallParticipant2.hasVoice;
        boolean z14 = !groupCallParticipant2.self ? (!groupCallParticipant2.muted || (this.e && z13)) && !z12 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.e && z13);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
        boolean z15 = ((groupCallParticipant3.muted && !this.e) || z12) && !(((z11 = groupCallParticipant3.can_self_unmute) && !z12) || z11 || groupCallParticipant3.raise_hand_rating == 0);
        if (z15) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j3 = this.h.lastRaiseHandDate;
            long j10 = elapsedRealtime2 - j3;
            if (j3 != 0 && j10 <= 5000) {
                org.telegram.messenger.g0.h3(this.m, 5000 - j10);
            }
            P = nh0Var.P(ks.S1);
        } else {
            this.c.setAnimation(nh0Var);
            nh0Var.S(0, null);
            if (z14 && this.f) {
                P = nh0Var.P(36);
            } else {
                P = nh0Var.P(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            nh0Var.N(nh0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (P) {
            if (z15) {
                nh0Var.M(99);
                nh0Var.P(ks.S1);
            } else if (z14 && this.f && !z15) {
                nh0Var.M(0);
                nh0Var.P(36);
            } else if (z14) {
                nh0Var.M(69);
                nh0Var.P(99);
            } else {
                nh0Var.M(36);
                nh0Var.P(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(nh0Var);
        this.f = z15;
        if (this.k != z12) {
            this.k = z12;
            ?? r12 = this.g;
            if (r12 != 0) {
                r12.a();
            }
        }
    }
}

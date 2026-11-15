package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o0 {
    public final ch0 a = new ch0(R.raw.voice_mini, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final ch0 b = new ch0(R.raw.hand_2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);
    public fh0 c;
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
                        ch0 ch0Var = o0Var.a;
                        ch0Var.S(0, null);
                        fh0 fh0Var = o0Var.c;
                        if (fh0Var != null) {
                            fh0Var.setAnimation(ch0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        ch0 ch0Var2 = o0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt < 32) {
                            i10 = 0;
                        } else {
                            i10 = ns.P3;
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
                        ch0Var2.P(i11);
                        ch0Var2.S(i11 - 1, o0Var2.i);
                        ch0Var2.M(i10);
                        fh0 fh0Var2 = o0Var2.c;
                        if (fh0Var2 != null) {
                            fh0Var2.setAnimation(ch0Var2);
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
                        ch0 ch0Var = o0Var.a;
                        ch0Var.S(0, null);
                        fh0 fh0Var = o0Var.c;
                        if (fh0Var != null) {
                            fh0Var.setAnimation(ch0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        ch0 ch0Var2 = o0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = ns.P3;
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
                        ch0Var2.P(i11);
                        ch0Var2.S(i11 - 1, o0Var2.i);
                        ch0Var2.M(i102);
                        fh0 fh0Var2 = o0Var2.c;
                        if (fh0Var2 != null) {
                            fh0Var2.setAnimation(ch0Var2);
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
                        ch0 ch0Var = o0Var.a;
                        ch0Var.S(0, null);
                        fh0 fh0Var = o0Var.c;
                        if (fh0Var != null) {
                            fh0Var.setAnimation(ch0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        ch0 ch0Var2 = o0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i112 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = ns.P3;
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
                        ch0Var2.P(i112);
                        ch0Var2.S(i112 - 1, o0Var2.i);
                        ch0Var2.M(i102);
                        fh0 fh0Var2 = o0Var2.c;
                        if (fh0Var2 != null) {
                            fh0Var2.setAnimation(ch0Var2);
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
                        ch0 ch0Var = o0Var.a;
                        ch0Var.S(0, null);
                        fh0 fh0Var = o0Var.c;
                        if (fh0Var != null) {
                            fh0Var.setAnimation(ch0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        ch0 ch0Var2 = o0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i112 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = ns.P3;
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
                        ch0Var2.P(i112);
                        ch0Var2.S(i112 - 1, o0Var2.i);
                        ch0Var2.M(i102);
                        fh0 fh0Var2 = o0Var2.c;
                        if (fh0Var2 != null) {
                            fh0Var2.setAnimation(ch0Var2);
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
            org.telegram.messenger.g0.i3(m0Var, 500L);
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
        ch0 ch0Var;
        boolean P;
        boolean z11;
        if (this.c == null || (groupCallParticipant = this.h) == null || (ch0Var = this.a) == null) {
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
                org.telegram.messenger.g0.i3(this.m, 5000 - j10);
            }
            P = ch0Var.P(ns.S1);
        } else {
            this.c.setAnimation(ch0Var);
            ch0Var.S(0, null);
            if (z14 && this.f) {
                P = ch0Var.P(36);
            } else {
                P = ch0Var.P(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            ch0Var.N(ch0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (P) {
            if (z15) {
                ch0Var.M(99);
                ch0Var.P(ns.S1);
            } else if (z14 && this.f && !z15) {
                ch0Var.M(0);
                ch0Var.P(36);
            } else if (z14) {
                ch0Var.M(69);
                ch0Var.P(99);
            } else {
                ch0Var.M(36);
                ch0Var.P(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(ch0Var);
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

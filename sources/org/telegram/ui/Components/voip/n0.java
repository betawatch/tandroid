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
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n0 {
    public final mh0 a = new mh0(R.raw.voice_mini, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final mh0 b = new mh0(R.raw.hand_2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);
    public ph0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public FrameLayout g;
    public TLRPC.GroupCallParticipant h;
    public final l0 i;
    public final l0 j;
    public boolean k;
    public final l0 l;
    public final l0 m;

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.ui.Components.voip.l0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.voip.l0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Components.voip.l0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Components.voip.l0] */
    public n0() {
        final int i7 = 0;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Components.voip.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                switch (i7) {
                    case 0:
                        n0 n0Var = this.b;
                        n0Var.b.S(0, null);
                        mh0 mh0Var = n0Var.a;
                        mh0Var.S(0, null);
                        ph0 ph0Var = n0Var.c;
                        if (ph0Var != null) {
                            ph0Var.setAnimation(mh0Var);
                            break;
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.b;
                        mh0 mh0Var2 = n0Var2.b;
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
                        mh0Var2.P(i11);
                        mh0Var2.S(i11 - 1, n0Var2.i);
                        mh0Var2.M(i10);
                        ph0 ph0Var2 = n0Var2.c;
                        if (ph0Var2 != null) {
                            ph0Var2.setAnimation(mh0Var2);
                            n0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        n0 n0Var3 = this.b;
                        n0Var3.e = false;
                        ?? r22 = n0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        n0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.j = new Runnable(this) { // from class: org.telegram.ui.Components.voip.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i102;
                switch (i10) {
                    case 0:
                        n0 n0Var = this.b;
                        n0Var.b.S(0, null);
                        mh0 mh0Var = n0Var.a;
                        mh0Var.S(0, null);
                        ph0 ph0Var = n0Var.c;
                        if (ph0Var != null) {
                            ph0Var.setAnimation(mh0Var);
                            break;
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.b;
                        mh0 mh0Var2 = n0Var2.b;
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
                        mh0Var2.P(i11);
                        mh0Var2.S(i11 - 1, n0Var2.i);
                        mh0Var2.M(i102);
                        ph0 ph0Var2 = n0Var2.c;
                        if (ph0Var2 != null) {
                            ph0Var2.setAnimation(mh0Var2);
                            n0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        n0 n0Var3 = this.b;
                        n0Var3.e = false;
                        ?? r22 = n0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        n0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i11 = 2;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.voip.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i102;
                switch (i11) {
                    case 0:
                        n0 n0Var = this.b;
                        n0Var.b.S(0, null);
                        mh0 mh0Var = n0Var.a;
                        mh0Var.S(0, null);
                        ph0 ph0Var = n0Var.c;
                        if (ph0Var != null) {
                            ph0Var.setAnimation(mh0Var);
                            break;
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.b;
                        mh0 mh0Var2 = n0Var2.b;
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
                        mh0Var2.P(i112);
                        mh0Var2.S(i112 - 1, n0Var2.i);
                        mh0Var2.M(i102);
                        ph0 ph0Var2 = n0Var2.c;
                        if (ph0Var2 != null) {
                            ph0Var2.setAnimation(mh0Var2);
                            n0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        n0 n0Var3 = this.b;
                        n0Var3.e = false;
                        ?? r22 = n0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        n0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i12 = 3;
        this.m = new Runnable(this) { // from class: org.telegram.ui.Components.voip.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i102;
                switch (i12) {
                    case 0:
                        n0 n0Var = this.b;
                        n0Var.b.S(0, null);
                        mh0 mh0Var = n0Var.a;
                        mh0Var.S(0, null);
                        ph0 ph0Var = n0Var.c;
                        if (ph0Var != null) {
                            ph0Var.setAnimation(mh0Var);
                            break;
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.b;
                        mh0 mh0Var2 = n0Var2.b;
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
                        mh0Var2.P(i112);
                        mh0Var2.S(i112 - 1, n0Var2.i);
                        mh0Var2.M(i102);
                        ph0 ph0Var2 = n0Var2.c;
                        if (ph0Var2 != null) {
                            ph0Var2.setAnimation(mh0Var2);
                            n0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        n0 n0Var3 = this.b;
                        n0Var3.e = false;
                        ?? r22 = n0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        n0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            l0 l0Var = this.l;
            if (z10) {
                org.telegram.messenger.g0.r(l0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.h3(l0Var, 500L);
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

    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        mh0 mh0Var;
        boolean P;
        boolean z11;
        if (this.c == null || (groupCallParticipant = this.h) == null || (mh0Var = this.a) == null) {
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
            P = mh0Var.P(ks.S1);
        } else {
            this.c.setAnimation(mh0Var);
            mh0Var.S(0, null);
            if (z14 && this.f) {
                P = mh0Var.P(36);
            } else {
                P = mh0Var.P(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            mh0Var.N(mh0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (P) {
            if (z15) {
                mh0Var.M(99);
                mh0Var.P(ks.S1);
            } else if (z14 && this.f && !z15) {
                mh0Var.M(0);
                mh0Var.P(36);
            } else if (z14) {
                mh0Var.M(69);
                mh0Var.P(99);
            } else {
                mh0Var.M(36);
                mh0Var.P(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(mh0Var);
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

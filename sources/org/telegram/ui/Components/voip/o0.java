package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o0 {
    public final ij0 a = new ij0(R.raw.voice_mini, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final ij0 b = new ij0(R.raw.hand_2, "" + R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    public lj0 c;
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
        final int i10 = 0;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Components.voip.m0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                switch (i10) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.b.P(0, null);
                        ij0 ij0Var = o0Var.a;
                        ij0Var.P(0, null);
                        lj0 lj0Var = o0Var.c;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(ij0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        ij0 ij0Var2 = o0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i11 = 0;
                        } else {
                            i11 = 240;
                            if (nextInt < 64) {
                                i12 = 240;
                                i11 = 120;
                            } else {
                                i12 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt == 98) {
                                        i12 = 540;
                                        i11 = 420;
                                    } else {
                                        i12 = 720;
                                    }
                                }
                            }
                        }
                        ij0Var2.N(i12);
                        ij0Var2.P(i12 - 1, o0Var2.i);
                        ij0Var2.K(i11);
                        lj0 lj0Var2 = o0Var2.c;
                        if (lj0Var2 != null) {
                            lj0Var2.setAnimation(ij0Var2);
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
        final int i11 = 1;
        this.j = new Runnable(this) { // from class: org.telegram.ui.Components.voip.m0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i11) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.b.P(0, null);
                        ij0 ij0Var = o0Var.a;
                        ij0Var.P(0, null);
                        lj0 lj0Var = o0Var.c;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(ij0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        ij0 ij0Var2 = o0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
                            if (nextInt < 64) {
                                i12 = 240;
                                i112 = 120;
                            } else {
                                i12 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt == 98) {
                                        i12 = 540;
                                        i112 = 420;
                                    } else {
                                        i12 = 720;
                                    }
                                }
                            }
                        }
                        ij0Var2.N(i12);
                        ij0Var2.P(i12 - 1, o0Var2.i);
                        ij0Var2.K(i112);
                        lj0 lj0Var2 = o0Var2.c;
                        if (lj0Var2 != null) {
                            lj0Var2.setAnimation(ij0Var2);
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
        final int i12 = 2;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.voip.m0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i12) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.b.P(0, null);
                        ij0 ij0Var = o0Var.a;
                        ij0Var.P(0, null);
                        lj0 lj0Var = o0Var.c;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(ij0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        ij0 ij0Var2 = o0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
                            if (nextInt < 64) {
                                i122 = 240;
                                i112 = 120;
                            } else {
                                i122 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt == 98) {
                                        i122 = 540;
                                        i112 = 420;
                                    } else {
                                        i122 = 720;
                                    }
                                }
                            }
                        }
                        ij0Var2.N(i122);
                        ij0Var2.P(i122 - 1, o0Var2.i);
                        ij0Var2.K(i112);
                        lj0 lj0Var2 = o0Var2.c;
                        if (lj0Var2 != null) {
                            lj0Var2.setAnimation(ij0Var2);
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
        final int i13 = 3;
        this.m = new Runnable(this) { // from class: org.telegram.ui.Components.voip.m0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i13) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.b.P(0, null);
                        ij0 ij0Var = o0Var.a;
                        ij0Var.P(0, null);
                        lj0 lj0Var = o0Var.c;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(ij0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        ij0 ij0Var2 = o0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
                            if (nextInt < 64) {
                                i122 = 240;
                                i112 = 120;
                            } else {
                                i122 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt == 98) {
                                        i122 = 540;
                                        i112 = 420;
                                    } else {
                                        i122 = 720;
                                    }
                                }
                            }
                        }
                        ij0Var2.N(i122);
                        ij0Var2.P(i122 - 1, o0Var2.i);
                        ij0Var2.K(i112);
                        lj0 lj0Var2 = o0Var2.c;
                        if (lj0Var2 != null) {
                            lj0Var2.setAnimation(ij0Var2);
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

    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
    public final void a(double d) {
        if (d > 1.5d) {
            boolean z4 = this.d;
            m0 m0Var = this.l;
            if (z4) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.l);
        AndroidUtilities.cancelRunOnUIThread(this.j);
        AndroidUtilities.cancelRunOnUIThread(this.m);
        this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.n0] */
    public final void c(boolean z4) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ij0 ij0Var;
        boolean N;
        boolean z10;
        if (this.c == null || (groupCallParticipant = this.h) == null || (ij0Var = this.a) == null) {
            return;
        }
        boolean z11 = groupCallParticipant.muted_by_you && !groupCallParticipant.self;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.h;
        boolean z12 = elapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500 ? groupCallParticipant2.hasVoiceDelayed : groupCallParticipant2.hasVoice;
        boolean z13 = !groupCallParticipant2.self ? (!groupCallParticipant2.muted || (this.e && z12)) && !z11 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.e && z12);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
        boolean z14 = ((groupCallParticipant3.muted && !this.e) || z11) && !(((z10 = groupCallParticipant3.can_self_unmute) && !z11) || z10 || groupCallParticipant3.raise_hand_rating == 0);
        if (z14) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = this.h.lastRaiseHandDate;
            long j11 = elapsedRealtime2 - j10;
            if (j10 != 0 && j11 <= 5000) {
                AndroidUtilities.runOnUIThread(this.m, 5000 - j11);
            }
            N = ij0Var.N(136);
        } else {
            this.c.setAnimation(ij0Var);
            ij0Var.P(0, null);
            if (z13 && this.f) {
                N = ij0Var.N(36);
            } else {
                N = ij0Var.N(z13 ? 99 : 69);
            }
        }
        if (!z4) {
            ij0Var.L(ij0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (N) {
            if (z14) {
                ij0Var.K(99);
                ij0Var.N(136);
            } else if (z13 && this.f && !z14) {
                ij0Var.K(0);
                ij0Var.N(36);
            } else if (z13) {
                ij0Var.K(69);
                ij0Var.N(99);
            } else {
                ij0Var.K(36);
                ij0Var.N(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(ij0Var);
        this.f = z14;
        if (this.k != z11) {
            this.k = z11;
            ?? r12 = this.g;
            if (r12 != 0) {
                r12.a();
            }
        }
    }
}

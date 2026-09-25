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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class p0 {
    public final ij0 a = new ij0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final ij0 b = new ij0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    public lj0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public FrameLayout g;
    public TLRPC.GroupCallParticipant h;
    public final n0 i;
    public final n0 j;
    public boolean k;
    public final n0 l;
    public final n0 m;

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.ui.Components.voip.n0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.voip.n0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Components.voip.n0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Components.voip.n0] */
    public p0() {
        final int i10 = 0;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Components.voip.n0
            public final /* synthetic */ p0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.o0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                switch (i10) {
                    case 0:
                        p0 p0Var = this.b;
                        p0Var.b.S(0, null);
                        ij0 ij0Var = p0Var.a;
                        ij0Var.S(0, null);
                        lj0 lj0Var = p0Var.c;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(ij0Var);
                            break;
                        }
                        break;
                    case 1:
                        p0 p0Var2 = this.b;
                        ij0 ij0Var2 = p0Var2.b;
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
                        ij0Var2.P(i12);
                        ij0Var2.S(i12 - 1, p0Var2.i);
                        ij0Var2.M(i11);
                        lj0 lj0Var2 = p0Var2.c;
                        if (lj0Var2 != null) {
                            lj0Var2.setAnimation(ij0Var2);
                            p0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        p0 p0Var3 = this.b;
                        p0Var3.e = false;
                        ?? r22 = p0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        p0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.j = new Runnable(this) { // from class: org.telegram.ui.Components.voip.n0
            public final /* synthetic */ p0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.o0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i11) {
                    case 0:
                        p0 p0Var = this.b;
                        p0Var.b.S(0, null);
                        ij0 ij0Var = p0Var.a;
                        ij0Var.S(0, null);
                        lj0 lj0Var = p0Var.c;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(ij0Var);
                            break;
                        }
                        break;
                    case 1:
                        p0 p0Var2 = this.b;
                        ij0 ij0Var2 = p0Var2.b;
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
                        ij0Var2.P(i12);
                        ij0Var2.S(i12 - 1, p0Var2.i);
                        ij0Var2.M(i112);
                        lj0 lj0Var2 = p0Var2.c;
                        if (lj0Var2 != null) {
                            lj0Var2.setAnimation(ij0Var2);
                            p0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        p0 p0Var3 = this.b;
                        p0Var3.e = false;
                        ?? r22 = p0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        p0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i12 = 2;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.voip.n0
            public final /* synthetic */ p0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.o0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i12) {
                    case 0:
                        p0 p0Var = this.b;
                        p0Var.b.S(0, null);
                        ij0 ij0Var = p0Var.a;
                        ij0Var.S(0, null);
                        lj0 lj0Var = p0Var.c;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(ij0Var);
                            break;
                        }
                        break;
                    case 1:
                        p0 p0Var2 = this.b;
                        ij0 ij0Var2 = p0Var2.b;
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
                        ij0Var2.P(i122);
                        ij0Var2.S(i122 - 1, p0Var2.i);
                        ij0Var2.M(i112);
                        lj0 lj0Var2 = p0Var2.c;
                        if (lj0Var2 != null) {
                            lj0Var2.setAnimation(ij0Var2);
                            p0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        p0 p0Var3 = this.b;
                        p0Var3.e = false;
                        ?? r22 = p0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        p0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i13 = 3;
        this.m = new Runnable(this) { // from class: org.telegram.ui.Components.voip.n0
            public final /* synthetic */ p0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.o0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i13) {
                    case 0:
                        p0 p0Var = this.b;
                        p0Var.b.S(0, null);
                        ij0 ij0Var = p0Var.a;
                        ij0Var.S(0, null);
                        lj0 lj0Var = p0Var.c;
                        if (lj0Var != null) {
                            lj0Var.setAnimation(ij0Var);
                            break;
                        }
                        break;
                    case 1:
                        p0 p0Var2 = this.b;
                        ij0 ij0Var2 = p0Var2.b;
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
                        ij0Var2.P(i122);
                        ij0Var2.S(i122 - 1, p0Var2.i);
                        ij0Var2.M(i112);
                        lj0 lj0Var2 = p0Var2.c;
                        if (lj0Var2 != null) {
                            lj0Var2.setAnimation(ij0Var2);
                            p0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        p0 p0Var3 = this.b;
                        p0Var3.e = false;
                        ?? r22 = p0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        p0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.o0] */
    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            n0 n0Var = this.l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(n0Var, 500L);
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

    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.o0] */
    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ij0 ij0Var;
        boolean P;
        boolean z11;
        if (this.c == null || (groupCallParticipant = this.h) == null || (ij0Var = this.a) == null) {
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
                AndroidUtilities.runOnUIThread(this.m, 5000 - j10);
            }
            P = ij0Var.P(136);
        } else {
            this.c.setAnimation(ij0Var);
            ij0Var.S(0, null);
            if (z14 && this.f) {
                P = ij0Var.P(36);
            } else {
                P = ij0Var.P(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            ij0Var.N(ij0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (P) {
            if (z15) {
                ij0Var.M(99);
                ij0Var.P(136);
            } else if (z14 && this.f && !z15) {
                ij0Var.M(0);
                ij0Var.P(36);
            } else if (z14) {
                ij0Var.M(69);
                ij0Var.P(99);
            } else {
                ij0Var.M(36);
                ij0Var.P(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(ij0Var);
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

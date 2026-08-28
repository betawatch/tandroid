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
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n0 {
    public final mi0 a = new mi0(R.raw.voice_mini, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final mi0 b = new mi0(R.raw.hand_2, "" + R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    public pi0 c;
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
        final int i9 = 0;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Components.voip.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                switch (i9) {
                    case 0:
                        n0 n0Var = this.b;
                        n0Var.b.P(0, null);
                        mi0 mi0Var = n0Var.a;
                        mi0Var.P(0, null);
                        pi0 pi0Var = n0Var.c;
                        if (pi0Var != null) {
                            pi0Var.setAnimation(mi0Var);
                            break;
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.b;
                        mi0 mi0Var2 = n0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i11 = 120;
                        if (nextInt < 32) {
                            i10 = 0;
                        } else {
                            i10 = 240;
                            if (nextInt < 64) {
                                i11 = 240;
                                i10 = 120;
                            } else {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i10 = 540;
                                    if (nextInt == 98) {
                                        i11 = 540;
                                        i10 = 420;
                                    } else {
                                        i11 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i11);
                        mi0Var2.P(i11 - 1, n0Var2.i);
                        mi0Var2.K(i10);
                        pi0 pi0Var2 = n0Var2.c;
                        if (pi0Var2 != null) {
                            pi0Var2.setAnimation(mi0Var2);
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
                        n0Var.b.P(0, null);
                        mi0 mi0Var = n0Var.a;
                        mi0Var.P(0, null);
                        pi0 pi0Var = n0Var.c;
                        if (pi0Var != null) {
                            pi0Var.setAnimation(mi0Var);
                            break;
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.b;
                        mi0 mi0Var2 = n0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i11 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = 240;
                            if (nextInt < 64) {
                                i11 = 240;
                                i102 = 120;
                            } else {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i102 = 540;
                                    if (nextInt == 98) {
                                        i11 = 540;
                                        i102 = 420;
                                    } else {
                                        i11 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i11);
                        mi0Var2.P(i11 - 1, n0Var2.i);
                        mi0Var2.K(i102);
                        pi0 pi0Var2 = n0Var2.c;
                        if (pi0Var2 != null) {
                            pi0Var2.setAnimation(mi0Var2);
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
                        n0Var.b.P(0, null);
                        mi0 mi0Var = n0Var.a;
                        mi0Var.P(0, null);
                        pi0 pi0Var = n0Var.c;
                        if (pi0Var != null) {
                            pi0Var.setAnimation(mi0Var);
                            break;
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.b;
                        mi0 mi0Var2 = n0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i112 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = 240;
                            if (nextInt < 64) {
                                i112 = 240;
                                i102 = 120;
                            } else {
                                i112 = 420;
                                if (nextInt >= 97) {
                                    i102 = 540;
                                    if (nextInt == 98) {
                                        i112 = 540;
                                        i102 = 420;
                                    } else {
                                        i112 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i112);
                        mi0Var2.P(i112 - 1, n0Var2.i);
                        mi0Var2.K(i102);
                        pi0 pi0Var2 = n0Var2.c;
                        if (pi0Var2 != null) {
                            pi0Var2.setAnimation(mi0Var2);
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
                        n0Var.b.P(0, null);
                        mi0 mi0Var = n0Var.a;
                        mi0Var.P(0, null);
                        pi0 pi0Var = n0Var.c;
                        if (pi0Var != null) {
                            pi0Var.setAnimation(mi0Var);
                            break;
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.b;
                        mi0 mi0Var2 = n0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i112 = 120;
                        if (nextInt < 32) {
                            i102 = 0;
                        } else {
                            i102 = 240;
                            if (nextInt < 64) {
                                i112 = 240;
                                i102 = 120;
                            } else {
                                i112 = 420;
                                if (nextInt >= 97) {
                                    i102 = 540;
                                    if (nextInt == 98) {
                                        i112 = 540;
                                        i102 = 420;
                                    } else {
                                        i112 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i112);
                        mi0Var2.P(i112 - 1, n0Var2.i);
                        mi0Var2.K(i102);
                        pi0 pi0Var2 = n0Var2.c;
                        if (pi0Var2 != null) {
                            pi0Var2.setAnimation(mi0Var2);
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

    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            l0 l0Var = this.l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(l0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(l0Var, 500L);
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

    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.m0] */
    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        mi0 mi0Var;
        boolean N;
        boolean z11;
        if (this.c == null || (groupCallParticipant = this.h) == null || (mi0Var = this.a) == null) {
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
            long j10 = this.h.lastRaiseHandDate;
            long j11 = elapsedRealtime2 - j10;
            if (j10 != 0 && j11 <= 5000) {
                AndroidUtilities.runOnUIThread(this.m, 5000 - j11);
            }
            N = mi0Var.N(136);
        } else {
            this.c.setAnimation(mi0Var);
            mi0Var.P(0, null);
            if (z14 && this.f) {
                N = mi0Var.N(36);
            } else {
                N = mi0Var.N(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            mi0Var.L(mi0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (N) {
            if (z15) {
                mi0Var.K(99);
                mi0Var.N(136);
            } else if (z14 && this.f && !z15) {
                mi0Var.K(0);
                mi0Var.N(36);
            } else if (z14) {
                mi0Var.K(69);
                mi0Var.N(99);
            } else {
                mi0Var.K(36);
                mi0Var.N(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(mi0Var);
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

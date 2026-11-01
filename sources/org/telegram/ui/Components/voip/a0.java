package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fi0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a0 {
    public final ci0 a = new ci0(R.raw.voice_mini, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
    public final ci0 b = new ci0(R.raw.hand_2, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), true, null);
    public fi0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public FrameLayout g;
    public TLRPC.GroupCallParticipant h;
    public final y i;
    public final y j;
    public boolean k;
    public final y l;
    public final y m;

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.ui.Components.voip.y] */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.voip.y] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Components.voip.y] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Components.voip.y] */
    public a0() {
        final int i10 = 0;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Components.voip.y
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.z] */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                switch (i10) {
                    case 0:
                        a0 a0Var = this.b;
                        a0Var.b.S(0, null);
                        ci0 ci0Var = a0Var.a;
                        ci0Var.S(0, null);
                        fi0 fi0Var = a0Var.c;
                        if (fi0Var != null) {
                            fi0Var.setAnimation(ci0Var);
                            break;
                        }
                        break;
                    case 1:
                        a0 a0Var2 = this.b;
                        ci0 ci0Var2 = a0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i11 = 0;
                        } else {
                            i11 = at.P3;
                            if (nextInt >= 64) {
                                i12 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt != 98) {
                                        i12 = 720;
                                    }
                                }
                            }
                            int i13 = i11;
                            i11 = i12;
                            i12 = i13;
                        }
                        ci0Var2.P(i12);
                        ci0Var2.S(i12 - 1, a0Var2.i);
                        ci0Var2.M(i11);
                        fi0 fi0Var2 = a0Var2.c;
                        if (fi0Var2 != null) {
                            fi0Var2.setAnimation(ci0Var2);
                            a0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        a0 a0Var3 = this.b;
                        a0Var3.e = false;
                        ?? r22 = a0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        a0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.j = new Runnable(this) { // from class: org.telegram.ui.Components.voip.y
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.z] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i11) {
                    case 0:
                        a0 a0Var = this.b;
                        a0Var.b.S(0, null);
                        ci0 ci0Var = a0Var.a;
                        ci0Var.S(0, null);
                        fi0 fi0Var = a0Var.c;
                        if (fi0Var != null) {
                            fi0Var.setAnimation(ci0Var);
                            break;
                        }
                        break;
                    case 1:
                        a0 a0Var2 = this.b;
                        ci0 ci0Var2 = a0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = at.P3;
                            if (nextInt >= 64) {
                                i12 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt != 98) {
                                        i12 = 720;
                                    }
                                }
                            }
                            int i13 = i112;
                            i112 = i12;
                            i12 = i13;
                        }
                        ci0Var2.P(i12);
                        ci0Var2.S(i12 - 1, a0Var2.i);
                        ci0Var2.M(i112);
                        fi0 fi0Var2 = a0Var2.c;
                        if (fi0Var2 != null) {
                            fi0Var2.setAnimation(ci0Var2);
                            a0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        a0 a0Var3 = this.b;
                        a0Var3.e = false;
                        ?? r22 = a0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        a0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i12 = 2;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.voip.y
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.z] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i12) {
                    case 0:
                        a0 a0Var = this.b;
                        a0Var.b.S(0, null);
                        ci0 ci0Var = a0Var.a;
                        ci0Var.S(0, null);
                        fi0 fi0Var = a0Var.c;
                        if (fi0Var != null) {
                            fi0Var.setAnimation(ci0Var);
                            break;
                        }
                        break;
                    case 1:
                        a0 a0Var2 = this.b;
                        ci0 ci0Var2 = a0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = at.P3;
                            if (nextInt >= 64) {
                                i122 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt != 98) {
                                        i122 = 720;
                                    }
                                }
                            }
                            int i13 = i112;
                            i112 = i122;
                            i122 = i13;
                        }
                        ci0Var2.P(i122);
                        ci0Var2.S(i122 - 1, a0Var2.i);
                        ci0Var2.M(i112);
                        fi0 fi0Var2 = a0Var2.c;
                        if (fi0Var2 != null) {
                            fi0Var2.setAnimation(ci0Var2);
                            a0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        a0 a0Var3 = this.b;
                        a0Var3.e = false;
                        ?? r22 = a0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        a0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i13 = 3;
        this.m = new Runnable(this) { // from class: org.telegram.ui.Components.voip.y
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.z] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i13) {
                    case 0:
                        a0 a0Var = this.b;
                        a0Var.b.S(0, null);
                        ci0 ci0Var = a0Var.a;
                        ci0Var.S(0, null);
                        fi0 fi0Var = a0Var.c;
                        if (fi0Var != null) {
                            fi0Var.setAnimation(ci0Var);
                            break;
                        }
                        break;
                    case 1:
                        a0 a0Var2 = this.b;
                        ci0 ci0Var2 = a0Var2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = at.P3;
                            if (nextInt >= 64) {
                                i122 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt != 98) {
                                        i122 = 720;
                                    }
                                }
                            }
                            int i132 = i112;
                            i112 = i122;
                            i122 = i132;
                        }
                        ci0Var2.P(i122);
                        ci0Var2.S(i122 - 1, a0Var2.i);
                        ci0Var2.M(i112);
                        fi0 fi0Var2 = a0Var2.c;
                        if (fi0Var2 != null) {
                            fi0Var2.setAnimation(ci0Var2);
                            a0Var2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        a0 a0Var3 = this.b;
                        a0Var3.e = false;
                        ?? r22 = a0Var3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        a0Var3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.z] */
    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            y yVar = this.l;
            if (z10) {
                org.telegram.messenger.i0.r(yVar);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.i0.h3(yVar, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.g = null;
        this.e = false;
        org.telegram.messenger.i0.r(this.l);
        org.telegram.messenger.i0.r(this.j);
        org.telegram.messenger.i0.r(this.m);
        this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.z] */
    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ci0 ci0Var;
        boolean P;
        boolean z11;
        if (this.c == null || (groupCallParticipant = this.h) == null || (ci0Var = this.a) == null) {
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
                org.telegram.messenger.i0.h3(this.m, 5000 - j11);
            }
            P = ci0Var.P(at.S1);
        } else {
            this.c.setAnimation(ci0Var);
            ci0Var.S(0, null);
            if (z14 && this.f) {
                P = ci0Var.P(36);
            } else {
                P = ci0Var.P(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            ci0Var.N(ci0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (P) {
            if (z15) {
                ci0Var.M(99);
                ci0Var.P(at.S1);
            } else if (z14 && this.f && !z15) {
                ci0Var.M(0);
                ci0Var.P(36);
            } else if (z14) {
                ci0Var.M(69);
                ci0Var.P(99);
            } else {
                ci0Var.M(36);
                ci0Var.P(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(ci0Var);
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

package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z {
    public final bi0 a = new bi0(R.raw.voice_mini, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
    public final bi0 b = new bi0(R.raw.hand_2, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), true, null);
    public ei0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public FrameLayout g;
    public TLRPC.GroupCallParticipant h;
    public final x i;
    public final x j;
    public boolean k;
    public final x l;
    public final x m;

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.ui.Components.voip.x] */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Components.voip.x] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Components.voip.x] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Components.voip.x] */
    public z() {
        final int i10 = 0;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Components.voip.x
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.y] */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                switch (i10) {
                    case 0:
                        z zVar = this.b;
                        zVar.b.S(0, null);
                        bi0 bi0Var = zVar.a;
                        bi0Var.S(0, null);
                        ei0 ei0Var = zVar.c;
                        if (ei0Var != null) {
                            ei0Var.setAnimation(bi0Var);
                            break;
                        }
                        break;
                    case 1:
                        z zVar2 = this.b;
                        bi0 bi0Var2 = zVar2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i11 = 0;
                        } else {
                            i11 = zs.P3;
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
                        bi0Var2.P(i12);
                        bi0Var2.S(i12 - 1, zVar2.i);
                        bi0Var2.M(i11);
                        ei0 ei0Var2 = zVar2.c;
                        if (ei0Var2 != null) {
                            ei0Var2.setAnimation(bi0Var2);
                            zVar2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        z zVar3 = this.b;
                        zVar3.e = false;
                        ?? r22 = zVar3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        zVar3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.j = new Runnable(this) { // from class: org.telegram.ui.Components.voip.x
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.y] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i11) {
                    case 0:
                        z zVar = this.b;
                        zVar.b.S(0, null);
                        bi0 bi0Var = zVar.a;
                        bi0Var.S(0, null);
                        ei0 ei0Var = zVar.c;
                        if (ei0Var != null) {
                            ei0Var.setAnimation(bi0Var);
                            break;
                        }
                        break;
                    case 1:
                        z zVar2 = this.b;
                        bi0 bi0Var2 = zVar2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = zs.P3;
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
                        bi0Var2.P(i12);
                        bi0Var2.S(i12 - 1, zVar2.i);
                        bi0Var2.M(i112);
                        ei0 ei0Var2 = zVar2.c;
                        if (ei0Var2 != null) {
                            ei0Var2.setAnimation(bi0Var2);
                            zVar2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        z zVar3 = this.b;
                        zVar3.e = false;
                        ?? r22 = zVar3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        zVar3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i12 = 2;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.voip.x
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.y] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i12) {
                    case 0:
                        z zVar = this.b;
                        zVar.b.S(0, null);
                        bi0 bi0Var = zVar.a;
                        bi0Var.S(0, null);
                        ei0 ei0Var = zVar.c;
                        if (ei0Var != null) {
                            ei0Var.setAnimation(bi0Var);
                            break;
                        }
                        break;
                    case 1:
                        z zVar2 = this.b;
                        bi0 bi0Var2 = zVar2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = zs.P3;
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
                        bi0Var2.P(i122);
                        bi0Var2.S(i122 - 1, zVar2.i);
                        bi0Var2.M(i112);
                        ei0 ei0Var2 = zVar2.c;
                        if (ei0Var2 != null) {
                            ei0Var2.setAnimation(bi0Var2);
                            zVar2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        z zVar3 = this.b;
                        zVar3.e = false;
                        ?? r22 = zVar3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        zVar3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
        final int i13 = 3;
        this.m = new Runnable(this) { // from class: org.telegram.ui.Components.voip.x
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.y] */
            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i13) {
                    case 0:
                        z zVar = this.b;
                        zVar.b.S(0, null);
                        bi0 bi0Var = zVar.a;
                        bi0Var.S(0, null);
                        ei0 ei0Var = zVar.c;
                        if (ei0Var != null) {
                            ei0Var.setAnimation(bi0Var);
                            break;
                        }
                        break;
                    case 1:
                        z zVar2 = this.b;
                        bi0 bi0Var2 = zVar2.b;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = zs.P3;
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
                        bi0Var2.P(i122);
                        bi0Var2.S(i122 - 1, zVar2.i);
                        bi0Var2.M(i112);
                        ei0 ei0Var2 = zVar2.c;
                        if (ei0Var2 != null) {
                            ei0Var2.setAnimation(bi0Var2);
                            zVar2.c.d();
                            break;
                        }
                        break;
                    case 2:
                        z zVar3 = this.b;
                        zVar3.e = false;
                        ?? r22 = zVar3.g;
                        if (r22 != 0) {
                            r22.a();
                        }
                        zVar3.d = false;
                        break;
                    default:
                        this.b.c(true);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.y] */
    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            x xVar = this.l;
            if (z10) {
                org.telegram.messenger.i0.r(xVar);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.i0.h3(xVar, 500L);
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

    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.FrameLayout, org.telegram.ui.Components.voip.y] */
    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        bi0 bi0Var;
        boolean P;
        boolean z11;
        if (this.c == null || (groupCallParticipant = this.h) == null || (bi0Var = this.a) == null) {
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
            P = bi0Var.P(zs.S1);
        } else {
            this.c.setAnimation(bi0Var);
            bi0Var.S(0, null);
            if (z14 && this.f) {
                P = bi0Var.P(36);
            } else {
                P = bi0Var.P(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            bi0Var.N(bi0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (P) {
            if (z15) {
                bi0Var.M(99);
                bi0Var.P(zs.S1);
            } else if (z14 && this.f && !z15) {
                bi0Var.M(0);
                bi0Var.P(36);
            } else if (z14) {
                bi0Var.M(69);
                bi0Var.P(99);
            } else {
                bi0Var.M(36);
                bi0Var.P(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(bi0Var);
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

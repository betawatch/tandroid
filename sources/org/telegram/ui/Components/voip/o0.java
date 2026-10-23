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
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class o0 {
    public final vj0 a = new vj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final vj0 b = new vj0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    public yj0 c;
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
                        o0Var.b.S(0, null);
                        vj0 vj0Var = o0Var.a;
                        vj0Var.S(0, null);
                        yj0 yj0Var = o0Var.c;
                        if (yj0Var != null) {
                            yj0Var.setAnimation(vj0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        vj0 vj0Var2 = o0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i11 = 0;
                        } else {
                            i11 = 240;
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
                        vj0Var2.P(i12);
                        vj0Var2.S(i12 - 1, o0Var2.i);
                        vj0Var2.M(i11);
                        yj0 yj0Var2 = o0Var2.c;
                        if (yj0Var2 != null) {
                            yj0Var2.setAnimation(vj0Var2);
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
                        o0Var.b.S(0, null);
                        vj0 vj0Var = o0Var.a;
                        vj0Var.S(0, null);
                        yj0 yj0Var = o0Var.c;
                        if (yj0Var != null) {
                            yj0Var.setAnimation(vj0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        vj0 vj0Var2 = o0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
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
                        vj0Var2.P(i12);
                        vj0Var2.S(i12 - 1, o0Var2.i);
                        vj0Var2.M(i112);
                        yj0 yj0Var2 = o0Var2.c;
                        if (yj0Var2 != null) {
                            yj0Var2.setAnimation(vj0Var2);
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
                        o0Var.b.S(0, null);
                        vj0 vj0Var = o0Var.a;
                        vj0Var.S(0, null);
                        yj0 yj0Var = o0Var.c;
                        if (yj0Var != null) {
                            yj0Var.setAnimation(vj0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        vj0 vj0Var2 = o0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
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
                        vj0Var2.P(i122);
                        vj0Var2.S(i122 - 1, o0Var2.i);
                        vj0Var2.M(i112);
                        yj0 yj0Var2 = o0Var2.c;
                        if (yj0Var2 != null) {
                            yj0Var2.setAnimation(vj0Var2);
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
                        o0Var.b.S(0, null);
                        vj0 vj0Var = o0Var.a;
                        vj0Var.S(0, null);
                        yj0 yj0Var = o0Var.c;
                        if (yj0Var != null) {
                            yj0Var.setAnimation(vj0Var);
                            break;
                        }
                        break;
                    case 1:
                        o0 o0Var2 = this.b;
                        vj0 vj0Var2 = o0Var2.b;
                        int nextInt = Utilities.random.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
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
                        vj0Var2.P(i122);
                        vj0Var2.S(i122 - 1, o0Var2.i);
                        vj0Var2.M(i112);
                        yj0 yj0Var2 = o0Var2.c;
                        if (yj0Var2 != null) {
                            yj0Var2.setAnimation(vj0Var2);
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
    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        vj0 vj0Var;
        boolean P;
        boolean z11;
        if (this.c == null || (groupCallParticipant = this.h) == null || (vj0Var = this.a) == null) {
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
            P = vj0Var.P(136);
        } else {
            this.c.setAnimation(vj0Var);
            vj0Var.S(0, null);
            if (z14 && this.f) {
                P = vj0Var.P(36);
            } else {
                P = vj0Var.P(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            vj0Var.N(vj0Var.f - 1, false, true);
            this.c.invalidate();
        } else if (P) {
            if (z15) {
                vj0Var.M(99);
                vj0Var.P(136);
            } else if (z14 && this.f && !z15) {
                vj0Var.M(0);
                vj0Var.P(36);
            } else if (z14) {
                vj0Var.M(69);
                vj0Var.P(99);
            } else {
                vj0Var.M(36);
                vj0Var.P(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(vj0Var);
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

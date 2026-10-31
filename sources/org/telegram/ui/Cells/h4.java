package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class h4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.r8 D;
    public org.telegram.messenger.u3 E;
    public TLRPC.GroupCallParticipant F;
    public TLRPC.User G;
    public TLRPC.Chat H;
    public final Paint I;
    public boolean J;
    public boolean K;
    public int L;
    public org.telegram.messenger.c M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public final c4 R;
    public final c4 S;
    public int T;
    public final c4 U;
    public final c4 V;
    public boolean W;
    public final g4 a;
    public boolean a0;
    public final org.telegram.ui.Components.g9 b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.u5 c;
    public final Drawable c0;
    public final org.telegram.ui.ActionBar.u5[] d;
    public AnimatorSet d0;
    public final org.telegram.ui.ActionBar.u5 e;
    public float e0;
    public final ei0 f;
    public int f0;
    public final bi0 h;
    public final bi0 n;
    public final org.telegram.ui.Components.d5 r;
    public final org.telegram.ui.Components.d5 s;
    public Drawable w;
    public Drawable x;
    public final d4 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Cells.c4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Cells.c4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.ui.Cells.c4] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.ui.Cells.c4] */
    public h4(Context context) {
        super(context);
        int i10 = 5;
        this.d = new org.telegram.ui.ActionBar.u5[5];
        final int i11 = 0;
        this.R = new Runnable(this) { // from class: org.telegram.ui.Cells.c4
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                switch (i11) {
                    case 0:
                        h4 h4Var = this.b;
                        h4Var.n.S(0, null);
                        bi0 bi0Var = h4Var.h;
                        bi0Var.S(0, null);
                        h4Var.f.setAnimation(bi0Var);
                        break;
                    case 1:
                        h4 h4Var2 = this.b;
                        ei0 ei0Var = h4Var2.f;
                        bi0 bi0Var2 = h4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i13 = 120;
                        if (nextInt < 32) {
                            i12 = 0;
                        } else {
                            i12 = zs.P3;
                            if (nextInt >= 64) {
                                i13 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt != 98) {
                                        i13 = 720;
                                    }
                                }
                            }
                            int i14 = i12;
                            i12 = i13;
                            i13 = i14;
                        }
                        bi0Var2.P(i13);
                        bi0Var2.S(i13 - 1, h4Var2.R);
                        ei0Var.setAnimation(bi0Var2);
                        bi0Var2.M(i12);
                        ei0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        h4 h4Var3 = this.b;
                        h4Var3.a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.a.c(0.0d);
                        h4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i12 = 1;
        this.S = new Runnable(this) { // from class: org.telegram.ui.Cells.c4
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i12) {
                    case 0:
                        h4 h4Var = this.b;
                        h4Var.n.S(0, null);
                        bi0 bi0Var = h4Var.h;
                        bi0Var.S(0, null);
                        h4Var.f.setAnimation(bi0Var);
                        break;
                    case 1:
                        h4 h4Var2 = this.b;
                        ei0 ei0Var = h4Var2.f;
                        bi0 bi0Var2 = h4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i13 = 120;
                        if (nextInt < 32) {
                            i122 = 0;
                        } else {
                            i122 = zs.P3;
                            if (nextInt >= 64) {
                                i13 = 420;
                                if (nextInt >= 97) {
                                    i122 = 540;
                                    if (nextInt != 98) {
                                        i13 = 720;
                                    }
                                }
                            }
                            int i14 = i122;
                            i122 = i13;
                            i13 = i14;
                        }
                        bi0Var2.P(i13);
                        bi0Var2.S(i13 - 1, h4Var2.R);
                        ei0Var.setAnimation(bi0Var2);
                        bi0Var2.M(i122);
                        ei0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        h4 h4Var3 = this.b;
                        h4Var3.a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.a.c(0.0d);
                        h4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.T = org.telegram.ui.ActionBar.t6.fh;
        final int i13 = 2;
        this.U = new Runnable(this) { // from class: org.telegram.ui.Cells.c4
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i13) {
                    case 0:
                        h4 h4Var = this.b;
                        h4Var.n.S(0, null);
                        bi0 bi0Var = h4Var.h;
                        bi0Var.S(0, null);
                        h4Var.f.setAnimation(bi0Var);
                        break;
                    case 1:
                        h4 h4Var2 = this.b;
                        ei0 ei0Var = h4Var2.f;
                        bi0 bi0Var2 = h4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i132 = 120;
                        if (nextInt < 32) {
                            i122 = 0;
                        } else {
                            i122 = zs.P3;
                            if (nextInt >= 64) {
                                i132 = 420;
                                if (nextInt >= 97) {
                                    i122 = 540;
                                    if (nextInt != 98) {
                                        i132 = 720;
                                    }
                                }
                            }
                            int i14 = i122;
                            i122 = i132;
                            i132 = i14;
                        }
                        bi0Var2.P(i132);
                        bi0Var2.S(i132 - 1, h4Var2.R);
                        ei0Var.setAnimation(bi0Var2);
                        bi0Var2.M(i122);
                        ei0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        h4 h4Var3 = this.b;
                        h4Var3.a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.a.c(0.0d);
                        h4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.V = new Runnable(this) { // from class: org.telegram.ui.Cells.c4
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (r2) {
                    case 0:
                        h4 h4Var = this.b;
                        h4Var.n.S(0, null);
                        bi0 bi0Var = h4Var.h;
                        bi0Var.S(0, null);
                        h4Var.f.setAnimation(bi0Var);
                        break;
                    case 1:
                        h4 h4Var2 = this.b;
                        ei0 ei0Var = h4Var2.f;
                        bi0 bi0Var2 = h4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i132 = 120;
                        if (nextInt < 32) {
                            i122 = 0;
                        } else {
                            i122 = zs.P3;
                            if (nextInt >= 64) {
                                i132 = 420;
                                if (nextInt >= 97) {
                                    i122 = 540;
                                    if (nextInt != 98) {
                                        i132 = 720;
                                    }
                                }
                            }
                            int i14 = i122;
                            i122 = i132;
                            i132 = i14;
                        }
                        bi0Var2.P(i132);
                        bi0Var2.S(i132 - 1, h4Var2.R);
                        ei0Var.setAnimation(bi0Var2);
                        bi0Var2.M(i122);
                        ei0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        h4 h4Var3 = this.b;
                        h4Var3.a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.a.c(0.0d);
                        h4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i14 = 4;
        new Runnable(this) { // from class: org.telegram.ui.Cells.c4
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i14) {
                    case 0:
                        h4 h4Var = this.b;
                        h4Var.n.S(0, null);
                        bi0 bi0Var = h4Var.h;
                        bi0Var.S(0, null);
                        h4Var.f.setAnimation(bi0Var);
                        break;
                    case 1:
                        h4 h4Var2 = this.b;
                        ei0 ei0Var = h4Var2.f;
                        bi0 bi0Var2 = h4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i132 = 120;
                        if (nextInt < 32) {
                            i122 = 0;
                        } else {
                            i122 = zs.P3;
                            if (nextInt >= 64) {
                                i132 = 420;
                                if (nextInt >= 97) {
                                    i122 = 540;
                                    if (nextInt != 98) {
                                        i132 = 720;
                                    }
                                }
                            }
                            int i142 = i122;
                            i122 = i132;
                            i132 = i142;
                        }
                        bi0Var2.P(i132);
                        bi0Var2.S(i132 - 1, h4Var2.R);
                        ei0Var.setAnimation(bi0Var2);
                        bi0Var2.M(i122);
                        ei0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        h4 h4Var3 = this.b;
                        h4Var3.a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.a.c(0.0d);
                        h4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.f0 = -1;
        Paint paint = new Paint();
        this.I = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
        this.D = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        setClipChildren(false);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z10 = cd.X;
        addView(g9Var, w7.b6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
        d4 d4Var = new d4(this, context);
        this.y = d4Var;
        d4Var.setSize(org.telegram.messenger.i0.L(26.0f));
        d4Var.setProgressColor(-1);
        d4Var.setNoProgress(false);
        boolean z11 = cd.X;
        addView(d4Var, w7.b6.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 11.0f, 6.0f, z11 ? 11.0f : 0.0f, 0.0f));
        org.telegram.messenger.i0.Y3(d4Var, false, 1.0f, true, false);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.bh, null);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        u5Var.setDrawablePadding(org.telegram.messenger.i0.L(6.0f));
        u5Var.setGravity((cd.X ? 5 : 3) | 48);
        boolean z12 = cd.X;
        addView(u5Var, w7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 10.0f, z12 ? 67.0f : 54.0f, 0.0f));
        this.r = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), 9, u5Var, false);
        this.s = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), 9, u5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.c0 = drawable;
        org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.eh, null, PorterDuff.Mode.MULTIPLY);
        int i15 = 0;
        while (true) {
            org.telegram.ui.ActionBar.u5[] u5VarArr = this.d;
            if (i15 >= u5VarArr.length) {
                break;
            }
            u5VarArr[i15] = new e4(this, context, i15);
            this.d[i15].setTextSize(15);
            this.d[i15].setGravity((cd.X ? 5 : 3) | 48);
            if (i15 == 4) {
                this.d[i15].setBuildFullLayout(true);
                org.telegram.ui.ActionBar.a7.Y(this.d[i15], org.telegram.ui.ActionBar.t6.fh, null);
                View view = this.d[i15];
                boolean z13 = cd.X;
                addView(view, w7.b6.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 54.0f : 67.0f, 32.0f, z13 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i15 == 0) {
                    org.telegram.ui.ActionBar.a7.Y(this.d[i15], org.telegram.ui.ActionBar.t6.dh, null);
                    this.d[i15].k(cd.L0(2131748887, null));
                } else if (i15 == 1) {
                    org.telegram.ui.ActionBar.a7.Y(this.d[i15], org.telegram.ui.ActionBar.t6.eh, null);
                    this.d[i15].k(cd.L0(2131745291, null));
                    this.d[i15].setDrawablePadding(org.telegram.messenger.i0.L(2.0f));
                } else if (i15 == 2) {
                    org.telegram.ui.ActionBar.a7.Y(this.d[i15], org.telegram.ui.ActionBar.t6.gh, null);
                    this.d[i15].k(cd.L0(2131743383, null));
                } else if (i15 == 3) {
                    org.telegram.ui.ActionBar.a7.Y(this.d[i15], org.telegram.ui.ActionBar.t6.dh, null);
                    this.d[i15].k(cd.L0(2131742976, null));
                }
                View view2 = this.d[i15];
                boolean z14 = cd.X;
                addView(view2, w7.b6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 54.0f : 67.0f, 32.0f, z14 ? 67.0f : 54.0f, 0.0f));
            }
            i15++;
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var2;
        u5Var2.setMaxLines(3);
        u5Var2.setTextSize(15);
        org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.fh, null);
        u5Var2.setVisibility(8);
        addView(u5Var2, w7.b6.d(-1, 60.0f, (cd.X ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        bi0 bi0Var = new bi0(R.raw.voice_outlined2, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(32.0f), true, null);
        this.h = bi0Var;
        this.n = new bi0(R.raw.hand_1, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(32.0f), true, null);
        ei0 ei0Var = new ei0(context);
        this.f = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        ei0Var.setAnimation(bi0Var);
        y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, this.T, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(h02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        ei0Var.setBackground(h02);
        ei0Var.setImportantForAccessibility(2);
        addView(ei0Var, w7.b6.d(48, -1.0f, (cd.X ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        ei0Var.setOnClickListener(new a(this, i10));
        this.a = new g4(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0129, code lost:
    
        if (r9 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x012b, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x012d, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x013d, code lost:
    
        if (r9 == false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10, boolean z11) {
        int x02;
        int i10;
        int i11;
        boolean z12;
        boolean c10;
        boolean c11;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i12;
        float f7;
        float L;
        boolean P;
        int i13;
        int x03;
        if (this.E == null) {
            return;
        }
        char c12 = 1;
        boolean z13 = (c() && this.F.raise_hand_rating == 0) ? false : true;
        ei0 ei0Var = this.f;
        ei0Var.setEnabled(z13);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.F;
        boolean z14 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z11) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.F.lastSpeakTime;
            boolean z15 = uptimeMillis < 500;
            if (!this.a0 || !z15 || z14) {
                this.a0 = z15;
                boolean z16 = this.W;
                c4 c4Var = this.V;
                if (z16) {
                    org.telegram.messenger.i0.r(c4Var);
                    this.W = false;
                }
                if (this.a0) {
                    org.telegram.messenger.i0.h3(c4Var, 500 - uptimeMillis);
                    this.W = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.E.d.f(jj.C1(this.F.peer));
        if (groupCallParticipant2 != null) {
            this.F = groupCallParticipant2;
        }
        Object[] objArr = this.F.muted_by_you && !c();
        boolean z17 = !c() ? (!this.F.muted || (this.a0 && z14)) && !objArr == true : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.a0 && z14);
        if (z17) {
            boolean z18 = this.F.can_self_unmute;
        }
        boolean isEmpty = TextUtils.isEmpty(this.F.about);
        this.O = false;
        c4 c4Var2 = this.U;
        org.telegram.messenger.i0.r(c4Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.F;
        int i14 = 4;
        if ((groupCallParticipant3.muted && !this.a0) || objArr == true) {
            boolean z19 = groupCallParticipant3.can_self_unmute;
            if (!z19 || objArr == true) {
                boolean z20 = (z19 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z20) {
                    x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.dh, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = this.F.lastRaiseHandDate;
                    long j11 = elapsedRealtime2 - j10;
                    if (j10 == 0 || j11 > 5000) {
                        if (objArr == false) {
                        }
                        i11 = 2;
                    } else {
                        org.telegram.messenger.i0.h3(c4Var2, 5000 - j11);
                        i11 = 3;
                    }
                } else {
                    x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.gh, false);
                    if (objArr == false) {
                    }
                    i11 = 2;
                }
                int i15 = x03;
                z12 = z20;
                x02 = i15;
                c10 = c();
                org.telegram.ui.ActionBar.u5[] u5VarArr = this.d;
                if (!c10) {
                }
                c11 = c();
                org.telegram.ui.ActionBar.u5 u5Var = this.e;
                if (c11) {
                }
                animatorSet = this.d0;
                if (animatorSet == null) {
                }
                if (z10) {
                }
                animatorSet.cancel();
                this.d0 = null;
                if (z10) {
                }
                if (z10) {
                }
            } else {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, this.T, false);
                this.O = true;
                i10 = !isEmpty ? 4 : 0;
            }
        } else {
            if (this.a0 && z14) {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.eh, false);
                i11 = 1;
                z12 = false;
                c10 = c();
                org.telegram.ui.ActionBar.u5[] u5VarArr2 = this.d;
                if (!c10) {
                    org.telegram.ui.ActionBar.a7.Y(u5VarArr2[4], this.T, null);
                }
                c11 = c();
                org.telegram.ui.ActionBar.u5 u5Var2 = this.e;
                if (c11) {
                    if (isEmpty && !this.b0) {
                        if (this.G != null) {
                            u5VarArr2[4].k(cd.L0(2131744289, null));
                        } else {
                            u5VarArr2[4].k(cd.L0(2131744288, null));
                        }
                        org.telegram.ui.ActionBar.a7.Y(u5VarArr2[4], this.T, null);
                    } else if (isEmpty) {
                        if (this.G != null) {
                            u5VarArr2[4].k(cd.L0(2131744292, null));
                        } else {
                            u5VarArr2[4].k(cd.L0(2131744291, null));
                        }
                        org.telegram.ui.ActionBar.a7.Y(u5VarArr2[4], this.T, null);
                    } else if (this.b0) {
                        u5VarArr2[4].k(cd.L0(2131744168, null));
                        org.telegram.ui.ActionBar.a7.Y(u5VarArr2[4], org.telegram.ui.ActionBar.t6.dh, null);
                    } else {
                        u5VarArr2[4].k(cd.L0(2131744290, null));
                        org.telegram.ui.ActionBar.a7.Y(u5VarArr2[4], this.T, null);
                    }
                    if (isEmpty) {
                        u5Var2.l(u5VarArr2[i11].getText(), false);
                        this.f0 = i11;
                        u5Var2.setTag(R.id.theme_bind, null);
                        u5Var2.setTextColor(u5VarArr2[i11].getTextColor());
                    } else {
                        u5Var2.l(org.telegram.messenger.i0.M2(this.F.about), false);
                        this.f0 = -1;
                        org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.fh, null);
                    }
                } else if (isEmpty) {
                    u5VarArr2[4].k("");
                    u5Var2.l("", false);
                } else {
                    u5VarArr2[4].k(org.telegram.messenger.i0.M2(this.F.about));
                    u5Var2.l("", false);
                }
                animatorSet = this.d0;
                Object[] objArr2 = animatorSet == null && !(i11 == this.P && this.L == x02);
                if ((z10 || objArr2 != false) && animatorSet != null) {
                    animatorSet.cancel();
                    this.d0 = null;
                }
                if (z10 || this.L != x02 || objArr2 != false) {
                    if (z10) {
                        arrayList = new ArrayList();
                        int i16 = this.L;
                        this.L = x02;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new jg.a0(this, i16, x02, c12 == true ? 1 : 0));
                        arrayList.add(ofFloat);
                        if (i11 != 1) {
                            int H = org.telegram.messenger.w3.H(this.F);
                            int i17 = H / 100;
                            if (i17 != 100) {
                                i12 = 0;
                                u5VarArr2[1].setLeftDrawable(this.c0);
                                org.telegram.ui.ActionBar.u5 u5Var3 = u5VarArr2[1];
                                if (H < 100) {
                                    i17 = 1;
                                }
                                u5Var3.k(cd.a0("SpeakingWithVolume", null, 2131745290, Integer.valueOf(i17)));
                            } else {
                                i12 = 0;
                                u5VarArr2[1].setLeftDrawable((Drawable) null);
                                u5VarArr2[1].k(cd.L0(2131745291, null));
                            }
                        } else {
                            i12 = 0;
                        }
                        if (!c()) {
                            b(4);
                        } else if (!z10 || i11 != this.P || objArr2 != false) {
                            if (z10) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Property property = View.ALPHA;
                                Property property2 = View.TRANSLATION_Y;
                                if (i11 == 0) {
                                    int i18 = i12;
                                    while (i18 < u5VarArr2.length) {
                                        org.telegram.ui.ActionBar.u5 u5Var4 = u5VarArr2[i18];
                                        float[] fArr = new float[1];
                                        fArr[i12] = i18 == i11 ? 0.0f : org.telegram.messenger.i0.L(-2.0f);
                                        arrayList.add(ObjectAnimator.ofFloat(u5Var4, (Property<org.telegram.ui.ActionBar.u5, Float>) property2, fArr));
                                        org.telegram.ui.ActionBar.u5 u5Var5 = u5VarArr2[i18];
                                        float[] fArr2 = new float[1];
                                        fArr2[i12] = i18 == i11 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(u5Var5, (Property<org.telegram.ui.ActionBar.u5, Float>) property, fArr2));
                                        i18++;
                                    }
                                    f7 = 0.0f;
                                } else {
                                    f7 = 0.0f;
                                    int i19 = i12;
                                    while (i19 < u5VarArr2.length) {
                                        org.telegram.ui.ActionBar.u5 u5Var6 = u5VarArr2[i19];
                                        if (i19 == i11) {
                                            L = 0.0f;
                                        } else {
                                            L = org.telegram.messenger.i0.L(i19 == 0 ? 2.0f : -2.0f);
                                        }
                                        float[] fArr3 = new float[1];
                                        fArr3[i12] = L;
                                        arrayList.add(ObjectAnimator.ofFloat(u5Var6, (Property<org.telegram.ui.ActionBar.u5, Float>) property2, fArr3));
                                        org.telegram.ui.ActionBar.u5 u5Var7 = u5VarArr2[i19];
                                        float[] fArr4 = new float[1];
                                        fArr4[i12] = i19 == i11 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(u5Var7, (Property<org.telegram.ui.ActionBar.u5, Float>) property, fArr4));
                                        i19++;
                                    }
                                }
                            } else {
                                f7 = 0.0f;
                                b(i11);
                            }
                            this.P = i11;
                            g4 g4Var = this.a;
                            g4Var.i = i11;
                            if (!z10) {
                                g4Var.j = i11 != 1 ? 1.0f : f7;
                            }
                            if (arrayList != null) {
                                AnimatorSet animatorSet2 = this.d0;
                                if (animatorSet2 != null) {
                                    animatorSet2.cancel();
                                    this.d0 = null;
                                }
                                AnimatorSet animatorSet3 = new AnimatorSet();
                                this.d0 = animatorSet3;
                                animatorSet3.addListener(new bi.d5(this, i11, i14));
                                this.d0.playTogether(arrayList);
                                this.d0.setDuration(180L);
                                this.d0.start();
                            }
                            if (!z10 && this.J == z17 && this.K == z12) {
                                i13 = i12;
                            } else {
                                bi0 bi0Var = this.h;
                                if (z12) {
                                    P = bi0Var.P(84);
                                    if (z10) {
                                        bi0Var.S(83, this.S);
                                    } else {
                                        bi0Var.S(i12, null);
                                    }
                                } else {
                                    ei0Var.setAnimation(bi0Var);
                                    bi0Var.S(i12, null);
                                    if (z17 && this.K) {
                                        P = bi0Var.P(21);
                                    } else {
                                        P = bi0Var.P(z17 ? 64 : 42);
                                    }
                                }
                                if (z10) {
                                    if (P) {
                                        if (i11 == 3) {
                                            bi0Var.M(63);
                                        } else if (z17 && this.K && !z12) {
                                            bi0Var.M(0);
                                        } else if (z17) {
                                            bi0Var.M(43);
                                        } else {
                                            bi0Var.M(21);
                                        }
                                    }
                                    ei0Var.d();
                                    i13 = 0;
                                } else {
                                    i13 = 0;
                                    bi0Var.N(bi0Var.f - 1, false, true);
                                    ei0Var.invalidate();
                                }
                                this.J = z17;
                                this.K = z12;
                            }
                            if (!this.a0) {
                                g4Var.c(0.0d);
                            }
                            g4Var.e(this, (this.a0 || this.e0 != f7) ? i13 : 1);
                            return;
                        }
                        f7 = 0.0f;
                        g4 g4Var2 = this.a;
                        g4Var2.i = i11;
                        if (!z10) {
                        }
                        if (arrayList != null) {
                        }
                        if (!z10) {
                        }
                        bi0 bi0Var2 = this.h;
                        if (z12) {
                        }
                        if (z10) {
                        }
                        this.J = z17;
                        this.K = z12;
                        if (!this.a0) {
                        }
                        g4Var2.e(this, (this.a0 || this.e0 != f7) ? i13 : 1);
                        return;
                    }
                    this.L = x02;
                    ei0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                    org.telegram.ui.ActionBar.t6.H1(ei0Var.getDrawable(), x02 & 620756991, true);
                }
                arrayList = null;
                if (i11 != 1) {
                }
                if (!c()) {
                }
                f7 = 0.0f;
                g4 g4Var22 = this.a;
                g4Var22.i = i11;
                if (!z10) {
                }
                if (arrayList != null) {
                }
                if (!z10) {
                }
                bi0 bi0Var22 = this.h;
                if (z12) {
                }
                if (z10) {
                }
                this.J = z17;
                this.K = z12;
                if (!this.a0) {
                }
                g4Var22.e(this, (this.a0 || this.e0 != f7) ? i13 : 1);
                return;
            }
            x02 = org.telegram.ui.ActionBar.t6.x0(null, this.T, false);
            i10 = !isEmpty ? 4 : 0;
            this.O = true;
        }
        i11 = i10;
        z12 = false;
        c10 = c();
        org.telegram.ui.ActionBar.u5[] u5VarArr22 = this.d;
        if (!c10) {
        }
        c11 = c();
        org.telegram.ui.ActionBar.u5 u5Var22 = this.e;
        if (c11) {
        }
        animatorSet = this.d0;
        if (animatorSet == null) {
        }
        if (z10) {
        }
        animatorSet.cancel();
        this.d0 = null;
        if (z10) {
        }
        if (z10) {
        }
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.u5[] u5VarArr;
        float L;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            u5VarArr = this.d;
            if (i12 >= u5VarArr.length) {
                break;
            }
            u5VarArr[i12].setImportantForAccessibility(i12 == i10 ? 1 : 2);
            i12++;
        }
        if (i10 == 0) {
            while (i11 < u5VarArr.length) {
                u5VarArr[i11].setTranslationY(i11 == i10 ? 0.0f : org.telegram.messenger.i0.L(-2.0f));
                u5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
                i11++;
            }
            return;
        }
        while (i11 < u5VarArr.length) {
            org.telegram.ui.ActionBar.u5 u5Var = u5VarArr[i11];
            if (i11 == i10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(i11 == 0 ? 2.0f : -2.0f);
            }
            u5Var.setTranslationY(L);
            u5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
            i11++;
        }
    }

    public final boolean c() {
        long j10 = this.Q;
        if (j10 > 0) {
            TLRPC.User user = this.G;
            return user != null && user.id == j10;
        }
        TLRPC.Chat chat = this.H;
        return chat != null && chat.id == (-j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.N) {
            Paint paint = this.I;
            int alpha = paint.getAlpha();
            float f7 = this.e0;
            if (f7 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f7) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            float L = cd.X ? 0.0f : org.telegram.messenger.i0.L(68.0f);
            canvas2 = canvas;
            canvas2.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(68.0f) : 0), getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.g9 g9Var = this.b;
        int measuredWidth = (g9Var.getMeasuredWidth() / 2) + g9Var.getLeft();
        int measuredHeight = (g9Var.getMeasuredHeight() / 2) + g9Var.getTop();
        g4 g4Var = this.a;
        g4Var.f();
        if (this.e0 == 0.0f) {
            g4Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        g9Var.setScaleX(g4Var.b());
        g9Var.setScaleY(g4Var.b());
        float b10 = g4Var.b();
        d4 d4Var = this.y;
        d4Var.setScaleX(b10);
        d4Var.setScaleY(g4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(org.telegram.messenger.c cVar, TLRPC.GroupCallParticipant groupCallParticipant, org.telegram.messenger.u3 u3Var, long j10, TLRPC.FileLocation fileLocation, boolean z10) {
        long j11;
        long c10;
        this.E = u3Var;
        this.M = cVar;
        this.Q = j10;
        this.F = groupCallParticipant;
        long C1 = jj.C1(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        org.telegram.ui.Components.g9 g9Var = this.b;
        org.telegram.ui.Components.r8 r8Var = this.D;
        org.telegram.ui.Components.d5 d5Var = this.s;
        if (C1 > 0) {
            TLRPC.User Z1 = vp.r1(this.M.a).Z1(Long.valueOf(C1));
            this.G = Z1;
            this.H = null;
            int i10 = this.M.a;
            r8Var.r(Z1);
            u5Var.l(h20.p(this.G), false);
            c10 = org.telegram.messenger.o5.c(this.G);
            TLRPC.User user = this.G;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.w;
                if (drawable == null) {
                    drawable = new jg.x0(getContext());
                }
                this.w = drawable;
                d5Var.g(drawable, z10);
            } else if (user == null || org.telegram.messenger.o5.f(user.emoji_status) == 0) {
                TLRPC.User user2 = this.G;
                if (user2 == null || !user2.premium) {
                    d5Var.g(null, z10);
                } else {
                    if (this.x == null) {
                        this.x = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.x = new f4(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.x);
                    }
                    d5Var.g(this.x, z10);
                }
            } else {
                d5Var.j(org.telegram.messenger.o5.f(this.G.emoji_status), z10);
            }
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false)));
            u5Var.i(d5Var);
            ImageReceiver imageReceiver = g9Var.getImageReceiver();
            int i11 = cVar.a;
            imageReceiver.d = i11;
            if (fileLocation != null) {
                this.b0 = true;
                g9Var.j(ic.e(fileLocation), "50_50", r8Var, null);
            } else {
                ic l4 = ic.l(i11, 1, this.G);
                this.b0 = l4 != null;
                g9Var.j(l4, "50_50", r8Var, this.G);
            }
        } else {
            j11 = 0;
            TLRPC.Chat L0 = vp.r1(this.M.a).L0(Long.valueOf(-C1));
            this.H = L0;
            this.G = null;
            int i12 = this.M.a;
            r8Var.q(L0);
            c10 = org.telegram.messenger.o5.c(this.H);
            TLRPC.Chat chat = this.H;
            if (chat != null) {
                u5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.H;
                if (chat2.verified) {
                    Drawable drawable2 = this.w;
                    if (drawable2 == null) {
                        drawable2 = new jg.x0(getContext());
                    }
                    this.w = drawable2;
                    d5Var.g(drawable2, z10);
                } else if (org.telegram.messenger.o5.f(chat2.emoji_status) != 0) {
                    d5Var.j(org.telegram.messenger.o5.f(this.H.emoji_status), z10);
                } else {
                    d5Var.g(null, z10);
                }
                g9Var.getImageReceiver().d = cVar.a;
                if (fileLocation != null) {
                    this.b0 = true;
                    g9Var.j(ic.e(fileLocation), "50_50", r8Var, null);
                } else {
                    ic a2 = ic.a(1, this.H);
                    this.b0 = a2 != null;
                    g9Var.j(a2, "50_50", r8Var, this.H);
                }
            }
        }
        org.telegram.ui.Components.d5 d5Var2 = this.r;
        if (c10 != j11) {
            d5Var2.j(c10, z10);
            u5Var.setLeftDrawable(d5Var2);
            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false)));
        } else {
            d5Var2.g(null, z10);
            u5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i10, int i11) {
        if (this.T != i10) {
            if (this.O) {
                this.L = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            }
            this.T = i10;
        }
        if (this.O) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            ei0 ei0Var = this.f;
            ei0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.t6.H1(ei0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.g9 getAvatarImageView() {
        return this.b;
    }

    public g4 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        if (TextUtils.isEmpty(u5Var.getText()) || !this.b0) {
            u5Var = this.d[4];
        }
        if (u5Var.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return org.telegram.messenger.i0.L(8.0f) + u5Var.getTop() + u5Var.getTextHeight();
    }

    public CharSequence getName() {
        return this.c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.F;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.F;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return jj.C1(groupCallParticipant.peer);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.d5 d5Var = this.s;
        if (d5Var != null) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.r;
        if (d5Var2 != null) {
            d5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.W) {
            org.telegram.messenger.i0.r(this.V);
            this.W = false;
        }
        AnimatorSet animatorSet = this.d0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.d5 d5Var = this.s;
        if (d5Var != null) {
            d5Var.b();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.r;
        if (d5Var2 != null) {
            d5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.F;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, cd.L0((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? 2131743319 : 2131743256, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.u5[] u5VarArr = this.d;
        if (z10) {
            u5VarArr[4].setTranslationY(0.0f);
        } else {
            u5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        g4 g4Var = this.a;
        if (d <= 1.5d) {
            g4Var.c(0.0d);
            return;
        }
        boolean z10 = this.W;
        c4 c4Var = this.V;
        if (z10) {
            org.telegram.messenger.i0.r(c4Var);
        }
        if (!this.a0) {
            this.a0 = true;
            a(true, false);
        }
        g4Var.c(d);
        org.telegram.messenger.i0.h3(c4Var, 500L);
        this.W = true;
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.g9 g9Var = this.b;
        if (g9Var.getImageReceiver().Q0 != z10) {
            g9Var.getImageReceiver().O0(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f7) {
        this.e0 = f7;
        this.c.setTranslationX((cd.X ? org.telegram.messenger.i0.L(53.0f) : -org.telegram.messenger.i0.L(53.0f)) * f7);
        boolean c10 = c();
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        org.telegram.ui.ActionBar.u5[] u5VarArr = this.d;
        if (!c10 || f7 <= 0.0f) {
            u5Var.setVisibility(8);
            for (int i10 = 0; i10 < u5VarArr.length; i10++) {
                if (TextUtils.isEmpty(u5VarArr[4].getText()) || u5VarArr[4].getLineCount() <= 1) {
                    u5VarArr[i10].setTranslationX((cd.X ? org.telegram.messenger.i0.L(53.0f) : -org.telegram.messenger.i0.L(53.0f)) * f7);
                    u5VarArr[i10].h(0, 0);
                } else {
                    u5VarArr[i10].h(org.telegram.messenger.i0.L(92.0f), cd.X ? org.telegram.messenger.i0.L(48.0f) : org.telegram.messenger.i0.L(53.0f));
                    u5VarArr[i10].setFullAlpha(f7);
                    u5VarArr[i10].setTranslationX(0.0f);
                    u5VarArr[i10].invalidate();
                }
            }
        } else {
            float f10 = 1.0f - f7;
            u5Var.setTranslationX((cd.X ? -org.telegram.messenger.i0.L(53.0f) : org.telegram.messenger.i0.L(53.0f)) * f10);
            u5Var.setVisibility(0);
            u5Var.setAlpha(f7);
            u5VarArr[4].setAlpha(f10);
            org.telegram.ui.ActionBar.u5 u5Var2 = u5VarArr[4];
            boolean z10 = cd.X;
            int L = org.telegram.messenger.i0.L(53.0f);
            if (!z10) {
                L = -L;
            }
            u5Var2.setTranslationX(L * f7);
        }
        this.b.setAlpha(f7 == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.a0 && f7 == 0.0f);
        float f11 = 1.0f - f7;
        ei0 ei0Var = this.f;
        ei0Var.setAlpha(f11);
        float f12 = (f11 * 0.4f) + 0.6f;
        ei0Var.setScaleX(f12);
        ei0Var.setScaleY(f12);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.u5 u5Var;
        org.telegram.ui.ActionBar.u5[] u5VarArr;
        org.telegram.ui.ActionBar.u5 u5Var2;
        try {
            this.I.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            int i10 = this.f0;
            if (i10 >= 0 && (u5Var = this.e) != null && (u5VarArr = this.d) != null && i10 < u5VarArr.length && (u5Var2 = u5VarArr[i10]) != null) {
                org.telegram.ui.ActionBar.a7.b0(u5Var2);
                u5Var.setTextColor(u5VarArr[this.f0].getTextColor());
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void d(h4 h4Var) {
    }
}

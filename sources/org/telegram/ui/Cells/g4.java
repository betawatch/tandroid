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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class g4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.b9 E;
    public org.telegram.messenger.t3 F;
    public TLRPC.GroupCallParticipant G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public final Paint J;
    public boolean K;
    public boolean L;
    public int M;
    public org.telegram.messenger.c N;
    public boolean O;
    public boolean P;
    public int Q;
    public long R;
    public final b4 S;
    public final b4 T;
    public int U;
    public final b4 V;
    public final b4 W;
    public final f4 a;
    public boolean a0;
    public final org.telegram.ui.Components.q9 b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.m5 c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.m5[] d;
    public final Drawable d0;
    public final org.telegram.ui.ActionBar.m5 e;
    public AnimatorSet e0;
    public final rh0 f;
    public float f0;
    public int g0;
    public final oh0 h;
    public final oh0 n;
    public final org.telegram.ui.Components.n5 r;
    public final org.telegram.ui.Components.n5 s;
    public Drawable w;
    public Drawable x;
    public final c4 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Cells.b4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Cells.b4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.ui.Cells.b4] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.ui.Cells.b4] */
    public g4(Context context) {
        super(context);
        int i7 = 5;
        this.d = new org.telegram.ui.ActionBar.m5[5];
        final int i10 = 0;
        this.S = new Runnable(this) { // from class: org.telegram.ui.Cells.b4
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                switch (i10) {
                    case 0:
                        g4 g4Var = this.b;
                        g4Var.n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f.setAnimation(oh0Var);
                        break;
                    case 1:
                        g4 g4Var2 = this.b;
                        rh0 rh0Var = g4Var2.f;
                        oh0 oh0Var2 = g4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i11 = 0;
                        } else {
                            i11 = ls.P3;
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
                        oh0Var2.P(i12);
                        oh0Var2.S(i12 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i11);
                        rh0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        g4 g4Var3 = this.b;
                        g4Var3.b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.a.c(0.0d);
                        g4Var3.a0 = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.T = new Runnable(this) { // from class: org.telegram.ui.Cells.b4
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i11) {
                    case 0:
                        g4 g4Var = this.b;
                        g4Var.n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f.setAnimation(oh0Var);
                        break;
                    case 1:
                        g4 g4Var2 = this.b;
                        rh0 rh0Var = g4Var2.f;
                        oh0 oh0Var2 = g4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = ls.P3;
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
                        oh0Var2.P(i12);
                        oh0Var2.S(i12 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i112);
                        rh0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        g4 g4Var3 = this.b;
                        g4Var3.b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.a.c(0.0d);
                        g4Var3.a0 = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.U = org.telegram.ui.ActionBar.m6.ih;
        final int i12 = 2;
        this.V = new Runnable(this) { // from class: org.telegram.ui.Cells.b4
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i12) {
                    case 0:
                        g4 g4Var = this.b;
                        g4Var.n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f.setAnimation(oh0Var);
                        break;
                    case 1:
                        g4 g4Var2 = this.b;
                        rh0 rh0Var = g4Var2.f;
                        oh0 oh0Var2 = g4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = ls.P3;
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
                        oh0Var2.P(i122);
                        oh0Var2.S(i122 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i112);
                        rh0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        g4 g4Var3 = this.b;
                        g4Var3.b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.a.c(0.0d);
                        g4Var3.a0 = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.W = new Runnable(this) { // from class: org.telegram.ui.Cells.b4
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (r2) {
                    case 0:
                        g4 g4Var = this.b;
                        g4Var.n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f.setAnimation(oh0Var);
                        break;
                    case 1:
                        g4 g4Var2 = this.b;
                        rh0 rh0Var = g4Var2.f;
                        oh0 oh0Var2 = g4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = ls.P3;
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
                        oh0Var2.P(i122);
                        oh0Var2.S(i122 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i112);
                        rh0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        g4 g4Var3 = this.b;
                        g4Var3.b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.a.c(0.0d);
                        g4Var3.a0 = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i13 = 4;
        new Runnable(this) { // from class: org.telegram.ui.Cells.b4
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i13) {
                    case 0:
                        g4 g4Var = this.b;
                        g4Var.n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f.setAnimation(oh0Var);
                        break;
                    case 1:
                        g4 g4Var2 = this.b;
                        rh0 rh0Var = g4Var2.f;
                        oh0 oh0Var2 = g4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = ls.P3;
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
                        oh0Var2.P(i122);
                        oh0Var2.S(i122 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i112);
                        rh0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        g4 g4Var3 = this.b;
                        g4Var3.b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.a.c(0.0d);
                        g4Var3.a0 = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
        this.E = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        setClipChildren(false);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = hd.a0;
        addView(q9Var, c8.ma.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
        c4 c4Var = new c4(this, context);
        this.y = c4Var;
        c4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        c4Var.setProgressColor(-1);
        c4Var.setNoProgress(false);
        boolean z11 = hd.a0;
        addView(c4Var, c8.ma.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 11.0f, 6.0f, z11 ? 11.0f : 0.0f, 0.0f));
        org.telegram.messenger.g0.X3(c4Var, false, 1.0f, true, false);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.eh, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        m5Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z12 = hd.a0;
        addView(m5Var, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 10.0f, z12 ? 67.0f : 54.0f, 0.0f));
        this.r = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), 9, m5Var, false);
        this.s = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), 9, m5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.d0 = drawable;
        org.telegram.ui.ActionBar.t6.x(this, drawable, org.telegram.ui.ActionBar.m6.hh, null, PorterDuff.Mode.MULTIPLY);
        int i14 = 0;
        while (true) {
            org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
            if (i14 >= m5VarArr.length) {
                break;
            }
            m5VarArr[i14] = new d4(this, context, i14);
            this.d[i14].setTextSize(15);
            this.d[i14].setGravity((hd.a0 ? 5 : 3) | 48);
            if (i14 == 4) {
                this.d[i14].setBuildFullLayout(true);
                org.telegram.ui.ActionBar.t6.X(this.d[i14], org.telegram.ui.ActionBar.m6.ih, null);
                View view = this.d[i14];
                boolean z13 = hd.a0;
                addView(view, c8.ma.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 54.0f : 67.0f, 32.0f, z13 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i14 == 0) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i14], org.telegram.ui.ActionBar.m6.gh, null);
                    this.d[i14].k(hd.N0(2131748684, null));
                } else if (i14 == 1) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i14], org.telegram.ui.ActionBar.m6.hh, null);
                    this.d[i14].k(hd.N0(2131745077, null));
                    this.d[i14].setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
                } else if (i14 == 2) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i14], org.telegram.ui.ActionBar.m6.jh, null);
                    this.d[i14].k(hd.N0(2131743112, null));
                } else if (i14 == 3) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i14], org.telegram.ui.ActionBar.m6.gh, null);
                    this.d[i14].k(hd.N0(2131742684, null));
                }
                View view2 = this.d[i14];
                boolean z14 = hd.a0;
                addView(view2, c8.ma.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 54.0f : 67.0f, 32.0f, z14 ? 67.0f : 54.0f, 0.0f));
            }
            i14++;
        }
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.e = m5Var2;
        m5Var2.setMaxLines(3);
        m5Var2.setTextSize(15);
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.ih, null);
        m5Var2.setVisibility(8);
        addView(m5Var2, c8.ma.d(-1, 60.0f, (hd.a0 ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        oh0 oh0Var = new oh0(R.raw.voice_outlined2, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        this.h = oh0Var;
        this.n = new oh0(R.raw.hand_1, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        rh0 rh0Var = new rh0(context);
        this.f = rh0Var;
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        rh0Var.setAnimation(oh0Var);
        y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(h02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        rh0Var.setBackground(h02);
        rh0Var.setImportantForAccessibility(2);
        addView(rh0Var, c8.ma.d(48, -1.0f, (hd.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        rh0Var.setOnClickListener(new a(this, i7));
        this.a = new f4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0129, code lost:
    
        if (r9 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x012b, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x012d, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x013d, code lost:
    
        if (r9 == false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10, boolean z11) {
        int x02;
        int i7;
        int i10;
        boolean z12;
        boolean c10;
        boolean c11;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i11;
        float L;
        boolean P;
        int i12;
        int x03;
        if (this.F == null) {
            return;
        }
        char c12 = 1;
        boolean z13 = (c() && this.G.raise_hand_rating == 0) ? false : true;
        rh0 rh0Var = this.f;
        rh0Var.setEnabled(z13);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        boolean z14 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z11) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.G.lastSpeakTime;
            boolean z15 = uptimeMillis < 500;
            if (!this.b0 || !z15 || z14) {
                this.b0 = z15;
                boolean z16 = this.a0;
                b4 b4Var = this.W;
                if (z16) {
                    org.telegram.messenger.g0.r(b4Var);
                    this.a0 = false;
                }
                if (this.b0) {
                    org.telegram.messenger.g0.h3(b4Var, 500 - uptimeMillis);
                    this.a0 = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.F.d.f(gj.B1(this.G.peer));
        if (groupCallParticipant2 != null) {
            this.G = groupCallParticipant2;
        }
        Object[] objArr = this.G.muted_by_you && !c();
        boolean z17 = !c() ? (!this.G.muted || (this.b0 && z14)) && !objArr == true : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.b0 && z14);
        if (z17) {
            boolean z18 = this.G.can_self_unmute;
        }
        boolean isEmpty = TextUtils.isEmpty(this.G.about);
        this.P = false;
        b4 b4Var2 = this.V;
        org.telegram.messenger.g0.r(b4Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.G;
        if ((groupCallParticipant3.muted && !this.b0) || objArr == true) {
            boolean z19 = groupCallParticipant3.can_self_unmute;
            if (!z19 || objArr == true) {
                boolean z20 = (z19 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z20) {
                    x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.gh, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j3 = this.G.lastRaiseHandDate;
                    long j10 = elapsedRealtime2 - j3;
                    if (j3 == 0 || j10 > 5000) {
                        if (objArr == false) {
                        }
                        i10 = 2;
                    } else {
                        org.telegram.messenger.g0.h3(b4Var2, 5000 - j10);
                        i10 = 3;
                    }
                } else {
                    x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.jh, false);
                    if (objArr == false) {
                    }
                    i10 = 2;
                }
                int i13 = x03;
                z12 = z20;
                x02 = i13;
                c10 = c();
                org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
                if (!c10) {
                }
                c11 = c();
                org.telegram.ui.ActionBar.m5 m5Var = this.e;
                if (c11) {
                }
                animatorSet = this.e0;
                if (animatorSet == null) {
                }
                if (z10) {
                }
                animatorSet.cancel();
                this.e0 = null;
                if (z10) {
                }
                if (z10) {
                }
            } else {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, this.U, false);
                this.P = true;
                i7 = !isEmpty ? 4 : 0;
            }
        } else {
            if (this.b0 && z14) {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hh, false);
                i10 = 1;
                z12 = false;
                c10 = c();
                org.telegram.ui.ActionBar.m5[] m5VarArr2 = this.d;
                if (!c10) {
                    org.telegram.ui.ActionBar.t6.X(m5VarArr2[4], this.U, null);
                }
                c11 = c();
                org.telegram.ui.ActionBar.m5 m5Var2 = this.e;
                if (c11) {
                    if (isEmpty && !this.c0) {
                        if (this.H != null) {
                            m5VarArr2[4].k(hd.N0(2131744020, null));
                        } else {
                            m5VarArr2[4].k(hd.N0(2131744019, null));
                        }
                        org.telegram.ui.ActionBar.t6.X(m5VarArr2[4], this.U, null);
                    } else if (isEmpty) {
                        if (this.H != null) {
                            m5VarArr2[4].k(hd.N0(2131744023, null));
                        } else {
                            m5VarArr2[4].k(hd.N0(2131744022, null));
                        }
                        org.telegram.ui.ActionBar.t6.X(m5VarArr2[4], this.U, null);
                    } else if (this.c0) {
                        m5VarArr2[4].k(hd.N0(2131743900, null));
                        org.telegram.ui.ActionBar.t6.X(m5VarArr2[4], org.telegram.ui.ActionBar.m6.gh, null);
                    } else {
                        m5VarArr2[4].k(hd.N0(2131744021, null));
                        org.telegram.ui.ActionBar.t6.X(m5VarArr2[4], this.U, null);
                    }
                    if (isEmpty) {
                        m5Var2.l(m5VarArr2[i10].getText(), false);
                        this.g0 = i10;
                        m5Var2.setTag(R.id.theme_bind, null);
                        m5Var2.setTextColor(m5VarArr2[i10].getTextColor());
                    } else {
                        m5Var2.l(org.telegram.messenger.g0.N2(this.G.about), false);
                        this.g0 = -1;
                        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.ih, null);
                    }
                } else if (isEmpty) {
                    m5VarArr2[4].k("");
                    m5Var2.l("", false);
                } else {
                    m5VarArr2[4].k(org.telegram.messenger.g0.N2(this.G.about));
                    m5Var2.l("", false);
                }
                animatorSet = this.e0;
                Object[] objArr2 = animatorSet == null && !(i10 == this.Q && this.M == x02);
                if ((z10 || objArr2 != false) && animatorSet != null) {
                    animatorSet.cancel();
                    this.e0 = null;
                }
                if (z10 || this.M != x02 || objArr2 != false) {
                    if (z10) {
                        arrayList = new ArrayList();
                        int i14 = this.M;
                        this.M = x02;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new hi.f4(this, i14, x02, c12 == true ? 1 : 0));
                        arrayList.add(ofFloat);
                        if (i10 != 1) {
                            int H = org.telegram.messenger.v3.H(this.G);
                            int i15 = H / 100;
                            if (i15 != 100) {
                                i11 = 0;
                                m5VarArr2[1].setLeftDrawable(this.d0);
                                org.telegram.ui.ActionBar.m5 m5Var3 = m5VarArr2[1];
                                if (H < 100) {
                                    i15 = 1;
                                }
                                m5Var3.k(hd.a0("SpeakingWithVolume", null, 2131745076, Integer.valueOf(i15)));
                            } else {
                                i11 = 0;
                                m5VarArr2[1].setLeftDrawable((Drawable) null);
                                m5VarArr2[1].k(hd.N0(2131745077, null));
                            }
                        } else {
                            i11 = 0;
                        }
                        if (!c()) {
                            b(4);
                        } else if (!z10 || i10 != this.Q || objArr2 != false) {
                            if (z10) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Property property = View.ALPHA;
                                float f10 = -2.0f;
                                Property property2 = View.TRANSLATION_Y;
                                if (i10 == 0) {
                                    int i16 = i11;
                                    while (i16 < m5VarArr2.length) {
                                        org.telegram.ui.ActionBar.m5 m5Var4 = m5VarArr2[i16];
                                        float L2 = i16 == i10 ? 0.0f : org.telegram.messenger.g0.L(f10);
                                        float[] fArr = new float[1];
                                        fArr[i11] = L2;
                                        arrayList.add(ObjectAnimator.ofFloat(m5Var4, (Property<org.telegram.ui.ActionBar.m5, Float>) property2, fArr));
                                        org.telegram.ui.ActionBar.m5 m5Var5 = m5VarArr2[i16];
                                        float[] fArr2 = new float[1];
                                        fArr2[i11] = i16 == i10 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(m5Var5, (Property<org.telegram.ui.ActionBar.m5, Float>) property, fArr2));
                                        i16++;
                                        f10 = -2.0f;
                                    }
                                } else {
                                    int i17 = i11;
                                    while (i17 < m5VarArr2.length) {
                                        org.telegram.ui.ActionBar.m5 m5Var6 = m5VarArr2[i17];
                                        if (i17 == i10) {
                                            L = 0.0f;
                                        } else {
                                            L = org.telegram.messenger.g0.L(i17 == 0 ? 2.0f : -2.0f);
                                        }
                                        float[] fArr3 = new float[1];
                                        fArr3[i11] = L;
                                        arrayList.add(ObjectAnimator.ofFloat(m5Var6, (Property<org.telegram.ui.ActionBar.m5, Float>) property2, fArr3));
                                        org.telegram.ui.ActionBar.m5 m5Var7 = m5VarArr2[i17];
                                        float[] fArr4 = new float[1];
                                        fArr4[i11] = i17 == i10 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(m5Var7, (Property<org.telegram.ui.ActionBar.m5, Float>) property, fArr4));
                                        i17++;
                                    }
                                }
                            } else {
                                b(i10);
                            }
                            this.Q = i10;
                        }
                        f4 f4Var = this.a;
                        f4Var.i = i10;
                        if (!z10) {
                            f4Var.j = i10 != 1 ? 1.0f : 0.0f;
                        }
                        if (arrayList != null) {
                            AnimatorSet animatorSet2 = this.e0;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                                this.e0 = null;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.e0 = animatorSet3;
                            animatorSet3.addListener(new ki.e2(this, i10, 6));
                            this.e0.playTogether(arrayList);
                            this.e0.setDuration(180L);
                            this.e0.start();
                        }
                        if (!z10 && this.K == z17 && this.L == z12) {
                            i12 = i11;
                        } else {
                            oh0 oh0Var = this.h;
                            if (z12) {
                                rh0Var.setAnimation(oh0Var);
                                oh0Var.S(i11, null);
                                if (z17 && this.L) {
                                    P = oh0Var.P(21);
                                } else {
                                    P = oh0Var.P(z17 ? 64 : 42);
                                }
                            } else {
                                P = oh0Var.P(84);
                                if (z10) {
                                    oh0Var.S(83, this.T);
                                } else {
                                    oh0Var.S(i11, null);
                                }
                            }
                            if (z10) {
                                i12 = 0;
                                oh0Var.N(oh0Var.f - 1, false, true);
                                rh0Var.invalidate();
                            } else {
                                if (P) {
                                    if (i10 == 3) {
                                        oh0Var.M(63);
                                    } else if (z17 && this.L && !z12) {
                                        oh0Var.M(0);
                                    } else if (z17) {
                                        oh0Var.M(43);
                                    } else {
                                        oh0Var.M(21);
                                    }
                                }
                                rh0Var.d();
                                i12 = 0;
                            }
                            this.K = z17;
                            this.L = z12;
                        }
                        if (!this.b0) {
                            f4Var.c(0.0d);
                        }
                        f4Var.e(this, (this.b0 || this.f0 != 0.0f) ? i12 : 1);
                        return;
                    }
                    this.M = x02;
                    rh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                    org.telegram.ui.ActionBar.m6.H1(rh0Var.getDrawable(), x02 & 620756991, true);
                }
                arrayList = null;
                if (i10 != 1) {
                }
                if (!c()) {
                }
                f4 f4Var2 = this.a;
                f4Var2.i = i10;
                if (!z10) {
                }
                if (arrayList != null) {
                }
                if (!z10) {
                }
                oh0 oh0Var2 = this.h;
                if (z12) {
                }
                if (z10) {
                }
                this.K = z17;
                this.L = z12;
                if (!this.b0) {
                }
                f4Var2.e(this, (this.b0 || this.f0 != 0.0f) ? i12 : 1);
                return;
            }
            x02 = org.telegram.ui.ActionBar.m6.x0(null, this.U, false);
            i7 = !isEmpty ? 4 : 0;
            this.P = true;
        }
        i10 = i7;
        z12 = false;
        c10 = c();
        org.telegram.ui.ActionBar.m5[] m5VarArr22 = this.d;
        if (!c10) {
        }
        c11 = c();
        org.telegram.ui.ActionBar.m5 m5Var22 = this.e;
        if (c11) {
        }
        animatorSet = this.e0;
        if (animatorSet == null) {
        }
        if (z10) {
        }
        animatorSet.cancel();
        this.e0 = null;
        if (z10) {
        }
        if (z10) {
        }
    }

    public final void b(int i7) {
        org.telegram.ui.ActionBar.m5[] m5VarArr;
        float L;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            m5VarArr = this.d;
            if (i11 >= m5VarArr.length) {
                break;
            }
            m5VarArr[i11].setImportantForAccessibility(i11 == i7 ? 1 : 2);
            i11++;
        }
        if (i7 == 0) {
            while (i10 < m5VarArr.length) {
                m5VarArr[i10].setTranslationY(i10 == i7 ? 0.0f : org.telegram.messenger.g0.L(-2.0f));
                m5VarArr[i10].setAlpha(i10 == i7 ? 1.0f : 0.0f);
                i10++;
            }
            return;
        }
        while (i10 < m5VarArr.length) {
            org.telegram.ui.ActionBar.m5 m5Var = m5VarArr[i10];
            if (i10 == i7) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(i10 == 0 ? 2.0f : -2.0f);
            }
            m5Var.setTranslationY(L);
            m5VarArr[i10].setAlpha(i10 == i7 ? 1.0f : 0.0f);
            i10++;
        }
    }

    public final boolean c() {
        long j3 = this.R;
        if (j3 > 0) {
            TLRPC.User user = this.H;
            return user != null && user.id == j3;
        }
        TLRPC.Chat chat = this.I;
        return chat != null && chat.id == (-j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.O) {
            Paint paint = this.J;
            int alpha = paint.getAlpha();
            float f10 = this.f0;
            if (f10 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f10) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            float L = hd.a0 ? 0.0f : org.telegram.messenger.g0.L(68.0f);
            canvas2 = canvas;
            canvas2.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(68.0f) : 0), getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.q9 q9Var = this.b;
        int measuredWidth = (q9Var.getMeasuredWidth() / 2) + q9Var.getLeft();
        int measuredHeight = (q9Var.getMeasuredHeight() / 2) + q9Var.getTop();
        f4 f4Var = this.a;
        f4Var.f();
        if (this.f0 == 0.0f) {
            f4Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        q9Var.setScaleX(f4Var.b());
        q9Var.setScaleY(f4Var.b());
        float b10 = f4Var.b();
        c4 c4Var = this.y;
        c4Var.setScaleX(b10);
        c4Var.setScaleY(f4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(org.telegram.messenger.c cVar, TLRPC.GroupCallParticipant groupCallParticipant, org.telegram.messenger.t3 t3Var, long j3, TLRPC.FileLocation fileLocation, boolean z10) {
        long j10;
        long c10;
        this.F = t3Var;
        this.N = cVar;
        this.R = j3;
        this.G = groupCallParticipant;
        long B1 = gj.B1(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.m5 m5Var = this.c;
        org.telegram.ui.Components.q9 q9Var = this.b;
        org.telegram.ui.Components.b9 b9Var = this.E;
        org.telegram.ui.Components.n5 n5Var = this.s;
        if (B1 > 0) {
            TLRPC.User c22 = np.u1(this.N.a).c2(Long.valueOf(B1));
            this.H = c22;
            this.I = null;
            int i7 = this.N.a;
            b9Var.r(c22);
            m5Var.l(p10.q(this.H), false);
            c10 = org.telegram.messenger.n5.c(this.H);
            TLRPC.User user = this.H;
            j10 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.w;
                if (drawable == null) {
                    drawable = new hi.k3(getContext());
                }
                this.w = drawable;
                n5Var.g(drawable, z10);
            } else if (user == null || org.telegram.messenger.n5.f(user.emoji_status) == 0) {
                TLRPC.User user2 = this.H;
                if (user2 == null || !user2.premium) {
                    n5Var.g(null, z10);
                } else {
                    if (this.x == null) {
                        this.x = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.x = new e4(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.x);
                    }
                    n5Var.g(this.x, z10);
                }
            } else {
                n5Var.j(org.telegram.messenger.n5.f(this.H.emoji_status), z10);
            }
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ck, false)));
            m5Var.i(n5Var);
            ImageReceiver imageReceiver = q9Var.getImageReceiver();
            int i10 = cVar.a;
            imageReceiver.d = i10;
            if (fileLocation != null) {
                this.c0 = true;
                q9Var.j(gc.e(fileLocation), "50_50", b9Var, null);
            } else {
                gc l10 = gc.l(i10, 1, this.H);
                this.c0 = l10 != null;
                q9Var.j(l10, "50_50", b9Var, this.H);
            }
        } else {
            j10 = 0;
            TLRPC.Chat O0 = np.u1(this.N.a).O0(Long.valueOf(-B1));
            this.I = O0;
            this.H = null;
            int i11 = this.N.a;
            b9Var.q(O0);
            c10 = org.telegram.messenger.n5.c(this.I);
            TLRPC.Chat chat = this.I;
            if (chat != null) {
                m5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.I;
                if (chat2.verified) {
                    Drawable drawable2 = this.w;
                    if (drawable2 == null) {
                        drawable2 = new hi.k3(getContext());
                    }
                    this.w = drawable2;
                    n5Var.g(drawable2, z10);
                } else if (org.telegram.messenger.n5.f(chat2.emoji_status) != 0) {
                    n5Var.j(org.telegram.messenger.n5.f(this.I.emoji_status), z10);
                } else {
                    n5Var.g(null, z10);
                }
                q9Var.getImageReceiver().d = cVar.a;
                if (fileLocation != null) {
                    this.c0 = true;
                    q9Var.j(gc.e(fileLocation), "50_50", b9Var, null);
                } else {
                    gc a10 = gc.a(1, this.I);
                    this.c0 = a10 != null;
                    q9Var.j(a10, "50_50", b9Var, this.I);
                }
            }
        }
        org.telegram.ui.Components.n5 n5Var2 = this.r;
        if (c10 != j10) {
            n5Var2.j(c10, z10);
            m5Var.setLeftDrawable(n5Var2);
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ck, false)));
        } else {
            n5Var2.g(null, z10);
            m5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i7, int i10) {
        if (this.U != i7) {
            if (this.P) {
                this.M = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            }
            this.U = i7;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            rh0 rh0Var = this.f;
            rh0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.m6.H1(rh0Var.getDrawable(), i10 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.q9 getAvatarImageView() {
        return this.b;
    }

    public f4 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.m5 m5Var = this.e;
        if (TextUtils.isEmpty(m5Var.getText()) || !this.c0) {
            m5Var = this.d[4];
        }
        if (m5Var.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return org.telegram.messenger.g0.L(8.0f) + m5Var.getTop() + m5Var.getTextHeight();
    }

    public CharSequence getName() {
        return this.c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.G;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return gj.B1(groupCallParticipant.peer);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.n5 n5Var = this.s;
        if (n5Var != null) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.r;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a0) {
            org.telegram.messenger.g0.r(this.W);
            this.a0 = false;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.n5 n5Var = this.s;
        if (n5Var != null) {
            n5Var.b();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.r;
        if (n5Var2 != null) {
            n5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hd.N0((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? 2131743048 : 2131742985, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
        if (z10) {
            m5VarArr[4].setTranslationY(0.0f);
        } else {
            m5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        f4 f4Var = this.a;
        if (d <= 1.5d) {
            f4Var.c(0.0d);
            return;
        }
        boolean z10 = this.a0;
        b4 b4Var = this.W;
        if (z10) {
            org.telegram.messenger.g0.r(b4Var);
        }
        if (!this.b0) {
            this.b0 = true;
            a(true, false);
        }
        f4Var.c(d);
        org.telegram.messenger.g0.h3(b4Var, 500L);
        this.a0 = true;
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.q9 q9Var = this.b;
        if (q9Var.getImageReceiver().R0 != z10) {
            q9Var.getImageReceiver().O0(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        this.f0 = f10;
        this.c.setTranslationX((hd.a0 ? org.telegram.messenger.g0.L(53.0f) : -org.telegram.messenger.g0.L(53.0f)) * f10);
        boolean c10 = c();
        org.telegram.ui.ActionBar.m5 m5Var = this.e;
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
        if (!c10 || f10 <= 0.0f) {
            m5Var.setVisibility(8);
            for (int i7 = 0; i7 < m5VarArr.length; i7++) {
                if (TextUtils.isEmpty(m5VarArr[4].getText()) || m5VarArr[4].getLineCount() <= 1) {
                    m5VarArr[i7].setTranslationX((hd.a0 ? org.telegram.messenger.g0.L(53.0f) : -org.telegram.messenger.g0.L(53.0f)) * f10);
                    m5VarArr[i7].h(0, 0);
                } else {
                    m5VarArr[i7].h(org.telegram.messenger.g0.L(92.0f), hd.a0 ? org.telegram.messenger.g0.L(48.0f) : org.telegram.messenger.g0.L(53.0f));
                    m5VarArr[i7].setFullAlpha(f10);
                    m5VarArr[i7].setTranslationX(0.0f);
                    m5VarArr[i7].invalidate();
                }
            }
        } else {
            float f11 = 1.0f - f10;
            m5Var.setTranslationX((hd.a0 ? -org.telegram.messenger.g0.L(53.0f) : org.telegram.messenger.g0.L(53.0f)) * f11);
            m5Var.setVisibility(0);
            m5Var.setAlpha(f10);
            m5VarArr[4].setAlpha(f11);
            org.telegram.ui.ActionBar.m5 m5Var2 = m5VarArr[4];
            boolean z10 = hd.a0;
            int L = org.telegram.messenger.g0.L(53.0f);
            if (!z10) {
                L = -L;
            }
            m5Var2.setTranslationX(L * f10);
        }
        this.b.setAlpha(f10 == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.b0 && f10 == 0.0f);
        float f12 = 1.0f - f10;
        rh0 rh0Var = this.f;
        rh0Var.setAlpha(f12);
        float f13 = (f12 * 0.4f) + 0.6f;
        rh0Var.setScaleX(f13);
        rh0Var.setScaleY(f13);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.m5 m5Var;
        org.telegram.ui.ActionBar.m5[] m5VarArr;
        org.telegram.ui.ActionBar.m5 m5Var2;
        try {
            this.J.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
            int i7 = this.g0;
            if (i7 >= 0 && (m5Var = this.e) != null && (m5VarArr = this.d) != null && i7 < m5VarArr.length && (m5Var2 = m5VarArr[i7]) != null) {
                org.telegram.ui.ActionBar.t6.a0(m5Var2);
                m5Var.setTextColor(m5VarArr[this.g0].getTextColor());
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void d(g4 g4Var) {
    }
}

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
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class f4 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.w8 D;
    public org.telegram.messenger.r3 E;
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
    public final a4 R;
    public final a4 S;
    public int T;
    public final a4 U;
    public final a4 V;
    public boolean W;
    public final e4 a;
    public boolean a0;
    public final org.telegram.ui.Components.l9 b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.k5 c;
    public final Drawable c0;
    public final org.telegram.ui.ActionBar.k5[] d;
    public AnimatorSet d0;
    public final org.telegram.ui.ActionBar.k5 e;
    public float e0;
    public final ch0 f;
    public int f0;
    public final zg0 h;
    public final zg0 n;
    public final org.telegram.ui.Components.g5 r;
    public final org.telegram.ui.Components.g5 s;
    public Drawable w;
    public Drawable x;
    public final b4 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Cells.a4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Cells.a4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.ui.Cells.a4] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.ui.Cells.a4] */
    public f4(Context context) {
        super(context);
        int i7 = 5;
        this.d = new org.telegram.ui.ActionBar.k5[5];
        final int i10 = 0;
        this.R = new Runnable(this) { // from class: org.telegram.ui.Cells.a4
            public final /* synthetic */ f4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                switch (i10) {
                    case 0:
                        f4 f4Var = this.b;
                        f4Var.n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f.setAnimation(zg0Var);
                        break;
                    case 1:
                        f4 f4Var2 = this.b;
                        ch0 ch0Var = f4Var2.f;
                        zg0 zg0Var2 = f4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i11 = 0;
                        } else {
                            i11 = qs.P3;
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
                        zg0Var2.P(i12);
                        zg0Var2.S(i12 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i11);
                        ch0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        f4 f4Var3 = this.b;
                        f4Var3.a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.a.c(0.0d);
                        f4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.S = new Runnable(this) { // from class: org.telegram.ui.Cells.a4
            public final /* synthetic */ f4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i11) {
                    case 0:
                        f4 f4Var = this.b;
                        f4Var.n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f.setAnimation(zg0Var);
                        break;
                    case 1:
                        f4 f4Var2 = this.b;
                        ch0 ch0Var = f4Var2.f;
                        zg0 zg0Var2 = f4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = qs.P3;
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
                        zg0Var2.P(i12);
                        zg0Var2.S(i12 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i112);
                        ch0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        f4 f4Var3 = this.b;
                        f4Var3.a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.a.c(0.0d);
                        f4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.T = org.telegram.ui.ActionBar.k6.fh;
        final int i12 = 2;
        this.U = new Runnable(this) { // from class: org.telegram.ui.Cells.a4
            public final /* synthetic */ f4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i12) {
                    case 0:
                        f4 f4Var = this.b;
                        f4Var.n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f.setAnimation(zg0Var);
                        break;
                    case 1:
                        f4 f4Var2 = this.b;
                        ch0 ch0Var = f4Var2.f;
                        zg0 zg0Var2 = f4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = qs.P3;
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
                        zg0Var2.P(i122);
                        zg0Var2.S(i122 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i112);
                        ch0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        f4 f4Var3 = this.b;
                        f4Var3.a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.a.c(0.0d);
                        f4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.V = new Runnable(this) { // from class: org.telegram.ui.Cells.a4
            public final /* synthetic */ f4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.b;
                        f4Var.n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f.setAnimation(zg0Var);
                        break;
                    case 1:
                        f4 f4Var2 = this.b;
                        ch0 ch0Var = f4Var2.f;
                        zg0 zg0Var2 = f4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = qs.P3;
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
                        zg0Var2.P(i122);
                        zg0Var2.S(i122 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i112);
                        ch0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        f4 f4Var3 = this.b;
                        f4Var3.a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.a.c(0.0d);
                        f4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i13 = 4;
        new Runnable(this) { // from class: org.telegram.ui.Cells.a4
            public final /* synthetic */ f4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i13) {
                    case 0:
                        f4 f4Var = this.b;
                        f4Var.n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f.setAnimation(zg0Var);
                        break;
                    case 1:
                        f4 f4Var2 = this.b;
                        ch0 ch0Var = f4Var2.f;
                        zg0 zg0Var2 = f4Var2.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = qs.P3;
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
                        zg0Var2.P(i122);
                        zg0Var2.S(i122 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i112);
                        ch0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        f4 f4Var3 = this.b;
                        f4Var3.a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.a.c(0.0d);
                        f4Var3.W = false;
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
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
        this.D = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        setClipChildren(false);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z9 = hd.a0;
        addView(l9Var, c8.ha.d(46, 46.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 11.0f, 6.0f, z9 ? 11.0f : 0.0f, 0.0f));
        b4 b4Var = new b4(this, context);
        this.y = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        b4Var.setProgressColor(-1);
        b4Var.setNoProgress(false);
        boolean z10 = hd.a0;
        addView(b4Var, c8.ha.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
        org.telegram.messenger.g0.Z3(b4Var, false, 1.0f, true, false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.bh, null);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        k5Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z11 = hd.a0;
        addView(k5Var, c8.ha.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
        this.r = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), 9, k5Var, false);
        this.s = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), 9, k5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.c0 = drawable;
        org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.eh, null, PorterDuff.Mode.MULTIPLY);
        int i14 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
            if (i14 >= k5VarArr.length) {
                break;
            }
            k5VarArr[i14] = new c4(this, context, i14);
            this.d[i14].setTextSize(15);
            this.d[i14].setGravity((hd.a0 ? 5 : 3) | 48);
            if (i14 == 4) {
                this.d[i14].setBuildFullLayout(true);
                org.telegram.ui.ActionBar.r6.Y(this.d[i14], org.telegram.ui.ActionBar.k6.fh, null);
                View view = this.d[i14];
                boolean z12 = hd.a0;
                addView(view, c8.ha.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i14 == 0) {
                    org.telegram.ui.ActionBar.r6.Y(this.d[i14], org.telegram.ui.ActionBar.k6.dh, null);
                    this.d[i14].k(hd.M0(2131748876, null));
                } else if (i14 == 1) {
                    org.telegram.ui.ActionBar.r6.Y(this.d[i14], org.telegram.ui.ActionBar.k6.eh, null);
                    this.d[i14].k(hd.M0(2131745274, null));
                    this.d[i14].setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
                } else if (i14 == 2) {
                    org.telegram.ui.ActionBar.r6.Y(this.d[i14], org.telegram.ui.ActionBar.k6.gh, null);
                    this.d[i14].k(hd.M0(2131743358, null));
                } else if (i14 == 3) {
                    org.telegram.ui.ActionBar.r6.Y(this.d[i14], org.telegram.ui.ActionBar.k6.dh, null);
                    this.d[i14].k(hd.M0(2131742951, null));
                }
                View view2 = this.d[i14];
                boolean z13 = hd.a0;
                addView(view2, c8.ha.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 54.0f : 67.0f, 32.0f, z13 ? 67.0f : 54.0f, 0.0f));
            }
            i14++;
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var2;
        k5Var2.setMaxLines(3);
        k5Var2.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.fh, null);
        k5Var2.setVisibility(8);
        addView(k5Var2, c8.ha.d(-1, 60.0f, (hd.a0 ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        zg0 zg0Var = new zg0(R.raw.voice_outlined2, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        this.h = zg0Var;
        this.n = new zg0(R.raw.hand_1, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        ch0 ch0Var = new ch0(context);
        this.f = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var.setAnimation(zg0Var);
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, this.T, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(h02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        ch0Var.setBackground(h02);
        ch0Var.setImportantForAccessibility(2);
        addView(ch0Var, c8.ha.d(48, -1.0f, (hd.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        ch0Var.setOnClickListener(new a(this, i7));
        this.a = new e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
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
    public final void a(boolean z9, boolean z10) {
        int x02;
        int i7;
        int i10;
        boolean z11;
        boolean c10;
        boolean c11;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i11;
        float L;
        boolean P;
        int i12;
        int x03;
        if (this.E == null) {
            return;
        }
        char c12 = 1;
        boolean z12 = (c() && this.F.raise_hand_rating == 0) ? false : true;
        ch0 ch0Var = this.f;
        ch0Var.setEnabled(z12);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.F;
        boolean z13 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z10) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.F.lastSpeakTime;
            boolean z14 = uptimeMillis < 500;
            if (!this.a0 || !z14 || z13) {
                this.a0 = z14;
                boolean z15 = this.W;
                a4 a4Var = this.V;
                if (z15) {
                    org.telegram.messenger.g0.r(a4Var);
                    this.W = false;
                }
                if (this.a0) {
                    org.telegram.messenger.g0.i3(a4Var, 500 - uptimeMillis);
                    this.W = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.E.d.f(ij.C1(this.F.peer));
        if (groupCallParticipant2 != null) {
            this.F = groupCallParticipant2;
        }
        Object[] objArr = this.F.muted_by_you && !c();
        boolean z16 = !c() ? (!this.F.muted || (this.a0 && z13)) && !objArr == true : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.a0 && z13);
        if (z16) {
            boolean z17 = this.F.can_self_unmute;
        }
        boolean isEmpty = TextUtils.isEmpty(this.F.about);
        this.O = false;
        a4 a4Var2 = this.U;
        org.telegram.messenger.g0.r(a4Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.F;
        if ((groupCallParticipant3.muted && !this.a0) || objArr == true) {
            boolean z18 = groupCallParticipant3.can_self_unmute;
            if (!z18 || objArr == true) {
                boolean z19 = (z18 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z19) {
                    x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.dh, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j3 = this.F.lastRaiseHandDate;
                    long j10 = elapsedRealtime2 - j3;
                    if (j3 == 0 || j10 > 5000) {
                        if (objArr == false) {
                        }
                        i10 = 2;
                    } else {
                        org.telegram.messenger.g0.i3(a4Var2, 5000 - j10);
                        i10 = 3;
                    }
                } else {
                    x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.gh, false);
                    if (objArr == false) {
                    }
                    i10 = 2;
                }
                int i13 = x03;
                z11 = z19;
                x02 = i13;
                c10 = c();
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
                if (!c10) {
                }
                c11 = c();
                org.telegram.ui.ActionBar.k5 k5Var = this.e;
                if (c11) {
                }
                animatorSet = this.d0;
                if (animatorSet == null) {
                }
                if (z9) {
                }
                animatorSet.cancel();
                this.d0 = null;
                if (z9) {
                }
                if (z9) {
                }
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, this.T, false);
                this.O = true;
                i7 = !isEmpty ? 4 : 0;
            }
        } else {
            if (this.a0 && z13) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eh, false);
                i10 = 1;
                z11 = false;
                c10 = c();
                org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.d;
                if (!c10) {
                    org.telegram.ui.ActionBar.r6.Y(k5VarArr2[4], this.T, null);
                }
                c11 = c();
                org.telegram.ui.ActionBar.k5 k5Var2 = this.e;
                if (c11) {
                    if (isEmpty && !this.b0) {
                        if (this.G != null) {
                            k5VarArr2[4].k(hd.M0(2131744264, null));
                        } else {
                            k5VarArr2[4].k(hd.M0(2131744263, null));
                        }
                        org.telegram.ui.ActionBar.r6.Y(k5VarArr2[4], this.T, null);
                    } else if (isEmpty) {
                        if (this.G != null) {
                            k5VarArr2[4].k(hd.M0(2131744267, null));
                        } else {
                            k5VarArr2[4].k(hd.M0(2131744266, null));
                        }
                        org.telegram.ui.ActionBar.r6.Y(k5VarArr2[4], this.T, null);
                    } else if (this.b0) {
                        k5VarArr2[4].k(hd.M0(2131744144, null));
                        org.telegram.ui.ActionBar.r6.Y(k5VarArr2[4], org.telegram.ui.ActionBar.k6.dh, null);
                    } else {
                        k5VarArr2[4].k(hd.M0(2131744265, null));
                        org.telegram.ui.ActionBar.r6.Y(k5VarArr2[4], this.T, null);
                    }
                    if (isEmpty) {
                        k5Var2.l(k5VarArr2[i10].getText(), false);
                        this.f0 = i10;
                        k5Var2.setTag(R.id.theme_bind, null);
                        k5Var2.setTextColor(k5VarArr2[i10].getTextColor());
                    } else {
                        k5Var2.l(org.telegram.messenger.g0.N2(this.F.about), false);
                        this.f0 = -1;
                        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.fh, null);
                    }
                } else if (isEmpty) {
                    k5VarArr2[4].k("");
                    k5Var2.l("", false);
                } else {
                    k5VarArr2[4].k(org.telegram.messenger.g0.N2(this.F.about));
                    k5Var2.l("", false);
                }
                animatorSet = this.d0;
                Object[] objArr2 = animatorSet == null && !(i10 == this.P && this.L == x02);
                if ((z9 || objArr2 != false) && animatorSet != null) {
                    animatorSet.cancel();
                    this.d0 = null;
                }
                if (z9 || this.L != x02 || objArr2 != false) {
                    if (z9) {
                        arrayList = new ArrayList();
                        int i14 = this.L;
                        this.L = x02;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new fi.k4(this, i14, x02, c12 == true ? 1 : 0));
                        arrayList.add(ofFloat);
                        if (i10 != 1) {
                            int H = org.telegram.messenger.t3.H(this.F);
                            int i15 = H / 100;
                            if (i15 != 100) {
                                i11 = 0;
                                k5VarArr2[1].setLeftDrawable(this.c0);
                                org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr2[1];
                                if (H < 100) {
                                    i15 = 1;
                                }
                                k5Var3.k(hd.a0("SpeakingWithVolume", null, 2131745273, Integer.valueOf(i15)));
                            } else {
                                i11 = 0;
                                k5VarArr2[1].setLeftDrawable((Drawable) null);
                                k5VarArr2[1].k(hd.M0(2131745274, null));
                            }
                        } else {
                            i11 = 0;
                        }
                        if (!c()) {
                            b(4);
                        } else if (!z9 || i10 != this.P || objArr2 != false) {
                            if (z9) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Property property = View.ALPHA;
                                float f10 = -2.0f;
                                Property property2 = View.TRANSLATION_Y;
                                if (i10 == 0) {
                                    int i16 = i11;
                                    while (i16 < k5VarArr2.length) {
                                        org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr2[i16];
                                        float L2 = i16 == i10 ? 0.0f : org.telegram.messenger.g0.L(f10);
                                        float[] fArr = new float[1];
                                        fArr[i11] = L2;
                                        arrayList.add(ObjectAnimator.ofFloat(k5Var4, (Property<org.telegram.ui.ActionBar.k5, Float>) property2, fArr));
                                        org.telegram.ui.ActionBar.k5 k5Var5 = k5VarArr2[i16];
                                        float[] fArr2 = new float[1];
                                        fArr2[i11] = i16 == i10 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(k5Var5, (Property<org.telegram.ui.ActionBar.k5, Float>) property, fArr2));
                                        i16++;
                                        f10 = -2.0f;
                                    }
                                } else {
                                    int i17 = i11;
                                    while (i17 < k5VarArr2.length) {
                                        org.telegram.ui.ActionBar.k5 k5Var6 = k5VarArr2[i17];
                                        if (i17 == i10) {
                                            L = 0.0f;
                                        } else {
                                            L = org.telegram.messenger.g0.L(i17 == 0 ? 2.0f : -2.0f);
                                        }
                                        float[] fArr3 = new float[1];
                                        fArr3[i11] = L;
                                        arrayList.add(ObjectAnimator.ofFloat(k5Var6, (Property<org.telegram.ui.ActionBar.k5, Float>) property2, fArr3));
                                        org.telegram.ui.ActionBar.k5 k5Var7 = k5VarArr2[i17];
                                        float[] fArr4 = new float[1];
                                        fArr4[i11] = i17 == i10 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(k5Var7, (Property<org.telegram.ui.ActionBar.k5, Float>) property, fArr4));
                                        i17++;
                                    }
                                }
                            } else {
                                b(i10);
                            }
                            this.P = i10;
                        }
                        e4 e4Var = this.a;
                        e4Var.i = i10;
                        if (!z9) {
                            e4Var.j = i10 != 1 ? 1.0f : 0.0f;
                        }
                        if (arrayList != null) {
                            AnimatorSet animatorSet2 = this.d0;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                                this.d0 = null;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.d0 = animatorSet3;
                            animatorSet3.addListener(new hi.m2(this, i10, 6));
                            this.d0.playTogether(arrayList);
                            this.d0.setDuration(180L);
                            this.d0.start();
                        }
                        if (!z9 && this.J == z16 && this.K == z11) {
                            i12 = i11;
                        } else {
                            zg0 zg0Var = this.h;
                            if (z11) {
                                ch0Var.setAnimation(zg0Var);
                                zg0Var.S(i11, null);
                                if (z16 && this.K) {
                                    P = zg0Var.P(21);
                                } else {
                                    P = zg0Var.P(z16 ? 64 : 42);
                                }
                            } else {
                                P = zg0Var.P(84);
                                if (z9) {
                                    zg0Var.S(83, this.S);
                                } else {
                                    zg0Var.S(i11, null);
                                }
                            }
                            if (z9) {
                                i12 = 0;
                                zg0Var.N(zg0Var.f - 1, false, true);
                                ch0Var.invalidate();
                            } else {
                                if (P) {
                                    if (i10 == 3) {
                                        zg0Var.M(63);
                                    } else if (z16 && this.K && !z11) {
                                        zg0Var.M(0);
                                    } else if (z16) {
                                        zg0Var.M(43);
                                    } else {
                                        zg0Var.M(21);
                                    }
                                }
                                ch0Var.d();
                                i12 = 0;
                            }
                            this.J = z16;
                            this.K = z11;
                        }
                        if (!this.a0) {
                            e4Var.c(0.0d);
                        }
                        e4Var.e(this, (this.a0 || this.e0 != 0.0f) ? i12 : 1);
                        return;
                    }
                    this.L = x02;
                    ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                    org.telegram.ui.ActionBar.k6.H1(ch0Var.getDrawable(), x02 & 620756991, true);
                }
                arrayList = null;
                if (i10 != 1) {
                }
                if (!c()) {
                }
                e4 e4Var2 = this.a;
                e4Var2.i = i10;
                if (!z9) {
                }
                if (arrayList != null) {
                }
                if (!z9) {
                }
                zg0 zg0Var2 = this.h;
                if (z11) {
                }
                if (z9) {
                }
                this.J = z16;
                this.K = z11;
                if (!this.a0) {
                }
                e4Var2.e(this, (this.a0 || this.e0 != 0.0f) ? i12 : 1);
                return;
            }
            x02 = org.telegram.ui.ActionBar.k6.x0(null, this.T, false);
            i7 = !isEmpty ? 4 : 0;
            this.O = true;
        }
        i10 = i7;
        z11 = false;
        c10 = c();
        org.telegram.ui.ActionBar.k5[] k5VarArr22 = this.d;
        if (!c10) {
        }
        c11 = c();
        org.telegram.ui.ActionBar.k5 k5Var22 = this.e;
        if (c11) {
        }
        animatorSet = this.d0;
        if (animatorSet == null) {
        }
        if (z9) {
        }
        animatorSet.cancel();
        this.d0 = null;
        if (z9) {
        }
        if (z9) {
        }
    }

    public final void b(int i7) {
        org.telegram.ui.ActionBar.k5[] k5VarArr;
        float L;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            k5VarArr = this.d;
            if (i11 >= k5VarArr.length) {
                break;
            }
            k5VarArr[i11].setImportantForAccessibility(i11 == i7 ? 1 : 2);
            i11++;
        }
        if (i7 == 0) {
            while (i10 < k5VarArr.length) {
                k5VarArr[i10].setTranslationY(i10 == i7 ? 0.0f : org.telegram.messenger.g0.L(-2.0f));
                k5VarArr[i10].setAlpha(i10 == i7 ? 1.0f : 0.0f);
                i10++;
            }
            return;
        }
        while (i10 < k5VarArr.length) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i10];
            if (i10 == i7) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(i10 == 0 ? 2.0f : -2.0f);
            }
            k5Var.setTranslationY(L);
            k5VarArr[i10].setAlpha(i10 == i7 ? 1.0f : 0.0f);
            i10++;
        }
    }

    public final boolean c() {
        long j3 = this.Q;
        if (j3 > 0) {
            TLRPC.User user = this.G;
            return user != null && user.id == j3;
        }
        TLRPC.Chat chat = this.H;
        return chat != null && chat.id == (-j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.N) {
            Paint paint = this.I;
            int alpha = paint.getAlpha();
            float f10 = this.e0;
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
        org.telegram.ui.Components.l9 l9Var = this.b;
        int measuredWidth = (l9Var.getMeasuredWidth() / 2) + l9Var.getLeft();
        int measuredHeight = (l9Var.getMeasuredHeight() / 2) + l9Var.getTop();
        e4 e4Var = this.a;
        e4Var.f();
        if (this.e0 == 0.0f) {
            e4Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        l9Var.setScaleX(e4Var.b());
        l9Var.setScaleY(e4Var.b());
        float b10 = e4Var.b();
        b4 b4Var = this.y;
        b4Var.setScaleX(b10);
        b4Var.setScaleY(e4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(org.telegram.messenger.c cVar, TLRPC.GroupCallParticipant groupCallParticipant, org.telegram.messenger.r3 r3Var, long j3, TLRPC.FileLocation fileLocation, boolean z9) {
        long j10;
        long c10;
        this.E = r3Var;
        this.M = cVar;
        this.Q = j3;
        this.F = groupCallParticipant;
        long C1 = ij.C1(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        org.telegram.ui.Components.l9 l9Var = this.b;
        org.telegram.ui.Components.w8 w8Var = this.D;
        org.telegram.ui.Components.g5 g5Var = this.s;
        if (C1 > 0) {
            TLRPC.User a22 = qp.s1(this.M.a).a2(Long.valueOf(C1));
            this.G = a22;
            this.H = null;
            int i7 = this.M.a;
            w8Var.r(a22);
            k5Var.l(t10.p(this.G), false);
            c10 = org.telegram.messenger.m5.c(this.G);
            TLRPC.User user = this.G;
            j10 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.w;
                if (drawable == null) {
                    drawable = new fi.l3(getContext());
                }
                this.w = drawable;
                g5Var.g(drawable, z9);
            } else if (user == null || org.telegram.messenger.m5.f(user.emoji_status) == 0) {
                TLRPC.User user2 = this.G;
                if (user2 == null || !user2.premium) {
                    g5Var.g(null, z9);
                } else {
                    if (this.x == null) {
                        this.x = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.x = new d4(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.x);
                    }
                    g5Var.g(this.x, z9);
                }
            } else {
                g5Var.j(org.telegram.messenger.m5.f(this.G.emoji_status), z9);
            }
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false)));
            k5Var.i(g5Var);
            ImageReceiver imageReceiver = l9Var.getImageReceiver();
            int i10 = cVar.a;
            imageReceiver.d = i10;
            if (fileLocation != null) {
                this.b0 = true;
                l9Var.j(hc.e(fileLocation), "50_50", w8Var, null);
            } else {
                hc l10 = hc.l(i10, 1, this.G);
                this.b0 = l10 != null;
                l9Var.j(l10, "50_50", w8Var, this.G);
            }
        } else {
            j10 = 0;
            TLRPC.Chat M0 = qp.s1(this.M.a).M0(Long.valueOf(-C1));
            this.H = M0;
            this.G = null;
            int i11 = this.M.a;
            w8Var.q(M0);
            c10 = org.telegram.messenger.m5.c(this.H);
            TLRPC.Chat chat = this.H;
            if (chat != null) {
                k5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.H;
                if (chat2.verified) {
                    Drawable drawable2 = this.w;
                    if (drawable2 == null) {
                        drawable2 = new fi.l3(getContext());
                    }
                    this.w = drawable2;
                    g5Var.g(drawable2, z9);
                } else if (org.telegram.messenger.m5.f(chat2.emoji_status) != 0) {
                    g5Var.j(org.telegram.messenger.m5.f(this.H.emoji_status), z9);
                } else {
                    g5Var.g(null, z9);
                }
                l9Var.getImageReceiver().d = cVar.a;
                if (fileLocation != null) {
                    this.b0 = true;
                    l9Var.j(hc.e(fileLocation), "50_50", w8Var, null);
                } else {
                    hc a10 = hc.a(1, this.H);
                    this.b0 = a10 != null;
                    l9Var.j(a10, "50_50", w8Var, this.H);
                }
            }
        }
        org.telegram.ui.Components.g5 g5Var2 = this.r;
        if (c10 != j10) {
            g5Var2.j(c10, z9);
            k5Var.setLeftDrawable(g5Var2);
            g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false)));
        } else {
            g5Var2.g(null, z9);
            k5Var.setLeftDrawable((Drawable) null);
        }
        a(z9, false);
    }

    public final void f(int i7, int i10) {
        if (this.T != i7) {
            if (this.O) {
                this.L = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            }
            this.T = i7;
        }
        if (this.O) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            ch0 ch0Var = this.f;
            ch0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.k6.H1(ch0Var.getDrawable(), i10 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.l9 getAvatarImageView() {
        return this.b;
    }

    public e4 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        if (TextUtils.isEmpty(k5Var.getText()) || !this.b0) {
            k5Var = this.d[4];
        }
        if (k5Var.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return org.telegram.messenger.g0.L(8.0f) + k5Var.getTop() + k5Var.getTextHeight();
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
        return ij.C1(groupCallParticipant.peer);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.g5 g5Var = this.s;
        if (g5Var != null) {
            g5Var.a();
        }
        org.telegram.ui.Components.g5 g5Var2 = this.r;
        if (g5Var2 != null) {
            g5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.W) {
            org.telegram.messenger.g0.r(this.V);
            this.W = false;
        }
        AnimatorSet animatorSet = this.d0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.g5 g5Var = this.s;
        if (g5Var != null) {
            g5Var.b();
        }
        org.telegram.ui.Components.g5 g5Var2 = this.r;
        if (g5Var2 != null) {
            g5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.F;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hd.M0((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? 2131743294 : 2131743231, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z9) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
        if (z9) {
            k5VarArr[4].setTranslationY(0.0f);
        } else {
            k5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        e4 e4Var = this.a;
        if (d <= 1.5d) {
            e4Var.c(0.0d);
            return;
        }
        boolean z9 = this.W;
        a4 a4Var = this.V;
        if (z9) {
            org.telegram.messenger.g0.r(a4Var);
        }
        if (!this.a0) {
            this.a0 = true;
            a(true, false);
        }
        e4Var.c(d);
        org.telegram.messenger.g0.i3(a4Var, 500L);
        this.W = true;
    }

    public void setDrawAvatar(boolean z9) {
        org.telegram.ui.Components.l9 l9Var = this.b;
        if (l9Var.getImageReceiver().Q0 != z9) {
            l9Var.getImageReceiver().O0(z9, true);
        }
    }

    public void setDrawDivider(boolean z9) {
        this.N = z9;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        this.e0 = f10;
        this.c.setTranslationX((hd.a0 ? org.telegram.messenger.g0.L(53.0f) : -org.telegram.messenger.g0.L(53.0f)) * f10);
        boolean c10 = c();
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
        if (!c10 || f10 <= 0.0f) {
            k5Var.setVisibility(8);
            for (int i7 = 0; i7 < k5VarArr.length; i7++) {
                if (TextUtils.isEmpty(k5VarArr[4].getText()) || k5VarArr[4].getLineCount() <= 1) {
                    k5VarArr[i7].setTranslationX((hd.a0 ? org.telegram.messenger.g0.L(53.0f) : -org.telegram.messenger.g0.L(53.0f)) * f10);
                    k5VarArr[i7].h(0, 0);
                } else {
                    k5VarArr[i7].h(org.telegram.messenger.g0.L(92.0f), hd.a0 ? org.telegram.messenger.g0.L(48.0f) : org.telegram.messenger.g0.L(53.0f));
                    k5VarArr[i7].setFullAlpha(f10);
                    k5VarArr[i7].setTranslationX(0.0f);
                    k5VarArr[i7].invalidate();
                }
            }
        } else {
            float f11 = 1.0f - f10;
            k5Var.setTranslationX((hd.a0 ? -org.telegram.messenger.g0.L(53.0f) : org.telegram.messenger.g0.L(53.0f)) * f11);
            k5Var.setVisibility(0);
            k5Var.setAlpha(f10);
            k5VarArr[4].setAlpha(f11);
            org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[4];
            boolean z9 = hd.a0;
            int L = org.telegram.messenger.g0.L(53.0f);
            if (!z9) {
                L = -L;
            }
            k5Var2.setTranslationX(L * f10);
        }
        this.b.setAlpha(f10 == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.a0 && f10 == 0.0f);
        float f12 = 1.0f - f10;
        ch0 ch0Var = this.f;
        ch0Var.setAlpha(f12);
        float f13 = (f12 * 0.4f) + 0.6f;
        ch0Var.setScaleX(f13);
        ch0Var.setScaleY(f13);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.k5 k5Var;
        org.telegram.ui.ActionBar.k5[] k5VarArr;
        org.telegram.ui.ActionBar.k5 k5Var2;
        try {
            this.I.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
            int i7 = this.f0;
            if (i7 >= 0 && (k5Var = this.e) != null && (k5VarArr = this.d) != null && i7 < k5VarArr.length && (k5Var2 = k5VarArr[i7]) != null) {
                org.telegram.ui.ActionBar.r6.b0(k5Var2);
                k5Var.setTextColor(k5VarArr[this.f0].getTextColor());
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void d(f4 f4Var) {
    }
}

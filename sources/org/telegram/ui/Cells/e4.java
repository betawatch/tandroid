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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class e4 extends FrameLayout {
    public ChatObject.Call B;
    public TLRPC.GroupCallParticipant C;
    public TLRPC.User D;
    public TLRPC.Chat E;
    public final Paint F;
    public boolean G;
    public boolean H;
    public int I;
    public AccountInstance J;
    public boolean K;
    public boolean L;
    public int M;
    public long N;
    public final x3 O;
    public final x3 P;
    public int Q;
    public final x3 R;
    public final x3 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final Drawable W;
    public final c4 a;
    public AnimatorSet a0;
    public final org.telegram.ui.Components.p9 b;
    public float b0;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.ActionBar.k5[] d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final jj0 f;
    public final gj0 h;
    public final gj0 n;
    public final org.telegram.ui.Components.j5 r;
    public final org.telegram.ui.Components.j5 s;
    public Drawable v;
    public Drawable w;
    public final y3 x;
    public final org.telegram.ui.Components.z8 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.ui.Cells.x3] */
    public e4(Context context) {
        super(context);
        int i10 = 5;
        this.d = new org.telegram.ui.ActionBar.k5[5];
        final int i11 = 0;
        this.O = new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                switch (i11) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        gj0 gj0Var = e4Var.h;
                        gj0Var.P(0, null);
                        e4Var.f.setAnimation(gj0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        jj0 jj0Var = e4Var2.f;
                        gj0 gj0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i13 = 120;
                        if (nextInt < 32) {
                            i12 = 0;
                        } else {
                            i12 = 240;
                            if (nextInt < 64) {
                                i13 = 240;
                                i12 = 120;
                            } else {
                                i13 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt == 98) {
                                        i13 = 540;
                                        i12 = 420;
                                    } else {
                                        i13 = 720;
                                    }
                                }
                            }
                        }
                        gj0Var2.N(i13);
                        gj0Var2.P(i13 - 1, e4Var2.O);
                        jj0Var.setAnimation(gj0Var2);
                        gj0Var2.K(i12);
                        jj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.T = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i12 = 1;
        this.P = new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i12) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        gj0 gj0Var = e4Var.h;
                        gj0Var.P(0, null);
                        e4Var.f.setAnimation(gj0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        jj0 jj0Var = e4Var2.f;
                        gj0 gj0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i13 = 120;
                        if (nextInt < 32) {
                            i122 = 0;
                        } else {
                            i122 = 240;
                            if (nextInt < 64) {
                                i13 = 240;
                                i122 = 120;
                            } else {
                                i13 = 420;
                                if (nextInt >= 97) {
                                    i122 = 540;
                                    if (nextInt == 98) {
                                        i13 = 540;
                                        i122 = 420;
                                    } else {
                                        i13 = 720;
                                    }
                                }
                            }
                        }
                        gj0Var2.N(i13);
                        gj0Var2.P(i13 - 1, e4Var2.O);
                        jj0Var.setAnimation(gj0Var2);
                        gj0Var2.K(i122);
                        jj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.T = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.Q = org.telegram.ui.ActionBar.j6.rg;
        final int i13 = 2;
        this.R = new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i13) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        gj0 gj0Var = e4Var.h;
                        gj0Var.P(0, null);
                        e4Var.f.setAnimation(gj0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        jj0 jj0Var = e4Var2.f;
                        gj0 gj0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i132 = 120;
                        if (nextInt < 32) {
                            i122 = 0;
                        } else {
                            i122 = 240;
                            if (nextInt < 64) {
                                i132 = 240;
                                i122 = 120;
                            } else {
                                i132 = 420;
                                if (nextInt >= 97) {
                                    i122 = 540;
                                    if (nextInt == 98) {
                                        i132 = 540;
                                        i122 = 420;
                                    } else {
                                        i132 = 720;
                                    }
                                }
                            }
                        }
                        gj0Var2.N(i132);
                        gj0Var2.P(i132 - 1, e4Var2.O);
                        jj0Var.setAnimation(gj0Var2);
                        gj0Var2.K(i122);
                        jj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.T = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.S = new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        gj0 gj0Var = e4Var.h;
                        gj0Var.P(0, null);
                        e4Var.f.setAnimation(gj0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        jj0 jj0Var = e4Var2.f;
                        gj0 gj0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i132 = 120;
                        if (nextInt < 32) {
                            i122 = 0;
                        } else {
                            i122 = 240;
                            if (nextInt < 64) {
                                i132 = 240;
                                i122 = 120;
                            } else {
                                i132 = 420;
                                if (nextInt >= 97) {
                                    i122 = 540;
                                    if (nextInt == 98) {
                                        i132 = 540;
                                        i122 = 420;
                                    } else {
                                        i132 = 720;
                                    }
                                }
                            }
                        }
                        gj0Var2.N(i132);
                        gj0Var2.P(i132 - 1, e4Var2.O);
                        jj0Var.setAnimation(gj0Var2);
                        gj0Var2.K(i122);
                        jj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.T = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i14 = 4;
        new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i14) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        gj0 gj0Var = e4Var.h;
                        gj0Var.P(0, null);
                        e4Var.f.setAnimation(gj0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        jj0 jj0Var = e4Var2.f;
                        gj0 gj0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i132 = 120;
                        if (nextInt < 32) {
                            i122 = 0;
                        } else {
                            i122 = 240;
                            if (nextInt < 64) {
                                i132 = 240;
                                i122 = 120;
                            } else {
                                i132 = 420;
                                if (nextInt >= 97) {
                                    i122 = 540;
                                    if (nextInt == 98) {
                                        i132 = 540;
                                        i122 = 420;
                                    } else {
                                        i132 = 720;
                                    }
                                }
                            }
                        }
                        gj0Var2.N(i132);
                        gj0Var2.P(i132 - 1, e4Var2.O);
                        jj0Var.setAnimation(gj0Var2);
                        gj0Var2.K(i122);
                        jj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.T = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        Paint paint = new Paint();
        this.F = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
        this.y = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        setClipChildren(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z4 = LocaleController.isRTL;
        addView(p9Var, k7.b6.d(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 11.0f, 6.0f, z4 ? 11.0f : 0.0f, 0.0f));
        y3 y3Var = new y3(this, context);
        this.x = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        y3Var.setProgressColor(-1);
        y3Var.setNoProgress(false);
        boolean z10 = LocaleController.isRTL;
        addView(y3Var, k7.b6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextSize(16);
        k5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(k5Var, k7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
        this.r = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), 9, k5Var, false);
        this.s = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), 9, k5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.W = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false), PorterDuff.Mode.MULTIPLY));
        int i15 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
            if (i15 >= k5VarArr.length) {
                break;
            }
            k5VarArr[i15] = new z3(this, context, i15);
            this.d[i15].setTextSize(15);
            this.d[i15].setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (i15 == 4) {
                this.d[i15].setBuildFullLayout(true);
                this.d[i15].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false));
                View view = this.d[i15];
                boolean z12 = LocaleController.isRTL;
                addView(view, k7.b6.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i15 == 0) {
                    this.d[i15].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false));
                    this.d[i15].k(LocaleController.getString(R.string.Listening));
                } else if (i15 == 1) {
                    this.d[i15].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false));
                    this.d[i15].k(LocaleController.getString(R.string.Speaking));
                    this.d[i15].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i15 == 2) {
                    this.d[i15].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.sg, false));
                    this.d[i15].k(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i15 == 3) {
                    this.d[i15].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false));
                    this.d[i15].k(LocaleController.getString(R.string.WantsToSpeak));
                }
                View view2 = this.d[i15];
                boolean z13 = LocaleController.isRTL;
                addView(view2, k7.b6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 54.0f : 67.0f, 32.0f, z13 ? 67.0f : 54.0f, 0.0f));
            }
            i15++;
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var2;
        k5Var2.setMaxLines(3);
        k5Var2.setTextSize(15);
        k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false));
        k5Var2.setVisibility(8);
        addView(k5Var2, k7.b6.d(-1, 60.0f, (LocaleController.isRTL ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        gj0 gj0Var = new gj0(R.raw.voice_outlined2, "" + R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = gj0Var;
        this.n = new gj0(R.raw.hand_1, "" + R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        jj0 jj0Var = new jj0(context);
        this.f = jj0Var;
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        jj0Var.setAnimation(gj0Var);
        z f02 = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        jj0Var.setBackground(f02);
        jj0Var.setImportantForAccessibility(2);
        addView(jj0Var, k7.b6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        jj0Var.setOnClickListener(new a(this, i10));
        this.a = new c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z4, boolean z10) {
        char c3;
        int w02;
        int i10;
        boolean z11;
        ArrayList arrayList;
        float f10;
        float dp;
        boolean N;
        if (this.B == null) {
            return;
        }
        char c10 = 1;
        int i11 = 0;
        boolean z12 = (c() && this.C.raise_hand_rating == 0) ? false : true;
        jj0 jj0Var = this.f;
        jj0Var.setEnabled(z12);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.C;
        boolean z13 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z10) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.C.lastSpeakTime;
            boolean z14 = uptimeMillis < 500;
            if (!this.U || !z14 || z13) {
                this.U = z14;
                boolean z15 = this.T;
                x3 x3Var = this.S;
                if (z15) {
                    AndroidUtilities.cancelRunOnUIThread(x3Var);
                    this.T = false;
                }
                if (this.U) {
                    AndroidUtilities.runOnUIThread(x3Var, 500 - uptimeMillis);
                    this.T = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.B.participants.f(MessageObject.getPeerId(this.C.peer));
        if (groupCallParticipant2 != null) {
            this.C = groupCallParticipant2;
        }
        boolean z16 = this.C.muted_by_you && !c();
        boolean z17 = !c() ? (!this.C.muted || (this.U && z13)) && !z16 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.U && z13);
        if (z17) {
            boolean z18 = this.C.can_self_unmute;
        }
        boolean isEmpty = TextUtils.isEmpty(this.C.about);
        this.L = false;
        x3 x3Var2 = this.R;
        AndroidUtilities.cancelRunOnUIThread(x3Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.C;
        if ((!groupCallParticipant3.muted || this.U) && !z16) {
            c3 = 4;
            if (this.U && z13) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false);
                z11 = false;
                i10 = 1;
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, this.Q, false);
                i10 = !isEmpty ? 4 : 0;
                this.L = true;
                z11 = false;
            }
        } else {
            boolean z19 = groupCallParticipant3.can_self_unmute;
            if (!z19 || z16) {
                boolean z20 = (z19 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z20) {
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    c3 = 4;
                    long j10 = this.C.lastRaiseHandDate;
                    long j11 = elapsedRealtime2 - j10;
                    if (j10 == 0 || j11 > 5000) {
                        i10 = z16 ? 2 : !isEmpty ? 4 : 0;
                    } else {
                        AndroidUtilities.runOnUIThread(x3Var2, 5000 - j11);
                        i10 = 3;
                    }
                    z11 = z20;
                    w02 = w03;
                } else {
                    c3 = 4;
                    int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.sg, false);
                    i10 = z16 ? 2 : !isEmpty ? 4 : 0;
                    z11 = z20;
                    w02 = w04;
                }
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, this.Q, false);
                this.L = true;
                i10 = !isEmpty ? 4 : 0;
                z11 = false;
                c3 = 4;
            }
        }
        boolean c11 = c();
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
        if (!c11) {
            k5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false));
        }
        boolean c12 = c();
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        if (c12) {
            if (isEmpty && !this.V) {
                if (this.D != null) {
                    k5VarArr[c3].k(LocaleController.getString(R.string.TapToAddPhotoOrBio));
                } else {
                    k5VarArr[c3].k(LocaleController.getString(R.string.TapToAddPhotoOrDescription));
                }
                k5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false));
            } else if (isEmpty) {
                if (this.D != null) {
                    k5VarArr[c3].k(LocaleController.getString(R.string.TapToAddBio));
                } else {
                    k5VarArr[c3].k(LocaleController.getString(R.string.TapToAddDescription));
                }
                k5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false));
            } else if (this.V) {
                k5VarArr[c3].k(LocaleController.getString(R.string.ThisIsYou));
                k5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false));
            } else {
                k5VarArr[c3].k(LocaleController.getString(R.string.TapToAddPhoto));
                k5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false));
            }
            if (isEmpty) {
                k5Var.l(k5VarArr[i10].getText(), false);
                k5Var.setTextColor(k5VarArr[i10].getTextColor());
            } else {
                k5Var.l(AndroidUtilities.replaceNewLines(this.C.about), false);
                k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false));
            }
        } else if (isEmpty) {
            k5VarArr[c3].k("");
            k5Var.l("", false);
        } else {
            k5VarArr[c3].k(AndroidUtilities.replaceNewLines(this.C.about));
            k5Var.l("", false);
        }
        AnimatorSet animatorSet = this.a0;
        boolean z21 = (animatorSet == null || (i10 == this.M && this.I == w02)) ? false : true;
        if ((!z4 || z21) && animatorSet != null) {
            animatorSet.cancel();
            this.a0 = null;
        }
        if (!z4 || this.I != w02 || z21) {
            if (z4) {
                arrayList = new ArrayList();
                int i12 = this.I;
                this.I = w02;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new dg.g0(this, i12, w02, c10 == true ? 1 : 0));
                arrayList.add(ofFloat);
                if (i10 == 1) {
                    int participantVolume = ChatObject.getParticipantVolume(this.C);
                    int i13 = participantVolume / 100;
                    if (i13 != 100) {
                        k5VarArr[1].setLeftDrawable(this.W);
                        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[1];
                        int i14 = R.string.SpeakingWithVolume;
                        if (participantVolume < 100) {
                            i13 = 1;
                        }
                        k5Var2.k(LocaleController.formatString("SpeakingWithVolume", i14, Integer.valueOf(i13)));
                    } else {
                        k5VarArr[1].setLeftDrawable((Drawable) null);
                        k5VarArr[1].k(LocaleController.getString(R.string.Speaking));
                    }
                }
                if (!c()) {
                    b(4);
                } else if (!z4 || i10 != this.M || z21) {
                    if (z4) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        Property property = View.ALPHA;
                        Property property2 = View.TRANSLATION_Y;
                        if (i10 == 0) {
                            int i15 = 0;
                            while (i15 < k5VarArr.length) {
                                arrayList.add(ObjectAnimator.ofFloat(k5VarArr[i15], (Property<org.telegram.ui.ActionBar.k5, Float>) property2, i15 == i10 ? 0.0f : AndroidUtilities.dp(-2.0f)));
                                arrayList.add(ObjectAnimator.ofFloat(k5VarArr[i15], (Property<org.telegram.ui.ActionBar.k5, Float>) property, i15 == i10 ? 1.0f : 0.0f));
                                i15++;
                            }
                            f10 = 0.0f;
                        } else {
                            f10 = 0.0f;
                            int i16 = 0;
                            while (i16 < k5VarArr.length) {
                                org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[i16];
                                if (i16 == i10) {
                                    dp = 0.0f;
                                } else {
                                    dp = AndroidUtilities.dp(i16 == 0 ? 2.0f : -2.0f);
                                }
                                arrayList.add(ObjectAnimator.ofFloat(k5Var3, (Property<org.telegram.ui.ActionBar.k5, Float>) property2, dp));
                                arrayList.add(ObjectAnimator.ofFloat(k5VarArr[i16], (Property<org.telegram.ui.ActionBar.k5, Float>) property, i16 == i10 ? 1.0f : 0.0f));
                                i16++;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                        b(i10);
                    }
                    this.M = i10;
                    c4 c4Var = this.a;
                    c4Var.i = i10;
                    if (!z4) {
                        c4Var.j = i10 != 1 ? 1.0f : 0.0f;
                    }
                    if (arrayList != null) {
                        AnimatorSet animatorSet2 = this.a0;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                            this.a0 = null;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.a0 = animatorSet3;
                        animatorSet3.addListener(new b4(this, i10, i11));
                        this.a0.playTogether(arrayList);
                        this.a0.setDuration(180L);
                        this.a0.start();
                    }
                    if (z4 || this.G != z17 || this.H != z11) {
                        gj0 gj0Var = this.h;
                        if (z11) {
                            N = gj0Var.N(84);
                            if (z4) {
                                gj0Var.P(83, this.P);
                            } else {
                                gj0Var.P(0, null);
                            }
                        } else {
                            jj0Var.setAnimation(gj0Var);
                            gj0Var.P(0, null);
                            if (z17 && this.H) {
                                N = gj0Var.N(21);
                            } else {
                                N = gj0Var.N(z17 ? 64 : 42);
                            }
                        }
                        if (z4) {
                            if (N) {
                                if (i10 == 3) {
                                    gj0Var.K(63);
                                } else if (z17 && this.H && !z11) {
                                    gj0Var.K(0);
                                } else if (z17) {
                                    gj0Var.K(43);
                                } else {
                                    gj0Var.K(21);
                                }
                            }
                            jj0Var.d();
                        } else {
                            gj0Var.L(gj0Var.f - 1, false, true);
                            jj0Var.invalidate();
                        }
                        this.G = z17;
                        this.H = z11;
                    }
                    if (!this.U) {
                        c4Var.c(0.0d);
                    }
                    c4Var.e(this, !this.U && this.b0 == f10);
                }
                f10 = 0.0f;
                c4 c4Var2 = this.a;
                c4Var2.i = i10;
                if (!z4) {
                }
                if (arrayList != null) {
                }
                if (z4) {
                }
                gj0 gj0Var2 = this.h;
                if (z11) {
                }
                if (z4) {
                }
                this.G = z17;
                this.H = z11;
                if (!this.U) {
                }
                c4Var2.e(this, !this.U && this.b0 == f10);
            }
            this.I = w02;
            jj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.j6.B1(jj0Var.getDrawable(), w02 & 620756991, true);
        }
        arrayList = null;
        if (i10 == 1) {
        }
        if (!c()) {
        }
        f10 = 0.0f;
        c4 c4Var22 = this.a;
        c4Var22.i = i10;
        if (!z4) {
        }
        if (arrayList != null) {
        }
        if (z4) {
        }
        gj0 gj0Var22 = this.h;
        if (z11) {
        }
        if (z4) {
        }
        this.G = z17;
        this.H = z11;
        if (!this.U) {
        }
        c4Var22.e(this, !this.U && this.b0 == f10);
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.k5[] k5VarArr;
        float dp;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            k5VarArr = this.d;
            if (i12 >= k5VarArr.length) {
                break;
            }
            k5VarArr[i12].setImportantForAccessibility(i12 == i10 ? 1 : 2);
            i12++;
        }
        if (i10 == 0) {
            while (i11 < k5VarArr.length) {
                k5VarArr[i11].setTranslationY(i11 == i10 ? 0.0f : AndroidUtilities.dp(-2.0f));
                k5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
                i11++;
            }
            return;
        }
        while (i11 < k5VarArr.length) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i11];
            if (i11 == i10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(i11 == 0 ? 2.0f : -2.0f);
            }
            k5Var.setTranslationY(dp);
            k5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
            i11++;
        }
    }

    public final boolean c() {
        long j10 = this.N;
        if (j10 > 0) {
            TLRPC.User user = this.D;
            return user != null && user.id == j10;
        }
        TLRPC.Chat chat = this.E;
        return chat != null && chat.id == (-j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.K) {
            Paint paint = this.F;
            int alpha = paint.getAlpha();
            float f10 = this.b0;
            if (f10 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f10) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            float dp = LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f);
            canvas2 = canvas;
            canvas2.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.p9 p9Var = this.b;
        int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
        int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
        c4 c4Var = this.a;
        c4Var.f();
        if (this.b0 == 0.0f) {
            c4Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        p9Var.setScaleX(c4Var.b());
        p9Var.setScaleY(c4Var.b());
        float b10 = c4Var.b();
        y3 y3Var = this.x;
        y3Var.setScaleX(b10);
        y3Var.setScaleY(c4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j10, TLRPC.FileLocation fileLocation, boolean z4) {
        long j11;
        long botVerificationIcon;
        this.B = call;
        this.J = accountInstance;
        this.N = j10;
        this.C = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        org.telegram.ui.Components.p9 p9Var = this.b;
        org.telegram.ui.Components.z8 z8Var = this.y;
        org.telegram.ui.Components.j5 j5Var = this.s;
        if (peerId > 0) {
            this.D = this.J.getMessagesController().getUser(Long.valueOf(peerId));
            this.E = null;
            z8Var.m(this.J.getCurrentAccount(), this.D);
            k5Var.l(UserObject.getUserName(this.D), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.D);
            TLRPC.User user = this.D;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.v;
                if (drawable == null) {
                    drawable = new d4(getContext());
                }
                this.v = drawable;
                j5Var.g(drawable, z4);
            } else if (user == null || DialogObject.getEmojiStatusDocumentId(user.emoji_status) == 0) {
                TLRPC.User user2 = this.D;
                if (user2 == null || !user2.premium) {
                    j5Var.g(null, z4);
                } else {
                    if (this.w == null) {
                        this.w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.w = new a4(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.w);
                    }
                    j5Var.g(this.w, z4);
                }
            } else {
                j5Var.j(DialogObject.getEmojiStatusDocumentId(this.D.emoji_status), z4);
            }
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false)));
            k5Var.i(j5Var);
            p9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.V = true;
                p9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", z8Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.D, 1);
                this.V = forUser != null;
                p9Var.h(forUser, "50_50", z8Var, this.D);
            }
        } else {
            j11 = 0;
            this.E = this.J.getMessagesController().getChat(Long.valueOf(-peerId));
            this.D = null;
            z8Var.k(this.J.getCurrentAccount(), this.E);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.E);
            TLRPC.Chat chat = this.E;
            if (chat != null) {
                k5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.E;
                if (chat2.verified) {
                    Drawable drawable2 = this.v;
                    if (drawable2 == null) {
                        drawable2 = new d4(getContext());
                    }
                    this.v = drawable2;
                    j5Var.g(drawable2, z4);
                } else if (chat2 == null || DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) == 0) {
                    j5Var.g(null, z4);
                } else {
                    j5Var.j(DialogObject.getEmojiStatusDocumentId(this.E.emoji_status), z4);
                }
                p9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.V = true;
                    p9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", z8Var, null);
                } else {
                    ImageLocation forChat = ImageLocation.getForChat(this.E, 1);
                    this.V = forChat != null;
                    p9Var.h(forChat, "50_50", z8Var, this.E);
                }
            }
        }
        org.telegram.ui.Components.j5 j5Var2 = this.r;
        if (botVerificationIcon != j11) {
            j5Var2.j(botVerificationIcon, z4);
            k5Var.setLeftDrawable(j5Var2);
            j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false)));
        } else {
            j5Var2.g(null, z4);
            k5Var.setLeftDrawable((Drawable) null);
        }
        a(z4, false);
    }

    public final void f(int i10, int i11) {
        if (this.Q != i10) {
            if (this.L) {
                this.I = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            }
            this.Q = i10;
        }
        if (this.L) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            jj0 jj0Var = this.f;
            jj0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.j6.B1(jj0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.p9 getAvatarImageView() {
        return this.b;
    }

    public c4 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        if (TextUtils.isEmpty(k5Var.getText()) || !this.V) {
            k5Var = this.d[4];
        }
        if (k5Var.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return AndroidUtilities.dp(8.0f) + k5Var.getTop() + k5Var.getTextHeight();
    }

    public CharSequence getName() {
        return this.c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.C;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.C;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return MessageObject.getPeerId(groupCallParticipant.peer);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.j5 j5Var = this.s;
        if (j5Var != null) {
            j5Var.a();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.r;
        if (j5Var2 != null) {
            j5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            AndroidUtilities.cancelRunOnUIThread(this.S);
            this.T = false;
        }
        AnimatorSet animatorSet = this.a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.j5 j5Var = this.s;
        if (j5Var != null) {
            j5Var.b();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.r;
        if (j5Var2 != null) {
            j5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.C;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? R.string.VoipMute : R.string.VoipUnmute)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z4) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
        if (z4) {
            k5VarArr[4].setTranslationY(0.0f);
        } else {
            k5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        c4 c4Var = this.a;
        if (d <= 1.5d) {
            c4Var.c(0.0d);
            return;
        }
        boolean z4 = this.T;
        x3 x3Var = this.S;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(x3Var);
        }
        if (!this.U) {
            this.U = true;
            a(true, false);
        }
        c4Var.c(d);
        AndroidUtilities.runOnUIThread(x3Var, 500L);
        this.T = true;
    }

    public void setDrawAvatar(boolean z4) {
        org.telegram.ui.Components.p9 p9Var = this.b;
        if (p9Var.getImageReceiver().getVisible() != z4) {
            p9Var.getImageReceiver().setVisible(z4, true);
        }
    }

    public void setDrawDivider(boolean z4) {
        this.K = z4;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        this.b0 = f10;
        this.c.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f10);
        boolean c3 = c();
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
        if (!c3 || f10 <= 0.0f) {
            k5Var.setVisibility(8);
            for (int i10 = 0; i10 < k5VarArr.length; i10++) {
                if (TextUtils.isEmpty(k5VarArr[4].getText()) || k5VarArr[4].getLineCount() <= 1) {
                    k5VarArr[i10].setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f10);
                    k5VarArr[i10].h(0, 0);
                } else {
                    k5VarArr[i10].h(AndroidUtilities.dp(92.0f), LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(53.0f));
                    k5VarArr[i10].setFullAlpha(f10);
                    k5VarArr[i10].setTranslationX(0.0f);
                    k5VarArr[i10].invalidate();
                }
            }
        } else {
            float f11 = 1.0f - f10;
            k5Var.setTranslationX((LocaleController.isRTL ? -AndroidUtilities.dp(53.0f) : AndroidUtilities.dp(53.0f)) * f11);
            k5Var.setVisibility(0);
            k5Var.setAlpha(f10);
            k5VarArr[4].setAlpha(f11);
            org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[4];
            boolean z4 = LocaleController.isRTL;
            int dp = AndroidUtilities.dp(53.0f);
            if (!z4) {
                dp = -dp;
            }
            k5Var2.setTranslationX(dp * f10);
        }
        this.b.setAlpha(f10 == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.U && f10 == 0.0f);
        float f12 = 1.0f - f10;
        jj0 jj0Var = this.f;
        jj0Var.setAlpha(f12);
        float f13 = (f12 * 0.4f) + 0.6f;
        jj0Var.setScaleX(f13);
        jj0Var.setScaleY(f13);
        invalidate();
    }

    public void d(e4 e4Var) {
    }
}

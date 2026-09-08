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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class d4 extends FrameLayout {
    public ChatObject.Call E;
    public TLRPC.GroupCallParticipant F;
    public TLRPC.User G;
    public TLRPC.Chat H;
    public final Paint I;
    public boolean J;
    public boolean K;
    public int L;
    public AccountInstance M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public final x3 R;
    public final x3 S;
    public int T;
    public final x3 U;
    public final x3 V;
    public boolean W;
    public final b4 a;
    public boolean a0;
    public final org.telegram.ui.Components.x9 b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.j5 c;
    public final Drawable c0;
    public final org.telegram.ui.ActionBar.j5[] d;
    public AnimatorSet d0;
    public final org.telegram.ui.ActionBar.j5 e;
    public float e0;
    public final aj0 f;
    public final xi0 h;
    public final xi0 n;
    public final org.telegram.ui.Components.o5 r;
    public final org.telegram.ui.Components.o5 s;
    public Drawable v;
    public Drawable w;
    public final y3 x;
    public final org.telegram.ui.Components.i9 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.ui.Cells.x3] */
    public d4(Context context) {
        super(context);
        int i10 = 5;
        this.d = new org.telegram.ui.ActionBar.j5[5];
        final int i11 = 0;
        this.R = new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                switch (i11) {
                    case 0:
                        d4 d4Var = this.b;
                        d4Var.n.P(0, null);
                        xi0 xi0Var = d4Var.h;
                        xi0Var.P(0, null);
                        d4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        d4 d4Var2 = this.b;
                        aj0 aj0Var = d4Var2.f;
                        xi0 xi0Var2 = d4Var2.n;
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
                        xi0Var2.N(i13);
                        xi0Var2.P(i13 - 1, d4Var2.R);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i12);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        d4 d4Var3 = this.b;
                        d4Var3.a0 = false;
                        d4Var3.a(true, true);
                        d4Var3.a.c(0.0d);
                        d4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i12 = 1;
        this.S = new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i12) {
                    case 0:
                        d4 d4Var = this.b;
                        d4Var.n.P(0, null);
                        xi0 xi0Var = d4Var.h;
                        xi0Var.P(0, null);
                        d4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        d4 d4Var2 = this.b;
                        aj0 aj0Var = d4Var2.f;
                        xi0 xi0Var2 = d4Var2.n;
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
                        xi0Var2.N(i13);
                        xi0Var2.P(i13 - 1, d4Var2.R);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i122);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        d4 d4Var3 = this.b;
                        d4Var3.a0 = false;
                        d4Var3.a(true, true);
                        d4Var3.a.c(0.0d);
                        d4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.T = org.telegram.ui.ActionBar.j6.rg;
        final int i13 = 2;
        this.U = new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i13) {
                    case 0:
                        d4 d4Var = this.b;
                        d4Var.n.P(0, null);
                        xi0 xi0Var = d4Var.h;
                        xi0Var.P(0, null);
                        d4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        d4 d4Var2 = this.b;
                        aj0 aj0Var = d4Var2.f;
                        xi0 xi0Var2 = d4Var2.n;
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
                        xi0Var2.N(i132);
                        xi0Var2.P(i132 - 1, d4Var2.R);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i122);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        d4 d4Var3 = this.b;
                        d4Var3.a0 = false;
                        d4Var3.a(true, true);
                        d4Var3.a.c(0.0d);
                        d4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.V = new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (r2) {
                    case 0:
                        d4 d4Var = this.b;
                        d4Var.n.P(0, null);
                        xi0 xi0Var = d4Var.h;
                        xi0Var.P(0, null);
                        d4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        d4 d4Var2 = this.b;
                        aj0 aj0Var = d4Var2.f;
                        xi0 xi0Var2 = d4Var2.n;
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
                        xi0Var2.N(i132);
                        xi0Var2.P(i132 - 1, d4Var2.R);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i122);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        d4 d4Var3 = this.b;
                        d4Var3.a0 = false;
                        d4Var3.a(true, true);
                        d4Var3.a.c(0.0d);
                        d4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i14 = 4;
        new Runnable(this) { // from class: org.telegram.ui.Cells.x3
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i14) {
                    case 0:
                        d4 d4Var = this.b;
                        d4Var.n.P(0, null);
                        xi0 xi0Var = d4Var.h;
                        xi0Var.P(0, null);
                        d4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        d4 d4Var2 = this.b;
                        aj0 aj0Var = d4Var2.f;
                        xi0 xi0Var2 = d4Var2.n;
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
                        xi0Var2.N(i132);
                        xi0Var2.P(i132 - 1, d4Var2.R);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i122);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        d4 d4Var3 = this.b;
                        d4Var3.a0 = false;
                        d4Var3.a(true, true);
                        d4Var3.a.c(0.0d);
                        d4Var3.W = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        Paint paint = new Paint();
        this.I = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
        this.y = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        setClipChildren(false);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.b = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(x9Var, w7.x5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
        y3 y3Var = new y3(this, context);
        this.x = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        y3Var.setProgressColor(-1);
        y3Var.setNoProgress(false);
        boolean z11 = LocaleController.isRTL;
        addView(y3Var, w7.x5.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 11.0f, 6.0f, z11 ? 11.0f : 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        j5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(j5Var, w7.x5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 10.0f, z12 ? 67.0f : 54.0f, 0.0f));
        this.r = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), 9, j5Var, false);
        this.s = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), 9, j5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.c0 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false), PorterDuff.Mode.MULTIPLY));
        int i15 = 0;
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
            if (i15 >= j5VarArr.length) {
                break;
            }
            j5VarArr[i15] = new z3(this, context, i15);
            this.d[i15].setTextSize(15);
            this.d[i15].setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (i15 == 4) {
                this.d[i15].setBuildFullLayout(true);
                this.d[i15].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false));
                View view = this.d[i15];
                boolean z13 = LocaleController.isRTL;
                addView(view, w7.x5.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 54.0f : 67.0f, 32.0f, z13 ? 67.0f : 54.0f, 0.0f));
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
                boolean z14 = LocaleController.isRTL;
                addView(view2, w7.x5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 54.0f : 67.0f, 32.0f, z14 ? 67.0f : 54.0f, 0.0f));
            }
            i15++;
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var2;
        j5Var2.setMaxLines(3);
        j5Var2.setTextSize(15);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false));
        j5Var2.setVisibility(8);
        addView(j5Var2, w7.x5.d(-1, 60.0f, (LocaleController.isRTL ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        xi0 xi0Var = new xi0(R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = xi0Var;
        this.n = new xi0(R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        aj0 aj0Var = new aj0(context);
        this.f = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.setAnimation(xi0Var);
        z f02 = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, this.T, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        aj0Var.setBackground(f02);
        aj0Var.setImportantForAccessibility(2);
        addView(aj0Var, w7.x5.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        aj0Var.setOnClickListener(new a(this, i10));
        this.a = new b4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10, boolean z11) {
        char c10;
        int w02;
        int i10;
        boolean z12;
        ArrayList arrayList;
        float f7;
        float dp;
        boolean N;
        if (this.E == null) {
            return;
        }
        char c11 = 1;
        boolean z13 = (c() && this.F.raise_hand_rating == 0) ? false : true;
        aj0 aj0Var = this.f;
        aj0Var.setEnabled(z13);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.F;
        boolean z14 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z11) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.F.lastSpeakTime;
            boolean z15 = uptimeMillis < 500;
            if (!this.a0 || !z15 || z14) {
                this.a0 = z15;
                boolean z16 = this.W;
                x3 x3Var = this.V;
                if (z16) {
                    AndroidUtilities.cancelRunOnUIThread(x3Var);
                    this.W = false;
                }
                if (this.a0) {
                    AndroidUtilities.runOnUIThread(x3Var, 500 - uptimeMillis);
                    this.W = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.E.participants.f(MessageObject.getPeerId(this.F.peer));
        if (groupCallParticipant2 != null) {
            this.F = groupCallParticipant2;
        }
        boolean z17 = this.F.muted_by_you && !c();
        boolean z18 = !c() ? (!this.F.muted || (this.a0 && z14)) && !z17 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.a0 && z14);
        if (z18) {
            boolean z19 = this.F.can_self_unmute;
        }
        boolean isEmpty = TextUtils.isEmpty(this.F.about);
        this.O = false;
        x3 x3Var2 = this.U;
        AndroidUtilities.cancelRunOnUIThread(x3Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.F;
        if ((!groupCallParticipant3.muted || this.a0) && !z17) {
            c10 = 4;
            if (this.a0 && z14) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false);
                z12 = false;
                i10 = 1;
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, this.T, false);
                i10 = !isEmpty ? 4 : 0;
                this.O = true;
                z12 = false;
            }
        } else {
            boolean z20 = groupCallParticipant3.can_self_unmute;
            if (!z20 || z17) {
                boolean z21 = (z20 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z21) {
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    c10 = 4;
                    long j3 = this.F.lastRaiseHandDate;
                    long j10 = elapsedRealtime2 - j3;
                    if (j3 == 0 || j10 > 5000) {
                        i10 = z17 ? 2 : !isEmpty ? 4 : 0;
                    } else {
                        AndroidUtilities.runOnUIThread(x3Var2, 5000 - j10);
                        i10 = 3;
                    }
                    z12 = z21;
                    w02 = w03;
                } else {
                    c10 = 4;
                    int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.sg, false);
                    i10 = z17 ? 2 : !isEmpty ? 4 : 0;
                    z12 = z21;
                    w02 = w04;
                }
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, this.T, false);
                this.O = true;
                i10 = !isEmpty ? 4 : 0;
                z12 = false;
                c10 = 4;
            }
        }
        boolean c12 = c();
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
        if (!c12) {
            j5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.T, false));
        }
        boolean c13 = c();
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        if (c13) {
            if (isEmpty && !this.b0) {
                if (this.G != null) {
                    j5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhotoOrBio));
                } else {
                    j5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhotoOrDescription));
                }
                j5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.T, false));
            } else if (isEmpty) {
                if (this.G != null) {
                    j5VarArr[c10].k(LocaleController.getString(R.string.TapToAddBio));
                } else {
                    j5VarArr[c10].k(LocaleController.getString(R.string.TapToAddDescription));
                }
                j5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.T, false));
            } else if (this.b0) {
                j5VarArr[c10].k(LocaleController.getString(R.string.ThisIsYou));
                j5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false));
            } else {
                j5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhoto));
                j5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.T, false));
            }
            if (isEmpty) {
                j5Var.l(j5VarArr[i10].getText(), false);
                j5Var.setTextColor(j5VarArr[i10].getTextColor());
            } else {
                j5Var.l(AndroidUtilities.replaceNewLines(this.F.about), false);
                j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false));
            }
        } else if (isEmpty) {
            j5VarArr[c10].k("");
            j5Var.l("", false);
        } else {
            j5VarArr[c10].k(AndroidUtilities.replaceNewLines(this.F.about));
            j5Var.l("", false);
        }
        AnimatorSet animatorSet = this.d0;
        boolean z22 = (animatorSet == null || (i10 == this.P && this.L == w02)) ? false : true;
        if ((!z10 || z22) && animatorSet != null) {
            animatorSet.cancel();
            this.d0 = null;
        }
        if (!z10 || this.L != w02 || z22) {
            if (z10) {
                arrayList = new ArrayList();
                int i11 = this.L;
                this.L = w02;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new di.d5(this, i11, w02, c11 == true ? 1 : 0));
                arrayList.add(ofFloat);
                if (i10 == 1) {
                    int participantVolume = ChatObject.getParticipantVolume(this.F);
                    int i12 = participantVolume / 100;
                    if (i12 != 100) {
                        j5VarArr[1].setLeftDrawable(this.c0);
                        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[1];
                        int i13 = R.string.SpeakingWithVolume;
                        if (participantVolume < 100) {
                            i12 = 1;
                        }
                        j5Var2.k(LocaleController.formatString("SpeakingWithVolume", i13, Integer.valueOf(i12)));
                    } else {
                        j5VarArr[1].setLeftDrawable((Drawable) null);
                        j5VarArr[1].k(LocaleController.getString(R.string.Speaking));
                    }
                }
                if (!c()) {
                    b(4);
                } else if (!z10 || i10 != this.P || z22) {
                    if (z10) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        Property property = View.ALPHA;
                        Property property2 = View.TRANSLATION_Y;
                        if (i10 == 0) {
                            int i14 = 0;
                            while (i14 < j5VarArr.length) {
                                arrayList.add(ObjectAnimator.ofFloat(j5VarArr[i14], (Property<org.telegram.ui.ActionBar.j5, Float>) property2, i14 == i10 ? 0.0f : AndroidUtilities.dp(-2.0f)));
                                arrayList.add(ObjectAnimator.ofFloat(j5VarArr[i14], (Property<org.telegram.ui.ActionBar.j5, Float>) property, i14 == i10 ? 1.0f : 0.0f));
                                i14++;
                            }
                            f7 = 0.0f;
                        } else {
                            f7 = 0.0f;
                            int i15 = 0;
                            while (i15 < j5VarArr.length) {
                                org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[i15];
                                if (i15 == i10) {
                                    dp = 0.0f;
                                } else {
                                    dp = AndroidUtilities.dp(i15 == 0 ? 2.0f : -2.0f);
                                }
                                arrayList.add(ObjectAnimator.ofFloat(j5Var3, (Property<org.telegram.ui.ActionBar.j5, Float>) property2, dp));
                                arrayList.add(ObjectAnimator.ofFloat(j5VarArr[i15], (Property<org.telegram.ui.ActionBar.j5, Float>) property, i15 == i10 ? 1.0f : 0.0f));
                                i15++;
                            }
                        }
                    } else {
                        f7 = 0.0f;
                        b(i10);
                    }
                    this.P = i10;
                    b4 b4Var = this.a;
                    b4Var.i = i10;
                    if (!z10) {
                        b4Var.j = i10 != 1 ? 1.0f : 0.0f;
                    }
                    if (arrayList != null) {
                        AnimatorSet animatorSet2 = this.d0;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                            this.d0 = null;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.d0 = animatorSet3;
                        animatorSet3.addListener(new fi.v2(this, i10, 3));
                        this.d0.playTogether(arrayList);
                        this.d0.setDuration(180L);
                        this.d0.start();
                    }
                    if (z10 || this.J != z18 || this.K != z12) {
                        xi0 xi0Var = this.h;
                        if (z12) {
                            N = xi0Var.N(84);
                            if (z10) {
                                xi0Var.P(83, this.S);
                            } else {
                                xi0Var.P(0, null);
                            }
                        } else {
                            aj0Var.setAnimation(xi0Var);
                            xi0Var.P(0, null);
                            if (z18 && this.K) {
                                N = xi0Var.N(21);
                            } else {
                                N = xi0Var.N(z18 ? 64 : 42);
                            }
                        }
                        if (z10) {
                            if (N) {
                                if (i10 == 3) {
                                    xi0Var.K(63);
                                } else if (z18 && this.K && !z12) {
                                    xi0Var.K(0);
                                } else if (z18) {
                                    xi0Var.K(43);
                                } else {
                                    xi0Var.K(21);
                                }
                            }
                            aj0Var.d();
                        } else {
                            xi0Var.L(xi0Var.f - 1, false, true);
                            aj0Var.invalidate();
                        }
                        this.J = z18;
                        this.K = z12;
                    }
                    if (!this.a0) {
                        b4Var.c(0.0d);
                    }
                    b4Var.e(this, !this.a0 && this.e0 == f7);
                }
                f7 = 0.0f;
                b4 b4Var2 = this.a;
                b4Var2.i = i10;
                if (!z10) {
                }
                if (arrayList != null) {
                }
                if (z10) {
                }
                xi0 xi0Var2 = this.h;
                if (z12) {
                }
                if (z10) {
                }
                this.J = z18;
                this.K = z12;
                if (!this.a0) {
                }
                b4Var2.e(this, !this.a0 && this.e0 == f7);
            }
            this.L = w02;
            aj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.j6.B1(aj0Var.getDrawable(), w02 & 620756991, true);
        }
        arrayList = null;
        if (i10 == 1) {
        }
        if (!c()) {
        }
        f7 = 0.0f;
        b4 b4Var22 = this.a;
        b4Var22.i = i10;
        if (!z10) {
        }
        if (arrayList != null) {
        }
        if (z10) {
        }
        xi0 xi0Var22 = this.h;
        if (z12) {
        }
        if (z10) {
        }
        this.J = z18;
        this.K = z12;
        if (!this.a0) {
        }
        b4Var22.e(this, !this.a0 && this.e0 == f7);
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        float dp;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j5VarArr = this.d;
            if (i12 >= j5VarArr.length) {
                break;
            }
            j5VarArr[i12].setImportantForAccessibility(i12 == i10 ? 1 : 2);
            i12++;
        }
        if (i10 == 0) {
            while (i11 < j5VarArr.length) {
                j5VarArr[i11].setTranslationY(i11 == i10 ? 0.0f : AndroidUtilities.dp(-2.0f));
                j5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
                i11++;
            }
            return;
        }
        while (i11 < j5VarArr.length) {
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i11];
            if (i11 == i10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(i11 == 0 ? 2.0f : -2.0f);
            }
            j5Var.setTranslationY(dp);
            j5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
            i11++;
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
            float f7 = this.e0;
            if (f7 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f7) * alpha));
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
        org.telegram.ui.Components.x9 x9Var = this.b;
        int measuredWidth = (x9Var.getMeasuredWidth() / 2) + x9Var.getLeft();
        int measuredHeight = (x9Var.getMeasuredHeight() / 2) + x9Var.getTop();
        b4 b4Var = this.a;
        b4Var.f();
        if (this.e0 == 0.0f) {
            b4Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        x9Var.setScaleX(b4Var.b());
        x9Var.setScaleY(b4Var.b());
        float b10 = b4Var.b();
        y3 y3Var = this.x;
        y3Var.setScaleX(b10);
        y3Var.setScaleY(b4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j3, TLRPC.FileLocation fileLocation, boolean z10) {
        long j10;
        long botVerificationIcon;
        this.E = call;
        this.M = accountInstance;
        this.Q = j3;
        this.F = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        org.telegram.ui.Components.x9 x9Var = this.b;
        org.telegram.ui.Components.i9 i9Var = this.y;
        org.telegram.ui.Components.o5 o5Var = this.s;
        if (peerId > 0) {
            this.G = this.M.getMessagesController().getUser(Long.valueOf(peerId));
            this.H = null;
            i9Var.m(this.M.getCurrentAccount(), this.G);
            j5Var.l(UserObject.getUserName(this.G), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.G);
            TLRPC.User user = this.G;
            j10 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.v;
                if (drawable == null) {
                    drawable = new c4(getContext());
                }
                this.v = drawable;
                o5Var.g(drawable, z10);
            } else if (user == null || DialogObject.getEmojiStatusDocumentId(user.emoji_status) == 0) {
                TLRPC.User user2 = this.G;
                if (user2 == null || !user2.premium) {
                    o5Var.g(null, z10);
                } else {
                    if (this.w == null) {
                        this.w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.w = new a4(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.w);
                    }
                    o5Var.g(this.w, z10);
                }
            } else {
                o5Var.j(DialogObject.getEmojiStatusDocumentId(this.G.emoji_status), z10);
            }
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false)));
            j5Var.i(o5Var);
            x9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.b0 = true;
                x9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", i9Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.G, 1);
                this.b0 = forUser != null;
                x9Var.h(forUser, "50_50", i9Var, this.G);
            }
        } else {
            j10 = 0;
            this.H = this.M.getMessagesController().getChat(Long.valueOf(-peerId));
            this.G = null;
            i9Var.k(this.M.getCurrentAccount(), this.H);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.H);
            TLRPC.Chat chat = this.H;
            if (chat != null) {
                j5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.H;
                if (chat2.verified) {
                    Drawable drawable2 = this.v;
                    if (drawable2 == null) {
                        drawable2 = new c4(getContext());
                    }
                    this.v = drawable2;
                    o5Var.g(drawable2, z10);
                } else if (chat2 == null || DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) == 0) {
                    o5Var.g(null, z10);
                } else {
                    o5Var.j(DialogObject.getEmojiStatusDocumentId(this.H.emoji_status), z10);
                }
                x9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.b0 = true;
                    x9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", i9Var, null);
                } else {
                    ImageLocation forChat = ImageLocation.getForChat(this.H, 1);
                    this.b0 = forChat != null;
                    x9Var.h(forChat, "50_50", i9Var, this.H);
                }
            }
        }
        org.telegram.ui.Components.o5 o5Var2 = this.r;
        if (botVerificationIcon != j10) {
            o5Var2.j(botVerificationIcon, z10);
            j5Var.setLeftDrawable(o5Var2);
            o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false)));
        } else {
            o5Var2.g(null, z10);
            j5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i10, int i11) {
        if (this.T != i10) {
            if (this.O) {
                this.L = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            }
            this.T = i10;
        }
        if (this.O) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            aj0 aj0Var = this.f;
            aj0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.j6.B1(aj0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.x9 getAvatarImageView() {
        return this.b;
    }

    public b4 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        if (TextUtils.isEmpty(j5Var.getText()) || !this.b0) {
            j5Var = this.d[4];
        }
        if (j5Var.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return AndroidUtilities.dp(8.0f) + j5Var.getTop() + j5Var.getTextHeight();
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
        org.telegram.ui.Components.o5 o5Var = this.s;
        if (o5Var != null) {
            o5Var.a();
        }
        org.telegram.ui.Components.o5 o5Var2 = this.r;
        if (o5Var2 != null) {
            o5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.W) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
            this.W = false;
        }
        AnimatorSet animatorSet = this.d0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.o5 o5Var = this.s;
        if (o5Var != null) {
            o5Var.b();
        }
        org.telegram.ui.Components.o5 o5Var2 = this.r;
        if (o5Var2 != null) {
            o5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.F;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? R.string.VoipMute : R.string.VoipUnmute)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
        if (z10) {
            j5VarArr[4].setTranslationY(0.0f);
        } else {
            j5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        b4 b4Var = this.a;
        if (d <= 1.5d) {
            b4Var.c(0.0d);
            return;
        }
        boolean z10 = this.W;
        x3 x3Var = this.V;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(x3Var);
        }
        if (!this.a0) {
            this.a0 = true;
            a(true, false);
        }
        b4Var.c(d);
        AndroidUtilities.runOnUIThread(x3Var, 500L);
        this.W = true;
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.x9 x9Var = this.b;
        if (x9Var.getImageReceiver().getVisible() != z10) {
            x9Var.getImageReceiver().setVisible(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f7) {
        this.e0 = f7;
        this.c.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f7);
        boolean c10 = c();
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
        if (!c10 || f7 <= 0.0f) {
            j5Var.setVisibility(8);
            for (int i10 = 0; i10 < j5VarArr.length; i10++) {
                if (TextUtils.isEmpty(j5VarArr[4].getText()) || j5VarArr[4].getLineCount() <= 1) {
                    j5VarArr[i10].setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f7);
                    j5VarArr[i10].h(0, 0);
                } else {
                    j5VarArr[i10].h(AndroidUtilities.dp(92.0f), LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(53.0f));
                    j5VarArr[i10].setFullAlpha(f7);
                    j5VarArr[i10].setTranslationX(0.0f);
                    j5VarArr[i10].invalidate();
                }
            }
        } else {
            float f10 = 1.0f - f7;
            j5Var.setTranslationX((LocaleController.isRTL ? -AndroidUtilities.dp(53.0f) : AndroidUtilities.dp(53.0f)) * f10);
            j5Var.setVisibility(0);
            j5Var.setAlpha(f7);
            j5VarArr[4].setAlpha(f10);
            org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[4];
            boolean z10 = LocaleController.isRTL;
            int dp = AndroidUtilities.dp(53.0f);
            if (!z10) {
                dp = -dp;
            }
            j5Var2.setTranslationX(dp * f7);
        }
        this.b.setAlpha(f7 == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.a0 && f7 == 0.0f);
        float f11 = 1.0f - f7;
        aj0 aj0Var = this.f;
        aj0Var.setAlpha(f11);
        float f12 = (f11 * 0.4f) + 0.6f;
        aj0Var.setScaleX(f12);
        aj0Var.setScaleY(f12);
        invalidate();
    }

    public void d(d4 d4Var) {
    }
}

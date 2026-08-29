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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class c4 extends FrameLayout {
    public ChatObject.Call A;
    public TLRPC.GroupCallParticipant B;
    public TLRPC.User C;
    public TLRPC.Chat D;
    public final Paint E;
    public boolean F;
    public boolean G;
    public int H;
    public AccountInstance I;
    public boolean J;
    public boolean K;
    public int L;
    public long M;
    public final v3 N;
    public final v3 O;
    public int P;
    public final v3 Q;
    public final v3 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final Drawable V;
    public AnimatorSet W;
    public final a4 a;
    public float a0;
    public final org.telegram.ui.Components.t9 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final org.telegram.ui.ActionBar.h5[] d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final aj0 f;
    public final xi0 h;
    public final xi0 n;
    public final org.telegram.ui.Components.n5 r;
    public final org.telegram.ui.Components.n5 s;
    public Drawable v;
    public Drawable w;
    public final w3 x;
    public final org.telegram.ui.Components.e9 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Cells.v3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Cells.v3] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.ui.Cells.v3] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.ui.Cells.v3] */
    public c4(Context context) {
        super(context);
        int i10 = 5;
        this.d = new org.telegram.ui.ActionBar.h5[5];
        final int i11 = 0;
        this.N = new Runnable(this) { // from class: org.telegram.ui.Cells.v3
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                switch (i11) {
                    case 0:
                        c4 c4Var = this.b;
                        c4Var.n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        c4 c4Var2 = this.b;
                        aj0 aj0Var = c4Var2.f;
                        xi0 xi0Var2 = c4Var2.n;
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
                        xi0Var2.P(i13 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i12);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        c4 c4Var3 = this.b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.a.c(0.0d);
                        c4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i12 = 1;
        this.O = new Runnable(this) { // from class: org.telegram.ui.Cells.v3
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i12) {
                    case 0:
                        c4 c4Var = this.b;
                        c4Var.n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        c4 c4Var2 = this.b;
                        aj0 aj0Var = c4Var2.f;
                        xi0 xi0Var2 = c4Var2.n;
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
                        xi0Var2.P(i13 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i122);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        c4 c4Var3 = this.b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.a.c(0.0d);
                        c4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.P = org.telegram.ui.ActionBar.g6.rg;
        final int i13 = 2;
        this.Q = new Runnable(this) { // from class: org.telegram.ui.Cells.v3
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i13) {
                    case 0:
                        c4 c4Var = this.b;
                        c4Var.n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        c4 c4Var2 = this.b;
                        aj0 aj0Var = c4Var2.f;
                        xi0 xi0Var2 = c4Var2.n;
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
                        xi0Var2.P(i132 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i122);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        c4 c4Var3 = this.b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.a.c(0.0d);
                        c4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.R = new Runnable(this) { // from class: org.telegram.ui.Cells.v3
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (r2) {
                    case 0:
                        c4 c4Var = this.b;
                        c4Var.n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        c4 c4Var2 = this.b;
                        aj0 aj0Var = c4Var2.f;
                        xi0 xi0Var2 = c4Var2.n;
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
                        xi0Var2.P(i132 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i122);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        c4 c4Var3 = this.b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.a.c(0.0d);
                        c4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i14 = 4;
        new Runnable(this) { // from class: org.telegram.ui.Cells.v3
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122;
                switch (i14) {
                    case 0:
                        c4 c4Var = this.b;
                        c4Var.n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f.setAnimation(xi0Var);
                        break;
                    case 1:
                        c4 c4Var2 = this.b;
                        aj0 aj0Var = c4Var2.f;
                        xi0 xi0Var2 = c4Var2.n;
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
                        xi0Var2.P(i132 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i122);
                        aj0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        c4 c4Var3 = this.b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.a.c(0.0d);
                        c4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        Paint paint = new Paint();
        this.E = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gg, false));
        this.y = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        setClipChildren(false);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(t9Var, i7.f6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
        w3 w3Var = new w3(this, context);
        this.x = w3Var;
        w3Var.setSize(AndroidUtilities.dp(26.0f));
        w3Var.setProgressColor(-1);
        w3Var.setNoProgress(false);
        boolean z11 = LocaleController.isRTL;
        addView(w3Var, i7.f6.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 11.0f, 6.0f, z11 ? 11.0f : 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var, i7.f6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 10.0f, z12 ? 67.0f : 54.0f, 0.0f));
        this.r = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        this.s = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.V = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false), PorterDuff.Mode.MULTIPLY));
        int i15 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
            if (i15 >= h5VarArr.length) {
                break;
            }
            h5VarArr[i15] = new x3(this, context, i15);
            this.d[i15].setTextSize(15);
            this.d[i15].setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (i15 == 4) {
                this.d[i15].setBuildFullLayout(true);
                this.d[i15].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.rg, false));
                View view = this.d[i15];
                boolean z13 = LocaleController.isRTL;
                addView(view, i7.f6.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 54.0f : 67.0f, 32.0f, z13 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i15 == 0) {
                    this.d[i15].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false));
                    this.d[i15].k(LocaleController.getString(R.string.Listening));
                } else if (i15 == 1) {
                    this.d[i15].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false));
                    this.d[i15].k(LocaleController.getString(R.string.Speaking));
                    this.d[i15].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i15 == 2) {
                    this.d[i15].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.sg, false));
                    this.d[i15].k(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i15 == 3) {
                    this.d[i15].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false));
                    this.d[i15].k(LocaleController.getString(R.string.WantsToSpeak));
                }
                View view2 = this.d[i15];
                boolean z14 = LocaleController.isRTL;
                addView(view2, i7.f6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 54.0f : 67.0f, 32.0f, z14 ? 67.0f : 54.0f, 0.0f));
            }
            i15++;
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var2;
        h5Var2.setMaxLines(3);
        h5Var2.setTextSize(15);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.rg, false));
        h5Var2.setVisibility(8);
        addView(h5Var2, i7.f6.d(-1, 60.0f, (LocaleController.isRTL ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        xi0 xi0Var = new xi0(R.raw.voice_outlined2, "" + R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = xi0Var;
        this.n = new xi0(R.raw.hand_1, "" + R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        aj0 aj0Var = new aj0(context);
        this.f = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.setAnimation(xi0Var);
        z f02 = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, this.P, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        aj0Var.setBackground(f02);
        aj0Var.setImportantForAccessibility(2);
        addView(aj0Var, i7.f6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        aj0Var.setOnClickListener(new a(this, i10));
        this.a = new a4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
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
    public final void a(boolean z10, boolean z11) {
        char c3;
        int w02;
        int i10;
        boolean z12;
        ArrayList arrayList;
        float f9;
        float dp;
        boolean N;
        if (this.A == null) {
            return;
        }
        int i11 = 0;
        boolean z13 = (c() && this.B.raise_hand_rating == 0) ? false : true;
        aj0 aj0Var = this.f;
        aj0Var.setEnabled(z13);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.B;
        boolean z14 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z11) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.B.lastSpeakTime;
            boolean z15 = uptimeMillis < 500;
            if (!this.T || !z15 || z14) {
                this.T = z15;
                boolean z16 = this.S;
                v3 v3Var = this.R;
                if (z16) {
                    AndroidUtilities.cancelRunOnUIThread(v3Var);
                    this.S = false;
                }
                if (this.T) {
                    AndroidUtilities.runOnUIThread(v3Var, 500 - uptimeMillis);
                    this.S = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.A.participants.f(MessageObject.getPeerId(this.B.peer));
        if (groupCallParticipant2 != null) {
            this.B = groupCallParticipant2;
        }
        boolean z17 = this.B.muted_by_you && !c();
        boolean z18 = !c() ? (!this.B.muted || (this.T && z14)) && !z17 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.T && z14);
        if (z18) {
            boolean z19 = this.B.can_self_unmute;
        }
        boolean isEmpty = TextUtils.isEmpty(this.B.about);
        this.K = false;
        v3 v3Var2 = this.Q;
        AndroidUtilities.cancelRunOnUIThread(v3Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.B;
        int i12 = 2;
        if ((!groupCallParticipant3.muted || this.T) && !z17) {
            c3 = 4;
            if (this.T && z14) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false);
                z12 = false;
                i10 = 1;
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, this.P, false);
                i10 = !isEmpty ? 4 : 0;
                this.K = true;
                z12 = false;
            }
        } else {
            boolean z20 = groupCallParticipant3.can_self_unmute;
            if (!z20 || z17) {
                boolean z21 = (z20 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z21) {
                    int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    c3 = 4;
                    long j10 = this.B.lastRaiseHandDate;
                    long j11 = elapsedRealtime2 - j10;
                    if (j10 == 0 || j11 > 5000) {
                        i10 = z17 ? 2 : !isEmpty ? 4 : 0;
                    } else {
                        AndroidUtilities.runOnUIThread(v3Var2, 5000 - j11);
                        i10 = 3;
                    }
                    z12 = z21;
                    w02 = w03;
                } else {
                    c3 = 4;
                    int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.sg, false);
                    i10 = z17 ? 2 : !isEmpty ? 4 : 0;
                    z12 = z21;
                    w02 = w04;
                }
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, this.P, false);
                this.K = true;
                i10 = !isEmpty ? 4 : 0;
                z12 = false;
                c3 = 4;
            }
        }
        boolean c6 = c();
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (!c6) {
            h5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.P, false));
        }
        boolean c10 = c();
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        if (c10) {
            if (isEmpty && !this.U) {
                if (this.C != null) {
                    h5VarArr[c3].k(LocaleController.getString(R.string.TapToAddPhotoOrBio));
                } else {
                    h5VarArr[c3].k(LocaleController.getString(R.string.TapToAddPhotoOrDescription));
                }
                h5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.P, false));
            } else if (isEmpty) {
                if (this.C != null) {
                    h5VarArr[c3].k(LocaleController.getString(R.string.TapToAddBio));
                } else {
                    h5VarArr[c3].k(LocaleController.getString(R.string.TapToAddDescription));
                }
                h5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.P, false));
            } else if (this.U) {
                h5VarArr[c3].k(LocaleController.getString(R.string.ThisIsYou));
                h5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false));
            } else {
                h5VarArr[c3].k(LocaleController.getString(R.string.TapToAddPhoto));
                h5VarArr[c3].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.P, false));
            }
            if (isEmpty) {
                h5Var.l(h5VarArr[i10].getText(), false);
                h5Var.setTextColor(h5VarArr[i10].getTextColor());
            } else {
                h5Var.l(AndroidUtilities.replaceNewLines(this.B.about), false);
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.rg, false));
            }
        } else if (isEmpty) {
            h5VarArr[c3].k("");
            h5Var.l("", false);
        } else {
            h5VarArr[c3].k(AndroidUtilities.replaceNewLines(this.B.about));
            h5Var.l("", false);
        }
        AnimatorSet animatorSet = this.W;
        boolean z22 = (animatorSet == null || (i10 == this.L && this.H == w02)) ? false : true;
        if ((!z10 || z22) && animatorSet != null) {
            animatorSet.cancel();
            this.W = null;
        }
        if (!z10 || this.H != w02 || z22) {
            if (z10) {
                arrayList = new ArrayList();
                int i13 = this.H;
                this.H = w02;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new bg.h0(this, i13, w02, i12));
                arrayList.add(ofFloat);
                if (i10 == 1) {
                    int participantVolume = ChatObject.getParticipantVolume(this.B);
                    int i14 = participantVolume / 100;
                    if (i14 != 100) {
                        h5VarArr[1].setLeftDrawable(this.V);
                        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
                        int i15 = R.string.SpeakingWithVolume;
                        if (participantVolume < 100) {
                            i14 = 1;
                        }
                        h5Var2.k(LocaleController.formatString("SpeakingWithVolume", i15, Integer.valueOf(i14)));
                    } else {
                        h5VarArr[1].setLeftDrawable((Drawable) null);
                        h5VarArr[1].k(LocaleController.getString(R.string.Speaking));
                    }
                }
                if (!c()) {
                    b(4);
                } else if (!z10 || i10 != this.L || z22) {
                    if (z10) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        Property property = View.ALPHA;
                        Property property2 = View.TRANSLATION_Y;
                        if (i10 == 0) {
                            int i16 = 0;
                            while (i16 < h5VarArr.length) {
                                arrayList.add(ObjectAnimator.ofFloat(h5VarArr[i16], (Property<org.telegram.ui.ActionBar.h5, Float>) property2, i16 == i10 ? 0.0f : AndroidUtilities.dp(-2.0f)));
                                arrayList.add(ObjectAnimator.ofFloat(h5VarArr[i16], (Property<org.telegram.ui.ActionBar.h5, Float>) property, i16 == i10 ? 1.0f : 0.0f));
                                i16++;
                            }
                            f9 = 0.0f;
                        } else {
                            f9 = 0.0f;
                            int i17 = 0;
                            while (i17 < h5VarArr.length) {
                                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i17];
                                if (i17 == i10) {
                                    dp = 0.0f;
                                } else {
                                    dp = AndroidUtilities.dp(i17 == 0 ? 2.0f : -2.0f);
                                }
                                arrayList.add(ObjectAnimator.ofFloat(h5Var3, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, dp));
                                arrayList.add(ObjectAnimator.ofFloat(h5VarArr[i17], (Property<org.telegram.ui.ActionBar.h5, Float>) property, i17 == i10 ? 1.0f : 0.0f));
                                i17++;
                            }
                        }
                    } else {
                        f9 = 0.0f;
                        b(i10);
                    }
                    this.L = i10;
                    a4 a4Var = this.a;
                    a4Var.i = i10;
                    if (!z10) {
                        a4Var.j = i10 != 1 ? 1.0f : 0.0f;
                    }
                    if (arrayList != null) {
                        AnimatorSet animatorSet2 = this.W;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                            this.W = null;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.W = animatorSet3;
                        animatorSet3.addListener(new z3(this, i10, i11));
                        this.W.playTogether(arrayList);
                        this.W.setDuration(180L);
                        this.W.start();
                    }
                    if (z10 || this.F != z18 || this.G != z12) {
                        xi0 xi0Var = this.h;
                        if (z12) {
                            N = xi0Var.N(84);
                            if (z10) {
                                xi0Var.P(83, this.O);
                            } else {
                                xi0Var.P(0, null);
                            }
                        } else {
                            aj0Var.setAnimation(xi0Var);
                            xi0Var.P(0, null);
                            if (z18 && this.G) {
                                N = xi0Var.N(21);
                            } else {
                                N = xi0Var.N(z18 ? 64 : 42);
                            }
                        }
                        if (z10) {
                            if (N) {
                                if (i10 == 3) {
                                    xi0Var.K(63);
                                } else if (z18 && this.G && !z12) {
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
                        this.F = z18;
                        this.G = z12;
                    }
                    if (!this.T) {
                        a4Var.c(0.0d);
                    }
                    a4Var.e(this, !this.T && this.a0 == f9);
                }
                f9 = 0.0f;
                a4 a4Var2 = this.a;
                a4Var2.i = i10;
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
                this.F = z18;
                this.G = z12;
                if (!this.T) {
                }
                a4Var2.e(this, !this.T && this.a0 == f9);
            }
            this.H = w02;
            aj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.g6.B1(aj0Var.getDrawable(), w02 & 620756991, true);
        }
        arrayList = null;
        if (i10 == 1) {
        }
        if (!c()) {
        }
        f9 = 0.0f;
        a4 a4Var22 = this.a;
        a4Var22.i = i10;
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
        this.F = z18;
        this.G = z12;
        if (!this.T) {
        }
        a4Var22.e(this, !this.T && this.a0 == f9);
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float dp;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            h5VarArr = this.d;
            if (i12 >= h5VarArr.length) {
                break;
            }
            h5VarArr[i12].setImportantForAccessibility(i12 == i10 ? 1 : 2);
            i12++;
        }
        if (i10 == 0) {
            while (i11 < h5VarArr.length) {
                h5VarArr[i11].setTranslationY(i11 == i10 ? 0.0f : AndroidUtilities.dp(-2.0f));
                h5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
                i11++;
            }
            return;
        }
        while (i11 < h5VarArr.length) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i11];
            if (i11 == i10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(i11 == 0 ? 2.0f : -2.0f);
            }
            h5Var.setTranslationY(dp);
            h5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
            i11++;
        }
    }

    public final boolean c() {
        long j10 = this.M;
        if (j10 > 0) {
            TLRPC.User user = this.C;
            return user != null && user.id == j10;
        }
        TLRPC.Chat chat = this.D;
        return chat != null && chat.id == (-j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.J) {
            Paint paint = this.E;
            int alpha = paint.getAlpha();
            float f9 = this.a0;
            if (f9 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f9) * alpha));
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
        org.telegram.ui.Components.t9 t9Var = this.b;
        int measuredWidth = (t9Var.getMeasuredWidth() / 2) + t9Var.getLeft();
        int measuredHeight = (t9Var.getMeasuredHeight() / 2) + t9Var.getTop();
        a4 a4Var = this.a;
        a4Var.f();
        if (this.a0 == 0.0f) {
            a4Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        t9Var.setScaleX(a4Var.b());
        t9Var.setScaleY(a4Var.b());
        float b10 = a4Var.b();
        w3 w3Var = this.x;
        w3Var.setScaleX(b10);
        w3Var.setScaleY(a4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j10, TLRPC.FileLocation fileLocation, boolean z10) {
        long j11;
        long botVerificationIcon;
        this.A = call;
        this.I = accountInstance;
        this.M = j10;
        this.B = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        org.telegram.ui.Components.t9 t9Var = this.b;
        org.telegram.ui.Components.e9 e9Var = this.y;
        org.telegram.ui.Components.n5 n5Var = this.s;
        if (peerId > 0) {
            this.C = this.I.getMessagesController().getUser(Long.valueOf(peerId));
            this.D = null;
            e9Var.m(this.I.getCurrentAccount(), this.C);
            h5Var.l(UserObject.getUserName(this.C), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.C);
            TLRPC.User user = this.C;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.v;
                if (drawable == null) {
                    drawable = new b4(getContext());
                }
                this.v = drawable;
                n5Var.g(drawable, z10);
            } else if (user == null || DialogObject.getEmojiStatusDocumentId(user.emoji_status) == 0) {
                TLRPC.User user2 = this.C;
                if (user2 == null || !user2.premium) {
                    n5Var.g(null, z10);
                } else {
                    if (this.w == null) {
                        this.w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.w = new y3(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.w);
                    }
                    n5Var.g(this.w, z10);
                }
            } else {
                n5Var.j(DialogObject.getEmojiStatusDocumentId(this.C.emoji_status), z10);
            }
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false)));
            h5Var.i(n5Var);
            t9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.U = true;
                t9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", e9Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.C, 1);
                this.U = forUser != null;
                t9Var.h(forUser, "50_50", e9Var, this.C);
            }
        } else {
            j11 = 0;
            this.D = this.I.getMessagesController().getChat(Long.valueOf(-peerId));
            this.C = null;
            e9Var.k(this.I.getCurrentAccount(), this.D);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.D);
            TLRPC.Chat chat = this.D;
            if (chat != null) {
                h5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.D;
                if (chat2.verified) {
                    Drawable drawable2 = this.v;
                    if (drawable2 == null) {
                        drawable2 = new b4(getContext());
                    }
                    this.v = drawable2;
                    n5Var.g(drawable2, z10);
                } else if (chat2 == null || DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) == 0) {
                    n5Var.g(null, z10);
                } else {
                    n5Var.j(DialogObject.getEmojiStatusDocumentId(this.D.emoji_status), z10);
                }
                t9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.U = true;
                    t9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", e9Var, null);
                } else {
                    ImageLocation forChat = ImageLocation.getForChat(this.D, 1);
                    this.U = forChat != null;
                    t9Var.h(forChat, "50_50", e9Var, this.D);
                }
            }
        }
        org.telegram.ui.Components.n5 n5Var2 = this.r;
        if (botVerificationIcon != j11) {
            n5Var2.j(botVerificationIcon, z10);
            h5Var.setLeftDrawable(n5Var2);
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false)));
        } else {
            n5Var2.g(null, z10);
            h5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i10, int i11) {
        if (this.P != i10) {
            if (this.K) {
                this.H = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            }
            this.P = i10;
        }
        if (this.K) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            aj0 aj0Var = this.f;
            aj0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.g6.B1(aj0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.t9 getAvatarImageView() {
        return this.b;
    }

    public a4 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        if (TextUtils.isEmpty(h5Var.getText()) || !this.U) {
            h5Var = this.d[4];
        }
        if (h5Var.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return AndroidUtilities.dp(8.0f) + h5Var.getTop() + h5Var.getTextHeight();
    }

    public CharSequence getName() {
        return this.c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.B;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.B;
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
        if (this.S) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
            this.S = false;
        }
        AnimatorSet animatorSet = this.W;
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
            TLRPC.GroupCallParticipant groupCallParticipant = this.B;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? R.string.VoipMute : R.string.VoipUnmute)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (z10) {
            h5VarArr[4].setTranslationY(0.0f);
        } else {
            h5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        a4 a4Var = this.a;
        if (d <= 1.5d) {
            a4Var.c(0.0d);
            return;
        }
        boolean z10 = this.S;
        v3 v3Var = this.R;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(v3Var);
        }
        if (!this.T) {
            this.T = true;
            a(true, false);
        }
        a4Var.c(d);
        AndroidUtilities.runOnUIThread(v3Var, 500L);
        this.S = true;
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.t9 t9Var = this.b;
        if (t9Var.getImageReceiver().getVisible() != z10) {
            t9Var.getImageReceiver().setVisible(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f9) {
        this.a0 = f9;
        this.c.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f9);
        boolean c3 = c();
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (!c3 || f9 <= 0.0f) {
            h5Var.setVisibility(8);
            for (int i10 = 0; i10 < h5VarArr.length; i10++) {
                if (TextUtils.isEmpty(h5VarArr[4].getText()) || h5VarArr[4].getLineCount() <= 1) {
                    h5VarArr[i10].setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f9);
                    h5VarArr[i10].h(0, 0);
                } else {
                    h5VarArr[i10].h(AndroidUtilities.dp(92.0f), LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(53.0f));
                    h5VarArr[i10].setFullAlpha(f9);
                    h5VarArr[i10].setTranslationX(0.0f);
                    h5VarArr[i10].invalidate();
                }
            }
        } else {
            float f10 = 1.0f - f9;
            h5Var.setTranslationX((LocaleController.isRTL ? -AndroidUtilities.dp(53.0f) : AndroidUtilities.dp(53.0f)) * f10);
            h5Var.setVisibility(0);
            h5Var.setAlpha(f9);
            h5VarArr[4].setAlpha(f10);
            org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[4];
            boolean z10 = LocaleController.isRTL;
            int dp = AndroidUtilities.dp(53.0f);
            if (!z10) {
                dp = -dp;
            }
            h5Var2.setTranslationX(dp * f9);
        }
        this.b.setAlpha(f9 == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.T && f9 == 0.0f);
        float f11 = 1.0f - f9;
        aj0 aj0Var = this.f;
        aj0Var.setAlpha(f11);
        float f12 = (f11 * 0.4f) + 0.6f;
        aj0Var.setScaleX(f12);
        aj0Var.setScaleY(f12);
        invalidate();
    }

    public void d(c4 c4Var) {
    }
}

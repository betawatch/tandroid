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
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class e4 extends FrameLayout {
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
    public final y3 N;
    public final y3 O;
    public int P;
    public final y3 Q;
    public final y3 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final Drawable V;
    public AnimatorSet W;
    public final c4 a;
    public float a0;
    public final org.telegram.ui.Components.o9 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final org.telegram.ui.ActionBar.h5[] d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final pi0 f;
    public final mi0 h;
    public final mi0 n;
    public final org.telegram.ui.Components.i5 r;
    public final org.telegram.ui.Components.i5 s;
    public Drawable v;
    public Drawable w;
    public final z3 x;
    public final org.telegram.ui.Components.z8 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Cells.y3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Cells.y3] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.ui.Cells.y3] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.ui.Cells.y3] */
    public e4(Context context) {
        super(context);
        int i9 = 5;
        this.d = new org.telegram.ui.ActionBar.h5[5];
        final int i10 = 0;
        this.N = new Runnable(this) { // from class: org.telegram.ui.Cells.y3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                switch (i10) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f.setAnimation(mi0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        pi0 pi0Var = e4Var2.f;
                        mi0 mi0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i11 = 0;
                        } else {
                            i11 = 240;
                            if (nextInt < 64) {
                                i12 = 240;
                                i11 = 120;
                            } else {
                                i12 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt == 98) {
                                        i12 = 540;
                                        i11 = 420;
                                    } else {
                                        i12 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i12);
                        mi0Var2.P(i12 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i11);
                        pi0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.O = new Runnable(this) { // from class: org.telegram.ui.Cells.y3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i11) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f.setAnimation(mi0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        pi0 pi0Var = e4Var2.f;
                        mi0 mi0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i12 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
                            if (nextInt < 64) {
                                i12 = 240;
                                i112 = 120;
                            } else {
                                i12 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt == 98) {
                                        i12 = 540;
                                        i112 = 420;
                                    } else {
                                        i12 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i12);
                        mi0Var2.P(i12 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i112);
                        pi0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.P = org.telegram.ui.ActionBar.f6.rg;
        final int i12 = 2;
        this.Q = new Runnable(this) { // from class: org.telegram.ui.Cells.y3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i12) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f.setAnimation(mi0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        pi0 pi0Var = e4Var2.f;
                        mi0 mi0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
                            if (nextInt < 64) {
                                i122 = 240;
                                i112 = 120;
                            } else {
                                i122 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt == 98) {
                                        i122 = 540;
                                        i112 = 420;
                                    } else {
                                        i122 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i122);
                        mi0Var2.P(i122 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i112);
                        pi0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        this.R = new Runnable(this) { // from class: org.telegram.ui.Cells.y3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f.setAnimation(mi0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        pi0 pi0Var = e4Var2.f;
                        mi0 mi0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
                            if (nextInt < 64) {
                                i122 = 240;
                                i112 = 120;
                            } else {
                                i122 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt == 98) {
                                        i122 = 540;
                                        i112 = 420;
                                    } else {
                                        i122 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i122);
                        mi0Var2.P(i122 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i112);
                        pi0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        final int i13 = 4;
        new Runnable(this) { // from class: org.telegram.ui.Cells.y3
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112;
                switch (i13) {
                    case 0:
                        e4 e4Var = this.b;
                        e4Var.n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f.setAnimation(mi0Var);
                        break;
                    case 1:
                        e4 e4Var2 = this.b;
                        pi0 pi0Var = e4Var2.f;
                        mi0 mi0Var2 = e4Var2.n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i122 = 120;
                        if (nextInt < 32) {
                            i112 = 0;
                        } else {
                            i112 = 240;
                            if (nextInt < 64) {
                                i122 = 240;
                                i112 = 120;
                            } else {
                                i122 = 420;
                                if (nextInt >= 97) {
                                    i112 = 540;
                                    if (nextInt == 98) {
                                        i122 = 540;
                                        i112 = 420;
                                    } else {
                                        i122 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i122);
                        mi0Var2.P(i122 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i112);
                        pi0Var.d();
                        break;
                    case 2:
                        this.b.a(true, true);
                        break;
                    case 3:
                        e4 e4Var3 = this.b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.a.c(0.0d);
                        e4Var3.S = false;
                        break;
                    default:
                        this.b.a(true, true);
                        break;
                }
            }
        };
        Paint paint = new Paint();
        this.E = paint;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gg, false));
        this.y = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        setClipChildren(false);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(o9Var, g7.e6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
        z3 z3Var = new z3(this, context);
        this.x = z3Var;
        z3Var.setSize(AndroidUtilities.dp(26.0f));
        z3Var.setProgressColor(-1);
        z3Var.setNoProgress(false);
        boolean z11 = LocaleController.isRTL;
        addView(z3Var, g7.e6.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 11.0f, 6.0f, z11 ? 11.0f : 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var, g7.e6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 10.0f, z12 ? 67.0f : 54.0f, 0.0f));
        this.r = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        this.s = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.V = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false), PorterDuff.Mode.MULTIPLY));
        int i14 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
            if (i14 >= h5VarArr.length) {
                break;
            }
            h5VarArr[i14] = new a4(this, context, i14);
            this.d[i14].setTextSize(15);
            this.d[i14].setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (i14 == 4) {
                this.d[i14].setBuildFullLayout(true);
                this.d[i14].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.rg, false));
                View view = this.d[i14];
                boolean z13 = LocaleController.isRTL;
                addView(view, g7.e6.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 54.0f : 67.0f, 32.0f, z13 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i14 == 0) {
                    this.d[i14].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false));
                    this.d[i14].k(LocaleController.getString(R.string.Listening));
                } else if (i14 == 1) {
                    this.d[i14].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false));
                    this.d[i14].k(LocaleController.getString(R.string.Speaking));
                    this.d[i14].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i14 == 2) {
                    this.d[i14].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.sg, false));
                    this.d[i14].k(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i14 == 3) {
                    this.d[i14].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false));
                    this.d[i14].k(LocaleController.getString(R.string.WantsToSpeak));
                }
                View view2 = this.d[i14];
                boolean z14 = LocaleController.isRTL;
                addView(view2, g7.e6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 54.0f : 67.0f, 32.0f, z14 ? 67.0f : 54.0f, 0.0f));
            }
            i14++;
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var2;
        h5Var2.setMaxLines(3);
        h5Var2.setTextSize(15);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.rg, false));
        h5Var2.setVisibility(8);
        addView(h5Var2, g7.e6.d(-1, 60.0f, (LocaleController.isRTL ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        mi0 mi0Var = new mi0(R.raw.voice_outlined2, "" + R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = mi0Var;
        this.n = new mi0(R.raw.hand_1, "" + R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        pi0 pi0Var = new pi0(context);
        this.f = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        pi0Var.setAnimation(mi0Var);
        z f02 = org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, this.P, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        pi0Var.setBackground(f02);
        pi0Var.setImportantForAccessibility(2);
        addView(pi0Var, g7.e6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        pi0Var.setOnClickListener(new a(this, i9));
        this.a = new c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10, boolean z11) {
        char c10;
        int w02;
        int i9;
        boolean z12;
        ArrayList arrayList;
        char c11;
        float f10;
        float dp;
        boolean N;
        if (this.A == null) {
            return;
        }
        char c12 = 1;
        boolean z13 = (c() && this.B.raise_hand_rating == 0) ? false : true;
        pi0 pi0Var = this.f;
        pi0Var.setEnabled(z13);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.B;
        boolean z14 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z11) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.B.lastSpeakTime;
            boolean z15 = uptimeMillis < 500;
            if (!this.T || !z15 || z14) {
                this.T = z15;
                boolean z16 = this.S;
                y3 y3Var = this.R;
                if (z16) {
                    AndroidUtilities.cancelRunOnUIThread(y3Var);
                    this.S = false;
                }
                if (this.T) {
                    AndroidUtilities.runOnUIThread(y3Var, 500 - uptimeMillis);
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
        y3 y3Var2 = this.Q;
        AndroidUtilities.cancelRunOnUIThread(y3Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.B;
        int i10 = 2;
        if ((!groupCallParticipant3.muted || this.T) && !z17) {
            c10 = 4;
            if (this.T && z14) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false);
                z12 = false;
                i9 = 1;
            } else {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, this.P, false);
                i9 = !isEmpty ? 4 : 0;
                this.K = true;
                z12 = false;
            }
        } else {
            boolean z20 = groupCallParticipant3.can_self_unmute;
            if (!z20 || z17) {
                boolean z21 = (z20 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z21) {
                    int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    c10 = 4;
                    long j10 = this.B.lastRaiseHandDate;
                    long j11 = elapsedRealtime2 - j10;
                    if (j10 == 0 || j11 > 5000) {
                        i9 = z17 ? 2 : !isEmpty ? 4 : 0;
                    } else {
                        AndroidUtilities.runOnUIThread(y3Var2, 5000 - j11);
                        i9 = 3;
                    }
                    z12 = z21;
                    w02 = w03;
                } else {
                    c10 = 4;
                    int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.sg, false);
                    i9 = z17 ? 2 : !isEmpty ? 4 : 0;
                    z12 = z21;
                    w02 = w04;
                }
            } else {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, this.P, false);
                this.K = true;
                i9 = !isEmpty ? 4 : 0;
                z12 = false;
                c10 = 4;
            }
        }
        boolean c13 = c();
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (!c13) {
            h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, this.P, false));
        }
        boolean c14 = c();
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        if (c14) {
            if (isEmpty && !this.U) {
                if (this.C != null) {
                    h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhotoOrBio));
                } else {
                    h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhotoOrDescription));
                }
                h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, this.P, false));
            } else if (isEmpty) {
                if (this.C != null) {
                    h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddBio));
                } else {
                    h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddDescription));
                }
                h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, this.P, false));
            } else if (this.U) {
                h5VarArr[c10].k(LocaleController.getString(R.string.ThisIsYou));
                h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false));
            } else {
                h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhoto));
                h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, this.P, false));
            }
            if (isEmpty) {
                h5Var.l(h5VarArr[i9].getText(), false);
                h5Var.setTextColor(h5VarArr[i9].getTextColor());
            } else {
                h5Var.l(AndroidUtilities.replaceNewLines(this.B.about), false);
                h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.rg, false));
            }
        } else if (isEmpty) {
            h5VarArr[c10].k("");
            h5Var.l("", false);
        } else {
            h5VarArr[c10].k(AndroidUtilities.replaceNewLines(this.B.about));
            h5Var.l("", false);
        }
        AnimatorSet animatorSet = this.W;
        boolean z22 = (animatorSet == null || (i9 == this.L && this.H == w02)) ? false : true;
        if ((!z10 || z22) && animatorSet != null) {
            animatorSet.cancel();
            this.W = null;
        }
        if (!z10 || this.H != w02 || z22) {
            if (z10) {
                arrayList = new ArrayList();
                int i11 = this.H;
                this.H = w02;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new kh.v4(this, i11, w02, c12 == true ? 1 : 0));
                arrayList.add(ofFloat);
                if (i9 != 1) {
                    int participantVolume = ChatObject.getParticipantVolume(this.B);
                    int i12 = participantVolume / 100;
                    if (i12 != 100) {
                        c11 = 0;
                        h5VarArr[1].setLeftDrawable(this.V);
                        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
                        int i13 = R.string.SpeakingWithVolume;
                        if (participantVolume < 100) {
                            i12 = 1;
                        }
                        h5Var2.k(LocaleController.formatString("SpeakingWithVolume", i13, Integer.valueOf(i12)));
                    } else {
                        c11 = 0;
                        h5VarArr[1].setLeftDrawable((Drawable) null);
                        h5VarArr[1].k(LocaleController.getString(R.string.Speaking));
                    }
                } else {
                    c11 = 0;
                }
                if (!c()) {
                    b(4);
                } else if (!z10 || i9 != this.L || z22) {
                    if (z10) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        Property property = View.ALPHA;
                        Property property2 = View.TRANSLATION_Y;
                        if (i9 == 0) {
                            int i14 = 0;
                            while (i14 < h5VarArr.length) {
                                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i14];
                                float[] fArr = new float[1];
                                fArr[c11] = i14 == i9 ? 0.0f : AndroidUtilities.dp(-2.0f);
                                arrayList.add(ObjectAnimator.ofFloat(h5Var3, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, fArr));
                                org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[i14];
                                float[] fArr2 = new float[1];
                                fArr2[c11] = i14 == i9 ? 1.0f : 0.0f;
                                arrayList.add(ObjectAnimator.ofFloat(h5Var4, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr2));
                                i14++;
                            }
                            f10 = 0.0f;
                        } else {
                            f10 = 0.0f;
                            int i15 = 0;
                            while (i15 < h5VarArr.length) {
                                org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[i15];
                                if (i15 == i9) {
                                    dp = 0.0f;
                                } else {
                                    dp = AndroidUtilities.dp(i15 == 0 ? 2.0f : -2.0f);
                                }
                                float[] fArr3 = new float[1];
                                fArr3[c11] = dp;
                                arrayList.add(ObjectAnimator.ofFloat(h5Var5, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, fArr3));
                                org.telegram.ui.ActionBar.h5 h5Var6 = h5VarArr[i15];
                                float[] fArr4 = new float[1];
                                fArr4[c11] = i15 == i9 ? 1.0f : 0.0f;
                                arrayList.add(ObjectAnimator.ofFloat(h5Var6, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr4));
                                i15++;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                        b(i9);
                    }
                    this.L = i9;
                    c4 c4Var = this.a;
                    c4Var.i = i9;
                    if (!z10) {
                        c4Var.j = i9 != 1 ? 1.0f : 0.0f;
                    }
                    if (arrayList != null) {
                        AnimatorSet animatorSet2 = this.W;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                            this.W = null;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.W = animatorSet3;
                        animatorSet3.addListener(new mh.o2(this, i9, i10));
                        this.W.playTogether(arrayList);
                        this.W.setDuration(180L);
                        this.W.start();
                    }
                    if (z10 || this.F != z18 || this.G != z12) {
                        mi0 mi0Var = this.h;
                        if (z12) {
                            N = mi0Var.N(84);
                            if (z10) {
                                mi0Var.P(83, this.O);
                            } else {
                                mi0Var.P(0, null);
                            }
                        } else {
                            pi0Var.setAnimation(mi0Var);
                            mi0Var.P(0, null);
                            if (z18 && this.G) {
                                N = mi0Var.N(21);
                            } else {
                                N = mi0Var.N(z18 ? 64 : 42);
                            }
                        }
                        if (z10) {
                            if (N) {
                                if (i9 == 3) {
                                    mi0Var.K(63);
                                } else if (z18 && this.G && !z12) {
                                    mi0Var.K(0);
                                } else if (z18) {
                                    mi0Var.K(43);
                                } else {
                                    mi0Var.K(21);
                                }
                            }
                            pi0Var.d();
                        } else {
                            mi0Var.L(mi0Var.f - 1, false, true);
                            pi0Var.invalidate();
                        }
                        this.F = z18;
                        this.G = z12;
                    }
                    if (!this.T) {
                        c4Var.c(0.0d);
                    }
                    c4Var.e(this, !this.T && this.a0 == f10);
                }
                f10 = 0.0f;
                c4 c4Var2 = this.a;
                c4Var2.i = i9;
                if (!z10) {
                }
                if (arrayList != null) {
                }
                if (z10) {
                }
                mi0 mi0Var2 = this.h;
                if (z12) {
                }
                if (z10) {
                }
                this.F = z18;
                this.G = z12;
                if (!this.T) {
                }
                c4Var2.e(this, !this.T && this.a0 == f10);
            }
            this.H = w02;
            pi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.f6.B1(pi0Var.getDrawable(), w02 & 620756991, true);
        }
        arrayList = null;
        if (i9 != 1) {
        }
        if (!c()) {
        }
        f10 = 0.0f;
        c4 c4Var22 = this.a;
        c4Var22.i = i9;
        if (!z10) {
        }
        if (arrayList != null) {
        }
        if (z10) {
        }
        mi0 mi0Var22 = this.h;
        if (z12) {
        }
        if (z10) {
        }
        this.F = z18;
        this.G = z12;
        if (!this.T) {
        }
        c4Var22.e(this, !this.T && this.a0 == f10);
    }

    public final void b(int i9) {
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float dp;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            h5VarArr = this.d;
            if (i11 >= h5VarArr.length) {
                break;
            }
            h5VarArr[i11].setImportantForAccessibility(i11 == i9 ? 1 : 2);
            i11++;
        }
        if (i9 == 0) {
            while (i10 < h5VarArr.length) {
                h5VarArr[i10].setTranslationY(i10 == i9 ? 0.0f : AndroidUtilities.dp(-2.0f));
                h5VarArr[i10].setAlpha(i10 == i9 ? 1.0f : 0.0f);
                i10++;
            }
            return;
        }
        while (i10 < h5VarArr.length) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i10];
            if (i10 == i9) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(i10 == 0 ? 2.0f : -2.0f);
            }
            h5Var.setTranslationY(dp);
            h5VarArr[i10].setAlpha(i10 == i9 ? 1.0f : 0.0f);
            i10++;
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
            float f10 = this.a0;
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
        org.telegram.ui.Components.o9 o9Var = this.b;
        int measuredWidth = (o9Var.getMeasuredWidth() / 2) + o9Var.getLeft();
        int measuredHeight = (o9Var.getMeasuredHeight() / 2) + o9Var.getTop();
        c4 c4Var = this.a;
        c4Var.f();
        if (this.a0 == 0.0f) {
            c4Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        o9Var.setScaleX(c4Var.b());
        o9Var.setScaleY(c4Var.b());
        float b10 = c4Var.b();
        z3 z3Var = this.x;
        z3Var.setScaleX(b10);
        z3Var.setScaleY(c4Var.b());
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
        org.telegram.ui.Components.o9 o9Var = this.b;
        org.telegram.ui.Components.z8 z8Var = this.y;
        org.telegram.ui.Components.i5 i5Var = this.s;
        if (peerId > 0) {
            this.C = this.I.getMessagesController().getUser(Long.valueOf(peerId));
            this.D = null;
            z8Var.m(this.I.getCurrentAccount(), this.C);
            h5Var.l(UserObject.getUserName(this.C), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.C);
            TLRPC.User user = this.C;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.v;
                if (drawable == null) {
                    drawable = new d4(getContext());
                }
                this.v = drawable;
                i5Var.g(drawable, z10);
            } else if (user == null || DialogObject.getEmojiStatusDocumentId(user.emoji_status) == 0) {
                TLRPC.User user2 = this.C;
                if (user2 == null || !user2.premium) {
                    i5Var.g(null, z10);
                } else {
                    if (this.w == null) {
                        this.w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.w = new b4(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.w);
                    }
                    i5Var.g(this.w, z10);
                }
            } else {
                i5Var.j(DialogObject.getEmojiStatusDocumentId(this.C.emoji_status), z10);
            }
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false)));
            h5Var.i(i5Var);
            o9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.U = true;
                o9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", z8Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.C, 1);
                this.U = forUser != null;
                o9Var.h(forUser, "50_50", z8Var, this.C);
            }
        } else {
            j11 = 0;
            this.D = this.I.getMessagesController().getChat(Long.valueOf(-peerId));
            this.C = null;
            z8Var.k(this.I.getCurrentAccount(), this.D);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.D);
            TLRPC.Chat chat = this.D;
            if (chat != null) {
                h5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.D;
                if (chat2.verified) {
                    Drawable drawable2 = this.v;
                    if (drawable2 == null) {
                        drawable2 = new d4(getContext());
                    }
                    this.v = drawable2;
                    i5Var.g(drawable2, z10);
                } else if (chat2 == null || DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) == 0) {
                    i5Var.g(null, z10);
                } else {
                    i5Var.j(DialogObject.getEmojiStatusDocumentId(this.D.emoji_status), z10);
                }
                o9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.U = true;
                    o9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", z8Var, null);
                } else {
                    ImageLocation forChat = ImageLocation.getForChat(this.D, 1);
                    this.U = forChat != null;
                    o9Var.h(forChat, "50_50", z8Var, this.D);
                }
            }
        }
        org.telegram.ui.Components.i5 i5Var2 = this.r;
        if (botVerificationIcon != j11) {
            i5Var2.j(botVerificationIcon, z10);
            h5Var.setLeftDrawable(i5Var2);
            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false)));
        } else {
            i5Var2.g(null, z10);
            h5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i9, int i10) {
        if (this.P != i9) {
            if (this.K) {
                this.H = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            }
            this.P = i9;
        }
        if (this.K) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            pi0 pi0Var = this.f;
            pi0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.f6.B1(pi0Var.getDrawable(), i10 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.o9 getAvatarImageView() {
        return this.b;
    }

    public c4 getAvatarWavesDrawable() {
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
        org.telegram.ui.Components.i5 i5Var = this.s;
        if (i5Var != null) {
            i5Var.a();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.r;
        if (i5Var2 != null) {
            i5Var2.a();
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
        org.telegram.ui.Components.i5 i5Var = this.s;
        if (i5Var != null) {
            i5Var.b();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.r;
        if (i5Var2 != null) {
            i5Var2.b();
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
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30));
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
        c4 c4Var = this.a;
        if (d <= 1.5d) {
            c4Var.c(0.0d);
            return;
        }
        boolean z10 = this.S;
        y3 y3Var = this.R;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(y3Var);
        }
        if (!this.T) {
            this.T = true;
            a(true, false);
        }
        c4Var.c(d);
        AndroidUtilities.runOnUIThread(y3Var, 500L);
        this.S = true;
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.o9 o9Var = this.b;
        if (o9Var.getImageReceiver().getVisible() != z10) {
            o9Var.getImageReceiver().setVisible(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        this.a0 = f10;
        this.c.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f10);
        boolean c10 = c();
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (!c10 || f10 <= 0.0f) {
            h5Var.setVisibility(8);
            for (int i9 = 0; i9 < h5VarArr.length; i9++) {
                if (TextUtils.isEmpty(h5VarArr[4].getText()) || h5VarArr[4].getLineCount() <= 1) {
                    h5VarArr[i9].setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f10);
                    h5VarArr[i9].h(0, 0);
                } else {
                    h5VarArr[i9].h(AndroidUtilities.dp(92.0f), LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(53.0f));
                    h5VarArr[i9].setFullAlpha(f10);
                    h5VarArr[i9].setTranslationX(0.0f);
                    h5VarArr[i9].invalidate();
                }
            }
        } else {
            float f11 = 1.0f - f10;
            h5Var.setTranslationX((LocaleController.isRTL ? -AndroidUtilities.dp(53.0f) : AndroidUtilities.dp(53.0f)) * f11);
            h5Var.setVisibility(0);
            h5Var.setAlpha(f10);
            h5VarArr[4].setAlpha(f11);
            org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[4];
            boolean z10 = LocaleController.isRTL;
            int dp = AndroidUtilities.dp(53.0f);
            if (!z10) {
                dp = -dp;
            }
            h5Var2.setTranslationX(dp * f10);
        }
        this.b.setAlpha(f10 == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.T && f10 == 0.0f);
        float f12 = 1.0f - f10;
        pi0 pi0Var = this.f;
        pi0Var.setAlpha(f12);
        float f13 = (f12 * 0.4f) + 0.6f;
        pi0Var.setScaleX(f13);
        pi0Var.setScaleY(f13);
        invalidate();
    }

    public void d(e4 e4Var) {
    }
}

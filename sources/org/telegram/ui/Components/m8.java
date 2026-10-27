package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m8 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static m8 Y0;
    public static final float[] Z0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public String A0;
    public AnimatorSet B0;
    public int C0;
    public int D0;
    public final fi.d E;
    public final int E0;
    public final fi.d F;
    public final LaunchActivity F0;
    public final s4.z G;
    public int G0;
    public final c8 H;
    public float H0;
    public final d8 I;
    public int I0;
    public final u7 J;
    public long J0;
    public final v7 K;
    public long K0;
    public final d8 L;
    public boolean L0;
    public final org.telegram.ui.ActionBar.w0 M;
    public float M0;
    public final org.telegram.ui.sr N;
    public final m.g3 N0;
    public org.telegram.ui.ActionBar.g1 O;
    public org.telegram.ui.ej O0;
    public final w7 P;
    public long P0;
    public final boolean Q;
    public float Q0;
    public final j90 R;
    public final org.telegram.ui.Cells.b2 R0;
    public final e8 S;
    public ValueAnimator S0;
    public final org.telegram.ui.ActionBar.b6 T;
    public int T0;
    public final org.telegram.ui.ActionBar.w0 U;
    public boolean U0;
    public final dd V;
    public int V0;
    public final org.telegram.ui.ActionBar.c1 W;
    public int W0;
    public boolean X;
    public int X0;
    public final org.telegram.ui.ActionBar.g1[] Y;
    public final TextView Z;
    public final org.telegram.ui.ActionBar.w0 a0;
    public final View b;
    public final org.telegram.ui.ActionBar.g1 b0;
    public final b8 c;
    public final org.telegram.ui.ActionBar.g1 c0;
    public final View d;
    public final org.telegram.ui.ActionBar.g1 d0;
    public final View e;
    public final org.telegram.ui.ActionBar.g1 e0;
    public boolean f;
    public final ImageView f0;
    public final eh0 g0;
    public boolean h;
    public final s7 h0;
    public final y9 i0;
    public final org.telegram.ui.ActionBar.w0 j0;
    public final org.telegram.ui.ActionBar.w0 k0;
    public boolean l0;
    public final View[] m0;
    public final x7 n;
    public final o1.j n0;
    public long o0;
    public boolean p0;
    public boolean q0;
    public final s4.c0 r;
    public int r0;
    public final l8 s;
    public int s0;
    public final boolean t0;
    public final boolean u0;
    public final LinearLayout v;
    public MessagesController.SavedMusicList v0;
    public final TextView w;
    public ArrayList w0;
    public final TextView x;
    public MessageObject x0;
    public final s7 y;
    public boolean y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(Activity activity, final org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, (Context) activity, u6Var, true);
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.User user;
        int i10 = 1;
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[6];
        this.Y = g1VarArr;
        View[] viewArr = new View[5];
        this.m0 = viewArr;
        this.q0 = true;
        this.r0 = -1;
        this.z0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.H0 = -1.0f;
        this.M0 = -1.0f;
        int i11 = 9;
        this.N0 = new m.g3(this, i11);
        this.R0 = new org.telegram.ui.Cells.b2(this);
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.F0 = (LaunchActivity) activity;
        this.E0 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.musicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.moreMusicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.musicIdsLoaded);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.messagePlayingSpeedChanged);
        a8 a8Var = new a8(this, activity);
        this.containerView = a8Var;
        int i12 = 0;
        a8Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        b8 b8Var = new b8(this, activity, u6Var, i12);
        this.c = b8Var;
        b8Var.setBackgroundColor(0);
        b8Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i14 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, i14, u6Var);
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, org.telegram.ui.ActionBar.y6.Ni, u6Var);
        org.telegram.ui.ActionBar.f7.m(b8Var, 5, i14, u6Var);
        org.telegram.ui.ActionBar.f7.m(b8Var, 6, org.telegram.ui.ActionBar.y6.Pi, u6Var);
        b8Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z l4 = b8Var.l();
        l4.setLayoutParams(kb1.i(-1, -1, 119));
        View view = new View(activity);
        this.b = view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, view, u6Var);
        b8Var.addView(view, 0, kb1.i(-1, -1, 119));
        view.setAlpha(0.0f);
        b8Var.setAlpha(0.0f);
        b8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, i11));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view3, u6Var);
        s7 s7Var = new s7(this, activity, 2);
        this.y = s7Var;
        c8 c8Var = new c8(this, activity);
        this.H = c8Var;
        s7Var.addView(c8Var, kb1.h(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        d8 d8Var = new d8(this, activity, activity, i12);
        this.I = d8Var;
        s7Var.addView(d8Var, kb1.h(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        d8 d8Var2 = new d8(this, activity, activity, i10);
        this.L = d8Var2;
        s7Var.addView(d8Var2, kb1.h(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        e8 e8Var = new e8(this, activity, u6Var);
        this.S = e8Var;
        e8Var.setLineWidth(4);
        e8Var.setDelegate(new r7(this));
        e8Var.setReportChanges(true);
        s7Var.addView(e8Var, kb1.h(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.j jVar = new o1.j(new ac.a(0.0f));
        o1.k kVar = new o1.k();
        kVar.b(750.0f);
        kVar.a(1.0f);
        jVar.u = kVar;
        jVar.b(new n7(this, i12));
        this.n0 = jVar;
        j90 j90Var = new j90(activity);
        this.R = j90Var;
        j90Var.setVisibility(4);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.Ti, j90Var, u6Var);
        j90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Vi));
        s7Var.addView(j90Var, kb1.h(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(activity);
        this.T = b6Var;
        b6Var.setTextSize(12);
        b6Var.l("0:00", false);
        int i15 = org.telegram.ui.ActionBar.y6.Si;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i15, u6Var);
        b6Var.setImportantForAccessibility(2);
        s7Var.addView(b6Var, kb1.h(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.Z = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i15, u6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        s7Var.addView(textView, kb1.h(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        int themedColor = getThemedColor(i15);
        final int i16 = 0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor, false, u6Var);
        this.U = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new c7(this, i16));
        dd ddVar = new dd();
        this.V = ddVar;
        w0Var.setIcon(ddVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), u6Var);
        this.W = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new d7(this, i16));
        g1VarArr[0] = w0Var.e(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        g1VarArr[1] = w0Var.e(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        int i17 = 2;
        g1VarArr[2] = w0Var.e(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        g1VarArr[3] = w0Var.e(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        g1VarArr[4] = w0Var.e(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        g1VarArr[5] = w0Var.e(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            w0Var.setPadding(0, 1, 0, 0);
        }
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(400.0f));
        w0Var.setShowedFromBottom(true);
        s7Var.addView(w0Var, kb1.h(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new org.telegram.ui.ActionBar.u1(26, this, fArr));
        w0Var.setOnLongClickListener(new di.l2(i17, this, u6Var));
        L0(false);
        s7 s7Var2 = new s7(this, activity, i16);
        s7Var.addView(s7Var2, kb1.h(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, u6Var);
        this.a0 = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i18 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i18);
        w0Var2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(w0Var2, g02, null, N, u6Var);
        s7Var2.addView(w0Var2, kb1.i(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e7
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i16) {
                    case 0:
                        m8 m8Var = this.b;
                        m8Var.O0();
                        m8Var.a0.U(null, null);
                        break;
                    default:
                        m8.K(this.b, view4);
                        break;
                }
            }
        });
        this.b0 = w0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.c0 = w0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.d0 = w0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.e0 = w0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        w0Var2.setShowedFromBottom(true);
        w0Var2.setDelegate(new c7(this, i10));
        int i19 = org.telegram.ui.ActionBar.y6.Wi;
        int themedColor2 = getThemedColor(i19);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        u7 u7Var = new u7(this, activity, scaledTouchSlop);
        this.J = u7Var;
        viewArr[1] = u7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        u7Var.setScaleType(scaleType);
        u7Var.f(R.raw.player_prev, 20, 20, null);
        u7Var.h(themedColor2, "Triangle 3");
        u7Var.h(themedColor2, "Triangle 4");
        u7Var.h(themedColor2, "Rectangle 4");
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i18);
        u7Var.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(u7Var, g03, null, N2, u6Var);
        s7Var2.addView(u7Var, kb1.i(48, 48, 51));
        u7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        eh0 eh0Var = new eh0(28);
        this.g0 = eh0Var;
        imageView.setImageDrawable(eh0Var);
        eh0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        org.telegram.ui.ActionBar.f7.t(imageView, i19, u6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(24.0f));
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i18);
        imageView.setBackground(g04);
        org.telegram.ui.ActionBar.f7.k(imageView, g04, null, N3, u6Var);
        s7Var2.addView(imageView, kb1.i(48, 48, 51));
        imageView.setOnClickListener(new bh.f(10));
        v7 v7Var = new v7(this, activity, scaledTouchSlop);
        this.K = v7Var;
        viewArr[3] = v7Var;
        v7Var.setScaleType(scaleType);
        v7Var.f(R.raw.player_prev, 20, 20, null);
        v7Var.h(themedColor2, "Triangle 3");
        v7Var.h(themedColor2, "Triangle 4");
        v7Var.h(themedColor2, "Rectangle 4");
        v7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f));
        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i18);
        v7Var.setBackground(g05);
        org.telegram.ui.ActionBar.f7.k(v7Var, g05, null, N4, u6Var);
        s7Var2.addView(v7Var, kb1.i(48, 48, 51));
        v7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor2, false, u6Var);
        this.M = w0Var3;
        viewArr[4] = w0Var3;
        org.telegram.ui.sr srVar = new org.telegram.ui.sr(activity, R.drawable.ic_ab_other, u6Var);
        this.N = srVar;
        w0Var3.setIcon(srVar);
        w0Var3.setLongClickEnabled(false);
        w0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i20 = 1;
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i18);
        w0Var3.setBackground(g06);
        org.telegram.ui.ActionBar.f7.k(w0Var3, g06, null, N5, u6Var);
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e7
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        m8 m8Var = this.b;
                        m8Var.O0();
                        m8Var.a0.U(null, null);
                        break;
                    default:
                        m8.K(this.b, view4);
                        break;
                }
            }
        });
        s7Var2.addView(w0Var3, kb1.i(48, 48, 51));
        w7 w7Var = new w7(this, activity, 0);
        this.P = w7Var;
        this.Q = true;
        try {
            w7Var.setRouteSelector(e6.a.c(activity).a());
        } catch (Exception e) {
            FileLog.e(e);
            this.Q = false;
        }
        this.P.setVisibility(4);
        org.telegram.ui.sr srVar2 = this.N;
        if (srVar2 != null) {
            srVar2.a(c5.d.u());
        }
        this.M.setShowedFromBottom(true);
        this.M.setDelegate(new c7(this, i17));
        this.M.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i21 = 8;
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, kb1.g(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.d(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.W5, u6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, kb1.r(-2, -2));
        TextView textView2 = new TextView(activity);
        this.w = textView2;
        int i22 = org.telegram.ui.ActionBar.y6.X5;
        org.telegram.ui.ActionBar.f7.V(textView2, i22, u6Var);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, kb1.x(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.x = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i22, u6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, kb1.x(-2, -2, 17, 0, 6, 0, 0));
        x7 x7Var = new x7(this, activity);
        this.n = x7Var;
        x7Var.setClipToPadding(false);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        this.r = c0Var;
        x7Var.setLayoutManager(c0Var);
        x7Var.setHorizontalScrollBarEnabled(false);
        x7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(x7Var, kb1.i(-1, -1, 51));
        l8 l8Var = new l8(this, activity);
        this.s = l8Var;
        x7Var.setAdapter(l8Var);
        org.telegram.ui.ActionBar.f7.m(x7Var, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        x7Var.setOnItemClickListener(new p7(0));
        x7Var.setOnItemLongClickListener(new c7(this, 3));
        x7Var.setOnScrollListener(new ai.b(this, 23));
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.setRoundRadius(24);
        this.E = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i23 = 0;
        spannableStringBuilder.setSpan(new zq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q7
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i23) {
                    case 0:
                        m8.B(this.b, u6Var);
                        break;
                    default:
                        m8.A(this.b, u6Var);
                        break;
                }
            }
        });
        this.y.addView(dVar, kb1.h(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i24 = 1;
        fi.d dVar2 = new fi.d(activity, u6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.F = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q7
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i24) {
                    case 0:
                        m8.B(this.b, u6Var);
                        break;
                    default:
                        m8.A(this.b, u6Var);
                        break;
                }
            }
        });
        this.y.addView(dVar2, kb1.h(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.v0 = savedMusicList;
        boolean z10 = savedMusicList != null;
        this.t0 = z10;
        this.c.m0 = z10;
        this.u0 = z0();
        this.w0 = MediaController.getInstance().getPlaylist();
        if (z0()) {
            zVar = l4;
            this.j0 = zVar.a(8, R.drawable.msg_add);
        } else {
            zVar = l4;
        }
        org.telegram.ui.ActionBar.w0 a2 = zVar.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 5);
        this.k0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i25 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.V(searchField, i25, u6Var);
        org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Si, u6Var);
        org.telegram.ui.ActionBar.f7.m(searchField, 30, i25, u6Var);
        if (z10) {
            x7Var.u1();
            setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, u6Var));
            this.c.setAlpha(1.0f);
            this.b.setAlpha(0.0f);
            this.R0.set(this.c, Float.valueOf(0.0f));
        }
        boolean z11 = this.w0.size() > 1;
        l8Var.h = z11;
        if (z11) {
            x7Var.setVisibility(0);
            x7Var.setTranslationY(0.0f);
        } else {
            x7Var.setVisibility(8);
            x7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        l8Var.l();
        this.c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.v0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.v0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(MessagesController.getInstance(this.currentAccount), dialogId);
                if (m10 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(m10.user_id))) != null) {
                    this.c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == UserObject.ANONYMOUS) {
                    this.c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.c.setTitle(chat.title);
                }
            }
        }
        if (z0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.z zVar2 = new s4.z(new y7(this));
            this.G = zVar2;
            zVar2.h(x7Var);
        }
        this.containerView.addView(this.y, kb1.i(-1, ((z0() || this.y0) ? 0 : 52) + 179, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.y.getLayoutParams()).height = AndroidUtilities.dp(((z0() || this.y0) ? 0 : 52) + 179);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((z0() || this.y0) ? 0 : 52));
        this.containerView.addView(this.d, kb1.g(3.0f, -1));
        this.containerView.addView(this.c);
        s7 s7Var3 = new s7(this, activity, 1);
        this.h0 = s7Var3;
        s7Var3.setAlpha(0.0f);
        s7Var3.setVisibility(4);
        getContainer().addView(s7Var3);
        y9 y9Var = new y9(activity);
        this.i0 = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        y9Var.setScaleX(0.9f);
        y9Var.setScaleY(0.9f);
        s7Var3.addView(y9Var, kb1.h(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        Q0(false);
        N0();
        if (this.h && l8Var.h() == 0) {
            i21 = 0;
        }
        linearLayout.setVisibility(i21);
        K0();
    }

    public static void A(m8 m8Var, org.telegram.ui.ActionBar.u6 u6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || m8Var.F0 == null) {
            return;
        }
        m8Var.C0(playingMessageObject, false, new k5(1), false);
        m8Var.F0(false);
        org.telegram.messenger.t.q(R.string.AudioSaveToMyProfileUnsaved, new wc((FrameLayout) m8Var.containerView, u6Var), R.raw.ic_delete, 36);
    }

    public static void B(m8 m8Var, org.telegram.ui.ActionBar.u6 u6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || m8Var.F0 == null) {
            return;
        }
        m8Var.C0(playingMessageObject, true, new k5(1), false);
        m8Var.F0(true);
        org.telegram.messenger.t.q(R.string.AudioSaveToMyProfileSaved, new wc((FrameLayout) m8Var.containerView, u6Var), R.raw.saved_messages, 36);
    }

    public static void C(m8 m8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.d3.t((FrameLayout) m8Var.containerView, m8Var.resourcesProvider, tL_error, false);
    }

    public static void D(m8 m8Var, float[] fArr) {
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= fArr.length) {
                i10 = -1;
                break;
            } else if (playbackSpeed - 0.1f <= fArr[i10]) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        if (i11 >= fArr.length) {
            i11 = 0;
        }
        MediaController.getInstance().setPlaybackSpeed(true, fArr[i11]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - m8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && m8Var.containerView != null) {
                org.telegram.ui.ej ejVar = new org.telegram.ui.ej(5, 1, m8Var.getContext(), null, z10);
                m8Var.O0 = ejVar;
                ejVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                m8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                m8Var.y.addView(m8Var.O0, kb1.h(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                m8Var.O0.f(m8Var.U, true);
            }
        }
        m8Var.P0 = currentTimeMillis;
    }

    public static /* synthetic */ void F(m8 m8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = m8Var.F0;
        int i10 = UserConfig.selectedAccount;
        int i11 = m8Var.currentAccount;
        if (i10 != i11) {
            launchActivity.P0(i11);
        }
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(m8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(m8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.v0(new org.telegram.ui.wn(bundle), false, false);
        m8Var.dismiss();
    }

    public static /* synthetic */ void G(m8 m8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(m8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(m8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(m8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= TLObject.FLAG_21;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.id == j10) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(m8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(m8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static /* synthetic */ void H(m8 m8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new l7(m8Var, tL_error, 3));
                return;
            }
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i11 = 0;
        while (true) {
            if (i11 >= messages_messages.messages.size()) {
                message = null;
                break;
            } else {
                if (messages_messages.messages.get(i11).id == i10) {
                    message = messages_messages.messages.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (message != null) {
            m8Var.C0(new MessageObject(m8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new o7(m8Var, 1));
        }
    }

    public static void I(m8 m8Var, MessageObject messageObject, l80 l80Var) {
        ArrayList<MessageObject> l4;
        int i10;
        long clientUserId = UserConfig.getInstance(m8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = m8Var.currentAccount;
        if (i11 != i12) {
            m8Var.F0.P0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() >= 0) {
            l4 = org.telegram.messenger.t.l(messageObject);
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                i10 = 36;
                l80Var.u();
                org.telegram.messenger.t.q(R.string.AudioSaveToSavedMessagesSaved, new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider), R.raw.saved_messages, i10);
            }
            l4 = null;
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
        }
        if (l4 != null) {
            SendMessagesHelper.getInstance(m8Var.currentAccount).sendMessage(l4, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(m8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, m8Var.v0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R != null) {
            i10 = 36;
            wc.b0(R).R(R.raw.forward, 36, clientUserId == UserConfig.getInstance(m8Var.currentAccount).getClientUserId() ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : clientUserId > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId))).j();
        } else {
            i10 = 36;
        }
        l80Var.u();
        org.telegram.messenger.t.q(R.string.AudioSaveToSavedMessagesSaved, new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void J(m8 m8Var) {
        FrameLayout frameLayout = (FrameLayout) m8Var.containerView;
        org.telegram.ui.ActionBar.u6 u6Var = m8Var.resourcesProvider;
        new wc(frameLayout, u6Var).o(vc.F, u6Var).j();
    }

    public static void K(m8 m8Var, View view) {
        w7 w7Var = m8Var.P;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        l80 G = l80.G(m8Var.container, m8Var.resourcesProvider, view, true);
        l80 u02 = m8Var.u0(G, playingMessageObject);
        if (!m8Var.z0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new hi.o2(G, u02, 7), !m8Var.y0);
            if (!m8Var.y0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new j7(m8Var, G, 0), !m8Var.y0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new j7(m8Var, G, 1), !m8Var.y0);
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new j7(m8Var, G, 2), playingMessageObject.getId() > 0);
        if (m8Var.Q) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.e, G.d, false, false);
            G.d(g1Var);
            m8Var.O = g1Var;
            g1Var.j(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            m8Var.O.setOnClickListener(new org.telegram.ui.ActionBar.u1(27, m8Var, G));
            AndroidUtilities.removeFromParent(w7Var);
            m8Var.O.addView(w7Var, 0, kb1.g(-1.0f, -1));
            m8Var.updateColors();
        }
        G.m(R.drawable.msg_delete, new j7(m8Var, G, 3), LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), m8Var.z0(), true);
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static /* synthetic */ void L(m8 m8Var, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            e2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(m8Var.currentAccount).getInputPeer(UserConfig.getInstance(m8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.z7(12, m8Var, e2Var));
    }

    public static void P(m8 m8Var) {
        View view = m8Var.d;
        b8 b8Var = m8Var.c;
        x7 x7Var = m8Var.n;
        if (x7Var.getChildCount() <= 0) {
            int paddingTop = x7Var.getPaddingTop();
            m8Var.z0 = paddingTop;
            x7Var.setTopGlowOffset(paddingTop);
            m8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = x7Var.getChildAt(0);
        wl0 wl0Var = (wl0) x7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.w ? childAt.getTop() : childAt.getBottom();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        boolean z11 = top <= AndroidUtilities.dp(12.0f);
        if ((z11 && b8Var.getTag() == null) || (!z11 && b8Var.getTag() != null)) {
            b8Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = m8Var.B0;
            if (animatorSet != null) {
                animatorSet.cancel();
                m8Var.B0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            m8Var.B0 = animatorSet2;
            int i10 = 2;
            if (m8Var.t0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var, m8Var.R0, z11 ? 1.0f : 0.0f);
                View view2 = m8Var.b;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(b8Var, (Property<b8, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            m8Var.B0.setDuration(320L);
            m8Var.B0.setInterpolator(ds.h);
            m8Var.B0.addListener(new z7(m8Var, i10));
            m8Var.B0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x7Var.getLayoutParams();
        int w10 = org.telegram.ui.d3.w(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (m8Var.z0 != w10) {
            m8Var.z0 = w10;
            x7Var.setTopGlowOffset((w10 - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            m8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        float min = m8Var.backgroundPaddingTop + ((int) (x7Var.getTranslationY() + ((m8Var.z0 - m8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - m8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2)) : 1.0f;
        m8Var.M0 = min;
        if (min <= 0.5f && i0.a.h(m8Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != m8Var.L0) {
            m8Var.L0 = z10;
            AndroidUtilities.setLightStatusBar(m8Var, z10);
        }
    }

    public static /* synthetic */ void m(m8 m8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = m8Var.v0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!m8Var.v0.list.isEmpty()) {
                NotificationCenter.getInstance(m8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, m8Var.v0);
            } else {
                MediaController.getInstance().cleanup();
                m8Var.dismiss();
            }
        }
    }

    public static void n(m8 m8Var, l80 l80Var) {
        m8Var.F0(true);
        new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider).R(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        l80Var.u();
    }

    public static /* synthetic */ void o(final m8 m8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new l7(m8Var, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new s2(m8Var, j10, z11, document, runnable));
            return;
        }
        if (z10 || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new l7(m8Var, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id2 = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(id2));
            final int i10 = 0;
            ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(m8Var) { // from class: org.telegram.ui.Components.m7
                public final /* synthetic */ m8 b;

                {
                    this.b = m8Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i10) {
                        case 0:
                            m8.H(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                        default:
                            m8.x(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id3 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(m8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.id.add(Integer.valueOf(id3));
        final int i11 = 1;
        ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(m8Var) { // from class: org.telegram.ui.Components.m7
            public final /* synthetic */ m8 b;

            {
                this.b = m8Var;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i11) {
                    case 0:
                        m8.H(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                    default:
                        m8.x(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public static void p(m8 m8Var, MessageObject messageObject, l80 l80Var) {
        m8Var.v0.remove(messageObject);
        m8Var.w0.remove(messageObject);
        m8Var.s.l();
        l80Var.u();
        m8Var.F0(false);
        org.telegram.messenger.t.q(R.string.AudioSaveToMyProfileUnsaved, new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static /* synthetic */ void q(m8 m8Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject) {
        e2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = m8Var.v0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            m8Var.w0.clear();
            m8Var.w0.addAll(m8Var.v0.list);
            m8Var.s.l();
            ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(m8 m8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.ey eyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        long j10;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(m8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle i12 = a1.g.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                i12.putLong("user_id", j11);
            } else {
                i12.putLong("chat_id", -j11);
            }
            org.telegram.ui.wn wnVar = new org.telegram.ui.wn(i12);
            if (topicKey.topicId != 0) {
                pg.d.a(wnVar, topicKey);
            }
            if (!m8Var.F0.v0(wnVar, true, false)) {
                eyVar.finishFragment();
                return;
            }
            wnVar.Qb(arrayList3);
            if (topicKey.topicId != 0) {
                eyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(m8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(m8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(m8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i10, 0, 0, m8Var.v0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        eyVar.finishFragment();
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R != null) {
            wc.b0(R).R(R.raw.forward, 36, (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(m8Var.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) ? (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId)) : LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId))).j();
        }
    }

    public static void s(m8 m8Var) {
        new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void t(m8 m8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.d3.t((FrameLayout) m8Var.containerView, m8Var.resourcesProvider, tL_error, false);
    }

    public static void u(m8 m8Var) {
        new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void v(m8 m8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || m8Var.v0 == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.id == 0) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(m8Var.getContext(), 3, null);
            e2Var.r(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(m8Var.currentAccount).uploadFile(file.getAbsolutePath(), new bi.v3(m8Var, e2Var, document, 6));
                return;
            }
            return;
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        MessagesController.SavedMusicList savedMusicList = m8Var.v0;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        m8Var.w0.clear();
        m8Var.w0.addAll(m8Var.v0.list);
        m8Var.s.l();
        ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public static void w(m8 m8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.d3.t((FrameLayout) m8Var.containerView, m8Var.resourcesProvider, tL_error, false);
    }

    public static boolean w0(float f7, float f10) {
        return Math.abs(f7 - f10) < 0.05f;
    }

    public static /* synthetic */ void x(m8 m8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new l7(m8Var, tL_error, 2));
                return;
            }
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i11 = 0;
        while (true) {
            if (i11 >= messages_messages.messages.size()) {
                message = null;
                break;
            } else {
                if (messages_messages.messages.get(i11).id == i10) {
                    message = messages_messages.messages.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (message != null) {
            m8Var.C0(new MessageObject(m8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new o7(m8Var, 0));
        }
    }

    public static void y(m8 m8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.d3.t((FrameLayout) m8Var.containerView, m8Var.resourcesProvider, tL_error, false);
    }

    public static ImageLocation y0(MessageObject messageObject) {
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360) : null;
        if (!(closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) && !(closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            closestPhotoSizeWithSize = null;
        }
        if (closestPhotoSizeWithSize != null) {
            return ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        }
        String artworkUrl = messageObject.getArtworkUrl(true);
        if (artworkUrl != null) {
            return ImageLocation.getForPath(artworkUrl);
        }
        return null;
    }

    public final void A0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || (launchActivity = this.F0) == null) {
            return;
        }
        if (i10 == 1) {
            x0(playingMessageObject);
            return;
        }
        if (i10 == 2) {
            G0(playingMessageObject);
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                B0(playingMessageObject);
                return;
            }
            if (i10 == 6) {
                rf.b.L().O(MediaController.getInstance().getCurrentChromecastMedia());
                this.P.performClick();
                return;
            } else {
                if (i10 == 7) {
                    C0(playingMessageObject, false, new f7(this, playingMessageObject, 0), false);
                    return;
                }
                if (i10 == 8) {
                    fi.o7 o7Var = new fi.o7(getContext(), true, null, new h7(this, 0), null);
                    o7Var.h0 = true;
                    o7Var.Z = false;
                    o7Var.p0.O(true);
                    o7Var.show();
                    return;
                }
                return;
            }
        }
        int i11 = UserConfig.selectedAccount;
        int i12 = this.currentAccount;
        if (i11 != i12) {
            launchActivity.P0(i12);
        }
        Bundle bundle = new Bundle();
        long dialogId = playingMessageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", playingMessageObject.getId());
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.v0(new org.telegram.ui.wn(bundle), false, false);
        dismiss();
    }

    public final void B0(MessageObject messageObject) {
        if (Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) {
            LaunchActivity launchActivity = this.F0;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
        if (TextUtils.isEmpty(documentFileName)) {
            documentFileName = messageObject.getFileName();
        }
        String str = documentFileName;
        String str2 = messageObject.messageOwner.attachPath;
        if (str2 != null && str2.length() > 0 && !b10.t(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(str2, this.F0, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new h7(this, 1));
    }

    public final void C0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j10 = document.id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = j10;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new k7(this, z11, messageObject, z10, runnable, j10, document));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D0(boolean z10) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            if (z10) {
                x7 x7Var = this.n;
                int childCount = x7Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = x7Var.getChildAt(i10);
                    if (!(childAt instanceof org.telegram.ui.Cells.w) || ((org.telegram.ui.Cells.w) childAt).getMessageObject() != playingMessageObject) {
                        i10++;
                    }
                }
            }
            int indexOf = this.w0.indexOf(playingMessageObject);
            if (this.u0) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z11 = SharedConfig.playOrderReversed;
                s4.c0 c0Var = this.r;
                if (z11) {
                    c0Var.n0(indexOf);
                    return true;
                }
                c0Var.n0(this.w0.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void E0(org.telegram.ui.ActionBar.g1 g1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.y6.Xi;
            g1Var.setTextColor(getThemedColor(i10));
            g1Var.setIconColor(getThemedColor(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.y6.E8;
            g1Var.setTextColor(getThemedColor(i11));
            g1Var.setIconColor(getThemedColor(i11));
        }
    }

    public final void F0(final boolean z10) {
        boolean z02 = z0();
        fi.d dVar = this.F;
        fi.d dVar2 = this.E;
        if (z02 || this.y0) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        ds dsVar = ds.h;
        final int i10 = 0;
        duration.setInterpolator(dsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.g7
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.E.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.F.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i11 = 1;
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(dsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.g7
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.E.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.F.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r0.exists() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(MessageObject messageObject) {
        File file;
        try {
            if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                file = new File(messageObject.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                file = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner);
            }
            if (!file.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.F0);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PleaseDownload);
                alertDialog$Builder.p();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(messageObject.getMimeType());
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", file));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            }
            this.F0.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void H0(boolean z10, boolean z11) {
        y9 y9Var = this.i0;
        s7 s7Var = this.h0;
        if (z10) {
            if (s7Var.getVisibility() == 0 || this.l0) {
                return;
            }
            s7Var.setTag(1);
            c8 c8Var = this.H;
            y9Var.setImageBitmap(c8Var.a[c8Var.b].getImageReceiver().getBitmap());
            this.l0 = true;
            in0.d(new d7(this, 1));
            s7Var.setVisibility(0);
            s7Var.animate().alpha(1.0f).setDuration(180L).setListener(new z7(this, 0)).start();
            y9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (s7Var.getVisibility() != 0) {
            return;
        }
        s7Var.setTag(null);
        if (z11) {
            this.l0 = true;
            s7Var.animate().alpha(0.0f).setDuration(180L).setListener(new z7(this, 1)).start();
            y9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            s7Var.setAlpha(0.0f);
            s7Var.setVisibility(4);
            y9Var.setImageBitmap(null);
            y9Var.setScaleX(0.9f);
            y9Var.setScaleY(0.9f);
        }
    }

    public final void I0(org.telegram.ui.Cells.w wVar, MessageObject messageObject) {
        l80 G = l80.G(this.container, this.resourcesProvider, wVar, true);
        if (z0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new i7(this, G, messageObject, 0), !this.y0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new i7(this, G, messageObject, 1), !this.y0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new i7(this, messageObject, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new hi.o2(G, u0(G, messageObject), 6), !this.y0);
            if (!this.y0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new i7(this, G, messageObject, 3), !this.y0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new i7(this, G, messageObject, 4), !this.y0);
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new f7(this, messageObject, 1), messageObject.getId() > 0);
        }
        G.V(LocaleController.isRTL ? 3 : 5);
        G.Z();
    }

    public final void J0() {
        if (this.G0 == 1) {
            this.J0 = System.currentTimeMillis();
            this.H0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            m.g3 g3Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            AndroidUtilities.runOnUIThread(g3Var);
        }
    }

    public final void K0() {
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - (this.y.getVisibility() == 0 ? AndroidUtilities.dp(150.0f) : -AndroidUtilities.dp(30.0f))) / 2);
    }

    public final void L0(boolean z10) {
        if (this.U == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        this.V.l(playbackSpeed, z10);
        this.W.e(playbackSpeed, z10);
        updateColors();
        boolean z11 = this.X;
        int i10 = 0;
        this.X = false;
        while (true) {
            org.telegram.ui.ActionBar.g1[] g1VarArr = this.Y;
            if (i10 >= g1VarArr.length) {
                return;
            }
            if (z11 || !w0(playbackSpeed, Z0[i10])) {
                org.telegram.ui.ActionBar.g1 g1Var = g1VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.y6.E8;
                g1Var.d(getThemedColor(i11), getThemedColor(i11));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var2 = g1VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.y6.Qh;
                g1Var2.d(getThemedColor(i12), getThemedColor(i12));
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (org.telegram.messenger.MediaController.getInstance().isMessagePaused() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(MessageObject messageObject, boolean z10) {
        boolean z11;
        float f7;
        int i10;
        e8 e8Var = this.S;
        if (e8Var != null) {
            if (e8Var.w) {
                i10 = (int) (messageObject.getDuration() * e8Var.getProgress());
            } else {
                if (this.H0 >= 0.0f) {
                    int i11 = this.G0;
                    z11 = true;
                    if (i11 != -1) {
                        if (i11 == 1) {
                        }
                    }
                    if (z11) {
                        e8Var.e(messageObject.audioProgress, z10);
                    } else {
                        e8Var.e(this.H0, z10);
                    }
                    if (!this.p0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.o0) >= 500) {
                            f7 = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(messageObject.audioProgress, this.A0) : 1.0f;
                            this.o0 = elapsedRealtime;
                        } else {
                            f7 = -1.0f;
                        }
                    }
                    if (f7 != -1.0f) {
                        o1.j jVar = this.n0;
                        jVar.u.i = f7 * 1000.0f;
                        jVar.h();
                    }
                    if (z11) {
                        i10 = messageObject.audioProgressSec;
                    } else {
                        i10 = (int) (messageObject.getDuration() * e8Var.getProgress());
                        messageObject.audioProgressSec = i10;
                    }
                }
                z11 = false;
                if (z11) {
                }
                if (!this.p0) {
                }
                if (f7 != -1.0f) {
                }
                if (z11) {
                }
            }
            if (this.C0 != i10) {
                this.C0 = i10;
                this.T.l(AndroidUtilities.formatShortDuration(i10), false);
            }
            e8Var.g(messageObject);
        }
    }

    public final void N0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.w0 w0Var = this.a0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                w0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.y6.Xi;
                w0Var.setTag(Integer.valueOf(i11));
                w0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), getThemedColor(i11) & 436207615, true);
                w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i10 == 0) {
                w0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                w0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!SharedConfig.playOrderReversed) {
            w0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i10 == 0) {
            w0Var.setIcon(R.drawable.player_new_order);
        } else {
            w0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i10 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i12 = org.telegram.ui.ActionBar.y6.Wi;
            w0Var.setTag(Integer.valueOf(i12));
            w0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.y6.i6), true);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.y6.Xi;
        w0Var.setTag(Integer.valueOf(i13));
        w0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 != 0) {
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            w0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            w0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    public final void O0() {
        E0(this.d0, SharedConfig.shuffleMusic);
        E0(this.e0, SharedConfig.playOrderReversed);
        E0(this.c0, SharedConfig.repeatMode == 1);
        E0(this.b0, SharedConfig.repeatMode == 2);
    }

    public final void P0() {
        int themedColor = getThemedColor(this.t0 ? org.telegram.ui.ActionBar.y6.a7 : org.telegram.ui.ActionBar.y6.h5);
        if (themedColor != this.T0) {
            this.T0 = themedColor;
            setBackgroundColor(themedColor);
        }
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.Wi);
        u7 u7Var = this.J;
        if (u7Var != null) {
            u7Var.h(themedColor2, "Triangle 3");
            u7Var.h(themedColor2, "Triangle 4");
            u7Var.h(themedColor2, "Rectangle 4");
        }
        v7 v7Var = this.K;
        if (v7Var != null) {
            v7Var.h(themedColor2, "Triangle 3");
            v7Var.h(themedColor2, "Triangle 4");
            v7Var.h(themedColor2, "Rectangle 4");
        }
        e8 e8Var = this.S;
        if (e8Var != null) {
            e8Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.y6.Vi));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.w0 w0Var = this.U;
        if (w0Var != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            int themedColor3 = getThemedColor(!w0(playbackSpeed, 1.0f) ? org.telegram.ui.ActionBar.y6.Qh : org.telegram.ui.ActionBar.y6.x7);
            dd ddVar = this.V;
            if (ddVar != null) {
                ((r6) ddVar.c).u(themedColor3);
                Paint paint = (Paint) ddVar.b;
                if (paint != null) {
                    paint.setColor(themedColor3);
                }
            }
            org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), themedColor3 & 436207615, true);
            int i10 = 0;
            while (true) {
                org.telegram.ui.ActionBar.g1[] g1VarArr = this.Y;
                if (i10 >= g1VarArr.length) {
                    break;
                }
                if (g1VarArr[i10] != null) {
                    int themedColor4 = getThemedColor(w0(playbackSpeed, Z0[i10]) ? org.telegram.ui.ActionBar.y6.Qh : org.telegram.ui.ActionBar.y6.E8);
                    g1VarArr[i10].d(themedColor4, themedColor4);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.O;
        if (g1Var != null) {
            w7 w7Var = this.P;
            if (w7Var != null && w7Var.b()) {
                z10 = true;
            }
            int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.y6.E8);
            int themedColor6 = getThemedColor(org.telegram.ui.ActionBar.y6.F8);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            g1Var.e(themedColor5, themedColor6, getThemedColor(i11), z10);
            this.O.setSelectorColor((w7Var == null || !w7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.y6.i6) : org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i11)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        if (r2.exists() == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z10) {
        long j10;
        long j11;
        File file;
        boolean z11;
        boolean z12;
        y9 y9Var;
        int i10;
        int i11;
        Bitmap bitmap;
        float f7;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if ((playingMessageObject == null && z10) || (playingMessageObject != null && !playingMessageObject.isMusic())) {
            dismiss();
            return;
        }
        if (playingMessageObject == null) {
            this.x0 = null;
            return;
        }
        boolean z13 = playingMessageObject == this.x0;
        this.x0 = playingMessageObject;
        long j12 = playingMessageObject.eventId;
        org.telegram.ui.ActionBar.w0 w0Var = this.M;
        if (j12 != 0 || playingMessageObject.getId() <= -2000000000) {
            w0Var.setVisibility(4);
        } else {
            w0Var.setVisibility(0);
        }
        long dialogId = playingMessageObject.getDialogId();
        if (playingMessageObject.getDocument() != null) {
            j10 = 0;
            j11 = playingMessageObject.getDocument().id;
        } else {
            j10 = 0;
            j11 = 0;
        }
        boolean z14 = (dialogId < j10 && MessagesController.getInstance(this.currentAccount).isPeerNoForwards(dialogId)) || MessagesController.getInstance(this.currentAccount).isPeerNoForwards(playingMessageObject.getDialogId()) || playingMessageObject.messageOwner.noforwards;
        if (z14 != this.y0) {
            this.y0 = z14;
            s7 s7Var = this.y;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s7Var.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z14 || z0()) ? 0 : 52) + 179);
            s7Var.setLayoutParams(layoutParams);
            View view = this.e;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(179 + ((z0() || z14) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        int i12 = 5;
        if (z14) {
            w0Var.t(1);
            w0Var.t(2);
            w0Var.t(5);
            w0Var.t(6);
            w0Var.setAdditionalYOffset(-AndroidUtilities.dp(16.0f));
        } else {
            w0Var.S(1);
            w0Var.S(2);
            w0Var.S(5);
            w0Var.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        }
        String str = playingMessageObject.messageOwner.attachPath;
        if (str != null && str.length() > 0) {
            file = new File(playingMessageObject.messageOwner.attachPath);
        }
        file = null;
        if (file == null) {
            file = FileLoader.getInstance(this.currentAccount).getPathToMessage(playingMessageObject.messageOwner);
        }
        Object[] objArr = SharedConfig.streamMedia && ((int) playingMessageObject.getDialogId()) != 0 && playingMessageObject.isMusic();
        boolean exists = file.exists();
        ImageView imageView = this.f0;
        e8 e8Var = this.S;
        j90 j90Var = this.R;
        if (exists || objArr == true) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            j90Var.setVisibility(4);
            e8Var.setVisibility(0);
            imageView.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            j90Var.a(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            j90Var.setVisibility(0);
            e8Var.setVisibility(4);
            imageView.setEnabled(false);
        }
        M0(playingMessageObject, !z13);
        c8 c8Var = this.H;
        y9 y9Var2 = z13 ? c8Var.a[c8Var.b] : c8Var.a[c8Var.b == 0 ? (char) 1 : (char) 0];
        mf.a audioInfo = MediaController.getInstance().getAudioInfo();
        if (z13) {
            z11 = true;
            z12 = false;
        } else {
            AnimatorSet animatorSet = c8Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            c8Var.c = new AnimatorSet();
            int i13 = c8Var.b == 0 ? 1 : 0;
            c8Var.b = i13;
            y9[] y9VarArr = c8Var.a;
            y9 y9Var3 = y9VarArr[i13 ^ 1];
            y9 y9Var4 = y9VarArr[i13];
            boolean hasBitmapImage = y9Var3.getImageReceiver().hasBitmapImage();
            if (hasBitmapImage) {
                z11 = true;
                f7 = 1.0f;
            } else {
                z11 = true;
                f7 = 0.0f;
            }
            y9Var4.setAlpha(f7);
            y9Var4.setScaleX(0.8f);
            y9Var4.setScaleY(0.8f);
            y9Var4.setVisibility(0);
            if (hasBitmapImage) {
                y9Var3.bringToFront();
            } else {
                y9Var3.setVisibility(8);
                y9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            z12 = false;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(ds.g);
            ofFloat.addUpdateListener(new bh.a0(i12, y9Var4, hasBitmapImage));
            if (hasBitmapImage) {
                float[] fArr = new float[2];
                fArr[0] = y9Var3.getScaleX();
                fArr[z11 ? 1 : 0] = 0.8f;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(ds.i);
                ofFloat2.addUpdateListener(new bh.b0(12, y9Var3, y9Var4));
                ofFloat2.addListener(new org.telegram.ui.sp(y9Var3, i12));
                AnimatorSet animatorSet2 = c8Var.c;
                Animator[] animatorArr = new Animator[2];
                animatorArr[0] = ofFloat2;
                animatorArr[z11 ? 1 : 0] = ofFloat;
                animatorSet2.playSequentially(animatorArr);
            } else {
                c8Var.c.play(ofFloat);
            }
            c8Var.c.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.o) == null) {
            this.A0 = FileLoader.getAttachFileName(playingMessageObject.getDocument());
            boolean z15 = z12;
            this.p0 = z15;
            String artworkUrl = playingMessageObject.getArtworkUrl(z15);
            ImageLocation y02 = y0(playingMessageObject);
            if (TextUtils.isEmpty(artworkUrl)) {
                y9Var = y9Var2;
                i10 = 8;
                if (y02 != null) {
                    y9Var.k(null, null, y02, null, 0L, null, playingMessageObject, 1);
                } else {
                    y9Var.setImageDrawable(null);
                }
            } else {
                ImageLocation forPath = ImageLocation.getForPath(artworkUrl);
                y9Var = y9Var2;
                i10 = 8;
                y9Var.k(forPath, null, y02, null, 0L, null, playingMessageObject, 1);
            }
            y9Var.invalidate();
        } else {
            y9Var2.setImageBitmap(bitmap);
            this.A0 = null;
            this.p0 = z11;
            i10 = 8;
        }
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        eh0 eh0Var = this.g0;
        if (isMessagePaused) {
            eh0Var.a(false, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            eh0Var.a(true, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = playingMessageObject.getMusicTitle();
        String musicAuthor = playingMessageObject.getMusicAuthor();
        this.I.setText(musicTitle);
        this.L.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.E.setLoading(savedMusicIds.loading);
        F0(savedMusicIds.ids.contains(Long.valueOf(j11)));
        int duration = (int) playingMessageObject.getDuration();
        this.D0 = duration;
        TextView textView = this.Z;
        if (textView != null) {
            textView.setText(duration != 0 ? AndroidUtilities.formatShortDuration(duration) : "-:--");
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.U;
        if (duration > 600) {
            i11 = 0;
            w0Var2.setVisibility(0);
        } else {
            i11 = 0;
            w0Var2.setVisibility(i10);
        }
        if (z13) {
            return;
        }
        MediaController mediaController = MediaController.getInstance();
        ArrayList<MessageObject> playlist = mediaController.getPlaylist();
        if (playlist.size() <= 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int playingMessageObjectNum = mediaController.getPlayingMessageObjectNum();
        int i14 = playingMessageObjectNum + 1;
        int i15 = playingMessageObjectNum - 1;
        if (i14 >= playlist.size()) {
            i14 = i11;
        }
        if (i14 <= -1) {
            i14 = playlist.size() - 1;
        }
        if (i15 <= -1) {
            i15 = playlist.size() - 1;
        }
        if (i15 >= playlist.size()) {
            i15 = i11;
        }
        arrayList.add(playlist.get(i14));
        if (i14 != i15) {
            arrayList.add(playlist.get(i15));
        }
        int size = arrayList.size();
        for (int i16 = i11; i16 < size; i16++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i16);
            ImageLocation y03 = y0(messageObject);
            if (y03 != null) {
                if (y03.path != null) {
                    ImageLoader.getInstance().preloadArtwork(y03.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(y03, messageObject, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ie));
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.w wVar;
        MessageObject messageObject;
        org.telegram.ui.Cells.w wVar2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i12 = NotificationCenter.messagePlayingDidStart;
        x7 x7Var = this.n;
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            int i13 = NotificationCenter.messagePlayingDidReset;
            Q0(i10 == i13 && ((Boolean) objArr[1]).booleanValue());
            if (i10 == i13 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = x7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = x7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        wVar.b(false, true);
                    }
                }
                if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        J0();
                    } else if (this.G0 == 1 && this.H0 != -1.0f) {
                        m.g3 g3Var = this.N0;
                        AndroidUtilities.cancelRunOnUIThread(g3Var);
                        this.K0 = 0L;
                        g3Var.run();
                        this.H0 = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = x7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = x7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        wVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.sr srVar = this.N;
            if (srVar != null) {
                srVar.a(c5.d.u());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || !playingMessageObject2.isMusic()) {
                return;
            }
            M0(playingMessageObject2, false);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
            L0(true);
            return;
        }
        int i16 = NotificationCenter.musicDidLoad;
        l8 l8Var = this.s;
        if (i10 == i16) {
            this.v0 = MediaController.getInstance().currentSavedMusicList;
            this.w0 = MediaController.getInstance().getPlaylist();
            l8Var.l();
            return;
        }
        if (i10 == NotificationCenter.moreMusicDidLoad) {
            this.v0 = MediaController.getInstance().currentSavedMusicList;
            this.w0 = MediaController.getInstance().getPlaylist();
            l8Var.l();
            if (SharedConfig.playOrderReversed) {
                x7Var.C0();
                int intValue = ((Integer) objArr[0]).intValue();
                s4.c0 c0Var = this.r;
                c0Var.L0();
                int N0 = c0Var.N0();
                if (N0 != -1) {
                    View m10 = c0Var.m(N0);
                    c0Var.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.A0)) {
                Q0(false);
                this.p0 = true;
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadProgressChanged) {
            if (i10 == NotificationCenter.musicIdsLoaded) {
                Q0(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.A0) || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
            return;
        }
        if (!this.p0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.o0) >= 500) {
                r12 = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.A0) : 1.0f;
                this.o0 = elapsedRealtime;
            } else {
                r12 = -1.0f;
            }
        }
        if (r12 != -1.0f) {
            o1.j jVar = this.n0;
            jVar.u.i = r12 * 1000.0f;
            jVar.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.moreMusicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicIdsLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        if (Y0 == this) {
            Y0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final int getContainerViewHeight() {
        s7 s7Var = this.y;
        if (s7Var == null) {
            return 0;
        }
        if (this.w0.size() <= 1) {
            return s7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.n.getTranslationY() + ((this.z0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.E0;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        b7 b7Var = new b7(this, 0);
        int i10 = org.telegram.ui.ActionBar.y6.Oi;
        b8 b8Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.h7(b8Var, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.h7(b8Var, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.containerView, 0, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vi));
        int i12 = org.telegram.ui.ActionBar.y6.w7;
        org.telegram.ui.ActionBar.w0 w0Var = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.x7));
        int i13 = org.telegram.ui.ActionBar.y6.Wi;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.a0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.Xi));
        int i14 = org.telegram.ui.ActionBar.y6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i14));
        int i15 = org.telegram.ui.ActionBar.y6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i15));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i15));
        u7 u7Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.h7(u7Var, new yj0[]{u7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(u7Var, new yj0[]{u7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(u7Var, new yj0[]{u7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        int i16 = org.telegram.ui.ActionBar.y6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(u7Var, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f0, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        v7 v7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.h7(v7Var, new yj0[]{v7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(v7Var, new yj0[]{v7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(v7Var, new yj0[]{v7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(v7Var, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        int i17 = org.telegram.ui.ActionBar.y6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.w, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.x, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        d8 d8Var = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.h7(d8Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(d8Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        d8 d8Var2 = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.h7(d8Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(d8Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f10 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f10 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f7 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f7 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.containerView.getTop();
        Drawable drawable = this.shadowDrawable;
        return f10 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f7 < ((float) this.containerView.getLeft()) || f7 > ((float) this.containerView.getRight());
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        b8 b8Var = this.c;
        if (b8Var != null && b8Var.n0) {
            b8Var.g(true);
        } else if (this.h0.getTag() != null) {
            H0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        s7 s7Var = this.h0;
        if (view != s7Var) {
            return false;
        }
        s7Var.layout(0, 0, s7Var.getMeasuredWidth(), s7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        s7 s7Var = this.h0;
        if (view != s7Var) {
            return false;
        }
        s7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.R.a(Math.min(1.0f, j10 / j11), true);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.k0 != null && this.a0 != null && this.M != null && this.R != null) {
                v0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            P0();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            float f7 = this.M0;
            if (f7 >= 0.0f) {
                boolean z10 = f7 <= 0.5f && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.699999988079071d;
                if (z10 != this.L0) {
                    this.L0 = z10;
                    AndroidUtilities.setLightStatusBar(this, z10);
                }
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        Y0 = this;
    }

    public final l80 u0(l80 l80Var, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j10 = document != null ? document.id : 0L;
        l80 J = l80Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.bu0(l80Var, 26), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new i7(this, messageObject, l80Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new i7(this, messageObject, l80Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new i7(this, messageObject, l80Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void updateColors() {
        org.telegram.ui.ActionBar.w0 w0Var = this.U;
        if (w0Var != null) {
            int themedColor = getThemedColor(!w0(MediaController.getInstance().getPlaybackSpeed(true), 1.0f) ? org.telegram.ui.ActionBar.y6.Qh : org.telegram.ui.ActionBar.y6.x7);
            dd ddVar = this.V;
            if (ddVar != null) {
                ((r6) ddVar.c).u(themedColor);
                Paint paint = (Paint) ddVar.b;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.y6.g0(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.O;
        if (g1Var != null) {
            w7 w7Var = this.P;
            boolean z10 = w7Var != null && w7Var.b();
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.E8);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.F8);
            int i10 = org.telegram.ui.ActionBar.y6.Oh;
            g1Var.e(themedColor2, themedColor3, getThemedColor(i10), z10);
            this.O.setSelectorColor((w7Var == null || !w7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.y6.i6) : org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i10)));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.w0 w0Var = this.a0;
        int themedColor = getThemedColor(((Integer) w0Var.getTag()).intValue());
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.Wi);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.i6);
        if (!this.U0 || themedColor != this.V0) {
            this.V0 = themedColor;
            w0Var.setIconColor(themedColor);
        }
        boolean z10 = this.U0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.M;
        if (!z10 || themedColor2 != this.W0) {
            this.W0 = themedColor2;
            w0Var2.setIconColor(themedColor2);
        }
        if (!this.U0 || themedColor3 != this.X0) {
            this.X0 = themedColor3;
            org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), themedColor3, true);
            org.telegram.ui.ActionBar.y6.E1(w0Var2.getBackground(), themedColor3, true);
        }
        this.U0 = true;
        this.R.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Vi));
        O0();
        int i10 = org.telegram.ui.ActionBar.y6.G8;
        w0Var.H(getThemedColor(i10));
        int i11 = org.telegram.ui.ActionBar.y6.E8;
        w0Var2.O(getThemedColor(i11), false);
        w0Var2.O(getThemedColor(i11), true);
        w0Var2.H(getThemedColor(i10));
    }

    public final void x0(MessageObject messageObject) {
        ArrayList l4;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.F0;
        if (i10 != i11) {
            launchActivity.P0(i11);
        }
        Bundle c10 = org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true);
        c10.putBoolean("canSelectTopics", true);
        org.telegram.ui.ey eyVar = new org.telegram.ui.ey(c10);
        if (messageObject.getId() >= 0) {
            l4 = org.telegram.messenger.t.l(messageObject);
            tL_document = null;
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            l4 = null;
        }
        eyVar.C2 = new a1.d(this, l4, tL_document, messageObject, 8);
        launchActivity.u0(eyVar);
        dismiss();
    }

    public final boolean z0() {
        MessagesController.SavedMusicList savedMusicList = this.v0;
        return savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}

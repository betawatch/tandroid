package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class k8 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static k8 Y0;
    public static final float[] Z0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public String A0;
    public AnimatorSet B0;
    public int C0;
    public int D0;
    public final ei.d E;
    public final int E0;
    public final ei.d F;
    public final LaunchActivity F0;
    public final s4.y G;
    public int G0;
    public final a8 H;
    public float H0;
    public final b8 I;
    public int I0;
    public final s7 J;
    public long J0;
    public final t7 K;
    public long K0;
    public final b8 L;
    public boolean L0;
    public final org.telegram.ui.ActionBar.u0 M;
    public float M0;
    public final org.telegram.ui.nr N;
    public final org.telegram.ui.Cells.u5 N0;
    public org.telegram.ui.ActionBar.e1 O;
    public org.telegram.ui.aj O0;
    public final u7 P;
    public long P0;
    public final boolean Q;
    public float Q0;
    public final h90 R;
    public final org.telegram.ui.Cells.c2 R0;
    public final c8 S;
    public ValueAnimator S0;
    public final org.telegram.ui.ActionBar.n5 T;
    public int T0;
    public final org.telegram.ui.ActionBar.u0 U;
    public boolean U0;
    public final ed V;
    public int V0;
    public final org.telegram.ui.ActionBar.a1 W;
    public int W0;
    public boolean X;
    public int X0;
    public final org.telegram.ui.ActionBar.e1[] Y;
    public final TextView Z;
    public final org.telegram.ui.ActionBar.u0 a0;
    public final View b;
    public final org.telegram.ui.ActionBar.e1 b0;
    public final z7 c;
    public final org.telegram.ui.ActionBar.e1 c0;
    public final View d;
    public final org.telegram.ui.ActionBar.e1 d0;
    public final View e;
    public final org.telegram.ui.ActionBar.e1 e0;
    public boolean f;
    public final ImageView f0;
    public final eh0 g0;
    public boolean h;
    public final q7 h0;
    public final w9 i0;
    public final org.telegram.ui.ActionBar.u0 j0;
    public final org.telegram.ui.ActionBar.u0 k0;
    public boolean l0;
    public final View[] m0;
    public final v7 n;
    public final o1.k n0;
    public long o0;
    public boolean p0;
    public boolean q0;
    public final s4.b0 r;
    public int r0;
    public final j8 s;
    public int s0;
    public final boolean t0;
    public final boolean u0;
    public final LinearLayout v;
    public MessagesController.SavedMusicList v0;
    public final TextView w;
    public ArrayList w0;
    public final TextView x;
    public MessageObject x0;
    public final q7 y;
    public boolean y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(Activity activity, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, (Context) activity, g6Var, true);
        org.telegram.ui.ActionBar.y yVar;
        float f7;
        TLRPC.User user;
        int i10 = 1;
        org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[6];
        this.Y = e1VarArr;
        View[] viewArr = new View[5];
        this.m0 = viewArr;
        this.q0 = true;
        this.r0 = -1;
        this.z0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.H0 = -1.0f;
        this.M0 = -1.0f;
        this.N0 = new org.telegram.ui.Cells.u5(this, 5);
        this.R0 = new org.telegram.ui.Cells.c2(this);
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
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.moreMusicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicIdsLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
        y7 y7Var = new y7(this, activity);
        this.containerView = y7Var;
        int i11 = 0;
        y7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        z7 z7Var = new z7(this, activity, g6Var, i11);
        this.c = z7Var;
        z7Var.setBackgroundColor(0);
        z7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.k6.Oi;
        org.telegram.ui.ActionBar.r6.m(z7Var, 1, i13, g6Var);
        org.telegram.ui.ActionBar.r6.m(z7Var, 3, org.telegram.ui.ActionBar.k6.Ni, g6Var);
        org.telegram.ui.ActionBar.r6.m(z7Var, 5, i13, g6Var);
        org.telegram.ui.ActionBar.r6.m(z7Var, 6, org.telegram.ui.ActionBar.k6.Pi, g6Var);
        z7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y m10 = z7Var.m();
        m10.setLayoutParams(w7.z5.e(-1, -1, 119));
        View view = new View(activity);
        this.b = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, view, g6Var);
        z7Var.addView(view, 0, w7.z5.e(-1, -1, 119));
        view.setAlpha(0.0f);
        z7Var.setAlpha(0.0f);
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 9));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view3, g6Var);
        q7 q7Var = new q7(this, activity, 2);
        this.y = q7Var;
        a8 a8Var = new a8(this, activity);
        this.H = a8Var;
        q7Var.addView(a8Var, w7.z5.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        b8 b8Var = new b8(this, activity, activity, i11);
        this.I = b8Var;
        q7Var.addView(b8Var, w7.z5.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        b8 b8Var2 = new b8(this, activity, activity, i10);
        this.L = b8Var2;
        q7Var.addView(b8Var2, w7.z5.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        c8 c8Var = new c8(this, activity, g6Var);
        this.S = c8Var;
        c8Var.setLineWidth(4);
        c8Var.setDelegate(new p7(this));
        c8Var.setReportChanges(true);
        q7Var.addView(c8Var, w7.z5.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.k kVar = new o1.k(new o1.j(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.u = lVar;
        kVar.b(new l7(this, i11));
        this.n0 = kVar;
        h90 h90Var = new h90(activity);
        this.R = h90Var;
        h90Var.setVisibility(4);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Ti, h90Var, g6Var);
        h90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
        q7Var.addView(h90Var, w7.z5.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(activity);
        this.T = n5Var;
        n5Var.setTextSize(12);
        n5Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.k6.Si;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i14, g6Var);
        n5Var.setImportantForAccessibility(2);
        q7Var.addView(n5Var, w7.z5.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.Z = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i14, g6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        q7Var.addView(textView, w7.z5.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        int themedColor = getThemedColor(i14);
        int i15 = 3;
        final int i16 = 0;
        int i17 = 2;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(activity, null, 0, themedColor, false, g6Var);
        this.U = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setShowSubmenuByMove(false);
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        u0Var.setDelegate(new a7(this, i16));
        ed edVar = new ed();
        this.V = edVar;
        u0Var.setIcon(edVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(getContext(), g6Var);
        this.W = a1Var;
        a1Var.setRoundRadiusDp(6.0f);
        a1Var.setDrawShadow(true);
        a1Var.setOnValueChange(new b7(this, i16));
        e1VarArr[0] = u0Var.e(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        e1VarArr[1] = u0Var.e(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        e1VarArr[2] = u0Var.e(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        e1VarArr[3] = u0Var.e(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        e1VarArr[4] = u0Var.e(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        e1VarArr[5] = u0Var.e(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            u0Var.setPadding(0, 1, 0, 0);
        }
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(400.0f));
        u0Var.setShowedFromBottom(true);
        q7Var.addView(u0Var, w7.z5.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        u0Var.setOnClickListener(new org.telegram.ui.ActionBar.s1(26, this, fArr));
        u0Var.setOnLongClickListener(new ci.l2(i17, this, g6Var));
        L0(false);
        q7 q7Var2 = new q7(this, activity, i16);
        q7Var.addView(q7Var2, w7.z5.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(activity, null, 0, 0, false, g6Var);
        this.a0 = u0Var2;
        viewArr[0] = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setShowSubmenuByMove(false);
        u0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i18 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i18);
        u0Var2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(u0Var2, g02, null, O, g6Var);
        q7Var2.addView(u0Var2, w7.z5.e(48, 48, 51));
        u0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c7
            public final /* synthetic */ k8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i16) {
                    case 0:
                        k8 k8Var = this.b;
                        k8Var.O0();
                        k8Var.a0.M(null, null);
                        break;
                    default:
                        k8.K(this.b, view4);
                        break;
                }
            }
        });
        this.b0 = u0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.c0 = u0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        u0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.d0 = u0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        u0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.e0 = u0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        u0Var2.setShowedFromBottom(true);
        u0Var2.setDelegate(new a7(this, i10));
        int i19 = org.telegram.ui.ActionBar.k6.Wi;
        int themedColor2 = getThemedColor(i19);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        s7 s7Var = new s7(this, activity, scaledTouchSlop);
        this.J = s7Var;
        viewArr[1] = s7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        s7Var.setScaleType(scaleType);
        s7Var.f(R.raw.player_prev, 20, 20, null);
        s7Var.h(themedColor2, "Triangle 3");
        s7Var.h(themedColor2, "Triangle 4");
        s7Var.h(themedColor2, "Rectangle 4");
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i18);
        s7Var.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(s7Var, g03, null, O2, g6Var);
        q7Var2.addView(s7Var, w7.z5.e(48, 48, 51));
        s7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        eh0 eh0Var = new eh0(28);
        this.g0 = eh0Var;
        imageView.setImageDrawable(eh0Var);
        eh0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        org.telegram.ui.ActionBar.r6.t(imageView, i19, g6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(24.0f));
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i18);
        imageView.setBackground(g04);
        org.telegram.ui.ActionBar.r6.k(imageView, g04, null, O3, g6Var);
        q7Var2.addView(imageView, w7.z5.e(48, 48, 51));
        imageView.setOnClickListener(new ah.f(10));
        t7 t7Var = new t7(this, activity, scaledTouchSlop);
        this.K = t7Var;
        viewArr[3] = t7Var;
        t7Var.setScaleType(scaleType);
        t7Var.f(R.raw.player_prev, 20, 20, null);
        t7Var.h(themedColor2, "Triangle 3");
        t7Var.h(themedColor2, "Triangle 4");
        t7Var.h(themedColor2, "Rectangle 4");
        t7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f));
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i18);
        t7Var.setBackground(g05);
        org.telegram.ui.ActionBar.r6.k(t7Var, g05, null, O4, g6Var);
        q7Var2.addView(t7Var, w7.z5.e(48, 48, 51));
        t7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(activity, null, 0, themedColor2, false, g6Var);
        this.M = u0Var3;
        viewArr[4] = u0Var3;
        org.telegram.ui.nr nrVar = new org.telegram.ui.nr(activity, R.drawable.ic_ab_other, g6Var);
        this.N = nrVar;
        u0Var3.setIcon(nrVar);
        u0Var3.setLongClickEnabled(false);
        u0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i20 = 1;
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i18);
        u0Var3.setBackground(g06);
        org.telegram.ui.ActionBar.r6.k(u0Var3, g06, null, O5, g6Var);
        u0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c7
            public final /* synthetic */ k8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        k8 k8Var = this.b;
                        k8Var.O0();
                        k8Var.a0.M(null, null);
                        break;
                    default:
                        k8.K(this.b, view4);
                        break;
                }
            }
        });
        q7Var2.addView(u0Var3, w7.z5.e(48, 48, 51));
        u7 u7Var = new u7(this, activity, 0);
        this.P = u7Var;
        this.Q = true;
        try {
            u7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e) {
            FileLog.e(e);
            this.Q = false;
        }
        this.P.setVisibility(4);
        org.telegram.ui.nr nrVar2 = this.N;
        if (nrVar2 != null) {
            nrVar2.a(b5.d.u());
        }
        this.M.setShowedFromBottom(true);
        this.M.setDelegate(new a7(this, i17));
        this.M.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i21 = 8;
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, w7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new di.d(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, g6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, w7.z5.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.w = textView2;
        int i22 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.W(textView2, i22, g6Var);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.x = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, i22, g6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        v7 v7Var = new v7(this, activity);
        this.n = v7Var;
        v7Var.setClipToPadding(false);
        getContext();
        s4.b0 b0Var = new s4.b0(1, false);
        this.r = b0Var;
        v7Var.setLayoutManager(b0Var);
        v7Var.setHorizontalScrollBarEnabled(false);
        v7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(v7Var, w7.z5.e(-1, -1, 51));
        j8 j8Var = new j8(this, activity);
        this.s = j8Var;
        v7Var.setAdapter(j8Var);
        org.telegram.ui.ActionBar.r6.m(v7Var, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
        v7Var.setOnItemClickListener(new n7(0));
        v7Var.setOnItemLongClickListener(new a7(this, i15));
        v7Var.setOnScrollListener(new ah.d0(this, 19));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        this.E = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i23 = 0;
        spannableStringBuilder.setSpan(new xq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o7
            public final /* synthetic */ k8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i23) {
                    case 0:
                        k8.B(this.b, g6Var);
                        break;
                    default:
                        k8.A(this.b, g6Var);
                        break;
                }
            }
        });
        this.y.addView(dVar, w7.z5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i24 = 1;
        ei.d dVar2 = new ei.d(activity, g6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.F = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o7
            public final /* synthetic */ k8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i24) {
                    case 0:
                        k8.B(this.b, g6Var);
                        break;
                    default:
                        k8.A(this.b, g6Var);
                        break;
                }
            }
        });
        this.y.addView(dVar2, w7.z5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.v0 = savedMusicList;
        boolean z10 = savedMusicList != null;
        this.t0 = z10;
        this.c.m0 = z10;
        this.u0 = z0();
        this.w0 = MediaController.getInstance().getPlaylist();
        if (z0()) {
            yVar = m10;
            this.j0 = yVar.a(8, R.drawable.msg_add);
        } else {
            yVar = m10;
        }
        org.telegram.ui.ActionBar.u0 a2 = yVar.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 4);
        this.k0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i25 = org.telegram.ui.ActionBar.k6.Oi;
        org.telegram.ui.ActionBar.r6.W(searchField, i25, g6Var);
        org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Si, g6Var);
        org.telegram.ui.ActionBar.r6.m(searchField, 30, i25, g6Var);
        if (z10) {
            v7Var.t1();
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, g6Var));
            this.c.setAlpha(1.0f);
            f7 = 0.0f;
            this.b.setAlpha(0.0f);
            org.telegram.ui.Cells.c2 c2Var = this.R0;
            z7 z7Var2 = this.c;
            Float valueOf = Float.valueOf(0.0f);
            c2Var.getClass();
            c2Var.a(z7Var2, valueOf);
        } else {
            f7 = 0.0f;
        }
        boolean z11 = this.w0.size() > 1;
        j8Var.h = z11;
        if (z11) {
            v7Var.setVisibility(0);
            v7Var.setTranslationY(f7);
        } else {
            v7Var.setVisibility(8);
            v7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        j8Var.l();
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
                TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(MessagesController.getInstance(this.currentAccount), dialogId);
                if (l4 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(l4.user_id))) != null) {
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
            s4.y yVar2 = new s4.y(new w7(this));
            this.G = yVar2;
            yVar2.d(v7Var);
        }
        this.containerView.addView(this.y, w7.z5.e(-1, ((z0() || this.y0) ? 0 : 52) + MessagesStorage.LAST_DB_VERSION, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.y.getLayoutParams()).height = AndroidUtilities.dp(((z0() || this.y0) ? 0 : 52) + MessagesStorage.LAST_DB_VERSION);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(MessagesStorage.LAST_DB_VERSION + ((z0() || this.y0) ? 0 : 52));
        this.containerView.addView(this.d, w7.z5.c(3.0f, -1));
        this.containerView.addView(this.c);
        q7 q7Var3 = new q7(this, activity, 1);
        this.h0 = q7Var3;
        q7Var3.setAlpha(f7);
        q7Var3.setVisibility(4);
        getContainer().addView(q7Var3);
        w9 w9Var = new w9(activity);
        this.i0 = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        w9Var.setScaleX(0.9f);
        w9Var.setScaleY(0.9f);
        q7Var3.addView(w9Var, w7.z5.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        Q0(false);
        N0();
        if (this.h && j8Var.h() == 0) {
            i21 = 0;
        }
        linearLayout.setVisibility(i21);
        K0();
    }

    public static void A(k8 k8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || k8Var.F0 == null) {
            return;
        }
        k8Var.C0(playingMessageObject, false, new ah.j(29), false);
        k8Var.F0(false);
        org.telegram.messenger.v0.p(R.string.AudioSaveToMyProfileUnsaved, new xc((FrameLayout) k8Var.containerView, g6Var), R.raw.ic_delete, 36);
    }

    public static void B(k8 k8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || k8Var.F0 == null) {
            return;
        }
        k8Var.C0(playingMessageObject, true, new ah.j(29), false);
        k8Var.F0(true);
        org.telegram.messenger.v0.p(R.string.AudioSaveToMyProfileSaved, new xc((FrameLayout) k8Var.containerView, g6Var), R.raw.saved_messages, 36);
    }

    public static void C(k8 k8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.b1.s((FrameLayout) k8Var.containerView, k8Var.resourcesProvider, tL_error, false);
    }

    public static void D(k8 k8Var, float[] fArr) {
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
        if (currentTimeMillis - k8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && k8Var.containerView != null) {
                org.telegram.ui.aj ajVar = new org.telegram.ui.aj(5, 1, k8Var.getContext(), null, z10);
                k8Var.O0 = ajVar;
                ajVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                k8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                k8Var.y.addView(k8Var.O0, w7.z5.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                k8Var.O0.f(k8Var.U, true);
            }
        }
        k8Var.P0 = currentTimeMillis;
    }

    public static /* synthetic */ void E(k8 k8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = k8Var.F0;
        int i10 = UserConfig.selectedAccount;
        int i11 = k8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(k8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(k8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.v0(new org.telegram.ui.sn(bundle), false, false);
        k8Var.dismiss();
    }

    public static /* synthetic */ void F(k8 k8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(k8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(k8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(k8Var.currentAccount).getUserFull(clientUserId);
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
            MessagesStorage.getInstance(k8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(k8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static /* synthetic */ void G(k8 k8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new j7(k8Var, tL_error, 3));
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
            k8Var.C0(new MessageObject(k8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new m7(k8Var, 1));
        }
    }

    public static void I(k8 k8Var, MessageObject messageObject, j80 j80Var) {
        ArrayList<MessageObject> k10;
        int i10;
        long clientUserId = UserConfig.getInstance(k8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = k8Var.currentAccount;
        if (i11 != i12) {
            k8Var.F0.P0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() >= 0) {
            k10 = org.telegram.messenger.v0.k(messageObject);
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                i10 = 36;
                j80Var.u();
                org.telegram.messenger.v0.p(R.string.AudioSaveToSavedMessagesSaved, new xc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider), R.raw.saved_messages, i10);
            }
            k10 = null;
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
        }
        if (k10 != null) {
            SendMessagesHelper.getInstance(k8Var.currentAccount).sendMessage(k10, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(k8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, k8Var.v0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            i10 = 36;
            xc.a0(R).Q(R.raw.forward, 36, clientUserId == UserConfig.getInstance(k8Var.currentAccount).getClientUserId() ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : clientUserId > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId))).j();
        } else {
            i10 = 36;
        }
        j80Var.u();
        org.telegram.messenger.v0.p(R.string.AudioSaveToSavedMessagesSaved, new xc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void J(k8 k8Var) {
        FrameLayout frameLayout = (FrameLayout) k8Var.containerView;
        org.telegram.ui.ActionBar.g6 g6Var = k8Var.resourcesProvider;
        new xc(frameLayout, g6Var).o(wc.F, g6Var).j();
    }

    public static void K(k8 k8Var, View view) {
        u7 u7Var = k8Var.P;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        j80 G = j80.G(k8Var.container, k8Var.resourcesProvider, view, true);
        j80 u02 = k8Var.u0(G, playingMessageObject);
        if (!k8Var.z0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new gi.g2(G, u02, 7), !k8Var.y0);
            if (!k8Var.y0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new h7(k8Var, G, 0), !k8Var.y0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new h7(k8Var, G, 1), !k8Var.y0);
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new h7(k8Var, G, 2), playingMessageObject.getId() > 0);
        if (k8Var.Q) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, G.e, G.d, false, false);
            G.d(e1Var);
            k8Var.O = e1Var;
            e1Var.j(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            k8Var.O.setOnClickListener(new org.telegram.ui.ActionBar.s1(27, k8Var, G));
            AndroidUtilities.removeFromParent(u7Var);
            k8Var.O.addView(u7Var, 0, w7.z5.c(-1.0f, -1));
            k8Var.updateColors();
        }
        G.m(k8Var.z0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new h7(k8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static /* synthetic */ void L(k8 k8Var, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            c2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(k8Var.currentAccount).getInputPeer(UserConfig.getInstance(k8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.vc(11, k8Var, c2Var));
    }

    public static void P(k8 k8Var) {
        View view = k8Var.d;
        z7 z7Var = k8Var.c;
        v7 v7Var = k8Var.n;
        if (v7Var.getChildCount() <= 0) {
            int paddingTop = v7Var.getPaddingTop();
            k8Var.z0 = paddingTop;
            v7Var.setTopGlowOffset(paddingTop);
            k8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = v7Var.getChildAt(0);
        wl0 wl0Var = (wl0) v7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.w ? childAt.getTop() : childAt.getBottom();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        boolean z11 = top <= AndroidUtilities.dp(12.0f);
        if ((z11 && z7Var.getTag() == null) || (!z11 && z7Var.getTag() != null)) {
            z7Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = k8Var.B0;
            if (animatorSet != null) {
                animatorSet.cancel();
                k8Var.B0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            k8Var.B0 = animatorSet2;
            int i10 = 2;
            if (k8Var.t0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var, k8Var.R0, z11 ? 1.0f : 0.0f);
                View view2 = k8Var.b;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(z7Var, (Property<z7, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            k8Var.B0.setDuration(320L);
            k8Var.B0.setInterpolator(bs.h);
            k8Var.B0.addListener(new x7(k8Var, i10));
            k8Var.B0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v7Var.getLayoutParams();
        int D = org.telegram.messenger.sl.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (k8Var.z0 != D) {
            k8Var.z0 = D;
            v7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            k8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        float min = k8Var.backgroundPaddingTop + ((int) (v7Var.getTranslationY() + ((k8Var.z0 - k8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - k8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2)) : 1.0f;
        k8Var.M0 = min;
        if (min <= 0.5f && i0.a.h(k8Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != k8Var.L0) {
            k8Var.L0 = z10;
            AndroidUtilities.setLightStatusBar(k8Var, z10);
        }
    }

    public static /* synthetic */ void m(k8 k8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = k8Var.v0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!k8Var.v0.list.isEmpty()) {
                NotificationCenter.getInstance(k8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, k8Var.v0);
            } else {
                MediaController.getInstance().cleanup();
                k8Var.dismiss();
            }
        }
    }

    public static void n(k8 k8Var, j80 j80Var) {
        k8Var.F0(true);
        new xc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        j80Var.u();
    }

    public static /* synthetic */ void p(final k8 k8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new j7(k8Var, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new q2(k8Var, j10, z11, document, runnable));
            return;
        }
        if (z10 || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new j7(k8Var, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id2 = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(id2));
            final int i10 = 0;
            ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(k8Var) { // from class: org.telegram.ui.Components.k7
                public final /* synthetic */ k8 b;

                {
                    this.b = k8Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i10) {
                        case 0:
                            k8.G(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                        default:
                            k8.y(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id3 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(k8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.id.add(Integer.valueOf(id3));
        final int i11 = 1;
        ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(k8Var) { // from class: org.telegram.ui.Components.k7
            public final /* synthetic */ k8 b;

            {
                this.b = k8Var;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i11) {
                    case 0:
                        k8.G(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                    default:
                        k8.y(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public static void q(k8 k8Var, MessageObject messageObject, j80 j80Var) {
        k8Var.v0.remove(messageObject);
        k8Var.w0.remove(messageObject);
        k8Var.s.l();
        j80Var.u();
        k8Var.F0(false);
        org.telegram.messenger.v0.p(R.string.AudioSaveToMyProfileUnsaved, new xc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static /* synthetic */ void r(k8 k8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = k8Var.v0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            k8Var.w0.clear();
            k8Var.w0.addAll(k8Var.v0.list);
            k8Var.s.l();
            ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(k8 k8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.ey eyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        long j10;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(k8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle h = a1.g.h("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                h.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                h.putLong("user_id", j11);
            } else {
                h.putLong("chat_id", -j11);
            }
            org.telegram.ui.sn snVar = new org.telegram.ui.sn(h);
            if (topicKey.topicId != 0) {
                og.d.a(snVar, topicKey);
            }
            if (!k8Var.F0.v0(snVar, true, false)) {
                eyVar.finishFragment();
                return;
            }
            snVar.Gb(arrayList3);
            if (topicKey.topicId != 0) {
                eyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i12)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(k8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i11 = i12;
                SendMessagesHelper.getInstance(k8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i11 = i12;
                SendMessagesHelper.getInstance(k8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i10, 0, 0, k8Var.v0, null, false, false));
            }
            i12 = i11 + 1;
            arrayList3 = arrayList;
        }
        eyVar.finishFragment();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            xc.a0(R).Q(R.raw.forward, 36, (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(k8Var.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) ? (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId)) : LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId))).j();
        }
    }

    public static void t(k8 k8Var) {
        new xc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void u(k8 k8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.b1.s((FrameLayout) k8Var.containerView, k8Var.resourcesProvider, tL_error, false);
    }

    public static void v(k8 k8Var) {
        new xc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void w(k8 k8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || k8Var.v0 == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.id == 0) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(k8Var.getContext(), 3, null);
            c2Var.r(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(k8Var.currentAccount).uploadFile(file.getAbsolutePath(), new ai.a4(k8Var, c2Var, document, 6));
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
        MessagesController.SavedMusicList savedMusicList = k8Var.v0;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        k8Var.w0.clear();
        k8Var.w0.addAll(k8Var.v0.list);
        k8Var.s.l();
        ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public static boolean w0(float f7, float f10) {
        return Math.abs(f7 - f10) < 0.05f;
    }

    public static void x(k8 k8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.b1.s((FrameLayout) k8Var.containerView, k8Var.resourcesProvider, tL_error, false);
    }

    public static /* synthetic */ void y(k8 k8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new j7(k8Var, tL_error, 2));
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
            k8Var.C0(new MessageObject(k8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new m7(k8Var, 0));
        }
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

    public static void z(k8 k8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.b1.s((FrameLayout) k8Var.containerView, k8Var.resourcesProvider, tL_error, false);
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
                qf.b.Y().d0(MediaController.getInstance().getCurrentChromecastMedia());
                this.P.performClick();
                return;
            } else {
                if (i10 == 7) {
                    C0(playingMessageObject, false, new d7(this, playingMessageObject, 0), false);
                    return;
                }
                if (i10 == 8) {
                    ei.s7 s7Var = new ei.s7(getContext(), true, null, new f7(this, 0), null);
                    s7Var.h0 = true;
                    s7Var.Z = false;
                    s7Var.r0.N(true);
                    s7Var.show();
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
        launchActivity.v0(new org.telegram.ui.sn(bundle), false, false);
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
        if (str2 != null && str2.length() > 0 && !si.o0.t(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(str2, this.F0, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new f7(this, 1));
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new i7(this, z11, messageObject, z10, runnable, j10, document));
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
                v7 v7Var = this.n;
                int childCount = v7Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = v7Var.getChildAt(i10);
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
                s4.b0 b0Var = this.r;
                if (z11) {
                    b0Var.n0(indexOf);
                    return true;
                }
                b0Var.n0(this.w0.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void E0(org.telegram.ui.ActionBar.e1 e1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.k6.Xi;
            e1Var.setTextColor(getThemedColor(i10));
            e1Var.setIconColor(getThemedColor(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.E8;
            e1Var.setTextColor(getThemedColor(i11));
            e1Var.setIconColor(getThemedColor(i11));
        }
    }

    public final void F0(final boolean z10) {
        boolean z02 = z0();
        ei.d dVar = this.F;
        ei.d dVar2 = this.E;
        if (z02 || this.y0) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        bs bsVar = bs.h;
        final int i10 = 0;
        duration.setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.e7
            public final /* synthetic */ k8 b;

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
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.e7
            public final /* synthetic */ k8 b;

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
        w9 w9Var = this.i0;
        q7 q7Var = this.h0;
        if (z10) {
            if (q7Var.getVisibility() == 0 || this.l0) {
                return;
            }
            q7Var.setTag(1);
            a8 a8Var = this.H;
            w9Var.setImageBitmap(a8Var.a[a8Var.b].getImageReceiver().getBitmap());
            this.l0 = true;
            cn0.d(new b7(this, 1));
            q7Var.setVisibility(0);
            q7Var.animate().alpha(1.0f).setDuration(180L).setListener(new x7(this, 0)).start();
            w9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (q7Var.getVisibility() != 0) {
            return;
        }
        q7Var.setTag(null);
        if (z11) {
            this.l0 = true;
            q7Var.animate().alpha(0.0f).setDuration(180L).setListener(new x7(this, 1)).start();
            w9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            q7Var.setAlpha(0.0f);
            q7Var.setVisibility(4);
            w9Var.setImageBitmap(null);
            w9Var.setScaleX(0.9f);
            w9Var.setScaleY(0.9f);
        }
    }

    public final void I0(org.telegram.ui.Cells.w wVar, MessageObject messageObject) {
        j80 G = j80.G(this.container, this.resourcesProvider, wVar, true);
        if (z0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new g7(this, G, messageObject, 0), !this.y0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new g7(this, G, messageObject, 1), !this.y0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new g7(this, messageObject, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new gi.g2(G, u0(G, messageObject), 6), !this.y0);
            if (!this.y0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new g7(this, G, messageObject, 3), !this.y0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new g7(this, G, messageObject, 4), !this.y0);
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new d7(this, messageObject, 1), messageObject.getId() > 0);
        }
        G.V(LocaleController.isRTL ? 3 : 5);
        G.Z();
    }

    public final void J0() {
        if (this.G0 == 1) {
            this.J0 = System.currentTimeMillis();
            this.H0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            org.telegram.ui.Cells.u5 u5Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var);
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
            org.telegram.ui.ActionBar.e1[] e1VarArr = this.Y;
            if (i10 >= e1VarArr.length) {
                return;
            }
            if (z11 || !w0(playbackSpeed, Z0[i10])) {
                org.telegram.ui.ActionBar.e1 e1Var = e1VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.k6.E8;
                e1Var.d(getThemedColor(i11), getThemedColor(i11));
            } else {
                org.telegram.ui.ActionBar.e1 e1Var2 = e1VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.k6.Qh;
                e1Var2.d(getThemedColor(i12), getThemedColor(i12));
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
        c8 c8Var = this.S;
        if (c8Var != null) {
            if (c8Var.w) {
                i10 = (int) (messageObject.getDuration() * c8Var.getProgress());
            } else {
                if (this.H0 >= 0.0f) {
                    int i11 = this.G0;
                    z11 = true;
                    if (i11 != -1) {
                        if (i11 == 1) {
                        }
                    }
                    if (z11) {
                        c8Var.e(messageObject.audioProgress, z10);
                    } else {
                        c8Var.e(this.H0, z10);
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
                        o1.k kVar = this.n0;
                        kVar.u.i = f7 * 1000.0f;
                        kVar.h();
                    }
                    if (z11) {
                        i10 = messageObject.audioProgressSec;
                    } else {
                        i10 = (int) (messageObject.getDuration() * c8Var.getProgress());
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
            c8Var.g(messageObject);
        }
    }

    public final void N0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.u0 u0Var = this.a0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                u0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.k6.Xi;
                u0Var.setTag(Integer.valueOf(i11));
                u0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), getThemedColor(i11) & 436207615, true);
                u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i10 == 0) {
                u0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                u0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!SharedConfig.playOrderReversed) {
            u0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i10 == 0) {
            u0Var.setIcon(R.drawable.player_new_order);
        } else {
            u0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i10 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i12 = org.telegram.ui.ActionBar.k6.Wi;
            u0Var.setTag(Integer.valueOf(i12));
            u0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.k6.i6), true);
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.k6.Xi;
        u0Var.setTag(Integer.valueOf(i13));
        u0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 != 0) {
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            u0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            u0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    public final void O0() {
        E0(this.d0, SharedConfig.shuffleMusic);
        E0(this.e0, SharedConfig.playOrderReversed);
        E0(this.c0, SharedConfig.repeatMode == 1);
        E0(this.b0, SharedConfig.repeatMode == 2);
    }

    public final void P0() {
        int themedColor = getThemedColor(this.t0 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.h5);
        if (themedColor != this.T0) {
            this.T0 = themedColor;
            setBackgroundColor(themedColor);
        }
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Wi);
        s7 s7Var = this.J;
        if (s7Var != null) {
            s7Var.h(themedColor2, "Triangle 3");
            s7Var.h(themedColor2, "Triangle 4");
            s7Var.h(themedColor2, "Rectangle 4");
        }
        t7 t7Var = this.K;
        if (t7Var != null) {
            t7Var.h(themedColor2, "Triangle 3");
            t7Var.h(themedColor2, "Triangle 4");
            t7Var.h(themedColor2, "Rectangle 4");
        }
        c8 c8Var = this.S;
        if (c8Var != null) {
            c8Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.u0 u0Var = this.U;
        if (u0Var != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            int themedColor3 = getThemedColor(!w0(playbackSpeed, 1.0f) ? org.telegram.ui.ActionBar.k6.Qh : org.telegram.ui.ActionBar.k6.x7);
            ed edVar = this.V;
            if (edVar != null) {
                ((p6) edVar.c).u(themedColor3);
                Paint paint = (Paint) edVar.b;
                if (paint != null) {
                    paint.setColor(themedColor3);
                }
            }
            org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), themedColor3 & 436207615, true);
            int i10 = 0;
            while (true) {
                org.telegram.ui.ActionBar.e1[] e1VarArr = this.Y;
                if (i10 >= e1VarArr.length) {
                    break;
                }
                if (e1VarArr[i10] != null) {
                    int themedColor4 = getThemedColor(w0(playbackSpeed, Z0[i10]) ? org.telegram.ui.ActionBar.k6.Qh : org.telegram.ui.ActionBar.k6.E8);
                    e1VarArr[i10].d(themedColor4, themedColor4);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.O;
        if (e1Var != null) {
            u7 u7Var = this.P;
            if (u7Var != null && u7Var.b()) {
                z10 = true;
            }
            int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.k6.E8);
            int themedColor6 = getThemedColor(org.telegram.ui.ActionBar.k6.F8);
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            e1Var.e(themedColor5, themedColor6, getThemedColor(i11), z10);
            this.O.setSelectorColor((u7Var == null || !u7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.k6.i6) : org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i11)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        if (r2.exists() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z10) {
        long j10;
        long j11;
        File file;
        MessageObject messageObject;
        boolean z11;
        boolean z12;
        MessageObject messageObject2;
        w9 w9Var;
        int i10;
        int i11;
        Bitmap bitmap;
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
        org.telegram.ui.ActionBar.u0 u0Var = this.M;
        if (j12 != 0 || playingMessageObject.getId() <= -2000000000) {
            u0Var.setVisibility(4);
        } else {
            u0Var.setVisibility(0);
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
            q7 q7Var = this.y;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q7Var.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z14 || z0()) ? 0 : 52) + MessagesStorage.LAST_DB_VERSION);
            q7Var.setLayoutParams(layoutParams);
            View view = this.e;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(MessagesStorage.LAST_DB_VERSION + ((z0() || z14) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        int i12 = 5;
        if (z14) {
            u0Var.r(1);
            u0Var.r(2);
            u0Var.r(5);
            u0Var.r(6);
            u0Var.setAdditionalYOffset(-AndroidUtilities.dp(16.0f));
        } else {
            u0Var.K(1);
            u0Var.K(2);
            u0Var.K(5);
            u0Var.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        }
        String str = playingMessageObject.messageOwner.attachPath;
        if (str != null && str.length() > 0) {
            file = new File(playingMessageObject.messageOwner.attachPath);
        }
        file = null;
        if (file == null) {
            file = FileLoader.getInstance(this.currentAccount).getPathToMessage(playingMessageObject.messageOwner);
        }
        boolean z15 = SharedConfig.streamMedia && ((int) playingMessageObject.getDialogId()) != 0 && playingMessageObject.isMusic();
        boolean exists = file.exists();
        ImageView imageView = this.f0;
        c8 c8Var = this.S;
        h90 h90Var = this.R;
        if (exists || z15) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            h90Var.setVisibility(4);
            c8Var.setVisibility(0);
            imageView.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            h90Var.a(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            h90Var.setVisibility(0);
            c8Var.setVisibility(4);
            imageView.setEnabled(false);
        }
        M0(playingMessageObject, !z13);
        a8 a8Var = this.H;
        w9 w9Var2 = z13 ? a8Var.a[a8Var.b] : a8Var.a[a8Var.b == 0 ? (char) 1 : (char) 0];
        lf.a audioInfo = MediaController.getInstance().getAudioInfo();
        if (z13) {
            messageObject = playingMessageObject;
            z11 = true;
            z12 = false;
        } else {
            AnimatorSet animatorSet = a8Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            a8Var.c = new AnimatorSet();
            int i13 = a8Var.b == 0 ? 1 : 0;
            a8Var.b = i13;
            w9[] w9VarArr = a8Var.a;
            z11 = true;
            w9 w9Var3 = w9VarArr[i13 ^ 1];
            w9 w9Var4 = w9VarArr[i13];
            boolean hasBitmapImage = w9Var3.getImageReceiver().hasBitmapImage();
            w9Var4.setAlpha(hasBitmapImage ? 1.0f : 0.0f);
            w9Var4.setScaleX(0.8f);
            w9Var4.setScaleY(0.8f);
            w9Var4.setVisibility(0);
            if (hasBitmapImage) {
                w9Var3.bringToFront();
            } else {
                w9Var3.setVisibility(8);
                w9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            messageObject = playingMessageObject;
            ofFloat.setDuration(125L);
            z12 = false;
            ofFloat.setInterpolator(bs.g);
            ofFloat.addUpdateListener(new ah.k0(i12, w9Var4, hasBitmapImage));
            if (hasBitmapImage) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(w9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(bs.i);
                ofFloat2.addUpdateListener(new ah.l0(13, w9Var3, w9Var4));
                ofFloat2.addListener(new org.telegram.ui.pq(w9Var3, 4));
                a8Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                a8Var.c.play(ofFloat);
            }
            a8Var.c.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.o) == null) {
            this.A0 = FileLoader.getAttachFileName(messageObject.getDocument());
            boolean z16 = z12;
            this.p0 = z16;
            messageObject2 = messageObject;
            String artworkUrl = messageObject2.getArtworkUrl(z16);
            ImageLocation y02 = y0(messageObject2);
            if (TextUtils.isEmpty(artworkUrl)) {
                w9Var = w9Var2;
                i10 = 8;
                if (y02 != null) {
                    w9Var.k(null, null, y02, null, 0L, null, messageObject2, 1);
                } else {
                    w9Var.setImageDrawable(null);
                }
            } else {
                w9Var = w9Var2;
                i10 = 8;
                w9Var.k(ImageLocation.getForPath(artworkUrl), null, y02, null, 0L, null, messageObject2, 1);
            }
            w9Var.invalidate();
        } else {
            w9Var2.setImageBitmap(bitmap);
            this.A0 = null;
            this.p0 = z11;
            messageObject2 = messageObject;
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
        String musicTitle = messageObject2.getMusicTitle();
        String musicAuthor = messageObject2.getMusicAuthor();
        this.I.setText(musicTitle);
        this.L.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.E.setLoading(savedMusicIds.loading);
        F0(savedMusicIds.ids.contains(Long.valueOf(j11)));
        int duration = (int) messageObject2.getDuration();
        this.D0 = duration;
        TextView textView = this.Z;
        if (textView != null) {
            textView.setText(duration != 0 ? AndroidUtilities.formatShortDuration(duration) : "-:--");
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = this.U;
        if (duration > 600) {
            i11 = 0;
            u0Var2.setVisibility(0);
        } else {
            i11 = 0;
            u0Var2.setVisibility(i10);
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
            MessageObject messageObject3 = (MessageObject) arrayList.get(i16);
            ImageLocation y03 = y0(messageObject3);
            if (y03 != null) {
                if (y03.path != null) {
                    ImageLoader.getInstance().preloadArtwork(y03.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(y03, messageObject3, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ie));
    }

    @Override // org.telegram.ui.ActionBar.h3
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
        v7 v7Var = this.n;
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            int i13 = NotificationCenter.messagePlayingDidReset;
            Q0(i10 == i13 && ((Boolean) objArr[1]).booleanValue());
            if (i10 == i13 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = v7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = v7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        wVar.b(false, true);
                    }
                }
                if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        J0();
                    } else if (this.G0 == 1 && this.H0 != -1.0f) {
                        org.telegram.ui.Cells.u5 u5Var = this.N0;
                        AndroidUtilities.cancelRunOnUIThread(u5Var);
                        this.K0 = 0L;
                        u5Var.run();
                        this.H0 = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = v7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = v7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        wVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.nr nrVar = this.N;
            if (nrVar != null) {
                nrVar.a(b5.d.u());
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
        j8 j8Var = this.s;
        if (i10 == i16) {
            this.v0 = MediaController.getInstance().currentSavedMusicList;
            this.w0 = MediaController.getInstance().getPlaylist();
            j8Var.l();
            return;
        }
        if (i10 == NotificationCenter.moreMusicDidLoad) {
            this.v0 = MediaController.getInstance().currentSavedMusicList;
            this.w0 = MediaController.getInstance().getPlaylist();
            j8Var.l();
            if (SharedConfig.playOrderReversed) {
                v7Var.B0();
                int intValue = ((Integer) objArr[0]).intValue();
                s4.b0 b0Var = this.r;
                b0Var.L0();
                int N0 = b0Var.N0();
                if (N0 != -1) {
                    View m10 = b0Var.m(N0);
                    b0Var.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
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
            o1.k kVar = this.n0;
            kVar.u.i = r12 * 1000.0f;
            kVar.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
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

    @Override // org.telegram.ui.ActionBar.h3
    public final int getContainerViewHeight() {
        q7 q7Var = this.y;
        if (q7Var == null) {
            return 0;
        }
        if (this.w0.size() <= 1) {
            return q7Var.getMeasuredHeight() + this.backgroundPaddingTop;
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

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        z6 z6Var = new z6(this, 0);
        int i10 = org.telegram.ui.ActionBar.k6.Oi;
        z7 z7Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.t6(z7Var, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.t6(z7Var, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.containerView, 0, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vi));
        int i12 = org.telegram.ui.ActionBar.k6.w7;
        org.telegram.ui.ActionBar.u0 u0Var = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x7));
        int i13 = org.telegram.ui.ActionBar.k6.Wi;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.a0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.Xi));
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i14));
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i15));
        org.telegram.ui.ActionBar.u0 u0Var3 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i15));
        s7 s7Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.t6(s7Var, new yj0[]{s7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(s7Var, new yj0[]{s7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(s7Var, new yj0[]{s7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        int i16 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(s7Var, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f0, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        t7 t7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var, new yj0[]{t7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var, new yj0[]{t7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var, new yj0[]{t7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        int i17 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.x, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        b8 b8Var = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.t6(b8Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(b8Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        b8 b8Var2 = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.t6(b8Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(b8Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h3
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

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        z7 z7Var = this.c;
        if (z7Var != null && z7Var.n0) {
            z7Var.g(true);
        } else if (this.h0.getTag() != null) {
            H0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        q7 q7Var = this.h0;
        if (view != q7Var) {
            return false;
        }
        q7Var.layout(0, 0, q7Var.getMeasuredWidth(), q7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        q7 q7Var = this.h0;
        if (view != q7Var) {
            return false;
        }
        q7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.R.a(Math.min(1.0f, j10 / j11), true);
    }

    @Override // org.telegram.ui.ActionBar.h3
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            float f7 = this.M0;
            if (f7 >= 0.0f) {
                boolean z10 = f7 <= 0.5f && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.h5)) > 0.699999988079071d;
                if (z10 != this.L0) {
                    this.L0 = z10;
                    AndroidUtilities.setLightStatusBar(this, z10);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        Y0 = this;
    }

    public final j80 u0(j80 j80Var, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j10 = document != null ? document.id : 0L;
        j80 J = j80Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.vt0(j80Var, 26), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new g7(this, messageObject, j80Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new g7(this, messageObject, j80Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new g7(this, messageObject, j80Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void updateColors() {
        org.telegram.ui.ActionBar.u0 u0Var = this.U;
        if (u0Var != null) {
            int themedColor = getThemedColor(!w0(MediaController.getInstance().getPlaybackSpeed(true), 1.0f) ? org.telegram.ui.ActionBar.k6.Qh : org.telegram.ui.ActionBar.k6.x7);
            ed edVar = this.V;
            if (edVar != null) {
                ((p6) edVar.c).u(themedColor);
                Paint paint = (Paint) edVar.b;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            u0Var.setBackground(org.telegram.ui.ActionBar.k6.g0(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.O;
        if (e1Var != null) {
            u7 u7Var = this.P;
            boolean z10 = u7Var != null && u7Var.b();
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.E8);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.F8);
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            e1Var.e(themedColor2, themedColor3, getThemedColor(i10), z10);
            this.O.setSelectorColor((u7Var == null || !u7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.k6.i6) : org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i10)));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.u0 u0Var = this.a0;
        int themedColor = getThemedColor(((Integer) u0Var.getTag()).intValue());
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Wi);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.i6);
        if (!this.U0 || themedColor != this.V0) {
            this.V0 = themedColor;
            u0Var.setIconColor(themedColor);
        }
        boolean z10 = this.U0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.M;
        if (!z10 || themedColor2 != this.W0) {
            this.W0 = themedColor2;
            u0Var2.setIconColor(themedColor2);
        }
        if (!this.U0 || themedColor3 != this.X0) {
            this.X0 = themedColor3;
            org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), themedColor3, true);
            org.telegram.ui.ActionBar.k6.E1(u0Var2.getBackground(), themedColor3, true);
        }
        this.U0 = true;
        this.R.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
        O0();
        int i10 = org.telegram.ui.ActionBar.k6.G8;
        u0Var.B(getThemedColor(i10));
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        u0Var2.G(getThemedColor(i11), false);
        u0Var2.G(getThemedColor(i11), true);
        u0Var2.B(getThemedColor(i10));
    }

    public final void x0(MessageObject messageObject) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.F0;
        if (i10 != i11) {
            launchActivity.P0(i11);
        }
        Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
        e.putBoolean("canSelectTopics", true);
        org.telegram.ui.ey eyVar = new org.telegram.ui.ey(e);
        if (messageObject.getId() >= 0) {
            k10 = org.telegram.messenger.v0.k(messageObject);
            tL_document = null;
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            k10 = null;
        }
        eyVar.C2 = new a1.d(this, k10, tL_document, messageObject, 8);
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

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
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static l8 T0;
    public static final float[] U0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public int A0;
    public String B0;
    public AnimatorSet C0;
    public int D0;
    public final r7 E;
    public int E0;
    public final ci.d F;
    public final int F0;
    public final ci.d G;
    public final LaunchActivity G0;
    public final s4.z H;
    public int H0;
    public final b8 I;
    public float I0;
    public final c8 J;
    public int J0;
    public final t7 K;
    public long K0;
    public final u7 L;
    public long L0;
    public final c8 M;
    public boolean M0;
    public final org.telegram.ui.ActionBar.v0 N;
    public final org.telegram.ui.Cells.t6 N0;
    public final org.telegram.ui.xr O;
    public org.telegram.ui.jj O0;
    public org.telegram.ui.ActionBar.f1 P;
    public long P0;
    public final v7 Q;
    public float Q0;
    public final boolean R;
    public final org.telegram.ui.Cells.d2 R0;
    public final o90 S;
    public ValueAnimator S0;
    public final d8 T;
    public final org.telegram.ui.ActionBar.j5 U;
    public final org.telegram.ui.ActionBar.v0 V;
    public final hd W;
    public final org.telegram.ui.ActionBar.b1 X;
    public boolean Y;
    public final org.telegram.ui.ActionBar.f1[] Z;
    public final TextView a0;
    public final View b;
    public final org.telegram.ui.ActionBar.v0 b0;
    public final a8 c;
    public final org.telegram.ui.ActionBar.f1 c0;
    public final View d;
    public final org.telegram.ui.ActionBar.f1 d0;
    public final View e;
    public final org.telegram.ui.ActionBar.f1 e0;
    public boolean f;
    public final org.telegram.ui.ActionBar.f1 f0;
    public final ImageView g0;
    public boolean h;
    public final hh0 h0;
    public final r7 i0;
    public final y9 j0;
    public final org.telegram.ui.ActionBar.v0 k0;
    public final org.telegram.ui.ActionBar.v0 l0;
    public boolean m0;
    public final w7 n;
    public final View[] n0;
    public final o1.k o0;
    public long p0;
    public boolean q0;
    public final s4.d0 r;
    public boolean r0;
    public final k8 s;
    public int s0;
    public int t0;
    public final boolean u0;
    public final LinearLayout v;
    public final boolean v0;
    public final ImageView w;
    public MessagesController.SavedMusicList w0;
    public final TextView x;
    public ArrayList x0;
    public final TextView y;
    public MessageObject y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(Activity activity, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, (Context) activity, e6Var, true);
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.User user;
        int i10 = 1;
        int i11 = 6;
        org.telegram.ui.ActionBar.f1[] f1VarArr = new org.telegram.ui.ActionBar.f1[6];
        this.Z = f1VarArr;
        View[] viewArr = new View[5];
        this.n0 = viewArr;
        this.r0 = true;
        this.s0 = -1;
        this.A0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.I0 = -1.0f;
        this.N0 = new org.telegram.ui.Cells.t6(this, 4);
        this.R0 = new org.telegram.ui.Cells.d2(this);
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.G0 = (LaunchActivity) activity;
        this.F0 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        z7 z7Var = new z7(this, activity);
        this.containerView = z7Var;
        int i12 = 0;
        z7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        a8 a8Var = new a8(this, activity, e6Var, i12);
        this.c = a8Var;
        a8Var.setBackgroundColor(0);
        a8Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i14 = org.telegram.ui.ActionBar.i6.Oi;
        a8Var.D(getThemedColor(i14), false);
        a8Var.C(getThemedColor(org.telegram.ui.ActionBar.i6.Ni), false);
        a8Var.setTitleColor(getThemedColor(i14));
        a8Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.Pi));
        a8Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z o9 = a8Var.o();
        o9.setLayoutParams(w7.x5.e(-1, -1, 119));
        View view = new View(activity);
        this.b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
        a8Var.addView(view, 0, w7.x5.e(-1, -1, 119));
        view.setAlpha(0.0f);
        a8Var.setAlpha(0.0f);
        a8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, i11));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.V5));
        int i15 = 2;
        r7 r7Var = new r7(this, activity, i15);
        this.E = r7Var;
        b8 b8Var = new b8(this, activity);
        this.I = b8Var;
        r7Var.addView(b8Var, w7.x5.a(44.0f, 0.0f, 20.0f, 20.0f, 0.0f, 44, 53));
        c8 c8Var = new c8(this, activity, activity, i12);
        this.J = c8Var;
        r7Var.addView(c8Var, w7.x5.a(-2.0f, 20.0f, 20.0f, 20.0f, 0.0f, -1, 51));
        c8 c8Var2 = new c8(this, activity, activity, i10);
        this.M = c8Var2;
        r7Var.addView(c8Var2, w7.x5.a(-2.0f, 14.0f, 47.0f, 20.0f, 0.0f, -1, 51));
        d8 d8Var = new d8(this, activity, e6Var);
        this.T = d8Var;
        d8Var.setLineWidth(4);
        d8Var.setDelegate(new q7(this));
        d8Var.setReportChanges(true);
        r7Var.addView(d8Var, w7.x5.a(44.0f, 5.0f, 67.0f, 5.0f, 0.0f, -1, 51));
        o1.k kVar = new o1.k(new o1.j(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.u = lVar;
        kVar.b(new m7(this, i12));
        this.o0 = kVar;
        o90 o90Var = new o90(activity);
        this.S = o90Var;
        o90Var.setVisibility(4);
        o90Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ti));
        o90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.i6.Vi));
        r7Var.addView(o90Var, w7.x5.a(2.0f, 21.0f, 90.0f, 21.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.U = j5Var;
        j5Var.setTextSize(12);
        j5Var.l("0:00", false);
        int i16 = org.telegram.ui.ActionBar.i6.Si;
        j5Var.setTextColor(getThemedColor(i16));
        j5Var.setImportantForAccessibility(2);
        r7Var.addView(j5Var, w7.x5.a(-2.0f, 20.0f, 98.0f, 0.0f, 0.0f, 100, 51));
        TextView textView = new TextView(activity);
        this.a0 = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i16));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        r7Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 96.0f, 20.0f, 0.0f, -2, 53));
        final int i17 = 0;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(activity, null, 0, getThemedColor(i16), false, e6Var);
        this.V = v0Var;
        v0Var.setLongClickEnabled(false);
        v0Var.setShowSubmenuByMove(false);
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        v0Var.setDelegate(new b7(this, i17));
        hd hdVar = new hd();
        this.W = hdVar;
        v0Var.setIcon(hdVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), e6Var);
        this.X = b1Var;
        b1Var.setRoundRadiusDp(6.0f);
        b1Var.setDrawShadow(true);
        b1Var.setOnValueChange(new c7(this, i17));
        f1VarArr[0] = v0Var.e(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        f1VarArr[1] = v0Var.e(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        f1VarArr[2] = v0Var.e(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        f1VarArr[3] = v0Var.e(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        f1VarArr[4] = v0Var.e(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        f1VarArr[5] = v0Var.e(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            v0Var.setPadding(0, 1, 0, 0);
        }
        v0Var.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(400.0f));
        v0Var.setShowedFromBottom(true);
        r7Var.addView(v0Var, w7.x5.a(36.0f, 0.0f, 86.0f, 20.0f, 0.0f, 36, 53));
        v0Var.setOnClickListener(new org.telegram.ui.sf(16, this, fArr));
        v0Var.setOnLongClickListener(new ai.r3(i15, this, e6Var));
        F0(false);
        r7 r7Var2 = new r7(this, activity, i17);
        r7Var.addView(r7Var2, w7.x5.a(66.0f, 0.0f, 111.0f, 0.0f, 0.0f, -1, 51));
        int i18 = 3;
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(activity, null, 0, 0, false, e6Var);
        this.b0 = v0Var2;
        viewArr[0] = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setShowSubmenuByMove(false);
        v0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i19 = org.telegram.ui.ActionBar.i6.i6;
        v0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i19), 1, AndroidUtilities.dp(18.0f)));
        r7Var2.addView(v0Var2, w7.x5.e(48, 48, 51));
        v0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.d7
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i17) {
                    case 0:
                        l8 l8Var = this.b;
                        l8Var.I0();
                        l8Var.b0.M(null, null);
                        break;
                    default:
                        l8.K(this.b, view4);
                        break;
                }
            }
        });
        this.c0 = v0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.d0 = v0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        v0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.e0 = v0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        v0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f0 = v0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        v0Var2.setShowedFromBottom(true);
        v0Var2.setDelegate(new b7(this, i10));
        int i20 = org.telegram.ui.ActionBar.i6.Wi;
        int themedColor = getThemedColor(i20);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        t7 t7Var = new t7(this, activity, scaledTouchSlop);
        this.K = t7Var;
        viewArr[1] = t7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        t7Var.setScaleType(scaleType);
        t7Var.f(R.raw.player_prev, 20, 20, null);
        t7Var.h(themedColor, "Triangle 3");
        t7Var.h(themedColor, "Triangle 4");
        t7Var.h(themedColor, "Rectangle 4");
        t7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i19), 1, AndroidUtilities.dp(22.0f)));
        r7Var2.addView(t7Var, w7.x5.e(48, 48, 51));
        t7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.g0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        hh0 hh0Var = new hh0(28);
        this.h0 = hh0Var;
        imageView.setImageDrawable(hh0Var);
        hh0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i20), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i19), 1, AndroidUtilities.dp(24.0f)));
        r7Var2.addView(imageView, w7.x5.e(48, 48, 51));
        imageView.setOnClickListener(new ai.e2(8));
        u7 u7Var = new u7(this, activity, scaledTouchSlop);
        this.L = u7Var;
        viewArr[3] = u7Var;
        u7Var.setScaleType(scaleType);
        u7Var.f(R.raw.player_prev, 20, 20, null);
        u7Var.h(themedColor, "Triangle 3");
        u7Var.h(themedColor, "Triangle 4");
        u7Var.h(themedColor, "Rectangle 4");
        u7Var.setRotation(180.0f);
        u7Var.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i19), 1, AndroidUtilities.dp(22.0f)));
        r7Var2.addView(u7Var, w7.x5.e(48, 48, 51));
        u7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(activity, null, 0, themedColor, false, e6Var);
        this.N = v0Var3;
        viewArr[4] = v0Var3;
        org.telegram.ui.xr xrVar = new org.telegram.ui.xr(activity, R.drawable.ic_ab_other, e6Var);
        this.O = xrVar;
        v0Var3.setIcon(xrVar);
        v0Var3.setLongClickEnabled(false);
        v0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i21 = 1;
        v0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i19), 1, AndroidUtilities.dp(18.0f)));
        v0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.d7
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i21) {
                    case 0:
                        l8 l8Var = this.b;
                        l8Var.I0();
                        l8Var.b0.M(null, null);
                        break;
                    default:
                        l8.K(this.b, view4);
                        break;
                }
            }
        });
        r7Var2.addView(v0Var3, w7.x5.e(48, 48, 51));
        v7 v7Var = new v7(this, activity, 0);
        this.Q = v7Var;
        this.R = true;
        try {
            v7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e7) {
            FileLog.e(e7);
            this.R = false;
        }
        this.Q.setVisibility(4);
        org.telegram.ui.xr xrVar2 = this.O;
        if (xrVar2 != null) {
            xrVar2.a(b5.d.u());
        }
        this.N.setShowedFromBottom(true);
        this.N.setDelegate(new b7(this, i15));
        this.N.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, w7.x5.d(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, w7.x5.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.x = textView2;
        int i22 = org.telegram.ui.ActionBar.i6.X5;
        textView2.setTextColor(getThemedColor(i22));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.y = textView3;
        textView3.setTextColor(getThemedColor(i22));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        w7 w7Var = new w7(this, activity);
        this.n = w7Var;
        w7Var.setClipToPadding(false);
        getContext();
        s4.d0 d0Var = new s4.d0(1, false);
        this.r = d0Var;
        w7Var.setLayoutManager(d0Var);
        w7Var.setHorizontalScrollBarEnabled(false);
        w7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(w7Var, w7.x5.e(-1, -1, 51));
        k8 k8Var = new k8(this, activity);
        this.s = k8Var;
        w7Var.setAdapter(k8Var);
        w7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        w7Var.setOnItemClickListener(new o7(0));
        w7Var.setOnItemLongClickListener(new b7(this, i18));
        w7Var.setOnScrollListener(new ai.r(this, 14));
        ci.d dVar = new ci.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.F = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i23 = 0;
        spannableStringBuilder.setSpan(new er(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p7
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i23) {
                    case 0:
                        l8.F(this.b, e6Var);
                        break;
                    default:
                        l8.E(this.b, e6Var);
                        break;
                }
            }
        });
        this.E.addView(dVar, w7.x5.a(42.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 87));
        final int i24 = 1;
        ci.d dVar2 = new ci.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.G = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p7
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i24) {
                    case 0:
                        l8.F(this.b, e6Var);
                        break;
                    default:
                        l8.E(this.b, e6Var);
                        break;
                }
            }
        });
        this.E.addView(dVar2, w7.x5.a(42.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 87));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.w0 = savedMusicList;
        boolean z10 = savedMusicList != null;
        this.u0 = z10;
        this.c.m0 = z10;
        this.v0 = t0();
        this.x0 = MediaController.getInstance().getPlaylist();
        if (t0()) {
            zVar = o9;
            this.k0 = zVar.a(8, R.drawable.msg_add);
        } else {
            zVar = o9;
        }
        org.telegram.ui.ActionBar.v0 a2 = zVar.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 4);
        this.l0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i25 = org.telegram.ui.ActionBar.i6.Oi;
        searchField.setTextColor(getThemedColor(i25));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Si));
        searchField.setCursorColor(getThemedColor(i25));
        if (z10) {
            w7Var.p1();
            setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, e6Var));
            this.c.setAlpha(1.0f);
            this.b.setAlpha(0.0f);
            org.telegram.ui.Cells.d2 d2Var = this.R0;
            a8 a8Var2 = this.c;
            Float valueOf = Float.valueOf(0.0f);
            d2Var.getClass();
            d2Var.a(a8Var2, valueOf);
        }
        boolean z11 = this.x0.size() > 1;
        k8Var.h = z11;
        if (z11) {
            w7Var.setVisibility(0);
            w7Var.setTranslationY(0.0f);
        } else {
            w7Var.setVisibility(8);
            w7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        k8Var.l();
        this.c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.w0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.w0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(MessagesController.getInstance(this.currentAccount), dialogId);
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
        if (t0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.z zVar2 = new s4.z(new x7(this));
            this.H = zVar2;
            zVar2.e(w7Var);
        }
        this.containerView.addView(this.E, w7.x5.e(-1, ((t0() || this.z0) ? 0 : 52) + MessagesStorage.LAST_DB_VERSION, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.E.getLayoutParams()).height = AndroidUtilities.dp(((t0() || this.z0) ? 0 : 52) + MessagesStorage.LAST_DB_VERSION);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(MessagesStorage.LAST_DB_VERSION + ((t0() || this.z0) ? 0 : 52));
        this.containerView.addView(this.d, w7.x5.d(3.0f, -1));
        this.containerView.addView(this.c);
        r7 r7Var3 = new r7(this, activity, 1);
        this.i0 = r7Var3;
        r7Var3.setAlpha(0.0f);
        r7Var3.setVisibility(4);
        getContainer().addView(r7Var3);
        y9 y9Var = new y9(activity);
        this.j0 = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        y9Var.setScaleX(0.9f);
        y9Var.setScaleY(0.9f);
        r7Var3.addView(y9Var, w7.x5.a(-1.0f, 30.0f, 30.0f, 30.0f, 30.0f, -1, 51));
        J0(false);
        H0();
        linearLayout.setVisibility((this.h && k8Var.h() == 0) ? 0 : 8);
        E0();
    }

    public static /* synthetic */ void B(final l8 l8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j3, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new k7(l8Var, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new r2(l8Var, j3, z11, document, runnable));
            return;
        }
        if (z10 || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new k7(l8Var, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id2 = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(id2));
            final int i10 = 0;
            ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(l8Var) { // from class: org.telegram.ui.Components.l7
                public final /* synthetic */ l8 b;

                {
                    this.b = l8Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i10) {
                        case 0:
                            l8.t(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                        default:
                            l8.D(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id3 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(l8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.id.add(Integer.valueOf(id3));
        final int i11 = 1;
        ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(l8Var) { // from class: org.telegram.ui.Components.l7
            public final /* synthetic */ l8 b;

            {
                this.b = l8Var;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i11) {
                    case 0:
                        l8.t(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                    default:
                        l8.D(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public static /* synthetic */ void C(l8 l8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(l8Var.currentAccount).getSavedMusicIds().update(j3, z10);
        long clientUserId = UserConfig.getInstance(l8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(l8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= TLObject.FLAG_21;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.id == j3) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(l8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(l8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static /* synthetic */ void D(l8 l8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new k7(l8Var, tL_error, 2));
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
            l8Var.w0(new MessageObject(l8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new n7(l8Var, 0));
        }
    }

    public static void E(l8 l8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || l8Var.G0 == null) {
            return;
        }
        l8Var.w0(playingMessageObject, false, new ai.f(24), false);
        l8Var.z0(false);
        org.telegram.messenger.q.q(R.string.AudioSaveToMyProfileUnsaved, new ad((FrameLayout) l8Var.containerView, e6Var), R.raw.ic_delete, 36);
    }

    public static void F(l8 l8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || l8Var.G0 == null) {
            return;
        }
        l8Var.w0(playingMessageObject, true, new ai.f(24), false);
        l8Var.z0(true);
        org.telegram.messenger.q.q(R.string.AudioSaveToMyProfileSaved, new ad((FrameLayout) l8Var.containerView, e6Var), R.raw.saved_messages, 36);
    }

    public static void G(l8 l8Var, float[] fArr) {
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
        if (currentTimeMillis - l8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && l8Var.containerView != null) {
                org.telegram.ui.jj jjVar = new org.telegram.ui.jj(5, 1, l8Var.getContext(), null, z10);
                l8Var.O0 = jjVar;
                jjVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                l8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                l8Var.E.addView(l8Var.O0, w7.x5.a(-2.0f, 0.0f, 0.0f, 6.0f, 0.0f, -2, 48));
                l8Var.O0.f(l8Var.V, true);
            }
        }
        l8Var.P0 = currentTimeMillis;
    }

    public static void H(l8 l8Var) {
        new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void I(l8 l8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.p((FrameLayout) l8Var.containerView, l8Var.resourcesProvider, tL_error, false);
    }

    public static void J(l8 l8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.p((FrameLayout) l8Var.containerView, l8Var.resourcesProvider, tL_error, false);
    }

    public static void K(l8 l8Var, View view) {
        v7 v7Var = l8Var.Q;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        p80 G = p80.G(l8Var.container, l8Var.resourcesProvider, view, true);
        p80 q02 = l8Var.q0(G, playingMessageObject);
        if (!l8Var.t0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ei.m2(G, q02, 7), !l8Var.z0);
            if (!l8Var.z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new i7(l8Var, G, 0), !l8Var.z0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new i7(l8Var, G, 1), !l8Var.z0);
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new i7(l8Var, G, 2), playingMessageObject.getId() > 0);
        if (l8Var.R) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, G.e, G.d, false, false);
            G.d(f1Var);
            l8Var.P = f1Var;
            f1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            l8Var.P.setOnClickListener(new org.telegram.ui.sf(17, l8Var, G));
            AndroidUtilities.removeFromParent(v7Var);
            l8Var.P.addView(v7Var, 0, w7.x5.d(-1.0f, -1));
            l8Var.e();
        }
        G.m(l8Var.t0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new i7(l8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static /* synthetic */ void L(l8 l8Var, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            b2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(l8Var.currentAccount).getInputPeer(UserConfig.getInstance(l8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.oo(4, l8Var, b2Var));
    }

    public static void M(l8 l8Var, MessageObject messageObject, p80 p80Var) {
        ArrayList<MessageObject> k10;
        int i10;
        long clientUserId = UserConfig.getInstance(l8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = l8Var.currentAccount;
        if (i11 != i12) {
            l8Var.G0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() >= 0) {
            k10 = org.telegram.messenger.q.k(messageObject);
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                i10 = 36;
                p80Var.u();
                org.telegram.messenger.q.q(R.string.AudioSaveToSavedMessagesSaved, new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider), R.raw.saved_messages, i10);
            }
            k10 = null;
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
        }
        if (k10 != null) {
            SendMessagesHelper.getInstance(l8Var.currentAccount).sendMessage(k10, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(l8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, l8Var.w0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null) {
            i10 = 36;
            ad.a0(R).Q(R.raw.forward, 36, clientUserId == UserConfig.getInstance(l8Var.currentAccount).getClientUserId() ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : clientUserId > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId))).j();
        } else {
            i10 = 36;
        }
        p80Var.u();
        org.telegram.messenger.q.q(R.string.AudioSaveToSavedMessagesSaved, new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void Q(l8 l8Var) {
        View view = l8Var.d;
        a8 a8Var = l8Var.c;
        w7 w7Var = l8Var.n;
        if (w7Var.getChildCount() <= 0) {
            int paddingTop = w7Var.getPaddingTop();
            l8Var.A0 = paddingTop;
            w7Var.setTopGlowOffset(paddingTop);
            l8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = w7Var.getChildAt(0);
        am0 am0Var = (am0) w7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.x ? childAt.getTop() : childAt.getBottom();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || am0Var == null || am0Var.b() != 0) {
            top = dp;
        }
        boolean z11 = top <= AndroidUtilities.dp(12.0f);
        if ((z11 && a8Var.getTag() == null) || (!z11 && a8Var.getTag() != null)) {
            a8Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = l8Var.C0;
            if (animatorSet != null) {
                animatorSet.cancel();
                l8Var.C0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            l8Var.C0 = animatorSet2;
            int i10 = 2;
            if (l8Var.u0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a8Var, l8Var.R0, z11 ? 1.0f : 0.0f);
                View view2 = l8Var.b;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(a8Var, (Property<a8, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            l8Var.C0.setDuration(320L);
            l8Var.C0.setInterpolator(hs.h);
            l8Var.C0.addListener(new y7(l8Var, i10));
            l8Var.C0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w7Var.getLayoutParams();
        int D = org.telegram.messenger.bi.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (l8Var.A0 != D) {
            l8Var.A0 = D;
            w7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            l8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if ((l8Var.backgroundPaddingTop + ((int) (w7Var.getTranslationY() + ((l8Var.A0 - l8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - l8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2)) : 1.0f) <= 0.5f && i0.a.f(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != l8Var.M0) {
            l8Var.M0 = z10;
            AndroidUtilities.setLightStatusBar(l8Var, z10);
        }
    }

    public static /* synthetic */ void o(l8 l8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = l8Var.w0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!l8Var.w0.list.isEmpty()) {
                NotificationCenter.getInstance(l8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, l8Var.w0);
            } else {
                MediaController.getInstance().cleanup();
                l8Var.dismiss();
            }
        }
    }

    public static void p(l8 l8Var) {
        new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static /* synthetic */ void q(l8 l8Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        b2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = l8Var.w0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            l8Var.x0.clear();
            l8Var.x0.addAll(l8Var.w0.list);
            l8Var.s.l();
            ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static /* synthetic */ void r(l8 l8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = l8Var.G0;
        int i10 = UserConfig.selectedAccount;
        int i11 = l8Var.currentAccount;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(l8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(l8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.zn(bundle), false, false);
        l8Var.dismiss();
    }

    public static void s(l8 l8Var, p80 p80Var) {
        l8Var.z0(true);
        new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        p80Var.u();
    }

    public static ImageLocation s0(MessageObject messageObject) {
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

    public static /* synthetic */ void t(l8 l8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new k7(l8Var, tL_error, 3));
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
            l8Var.w0(new MessageObject(l8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new n7(l8Var, 1));
        }
    }

    public static void u(l8 l8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.p((FrameLayout) l8Var.containerView, l8Var.resourcesProvider, tL_error, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(l8 l8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.ty tyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        long j3;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(l8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j10 = topicKey.dialogId;
            Bundle i12 = a1.g.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else if (DialogObject.isUserDialog(j10)) {
                i12.putLong("user_id", j10);
            } else {
                i12.putLong("chat_id", -j10);
            }
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i12);
            if (topicKey.topicId != 0) {
                ng.d.a(znVar, topicKey);
            }
            if (!l8Var.G0.q0(znVar, true, false)) {
                tyVar.finishFragment();
                return;
            }
            znVar.Eb(arrayList3);
            if (topicKey.topicId != 0) {
                tyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j11 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j3 = j11;
                SendMessagesHelper.getInstance(l8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(l8Var.currentAccount).sendMessage(arrayList3, j3, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(l8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j3, null, null, null, null, null, null, z10, i10, 0, 0, l8Var.w0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        tyVar.finishFragment();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null) {
            ad.a0(R).Q(R.raw.forward, 36, (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(l8Var.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) ? (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId)) : LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId))).j();
        }
    }

    public static void w(l8 l8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || l8Var.w0 == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.id == 0) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(l8Var.getContext(), 3, null);
            b2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(l8Var.currentAccount).uploadFile(file.getAbsolutePath(), new ai.d5(l8Var, b2Var, document, 5));
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
        MessagesController.SavedMusicList savedMusicList = l8Var.w0;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        l8Var.x0.clear();
        l8Var.x0.addAll(l8Var.w0.list);
        l8Var.s.l();
        ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public static void x(l8 l8Var, MessageObject messageObject, p80 p80Var) {
        l8Var.w0.remove(messageObject);
        l8Var.x0.remove(messageObject);
        l8Var.s.l();
        p80Var.u();
        l8Var.z0(false);
        org.telegram.messenger.q.q(R.string.AudioSaveToMyProfileUnsaved, new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void y(l8 l8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.p((FrameLayout) l8Var.containerView, l8Var.resourcesProvider, tL_error, false);
    }

    public static void z(l8 l8Var) {
        FrameLayout frameLayout = (FrameLayout) l8Var.containerView;
        org.telegram.ui.ActionBar.e6 e6Var = l8Var.resourcesProvider;
        new ad(frameLayout, e6Var).o(zc.F, e6Var).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r0.exists() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(MessageObject messageObject) {
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PleaseDownload);
                alertDialog$Builder.o();
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
            this.G0.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void B0(boolean z10, boolean z11) {
        y9 y9Var = this.j0;
        r7 r7Var = this.i0;
        if (z10) {
            if (r7Var.getVisibility() == 0 || this.m0) {
                return;
            }
            r7Var.setTag(1);
            b8 b8Var = this.I;
            y9Var.setImageBitmap(b8Var.a[b8Var.b].getImageReceiver().getBitmap());
            this.m0 = true;
            gn0.d(new c7(this, 1));
            r7Var.setVisibility(0);
            r7Var.animate().alpha(1.0f).setDuration(180L).setListener(new y7(this, 0)).start();
            y9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (r7Var.getVisibility() != 0) {
            return;
        }
        r7Var.setTag(null);
        if (z11) {
            this.m0 = true;
            r7Var.animate().alpha(0.0f).setDuration(180L).setListener(new y7(this, 1)).start();
            y9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            r7Var.setAlpha(0.0f);
            r7Var.setVisibility(4);
            y9Var.setImageBitmap(null);
            y9Var.setScaleX(0.9f);
            y9Var.setScaleY(0.9f);
        }
    }

    public final void C0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        p80 G = p80.G(this.container, this.resourcesProvider, xVar, true);
        if (t0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new h7(this, G, messageObject, 0), !this.z0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new h7(this, G, messageObject, 1), !this.z0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new h7(this, messageObject, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ei.m2(G, q0(G, messageObject), 6), !this.z0);
            if (!this.z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new h7(this, G, messageObject, 3), !this.z0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new h7(this, G, messageObject, 4), !this.z0);
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new e7(this, messageObject, 1), messageObject.getId() > 0);
        }
        G.V(LocaleController.isRTL ? 3 : 5);
        G.Z();
    }

    public final void D0() {
        if (this.H0 == 1) {
            this.K0 = System.currentTimeMillis();
            this.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            org.telegram.ui.Cells.t6 t6Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            AndroidUtilities.runOnUIThread(t6Var);
        }
    }

    public final void E0() {
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - (this.E.getVisibility() == 0 ? AndroidUtilities.dp(150.0f) : -AndroidUtilities.dp(30.0f))) / 2);
    }

    public final void F0(boolean z10) {
        if (this.V == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        this.W.l(playbackSpeed, z10);
        this.X.d(playbackSpeed, z10);
        e();
        boolean z11 = this.Y;
        int i10 = 0;
        this.Y = false;
        while (true) {
            org.telegram.ui.ActionBar.f1[] f1VarArr = this.Z;
            if (i10 >= f1VarArr.length) {
                return;
            }
            if (z11 || Math.abs(playbackSpeed - U0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.f1 f1Var = f1VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.i6.E8;
                f1Var.c(getThemedColor(i11), getThemedColor(i11));
            } else {
                org.telegram.ui.ActionBar.f1 f1Var2 = f1VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.i6.Qh;
                f1Var2.c(getThemedColor(i12), getThemedColor(i12));
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
    public final void G0(MessageObject messageObject, boolean z10) {
        boolean z11;
        float f7;
        int i10;
        d8 d8Var = this.T;
        if (d8Var != null) {
            if (d8Var.v) {
                i10 = (int) (messageObject.getDuration() * d8Var.getProgress());
            } else {
                if (this.I0 >= 0.0f) {
                    int i11 = this.H0;
                    z11 = true;
                    if (i11 != -1) {
                        if (i11 == 1) {
                        }
                    }
                    if (z11) {
                        d8Var.e(messageObject.audioProgress, z10);
                    } else {
                        d8Var.e(this.I0, z10);
                    }
                    if (!this.q0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.p0) >= 500) {
                            f7 = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(messageObject.audioProgress, this.B0) : 1.0f;
                            this.p0 = elapsedRealtime;
                        } else {
                            f7 = -1.0f;
                        }
                    }
                    if (f7 != -1.0f) {
                        o1.k kVar = this.o0;
                        kVar.u.i = f7 * 1000.0f;
                        kVar.h();
                    }
                    if (z11) {
                        i10 = messageObject.audioProgressSec;
                    } else {
                        i10 = (int) (messageObject.getDuration() * d8Var.getProgress());
                        messageObject.audioProgressSec = i10;
                    }
                }
                z11 = false;
                if (z11) {
                }
                if (!this.q0) {
                }
                if (f7 != -1.0f) {
                }
                if (z11) {
                }
            }
            if (this.D0 != i10) {
                this.D0 = i10;
                this.U.l(AndroidUtilities.formatShortDuration(i10), false);
            }
            d8Var.g(messageObject);
        }
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.v0 v0Var = this.b0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                v0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.i6.Xi;
                v0Var.setTag(Integer.valueOf(i11));
                v0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.i6.C1(v0Var.getBackground(), getThemedColor(i11) & 436207615, true);
                v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i10 == 0) {
                v0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                v0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!SharedConfig.playOrderReversed) {
            v0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i10 == 0) {
            v0Var.setIcon(R.drawable.player_new_order);
        } else {
            v0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i10 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i12 = org.telegram.ui.ActionBar.i6.Wi;
            v0Var.setTag(Integer.valueOf(i12));
            v0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.i6.C1(v0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.i6.i6), true);
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.i6.Xi;
        v0Var.setTag(Integer.valueOf(i13));
        v0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.i6.C1(v0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 != 0) {
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            v0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            v0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    public final void I0() {
        y0(this.e0, SharedConfig.shuffleMusic);
        y0(this.f0, SharedConfig.playOrderReversed);
        y0(this.d0, SharedConfig.repeatMode == 1);
        y0(this.c0, SharedConfig.repeatMode == 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        if (r2.exists() == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(boolean z10) {
        long j3;
        long j10;
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
            this.y0 = null;
            return;
        }
        boolean z13 = playingMessageObject == this.y0;
        this.y0 = playingMessageObject;
        long j11 = playingMessageObject.eventId;
        int i12 = 4;
        org.telegram.ui.ActionBar.v0 v0Var = this.N;
        if (j11 != 0 || playingMessageObject.getId() <= -2000000000) {
            v0Var.setVisibility(4);
        } else {
            v0Var.setVisibility(0);
        }
        long dialogId = playingMessageObject.getDialogId();
        if (playingMessageObject.getDocument() != null) {
            j3 = 0;
            j10 = playingMessageObject.getDocument().id;
        } else {
            j3 = 0;
            j10 = 0;
        }
        boolean z14 = (dialogId < j3 && MessagesController.getInstance(this.currentAccount).isPeerNoForwards(dialogId)) || MessagesController.getInstance(this.currentAccount).isPeerNoForwards(playingMessageObject.getDialogId()) || playingMessageObject.messageOwner.noforwards;
        if (z14 != this.z0) {
            this.z0 = z14;
            r7 r7Var = this.E;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r7Var.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z14 || t0()) ? 0 : 52) + MessagesStorage.LAST_DB_VERSION);
            r7Var.setLayoutParams(layoutParams);
            View view = this.e;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(MessagesStorage.LAST_DB_VERSION + ((t0() || z14) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        if (z14) {
            v0Var.r(1);
            v0Var.r(2);
            v0Var.r(5);
            v0Var.r(6);
            v0Var.setAdditionalYOffset(-AndroidUtilities.dp(16.0f));
        } else {
            v0Var.K(1);
            v0Var.K(2);
            v0Var.K(5);
            v0Var.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
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
        ImageView imageView = this.g0;
        d8 d8Var = this.T;
        o90 o90Var = this.S;
        if (exists || objArr == true) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            o90Var.setVisibility(4);
            d8Var.setVisibility(0);
            imageView.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            o90Var.a(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            o90Var.setVisibility(0);
            d8Var.setVisibility(4);
            imageView.setEnabled(false);
        }
        G0(playingMessageObject, !z13);
        b8 b8Var = this.I;
        y9 y9Var2 = z13 ? b8Var.a[b8Var.b] : b8Var.a[b8Var.b == 0 ? (char) 1 : (char) 0];
        kf.a audioInfo = MediaController.getInstance().getAudioInfo();
        if (z13) {
            z11 = true;
            z12 = false;
        } else {
            AnimatorSet animatorSet = b8Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            b8Var.c = new AnimatorSet();
            int i13 = b8Var.b == 0 ? 1 : 0;
            b8Var.b = i13;
            y9[] y9VarArr = b8Var.a;
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
            ofFloat.setInterpolator(hs.g);
            ofFloat.addUpdateListener(new ai.cb(i12, y9Var4, hasBitmapImage));
            if (hasBitmapImage) {
                float[] fArr = new float[2];
                fArr[0] = y9Var3.getScaleX();
                fArr[z11 ? 1 : 0] = 0.8f;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(hs.i);
                ofFloat2.addUpdateListener(new ai.x(11, y9Var3, y9Var4));
                ofFloat2.addListener(new org.telegram.ui.t4(y9Var3, 29));
                AnimatorSet animatorSet2 = b8Var.c;
                Animator[] animatorArr = new Animator[2];
                animatorArr[0] = ofFloat2;
                animatorArr[z11 ? 1 : 0] = ofFloat;
                animatorSet2.playSequentially(animatorArr);
            } else {
                b8Var.c.play(ofFloat);
            }
            b8Var.c.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.o) == null) {
            this.B0 = FileLoader.getAttachFileName(playingMessageObject.getDocument());
            boolean z15 = z12;
            this.q0 = z15;
            String artworkUrl = playingMessageObject.getArtworkUrl(z15);
            ImageLocation s02 = s0(playingMessageObject);
            if (TextUtils.isEmpty(artworkUrl)) {
                y9Var = y9Var2;
                i10 = 8;
                if (s02 != null) {
                    y9Var.k(null, null, s02, null, 0L, null, playingMessageObject, 1);
                } else {
                    y9Var.setImageDrawable(null);
                }
            } else {
                ImageLocation forPath = ImageLocation.getForPath(artworkUrl);
                y9Var = y9Var2;
                i10 = 8;
                y9Var.k(forPath, null, s02, null, 0L, null, playingMessageObject, 1);
            }
            y9Var.invalidate();
        } else {
            y9Var2.setImageBitmap(bitmap);
            this.B0 = null;
            this.q0 = z11;
            i10 = 8;
        }
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        hh0 hh0Var = this.h0;
        if (isMessagePaused) {
            hh0Var.a(false, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            hh0Var.a(true, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = playingMessageObject.getMusicTitle();
        String musicAuthor = playingMessageObject.getMusicAuthor();
        this.J.setText(musicTitle);
        this.M.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.F.setLoading(savedMusicIds.loading);
        z0(savedMusicIds.ids.contains(Long.valueOf(j10)));
        int duration = (int) playingMessageObject.getDuration();
        this.E0 = duration;
        TextView textView = this.a0;
        if (textView != null) {
            textView.setText(duration != 0 ? AndroidUtilities.formatShortDuration(duration) : "-:--");
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.V;
        if (duration > 600) {
            i11 = 0;
            v0Var2.setVisibility(0);
        } else {
            i11 = 0;
            v0Var2.setVisibility(i10);
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
            ImageLocation s03 = s0(messageObject);
            if (s03 != null) {
                if (s03.path != null) {
                    ImageLoader.getInstance().preloadArtwork(s03.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(s03, messageObject, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.x xVar;
        MessageObject messageObject;
        org.telegram.ui.Cells.x xVar2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i12 = NotificationCenter.messagePlayingDidStart;
        w7 w7Var = this.n;
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            int i13 = NotificationCenter.messagePlayingDidReset;
            J0(i10 == i13 && ((Boolean) objArr[1]).booleanValue());
            if (i10 == i13 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = w7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = w7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        xVar.b(false, true);
                    }
                }
                if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        D0();
                    } else if (this.H0 == 1 && this.I0 != -1.0f) {
                        org.telegram.ui.Cells.t6 t6Var = this.N0;
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.L0 = 0L;
                        t6Var.run();
                        this.I0 = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = w7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = w7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.xr xrVar = this.O;
            if (xrVar != null) {
                xrVar.a(b5.d.u());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || !playingMessageObject2.isMusic()) {
                return;
            }
            G0(playingMessageObject2, false);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
            F0(true);
            return;
        }
        int i16 = NotificationCenter.musicDidLoad;
        k8 k8Var = this.s;
        if (i10 == i16) {
            this.w0 = MediaController.getInstance().currentSavedMusicList;
            this.x0 = MediaController.getInstance().getPlaylist();
            k8Var.l();
            return;
        }
        if (i10 == NotificationCenter.moreMusicDidLoad) {
            this.w0 = MediaController.getInstance().currentSavedMusicList;
            this.x0 = MediaController.getInstance().getPlaylist();
            k8Var.l();
            if (SharedConfig.playOrderReversed) {
                w7Var.B0();
                int intValue = ((Integer) objArr[0]).intValue();
                s4.d0 d0Var = this.r;
                d0Var.L0();
                int N0 = d0Var.N0();
                if (N0 != -1) {
                    View m10 = d0Var.m(N0);
                    d0Var.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.B0)) {
                J0(false);
                this.q0 = true;
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadProgressChanged) {
            if (i10 == NotificationCenter.musicIdsLoaded) {
                J0(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.B0) || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
            return;
        }
        if (!this.q0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.p0) >= 500) {
                r12 = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.B0) : 1.0f;
                this.p0 = elapsedRealtime;
            } else {
                r12 = -1.0f;
            }
        }
        if (r12 != -1.0f) {
            o1.k kVar = this.o0;
            kVar.u.i = r12 * 1000.0f;
            kVar.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
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
        if (T0 == this) {
            T0 = null;
        }
    }

    public final void e() {
        org.telegram.ui.ActionBar.v0 v0Var = this.V;
        if (v0Var != null) {
            int themedColor = getThemedColor(Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f ? org.telegram.ui.ActionBar.i6.x7 : org.telegram.ui.ActionBar.i6.Qh);
            hd hdVar = this.W;
            if (hdVar != null) {
                ((q6) hdVar.c).u(themedColor);
                Paint paint = (Paint) hdVar.b;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            v0Var.setBackground(org.telegram.ui.ActionBar.i6.g0(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.f1 f1Var = this.P;
        if (f1Var != null) {
            v7 v7Var = this.Q;
            boolean z10 = v7Var != null && v7Var.b();
            final int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.E8);
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.i6.F8);
            int i10 = org.telegram.ui.ActionBar.i6.Oh;
            final int themedColor4 = getThemedColor(i10);
            ValueAnimator valueAnimator = f1Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f1Var.J ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
            f1Var.I = ofFloat;
            f1Var.J = z10;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.d1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    f1 f1Var2 = f1.this;
                    f1Var2.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i11 = themedColor2;
                    int i12 = themedColor4;
                    f1Var2.setTextColor(i0.a.d(floatValue, i11, i12));
                    f1Var2.setIconColor(i0.a.d(floatValue, themedColor3, i12));
                }
            });
            f1Var.I.addListener(new org.telegram.ui.ActionBar.e1(f1Var, z10, themedColor2, themedColor4, themedColor3));
            f1Var.I.setInterpolator(hs.h);
            f1Var.I.start();
            this.P.setSelectorColor((v7Var == null || !v7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.i6.i6) : org.telegram.ui.ActionBar.i6.m1(0.1f, getThemedColor(i10)));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        r7 r7Var = this.E;
        if (r7Var == null) {
            return 0;
        }
        if (this.x0.size() <= 1) {
            return r7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.n.getTranslationY() + ((this.A0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.F0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        a7 a7Var = new a7(this, 0);
        int i10 = org.telegram.ui.ActionBar.i6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 64, null, null, null, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, TLObject.FLAG_27, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.i6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.i6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.i6.je));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.i6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.i6.vc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.i6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.i6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.i6.id));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.i6.h5));
        int i12 = org.telegram.ui.ActionBar.i6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.i6.w7;
        org.telegram.ui.ActionBar.v0 v0Var = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.i6.x7));
        int i15 = org.telegram.ui.ActionBar.i6.Wi;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.b0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 0, null, null, null, a7Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Xi));
        int i16 = org.telegram.ui.ActionBar.i6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 0, null, null, null, a7Var, i16));
        int i17 = org.telegram.ui.ActionBar.i6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 0, null, null, null, a7Var, i17));
        int i18 = org.telegram.ui.ActionBar.i6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 0, null, null, null, a7Var, i18));
        org.telegram.ui.ActionBar.v0 v0Var3 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var3, 0, null, null, null, a7Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var3, 0, null, null, null, a7Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var3, 0, null, null, null, a7Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var3, 0, null, null, null, a7Var, i18));
        t7 t7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.k6(t7Var, (Class[]) null, new ck0[]{t7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t7Var, (Class[]) null, new ck0[]{t7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t7Var, (Class[]) null, new ck0[]{t7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.K, 131080, null, null, null, null, i16));
        ImageView imageView = this.g0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 131080, null, null, null, null, i16));
        u7 u7Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.k6(u7Var, (Class[]) null, new ck0[]{u7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(u7Var, (Class[]) null, new ck0[]{u7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(u7Var, (Class[]) null, new ck0[]{u7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.E, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 8, null, null, null, null, org.telegram.ui.ActionBar.i6.W5));
        int i19 = org.telegram.ui.ActionBar.i6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.a0, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 4, null, null, null, null, i11));
        c8 c8Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.k6(c8Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c8Var.getNextTextView(), 4, null, null, null, null, i10));
        c8 c8Var2 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.k6(c8Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c8Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f3
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        a8 a8Var = this.c;
        if (a8Var != null && a8Var.n0) {
            a8Var.h(true);
        } else if (this.i0.getTag() != null) {
            B0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        r7 r7Var = this.i0;
        if (view != r7Var) {
            return false;
        }
        r7Var.layout(0, 0, r7Var.getMeasuredWidth(), r7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        r7 r7Var = this.i0;
        if (view != r7Var) {
            return false;
        }
        r7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        this.S.a(Math.min(1.0f, j3 / j10), true);
    }

    public final p80 q0(p80 p80Var, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j3 = document != null ? document.id : 0L;
        p80 J = p80Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.nu0(p80Var, 26), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new h7(this, messageObject, p80Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new h7(this, messageObject, p80Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new h7(this, messageObject, p80Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void r0(MessageObject messageObject) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.G0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle d = org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true);
        d.putBoolean("canSelectTopics", true);
        org.telegram.ui.ty tyVar = new org.telegram.ui.ty(d);
        if (messageObject.getId() >= 0) {
            k10 = org.telegram.messenger.q.k(messageObject);
            tL_document = null;
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            k10 = null;
        }
        tyVar.C2 = new a1.d(this, k10, tL_document, messageObject, 6);
        launchActivity.p0(tyVar);
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        T0 = this;
    }

    public final boolean t0() {
        MessagesController.SavedMusicList savedMusicList = this.w0;
        return savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public final void u0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || (launchActivity = this.G0) == null) {
            return;
        }
        if (i10 == 1) {
            r0(playingMessageObject);
            return;
        }
        if (i10 == 2) {
            A0(playingMessageObject);
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                v0(playingMessageObject);
                return;
            }
            if (i10 == 6) {
                pf.b.I().S(MediaController.getInstance().getCurrentChromecastMedia());
                this.Q.performClick();
                return;
            } else {
                if (i10 == 7) {
                    w0(playingMessageObject, false, new e7(this, playingMessageObject, 0), false);
                    return;
                }
                if (i10 == 8) {
                    ci.d8 d8Var = new ci.d8(getContext(), true, null, new g7(this, 0), null);
                    d8Var.h0 = true;
                    d8Var.Z = false;
                    d8Var.q0.N(true);
                    d8Var.show();
                    return;
                }
                return;
            }
        }
        int i11 = UserConfig.selectedAccount;
        int i12 = this.currentAccount;
        if (i11 != i12) {
            launchActivity.K0(i12);
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
        launchActivity.q0(new org.telegram.ui.zn(bundle), false, false);
        dismiss();
    }

    public final void v0(MessageObject messageObject) {
        if (Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) {
            LaunchActivity launchActivity = this.G0;
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
        if (str2 != null && str2.length() > 0 && !sc.v.u(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(str2, this.G0, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new g7(this, 1));
    }

    public final void w0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j3 = document.id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = j3;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new j7(this, z11, messageObject, z10, runnable, j3, document));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x0(boolean z10) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            if (z10) {
                w7 w7Var = this.n;
                int childCount = w7Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = w7Var.getChildAt(i10);
                    if (!(childAt instanceof org.telegram.ui.Cells.x) || ((org.telegram.ui.Cells.x) childAt).getMessageObject() != playingMessageObject) {
                        i10++;
                    }
                }
            }
            int indexOf = this.x0.indexOf(playingMessageObject);
            if (this.v0) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z11 = SharedConfig.playOrderReversed;
                s4.d0 d0Var = this.r;
                if (z11) {
                    d0Var.n0(indexOf);
                    return true;
                }
                d0Var.n0(this.x0.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void y0(org.telegram.ui.ActionBar.f1 f1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.i6.Xi;
            f1Var.setTextColor(getThemedColor(i10));
            f1Var.setIconColor(getThemedColor(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.i6.E8;
            f1Var.setTextColor(getThemedColor(i11));
            f1Var.setIconColor(getThemedColor(i11));
        }
    }

    public final void z0(final boolean z10) {
        boolean t02 = t0();
        ci.d dVar = this.G;
        ci.d dVar2 = this.F;
        if (t02 || this.z0) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        hs hsVar = hs.h;
        final int i10 = 0;
        duration.setInterpolator(hsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.f7
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.F.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.G.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i11 = 1;
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(hsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.f7
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.F.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.G.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}

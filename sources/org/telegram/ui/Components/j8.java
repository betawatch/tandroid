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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j8 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static j8 T0;
    public static final float[] U0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public int A0;
    public String B0;
    public AnimatorSet C0;
    public int D0;
    public final p7 E;
    public int E0;
    public final bi.d F;
    public final int F0;
    public final bi.d G;
    public final LaunchActivity G0;
    public final s4.y H;
    public int H0;
    public final z7 I;
    public float I0;
    public final a8 J;
    public int J0;
    public final r7 K;
    public long K0;
    public final s7 L;
    public long L0;
    public final a8 M;
    public boolean M0;
    public final org.telegram.ui.ActionBar.w0 N;
    public final org.telegram.ui.Cells.l9 N0;
    public final org.telegram.ui.as O;
    public org.telegram.ui.kj O0;
    public org.telegram.ui.ActionBar.g1 P;
    public long P0;
    public final t7 Q;
    public float Q0;
    public final boolean R;
    public final org.telegram.ui.Cells.c2 R0;
    public final w80 S;
    public ValueAnimator S0;
    public final b8 T;
    public final org.telegram.ui.ActionBar.l5 U;
    public final org.telegram.ui.ActionBar.w0 V;
    public final dd W;
    public final org.telegram.ui.ActionBar.c1 X;
    public boolean Y;
    public final org.telegram.ui.ActionBar.g1[] Z;
    public final TextView a0;
    public final View b;
    public final org.telegram.ui.ActionBar.w0 b0;
    public final y7 c;
    public final org.telegram.ui.ActionBar.g1 c0;
    public final View d;
    public final org.telegram.ui.ActionBar.g1 d0;
    public final View e;
    public final org.telegram.ui.ActionBar.g1 e0;
    public boolean f;
    public final org.telegram.ui.ActionBar.g1 f0;
    public final ImageView g0;
    public boolean h;
    public final pg0 h0;
    public final p7 i0;
    public final w9 j0;
    public final org.telegram.ui.ActionBar.w0 k0;
    public final org.telegram.ui.ActionBar.w0 l0;
    public boolean m0;
    public final u7 n;
    public final View[] n0;
    public final o1.k o0;
    public long p0;
    public boolean q0;
    public final s4.c0 r;
    public boolean r0;
    public final i8 s;
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
    public j8(Activity activity, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, (Context) activity, f6Var, true);
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.User user;
        int i10 = 1;
        int i11 = 6;
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[6];
        this.Z = g1VarArr;
        View[] viewArr = new View[5];
        this.n0 = viewArr;
        this.r0 = true;
        this.s0 = -1;
        this.A0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.I0 = -1.0f;
        int i12 = 2;
        this.N0 = new org.telegram.ui.Cells.l9(this, i12);
        this.R0 = new org.telegram.ui.Cells.c2(this);
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
        x7 x7Var = new x7(this, activity);
        this.containerView = x7Var;
        int i13 = 0;
        x7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        y7 y7Var = new y7(this, activity, f6Var, i13);
        this.c = y7Var;
        y7Var.setBackgroundColor(0);
        y7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i15 = org.telegram.ui.ActionBar.j6.Oi;
        y7Var.C(getThemedColor(i15), false);
        y7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.Ni), false);
        y7Var.setTitleColor(getThemedColor(i15));
        y7Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
        y7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z n10 = y7Var.n();
        n10.setLayoutParams(w7.a6.e(-1, -1, 119));
        View view = new View(activity);
        this.b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        y7Var.addView(view, 0, w7.a6.e(-1, -1, 119));
        view.setAlpha(0.0f);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, i11));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        p7 p7Var = new p7(this, activity, i12);
        this.E = p7Var;
        z7 z7Var = new z7(this, activity);
        this.I = z7Var;
        p7Var.addView(z7Var, w7.a6.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        a8 a8Var = new a8(this, activity, activity, i13);
        this.J = a8Var;
        p7Var.addView(a8Var, w7.a6.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        a8 a8Var2 = new a8(this, activity, activity, i10);
        this.M = a8Var2;
        p7Var.addView(a8Var2, w7.a6.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        b8 b8Var = new b8(this, activity, f6Var);
        this.T = b8Var;
        b8Var.setLineWidth(4);
        b8Var.setDelegate(new o7(this));
        b8Var.setReportChanges(true);
        p7Var.addView(b8Var, w7.a6.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.k kVar = new o1.k(new o1.j(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.u = lVar;
        kVar.b(new k7(this, i13));
        this.o0 = kVar;
        w80 w80Var = new w80(activity);
        this.S = w80Var;
        w80Var.setVisibility(4);
        w80Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
        w80Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
        p7Var.addView(w80Var, w7.a6.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.U = l5Var;
        l5Var.setTextSize(12);
        l5Var.l("0:00", false);
        int i16 = org.telegram.ui.ActionBar.j6.Si;
        l5Var.setTextColor(getThemedColor(i16));
        l5Var.setImportantForAccessibility(2);
        p7Var.addView(l5Var, w7.a6.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a0 = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i16));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        p7Var.addView(textView, w7.a6.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        final int i17 = 0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, getThemedColor(i16), false, f6Var);
        this.V = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new y6(this, i17));
        dd ddVar = new dd();
        this.W = ddVar;
        w0Var.setIcon(ddVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), f6Var);
        this.X = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new z6(this, i17));
        g1VarArr[0] = w0Var.e(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        g1VarArr[1] = w0Var.e(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
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
        p7Var.addView(w0Var, w7.a6.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new org.telegram.ui.sh(13, this, fArr));
        w0Var.setOnLongClickListener(new b0(i10, this, f6Var));
        F0(false);
        p7 p7Var2 = new p7(this, activity, i17);
        p7Var.addView(p7Var2, w7.a6.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, f6Var);
        this.b0 = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i18 = org.telegram.ui.ActionBar.j6.i6;
        w0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f)));
        p7Var2.addView(w0Var2, w7.a6.e(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a7
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i17) {
                    case 0:
                        j8 j8Var = this.b;
                        j8Var.I0();
                        j8Var.b0.M(null, null);
                        break;
                    default:
                        j8.J(this.b, view4);
                        break;
                }
            }
        });
        this.c0 = w0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.d0 = w0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.e0 = w0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f0 = w0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        w0Var2.setShowedFromBottom(true);
        w0Var2.setDelegate(new y6(this, i10));
        int i19 = org.telegram.ui.ActionBar.j6.Wi;
        int themedColor = getThemedColor(i19);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        r7 r7Var = new r7(this, activity, scaledTouchSlop);
        this.K = r7Var;
        viewArr[1] = r7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        r7Var.setScaleType(scaleType);
        r7Var.f(R.raw.player_prev, 20, 20, null);
        r7Var.h(themedColor, "Triangle 3");
        r7Var.h(themedColor, "Triangle 4");
        r7Var.h(themedColor, "Rectangle 4");
        r7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f)));
        p7Var2.addView(r7Var, w7.a6.e(48, 48, 51));
        r7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.g0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        pg0 pg0Var = new pg0(28);
        this.h0 = pg0Var;
        imageView.setImageDrawable(pg0Var);
        pg0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i19), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(24.0f)));
        p7Var2.addView(imageView, w7.a6.e(48, 48, 51));
        imageView.setOnClickListener(new bi.d5(7));
        s7 s7Var = new s7(this, activity, scaledTouchSlop);
        this.L = s7Var;
        viewArr[3] = s7Var;
        s7Var.setScaleType(scaleType);
        s7Var.f(R.raw.player_prev, 20, 20, null);
        s7Var.h(themedColor, "Triangle 3");
        s7Var.h(themedColor, "Triangle 4");
        s7Var.h(themedColor, "Rectangle 4");
        s7Var.setRotation(180.0f);
        s7Var.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f)));
        p7Var2.addView(s7Var, w7.a6.e(48, 48, 51));
        s7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor, false, f6Var);
        this.N = w0Var3;
        viewArr[4] = w0Var3;
        org.telegram.ui.as asVar = new org.telegram.ui.as(activity, R.drawable.ic_ab_other, f6Var);
        this.O = asVar;
        w0Var3.setIcon(asVar);
        w0Var3.setLongClickEnabled(false);
        w0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i20 = 1;
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f)));
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a7
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        j8 j8Var = this.b;
                        j8Var.I0();
                        j8Var.b0.M(null, null);
                        break;
                    default:
                        j8.J(this.b, view4);
                        break;
                }
            }
        });
        p7Var2.addView(w0Var3, w7.a6.e(48, 48, 51));
        t7 t7Var = new t7(this, activity, 0);
        this.Q = t7Var;
        this.R = true;
        try {
            t7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e) {
            FileLog.e(e);
            this.R = false;
        }
        this.Q.setVisibility(4);
        org.telegram.ui.as asVar2 = this.O;
        if (asVar2 != null) {
            asVar2.a(b5.d.u());
        }
        this.N.setShowedFromBottom(true);
        this.N.setDelegate(new y6(this, 2));
        this.N.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i21 = 8;
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, w7.a6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ai.h(11));
        ImageView imageView2 = new ImageView(activity);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, w7.a6.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.x = textView2;
        int i22 = org.telegram.ui.ActionBar.j6.X5;
        textView2.setTextColor(getThemedColor(i22));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.y = textView3;
        textView3.setTextColor(getThemedColor(i22));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, w7.a6.t(-2, -2, 17, 0, 6, 0, 0));
        u7 u7Var = new u7(this, activity);
        this.n = u7Var;
        u7Var.setClipToPadding(false);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        this.r = c0Var;
        u7Var.setLayoutManager(c0Var);
        u7Var.setHorizontalScrollBarEnabled(false);
        u7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(u7Var, w7.a6.e(-1, -1, 51));
        i8 i8Var = new i8(this, activity);
        this.s = i8Var;
        u7Var.setAdapter(i8Var);
        u7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        u7Var.setOnItemClickListener(new m7(0));
        u7Var.setOnItemLongClickListener(new y6(this, 3));
        u7Var.setOnScrollListener(new bi.a2(this, 12));
        bi.d dVar = new bi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.F = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i23 = 0;
        spannableStringBuilder.setSpan(new uq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n7
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i23) {
                    case 0:
                        j8.D(this.b, f6Var);
                        break;
                    default:
                        j8.C(this.b, f6Var);
                        break;
                }
            }
        });
        this.E.addView(dVar, w7.a6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i24 = 1;
        bi.d dVar2 = new bi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.G = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n7
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i24) {
                    case 0:
                        j8.D(this.b, f6Var);
                        break;
                    default:
                        j8.C(this.b, f6Var);
                        break;
                }
            }
        });
        this.E.addView(dVar2, w7.a6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.w0 = savedMusicList;
        boolean z10 = savedMusicList != null;
        this.u0 = z10;
        this.c.m0 = z10;
        this.v0 = s0();
        this.x0 = MediaController.getInstance().getPlaylist();
        if (s0()) {
            zVar = n10;
            this.k0 = zVar.a(8, R.drawable.msg_add);
        } else {
            zVar = n10;
        }
        org.telegram.ui.ActionBar.w0 a2 = zVar.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 4);
        this.l0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i25 = org.telegram.ui.ActionBar.j6.Oi;
        searchField.setTextColor(getThemedColor(i25));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
        searchField.setCursorColor(getThemedColor(i25));
        if (z10) {
            u7Var.o1();
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
            this.c.setAlpha(1.0f);
            this.b.setAlpha(0.0f);
            this.R0.set(this.c, Float.valueOf(0.0f));
        }
        boolean z11 = this.x0.size() > 1;
        i8Var.h = z11;
        if (z11) {
            u7Var.setVisibility(0);
            u7Var.setTranslationY(0.0f);
        } else {
            u7Var.setVisibility(8);
            u7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        i8Var.l();
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
                TLRPC.EncryptedChat m10 = org.telegram.messenger.a2.m(MessagesController.getInstance(this.currentAccount), dialogId);
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
        if (s0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.y yVar = new s4.y(new v7(this));
            this.H = yVar;
            yVar.d(u7Var);
        }
        this.containerView.addView(this.E, w7.a6.e(-1, ((s0() || this.z0) ? 0 : 52) + 179, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.E.getLayoutParams()).height = AndroidUtilities.dp(((s0() || this.z0) ? 0 : 52) + 179);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((s0() || this.z0) ? 0 : 52));
        this.containerView.addView(this.d, w7.a6.c(3.0f, -1));
        this.containerView.addView(this.c);
        p7 p7Var3 = new p7(this, activity, 1);
        this.i0 = p7Var3;
        p7Var3.setAlpha(0.0f);
        p7Var3.setVisibility(4);
        getContainer().addView(p7Var3);
        w9 w9Var = new w9(activity);
        this.j0 = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        w9Var.setScaleX(0.9f);
        w9Var.setScaleY(0.9f);
        p7Var3.addView(w9Var, w7.a6.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        J0(false);
        H0();
        if (this.h && i8Var.h() == 0) {
            i21 = 0;
        }
        linearLayout.setVisibility(i21);
        E0();
    }

    public static /* synthetic */ void A(j8 j8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new i7(j8Var, tL_error, 2));
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
            j8Var.v0(new MessageObject(j8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new l7(j8Var, 0));
        }
    }

    public static void C(j8 j8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || j8Var.G0 == null) {
            return;
        }
        j8Var.v0(playingMessageObject, false, new bi.f0(19), false);
        j8Var.y0(false);
        org.telegram.messenger.a2.o(R.string.AudioSaveToMyProfileUnsaved, new wc((FrameLayout) j8Var.containerView, f6Var), R.raw.ic_delete, 36);
    }

    public static void D(j8 j8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || j8Var.G0 == null) {
            return;
        }
        j8Var.v0(playingMessageObject, true, new bi.f0(19), false);
        j8Var.y0(true);
        org.telegram.messenger.a2.o(R.string.AudioSaveToMyProfileSaved, new wc((FrameLayout) j8Var.containerView, f6Var), R.raw.saved_messages, 36);
    }

    public static void E(j8 j8Var, float[] fArr) {
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
        if (currentTimeMillis - j8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && j8Var.containerView != null) {
                org.telegram.ui.kj kjVar = new org.telegram.ui.kj(5, 1, j8Var.getContext(), null, z10);
                j8Var.O0 = kjVar;
                kjVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                j8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                j8Var.E.addView(j8Var.O0, w7.a6.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                j8Var.O0.f(j8Var.V, true);
            }
        }
        j8Var.P0 = currentTimeMillis;
    }

    public static void F(j8 j8Var) {
        new wc((FrameLayout) j8Var.containerView, j8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void H(j8 j8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.r6.q((FrameLayout) j8Var.containerView, j8Var.resourcesProvider, tL_error, false);
    }

    public static void I(j8 j8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.r6.q((FrameLayout) j8Var.containerView, j8Var.resourcesProvider, tL_error, false);
    }

    public static void J(j8 j8Var, View view) {
        t7 t7Var = j8Var.Q;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        w70 G = w70.G(j8Var.container, j8Var.resourcesProvider, view, true);
        w70 p02 = j8Var.p0(G, playingMessageObject);
        if (!j8Var.s0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new di.p2(G, p02, 7), !j8Var.z0);
            if (!j8Var.z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new f7(j8Var, G, 0), !j8Var.z0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new f7(j8Var, G, 1), !j8Var.z0);
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new f7(j8Var, G, 2), playingMessageObject.getId() > 0);
        if (j8Var.R) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.e, G.d, false, false);
            G.d(g1Var);
            j8Var.P = g1Var;
            g1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            j8Var.P.setOnClickListener(new org.telegram.ui.sh(14, j8Var, G));
            AndroidUtilities.removeFromParent(t7Var);
            j8Var.P.addView(t7Var, 0, w7.a6.c(-1.0f, -1));
            j8Var.D0();
        }
        G.m(j8Var.s0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new f7(j8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static /* synthetic */ void K(j8 j8Var, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            d2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(j8Var.currentAccount).getInputPeer(UserConfig.getInstance(j8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new bi.o2(29, j8Var, d2Var));
    }

    public static void L(j8 j8Var, MessageObject messageObject, w70 w70Var) {
        ArrayList<MessageObject> l4;
        int i10;
        long clientUserId = UserConfig.getInstance(j8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = j8Var.currentAccount;
        if (i11 != i12) {
            j8Var.G0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                l4 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i10 = 36;
            w70Var.u();
            org.telegram.messenger.a2.o(R.string.AudioSaveToSavedMessagesSaved, new wc((FrameLayout) j8Var.containerView, j8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        l4 = org.telegram.messenger.a2.l(messageObject);
        if (l4 != null) {
            SendMessagesHelper.getInstance(j8Var.currentAccount).sendMessage(l4, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(j8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, j8Var.w0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R != null) {
            i10 = 36;
            wc.a0(R).Q(R.raw.forward, 36, clientUserId == UserConfig.getInstance(j8Var.currentAccount).getClientUserId() ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : clientUserId > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId))).j();
            w70Var.u();
            org.telegram.messenger.a2.o(R.string.AudioSaveToSavedMessagesSaved, new wc((FrameLayout) j8Var.containerView, j8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        i10 = 36;
        w70Var.u();
        org.telegram.messenger.a2.o(R.string.AudioSaveToSavedMessagesSaved, new wc((FrameLayout) j8Var.containerView, j8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void P(j8 j8Var) {
        View view = j8Var.d;
        y7 y7Var = j8Var.c;
        u7 u7Var = j8Var.n;
        if (u7Var.getChildCount() <= 0) {
            int paddingTop = u7Var.getPaddingTop();
            j8Var.A0 = paddingTop;
            u7Var.setTopGlowOffset(paddingTop);
            j8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = u7Var.getChildAt(0);
        fl0 fl0Var = (fl0) u7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.x ? childAt.getTop() : childAt.getBottom();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        boolean z11 = top <= AndroidUtilities.dp(12.0f);
        if ((z11 && y7Var.getTag() == null) || (!z11 && y7Var.getTag() != null)) {
            y7Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = j8Var.C0;
            if (animatorSet != null) {
                animatorSet.cancel();
                j8Var.C0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            j8Var.C0 = animatorSet2;
            int i10 = 2;
            if (j8Var.u0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y7Var, j8Var.R0, z11 ? 1.0f : 0.0f);
                View view2 = j8Var.b;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(y7Var, (Property<y7, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            j8Var.C0.setDuration(320L);
            j8Var.C0.setInterpolator(wr.h);
            j8Var.C0.addListener(new w7(j8Var, i10));
            j8Var.C0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u7Var.getLayoutParams();
        int D = org.telegram.messenger.em.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (j8Var.A0 != D) {
            j8Var.A0 = D;
            u7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            j8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if ((j8Var.backgroundPaddingTop + ((int) (u7Var.getTranslationY() + ((j8Var.A0 - j8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r1) - j8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2)) : 1.0f) <= 0.5f && i0.a.f(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != j8Var.M0) {
            j8Var.M0 = z10;
            AndroidUtilities.setLightStatusBar(j8Var, z10);
        }
    }

    public static /* synthetic */ void m(j8 j8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = j8Var.w0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!j8Var.w0.list.isEmpty()) {
                NotificationCenter.getInstance(j8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, j8Var.w0);
            } else {
                MediaController.getInstance().cleanup();
                j8Var.dismiss();
            }
        }
    }

    public static void n(j8 j8Var) {
        new wc((FrameLayout) j8Var.containerView, j8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static /* synthetic */ void o(j8 j8Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject) {
        d2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = j8Var.w0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            j8Var.x0.clear();
            j8Var.x0.addAll(j8Var.w0.list);
            j8Var.s.l();
            ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static /* synthetic */ void p(j8 j8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = j8Var.G0;
        int i10 = UserConfig.selectedAccount;
        int i11 = j8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(j8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(j8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.eo(bundle), false, false);
        j8Var.dismiss();
    }

    public static void q(j8 j8Var, w70 w70Var) {
        j8Var.y0(true);
        new wc((FrameLayout) j8Var.containerView, j8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        w70Var.u();
    }

    public static /* synthetic */ void r(j8 j8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new i7(j8Var, tL_error, 3));
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
            j8Var.v0(new MessageObject(j8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new l7(j8Var, 1));
        }
    }

    public static ImageLocation r0(MessageObject messageObject) {
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

    public static void s(j8 j8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.r6.q((FrameLayout) j8Var.containerView, j8Var.resourcesProvider, tL_error, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(j8 j8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.wy wyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        long j3;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(j8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j10 = topicKey.dialogId;
            Bundle i12 = a4.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else if (DialogObject.isUserDialog(j10)) {
                i12.putLong("user_id", j10);
            } else {
                i12.putLong("chat_id", -j10);
            }
            org.telegram.ui.eo eoVar = new org.telegram.ui.eo(i12);
            if (topicKey.topicId != 0) {
                mg.d.a(eoVar, topicKey);
            }
            if (!j8Var.G0.q0(eoVar, true, false)) {
                wyVar.finishFragment();
                return;
            }
            eoVar.Ab(arrayList3);
            if (topicKey.topicId != 0) {
                wyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j11 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j3 = j11;
                SendMessagesHelper.getInstance(j8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(j8Var.currentAccount).sendMessage(arrayList3, j3, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(j8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j3, null, null, null, null, null, null, z10, i10, 0, 0, j8Var.w0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        wyVar.finishFragment();
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R != null) {
            wc.a0(R).Q(R.raw.forward, 36, (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(j8Var.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) ? (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId)) : LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId))).j();
        }
    }

    public static void u(j8 j8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || j8Var.w0 == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.id == 0) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(j8Var.getContext(), 3, null);
            d2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(j8Var.currentAccount).uploadFile(file.getAbsolutePath(), new h7(j8Var, d2Var, document, 0));
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
        MessagesController.SavedMusicList savedMusicList = j8Var.w0;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        j8Var.x0.clear();
        j8Var.x0.addAll(j8Var.w0.list);
        j8Var.s.l();
        ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public static void v(j8 j8Var, MessageObject messageObject, w70 w70Var) {
        j8Var.w0.remove(messageObject);
        j8Var.x0.remove(messageObject);
        j8Var.s.l();
        w70Var.u();
        j8Var.y0(false);
        org.telegram.messenger.a2.o(R.string.AudioSaveToMyProfileUnsaved, new wc((FrameLayout) j8Var.containerView, j8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(j8 j8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.r6.q((FrameLayout) j8Var.containerView, j8Var.resourcesProvider, tL_error, false);
    }

    public static void x(j8 j8Var) {
        FrameLayout frameLayout = (FrameLayout) j8Var.containerView;
        org.telegram.ui.ActionBar.f6 f6Var = j8Var.resourcesProvider;
        new wc(frameLayout, f6Var).o(vc.F, f6Var).j();
    }

    public static /* synthetic */ void y(final j8 j8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j3, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new i7(j8Var, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new r2(j8Var, j3, z11, document, runnable));
            return;
        }
        if (z10 || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new i7(j8Var, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id2 = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(id2));
            final int i10 = 0;
            ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(j8Var) { // from class: org.telegram.ui.Components.j7
                public final /* synthetic */ j8 b;

                {
                    this.b = j8Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i10) {
                        case 0:
                            j8.r(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                        default:
                            j8.A(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id3 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(j8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.id.add(Integer.valueOf(id3));
        final int i11 = 1;
        ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(j8Var) { // from class: org.telegram.ui.Components.j7
            public final /* synthetic */ j8 b;

            {
                this.b = j8Var;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i11) {
                    case 0:
                        j8.r(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                    default:
                        j8.A(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public static /* synthetic */ void z(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(j8Var.currentAccount).getSavedMusicIds().update(j3, z10);
        long clientUserId = UserConfig.getInstance(j8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(j8Var.currentAccount).getUserFull(clientUserId);
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
            MessagesStorage.getInstance(j8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(j8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public final void A0(boolean z10, boolean z11) {
        w9 w9Var = this.j0;
        p7 p7Var = this.i0;
        if (z10) {
            if (p7Var.getVisibility() == 0 || this.m0) {
                return;
            }
            p7Var.setTag(1);
            z7 z7Var = this.I;
            w9Var.setImageBitmap(z7Var.a[z7Var.b].getImageReceiver().getBitmap());
            this.m0 = true;
            km0.d(new z6(this, 1));
            p7Var.setVisibility(0);
            p7Var.animate().alpha(1.0f).setDuration(180L).setListener(new w7(this, 0)).start();
            w9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (p7Var.getVisibility() != 0) {
            return;
        }
        p7Var.setTag(null);
        if (z11) {
            this.m0 = true;
            p7Var.animate().alpha(0.0f).setDuration(180L).setListener(new w7(this, 1)).start();
            w9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            p7Var.setAlpha(0.0f);
            p7Var.setVisibility(4);
            w9Var.setImageBitmap(null);
            w9Var.setScaleX(0.9f);
            w9Var.setScaleY(0.9f);
        }
    }

    public final void B0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        w70 G = w70.G(this.container, this.resourcesProvider, xVar, true);
        if (s0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 0), !this.z0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 1), !this.z0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new e7(this, messageObject, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new di.p2(G, p0(G, messageObject), 6), !this.z0);
            if (!this.z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 3), !this.z0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 4), !this.z0);
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new b7(this, messageObject, 1), messageObject.getId() > 0);
        }
        G.V(LocaleController.isRTL ? 3 : 5);
        G.Z();
    }

    public final void C0() {
        if (this.H0 == 1) {
            this.K0 = System.currentTimeMillis();
            this.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            org.telegram.ui.Cells.l9 l9Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            AndroidUtilities.runOnUIThread(l9Var);
        }
    }

    public final void D0() {
        org.telegram.ui.ActionBar.w0 w0Var = this.V;
        if (w0Var != null) {
            int themedColor = getThemedColor(Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f ? org.telegram.ui.ActionBar.j6.x7 : org.telegram.ui.ActionBar.j6.Qh);
            dd ddVar = this.W;
            if (ddVar != null) {
                ((n6) ddVar.c).r(themedColor);
                Paint paint = (Paint) ddVar.b;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.g1 g1Var = this.P;
        if (g1Var != null) {
            t7 t7Var = this.Q;
            boolean z10 = t7Var != null && t7Var.b();
            final int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.E8);
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.F8);
            int i10 = org.telegram.ui.ActionBar.j6.Oh;
            final int themedColor4 = getThemedColor(i10);
            ValueAnimator valueAnimator = g1Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(g1Var.J ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
            g1Var.I = ofFloat;
            g1Var.J = z10;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.e1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    g1 g1Var2 = g1.this;
                    g1Var2.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i11 = themedColor2;
                    int i12 = themedColor4;
                    g1Var2.setTextColor(i0.a.d(floatValue, i11, i12));
                    g1Var2.setIconColor(i0.a.d(floatValue, themedColor3, i12));
                }
            });
            g1Var.I.addListener(new org.telegram.ui.ActionBar.f1(g1Var, z10, themedColor2, themedColor4, themedColor3));
            g1Var.I.setInterpolator(wr.h);
            g1Var.I.start();
            this.P.setSelectorColor((t7Var == null || !t7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.j6.i6) : org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)));
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
        D0();
        boolean z11 = this.Y;
        int i10 = 0;
        this.Y = false;
        while (true) {
            org.telegram.ui.ActionBar.g1[] g1VarArr = this.Z;
            if (i10 >= g1VarArr.length) {
                return;
            }
            if (z11 || Math.abs(playbackSpeed - U0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.g1 g1Var = g1VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.j6.E8;
                g1Var.c(getThemedColor(i11), getThemedColor(i11));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var2 = g1VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.j6.Qh;
                g1Var2.c(getThemedColor(i12), getThemedColor(i12));
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (org.telegram.messenger.MediaController.getInstance().isMessagePaused() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(MessageObject messageObject, boolean z10) {
        boolean z11;
        float f7;
        int i10;
        b8 b8Var = this.T;
        if (b8Var != null) {
            if (b8Var.v) {
                i10 = (int) (messageObject.getDuration() * b8Var.getProgress());
            } else {
                if (this.I0 >= 0.0f) {
                    int i11 = this.H0;
                    z11 = true;
                    if (i11 != -1) {
                        if (i11 == 1) {
                        }
                    }
                    if (z11) {
                        b8Var.e(messageObject.audioProgress, z10);
                    } else {
                        b8Var.e(this.I0, z10);
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
                        kVar.f();
                    }
                    if (z11) {
                        i10 = messageObject.audioProgressSec;
                    } else {
                        i10 = (int) (messageObject.getDuration() * b8Var.getProgress());
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
            b8Var.g(messageObject);
        }
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.w0 w0Var = this.b0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                w0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.j6.Xi;
                w0Var.setTag(Integer.valueOf(i11));
                w0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.j6.B1(w0Var.getBackground(), getThemedColor(i11) & 436207615, true);
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
            int i12 = org.telegram.ui.ActionBar.j6.Wi;
            w0Var.setTag(Integer.valueOf(i12));
            w0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.j6.B1(w0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.j6.i6), true);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.j6.Xi;
        w0Var.setTag(Integer.valueOf(i13));
        w0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.j6.B1(w0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 != 0) {
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            w0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            w0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    public final void I0() {
        x0(this.e0, SharedConfig.shuffleMusic);
        x0(this.f0, SharedConfig.playOrderReversed);
        x0(this.d0, SharedConfig.repeatMode == 1);
        x0(this.c0, SharedConfig.repeatMode == 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:
    
        if (r2.exists() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(boolean z10) {
        File file;
        w9 w9Var;
        ImageView imageView;
        int i10;
        Bitmap bitmap;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if ((playingMessageObject == null && z10) || (playingMessageObject != null && !playingMessageObject.isMusic())) {
            dismiss();
            return;
        }
        if (playingMessageObject == null) {
            this.y0 = null;
            return;
        }
        boolean z11 = playingMessageObject == this.y0;
        this.y0 = playingMessageObject;
        long j3 = playingMessageObject.eventId;
        org.telegram.ui.ActionBar.w0 w0Var = this.N;
        if (j3 != 0 || playingMessageObject.getId() <= -2000000000) {
            w0Var.setVisibility(4);
        } else {
            w0Var.setVisibility(0);
        }
        long dialogId = playingMessageObject.getDialogId();
        long j10 = playingMessageObject.getDocument() != null ? playingMessageObject.getDocument().id : 0L;
        boolean z12 = (dialogId < 0 && MessagesController.getInstance(this.currentAccount).isPeerNoForwards(dialogId)) || MessagesController.getInstance(this.currentAccount).isPeerNoForwards(playingMessageObject.getDialogId()) || playingMessageObject.messageOwner.noforwards;
        if (z12 != this.z0) {
            this.z0 = z12;
            p7 p7Var = this.E;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p7Var.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z12 || s0()) ? 0 : 52) + 179);
            p7Var.setLayoutParams(layoutParams);
            View view = this.e;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(179 + ((s0() || z12) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        if (z12) {
            w0Var.r(1);
            w0Var.r(2);
            w0Var.r(5);
            w0Var.r(6);
            w0Var.setAdditionalYOffset(-AndroidUtilities.dp(16.0f));
        } else {
            w0Var.K(1);
            w0Var.K(2);
            w0Var.K(5);
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
        boolean z13 = SharedConfig.streamMedia && ((int) playingMessageObject.getDialogId()) != 0 && playingMessageObject.isMusic();
        boolean exists = file.exists();
        ImageView imageView2 = this.g0;
        b8 b8Var = this.T;
        w80 w80Var = this.S;
        if (exists || z13) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            w80Var.setVisibility(4);
            b8Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            w80Var.a(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            w80Var.setVisibility(0);
            b8Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        G0(playingMessageObject, !z11);
        z7 z7Var = this.I;
        w9 w9Var2 = z11 ? z7Var.a[z7Var.b] : z7Var.a[z7Var.b == 0 ? (char) 1 : (char) 0];
        jf.a audioInfo = MediaController.getInstance().getAudioInfo();
        if (!z11) {
            AnimatorSet animatorSet = z7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            z7Var.c = new AnimatorSet();
            int i11 = z7Var.b == 0 ? 1 : 0;
            z7Var.b = i11;
            w9[] w9VarArr = z7Var.a;
            w9 w9Var3 = w9VarArr[i11 ^ 1];
            w9 w9Var4 = w9VarArr[i11];
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
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(wr.g);
            ofFloat.addUpdateListener(new bi.m7(3, w9Var4, hasBitmapImage));
            if (hasBitmapImage) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(w9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(wr.i);
                ofFloat2.addUpdateListener(new gg.t1(9, w9Var3, w9Var4));
                ofFloat2.addListener(new org.telegram.ui.Cells.v5(w9Var3, 19));
                z7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                z7Var.c.play(ofFloat);
            }
            z7Var.c.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.o) == null) {
            this.B0 = FileLoader.getAttachFileName(playingMessageObject.getDocument());
            this.q0 = false;
            String artworkUrl = playingMessageObject.getArtworkUrl(false);
            ImageLocation r02 = r0(playingMessageObject);
            if (TextUtils.isEmpty(artworkUrl)) {
                w9Var = w9Var2;
                imageView = imageView2;
                i10 = 8;
                if (r02 != null) {
                    w9Var.k(null, null, r02, null, 0L, null, playingMessageObject, 1);
                } else {
                    w9Var.setImageDrawable(null);
                }
            } else {
                ImageLocation forPath = ImageLocation.getForPath(artworkUrl);
                imageView = imageView2;
                w9Var = w9Var2;
                i10 = 8;
                w9Var.k(forPath, null, r02, null, 0L, null, playingMessageObject, 1);
            }
            w9Var.invalidate();
        } else {
            w9Var2.setImageBitmap(bitmap);
            this.B0 = null;
            this.q0 = true;
            imageView = imageView2;
            i10 = 8;
        }
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        pg0 pg0Var = this.h0;
        if (isMessagePaused) {
            pg0Var.a(false, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            pg0Var.a(true, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = playingMessageObject.getMusicTitle();
        String musicAuthor = playingMessageObject.getMusicAuthor();
        this.J.setText(musicTitle);
        this.M.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.F.setLoading(savedMusicIds.loading);
        y0(savedMusicIds.ids.contains(Long.valueOf(j10)));
        int duration = (int) playingMessageObject.getDuration();
        this.E0 = duration;
        TextView textView = this.a0;
        if (textView != null) {
            textView.setText(duration != 0 ? AndroidUtilities.formatShortDuration(duration) : "-:--");
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.V;
        if (duration > 600) {
            w0Var2.setVisibility(0);
        } else {
            w0Var2.setVisibility(i10);
        }
        if (z11) {
            return;
        }
        MediaController mediaController = MediaController.getInstance();
        ArrayList<MessageObject> playlist = mediaController.getPlaylist();
        if (playlist.size() <= 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int playingMessageObjectNum = mediaController.getPlayingMessageObjectNum();
        int i12 = playingMessageObjectNum + 1;
        int i13 = playingMessageObjectNum - 1;
        if (i12 >= playlist.size()) {
            i12 = 0;
        }
        if (i12 <= -1) {
            i12 = playlist.size() - 1;
        }
        if (i13 <= -1) {
            i13 = playlist.size() - 1;
        }
        if (i13 >= playlist.size()) {
            i13 = 0;
        }
        arrayList.add(playlist.get(i12));
        if (i12 != i13) {
            arrayList.add(playlist.get(i13));
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i14);
            ImageLocation r03 = r0(messageObject);
            if (r03 != null) {
                if (r03.path != null) {
                    ImageLoader.getInstance().preloadArtwork(r03.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(r03, messageObject, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
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
        u7 u7Var = this.n;
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            int i13 = NotificationCenter.messagePlayingDidReset;
            J0(i10 == i13 && ((Boolean) objArr[1]).booleanValue());
            if (i10 == i13 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = u7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = u7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        xVar.b(false, true);
                    }
                }
                if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        C0();
                    } else if (this.H0 == 1 && this.I0 != -1.0f) {
                        org.telegram.ui.Cells.l9 l9Var = this.N0;
                        AndroidUtilities.cancelRunOnUIThread(l9Var);
                        this.L0 = 0L;
                        l9Var.run();
                        this.I0 = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = u7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = u7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.as asVar = this.O;
            if (asVar != null) {
                asVar.a(b5.d.u());
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
        i8 i8Var = this.s;
        if (i10 == i16) {
            this.w0 = MediaController.getInstance().currentSavedMusicList;
            this.x0 = MediaController.getInstance().getPlaylist();
            i8Var.l();
            return;
        }
        if (i10 == NotificationCenter.moreMusicDidLoad) {
            this.w0 = MediaController.getInstance().currentSavedMusicList;
            this.x0 = MediaController.getInstance().getPlaylist();
            i8Var.l();
            if (SharedConfig.playOrderReversed) {
                u7Var.B0();
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
            kVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
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

    @Override // org.telegram.ui.ActionBar.h3
    public final int getContainerViewHeight() {
        p7 p7Var = this.E;
        if (p7Var == null) {
            return 0;
        }
        if (this.x0.size() <= 1) {
            return p7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.n.getTranslationY() + ((this.A0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.F0;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 0);
        int i10 = org.telegram.ui.ActionBar.j6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 64, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_27, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.j6.h5));
        int i12 = org.telegram.ui.ActionBar.j6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.w7;
        org.telegram.ui.ActionBar.w0 w0Var = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.j6.x7));
        int i15 = org.telegram.ui.ActionBar.j6.Wi;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.b0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, x6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Xi));
        int i16 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, x6Var, i16));
        int i17 = org.telegram.ui.ActionBar.j6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, x6Var, i17));
        int i18 = org.telegram.ui.ActionBar.j6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, x6Var, i18));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 0, null, null, null, x6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 0, null, null, null, x6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 0, null, null, null, x6Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 0, null, null, null, x6Var, i18));
        r7 r7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.l6(r7Var, (Class[]) null, new hj0[]{r7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(r7Var, (Class[]) null, new hj0[]{r7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(r7Var, (Class[]) null, new hj0[]{r7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 131080, null, null, null, null, i16));
        ImageView imageView = this.g0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 131080, null, null, null, null, i16));
        s7 s7Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.l6(s7Var, (Class[]) null, new hj0[]{s7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(s7Var, (Class[]) null, new hj0[]{s7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(s7Var, (Class[]) null, new hj0[]{s7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.W5));
        int i19 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a0, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4, null, null, null, null, i11));
        a8 a8Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.l6(a8Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(a8Var.getNextTextView(), 4, null, null, null, null, i10));
        a8 a8Var2 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.l6(a8Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(a8Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
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
        y7 y7Var = this.c;
        if (y7Var != null && y7Var.n0) {
            y7Var.h(true);
        } else if (this.i0.getTag() != null) {
            A0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        p7 p7Var = this.i0;
        if (view != p7Var) {
            return false;
        }
        p7Var.layout(0, 0, p7Var.getMeasuredWidth(), p7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        p7 p7Var = this.i0;
        if (view != p7Var) {
            return false;
        }
        p7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        this.S.a(Math.min(1.0f, j3 / j10), true);
    }

    public final w70 p0(w70 w70Var, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j3 = document != null ? document.id : 0L;
        w70 J = w70Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(w70Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new e7(this, messageObject, w70Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new e7(this, messageObject, w70Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new e7(this, messageObject, w70Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void q0(MessageObject messageObject) {
        ArrayList l4;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.G0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle e = org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true);
        e.putBoolean("canSelectTopics", true);
        org.telegram.ui.wy wyVar = new org.telegram.ui.wy(e);
        if (messageObject.getId() >= 0) {
            l4 = org.telegram.messenger.a2.l(messageObject);
            tL_document = null;
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            l4 = null;
        }
        wyVar.C2 = new a1.d(this, l4, tL_document, messageObject, 6);
        launchActivity.p0(wyVar);
        dismiss();
    }

    public final boolean s0() {
        MessagesController.SavedMusicList savedMusicList = this.w0;
        return savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        T0 = this;
    }

    public final void t0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || (launchActivity = this.G0) == null) {
            return;
        }
        if (i10 == 1) {
            q0(playingMessageObject);
            return;
        }
        if (i10 == 2) {
            z0(playingMessageObject);
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                u0(playingMessageObject);
                return;
            }
            if (i10 == 6) {
                of.b.d0().o0(MediaController.getInstance().getCurrentChromecastMedia());
                this.Q.performClick();
                return;
            } else {
                if (i10 == 7) {
                    v0(playingMessageObject, false, new b7(this, playingMessageObject, 0), false);
                    return;
                }
                if (i10 == 8) {
                    bi.i9 i9Var = new bi.i9(getContext(), true, null, new d7(this, 0), null);
                    i9Var.h0 = true;
                    i9Var.Z = false;
                    i9Var.q0.N(true);
                    i9Var.show();
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
        launchActivity.q0(new org.telegram.ui.eo(bundle), false, false);
        dismiss();
    }

    public final void u0(MessageObject messageObject) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
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
        if (str2 != null && str2.length() > 0 && !w.f.o(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(str2, this.G0, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new d7(this, 1));
    }

    public final void v0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new g7(this, z11, messageObject, z10, runnable, j3, document));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w0(boolean z10) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            if (z10) {
                u7 u7Var = this.n;
                int childCount = u7Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = u7Var.getChildAt(i10);
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
                s4.c0 c0Var = this.r;
                if (z11) {
                    c0Var.n0(indexOf);
                    return true;
                }
                c0Var.n0(this.x0.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void x0(org.telegram.ui.ActionBar.g1 g1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.j6.Xi;
            g1Var.setTextColor(getThemedColor(i10));
            g1Var.setIconColor(getThemedColor(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.E8;
            g1Var.setTextColor(getThemedColor(i11));
            g1Var.setIconColor(getThemedColor(i11));
        }
    }

    public final void y0(final boolean z10) {
        boolean s02 = s0();
        bi.d dVar = this.G;
        bi.d dVar2 = this.F;
        if (s02 || this.z0) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        wr wrVar = wr.h;
        final int i10 = 0;
        duration.setInterpolator(wrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.c7
            public final /* synthetic */ j8 b;

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
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(wrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.c7
            public final /* synthetic */ j8 b;

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

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r0.exists() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(MessageObject messageObject) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
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

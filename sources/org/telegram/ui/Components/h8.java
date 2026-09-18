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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h8 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static h8 T0;
    public static final float[] U0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public int A0;
    public String B0;
    public AnimatorSet C0;
    public int D0;
    public final n7 E;
    public int E0;
    public final ci.d F;
    public final int F0;
    public final ci.d G;
    public final LaunchActivity G0;
    public final s4.y H;
    public int H0;
    public final x7 I;
    public float I0;
    public final y7 J;
    public int J0;
    public final p7 K;
    public long K0;
    public final q7 L;
    public long L0;
    public final y7 M;
    public boolean M0;
    public final org.telegram.ui.ActionBar.w0 N;
    public final org.telegram.ui.Cells.l7 N0;
    public final org.telegram.ui.as O;
    public org.telegram.ui.jj O0;
    public org.telegram.ui.ActionBar.g1 P;
    public long P0;
    public final r7 Q;
    public float Q0;
    public final boolean R;
    public final org.telegram.ui.Cells.c2 R0;
    public final m80 S;
    public ValueAnimator S0;
    public final z7 T;
    public final org.telegram.ui.ActionBar.k5 U;
    public final org.telegram.ui.ActionBar.w0 V;
    public final cd W;
    public final org.telegram.ui.ActionBar.c1 X;
    public boolean Y;
    public final org.telegram.ui.ActionBar.g1[] Z;
    public final TextView a0;
    public final View b;
    public final org.telegram.ui.ActionBar.w0 b0;
    public final w7 c;
    public final org.telegram.ui.ActionBar.g1 c0;
    public final View d;
    public final org.telegram.ui.ActionBar.g1 d0;
    public final View e;
    public final org.telegram.ui.ActionBar.g1 e0;
    public boolean f;
    public final org.telegram.ui.ActionBar.g1 f0;
    public final ImageView g0;
    public boolean h;
    public final gg0 h0;
    public final n7 i0;
    public final u9 j0;
    public final org.telegram.ui.ActionBar.w0 k0;
    public final org.telegram.ui.ActionBar.w0 l0;
    public boolean m0;
    public final s7 n;
    public final View[] n0;
    public final o1.k o0;
    public long p0;
    public boolean q0;
    public final s4.c0 r;
    public boolean r0;
    public final g8 s;
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
    public h8(Activity activity, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, (Context) activity, f6Var, true);
        org.telegram.ui.ActionBar.a0 a0Var;
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
        this.N0 = new org.telegram.ui.Cells.l7(this, 4);
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
        v7 v7Var = new v7(this, activity);
        this.containerView = v7Var;
        int i12 = 0;
        v7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        w7 w7Var = new w7(this, activity, f6Var, i12);
        this.c = w7Var;
        w7Var.setBackgroundColor(0);
        w7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i14 = org.telegram.ui.ActionBar.j6.Oi;
        w7Var.B(getThemedColor(i14), false);
        w7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.Ni), false);
        w7Var.setTitleColor(getThemedColor(i14));
        w7Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
        w7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.a0 n10 = w7Var.n();
        n10.setLayoutParams(w7.x5.e(-1, -1, 119));
        View view = new View(activity);
        this.b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        w7Var.addView(view, 0, w7.x5.e(-1, -1, 119));
        view.setAlpha(0.0f);
        w7Var.setAlpha(0.0f);
        w7Var.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, i11));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        int i15 = 2;
        n7 n7Var = new n7(this, activity, i15);
        this.E = n7Var;
        x7 x7Var = new x7(this, activity);
        this.I = x7Var;
        n7Var.addView(x7Var, w7.x5.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        y7 y7Var = new y7(this, activity, activity, i12);
        this.J = y7Var;
        n7Var.addView(y7Var, w7.x5.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        y7 y7Var2 = new y7(this, activity, activity, i10);
        this.M = y7Var2;
        n7Var.addView(y7Var2, w7.x5.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        z7 z7Var = new z7(this, activity, f6Var);
        this.T = z7Var;
        z7Var.setLineWidth(4);
        z7Var.setDelegate(new m7(this));
        z7Var.setReportChanges(true);
        n7Var.addView(z7Var, w7.x5.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.k kVar = new o1.k(new o1.j(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.u = lVar;
        kVar.b(new i7(this, i12));
        this.o0 = kVar;
        m80 m80Var = new m80(activity);
        this.S = m80Var;
        m80Var.setVisibility(4);
        m80Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
        m80Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
        n7Var.addView(m80Var, w7.x5.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.U = k5Var;
        k5Var.setTextSize(12);
        k5Var.l("0:00", false);
        int i16 = org.telegram.ui.ActionBar.j6.Si;
        k5Var.setTextColor(getThemedColor(i16));
        k5Var.setImportantForAccessibility(2);
        n7Var.addView(k5Var, w7.x5.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a0 = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i16));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        n7Var.addView(textView, w7.x5.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        final int i17 = 0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, getThemedColor(i16), false, f6Var);
        this.V = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new x6(this, i17));
        cd cdVar = new cd();
        this.W = cdVar;
        w0Var.setIcon(cdVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), f6Var);
        this.X = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new y6(this, i17));
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
        n7Var.addView(w0Var, w7.x5.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new org.telegram.ui.tf(16, this, fArr));
        w0Var.setOnLongClickListener(new ai.q3(i15, this, f6Var));
        F0(false);
        n7 n7Var2 = new n7(this, activity, i17);
        n7Var.addView(n7Var2, w7.x5.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, f6Var);
        this.b0 = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i18 = org.telegram.ui.ActionBar.j6.i6;
        w0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f)));
        n7Var2.addView(w0Var2, w7.x5.e(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z6
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i17) {
                    case 0:
                        h8 h8Var = this.b;
                        h8Var.I0();
                        h8Var.b0.M(null, null);
                        break;
                    default:
                        h8.J(this.b, view4);
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
        w0Var2.setDelegate(new x6(this, i10));
        int i19 = org.telegram.ui.ActionBar.j6.Wi;
        int themedColor = getThemedColor(i19);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        p7 p7Var = new p7(this, activity, scaledTouchSlop);
        this.K = p7Var;
        viewArr[1] = p7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        p7Var.setScaleType(scaleType);
        p7Var.f(R.raw.player_prev, 20, 20, null);
        p7Var.h(themedColor, "Triangle 3");
        p7Var.h(themedColor, "Triangle 4");
        p7Var.h(themedColor, "Rectangle 4");
        p7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f)));
        n7Var2.addView(p7Var, w7.x5.e(48, 48, 51));
        p7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.g0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        gg0 gg0Var = new gg0(28);
        this.h0 = gg0Var;
        imageView.setImageDrawable(gg0Var);
        gg0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i19), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(24.0f)));
        n7Var2.addView(imageView, w7.x5.e(48, 48, 51));
        imageView.setOnClickListener(new ai.e2(8));
        q7 q7Var = new q7(this, activity, scaledTouchSlop);
        this.L = q7Var;
        viewArr[3] = q7Var;
        q7Var.setScaleType(scaleType);
        q7Var.f(R.raw.player_prev, 20, 20, null);
        q7Var.h(themedColor, "Triangle 3");
        q7Var.h(themedColor, "Triangle 4");
        q7Var.h(themedColor, "Rectangle 4");
        q7Var.setRotation(180.0f);
        q7Var.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f)));
        n7Var2.addView(q7Var, w7.x5.e(48, 48, 51));
        q7Var.setContentDescription(LocaleController.getString(R.string.Next));
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
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z6
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        h8 h8Var = this.b;
                        h8Var.I0();
                        h8Var.b0.M(null, null);
                        break;
                    default:
                        h8.J(this.b, view4);
                        break;
                }
            }
        });
        n7Var2.addView(w0Var3, w7.x5.e(48, 48, 51));
        r7 r7Var = new r7(this, activity, 0);
        this.Q = r7Var;
        this.R = true;
        try {
            r7Var.setRouteSelector(d6.a.c(activity).a());
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
        this.N.setDelegate(new x6(this, 2));
        this.N.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, w7.x5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, w7.x5.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.x = textView2;
        int i21 = org.telegram.ui.ActionBar.j6.X5;
        textView2.setTextColor(getThemedColor(i21));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.y = textView3;
        textView3.setTextColor(getThemedColor(i21));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        s7 s7Var = new s7(this, activity);
        this.n = s7Var;
        s7Var.setClipToPadding(false);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        this.r = c0Var;
        s7Var.setLayoutManager(c0Var);
        s7Var.setHorizontalScrollBarEnabled(false);
        s7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(s7Var, w7.x5.e(-1, -1, 51));
        g8 g8Var = new g8(this, activity);
        this.s = g8Var;
        s7Var.setAdapter(g8Var);
        s7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        s7Var.setOnItemClickListener(new k7(0));
        s7Var.setOnItemLongClickListener(new x6(this, 3));
        s7Var.setOnScrollListener(new ai.r(this, 15));
        ci.d dVar = new ci.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.F = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i22 = 0;
        spannableStringBuilder.setSpan(new oq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l7
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i22) {
                    case 0:
                        h8.E(this.b, f6Var);
                        break;
                    default:
                        h8.B(this.b, f6Var);
                        break;
                }
            }
        });
        this.E.addView(dVar, w7.x5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i23 = 1;
        ci.d dVar2 = new ci.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.G = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l7
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i23) {
                    case 0:
                        h8.E(this.b, f6Var);
                        break;
                    default:
                        h8.B(this.b, f6Var);
                        break;
                }
            }
        });
        this.E.addView(dVar2, w7.x5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.w0 = savedMusicList;
        boolean z10 = savedMusicList != null;
        this.u0 = z10;
        this.c.m0 = z10;
        this.v0 = s0();
        this.x0 = MediaController.getInstance().getPlaylist();
        if (s0()) {
            a0Var = n10;
            this.k0 = a0Var.a(8, R.drawable.msg_add);
        } else {
            a0Var = n10;
        }
        org.telegram.ui.ActionBar.w0 a2 = a0Var.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 5);
        this.l0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i24 = org.telegram.ui.ActionBar.j6.Oi;
        searchField.setTextColor(getThemedColor(i24));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
        searchField.setCursorColor(getThemedColor(i24));
        if (z10) {
            s7Var.q1();
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
            this.c.setAlpha(1.0f);
            this.b.setAlpha(0.0f);
            this.R0.set(this.c, Float.valueOf(0.0f));
        }
        boolean z11 = this.x0.size() > 1;
        g8Var.h = z11;
        if (z11) {
            s7Var.setVisibility(0);
            s7Var.setTranslationY(0.0f);
        } else {
            s7Var.setVisibility(8);
            s7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        g8Var.l();
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
                TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(MessagesController.getInstance(this.currentAccount), dialogId);
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
            s4.y yVar = new s4.y(new t7(this));
            this.H = yVar;
            yVar.e(s7Var);
        }
        this.containerView.addView(this.E, w7.x5.e(-1, ((s0() || this.z0) ? 0 : 52) + 179, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.E.getLayoutParams()).height = AndroidUtilities.dp(((s0() || this.z0) ? 0 : 52) + 179);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((s0() || this.z0) ? 0 : 52));
        this.containerView.addView(this.d, w7.x5.c(3.0f, -1));
        this.containerView.addView(this.c);
        n7 n7Var3 = new n7(this, activity, 1);
        this.i0 = n7Var3;
        n7Var3.setAlpha(0.0f);
        n7Var3.setVisibility(4);
        getContainer().addView(n7Var3);
        u9 u9Var = new u9(activity);
        this.j0 = u9Var;
        u9Var.setAspectFit(true);
        u9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        u9Var.setScaleX(0.9f);
        u9Var.setScaleY(0.9f);
        n7Var3.addView(u9Var, w7.x5.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        J0(false);
        H0();
        linearLayout.setVisibility((this.h && g8Var.h() == 0) ? 0 : 8);
        E0();
    }

    public static /* synthetic */ void A(h8 h8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new g7(h8Var, tL_error, 2));
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
            h8Var.v0(new MessageObject(h8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new j7(h8Var, 0));
        }
    }

    public static void B(h8 h8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || h8Var.G0 == null) {
            return;
        }
        h8Var.v0(playingMessageObject, false, new ai.f(24), false);
        h8Var.y0(false);
        org.telegram.messenger.w1.o(R.string.AudioSaveToMyProfileUnsaved, new vc((FrameLayout) h8Var.containerView, f6Var), R.raw.ic_delete, 36);
    }

    public static void E(h8 h8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || h8Var.G0 == null) {
            return;
        }
        h8Var.v0(playingMessageObject, true, new ai.f(24), false);
        h8Var.y0(true);
        org.telegram.messenger.w1.o(R.string.AudioSaveToMyProfileSaved, new vc((FrameLayout) h8Var.containerView, f6Var), R.raw.saved_messages, 36);
    }

    public static void F(h8 h8Var, float[] fArr) {
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
        if (currentTimeMillis - h8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && h8Var.containerView != null) {
                org.telegram.ui.jj jjVar = new org.telegram.ui.jj(5, 1, h8Var.getContext(), null, z10);
                h8Var.O0 = jjVar;
                jjVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                h8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                h8Var.E.addView(h8Var.O0, w7.x5.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                h8Var.O0.f(h8Var.V, true);
            }
        }
        h8Var.P0 = currentTimeMillis;
    }

    public static void G(h8 h8Var) {
        new vc((FrameLayout) h8Var.containerView, h8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void H(h8 h8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.p6.q((FrameLayout) h8Var.containerView, h8Var.resourcesProvider, tL_error, false);
    }

    public static void I(h8 h8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.p6.q((FrameLayout) h8Var.containerView, h8Var.resourcesProvider, tL_error, false);
    }

    public static void J(h8 h8Var, View view) {
        r7 r7Var = h8Var.Q;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        n70 G = n70.G(h8Var.container, h8Var.resourcesProvider, view, true);
        n70 p02 = h8Var.p0(G, playingMessageObject);
        if (!h8Var.s0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ei.m2(G, p02, 7), !h8Var.z0);
            if (!h8Var.z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(h8Var, G, 0), !h8Var.z0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new e7(h8Var, G, 1), !h8Var.z0);
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new e7(h8Var, G, 2), playingMessageObject.getId() > 0);
        if (h8Var.R) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.e, G.d, false, false);
            G.d(g1Var);
            h8Var.P = g1Var;
            g1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            h8Var.P.setOnClickListener(new org.telegram.ui.tf(17, h8Var, G));
            AndroidUtilities.removeFromParent(r7Var);
            h8Var.P.addView(r7Var, 0, w7.x5.c(-1.0f, -1));
            h8Var.D0();
        }
        G.m(h8Var.s0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new e7(h8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static /* synthetic */ void K(h8 h8Var, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            c2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(h8Var.currentAccount).getInputPeer(UserConfig.getInstance(h8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(h8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.qo(4, h8Var, c2Var));
    }

    public static void L(h8 h8Var, MessageObject messageObject, n70 n70Var) {
        ArrayList<MessageObject> l4;
        int i10;
        long clientUserId = UserConfig.getInstance(h8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = h8Var.currentAccount;
        if (i11 != i12) {
            h8Var.G0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                l4 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i10 = 36;
            n70Var.u();
            org.telegram.messenger.w1.o(R.string.AudioSaveToSavedMessagesSaved, new vc((FrameLayout) h8Var.containerView, h8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        l4 = org.telegram.messenger.w1.l(messageObject);
        if (l4 != null) {
            SendMessagesHelper.getInstance(h8Var.currentAccount).sendMessage(l4, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(h8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, h8Var.w0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            i10 = 36;
            vc.a0(R).Q(R.raw.forward, 36, clientUserId == UserConfig.getInstance(h8Var.currentAccount).getClientUserId() ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : clientUserId > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId))).j();
            n70Var.u();
            org.telegram.messenger.w1.o(R.string.AudioSaveToSavedMessagesSaved, new vc((FrameLayout) h8Var.containerView, h8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        i10 = 36;
        n70Var.u();
        org.telegram.messenger.w1.o(R.string.AudioSaveToSavedMessagesSaved, new vc((FrameLayout) h8Var.containerView, h8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void P(h8 h8Var) {
        View view = h8Var.d;
        w7 w7Var = h8Var.c;
        s7 s7Var = h8Var.n;
        if (s7Var.getChildCount() <= 0) {
            int paddingTop = s7Var.getPaddingTop();
            h8Var.A0 = paddingTop;
            s7Var.setTopGlowOffset(paddingTop);
            h8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = s7Var.getChildAt(0);
        wk0 wk0Var = (wk0) s7Var.H(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.x ? childAt.getTop() : childAt.getBottom();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wk0Var == null || wk0Var.b() != 0) {
            top = dp;
        }
        boolean z11 = top <= AndroidUtilities.dp(12.0f);
        if ((z11 && w7Var.getTag() == null) || (!z11 && w7Var.getTag() != null)) {
            w7Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = h8Var.C0;
            if (animatorSet != null) {
                animatorSet.cancel();
                h8Var.C0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            h8Var.C0 = animatorSet2;
            int i10 = 2;
            if (h8Var.u0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w7Var, h8Var.R0, z11 ? 1.0f : 0.0f);
                View view2 = h8Var.b;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(w7Var, (Property<w7, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            h8Var.C0.setDuration(320L);
            h8Var.C0.setInterpolator(qr.h);
            h8Var.C0.addListener(new u7(h8Var, i10));
            h8Var.C0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s7Var.getLayoutParams();
        int D = org.telegram.messenger.wl.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (h8Var.A0 != D) {
            h8Var.A0 = D;
            s7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            h8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if ((h8Var.backgroundPaddingTop + ((int) (s7Var.getTranslationY() + ((h8Var.A0 - h8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - h8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2)) : 1.0f) <= 0.5f && i0.a.f(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != h8Var.M0) {
            h8Var.M0 = z10;
            AndroidUtilities.setLightStatusBar(h8Var, z10);
        }
    }

    public static /* synthetic */ void m(h8 h8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = h8Var.w0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!h8Var.w0.list.isEmpty()) {
                NotificationCenter.getInstance(h8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, h8Var.w0);
            } else {
                MediaController.getInstance().cleanup();
                h8Var.dismiss();
            }
        }
    }

    public static void n(h8 h8Var) {
        new vc((FrameLayout) h8Var.containerView, h8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static /* synthetic */ void o(h8 h8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = h8Var.w0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            h8Var.x0.clear();
            h8Var.x0.addAll(h8Var.w0.list);
            h8Var.s.l();
            ConnectionsManager.getInstance(h8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static /* synthetic */ void p(h8 h8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = h8Var.G0;
        int i10 = UserConfig.selectedAccount;
        int i11 = h8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(h8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(h8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.bo(bundle), false, false);
        h8Var.dismiss();
    }

    public static void q(h8 h8Var, n70 n70Var) {
        h8Var.y0(true);
        new vc((FrameLayout) h8Var.containerView, h8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        n70Var.u();
    }

    public static /* synthetic */ void r(h8 h8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new g7(h8Var, tL_error, 3));
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
            h8Var.v0(new MessageObject(h8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new j7(h8Var, 1));
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

    public static void s(h8 h8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.p6.q((FrameLayout) h8Var.containerView, h8Var.resourcesProvider, tL_error, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(h8 h8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.wy wyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        long j3;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(h8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
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
            org.telegram.ui.bo boVar = new org.telegram.ui.bo(i12);
            if (topicKey.topicId != 0) {
                ng.d.a(boVar, topicKey);
            }
            if (!h8Var.G0.q0(boVar, true, false)) {
                wyVar.finishFragment();
                return;
            }
            boVar.Ab(arrayList3);
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
                SendMessagesHelper.getInstance(h8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(h8Var.currentAccount).sendMessage(arrayList3, j3, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(h8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j3, null, null, null, null, null, null, z10, i10, 0, 0, h8Var.w0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        wyVar.finishFragment();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            vc.a0(R).Q(R.raw.forward, 36, (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(h8Var.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) ? (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId)) : LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId))).j();
        }
    }

    public static void u(h8 h8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || h8Var.w0 == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.id == 0) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(h8Var.getContext(), 3, null);
            c2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(h8Var.currentAccount).uploadFile(file.getAbsolutePath(), new ai.d5(h8Var, c2Var, document, 3));
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
        MessagesController.SavedMusicList savedMusicList = h8Var.w0;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        h8Var.x0.clear();
        h8Var.x0.addAll(h8Var.w0.list);
        h8Var.s.l();
        ConnectionsManager.getInstance(h8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public static void v(h8 h8Var, MessageObject messageObject, n70 n70Var) {
        h8Var.w0.remove(messageObject);
        h8Var.x0.remove(messageObject);
        h8Var.s.l();
        n70Var.u();
        h8Var.y0(false);
        org.telegram.messenger.w1.o(R.string.AudioSaveToMyProfileUnsaved, new vc((FrameLayout) h8Var.containerView, h8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(h8 h8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.p6.q((FrameLayout) h8Var.containerView, h8Var.resourcesProvider, tL_error, false);
    }

    public static void x(h8 h8Var) {
        FrameLayout frameLayout = (FrameLayout) h8Var.containerView;
        org.telegram.ui.ActionBar.f6 f6Var = h8Var.resourcesProvider;
        new vc(frameLayout, f6Var).o(uc.F, f6Var).j();
    }

    public static /* synthetic */ void y(final h8 h8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j3, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new g7(h8Var, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new p2(h8Var, j3, z11, document, runnable));
            return;
        }
        if (z10 || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new g7(h8Var, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id2 = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(id2));
            final int i10 = 0;
            ConnectionsManager.getInstance(h8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(h8Var) { // from class: org.telegram.ui.Components.h7
                public final /* synthetic */ h8 b;

                {
                    this.b = h8Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i10) {
                        case 0:
                            h8.r(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                        default:
                            h8.A(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id3 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(h8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.id.add(Integer.valueOf(id3));
        final int i11 = 1;
        ConnectionsManager.getInstance(h8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(h8Var) { // from class: org.telegram.ui.Components.h7
            public final /* synthetic */ h8 b;

            {
                this.b = h8Var;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i11) {
                    case 0:
                        h8.r(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                    default:
                        h8.A(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public static /* synthetic */ void z(h8 h8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(h8Var.currentAccount).getSavedMusicIds().update(j3, z10);
        long clientUserId = UserConfig.getInstance(h8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(h8Var.currentAccount).getUserFull(clientUserId);
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
            MessagesStorage.getInstance(h8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(h8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public final void A0(boolean z10, boolean z11) {
        u9 u9Var = this.j0;
        n7 n7Var = this.i0;
        if (z10) {
            if (n7Var.getVisibility() == 0 || this.m0) {
                return;
            }
            n7Var.setTag(1);
            x7 x7Var = this.I;
            u9Var.setImageBitmap(x7Var.a[x7Var.b].getImageReceiver().getBitmap());
            this.m0 = true;
            bm0.d(new y6(this, 1));
            n7Var.setVisibility(0);
            n7Var.animate().alpha(1.0f).setDuration(180L).setListener(new u7(this, 0)).start();
            u9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (n7Var.getVisibility() != 0) {
            return;
        }
        n7Var.setTag(null);
        if (z11) {
            this.m0 = true;
            n7Var.animate().alpha(0.0f).setDuration(180L).setListener(new u7(this, 1)).start();
            u9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            n7Var.setAlpha(0.0f);
            n7Var.setVisibility(4);
            u9Var.setImageBitmap(null);
            u9Var.setScaleX(0.9f);
            u9Var.setScaleY(0.9f);
        }
    }

    public final void B0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        n70 G = n70.G(this.container, this.resourcesProvider, xVar, true);
        if (s0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new d7(this, G, messageObject, 0), !this.z0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new d7(this, G, messageObject, 1), !this.z0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new d7(this, messageObject, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ei.m2(G, p0(G, messageObject), 6), !this.z0);
            if (!this.z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new d7(this, G, messageObject, 3), !this.z0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new d7(this, G, messageObject, 4), !this.z0);
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new a7(this, messageObject, 1), messageObject.getId() > 0);
        }
        G.V(LocaleController.isRTL ? 3 : 5);
        G.Z();
    }

    public final void C0() {
        if (this.H0 == 1) {
            this.K0 = System.currentTimeMillis();
            this.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            org.telegram.ui.Cells.l7 l7Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var);
        }
    }

    public final void D0() {
        org.telegram.ui.ActionBar.w0 w0Var = this.V;
        if (w0Var != null) {
            int themedColor = getThemedColor(Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f ? org.telegram.ui.ActionBar.j6.x7 : org.telegram.ui.ActionBar.j6.Qh);
            cd cdVar = this.W;
            if (cdVar != null) {
                ((m6) cdVar.c).r(themedColor);
                Paint paint = (Paint) cdVar.b;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.g1 g1Var = this.P;
        if (g1Var != null) {
            r7 r7Var = this.Q;
            boolean z10 = r7Var != null && r7Var.b();
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
            g1Var.I.setInterpolator(qr.h);
            g1Var.I.start();
            this.P.setSelectorColor((r7Var == null || !r7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.j6.i6) : org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)));
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
        z7 z7Var = this.T;
        if (z7Var != null) {
            if (z7Var.v) {
                i10 = (int) (messageObject.getDuration() * z7Var.getProgress());
            } else {
                if (this.I0 >= 0.0f) {
                    int i11 = this.H0;
                    z11 = true;
                    if (i11 != -1) {
                        if (i11 == 1) {
                        }
                    }
                    if (z11) {
                        z7Var.e(messageObject.audioProgress, z10);
                    } else {
                        z7Var.e(this.I0, z10);
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
                        i10 = (int) (messageObject.getDuration() * z7Var.getProgress());
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
            z7Var.g(messageObject);
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
        MessageObject messageObject;
        MessageObject messageObject2;
        u9 u9Var;
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
            n7 n7Var = this.E;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n7Var.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z12 || s0()) ? 0 : 52) + 179);
            n7Var.setLayoutParams(layoutParams);
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
        z7 z7Var = this.T;
        m80 m80Var = this.S;
        if (exists || z13) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            m80Var.setVisibility(4);
            z7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            m80Var.a(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            m80Var.setVisibility(0);
            z7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        G0(playingMessageObject, !z11);
        x7 x7Var = this.I;
        u9 u9Var2 = z11 ? x7Var.a[x7Var.b] : x7Var.a[x7Var.b == 0 ? (char) 1 : (char) 0];
        jf.a audioInfo = MediaController.getInstance().getAudioInfo();
        if (z11) {
            messageObject = playingMessageObject;
        } else {
            AnimatorSet animatorSet = x7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            x7Var.c = new AnimatorSet();
            int i11 = x7Var.b == 0 ? 1 : 0;
            x7Var.b = i11;
            u9[] u9VarArr = x7Var.a;
            u9 u9Var3 = u9VarArr[i11 ^ 1];
            u9 u9Var4 = u9VarArr[i11];
            boolean hasBitmapImage = u9Var3.getImageReceiver().hasBitmapImage();
            u9Var4.setAlpha(hasBitmapImage ? 1.0f : 0.0f);
            u9Var4.setScaleX(0.8f);
            u9Var4.setScaleY(0.8f);
            u9Var4.setVisibility(0);
            if (hasBitmapImage) {
                u9Var3.bringToFront();
            } else {
                u9Var3.setVisibility(8);
                u9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            messageObject = playingMessageObject;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(qr.g);
            ofFloat.addUpdateListener(new ai.bb(4, u9Var4, hasBitmapImage));
            if (hasBitmapImage) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(u9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(qr.i);
                ofFloat2.addUpdateListener(new ai.x(11, u9Var3, u9Var4));
                ofFloat2.addListener(new org.telegram.ui.t4(u9Var3, 29));
                x7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                x7Var.c.play(ofFloat);
            }
            x7Var.c.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.o) == null) {
            this.B0 = FileLoader.getAttachFileName(messageObject.getDocument());
            this.q0 = false;
            messageObject2 = messageObject;
            String artworkUrl = messageObject2.getArtworkUrl(false);
            ImageLocation r02 = r0(messageObject2);
            if (TextUtils.isEmpty(artworkUrl)) {
                u9Var = u9Var2;
                imageView = imageView2;
                i10 = 8;
                if (r02 != null) {
                    u9Var.k(null, null, r02, null, 0L, null, messageObject2, 1);
                } else {
                    u9Var.setImageDrawable(null);
                }
            } else {
                ImageLocation forPath = ImageLocation.getForPath(artworkUrl);
                imageView = imageView2;
                u9Var = u9Var2;
                i10 = 8;
                u9Var.k(forPath, null, r02, null, 0L, null, messageObject2, 1);
            }
            u9Var.invalidate();
        } else {
            u9Var2.setImageBitmap(bitmap);
            this.B0 = null;
            this.q0 = true;
            imageView = imageView2;
            messageObject2 = messageObject;
            i10 = 8;
        }
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        gg0 gg0Var = this.h0;
        if (isMessagePaused) {
            gg0Var.a(false, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            gg0Var.a(true, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = messageObject2.getMusicTitle();
        String musicAuthor = messageObject2.getMusicAuthor();
        this.J.setText(musicTitle);
        this.M.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.F.setLoading(savedMusicIds.loading);
        y0(savedMusicIds.ids.contains(Long.valueOf(j10)));
        int duration = (int) messageObject2.getDuration();
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
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            ImageLocation r03 = r0(messageObject3);
            if (r03 != null) {
                if (r03.path != null) {
                    ImageLoader.getInstance().preloadArtwork(r03.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(r03, messageObject3, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
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
        s7 s7Var = this.n;
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            int i13 = NotificationCenter.messagePlayingDidReset;
            J0(i10 == i13 && ((Boolean) objArr[1]).booleanValue());
            if (i10 == i13 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = s7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = s7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        xVar.b(false, true);
                    }
                }
                if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        C0();
                    } else if (this.H0 == 1 && this.I0 != -1.0f) {
                        org.telegram.ui.Cells.l7 l7Var = this.N0;
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        this.L0 = 0L;
                        l7Var.run();
                        this.I0 = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = s7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = s7Var.getChildAt(i15);
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
        g8 g8Var = this.s;
        if (i10 == i16) {
            this.w0 = MediaController.getInstance().currentSavedMusicList;
            this.x0 = MediaController.getInstance().getPlaylist();
            g8Var.l();
            return;
        }
        if (i10 == NotificationCenter.moreMusicDidLoad) {
            this.w0 = MediaController.getInstance().currentSavedMusicList;
            this.x0 = MediaController.getInstance().getPlaylist();
            g8Var.l();
            if (SharedConfig.playOrderReversed) {
                s7Var.C0();
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

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
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

    @Override // org.telegram.ui.ActionBar.g3
    public final int getContainerViewHeight() {
        n7 n7Var = this.E;
        if (n7Var == null) {
            return 0;
        }
        if (this.x0.size() <= 1) {
            return n7Var.getMeasuredHeight() + this.backgroundPaddingTop;
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

    @Override // org.telegram.ui.ActionBar.g3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        w6 w6Var = new w6(this, 0);
        int i10 = org.telegram.ui.ActionBar.j6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 64, null, null, null, w6Var, i10));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, w6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.j6.Xi));
        int i16 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, w6Var, i16));
        int i17 = org.telegram.ui.ActionBar.j6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, w6Var, i17));
        int i18 = org.telegram.ui.ActionBar.j6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, w6Var, i18));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 0, null, null, null, w6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 0, null, null, null, w6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 0, null, null, null, w6Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 0, null, null, null, w6Var, i18));
        p7 p7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.l6(p7Var, (Class[]) null, new yi0[]{p7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(p7Var, (Class[]) null, new yi0[]{p7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(p7Var, (Class[]) null, new yi0[]{p7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 131080, null, null, null, null, i16));
        ImageView imageView = this.g0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 131080, null, null, null, null, i16));
        q7 q7Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.l6(q7Var, (Class[]) null, new yi0[]{q7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(q7Var, (Class[]) null, new yi0[]{q7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(q7Var, (Class[]) null, new yi0[]{q7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
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
        y7 y7Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y7Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y7Var.getNextTextView(), 4, null, null, null, null, i10));
        y7 y7Var2 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y7Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y7Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g3
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

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        w7 w7Var = this.c;
        if (w7Var != null && w7Var.n0) {
            w7Var.h(true);
        } else if (this.i0.getTag() != null) {
            A0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        n7 n7Var = this.i0;
        if (view != n7Var) {
            return false;
        }
        n7Var.layout(0, 0, n7Var.getMeasuredWidth(), n7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        n7 n7Var = this.i0;
        if (view != n7Var) {
            return false;
        }
        n7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        this.S.a(Math.min(1.0f, j3 / j10), true);
    }

    public final n70 p0(n70 n70Var, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j3 = document != null ? document.id : 0L;
        n70 J = n70Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.ou0(n70Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new d7(this, messageObject, n70Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new d7(this, messageObject, n70Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new d7(this, messageObject, n70Var, 8), false);
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
        Bundle e = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
        e.putBoolean("canSelectTopics", true);
        org.telegram.ui.wy wyVar = new org.telegram.ui.wy(e);
        if (messageObject.getId() >= 0) {
            l4 = org.telegram.messenger.w1.l(messageObject);
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

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
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
                of.b.M().T(MediaController.getInstance().getCurrentChromecastMedia());
                this.Q.performClick();
                return;
            } else {
                if (i10 == 7) {
                    v0(playingMessageObject, false, new a7(this, playingMessageObject, 0), false);
                    return;
                }
                if (i10 == 8) {
                    ci.g8 g8Var = new ci.g8(getContext(), true, null, new c7(this, 0), null);
                    g8Var.h0 = true;
                    g8Var.Z = false;
                    g8Var.q0.N(true);
                    g8Var.show();
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
        launchActivity.q0(new org.telegram.ui.bo(bundle), false, false);
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
        MediaController.saveFile(str2, this.G0, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new c7(this, 1));
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new f7(this, z11, messageObject, z10, runnable, j3, document));
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
                s7 s7Var = this.n;
                int childCount = s7Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = s7Var.getChildAt(i10);
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
        ci.d dVar = this.G;
        ci.d dVar2 = this.F;
        if (s02 || this.z0) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        qr qrVar = qr.h;
        final int i10 = 0;
        duration.setInterpolator(qrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.b7
            public final /* synthetic */ h8 b;

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
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(qrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.b7
            public final /* synthetic */ h8 b;

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

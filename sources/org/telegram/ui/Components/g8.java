package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static g8 P0;
    public static final float[] Q0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final n7 A;
    public int A0;
    public final nh.d B;
    public final int B0;
    public final nh.d C;
    public final LaunchActivity C0;
    public final f2.e0 D;
    public int D0;
    public final w7 E;
    public float E0;
    public final x7 F;
    public int F0;
    public final p7 G;
    public long G0;
    public final q7 H;
    public long H0;
    public final x7 I;
    public boolean I0;
    public final org.telegram.ui.ActionBar.w0 J;
    public final lh.m7 J0;
    public final org.telegram.ui.nr K;
    public org.telegram.ui.zi K0;
    public org.telegram.ui.ActionBar.g1 L;
    public long L0;
    public final r7 M;
    public float M0;
    public final boolean N;
    public final org.telegram.ui.Cells.b2 N0;
    public final i80 O;
    public ValueAnimator O0;
    public final y7 P;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final org.telegram.ui.ActionBar.w0 R;
    public final cf.f S;
    public final org.telegram.ui.ActionBar.c1 T;
    public boolean U;
    public final org.telegram.ui.ActionBar.g1[] V;
    public final TextView W;
    public final org.telegram.ui.ActionBar.w0 X;
    public final org.telegram.ui.ActionBar.g1 Y;
    public final org.telegram.ui.ActionBar.g1 Z;
    public final org.telegram.ui.ActionBar.g1 a0;
    public final View b;
    public final org.telegram.ui.ActionBar.g1 b0;
    public final cg.m1 c;
    public final ImageView c0;
    public final View d;
    public final cg0 d0;
    public final View e;
    public final n7 e0;
    public boolean f;
    public final t9 f0;
    public final org.telegram.ui.ActionBar.w0 g0;
    public boolean h;
    public final org.telegram.ui.ActionBar.w0 h0;
    public boolean i0;
    public final View[] j0;
    public final o1.k k0;
    public long l0;
    public boolean m0;
    public final s7 n;
    public boolean n0;
    public int o0;
    public int p0;
    public final boolean q0;
    public final f2.j0 r;
    public final boolean r0;
    public final f8 s;
    public MessagesController.SavedMusicList s0;
    public ArrayList t0;
    public MessageObject u0;
    public final LinearLayout v;
    public boolean v0;
    public final ImageView w;
    public int w0;
    public final TextView x;
    public String x0;
    public final TextView y;
    public AnimatorSet y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(Activity activity, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var, true, false);
        org.telegram.ui.ActionBar.a0 a0Var;
        float f9;
        TLRPC.User user;
        int i10 = 1;
        final int i11 = 0;
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[6];
        this.V = g1VarArr;
        View[] viewArr = new View[5];
        this.j0 = viewArr;
        this.n0 = true;
        this.o0 = -1;
        this.w0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.E0 = -1.0f;
        this.J0 = new lh.m7(this, 14);
        this.N0 = new org.telegram.ui.Cells.b2(this);
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.C0 = (LaunchActivity) activity;
        this.B0 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        v7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        cg.m1 m1Var = new cg.m1(this, activity, c6Var, i10);
        this.c = m1Var;
        m1Var.setBackgroundColor(0);
        m1Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.g6.Oi;
        m1Var.C(getThemedColor(i13), false);
        m1Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.Ni), false);
        m1Var.setTitleColor(getThemedColor(i13));
        m1Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.Pi));
        m1Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.a0 n10 = m1Var.n();
        n10.setLayoutParams(i7.f6.e(-1, -1, 119));
        View view = new View(activity);
        this.b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
        m1Var.addView(view, 0, i7.f6.e(-1, -1, 119));
        view.setAlpha(0.0f);
        m1Var.setAlpha(0.0f);
        m1Var.setActionBarMenuOnItemClick(new cg.n1(this, 23));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        n7 n7Var = new n7(this, activity, 2);
        this.A = n7Var;
        w7 w7Var = new w7(this, activity);
        this.E = w7Var;
        n7Var.addView(w7Var, i7.f6.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        x7 x7Var = new x7(this, activity, activity, i11);
        this.F = x7Var;
        n7Var.addView(x7Var, i7.f6.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        x7 x7Var2 = new x7(this, activity, activity, i10);
        this.I = x7Var2;
        n7Var.addView(x7Var2, i7.f6.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        y7 y7Var = new y7(this, activity, c6Var);
        this.P = y7Var;
        int i14 = 4;
        y7Var.setLineWidth(4);
        y7Var.setDelegate(new m7(this));
        y7Var.setReportChanges(true);
        n7Var.addView(y7Var, i7.f6.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.k kVar = new o1.k(new ib.a(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.u = lVar;
        kVar.b(new j7(this, i11));
        this.k0 = kVar;
        i80 i80Var = new i80(activity);
        this.O = i80Var;
        i80Var.setVisibility(4);
        i80Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
        i80Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
        n7Var.addView(i80Var, i7.f6.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.Q = h5Var;
        h5Var.setTextSize(12);
        h5Var.l("0:00", false);
        int i15 = org.telegram.ui.ActionBar.g6.Si;
        h5Var.setTextColor(getThemedColor(i15));
        h5Var.setImportantForAccessibility(2);
        n7Var.addView(h5Var, i7.f6.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.W = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i15));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        n7Var.addView(textView, i7.f6.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        int i16 = 2;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, getThemedColor(i15), false, c6Var);
        this.R = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new y6(this, i11));
        cf.f fVar = new cf.f();
        this.S = fVar;
        w0Var.setIcon(fVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), c6Var);
        this.T = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new z6(this, i11));
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
        n7Var.addView(w0Var, i7.f6.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new t2(i14, this, fArr));
        w0Var.setOnLongClickListener(new lh.e2(i16, this, c6Var));
        F0(false);
        n7 n7Var2 = new n7(this, activity, i11);
        n7Var.addView(n7Var2, i7.f6.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, c6Var);
        this.X = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i17 = org.telegram.ui.ActionBar.g6.i6;
        w0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(18.0f)));
        n7Var2.addView(w0Var2, i7.f6.e(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a7
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i11) {
                    case 0:
                        g8 g8Var = this.b;
                        g8Var.I0();
                        g8Var.X.M(null, null);
                        break;
                    default:
                        g8.I(this.b, view4);
                        break;
                }
            }
        });
        this.Y = w0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.Z = w0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.a0 = w0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.b0 = w0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        w0Var2.setShowedFromBottom(true);
        w0Var2.setDelegate(new y6(this, i10));
        int i18 = org.telegram.ui.ActionBar.g6.Wi;
        int themedColor = getThemedColor(i18);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        p7 p7Var = new p7(this, activity, scaledTouchSlop);
        this.G = p7Var;
        viewArr[1] = p7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        p7Var.setScaleType(scaleType);
        p7Var.f(R.raw.player_prev, 20, 20, null);
        p7Var.h(themedColor, "Triangle 3");
        p7Var.h(themedColor, "Triangle 4");
        p7Var.h(themedColor, "Rectangle 4");
        p7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(22.0f)));
        n7Var2.addView(p7Var, i7.f6.e(48, 48, 51));
        p7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.c0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        cg0 cg0Var = new cg0(28);
        this.d0 = cg0Var;
        imageView.setImageDrawable(cg0Var);
        cg0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(24.0f)));
        n7Var2.addView(imageView, i7.f6.e(48, 48, 51));
        imageView.setOnClickListener(new bg.n(12));
        q7 q7Var = new q7(this, activity, scaledTouchSlop);
        this.H = q7Var;
        viewArr[3] = q7Var;
        q7Var.setScaleType(scaleType);
        q7Var.f(R.raw.player_prev, 20, 20, null);
        q7Var.h(themedColor, "Triangle 3");
        q7Var.h(themedColor, "Triangle 4");
        q7Var.h(themedColor, "Rectangle 4");
        q7Var.setRotation(180.0f);
        q7Var.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(22.0f)));
        n7Var2.addView(q7Var, i7.f6.e(48, 48, 51));
        q7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor, false, c6Var);
        this.J = w0Var3;
        viewArr[4] = w0Var3;
        org.telegram.ui.nr nrVar = new org.telegram.ui.nr(activity, R.drawable.ic_ab_other, c6Var);
        this.K = nrVar;
        w0Var3.setIcon(nrVar);
        w0Var3.setLongClickEnabled(false);
        w0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i19 = 1;
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(18.0f)));
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a7
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i19) {
                    case 0:
                        g8 g8Var = this.b;
                        g8Var.I0();
                        g8Var.X.M(null, null);
                        break;
                    default:
                        g8.I(this.b, view4);
                        break;
                }
            }
        });
        n7Var2.addView(w0Var3, i7.f6.e(48, 48, 51));
        r7 r7Var = new r7(this, activity, 0);
        this.M = r7Var;
        this.N = true;
        try {
            r7Var.setRouteSelector(p5.a.c(activity).a());
        } catch (Exception e10) {
            FileLog.e(e10);
            this.N = false;
        }
        this.M.setVisibility(4);
        org.telegram.ui.nr nrVar2 = this.K;
        if (nrVar2 != null) {
            nrVar2.a(d1.f.u());
        }
        this.J.setShowedFromBottom(true);
        this.J.setDelegate(new y6(this, 2));
        this.J.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, i7.f6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new mh.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, i7.f6.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.x = textView2;
        int i20 = org.telegram.ui.ActionBar.g6.X5;
        textView2.setTextColor(getThemedColor(i20));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.y = textView3;
        textView3.setTextColor(getThemedColor(i20));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, i7.f6.t(-2, -2, 17, 0, 6, 0, 0));
        s7 s7Var = new s7(this, activity);
        this.n = s7Var;
        s7Var.setClipToPadding(false);
        getContext();
        f2.j0 j0Var = new f2.j0(1, false);
        this.r = j0Var;
        s7Var.setLayoutManager(j0Var);
        s7Var.setHorizontalScrollBarEnabled(false);
        s7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(s7Var, i7.f6.e(-1, -1, 51));
        f8 f8Var = new f8(this, activity);
        this.s = f8Var;
        s7Var.setAdapter(f8Var);
        s7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        s7Var.setOnItemClickListener(new ih.a(2));
        s7Var.setOnItemLongClickListener(new y6(this, 3));
        s7Var.setOnScrollListener(new cg.g2(this, 17));
        nh.d dVar = new nh.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.B = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i21 = 0;
        spannableStringBuilder.setSpan(new iq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l7
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i21) {
                    case 0:
                        g8.D(this.b, c6Var);
                        break;
                    default:
                        g8.C(this.b, c6Var);
                        break;
                }
            }
        });
        this.A.addView(dVar, i7.f6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i22 = 1;
        nh.d dVar2 = new nh.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.C = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l7
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i22) {
                    case 0:
                        g8.D(this.b, c6Var);
                        break;
                    default:
                        g8.C(this.b, c6Var);
                        break;
                }
            }
        });
        this.A.addView(dVar2, i7.f6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.s0 = savedMusicList;
        boolean z10 = savedMusicList != null;
        this.q0 = z10;
        this.c.i0 = z10;
        this.r0 = s0();
        this.t0 = MediaController.getInstance().getPlaylist();
        if (s0()) {
            a0Var = n10;
            this.g0 = a0Var.a(8, R.drawable.msg_add);
        } else {
            a0Var = n10;
        }
        org.telegram.ui.ActionBar.w0 a2 = a0Var.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.bb(this, 3);
        this.h0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i23 = org.telegram.ui.ActionBar.g6.Oi;
        searchField.setTextColor(getThemedColor(i23));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Si));
        searchField.setCursorColor(getThemedColor(i23));
        if (z10) {
            s7Var.p1();
            setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, c6Var));
            this.c.setAlpha(1.0f);
            f9 = 0.0f;
            this.b.setAlpha(0.0f);
            this.N0.set(this.c, Float.valueOf(0.0f));
        } else {
            f9 = 0.0f;
        }
        boolean z11 = this.t0.size() > 1;
        f8Var.h = z11;
        if (z11) {
            s7Var.setVisibility(0);
            s7Var.setTranslationY(f9);
        } else {
            s7Var.setVisibility(8);
            s7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        f8Var.l();
        this.c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.s0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.s0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(MessagesController.getInstance(this.currentAccount), dialogId);
                if (p10 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(p10.user_id))) != null) {
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
            f2.e0 e0Var = new f2.e0(new t7(this));
            this.D = e0Var;
            e0Var.d(s7Var);
        }
        this.containerView.addView(this.A, i7.f6.e(-1, ((s0() || this.v0) ? 0 : 52) + 179, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.A.getLayoutParams()).height = AndroidUtilities.dp(((s0() || this.v0) ? 0 : 52) + 179);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((s0() || this.v0) ? 0 : 52));
        this.containerView.addView(this.d, i7.f6.c(3.0f, -1));
        this.containerView.addView(this.c);
        n7 n7Var3 = new n7(this, activity, 1);
        this.e0 = n7Var3;
        n7Var3.setAlpha(f9);
        n7Var3.setVisibility(4);
        getContainer().addView(n7Var3);
        t9 t9Var = new t9(activity);
        this.f0 = t9Var;
        t9Var.setAspectFit(true);
        t9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        t9Var.setScaleX(0.9f);
        t9Var.setScaleY(0.9f);
        n7Var3.addView(t9Var, i7.f6.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        J0(false);
        H0();
        linearLayout.setVisibility((this.h && f8Var.h() == 0) ? 0 : 8);
        E0();
    }

    public static /* synthetic */ void A(g8 g8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(g8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(g8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(g8Var.currentAccount).getUserFull(clientUserId);
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
            MessagesStorage.getInstance(g8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(g8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static /* synthetic */ void B(g8 g8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new h7(g8Var, tL_error, 2));
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
            g8Var.v0(new MessageObject(g8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new k7(g8Var, 0));
        }
    }

    public static void C(g8 g8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || g8Var.C0 == null) {
            return;
        }
        g8Var.v0(playingMessageObject, false, new g5(1), false);
        g8Var.y0(false);
        j7.l1.v(R.string.AudioSaveToMyProfileUnsaved, new tc((FrameLayout) g8Var.containerView, c6Var), R.raw.ic_delete, 36);
    }

    public static void D(g8 g8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || g8Var.C0 == null) {
            return;
        }
        g8Var.v0(playingMessageObject, true, new g5(1), false);
        g8Var.y0(true);
        j7.l1.v(R.string.AudioSaveToMyProfileSaved, new tc((FrameLayout) g8Var.containerView, c6Var), R.raw.saved_messages, 36);
    }

    public static void E(g8 g8Var, float[] fArr) {
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
        if (currentTimeMillis - g8Var.L0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && g8Var.containerView != null) {
                org.telegram.ui.zi ziVar = new org.telegram.ui.zi(5, 1, g8Var.getContext(), null, z10);
                g8Var.K0 = ziVar;
                ziVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                g8Var.K0.setText(LocaleController.getString(R.string.SpeedHint));
                g8Var.A.addView(g8Var.K0, i7.f6.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                g8Var.K0.f(g8Var.R, true);
            }
        }
        g8Var.L0 = currentTimeMillis;
    }

    public static void F(g8 g8Var) {
        new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void G(g8 g8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.th.t((FrameLayout) g8Var.containerView, g8Var.resourcesProvider, tL_error, false);
    }

    public static void H(g8 g8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.th.t((FrameLayout) g8Var.containerView, g8Var.resourcesProvider, tL_error, false);
    }

    public static void I(g8 g8Var, View view) {
        r7 r7Var = g8Var.M;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        j70 G = j70.G(g8Var.container, g8Var.resourcesProvider, view, true);
        j70 p02 = g8Var.p0(G, playingMessageObject);
        if (!g8Var.s0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ih.z2(G, p02, 5), !g8Var.v0);
            if (!g8Var.v0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new f7(g8Var, G, 0), !g8Var.v0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new f7(g8Var, G, 1), !g8Var.v0);
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new f7(g8Var, G, 2), playingMessageObject.getId() > 0);
        if (g8Var.N) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.e, G.d, false, false);
            G.d(g1Var);
            g8Var.L = g1Var;
            g1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            g8Var.L.setOnClickListener(new t2(5, g8Var, G));
            AndroidUtilities.removeFromParent(r7Var);
            g8Var.L.addView(r7Var, 0, i7.f6.c(-1.0f, -1));
            g8Var.D0();
        }
        G.m(g8Var.s0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new f7(g8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static /* synthetic */ void J(g8 g8Var, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            c2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(g8Var.currentAccount).getInputPeer(UserConfig.getInstance(g8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.zg(7, g8Var, c2Var));
    }

    public static void K(g8 g8Var, MessageObject messageObject, j70 j70Var) {
        ArrayList<MessageObject> n10;
        int i10;
        long clientUserId = UserConfig.getInstance(g8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = g8Var.currentAccount;
        if (i11 != i12) {
            g8Var.C0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                n10 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i10 = 36;
            j70Var.u();
            j7.l1.v(R.string.AudioSaveToSavedMessagesSaved, new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        n10 = org.telegram.messenger.x3.n(messageObject);
        if (n10 != null) {
            SendMessagesHelper.getInstance(g8Var.currentAccount).sendMessage(n10, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(g8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, g8Var.s0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            i10 = 36;
            tc.a0(R).Q(R.raw.forward, 36, clientUserId == UserConfig.getInstance(g8Var.currentAccount).getClientUserId() ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : clientUserId > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId))).j();
            j70Var.u();
            j7.l1.v(R.string.AudioSaveToSavedMessagesSaved, new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        i10 = 36;
        j70Var.u();
        j7.l1.v(R.string.AudioSaveToSavedMessagesSaved, new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void P(g8 g8Var) {
        View view = g8Var.d;
        cg.m1 m1Var = g8Var.c;
        s7 s7Var = g8Var.n;
        if (s7Var.getChildCount() <= 0) {
            int paddingTop = s7Var.getPaddingTop();
            g8Var.w0 = paddingTop;
            s7Var.setTopGlowOffset(paddingTop);
            g8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = s7Var.getChildAt(0);
        vk0 vk0Var = (vk0) s7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.x ? childAt.getTop() : childAt.getBottom();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        boolean z11 = top <= AndroidUtilities.dp(12.0f);
        if ((z11 && m1Var.getTag() == null) || (!z11 && m1Var.getTag() != null)) {
            m1Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = g8Var.y0;
            if (animatorSet != null) {
                animatorSet.cancel();
                g8Var.y0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            g8Var.y0 = animatorSet2;
            int i10 = 2;
            if (g8Var.q0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m1Var, g8Var.N0, z11 ? 1.0f : 0.0f);
                View view2 = g8Var.b;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(m1Var, (Property<cg.m1, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            g8Var.y0.setDuration(320L);
            g8Var.y0.setInterpolator(jr.h);
            g8Var.y0.addListener(new u7(g8Var, i10));
            g8Var.y0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s7Var.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (g8Var.w0 != C) {
            g8Var.w0 = C;
            s7Var.setTopGlowOffset((C - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            g8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if ((g8Var.backgroundPaddingTop + ((int) (s7Var.getTranslationY() + ((g8Var.w0 - g8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r1) - g8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2)) : 1.0f) <= 0.5f && i0.a.f(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != g8Var.I0) {
            g8Var.I0 = z10;
            AndroidUtilities.setLightStatusBar(g8Var, z10);
        }
    }

    public static /* synthetic */ void m(g8 g8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = g8Var.s0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!g8Var.s0.list.isEmpty()) {
                NotificationCenter.getInstance(g8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, g8Var.s0);
            } else {
                MediaController.getInstance().cleanup();
                g8Var.dismiss();
            }
        }
    }

    public static void n(g8 g8Var) {
        new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static /* synthetic */ void o(g8 g8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = g8Var.s0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            g8Var.t0.clear();
            g8Var.t0.addAll(g8Var.s0.list);
            g8Var.s.l();
            ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static /* synthetic */ void p(g8 g8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = g8Var.C0;
        int i10 = UserConfig.selectedAccount;
        int i11 = g8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(g8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(g8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.tn(bundle), false, false);
        g8Var.dismiss();
    }

    public static void q(g8 g8Var, j70 j70Var) {
        g8Var.y0(true);
        new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        j70Var.u();
    }

    public static /* synthetic */ void r(g8 g8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new h7(g8Var, tL_error, 3));
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
            g8Var.v0(new MessageObject(g8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new k7(g8Var, 1));
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

    public static void s(g8 g8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.th.t((FrameLayout) g8Var.containerView, g8Var.resourcesProvider, tL_error, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(g8 g8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.fy fyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        long j10;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(g8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle i12 = a4.w.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                i12.putLong("user_id", j11);
            } else {
                i12.putLong("chat_id", -j11);
            }
            org.telegram.ui.tn tnVar = new org.telegram.ui.tn(i12);
            if (topicKey.topicId != 0) {
                yf.d.a(tnVar, topicKey);
            }
            if (!g8Var.C0.q0(tnVar, true, false)) {
                fyVar.finishFragment();
                return;
            }
            tnVar.Ab(arrayList3);
            if (topicKey.topicId != 0) {
                fyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(g8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(g8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(g8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i10, 0, 0, g8Var.s0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        fyVar.finishFragment();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            tc.a0(R).Q(R.raw.forward, 36, (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(g8Var.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) ? (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId)) : LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId))).j();
        }
    }

    public static void u(g8 g8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || g8Var.s0 == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.id == 0) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(g8Var.getContext(), 3, null);
            c2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(g8Var.currentAccount).uploadFile(file.getAbsolutePath(), new ih.i(g8Var, c2Var, document, 7));
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
        MessagesController.SavedMusicList savedMusicList = g8Var.s0;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        g8Var.t0.clear();
        g8Var.t0.addAll(g8Var.s0.list);
        g8Var.s.l();
        ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public static void v(g8 g8Var, MessageObject messageObject, j70 j70Var) {
        g8Var.s0.remove(messageObject);
        g8Var.t0.remove(messageObject);
        g8Var.s.l();
        j70Var.u();
        g8Var.y0(false);
        j7.l1.v(R.string.AudioSaveToMyProfileUnsaved, new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(g8 g8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.th.t((FrameLayout) g8Var.containerView, g8Var.resourcesProvider, tL_error, false);
    }

    public static void x(g8 g8Var) {
        FrameLayout frameLayout = (FrameLayout) g8Var.containerView;
        org.telegram.ui.ActionBar.c6 c6Var = g8Var.resourcesProvider;
        new tc(frameLayout, c6Var).o(sc.B, c6Var).j();
    }

    public static /* synthetic */ void y(final g8 g8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new h7(g8Var, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new p2(g8Var, j10, z11, document, runnable));
            return;
        }
        if (z10 || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new h7(g8Var, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id2 = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(id2));
            final int i10 = 0;
            ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(g8Var) { // from class: org.telegram.ui.Components.i7
                public final /* synthetic */ g8 b;

                {
                    this.b = g8Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i10) {
                        case 0:
                            g8.r(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                        default:
                            g8.B(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id3 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(g8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.id.add(Integer.valueOf(id3));
        final int i11 = 1;
        ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(g8Var) { // from class: org.telegram.ui.Components.i7
            public final /* synthetic */ g8 b;

            {
                this.b = g8Var;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i11) {
                    case 0:
                        g8.r(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                    default:
                        g8.B(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public final void A0(boolean z10, boolean z11) {
        t9 t9Var = this.f0;
        n7 n7Var = this.e0;
        if (z10) {
            if (n7Var.getVisibility() == 0 || this.i0) {
                return;
            }
            n7Var.setTag(1);
            w7 w7Var = this.E;
            t9Var.setImageBitmap(w7Var.a[w7Var.b].getImageReceiver().getBitmap());
            this.i0 = true;
            yl0.d(new z6(this, 1));
            n7Var.setVisibility(0);
            n7Var.animate().alpha(1.0f).setDuration(180L).setListener(new u7(this, 0)).start();
            t9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (n7Var.getVisibility() != 0) {
            return;
        }
        n7Var.setTag(null);
        if (z11) {
            this.i0 = true;
            n7Var.animate().alpha(0.0f).setDuration(180L).setListener(new u7(this, 1)).start();
            t9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            n7Var.setAlpha(0.0f);
            n7Var.setVisibility(4);
            t9Var.setImageBitmap(null);
            t9Var.setScaleX(0.9f);
            t9Var.setScaleY(0.9f);
        }
    }

    public final void B0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        j70 G = j70.G(this.container, this.resourcesProvider, xVar, true);
        if (s0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 0), !this.v0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 1), !this.v0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new e7(this, messageObject, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ih.z2(G, p0(G, messageObject), 4), !this.v0);
            if (!this.v0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 3), !this.v0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 4), !this.v0);
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new b7(this, messageObject, 1), messageObject.getId() > 0);
        }
        G.V(LocaleController.isRTL ? 3 : 5);
        G.Z();
    }

    public final void C0() {
        if (this.D0 == 1) {
            this.G0 = System.currentTimeMillis();
            this.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            lh.m7 m7Var = this.J0;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var);
        }
    }

    public final void D0() {
        org.telegram.ui.ActionBar.w0 w0Var = this.R;
        if (w0Var != null) {
            int themedColor = getThemedColor(Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f ? org.telegram.ui.ActionBar.g6.x7 : org.telegram.ui.ActionBar.g6.Qh);
            cf.f fVar = this.S;
            if (fVar != null) {
                ((n6) fVar.b).r(themedColor);
                Paint paint = (Paint) fVar.c;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.g1 g1Var = this.L;
        if (g1Var != null) {
            r7 r7Var = this.M;
            boolean z10 = r7Var != null && r7Var.b();
            final int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.E8);
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.F8);
            int i10 = org.telegram.ui.ActionBar.g6.Oh;
            final int themedColor4 = getThemedColor(i10);
            ValueAnimator valueAnimator = g1Var.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(g1Var.F ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
            g1Var.E = ofFloat;
            g1Var.F = z10;
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
            g1Var.E.addListener(new org.telegram.ui.ActionBar.f1(g1Var, z10, themedColor2, themedColor4, themedColor3));
            g1Var.E.setInterpolator(jr.h);
            g1Var.E.start();
            this.L.setSelectorColor((r7Var == null || !r7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.g6.i6) : org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)));
        }
    }

    public final void E0() {
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - (this.A.getVisibility() == 0 ? AndroidUtilities.dp(150.0f) : -AndroidUtilities.dp(30.0f))) / 2);
    }

    public final void F0(boolean z10) {
        if (this.R == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        this.S.l(playbackSpeed, z10);
        this.T.d(playbackSpeed, z10);
        D0();
        boolean z11 = this.U;
        int i10 = 0;
        this.U = false;
        while (true) {
            org.telegram.ui.ActionBar.g1[] g1VarArr = this.V;
            if (i10 >= g1VarArr.length) {
                return;
            }
            if (z11 || Math.abs(playbackSpeed - Q0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.g1 g1Var = g1VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.g6.E8;
                g1Var.c(getThemedColor(i11), getThemedColor(i11));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var2 = g1VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.g6.Qh;
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
        float f9;
        int i10;
        y7 y7Var = this.P;
        if (y7Var != null) {
            if (y7Var.v) {
                i10 = (int) (messageObject.getDuration() * y7Var.getProgress());
            } else {
                if (this.E0 >= 0.0f) {
                    int i11 = this.D0;
                    z11 = true;
                    if (i11 != -1) {
                        if (i11 == 1) {
                        }
                    }
                    if (z11) {
                        y7Var.e(messageObject.audioProgress, z10);
                    } else {
                        y7Var.e(this.E0, z10);
                    }
                    if (!this.m0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.l0) >= 500) {
                            f9 = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(messageObject.audioProgress, this.x0) : 1.0f;
                            this.l0 = elapsedRealtime;
                        } else {
                            f9 = -1.0f;
                        }
                    }
                    if (f9 != -1.0f) {
                        o1.k kVar = this.k0;
                        kVar.u.i = f9 * 1000.0f;
                        kVar.f();
                    }
                    if (z11) {
                        i10 = messageObject.audioProgressSec;
                    } else {
                        i10 = (int) (messageObject.getDuration() * y7Var.getProgress());
                        messageObject.audioProgressSec = i10;
                    }
                }
                z11 = false;
                if (z11) {
                }
                if (!this.m0) {
                }
                if (f9 != -1.0f) {
                }
                if (z11) {
                }
            }
            if (this.z0 != i10) {
                this.z0 = i10;
                this.Q.l(AndroidUtilities.formatShortDuration(i10), false);
            }
            y7Var.g(messageObject);
        }
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.w0 w0Var = this.X;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                w0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.g6.Xi;
                w0Var.setTag(Integer.valueOf(i11));
                w0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.g6.B1(w0Var.getBackground(), getThemedColor(i11) & 436207615, true);
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
            int i12 = org.telegram.ui.ActionBar.g6.Wi;
            w0Var.setTag(Integer.valueOf(i12));
            w0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.g6.B1(w0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.g6.i6), true);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.g6.Xi;
        w0Var.setTag(Integer.valueOf(i13));
        w0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.g6.B1(w0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 != 0) {
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            w0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            w0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    public final void I0() {
        x0(this.a0, SharedConfig.shuffleMusic);
        x0(this.b0, SharedConfig.playOrderReversed);
        x0(this.Z, SharedConfig.repeatMode == 1);
        x0(this.Y, SharedConfig.repeatMode == 2);
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
        t9 t9Var;
        ImageView imageView;
        int i10;
        Bitmap bitmap;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if ((playingMessageObject == null && z10) || (playingMessageObject != null && !playingMessageObject.isMusic())) {
            dismiss();
            return;
        }
        if (playingMessageObject == null) {
            this.u0 = null;
            return;
        }
        boolean z11 = playingMessageObject == this.u0;
        this.u0 = playingMessageObject;
        long j10 = playingMessageObject.eventId;
        org.telegram.ui.ActionBar.w0 w0Var = this.J;
        if (j10 != 0 || playingMessageObject.getId() <= -2000000000) {
            w0Var.setVisibility(4);
        } else {
            w0Var.setVisibility(0);
        }
        long dialogId = playingMessageObject.getDialogId();
        long j11 = playingMessageObject.getDocument() != null ? playingMessageObject.getDocument().id : 0L;
        boolean z12 = (dialogId < 0 && MessagesController.getInstance(this.currentAccount).isPeerNoForwards(dialogId)) || MessagesController.getInstance(this.currentAccount).isPeerNoForwards(playingMessageObject.getDialogId()) || playingMessageObject.messageOwner.noforwards;
        if (z12 != this.v0) {
            this.v0 = z12;
            n7 n7Var = this.A;
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
        ImageView imageView2 = this.c0;
        y7 y7Var = this.P;
        i80 i80Var = this.O;
        if (exists || z13) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            i80Var.setVisibility(4);
            y7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            i80Var.a(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            i80Var.setVisibility(0);
            y7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        G0(playingMessageObject, !z11);
        w7 w7Var = this.E;
        t9 t9Var2 = z11 ? w7Var.a[w7Var.b] : w7Var.a[w7Var.b == 0 ? (char) 1 : (char) 0];
        ue.a audioInfo = MediaController.getInstance().getAudioInfo();
        if (z11) {
            messageObject = playingMessageObject;
        } else {
            AnimatorSet animatorSet = w7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            w7Var.c = new AnimatorSet();
            int i11 = w7Var.b == 0 ? 1 : 0;
            w7Var.b = i11;
            t9[] t9VarArr = w7Var.a;
            t9 t9Var3 = t9VarArr[i11 ^ 1];
            t9 t9Var4 = t9VarArr[i11];
            boolean hasBitmapImage = t9Var3.getImageReceiver().hasBitmapImage();
            t9Var4.setAlpha(hasBitmapImage ? 1.0f : 0.0f);
            t9Var4.setScaleX(0.8f);
            t9Var4.setScaleY(0.8f);
            t9Var4.setVisibility(0);
            if (hasBitmapImage) {
                t9Var3.bringToFront();
            } else {
                t9Var3.setVisibility(8);
                t9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            messageObject = playingMessageObject;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(jr.g);
            ofFloat.addUpdateListener(new bg.c1(6, t9Var4, hasBitmapImage));
            if (hasBitmapImage) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(t9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(jr.i);
                ofFloat2.addUpdateListener(new bg.b3(9, t9Var3, t9Var4));
                ofFloat2.addListener(new org.telegram.ui.bm(t9Var3, 7));
                w7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                w7Var.c.play(ofFloat);
            }
            w7Var.c.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.o) == null) {
            this.x0 = FileLoader.getAttachFileName(messageObject.getDocument());
            this.m0 = false;
            messageObject2 = messageObject;
            String artworkUrl = messageObject2.getArtworkUrl(false);
            ImageLocation r02 = r0(messageObject2);
            if (TextUtils.isEmpty(artworkUrl)) {
                t9Var = t9Var2;
                imageView = imageView2;
                i10 = 8;
                if (r02 != null) {
                    t9Var.k(null, null, r02, null, 0L, null, messageObject2, 1);
                } else {
                    t9Var.setImageDrawable(null);
                }
            } else {
                ImageLocation forPath = ImageLocation.getForPath(artworkUrl);
                t9Var = t9Var2;
                imageView = imageView2;
                i10 = 8;
                t9Var.k(forPath, null, r02, null, 0L, null, messageObject2, 1);
            }
            t9Var.invalidate();
        } else {
            t9Var2.setImageBitmap(bitmap);
            this.x0 = null;
            this.m0 = true;
            imageView = imageView2;
            messageObject2 = messageObject;
            i10 = 8;
        }
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        cg0 cg0Var = this.d0;
        if (isMessagePaused) {
            cg0Var.a(false, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            cg0Var.a(true, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = messageObject2.getMusicTitle();
        String musicAuthor = messageObject2.getMusicAuthor();
        this.F.setText(musicTitle);
        this.I.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.B.setLoading(savedMusicIds.loading);
        y0(savedMusicIds.ids.contains(Long.valueOf(j11)));
        int duration = (int) messageObject2.getDuration();
        this.A0 = duration;
        TextView textView = this.W;
        if (textView != null) {
            textView.setText(duration != 0 ? AndroidUtilities.formatShortDuration(duration) : "-:--");
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.R;
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
                    } else if (this.D0 == 1 && this.E0 != -1.0f) {
                        lh.m7 m7Var = this.J0;
                        AndroidUtilities.cancelRunOnUIThread(m7Var);
                        this.H0 = 0L;
                        m7Var.run();
                        this.E0 = -1.0f;
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
            org.telegram.ui.nr nrVar = this.K;
            if (nrVar != null) {
                nrVar.a(d1.f.u());
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
        f8 f8Var = this.s;
        if (i10 == i16) {
            this.s0 = MediaController.getInstance().currentSavedMusicList;
            this.t0 = MediaController.getInstance().getPlaylist();
            f8Var.l();
            return;
        }
        if (i10 == NotificationCenter.moreMusicDidLoad) {
            this.s0 = MediaController.getInstance().currentSavedMusicList;
            this.t0 = MediaController.getInstance().getPlaylist();
            f8Var.l();
            if (SharedConfig.playOrderReversed) {
                s7Var.B0();
                int intValue = ((Integer) objArr[0]).intValue();
                f2.j0 j0Var = this.r;
                j0Var.L0();
                int N0 = j0Var.N0();
                if (N0 != -1) {
                    View m10 = j0Var.m(N0);
                    j0Var.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.x0)) {
                J0(false);
                this.m0 = true;
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
        if (!((String) objArr[0]).equals(this.x0) || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
            return;
        }
        if (!this.m0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.l0) >= 500) {
                r12 = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.x0) : 1.0f;
                this.l0 = elapsedRealtime;
            } else {
                r12 = -1.0f;
            }
        }
        if (r12 != -1.0f) {
            o1.k kVar = this.k0;
            kVar.u.i = r12 * 1000.0f;
            kVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
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
        if (P0 == this) {
            P0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        n7 n7Var = this.A;
        if (n7Var == null) {
            return 0;
        }
        if (this.t0.size() <= 1) {
            return n7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.n.getTranslationY() + ((this.w0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.B0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 0);
        int i10 = org.telegram.ui.ActionBar.g6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 64, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, TLObject.FLAG_27, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.je));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.vc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.g6.h5));
        int i12 = org.telegram.ui.ActionBar.g6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.w7;
        org.telegram.ui.ActionBar.w0 w0Var = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.g6.x7));
        int i15 = org.telegram.ui.ActionBar.g6.Wi;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.X;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Xi));
        int i16 = org.telegram.ui.ActionBar.g6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i16));
        int i17 = org.telegram.ui.ActionBar.g6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i17));
        int i18 = org.telegram.ui.ActionBar.g6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i18));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 0, null, null, null, x6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 0, null, null, null, x6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 0, null, null, null, x6Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 0, null, null, null, x6Var, i18));
        p7 p7Var = this.G;
        arrayList.add(new org.telegram.ui.ActionBar.i6(p7Var, (Class[]) null, new xi0[]{p7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(p7Var, (Class[]) null, new xi0[]{p7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(p7Var, (Class[]) null, new xi0[]{p7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 131080, null, null, null, null, i16));
        ImageView imageView = this.c0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 131080, null, null, null, null, i16));
        q7 q7Var = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.i6(q7Var, (Class[]) null, new xi0[]{q7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(q7Var, (Class[]) null, new xi0[]{q7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(q7Var, (Class[]) null, new xi0[]{q7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.W5));
        int i19 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, null, null, null, null, i11));
        x7 x7Var = this.F;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x7Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x7Var.getNextTextView(), 4, null, null, null, null, i10));
        x7 x7Var2 = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x7Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x7Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f9, float f10) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f10 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f10 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f9 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f9 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.containerView.getTop();
        Drawable drawable = this.shadowDrawable;
        return f10 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f9 < ((float) this.containerView.getLeft()) || f9 > ((float) this.containerView.getRight());
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        cg.m1 m1Var = this.c;
        if (m1Var != null && m1Var.j0) {
            m1Var.h(true);
        } else if (this.e0.getTag() != null) {
            A0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        n7 n7Var = this.e0;
        if (view != n7Var) {
            return false;
        }
        n7Var.layout(0, 0, n7Var.getMeasuredWidth(), n7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        n7 n7Var = this.e0;
        if (view != n7Var) {
            return false;
        }
        n7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.O.a(Math.min(1.0f, j10 / j11), true);
    }

    public final j70 p0(j70 j70Var, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j10 = document != null ? document.id : 0L;
        j70 J = j70Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.it0(j70Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new e7(this, messageObject, j70Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new e7(this, messageObject, j70Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new e7(this, messageObject, j70Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void q0(MessageObject messageObject) {
        ArrayList n10;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.C0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
        e10.putBoolean("canSelectTopics", true);
        org.telegram.ui.fy fyVar = new org.telegram.ui.fy(e10);
        if (messageObject.getId() >= 0) {
            n10 = org.telegram.messenger.x3.n(messageObject);
            tL_document = null;
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            n10 = null;
        }
        fyVar.y2 = new a1.d(this, n10, tL_document, messageObject, 7);
        launchActivity.p0(fyVar);
        dismiss();
    }

    public final boolean s0() {
        MessagesController.SavedMusicList savedMusicList = this.s0;
        return savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        P0 = this;
    }

    public final void t0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || (launchActivity = this.C0) == null) {
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
                ze.b.H().V(MediaController.getInstance().getCurrentChromecastMedia());
                this.M.performClick();
                return;
            } else {
                if (i10 == 7) {
                    v0(playingMessageObject, false, new b7(this, playingMessageObject, 0), false);
                    return;
                }
                if (i10 == 8) {
                    nh.g7 g7Var = new nh.g7(getContext(), true, null, new d7(this, 0), null);
                    g7Var.d0 = true;
                    g7Var.V = false;
                    g7Var.m0.N(true);
                    g7Var.show();
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
        launchActivity.q0(new org.telegram.ui.tn(bundle), false, false);
        dismiss();
    }

    public final void u0(MessageObject messageObject) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
            LaunchActivity launchActivity = this.C0;
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
        if (str2 != null && str2.length() > 0 && !com.google.android.recaptcha.internal.a.v(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(str2, this.C0, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new d7(this, 1));
    }

    public final void v0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new g7(this, z11, messageObject, z10, runnable, j10, document));
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
            int indexOf = this.t0.indexOf(playingMessageObject);
            if (this.r0) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z11 = SharedConfig.playOrderReversed;
                f2.j0 j0Var = this.r;
                if (z11) {
                    j0Var.n0(indexOf);
                    return true;
                }
                j0Var.n0(this.t0.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void x0(org.telegram.ui.ActionBar.g1 g1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.g6.Xi;
            g1Var.setTextColor(getThemedColor(i10));
            g1Var.setIconColor(getThemedColor(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.g6.E8;
            g1Var.setTextColor(getThemedColor(i11));
            g1Var.setIconColor(getThemedColor(i11));
        }
    }

    public final void y0(final boolean z10) {
        boolean s02 = s0();
        nh.d dVar = this.C;
        nh.d dVar2 = this.B;
        if (s02 || this.v0) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        jr jrVar = jr.h;
        final int i10 = 0;
        duration.setInterpolator(jrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.c7
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.B.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.C.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i11 = 1;
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(jrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.c7
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.B.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.C.setVisibility(z10 ? 0 : 8);
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.C0);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.PleaseDownload);
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
            this.C0.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
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

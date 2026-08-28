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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static c8 P0;
    public static final float[] Q0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final i7 A;
    public int A0;
    public final kh.d B;
    public final int B0;
    public final kh.d C;
    public final LaunchActivity C0;
    public final f2.h0 D;
    public int D0;
    public final s7 E;
    public float E0;
    public final t7 F;
    public int F0;
    public final k7 G;
    public long G0;
    public final l7 H;
    public long H0;
    public final t7 I;
    public boolean I0;
    public final org.telegram.ui.ActionBar.w0 J;
    public final m.i3 J0;
    public final org.telegram.ui.nr K;
    public org.telegram.ui.wi K0;
    public org.telegram.ui.ActionBar.g1 L;
    public long L0;
    public final m7 M;
    public float M0;
    public final boolean N;
    public final org.telegram.ui.Cells.c2 N0;
    public final v70 O;
    public ValueAnimator O0;
    public final u7 P;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final org.telegram.ui.ActionBar.w0 R;
    public final vc S;
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
    public final r7 c;
    public final ImageView c0;
    public final View d;
    public final qf0 d0;
    public final View e;
    public final i7 e0;
    public boolean f;
    public final o9 f0;
    public final org.telegram.ui.ActionBar.w0 g0;
    public boolean h;
    public final org.telegram.ui.ActionBar.w0 h0;
    public boolean i0;
    public final View[] j0;
    public final o1.j k0;
    public long l0;
    public boolean m0;
    public final n7 n;
    public boolean n0;
    public int o0;
    public int p0;
    public final boolean q0;
    public final f2.m0 r;
    public final boolean r0;
    public final b8 s;
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
    public c8(Activity activity, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, b6Var, true, false);
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.User user;
        int i9 = 1;
        final int i10 = 0;
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[6];
        this.V = g1VarArr;
        View[] viewArr = new View[5];
        this.j0 = viewArr;
        this.n0 = true;
        this.o0 = -1;
        this.w0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.E0 = -1.0f;
        this.J0 = new m.i3(this, 11);
        this.N0 = new org.telegram.ui.Cells.c2(this);
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
        q7 q7Var = new q7(this, activity);
        this.containerView = q7Var;
        q7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        r7 r7Var = new r7(this, activity, b6Var, i10);
        this.c = r7Var;
        r7Var.setBackgroundColor(0);
        r7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.f6.Oi;
        r7Var.C(getThemedColor(i12), false);
        r7Var.A(getThemedColor(org.telegram.ui.ActionBar.f6.Ni), false);
        r7Var.setTitleColor(getThemedColor(i12));
        r7Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.f6.Pi));
        r7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z n10 = r7Var.n();
        n10.setLayoutParams(g7.e6.e(-1, -1, 119));
        View view = new View(activity);
        this.b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
        r7Var.addView(view, 0, g7.e6.e(-1, -1, 119));
        view.setAlpha(0.0f);
        r7Var.setAlpha(0.0f);
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, i9));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.V5));
        i7 i7Var = new i7(this, activity, 2);
        this.A = i7Var;
        s7 s7Var = new s7(this, activity);
        this.E = s7Var;
        i7Var.addView(s7Var, g7.e6.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var = new t7(this, activity, activity, i10);
        this.F = t7Var;
        i7Var.addView(t7Var, g7.e6.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var2 = new t7(this, activity, activity, i9);
        this.I = t7Var2;
        i7Var.addView(t7Var2, g7.e6.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        u7 u7Var = new u7(this, activity, b6Var);
        this.P = u7Var;
        u7Var.setLineWidth(4);
        u7Var.setDelegate(new h7(this));
        u7Var.setReportChanges(true);
        i7Var.addView(u7Var, g7.e6.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.j jVar = new o1.j(new gb.a(0.0f));
        o1.k kVar = new o1.k();
        kVar.b(750.0f);
        kVar.a(1.0f);
        jVar.u = kVar;
        jVar.b(new e7(this, i10));
        this.k0 = jVar;
        v70 v70Var = new v70(activity);
        this.O = v70Var;
        v70Var.setVisibility(4);
        v70Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ti));
        v70Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.f6.Vi));
        i7Var.addView(v70Var, g7.e6.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.Q = h5Var;
        h5Var.setTextSize(12);
        h5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.f6.Si;
        h5Var.setTextColor(getThemedColor(i13));
        h5Var.setImportantForAccessibility(2);
        i7Var.addView(h5Var, g7.e6.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.W = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i13));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        i7Var.addView(textView, g7.e6.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        int i14 = 2;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, getThemedColor(i13), false, b6Var);
        this.R = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new t6(this, i10));
        vc vcVar = new vc();
        this.S = vcVar;
        w0Var.setIcon(vcVar);
        int i15 = 3;
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), b6Var);
        this.T = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new u6(this, i10));
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
        i7Var.addView(w0Var, g7.e6.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new s2(i15, this, fArr));
        w0Var.setOnLongClickListener(new ih.g2(i14, this, b6Var));
        E0(false);
        i7 i7Var2 = new i7(this, activity, i10);
        i7Var.addView(i7Var2, g7.e6.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, b6Var);
        this.X = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i16 = org.telegram.ui.ActionBar.f6.i6;
        w0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(18.0f)));
        i7Var2.addView(w0Var2, g7.e6.e(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v6
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        c8 c8Var = this.b;
                        c8Var.H0();
                        c8Var.X.M(null, null);
                        break;
                    default:
                        c8.I(this.b, view4);
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
        w0Var2.setDelegate(new t6(this, i9));
        int i17 = org.telegram.ui.ActionBar.f6.Wi;
        int themedColor = getThemedColor(i17);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        k7 k7Var = new k7(this, activity, scaledTouchSlop);
        this.G = k7Var;
        viewArr[1] = k7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k7Var.setScaleType(scaleType);
        k7Var.f(R.raw.player_prev, 20, 20, null);
        k7Var.h(themedColor, "Triangle 3");
        k7Var.h(themedColor, "Triangle 4");
        k7Var.h(themedColor, "Rectangle 4");
        k7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(22.0f)));
        i7Var2.addView(k7Var, g7.e6.e(48, 48, 51));
        k7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.c0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        qf0 qf0Var = new qf0(28);
        this.d0 = qf0Var;
        imageView.setImageDrawable(qf0Var);
        qf0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(24.0f)));
        i7Var2.addView(imageView, g7.e6.e(48, 48, 51));
        imageView.setOnClickListener(new fh.n(11));
        l7 l7Var = new l7(this, activity, scaledTouchSlop);
        this.H = l7Var;
        viewArr[3] = l7Var;
        l7Var.setScaleType(scaleType);
        l7Var.f(R.raw.player_prev, 20, 20, null);
        l7Var.h(themedColor, "Triangle 3");
        l7Var.h(themedColor, "Triangle 4");
        l7Var.h(themedColor, "Rectangle 4");
        l7Var.setRotation(180.0f);
        l7Var.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(22.0f)));
        i7Var2.addView(l7Var, g7.e6.e(48, 48, 51));
        l7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor, false, b6Var);
        this.J = w0Var3;
        viewArr[4] = w0Var3;
        org.telegram.ui.nr nrVar = new org.telegram.ui.nr(activity, R.drawable.ic_ab_other, b6Var);
        this.K = nrVar;
        w0Var3.setIcon(nrVar);
        w0Var3.setLongClickEnabled(false);
        w0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i18 = 1;
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(18.0f)));
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v6
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i18) {
                    case 0:
                        c8 c8Var = this.b;
                        c8Var.H0();
                        c8Var.X.M(null, null);
                        break;
                    default:
                        c8.I(this.b, view4);
                        break;
                }
            }
        });
        i7Var2.addView(w0Var3, g7.e6.e(48, 48, 51));
        m7 m7Var = new m7(this, activity, 0);
        this.M = m7Var;
        this.N = true;
        try {
            m7Var.setRouteSelector(n5.a.c(activity).a());
        } catch (Exception e10) {
            FileLog.e(e10);
            this.N = false;
        }
        this.M.setVisibility(4);
        org.telegram.ui.nr nrVar2 = this.K;
        if (nrVar2 != null) {
            nrVar2.a(d1.f.t());
        }
        this.J.setShowedFromBottom(true);
        this.J.setDelegate(new t6(this, 2));
        this.J.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, g7.e6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new jh.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, g7.e6.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.x = textView2;
        int i19 = org.telegram.ui.ActionBar.f6.X5;
        textView2.setTextColor(getThemedColor(i19));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.y = textView3;
        textView3.setTextColor(getThemedColor(i19));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, g7.e6.t(-2, -2, 17, 0, 6, 0, 0));
        n7 n7Var = new n7(this, activity);
        this.n = n7Var;
        n7Var.setClipToPadding(false);
        getContext();
        f2.m0 m0Var = new f2.m0(1, false);
        this.r = m0Var;
        n7Var.setLayoutManager(m0Var);
        n7Var.setHorizontalScrollBarEnabled(false);
        n7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(n7Var, g7.e6.e(-1, -1, 51));
        b8 b8Var = new b8(this, activity);
        this.s = b8Var;
        n7Var.setAdapter(b8Var);
        n7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.A5));
        n7Var.setOnItemClickListener(new fh.a(2));
        n7Var.setOnItemLongClickListener(new t6(this, 3));
        n7Var.setOnScrollListener(new bg.o2(this, 21));
        kh.d dVar = new kh.d(activity, b6Var, true);
        dVar.setRoundRadius(24);
        this.B = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i20 = 0;
        spannableStringBuilder.setSpan(new eq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g7
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        c8.D(this.b, b6Var);
                        break;
                    default:
                        c8.C(this.b, b6Var);
                        break;
                }
            }
        });
        this.A.addView(dVar, g7.e6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i21 = 1;
        kh.d dVar2 = new kh.d(activity, b6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.C = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g7
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i21) {
                    case 0:
                        c8.D(this.b, b6Var);
                        break;
                    default:
                        c8.C(this.b, b6Var);
                        break;
                }
            }
        });
        this.A.addView(dVar2, g7.e6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.s0 = savedMusicList;
        boolean z10 = savedMusicList != null;
        this.q0 = z10;
        this.c.i0 = z10;
        this.r0 = r0();
        this.t0 = MediaController.getInstance().getPlaylist();
        if (r0()) {
            zVar = n10;
            this.g0 = zVar.a(8, R.drawable.msg_add);
        } else {
            zVar = n10;
        }
        org.telegram.ui.ActionBar.w0 a2 = zVar.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.cb(this, 3);
        this.h0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i22 = org.telegram.ui.ActionBar.f6.Oi;
        searchField.setTextColor(getThemedColor(i22));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Si));
        searchField.setCursorColor(getThemedColor(i22));
        if (z10) {
            n7Var.p1();
            setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, b6Var));
            this.c.setAlpha(1.0f);
            this.b.setAlpha(0.0f);
            this.N0.set(this.c, Float.valueOf(0.0f));
        }
        boolean z11 = this.t0.size() > 1;
        b8Var.h = z11;
        if (z11) {
            n7Var.setVisibility(0);
            n7Var.setTranslationY(0.0f);
        } else {
            n7Var.setVisibility(8);
            n7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        b8Var.l();
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
                TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(MessagesController.getInstance(this.currentAccount), dialogId);
                if (l10 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(l10.user_id))) != null) {
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
        if (r0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            f2.h0 h0Var = new f2.h0(new o7(this));
            this.D = h0Var;
            h0Var.d(n7Var);
        }
        this.containerView.addView(this.A, g7.e6.e(-1, ((r0() || this.v0) ? 0 : 52) + 179, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.A.getLayoutParams()).height = AndroidUtilities.dp(((r0() || this.v0) ? 0 : 52) + 179);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((r0() || this.v0) ? 0 : 52));
        this.containerView.addView(this.d, g7.e6.c(3.0f, -1));
        this.containerView.addView(this.c);
        i7 i7Var3 = new i7(this, activity, 1);
        this.e0 = i7Var3;
        i7Var3.setAlpha(0.0f);
        i7Var3.setVisibility(4);
        getContainer().addView(i7Var3);
        o9 o9Var = new o9(activity);
        this.f0 = o9Var;
        o9Var.setAspectFit(true);
        o9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        o9Var.setScaleX(0.9f);
        o9Var.setScaleY(0.9f);
        i7Var3.addView(o9Var, g7.e6.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        I0(false);
        G0();
        linearLayout.setVisibility((this.h && b8Var.h() == 0) ? 0 : 8);
        D0();
    }

    public static /* synthetic */ void A(c8 c8Var, int i9, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new c7(c8Var, tL_error, 2));
                return;
            }
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i10 = 0;
        while (true) {
            if (i10 >= messages_messages.messages.size()) {
                message = null;
                break;
            } else {
                if (messages_messages.messages.get(i10).id == i9) {
                    message = messages_messages.messages.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (message != null) {
            c8Var.u0(new MessageObject(c8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new f7(c8Var, 0));
        }
    }

    public static void C(c8 c8Var, org.telegram.ui.ActionBar.b6 b6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || c8Var.C0 == null) {
            return;
        }
        c8Var.u0(playingMessageObject, false, new bg.d2(29), false);
        c8Var.x0(false);
        org.telegram.messenger.l0.p(R.string.AudioSaveToMyProfileUnsaved, new oc((FrameLayout) c8Var.containerView, b6Var), R.raw.ic_delete, 36);
    }

    public static void D(c8 c8Var, org.telegram.ui.ActionBar.b6 b6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || c8Var.C0 == null) {
            return;
        }
        c8Var.u0(playingMessageObject, true, new bg.d2(29), false);
        c8Var.x0(true);
        org.telegram.messenger.l0.p(R.string.AudioSaveToMyProfileSaved, new oc((FrameLayout) c8Var.containerView, b6Var), R.raw.saved_messages, 36);
    }

    public static void E(c8 c8Var, float[] fArr) {
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= fArr.length) {
                i9 = -1;
                break;
            } else if (playbackSpeed - 0.1f <= fArr[i9]) {
                break;
            } else {
                i9++;
            }
        }
        int i10 = i9 + 1;
        if (i10 >= fArr.length) {
            i10 = 0;
        }
        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c8Var.L0 > 300) {
            int i11 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i11 > 2) {
                i11 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i11).apply();
            if (i11 >= 0 && c8Var.containerView != null) {
                org.telegram.ui.wi wiVar = new org.telegram.ui.wi(5, 1, c8Var.getContext(), null, z10);
                c8Var.K0 = wiVar;
                wiVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                c8Var.K0.setText(LocaleController.getString(R.string.SpeedHint));
                c8Var.A.addView(c8Var.K0, g7.e6.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                c8Var.K0.f(c8Var.R, true);
            }
        }
        c8Var.L0 = currentTimeMillis;
    }

    public static void F(c8 c8Var) {
        new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void G(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.j2.s((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void H(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.j2.s((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void I(c8 c8Var, View view) {
        m7 m7Var = c8Var.M;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        x60 G = x60.G(c8Var.container, c8Var.resourcesProvider, view, true);
        x60 o02 = c8Var.o0(G, playingMessageObject);
        if (!c8Var.r0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new fh.k3(G, o02, 6), !c8Var.v0);
            if (!c8Var.v0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new a7(c8Var, G, 0), !c8Var.v0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new a7(c8Var, G, 1), !c8Var.v0);
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new a7(c8Var, G, 2), playingMessageObject.getId() > 0);
        if (c8Var.N) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.e, G.d, false, false);
            G.d(g1Var);
            c8Var.L = g1Var;
            g1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            c8Var.L.setOnClickListener(new s2(4, c8Var, G));
            AndroidUtilities.removeFromParent(m7Var);
            c8Var.L.addView(m7Var, 0, g7.e6.c(-1.0f, -1));
            c8Var.C0();
        }
        G.m(c8Var.r0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new a7(c8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static /* synthetic */ void J(c8 c8Var, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            c2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(c8Var.currentAccount).getInputPeer(UserConfig.getInstance(c8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.rc(11, c8Var, c2Var));
    }

    public static void K(c8 c8Var, MessageObject messageObject, x60 x60Var) {
        ArrayList<MessageObject> k10;
        int i9;
        long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
        int i10 = UserConfig.selectedAccount;
        int i11 = c8Var.currentAccount;
        if (i10 != i11) {
            c8Var.C0.K0(i11);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                k10 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i9 = 36;
            x60Var.u();
            org.telegram.messenger.l0.p(R.string.AudioSaveToSavedMessagesSaved, new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i9);
        }
        k10 = org.telegram.messenger.l0.k(messageObject);
        if (k10 != null) {
            SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(k10, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(c8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, c8Var.s0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            i9 = 36;
            oc.a0(R).Q(R.raw.forward, 36, clientUserId == UserConfig.getInstance(c8Var.currentAccount).getClientUserId() ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : clientUserId > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId))).j();
            x60Var.u();
            org.telegram.messenger.l0.p(R.string.AudioSaveToSavedMessagesSaved, new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i9);
        }
        i9 = 36;
        x60Var.u();
        org.telegram.messenger.l0.p(R.string.AudioSaveToSavedMessagesSaved, new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i9);
    }

    public static void O(c8 c8Var) {
        View view = c8Var.d;
        r7 r7Var = c8Var.c;
        n7 n7Var = c8Var.n;
        if (n7Var.getChildCount() <= 0) {
            int paddingTop = n7Var.getPaddingTop();
            c8Var.w0 = paddingTop;
            n7Var.setTopGlowOffset(paddingTop);
            c8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = n7Var.getChildAt(0);
        ik0 ik0Var = (ik0) n7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.x ? childAt.getTop() : childAt.getBottom();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        boolean z11 = top <= AndroidUtilities.dp(12.0f);
        if ((z11 && r7Var.getTag() == null) || (!z11 && r7Var.getTag() != null)) {
            r7Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = c8Var.y0;
            if (animatorSet != null) {
                animatorSet.cancel();
                c8Var.y0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            c8Var.y0 = animatorSet2;
            int i9 = 2;
            if (c8Var.q0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, c8Var.N0, z11 ? 1.0f : 0.0f);
                View view2 = c8Var.b;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            c8Var.y0.setDuration(320L);
            c8Var.y0.setInterpolator(gr.h);
            c8Var.y0.addListener(new p7(c8Var, i9));
            c8Var.y0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n7Var.getLayoutParams();
        int D = org.telegram.messenger.ll.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (c8Var.w0 != D) {
            c8Var.w0 = D;
            n7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            c8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if ((c8Var.backgroundPaddingTop + ((int) (n7Var.getTranslationY() + ((c8Var.w0 - c8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - c8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2)) : 1.0f) <= 0.5f && i0.a.f(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != c8Var.I0) {
            c8Var.I0 = z10;
            AndroidUtilities.setLightStatusBar(c8Var, z10);
        }
    }

    public static /* synthetic */ void m(c8 c8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = c8Var.s0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!c8Var.s0.list.isEmpty()) {
                NotificationCenter.getInstance(c8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, c8Var.s0);
            } else {
                MediaController.getInstance().cleanup();
                c8Var.dismiss();
            }
        }
    }

    public static void n(c8 c8Var) {
        new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static /* synthetic */ void o(c8 c8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = c8Var.s0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            c8Var.t0.clear();
            c8Var.t0.addAll(c8Var.s0.list);
            c8Var.s.l();
            ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static /* synthetic */ void p(c8 c8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = c8Var.C0;
        int i9 = UserConfig.selectedAccount;
        int i10 = c8Var.currentAccount;
        if (i9 != i10) {
            launchActivity.K0(i10);
        }
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(c8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(c8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.qn(bundle), false, false);
        c8Var.dismiss();
    }

    public static void q(c8 c8Var, x60 x60Var) {
        c8Var.x0(true);
        new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        x60Var.u();
    }

    public static ImageLocation q0(MessageObject messageObject) {
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

    public static /* synthetic */ void r(c8 c8Var, int i9, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new c7(c8Var, tL_error, 3));
                return;
            }
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i10 = 0;
        while (true) {
            if (i10 >= messages_messages.messages.size()) {
                message = null;
                break;
            } else {
                if (messages_messages.messages.get(i10).id == i9) {
                    message = messages_messages.messages.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (message != null) {
            c8Var.u0(new MessageObject(c8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new f7(c8Var, 1));
        }
    }

    public static void s(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.j2.s((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(c8 c8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.dy dyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i9) {
        long j10;
        int i10;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(c8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle i11 = aa.d.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i11.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                i11.putLong("user_id", j11);
            } else {
                i11.putLong("chat_id", -j11);
            }
            org.telegram.ui.qn qnVar = new org.telegram.ui.qn(i11);
            if (topicKey.topicId != 0) {
                vf.c.a(qnVar, topicKey);
            }
            if (!c8Var.C0.q0(qnVar, true, false)) {
                dyVar.finishFragment();
                return;
            }
            qnVar.Ab(arrayList3);
            if (topicKey.topicId != 0) {
                dyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i12)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i10 = i12;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i10 = i12;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i9, 0, 0, c8Var.s0, null, false, false));
            }
            i12 = i10 + 1;
            arrayList3 = arrayList;
        }
        dyVar.finishFragment();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            oc.a0(R).Q(R.raw.forward, 36, (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(c8Var.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.FwdMessageToSavedMessages) : (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) ? (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId)) : LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId))).j();
        }
    }

    public static void u(c8 c8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || c8Var.s0 == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.id == 0) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(c8Var.getContext(), 3, null);
            c2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(c8Var.currentAccount).uploadFile(file.getAbsolutePath(), new fh.i(c8Var, c2Var, document, 7));
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
        MessagesController.SavedMusicList savedMusicList = c8Var.s0;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        c8Var.t0.clear();
        c8Var.t0.addAll(c8Var.s0.list);
        c8Var.s.l();
        ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public static void v(c8 c8Var, MessageObject messageObject, x60 x60Var) {
        c8Var.s0.remove(messageObject);
        c8Var.t0.remove(messageObject);
        c8Var.s.l();
        x60Var.u();
        c8Var.x0(false);
        org.telegram.messenger.l0.p(R.string.AudioSaveToMyProfileUnsaved, new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.j2.s((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void x(c8 c8Var) {
        FrameLayout frameLayout = (FrameLayout) c8Var.containerView;
        org.telegram.ui.ActionBar.b6 b6Var = c8Var.resourcesProvider;
        new oc(frameLayout, b6Var).o(nc.B, b6Var).j();
    }

    public static /* synthetic */ void y(final c8 c8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new c7(c8Var, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new m2(c8Var, j10, z11, document, runnable));
            return;
        }
        if (z10 || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new c7(c8Var, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id2 = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(id2));
            final int i9 = 0;
            ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(c8Var) { // from class: org.telegram.ui.Components.d7
                public final /* synthetic */ c8 b;

                {
                    this.b = c8Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i9) {
                        case 0:
                            c8.r(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                        default:
                            c8.A(this.b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id3 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(c8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.id.add(Integer.valueOf(id3));
        final int i10 = 1;
        ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(c8Var) { // from class: org.telegram.ui.Components.d7
            public final /* synthetic */ c8 b;

            {
                this.b = c8Var;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i10) {
                    case 0:
                        c8.r(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                    default:
                        c8.A(this.b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public static /* synthetic */ void z(c8 c8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(c8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(c8Var.currentAccount).getUserFull(clientUserId);
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
            MessagesStorage.getInstance(c8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(c8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public final void A0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        x60 G = x60.G(this.container, this.resourcesProvider, xVar, true);
        if (r0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new z6(this, G, messageObject, 0), !this.v0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new z6(this, G, messageObject, 1), !this.v0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new z6(this, messageObject, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new fh.k3(G, o0(G, messageObject), 5), !this.v0);
            if (!this.v0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new z6(this, G, messageObject, 3), !this.v0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new z6(this, G, messageObject, 4), !this.v0);
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new w6(this, messageObject, 1), messageObject.getId() > 0);
        }
        G.V(LocaleController.isRTL ? 3 : 5);
        G.Z();
    }

    public final void B0() {
        if (this.D0 == 1) {
            this.G0 = System.currentTimeMillis();
            this.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            m.i3 i3Var = this.J0;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var);
        }
    }

    public final void C0() {
        org.telegram.ui.ActionBar.w0 w0Var = this.R;
        if (w0Var != null) {
            int themedColor = getThemedColor(Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f ? org.telegram.ui.ActionBar.f6.x7 : org.telegram.ui.ActionBar.f6.Qh);
            vc vcVar = this.S;
            if (vcVar != null) {
                ((i6) vcVar.c).r(themedColor);
                Paint paint = (Paint) vcVar.b;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.g1 g1Var = this.L;
        if (g1Var != null) {
            m7 m7Var = this.M;
            boolean z10 = m7Var != null && m7Var.b();
            final int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.E8);
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.f6.F8);
            int i9 = org.telegram.ui.ActionBar.f6.Oh;
            final int themedColor4 = getThemedColor(i9);
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
                    int i10 = themedColor2;
                    int i11 = themedColor4;
                    g1Var2.setTextColor(i0.a.d(floatValue, i10, i11));
                    g1Var2.setIconColor(i0.a.d(floatValue, themedColor3, i11));
                }
            });
            g1Var.E.addListener(new org.telegram.ui.ActionBar.f1(g1Var, z10, themedColor2, themedColor4, themedColor3));
            g1Var.E.setInterpolator(gr.h);
            g1Var.E.start();
            this.L.setSelectorColor((m7Var == null || !m7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.f6.i6) : org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i9)));
        }
    }

    public final void D0() {
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - (this.A.getVisibility() == 0 ? AndroidUtilities.dp(150.0f) : -AndroidUtilities.dp(30.0f))) / 2);
    }

    public final void E0(boolean z10) {
        if (this.R == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        this.S.l(playbackSpeed, z10);
        this.T.d(playbackSpeed, z10);
        C0();
        boolean z11 = this.U;
        int i9 = 0;
        this.U = false;
        while (true) {
            org.telegram.ui.ActionBar.g1[] g1VarArr = this.V;
            if (i9 >= g1VarArr.length) {
                return;
            }
            if (z11 || Math.abs(playbackSpeed - Q0[i9]) >= 0.05f) {
                org.telegram.ui.ActionBar.g1 g1Var = g1VarArr[i9];
                int i10 = org.telegram.ui.ActionBar.f6.E8;
                g1Var.c(getThemedColor(i10), getThemedColor(i10));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var2 = g1VarArr[i9];
                int i11 = org.telegram.ui.ActionBar.f6.Qh;
                g1Var2.c(getThemedColor(i11), getThemedColor(i11));
            }
            i9++;
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
    public final void F0(MessageObject messageObject, boolean z10) {
        boolean z11;
        float f10;
        int i9;
        u7 u7Var = this.P;
        if (u7Var != null) {
            if (u7Var.v) {
                i9 = (int) (messageObject.getDuration() * u7Var.getProgress());
            } else {
                if (this.E0 >= 0.0f) {
                    int i10 = this.D0;
                    z11 = true;
                    if (i10 != -1) {
                        if (i10 == 1) {
                        }
                    }
                    if (z11) {
                        u7Var.e(messageObject.audioProgress, z10);
                    } else {
                        u7Var.e(this.E0, z10);
                    }
                    if (!this.m0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.l0) >= 500) {
                            f10 = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(messageObject.audioProgress, this.x0) : 1.0f;
                            this.l0 = elapsedRealtime;
                        } else {
                            f10 = -1.0f;
                        }
                    }
                    if (f10 != -1.0f) {
                        o1.j jVar = this.k0;
                        jVar.u.i = f10 * 1000.0f;
                        jVar.f();
                    }
                    if (z11) {
                        i9 = messageObject.audioProgressSec;
                    } else {
                        i9 = (int) (messageObject.getDuration() * u7Var.getProgress());
                        messageObject.audioProgressSec = i9;
                    }
                }
                z11 = false;
                if (z11) {
                }
                if (!this.m0) {
                }
                if (f10 != -1.0f) {
                }
                if (z11) {
                }
            }
            if (this.z0 != i9) {
                this.z0 = i9;
                this.Q.l(AndroidUtilities.formatShortDuration(i9), false);
            }
            u7Var.g(messageObject);
        }
    }

    public final void G0() {
        int i9 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.w0 w0Var = this.X;
        if (i9 != 0 && i9 != 1) {
            if (i9 == 2) {
                w0Var.setIcon(R.drawable.player_new_repeatone);
                int i10 = org.telegram.ui.ActionBar.f6.Xi;
                w0Var.setTag(Integer.valueOf(i10));
                w0Var.setIconColor(getThemedColor(i10));
                org.telegram.ui.ActionBar.f6.B1(w0Var.getBackground(), getThemedColor(i10) & 436207615, true);
                w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i9 == 0) {
                w0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                w0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!SharedConfig.playOrderReversed) {
            w0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i9 == 0) {
            w0Var.setIcon(R.drawable.player_new_order);
        } else {
            w0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i9 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i11 = org.telegram.ui.ActionBar.f6.Wi;
            w0Var.setTag(Integer.valueOf(i11));
            w0Var.setIconColor(getThemedColor(i11));
            org.telegram.ui.ActionBar.f6.B1(w0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.f6.i6), true);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.f6.Xi;
        w0Var.setTag(Integer.valueOf(i12));
        w0Var.setIconColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.f6.B1(w0Var.getBackground(), 436207615 & getThemedColor(i12), true);
        if (i9 != 0) {
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            w0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            w0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    public final void H0() {
        w0(this.a0, SharedConfig.shuffleMusic);
        w0(this.b0, SharedConfig.playOrderReversed);
        w0(this.Z, SharedConfig.repeatMode == 1);
        w0(this.Y, SharedConfig.repeatMode == 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:
    
        if (r2.exists() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(boolean z10) {
        File file;
        MessageObject messageObject;
        MessageObject messageObject2;
        o9 o9Var;
        ImageView imageView;
        int i9;
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
            i7 i7Var = this.A;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i7Var.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z12 || r0()) ? 0 : 52) + 179);
            i7Var.setLayoutParams(layoutParams);
            View view = this.e;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(179 + ((r0() || z12) ? 0 : 52));
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
        u7 u7Var = this.P;
        v70 v70Var = this.O;
        if (exists || z13) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            v70Var.setVisibility(4);
            u7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            v70Var.a(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            v70Var.setVisibility(0);
            u7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        F0(playingMessageObject, !z11);
        s7 s7Var = this.E;
        o9 o9Var2 = z11 ? s7Var.a[s7Var.b] : s7Var.a[s7Var.b == 0 ? (char) 1 : (char) 0];
        re.a audioInfo = MediaController.getInstance().getAudioInfo();
        if (z11) {
            messageObject = playingMessageObject;
        } else {
            AnimatorSet animatorSet = s7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            s7Var.c = new AnimatorSet();
            int i10 = s7Var.b == 0 ? 1 : 0;
            s7Var.b = i10;
            o9[] o9VarArr = s7Var.a;
            o9 o9Var3 = o9VarArr[i10 ^ 1];
            o9 o9Var4 = o9VarArr[i10];
            boolean hasBitmapImage = o9Var3.getImageReceiver().hasBitmapImage();
            o9Var4.setAlpha(hasBitmapImage ? 1.0f : 0.0f);
            o9Var4.setScaleX(0.8f);
            o9Var4.setScaleY(0.8f);
            o9Var4.setVisibility(0);
            if (hasBitmapImage) {
                o9Var3.bringToFront();
            } else {
                o9Var3.setVisibility(8);
                o9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            messageObject = playingMessageObject;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(gr.g);
            ofFloat.addUpdateListener(new hg.y(5, o9Var4, hasBitmapImage));
            if (hasBitmapImage) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(o9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(gr.i);
                ofFloat2.addUpdateListener(new f2.g(7, o9Var3, o9Var4));
                ofFloat2.addListener(new org.telegram.ui.xp(o9Var3, 5));
                s7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                s7Var.c.play(ofFloat);
            }
            s7Var.c.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.o) == null) {
            this.x0 = FileLoader.getAttachFileName(messageObject.getDocument());
            this.m0 = false;
            messageObject2 = messageObject;
            String artworkUrl = messageObject2.getArtworkUrl(false);
            ImageLocation q02 = q0(messageObject2);
            if (TextUtils.isEmpty(artworkUrl)) {
                o9Var = o9Var2;
                imageView = imageView2;
                i9 = 8;
                if (q02 != null) {
                    o9Var.k(null, null, q02, null, 0L, null, messageObject2, 1);
                } else {
                    o9Var.setImageDrawable(null);
                }
            } else {
                ImageLocation forPath = ImageLocation.getForPath(artworkUrl);
                o9Var = o9Var2;
                imageView = imageView2;
                i9 = 8;
                o9Var.k(forPath, null, q02, null, 0L, null, messageObject2, 1);
            }
            o9Var.invalidate();
        } else {
            o9Var2.setImageBitmap(bitmap);
            this.x0 = null;
            this.m0 = true;
            imageView = imageView2;
            messageObject2 = messageObject;
            i9 = 8;
        }
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        qf0 qf0Var = this.d0;
        if (isMessagePaused) {
            qf0Var.a(false, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            qf0Var.a(true, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = messageObject2.getMusicTitle();
        String musicAuthor = messageObject2.getMusicAuthor();
        this.F.setText(musicTitle);
        this.I.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.B.setLoading(savedMusicIds.loading);
        x0(savedMusicIds.ids.contains(Long.valueOf(j11)));
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
            w0Var2.setVisibility(i9);
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
        int i11 = playingMessageObjectNum + 1;
        int i12 = playingMessageObjectNum - 1;
        if (i11 >= playlist.size()) {
            i11 = 0;
        }
        if (i11 <= -1) {
            i11 = playlist.size() - 1;
        }
        if (i12 <= -1) {
            i12 = playlist.size() - 1;
        }
        if (i12 >= playlist.size()) {
            i12 = 0;
        }
        arrayList.add(playlist.get(i11));
        if (i11 != i12) {
            arrayList.add(playlist.get(i12));
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
            ImageLocation q03 = q0(messageObject3);
            if (q03 != null) {
                if (q03.path != null) {
                    ImageLoader.getInstance().preloadArtwork(q03.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(q03, messageObject3, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Cells.x xVar;
        MessageObject messageObject;
        org.telegram.ui.Cells.x xVar2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i11 = NotificationCenter.messagePlayingDidStart;
        n7 n7Var = this.n;
        if (i9 == i11 || i9 == NotificationCenter.messagePlayingPlayStateChanged || i9 == NotificationCenter.messagePlayingDidReset) {
            int i12 = NotificationCenter.messagePlayingDidReset;
            I0(i9 == i12 && ((Boolean) objArr[1]).booleanValue());
            if (i9 == i12 || i9 == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = n7Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = n7Var.getChildAt(i13);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        xVar.b(false, true);
                    }
                }
                if (i9 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        B0();
                    } else if (this.D0 == 1 && this.E0 != -1.0f) {
                        m.i3 i3Var = this.J0;
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                        this.H0 = 0L;
                        i3Var.run();
                        this.E0 = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = n7Var.getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = n7Var.getChildAt(i14);
                    if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.nr nrVar = this.K;
            if (nrVar != null) {
                nrVar.a(d1.f.t());
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || !playingMessageObject2.isMusic()) {
                return;
            }
            F0(playingMessageObject2, false);
            return;
        }
        if (i9 == NotificationCenter.messagePlayingSpeedChanged) {
            E0(true);
            return;
        }
        int i15 = NotificationCenter.musicDidLoad;
        b8 b8Var = this.s;
        if (i9 == i15) {
            this.s0 = MediaController.getInstance().currentSavedMusicList;
            this.t0 = MediaController.getInstance().getPlaylist();
            b8Var.l();
            return;
        }
        if (i9 == NotificationCenter.moreMusicDidLoad) {
            this.s0 = MediaController.getInstance().currentSavedMusicList;
            this.t0 = MediaController.getInstance().getPlaylist();
            b8Var.l();
            if (SharedConfig.playOrderReversed) {
                n7Var.B0();
                int intValue = ((Integer) objArr[0]).intValue();
                f2.m0 m0Var = this.r;
                m0Var.L0();
                int N0 = m0Var.N0();
                if (N0 != -1) {
                    View m10 = m0Var.m(N0);
                    m0Var.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.x0)) {
                I0(false);
                this.m0 = true;
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.fileLoadProgressChanged) {
            if (i9 == NotificationCenter.musicIdsLoaded) {
                I0(false);
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
            o1.j jVar = this.k0;
            jVar.u.i = r12 * 1000.0f;
            jVar.f();
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
        i7 i7Var = this.A;
        if (i7Var == null) {
            return 0;
        }
        if (this.t0.size() <= 1) {
            return i7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.n.getTranslationY() + ((this.w0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
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
        s6 s6Var = new s6(this, 0);
        int i9 = org.telegram.ui.ActionBar.f6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 64, null, null, null, s6Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 128, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 1024, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, TLObject.FLAG_27, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 67108864, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.je));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.vc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.id));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.f6.h5));
        int i11 = org.telegram.ui.ActionBar.f6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 2048, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.w7;
        org.telegram.ui.ActionBar.w0 w0Var = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 262152, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.f6.x7));
        int i14 = org.telegram.ui.ActionBar.f6.Wi;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.X;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Xi));
        int i15 = org.telegram.ui.ActionBar.f6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i15));
        int i16 = org.telegram.ui.ActionBar.f6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i16));
        int i17 = org.telegram.ui.ActionBar.f6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i17));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 0, null, null, null, s6Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 0, null, null, null, s6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 0, null, null, null, s6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 0, null, null, null, s6Var, i17));
        k7 k7Var = this.G;
        arrayList.add(new org.telegram.ui.ActionBar.h6(k7Var, (Class[]) null, new mi0[]{k7Var.getAnimatedDrawable()}, "Triangle 3", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(k7Var, (Class[]) null, new mi0[]{k7Var.getAnimatedDrawable()}, "Triangle 4", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(k7Var, (Class[]) null, new mi0[]{k7Var.getAnimatedDrawable()}, "Rectangle 4", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 131080, null, null, null, null, i15));
        ImageView imageView = this.c0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 8, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 131080, null, null, null, null, i15));
        l7 l7Var = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.h6(l7Var, (Class[]) null, new mi0[]{l7Var.getAnimatedDrawable()}, "Triangle 3", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(l7Var, (Class[]) null, new mi0[]{l7Var.getAnimatedDrawable()}, "Triangle 4", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(l7Var, (Class[]) null, new mi0[]{l7Var.getAnimatedDrawable()}, "Rectangle 4", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 131080, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.W5));
        int i18 = org.telegram.ui.ActionBar.f6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, 8, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.y, 8, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 4096, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.W, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 4, null, null, null, null, i10));
        t7 t7Var = this.F;
        arrayList.add(new org.telegram.ui.ActionBar.h6(t7Var.getTextView(), 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(t7Var.getNextTextView(), 4, null, null, null, null, i9));
        t7 t7Var2 = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.h6(t7Var2.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(t7Var2.getNextTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f10, float f11) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f11 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f11 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f10 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.containerView.getTop();
        Drawable drawable = this.shadowDrawable;
        return f11 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f10 < ((float) this.containerView.getLeft()) || f10 > ((float) this.containerView.getRight());
    }

    public final x60 o0(x60 x60Var, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j10 = document != null ? document.id : 0L;
        x60 J = x60Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.kt0(x60Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new z6(this, messageObject, x60Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new z6(this, messageObject, x60Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new z6(this, messageObject, x60Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        r7 r7Var = this.c;
        if (r7Var != null && r7Var.j0) {
            r7Var.h(true);
        } else if (this.e0.getTag() != null) {
            z0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i9, int i10, int i11, int i12) {
        i7 i7Var = this.e0;
        if (view != i7Var) {
            return false;
        }
        i7Var.layout(0, 0, i7Var.getMeasuredWidth(), i7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i9, int i10) {
        i7 i7Var = this.e0;
        if (view != i7Var) {
            return false;
        }
        i7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.O.a(Math.min(1.0f, j10 / j11), true);
    }

    public final void p0(MessageObject messageObject) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i9 = UserConfig.selectedAccount;
        int i10 = this.currentAccount;
        LaunchActivity launchActivity = this.C0;
        if (i9 != i10) {
            launchActivity.K0(i10);
        }
        Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
        e10.putBoolean("canSelectTopics", true);
        org.telegram.ui.dy dyVar = new org.telegram.ui.dy(e10);
        if (messageObject.getId() >= 0) {
            k10 = org.telegram.messenger.l0.k(messageObject);
            tL_document = null;
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            k10 = null;
        }
        dyVar.y2 = new a1.d(this, k10, tL_document, messageObject, 8);
        launchActivity.p0(dyVar);
        dismiss();
    }

    public final boolean r0() {
        MessagesController.SavedMusicList savedMusicList = this.s0;
        return savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public final void s0(int i9) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || (launchActivity = this.C0) == null) {
            return;
        }
        if (i9 == 1) {
            p0(playingMessageObject);
            return;
        }
        if (i9 == 2) {
            y0(playingMessageObject);
            return;
        }
        if (i9 != 4) {
            if (i9 == 5) {
                t0(playingMessageObject);
                return;
            }
            if (i9 == 6) {
                we.b.C().M(MediaController.getInstance().getCurrentChromecastMedia());
                this.M.performClick();
                return;
            } else {
                if (i9 == 7) {
                    u0(playingMessageObject, false, new w6(this, playingMessageObject, 0), false);
                    return;
                }
                if (i9 == 8) {
                    kh.s7 s7Var = new kh.s7(getContext(), true, null, new y6(this, 0), null);
                    s7Var.d0 = true;
                    s7Var.V = false;
                    s7Var.m0.N(true);
                    s7Var.show();
                    return;
                }
                return;
            }
        }
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        if (i10 != i11) {
            launchActivity.K0(i11);
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
        launchActivity.q0(new org.telegram.ui.qn(bundle), false, false);
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        P0 = this;
    }

    public final void t0(MessageObject messageObject) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23 && (i9 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
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
        if (str2 != null && str2.length() > 0 && !e2.c.w(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(str2, this.C0, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new y6(this, 1));
    }

    public final void u0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new b7(this, z11, messageObject, z10, runnable, j10, document));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v0(boolean z10) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            if (z10) {
                n7 n7Var = this.n;
                int childCount = n7Var.getChildCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= childCount) {
                        break;
                    }
                    View childAt = n7Var.getChildAt(i9);
                    if (!(childAt instanceof org.telegram.ui.Cells.x) || ((org.telegram.ui.Cells.x) childAt).getMessageObject() != playingMessageObject) {
                        i9++;
                    }
                }
            }
            int indexOf = this.t0.indexOf(playingMessageObject);
            if (this.r0) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z11 = SharedConfig.playOrderReversed;
                f2.m0 m0Var = this.r;
                if (z11) {
                    m0Var.n0(indexOf);
                    return true;
                }
                m0Var.n0(this.t0.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void w0(org.telegram.ui.ActionBar.g1 g1Var, boolean z10) {
        if (z10) {
            int i9 = org.telegram.ui.ActionBar.f6.Xi;
            g1Var.setTextColor(getThemedColor(i9));
            g1Var.setIconColor(getThemedColor(i9));
        } else {
            int i10 = org.telegram.ui.ActionBar.f6.E8;
            g1Var.setTextColor(getThemedColor(i10));
            g1Var.setIconColor(getThemedColor(i10));
        }
    }

    public final void x0(final boolean z10) {
        boolean r02 = r0();
        kh.d dVar = this.C;
        kh.d dVar2 = this.B;
        if (r02 || this.v0) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        gr grVar = gr.h;
        final int i9 = 0;
        duration.setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.x6
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.b.B.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.C.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i10 = 1;
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.x6
            public final /* synthetic */ c8 b;

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
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r0.exists() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(MessageObject messageObject) {
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

    public final void z0(boolean z10, boolean z11) {
        o9 o9Var = this.f0;
        i7 i7Var = this.e0;
        if (z10) {
            if (i7Var.getVisibility() == 0 || this.i0) {
                return;
            }
            i7Var.setTag(1);
            s7 s7Var = this.E;
            o9Var.setImageBitmap(s7Var.a[s7Var.b].getImageReceiver().getBitmap());
            this.i0 = true;
            ll0.d(new u6(this, 1));
            i7Var.setVisibility(0);
            i7Var.animate().alpha(1.0f).setDuration(180L).setListener(new p7(this, 0)).start();
            o9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (i7Var.getVisibility() != 0) {
            return;
        }
        i7Var.setTag(null);
        if (z11) {
            this.i0 = true;
            i7Var.animate().alpha(0.0f).setDuration(180L).setListener(new p7(this, 1)).start();
            o9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            i7Var.setAlpha(0.0f);
            i7Var.setVisibility(4);
            o9Var.setImageBitmap(null);
            o9Var.setScaleX(0.9f);
            o9Var.setScaleY(0.9f);
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
